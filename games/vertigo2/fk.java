/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends sn {
    static String field_A;
    private int field_y;
    private int field_E;
    private int[] field_t;
    private si field_D;
    private db field_z;
    private boolean field_w;
    private si field_B;
    static String field_G;
    private db field_H;
    private int[] field_F;
    static int field_x;
    private boolean field_C;
    private si field_u;
    private db field_v;
    private int field_r;
    private int field_s;

    final static void f(int param0) {
        kb.field_e.field_m = 0;
        kb.field_e.field_j = 0;
        if (param0 != -1) {
          field_A = (String) null;
        }
    }

    final synchronized void a(int param0, byte param1) {
        if (param1 != -50) {
          return;
        }
        this.field_s = param0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (param2 != 1) {
            fk.c(-114, 68, -107);
          }
          while (param0 > 0) {
            var3_int = 1 & param1 | var3_int << 1;
            param1 = param1 >>> 1;
            param0--;
          }
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "fk.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static java.awt.Container a(byte param0) {
        if (eo.field_k != null) {
          return (java.awt.Container) ((Object) eo.field_k);
        }
        if (param0 <= 83) {
          fk.a((byte) -30);
        }
        return (java.awt.Container) ((Object) ob.e((byte) 116));
    }

    public static void e(int param0) {
        field_A = null;
        field_G = null;
        if (param0 != -257) {
          fk.b(-46, -110, -105);
        }
    }

    private final void a(int param0, int param1, db param2, int param3) {
        try {
          param2.a(param1, param0, (byte) -61);
          param2.c((byte) 119, param3);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        param1 = param1 & 8191;
        if (param0 != -118) {
          return 88;
        }
        if (4096 > param1) {
          return param1 >= 2048 ? -jc.field_b[param1 - 2048] : jc.field_b[-param1 + 2048];
        }
        return param1 < 6144 ? -jc.field_b[-param1 + 6144] : jc.field_b[param1 - 6144];
    }

    final sn a() {
        return null;
    }

    final synchronized void a(si param0, int param1, int param2, boolean param3, byte param4, int param5) {
        boolean stackIn_20_1 = false;
        int stackIn_35_0 = 0;
        db stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        si stackIn_45_2 = null;
        boolean stackIn_46_3;
        db stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        si stackIn_55_2 = null;
        boolean stackIn_56_3;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_w &&
            param3) {
            if (this.field_y > 0) {
              if (this.field_B != null) {
                this.field_v.a(true);
              }
              this.field_B = param0;
              if (param0 != null) {
                this.field_v.a(-68, param0, false);
                this.a(-1, param5, this.field_v, param2);
              }
            } else {
              if (null != this.field_u) {
                this.field_H.a(true);
              }
              this.field_u = param0;
              if (param0 != null) {
                this.field_H.a(-19, param0, false);
                this.a(-1, param5, this.field_H, param2);
              }
            }
            return;
          }
          stackIn_20_1 = (param3);
          this.field_w = stackIn_20_1;
          if (param0 == this.field_B) {
            this.field_y = param1;
            this.a(-1, param5, this.field_v, param2);
            return;
          }
          if (param0 == this.field_u) {
            this.field_y = -param1;
            this.a(-1, param5, this.field_H, param2);
            return;
          }
          if (param4 <= 56) {
            this.field_B = (si) null;
          }
          if (null == this.field_B) {
            var7_int = 1;
          } else {
            if (null != this.field_u) {
              stackIn_35_0 = (this.field_r >= 524288) ? 0 : 1;
              var7_int = stackIn_35_0;
            } else {
              var7_int = 0;
            }
          }
          if (var7_int == 0) {
            if (this.field_u != null) {
              this.field_H.a(true);
            }
            this.field_u = param0;
            if (param0 != null) {
              stackIn_55_0 = this.field_H;
              stackIn_55_1 = -34;
              stackIn_55_2 = (si) (param0);
              stackIn_56_3 = !(param3);
              ((db) (Object) stackIn_55_0).a(stackIn_55_1, stackIn_55_2, stackIn_56_3);
              this.a(-1, param5, this.field_H, param2);
            }
            this.field_y = -param1;
          } else {
            if (this.field_B != null) {
              this.field_v.a(true);
            }
            this.field_B = param0;
            if (param0 != null) {
              stackIn_45_0 = this.field_v;
              stackIn_45_1 = -82;
              stackIn_45_2 = (si) (param0);
              stackIn_46_3 = !(param3);
              ((db) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2, stackIn_46_3);
              this.a(-1, param5, this.field_v, param2);
            }
            this.field_y = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_61_0 = var7;
          stackIn_61_1 = new StringBuilder().append("fk.L(");
          if (param0 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
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
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (this.field_s <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_w) {
            if (this.field_y > 0 &&
              !this.field_v.g(-26083)) {
              this.field_w = false;
              this.field_B = null;
              this.field_y = -this.field_y;
            } else {
              if (this.field_y < 0 &&
                !this.field_H.g(-26083)) {
                this.field_u = null;
                this.field_y = -this.field_y;
                this.field_w = false;
              }
            }
          }
          var4_int = (this.field_r >> 12) * this.field_s / 256;
          var5 = this.field_s - var4_int;
          if (0 != this.field_y) {
            this.field_r = this.field_r + param2 * this.field_y;
            if (this.field_r < 1048576) {
              if (this.field_r <= 0) {
                this.field_r = 0;
                if (!this.field_w) {
                  this.field_y = 0;
                  if (!this.field_C) {
                    if (null != this.field_B) {
                      this.field_v.a(true);
                    }
                    this.field_B = null;
                  }
                }
              }
            } else {
              this.field_r = 1048576;
              if (!this.field_w) {
                this.field_y = 0;
                if (!this.field_C) {
                  if (null != this.field_u) {
                    this.field_H.a(true);
                  }
                  this.field_u = null;
                }
              }
            }
          }
          if (dd.field_h) {
            stackIn_34_0 = param2 << 1;
          } else {
            stackIn_34_0 = param2;
          }
          var6 = stackIn_34_0;
          if (256 > this.field_E && (this.field_B != null ||
            this.field_u != null)) {
            if (var4_int == 256) {
              this.field_v.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (this.field_t != null &&
                  var6 <= this.field_t.length) {
                  qq.a(this.field_t, 0, var6);
                  qq.a(this.field_F, 0, var6);
                } else {
                  this.field_t = new int[var6];
                  this.field_F = new int[var6];
                }
                this.field_v.b(this.field_t, 0, param2);
                this.field_H.b(this.field_F, 0, param2);
                if (!dd.field_h) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_F[var8] * var5 + this.field_t[var8] * var4_int >> 8);
                }
              } else {
                this.field_H.b(param0, param1, param2);
              }
            }
          }
          if (this.field_D != null &&
            0 != this.field_E) {
            if (null != this.field_t &&
              var6 <= this.field_t.length) {
              qq.a(this.field_t, 0, var6);
            } else {
              this.field_t = new int[var6];
              this.field_F = new int[var6];
            }
            this.field_z.b(this.field_t, 0, param2);
            if (dd.field_h) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            } else {
              stackIn_63_0 = param1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_s * this.field_E / 256;
            var9 = -var8Lifetime1 + this.field_s;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var7Lifetime1 + var10] = var9 * param0[var7Lifetime1 + var10] + var8Lifetime1 * this.field_t[var10] >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("fk.G(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var3 = null;
        long var4 = 0L;
        tb.field_b = true;
        String var2 = "tuhstatbut";
        if (param1 != 11514) {
          return;
        }
        try {
          var3 = "rvnadlm";
          var4 = -1L;
          gl.a(-11, var4, param0, var3, var2);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final synchronized int d() {
        return 2;
    }

    final static er[] c(int param0, int param1, int param2) {
        if (param0 > -126) {
          return (er[]) null;
        }
        return ca.a((byte) -123, param1, 1, param2);
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (0 < this.field_r &&
          this.field_B != null) {
          this.field_v.a(param0);
        }
        if (this.field_r < 1048576 &&
          null != this.field_u) {
          this.field_H.a(param0);
        }
        if (this.field_E > 0 &&
          this.field_D != null) {
          this.field_z.a(param0);
        }
        if (this.field_w) {
          if (this.field_y > 0 &&
            !this.field_v.g(-26083)) {
            this.field_B = null;
            this.field_w = false;
            this.field_y = -this.field_y;
          } else {
            if (this.field_y < 0 &&
              !this.field_H.g(-26083)) {
              this.field_y = -this.field_y;
              this.field_u = null;
              this.field_w = false;
            }
          }
        }
        if (this.field_y != 0) {
          this.field_r = this.field_r + this.field_y * param0;
          if (this.field_r >= 1048576) {
            this.field_r = 1048576;
            if (!this.field_w) {
              this.field_y = 0;
              if (!this.field_C) {
                if (null != this.field_u) {
                  this.field_H.a(true);
                }
                this.field_u = null;
              }
            }
          } else {
            if (this.field_r <= 0) {
              this.field_r = 0;
              if (!this.field_w) {
                this.field_y = 0;
                if (!this.field_C) {
                  if (this.field_B != null) {
                    this.field_v.a(true);
                  }
                  this.field_B = null;
                }
              }
            }
          }
        }
    }

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 1282642017) {
            stackIn_3_0 = 111;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = be.field_t;
          while (mn.field_q.length > var3_int) {
            var5 = gd.field_s[var3_int];
            if (0 > var5) {
              var4 = var4 + gd.field_k;
            } else {
              var6 = uc.a(mn.field_q[var3_int], true, false);
              var7 = -(var6 >> 1) + vm.field_c;
              var4 = var4 + al.field_z;
              if (pe.a(kd.field_z + (qc.field_z << 1), var4, param0, param2, (byte) 17, var7 - gl.field_l, (gl.field_l << 1) + var6)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (kd.field_z + ((qc.field_z << 1) + al.field_z));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "fk.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final sn c() {
        return null;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        field_A = "<col=ee9d32>Items - Collectables</col>";
        field_G = "Start level:";
    }
}
