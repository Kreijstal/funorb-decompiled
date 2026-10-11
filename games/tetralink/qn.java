/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends al {
    static je field_t;
    private dg field_u;
    private dg[] field_q;
    static int[] field_s;
    static hl field_r;
    static String field_v;

    final static void a(boolean param0, byte[] param1, byte[] param2, String[][] param3, oh[][] param4, boolean param5, oh[][] param6, String[][] param7, ah param8, ah param9, int[] param10, int param11, int param12, String[] param13, ah param14) {
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
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        kh[] var16 = null;
        int[] var17 = null;
        try {
          var17 = (int[]) null;
          var16 = (kh[]) null;
          c.a(param6, param2, param14, (byte) -35, param1, param7, (int[]) null, param12, param3, param10, param13, param9, param8, (kh[]) null, param5, param11, param4);
          if (param0) {
            qn.a(-32);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("qn.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param7 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param9 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param10 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param11).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void a(qn param0, byte param1, boolean param2) {
        int var4_int = 0;
        dg dupTemp$0 = null;
        dg stackIn_10_0 = null;
        dg stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        dg var5 = null;
        dg var6 = null;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          if (param1 < 28) {
            return;
          }
          super.a(0, param0);
          if (param2) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_q[var4_int];
              if (var5 == null) {
                param0.field_q[var4_int] = null;
              } else {
                var6 = param0.field_q[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new dg();
                  param0.field_q[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((dg) (Object) stackIn_10_0).a(stackIn_11_1, -73);
              }
            }
            return;
          }
          rd.a(this.field_q, 0, param0.field_q, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qn.P(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_v = null;
        field_t = null;
        if (param0 != 24468) {
          qn.a(-59);
        }
    }

    final void a(oh[] param0, int param1) {
        int var4 = 0;
        dg[] var3 = null;
        dg var5 = null;
        int var6 = 0;
        qn var7 = null;
        dg[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TetraLink.field_J;
        try {
          if (param1 >= -31) {
            var7 = (qn) null;
            this.a((qn) null, (byte) -119, true);
          }
          var8 = this.field_q;
          var3 = var8;
          for (var4 = 0; var8.length > var4; var4++) {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_k = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qn.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, oh[] param2) {
        int var4_int = param0;
        if (null == this.field_q[var4_int]) {
          this.field_q[var4_int] = new dg();
        }
        if (param1 != -1664329560) {
          return;
        }
        try {
          this.field_q[param0].field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "qn.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        na stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        dg var7 = null;
        dg var9 = null;
        ae var10 = null;
        dg var11 = null;
        dg var12 = null;
        dg var13 = null;
        dg var14 = null;
        try {
          if (!(param0 instanceof ae)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (na) (param0);
          }
          var10 = (ae) (stackIn_3_0);
          kl.a(param0.field_F + param0.field_t + param1, param2 + (param0.field_w + param0.field_u), param0.field_w + param2, (byte) -79, param0.field_t + param1);
          if (var10 != null) {
            param4 = param4 & var10.field_K;
          }
          var7 = this.field_q[0];
          this.field_u.a(30033);
          var7.a(param2, param0, this.field_u, param3, param1, this);
          if (!param3) {
            return;
          }
          if (var10 != null) {
            if (var10.field_N) {
              var11 = this.field_q[1];
              if (var11 != null) {
                var11.a(param2, param0, this.field_u, true, param1, this);
              }
            }
            if (var10.field_r) {
              var12 = this.field_q[3];
              if (var10.field_x != 0 &&
                var12 != null) {
                var12.a(param2, param0, this.field_u, param3, param1, this);
              } else {
                var9 = this.field_q[2];
                if (var9 != null) {
                  var9.a(param2, param0, this.field_u, param3, param1, this);
                }
              }
            }
          }
          if (param0.c(3)) {
            var13 = this.field_q[5];
            if (var13 != null) {
              var13.a(param2, param0, this.field_u, true, param1, this);
            }
          }
          if (!param4) {
            var14 = this.field_q[4];
            if (var14 != null) {
              var14.a(param2, param0, this.field_u, param3, param1, this);
            }
          }
          this.field_u.a(46, param2, param1, this, param0);
          dh.a(-581);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("qn.L(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        bf var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        bf var2Lifetime1;
        var3 = TetraLink.field_J;
        try {
          wb.field_c = param0;
          if (param1 != 128) {
            return;
          }
          var2 = (bf) (ha.field_b.c(false));
          while (var2 != null) {
            if (var2.field_q.a((byte) 95)) {
              var2.field_t.f(128 + var2.field_u * wb.field_c >> 8);
            } else {
              var2.b(false);
            }
            var2 = (bf) (ha.field_b.a((byte) -70));
          }
          if (gi.field_d != null) {
            var2Lifetime1 = (bf) (gi.field_d.c(false));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_q.a((byte) 95);
              if (!stackIn_14_0) {
                var2Lifetime1.b(false);
              } else {
                var2Lifetime1.field_t.f(128 + wb.field_c * var2Lifetime1.field_u >> 8);
              }
              var2Lifetime1 = (bf) (gi.field_d.a((byte) -70));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var2_ref), "qn.M(" + param0 + ',' + param1 + ')');
        }
    }

    qn(qn param0, boolean param1) {
        this();
        try {
          param0.a(this, (byte) 52, param1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(oh param0, byte param1) {
        int var4 = 0;
        dg[] var3 = null;
        dg var5 = null;
        int var6 = 0;
        dg[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TetraLink.field_J;
        try {
          var7 = this.field_q;
          var3 = var7;
          if (param1 != 71) {
            field_r = (hl) null;
          }
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_n = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("qn.O(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public qn() {
        this.field_q = new dg[6];
        this.field_u = new dg();
        dg dupTemp$0 = new dg();
        this.field_q[0] = dupTemp$0;
        dg var1 = dupTemp$0;
        var1.a(30033);
    }

    final dg a(byte param0, int param1) {
        if (param0 != -41) {
          return (dg) null;
        }
        dg dupTemp$0 = new dg();
        this.field_q[param1] = dupTemp$0;
        return dupTemp$0;
    }

    static {
        field_t = new je();
        field_s = new int[]{2};
        field_v = "Set up new game";
    }
}
