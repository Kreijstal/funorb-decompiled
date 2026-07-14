/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class toa {
    int field_a;
    int field_b;
    int[] field_c;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -8636) {
          L0: {
            L1: {
              if (0 == (2048 & param1)) {
                break L1;
              } else {
                if (0 == (55 & param2)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final int a(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            var3 = null;
            toa.a(104, -1.1755644083023071f, 21, 1.4921725988388062f, -0.9892958402633667f, (byte) 76, (vjb) null, -0.3563171923160553f, -2, 1.3547749519348145f, 48, -53, (byte[]) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((toa) this).field_c == null) {
              break L2;
            } else {
              if (((toa) this).field_c.length != 0) {
                stackOut_6_0 = ((toa) this).field_c[((toa) this).field_c.length - 1];
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, float param1, int param2, float param3, float param4, byte param5, vjb param6, float param7, int param8, float param9, int param10, int param11, byte[] param12) {
        int var13 = 0;
        int var14 = VoidHunters.field_G;
        if (param5 >= -38) {
            boolean discarded$0 = toa.a(80, -3, -102);
        }
        for (var13 = 0; param2 > var13; var13++) {
            nq.a(param7, param10, param1, param0, param11, var13, param9, param6, param2, param3, param8, param12, (byte) 126, param4);
            param8 = param8 + param0 * param11;
        }
    }

    toa(int param0, int param1, int param2) {
        ((toa) this).field_a = param1;
        ((toa) this).field_b = param0;
        ((toa) this).field_c = new int[1 + param2];
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        int var5 = VoidHunters.field_G;
        int var3 = -63 / ((-8 - param0) / 54);
        if (((toa) this).field_c != null) {
            // ifeq L34
        } else {
            return 0;
        }
        for (var4 = 1; var4 < ((toa) this).field_c.length; var4++) {
            if (!(param1 >= ((toa) this).field_c[var4 - 1] + ((toa) this).field_c[var4] >> -1833770719)) {
                return var4 - 1;
            }
        }
        return ((toa) this).field_c.length - 1;
    }

    static {
    }
}
