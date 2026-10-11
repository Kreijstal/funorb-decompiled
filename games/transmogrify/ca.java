/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca implements wa {
    static int[] field_c;
    static ck field_g;
    private long field_d;
    static int field_b;
    static String field_a;
    static int field_f;
    static int field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param7 >= 0 &&
            param6 < ka.field_a) {
            if (param4 < 0 &&
              param2 < 0 &&
              param0 < 0) {
              return;
            }
            if (ka.field_i <= param4 &&
              ka.field_i <= param2 &&
              ka.field_i <= param0) {
              return;
            }
            if (!param5) {
              ca.d(-92);
            }
            var14 = param7 - param6;
            if (param6 == param1) {
              if (param7 == param6) {
                var10 = param2 << 16;
                var12 = 0;
                var11 = 0;
                var9_int = param4 << 16;
              } else {
                var15 = -param1 + param7;
                if (param4 >= param2) {
                  var12 = (param0 - param4 << 16) / var14;
                  var11 = (param0 - param2 << 16) / var15;
                  var10 = param4 << 16;
                  var9_int = param2 << 16;
                } else {
                  var9_int = param4 << 16;
                  var10 = param2 << 16;
                  var12 = (-param2 + param0 << 16) / var15;
                  var11 = (param0 - param4 << 16) / var14;
                }
              }
              var13 = 0;
              if (0 > param6) {
                param6 = Math.min(-param6, param1 - param6);
                var10 = var10 + var12 * param6;
                var9_int = var9_int + param6 * var11;
                param6 = 0;
              }
            } else {
              var10 = param4 << 16;
              var9_int = param4 << 16;
              var15 = -param6 + param1;
              var12 = (-param4 + param0 << 16) / var14;
              var11 = (-param4 + param2 << 16) / var15;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var13 = 1;
                var16 = var11;
                var11 = var12;
                var12 = var16;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (0 > param1) {
                  param6 = -param6 + param1;
                  var9_int = var9_int + var11 * param6;
                  var10 = var10 + param6 * var12;
                  param6 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var10 = var10 + var12 * param6;
                  var9_int = var9_int + var11 * param6;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ka.field_d[param6];
                while (param1 > param6) {
                  var17 = var9_int >> 16;
                  if (ka.field_i > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < ka.field_i) {
                        pe.a(var18, param8, var17 + var16Lifetime2, (byte) 105, param3);
                      }
                    } else {
                      if (ka.field_i <= var17 + var18) {
                        var18 = -1 + ka.field_i - var17;
                      }
                      if (var17 >= 0) {
                        pe.a(var18, param8, var17 + var16Lifetime2, (byte) 110, param3);
                      } else {
                        pe.a(var18 + var17, param8, var16Lifetime2, (byte) 117, param3);
                      }
                    }
                  }
                  param6++;
                  if (param6 >= ka.field_a) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + sb.field_c;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              }
              var16Lifetime3 = -param1 + param7;
              if (0 == var16Lifetime3) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param0 << 16;
                if (var13 != 0) {
                  var10 = param2 << 16;
                } else {
                  var9_int = param2 << 16;
                }
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              }
            }
            if (param6 < 0) {
              param6 = -param6;
              var10 = var10 + var12 * param6;
              var9_int = var9_int + var11 * param6;
              param6 = 0;
            }
            var15Lifetime1 = ka.field_d[param6];
            while (param6 < param7) {
              var16Lifetime1 = var9_int >> 16;
              if (ka.field_i > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < ka.field_i) {
                    pe.a(var17Lifetime1, param8, var16Lifetime1 + var15Lifetime1, (byte) 94, param3);
                  }
                } else {
                  if (ka.field_i <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = ka.field_i + (-var16Lifetime1 - 1);
                  }
                  if (var16Lifetime1 >= 0) {
                    pe.a(var17Lifetime1, param8, var15Lifetime1 + var16Lifetime1, (byte) 113, param3);
                  } else {
                    pe.a(var16Lifetime1 + var17Lifetime1, param8, var15Lifetime1, (byte) 104, param3);
                  }
                }
              }
              param6++;
              if (param6 >= ka.field_a) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + sb.field_c;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_80_0 = var9;
          stackIn_80_1 = new StringBuilder().append("ca.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        if (param0 != -577295248) {
          field_a = (String) null;
        }
    }

    final static boolean a(String param0, int param1) {
        int var3 = 0;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          try {
            if (param1 != 2117267440) {
              field_g = (ck) null;
            }
            if (!fe.field_k.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            for (var3 = 0; param0.length() > var3; var3++) {
              if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                return false;
              }
            }
            Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
            return true;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("ca.J(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract rc e(int param0);

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_f = -104;
          }
          var2 = tl.a(11468, uk.b(119, param0));
          if (var2 == null) {
            var2 = "";
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ca.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(boolean param0) {
        this.field_d = lk.a(0);
        if (!param0) {
          int[] var3 = (int[]) null;
          ca.a(-41, -118, 56, -109, 40, false, 51, 94, (int[]) null);
        }
    }

    public final String c(int param0) {
        if (this.b(-16000)) {
          return null;
        }
        if (350L + this.field_d <= lk.a(param0 ^ param0)) {
          return this.f(param0 ^ 30523);
        }
        return null;
    }

    public final rc a(int param0) {
        if (this.b(param0 - 43835)) {
          return bc.field_a;
        }
        if (param0 != 27835) {
          CharSequence var3 = (CharSequence) null;
          ca.a((CharSequence) null, false);
        }
        if (lk.a(0) >= this.field_d + 350L) {
          return this.e(20456);
        }
        return ek.field_a;
    }

    abstract String f(int param0);

    static {
        field_c = new int[128];
        field_a = "End tutorial";
        field_f = 5;
        field_e = -1;
    }
}
