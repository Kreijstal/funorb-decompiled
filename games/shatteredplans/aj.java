/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static ib field_b;
    static ap field_e;
    static int field_c;
    static volatile int field_f;
    static pf field_a;
    static int[] field_d;

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(param1);
            var5 = var4_int;
            L1: while (true) {
              if (param1 <= var5) {
                var6 = 14 % ((param2 - -41) / 41);
                stackIn_5_0 = (StringBuilder) (param0);
                break L0;
              } else {
                param0.setCharAt(var5, param3);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("aj.A(");

            if (param0 == null) {
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
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(boolean param0, byte param1, fb param2, String param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        fc var7 = null;
        String var8 = null;
        fc var9 = null;
        String var10 = null;
        fc var11 = null;
        String var12 = null;
        fc var13 = null;
        try {
          L0: {
            L1: {
              tp.a((int[]) null, 0L, (String) null, (String) null, 293, qs.field_y, param2, -1, param2.g(-77));
              if (!param2.field_Ab) {
                break L1;
              } else {
                L2: {
                  if (param2.field_Fb == 2) {
                    break L2;
                  } else {
                    if ((bs.field_b ^ -1) > -3) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var7 = hp.field_m;
                var8 = re.a(fk.field_o, 4371, new String[]{param3});
                var7.field_j.a(1, 10, var8);
                break L1;
              }
            }
            L3: {
              hp.field_m.a(false);
              if (!param0) {
                break L3;
              } else {
                if (kf.field_g == hp.field_m.field_f) {
                  var11 = hp.field_m;
                  var12 = re.a(id.field_e, 4371, new String[]{param3});
                  var11.field_j.a(1, 16, var12);
                  break L3;
                } else {
                  var9 = hp.field_m;
                  var10 = re.a(cb.field_g, 4371, new String[]{param3});
                  var9.field_j.a(1, 15, var10);
                  break L3;
                }
              }
            }
            var13 = hp.field_m;
            if (param1 <= -22) {
              var5 = nh.field_p;
              var6 = td.field_P;
              var13.field_j.b(0, 0, 0, var5, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("aj.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(int param0, int param1, int param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param3[-2 + param3.length];
            var5 = param3[param3.length - param0];
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (param3.length <= var7) {
                L2: {
                  if ((var6 & 1) != 1) {
                    stackIn_9_0 = 0;
                    break L2;
                  } else {
                    stackIn_9_0 = 1;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var8 = param3[var7];
                  var9 = param3[var7 + 1];
                  if (!td.a(var5, -120, var4_int, var9, param1, var8, param2)) {
                    break L3;
                  } else {
                    var6++;
                    break L3;
                  }
                }
                var5 = var9;
                var4_int = var8;
                var7 += 2;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("aj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final static void a(String param0, boolean param1) {
        if (param1) {
          field_f = -71;
          System.out.println("Error: " + nf.a("%0a", param0, (byte) 82, "\n"));
          return;
        } else {
          System.out.println("Error: " + nf.a("%0a", param0, (byte) 82, "\n"));
          return;
        }
    }

    final static ms a(String param0, boolean param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ms stackIn_5_0 = null;
        ms stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (param0.indexOf('@') == -1) {
                var7 = (CharSequence) ((Object) param0);
                var4_long = oq.a(5722, var7);
                break L1;
              } else {
                var6 = param0;
                break L1;
              }
            }
            if (!param2) {
              stackIn_7_0 = dd.a(param1, param3, (String) (var6), 4684, var4_long);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = (ms) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("aj.B(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        field_a = null;
        if (param0 != 21805) {
            field_c = 3;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        field_f = -1;
    }
}
