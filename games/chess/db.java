/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int var2;
        var2 = Chess.field_G;
        if (param0 > -9) {
          db.d(false);
          if (!oc.field_p.field_m) {
            if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) == 0) {
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
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
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c ^ -1)) {
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
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
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
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
            if (-1 == (1 << oc.field_p.field_a & oc.field_p.field_B.field_c ^ -1)) {
              if (-1 == (oc.field_p.field_B.field_c ^ -1)) {
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

    final static void h(int param0) {
        if (param0 != 12082) {
            return;
        }
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
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_q.a((byte) -114, param0) != qk.field_b) {
              if (param1 == -9316) {
                if (this.a((byte) -117, param0) != qk.field_b) {
                  stackIn_10_0 = ie.field_c;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_8_0 = v.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = (String) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.field_q.a(param0, -9316);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("db.D(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              return stackIn_10_0;
            }
          }
        }
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mh var4 = null;
        mk stackIn_3_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 28 / ((-49 - param0) / 62);
            if (this.field_q.a((byte) -116, param1) == qk.field_b) {
              stackIn_3_0 = qk.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (!param1.equals(this.field_l)) {
                  var4 = va.a(26447, param1);
                  if (var4.b((byte) 123)) {
                    this.field_l = param1;
                    this.field_o = var4.c(-79);
                    break L1;
                  } else {
                    stackIn_8_0 = ek.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_o) {
                  stackIn_13_0 = qk.field_b;
                  break L2;
                } else {
                  stackIn_13_0 = oa.field_a;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("db.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        nk var3;
        var3 = qn.field_U;
        var3.f(param0, -83);
        var3.c(3, (byte) 83);
        var3.c(9, (byte) 103);
        if (param2 != 28113) {
          return;
        } else {
          var3.b(param1, 113);
          return;
        }
    }

    final static ci j(int param0) {
        if (param0 != -1) {
            db.a(33, 69, -51);
            return se.field_S.field_Kb;
        }
        return se.field_S.field_Kb;
    }

    db(qn param0, qn param1) {
        super(param0);
        this.field_o = false;
        this.field_l = "";
        try {
            this.field_q = new oc(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = 0;
        field_n = new int[8192];
    }
}
