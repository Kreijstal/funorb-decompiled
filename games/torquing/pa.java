/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pa {
    static gq field_d;
    static int field_b;
    static String field_a;
    static int field_c;
    static sm[] field_e;

    final static hi a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        df var8 = null;
        p var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_23_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_21_0 = null;
        L0: {
          var7 = Torquing.field_u;
          var8 = kj.field_d;
          var3 = var8.i((byte) -101);
          if ((var3 & 128) == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          fd.field_a = stackIn_3_0 != 0;
          n.field_u = var3 & 127;
          hh.field_a = var8.i((byte) -101);
          pm.field_r = var8.b(9);
          if (n.field_u != 2) {
            bg.field_n = 0;
            oh.field_b = 0;
            break L1;
          } else {
            bg.field_n = var8.i(7088);
            oh.field_b = var8.e((byte) 62);
            break L1;
          }
        }
        L2: {
          if (var8.i((byte) -101) != 1) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          un.field_c = var8.h((byte) 125);
          if (var4 == 0) {
            dg.field_m = un.field_c;
            break L3;
          } else {
            dg.field_m = var8.h((byte) 119);
            break L3;
          }
        }
        L4: {
          if (n.field_u == 1) {
            int discarded$4 = var8.i(7088);
            String discarded$5 = var8.h((byte) 125);
            break L4;
          } else {
            if (n.field_u != 4) {
              break L4;
            } else {
              int discarded$6 = var8.i(7088);
              String discarded$7 = var8.h((byte) 125);
              break L4;
            }
          }
        }
        if (param1) {
          var5 = var8.i(7088);
          try {
            L5: {
              L6: {
                var9 = qg.field_C.a(var5, 32767);
                np.field_m = var9.c((byte) -127);
                if (!dg.field_m.equals((Object) (Object) re.field_e)) {
                  stackOut_22_0 = var9.field_v;
                  stackIn_23_0 = stackOut_22_0;
                  break L6;
                } else {
                  stackOut_21_0 = null;
                  stackIn_23_0 = (int[]) (Object) stackOut_21_0;
                  break L6;
                }
              }
              md.field_a = stackIn_23_0;
              break L5;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            nn.a("CC1", (Throwable) (Object) var6, -9958);
            np.field_m = null;
            md.field_a = null;
            return new hi(param1);
          }
          return new hi(param1);
        } else {
          np.field_m = Torquing.a(26657, 80, (fj) (Object) var8);
          md.field_a = null;
          return new hi(param1);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static dn b(int param0, boolean param1) {
        dn var2 = null;
        dn stackIn_2_0 = null;
        dn stackIn_3_0 = null;
        dn stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dn stackIn_6_0 = null;
        dn stackIn_7_0 = null;
        dn stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        dn stackOut_5_0 = null;
        dn stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        dn stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        dn stackOut_1_0 = null;
        dn stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        dn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 < 6) {
          L0: {
            field_a = null;
            var2 = new dn(true);
            stackOut_5_0 = (dn) var2;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = (dn) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = (dn) (Object) stackIn_6_0;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new dn(true);
            stackOut_1_0 = (dn) var2;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (dn) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (dn) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new gq(0);
        field_a = "Waiting for levels";
    }
}
