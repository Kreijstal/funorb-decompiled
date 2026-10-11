/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ql implements jk {
    private kf field_R;

    ii(eg param0, oc param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        w var4 = null;
        try {
          var3 = null;
          if (ri.field_c == param1) {
            var3 = lb.field_a;
          } else {
            if (qg.field_a == param1) {
              this.field_v = this.field_v + 10;
              var3 = pj.field_B;
              if (n.c(-2147483648)) {
                var3 = ge.field_e;
                this.field_v = this.field_v + 20;
              }
            } else {
              if (param1 == sg.field_i) {
                var3 = qj.field_db;
                this.field_v = this.field_v + 30;
              }
            }
          }
          var4 = new w((String) (var3), (vd) null);
          var4.field_j = this.field_j;
          var4.field_v = 80;
          var4.field_t = 0;
          var4.field_o = 50;
          var4.field_i = (rd) ((Object) new ik(cl.field_T, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) 104, var4);
          this.field_R = this.a((vd) (this), true, vk.field_d);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ii.<init>(");
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
          throw ld.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void i(byte param0) {
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (param0 != 124) {
          this.i((byte) -101);
        }
    }

    final static int a(String param0, boolean param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            stackIn_2_0 = 119;
            return stackIn_2_0;
          }
          if (!param1) {
            stackIn_7_0 = pb.field_i.b(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = fb.field_m.b(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ii.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, kf param4) {
        kf discarded$1 = null;
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_R == param4) {
            this.i((byte) 124);
          }
          if (param2 == 215535458) {
            return;
          }
          var7 = (String) null;
          discarded$1 = this.a((vd) null, true, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ii.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final kf a(vd param0, boolean param1, String param2) {
        kf var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        kf stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new kf(param2, param0);
          var4.field_i = (rd) ((Object) new v());
          var5 = this.field_v - 6;
          this.field_v = this.field_v + 38;
          var4.a(30, -30 + this.field_j, param1, var5, 15);
          this.b((byte) 56, var4);
          this.d(59);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ii.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        if (param0) {
          var4 += 4;
        }
        int var5 = 82 % ((-19 - param2) / 41);
        if (param3) {
          var4 += 2;
          if (param1) {
            var4++;
            return jf.field_C[var4];
          }
          return jf.field_C[var4];
        }
        if (!param1) {
          return jf.field_C[var4];
        }
        var4++;
        return jf.field_C[var4];
    }

    static {
    }
}
