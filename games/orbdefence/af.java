/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class af {
    private int[] field_a;

    final static void a(int param0) {
        try {
            IOException iOException = null;
            IOException var2_ref = null;
            RuntimeException runtimeException = null;
            int var1_int = 0;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            var3 = OrbDefence.field_D ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (kg.field_h == null) {
                    break L1;
                  } else {
                    kg.field_h.c(1);
                    break L1;
                  }
                }
                L2: {
                  if (wj.field_o == null) {
                    break L2;
                  } else {
                    wj.field_o.a(-31973);
                    break L2;
                  }
                }
                L3: {
                  if (vg.field_q != null) {
                    try {
                      L4: {
                        vg.field_q.a((byte) -120);
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
                  L7: {
                    if (ok.field_a != null) {
                      var1_int = 0;
                      L8: while (true) {
                        if (ok.field_a.length <= var1_int) {
                          break L7;
                        } else {
                          if (var3 != 0) {
                            break L6;
                          } else {
                            L9: {
                              if (ok.field_a[var1_int] != null) {
                                try {
                                  L10: {
                                    ok.field_a[var1_int].a((byte) 63);
                                    break L10;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L11: {
                                    var2_ref = (IOException) (Object) decompiledCaughtException;
                                    break L11;
                                  }
                                }
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var1_int++;
                            if (var3 == 0) {
                              continue L8;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                  var1_int = 91 % ((param0 - -74) / 37);
                  break L6;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              throw dd.a((Throwable) ((Object) runtimeException), "af.C(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    af(int[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int > (param0.length >> 938764929) + param0.length) {
                    break L3;
                  } else {
                    var2_int = var2_int << 1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_a = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int + var2_int <= var3) {
                      break L6;
                    } else {
                      this.field_a[var3] = -1;
                      var3++;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var3 = 0;
                  break L5;
                }
                L7: while (true) {
                  if (param0.length <= var3) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = var2_int - 1 & param0[var3];
                      L8: while (true) {
                        L9: {
                          if ((this.field_a[var4 + var4 + 1] ^ -1) == 0) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[1 + (var4 + var4)] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = -1 + var2_int & var4 - -1;
                            if (var5 != 0) {
                              break L9;
                            } else {
                              continue L8;
                            }
                          }
                        }
                        continue L7;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("af.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static hj a(int param0, byte param1, int param2) {
        hj var3 = null;
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        var6 = new hj(param0, param0);
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var3.field_v.length) {
            if (param1 <= -21) {
              return var3;
            } else {
              return (hj) null;
            }
          } else {
            var6.field_v[var4] = param2;
            var4++;
            if (var5 == 0) {
              continue L0;
            } else {
              return var3;
            }
          }
        }
    }

    final static boolean a(mg param0, boolean param1) {
        int discarded$2 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var4 = (CharSequence) null;
                discarded$2 = af.a(true, (CharSequence) null, 82, -108);
                break L1;
              }
            }
            L2: {
              var2_int = param0.b((byte) 90);
              if (-2 != (var2_int ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackOut_5_0 = var3;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("af.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final static int a(boolean param0, CharSequence param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_8_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 76 % ((param2 - -75) / 35);
                  var5 = 0;
                  var6 = 0;
                  var7 = 0;
                  var8 = param1.length();
                  var9 = 0;
                  L2: while (true) {
                    L3: {
                      if (var8 <= var9) {
                        stackOut_38_0 = var6;
                        stackIn_39_0 = stackOut_38_0;
                        break L3;
                      } else {
                        var10 = param1.charAt(var9);
                        stackOut_7_0 = var9;
                        stackIn_39_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var12 != 0) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_8_0 == 0) {
                                L6: {
                                  if (var10 != 45) {
                                    break L6;
                                  } else {
                                    var5 = 1;
                                    if (var12 == 0) {
                                      break L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                if (var10 != 43) {
                                  break L5;
                                } else {
                                  if (param0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              L8: {
                                if (48 > var10) {
                                  break L8;
                                } else {
                                  if (var10 > 57) {
                                    break L8;
                                  } else {
                                    var10 -= 48;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var10 < 65) {
                                  break L9;
                                } else {
                                  if (90 >= var10) {
                                    var10 -= 55;
                                    break L7;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (97 > var10) {
                                  break L10;
                                } else {
                                  if (var10 > 122) {
                                    break L10;
                                  } else {
                                    var10 -= 87;
                                    if (var12 == 0) {
                                      break L7;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              throw new NumberFormatException();
                            }
                            if (param3 <= var10) {
                              throw new NumberFormatException();
                            } else {
                              L11: {
                                if (var5 != 0) {
                                  var10 = -var10;
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              var11 = var7 * param3 - -var10;
                              if (var7 == var11 / param3) {
                                var6 = 1;
                                var7 = var11;
                                break L4;
                              } else {
                                throw new NumberFormatException();
                              }
                            }
                          }
                          var9++;
                          continue L2;
                        }
                      }
                    }
                    if (stackIn_39_0 == 0) {
                      throw new NumberFormatException();
                    } else {
                      stackOut_42_0 = var7;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
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
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("af.D(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L12;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L12;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_43_0;
    }

    final int a(int param0, int param1) {
        hj discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        if (param1 < -56) {
          var3 = (this.field_a.length >> -577030175) + -1;
          var4 = var3 & param0;
          L0: while (true) {
            var5 = this.field_a[var4 + var4 + 1];
            if (0 == (var5 ^ -1)) {
              return -1;
            } else {
              if (this.field_a[var4 - -var4] == param0) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L0;
              }
            }
          }
        } else {
          discarded$5 = af.a(63, (byte) -86, 25);
          var3 = (this.field_a.length >> -577030175) + -1;
          var4 = var3 & param0;
          L1: while (true) {
            var5 = this.field_a[var4 + var4 + 1];
            if (0 == (var5 ^ -1)) {
              return -1;
            } else {
              if (this.field_a[var4 - -var4] == param0) {
                return var5;
              } else {
                var4 = 1 + var4 & var3;
                continue L1;
              }
            }
          }
        }
    }

    static {
    }
}
