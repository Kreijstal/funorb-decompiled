/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ema extends sna {
    int field_xb;
    String field_Hb;
    int field_Mb;
    sna field_Fb;
    int field_Kb;
    int field_Jb;
    boolean field_Ob;
    String field_Nb;
    sna field_Bb;
    int field_yb;
    sna field_Db;
    boolean field_wb;
    static String field_Lb;
    sna field_Ib;
    sna field_vb;
    int field_Gb;
    long field_Eb;
    boolean field_zb;
    long field_Cb;
    static String field_Ab;

    final boolean a(int param0, ema param1) {
        if (!((!param1.field_Ob ? 1 : 0) == (!((ema) this).field_Ob ? 1 : 0))) {
            return ((ema) this).field_Ob;
        }
        if (param0 != 0) {
            ((ema) this).field_Bb = null;
            if (!((!param1.field_wb ? 1 : 0) != (((ema) this).field_wb ? 1 : 0))) {
                return ((ema) this).field_wb;
            }
            return (((ema) this).field_Cb ^ -1L) > (param1.field_Cb ^ -1L) ? true : false;
        }
        if (!((!param1.field_wb ? 1 : 0) != (((ema) this).field_wb ? 1 : 0))) {
            return ((ema) this).field_wb;
        }
        return (((ema) this).field_Cb ^ -1L) > (param1.field_Cb ^ -1L) ? true : false;
    }

    final boolean f(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 21) {
          L0: {
            ((ema) this).field_Eb = 8L;
            if (((ema) this).a(0)) {
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
            if (((ema) this).a(0)) {
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

    public static void f(int param0) {
        if (param0 != 0) {
            ema.f(56);
            field_Ab = null;
            field_Lb = null;
            return;
        }
        field_Ab = null;
        field_Lb = null;
    }

    ema(String param0, String param1, long param2) {
        super(0L, (sna) null);
        ((ema) this).field_Eb = param2;
        ((ema) this).field_Hb = param0;
        ((ema) this).field_Nb = param1;
        CharSequence var6 = (CharSequence) (Object) ((ema) this).field_Hb;
        String discarded$0 = fq.a(0, var6);
    }

    final void a(String param0, int param1, String param2) {
        ((ema) this).field_Nb = param2;
        ((ema) this).field_Hb = param0;
        CharSequence var5 = (CharSequence) (Object) ((ema) this).field_Hb;
        String discarded$0 = fq.a(param1 + param1, var5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "members-only content";
        field_Ab = "Loading...";
    }
}
