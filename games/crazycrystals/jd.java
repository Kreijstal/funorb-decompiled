/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends og implements vd {
    static java.awt.Canvas field_D;
    private String field_M;
    static dl field_A;
    private int field_F;
    private pc[] field_L;
    static int field_I;
    private na field_B;
    private int[] field_E;
    static boolean field_H;
    static String field_J;
    static boolean field_z;
    static int[] field_K;
    static String field_G;
    private vc field_C;

    public static void e(byte param0) {
        if (param0 < 20) {
          si discarded$2 = jd.f((byte) 41);
          field_G = null;
          field_A = null;
          field_J = null;
          field_K = null;
          field_D = null;
          return;
        } else {
          field_G = null;
          field_A = null;
          field_J = null;
          field_K = null;
          field_D = null;
          return;
        }
    }

    final static si f(byte param0) {
        if (lc.field_c != tl.field_e) {
          if (param0 == 93) {
            if (lc.field_c != io.field_P) {
              return null;
            } else {
              lc.field_c = tl.field_e;
              return qc.field_i;
            }
          } else {
            jd.e((byte) -51);
            if (lc.field_c != io.field_P) {
              return null;
            } else {
              lc.field_c = tl.field_e;
              return qc.field_i;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = CrazyCrystals.field_B;
        var6 = -104 % ((83 - param0) / 36);
        var7 = 0;
        L0: while (true) {
          if (((jd) this).field_F > var7) {
            if (((jd) this).field_L[var7] != param4) {
              var7++;
              var7++;
              continue L0;
            } else {
              var8 = ((jd) this).field_E[var7];
              if (0 != (var8 ^ -1)) {
                rc.a(-25537, ((jd) this).field_E[var7]);
                return;
              } else {
                ((jd) this).field_B.i((byte) -62);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    jd(na param0, vc param1, String param2) {
        super(0, 0, 288, 0, (wo) null);
        ((jd) this).field_F = 0;
        ((jd) this).field_B = param0;
        ((jd) this).field_C = param1;
        ((jd) this).field_M = param2;
        int var4 = null == ((jd) this).field_M ? 0 : ((jd) this).field_C.b(((jd) this).field_M, 260, ((jd) this).field_C.field_o);
        ((jd) this).a(22 + var4, 0, 0, 288, (byte) -52);
    }

    final pc a(String param0, bi param1, int param2) {
        pc var4 = null;
        int var5 = 0;
        Object var6 = null;
        var4 = new pc(param0, param1);
        var4.field_i = (wo) (Object) new ve();
        var5 = -2 + ((jd) this).field_f;
        ((jd) this).a(34 + ((jd) this).field_f, 0, 0, ((jd) this).field_g, (byte) -52);
        var4.a(30, 7, var5, ((jd) this).field_g + -14, (byte) -52);
        ((jd) this).b((qm) (Object) var4, 35);
        if (param2 < 4) {
          var6 = null;
          ((jd) this).a((String) null, (byte) 44, 127);
          return var4;
        } else {
          return var4;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -92, param2, param3);
        int discarded$31 = ((jd) this).field_C.a(((jd) this).field_M, 14 + (((jd) this).field_r + param2), 10 + (param0 + ((jd) this).field_j), -28 + ((jd) this).field_g, ((jd) this).field_f, 16777215, -1, 0, 0, ((jd) this).field_C.field_o);
        if (param1 > -12) {
            Object var6 = null;
            ((jd) this).a((String) null, (byte) 125, 44);
        }
    }

    private final void a(int param0, int param1) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (!(param1 > ((jd) this).field_F)) {
            return;
        }
        pc[] var7 = new pc[param1];
        pc[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; ((jd) this).field_F > var5; var5++) {
            var7[var5] = ((jd) this).field_L[var5];
            var4[var5] = ((jd) this).field_E[var5];
        }
        if (param0 < 92) {
            ((jd) this).field_E = null;
        } else {
            ((jd) this).field_F = param1;
            ((jd) this).field_L = var3;
            ((jd) this).field_E = var4;
            return;
        }
        ((jd) this).field_F = param1;
        ((jd) this).field_L = var3;
        ((jd) this).field_E = var4;
    }

    final void a(String param0, byte param1, int param2) {
        int var4 = 0;
        var4 = ((jd) this).field_F;
        if (param1 != -124) {
          field_D = null;
          this.a(119, var4 + 1);
          ((jd) this).field_L[var4] = ((jd) this).a(param0, (bi) this, param1 + 167);
          ((jd) this).field_E[var4] = param2;
          return;
        } else {
          this.a(119, var4 + 1);
          ((jd) this).field_L[var4] = ((jd) this).a(param0, (bi) this, param1 + 167);
          ((jd) this).field_E[var4] = param2;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = false;
        field_J = "Restart Level";
    }
}
