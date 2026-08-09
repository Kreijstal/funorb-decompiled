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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        CharSequence var9 = null;
        var8 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == 32) {
                break L1;
              } else {
                var9 = (CharSequence) null;
                msa.a((CharSequence) null, -104);
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = new StringBuilder(var2_int);
            var4 = 0;
            L2: while (true) {
              if (var2_int <= var4) {
                stackIn_36_0 = var3.toString();
                break L0;
              } else {
                L3: {
                  L4: {
                    var5 = param0.charAt(var4);
                    if (97 > var5) {
                      break L4;
                    } else {
                      if (var5 <= 122) {
                        discarded$0 = var3.append((char) var5);
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
                        discarded$1 = var3.append((char) var5);
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
                        discarded$2 = var3.append((char) var5);
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (var5 == 46) {
                    discarded$3 = var3.append((char) var5);
                    break L3;
                  } else {
                    if (var5 == 45) {
                      discarded$4 = var3.append((char) var5);
                      break L3;
                    } else {
                      if (var5 == 42) {
                        discarded$5 = var3.append((char) var5);
                        break L3;
                      } else {
                        if (var5 != 95) {
                          if (var5 != 32) {
                            L7: {
                              var6 = aea.a(param1 ^ -90, (char) var5);
                              discarded$6 = var3.append('%');
                              var7 = (var6 & 244) >> -581017148;
                              if ((var7 ^ -1) > -11) {
                                discarded$7 = var3.append((char)(48 - -var7));
                                break L7;
                              } else {
                                discarded$8 = var3.append((char)(55 - -var7));
                                break L7;
                              }
                            }
                            var7 = var6 & 15;
                            if (var7 < 10) {
                              discarded$9 = var3.append((char)(48 - -var7));
                              break L3;
                            } else {
                              discarded$10 = var3.append((char)(55 - -var7));
                              break L3;
                            }
                          } else {
                            discarded$11 = var3.append('+');
                            break L3;
                          }
                        } else {
                          discarded$12 = var3.append((char) var5);
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
            stackIn_39_0 = (RuntimeException) (var2);

            stackIn_39_1 = new StringBuilder().append("msa.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L8;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = new nc(frb.a(56, 108));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("msa.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
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
