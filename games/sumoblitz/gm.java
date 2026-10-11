/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gm implements mh, de {
    private int field_g;
    int field_d;
    int field_b;
    int field_c;
    private boolean field_i;
    int field_a;
    int field_j;
    int field_k;
    vn field_e;
    int field_m;
    int field_f;
    int field_h;
    int field_l;

    private final int a(int param0, byte param1, pk param2, int param3) {
        RuntimeException var5 = null;
        gm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -120) {
            var6 = (gm) null;
            this.a((gm) null, 108);
          }
          stackIn_3_0 = param3 + (param2.field_v + param0) + this.field_a + param2.field_n;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("gm.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    public final int b(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(-3, param0);
          if (param1 > 65) {
            stackIn_4_0 = param0.field_u.a(true) + this.field_a + this.field_m;
            return stackIn_4_0;
          }
          stackIn_2_0 = 56;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gm.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0) {
        if (param0 != 14763) {
          this.field_k = 25;
        }
        return this.field_e.field_I + this.field_e.field_s;
    }

    public final ag b(int param0, pk param1) {
        RuntimeException var3 = null;
        pk var4 = null;
        ag stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param1.field_u) {
            param1.field_u = (ag) ((Object) new jd());
          }
          if (!this.field_i) {
            this.c(-12731, param1);
          } else {
            ((jd) (param1.field_u)).a((byte) -75, this.field_f, this.field_e, this.a(param1, true), this.a(true, param1), this.field_c, this.field_j, this.a(98, param1));
          }
          if (param0 != -3) {
            var4 = (pk) null;
            this.c(-115, (pk) null);
          }
          stackIn_8_0 = param1.field_u;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void c(int param0, pk param1) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == param1.field_u) {
            param1.field_u = (ag) ((Object) new jd());
          }
          var3_int = this.a(112, param1);
          var4 = this.a(param1, true);
          var6 = this.field_c;
          if (var6 == 0) {
            var5 = this.field_e.field_s;
          } else {
            if (var6 == 2) {
              var5 = var4 - this.field_e.field_I;
            } else {
              if (3 != var6 &&
                var6 == 1) {
              }
              var5 = this.field_e.field_s + (-this.field_e.field_I + (var4 - this.field_e.field_s) >> 1);
            }
          }
          if (param0 != -12731) {
            this.field_l = 96;
          }
          var6Lifetime1 = this.field_f;
          if (var6Lifetime1 != 0 &&
            3 != var6Lifetime1) {
            if (1 == var6Lifetime1) {
              if (!(param1.field_u instanceof jd)) {
                return;
              }
              ((jd) (param1.field_u)).a(var5, this.field_e, param0 ^ -12762, this.a(true, param1), var3_int >> 1);
              return;
            }
            if (var6Lifetime1 != 2) {
              return;
            }
            if (!(param1.field_u instanceof jd)) {
              return;
            }
            ((jd) (param1.field_u)).a(this.field_e, var5, var3_int, this.a(true, param1), (byte) 79);
            return;
          }
          if (param1.field_u instanceof jd) {
            ((jd) (param1.field_u)).a(this.field_e, var5, this.a(true, param1), 0, (byte) -36);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("gm.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public final int a(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.b(param1 - 86, param0);
          if (param1 == 83) {
            stackIn_4_0 = param0.field_u.a((byte) -18) + this.field_k + this.field_h;
            return stackIn_4_0;
          }
          stackIn_2_0 = -86;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gm.T(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int b(int param0, pk param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 0) {
            stackIn_4_0 = this.a(param0, (byte) -124, param1, 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -83;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("gm.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(pk param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        pk var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var4 = (pk) null;
            discarded$1 = this.a((pk) null, false);
          }
          stackIn_3_0 = param0.field_p + (-this.field_a - this.field_m);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, pk param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 87) {
            this.field_f = 57;
          }
          stackIn_3_0 = -this.field_h + (param1.field_q - this.field_k);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int discarded$0 = 0;
        if (null == this.field_e) {
          return;
        }
        try {
          this.a(param0, false, param4, param1);
          if (param2 != 5592405) {
            pk var7 = (pk) null;
            discarded$0 = this.a(-115, (pk) null, -70, -20);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    String a(boolean param0, pk param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.field_g = -106;
          }
          stackIn_3_0 = param1.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, pk param4) {
        int var7 = 0;
        tk var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pk var13 = null;
        ag var14 = null;
        ag var15 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4.d(param0 ^ -2)) {
            var14 = this.b(-3, param4);
            var15 = var14;
            var7 = var15.b(param3, -17500);
            var8 = var14.field_a[var7];
            var9 = var15.a((byte) 113, param3);
            var10 = this.a(-3, param4, var9, param1);
            var11 = this.b(param2, param4, 0) + Math.max(0, var8.field_d);
            stackIn_4_0 = this.b(param2, param4, 0);
            stackIn_4_1 = this.a(param4, true);
            stackIn_4_2 = var8.field_a;
            if (var15.field_a.length <= var7 + 1) {
              stackIn_5_3 = var8.field_a;
            } else {
              stackIn_5_3 = var14.field_a[1 + var7].field_d;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            kw.a(param4.field_p + (param4.field_v + param2), param2 + param4.field_v, 1, param4.field_r + param1, param4.field_r + param1 + param4.field_q);
            ks.field_x.a(this.field_b, var10, false, var10, var12, var11);
            su.a((byte) 116);
          }
          if (param0 != 1) {
            var13 = (pk) null;
            this.a(-62, -56, -29, -84, (pk) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("gm.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(gm param0, int param1) {
        try {
          param0.field_a = this.field_a;
          param0.field_g = this.field_g;
          param0.field_m = this.field_m;
          param0.field_d = this.field_d;
          param0.field_e = this.field_e;
          param0.field_b = this.field_b;
          int var3_int = 72 % ((21 - param1) / 46);
          param0.field_i = this.field_i;
          param0.field_h = this.field_h;
          param0.field_j = this.field_j;
          param0.field_l = this.field_l;
          param0.field_c = this.field_c;
          param0.field_k = this.field_k;
          param0.field_f = this.field_f;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gm.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    gm(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, pk param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -3) {
            stackIn_4_0 = param1.field_s + (this.field_k + param3) + param1.field_r + param2;
            return stackIn_4_0;
          }
          stackIn_2_0 = 46;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("gm.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, pk param4, int param5) {
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        tk var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ag var17 = null;
        ag var18 = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param1 == param3) {
            return;
          }
          if (param2 != 0) {
            return;
          }
          if (param4.d(-1)) {
            var17 = this.b(param2 ^ -3, param4);
            var18 = var17;
            if (param3 > param1) {
              var8 = param1;
              var9 = param3;
            } else {
              var8 = param3;
              var9 = param1;
            }
            var10 = var18.b(var8, param2 ^ -17500);
            var11 = var18.b(var9, -17500);
            kw.a(param4.field_p + (param4.field_v + param5), param4.field_v + param5, 1, param4.field_r + param0, param4.field_q + (param0 + param4.field_r));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.field_a[var12];
              if (var10 != var12) {
                stackIn_14_0 = var13.field_b[0];
              } else {
                stackIn_14_0 = var18.a((byte) 118, var8);
              }
              var14 = stackIn_14_0;
              if (var12 == var11) {
                stackIn_19_0 = var18.a((byte) 125, var9);
              } else {
                if (var13 != null) {
                  stackIn_19_0 = var13.field_b[-1 + var13.field_b.length];
                } else {
                  stackIn_19_0 = 0;
                }
              }
              var15 = stackIn_19_0;
              ks.field_x.a(this.field_l >>> 24, param2 + 3, var13.field_a, this.field_l, this.a(-3, param4, var14, param0), var15 - var14, param4.field_n + (this.field_a + param4.field_v + param5) + var13.field_d);
            }
            su.a((byte) 86);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("gm.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(')').toString());
        }
    }

    public final int a(int param0, pk param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -4059) {
            stackIn_2_0 = 115;
            return stackIn_2_0;
          }
          this.b(param4 ^ 4056, param1);
          stackIn_4_0 = param1.field_u.a(param3 - this.b(param5, param1, 0), -this.a(param0, param1, 16098) + param2, param4 + 4166);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("gm.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(pk param0, boolean param1, int param2, int param3) {
        try {
          this.a(param0, param2, this.field_d, param3, 0, this.field_g, (byte) 104, 0);
          if (param1) {
            pk var6 = (pk) null;
            this.a(false, (pk) null);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gm.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(pk param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param6 <= 73) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          kw.a(param0.field_p + (param3 + param0.field_v), param0.field_v + param3, 1, param0.field_r + param1, param0.field_q + param0.field_r + param1);
          var9_int = this.a(95, param0);
          var10 = this.a(param0, true);
          if (!this.field_i) {
            var12 = this.field_c;
            if (var12 != 0) {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 == 1) {
                }
                var11 = (-this.field_e.field_s + var10 - this.field_e.field_I >> 1) + this.field_e.field_s;
              } else {
                var11 = var10 - this.field_e.field_I;
              }
            } else {
              var11 = this.field_e.field_s;
            }
            var12Lifetime1 = this.field_f;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_e.a(this.a(true, param0), (var9_int >> 1) + this.a(-3, param0, param7, param1), var11 + this.a(param3, (byte) -121, param0, param4), param2, param5);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_e.c(this.a(true, param0), this.a(-3, param0, param7, param1) + var9_int, var11 + this.a(param3, (byte) -123, param0, param4), param2, param5);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_e.b(this.a(true, param0), this.a(-3, param0, param7, param1), var11 + this.a(param3, (byte) -124, param0, param4), param2, param5);
            }
          } else {
            this.field_e.a(this.a(true, param0), this.a(-3, param0, param7, param1), this.a(param3, (byte) -122, param0, param4), var9_int, var10, param2, param5, this.field_f, this.field_c, this.field_j);
          }
          su.a((byte) 63);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("gm.AA(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public final int a(int param0, pk param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 16098) {
            this.field_c = 32;
          }
          stackIn_3_0 = this.a(-3, param1, 0, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("gm.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    protected gm() {
    }

    gm(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_d = param5;
          this.field_j = param9;
          this.field_l = param11;
          this.field_b = param10;
          this.field_c = param8;
          this.field_m = param4;
          this.field_g = param6;
          this.field_e = param0;
          this.field_f = param7;
          this.field_a = param3;
          this.field_h = param2;
          this.field_i = param12 ? true : false;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
    }
}
