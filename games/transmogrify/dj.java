/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a() {
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
        String stackIn_34_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_33_0 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 55 % ((-79 - param1) / 36);
            var3 = param0.length();
            var4 = new StringBuilder(var3);
            var5 = 0;
            L1: while (true) {
              if (~var3 >= ~var5) {
                stackOut_33_0 = var4.toString();
                stackIn_34_0 = stackOut_33_0;
                break L0;
              } else {
                L2: {
                  var6 = param0.charAt(var5);
                  if (var6 < 97) {
                    break L2;
                  } else {
                    if (var6 <= 122) {
                      StringBuilder discarded$6 = var4.append((char) var6);
                      var5++;
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (var6 < 48) {
                    break L3;
                  } else {
                    if (var6 <= 57) {
                      StringBuilder discarded$7 = var4.append((char) var6);
                      var5++;
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (90 < var6) {
                      break L4;
                    } else {
                      StringBuilder discarded$8 = var4.append((char)(32 + var6));
                      var5++;
                      var5++;
                      continue L1;
                    }
                  }
                }
                if (var6 == 43) {
                  StringBuilder discarded$9 = var4.append('+');
                  var5++;
                  var5++;
                  continue L1;
                } else {
                  if (var6 != 38) {
                    L5: {
                      var7 = var4.length();
                      if (0 >= var7) {
                        break L5;
                      } else {
                        if (var4.charAt(-1 + var7) == 95) {
                          break L5;
                        } else {
                          StringBuilder discarded$10 = var4.append('_');
                          var5++;
                          continue L1;
                        }
                      }
                    }
                    var5++;
                    continue L1;
                  } else {
                    StringBuilder discarded$11 = var4.append('+');
                    var5++;
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("dj.E(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ',' + param1 + ')');
        }
        return stackIn_34_0;
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
                  return;
                }
              }
            }
            return;
          } else {
            L2: {
              ub.field_c = vg.field_b.d((byte) -18);
              int discarded$2 = 2;
              int discarded$3 = -14226;
              kc.a();
              if (null != ub.field_c) {
                var2 = 2;
                cj.a((java.awt.Canvas) (Object) ub.field_c, 13861);
                break L2;
              } else {
                var2 = 3;
                break L2;
              }
            }
            L3: {
              if (null != vg.field_b) {
                break L3;
              } else {
                if (!wc.field_b) {
                  break L3;
                } else {
                  tf.a((byte) 46, param1, var2);
                  return;
                }
              }
            }
            return;
          }
        } else {
          if (qj.b((byte) 73)) {
            L4: {
              var2 = 0;
              if (null != vg.field_b) {
                break L4;
              } else {
                if (!wc.field_b) {
                  break L4;
                } else {
                  tf.a((byte) 46, param1, var2);
                  return;
                }
              }
            }
            return;
          } else {
            var2 = 1;
            if (null == vg.field_b) {
              if (wc.field_b) {
                tf.a((byte) 46, param1, var2);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.k(16, 1522829539);
            if (var4_int != 0) {
              L1: {
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    if (~var4_int != ~param2.length) {
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
                      param2[var7] = (byte)(param1.k(var5, ak.a(-39, -1522829510)) + var6);
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
              stackOut_17_0 = (byte[]) param2;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("dj.F(").append(-39).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 16 + ')');
        }
        return stackIn_18_0;
    }

    final static boolean a(char param0) {
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
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (param1 <= 0) {
                stackOut_4_0 = var3_int;
                stackIn_5_0 = stackOut_4_0;
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
          throw ch.a((Throwable) (Object) var3, "dj.G(" + true + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
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
        try {
          L0: {
            L1: {
              if (ta.field_f != null) {
                ta.field_f.field_D.a(param1, 17036);
                break L1;
              } else {
                break L1;
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
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("dj.J(").append(false).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final static boolean b() {
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
