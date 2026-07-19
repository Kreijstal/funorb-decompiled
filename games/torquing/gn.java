/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private int[] field_k;
    private int field_c;
    static cd field_h;
    static wc field_l;
    private int field_e;
    private int[] field_a;
    private int field_g;
    private int field_j;
    static qd field_b;
    static mn field_m;
    static String field_i;
    static int field_d;
    static String field_f;

    public static void a(byte param0) {
        field_m = null;
        field_h = null;
        field_b = null;
        int var1 = 91 % ((param0 - 6) / 54);
        field_l = null;
        field_i = null;
        field_f = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        var3 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = param0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(false);
                    this.field_c = 256;
                    return;
                  } else {
                    var4 = var4 + this.field_a[1 + var2];
                    var6 = var6 + this.field_a[3 + var2];
                    var8 = var8 + this.field_a[var2 + 5];
                    var9 = var9 + this.field_a[6 + var2];
                    var3 = var3 + this.field_a[var2];
                    var10 = var10 + this.field_a[var2 - -7];
                    var5 = var5 + this.field_a[var2 + 2];
                    var7 = var7 + this.field_a[4 + var2];
                    var3 = var3 ^ var4 << -1645193109;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> 636167394;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << 755700648;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 665599376;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 837865354;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 304881252;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << -1115410552;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1376350551;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    this.field_a[var2] = var3;
                    this.field_a[var2 + 1] = var4;
                    this.field_a[2 + var2] = var5;
                    this.field_a[var2 + 3] = var6;
                    this.field_a[var2 - -4] = var7;
                    this.field_a[var2 + 5] = var8;
                    this.field_a[6 + var2] = var9;
                    this.field_a[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var3 = var3 + this.field_k[var2];
                var8 = var8 + this.field_k[var2 + 5];
                var9 = var9 + this.field_k[var2 + 6];
                var7 = var7 + this.field_k[var2 + 4];
                var5 = var5 + this.field_k[2 + var2];
                var10 = var10 + this.field_k[var2 + 7];
                var6 = var6 + this.field_k[3 + var2];
                var4 = var4 + this.field_k[1 + var2];
                var3 = var3 ^ var4 << -626770101;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -1183042750;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -445713336;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1536209616;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -909839414;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 213891108;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << -362449848;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 1797752105;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_a[var2] = var3;
                this.field_a[var2 + 1] = var4;
                this.field_a[var2 + 2] = var5;
                this.field_a[3 + var2] = var6;
                this.field_a[var2 + 4] = var7;
                this.field_a[5 + var2] = var8;
                this.field_a[var2 + 6] = var9;
                this.field_a[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1725911765;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> -721819902;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 665416136;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 2049395408;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1029420042;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 609042596;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 831347944;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 467939209;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Torquing.field_u;
        if (!param0) {
          fieldTemp$6 = this.field_e + 1;
          this.field_e = this.field_e + 1;
          this.field_j = this.field_j + fieldTemp$6;
          var2 = 0;
          L0: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L1: {
                var3 = this.field_a[var2];
                if (0 == (var2 & 2)) {
                  if ((1 & var2) != 0) {
                    this.field_g = this.field_g ^ this.field_g >>> -1190449274;
                    break L1;
                  } else {
                    this.field_g = this.field_g ^ this.field_g << 212563661;
                    break L1;
                  }
                } else {
                  if (-1 == (1 & var2 ^ -1)) {
                    this.field_g = this.field_g ^ this.field_g << 565114370;
                    break L1;
                  } else {
                    this.field_g = this.field_g ^ this.field_g >>> 754727888;
                    break L1;
                  }
                }
              }
              this.field_g = this.field_g + this.field_a[var2 + 128 & 255];
              dupTemp$7 = this.field_j + this.field_a[ie.a(var3 >> 144255010, 255)] - -this.field_g;
              var4 = dupTemp$7;
              this.field_a[var2] = dupTemp$7;
              dupTemp$8 = this.field_a[ie.a(var4 >> -547083736 >> 1921220194, 255)] + var3;
              this.field_j = dupTemp$8;
              this.field_k[var2] = dupTemp$8;
              var2++;
              continue L0;
            }
          }
        } else {
          this.a(104);
          fieldTemp$9 = this.field_e + 1;
          this.field_e = this.field_e + 1;
          this.field_j = this.field_j + fieldTemp$9;
          var2 = 0;
          L2: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L3: {
                var3 = this.field_a[var2];
                if (0 == (var2 & 2)) {
                  if ((1 & var2) != 0) {
                    this.field_g = this.field_g ^ this.field_g >>> -1190449274;
                    break L3;
                  } else {
                    this.field_g = this.field_g ^ this.field_g << 212563661;
                    break L3;
                  }
                } else {
                  if (-1 == (1 & var2 ^ -1)) {
                    this.field_g = this.field_g ^ this.field_g << 565114370;
                    break L3;
                  } else {
                    this.field_g = this.field_g ^ this.field_g >>> 754727888;
                    break L3;
                  }
                }
              }
              this.field_g = this.field_g + this.field_a[var2 + 128 & 255];
              dupTemp$10 = this.field_j + this.field_a[ie.a(var3 >> 144255010, 255)] - -this.field_g;
              var4 = dupTemp$10;
              this.field_a[var2] = dupTemp$10;
              dupTemp$11 = this.field_a[ie.a(var4 >> -547083736 >> 1921220194, 255)] + var3;
              this.field_j = dupTemp$11;
              this.field_k[var2] = dupTemp$11;
              var2++;
              continue L2;
            }
          }
        }
    }

    final int b(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0 == -103) {
          if (this.field_c == 0) {
            this.a(false);
            this.field_c = 256;
            fieldTemp$4 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_k[fieldTemp$4];
          } else {
            fieldTemp$5 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_k[fieldTemp$5];
          }
        } else {
          this.field_k = (int[]) null;
          if (this.field_c != 0) {
            fieldTemp$6 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_k[fieldTemp$6];
          } else {
            this.a(false);
            this.field_c = 256;
            fieldTemp$7 = this.field_c - 1;
            this.field_c = this.field_c - 1;
            return this.field_k[fieldTemp$7];
          }
        }
    }

    gn(int[] param0) {
        int var2_int = 0;
        try {
            this.field_k = new int[256];
            this.field_a = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_k[var2_int] = param0[var2_int];
            }
            this.a(0);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = null;
        field_h = new cd();
        field_b = new qd();
        field_i = "If you are a member, log in to start at any level you've reached.";
        field_d = 0;
        field_f = "to keep fullscreen or";
    }
}
