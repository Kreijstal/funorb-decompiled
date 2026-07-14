/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static boolean field_b;
    static nb field_d;
    static int field_a;
    static km field_c;

    final synchronized static long a(int param0) {
        long var1 = 0L;
        Object var3 = null;
        var1 = System.currentTimeMillis();
        if (v.field_a <= var1) {
          v.field_a = var1;
          if (param0 != 2) {
            var3 = null;
            tm[] discarded$4 = ud.a(-100, (jk) null);
            return var1 + cl.field_b;
          } else {
            return var1 + cl.field_b;
          }
        } else {
          cl.field_b = cl.field_b + (-var1 + v.field_a);
          v.field_a = var1;
          if (param0 == 2) {
            return var1 + cl.field_b;
          } else {
            var3 = null;
            tm[] discarded$5 = ud.a(-100, (jk) null);
            return var1 + cl.field_b;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -109) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final static tm[] a(int param0, jk param1) {
        int[] var3 = null;
        tm[] var4 = null;
        int var5 = 0;
        tm var6 = null;
        int var7 = 0;
        Object var8 = null;
        nl var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        tm[] var13 = null;
        int[] var14 = null;
        tm[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var7 = Chess.field_G;
        if (!param1.a(true)) {
          return new tm[]{};
        } else {
          var9 = param1.a(param0 + -624985114);
          L0: while (true) {
            if (var9.field_f != 0) {
              if (-3 != (var9.field_f ^ -1)) {
                if (param0 == 624968802) {
                  var16 = (int[]) var9.field_b;
                  var12 = var16;
                  var11 = var12;
                  var10 = var11;
                  var3 = var10;
                  var13 = new tm[var16.length >> 254555330];
                  var4 = var13;
                  var5 = 0;
                  L1: while (true) {
                    if (var13.length <= var5) {
                      return var4;
                    } else {
                      var6 = new tm();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1550667262];
                      var6.field_e = var3[1 + (var5 << -157112990)];
                      var6.field_i = var3[2 + (var5 << 624968802)];
                      var6.field_f = var3[3 + (var5 << 1710185090)];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  var8 = null;
                  tm[] discarded$2 = ud.a(42, (jk) null);
                  var17 = (int[]) var9.field_b;
                  var14 = var17;
                  var11 = var14;
                  var10 = var11;
                  var3 = var10;
                  var15 = new tm[var17.length >> 254555330];
                  var4 = var15;
                  var5 = 0;
                  L2: while (true) {
                    if (var15.length <= var5) {
                      return var4;
                    } else {
                      var6 = new tm();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1550667262];
                      var6.field_e = var3[1 + (var5 << -157112990)];
                      var6.field_i = var3[2 + (var5 << 624968802)];
                      var6.field_f = var3[3 + (var5 << 1710185090)];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new tm[]{};
              }
            } else {
              bc.a(10L, (byte) 95);
              continue L0;
            }
          }
        }
    }

    static {
    }
}
