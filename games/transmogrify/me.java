/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class me extends ca implements fb {
    private rg field_h;
    static int[] field_i;

    abstract String b(int param0, String param1);

    public final void a(int param0, rg param1) {
        if (param0 != 1330) {
            field_i = null;
        }
    }

    public final void a(rg param0, int param1) {
        Object var4 = null;
        if (param1 > -55) {
          var4 = null;
          me.a(120, 109, 17, (String) null, 22, -46, 96, -16, (fe) null);
          ((me) this).a(true);
          return;
        } else {
          ((me) this).a(true);
          return;
        }
    }

    abstract rc a(int param0, String param1);

    final static void a(boolean param0, int param1, int param2) {
        wd.field_j = param1;
        if (param0) {
            me.a(false, -47, 24);
            lb.field_j = param2;
            return;
        }
        lb.field_j = param2;
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 <= 118) {
            me.a((byte) 112);
        }
    }

    final String f(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((me) this).b(param0 + -1, ((me) this).field_h.field_k);
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param0 = hd.a('_', (byte) -81, "", param0);
        var3 = vl.b(-1, param0);
        if (param1 >= 85) {
          if ((param2.indexOf(param0) ^ -1) == 0) {
            if (-1 != param2.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_i = null;
          if ((param2.indexOf(param0) ^ -1) != 0) {
            return true;
          } else {
            L0: {
              if (-1 == param2.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    me(rg param0) {
        ((me) this).field_h = param0;
    }

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -16000) {
          if (((me) this).field_h.field_k != null) {
            if (((me) this).field_h.field_k.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6, int param7, fe param8) {
        Object var10 = null;
        ne.field_b = param6;
        c.field_b = param0;
        nf.field_i = param3;
        qi.field_a = param8;
        if (param2 <= 37) {
          var10 = null;
          me.a(44, 91, 102, (String) null, 8, 17, 66, 2, (fe) null);
          of.field_c = param1;
          tl.field_c = param4;
          dk.field_h = param5;
          uh.field_f = param7;
          oh.field_h = (uh) (Object) new tj();
          fd.field_d = new cd(param8);
          we.field_j = new dk(oh.field_h, fd.field_d);
          return;
        } else {
          of.field_c = param1;
          tl.field_c = param4;
          dk.field_h = param5;
          uh.field_f = param7;
          oh.field_h = (uh) (Object) new tj();
          fd.field_d = new cd(param8);
          we.field_j = new dk(oh.field_h, fd.field_d);
          return;
        }
    }

    final rc e(int param0) {
        Object var3 = null;
        if (param0 != 20456) {
          var3 = null;
          ((me) this).a(121, (rg) null);
          return ((me) this).a(95, ((me) this).field_h.field_k);
        } else {
          return ((me) this).a(95, ((me) this).field_h.field_k);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
    }
}
