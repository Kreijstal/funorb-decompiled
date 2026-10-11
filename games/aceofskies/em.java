/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    static String[] field_c;
    private qi[] field_h;
    static int[] field_b;
    static int field_d;
    boolean field_e;
    bp field_f;
    bp field_a;
    private bf field_g;
    qi[] field_i;

    final boolean a(int param0) {
        int var5 = 0;
        int var8 = 0;
        int var12 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        boolean stackIn_20_0 = false;
        byte[] var2;
        byte[] var3;
        int var4;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        float var13;
        float var14;
        float var15;
        int var16;
        byte[] var17;
        byte[] var18;
        byte[] var19;
        byte[] var20;
        byte[] var21;
        byte[] var22;
        byte[] var23;
        byte[] var24;
        byte[] var2Lifetime1;
        var16 = AceOfSkies.field_G ? 1 : 0;
        if (null == this.field_a) {
          if (bm.field_C == null) {
            var22 = gg.a(8, -117, 16.0f, new ol(419684), 128, 128, 4.0f, 4.0f, 0.5f, 16, 0.6000000238418579f);
            var19 = var22;
            var18 = var19;
            var2 = var18;
            bm.field_C = sf.a(false, -137, var22);
          }
          var23 = rb.a(false, bm.field_C, -76);
          var20 = var23;
          var17 = var20;
          var2Lifetime1 = var17;
          var24 = new byte[4 * var23.length];
          var21 = var24;
          var3 = var21;
          var4 = 0;
          for (var5 = 0; var5 < 16; var5++) {
            var6 = var5 * 16384;
            var7 = var6;
            for (var8 = 0; var8 < 128; var8++) {
              var9 = 128 * var8 + var7;
              var10 = (var8 - 1 & 127) * 128 + var7;
              var11 = (127 & 1 + var8) * 128 + var7;
              for (var12 = 0; 128 > var12; var12++) {
                var13 = (float)(-(var2Lifetime1[var11 + var12] & 255) + (var2Lifetime1[var10 + var12] & 255));
                var14 = (float)((255 & var2Lifetime1[var9 + (127 & -1 + var12)]) - (255 & var2Lifetime1[(var12 + 1 & 127) + var9]));
                var15 = (float)(128.0 / Math.sqrt((double)(var14 * var14 + 16384.0f + var13 * var13)));
                incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = (byte)(int)(127.0f + var14 * var15);
                incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = (byte)(int)(127.0f + 128.0f * var15);
                incrementValue$2 = var4;
                var4++;
                var3[incrementValue$2] = (byte)(int)(var15 * var13 + 127.0f);
                var3[var4++] = var2Lifetime1[var6++];
              }
            }
          }
          this.field_a = this.field_g.a(128, param0 ^ -96, 128, lc.field_g, 16, var24);
        }
        if (param0 != 0) {
          this.field_f = (bp) null;
        }
        stackIn_20_0 = (null != this.field_a);
        return stackIn_20_0;
    }

    final boolean b(boolean param0) {
        if (param0) {
          this.field_h = (qi[]) null;
        }
        return this.field_e ? this.field_f != null ? true : false : null != this.field_i ? true : false;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (!param0) {
          field_b = (int[]) null;
        }
    }

    em(bf param0) {
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
        this.field_h = null;
        this.field_f = null;
        this.field_i = null;
        this.field_a = null;
        try {
          this.field_g = param0;
          this.field_e = this.field_g.field_J;
          if (this.field_e &&
            !this.field_g.a((byte) -13, la.field_h, hh.field_c)) {
            this.field_e = false;
          }
          if (!this.field_e &&
            !this.field_g.a(la.field_h, 0, hh.field_c)) {
            return;
          }
          fd.a(-70);
          if (!this.field_e) {
            this.field_i = new qi[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var15 = cs.a(false, var2_int * 32768, 32768, wl.field_r);
              this.field_i[var2_int] = this.field_g.a(var15, 128, true, 128, hh.field_c, true);
            }
            this.field_h = new qi[16];
            for (var2_intLifetime1 = 0; 16 > var2_intLifetime1; var2_intLifetime1++) {
              var16 = cs.a(false, 32768 * var2_intLifetime1, 32768, lg.field_l);
              this.field_h[var2_intLifetime1] = this.field_g.a(var16, 128, true, 128, hh.field_c, true);
            }
            return;
          }
          var17 = rb.a(false, wl.field_r, 66);
          this.field_f = this.field_g.a(128, -123, 128, hh.field_c, 16, var17);
          var18 = rb.a(false, lg.field_l, 101);
          this.field_g.a(128, -95, 128, hh.field_c, 16, var18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("em.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_d = 0;
        field_c = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
    }
}
