/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class rc extends tn {
    static int field_l;
    pf field_n;
    private ga field_m;
    vk field_o;

    final tn b() {
        qq var1 = null;
        var1 = (qq) (Object) ((rc) this).field_n.d(0);
        if (var1 != null) {
          if (null != var1.field_K) {
            return (tn) (Object) var1.field_K;
          } else {
            return ((rc) this).d();
          }
        } else {
          return null;
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2 = 0;
        qq var3 = null;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        ((rc) this).field_o.a(param0);
        var3 = (qq) (Object) ((rc) this).field_n.d(0);
        L0: while (true) {
          if (var3 != null) {
            if (var4 == 0) {
              L1: {
                if (((rc) this).field_m.a((byte) 124, var3)) {
                  break L1;
                } else {
                  var2 = param0;
                  L2: while (true) {
                    if (var3.field_p >= var2) {
                      this.a(2105376, var3, var2);
                      var3.field_p = var3.field_p - var2;
                      break L1;
                    } else {
                      this.a(2105376, var3, var3.field_p);
                      var2 = var2 - var3.field_p;
                      if (!((rc) this).field_m.a(0, (int[]) null, 2, var3, var2)) {
                        continue L2;
                      } else {
                        if (var4 != 0) {
                          var3.field_p = var3.field_p - var2;
                          break L1;
                        } else {
                          if (var4 == 0) {
                            break L1;
                          } else {
                            this.a(2105376, var3, var2);
                            var3.field_p = var3.field_p - var2;
                            break L1;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qq var6 = null;
        int var7 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((rc) this).field_o.b(param0, param1, param2);
            var6 = (qq) (Object) ((rc) this).field_n.d(0);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (var7 == 0) {
                  stackOut_5_0 = ((rc) this).field_m.a((byte) 122, var6);
                  stackIn_6_0 = stackOut_5_0;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (!stackIn_6_0) {
                          break L4;
                        } else {
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4_int = param1;
                      var5 = param2;
                      L5: while (true) {
                        if (var6.field_p >= var5) {
                          this.a(param0, var4_int, var6, var5, (byte) 121, var4_int + var5);
                          var6.field_p = var6.field_p - var5;
                          break L3;
                        } else {
                          this.a(param0, var4_int, var6, var6.field_p, (byte) 121, var4_int + var5);
                          var5 = var5 - var6.field_p;
                          var4_int = var4_int + var6.field_p;
                          stackOut_10_0 = ((rc) this).field_m.a(var4_int, param0, 2, var6, var5);
                          stackIn_6_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var7 != 0) {
                            continue L2;
                          } else {
                            if (stackIn_11_0) {
                              break L3;
                            } else {
                              continue L5;
                            }
                          }
                        }
                      }
                    }
                    var6 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("rc.G(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static lp a(byte param0, sd param1, em param2, boolean param3) {
        RuntimeException var4 = null;
        lp var4_ref = null;
        ff var5 = null;
        String var6 = null;
        kb var7 = null;
        int var8 = 0;
        ff var9 = null;
        b var10 = null;
        int var11_int = 0;
        b var11 = null;
        int var12 = 0;
        b var12_ref_b = null;
        int var13_int = 0;
        qk var13 = null;
        ff var14 = null;
        qk var14_ref = null;
        qk var15 = null;
        ff var15_ref = null;
        jh var16 = null;
        String var16_ref = null;
        qk var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        b stackIn_4_0 = null;
        b stackIn_11_0 = null;
        jh stackIn_16_0 = null;
        qk stackIn_16_1 = null;
        StringBuilder stackIn_16_2 = null;
        jh stackIn_17_0 = null;
        qk stackIn_17_1 = null;
        StringBuilder stackIn_17_2 = null;
        jh stackIn_18_0 = null;
        qk stackIn_18_1 = null;
        StringBuilder stackIn_18_2 = null;
        String stackIn_18_3 = null;
        lp stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        b stackOut_3_0 = null;
        b stackOut_10_0 = null;
        jh stackOut_15_0 = null;
        qk stackOut_15_1 = null;
        StringBuilder stackOut_15_2 = null;
        jh stackOut_17_0 = null;
        qk stackOut_17_1 = null;
        StringBuilder stackOut_17_2 = null;
        String stackOut_17_3 = null;
        jh stackOut_16_0 = null;
        qk stackOut_16_1 = null;
        StringBuilder stackOut_16_2 = null;
        String stackOut_16_3 = null;
        lp stackOut_25_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_ref = new lp(0, 0, 209, 70);
            var4_ref.field_h = (Object) (Object) param1;
            var5 = new ff(-5 + (40 - (-((5 + dm.field_d[0].field_z) * 4) + -k.field_d.field_z)), rs.field_Cb.field_J + -7, fj.field_r);
            var4_ref.a((vd) (Object) var5, 8);
            var6 = param1.field_q.field_I;
            var6 = var6 + " (" + param1.field_o.field_t + ")";
            var7 = new kb(0, 0, 209, param1.field_o.field_k, var6, 16777215, false);
            var4_ref.a((vd) (Object) var7, 8);
            var8 = 7;
            var9 = new ff(0, var8 + var7.field_i, 35, 35, uk.a(false, param1.field_q));
            var4_ref.a((vd) (Object) var9, 8);
            var10 = new b(40, var8 + (var7.field_i - -dm.field_d[0].field_w), 4 * dm.field_d[0].field_z + 15, 35 + -dm.field_d[0].field_w, 2, 2105376);
            var4_ref.a((vd) (Object) var10, 8);
            var11_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (4 <= var11_int) {
                    break L3;
                  } else {
                    stackOut_3_0 = new b(var11_int * (5 + dm.field_d[var11_int].field_z) + 40, var7.field_i - -var8 - -(dm.field_d[var11_int].field_w / 2), dm.field_d[var11_int].field_z, 35 + -(dm.field_d[var11_int].field_w / 2), 2, 2105376);
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var19 != 0) {
                      break L2;
                    } else {
                      L4: {
                        var12_ref_b = stackIn_4_0;
                        var4_ref.a((vd) (Object) var12_ref_b, 8);
                        var13_int = param1.field_r + param1.field_u[var11_int];
                        if (var13_int < 0) {
                          var13_int = 0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var14_ref = new qk((dm.field_d[var11_int].field_z + 5) * var11_int + 40, dm.field_d[var11_int].field_w + var7.field_i - -var8, dm.field_d[var11_int].field_z, rs.field_Cb.field_J, Integer.toString(var13_int));
                        var4_ref.a((vd) (Object) var14_ref, 8);
                        var15_ref = new ff(40 - -(var11_int * (5 + dm.field_d[var11_int].field_z)), var7.field_i + var8, dm.field_d[var11_int]);
                        var4_ref.a((vd) (Object) var15_ref, 8);
                        var16_ref = ne.field_m[var11_int];
                        if (0 != param1.field_u[var11_int]) {
                          break L5;
                        } else {
                          var16_ref = var16_ref + " " + sg.field_yb;
                          break L5;
                        }
                      }
                      var15_ref.field_o = var16_ref;
                      var14_ref.field_o = var16_ref;
                      var12_ref_b.field_o = var16_ref;
                      var11_int++;
                      if (var19 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_10_0 = new b(dm.field_d[0].field_z * 4 - -60, var8 + (var7.field_i - -(dm.field_d[0].field_w / 2)), k.field_d.field_z, -(dm.field_d[0].field_w / 2) + 35, 2, 534312);
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              L6: {
                var11 = stackIn_11_0;
                var4_ref.a((vd) (Object) var11, 8);
                var12 = param1.field_r;
                if (var12 >= 0) {
                  break L6;
                } else {
                  var12 = 0;
                  break L6;
                }
              }
              L7: {
                if (param0 > 117) {
                  break L7;
                } else {
                  var20 = null;
                  lp discarded$1 = rc.a((byte) -57, (sd) null, (em) null, true);
                  break L7;
                }
              }
              L8: {
                var13 = new qk(20 - -(4 * dm.field_d[0].field_z) + 40, dm.field_d[0].field_w + (var7.field_i - -var8), k.field_d.field_z, rs.field_Cb.field_J, Integer.toString(var12));
                var4_ref.a((vd) (Object) var13, 8);
                var14 = new ff(20 - (-(4 * dm.field_d[0].field_z) - 40), var8 + (var7.field_i + -1), k.field_d);
                var4_ref.a((vd) (Object) var14, 8);
                var14.field_o = si.field_w;
                var13.field_o = si.field_w;
                var11.field_o = si.field_w;
                var15 = new qk(54 - -(dm.field_d[0].field_z * 4), var7.field_i + (var8 + dm.field_d[0].field_w), "=");
                var4_ref.a((vd) (Object) var15, 8);
                var16 = new jh(4 * dm.field_d[0].field_z + 60 - (-5 + -k.field_d.field_z), var7.field_i + 3, aq.field_i.field_z, aq.field_i.field_w, -1, aq.field_i, (String) null, -1, -1, hq.field_a, (String) null, -1);
                var16.field_h = (Object) (Object) param1;
                var4_ref.a((vd) (Object) var16, 8);
                var17 = new qk(var16.field_k, 29 + var16.field_t, var16.field_m, rs.field_Cb.field_J, Integer.toString(param1.field_x));
                var17.field_h = (Object) (Object) param1;
                var4_ref.a((vd) (Object) var17, 8);
                stackOut_15_0 = (jh) var16;
                stackOut_15_1 = (qk) var17;
                stackOut_15_2 = new StringBuilder().append(hd.field_j).append(" ");
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                if (1 == param1.field_x) {
                  stackOut_17_0 = (jh) (Object) stackIn_17_0;
                  stackOut_17_1 = (qk) (Object) stackIn_17_1;
                  stackOut_17_2 = (StringBuilder) (Object) stackIn_17_2;
                  stackOut_17_3 = ad.field_a;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  stackIn_18_3 = stackOut_17_3;
                  break L8;
                } else {
                  stackOut_16_0 = (jh) (Object) stackIn_16_0;
                  stackOut_16_1 = (qk) (Object) stackIn_16_1;
                  stackOut_16_2 = (StringBuilder) (Object) stackIn_16_2;
                  stackOut_16_3 = re.a(d.field_c, 4371, new String[1]);
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_18_3 = stackOut_16_3;
                  break L8;
                }
              }
              stackIn_18_1.field_o = stackIn_18_3;
              stackIn_18_0.field_o = stackIn_18_3;
              var18 = 0;
              L9: while (true) {
                L10: {
                  if (var18 >= param2.field_d.length) {
                    break L10;
                  } else {
                    L11: {
                      if (param2.field_d[var18] == null) {
                        param2.field_d[var18] = var16;
                        param2.field_f[var18] = var4_ref;
                        param2.field_i[var18] = var17;
                        if (var19 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    var18++;
                    if (var19 == 0) {
                      continue L9;
                    } else {
                      break L10;
                    }
                  }
                }
                stackOut_25_0 = (lp) var4_ref;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("rc.E(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          L13: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 1 + 41);
        }
        return stackIn_26_0;
    }

    final tn d() {
        qq var1_ref = null;
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        do {
            var1_ref = (qq) (Object) ((rc) this).field_n.a((byte) -71);
            if (var1_ref == null) {
                if (var2 == 0) {
                    return null;
                }
                return (tn) (Object) var1_ref.field_K;
            }
        } while (var1_ref.field_K == null);
        return (tn) (Object) var1_ref.field_K;
    }

    private final void a(int param0, qq param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ga stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        qq stackIn_10_2 = null;
        ga stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        qq stackIn_11_2 = null;
        ga stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        qq stackIn_12_2 = null;
        int stackIn_12_3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        qq stackOut_9_2 = null;
        ga stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        qq stackOut_11_2 = null;
        int stackOut_11_3 = 0;
        ga stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qq stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param0 == 2105376) {
              L1: {
                if ((4 & ((rc) this).field_m.field_F[param1.field_y]) == 0) {
                  break L1;
                } else {
                  if (param1.field_E < 0) {
                    var4_int = ((rc) this).field_m.field_u[param1.field_y] / ap.field_j;
                    var5 = (1048575 + var4_int - param1.field_j) / var4_int;
                    param1.field_j = 1048575 & param1.field_j + param2 * var4_int;
                    if (var5 > param2) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          if (((rc) this).field_m.field_t[param1.field_y] != 0) {
                            break L3;
                          } else {
                            param1.field_K = al.a(param1.field_M, param1.field_K.f(), param1.field_K.i(), param1.field_K.l());
                            if (!ShatteredPlansClient.field_F) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          param1.field_K = al.a(param1.field_M, param1.field_K.f(), 0, param1.field_K.l());
                          stackOut_9_0 = ((rc) this).field_m;
                          stackOut_9_1 = -2139009338;
                          stackOut_9_2 = (qq) param1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackIn_11_2 = stackOut_9_2;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          stackIn_10_2 = stackOut_9_2;
                          if (param1.field_A.field_k[param1.field_H] >= 0) {
                            stackOut_11_0 = (ga) (Object) stackIn_11_0;
                            stackOut_11_1 = stackIn_11_1;
                            stackOut_11_2 = (qq) (Object) stackIn_11_2;
                            stackOut_11_3 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            stackIn_12_2 = stackOut_11_2;
                            stackIn_12_3 = stackOut_11_3;
                            break L4;
                          } else {
                            stackOut_10_0 = (ga) (Object) stackIn_10_0;
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (qq) (Object) stackIn_10_2;
                            stackOut_10_3 = 1;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            break L4;
                          }
                        }
                        ((ga) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0);
                        break L2;
                      }
                      L5: {
                        if (param1.field_A.field_k[param1.field_H] >= 0) {
                          break L5;
                        } else {
                          param1.field_K.f(-1);
                          break L5;
                        }
                      }
                      param2 = param1.field_j / var4_int;
                      break L1;
                    }
                  } else {
                    param1.field_K.a(param2);
                    return;
                  }
                }
              }
              param1.field_K.a(param2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("rc.F(").append(param0).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param2 + 41);
        }
    }

    private final void a(int[] param0, int param1, qq param2, int param3, byte param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        al var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ga stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        qq stackIn_14_2 = null;
        ga stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        qq stackIn_15_2 = null;
        ga stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qq stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        qq stackOut_13_2 = null;
        ga stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qq stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        ga stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        qq stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if ((4 & ((rc) this).field_m.field_F[param2.field_y]) == 0) {
                    break L3;
                  } else {
                    if (param2.field_E < 0) {
                      var7_int = ((rc) this).field_m.field_u[param2.field_y] / ap.field_j;
                      L4: while (true) {
                        L5: {
                          var8 = (-param2.field_j + 1048575 + var7_int) / var7_int;
                          if (var8 > param3) {
                            break L5;
                          } else {
                            param2.field_K.b(param0, param1, var8);
                            param2.field_j = param2.field_j + (-1048576 + var8 * var7_int);
                            param1 = param1 + var8;
                            param3 = param3 - var8;
                            var9 = ap.field_j / 100;
                            var10 = 262144 / var7_int;
                            var14 = var9;
                            var13 = var10;
                            if (var12 != 0) {
                              if (var13 == var14) {
                                break L1;
                              } else {
                                break L2;
                              }
                            } else {
                              L6: {
                                if (var13 >= var14) {
                                  break L6;
                                } else {
                                  var9 = var10;
                                  break L6;
                                }
                              }
                              L7: {
                                L8: {
                                  var11 = param2.field_K;
                                  if (((rc) this).field_m.field_t[param2.field_y] == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      param2.field_K = al.a(param2.field_M, var11.f(), 0, var11.l());
                                      stackOut_13_0 = ((rc) this).field_m;
                                      stackOut_13_1 = param4 ^ -2139009345;
                                      stackOut_13_2 = (qq) param2;
                                      stackIn_15_0 = stackOut_13_0;
                                      stackIn_15_1 = stackOut_13_1;
                                      stackIn_15_2 = stackOut_13_2;
                                      stackIn_14_0 = stackOut_13_0;
                                      stackIn_14_1 = stackOut_13_1;
                                      stackIn_14_2 = stackOut_13_2;
                                      if (param2.field_A.field_k[param2.field_H] >= 0) {
                                        stackOut_15_0 = (ga) (Object) stackIn_15_0;
                                        stackOut_15_1 = stackIn_15_1;
                                        stackOut_15_2 = (qq) (Object) stackIn_15_2;
                                        stackOut_15_3 = 0;
                                        stackIn_16_0 = stackOut_15_0;
                                        stackIn_16_1 = stackOut_15_1;
                                        stackIn_16_2 = stackOut_15_2;
                                        stackIn_16_3 = stackOut_15_3;
                                        break L9;
                                      } else {
                                        stackOut_14_0 = (ga) (Object) stackIn_14_0;
                                        stackOut_14_1 = stackIn_14_1;
                                        stackOut_14_2 = (qq) (Object) stackIn_14_2;
                                        stackOut_14_3 = 1;
                                        stackIn_16_0 = stackOut_14_0;
                                        stackIn_16_1 = stackOut_14_1;
                                        stackIn_16_2 = stackOut_14_2;
                                        stackIn_16_3 = stackOut_14_3;
                                        break L9;
                                      }
                                    }
                                    ((ga) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_16_2, stackIn_16_3 != 0);
                                    param2.field_K.a(var9, var11.i());
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                param2.field_K = al.a(param2.field_M, var11.f(), var11.i(), var11.l());
                                break L7;
                              }
                              L10: {
                                if (0 <= param2.field_A.field_k[param2.field_H]) {
                                  break L10;
                                } else {
                                  param2.field_K.f(-1);
                                  break L10;
                                }
                              }
                              L11: {
                                var11.g(var9);
                                var11.b(param0, param1, param5 + -param1);
                                if (var11.e()) {
                                  ((rc) this).field_o.a((tn) (Object) var11);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              if (var12 == 0) {
                                continue L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        param2.field_j = param2.field_j + var7_int * param3;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (param4 == 121) {
                  break L1;
                } else {
                  break L2;
                }
              }
              return;
            }
            param2.field_K.b(param0, param1, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var7;
            stackOut_29_1 = new StringBuilder().append("rc.C(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L12;
            }
          }
          L13: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param1).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param2 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L13;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    rc(ga param0) {
        ((rc) this).field_n = new pf();
        ((rc) this).field_o = new vk();
        try {
            ((rc) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "rc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
