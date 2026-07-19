/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static int[] field_c;
    private int[] field_d;
    static int field_a;

    public static void a(boolean param0) {
        if (param0) {
            field_c = (int[]) null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var3 = -1 + (this.field_d.length >> -1402369503);
        var4 = var3 & param1;
        if (param0 == 0) {
          L0: while (true) {
            var5 = this.field_d[var4 + var4 - -1];
            if ((var5 ^ -1) == 0) {
              return -1;
            } else {
              if (param1 != this.field_d[var4 - -var4]) {
                var4 = 1 + var4 & var3;
                continue L0;
              } else {
                return var5;
              }
            }
          }
        } else {
          return -32;
        }
    }

    final static void a(hf param0, byte param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 3) {
                  var2_int = 0;
                  break L2;
                } else {
                  SolKnight.field_K[var2_int] = 0;
                  var2_int++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (var2_int >= al.field_p) {
                      break L5;
                    } else {
                      stackOut_8_0 = kc.field_K[var2_int].field_i;
                      stackIn_13_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var5 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_9_0 != param0.field_i) {
                            break L6;
                          } else {
                            dupTemp$4 = kc.field_K[var2_int].a(1910696752);
                            SolKnight.field_K[dupTemp$4] = SolKnight.field_K[dupTemp$4] + 1;
                            break L6;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  dupTemp$5 = param0.a(1910696752);
                  SolKnight.field_K[dupTemp$5] = SolKnight.field_K[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L4;
                }
                var3 = stackIn_13_0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var3 >= al.field_p) {
                        break L9;
                      } else {
                        stackOut_15_0 = kc.field_K[var3].field_i;
                        stackOut_15_1 = param0.field_i;
                        stackIn_24_0 = stackOut_15_0;
                        stackIn_24_1 = stackOut_15_1;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        if (var5 != 0) {
                          break L8;
                        } else {
                          L10: {
                            L11: {
                              if (stackIn_16_0 == stackIn_16_1) {
                                var4 = kc.field_K[var3].a(1910696752);
                                if (i.field_K >= SolKnight.field_K[var4]) {
                                  break L11;
                                } else {
                                  SolKnight.field_K[var4] = SolKnight.field_K[var4] - 1;
                                  if (var5 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            kc.field_K[incrementValue$6] = kc.field_K[var3];
                            break L10;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_23_0 = -52;
                    stackOut_23_1 = (param1 - -2) / 59;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L8;
                  }
                  var4 = stackIn_24_0 / stackIn_24_1;
                  al.field_p = var2_int;
                  fieldTemp$7 = al.field_p;
                  al.field_p = al.field_p + 1;
                  kc.field_K[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("qg.A(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
    }

    qg(int[] param0) {
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
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param0.length >> -996309951) + param0.length < var2_int) {
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
                this.field_d = new int[var2_int + var2_int];
                break L2;
              }
              var3 = 0;
              L4: while (true) {
                L5: {
                  L6: {
                    if (var2_int + var2_int <= var3) {
                      break L6;
                    } else {
                      this.field_d[var3] = -1;
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
                  if (var3 >= param0.length) {
                    break L0;
                  } else {
                    if (var5 == 0) {
                      var4 = param0[var3] & var2_int + -1;
                      L8: while (true) {
                        L9: {
                          if (-1 == this.field_d[var4 + var4 + 1]) {
                            this.field_d[var4 + var4] = param0[var3];
                            this.field_d[1 + var4 + var4] = var3;
                            var3++;
                            break L9;
                          } else {
                            var4 = var2_int - 1 & 1 + var4;
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
            stackOut_21_1 = new StringBuilder().append("qg.<init>(");
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
          throw fc.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    static {
        field_b = "Create";
        field_a = -1;
    }
}
