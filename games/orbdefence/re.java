/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    private int field_e;
    private int field_d;
    private int field_h;
    private int[] field_a;
    static String field_g;
    private int[] field_b;
    static String field_f;
    private int field_c;

    private final void b(byte param0) {
        int var2 = 0;
        int var12 = OrbDefence.field_D ? 1 : 0;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var10 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var3 ^ var4 << 1801650827;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -310078782;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -2038878872;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -760076432;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1770921366;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -123761468;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -1957349912;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1161653559;
            var3 = var3 + var4;
            var5 = var5 + var10;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var3 = var3 + this.field_b[var2];
            var7 = var7 + this.field_b[4 + var2];
            var9 = var9 + this.field_b[var2 - -6];
            var6 = var6 + this.field_b[3 + var2];
            var4 = var4 + this.field_b[var2 - -1];
            var10 = var10 + this.field_b[7 + var2];
            var5 = var5 + this.field_b[2 + var2];
            var8 = var8 + this.field_b[5 + var2];
            var3 = var3 ^ var4 << 1804709163;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -1735692478;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -2091789144;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1580576816;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << -569356086;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 436163012;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 806583368;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 314337065;
            var3 = var3 + var4;
            var5 = var5 + var10;
            this.field_a[var2] = var3;
            this.field_a[var2 + 1] = var4;
            this.field_a[var2 - -2] = var5;
            this.field_a[3 + var2] = var6;
            this.field_a[4 + var2] = var7;
            this.field_a[var2 + 5] = var8;
            this.field_a[6 + var2] = var9;
            this.field_a[7 + var2] = var10;
        }
        int var11 = -97 / ((param0 - 3) / 50);
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var3 = var3 + this.field_a[var2];
            var5 = var5 + this.field_a[2 + var2];
            var6 = var6 + this.field_a[var2 - -3];
            var10 = var10 + this.field_a[7 + var2];
            var9 = var9 + this.field_a[6 + var2];
            var8 = var8 + this.field_a[var2 - -5];
            var7 = var7 + this.field_a[4 + var2];
            var4 = var4 + this.field_a[1 + var2];
            var3 = var3 ^ var4 << 2144811691;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -312752702;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 381529576;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1692030064;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 2049751370;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -744832892;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 833802664;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1952118441;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_a[var2] = var3;
            this.field_a[var2 + 1] = var4;
            this.field_a[var2 - -2] = var5;
            this.field_a[3 + var2] = var6;
            this.field_a[4 + var2] = var7;
            this.field_a[5 + var2] = var8;
            this.field_a[6 + var2] = var9;
            this.field_a[7 + var2] = var10;
        }
        this.a((byte) 122);
        this.field_c = 256;
    }

    public static void c(byte param0) {
        field_g = null;
        if (param0 > -62) {
            field_f = (String) null;
        }
        field_f = null;
    }

    final int a(int param0) {
        if (!(0 != this.field_c)) {
            this.a((byte) 119);
            this.field_c = 256;
        }
        if (param0 != 128) {
            this.field_d = -48;
        }
        int fieldTemp$0 = this.field_c - 1;
        this.field_c = this.field_c - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void a(byte param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = OrbDefence.field_D ? 1 : 0;
          if (param0 >= 118) {
            break L0;
          } else {
            this.a(92);
            break L0;
          }
        }
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        this.field_e = this.field_e + fieldTemp$0;
        var2 = 0;
        L1: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L2: {
              var3 = this.field_a[var2];
              if (-1 != (var2 & 2 ^ -1)) {
                if ((var2 & 1) == 0) {
                  this.field_d = this.field_d ^ this.field_d << -114091742;
                  break L2;
                } else {
                  this.field_d = this.field_d ^ this.field_d >>> 1507026576;
                  break L2;
                }
              } else {
                if ((1 & var2) != 0) {
                  this.field_d = this.field_d ^ this.field_d >>> 330912006;
                  break L2;
                } else {
                  this.field_d = this.field_d ^ this.field_d << -1089389779;
                  break L2;
                }
              }
            }
            this.field_d = this.field_d + this.field_a[128 + var2 & 255];
            dupTemp$1 = this.field_a[vi.a(var3 >> 352516226, 255)] + (this.field_d + this.field_e);
            var4 = dupTemp$1;
            this.field_a[var2] = dupTemp$1;
            dupTemp$2 = var3 + this.field_a[vi.a(var4 >> -539804984 >> -2070968158, 255)];
            this.field_e = dupTemp$2;
            this.field_b[var2] = dupTemp$2;
            var2++;
            continue L1;
          }
        }
    }

    re(int[] param0) {
        int var2_int = 0;
        try {
            this.field_b = new int[256];
            this.field_a = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                this.field_b[var2_int] = param0[var2_int];
            }
            this.b((byte) 92);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = "FLYBO";
        field_f = "ZOOMO";
    }
}
