/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj extends we {
    static SceneWidget field_J;
    static String field_C;
    static int[] field_v;
    static String field_B;
    private int[] field_G;
    private boolean field_H;
    private int field_D;
    private tg field_L;
    private int field_K;
    static RgbSprite[] field_x;
    static ResourceArchive field_y;
    static SceneWidget field_z;
    private ic field_O;
    private int[] field_I;
    private ic field_M;
    private tg field_s;
    private int field_E;
    private ic field_t;
    private int field_A;
    static RgbSprite field_F;
    private tg field_w;
    static PacketBuffer field_u;
    private boolean field_N;

    final synchronized int a() {
        return 2;
    }

    public static void b(boolean param0) {
        field_F = null;
        field_y = null;
        field_x = null;
        field_z = null;
        field_B = null;
        field_u = null;
        field_v = null;
        if (param0) {
          Throwable var2 = (Throwable) null;
          sj.a((String) null, -123, (Throwable) null);
        }
        field_J = null;
        field_C = null;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
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
        var11 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_A <= 0) {
            this.d(param2);
            return;
          }
          if (this.field_N) {
            if (this.field_K > 0 &&
              !this.field_O.d((byte) 90)) {
              this.field_N = false;
              this.field_s = null;
              this.field_K = -this.field_K;
            } else {
              if (this.field_K < 0 &&
                !this.field_M.d((byte) 90)) {
                this.field_K = -this.field_K;
                this.field_N = false;
                this.field_w = null;
              }
            }
          }
          var4_int = (this.field_D >> 12) * this.field_A / 256;
          var5 = -var4_int + this.field_A;
          if (0 != this.field_K) {
            this.field_D = this.field_D + this.field_K * param2;
            if (this.field_D < 1048576) {
              if (this.field_D <= 0) {
                this.field_D = 0;
                if (!this.field_N) {
                  this.field_K = 0;
                  if (!this.field_H) {
                    if (this.field_s != null) {
                      this.field_O.c((byte) -109);
                    }
                    this.field_s = null;
                  }
                }
              }
            } else {
              this.field_D = 1048576;
              if (!this.field_N) {
                this.field_K = 0;
                if (!this.field_H) {
                  if (this.field_w != null) {
                    this.field_M.c((byte) -40);
                  }
                  this.field_w = null;
                }
              }
            }
          }
          if (tb.field_b) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (256 > this.field_E && (this.field_s != null ||
            null != this.field_w)) {
            if (var4_int == 256) {
              this.field_O.a(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (null != this.field_G &&
                  var6 <= this.field_G.length) {
                  ii.a(this.field_G, 0, var6);
                  ii.a(this.field_I, 0, var6);
                } else {
                  this.field_I = new int[var6];
                  this.field_G = new int[var6];
                }
                this.field_O.a(this.field_G, 0, param2);
                this.field_M.a(this.field_I, 0, param2);
                if (tb.field_b) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_47_0 = localTemp$0;
                } else {
                  stackIn_47_0 = param1;
                }
                var7 = stackIn_47_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (this.field_G[var8] * var4_int + var5 * this.field_I[var8] >> 8);
                }
              } else {
                this.field_M.a(param0, param1, param2);
              }
            }
          }
          if (this.field_L != null) {
            if (0 == this.field_E) {
              return;
            }
            if (null != this.field_G &&
              this.field_G.length >= var6) {
              ii.a(this.field_G, 0, var6);
            } else {
              this.field_G = new int[var6];
              this.field_I = new int[var6];
            }
            this.field_t.a(this.field_G, 0, param2);
            if (!tb.field_b) {
              stackIn_62_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_A * this.field_E / 256;
            var9 = this.field_A - var8Lifetime1;
            for (var10 = 0; var10 < var6; var10++) {
              param0[var10 + var7Lifetime1] = var8Lifetime1 * this.field_G[var10] + param0[var10 + var7Lifetime1] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("sj.K(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, String param1, int param2, byte param3, String param4, int param5) {
        na var6 = null;
        try {
          if (param3 != 21) {
            field_x = (RgbSprite[]) null;
          }
          var6 = new na(param5, param4, param2, param0, param1);
          tf.a(var6, (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sj.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final synchronized void d(int param0) {
        int var3;
        var3 = SteelSentinels.obfuscationControl;
        if (this.field_D > 0 &&
          null != this.field_s) {
          this.field_O.d(param0);
        }
        if (1048576 > this.field_D &&
          null != this.field_w) {
          this.field_M.d(param0);
        }
        if (0 < this.field_E &&
          null != this.field_L) {
          this.field_t.d(param0);
        }
        if (this.field_N) {
          if (this.field_K > 0 &&
            !this.field_O.d((byte) 90)) {
            this.field_K = -this.field_K;
            this.field_s = null;
            this.field_N = false;
          } else {
            if (this.field_K < 0 &&
              !this.field_M.d((byte) 90)) {
              this.field_N = false;
              this.field_K = -this.field_K;
              this.field_w = null;
            }
          }
        }
        if (this.field_K != 0) {
          this.field_D = this.field_D + this.field_K * param0;
          if (this.field_D >= 1048576) {
            this.field_D = 1048576;
            if (!this.field_N) {
              this.field_K = 0;
              if (!this.field_H) {
                if (this.field_w != null) {
                  this.field_M.c((byte) -72);
                }
                this.field_w = null;
              }
            }
          } else {
            if (this.field_D <= 0) {
              this.field_D = 0;
              if (!this.field_N) {
                this.field_K = 0;
                if (!this.field_H) {
                  if (this.field_s != null) {
                    this.field_O.c((byte) -49);
                  }
                  this.field_s = null;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, ic param1, int param2, int param3) {
        try {
          if (param2 != 17396) {
            this.a(-97, 18);
          }
          param1.a(-1, (byte) 37, param3);
          param1.a((byte) 61, param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(String param0, int param1, Throwable param2) {
        try {
          pn stackIn_15_0;
          java.net.URL stackIn_15_1;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          StringBuilder stackIn_15_4;
          java.net.URL stackIn_16_1;
          java.net.URL stackIn_16_2;
          String stackIn_16_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          wj var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = SteelSentinels.obfuscationControl;
          try {
            var3 = "";
            if (param2 != null) {
              var3 = pg.a((byte) -85, param2);
            }
            if (param0 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            SentinelDesigner.a(var3, -29771);
            if (param1 >= -13) {
              return;
            }
            var7 = CombatWorld.a(":", var3, "%3a", 98);
            var8 = CombatWorld.a("@", var7, "%40", 101);
            var9 = CombatWorld.a("&", var8, "%26", -20);
            var10 = CombatWorld.a("#", var9, "%23", 97);
            if (null == ug.field_O) {
              return;
            }
            stackIn_15_0 = ug.field_M;
            stackIn_15_1 = null;
            stackIn_15_2 = null;
            stackIn_15_3 = ug.field_O.getCodeBase();
            stackIn_15_4 = new StringBuilder().append("clienterror.ws?c=").append(dd.field_d).append("&u=");
            if (ih.field_q == null) {
              stackIn_16_1 = null;
              stackIn_16_2 = null;
              stackIn_16_5 = "" + oa.field_P;
            } else {
              stackIn_16_1 = null;
              stackIn_16_2 = null;
              stackIn_16_5 = ih.field_q;
            }
            var4 = ((pn) (Object) stackIn_15_0).a(new java.net.URL(stackIn_15_3, ((StringBuilder) (Object) stackIn_15_4).append(stackIn_16_5).append("&v1=").append(pn.field_p).append("&v2=").append(pn.field_r).append("&e=").append(var10).toString()), 38);
            while (var4.field_a == 0) {
              a.a((byte) 126, 1L);
            }
            if (var4.field_a == 1) {
              var5 = (DataInputStream) (var4.field_c);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final we d() {
        return null;
    }

    final static boolean a(boolean param0) {
        int var2 = 0;
        int var1_int = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var14 = 0;
        int var5Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var10Lifetime1Lifetime1;
        int var11Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var15 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 0;
          if (!param0) {
            sj.a(false);
          }
          for (var2 = 0; var2 < 640; var2++) {
            var3 = 374.0 + (double)(var2 - 320) * (0.000234375 * (double)(var2 - 320));
            var5 = (int)Math.ceil(var3);
            if (var2 == oh.field_f &&
              var5 <= pi.field_c) {
              var1_int = 1;
            }
            jg.a(0, 48, var2, false, 480, var5);
            var6 = var5 - 1;
            var7 = var5 + 1;
            var8 = (int)(((double)var5 - var3) * 256.0);
            var9 = 200;
            for (var5Lifetime1 = var6 - 1; var5Lifetime1 > var6 - 20; var5Lifetime1--) {
              var10 = var2 + var5Lifetime1 * SoftwareRaster.field_c;
              var11 = (16711680 & SoftwareRaster.field_g[var10]) >> 16;
              var12 = (SoftwareRaster.field_g[var10] & 65280) >> 8;
              var13 = 255 & SoftwareRaster.field_g[var10];
              var11 = var11 * (256 - var9) / 256;
              var12 = var12 * (-var9 + 256) / 256;
              var13 = var13 * (256 - var9) / 256;
              var9 = var9 * 6 / 7;
              SoftwareRaster.field_g[var10] = vn.a(vn.a(var11 << 16, var12 << 8), var13);
            }
            SoftwareRaster.d(var2, var6, -var6 + var7, 4210752);
            if (var8 >= 0) {
              var10Lifetime1 = var2 + (var6 - 1) * SoftwareRaster.field_c;
              var11Lifetime1 = (SoftwareRaster.field_g[var10Lifetime1] & 16711680) >> 16;
              var12Lifetime1 = SoftwareRaster.field_g[var10Lifetime1] >> 8 & 255;
              var13Lifetime1 = SoftwareRaster.field_g[var10Lifetime1] & 255;
              var14 = var8 * 64;
              var13Lifetime1 = (var13Lifetime1 * (256 - var8) + var14) / 256;
              var12Lifetime1 = (var14 + var12Lifetime1 * (256 - var8)) / 256;
              var11Lifetime1 = (var14 + var11Lifetime1 * (256 - var8)) / 256;
              SoftwareRaster.field_g[var10Lifetime1] = vn.a(var13Lifetime1, vn.a(var11Lifetime1 << 16, var12Lifetime1 << 8));
              var10Lifetime1Lifetime1 = var2 + SoftwareRaster.field_c * var7;
              var13Lifetime1Lifetime1 = 255 & SoftwareRaster.field_g[var10Lifetime1Lifetime1];
              var14Lifetime1 = 16384 - var8 * 64;
              var12Lifetime1Lifetime1 = SoftwareRaster.field_g[var10Lifetime1Lifetime1] >> 8 & 255;
              var11Lifetime1Lifetime1 = (SoftwareRaster.field_g[var10Lifetime1Lifetime1] & 16711680) >> 16;
              var11Lifetime1Lifetime1 = (var11Lifetime1Lifetime1 * var8 + var14Lifetime1) / 256;
              var13Lifetime1Lifetime1 = (var13Lifetime1Lifetime1 * var8 + var14Lifetime1) / 256;
              var12Lifetime1Lifetime1 = (var8 * var12Lifetime1Lifetime1 + var14Lifetime1) / 256;
              SoftwareRaster.field_g[var10Lifetime1Lifetime1] = vn.a(vn.a(var12Lifetime1Lifetime1 << 8, var11Lifetime1Lifetime1 << 16), var13Lifetime1Lifetime1);
            }
          }
          stackIn_17_0 = var1_int;
          return stackIn_17_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "sj.H(" + param0 + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param1 != -1) {
          return;
        }
        this.field_A = param0;
    }

    final synchronized void a(int param0, tg param1, int param2, int param3, boolean param4, int param5) {
        boolean stackIn_20_1 = false;
        int stackIn_33_0 = 0;
        ic stackIn_43_0 = null;
        boolean stackIn_43_1 = false;
        boolean stackIn_44_2 = false;
        ic stackIn_53_0 = null;
        boolean stackIn_53_1 = false;
        boolean stackIn_54_2 = false;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (this.field_N &&
            param4) {
            if (this.field_K > 0) {
              if (null != this.field_s) {
                this.field_O.c((byte) -98);
              }
              this.field_s = param1;
              if (param1 != null) {
                this.field_O.a(true, false, param1);
                this.a(param3, this.field_O, 17396, param0);
              }
            } else {
              if (this.field_w != null) {
                this.field_M.c((byte) -69);
              }
              this.field_w = param1;
              if (param1 != null) {
                this.field_M.a(true, false, param1);
                this.a(param3, this.field_M, 17396, param0);
              }
            }
            return;
          }
          if (param5 != 21997) {
            this.field_D = 96;
          }
          stackIn_20_1 = (param4);
          this.field_N = stackIn_20_1;
          if (param1 == this.field_s) {
            this.field_K = param2;
            this.a(param3, this.field_O, 17396, param0);
            return;
          }
          if (this.field_w == param1) {
            this.field_K = -param2;
            this.a(param3, this.field_M, 17396, param0);
            return;
          }
          if (null == this.field_s) {
            var7_int = 1;
          } else {
            if (null != this.field_w) {
              stackIn_33_0 = (this.field_D >= 524288) ? 0 : 1;
              var7_int = stackIn_33_0;
            } else {
              var7_int = 0;
            }
          }
          if (var7_int == 0) {
            if (null != this.field_w) {
              this.field_M.c((byte) -51);
            }
            this.field_w = param1;
            if (param1 != null) {
              stackIn_53_0 = this.field_M;
              stackIn_53_1 = true;
              stackIn_54_2 = !(param4);
              ((ic) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_54_2, param1);
              this.a(param3, this.field_M, 17396, param0);
            }
            this.field_K = -param2;
          } else {
            if (null != this.field_s) {
              this.field_O.c((byte) -77);
            }
            this.field_s = param1;
            if (param1 != null) {
              stackIn_43_0 = this.field_O;
              stackIn_43_1 = true;
              stackIn_44_2 = !(param4);
              ((ic) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_44_2, param1);
              this.a(param3, this.field_O, 17396, param0);
            }
            this.field_K = param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_59_0 = var7;
          stackIn_59_1 = new StringBuilder().append("sj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_60_2 = "null";
          } else {
            stackIn_60_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_59_0), ((StringBuilder) (Object) stackIn_59_1).append(stackIn_60_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(byte param0) {
        int var1 = -51 % ((-72 - param0) / 33);
        return (int)(1000000000L / ud.field_v);
    }

    final we b() {
        return null;
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        field_C = "You have no sentinel to configure.";
        field_v = new int[110];
        field_B = "(<%0> players want to join)";
        field_v[58] = 75;
        field_v[18] = 75;
        field_v[68] = 400;
        field_v[71] = 400;
        field_v[61] = 200;
        field_v[30] = 75;
        field_v[35] = 900;
        field_v[95] = 1000;
        field_v[88] = 900;
        field_v[64] = 300;
        field_v[83] = 600;
        field_v[79] = 700;
        field_v[36] = 700;
        field_v[17] = 75;
        field_v[23] = 75;
        field_v[65] = 300;
        field_v[87] = 800;
        field_v[48] = 1000;
        field_v[54] = 75;
        field_v[85] = 800;
        field_v[81] = 700;
        field_v[62] = 200;
        field_v[84] = 800;
        field_v[24] = 75;
        field_v[21] = 75;
        field_v[19] = 400;
        field_v[74] = 500;
        field_v[59] = 75;
        field_v[93] = 1000;
        field_v[1] = 75;
        field_v[51] = 700;
        field_v[47] = 800;
        field_v[43] = 500;
        field_v[29] = 75;
        field_v[67] = 300;
        field_v[56] = 75;
        field_v[22] = 300;
        field_v[76] = 600;
        field_v[63] = 200;
        field_v[33] = 400;
        field_v[78] = 600;
        field_v[72] = 500;
        field_v[75] = 600;
        field_v[45] = 600;
        field_v[31] = 200;
        field_v[25] = 300;
        field_v[34] = 500;
        field_v[50] = 1000;
        field_v[66] = 300;
        field_v[52] = 1000;
        field_v[69] = 400;
        field_v[37] = 200;
        field_v[91] = 900;
        field_v[53] = 75;
        field_v[60] = 75;
        field_v[26] = 75;
        field_v[89] = 900;
        field_v[82] = 700;
        field_v[86] = 800;
        field_v[77] = 600;
        field_v[80] = 700;
        field_v[2] = 75;
        field_v[44] = 700;
        field_v[90] = 900;
        field_v[28] = 600;
        field_v[32] = 300;
        field_v[46] = 900;
        field_v[27] = 600;
        field_v[38] = 700;
        field_v[49] = 1000;
        field_v[20] = 200;
        field_v[3] = 75;
        field_v[73] = 500;
        field_v[92] = 1000;
        field_v[70] = 400;
    }
}
