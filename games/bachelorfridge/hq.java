/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends tda {
    private int field_q;
    private kia field_v;
    private jp field_r;
    private int field_t;
    private jp field_s;
    private boolean field_n;
    private int field_l;
    private boolean field_p;
    private kia field_m;
    private int[] field_j;
    private kia field_u;
    private int field_w;
    private int[] field_k;
    private jp field_o;

    final synchronized void a(kia param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        boolean stackIn_21_1 = false;
        int stackIn_33_0 = 0;
        jp stackIn_42_0 = null;
        kia stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        boolean stackIn_43_3;
        jp stackIn_50_0 = null;
        kia stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        boolean stackIn_51_3;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        try {
          if (!param5) {
            return;
          }
          if (this.field_p &&
            param1) {
            if (0 >= this.field_w) {
              if (null != this.field_m) {
                this.field_o.b(true);
              }
              this.field_m = param0;
              if (param0 != null) {
                this.field_o.a(param0, (byte) -115, false);
                this.a(param3, param2, this.field_o, -49);
              }
            } else {
              if (null != this.field_u) {
                this.field_s.b(true);
              }
              this.field_u = param0;
              if (param0 != null) {
                this.field_s.a(param0, (byte) -113, false);
                this.a(param3, param2, this.field_s, -72);
              }
            }
            return;
          }
          stackIn_21_1 = (param1);
          this.field_p = stackIn_21_1;
          if (param0 == this.field_u) {
            this.field_w = param4;
            this.a(param3, param2, this.field_s, -75);
            return;
          }
          if (this.field_m == param0) {
            this.field_w = -param4;
            this.a(param3, param2, this.field_o, -91);
            return;
          }
          if (this.field_u != null) {
            if (this.field_m == null) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_t >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (null != this.field_m) {
              this.field_o.b(true);
            }
            this.field_m = param0;
            if (param0 != null) {
              stackIn_50_0 = this.field_o;
              stackIn_50_1 = (kia) (param0);
              stackIn_50_2 = -111;
              stackIn_51_3 = !(param1);
              ((jp) (Object) stackIn_50_0).a(stackIn_50_1, (byte) stackIn_50_2, stackIn_51_3);
              this.a(param3, param2, this.field_o, -53);
            }
            this.field_w = -param4;
          } else {
            if (null != this.field_u) {
              this.field_s.b(true);
            }
            this.field_u = param0;
            if (param0 != null) {
              stackIn_42_0 = this.field_s;
              stackIn_42_1 = (kia) (param0);
              stackIn_42_2 = -115;
              stackIn_43_3 = !(param1);
              ((jp) (Object) stackIn_42_0).a(stackIn_42_1, (byte) stackIn_42_2, stackIn_43_3);
              this.a(param3, param2, this.field_s, -83);
            }
            this.field_w = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("hq.H(");
          if (param0 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = BachelorFridge.field_y;
        if (this.field_t > 0) {
          if (this.field_u != null) {
            this.field_s.a(param0);
            if (this.field_t >= 1048576) {
              if ((!(this.field_l <= 0)) &&
                ((this.field_v != null))) {
                this.field_r.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_m) {
                if ((!(this.field_l <= 0)) &&
                  ((this.field_v != null))) {
                  this.field_r.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_o.a(param0);
              }
            }
          } else {
            if (this.field_t >= 1048576) {
              if ((!(this.field_l <= 0)) &&
                ((this.field_v != null))) {
                this.field_r.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (null == this.field_m) {
                if ((!(this.field_l <= 0)) &&
                  ((this.field_v != null))) {
                  this.field_r.a(param0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_o.a(param0);
              }
            }
          }
        } else {
          if (this.field_t >= 1048576) {
            if ((!(this.field_l <= 0)) &&
              ((this.field_v != null))) {
              this.field_r.a(param0);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (null == this.field_m) {
              if ((!(this.field_l <= 0)) &&
                ((this.field_v != null))) {
                this.field_r.a(param0);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_o.a(param0);
            }
          }
        }
        if ((decompiledFrameRemainder0) && (this.field_l > 0 &&
          this.field_v != null)) {
          this.field_r.a(param0);
        }
        if (this.field_p) {
          if (this.field_w > 0 &&
            !this.field_s.c(28607)) {
            this.field_u = null;
            this.field_p = false;
            this.field_w = -this.field_w;
          } else {
            if (0 > this.field_w &&
              !this.field_o.c(28607)) {
              this.field_m = null;
              this.field_w = -this.field_w;
              this.field_p = false;
            }
          }
        }
        if (this.field_w != 0) {
          this.field_t = this.field_t + param0 * this.field_w;
          if (this.field_t >= 1048576) {
            this.field_t = 1048576;
            if (!this.field_p) {
              this.field_w = 0;
              if (!this.field_n) {
                if (this.field_m != null) {
                  this.field_o.b(true);
                }
                this.field_m = null;
              }
            }
          } else {
            if (this.field_t <= 0) {
              this.field_t = 0;
              if (!this.field_p) {
                this.field_w = 0;
                if (!this.field_n) {
                  if (null != this.field_u) {
                    this.field_s.b(true);
                  }
                  this.field_u = null;
                }
              }
            }
          }
        }
    }

    final tda b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
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
        var11 = BachelorFridge.field_y;
        try {
          if (this.field_q <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_p) {
            if (this.field_w > 0 &&
              !this.field_s.c(28607)) {
              this.field_u = null;
              this.field_w = -this.field_w;
              this.field_p = false;
            } else {
              if (this.field_w < 0 &&
                !this.field_o.c(28607)) {
                this.field_w = -this.field_w;
                this.field_m = null;
                this.field_p = false;
              }
            }
          }
          var4_int = this.field_q * (this.field_t >> 12) / 256;
          var5 = -var4_int + this.field_q;
          if (0 != this.field_w) {
            this.field_t = this.field_t + this.field_w * param2;
            if (this.field_t >= 1048576) {
              this.field_t = 1048576;
              if (!this.field_p) {
                this.field_w = 0;
                if (!this.field_n) {
                  if (this.field_m != null) {
                    this.field_o.b(true);
                  }
                  this.field_m = null;
                }
              }
            } else {
              if (this.field_t <= 0) {
                this.field_t = 0;
                if (!this.field_p) {
                  this.field_w = 0;
                  if (!this.field_n) {
                    if (this.field_u != null) {
                      this.field_s.b(true);
                    }
                    this.field_u = null;
                  }
                }
              }
            }
          }
          if (!pb.field_q) {
            stackIn_34_0 = param2;
          } else {
            stackIn_34_0 = param2 << 1;
          }
          var6 = stackIn_34_0;
          if (this.field_l < 256 && (this.field_u != null ||
            null != this.field_m)) {
            if (256 != var4_int) {
              if (var5 != 256) {
                if (this.field_j != null &&
                  this.field_j.length >= var6) {
                  bl.a(this.field_j, 0, var6);
                  bl.a(this.field_k, 0, var6);
                } else {
                  this.field_k = new int[var6];
                  this.field_j = new int[var6];
                }
                this.field_s.a(this.field_j, 0, param2);
                this.field_o.a(this.field_k, 0, param2);
                if (!pb.field_q) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_j[var8] + var5 * this.field_k[var8] >> 8);
                }
              } else {
                this.field_o.a(param0, param1, param2);
              }
            } else {
              this.field_s.a(param0, param1, param2);
            }
          }
          if (this.field_v != null) {
            if (this.field_l == 0) {
              return;
            }
            if (this.field_j != null &&
              this.field_j.length >= var6) {
              bl.a(this.field_j, 0, var6);
            } else {
              this.field_k = new int[var6];
              this.field_j = new int[var6];
            }
            this.field_r.a(this.field_j, 0, param2);
            if (pb.field_q) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            } else {
              stackIn_62_0 = param1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_l * this.field_q / 256;
            var9 = this.field_q - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = this.field_j[var10] * var8Lifetime1 + var9 * param0[var7Lifetime1 + var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("hq.C(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized int d() {
        return 2;
    }

    final tda a() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (!param1) {
          int[] var4 = (int[]) null;
          this.a((int[]) null, 70, 31);
        }
        this.field_q = param0;
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        try {
          if (param3 > 0) {
            this.d();
          }
          param2.a(-1, param0, (byte) -107);
          param2.c(224, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hq.J(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private hq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
