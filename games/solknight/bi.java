/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bi {
    private hb field_g;
    private int field_j;
    static qc field_b;
    private int field_c;
    static int field_d;
    static int field_a;
    static int field_e;
    private hb field_f;
    static int field_i;
    static int field_h;

    final static void a(byte param0, int param1, int param2, int param3, uh param4, int param5, int param6, int param7) {
        int stackIn_17_0 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        cf stackIn_39_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        cf var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        uh var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = SolKnight.field_L ? 1 : 0;
        try {
          var44 = param4;
          if (var44.field_k != null &&
            var44.field_j > 1) {
            var60 = var44.field_k;
            qj.a(0, var60, md.field_t, 0, 0);
          } else {
            ek.b(1);
          }
          var54 = new int[param4.field_b];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param4.field_b];
          var63 = mh.field_a;
          if (param0 < 44) {
            bi.a((byte) 81);
          }
          var62 = fa.field_e;
          var61 = tk.field_r;
          for (var13 = 0; var13 < param4.field_b; var13++) {
            var14 = var61[var13] * param3 + (var62[var13] * param6 + param7 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 < 0) {
              stackIn_17_0 = 128;
            } else {
              if (128 > var14) {
                stackIn_17_0 = var14 + 128;
              } else {
                stackIn_17_0 = 256;
              }
            }
            var14Lifetime2 = stackIn_17_0;
            var15 = var61[var13] * param2 + (param1 * var63[var13] + param5 * var62[var13]) >> 8;
            stackIn_19_0 = ud.field_i;
            if (var15 >= 0) {
              stackIn_20_1 = var15;
            } else {
              stackIn_20_1 = -var15;
            }
            var15Lifetime2 = stackIn_19_0[stackIn_20_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; var13Lifetime1 < cf.field_c; var13Lifetime1++) {
            var14Lifetime1 = he.field_a[var13Lifetime1];
            var15Lifetime1 = param4.field_K[var14Lifetime1];
            var16 = param4.field_o[var14Lifetime1];
            var17 = param4.field_w[var14Lifetime1];
            if (param4.field_D[var14Lifetime1] >= mh.field_a.length) {
              stackIn_26_0 = -1;
            } else {
              stackIn_26_0 = param4.field_D[var14Lifetime1];
            }
            var18 = stackIn_26_0;
            if (param4.field_C[var14Lifetime1] >= mh.field_a.length) {
              stackIn_29_0 = -1;
            } else {
              stackIn_29_0 = param4.field_C[var14Lifetime1];
            }
            var19 = stackIn_29_0;
            if (param4.field_g[var14Lifetime1] >= mh.field_a.length) {
              stackIn_32_0 = -1;
            } else {
              stackIn_32_0 = param4.field_g[var14Lifetime1];
            }
            var20 = stackIn_32_0;
            if (vc.field_f != null &&
              null != param4.field_s &&
              var14Lifetime1 < param4.field_s.length &&
              param4.field_s[var14Lifetime1] != -1 &&
              param4.field_s[var14Lifetime1] < vc.field_f.length) {
              stackIn_39_0 = vc.field_f[param4.field_s[var14Lifetime1]];
            } else {
              stackIn_39_0 = null;
            }
            var21 = stackIn_39_0;
            var22 = qb.field_ab[var15Lifetime1];
            var23 = a.field_d[var15Lifetime1];
            var24 = qb.field_ab[var16];
            var25 = a.field_d[var16];
            var26 = qb.field_ab[var17];
            var27 = a.field_d[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_49_0 = var21.field_a;
              } else {
                stackIn_49_0 = 8355711;
              }
              var30 = stackIn_49_0;
              var31 = var30 & 16711935;
              var32 = var30 & 65280;
              var33 = (16711919 & var32 * var28) >>> 8 | var31 * var28 >>> 8 & 1761542399;
              var33 = var33 + 65793 * var29;
              uf.a(var27, var26, var33 >> 1 & 8355711, var24, -113, var22, var23, var25);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_45_0 = 8355711;
              } else {
                stackIn_45_0 = var21.field_a;
              }
              var34 = stackIn_45_0;
              var35 = 16711935 & var34;
              var36 = var34 & 65280;
              var37 = (var28 * var36 & 16711860) >>> 8 | (-16711739 & var35 * var28) >>> 8;
              var38 = 167706879 & var35 * var29 >>> 8 | 1761672960 & var29 * var36 >>> 8;
              var38 = var38 + var32 * 65793;
              var37 = var37 + 65793 * var31;
              var39 = var35 * var30 >>> 8 & -1124138753 | (16711776 & var36 * var30) >>> 8;
              var39 = var39 + var33 * 65793;
              w.a(var23, var26, 255 & var39, (65320 & var37) >> 8, var24, var37 & 255, -22, var37 >> 16, var39 >> 16, var22, 255 & var38, var38 >> 8 & 255, var38 >> 16, var25, 255 & var39 >> 8, var27);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_54_0 = var8_ref;
          stackIn_54_1 = new StringBuilder().append("bi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final boolean a(byte param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_f;
          synchronized (var5) {
            if (param0 != -46) {
              bi.a((byte) 87);
            }
            if (param3 >= 0 &&
              this.field_c >= param3) {
              var6 = this.a(-24942, param2, param3, true, param1) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(-24942, param2, param3, false, param1) ? 1 : 0;
              }
              stackIn_10_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_10_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var5_ref;
          stackIn_15_1 = new StringBuilder().append("bi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_23_0 = null;
          byte[] stackIn_53_0 = null;
          Object stackIn_56_0 = null;
          Throwable decompiledCaughtException = null;
          Object var3 = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var18 = 0;
          var18 = SolKnight.field_L ? 1 : 0;
          var3 = this.field_f;
          synchronized (var3) {
            try {
              if ((long)(6 + param1 * 6) > this.field_g.a(33)) {
                return null;
              }
              this.field_g.a((long)(6 * param1), (byte) 45);
              this.field_g.b(aj.field_t, -100, 0, 6);
              var4_int = ((aj.field_t[0] & 255) << 16) + ((255 & aj.field_t[1]) << 8) + (255 & aj.field_t[2]);
              var5 = (255 & aj.field_t[5]) + ((255 & aj.field_t[4]) << 8) + ((255 & aj.field_t[3]) << 16);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_c) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > this.field_f.a(33) / 520L) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              if (param0 != -925871512) {
                this.field_j = 45;
              }
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var4_int <= var7) {
                  stackIn_53_0 = var6;
                  return stackIn_53_0;
                }
                if (var5 == 0) {
                  stackIn_23_0 = null;
                  return (byte[]) (stackIn_23_0);
                }
                this.field_f.a((long)(var5 * 520), (byte) 45);
                var9 = var4_int - var7;
                if (65535 >= param1) {
                  if (512 < var9) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_f.b(aj.field_t, param0 + 925871438, 0, var9 + var14);
                  var13 = 255 & aj.field_t[7];
                  var10 = ((aj.field_t[0] & 255) << 8) + (aj.field_t[1] & 255);
                  var11 = (aj.field_t[2] << 8 & 65280) + (255 & aj.field_t[3]);
                  var12 = ((255 & aj.field_t[5]) << 8) + (16711680 & aj.field_t[4] << 16) + (255 & aj.field_t[6]);
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_f.b(aj.field_t, -79, 0, var9 + var14);
                  var13 = aj.field_t[9] & 255;
                  var12 = ((255 & aj.field_t[7]) << 8) + (16711680 & aj.field_t[6] << 16) + (255 & aj.field_t[8]);
                  var10 = (255 & aj.field_t[3]) + (aj.field_t[0] << 24 & -16777216) + ((16711680 & aj.field_t[1] << 16) + ((255 & aj.field_t[2]) << 8));
                  var11 = (255 & aj.field_t[5]) + (65280 & aj.field_t[4] << 8);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_j != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > (this.field_f.a(33) / 520L)) {
                  return null;
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = aj.field_t[var16];
                }
                var8++;
                var5 = var12;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_56_0 = null;
              return (byte[]) (stackIn_56_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(int param0, byte[] param1, int param2, boolean param3, int param4) {
        try {
          RuntimeException stackIn_68_0 = null;
          StringBuilder stackIn_68_1 = null;
          String stackIn_69_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          byte[] var17 = null;
          var16 = SolKnight.field_L ? 1 : 0;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param3) {
                  if (this.field_g.a(33) < (long)(param4 * 6 + 6)) {
                    return false;
                  }
                  this.field_g.a((long)(param4 * 6), (byte) 45);
                  this.field_g.b(aj.field_t, param0 ^ 24851, 0, 6);
                  var7_int = (aj.field_t[5] & 255) + ((aj.field_t[3] << 16 & 16711680) + (aj.field_t[4] << 8 & 65280));
                  if (0 >= var7_int ||
                    !(this.field_f.a(33) / 520L >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_f.a(33) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                aj.field_t[1] = (byte)(param2 >> 8);
                aj.field_t[2] = (byte)param2;
                aj.field_t[5] = (byte)var7_int;
                aj.field_t[0] = (byte)(param2 >> 16);
                aj.field_t[3] = (byte)(var7_int >> 16);
                aj.field_t[4] = (byte)(var7_int >> 8);
                this.field_g.a((long)(param4 * 6), (byte) 45);
                this.field_g.a(aj.field_t, -20291, 6, 0);
                if (param0 != -24942) {
                  var17 = (byte[]) null;
                  this.a((byte) -38, -14, (byte[]) null, 28);
                }
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param2 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_f.a((long)(520 * var7_int), (byte) 45);
                      if (param4 > 65535) {
                        try {
                          this.field_f.b(aj.field_t, param0 + 24822, 0, 10);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = (255 & aj.field_t[8]) + (aj.field_t[6] << 16 & 16711680) + (aj.field_t[7] << 8 & 65280);
                        var11 = (255 & aj.field_t[3]) + (((aj.field_t[2] & 255) << 8) + (aj.field_t[1] << 16 & 16711680) + ((aj.field_t[0] & 255) << 24));
                        var13 = aj.field_t[9] & 255;
                        var12 = (255 & aj.field_t[5]) + ((aj.field_t[4] & 255) << 8);
                      } else {
                        try {
                          this.field_f.b(aj.field_t, -118, 0, 8);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var10 = (16711680 & aj.field_t[4] << 16) - (-(aj.field_t[5] << 8 & 65280) - (aj.field_t[6] & 255));
                        var12 = ((255 & aj.field_t[2]) << 8) + (aj.field_t[3] & 255);
                        var13 = 255 & aj.field_t[7];
                        var11 = (255 & aj.field_t[1]) + (aj.field_t[0] << 8 & 65280);
                      }
                      if ((var11 == param4 &&
                        var12 == var9 &&
                        this.field_j == var13) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_f.a(33) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      var10 = (int)((this.field_f.a(33) + 519L) / 520L);
                      param3 = false;
                      if (0 == var10) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (param2 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param4 > 65535) {
                      aj.field_t[3] = (byte)param4;
                      aj.field_t[2] = (byte)(param4 >> 8);
                      aj.field_t[9] = (byte)this.field_j;
                      aj.field_t[1] = (byte)(param4 >> 16);
                      aj.field_t[0] = (byte)(param4 >> 24);
                      aj.field_t[6] = (byte)(var10 >> 16);
                      aj.field_t[5] = (byte)var9;
                      aj.field_t[7] = (byte)(var10 >> 8);
                      aj.field_t[4] = (byte)(var9 >> 8);
                      aj.field_t[8] = (byte)var10;
                      this.field_f.a((long)(var7_int * 520), (byte) 45);
                      this.field_f.a(aj.field_t, -20291, 10, 0);
                      var11 = param2 - var8;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_f.a(param1, -20291, var11, var8);
                      var8 = var8 + var11;
                    } else {
                      aj.field_t[1] = (byte)param4;
                      aj.field_t[0] = (byte)(param4 >> 8);
                      aj.field_t[3] = (byte)var9;
                      aj.field_t[6] = (byte)var10;
                      aj.field_t[4] = (byte)(var10 >> 16);
                      aj.field_t[7] = (byte)this.field_j;
                      aj.field_t[5] = (byte)(var10 >> 8);
                      aj.field_t[2] = (byte)(var9 >> 8);
                      this.field_f.a((long)(var7_int * 520), (byte) 45);
                      this.field_f.a(aj.field_t, -20291, 8, 0);
                      var11 = -var8 + param2;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_f.a(param1, param0 ^ 11823, var11, var8);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
                    continue;
                  }
                  break;
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var6_ref;
            stackIn_68_1 = new StringBuilder().append("bi.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_j;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 102) {
          field_i = -73;
        }
    }

    bi(int param0, hb param1, hb param2, int param3) {
        this.field_g = null;
        this.field_c = 65000;
        this.field_f = null;
        try {
          this.field_f = param1;
          this.field_g = param2;
          this.field_j = param0;
          this.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "bi.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = null;
        field_a = 64;
        field_d = 2;
        field_i = 262144;
    }
}
