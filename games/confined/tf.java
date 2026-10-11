/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    double field_i;
    static int[] field_b;
    private double field_o;
    private double field_h;
    private double field_q;
    double field_j;
    static String[] field_d;
    private ee field_l;
    static int[][] field_c;
    static int[][] field_n;
    double field_f;
    static bh field_a;
    static int[] field_m;
    static bg field_p;
    static String field_g;
    static mi field_k;
    static double field_e;

    public static void d(int param0) {
        field_k = null;
        field_a = null;
        if (param0 >= 47) {
          field_c = (int[][]) null;
          field_d = null;
          field_n = (int[][]) null;
          field_b = null;
          field_p = null;
          field_m = null;
          field_g = null;
          return;
        }
    }

    final void a(double param0, double param1, double param2, int param3) {
        this.field_f = this.field_f - param1;
        this.field_j = this.field_j - param2;
        if (param3 >= 27) {
          this.field_i = this.field_i - param0;
          return;
        }
        this.c(-77);
        this.field_i = this.field_i - param0;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        ce stackIn_11_0 = null;
        String stackIn_12_1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          pn.field_a.b(he.field_b[param1], 320, param2 + 36, 16777215, -1);
          if ((1 << param1 & param3) == 0) {
            kn.field_g.d(256, param2 + 44);
          } else {
            db.field_w[param1].d(256, param2 + 44);
          }
          if ((32800 & ~param3 & 1 << param1) != 0) {
            var4 = n.field_e;
          } else {
            var4 = jf.field_c[param1];
          }
          var5 = pn.field_a.b(var4, 171);
          pn.field_a.a(var4, 80, -166 - pn.field_a.field_C + (-(var5 * 10) + 274 + param2), 171, 1000, 4243584, -1, 0, 0, 20);
          if (param0 != 59) {
            return;
          }
          stackIn_11_0 = pn.field_a;
          if (0 == (param3 & 1 << param1)) {
            stackIn_12_1 = an.field_m;
          } else {
            stackIn_12_1 = fj.field_r;
          }
          ((ce) (Object) stackIn_11_0).c(stackIn_12_1, 80, 10 * var5 + 118 + param2, 16777215, -1);
          pn.field_a.a(hh.field_a, 500, 103 + param2, 4243584, -1);
          pn.field_a.a(ei.field_ib, 500, 123 + param2, 4243584, -1);
          if ((32800 & ~param3 & 1 << param1) != 0) {
            pn.field_a.c("???", 500, 103 + param2, 16777215, -1);
            pn.field_a.c("???", 500, param2 + 123, 16777215, -1);
            return;
          }
          pn.field_a.c(Integer.toString(sb.field_b[param1]), 500, param2 + 103, 16777215, -1);
          for (var6 = 0; eg.field_j[param1] > var6; var6++) {
            sb.field_h.d(var6 * 5 + 500, param2 + 108);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var4_ref), "tf.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final double[] a(int param0) {
        if (param0 == 16777215) {
          return new double[]{this.field_i, this.field_f, this.field_j, this.field_h, this.field_q, this.field_o};
        }
        tf.d(111);
        return new double[]{this.field_i, this.field_f, this.field_j, this.field_h, this.field_q, this.field_o};
    }

    final void c(int param0) {
        this.field_i = this.field_i + this.field_h;
        if (param0 == 16777215) {
          this.field_f = this.field_f + this.field_q;
          this.field_j = this.field_j + this.field_o;
          return;
        }
    }

    final void b(int param0) {
        this.field_q = this.field_l.field_G;
        if (param0 == 118) {
          this.field_o = this.field_l.field_L;
          this.field_j = this.field_l.field_D;
          this.field_h = this.field_l.field_K;
          this.field_f = this.field_l.field_t;
          this.field_i = this.field_l.field_E;
          return;
        }
        this.c(66);
        this.field_o = this.field_l.field_L;
        this.field_j = this.field_l.field_D;
        this.field_h = this.field_l.field_K;
        this.field_f = this.field_l.field_t;
        this.field_i = this.field_l.field_E;
    }

    tf(ee param0) {
        try {
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "tf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[]{5, 12, 7, 14};
        field_n = new int[][]{new int[field_b[0]], new int[field_b[1]], new int[field_b[2]], new int[field_b[3]]};
        field_c = new int[][]{new int[field_b[0]], new int[field_b[1]], new int[field_b[2]], new int[field_b[3]]};
        field_a = new bh();
        field_m = new int[8192];
        field_g = "Type your email address again to make sure it's correct";
        field_p = new bg();
    }
}
