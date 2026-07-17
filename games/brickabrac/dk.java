/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk extends ib implements ha, en, vf {
    static jp field_R;
    private bf field_N;
    private lg field_I;
    private sf field_M;
    private d field_Q;
    private sf field_L;
    private sf field_O;
    private sf field_S;
    private sf field_J;
    private sf field_H;
    private d field_P;
    ri field_K;

    final static void a(String param0, boolean param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int stackIn_21_0 = 0;
        String stackIn_21_1 = null;
        int stackIn_22_0 = 0;
        String stackIn_22_1 = null;
        int stackIn_23_0 = 0;
        String stackIn_23_1 = null;
        int stackIn_23_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_20_0 = 0;
        String stackOut_20_1 = null;
        int stackOut_22_0 = 0;
        String stackOut_22_1 = null;
        int stackOut_22_2 = 0;
        int stackOut_21_0 = 0;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              va.field_a = true;
              ud.field_v = 0;
              var11 = param0;
              var6 = mh.field_mb;
              if (ud.field_v != 0) {
                if (ud.field_v == 1) {
                  var7 = qb.a(ii.field_r, 480, -63, oc.field_m, var11);
                  var8 = 2 - -var7;
                  re.field_q = new int[var8];
                  kn.field_E = new String[var8];
                  var9 = 0;
                  L2: while (true) {
                    if (var8 <= var9) {
                      hi.field_A = new int[1];
                      var9 = 0;
                      L3: while (true) {
                        if (var7 <= var9) {
                          kn.field_E[var8 - 2] = "";
                          kn.field_E[-1 + var8] = oi.field_a;
                          re.field_q[-1 + var8] = 0;
                          hi.field_A[0] = 2;
                          break L1;
                        } else {
                          kn.field_E[var9] = ii.field_r[var9];
                          var9++;
                          continue L3;
                        }
                      }
                    } else {
                      re.field_q[var9] = -1;
                      var9++;
                      continue L2;
                    }
                  }
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var7 = qb.a(ii.field_r, 480, -63, oc.field_m, var11);
                var8 = var7 + 3;
                re.field_q = new int[var8];
                kn.field_E = new String[var8];
                var9 = 0;
                L4: while (true) {
                  if (var8 <= var9) {
                    hi.field_A = new int[2];
                    var9 = 0;
                    L5: while (true) {
                      if (var7 <= var9) {
                        kn.field_E[-3 + var8] = "";
                        kn.field_E[var8 + -2] = var6;
                        re.field_q[-2 + var8] = 0;
                        hi.field_A[0] = 1;
                        kn.field_E[-1 + var8] = oi.field_a;
                        re.field_q[var8 - 1] = 1;
                        hi.field_A[1] = 2;
                        break L1;
                      } else {
                        kn.field_E[var9] = ii.field_r[var9];
                        var9++;
                        continue L5;
                      }
                    }
                  } else {
                    re.field_q[var9] = -1;
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            fi.field_r.field_r = hi.field_A.length;
            var7 = 0;
            var8 = 0;
            L6: while (true) {
              if (var8 >= kn.field_E.length) {
                lk.field_p = var7 + (cc.field_J - (var7 >> 1));
                bg.field_r = fi.field_r.field_r * (wg.field_f - -dj.field_g << 1);
                nc.field_k = cc.field_J + -(var7 >> 1);
                var8 = 0;
                L7: while (true) {
                  if (kn.field_E.length <= var8) {
                    mi.field_d = ea.field_e + -(bg.field_r >> 1);
                    fi.field_r.a(aj.a(0, po.field_a, pq.field_k), 0, param3, (byte) -127);
                    break L0;
                  } else {
                    L8: {
                      stackOut_30_0 = bg.field_r;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (re.field_q[var8] >= 0) {
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = nq.field_i;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L8;
                      } else {
                        stackOut_31_0 = stackIn_31_0;
                        stackOut_31_1 = wh.field_m;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L8;
                      }
                    }
                    bg.field_r = stackIn_33_0 + stackIn_33_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  stackOut_20_0 = 0;
                  stackOut_20_1 = kn.field_E[var8];
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  if (0 > re.field_q[var8]) {
                    stackOut_22_0 = stackIn_22_0;
                    stackOut_22_1 = (String) (Object) stackIn_22_1;
                    stackOut_22_2 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    break L9;
                  } else {
                    stackOut_21_0 = stackIn_21_0;
                    stackOut_21_1 = (String) (Object) stackIn_21_1;
                    stackOut_21_2 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    break L9;
                  }
                }
                L10: {
                  var9 = pl.a(stackIn_23_0, stackIn_23_1, stackIn_23_2 != 0);
                  if (re.field_q[var8] == -1) {
                    break L10;
                  } else {
                    var9 = var9 + ek.field_lb * 2;
                    break L10;
                  }
                }
                L11: {
                  if (var7 >= var9) {
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var5;
            stackOut_37_1 = new StringBuilder().append("dk.N(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L12;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L12;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + 1 + 44 + 0 + 44 + param3 + 44 + 46 + 41);
        }
    }

    public static void a() {
        field_R = null;
    }

    private final String j() {
        return "</col></u>";
    }

    private final boolean i() {
        if (!this.h(10000536)) {
            return false;
        }
        int var2 = -1;
        try {
            var2 = Integer.parseInt(((dk) this).field_S.field_A);
        } catch (NumberFormatException numberFormatException) {
        }
        return bc.a(((dk) this).field_J.field_A, ((dk) this).field_O.field_A, ((dk) this).field_M.field_A, var2, (byte) -126, (dk) this, ((dk) this).field_N.field_F);
    }

    private final String c() {
        return "<u=2164A2><col=2164A2>";
    }

    final static jp a(int param0, mf param1, int param2, int param3) {
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
          if (ln.a(-123, param3, param1, param2)) {
            int discarded$2 = 21;
            return n.a();
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("dk.H(").append(-873).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(int param0, int param1, int param2, lg param3) {
        RuntimeException var5 = null;
        int var6 = 0;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -526) {
                break L1;
              } else {
                ((dk) this).field_O = null;
                break L1;
              }
            }
            L2: {
              if (0 == param2) {
                ih.a("terms.ws", 12);
                break L2;
              } else {
                if (1 != param2) {
                  if (param2 == 2) {
                    ih.a("conduct.ws", 12);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ih.a("privacy.ws", 12);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("dk.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((dk) this).field_P == param4) {
                ln.a(103);
                break L1;
              } else {
                if (param4 == ((dk) this).field_Q) {
                  int discarded$10 = -1;
                  boolean discarded$11 = this.i();
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param2 < -22) {
                break L2;
              } else {
                ((dk) this).field_H = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("dk.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
    }

    private final int a(oc param0, int param1, String param2, int param3, int param4, String param5) {
        RuntimeException var8 = null;
        nf var9 = null;
        ma var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var10 = new ma(20, param1, 290, 25, param0, false, 120, 3, a.field_u, 16777215, param5);
            ((dk) this).a((oc) (Object) var10, true);
            var9 = new nf(((je) (Object) param0).a(-11011), param2, 126, param1 + var10.field_s, 220, param3);
            var9.field_i = (uh) this;
            ((dk) this).a((oc) (Object) var9, true);
            stackOut_0_0 = var10.field_s + var9.field_s;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var8;
            stackOut_2_1 = new StringBuilder().append("dk.I(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param3).append(44).append(170).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 170 + 41);
        }
        return stackIn_1_0;
    }

    private final int a(String param0, oc param1, int param2, int param3) {
        ma var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var6 = new ma(20, param2, 290, 25, param1, false, 120, 3, a.field_u, 16777215, param0);
            ((dk) this).a((oc) (Object) var6, true);
            var7 = -5 / ((-32 - param3) / 59);
            stackOut_0_0 = var6.field_s;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6_ref;
            stackOut_2_1 = new StringBuilder().append("dk.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + 170 + 41);
        }
        return stackIn_1_0;
    }

    private final int a(oc param0, String param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        wl var7 = null;
        ma var8 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
            var8 = new ma(20, param4, 290, 25, param0, false, 120, 3, a.field_u, 16777215, param1);
            ((dk) this).a((oc) (Object) var8, true);
            var7 = new wl(((je) (Object) param0).a(-11011));
            ((dk) this).a((oc) (Object) var7, true);
            var7.a(15, var8.field_o - -var8.field_t - -3, (var8.field_s + -15 >> 1) + var8.field_w, (byte) -119, 15);
            stackOut_0_0 = var8.field_s;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("dk.L(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 170 + 44 + 111 + 44 + param4 + 41);
        }
        return stackIn_1_0;
    }

    final static void h() {
        int var1_int = 0;
        RuntimeException var1 = null;
        km var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= pg.field_k.length) {
                break L0;
              } else {
                L2: {
                  var2 = pg.field_k[var1_int];
                  if (var2 == null) {
                    break L2;
                  } else {
                    var2.d(-88);
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "dk.U(" + -64 + 41);
        }
    }

    public final void a(String param0, byte param1) {
        sf var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
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
              var3 = ((dk) this).field_J;
              var4 = param0;
              ((vb) (Object) var3).a(var4, -12592, false);
              if (param1 == 56) {
                break L1;
              } else {
                int discarded$4 = 1;
                String discarded$5 = this.c();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3_ref;
            stackOut_3_1 = new StringBuilder().append("dk.C(");
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
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    final static void a(int param0, int param1, pb param2, int param3, int param4, jp param5) {
        fc.a(-85, param2.field_p);
        lb.g(0, 0, param2.field_i, param2.field_q, pf.field_b[param1], 16777215);
        try {
            param5.b((-param5.field_x + param2.field_i) / 2, -(342 / param0) + (-param5.field_z + param2.field_q), 55, 83);
            sc.b(-84);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dk.M(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + 23275 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, byte param1, oc param2, char param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_9_0 = false;
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
            if (!super.a(param0, param1, param2, param3)) {
              if (param0 == 98) {
                stackOut_5_0 = ((dk) this).b(param2, (byte) 119);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                if (param0 == 99) {
                  stackOut_9_0 = ((dk) this).a(param2, (byte) -122);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
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
            stackOut_11_1 = new StringBuilder().append("dk.T(").append(param0).append(44).append(param1).append(44);
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
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    private final boolean h(int param0) {
        if (this.a(60, (je) (Object) ((dk) this).field_J)) {
            if (this.a(60, (je) (Object) ((dk) this).field_M)) {
                if (this.a(60, (je) (Object) ((dk) this).field_H)) {
                    if (this.a(60, (je) (Object) ((dk) this).field_O)) {
                        if (this.a(60, (je) (Object) ((dk) this).field_L)) {
                            if (this.a(60, (je) (Object) ((dk) this).field_S)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    final void a(oc param0, byte param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((dk) this).field_Q.field_J = this.h(10000536);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "dk.WA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final int a(int param0, String param1, String param2, int param3, oc param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$2 = 170;
            stackOut_0_0 = this.a(param4, param5, param1, 35, 170, param2);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7;
            stackOut_2_1 = new StringBuilder().append("dk.E(").append(170).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(-3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param5 + 41);
        }
        return stackIn_1_0;
    }

    public final void a(byte param0) {
        if (param0 < 96) {
            return;
        }
        ((fl) (Object) ((dk) this).field_J.a(-11011)).e((byte) -22);
    }

    public dk() {
        super(0, 0, 496, 0, (ub) null);
        ((dk) this).field_J = new sf("", (uh) null, 12);
        ((dk) this).field_M = new sf("", (uh) null, 100);
        ((dk) this).field_H = new sf("", (uh) null, 100);
        ((dk) this).field_O = new sf("", (uh) null, 20);
        ((dk) this).field_L = new sf("", (uh) null, 20);
        ((dk) this).field_S = new sf("", (uh) null, 3);
        int var1 = 1;
        ((dk) this).field_N = new bf("", (uh) null, var1 != 0);
        ((dk) this).field_Q = new d(c.field_d, (uh) null);
        ((dk) this).field_P = new d(se.field_l, (uh) null);
        ((dk) this).field_J.field_z = hh.field_a;
        ((dk) this).field_M.field_z = rf.field_d;
        ((dk) this).field_H.field_z = mf.field_e;
        ((dk) this).field_O.field_z = lm.field_a;
        ((dk) this).field_L.field_z = rn.field_b;
        ((dk) this).field_S.field_z = hc.field_d;
        ((dk) this).field_N.field_z = ok.field_e;
        ((dk) this).field_J.a((ia) (Object) new fl((vb) (Object) ((dk) this).field_J), (byte) -68);
        ((dk) this).field_M.a((ia) (Object) new sg((vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_H.a((ia) (Object) new uc((vb) (Object) ((dk) this).field_H, (vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_O.a((ia) (Object) new g((vb) (Object) ((dk) this).field_O, (vb) (Object) ((dk) this).field_J, (vb) (Object) ((dk) this).field_M), (byte) -68);
        ((dk) this).field_L.a((ia) (Object) new cb((vb) (Object) ((dk) this).field_L, (vb) (Object) ((dk) this).field_O), (byte) -68);
        ((dk) this).field_S.a((ia) (Object) new kf((vb) (Object) ((dk) this).field_S), (byte) -68);
        ((dk) this).field_Q.field_J = false;
        ((dk) this).field_Q.field_l = (ub) (Object) new hi();
        ((dk) this).field_P.field_l = (ub) (Object) new bb();
        ((dk) this).field_J.field_l = (ub) (Object) new r(10000536);
        r dupTemp$0 = new r(10000536);
        ((dk) this).field_H.field_l = (ub) (Object) dupTemp$0;
        ((dk) this).field_M.field_l = (ub) (Object) dupTemp$0;
        ((dk) this).field_S.field_l = (ub) (Object) new r(10000536);
        ((dk) this).field_N.field_l = (ub) (Object) new bd();
        ob dupTemp$1 = new ob(10000536);
        ((dk) this).field_L.field_l = (ub) (Object) dupTemp$1;
        ((dk) this).field_O.field_l = (ub) (Object) dupTemp$1;
        int discarded$2 = 1;
        int discarded$3 = -987472479;
        String var2 = rd.a(ch.field_e, new String[2], (byte) 103);
        int var3 = 20;
        int discarded$4 = 170;
        var3 = var3 + this.a(kq.field_l, (oc) (Object) ((dk) this).field_M, var3, 37);
        int discarded$5 = 170;
        var3 = var3 + (this.a((oc) (Object) ((dk) this).field_H, var3, "", 20, 170, pg.field_o) + 5);
        int discarded$6 = 170;
        var3 = var3 + this.a(wc.field_c, (oc) (Object) ((dk) this).field_O, var3, 84);
        var3 = var3 + (this.a(170, md.field_x, cp.field_G, -3, (oc) (Object) ((dk) this).field_L, var3) - -5);
        var3 = var3 + (this.a(170, dj.field_h, of.field_j, -3, (oc) (Object) ((dk) this).field_J, var3) + 5);
        var3 = var3 + this.a((oc) (Object) ((dk) this).field_S, fk.field_d, 170, 111, var3);
        ma var4 = new ma(46, var3, ((dk) this).field_t - 90, 25, (oc) (Object) ((dk) this).field_N, true, -120 + ((dk) this).field_t, 5, og.field_Yb, 11579568, vq.field_z);
        ((dk) this).a((oc) (Object) var4, true);
        var3 = var3 + var4.field_s;
        um var5 = new um(a.field_u, 0, 0, 0, 0, 16777215, -1, 0, 0, a.field_u.field_F, -1, 2147483647, true);
        ((dk) this).field_I = new lg(var2, (ub) (Object) var5);
        ((dk) this).field_I.field_z = "";
        ((dk) this).field_I.a(qg.field_z, 0, (byte) -98);
        ((dk) this).field_I.a(qg.field_z, 1, (byte) -98);
        ((dk) this).field_I.field_i = (uh) this;
        ((dk) this).field_I.a(46, (byte) 46, -90 + ((dk) this).field_t, var3);
        var3 = var3 + (15 + ((dk) this).field_I.field_s);
        ((dk) this).a((oc) (Object) ((dk) this).field_I, true);
        int var6 = 4;
        int var7 = 200;
        ((dk) this).field_Q.a(40, -var7 + 496 >> 1, var3, (byte) -119, var7);
        ((dk) this).field_P.a(40, 3 + var6, var3 - -15, (byte) -119, 60);
        ((dk) this).field_P.field_i = (uh) this;
        ((dk) this).field_Q.field_i = (uh) this;
        ((dk) this).a((oc) (Object) ((dk) this).field_Q, true);
        ((dk) this).a((oc) (Object) ((dk) this).field_P, true);
        ((dk) this).field_K = new ri((vf) this);
        ((dk) this).field_K.a(150, ((dk) this).field_J.field_o - (-((dk) this).field_J.field_t - 60), 20 + ((dk) this).field_J.field_w, (byte) -119, ((dk) this).field_t + -((dk) this).field_J.field_o - (((dk) this).field_J.field_t + 60));
        ((dk) this).a((oc) (Object) ((dk) this).field_K, true);
        ((dk) this).a(var6 + (var3 + 55), 0, 0, (byte) -119, 496);
    }

    private final boolean a(int param0, je param1) {
        ia var3 = null;
        RuntimeException var3_ref = null;
        qh var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3 = param1.a(-11011);
            if (var3 != null) {
              var4 = var3.b((byte) -31);
              if (lp.field_xb != var4) {
                if (m.field_c == var4) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                } else {
                  if (var4 == uo.field_f) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L0;
                  } else {
                    return true;
                  }
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3_ref;
            stackOut_14_1 = new StringBuilder().append("dk.P(").append(60).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_13_0 != 0;
    }

    static {
    }
}
