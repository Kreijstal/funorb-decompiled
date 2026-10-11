/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    static ea field_a;
    private java.util.zip.Inflater field_c;
    static MinerDisturbance field_b;

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = MinerDisturbance.field_ab;
        if (mn.field_x < 0) {
          return;
        }
        var3 = param1 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (75 > mn.field_x) {
          var5 = (mn.field_x << 8) / 75;
        }
        if (mn.field_x > 200) {
          var5 = (-mn.field_x + 250 << 8) / 50;
        }
        vb.a(nn.field_c, 127);
        dj.a();
        eh.d();
        oj.o(-1236579128);
        if (var5 < 256) {
          eh.b(0, 0, eh.field_g, eh.field_c, 0, 256 - var5);
        }
        tk.b(true);
        if (mn.field_x >= 150) {
          bl.field_x.f(15 + var3, 10 + var4, var5);
        } else {
          nn.field_c.d(var3, var4);
        }
        var6 = mn.field_x - 125;
        if (var6 > 0 &&
          var6 < 50) {
          if (var6 >= 20) {
            if (var6 < 30) {
              lc.field_u.g(var3, var4, 256);
            } else {
              var7 = (50 - var6) * 256 / 20;
              lc.field_u.g(var3, var4, var7);
            }
          } else {
            var7 = 256 * var6 / 20;
            lc.field_u.g(var3, var4, var7);
          }
        }
        if (param0 != 10853) {
          pd.a(89, 110, 71, 81, 114, -10, -60, 118, 22, (byte) -120, -27, 90, 69, -93, 21, -7);
        }
        var6Lifetime1 = -140 + mn.field_x;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          eg.field_b.f(var3 + 15, var4 + 10, var7Lifetime1 * var5 >> 8);
        }
        return;
    }

    final void a(sb param0, boolean param1, byte[] param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          CharSequence var5 = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0.field_u[param0.field_o] == 31 &&
              param0.field_u[1 + param0.field_o] == -117) {
              if (null == this.field_c) {
                this.field_c = new java.util.zip.Inflater(true);
              }
              try {
                this.field_c.setInput(param0.field_u, param0.field_o + 10, param0.field_u.length + (-18 - param0.field_o));
                this.field_c.inflate(param2);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_c.reset();
                throw new RuntimeException("");
              }
              if (!param1) {
                var5 = (CharSequence) null;
                pd.a((CharSequence) null, -19, false, (byte) -63);
              }
              this.field_c.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("pd.F(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 117) {
          pd.a(34, -67, -113, -64, 55, -59, 121, -65, 67, (byte) -89, -110, -95, 58, 93, -30, -64);
        }
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        CharSequence var12 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          if (2 <= param1 &&
            param1 <= 36) {
            var4_int = 0;
            if (param3 < 48) {
              var12 = (CharSequence) null;
              pd.a((CharSequence) null, -116, true, (byte) 7);
            }
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var8 < var7; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param2))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else {
                  if (97 > var9) {
                    return false;
                  }
                  if (var9 > 122) {
                    return false;
                  }
                  var9 -= 87;
                }
                if (param1 <= var9) {
                  return false;
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param1 + var9;
                if (var6 != var10 / param1) {
                  return false;
                }
                var5 = 1;
                var6 = var10;
              }
            }
            stackIn_42_0 = var5;
            return stackIn_42_0 != 0;
          }
          throw new IllegalArgumentException("" + param1);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("pd.B(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = MinerDisturbance.field_ab;
        if (param8 >= param13) {
          if (param8 >= param1) {
            if (param13 >= param1) {
              of.a(param5, -5190, param0, param6, param7, param3, param1, param8, param13, param11, param10, eh.field_f, param4, param12, param14, param15, param2);
            } else {
              of.a(param5, -5190, param14, param12, param7, param3, param13, param8, param1, param11, param2, eh.field_f, param15, param6, param0, param4, param10);
            }
          } else {
            of.a(param14, -5190, param5, param7, param12, param4, param13, param1, param8, param10, param2, eh.field_f, param15, param6, param0, param3, param11);
          }
        } else {
          if (param1 <= param13) {
            if (param1 <= param8) {
              of.a(param0, param9 - 5130, param5, param7, param6, param15, param1, param13, param8, param2, param10, eh.field_f, param4, param12, param14, param3, param11);
            } else {
              of.a(param0, param9 - 5130, param14, param12, param6, param15, param8, param13, param1, param2, param11, eh.field_f, param3, param7, param5, param4, param10);
            }
          } else {
            of.a(param14, param9 ^ 5246, param0, param6, param12, param4, param8, param1, param13, param10, param11, eh.field_f, param3, param7, param5, param15, param2);
          }
        }
        if (param9 != -60) {
          pd.a(-121, 90, -65, -124, -127, -119, 17, 110, 25, (byte) 107, -103, 4, 28, 90, 43, -66);
        }
    }

    private pd(int param0, int param1, int param2) {
    }

    public pd() {
        this(-1, 1000000, 1000000);
    }

    final static int a(CharSequence param0, boolean param1, boolean param2, int param3) {
        int var8 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          if (param3 >= 2 &&
            36 >= param3) {
            var4_int = 0;
            if (!param2) {
              field_a = (ea) null;
            }
            var5 = 0;
            var6 = 0;
            var7 = param0.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param0.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param1))) {
                if (var9 >= 48 &&
                  57 >= var9) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param3 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var6 * param3 + var9;
                if (var6 != var10 / param3) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_42_0 = var6;
            return stackIn_42_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_45_0 = var4;
          stackIn_45_1 = new StringBuilder().append("pd.D(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
