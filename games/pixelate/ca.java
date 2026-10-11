/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private long[] field_c;
    private int field_h;
    static String field_m;
    private long[] field_g;
    private int field_i;
    static String field_k;
    private byte[] field_j;
    private long[] field_d;
    static lc field_f;
    private byte[] field_l;
    static int[] field_a;
    private long[] field_b;
    private long[] field_e;

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = 0;
          if (param0 <= 122) {
            ca.b(-128);
          }
          do {
            if (var2_int >= 32) {
              this.field_i = 0;
              this.field_h = 0;
              this.field_j[0] = (byte) 0;
              break;
            }
            this.field_l[var2_int] = (byte) 0;
            var2_int++;
          } while (var3 == 0);
          var2_int = 0;
          while (8 > var2_int) {
            this.field_g[var2_int] = 0L;
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ca.C(" + param0 + ')');
        }
    }

    final static void a(int param0, rl param1, boolean param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_54_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_45_0Lifetime1;
        int stackIn_45_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = aq.a((byte) 32, 3 * (param0 - param3));
          var6 = 3 * param3;
          if (param2) {
            ca.a(-91);
          }
          var7 = var5_int - 10;
          da.e(-98);
          if (param1.field_B > 0 &&
            null != param1.field_n) {
            vf.a((byte) -37);
          }
          mp.field_b = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param1.field_j)))) {
            var9 = param1.field_h[var8];
            var10 = param1.field_I[var8];
            var11 = param1.field_o[var8];
            stackOut_12_0 = param4;
            stackIn_54_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = jp.field_a[var9];
                var13 = al.field_m[var9];
                var14 = -var12 + jp.field_a[var10];
                var15 = -var12 + jp.field_a[var11];
                var16 = -var13 + al.field_m[var10];
                var17 = al.field_m[var11] - var13;
              }
              if (!stackIn_13_0 ||
                !(var17 * var14 - var15 * var16 >= 0)) {
                var12Lifetime1 = qe.field_v[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = qe.field_v[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = qe.field_v[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var12Lifetime1 - (-var13Lifetime1 - var14);
                      if (var7 >= 0) {
                        stackIn_34_0 = var15 >> var7;
                      } else {
                        stackIn_34_0 = var15 << -var7;
                      }
                      var16 = -stackIn_34_0 + (-1 + kb.field_N.length);
                      var17 = kb.field_N[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_45_0 = ~var16;
                          stackIn_45_1 = -1;
                          if (stackIn_45_0 > stackIn_45_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = kb.field_N[var16];
                          continue;
                        }
                        stackIn_45_0Lifetime1 = var17;
                        stackIn_45_1Lifetime1 = var16 << 4;
                        var18 = stackIn_45_0Lifetime1 + stackIn_45_1Lifetime1;
                        nd.field_c[var18] = var8;
                        kb.field_N[var16] = var17 + 1;
                        if (param1.field_B > 0 &&
                          null != param1.field_n) {
                          dupTemp$0 = param1.field_n[var8];
                          sc.field_i[dupTemp$0] = sc.field_i[dupTemp$0] + 1;
                        }
                        mp.field_b = mp.field_b + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_54_0 = -1;
          }
          if (stackIn_54_0 > ~param1.field_B &&
            param1.field_n != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(sc.field_i.length <= var9Lifetime1)) {
              var10Lifetime1 = sc.field_i[var9Lifetime1];
              sc.field_i[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("ca.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void b(byte param0) {
        long dupTemp$0 = 0L;
        long arrayValue$1 = 0L;
        int stackIn_32_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_32_0Lifetime1;
        int stackIn_51_0Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 0;
          do {
            if (var2_int >= 8) {
              var2_int = 0;
              break;
            }
            this.field_c[var2_int] = fp.a(fp.a(mk.a(65280L, (long)this.field_j[var3 + 6] << 8), fp.a(fp.a(mk.a((long)this.field_j[4 + var3], 255L) << 24, fp.a(fp.a(fp.a(mk.a((long)this.field_j[1 + var3], 255L) << 48, (long)this.field_j[var3] << 56), mk.a(280375465082880L, (long)this.field_j[2 + var3] << 40)), mk.a((long)this.field_j[3 + var3], 255L) << 32)), mk.a((long)this.field_j[var3 + 5] << 16, 16711680L))), mk.a((long)this.field_j[7 + var3], 255L));
            var2_int++;
            var3 += 8;
          } while (var6 == 0);
          do {
            if (var2_int >= 8) {
              var2_int = 1;
              break;
            }
            dupTemp$0 = this.field_g[var2_int];
            arrayValue$1 = this.field_c[var2_int];
            this.field_d[var2_int] = dupTemp$0;
            this.field_e[var2_int] = fp.a(arrayValue$1, dupTemp$0);
            var2_int++;
          } while (var6 == 0);
          L6: while (true) {
            if (var2_int <= 10) {
              stackIn_60_0 = 0;
              if (var6 != 0) {
                break L6;
              }
              var3 = stackIn_60_0;
              while (var3 < 8) {
                this.field_b[var3] = 0L;
                var4 = 0;
                stackIn_32_0 = 56;
                var5 = stackIn_32_0;
                while (var4 < 8) {
                  this.field_b[var3] = fp.a(this.field_b[var3], pg.field_b[var4][cm.a(255, (int)(this.field_d[cm.a(-var4 + var3, 7)] >>> var5))]);
                  var4++;
                  var5 -= 8;
                }
                var3++;
              }
              stackIn_32_0Lifetime1 = 0;
              var3 = stackIn_32_0Lifetime1;
              while (var3 < 8) {
                this.field_d[var3] = this.field_b[var3];
                var3++;
              }
              this.field_d[0] = fp.a(this.field_d[0], pg.field_c[var2_int]);
              var3 = 0;
              while (var3 < 8) {
                this.field_b[var3] = this.field_d[var3];
                var4Lifetime1 = 0;
                stackIn_51_0 = 56;
                var5Lifetime1 = stackIn_51_0;
                while (var4Lifetime1 < 8) {
                  this.field_b[var3] = fp.a(this.field_b[var3], pg.field_b[var4Lifetime1][cm.a((int)(this.field_e[cm.a(7, var3 - var4Lifetime1)] >>> var5Lifetime1), 255)]);
                  var5Lifetime1 -= 8;
                  var4Lifetime1++;
                }
                var3++;
              }
              stackIn_51_0Lifetime1 = 0;
              var3 = stackIn_51_0Lifetime1;
              while (var3 < 8) {
                this.field_e[var3] = this.field_b[var3];
                var3++;
              }
              var2_int++;
              continue L6;
            }
            var2_int = 0;
            stackIn_60_0 = param0;
            break;
          }
          if (stackIn_60_0 != 41) {
            return;
          }
          while (var2_int < 8) {
            this.field_g[var2_int] = fp.a(this.field_g[var2_int], fp.a(this.field_c[var2_int], this.field_e[var2_int]));
            var2_int++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ca.F(" + param0 + ')');
        }
    }

    final static tf a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        byte[] var2 = null;
        int[] var3 = null;
        int var4_int = 0;
        tf var4 = null;
        int var5 = 0;
        tf stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          var1_int = ge.field_c[0] * gf.field_g[0];
          var2 = wo.field_f[param0];
          var3 = new int[var1_int];
          var4_int = 0;
          while (var4_int < var1_int) {
            var3[var4_int] = fl.field_g[cm.a((int) var2[var4_int], 255)];
            var4_int++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          var4 = new tf(tj.field_y, jb.field_a, fa.field_b[0], e.field_b[0], gf.field_g[0], ge.field_c[0], var3);
          re.b(140);
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ca.E(" + param0 + ')');
        }
    }

    final void a(byte[] param0, long param1, byte param2) {
        int stackIn_24_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 8 - (7 & (int)param1) & 7;
          var7 = this.field_h & 7;
          var9 = param1;
          var11 = 31;
          var12 = 0;
          L1: while (true) {
            if (var11 >= 0) {
              var12 = var12 + ((255 & this.field_l[var11]) + ((int)var9 & 255));
              this.field_l[var11] = (byte)var12;
              var12 = var12 >>> 8;
              var9 = var9 >>> 8;
              var11--;
              if (var13 == 0) {
                continue;
              }
            } else {
              while (param1 > 8L) {
                var8 = 255 & param0[var5_int] << var6 | (255 & param0[var5_int + 1]) >>> 8 - var6;
                stackIn_24_0 = var8;
                if (var13 != 0) {
                  break L1;
                }
                if (stackIn_24_0 >= 0 &&
                  256 > var8) {
                  this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], var8 >>> var7);
                  this.field_h = this.field_h + (8 - var7);
                  this.field_i = this.field_i + 1;
                  if (this.field_h == 512) {
                    this.b((byte) 41);
                    this.field_i = 0;
                    this.field_h = 0;
                  }
                  this.field_j[this.field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
                  param1 = param1 - 8L;
                  this.field_h = this.field_h + var7;
                  var5_int++;
                  continue;
                }
                throw new RuntimeException("LOGIC ERROR");
              }
            }
            stackIn_24_0 = $cfr$lcmp(0L, param1);
            break;
          }
          if (stackIn_24_0 >= 0) {
            var8 = 0;
          }
          if (stackIn_24_0 < 0 ||
            var13 != 0) {
            var8 = param0[var5_int] << var6 & 255;
            this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], var8 >>> var7);
          }
          var11Lifetime1 = -86 % ((param2 - 39) / 48);
          if ((long)var7 + param1 < 8L) {
            this.field_h = (int)((long)this.field_h + param1);
            if (var13 == 0) {
              return;
            }
          }
          param1 = param1 - (long)(8 - var7);
          this.field_i = this.field_i + 1;
          this.field_h = this.field_h + (-var7 + 8);
          if (this.field_h == 512) {
            this.b((byte) 41);
            this.field_h = 0;
            this.field_i = 0;
          }
          this.field_j[this.field_i] = (byte)cm.a(var8 << -var7 + 8, 255);
          this.field_h = this.field_h + (int)param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_40_0 = var5;
          stackIn_40_1 = new StringBuilder().append("ca.G(");
          if (param0 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(int param0, byte[] param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_j[this.field_i] = (byte)bq.a((int) this.field_j[this.field_i], 128 >>> cm.a(this.field_h, 7));
          this.field_i = this.field_i + 1;
          if (this.field_i > 32) {
            while (true) {
              if (this.field_i < 64) {
                fieldTemp$0 = this.field_i;
                this.field_i = this.field_i + 1;
                this.field_j[fieldTemp$0] = (byte) 0;
                if (var8 == 0) {
                  continue;
                }
              } else {
                this.b((byte) 41);
              }
              break;
            }
            this.field_i = 0;
          }
          do {
            if (32 <= this.field_i) {
              if (param2 != 16157) {
                return;
              }
              qb.a(this.field_l, 0, this.field_j, 32, 32);
              this.b((byte) 41);
              break;
            }
            fieldTemp$1 = this.field_i;
            this.field_i = this.field_i + 1;
            this.field_j[fieldTemp$1] = (byte) 0;
          } while (var8 == 0);
          var4_int = 0;
          var5 = param0;
          while (var4_int < 8) {
            var6 = this.field_g[var4_int];
            param1[var5] = (byte)(int)(var6 >>> 56);
            param1[var5 + 1] = (byte)(int)(var6 >>> 48);
            param1[var5 + 2] = (byte)(int)(var6 >>> 40);
            param1[var5 + 3] = (byte)(int)(var6 >>> 32);
            param1[4 + var5] = (byte)(int)(var6 >>> 24);
            param1[var5 + 5] = (byte)(int)(var6 >>> 16);
            param1[var5 + 6] = (byte)(int)(var6 >>> 8);
            param1[var5 + 7] = (byte)(int)var6;
            var5 += 8;
            var4_int++;
            if (var8 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("ca.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          field_m = null;
          field_k = null;
          if (param0 != 64) {
            ca.a(59);
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ca.A(" + param0 + ')');
        }
    }

    ca() {
        this.field_i = 0;
        this.field_g = new long[8];
        this.field_c = new long[8];
        this.field_d = new long[8];
        this.field_h = 0;
        this.field_l = new byte[32];
        this.field_b = new long[8];
        this.field_j = new byte[64];
        this.field_e = new long[8];
    }

    static {
        field_m = "Log in";
        field_f = null;
        field_k = "Invite players";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
