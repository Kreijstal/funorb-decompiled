/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends ht {
    static String field_l;
    private int field_m;
    static ri[] field_n;
    private int field_k;
    static int[] field_o;

    public static void d(int param0) {
        field_o = null;
        field_n = null;
        if (param0 != 1) {
            return;
        }
        field_l = null;
    }

    public final void a(int param0) {
        int var2 = 26 / ((param0 - 44) / 58);
        jaggl.OpenGL.glFramebufferTexture2DEXT(((hp) this).field_k, ((hp) this).field_m, 3553, 0, 0);
        ((hp) this).field_k = -1;
        ((hp) this).field_m = -1;
    }

    hp(fr param0, int param1, int param2, boolean param3, byte[][] param4, int param5) {
        super(param0, 34067, param1, param2 * param2 * 6, param3);
        int var7 = 0;
        ((hp) this).field_k = -1;
        ((hp) this).field_m = -1;
        ((hp) this).field_d.a(112, (ht) this);
        for (var7 = 0; 6 > var7; var7++) {
            jaggl.OpenGL.glTexImage2Dub(34069 - -var7, 0, ((hp) this).field_a, param2, param2, 0, param5, 5121, param4[var7], 0);
        }
        ((hp) this).a(true, 0);
    }

    final static boolean a(String param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var2 = param0.charAt(0);
        var3 = 1;
        if (!param1) {
          field_o = null;
          L0: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) == var2) {
                var3++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          L1: while (true) {
            if (param0.length() > var3) {
              if (param0.charAt(var3) == var2) {
                var3++;
                continue L1;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = null;
        field_o = new int[8192];
    }
}
