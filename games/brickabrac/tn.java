/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends qd {
    private int field_s;
    static int[] field_n;
    private boolean field_E;
    static int field_C;
    private int[] field_q;
    private vm field_o;
    private int field_u;
    private vm field_r;
    private vm field_t;
    private ie field_D;
    private int field_p;
    private ie field_z;
    private int[] field_G;
    private int field_y;
    private ie field_x;
    static String field_B;
    private boolean field_v;
    static gq field_m;
    static volatile boolean field_A;
    static String field_w;

    final qd d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_p <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_v) {
            if (this.field_y > 0 &&
              !this.field_D.d(-1)) {
              this.field_r = null;
              this.field_v = false;
              this.field_y = -this.field_y;
            } else {
              if (this.field_y < 0 &&
                !this.field_x.d(-1)) {
                this.field_y = -this.field_y;
                this.field_o = null;
                this.field_v = false;
              }
            }
          }
          var4_int = (this.field_s >> 12) * this.field_p / 256;
          var5 = -var4_int + this.field_p;
          if (this.field_y != 0) {
            this.field_s = this.field_s + this.field_y * param2;
            if (1048576 > this.field_s) {
              if (this.field_s <= 0) {
                this.field_s = 0;
                if (!this.field_v) {
                  this.field_y = 0;
                  if (!this.field_E) {
                    if (null != this.field_r) {
                      this.field_D.f(-24774);
                    }
                    this.field_r = null;
                  }
                }
              }
            } else {
              this.field_s = 1048576;
              if (!this.field_v) {
                this.field_y = 0;
                if (!this.field_E) {
                  if (null != this.field_o) {
                    this.field_x.f(-24774);
                  }
                  this.field_o = null;
                }
              }
            }
          }
          if (!tj.field_g) {
            stackIn_33_0 = param2;
          } else {
            stackIn_33_0 = param2 << 1;
          }
          var6 = stackIn_33_0;
          if (this.field_u < 256 && (this.field_r != null ||
            this.field_o != null)) {
            if (var4_int != 256) {
              if (256 != var5) {
                if (this.field_q != null &&
                  var6 <= this.field_q.length) {
                  pm.a(this.field_q, 0, var6);
                  pm.a(this.field_G, 0, var6);
                } else {
                  this.field_q = new int[var6];
                  this.field_G = new int[var6];
                }
                this.field_D.b(this.field_q, 0, param2);
                this.field_x.b(this.field_G, 0, param2);
                if (!tj.field_g) {
                  stackIn_49_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_49_0 = localTemp$0;
                }
                var7 = stackIn_49_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var5 * this.field_G[var8] + this.field_q[var8] * var4_int >> 8);
                }
              } else {
                this.field_x.b(param0, param1, param2);
              }
            } else {
              this.field_D.b(param0, param1, param2);
            }
          }
          if (null != this.field_t) {
            if (this.field_u == 0) {
              return;
            }
            if (this.field_q != null &&
              this.field_q.length >= var6) {
              pm.a(this.field_q, 0, var6);
            } else {
              this.field_G = new int[var6];
              this.field_q = new int[var6];
            }
            this.field_z.b(this.field_q, 0, param2);
            if (tj.field_g) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_u * this.field_p / 256;
            var9 = -var8Lifetime1 + this.field_p;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_q[var10] + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("tn.D(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final qd a() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (this.field_s > 0 &&
          null != this.field_r) {
          this.field_D.a(param0);
        }
        if (this.field_s < 1048576 &&
          null != this.field_o) {
          this.field_x.a(param0);
        }
        if (this.field_u > 0 &&
          null != this.field_t) {
          this.field_z.a(param0);
        }
        if (this.field_v) {
          if (this.field_y > 0 &&
            !this.field_D.d(-1)) {
            this.field_v = false;
            this.field_r = null;
            this.field_y = -this.field_y;
          } else {
            if (0 > this.field_y &&
              !this.field_x.d(-1)) {
              this.field_v = false;
              this.field_y = -this.field_y;
              this.field_o = null;
            }
          }
        }
        if (this.field_y != 0) {
          this.field_s = this.field_s + param0 * this.field_y;
          if (this.field_s < 1048576) {
            if (this.field_s <= 0) {
              this.field_s = 0;
              if (!this.field_v) {
                this.field_y = 0;
                if (!this.field_E) {
                  if (this.field_r != null) {
                    this.field_D.f(-24774);
                  }
                  this.field_r = null;
                }
              }
            }
          } else {
            this.field_s = 1048576;
            if (!this.field_v) {
              this.field_y = 0;
              if (!this.field_E) {
                if (null != this.field_o) {
                  this.field_x.f(-24774);
                }
                this.field_o = null;
              }
            }
          }
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, int param4, vm param5) {
        boolean stackIn_20_1 = false;
        int stackIn_33_0 = 0;
        ie stackIn_42_0 = null;
        vm stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        boolean stackIn_43_3;
        ie stackIn_52_0 = null;
        vm stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        boolean stackIn_53_3;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_v &&
            param1) {
            if (0 < this.field_y) {
              if (null != this.field_r) {
                this.field_D.f(-24774);
              }
              this.field_r = param5;
              if (param5 != null) {
                this.field_D.a(param5, 127, false);
                this.a(param0, false, this.field_D, param4);
              }
            } else {
              if (this.field_o != null) {
                this.field_x.f(-24774);
              }
              this.field_o = param5;
              if (param5 != null) {
                this.field_x.a(param5, -66, false);
                this.a(param0, false, this.field_x, param4);
              }
            }
            return;
          }
          stackIn_20_1 = (param1);
          this.field_v = stackIn_20_1;
          if (param5 == this.field_r) {
            this.field_y = param2;
            this.a(param0, false, this.field_D, param4);
            return;
          }
          if (param5 == this.field_o) {
            this.field_y = -param2;
            this.a(param0, false, this.field_x, param4);
            return;
          }
          if (param3 != 22) {
            this.b();
          }
          if (this.field_r == null) {
            var7_int = 1;
          } else {
            if (null == this.field_o) {
              var7_int = 0;
            } else {
              stackIn_33_0 = (this.field_s >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            }
          }
          if (var7_int != 0) {
            if (null != this.field_r) {
              this.field_D.f(-24774);
            }
            this.field_r = param5;
            if (param5 != null) {
              stackIn_52_0 = this.field_D;
              stackIn_52_1 = (vm) (param5);
              stackIn_52_2 = 126;
              stackIn_53_3 = !(param1);
              ((ie) (Object) stackIn_52_0).a(stackIn_52_1, stackIn_52_2, stackIn_53_3);
              this.a(param0, false, this.field_D, param4);
            }
            this.field_y = param2;
          } else {
            if (this.field_o != null) {
              this.field_x.f(-24774);
            }
            this.field_o = param5;
            if (param5 != null) {
              stackIn_42_0 = this.field_x;
              stackIn_42_1 = (vm) (param5);
              stackIn_42_2 = 126;
              stackIn_43_3 = !(param1);
              ((ie) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_43_3);
              this.a(param0, false, this.field_x, param4);
            }
            this.field_y = -param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_58_0 = var7;
          stackIn_58_1 = new StringBuilder().append("tn.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    final synchronized int b() {
        return 2;
    }

    public static void c(int param0) {
        if (param0 > -18) {
          tn.c(-21);
        }
        field_B = null;
        field_m = null;
        field_n = null;
        field_w = null;
    }

    final synchronized void a(boolean param0, int param1) {
        this.field_p = param1;
        if (!param0) {
          this.b();
        }
    }

    private final void a(int param0, boolean param1, ie param2, int param3) {
        try {
          param2.e(param0, -1, 16);
          param2.b(param3, -606970073);
          if (param1) {
            this.field_E = false;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "tn.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        b.field_c = param1;
        if (param2 != 256) {
          return;
        }
        so.field_b = param0;
        ae.field_f = param3;
        pe.field_s = param4;
    }

    private tn() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_B = "Highscores";
        field_n = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)((var0 << 1) - 1);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (!(field_n.length > var3)) {
            var3 = -1 + field_n.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_n[var1] = var0;
          }
        }
        field_A = false;
        field_w = "Speed up: increases the speed of any ball in play.";
    }
}
