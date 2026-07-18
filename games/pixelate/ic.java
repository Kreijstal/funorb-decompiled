/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ic extends ka implements vo {
    static String[] field_bb;
    private qm field_ab;

    private final qm a(String param0, byte param1, fn param2) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qm stackIn_1_0 = null;
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
        qm stackOut_0_0 = null;
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
            var4 = new qm(param0, param2);
            var4.field_y = (eb) (Object) new ad();
            var5 = ((ic) this).field_C + -6;
            ((ic) this).field_C = ((ic) this).field_C + 38;
            var4.a(-16 + (((ic) this).field_E - 14), (byte) 64, var5, 15, 30);
            ((ic) this).b((ng) (Object) var4, 80);
            ((ic) this).c((byte) 121);
            stackOut_0_0 = (qm) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4_ref;
            stackOut_2_1 = new StringBuilder().append("ic.M(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-126).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 == ((ic) this).field_ab) {
                int discarded$2 = 1;
                this.g();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 11) {
                break L2;
              } else {
                ic.a(-85, true, 100, false);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var6;
            stackOut_6_1 = new StringBuilder().append("ic.Q(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g() {
        if (!(((ic) this).field_N)) {
            return;
        }
        ((ic) this).field_N = false;
    }

    ic(kn param0, fp param1) {
        super(param0, 200, 150);
        Object var3 = null;
        ng var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (jg.field_F == param1) {
                var3 = (Object) (Object) mn.field_a;
                break L1;
              } else {
                if (ia.field_c != param1) {
                  if (param1 != fh.field_Q) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) ha.field_k;
                    ((ic) this).field_C = ((ic) this).field_C + 30;
                    break L1;
                  }
                } else {
                  ((ic) this).field_C = ((ic) this).field_C + 10;
                  var3 = (Object) (Object) l.field_o;
                  if (!ke.a(false)) {
                    break L1;
                  } else {
                    ((ic) this).field_C = ((ic) this).field_C + 20;
                    var3 = (Object) (Object) co.field_e;
                    break L1;
                  }
                }
              }
            }
            var4 = new ng((String) var3, (fn) null);
            var4.field_z = 0;
            var4.field_E = ((ic) this).field_E;
            var4.field_C = 80;
            var4.field_p = 50;
            var4.field_y = (eb) (Object) new uc(ep.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
            ((ic) this).b(var4, 80);
            ((ic) this).field_ab = this.a(od.field_Hb, (byte) -126, (fn) this);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("ic.<init>(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        ak var5 = null;
        ak var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        ak var15 = null;
        String var16 = null;
        ak var17 = null;
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        ak stackIn_33_0 = null;
        ak stackIn_34_0 = null;
        ak stackIn_35_0 = null;
        String stackIn_35_1 = null;
        ak stackIn_36_0 = null;
        ak stackIn_37_0 = null;
        ak stackIn_38_0 = null;
        String stackIn_38_1 = null;
        ak stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        ak stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        ak stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        ak stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ak stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        ak stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        ak stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        ak stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        ak stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        ak stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        ak stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        ak stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        ak stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        ak stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        ak stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        ak stackOut_32_0 = null;
        ak stackOut_34_0 = null;
        String stackOut_34_1 = null;
        ak stackOut_33_0 = null;
        String stackOut_33_1 = null;
        ak stackOut_35_0 = null;
        ak stackOut_37_0 = null;
        String stackOut_37_1 = null;
        ak stackOut_36_0 = null;
        String stackOut_36_1 = null;
        String stackOut_24_0 = null;
        String stackOut_23_0 = null;
        ak stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        ak stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ak stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        ak stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        ak stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        ak stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        ak stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        ak stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        ak stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        ak stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        ak stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        ak stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        ak stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        ak stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        ak stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              cm.b(vn.field_g, param2 ^ 4743);
              if (bn.field_S != null) {
                L2: {
                  L3: {
                    wm.field_d.field_nb = 0;
                    var15 = wm.field_d;
                    var17 = var15;
                    var17.field_K = 0;
                    var5 = ep.field_a;
                    ep.field_a.field_nb = 0;
                    var5.field_K = 0;
                    var6 = nk.field_e;
                    nk.field_e.field_nb = 0;
                    var6.field_K = 0;
                    vp.field_Qb.field_cb = vn.field_d.toUpperCase();
                    var7 = (ai.field_A.field_K + 2) / 2;
                    nk.field_e.a(ai.field_A.field_nb - 40, 40, 0, 256, -2 + var7);
                    ep.field_a.a(ai.field_A.field_nb - 40, 40, var7, 256, ai.field_A.field_K + -var7);
                    if (ia.field_a.length != 1) {
                      break L3;
                    } else {
                      if (ia.field_a[0] != 2) {
                        break L3;
                      } else {
                        var8 = 0;
                        break L2;
                      }
                    }
                  }
                  var8 = 0;
                  var9_int = 0;
                  var10 = 0;
                  L4: while (true) {
                    L5: {
                      if (var10 >= ia.field_a.length) {
                        break L5;
                      } else {
                        L6: {
                          if ((qm.field_J[var10 / 8] & 1 << (7 & var10)) == 0) {
                            stackOut_10_0 = 0;
                            stackIn_11_0 = stackOut_10_0;
                            break L6;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_11_0 = stackOut_9_0;
                            break L6;
                          }
                        }
                        L7: {
                          var11_int = stackIn_11_0;
                          if (var11_int == 0) {
                            break L7;
                          } else {
                            var9_int++;
                            break L7;
                          }
                        }
                        L8: {
                          if (var11_int == 0) {
                            break L8;
                          } else {
                            if (2 != ia.field_a[var10]) {
                              var8 = 1;
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var10++;
                        continue L4;
                      }
                    }
                    if (0 == var9_int) {
                      var8 = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                ep.field_a.field_rb = true;
                if (!rl.field_r) {
                  L9: {
                    stackOut_32_0 = ep.field_a;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (var8 == 0) {
                      stackOut_34_0 = (ak) (Object) stackIn_34_0;
                      stackOut_34_1 = bc.field_n;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L9;
                    } else {
                      stackOut_33_0 = (ak) (Object) stackIn_33_0;
                      stackOut_33_1 = qo.field_x;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_35_0.field_cb = ((String) (Object) stackIn_35_1).toUpperCase();
                    stackOut_35_0 = an.field_a;
                    stackIn_37_0 = stackOut_35_0;
                    stackIn_36_0 = stackOut_35_0;
                    if (var8 != 0) {
                      stackOut_37_0 = (ak) (Object) stackIn_37_0;
                      stackOut_37_1 = oh.field_d;
                      stackIn_38_0 = stackOut_37_0;
                      stackIn_38_1 = stackOut_37_1;
                      break L10;
                    } else {
                      stackOut_36_0 = (ak) (Object) stackIn_36_0;
                      stackOut_36_1 = vk.field_sb;
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_38_1 = stackOut_36_1;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_38_0.field_cb = sd.a(stackIn_38_1, 59, new String[1]);
                    gk.field_kb.field_rb = true;
                    nk.field_e.field_cb = dn.field_b;
                    pb.field_f = true;
                    if (null != h.field_Z) {
                      L12: {
                        ib.field_b = false;
                        if (null == kf.field_o) {
                          lc.field_t = new boolean[fj.field_b];
                          kf.field_o = new byte[fj.field_b];
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      pb.field_f = false;
                      var13 = 0;
                      var9_int = var13;
                      L13: while (true) {
                        if (fj.field_b <= var13) {
                          no.a(fj.field_b, 0, (byte) 91, true, -1, -1, bn.field_S, -1);
                          if (wo.field_h < 2) {
                            break L11;
                          } else {
                            if (bc.field_m[12]) {
                              pb.field_f = true;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        } else {
                          lc.field_t[var13] = false;
                          var13++;
                          continue L13;
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (!pb.field_f) {
                    ep.field_a.field_rb = false;
                    if (ep.field_a.field_R) {
                      L14: {
                        var9 = null;
                        if (!ib.field_b) {
                          break L14;
                        } else {
                          var9 = (Object) (Object) ("<col=A00000>" + pk.field_e + "</col>");
                          var11 = var9;
                          var9 = var11;
                          var11 = var9;
                          var9 = var11;
                          break L14;
                        }
                      }
                      var10 = 0;
                      L15: while (true) {
                        if (var10 >= fj.field_b) {
                          up.field_o = "<col=A00000>" + lo.field_Gb + "<br>" + ij.field_p + (String) var9;
                          break L1;
                        } else {
                          L16: {
                            if (lc.field_t[var10]) {
                              var11_ref = "<col=A00000>" + jk.field_e[var10] + "</col>";
                              var9 = (Object) (Object) var11_ref;
                              var9 = (Object) (Object) var11_ref;
                              if (var9 != null) {
                                var9 = (Object) (Object) ((String) var9 + ", " + var11_ref);
                                break L16;
                              } else {
                                var9 = (Object) (Object) var11_ref;
                                break L16;
                              }
                            } else {
                              break L16;
                            }
                          }
                          var10++;
                          continue L15;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  L17: {
                    an.field_a.field_cb = mj.field_g;
                    gk.field_kb.field_rb = false;
                    if (var8 != 0) {
                      stackOut_24_0 = ag.field_o;
                      stackIn_25_0 = stackOut_24_0;
                      break L17;
                    } else {
                      stackOut_23_0 = oi.field_b;
                      stackIn_25_0 = stackOut_23_0;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var9 = (Object) (Object) var16;
                    var10 = nk.field_e.field_Db.c(var16) + nk.field_e.field_Db.a('.') * 3;
                    if (16 != (48 & rb.field_o)) {
                      break L18;
                    } else {
                      var9 = (Object) (Object) (var16 + ".");
                      break L18;
                    }
                  }
                  L19: {
                    nk.field_e.field_C = (nk.field_e.field_K - var10) / 2;
                    nk.field_e.field_Bb = 0;
                    if ((rb.field_o & 48) != 32) {
                      break L19;
                    } else {
                      var9 = (Object) (Object) ((String) var9 + "..");
                      break L19;
                    }
                  }
                  L20: {
                    if ((rb.field_o & 48) != 48) {
                      break L20;
                    } else {
                      var9 = (Object) (Object) ((String) var9 + "...");
                      break L20;
                    }
                  }
                  nk.field_e.field_cb = (String) var9;
                  ep.field_a.field_cb = fa.field_f.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackOut_65_0 = ff.field_h;
                stackOut_65_1 = -28476;
                stackIn_69_0 = stackOut_65_0;
                stackIn_69_1 = stackOut_65_1;
                stackIn_66_0 = stackOut_65_0;
                stackIn_66_1 = stackOut_65_1;
                if (!param1) {
                  break L22;
                } else {
                  stackOut_66_0 = (ak) (Object) stackIn_66_0;
                  stackOut_66_1 = stackIn_66_1;
                  stackIn_69_0 = stackOut_66_0;
                  stackIn_69_1 = stackOut_66_1;
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  if (param3) {
                    break L22;
                  } else {
                    stackOut_67_0 = (ak) (Object) stackIn_67_0;
                    stackOut_67_1 = stackIn_67_1;
                    stackIn_69_0 = stackOut_67_0;
                    stackIn_69_1 = stackOut_67_1;
                    stackIn_68_0 = stackOut_67_0;
                    stackIn_68_1 = stackOut_67_1;
                    if (bm.field_o) {
                      break L22;
                    } else {
                      stackOut_68_0 = (ak) (Object) stackIn_68_0;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = 1;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_70_2 = stackOut_68_2;
                      break L21;
                    }
                  }
                }
              }
              stackOut_69_0 = (ak) (Object) stackIn_69_0;
              stackOut_69_1 = stackIn_69_1;
              stackOut_69_2 = 0;
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            }
            L23: {
              L24: {
                ((ak) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2 != 0);
                stackOut_70_0 = ai.field_A;
                stackOut_70_1 = param2 + -28479;
                stackIn_74_0 = stackOut_70_0;
                stackIn_74_1 = stackOut_70_1;
                stackIn_71_0 = stackOut_70_0;
                stackIn_71_1 = stackOut_70_1;
                if (!param1) {
                  break L24;
                } else {
                  stackOut_71_0 = (ak) (Object) stackIn_71_0;
                  stackOut_71_1 = stackIn_71_1;
                  stackIn_74_0 = stackOut_71_0;
                  stackIn_74_1 = stackOut_71_1;
                  stackIn_72_0 = stackOut_71_0;
                  stackIn_72_1 = stackOut_71_1;
                  if (param3) {
                    break L24;
                  } else {
                    stackOut_72_0 = (ak) (Object) stackIn_72_0;
                    stackOut_72_1 = stackIn_72_1;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_73_0 = stackOut_72_0;
                    stackIn_73_1 = stackOut_72_1;
                    if (bm.field_o) {
                      break L24;
                    } else {
                      stackOut_73_0 = (ak) (Object) stackIn_73_0;
                      stackOut_73_1 = stackIn_73_1;
                      stackOut_73_2 = 1;
                      stackIn_75_0 = stackOut_73_0;
                      stackIn_75_1 = stackOut_73_1;
                      stackIn_75_2 = stackOut_73_2;
                      break L23;
                    }
                  }
                }
              }
              stackOut_74_0 = (ak) (Object) stackIn_74_0;
              stackOut_74_1 = stackIn_74_1;
              stackOut_74_2 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L23;
            }
            L25: {
              ((ak) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2 != 0);
              if (param2 == 3) {
                break L25;
              } else {
                field_bb = null;
                break L25;
              }
            }
            L26: {
              L27: {
                stackOut_77_0 = ra.field_e;
                stackOut_77_1 = param2 ^ -28473;
                stackIn_81_0 = stackOut_77_0;
                stackIn_81_1 = stackOut_77_1;
                stackIn_78_0 = stackOut_77_0;
                stackIn_78_1 = stackOut_77_1;
                if (!param1) {
                  break L27;
                } else {
                  stackOut_78_0 = (ak) (Object) stackIn_78_0;
                  stackOut_78_1 = stackIn_78_1;
                  stackIn_81_0 = stackOut_78_0;
                  stackIn_81_1 = stackOut_78_1;
                  stackIn_79_0 = stackOut_78_0;
                  stackIn_79_1 = stackOut_78_1;
                  if (param3) {
                    break L27;
                  } else {
                    stackOut_79_0 = (ak) (Object) stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    stackIn_80_0 = stackOut_79_0;
                    stackIn_80_1 = stackOut_79_1;
                    if (!bm.field_o) {
                      break L27;
                    } else {
                      stackOut_80_0 = (ak) (Object) stackIn_80_0;
                      stackOut_80_1 = stackIn_80_1;
                      stackOut_80_2 = 1;
                      stackIn_82_0 = stackOut_80_0;
                      stackIn_82_1 = stackOut_80_1;
                      stackIn_82_2 = stackOut_80_2;
                      break L26;
                    }
                  }
                }
              }
              stackOut_81_0 = (ak) (Object) stackIn_81_0;
              stackOut_81_1 = stackIn_81_1;
              stackOut_81_2 = 0;
              stackIn_82_0 = stackOut_81_0;
              stackIn_82_1 = stackOut_81_1;
              stackIn_82_2 = stackOut_81_2;
              break L26;
            }
            L28: {
              ((ak) (Object) stackIn_82_0).a(stackIn_82_1, stackIn_82_2 != 0);
              nd.field_b.field_g.b((byte) -108);
              if (null == bn.field_S) {
                break L28;
              } else {
                L29: {
                  if (0 == gk.field_kb.field_P) {
                    break L29;
                  } else {
                    fb.a(1, param0);
                    break L29;
                  }
                }
                L30: {
                  if (ep.field_a.field_P == 0) {
                    break L30;
                  } else {
                    if (!rl.field_r) {
                      r.a(param2 + -3, param0);
                      break L30;
                    } else {
                      wo.c(-1, param0);
                      break L30;
                    }
                  }
                }
                be.a(true, bn.field_S, param0, -1);
                break L28;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var4, "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e() {
        field_bb = null;
        int var1 = -30;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = new String[]{"Online head-to-head rated games", "Unlimited Challenge Mode levels", "Complete all fifty puzzles", "Full screen mode"};
    }
}
