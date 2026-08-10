/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends kd {
    static int[] field_j;
    static int[] field_k;
    static int[] field_l;
    int field_h;
    static int[] field_m;
    static be[] field_i;

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_m = null;
        field_l = null;
        int var1 = 59 % ((-67 - param0) / 55);
        field_k = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_i = (be[]) null;
                break L1;
              }
            }
            stackIn_3_0 = bh.a(false, param0, -84);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("bd.C(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    bd(int param0) {
        this.field_h = param0;
    }

    final static void a(int param0, int param1) {
        kd var2 = null;
        int var3 = 0;
        tg var4 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (tg) ((Object) bg.field_c.a(true));
            L1: while (true) {
              if (var4 == null) {
                if (param1 == -4584) {
                  var2 = tl.field_h.a(true);
                  L2: while (true) {
                    if (var2 == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      dd.a(53, param0);
                      var2 = tl.field_h.f(2);
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                p.a(var4, param0, (byte) 24);
                var4 = (tg) ((Object) bg.field_c.f(2));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "bd.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean c(boolean param0) {
        if (!param0) {
          if (jc.field_b != null) {
            if (gg.field_b != uf.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          bd.a(110, 10);
          if (jc.field_b != null) {
            if (gg.field_b != uf.field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    static {
        field_l = new int[128];
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = new int[8192];
    }
}
