/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends IntrusiveNode {
    static String field_l;
    static int[] field_k;
    static int field_j;
    static boolean field_g;
    byte[] field_h;
    static String field_i;

    public static void resetStaticState(byte param0) {
        field_i = null;
        field_k = null;
        field_l = null;
        if (param0 < 117) {
          field_j = -94;
        }
    }

    final static void a(int param0, boolean param1, MusicTrack param2) {
        try {
          if (param0 != 17099) {
            field_j = -73;
          }
          am.a(param1, 256, param2, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "wd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        ql.field_b = null;
        BufferedSocket.field_j = null;
        Bzip2State.field_a = null;
        Bzip2State.field_K = (byte[][]) null;
        int var1 = -77 % ((param0 - 71) / 46);
        EditableTextField.field_D = null;
        wk.field_b = null;
    }

    wd(byte[] param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "wd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Unfortunately you are not eligible to create an account.";
        field_k = new int[]{2, 3, 3, 5, 3, 5, 2, 5, 5, 10, 3, 3, 2, 3, 3, 3};
        field_i = "Accept";
    }
}
