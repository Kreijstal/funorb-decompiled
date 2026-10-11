/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    String field_e;
    int field_c;
    String field_j;
    static boolean field_b;
    static int field_i;
    static int field_f;
    static ka[] field_h;
    lj field_a;
    static bc field_d;
    String field_g;

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_17_0 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = param1;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var5 < var3_int; var5++) {
                if (qb.a(param2.charAt(var5), true)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!ei.a((byte) -117, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = qh.a((CharSequence) ((Object) var7_ref_String), (byte) -68);
              var4 = var4 + (args[var8].length() - (-var6_int + var5));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param2.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            stackIn_17_0 = 2 + var8Lifetime1;
            for (var5Lifetime1 = stackIn_17_0; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (qb.a(param2.charAt(var5Lifetime1), true)) {
                continue;
              }
              break;
            }
            var9 = param2.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!ei.a((byte) -117, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param2.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = qh.a((CharSequence) ((Object) var9), (byte) -96);
            discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ni.D(");
          if (args == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
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
        int var20 = 0;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var17Lifetime2;
        int var17Lifetime3;
        int var18Lifetime2;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 >= 0 &&
            oc.field_e > param0) {
            if (param7 < 0 &&
              param4 < 0 &&
              param8 < 0) {
              return;
            }
            if (param7 >= oc.field_d &&
              param4 >= oc.field_d &&
              oc.field_d <= param8) {
              return;
            }
            var12 = 90 / ((0 - param1) / 55);
            var15 = -param0 + param2;
            if (param0 == param5) {
              if (param2 == param0) {
                var11 = 0;
                var9_int = param7 << 16;
                var10 = param4 << 16;
                var13 = 0;
              } else {
                var16 = -param5 + param2;
                if (param7 >= param4) {
                  var11 = (-param4 + param8 << 16) / var16;
                  var9_int = param4 << 16;
                  var13 = (param8 - param7 << 16) / var15;
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                  var10 = param4 << 16;
                  var13 = (-param4 + param8 << 16) / var16;
                  var11 = (param8 - param7 << 16) / var15;
                }
              }
              var14 = 0;
              if (param0 < 0) {
                param0 = Math.min(-param0, param5 - param0);
                var10 = var10 + var13 * param0;
                var9_int = var9_int + param0 * var11;
                param0 = 0;
              }
            } else {
              var10 = param7 << 16;
              var9_int = param7 << 16;
              var16 = -param0 + param5;
              var13 = (-param7 + param8 << 16) / var15;
              var11 = (param4 - param7 << 16) / var16;
              if (var11 < var13) {
                var14 = 0;
              } else {
                var17 = var11;
                var11 = var13;
                var13 = var17;
                var14 = 1;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param5 < 0) {
                  param0 = param5 - param0;
                  var9_int = var9_int + param0 * var11;
                  var10 = var10 + param0 * var13;
                  param0 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var10 = var10 + param0 * var13;
                  var9_int = var9_int + param0 * var11;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var17Lifetime2 = oc.field_b[param0];
                while (param0 < param5) {
                  var18 = var9_int >> 16;
                  if (oc.field_d > var18) {
                    var19 = -(var9_int >> 16) + (var10 >> 16);
                    if (var19 != 0) {
                      if (oc.field_d <= var19 + var18) {
                        var19 = oc.field_d + (-var18 - 1);
                      }
                      if (var18 < 0) {
                        kc.a(param3, param6, (byte) -39, var17Lifetime2, var18 + var19);
                      } else {
                        kc.a(param3, param6, (byte) -39, var18 + var17Lifetime2, var19);
                      }
                    } else {
                      if (0 <= var18 &&
                        var18 < oc.field_d) {
                        kc.a(param3, param6, (byte) -39, var17Lifetime2 + var18, var19);
                      }
                    }
                  }
                  param0++;
                  if (oc.field_e <= param0) {
                    return;
                  }
                  var9_int = var9_int + var11;
                  var10 = var10 + var13;
                  var17Lifetime2 = var17Lifetime2 + qg.field_g;
                }
              }
              var17Lifetime3 = param2 - param5;
              if (0 == var17Lifetime3) {
                var13 = 0;
                var11 = 0;
              } else {
                if (var14 == 0) {
                  var9_int = param4 << 16;
                } else {
                  var10 = param4 << 16;
                }
                var18Lifetime2 = param8 << 16;
                var11 = (-var9_int + var18Lifetime2) / var17Lifetime3;
                var13 = (-var10 + var18Lifetime2) / var17Lifetime3;
              }
            }
            if (param0 < 0) {
              param0 = -param0;
              var9_int = var9_int + var11 * param0;
              var10 = var10 + var13 * param0;
              param0 = 0;
            }
            var16Lifetime1 = oc.field_b[param0];
            while (param2 > param0) {
              var17Lifetime1 = var9_int >> 16;
              if (oc.field_d > var17Lifetime1) {
                var18Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (0 == var18Lifetime1) {
                  if (0 <= var17Lifetime1 &&
                    oc.field_d > var17Lifetime1) {
                    kc.a(param3, param6, (byte) -39, var16Lifetime1 + var17Lifetime1, var18Lifetime1);
                  }
                } else {
                  if (oc.field_d <= var18Lifetime1 + var17Lifetime1) {
                    var18Lifetime1 = -var17Lifetime1 + (oc.field_d - 1);
                  }
                  if (var17Lifetime1 >= 0) {
                    kc.a(param3, param6, (byte) -39, var16Lifetime1 + var17Lifetime1, var18Lifetime1);
                  } else {
                    kc.a(param3, param6, (byte) -39, var16Lifetime1, var18Lifetime1 + var17Lifetime1);
                  }
                }
              }
              param0++;
              if (oc.field_e <= param0) {
                return;
              }
              var10 = var10 + var13;
              var16Lifetime1 = var16Lifetime1 + qg.field_g;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_75_0 = var9;
          stackIn_75_1 = new StringBuilder().append("ni.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ji var5 = null;
        ae var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          var5 = (ji) (wf.field_g.c((byte) 113));
          while (var5 != null) {
            ul.a(-18261, var5, param0);
            var5 = (ji) (wf.field_g.c(-270));
          }
          var6 = (ae) (bk.field_t.c((byte) 122));
          var3 = -23 % ((param1 - 23) / 38);
          while (var6 != null) {
            bg.a(param0, (byte) 26, var6);
            var6 = (ae) (bk.field_t.c(-270));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ni.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
        if (!param0) {
          ni.a(true);
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 0;
    }
}
