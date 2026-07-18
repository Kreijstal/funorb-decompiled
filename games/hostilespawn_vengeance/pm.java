/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static boolean field_h;
    static int[] field_g;
    int field_i;
    static boolean field_e;
    int field_f;
    static boolean field_a;
    int[] field_b;
    static long field_c;
    static int field_d;

    public static void b(byte param0) {
        field_g = null;
    }

    final int a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 111) {
            break L0;
          } else {
            ((pm) this).field_i = -31;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((pm) this).field_b == null) {
              break L2;
            } else {
              if (((pm) this).field_b.length == 0) {
                break L2;
              } else {
                stackOut_4_0 = ((pm) this).field_b[-1 + ((pm) this).field_b.length];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        rg.field_d[fc.field_z] = param0;
        db.field_s[fc.field_z] = fc.field_z;
        qa.field_d[fc.field_z] = param1;
        if (!(param1 <= rf.field_c)) {
            kl.field_a = param1;
        }
        if (!(i.field_f <= param1)) {
            bh.field_e = param1;
        }
        ta.field_mb[fc.field_z] = param5;
        og.field_b[fc.field_z] = param3;
        db.field_t[fc.field_z] = param4;
        int var6 = param3 + (param5 - -param4);
        if (param2 <= 64) {
            field_h = false;
        }
        int var7 = var6 == 0 ? 0 : 1000 * param5 / var6;
        hi.field_n[fc.field_z] = var7;
        if (var7 < bh.field_e) {
            bh.field_e = var7;
        }
        if (kl.field_a < var7) {
            kl.field_a = var7;
        }
        fc.field_z = fc.field_z + 1;
    }

    final static bd[] a(int param0, int param1, byte param2, int param3) {
        return ei.a(param0, 1, param1, param3, 119);
    }

    final static String a(long param0, byte param1) {
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        int var12 = HostileSpawn.field_I ? 1 : 0;
        if (0L >= param0) {
            return null;
        }
        if (param0 >= 6582952005840035281L) {
            return null;
        }
        if (param0 % 37L == 0L) {
            return null;
        }
        int var4 = 74;
        int var3 = 0;
        long var5 = param0;
        while (var5 != 0L) {
            var3++;
            var5 = var5 / 37L;
        }
        StringBuilder var7 = new StringBuilder(var3);
        while (0L != param0) {
            var8 = param0;
            param0 = param0 / 37L;
            var10 = nf.field_h[(int)(-(37L * param0) + var8)];
            if (var10 == 95) {
                var11 = -1 + var7.length();
                var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                var10 = 160;
            }
            StringBuilder discarded$0 = var7.append((char) var10);
        }
        StringBuilder discarded$1 = var7.reverse();
        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
        return var7.toString();
    }

    final int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (null == ((pm) this).field_b) {
            break L0;
          } else {
            if (((pm) this).field_b.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (var3 >= ((pm) this).field_b.length) {
                  var4 = -108 / ((-45 - param1) / 61);
                  return ((pm) this).field_b.length + -1;
                } else {
                  if (((pm) this).field_b[var3] + ((pm) this).field_b[var3 - 1] >> 1 > param0) {
                    return var3 + -1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    pm(int param0, int param1, int param2) {
        ((pm) this).field_i = param0;
        ((pm) this).field_f = param1;
        ((pm) this).field_b = new int[param2 + 1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_g = new int[]{0, 1000, 2500, 5000, 10000, 15000, 20000, 25000, 40000, 50000, 60000, 70000, 80000, 90000, 100000, 125000, 150000, 175000, 200000, 250000};
        field_e = true;
        field_a = false;
    }
}
