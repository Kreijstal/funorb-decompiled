/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends b implements tma, tsa {
    private lga field_z;
    static String field_A;
    static int field_y;
    static String field_x;
    private rj field_B;
    private rua field_w;
    static int[] field_C;

    final static void b(boolean param0) {
        if (!qga.field_m) {
          throw new IllegalStateException();
        }
        sra.field_t = true;
        jda.a(true, 262144);
        gda.field_c = 0;
        if (!param0) {
          return;
        }
        field_A = (String) null;
    }

    private final String c(int param0) {
        int var2 = 93 % ((21 - param0) / 40);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(lga param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 != 30846) {
            field_y = -37;
          }
          if (0 == param1) {
            gva.a("terms.ws", (byte) -88);
            return;
          }
          if (1 == param1) {
            gva.a("privacy.ws", (byte) -50);
            return;
          }
          if (param1 != 2) {
            return;
          }
          gva.a("conduct.ws", (byte) -118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("pg.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_C = null;
        field_A = null;
        if (param0 != 0) {
          field_y = 58;
          field_x = null;
          return;
        }
        field_x = null;
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 <= 44) {
            this.field_z = (lga) null;
          }
          if (this.field_B != param2) {
            return;
          }
          qr.d(-7694);
          this.field_w.i((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("pg.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    pg(rua param0) {
        super(0, 0, 288, 0, (isa) null);
        String var7 = null;
        int var3 = 0;
        vpa var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_w = param0;
          this.field_B = new rj(aua.field_d, (qc) null);
          this.field_B.field_r = (isa) ((Object) new td());
          var7 = gl.$cfr$intArgs$a$53ce4ab4c593(108, sg.field_q, new String[]{this.c(-58), this.d(-35)});
          var3 = 20;
          var4 = new vpa(mj.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, mj.field_J.field_w, -1, 2147483647, true);
          this.field_z = new lga(var7, var4);
          this.field_z.field_q = "";
          this.field_z.a(sw.field_Fb, 0, 0);
          this.field_z.a(sw.field_Fb, 1, 0);
          this.field_z.field_m = this.field_m - 40;
          this.field_z.field_h = (qc) (this);
          this.field_z.a(var3, (byte) -120, this.field_m - 40, 26);
          var3 = var3 + (this.field_z.field_p + 15);
          this.a(this.field_z, -1);
          var5 = 4;
          var6 = 200;
          this.field_B.a((byte) -31, var6, 40, 300 - var6 >> 1, var3);
          this.field_B.field_h = (qc) (this);
          this.a(this.field_B, -1);
          this.a((byte) -31, 300, var5 + (55 + var3), 0, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String d(int param0) {
        String discarded$0 = null;
        if (param0 >= -12) {
          discarded$0 = this.d(-20);
          return "</col></u>";
        }
        return "</col></u>";
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
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
          if (98 == param2) {
            stackIn_6_0 = this.b(param1, (byte) -125);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.a(param1, (byte) -9);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("pg.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_A = "Hold Shift";
        field_x = "Not yet achieved";
    }
}
