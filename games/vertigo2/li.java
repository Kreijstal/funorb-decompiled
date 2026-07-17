/*
 * Decompiled by CFR-JS 0.4.0.
 */
class li {
    long field_k;
    li field_a;
    static int[] field_g;
    li field_c;
    static ej field_j;
    static int field_f;
    static co field_e;
    static String field_h;
    static String field_b;
    static fe[] field_i;
    static int field_d;
    static er field_m;
    static int[] field_l;

    public static void d(int param0) {
        field_e = null;
        field_h = null;
        field_i = null;
        field_b = null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_m = null;
        if (param0 != 55) {
            li.d(-58);
        }
    }

    final static ve a(int param0, int param1) {
        ve[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ve[] var5 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        var5 = k.a(-15922);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_e == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final boolean b(int param0) {
        if (param0 < 76) {
            ((li) this).field_a = null;
        }
        if (((li) this).field_a != null) {
            return true;
        }
        return false;
    }

    final static int a(int param0, boolean param1, CharSequence param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
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
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (36 < param0) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
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
                          var9 = param2.charAt(var8);
                          if (var8 == 0) {
                            if (var9 == 45) {
                              var4_int = 1;
                              break L3;
                            } else {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                L5: {
                                  if (param1) {
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                var8++;
                                continue L2;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          L7: {
                            if (48 > var9) {
                              break L7;
                            } else {
                              if (var9 > 57) {
                                break L7;
                              } else {
                                var9 -= 48;
                                break L6;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param0 > var9) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = param0 * var6 - -var9;
                          if (var6 != var10 / param0) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var4;
            stackOut_41_1 = new StringBuilder().append("li.RB(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + 1 + 41);
        }
        return stackIn_40_0;
    }

    final void c(int param0) {
        if (param0 != 2) {
            li.a(true, -15);
        }
        if (null == ((li) this).field_a) {
            return;
        }
        ((li) this).field_a.field_c = ((li) this).field_c;
        ((li) this).field_c.field_a = ((li) this).field_a;
        ((li) this).field_a = null;
        ((li) this).field_c = null;
    }

    final static void a(boolean param0, int param1) {
        ap.field_g = pn.field_Q[param1];
        eb.field_a = f.field_I[param1];
        bq.field_A = Vertigo2.field_H[param1];
        if (!param0) {
            field_d = 61;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new ej("email");
        field_b = "Your rating is <%0>";
        field_d = 0;
        field_f = 12;
        field_l = new int[256];
    }
}
