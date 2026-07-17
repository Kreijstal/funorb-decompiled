/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_j;
    static he[] field_l;
    static String field_k;
    static int field_e;
    static nh field_b;
    static boolean field_i;
    static int field_a;
    static he field_h;
    private gi field_g;
    static he[] field_f;
    private vd field_c;
    static String field_d;

    final gi a(byte param0) {
        gi var2 = ((rh) this).field_g;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 >= -66) {
            Object var3 = null;
            rh.a(58, (kc) null, -74);
        }
        ((rh) this).field_g = var2.field_e;
        return var2;
    }

    final gi a(gi param0, byte param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        gi stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -67) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                var3 = param0;
                break L2;
              } else {
                var3 = ((rh) this).field_c.field_c.field_e;
                break L2;
              }
            }
            if (((rh) this).field_c.field_c == var3) {
              ((rh) this).field_g = null;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              return (gi) (Object) stackIn_8_0;
            } else {
              ((rh) this).field_g = var3.field_e;
              stackOut_9_0 = (gi) var3;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("rh.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final static void a(int param0, kc param1, int param2) {
        lh var3 = null;
        try {
            var3 = nj.field_p;
            var3.d(param2, -18392);
            var3.c(param1.field_m, (byte) -113);
            if (param0 < 53) {
                field_e = 70;
            }
            var3.c(param1.field_h, -17402);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "rh.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final gi a(gi param0, int param1) {
        gi var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        gi stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        gi stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 == -2) {
              L1: {
                if (param0 != null) {
                  var3 = param0;
                  break L1;
                } else {
                  var3 = ((rh) this).field_c.field_c.field_b;
                  break L1;
                }
              }
              if (var3 != ((rh) this).field_c.field_c) {
                ((rh) this).field_g = var3.field_b;
                stackOut_9_0 = (gi) var3;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                ((rh) this).field_g = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (gi) (Object) stackIn_8_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (gi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("rh.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        Object stackOut_25_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!je.a(param1.charAt(var2_int), 90)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                var4 = 113 / ((60 - param0) / 54);
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!je.a(param1.charAt(var3 - 1), 89)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var5 = -var2_int + var3;
                  if (var5 >= 1) {
                    if (var5 <= 12) {
                      var6 = new StringBuilder(var5);
                      var7 = var2_int;
                      L5: while (true) {
                        if (var7 >= var3) {
                          if (var6.length() != 0) {
                            stackOut_27_0 = var6.toString();
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_25_0 = null;
                            stackIn_26_0 = stackOut_25_0;
                            return (String) (Object) stackIn_26_0;
                          }
                        } else {
                          L6: {
                            var8 = param1.charAt(var7);
                            if (!ue.a((char) var8, (byte) 78)) {
                              break L6;
                            } else {
                              var9 = lc.a(249, (char) var8);
                              if (var9 != 0) {
                                StringBuilder discarded$1 = var6.append(var9);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var2;
            stackOut_29_1 = new StringBuilder().append("rh.A(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 41);
        }
        return stackIn_28_0;
    }

    final gi a(int param0) {
        gi var2 = ((rh) this).field_c.field_c.field_b;
        if (!(((rh) this).field_c.field_c != var2)) {
            ((rh) this).field_g = null;
            return null;
        }
        ((rh) this).field_g = var2.field_b;
        if (param0 > -71) {
            return null;
        }
        return var2;
    }

    rh(vd param0) {
        try {
            ((rh) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "rh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final gi c(int param0) {
        gi var2 = ((rh) this).field_c.field_c.field_e;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 != -1) {
            Object var3 = null;
            gi discarded$0 = ((rh) this).a((gi) null, -101);
        }
        ((rh) this).field_g = var2.field_e;
        return var2;
    }

    public static void b(int param0) {
        field_l = null;
        field_f = null;
        field_k = null;
        field_d = null;
        field_h = null;
        field_b = null;
        if (param0 != -2) {
            rh.b(-8);
        }
        field_j = null;
    }

    final gi b(byte param0) {
        gi var2 = ((rh) this).field_g;
        if (!(var2 != ((rh) this).field_c.field_c)) {
            ((rh) this).field_g = null;
            return null;
        }
        if (param0 != 87) {
            field_k = null;
        }
        ((rh) this).field_g = var2.field_b;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Quit";
        field_b = null;
    }
}
