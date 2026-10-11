/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static String field_g;
    private int field_b;
    private int field_d;
    private int field_f;
    static String field_c;
    static rd field_a;
    private int field_e;

    final static boolean a(long param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        hl var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 95 % ((-83 - param2) / 33);
          var5 = lg.a(param1, (byte) -34);
          if (var5 != null &&
            var5.field_Ib != null) {
            return true;
          }
          stackIn_8_0 = (vu.field_M != null) && (null != hr.a(param0, -77));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("wq.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(wq param0, boolean param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this;
          if (param0 == null) {
            param0 = new wq();
          }
          param0.field_e = ((wq) (var3)).field_e;
          param0.field_b = ((wq) (var3)).field_b;
          if (!param1) {
            wq.a(true, -102, -89, 25, 68, 22, (byte) 122);
          }
          param0.field_d = ((wq) (var3)).field_d;
          param0.field_f = ((wq) (var3)).field_f;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("wq.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, wq param1) {
        int var3_int = Spell.a((long)param1.field_b, (long)this.field_b, -1700635440) - Spell.a((long)param1.field_f, (long)this.field_f, -1700635440) - (Spell.a((long)param1.field_d, (long)this.field_d, -1700635440) + Spell.a((long)param1.field_e, (long)this.field_e, param0 - 1700635441));
        int var4 = Spell.a((long)param1.field_b, (long)this.field_f, -1700635440) + (Spell.a((long)param1.field_f, (long)this.field_b, -1700635440) + Spell.a((long)param1.field_d, (long)this.field_e, -1700635440)) - Spell.a((long)param1.field_e, (long)this.field_d, -1700635440);
        int var5 = Spell.a((long)param1.field_b, (long)this.field_d, -1700635440) - Spell.a((long)param1.field_f, (long)this.field_e, -1700635440) + (Spell.a((long)param1.field_d, (long)this.field_b, -1700635440) + Spell.a((long)param1.field_e, (long)this.field_f, -1700635440));
        this.field_e = Spell.a((long)param1.field_b, (long)this.field_e, param0 - 1700635441) + Spell.a((long)param1.field_f, (long)this.field_d, -1700635440) + (-Spell.a((long)param1.field_d, (long)this.field_f, -1700635440) + Spell.a((long)param1.field_e, (long)this.field_b, -1700635440));
        if (param0 != 1) {
          return;
        }
        try {
          this.field_b = var3_int;
          this.field_d = var5;
          this.field_f = var4;
          this.a(param0 ^ 125);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "wq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        if (param0 <= 65) {
          return;
        }
        int var2 = Spell.a((long)this.field_b, (long)this.field_b, -1700635440) + Spell.a((long)this.field_f, (long)this.field_f, -1700635440) + (Spell.a((long)this.field_d, (long)this.field_d, -1700635440) + Spell.a((long)this.field_e, (long)this.field_e, -1700635440));
        if (var2 < 65535) {
          var2 = so.a(var2, -129);
          this.field_b = ue.a((long)this.field_b, (long)var2, (byte) 97);
          this.field_f = ue.a((long)this.field_f, (long)var2, (byte) 97);
          this.field_d = ue.a((long)this.field_d, (long)var2, (byte) 97);
          this.field_e = ue.a((long)this.field_e, (long)var2, (byte) 97);
          return;
        }
        if (var2 <= 65537) {
          return;
        }
        var2 = so.a(var2, -129);
        this.field_b = ue.a((long)this.field_b, (long)var2, (byte) 97);
        this.field_f = ue.a((long)this.field_f, (long)var2, (byte) 97);
        this.field_d = ue.a((long)this.field_d, (long)var2, (byte) 97);
        this.field_e = ue.a((long)this.field_e, (long)var2, (byte) 97);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        param4 = param4 >> 1;
        int var6 = CombatViewTransition.c(param4, 125);
        int var7 = ld.a((byte) 67, param4);
        this.field_b = var7;
        this.field_f = Spell.a((long)param1, (long)var6, -1700635440);
        this.field_d = Spell.a((long)param3, (long)var6, param0 ^ -1700635393);
        this.field_e = Spell.a((long)param2, (long)var6, -1700635440);
        if (param0 == 47) {
          return;
        }
        String var8 = (String) null;
        wq.a(-48L, (String) null, (byte) -22);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6) {
        String var8 = null;
        String var8Lifetime1;
        if (jj.b((byte) -73)) {
          jt.a(param6 - 32133, param0, param4, param3);
          if (null != tn.field_Z) {
            if (!tn.field_Z.a(param1, (byte) 103, param4, param5, param0)) {
              kd.a(param6 ^ -81, param4, param0);
              wm.a(0, param2, param0);
              param0 = false;
              if (param6 != -83) {
                var8 = (String) null;
                wq.a((String) null, false);
                return param0;
              }
              return param0;
            }
            param0 = false;
            ot.g(76);
          }
          kd.a(param6 ^ -81, param4, param0);
          wm.a(0, param2, param0);
          param0 = false;
        }
        if (param6 == -83) {
          return param0;
        }
        var8Lifetime1 = (String) null;
        wq.a((String) null, false);
        return param0;
    }

    final static void a(String param0, boolean param1) {
        if (!param1) {
          System.out.println("Error: " + dv.a(param0, -87, "%0a", "\n"));
          return;
        }
        String var3 = (String) null;
        wq.a(71L, (String) null, (byte) 79);
        System.out.println("Error: " + dv.a(param0, -87, "%0a", "\n"));
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
        if (param0 != -57) {
          return;
        }
        field_c = null;
    }

    wq() {
        this.field_b = 65536;
    }

    static {
        field_g = "Quick Chat lobby";
        field_c = "ESC - cancel this line";
    }
}
