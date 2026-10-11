/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_a;

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param0 != 0) {
            rc.a(93, 80);
          }
          try {
            cl.a(new Object[]{new Integer(param1)}, "resizing", param0 + 30383, jg.f(1));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          return false;
        }
        if (vb.field_F == this) {
          return true;
        }
        if (this == fc.field_b) {
          return true;
        }
        if (hi.field_l != this) {
          return false;
        }
        return true;
    }

    final static wd a(String[] args, byte param1) {
        wd var2 = null;
        RuntimeException var2_ref = null;
        wd stackIn_2_0 = null;
        wd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new wd(false);
          var2.field_c = args;
          if (param1 < -63) {
            stackIn_4_0 = var2;
            return stackIn_4_0;
          }
          stackIn_2_0 = (wd) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("rc.C(");
          if (args == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_a = 0;
        oi discarded$0 = new oi();
    }
}
