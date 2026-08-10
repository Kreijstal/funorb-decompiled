/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au {
    static boolean field_b;
    static int field_c;
    static String field_a;

    final static ne a(int param0, int param1, int param2, int param3) {
        ne var4;
        int var5;
        var5 = BachelorFridge.field_y;
        var4 = (ne) ((Object) rg.field_f.b((byte) 90));
        L0: while (true) {
          if (var4 == null) {
            var4 = new ne();
            var4.field_o = param2;
            var4.field_i = param3;
            rg.field_f.a(var4, true);
            kja.a(param0, (byte) 21, var4);
            if (param1 != 16757) {
              field_b = true;
              return var4;
            } else {
              return var4;
            }
          } else {
            if ((param2 ^ -1) != (var4.field_o ^ -1)) {
              var4 = (ne) ((Object) rg.field_f.c(0));
              continue L0;
            } else {
              return var4;
            }
          }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -31824) {
            field_c = -118;
        }
    }

    final static void a(int param0, String param1, boolean param2) {
        try {
            ha.field_k = bt.field_s;
            taa.field_l = param0;
            if (param2) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "au.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = "Welcome. Click the tooltips to continue.";
    }
}
