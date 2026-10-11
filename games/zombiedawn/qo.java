/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends vf {
    static int field_s;
    private gj[] field_u;
    private gj field_v;
    static String field_t;
    static af field_w;
    static int[] field_r;
    static boolean field_x;

    final static void c(int param0) {
        if (param0 != 29756) {
          field_s = 56;
        }
    }

    final void a(int param0, vn[] param1, int param2) {
        int var4_int = param2;
        if (param0 != 1) {
          return;
        }
        try {
          if (null == this.field_u[var4_int]) {
            this.field_u[var4_int] = new gj();
          }
          this.field_u[param2].field_t = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "qo.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static int b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          e.field_S.a(nm.field_f, rm.field_b, true, true);
          e.field_S.g(-123);
          if (param0 >= -120) {
            stackIn_3_0 = -36;
            return stackIn_3_0;
          }
          while (on.b(-54)) {
            e.field_S.a(kg.field_i, (byte) 96, lc.field_c);
          }
          if (ba.field_s != -1) {
            var1_int = ba.field_s;
            og.b(-112, -1);
            stackIn_8_0 = var1_int;
            return stackIn_8_0;
          }
          if (ce.field_q) {
            stackIn_12_0 = 3;
            return stackIn_12_0;
          }
          if (vh.field_c == tk.field_a) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!gl.field_E.a(-114)) {
            stackIn_20_0 = 1;
            return stackIn_20_0;
          }
          if (vh.field_c != fk.field_F) {
            return -1;
          }
          stackIn_24_0 = 2;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "qo.D(" + param0 + ')');
        }
    }

    qo(qo param0, boolean param1) {
        this();
        try {
          param0.a((byte) 125, param1, this);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "qo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, vn[] param1) {
        int var4 = 0;
        gj[] var3 = null;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawn.field_J;
        try {
          var7 = this.field_u;
          var3 = var7;
          if (param0 <= 66) {
            field_x = false;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_t = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qo.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, vn[] param2, int param3, vn[] param4, rb param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, rb param18, vn[] param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          if (param9 != -75) {
            field_x = true;
          }
          ig.a(param18, param14, param11, 495, param12, param5, param3, param8, param0, new mf(param19), param15, new mf(param4), param1, new mf(param2), param17, param7, param6, param10, param16, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("qo.HA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param19 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        ga stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        gj var7 = null;
        gj var9 = null;
        an var10 = null;
        gj var11 = null;
        gj var12 = null;
        gj var13 = null;
        gj var14 = null;
        try {
          if (!(param3 instanceof an)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ga) (param3);
          }
          var10 = (an) (stackIn_3_0);
          g.$cfr$intArgs$a$3aedf8649552(param2 + param3.field_j, 99, param3.field_i + (param4 + param3.field_k), param2 - (-param3.field_j - param3.field_n), param3.field_k + param4);
          if (var10 != null) {
            param1 = param1 & var10.field_C;
          }
          var7 = this.field_u[0];
          this.field_v.a(false);
          var7.a(this, param4, param2, (byte) 116, param3, this.field_v);
          if (var10 != null) {
            if (var10.field_x) {
              var11 = this.field_u[1];
              if (var11 != null) {
                var11.a(this, param4, param2, (byte) 116, param3, this.field_v);
              }
            }
            if (var10.field_l) {
              var12 = this.field_u[3];
              if (0 != var10.field_m &&
                var12 != null) {
                var12.a(this, param4, param2, (byte) 116, param3, this.field_v);
              } else {
                var9 = this.field_u[2];
                if (var9 != null) {
                  var9.a(this, param4, param2, (byte) 116, param3, this.field_v);
                }
              }
            }
          }
          if (param3.e(param0 - 16794956)) {
            var13 = this.field_u[5];
            if (var13 != null) {
              var13.a(this, param4, param2, (byte) 116, param3, this.field_v);
            }
          }
          if (param0 != 16777215) {
            this.a((byte) 52, 14);
          }
          if (!param1) {
            var14 = this.field_u[4];
            if (var14 != null) {
              var14.a(this, param4, param2, (byte) 116, param3, this.field_v);
            }
          }
          this.field_v.a(0, param3, param2, this, param4);
          pa.a(-21189);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_31_0 = var6;
          stackIn_31_1 = new StringBuilder().append("qo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param4).append(')').toString());
        }
    }

    final gj a(byte param0, int param1) {
        if (param0 != 73) {
          return (gj) null;
        }
        gj dupTemp$0 = new gj();
        this.field_u[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public qo() {
        this.field_u = new gj[6];
        this.field_v = new gj();
        gj dupTemp$0 = new gj();
        this.field_u[0] = dupTemp$0;
        gj var1 = dupTemp$0;
        var1.a(false);
    }

    private final void a(byte param0, boolean param1, qo param2) {
        int var5 = 0;
        gj dupTemp$0 = null;
        gj stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        gj stackIn_9_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        gj var6 = null;
        gj var7 = null;
        int var8 = 0;
        var8 = ZombieDawn.field_J;
        try {
          super.a(param2, (byte) -95);
          var4_int = 118 / ((param0 - 32) / 58);
          if (param1) {
            for (var5 = 0; 6 > var5; var5++) {
              var6 = this.field_u[var5];
              if (var6 == null) {
                param2.field_u[var5] = null;
              } else {
                var7 = param2.field_u[var5];
                stackIn_8_0 = var6;
                stackIn_8_1 = 33;
                if (var7 != null) {
                  stackIn_9_2 = var7;
                } else {
                  dupTemp$0 = new gj();
                  param2.field_u[var5] = dupTemp$0;
                  stackIn_9_2 = dupTemp$0;
                }
                ((gj) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_9_2);
              }
            }
            return;
          }
          gp.a(this.field_u, 0, param2.field_u, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qo.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void a(vn param0, int param1) {
        int var4 = 0;
        gj[] var3 = null;
        gj var5 = null;
        int var6 = 0;
        gj[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ZombieDawn.field_J;
        try {
          var7 = this.field_u;
          var3 = var7;
          for (var4 = param1; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_x = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("qo.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
          return;
        }
        field_r = null;
        field_t = null;
        field_w = null;
    }

    static {
        field_t = "Type your password again to make sure it's correct";
        field_w = new af();
        field_x = false;
    }
}
