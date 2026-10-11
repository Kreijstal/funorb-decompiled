/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd {
    private int field_j;
    static String field_f;
    private int field_b;
    private boolean field_c;
    static String field_a;
    int field_g;
    private int field_e;
    int field_h;
    private int field_i;
    static String[] field_d;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -3864) {
          ci[] var2 = (ci[]) null;
          sd.a(true, (ci[]) null);
        }
        field_f = null;
        field_d = null;
    }

    final void a(byte param0, int param1) {
        this.field_i = 0;
        this.field_e = 0;
        int var3 = 18 / ((-68 - param0) / 54);
        if (this.field_j == 0 &&
          lf.field_c == 96) {
          if (0 >= this.field_h) {
            this.field_h = this.field_g;
          }
          this.field_c = false;
          this.field_h = this.field_h - 1;
        }
        if (this.field_j == 0) {
          this.field_i = lf.field_c;
        }
        if (this.field_j == 0 &&
          lf.field_c == 97) {
          this.field_h = this.field_h + 1;
          this.field_c = false;
          if (this.field_h >= this.field_g) {
            this.field_h = 0;
          }
        }
        if (this.field_j == 0 &&
          (lf.field_c == 98 || lf.field_c == 99)) {
          if (this.field_h < 0) {
            this.field_h = param1;
          }
          this.field_c = false;
        }
    }

    final boolean c(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 > -116) {
          return false;
        }
        stackIn_8_0 = (0 != this.field_e) || (this.field_i == 84) || (this.field_i == 83);
        return stackIn_8_0;
    }

    final static void a(boolean param0, ci[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            field_d = (String[]) null;
          }
          rk.field_f = param1;
          if (rk.field_f != null &&
            param1.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("sd.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_j = 0;
        if (param3 != -85) {
          dh var6 = (dh) null;
          sd.a((byte) -10, (he) null, (dh) null, 107);
        }
        this.field_c = param1 ? true : false;
        if (!this.field_c) {
          this.field_h = param0;
        } else {
          this.field_h = param2;
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          var5 = dk.field_c;
          var1 = var5;
          if (param0 != 87) {
            return;
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1_ref), "sd.E(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        this.field_i = 0;
        this.field_e = 0;
        if (this.field_j == 0) {
          this.field_i = lf.field_c;
        }
        if (0 == this.field_j &&
          lf.field_c == 98) {
          if (this.field_h <= 0) {
            this.field_h = this.field_g;
          }
          this.field_c = false;
          this.field_h = this.field_h - 1;
        }
        if (param0 > -11) {
          this.field_h = -59;
        }
        if (this.field_j == 0 &&
          lf.field_c == 99) {
          this.field_h = this.field_h + 1;
          this.field_c = false;
          if (this.field_g <= this.field_h) {
            this.field_h = 0;
          }
        }
    }

    final static void a(byte param0, he param1, dh param2, int param3) {
        try {
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_35_0 = null;
          StringBuilder stackIn_35_1 = null;
          String stackIn_36_2 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var5 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          wf var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Terraphoenix.field_V;
          try {
            var18 = new wf();
            var18.field_p = param2.a(-16384);
            var18.field_i = param2.f((byte) -107);
            var18.field_o = new byte[var18.field_p][][];
            var18.field_k = new int[var18.field_p];
            var18.field_j = new mf[var18.field_p];
            var18.field_m = new int[var18.field_p];
            var18.field_r = new int[var18.field_p];
            var18.field_s = new mf[var18.field_p];
            for (var5 = 0; var18.field_p > var5; var5++) {
              try {
                var6_int = param2.a(-16384);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param2.e(-1);
                    var21 = param2.e(-1);
                    var9 = param2.a(-16384);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.e(-1);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var9 > var12_int; var12_int++) {
                        var13 = param2.f((byte) -107);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(var13, 0, -37, var22[var12_int]);
                      }
                    }
                    var18.field_k[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = q.a(89, var10[var17]);
                      var17++;
                    }
                    var18.field_j[var5] = param1.a(92, q.a(78, var20), var21, var12);
                    var18.field_o[var5] = var22;
                  }
                } else {
                  var15 = param2.e(-1);
                  var16 = param2.e(-1);
                  var9 = 0;
                  if (1 == var6_int) {
                    var9 = param2.f((byte) -107);
                  }
                  var18.field_k[var5] = var6_int;
                  var18.field_m[var5] = var9;
                  var18.field_s[var5] = param1.a(q.a(119, var15), -3645, var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_r[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_r[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_r[var5] = -5;
              }
            }
            var5 = 89 / ((param0 + 6) / 38);
            rd.field_k.a(var18, -16611);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_35_0 = var4;
            stackIn_35_1 = new StringBuilder().append("sd.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_36_2 = "null";
            } else {
              stackIn_36_2 = "{...}";
            }
            stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
            if (param2 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 >= this.field_g) {
          throw new IllegalArgumentException();
        }
        if (param2 >= this.field_g) {
          throw new IllegalArgumentException();
        }
        this.field_e = 0;
        this.field_i = 0;
        if (0 != ma.field_I) {
          this.field_e = ma.field_I;
          this.field_c = true;
          this.field_h = param2;
          this.field_j = ma.field_I;
          this.field_b = gl.field_m;
        }
        if (this.field_j != 0 &&
          oh.field_f != 0) {
          if (this.field_b <= 0) {
            this.field_b = bd.field_d;
          }
          this.field_b = this.field_b - 1;
        }
        if (ma.field_I == 0 &&
          oh.field_f == 0) {
          this.field_j = 0;
        }
        if (param1 <= 122) {
          this.c((byte) 51);
        }
        if (this.field_j == 0 && (this.field_c ||
          ja.field_l)) {
          if (param0 < 0) {
            if (this.field_c) {
              this.field_h = -1;
            }
          } else {
            if (param0 != this.field_h) {
            }
            this.field_c = true;
            this.field_h = param0;
          }
        }
    }

    sd(int param0) {
        this.field_c = false;
        this.field_h = 0;
        this.field_g = param0;
    }

    static {
        field_a = "MP4.4";
        field_f = "Select next friendly unit";
        field_d = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
