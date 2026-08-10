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
        if (param2 != -1) {
            field_k = (String) null;
        }
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
          qe.field_k.a((byte) 50, de.field_b.field_c);
          qe.field_k.a((byte) 50, kj.field_u);
          wn.a((byte) 3);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        oo.d(-24 + (this.field_p >> -1850046096) + -param2, -24 + -param0 + (this.field_s >> -1529194096), 1 - -((-param3 + this.field_f) / 5), 16711680, 128);
        if (!param1) {
            qd var6 = (qd) null;
            this.a(106, (qd) null);
        }
    }

    final static int a(hf param0, hf param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
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
              if (param2 == 32475) {
                break L1;
              } else {
                field_t = 10;
                break L1;
              }
            }
            var4 = (String) null;
            stackIn_3_0 = mg.a(false, param0, 0, param1, (String) null, 0, (byte) -92);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wf.E(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, qd param1) {
        wb stackIn_76_0 = null;
        wb stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        qd stackIn_80_0 = null;
        qd stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        qd stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        qd stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        id var3 = null;
        RuntimeException var3_ref = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_i) {
                L2: {
                  var3_int = this.field_q;
                  if (var3_int == 9) {
                    nm.b(-126, 81);
                    break L2;
                  } else {
                    if (var3_int == 10) {
                      nm.b(-126, 83);
                      break L2;
                    } else {
                      if (var3_int != 16) {
                        if (var3_int != 17) {
                          if (7 != var3_int) {
                            if (-5 == (var3_int ^ -1)) {
                              nm.b(-127, 46);
                              break L2;
                            } else {
                              if (var3_int != 3) {
                                if (var3_int != 14) {
                                  if (var3_int != 13) {
                                    if ((var3_int ^ -1) == -9) {
                                      nm.b(-127, 35);
                                      break L2;
                                    } else {
                                      if (var3_int != 11) {
                                        if (1 != var3_int) {
                                          if (-3 != (var3_int ^ -1)) {
                                            if (-6 != (var3_int ^ -1)) {
                                              if (-16 != (var3_int ^ -1)) {
                                                if (var3_int != 18) {
                                                  break L2;
                                                } else {
                                                  nm.b(-128, 46);
                                                  break L2;
                                                }
                                              } else {
                                                nm.b(param0 ^ -127, 80);
                                                break L2;
                                              }
                                            } else {
                                              nm.b(-126, 17);
                                              break L2;
                                            }
                                          } else {
                                            nm.b(-127, 46);
                                            break L2;
                                          }
                                        } else {
                                          nm.b(-127, 67);
                                          break L2;
                                        }
                                      } else {
                                        nm.b(param0 ^ -126, 86);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    nm.b(-128, 85);
                                    break L2;
                                  }
                                } else {
                                  nm.b(param0 + -128, 92);
                                  break L2;
                                }
                              } else {
                                nm.b(param0 + -128, 46);
                                break L2;
                              }
                            }
                          } else {
                            nm.b(-127, 46);
                            break L2;
                          }
                        } else {
                          nm.b(param0 + -127, 75);
                          break L2;
                        }
                      } else {
                        nm.b(param0 ^ -128, 84);
                        break L2;
                      }
                    }
                  }
                }
                var6 = this.field_q;
                if ((var6 ^ -1) != -12) {
                  if (var6 != 12) {
                    if ((var6 ^ -1) != -8) {
                      if ((var6 ^ -1) != -5) {
                        if (13 == var6) {
                          L3: {
                            stackIn_80_0 = (qd) (param1);

                            if (this.field_o != 36) {
                              stackIn_81_0 = (qd) ((Object) stackIn_80_0);
                              stackIn_81_1 = 0;
                              break L3;
                            } else {
                              stackIn_81_0 = (qd) ((Object) stackIn_80_0);
                              stackIn_81_1 = 1;
                              break L3;
                            }
                          }
                          ((qd) (Object) stackIn_81_0).b(stackIn_81_1 != 0, 0, this.field_s, this.field_p);
                          break L1;
                        } else {
                          L4: {
                            if (-10 != (var6 ^ -1)) {
                              if (10 == var6) {
                                break L4;
                              } else {
                                if ((var6 ^ -1) == -16) {
                                  L5: {
                                    stackIn_85_0 = (qd) (param1);

                                    stackIn_85_1 = this.field_p;

                                    if (32 != this.field_o) {
                                      stackIn_86_0 = (qd) ((Object) stackIn_85_0);
                                      stackIn_86_1 = stackIn_85_1;
                                      stackIn_86_2 = 0;
                                      break L5;
                                    } else {
                                      stackIn_86_0 = (qd) ((Object) stackIn_85_0);
                                      stackIn_86_1 = stackIn_85_1;
                                      stackIn_86_2 = 1;
                                      break L5;
                                    }
                                  }
                                  ((qd) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2 != 0, this.field_s, (byte) -40, this.field_j);
                                  break L1;
                                } else {
                                  if (17 != var6) {
                                    break L1;
                                  } else {
                                    if ((this.field_s ^ -1) == 0) {
                                      param1.c(this.field_p, 68);
                                      break L1;
                                    } else {
                                      param1.b(this.field_p, -106, this.field_s, this.field_j);
                                      break L1;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                          var5 = op.field_m.a((byte) 32, this.field_j, 1000);
                          param1.a((byte) -111, this.field_s, this.field_q, var5, this.field_p);
                          break L1;
                        }
                      } else {
                        L6: {
                          var4 = op.field_m.a(this.field_l, false);
                          stackIn_76_0 = (wb) (var4);

                          if (-35 != (this.field_o ^ -1)) {
                            stackIn_77_0 = (wb) ((Object) stackIn_76_0);
                            stackIn_77_1 = 0;
                            break L6;
                          } else {
                            stackIn_77_0 = (wb) ((Object) stackIn_76_0);
                            stackIn_77_1 = 1;
                            break L6;
                          }
                        }
                        stackIn_77_0.field_Hb = stackIn_77_1 != 0;
                        break L1;
                      }
                    } else {
                      var3 = op.field_m.a(this.field_l, (byte) 33);
                      if (!(var3 instanceof wb)) {
                        break L1;
                      } else {
                        if (37 == this.field_o) {
                          var8 = (wb) ((Object) var3);
                          var8.field_ib = this.field_j;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  } else {
                    param1.b(this.field_j, 0, op.field_m.a((byte) 32, this.field_j, 750));
                    break L1;
                  }
                } else {
                  param1.c(this.field_j, op.field_m.a((byte) 32, this.field_j, 500), -2);
                  break L1;
                }
              } else {
                L7: {
                  L8: {
                    if (this.field_s != -1) {
                      break L8;
                    } else {
                      if (this.field_p != -1) {
                        break L8;
                      } else {
                        param1.b(this.field_q, param1.field_k.a(320, param0 + 2), this.field_j, param1.field_k.a(true, 240), -99);
                        break L7;
                      }
                    }
                  }
                  if (this.field_s != -1) {
                    param1.b(this.field_q, this.field_p, this.field_j, this.field_s, -46);
                    break L7;
                  } else {
                    param1.a(50, this.field_j, this.field_l, this.field_q);
                    break L7;
                  }
                }
                this.field_f = this.field_f + 50;
                this.field_i = true;
                param1.a(false, (ae) (this));
                nm.b(-127, 67);
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
            var3_ref = decompiledCaughtException;
            stackIn_95_0 = (RuntimeException) (var3_ref);

            stackIn_95_1 = new StringBuilder().append("wf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "null";
              break L10;
            } else {
              stackIn_96_0 = (RuntimeException) ((Object) stackIn_95_0);
              stackIn_96_1 = (StringBuilder) ((Object) stackIn_95_1);
              stackIn_96_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_96_0), stackIn_96_2 + ')');
        }
    }

    wf() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super.a(param2 + 32, param1);
        if (param6 != 255) {
        }
        this.field_j = param7;
        this.field_p = param4;
        this.field_i = false;
        this.field_o = param3;
        this.field_q = param6;
        if (param2 != -32) {
            this.field_o = 121;
        }
        this.field_l = param5;
        this.field_s = param0;
        if (this.field_l == 65535) {
            this.field_l = -1;
        }
        if ((this.field_p ^ -1) == -65536) {
            this.field_p = -1;
        }
        if (!((this.field_s ^ -1) != -65536)) {
            this.field_s = -1;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_r = null;
        if (param0 != 17) {
            field_k = (String) null;
        }
        field_n = null;
    }

    final void a(byte param0) {
        super.a((byte) -86);
        dg.field_K.a((br) (this), false);
        if (param0 > -47) {
            qd var3 = (qd) null;
            this.a(96, (qd) null);
        }
    }

    static {
        field_k = "Yes";
        field_t = 1;
        field_r = "Please remove <%0> from your ignore list first.";
        field_n = "Log in / Create account";
    }
}
