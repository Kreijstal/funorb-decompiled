/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends mh {
    static String field_Pb;
    private mh field_Qb;
    static oh field_Rb;
    static String field_Tb;
    static jp field_Ub;
    static boolean field_Sb;
    static dh field_Wb;
    private mh field_Vb;

    final int a(byte param0, int param1) {
        if (param0 != 11) {
            field_Tb = null;
        }
        return ((ni) this).field_Vb.g(param0 + 90) + (param1 - -((ni) this).field_Qb.g(91));
    }

    final static int a(int param0, CharSequence param1) {
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        int var2 = param1.length();
        int var3 = 0;
        if (param0 > -103) {
            field_Ub = null;
        }
        for (var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << -56117467) - var3 - -na.a(-8250, param1.charAt(var4));
        }
        return var3;
    }

    final static boolean b(boolean param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0;
        int stackOut_8_0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_Pb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (90 >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (122 < param1) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    ni(long param0, jp param1, jp param2, int param3, mh param4, String param5) {
        this(param0, (mh) null, param4, param5);
        ((ni) this).field_Vb.field_K = param1;
        ((ni) this).field_Vb.field_Q = param3;
        ((ni) this).field_Vb.field_wb = param2;
    }

    private ni(long param0, mh param1, mh param2, String param3) {
        super(param0, (mh) null);
        ((ni) this).field_Vb = new mh(0L, param1);
        ((ni) this).field_Qb = new mh(0L, param2);
        ((ni) this).field_Qb.field_Mb = param3;
        ((ni) this).a(((ni) this).field_Vb, 0);
        ((ni) this).a(((ni) this).field_Qb, 0);
        ((ni) this).c(true);
    }

    final static ra h(int param0) {
        if (param0 < 91) {
            field_Pb = null;
        }
        return ob.field_J;
    }

    public static void d(boolean param0) {
        field_Ub = null;
        field_Pb = null;
        field_Tb = null;
        field_Wb = null;
        field_Rb = null;
        if (!param0) {
            field_Rb = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5) {
        ((ni) this).a(param2, param3, param5, param0, (byte) 64);
        this.b(-32434, param1);
        if (!param4) {
            ni.d(false);
        }
    }

    ni(long param0, ni param1, String param2) {
        this(param0, param1.field_Vb, param1.field_Qb, param2);
    }

    private final void b(int param0, int param1) {
        ((ni) this).field_Vb.a(((ni) this).field_cb, 0, 0, ((ni) this).field_Vb.g(118), (byte) 64);
        int var3 = ((ni) this).field_Vb.field_Ib - -param1;
        if (param0 != -32434) {
            field_Ub = null;
        }
        ((ni) this).field_Qb.a(((ni) this).field_cb, 0, var3, ((ni) this).field_Ib + -var3, (byte) 64);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "Don't mind";
        field_Tb = "This password contains your email address, and would be easy to guess";
    }
}
