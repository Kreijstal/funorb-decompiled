/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ae {
    private int field_p;
    private boolean field_i;
    private int field_l;
    private int field_o;
    static int field_m;
    private int field_j;
    int field_q;
    static String field_k;
    private int field_s;
    static int field_t;
    static String field_r;
    static String field_n;

    final static void a(int param0, int param1, int param2) {
        em.field_O[param0] = cr.b(em.field_O[param0], 1 << -32 + param1);
    }

    final static void a(int param0) {
        if (param0 != 6835) {
          return;
        } else {
          L0: {
            lo.field_g = new cj(0L, (cj) null);
            if (tb.field_u) {
              lo.field_g.a((byte) 50, ql.field_b);
              break L0;
            } else {
              break L0;
            }
          }
          lo.field_g.a((byte) 50, pd.field_b);
          de.field_b = new qh(ne.field_vb, lo.field_g);
          qe.field_k = new cj(0L, (cj) null);
          qe.field_k.a((byte) 50, (cj) (Object) de.field_b.field_c);
          qe.field_k.a((byte) 50, kj.field_u);
          wn.a((byte) 3);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        oo.d(-24 + (((wf) this).field_p >> 16) + -param2, -24 + -param0 + (((wf) this).field_s >> 16), 1 - -((-param3 + ((wf) this).field_f) / 5), 16711680, 128);
        if (!param1) {
            Object var6 = null;
            ((wf) this).a(106, (qd) null);
        }
    }

    final static int a(hf param0, hf param1, int param2) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            var4 = null;
            stackOut_0_0 = mg.a(false, param0, 0, param1, (String) null, 0, (byte) -92);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("wf.E(");
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
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 32475 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, qd param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        id var3_ref = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        wb stackIn_75_0 = null;
        wb stackIn_76_0 = null;
        wb stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        qd stackIn_79_0 = null;
        qd stackIn_80_0 = null;
        qd stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        qd stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        qd stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        qd stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        qd stackOut_78_0 = null;
        qd stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        qd stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        qd stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        qd stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        qd stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        wb stackOut_74_0 = null;
        wb stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        wb stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((wf) this).field_i) {
                L2: {
                  var3_int = ((wf) this).field_q;
                  if (var3_int == 9) {
                    uj discarded$18 = nm.b(-126, 81);
                    break L2;
                  } else {
                    if (var3_int == 10) {
                      uj discarded$19 = nm.b(-126, 83);
                      break L2;
                    } else {
                      if (var3_int != 16) {
                        if (var3_int != 17) {
                          if (7 != var3_int) {
                            if (var3_int == 4) {
                              uj discarded$20 = nm.b(-127, 46);
                              break L2;
                            } else {
                              if (var3_int != 3) {
                                if (var3_int != 14) {
                                  if (var3_int != 13) {
                                    if (var3_int == 8) {
                                      uj discarded$21 = nm.b(-127, 35);
                                      break L2;
                                    } else {
                                      if (var3_int != 11) {
                                        if (1 != var3_int) {
                                          if (var3_int != 2) {
                                            if (var3_int != 5) {
                                              if (var3_int != 15) {
                                                if (var3_int != 18) {
                                                  break L2;
                                                } else {
                                                  uj discarded$22 = nm.b(-128, 46);
                                                  break L2;
                                                }
                                              } else {
                                                uj discarded$23 = nm.b(param0 ^ -127, 80);
                                                break L2;
                                              }
                                            } else {
                                              uj discarded$24 = nm.b(-126, 17);
                                              break L2;
                                            }
                                          } else {
                                            uj discarded$25 = nm.b(-127, 46);
                                            break L2;
                                          }
                                        } else {
                                          uj discarded$26 = nm.b(-127, 67);
                                          break L2;
                                        }
                                      } else {
                                        uj discarded$27 = nm.b(param0 ^ -126, 86);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    uj discarded$28 = nm.b(-128, 85);
                                    break L2;
                                  }
                                } else {
                                  uj discarded$29 = nm.b(param0 + -128, 92);
                                  break L2;
                                }
                              } else {
                                uj discarded$30 = nm.b(param0 + -128, 46);
                                break L2;
                              }
                            }
                          } else {
                            uj discarded$31 = nm.b(-127, 46);
                            break L2;
                          }
                        } else {
                          uj discarded$32 = nm.b(param0 + -127, 75);
                          break L2;
                        }
                      } else {
                        uj discarded$33 = nm.b(param0 ^ -128, 84);
                        break L2;
                      }
                    }
                  }
                }
                var6 = ((wf) this).field_q;
                if (var6 != 11) {
                  if (var6 != 12) {
                    if (var6 != 7) {
                      if (var6 != 4) {
                        if (13 == var6) {
                          L3: {
                            stackOut_78_0 = (qd) param1;
                            stackIn_80_0 = stackOut_78_0;
                            stackIn_79_0 = stackOut_78_0;
                            if (((wf) this).field_o != 36) {
                              stackOut_80_0 = (qd) (Object) stackIn_80_0;
                              stackOut_80_1 = 0;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L3;
                            } else {
                              stackOut_79_0 = (qd) (Object) stackIn_79_0;
                              stackOut_79_1 = 1;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_81_1 = stackOut_79_1;
                              break L3;
                            }
                          }
                          ((qd) (Object) stackIn_81_0).b(stackIn_81_1 != 0, 0, ((wf) this).field_s, ((wf) this).field_p);
                          break L1;
                        } else {
                          L4: {
                            if (var6 != 9) {
                              if (10 == var6) {
                                break L4;
                              } else {
                                if (var6 == 15) {
                                  L5: {
                                    stackOut_83_0 = (qd) param1;
                                    stackOut_83_1 = ((wf) this).field_p;
                                    stackIn_85_0 = stackOut_83_0;
                                    stackIn_85_1 = stackOut_83_1;
                                    stackIn_84_0 = stackOut_83_0;
                                    stackIn_84_1 = stackOut_83_1;
                                    if (32 != ((wf) this).field_o) {
                                      stackOut_85_0 = (qd) (Object) stackIn_85_0;
                                      stackOut_85_1 = stackIn_85_1;
                                      stackOut_85_2 = 0;
                                      stackIn_86_0 = stackOut_85_0;
                                      stackIn_86_1 = stackOut_85_1;
                                      stackIn_86_2 = stackOut_85_2;
                                      break L5;
                                    } else {
                                      stackOut_84_0 = (qd) (Object) stackIn_84_0;
                                      stackOut_84_1 = stackIn_84_1;
                                      stackOut_84_2 = 1;
                                      stackIn_86_0 = stackOut_84_0;
                                      stackIn_86_1 = stackOut_84_1;
                                      stackIn_86_2 = stackOut_84_2;
                                      break L5;
                                    }
                                  }
                                  ((qd) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2 != 0, ((wf) this).field_s, (byte) -40, ((wf) this).field_j);
                                  break L1;
                                } else {
                                  if (17 != var6) {
                                    break L1;
                                  } else {
                                    if (((wf) this).field_s == -1) {
                                      param1.c(((wf) this).field_p, 68);
                                      break L1;
                                    } else {
                                      boolean discarded$34 = param1.b(((wf) this).field_p, -106, ((wf) this).field_s, ((wf) this).field_j);
                                      break L1;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          var5 = op.field_m.a((byte) 32, ((wf) this).field_j, 1000);
                          param1.a((byte) -111, ((wf) this).field_s, ((wf) this).field_q, var5, ((wf) this).field_p);
                          break L1;
                        }
                      } else {
                        L6: {
                          var4 = op.field_m.a(((wf) this).field_l, false);
                          stackOut_74_0 = (wb) var4;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_75_0 = stackOut_74_0;
                          if (((wf) this).field_o != 34) {
                            stackOut_76_0 = (wb) (Object) stackIn_76_0;
                            stackOut_76_1 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            break L6;
                          } else {
                            stackOut_75_0 = (wb) (Object) stackIn_75_0;
                            stackOut_75_1 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            break L6;
                          }
                        }
                        stackIn_77_0.field_Hb = stackIn_77_1 != 0;
                        break L1;
                      }
                    } else {
                      var3_ref = op.field_m.a(((wf) this).field_l, (byte) 33);
                      if (!(var3_ref instanceof wb)) {
                        break L1;
                      } else {
                        if (37 == ((wf) this).field_o) {
                          var8 = (wb) (Object) var3_ref;
                          var8.field_ib = ((wf) this).field_j;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    param1.b(((wf) this).field_j, 0, op.field_m.a((byte) 32, ((wf) this).field_j, 750));
                    break L1;
                  }
                } else {
                  param1.c(((wf) this).field_j, op.field_m.a((byte) 32, ((wf) this).field_j, 500), -2);
                  break L1;
                }
              } else {
                L7: {
                  L8: {
                    if (((wf) this).field_s != -1) {
                      break L8;
                    } else {
                      if (((wf) this).field_p != -1) {
                        break L8;
                      } else {
                        param1.b(((wf) this).field_q, param1.field_k.a(320, param0 + 2), ((wf) this).field_j, param1.field_k.a(true, 240), -99);
                        break L7;
                      }
                    }
                  }
                  if (((wf) this).field_s != -1) {
                    param1.b(((wf) this).field_q, ((wf) this).field_p, ((wf) this).field_j, ((wf) this).field_s, -46);
                    break L7;
                  } else {
                    param1.a(50, ((wf) this).field_j, ((wf) this).field_l, ((wf) this).field_q);
                    break L7;
                  }
                }
                ((wf) this).field_f = ((wf) this).field_f + 50;
                ((wf) this).field_i = true;
                param1.a(false, (ae) this);
                uj discarded$35 = nm.b(-127, 67);
                break L1;
              }
            }
            L9: {
              if (param0 == 0) {
                break L9;
              } else {
                wf.a(11);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_93_0 = (RuntimeException) var3;
            stackOut_93_1 = new StringBuilder().append("wf.D(").append(param0).append(44);
            stackIn_95_0 = stackOut_93_0;
            stackIn_95_1 = stackOut_93_1;
            stackIn_94_0 = stackOut_93_0;
            stackIn_94_1 = stackOut_93_1;
            if (param1 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L10;
            } else {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "{...}";
              stackIn_96_0 = stackOut_94_0;
              stackIn_96_1 = stackOut_94_1;
              stackIn_96_2 = stackOut_94_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_96_0, stackIn_96_2 + 41);
        }
    }

    wf() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super.a(param2 + 32, param1);
        if (param6 != 255) {
        }
        ((wf) this).field_j = param7;
        ((wf) this).field_p = param4;
        ((wf) this).field_i = false;
        ((wf) this).field_o = param3;
        ((wf) this).field_q = param6;
        if (param2 != -32) {
            ((wf) this).field_o = 121;
        }
        ((wf) this).field_l = param5;
        ((wf) this).field_s = param0;
        if (((wf) this).field_l == 65535) {
            ((wf) this).field_l = -1;
        }
        if (((wf) this).field_p == 65535) {
            ((wf) this).field_p = -1;
        }
        if (!(((wf) this).field_s != 65535)) {
            ((wf) this).field_s = -1;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_r = null;
        field_n = null;
    }

    final void a(byte param0) {
        super.a((byte) -86);
        dg.field_K.a((br) this, false);
        if (param0 > -47) {
            Object var3 = null;
            ((wf) this).a(96, (qd) null);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Yes";
        field_t = 1;
        field_r = "Please remove <%0> from your ignore list first.";
        field_n = "Log in / Create account";
    }
}
