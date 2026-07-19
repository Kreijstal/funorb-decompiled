/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends ik implements df {
    private wl field_mb;
    private boolean field_nb;
    private boolean field_lb;
    static byte[] field_kb;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
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
            if (!this.field_nb) {
              L1: {
                wj.b(480);
                this.r(77);
                if (param1 == 17) {
                  break L1;
                } else {
                  this.field_lb = true;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              wl.a(true, false, 170);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (runtimeException);
            stackOut_6_1 = new StringBuilder().append("sf.MA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1, uj param2) {
        lj discarded$2 = null;
        lj discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        ee var5 = null;
        int var6 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_lb = true;
              if (param0 == 0) {
                break L1;
              } else {
                this.field_lb = false;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.field_f) {
                  break L3;
                } else {
                  L4: {
                    if (param2.field_j == null) {
                      break L4;
                    } else {
                      var4_ref = gb.field_e;
                      if (this.field_mb == null) {
                        break L2;
                      } else {
                        this.field_mb.a((byte) -69);
                        if (var6 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4_ref = param2.field_b;
                  if (param2.field_g == 248) {
                    L5: {
                      if (!param1) {
                        lj.d((byte) 117);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.field_nb = true;
                    var4_ref = wd.field_l;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              var4_ref = oa.field_i;
              break L2;
            }
            L6: {
              L7: {
                var5 = new ee((ik) (this), rh.field_q, var4_ref);
                if (param2.field_f) {
                  break L7;
                } else {
                  L8: {
                    L9: {
                      if (!this.field_nb) {
                        break L9;
                      } else {
                        discarded$2 = var5.a((ma) (this), 8283, qe.field_I);
                        if (var6 == 0) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (-6 != (param2.field_g ^ -1)) {
                        break L10;
                      } else {
                        var5.a(qb.field_a, 11, 1);
                        var5.a(ta.field_b, 17, 1);
                        if (var6 == 0) {
                          break L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var5.a(te.field_f, -1, param0 + 1);
                    break L8;
                  }
                  L11: {
                    if (3 != param2.field_g) {
                      break L11;
                    } else {
                      var5.a(ad.field_f, 7, 1);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        break L11;
                      }
                    }
                  }
                  if (6 != param2.field_g) {
                    break L6;
                  } else {
                    var5.a(ee.field_C, 9, 1);
                    if (var6 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              if (param2.field_a) {
                this.b(param0 + 109, new ge((sf) (this)));
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                discarded$3 = var5.a((ma) (this), 8283, qe.field_I);
                break L6;
              }
            }
            this.b(-128, var5);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var4);
            stackOut_36_1 = new StringBuilder().append("sf.HA(").append(param0).append(',').append(param1).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L12;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L12;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void v(int param0) {
        RuntimeException runtimeException = null;
        od var1 = null;
        int var2 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_21_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        boolean stackOut_14_0 = false;
        boolean stackOut_20_0 = false;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              re.field_h.a();
              u.field_a.a();
              bd.field_q = bd.field_q - 1;
              if (param0 >= 106) {
                break L1;
              } else {
                field_kb = (byte[]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (0 != bd.field_q) {
                    break L4;
                  } else {
                    bd.field_q = 200;
                    var1 = (od) ((Object) lb.field_f.a((byte) -95));
                    L5: while (true) {
                      L6: {
                        if (var1 == null) {
                          break L6;
                        } else {
                          stackOut_6_0 = var1.field_i.b(8);
                          stackIn_21_0 = stackOut_6_0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var2 != 0) {
                            break L3;
                          } else {
                            L7: {
                              if (stackIn_7_0) {
                                break L7;
                              } else {
                                var1.c(5);
                                break L7;
                              }
                            }
                            var1 = (od) ((Object) lb.field_f.a(true));
                            if (var2 == 0) {
                              continue L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      if (nc.field_q != null) {
                        var1 = (od) ((Object) nc.field_q.a((byte) -95));
                        L8: while (true) {
                          if (var1 == null) {
                            break L4;
                          } else {
                            stackOut_14_0 = var1.field_i.b(8);
                            stackIn_21_0 = stackOut_14_0;
                            stackIn_15_0 = stackOut_14_0;
                            if (var2 != 0) {
                              break L3;
                            } else {
                              L9: {
                                if (!stackIn_15_0) {
                                  var1.c(5);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var1 = (od) ((Object) nc.field_q.a(true));
                              if (var2 == 0) {
                                continue L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                if (null == jk.field_D) {
                  break L2;
                } else {
                  stackOut_20_0 = jk.field_D.a((byte) -54);
                  stackIn_21_0 = stackOut_20_0;
                  break L3;
                }
              }
              if (!stackIn_21_0) {
                d.field_e = null;
                break L2;
              } else {
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "sf.IA(" + param0 + ')');
        }
    }

    final void u(int param0) {
        this.a(0, true, mk.a(242763393, wd.field_l, 248));
        int var2 = -109 % ((param0 - 32) / 36);
    }

    final boolean m(int param0) {
        uj var2 = null;
        lj var3 = null;
        if (this.field_A) {
          if (!this.field_lb) {
            var2 = oj.a((byte) 32);
            if (var2 == null) {
              if (param0 != 0) {
                var3 = (lj) null;
                this.a((lj) null, -59, -50, 24, 58);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              this.a(param0 + 0, false, var2);
              if (param0 != 0) {
                var3 = (lj) null;
                this.a((lj) null, -59, -50, 24, 58);
                return super.m(0);
              } else {
                return super.m(0);
              }
            }
          } else {
            if (param0 != 0) {
              var3 = (lj) null;
              this.a((lj) null, -59, -50, 24, 58);
              return super.m(0);
            } else {
              return super.m(0);
            }
          }
        } else {
          if (param0 != 0) {
            var3 = (lj) null;
            this.a((lj) null, -59, -50, 24, 58);
            return super.m(0);
          } else {
            return super.m(0);
          }
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            field_kb = (byte[]) null;
            field_kb = null;
            return;
        }
        field_kb = null;
    }

    sf(da param0, wl param1) {
        super(param0, rh.field_q, vi.field_i, false, false);
        try {
            this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "sf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_kb = new byte[520];
    }
}
