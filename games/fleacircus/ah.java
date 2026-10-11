/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ah {
    private int field_b;
    static sf field_a;
    static boolean field_c;
    private int field_d;
    static int[] field_g;
    private k field_f;
    private k field_e;

    public final String toString() {
        return "" + this.field_d;
    }

    final boolean a(byte[] param0, int param1, int param2, byte param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        Throwable var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_f;
          synchronized (var5) {
            if (param1 >= 0 &&
              this.field_b >= param1) {
              var6 = this.a((byte) 37, param0, param1, param2, true) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a((byte) 37, param0, param1, param2, false) ? 1 : 0;
              }
              var7 = -45 % ((param3 - 42) / 43);
              stackIn_7_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_7_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("ah.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final boolean a(byte param0, byte[] param1, int param2, int param3, boolean param4) {
        try {
          RuntimeException stackIn_69_0 = null;
          StringBuilder stackIn_69_1 = null;
          String stackIn_70_2 = null;
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
          var16 = fleas.field_A ? 1 : 0;
          try {
            var6 = this.field_f;
            synchronized (var6) {
              try {
                if (param4) {
                  if (this.field_e.c((byte) -123) < (long)(6 + param3 * 6)) {
                    return false;
                  }
                  this.field_e.a(-116, (long)(param3 * 6));
                  this.field_e.a(nf.field_G, 0, 6, 6520);
                  var7_int = (nf.field_G[5] & 255) + ((16711680 & nf.field_G[3] << 16) + ((255 & nf.field_G[4]) << 8));
                  if (var7_int <= 0 ||
                    !(this.field_f.c((byte) -83) / 520L >= (long)var7_int)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_f.c((byte) -91) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                nf.field_G[0] = (byte)(param2 >> 16);
                nf.field_G[2] = (byte)param2;
                nf.field_G[3] = (byte)(var7_int >> 16);
                nf.field_G[5] = (byte)var7_int;
                nf.field_G[1] = (byte)(param2 >> 8);
                nf.field_G[4] = (byte)(var7_int >> 8);
                this.field_e.a(param0 ^ -81, (long)(6 * param3));
                if (param0 != 37) {
                  ah.a(103);
                }
                this.field_e.a(0, nf.field_G, 6, (byte) 114);
                var8 = 0;
                var9 = 0;
                L4: while (true) {
                  if (param2 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param4) {
                      this.field_f.a(-124, (long)(var7_int * 520));
                      if (param3 <= 65535) {
                        try {
                          this.field_f.a(nf.field_G, 0, 8, 6520);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L4;
                        }
                        var11 = (nf.field_G[0] << 8 & 65280) + (255 & nf.field_G[1]);
                        var13 = nf.field_G[7] & 255;
                        var12 = (65280 & nf.field_G[2] << 8) + (nf.field_G[3] & 255);
                        var10 = (65280 & nf.field_G[5] << 8) + (((255 & nf.field_G[4]) << 16) + (nf.field_G[6] & 255));
                      } else {
                        try {
                          this.field_f.a(nf.field_G, 0, 10, 6520);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L4;
                        }
                        var10 = (65280 & nf.field_G[7] << 8) + ((nf.field_G[6] & 255) << 16) + (nf.field_G[8] & 255);
                        var11 = (255 & nf.field_G[3]) + (nf.field_G[2] << 8 & 65280) + (((255 & nf.field_G[1]) << 16) + ((255 & nf.field_G[0]) << 24));
                        var12 = ((255 & nf.field_G[4]) << 8) + (255 & nf.field_G[5]);
                        var13 = nf.field_G[9] & 255;
                      }
                      if ((var11 == param3 &&
                        var12 == var9 &&
                        this.field_d == var13) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !(this.field_f.c((byte) -76) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (0 == var10) {
                      param4 = false;
                      var10 = (int)((519L + this.field_f.c((byte) -48)) / 520L);
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
                    if (param3 <= 65535) {
                      nf.field_G[4] = (byte)(var10 >> 16);
                      nf.field_G[7] = (byte)this.field_d;
                      nf.field_G[0] = (byte)(param3 >> 8);
                      nf.field_G[5] = (byte)(var10 >> 8);
                      nf.field_G[3] = (byte)var9;
                      nf.field_G[2] = (byte)(var9 >> 8);
                      nf.field_G[6] = (byte)var10;
                      nf.field_G[1] = (byte)param3;
                      this.field_f.a(-111, (long)(var7_int * 520));
                      this.field_f.a(0, nf.field_G, 8, (byte) 92);
                      var11 = -var8 + param2;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_f.a(var8, param1, var11, (byte) -30);
                      var8 = var8 + var11;
                    } else {
                      nf.field_G[3] = (byte)param3;
                      nf.field_G[8] = (byte)var10;
                      nf.field_G[6] = (byte)(var10 >> 16);
                      nf.field_G[0] = (byte)(param3 >> 24);
                      nf.field_G[4] = (byte)(var9 >> 8);
                      nf.field_G[7] = (byte)(var10 >> 8);
                      nf.field_G[2] = (byte)(param3 >> 8);
                      nf.field_G[9] = (byte)this.field_d;
                      nf.field_G[1] = (byte)(param3 >> 16);
                      nf.field_G[5] = (byte)var9;
                      this.field_f.a(-104, (long)(520 * var7_int));
                      this.field_f.a(0, nf.field_G, 10, (byte) 76);
                      var11 = param2 - var8;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_f.a(var8, param1, var11, (byte) -59);
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
            stackIn_69_0 = var6_ref;
            stackIn_69_1 = new StringBuilder().append("ah.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw pf.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
          ah.a(18);
        }
        field_a = null;
    }

    final byte[] a(byte param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
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
          Object stackIn_3_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_15_0 = null;
          Object stackIn_21_0 = null;
          Object stackIn_36_0 = null;
          byte[] stackIn_49_0 = null;
          byte[] stackIn_52_0 = null;
          Object stackIn_55_0 = null;
          Throwable decompiledCaughtException = null;
          IOException var4 = null;
          var18 = fleas.field_A ? 1 : 0;
          var3_ref = this.field_f;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param1 * 6) > this.field_e.c((byte) -110)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_e.a(-119, (long)(6 * param1));
              this.field_e.a(nf.field_G, 0, 6, 6520);
              var4_int = ((nf.field_G[0] & 255) << 16) + ((nf.field_G[1] << 8 & 65280) + (255 & nf.field_G[2]));
              var5 = (65280 & nf.field_G[4] << 8) + ((16711680 & nf.field_G[3] << 16) + (nf.field_G[5] & 255));
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_b) {
                stackIn_9_0 = null;
                return (byte[]) (stackIn_9_0);
              }
              if (0 >= var5) {
                return null;
              }
              if ((long)var5 > this.field_f.c((byte) -103) / 520L) {
                stackIn_15_0 = null;
                return (byte[]) (stackIn_15_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var4_int > var7) {
                if (0 == var5) {
                  stackIn_21_0 = null;
                  return (byte[]) (stackIn_21_0);
                }
                this.field_f.a(param0 - 23, (long)(var5 * 520));
                var9 = -var7 + var4_int;
                if (65535 >= param1) {
                  var14 = 8;
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  this.field_f.a(nf.field_G, 0, var14 + var9, 6520);
                  var12 = (nf.field_G[6] & 255) + (((255 & nf.field_G[5]) << 8) + ((255 & nf.field_G[4]) << 16));
                  var10 = ((255 & nf.field_G[0]) << 8) + (255 & nf.field_G[1]);
                  var11 = (65280 & nf.field_G[2] << 8) + (255 & nf.field_G[3]);
                  var13 = 255 & nf.field_G[7];
                } else {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_f.a(nf.field_G, 0, var9 + var14, 6520);
                  var10 = ((255 & nf.field_G[0]) << 24) + (16711680 & nf.field_G[1] << 16) + (65280 & nf.field_G[2] << 8) + (nf.field_G[3] & 255);
                  var11 = (nf.field_G[4] << 8 & 65280) + (255 & nf.field_G[5]);
                  var13 = nf.field_G[9] & 255;
                  var12 = (65280 & nf.field_G[7] << 8) + (16711680 & nf.field_G[6] << 16) + (nf.field_G[8] & 255);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_d != var13) {
                  stackIn_36_0 = null;
                  return (byte[]) (stackIn_36_0);
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_f.c((byte) -125) / 520L) {
                  return null;
                }
                var15 = var9 + var14;
                var5 = var12;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = nf.field_G[var16];
                }
              }
              if (param0 == -90) {
                stackIn_52_0 = var6;
                return stackIn_52_0;
              }
              stackIn_49_0 = (byte[]) null;
              return stackIn_49_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_55_0 = null;
              return (byte[]) (stackIn_55_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = fleas.field_A ? 1 : 0;
        try {
          if (param0 != -1) {
            field_c = true;
          }
          if (vf.c((byte) -5)) {
            mg.field_a.a(hm.field_d, param0 + 41, true, bk.field_b);
            mg.field_a.d(true);
            while (wf.b(-113)) {
              mg.field_a.a(id.field_b, (byte) -105, ji.field_a);
            }
            return;
          }
          if (null != rh.field_p &&
            rh.field_p.field_c) {
            lh.a(false);
            mg.field_a.b(new ic(mg.field_a, fb.field_g), (byte) -35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ah.C(" + param0 + ')');
        }
    }

    ah(int param0, k param1, k param2, int param3) {
        this.field_b = 65000;
        this.field_f = null;
        this.field_e = null;
        try {
          this.field_b = param3;
          this.field_e = param2;
          this.field_f = param1;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "ah.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = false;
        field_g = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
