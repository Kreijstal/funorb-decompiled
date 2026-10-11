/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o implements iq, pj {
    int field_p;
    int field_j;
    int field_i;
    int field_r;
    private int field_h;
    int field_o;
    int field_b;
    int field_g;
    static String field_q;
    private boolean field_d;
    static int field_s;
    static String field_a;
    static bi field_k;
    static String field_m;
    static int field_n;
    int field_f;
    int field_e;
    nq field_c;
    int field_l;

    public final int a(byte param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, true);
          if (param0 != -52) {
            field_q = (String) null;
          }
          stackIn_3_0 = param1.field_j.c(param0 ^ 83) - (-this.field_o - this.field_g);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("o.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3) {
        pl.a(param0, (byte) -26);
        tr.a(param3, param0, param2, param1);
    }

    public final void a(int param0, int param1, int param2, int param3, vg param4) {
        qo var13 = null;
        qo var14 = null;
        int var7 = 0;
        ha var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param2 >= -54) {
          return;
        }
        try {
          if (param4.f(1)) {
            var13 = this.a(param4, true);
            var14 = var13;
            var7 = var14.a((byte) 81, param0);
            var8 = var13.field_d[var7];
            var9 = var14.a(true, param0);
            var10 = this.b((byte) -14, param4, var9, param1);
            var11 = this.a(param3, param4, 68) + Math.max(0, var8.field_e);
            var12 = this.a(param3, param4, -122) + Math.min(this.a(param4, 0), Math.min(var8.field_c, var14.field_d.length > 1 + var7 ? var13.field_d[1 + var7].field_e : var8.field_c));
            ke.a(-6187, param4.field_x + (param1 + param4.field_m), param4.field_n + (param4.field_q + param3), param4.field_q + param3, param1 + param4.field_m);
            qq.field_I.a(var10, -110, var10, this.field_i, var11, var12);
            ln.f((byte) -122);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "o.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final qo a(vg param0, boolean param1) {
        RuntimeException var3 = null;
        qo stackIn_2_0 = null;
        qo stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            stackIn_2_0 = (qo) null;
            return stackIn_2_0;
          }
          if (param0.field_j == null) {
            param0.field_j = (qo) ((Object) new la());
          }
          if (this.field_d) {
            ((la) (param0.field_j)).a(this.b(true, param0), 0, this.field_r, this.field_l, this.a(124, param0), this.a(param0, 0), this.field_c, this.field_j);
          } else {
            this.b((byte) 104, param0);
          }
          stackIn_10_0 = param0.field_j;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("o.KA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, vg param3, boolean param4, int param5) {
        RuntimeException var7 = null;
        vg var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param3, param4);
          if (!param4) {
            var8 = (vg) null;
            this.a(67, 67, -1, 15, (vg) null);
          }
          stackIn_3_0 = param3.field_j.a(-this.b(0, param3, param0) + param1, 3357, param5 - this.a(param2, param3, -78));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("o.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(byte param0, vg param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 65 % ((16 - param0) / 52);
          stackIn_1_0 = param1.field_l + this.field_b + (param1.field_q + (param3 + param2));
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_4_0 = var5;
          stackIn_4_1 = new StringBuilder().append("o.EA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, vg param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ha var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        o var17 = null;
        qo var18 = null;
        qo var19 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == param3) {
            return;
          }
          if (param5.f(1)) {
            var18 = this.a(param5, true);
            var19 = var18;
            if (param0 < param3) {
              var8 = param0;
              var9 = param3;
            } else {
              var9 = param0;
              var8 = param3;
            }
            var10 = var19.a((byte) 120, var8);
            var11 = var19.a((byte) 100, var9);
            ke.a(param4 - 6187, param2 + param5.field_m + param5.field_x, param1 + param5.field_q + param5.field_n, param1 + param5.field_q, param2 + param5.field_m);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var18.field_d[var12];
              if (var12 != var10) {
                stackIn_14_0 = var13.field_b[0];
              } else {
                stackIn_14_0 = var19.a(true, var8);
              }
              var14 = stackIn_14_0;
              if (var12 == var11) {
                stackIn_19_0 = var19.a(true, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_b[var13.field_b.length - 1];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              qq.field_I.a(var15 - var14, this.field_e >>> 24, this.field_e, this.b((byte) -14, param5, var14, param2), var13.field_c, param4 ^ -107, var13.field_e + (param1 + param5.field_q) + (this.field_b + param5.field_l));
            }
            ln.f((byte) -49);
          }
          if (param4 == 0) {
            return;
          }
          var17 = (o) null;
          this.a((o) null, (byte) -38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("o.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void a(int param0, vg param1, int param2, int param3) {
        try {
          this.a(param2, param3, this.field_p, 2, param1, this.field_h, 0, 0);
          int var5_int = 20 / ((param0 - 54) / 41);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "o.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final int a(int param0, vg param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -86 % ((param2 + 15) / 62);
          stackIn_1_0 = this.a((byte) 97, param1, 0, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("o.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          o.a((byte) 47);
          qj.a((byte) -127, 17);
          return;
        }
        qj.a((byte) -127, 17);
    }

    public final int b(int param0, vg param1, int param2) {
        RuntimeException var4 = null;
        vg var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var5 = (vg) null;
            this.a(123, 88, -66, 47, (vg) null);
          }
          stackIn_3_0 = this.b((byte) -14, param1, 0, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("o.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    String b(boolean param0, vg param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = param1.field_s;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("o.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(int param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 114) {
            stackIn_4_0 = param1.field_x - this.field_o - this.field_g;
            return stackIn_4_0;
          }
          stackIn_2_0 = -52;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("o.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        Object stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ve var7 = null;
        ve var8 = null;
        sl var9 = null;
        CharSequence var10 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var10 = (CharSequence) ((Object) param2);
          if (!gb.a((byte) -67, var10)) {
            stackIn_3_0 = tm.field_j;
            return stackIn_3_0;
          }
          if (2 != po.field_b) {
            stackIn_6_0 = ka.field_f;
            return stackIn_6_0;
          }
          var8 = hb.a((byte) -90, param2);
          if (var8 == null) {
            stackIn_9_0 = re.a(us.field_e, 4371, new String[]{param2});
            return stackIn_9_0;
          }
          vd.field_j.b(var8, -9189);
          while (true) {
            var7 = (ve) (vd.field_j.a((byte) -71));
            if (var7 != null) {
              var7.field_zb = var7.field_zb - 1;
              continue;
            }
            break;
          }
          var8.b((byte) -76);
          var8.a(16);
          r.field_c = r.field_c - 1;
          var9 = js.field_f;
          var9.h(param1, 255);
          var9.field_j = var9.field_j + 1;
          if (param0 > -71) {
            o.a((byte) 60);
          }
          var5 = var9.field_j;
          var9.c(1, (byte) -91);
          var9.a(param2, (byte) 0);
          var9.b(var9.field_j - var5, (byte) 122);
          stackIn_16_0 = null;
          return (String) (stackIn_16_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("o.FA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(boolean param0, vg param1) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, param0);
          stackIn_1_0 = param1.field_j.b(438) + (this.field_b + this.field_f);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("o.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void b(byte param0, vg param1) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 49) {
            this.field_p = -125;
          }
          if (param1.field_j == null) {
            param1.field_j = (qo) ((Object) new la());
          }
          var3_int = this.a(120, param1);
          var4 = this.a(param1, 0);
          var6 = this.field_l;
          if (0 != var6) {
            if (var6 != 2) {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (-this.field_c.field_q + (var4 - this.field_c.field_J) >> 1) + this.field_c.field_J;
            } else {
              var5 = var4 - this.field_c.field_q;
            }
          } else {
            var5 = this.field_c.field_J;
          }
          var6Lifetime1 = this.field_r;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_j instanceof la)) {
                return;
              }
              ((la) (param1.field_j)).a(var5, this.b(true, param1), 0, this.field_c, var3_int >> 1);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_j instanceof la)) {
              return;
            }
            ((la) (param1.field_j)).a(108, var5, this.field_c, this.b(true, param1), var3_int);
            return;
          }
          if (param1.field_j instanceof la) {
            ((la) (param1.field_j)).a(this.field_c, var5, -4, this.b(true, param1), 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_35_0 = var3;
          stackIn_35_1 = new StringBuilder().append("o.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2, int param3, vg param4, int param5, int param6, int param7) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param3 != 2) {
            field_s = 115;
          }
          boolean decompiledFrameRemainder0 = true;
          ke.a(-6187, param4.field_m + (param0 + param4.field_x), param4.field_q + (param1 + param4.field_n), param4.field_q + param1, param0 + param4.field_m);
          var9_int = this.a(123, param4);
          var10 = this.a(param4, 0);
          if (this.field_d) {
            this.field_c.a(this.b(true, param4), this.b((byte) -14, param4, param7, param0), this.a((byte) -43, param4, param6, param1), var9_int, var10, param2, param5, this.field_r, this.field_l, this.field_j);
          } else {
            var12 = this.field_l;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = -this.field_c.field_q + var10;
              } else {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = (-this.field_c.field_q - this.field_c.field_J + var10 >> 1) + this.field_c.field_J;
              }
            } else {
              var11 = this.field_c.field_J;
            }
            var12Lifetime1 = this.field_r;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_c.c(this.b(true, param4), (var9_int >> 1) + this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 121, param4, param6, param1), param2, param5);
              } else {
                if ((2 == var12Lifetime1)) {
                  this.field_c.b(this.b(true, param4), var9_int + this.b((byte) -14, param4, param7, param0), this.a((byte) 75, param4, param6, param1) + var11, param2, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_c.d(this.b(true, param4), this.b((byte) -14, param4, param7, param0), var11 + this.a((byte) 100, param4, param6, param1), param2, param5);
            }
          }
          ln.f((byte) -104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("o.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final int b(byte param0, vg param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -14) {
            stackIn_4_0 = param2 + (this.field_o + param1.field_m) + (param3 + param1.field_h);
            return stackIn_4_0;
          }
          stackIn_2_0 = -35;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("o.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
          return this.field_c.field_q + this.field_c.field_J;
        }
        vg var3 = (vg) null;
        this.a(6, 90, 120, (vg) null, false, -78);
        return this.field_c.field_q + this.field_c.field_J;
    }

    public static void a(byte param0) {
        field_q = null;
        if (param0 >= -62) {
          return;
        }
        field_a = null;
        field_k = null;
        field_m = null;
    }

    private final int a(vg param0, int param1) {
        RuntimeException var3 = null;
        vg var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var4 = (vg) null;
            this.a(-5, (vg) null);
          }
          stackIn_3_0 = -this.field_f + param0.field_n - this.field_b;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("o.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        if (null == this.field_c) {
          return;
        }
        try {
          if (param4 != 12) {
            this.field_o = 64;
          }
          this.a(102, param0, param1, param3);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "o.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(o param0, byte param1) {
        try {
          param0.field_o = this.field_o;
          param0.field_c = this.field_c;
          param0.field_e = this.field_e;
          param0.field_l = this.field_l;
          param0.field_r = this.field_r;
          param0.field_b = this.field_b;
          param0.field_f = this.field_f;
          param0.field_g = this.field_g;
          param0.field_d = this.field_d;
          param0.field_h = this.field_h;
          param0.field_j = this.field_j;
          param0.field_i = this.field_i;
          param0.field_p = this.field_p;
          if (param1 != 42) {
            vg var4 = (vg) null;
            this.a(107, -23, -128, -77, 34, (vg) null);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "o.LA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    protected o() {
    }

    o(nq param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_b = param3;
          this.field_l = param8;
          this.field_f = param4;
          this.field_o = param1;
          this.field_c = param0;
          this.field_h = param6;
          this.field_p = param5;
          this.field_d = param12 ? true : false;
          this.field_j = param9;
          this.field_e = param11;
          this.field_r = param7;
          this.field_g = param2;
          this.field_i = param10;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "o.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_m = "Accept";
        field_a = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_n = 3;
        field_q = "Inviting <%0>";
    }
}
