/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class msa extends rqa {
    static llb field_o;
    static float[] field_q;
    static rbb field_s;
    static String field_p;
    static String field_r;

    msa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e() {
        field_q = null;
        field_p = null;
        field_s = null;
        field_r = null;
        field_o = null;
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_39_0 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                var9 = null;
                String discarded$14 = msa.a((CharSequence) null, -104);
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new StringBuilder(var2_int);
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_39_0 = var3.toString();
                stackIn_40_0 = stackOut_39_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param0.charAt(var4);
                      if (97 > var5) {
                        break L5;
                      } else {
                        if (var5 <= 122) {
                          StringBuilder discarded$15 = var3.append(var5);
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var5) {
                        break L6;
                      } else {
                        if (var5 <= 90) {
                          StringBuilder discarded$16 = var3.append(var5);
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var5 < 48) {
                        break L7;
                      } else {
                        if (57 >= var5) {
                          StringBuilder discarded$17 = var3.append(var5);
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    if (var5 == 46) {
                      StringBuilder discarded$18 = var3.append(var5);
                      break L4;
                    } else {
                      if (var5 == 45) {
                        StringBuilder discarded$19 = var3.append(var5);
                        break L4;
                      } else {
                        if (var5 == 42) {
                          StringBuilder discarded$20 = var3.append(var5);
                          break L4;
                        } else {
                          if (var5 != 95) {
                            if (var5 != 32) {
                              L8: {
                                var6 = aea.a(param1 ^ -90, (char) var5);
                                StringBuilder discarded$21 = var3.append(37);
                                var7 = (var6 & 244) >> 4;
                                if (var7 < 10) {
                                  StringBuilder discarded$22 = var3.append((char)(48 - -var7));
                                  break L8;
                                } else {
                                  StringBuilder discarded$23 = var3.append((char)(55 - -var7));
                                  break L8;
                                }
                              }
                              var7 = var6 & 15;
                              if (var7 < 10) {
                                StringBuilder discarded$24 = var3.append((char)(48 - -var7));
                                break L3;
                              } else {
                                StringBuilder discarded$25 = var3.append((char)(55 - -var7));
                                var4++;
                                break L3;
                              }
                            } else {
                              StringBuilder discarded$26 = var3.append(43);
                              var4++;
                              break L3;
                            }
                          } else {
                            StringBuilder discarded$27 = var3.append(var5);
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var4++;
                  break L3;
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("msa.B(");
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param0 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param1 + 41);
        }
        return stackIn_40_0;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) frb.a(56, 108));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("msa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "DirectX";
        field_r = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_q = new float[16];
    }
}
