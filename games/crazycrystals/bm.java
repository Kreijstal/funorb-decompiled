/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bm {
    private int field_i;
    static int field_h;
    private int[] field_a;
    private int field_b;
    private int[] field_f;
    private int field_d;
    static String field_j;
    static int[][] field_e;
    private int field_c;
    static f field_g;

    final static String b(byte param0) {
        if (param0 <= 88) {
            return null;
        }
        if (null == je.field_g) {
            return "";
        }
        return je.field_g;
    }

    final static void a(int param0, dl[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              nl.field_f = param1;
              if (null == nl.field_f) {
                break L1;
              } else {
                if (3 <= param1.length) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("bm.A(").append(6437).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    final int a(boolean param0) {
        if (0 != ((bm) this).field_b) {
          if (param0) {
            String discarded$6 = bm.b((byte) 50);
            int fieldTemp$7 = ((bm) this).field_b - 1;
            ((bm) this).field_b = ((bm) this).field_b - 1;
            return ((bm) this).field_f[fieldTemp$7];
          } else {
            int fieldTemp$8 = ((bm) this).field_b - 1;
            ((bm) this).field_b = ((bm) this).field_b - 1;
            return ((bm) this).field_f[fieldTemp$8];
          }
        } else {
          this.a(-95);
          ((bm) this).field_b = 256;
          if (!param0) {
            int fieldTemp$9 = ((bm) this).field_b - 1;
            ((bm) this).field_b = ((bm) this).field_b - 1;
            return ((bm) this).field_f[fieldTemp$9];
          } else {
            String discarded$10 = bm.b((byte) 50);
            int fieldTemp$11 = ((bm) this).field_b - 1;
            ((bm) this).field_b = ((bm) this).field_b - 1;
            return ((bm) this).field_f[fieldTemp$11];
          }
        }
    }

    public static void a() {
        field_j = null;
        field_g = null;
        field_e = null;
    }

    private final void b() {
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
        var11 = CrazyCrystals.field_B;
        var5 = -1640531527;
        var6 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var3 = -1640531527;
        var4 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (256 <= var2) {
                    this.a(-53);
                    ((bm) this).field_b = 256;
                    return;
                  } else {
                    var4 = var4 + ((bm) this).field_a[var2 - -1];
                    var3 = var3 + ((bm) this).field_a[var2];
                    var8 = var8 + ((bm) this).field_a[var2 + 5];
                    var7 = var7 + ((bm) this).field_a[4 + var2];
                    var9 = var9 + ((bm) this).field_a[var2 - -6];
                    var6 = var6 + ((bm) this).field_a[var2 - -3];
                    var5 = var5 + ((bm) this).field_a[2 + var2];
                    var10 = var10 + ((bm) this).field_a[7 + var2];
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
                    var9 = var9 + var6;
                    var7 = var7 + var8;
                    var7 = var7 ^ var8 << 10;
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((bm) this).field_a[var2] = var3;
                    ((bm) this).field_a[var2 + 1] = var4;
                    ((bm) this).field_a[var2 - -2] = var5;
                    ((bm) this).field_a[var2 - -3] = var6;
                    ((bm) this).field_a[4 + var2] = var7;
                    ((bm) this).field_a[5 + var2] = var8;
                    ((bm) this).field_a[6 + var2] = var9;
                    ((bm) this).field_a[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var10 = var10 + ((bm) this).field_f[var2 + 7];
                var4 = var4 + ((bm) this).field_f[1 + var2];
                var5 = var5 + ((bm) this).field_f[var2 + 2];
                var9 = var9 + ((bm) this).field_f[var2 - -6];
                var6 = var6 + ((bm) this).field_f[var2 + 3];
                var8 = var8 + ((bm) this).field_f[5 + var2];
                var7 = var7 + ((bm) this).field_f[var2 + 4];
                var3 = var3 + ((bm) this).field_f[var2];
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
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> 9;
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((bm) this).field_a[var2] = var3;
                ((bm) this).field_a[1 + var2] = var4;
                ((bm) this).field_a[var2 + 2] = var5;
                ((bm) this).field_a[var2 - -3] = var6;
                ((bm) this).field_a[var2 + 4] = var7;
                ((bm) this).field_a[5 + var2] = var8;
                ((bm) this).field_a[var2 - -6] = var9;
                ((bm) this).field_a[var2 - -7] = var10;
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
            var9 = var9 + var6;
            var7 = var7 + var8;
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
            var2++;
            continue L0;
          }
        }
    }

    bm(int[] param0) {
        int var2_int = 0;
        try {
            ((bm) this).field_a = new int[256];
            ((bm) this).field_f = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((bm) this).field_f[var2_int] = param0[var2_int];
            }
            int discarded$0 = 1;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "bm.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (param0 <= -35) {
          int fieldTemp$6 = ((bm) this).field_d + 1;
          ((bm) this).field_d = ((bm) this).field_d + 1;
          ((bm) this).field_c = ((bm) this).field_c + fieldTemp$6;
          var2 = 0;
          L0: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L1: {
                var3 = ((bm) this).field_a[var2];
                if ((var2 & 2) == 0) {
                  if ((var2 & 1) != 0) {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i >>> 6;
                    break L1;
                  } else {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i << 13;
                    break L1;
                  }
                } else {
                  if ((var2 & 1) == 0) {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i << 2;
                    break L1;
                  } else {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i >>> 16;
                    break L1;
                  }
                }
              }
              ((bm) this).field_i = ((bm) this).field_i + ((bm) this).field_a[var2 - -128 & 255];
              int dupTemp$7 = ((bm) this).field_a[pf.b(255, var3 >> 2)] + ((bm) this).field_i + ((bm) this).field_c;
              var4 = dupTemp$7;
              ((bm) this).field_a[var2] = dupTemp$7;
              int dupTemp$8 = var3 + ((bm) this).field_a[pf.b(1020, var4 >> 8) >> 2];
              ((bm) this).field_c = dupTemp$8;
              ((bm) this).field_f[var2] = dupTemp$8;
              var2++;
              continue L0;
            }
          }
        } else {
          field_j = null;
          int fieldTemp$9 = ((bm) this).field_d + 1;
          ((bm) this).field_d = ((bm) this).field_d + 1;
          ((bm) this).field_c = ((bm) this).field_c + fieldTemp$9;
          var2 = 0;
          L2: while (true) {
            if (256 <= var2) {
              return;
            } else {
              L3: {
                var3 = ((bm) this).field_a[var2];
                if ((var2 & 2) == 0) {
                  if ((var2 & 1) != 0) {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i >>> 6;
                    break L3;
                  } else {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i << 13;
                    break L3;
                  }
                } else {
                  if ((var2 & 1) == 0) {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i << 2;
                    break L3;
                  } else {
                    ((bm) this).field_i = ((bm) this).field_i ^ ((bm) this).field_i >>> 16;
                    break L3;
                  }
                }
              }
              ((bm) this).field_i = ((bm) this).field_i + ((bm) this).field_a[var2 - -128 & 255];
              int dupTemp$10 = ((bm) this).field_a[pf.b(255, var3 >> 2)] + ((bm) this).field_i + ((bm) this).field_c;
              var4 = dupTemp$10;
              ((bm) this).field_a[var2] = dupTemp$10;
              int dupTemp$11 = var3 + ((bm) this).field_a[pf.b(1020, var4 >> 8) >> 2];
              ((bm) this).field_c = dupTemp$11;
              ((bm) this).field_f[var2] = dupTemp$11;
              var2++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_j = "Achieved";
        field_g = (f) (Object) new kp(-1);
    }
}
