/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl implements jm, mg {
    static String field_a;
    int field_m;
    static String field_f;
    int field_g;
    private boolean field_o;
    int field_j;
    int field_p;
    private int field_b;
    static ci field_d;
    int field_c;
    int field_i;
    lh field_e;
    int field_r;
    static boolean field_h;
    int field_n;
    static String field_q;
    int field_k;
    int field_l;

    public void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        if (this.field_e == null) {
          return;
        }
        try {
          this.a(param1, false, param2, param4);
          if (param0 < 58) {
            this.field_i = -19;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hl.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 2668) {
            stackIn_4_0 = param2 + param3.field_u + this.field_r + (param3.field_A + param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -91;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("hl.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(hl param0, int param1) {
        try {
          param0.field_b = this.field_b;
          param0.field_p = this.field_p;
          param0.field_m = this.field_m;
          param0.field_k = this.field_k;
          param0.field_l = this.field_l;
          param0.field_r = this.field_r;
          param0.field_j = this.field_j;
          param0.field_c = this.field_c;
          param0.field_o = this.field_o;
          param0.field_i = this.field_i;
          param0.field_g = this.field_g;
          param0.field_e = this.field_e;
          param0.field_n = this.field_n;
          if (param1 != -1053) {
            mf var4 = (mf) null;
            this.a(60, -118, 79, 112, (mf) null, 19);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hl.BA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, mf param3) {
        try {
          this.a((byte) 119, param2, param3, param0, this.field_b, this.field_g, 0, 0);
          if (param1) {
            this.field_n = -109;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hl.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    hl(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final int a(int param0, mf param1, int param2, int param3) {
        RuntimeException var5 = null;
        mf var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 23) {
            var6 = (mf) null;
            this.a((byte) -15, (mf) null);
          }
          stackIn_3_0 = this.field_m + (param3 + (param1.field_r + param1.field_k + param2));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("hl.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final int a(int param0, int param1, int param2, int param3, mf param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param4, -23159);
          if (param2 != -4) {
            this.field_c = -125;
          }
          stackIn_3_0 = param4.field_t.a(param0 - this.a(0, param1, param4), 57, -this.a(param4, param3, param2 ^ 1581179901) + param5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("hl.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(')').toString());
        }
    }

    public final int b(mf param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a((byte) 49);
          }
          stackIn_3_0 = param0.field_y - (this.field_r + this.field_n);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hl.T(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int a(int param0, int param1, mf param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = this.a(107, param2, 0, param1);
            return stackIn_4_0;
          }
          stackIn_2_0 = 24;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("hl.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(mf param0, int param1, int param2) {
        RuntimeException var4 = null;
        hl var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1581179903) {
            var5 = (hl) null;
            this.a((hl) null, 101);
          }
          stackIn_3_0 = this.a(0, 2668, param1, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("hl.AA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, mf param2, int param3, int param4, int param5, int param6, int param7) {
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
        int var14 = 0;
        int var13Lifetime1;
        var14 = Chess.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          cf.b(param2.field_r + (param1 + param2.field_C), param2.field_y + param2.field_u + param3, param2.field_r + param1, 80, param3 + param2.field_u);
          var11 = 36 / ((param0 - 29) / 47);
          var9_int = this.b(param2, 0);
          var10 = this.c((byte) 18, param2);
          if (this.field_o) {
            this.field_e.a(this.a(-29558, param2), this.a(param6, 2668, param3, param2), this.a(122, param2, param7, param1), var9_int, var10, param5, param4, this.field_l, this.field_c, this.field_j);
          } else {
            var13 = this.field_c;
            if (0 == var13) {
              var12 = this.field_e.field_C;
            } else {
              if (var13 == 2) {
                var12 = var10 - this.field_e.field_t;
              } else {
                if (var13 != 3 &&
                  1 != var13) {
                }
                var12 = this.field_e.field_C + (-this.field_e.field_t + var10 - this.field_e.field_C >> 1);
              }
            }
            var13Lifetime1 = this.field_l;
            if (var13Lifetime1 != 0 &&
              var13Lifetime1 != 3) {
              if (var13Lifetime1 == 1) {
                this.field_e.b(this.a(-29558, param2), this.a(param6, 2668, param3, param2) + (var9_int >> 1), var12 + this.a(100, param2, param7, param1), param5, param4);
              } else {
                if ((var13Lifetime1 == 2)) {
                  this.field_e.c(this.a(-29558, param2), var9_int + this.a(param6, 2668, param3, param2), var12 + this.a(37, param2, param7, param1), param5, param4);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_e.a(this.a(-29558, param2), this.a(param6, 2668, param3, param2), this.a(117, param2, param7, param1) + var12, param5, param4);
            }
          }
          fd.a(28773);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_26_0 = var9;
          stackIn_26_1 = new StringBuilder().append("hl.LA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        ci stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        boolean stackIn_10_2 = false;
        ci stackIn_13_0 = null;
        boolean stackIn_13_1 = false;
        boolean stackIn_14_2 = false;
        ci stackIn_23_0 = null;
        boolean stackIn_23_1 = false;
        boolean stackIn_24_2 = false;
        ci stackIn_27_0 = null;
        boolean stackIn_27_1 = false;
        boolean stackIn_28_2 = false;
        ci stackIn_36_0 = null;
        boolean stackIn_36_1 = false;
        boolean stackIn_37_2 = false;
        ci stackIn_40_0 = null;
        boolean stackIn_40_1 = false;
        boolean stackIn_41_2 = false;
        if (param0 != -416228287) {
          hl.a(60, false);
        }
        cf.b(wb.field_c, wb.field_h + 640 >> 1, 0, param0 ^ -416228335, -640 + wb.field_h >> 1);
        if (an.field_e > 0) {
          if (null != ig.field_h) {
            ig.field_h.d(ql.field_d.field_mb, 0);
          }
          stackIn_9_0 = ql.field_d;
          stackIn_9_1 = false;
          stackIn_10_2 = (param1) && (!fm.field_V);
          ((ci) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
          stackIn_13_0 = rb.field_c;
          stackIn_13_1 = false;
          stackIn_14_2 = (param1) && (!fm.field_V);
          ((ci) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_14_2);
        }
        if (aj.field_c > 0) {
          if (ig.field_h != null) {
            ig.field_h.d(fm.field_T.field_mb, 0);
          }
          stackIn_36_0 = fm.field_T;
          stackIn_36_1 = false;
          stackIn_37_2 = (param1) && (!jh.field_a);
          ((ci) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_37_2);
          stackIn_40_0 = ri.field_k;
          stackIn_40_1 = false;
          stackIn_41_2 = (param1) && (!jh.field_a);
          ((ci) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_41_2);
        } else {
          if (ed.field_c > 0) {
            if (ig.field_h != null) {
              ig.field_h.d(fm.field_T.field_mb, 0);
            }
            stackIn_23_0 = fm.field_T;
            stackIn_23_1 = false;
            stackIn_24_2 = (param1) && (!jh.field_a);
            ((ci) (Object) stackIn_23_0).a(stackIn_23_1, stackIn_24_2);
            stackIn_27_0 = ri.field_k;
            stackIn_27_1 = false;
            stackIn_28_2 = (param1) && (!jh.field_a);
            ((ci) (Object) stackIn_27_0).a(stackIn_27_1, stackIn_28_2);
          }
        }
        fd.a(28773);
    }

    public final int a(byte param0, mf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -7 % ((53 - param0) / 54);
          this.a(param1, -23159);
          stackIn_1_0 = param1.field_t.c((byte) -24) - (-this.field_r - this.field_n);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("hl.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final int a(boolean param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param1, -23159);
          if (param0) {
            stackIn_4_0 = param1.field_t.a((byte) 34) - (-this.field_m - this.field_k);
            return stackIn_4_0;
          }
          stackIn_2_0 = 114;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hl.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    String a(int param0, mf param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -29558) {
            stackIn_4_0 = param1.field_v;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hl.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final int a(byte param0) {
        if (param0 < 52) {
          return 36;
        }
        return this.field_e.field_t + this.field_e.field_C;
    }

    public final void a(int param0, int param1, int param2, byte param3, mf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        fj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ub var13 = null;
        ub var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4.d((byte) -67)) {
            var13 = this.a(param4, -23159);
            var14 = var13;
            var7 = var14.a((byte) -74, param1);
            var8 = var13.field_a[var7];
            var9 = var14.a(-5940, param1);
            var10 = this.a(var9, 2668, param0, param4);
            var11 = this.a(0, param2, param4) + Math.max(0, var8.field_d);
            stackIn_4_0 = this.a(0, param2, param4);
            stackIn_4_1 = this.c((byte) 18, param4);
            stackIn_4_2 = var8.field_e;
            if (var14.field_a.length > var7 + 1) {
              stackIn_5_3 = var13.field_a[1 + var7].field_d;
            } else {
              stackIn_5_3 = var8.field_e;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            cf.b(param4.field_C + param2 + param4.field_r, param4.field_y + param4.field_u + param0, param2 + param4.field_r, 80, param4.field_u + param0);
            a.field_a.a(var10, this.field_i, var10, var11, var12, false);
            fd.a(28773);
          }
          if (param3 <= -66) {
            return;
          }
          this.field_c = 69;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("hl.W(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static km a(int param0) {
        int var4_int = 0;
        int var5 = Chess.field_G;
        int var1 = b.field_c[0] * wm.field_b[0];
        byte[] var2 = vk.field_d[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
          var3[var4_int] = uh.field_r[ce.a((int) var2[var4_int], 255)];
        }
        km var4 = new km(cd.field_p, ek.field_a, be.field_a[0], a.field_c[param0], wm.field_b[0], b.field_c[0], var3);
        ch.k(4210752);
        return var4;
    }

    public static void a(boolean param0) {
        field_q = null;
        field_d = null;
        field_a = null;
        if (!param0) {
          field_f = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    private final int c(byte param0, mf param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18) {
            field_q = (String) null;
          }
          stackIn_3_0 = -this.field_k + param1.field_C - this.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("hl.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final void b(byte param0, mf param1) {
        int discarded$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        mf var8 = null;
        int var6Lifetime1;
        var7 = Chess.field_G;
        try {
          if (param1.field_t == null) {
            param1.field_t = (ub) ((Object) new ah());
          }
          var3_int = this.b(param1, 0);
          var4 = this.c((byte) 18, param1);
          var6 = this.field_c;
          if (0 != var6) {
            if (var6 == 2) {
              var5 = -this.field_e.field_t + var4;
            } else {
              if (var6 != 3 &&
                1 == var6) {
              }
              var5 = (-this.field_e.field_t + (-this.field_e.field_C + var4) >> 1) + this.field_e.field_C;
            }
          } else {
            var5 = this.field_e.field_C;
          }
          var6Lifetime1 = this.field_l;
          if (var6Lifetime1 != 0 &&
            var6Lifetime1 != 3) {
            if (var6Lifetime1 == 1) {
              if (param1.field_t instanceof ah) {
                ((ah) (param1.field_t)).a(0, this.a(-29558, param1), var3_int >> 1, var5, this.field_e);
              }
            } else if (var6Lifetime1 == 2 &&
              param1.field_t instanceof ah) {
              ((ah) (param1.field_t)).a(0, var5, var3_int, this.a(-29558, param1), this.field_e);
            }
          } else {
            if (param1.field_t instanceof ah) {
              ((ah) (param1.field_t)).a(this.a(-29558, param1), 0, this.field_e, var5, 8829);
            }
          }
          if (param0 > 72) {
            return;
          }
          var8 = (mf) null;
          discarded$0 = this.c((byte) -13, (mf) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("hl.IA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public final ub a(mf param0, int param1) {
        RuntimeException var3 = null;
        ub stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == param0.field_t) {
            param0.field_t = (ub) ((Object) new ah());
          }
          if (!this.field_o) {
            this.b((byte) 97, param0);
          } else {
            ((ah) (param0.field_t)).a(this.field_l, (byte) 120, this.c((byte) 18, param0), this.field_j, this.field_c, this.a(param1 - 6399, param0), this.b(param0, 0), this.field_e);
          }
          if (param1 != -23159) {
            field_d = (ci) null;
          }
          stackIn_8_0 = param0.field_t;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hl.DA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    protected hl() {
    }

    public final void a(mf param0, int param1, int param2, int param3, int param4, int param5) {
        int var12 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ub var17 = null;
        ub var18 = null;
        var16 = Chess.field_G;
        try {
          if (param5 == param2) {
            return;
          }
          if (param0.d((byte) -67)) {
            var17 = this.a(param0, -23159);
            var18 = var17;
            if (param5 < param2) {
              var9 = param2;
              var8 = param5;
            } else {
              var8 = param2;
              var9 = param5;
            }
            var10 = var18.a((byte) 126, var8);
            var11 = var18.a((byte) 123, var9);
            cf.b(param3 + param0.field_r + param0.field_C, param0.field_y + param1 + param0.field_u, param3 + param0.field_r, 80, param0.field_u + param1);
            for (var12 = var10; var11 >= var12; var12++) {
              var13 = var17.field_a[var12];
              if (~var12 == ~var10) {
                stackIn_13_0 = var18.a(-5940, var8);
              } else {
                stackIn_13_0 = var13.field_i[0];
              }
              var14 = stackIn_13_0;
              if (var12 != var11) {
                if (var13 == null) {
                  stackIn_18_0 = 0;
                } else {
                  stackIn_18_0 = var13.field_i[var13.field_i.length - 1];
                }
              } else {
                stackIn_18_0 = var18.a(-5940, var9);
              }
              var15 = stackIn_18_0;
              a.field_a.a(126, param0.field_k + this.field_m + (param0.field_r + param3) + var13.field_d, this.field_p, this.a(var14, 2668, param1, param0), var15 - var14, var13.field_e, this.field_p >>> 24);
            }
            fd.a(28773);
          }
          var7_int = -16 % ((73 - param4) / 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("hl.FA(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    hl(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
          this.field_b = param6;
          this.field_j = param9;
          this.field_k = param4;
          this.field_l = param7;
          this.field_m = param3;
          this.field_g = param5;
          this.field_i = param10;
          this.field_n = param2;
          this.field_c = param8;
          this.field_r = param1;
          this.field_p = param11;
          this.field_o = param12 ? true : false;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "hl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    static {
        field_f = "Retry";
        field_a = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_q = "Type your email address again to make sure it's correct";
    }
}
