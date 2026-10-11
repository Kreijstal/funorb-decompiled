/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ue {
    jh field_b;
    ik[] field_d;
    static int field_a;
    static boolean field_c;

    abstract boolean a(int param0);

    final static dl[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 9) {
          return (dl[]) null;
        }
        dl[] var6 = new dl[9];
        dl[] var5 = var6;
        dl dupTemp$0 = mc.a(param2, -65, param1);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        dl dupTemp$1 = mc.a(param2, -34, param4);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param3 != 0) {
          var6[4] = mc.a(64, -55, param3);
        }
        return var5;
    }

    ue(int param0) {
        this.field_b = new jh(param0);
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        sc var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = CrazyCrystals.field_B;
        try {
          var4 = (sc) (hd.field_c.g(32073));
          if (param1 > -81) {
            ue.a(106, 48);
          }
          while (var4 != null) {
            ed.a((byte) 105, param0, var4);
            var4 = (sc) (hd.field_c.a(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "ue.U(" + param0 + ',' + param1 + ')');
        }
    }

    void b(int param0) {
        int var2 = 0;
        int var3 = CrazyCrystals.field_B;
        if (param0 != 8) {
          return;
        }
        for (var2 = 0; var2 < this.field_d.length; var2++) {
          this.field_d[var2].a(this.field_b.field_c == var2 ? true : false, this.field_b.field_c != var2 ? 12640511 : 16777215, 1);
        }
    }

    final static void b(byte param0) {
        int var1 = -92 / ((param0 + 58) / 41);
        no.e((byte) -23);
        if (null != jd.field_D) {
          fq.a(-65, jd.field_D);
        }
        vf.a(-1);
        ub.b(0);
        ug.a((byte) -127);
        if (b.b(0)) {
          tp.field_f.d(8, 1);
          ak.a(0, (byte) -48);
        }
        jj.a(4);
    }

    final void a(boolean param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = CrazyCrystals.field_B;
        var3 = -1;
        if (param1 != -13880) {
          ue.a(-19, 34, 105);
        }
        for (var4 = 0; this.field_d.length > var4; var4++) {
          if (null != this.field_d[var4] &&
            this.field_d[var4].b(0)) {
            var3 = var4;
          }
        }
        this.field_b.a(param1 ^ 13879, param0, var3);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = -1 + param0 & param1 >> 31;
        int var4 = 54 / ((param2 - 42) / 39);
        return ((param1 >>> 31) + param1) % param0 + var3;
    }

    final void a(byte param0) {
        int var5 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        var6 = CrazyCrystals.field_B;
        var2 = -1;
        var3 = -1;
        var4 = 55 / ((param0 + 10) / 48);
        for (var5 = 0; var5 < this.field_d.length; var5++) {
          if (null != this.field_d[var5]) {
            if (this.field_d[var5].b(0)) {
              var2 = var5;
            }
            if (this.field_d[var5].a(-94)) {
              var3 = var5;
            }
          }
        }
        this.field_b.a(0, var3, var2);
        if (!this.a(121)) {
        }
    }

    void a(boolean param0) {
        int var3;
        var3 = CrazyCrystals.field_B;
        do {
          if (!ge.b(-120)) {
            this.a((byte) 62);
            if (param0) {
              this.field_d = (ik[]) null;
            }
            return;
          }
          this.field_b.f(0);
        } while (!this.a(107));
        return;
    }

    static {
    }
}
