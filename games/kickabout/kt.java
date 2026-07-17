/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kt extends js {
    static hd field_i;
    static int field_j;
    static int field_g;
    static String field_k;
    private int field_h;
    static hd[] field_m;
    static int field_l;

    final void a(int param0, boolean param1, int param2, js param3) {
        RuntimeException var5 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              stackOut_0_0 = this;
              stackIn_2_0 = stackOut_0_0;
              stackIn_1_0 = stackOut_0_0;
              if (!param1) {
                stackOut_2_0 = this;
                stackOut_2_1 = -param0 + 256;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                break L1;
              } else {
                stackOut_1_0 = this;
                stackOut_1_1 = param0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                break L1;
              }
            }
            L2: {
              ((kt) this).field_h = stackIn_3_1;
              if (param2 < -28) {
                break L2;
              } else {
                field_g = 88;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("kt.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    final static void b() {
        cd.a((byte) -128, g.field_a.field_J, 15);
    }

    final static int a(CharSequence param0, boolean param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var12 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var8 = 37 % ((param2 - 73) / 47);
                  var7 = param0.length();
                  var9 = 0;
                  L2: while (true) {
                    if (var9 >= var7) {
                      if (var5 == 0) {
                        throw new NumberFormatException();
                      } else {
                        stackOut_38_0 = var6;
                        stackIn_39_0 = stackOut_38_0;
                        break L0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var10 = param0.charAt(var9);
                          if (var9 == 0) {
                            if (var10 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var10 != 43) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var10 < 48) {
                              break L6;
                            } else {
                              if (57 < var10) {
                                break L6;
                              } else {
                                var10 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var10 < 65) {
                              break L7;
                            } else {
                              if (90 < var10) {
                                break L7;
                              } else {
                                var10 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var10 < 97) {
                              break L8;
                            } else {
                              if (var10 <= 122) {
                                var10 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var10 < param3) {
                          L9: {
                            if (var4_int != 0) {
                              var10 = -var10;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var11 = var10 + param3 * var6;
                          if (var6 != var11 / param3) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var11;
                            var5 = 1;
                            break L3;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("kt.C(");
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param0 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L10;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 44 + 1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_39_0;
    }

    final static kw a(boolean param0, String param1) {
        RuntimeException var2 = null;
        kw stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        kw stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!lc.field_e.a((byte) -80)) {
                break L1;
              } else {
                if (!param1.equals((Object) (Object) lc.field_e.a(3))) {
                  lc.field_e = su.a(-3505, param1);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = lc.field_e;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("kt.I(").append(0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 >= -5) {
            return false;
        }
        return false;
    }

    public static void a() {
        field_k = null;
        field_m = null;
        field_i = null;
    }

    final void a(byte param0, boolean param1) {
        int var3 = 124 / ((38 - param0) / 60);
    }

    final void a(int param0, boolean param1) {
        if (((kt) this).field_h != 256) {
            on.a(0, 0, 640, 480, 0, ((kt) this).field_h);
        } else {
            on.b();
        }
        if (param0 != -5) {
            field_m = null;
        }
    }

    final static String a(byte[] param0) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
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
            stackOut_2_0 = hf.a((byte) -127, param0.length, 0, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("kt.B(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 1 + 41);
        }
        return stackIn_3_0;
    }

    kt() {
        super(-3);
        ((kt) this).field_h = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = -1;
        field_k = "You must play 1 more rated game before playing with the current options.";
    }
}
