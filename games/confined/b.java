/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b implements fe {
    private int field_c;
    private int field_m;
    private ok field_g;
    private int field_i;
    static int field_f;
    private int field_n;
    private int field_b;
    static ve field_a;
    private int field_o;
    private int field_e;
    private int field_p;
    private int field_d;
    private int field_h;
    private int field_l;
    static String field_k;
    static String field_j;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        fj stackIn_3_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fj var11 = null;
        fa var12 = null;
        try {
          if (param3 instanceof fa) {
            stackIn_3_0 = (fj) (param3);
          } else {
            stackIn_3_0 = null;
          }
          var12 = (fa) (stackIn_3_0);
          if (var12 != null) {
            param2 = param2 & var12.field_L;
          }
          var7 = 5592405;
          if (param2) {
            var7 = 16777215;
          }
          fn.e(param1 + param3.field_q, param3.field_m + param4, param3.field_F, param3.field_z, this.field_c);
          var8 = param3.field_q + (param1 + this.field_h);
          if (param0 >= -97) {
            var11 = (fj) null;
            this.a((byte) 21, -47, false, (fj) null, -45);
          }
          var9 = param3.field_m + (param4 + this.field_m);
          fn.d(var8, var9, this.field_i, this.field_d, 5592405);
          fn.e(var8, var9, this.field_i, this.field_d, var7);
          if (var12.field_O) {
            fn.f(var8, var9, this.field_i + var8, var9 + this.field_d, 1);
            fn.f(this.field_i + var8, var9, var8, var9 + this.field_d, 1);
          }
          if (null != this.field_g) {
            var10 = this.field_i + this.field_h + this.field_l;
            this.field_g.a(param3.field_B, param1 + param3.field_q + var10, this.field_o + (param3.field_m + param4), param3.field_F - (this.field_l + var10), param3.field_z - (this.field_l << 1), this.field_b, this.field_n, this.field_e, this.field_p, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("b.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, byte param2, CharSequence param3) {
        int var8 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Confined.field_J ? 1 : 0;
        try {
          if (2 <= param1 &&
            param1 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param3.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param3.charAt(var8);
              if ((0 == var8) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (0 != var8 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (65 <= var9 &&
                  90 >= var9) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (var9 >= param1) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = param1 * var6 + var9;
                if (var6 != var10 / param1) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            if (param2 != 16) {
              field_a = (ve) null;
            }
            stackIn_43_0 = var6;
            return stackIn_43_0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("b.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_8_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = Confined.field_J ? 1 : 0;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          if (param2 != 1177) {
            field_k = (String) null;
          }
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (var6_int >= 0) {
              stackIn_8_0 = var6_int + 2;
              for (var5 = stackIn_8_0; var5 < var3_int; var5++) {
                if (hc.a(param1.charAt(var5), -58)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (!vl.a((CharSequence) ((Object) var7_ref_String), -182)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = cc.a(true, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (args[var8].length() - (-var6_int + var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (0 > var8Lifetime1) {
              discarded$2 = var6.append(param1.substring(var7));
              stackIn_29_0 = var6.toString();
              return stackIn_29_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (hc.a(param1.charAt(var5Lifetime1), -58)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!vl.a((CharSequence) ((Object) var9), param2 - 1359)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = cc.a(true, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param1.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(args[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("b.B(");
          if (args == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(df param0, int param1, kg param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          RuntimeException stackIn_37_0 = null;
          StringBuilder stackIn_37_1 = null;
          String stackIn_38_2 = null;
          StringBuilder stackIn_40_1 = null;
          String stackIn_41_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
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
          dg var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          String var21 = null;
          byte[][] var22 = null;
          int var13Lifetime1;
          var14 = Confined.field_J ? 1 : 0;
          try {
            if (param1 >= -9) {
              return;
            }
            var18 = new dg();
            var18.field_r = param2.c(32);
            var18.field_t = param2.f((byte) 67);
            var18.field_q = new bc[var18.field_r];
            var18.field_u = new int[var18.field_r];
            var18.field_o = new int[var18.field_r];
            var18.field_s = new byte[var18.field_r][][];
            var18.field_m = new bc[var18.field_r];
            var18.field_v = new int[var18.field_r];
            for (var5 = 0; var5 < var18.field_r; var5++) {
              try {
                var6_int = param2.c(32);
                if (0 != var6_int &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (3 == var6_int ||
                    var6_int == 4) {
                    var20 = param2.d(true);
                    var21 = param2.d(true);
                    var9 = param2.c(32);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param2.d(true);
                    }
                    var22 = new byte[var9][];
                    var19 = var22;
                    var11 = var19;
                    if (3 == var6_int) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param2.f((byte) 112);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param2.a(0, (byte) 87, var13, var22[var12_int]);
                      }
                    }
                    var18.field_o[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = pi.a((byte) 94, var10[var17]);
                      var17++;
                    }
                    var18.field_q[var5] = param0.a((byte) -107, pi.a((byte) 81, var20), var12, var21);
                    var18.field_s[var5] = var22;
                  }
                } else {
                  var15 = param2.d(true);
                  var16 = param2.d(true);
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param2.f((byte) 118);
                  }
                  var18.field_o[var5] = var6_int;
                  var18.field_v[var5] = var9;
                  var18.field_m[var5] = param0.a(0, pi.a((byte) 98, var15), var16);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_u[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_u[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_u[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_u[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_u[var5] = -5;
              }
            }
            af.field_cb.a((rk) (var18), (byte) -82);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = var4;
            stackIn_37_1 = new StringBuilder().append("b.E(");
            if (param0 == null) {
              stackIn_38_2 = "null";
            } else {
              stackIn_38_2 = "{...}";
            }
            stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_41_2 = "null";
            } else {
              stackIn_41_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_k = null;
        if (param0 >= -70) {
          String var2 = (String) null;
          b.a((String[]) null, (String) null, 82);
        }
        field_j = null;
    }

    b(ok param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_e = 1;
        this.field_p = 1;
        try {
          this.field_o = param2;
          this.field_d = param7;
          this.field_l = param1;
          this.field_h = param5;
          this.field_g = param0;
          this.field_i = param8;
          this.field_b = param3;
          this.field_c = param9;
          this.field_m = param6;
          this.field_n = param4;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "b.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_f = 0;
        field_a = new ve();
        field_j = "Look out for <col=FFFFFF>extra life</col> power-ups!";
    }
}
