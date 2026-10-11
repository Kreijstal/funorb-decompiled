/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj {
    int field_w;
    private boolean field_x;
    private int field_s;
    ji field_B;
    ji field_p;
    ji field_u;
    private int[] field_m;
    w field_C;
    int field_r;
    w field_n;
    w field_F;
    private int[] field_o;
    private int field_z;
    private static long[] field_D;
    boolean field_l;
    static nd field_G;
    static bd field_y;
    static gd field_v;
    static boolean field_t;
    static boolean field_q;
    static String field_E;
    static String field_A;

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param2;
            param2 = param2 >>> 1;
            param1--;
          }
          var4 = 96 / ((param0 - 53) / 63);
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "kd.R(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, w param1, w param2) {
        try {
          this.field_F = param2;
          if (param0 != -9) {
            field_y = (bd) null;
          }
          this.field_s = 1048576;
          this.field_C = param1;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "kd.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, w param1, byte param2, int param3) {
        try {
          param1.a(param0, -1, (byte) -89);
          param1.c(param3, param2 + 89);
          if (param2 != 38) {
            this.field_m = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "kd.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        oc var5 = null;
        int var6 = 0;
        oj var6_ref_oj = null;
        qm var7 = null;
        int var8 = 0;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var4Lifetime6;
        int var6Lifetime1;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (ha.field_t == param0) {
            return;
          }
          var2_int = ln.field_a.field_d;
          var3 = ln.field_a.field_a;
          if (param1 != 1) {
            field_v = (gd) null;
          }
          nh.field_E.a(-1, 8360, -1);
          ha.field_t = param0;
          var5 = new oc();
          var6 = ha.field_t;
          if (0 != var6 &&
            var6 != 6) {
            if (var6 == 1) {
              var4 = 0;
              while (true) {
                if (el.field_j <= var4) {
                  return;
                }
                if (125 != mm.field_m[var4].field_i) {
                  var4++;
                  continue;
                }
                break;
              }
              nh.field_E.a((byte) 46, mm.field_m[var4].field_j);
              return;
            }
            if (var6 == 2) {
              for (var4Lifetime1 = -1 + el.field_j; 0 <= var4Lifetime1; var4Lifetime1--) {
                if (mm.field_m[var4Lifetime1].field_i != 4) {
                  continue;
                }
                nh.field_E.a((byte) 46, mm.field_m[var4Lifetime1].field_j);
                break;
              }
              if (nh.field_E.field_e != -1) {
                return;
              }
              kd.a(0, param1 ^ 0);
              eh.field_c.a(lm.field_A[3], 100, wj.field_O);
              return;
            }
            if (var6 == 3) {
              for (var4Lifetime2 = 0; el.field_j > var4Lifetime2; var4Lifetime2++) {
                if (mm.field_m[var4Lifetime2].field_i != 8) {
                  continue;
                }
                nh.field_E.a((byte) 46, mm.field_m[var4Lifetime2].field_j);
                break;
              }
              if (0 != bm.field_c) {
                return;
              }
              if (nh.field_E.field_e != -1) {
                return;
              }
              kd.a(0, param1 ^ 0);
              eh.field_c.a(lm.field_A[3], 100, wj.field_O);
              r.field_a = 0;
              return;
            }
            if (var6 == 5) {
              nh.field_E.a(40, 8360, 110);
              return;
            }
            if (9 == var6) {
              return;
            }
            if (var6 == 4) {
              var4Lifetime3 = 0;
              while (true) {
                if (var4Lifetime3 >= el.field_j) {
                  return;
                }
                var6_ref_oj = mm.field_m[var4Lifetime3];
                if (var6_ref_oj.field_i != 125) {
                  var4Lifetime3++;
                  continue;
                }
                break;
              }
              nh.field_E.a(-5 + var6_ref_oj.field_j.field_e, 8360, var6_ref_oj.field_j.field_g);
              return;
            }
            if (10 == var6) {
              var6 = 0;
              for (var4Lifetime4 = 0; var4Lifetime4 < dk.field_o; var4Lifetime4++) {
                if (2 > var6) {
                  var7 = vj.field_w[var4Lifetime4];
                  if (var7.field_i >= 49 &&
                    var7.field_i <= 52) {
                    var6++;
                    nh.field_E.a((byte) 46, var7.field_j);
                  }
                  continue;
                }
                break;
              }
              return;
            }
            if (13 == var6) {
              nh.field_E.a(-1, 8360, -1);
              return;
            }
            if (var6 == 14) {
              if (0 != bm.field_c) {
                return;
              }
              for (var4Lifetime5 = 0; var4Lifetime5 < el.field_j; var4Lifetime5++) {
                if (mm.field_m[var4Lifetime5].field_i == 127) {
                  nh.field_E.a((byte) 46, mm.field_m[var4Lifetime5].field_j);
                  return;
                }
              }
              return;
            }
            if (var6 != 12) {
              return;
            }
            for (var4Lifetime6 = 0; var4Lifetime6 < ll.field_a; var4Lifetime6++) {
              if (wh.field_b[var4Lifetime6].field_i == 2 &&
                11 == wh.field_b[var4Lifetime6].field_h) {
                nh.field_E.a((byte) 46, wh.field_b[var4Lifetime6].field_j);
              }
            }
            if (nh.field_E.field_e != -1) {
              return;
            }
            kd.a(0, 1);
            eh.field_c.a(lm.field_A[3], 100, wj.field_O);
            return;
          }
          var5.field_e = 0;
          while (var2_int > var5.field_e) {
            var5.field_g = 0;
            while (var3 > var5.field_g) {
              var6Lifetime1 = ln.field_a.field_y[var5.b(-4)];
              if (148 == var6Lifetime1) {
                nh.field_E.a(-1 + var5.field_e, 8360, -1 + var5.field_g);
              }
              if (157 == var6Lifetime1) {
                nh.field_E.a(-2 + var5.field_e, 8360, var5.field_g - 2);
              }
              var5.field_g = var5.field_g + 1;
            }
            var5.field_e = var5.field_e + 1;
          }
          if (bm.field_c != 0) {
            return;
          }
          if (0 == rl.field_c &&
            bj.field_a) {
            nh.field_E.a(45, 8360, 37);
          }
          if (1 != rl.field_c) {
            return;
          }
          if (!tg.field_a) {
            return;
          }
          nh.field_E.a(45, 8360, 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "kd.P(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0, byte param1, boolean param2, int param3, ji param4, int param5) {
        boolean stackIn_20_1 = false;
        int stackIn_32_0 = 0;
        w stackIn_42_0 = null;
        boolean stackIn_43_1 = false;
        w stackIn_52_0 = null;
        boolean stackIn_53_1 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (this.field_x &&
            param2) {
            if (0 < this.field_w) {
              if (null != this.field_p) {
                this.field_F.e(4491);
              }
              this.field_p = param4;
              if (param4 != null) {
                this.field_F.a(false, (byte) 20, param4);
                this.a(param3, this.field_F, (byte) 38, param5);
              }
            } else {
              if (null != this.field_u) {
                this.field_C.e(4491);
              }
              this.field_u = param4;
              if (param4 != null) {
                this.field_C.a(false, (byte) 28, param4);
                this.a(param3, this.field_C, (byte) 38, param5);
              }
            }
            return;
          }
          stackIn_20_1 = (param2);
          this.field_x = stackIn_20_1;
          if (param4 == this.field_p) {
            this.field_w = param0;
            this.a(param3, this.field_F, (byte) 38, param5);
            return;
          }
          if (this.field_u == param4) {
            this.field_w = -param0;
            this.a(param3, this.field_C, (byte) 38, param5);
            return;
          }
          if (null != this.field_p) {
            if (this.field_u == null) {
              var7_int = 0;
            } else {
              stackIn_32_0 = (524288 <= this.field_s) ? 0 : 1;
              var7_int = stackIn_32_0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int == 0) {
            if (this.field_u != null) {
              this.field_C.e(4491);
            }
            this.field_u = param4;
            if (param4 != null) {
              stackIn_52_0 = this.field_C;
              stackIn_53_1 = !(param2);
              ((w) (Object) stackIn_52_0).a(stackIn_53_1, (byte) 40, param4);
              this.a(param3, this.field_C, (byte) 38, param5);
            }
            this.field_w = -param0;
          } else {
            if (this.field_p != null) {
              this.field_F.e(4491);
            }
            this.field_p = param4;
            if (param4 != null) {
              stackIn_42_0 = this.field_F;
              stackIn_43_1 = !(param2);
              ((w) (Object) stackIn_42_0).a(stackIn_43_1, (byte) 116, param4);
              this.a(param3, this.field_F, (byte) 38, param5);
            }
            this.field_w = param0;
          }
          var8 = -111 / ((param1 + 45) / 34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("kd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param5).append(')').toString());
        }
    }

    final synchronized void a(int param0, boolean param1) {
        this.field_z = param0;
        if (!param1) {
          this.field_x = false;
        }
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_32_0 = 0;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (0 >= this.field_z) {
            this.c(param2);
            return;
          }
          if (this.field_x) {
            if (this.field_w > 0 &&
              !this.field_F.f(323697071)) {
              this.field_w = -this.field_w;
              this.field_p = null;
              this.field_x = false;
            } else {
              if (this.field_w < 0 &&
                !this.field_C.f(323697071)) {
                this.field_u = null;
                this.field_w = -this.field_w;
                this.field_x = false;
              }
            }
          }
          var4_int = (this.field_s >> 12) * this.field_z / 256;
          var5 = -var4_int + this.field_z;
          if (this.field_w != 0) {
            this.field_s = this.field_s + this.field_w * param2;
            if (1048576 > this.field_s) {
              if (this.field_s <= 0) {
                this.field_s = 0;
                if (!this.field_x) {
                  this.field_w = 0;
                  if (!this.field_l) {
                    if (null != this.field_p) {
                      this.field_F.e(4491);
                    }
                    this.field_p = null;
                  }
                }
              }
            } else {
              this.field_s = 1048576;
              if (!this.field_x) {
                this.field_w = 0;
                if (!this.field_l) {
                  if (null != this.field_u) {
                    this.field_C.e(4491);
                  }
                  this.field_u = null;
                }
              }
            }
          }
          if (!ug.field_b) {
            stackIn_32_0 = param2;
          } else {
            stackIn_32_0 = param2 << 1;
          }
          var6 = stackIn_32_0;
          if (256 > this.field_r && (null != this.field_p ||
            null != this.field_u)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (null != this.field_m &&
                  var6 <= this.field_m.length) {
                  kf.a(this.field_m, 0, var6);
                  kf.a(this.field_o, 0, var6);
                } else {
                  this.field_o = new int[var6];
                  this.field_m = new int[var6];
                }
                this.field_F.b(this.field_m, 0, param2);
                this.field_C.b(this.field_o, 0, param2);
                if (ug.field_b) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                } else {
                  stackIn_48_0 = param1;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_m[var8] * var4_int + var5 * this.field_o[var8] >> 8);
                }
              } else {
                this.field_C.b(param0, param1, param2);
              }
            } else {
              this.field_F.b(param0, param1, param2);
            }
          }
          if (null != this.field_B) {
            if (this.field_r == 0) {
              return;
            }
            if (null != this.field_m &&
              this.field_m.length >= var6) {
              kf.a(this.field_m, 0, var6);
            } else {
              this.field_o = new int[var6];
              this.field_m = new int[var6];
            }
            this.field_n.b(this.field_m, 0, param2);
            if (ug.field_b) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            } else {
              stackIn_62_0 = param1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_z * this.field_r / 256;
            var9 = this.field_z - var8Lifetime1;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = var9 * param0[var10 + var7Lifetime1] + var8Lifetime1 * this.field_m[var10] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("kd.A(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -76) {
          return true;
        }
        stackIn_6_0 = (ie.field_c != null) && (ie.field_c.b(28433));
        return stackIn_6_0;
    }

    final tj b() {
        return null;
    }

    final tj d() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void c(int param0) {
        int var3;
        var3 = HostileSpawn.field_I ? 1 : 0;
        if (this.field_s > 0 &&
          this.field_p != null) {
          this.field_F.c(param0);
        }
        if (1048576 > this.field_s &&
          null != this.field_u) {
          this.field_C.c(param0);
        }
        if (this.field_r > 0 &&
          this.field_B != null) {
          this.field_n.c(param0);
        }
        if (this.field_x) {
          if (this.field_w > 0 &&
            !this.field_F.f(323697071)) {
            this.field_w = -this.field_w;
            this.field_x = false;
            this.field_p = null;
          } else {
            if (this.field_w < 0 &&
              !this.field_C.f(323697071)) {
              this.field_x = false;
              this.field_u = null;
              this.field_w = -this.field_w;
            }
          }
        }
        if (0 != this.field_w) {
          this.field_s = this.field_s + this.field_w * param0;
          if (1048576 > this.field_s) {
            if (0 >= this.field_s) {
              this.field_s = 0;
              if (!this.field_x) {
                this.field_w = 0;
                if (!this.field_l) {
                  if (null != this.field_p) {
                    this.field_F.e(4491);
                  }
                  this.field_p = null;
                }
              }
            }
          } else {
            this.field_s = 1048576;
            if (!this.field_x) {
              this.field_w = 0;
              if (!this.field_l) {
                if (null != this.field_u) {
                  this.field_C.e(4491);
                }
                this.field_u = null;
              }
            }
          }
        }
    }

    public static void c(byte param0) {
        field_G = null;
        if (param0 != -13) {
          return;
        }
        field_y = null;
        field_E = null;
        field_v = null;
        field_D = null;
        field_A = null;
    }

    final boolean a(ji param0, int param1) {
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < 2) {
            field_D = (long[]) null;
          }
          stackIn_7_0 = (param0 == this.field_p) || (this.field_u == param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("kd.V(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    kd(w param0, w param1, w param2) {
        this.field_r = 0;
        this.field_z = 256;
        this.field_l = false;
        try {
          this.a(-9, param1, param0);
          this.field_n = param2;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "kd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_D = new long[256];
        for (var2 = 0; 256 > var2; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) == 1L) {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_D[var2] = var0;
        }
        field_G = new nd(7, 0, 1, 1);
        field_t = false;
        field_E = "I need to plant these charges to stop the influx of critters.";
        field_A = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
