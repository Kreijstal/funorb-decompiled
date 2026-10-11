/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends i {
    static int field_F;
    static hd field_I;
    private int field_N;
    private int field_J;
    static int field_L;
    static int[][] field_K;
    static boolean field_G;
    private long field_M;

    public static void g(int param0) {
        if (param0 == 0) {
          field_I = null;
          field_K = (int[][]) null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        hk.a((CharSequence) null, false);
        field_I = null;
        field_K = (int[][]) null;
    }

    final static String a(CharSequence param0, boolean param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_4_0 = ma.a((byte) -119, param0, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("hk.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    hk(vc param0, int param1) {
        super(param1, param0.field_m);
        String stackIn_5_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var3 = null;
        RuntimeException var3_ref = null;
        String var5 = null;
        this.field_M = -1L;
        try {
          this.field_M = param0.field_a;
          if (jd.f(-1) &&
            param0.field_m.field_h.length > 0) {
            stackIn_5_0 = "<br><br>" + mp.field_n;
          } else {
            stackIn_5_0 = "";
          }
          var5 = stackIn_5_0;
          var3 = var5;
          if (param1 == 19) {
            this.field_N = param0.field_i;
            this.field_v = vo.$cfr$intArgs$a$53ce4ab4c593(-18, this.field_v, new String[]{ad.a(this.field_N, 26300), var5});
            this.field_J = 52;
          } else {
            if (param1 == 32) {
              this.field_N = param0.field_t;
              this.field_v = vo.$cfr$intArgs$a$53ce4ab4c593(-18, this.field_v, new String[]{ad.a(this.field_N, 26300), var5});
              this.field_J = 66;
            } else {
              if (param1 == 37) {
                this.field_N = param0.field_t;
                this.field_v = vo.$cfr$intArgs$a$53ce4ab4c593(-18, this.field_v, new String[]{ad.a(this.field_N, 26300), ad.a(param0.field_v, 26300), var5});
                this.field_J = 66;
              }
            }
          }
          this.a(this.field_v, this.field_t, this.field_D, -90, this.field_u);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("hk.<init>(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        super.a(82, param1);
        if (la.a(100)) {
          return;
        }
        if (dg.field_e) {
          return;
        }
        if (ds.field_g) {
          return;
        }
        if (0 == param1) {
          or.field_d.b(this.field_J, (byte) 124);
          or.field_d.a(this.field_M, -1781890008);
          or.field_d.b(-74, this.field_N);
          gt.$cfr$intArgs$a$60f25194e713(true, 128, 118, 49);
          this.field_M = -1L;
          ((wf) (rn.a(-108, 16))).field_H = -1L;
          if (param0 >= 60) {
            return;
          }
          field_L = -50;
          return;
        }
        if (param0 >= 60) {
          return;
        }
        field_L = -50;
    }

    static {
        field_F = 2;
        field_K = new int[4][];
        field_K[3] = new int[1];
        field_K[3][0] = 29129;
        field_K[2] = new int[1];
        field_K[0] = new int[1];
        field_K[2][0] = 5356;
        field_K[0][0] = 21033;
        field_K[1] = new int[1];
        field_K[1][0] = 5542;
    }
}
