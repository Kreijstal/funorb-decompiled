/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends qd {
    private int[] field_q;
    private kb field_B;
    private ej field_n;
    private int[] field_u;
    private boolean field_t;
    static int[] field_C;
    private int field_x;
    private int field_y;
    static boolean[][][] field_z;
    private boolean field_s;
    static int[] field_m;
    static int[] field_p;
    private int field_w;
    private ej field_r;
    private kb field_v;
    private kb field_D;
    private ej field_A;
    private int field_o;

    final static void b(byte param0) {
        qb.field_c = null;
        gi.field_c = false;
        if (param0 >= -102) {
          field_C = (int[]) null;
        }
        ji.field_n = null;
        qi.field_b = null;
        jl.field_c = null;
    }

    final qd c() {
        return null;
    }

    final synchronized void a(int param0, int param1) {
        this.field_y = param1;
        if (param0 >= -118) {
          this.field_D = (kb) null;
        }
    }

    private final void a(int param0, int param1, kb param2, int param3) {
        param2.a(-3262, param1, -1);
        if (param0 != 1553517424) {
          return;
        }
        try {
          param2.b((byte) 44, param3);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "fj.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final qd b() {
        return null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >> 16;
        int var4 = param1 & 65535;
        int var5 = param2 >> 16;
        if (param0 != 1870096848) {
          field_C = (int[]) null;
        }
        int var6 = 65535 & param2;
        return (var4 * var6 >> 16) + var3 * param2 + var5 * var4;
    }

    final synchronized void a(int param0, int param1, int param2, boolean param3, int param4, ej param5) {
        boolean stackIn_20_1 = false;
        int stackIn_33_0 = 0;
        kb stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        ej stackIn_42_2 = null;
        boolean stackIn_43_3;
        kb stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        ej stackIn_51_2 = null;
        boolean stackIn_52_3;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_t &&
            param3) {
            if (0 >= this.field_x) {
              if (this.field_A != null) {
                this.field_v.b((byte) 31);
              }
              this.field_A = param5;
              if (param5 != null) {
                this.field_v.a(param0 - 20174, param5, false);
                this.a(param0 + 1553505376, param2, this.field_v, param1);
              }
            } else {
              if (this.field_n != null) {
                this.field_B.b((byte) 31);
              }
              this.field_n = param5;
              if (param5 != null) {
                this.field_B.a(param0 ^ -12462, param5, false);
                this.a(param0 + 1553505376, param2, this.field_B, param1);
              }
            }
            return;
          }
          stackIn_20_1 = (param3);
          this.field_t = stackIn_20_1;
          if (param5 == this.field_n) {
            this.field_x = param4;
            this.a(1553517424, param2, this.field_B, param1);
            return;
          }
          if (param5 == this.field_A) {
            this.field_x = -param4;
            this.a(1553517424, param2, this.field_v, param1);
            return;
          }
          if (this.field_n != null) {
            if (this.field_A != null) {
              stackIn_33_0 = (this.field_w >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (param0 != 12048) {
            return;
          }
          if (var7_int == 0) {
            if (null != this.field_A) {
              this.field_v.b((byte) 31);
            }
            this.field_A = param5;
            if (param5 != null) {
              stackIn_51_0 = this.field_v;
              stackIn_51_1 = -8126;
              stackIn_51_2 = (ej) (param5);
              stackIn_52_3 = !(param3);
              ((kb) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2, stackIn_52_3);
              this.a(1553517424, param2, this.field_v, param1);
            }
            this.field_x = -param4;
          } else {
            if (null != this.field_n) {
              this.field_B.b((byte) 31);
            }
            this.field_n = param5;
            if (param5 != null) {
              stackIn_42_0 = this.field_B;
              stackIn_42_1 = -8126;
              stackIn_42_2 = (ej) (param5);
              stackIn_43_3 = !(param3);
              ((kb) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_43_3);
              this.a(1553517424, param2, this.field_B, param1);
            }
            this.field_x = param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("fj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_z = (boolean[][][]) null;
        field_C = null;
        field_m = null;
        if (param0) {
          fj.a(34, -118, -79);
        }
        field_p = null;
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (this.field_w > 0 &&
          null != this.field_n) {
          this.field_B.a(param0);
        }
        if (this.field_w < 1048576 &&
          null != this.field_A) {
          this.field_v.a(param0);
        }
        if (this.field_o > 0 &&
          null != this.field_r) {
          this.field_D.a(param0);
        }
        if (this.field_t) {
          if (this.field_x > 0 &&
            !this.field_B.d(0)) {
            this.field_t = false;
            this.field_n = null;
            this.field_x = -this.field_x;
          } else {
            if (this.field_x < 0 &&
              !this.field_v.d(0)) {
              this.field_t = false;
              this.field_x = -this.field_x;
              this.field_A = null;
            }
          }
        }
        if (this.field_x != 0) {
          this.field_w = this.field_w + param0 * this.field_x;
          if (this.field_w >= 1048576) {
            this.field_w = 1048576;
            if (!this.field_t) {
              this.field_x = 0;
              if (!this.field_s) {
                if (this.field_A != null) {
                  this.field_v.b((byte) 31);
                }
                this.field_A = null;
              }
            }
          } else {
            if (0 >= this.field_w) {
              this.field_w = 0;
              if (!this.field_t) {
                this.field_x = 0;
                if (!this.field_s) {
                  if (this.field_n != null) {
                    this.field_B.b((byte) 31);
                  }
                  this.field_n = null;
                }
              }
            }
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
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
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          if (this.field_y <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_t) {
            if (0 < this.field_x &&
              !this.field_B.d(0)) {
              this.field_n = null;
              this.field_t = false;
              this.field_x = -this.field_x;
            } else {
              if (this.field_x < 0 &&
                !this.field_v.d(0)) {
                this.field_x = -this.field_x;
                this.field_A = null;
                this.field_t = false;
              }
            }
          }
          var4_int = this.field_y * (this.field_w >> 12) / 256;
          var5 = -var4_int + this.field_y;
          if (this.field_x != 0) {
            this.field_w = this.field_w + param2 * this.field_x;
            if (this.field_w >= 1048576) {
              this.field_w = 1048576;
              if (!this.field_t) {
                this.field_x = 0;
                if (!this.field_s) {
                  if (this.field_A != null) {
                    this.field_v.b((byte) 31);
                  }
                  this.field_A = null;
                }
              }
            } else {
              if (0 >= this.field_w) {
                this.field_w = 0;
                if (!this.field_t) {
                  this.field_x = 0;
                  if (!this.field_s) {
                    if (this.field_n != null) {
                      this.field_B.b((byte) 31);
                    }
                    this.field_n = null;
                  }
                }
              }
            }
          }
          if (kh.field_g) {
            stackIn_35_0 = param2 << 1;
          } else {
            stackIn_35_0 = param2;
          }
          var6 = stackIn_35_0;
          if (this.field_o < 256 && (null != this.field_n ||
            this.field_A != null)) {
            if (256 == var4_int) {
              this.field_B.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (null != this.field_u &&
                  var6 <= this.field_u.length) {
                  he.a(this.field_u, 0, var6);
                  he.a(this.field_q, 0, var6);
                } else {
                  this.field_u = new int[var6];
                  this.field_q = new int[var6];
                }
                this.field_B.b(this.field_u, 0, param2);
                this.field_v.b(this.field_q, 0, param2);
                if (kh.field_g) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_50_0 = localTemp$0;
                } else {
                  stackIn_50_0 = param1;
                }
                var7 = stackIn_50_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_u[var8] * var4_int + var5 * this.field_q[var8] >> 8);
                }
              } else {
                this.field_v.b(param0, param1, param2);
              }
            }
          }
          if (null != this.field_r) {
            if (0 == this.field_o) {
              return;
            }
            if (this.field_u != null &&
              var6 <= this.field_u.length) {
              he.a(this.field_u, 0, var6);
            } else {
              this.field_q = new int[var6];
              this.field_u = new int[var6];
            }
            this.field_D.b(this.field_u, 0, param2);
            if (kh.field_g) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_65_0 = localTemp$1;
            } else {
              stackIn_65_0 = param1;
            }
            var7Lifetime1 = stackIn_65_0;
            var8Lifetime1 = this.field_o * this.field_y / 256;
            var9 = this.field_y - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = this.field_u[var10] * var8Lifetime1 + var9 * param0[var10 + var7Lifetime1] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_71_0 = var4;
          stackIn_71_1 = new StringBuilder().append("fj.E(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private fj() throws Throwable {
        throw new Error();
    }

    static {
        field_C = new int[128];
        field_p = new int[2];
        field_z = new boolean[][][]{new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}, new boolean[][]{new boolean[]{false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, true, true, true, true, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, true, true, true, false}, new boolean[]{false, true, true, true, false}, new boolean[]{false}}, new boolean[][]{new boolean[]{false, false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false, false, false}, new boolean[]{false, false, false}, new boolean[]{false}, new boolean[]{false, false, false, false, false, false}}};
    }
}
