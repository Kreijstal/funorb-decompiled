/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends qg {
    int field_A;
    static String field_C;
    static int[] field_F;
    static String field_D;
    static String[] field_B;
    static int field_E;

    final static void a(String param0, byte param1) {
        System.out.println("Error: " + sb.a(param0, "%0a", "\n", 127));
        if (param1 < 105) {
          String var3 = (String) null;
          n.a((String) null, (byte) 75);
        }
    }

    public static void d(byte param0) {
        field_F = null;
        field_C = null;
        field_B = null;
        field_D = null;
        if (param0 != -89) {
          n.d((byte) -100);
        }
    }

    final static nc b(String param0, byte param1) {
        int var6 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_11_0 = null;
        nc stackIn_17_0 = null;
        nc stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Main.field_T;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ec.field_j;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = dj.field_f;
            return stackIn_7_0;
          }
          var3 = rh.a('.', param0, -68);
          var4 = 17 % ((param1 + 44) / 33);
          if (2 > var3.length) {
            stackIn_11_0 = ec.field_j;
            return stackIn_11_0;
          }
          var5 = var3;
          for (var6 = 0; var5.length > var6; var6++) {
            var7 = var5[var6];
            var8 = sj.a(var7, (byte) 8);
            if (var8 != null) {
              stackIn_17_0 = var8;
              return stackIn_17_0;
            }
          }
          stackIn_20_0 = eb.a(-3124, var3[var3.length - 1]);
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("n.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    n(lk param0) {
        super(param0.field_o, param0.field_i, param0.field_h, param0.field_q, (ci) null, (pl) null);
        try {
          param0.a(this.field_q, 0, this.field_h, 0, true);
          this.field_A = 256;
          this.field_y = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public n() {
        super(0, 0, 0, 0, (ci) null, (pl) null);
        this.field_A = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != ~param3) {
          return;
        }
        if (this.field_y == null) {
          return;
        }
        if (this.field_A == 0) {
          return;
        }
        if (this.field_A == 256) {
          this.field_y.a(param0 + this.field_o, param1 + this.field_i, -1, param3);
          return;
        }
        kc var6 = new kc(this.field_y.field_h, this.field_y.field_q);
        dl.a(-27, var6);
        this.field_y.a(0, 0, param2 + 0, param3);
        gg.a(14756);
        var6.e(param0 + this.field_o, param1 + this.field_i, this.field_A);
    }

    static {
        field_F = new int[8192];
        field_D = "Highscores";
        field_C = "Checking";
        field_E = 2;
        field_B = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
