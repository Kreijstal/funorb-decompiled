/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends bj implements qn, qb {
    private gd field_I;
    static ed field_O;
    rh field_K;
    private hc field_G;
    static int[] field_M;
    private hc field_H;
    static String field_J;
    static int[] field_L;
    static String field_N;

    private final void j(int param0) {
        int discarded$0 = 0;
        if (!this.l(84)) {
          return;
        }
        ej.a((byte) -116, this.field_I.field_l);
        if (param0 >= -118) {
          String var3 = (String) null;
          discarded$0 = this.a(125, (String) null, 33, 115, (hm) null, (String) null, 107);
        }
    }

    public static void h(byte param0) {
        field_N = null;
        field_O = null;
        if (param0 > 61) {
          field_J = null;
          field_L = null;
          field_M = null;
          return;
        }
        field_L = (int[]) null;
        field_J = null;
        field_L = null;
        field_M = null;
    }

    private final boolean l(int param0) {
        if (!this.a(this.field_I, -95)) {
          return false;
        }
        if (param0 > 47) {
          return true;
        }
        String var3 = (String) null;
        int discarded$0 = this.a(-69, (String) null, (hm) null, -35, (byte) 72, (String) null);
        return true;
    }

    private final int a(int param0, String param1, int param2, int param3, hm param4, String param5, int param6) {
        RuntimeException var8 = null;
        lf var9 = null;
        ki var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23273) {
            field_N = (String) null;
          }
          var10 = new ki(20, param3, 120 + param6, 25, param4, false, 120, 3, sb.field_a, 16777215, param1);
          this.b(var10, false);
          var9 = new lf(((og) ((Object) param4)).a((byte) -89), param5, 126, var10.field_x + param3, 25 + param6, param2);
          var9.field_q = (wn) (this);
          this.b(var9, false);
          stackIn_3_0 = var10.field_x + var9.field_x;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("oi.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(')').toString());
        }
    }

    final static ih a(int param0, mf param1, String param2, String param3, mf param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ih stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param4.b(-1, param2);
          if (param0 != 4) {
            field_N = (String) null;
          }
          var6 = param4.a(var5_int, param3, true);
          stackIn_3_0 = fa.a(param0 - 3, param1, var5_int, param4, var6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("oi.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        if (param0 != -61) {
          return;
        }
        ((kf) (this.field_I.a((byte) -89))).g(param0 + 22247);
    }

    final void a(int param0, int param1, int param2, hm param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_G.field_y = this.l(param0 + 14569);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(og param0, int param1) {
        el var3 = null;
        RuntimeException var3_ref = null;
        rf var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.a((byte) -89);
          if (var3 == null) {
            return true;
          }
          if (param1 > -92) {
            return true;
          }
          var4 = var3.a(17124);
          stackIn_9_0 = (df.field_h == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("oi.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, String param1, hm param2, int param3, byte param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -5) {
            field_J = (String) null;
          }
          stackIn_3_0 = this.a(param4 + 23278, param1, 35, param3, param2, param5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("oi.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(byte param0, String param1) {
        gd var3 = null;
        String var4 = null;
        try {
          if (param0 >= -49) {
            this.a((byte) -79);
          }
          var3 = this.field_I;
          var4 = param1;
          ((ul) ((Object) var3)).a(var4, false, -33);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oi.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            return;
          }
          if (this.field_H == param0) {
            eh.b(param3 ^ -104);
            return;
          }
          if (param0 != this.field_G) {
            return;
          }
          this.j(-125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("oi.K(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 78)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a((byte) 22, param0);
            return stackIn_6_0;
          }
          if (param3 <= 0) {
            field_L = (int[]) null;
          }
          if (param2 != 99) {
            return false;
          }
          stackIn_12_0 = this.a(param0, true);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("oi.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int k(int param0) {
        if (param0 != -99) {
          field_M = (int[]) null;
          return gf.field_a;
        }
        return gf.field_a;
    }

    public oi() {
        super(0, 0, 496, 0, (db) null);
        this.field_I = new gd("", (wn) null, 12);
        k var1 = new k(ke.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, sb.field_a.field_r, -1, 2147483647, true);
        hm var2 = new hm(sm.field_a, var1, (wn) null);
        this.field_G = new hc(ah.field_i, (wn) null);
        this.field_H = new hc(cf.field_b, (wn) null);
        this.field_I.field_i = bb.field_K;
        this.field_I.a(new kf(this.field_I), (byte) 63);
        this.field_G.field_y = false;
        this.field_G.field_s = (db) ((Object) new ck());
        this.field_H.field_s = (db) ((Object) new ha());
        this.field_I.field_s = (db) ((Object) new re(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(270, var3, 20, true, 50);
        var3 += 50;
        this.b(var2, false);
        var3 = var3 + (5 + this.a(170, lf.field_J, this.field_I, var3, (byte) -5, ig.field_i));
        this.field_G.a(var5, var3, 496 - var5 >> 1, true, 40);
        this.field_H.a(60, 15 + var3, 3 + var4, true, 40);
        this.field_H.field_q = (wn) (this);
        this.field_G.field_q = (wn) (this);
        this.b(this.field_G, false);
        this.b(this.field_H, false);
        this.field_K = new rh((qn) (this));
        this.field_K.a(-this.field_I.field_g + this.field_g + (-this.field_I.field_k - 60), 20, this.field_I.field_k + (this.field_I.field_g + 60), true, 150);
        this.b(this.field_K, false);
        this.a(496, 0, 0, true, var4 + var3 + 55);
    }

    static {
        field_M = new int[4];
        field_J = "Target eliminated";
        field_N = "Sound: ";
        field_L = new int[8192];
    }
}
