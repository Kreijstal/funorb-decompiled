/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends fd implements im, ta {
    private b field_H;
    static String field_K;
    static int field_L;
    static boolean field_J;
    private nk field_D;
    static int field_G;
    private tg field_I;
    static String field_E;

    public static void f(int param0) {
        field_K = null;
        field_E = null;
        if (param0 != -100) {
          field_J = true;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, 94)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.b(2, param0);
            return stackIn_7_0;
          }
          var5_int = -34 % ((param3 + 75) / 36);
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(-16234, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ok.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, e param9, int param10, mg[] param11, int param12, int param13, int param14, int param15, mg[] param16, e param17, mg[] param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          oj.a(param13, new wg(param11), param14, param20, param2, param19, param12, param6, param7, param8, param1, new wg(param16), (byte) -29, param15, param17, param4, param10, param9, param0, new wg(param18), param5);
          if (param3 != -100) {
            ok.f(-30);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("ok.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param17 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param18 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12085) {
            this.field_D = (nk) null;
          }
          if (this.field_I != param1) {
            return;
          }
          ul.a(15429);
          this.field_H.h(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ok.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String a(byte param0) {
        if (param0 < 116) {
          nk var3 = (nk) null;
          this.a(62, -11, false, (nk) null);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    ok(b param0) {
        super(0, 0, 288, 0, (ol) null);
        String var7 = null;
        int var3 = 0;
        aj var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_I = new tg(md.field_c, (cd) null);
          this.field_I.field_w = (ol) ((Object) new hf());
          var7 = oi.a(new String[]{this.a((byte) 125), this.a(-18042)}, gh.field_Kb, 2);
          var3 = 20;
          var4 = new aj(dj.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, dj.field_h.field_H, -1, 2147483647, true);
          this.field_D = new nk(var7, var4);
          this.field_D.field_h = "";
          this.field_D.a(al.field_g, (byte) -100, 0);
          this.field_D.a(al.field_g, (byte) -126, 1);
          this.field_D.field_g = this.field_g - 40;
          this.field_D.field_o = (cd) (this);
          this.field_D.a(-40 + this.field_g, var3, 26, (byte) -125);
          var3 = var3 + (this.field_D.field_m + 15);
          this.a((fi) (this.field_D), (byte) -78);
          var5 = 4;
          var6 = 200;
          this.field_I.a(40, true, var3, -var6 + 300 >> 1, var6);
          this.field_I.field_o = (cd) (this);
          this.a((fi) (this.field_I), (byte) -78);
          this.a(var5 + (55 + var3), true, 0, 0, 300);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(int param0, int param1, boolean param2, nk param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (!param2) {
            field_J = true;
          }
          if (0 == param0) {
            wf.a("terms.ws", 12);
            return;
          }
          if (param0 == 1) {
            wf.a("privacy.ws", 12);
            return;
          }
          if (param0 != 2) {
            return;
          }
          wf.a("conduct.ws", 12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("ok.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void b(boolean param0, int param1) {
        if (param1 == 3410) {
          oi.a(param0, 6);
          cg.a(param0, param1 + 3441);
          return;
        }
        field_E = (String) null;
        oi.a(param0, 6);
        cg.a(param0, param1 + 3441);
    }

    private final String a(int param0) {
        if (param0 != -18042) {
          return (String) null;
        }
        return "</col></u>";
    }

    static {
        field_K = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_E = "<%0> has withdrawn the request to join.";
    }
}
