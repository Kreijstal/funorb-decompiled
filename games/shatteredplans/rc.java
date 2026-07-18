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
        RuntimeException var1_ref = null;
        Object stackIn_2_0 = null;
        al stackIn_5_0 = null;
        tn stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        tn stackOut_6_0 = null;
        al stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var1 = (qq) (Object) ((rc) this).field_n.d(0);
            if (null != var1) {
              if (null == var1.field_K) {
                stackOut_6_0 = ((rc) this).d();
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = var1.field_K;
                stackIn_5_0 = stackOut_4_0;
                return (tn) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tn) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "rc.B()");
        }
        return stackIn_7_0;
    }

    final int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "rc.H()");
        }
        return stackIn_1_0;
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        qq var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((rc) this).field_o.a(param0);
            var3 = (qq) (Object) ((rc) this).field_n.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var3) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((rc) this).field_m.a((byte) 124, var3)) {
                          break L4;
                        } else {
                          var2_int = param0;
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (~var3.field_p <= ~var2_int) {
                                  break L7;
                                } else {
                                  this.a(2105376, var3, var3.field_p);
                                  var2_int = var2_int - var3.field_p;
                                  if (!((rc) this).field_m.a(0, (int[]) null, 2, var3, var2_int)) {
                                    continue L5;
                                  } else {
                                    if (var4 != 0) {
                                      break L6;
                                    } else {
                                      if (var4 == 0) {
                                        break L4;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                              this.a(2105376, var3, var2_int);
                              break L6;
                            }
                            var3.field_p = var3.field_p - var2_int;
                            break L4;
                          }
                        }
                      }
                      var3 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "rc.D(" + param0 + ')');
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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((rc) this).field_o.b(param0, param1, param2);
            var6 = (qq) (Object) ((rc) this).field_n.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var6) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L2;
                    } else {
                      stackOut_4_0 = ((rc) this).field_m.a((byte) 122, var6);
                      stackIn_6_0 = stackOut_4_0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (!stackIn_6_0) {
                              break L6;
                            } else {
                              if (var7 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4_int = param1;
                          var5 = param2;
                          L7: while (true) {
                            if (~var6.field_p <= ~var5) {
                              this.a(param0, var4_int, var6, var5, (byte) 121, var4_int + var5);
                              var6.field_p = var6.field_p - var5;
                              break L5;
                            } else {
                              this.a(param0, var4_int, var6, var6.field_p, (byte) 121, var4_int + var5);
                              var5 = var5 - var6.field_p;
                              var4_int = var4_int + var6.field_p;
                              stackOut_10_0 = ((rc) this).field_m.a(var4_int, param0, 2, var6, var5);
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var7 != 0) {
                                continue L4;
                              } else {
                                if (stackIn_11_0) {
                                  break L5;
                                } else {
                                  continue L7;
                                }
                              }
                            }
                          }
                        }
                        var6 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("rc.G(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ')');
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
        b stackIn_6_0 = null;
        b stackIn_14_0 = null;
        jh stackIn_20_0 = null;
        qk stackIn_20_1 = null;
        StringBuilder stackIn_20_2 = null;
        jh stackIn_22_0 = null;
        qk stackIn_22_1 = null;
        StringBuilder stackIn_22_2 = null;
        jh stackIn_23_0 = null;
        qk stackIn_23_1 = null;
        StringBuilder stackIn_23_2 = null;
        String stackIn_23_3 = null;
        lp stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        b stackOut_5_0 = null;
        b stackOut_13_0 = null;
        jh stackOut_19_0 = null;
        qk stackOut_19_1 = null;
        StringBuilder stackOut_19_2 = null;
        jh stackOut_22_0 = null;
        qk stackOut_22_1 = null;
        StringBuilder stackOut_22_2 = null;
        String stackOut_22_3 = null;
        jh stackOut_20_0 = null;
        qk stackOut_20_1 = null;
        StringBuilder stackOut_20_2 = null;
        String stackOut_20_3 = null;
        lp stackOut_32_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
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
              L3: {
                L4: {
                  if (4 <= var11_int) {
                    break L4;
                  } else {
                    stackOut_5_0 = new b(var11_int * (5 + dm.field_d[var11_int].field_z) + 40, var7.field_i - -var8 - -(dm.field_d[var11_int].field_w / 2), dm.field_d[var11_int].field_z, 35 + -(dm.field_d[var11_int].field_w / 2), 2, 2105376);
                    stackIn_14_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        var12_ref_b = stackIn_6_0;
                        var4_ref.a((vd) (Object) var12_ref_b, 8);
                        var13_int = param1.field_r + param1.field_u[var11_int];
                        if (var13_int < 0) {
                          var13_int = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var14_ref = new qk((dm.field_d[var11_int].field_z + 5) * var11_int + 40, dm.field_d[var11_int].field_w + var7.field_i - -var8, dm.field_d[var11_int].field_z, rs.field_Cb.field_J, Integer.toString(var13_int));
                        var4_ref.a((vd) (Object) var14_ref, 8);
                        var15_ref = new ff(40 - -(var11_int * (5 + dm.field_d[var11_int].field_z)), var7.field_i + var8, dm.field_d[var11_int]);
                        var4_ref.a((vd) (Object) var15_ref, 8);
                        var16_ref = ne.field_m[var11_int];
                        if (0 != param1.field_u[var11_int]) {
                          break L6;
                        } else {
                          var16_ref = var16_ref + " " + sg.field_yb;
                          break L6;
                        }
                      }
                      var15_ref.field_o = var16_ref;
                      var14_ref.field_o = var16_ref;
                      var12_ref_b.field_o = var16_ref;
                      var11_int++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_13_0 = new b(dm.field_d[0].field_z * 4 - -60, var8 + (var7.field_i - -(dm.field_d[0].field_w / 2)), k.field_d.field_z, -(dm.field_d[0].field_w / 2) + 35, 2, 534312);
                stackIn_14_0 = stackOut_13_0;
                break L3;
              }
              L7: {
                var11 = stackIn_14_0;
                var4_ref.a((vd) (Object) var11, 8);
                var12 = param1.field_r;
                if (var12 >= 0) {
                  break L7;
                } else {
                  var12 = 0;
                  break L7;
                }
              }
              L8: {
                if (param0 > 117) {
                  break L8;
                } else {
                  lp discarded$1 = rc.a((byte) -57, (sd) null, (em) null, true);
                  break L8;
                }
              }
              L9: {
                var13 = new qk(20 - -(4 * dm.field_d[0].field_z) + 40, dm.field_d[0].field_w + (var7.field_i - -var8), k.field_d.field_z, rs.field_Cb.field_J, Integer.toString(var12));
                var4_ref.a((vd) (Object) var13, 8);
                var14 = new ff(20 - (-(4 * dm.field_d[0].field_z) - 40), var8 + (var7.field_i + -1), k.field_d);
                var4_ref.a((vd) (Object) var14, 8);
                var14.field_o = si.field_w;
                var13.field_o = si.field_w;
                var11.field_o = si.field_w;
                var15 = new qk(54 - -(dm.field_d[0].field_z * 4), var7.field_i + (var8 + dm.field_d[0].field_w), "=");
                var4_ref.a((vd) (Object) var15, 8);
                var16 = new jh(4 * dm.field_d[0].field_z + 20 + 40 - (-5 + -k.field_d.field_z), var7.field_i + 3, aq.field_i.field_z, aq.field_i.field_w, -1, aq.field_i, (String) null, -1, -1, hq.field_a, (String) null, -1);
                var16.field_h = (Object) (Object) param1;
                var4_ref.a((vd) (Object) var16, 8);
                var17 = new qk(var16.field_k, 29 + var16.field_t, var16.field_m, rs.field_Cb.field_J, Integer.toString(param1.field_x));
                var17.field_h = (Object) (Object) param1;
                var4_ref.a((vd) (Object) var17, 8);
                stackOut_19_0 = (jh) var16;
                stackOut_19_1 = (qk) var17;
                stackOut_19_2 = new StringBuilder().append(hd.field_j).append(" ");
                stackIn_22_0 = stackOut_19_0;
                stackIn_22_1 = stackOut_19_1;
                stackIn_22_2 = stackOut_19_2;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                stackIn_20_2 = stackOut_19_2;
                if (1 == param1.field_x) {
                  stackOut_22_0 = (jh) (Object) stackIn_22_0;
                  stackOut_22_1 = (qk) (Object) stackIn_22_1;
                  stackOut_22_2 = (StringBuilder) (Object) stackIn_22_2;
                  stackOut_22_3 = ad.field_a;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  stackIn_23_2 = stackOut_22_2;
                  stackIn_23_3 = stackOut_22_3;
                  break L9;
                } else {
                  stackOut_20_0 = (jh) (Object) stackIn_20_0;
                  stackOut_20_1 = (qk) (Object) stackIn_20_1;
                  stackOut_20_2 = (StringBuilder) (Object) stackIn_20_2;
                  stackOut_20_3 = re.a(d.field_c, 4371, new String[1]);
                  stackIn_23_0 = stackOut_20_0;
                  stackIn_23_1 = stackOut_20_1;
                  stackIn_23_2 = stackOut_20_2;
                  stackIn_23_3 = stackOut_20_3;
                  break L9;
                }
              }
              stackIn_23_1.field_o = stackIn_23_3;
              stackIn_23_0.field_o = stackIn_23_3;
              var18 = 0;
              L10: while (true) {
                L11: {
                  if (~var18 <= ~param2.field_d.length) {
                    break L11;
                  } else {
                    L12: {
                      if (param2.field_d[var18] == null) {
                        param2.field_d[var18] = var16;
                        param2.field_f[var18] = var4_ref;
                        param2.field_i[var18] = var17;
                        if (var19 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    var18++;
                    if (var19 == 0) {
                      continue L10;
                    } else {
                      break L11;
                    }
                  }
                }
                stackOut_32_0 = (lp) var4_ref;
                stackIn_33_0 = stackOut_32_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var4 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var4;
            stackOut_34_1 = new StringBuilder().append("rc.E(").append(param0).append(',');
            stackIn_37_0 = stackOut_34_0;
            stackIn_37_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L13;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_38_0 = stackOut_35_0;
              stackIn_38_1 = stackOut_35_1;
              stackIn_38_2 = stackOut_35_2;
              break L13;
            }
          }
          L14: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L14;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L14;
            }
          }
          throw r.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + ',' + param3 + ')');
        }
        return stackIn_33_0;
    }

    final tn d() {
        qq var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        Object stackIn_6_0 = null;
        al stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        al stackOut_10_0 = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: while (true) {
            L1: {
              var1 = (qq) (Object) ((rc) this).field_n.a((byte) -71);
              if (null != var1) {
                if (var1.field_K != null) {
                  break L1;
                } else {
                  continue L0;
                }
              } else {
                if (var2 != 0) {
                  break L1;
                } else {
                  stackOut_5_0 = null;
                  stackIn_6_0 = stackOut_5_0;
                  return (tn) (Object) stackIn_6_0;
                }
              }
            }
            stackOut_10_0 = var1.field_K;
            stackIn_11_0 = stackOut_10_0;
            return (tn) (Object) stackIn_11_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "rc.A()");
        }
    }

    private final void a(int param0, qq param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ga stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qq stackIn_16_2 = null;
        ga stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qq stackIn_18_2 = null;
        ga stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        qq stackIn_20_2 = null;
        ga stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        qq stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qq stackOut_15_2 = null;
        ga stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        qq stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        ga stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qq stackOut_16_2 = null;
        ga stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        qq stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                    if (~var5 < ~param2) {
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
                          stackOut_15_0 = ((rc) this).field_m;
                          stackOut_15_1 = -2139009338;
                          stackOut_15_2 = (qq) param1;
                          stackIn_20_0 = stackOut_15_0;
                          stackIn_20_1 = stackOut_15_1;
                          stackIn_20_2 = stackOut_15_2;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          stackIn_16_2 = stackOut_15_2;
                          if (param1.field_A.field_k[param1.field_H] >= 0) {
                            stackOut_20_0 = (ga) (Object) stackIn_20_0;
                            stackOut_20_1 = stackIn_20_1;
                            stackOut_20_2 = (qq) (Object) stackIn_20_2;
                            stackOut_20_3 = 0;
                            stackIn_21_0 = stackOut_20_0;
                            stackIn_21_1 = stackOut_20_1;
                            stackIn_21_2 = stackOut_20_2;
                            stackIn_21_3 = stackOut_20_3;
                            break L4;
                          } else {
                            stackOut_16_0 = (ga) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = (qq) (Object) stackIn_16_2;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            stackOut_18_0 = (ga) (Object) stackIn_18_0;
                            stackOut_18_1 = stackIn_18_1;
                            stackOut_18_2 = (qq) (Object) stackIn_18_2;
                            stackOut_18_3 = 1;
                            stackIn_21_0 = stackOut_18_0;
                            stackIn_21_1 = stackOut_18_1;
                            stackIn_21_2 = stackOut_18_2;
                            stackIn_21_3 = stackOut_18_3;
                            break L4;
                          }
                        }
                        ((ga) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_21_3 != 0);
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
                    break L1;
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
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("rc.F(").append(param0).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ')');
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
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        ga stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qq stackIn_16_2 = null;
        ga stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        qq stackIn_18_2 = null;
        ga stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        qq stackIn_20_2 = null;
        ga stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        qq stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        ga stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        qq stackOut_15_2 = null;
        ga stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        qq stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        ga stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        qq stackOut_16_2 = null;
        ga stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        qq stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        byte stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((4 & ((rc) this).field_m.field_F[param2.field_y]) == 0) {
                  break L2;
                } else {
                  if (param2.field_E < 0) {
                    var7_int = ((rc) this).field_m.field_u[param2.field_y] / ap.field_j;
                    L3: while (true) {
                      L4: {
                        var8 = (-param2.field_j + 1048575 + var7_int) / var7_int;
                        if (var8 > param3) {
                          break L4;
                        } else {
                          param2.field_K.b(param0, param1, var8);
                          param2.field_j = param2.field_j + (-1048576 + var8 * var7_int);
                          param1 = param1 + var8;
                          param3 = param3 - var8;
                          var9 = ap.field_j / 100;
                          var10 = 262144 / var7_int;
                          stackOut_9_0 = var10;
                          stackOut_9_1 = var9;
                          stackIn_34_0 = stackOut_9_0;
                          stackIn_34_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var12 != 0) {
                            break L1;
                          } else {
                            L5: {
                              if (stackIn_10_0 >= stackIn_10_1) {
                                break L5;
                              } else {
                                var9 = var10;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var11 = param2.field_K;
                                if (((rc) this).field_m.field_t[param2.field_y] == 0) {
                                  break L7;
                                } else {
                                  L8: {
                                    param2.field_K = al.a(param2.field_M, var11.f(), 0, var11.l());
                                    stackOut_15_0 = ((rc) this).field_m;
                                    stackOut_15_1 = param4 ^ -2139009345;
                                    stackOut_15_2 = (qq) param2;
                                    stackIn_20_0 = stackOut_15_0;
                                    stackIn_20_1 = stackOut_15_1;
                                    stackIn_20_2 = stackOut_15_2;
                                    stackIn_16_0 = stackOut_15_0;
                                    stackIn_16_1 = stackOut_15_1;
                                    stackIn_16_2 = stackOut_15_2;
                                    if (param2.field_A.field_k[param2.field_H] >= 0) {
                                      stackOut_20_0 = (ga) (Object) stackIn_20_0;
                                      stackOut_20_1 = stackIn_20_1;
                                      stackOut_20_2 = (qq) (Object) stackIn_20_2;
                                      stackOut_20_3 = 0;
                                      stackIn_21_0 = stackOut_20_0;
                                      stackIn_21_1 = stackOut_20_1;
                                      stackIn_21_2 = stackOut_20_2;
                                      stackIn_21_3 = stackOut_20_3;
                                      break L8;
                                    } else {
                                      stackOut_16_0 = (ga) (Object) stackIn_16_0;
                                      stackOut_16_1 = stackIn_16_1;
                                      stackOut_16_2 = (qq) (Object) stackIn_16_2;
                                      stackIn_18_0 = stackOut_16_0;
                                      stackIn_18_1 = stackOut_16_1;
                                      stackIn_18_2 = stackOut_16_2;
                                      stackOut_18_0 = (ga) (Object) stackIn_18_0;
                                      stackOut_18_1 = stackIn_18_1;
                                      stackOut_18_2 = (qq) (Object) stackIn_18_2;
                                      stackOut_18_3 = 1;
                                      stackIn_21_0 = stackOut_18_0;
                                      stackIn_21_1 = stackOut_18_1;
                                      stackIn_21_2 = stackOut_18_2;
                                      stackIn_21_3 = stackOut_18_3;
                                      break L8;
                                    }
                                  }
                                  ((ga) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, stackIn_21_3 != 0);
                                  param2.field_K.a(var9, var11.i());
                                  if (var12 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              param2.field_K = al.a(param2.field_M, var11.f(), var11.i(), var11.l());
                              break L6;
                            }
                            L9: {
                              if (0 <= param2.field_A.field_k[param2.field_H]) {
                                break L9;
                              } else {
                                param2.field_K.f(-1);
                                break L9;
                              }
                            }
                            L10: {
                              var11.g(var9);
                              var11.b(param0, param1, param5 + -param1);
                              if (var11.e()) {
                                ((rc) this).field_o.a((tn) (Object) var11);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (var12 == 0) {
                              continue L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      param2.field_j = param2.field_j + var7_int * param3;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_33_0 = param4;
              stackOut_33_1 = 121;
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              break L1;
            }
            if (stackIn_34_0 == stackIn_34_1) {
              param2.field_K.b(param0, param1, param3);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var7 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var7;
            stackOut_38_1 = new StringBuilder().append("rc.C(");
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param0 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L11;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L11;
            }
          }
          L12: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param1).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    rc(ga param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((rc) this).field_n = new pf();
        ((rc) this).field_o = new vk();
        try {
          L0: {
            ((rc) this).field_m = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("rc.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    static {
    }
}
