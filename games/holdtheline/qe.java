/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class qe {
    static int field_a;
    static String[] field_g;
    static String field_e;
    String field_c;
    static boolean[] field_f;
    static int field_b;
    int field_d;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 != 675834672) {
          field_e = (String) null;
        }
        return new java.net.Socket(this.field_c, this.field_d);
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7, int param8) {
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = HoldTheLine.field_D;
        try {
          if (0 <= param2 &&
            li.field_d > param1) {
            if (0 > param6 &&
              0 > param0 &&
              param3 < 0) {
              return;
            }
            if (li.field_i <= param6 &&
              param0 >= li.field_i &&
              param3 >= li.field_i) {
              return;
            }
            if (param5) {
              return;
            }
            var14 = param2 - param1;
            if (param7 != param1) {
              var10 = param6 << 16;
              var9_int = param6 << 16;
              var15 = param7 - param1;
              var11 = (param0 - param6 << 16) / var15;
              var12 = (param3 - param6 << 16) / var14;
              if (var12 > var11) {
                var13 = 0;
              } else {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              }
              if (0 <= param1) {
                var16Lifetime2 = li.field_a[param1];
                while (param7 > param1) {
                  var17 = var9_int >> 16;
                  if (li.field_i > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        li.field_i > var17) {
                        ud.a(var18, var17 + var16Lifetime2, param8, (byte) -85, param4);
                      }
                    } else {
                      if (li.field_i <= var17 + var18) {
                        var18 = -1 + li.field_i - var17;
                      }
                      if (var17 >= 0) {
                        ud.a(var18, var17 + var16Lifetime2, param8, (byte) -85, param4);
                      } else {
                        ud.a(var17 + var18, var16Lifetime2, param8, (byte) -85, param4);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= li.field_d) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + tc.field_j;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              } else if (param7 >= 0) {
                param1 = -param1;
                var9_int = var9_int + param1 * var11;
                var10 = var10 + param1 * var12;
                param1 = 0;
                var16Lifetime2 = li.field_a[param1];
                while (param7 > param1) {
                  var17 = var9_int >> 16;
                  if (li.field_i > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (0 <= var17 &&
                        li.field_i > var17) {
                        ud.a(var18, var17 + var16Lifetime2, param8, (byte) -85, param4);
                      }
                    } else {
                      if (li.field_i <= var17 + var18) {
                        var18 = -1 + li.field_i - var17;
                      }
                      if (var17 >= 0) {
                        ud.a(var18, var17 + var16Lifetime2, param8, (byte) -85, param4);
                      } else {
                        ud.a(var17 + var18, var16Lifetime2, param8, (byte) -85, param4);
                      }
                    }
                  }
                  param1++;
                  if (param1 >= li.field_d) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + tc.field_j;
                  var10 = var10 + var12;
                  var9_int = var9_int + var11;
                }
              } else {
                param1 = -param1 + param7;
                var9_int = var9_int + var11 * param1;
                var10 = var10 + param1 * var12;
                param1 = param7;
              }
              var16Lifetime3 = param2 - param7;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param3 << 16;
                if (var13 != 0) {
                  var10 = param0 << 16;
                } else {
                  var9_int = param0 << 16;
                }
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
              }
            } else {
              if (param1 == param2) {
                var9_int = param6 << 16;
                var10 = param0 << 16;
                var12 = 0;
                var11 = 0;
              } else {
                var15 = -param7 + param2;
                if (param6 < param0) {
                  var12 = (param3 - param0 << 16) / var15;
                  var9_int = param6 << 16;
                  var11 = (param3 - param6 << 16) / var14;
                  var10 = param0 << 16;
                } else {
                  var11 = (param3 - param0 << 16) / var15;
                  var10 = param6 << 16;
                  var9_int = param0 << 16;
                  var12 = (param3 - param6 << 16) / var14;
                }
              }
              var13 = 0;
              if (param1 < 0) {
                param1 = Math.min(-param1, -param1 + param7);
                var10 = var10 + param1 * var12;
                var9_int = var9_int + param1 * var11;
                param1 = 0;
              }
            }
            if (param1 < 0) {
              param1 = -param1;
              var10 = var10 + var12 * param1;
              var9_int = var9_int + param1 * var11;
              param1 = 0;
            }
            var15Lifetime1 = li.field_a[param1];
            while (param2 > param1) {
              var16Lifetime1 = var9_int >> 16;
              if (li.field_i > var16Lifetime1) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (var17Lifetime1 != 0) {
                  if (li.field_i <= var17Lifetime1 + var16Lifetime1) {
                    var17Lifetime1 = -1 + (-var16Lifetime1 + li.field_i);
                  }
                  if (var16Lifetime1 < 0) {
                    ud.a(var17Lifetime1 + var16Lifetime1, var15Lifetime1, param8, (byte) -85, param4);
                  } else {
                    ud.a(var17Lifetime1, var15Lifetime1 + var16Lifetime1, param8, (byte) -85, param4);
                  }
                } else {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < li.field_i) {
                    ud.a(var17Lifetime1, var15Lifetime1 + var16Lifetime1, param8, (byte) -85, param4);
                  }
                }
              }
              param1++;
              if (li.field_d <= param1) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + tc.field_j;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_99_0 = var9;
          stackIn_99_1 = new StringBuilder().append("qe.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = -119 % ((-76 - param0) / 34);
        field_f = null;
        field_e = null;
        field_g = null;
    }

    final static byte[] a(byte[] param0, int param1, da param2, byte param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = HoldTheLine.field_D;
        try {
          var4_int = param2.h(param1, 7);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new byte[var4_int];
          }
          if (param3 < 96) {
            qe.a((byte) -29);
          }
          var5 = param2.h(3, 7);
          var6 = (byte)param2.h(8, 7);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (byte)(var6 + param2.h(var5, 7));
            }
          }
          stackIn_18_0 = (byte[]) (param0);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("qe.F(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(long param0, byte param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param1 != 45) {
          field_e = (String) null;
        }
        if (param0 % 10L == 0L) {
          uj.a(-1L + param0, -79);
          uj.a(1L, -62);
        } else {
          uj.a(param0, param1 ^ -110);
        }
    }

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          var4_int = -1;
          for (var5 = param0; var5 < param1; var5++) {
            var4_int = var4_int >>> 8 ^ mc.field_d[255 & (var4_int ^ param3[var5])];
          }
          if (param2 != 0) {
            field_f = (boolean[]) null;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("qe.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        field_e = "(Player 2)";
        field_b = 100;
    }
}
