/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hha extends od {
    volatile boolean field_m;
    boolean field_l;
    boolean field_k;

    final static String a(boolean param0) {
        if (param0) {
          hha.a(-49, 62, -28);
          if (kl.field_a == gsa.field_y) {
            return faa.field_g;
          }
          if (!gva.field_b.b(88)) {
            return gva.field_b.a((byte) 119);
          }
          if (gsa.field_y != wt.field_d) {
            return jo.field_E;
          }
          return gva.field_b.a((byte) 100);
        }
        if (kl.field_a == gsa.field_y) {
          return faa.field_g;
        }
        if (!gva.field_b.b(88)) {
          return gva.field_b.a((byte) 119);
        }
        if (gsa.field_y != wt.field_d) {
          return jo.field_E;
        }
        return gva.field_b.a((byte) 100);
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 > -77) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(sda.a(param0, -1, var2), "_top");
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
            stackIn_8_1 = new StringBuilder().append("hha.B(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract byte[] b(byte param0);

    final static boolean a(int param0, int param1, int param2) {
        if (param1 != 0) {
          return true;
        }
        return (param2 & 2048) != 0 ? true : false;
    }

    abstract int a(byte param0);

    hha() {
        this.field_m = true;
    }

    static {
    }
}
