/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static String field_d;
    static int field_b;
    private int field_a;
    static String field_m;
    static String[] field_f;
    static int field_j;
    private int[] field_e;
    private int[] field_l;
    private int field_c;
    static byte[][][] field_h;
    static int[] field_i;
    private int field_g;
    private int field_k;

    final static void a(boolean param0, String param1, String param2) {
        try {
            af.a(param2, false, param1, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pc.F(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        int fieldTemp$3 = ((pc) this).field_a + 1;
        ((pc) this).field_a = ((pc) this).field_a + 1;
        ((pc) this).field_k = ((pc) this).field_k + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((pc) this).field_l[var2];
              if ((2 & var2) == 0) {
                if (0 != (1 & var2)) {
                  ((pc) this).field_g = ((pc) this).field_g ^ ((pc) this).field_g >>> 6;
                  break L1;
                } else {
                  ((pc) this).field_g = ((pc) this).field_g ^ ((pc) this).field_g << 13;
                  break L1;
                }
              } else {
                if (0 != (var2 & 1)) {
                  ((pc) this).field_g = ((pc) this).field_g ^ ((pc) this).field_g >>> 16;
                  break L1;
                } else {
                  ((pc) this).field_g = ((pc) this).field_g ^ ((pc) this).field_g << 2;
                  break L1;
                }
              }
            }
            ((pc) this).field_g = ((pc) this).field_g + ((pc) this).field_l[255 & var2 + 128];
            int dupTemp$4 = ((pc) this).field_k + (((pc) this).field_l[sc.a(var3 >> 2, 255)] + ((pc) this).field_g);
            var4 = dupTemp$4;
            ((pc) this).field_l[var2] = dupTemp$4;
            int dupTemp$5 = ((pc) this).field_l[sc.a(var4 >> 8 >> 2, 255)] + var3;
            ((pc) this).field_k = dupTemp$5;
            ((pc) this).field_e[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

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
        var11 = fleas.field_A ? 1 : 0;
        var4 = -1640531527;
        var8 = -1640531527;
        var7 = -1640531527;
        var9 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var5 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    int discarded$1 = 2;
                    this.b();
                    ((pc) this).field_c = 256;
                    return;
                  } else {
                    var10 = var10 + ((pc) this).field_l[7 + var2];
                    var6 = var6 + ((pc) this).field_l[var2 - -3];
                    var9 = var9 + ((pc) this).field_l[var2 + 6];
                    var8 = var8 + ((pc) this).field_l[5 + var2];
                    var4 = var4 + ((pc) this).field_l[1 + var2];
                    var3 = var3 + ((pc) this).field_l[var2];
                    var5 = var5 + ((pc) this).field_l[var2 + 2];
                    var7 = var7 + ((pc) this).field_l[var2 + 4];
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
                    ((pc) this).field_l[var2] = var3;
                    ((pc) this).field_l[1 + var2] = var4;
                    ((pc) this).field_l[var2 - -2] = var5;
                    ((pc) this).field_l[3 + var2] = var6;
                    ((pc) this).field_l[var2 + 4] = var7;
                    ((pc) this).field_l[var2 - -5] = var8;
                    ((pc) this).field_l[6 + var2] = var9;
                    ((pc) this).field_l[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var10 = var10 + ((pc) this).field_e[var2 - -7];
                var3 = var3 + ((pc) this).field_e[var2];
                var5 = var5 + ((pc) this).field_e[var2 - -2];
                var9 = var9 + ((pc) this).field_e[var2 + 6];
                var8 = var8 + ((pc) this).field_e[var2 + 5];
                var6 = var6 + ((pc) this).field_e[3 + var2];
                var7 = var7 + ((pc) this).field_e[var2 - -4];
                var4 = var4 + ((pc) this).field_e[var2 + 1];
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
                ((pc) this).field_l[var2] = var3;
                ((pc) this).field_l[var2 + 1] = var4;
                ((pc) this).field_l[2 + var2] = var5;
                ((pc) this).field_l[var2 - -3] = var6;
                ((pc) this).field_l[4 + var2] = var7;
                ((pc) this).field_l[5 + var2] = var8;
                ((pc) this).field_l[6 + var2] = var9;
                ((pc) this).field_l[var2 - -7] = var10;
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
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var7 = var7 + var8;
            var9 = var9 + var6;
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
            var2++;
            continue L0;
          }
        }
    }

    final static boolean a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (wi.field_b != 0) {
              break L1;
            } else {
              if (fleas.field_L != 0) {
                break L1;
              } else {
                if (hj.field_a[1] != 0) {
                  break L1;
                } else {
                  if (hj.field_a[0] == 0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_7_0 != 0;
    }

    public static void c(int param0) {
        field_d = null;
        field_f = null;
        field_i = null;
        field_m = null;
        field_h = null;
        int var1 = -53 / ((-72 - param0) / 43);
    }

    final int a(int param0) {
        if (param0 != 995108848) {
            field_m = null;
        }
        if (((pc) this).field_c == 0) {
            int discarded$0 = 2;
            this.b();
            ((pc) this).field_c = 256;
        }
        int fieldTemp$1 = ((pc) this).field_c - 1;
        ((pc) this).field_c = ((pc) this).field_c - 1;
        return ((pc) this).field_e[fieldTemp$1];
    }

    pc(int[] param0) {
        int var2_int = 0;
        try {
            ((pc) this).field_e = new int[256];
            ((pc) this).field_l = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((pc) this).field_e[var2_int] = param0[var2_int];
            }
            int discarded$0 = -125;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "pc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Create a free account to store your progress.";
        field_i = new int[8192];
        field_d = "Achievements";
    }
}
