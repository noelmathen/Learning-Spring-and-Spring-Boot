# Repository Guidelines

## Project Structure & Module Organization
Backend sources live in `src/main/java/com/example/ecommerce_sample`, with `controller`, `service`, `repo`, and `models` packages mapping the MVC layers.
Views and static files belong to `src/main/resources/templates` and `src/main/resources/static`, while configuration and seed data are in `application.properties` and `data1.sql`.
Tests mirror the production packages under `src/test/java/com/example/ecommerce_sample`.
The React client resides in `ecom-frontend-5`; feature components stay in `src/components`, shared context in `src/Context`, and entry points in `App.jsx` and `main.jsx`.

## Build, Test, and Development Commands
- Backend: `./mvnw.cmd clean verify` compiles and runs the JUnit suite; `./mvnw.cmd spring-boot:run` starts the API on `http://localhost:8080`; use `./mvnw.cmd test` for quick cycles or append `-Dspring.profiles.active=dev` once profiles are introduced.
- Frontend: from `ecom-frontend-5`, run `npm install` once, then `npm run dev` for hot reload, `npm run build` for production output in `dist`, and `npm run lint` to apply the shared ESLint rules.

## Coding Style & Naming Conventions
Use 4-space indentation and K&R braces in Java.
Keep controllers, services, repositories, and models suffixed with `Controller`, `Service`, `Repo`, and domain nouns; methods should be descriptive (`searchProducts`) and prefer `Optional` when null is possible.
In React, store components in PascalCase `.jsx` files, helpers in camelCase, and reuse the Axios instance defined in `src/axios.jsx`.
Commit CSS tweaks to `App.css` or `index.css` unless you introduce scoped modules.

## Testing Guidelines
JUnit 5 with Spring Boot backs the suite; `EcommerceSampleApplicationTests` shows the default `@SpringBootTest`.
Add unit or slice tests beside the code they cover, suffix classes with `Tests`, and choose `@DataJpaTest` or `@WebMvcTest` for focused coverage.
Run `./mvnw.cmd test` before pushing and record any manual verification of React changes until UI tests are added.

## Commit & Pull Request Guidelines
History favors brief, sentence-style subjects (`Simple E commerce website done`).
Keep messages under 72 characters and mention the component touched (`ProductService`, `Cart.jsx`).
Pull requests should explain the change, link issues, list the backend or frontend commands you ran, and attach screenshots or sample responses when UI or API behavior shifts.
Confirm that generated directories such as `target` and `node_modules` stay out of version control.

## Security & Configuration Tips
Store only local-safe defaults in `application.properties`, move secrets to environment variables, and validate image uploads before persisting BLOBs.
Disable the H2 console and switch to a managed database when deploying beyond local machines.
