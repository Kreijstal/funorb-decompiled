/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends wh {
    private int field_t;
    private int[] field_s;
    private boolean field_q;
    private wb field_y;
    static ba field_C;
    private nb field_A;
    private nb field_w;
    private int field_m;
    private nb field_r;
    private int field_v;
    private int field_u;
    static int[] field_z;
    private wb field_o;
    private boolean field_D;
    private int[] field_B;
    static aa field_n;
    private wb field_x;
    static int field_p;

    private final void a(int param0, int param1, nb param2, int param3) {
        try {
          param2.a(param0, (byte) -116, param1);
          param2.a(0, param3);
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "qe.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final wh b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void a(int param0, int param1) {
        this.field_u = param0;
        if (param1 > -45) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, -45, 18);
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
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
        var11 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_u <= 0) {
            this.d(param2);
            return;
          }
          if (this.field_q) {
            if (this.field_v > 0 &&
              !this.field_w.c((byte) -96)) {
              this.field_q = false;
              this.field_v = -this.field_v;
              this.field_x = null;
            } else {
              if (this.field_v < 0 &&
                !this.field_r.c((byte) -58)) {
                this.field_v = -this.field_v;
                this.field_q = false;
                this.field_y = null;
              }
            }
          }
          var4_int = this.field_u * (this.field_m >> 12) / 256;
          var5 = -var4_int + this.field_u;
          if (0 != this.field_v) {
            this.field_m = this.field_m + this.field_v * param2;
            if (this.field_m >= 1048576) {
              this.field_m = 1048576;
              if (!this.field_q) {
                this.field_v = 0;
                if (!this.field_D) {
                  if (this.field_y != null) {
                    this.field_r.f(11795);
                  }
                  this.field_y = null;
                }
              }
            } else {
              if (this.field_m <= 0) {
                this.field_m = 0;
                if (!this.field_q) {
                  this.field_v = 0;
                  if (!this.field_D) {
                    if (null != this.field_x) {
                      this.field_w.f(11795);
                    }
                    this.field_x = null;
                  }
                }
              }
            }
          }
          if (!oa.field_k) {
            stackIn_33_0 = param2;
          } else {
            stackIn_33_0 = param2 << 1;
          }
          var6 = stackIn_33_0;
          if (this.field_t < 256 && (null != this.field_x ||
            this.field_y != null)) {
            if (var4_int == 256) {
              this.field_w.a(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_B != null &&
                  this.field_B.length >= var6) {
                  pd.a(this.field_B, 0, var6);
                  pd.a(this.field_s, 0, var6);
                } else {
                  this.field_s = new int[var6];
                  this.field_B = new int[var6];
                }
                this.field_w.a(this.field_B, 0, param2);
                this.field_r.a(this.field_s, 0, param2);
                if (!oa.field_k) {
                  stackIn_46_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_46_0 = localTemp$0;
                }
                var7 = stackIn_46_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_B[var8] * var4_int + this.field_s[var8] * var5 >> 8);
                }
              } else {
                this.field_r.a(param0, param1, param2);
              }
            }
          }
          if (null != this.field_o &&
            0 != this.field_t) {
            if (this.field_B != null &&
              var6 <= this.field_B.length) {
              pd.a(this.field_B, 0, var6);
            } else {
              this.field_s = new int[var6];
              this.field_B = new int[var6];
            }
            this.field_A.a(this.field_B, 0, param2);
            if (!oa.field_k) {
              stackIn_60_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_60_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_60_0;
            var8Lifetime1 = this.field_t * this.field_u / 256;
            var9 = this.field_u - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var9 * param0[var10 + var7Lifetime1] + this.field_B[var10] * var8Lifetime1 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_66_0 = var4;
          stackIn_66_1 = new StringBuilder().append("qe.HA(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void d(int param0) {
        int var3;
        var3 = TrackController.field_F ? 1 : 0;
        if (this.field_m > 0 &&
          this.field_x != null) {
          this.field_w.d(param0);
        }
        if (this.field_m < 1048576 &&
          this.field_y != null) {
          this.field_r.d(param0);
        }
        if (0 < this.field_t &&
          this.field_o != null) {
          this.field_A.d(param0);
        }
        if (this.field_q) {
          if (0 < this.field_v &&
            !this.field_w.c((byte) -116)) {
            this.field_q = false;
            this.field_x = null;
            this.field_v = -this.field_v;
          } else {
            if (this.field_v < 0 &&
              !this.field_r.c((byte) -80)) {
              this.field_v = -this.field_v;
              this.field_y = null;
              this.field_q = false;
            }
          }
        }
        if (0 != this.field_v) {
          this.field_m = this.field_m + param0 * this.field_v;
          if (1048576 <= this.field_m) {
            this.field_m = 1048576;
            if (!this.field_q) {
              this.field_v = 0;
              if (!this.field_D) {
                if (null != this.field_y) {
                  this.field_r.f(11795);
                }
                this.field_y = null;
              }
            }
          } else {
            if (this.field_m <= 0) {
              this.field_m = 0;
              if (!this.field_q) {
                this.field_v = 0;
                if (!this.field_D) {
                  if (null != this.field_x) {
                    this.field_w.f(11795);
                  }
                  this.field_x = null;
                }
              }
            }
          }
        }
    }

    final static qj[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
          qe.e(52);
        }
        return gl.b(param2, 1, param1, 104, param0);
    }

    public static void e(int param0) {
        field_C = null;
        field_z = null;
        if (param0 != 1048576) {
          return;
        }
        field_n = null;
    }

    final synchronized void a(boolean param0, int param1, boolean param2, int param3, wb param4, int param5) {
        boolean stackIn_21_1 = false;
        int stackIn_35_0 = 0;
        nb stackIn_45_0 = null;
        wb stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        boolean stackIn_46_3;
        nb stackIn_54_0 = null;
        wb stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        boolean stackIn_55_3;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          if (this.field_q &&
            param0) {
            if (0 < this.field_v) {
              if (this.field_x != null) {
                this.field_w.f(11795);
              }
              this.field_x = param4;
              if (param4 != null) {
                this.field_w.a(param4, 14526, false);
                this.a(param5, -1, this.field_w, param3);
              }
            } else {
              if (this.field_y != null) {
                this.field_r.f(11795);
              }
              this.field_y = param4;
              if (param4 != null) {
                this.field_r.a(param4, 14526, false);
                this.a(param5, -1, this.field_r, param3);
              }
            }
            return;
          }
          stackIn_21_1 = (param0);
          this.field_q = stackIn_21_1;
          if (param4 == this.field_x) {
            this.field_v = param1;
            this.a(param5, -1, this.field_w, param3);
            return;
          }
          if (param4 == this.field_y) {
            this.field_v = -param1;
            this.a(param5, -1, this.field_r, param3);
            return;
          }
          if (this.field_x != null) {
            if (null != this.field_y) {
              stackIn_35_0 = (this.field_m >= 524288) ? 0 : 1;
              var7_int = stackIn_35_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (!param2) {
            this.field_m = -96;
          }
          if (var7_int == 0) {
            if (this.field_y != null) {
              this.field_r.f(11795);
            }
            this.field_y = param4;
            if (param4 != null) {
              stackIn_54_0 = this.field_r;
              stackIn_54_1 = (wb) (param4);
              stackIn_54_2 = 14526;
              stackIn_55_3 = !(param0);
              ((nb) (Object) stackIn_54_0).a(stackIn_54_1, stackIn_54_2, stackIn_55_3);
              this.a(param5, -1, this.field_r, param3);
            }
            this.field_v = -param1;
          } else {
            if (null != this.field_x) {
              this.field_w.f(11795);
            }
            this.field_x = param4;
            if (param4 != null) {
              stackIn_45_0 = this.field_w;
              stackIn_45_1 = (wb) (param4);
              stackIn_45_2 = 14526;
              stackIn_46_3 = !(param0);
              ((nb) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, stackIn_46_3);
              this.a(param5, -1, this.field_w, param3);
            }
            this.field_v = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_60_0 = var7;
          stackIn_60_1 = new StringBuilder().append("qe.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param5).append(')').toString());
        }
    }

    final wh a() {
        return null;
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
        field_C = new ba();
        field_n = new aa(7, 0, 1, 1);
    }
}
