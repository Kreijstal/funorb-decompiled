/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hi {
    bk[] field_c;
    static double[] field_d;
    static String field_b;
    static boolean field_a;

    final static sj a(String param0, byte param1) {
        RuntimeException var2 = null;
        Object stackIn_9_0 = null;
        sj stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (pi.field_a != ll.field_C) {
              L1: {
                if (pi.field_a != ik.field_d) {
                  break L1;
                } else {
                  if (param0.equals((Object) (Object) ak.field_b)) {
                    pi.field_a = fk.field_Q;
                    stackOut_10_0 = pm.field_f;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              pi.field_a = ll.field_C;
              pm.field_f = null;
              ak.field_b = param0;
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (sj) (Object) stackIn_9_0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("hi.M(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + -80 + 41);
        }
        return stackIn_11_0;
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        bk var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TetraLink.field_J;
          if (((hi) this).field_c == null) {
            break L0;
          } else {
            if (0 == ((hi) this).field_c.length) {
              break L0;
            } else {
              if (((hi) this).field_c[0].field_h > param1) {
                break L0;
              } else {
                if (param1 <= ((hi) this).field_c[((hi) this).field_c.length - 1].field_a) {
                  L1: {
                    if (param2 == 12024) {
                      break L1;
                    } else {
                      ((hi) this).field_c = null;
                      break L1;
                    }
                  }
                  if (1 != ((hi) this).field_c.length) {
                    var4 = 0;
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= ((hi) this).field_c.length) {
                        return -1;
                      } else {
                        L3: {
                          var6 = ((hi) this).field_c[var5];
                          if (param1 < var6.field_h) {
                            break L3;
                          } else {
                            if (param1 <= var6.field_a) {
                              var7 = var6.a((byte) 118, param0);
                              if (var7 != -1) {
                                return var7 + var4;
                              } else {
                                return -1;
                              }
                            } else {
                              break L3;
                            }
                          }
                        }
                        var4 = var4 + (var6.field_j.length - 1);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return ((hi) this).field_c[0].a((byte) 109, param0);
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        }
        return -1;
    }

    final int b(byte param0) {
        int var2 = 0;
        bk[] var3 = null;
        int var4 = 0;
        bk var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TetraLink.field_J;
          var2 = -1;
          if (param0 >= 29) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (((hi) this).field_c == null) {
            break L1;
          } else {
            var3 = ((hi) this).field_c;
            var4 = 0;
            L2: while (true) {
              if (var4 >= var3.length) {
                break L1;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a((byte) -41);
                  if (var2 < var6) {
                    var2 = var6;
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
        return var2;
    }

    final int a(int param0, boolean param1) {
        int var4 = 0;
        bk var5 = null;
        int var6 = TetraLink.field_J;
        bk[] var8 = ((hi) this).field_c;
        bk[] var3 = var8;
        if (!param1) {
            Object var7 = null;
            String[] discarded$0 = hi.a((String) null, 'ﾎ', 23);
        }
        for (var4 = 0; var4 < var8.length; var4++) {
            var5 = var8[var4];
            if (!(var5.field_j.length <= param0)) {
                return var5.field_j[param0];
            }
            param0 = param0 - (var5.field_j.length + -1);
        }
        return 0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        bk var4 = null;
        int var5 = TetraLink.field_J;
        for (var3 = 0; ((hi) this).field_c.length > var3; var3++) {
            var4 = ((hi) this).field_c[var3];
            if (!(param0 >= var4.field_j.length)) {
                return var3;
            }
            param0 = param0 - (var4.field_j.length - 1);
        }
        if (param1 < 94) {
            int discarded$0 = ((hi) this).a(-30, -101);
        }
        return ((hi) this).field_c.length;
    }

    final static String[] a(String param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        Object stackIn_3_0 = null;
        String[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_10_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            var3_int = en.a(param2 + -663, param1, var10);
            var4 = new String[var3_int + 1];
            var5 = 0;
            if (param2 == 783) {
              var6 = 0;
              var7 = 0;
              L1: while (true) {
                if (var3_int <= var7) {
                  var4[var3_int] = param0.substring(var6);
                  stackOut_10_0 = (String[]) var4;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  var8 = var6;
                  L2: while (true) {
                    if (param1 == param0.charAt(var8)) {
                      int incrementValue$2 = var5;
                      var5++;
                      var4[incrementValue$2] = param0.substring(var6, var8);
                      var6 = var8 - -1;
                      var7++;
                      continue L1;
                    } else {
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("hi.O(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_11_0;
    }

    final static void b(int param0) {
        io.field_h.setLength(0);
        sf.field_d = 0;
        if (param0 >= -33) {
            field_d = null;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_b = null;
    }

    final static void a(int param0) {
        int var1 = -124 % ((-60 - param0) / 55);
        kb.a(false, rh.field_F);
    }

    final int a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_a = false;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((hi) this).field_c == null) {
              break L2;
            } else {
              if (0 >= ((hi) this).field_c.length) {
                break L2;
              } else {
                stackOut_4_0 = ((hi) this).field_c[((hi) this).field_c.length + -1].field_a - ((hi) this).field_c[0].field_h;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0;
    }

    final int a(int param0, byte param1, int param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param3.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (var5_int > 0) {
                  stackOut_13_0 = (-param0 + param2 << 8) / var5_int;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                } else {
                  if (param1 == -126) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = -18;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              } else {
                L2: {
                  var9 = param3.charAt(var8);
                  if (var9 == 60) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (62 != var9) {
                      L3: {
                        if (var6 != 0) {
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var8++;
                      continue L1;
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("hi.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Drawn";
        field_a = false;
    }
}
