/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    private int field_i;
    private int[] field_h;
    private boolean field_b;
    private tu field_a;
    private int field_c;
    private String field_d;
    private wk[] field_f;
    static int field_g;
    private int field_j;
    private int field_e;

    final void a(int param0) {
        qn.f(this.field_e, this.field_i, this.field_j, this.field_c, 7829367);
        i.a(this.field_f, this.field_c, this.field_e, (byte) -47, this.field_i, this.field_j);
        if (param0 < 24) {
          this.field_f = (wk[]) null;
          this.b(-11727);
          return;
        } else {
          this.b(-11727);
          return;
        }
    }

    final int a(byte param0) {
        if (param0 >= -10) {
            return -87;
        }
        return this.field_c;
    }

    final static String a(String param0, char param1, int param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String var12 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 - 1;
              if (param2 == 3) {
                break L1;
              } else {
                var12 = (String) null;
                ia.a((String) null, '(', -2, (String) null);
                break L1;
              }
            }
            L2: {
              if (0 == var7) {
                break L2;
              } else {
                var8_int = 0;
                L3: while (true) {
                  var8_int = param0.indexOf((int) param1, var8_int);
                  if (var8_int >= 0) {
                    var6 = var6 + var7;
                    var8_int++;
                    continue L3;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param0.substring(var9));
                stackIn_12_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                discarded$2 = var8.append(param3);
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ia.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    private final void e(int param0) {
        this.field_b = false;
        if (param0 < 12) {
            String var3 = (String) null;
            this.a((byte) -122, (String) null);
        }
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var2 = this.field_f[3].field_A;
        var3 = this.field_a.a(' ');
        var4 = var3 + (var2 + this.field_e);
        var5 = this.field_f[1].field_x;
        var6 = 2;
        var7 = this.field_a.field_H;
        var8 = var5 + this.field_i - (-var6 + -var7);
        if (param0 != -11727) {
          return;
        } else {
          L0: {
            var9 = this.field_h[0];
            if (this.field_b) {
              var9 = this.field_h[1];
              break L0;
            } else {
              break L0;
            }
          }
          this.field_a.b(this.field_d, var4, var8, var9, -1);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.field_i = 33;
          return mo.a(param0, this.field_e, this.field_i, param2, this.field_j, (byte) 94, this.field_c);
        } else {
          return mo.a(param0, this.field_e, this.field_i, param2, this.field_j, (byte) 94, this.field_c);
        }
    }

    private final void a(byte param0, String param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param1;
              if (param0 == 20) {
                break L1;
              } else {
                this.e(99);
                break L1;
              }
            }
            this.d(-94);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ia.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 45) {
          this.a(-31, (byte) 34, -5);
          this.field_i = param0;
          this.field_e = param2;
          return;
        } else {
          this.field_i = param0;
          this.field_e = param2;
          return;
        }
    }

    final int c(int param0) {
        String var3;
        if (param0 != -29408) {
          var3 = (String) null;
          ia.a((String) null, 'd', -85, (String) null);
          return this.field_j;
        } else {
          return this.field_j;
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        if (param0 >= -92) {
          this.a(94, (byte) 54, -110);
          var2 = this.field_f[5].field_A + this.field_f[3].field_A;
          var3 = this.field_a.a(' ') << -1984378655;
          var4 = this.field_a.a(this.field_d);
          this.field_j = var3 + var2 + var4;
          var5 = this.field_f[1].field_x - -this.field_f[7].field_x;
          var6 = 4;
          var7 = this.field_a.field_L + this.field_a.field_H;
          this.field_c = var6 + (var5 + var7);
          return;
        } else {
          var2 = this.field_f[5].field_A + this.field_f[3].field_A;
          var3 = this.field_a.a(' ') << -1984378655;
          var4 = this.field_a.a(this.field_d);
          this.field_j = var3 + var2 + var4;
          var5 = this.field_f[1].field_x - -this.field_f[7].field_x;
          var6 = 4;
          var7 = this.field_a.field_L + this.field_a.field_H;
          this.field_c = var6 + (var5 + var7);
          return;
        }
    }

    ia(wk[] param0, tu param1, int[] param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_a = param1;
            this.field_f = param0;
            this.field_h = param2;
            this.a(param5, (byte) 112, param4);
            this.a((byte) 20, param3);
            this.e(15);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("ia.<init>(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
