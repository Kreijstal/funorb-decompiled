/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends qb {
    private vh field_z;
    ug field_A;
    private int field_p;
    static int[] field_w;
    private int[] field_s;
    private vh field_o;
    private boolean field_n;
    private int field_r;
    static String field_u;
    private int[] field_y;
    private vh field_x;
    private boolean field_q;
    private ug field_C;
    static int[] field_m;
    ug field_B;
    private int field_t;
    private int field_v;

    public static void a(byte param0) {
        field_m = null;
        if (param0 >= -12) {
          return;
        }
        field_w = null;
        field_u = null;
    }

    private final void a(ug param0, int param1, int param2, int param3) {
        try {
          param0.a(param1, param3, (byte) -82);
          param0.b(param2, 0);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final qb c() {
        return null;
    }

    final qb d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_35_0 = 0;
        int stackIn_51_0 = 0;
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
        var11 = DungeonAssault.field_K;
        try {
          if (0 >= this.field_t) {
            this.a(param2);
            return;
          }
          if (this.field_n) {
            if (this.field_p > 0 &&
              !this.field_A.b((byte) -126)) {
              this.field_o = null;
              this.field_n = false;
              this.field_p = -this.field_p;
            } else {
              if (this.field_p < 0 &&
                !this.field_B.b((byte) -123)) {
                this.field_x = null;
                this.field_p = -this.field_p;
                this.field_n = false;
              }
            }
          }
          var4_int = (this.field_v >> 12) * this.field_t / 256;
          var5 = this.field_t - var4_int;
          if (this.field_p != 0) {
            this.field_v = this.field_v + this.field_p * param2;
            if (this.field_v < 1048576) {
              if (this.field_v <= 0) {
                this.field_v = 0;
                if (!this.field_n) {
                  this.field_p = 0;
                  if (!this.field_q) {
                    if (this.field_o != null) {
                      this.field_A.d(-87);
                    }
                    this.field_o = null;
                  }
                }
              }
            } else {
              this.field_v = 1048576;
              if (!this.field_n) {
                this.field_p = 0;
                if (!this.field_q) {
                  if (null != this.field_x) {
                    this.field_B.d(-128);
                  }
                  this.field_x = null;
                }
              }
            }
          }
          if (vn.field_g) {
            stackIn_35_0 = param2 << 1;
          } else {
            stackIn_35_0 = param2;
          }
          var6 = stackIn_35_0;
          if (256 > this.field_r && (this.field_o != null ||
            null != this.field_x)) {
            if (var4_int == 256) {
              this.field_A.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_s != null &&
                  this.field_s.length >= var6) {
                  cj.a(this.field_s, 0, var6);
                  cj.a(this.field_y, 0, var6);
                } else {
                  this.field_s = new int[var6];
                  this.field_y = new int[var6];
                }
                this.field_A.b(this.field_s, 0, param2);
                this.field_B.b(this.field_y, 0, param2);
                if (!vn.field_g) {
                  stackIn_51_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_51_0 = localTemp$0;
                }
                var7 = stackIn_51_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (var4_int * this.field_s[var8] + this.field_y[var8] * var5 >> 8);
                }
              } else {
                this.field_B.b(param0, param1, param2);
              }
            }
          }
          if (null != this.field_z) {
            if (this.field_r == 0) {
              return;
            }
            if (this.field_s != null &&
              this.field_s.length >= var6) {
              cj.a(this.field_s, 0, var6);
            } else {
              this.field_y = new int[var6];
              this.field_s = new int[var6];
            }
            this.field_C.b(this.field_s, 0, param2);
            if (!vn.field_g) {
              stackIn_66_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_66_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_66_0;
            var8Lifetime1 = this.field_t * this.field_r / 256;
            var9 = this.field_t - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = var8Lifetime1 * this.field_s[var10] + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_72_0 = var4;
          stackIn_72_1 = new StringBuilder().append("tc.F(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1, int param2, vh param3, int param4, boolean param5) {
        boolean stackIn_19_1 = false;
        int stackIn_30_0 = 0;
        ug stackIn_40_0 = null;
        vh stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        boolean stackIn_41_3;
        ug stackIn_49_0 = null;
        vh stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        boolean stackIn_50_3;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          if (this.field_n &&
            param5) {
            if (this.field_p > 0) {
              if (null != this.field_o) {
                this.field_A.d(-82);
              }
              this.field_o = param3;
              if (param3 != null) {
                this.field_A.a(param3, param0 ^ 1917, false);
                this.a(this.field_A, param4, param1, param0 ^ -22200);
              }
            } else {
              if (this.field_x != null) {
                this.field_B.d(-79);
              }
              this.field_x = param3;
              if (param3 != null) {
                this.field_B.a(param3, param0 ^ 1917, false);
                this.a(this.field_B, param4, param1, param0 ^ -22200);
              }
            }
            return;
          }
          stackIn_19_1 = (param5);
          this.field_n = stackIn_19_1;
          if (this.field_o == param3) {
            this.field_p = param2;
            this.a(this.field_A, param4, param1, -1);
            return;
          }
          if (this.field_x == param3) {
            this.field_p = -param2;
            this.a(this.field_B, param4, param1, -1);
            return;
          }
          if (this.field_o == null) {
            var7_int = 1;
          } else {
            if (this.field_x == null) {
              var7_int = 0;
            } else {
              stackIn_30_0 = (this.field_v >= 524288) ? 0 : 1;
              var7_int = stackIn_30_0;
            }
          }
          if (var7_int == 0) {
            if (this.field_x != null) {
              this.field_B.d(-83);
            }
            this.field_x = param3;
            if (param3 != null) {
              stackIn_49_0 = this.field_B;
              stackIn_49_1 = (vh) (param3);
              stackIn_49_2 = 20938;
              stackIn_50_3 = !(param5);
              ((ug) (Object) stackIn_49_0).a(stackIn_49_1, stackIn_49_2, stackIn_50_3);
              this.a(this.field_B, param4, param1, -1);
            }
            this.field_p = -param2;
          } else {
            if (null != this.field_o) {
              this.field_A.d(-80);
            }
            this.field_o = param3;
            if (param3 != null) {
              stackIn_40_0 = this.field_A;
              stackIn_40_1 = (vh) (param3);
              stackIn_40_2 = param0 - 1261;
              stackIn_41_3 = !(param5);
              ((ug) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_41_3);
              this.a(this.field_A, param4, param1, -1);
            }
            this.field_p = param2;
          }
          if (param0 != 22199) {
            tc.a((byte) -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_57_0 = var7;
          stackIn_57_1 = new StringBuilder().append("tc.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_58_2 = "null";
          } else {
            stackIn_58_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_57_0), ((StringBuilder) (Object) stackIn_57_1).append(stackIn_58_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != 256) {
          this.c();
        }
        this.field_t = param0;
    }

    private final void a(boolean param0, ug param1, ug param2) {
        try {
          this.field_B = param2;
          this.field_v = 1048576;
          if (!param0) {
            tc.a((byte) 14);
          }
          this.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "tc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized int a() {
        return 2;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = DungeonAssault.field_K;
        if (0 < this.field_v &&
          this.field_o != null) {
          this.field_A.a(param0);
        }
        if (this.field_v < 1048576 &&
          null != this.field_x) {
          this.field_B.a(param0);
        }
        if (0 < this.field_r &&
          this.field_z != null) {
          this.field_C.a(param0);
        }
        if (this.field_n) {
          if (0 < this.field_p) {
            if (!this.field_A.b((byte) -127)) {
              this.field_o = null;
              this.field_n = false;
              this.field_p = -this.field_p;
            } else {
              if (this.field_p < 0 &&
                !this.field_B.b((byte) -121)) {
                this.field_x = null;
                this.field_p = -this.field_p;
                this.field_n = false;
              }
            }
          } else {
            if (this.field_p < 0 &&
              !this.field_B.b((byte) -121)) {
              this.field_x = null;
              this.field_p = -this.field_p;
              this.field_n = false;
            }
          }
        }
        if (this.field_p != 0) {
          this.field_v = this.field_v + param0 * this.field_p;
          if (this.field_v < 1048576) {
            if (this.field_v <= 0) {
              this.field_v = 0;
              if (!this.field_n) {
                this.field_p = 0;
                if (!this.field_q) {
                  if (this.field_o != null) {
                    this.field_A.d(-86);
                  }
                  this.field_o = null;
                }
              }
            }
          } else {
            this.field_v = 1048576;
            if (!this.field_n) {
              this.field_p = 0;
              if (!this.field_q) {
                if (this.field_x != null) {
                  this.field_B.d(-117);
                }
                this.field_x = null;
              }
            }
          }
        }
    }

    final void b(byte param0) {
        if (null != this.field_o) {
          this.field_A.d(param0 - 131);
        }
        if (null != this.field_x) {
          this.field_B.d(-96);
        }
        this.field_o = null;
        if (param0 != 52) {
          this.b((byte) 51);
        }
        this.field_x = null;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        pm var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = DungeonAssault.field_K;
        try {
          var4 = (pm) (li.field_a.e(-24172));
          while (var4 != null) {
            ro.a(var4, param0, param1 + 236);
            var4 = (pm) (li.field_a.a(4));
          }
          if (param1 != -112) {
            field_u = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "tc.L(" + param0 + ',' + param1 + ')');
        }
    }

    public tc() {
        this.field_q = false;
        this.field_r = 0;
        this.field_t = 256;
        ug var1 = new ug();
        this.a(true, var1, new ug(var1));
    }

    static {
        field_m = new int[8192];
    }
}
