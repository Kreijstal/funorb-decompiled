/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kqa {
    private int[] field_c;
    int[] field_b;
    static fia field_a;
    int[] field_e;
    private ff field_d;

    final void a(int param0) {
        int var5 = 0;
        int[] stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_5_2 = 0;
        int var2;
        int var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var3Lifetime1;
        int var4Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        var2 = -103 % ((-35 - param0) / 39);
        for (var3 = 0; var3 < this.field_d.field_H.length; var3++) {
          stackIn_4_0 = this.field_c;
          stackIn_4_1 = var3;
          if (this.field_d.field_G[var3].b(0)) {
            stackIn_5_2 = -999;
          } else {
            stackIn_5_2 = this.field_d.field_G[var3].b(false) + this.field_d.field_H[var3].i((byte) -72);
          }
          stackIn_4_0[stackIn_4_1] = stackIn_5_2;
          if (this.field_d.f((byte) -99, var3)) {
            this.field_c[var3] = 2147483647;
          }
        }
        var3Lifetime1 = 0;
        for (var4 = 0; var4 < this.field_e.length; var4++) {
          for (var5 = var4; var5 < this.field_e.length; var5++) {
            var6 = this.field_e[var4];
            var7 = this.field_e[var5];
            var8 = 0;
            if (this.field_c[var7] < this.field_c[var6]) {
              var8 = 1;
            } else {
              if (this.field_c[var6] == this.field_c[var7] &&
                this.field_d.field_G[var7].field_c < this.field_d.field_G[var6].field_c) {
                var8 = 1;
              }
            }
            if (var8 != 0) {
              this.field_e[var4] = var7;
              var3Lifetime1 = 1;
              this.field_e[var5] = var6;
            }
          }
        }
        if (var3Lifetime1 != 0) {
          var10 = 0;
          var4Lifetime1 = var10;
          while (var10 < this.field_e.length) {
            this.field_b[this.field_e[var10]] = var10;
            var10++;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -119) {
          kqa.b(-126);
        }
    }

    final static void b(int param0) {
        vb var1 = null;
        fla var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 18916) {
            field_a = (fia) null;
          }
          var1 = (vb) (tna.field_e.f(-80));
          while (var1 != null) {
            var2 = new fla(var1, var1.field_f.k(), var1.field_f.g());
            rs.a(var2, -58);
            var1 = (vb) (tna.field_e.e(119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "kqa.D(" + param0 + ')');
        }
    }

    kqa(ff param0) {
        try {
          this.field_d = param0;
          this.a(false);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kqa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        int var2 = this.field_d.field_H.length;
        if (param0) {
          kqa.b(110);
        }
        this.field_c = new int[var2];
        this.field_e = new int[var2];
        this.field_b = new int[var2];
        for (var3 = 0; var3 < var2; var3++) {
          this.field_e[var3] = var3;
          this.field_b[var3] = var3;
        }
    }

    static {
    }
}
