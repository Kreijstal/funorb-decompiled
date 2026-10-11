/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ua {
    private int field_e;
    static qr field_f;
    private ej field_a;
    private ej field_b;
    static pf field_d;
    private int field_i;
    static String field_g;
    static String[] field_c;
    static boolean[] field_h;

    private final boolean a(int param0, boolean param1, byte param2, int param3, byte[] param4) {
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
          var16 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var6 = this.field_b;
            synchronized (var6) {
              try {
                if (param1) {
                  if (this.field_a.a((byte) -72) < (long)(6 + param3 * 6)) {
                    return false;
                  }
                  this.field_a.a((byte) 77, (long)(6 * param3));
                  this.field_a.a(6, ho.field_i, (byte) -73, 0);
                  var7_int = (255 & ho.field_i[5]) + (((ho.field_i[4] & 255) << 8) + ((ho.field_i[3] & 255) << 16));
                  if (var7_int <= 0 ||
                    !((long)var7_int <= (this.field_b.a((byte) -89) / 520L))) {
                    return false;
                  }
                } else {
                  var7_int = (int)((this.field_b.a((byte) -116) + 519L) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                ho.field_i[4] = (byte)(var7_int >> 8);
                ho.field_i[1] = (byte)(param0 >> 8);
                ho.field_i[5] = (byte)var7_int;
                ho.field_i[3] = (byte)(var7_int >> 16);
                ho.field_i[2] = (byte)param0;
                ho.field_i[0] = (byte)(param0 >> 16);
                this.field_a.a((byte) 79, (long)(6 * param3));
                this.field_a.a(-105, 6, 0, ho.field_i);
                var8 = 0;
                var9 = 0;
                L3: while (true) {
                  if (param0 > var8) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param1) {
                      this.field_b.a((byte) -115, (long)(var7_int * 520));
                      if (param3 > 65535) {
                        try {
                          this.field_b.a(10, ho.field_i, (byte) 96, 0);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break L3;
                        }
                        var11 = (ho.field_i[3] & 255) + (16711680 & ho.field_i[1] << 16) + ((-16777216 & ho.field_i[0] << 24) + ((255 & ho.field_i[2]) << 8));
                        var12 = (ho.field_i[4] << 8 & 65280) + (255 & ho.field_i[5]);
                        var10 = (ho.field_i[8] & 255) + ((ho.field_i[7] & 255) << 8) + (16711680 & ho.field_i[6] << 16);
                        var13 = ho.field_i[9] & 255;
                      } else {
                        try {
                          this.field_b.a(8, ho.field_i, (byte) -114, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break L3;
                        }
                        var13 = 255 & ho.field_i[7];
                        var12 = ((ho.field_i[2] & 255) << 8) + (255 & ho.field_i[3]);
                        var11 = (ho.field_i[1] & 255) + ((ho.field_i[0] & 255) << 8);
                        var10 = (ho.field_i[6] & 255) + (16711680 & ho.field_i[4] << 16) + (ho.field_i[5] << 8 & 65280);
                      }
                      if ((var11 == param3 &&
                        var12 == var9 &&
                        var13 == this.field_i) &&
                        (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                        !((long)var10 <= (this.field_b.a((byte) -104) / 520L))))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param1 = false;
                      var10 = (int)((519L + this.field_b.a((byte) -68)) / 520L);
                      if (0 == var10) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (-var8 + param0 <= 512) {
                      var10 = 0;
                    }
                    if (param3 <= 65535) {
                      ho.field_i[0] = (byte)(param3 >> 8);
                      ho.field_i[3] = (byte)var9;
                      ho.field_i[6] = (byte)var10;
                      ho.field_i[2] = (byte)(var9 >> 8);
                      ho.field_i[1] = (byte)param3;
                      ho.field_i[4] = (byte)(var10 >> 16);
                      ho.field_i[5] = (byte)(var10 >> 8);
                      ho.field_i[7] = (byte)this.field_i;
                      this.field_b.a((byte) 107, (long)(var7_int * 520));
                      this.field_b.a(-66, 8, 0, ho.field_i);
                      var11 = -var8 + param0;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_b.a(101, var11, var8, param4);
                      var8 = var8 + var11;
                    } else {
                      ho.field_i[4] = (byte)(var9 >> 8);
                      ho.field_i[9] = (byte)this.field_i;
                      ho.field_i[1] = (byte)(param3 >> 16);
                      ho.field_i[5] = (byte)var9;
                      ho.field_i[7] = (byte)(var10 >> 8);
                      ho.field_i[3] = (byte)param3;
                      ho.field_i[8] = (byte)var10;
                      ho.field_i[6] = (byte)(var10 >> 16);
                      ho.field_i[0] = (byte)(param3 >> 24);
                      ho.field_i[2] = (byte)(param3 >> 8);
                      this.field_b.a((byte) 64, (long)(var7_int * 520));
                      this.field_b.a(-68, 10, 0, ho.field_i);
                      var11 = -var8 + param0;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_b.a(82, var11, var8, param4);
                      var8 = var8 + var11;
                    }
                    var9++;
                    var7_int = var10;
                    continue;
                  }
                  break;
                }
                var10 = -3 / ((70 - param2) / 49);
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
            stackIn_69_1 = new StringBuilder().append("ua.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_70_2 = "null";
            } else {
              stackIn_70_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final byte[] a(int param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
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
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_3_0 = null;
          byte[] stackIn_7_0 = null;
          Object stackIn_19_0 = null;
          Object stackIn_46_0 = null;
          byte[] stackIn_53_0 = null;
          Object stackIn_56_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = ShatteredPlansClient.field_F ? 1 : 0;
          var3_ref = this.field_b;
          synchronized (var3_ref) {
            try {
              if ((long)(6 + param0 * 6) > this.field_a.a((byte) -110)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_a.a((byte) -88, (long)(param0 * 6));
              if (param1 <= 57) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              this.field_a.a(6, ho.field_i, (byte) 67, 0);
              var4_int = (ho.field_i[2] & 255) + ((ho.field_i[0] & 255) << 16) + ((ho.field_i[1] & 255) << 8);
              var5 = (255 & ho.field_i[5]) + (ho.field_i[3] << 16 & 16711680) + ((255 & ho.field_i[4]) << 8);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_e) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if ((long)var5 > (this.field_b.a((byte) -124) / 520L)) {
                stackIn_19_0 = null;
                return (byte[]) (stackIn_19_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (0 == var5) {
                  return null;
                }
                this.field_b.a((byte) 84, (long)(var5 * 520));
                var9 = -var7 + var4_int;
                if (param0 > 65535) {
                  var14 = 10;
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  this.field_b.a(var14 + var9, ho.field_i, (byte) 46, 0);
                  var10 = (ho.field_i[3] & 255) + ((255 & ho.field_i[2]) << 8) + (((ho.field_i[1] & 255) << 16) + (ho.field_i[0] << 24 & -16777216));
                  var12 = ((255 & ho.field_i[7]) << 8) + ((255 & ho.field_i[6]) << 16) + (255 & ho.field_i[8]);
                  var13 = ho.field_i[9] & 255;
                  var11 = ((255 & ho.field_i[4]) << 8) + (ho.field_i[5] & 255);
                } else {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_b.a(var14 + var9, ho.field_i, (byte) 100, 0);
                  var10 = (255 & ho.field_i[1]) + (65280 & ho.field_i[0] << 8);
                  var11 = (ho.field_i[2] << 8 & 65280) + (ho.field_i[3] & 255);
                  var13 = ho.field_i[7] & 255;
                  var12 = ((ho.field_i[5] & 255) << 8) + (16711680 & ho.field_i[4] << 16) + (ho.field_i[6] & 255);
                }
                if (var10 != param0) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (this.field_i != var13) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if (this.field_b.a((byte) -107) / 520L < (long)var12) {
                  stackIn_46_0 = null;
                  return (byte[]) (stackIn_46_0);
                }
                var15 = var14 + var9;
                var8++;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = ho.field_i[var16];
                }
                var5 = var12;
              }
              stackIn_53_0 = var6;
              return stackIn_53_0;
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

    public final String toString() {
        return "" + this.field_i;
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != 4) {
          String var2 = (String) null;
          ua.a((String) null, (String) null, -43);
        }
    }

    final boolean a(int param0, int param1, byte[] param2, int param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_b;
          synchronized (var5) {
            if (param0 >= 0 &&
              param0 <= this.field_e) {
              var6 = this.a(param0, true, (byte) -22, param1, param2) ? 1 : 0;
              if (param3 != 2) {
                this.field_a = (ej) null;
              }
              if (var6 == 0) {
                var6 = this.a(param0, false, (byte) -1, param1, param2) ? 1 : 0;
              }
              stackIn_9_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_9_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5_ref;
          stackIn_14_1 = new StringBuilder().append("ua.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(String param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = param0.indexOf(param1, param2);
          var4 = var3_int;
          while (var3_int != -1) {
            var4 = var3_int;
            var3_int = param0.indexOf(param1, 1 + var4);
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ua.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    ua(int param0, ej param1, ej param2, int param3) {
        this.field_e = 65000;
        this.field_a = null;
        this.field_b = null;
        try {
          this.field_a = param2;
          this.field_e = param3;
          this.field_i = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ua.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_g = "End Tutorial";
        field_d = new pf();
        field_c = new String[]{"No garrisoning, production unified across territories.", "Garrisoning required, separate production per territory."};
    }
}
