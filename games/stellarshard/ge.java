/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends lk {
    private boolean field_o;
    static th field_m;
    static String field_l;
    static int[] field_n;
    private String field_k;

    ge(ae param0) {
        super(param0);
        ((ge) this).field_o = false;
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) sf.field_c);
        if (param1 > -16) {
            return;
        }
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) sf.field_c);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) sf.field_c);
    }

    final static String a(byte param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var10 = null;
        CharSequence var4_ref_CharSequence = null;
        int var6_int = 0;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = stellarshard.field_B;
        if ((param3 ^ -1) == -1) {
            return "";
        }
        if (-2 == (param3 ^ -1)) {
            var10 = param1[param2];
            var4_ref_CharSequence = var10;
            if (!(var4_ref_CharSequence != null)) {
                return "null";
            }
            return ((Object) (Object) var10).toString();
        }
        int var4 = param3 + param2;
        int var5 = 0;
        if (param0 != -50) {
            field_n = null;
        }
        for (var6_int = param2; (var6_int ^ -1) > (var4 ^ -1); var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence != null) {
                var5 = var5 + var7_ref_CharSequence.length();
            } else {
                var5 += 4;
            }
        }
        StringBuilder var6 = new StringBuilder(var5);
        for (var7 = param2; (var7 ^ -1) > (var4 ^ -1); var7++) {
            var8 = param1[var7];
            if (var8 != null) {
                StringBuilder discarded$1 = var6.append(var8);
            } else {
                StringBuilder discarded$2 = var6.append("null");
            }
        }
        return var6.toString();
    }

    public static void b(boolean param0) {
        field_m = null;
        field_l = null;
        field_n = null;
        if (param0) {
            field_m = null;
        }
    }

    final cg a(byte param0, String param1) {
        ml var3 = null;
        CharSequence var4 = null;
        cg stackIn_13_0 = null;
        cg stackOut_12_0 = null;
        cg stackOut_11_0 = null;
        var4 = (CharSequence) (Object) param1;
        if (lc.a(var4, 72)) {
          L0: {
            if (param0 > 10) {
              break L0;
            } else {
              ((ge) this).field_k = null;
              break L0;
            }
          }
          L1: {
            if (param1.equals((Object) (Object) ((ge) this).field_k)) {
              break L1;
            } else {
              L2: {
                var3 = sg.a((byte) -127, param1);
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_e != null) {
                    break L2;
                  } else {
                    ((ge) this).field_o = var3.field_f;
                    ((ge) this).field_k = param1;
                    break L1;
                  }
                }
              }
              return vk.field_d;
            }
          }
          L3: {
            if (((ge) this).field_o) {
              stackOut_12_0 = lg.field_c;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = qj.field_c;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          return stackIn_13_0;
        } else {
          return qj.field_c;
        }
    }

    final String b(byte param0, String param1) {
        ml var4_ref_ml = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = of.a(var5, (byte) 113);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((ge) this).field_k)) {
            var4_ref_ml = sg.a((byte) -124, param1);
            if (var4_ref_ml == null) {
                return null;
            }
            if (null != var4_ref_ml.field_e) {
                return null;
            }
            ((ge) this).field_k = param1;
            ((ge) this).field_o = var4_ref_ml.field_f;
        }
        if (!(((ge) this).field_o)) {
            return jb.field_p;
        }
        int var4 = -120 / ((20 - param0) / 40);
        return rh.field_c;
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        ((ge) this).field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new th();
        field_l = "This password is part of your Player Name, and would be easy to guess";
    }
}
