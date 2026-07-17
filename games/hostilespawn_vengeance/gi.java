/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi {
    static String field_m;
    static bd field_f;
    private int[] field_k;
    private int field_e;
    private int field_g;
    static int[] field_l;
    static bd field_d;
    static String field_n;
    private int field_i;
    private int field_b;
    static gb field_h;
    private int[] field_a;
    static bd field_c;
    static bd field_j;

    private final void a() {
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        var4 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var6 = -1640531527;
        var5 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.a((byte) 109);
                    ((gi) this).field_e = 256;
                    return;
                  } else {
                    var9 = var9 + ((gi) this).field_a[var2 - -6];
                    var6 = var6 + ((gi) this).field_a[var2 - -3];
                    var5 = var5 + ((gi) this).field_a[var2 + 2];
                    var4 = var4 + ((gi) this).field_a[1 + var2];
                    var8 = var8 + ((gi) this).field_a[var2 + 5];
                    var10 = var10 + ((gi) this).field_a[7 + var2];
                    var3 = var3 + ((gi) this).field_a[var2];
                    var7 = var7 + ((gi) this).field_a[var2 + 4];
                    var3 = var3 ^ var4 << 11;
                    var4 = var4 + var5;
                    var6 = var6 + var3;
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
                    ((gi) this).field_a[var2] = var3;
                    ((gi) this).field_a[1 + var2] = var4;
                    ((gi) this).field_a[2 + var2] = var5;
                    ((gi) this).field_a[var2 + 3] = var6;
                    ((gi) this).field_a[var2 + 4] = var7;
                    ((gi) this).field_a[var2 - -5] = var8;
                    ((gi) this).field_a[var2 + 6] = var9;
                    ((gi) this).field_a[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var10 = var10 + ((gi) this).field_k[var2 + 7];
                var8 = var8 + ((gi) this).field_k[var2 + 5];
                var7 = var7 + ((gi) this).field_k[var2 + 4];
                var9 = var9 + ((gi) this).field_k[var2 - -6];
                var6 = var6 + ((gi) this).field_k[3 + var2];
                var3 = var3 + ((gi) this).field_k[var2];
                var5 = var5 + ((gi) this).field_k[2 + var2];
                var4 = var4 + ((gi) this).field_k[1 + var2];
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
                ((gi) this).field_a[var2] = var3;
                ((gi) this).field_a[1 + var2] = var4;
                ((gi) this).field_a[2 + var2] = var5;
                ((gi) this).field_a[3 + var2] = var6;
                ((gi) this).field_a[4 + var2] = var7;
                ((gi) this).field_a[var2 + 5] = var8;
                ((gi) this).field_a[6 + var2] = var9;
                ((gi) this).field_a[7 + var2] = var10;
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
            var3 = var3 + var4;
            var5 = var5 + var10;
            var2++;
            continue L0;
          }
        }
    }

    final static boolean b() {
        int var1 = -1;
        return li.field_o;
    }

    final int a(boolean param0) {
        if (!param0) {
            field_m = null;
        }
        if (0 == ((gi) this).field_e) {
            this.a((byte) 112);
            ((gi) this).field_e = 256;
        }
        int fieldTemp$0 = ((gi) this).field_e - 1;
        ((gi) this).field_e = ((gi) this).field_e - 1;
        return ((gi) this).field_k[fieldTemp$0];
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = HostileSpawn.field_I ? 1 : 0;
        if (param0 >= 106) {
          int fieldTemp$3 = ((gi) this).field_i + 1;
          ((gi) this).field_i = ((gi) this).field_i + 1;
          ((gi) this).field_b = ((gi) this).field_b + fieldTemp$3;
          var2 = 0;
          L0: while (true) {
            if (var2 >= 256) {
              return;
            } else {
              L1: {
                var3 = ((gi) this).field_a[var2];
                if (0 != (2 & var2)) {
                  if (0 == (var2 & 1)) {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g << 2;
                    break L1;
                  } else {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g >>> 16;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) != 0) {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g >>> 6;
                    break L1;
                  } else {
                    ((gi) this).field_g = ((gi) this).field_g ^ ((gi) this).field_g << 13;
                    break L1;
                  }
                }
              }
              ((gi) this).field_g = ((gi) this).field_g + ((gi) this).field_a[255 & 128 + var2];
              int dupTemp$4 = ((gi) this).field_b + (((gi) this).field_g + ((gi) this).field_a[ua.a(1020, var3) >> 2]);
              var4 = dupTemp$4;
              ((gi) this).field_a[var2] = dupTemp$4;
              int dupTemp$5 = ((gi) this).field_a[ua.a(var4 >> 8, 1020) >> 2] + var3;
              ((gi) this).field_b = dupTemp$5;
              ((gi) this).field_k[var2] = dupTemp$5;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    gi(int[] param0) {
        int var2_int = 0;
        try {
            ((gi) this).field_a = new int[256];
            ((gi) this).field_k = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((gi) this).field_k[var2_int] = param0[var2_int];
            }
            int discarded$0 = -7;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "gi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(boolean param0) {
        field_f = null;
        field_j = null;
        field_n = null;
        field_h = null;
        field_m = null;
        field_l = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Pistol";
        field_n = "Close";
        field_l = new int[8192];
    }
}
