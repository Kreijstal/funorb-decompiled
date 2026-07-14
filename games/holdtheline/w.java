/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static hj field_c;
    static uf field_a;
    static int field_b;

    final static void a(int param0, hj param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = HoldTheLine.field_D;
          var5 = param1.field_s;
          var6 = param1.field_y;
          var7 = 0;
          if (param4 < 0) {
            var7 = -param4;
            var5 = var5 + param4;
            param4 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var8 = 0;
          if (-641 > var5 + param4) {
            var5 = -param4 + 640;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 > param3) {
            var6 = var6 + param3;
            var8 = -param3;
            param3 = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param3 + var6 <= 480) {
            break L3;
          } else {
            var6 = 480 - param3;
            break L3;
          }
        }
        L4: {
          if (param2 > 86) {
            break L4;
          } else {
            field_b = 92;
            break L4;
          }
        }
        var9 = var8 * param1.field_s - -var7;
        var10 = param3 * tc.field_j + (param4 + -1);
        var11 = 0;
        L5: while (true) {
          if (var6 <= var11) {
            return;
          } else {
            var12 = 0;
            L6: while (true) {
              if (var12 >= var5) {
                var9 = var9 + (param1.field_s - var5);
                var10 = var10 + (tc.field_j - param1.field_s);
                var11++;
                continue L5;
              } else {
                if (0 != param1.field_z[var9]) {
                  if (param1.field_z[var9] != 16777215) {
                    var10++;
                    tc.field_b[var10] = param1.field_z[var9];
                    var9++;
                    var12++;
                    continue L6;
                  } else {
                    var10++;
                    tc.field_b[var10] = param0;
                    var9++;
                    var12++;
                    continue L6;
                  }
                } else {
                  var10++;
                  var9++;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    abstract int a(long param0, int param1);

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 <= 68) {
            Object var2 = null;
            ok discarded$0 = w.a((String[]) null, (byte) -85);
        }
    }

    final static ok a(String[] args, byte param1) {
        int var4 = 0;
        String var5 = null;
        String[] var6 = null;
        int var7 = HoldTheLine.field_D;
        ok var2 = new ok();
        String[] var3 = args;
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            var6 = ca.a((byte) -107, ' ', var5);
            var2.a(bg.a(0, var6), param1 ^ 67);
        }
        if (param1 != 55) {
            return null;
        }
        return var2;
    }

    abstract long a(int param0);

    abstract void b(byte param0);

    final int b(long param0, int param1) {
        long var4 = ((w) this).a(-123);
        if (!(0L >= var4)) {
            qe.a(var4, (byte) 45);
        }
        if (param1 <= 38) {
            return 20;
        }
        return ((w) this).a(param0, -35);
    }

    static {
    }
}
