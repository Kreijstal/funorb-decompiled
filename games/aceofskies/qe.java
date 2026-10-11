/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe {
    nr[] field_c;
    nr[] field_h;
    static ej field_e;
    sr field_b;
    boolean field_d;
    sr field_j;
    static int[] field_f;
    sr field_g;
    static float[] field_i;
    static float[] field_a;
    static int field_k;

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        field_f = null;
        if (param0 != 5575) {
          field_f = (int[]) null;
        }
        field_e = null;
    }

    qe(wl param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        sr var4 = null;
        cs var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.field_c = null;
        this.field_b = null;
        this.field_j = null;
        this.field_h = null;
        this.field_g = null;
        try {
          this.field_d = param0.field_G;
          nb.a(8, param0);
          if (!this.field_d) {
            this.field_h = new nr[16];
            for (var2_int = 0; 16 > var2_int; var2_int++) {
              var23 = cs.a(false, var2_int * 32768, 32768, wl.field_Kb);
              this.field_h[var2_int] = new nr(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.field_c = new nr[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var24 = cs.a(false, var2_intLifetime1 * 32768, 32768, mq.field_e);
              this.field_c[var2_intLifetime1] = new nr(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = rb.a(false, wl.field_Kb, 50);
          this.field_j = new sr(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = rb.a(false, mq.field_e, -77);
          this.field_g = new sr(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_cc;
          if (var10.b(true)) {
            var22 = rb.a(false, ho.field_a, -88);
            this.field_b = new sr(param0, 6408, 128, 128, 16);
            var4 = new sr(param0, 6409, 128, 128, 16, var22, 6409);
            if (var10.a((byte) 97, this.field_b, var4, 2.0f)) {
              this.field_b.a(false);
            } else {
              this.field_b.b((byte) -50);
              this.field_b = null;
            }
            var4.b((byte) -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("qe.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        int var2 = 0;
        field_f = new int[]{1, 2, 5, 2, 2, 10, 3, 10, 10};
        field_e = new ej(6, 0, 4, 2);
        field_a = new float[16384];
        field_i = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; var2 < 16384; var2++) {
          field_i[var2] = (float)Math.sin(var0 * (double)var2);
          field_a[var2] = (float)Math.cos(var0 * (double)var2);
        }
    }
}
