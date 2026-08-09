/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ln extends hl {
    static jn field_k;
    long field_i;
    ln field_n;
    static String field_j;
    static String field_m;
    ln field_l;

    final static float a(int param0, float param1) {
        if (param0 != -29407) {
            return -0.6477053165435791f;
        }
        if (param1 > 0.0f) {
            return 1.0f;
        }
        if (param1 < 0.0f) {
            return -1.0f;
        }
        return 0.0f;
    }

    final static e a(int param0, byte param1) {
        e[] var2;
        int var3;
        int var4;
        e[] var5;
        L0: {
          var4 = HoldTheLine.field_D;
          if (param1 < -50) {
            break L0;
          } else {
            field_k = (jn) null;
            break L0;
          }
        }
        var5 = wg.a(4);
        var2 = var5;
        var3 = 0;
        L1: while (true) {
          if (var3 < var5.length) {
            if (param0 == var5[var3].field_f) {
              return var5[var3];
            } else {
              var3++;
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    public static void e(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 0) {
            return;
        }
        field_j = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ln.a(11, 0.5669122934341431f);
                break L1;
              }
            }
            stackIn_3_0 = tl.field_w.a(param0, false, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ln.DB(");

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0) {
        if (this.field_l == null) {
            return;
        }
        if (param0 != -42) {
            field_j = (String) null;
        }
        this.field_l.field_n = this.field_n;
        this.field_n.field_l = this.field_l;
        this.field_n = null;
        this.field_l = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 >= 92) {
                break L1;
              } else {
                ln.a(11, -0.14343492686748505f);
                break L1;
              }
            }
            if (ii.a((byte) -118)) {
              r.field_a.a(ab.field_lb, di.field_r, true, false);
              r.field_a.g((byte) -59);
              L2: while (true) {
                if (!qh.c(-44)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  r.field_a.a(aa.field_n, pk.field_M, (byte) 117);
                  continue L2;
                }
              }
            } else {
              L3: {
                if (null == cc.field_w) {
                  break L3;
                } else {
                  if (!cc.field_w.field_a) {
                    break L3;
                  } else {
                    ij.c(4);
                    r.field_a.a(new rf(r.field_a, sk.field_a), false);
                    break L3;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "ln.EB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    protected ln() {
    }

    static {
        field_j = "Achieved";
        field_m = "DNF";
    }
}
