/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class db extends vm {
    static int field_p;
    private boolean field_o;
    static int[] field_n;
    private oc field_q;
    static String[] field_m;
    private String field_l;

    public static void d(boolean param0) {
        field_m = null;
        if (!param0) {
            return;
        }
        field_n = null;
    }

    final static void i(int param0) {
        int var2 = 0;
        var2 = Chess.field_G;
        if (param0 > -9) {
          db.d(false);
          if (!oc.field_p.field_m) {
            if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) == 0) {
              if (oc.field_p.field_B.field_c == 0) {
                if ((1 << oc.field_p.field_B.field_h) + -1 != (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
                  fm.field_R[36] = od.field_U;
                  return;
                } else {
                  fm.field_R[36] = vh.field_h;
                  return;
                }
              } else {
                fm.field_R[36] = qa.field_d;
                return;
              }
            } else {
              fm.field_R[36] = jh.field_d;
              return;
            }
          } else {
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c)) {
              if (-1 == oc.field_p.field_B.field_c) {
                if ((oc.field_p.field_A | 1 << oc.field_p.field_a) != -1 + (1 << oc.field_p.field_B.field_h)) {
                  fm.field_R[36] = hk.field_J;
                  return;
                } else {
                  fm.field_R[36] = jc.field_c;
                  return;
                }
              } else {
                fm.field_R[36] = ig.field_e;
                return;
              }
            } else {
              fm.field_R[36] = dj.field_w;
              return;
            }
          }
        } else {
          if (!oc.field_p.field_m) {
            if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) == 0) {
              if (oc.field_p.field_B.field_c == 0) {
                if ((1 << oc.field_p.field_B.field_h) + -1 != (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
                  fm.field_R[36] = od.field_U;
                  return;
                } else {
                  fm.field_R[36] = vh.field_h;
                  return;
                }
              } else {
                fm.field_R[36] = qa.field_d;
                return;
              }
            } else {
              fm.field_R[36] = jh.field_d;
              return;
            }
          } else {
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c)) {
              if (-1 == oc.field_p.field_B.field_c) {
                if ((oc.field_p.field_A | 1 << oc.field_p.field_a) != -1 + (1 << oc.field_p.field_B.field_h)) {
                  fm.field_R[36] = hk.field_J;
                  return;
                } else {
                  fm.field_R[36] = jc.field_c;
                  return;
                }
              } else {
                fm.field_R[36] = ig.field_e;
                return;
              }
            } else {
              fm.field_R[36] = dj.field_w;
              return;
            }
          }
        }
    }

    final static void h() {
        if (!ad.field_b) {
            throw new IllegalStateException();
        }
        vh.field_e = true;
        vf.a(true, -125);
        rm.field_Q = 0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_4_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((db) this).field_q.a((byte) -114, param0) != qk.field_b) {
              if (param1 == -9316) {
                if (((db) this).a((byte) -117, param0) != qk.field_b) {
                  stackOut_9_0 = ie.field_c;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = v.field_h;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (String) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = ((db) this).field_q.a(param0, -9316);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("db.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mh var4 = null;
        mk stackIn_3_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        mk stackOut_2_0 = null;
        mk stackOut_7_0 = null;
        mk stackOut_12_0 = null;
        mk stackOut_11_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var3_int = 28 / ((-49 - param0) / 62);
            if (((db) this).field_q.a((byte) -116, param1) == qk.field_b) {
              stackOut_2_0 = qk.field_b;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (!param1.equals((Object) (Object) ((db) this).field_l)) {
                  var4 = va.a(26447, param1);
                  if (var4.b((byte) 123)) {
                    ((db) this).field_l = param1;
                    ((db) this).field_o = var4.c(-79);
                    break L1;
                  } else {
                    stackOut_7_0 = ek.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!((db) this).field_o) {
                  stackOut_12_0 = qk.field_b;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = oa.field_a;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("db.B(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1) {
        nk var3 = qn.field_U;
        var3.f(param0, -83);
        var3.c(3, (byte) 83);
        var3.c(9, (byte) 103);
        var3.b(param1, 113);
    }

    final static ci j() {
        return se.field_S.field_Kb;
    }

    db(qn param0, qn param1) {
        super(param0);
        ((db) this).field_o = false;
        ((db) this).field_l = "";
        try {
            ((db) this).field_q = new oc(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_n = new int[8192];
    }
}
