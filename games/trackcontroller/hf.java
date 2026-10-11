/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    private int field_c;
    static le field_f;
    private il field_g;
    private int field_e;
    private il field_h;
    static String field_a;
    static byte[][] field_b;
    static int field_d;

    final static void a(oh param0, int param1, int param2, int param3, boolean param4, int param5, int param6, oh param7, int param8, int param9, na param10, int param11, int param12, int param13, na param14, int param15, int param16, int param17, na param18, int param19, int param20) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        na var22 = null;
        try {
          ha.a(param7, 2, param2, param0);
          vb.a(param1, param16, -74, param11, param5);
          jk.a(param20, -114, param12);
          uh.a(param8, param10, param17, -97, param13, param14);
          we.a(param19, 104, param15, param18);
          he.a(param9, 0, param3, param6);
          if (param4) {
            var22 = (na) null;
            hf.a((oh) null, 9, -29, 58, false, 115, 108, (oh) null, 122, -19, (na) null, -127, 114, -93, (na) null, -79, 80, -6, (na) null, 93, 114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("hf.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',');
          if (param18 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        try {
          int var2_int = 0;
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          if (ne.field_a.field_k >= param0) {
            return true;
          }
          if (null == r.field_i) {
            return false;
          }
          try {
            if (param1) {
              hf.a(99);
            }
            var2_int = r.field_i.b(0);
            if (var2_int > 0) {
              if (var2_int > param0 - ne.field_a.field_k) {
                var2_int = -ne.field_a.field_k + param0;
              }
              r.field_i.a(ne.field_a.field_j, 0, var2_int, ne.field_a.field_k);
              he.field_a = qg.a(false);
              ne.field_a.field_k = ne.field_a.field_k + var2_int;
              if (ne.field_a.field_k < param0) {
                return false;
              }
              ne.field_a.field_k = 0;
              return true;
            }
            if (var2_int >= 0 &&
              30000L >= bj.b(-21676)) {
              return false;
            }
            lj.a((byte) 113);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = (IOException) (Object) decompiledCaughtException;
            lj.a((byte) 117);
          }
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(byte param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$0 = 0;
          Object stackIn_3_0 = null;
          Object stackIn_11_0 = null;
          Object stackIn_17_0 = null;
          Object stackIn_46_0 = null;
          byte[] stackIn_52_0 = null;
          Object stackIn_55_0 = null;
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
          var18 = TrackController.field_F ? 1 : 0;
          var3 = this.field_h;
          synchronized (var3) {
            try {
              if ((long)(6 + param1 * 6) > this.field_g.a((byte) -88)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_g.a((long)(6 * param1), true);
              this.field_g.a(fh.field_a, 6, 0, 0);
              if (param0 >= -89) {
                field_f = (le) null;
              }
              var4_int = (65280 & fh.field_a[1] << 8) + ((fh.field_a[0] & 255) << 16) + (255 & fh.field_a[2]);
              var5 = (fh.field_a[3] << 16 & 16711680) - (-(65280 & fh.field_a[4] << 8) - (fh.field_a[5] & 255));
              if (0 > var4_int) {
                return null;
              }
              if (var4_int > this.field_e) {
                stackIn_11_0 = null;
                return (byte[]) (stackIn_11_0);
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_h.a((byte) -128) / 520L < (long)var5) {
                stackIn_17_0 = null;
                return (byte[]) (stackIn_17_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (true) {
                if (var7 >= var4_int) {
                  stackIn_52_0 = var6;
                  return stackIn_52_0;
                }
                if (var5 == 0) {
                  return null;
                }
                this.field_h.a((long)(var5 * 520), true);
                var9 = -var7 + var4_int;
                if (param1 > 65535) {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_h.a(fh.field_a, var14 + var9, 0, 0);
                  var10 = (255 & fh.field_a[3]) + (((fh.field_a[2] & 255) << 8) + (((255 & fh.field_a[0]) << 24) + (fh.field_a[1] << 16 & 16711680)));
                  var11 = (fh.field_a[5] & 255) + ((fh.field_a[4] & 255) << 8);
                  var13 = fh.field_a[9] & 255;
                  var12 = ((255 & fh.field_a[7]) << 8) + (fh.field_a[6] << 16 & 16711680) + (fh.field_a[8] & 255);
                } else {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_h.a(fh.field_a, var14 + var9, 0, 0);
                  var12 = (fh.field_a[6] & 255) + ((fh.field_a[4] & 255) << 16) + (65280 & fh.field_a[5] << 8);
                  var11 = (fh.field_a[3] & 255) + ((255 & fh.field_a[2]) << 8);
                  var13 = 255 & fh.field_a[7];
                  var10 = ((fh.field_a[0] & 255) << 8) + (fh.field_a[1] & 255);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var8 != var11) {
                  return null;
                }
                if (this.field_c != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_h.a((byte) -88) / 520L) {
                  stackIn_46_0 = null;
                  return (byte[]) (stackIn_46_0);
                }
                var15 = var9 + var14;
                var8++;
                var5 = var12;
                for (var16 = var14; var16 < var15; var16++) {
                  incrementValue$0 = var7;
                  var7++;
                  var6[incrementValue$0] = fh.field_a[var16];
                }
              }
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

    public final String toString() {
        return "" + this.field_c;
    }

    public static void a(int param0) {
        field_b = (byte[][]) null;
        if (param0 != 6) {
          na var2 = (na) null;
          hf.a((oh) null, 27, 98, -128, true, -24, 31, (oh) null, 112, -78, (na) null, -60, 114, 126, (na) null, -28, 7, 29, (na) null, -35, -108);
        }
        field_a = null;
        field_f = null;
    }

    private final boolean a(byte[] param0, int param1, int param2, boolean param3, boolean param4) {
        try {
          il stackIn_60_0 = null;
          long stackIn_60_1 = 0L;
          boolean stackIn_61_2 = false;
          RuntimeException stackIn_75_0 = null;
          StringBuilder stackIn_75_1 = null;
          String stackIn_76_2 = null;
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
          var16 = TrackController.field_F ? 1 : 0;
          try {
            var6 = this.field_h;
            synchronized (var6) {
              if (param4) {
                return false;
              }
              try {
                if (param3) {
                  if ((long)(6 * param1 + 6) > this.field_g.a((byte) -95)) {
                    return false;
                  }
                  this.field_g.a((long)(6 * param1), true);
                  this.field_g.a(fh.field_a, 6, 0, 0);
                  var7_int = ((fh.field_a[4] & 255) << 8) + ((16711680 & fh.field_a[3] << 16) + (255 & fh.field_a[5]));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_h.a((byte) -77) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_h.a((byte) -106) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                fh.field_a[3] = (byte)(var7_int >> 16);
                fh.field_a[1] = (byte)(param2 >> 8);
                fh.field_a[0] = (byte)(param2 >> 16);
                fh.field_a[4] = (byte)(var7_int >> 8);
                fh.field_a[2] = (byte)param2;
                fh.field_a[5] = (byte)var7_int;
                this.field_g.a((long)(param1 * 6), true);
                this.field_g.a(6, -1, fh.field_a, 0);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param2 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param3) {
                      this.field_h.a((long)(520 * var7_int), true);
                      if (65535 < param1) {
                        try {
                          this.field_h.a(fh.field_a, 10, 0, 0);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var11 = ((fh.field_a[1] & 255) << 16) + (-16777216 & fh.field_a[0] << 24) + ((255 & fh.field_a[2]) << 8) + (255 & fh.field_a[3]);
                        var12 = (fh.field_a[4] << 8 & 65280) + (fh.field_a[5] & 255);
                        var10 = ((255 & fh.field_a[6]) << 16) + (((fh.field_a[7] & 255) << 8) + (fh.field_a[8] & 255));
                        var13 = 255 & fh.field_a[9];
                      } else {
                        try {
                          this.field_h.a(fh.field_a, 8, 0, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var12 = (255 & fh.field_a[3]) + ((255 & fh.field_a[2]) << 8);
                        var13 = 255 & fh.field_a[7];
                        var11 = (fh.field_a[0] << 8 & 65280) + (255 & fh.field_a[1]);
                        var10 = (255 & fh.field_a[6]) + (16711680 & fh.field_a[4] << 16) + (fh.field_a[5] << 8 & 65280);
                      }
                      if ((param1 == var11 &&
                        var9 == var12 &&
                        var13 == this.field_c) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_h.a((byte) -102) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param3 = false;
                      var10 = (int)((519L + this.field_h.a((byte) -104)) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var7_int == var10) {
                        var10++;
                      }
                    }
                    if (512 >= param2 - var8) {
                      var10 = 0;
                    }
                    if (param1 > 65535) {
                      fh.field_a[2] = (byte)(param1 >> 8);
                      fh.field_a[7] = (byte)(var10 >> 8);
                      fh.field_a[4] = (byte)(var9 >> 8);
                      fh.field_a[8] = (byte)var10;
                      fh.field_a[5] = (byte)var9;
                      fh.field_a[9] = (byte)this.field_c;
                      fh.field_a[0] = (byte)(param1 >> 24);
                      fh.field_a[6] = (byte)(var10 >> 16);
                      fh.field_a[1] = (byte)(param1 >> 16);
                      fh.field_a[3] = (byte)param1;
                      stackIn_60_0 = this.field_h;
                      stackIn_60_1 = (long)(520 * var7_int);
                      stackIn_61_2 = !(param4);
                      ((il) (Object) stackIn_60_0).a(stackIn_60_1, stackIn_61_2);
                      this.field_h.a(10, -1, fh.field_a, 0);
                      var11 = -var8 + param2;
                      if (510 < var11) {
                        var11 = 510;
                      }
                      this.field_h.a(var11, -1, param0, var8);
                      var8 = var8 + var11;
                    } else {
                      fh.field_a[1] = (byte)param1;
                      fh.field_a[6] = (byte)var10;
                      fh.field_a[3] = (byte)var9;
                      fh.field_a[2] = (byte)(var9 >> 8);
                      fh.field_a[5] = (byte)(var10 >> 8);
                      fh.field_a[4] = (byte)(var10 >> 16);
                      fh.field_a[7] = (byte)this.field_c;
                      fh.field_a[0] = (byte)(param1 >> 8);
                      this.field_h.a((long)(var7_int * 520), true);
                      this.field_h.a(8, -1, fh.field_a, 0);
                      var11 = -var8 + param2;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_h.a(var11, -1, param0, var8);
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
            stackIn_75_0 = var6_ref;
            stackIn_75_1 = new StringBuilder().append("hf.B(");
            if (param0 == null) {
              stackIn_76_2 = "null";
            } else {
              stackIn_76_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_75_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    hf(int param0, il param1, il param2, int param3) {
        this.field_g = null;
        this.field_e = 65000;
        this.field_h = null;
        try {
          this.field_e = param3;
          this.field_g = param2;
          this.field_h = param1;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw sl.a((Throwable) ((Object) runtimeException), "hf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        Object var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5_ref = this.field_h;
          synchronized (var5_ref) {
            if (param3 >= 0 &&
              param3 <= this.field_e) {
              if (param0 != -1023648016) {
                return true;
              }
              var6 = this.a(param2, param1, param3, true, false) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(param2, param1, param3, false, false) ? 1 : 0;
              }
              stackIn_11_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var5_ref2;
          stackIn_16_1 = new StringBuilder().append("hf.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Email is valid";
        field_f = new le();
        field_b = new byte[50][];
    }
}
