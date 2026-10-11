/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static String field_a;
    static int[] field_c;
    static String field_b;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != 2) {
              gm.a(false);
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(gh.a(param0, var2, (byte) 67), "_top");
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
            stackIn_8_1 = new StringBuilder().append("gm.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
          gm.a(false);
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static boolean a(db param0, int param1, boolean param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param0.b(param1, 0, param3);
          var4 = var5;
          if (!param2) {
            return false;
          }
          if (var5 == null) {
            return false;
          }
          h.a(var5, param2);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("gm.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        if (param1) {
          var4 += 2;
        }
        if (param2) {
          var4++;
        }
        if (param3 == 12184) {
          return pf.field_m[var4];
        }
        field_c = (int[]) null;
        return pf.field_m[var4];
    }

    static {
        field_a = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "To Highscores";
    }
}
