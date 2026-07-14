/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends tb implements mi {
    static sd field_S;
    static String field_Q;
    static int field_P;
    private int field_R;
    private vc field_V;
    static gd[] field_W;
    static boolean field_U;
    static af field_T;

    ic(String param0, sk param1, int param2) {
        super(param0, param1, param2);
    }

    final String d(int param0) {
        int var2 = 0;
        if (((ic) this).field_l) {
          if (null == ((ic) this).field_s) {
            return null;
          } else {
            pb.a(((ic) this).field_i + -((ic) this).field_R + ha.field_b, (byte) 74, ei.field_K);
            var2 = -109 % ((10 - param0) / 58);
            return ((ic) this).field_s;
          }
        } else {
          return null;
        }
    }

    public final vc a(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            String discarded$0 = ic.a((String) null, -61, (String) null, 'ￌ');
            return ((ic) this).field_V;
        }
        return ((ic) this).field_V;
    }

    final void d(byte param0) {
        int var2 = 0;
        var2 = 101 / ((-50 - param0) / 49);
        super.d((byte) -124);
        if (((ic) this).field_V != null) {
          ((ic) this).field_V.a(-7674);
          return;
        } else {
          return;
        }
    }

    public static void l(int param0) {
        field_S = null;
        field_T = null;
        field_Q = null;
        if (param0 != 16604) {
            return;
        }
        field_W = null;
    }

    final static String a(String param0, byte param1, String param2, dj param3) {
        int var4 = 121 / ((param1 - -44) / 61);
        if (!(param3.a((byte) 73))) {
            return param2;
        }
        return param0 + " - " + param3.e(-105) + "%";
    }

    final static String a(String param0, int param1, String param2, char param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = ZombieDawn.field_J;
        var4 = param2.length();
        var5 = param0.length();
        var6 = var4;
        var7 = var5 + -1;
        if (-1 != (var7 ^ -1)) {
          var8_int = 0;
          L0: while (true) {
            var8_int = param2.indexOf((int) param3, var8_int);
            if (var8_int >= 0) {
              var6 = var6 + var7;
              var8_int++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              var8 = var13;
              var9 = param1;
              L1: while (true) {
                var10 = param2.indexOf((int) param3, var9);
                if (0 > var10) {
                  StringBuilder discarded$6 = var13.append(param2.substring(var9));
                  return var13.toString();
                } else {
                  StringBuilder discarded$7 = var13.append(param2.substring(var9, var10));
                  var9 = var10 + 1;
                  StringBuilder discarded$8 = var13.append(param0);
                  continue L1;
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          var9 = param1;
          L2: while (true) {
            var10 = param2.indexOf((int) param3, var9);
            if (0 > var10) {
              StringBuilder discarded$9 = var12.append(param2.substring(var9));
              return var12.toString();
            } else {
              StringBuilder discarded$10 = var12.append(param2.substring(var9, var10));
              var9 = var10 + 1;
              StringBuilder discarded$11 = var12.append(param0);
              continue L2;
            }
          }
        }
    }

    final void a(int param0, vc param1) {
        ((ic) this).field_V = param1;
        int var3 = -18 / ((param0 - -34) / 34);
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        param1 = ic.a("", param2 ^ param2, param1, '_');
        var3 = am.a(param0, 1);
        if (-1 == param1.indexOf(param0)) {
          if (param1.indexOf(var3) != -1) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    final void a(ga param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 121, param2, param3);
        int var5 = -112 % ((46 - param1) / 42);
        ((ic) this).field_R = -param3 + ha.field_b + -((ic) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Suggested names: ";
        field_P = 48;
        field_S = new sd();
        field_U = false;
    }
}
