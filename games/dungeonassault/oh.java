/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh implements ca {
    static String field_a;
    static md field_j;
    private se field_m;
    private int field_g;
    static int field_s;
    private int field_p;
    private int field_f;
    private int field_c;
    private int field_k;
    private int field_d;
    private int field_e;
    static String field_o;
    private int field_h;
    private int field_l;
    static String field_q;
    private int field_i;
    static String field_b;
    private int field_r;
    static int field_t;
    static String field_n;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = DungeonAssault.field_K;
        try {
          L0: {
            al.field_o.a(1);
            al.field_o.a(24, -92);
            jb.field_Sb[24] = -1;
            hf.field_ob.b(-4);
            hf.field_ob.a((ne) (Object) new a(24), false);
            L1: while (true) {
              if (hf.field_ob.a((byte) -88)) {
                break L0;
              } else {
                var2_int = ((a) (Object) hf.field_ob.b((byte) -124)).field_j;
                if (me.field_g[var2_int].field_h.field_g != param0) {
                  L2: {
                    if (var2_int % 7 <= 0) {
                      break L2;
                    } else {
                      me.a(var2_int, -1 + var2_int, (byte) 69, var2_int + -1 - var2_int / 7);
                      break L2;
                    }
                  }
                  L3: {
                    if (var2_int % 7 >= 6) {
                      break L3;
                    } else {
                      me.a(var2_int, var2_int - -1, (byte) 114, -(var2_int / 7) + var2_int);
                      break L3;
                    }
                  }
                  L4: {
                    if (var2_int <= 6) {
                      break L4;
                    } else {
                      me.a(var2_int, -7 + var2_int, (byte) 71, var2_int + 35);
                      break L4;
                    }
                  }
                  if (42 <= var2_int) {
                    continue L1;
                  } else {
                    me.a(var2_int, 7 + var2_int, (byte) 115, var2_int + 42);
                    continue L1;
                  }
                } else {
                  al.field_o.b(var2_int, 31);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "oh.F(" + param0 + 44 + 7 + 41);
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_a = null;
        field_q = null;
        field_b = null;
        field_n = null;
        field_o = null;
    }

    final static me a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        me stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        me stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -8) {
              stackOut_3_0 = new me(param0);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (me) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("oh.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (null != m.field_e) {
            if (20 <= gn.field_h) {
                if (m.field_e != un.field_e) {
                    of.field_f = m.field_e.b((byte) -114);
                    if (of.field_f != null) {
                        uo.field_a = dd.a((byte) -112, 8, of.field_f);
                    }
                }
                if (null != of.field_f) {
                    var1 = of.field_f.field_y;
                    var2 = of.field_f.field_v;
                    var3 = hj.field_S;
                    if (!(var1 + var3 <= 640)) {
                        var3 = var3 - var1;
                    }
                    var4 = eh.field_h + -var2;
                    if (!(0 <= var4)) {
                        var4 = var4 + (30 + var2);
                    }
                    gf.b(-8 + var3, -8 + var4, of.field_f.field_y + 16, of.field_f.field_v - -16, 16777215, 16);
                    gf.b(var3 + -4, -4 + var4, 8 + of.field_f.field_y, of.field_f.field_v + 8, 0, 64);
                    bp.a(var4, uo.field_a, var3, (byte) 99);
                    of.field_f.h(var3, var4);
                }
            }
        }
        if (param0 <= 1) {
            field_j = null;
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        rb var11 = null;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof rb) {
                stackOut_2_0 = (lm) param1;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lm) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (rb) (Object) stackIn_3_0;
              if (var11 != null) {
                param4 = param4 & var11.field_B;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              if (param4) {
                var7 = 16777215;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              gf.b(param1.field_q + param2, param1.field_v + param3, param1.field_x, param1.field_s, ((oh) this).field_g);
              if (param0 == 34) {
                break L4;
              } else {
                boolean discarded$2 = oh.a(32, '￴');
                break L4;
              }
            }
            L5: {
              var8 = param2 - -param1.field_q + ((oh) this).field_d;
              var9 = param3 + (param1.field_v + ((oh) this).field_h);
              gf.a(var8, var9, ((oh) this).field_l, ((oh) this).field_e, 5592405);
              gf.b(var8, var9, ((oh) this).field_l, ((oh) this).field_e, var7);
              if (!var11.field_E) {
                break L5;
              } else {
                gf.c(var8, var9, ((oh) this).field_l + var8, ((oh) this).field_e + var9, 1);
                gf.c(var8 - -((oh) this).field_l, var9, var8, var9 - -((oh) this).field_e, 1);
                break L5;
              }
            }
            L6: {
              if (null != ((oh) this).field_m) {
                var10 = ((oh) this).field_k + ((oh) this).field_l - -((oh) this).field_d;
                int discarded$3 = ((oh) this).field_m.a(param1.field_w, param1.field_q + param2 - -var10, ((oh) this).field_f + (param1.field_v + param3), -var10 - (((oh) this).field_k - param1.field_x), -(((oh) this).field_k << 1) + param1.field_s, ((oh) this).field_p, ((oh) this).field_i, ((oh) this).field_c, ((oh) this).field_r, 0);
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("oh.B(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L7;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static cn a(nh param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        cn stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 11091) {
                break L1;
              } else {
                var6 = null;
                me discarded$2 = oh.a((String) null, -24);
                break L1;
              }
            }
            var4_int = param0.a(param1, 1000);
            var5 = param0.a(0, param3, var4_int);
            stackOut_2_0 = jf.a(var5, param0, var4_int, (byte) 41);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("oh.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_7_0 = 0;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (255 >= param1) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (0 != param1) {
                  var6 = mh.field_d;
                  var2 = var6;
                  var3 = 0;
                  L5: while (true) {
                    if (var3 >= var6.length) {
                      break L4;
                    } else {
                      var4 = var6[var3];
                      if (param1 == var4) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      } else {
                        var3++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  break L4;
                }
              }
              if (param0 == -161) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                stackOut_19_0 = 1;
                stackIn_20_0 = stackOut_19_0;
                return stackIn_20_0 != 0;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2_ref, "oh.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_22_0 != 0;
    }

    oh(se param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((oh) this).field_c = 1;
        ((oh) this).field_r = 1;
        try {
            ((oh) this).field_k = param1;
            ((oh) this).field_h = param6;
            ((oh) this).field_p = param3;
            ((oh) this).field_g = param9;
            ((oh) this).field_e = param7;
            ((oh) this).field_d = param5;
            ((oh) this).field_i = param4;
            ((oh) this).field_f = param2;
            ((oh) this).field_m = param0;
            ((oh) this).field_l = param8;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "oh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = "Recently raided by: ";
        field_q = "Hidden Pit";
        field_b = "Reload game";
        field_j = new md();
        field_n = "Play the game without logging in just yet";
    }
}
