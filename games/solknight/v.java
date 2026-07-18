/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    static String field_a;
    static mc field_g;
    private int field_e;
    private ik field_c;
    static int field_d;
    private int field_b;
    private ii field_f;

    final static int a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_39_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 < -77) {
              L1: {
                if (param2 < 2) {
                  break L1;
                } else {
                  if (param2 > 36) {
                    break L1;
                  } else {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param1.length();
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var7) {
                        if (var5 != 0) {
                          stackOut_39_0 = var6;
                          stackIn_40_0 = stackOut_39_0;
                          break L0;
                        } else {
                          throw new NumberFormatException();
                        }
                      } else {
                        L3: {
                          L4: {
                            var9 = param1.charAt(var8);
                            if (var8 == 0) {
                              if (var9 != 45) {
                                if (var9 != 43) {
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                var4_int = 1;
                                break L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            L6: {
                              if (var9 < 48) {
                                break L6;
                              } else {
                                if (57 >= var9) {
                                  var9 -= 48;
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (var9 < 65) {
                                break L7;
                              } else {
                                if (var9 > 90) {
                                  break L7;
                                } else {
                                  var9 -= 55;
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              if (var9 < 97) {
                                break L8;
                              } else {
                                if (var9 <= 122) {
                                  var9 -= 87;
                                  break L5;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            throw new NumberFormatException();
                          }
                          if (param2 <= var9) {
                            throw new NumberFormatException();
                          } else {
                            L9: {
                              if (var4_int != 0) {
                                var9 = -var9;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var10 = var6 * param2 + var9;
                            if (var6 == var10 / param2) {
                              var6 = var10;
                              var5 = 1;
                              break L3;
                            } else {
                              throw new NumberFormatException();
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  }
                }
              }
              throw new IllegalArgumentException("" + param2);
            } else {
              stackOut_2_0 = -36;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("v.E(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L10;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L10;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ',' + param2 + ',' + true + ')');
        }
        return stackIn_40_0;
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        pe var6 = null;
        tk var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (((v) this).field_b >= 1) {
              this.a((byte) -6, param3);
              ((v) this).field_e = ((v) this).field_e - 1;
              L1: while (true) {
                if (0 <= ((v) this).field_e) {
                  var6_ref = new tk(param1, 1);
                  ((v) this).field_f.a(-858993458, param3, (gg) (Object) var6_ref);
                  ((v) this).field_c.a(-114, (ec) (Object) var6_ref);
                  ((pe) (Object) var6_ref).field_l = 0L;
                  break L0;
                } else {
                  var6 = (pe) (Object) ((v) this).field_c.a((byte) -115);
                  this.a(var6, (byte) 126);
                  continue L1;
                }
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6_ref2;
            stackOut_8_1 = new StringBuilder().append("v.B(").append(1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 127 + ',' + param3 + ')');
        }
    }

    private final void a(pe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              var3_int = -7 / ((68 - param1) / 53);
              if (param0 == null) {
                break L1;
              } else {
                param0.c(10);
                param0.a(97);
                ((v) this).field_e = ((v) this).field_e + param0.field_o;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("v.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        jd var2 = id.field_c;
        var2.e(4, -2147483648);
        var2.c(8, 1);
        var2.c(-126, 2);
    }

    private final void a(byte param0, long param1) {
        int var4 = 115;
        pe var5 = (pe) (Object) ((v) this).field_f.a(param1, -85);
        this.a(var5, (byte) -95);
    }

    final Object a(int param0, long param1) {
        tk var6 = null;
        pe var7 = (pe) (Object) ((v) this).field_f.a(param1, param0 ^ -90);
        if (var7 == null) {
            return null;
        }
        Object var5 = var7.h(31476);
        if (var5 == null) {
            var7.c(10);
            var7.a(97);
            ((v) this).field_e = ((v) this).field_e + var7.field_o;
            return null;
        }
        if (param0 != 0) {
            return null;
        }
        if (!var7.g(param0 ^ 113)) {
            ((v) this).field_c.a(-109, (ec) (Object) var7);
            var7.field_l = 0L;
        } else {
            var6 = new tk(var5, var7.field_o);
            ((v) this).field_f.a(-858993458, var7.field_g, (gg) (Object) var6);
            ((v) this).field_c.a(param0 + -110, (ec) (Object) var6);
            ((pe) (Object) var6).field_l = 0L;
            var7.c(10);
            var7.a(97);
        }
        return var5;
    }

    final static void a(int param0, String param1, o param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              qk.field_n = param1;
              va.field_g = param2;
              if (param0 == -98) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("v.G(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0, Object param1, long param2) {
        try {
            if (param0 < 67) {
                Object var6 = null;
                v.a(-25, (String) null, (o) null);
            }
            this.a(1, param1, 127, param2);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "v.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private v() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
