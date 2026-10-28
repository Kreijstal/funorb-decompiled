/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends java.awt.Canvas {
    static String field_a;
    private java.awt.Component field_b;
    static String field_e;
    static int[] field_d;
    static int field_c;

    public static void releaseStatics(int guard) {
        int var1 = 26 / ((guard - 55) / 60);
        field_a = null;
        field_e = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, boolean param1, String param2) {
        String stackIn_32_2 = null;
        String stackIn_35_2 = null;
        try {
          if (MatchingTextValidator.b((byte) -35, param0)) {
            return false;
          }
          if (aa.a(1, param0)) {
            return false;
          }
          if (ol.a((byte) -7, param0)) {
            return false;
          }
          if (param2.length() == 0) {
            return true;
          }
          if (lg.a(0, param0, param2)) {
            return false;
          }
          if (lf.a(param0, (byte) 37, param2)) {
            return false;
          }
          if (param1) {
            return false;
          }
          if (!RockBuster.a(-91, param0, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var3;
          StringBuilder stackIn_31_1 = new StringBuilder().append("hd.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          StringBuilder stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    hd(java.awt.Component param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Triple shot";
        field_d = new int[8192];
    }
}
