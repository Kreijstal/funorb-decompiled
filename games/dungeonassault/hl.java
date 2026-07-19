/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hl {
    static cn field_h;
    static lh field_a;
    static gd field_b;
    static volatile int field_g;
    static ad field_c;
    static int[] field_e;
    static String field_d;
    static int field_f;
    static tl field_i;
    static String field_k;
    static String field_j;

    final static void a(int param0, int param1, al param2) {
        wj var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = ac.field_B;
            var3.d((byte) -118, param0);
            var3.a(6, 5);
            var3.a(6, 0);
            var3.i(param2.field_k, -125);
            var3.a(6, param2.field_l);
            var3.a(6, param2.field_p);
            if (param1 < -122) {
              break L0;
            } else {
              field_d = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("hl.I(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static int a(int param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -119) {
                break L1;
              } else {
                hl.a(true);
                break L1;
              }
            }
            stackOut_2_0 = mm.a(param1, true, param2, 3703);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("hl.K(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        al var2 = null;
        field_b = null;
        field_d = null;
        field_a = null;
        field_i = null;
        field_c = null;
        field_e = null;
        field_k = null;
        if (param0 <= 49) {
          var2 = (al) null;
          hl.a(110, 75, (al) null);
          field_j = null;
          field_h = null;
          return;
        } else {
          field_j = null;
          field_h = null;
          return;
        }
    }

    abstract void a(ec param0, byte param1);

    abstract fd b(int param0);

    final static void a(boolean param0) {
        lg.field_w.h(1);
        if (!param0) {
          L0: {
            field_a = (lh) null;
            if (hg.field_r == null) {
              hg.field_r = new wi(lg.field_w, ub.field_o);
              break L0;
            } else {
              break L0;
            }
          }
          lg.field_w.a(hg.field_r, -1);
          return;
        } else {
          L1: {
            if (hg.field_r == null) {
              hg.field_r = new wi(lg.field_w, ub.field_o);
              break L1;
            } else {
              break L1;
            }
          }
          lg.field_w.a(hg.field_r, -1);
          return;
        }
    }

    static {
        field_g = 0;
        field_c = new ad(0, 2, 2, 1);
        field_k = "Enter the name of the player you wish to find in the Dragons of Renown table";
        field_e = new int[]{45, 210, 490, 630, 850, 1010, 1305, 1475, 1665};
        field_j = "The pit in this room may be shallow, but it's full of metal nails waiting to shred a careless raider.<br><br>Trapped raiders permanently lose 1 <%defence>. (If <%defence> reduced to 0, the raider dies)";
        field_d = "<%col_detect>Detect +1 to all monsters.</col>";
    }
}
