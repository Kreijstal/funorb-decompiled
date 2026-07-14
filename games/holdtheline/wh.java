/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends vd {
    private int field_g;
    private int field_h;
    private int field_f;

    final static void a(byte param0) {
        if (!(ci.field_o)) {
            throw new IllegalStateException();
        }
        int var1 = 102 / ((24 - param0) / 33);
        if (null != sb.field_c) {
            sb.field_c.h((byte) -93);
        }
        String var2 = ch.a(false);
        lh.field_a = new vg(var2, (String) null, true, false, false);
        ka.field_b.a((n) (Object) sm.field_c, false);
        sm.field_c.a((n) (Object) lh.field_a, (byte) 13);
        sm.field_c.b(false);
    }

    final void a(float param0, int[] param1, int param2, int[] param3, byte param4) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var12 = HoldTheLine.field_D;
        var13 = new int[param1.length + param3.length];
        var17 = var13;
        var16 = var17;
        var15 = var16;
        var14 = var15;
        var6 = var14;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param3.length) {
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1.length / 2) {
                L2: {
                  if ((((wh) this).field_h ^ -1) != -257) {
                    dl.a(var17, (byte) -127, ((wh) this).field_h, ((wh) this).field_g);
                    break L2;
                  } else {
                    gf.a(var17, ((wh) this).field_g);
                    break L2;
                  }
                }
                L3: {
                  if (param4 == 49) {
                    break L3;
                  } else {
                    ((wh) this).field_f = -37;
                    break L3;
                  }
                }
                var8 = var6[-2 + var17.length];
                var9 = var6[-1 + var17.length];
                var7 = 0;
                L4: while (true) {
                  if (var7 >= var17.length) {
                    return;
                  } else {
                    var10 = var17[var7];
                    var11 = var6[var7 + 1];
                    tc.d(var8, var9, var10, var11, ((wh) this).field_f);
                    var8 = var10;
                    var9 = var11;
                    var7 += 2;
                    continue L4;
                  }
                }
              } else {
                var6[param3.length - -(var7 * 2)] = param1[-(var7 * 2) + (-2 + param1.length)];
                var6[2 * var7 + (param3.length + 1)] = param1[-1 + (param1.length - 2 * var7)];
                var7++;
                continue L1;
              }
            }
          } else {
            var13[var7] = param3[var7];
            var7++;
            continue L0;
          }
        }
    }

    wh(int param0, int param1, int param2) {
        ((wh) this).field_h = param2;
        ((wh) this).field_f = param1;
        ((wh) this).field_g = param0;
    }

    static {
    }
}
