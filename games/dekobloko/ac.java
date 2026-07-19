/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends be {
    int[] field_C;
    String field_H;
    static String[] field_z;
    char[] field_G;
    static int field_B;
    boolean field_D;
    int[] field_E;
    static int field_A;
    char[] field_y;
    static int field_F;

    final static void f(byte param0) {
        if (param0 > -68) {
            ac.f((byte) 55);
            kk.field_n = 0;
            cg.a(true);
            return;
        }
        kk.field_n = 0;
        cg.a(true);
    }

    final static ck[] a(int param0, String param1, String param2, ji param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ck[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param3.b(-1, param1);
              var5 = param3.a(var4_int, 13030, param2);
              if (param0 == 0) {
                break L1;
              } else {
                ac.g((byte) 24);
                break L1;
              }
            }
            stackOut_2_0 = si.a(var5, var4_int, param3, (byte) -46);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ac.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(byte param0, wl param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -4) {
                break L1;
              } else {
                this.field_H = (String) null;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                var3_int = param1.d((byte) -60);
                if ((var3_int ^ -1) == -1) {
                  break L3;
                } else {
                  this.a(var3_int, param1, -127);
                  if (var4 == 0) {
                    if (var4 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("ac.F(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 != -17) {
            ac.g((byte) -64);
            field_z = null;
            return;
        }
        field_z = null;
    }

    private final void a(int param0, wl param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char stackIn_9_2 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        char[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        char stackIn_21_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        char stackOut_8_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char stackOut_7_2 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        char[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        char stackOut_20_2 = 0;
        char[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        char stackOut_19_2 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0 == 1) {
                    break L3;
                  } else {
                    L4: {
                      if (-3 != (param0 ^ -1)) {
                        break L4;
                      } else {
                        var4_int = param1.d((byte) -47);
                        this.field_G = new char[var4_int];
                        this.field_C = new int[var4_int];
                        var5 = 0;
                        L5: while (true) {
                          L6: {
                            if ((var5 ^ -1) <= (var4_int ^ -1)) {
                              break L6;
                            } else {
                              this.field_C[var5] = param1.e(3);
                              var6 = param1.g((byte) -99);
                              if (var7 != 0) {
                                break L1;
                              } else {
                                L7: {
                                  stackOut_6_0 = this.field_G;
                                  stackOut_6_1 = var5;
                                  stackIn_8_0 = stackOut_6_0;
                                  stackIn_8_1 = stackOut_6_1;
                                  stackIn_7_0 = stackOut_6_0;
                                  stackIn_7_1 = stackOut_6_1;
                                  if (0 == var6) {
                                    stackOut_8_0 = (char[]) ((Object) stackIn_8_0);
                                    stackOut_8_1 = stackIn_8_1;
                                    stackOut_8_2 = (char)0;
                                    stackIn_9_0 = stackOut_8_0;
                                    stackIn_9_1 = stackOut_8_1;
                                    stackIn_9_2 = stackOut_8_2;
                                    break L7;
                                  } else {
                                    stackOut_7_0 = (char[]) ((Object) stackIn_7_0);
                                    stackOut_7_1 = stackIn_7_1;
                                    stackOut_7_2 = jb.a((byte) var6, (byte) 78);
                                    stackIn_9_0 = stackOut_7_0;
                                    stackIn_9_1 = stackOut_7_1;
                                    stackIn_9_2 = stackOut_7_2;
                                    break L7;
                                  }
                                }
                                stackIn_9_0[stackIn_9_1] = stackIn_9_2;
                                var5++;
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: {
                      if (3 == param0) {
                        break L8;
                      } else {
                        if (-5 != (param0 ^ -1)) {
                          break L2;
                        } else {
                          this.field_D = true;
                          if (var7 == 0) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    var4_int = param1.d((byte) -37);
                    this.field_E = new int[var4_int];
                    this.field_y = new char[var4_int];
                    var5 = 0;
                    L9: while (true) {
                      L10: {
                        if (var4_int <= var5) {
                          break L10;
                        } else {
                          this.field_E[var5] = param1.e(3);
                          var6 = param1.g((byte) -107);
                          if (var7 != 0) {
                            break L1;
                          } else {
                            L11: {
                              stackOut_18_0 = this.field_y;
                              stackOut_18_1 = var5;
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_20_1 = stackOut_18_1;
                              stackIn_19_0 = stackOut_18_0;
                              stackIn_19_1 = stackOut_18_1;
                              if (-1 == (var6 ^ -1)) {
                                stackOut_20_0 = (char[]) ((Object) stackIn_20_0);
                                stackOut_20_1 = stackIn_20_1;
                                stackOut_20_2 = (char)0;
                                stackIn_21_0 = stackOut_20_0;
                                stackIn_21_1 = stackOut_20_1;
                                stackIn_21_2 = stackOut_20_2;
                                break L11;
                              } else {
                                stackOut_19_0 = (char[]) ((Object) stackIn_19_0);
                                stackOut_19_1 = stackIn_19_1;
                                stackOut_19_2 = jb.a((byte) var6, (byte) 88);
                                stackIn_21_0 = stackOut_19_0;
                                stackIn_21_1 = stackOut_19_1;
                                stackIn_21_2 = stackOut_19_2;
                                break L11;
                              }
                            }
                            stackIn_21_0[stackIn_21_1] = stackIn_21_2;
                            var5++;
                            if (var7 == 0) {
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_H = param1.c((byte) -38);
                break L2;
              }
              var4_int = 8 % ((2 - param2) / 44);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L12;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L12;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param0 == -1) {
          if (this.field_E != null) {
            var2 = 0;
            L0: while (true) {
              if (var2 >= this.field_E.length) {
                L1: {
                  if (this.field_C == null) {
                    break L1;
                  } else {
                    var2 = 0;
                    L2: while (true) {
                      if ((var2 ^ -1) <= (this.field_C.length ^ -1)) {
                        break L1;
                      } else {
                        this.field_C[var2] = de.b(this.field_C[var2], 32768);
                        var2++;
                        if (var3 == 0) {
                          if (var3 == 0) {
                            continue L2;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                this.field_E[var2] = de.b(this.field_E[var2], 32768);
                var2++;
                if (var3 == 0) {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    L3: {
                      if (this.field_C == null) {
                        break L3;
                      } else {
                        var2 = 0;
                        L4: while (true) {
                          if ((var2 ^ -1) <= (this.field_C.length ^ -1)) {
                            break L3;
                          } else {
                            this.field_C[var2] = de.b(this.field_C[var2], 32768);
                            var2++;
                            if (var3 == 0) {
                              if (var3 == 0) {
                                continue L4;
                              } else {
                                return;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            if (this.field_C != null) {
              var2 = 0;
              L5: while (true) {
                if ((var2 ^ -1) > (this.field_C.length ^ -1)) {
                  this.field_C[var2] = de.b(this.field_C[var2], 32768);
                  var2++;
                  if (var3 == 0) {
                    if (var3 == 0) {
                      continue L5;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    ac() {
        this.field_D = false;
    }

    static {
        field_z = new String[]{"Master Challenge: prove your prowess", "Unlock 4 more vibrant and varied themes", "Large bucket: grow shapes to the limit", "Use special items in multiplayer...", "...to turn things around spectacularly!", "Loads of extra Achievements", null, null};
        field_B = 480;
    }
}
