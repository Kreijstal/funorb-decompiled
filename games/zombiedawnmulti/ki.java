/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    int field_q;
    static ja field_k;
    static ic field_a;
    int field_c;
    int field_g;
    ja field_b;
    static String[][] field_o;
    static String field_n;
    static ul field_m;
    static String field_f;
    static String field_p;
    static String field_i;
    static ej field_h;
    static String field_j;
    static int[] field_d;
    static no field_e;
    static String field_l;

    public static void b(int param0) {
        field_h = null;
        field_e = null;
        field_a = null;
        field_l = null;
        field_k = null;
        field_i = null;
        field_j = null;
        field_o = (String[][]) null;
        field_d = null;
        field_p = null;
        field_n = null;
        field_f = null;
        field_m = null;
        if (param0 != -23636) {
          field_e = (no) null;
        }
    }

    final static String a(byte param0) {
        int var1 = -112 / ((-77 - param0) / 37);
        if (null == ta.field_lb) {
          return "";
        }
        return ta.field_lb;
    }

    final boolean b(byte param0) {
        if (param0 > 3) {
          return this.field_b.b(this.field_q, this.field_g, bd.field_g, bo.field_d);
        }
        ki.b(-41);
        return this.field_b.b(this.field_q, this.field_g, bd.field_g, bo.field_d);
    }

    final void a(boolean param0) {
        this.field_b.c(this.field_q, this.field_g);
        if (!param0) {
          ki.a(-85);
        }
    }

    final static void a(int param0) {
        if (t.field_e > 0) {
          t.field_e = t.field_e - 1;
        }
        if (param0 != 26) {
          field_h = (ej) null;
        }
        if (km.field_cb != dl.field_h.field_f) {
          vj.field_t = vj.field_t + (-km.field_cb + dl.field_h.field_f);
          km.field_cb = dl.field_h.field_f;
        }
        if (t.field_e > 0) {
          lk.g((byte) 63);
        }
    }

    final static String a(String param0, String param1, ul param2, byte param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a((byte) -116)) {
            stackIn_3_0 = (String) (param0);
            return stackIn_3_0;
          }
          if (param3 != 76) {
            var6 = (String) null;
            ki.a((String) null, (String) null, (ul) null, (byte) 113, (String) null);
          }
          stackIn_7_0 = param4 + " - " + param2.a(0, param1) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ki.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    ki(int param0, int param1, int param2) {
        String var10 = null;
        int var6 = 0;
        int var4 = 0;
        int var5 = 0;
        String var8 = null;
        int var9 = 0;
        String var10Lifetime1;
        String var10Lifetime2;
        String var10Lifetime3;
        String var8Lifetime1;
        String var8Lifetime2;
        String var10Lifetime4;
        String var10Lifetime5;
        String var10Lifetime6;
        String var8Lifetime3;
        String var10Lifetime1Lifetime1;
        String var10Lifetime1Lifetime2;
        String var8Lifetime1Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime3;
        int var4Lifetime3;
        int var5Lifetime3;
        int var6Lifetime1Lifetime1;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        this.field_b = new ja(137, 49);
        this.field_c = param0;
        this.field_g = param2;
        this.field_q = param1;
        g.c(this.field_b);
        Object var7 = null;
        if (0 > param0) {
          if (32 > param0 ||
            param0 > 38) {
            var6 = 1993752;
            if (ll.field_k.c(127, param0)) {
              var7 = wa.field_b[-44 + (param0 + 26)];
            }
            var4 = 280577;
            var5 = 2306851;
            var8 = fh.field_g;
            var9 = ll.field_k.field_t[param0];
            if (ll.field_k.d(param0, 53)) {
              var8 = vo.field_n;
              var9 = cr.a(param0, -117);
            } else {
              if (var9 != 0) {
                var8 = vl.a(fh.field_d, new String[]{Integer.toString(var9), Integer.toString(cr.a(param0, -83))}, 2);
              }
            }
            var9 = var9 * 131 / cr.a(param0, -110);
            oo.a(1, 1, 135, 47, var4, var5);
            oo.f(2, 2, 133, 30, 16777215, 32);
            oo.f(3, 3, 101, 28, 65793, 128);
            oo.f(106, 3, 28, 28, 65793, 128);
            oo.e(2, 33, 133, 14, 65793);
            oo.e(3, 34, var9, 12, var6);
            if (var7 != null) {
              ((ja) (var7)).g(108, 5);
            }
            if (!ll.field_k.c(127, param0)) {
              var10 = ro.field_N;
            } else {
              var10 = gh.field_f[param0];
            }
            qp.field_w.a(var10, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
            qp.field_w.b(var8, 68, 45, 16777215, -1);
            g.d();
            return;
          }
          if (ll.field_k.c(127, param0)) {
            var7 = wa.field_b[-13 + param0];
          }
          var6Lifetime3 = 8783880;
          var5Lifetime3 = 5053184;
          var4Lifetime3 = 8135424;
          var8Lifetime3 = fh.field_g;
          var9 = ll.field_k.field_t[param0];
          if (ll.field_k.d(param0, 53)) {
            var8Lifetime3 = vo.field_n;
            var10Lifetime4 = var8Lifetime3;
            var8Lifetime3 = var10Lifetime4;
            var9 = cr.a(param0, -117);
            var9 = var9 * 131 / cr.a(param0, -110);
            oo.a(1, 1, 135, 47, var4Lifetime3, var5Lifetime3);
            oo.f(2, 2, 133, 30, 16777215, 32);
            oo.f(3, 3, 101, 28, 65793, 128);
            oo.f(106, 3, 28, 28, 65793, 128);
            oo.e(2, 33, 133, 14, 65793);
            oo.e(3, 34, var9, 12, var6Lifetime3);
            if (var7 != null) {
              ((ja) (var7)).g(108, 5);
            }
            if (!ll.field_k.c(127, param0)) {
              var10Lifetime4 = ro.field_N;
            } else {
              var10Lifetime4 = gh.field_f[param0];
              var8Lifetime3 = var10Lifetime4;
            }
            qp.field_w.a(var10Lifetime4, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
            qp.field_w.b(var8Lifetime3, 68, 45, 16777215, -1);
            g.d();
            return;
          }
          if (var9 != 0) {
            var8Lifetime3 = vl.a(fh.field_d, new String[]{Integer.toString(var9), Integer.toString(cr.a(param0, -83))}, 2);
            var10Lifetime5 = var8Lifetime3;
            var8Lifetime3 = var10Lifetime5;
          }
          var9 = var9 * 131 / cr.a(param0, -110);
          oo.a(1, 1, 135, 47, var4Lifetime3, var5Lifetime3);
          oo.f(2, 2, 133, 30, 16777215, 32);
          oo.f(3, 3, 101, 28, 65793, 128);
          oo.f(106, 3, 28, 28, 65793, 128);
          oo.e(2, 33, 133, 14, 65793);
          oo.e(3, 34, var9, 12, var6Lifetime3);
          if (var7 != null) {
            ((ja) (var7)).g(108, 5);
          }
          if (!ll.field_k.c(127, param0)) {
            var10Lifetime6 = ro.field_N;
          } else {
            var10Lifetime6 = gh.field_f[param0];
            var8Lifetime3 = var10Lifetime6;
            var8Lifetime3 = var10Lifetime6;
          }
          qp.field_w.a(var10Lifetime6, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
          qp.field_w.b(var8Lifetime3, 68, 45, 16777215, -1);
          g.d();
          return;
        }
        if (param0 >= 19) {
          if (32 > param0 ||
            param0 > 38) {
            var6Lifetime1 = 1993752;
            if (ll.field_k.c(127, param0)) {
              var7 = wa.field_b[-44 + (param0 + 26)];
            }
            var4Lifetime1 = 280577;
            var5Lifetime1 = 2306851;
            var8Lifetime1 = fh.field_g;
            var9 = ll.field_k.field_t[param0];
            if (ll.field_k.d(param0, 53)) {
              var8Lifetime1 = vo.field_n;
              var9 = cr.a(param0, -117);
            } else {
              if (var9 != 0) {
                var8Lifetime1 = vl.a(fh.field_d, new String[]{Integer.toString(var9), Integer.toString(cr.a(param0, -83))}, 2);
              }
            }
            var9 = var9 * 131 / cr.a(param0, -110);
            oo.a(1, 1, 135, 47, var4Lifetime1, var5Lifetime1);
            oo.f(2, 2, 133, 30, 16777215, 32);
            oo.f(3, 3, 101, 28, 65793, 128);
            oo.f(106, 3, 28, 28, 65793, 128);
            oo.e(2, 33, 133, 14, 65793);
            oo.e(3, 34, var9, 12, var6Lifetime1);
            if (var7 != null) {
              ((ja) (var7)).g(108, 5);
            }
            if (!ll.field_k.c(127, param0)) {
              var10Lifetime1 = ro.field_N;
            } else {
              var10Lifetime1 = gh.field_f[param0];
            }
            qp.field_w.a(var10Lifetime1, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
            qp.field_w.b(var8Lifetime1, 68, 45, 16777215, -1);
            g.d();
            return;
          }
          if (ll.field_k.c(127, param0)) {
            var7 = wa.field_b[-13 + param0];
          }
          var6Lifetime1Lifetime1 = 8783880;
          var5Lifetime1Lifetime1 = 5053184;
          var4Lifetime1Lifetime1 = 8135424;
          var8Lifetime1Lifetime1 = fh.field_g;
          var9 = ll.field_k.field_t[param0];
          if (ll.field_k.d(param0, 53)) {
            var8Lifetime1Lifetime1 = vo.field_n;
            var10Lifetime1Lifetime1 = var8Lifetime1Lifetime1;
            var8Lifetime1Lifetime1 = var10Lifetime1Lifetime1;
            var9 = cr.a(param0, -117);
            var9 = var9 * 131 / cr.a(param0, -110);
            oo.a(1, 1, 135, 47, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1);
            oo.f(2, 2, 133, 30, 16777215, 32);
            oo.f(3, 3, 101, 28, 65793, 128);
            oo.f(106, 3, 28, 28, 65793, 128);
            oo.e(2, 33, 133, 14, 65793);
            oo.e(3, 34, var9, 12, var6Lifetime1Lifetime1);
            if (var7 != null) {
              ((ja) (var7)).g(108, 5);
            }
            if (!ll.field_k.c(127, param0)) {
              var10Lifetime1Lifetime1 = ro.field_N;
            } else {
              var10Lifetime1Lifetime1 = gh.field_f[param0];
              var8Lifetime1Lifetime1 = var10Lifetime1Lifetime1;
              var8Lifetime1Lifetime1 = var10Lifetime1Lifetime1;
            }
            qp.field_w.a(var10Lifetime1Lifetime1, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
            qp.field_w.b(var8Lifetime1Lifetime1, 68, 45, 16777215, -1);
            g.d();
            return;
          }
          if (var9 != 0) {
            var8Lifetime1Lifetime1 = vl.a(fh.field_d, new String[]{Integer.toString(var9), Integer.toString(cr.a(param0, -83))}, 2);
          }
          var9 = var9 * 131 / cr.a(param0, -110);
          oo.a(1, 1, 135, 47, var4Lifetime1Lifetime1, var5Lifetime1Lifetime1);
          oo.f(2, 2, 133, 30, 16777215, 32);
          oo.f(3, 3, 101, 28, 65793, 128);
          oo.f(106, 3, 28, 28, 65793, 128);
          oo.e(2, 33, 133, 14, 65793);
          oo.e(3, 34, var9, 12, var6Lifetime1Lifetime1);
          if (var7 != null) {
            ((ja) (var7)).g(108, 5);
          }
          if (!ll.field_k.c(127, param0)) {
            var10Lifetime1Lifetime2 = ro.field_N;
          } else {
            var10Lifetime1Lifetime2 = gh.field_f[param0];
          }
          qp.field_w.a(var10Lifetime1Lifetime2, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
          qp.field_w.b(var8Lifetime1Lifetime1, 68, 45, 16777215, -1);
          g.d();
          return;
        }
        if (ll.field_k.c(127, param0)) {
          var7 = wa.field_b[param0];
        }
        var4Lifetime2 = 6575425;
        var5Lifetime2 = 3420451;
        var6Lifetime2 = 5524287;
        var8Lifetime2 = fh.field_g;
        var9 = ll.field_k.field_t[param0];
        if (ll.field_k.d(param0, 53)) {
          var8Lifetime2 = vo.field_n;
          var9 = cr.a(param0, -117);
          var9 = var9 * 131 / cr.a(param0, -110);
          oo.a(1, 1, 135, 47, var4Lifetime2, var5Lifetime2);
          oo.f(2, 2, 133, 30, 16777215, 32);
          oo.f(3, 3, 101, 28, 65793, 128);
          oo.f(106, 3, 28, 28, 65793, 128);
          oo.e(2, 33, 133, 14, 65793);
          oo.e(3, 34, var9, 12, var6Lifetime2);
          if (var7 != null) {
            ((ja) (var7)).g(108, 5);
          }
          if (!ll.field_k.c(127, param0)) {
            var10Lifetime2 = ro.field_N;
          } else {
            var10Lifetime2 = gh.field_f[param0];
          }
          qp.field_w.a(var10Lifetime2, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
          qp.field_w.b(var8Lifetime2, 68, 45, 16777215, -1);
          g.d();
          return;
        }
        if (var9 != 0) {
          var8Lifetime2 = vl.a(fh.field_d, new String[]{Integer.toString(var9), Integer.toString(cr.a(param0, -83))}, 2);
        }
        var9 = var9 * 131 / cr.a(param0, -110);
        oo.a(1, 1, 135, 47, var4Lifetime2, var5Lifetime2);
        oo.f(2, 2, 133, 30, 16777215, 32);
        oo.f(3, 3, 101, 28, 65793, 128);
        oo.f(106, 3, 28, 28, 65793, 128);
        oo.e(2, 33, 133, 14, 65793);
        oo.e(3, 34, var9, 12, var6Lifetime2);
        if (var7 != null) {
          ((ja) (var7)).g(108, 5);
        }
        if (!ll.field_k.c(127, param0)) {
          var10Lifetime3 = ro.field_N;
        } else {
          var10Lifetime3 = gh.field_f[param0];
        }
        qp.field_w.a(var10Lifetime3, 6, 4, 95, 26, 16777215, -1, 0, 0, 0);
        qp.field_w.b(var8Lifetime2, 68, 45, 16777215, -1);
        g.d();
    }

    static {
        field_a = null;
        field_k = new ja(1280, 960);
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_p = "Security";
        field_i = "<%0> is not on your friend list.";
        field_j = "Message lobby";
        field_n = "Checking";
        field_d = new int[4];
        field_l = "<%0> has entered another game.";
    }
}
