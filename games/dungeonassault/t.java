/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t {
    static ec field_d;
    static int field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0, wh param1, boolean param2, boolean param3) {
        if (!(param1 != null)) {
            vh var5 = (vh) null;
            lo.a(86, param2, (vh) null, param0, 0);
            return;
        }
        if (!param3) {
            return;
        }
        try {
            lo.a(86, param2, param1.field_b, param0, param1.field_f);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "t.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 0) {
          t.a(true, 23);
          na.a(param0, param1 + 2591221, false);
          return;
        } else {
          na.a(param0, param1 + 2591221, false);
          return;
        }
    }

    public static void a(int param0) {
        wh var2 = null;
        field_d = null;
        if (param0 != -11353) {
          var2 = (wh) null;
          t.a(56, (wh) null, false, true);
          field_c = null;
          field_b = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          return;
        }
    }

    static {
        field_b = "Dragons and Raids";
        field_c = "Heal this <%0>, restoring their abilities to normal, at a cost of <%1> Treasure.";
    }
}
