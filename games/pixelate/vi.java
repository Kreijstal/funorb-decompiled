/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends sj {
    static long field_F;
    static String field_y;
    private int[] field_v;
    private int[] field_B;
    private ua field_q;
    static uo field_p;
    private boolean field_r;
    private ti field_t;
    private ua field_A;
    private boolean field_w;
    static byte[] field_K;
    ti field_x;
    private int field_I;
    static String field_E;
    static String field_s;
    static String field_J;
    private int field_z;
    private ua field_G;
    private int field_u;
    static pc field_o;
    private int field_D;
    static String field_L;
    ti field_H;

    final static void a(java.applet.Applet param0, int param1) {
        try {
          gj.a("", param0, true);
          if (param1 != 22770) {
            vi.b((byte) -76);
          }
          vf.a(param0, param1 ^ 21565);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, boolean param1, int param2, byte param3, ua param4, int param5) {
        boolean stackIn_19_1 = false;
        int stackIn_34_0 = 0;
        ti stackIn_41_0 = null;
        ua stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        boolean stackIn_42_3;
        ti stackIn_50_0 = null;
        ua stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        boolean stackIn_51_3;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          if (this.field_r &&
            param1) {
            if (this.field_u > 0) {
              if (null != this.field_q) {
                this.field_x.g(-84);
              }
              this.field_q = param4;
              if (param4 != null) {
                this.field_x.a(param4, -39, false);
                this.a(-24762, param5, param0, this.field_x);
              }
            } else {
              if (this.field_A != null) {
                this.field_H.g(-29);
              }
              this.field_A = param4;
              if (param4 != null) {
                this.field_H.a(param4, -39, false);
                this.a(-24762, param5, param0, this.field_H);
              }
            }
            return;
          }
          stackIn_19_1 = (param1);
          this.field_r = stackIn_19_1;
          if (param4 == this.field_q) {
            this.field_u = param2;
            this.a(-24762, param5, param0, this.field_x);
            return;
          }
          if (this.field_A == param4) {
            this.field_u = -param2;
            this.a(-24762, param5, param0, this.field_H);
            return;
          }
          if (param3 < 110) {
            this.field_B = (int[]) null;
          }
          if (this.field_q != null) {
            if (null != this.field_A) {
              stackIn_34_0 = (this.field_z >= 524288) ? 0 : 1;
              var7_int = stackIn_34_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (null != this.field_A) {
              this.field_H.g(-8);
            }
            this.field_A = param4;
            if (param4 != null) {
              stackIn_50_0 = this.field_H;
              stackIn_50_1 = (ua) (param4);
              stackIn_50_2 = -39;
              stackIn_51_3 = !(param1);
              ((ti) (Object) stackIn_50_0).a(stackIn_50_1, stackIn_50_2, stackIn_51_3);
              this.a(-24762, param5, param0, this.field_H);
            }
            this.field_u = -param2;
          } else {
            if (null != this.field_q) {
              this.field_x.g(127);
            }
            this.field_q = param4;
            if (param4 != null) {
              stackIn_41_0 = this.field_x;
              stackIn_41_1 = (ua) (param4);
              stackIn_41_2 = -39;
              stackIn_42_3 = !(param1);
              ((ti) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_42_3);
              this.a(-24762, param5, param0, this.field_x);
            }
            this.field_u = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_56_0 = var7;
          stackIn_56_1 = new StringBuilder().append("vi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized int a() {
        return 2;
    }

    final static int b(byte param0) {
        if (param0 < 118) {
          return -17;
        }
        return um.field_r;
    }

    final sj b() {
        return null;
    }

    private final void a(int param0, int param1, int param2, ti param3) {
        try {
          if (param0 != -24762) {
            java.applet.Applet var6 = (java.applet.Applet) null;
            vi.a((java.applet.Applet) null, -8);
          }
          param3.b(param1, false, -1);
          param3.c(param2, 274191016);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vi.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_s = null;
        field_L = null;
        field_p = null;
        int var1 = 125 / ((-3 - param0) / 52);
        field_o = null;
        field_K = null;
        field_J = null;
        field_E = null;
    }

    private final void a(ti param0, byte param1, ti param2) {
        try {
          this.field_x = param0;
          this.field_H = param2;
          if (param1 != 26) {
            ti var5 = (ti) null;
            this.a(-61, 2, 126, (ti) null);
          }
          this.field_z = 1048576;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != 2) {
          field_y = (String) null;
        }
        this.field_D = param0;
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = Pixelate.field_H ? 1 : 0;
        if (this.field_z > 0 &&
          null != this.field_q) {
          this.field_x.a(param0);
        }
        if (1048576 > this.field_z &&
          null != this.field_A) {
          this.field_H.a(param0);
        }
        if (this.field_I > 0 &&
          this.field_G != null) {
          this.field_t.a(param0);
        }
        if (this.field_r) {
          if (this.field_u > 0 &&
            !this.field_x.a((byte) -76)) {
            this.field_r = false;
            this.field_u = -this.field_u;
            this.field_q = null;
          } else {
            if (this.field_u < 0 &&
              !this.field_H.a((byte) 112)) {
              this.field_r = false;
              this.field_u = -this.field_u;
              this.field_A = null;
            }
          }
        }
        if (this.field_u != 0) {
          this.field_z = this.field_z + this.field_u * param0;
          if (this.field_z < 1048576) {
            if (this.field_z <= 0) {
              this.field_z = 0;
              if (!this.field_r) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (null != this.field_q) {
                    this.field_x.g(-104);
                  }
                  this.field_q = null;
                }
              }
            }
          } else {
            this.field_z = 1048576;
            if (!this.field_r) {
              this.field_u = 0;
              if (!this.field_w) {
                if (this.field_A != null) {
                  this.field_H.g(-3);
                }
                this.field_A = null;
              }
            }
          }
        }
    }

    final static tf[] a(fm param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        tf[] stackIn_2_0 = null;
        tf[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(127, param3);
          var5 = param0.a((byte) -114, param2, var4_int);
          if (param1 == 20049) {
            stackIn_4_0 = se.a(var5, var4_int, 1000, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (tf[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vi.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 != -109) {
          return;
        }
        if (mc.field_r != null) {
          var1 = mc.field_r;
          synchronized (var1) {
            mc.field_r = null;
          }
        }
    }

    final sj d() {
        return null;
    }

    final static void f(int param0) {
        pj[] var1 = null;
        int var2 = 0;
        pj var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = up.field_n;
          var2 = 0;
          if (param0 <= 31) {
            field_E = (String) null;
          }
          while (var1.length > var2) {
            var3 = var1[var2];
            var3.a((byte) -70);
            var2++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "vi.J(" + param0 + ')');
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_31_0 = 0;
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
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (0 >= this.field_D) {
            this.a(param2);
            return;
          }
          if (this.field_r) {
            if (this.field_u > 0 &&
              !this.field_x.a((byte) 105)) {
              this.field_q = null;
              this.field_r = false;
              this.field_u = -this.field_u;
            } else {
              if (this.field_u < 0 &&
                !this.field_H.a((byte) -83)) {
                this.field_u = -this.field_u;
                this.field_A = null;
                this.field_r = false;
              }
            }
          }
          var4_int = (this.field_z >> 12) * this.field_D / 256;
          var5 = -var4_int + this.field_D;
          if (this.field_u != 0) {
            this.field_z = this.field_z + this.field_u * param2;
            if (1048576 <= this.field_z) {
              this.field_z = 1048576;
              if (!this.field_r) {
                this.field_u = 0;
                if (!this.field_w) {
                  if (this.field_A != null) {
                    this.field_H.g(126);
                  }
                  this.field_A = null;
                }
              }
            } else {
              if (this.field_z <= 0) {
                this.field_z = 0;
                if (!this.field_r) {
                  this.field_u = 0;
                  if (!this.field_w) {
                    if (this.field_q != null) {
                      this.field_x.g(126);
                    }
                    this.field_q = null;
                  }
                }
              }
            }
          }
          if (!mm.field_o) {
            stackIn_31_0 = param2;
          } else {
            stackIn_31_0 = param2 << 1;
          }
          var6 = stackIn_31_0;
          if (this.field_I < 256 && (this.field_q != null ||
            null != this.field_A)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_v &&
                  var6 <= this.field_v.length) {
                  qb.a(this.field_v, 0, var6);
                  qb.a(this.field_B, 0, var6);
                } else {
                  this.field_B = new int[var6];
                  this.field_v = new int[var6];
                }
                this.field_x.b(this.field_v, 0, param2);
                this.field_H.b(this.field_B, 0, param2);
                if (!mm.field_o) {
                  stackIn_46_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_46_0 = localTemp$0;
                }
                var7 = stackIn_46_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_v[var8] * var4_int + var5 * this.field_B[var8] >> 8);
                }
              } else {
                this.field_H.b(param0, param1, param2);
              }
            } else {
              this.field_x.b(param0, param1, param2);
            }
          }
          if (null != this.field_G) {
            if (this.field_I == 0) {
              return;
            }
            if (null != this.field_v &&
              this.field_v.length >= var6) {
              qb.a(this.field_v, 0, var6);
            } else {
              this.field_v = new int[var6];
              this.field_B = new int[var6];
            }
            this.field_t.b(this.field_v, 0, param2);
            if (!mm.field_o) {
              stackIn_60_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_60_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_60_0;
            var8Lifetime1 = this.field_D * this.field_I / 256;
            var9 = this.field_D - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = var9 * param0[var7Lifetime1 + var10] + var8Lifetime1 * this.field_v[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_66_0 = var4;
          stackIn_66_1 = new StringBuilder().append("vi.A(");
          if (param0 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public vi() {
        this.field_w = false;
        this.field_I = 0;
        this.field_D = 256;
        ti var1 = new ti();
        this.a(var1, (byte) 26, new ti(var1));
    }

    static {
        field_K = new byte[520];
        field_y = "Passwords must be between 5 and 20 characters long";
        field_J = "Continue";
        field_E = "Perfect Drops: ";
        field_L = "Name is available";
        field_s = "FULL ACCESS";
    }
}
