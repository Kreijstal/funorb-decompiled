/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk {
    int field_d;
    static ri[] field_c;
    int field_a;
    int[] field_b;

    final int a(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 1) {
          if (null != this.field_b) {
            if (this.field_b.length == 0) {
              return 0;
            } else {
              return this.field_b[this.field_b.length - 1];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          this.field_d = -39;
          if (null == this.field_b) {
            return 0;
          } else {
            L0: {
              if (this.field_b.length != 0) {
                stackOut_4_0 = this.field_b[this.field_b.length - 1];
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

    public static void b(int param0) {
        field_c = null;
        if (param0 < 68) {
            field_c = (ri[]) null;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (null != this.field_b) {
          if (this.field_b.length != 0) {
            var4 = 82 % ((param1 - -9) / 57);
            var3 = 1;
            L0: while (true) {
              if (this.field_b.length > var3) {
                stackOut_9_0 = param0 ^ -1;
                stackOut_9_1 = this.field_b[var3] + this.field_b[-1 + var3] >> 188143169 ^ -1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (var5 == 0) {
                  if (stackIn_11_0 <= stackIn_11_1) {
                    var3++;
                    continue L0;
                  } else {
                    return -1 + var3;
                  }
                } else {
                  return stackIn_10_0 + stackIn_10_1;
                }
              } else {
                return -1 + this.field_b.length;
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    tk(int param0, int param1, int param2) {
        this.field_d = param0;
        this.field_b = new int[1 + param2];
        this.field_a = param1;
    }

    static {
    }
}
