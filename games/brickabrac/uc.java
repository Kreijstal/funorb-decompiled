/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends k {
    static me field_k;
    static String[] field_m;
    private String field_n;
    private cb field_p;
    private boolean field_o;
    static ta field_l;
    static String field_r;
    static vl field_q;

    final static java.applet.Applet e(byte param0) {
        if (null != sl.field_x) {
            return sl.field_x;
        }
        if (param0 >= -60) {
            field_m = (String[]) null;
        }
        return (java.applet.Applet) ((Object) so.field_f);
    }

    final qh a(String param0, byte param1) {
        ac var3 = null;
        RuntimeException var3_ref = null;
        qh stackIn_2_0 = null;
        qh stackIn_8_0 = null;
        qh stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_p.a(param0, param1) != lp.field_xb) {
              L1: {
                if (!param0.equals(this.field_n)) {
                  var3 = hg.a(0, param0);
                  if (!var3.b(96)) {
                    stackIn_8_0 = hq.field_z;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    this.field_n = param0;
                    this.field_o = var3.a(false);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!this.field_o) {
                  stackIn_13_0 = lp.field_xb;
                  break L2;
                } else {
                  stackIn_13_0 = ae.field_c;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = lp.field_xb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uc.B(");

            if (param0 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    final String a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 27 / ((-16 - param0) / 50);
            if (this.field_p.a(param1, (byte) 106) != lp.field_xb) {
              if (this.a(param1, (byte) 106) == lp.field_xb) {
                stackIn_6_0 = sn.field_s;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return to.field_l;
              }
            } else {
              stackIn_2_0 = this.field_p.a(37, param1);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("uc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L1;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    uc(vb param0, vb param1) {
        super(param0);
        this.field_n = "";
        this.field_o = false;
        try {
            this.field_p = new cb(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "uc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
            field_q = (vl) null;
        }
        field_r = null;
        field_l = null;
        field_m = null;
        field_k = null;
        field_q = null;
    }

    final static void e(int param0) {
        tk var2 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        try {
            int var1_int = 9 % ((-59 - param0) / 35);
            rk.field_Tb = null;
            fo.field_h = 0;
            ol.field_w = 0;
            bf.field_N.c((byte) -72);
            jq.field_n.c((byte) -92);
            var2 = of.field_i.b((byte) 74);
            while (var2 != null) {
                var2.d(3);
                var2 = of.field_i.a(false);
            }
            var2 = tf.field_d.b((byte) 122);
            while (var2 != null) {
                var2.d(3);
                var2 = tf.field_d.a(false);
            }
            wk.field_m = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "uc.G(" + param0 + ')');
        }
    }

    final static String[] a(int param0, String param1, byte param2) {
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String[] stackIn_3_0 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3 = new String[param0];
            if (param2 == -1) {
              var4 = 0;
              L1: while (true) {
                if (var4 >= param0) {
                  stackIn_8_0 = (String[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3[var4] = param1 + "_0" + var4;
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = (String[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("uc.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static boolean f(int param0) {
        if (param0 != 21651) {
            return false;
        }
        return va.field_a;
    }

    static {
        field_r = "Match by...";
        field_m = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_k = new me("email");
        field_q = new vl();
    }
}
