/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends jm {
    static kc field_z;
    private vc[] field_q;
    static String field_x;
    static int field_r;
    static kc field_s;
    static String field_v;
    private vc field_t;
    static db field_u;
    static boolean field_w;
    static String field_y;
    static int field_p;

    mj(mj param0, boolean param1) {
        this();
        try {
          param0.a(param1, this, 126);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, qb param1) {
        int var4 = 0;
        vc[] var3 = null;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7 = this.field_q;
          var3 = var7;
          for (var4 = param0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_d = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("mj.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, qb[] param2) {
        int var4_int = 0;
        try {
          var4_int = param1;
          if (null == this.field_q[var4_int]) {
            this.field_q[var4_int] = new vc();
          }
          int var5 = -59 / ((28 - param0) / 32);
          this.field_q[param1].field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "mj.EA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        tm.field_d.a(param1, true);
        if (param0 != -6578) {
          mj.a(-82, true);
        }
    }

    public static void a(byte param0) {
        int var1 = -101 % ((16 - param0) / 59);
        field_z = null;
        field_v = null;
        field_x = null;
        field_y = null;
        field_s = null;
        field_u = null;
    }

    final void a(qb[] param0, int param1) {
        int var4 = 0;
        vc[] var3 = null;
        vc var5 = null;
        int var6 = 0;
        vc[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7 = this.field_q;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_b = param0;
            }
          }
          if (param1 == -23165) {
            return;
          }
          this.field_t = (vc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("mj.GA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, byte param1, byte[] param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -110 % ((54 - param1) / 44);
          stackIn_1_0 = db.a(param0, false, param2, 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mj.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final vc a(byte param0, int param1) {
        vc dupTemp$0 = null;
        if (param0 < -21) {
          dupTemp$0 = new vc();
          this.field_q[param1] = dupTemp$0;
          return dupTemp$0;
        }
        field_s = (kc) null;
        vc dupTemp$1 = new vc();
        this.field_q[param1] = dupTemp$1;
        return dupTemp$1;
    }

    private final void a(boolean param0, mj param1, int param2) {
        int var4_int = 0;
        vc dupTemp$0 = null;
        vc stackIn_11_0 = null;
        vc stackIn_12_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        vc var5 = null;
        vc var6 = null;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          super.a(param1, 1881);
          if (param2 < 113) {
            return;
          }
          if (!param0) {
            sf.a(this.field_q, 0, param1.field_q, 0, 6);
            return;
          }
          for (var4_int = 0; var4_int < 6; var4_int++) {
            var5 = this.field_q[var4_int];
            if (var5 != null) {
              var6 = param1.field_q[var4_int];
              stackIn_11_0 = var5;
              if (var6 == null) {
                dupTemp$0 = new vc();
                param1.field_q[var4_int] = dupTemp$0;
                stackIn_12_1 = dupTemp$0;
              } else {
                stackIn_12_1 = var6;
              }
              ((vc) (Object) stackIn_11_0).a(stackIn_12_1, false);
            } else {
              param1.field_q[var4_int] = null;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("mj.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public mj() {
        this.field_q = new vc[6];
        this.field_t = new vc();
        vc dupTemp$0 = new vc();
        this.field_q[0] = dupTemp$0;
        vc var1 = dupTemp$0;
        var1.a(-17238);
    }

    final static void a(int param0, cg param1, int param2, int param3, dn param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ne var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ArcanistsMulti.a(param2 ^ -26334, (int[]) null, param4, param1.field_Tb, param1.field_Nb, -1, -1, param1.field_Qb, param1);
          eo.field_c.a((byte) 72, true);
          eo.field_c.a(0, (int[]) null, 13);
          eo.field_c.d(param2 + 5549);
          var12 = eo.field_c;
          var8 = param3;
          var9 = param6;
          var10 = param0;
          var11 = param5;
          var12.field_l.a(var10, var11, -29466, var9, var8);
          if (param2 == 3) {
            return;
          }
          mj.a((byte) -95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("mj.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        qm stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        vc var7 = null;
        vc var9 = null;
        qb[] var10 = null;
        ag var11 = null;
        vc var12 = null;
        vc var13 = null;
        vc var14 = null;
        vc var15 = null;
        try {
          if (!(param0 instanceof ag)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (qm) (param0);
          }
          var11 = (ag) (stackIn_3_0);
          if (param1 != 5592405) {
            var10 = (qb[]) null;
            this.a((byte) 33, 29, (qb[]) null);
          }
          da.a(param0.field_v + param0.field_n + param2, param0.field_j + param3 + param0.field_k, 127, param0.field_n + param2, param3 + param0.field_j);
          if (var11 != null) {
            param4 = param4 & var11.field_B;
          }
          var7 = this.field_q[0];
          this.field_t.a(-17238);
          var7.a(param0, param3, this.field_t, this, -2147483648, param2);
          if (var11 != null) {
            if (var11.field_z) {
              var12 = this.field_q[1];
              if (var12 != null) {
                var12.a(param0, param3, this.field_t, this, param1 ^ -2141891243, param2);
              }
            }
            if (var11.field_w) {
              var13 = this.field_q[3];
              if (var11.field_t != 0 &&
                var13 != null) {
                var13.a(param0, param3, this.field_t, this, param1 + 2141891243, param2);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(param0, param3, this.field_t, this, -2147483648, param2);
                }
              }
            }
          }
          if (param0.d(-2116)) {
            var14 = this.field_q[5];
            if (var14 != null) {
              var14.a(param0, param3, this.field_t, this, -2147483648, param2);
            }
          }
          if (!param4) {
            var15 = this.field_q[4];
            if (var15 != null) {
              var15.a(param0, param3, this.field_t, this, param1 + 2141891243, param2);
            }
          }
          this.field_t.a(param3, this, (byte) 110, param0, param2);
          oo.c(-15405);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_29_0 = var6;
          stackIn_29_1 = new StringBuilder().append("mj.A(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_x = "Rechargeable spell";
        field_v = "Loading sound effects";
        field_u = new db();
        field_p = -1;
        field_y = "Win %";
    }
}
