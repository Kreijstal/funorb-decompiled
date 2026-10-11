/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends hj {
    private tv field_t;
    private int field_C;
    static hr[] field_q;
    private int[] field_s;
    private tv field_y;
    private int[] field_A;
    private boolean field_u;
    static ri field_p;
    private tv field_v;
    private int field_z;
    private int field_B;
    private bs field_D;
    private boolean field_w;
    bs field_r;
    bs field_x;
    private int field_o;

    public static void c(int param0) {
        field_p = null;
        int var1 = -38 / ((-89 - param0) / 33);
        field_q = null;
    }

    final synchronized void a(int param0, int param1, tv param2, boolean param3, int param4, int param5) {
        boolean stackIn_22_1 = false;
        int stackIn_34_0 = 0;
        bs stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        bs stackIn_53_0 = null;
        boolean stackIn_54_1 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        wb[] var9 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_u &&
            param3) {
            if (this.field_C <= 0) {
              if (null != this.field_y) {
                this.field_r.e(0);
              }
              this.field_y = param2;
              if (param2 != null) {
                this.field_r.a(false, param2, 60);
                this.a(param1, (byte) 24, this.field_r, param5);
              }
            } else {
              if (this.field_v != null) {
                this.field_x.e(0);
              }
              this.field_v = param2;
              if (param2 != null) {
                this.field_x.a(false, param2, 117);
                this.a(param1, (byte) 39, this.field_x, param5);
              }
            }
            return;
          }
          if (param0 != 1) {
            var9 = (wb[]) null;
            ud.a(57, -30, 8, 30, (wb[]) null);
          }
          stackIn_22_1 = (param3);
          this.field_u = stackIn_22_1;
          if (param2 == this.field_v) {
            this.field_C = param4;
            this.a(param1, (byte) -114, this.field_x, param5);
            return;
          }
          if (param2 == this.field_y) {
            this.field_C = -param4;
            this.a(param1, (byte) -82, this.field_r, param5);
            return;
          }
          if (this.field_v != null) {
            if (this.field_y == null) {
              var7_int = 0;
            } else {
              stackIn_34_0 = (524288 <= this.field_o) ? 0 : 1;
              var7_int = stackIn_34_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (null != this.field_y) {
              this.field_r.e(0);
            }
            this.field_y = param2;
            if (param2 != null) {
              stackIn_53_0 = this.field_r;
              stackIn_54_1 = !(param3);
              ((bs) (Object) stackIn_53_0).a(stackIn_54_1, param2, param0 + 67);
              this.a(param1, (byte) 45, this.field_r, param5);
            }
            this.field_C = -param4;
          } else {
            if (null != this.field_v) {
              this.field_x.e(param0 - 1);
            }
            this.field_v = param2;
            if (param2 != null) {
              stackIn_43_0 = this.field_x;
              stackIn_44_1 = !(param3);
              ((bs) (Object) stackIn_43_0).a(stackIn_44_1, param2, 121);
              this.a(param1, (byte) -114, this.field_x, param5);
            }
            this.field_C = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("ud.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wb[] param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param4 != null &&
            param1 > 0) {
            var5_int = param4[0].field_z;
            var6 = param4[2].field_z;
            var7 = param4[1].field_z;
            param4[0].a(param3, param0);
            param4[param2].a(-var6 + (param1 + param3), param0);
            lk.b(mo.field_t);
            lk.e(param3 + var5_int, param0, -var6 + param3 + param1, param4[1].field_w + param0);
            var8 = param3 + var5_int;
            var9 = param1 + param3 - var6;
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param4[1].a(param3, param0);
            }
            lk.a(mo.field_t);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("ud.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, bs param2, int param3) {
        try {
          param2.a((byte) -86, -1, param3);
          param2.b(param0, 0);
          int var5_int = -21 / ((param1 + 28) / 47);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ud.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final synchronized void a(byte param0, int param1) {
        if (param0 != -43) {
          return;
        }
        this.field_B = param1;
    }

    private final void a(bs param0, int param1, bs param2) {
        try {
          if (param1 > -55) {
            this.d();
          }
          this.field_o = 1048576;
          this.field_r = param0;
          this.field_x = param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ud.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final hj c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_o > 0) {
          if (null != this.field_v) {
            this.field_x.a(param0);
          }
          if (this.field_o >= 1048576) {
            if ((!(0 >= this.field_z)) &&
              ((this.field_t != null))) {
              this.field_D.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.field_y) {
              if ((!(0 >= this.field_z)) &&
                ((this.field_t != null))) {
                this.field_D.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_r.a(param0);
            }
          }
        } else {
          if (this.field_o >= 1048576) {
            if ((!(0 >= this.field_z)) &&
              ((this.field_t != null))) {
              this.field_D.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.field_y) {
              if ((!(0 >= this.field_z)) &&
                ((this.field_t != null))) {
                this.field_D.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_r.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (0 < this.field_z &&
          this.field_t != null)) {
          this.field_D.a(param0);
        }
        if (this.field_u) {
          if (this.field_C > 0 &&
            !this.field_x.c(-8192)) {
            this.field_C = -this.field_C;
            this.field_u = false;
            this.field_v = null;
          } else {
            if (0 > this.field_C &&
              !this.field_r.c(-8192)) {
              this.field_C = -this.field_C;
              this.field_y = null;
              this.field_u = false;
            }
          }
        }
        if (this.field_C != 0) {
          this.field_o = this.field_o + this.field_C * param0;
          if (this.field_o < 1048576) {
            if (0 >= this.field_o) {
              this.field_o = 0;
              if (!this.field_u) {
                this.field_C = 0;
                if (!this.field_w) {
                  if (this.field_v != null) {
                    this.field_x.e(0);
                  }
                  this.field_v = null;
                }
              }
            }
          } else {
            this.field_o = 1048576;
            if (!this.field_u) {
              this.field_C = 0;
              if (!this.field_w) {
                if (this.field_y != null) {
                  this.field_r.e(0);
                }
                this.field_y = null;
              }
            }
          }
        }
    }

    final synchronized int d() {
        return 2;
    }

    final hj a() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
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
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (this.field_B <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_u) {
            if (0 < this.field_C &&
              !this.field_x.c(-8192)) {
              this.field_u = false;
              this.field_C = -this.field_C;
              this.field_v = null;
            } else {
              if (0 > this.field_C &&
                !this.field_r.c(-8192)) {
                this.field_y = null;
                this.field_C = -this.field_C;
                this.field_u = false;
              }
            }
          }
          var4_int = (this.field_o >> 12) * this.field_B / 256;
          var5 = this.field_B - var4_int;
          if (this.field_C != 0) {
            this.field_o = this.field_o + this.field_C * param2;
            if (this.field_o < 1048576) {
              if (0 >= this.field_o) {
                this.field_o = 0;
                if (!this.field_u) {
                  this.field_C = 0;
                  if (!this.field_w) {
                    if (null != this.field_v) {
                      this.field_x.e(0);
                    }
                    this.field_v = null;
                  }
                }
              }
            } else {
              this.field_o = 1048576;
              if (!this.field_u) {
                this.field_C = 0;
                if (!this.field_w) {
                  if (null != this.field_y) {
                    this.field_r.e(0);
                  }
                  this.field_y = null;
                }
              }
            }
          }
          if (du.field_o) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_z < 256 && (this.field_v != null ||
            this.field_y != null)) {
            if (var4_int == 256) {
              this.field_x.b(param0, param1, param2);
            } else {
              if (256 != var5) {
                if (this.field_s != null &&
                  var6 <= this.field_s.length) {
                  la.a(this.field_s, 0, var6);
                  la.a(this.field_A, 0, var6);
                } else {
                  this.field_s = new int[var6];
                  this.field_A = new int[var6];
                }
                this.field_x.b(this.field_s, 0, param2);
                this.field_r.b(this.field_A, 0, param2);
                if (!du.field_o) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_A[var8] + var4_int * this.field_s[var8] >> 8);
                }
              } else {
                this.field_r.b(param0, param1, param2);
              }
            }
          }
          if (null != this.field_t &&
            this.field_z != 0) {
            if (this.field_s != null &&
              var6 <= this.field_s.length) {
              la.a(this.field_s, 0, var6);
            } else {
              this.field_A = new int[var6];
              this.field_s = new int[var6];
            }
            this.field_D.b(this.field_s, 0, param2);
            if (du.field_o) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_61_0 = localTemp$1;
            } else {
              stackIn_61_0 = param1;
            }
            var7Lifetime1 = stackIn_61_0;
            var8Lifetime1 = this.field_z * this.field_B / 256;
            var9 = this.field_B - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = this.field_s[var10] * var8Lifetime1 + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_67_0 = var4;
          stackIn_67_1 = new StringBuilder().append("ud.J(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ud(bs param0, bs param1) {
        this.field_B = 256;
        this.field_w = false;
        this.field_z = 0;
        try {
          this.a(param1, -79, param0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ud.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
