/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int[] field_b;
    private static int[] field_e;
    static int field_a;
    static String field_c;
    static String field_f;
    static mg field_d;

    final static String a(CharSequence param0, boolean param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!ck.a(param0.charAt(var2_int), -46)) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!ck.a(param0.charAt(var3 - 1), -46)) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  L5: {
                    if (param1) {
                      break L5;
                    } else {
                      c.a(true);
                      break L5;
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if ((var4 ^ -1) >= -13) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L6: while (true) {
                        if (var3 <= var6) {
                          if (-1 != (var5.length() ^ -1)) {
                            return var5.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (!bn.a(-110, (char) var7)) {
                              break L7;
                            } else {
                              var8 = dm.a((char) var7, (byte) 4);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                discarded$0 = var5.append((char) var8);
                                break L7;
                              }
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      stackIn_18_0 = null;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var2);

            stackIn_31_1 = new StringBuilder().append("c.C(");

            if (param0 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L8;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L8;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        return (String) ((Object) stackIn_18_0);
    }

    final static short[] a(short[] param0, int param1, int param2, hg param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param3.c((byte) -78, param2);
            if (param1 <= -5) {
              if (var4_int != 0) {
                L1: {
                  L2: {
                    if (param0 == null) {
                      break L2;
                    } else {
                      if (param0.length != var4_int) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param0 = new short[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param3.c((byte) -78, 4);
                  var6 = (short)param3.c((byte) -78, 16);
                  if (var5 > 0) {
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var4_int) {
                        break L3;
                      } else {
                        param0[var7] = (short)(var6 + param3.c((byte) -78, var5));
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
                        param0[var7] = (short)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (short[]) (param0);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (short[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("c.B(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (short[]) ((Object) stackIn_6_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
            field_d = (mg) null;
        }
        field_e = null;
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        field_e = new int[65536];
        field_b = new int[65536];
        for (var0 = 0; -65537 < (var0 ^ -1); var0++) {
            var1 = -Math.sqrt((double)var0) + 256.0;
            field_b[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0 = 0; 65536 > var0; var0++) {
            var1 = Math.sqrt((double)var0);
            field_e[var0] = (int)Math.floor(-(var1 * 9.0) + 768.5 + (double)var0 * 0.0234375);
        }
        field_a = 256;
        field_c = "Invite";
        field_f = "<%0> has resigned and is offering a rematch.";
    }
}
