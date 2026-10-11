/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je implements el {
    private int field_d;
    private int field_b;
    static la field_f;
    static String field_i;
    static int field_a;
    static th field_g;
    static t field_e;
    private uc field_h;
    static boolean field_c;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Torquing.field_u;
        try {
          if (param0 <= 89) {
            return;
          }
          if (!param4.field_s &&
            !param4.g(2)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_h.a("<u=" + Integer.toString(var6_int, 16) + ">" + param4.field_m + "</u>", param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, var6_int, -1, this.field_b, this.field_d, this.field_h.field_t + this.field_h.field_x);
          if (!param4.g(2)) {
            return;
          }
          var7 = this.field_h.a(param4.field_m);
          var8 = this.field_h.field_x + this.field_h.field_t;
          var9 = param4.field_w + param2;
          var10 = param4.field_k + param1;
          if (this.field_b != 2) {
            if (1 == this.field_b) {
              var9 = var9 + (-var7 + param4.field_p >> 1);
            }
          } else {
            var9 = var9 + (param4.field_p - var7);
          }
          if (this.field_d != 2) {
            if (1 == this.field_d) {
              var10 = var10 + (param4.field_o - var8 >> 1);
            }
          } else {
            var10 = var10 + (-var8 + param4.field_o);
          }
          he.a(-2 + var9, var8, var10 + 2, 2, 4 + var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("je.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_e = null;
        field_g = null;
        int var1 = 30 % ((30 - param0) / 35);
        field_i = null;
        field_f = null;
    }

    final static kh a(la param0, String param1, String param2, byte param3) {
        rm var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_4_0 = null;
        kh stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = rm.a(param0, param1, param2);
          if (param3 > -116) {
            field_a = -35;
          }
          if (var4 != null) {
            stackIn_6_0 = new kh(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (kh) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_9_0 = var4_ref;
          stackIn_9_1 = new StringBuilder().append("je.D(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, long[] param1) {
        ii var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.field_z < 1024) {
            var2 = (ii) (bp.field_a.a((byte) 98));
            if (var2 == null) {
              var2 = new ii();
            }
            var2.field_l = param1;
            bd.field_s.a((byte) 54, var2);
            lc.field_z = lc.field_z + 1;
          }
          if (param0 == -43) {
            return;
          }
          var3 = (String) null;
          je.a((la) null, (String) null, (String) null, (byte) 82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("je.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static pp a(int param0, int param1, vh param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        pp var7 = null;
        java.awt.Frame var8 = null;
        pp stackIn_5_0 = null;
        pp stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = jj.a(param2, param1, param0, 0, param3, param4);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          if (param5 > -9) {
            stackIn_5_0 = (pp) null;
            return stackIn_5_0;
          }
          var7 = new pp();
          var7.field_d = var8;
          var7.field_d.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param1);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("je.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        if (param0 < 40) {
          field_a = -119;
          return kb.field_h;
        }
        return kb.field_h;
    }

    public je() {
        this.field_b = 1;
        this.field_d = 1;
        this.field_h = dg.field_e;
    }

    je(uc param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_h = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "je.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_i = "Shield<br>Protects from one bomb";
    }
}
