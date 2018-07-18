package org.jooby.guides;

import org.jooby.Jooby;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
    get("/", () -> "Hello du World!");
  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
