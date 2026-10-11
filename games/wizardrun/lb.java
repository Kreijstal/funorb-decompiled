/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    static String field_e;
    private int field_a;
    static String[] field_f;
    private int[] field_d;
    private boolean field_b;
    private int field_c;

    final static int a(byte param0) {
        if (param0 != 47) {
          field_f = (String[]) null;
          return fh.field_f;
        }
        return fh.field_f;
    }

    final static void a(int param0, int param1, int param2, o param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = wizardrun.field_H;
        try {
          var6_int = (param0 - param1 << 8) / param3.field_x;
          param4 = param4 + param3.field_v;
          var7 = param3.field_u * var6_int + (param1 << 8);
          param2 = param2 + param3.field_u;
          var8 = param2 + ed.field_h * param4;
          var9 = 0;
          if (param5 >= -80) {
            field_f = (String[]) null;
          }
          var10 = param3.field_p;
          var11 = param3.field_z;
          var12 = ed.field_h - var11;
          var13 = 0;
          if (ed.field_i > param4) {
            var14 = -param4 + ed.field_i;
            var9 = var9 + var14 * var11;
            param4 = ed.field_i;
            var10 = var10 - var14;
            var8 = var8 + var14 * ed.field_h;
          }
          if (ed.field_c > param2) {
            var14Lifetime1 = ed.field_c - param2;
            var7 = var7 + var6_int * var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            var9 = var9 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            param2 = ed.field_c;
            var13 = var13 + var14Lifetime1;
          }
          if (ed.field_b < var10 + param4) {
            var10 = var10 - (param4 + var10 - ed.field_b);
          }
          if (ed.field_l < param2 + var11) {
            var14Lifetime2 = -ed.field_l + var11 + param2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (0 < var11 &&
            0 < var10) {
            for (param4 = -var10; param4 < 0; param4++) {
              var14Lifetime3 = var7;
              for (param2 = -var11; 0 > param2; param2++) {
                var15 = var14Lifetime3 >> 8;
                var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param3.field_B[incrementValue$0];
                  if (var17 != 0) {
                    if (var15 <= 255) {
                      var18 = ed.field_k[var8];
                      var19 = 16711935 & (16711935 & var17) * var15 + (16711935 & var18) * var16 >> 8;
                      ed.field_k[var8] = (kl.b(16711838, kl.b(65280, var18) * var16 + var15 * kl.b(var17, 65280)) >> 8) + var19;
                    } else {
                      ed.field_k[var8] = var17;
                    }
                  }
                  var8++;
                } else {
                  var9++;
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("lb.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int a(int param0) {
        int var2 = 46 / ((-57 - param0) / 42);
        return 1 + this.field_a;
    }

    private final void a(byte param0, int param1, int param2) {
        if (param2 > this.field_a) {
          this.field_a = param2;
          if (param0 > 100) {
            if (param2 >= this.field_d.length) {
              this.c(param2, 65);
            }
            this.field_d[param2] = param1;
            return;
          }
          return;
        }
        if (param0 > 100) {
          if (param2 >= this.field_d.length) {
            this.c(param2, 65);
          }
          this.field_d[param2] = param1;
          return;
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_f = null;
        if (param0 != 55) {
          field_f = (String[]) null;
        }
    }

    final void e(int param0, int param1) {
        if (param0 == 16711838) {
          this.a((byte) 103, param1, 1 + this.field_a);
          return;
        }
        this.field_d = (int[]) null;
        this.a((byte) 103, param1, 1 + this.field_a);
    }

    private final int b(int param0, int param1) {
        int var3;
        int var4;
        java.applet.Applet var5;
        int var3Lifetime1;
        var4 = wizardrun.field_H;
        if (param1 == 0) {
          var3 = this.field_d.length;
          while (param0 >= var3) {
            if (!this.field_b) {
              var3 = var3 + this.field_c;
              continue;
            }
            if (var3 == 0) {
              var3 = 1;
              continue;
            }
            var3 = var3 * this.field_c;
          }
          return var3;
        }
        var5 = (java.applet.Applet) null;
        lb.a(54, (java.applet.Applet) null);
        var3Lifetime1 = this.field_d.length;
        while (param0 >= var3Lifetime1) {
          if (!this.field_b) {
            var3Lifetime1 = var3Lifetime1 + this.field_c;
            continue;
          }
          if (var3Lifetime1 == 0) {
            var3Lifetime1 = 1;
            continue;
          }
          var3Lifetime1 = var3Lifetime1 * this.field_c;
        }
        return var3Lifetime1;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              if (param0 < 16) {
                return;
              }
              param1.getAppletContext().showDocument(jl.a(-119, var2, param1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("lb.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void d(int param0, int param1) {
        if (~param1 > param0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_a == param1) {
          this.field_a = this.field_a - 1;
          return;
        }
        g.a(this.field_d, param1 + 1, this.field_d, param1, -param1 + this.field_a);
        this.field_a = this.field_a - 1;
    }

    private final void c(int param0, int param1) {
        int[] var5 = new int[this.b(param0, 0)];
        int[] var3 = var5;
        g.a(this.field_d, 0, var5, 0, this.field_d.length);
        int var4 = 80 % ((1 - param1) / 41);
        this.field_d = var5;
    }

    private lb() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        if (param0 > -60) {
          java.applet.Applet var4 = (java.applet.Applet) null;
          lb.a(-122, (java.applet.Applet) null);
          if (this.field_a < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
          return this.field_d[param1];
        }
        if (this.field_a < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        return this.field_d[param1];
    }

    static {
    }
}
