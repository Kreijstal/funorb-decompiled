/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    private int[] field_c;
    private int field_f;
    private boolean field_e;
    static cn field_g;
    static int[] field_a;
    static String field_b;
    private int field_d;

    final int b(int param0) {
        if (param0 != -1) {
            return -58;
        }
        return this.field_d - -1;
    }

    final int b(int param0, int param1) {
        if (this.field_d < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        } else {
          if (param0 != -1) {
            field_a = (int[]) null;
            return this.field_c[param1];
          } else {
            return this.field_c[param1];
          }
        }
    }

    final void a(int param0, byte param1) {
        int var3 = 91 / ((param1 - 26) / 53);
        this.a(this.field_d + 1, param0, -1);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_g = null;
        if (param0 != 0) {
            field_a = (int[]) null;
        }
    }

    private final void c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (param1 != -12364) {
          this.field_f = 94;
          var4 = new int[this.a((byte) 24, param0)];
          var3 = var4;
          lua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        } else {
          var4 = new int[this.a((byte) 24, param0)];
          var3 = var4;
          lua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        boolean stackOut_3_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 != 24) {
          return -80;
        } else {
          var3 = this.field_c.length;
          L0: while (true) {
            L1: {
              if (param1 < var3) {
                stackOut_9_0 = var3;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_3_0 = this.field_e;
                stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                stackIn_4_0 = stackOut_3_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_4_0) {
                    if (var3 != 0) {
                      var3 = var3 * this.field_f;
                      continue L0;
                    } else {
                      var3 = 1;
                      continue L0;
                    }
                  } else {
                    var3 = var3 + this.field_f;
                    continue L0;
                  }
                }
              }
            }
            return stackIn_10_0;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param1 > 25) {
          if (param0 >= 0) {
            if (this.field_d >= param0) {
              if (param0 != this.field_d) {
                lua.a(this.field_c, param0 - -1, this.field_c, param0, this.field_d + -param0);
                this.field_d = this.field_d - 1;
                return;
              } else {
                this.field_d = this.field_d - 1;
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0);
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          return;
        }
    }

    private tq() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        if (this.field_d >= param0) {
          if (param2 == -1) {
            if (this.field_c.length <= param0) {
              this.c(param0, param2 ^ 12363);
              this.field_c[param0] = param1;
              return;
            } else {
              this.field_c[param0] = param1;
              return;
            }
          } else {
            return;
          }
        } else {
          this.field_d = param0;
          if (param2 == -1) {
            if (this.field_c.length > param0) {
              this.field_c[param0] = param1;
              return;
            } else {
              this.c(param0, param2 ^ 12363);
              this.field_c[param0] = param1;
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        field_b = "Offensive account name";
        field_a = new int[1];
    }
}
