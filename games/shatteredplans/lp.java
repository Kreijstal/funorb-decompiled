/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends vd implements gj {
    static bi[] field_w;
    static qr field_v;
    static String field_A;
    static String field_u;
    int field_y;
    private int field_x;
    static String field_z;

    final void e(int param0) {
        super.e(param0 + param0);
        ((lp) this).field_x = 0;
        ((lp) this).field_y = 0;
    }

    public final void a(int param0, int param1) {
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((lp) this).field_x == param1) {
            return;
        }
        int var3 = -((lp) this).field_i + ((lp) this).field_y;
        int var4 = var3 * param1 / 65536;
        int var5 = var3 * ((lp) this).field_x / 65536;
        vd var6 = (vd) (Object) ((lp) this).field_l.d(0);
        while (var6 != null) {
            var6.d(-var4 + var5, 0, 0);
            var6 = (vd) (Object) ((lp) this).field_l.a((byte) -71);
        }
        if (param0 != 13280) {
            field_A = null;
        } else {
            ((lp) this).field_x = param1;
            return;
        }
        ((lp) this).field_x = param1;
    }

    public static void f(int param0) {
        field_v = null;
        field_A = null;
        field_w = null;
        field_u = null;
        field_z = null;
    }

    lp(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3);
        ((lp) this).field_y = 0;
        ((lp) this).field_x = 0;
    }

    final void a(vd param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (!(param0 instanceof lp)) {
                break L1;
              } else {
                ((lp) this).field_y = ((lp) this).field_y + param0.field_i;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lp.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, sq param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        lm[] var8 = null;
        int var9 = 0;
        lm var10 = null;
        int var11 = 0;
        Object var12 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (is.field_b) {
              return;
            } else {
              hm.field_q = param1;
              if (param1 == null) {
                tp.field_b = pc.field_q;
                jb.field_d = kp.field_j + jc.field_r >> 1;
                fe.field_B = kp.field_j + jc.field_r >> 1;
                oi.field_a = be.field_h;
                var12 = null;
                qj.a((sq) null, -1);
                return;
              } else {
                L1: {
                  sj.a(-31560);
                  var2_int = param1.field_t;
                  var3 = param1.field_b;
                  var4 = param1.field_j;
                  var5 = param1.field_q;
                  if (param1.field_q != -1) {
                    break L1;
                  } else {
                    var6 = uq.field_m.a(5607, param1.field_c);
                    var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                    var5 = 34 + (rs.field_Cb.field_q - -(var7 * 13));
                    eh.field_L = new bi[var7];
                    if (param1.field_f != null) {
                      var8 = param1.field_f;
                      var9 = 0;
                      L2: while (true) {
                        if (var8.length <= var9) {
                          break L1;
                        } else {
                          var10 = var8[var9];
                          var6 = uq.field_m.a(5607, var10.field_b);
                          var7 = wk.a(-9615, var6, (nq) (Object) rs.field_Cb, new int[1]);
                          var5 = var5 + (13 * var7 - -rs.field_Cb.field_q);
                          var9++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if ((1 & param1.field_n) == 0) {
                    var2_int = var2_int + 3;
                    break L3;
                  } else {
                    var2_int = 637 + -var2_int;
                    break L3;
                  }
                }
                L4: {
                  if ((param1.field_n & 2) != 0) {
                    var3 = 477 - var3;
                    break L4;
                  } else {
                    var3 = 55 - -var3;
                    break L4;
                  }
                }
                L5: {
                  if ((2 & param1.field_n) == 0) {
                    break L5;
                  } else {
                    var3 = var3 - var5;
                    break L5;
                  }
                }
                L6: {
                  if ((param1.field_n & 1) == 0) {
                    break L6;
                  } else {
                    var2_int = var2_int - var4;
                    break L6;
                  }
                }
                L7: {
                  jb.field_d = var4 + var2_int;
                  tp.field_b = var3 + var5;
                  oi.field_a = var3;
                  fe.field_B = var2_int;
                  qj.a(param1, -1);
                  if (param1.field_c.indexOf("<%tabresizehint>") != -1) {
                    uq.field_m.a("", 27275, "tabresizehint");
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (ol.field_g != null) {
                  break L0;
                } else {
                  pc.field_q = tp.field_b;
                  be.field_h = oi.field_a;
                  kp.field_j = jb.field_d + fe.field_B >> 1;
                  jc.field_r = jb.field_d + fe.field_B >> 1;
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("lp.I(").append(1546006977).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    final static void a(mg param0, byte param1, ob param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              di.a(param0.field_y, false, param2);
              di.a(param0.field_B, false, param2);
              param2.d(param0.field_z, 255);
              if (param1 <= -67) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("lp.K(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final vd b(byte param0, int param1, int param2) {
        vd var4 = null;
        if (param0 > 51) {
          if (((lp) this).field_s) {
            if (((lp) this).c(param1, param2, 0)) {
              var4 = as.a(((lp) this).field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_u = null;
          if (((lp) this).field_s) {
            if (((lp) this).c(param1, param2, 0)) {
              var4 = as.a(((lp) this).field_l, param1, (byte) 117, param2);
              if (var4 != null) {
                return var4;
              } else {
                return super.b((byte) 127, param1, param2);
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = 64 / ((param0 - 67) / 47);
        if (!(((lp) this).field_s)) {
            return;
        }
        int[] var3 = new int[4];
        gf.a(var3);
        gf.i(((lp) this).field_k, ((lp) this).field_t, ((lp) this).field_m + ((lp) this).field_k, ((lp) this).field_t + ((lp) this).field_i);
        vd var4 = (vd) (Object) ((lp) this).field_l.f(3725);
        while (var4 != null) {
            var4.a(116);
            var4 = (vd) (Object) ((lp) this).field_l.b(-124);
        }
        gf.b(var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_u = "Start Game";
        field_A = "You have been defeated";
    }
}
