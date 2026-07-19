/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends oo implements dn {
    static dq field_fb;
    private wd field_db;
    private boolean field_eb;
    private boolean field_gb;

    public static void m(int param0) {
        if (param0 < 61) {
            jq.m(-87);
            field_fb = null;
            return;
        }
        field_fb = null;
    }

    final void n(int param0) {
        int var2 = -27 / ((71 - param0) / 52);
        this.a(true, dq.a(248, 32, rl.field_i), 11);
    }

    jq(lt param0, wd param1) {
        super(param0, b.field_c, pg.field_b, false, false);
        try {
            this.field_db = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        if (!(!this.field_eb)) {
            hg.a(false, true, true);
            return;
        }
        try {
            fg.b(true);
            this.h((byte) -15);
            int var6_int = -106 % ((-27 - param4) / 61);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jq.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, fr param1, int param2) {
        mi discarded$2 = null;
        mi discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        jn var5 = null;
        int var6 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_gb = true;
              if (param2 == 11) {
                break L1;
              } else {
                this.field_eb = false;
                break L1;
              }
            }
            L2: {
              if (param1.field_b) {
                var4_ref = aa.field_d;
                break L2;
              } else {
                if (null != param1.field_c) {
                  var4_ref = tb.field_e;
                  if (this.field_db == null) {
                    break L2;
                  } else {
                    this.field_db.a((byte) -77);
                    break L2;
                  }
                } else {
                  var4_ref = param1.field_f;
                  if ((param1.field_a ^ -1) != -249) {
                    break L2;
                  } else {
                    L3: {
                      if (!param0) {
                        ua.c(0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4_ref = rl.field_i;
                    this.field_eb = true;
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new jn((oo) (this), b.field_c, var4_ref);
              if (param1.field_b) {
                if (param1.field_d) {
                  this.d(new rs((jq) (this)), -30244);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  discarded$2 = var5.a((no) (this), param2 + 17536, mq.field_i);
                  break L4;
                }
              } else {
                L5: {
                  if (!this.field_eb) {
                    if (param1.field_a == 5) {
                      var5.a(11, (byte) 105, ln.field_a);
                      var5.a(17, (byte) -126, mb.field_s);
                      break L5;
                    } else {
                      var5.a(-1, (byte) -51, eu.field_j);
                      break L5;
                    }
                  } else {
                    discarded$3 = var5.a((no) (this), param2 ^ 17536, mq.field_i);
                    break L5;
                  }
                }
                if (-4 != (param1.field_a ^ -1)) {
                  if (-7 != (param1.field_a ^ -1)) {
                    break L4;
                  } else {
                    var5.a(9, (byte) -41, ao.field_d);
                    break L4;
                  }
                } else {
                  var5.a(7, (byte) -103, lu.field_a);
                  break L4;
                }
              }
            }
            this.d(var5, -30244);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var4);
            stackOut_30_1 = new StringBuilder().append("jq.KA(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean h(int param0) {
        fr var2 = null;
        mi var3 = null;
        if (param0 == 11) {
          if (this.field_z) {
            if (!this.field_gb) {
              var2 = oe.d(86);
              if (var2 != null) {
                this.a(false, var2, 11);
                return super.h(11);
              } else {
                return super.h(11);
              }
            } else {
              return super.h(11);
            }
          } else {
            return super.h(11);
          }
        } else {
          var3 = (mi) null;
          this.a(95, (mi) null, -21, 40, (byte) -17);
          if (this.field_z) {
            if (!this.field_gb) {
              var2 = oe.d(86);
              if (var2 != null) {
                this.a(false, var2, 11);
                return super.h(11);
              } else {
                return super.h(11);
              }
            } else {
              return super.h(11);
            }
          } else {
            return super.h(11);
          }
        }
    }

    static {
        field_fb = new dq();
    }
}
