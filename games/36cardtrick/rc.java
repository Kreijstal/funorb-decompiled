/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends qb {
    boolean field_j;
    int[] field_p;
    int field_h;
    static int field_o;
    static de field_g;
    static String field_n;
    static kc field_i;
    static ml field_l;
    static kc[] field_k;
    static boolean field_m;

    public static void b(byte param0) {
        field_i = null;
        field_k = null;
        field_l = null;
        if (param0 != 112) {
          field_o = 1;
          field_g = null;
          field_n = null;
          return;
        } else {
          field_g = null;
          field_n = null;
          return;
        }
    }

    final static void a(byte param0, int param1) {
        fd.a(ca.field_c[param1], jd.field_c[param1], false);
        if (param0 != 111) {
            field_k = (kc[]) null;
        }
    }

    rc() {
        this.field_j = false;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                rc.b((byte) -48);
                break L1;
              }
            }
            var3 = (CharSequence) ((Object) param1);
            stackIn_3_0 = aa.field_fb.equals(ff.a((byte) 116, var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("rc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_g = new de(10, 2, 2, 0);
        field_n = "Select pairs of tiles to reveal them. If they match, they are removed from the<nbsp>game.<br><br>Remember the tiles you've revealed and track them as they move to clear the<nbsp>board.<br><br>Don't waste time, but think before you click, because the number of mistakes you can make is<nbsp>limited.";
        field_i = new kc(270, 70);
        field_l = new ml();
    }
}
