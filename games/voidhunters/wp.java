/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static int field_a;
    static int field_b;

    final static String a(Class param0, boolean param1) {
        if (!param1) {
          if (param0.isArray()) {
            return wp.a(param0.getComponentType(), param1) + "[]";
          } else {
            return param0.getName().substring(param0.getName().lastIndexOf(".") + 1);
          }
        } else {
          field_a = 17;
          if (param0.isArray()) {
            return wp.a(param0.getComponentType(), param1) + "[]";
          } else {
            return param0.getName().substring(param0.getName().lastIndexOf(".") + 1);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = field_b;
    }
}
