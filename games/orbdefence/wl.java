/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl {
    static int field_a;
    static String field_b;

    public static void b(int param0) {
        field_b = null;
        if (param0 != -25829) {
            boolean discarded$0 = wl.a(8);
        }
    }

    final static u a(String param0, byte param1, String param2, ki param3, ki param4) {
        int var5 = param3.a(param2, 0);
        int var6 = param3.a(param0, 5187, var5);
        if (param1 >= -86) {
            field_b = null;
        }
        return de.a(param3, var5, true, var6, param4);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        fa.field_b = true;
        if (param1 < 42) {
            boolean discarded$0 = wl.a(11);
        }
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        ke.a(849743536, var2, param0, var3, var4);
    }

    final static boolean a(int param0) {
        ud var1 = null;
        int var2 = 0;
        int var3 = 0;
        ud var4 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        var4 = (ud) (Object) ab.field_h.b((byte) -35);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              field_a = 106;
              break L0;
            }
          }
          var2 = 0;
          L1: while (true) {
            if (var2 >= var1.field_o) {
              return true;
            } else {
              L2: {
                if (var4.field_h[var2] == null) {
                  break L2;
                } else {
                  if (var4.field_h[var2].field_a == 0) {
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4.field_i[var2] != null) {
                if (var4.field_i[var2].field_a == 0) {
                  return false;
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This level is locked until you achieve the <col=cc88ff><%0></col> Achievement";
    }
}
