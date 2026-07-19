/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    private int[][] field_b;
    static String field_c;
    static String field_g;
    private int field_a;
    static String field_f;
    static String field_d;
    private int field_e;

    final int a(boolean param0, int param1) {
        if (!(this.field_b == null)) {
            param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_a);
        }
        if (!param0) {
            return 51;
        }
        return param1;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, long param5, int param6, String param7, int param8, int param9, boolean param10, int param11, int param12, vh param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                L1: {
                  nk.field_N = new mg(param8);
                  n.field_b = new mg(param9);
                  bl.field_a = param0;
                  df.field_a = param2;
                  bl.field_d = param5;
                  sb.field_e = param13;
                  if (!param3) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  cb.field_g = stackIn_3_0 != 0;
                  vk.field_l = param1;
                  vl.field_d = param11;
                  vk.field_G = param4;
                  if (param12 == 64) {
                    break L2;
                  } else {
                    field_d = (String) null;
                    break L2;
                  }
                }
                L3: {
                  pf.field_g = param10;
                  tj.field_J = param6;
                  aa.field_nb = param7;
                  if (null != sb.field_e.field_c) {
                    try {
                      L4: {
                        ub.field_t = new si(sb.field_e.field_c, 64, 0);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) (var15_ref);
                stackOut_11_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param7 == null) {
                  stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L5;
                }
              }
              L6: {
                stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param13 == null) {
                  stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 43) {
            vh var2 = (vh) null;
            i.a(-34, -29, -66, true, -96, -49L, 126, (String) null, -127, 99, false, 19, 4, (vh) null);
        }
        field_d = null;
        field_c = null;
        field_g = null;
    }

    final byte[] a(byte param0, byte[] param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == 47) {
                break L1;
              } else {
                discarded$1 = this.a((byte) 13, -83);
                break L1;
              }
            }
            L2: {
              if (null == this.field_b) {
                break L2;
              } else {
                var3_int = (int)((long)param1.length * (long)this.field_e / (long)this.field_a) - -14;
                var16 = new int[var3_int];
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (param1.length <= var7) {
                    param1 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L4: while (true) {
                      if (var12 >= var3_int) {
                        break L2;
                      } else {
                        L5: {
                          var8 = 32768 + var16[var12] >> 979700976;
                          if ((var8 ^ -1) > 127) {
                            param1[var12] = (byte)-128;
                            break L5;
                          } else {
                            if ((var8 ^ -1) < -128) {
                              param1[var12] = (byte)127;
                              break L5;
                            } else {
                              param1[var12] = (byte)var8;
                              break L5;
                            }
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var18 = this.field_b[var6];
                    var10 = 0;
                    L6: while (true) {
                      if (-15 >= (var10 ^ -1)) {
                        var6 = var6 + this.field_e;
                        var10 = var6 / this.field_a;
                        var5 = var5 + var10;
                        var6 = var6 - var10 * this.field_a;
                        var7++;
                        continue L3;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
            stackOut_18_0 = (byte[]) (param1);
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("i.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        return stackIn_19_0;
    }

    i(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = se.a(param1, param0, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_e = param1;
          this.field_b = new int[param0][14];
          this.field_a = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = this.field_b[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(var6 - 7.0 + 1.0);
                if ((var8 ^ -1) <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = (-var6 + (double)var8) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + 0.46 * Math.cos(((double)var8 - var6) * 0.2243994752564138));
                  var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final int a(byte param0, int param1) {
        if (!(this.field_b == null)) {
            param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_a) + 6;
        }
        if (param0 != 127) {
            i.a((byte) -110);
        }
        return param1;
    }

    static {
        field_c = "Press SPACE or <%0> to attack.";
        field_f = "Invalid password.";
        field_g = "to over <%0> great games";
        field_d = "Free game completed";
    }
}
