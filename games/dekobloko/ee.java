/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static w field_i;
    private int[] field_f;
    static ui[] field_a;
    private int field_c;
    static ud field_g;
    private int field_j;
    private int field_e;
    private int field_h;
    static int[] field_b;
    private int[] field_d;

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        if (param0 != -78) {
          field_a = (ui[]) null;
        }
    }

    final int a(boolean param0) {
        if (0 == this.field_e) {
          this.b(-1);
          this.field_e = 256;
        }
        if (param0) {
          return 55;
        }
        int fieldTemp$0 = this.field_e - 1;
        this.field_e = this.field_e - 1;
        return this.field_d[fieldTemp$0];
    }

    private final void b(int param0) {
        int var2 = 0;
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var3;
        int var4;
        int var5;
        var5 = client.field_A ? 1 : 0;
        if (param0 != -1) {
          this.field_f = (int[]) null;
        }
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_j = this.field_j + fieldTemp$0;
        for (var2 = 0; 256 > var2; var2++) {
          var3 = this.field_f[var2];
          if (0 == (var2 & 2)) {
            if ((var2 & 1) != 0) {
              this.field_c = this.field_c ^ this.field_c >>> 6;
            } else {
              this.field_c = this.field_c ^ this.field_c << 13;
            }
          } else {
            if ((var2 & 1) == 0) {
              this.field_c = this.field_c ^ this.field_c << 2;
            } else {
              this.field_c = this.field_c ^ this.field_c >>> 16;
            }
          }
          this.field_c = this.field_c + this.field_f[128 + var2 & 255];
          dupTemp$1 = this.field_j + this.field_c + this.field_f[lb.a(1020, var3) >> 2];
          var4 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          dupTemp$2 = var3 + this.field_f[lb.a(255, var4 >> 8 >> 2)];
          this.field_j = dupTemp$2;
          this.field_d[var2] = dupTemp$2;
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (0 >= param1) {
          throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param1) + 2147483647;
        if (param0 < 71) {
          field_a = (ui[]) null;
        }
        while (true) {
          var4 = this.a(false);
          if (var4 <= var3) {
            break;
          }
        }
        return oi.a(param1, 83, var4);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var11 = client.field_A ? 1 : 0;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != 8388607) {
          this.field_j = -27;
        }
        int var10 = -1640531527;
        int var3 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
          var3 = var3 ^ var4 << 11;
          var4 = var4 + var5;
          var6 = var6 + var3;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var8 = var8 + var5;
          var6 = var6 + var7;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var5 = var5 + var10;
          var3 = var3 + var4;
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < 256; var2Lifetime1 += 8) {
          var10 = var10 + this.field_d[7 + var2Lifetime1];
          var6 = var6 + this.field_d[3 + var2Lifetime1];
          var9 = var9 + this.field_d[6 + var2Lifetime1];
          var7 = var7 + this.field_d[4 + var2Lifetime1];
          var4 = var4 + this.field_d[var2Lifetime1 + 1];
          var8 = var8 + this.field_d[5 + var2Lifetime1];
          var3 = var3 + this.field_d[var2Lifetime1];
          var5 = var5 + this.field_d[2 + var2Lifetime1];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var9 = var9 + var6;
          var7 = var7 + var8;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var3 = var3 + var8;
          var9 = var9 + var10;
          var9 = var9 ^ var10 << 8;
          var4 = var4 + var9;
          var10 = var10 + var3;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_f[var2Lifetime1] = var3;
          this.field_f[var2Lifetime1 + 1] = var4;
          this.field_f[var2Lifetime1 + 2] = var5;
          this.field_f[3 + var2Lifetime1] = var6;
          this.field_f[4 + var2Lifetime1] = var7;
          this.field_f[5 + var2Lifetime1] = var8;
          this.field_f[var2Lifetime1 + 6] = var9;
          this.field_f[var2Lifetime1 + 7] = var10;
        }
        for (var2Lifetime2 = 0; var2Lifetime2 < 256; var2Lifetime2 += 8) {
          var10 = var10 + this.field_f[var2Lifetime2 + 7];
          var6 = var6 + this.field_f[3 + var2Lifetime2];
          var4 = var4 + this.field_f[1 + var2Lifetime2];
          var3 = var3 + this.field_f[var2Lifetime2];
          var8 = var8 + this.field_f[5 + var2Lifetime2];
          var5 = var5 + this.field_f[var2Lifetime2 + 2];
          var9 = var9 + this.field_f[6 + var2Lifetime2];
          var7 = var7 + this.field_f[4 + var2Lifetime2];
          var3 = var3 ^ var4 << 11;
          var6 = var6 + var3;
          var4 = var4 + var5;
          var4 = var4 ^ var5 >>> 2;
          var7 = var7 + var4;
          var5 = var5 + var6;
          var5 = var5 ^ var6 << 8;
          var6 = var6 + var7;
          var8 = var8 + var5;
          var6 = var6 ^ var7 >>> 16;
          var7 = var7 + var8;
          var9 = var9 + var6;
          var7 = var7 ^ var8 << 10;
          var10 = var10 + var7;
          var8 = var8 + var9;
          var8 = var8 ^ var9 >>> 4;
          var9 = var9 + var10;
          var3 = var3 + var8;
          var9 = var9 ^ var10 << 8;
          var10 = var10 + var3;
          var4 = var4 + var9;
          var10 = var10 ^ var3 >>> 9;
          var3 = var3 + var4;
          var5 = var5 + var10;
          this.field_f[var2Lifetime2] = var3;
          this.field_f[1 + var2Lifetime2] = var4;
          this.field_f[var2Lifetime2 + 2] = var5;
          this.field_f[3 + var2Lifetime2] = var6;
          this.field_f[var2Lifetime2 + 4] = var7;
          this.field_f[5 + var2Lifetime2] = var8;
          this.field_f[6 + var2Lifetime2] = var9;
          this.field_f[7 + var2Lifetime2] = var10;
        }
        this.b(-1);
        this.field_e = 256;
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        if (param1) {
          if (ad.field_i[param3] < ad.field_i[param2]) {
            return true;
          }
          if (ad.field_i[param2] < ad.field_i[param3]) {
            return false;
          }
          if (cc.field_h[param3] < cc.field_h[param2]) {
            return true;
          }
          if (cc.field_h[param3] > cc.field_h[param2]) {
            return false;
          }
        } else {
          if (cc.field_h[param3] < cc.field_h[param2]) {
            return true;
          }
          if (cc.field_h[param3] > cc.field_h[param2]) {
            return false;
          }
          if (ad.field_i[param3] < ad.field_i[param2]) {
            return true;
          }
          if (ad.field_i[param3] > ad.field_i[param2]) {
            return false;
          }
        }
        var4 = ln.field_a[param3] + (oa.field_e[param3] + mk.field_b[param3]);
        var5 = mk.field_b[param2] + ln.field_a[param2] + oa.field_e[param2];
        if (var5 > var4) {
          return true;
        }
        if (var4 > var5) {
          return false;
        }
        if (param0 <= 97) {
          return false;
        }
        return !(param3 >= param2);
    }

    ee(int[] param0) {
        int var2_int = 0;
        try {
          this.field_f = new int[256];
          this.field_d = new int[256];
          for (var2_int = 0; var2_int < param0.length; var2_int++) {
            this.field_d[var2_int] = param0[var2_int];
          }
          this.a(8388607);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new ui[4];
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
