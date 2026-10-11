/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    String field_a;
    static ot[] field_i;
    private int field_c;
    private oc[] field_d;
    private int field_g;
    private int field_e;
    static String field_f;
    static String[] field_j;
    static int[] field_b;
    float field_h;

    final void a(sj param0, byte param1, String param2, String param3) {
        try {
          this.a(18476, param0, (String) null, param2, param3, -1);
          if (param1 > -105) {
            this.field_c = -99;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qe.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, oc param2) {
        float var4_float = 0.0f;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_float = (float)(this.field_g + 1) + (float)param1 / 100.0f;
          if (param1 != 0) {
            this.field_a = param2.field_c + " - " + param1 + "%";
          } else {
            this.field_a = param2.field_d;
          }
          this.field_h = (float)this.field_c * var4_float / (float)(1 + this.field_e);
          if (param0 != -1) {
            field_i = (ot[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qe.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          var2_int = param1.charAt(0);
          if (!param0) {
            return true;
          }
          for (var3 = 1; var3 < param1.length(); var3++) {
            if (param1.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("qe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_82_2 = null;
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
        var19 = Kickabout.field_G;
        try {
          if (param3 >= 0 &&
            t.field_k > param6) {
            if (param7 < 0 &&
              param8 < 0 &&
              param1 < 0) {
              return;
            }
            if (param7 >= t.field_b &&
              t.field_b <= param8 &&
              t.field_b <= param1) {
              return;
            }
            if (param2 != -2178) {
              field_b = (int[]) null;
            }
            var14 = -param6 + param3;
            if (param6 == param0) {
              if (param6 == param3) {
                var12 = 0;
                var9_int = param7 << 16;
                var11 = 0;
                var10 = param8 << 16;
              } else {
                var15 = param3 - param0;
                if (param8 <= param7) {
                  var11 = (-param8 + param1 << 16) / var15;
                  var9_int = param8 << 16;
                  var10 = param7 << 16;
                  var12 = (-param7 + param1 << 16) / var14;
                } else {
                  var11 = (-param7 + param1 << 16) / var14;
                  var10 = param8 << 16;
                  var12 = (param1 - param8 << 16) / var15;
                  var9_int = param7 << 16;
                }
              }
              if (param6 < 0) {
                param6 = Math.min(-param6, -param6 + param0);
                var9_int = var9_int + param6 * var11;
                var10 = var10 + var12 * param6;
                param6 = 0;
              }
              var13 = 0;
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var15 = param0 - param6;
              var12 = (param1 - param7 << 16) / var14;
              var11 = (-param7 + param8 << 16) / var15;
              if (var12 <= var11) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param6 < 0) {
                if (param0 < 0) {
                  param6 = -param6 + param0;
                  var9_int = var9_int + param6 * var11;
                  var10 = var10 + var12 * param6;
                  param6 = param0;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param6 = -param6;
                  var9_int = var9_int + param6 * var11;
                  var10 = var10 + var12 * param6;
                  param6 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = t.field_q[param6];
                while (param6 < param0) {
                  var17 = var9_int >> 16;
                  if (t.field_b > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (0 != var18) {
                      if (var18 + var17 >= t.field_b) {
                        var18 = -1 - var17 + t.field_b;
                      }
                      if (var17 < 0) {
                        vj.a(param5, var16Lifetime2, var18 + var17, param4, 108);
                      } else {
                        vj.a(param5, var16Lifetime2 + var17, var18, param4, 102);
                      }
                    } else {
                      if (var17 >= 0 &&
                        var17 < t.field_b) {
                        vj.a(param5, var17 + var16Lifetime2, var18, param4, -26);
                      }
                    }
                  }
                  param6++;
                  if (param6 >= t.field_k) {
                    return;
                  }
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                  var16Lifetime2 = var16Lifetime2 + on.field_g;
                }
              }
              var16Lifetime3 = -param0 + param3;
              if (var16Lifetime3 != 0) {
                var17Lifetime2 = param1 << 16;
                if (var13 == 0) {
                  var9_int = param8 << 16;
                } else {
                  var10 = param8 << 16;
                }
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              } else {
                var11 = 0;
                var12 = 0;
              }
            }
            if (param6 < 0) {
              param6 = -param6;
              var10 = var10 + param6 * var12;
              var9_int = var9_int + param6 * var11;
              param6 = 0;
            }
            var15Lifetime1 = t.field_q[param6];
            while (param6 < param3) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < t.field_b) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (0 <= var16Lifetime1 &&
                    var16Lifetime1 < t.field_b) {
                    vj.a(param5, var15Lifetime1 + var16Lifetime1, var17Lifetime1, param4, 104);
                  }
                } else {
                  if (t.field_b <= var16Lifetime1 + var17Lifetime1) {
                    var17Lifetime1 = t.field_b + (-var16Lifetime1 - 1);
                  }
                  if (var16Lifetime1 < 0) {
                    vj.a(param5, var15Lifetime1, var17Lifetime1 + var16Lifetime1, param4, 114);
                  } else {
                    vj.a(param5, var16Lifetime1 + var15Lifetime1, var17Lifetime1, param4, param2 ^ -2285);
                  }
                }
              }
              param6++;
              if (t.field_k <= param6) {
                return;
              }
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + on.field_g;
              var10 = var10 + var12;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_81_0 = var9;
          stackIn_81_1 = new StringBuilder().append("qe.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_82_2 = "null";
          } else {
            stackIn_82_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_81_1).append(stackIn_82_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final boolean a(int param0) {
        int var3;
        oc var4;
        var3 = Kickabout.field_G;
        if (param0 != 1183118480) {
          this.field_h = 2.4517242908477783f;
        }
        while (this.field_g < this.field_e) {
          var4 = this.field_d[this.field_g];
          if (!var4.field_h.d(-118)) {
            this.a(-1, 0, var4);
            return false;
          }
          if (0 <= var4.field_a &&
            !var4.field_h.b((byte) 20, var4.field_a)) {
            this.a(-1, var4.field_h.b(var4.field_a, (byte) 56), var4);
            return false;
          }
          if (null != var4.field_g &&
            !var4.field_h.a(false, var4.field_g)) {
            this.a(-1, var4.field_h.a(var4.field_g, -16248), var4);
            return false;
          }
          if (var4.field_a < 0 &&
            null == var4.field_g &&
            var4.field_c != null &&
            !var4.field_h.a(false)) {
            this.a(param0 - 1183118481, var4.field_h.e(param0 ^ -1183116137), var4);
            return false;
          }
          this.field_g = this.field_g + 1;
        }
        return true;
    }

    final void a(sj param0, String param1, int param2, String param3, String param4) {
        if (param2 != -6869) {
          return;
        }
        try {
          this.a(param2 ^ -21241, param0, param3, param1, param4, -1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qe.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, sj param1, String param2, String param3, String param4, int param5) {
        int fieldTemp$1 = 0;
        oc[] var7 = null;
        oc var7_ref = null;
        oc var8 = null;
        oc[] var9 = null;
        oc var10 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref2 = null;
        try {
          if (this.field_d.length <= this.field_e) {
            var9 = new oc[2 * this.field_e];
            var7 = var9;
            dv.a(this.field_d, 0, var9, 0, this.field_e);
            this.field_d = var9;
          }
          var8 = new oc();
          var10 = var8;
          var7_ref = var10;
          var10.field_d = param4;
          var10.field_h = param1;
          var10.field_g = param2;
          var10.field_c = param3;
          var10.field_a = param5;
          fieldTemp$1 = this.field_e;
          this.field_e = this.field_e + 1;
          this.field_d[fieldTemp$1] = var8;
          if (param0 != 18476) {
            this.field_d = (oc[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref2 = decompiledCaughtException;
          stackIn_7_0 = var7_ref2;
          stackIn_7_1 = new StringBuilder().append("qe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          qe.a(true);
        }
        field_b = null;
        field_f = null;
        field_i = null;
        field_j = null;
    }

    final void a(String param0, sj param1, int param2) {
        try {
          if (param2 >= -67) {
            sj var5 = (sj) null;
            this.a((String) null, (sj) null, -7);
          }
          this.a(18476, param1, (String) null, (String) null, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "qe.H(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    qe(int param0) {
        this.field_d = new oc[16];
        this.field_c = param0;
    }

    static {
        field_f = "This kit was unlocked by the \"<%0>\" achievement.";
        field_j = new String[]{"total tackles", "total success", "total off ball", "times tackled"};
        field_b = new int[1024];
    }
}
