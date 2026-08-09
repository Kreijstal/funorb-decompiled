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
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_25_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        df var8 = null;
        p var9 = null;
        L0: {
          var7 = Torquing.field_u;
          var8 = kj.field_d;
          var3 = var8.i((byte) -101);
          if ((var3 & 128) == 0) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
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
          if (-2 != (var8.i((byte) -101) ^ -1)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
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
          if (-2 == (n.field_u ^ -1)) {
            var8.i(7088);
            var8.h((byte) 125);
            break L4;
          } else {
            if (-5 != (n.field_u ^ -1)) {
              break L4;
            } else {
              var8.i(7088);
              var8.h((byte) 125);
              break L4;
            }
          }
        }
        L5: {
          if (param0 == -11936) {
            break L5;
          } else {
            field_c = -78;
            break L5;
          }
        }
        if (param1) {
          var5 = var8.i(param0 ^ -13616);
          try {
            L6: {
              L7: {
                var9 = qg.field_C.a(var5, 32767);
                np.field_m = var9.c((byte) -127);
                if (!dg.field_m.equals(re.field_e)) {
                  stackIn_25_0 = var9.field_v;
                  break L7;
                } else {
                  stackIn_25_0 = null;
                  break L7;
                }
              }
              md.field_a = stackIn_25_0;
              break L6;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            nn.a("CC1", (Throwable) ((Object) var6), -9958);
            np.field_m = null;
            md.field_a = null;
            return new hi(param1);
          }
          return new hi(param1);
        } else {
          np.field_m = Torquing.a(26657, 80, var8);
          md.field_a = null;
          return new hi(param1);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 >= -48) {
            field_e = (sm[]) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static dn b(int param0, boolean param1) {
        dn var2;
        dn stackIn_3_0 = null;
        dn stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        dn stackIn_7_0 = null;
        dn stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 < 6) {
          L0: {
            field_a = (String) null;
            var2 = new dn(true);
            stackIn_7_0 = (dn) (var2);

            if (!param1) {
              stackIn_8_0 = (dn) ((Object) stackIn_7_0);
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = (dn) ((Object) stackIn_7_0);
              stackIn_8_1 = 1;
              break L0;
            }
          }
          stackIn_8_0.field_g = stackIn_8_1 != 0;
          return var2;
        } else {
          L1: {
            var2 = new dn(true);
            stackIn_3_0 = (dn) (var2);

            if (!param1) {
              stackIn_4_0 = (dn) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (dn) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
              break L1;
            }
          }
          stackIn_4_0.field_g = stackIn_4_1 != 0;
          return var2;
        }
    }

    static {
        field_d = new gq(0);
        field_a = "Waiting for levels";
    }
}
