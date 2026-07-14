/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fd extends ug {
    static tg field_m;
    static tg[] field_n;
    static String field_o;

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0) {
            String discarded$0 = fd.c((byte) 32);
        }
    }

    final static void a(gk param0, int param1) {
        te var2 = null;
        Object var3 = null;
        if (param1 != -1) {
          var3 = null;
          fd.a((gk) null, 94);
          te.b(param0.b("headers.packvorbis", "", param1 + -72));
          var2 = te.a(param0, "jagex logo2.packvorbis", "");
          ue discarded$4 = var2.a();
          return;
        } else {
          te.b(param0.b("headers.packvorbis", "", param1 + -72));
          var2 = te.a(param0, "jagex logo2.packvorbis", "");
          ue discarded$5 = var2.a();
          return;
        }
    }

    fd() {
    }

    final static String c(byte param0) {
        String var1 = null;
        var1 = "";
        if (param0 != 61) {
          L0: {
            field_o = null;
            if (null == vk.field_c) {
              break L0;
            } else {
              var1 = vk.field_c.a(0);
              break L0;
            }
          }
          L1: {
            if (-1 != var1.length()) {
              break L1;
            } else {
              var1 = bj.j(44);
              break L1;
            }
          }
          L2: {
            if (-1 != var1.length()) {
              break L2;
            } else {
              var1 = wk.field_H;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            if (null == vk.field_c) {
              break L3;
            } else {
              var1 = vk.field_c.a(0);
              break L3;
            }
          }
          L4: {
            if (-1 != var1.length()) {
              break L4;
            } else {
              var1 = bj.j(44);
              break L4;
            }
          }
          L5: {
            if (-1 != var1.length()) {
              break L5;
            } else {
              var1 = wk.field_H;
              break L5;
            }
          }
          return var1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Type your password again to make sure it's correct";
    }
}
