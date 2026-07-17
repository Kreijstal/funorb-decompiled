/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk {
    private java.util.zip.Inflater field_d;
    static int field_c;
    static String field_b;
    static cn field_e;
    static int field_a;

    final static wm a(int param0, Random param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var16 = null;
        int stackIn_52_0 = 0;
        wm stackIn_85_0 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        wm stackOut_84_0 = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_47_0 = 0;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            bo.field_Jb = new wm(ib.field_l);
            wl.field_e = new int[ib.field_l];
            h.field_j = 0;
            var2_int = 0;
            L1: while (true) {
              if (~var2_int <= ~ib.field_l) {
                ue.field_j = new int[ib.field_k];
                var2_int = param0;
                L2: while (true) {
                  if (ib.field_k <= var2_int) {
                    L3: while (true) {
                      if (h.field_j <= 0) {
                        L4: {
                          var2_int = uj.a(param1, param0 ^ 37, 4);
                          var3 = uj.a(param1, 37, 3);
                          if (~var3 == ~var2_int) {
                            var3 = 3;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (0 == var2_int) {
                              break L6;
                            } else {
                              if (0 != var3) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          bo.field_Jb.a(20, -111);
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (1 == var2_int) {
                              break L8;
                            } else {
                              if (1 != var3) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          bo.field_Jb.a(21, -90);
                          break L7;
                        }
                        L9: {
                          L10: {
                            if (var2_int == 2) {
                              break L10;
                            } else {
                              if (var3 == 2) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                          bo.field_Jb.a(59, -86);
                          break L9;
                        }
                        L11: {
                          L12: {
                            if (3 == var2_int) {
                              break L12;
                            } else {
                              if (var3 == 3) {
                                break L12;
                              } else {
                                break L11;
                              }
                            }
                          }
                          bo.field_Jb.a(66, -70);
                          break L11;
                        }
                        var4 = ec.h(24, 5);
                        var5 = 0;
                        L13: while (true) {
                          if (var5 >= 4) {
                            L14: while (true) {
                              var5 = 4;
                              var6 = -1;
                              var7 = 0;
                              L15: while (true) {
                                if (~var7 <= ~ib.field_l) {
                                  if (var6 != -1) {
                                    bo.field_Jb.a(var6, -88);
                                    var4 = ec.h(24, 5);
                                    continue L14;
                                  } else {
                                    stackOut_84_0 = bo.field_Jb;
                                    stackIn_85_0 = stackOut_84_0;
                                    break L0;
                                  }
                                } else {
                                  L16: {
                                    if (var7 == 20) {
                                      break L16;
                                    } else {
                                      if (var7 == 21) {
                                        break L16;
                                      } else {
                                        if (var7 == 59) {
                                          break L16;
                                        } else {
                                          if (var7 != 66) {
                                            if (8 > qc.a(var7, -127, var4)) {
                                              break L16;
                                            } else {
                                              var8 = sh.a(120, var7, var4);
                                              if (var5 >= var8) {
                                                break L16;
                                              } else {
                                                var6 = var7;
                                                var5 = var8;
                                                break L16;
                                              }
                                            }
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var7++;
                                  continue L15;
                                }
                              }
                            }
                          } else {
                            L17: {
                              if (var5 == 0) {
                                stackOut_51_0 = 0;
                                stackIn_52_0 = stackOut_51_0;
                                break L17;
                              } else {
                                if (1 != var5) {
                                  if (var5 == 2) {
                                    stackOut_50_0 = ib.field_k + -ib.field_j;
                                    stackIn_52_0 = stackOut_50_0;
                                    break L17;
                                  } else {
                                    stackOut_49_0 = -1 + ib.field_k;
                                    stackIn_52_0 = stackOut_49_0;
                                    break L17;
                                  }
                                } else {
                                  stackOut_47_0 = -1 + ib.field_j;
                                  stackIn_52_0 = stackOut_47_0;
                                  break L17;
                                }
                              }
                            }
                            var6 = stackIn_52_0;
                            var16 = ec.h(var6, param0 ^ 5);
                            var8 = 0;
                            var9 = -1;
                            var10 = 1;
                            L18: while (true) {
                              if (~ib.field_l >= ~var10) {
                                L19: {
                                  if (var9 != -1) {
                                    bo.field_Jb.a(var9, -126);
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                }
                                var5++;
                                continue L13;
                              } else {
                                L20: {
                                  if (var10 == 20) {
                                    break L20;
                                  } else {
                                    if (var10 == 21) {
                                      break L20;
                                    } else {
                                      if (var10 == 59) {
                                        break L20;
                                      } else {
                                        if (var10 != 66) {
                                          if (10 <= qc.a(var10, 122, var16)) {
                                            L21: {
                                              var11 = sh.a(param0 + 123, var10, var16);
                                              if (-1 == var9) {
                                                break L21;
                                              } else {
                                                if (var8 < var11) {
                                                  break L21;
                                                } else {
                                                  break L20;
                                                }
                                              }
                                            }
                                            var8 = var11;
                                            var9 = var10;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        } else {
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                }
                                var10++;
                                continue L18;
                              }
                            }
                          }
                        }
                      } else {
                        fo.a(-126, gd.a(param1, true));
                        continue L3;
                      }
                    }
                  } else {
                    ue.field_j[var2_int] = var2_int;
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                L22: {
                  if (var2_int == 14) {
                    break L22;
                  } else {
                    if (var2_int == 15) {
                      break L22;
                    } else {
                      if (26 == var2_int) {
                        break L22;
                      } else {
                        if (var2_int == 27) {
                          break L22;
                        } else {
                          if (var2_int == 58) {
                            break L22;
                          } else {
                            if (var2_int == 60) {
                              break L22;
                            } else {
                              if (65 == var2_int) {
                                break L22;
                              } else {
                                if (var2_int != 67) {
                                  if (var2_int == 20) {
                                    break L22;
                                  } else {
                                    if (var2_int == 21) {
                                      break L22;
                                    } else {
                                      if (var2_int == 59) {
                                        break L22;
                                      } else {
                                        if (var2_int != 66) {
                                          int fieldTemp$1 = h.field_j;
                                          h.field_j = h.field_j + 1;
                                          wl.field_e[fieldTemp$1] = var2_int;
                                          break L22;
                                        } else {
                                          break L22;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var2 = decompiledCaughtException;
            stackOut_86_0 = (RuntimeException) var2;
            stackOut_86_1 = new StringBuilder().append("uk.C(").append(param0).append(44);
            stackIn_88_0 = stackOut_86_0;
            stackIn_88_1 = stackOut_86_1;
            stackIn_87_0 = stackOut_86_0;
            stackIn_87_1 = stackOut_86_1;
            if (param1 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L23;
            } else {
              stackOut_87_0 = (RuntimeException) (Object) stackIn_87_0;
              stackOut_87_1 = (StringBuilder) (Object) stackIn_87_1;
              stackOut_87_2 = "{...}";
              stackIn_89_0 = stackOut_87_0;
              stackIn_89_1 = stackOut_87_1;
              stackIn_89_2 = stackOut_87_2;
              break L23;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + 41);
        }
        return stackIn_85_0;
    }

    public uk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              lj.a((java.awt.Component) (Object) param0, (byte) 70);
              if (param1 < -119) {
                break L1;
              } else {
                field_c = 72;
                break L1;
              }
            }
            L2: {
              im.a((java.awt.Component) (Object) param0, (byte) 94);
              if (bn.field_j == null) {
                break L2;
              } else {
                bn.field_j.a((byte) 123, (java.awt.Component) (Object) param0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("uk.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
    }

    final void a(int param0, byte[] param1, ec param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  if (-32 != param2.field_m[param2.field_o]) {
                    break L1;
                  } else {
                    if (116 != param2.field_m[1 + param2.field_o]) {
                      break L1;
                    } else {
                      L2: {
                        if (null != ((uk) this).field_d) {
                          break L2;
                        } else {
                          ((uk) this).field_d = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((uk) this).field_d.setInput(param2.field_m, 10 + param2.field_o, param2.field_m.length + -10 + (-param2.field_o + -8));
                          int discarded$2 = ((uk) this).field_d.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((uk) this).field_d.reset();
                        throw new RuntimeException("");
                      }
                      L4: {
                        if (param0 < -80) {
                          break L4;
                        } else {
                          field_e = null;
                          break L4;
                        }
                      }
                      ((uk) this).field_d.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) runtimeException;
                stackOut_13_1 = new StringBuilder().append("uk.A(").append(param0).append(44);
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L6;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L6;
                }
              }
              throw vk.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private uk(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
        field_c = 2;
    }
}
