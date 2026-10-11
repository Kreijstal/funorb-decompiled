/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el extends ta implements bf, ai {
    private s field_H;
    static int[] field_A;
    private s field_J;
    we field_I;
    static long field_G;
    private oc field_C;
    static int field_D;
    static long field_F;

    public static void c(boolean param0) {
        if (param0) {
          field_F = 22L;
          field_A = null;
          return;
        }
        field_A = null;
    }

    private final void k(int param0) {
        if (!this.l(30765)) {
          return;
        }
        if (param0 > -39) {
          return;
        }
        qk.a(this.field_C.field_l, (byte) 111);
    }

    private final int a(int param0, pj param1, String param2, int param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        kk var9 = null;
        h var10 = null;
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
          if (param0 < 108) {
            stackIn_2_0 = 63;
            return stackIn_2_0;
          }
          var10 = new h(20, param4, param3 + 120, 25, param1, false, 120, 3, lm.field_f, 16777215, param2);
          this.a(var10, (byte) 74);
          var9 = new kk(((ib) ((Object) param1)).a((byte) -118), param5, 126, var10.field_r + param4, 25 + param3, param6);
          var9.field_h = (ag) (this);
          this.a(var9, (byte) 74);
          stackIn_4_0 = var10.field_r + var9.field_r;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("el.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(byte param0) {
        ((bc) (this.field_C.a((byte) -104))).b((byte) 60);
        if (param0 != -8) {
          this.field_J = (s) null;
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
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
          if (98 == param1) {
            stackIn_6_0 = this.a(param2, false);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.b(param2, false);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("el.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean l(int param0) {
        if (!this.a(20, (ib) (this.field_C))) {
          return false;
        }
        if (param0 == 30765) {
          return true;
        }
        ib var3 = (ib) null;
        boolean discarded$0 = this.a(123, (ib) null);
        return true;
    }

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == this.field_H) {
            sg.k(-16);
          } else {
            if (param3 == this.field_J) {
              this.k(-126);
            }
          }
          var6_int = 45 / ((param0 + 3) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("el.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    public el() {
        super(0, 0, 496, 0, (td) null);
        this.field_C = new oc("", (ag) null, 12);
        jc var1 = new jc(pc.field_bb, 0, 0, 0, 0, 16777215, -1, 3, 0, lm.field_f.field_H, -1, 2147483647, true);
        pj var2 = new pj(rf.field_A, var1, (ag) null);
        this.field_J = new s(qk.field_b, (ag) null);
        this.field_H = new s(ob.field_D, (ag) null);
        this.field_C.field_i = bg.field_b;
        this.field_C.a(new bc(this.field_C), 22);
        this.field_J.field_F = false;
        this.field_J.field_j = (td) ((Object) new vk());
        this.field_H.field_j = (td) ((Object) new qc());
        this.field_C.field_j = (td) ((Object) new fg(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(20, var3, 50, (byte) -90, 270);
        int var5 = 200;
        var3 += 50;
        this.a(var2, (byte) 74);
        var3 = var3 + (5 + this.a(ja.field_b, this.field_C, var3, -53, 170, bh.field_a));
        this.field_J.a(-var5 + 496 >> 1, var3, 40, (byte) -90, var5);
        this.field_H.a(3 + var4, 15 + var3, 40, (byte) -90, 60);
        this.field_H.field_h = (ag) (this);
        this.field_J.field_h = (ag) (this);
        this.a(this.field_J, (byte) 74);
        this.a(this.field_H, (byte) 74);
        this.field_I = new we((bf) (this));
        this.field_I.a(60 + this.field_C.field_m + this.field_C.field_s, 20, 150, (byte) -90, -this.field_C.field_m + this.field_m + (-this.field_C.field_s - 60));
        this.a(this.field_I, (byte) 74);
        this.a(0, 0, var3 + 55 + var4, (byte) -90, 496);
    }

    private final int a(String param0, pj param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
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
          var7_int = 120 % ((param3 + 5) / 42);
          stackIn_1_0 = this.a(122, param1, param5, param4, param2, param0, 35);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("el.G(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, String param1) {
        oc var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_C;
          var4 = param1;
          ((vi) ((Object) var3)).a(0, false, var4);
          if (param0 > 104) {
            return;
          }
          this.field_J = (s) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("el.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final boolean a(int param0, ib param1) {
        ga var3 = null;
        RuntimeException var3_ref = null;
        qd var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) 17);
          if (var3 == null) {
            return true;
          }
          if (param0 != 20) {
            return false;
          }
          var4 = var3.d(-7847);
          stackIn_10_0 = (var4 == nc.field_bb);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("el.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_J.field_F = this.l(30765);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "el.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_A = new int[8192];
    }
}
