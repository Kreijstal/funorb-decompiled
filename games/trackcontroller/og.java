/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends jj implements m {
    static int field_pb;
    static ih field_rb;
    static String field_qb;
    private vd field_mb;
    private boolean field_lb;
    static String field_nb;
    private boolean field_ob;

    og(vl param0, vd param1) {
        super(param0, p.field_a, sa.field_J, false, false);
        try {
            ((og) this).field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean j(int param0) {
        nj var2 = null;
        if (param0 < -18) {
          if (((og) this).field_E) {
            if (!((og) this).field_ob) {
              int discarded$4 = 91;
              var2 = dd.d();
              if (var2 == null) {
                return super.j(-56);
              } else {
                int discarded$5 = 7;
                this.a(false, var2);
                return super.j(-56);
              }
            } else {
              return super.j(-56);
            }
          } else {
            return super.j(-56);
          }
        } else {
          return false;
        }
    }

    final static void f() {
        fi.field_o = false;
        int discarded$0 = ne.field_a.h(16383);
    }

    final void u(int param0) {
        int discarded$0 = 7;
        this.a(true, wg.a((byte) -123, 248, pi.field_h));
        int var2 = 58 % ((param0 - -61) / 57);
    }

    private final void a(boolean param0, nj param1) {
        RuntimeException var4 = null;
        String var4_ref = null;
        lc var5 = null;
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
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              ((og) this).field_ob = true;
              if (param1.field_e) {
                var4_ref = tk.field_s;
                break L1;
              } else {
                if (null == param1.field_a) {
                  var4_ref = param1.field_c;
                  if (248 != param1.field_b) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        int discarded$3 = 1;
                        db.b();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = pi.field_h;
                    ((og) this).field_lb = true;
                    break L1;
                  }
                } else {
                  var4_ref = ga.field_f;
                  if (((og) this).field_mb != null) {
                    ((og) this).field_mb.a((byte) 121);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new lc((jj) this, p.field_a, var4_ref);
              if (param1.field_e) {
                if (param1.field_f) {
                  ((og) this).b((al) (Object) new ge((og) this), -115);
                  return;
                } else {
                  rh discarded$4 = var5.a(-14, (tg) this, hd.field_m);
                  break L3;
                }
              } else {
                L4: {
                  if (((og) this).field_lb) {
                    rh discarded$5 = var5.a(-14, (tg) this, hd.field_m);
                    break L4;
                  } else {
                    if (param1.field_b == 5) {
                      var5.a(-17040, dh.field_r, 11);
                      var5.a(-17040, cg.field_b, 17);
                      break L4;
                    } else {
                      var5.a(-17040, ea.field_p, -1);
                      break L4;
                    }
                  }
                }
                if (-4 != param1.field_b) {
                  if (-7 == param1.field_b) {
                    var5.a(-17040, md.field_c, 9);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(-17040, ea.field_y, 7);
                  break L3;
                }
              }
            }
            ((og) this).b((al) (Object) var5, -102);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("og.T(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ',' + 7 + ')');
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((og) this).field_lb) {
              nk.a(true, -126, false);
              return;
            } else {
              L1: {
                nh.a((byte) 122);
                ((og) this).t(20252);
                if (param4 == -27322) {
                  break L1;
                } else {
                  ((og) this).field_ob = true;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("og.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void v() {
        int var1 = -33;
        field_rb = null;
        field_nb = null;
        field_qb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_qb = "Mine";
        field_nb = "Your email address is used to identify this account";
    }
}
