/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh extends r {
    private c field_o;
    static int field_p;
    private c field_n;
    static int field_q;

    final static boolean a(String param0, int param1, String param2, boolean param3, ca param4, int param5, String param6) {
        int var7_int = 0;
        RuntimeException var7 = null;
        ua var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -71 / ((48 - param5) / 49);
          if (ql.field_l != cb.field_v) {
            return false;
          }
          var8 = new ua(nb.field_a, param4);
          nb.field_a.b(var8, (byte) -35);
          if (ti.b(10618)) {
            var8.h((byte) -114);
            return true;
          }
          cb.field_v = wi.field_f;
          ed.field_b = param3;
          ug.field_c = param1;
          ag.field_e = param0;
          ef.field_j = param2;
          rl.field_b = null;
          oa.field_o = param6;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("gh.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_28_0 = null;
        String stackIn_30_0 = null;
        String stackIn_32_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_n.field_i.toLowerCase();
          var4 = param1.toLowerCase();
          var5 = -56 / ((param0 - 24) / 46);
          if (var4.length() == 0) {
            return null;
          }
          var6 = var4;
          if (o.a(false, var6)) {
            stackIn_6_0 = vh.field_k;
            return stackIn_6_0;
          }
          if (fm.a(true, var6)) {
            stackIn_10_0 = qa.field_t;
            return stackIn_10_0;
          }
          if (hg.a(var6, 1)) {
            stackIn_13_0 = ge.field_b;
            return stackIn_13_0;
          }
          if (this.b(0, param1)) {
            stackIn_17_0 = id.field_j;
            return stackIn_17_0;
          }
          if (0 >= var7.length()) {
            stackIn_32_0 = ef.field_m;
            return stackIn_32_0;
          }
          if (hj.a(var6, var7, 0)) {
            stackIn_21_0 = te.field_i;
            return stackIn_21_0;
          }
          if (hf.a((byte) -67, var6, var7)) {
            stackIn_25_0 = el.field_B;
            return stackIn_25_0;
          }
          if (!gl.a(var7, -1, var6)) {
            stackIn_30_0 = vh.field_k;
            return stackIn_30_0;
          }
          stackIn_28_0 = te.field_i;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("gh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    gh(c param0, c param1, c param2) {
        super(param0);
        try {
          this.field_o = param2;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "gh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0) {
        int var4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        boolean stackIn_40_2 = false;
        qc stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4_long = 0L;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        qc var10 = null;
        int var11 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var11 = fleas.field_A ? 1 : 0;
        try {
          var1_int = rb.field_H;
          var2 = 0;
          var3 = -21 / ((param0 - 22) / 57);
          if (2 == vc.field_a) {
            var4_long = lj.a((byte) -48) - sd.field_h;
            var2 = (int)((10999L - var4_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var4 = 0; fb.field_d.length > var4; var4++) {
            var5 = m.field_c[var4];
            if (0 > var5) {
              var6 = cm.field_j;
            } else {
              if (var5 != bk.field_a.field_k) {
                var6 = fb.field_c;
              } else {
                var6 = rg.field_n;
              }
            }
            var7 = fb.field_d[var4];
            if (vc.field_a == 2 &&
              var2 == 1) {
              if (j.field_o.length < uk.field_a.length) {
                stackIn_18_0 = uk.field_a.length;
              } else {
                stackIn_18_0 = j.field_o.length;
              }
              var8 = stackIn_18_0;
              if (oe.field_c.length < rc.field_g.length) {
                stackIn_21_0 = rc.field_g.length;
              } else {
                stackIn_21_0 = oe.field_c.length;
              }
              var9 = stackIn_21_0;
              if (var4 >= 6 &&
                var4 < var8 + 6) {
                if (-var8 + (var4 + (-6 + j.field_o.length)) < 0) {
                  stackIn_27_0 = "";
                } else {
                  stackIn_27_0 = j.field_o[-var8 + (j.field_o.length + (var4 - 6))];
                }
                var7 = stackIn_27_0;
              }
              if (var4 >= 7 + var8 &&
                var4 < var8 + (7 + var9)) {
                if (oe.field_c.length <= -var8 + var4 - 7) {
                  stackIn_34_0 = "";
                } else {
                  stackIn_34_0 = oe.field_c[-var8 - 7 + var4];
                }
                var7 = stackIn_34_0;
              }
            }
            if (-2 == var5) {
              var7 = Integer.toString(var2);
            }
            stackIn_39_0 = 3;
            stackIn_39_1 = var7;
            stackIn_40_2 = !(var5 < 0);
            var8Lifetime1 = se.a(stackIn_39_0, stackIn_39_1, stackIn_40_2);
            var9Lifetime1 = -(var8Lifetime1 >> 1) + af.field_b;
            if (var5 >= 0) {
              var1_int = var1_int + id.field_c;
              if (bk.field_a.field_k == var5) {
                stackIn_44_0 = ub.field_a;
              } else {
                stackIn_44_0 = qg.field_b;
              }
              var10 = stackIn_44_0;
              if (var10 != null) {
                var10.a(-ae.field_c + var9Lifetime1, 0, var8Lifetime1 + (ae.field_c << 1), hb.field_t + (ge.field_h << 1), var1_int);
              }
              var1_int = var1_int + ge.field_h;
            }
            if (var5 >= 0) {
              lj.field_a.c(var7, var9Lifetime1, ta.field_y + var1_int, var6, -1);
              var1_int = var1_int + (ge.field_h + id.field_c + hb.field_t);
            } else {
              pb.field_e.c(var7, var9Lifetime1, var1_int + kh.field_g, var6, -1);
              var1_int = var1_int + cm.field_f;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "gh.B(" + param0 + ')');
        }
    }

    final wd a(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        wd stackIn_2_0 = null;
        wd stackIn_7_0 = null;
        wd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_n.field_i.toLowerCase();
          var4 = param1.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = ml.field_K;
            return stackIn_2_0;
          }
          if (param0 != 160) {
            this.field_n = (c) null;
          }
          if (!lh.a(var4, var3, -1)) {
            stackIn_7_0 = ml.field_K;
            return stackIn_7_0;
          }
          if (!this.b(0, param1)) {
            return hm.field_b;
          }
          stackIn_11_0 = ml.field_K;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("gh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final boolean b(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_o.field_i.toLowerCase();
          var4 = param1.toLowerCase();
          if (var3.length() > param0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              if (var4.indexOf(var7) >= 0) {
                return true;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("gh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_q = 0;
    }
}
