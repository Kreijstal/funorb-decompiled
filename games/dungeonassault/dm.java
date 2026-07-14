/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static cn[] field_d;
    static cn[] field_a;
    static cn field_g;
    static cn field_f;
    static String field_c;
    static String[] field_e;
    static String field_b;

    final static boolean c(int param0) {
        int var1 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var1 = -28 % ((param0 - -5) / 62);
        if ((kh.field_n ^ -1) <= -11) {
          if (tl.field_l) {
            return false;
          } else {
            L0: {
              if (dh.a((byte) -125)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0) {
        String var1 = "";
        if (null != wo.field_e) {
            var1 = wo.field_e.a(-16);
        }
        if (!(0 != var1.length())) {
            var1 = dc.a(-118);
        }
        int var2 = 28 % ((-38 - param0) / 38);
        if (!(0 != var1.length())) {
            var1 = fb.field_a;
        }
        return var1;
    }

    final static void a(md param0, int[] param1, int param2, int param3, int param4, int param5) {
        a var6 = null;
        a var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        if (bo.field_Jb.a(param5, (byte) 97)) {
          if (param2 <= param1[param4]) {
            param1[param4] = param2;
            var6 = new a(param4);
            var7 = (a) (Object) param0.e(-24172);
            var8 = -120 / ((74 - param3) / 46);
            L0: while (true) {
              if (var7 == null) {
                if (var7 == null) {
                  param0.a((ne) (Object) var6, false);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1[var7.field_j] > param2) {
                  L1: {
                    so.a((byte) 60, (ne) (Object) var7, (ne) (Object) var6);
                    if (var7 != null) {
                      break L1;
                    } else {
                      param0.a((ne) (Object) var6, false);
                      break L1;
                    }
                  }
                  return;
                } else {
                  var7 = (a) (Object) param0.a(4);
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        field_g = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
          field_c = null;
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_c = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[]{"First Strike", "Always attacks first."};
        field_c = "Blinded";
        field_b = "The floor of this room is covered in blood, and the sound of machinery creaking echoes ominously overhead.";
    }
}
