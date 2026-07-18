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
        if (eh.field_a > 0) {
          if (!mg.field_d) {
            if (!dk.field_b) {
              if (!qj.b((byte) 92)) {
                if (rh.field_t == null) {
                  rh.field_t = tl.a(bc.field_b, 36, new int[1], 3, qf.field_e, vh.field_n, 65506, 29, hf.field_j);
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
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Transmogrify.field_A ? 1 : 0;
        int fieldTemp$3 = ((ug) this).field_i + 1;
        ((ug) this).field_i = ((ug) this).field_i + 1;
        ((ug) this).field_g = ((ug) this).field_g + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((ug) this).field_j[var2];
              if ((2 & var2) == 0) {
                if ((var2 & 1) == 0) {
                  ((ug) this).field_d = ((ug) this).field_d ^ ((ug) this).field_d << 13;
                  break L1;
                } else {
                  ((ug) this).field_d = ((ug) this).field_d ^ ((ug) this).field_d >>> 6;
                  break L1;
                }
              } else {
                if (0 == (var2 & 1)) {
                  ((ug) this).field_d = ((ug) this).field_d ^ ((ug) this).field_d << 2;
                  break L1;
                } else {
                  ((ug) this).field_d = ((ug) this).field_d ^ ((ug) this).field_d >>> 16;
                  break L1;
                }
              }
            }
            ((ug) this).field_d = ((ug) this).field_d + ((ug) this).field_j[255 & var2 - -128];
            int dupTemp$4 = ((ug) this).field_d + ((ug) this).field_j[vg.c(1020, var3) >> 2] - -((ug) this).field_g;
            var4 = dupTemp$4;
            ((ug) this).field_j[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ug) this).field_j[vg.c(var4 >> 8 >> 2, 255)];
            ((ug) this).field_g = dupTemp$5;
            ((ug) this).field_e[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0) {
        int var2 = 0;
        if (((ug) this).field_a == 0) {
          int discarded$6 = 0;
          this.b();
          ((ug) this).field_a = 256;
          var2 = -39 / ((11 - param0) / 54);
          int fieldTemp$7 = ((ug) this).field_a - 1;
          ((ug) this).field_a = ((ug) this).field_a - 1;
          return ((ug) this).field_e[fieldTemp$7];
        } else {
          var2 = -39 / ((11 - param0) / 54);
          int fieldTemp$8 = ((ug) this).field_a - 1;
          ((ug) this).field_a = ((ug) this).field_a - 1;
          return ((ug) this).field_e[fieldTemp$8];
        }
    }

    ug(int[] param0) {
        int var2_int = 0;
        try {
            ((ug) this).field_e = new int[256];
            ((ug) this).field_j = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((ug) this).field_e[var2_int] = param0[var2_int];
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ug.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_f = null;
    }

    private final void a(boolean param0) {
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
        var11 = Transmogrify.field_A ? 1 : 0;
        var3 = -1640531527;
        var7 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var8 = -1640531527;
        var10 = -1640531527;
        var9 = -1640531527;
        var5 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    int discarded$1 = 0;
                    this.b();
                    ((ug) this).field_a = 256;
                    return;
                  } else {
                    var4 = var4 + ((ug) this).field_j[1 + var2];
                    var10 = var10 + ((ug) this).field_j[var2 - -7];
                    var7 = var7 + ((ug) this).field_j[var2 + 4];
                    var3 = var3 + ((ug) this).field_j[var2];
                    var9 = var9 + ((ug) this).field_j[6 + var2];
                    var8 = var8 + ((ug) this).field_j[5 + var2];
                    var5 = var5 + ((ug) this).field_j[var2 + 2];
                    var6 = var6 + ((ug) this).field_j[var2 - -3];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var8 = var8 + var5;
                    var6 = var6 + var7;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((ug) this).field_j[var2] = var3;
                    ((ug) this).field_j[1 + var2] = var4;
                    ((ug) this).field_j[2 + var2] = var5;
                    ((ug) this).field_j[3 + var2] = var6;
                    ((ug) this).field_j[var2 - -4] = var7;
                    ((ug) this).field_j[var2 - -5] = var8;
                    ((ug) this).field_j[6 + var2] = var9;
                    ((ug) this).field_j[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var6 = var6 + ((ug) this).field_e[3 + var2];
                var9 = var9 + ((ug) this).field_e[var2 + 6];
                var8 = var8 + ((ug) this).field_e[var2 + 5];
                var7 = var7 + ((ug) this).field_e[4 + var2];
                var5 = var5 + ((ug) this).field_e[2 + var2];
                var10 = var10 + ((ug) this).field_e[7 + var2];
                var4 = var4 + ((ug) this).field_e[1 + var2];
                var3 = var3 + ((ug) this).field_e[var2];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
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
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((ug) this).field_j[var2] = var3;
                ((ug) this).field_j[var2 - -1] = var4;
                ((ug) this).field_j[var2 - -2] = var5;
                ((ug) this).field_j[3 + var2] = var6;
                ((ug) this).field_j[4 + var2] = var7;
                ((ug) this).field_j[var2 + 5] = var8;
                ((ug) this).field_j[var2 - -6] = var9;
                ((ug) this).field_j[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
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
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ti(540, 140);
        field_h = 0;
    }
}
