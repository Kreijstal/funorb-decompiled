/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo {
    static vm field_a;
    private int field_m;
    private int[] field_k;
    private int field_j;
    static n field_g;
    private int field_e;
    static int field_h;
    private int[] field_d;
    private int field_l;
    static int field_i;
    static mm field_b;
    static int field_n;
    static int field_c;
    static int field_f;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 < -64) {
          int fieldTemp$3 = ((fo) this).field_e + 1;
          ((fo) this).field_e = ((fo) this).field_e + 1;
          ((fo) this).field_l = ((fo) this).field_l + fieldTemp$3;
          var2 = 0;
          L0: while (true) {
            if (var2 >= 256) {
              return;
            } else {
              L1: {
                var3 = ((fo) this).field_d[var2];
                if ((2 & var2) == 0) {
                  if ((1 & var2) == 0) {
                    ((fo) this).field_m = ((fo) this).field_m ^ ((fo) this).field_m << 13;
                    break L1;
                  } else {
                    ((fo) this).field_m = ((fo) this).field_m ^ ((fo) this).field_m >>> 6;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) == 0) {
                    ((fo) this).field_m = ((fo) this).field_m ^ ((fo) this).field_m << 2;
                    break L1;
                  } else {
                    ((fo) this).field_m = ((fo) this).field_m ^ ((fo) this).field_m >>> 16;
                    break L1;
                  }
                }
              }
              ((fo) this).field_m = ((fo) this).field_m + ((fo) this).field_d[255 & var2 + 128];
              int dupTemp$4 = ((fo) this).field_l + (((fo) this).field_m + ((fo) this).field_d[ik.a(1020, var3) >> 2]);
              var4 = dupTemp$4;
              ((fo) this).field_d[var2] = dupTemp$4;
              int dupTemp$5 = ((fo) this).field_d[ik.a(var4 >> 8 >> 2, 255)] - -var3;
              ((fo) this).field_l = dupTemp$5;
              ((fo) this).field_k[var2] = dupTemp$5;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static void a(vm param0) {
        try {
            int discarded$0 = 1;
            int discarded$1 = -27300;
            vl.a(param0);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fo.A(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (param0 != -37880252) {
            ((fo) this).field_m = -10;
        }
        if (0 >= param1) {
            throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param1) + 2147483647;
        while (true) {
            var4 = ((fo) this).b(123);
            if (var3 >= var4) {
                break;
            }
        }
        return er.a(param0 ^ 1598127099, param1, var4);
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
        var11 = BrickABrac.field_J ? 1 : 0;
        var5 = -1640531527;
        var9 = -1640531527;
        var3 = -1640531527;
        var10 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) -125);
                    ((fo) this).field_j = 256;
                    return;
                  } else {
                    var3 = var3 + ((fo) this).field_d[var2];
                    var4 = var4 + ((fo) this).field_d[1 + var2];
                    var8 = var8 + ((fo) this).field_d[var2 - -5];
                    var7 = var7 + ((fo) this).field_d[var2 - -4];
                    var6 = var6 + ((fo) this).field_d[var2 + 3];
                    var9 = var9 + ((fo) this).field_d[6 + var2];
                    var10 = var10 + ((fo) this).field_d[var2 + 7];
                    var5 = var5 + ((fo) this).field_d[2 + var2];
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
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((fo) this).field_d[var2] = var3;
                    ((fo) this).field_d[var2 - -1] = var4;
                    ((fo) this).field_d[var2 + 2] = var5;
                    ((fo) this).field_d[var2 + 3] = var6;
                    ((fo) this).field_d[4 + var2] = var7;
                    ((fo) this).field_d[var2 - -5] = var8;
                    ((fo) this).field_d[var2 + 6] = var9;
                    ((fo) this).field_d[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var9 = var9 + ((fo) this).field_k[6 + var2];
                var8 = var8 + ((fo) this).field_k[5 + var2];
                var7 = var7 + ((fo) this).field_k[var2 - -4];
                var4 = var4 + ((fo) this).field_k[1 + var2];
                var3 = var3 + ((fo) this).field_k[var2];
                var5 = var5 + ((fo) this).field_k[var2 - -2];
                var6 = var6 + ((fo) this).field_k[var2 + 3];
                var10 = var10 + ((fo) this).field_k[7 + var2];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
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
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((fo) this).field_d[var2] = var3;
                ((fo) this).field_d[var2 - -1] = var4;
                ((fo) this).field_d[2 + var2] = var5;
                ((fo) this).field_d[var2 - -3] = var6;
                ((fo) this).field_d[var2 + 4] = var7;
                ((fo) this).field_d[var2 + 5] = var8;
                ((fo) this).field_d[var2 + 6] = var9;
                ((fo) this).field_d[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
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
            var9 = var9 + var10;
            var3 = var3 + var8;
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

    final int b(int param0) {
        if (param0 < 88) {
            return -47;
        }
        if (!(((fo) this).field_j != 0)) {
            this.a((byte) -111);
            ((fo) this).field_j = 256;
        }
        int fieldTemp$0 = ((fo) this).field_j - 1;
        ((fo) this).field_j = ((fo) this).field_j - 1;
        return ((fo) this).field_k[fieldTemp$0];
    }

    public static void a() {
        field_b = null;
        field_g = null;
        field_a = null;
    }

    fo(int[] param0) {
        int var2_int = 0;
        try {
            ((fo) this).field_d = new int[256];
            ((fo) this).field_k = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((fo) this).field_k[var2_int] = param0[var2_int];
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "fo.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new n();
        qo.a(150, 50);
    }
}
