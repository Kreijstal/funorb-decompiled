/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sp implements ca, ai {
    static ri field_C;
    static int field_H;
    private uk field_G;
    private wp field_D;
    static hr field_B;
    private ar field_F;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) 60, param3)) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param3) {
                if (-100 != (param3 ^ -1)) {
                  L1: {
                    if (param2 >= 9) {
                      break L1;
                    } else {
                      th.e(false);
                      break L1;
                    }
                  }
                  stackIn_14_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(param0, false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = this.a((byte) -94, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var5);

            stackIn_18_1 = new StringBuilder().append("th.KA(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_14_0 != 0;
            }
          }
        }
    }

    th(uk param0) {
        super(0, 0, 288, 0, (mh) null);
        RuntimeException runtimeException = null;
        int var3 = 0;
        gm var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_G = param0;
            this.field_D = new wp(wd.field_h, (qm) null);
            this.field_D.field_w = (mh) ((Object) new ue());
            var7 = ic.a(qv.field_l, new String[]{this.a((byte) 43), this.g(116)}, (byte) -128);
            var3 = 20;
            var4 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
            this.field_F = new ar(var7, var4);
            this.field_F.field_t = "";
            this.field_F.a(-57, sb.field_e, 0);
            this.field_F.a(-66, sb.field_e, 1);
            this.field_F.field_o = (qm) (this);
            this.field_F.field_q = -40 + this.field_q;
            this.field_F.a(var3, false, 26, -40 + this.field_q);
            var3 = var3 + (15 + this.field_F.field_p);
            this.a(this.field_F, 99);
            var5 = 4;
            var6 = 200;
            this.field_D.a(-79, 300 + -var6 >> 1811237697, var3, 40, var6);
            this.field_D.field_o = (qm) (this);
            this.a(this.field_D, 76);
            this.a(-112, 0, 0, 55 + var3 + var5, 300);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("th.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    final static void b(int param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 1 << param2;
            if ((var3_int & kh.field_e) == 0) {
              L1: {
                kh.field_e = kh.field_e | var3_int;
                wj.field_e = wj.field_e | var3_int;
                pl.field_v.a((ms) (new ge(param2)), (byte) 39);
                if (-6 >= (gj.a((byte) -84, 10) ^ -1)) {
                  fb.field_a = fb.field_a + iw.field_b;
                  break L1;
                } else {
                  ha.field_f = ha.field_f + iw.field_b;
                  break L1;
                }
              }
              L2: {
                if ((gj.a((byte) -84, 10) ^ -1) > -6) {
                  ts.field_a = ts.field_a - te.field_c;
                  break L2;
                } else {
                  kn.field_b = kn.field_b - te.field_c;
                  break L2;
                }
              }
              ia.a(param2, (byte) -82);
              if (param0 == 24753) {
                L3: {
                  if (3 == param2) {
                    kn.field_b = kn.field_b - ld.field_C;
                    ha.field_f = ha.field_f + oh.field_e;
                    ts.field_a = ts.field_a - nq.field_i;
                    break L3;
                  } else {
                    L4: {
                      if (param2 == 4) {
                        break L4;
                      } else {
                        if (param2 == 5) {
                          break L4;
                        } else {
                          if (6 == param2) {
                            break L4;
                          } else {
                            if (-8 != (param2 ^ -1)) {
                              if (param2 != 10) {
                                L5: {
                                  if (param2 == 0) {
                                    break L5;
                                  } else {
                                    if (param2 == 1) {
                                      break L5;
                                    } else {
                                      if (2 == param2) {
                                        break L5;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                                fb.field_a = fb.field_a + oh.field_e;
                                break L3;
                              } else {
                                ha.field_f = ha.field_f + oh.field_e;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    ts.field_a = ts.field_a + nq.field_i;
                    break L3;
                  }
                }
                L6: {
                  if (!f.field_w) {
                    pn.field_q.a((ms) (new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b)), (byte) 39);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (3 != param2) {
                    L8: {
                      if (param2 == 4) {
                        break L8;
                      } else {
                        if ((param2 ^ -1) == -6) {
                          break L8;
                        } else {
                          if (6 == param2) {
                            break L8;
                          } else {
                            if (param2 == 7) {
                              break L8;
                            } else {
                              if (10 == param2) {
                                ha.field_f = ha.field_f - oh.field_e;
                                break L7;
                              } else {
                                L9: {
                                  if (param2 == 0) {
                                    break L9;
                                  } else {
                                    if (-2 == (param2 ^ -1)) {
                                      break L9;
                                    } else {
                                      if ((param2 ^ -1) == -3) {
                                        break L9;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                fb.field_a = fb.field_a - oh.field_e;
                                break L7;
                              }
                            }
                          }
                        }
                      }
                    }
                    ts.field_a = ts.field_a - nq.field_i;
                    break L7;
                  } else {
                    kn.field_b = kn.field_b + ld.field_C;
                    ha.field_f = ha.field_f - oh.field_e;
                    ts.field_a = ts.field_a + nq.field_i;
                    break L7;
                  }
                }
                L10: {
                  if (5 > gj.a((byte) -84, 10)) {
                    ha.field_f = ha.field_f - iw.field_b;
                    break L10;
                  } else {
                    fb.field_a = fb.field_a - iw.field_b;
                    break L10;
                  }
                }
                if (gj.a((byte) -84, 10) >= 5) {
                  kn.field_b = kn.field_b + te.field_c;
                  return;
                } else {
                  ts.field_a = ts.field_a + te.field_c;
                  return;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "th.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                hn.a((byte) 113, "terms.ws");
                break L1;
              } else {
                if (1 == param0) {
                  hn.a((byte) 80, "privacy.ws");
                  break L1;
                } else {
                  if (-3 != (param0 ^ -1)) {
                    break L1;
                  } else {
                    hn.a((byte) 98, "conduct.ws");
                    break L1;
                  }
                }
              }
            }
            if (param3 == -20036) {
              break L0;
            } else {
              this.field_G = (uk) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("th.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final String g(int param0) {
        RuntimeException var2 = null;
        ar var3 = null;
        String stackIn_3_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 2) {
                break L1;
              } else {
                var3 = (ar) null;
                this.a(-104, (ar) null, -45, 28);
                break L1;
              }
            }
            stackIn_3_0 = "</col></u>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "th.H(" + param0 + ')');
        }
        return stackIn_3_0;
    }

    final static void e(boolean param0) {
        try {
            ha.field_d = fd.field_i + " <b>" + km.field_m + "</b> " + ws.field_a + " <b>" + up.field_b + "</b> " + oh.field_b + "<br>" + "<br>" + c.field_q;
            if (!param0) {
                th.e(false);
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "th.I(" + param0 + ')');
        }
    }

    private final String a(byte param0) {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 75 / ((-65 - param0) / 44);
            stackIn_1_0 = "<u=2164A2><col=2164A2>";
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "th.F(" + param0 + ')');
        }
        return stackIn_1_0;
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 != this.field_D) {
                break L1;
              } else {
                kh.a(false);
                this.field_G.n(-7);
                break L1;
              }
            }
            if (param1 == 710) {
              break L0;
            } else {
              th.f(true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var6);

            stackIn_9_1 = new StringBuilder().append("th.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void f(boolean param0) {
        try {
            if (param0) {
                th.b(82, -23, -57);
            }
            field_C = null;
            field_B = null;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "th.G(" + param0 + ')');
        }
    }

    static {
        field_H = 0;
    }
}
