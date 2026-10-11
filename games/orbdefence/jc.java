/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jc implements td, rj {
    int field_d;
    private boolean field_e;
    static String field_n;
    int field_r;
    int field_i;
    int field_p;
    kc field_g;
    int field_q;
    static int[][] field_f;
    private int field_l;
    int field_s;
    static long field_o;
    int field_m;
    static hj field_k;
    int field_t;
    int field_h;
    static boolean field_b;
    int field_c;
    static df field_a;
    static boolean field_j;

    private final void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, pj param7) {
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
        jc var14 = null;
        int var12Lifetime1;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          id.a(param7.field_m + param7.field_s + param2, param7.field_s + param2, param6 + param7.field_n + param7.field_r, param6 + param7.field_n, 734);
          var9_int = this.a(param7, -125);
          var10 = this.d(param7, false);
          if (!this.field_e) {
            var12 = this.field_c;
            if (var12 != 0) {
              if (var12 == 2) {
                var11 = var10 - this.field_g.field_B;
              } else {
                if (3 != var12 &&
                  var12 != 1) {
                }
                var11 = this.field_g.field_H + (-this.field_g.field_B + (var10 - this.field_g.field_H) >> 1);
              }
            } else {
              var11 = this.field_g.field_H;
            }
            var12Lifetime1 = this.field_h;
            if (var12Lifetime1 != 0 &&
              var12Lifetime1 != 3) {
              if (var12Lifetime1 == 1) {
                this.field_g.c(this.a((byte) -95, param7), (var9_int >> 1) + this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -120, param0) + var11, param5, param3);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.field_g.a(this.a((byte) -95, param7), this.a(param2, 5, param7, param1) + var9_int, this.a(param6, param7, (byte) -122, param0) + var11, param5, param3);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_g.b(this.a((byte) -95, param7), this.a(param2, 5, param7, param1), var11 + this.a(param6, param7, (byte) -120, param0), param5, param3);
            }
          } else {
            this.field_g.a(this.a((byte) -95, param7), this.a(param2, 5, param7, param1), this.a(param6, param7, (byte) -125, param0), var9_int, var10, param5, param3, this.field_h, this.field_c, this.field_t);
          }
          oc.g((byte) -105);
          if (param4 < 27) {
            var14 = (jc) null;
            this.a((byte) 21, (jc) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("jc.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final int b(pj param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, param1);
          stackIn_1_0 = param0.field_g.b(118) + this.field_r + this.field_q;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("jc.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(pj param0, int param1, int param2) {
        RuntimeException var4 = null;
        pj var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9534) {
            var5 = (pj) null;
            this.a(-127, -37, (pj) null, 88, -84, 86);
          }
          stackIn_3_0 = this.a(param2, param0, (byte) -124, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jc.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(mg param0, int param1, int param2, byte[] param3, int param4, java.math.BigInteger param5, java.math.BigInteger param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var7_int = ek.a(param4, 7);
          if (dd.field_D == null) {
            dd.field_D = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = dd.field_D.nextInt();
          }
          if (s.field_C == null ||
            !(var7_int <= s.field_C.field_j.length)) {
            s.field_C = new mg(var7_int);
          }
          s.field_C.field_i = 0;
          s.field_C.a(param2, param4, (byte) -11, param3);
          s.field_C.d((byte) -115, var7_int);
          s.field_C.a(var13, -87);
          if (param1 < 24) {
            return;
          }
          if (vd.field_a == null ||
            !(vd.field_a.field_j.length >= 100)) {
            vd.field_a = new mg(100);
          }
          vd.field_a.field_i = 0;
          vd.field_a.a(10, -64);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            vd.field_a.b(var13[var11], -1);
            var11++;
          }
          vd.field_a.b((byte) -60, param4);
          vd.field_a.a(param5, param6, 27551);
          param0.a(0, vd.field_a.field_i, (byte) -11, vd.field_a.field_j);
          param0.a(0, s.field_C.field_i, (byte) -11, s.field_C.field_j);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("jc.T(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public final dm a(pj param0, boolean param1) {
        RuntimeException var3 = null;
        dm stackIn_4_0 = null;
        bd stackIn_9_0;
        int stackIn_9_1;
        String stackIn_9_2;
        int stackIn_9_3;
        kc stackIn_9_4;
        int stackIn_9_5;
        Object stackIn_9_6;
        pj stackIn_9_7;
        Object stackIn_10_6;
        boolean stackIn_10_8;
        dm stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_g == null) {
            param0.field_g = (dm) ((Object) new bd());
          }
          if (!param1) {
            stackIn_4_0 = (dm) null;
            return stackIn_4_0;
          }
          if (this.field_e) {
            stackIn_9_0 = (bd) (param0.field_g);
            stackIn_9_1 = 0;
            stackIn_9_2 = this.a((byte) -95, param0);
            stackIn_9_3 = this.field_h;
            stackIn_9_4 = this.field_g;
            stackIn_9_5 = this.a(param0, -119);
            stackIn_9_6 = this;
            stackIn_9_7 = (pj) (param0);
            if (param1) {
              stackIn_10_6 = this;
              stackIn_10_8 = false;
            } else {
              stackIn_10_6 = this;
              stackIn_10_8 = true;
            }
            ((bd) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, this.d(stackIn_9_7, stackIn_10_8), this.field_t, this.field_c);
          } else {
            this.a(-29106, param0);
          }
          stackIn_12_0 = param0.field_g;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("jc.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public void a(int param0, int param1, pj param2, int param3, boolean param4) {
        if (this.field_g == null) {
          return;
        }
        try {
          if (param3 != -4394) {
            this.field_g = (kc) null;
          }
          this.a((byte) 88, param2, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jc.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int a(pj param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 54) {
            this.a((byte) -23);
          }
          stackIn_3_0 = this.a(param1, param2 - 49, param0, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jc.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(int param0, pj param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < -116) {
            stackIn_4_0 = param3 + (param1.field_q + (this.field_r + param0)) + param1.field_n;
            return stackIn_4_0;
          }
          stackIn_2_0 = 90;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("jc.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void a(int param0, pj param1, int param2, byte param3, int param4) {
        int var7 = 0;
        ed var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        dm var14 = null;
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
          if (param1.d(-81)) {
            var13 = this.a(param1, true);
            var14 = var13;
            var7 = var14.a(param4, (byte) 107);
            var8 = var13.field_c[var7];
            var9 = var14.a(-116, param4);
            var10 = this.a(param2, 5, param1, var9);
            var11 = this.a(param1, 9534, param0) + Math.max(0, var8.field_f);
            stackIn_4_0 = this.a(param1, 9534, param0);
            stackIn_4_1 = this.d(param1, false);
            stackIn_4_2 = var8.field_c;
            if (var14.field_c.length > 1 + var7) {
              stackIn_5_3 = var13.field_c[var7 + 1].field_f;
            } else {
              stackIn_5_3 = var8.field_c;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            id.a(param1.field_m + param1.field_s + param2, param1.field_s + param2, param1.field_r + (param1.field_n + param0), param0 + param1.field_n, 734);
            mb.field_a.a(var10, false, var12, this.field_m, var10, var11);
            oc.g((byte) -105);
          }
          if (param3 <= 93) {
            this.field_h = -63;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jc.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void a(int param0, int param1, pj param2, int param3, int param4, int param5) {
        int var13 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        dm var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ed var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        var17 = OrbDefence.field_D ? 1 : 0;
        try {
          var7_int = -30 % ((78 - param4) / 37);
          if (param0 == param1) {
            return;
          }
          if (param2.d(-81)) {
            var8 = this.a(param2, true);
            if (param0 < param1) {
              var10 = param1;
              var9 = param0;
            } else {
              var9 = param1;
              var10 = param0;
            }
            var11 = var8.a(var9, (byte) 107);
            var12 = var8.a(var10, (byte) 107);
            id.a(param3 + (param2.field_s + param2.field_m), param2.field_s + param3, param2.field_r + param2.field_n + param5, param2.field_n + param5, 734);
            for (var13 = var11; var12 >= var13; var13++) {
              var14 = var8.field_c[var13];
              if (var11 != var13) {
                stackIn_13_0 = var14.field_g[0];
              } else {
                stackIn_13_0 = var8.a(-118, var9);
              }
              var15 = stackIn_13_0;
              if (var12 != var13) {
                if (var14 == null) {
                  stackIn_18_0 = 0;
                } else {
                  stackIn_18_0 = var14.field_g[var14.field_g.length - 1];
                }
              } else {
                stackIn_18_0 = var8.a(-76, var10);
              }
              var16 = stackIn_18_0;
              mb.field_a.a(this.field_d, -var15 + var16, var14.field_c, this.field_r + (param5 - (-param2.field_n - param2.field_q) + var14.field_f), this.field_d >>> 24, this.a(param3, 5, param2, var15), 123);
            }
            oc.g((byte) -105);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("jc.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public final int c(pj param0, boolean param1) {
        RuntimeException var3 = null;
        pj var4 = null;
        dm stackIn_4_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param0, param1);
          if (!param1) {
            var4 = (pj) null;
            this.a((byte) 53, (pj) null);
          }
          stackIn_4_0 = param0.field_g;
          stackIn_5_1 = !(param1);
          stackIn_6_0 = ((dm) (Object) stackIn_4_0).a(stackIn_5_1) + this.field_p + this.field_i;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("jc.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    String a(byte param0, pj param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -95) {
            stackIn_4_0 = param1.field_l;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final int d(pj param0, boolean param1) {
        RuntimeException var3 = null;
        pj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var4 = (pj) null;
            this.a(-126, 33, 76, -43, (pj) null, 24);
          }
          stackIn_3_0 = -this.field_q + (param0.field_r - this.field_r);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jc.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(byte param0) {
        int var2 = -71 % ((param0 + 18) / 51);
        return this.field_g.field_B + this.field_g.field_H;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param1 <= 31) {
            stackIn_3_0 = 84;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = sd.field_h;
          while (ea.field_d.length > var3_int) {
            var5 = dd.field_B[var3_int];
            if (var5 < 0) {
              var4 = var4 + d.field_j;
            } else {
              var6 = hg.a(true, ea.field_d[var3_int], 0);
              var4 = var4 + gg.field_N;
              var7 = fd.field_c - (var6 >> 1);
              if (fm.a(var4, param2, -mj.field_f + var7, (mj.field_f << 1) + var6, 102, param0, el.field_D + (ol.field_b << 1))) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (gg.field_N + ((ol.field_b << 1) + el.field_D));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "jc.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, jc param1) {
        try {
          param1.field_m = this.field_m;
          param1.field_s = this.field_s;
          param1.field_d = this.field_d;
          param1.field_g = this.field_g;
          param1.field_q = this.field_q;
          param1.field_l = this.field_l;
          param1.field_t = this.field_t;
          if (param0 != 81) {
            field_f = (int[][]) null;
          }
          param1.field_c = this.field_c;
          param1.field_r = this.field_r;
          param1.field_h = this.field_h;
          param1.field_p = this.field_p;
          param1.field_i = this.field_i;
          param1.field_e = this.field_e;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jc.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0, int param1, int param2, int param3, pj param4, int param5) {
        RuntimeException var7 = null;
        pj var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param4, true);
          if (param2 != 2147483647) {
            var8 = (pj) null;
            this.a((byte) 90, (pj) null);
          }
          stackIn_3_0 = param4.field_g.a(param0 - this.a(param4, 9534, param1), -this.a(param4, param5, (byte) 54) + param3, (byte) 124);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("jc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    private final int a(int param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5) {
            field_j = false;
          }
          stackIn_3_0 = param3 + (param2.field_f + (param0 + param2.field_s) + this.field_p);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("jc.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, pj param1) {
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
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null == param1.field_g) {
            param1.field_g = (dm) ((Object) new bd());
          }
          if (param0 != -29106) {
            return;
          }
          var3_int = this.a(param1, param0 ^ 29172);
          var4 = this.d(param1, false);
          var6 = this.field_c;
          if (var6 == 0) {
            var5 = this.field_g.field_H;
          } else {
            if (var6 == 2) {
              var5 = var4 - this.field_g.field_B;
            } else {
              if (var6 != 3 &&
                var6 != 1) {
              }
              var5 = (-this.field_g.field_B + var4 - this.field_g.field_H >> 1) + this.field_g.field_H;
            }
          }
          var6Lifetime1 = this.field_h;
          if (0 != var6Lifetime1 &&
            3 != var6Lifetime1) {
            if (var6Lifetime1 == 1) {
              if (!(param1.field_g instanceof bd)) {
                return;
              }
              ((bd) (param1.field_g)).a(var3_int >> 1, var5, param0 ^ -29127, this.a((byte) -95, param1), this.field_g);
              return;
            }
            if (2 != var6Lifetime1) {
              return;
            }
            if (!(param1.field_g instanceof bd)) {
              return;
            }
            ((bd) (param1.field_g)).a(var3_int, this.field_g, param0 + 29227, this.a((byte) -95, param1), var5);
            return;
          }
          if (param1.field_g instanceof bd) {
            ((bd) (param1.field_g)).a(0, this.a((byte) -95, param1), 89, var5, this.field_g);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("jc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public static void a(boolean param0) {
        field_f = (int[][]) null;
        field_k = null;
        if (!param0) {
          return;
        }
        field_a = null;
        field_n = null;
    }

    public final int a(pj param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        pj var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -69) {
            var4 = (pj) null;
            discarded$1 = this.a(86, 3, (pj) null, 16);
          }
          stackIn_3_0 = -this.field_i + (-this.field_p + param0.field_m);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jc.P(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, pj param1, int param2, int param3) {
        try {
          this.a(0, 0, param3, this.field_l, (byte) 51, this.field_s, param2, param1);
          if (param0 < 53) {
            this.a((byte) -19);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jc.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    protected jc() {
    }

    jc(kc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_t = param9;
          this.field_i = param2;
          this.field_r = param3;
          this.field_g = param0;
          this.field_m = param10;
          this.field_p = param1;
          this.field_q = param4;
          this.field_e = param12 ? true : false;
          this.field_l = param6;
          this.field_s = param5;
          this.field_d = param11;
          this.field_h = param7;
          this.field_c = param8;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_n = "This password contains repeated characters, and would be easy to guess";
        field_f = new int[][]{new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 0, 2, 0, 3, 0, 4, 0, 0, 0, 5, 0, 1, 0, 3, 0, 2, 0, 1, 1, 0, 2, 0, 4, 0, 5, 0, 3, 0, 2, 2, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 1, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 1, 5, 2, 0, 5, 5, 0, 3, 0, 5, 7, 5, 0, 1, 0, 6, 6, 0, 3, 0, 4, 0, 6, 0, 6, 0, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 0, 0, 8}, new int[]{0, 0, 1, 4, 2, 6, 3, 7, 4, 6, 0, 0, 5, 7, 1, 6, 3, 6, 2, 4, 1, 1, 0, 2, 4, 4, 6, 5, 6, 3, 7, 2, 2, 0, 1, 6, 2, 7, 4, 6, 5, 4, 3, 3, 0, 7, 6, 1, 6, 2, 4, 3, 7, 4, 4, 0, 6, 7, 7, 6, 1, 5, 2, 4, 5, 5, 0, 3, 1, 5, 7, 5, 6, 1, 7, 6, 6, 0, 3, 4, 4, 7, 6, 6, 6, 6, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 6, 4, 8}, new int[]{10, 0, 1, 10, 0, 3, 0, 4, 10, 0, 0, 0, 5, 0, 10, 0, 3, 6, 2, 4, 10, 10, 0, 9, 0, 4, 0, 10, 0, 3, 0, 9, 9, 0, 1, 6, 2, 0, 4, 0, 5, 0, 3, 3, 0, 7, 0, 10, 0, 2, 0, 3, 0, 4, 4, 0, 6, 0, 7, 0, 10, 5, 2, 0, 5, 5, 0, 3, 0, 5, 9, 5, 0, 10, 0, 6, 6, 0, 3, 0, 4, 10, 6, 0, 6, 10, 7, 9, 0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 8}, new int[]{0, 0, 10, 4, 2, 6, 3, 7, 4, 6, 0, 0, 5, 7, 1, 6, 3, 6, 2, 1, 10, 10, 0, 9, 4, 4, 6, 5, 6, 3, 7, 9, 9, 0, 1, 6, 2, 7, 4, 6, 5, 4, 1, 1, 0, 7, 6, 1, 6, 2, 4, 3, 7, 4, 4, 0, 6, 7, 7, 6, 1, 5, 2, 4, 5, 5, 0, 3, 10, 5, 7, 5, 10, 1, 7, 10, 10, 0, 3, 4, 9, 7, 6, 6, 6, 6, 7, 7, 0, 1, 2, 3, 4, 5, 6, 7, 10, 9, 8}};
        field_o = 0L;
        field_k = new hj(270, 70);
        field_a = new df("");
        field_j = false;
    }
}
