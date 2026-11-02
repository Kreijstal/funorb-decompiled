/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    String context;
    static int[] field_g;
    static String field_f;
    static nh[] field_e;
    static he[] field_b;
    static int field_c;
    Throwable cause;

    final static void a(int param0, int param1, byte param2, int param3, int param4, nh param5, int param6, int param7, int param8) {
        try {
          if (param2 > -91) {
            field_e = (nh[]) null;
          }
          ph.field_e = param6;
          af.field_d = param0;
          hf.field_z = param5;
          ca.field_db = param1;
          ac.field_a = param3;
          KeyboardInput.field_a = param7;
          ib.field_l = param8;
          hd.field_B = param4;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "gl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_f = null;
          field_e = null;
          field_g = null;
          field_b = null;
          return;
        }
        ClientException.a(false);
        field_f = null;
        field_e = null;
        field_g = null;
        field_b = null;
    }

    ClientException(Throwable param0, String param1) {
        this.context = param1;
        this.cause = param0;
    }

    static {
        field_f = "Create a free account to start using this feature";
        field_g = new int[8192];
        field_b = new he[1];
        field_c = -1;
    }
}
