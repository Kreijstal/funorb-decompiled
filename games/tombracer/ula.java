/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ula extends nv {
    static String field_t;
    private int field_s;
    private int field_r;
    private up field_p;
    private kpa field_x;
    private int field_o;
    static boolean field_w;
    static su field_v;
    private int field_n;
    private kpa field_q;
    private int field_u;

    final int a(int param0, up param1, pc param2) {
        RuntimeException var4 = null;
        pc var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -85) {
            var5 = (pc) null;
            this.a(102, (up) null, (pc) null);
          }
          stackIn_3_0 = this.a(param1, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ula.S(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param2 < this.field_u) {
          return false;
        }
        if (param0 < 16) {
          return true;
        }
        if (this.field_x.a(0, param1)) {
          return true;
        }
        return false;
    }

    final int a(int param0, ep param1, up param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25940) {
            this.a(false);
          }
          stackIn_3_0 = this.a(param2, (byte) -115);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ula.BC(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
          return 57;
        }
        param0 = fs.a((byte) 122, param0, this.field_s);
        return param0;
    }

    final int a(boolean param0) {
        if (param0) {
          pc var3 = (pc) null;
          this.a(-90, (up) null, (pc) null);
        }
        return 31;
    }

    ula(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_x = new kpa(6, param0.field_E, param1);
          this.field_q = new kpa(6, param0.field_E, param1);
          this.field_u = param1.b((byte) 44, 8);
          this.field_o = param1.b((byte) 44, 8);
          this.field_r = param1.b((byte) 44, 8);
          this.field_p = ad.a((byte) 87, param1);
          this.field_n = param1.b((byte) 44, 8) << 16;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ula.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, fsa param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          super.a(param0, param1);
          param1.b((byte) -112, 4);
          if (!param0) {
            this.field_x = (kpa) null;
          }
          for (var3_int = 0; var3_int < 6; var3_int++) {
            if (this.field_x.a(0, var3_int) ||
              this.field_q.a(0, var3_int)) {
              param1.a(26492, true, var3_int);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("ula.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_v = null;
        field_t = null;
        if (param0 != 42) {
          field_t = (String) null;
        }
    }

    private final void j(byte param0) {
        up var2 = new up(this.e(6), this.field_p);
        if (param0 != -67) {
          this.field_q = (kpa) null;
        }
        this.b(true).a(124, this.field_g.e(param0 ^ -9715), var2, this.field_g.a((byte) 55) + this.field_n * 2, this.field_g.c(-107) + 2 * this.field_n, this.field_g.d(3));
        this.c(false);
    }

    final void a(boolean param0, kh param1) {
        try {
          super.a(param0, param1);
          this.field_x.a(param1, (byte) -118);
          this.field_q.a(param1, (byte) -117);
          param1.a((byte) -11, this.field_u, 8);
          param1.a((byte) 42, this.field_o, 8);
          param1.a((byte) 125, this.field_r, 8);
          this.field_p.a(param1, (byte) 125);
          param1.a((byte) 127, this.field_n >> 16, 8);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ula.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        if (param1 < this.field_o) {
          return false;
        }
        if (!this.field_q.a(0, param2)) {
          return false;
        }
        if (!param0) {
          this.field_p = (up) null;
          return true;
        }
        return true;
    }

    private final int a(up param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -115) {
            this.field_x = (kpa) null;
          }
          var3_int = param0.field_j;
          var4 = param0.field_b;
          if (!this.b(8) &&
            this.a(113, var3_int, var4)) {
            if (this.field_r > 0) {
              this.field_s = this.field_r;
            } else {
              this.j((byte) -67);
            }
          }
          if (this.b(8)) {
            if (!this.a(true, var4, var3_int)) {
              return 0;
            }
            this.field_s = 0;
          }
          stackIn_12_0 = 0;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ula.V(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean k(byte param0) {
        int var1 = -55 / ((-52 - param0) / 59);
        return uja.field_a.a(false);
    }

    final void k(int param0) {
        int discarded$0 = 0;
        if (param0 != 5418) {
          up var3 = (up) null;
          discarded$0 = this.a((up) null, (byte) -1);
        }
        if (this.field_s > 0) {
          this.field_s = this.field_s - 1;
          if (this.field_s == 0) {
            this.j((byte) -67);
          }
        }
    }

    private final boolean b(int param0) {
        int discarded$0 = 0;
        if (param0 != 8) {
          up var3 = (up) null;
          discarded$0 = this.a((up) null, (byte) -80);
        }
        return 0 != this.field_s ? true : false;
    }

    final int a(int param0, int param1, up param2, int param3, byte param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7_int = -62 / ((62 - param4) / 52);
          stackIn_1_0 = this.a(param2, (byte) -115);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_4_0 = var7;
          stackIn_4_1 = new StringBuilder().append("ula.UB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_t = "One Player Puzzle";
        field_v = new su(1, 2, 2, 0);
    }
}
