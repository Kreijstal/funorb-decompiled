/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends vk implements dc, ga {
    private ab field_H;
    static String field_C;
    static volatile boolean field_E;
    private ok field_z;
    private dk field_y;
    static int field_D;
    static hl field_A;
    static int field_F;

    private final String j(int param0) {
        if (param0 != -99) {
          field_A = (hl) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    final static lk a(int param0, ue param1, int param2, byte param3, ue param4) {
        RuntimeException var5 = null;
        lk stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > -92) {
            jj.a(32);
          }
          if (!qb.a((byte) 94, param0, param2, param1)) {
            return null;
          }
          stackIn_6_0 = qd.a(param4.a(param0, true, param2), (byte) -71);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("jj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void i(int param0) {
        int var1 = -33 % ((58 - param0) / 42);
        g.a(21975);
    }

    public final void a(int param0, byte param1, int param2, ab param3) {
        String discarded$0 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = StarCannon.field_A;
        try {
          if (param0 == 0) {
            qa.a((byte) -108, "terms.ws");
          } else {
            if (param0 != 1) {
              if (param0 == 2) {
                qa.a((byte) -119, "conduct.ws");
              }
            } else {
              qa.a((byte) -113, "privacy.ws");
            }
          }
          if (param1 == -123) {
            return;
          }
          discarded$0 = this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jj.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == this.field_y) {
            ej.f((byte) -80);
            this.field_z.n(-94);
          }
          if (!param2) {
            return;
          }
          field_F = 57;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("jj.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean a(uj param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_6_0 = this.b(param2 ^ 36, param0);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_9_0 = this.a((byte) -103, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jj.EA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 200) {
            stackIn_4_0 = pf.a(param1, false, false);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jj.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final String a(boolean param0) {
        if (param0) {
          this.field_H = (ab) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void a(int param0) {
        field_C = null;
        if (param0 != 0) {
          return;
        }
        field_A = null;
    }

    jj(ok param0) {
        super(0, 0, 288, 0, (de) null);
        String var7 = null;
        int var3 = 0;
        hd var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_z = param0;
          this.field_y = new dk(ui.field_s, (qg) null);
          this.field_y.field_o = (de) ((Object) new gb());
          var7 = fb.a(field_C, -98, new String[]{this.a(false), this.j(-99)});
          var3 = 20;
          var4 = new hd(nb.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, nb.field_c.field_p, -1, 2147483647, true);
          this.field_H = new ab(var7, var4);
          this.field_H.field_p = "";
          this.field_H.a(pc.field_b, -5, 0);
          this.field_H.a(pc.field_b, -103, 1);
          this.field_H.field_g = (qg) (this);
          this.field_H.field_i = -40 + this.field_i;
          this.field_H.b(26, 95, var3, this.field_i - 40);
          var3 = var3 + (this.field_H.field_f + 15);
          this.a(true, this.field_H);
          var5 = 4;
          var6 = 200;
          this.field_y.a(300 - var6 >> 1, var6, (byte) 120, 40, var3);
          this.field_y.field_g = (qg) (this);
          this.a(true, this.field_y);
          this.a(0, 300, (byte) 118, var5 + (var3 + 55), 0);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_E = false;
        field_A = new hl(160, 120);
    }
}
