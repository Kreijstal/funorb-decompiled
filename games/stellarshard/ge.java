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
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = stellarshard.field_B;
        if (param3 != -1) {
          if (-2 != param3) {
            L0: {
              var4 = param3 + param2;
              var5 = 0;
              if (param0 == -50) {
                break L0;
              } else {
                field_n = null;
                break L0;
              }
            }
            var6_int = param2;
            L1: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param2;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param1[var7];
                    if (var8 == null) {
                      StringBuilder discarded$2 = var6.append("null");
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append(var8);
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param1[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L1;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L1;
                }
              }
            }
          } else {
            var10 = param1[param2];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        } else {
          return "";
        }
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
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!lc.a(var4, 72)) {
            return qj.field_c;
        }
        if (param0 <= 10) {
            ((ge) this).field_k = null;
        }
        if (!param1.equals((Object) (Object) ((ge) this).field_k)) {
            var3 = sg.a((byte) -127, param1);
            if (var3 != null) {
                // ifnonnull L72
            } else {
                return vk.field_d;
            }
            ((ge) this).field_o = var3.field_f;
            ((ge) this).field_k = param1;
        }
        return !((ge) this).field_o ? qj.field_c : lg.field_c;
    }

    final String b(byte param0, String param1) {
        ml var4_ref = null;
        CharSequence var5 = (CharSequence) (Object) param1;
        String var3 = of.a(var5, (byte) 113);
        if (!(var3 == null)) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((ge) this).field_k)) {
            var4_ref = sg.a((byte) -124, param1);
            if (var4_ref == null) {
                return null;
            }
            if (null != var4_ref.field_e) {
                return null;
            }
            ((ge) this).field_k = param1;
            ((ge) this).field_o = var4_ref.field_f;
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
