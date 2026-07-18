/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends td implements jg, m {
    private og field_C;
    static boolean field_D;
    private rh field_E;
    static int field_G;
    private el field_F;

    private final String j(int param0) {
        return "</col></u>";
    }

    public final void a(el param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                ue.a("terms.ws", false);
                break L1;
              } else {
                if (1 != param1) {
                  if (param1 == 2) {
                    ue.a("conduct.ws", false);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ue.a("privacy.ws", false);
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 1) {
                break L2;
              } else {
                var7 = null;
                boolean discarded$1 = ge.a((int[]) null, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ge.B(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ge(og param0) {
        super(0, 0, 288, 0, (t) null);
        RuntimeException var2 = null;
        int var3 = 0;
        ic var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
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
            ((ge) this).field_C = param0;
            ((ge) this).field_E = new rh(hd.field_m, (tg) null);
            ((ge) this).field_E.field_y = (t) (Object) new dc();
            var7 = dh.a((byte) -81, new String[2], qd.field_b);
            var3 = 20;
            var4 = new ic(gk.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, gk.field_c.field_G, -1, 2147483647, true);
            ((ge) this).field_F = new el(var7, (t) (Object) var4);
            ((ge) this).field_F.field_n = "";
            ((ge) this).field_F.a((byte) 58, bb.field_a, 0);
            ((ge) this).field_F.a((byte) 80, bb.field_a, 1);
            ((ge) this).field_F.field_l = (tg) this;
            ((ge) this).field_F.field_x = -40 + ((ge) this).field_x;
            ((ge) this).field_F.a(var3, (byte) -44, ((ge) this).field_x + -40, 26);
            var3 = var3 + (((ge) this).field_F.field_u + 15);
            ((ge) this).a(false, (al) (Object) ((ge) this).field_F);
            var5 = 4;
            var6 = 200;
            ((ge) this).field_E.a(40, -3050, var3, var6, 300 + -var6 >> 1);
            ((ge) this).field_E.field_l = (tg) this;
            ((ge) this).a(false, (al) (Object) ((ge) this).field_E);
            ((ge) this).a(55 + var3 + var5, -3050, 0, 300, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var2;
            stackOut_3_1 = new StringBuilder().append("ge.<init>(");
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
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    private final String k(int param0) {
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(byte param0, char param1, al param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        boolean stackOut_7_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var5_int = 82 / ((param0 - 17) / 51);
            if (!super.a((byte) -75, param1, param2, param3)) {
              if (param3 != 98) {
                if (99 != param3) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = ((ge) this).a(param2, true);
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((ge) this).a(param2, 121);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ge.GA(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              if (param0 != ((ge) this).field_E) {
                break L1;
              } else {
                nh.a((byte) -97);
                ((ge) this).field_C.t(20252);
                break L1;
              }
            }
            L2: {
              if (param4 == -27322) {
                break L2;
              } else {
                var7 = null;
                ((ge) this).a((el) null, -97, -102, 71);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("ge.A(");
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int[] param0, boolean param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        wa var4_ref_wa = null;
        int var4 = 0;
        int var5_int = 0;
        wa var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_24_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (jc.field_a != ka.field_b) {
            stackOut_3_0 = 0;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0 != 0;
          } else {
            L0: {
              L1: {
                var2_long = qg.a(param1);
                if (s.field_b == 0) {
                  break L1;
                } else {
                  if (vd.field_K >= 0) {
                    break L1;
                  } else {
                    L2: {
                      var4_ref_wa = (wa) (Object) cg.field_f.b(2);
                      if (var4_ref_wa == null) {
                        break L2;
                      } else {
                        if (var4_ref_wa.field_l >= var2_long) {
                          break L2;
                        } else {
                          var4_ref_wa.a(-60);
                          hd.field_o = var4_ref_wa.field_m.length;
                          ne.field_a.field_k = 0;
                          var5_int = 0;
                          L3: while (true) {
                            if (hd.field_o <= var5_int) {
                              o.field_a = u.field_o;
                              u.field_o = mc.field_L;
                              mc.field_L = uk.field_c;
                              uk.field_c = var4_ref_wa.field_i;
                              stackOut_12_0 = 1;
                              stackIn_13_0 = stackOut_12_0;
                              return stackIn_13_0 != 0;
                            } else {
                              ne.field_a.field_j[var5_int] = var4_ref_wa.field_m[var5_int];
                              var5_int++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  }
                }
              }
              break L0;
            }
            L4: while (true) {
              L5: {
                if (vd.field_K < 0) {
                  ne.field_a.field_k = 0;
                  if (!hf.a(1, false)) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  } else {
                    vd.field_K = ne.field_a.e(false);
                    ne.field_a.field_k = 0;
                    hd.field_o = param0[vd.field_K];
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              if (fh.a(520)) {
                if (s.field_b != 0) {
                  L6: {
                    var4 = s.field_b;
                    if (0.0 == w.field_U) {
                      break L6;
                    } else {
                      var4 = (int)((double)var4 + ta.field_c.nextGaussian() * w.field_U);
                      if (var4 >= 0) {
                        break L6;
                      } else {
                        var4 = 0;
                        break L6;
                      }
                    }
                  }
                  var5 = new wa((long)var4 + var2_long, vd.field_K, new byte[hd.field_o]);
                  var6 = 0;
                  L7: while (true) {
                    if (var6 >= hd.field_o) {
                      cg.field_f.a((byte) -110, (fc) (Object) var5);
                      vd.field_K = -1;
                      continue L4;
                    } else {
                      var5.field_m[var6] = ne.field_a.field_j[var6];
                      var6++;
                      continue L7;
                    }
                  }
                } else {
                  o.field_a = u.field_o;
                  u.field_o = mc.field_L;
                  mc.field_L = uk.field_c;
                  uk.field_c = vd.field_K;
                  vd.field_K = -1;
                  stackOut_27_0 = 1;
                  stackIn_28_0 = stackOut_27_0;
                  return stackIn_28_0 != 0;
                }
              } else {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                return stackIn_25_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("ge.F(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = true;
    }
}
