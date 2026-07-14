/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends mh {
    static int field_Pb;
    long field_gc;
    String field_hc;
    boolean field_Qb;
    mh field_Tb;
    mh field_Rb;
    static String field_bc;
    long field_Xb;
    mh field_cc;
    boolean field_ec;
    int field_Wb;
    int field_kc;
    static String field_jc;
    mh field_Vb;
    int field_ac;
    int field_Zb;
    String field_Yb;
    boolean field_fc;
    static String field_Sb;
    int field_Ub;
    mh field_dc;
    int field_ic;

    public static void h(int param0) {
        int var1 = 102 % ((param0 - 48) / 43);
        field_jc = null;
        field_bc = null;
        field_Sb = null;
    }

    final void a(String param0, String param1, byte param2) {
        Object var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ((id) this).field_hc = param1;
        if (param2 != -121) {
          var5 = null;
          boolean discarded$6 = ((id) this).a((id) null, -125);
          ((id) this).field_Yb = param0;
          var6 = (CharSequence) (Object) ((id) this).field_hc;
          String discarded$7 = gb.a(var6, 116);
          return;
        } else {
          ((id) this).field_Yb = param0;
          var7 = (CharSequence) (Object) ((id) this).field_hc;
          String discarded$8 = gb.a(var7, 116);
          return;
        }
    }

    id(String param0, String param1, long param2) {
        super(0L, (mh) null);
        ((id) this).field_hc = param0;
        ((id) this).field_Yb = param1;
        ((id) this).field_gc = param2;
        CharSequence var6 = (CharSequence) (Object) ((id) this).field_hc;
        String discarded$0 = gb.a(var6, 124);
    }

    final static int[] a(fo param0, boolean param1) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        var2 = tf.field_g.length;
        if (lc.a(0, -107)) {
          var8 = new int[var2];
          var6 = var8;
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var8.length <= var4) {
              if (!param1) {
                ke.a(var8, (byte) 39, param0);
                return var3;
              } else {
                field_Sb = null;
                ke.a(var8, (byte) 39, param0);
                return var3;
              }
            } else {
              var8[var4] = var4;
              var4++;
              continue L0;
            }
          }
        } else {
          var2--;
          var9 = new int[var2];
          var7 = var9;
          var3 = var7;
          var4 = 0;
          L1: while (true) {
            if (var9.length <= var4) {
              if (!param1) {
                ke.a(var9, (byte) 39, param0);
                return var3;
              } else {
                field_Sb = null;
                ke.a(var9, (byte) 39, param0);
                return var3;
              }
            } else {
              var9[var4] = var4;
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean i(int param0) {
        if (param0 != 0) {
            return false;
        }
        return !((id) this).c(2) ? true : false;
    }

    final boolean a(id param0, int param1) {
        if (!((param0.field_fc ? 1 : 0) != (!((id) this).field_fc ? 1 : 0))) {
            return ((id) this).field_fc;
        }
        if (param1 != -755) {
            Object var4 = null;
            ((id) this).a((String) null, (String) null, (byte) -26);
            if (!((((id) this).field_Qb ? 1 : 0) != (!param0.field_Qb ? 1 : 0))) {
                return ((id) this).field_Qb;
            }
            return ((id) this).field_Xb < param0.field_Xb ? true : false;
        }
        if (!((((id) this).field_Qb ? 1 : 0) != (!param0.field_Qb ? 1 : 0))) {
            return ((id) this).field_Qb;
        }
        return ((id) this).field_Xb < param0.field_Xb ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bc = "Try changing the '<%0>' setting.";
        field_Pb = 0;
        field_jc = "You can spectate this game";
        field_Sb = "Concluded";
    }
}
