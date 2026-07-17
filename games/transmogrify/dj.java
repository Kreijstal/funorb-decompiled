/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 55 % ((-79 - param1) / 36);
            var3 = param0.length();
            var4 = new StringBuilder(var3);
            var5 = 0;
            L1: while (true) {
              if (var3 <= var5) {
                stackOut_26_0 = var4.toString();
                stackIn_27_0 = stackOut_26_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var6 = param0.charAt(var5);
                    if (var6 < 97) {
                      break L3;
                    } else {
                      if (var6 <= 122) {
                        StringBuilder discarded$6 = var4.append(var6);
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 <= 57) {
                        StringBuilder discarded$7 = var4.append(var6);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var6 < 65) {
                      break L5;
                    } else {
                      if (90 < var6) {
                        break L5;
                      } else {
                        StringBuilder discarded$8 = var4.append((char)(32 + var6));
                        var5++;
                        break L2;
                      }
                    }
                  }
                  if (var6 == 43) {
                    StringBuilder discarded$9 = var4.append(43);
                    var5++;
                    break L2;
                  } else {
                    if (var6 != 38) {
                      var7 = var4.length();
                      if (0 >= var7) {
                        break L2;
                      } else {
                        if (var4.charAt(-1 + var7) == 95) {
                          break L2;
                        } else {
                          StringBuilder discarded$10 = var4.append(95);
                          break L2;
                        }
                      }
                    } else {
                      StringBuilder discarded$11 = var4.append(43);
                      break L2;
                    }
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var2;
            stackOut_28_1 = new StringBuilder().append("dj.E(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 41);
        }
        return stackIn_27_0;
    }

    final static void a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (wj.field_o > 0) {
          if (vg.field_b == null) {
            L0: {
              ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a((java.awt.Canvas) (Object) ub.field_c, 13861);
                break L0;
              } else {
                var2 = 3;
                break L0;
              }
            }
            L1: {
              if (null != vg.field_b) {
                break L1;
              } else {
                if (!wc.field_b) {
                  break L1;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (!param0) {
                    boolean discarded$10 = dj.b(1);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            if (!param0) {
              boolean discarded$11 = dj.b(1);
              return;
            } else {
              return;
            }
          } else {
            L2: {
              ub.field_c = vg.field_b.d((byte) -18);
              kc.a(-14226, 2);
              if (null != ub.field_c) {
                var2 = 2;
                cj.a((java.awt.Canvas) (Object) ub.field_c, 13861);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (!param0) {
                  boolean discarded$12 = dj.b(1);
                  return;
                } else {
                  return;
                }
              } else {
                if (!param0) {
                  boolean discarded$13 = dj.b(1);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!param0) {
                boolean discarded$14 = dj.b(1);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (qj.b((byte) 73)) {
            var2 = 0;
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                if (!param0) {
                  boolean discarded$15 = dj.b(1);
                  return;
                } else {
                  return;
                }
              } else {
                if (!param0) {
                  boolean discarded$16 = dj.b(1);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (!param0) {
                boolean discarded$17 = dj.b(1);
                return;
              } else {
                return;
              }
            }
          } else {
            var2 = 1;
            L3: {
              if (null != vg.field_b) {
                break L3;
              } else {
                if (!wc.field_b) {
                  break L3;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    boolean discarded$18 = dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              boolean discarded$19 = dj.b(1);
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_18_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.k(16, 1522829539);
            if (param0 == -39) {
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param2 == null) {
                      break L2;
                    } else {
                      if (var4_int != param2.length) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param2 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param1.k(3, 1522829539);
                  var6 = (byte)param1.k(8, 1522829539);
                  if (var5 > 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param2[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param2[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackOut_18_0 = (byte[]) param2;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (byte[]) (Object) stackIn_6_0;
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("dj.F(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 16 + 41);
        }
        return stackIn_19_0;
    }

    final static boolean a(char param0, boolean param1) {
        if (param0 < 48) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_b = null;
                    break L2;
                  }
                }
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param2;
                param1--;
                param2 = param2 >>> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3, "dj.G(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
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
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              if (ta.field_f != null) {
                ta.field_f.field_D.a(param1, 17036);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != ca.field_g) {
              ca.field_g.field_B.a(param1, 17036);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("dj.J(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static boolean b(int param0) {
        pd.field_b = true;
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
