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
        qq var1 = (qq) (Object) ((rc) this).field_n.d(0);
        if (var1 == null) {
            return null;
        }
        if (null != var1.field_K) {
            return (tn) (Object) var1.field_K;
        }
        return ((rc) this).d();
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
          if (var3 == null) {
            return;
          } else {
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
                      break L1;
                    }
                  }
                }
              }
            }
            var3 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
            continue L0;
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qq var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((rc) this).field_o.b(param0, param1, param2);
            var6 = (qq) (Object) ((rc) this).field_n.d(0);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (!((rc) this).field_m.a((byte) 122, var6)) {
                    var4_int = param1;
                    var5 = param2;
                    L3: while (true) {
                      if (var6.field_p >= var5) {
                        this.a(param0, var4_int, var6, var5, (byte) 121, var4_int + var5);
                        var6.field_p = var6.field_p - var5;
                        break L2;
                      } else {
                        this.a(param0, var4_int, var6, var6.field_p, (byte) 121, var4_int + var5);
                        var5 = var5 - var6.field_p;
                        var4_int = var4_int + var6.field_p;
                        if (((rc) this).field_m.a(var4_int, param0, 2, var6, var5)) {
                          break L2;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var6 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("rc.G(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
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
        lp stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        lp stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var19 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_ref = new lp(0, 0, 209, 70);
              var4_ref.field_h = (Object) (Object) param1;
              var5 = new ff(-5 + (40 - (-((5 + dm.field_d[0].field_z) * 4) + -k.field_d.field_z)), rs.field_Cb.field_J + -7, fj.field_r);
              var4_ref.a((vd) (Object) var5, 8);
              var6 = param1.field_q.field_I;
              if (!param3) {
                break L1;
              } else {
                var6 = var6 + " (" + param1.field_o.field_t + ")";
                break L1;
              }
            }
            var7 = new kb(0, 0, 209, param1.field_o.field_k, var6, 16777215, false);
            var4_ref.a((vd) (Object) var7, 8);
            var8 = 7;
            var9 = new ff(0, var8 + var7.field_i, 35, 35, uk.a(false, param1.field_q));
            var4_ref.a((vd) (Object) var9, 8);
            var10 = new b(40, var8 + (var7.field_i - -dm.field_d[0].field_w), 4 * dm.field_d[0].field_z + 15, 35 + -dm.field_d[0].field_w, 2, 2105376);
            var4_ref.a((vd) (Object) var10, 8);
            var11_int = 0;
            L2: while (true) {
              if (4 <= var11_int) {
                L3: {
                  var11 = new b(dm.field_d[0].field_z * 4 - -60, var8 + (var7.field_i - -(dm.field_d[0].field_w / 2)), k.field_d.field_z, -(dm.field_d[0].field_w / 2) + 35, 2, 534312);
                  var4_ref.a((vd) (Object) var11, 8);
                  var12 = param1.field_r;
                  if (var12 >= 0) {
                    break L3;
                  } else {
                    var12 = 0;
                    break L3;
                  }
                }
                L4: {
                  if (param0 > 117) {
                    break L4;
                  } else {
                    var20 = null;
                    lp discarded$1 = rc.a((byte) -57, (sd) null, (em) null, true);
                    break L4;
                  }
                }
                L5: {
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
                    break L5;
                  } else {
                    stackOut_16_0 = (jh) (Object) stackIn_16_0;
                    stackOut_16_1 = (qk) (Object) stackIn_16_1;
                    stackOut_16_2 = (StringBuilder) (Object) stackIn_16_2;
                    stackOut_16_3 = re.a(d.field_c, 4371, new String[1]);
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    stackIn_18_3 = stackOut_16_3;
                    break L5;
                  }
                }
                stackIn_18_1.field_o = stackIn_18_3;
                stackIn_18_0.field_o = stackIn_18_3;
                var18 = 0;
                L6: while (true) {
                  L7: {
                    if (var18 >= param2.field_d.length) {
                      break L7;
                    } else {
                      if (param2.field_d[var18] == null) {
                        param2.field_d[var18] = var16;
                        param2.field_f[var18] = var4_ref;
                        param2.field_i[var18] = var17;
                        break L7;
                      } else {
                        var18++;
                        continue L6;
                      }
                    }
                  }
                  stackOut_24_0 = (lp) var4_ref;
                  stackIn_25_0 = stackOut_24_0;
                  break L0;
                }
              } else {
                L8: {
                  var12_ref_b = new b(var11_int * (5 + dm.field_d[var11_int].field_z) + 40, var7.field_i - -var8 - -(dm.field_d[var11_int].field_w / 2), dm.field_d[var11_int].field_z, 35 + -(dm.field_d[var11_int].field_w / 2), 2, 2105376);
                  var4_ref.a((vd) (Object) var12_ref_b, 8);
                  var13_int = param1.field_r + param1.field_u[var11_int];
                  if (var13_int < 0) {
                    var13_int = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  var14_ref = new qk((dm.field_d[var11_int].field_z + 5) * var11_int + 40, dm.field_d[var11_int].field_w + var7.field_i - -var8, dm.field_d[var11_int].field_z, rs.field_Cb.field_J, Integer.toString(var13_int));
                  var4_ref.a((vd) (Object) var14_ref, 8);
                  var15_ref = new ff(40 - -(var11_int * (5 + dm.field_d[var11_int].field_z)), var7.field_i + var8, dm.field_d[var11_int]);
                  var4_ref.a((vd) (Object) var15_ref, 8);
                  var16_ref = ne.field_m[var11_int];
                  if (0 != param1.field_u[var11_int]) {
                    break L9;
                  } else {
                    var16_ref = var16_ref + " " + sg.field_yb;
                    break L9;
                  }
                }
                var15_ref.field_o = var16_ref;
                var14_ref.field_o = var16_ref;
                var12_ref_b.field_o = var16_ref;
                var11_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var4;
            stackOut_26_1 = new StringBuilder().append("rc.E(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L10;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L10;
            }
          }
          L11: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw r.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param3 + 41);
        }
        return stackIn_25_0;
    }

    final tn d() {
        qq var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        L0: while (true) {
          var1 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
          if (var1 != null) {
            if (var1.field_K != null) {
              return (tn) (Object) var1.field_K;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(int param0, qq param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ga stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        qq stackIn_9_2 = null;
        ga stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        qq stackIn_10_2 = null;
        ga stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        qq stackIn_11_2 = null;
        int stackIn_11_3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        qq stackOut_8_2 = null;
        ga stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        qq stackOut_10_2 = null;
        int stackOut_10_3 = 0;
        ga stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        qq stackOut_9_2 = null;
        int stackOut_9_3 = 0;
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
              L2: {
                if ((4 & ((rc) this).field_m.field_F[param1.field_y]) == 0) {
                  break L2;
                } else {
                  if (param1.field_E < 0) {
                    var4_int = ((rc) this).field_m.field_u[param1.field_y] / ap.field_j;
                    var5 = (1048575 + var4_int - param1.field_j) / var4_int;
                    param1.field_j = 1048575 & param1.field_j + param2 * var4_int;
                    if (var5 > param2) {
                      break L2;
                    } else {
                      L3: {
                        if (((rc) this).field_m.field_t[param1.field_y] != 0) {
                          L4: {
                            param1.field_K = al.a(param1.field_M, param1.field_K.f(), 0, param1.field_K.l());
                            stackOut_8_0 = ((rc) this).field_m;
                            stackOut_8_1 = -2139009338;
                            stackOut_8_2 = (qq) param1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            stackIn_9_2 = stackOut_8_2;
                            if (param1.field_A.field_k[param1.field_H] >= 0) {
                              stackOut_10_0 = (ga) (Object) stackIn_10_0;
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = (qq) (Object) stackIn_10_2;
                              stackOut_10_3 = 0;
                              stackIn_11_0 = stackOut_10_0;
                              stackIn_11_1 = stackOut_10_1;
                              stackIn_11_2 = stackOut_10_2;
                              stackIn_11_3 = stackOut_10_3;
                              break L4;
                            } else {
                              stackOut_9_0 = (ga) (Object) stackIn_9_0;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = (qq) (Object) stackIn_9_2;
                              stackOut_9_3 = 1;
                              stackIn_11_0 = stackOut_9_0;
                              stackIn_11_1 = stackOut_9_1;
                              stackIn_11_2 = stackOut_9_2;
                              stackIn_11_3 = stackOut_9_3;
                              break L4;
                            }
                          }
                          ((ga) (Object) stackIn_11_0).a(stackIn_11_1, stackIn_11_2, stackIn_11_3 != 0);
                          break L3;
                        } else {
                          param1.field_K = al.a(param1.field_M, param1.field_K.f(), param1.field_K.i(), param1.field_K.l());
                          break L3;
                        }
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
                      break L2;
                    }
                  } else {
                    param1.field_K.a(param2);
                    break L1;
                  }
                }
              }
              param1.field_K.a(param2);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("rc.F(").append(2105376).append(44);
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 41);
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
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
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((4 & ((rc) this).field_m.field_F[param2.field_y]) == 0) {
                break L1;
              } else {
                if (param2.field_E < 0) {
                  var7_int = ((rc) this).field_m.field_u[param2.field_y] / ap.field_j;
                  L2: while (true) {
                    var8 = (-param2.field_j + 1048575 + var7_int) / var7_int;
                    if (var8 > param3) {
                      param2.field_j = param2.field_j + var7_int * param3;
                      break L1;
                    } else {
                      L3: {
                        param2.field_K.b(param0, param1, var8);
                        param2.field_j = param2.field_j + (-1048576 + var8 * var7_int);
                        param1 = param1 + var8;
                        param3 = param3 - var8;
                        var9 = ap.field_j / 100;
                        var10 = 262144 / var7_int;
                        if (var10 >= var9) {
                          break L3;
                        } else {
                          var9 = var10;
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param2.field_K;
                        if (((rc) this).field_m.field_t[param2.field_y] == 0) {
                          param2.field_K = al.a(param2.field_M, var11.f(), var11.i(), var11.l());
                          break L4;
                        } else {
                          L5: {
                            param2.field_K = al.a(param2.field_M, var11.f(), 0, var11.l());
                            stackOut_9_0 = ((rc) this).field_m;
                            stackOut_9_1 = -2139009338;
                            stackOut_9_2 = (qq) param2;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            if (param2.field_A.field_k[param2.field_H] >= 0) {
                              stackOut_11_0 = (ga) (Object) stackIn_11_0;
                              stackOut_11_1 = stackIn_11_1;
                              stackOut_11_2 = (qq) (Object) stackIn_11_2;
                              stackOut_11_3 = 0;
                              stackIn_12_0 = stackOut_11_0;
                              stackIn_12_1 = stackOut_11_1;
                              stackIn_12_2 = stackOut_11_2;
                              stackIn_12_3 = stackOut_11_3;
                              break L5;
                            } else {
                              stackOut_10_0 = (ga) (Object) stackIn_10_0;
                              stackOut_10_1 = stackIn_10_1;
                              stackOut_10_2 = (qq) (Object) stackIn_10_2;
                              stackOut_10_3 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              stackIn_12_1 = stackOut_10_1;
                              stackIn_12_2 = stackOut_10_2;
                              stackIn_12_3 = stackOut_10_3;
                              break L5;
                            }
                          }
                          ((ga) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2, stackIn_12_3 != 0);
                          param2.field_K.a(var9, var11.i());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 <= param2.field_A.field_k[param2.field_H]) {
                          break L6;
                        } else {
                          param2.field_K.f(-1);
                          break L6;
                        }
                      }
                      var11.g(var9);
                      var11.b(param0, param1, param5 + -param1);
                      if (var11.e()) {
                        ((rc) this).field_o.a((tn) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            param2.field_K.b(param0, param1, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("rc.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param1).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param3 + 44 + 121 + 44 + param5 + 41);
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
