/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii {
    static vh field_e;
    static String field_b;
    static int field_d;
    static int field_a;
    static String field_f;
    static String field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 126) {
            return;
        }
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static dd a(int param0, qb param1) {
        RuntimeException var2 = null;
        int var5 = 0;
        int var6 = 0;
        qb var7 = null;
        dd var9 = null;
        int[] var15 = null;
        int[] var16 = null;
        dd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        dd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9 = new dd(4 + param1.field_f, param1.field_g - -4);
            var9.field_B = param1.field_d - 2;
            var9.field_G = param1.field_e + -2;
            var15 = new int[4];
            var16 = qh.field_d;
            var5 = qh.field_l;
            var6 = qh.field_f;
            qh.a(var15);
            var9.e();
            param1.field_d = 0;
            var7 = param1;
            param1.field_h = param1.field_f;
            var7.field_e = 0;
            param1.field_b = param1.field_g;
            param1.a(2, param0);
            var9.e(4144959);
            var9.e(65793);
            qh.a(var16, var5, var6);
            qh.b(var15);
            stackOut_0_0 = (dd) (var9);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("ii.C(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static bg a(int param0, String param1, int param2) {
        kr var3 = null;
        RuntimeException var3_ref = null;
        kr stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        kr stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 97) {
                break L1;
              } else {
                ii.a(66);
                break L1;
              }
            }
            var3 = new kr();
            ((bg) ((Object) var3)).field_a = param2;
            ((bg) ((Object) var3)).field_c = param1;
            stackOut_2_0 = (kr) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("ii.E(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (bg) ((Object) stackIn_3_0);
    }

    final static long a(byte[] param0, int param1, int param2, int param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        int var6 = 0;
        byte[] var7 = null;
        long stackIn_6_0 = 0L;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_5_0 = 0L;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var4_long = -1L;
            var6 = param2;
            L1: while (true) {
              if (var6 >= param1) {
                L2: {
                  if (param3 == 154302664) {
                    break L2;
                  } else {
                    var7 = (byte[]) null;
                    break L2;
                  }
                }
                var4_long = var4_long ^ -1L;
                stackOut_5_0 = var4_long;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var4_long = var4_long >>> 154302664 ^ hb.field_f[(int)(((long)param0[var6] ^ var4_long) & 255L)];
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("ii.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        Object var5 = null;
        String var6 = null;
        CharSequence var7 = null;
        if (param0 == -31668) {
          L0: {
            if (null != sm.field_C) {
              var3 = sm.field_C.a(param2, (byte) -83);
              if (0 != var3) {
                L1: {
                  if ((var3 ^ -1) != -3) {
                    break L1;
                  } else {
                    if (sm.field_C.field_nb == null) {
                      break L1;
                    } else {
                      if (!sm.field_C.field_nb.equals("")) {
                        L2: {
                          if (sm.field_C.field_nb.charAt(0) != 91) {
                            var7 = (CharSequence) ((Object) sm.field_C.field_nb);
                            var4 = hq.a(85, var7);
                            break L2;
                          } else {
                            var4 = sm.field_C.field_nb;
                            break L2;
                          }
                        }
                        L3: {
                          var5 = null;
                          if (ne.field_m == 0) {
                            var5 = va.a(var4, param1, 51);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (-2 == (ne.field_m ^ -1)) {
                            var5 = ul.a((byte) 83, var4, param1);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (-3 == (ne.field_m ^ -1)) {
                            var5 = jd.a(param1, var4, param0 ^ -31666);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (-4 == (ne.field_m ^ -1)) {
                            var5 = ae.a(-3266, var4, var4, param1);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (var5 != null) {
                          var6 = (String) null;
                          jh.a(0, (String) (var5), (String) null, 2, var4, true);
                          ne.field_m = -1;
                          sm.field_C = null;
                          break L0;
                        } else {
                          ne.field_m = -1;
                          sm.field_C = null;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                ne.field_m = -1;
                sm.field_C = null;
                break L0;
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1) {
        t.a(117, param0, false);
        if (param1 != 0) {
            field_d = -51;
        }
    }

    static {
        field_d = 0;
        field_b = "Type your password again to make sure it's correct";
        field_f = "<%0> cannot join; the game has started.";
        field_c = "Try changing the '<%0>' setting.";
        field_a = 0;
    }
}
