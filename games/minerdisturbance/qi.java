/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends cb {
    private boolean field_k;
    static int field_j;
    private String field_i;

    final static boolean f(int param0) {
        Object var2 = null;
        if (param0 == -9202) {
          if (!kj.a(false)) {
            if (si.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = null;
          boolean discarded$4 = qi.a((String) null, -46, (ik) null, true, -5, (String) null, (String) null);
          if (!kj.a(false)) {
            if (si.field_a) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(String param0, int param1, ik param2, boolean param3, int param4, String param5, String param6) {
        if (!(mc.field_t == ic.field_l)) {
            return false;
        }
        if (param4 > -81) {
            return false;
        }
        uk var8 = new uk(mb.field_b, param2);
        mb.field_b.b(1, (fe) (Object) var8);
        if (cm.a(true)) {
            var8.t(23101);
        } else {
            qf.field_r = param5;
            km.field_b = param6;
            wm.field_d = param0;
            ic.field_l = ci.field_e;
            g.field_o = param3 ? true : false;
            vk.field_g = null;
            me.field_j = param1;
            return true;
        }
        return true;
    }

    qi(ui param0) {
        super(param0);
        ((qi) this).field_k = false;
    }

    final ag a(String param0, int param1) {
        ed var3 = null;
        CharSequence var4 = null;
        ag stackIn_13_0 = null;
        ag stackOut_12_0 = null;
        ag stackOut_11_0 = null;
        var4 = (CharSequence) (Object) param0;
        if (ra.a((byte) -38, var4)) {
          L0: {
            if (!param0.equals((Object) (Object) ((qi) this).field_i)) {
              var3 = rf.a((byte) -75, param0);
              if (var3 != null) {
                if (var3.field_h == null) {
                  ((qi) this).field_i = param0;
                  ((qi) this).field_k = var3.field_c;
                  break L0;
                } else {
                  return bm.field_o;
                }
              } else {
                return bm.field_o;
              }
            } else {
              break L0;
            }
          }
          if (param1 != 5) {
            return null;
          } else {
            L1: {
              if (((qi) this).field_k) {
                stackOut_12_0 = sc.field_a;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              } else {
                stackOut_11_0 = fg.field_d;
                stackIn_13_0 = stackOut_11_0;
                break L1;
              }
            }
            return stackIn_13_0;
          }
        } else {
          return fg.field_d;
        }
    }

    final void b(byte param0) {
        if (param0 >= -30) {
            ((qi) this).field_k = false;
            ((qi) this).field_i = null;
            return;
        }
        ((qi) this).field_i = null;
    }

    final String a(byte param0, String param1) {
        ed var5 = null;
        CharSequence var6 = (CharSequence) (Object) param1;
        String var3 = qa.a((byte) 31, var6);
        int var4 = 98 / ((49 - param0) / 56);
        if (var3 != null) {
            return var3;
        }
        if (!param1.equals((Object) (Object) ((qi) this).field_i)) {
            var5 = rf.a((byte) -75, param1);
            if (var5 == null) {
                return null;
            }
            if (var5.field_h != null) {
                return null;
            }
            ((qi) this).field_k = var5.field_c;
            ((qi) this).field_i = param1;
        }
        if (!(((qi) this).field_k)) {
            return hm.field_L;
        }
        return lg.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
