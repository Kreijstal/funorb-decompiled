/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rj {
    int[] field_a;
    int field_c;
    static aj field_b;
    int field_d;

    public static void b(byte param0) {
        field_b = null;
        if (param0 != 88) {
            field_b = (aj) null;
        }
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param1 == -100) {
          if (this.field_a != null) {
            if (this.field_a.length != 0) {
              var3 = 1;
              L0: while (true) {
                if (var3 < this.field_a.length) {
                  stackOut_24_0 = param0;
                  stackOut_24_1 = this.field_a[var3] + this.field_a[-1 + var3] >> 525366881;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  if (var4 == 0) {
                    if (stackIn_26_0 < stackIn_26_1) {
                      return var3 - 1;
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    return stackIn_25_0 + stackIn_25_1;
                  }
                } else {
                  return -1 + this.field_a.length;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          this.field_c = -22;
          if (this.field_a != null) {
            if (this.field_a.length != 0) {
              var3 = 1;
              L1: while (true) {
                if (var3 < this.field_a.length) {
                  stackOut_9_0 = param0;
                  stackOut_9_1 = this.field_a[var3] + this.field_a[-1 + var3] >> 525366881;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  if (var4 == 0) {
                    if (stackIn_11_0 < stackIn_11_1) {
                      return var3 - 1;
                    } else {
                      var3++;
                      continue L1;
                    }
                  } else {
                    return stackIn_10_0 + stackIn_10_1;
                  }
                } else {
                  return -1 + this.field_a.length;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        }
    }

    final int a(byte param0) {
        if (param0 > 23) {
          if (null != this.field_a) {
            if (this.field_a.length == 0) {
              return 0;
            } else {
              return this.field_a[this.field_a.length - 1];
            }
          } else {
            return 0;
          }
        } else {
          this.field_c = 50;
          if (null != this.field_a) {
            if (this.field_a.length == 0) {
              return 0;
            } else {
              return this.field_a[this.field_a.length - 1];
            }
          } else {
            return 0;
          }
        }
    }

    rj(int param0, int param1, int param2) {
        this.field_a = new int[param2 + 1];
        this.field_d = param0;
        this.field_c = param1;
    }

    static {
        field_b = new aj(8, 0, 4, 1);
    }
}
