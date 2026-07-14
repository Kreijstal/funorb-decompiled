/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ir {
    static ba field_a;
    static tj field_c;
    static int field_d;
    static int[] field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        if (param0) {
            field_e = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(int param0, r param1, r param2, r param3) {
        int var4 = 0;
        if (param2.b(0)) {
          if (param2.c("commonui", 0)) {
            if (param1.b(0)) {
              if (param1.c("commonui", 0)) {
                var4 = -20 % ((param0 - 12) / 63);
                if (param3.b(0)) {
                  if (!param3.c("button.gif", 0)) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, byte param1) {
        Object var3 = null;
        L0: {
          rm.field_B = (param0 & 63) >> 1960863524;
          oa.field_p = param0 >> 2089011394 & 3;
          if ((rm.field_B ^ -1) < -3) {
            rm.field_B = 2;
            break L0;
          } else {
            break L0;
          }
        }
        mf.field_b = param0 & 3;
        if (2 >= oa.field_p) {
          if (param1 == -65) {
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          } else {
            var3 = null;
            boolean discarded$8 = ir.a(50, (r) null, (r) null, (r) null);
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          oa.field_p = 2;
          if (param1 != -65) {
            var3 = null;
            boolean discarded$9 = ir.a(50, (r) null, (r) null, (r) null);
            if ((mf.field_b ^ -1) >= -3) {
              return;
            } else {
              mf.field_b = 2;
              return;
            }
          } else {
            if ((mf.field_b ^ -1) < -3) {
              mf.field_b = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != -8957) {
          field_c = null;
          System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
          return;
        } else {
          System.out.println("Error: " + mr.a("%0a", (byte) -48, "\n", param1));
          return;
        }
    }

    final static void a(String param0, int param1, String param2, int param3, int param4) {
        dj.field_d.field_Fb = dj.field_d.field_Fb + ui.field_b.field_Fb;
        dj.field_d.field_S = param2;
        dj.field_d.field_J = param0;
        dj.field_d.field_A = param1;
        ui.field_b.field_wb = ui.field_b.field_wb + ui.field_b.field_Fb;
        ui.field_b.field_Fb = param3;
        dj.field_d.field_Fb = dj.field_d.field_Fb - ui.field_b.field_Fb;
        if (param4 != 0) {
          ir.a(true);
          ui.field_b.field_wb = ui.field_b.field_wb - ui.field_b.field_Fb;
          return;
        } else {
          ui.field_b.field_wb = ui.field_b.field_wb - ui.field_b.field_Fb;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ba();
        field_c = new tj();
        field_e = new int[]{7};
        field_f = 16777215;
        field_d = 0;
        field_b = "This option cannot be combined with the current '<%0>' setting.";
    }
}
