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

    public static void e(byte param0) {
        field_q = null;
        field_p = null;
        field_s = null;
        field_r = null;
        if (param0 != -61) {
            return;
        }
        field_o = null;
    }

    final static String a(CharSequence param0, int param1) {
        String discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_35_0 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                var9 = (CharSequence) null;
                discarded$14 = msa.a((CharSequence) null, -104);
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new StringBuilder(var2_int);
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackOut_35_0 = var3.toString();
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param0.charAt(var4);
                    if (97 > var5) {
                      break L4;
                    } else {
                      if (var5 <= 122) {
                        discarded$15 = var3.append((char) var5);
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (65 > var5) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        discarded$16 = var3.append((char) var5);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var5 < 48) {
                      break L6;
                    } else {
                      if (57 >= var5) {
                        discarded$17 = var3.append((char) var5);
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var5 == 46) {
                    discarded$18 = var3.append((char) var5);
                    break L3;
                  } else {
                    if (var5 == 45) {
                      discarded$19 = var3.append((char) var5);
                      break L3;
                    } else {
                      if (var5 == 42) {
                        discarded$20 = var3.append((char) var5);
                        break L3;
                      } else {
                        if (var5 != 95) {
                          if (var5 != 32) {
                            L7: {
                              var6 = aea.a(param1 ^ -90, (char) var5);
                              discarded$21 = var3.append('%');
                              var7 = (var6 & 244) >> -581017148;
                              if ((var7 ^ -1) > -11) {
                                discarded$22 = var3.append((char)(48 - -var7));
                                break L7;
                              } else {
                                discarded$23 = var3.append((char)(55 - -var7));
                                break L7;
                              }
                            }
                            var7 = var6 & 15;
                            if (var7 < 10) {
                              discarded$24 = var3.append((char)(48 - -var7));
                              break L3;
                            } else {
                              discarded$25 = var3.append((char)(55 - -var7));
                              break L3;
                            }
                          } else {
                            discarded$26 = var3.append('+');
                            break L3;
                          }
                        } else {
                          discarded$27 = var3.append((char) var5);
                          break L3;
                        }
                      }
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var2);
            stackOut_37_1 = new StringBuilder().append("msa.B(");
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param0 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L8;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ')');
        }
        return stackIn_36_0;
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
                field_o = (llb) null;
                break L1;
              }
            }
            stackOut_2_0 = new nc(frb.a(56, 108));
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("msa.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_p = "DirectX";
        field_r = "If you do nothing the game will revert to normal view once the timer reaches 0.";
        field_q = new float[16];
    }
}
