/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static boolean field_b;
    static nb field_d;
    static int field_a;
    static km field_c;

    final synchronized static long a(int param0) {
        long var1;
        jk var3;
        var1 = System.currentTimeMillis();
        if (v.field_a <= var1) {
          v.field_a = var1;
          if (param0 != 2) {
            var3 = (jk) null;
            ud.a(-100, (jk) null);
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
            var3 = (jk) null;
            ud.a(-100, (jk) null);
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
        tm[] stackIn_4_0 = null;
        tm[] stackIn_10_0 = null;
        tm[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        tm[] var4 = null;
        int var5 = 0;
        tm var6 = null;
        int var7 = 0;
        jk var8 = null;
        nl var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            if (!param1.a(true)) {
              stackIn_4_0 = new tm[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var9 = param1.a(param0 + -624985114);
              L1: while (true) {
                if (var9.field_f != 0) {
                  if (-3 != (var9.field_f ^ -1)) {
                    L2: {
                      if (param0 == 624968802) {
                        break L2;
                      } else {
                        var8 = (jk) null;
                        ud.a(42, (jk) null);
                        break L2;
                      }
                    }
                    var11 = (int[]) (var9.field_b);
                    var10 = var11;
                    var3 = var10;
                    var4 = new tm[var11.length >> 254555330];
                    var5 = 0;
                    L3: while (true) {
                      if (var4.length <= var5) {
                        stackIn_17_0 = (tm[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new tm();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << -1550667262];
                        var6.field_e = var3[1 + (var5 << -157112990)];
                        var6.field_i = var3[2 + (var5 << 624968802)];
                        var6.field_f = var3[3 + (var5 << 1710185090)];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackIn_10_0 = new tm[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  bc.a(10L, (byte) 95);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("ud.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    static {
    }
}
