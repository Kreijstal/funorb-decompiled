/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends rb {
    static String field_l;
    static int field_k;
    private jb field_m;
    private int field_j;

    final static void a(String param0, String param1, int param2) {
        try {
            ne.a(false, param1, param0, param2 ^ 150);
            if (param2 != 0) {
                field_k = 30;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ia.J(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int m(int param0) {
        int fieldTemp$0 = 0;
        if (param0 != 255) {
            rf var3 = (rf) null;
            ia.a((rf) null, (rf) null, (byte) -73);
            fieldTemp$0 = this.field_g;
            this.field_g = this.field_g + 1;
            return this.field_f[fieldTemp$0] - this.field_m.d(param0 ^ 252) & 255;
        }
        int fieldTemp$1 = this.field_g;
        this.field_g = this.field_g + 1;
        return this.field_f[fieldTemp$1] - this.field_m.d(param0 ^ 252) & 255;
    }

    final void d(byte param0, int param1) {
        int fieldTemp$0 = this.field_g;
        this.field_g = this.field_g + 1;
        this.field_f[fieldTemp$0] = (byte)(param1 + this.field_m.d(3));
        if (param0 >= 14) {
            return;
        }
        field_l = (String) null;
    }

    final static void a(rf param0, rf param1, byte param2) {
        try {
            if (param2 != 57) {
                field_l = (String) null;
            }
            if (param0.field_d != null) {
                param0.b(4);
            }
            param0.field_a = param1.field_a;
            param0.field_d = param1;
            param0.field_d.field_a = param0;
            param0.field_a.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ia.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void l(int param0) {
        int var2 = -5 / ((58 - param0) / 56);
        this.field_g = (this.field_j - -7) / 8;
    }

    public static void k(int param0) {
        field_l = null;
        if (param0 > 29) {
            return;
        }
        rf var2 = (rf) null;
        ia.a((rf) null, (rf) null, (byte) -41);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var4 = 112 / ((param1 - -62) / 42);
                param2 = s.a(param2, '_', "", (byte) -10);
                var3 = vh.a(param0, 0);
                if (0 != (param2.indexOf(param0) ^ -1)) {
                  break L2;
                } else {
                  if ((param2.indexOf(var3) ^ -1) == 0) {
                    stackIn_5_0 = 0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackIn_5_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3_ref);

            stackIn_8_1 = new StringBuilder().append("ia.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int[] param0, byte param1) {
        try {
            this.field_m = new jb(param0);
            int var3_int = -76 / ((param1 - -5) / 46);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ia.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1, byte[] param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = StarCannon.field_A;
        try {
          L0: {
            var5_int = 0;
            if (param1 == -54) {
              L1: while (true) {
                if (var5_int >= param0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  fieldTemp$2 = this.field_g;
                  this.field_g = this.field_g + 1;
                  param2[param3 + var5_int] = (byte)(this.field_f[fieldTemp$2] + -this.field_m.d(dg.a((int) param1, -55)));
                  var5_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("ia.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(boolean param0) {
        if (!param0) {
            return;
        }
        this.field_j = this.field_g * 8;
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = StarCannon.field_A;
        int var3 = this.field_j >> -639891805;
        int var4 = -(this.field_j & 7) + param0;
        int var5 = 0;
        this.field_j = this.field_j + param1;
        while (param1 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((wh.field_e[var4] & this.field_f[incrementValue$0]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
        }
        if (var4 == param1) {
            var5 = var5 + (wh.field_e[var4] & this.field_f[var3]);
        } else {
            var5 = var5 + (this.field_f[var3] >> -param1 + var4 & wh.field_e[param1]);
        }
        return var5;
    }

    ia(int param0) {
        super(param0);
    }

    ia(byte[] param0) {
        super(param0);
    }

    static {
        field_l = "Loading music";
    }
}
