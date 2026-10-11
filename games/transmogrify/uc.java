/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static boolean field_d;
    static String field_b;
    static String field_c;
    static String field_e;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        if (param0 != 0) {
          field_a = 69;
        }
    }

    final static void a(byte param0) {
        CharSequence var3 = null;
        if (param0 >= 76) {
          w.field_a = nf.field_l.g(12248);
          var3 = (CharSequence) ((Object) w.field_a);
          kf.field_e = hj.a((byte) -125, var3);
          return;
        }
        uc.a(96, (byte) 96);
        w.field_a = nf.field_l.g(12248);
        CharSequence var2 = (CharSequence) ((Object) w.field_a);
        kf.field_e = hj.a((byte) -125, var2);
    }

    final static int a(String param0, boolean param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_2_0 = -6;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = tb.field_c.a(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = ce.field_b.a(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uc.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        lb.field_a = param0;
        if (param1 >= -116) {
          return;
        }
        if (null != jk.field_D) {
          jk.field_D.a((byte) 101, param0);
          if (null != jj.field_a) {
            jj.field_a.a(param0, false);
            return;
          }
          return;
        }
        if (null == jj.field_a) {
          return;
        }
        jj.field_a.a(param0, false);
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 0) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "toserverlist.ws");
              param1.getAppletContext().showDocument(dh.a(param1, (byte) -112, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("uc.E(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Best each";
        field_d = true;
        field_c = "Please check if address is correct";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
    }
}
