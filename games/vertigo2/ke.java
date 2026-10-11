/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ke {
    static String field_g;
    private int[] field_h;
    static String field_d;
    static String field_c;
    static r field_b;
    private byte[] field_f;
    static String field_i;
    static int[] field_e;
    private int[] field_a;

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 25330) {
            stackIn_3_0 = 86;
            return stackIn_3_0;
          }
          if (param2 == 0) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          param2 = param2 + param4;
          var7_int = 0;
          var8 = param3;
          L2: while (true) {
            var9 = param5[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$0 = this.field_a[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param4;
              param4++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param4 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_a[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param4;
              param4++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$4 = this.field_a[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param4;
              param4++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param4 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_a[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param4;
              param4++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((8 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_a[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param4;
              param4++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 >= param2) {
                return -param3 + (1 + var8);
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$10 = this.field_a[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param4;
              param4++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$12 = this.field_a[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param4;
              param4++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param4 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 1)) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_a[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param4;
              param4++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 <= param4) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = -param3 + (1 + var8);
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("ke.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          var7_int = 0;
          if (param1 > -3) {
            var16 = (byte[]) null;
            this.a(48, (byte[]) null, -36, 30, 56, (byte[]) null);
          }
          param4 = param4 + param0;
          var8 = param3 << 3;
          while (true) {
            if (param4 <= param0) {
              stackIn_21_0 = -param3 + (var8 + 7 >> 3);
              return stackIn_21_0;
            }
            var9 = param5[param0] & 255;
            var10 = this.field_h[var9];
            var11 = this.field_f[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = 7 & var8;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (-1 + (var11 + var13) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = om.a(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param2[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param2[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param2[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param2[var12] = (byte)(var10 >>> var13);
                  if (var14 > var12) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param2[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param0++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("ke.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_g = null;
        field_d = null;
        if (param0 != -125) {
          return;
        }
        field_i = null;
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        String var4;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= -113) {
          var4 = (String) null;
          ke.a((Throwable) null, (String) null, -71);
        }
        {
          if ((param0 <= 0 ||
            param0 >= 128) &&
            (param0 < 160 ||
            255 < param0)) {
            if (param0 == 8364) {
              var2 = -128;
            } else if (8218 == param0) {
              var2 = -126;
            } else if (param0 == 402) {
              var2 = -125;
            } else if (param0 == 8222) {
              var2 = -124;
            } else if (param0 == 8230) {
              var2 = -123;
            } else if (param0 == 8224) {
              var2 = -122;
            } else if (8225 == param0) {
              var2 = -121;
            } else if (param0 == 710) {
              var2 = -120;
            } else if (param0 == 8240) {
              var2 = -119;
            } else if (param0 == 352) {
              var2 = -118;
            } else if (param0 == 8249) {
              var2 = -117;
            } else if (338 == param0) {
              var2 = -116;
            } else if (381 == param0) {
              var2 = -114;
            } else if (8216 == param0) {
              var2 = -111;
            } else if (param0 == 8217) {
              var2 = -110;
            } else if (param0 == 8220) {
              var2 = -109;
            } else if (param0 == 8221) {
              var2 = -108;
            } else if (param0 == 8226) {
              var2 = -107;
            } else if (param0 == 8211) {
              var2 = -106;
            } else if (8212 == param0) {
              var2 = -105;
            } else if (param0 == 732) {
              var2 = -104;
            } else if (param0 == 8482) {
              var2 = -103;
            } else if (param0 == 353) {
              var2 = -102;
            } else if (param0 == 8250) {
              var2 = -101;
            } else if (param0 == 339) {
              var2 = -100;
            } else if (param0 == 382) {
              var2 = -98;
            } else if (param0 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param0;
          }
        }
        return (byte) var2;
    }

    ke(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_h = new int[var2_int];
          this.field_f = param0;
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_a = new int[8];
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_h[var5] = var8;
              if ((var8 & var7) == 0) {
                for (var10 = var6 - 1; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (var11 == var8) {
                    var12 = 1 << 32 - var10;
                    if ((var11 & var12) == 0) {
                      var3[var10] = om.a(var11, var12);
                      continue;
                    }
                    var3[var10] = var3[var10 - 1];
                  }
                  break;
                }
                var9 = var8 | var7;
              } else {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var17[var10Lifetime1] == ~var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 != (var12Lifetime1 & var8)) {
                  if (this.field_a[var10Lifetime2] == 0) {
                    this.field_a[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_a[var10Lifetime2];
                } else {
                  var10Lifetime2++;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (this.field_a.length <= var10Lifetime2) {
                  var13 = new int[this.field_a.length * 2];
                  for (var14 = 0; this.field_a.length > var14; var14++) {
                    var13[var14] = this.field_a[var14];
                  }
                  this.field_a = var13;
                }
              }
              if (var4 <= var10Lifetime2) {
                var4 = var10Lifetime2 + 1;
              }
              this.field_a[var10Lifetime2] = ~var5;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("ke.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
          jj stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          wk var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Vertigo2.field_L ? 1 : 0;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = gb.a(param0, false);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            ir.a(-8957, var3);
            var7 = mr.a(":", (byte) -48, "%3a", var3);
            var8 = mr.a("@", (byte) -48, "%40", var7);
            if (param2 != 0) {
              return;
            }
            var9 = mr.a("&", (byte) -48, "%26", var8);
            var10 = mr.a("#", (byte) -48, "%23", var9);
            if (null == nh.field_h) {
              return;
            }
            stackIn_14_0 = mr.field_b;
            stackIn_14_1 = param2 + 111;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = nh.field_h.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(oq.field_I).append("&u=");
            if (c.field_f != null) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = c.field_f;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + f.field_F;
            }
            var4 = ((jj) (Object) stackIn_14_0).a(stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(jj.field_m).append("&v2=").append(jj.field_d).append("&e=").append(var10).toString()));
            while (var4.field_b == 0) {
              um.a(true, 1L);
            }
            if (var4.field_b == 1) {
              var5 = (DataInputStream) (var4.field_d);
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

    static {
        field_c = "Current Medal";
        field_d = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_g = "To play a multiplayer game, please log in or create a free account.";
    }
}
