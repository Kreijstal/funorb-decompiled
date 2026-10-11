/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends kn implements be, sh {
    static ln field_K;
    private uk field_J;
    static boolean field_M;
    private tn field_L;
    private hc field_I;

    ba(uk param0) {
        super(0, 0, 288, 0, (ad) null);
        String var7 = null;
        int var3 = 0;
        eg var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_J = param0;
          this.field_I = new hc(oh.field_A, (rm) null);
          this.field_I.field_A = (ad) ((Object) new wi());
          var7 = oa.a((byte) -98, tk.field_b, new String[]{this.a(false), this.e((byte) -65)});
          var3 = 20;
          var4 = new eg(bn.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, bn.field_d.field_I, -1, 2147483647, true);
          this.field_L = new tn(var7, var4);
          this.field_L.field_n = "";
          this.field_L.a(-24, 0, wk.field_d);
          this.field_L.a(-100, 1, wk.field_d);
          this.field_L.field_v = -40 + this.field_v;
          this.field_L.field_y = (rm) (this);
          this.field_L.b(26, -40 + this.field_v, 32088, var3);
          var3 = var3 + (15 + this.field_L.field_q);
          this.a(-1, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_I.a(40, -82, -var6 + 300 >> 1, var6, var3);
          this.field_I.field_y = (rm) (this);
          this.a(-1, this.field_I);
          this.a(var5 + var3 + 55, -99, 0, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "ba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String e(byte param0) {
        if (param0 != -65) {
          field_K = (ln) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(tn param0, int param1, int param2, int param3) {
        String discarded$1 = null;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          if (param2 != 12278) {
            discarded$1 = this.a(true);
          }
          if (param3 == 0) {
            qd.a(5, "terms.ws");
            return;
          }
          if (param3 == 1) {
            qd.a(5, "privacy.ws");
            return;
          }
          if (2 != param3) {
            return;
          }
          qd.a(5, "conduct.ws");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ba.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 < 49) {
          field_M = false;
        }
    }

    private final String a(boolean param0) {
        if (param0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param3) {
            stackIn_6_0 = this.b(param1, 0);
            return stackIn_6_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param1, (byte) 12);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ba.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            ba.a((byte) 20);
          }
          if (this.field_I != param2) {
            return;
          }
          pb.d(-94);
          this.field_J.s(2121792);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ba.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(bj param0, bj param1, bj param2, boolean param3, bj param4) {
        di stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        ri var6 = null;
        try {
          ph.field_a = wh.a(param4, "", "md_title_music");
          h.field_d = wh.a(param4, "", "md_game_music");
          df.field_b = wh.a(param4, "", "md_volcano_music");
          eg.field_p = wh.a(param4, "", "md_ice_music");
          hl.field_a = wh.a(param4, "", "md_ice_panic_music");
          al.field_s = wh.a(param4, "", "md_win");
          aa.field_e = wh.a(param4, "", "md_lose");
          var6 = new ri(param0, param1);
          km.field_a.a(false, ph.field_a, var6, 0, param2);
          if (!param3) {
            return;
          }
          km.field_a.a(false, h.field_d, var6, 0, param2);
          stackIn_4_0 = km.field_a;
          stackIn_5_1 = !(param3);
          ((di) (Object) stackIn_4_0).a(stackIn_5_1, df.field_b, var6, 0, param2);
          km.field_a.a(false, eg.field_p, var6, 0, param2);
          km.field_a.a(false, hl.field_a, var6, 0, param2);
          km.field_a.a(false, al.field_s, var6, 0, param2);
          km.field_a.a(false, aa.field_e, var6, 0, param2);
          km.field_a.e(100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("ba.D(");
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
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
    }
}
