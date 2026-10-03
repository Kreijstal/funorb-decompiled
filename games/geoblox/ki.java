/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    static dm field_c;
    static rh field_b;
    static int field_d;
    static String field_a;
    static String field_e;

    final static void a(vd param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Geoblox.field_C;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            p.field_o[var2_int] = 0;
          }
          for (var2_int = 0; var2_int < oj.field_b; var2_int++) {
            if (n.field_k[var2_int].field_f == param0.field_f) {
              dupTemp$3 = n.field_k[var2_int].c(124);
              p.field_o[dupTemp$3] = p.field_o[dupTemp$3] + 1;
            }
          }
          if (param1 != 31274) {
            return;
          }
          dupTemp$0 = param0.c(125);
          p.field_o[dupTemp$0] = p.field_o[dupTemp$0] + 1;
          var2_int = 0;
          for (var3 = 0; oj.field_b > var3; var3++) {
            L3: {
              if (param0.field_f == n.field_k[var3].field_f) {
                var4 = n.field_k[var3].c(124);
                if (p.field_o[var4] > pc.field_v) {
                  p.field_o[var4] = p.field_o[var4] - 1;
                  break L3;
                }
              }
              incrementValue$2 = var2_int;
              var2_int++;
              n.field_k[incrementValue$2] = n.field_k[var3];
            }
          }
          oj.field_b = var2_int;
          fieldTemp$1 = oj.field_b;
          oj.field_b = oj.field_b + 1;
          n.field_k[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = (RuntimeException) (var2);
          stackIn_26_1 = new StringBuilder().append("ki.B(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != -64) {
            vd var2 = (vd) null;
            ki.a((vd) null, -13);
        }
    }

    final static void a(int param0) {
        r.a(rh.field_i, (byte) -61, true, oj.field_a);
        int var1 = -30 % ((param0 + 30) / 36);
        mi.field_I = true;
    }

    static {
        field_c = new dm(540, 140);
        field_a = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_e = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
