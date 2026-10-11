/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends sf {
    byte[] field_H;
    static char field_G;
    static String[] field_L;
    static long field_J;
    static String field_I;
    int field_F;
    kh field_K;

    final byte[] g(byte param0) {
        if (this.field_z) {
          throw new RuntimeException();
        }
        if (param0 >= 65) {
          return this.field_H;
        }
        this.a(true);
        return this.field_H;
    }

    public static void b(boolean param0) {
        field_L = null;
        field_I = null;
        if (!param0) {
          java.awt.Component var2 = (java.awt.Component) null;
          el.a(-15, (byte) 51, -90, (java.awt.Component) null);
        }
    }

    final static eh a(int param0, byte param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          eh var5 = null;
          wf var5_ref = null;
          eh stackIn_2_0 = null;
          eh stackIn_4_0 = null;
          wf stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1 < 5) {
                stackIn_2_0 = (eh) null;
                return stackIn_2_0;
              }
              var4 = Class.forName("rj");
              var5 = (eh) (var4.newInstance());
              var5.a(param2, (byte) 83, param0, param3);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new wf();
              ((eh) ((Object) var5_ref)).a(param2, (byte) 83, param0, param3);
              stackIn_6_0 = var5_ref;
              return (eh) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("el.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    el() {
    }

    final int a(boolean param0) {
        if (this.field_z) {
          return 0;
        }
        if (param0) {
          field_I = (String) null;
          return 100;
        }
        return 100;
    }

    static {
        field_I = "The invitation has been withdrawn.";
    }
}
