/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends ch implements vo {
    private jl field_O;
    static ak field_J;
    private qm[] field_S;
    private vk field_M;
    private String field_N;
    private int[] field_I;
    static jl field_Q;
    static String field_R;
    private int field_P;
    static ak field_L;

    public static void a(int param0) {
        field_R = null;
        if (param0 != 0) {
            field_J = null;
        }
        field_Q = null;
        field_L = null;
        field_J = null;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) -24);
        int discarded$0 = ((vl) this).field_O.a(((vl) this).field_N, 14 + (((vl) this).field_z + param2), ((vl) this).field_p + param0 - -10, ((vl) this).field_E + -28, ((vl) this).field_C, 16777215, -1, 0, 0, ((vl) this).field_O.field_w);
        int var5 = -57 / ((param3 - 70) / 49);
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (!(param1 > ((vl) this).field_P)) {
            return;
        }
        qm[] var7 = new qm[param1];
        qm[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < ((vl) this).field_P; var5++) {
            var7[var5] = ((vl) this).field_S[var5];
            var4[var5] = ((vl) this).field_I[var5];
        }
        ((vl) this).field_I = var4;
        ((vl) this).field_S = var3;
        ((vl) this).field_P = param1;
        if (param0 > -57) {
            boolean discarded$0 = vl.b(94, 86, 20);
        }
    }

    vl(vk param0, jl param1, String param2) {
        super(0, 0, 288, 0, (eb) null);
        ((vl) this).field_P = 0;
        ((vl) this).field_M = param0;
        ((vl) this).field_O = param1;
        ((vl) this).field_N = param2;
        int var4 = ((vl) this).field_N == null ? 0 : ((vl) this).field_O.a(((vl) this).field_N, 260, ((vl) this).field_O.field_w);
        ((vl) this).a(288, (byte) 55, 0, 0, 22 - -var4);
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Pixelate.field_H ? 1 : 0;
        if (param2 != 11) {
            field_R = null;
        }
        for (var6 = 0; var6 < ((vl) this).field_P; var6++) {
            if (!(((vl) this).field_S[var6] != param0)) {
                var7 = ((vl) this).field_I[var6];
                if (var7 == -1) {
                    ((vl) this).field_M.p(-121);
                    break;
                }
                te.a(((vl) this).field_I[var6], -2671);
                break;
            }
        }
    }

    final void a(int param0, int param1, String param2) {
        int var4 = ((vl) this).field_P;
        this.a(param1 ^ 114, var4 - param1);
        ((vl) this).field_S[var4] = ((vl) this).a(1707, (fn) this, param2);
        ((vl) this).field_I[var4] = param0;
    }

    final qm a(int param0, fn param1, String param2) {
        qm var4 = new qm(param2, param1);
        var4.field_y = (eb) (Object) new ad();
        if (param0 != 1707) {
            ((vl) this).field_P = 66;
        }
        int var5 = -2 + ((vl) this).field_C;
        ((vl) this).a(((vl) this).field_E, (byte) 63, 0, 0, ((vl) this).field_C + 34);
        var4.a(-14 + ((vl) this).field_E, (byte) 81, var5, 7, 30);
        ((vl) this).b((ng) (Object) var4, 80);
        return var4;
    }

    final static boolean b(int param0, int param1, int param2) {
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        if ((ke.field_a ^ -1) != -14) {
          if (param0 == ke.field_a) {
            bo.field_h.l(17872);
            return true;
          } else {
            L0: {
              L1: {
                if (null == bo.field_h) {
                  break L1;
                } else {
                  if (!bo.field_h.a(param2, 0, param1)) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L0;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
            return stackIn_9_0 != 0;
          }
        } else {
          po.a(true);
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "<%0> is not on your friend list.";
    }
}
