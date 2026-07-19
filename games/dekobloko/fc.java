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
        boolean discarded$1 = false;
        String var5 = null;
        fl.a(param0 - -20, 256, 16777215, ug.field_n, param3 - -4, w.field_kb);
        param0 += 26;
        fl.a(12 + param0, 256, 16777215, vk.field_b[0], 4 + param3, se.field_S);
        ph.field_yb[0].c(122 + param3, param0);
        param0 += 16;
        fl.a(12 + param0, param1 ^ 261, 16777215, vk.field_b[1], param3 - -4, se.field_S);
        ph.field_yb[1].c(param3 + 122, param0);
        param0 += 23;
        if (param1 != 5) {
          L0: {
            var5 = (String) null;
            discarded$1 = fc.a((byte) 7, (String) null);
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
            if (param2) {
              fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
              ph.field_yb[6].c(param3 + 122, param0);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
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
            if (param2) {
              fl.a(12 + param0, 256, 16777215, vk.field_b[6], 4 + param3, se.field_S);
              ph.field_yb[6].c(param3 + 122, param0);
              break L1;
            } else {
              break L1;
            }
          }
          return;
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
            return;
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
        ck dupTemp$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var3 = null;
        ck[] var3_array = null;
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
        ck[] stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        ck[] stackIn_8_0 = null;
        int stackIn_11_0 = 0;
        ck[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        ck[] stackOut_19_0 = null;
        ck[] stackOut_7_0 = null;
        int stackOut_10_0 = 0;
        ck[] stackOut_2_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var16 = client.field_A ? 1 : 0;
        try {
          L0: {
            var3_array = new ck[param0];
            var4 = param1.field_D;
            var5 = param1.field_K / param0;
            if (param2 == -10241) {
              var6 = param1.field_I - var5;
              var7 = 0;
              L1: while (true) {
                stackOut_5_0 = var7;
                stackIn_6_0 = stackOut_5_0;
                L2: while (true) {
                  L3: {
                    if (stackIn_6_0 >= param0) {
                      stackOut_19_0 = (ck[]) (var3_array);
                      stackIn_20_0 = stackOut_19_0;
                      break L3;
                    } else {
                      stackOut_7_0 = (ck[]) (var3_array);
                      stackIn_20_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var16 != 0) {
                        break L3;
                      } else {
                        dupTemp$3 = new ck(var5, param1.field_H);
                        stackIn_8_0[var7] = dupTemp$3;
                        var8 = dupTemp$3;
                        var9 = var8.field_D;
                        var10 = var7 * var5 + param1.field_F;
                        var11 = param1.field_z;
                        var12 = var11 * var5 + var10;
                        var13 = 0;
                        var14 = -param1.field_H;
                        L4: while (true) {
                          L5: {
                            if ((var14 ^ -1) <= -1) {
                              break L5;
                            } else {
                              stackOut_10_0 = -var5;
                              stackIn_6_0 = stackOut_10_0;
                              stackIn_11_0 = stackOut_10_0;
                              if (var16 != 0) {
                                continue L2;
                              } else {
                                var15 = stackIn_11_0;
                                L6: while (true) {
                                  L7: {
                                    L8: {
                                      if (-1 >= (var15 ^ -1)) {
                                        break L8;
                                      } else {
                                        incrementValue$4 = var13;
                                        var13++;
                                        incrementValue$5 = var12;
                                        var12++;
                                        var9[incrementValue$4] = var4[incrementValue$5];
                                        var15++;
                                        if (var16 != 0) {
                                          break L7;
                                        } else {
                                          if (var16 == 0) {
                                            continue L6;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                    var12 = var12 + var6;
                                    var14++;
                                    break L7;
                                  }
                                  if (var16 == 0) {
                                    continue L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          var7++;
                          continue L1;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (ck[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var3);
            stackOut_21_1 = new StringBuilder().append("fc.B(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_20_0;
        }
    }

    final static boolean a(byte param0, String param1) {
        Process discarded$11 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (!fd.field_d.startsWith("win")) {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
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
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var3 >= param1.length()) {
                          break L5;
                        } else {
                          var6 = var2.indexOf((int) param1.charAt(var3)) ^ -1;
                          var5 = 0;
                          if (var4 != 0) {
                            if (var5 == var6) {
                              break L4;
                            } else {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              decompiledRegionSelector0 = 2;
                              break L1;
                            }
                          } else {
                            if (var5 != var6) {
                              var3++;
                              if (var4 == 0) {
                                continue L3;
                              } else {
                                break L5;
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      discarded$11 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                      if (param0 == -19) {
                        break L4;
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        decompiledRegionSelector0 = 3;
                        break L1;
                      }
                    }
                    stackOut_21_0 = 1;
                    stackIn_22_0 = stackOut_21_0;
                    decompiledRegionSelector0 = 4;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              return stackIn_24_0 != 0;
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
                  if (decompiledRegionSelector0 == 3) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 4;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L6: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var2_ref2);
            stackOut_25_1 = new StringBuilder().append("fc.F(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_16_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return stackIn_20_0 != 0;
              } else {
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        try {
            IOException iOException = null;
            IOException var3_ref = null;
            int var1_int = 0;
            RuntimeException var1 = null;
            int var2 = 0;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
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
                var1_int = -32 % ((param0 - -41) / 50);
                if (null != ig.field_cc) {
                  var2 = 0;
                  L6: while (true) {
                    if (ig.field_cc.length <= var2) {
                      break L0;
                    } else {
                      if (var4 == 0) {
                        L7: {
                          if (ig.field_cc[var2] != null) {
                            try {
                              L8: {
                                ig.field_cc[var2].c((byte) 125);
                                break L8;
                              }
                            } catch (java.io.IOException decompiledCaughtParameter1) {
                              decompiledCaughtException = decompiledCaughtParameter1;
                              L9: {
                                var3_ref = (IOException) (Object) decompiledCaughtException;
                                break L9;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2++;
                        continue L6;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
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
