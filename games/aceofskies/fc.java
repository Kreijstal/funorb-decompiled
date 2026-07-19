/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    private int field_a;
    private int field_d;
    private int[] field_b;
    private int field_c;
    private int[] field_e;
    private int field_f;

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
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= -101) {
          var9 = -1640531527;
          var6 = -1640531527;
          var10 = -1640531527;
          var3 = -1640531527;
          var4 = -1640531527;
          var7 = -1640531527;
          var5 = -1640531527;
          var8 = -1640531527;
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -5) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= 256) {
                  var2 = 0;
                  L2: while (true) {
                    if ((var2 ^ -1) <= -257) {
                      this.c(1);
                      this.field_a = 256;
                      return;
                    } else {
                      var10 = var10 + this.field_e[var2 + 7];
                      var7 = var7 + this.field_e[var2 - -4];
                      var4 = var4 + this.field_e[var2 + 1];
                      var3 = var3 + this.field_e[var2];
                      var6 = var6 + this.field_e[var2 + 3];
                      var5 = var5 + this.field_e[2 + var2];
                      var9 = var9 + this.field_e[var2 - -6];
                      var8 = var8 + this.field_e[var2 - -5];
                      var3 = var3 ^ var4 << -548256821;
                      var4 = var4 + var5;
                      var6 = var6 + var3;
                      var4 = var4 ^ var5 >>> 1870862786;
                      var5 = var5 + var6;
                      var7 = var7 + var4;
                      var5 = var5 ^ var6 << -1896886584;
                      var8 = var8 + var5;
                      var6 = var6 + var7;
                      var6 = var6 ^ var7 >>> 1364883920;
                      var9 = var9 + var6;
                      var7 = var7 + var8;
                      var7 = var7 ^ var8 << -742420406;
                      var8 = var8 + var9;
                      var10 = var10 + var7;
                      var8 = var8 ^ var9 >>> 79818468;
                      var9 = var9 + var10;
                      var3 = var3 + var8;
                      var9 = var9 ^ var10 << 1123707944;
                      var10 = var10 + var3;
                      var4 = var4 + var9;
                      var10 = var10 ^ var3 >>> -1095916375;
                      var5 = var5 + var10;
                      var3 = var3 + var4;
                      this.field_e[var2] = var3;
                      this.field_e[var2 - -1] = var4;
                      this.field_e[2 + var2] = var5;
                      this.field_e[3 + var2] = var6;
                      this.field_e[var2 + 4] = var7;
                      this.field_e[5 + var2] = var8;
                      this.field_e[6 + var2] = var9;
                      this.field_e[var2 + 7] = var10;
                      var2 += 8;
                      continue L2;
                    }
                  }
                } else {
                  var7 = var7 + this.field_b[var2 - -4];
                  var10 = var10 + this.field_b[7 + var2];
                  var3 = var3 + this.field_b[var2];
                  var4 = var4 + this.field_b[var2 + 1];
                  var5 = var5 + this.field_b[2 + var2];
                  var9 = var9 + this.field_b[var2 + 6];
                  var8 = var8 + this.field_b[5 + var2];
                  var6 = var6 + this.field_b[var2 - -3];
                  var3 = var3 ^ var4 << 25191115;
                  var6 = var6 + var3;
                  var4 = var4 + var5;
                  var4 = var4 ^ var5 >>> -702476158;
                  var7 = var7 + var4;
                  var5 = var5 + var6;
                  var5 = var5 ^ var6 << -1696273752;
                  var8 = var8 + var5;
                  var6 = var6 + var7;
                  var6 = var6 ^ var7 >>> 1323773968;
                  var9 = var9 + var6;
                  var7 = var7 + var8;
                  var7 = var7 ^ var8 << 1180539466;
                  var8 = var8 + var9;
                  var10 = var10 + var7;
                  var8 = var8 ^ var9 >>> -1125534940;
                  var9 = var9 + var10;
                  var3 = var3 + var8;
                  var9 = var9 ^ var10 << 1956423272;
                  var4 = var4 + var9;
                  var10 = var10 + var3;
                  var10 = var10 ^ var3 >>> 481057961;
                  var5 = var5 + var10;
                  var3 = var3 + var4;
                  this.field_e[var2] = var3;
                  this.field_e[var2 + 1] = var4;
                  this.field_e[2 + var2] = var5;
                  this.field_e[var2 + 3] = var6;
                  this.field_e[4 + var2] = var7;
                  this.field_e[var2 + 5] = var8;
                  this.field_e[var2 + 6] = var9;
                  this.field_e[var2 + 7] = var10;
                  var2 += 8;
                  continue L1;
                }
              }
            } else {
              var3 = var3 ^ var4 << -1786827157;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> 1910114082;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << -975666488;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> -1485579152;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 66344170;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 359121604;
              var9 = var9 + var10;
              var3 = var3 + var8;
              var9 = var9 ^ var10 << 431910664;
              var4 = var4 + var9;
              var10 = var10 + var3;
              var10 = var10 ^ var3 >>> -2021033047;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final int b(int param0) {
        if (param0 != 256) {
            return -43;
        }
        if (this.field_a == 0) {
            this.c(param0 ^ 257);
            this.field_a = 256;
        }
        int fieldTemp$0 = this.field_a - 1;
        this.field_a = this.field_a - 1;
        return this.field_b[fieldTemp$0];
    }

    private final void c(int param0) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            this.field_e = (int[]) null;
            break L0;
          }
        }
        int fieldTemp$3 = this.field_f + 1;
        this.field_f = this.field_f + 1;
        this.field_d = this.field_d + fieldTemp$3;
        var2 = 0;
        L1: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L2: {
              var3 = this.field_e[var2];
              if (0 == (2 & var2)) {
                if ((1 & var2) != 0) {
                  this.field_c = this.field_c ^ this.field_c >>> -284417498;
                  break L2;
                } else {
                  this.field_c = this.field_c ^ this.field_c << 2014815821;
                  break L2;
                }
              } else {
                if ((1 & var2) == 0) {
                  this.field_c = this.field_c ^ this.field_c << -1205516414;
                  break L2;
                } else {
                  this.field_c = this.field_c ^ this.field_c >>> -387554224;
                  break L2;
                }
              }
            }
            this.field_c = this.field_c + this.field_e[255 & var2 + 128];
            dupTemp$4 = this.field_c + (this.field_e[pg.a(1020, var3) >> 448108450] + this.field_d);
            var4 = dupTemp$4;
            this.field_e[var2] = dupTemp$4;
            dupTemp$5 = var3 + this.field_e[pg.a(261124, var4) >> -27334872 >> 691890050];
            this.field_d = dupTemp$5;
            this.field_b[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    fc(int[] param0) {
        int var2_int = 0;
        try {
            this.field_b = new int[256];
            this.field_e = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_b[var2_int] = param0[var2_int];
            }
            this.a(-104);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "fc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
