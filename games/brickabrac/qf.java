/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends lp implements en {
    private boolean field_Db;
    private dk field_Eb;
    static int field_Cb;
    private boolean field_Fb;

    final static void a(int param0, pb param1, int param2, jp param3, int param4, boolean param5) {
        try {
            if (param5) {
                field_Cb = -58;
            }
            fc.a(-77, param1.field_p);
            lb.g(0, 0, param1.field_i, param1.field_q, rm.field_d[param0], 22953);
            param3.b((-param3.field_x + param1.field_i) / 2 - 80 / param2, -param3.field_z + (param1.field_q + param4 - 201 / param2), 41, 110);
            sc.b(-107);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qf.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean h(int param0) {
        oh var2 = null;
        if (param0 == 0) {
          if (this.field_N) {
            if (!this.field_Db) {
              var2 = l.a(106);
              if (var2 == null) {
                return super.h(0);
              } else {
                this.a(-7, var2, false);
                return super.h(0);
              }
            } else {
              return super.h(0);
            }
          } else {
            return super.h(0);
          }
        } else {
          return true;
        }
    }

    final static int p(int param0) {
        if (param0 != 248) {
          field_Cb = 19;
          return to.field_a + ((md.field_v << -1211210622) + (md.field_r << -2046869340));
        } else {
          return to.field_a + ((md.field_v << -1211210622) + (md.field_r << -2046869340));
        }
    }

    qf(cp param0, dk param1) {
        super(param0, wm.field_a, ie.field_o, false, false);
        try {
            this.field_Eb = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(boolean param0) {
        this.a(-7, i.a(248, -85, no.field_q), param0);
    }

    public final void a(int param0, int param1, byte param2, int param3, d param4) {
        if (this.field_Fb) {
            ag.a((byte) -16, true, false);
            return;
        }
        if (param2 >= -22) {
            return;
        }
        try {
            ek.l(64);
            this.m(17);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "qf.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    private final void a(int param0, oh param1, boolean param2) {
        d discarded$2 = null;
        d discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        ec var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_Db = true;
              if (param1.field_c) {
                var4_ref = lh.field_r;
                break L1;
              } else {
                if (null != param1.field_e) {
                  var4_ref = ng.field_f;
                  if (null != this.field_Eb) {
                    this.field_Eb.a((byte) 124);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param1.field_g;
                  if (param1.field_d != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param2) {
                        jq.e(-77);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    this.field_Fb = true;
                    var4_ref = no.field_q;
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new ec((lp) (this), wm.field_a, var4_ref);
              if (param1.field_c) {
                if (!param1.field_a) {
                  discarded$2 = var5.a((byte) 126, ri.field_L, (uh) (this));
                  break L3;
                } else {
                  this.b((byte) 118, new ig((qf) (this)));
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L4: {
                  if (this.field_Fb) {
                    discarded$3 = var5.a((byte) -37, ri.field_L, (uh) (this));
                    break L4;
                  } else {
                    if (param1.field_d != 5) {
                      var5.a(false, dp.field_s, -1);
                      break L4;
                    } else {
                      var5.a(false, ec.field_L, 11);
                      var5.a(false, wc.field_a, 17);
                      break L4;
                    }
                  }
                }
                if (3 == param1.field_d) {
                  var5.a(false, vn.field_H, 7);
                  break L3;
                } else {
                  if ((param1.field_d ^ -1) != -7) {
                    break L3;
                  } else {
                    var5.a(false, cb.field_p, 9);
                    break L3;
                  }
                }
              }
            }
            this.b((byte) 106, var5);
            if (param0 == -7) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_Eb = (dk) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("qf.L(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
