/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ag {
    private int field_v;
    private lc field_k;
    private lc field_l;
    private boolean field_p;
    private lc field_s;
    private int[] field_r;
    private int field_o;
    private pl field_w;
    private int field_x;
    static tf field_m;
    private int[] field_q;
    private boolean field_t;
    private int field_z;
    static qj field_u;
    private pl field_y;
    private pl field_n;

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          if (this.field_v <= 0) {
            this.d(param2);
            return;
          }
          if (this.field_t) {
            if (this.field_z > 0 &&
              !this.field_s.a((byte) -88)) {
              this.field_z = -this.field_z;
              this.field_y = null;
              this.field_t = false;
            } else {
              if (this.field_z < 0 &&
                !this.field_k.a((byte) -125)) {
                this.field_w = null;
                this.field_z = -this.field_z;
                this.field_t = false;
              }
            }
          }
          var4_int = (this.field_o >> 12) * this.field_v / 256;
          var5 = -var4_int + this.field_v;
          if (this.field_z != 0) {
            this.field_o = this.field_o + this.field_z * param2;
            if (this.field_o < 1048576) {
              if (this.field_o <= 0) {
                this.field_o = 0;
                if (!this.field_t) {
                  this.field_z = 0;
                  if (!this.field_p) {
                    if (null != this.field_y) {
                      this.field_s.f(16);
                    }
                    this.field_y = null;
                  }
                }
              }
            } else {
              this.field_o = 1048576;
              if (!this.field_t) {
                this.field_z = 0;
                if (!this.field_p) {
                  if (null != this.field_w) {
                    this.field_k.f(16);
                  }
                  this.field_w = null;
                }
              }
            }
          }
          if (qh.field_g) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_x < 256 && (null != this.field_y ||
            this.field_w != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_q &&
                  this.field_q.length >= var6) {
                  ji.a(this.field_q, 0, var6);
                  ji.a(this.field_r, 0, var6);
                } else {
                  this.field_q = new int[var6];
                  this.field_r = new int[var6];
                }
                this.field_s.b(this.field_q, 0, param2);
                this.field_k.b(this.field_r, 0, param2);
                if (!qh.field_g) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_r[var8] * var5 + this.field_q[var8] * var4_int >> 8);
                }
              } else {
                this.field_k.b(param0, param1, param2);
              }
            } else {
              this.field_s.b(param0, param1, param2);
            }
          }
          if (null != this.field_n &&
            this.field_x != 0) {
            if (this.field_q != null &&
              var6 <= this.field_q.length) {
              ji.a(this.field_q, 0, var6);
            } else {
              this.field_r = new int[var6];
              this.field_q = new int[var6];
            }
            this.field_l.b(this.field_q, 0, param2);
            if (!qh.field_g) {
              stackIn_62_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_x * this.field_v / 256;
            var9 = this.field_v - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_q[var10] + var9 * param0[var10 + var7Lifetime1] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("oj.K(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_m = null;
        if (param0 <= 35) {
          field_u = (qj) null;
        }
        field_u = null;
    }

    final synchronized int b() {
        return 2;
    }

    final static void a(ti param0, int param1) {
        try {
          og.a((byte) 92);
          if (param1 != 256) {
            oj.a((byte) 117);
          }
          sb.a(param0.field_w, param0.field_r, param0.field_s);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, int param3, pl param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_31_0 = 0;
        lc stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        lc stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Transmogrify.field_A ? 1 : 0;
        try {
          if (this.field_t &&
            param1) {
            if (0 < this.field_z) {
              if (this.field_y != null) {
                this.field_s.f(16);
              }
              this.field_y = param4;
              if (param4 != null) {
                this.field_s.a(123, false, param4);
                this.a(param3, (byte) -99, this.field_s, param2);
              }
            } else {
              if (this.field_w != null) {
                this.field_k.f(16);
              }
              this.field_w = param4;
              if (param4 != null) {
                this.field_k.a(-68, false, param4);
                this.a(param3, (byte) -62, this.field_k, param2);
              }
            }
            return;
          }
          stackIn_19_1 = (param1);
          this.field_t = stackIn_19_1;
          if (param4 == this.field_y) {
            this.field_z = param0;
            this.a(param3, (byte) -91, this.field_s, param2);
            return;
          }
          if (this.field_w == param4) {
            this.field_z = -param0;
            this.a(param3, (byte) -126, this.field_k, param2);
            return;
          }
          if (null != this.field_y) {
            if (this.field_w == null) {
              var7_int = 0;
            } else {
              stackIn_31_0 = (524288 <= this.field_o) ? 0 : 1;
              var7_int = stackIn_31_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (this.field_y != null) {
              this.field_s.f(16);
            }
            this.field_y = param4;
            if (param4 != null) {
              stackIn_49_0 = this.field_s;
              stackIn_49_1 = 125;
              stackIn_50_2 = !(param1);
              ((lc) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_50_2, param4);
              this.a(param3, (byte) -61, this.field_s, param2);
            }
            this.field_z = param0;
          } else {
            if (null != this.field_w) {
              this.field_k.f(16);
            }
            this.field_w = param4;
            if (param4 != null) {
              stackIn_40_0 = this.field_k;
              stackIn_40_1 = 124;
              stackIn_41_2 = !(param1);
              ((lc) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_41_2, param4);
              this.a(param3, (byte) -96, this.field_k, param2);
            }
            this.field_z = -param0;
          }
          var8 = 100 / ((25 - param5) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("oj.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param5).append(')').toString());
        }
    }

    final ag a() {
        return null;
    }

    final static uj a(byte param0) {
        if (jh.field_n == rh.field_v) {
          throw new IllegalStateException();
        }
        if (rh.field_v == gd.field_l) {
          rh.field_v = jh.field_n;
          return q.field_h;
        }
        if (param0 == 32) {
          return null;
        }
        field_m = (tf) null;
        return null;
    }

    final synchronized void d(int param0) {
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (0 < this.field_o &&
          null != this.field_y) {
          this.field_s.d(param0);
        }
        if (this.field_o < 1048576 &&
          this.field_w != null) {
          this.field_k.d(param0);
        }
        if (0 < this.field_x &&
          null != this.field_n) {
          this.field_l.d(param0);
        }
        if (this.field_t) {
          if (this.field_z > 0) {
            if (!this.field_s.a((byte) -35)) {
              this.field_z = -this.field_z;
              this.field_y = null;
              this.field_t = false;
            } else {
              if (this.field_z < 0 &&
                !this.field_k.a((byte) -110)) {
                this.field_w = null;
                this.field_t = false;
                this.field_z = -this.field_z;
              }
            }
          } else {
            if (this.field_z < 0 &&
              !this.field_k.a((byte) -110)) {
              this.field_w = null;
              this.field_t = false;
              this.field_z = -this.field_z;
            }
          }
        }
        if (this.field_z != 0) {
          this.field_o = this.field_o + param0 * this.field_z;
          if (1048576 > this.field_o) {
            if (this.field_o <= 0) {
              this.field_o = 0;
              if (!this.field_t) {
                this.field_z = 0;
                if (!this.field_p) {
                  if (null != this.field_y) {
                    this.field_s.f(16);
                  }
                  this.field_y = null;
                }
              }
            }
          } else {
            this.field_o = 1048576;
            if (!this.field_t) {
              this.field_z = 0;
              if (!this.field_p) {
                if (this.field_w != null) {
                  this.field_k.f(16);
                }
                this.field_w = null;
              }
            }
          }
        }
    }

    final ag d() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (param1) {
          this.field_q = (int[]) null;
        }
        this.field_v = param0;
    }

    private final void a(int param0, byte param1, lc param2, int param3) {
        try {
          if (param1 > -58) {
            this.d();
          }
          param2.c(-1, param3, 0);
          param2.a(true, param0);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "oj.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    private oj() throws Throwable {
        throw new Error();
    }

    static {
        field_m = new tf(11, 0, 1, 2);
        field_u = new qj();
    }
}
