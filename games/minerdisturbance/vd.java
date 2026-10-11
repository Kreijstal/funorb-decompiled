/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd extends um {
    private di field_A;
    private int field_C;
    private wh field_F;
    static String field_r;
    private int field_D;
    static String field_x;
    private di field_J;
    private boolean field_I;
    private int[] field_G;
    static int field_y;
    private boolean field_v;
    private wh field_u;
    private int field_B;
    private di field_w;
    private int field_t;
    static int field_z;
    private int[] field_H;
    static boolean[] field_s;
    private wh field_E;

    final synchronized void a(boolean param0, wh param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_30_0 = 0;
        di stackIn_39_0 = null;
        boolean stackIn_40_1 = false;
        di stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        try {
          if (this.field_I &&
            param2) {
            if (this.field_C > 0) {
              if (null != this.field_F) {
                this.field_A.c((byte) 108);
              }
              this.field_F = param1;
              if (param1 != null) {
                this.field_A.a(false, param1, (byte) 2);
                this.a(param5, param3, (byte) -117, this.field_A);
              }
            } else {
              if (this.field_E != null) {
                this.field_J.c((byte) 108);
              }
              this.field_E = param1;
              if (param1 != null) {
                this.field_J.a(false, param1, (byte) 2);
                this.a(param5, param3, (byte) -117, this.field_J);
              }
            }
            return;
          }
          stackIn_19_1 = (param2);
          this.field_I = stackIn_19_1;
          if (param1 == this.field_F) {
            this.field_C = param4;
            this.a(param5, param3, (byte) -117, this.field_A);
            return;
          }
          if (this.field_E == param1) {
            this.field_C = -param4;
            this.a(param5, param3, (byte) -117, this.field_J);
            return;
          }
          if (null == this.field_F) {
            var7_int = 1;
          } else {
            if (this.field_E == null) {
              var7_int = 0;
            } else {
              stackIn_30_0 = (this.field_t >= 524288) ? 0 : 1;
              var7_int = stackIn_30_0;
            }
          }
          if (var7_int == 0) {
            if (this.field_E != null) {
              this.field_J.c((byte) 108);
            }
            this.field_E = param1;
            if (param1 != null) {
              stackIn_48_0 = this.field_J;
              stackIn_49_1 = !(param2);
              ((di) (Object) stackIn_48_0).a(stackIn_49_1, param1, (byte) 2);
              this.a(param5, param3, (byte) -117, this.field_J);
            }
            this.field_C = -param4;
          } else {
            if (this.field_F != null) {
              this.field_A.c((byte) 108);
            }
            this.field_F = param1;
            if (param1 != null) {
              stackIn_39_0 = this.field_A;
              stackIn_40_1 = !(param2);
              ((di) (Object) stackIn_39_0).a(stackIn_40_1, param1, (byte) 2);
              this.a(param5, param3, (byte) -117, this.field_A);
            }
            this.field_C = param4;
          }
          if (param0) {
            this.field_G = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("vd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(int param0, int param1, byte param2, di param3) {
        mj var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          param3.a(param0, true, -1);
          if (param2 != -117) {
            var6 = (mj) null;
            vd.a(36, 70, (mj) null);
            param3.c(param1, -102);
          } else {
            param3.c(param1, -102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("vd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        this.field_B = param1;
        if (param0 < 43) {
          this.field_G = (int[]) null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        try {
          param1.removeMouseListener(lb.field_y);
          param1.removeMouseMotionListener(lb.field_y);
          param1.removeFocusListener(lb.field_y);
          qd.field_J = 0;
          if (param0 != -106) {
            field_z = 13;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vd.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = MinerDisturbance.field_ab;
        if (this.field_t > 0) {
          if (null != this.field_F) {
            this.field_A.a(param0);
            if (1048576 <= this.field_t) {
              if ((!(0 >= this.field_D)) &&
                ((this.field_u != null))) {
                this.field_w.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_E) {
                if ((!(0 >= this.field_D)) &&
                  ((this.field_u != null))) {
                  this.field_w.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_J.a(param0);
              }
            }
          } else {
            if (1048576 <= this.field_t) {
              if ((!(0 >= this.field_D)) &&
                ((this.field_u != null))) {
                this.field_w.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_E) {
                if ((!(0 >= this.field_D)) &&
                  ((this.field_u != null))) {
                  this.field_w.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_J.a(param0);
              }
            }
          }
        } else {
          if (1048576 <= this.field_t) {
            if ((!(0 >= this.field_D)) &&
              ((this.field_u != null))) {
              this.field_w.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.field_E) {
              if ((!(0 >= this.field_D)) &&
                ((this.field_u != null))) {
                this.field_w.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_J.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (0 < this.field_D &&
          this.field_u != null)) {
          this.field_w.a(param0);
        }
        if (this.field_I) {
          if (this.field_C > 0 &&
            !this.field_A.b((byte) -114)) {
            this.field_I = false;
            this.field_F = null;
            this.field_C = -this.field_C;
          } else {
            if (this.field_C < 0 &&
              !this.field_J.b((byte) -114)) {
              this.field_C = -this.field_C;
              this.field_E = null;
              this.field_I = false;
            }
          }
        }
        if (0 != this.field_C) {
          this.field_t = this.field_t + this.field_C * param0;
          if (this.field_t < 1048576) {
            if (this.field_t <= 0) {
              this.field_t = 0;
              if (!this.field_I) {
                this.field_C = 0;
                if (!this.field_v) {
                  if (null != this.field_F) {
                    this.field_A.c((byte) 108);
                  }
                  this.field_F = null;
                }
              }
            }
          } else {
            this.field_t = 1048576;
            if (!this.field_I) {
              this.field_C = 0;
              if (!this.field_v) {
                if (null != this.field_E) {
                  this.field_J.c((byte) 108);
                }
                this.field_E = null;
              }
            }
          }
        }
    }

    final synchronized int d() {
        return 2;
    }

    final um c() {
        return null;
    }

    public static void e(int param0) {
        field_s = null;
        int var1 = 29 / ((param0 + 82) / 42);
        field_x = null;
        field_r = null;
    }

    final um b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_38_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = MinerDisturbance.field_ab;
        try {
          if (this.field_B <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_I) {
            if (this.field_C > 0 &&
              !this.field_A.b((byte) -114)) {
              this.field_F = null;
              this.field_I = false;
              this.field_C = -this.field_C;
            } else {
              if (this.field_C < 0 &&
                !this.field_J.b((byte) -114)) {
                this.field_E = null;
                this.field_I = false;
                this.field_C = -this.field_C;
              }
            }
          }
          var4_int = this.field_B * (this.field_t >> 12) / 256;
          var5 = this.field_B - var4_int;
          if (0 != this.field_C) {
            this.field_t = this.field_t + param2 * this.field_C;
            if (this.field_t >= 1048576) {
              this.field_t = 1048576;
              if (!this.field_I) {
                this.field_C = 0;
                if (!this.field_v) {
                  if (this.field_E != null) {
                    this.field_J.c((byte) 108);
                  }
                  this.field_E = null;
                }
              }
            } else {
              if (this.field_t <= 0) {
                this.field_t = 0;
                if (!this.field_I) {
                  this.field_C = 0;
                  if (!this.field_v) {
                    if (this.field_F != null) {
                      this.field_A.c((byte) 108);
                    }
                    this.field_F = null;
                  }
                }
              }
            }
          }
          if (fj.field_u) {
            stackIn_38_0 = param2 << 1;
          } else {
            stackIn_38_0 = param2;
          }
          var6 = stackIn_38_0;
          if (256 > this.field_D && (this.field_F != null ||
            this.field_E != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_G &&
                  this.field_G.length >= var6) {
                  ai.a(this.field_G, 0, var6);
                  ai.a(this.field_H, 0, var6);
                } else {
                  this.field_G = new int[var6];
                  this.field_H = new int[var6];
                }
                this.field_A.a(this.field_G, 0, param2);
                this.field_J.a(this.field_H, 0, param2);
                if (!fj.field_u) {
                  stackIn_53_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_53_0 = localTemp$0;
                }
                var7 = stackIn_53_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_H[var8] * var5 + var4_int * this.field_G[var8] >> 8);
                }
              } else {
                this.field_J.a(param0, param1, param2);
              }
            } else {
              this.field_A.a(param0, param1, param2);
            }
          }
          if (null != this.field_u &&
            this.field_D != 0) {
            if (this.field_G != null &&
              var6 <= this.field_G.length) {
              ai.a(this.field_G, 0, var6);
            } else {
              this.field_G = new int[var6];
              this.field_H = new int[var6];
            }
            this.field_w.a(this.field_G, 0, param2);
            if (!fj.field_u) {
              stackIn_66_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_66_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_66_0;
            var8Lifetime1 = this.field_B * this.field_D / 256;
            var9 = -var8Lifetime1 + this.field_B;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = this.field_G[var10] * var8Lifetime1 + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_72_0 = var4;
          stackIn_72_1 = new StringBuilder().append("vd.R(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, mj param2) {
        ld var3 = null;
        try {
          var3 = sn.field_c;
          if (param1 != -3450) {
            field_y = -61;
          }
          var3.d((byte) -93, param0);
          var3.c(param2.field_r, 25564);
          var3.c(param2.field_q, 25564);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "vd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private vd() throws Throwable {
        throw new Error();
    }

    static {
        field_r = "Please enter your age in years";
        field_y = -1;
        field_s = new boolean[35];
        field_s[30] = false;
        field_s[31] = false;
        field_s[23] = true;
        field_s[13] = true;
        field_s[20] = true;
        field_s[9] = true;
        field_s[7] = true;
        field_s[24] = false;
        field_s[12] = true;
        field_s[8] = true;
        field_s[3] = true;
        field_s[10] = true;
        field_s[21] = true;
        field_s[0] = true;
        field_s[1] = true;
        field_s[17] = true;
        field_s[6] = true;
        field_s[2] = true;
        field_s[25] = false;
        field_s[14] = true;
        field_s[26] = false;
        field_s[5] = true;
        field_s[4] = true;
        field_s[29] = false;
        field_s[22] = true;
        field_s[32] = false;
        field_s[15] = true;
        field_s[28] = false;
        field_s[11] = true;
        field_s[16] = true;
        field_s[18] = true;
        field_s[27] = false;
    }
}
