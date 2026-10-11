/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ct {
    static gj field_a;
    static String field_b;

    final static int a(int param0, int param1) {
        if (param0 != 19143) {
          ij var3 = (ij) null;
          ct.a((ml) null, 95, (ij) null);
        }
        if (li.field_i) {
          return mmb.field_d[param1].a();
        }
        return 100;
    }

    final static void a(ml param0, int param1, ij param2) {
        int var4 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        imb var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (param1 <= 30) {
            field_a = (gj) null;
          }
          param2.b(-10258, new hua(param0.field_j));
          if (null != param0.field_d) {
            if (0 >= param0.field_d.length) {
              return;
            }
            var3_int = 0;
            for (var4 = 0; var4 < param0.field_d.length; var4++) {
              var5 = param0.field_d[var4];
              if (var5.field_c != -1) {
                param2.b(-10258, new hua(var4));
                ct.a(param0.field_f[var5.field_c], 108, param2);
                if (-1 + param0.field_d.length == var4) {
                  var3_int = 1;
                }
              }
            }
            if (var3_int != 0) {
              return;
            }
            param2.b(-10258, new hua(-1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("ct.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 100 % ((param0 - 79) / 38);
        field_b = null;
        field_a = null;
    }

    static {
        field_a = new gj();
        field_b = " KEYS";
    }
}
