/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc extends ji {
    private int field_I;
    private int field_z;
    static int field_O;
    static boolean field_B;
    static lg[] field_J;
    static String field_M;
    static mc field_P;
    static long field_F;
    static qi field_L;
    static String field_K;
    private int field_C;
    private int field_N;
    private byte[] field_E;
    private short[] field_D;
    private int field_H;
    private int field_y;

    final void a(byte param0, int param1, ed param2) {
        int dupTemp$0 = 0;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            field_F = -51L;
          }
          var4_int = param1;
          if (var4_int != 0) {
            if (var4_int != 1) {
              if (var4_int != 2) {
                if (var4_int == 3) {
                  this.field_C = param2.h(-11);
                } else {
                  if (4 != var4_int) {
                    if (5 == var4_int) {
                      this.field_y = param2.h(param0 ^ -101);
                    } else {
                      if (var4_int == 6) {
                        this.field_I = param2.h(-11);
                      }
                    }
                  } else {
                    this.field_z = param2.h(-11);
                  }
                }
              } else {
                this.field_H = param2.a((byte) -11);
              }
            } else {
              this.field_N = param2.h(-11);
            }
          } else {
            dupTemp$0 = param2.h(-11);
            this.field_I = dupTemp$0;
            this.field_y = dupTemp$0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("dc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int var14 = 0;
        int var8 = 0;
        int var7 = 0;
        int incrementValue$0 = 0;
        int stackIn_10_0 = 0;
        byte[] stackIn_10_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_15_0;
        int stackIn_15_1;
        byte[] stackIn_15_2;
        int stackIn_15_3;
        int stackIn_16_4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        double stackIn_38_0 = 0.0;
        int stackIn_39_1 = 0;
        double stackIn_41_0 = 0.0;
        int stackIn_42_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_50_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var18Lifetime1;
        var19 = Vertigo2.field_L ? 1 : 0;
        var3 = this.field_x.a(param0, (byte) -84);
        if (param1 < 91) {
          field_J = (lg[]) null;
        }
        if (this.field_x.field_i) {
          var4 = 2048 + this.field_I * lf.field_y[param0];
          var5 = var4 >> 12;
          var6 = 1 + var5;
          for (var14 = 0; var14 < we.field_M; var14++) {
            pl.field_q = 2147483647;
            hb.field_p = 2147483647;
            hj.field_d = 2147483647;
            fq.field_g = 2147483647;
            var15 = this.field_y * rh.field_O[var14] + 2048;
            var16 = var15 >> 12;
            var17 = 1 + var16;
            for (var8 = -1 + var5; var8 <= var6; var8++) {
              stackIn_10_0 = 255;
              stackIn_10_1 = this.field_E;
              if (var8 < this.field_I) {
                stackIn_11_2 = var8;
              } else {
                stackIn_11_2 = -this.field_I + var8;
              }
              var12 = stackIn_10_0 & stackIn_10_1[stackIn_11_2 & 255];
              for (var7 = -1 + var16; var17 >= var7; var7++) {
                stackIn_15_0 = 2;
                stackIn_15_1 = 255;
                stackIn_15_2 = this.field_E;
                stackIn_15_3 = var12;
                if (this.field_y > var7) {
                  stackIn_16_4 = var7;
                } else {
                  stackIn_16_4 = var7 - this.field_y;
                }
                var13 = stackIn_15_0 * (stackIn_15_1 & stackIn_15_2[stackIn_15_3 + stackIn_16_4 & 255]);
                incrementValue$0 = var13;
                var13++;
                var9 = -this.field_D[incrementValue$0] - ((var7 << 12) - var15);
                var10 = var4 - this.field_D[var13] - (var8 << 12);
                var18 = this.field_z;
                if (var18 != 1) {
                  if (var18 != 3) {
                    if (var18 == 4) {
                      stackIn_38_0 = 4096.0;
                      if (var9 >= 0) {
                        stackIn_39_1 = var9;
                      } else {
                        stackIn_39_1 = -var9;
                      }
                      var9 = (int)(stackIn_38_0 * Math.sqrt((double)((float)stackIn_39_1 / 4096.0f)));
                      stackIn_41_0 = 4096.0;
                      if (var10 < 0) {
                        stackIn_42_1 = -var10;
                      } else {
                        stackIn_42_1 = var10;
                      }
                      var10 = (int)(stackIn_41_0 * Math.sqrt((double)((float)stackIn_42_1 / 4096.0f)));
                      var11 = var10 + var9;
                      var11 = var11 * var11 >> 12;
                    } else {
                      if (var18 != 5) {
                        if (2 != var18) {
                          var11 = (int)(Math.sqrt((double)((float)(var10 * var10 + var9 * var9) / 16777216.0f)) * 4096.0);
                        } else {
                          if (var10 < 0) {
                            stackIn_47_0 = -var10;
                          } else {
                            stackIn_47_0 = var10;
                          }
                          if (var9 < 0) {
                            stackIn_50_1 = -var9;
                          } else {
                            stackIn_50_1 = var9;
                          }
                          var11 = stackIn_47_0 + stackIn_50_1;
                        }
                      } else {
                        var9 = var9 * var9;
                        var10 = var10 * var10;
                        var11 = (int)(Math.sqrt(Math.sqrt((double)((float)(var9 + var10) / 16777216.0f))) * 4096.0);
                      }
                    }
                  } else {
                    if (var9 >= 0) {
                      stackIn_29_0 = var9;
                    } else {
                      stackIn_29_0 = -var9;
                    }
                    var9 = stackIn_29_0;
                    if (var10 < 0) {
                      stackIn_32_0 = -var10;
                    } else {
                      stackIn_32_0 = var10;
                    }
                    var10 = stackIn_32_0;
                    stackIn_35_0 = (var9 <= var10) ? var10 : var9;
                    var11 = stackIn_35_0;
                  }
                } else {
                  var11 = var9 * var9 + var10 * var10 >> 12;
                }
                if (var11 >= pl.field_q) {
                  if (hj.field_d <= var11) {
                    if (hb.field_p > var11) {
                      fq.field_g = hb.field_p;
                      hb.field_p = var11;
                    } else {
                      if (var11 < fq.field_g) {
                        fq.field_g = var11;
                      }
                    }
                  } else {
                    fq.field_g = hb.field_p;
                    hb.field_p = hj.field_d;
                    hj.field_d = var11;
                  }
                } else {
                  fq.field_g = hb.field_p;
                  hb.field_p = hj.field_d;
                  hj.field_d = pl.field_q;
                  pl.field_q = var11;
                }
              }
            }
            var18Lifetime1 = this.field_C;
            if (var18Lifetime1 == 0) {
              var3[var14] = pl.field_q;
            } else {
              if (1 != var18Lifetime1) {
                if (var18Lifetime1 != 3) {
                  if (var18Lifetime1 != 4) {
                    if (var18Lifetime1 == 2) {
                      var3[var14] = -pl.field_q + hj.field_d;
                    }
                  } else {
                    var3[var14] = fq.field_g;
                  }
                } else {
                  var3[var14] = hb.field_p;
                }
              } else {
                var3[var14] = hj.field_d;
              }
            }
          }
        }
        return var3;
    }

    final static void a(boolean param0, byte param1) {
        if (param1 != -110) {
          field_L = (qi) null;
        }
        if (nj.field_b != null) {
          bi.d(bi.field_d, bi.field_f, bi.field_i - bi.field_d, bi.field_c - bi.field_f);
          nj.field_b.b(param0, param1 + 110);
        }
    }

    public static void g(int param0) {
        field_L = null;
        field_K = null;
        field_P = null;
        field_J = null;
        field_M = null;
        if (param0 <= 28) {
          cc var2 = (cc) null;
          dc.a(-55, (String) null, (byte) -15, (String[]) null, (cc) null);
        }
    }

    private final void b(byte param0) {
        int var3 = 0;
        int var4 = Vertigo2.field_L ? 1 : 0;
        Random var5 = new Random((long)this.field_N);
        Random var2 = var5;
        int var3Lifetime1;
        this.field_D = new short[512];
        if (this.field_H > 0) {
          for (var3 = 0; 512 > var3; var3++) {
            this.field_D[var3] = (short)mj.a(-118, var5, this.field_H);
          }
        }
        var3Lifetime1 = -101 / ((83 - param0) / 42);
    }

    public dc() {
        super(0, true);
        this.field_z = 1;
        this.field_I = 5;
        this.field_C = 2;
        this.field_N = 0;
        this.field_E = new byte[512];
        this.field_D = new short[512];
        this.field_H = 2048;
        this.field_y = 5;
    }

    final static int a(int param0, String param1, byte param2, String[] param3, cc param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = param4.c(param1);
          if (var5_int <= param0 &&
            param1.indexOf("<br>") == -1) {
            param3[0] = param1;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (-1 + (param0 + var5_int)) / param0;
          if (param2 <= 5) {
            field_L = (qi) null;
          }
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param1.charAt(var9);
            if (32 == var10 ||
              var10 == 45) {
              var11 = param1.substring(var7, var9 + 1).trim();
              var12 = param4.c(var11);
              if (param0 <= var12) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param3[incrementValue$1] = var11;
                var7 = 1 + var9;
              }
            }
            if (var10 == 62 &&
              param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param3[incrementValue$2] = param1.substring(var7, var9 - 3).trim();
              var7 = 1 + var9;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param3[incrementValue$0] = param1.substring(var7, var8).trim();
          }
          stackIn_28_0 = var6Lifetime1;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("dc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final void a(int param0) {
        this.field_E = kk.a(this.field_N, (byte) 38);
        this.b((byte) -111);
        if (param0 >= -98) {
          cc var3 = (cc) null;
          dc.a(-24, (String) null, (byte) -105, (String[]) null, (cc) null);
        }
    }

    static {
        field_M = "Members";
        field_J = null;
        field_B = true;
        field_K = "to return to the normal view.";
        field_O = 0;
    }
}
