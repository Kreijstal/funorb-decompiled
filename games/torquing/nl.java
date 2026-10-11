/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends am {
    private int field_x;
    static boolean[] field_y;
    private int field_w;
    private int field_t;
    static String field_u;
    static vn field_s;
    private int[] field_v;

    final int[] a(byte param0, int param1) {
        int var11 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int[] var9;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var25;
        int[] var26;
        var17 = Torquing.field_u;
        var18 = this.field_l.a(param1, 25657);
        var3 = var18;
        if (!this.field_l.field_b) {
          if (param0 < 86) {
            this.a((byte) 107, 117);
          }
          return var18;
        }
        var7 = ff.field_b * this.field_t >> 12;
        var26 = this.b(0, 0, vp.field_I & -1 + param1);
        var9 = this.b(0, 0, param1);
        var25 = this.b(0, 0, param1 + 1 & vp.field_I);
        for (var11 = 0; ci.field_c > var11; var11++) {
          var12 = var7 * (var25[var11] - var26[var11]) >> 12;
          var13 = (-var9[1 + var11 & jh.field_A] + var9[var11 - 1 & jh.field_A]) * var7 >> 12;
          var14 = var13 >> 4;
          if (var14 < 0) {
            var14 = -var14;
          }
          var15 = var12 >> 4;
          if (255 < var14) {
            var14 = 255;
          }
          if (0 > var15) {
            var15 = -var15;
          }
          if (var15 > 255) {
            var15 = 255;
          }
          var16 = 255 & k.field_c[((1 + var15) * var15 >> 1) + var14];
          var5 = var16 * var12 >> 8;
          var4 = var16 * var13 >> 8;
          var6 = 4096 * var16 >> 8;
          var4 = var4 * this.field_v[0] >> 12;
          var6 = this.field_v[2] * var6 >> 12;
          var5 = var5 * this.field_v[1] >> 12;
          var18[var11] = var4 + (var5 + var6);
        }
        if (param0 >= 86) {
          return var18;
        }
        this.a((byte) 107, 117);
        return var18;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Torquing.field_u;
        try {
          if (param1 != 35) {
            this.b(44);
          }
          var4_int = param2;
          if (var4_int == 0) {
            this.field_t = param0.i(7088);
            return;
          }
          if (var4_int == 1) {
            this.field_x = param0.i(param1 + 7053);
            return;
          }
          if (var4_int != 2) {
            return;
          }
          this.field_w = param0.i(7088);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("nl.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        qk.field_q.a(91, param1);
        if (param0 != -2) {
          field_y = (boolean[]) null;
        }
    }

    public static void d(int param0) {
        field_u = null;
        if (param0 > -8) {
          nl.a(-69, false);
          field_y = null;
          field_s = null;
          return;
        }
        field_y = null;
        field_s = null;
    }

    private final void b(int param0) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var2 = Math.cos((double)((float)this.field_w / 4096.0f));
        this.field_v[0] = (int)(4096.0 * (var2 * Math.sin((double)((float)this.field_x / 4096.0f))));
        this.field_v[1] = (int)(Math.cos((double)((float)this.field_x / 4096.0f)) * var2 * 4096.0);
        this.field_v[2] = (int)(4096.0 * Math.sin((double)((float)this.field_w / 4096.0f)));
        int var4 = this.field_v[0] * this.field_v[0] >> 12;
        if (param0 == -21978) {
          var5 = this.field_v[1] * this.field_v[1] >> 12;
          var6 = this.field_v[2] * this.field_v[2] >> 12;
          var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 12)) * 4096.0);
          if (0 != var7) {
            this.field_v[0] = (this.field_v[0] << 12) / var7;
            this.field_v[1] = (this.field_v[1] << 12) / var7;
            this.field_v[2] = (this.field_v[2] << 12) / var7;
          }
          return;
        }
    }

    final void a(byte param0) {
        this.b(-21978);
        if (param0 <= 123) {
          this.a((byte) 74, 123);
        }
    }

    public nl() {
        super(1, true);
        this.field_x = 3216;
        this.field_w = 3216;
        this.field_t = 4096;
        this.field_v = new int[3];
    }

    final static t c(int param0) {
        int var4_int = 0;
        t var4 = null;
        int var5 = Torquing.field_u;
        int var1 = ij.field_o[0] * vo.field_b[0];
        byte[] var2 = pn.field_b[0];
        int[] var3 = new int[var1];
        t var4Lifetime1;
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = cq.field_y[ie.a(255, (int) var2[var4_int])];
        }
        if (param0 == -8791) {
          var4 = new t(fm.field_E, rh.field_d, fj.field_o[0], na.field_G[0], vo.field_b[0], ij.field_o[0], var3);
          go.b(0);
          return var4;
        }
        field_y = (boolean[]) null;
        var4Lifetime1 = new t(fm.field_E, rh.field_d, fj.field_o[0], na.field_G[0], vo.field_b[0], ij.field_o[0], var3);
        go.b(0);
        return var4Lifetime1;
    }

    static {
        field_u = " <times>?";
        field_y = new boolean[8];
    }
}
