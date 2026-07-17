/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends rg implements sh {
    private boolean field_yb;
    private ik field_Ab;
    static bj field_xb;
    private boolean field_zb;

    final boolean n(int param0) {
        ed var2 = null;
        if (param0 == -4) {
          if (((uk) this).field_K) {
            if (!((uk) this).field_yb) {
              int discarded$2 = -107;
              var2 = pa.a();
              if (var2 != null) {
                this.a(var2, 11, false);
                return super.n(-4);
              } else {
                return super.n(-4);
              }
            } else {
              return super.n(-4);
            }
          } else {
            return super.n(-4);
          }
        } else {
          return true;
        }
    }

    uk(hm param0, ik param1) {
        super(param0, cn.field_g, vh.field_e, false, false);
        try {
            ((uk) this).field_Ab = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "uk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        if (param1 != 6) {
            field_xb = null;
        }
        if (((uk) this).field_zb) {
            ie.a(false, true, -84);
            return;
        }
        try {
            pb.d(25);
            ((uk) this).s(param1 ^ 2121798);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "uk.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void j(byte param0) {
        field_xb = null;
        if (param0 != -42) {
            uk.j((byte) -31);
        }
    }

    private final void a(ed param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        fm var5 = null;
        int var6 = 0;
        Object var7 = null;
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
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              ((uk) this).field_yb = true;
              if (!param0.field_c) {
                if (param0.field_d != null) {
                  var4_ref = hm.field_L;
                  if (((uk) this).field_Ab != null) {
                    ((uk) this).field_Ab.a((byte) 47);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = param0.field_h;
                  if (param0.field_e != 248) {
                    break L1;
                  } else {
                    L2: {
                      if (!param2) {
                        h.a(false);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = gn.field_c;
                    ((uk) this).field_zb = true;
                    break L1;
                  }
                }
              } else {
                var4_ref = he.field_d;
                break L1;
              }
            }
            L3: {
              var5 = new fm((rg) this, cn.field_g, var4_ref);
              if (param0.field_c) {
                if (param0.field_i) {
                  ((uk) this).a((byte) -53, (fe) (Object) new ba((uk) this));
                  return;
                } else {
                  hc discarded$2 = var5.a(oh.field_A, 53, (rm) this);
                  break L3;
                }
              } else {
                L4: {
                  if (!((uk) this).field_zb) {
                    if (5 == param0.field_e) {
                      var5.a(11, pc.field_i, -56);
                      var5.a(17, o.field_b, -117);
                      break L4;
                    } else {
                      var5.a(-1, hk.field_d, param1 ^ -107);
                      break L4;
                    }
                  } else {
                    hc discarded$3 = var5.a(oh.field_A, 82, (rm) this);
                    break L4;
                  }
                }
                if (param0.field_e != 3) {
                  if (param0.field_e == 6) {
                    var5.a(9, gj.field_b, param1 ^ -115);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(7, wb.field_q, -77);
                  break L3;
                }
              }
            }
            ((uk) this).a((byte) -99, (fe) (Object) var5);
            if (param1 == 11) {
              break L0;
            } else {
              var7 = null;
              this.a((ed) null, -124, true);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("uk.G(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void t(int param0) {
        int discarded$0 = 1;
        this.a(ij.a(248, gn.field_c), 11, true);
        if (param0 != 23101) {
            ((uk) this).field_yb = true;
        }
    }

    static {
    }
}
