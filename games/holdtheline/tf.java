/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends tj {
    private int field_s;
    private int[] field_u;
    static uf field_A;
    private boolean field_w;
    kf field_q;
    private int field_B;
    private int field_D;
    private int field_y;
    private vi field_m;
    private kf field_p;
    static en field_n;
    kf field_C;
    private vi field_z;
    static String field_r;
    private boolean field_x;
    private vi field_t;
    private int[] field_v;
    static uf field_o;

    final synchronized void a(int param0) {
        int var3;
        var3 = HoldTheLine.field_D;
        if (this.field_y > 0 &&
          this.field_z != null) {
          this.field_q.a(param0);
        }
        if (1048576 > this.field_y &&
          null != this.field_m) {
          this.field_C.a(param0);
        }
        if (this.field_s > 0 &&
          null != this.field_t) {
          this.field_p.a(param0);
        }
        if (this.field_x) {
          if (0 < this.field_D &&
            !this.field_q.c((byte) -128)) {
            this.field_x = false;
            this.field_z = null;
            this.field_D = -this.field_D;
          } else {
            if (this.field_D < 0 &&
              !this.field_C.c((byte) 39)) {
              this.field_x = false;
              this.field_D = -this.field_D;
              this.field_m = null;
            }
          }
        }
        if (0 != this.field_D) {
          this.field_y = this.field_y + this.field_D * param0;
          if (this.field_y >= 1048576) {
            this.field_y = 1048576;
            if (!this.field_x) {
              this.field_D = 0;
              if (!this.field_w) {
                if (null != this.field_m) {
                  this.field_C.f(-127);
                }
                this.field_m = null;
              }
            }
          } else {
            if (0 >= this.field_y) {
              this.field_y = 0;
              if (!this.field_x) {
                this.field_D = 0;
                if (!this.field_w) {
                  if (null != this.field_z) {
                    this.field_q.f(-127);
                  }
                  this.field_z = null;
                }
              }
            }
          }
        }
    }

    final static hj[] a(int param0, gn param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        hj[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!qg.a(param2, param0, (byte) -27, param1)) {
            stackIn_2_0 = null;
            return (hj[]) (stackIn_2_0);
          }
          if (param3) {
            tf.e(-27);
          }
          stackIn_6_0 = jd.h(-128);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("tf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(int param0, vi param1) {
        vi var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 >= -11) {
            var4 = (vi) null;
            this.a(-93, (vi) null);
          }
          stackIn_7_0 = (param1 == this.field_z) || (this.field_m == param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("tf.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final tj b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_30_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_57_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
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
        var11 = HoldTheLine.field_D;
        try {
          if (this.field_B <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_x) {
            if (0 < this.field_D &&
              !this.field_q.c((byte) -127)) {
              this.field_D = -this.field_D;
              this.field_x = false;
              this.field_z = null;
            } else {
              if (this.field_D < 0 &&
                !this.field_C.c((byte) 101)) {
                this.field_D = -this.field_D;
                this.field_x = false;
                this.field_m = null;
              }
            }
          }
          var4_int = (this.field_y >> 12) * this.field_B / 256;
          var5 = this.field_B - var4_int;
          if (this.field_D != 0) {
            this.field_y = this.field_y + param2 * this.field_D;
            if (this.field_y < 1048576) {
              if (0 >= this.field_y) {
                this.field_y = 0;
                if (!this.field_x) {
                  this.field_D = 0;
                  if (!this.field_w) {
                    if (this.field_z != null) {
                      this.field_q.f(-124);
                    }
                    this.field_z = null;
                  }
                }
              }
            } else {
              this.field_y = 1048576;
              if (!this.field_x) {
                this.field_D = 0;
                if (!this.field_w) {
                  if (null != this.field_m) {
                    this.field_C.f(-127);
                  }
                  this.field_m = null;
                }
              }
            }
          }
          if (!lo.field_t) {
            stackIn_30_0 = param2;
          } else {
            stackIn_30_0 = param2 << 1;
          }
          var6 = stackIn_30_0;
          if (this.field_s < 256 && (this.field_z != null ||
            this.field_m != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_v &&
                  var6 <= this.field_v.length) {
                  bc.a(this.field_v, 0, var6);
                  bc.a(this.field_u, 0, var6);
                } else {
                  this.field_u = new int[var6];
                  this.field_v = new int[var6];
                }
                this.field_q.b(this.field_v, 0, param2);
                this.field_C.b(this.field_u, 0, param2);
                if (lo.field_t) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_44_0 = localTemp$0;
                } else {
                  stackIn_44_0 = param1;
                }
                var7 = stackIn_44_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_v[var8] * var4_int + var5 * this.field_u[var8] >> 8);
                }
              } else {
                this.field_C.b(param0, param1, param2);
              }
            } else {
              this.field_q.b(param0, param1, param2);
            }
          }
          if (this.field_t != null &&
            0 != this.field_s) {
            if (this.field_v != null &&
              this.field_v.length >= var6) {
              bc.a(this.field_v, 0, var6);
            } else {
              this.field_u = new int[var6];
              this.field_v = new int[var6];
            }
            this.field_p.b(this.field_v, 0, param2);
            if (!lo.field_t) {
              stackIn_57_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_57_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_57_0;
            var8Lifetime1 = this.field_s * this.field_B / 256;
            var9 = -var8Lifetime1 + this.field_B;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = var9 * param0[var10 + var7Lifetime1] + var8Lifetime1 * this.field_v[var10] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_63_0 = var4;
          stackIn_63_1 = new StringBuilder().append("tf.A(");
          if (param0 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static java.awt.Container e(int param0) {
        if (param0 != 0) {
          field_o = (uf) null;
        }
        if (null != fm.field_a) {
          return (java.awt.Container) ((Object) fm.field_a);
        }
        return (java.awt.Container) ((Object) en.a(111));
    }

    final tj a() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        this.field_B = param0;
        if (param1 != -32284) {
          this.c();
        }
    }

    public static void f(int param0) {
        field_r = null;
        int var1 = 38 / ((param0 + 51) / 59);
        field_n = null;
        field_A = null;
        field_o = null;
    }

    final static float a(byte param0, float param1, wc[] param2) {
        int var5 = 0;
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        gn var7 = null;
        float stackIn_9_0 = 0.0f;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var3_float = 0.0f;
          var4 = (int)param1;
          if (param0 <= 74) {
            var7 = (gn) null;
            tf.a(115, (gn) null, 72, true);
          }
          for (var5 = 0; var5 < var4; var5++) {
            var3_float = var3_float + param2[var5].f(50);
          }
          if (param1 != (float)var4) {
            var3_float = var3_float + param2[var4].f(50) * ((float)(-var4) + param1);
          }
          stackIn_9_0 = var3_float;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(kf param0, byte param1, kf param2) {
        try {
          this.field_q = param0;
          this.field_y = 1048576;
          int var4_int = 91 / ((param1 - 21) / 54);
          this.field_C = param2;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "tf.K(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, kf param1, int param2, int param3) {
        try {
          param1.a((byte) 108, -1, param3);
          if (param2 != 17945) {
            this.field_y = 96;
          }
          param1.b(param0, param2 - 17943);
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "tf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0, int param1, vi param2, byte param3, boolean param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_34_0 = 0;
        kf stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        vi stackIn_42_2 = null;
        boolean stackIn_43_3;
        kf stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        vi stackIn_52_2 = null;
        boolean stackIn_53_3;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        vi var9 = null;
        var8 = HoldTheLine.field_D;
        try {
          if (this.field_x &&
            param4) {
            if (this.field_D > 0) {
              if (this.field_z != null) {
                this.field_q.f(-127);
              }
              this.field_z = param2;
              if (param2 != null) {
                this.field_q.a(param3 - 2128026886, param2, false);
                this.a(param1, this.field_q, 17945, param5);
              }
            } else {
              if (this.field_m != null) {
                this.field_C.f(-125);
              }
              this.field_m = param2;
              if (param2 != null) {
                this.field_C.a(-2128027000, param2, false);
                this.a(param1, this.field_C, 17945, param5);
              }
            }
            return;
          }
          stackIn_19_1 = (param4);
          this.field_x = stackIn_19_1;
          if (this.field_z == param2) {
            this.field_D = param0;
            this.a(param1, this.field_q, 17945, param5);
            return;
          }
          if (param2 == this.field_m) {
            this.field_D = -param0;
            this.a(param1, this.field_C, 17945, param5);
            return;
          }
          if (param3 != -114) {
            var9 = (vi) null;
            this.a(85, 112, (vi) null, (byte) -26, false, -91);
          }
          if (this.field_z == null) {
            var7_int = 1;
          } else {
            if (this.field_m != null) {
              stackIn_34_0 = (this.field_y >= 524288) ? 0 : 1;
              var7_int = stackIn_34_0;
            } else {
              var7_int = 0;
            }
          }
          if (var7_int == 0) {
            if (this.field_m != null) {
              this.field_C.f(-125);
            }
            this.field_m = param2;
            if (param2 != null) {
              stackIn_52_0 = this.field_C;
              stackIn_52_1 = -2128027000;
              stackIn_52_2 = (vi) (param2);
              stackIn_53_3 = !(param4);
              ((kf) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_53_3);
              this.a(param1, this.field_C, 17945, param5);
            }
            this.field_D = -param0;
          } else {
            if (null != this.field_z) {
              this.field_q.f(param3 ^ 13);
            }
            this.field_z = param2;
            if (param2 != null) {
              stackIn_42_0 = this.field_q;
              stackIn_42_1 = -2128027000;
              stackIn_42_2 = (vi) (param2);
              stackIn_43_3 = !(param4);
              ((kf) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_43_3);
              this.a(param1, this.field_q, param3 ^ -18025, param5);
            }
            this.field_D = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_58_0 = var7;
          stackIn_58_1 = new StringBuilder().append("tf.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public tf() {
        this.field_s = 0;
        this.field_B = 256;
        this.field_w = false;
        kf var1 = new kf();
        this.a(var1, (byte) 126, new kf(var1));
    }

    static {
        field_r = "1P";
        field_n = new en();
    }
}
