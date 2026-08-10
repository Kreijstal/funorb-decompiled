/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk {
    static String[] field_a;
    static wd field_b;

    final static String a(int param0, CharSequence param1) {
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 33 / ((param0 - -55) / 38);
            if (param1 != null) {
              var3 = 0;
              var4 = param1.length();
              L1: while (true) {
                L2: {
                  if (var3 >= var4) {
                    break L2;
                  } else {
                    if (!r.a(param1.charAt(var3), 83)) {
                      break L2;
                    } else {
                      var3++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var4 <= var3) {
                      break L4;
                    } else {
                      if (!r.a(param1.charAt(-1 + var4), 109)) {
                        break L4;
                      } else {
                        var4--;
                        continue L3;
                      }
                    }
                  }
                  var5 = var4 - var3;
                  if (-2 >= (var5 ^ -1)) {
                    if (12 >= var5) {
                      var6 = new StringBuilder(var5);
                      var7 = var3;
                      L5: while (true) {
                        if (var4 <= var7) {
                          if (var6.length() != 0) {
                            return var6.toString();
                          } else {
                            return null;
                          }
                        } else {
                          L6: {
                            var8 = param1.charAt(var7);
                            if (sg.a((char) var8, (byte) -95)) {
                              var9 = kl.a((byte) -78, (char) var8);
                              if (0 == var9) {
                                break L6;
                              } else {
                                discarded$0 = var6.append((char) var9);
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = null;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var2);

            stackIn_30_1 = new StringBuilder().append("uk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ')');
        }
        return (String) ((Object) stackIn_3_0);
    }

    final static boolean b(int param0) {
        if (param0 != 15000) {
            field_a = (String[]) null;
        }
        lj.field_e = true;
        ua.field_sb = 15000L + lj.a((byte) -68);
        return -12 == (bh.field_t ^ -1) ? true : false;
    }

    final static void a(String param0, long param1, int param2, java.applet.Applet param3, String param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var8 = param3.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (param2 == 0) {
                        break L2;
                      } else {
                        field_a = (String[]) null;
                        break L2;
                      }
                    }
                    L3: {
                      if (-1L >= (param1 ^ -1L)) {
                        var7 = var9 + "; Expires=" + wd.a((byte) -61, param1 * 1000L + lj.a((byte) -95)) + "; Max-Age=" + param1;
                        break L3;
                      } else {
                        var7 = var9 + "; Discard;";
                        break L3;
                      }
                    }
                    eb.a("document.cookie=\"" + var7 + "\"", -28924, param3);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("uk.E(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -9435) {
            field_b = (wd) null;
        }
        field_a = null;
    }

    final static bi a(byte param0, int[] param1, bi param2) {
        bi var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new bi(0, 0, 0);
            var3.field_e = param2.field_e;
            var4 = 40 / ((param0 - 41) / 34);
            var3.field_l = param1;
            var3.field_d = param2.field_d;
            var3.field_c = param2.field_c;
            var3.field_g = param2.field_g;
            var3.field_h = param2.field_h;
            var3.field_a = param2.field_a;
            var3.field_k = param2.field_k;
            stackIn_1_0 = (bi) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3_ref);

            stackIn_4_1 = new StringBuilder().append("uk.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_b = new wd();
    }
}
