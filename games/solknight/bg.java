/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends uf {
    static java.awt.Frame field_w;
    static boolean field_u;
    static String field_t;
    static int[][] field_v;

    public static void f(int param0) {
        field_t = null;
        field_w = null;
        if (param0 == -24631) {
          field_v = (int[][]) null;
          return;
        }
        String var2 = (String) null;
        bg.a((String) null, -7, (String) null);
        field_v = (int[][]) null;
    }

    final String b(rc param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            bg.f(57);
          }
          stackIn_3_0 = uc.a(param1 - 110, '*', param0.field_i.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("bg.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private bg(mg param0, int param1) {
        super(param0, param1);
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.a(0, param2)) {
            return false;
          }
          if (lh.a(param2, (byte) -57)) {
            return false;
          }
          if (b.a(param2, (byte) 93)) {
            return false;
          }
          if (param0.length() == 0) {
            return true;
          }
          if (ne.a(param2, false, param0)) {
            return false;
          }
          if (gl.a(param2, 80, param0)) {
            return false;
          }
          if (l.a(param0, param2, 0)) {
            return false;
          }
          if (param1 >= 41) {
            return true;
          }
          var4 = (String) null;
          bg.a((String) null, 71, (String) null);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("bg.W(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    bg(int param0) {
        this(ua.field_G, param0);
    }

    static {
        field_u = false;
        field_t = "Waiting for extra data";
    }
}
