/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb implements ga {
    static String field_c;
    static int field_d;
    static ki field_b;
    private long field_a;

    final static String a(CharSequence param0, int param1) {
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (20 < var2_int) {
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
                                var3[var4] = (char)(32 + var5);
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
                  if (param1 == 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                field_b = (ki) null;
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
            stackOut_28_1 = new StringBuilder().append("wb.BA(");
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
          throw dd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        return stackIn_27_0;
    }

    abstract qd a(byte param0);

    final static String a(CharSequence[] param0, byte param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -123) {
              stackOut_3_0 = vi.a(param0, 0, param0.length, 0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("wb.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void f(int param0) {
        field_c = null;
        if (param0 != 7312) {
            return;
        }
        field_b = null;
    }

    public final String a(int param0) {
        if (!this.c(25296)) {
          if ((350L + this.field_a ^ -1L) >= (ji.b(123) ^ -1L)) {
            if (param0 <= 121) {
              field_c = (String) null;
              return this.e(-45);
            } else {
              return this.e(-45);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    abstract String e(int param0);

    public final qd d(int param0) {
        if (this.c(25296)) {
          return fm.field_a;
        } else {
          if ((350L + this.field_a ^ -1L) >= (ji.b(-84) ^ -1L)) {
            if (param0 != -7847) {
              return (qd) null;
            } else {
              return this.a((byte) 75);
            }
          } else {
            return ml.field_a;
          }
        }
    }

    public final void b(int param0) {
        this.field_a = ji.b(param0 + 21066);
        if (param0 != -20959) {
            field_c = (String) null;
        }
    }

    static {
        field_c = "Email is valid";
    }
}
