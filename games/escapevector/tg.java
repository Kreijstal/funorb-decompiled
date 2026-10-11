/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends ol {
    String field_ob;
    String field_lb;
    static long field_mb;
    static String[] field_nb;
    int field_pb;

    public static void h(int param0) {
        if (param0 != 0) {
          tg.b(-28, 85);
          field_nb = null;
          return;
        }
        field_nb = null;
    }

    final static jh b(int param0, int param1) {
        jh var2 = null;
        if (param1 >= 89) {
          var2 = new jh();
          bc.field_b.a(-12328, var2);
          km.a(param0, -22);
          return var2;
        }
        return (jh) null;
    }

    tg() {
        super(0L, (ol) null);
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 51) {
            var3 = (CharSequence) null;
            tg.a(-9, (CharSequence) null);
          }
          stackIn_3_0 = n.a(false, param1, 113);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tg.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String i(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        if (null == ck.field_r) {
          return "";
        }
        return ck.field_r;
    }

    static {
    }
}
