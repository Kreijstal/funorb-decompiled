/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends mg {
    static String field_p;
    static String field_n;
    static boolean[] field_m;
    static ak field_o;

    final dj a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        dj stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                bc.e(54);
                break L1;
              }
            }
            L2: {
              if (hm.a(0, param0) != null) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            var3_int = stackIn_5_0;
            if (var3_int == 0) {
              stackIn_8_0 = sk.field_a;
              break L0;
            } else {
              return qk.field_g;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("bc.D(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    bc(c param0) {
        super(param0);
    }

    final static void a(byte param0, int param1) {
        mc.a(8 * ci.field_o - -param1, -127);
        if (param0 != 96) {
            field_n = (String) null;
        }
    }

    public static void e(int param0) {
        field_p = null;
        field_m = null;
        field_o = null;
        field_n = null;
        int var1 = -73 / ((-35 - param0) / 59);
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 1) {
              if (null == hq.field_t) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (0 > param0.toLowerCase().indexOf(hq.field_t.toLowerCase())) {
                    stackIn_10_0 = 0;
                    break L1;
                  } else {
                    stackIn_10_0 = 1;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("bc.B(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static String b(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new char[var2_int];
            var4 = param0;
            L1: while (true) {
              if (var4 >= var2_int) {
                stackIn_5_0 = new String(var3);
                break L0;
              } else {
                var3[-var4 + (var2_int - 1)] = param1.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("bc.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            ie.a(pg.field_e, w.field_s, true, aa.field_o, 0, 127, param0);
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= pg.field_e) {
                ie.a(param0 + pg.field_e, ro.field_a, false, qn.field_k, param0, 81, param0 + param0);
                if (param1 >= 1) {
                  L2: {
                    if (pg.field_e <= param0) {
                      break L2;
                    } else {
                      pg.field_e = param0;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                gn.field_A[param0 + var2_int] = var2_int;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "bc.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(boolean param0, char param1, int param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        if (param0) {
            field_o = (ak) null;
        }
        return new String(var3);
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param1, true) != sk.field_a) {
              L1: {
                if (param0 <= -76) {
                  break L1;
                } else {
                  field_n = (String) null;
                  break L1;
                }
              }
              stackIn_6_0 = e.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = kp.field_A;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("bc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_n = "Find opponent";
        field_p = "You are not currently logged in to the game.";
        field_m = new boolean[112];
    }
}
