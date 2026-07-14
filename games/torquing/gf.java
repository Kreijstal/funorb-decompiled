/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends eq implements wm {
    private tk field_i;
    static qd field_j;
    static int field_h;
    static int field_k;
    static int field_g;
    static long field_f;

    public final void a(tk param0, byte param1) {
        if (param1 > -122) {
            Object var4 = null;
            ((gf) this).a((tk) null, (byte) 107);
        }
    }

    final String b(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((gf) this).a((byte) -121, ((gf) this).field_i.field_m);
    }

    final cd c(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((gf) this).a(111, ((gf) this).field_i.field_m);
    }

    gf(tk param0) {
        ((gf) this).field_i = param0;
    }

    public final void a(int param0, tk param1) {
        ((gf) this).a(true);
        if (param0 < 3) {
            Object var4 = null;
            ((gf) this).a((tk) null, (byte) 9);
        }
    }

    abstract String a(byte param0, String param1);

    public static void d(int param0) {
        field_j = null;
        if (param0 != 0) {
            field_j = null;
        }
    }

    abstract cd a(int param0, String param1);

    public final boolean b(boolean param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          if (null != ((gf) this).field_i.field_m) {
            if (0 == ((gf) this).field_i.field_m.length()) {
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
          field_f = -87L;
          if (null == ((gf) this).field_i.field_m) {
            return true;
          } else {
            L0: {
              if (0 != ((gf) this).field_i.field_m.length()) {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new qd();
    }
}
