/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aw extends sm {
    static wk field_m;
    static String field_k;
    static boolean field_l;
    static int[][][] field_j;
    static String field_h;
    static wr field_i;

    final static boolean a(boolean param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0) {
          L0: {
            var1 = vi.b(-45);
            var3 = var1 + -dp.field_Lb;
            if (-30001L > (var3 ^ -1L)) {
              break L0;
            } else {
              L1: {
                L2: {
                  var5 = 3000;
                  if (7 <= mu.field_d) {
                    break L2;
                  } else {
                    L3: {
                      if (mu.field_d < 5) {
                        break L3;
                      } else {
                        var5 = 9000;
                        if (var6 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (3 > mu.field_d) {
                      break L1;
                    } else {
                      var5 = 6000;
                      if (var6 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var5 = 12000;
                break L1;
              }
              if ((var3 ^ -1L) < ((long)var5 ^ -1L)) {
                dp.field_Lb = var1;
                mu.field_d = mu.field_d + 1;
                return true;
              } else {
                if (var6 != 0) {
                  break L0;
                } else {
                  return false;
                }
              }
            }
          }
          dp.field_Lb = var1;
          mu.field_d = 0;
          return true;
        } else {
          return false;
        }
    }

    final void a(int param0, jb param1) {
        RuntimeException runtimeException = null;
        jb var3 = null;
        jb var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var3 = (jb) ((Object) this.field_a.a(0));
              if (param0 == 16777062) {
                break L1;
              } else {
                var4 = (jb) null;
                this.a(64, (jb) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (var3 == null) {
                  break L3;
                } else {
                  if (param1.field_t > var3.field_t) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L2;
            }
            this.field_a.a(750, var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (runtimeException);
            stackOut_8_1 = new StringBuilder().append("aw.F(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final jb a(byte param0) {
        jb discarded$2 = null;
        jb var2 = null;
        if (param0 > -28) {
          discarded$2 = this.a((byte) -5);
          var2 = (jb) ((Object) this.field_a.a(0));
          return var2;
        } else {
          var2 = (jb) ((Object) this.field_a.a(0));
          return var2;
        }
    }

    final static og a(byte param0, mt param1) {
        int fieldTemp$8 = 0;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        og stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        og stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              fieldTemp$8 = param1.field_c - 1;
              param1.field_c = param1.field_c - 1;
              var2_int = fieldTemp$8;
              var3 = new StringBuilder();
              var4 = param1.b(-1);
              if (param0 > 95) {
                break L1;
              } else {
                field_h = (String) null;
                break L1;
              }
            }
            discarded$9 = var3.append((char) var4);
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (param1.a((byte) 16)) {
                    break L4;
                  } else {
                    var6 = param1.b(-1);
                    stackOut_5_0 = var5;
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_6_0 != 0) {
                            break L6;
                          } else {
                            L7: {
                              L8: {
                                if (var6 != 92) {
                                  break L8;
                                } else {
                                  var5 = 1;
                                  if (var7 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              discarded$10 = var3.append((char) var6);
                              break L7;
                            }
                            if (var4 != var6) {
                              break L5;
                            } else {
                              if (var7 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        discarded$11 = var3.append((char) var6);
                        break L5;
                      }
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_15_0 = var4;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              L9: {
                if (stackIn_16_0 != 34) {
                  stackOut_18_0 = hf.field_h;
                  stackIn_19_0 = stackOut_18_0;
                  break L9;
                } else {
                  stackOut_17_0 = iu.field_x;
                  stackIn_19_0 = stackOut_17_0;
                  break L9;
                }
              }
              var6 = stackIn_19_0;
              stackOut_19_0 = new og(var6, var2_int, var3.toString());
              stackIn_20_0 = stackOut_19_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var2);
            stackOut_21_1 = new StringBuilder().append("aw.B(").append(param0).append(',');
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
          throw ig.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final static void a(co param0, co[] param1, int param2) {
        try {
            if (param2 != -5841) {
                field_h = (String) null;
            }
            param1[param0.field_d] = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "aw.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var2 = null;
        int var3 = 0;
        nt var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4 = (nt) ((Object) s.field_a.e((byte) 104));
            L1: while (true) {
              L2: {
                L3: {
                  if (var4 == null) {
                    break L3;
                  } else {
                    tf.a(param0, var4, (byte) -64);
                    var4 = (nt) ((Object) s.field_a.a((byte) 123));
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1 == 1742) {
                  break L2;
                } else {
                  discarded$2 = aw.a(true);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "aw.R(" + param0 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        int var1 = 13 % ((-54 - param0) / 57);
        field_h = null;
        field_k = null;
        field_m = null;
        field_j = (int[][][]) null;
        field_i = null;
    }

    aw(ej param0) {
        super(param0);
    }

    static {
        field_h = null;
    }
}
