/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hma {
    private int field_b;
    private boolean field_e;
    private int field_a;
    private int[] field_c;
    static int[] field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != -1) {
            field_d = (int[]) null;
        }
    }

    final void a(byte param0, int param1) {
        this.a(this.field_a - -1, -15220, param1);
        if (param0 >= -66) {
            field_d = (int[]) null;
        }
    }

    final static phb[] a(String param0, int param1, asb param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        phb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.b(param0, -112);
            var6 = -104 / ((-47 - param1) / 40);
            var5 = param2.a(true, var4_int, param3);
            stackIn_1_0 = dmb.a(var5, (byte) 75, param2, var4_int);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("hma.G(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = VoidHunters.field_G;
        var3 = this.field_c.length;
        L0: while (true) {
          if (param1 < var3) {
            if (param0 != 0) {
              this.field_a = 102;
              return var3;
            } else {
              return var3;
            }
          } else {
            if (this.field_e) {
              if (var3 == 0) {
                var3 = 1;
                continue L0;
              } else {
                var3 = var3 * this.field_b;
                continue L0;
              }
            } else {
              var3 = var3 + this.field_b;
              continue L0;
            }
          }
        }
    }

    private final void b(byte param0, int param1) {
        int[] var3;
        int[] var4;
        if (param0 <= 110) {
          field_d = (int[]) null;
          var4 = new int[this.a(0, param1)];
          var3 = var4;
          cua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        } else {
          var4 = new int[this.a(0, param1)];
          var3 = var4;
          cua.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        }
    }

    final int b(int param0, byte param1) {
        if (param0 <= this.field_a) {
          if (param1 != 106) {
            return -67;
          } else {
            return this.field_c[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final void a(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
          if (param0 <= this.field_a) {
            if (param1 != 70) {
              return;
            } else {
              L0: {
                if (param0 != this.field_a) {
                  cua.a(this.field_c, 1 + param0, this.field_c, param0, this.field_a + -param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              this.field_a = this.field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    final int a(byte param0) {
        int var2 = -107 / ((param0 - -16) / 43);
        return 1 + this.field_a;
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param0 > this.field_a) {
            this.field_a = param0;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == -15220) {
          if (param0 >= this.field_c.length) {
            this.b((byte) 116, param0);
            this.field_c[param0] = param2;
            return;
          } else {
            this.field_c[param0] = param2;
            return;
          }
        } else {
          return;
        }
    }

    private hma() throws Throwable {
        throw new Error();
    }

    static {
    }
}
