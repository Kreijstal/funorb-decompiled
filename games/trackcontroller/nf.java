/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private int field_c;
    static int field_e;
    private int[] field_d;
    private int[] field_i;
    static String[] field_g;
    static String field_h;
    static boolean field_f;
    private int field_b;
    private int field_j;
    private int field_a;

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
        L0: {
          var11 = TrackController.field_F ? 1 : 0;
          var10 = -1640531527;
          var6 = -1640531527;
          var3 = -1640531527;
          if (param0 > 11) {
            break L0;
          } else {
            int discarded$1 = ((nf) this).c(100);
            break L0;
          }
        }
        var9 = -1640531527;
        var4 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -5) {
            var2 = 0;
            L2: while (true) {
              if ((var2 ^ -1) <= -257) {
                var2 = 0;
                L3: while (true) {
                  if (-257 >= (var2 ^ -1)) {
                    this.a((byte) 35);
                    ((nf) this).field_a = 256;
                    return;
                  } else {
                    var8 = var8 + ((nf) this).field_d[var2 - -5];
                    var7 = var7 + ((nf) this).field_d[var2 - -4];
                    var6 = var6 + ((nf) this).field_d[var2 - -3];
                    var10 = var10 + ((nf) this).field_d[var2 + 7];
                    var9 = var9 + ((nf) this).field_d[6 + var2];
                    var3 = var3 + ((nf) this).field_d[var2];
                    var4 = var4 + ((nf) this).field_d[var2 - -1];
                    var5 = var5 + ((nf) this).field_d[var2 - -2];
                    var3 = var3 ^ var4 << 1667466955;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
                    var4 = var4 ^ var5 >>> -172377726;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << -278718712;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 1300225680;
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 73030602;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 1747567652;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << -1272227224;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> -1797124791;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((nf) this).field_d[var2] = var3;
                    ((nf) this).field_d[1 + var2] = var4;
                    ((nf) this).field_d[2 + var2] = var5;
                    ((nf) this).field_d[var2 - -3] = var6;
                    ((nf) this).field_d[var2 + 4] = var7;
                    ((nf) this).field_d[var2 + 5] = var8;
                    ((nf) this).field_d[var2 + 6] = var9;
                    ((nf) this).field_d[var2 - -7] = var10;
                    var2 += 8;
                    continue L3;
                  }
                }
              } else {
                var10 = var10 + ((nf) this).field_i[var2 + 7];
                var8 = var8 + ((nf) this).field_i[var2 + 5];
                var4 = var4 + ((nf) this).field_i[var2 - -1];
                var3 = var3 + ((nf) this).field_i[var2];
                var9 = var9 + ((nf) this).field_i[var2 + 6];
                var7 = var7 + ((nf) this).field_i[var2 - -4];
                var6 = var6 + ((nf) this).field_i[3 + var2];
                var5 = var5 + ((nf) this).field_i[var2 + 2];
                var3 = var3 ^ var4 << -181970773;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1432336226;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << 129906856;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -1483674992;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << 1740627978;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 1279641220;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1845179608;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1589383191;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((nf) this).field_d[var2] = var3;
                ((nf) this).field_d[1 + var2] = var4;
                ((nf) this).field_d[2 + var2] = var5;
                ((nf) this).field_d[3 + var2] = var6;
                ((nf) this).field_d[4 + var2] = var7;
                ((nf) this).field_d[5 + var2] = var8;
                ((nf) this).field_d[var2 - -6] = var9;
                ((nf) this).field_d[var2 - -7] = var10;
                var2 += 8;
                continue L2;
              }
            }
          } else {
            var3 = var3 ^ var4 << -549939605;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 1953388258;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << -1524374968;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> -1342190384;
            var7 = var7 + var8;
            var9 = var9 + var6;
            var7 = var7 ^ var8 << 778803018;
            var10 = var10 + var7;
            var8 = var8 + var9;
            var8 = var8 ^ var9 >>> -683276988;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << -168783512;
            var10 = var10 + var3;
            var4 = var4 + var9;
            var10 = var10 ^ var3 >>> 1288660425;
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L1;
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        if (param0 != 261211) {
            field_g = null;
        }
        field_g = null;
    }

    final static void a(boolean param0, String param1, String param2, byte param3) {
        qg.field_c = param2;
        lf.field_T = param1;
        nb.a(rk.field_Z, param0, param3 + -16152);
        if (param3 != -105) {
            field_h = null;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          int fieldTemp$3 = ((nf) this).field_b + 1;
          ((nf) this).field_b = ((nf) this).field_b + 1;
          ((nf) this).field_j = ((nf) this).field_j + fieldTemp$3;
          if (param0 == 35) {
            break L0;
          } else {
            this.a((byte) 91);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (-257 >= (var2 ^ -1)) {
            return;
          } else {
            L2: {
              var3 = ((nf) this).field_d[var2];
              if ((2 & var2) == 0) {
                if ((1 & var2) != 0) {
                  ((nf) this).field_c = ((nf) this).field_c ^ ((nf) this).field_c >>> -623723002;
                  break L2;
                } else {
                  ((nf) this).field_c = ((nf) this).field_c ^ ((nf) this).field_c << 407897933;
                  break L2;
                }
              } else {
                if (0 != (var2 & 1)) {
                  ((nf) this).field_c = ((nf) this).field_c ^ ((nf) this).field_c >>> -932204784;
                  break L2;
                } else {
                  ((nf) this).field_c = ((nf) this).field_c ^ ((nf) this).field_c << 121624642;
                  break L2;
                }
              }
            }
            ((nf) this).field_c = ((nf) this).field_c + ((nf) this).field_d[var2 - -128 & 255];
            int dupTemp$4 = ((nf) this).field_j + (((nf) this).field_d[tc.a(1020, var3) >> 445898626] - -((nf) this).field_c);
            var4 = dupTemp$4;
            ((nf) this).field_d[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((nf) this).field_d[tc.a(var4, 261211) >> -1807985880 >> -253428158];
            ((nf) this).field_j = dupTemp$5;
            ((nf) this).field_i[var2] = dupTemp$5;
            var2++;
            continue L1;
          }
        }
    }

    final int c(int param0) {
        if (!(0 != ((nf) this).field_a)) {
            this.a((byte) 35);
            ((nf) this).field_a = 256;
        }
        if (param0 <= 124) {
            this.a((byte) 58);
        }
        int fieldTemp$0 = ((nf) this).field_a - 1;
        ((nf) this).field_a = ((nf) this).field_a - 1;
        return ((nf) this).field_i[fieldTemp$0];
    }

    nf(int[] param0) {
        int var2 = 0;
        ((nf) this).field_i = new int[256];
        ((nf) this).field_d = new int[256];
        for (var2 = 0; var2 < param0.length; var2++) {
            ((nf) this).field_i[var2] = param0[var2];
        }
        this.a(66);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_h = "Show my scores and my friends' scores. ";
    }
}
