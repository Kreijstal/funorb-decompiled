/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static w field_i;
    private int[] field_f;
    static ui[] field_a;
    private int field_c;
    static ud field_g;
    private int field_j;
    private int field_e;
    private int field_h;
    static int[] field_b;
    private int[] field_d;

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
    }

    final int a(boolean param0) {
        if (!(0 != ((ee) this).field_e)) {
            this.b(-1);
            ((ee) this).field_e = 256;
        }
        if (param0) {
            return 55;
        }
        int fieldTemp$0 = ((ee) this).field_e - 1;
        ((ee) this).field_e = ((ee) this).field_e - 1;
        return ((ee) this).field_d[fieldTemp$0];
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        int fieldTemp$3 = ((ee) this).field_h + 1;
        ((ee) this).field_h = ((ee) this).field_h + 1;
        ((ee) this).field_j = ((ee) this).field_j + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            L1: {
              var3 = ((ee) this).field_f[var2];
              if (0 == (var2 & 2)) {
                if ((var2 & 1) != 0) {
                  ((ee) this).field_c = ((ee) this).field_c ^ ((ee) this).field_c >>> 6;
                  break L1;
                } else {
                  ((ee) this).field_c = ((ee) this).field_c ^ ((ee) this).field_c << 13;
                  break L1;
                }
              } else {
                if ((var2 & 1) == 0) {
                  ((ee) this).field_c = ((ee) this).field_c ^ ((ee) this).field_c << 2;
                  break L1;
                } else {
                  ((ee) this).field_c = ((ee) this).field_c ^ ((ee) this).field_c >>> 16;
                  break L1;
                }
              }
            }
            ((ee) this).field_c = ((ee) this).field_c + ((ee) this).field_f[128 + var2 & 255];
            int dupTemp$4 = ((ee) this).field_j + ((ee) this).field_c + ((ee) this).field_f[lb.a(1020, var3) >> 2];
            var4 = dupTemp$4;
            ((ee) this).field_f[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((ee) this).field_f[lb.a(255, var4 >> 8 >> 2)];
            ((ee) this).field_j = dupTemp$5;
            ((ee) this).field_d[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (0 >= param1) {
            throw new IllegalArgumentException();
        }
        int var3 = -(int)(4294967296L % (long)param1) + 2147483647;
        if (param0 < 71) {
            field_a = null;
        }
        while (true) {
            var4 = ((ee) this).a(false);
            if (var4 <= var3) {
                break;
            }
        }
        return oi.a(param1, 83, var4);
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
        var11 = client.field_A ? 1 : 0;
        var6 = -1640531527;
        var7 = -1640531527;
        var4 = -1640531527;
        var5 = -1640531527;
        var10 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (4 <= var2) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    this.b(-1);
                    ((ee) this).field_e = 256;
                    return;
                  } else {
                    var10 = var10 + ((ee) this).field_f[var2 + 7];
                    var6 = var6 + ((ee) this).field_f[3 + var2];
                    var4 = var4 + ((ee) this).field_f[1 + var2];
                    var3 = var3 + ((ee) this).field_f[var2];
                    var8 = var8 + ((ee) this).field_f[5 + var2];
                    var5 = var5 + ((ee) this).field_f[var2 + 2];
                    var9 = var9 + ((ee) this).field_f[6 + var2];
                    var7 = var7 + ((ee) this).field_f[4 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
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
                    var10 = var10 + var7;
                    var8 = var8 + var9;
                    var8 = var8 ^ var9 >>> 4;
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((ee) this).field_f[var2] = var3;
                    ((ee) this).field_f[1 + var2] = var4;
                    ((ee) this).field_f[var2 + 2] = var5;
                    ((ee) this).field_f[3 + var2] = var6;
                    ((ee) this).field_f[var2 - -4] = var7;
                    ((ee) this).field_f[5 + var2] = var8;
                    ((ee) this).field_f[6 + var2] = var9;
                    ((ee) this).field_f[7 + var2] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var10 = var10 + ((ee) this).field_d[7 + var2];
                var6 = var6 + ((ee) this).field_d[3 + var2];
                var9 = var9 + ((ee) this).field_d[6 + var2];
                var7 = var7 + ((ee) this).field_d[4 + var2];
                var4 = var4 + ((ee) this).field_d[var2 - -1];
                var8 = var8 + ((ee) this).field_d[5 + var2];
                var3 = var3 + ((ee) this).field_d[var2];
                var5 = var5 + ((ee) this).field_d[2 + var2];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
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
                ((ee) this).field_f[var2] = var3;
                ((ee) this).field_f[var2 + 1] = var4;
                ((ee) this).field_f[var2 + 2] = var5;
                ((ee) this).field_f[3 + var2] = var6;
                ((ee) this).field_f[4 + var2] = var7;
                ((ee) this).field_f[5 + var2] = var8;
                ((ee) this).field_f[var2 - -6] = var9;
                ((ee) this).field_f[var2 - -7] = var10;
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

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (param1) {
            if (ad.field_i[param3] >= ad.field_i[param2]) {
              if (ad.field_i[param2] < ad.field_i[param3]) {
                return false;
              } else {
                if (cc.field_h[param3] >= cc.field_h[param2]) {
                  if (cc.field_h[param3] > cc.field_h[param2]) {
                    return false;
                  } else {
                    break L0;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return true;
            }
          } else {
            if (cc.field_h[param3] < cc.field_h[param2]) {
              return true;
            } else {
              if (cc.field_h[param3] > cc.field_h[param2]) {
                return false;
              } else {
                if (ad.field_i[param3] >= ad.field_i[param2]) {
                  if (ad.field_i[param3] <= ad.field_i[param2]) {
                    break L0;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
        var4 = ln.field_a[param3] + (oa.field_e[param3] - -mk.field_b[param3]);
        var5 = mk.field_b[param2] + ln.field_a[param2] + oa.field_e[param2];
        if (var5 <= var4) {
          if (var4 <= var5) {
            L1: {
              if (param3 >= param2) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L1;
              } else {
                stackOut_26_0 = 1;
                stackIn_28_0 = stackOut_26_0;
                break L1;
              }
            }
            return stackIn_28_0 != 0;
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    ee(int[] param0) {
        int var2_int = 0;
        try {
            ((ee) this).field_f = new int[256];
            ((ee) this).field_d = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((ee) this).field_d[var2_int] = param0[var2_int];
            }
            this.a(8388607);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "ee.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ui[4];
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
