/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends ik implements df {
    private wl field_mb;
    private boolean field_nb;
    private boolean field_lb;
    static byte[] field_kb;

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        if (this.field_nb) {
            wl.a(true, false, 170);
            return;
        }
        try {
            wj.b(480);
            this.r(77);
            if (param1 != 17) {
                this.field_lb = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "sf.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, boolean param1, uj param2) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        ee var5 = null;
        int var6 = 0;
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
              if (param2.field_f) {
                var4 = oa.field_i;
                break L2;
              } else {
                if (param2.field_j == null) {
                  var4 = param2.field_b;
                  if (param2.field_g == 248) {
                    L3: {
                      if (!param1) {
                        lj.d((byte) 117);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_nb = true;
                    var4 = wd.field_l;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = gb.field_e;
                  if (this.field_mb == null) {
                    break L2;
                  } else {
                    this.field_mb.a((byte) -69);
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new ee((ik) (this), rh.field_q, var4);
              if (param2.field_f) {
                if (param2.field_a) {
                  this.b(param0 + 109, new ge((sf) (this)));
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a((ma) (this), 8283, qe.field_I);
                  break L4;
                }
              } else {
                L5: {
                  if (!this.field_nb) {
                    if (-6 != (param2.field_g ^ -1)) {
                      var5.a(te.field_f, -1, param0 + 1);
                      break L5;
                    } else {
                      var5.a(qb.field_a, 11, 1);
                      var5.a(ta.field_b, 17, 1);
                      break L5;
                    }
                  } else {
                    var5.a((ma) (this), 8283, qe.field_I);
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
            this.b(-128, var5);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var4_ref);

            stackIn_33_1 = new StringBuilder().append("sf.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L6;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void v(int param0) {
        od var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
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
              if (0 != bd.field_q) {
                break L2;
              } else {
                bd.field_q = 200;
                var1 = (od) ((Object) lb.field_f.a((byte) -95));
                L3: while (true) {
                  if (var1 == null) {
                    if (nc.field_q != null) {
                      var1 = (od) ((Object) nc.field_q.a((byte) -95));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (!var1.field_i.b(8)) {
                              var1.c(5);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var1 = (od) ((Object) nc.field_q.a(true));
                          continue L4;
                        }
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    L6: {
                      if (var1.field_i.b(8)) {
                        break L6;
                      } else {
                        var1.c(5);
                        break L6;
                      }
                    }
                    var1 = (od) ((Object) lb.field_f.a(true));
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == jk.field_D) {
                break L7;
              } else {
                stackIn_20_0 = jk.field_D.a((byte) -54);
                if (!stackIn_20_0) {
                  d.field_e = null;
                  break L7;
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
          throw ch.a((Throwable) ((Object) var1_ref), "sf.IA(" + param0 + ')');
        }
    }

    final void u(int param0) {
        this.a(0, true, mk.a(242763393, wd.field_l, 248));
        int var2 = -109 % ((param0 - 32) / 36);
    }

    final boolean m(int param0) {
        uj var2;
        lj var3;
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
