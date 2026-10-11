/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rlb {
    private qfa field_b;
    static int[] field_d;
    static int field_e;
    static llb field_a;
    private d field_c;
    private pfb field_f;

    final void b(int param0) {
        this.field_f.b((byte) 94);
        if (param0 >= 0) {
          field_a = (llb) null;
        }
    }

    final void a(boolean param0) {
        this.field_f.a(param0, 5);
    }

    final aia a(byte param0, int param1) {
        int[] var27 = null;
        aia var15 = null;
        int[] var29 = null;
        aia var19 = null;
        int[] var28 = null;
        aia var17 = null;
        float[] var12 = null;
        float[] var11 = null;
        float[] var10 = null;
        aia var5 = null;
        int[] var30 = null;
        aia var21 = null;
        int[] var32 = null;
        aia var25 = null;
        int var9 = VoidHunters.field_G;
        int var3 = -84 % ((param0 + 54) / 60);
        Object var4 = this.field_f.b(0, (long)param1);
        if (var4 != null) {
          return (aia) (var4);
        }
        if (!this.field_c.a(param1, (byte) -42)) {
          return null;
        }
        opa var6 = this.field_c.a(-20292, param1);
        int var7 = var6.field_h ? 64 : this.field_b.field_X;
        if (!var6.field_i) {
          if (var6.field_q == 2) {
            var27 = this.field_c.a(88, var7, var7, false, param1, 0.699999988079071f);
            var15 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var27, 0, 0, false);
            var15.a(var6.field_s, var6.field_k, 10497);
            this.field_f.a(var15, (long)param1, (byte) -117);
            return var15;
          }
          if (tka.a(97, (int) var6.field_c)) {
            var29 = this.field_c.a(var7, 0.699999988079071f, true, param1, var7, true);
            var19 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var29, 0, 0, false);
            var19.a(var6.field_s, var6.field_k, 10497);
            this.field_f.a(var19, (long)param1, (byte) -117);
            return var19;
          }
          var28 = this.field_c.a(88, var7, var7, false, param1, 0.699999988079071f);
          var17 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var28, 0, 0, false);
          var17.a(var6.field_s, var6.field_k, 10497);
          this.field_f.a(var17, (long)param1, (byte) -117);
          return var17;
        }
        if (this.field_b.s()) {
          var12 = this.field_c.a(0.699999988079071f, var7, param1, var7, 76, false);
          var11 = var12;
          var10 = var11;
          float[] var8 = var10;
          var5 = new aia(this.field_b, 3553, 34842, var7, var7, var6.field_j != 0 ? true : false, var12, 6408);
          var5.a(var6.field_s, var6.field_k, 10497);
          this.field_f.a(var5, (long)param1, (byte) -117);
          return var5;
        }
        if (var6.field_q == 2) {
          var30 = this.field_c.a(88, var7, var7, false, param1, 0.699999988079071f);
          var21 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var30, 0, 0, false);
          var21.a(var6.field_s, var6.field_k, 10497);
          this.field_f.a(var21, (long)param1, (byte) -117);
          return var21;
        }
        if (tka.a(97, (int) var6.field_c)) {
          var32 = this.field_c.a(var7, 0.699999988079071f, true, param1, var7, true);
          var25 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var32, 0, 0, false);
          var25.a(var6.field_s, var6.field_k, 10497);
          this.field_f.a(var25, (long)param1, (byte) -117);
          return var25;
        }
        int[] var31 = this.field_c.a(88, var7, var7, false, param1, 0.699999988079071f);
        aia var23 = new aia(this.field_b, 3553, 6408, var7, var7, var6.field_j != 0 ? true : false, var31, 0, 0, false);
        var23.a(var6.field_s, var6.field_k, 10497);
        this.field_f.a(var23, (long)param1, (byte) -117);
        return var23;
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        int var1 = 115 / ((-54 - param0) / 51);
    }

    rlb(qfa param0, d param1) {
        this.field_f = new pfb(256);
        try {
          this.field_c = param1;
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "rlb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
