/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static int field_e;
    static boolean[] field_f;
    int field_a;
    int[] field_b;
    int field_d;
    static int[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        if (param0 != -19467) {
            vl.a(42);
        }
    }

    final int b(int param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -117 % ((param0 - 60) / 52);
            if (((vl) this).field_b == null) {
              break L1;
            } else {
              if (((vl) this).field_b.length != 0) {
                stackOut_4_0 = ((vl) this).field_b[-1 + ((vl) this).field_b.length];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    final static int a(int param0, int param1) {
        if (param1 >= -113) {
            return -7;
        }
        return bi.field_d[param0 & 2047];
    }

    final static void b(int param0, int param1) {
        int var5 = 0;
        ed var6 = null;
        int var7 = 0;
        ed[] var8 = null;
        ed var9 = null;
        int var10 = EscapeVector.field_A;
        int var2 = param1 == 4 ? 1 : 0;
        if (!(hb.field_b != null)) {
            return;
        }
        if (!(null != qi.field_M)) {
            return;
        }
        if (param1 >= 0) {
            // if_icmpge L50
        } else {
            param1 = 0;
        }
        if (-6 != param1) {
            // if_icmpne L71
        }
        param1 = 0;
        ed[] var3 = hb.field_b[param1];
        if (!(var2 == 0)) {
            var3 = v.field_a;
        }
        if (param0 != 1) {
            vl.a(98);
        }
        ed[] var4 = qi.field_M[param1];
        for (var5 = 0; 3 > var5; var5++) {
            if (!(var3 != null)) {
                param1 = 0;
                var3 = hb.field_b[param1];
                var4 = qi.field_M[param1];
            }
            var6 = var3[var5];
            var7 = var5 + 14;
            var8 = mb.field_f;
            if (var2 != 0) {
                var8 = ob.field_b;
            }
            var8[var7] = var6;
            var9 = var4[var5];
            jm.field_K[var7] = var9;
        }
        fl.a(-1, param1);
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = EscapeVector.field_A;
        if (((vl) this).field_b == null) {
          return 0;
        } else {
          if (0 != ((vl) this).field_b.length) {
            L0: {
              var3 = 1;
              if (param0 == 52) {
                break L0;
              } else {
                int discarded$2 = ((vl) this).a((byte) -102, -12);
                break L0;
              }
            }
            L1: while (true) {
              if (((vl) this).field_b.length <= var3) {
                return ((vl) this).field_b.length - 1;
              } else {
                if (((vl) this).field_b[var3] + ((vl) this).field_b[-1 + var3] >> 1601182817 <= param1) {
                  var3++;
                  continue L1;
                } else {
                  return -1 + var3;
                }
              }
            }
          } else {
            return 0;
          }
        }
    }

    vl(int param0, int param1, int param2) {
        ((vl) this).field_a = param1;
        ((vl) this).field_d = param0;
        ((vl) this).field_b = new int[1 + param2];
    }

    final static int[] a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = EscapeVector.field_A;
        int[] var7 = new int[param2];
        int[] var4 = var7;
        for (var5 = 0; var5 < param2; var5++) {
            var7[var5] = (var5 + (param1 - -1)) * param0;
        }
        if (param3 != -17) {
            field_f = null;
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new boolean[]{false, false, false, false};
        field_c = new int[]{19, 20};
    }
}
