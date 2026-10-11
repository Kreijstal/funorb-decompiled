/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rga {
    gf field_e;
    static soa field_f;
    private eb[] field_c;
    static llb field_g;
    private pf field_h;
    eb[] field_a;
    boolean field_b;
    gf field_d;

    final boolean b(byte param0) {
        byte[] var23 = null;
        byte[] var20 = null;
        byte[] var19 = null;
        byte[] var24 = null;
        byte[] var21 = null;
        byte[] var18 = null;
        byte[] var25 = null;
        byte[] var22 = null;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        byte[] var3 = null;
        int var17 = VoidHunters.field_G;
        int var2 = 59 % ((param0 + 26) / 42);
        byte[] var3Lifetime1;
        if (this.field_e == null) {
          if (ti.field_c == null) {
            var23 = dbb.a(4.0f, 0.6000000238418579f, (byte) 97, 8, new ko(419684), 16, 128, 128, 0.5f, 4.0f, 16.0f);
            var20 = var23;
            var19 = var20;
            var3 = var19;
            ti.field_c = gfb.a(false, var23, -12445);
          }
          var24 = ffb.a(false, ti.field_c, true);
          var21 = var24;
          var18 = var21;
          var3Lifetime1 = var18;
          var25 = new byte[var24.length * 4];
          var22 = var25;
          var4 = var22;
          var5 = 0;
          for (var6 = 0; 16 > var6; var6++) {
            var7 = 16384 * var6;
            var8 = var7;
            for (var9 = 0; var9 < 128; var9++) {
              var10 = 128 * var9 + var8;
              var11 = var8 + 128 * (var9 - 1 & 127);
              var12 = 128 * (127 & 1 + var9) + var8;
              for (var13 = 0; 128 > var13; var13++) {
                var14 = (float)((255 & var3Lifetime1[var11 + var13]) - (255 & var3Lifetime1[var13 + var12]));
                var15 = (float)((255 & var3Lifetime1[(-1 + var13 & 127) + var10]) - (var3Lifetime1[(127 & var13 + 1) + var10] & 255));
                var16 = (float)(128.0 / Math.sqrt((double)(16384.0f + var15 * var15 + var14 * var14)));
                incrementValue$0 = var5;
                var5++;
                var4[incrementValue$0] = (byte)(int)(127.0f + var15 * var16);
                incrementValue$1 = var5;
                var5++;
                var4[incrementValue$1] = (byte)(int)(var16 * 128.0f + 127.0f);
                incrementValue$2 = var5;
                var5++;
                var4[incrementValue$2] = (byte)(int)(var16 * var14 + 127.0f);
                var4[var5++] = var3Lifetime1[var7++];
              }
            }
          }
          this.field_e = this.field_h.a(128, 16, var25, qua.field_d, 128, -16539);
        }
        return null != this.field_e ? true : false;
    }

    public static void a(byte param0) {
        field_f = null;
        field_g = null;
        if (param0 <= 20) {
          field_g = (llb) null;
        }
    }

    final boolean c(byte param0) {
        int var2 = -51 % ((param0 + 8) / 49);
        return !this.field_b ? null != this.field_a ? true : false : null != this.field_d ? true : false;
    }

    rga(pf param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int var2_intLifetime1;
        this.field_e = null;
        this.field_c = null;
        this.field_a = null;
        this.field_d = null;
        try {
          this.field_h = param0;
          this.field_b = this.field_h.field_uc;
          if (this.field_b &&
            !this.field_h.a(mj.field_f, wh.field_o, -92)) {
            this.field_b = false;
          }
          if (!this.field_b &&
            !this.field_h.a(-10, wh.field_o, mj.field_f)) {
            return;
          }
          mta.c((byte) 111);
          if (!this.field_b) {
            this.field_a = new eb[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var15 = ppb.a(dv.field_b, var2_int * 32768, true, 32768);
              this.field_a[var2_int] = this.field_h.a(128, wh.field_o, 0, 128, true, var15);
            }
            this.field_c = new eb[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var16 = ppb.a(wpa.field_q, 32768 * var2_intLifetime1, true, 32768);
              this.field_c[var2_intLifetime1] = this.field_h.a(128, wh.field_o, 0, 128, true, var16);
            }
            return;
          }
          var17 = ffb.a(false, dv.field_b, true);
          this.field_d = this.field_h.a(128, 16, var17, wh.field_o, 128, -16539);
          var18 = ffb.a(false, wpa.field_q, true);
          this.field_h.a(128, 16, var18, wh.field_o, 128, -16539);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("rga.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        if (param2) {
          return;
        }
        String var4 = (String) null;
        vt.a(param0, -90, param1, (String) null);
    }

    static {
    }
}
