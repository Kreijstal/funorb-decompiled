/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    static int field_f;
    int[] field_c;
    boolean field_b;
    private int[] field_k;
    static String field_n;
    static boolean field_a;
    int field_m;
    int[] field_e;
    int field_i;
    int field_d;
    int field_j;
    int field_l;
    int field_g;
    boolean field_h;

    public static void b(byte param0) {
        if (param0 != -114) {
          vh.a(67, -67);
        }
        field_n = null;
    }

    final void a(boolean param0, byte param1) {
        int[] var6 = null;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        if (this.field_k.length * 32 <= this.field_j) {
          var6 = new int[2 * this.field_k.length];
          int[] var3 = var6;
          for (var4 = 0; var4 < this.field_k.length; var4++) {
            var6[var4] = this.field_k[var4];
          }
        }
        if (param1 >= -122) {
          return;
        }
        if (param0) {
          this.field_k[this.field_j >> 5] = hm.a(this.field_k[this.field_j >> 5], 1 << pf.b(31, this.field_j));
        }
        this.field_j = this.field_j + 1;
    }

    final boolean a(byte param0, int param1) {
        if (param0 <= 26) {
          return true;
        }
        return (this.field_k[param1 >> 5] & 1 << (param1 & 31)) != 0 ? true : false;
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = CrazyCrystals.field_B;
        var2 = 0;
        var3 = sn.field_c;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (-40960 + 16384 * var3) / 220;
          } else {
            if (var3 < 120) {
              var3 = -var3 + 120;
              var2 = 8192 - var3 * var3 * 8192 / 3300;
            }
          }
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (param0 == 4) {
          var4 = 1;
          var5 = 1;
        }
        if (param0 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 6) {
          var5 = -1;
          var4 = 1;
        }
        if (7 == param0 ||
          param0 == 8) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (param1 != 10718) {
          return;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (14 == param0) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var5 = 1;
          var4 = 1;
        }
        kf.field_a = cj.d(param1 ^ -10660, var4 * var2, var2 * var5);
    }

    final void a(byte param0) {
        this.field_m = 0;
        this.field_c = new int[4];
        this.field_l = 0;
        this.field_e = new int[2];
        this.field_d = 0;
        this.field_h = false;
        this.field_k = new int[4];
        this.field_g = 0;
        if (param0 <= 104) {
          vh.b((byte) 20);
        }
        this.field_j = 0;
        this.field_b = false;
    }

    static {
        field_n = "Secret achievement";
        field_a = false;
    }
}
