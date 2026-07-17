/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends ci {
    private int field_n;
    static String field_q;
    static it field_p;
    static String field_o;
    static int field_m;

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 >= -91) {
            field_p = null;
            field_q = null;
            return;
        }
        field_q = null;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var15 = ((gla) this).field_i.a((byte) 17, param1);
          var13 = var15;
          var11 = var13;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((gla) this).field_i.field_d) {
            var4 = sj.field_b[param1];
            var5 = 0;
            L0: while (true) {
              if (ns.field_g > var5) {
                L1: {
                  var6 = ht.field_Fb[var5];
                  if (var6 <= ((gla) this).field_n) {
                    break L1;
                  } else {
                    if (var6 >= -((gla) this).field_n + 4096) {
                      break L1;
                    } else {
                      if (var4 <= -((gla) this).field_n + 2048) {
                        break L1;
                      } else {
                        if (var4 < ((gla) this).field_n + 2048) {
                          L2: {
                            var7 = 2048 + -var6;
                            if (var7 < 0) {
                              stackOut_52_0 = -var7;
                              stackIn_53_0 = stackOut_52_0;
                              break L2;
                            } else {
                              stackOut_51_0 = var7;
                              stackIn_53_0 = stackOut_51_0;
                              break L2;
                            }
                          }
                          var7 = stackIn_53_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-((gla) this).field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          var5++;
                          continue L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L3: {
                  if (var6 <= 2048 + -((gla) this).field_n) {
                    break L3;
                  } else {
                    if (var6 >= 2048 - -((gla) this).field_n) {
                      break L3;
                    } else {
                      L4: {
                        var7 = var4 + -2048;
                        if (0 > var7) {
                          stackOut_58_0 = -var7;
                          stackIn_59_0 = stackOut_58_0;
                          break L4;
                        } else {
                          stackOut_57_0 = var7;
                          stackIn_59_0 = stackOut_57_0;
                          break L4;
                        }
                      }
                      var7 = stackIn_59_0;
                      var7 = var7 - ((gla) this).field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-((gla) this).field_n + 2048);
                      var5++;
                      continue L0;
                    }
                  }
                }
                L5: {
                  if (((gla) this).field_n > var4) {
                    break L5;
                  } else {
                    if (4096 - ((gla) this).field_n >= var4) {
                      L6: {
                        if (var6 < ((gla) this).field_n) {
                          break L6;
                        } else {
                          if (var6 <= -((gla) this).field_n + 4096) {
                            var15[var5] = 0;
                            var5++;
                            continue L0;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var7 = 2048 - var4;
                        if (var7 < 0) {
                          stackOut_72_0 = -var7;
                          stackIn_73_0 = stackOut_72_0;
                          break L7;
                        } else {
                          stackOut_71_0 = var7;
                          stackIn_73_0 = stackOut_71_0;
                          break L7;
                        }
                      }
                      var7 = stackIn_73_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - ((gla) this).field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L0;
                    } else {
                      break L5;
                    }
                  }
                }
                L8: {
                  var7 = var6 - 2048;
                  if (var7 >= 0) {
                    stackOut_65_0 = var7;
                    stackIn_66_0 = stackOut_65_0;
                    break L8;
                  } else {
                    stackOut_64_0 = -var7;
                    stackIn_66_0 = stackOut_64_0;
                    break L8;
                  }
                }
                var7 = stackIn_66_0;
                var7 = var7 - ((gla) this).field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (-((gla) this).field_n + 2048);
                var5++;
                continue L0;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        } else {
          field_p = null;
          var14 = ((gla) this).field_i.a((byte) 17, param1);
          var12 = var14;
          var11 = var12;
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (((gla) this).field_i.field_d) {
            var4 = sj.field_b[param1];
            var5 = 0;
            L9: while (true) {
              if (ns.field_g > var5) {
                L10: {
                  var6 = ht.field_Fb[var5];
                  if (var6 <= ((gla) this).field_n) {
                    break L10;
                  } else {
                    if (var6 >= -((gla) this).field_n + 4096) {
                      break L10;
                    } else {
                      if (var4 <= -((gla) this).field_n + 2048) {
                        break L10;
                      } else {
                        if (var4 < ((gla) this).field_n + 2048) {
                          L11: {
                            var7 = 2048 + -var6;
                            if (var7 < 0) {
                              stackOut_15_0 = -var7;
                              stackIn_16_0 = stackOut_15_0;
                              break L11;
                            } else {
                              stackOut_14_0 = var7;
                              stackIn_16_0 = stackOut_14_0;
                              break L11;
                            }
                          }
                          var7 = stackIn_16_0;
                          var7 = var7 << 12;
                          var7 = var7 / (-((gla) this).field_n + 2048);
                          var9[var5] = -var7 + 4096;
                          var5++;
                          var5++;
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (var6 <= 2048 + -((gla) this).field_n) {
                    break L12;
                  } else {
                    if (var6 >= 2048 - -((gla) this).field_n) {
                      break L12;
                    } else {
                      L13: {
                        var7 = var4 + -2048;
                        if (0 > var7) {
                          stackOut_21_0 = -var7;
                          stackIn_22_0 = stackOut_21_0;
                          break L13;
                        } else {
                          stackOut_20_0 = var7;
                          stackIn_22_0 = stackOut_20_0;
                          break L13;
                        }
                      }
                      var7 = stackIn_22_0;
                      var7 = var7 - ((gla) this).field_n;
                      var7 = var7 << 12;
                      var9[var5] = var7 / (-((gla) this).field_n + 2048);
                      var5++;
                      continue L9;
                    }
                  }
                }
                L14: {
                  if (((gla) this).field_n > var4) {
                    break L14;
                  } else {
                    if (4096 - ((gla) this).field_n >= var4) {
                      L15: {
                        if (var6 < ((gla) this).field_n) {
                          break L15;
                        } else {
                          if (var6 <= -((gla) this).field_n + 4096) {
                            var14[var5] = 0;
                            var5++;
                            continue L9;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        var7 = 2048 - var4;
                        if (var7 < 0) {
                          stackOut_35_0 = -var7;
                          stackIn_36_0 = stackOut_35_0;
                          break L16;
                        } else {
                          stackOut_34_0 = var7;
                          stackIn_36_0 = stackOut_34_0;
                          break L16;
                        }
                      }
                      var7 = stackIn_36_0;
                      var7 = var7 << 12;
                      var7 = var7 / (2048 - ((gla) this).field_n);
                      var9[var5] = -var7 + 4096;
                      var5++;
                      continue L9;
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  var7 = var6 - 2048;
                  if (var7 >= 0) {
                    stackOut_28_0 = var7;
                    stackIn_29_0 = stackOut_28_0;
                    break L17;
                  } else {
                    stackOut_27_0 = -var7;
                    stackIn_29_0 = stackOut_27_0;
                    break L17;
                  }
                }
                var7 = stackIn_29_0;
                var7 = var7 - ((gla) this).field_n;
                var7 = var7 << 12;
                var9[var5] = var7 / (-((gla) this).field_n + 2048);
                var5++;
                continue L9;
              } else {
                return var9;
              }
            }
          } else {
            return var9;
          }
        }
    }

    public gla() {
        super(0, true);
        ((gla) this).field_n = 585;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((gla) this).field_n = param1.d(124);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                gla.d((byte) 92);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("gla.A(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Room complete +<%0>";
        field_p = new it();
        field_o = "Idols";
        field_m = -1;
    }
}
