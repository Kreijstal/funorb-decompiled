/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends fe {
    static String field_T;
    static long field_S;
    static String field_Q;
    static vh field_P;
    static String field_R;
    static rn field_U;
    static String field_N;
    static String field_O;

    public static void a(int param0) {
        if (param0 <= 65) {
          return;
        } else {
          field_U = null;
          field_Q = null;
          field_R = null;
          field_O = null;
          field_P = null;
          field_T = null;
          field_N = null;
          return;
        }
    }

    private ri(String param0, cc param1) {
        this(param0, db.field_Sb.field_l, param1);
        try {
            this.field_z = db.field_Sb.field_o;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (param0 != 16) {
          L0: {
            this.a(126, 56, 57, 116);
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (this.field_G) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ri) (this)).field_G = stackIn_8_1 != 0;
          super.a(param0 + 0, param1, param2, param3);
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (this.field_G) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ri) (this)).field_G = stackIn_4_1 != 0;
          super.a(param0 + 0, param1, param2, param3);
          return;
        }
    }

    private ri(String param0, fp param1, cc param2) {
        super(param0, param1, param2);
        try {
            this.field_z = db.field_Sb.field_o;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ri(String param0, cc param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_G = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ri.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_T = "Your email address is used to identify this account";
        field_Q = "Connecting to<br>friend server...";
        field_R = "Orb coins: ";
        field_O = "Macroing or use of bots";
    }
}
