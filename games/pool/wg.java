/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends vh {
    private vh field_Qb;
    static ko field_Lb;
    private vh field_Pb;
    static int[] field_Nb;
    static String[] field_Mb;
    static String field_Rb;
    static byte[][] field_Sb;
    static String field_Ob;

    public static void f(int param0) {
        if (param0 != -1) {
            wg.f(82);
            field_Nb = null;
            field_Mb = null;
            field_Ob = null;
            field_Rb = null;
            field_Sb = null;
            field_Lb = null;
            return;
        }
        field_Nb = null;
        field_Mb = null;
        field_Ob = null;
        field_Rb = null;
        field_Sb = null;
        field_Lb = null;
    }

    private wg(long param0, vh param1, vh param2, String param3) {
        super(param0, (vh) null);
        ((wg) this).field_Pb = new vh(0L, param1);
        ((wg) this).field_Qb = new vh(0L, param2);
        ((wg) this).field_Qb.field_nb = param3;
        ((wg) this).a(-93, ((wg) this).field_Pb);
        ((wg) this).a(-127, ((wg) this).field_Qb);
        ((wg) this).d((byte) -127);
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        ((wg) this).field_Pb.b(0, 2147483647, 0, ((wg) this).field_Pb.b(true), ((wg) this).field_Db);
        if (param0 < 32) {
          field_Nb = null;
          var3 = ((wg) this).field_Pb.field_gb - -param1;
          ((wg) this).field_Qb.b(0, 2147483647, var3, -var3 + ((wg) this).field_gb, ((wg) this).field_Db);
          return;
        } else {
          var3 = ((wg) this).field_Pb.field_gb - -param1;
          ((wg) this).field_Qb.b(0, 2147483647, var3, -var3 + ((wg) this).field_gb, ((wg) this).field_Db);
          return;
        }
    }

    wg(long param0, dd param1, dd param2, int param3, vh param4, String param5) {
        this(param0, (vh) null, param4, param5);
        ((wg) this).field_Pb.field_yb = param1;
        ((wg) this).field_Pb.field_hb = param2;
        ((wg) this).field_Pb.field_cb = param3;
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = o.a('_', "", param1, param0 ^ 23139);
        if (param0 == 23138) {
          var3 = qa.a(param1, 0);
          if (-1 == param2.indexOf(param1)) {
            if (param2.indexOf(var3) != -1) {
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
          wg.f(-5);
          var3 = qa.a(param1, 0);
          if (-1 != param2.indexOf(param1)) {
            return true;
          } else {
            L0: {
              if (param2.indexOf(var3) == -1) {
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

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        ((wg) this).b(param0, 2147483647, param1, param4, param2);
        this.a((byte) 96, param5);
        if (param3) {
            wg.f(-5);
        }
    }

    wg(long param0, wg param1, String param2) {
        this(param0, param1.field_Pb, param1.field_Qb, param2);
    }

    final int b(int param0, int param1) {
        if (param1 != 2154) {
          int discarded$2 = ((wg) this).b(-72, 60);
          return ((wg) this).field_Pb.b(true) - (-param0 - ((wg) this).field_Qb.b(true));
        } else {
          return ((wg) this).field_Pb.b(true) - (-param0 - ((wg) this).field_Qb.b(true));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new ko();
        field_Ob = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_Rb = "Add friend";
    }
}
