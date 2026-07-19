/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td {
    static int[] field_a;
    int field_d;
    int[] field_e;
    static ja[] field_c;
    static long field_g;
    static ug field_b;
    static hi field_f;
    int field_h;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        int var1 = -59 % ((param0 - 33) / 37);
        field_f = null;
    }

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param0) {
          if (null != this.field_e) {
            if (0 != this.field_e.length) {
              var3 = 1;
              L0: while (true) {
                if (var3 < this.field_e.length) {
                  stackOut_11_0 = this.field_e[-1 + var3] + this.field_e[var3] >> -234244127 ^ -1;
                  stackOut_11_1 = param1 ^ -1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (var4 == 0) {
                    if (stackIn_13_0 < stackIn_13_1) {
                      return var3 + -1;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    return stackIn_12_0 + stackIn_12_1;
                  }
                } else {
                  return -1 + this.field_e.length;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return 91;
        }
    }

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -27328) {
          if (this.field_e != null) {
            if (-1 == (this.field_e.length ^ -1)) {
              return 0;
            } else {
              return this.field_e[-1 + this.field_e.length];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          this.field_h = 59;
          if (this.field_e == null) {
            return 0;
          } else {
            L0: {
              if (-1 != (this.field_e.length ^ -1)) {
                stackOut_4_0 = this.field_e[-1 + this.field_e.length];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    td(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_d = param0;
        this.field_e = new int[param2 + 1];
    }

    final static jm a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        jm discarded$2 = null;
        jm var8 = null;
        L0: {
          var8 = (jm) ((Object) mf.field_b.g(86));
          if (var8 == null) {
            var8 = new jm();
            break L0;
          } else {
            break L0;
          }
        }
        var8.a(param5, param0, param1, param7, 27658, param4, param6, param2);
        if (param3 <= 26) {
          discarded$2 = td.a(109, 31, 61, (byte) 110, 59, 3, 72, 118);
          return var8;
        } else {
          return var8;
        }
    }

    static {
        field_b = null;
        field_a = new int[128];
        field_g = 20000000L;
    }
}
