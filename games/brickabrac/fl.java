/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl extends k {
    private String field_k;
    static long field_l;
    static String field_m;
    private boolean field_n;

    final static void f(byte param0) {
        int var1 = 50 / ((31 - param0) / 52);
        vq.field_J = null;
        go.field_e = 0;
        th.field_h = false;
        b.field_a = -1;
        ad.field_j = -1;
    }

    final static void e(int param0) {
        jp var1 = null;
        jp var3 = null;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        try {
            var1 = new jp(540, 140);
            int var2 = 5 / ((16 - param0) / 50);
            fc.a(-89, var1);
            mg.c();
            lb.d();
            ld.field_t = 0;
            jl.b(-115);
            var3 = var1.e();
            for (var4 = 0; 15 > var4; var4++) {
                var3.d(-2, -2, 16777215);
                lb.e(4, 4, 0, 0, 540, 140);
            }
            aa.field_b.g();
            var1.a(0, 0);
            sc.b(-123);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "fl.Q(" + param0 + ')');
        }
    }

    final String a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        oh var4_ref_oh = null;
        int var4 = 0;
        CharSequence var5 = null;
        String stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = (CharSequence) ((Object) param1);
            var3 = th.a(var5, -106);
            if (var3 != null) {
              stackIn_3_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1.equals(this.field_k)) {
                  break L1;
                } else {
                  var4_ref_oh = qc.a(param1, 0);
                  if (var4_ref_oh != null) {
                    if (null == var4_ref_oh.field_g) {
                      this.field_n = var4_ref_oh.field_c;
                      this.field_k = param1;
                      break L1;
                    } else {
                      stackIn_9_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_n) {
                var4 = 21 / ((-16 - param0) / 50);
                stackIn_15_0 = gk.field_d;
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                stackIn_13_0 = ng.field_f;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3_ref);

            stackIn_18_1 = new StringBuilder().append("fl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (String) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_15_0;
            }
          }
        }
    }

    final static void b(boolean param0) {
        if (!param0) {
            fl.f((byte) -72);
            fp.field_A.setLength(0);
            ng.field_b = 0;
            return;
        }
        fp.field_A.setLength(0);
        ng.field_b = 0;
    }

    fl(vb param0) {
        super(param0);
        this.field_n = false;
    }

    public static void f(int param0) {
        if (param0 >= -35) {
            field_l = 72L;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final qh a(String param0, byte param1) {
        oh var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        qh stackIn_4_0 = null;
        qh stackIn_11_0 = null;
        qh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 106) {
                break L1;
              } else {
                fl.f((byte) -106);
                break L1;
              }
            }
            var4 = (CharSequence) ((Object) param0);
            if (se.a(17165, var4)) {
              L2: {
                if (!param0.equals(this.field_k)) {
                  L3: {
                    var3 = qc.a(param0, 0);
                    if (var3 == null) {
                      break L3;
                    } else {
                      if (var3.field_g != null) {
                        break L3;
                      } else {
                        this.field_k = param0;
                        this.field_n = var3.field_c;
                        break L2;
                      }
                    }
                  }
                  stackIn_11_0 = hq.field_z;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
              L4: {
                if (!this.field_n) {
                  stackIn_16_0 = lp.field_xb;
                  break L4;
                } else {
                  stackIn_16_0 = ae.field_c;
                  break L4;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_4_0 = lp.field_xb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3_ref);

            stackIn_19_1 = new StringBuilder().append("fl.B(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_16_0;
          }
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -28734) {
                break L1;
              } else {
                field_m = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = sq.a((byte) -32, 10, true, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("fl.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void e(byte param0) {
        this.field_k = null;
        if (param0 != -22) {
            this.e((byte) -82);
        }
    }

    static {
        field_m = "Orb coins: ";
    }
}
