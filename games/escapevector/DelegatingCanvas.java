/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DelegatingCanvas extends java.awt.Canvas {
    static String field_a;
    private java.awt.Component delegate;
    static String field_e;
    static int[] field_d;
    static int spriteSheetHeight;

    public static void releaseStatics(int guard) {
        int var1 = 26 / ((guard - 55) / 60);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.delegate.update(param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isPasswordAcceptable(String password, boolean guard, String accountName) {
        String stackIn_32_2 = null;
        String stackIn_35_2 = null;
        try {
          if (MatchingTextValidator.b((byte) -35, password)) {
            return false;
          }
          if (aa.a(1, password)) {
            return false;
          }
          if (ol.a((byte) -7, password)) {
            return false;
          }
          if (accountName.length() == 0) {
            return true;
          }
          if (lg.a(0, password, accountName)) {
            return false;
          }
          if (ValidationHelpWidget.containsIdentifierVariant(password, (byte) 37, accountName)) {
            return false;
          }
          if (guard) {
            return false;
          }
          if (!RockBuster.a(-91, password, accountName)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var3;
          StringBuilder stackIn_31_1 = new StringBuilder().append("hd.B(");
          if (password == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(guard).append(',');
          if (accountName == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.delegate.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    DelegatingCanvas(java.awt.Component delegate) {
        try {
          this.delegate = delegate;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (delegate != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Triple shot";
        field_d = new int[8192];
    }
}
