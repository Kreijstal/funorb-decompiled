/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class za extends wf {
    protected za() {
    }

    final static boolean a(byte param0, char param1) {
        boolean discarded$6 = false;
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 117) {
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$6 = za.a((byte) -61, '￑');
          if (160 != param1) {
            if (param1 != 32) {
              if (param1 != 95) {
                if (45 == param1) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, byte param6) {
        try {
            ua.field_l[param4] = param1;
            dt.field_a[param4] = param3;
            int var7_int = -99 % ((24 - param6) / 63);
            ak.field_f[param4] = param5;
            bk.field_e[param4] = param2;
            oo.field_Y[param4] = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "za.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
