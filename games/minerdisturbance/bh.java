/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends wf implements sh {
    static char[] field_db;
    private hc field_eb;
    static volatile boolean field_cb;
    static ae field_bb;
    static String field_ab;
    static lm field_Z;

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 6) {
            return;
          }
          if (this.field_eb != param2) {
            return;
          }
          this.r(2738);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_Z = null;
        field_db = null;
        field_bb = null;
        if (param0 < 64) {
          field_ab = (String) null;
          field_ab = null;
          return;
        }
        field_ab = null;
    }

    private final hc a(String param0, byte param1, rm param2) {
        hc var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hc stackIn_2_0 = null;
        hc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hc(param0, param2);
          var4.field_A = (ad) ((Object) new wi());
          var5 = -6 + this.field_q;
          this.field_q = this.field_q + 38;
          if (param1 != 62) {
            stackIn_2_0 = (hc) null;
            return stackIn_2_0;
          }
          var4.a(30, -113, 15, -16 + (this.field_v - 14), var5);
          this.a(-1, var4);
          this.i(-5257);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("bh.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static vm a(byte param0, byte[] param1) {
        vm var2 = null;
        RuntimeException var2_ref = null;
        vm stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        vm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 78) {
            stackIn_2_0 = (vm) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return (vm) (stackIn_5_0);
          }
          var2 = new vm(param1, bg.field_d, oc.field_e, qk.field_b, ng.field_e, db.field_b);
          ec.a((byte) 106);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("bh.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1 = 120 % ((param0 + 7) / 60);
        kh.field_a = null;
        pk.field_a = null;
    }

    private final void r(int param0) {
        if (!this.field_K) {
          return;
        }
        if (param0 == 2738) {
          this.field_K = false;
          return;
        }
        byte[] var3 = (byte[]) null;
        bh.a((byte) 29, (byte[]) null);
        this.field_K = false;
    }

    final static String a(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -110 / ((-64 - param1) / 54);
          stackIn_1_0 = ph.a((byte) 41, param0.length, param0, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("bh.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(uj param0, byte param1) {
        int var4 = 0;
        int var2_int = ii.field_b.c((byte) 66);
        int var3 = var2_int / 12;
        if (param1 != -115) {
          sb var5 = (sb) null;
          bh.a((sb) null, -119);
        }
        if (4 <= var3) {
          return;
        }
        try {
          var4 = var2_int + (1 - var3 * 12);
          ii.field_b.a((byte) -105, new tc(param0, var3, var4));
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "bh.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(sb param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -29320) {
            field_db = (char[]) null;
          }
          var2_int = param0.d((byte) -54);
          stackIn_5_0 = (var2_int == 1) ? 1 : 0;
          var3 = stackIn_5_0;
          stackIn_6_0 = var3;
          return stackIn_6_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bh.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    bh(hm param0, r param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        fe var4 = null;
        try {
          var3 = null;
          if (param1 == nn.field_r) {
            var3 = pn.field_d;
          } else {
            if (od.field_k != param1) {
              if (param1 == ge.field_a) {
                var3 = cn.field_F;
                this.field_q = this.field_q + 30;
              }
            } else {
              var3 = ri.field_f;
              this.field_q = this.field_q + 10;
              if (an.c(0)) {
                this.field_q = this.field_q + 20;
                var3 = on.field_s;
              }
            }
          }
          var4 = new fe((String) (var3), (rm) null);
          var4.field_u = 0;
          var4.field_v = this.field_v;
          var4.field_t = 50;
          var4.field_q = 80;
          var4.field_A = (ad) ((Object) new eg(sl.field_q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a(-1, var4);
          this.field_eb = this.a(ed.field_f, (byte) 62, (rm) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("bh.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw lj.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_db = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_cb = true;
        field_bb = new ae();
        field_ab = "Ranking: Ice Breaker";
    }
}
