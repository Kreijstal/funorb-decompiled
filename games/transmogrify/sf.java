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
            if (!((sf) this).field_nb) {
              L1: {
                wj.b(480);
                ((sf) this).r(77);
                if (param1 == 17) {
                  break L1;
                } else {
                  ((sf) this).field_lb = true;
                  break L1;
                }
              }
              break L0;
            } else {
              wl.a(true, false, 170);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("sf.MA(");
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
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(int param0, boolean param1, uj param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ee var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ((sf) this).field_lb = true;
              if (param0 == 0) {
                break L1;
              } else {
                ((sf) this).field_lb = false;
                break L1;
              }
            }
            L2: {
              if (param2.field_f) {
                var4_ref = oa.field_i;
                break L2;
              } else {
                if (param2.field_j == null) {
                  var4_ref = param2.field_b;
                  if (param2.field_g == 248) {
                    L3: {
                      if (!param1) {
                        lj.d((byte) 117);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((sf) this).field_nb = true;
                    var4_ref = wd.field_l;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = gb.field_e;
                  if (((sf) this).field_mb == null) {
                    break L2;
                  } else {
                    ((sf) this).field_mb.a((byte) -69);
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new ee((ik) this, rh.field_q, var4_ref);
              if (param2.field_f) {
                if (param2.field_a) {
                  ((sf) this).b(param0 + 109, (qg) (Object) new ge((sf) this));
                  return;
                } else {
                  lj discarded$2 = var5.a((ma) this, 8283, qe.field_I);
                  break L4;
                }
              } else {
                L5: {
                  if (!((sf) this).field_nb) {
                    if (param2.field_g != 5) {
                      var5.a(te.field_f, -1, param0 + 1);
                      break L5;
                    } else {
                      var5.a(qb.field_a, 11, 1);
                      var5.a(ta.field_b, 17, 1);
                      break L5;
                    }
                  } else {
                    lj discarded$3 = var5.a((ma) this, 8283, qe.field_I);
                    break L5;
                  }
                }
                if (3 != param2.field_g) {
                  if (6 != param2.field_g) {
                    break L4;
                  } else {
                    var5.a(ee.field_C, 9, 1);
                    break L4;
                  }
                } else {
                  var5.a(ad.field_f, 7, 1);
                  break L4;
                }
              }
            }
            ((sf) this).b(-128, (qg) (Object) var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("sf.HA(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final static void v(int param0) {
        od var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              re.field_h.a();
              u.field_a.a();
              bd.field_q = bd.field_q - 1;
              if (0 != bd.field_q) {
                break L1;
              } else {
                bd.field_q = 200;
                var1 = (od) (Object) lb.field_f.a((byte) -95);
                L2: while (true) {
                  if (var1 == null) {
                    if (nc.field_q != null) {
                      var1 = (od) (Object) nc.field_q.a((byte) -95);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_i.b(8)) {
                              var1.c(5);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (od) (Object) nc.field_q.a(true);
                          continue L3;
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L5: {
                      if (var1.field_i.b(8)) {
                        break L5;
                      } else {
                        var1.c(5);
                        break L5;
                      }
                    }
                    var1 = (od) (Object) lb.field_f.a(true);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (null == jk.field_D) {
                break L6;
              } else {
                if (!jk.field_D.a((byte) -54)) {
                  d.field_e = null;
                  break L6;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1_ref, "sf.IA(" + 107 + 41);
        }
    }

    final void u(int param0) {
        this.a(0, true, mk.a(242763393, wd.field_l, 248));
        int var2 = -109 % ((param0 - 32) / 36);
    }

    final boolean m(int param0) {
        uj var2 = null;
        Object var3 = null;
        if (((sf) this).field_A) {
          if (!((sf) this).field_lb) {
            var2 = oj.a((byte) 32);
            if (var2 == null) {
              if (param0 != 0) {
                var3 = null;
                ((sf) this).a((lj) null, -59, -50, 24, 58);
                return super.m(0);
              } else {
                return super.m(0);
              }
            } else {
              this.a(param0, false, var2);
              if (param0 != 0) {
                var3 = null;
                ((sf) this).a((lj) null, -59, -50, 24, 58);
                return super.m(0);
              } else {
                return super.m(0);
              }
            }
          } else {
            if (param0 != 0) {
              var3 = null;
              ((sf) this).a((lj) null, -59, -50, 24, 58);
              return super.m(0);
            } else {
              return super.m(0);
            }
          }
        } else {
          if (param0 != 0) {
            var3 = null;
            ((sf) this).a((lj) null, -59, -50, 24, 58);
            return super.m(0);
          } else {
            return super.m(0);
          }
        }
    }

    public static void c(boolean param0) {
        field_kb = null;
    }

    sf(da param0, wl param1) {
        super(param0, rh.field_q, vi.field_i, false, false);
        try {
            ((sf) this).field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "sf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = new byte[520];
    }
}
