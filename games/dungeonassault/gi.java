/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi extends ii implements vg {
    private mg field_N;
    static int[] field_L;
    static String[] field_K;
    static String field_P;
    private String[] field_M;
    static java.awt.Canvas field_R;
    private ck[] field_O;
    static String field_Q;
    static uo field_S;

    final void a(byte param0, String[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        oa var5 = null;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        try {
          this.field_B.b(-4);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            var4 = -105 / ((-51 - param0) / 49);
            this.field_M = new String[var3_int];
            for (var5_int = 0; var5_int < var3_int; var5_int++) {
              this.field_M[var5_int] = kl.a((CharSequence) ((Object) param1[var5_int]), (byte) -49).replace(' ', ' ');
            }
            var5 = new oa(lp.field_C, 0, 1);
            this.field_O = new ck[var3_int + 1];
            for (var6 = 0; var3_int > var6; var6++) {
              this.field_O[var6] = new ck(this.field_M[var6], (pg) (this));
              this.field_O[var6].field_o = (ca) ((Object) var5);
              this.field_O[var6].field_i = ln.field_c;
              this.field_O[var6].b(0, 80, var6 * 16 + 20, 0, 15);
              this.b((byte) -123, this.field_O[var6]);
            }
            this.field_O[var3_int] = new ck(li.field_i, (pg) (this));
            this.field_O[var3_int].field_o = (ca) ((Object) var5);
            this.field_O[var3_int].b(0, 100, 16 + (16 * var3_int + 20), 0, 15);
            this.b((byte) -117, this.field_O[var3_int]);
            return;
          }
          this.field_M = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("gi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_K = null;
        field_S = null;
        field_P = null;
        if (param0 >= -27) {
          return;
        }
        field_R = null;
        field_Q = null;
        field_L = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        se var5 = lp.field_C;
        if (null != this.field_M) {
          var5.a(sc.field_p, param1 + this.field_q, param3 + this.field_v, this.field_x, 20, 16777215, -1, 0, 0, var5.field_E + var5.field_H);
        }
    }

    public final void a(ck param0, byte param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = DungeonAssault.field_K;
        try {
          if (param1 != 98) {
            this.field_O = (ck[]) null;
          }
          for (var6_int = 0; this.field_M.length > var6_int; var6_int++) {
            if (param0 == this.field_O[var6_int]) {
              this.field_N.a((byte) -67, this.field_M[var6_int]);
            }
          }
          if (param0 == this.field_O[this.field_M.length]) {
            this.field_N.a(125);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("gi.FA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    gi(mg param0) {
        super(0, 0, 0, 0, (ca) null);
        try {
          this.field_N = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "gi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(lm param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, (byte) 125)) {
            return true;
          }
          if (98 == param2) {
            stackIn_5_0 = this.a(param0, (byte) 71);
            return stackIn_5_0;
          }
          if (param2 == 99) {
            stackIn_8_0 = this.a((byte) -5, param0);
            return stackIn_8_0;
          }
          if (param3 >= 55) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("gi.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_P = "Corrosive Slime";
        field_K = new String[]{"Scout", "Scout next room. (Single use)"};
        field_L = new int[8192];
        field_Q = "<col=2E5D17>Advance</col> - Engage monster";
    }
}
