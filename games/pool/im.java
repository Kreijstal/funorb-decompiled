/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im extends vh {
    String field_dc;
    int field_Rb;
    static tk field_Qb;
    boolean field_Pb;
    static qp field_Ub;
    static int field_fc;
    long field_Sb;
    int field_Nb;
    boolean field_Yb;
    String field_jc;
    static int field_Wb;
    int field_Xb;
    static boolean[] field_cc;
    static dd field_Lb;
    int field_hc;
    long field_Mb;
    static String field_Ob;
    vh field_ac;
    int field_gc;
    static String[] field_ic;
    vh field_Zb;
    static dd field_Vb;
    int field_bc;
    boolean field_mc;
    vh field_lc;
    vh field_kc;
    vh field_Tb;
    static int field_ec;

    im(String param0, String param1, long param2) {
        super(0L, (vh) null);
        ((im) this).field_jc = param1;
        ((im) this).field_dc = param0;
        ((im) this).field_Sb = param2;
        CharSequence var6 = (CharSequence) (Object) ((im) this).field_dc;
        String discarded$0 = hq.a(103, var6);
    }

    final static dd[] a(int param0, int param1, int param2, di param3) {
        if (!vj.a(param0, param3, param1, (byte) 121)) {
            return null;
        }
        if (param2 != 0) {
            return null;
        }
        return ok.l((byte) 65);
    }

    final static vh f(int param0) {
        if (param0 != 0) {
            im.f((byte) 20);
            return aj.field_Mb.field_Mb;
        }
        return aj.field_Mb.field_Mb;
    }

    final void a(String param0, byte param1, String param2) {
        Object var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ((im) this).field_dc = param0;
        if (param1 != 1) {
          var5 = null;
          boolean discarded$6 = ((im) this).a((im) null, (byte) -8);
          ((im) this).field_jc = param2;
          var6 = (CharSequence) (Object) ((im) this).field_dc;
          String discarded$7 = hq.a(param1 + 100, var6);
          return;
        } else {
          ((im) this).field_jc = param2;
          var7 = (CharSequence) (Object) ((im) this).field_dc;
          String discarded$8 = hq.a(param1 + 100, var7);
          return;
        }
    }

    final boolean a(im param0, byte param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0.field_Yb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 == (((im) this).field_Yb ? 1 : 0)) {
          return ((im) this).field_Yb;
        } else {
          var3 = -1 / ((4 - param1) / 38);
          if (param0.field_mc != ((im) this).field_mc) {
            return ((im) this).field_mc;
          } else {
            L1: {
              if ((((im) this).field_Mb ^ -1L) <= (param0.field_Mb ^ -1L)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    public static void f(byte param0) {
        field_Vb = null;
        field_Ub = null;
        field_cc = null;
        field_Lb = null;
        field_ic = null;
        field_Qb = null;
        field_Ob = null;
        if (param0 != -48) {
            Object var2 = null;
            int discarded$0 = im.a((ge) null, (byte) 100, (String) null);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final boolean c(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((im) this).field_bc = -108;
            if (((im) this).d(59)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((im) this).d(59)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(ge param0, byte param1, String param2) {
        int var3 = 0;
        byte[] var4 = null;
        CharSequence var5 = null;
        if (param1 != 75) {
          return -12;
        } else {
          var3 = param0.field_v;
          var5 = (CharSequence) (Object) param2;
          var4 = hi.a(-66, var5);
          param0.b((byte) -49, var4.length);
          param0.field_v = param0.field_v + Pool.field_J.a(0, var4.length, param0.field_t, param0.field_v, var4, true);
          return -var3 + param0.field_v;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "You can ask to join this game";
        field_ic = new String[]{"Eight-ball", "Nine-ball", "Killer", "Free play"};
    }
}
