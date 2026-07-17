/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj {
    static int field_b;
    static String field_a;
    gg field_d;
    private gg field_c;

    final gg c(byte param0) {
        gg var2 = ((oj) this).field_d.field_c;
        if (param0 >= -108) {
            return null;
        }
        if (var2 == ((oj) this).field_d) {
            return null;
        }
        var2.c(20);
        return var2;
    }

    final static void c(int param0) {
        if (param0 != -2290) {
            oj.a(false);
        }
        if (!(ob.field_b == null)) {
            ob.field_b.a(true);
            ob.field_b = null;
        }
    }

    final gg b(byte param0) {
        gg var2 = ((oj) this).field_c;
        if (!(var2 != ((oj) this).field_d)) {
            ((oj) this).field_c = null;
            return null;
        }
        ((oj) this).field_c = var2.field_g;
        int var3 = 68 / ((13 - param0) / 33);
        return var2;
    }

    final gg d(byte param0) {
        gg var2 = ((oj) this).field_d.field_g;
        if (var2 == ((oj) this).field_d) {
            return null;
        }
        if (param0 >= -7) {
            ((oj) this).field_d = null;
        }
        var2.c(20);
        return var2;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            ((oj) this).a((byte) -106);
        }
        return ((oj) this).field_d == ((oj) this).field_d.field_g ? true : false;
    }

    final static void a(pb param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        pb var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var28 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var19 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (ti.field_e > param2) {
                param6 = param6 - (-param2 + ti.field_e);
                param2 = ti.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param5 >= ti.field_f) {
                break L2;
              } else {
                param3 = param3 - (ti.field_f - param5);
                param5 = ti.field_f;
                break L2;
              }
            }
            L3: {
              if (ti.field_c >= param2 + param6) {
                break L3;
              } else {
                param6 = ti.field_c + -param2;
                break L3;
              }
            }
            L4: {
              if (ti.field_l >= param5 - -param3) {
                break L4;
              } else {
                param3 = ti.field_l - param5;
                break L4;
              }
            }
            L5: {
              if (param6 <= 0) {
                break L5;
              } else {
                if (param3 > 0) {
                  var21 = param0.a();
                  var32 = ti.field_a;
                  var10 = ti.field_i;
                  var11 = ti.field_b;
                  var30 = new int[4];
                  ti.a(var30);
                  param0.e();
                  ti.a(var30[0], var30[1], var30[2], var30[3]);
                  var13 = param2 + param5 * param0.field_v;
                  var14 = param0.field_v - param6;
                  var31 = var21.field_z;
                  var28 = var31;
                  var25 = var28;
                  var22 = var25;
                  var15 = var22;
                  var16 = param5;
                  L6: while (true) {
                    if (param3 - -param5 <= var16) {
                      var21.e(-param0.field_t, -param0.field_s);
                      ti.a(var32, var10, var11);
                      ti.b(var30);
                      break L0;
                    } else {
                      var17 = param2;
                      L7: while (true) {
                        if (var17 >= param2 + param6) {
                          var13 = var13 + var14;
                          var16++;
                          continue L6;
                        } else {
                          L8: {
                            var18 = var31[var13];
                            if (0 == var18) {
                              break L8;
                            } else {
                              L9: {
                                if (var17 <= 0) {
                                  break L9;
                                } else {
                                  if (var15[var13 + -1] == 0) {
                                    ti.e(var17, var16, param4, param1);
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (0 >= var16) {
                                  break L10;
                                } else {
                                  if (var15[var13 - param0.field_v] == 0) {
                                    ti.e(var17, var16, param4, param1);
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (param0.field_v + -1 <= var17) {
                                  break L11;
                                } else {
                                  if (0 == var15[var13 + 1]) {
                                    ti.e(var17, var16, param4, param1);
                                    break L8;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              if (var16 >= param0.field_y + -1) {
                                break L8;
                              } else {
                                if (var15[var13 - -param0.field_v] != 0) {
                                  break L8;
                                } else {
                                  ti.e(var17, var16, param4, param1);
                                  break L8;
                                }
                              }
                            }
                          }
                          var13++;
                          var17++;
                          continue L7;
                        }
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var8 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var8;
            stackOut_41_1 = new StringBuilder().append("oj.I(");
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
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + 1 + 41);
        }
    }

    final void a(int param0, gg param1) {
        try {
            if (param0 != -1) {
                field_b = -120;
            }
            if (param1.field_c != null) {
                param1.c(20);
            }
            param1.field_g = ((oj) this).field_d.field_g;
            param1.field_c = ((oj) this).field_d;
            param1.field_c.field_g = param1;
            param1.field_g.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "oj.J(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_a = null;
    }

    final void a(byte param0) {
        gg var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = stellarshard.field_B;
        L0: while (true) {
          var2 = ((oj) this).field_d.field_g;
          if (((oj) this).field_d != var2) {
            var2.c(20);
            continue L0;
          } else {
            L1: {
              if (param0 == -8) {
                break L1;
              } else {
                var4 = null;
                ((oj) this).a(95, (gg) null);
                break L1;
              }
            }
            ((oj) this).field_c = null;
            return;
          }
        }
    }

    public oj() {
        ((oj) this).field_d = new gg();
        ((oj) this).field_d.field_g = ((oj) this).field_d;
        ((oj) this).field_d.field_c = ((oj) this).field_d;
    }

    final void b(int param0, gg param1) {
        try {
            if (param0 >= -39) {
                ((oj) this).field_d = null;
            }
            if (!(null == param1.field_c)) {
                param1.c(20);
            }
            param1.field_c = ((oj) this).field_d.field_c;
            param1.field_g = ((oj) this).field_d;
            param1.field_c.field_g = param1;
            param1.field_g.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "oj.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final gg b(int param0) {
        gg var2 = ((oj) this).field_d.field_g;
        if (!(var2 != ((oj) this).field_d)) {
            ((oj) this).field_c = null;
            return null;
        }
        ((oj) this).field_c = var2.field_g;
        if (param0 > -74) {
            gg discarded$0 = ((oj) this).b((byte) -32);
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 20;
        field_a = "Log in";
    }
}
