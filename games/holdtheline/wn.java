/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static ie field_g;
    private int field_j;
    private int[] field_d;
    private int field_e;
    static va field_f;
    static hj field_a;
    private int field_i;
    private int[] field_b;
    static String[] field_h;
    private int field_c;
    static String field_k;

    private final void a(byte param0) {
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
        L0: {
          var11 = HoldTheLine.field_D;
          var9 = -1640531527;
          var7 = -1640531527;
          var5 = -1640531527;
          var10 = -1640531527;
          var6 = -1640531527;
          var4 = -1640531527;
          var3 = -1640531527;
          var8 = -1640531527;
          if (param0 >= 95) {
            break L0;
          } else {
            wn.b(-110);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L2: while (true) {
              if (-257 >= (var2 ^ -1)) {
                var2 = 0;
                L3: while (true) {
                  if (256 <= var2) {
                    this.a(0);
                    this.field_i = 256;
                    return;
                  } else {
                    var4 = var4 + this.field_d[1 + var2];
                    var8 = var8 + this.field_d[var2 + 5];
                    var7 = var7 + this.field_d[var2 - -4];
                    var5 = var5 + this.field_d[2 + var2];
                    var10 = var10 + this.field_d[var2 - -7];
                    var3 = var3 + this.field_d[var2];
                    var6 = var6 + this.field_d[3 + var2];
                    var9 = var9 + this.field_d[6 + var2];
                    var3 = var3 ^ var4 << 1491633611;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 313093282;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
                    var5 = var5 ^ var6 << -1315654712;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 1234410896;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << -197017718;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> -1287814172;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 1767832040;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> -1110718423;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    this.field_d[var2] = var3;
                    this.field_d[var2 + 1] = var4;
                    this.field_d[var2 - -2] = var5;
                    this.field_d[3 + var2] = var6;
                    this.field_d[var2 - -4] = var7;
                    this.field_d[var2 + 5] = var8;
                    this.field_d[var2 + 6] = var9;
                    this.field_d[7 + var2] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var7 = var7 + this.field_b[4 + var2];
                var10 = var10 + this.field_b[var2 - -7];
                var3 = var3 + this.field_b[var2];
                var9 = var9 + this.field_b[var2 + 6];
                var4 = var4 + this.field_b[1 + var2];
                var6 = var6 + this.field_b[var2 - -3];
                var5 = var5 + this.field_b[var2 + 2];
                var8 = var8 + this.field_b[var2 - -5];
                var3 = var3 ^ var4 << 208237355;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1984289154;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << -52190168;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> -2066332144;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -1922886038;
                var8 = var8 + var9;
                var10 = var10 + var7;
                var8 = var8 ^ var9 >>> -2001944636;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << 1501071464;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1215461175;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_d[var2] = var3;
                this.field_d[var2 - -1] = var4;
                this.field_d[2 + var2] = var5;
                this.field_d[var2 - -3] = var6;
                this.field_d[4 + var2] = var7;
                this.field_d[var2 - -5] = var8;
                this.field_d[var2 + 6] = var9;
                this.field_d[7 + var2] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << -1474633749;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 197602754;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 1093198632;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -267836432;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << -1423813334;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1207121180;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -1510898488;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 1060877545;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L1;
          }
        }
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 != 28820) {
            return;
        }
        field_a = null;
        field_k = null;
        field_f = null;
        field_h = null;
    }

    final int c(int param0) {
        if (param0 != 256) {
            return 23;
        }
        if (!(this.field_i != 0)) {
            this.a(param0 ^ 256);
            this.field_i = 256;
        }
        int fieldTemp$0 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void a(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HoldTheLine.field_D;
        int fieldTemp$3 = this.field_e + 1;
        this.field_e = this.field_e + 1;
        this.field_c = this.field_c + fieldTemp$3;
        var2 = param0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = this.field_d[var2];
              if (0 == (2 & var2)) {
                if ((var2 & 1) == 0) {
                  this.field_j = this.field_j ^ this.field_j << 475688813;
                  break L1;
                } else {
                  this.field_j = this.field_j ^ this.field_j >>> 1856628582;
                  break L1;
                }
              } else {
                if (-1 != (var2 & 1 ^ -1)) {
                  this.field_j = this.field_j ^ this.field_j >>> 2110021264;
                  break L1;
                } else {
                  this.field_j = this.field_j ^ this.field_j << -2041396318;
                  break L1;
                }
              }
            }
            this.field_j = this.field_j + this.field_d[128 + var2 & 255];
            dupTemp$4 = this.field_c + (this.field_d[pk.a(var3, 1020) >> -1067987582] + this.field_j);
            var4 = dupTemp$4;
            this.field_d[var2] = dupTemp$4;
            dupTemp$5 = var3 + this.field_d[pk.a(261345, var4) >> -364880856 >> 1364025154];
            this.field_c = dupTemp$5;
            this.field_b[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    wn(int[] param0) {
        int var2_int = 0;
        try {
            this.field_b = new int[256];
            this.field_d = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                this.field_b[var2_int] = param0[var2_int];
            }
            this.a((byte) 106);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Weapons";
    }
}
