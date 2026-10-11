/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends gr {
    int field_N;
    static int[] field_K;
    np field_R;
    byte[] field_Q;
    static String field_M;
    static byte[] field_S;
    static tf field_L;
    static vh field_J;
    static int[] field_T;
    static String field_P;

    public static void c(byte param0) {
        field_T = null;
        field_M = null;
        field_L = null;
        field_K = null;
        field_S = null;
        if (param0 == -80) {
          field_J = null;
          field_P = null;
          return;
        }
        String var2 = (String) null;
        dg.a(83, (String) null, (String) null, (String) null);
        field_J = null;
        field_P = null;
    }

    final byte[] b(boolean param0) {
        if (this.field_F) {
          throw new RuntimeException();
        }
        if (!param0) {
          return this.field_Q;
        }
        dg.a((byte) -47, -118, 74);
        return this.field_Q;
    }

    final static int[] a(int param0, int param1) {
        if (param0 == -9) {
          return param1 != 0 ? param1 == 8 ? sa.field_q : 8 <= param1 ? om.field_r : cr.field_p : ae.field_e;
        }
        return (int[]) null;
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = param2 >>> 31;
        if (param0 == 44) {
          return -var3 + (param2 + var3) / param1;
        }
        field_M = (String) null;
        return -var3 + (param2 + var3) / param1;
    }

    dg() {
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = param2.indexOf(param3);
        while (-1 != var4) {
          param2 = param2.substring(0, var4) + param1 + param2.substring(param3.length() + var4);
          var4 = param2.indexOf(param3, param1.length() + var4);
        }
        int var5 = -105 % ((param0 - 87) / 35);
        return param2;
    }

    final int e(int param0) {
        if (this.field_F) {
          return 0;
        }
        if (param0 <= 6) {
          field_S = (byte[]) null;
          return 100;
        }
        return 100;
    }

    static {
        field_M = "Restart";
        field_S = new byte[520];
        field_L = new tf(3);
        field_P = "Playing";
    }
}
