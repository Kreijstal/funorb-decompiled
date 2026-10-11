/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends jg {
    int field_D;
    static String[] field_w;
    int field_E;
    private boolean field_C;
    int field_v;
    int field_B;
    static int[] field_z;
    int field_x;
    static String field_y;
    int field_t;
    static r field_u;
    int field_A;

    private final void d(int param0) {
        int var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -23269) {
          this.field_B = 105;
          if (this.field_A == 4) {
            this.field_v = 5;
            return;
          }
          if (this.field_A == 2) {
            this.field_v = 3;
            return;
          }
          if (this.field_A != 3) {
            this.field_v = 1;
            return;
          }
          this.field_v = 3;
          return;
        }
        if (this.field_A == 4) {
          this.field_v = 5;
          return;
        }
        if (this.field_A == 2) {
          this.field_v = 3;
          return;
        }
        if (this.field_A != 3) {
          this.field_v = 1;
          return;
        }
        this.field_v = 3;
    }

    public static void e(int param0) {
        field_z = null;
        field_y = null;
        field_w = null;
        field_u = null;
        int var1 = -15 % ((param0 - 24) / 62);
    }

    final void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        if (param0) {
          return;
        }
        try {
          this.a(-30, param1, param2, (byte[]) null, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    rn(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        this.field_A = param4;
        this.field_C = true;
        this.field_t = param5;
        this.d(-23269);
    }

    final void a(rn param0, int param1) {
        try {
          super.a(param0, -39);
          this.field_x = param0.field_x;
          this.field_t = param0.field_t;
          this.field_B = param0.field_B;
          this.field_v = param0.field_v;
          this.field_E = param0.field_E;
          if (param1 > -3) {
            mi var4 = (mi) null;
            this.a((mi) null, -11);
          }
          this.field_A = param0.field_A;
          this.field_D = param0.field_D;
          this.field_C = param0.field_C;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        int stackIn_8_0 = 0;
        fc[][] stackIn_30_0 = null;
        int stackIn_31_1 = 0;
        fc[][] stackIn_37_0 = null;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        fc var8 = null;
        Object var9 = null;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        fc var15 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          var6_int = this.field_p;
          if (22 == var6_int &&
            this.field_k % 20 < 10) {
            var6_int = 8;
          }
          if (!param4) {
            stackIn_8_0 = pl.field_n;
          } else {
            stackIn_8_0 = pn.field_L;
          }
          var7 = stackIn_8_0;
          if (param0 != -30) {
            this.field_A = -31;
          }
          var8 = wi.field_j[var6_int][var7];
          if (var8 == null) {
            return;
          }
          vq.field_q[2] = this.field_g + 64;
          vq.field_q[0] = 64 + this.field_l;
          if (!this.field_C && (param3 == null ||
            !(bj.field_i[0] <= param3[0]))) {
            param3 = bj.field_i;
          }
          vq.field_q[1] = this.field_s;
          if (this.field_p == 23 &&
            (this.field_s + (this.field_l + this.field_g) & 15) == 0) {
            vq.field_q[0] = vq.field_q[0] + (-4 + be.a(9, (byte) 83));
            vq.field_q[1] = vq.field_q[1] + (be.a(9, (byte) 83) - 4);
            vq.field_q[2] = vq.field_q[2] + (-4 + be.a(9, (byte) 83));
          }
          if (var6_int == 10 ||
            var6_int == 5 ||
            this.field_i) {
            if (var6_int == 10) {
              stackIn_37_0 = wi.field_j;
              if (param2) {
                stackIn_38_1 = 27;
              } else {
                stackIn_38_1 = 3;
              }
              var9 = stackIn_37_0[stackIn_38_1][var7];
            } else {
              if (var6_int != 5) {
                if (this.field_i) {
                  var9 = wi.field_j[27][var7];
                } else {
                  var9 = null;
                }
              } else {
                stackIn_30_0 = wi.field_j;
                if (!param2) {
                  stackIn_31_1 = 4;
                } else {
                  stackIn_31_1 = 27;
                }
                var9 = stackIn_30_0[stackIn_31_1][var7];
              }
            }
            var12 = ((fc) (var9)).field_R;
            ((fc) (var9)).field_R = param3;
            ((fc) (var9)).a(param1, vq.field_q);
            ((fc) (var9)).field_R = var12;
          }
          if (this.field_f < 0) {
            var14 = var8.field_R;
            var8.field_R = param3;
            var8.a(param1, vq.field_q);
            var8.field_R = var14;
          } else {
            var15 = (fc) (this.field_n.a(true, true, false, var8));
            var13 = var15.field_R;
            var8.field_R = param3;
            var15.a(param1, vq.field_q);
            var15.field_R = var13;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_46_0 = var6;
          stackIn_46_1 = new StringBuilder().append("rn.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param4).append(')').toString());
        }
    }

    rn(rn param0) {
        super(param0);
        try {
          this.a(param0, -127);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 0) {
          this.a(43, false);
          if (!this.field_C) {
            return false;
          }
          if (super.b(param0, param1, param2, param3, param4, 0)) {
            return true;
          }
          return false;
        }
        if (!this.field_C) {
          return false;
        }
        if (super.b(param0, param1, param2, param3, param4, 0)) {
          return true;
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        int var3 = this.field_k;
        if (param1) {
          this.a((byte) -80, param0);
          if (this.field_A == 5) {
            this.field_k = (short) var3;
          }
          return;
        }
    }

    rn(mi param0) {
        super(1, 0, 0, 0);
        int var2_int = 0;
        try {
          this.a(param0, 12);
          var2_int = this.field_k;
          this.a((byte) -55, this.field_p);
          this.field_k = (short) var2_int;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        int var2 = 94 % ((-11 - param0) / 36);
        return this.field_C;
    }

    final boolean b(int param0) {
        boolean stackIn_10_1 = false;
        boolean stackIn_19_1 = false;
        boolean stackIn_29_1 = false;
        boolean stackIn_36_1 = false;
        boolean stackIn_45_1 = false;
        boolean stackIn_54_1 = false;
        boolean stackIn_63_1 = false;
        boolean stackIn_71_1 = false;
        boolean stackIn_80_1 = false;
        boolean stackIn_89_1 = false;
        boolean stackIn_97_1 = false;
        boolean stackIn_105_1 = false;
        boolean stackIn_112_1 = false;
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = super.b(param0) ? 1 : 0;
        if (this.field_A == 2) {
          if (0 < this.field_v &&
            this.field_B <= this.field_l) {
            this.field_v = this.field_v * -1;
            this.field_l = this.field_B;
            this.field_l = this.field_l + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_89_1 = !(this.field_C);
              this.field_C = stackIn_89_1;
            }
            return var2 != 0;
          }
          if (0 <= this.field_v) {
            this.field_l = this.field_l + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_97_1 = !(this.field_C);
              this.field_C = stackIn_97_1;
            }
          } else {
            if (this.field_l > this.field_x) {
              this.field_l = this.field_l + this.field_v;
              if (this.field_A == 5 &&
                this.field_k >= this.field_t) {
                this.field_k = (short) 0;
                stackIn_112_1 = !(this.field_C);
                this.field_C = stackIn_112_1;
              }
            } else {
              this.field_l = this.field_x;
              this.field_v = this.field_v * -1;
              this.field_l = this.field_l + this.field_v;
              if (this.field_A == 5 &&
                this.field_k >= this.field_t) {
                this.field_k = (short) 0;
                stackIn_105_1 = !(this.field_C);
                this.field_C = stackIn_105_1;
              }
            }
          }
          return var2 != 0;
        }
        if (this.field_A == 3) {
          if (this.field_v > 0 &&
            this.field_B <= this.field_g) {
            this.field_v = this.field_v * -1;
            this.field_g = this.field_B;
            this.field_g = this.field_g + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_10_1 = !(this.field_C);
              this.field_C = stackIn_10_1;
            }
            return var2 != 0;
          }
          if (0 <= this.field_v) {
            this.field_g = this.field_g + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_19_1 = !(this.field_C);
              this.field_C = stackIn_19_1;
            }
          } else {
            if (1 + this.field_x < this.field_g) {
              this.field_g = this.field_g + this.field_v;
              if (this.field_A == 5 &&
                this.field_k >= this.field_t) {
                this.field_k = (short) 0;
                stackIn_36_1 = !(this.field_C);
                this.field_C = stackIn_36_1;
              }
            } else {
              this.field_v = this.field_v * -1;
              this.field_g = this.field_x;
              this.field_g = this.field_g + this.field_v;
              if (this.field_A == 5 &&
                this.field_k >= this.field_t) {
                this.field_k = (short) 0;
                stackIn_29_1 = !(this.field_C);
                this.field_C = stackIn_29_1;
              }
            }
          }
          return var2 != 0;
        }
        if (this.field_A != 4) {
          if (this.field_A == 5 &&
            this.field_k >= this.field_t) {
            this.field_k = (short) 0;
            stackIn_45_1 = !(this.field_C);
            this.field_C = stackIn_45_1;
          }
          return var2 != 0;
        }
        if (this.field_v > 0 &&
          this.field_s >= this.field_B) {
          this.field_v = this.field_v * -1;
          this.field_s = this.field_B;
          this.field_s = this.field_s + this.field_v;
          if (this.field_A == 5 &&
            this.field_k >= this.field_t) {
            this.field_k = (short) 0;
            stackIn_54_1 = !(this.field_C);
            this.field_C = stackIn_54_1;
          }
          return var2 != 0;
        }
        if (this.field_v >= 0) {
          this.field_s = this.field_s + this.field_v;
          if (this.field_A == 5 &&
            this.field_k >= this.field_t) {
            this.field_k = (short) 0;
            stackIn_63_1 = !(this.field_C);
            this.field_C = stackIn_63_1;
          }
        } else {
          if (this.field_x < this.field_s) {
            this.field_s = this.field_s + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_71_1 = !(this.field_C);
              this.field_C = stackIn_71_1;
            }
          } else {
            this.field_s = this.field_x;
            this.field_v = this.field_v * -1;
            this.field_s = this.field_s + this.field_v;
            if (this.field_A == 5 &&
              this.field_k >= this.field_t) {
              this.field_k = (short) 0;
              stackIn_80_1 = !(this.field_C);
              this.field_C = stackIn_80_1;
            }
          }
        }
        return var2 != 0;
    }

    final static void a(int param0, si param1) {
        try {
          if (param0 <= 33) {
            si var3 = (si) null;
            rn.a(9, (si) null);
          }
          bm.a(param1, true, 4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(wo param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -this.field_l + (-64 + param0.field_E);
          var4 = -53 % ((38 - param1) / 37);
          var5 = -64 + (-this.field_g + param0.field_y);
          var6 = -this.field_s + param0.field_k;
          stackIn_5_0 = (var3_int * var3_int < 4096) && (var5 * var5 < 4096) && (var6 < 30);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rn.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, byte param1) {
        int var3 = this.field_k;
        this.a((byte) -72, param0);
        if (param1 > -121) {
          this.field_t = -19;
          if (this.field_A == 5) {
            return;
          }
          if (28 != param0) {
            this.field_k = (short) var3;
            return;
          }
          return;
        }
        if (this.field_A == 5) {
          return;
        }
        if (28 != param0) {
          this.field_k = (short) var3;
          return;
        }
    }

    private final void a(mi param0, int param1) {
        try {
          this.field_p = param0.c((byte) -119, 5);
          this.field_A = param0.c((byte) -97, 3);
          this.field_t = param0.c((byte) -102, 9);
          this.field_k = (short)param0.c((byte) -125, 8);
          this.field_l = param0.c((byte) -95, 10);
          this.field_g = param0.c((byte) -114, 10);
          this.field_s = param0.c((byte) -116, param1) - 193;
          this.field_h = param0.c((byte) -121, 3);
          this.field_r = param0.c((byte) -96, 3);
          this.field_o = param0.c((byte) -113, 4);
          this.field_C = 1 == param0.c((byte) -105, 1) ? true : false;
          this.field_v = -5 + param0.c((byte) -106, 4);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "rn.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_w = new String[16];
        field_y = "The game options are not all set.";
    }
}
