/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fc {
    static w field_f;
    static int[] field_d;
    static w field_c;
    static int[] field_b;
    static long field_h;
    static int field_a;
    static String field_g;
    static int field_e;

    final static void a(int param0, byte param1, boolean param2, int param3) {
        fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, w.field_kb);
        param0 += 26;
        fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, se.field_S);
        ph.field_yb[0].c(122 + param3, param0);
        param0 += 16;
        fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 - -4, se.field_S);
        ph.field_yb[1].c(param3 + 122, param0);
        param0 += 23;
        if (param1 != 5) {
            String var5 = (String) null;
            fc.a((byte) 7, (String) null);
        }
        fl.a(12 + param0, 256, 16777215, vk.field_b[2], 4 + param3, se.field_S);
        ph.field_yb[3].c(122 + param3, param0);
        param0 += 16;
        fl.a(param0 - -12, 256, 16777215, vk.field_b[3], 4 + param3, se.field_S);
        ph.field_yb[2].c(param3 + 100, param0);
        ed.a(16777215, 119 + param3, "/", 12 + param0, (byte) 75, se.field_S);
        ph.field_yb[4].c(122 + param3, param0);
        param0 += 23;
        fl.a(param0 + 12, 256, 16777215, vk.field_b[5], param3 - -4, se.field_S);
        ph.field_yb[5].c(122 + param3, param0);
        param0 += 23;
        if (!(!param2)) {
            fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
            ph.field_yb[6].c(param3 + 122, param0);
        }
    }

    final static void a(int param0, boolean param1) {
        if (ea.d((byte) 80)) {
            param1 = false;
        }
        cg.b(param1, 1);
        ub.a((byte) 54);
        if (param0 != 5) {
            field_g = (String) null;
        }
    }

    public static void a(int param0) {
        if (param0 < 26) {
            return;
        }
        field_d = null;
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
    }

    final static ck[] a(int param0, ck param1, int param2) {
        ck dupTemp$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        ck[] stackIn_3_0 = null;
        ck[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ck[] var3 = null;
        RuntimeException var3_ref = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ck var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3 = new ck[param0];
            var4 = param1.field_D;
            var5 = param1.field_K / param0;
            if (param2 == -10241) {
              var6 = param1.field_I - var5;
              var7 = 0;
              L1: while (true) {
                if (var7 >= param0) {
                  stackIn_14_0 = (ck[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  dupTemp$0 = new ck(var5, param1.field_H);
                  var3[var7] = dupTemp$0;
                  var8 = dupTemp$0;
                  var9 = var8.field_D;
                  var10 = var7 * var5 + param1.field_F;
                  var11 = param1.field_z;
                  var12 = var11 * var5 + var10;
                  var13 = 0;
                  var14 = -param1.field_H;
                  L2: while (true) {
                    if ((var14 ^ -1) <= -1) {
                      var7++;
                      continue L1;
                    } else {
                      var15 = -var5;
                      L3: while (true) {
                        if (-1 >= (var15 ^ -1)) {
                          var12 = var12 + var6;
                          var14++;
                          continue L2;
                        } else {
                          incrementValue$1 = var13;
                          var13++;
                          incrementValue$2 = var12;
                          var12++;
                          var9[incrementValue$1] = var4[incrementValue$2];
                          var15++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (ck[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("fc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    final static boolean a(byte param0, String param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!fd.field_d.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param1.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param1.startsWith("https://")) {
                        break L2;
                      } else {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    if (var3 >= param1.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      if (param0 == -19) {
                        stackIn_21_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L1;
                      } else {
                        stackIn_19_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    } else {
                      if (0 == (var2.indexOf((int) param1.charAt(var3)) ^ -1)) {
                        return false;
                      } else {
                        var3++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_23_0 = 0;
              return stackIn_23_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2_ref2);

            stackIn_26_1 = new StringBuilder().append("fc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_19_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            IOException var3_ref = null;
            int var1_int = 0;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            var4 = client.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (ta.field_k == null) {
                    break L1;
                  } else {
                    ta.field_k.d((byte) 117);
                    break L1;
                  }
                }
                L2: {
                  if (qb.field_r == null) {
                    break L2;
                  } else {
                    qb.field_r.a((byte) -98);
                    break L2;
                  }
                }
                L3: {
                  if (null != mk.field_d) {
                    try {
                      L4: {
                        mk.field_d.c((byte) 124);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        break L5;
                      }
                    }
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L6: {
                  var1_int = -32 % ((param0 - -41) / 50);
                  if (null != ig.field_cc) {
                    var2 = 0;
                    L7: while (true) {
                      if (ig.field_cc.length <= var2) {
                        break L6;
                      } else {
                        L8: {
                          if (ig.field_cc[var2] != null) {
                            try {
                              L9: {
                                ig.field_cc[var2].c((byte) 125);
                                break L9;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L10: {
                                var3_ref = (IOException) (Object) decompiledCaughtException;
                                break L10;
                              }
                            }
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var2++;
                        continue L7;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw dh.a((Throwable) ((Object) var1), "fc.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new int[8192];
        field_g = "Cancel";
        field_b = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
