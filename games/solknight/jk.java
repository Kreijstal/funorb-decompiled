/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends ci implements ka {
    private boolean field_tb;
    private rf field_vb;
    private boolean field_wb;
    static da field_ub;

    jk(i param0, rf param1) {
        super(param0, uc.field_g, rc.field_p, false, false);
        try {
            ((jk) this).field_vb = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void n() {
        field_ub = null;
    }

    public final void a(int param0, int param1, int param2, pj param3, boolean param4) {
        if (((jk) this).field_wb) {
            hl.a(true, 24574, false);
            return;
        }
        try {
            ua.a((byte) -110);
            ((jk) this).f(param4);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "jk.I(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    private final void a(boolean param0, byte param1, wg param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        lj var5 = null;
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
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ((jk) this).field_tb = true;
              if (param2.field_c) {
                var4_ref = lk.field_d;
                break L1;
              } else {
                if (null == param2.field_a) {
                  var4_ref = param2.field_d;
                  if (param2.field_b == 248) {
                    L2: {
                      if (!param0) {
                        pk.i(918092705);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((jk) this).field_wb = true;
                    var4_ref = ce.field_a;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = pc.field_d;
                  if (null != ((jk) this).field_vb) {
                    ((jk) this).field_vb.a((byte) 22);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new lj((ci) this, uc.field_g, var4_ref);
              if (!param2.field_c) {
                L4: {
                  if (((jk) this).field_wb) {
                    pj discarded$2 = var5.a(0, dd.field_a, (dg) this);
                    break L4;
                  } else {
                    if (param2.field_b == 5) {
                      var5.a(11, cl.field_k, 1);
                      var5.a(17, ph.field_e, 1);
                      break L4;
                    } else {
                      var5.a(-1, u.field_e, 1);
                      break L4;
                    }
                  }
                }
                if (3 != param2.field_b) {
                  if (6 == param2.field_b) {
                    var5.a(9, ik.field_d, 1);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(7, qd.field_a, 1);
                  break L3;
                }
              } else {
                if (!param2.field_f) {
                  pj discarded$3 = var5.a(0, dd.field_a, (dg) this);
                  break L3;
                } else {
                  ((jk) this).c(-3399, (rc) (Object) new qe((jk) this));
                  return;
                }
              }
            }
            ((jk) this).c(-3399, (rc) (Object) var5);
            if (param1 > 19) {
              break L0;
            } else {
              ((jk) this).field_tb = false;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("jk.QA(").append(param0).append(44).append(param1).append(44);
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
          throw fc.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
    }

    final void h(byte param0) {
        this.a(true, (byte) 58, mh.a(248, true, ce.field_a));
        if (param0 != -63) {
            ((jk) this).field_wb = false;
        }
    }

    final boolean h(int param0) {
        wg var2 = null;
        if (param0 == 1784) {
          if (((jk) this).field_J) {
            if (!((jk) this).field_tb) {
              int discarded$4 = 83;
              var2 = r.b();
              if (var2 == null) {
                return super.h(1784);
              } else {
                this.a(false, (byte) 97, var2);
                return super.h(1784);
              }
            } else {
              return super.h(1784);
            }
          } else {
            return super.h(1784);
          }
        } else {
          ((jk) this).field_vb = null;
          if (((jk) this).field_J) {
            if (!((jk) this).field_tb) {
              int discarded$5 = 83;
              var2 = r.b();
              if (var2 == null) {
                return super.h(1784);
              } else {
                this.a(false, (byte) 97, var2);
                return super.h(1784);
              }
            } else {
              return super.h(1784);
            }
          } else {
            return super.h(1784);
          }
        }
    }

    final static int i() {
        return ak.field_a;
    }

    static {
    }
}
