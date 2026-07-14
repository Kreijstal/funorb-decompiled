/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    private int field_b;
    private boolean field_c;
    private int[] field_d;
    private int field_a;

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        var3 = ((mb) this).field_d.length;
        var4 = 103 % ((41 - param0) / 45);
        L0: while (true) {
          if (var3 > param1) {
            return var3;
          } else {
            if (((mb) this).field_c) {
              if (0 == var3) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * ((mb) this).field_a;
                continue L0;
              }
            } else {
              var3 = var3 + ((mb) this).field_a;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          if (param0 >= 0) {
            if (((mb) this).field_b < param0) {
              throw new ArrayIndexOutOfBoundsException(param0);
            } else {
              L0: {
                if (param0 != ((mb) this).field_b) {
                  bl.a(((mb) this).field_d, 1 + param0, ((mb) this).field_d, param0, -param0 + ((mb) this).field_b);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((mb) this).field_b = ((mb) this).field_b - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          this.a((byte) -124, 93, -106);
          if (param0 >= 0) {
            if (((mb) this).field_b < param0) {
              throw new ArrayIndexOutOfBoundsException(param0);
            } else {
              L1: {
                if (param0 != ((mb) this).field_b) {
                  bl.a(((mb) this).field_d, 1 + param0, ((mb) this).field_d, param0, -param0 + ((mb) this).field_b);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((mb) this).field_b = ((mb) this).field_b - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        }
    }

    final void c(int param0, int param1) {
        int var3 = 83 / ((param1 - -20) / 59);
        this.a((byte) 24, ((mb) this).field_b + 1, param0);
    }

    final int a(byte param0, int param1) {
        if (param0 != -24) {
            return 121;
        }
        if (!(param1 <= ((mb) this).field_b)) {
            throw new ArrayIndexOutOfBoundsException(param1);
        }
        return ((mb) this).field_d[param1];
    }

    private final void a(byte param0, int param1, int param2) {
        L0: {
          if (((mb) this).field_b < param1) {
            ((mb) this).field_b = param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 > 3) {
          if (param1 >= ((mb) this).field_d.length) {
            this.a(1, param1);
            ((mb) this).field_d[param1] = param2;
            return;
          } else {
            ((mb) this).field_d[param1] = param2;
            return;
          }
        } else {
          return;
        }
    }

    private mb() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.b(param0 ^ 118, param1)];
        var3 = var4;
        bl.a(((mb) this).field_d, 0, var4, 0, ((mb) this).field_d.length);
        if (param0 != 1) {
          return;
        } else {
          ((mb) this).field_d = var4;
          return;
        }
    }

    final int a(byte param0) {
        if (param0 >= -123) {
            ((mb) this).field_b = 46;
            return 1 + ((mb) this).field_b;
        }
        return 1 + ((mb) this).field_b;
    }

    static {
    }
}
