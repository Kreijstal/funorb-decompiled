/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    int field_d;
    static ci field_c;
    static String field_g;
    int field_e;
    static String field_b;
    int field_f;
    static String field_a;

    final static void a(int param0, byte param1, int param2, int param3) {
        if (0 == param0 &&
          sg.field_d != param2) {
          sg.field_d = param2;
          tj.field_l = true;
          pj.b(-6446, param3);
        }
        if (1 == param0 &&
          ii.field_Q != param2) {
          ii.field_Q = param2;
          tj.field_l = true;
          pj.b(-6446, param3);
        }
        if (2 == param0 &&
          param2 != v.field_d) {
          v.field_d = param2;
          tj.field_l = true;
          pj.b(param1 - 6347, param3);
        }
        if (param1 != -99) {
          oj.a((byte) 15);
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = -5 / ((-50 - param0) / 60);
        field_c = null;
        field_b = null;
        field_g = null;
    }

    final static sa a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        sa var7 = null;
        int var8 = 0;
        sa stackIn_6_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_13_0 = null;
        sa stackIn_18_0 = null;
        sa stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Chess.field_G;
        try {
          var2_int = param0.length();
          if (param1 < 75) {
            field_c = (ci) null;
          }
          if (var2_int == 0) {
            stackIn_6_0 = ef.field_j;
            return stackIn_6_0;
          }
          if (255 < var2_int) {
            stackIn_10_0 = ok.field_Ob;
            return stackIn_10_0;
          }
          var3 = gl.a((byte) -118, '.', param0);
          if (var3.length < 2) {
            stackIn_13_0 = ef.field_j;
            return stackIn_13_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_21_0 = ib.a(var3[var3.length - 1], false);
              return stackIn_21_0;
            }
            var6 = var4[var5];
            var7 = ie.a(var6, (byte) -55);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_18_0 = var7;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("oj.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (ua.field_d != null) {
          ua.field_d.k((byte) -112);
        }
        hn.field_u = new s();
        nj.field_w.c(hn.field_u, 78);
        if (param0 <= 120) {
          field_a = (String) null;
        }
    }

    oj(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_f = param0;
        this.field_e = param2;
    }

    static {
        field_g = "Invalid date";
        field_a = "Username: ";
        field_b = "Game full";
    }
}
