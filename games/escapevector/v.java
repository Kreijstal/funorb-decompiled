/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static Sprite[] field_a;
    static int[] field_b;

    final static void a(int param0, int param1) {
        if (null != bk.field_r) {
          bk.field_r.b(param0 ^ -9, param1);
        }
        if (param0 != 8) {
          v.a(120);
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 >= -29) {
                v.a(-34, 33);
              }
              java.net.URL var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(sh.a((byte) 29, param0, var2), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Exception var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_8_0 = var2_ref2;
            StringBuilder stackIn_8_1 = new StringBuilder().append("v.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int[] a(int param0) {
        if (param0 >= -43) {
          return (int[]) null;
        }
        return new int[8];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -87) {
          v.a(79);
        }
    }

    static {
        field_b = new int[]{5, 6, 7};
    }
}
