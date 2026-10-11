/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static int field_d;
    static String field_c;
    static String field_b;
    static String field_a;

    final static void a(boolean param0, int param1) {
        byte[] var3 = null;
        byte[] var3Lifetime1;
        kc.field_b = param1;
        if (null != fj.field_P) {
          fj.field_P.d(16384, param1);
        }
        if (da.field_n != null) {
          da.field_n.a(param1, -65);
          if (param0) {
            var3 = (byte[]) null;
            qd.a((byte[]) null, (byte) 113);
            return;
          }
          return;
        }
        if (!param0) {
          return;
        }
        var3Lifetime1 = (byte[]) null;
        qd.a((byte[]) null, (byte) 113);
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref2 = null;
        try {
          try {
            var4 = param0.getGraphics();
            ia.field_b.a(-11, var4, param1, param2);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref2 = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
          }
          if (param3 == 2901) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("qd.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          pd.a(param0, 0, var3, 0, var2_int);
          var4 = -115 % ((param1 - 2) / 52);
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("qd.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 <= 98) {
          byte[] var2 = (byte[]) null;
          qd.a((byte[]) null, (byte) 37);
        }
    }

    static {
        field_d = 256;
        field_a = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_c = "This password contains your Player Name, and would be easy to guess";
    }
}
