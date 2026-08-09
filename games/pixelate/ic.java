/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends ka implements vo {
    static String[] field_bb;
    private qm field_ab;

    private final qm a(String param0, byte param1, fn param2) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        qm stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new qm(param0, param2);
              var4.field_y = (eb) ((Object) new ad());
              var5 = this.field_C + -6;
              this.field_C = this.field_C + 38;
              var4.a(-16 + (this.field_E - 14), (byte) 64, var5, 15, 30);
              if (param1 <= -111) {
                break L1;
              } else {
                field_bb = (String[]) null;
                break L1;
              }
            }
            this.b(var4, 80);
            this.c((byte) 121);
            stackIn_3_0 = (qm) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("ic.M(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == this.field_ab) {
                this.g(true);
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
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("ic.Q(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void g(boolean param0) {
        if (!param0) {
            this.field_ab = (qm) null;
        }
        if (!(this.field_N)) {
            return;
        }
        this.field_N = false;
    }

    ic(kn param0, fp param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ng var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (jg.field_F == param1) {
                var3 = mn.field_a;
                break L1;
              } else {
                if (ia.field_c != param1) {
                  if (param1 != fh.field_Q) {
                    break L1;
                  } else {
                    var3 = ha.field_k;
                    this.field_C = this.field_C + 30;
                    break L1;
                  }
                } else {
                  this.field_C = this.field_C + 10;
                  var3 = l.field_o;
                  if (!ke.a(false)) {
                    break L1;
                  } else {
                    this.field_C = this.field_C + 20;
                    var3 = co.field_e;
                    break L1;
                  }
                }
              }
            }
            var4 = new ng((String) (var3), (fn) null);
            var4.field_z = 0;
            var4.field_E = this.field_E;
            var4.field_C = 80;
            var4.field_p = 50;
            var4.field_y = (eb) ((Object) new uc(ep.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.b(var4, 80);
            this.field_ab = this.a(od.field_Hb, (byte) -126, (fn) (this));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("ic.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, boolean param3) {
        int stackIn_11_0 = 0;
        String stackIn_25_0 = null;
        ak stackIn_34_0 = null;
        ak stackIn_35_0 = null;
        String stackIn_35_1 = null;
        ak stackIn_37_0 = null;
        ak stackIn_38_0 = null;
        String stackIn_38_1 = null;
        ak stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ak stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        ak stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        ak stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        ak stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        ak stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    if (-2 != (ia.field_a.length ^ -1)) {
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
                          if (-1 == (qm.field_J[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                            stackIn_11_0 = 0;
                            break L6;
                          } else {
                            stackIn_11_0 = 1;
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
                    stackIn_34_0 = ep.field_a;

                    if (var8 == 0) {
                      stackIn_35_0 = (ak) ((Object) stackIn_34_0);
                      stackIn_35_1 = bc.field_n;
                      break L9;
                    } else {
                      stackIn_35_0 = (ak) ((Object) stackIn_34_0);
                      stackIn_35_1 = qo.field_x;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_35_0.field_cb = ((String) (Object) stackIn_35_1).toUpperCase();
                    stackIn_37_0 = an.field_a;

                    if (var8 != 0) {
                      stackIn_38_0 = (ak) ((Object) stackIn_37_0);
                      stackIn_38_1 = oh.field_d;
                      break L10;
                    } else {
                      stackIn_38_0 = (ak) ((Object) stackIn_37_0);
                      stackIn_38_1 = vk.field_sb;
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_38_0.field_cb = sd.a(stackIn_38_1, 59, new String[]{ep.field_a.field_cb});
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
                          if (-3 < (wo.field_h ^ -1)) {
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
                          var9 = "<col=A00000>" + pk.field_e + "</col>";
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
                          up.field_o = "<col=A00000>" + lo.field_Gb + "<br>" + ij.field_p + (String) (var9);
                          break L1;
                        } else {
                          L16: {
                            if (lc.field_t[var10]) {
                              var11_ref = "<col=A00000>" + jk.field_e[var10] + "</col>";
                              var9 = var11_ref;
                              var9 = var11_ref;
                              if (var9 != null) {
                                var9 = (String) (var9) + ", " + var11_ref;
                                break L16;
                              } else {
                                var9 = var11_ref;
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
                      stackIn_25_0 = ag.field_o;
                      break L17;
                    } else {
                      stackIn_25_0 = oi.field_b;
                      break L17;
                    }
                  }
                  L18: {
                    var16 = stackIn_25_0;
                    var9 = var16;
                    var9 = var16;
                    var9 = var16;
                    var10 = nk.field_e.field_Db.c(var16) + nk.field_e.field_Db.a('.') * 3;
                    if (16 != (48 & rb.field_o)) {
                      break L18;
                    } else {
                      var9 = var16 + ".";
                      break L18;
                    }
                  }
                  L19: {
                    nk.field_e.field_C = (nk.field_e.field_K - var10) / 2;
                    nk.field_e.field_Bb = 0;
                    if (-33 != (rb.field_o & 48 ^ -1)) {
                      break L19;
                    } else {
                      var9 = (String) (var9) + "..";
                      break L19;
                    }
                  }
                  L20: {
                    if ((rb.field_o & 48) != 48) {
                      break L20;
                    } else {
                      var9 = (String) (var9) + "...";
                      break L20;
                    }
                  }
                  nk.field_e.field_cb = (String) (var9);
                  ep.field_a.field_cb = fa.field_f.toUpperCase();
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L21: {
              L22: {
                stackIn_69_0 = ff.field_h;

                stackIn_69_1 = -28476;

                if (!param1) {
                  break L22;
                } else {
                  stackIn_69_0 = (ak) ((Object) stackIn_69_0);

                  if (param3) {
                    break L22;
                  } else {
                    stackIn_69_0 = (ak) ((Object) stackIn_69_0);

                    if (bm.field_o) {
                      break L22;
                    } else {
                      stackIn_70_0 = (ak) ((Object) stackIn_69_0);
                      stackIn_70_1 = stackIn_69_1;
                      stackIn_70_2 = 1;
                      break L21;
                    }
                  }
                }
              }
              stackIn_70_0 = (ak) ((Object) stackIn_69_0);
              stackIn_70_1 = stackIn_69_1;
              stackIn_70_2 = 0;
              break L21;
            }
            L23: {
              L24: {
                ((ak) (Object) stackIn_70_0).a(stackIn_70_1, stackIn_70_2 != 0);
                stackIn_74_0 = ai.field_A;

                stackIn_74_1 = param2 + -28479;

                if (!param1) {
                  break L24;
                } else {
                  stackIn_74_0 = (ak) ((Object) stackIn_74_0);

                  if (param3) {
                    break L24;
                  } else {
                    stackIn_74_0 = (ak) ((Object) stackIn_74_0);

                    if (bm.field_o) {
                      break L24;
                    } else {
                      stackIn_75_0 = (ak) ((Object) stackIn_74_0);
                      stackIn_75_1 = stackIn_74_1;
                      stackIn_75_2 = 1;
                      break L23;
                    }
                  }
                }
              }
              stackIn_75_0 = (ak) ((Object) stackIn_74_0);
              stackIn_75_1 = stackIn_74_1;
              stackIn_75_2 = 0;
              break L23;
            }
            L25: {
              ((ak) (Object) stackIn_75_0).a(stackIn_75_1, stackIn_75_2 != 0);
              if (param2 == 3) {
                break L25;
              } else {
                field_bb = (String[]) null;
                break L25;
              }
            }
            L26: {
              L27: {
                stackIn_81_0 = ra.field_e;

                stackIn_81_1 = param2 ^ -28473;

                if (!param1) {
                  break L27;
                } else {
                  stackIn_81_0 = (ak) ((Object) stackIn_81_0);

                  if (param3) {
                    break L27;
                  } else {
                    stackIn_81_0 = (ak) ((Object) stackIn_81_0);

                    if (!bm.field_o) {
                      break L27;
                    } else {
                      stackIn_82_0 = (ak) ((Object) stackIn_81_0);
                      stackIn_82_1 = stackIn_81_1;
                      stackIn_82_2 = 1;
                      break L26;
                    }
                  }
                }
              }
              stackIn_82_0 = (ak) ((Object) stackIn_81_0);
              stackIn_82_1 = stackIn_81_1;
              stackIn_82_2 = 0;
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
                  if (-1 == (ep.field_a.field_P ^ -1)) {
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
          throw aa.a((Throwable) ((Object) var4), "ic.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void e(byte param0) {
        field_bb = null;
        int var1 = 90 / ((param0 - 62) / 41);
    }

    static {
        field_bb = new String[]{"Online head-to-head rated games", "Unlimited Challenge Mode levels", "Complete all fifty puzzles", "Full screen mode"};
    }
}
