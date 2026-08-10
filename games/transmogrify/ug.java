/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static ti field_f;
    static int[] field_c;
    private int[] field_j;
    private int field_i;
    private int field_d;
    private int[] field_e;
    private int field_g;
    private int field_a;
    static int field_b;
    static int field_h;

    final static void b(boolean param0) {
        if (param0) {
          if (-1 > (eh.field_a ^ -1)) {
            if (!mg.field_d) {
              if (!dk.field_b) {
                if (!qj.b((byte) 92)) {
                  if (rh.field_t == null) {
                    rh.field_t = tl.a(bc.field_b, 36, new int[]{(eh.field_a << -1338186874) + qi.field_c.field_o}, 3, qf.field_e, vh.field_n, 65506, 29, hf.field_j);
                    sh.field_c = null;
                    return;
                  } else {
                    sh.field_c = null;
                    return;
                  }
                } else {
                  sh.field_c = null;
                  return;
                }
              } else {
                sh.field_c = null;
                return;
              }
            } else {
              sh.field_c = null;
              return;
            }
          } else {
            sh.field_c = null;
            return;
          }
        } else {
          return;
        }
    }

    private final void b(int param0) {
        int dupTemp$1 = 0;
        int dupTemp$2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        int fieldTemp$0 = this.field_i + 1;
        this.field_i = this.field_i + 1;
        this.field_g = this.field_g + fieldTemp$0;
        var2 = param0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = this.field_j[var2];
              if ((2 & var2) == 0) {
                if ((var2 & 1) == 0) {
                  this.field_d = this.field_d ^ this.field_d << 245170285;
                  break L1;
                } else {
                  this.field_d = this.field_d ^ this.field_d >>> 1566330470;
                  break L1;
                }
              } else {
                if (0 == (var2 & 1)) {
                  this.field_d = this.field_d ^ this.field_d << 242003714;
                  break L1;
                } else {
                  this.field_d = this.field_d ^ this.field_d >>> 831279824;
                  break L1;
                }
              }
            }
            this.field_d = this.field_d + this.field_j[255 & var2 - -128];
            dupTemp$1 = this.field_d + this.field_j[vg.c(1020, var3) >> -761188798] - -this.field_g;
            var4 = dupTemp$1;
            this.field_j[var2] = dupTemp$1;
            dupTemp$2 = var3 + this.field_j[vg.c(var4 >> -1867198904 >> -1313846750, 255)];
            this.field_g = dupTemp$2;
            this.field_e[var2] = dupTemp$2;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2;
        if (-1 == (this.field_a ^ -1)) {
          this.b(0);
          this.field_a = 256;
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$2 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$2];
        } else {
          var2 = -39 / ((11 - param0) / 54);
          fieldTemp$3 = this.field_a - 1;
          this.field_a = this.field_a - 1;
          return this.field_e[fieldTemp$3];
        }
    }

    ug(int[] param0) {
        int var2_int = 0;
        try {
            this.field_e = new int[256];
            this.field_j = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                this.field_e[var2_int] = param0[var2_int];
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 94) {
            field_f = (ti) null;
            field_c = null;
            field_f = null;
            return;
        }
        field_c = null;
        field_f = null;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var11 = Transmogrify.field_A ? 1 : 0;
        if (!param0) {
            return;
        }
        int var3 = -1640531527;
        int var7 = -1640531527;
        int var4 = -1640531527;
        int var6 = -1640531527;
        int var8 = -1640531527;
        int var10 = -1640531527;
        int var9 = -1640531527;
        int var5 = -1640531527;
        for (var2 = 0; 4 > var2; var2++) {
            var3 = var3 ^ var4 << -2034127477;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 512554882;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << -2030340216;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -1010064912;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1201596682;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -1583053948;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -758434520;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> -1157398231;
            var5 = var5 + var10;
            var3 = var3 + var4;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var6 = var6 + this.field_e[3 + var2];
            var9 = var9 + this.field_e[var2 + 6];
            var8 = var8 + this.field_e[var2 + 5];
            var7 = var7 + this.field_e[4 + var2];
            var5 = var5 + this.field_e[2 + var2];
            var10 = var10 + this.field_e[7 + var2];
            var4 = var4 + this.field_e[1 + var2];
            var3 = var3 + this.field_e[var2];
            var3 = var3 ^ var4 << -46797589;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1465481378;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -1178978456;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1154249776;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 1280557386;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -915717020;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << -249297528;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 2003739529;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_j[var2] = var3;
            this.field_j[var2 - -1] = var4;
            this.field_j[var2 - -2] = var5;
            this.field_j[3 + var2] = var6;
            this.field_j[4 + var2] = var7;
            this.field_j[var2 + 5] = var8;
            this.field_j[var2 - -6] = var9;
            this.field_j[7 + var2] = var10;
        }
        for (var2 = 0; (var2 ^ -1) > -257; var2 += 8) {
            var4 = var4 + this.field_j[1 + var2];
            var10 = var10 + this.field_j[var2 - -7];
            var7 = var7 + this.field_j[var2 + 4];
            var3 = var3 + this.field_j[var2];
            var9 = var9 + this.field_j[6 + var2];
            var8 = var8 + this.field_j[5 + var2];
            var5 = var5 + this.field_j[var2 + 2];
            var6 = var6 + this.field_j[var2 - -3];
            var3 = var3 ^ var4 << -142864757;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> -499508510;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 1037602824;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> -156107024;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 42938026;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> -490659868;
            var9 = var9 + var10;
            var3 = var3 + var8;
            var9 = var9 ^ var10 << 172814728;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 364873961;
            var5 = var5 + var10;
            var3 = var3 + var4;
            this.field_j[var2] = var3;
            this.field_j[1 + var2] = var4;
            this.field_j[2 + var2] = var5;
            this.field_j[3 + var2] = var6;
            this.field_j[var2 - -4] = var7;
            this.field_j[var2 - -5] = var8;
            this.field_j[6 + var2] = var9;
            this.field_j[7 + var2] = var10;
        }
        this.b(0);
        this.field_a = 256;
    }

    static {
        field_f = new ti(540, 140);
        field_h = 0;
    }
}
