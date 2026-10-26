/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends ab implements bh, dn {
    private mi field_v;
    static IntrusiveDeque field_z;
    ek field_t;
    private kk field_w;
    static int[] field_u;
    private mi field_y;
    static String field_x;

    private final int a(ea param0, int param1, int param2, byte param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 > 63) {
            stackIn_4_0 = this.a(param4, 126, param2, param0, 35, param5, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = -73;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("ep.CA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public ep() {
        super(0, 0, 496, 0, (ir) null);
        this.field_w = new kk("", (no) null, 12);
        qm var1 = new qm(oi.field_c, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.maxAscent, -1, 2147483647, true);
        ea var2 = new ea(ta.field_f, var1, (no) null);
        this.field_v = new mi(SmokeParticle.field_k, (no) null);
        this.field_y = new mi(dd.field_d, (no) null);
        this.field_w.field_k = ht.field_e;
        this.field_w.a(new mp(this.field_w), 1472);
        this.field_v.field_u = false;
        this.field_v.field_e = (ir) ((Object) new qb());
        this.field_y.field_e = (ir) ((Object) new wg());
        this.field_w.field_e = (ir) ((Object) new sl(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(50, 20, var3, 270, (byte) 124);
        var3 += 50;
        this.a(var2, 1);
        var3 = var3 + (5 + this.a(this.field_w, 170, var3, (byte) 107, es.field_g, sc.field_b));
        this.field_v.a(40, -var5 + 496 >> 1, var3, var5, (byte) 126);
        this.field_y.a(40, 3 + var4, var3 + 15, 60, (byte) 125);
        this.field_y.field_o = (no) (this);
        this.field_v.field_o = (no) (this);
        this.a(this.field_v, 1);
        this.a(this.field_y, 1);
        this.field_t = new ek((bh) (this));
        this.field_t.a(150, this.field_w.field_q + this.field_w.field_p + 60, 20, -60 - this.field_w.field_q + (-this.field_w.field_p + this.field_q), (byte) 124);
        this.a(this.field_t, 1);
        this.a(var4 + 55 + var3, 0, 0, 496, (byte) 126);
    }

    public final void a(byte param0) {
        if (param0 == -77) {
          ((mp) (this.field_w.a(0))).e(-104);
          return;
        }
        boolean discarded$0 = this.h(-43);
        ((mp) (this.field_w.a(0))).e(-104);
    }

    private final void d(byte param0) {
        if (!this.h(25)) {
          return;
        }
        int var2 = 9 % ((param0 + 69) / 49);
        GameCanvas.a(true, this.field_w.field_f);
    }

    private final int a(String param0, int param1, int param2, ea param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        kb var9 = null;
        bc var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new bc(20, param2, 120 + param6, 25, param3, false, 120, 3, qo.field_b, 16777215, param0);
          this.a(var10, param1 - 125);
          var9 = new kb(((mc) ((Object) param3)).a(0), param5, param1, param2 + var10.field_n, 25 + param6, param4);
          var9.field_o = (no) (this);
          this.a(var9, 1);
          stackIn_1_0 = var9.field_n + var10.field_n;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("ep.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(')').toString());
        }
    }

    private final boolean a(int param0, mc param1) {
        sp var3 = null;
        RuntimeException var3_ref = null;
        pt var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a(param0);
          if (var3 == null) {
            return true;
          }
          var4 = var3.b(true);
          stackIn_7_0 = (var4 == fd.field_a);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("ep.HA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 0) {
          return;
        }
        hg.a(param0, true, false);
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(108, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.b(param3, -72);
            return stackIn_7_0;
          }
          var5_int = 42 / ((param0 + 53) / 33);
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(80, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ep.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_x = null;
        field_u = null;
        int var1 = -64 / ((param0 - 42) / 44);
        field_z = null;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        try {
          if (param0 <= 13) {
            this.field_y = (mi) null;
          }
          super.a((byte) 103, param1, param2, param3);
          this.field_v.field_u = this.h(25);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ep.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void a(String param0, int param1) {
        boolean discarded$1 = false;
        kk var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_w;
          var4 = param0;
          ((bm) ((Object) var3)).a(-20975, var4, false);
          if (param1 == 10000536) {
            return;
          }
          discarded$1 = this.h(50);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("ep.W(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean h(int param0) {
        if (param0 != 25) {
          field_z = (IntrusiveDeque) null;
          if (this.a(0, (mc) (this.field_w))) {
            return true;
          }
          return false;
        }
        if (this.a(0, (mc) (this.field_w))) {
          return true;
        }
        return false;
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        try {
          if (param1 == this.field_y) {
            ua.e(4754);
          } else {
            if (this.field_v == param1) {
              this.d((byte) -128);
            }
          }
          int var6_int = 96 % ((param4 + 27) / 61);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ep.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_u = new int[8192];
        field_z = new IntrusiveDeque();
    }
}
