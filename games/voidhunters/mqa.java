/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mqa extends rqa {
    static int field_s;
    static gl field_r;
    static String field_p;
    static float field_o;
    static int field_q;

    mqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static lkb a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        lkb stackIn_4_0 = null;
        lkb stackIn_8_0 = null;
        lkb stackIn_18_0 = null;
        lkb stackIn_22_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = br.field_f;
            return stackIn_4_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = qw.field_j;
            return stackIn_8_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (var3 == 0 ||
                var3 == var2_int - 1) {
                stackIn_18_0 = ira.field_b;
                return stackIn_18_0;
              }
            } else {
              if (tea.field_a.indexOf(var4) == -1) {
                stackIn_22_0 = ira.field_b;
                return stackIn_22_0;
              }
            }
          }
          if (param0 == -23150) {
            return null;
          }
          var6 = (String) null;
          mqa.a(-101, (String) null);
          stackIn_29_0 = null;
          return (lkb) (stackIn_29_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("mqa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 <= -6) {
          field_p = null;
          field_r = null;
          return;
        }
        String var2 = (String) null;
        mqa.a(105, (String) null);
        field_p = null;
        field_r = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(33, 62, param0[0].a(29));
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -71);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mqa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_s = 131072;
        field_r = new gl(1);
        field_o = 1.0f;
        field_p = "Remove selected event";
    }
}
