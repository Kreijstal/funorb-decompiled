/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pd {
    static ea field_a;
    private java.util.zip.Inflater field_c;
    static MinerDisturbance field_b;

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        if (mn.field_x >= 0) {
          L0: {
            var3 = param1 - 135;
            var4 = 205;
            var5 = 256;
            if (75 <= mn.field_x) {
              break L0;
            } else {
              var5 = (mn.field_x << 8) / 75;
              break L0;
            }
          }
          L1: {
            if (mn.field_x > 200) {
              var5 = (-mn.field_x + 250 << 8) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            vb.a(nn.field_c, 127);
            dj.a();
            eh.d();
            oj.o(-1236579128);
            if (var5 < 256) {
              eh.b(0, 0, eh.field_g, eh.field_c, 0, 256 + -var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            tk.b(true);
            if (mn.field_x >= 150) {
              bl.field_x.f(15 + var3, 10 + var4, var5);
              break L3;
            } else {
              nn.field_c.d(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = mn.field_x + -125;
            if (var6 <= 0) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 >= 20) {
                  if (var6 < 30) {
                    lc.field_u.g(var3, var4, 256);
                    break L4;
                  } else {
                    var7 = (50 - var6) * 256 / 20;
                    lc.field_u.g(var3, var4, var7);
                    break L4;
                  }
                } else {
                  var7 = 256 * var6 / 20;
                  lc.field_u.g(var3, var4, var7);
                  break L4;
                }
              }
            }
          }
          L5: {
            if (param0 == 10853) {
              break L5;
            } else {
              pd.a(89, 110, 71, 81, 114, -10, -60, 118, 22, (byte) -120, -27, 90, 69, -93, 21, -7);
              break L5;
            }
          }
          L6: {
            var6 = -140 + mn.field_x;
            if (var6 > 0) {
              L7: {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  break L7;
                } else {
                  break L7;
                }
              }
              eg.field_b.f(var3 - -15, var4 - -10, var7 * var5 >> 8);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(sb param0, boolean param1, byte[] param2) {
        try {
            Exception exception = null;
            RuntimeException runtimeException = null;
            Object var5 = null;
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
                  if (param0.field_u[param0.field_o] != 31) {
                    break L1;
                  } else {
                    if (param0.field_u[1 + param0.field_o] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (null != ((pd) this).field_c) {
                          break L2;
                        } else {
                          ((pd) this).field_c = new java.util.zip.Inflater(true);
                          break L2;
                        }
                      }
                      try {
                        L3: {
                          ((pd) this).field_c.setInput(param0.field_u, param0.field_o + 10, param0.field_u.length + (-18 + -param0.field_o));
                          int discarded$4 = ((pd) this).field_c.inflate(param2);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        ((pd) this).field_c.reset();
                        throw new RuntimeException("");
                      }
                      L4: {
                        if (param1) {
                          break L4;
                        } else {
                          var5 = null;
                          boolean discarded$5 = pd.a((CharSequence) null, -19, false, (byte) -63);
                          break L4;
                        }
                      }
                      ((pd) this).field_c.reset();
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
                stackOut_13_1 = new StringBuilder().append("pd.F(");
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param0 == null) {
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
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(param1).append(44);
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
              throw lj.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, byte param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_37_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (2 > param1) {
                break L1;
              } else {
                if (param1 > 36) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param3 >= 48) {
                      break L2;
                    } else {
                      var12 = null;
                      boolean discarded$1 = pd.a((CharSequence) null, -116, true, (byte) 7);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackOut_41_0 = var5;
                      stackIn_42_0 = stackOut_41_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param0.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L4;
                            } else {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                L6: {
                                  if (param2) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8++;
                                continue L3;
                              }
                            }
                          }
                        }
                        L7: {
                          L8: {
                            if (var9 < 48) {
                              break L8;
                            } else {
                              if (var9 > 57) {
                                break L8;
                              } else {
                                var9 -= 48;
                                break L7;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 65) {
                              break L9;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (97 > var9) {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L7;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param1 <= var9) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          return stackIn_33_0 != 0;
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var6 * param1 - -var9;
                          if (var6 == var10 / param1) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            stackOut_37_0 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            return stackIn_38_0 != 0;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("pd.B(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_42_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, byte param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = MinerDisturbance.field_ab;
          if (param8 >= param13) {
            if (param8 >= param1) {
              if (param13 >= param1) {
                of.a(param5, -5190, param0, param6, param7, param3, param1, param8, param13, param11, param10, eh.field_f, param4, param12, param14, param15, param2);
                break L0;
              } else {
                of.a(param5, -5190, param14, param12, param7, param3, param13, param8, param1, param11, param2, eh.field_f, param15, param6, param0, param4, param10);
                break L0;
              }
            } else {
              of.a(param14, -5190, param5, param7, param12, param4, param13, param1, param8, param10, param2, eh.field_f, param15, param6, param0, param3, param11);
              break L0;
            }
          } else {
            if (param1 <= param13) {
              if (param1 <= param8) {
                of.a(param0, param9 + -5130, param5, param7, param6, param15, param1, param13, param8, param2, param10, eh.field_f, param4, param12, param14, param3, param11);
                break L0;
              } else {
                of.a(param0, param9 + -5130, param14, param12, param6, param15, param8, param13, param1, param2, param11, eh.field_f, param3, param7, param5, param4, param10);
                break L0;
              }
            } else {
              of.a(param14, param9 ^ 5246, param0, param6, param12, param4, param8, param1, param13, param10, param11, eh.field_f, param3, param7, param5, param15, param2);
              break L0;
            }
          }
        }
        L1: {
          if (param9 == -60) {
            break L1;
          } else {
            pd.a(-121, 90, -65, -124, -127, -119, 17, 110, 25, (byte) 107, -103, 4, 28, 90, 43, -66);
            break L1;
          }
        }
    }

    private pd(int param0, int param1, int param2) {
    }

    public pd() {
        this(-1, 1000000, 1000000);
    }

    final static int a(CharSequence param0, boolean param1, boolean param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (36 < param3) {
                  break L1;
                } else {
                  L2: {
                    var4_int = 0;
                    if (param2) {
                      break L2;
                    } else {
                      field_a = null;
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param0.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var7 <= var8) {
                      if (var5 != 0) {
                        stackOut_41_0 = var6;
                        stackIn_42_0 = stackOut_41_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param0.charAt(var8);
                          if (var8 == 0) {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                L6: {
                                  if (param1) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8++;
                                continue L3;
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L7: {
                          L8: {
                            if (var9 < 48) {
                              break L8;
                            } else {
                              if (57 >= var9) {
                                var9 -= 48;
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 65) {
                              break L9;
                            } else {
                              if (var9 > 90) {
                                break L9;
                              } else {
                                var9 -= 55;
                                break L7;
                              }
                            }
                          }
                          L10: {
                            if (var9 < 97) {
                              break L10;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L7;
                              } else {
                                break L10;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param3 > var9) {
                          L11: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var10 = var6 * param3 - -var9;
                          if (var6 != var10 / param3) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("pd.D(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L12;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L12;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_42_0;
    }

    static {
    }
}
