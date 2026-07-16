/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_d;
    static String field_c;
    static String field_b;
    static String field_a;

    final static void a(boolean param0, int param1) {
        Object var3 = null;
        L0: {
          kc.field_b = param1;
          if (null != fj.field_P) {
            fj.field_P.d(16384, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (da.field_n == null) {
          if (param0) {
            var3 = null;
            byte[] discarded$4 = qd.a((byte[]) null, (byte) 113);
            return;
          } else {
            return;
          }
        } else {
          da.field_n.a(param1, -65);
          if (!param0) {
            return;
          } else {
            var3 = null;
            byte[] discarded$5 = qd.a((byte[]) null, (byte) 113);
            return;
          }
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        Exception exception = null;
        java.awt.Graphics var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var4 = param0.getGraphics();
            ia.field_b.a(-11, var4, param1, param2);
            var4.dispose();
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            exception = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            break L1;
          }
        }
        if (param3 != 2901) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2 = param0.length;
        byte[] var3 = new byte[var2];
        pd.a(param0, 0, var3, 0, var2);
        int var4 = -115 % ((param1 - 2) / 52);
        return var3;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 <= 98) {
            Object var2 = null;
            byte[] discarded$0 = qd.a((byte[]) null, (byte) 37);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 256;
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "This password contains your Player Name, and would be easy to guess";
    }
}
