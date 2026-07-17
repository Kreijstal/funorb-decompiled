/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends ck implements oi {
    private boolean field_lb;
    private mj field_nb;
    static String field_ob;
    static int field_pb;
    private boolean field_mb;

    final void p(int param0) {
        this.a(fb.a(248, true, ki.field_r), -8895, true);
        if (param0 < 77) {
            ((jg) this).field_nb = null;
        }
    }

    jg(ei param0, mj param1) {
        super(param0, s.field_c, vj.field_b, false, false);
        try {
            ((jg) this).field_nb = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "jg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(pf param0, pf param1, byte param2) {
        try {
            vf.field_E = param0;
            nh.field_g = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "jg.WB(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 118 + 41);
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        if (!(!((jg) this).field_lb)) {
            th.a(false, true, 4);
            return;
        }
        if (param3) {
            return;
        }
        try {
            ai.a((byte) 98);
            ((jg) this).o(3);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "jg.M(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void a(ml param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        vf var5 = null;
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            if (param1 == -8895) {
              L1: {
                ((jg) this).field_mb = true;
                if (!param0.field_f) {
                  if (null == param0.field_d) {
                    var4_ref = param0.field_e;
                    if (248 == param0.field_g) {
                      L2: {
                        if (!param2) {
                          di.a(1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      ((jg) this).field_lb = true;
                      var4_ref = ki.field_r;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var4_ref = jb.field_p;
                    if (((jg) this).field_nb != null) {
                      ((jg) this).field_nb.a(param1 ^ 8915);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_ref = mb.field_a;
                  break L1;
                }
              }
              L3: {
                var5 = new vf((ck) this, s.field_c, var4_ref);
                if (!param0.field_f) {
                  L4: {
                    if (!((jg) this).field_lb) {
                      if (5 == param0.field_g) {
                        var5.a(param1 + -22910, 11, gj.field_s);
                        var5.a(-31805, 17, wc.field_z);
                        break L4;
                      } else {
                        var5.a(-31805, -1, bk.field_e);
                        break L4;
                      }
                    } else {
                      ig discarded$2 = var5.a((lf) this, tc.field_q, (byte) 118);
                      break L4;
                    }
                  }
                  if (param0.field_g == 3) {
                    var5.a(-31805, 7, gh.field_a);
                    break L3;
                  } else {
                    if (6 != param0.field_g) {
                      break L3;
                    } else {
                      var5.a(-31805, 9, a.field_d);
                      break L3;
                    }
                  }
                } else {
                  if (!param0.field_a) {
                    ig discarded$3 = var5.a((lf) this, tc.field_q, (byte) -125);
                    break L3;
                  } else {
                    ((jg) this).b((rj) (Object) new sj((jg) this), param1 ^ -30938);
                    return;
                  }
                }
              }
              ((jg) this).b((rj) (Object) var5, 23143);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("jg.VB(");
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
          throw ma.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean d(boolean param0) {
        ml var2 = null;
        if (((jg) this).field_G) {
          if (!((jg) this).field_mb) {
            var2 = mj.i(0);
            if (var2 == null) {
              if (!param0) {
                int discarded$4 = jg.i((byte) -113);
                return super.d(true);
              } else {
                return super.d(true);
              }
            } else {
              this.a(var2, -8895, false);
              if (!param0) {
                int discarded$5 = jg.i((byte) -113);
                return super.d(true);
              } else {
                return super.d(true);
              }
            }
          } else {
            if (!param0) {
              int discarded$6 = jg.i((byte) -113);
              return super.d(true);
            } else {
              return super.d(true);
            }
          }
        } else {
          if (!param0) {
            int discarded$7 = jg.i((byte) -113);
            return super.d(true);
          } else {
            return super.d(true);
          }
        }
    }

    public static void e(boolean param0) {
        field_ob = null;
    }

    final static int i(byte param0) {
        if (param0 != 113) {
            jg.e(true);
            return u.field_k;
        }
        return u.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Achieved";
    }
}
