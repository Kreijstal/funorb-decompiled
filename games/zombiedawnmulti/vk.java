/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends rg {
    static String field_K;
    static int[] field_J;
    private th field_H;
    static String field_F;
    static String field_G;
    static boolean field_E;
    static pd field_I;
    static String[] field_L;

    final void b(int param0, cf param1) {
        df var3 = null;
        if (!(param1 instanceof df)) {
            throw new IllegalArgumentException();
        }
        if (param0 != 3016) {
            return;
        }
        try {
            var3 = (df) (Object) param1;
            ((vk) this).field_H.a(-25612, (br) (Object) var3);
            var3.field_R = true;
            boolean discarded$0 = var3.a((cf) this, 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "vk.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean l(byte param0) {
        Object var2 = null;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -121) {
            break L0;
          } else {
            var2 = null;
            String discarded$2 = vk.a(-28, (CharSequence) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (fn.field_i < 20) {
              break L2;
            } else {
              if (!ge.p(-86)) {
                break L2;
              } else {
                L3: {
                  if (qq.field_a <= 0) {
                    break L3;
                  } else {
                    if (re.b(-118)) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final void h(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        if (param0 > -84) {
            boolean discarded$0 = vk.l((byte) 127);
        }
        while (var3 != null) {
            if (var3.i(-27388)) {
                var3.a(true);
            }
            var3 = (df) (Object) var2.a((byte) -113);
        }
        ((vk) this).field_B = (cf) (Object) ((vk) this).j((byte) -119);
    }

    public static void k(byte param0) {
        field_K = null;
        field_I = null;
        int var1 = -90;
        field_F = null;
        field_J = null;
        field_G = null;
        field_L = null;
    }

    final static void a(ka param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (uf.field_g <= var2_int) {
                    int dupTemp$4 = param0.a(true);
                    ub.field_ub[dupTemp$4] = ub.field_ub[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= uf.field_g) {
                        uf.field_g = var2_int;
                        int fieldTemp$5 = uf.field_g;
                        uf.field_g = uf.field_g + 1;
                        uk.field_M[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (uk.field_M[var3].field_l != param0.field_l) {
                              break L5;
                            } else {
                              var4 = uk.field_M[var3].a(true);
                              if (ub.field_ub[var4] <= sj.field_m) {
                                break L5;
                              } else {
                                ub.field_ub[var4] = ub.field_ub[var4] - 1;
                                break L4;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          uk.field_M[incrementValue$6] = uk.field_M[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (param0.field_l != uk.field_M[var2_int].field_l) {
                        break L6;
                      } else {
                        int dupTemp$7 = uk.field_M[var2_int].a(true);
                        ub.field_ub[dupTemp$7] = ub.field_ub[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ub.field_ub[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("vk.E(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + 83 + ')');
        }
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
              if (param0 == 20) {
                break L1;
              } else {
                var3 = null;
                vk.a((int[]) null, true, 94, 30, (byte) 84, (int[]) null, 90, 72, -73);
                break L1;
              }
            }
            stackOut_2_0 = so.a(false, -52, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("vk.P(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean i(byte param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -39) {
            break L0;
          } else {
            var2 = null;
            vk.a((int[]) null, false, -127, -95, (byte) -9, (int[]) null, -29, -30, -79);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!a.a(-107)) {
              break L2;
            } else {
              if ((8 & wf.field_m) != 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void h(int param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            var3.field_R = false;
            var3 = (df) (Object) var2.a((byte) -112);
        }
        ((vk) this).field_B = null;
        if (param0 >= -81) {
            boolean discarded$0 = vk.i((byte) 56);
        }
    }

    final df j(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            if (!(!var3.field_R)) {
                return var3;
            }
            var3 = (df) (Object) var2.a((byte) -48);
        }
        if (param0 < -118) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(((vk) this).field_h == null)) {
            ((vk) this).field_h.a(true, param1, -15112, param3, (cf) this);
        }
        if (param0 != -2) {
            return;
        }
        ch var5 = new ch(((vk) this).field_H);
        cf var6 = (cf) (Object) var5.a(32397);
        while (var6 != null) {
            var6.a(-2, param1 - -((vk) this).field_i, param2, param3 + ((vk) this).field_y);
            var6 = (cf) (Object) var5.e(-3);
        }
    }

    final cf f(int param0) {
        ch var2 = null;
        df var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = new ch(((vk) this).field_H);
        if (param0 == -1963) {
          var3 = (df) (Object) var2.c(-3);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_R) {
                return var3.g(122);
              } else {
                var3 = (df) (Object) var2.a((byte) -38);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static ja[] a(int param0, int param1, ul param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (ud.a(param3, param2, param1, (byte) -42)) {
            return eb.a(33);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("vk.N(").append(38).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param3 + ')');
        }
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, byte param4, int[] param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var9_int = 13 / ((param4 - 48) / 58);
              if (param2 == 1) {
                mj.field_Hb[param2] = (nc) (Object) new ho(param2, param1, param3, param6, param8, param7, param5);
                break L1;
              } else {
                if (3 != param2) {
                  if (param2 == 4) {
                    mj.field_Hb[param2] = (nc) (Object) new ol(param2, param1, param3, param6, param8, param7, param5);
                    break L1;
                  } else {
                    L2: {
                      if (5 == param2) {
                        break L2;
                      } else {
                        if (param2 == 6) {
                          break L2;
                        } else {
                          if (10 == param2) {
                            mj.field_Hb[param2] = (nc) (Object) new si(param2, param1, param3, param6, param8, param7, param5);
                            break L1;
                          } else {
                            if (param2 == 12) {
                              mj.field_Hb[param2] = (nc) (Object) new vo(param2, param1, param3, param6, param8, param7, param5);
                              break L1;
                            } else {
                              if (param2 == 14) {
                                mj.field_Hb[param2] = (nc) (Object) new vj(param2, param1, param3, param6, param8, param7, param5);
                                break L1;
                              } else {
                                if (param2 == 15) {
                                  mj.field_Hb[param2] = (nc) (Object) new tk(param2, param1, param3, param6, param8, param7, param5);
                                  break L1;
                                } else {
                                  if (13 == param2) {
                                    mj.field_Hb[param2] = (nc) (Object) new kp(param2, param1, param3, param6, param8, param7, param5);
                                    break L1;
                                  } else {
                                    mj.field_Hb[param2] = new nc(param2, param1, param3, param6, param8, param7, param5);
                                    break L1;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    mj.field_Hb[param2] = (nc) (Object) new mq(param2, param1, param3, param6, param8, param7, param5);
                    break L1;
                  }
                } else {
                  mj.field_Hb[param2] = (nc) (Object) new fk(param2, param1, param3, param6, param8, param7, param5);
                  break L1;
                }
              }
            }
            ab.field_h = (si) (Object) mj.field_Hb[10];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var9 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var9;
            stackOut_23_1 = new StringBuilder().append("vk.R(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          L4: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public vk() {
        super(0, 0, ub.field_wb, kc.field_a, (nl) null, (bj) null);
        ((vk) this).field_H = new th();
    }

    final void g(byte param0) {
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        ch var2 = new ch(((vk) this).field_H);
        if (param0 != 118) {
            field_J = null;
        }
        df var3 = (df) (Object) var2.c(-3);
        while (var3 != null) {
            if (!(!var3.h(-6134))) {
                var3.a(true);
            }
            var3 = (df) (Object) var2.a((byte) -30);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "(Including <%0>)";
        field_G = "Achievements can only be earned in Rated games.";
        field_K = "Music: ";
        field_L = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_E = false;
    }
}
