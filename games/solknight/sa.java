/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sa extends gg {
    static int field_i;
    byte[] field_k;
    long field_h;
    static nc field_n;
    static int field_o;
    int field_j;
    static int field_m;
    static int[] field_l;

    public static void a(byte param0) {
        int var1 = 45 % ((param0 - 7) / 58);
        field_n = null;
        field_l = null;
    }

    final static String a(CharSequence param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        int var9 = 0;
        int var10 = 0;
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
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if ((var2_int ^ -1) < -21) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            var8 = new char[var2_int];
            var7 = var8;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (var2_int <= var4) {
                      break L5;
                    } else {
                      var5 = param0.charAt(var4);
                      var10 = var5 ^ -1;
                      var9 = -66;
                      if (var6 != 0) {
                        if (var9 == var10) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          L7: {
                            if (var9 < var10) {
                              break L7;
                            } else {
                              if (var5 > 90) {
                                break L7;
                              } else {
                                var3[var4] = (char)(var5 + 32);
                                if (var6 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (var5 < 97) {
                                  break L10;
                                } else {
                                  if (122 >= var5) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              if (var5 < 48) {
                                break L8;
                              } else {
                                if (var5 > 57) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            var3[var4] = (char)var5;
                            if (var6 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                          var3[var4] = (char)95;
                          break L6;
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (param1) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                field_m = -44;
                break L3;
              }
              stackOut_26_0 = new String(var8);
              stackIn_27_0 = stackOut_26_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("sa.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    sa(long param0, int param1, byte[] param2) {
        try {
            this.field_k = param2;
            this.field_h = param0;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "sa.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 5;
        field_n = new nc();
    }
}
