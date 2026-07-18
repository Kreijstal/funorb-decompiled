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
        int discarded$0 = 11;
        this.a(true, dq.a(248, 32, rl.field_i));
    }

    jq(lt param0, wd param1) {
        super(param0, b.field_c, pg.field_b, false, false);
        try {
            ((jq) this).field_db = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        if (!(!((jq) this).field_eb)) {
            hg.a(false, true, true);
            return;
        }
        try {
            fg.b(true);
            ((jq) this).h((byte) -15);
            int var6_int = -106 % ((-27 - param4) / 61);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jq.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, fr param1) {
        RuntimeException var4 = null;
        String var4_ref = null;
        jn var5 = null;
        int var6 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              ((jq) this).field_gb = true;
              if (param1.field_b) {
                var4_ref = aa.field_d;
                break L1;
              } else {
                if (null != param1.field_c) {
                  var4_ref = tb.field_e;
                  if (((jq) this).field_db == null) {
                    break L1;
                  } else {
                    ((jq) this).field_db.a((byte) -77);
                    break L1;
                  }
                } else {
                  var4_ref = param1.field_f;
                  if (param1.field_a != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param0) {
                        ua.c(0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = rl.field_i;
                    ((jq) this).field_eb = true;
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new jn((oo) this, b.field_c, var4_ref);
              if (param1.field_b) {
                if (param1.field_d) {
                  ((jq) this).d((ea) (Object) new rs((jq) this), -30244);
                  return;
                } else {
                  mi discarded$2 = var5.a((no) this, 17547, mq.field_i);
                  break L3;
                }
              } else {
                L4: {
                  if (!((jq) this).field_eb) {
                    if (param1.field_a == 5) {
                      var5.a(11, (byte) 105, ln.field_a);
                      var5.a(17, (byte) -126, mb.field_s);
                      break L4;
                    } else {
                      var5.a(-1, (byte) -51, eu.field_j);
                      break L4;
                    }
                  } else {
                    mi discarded$3 = var5.a((no) this, 17547, mq.field_i);
                    break L4;
                  }
                }
                if (-4 != param1.field_a) {
                  if (-7 != param1.field_a) {
                    break L3;
                  } else {
                    var5.a(9, (byte) -41, ao.field_d);
                    break L3;
                  }
                } else {
                  var5.a(7, (byte) -103, lu.field_a);
                  break L3;
                }
              }
            }
            ((jq) this).d((ea) (Object) var5, -30244);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("jq.KA(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + 11 + ')');
        }
    }

    final boolean h(int param0) {
        fr var2 = null;
        Object var3 = null;
        if (param0 == 11) {
          if (((jq) this).field_z) {
            if (!((jq) this).field_gb) {
              int discarded$8 = 86;
              var2 = oe.d();
              if (var2 != null) {
                int discarded$9 = 11;
                this.a(false, var2);
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
          var3 = null;
          ((jq) this).a(95, (mi) null, -21, 40, (byte) -17);
          if (((jq) this).field_z) {
            if (!((jq) this).field_gb) {
              int discarded$10 = 86;
              var2 = oe.d();
              if (var2 != null) {
                int discarded$11 = 11;
                this.a(false, var2);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = new dq();
    }
}
