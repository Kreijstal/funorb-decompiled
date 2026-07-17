/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends dh implements ai {
    private boolean field_lb;
    private boolean field_kb;
    private rf field_jb;
    static int field_fb;
    static ki field_hb;
    static String field_gb;
    static pk field_ib;

    final boolean d(boolean param0) {
        qj var2 = null;
        if (!param0) {
          if (((ig) this).field_A) {
            if (!((ig) this).field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        } else {
          field_ib = null;
          if (((ig) this).field_A) {
            if (!((ig) this).field_lb) {
              var2 = l.a((byte) -20);
              if (var2 == null) {
                return super.d(false);
              } else {
                this.a(false, (byte) 126, var2);
                return super.d(false);
              }
            } else {
              return super.d(false);
            }
          } else {
            return super.d(false);
          }
        }
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        if (!(!((ig) this).field_kb)) {
            wj.a(-108, false, true);
            return;
        }
        try {
            int var6_int = -48 % ((-3 - param0) / 62);
            mh.b((byte) -57);
            ((ig) this).q(4210752);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ig.M(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    public static void r(int param0) {
        field_ib = null;
        field_gb = null;
        field_hb = null;
        if (param0 != 11285) {
            ig.r(29);
        }
    }

    private final void a(boolean param0, byte param1, qj param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        ec var5 = null;
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              ((ig) this).field_lb = true;
              if (param2.field_f) {
                var4_ref = bd.field_m;
                break L1;
              } else {
                if (param2.field_c != null) {
                  var4_ref = j.field_c;
                  if (null != ((ig) this).field_jb) {
                    ((ig) this).field_jb.a((byte) -8);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param2.field_e;
                  if (param2.field_b != 248) {
                    break L1;
                  } else {
                    if (param0) {
                      var4_ref = tb.field_a;
                      ((ig) this).field_kb = true;
                      break L1;
                    } else {
                      km.a(16711935);
                      var4_ref = tb.field_a;
                      ((ig) this).field_kb = true;
                      break L1;
                    }
                  }
                }
              }
            }
            if (param1 >= 115) {
              L2: {
                var5 = new ec((dh) this, qc.field_b, var4_ref);
                if (param2.field_f) {
                  if (param2.field_d) {
                    ((ig) this).a(false, (pj) (Object) new ob((ig) this));
                    return;
                  } else {
                    s discarded$2 = var5.a(sk.field_C, -34, (ag) this);
                    break L2;
                  }
                } else {
                  L3: {
                    if (((ig) this).field_kb) {
                      s discarded$3 = var5.a(sk.field_C, -34, (ag) this);
                      break L3;
                    } else {
                      if (param2.field_b == 5) {
                        var5.a(vc.field_n, 11, -15858);
                        var5.a(ld.field_d, 17, -15858);
                        break L3;
                      } else {
                        var5.a(vc.field_i, -1, -15858);
                        break L3;
                      }
                    }
                  }
                  if (3 != param2.field_b) {
                    if (6 != param2.field_b) {
                      break L2;
                    } else {
                      var5.a(qf.field_k, 9, -15858);
                      break L2;
                    }
                  } else {
                    var5.a(vk.field_y, 7, -15858);
                    break L2;
                  }
                }
              }
              ((ig) this).a(false, (pj) (Object) var5);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("ig.N(").append(param0).append(44).append(param1).append(44);
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
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L4;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    ig(sk param0, rf param1) {
        super(param0, qc.field_b, bh.field_f, false, false);
        try {
            ((ig) this).field_jb = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ig.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void f(byte param0) {
        int var2 = -19 % ((-21 - param0) / 42);
        this.a(true, (byte) 122, oe.a(248, tb.field_a, -3));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "NORMO";
        field_fb = 0;
    }
}
