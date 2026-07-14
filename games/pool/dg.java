/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends gr {
    int field_N;
    static int[] field_K;
    np field_R;
    byte[] field_Q;
    static String field_M;
    static byte[] field_S;
    static tf field_L;
    static vh field_J;
    static int[] field_T;
    static String field_P;

    public static void c(byte param0) {
        Object var2 = null;
        field_T = null;
        field_M = null;
        field_L = null;
        field_K = null;
        field_S = null;
        if (param0 != -80) {
          var2 = null;
          String discarded$2 = dg.a(83, (String) null, (String) null, (String) null);
          field_J = null;
          field_P = null;
          return;
        } else {
          field_J = null;
          field_P = null;
          return;
        }
    }

    final byte[] b(boolean param0) {
        if (!((dg) this).field_F) {
          if (param0) {
            int discarded$2 = dg.a((byte) -47, -118, 74);
            return ((dg) this).field_Q;
          } else {
            return ((dg) this).field_Q;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static int[] a(int param0, int param1) {
        int[] stackIn_8_0 = null;
        int[] stackOut_7_0 = null;
        int[] stackOut_6_0 = null;
        int[] stackOut_5_0 = null;
        int[] stackOut_3_0 = null;
        if (param0 != -9) {
          return null;
        } else {
          L0: {
            if (param1 == 0) {
              stackOut_7_0 = ae.field_e;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              if (-9 != (param1 ^ -1)) {
                if (8 > param1) {
                  stackOut_6_0 = cr.field_p;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = om.field_r;
                  stackIn_8_0 = stackOut_5_0;
                  break L0;
                }
              } else {
                stackOut_3_0 = sa.field_q;
                stackIn_8_0 = stackOut_3_0;
                break L0;
              }
            }
          }
          return stackIn_8_0;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        var3 = param2 >>> 58595551;
        if (param0 != 44) {
          field_M = null;
          return -var3 + (param2 - -var3) / param1;
        } else {
          return -var3 + (param2 - -var3) / param1;
        }
    }

    dg() {
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = param2.indexOf(param3);
        while (-1 != var4) {
            param2 = param2.substring(0, var4) + param1 + param2.substring(param3.length() + var4);
            var4 = param2.indexOf(param3, param1.length() + var4);
        }
        int var5 = -105 % ((param0 - 87) / 35);
        return param2;
    }

    final int e(int param0) {
        if (!(!((dg) this).field_F)) {
            return 0;
        }
        if (param0 <= 6) {
            field_S = null;
            return 100;
        }
        return 100;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Restart";
        field_S = new byte[520];
        field_L = new tf(3);
        field_P = "Playing";
    }
}
