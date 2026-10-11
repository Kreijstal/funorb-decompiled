/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends od {
    private byte[][] field_m;
    private int field_k;
    static vs field_p;
    static jpa field_l;
    rq[] field_o;
    static volatile int field_n;

    final boolean a(byte param0) {
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var2_ref_Object = null;
        int var2 = 0;
        int var3 = 0;
        Object var5_ref_Object = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object var9 = null;
        nk var10 = null;
        Object var10_ref = null;
        int var12 = 0;
        uia var15 = null;
        uia var18 = null;
        vna var19 = null;
        int[] var28 = null;
        byte[] var29 = null;
        int[] var30 = null;
        byte[] var31 = null;
        var12 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_o) {
          return true;
        }
        if (null == this.field_m) {
          var2_ref_Object = dk.field_c;
          synchronized (var2_ref_Object) {
            if (!dk.field_c.e(this.field_k, param0 ^ -107)) {
              return false;
            }
            var28 = dk.field_c.d(param0 - 216, this.field_k);
            this.field_m = new byte[var28.length][];
            for (var4 = 0; var28.length > var4; var4++) {
              this.field_m[var4] = dk.field_c.a(false, this.field_k, var28[var4]);
            }
          }
        }
        if (param0 != 107) {
          this.field_k = 87;
        }
        var2 = 1;
        var3 = 0;
        while (var3 < this.field_m.length) {
          var29 = this.field_m[var3];
          var15 = new uia(var29);
          var15.field_h = 1;
          var6 = var15.d(124);
          var7 = jma.field_j;
          synchronized (var7) {
            var2 = var2 != 0 & jma.field_j.a(param0 ^ -15228, var6) ? 1 : 0;
            var3++;
          }
        }
        if (var2 == 0) {
          return false;
        }
        var19 = new vna();
        var5_ref_Object = dk.field_c;
        synchronized (var5_ref_Object) {
          var6 = dk.field_c.a((byte) -117, this.field_k);
          this.field_o = new rq[var6];
          var30 = dk.field_c.d(-79, this.field_k);
          var5 = 0;
        }
        while (var30.length > var5) {
          var31 = this.field_m[var5];
          var18 = new uia(var31);
          var18.field_h = 1;
          var8 = var18.d(param0 + 18);
          var9 = null;
          var10 = (nk) (var19.f(-80));
          while (var10 != null) {
            if (~var10.field_l != ~var8) {
              var10 = (nk) (var19.e(param0 + 4));
              continue;
            }
            var9 = var10;
            break;
          }
          if (var9 == null) {
            var10_ref = jma.field_j;
            synchronized (var10_ref) {
              var9 = new nk(var8, jma.field_j.f(var8, -93));
            }
            var19.b((byte) -124, (vg) (var9));
          }
          this.field_o[var30[var5]] = new rq(var31, (nk) (var9));
          var5++;
        }
        this.field_m = (byte[][]) null;
        return true;
    }

    public static void a(boolean param0) {
        field_p = null;
        field_l = null;
        if (!param0) {
          ena.a(false);
        }
    }

    ena(int param0) {
        this.field_k = param0;
    }

    static {
        field_n = -1;
    }
}
