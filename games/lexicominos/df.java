/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    private long field_f;
    static String[] field_d;
    int field_k;
    private boolean field_e;
    int field_g;
    private int field_c;
    private String field_j;
    static int field_a;
    String field_h;
    int field_i;
    int[] field_b;

    final int a(int param0) {
        if (!this.field_e && (2 != this.field_g ||
          this.field_c <= 0)) {
          if (fk.field_h == this.field_f) {
            return 1;
          }
          if (param0 != -1) {
            field_d = (String[]) null;
          }
          if (vl.field_b != 2) {
            return 0;
          }
          if (dj.a((byte) 79, this.field_j)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static db[] a(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        db[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = Lexicominos.field_L ? 1 : 0;
        if (param0 != 91) {
          field_d = (String[]) null;
        }
        var1 = new db[th.field_t];
        for (var2 = 0; var2 < th.field_t; var2++) {
          var3 = pb.field_h[var2] * bd.field_m[var2];
          var20 = be.field_f[var2];
          if (!me.field_w[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var6_int < var3; var6_int++) {
              var9[var6_int] = ci.field_b[vg.a(255, (int) var20[var6_int])];
            }
            var1[var2] = new db(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var21);
          } else {
            var22 = hl.field_o[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = tb.a(vg.a(255, (int) var22[var7]) << 24, ci.field_b[vg.a(255, (int) var20[var7])]);
            }
            var1[var2] = (db) ((Object) new pi(uc.field_fb, eh.field_b, mg.field_x[var2], rg.field_c[var2], pb.field_h[var2], bd.field_m[var2], var16));
          }
        }
        gk.a(12428);
        return var1;
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_a = 12;
        }
        field_d = null;
    }

    final static db a(String param0, String param1, sh param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        db stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.c(param0, (byte) -89);
          if (param3 > -36) {
            df.a(true);
          }
          var5 = param2.a(param1, -27964, var4_int);
          stackIn_3_0 = uh.a(param2, var4_int, (byte) -108, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("df.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    df(boolean param0) {
        this.field_c = rl.field_E;
        this.field_k = kc.field_c;
        this.field_g = kb.field_a;
        if (param0) {
          this.field_b = eb.field_d;
        } else {
          this.field_b = null;
        }
        this.field_i = fd.field_g;
        this.field_f = jf.field_P;
        this.field_j = gk.field_c;
        this.field_h = oe.field_b;
        this.field_e = tf.field_a;
    }

    static {
        field_d = new String[]{"Wordsmith", "Expert Wordsmith", "Master Wordsmith", "Virtuoso Wordsmith", "Combosmith", "Expert Combosmith", "Master Combosmith", "Virtuoso Combosmith", "Sequence Builder", "Expert Sequence Builder", "Master Sequence Builder", "Lexicominist", "Expert Lexicominist", "Master Lexicominist", "Virtuoso Lexicominist", "Stunning Recovery"};
        field_a = -1;
    }
}
