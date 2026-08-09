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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        if (param0 != 16) {
          L0: {
            this.a(126, 56, 57, 116);
            stackIn_7_0 = this;

            if (this.field_G) {
              stackIn_8_0 = this;
              stackIn_8_1 = 0;
              break L0;
            } else {
              stackIn_8_0 = this;
              stackIn_8_1 = 1;
              break L0;
            }
          }
          ((ri) (this)).field_G = stackIn_8_1 != 0;
          super.a(param0 + 0, param1, param2, param3);
          return;
        } else {
          L1: {
            stackIn_3_0 = this;

            if (this.field_G) {
              stackIn_4_0 = this;
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = this;
              stackIn_4_1 = 1;
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
