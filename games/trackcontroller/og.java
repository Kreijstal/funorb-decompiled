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
            this.field_mb = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "og.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean j(int param0) {
        nj var2;
        if (param0 < -18) {
          if (this.field_E) {
            if (!this.field_ob) {
              var2 = dd.d((byte) 91);
              if (var2 == null) {
                return super.j(-56);
              } else {
                this.a(false, var2, 7);
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

    final static void f(byte param0) {
        fi.field_o = false;
        if (param0 != -83) {
            return;
        }
        ne.field_a.h(16383);
    }

    final void u(int param0) {
        this.a(true, wg.a((byte) -123, 248, pi.field_h), 7);
        int var2 = 58 % ((param0 - -61) / 57);
    }

    private final void a(boolean param0, nj param1, int param2) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        lc var5 = null;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_ob = true;
              if (param1.field_e) {
                var4 = tk.field_s;
                break L1;
              } else {
                if (null == param1.field_a) {
                  var4 = param1.field_c;
                  if (248 != param1.field_b) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        db.b(true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4 = pi.field_h;
                    this.field_lb = true;
                    break L1;
                  }
                } else {
                  var4 = ga.field_f;
                  if (this.field_mb != null) {
                    this.field_mb.a((byte) 121);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new lc((jj) (this), p.field_a, var4);
              if (param1.field_e) {
                if (param1.field_f) {
                  this.b(new ge((og) (this)), param2 ^ -118);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a(param2 + -21, (tg) (this), hd.field_m);
                  break L3;
                }
              } else {
                L4: {
                  if (this.field_lb) {
                    var5.a(-14, (tg) (this), hd.field_m);
                    break L4;
                  } else {
                    if (param1.field_b == 5) {
                      var5.a(-17040, dh.field_r, 11);
                      var5.a(-17040, cg.field_b, 17);
                      break L4;
                    } else {
                      var5.a(param2 ^ -17033, ea.field_p, -1);
                      break L4;
                    }
                  }
                }
                if (-4 != (param1.field_b ^ -1)) {
                  if (-7 == (param1.field_b ^ -1)) {
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
            if (param2 == 7) {
              this.b(var5, param2 + -109);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4_ref);

            stackIn_34_1 = new StringBuilder().append("og.T(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(rh param0, int param1, int param2, int param3, int param4) {
        if (!(!this.field_lb)) {
            nk.a(true, -126, false);
            return;
        }
        try {
            nh.a((byte) 122);
            this.t(20252);
            if (param4 != -27322) {
                this.field_ob = true;
            }
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "og.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void v(int param0) {
        int var1 = -66 / ((21 - param0) / 62);
        field_rb = null;
        field_nb = null;
        field_qb = null;
    }

    static {
        field_qb = "Mine";
        field_nb = "Your email address is used to identify this account";
    }
}
