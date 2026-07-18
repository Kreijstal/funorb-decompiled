/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends ck {
    static String field_p;
    wk field_q;
    String field_u;
    static String field_s;
    static wk field_o;
    static String field_t;
    static String field_v;
    static String field_w;
    static String field_r;

    public static void e(int param0) {
        field_o = null;
        field_v = null;
        field_p = null;
        field_s = null;
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = ai.a((gi) null, 92);
        }
        field_t = null;
        field_r = null;
        field_w = null;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var13 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var1_int = 60 % ((3 - param0) / 43);
              if (ln.field_h) {
                break L1;
              } else {
                L2: {
                  if (null == al.field_i) {
                    al.field_i = fg.a(4, 19999);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (al.field_i.field_t) {
                    var15 = ge.field_m;
                    var11 = var15;
                    var6 = var11;
                    var16 = al.field_i.field_s;
                    var4 = 0;
                    L4: while (true) {
                      if (var4 >= 8) {
                        var17 = ce.field_t;
                        var13 = var17;
                        var8 = var13;
                        var18 = al.field_i.field_s;
                        var10 = 0;
                        var4 = var10;
                        L5: while (true) {
                          if (8 <= var10) {
                            ln.field_h = true;
                            al.field_i = null;
                            wl.c((byte) 8);
                            break L3;
                          } else {
                            var8[var10] = ec.a(var17[var10], ~var18[var10]);
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        var6[var4] = vn.a(var15[var4], var16[var4]);
                        var4++;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (ln.field_h) {
                  en.a(79);
                  int discarded$3 = -104;
                  am.b();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L6: {
              if (!df.field_I) {
                L7: {
                  if (null != ol.field_ac) {
                    break L7;
                  } else {
                    int discarded$4 = 1;
                    int discarded$5 = 6;
                    ol.field_ac = od.a();
                    break L7;
                  }
                }
                if (ol.field_ac.field_q) {
                  se.a(-1, ol.field_ac.field_t);
                  ol.field_ac = null;
                  df.field_I = true;
                  mm.field_g.a(65, (byte) -117);
                  mm.field_g.a(68, (byte) -117);
                  mm.field_g.a(70, (byte) -117);
                  break L6;
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "ai.A(" + param0 + ')');
        }
    }

    ai(wk param0, String param1) {
        try {
            ((ai) this).field_u = param1;
            ((ai) this).field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ai.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(gi param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
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
            L1: {
              if (param1 == -32599) {
                break L1;
              } else {
                ai.e(-24);
                break L1;
              }
            }
            L2: {
              var2_int = param0.f((byte) -123);
              if (var2_int == 1) {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("ai.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Reject";
        field_s = "Offer draw";
        field_o = new wk(540, 140);
        field_w = "<%0> has entered a game.";
        field_t = "Waiting for graphics";
        field_v = "Custom-building of sentinels is available in advanced mode only. Earn 1,000 solarite cubes in multiplayer games or in missions to unlock advanced mode.";
        field_r = "asd";
    }
}
