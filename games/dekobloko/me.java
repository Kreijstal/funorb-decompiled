/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class me extends be {
    int[] field_F;
    static long field_E;
    static String field_C;
    static String field_B;
    static pi field_J;
    private String[] field_H;
    private int[][] field_D;
    static String field_G;
    private int[] field_A;
    static int field_y;
    static jk field_z;
    static int[] field_I;

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.d((byte) -88);
              if (var3_int != 0) {
                this.a(var3_int, param0 ^ 2598, param1);
                continue L1;
              } else {
                L2: {
                  if (param0 == 80) {
                    break L2;
                  } else {
                    var5 = null;
                    ((me) this).a((byte) 71, (wl) null);
                    break L2;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("me.F(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final String f(byte param0) {
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (param0 > -57) {
            Object var5 = null;
            ((me) this).a((byte) 104, (wl) null);
        }
        if (null == ((me) this).field_H) {
            return "";
        }
        StringBuilder discarded$0 = var6.append(((me) this).field_H[0]);
        for (var3 = 1; ((me) this).field_H.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var6.append(((me) this).field_H[var3]);
        }
        return var2.toString();
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = client.field_A ? 1 : 0;
        if (param0 != 19423) {
            me.c(-120);
        }
        if (!(((me) this).field_F == null)) {
            for (var2 = 0; var2 < ((me) this).field_F.length; var2++) {
                ((me) this).field_F[var2] = de.b(((me) this).field_F[var2], 32768);
            }
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_G = null;
        field_B = null;
        field_C = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            field_y = 75;
        }
    }

    private final void a(int param0, int param1, wl param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 == 2678) {
              L1: {
                if (param0 == 1) {
                  ((me) this).field_H = ji.a('<', (byte) 66, param2.c((byte) -38));
                  break L1;
                } else {
                  if (param0 == 2) {
                    var4_int = param2.d((byte) -86);
                    ((me) this).field_F = new int[var4_int];
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var4_int) {
                        break L1;
                      } else {
                        ((me) this).field_F[var5] = param2.e(3);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param0 == 3) {
                      var4_int = param2.d((byte) -89);
                      ((me) this).field_D = new int[var4_int][];
                      ((me) this).field_A = new int[var4_int];
                      var5 = 0;
                      L3: while (true) {
                        if (var4_int <= var5) {
                          break L1;
                        } else {
                          L4: {
                            var6 = param2.e(3);
                            var7 = je.a(-121, var6);
                            if (var7 == null) {
                              break L4;
                            } else {
                              ((me) this).field_A[var5] = var6;
                              ((me) this).field_D[var5] = new int[var7.field_f];
                              var8 = 0;
                              L5: while (true) {
                                if (var8 >= var7.field_f) {
                                  break L4;
                                } else {
                                  ((me) this).field_D[var5][var8] = param2.e(qm.b(param1, 2677));
                                  var8++;
                                  continue L5;
                                }
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (param0 != 4) {
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("me.A(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            int var4 = 0;
            java.net.URL var5 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var5 = param1.getCodeBase();
                    var3 = gn.a(var5, -1, param1).getFile();
                    Object discarded$6 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    var4 = -128 / ((param0 - 10) / 61);
                    Object discarded$7 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    Object discarded$8 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    Object discarded$9 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    Object discarded$10 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    Object discarded$11 = nc.a("updatelinks", -14541, param1, new Object[2]);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref;
                stackOut_4_1 = new StringBuilder().append("me.C(").append(param0).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    me() {
    }

    final static ck a(ck param0, boolean param1, byte param2, boolean param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ck var11 = null;
        ck var12 = null;
        ck stackIn_60_0 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck stackOut_59_0 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            param0.b();
            var11 = new ck(36, 36);
            var12 = var11;
            var5 = 0;
            L1: while (true) {
              if (var5 >= 18) {
                var5 = 0;
                L2: while (true) {
                  if (var5 >= 17) {
                    L3: {
                      if (!param1) {
                        break L3;
                      } else {
                        var5 = 0;
                        L4: while (true) {
                          if (var5 >= 36) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                var6 = var11.field_D[1224 - -var5];
                                var7 = var11.field_D[var5];
                                var8 = (8355711 & var6 >> 1) + ((16711423 & var7) >> 1);
                                if ((var7 | var6) >= 16777216) {
                                  break L6;
                                } else {
                                  L7: {
                                    if ((var6 & 16777215) == 0) {
                                      break L7;
                                    } else {
                                      if ((16777215 & var7) != 0) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var8 = 0;
                                  break L5;
                                }
                              }
                              if (var8 != 0) {
                                break L5;
                              } else {
                                var8 = 1;
                                break L5;
                              }
                            }
                            var12.field_D[36 + var5 + 1224] = var8;
                            var5++;
                            continue L4;
                          }
                        }
                      }
                    }
                    var5 = 0;
                    L8: while (true) {
                      if (var5 >= 18) {
                        var5 = 23 % ((59 - param2) / 42);
                        stackOut_59_0 = (ck) var12;
                        stackIn_60_0 = stackOut_59_0;
                        break L0;
                      } else {
                        var6 = 0;
                        L9: while (true) {
                          if (var6 >= 36) {
                            var5++;
                            continue L8;
                          } else {
                            var7 = var12.field_D[72 * var5 - -var6];
                            var7 = var7 & 16777215;
                            var12.field_D[var6 + 72 * var5] = var7;
                            var6++;
                            continue L9;
                          }
                        }
                      }
                    }
                  } else {
                    var6 = 0;
                    L10: while (true) {
                      if (var6 >= 36) {
                        var5++;
                        continue L2;
                      } else {
                        L11: {
                          L12: {
                            var7 = var12.field_D[var6 + var5 * 72];
                            var8 = var12.field_D[var6 + (var5 * 72 + 72)];
                            var9 = ((var8 & 16711423) >> 1) + ((16711423 & var7) >> 1);
                            if ((var7 | var8) >= 16777216) {
                              break L12;
                            } else {
                              L13: {
                                if ((16777215 & var7) == 0) {
                                  break L13;
                                } else {
                                  if ((16777215 & var8) != 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              var9 = 0;
                              break L11;
                            }
                          }
                          if (var9 != 0) {
                            break L11;
                          } else {
                            var9 = 1;
                            break L11;
                          }
                        }
                        var12.field_D[36 + (var6 + 72 * var5)] = var9;
                        var6++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                var6 = 0;
                L14: while (true) {
                  if (var6 >= 18) {
                    var6 = 0;
                    L15: while (true) {
                      if (var6 >= 17) {
                        L16: {
                          if (param3) {
                            L17: {
                              var6 = var12.field_D[34 + 72 * var5];
                              var7 = var11.field_D[72 * var5];
                              var8 = ((16711422 & var6) >> 1) + ((var7 & 16711423) >> 1);
                              if (var8 != 0) {
                                break L17;
                              } else {
                                if ((var7 | var6) == 0) {
                                  break L17;
                                } else {
                                  var8 = 1;
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (var6 == 0) {
                                break L18;
                              } else {
                                if (0 == var7) {
                                  break L18;
                                } else {
                                  var8 = var8 + 16777216;
                                  break L18;
                                }
                              }
                            }
                            var12.field_D[34 + (var5 * 72 + 1)] = var8;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var5++;
                        continue L1;
                      } else {
                        L19: {
                          var7 = var12.field_D[var6 * 2 + 72 * var5];
                          var8 = var12.field_D[2 + var6 * 2 + var5 * 72];
                          var9 = ((var8 & 16711423) >> 1) + ((16711423 & var7) >> 1);
                          if (var9 != 0) {
                            break L19;
                          } else {
                            if ((var8 | var7) != 0) {
                              var9 = 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L20: {
                          if (var7 == 0) {
                            break L20;
                          } else {
                            if (var8 != 0) {
                              var9 = var9 + 16777216;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        var12.field_D[1 + var5 * 72 - -(var6 * 2)] = var9;
                        var6++;
                        continue L15;
                      }
                    }
                  } else {
                    L21: {
                      var7 = param0.field_D[var5 * 18 - -var6];
                      if (var7 == 0) {
                        break L21;
                      } else {
                        var7 = var7 + 16777216;
                        break L21;
                      }
                    }
                    var12.field_D[var5 * 72 + 2 * var6] = var7;
                    var6++;
                    continue L14;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var4;
            stackOut_61_1 = new StringBuilder().append("me.D(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L22;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L22;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_60_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Orb coins: ";
        field_G = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_C = "Members";
        field_J = new pi(0, 0, 0);
        field_y = 9;
        field_I = new int[8];
    }
}
