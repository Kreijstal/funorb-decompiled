/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    private d field_e;
    static String field_d;
    private eo field_a;
    static boolean field_c;
    private dd field_b;
    static String field_f;

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
          return;
        }
        field_d = null;
    }

    final void a(int param0) {
        this.field_b.b(123, param0);
    }

    final gf a(int param0, int param1) {
        int[] var13 = null;
        gf var14 = null;
        int[] var22 = null;
        gf var20 = null;
        int[] var16 = null;
        gf var17 = null;
        float[] var9 = null;
        gf var4 = null;
        int[] var7 = null;
        gf var21 = null;
        int var8 = TombRacer.field_G ? 1 : 0;
        Object var3 = this.field_b.a((byte) 64, (long)param0);
        int[] var7Lifetime1;
        int[] var7Lifetime2;
        int[] var7Lifetime3;
        gf var21Lifetime1;
        gf var21Lifetime2;
        int[] var7Lifetime4;
        if (var3 != null) {
          return (gf) (var3);
        }
        if (param1 < 91) {
          return (gf) null;
        }
        if (!this.field_e.a(param0, (byte) 57)) {
          return null;
        }
        dw var5 = this.field_e.a((byte) -119, param0);
        int var6 = !var5.field_g ? this.field_a.field_Sb : 64;
        if (!var5.field_l) {
          if (var5.field_d == 2) {
            var13 = this.field_e.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
            var7 = var13;
            var14 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var13);
            var14.a((byte) -105, var5.field_b, var5.field_n);
            this.field_b.a(29166, var14, (long)param0);
            return var14;
          }
          if (bh.a((int) var5.field_h, false)) {
            var22 = this.field_e.a(14907, param0, true, var6, 0.699999988079071f, var6);
            var20 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var22);
            var20.a((byte) -105, var5.field_b, var5.field_n);
            this.field_b.a(29166, var20, (long)param0);
            return var20;
          }
          var16 = this.field_e.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
          var7Lifetime4 = var16;
          var17 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var16);
          var17.a((byte) -105, var5.field_b, var5.field_n);
          this.field_b.a(29166, var17, (long)param0);
          return var17;
        }
        if (this.field_a.f()) {
          var9 = this.field_e.a(124, var6, var6, param0, 0.699999988079071f, false);
          float[] var7_array = var9;
          var4 = this.field_a.a(var9, gpa.field_a, true, 0 != var5.field_r ? true : false, var6, var6);
          var4.a((byte) -105, var5.field_b, var5.field_n);
          this.field_b.a(29166, var4, (long)param0);
          return var4;
        }
        if (var5.field_d == 2) {
          var7Lifetime1 = this.field_e.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
          var21 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var7Lifetime1);
          var21.a((byte) -105, var5.field_b, var5.field_n);
          this.field_b.a(29166, var21, (long)param0);
          return var21;
        }
        if (bh.a((int) var5.field_h, false)) {
          var7Lifetime2 = this.field_e.a(14907, param0, true, var6, 0.699999988079071f, var6);
          var21Lifetime1 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var7Lifetime2);
          var21Lifetime1.a((byte) -105, var5.field_b, var5.field_n);
          this.field_b.a(29166, var21Lifetime1, (long)param0);
          return var21Lifetime1;
        }
        var7Lifetime3 = this.field_e.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
        var21Lifetime2 = this.field_a.a(true, var6, var5.field_r != 0 ? true : false, var6, var7Lifetime3);
        var21Lifetime2.a((byte) -105, var5.field_b, var5.field_n);
        this.field_b.a(29166, var21Lifetime2, (long)param0);
        return var21Lifetime2;
    }

    kp(eo param0, d param1) {
        this.field_b = new dd(256);
        try {
          this.field_e = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Month";
        field_c = false;
        field_f = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
    }
}
