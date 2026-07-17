/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends hg {
    int field_g;
    static String field_l;
    static te field_k;
    static int field_h;
    int field_i;
    static boolean field_j;

    public static void d(int param0) {
        field_l = null;
        field_k = null;
    }

    final static void e(int param0) {
        if (mj.field_d != 0) {
          de.field_j = true;
          if (param0 == -46) {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            rl.e(-10);
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        } else {
          sj.a(8192, (byte) 51);
          de.field_j = true;
          if (param0 != -46) {
            rl.e(-10);
            if (20 <= mj.field_d) {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          } else {
            if (20 > mj.field_d) {
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            } else {
              de.field_j = false;
              if (mj.field_d < 1000) {
                mj.field_d = mj.field_d + 1;
                da.field_c.a((byte) -75);
                return;
              } else {
                da.field_c.a((byte) -75);
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, byte param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_24_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (param1 > 20) {
                        stackOut_44_0 = var5;
                        stackIn_45_0 = stackOut_44_0;
                        break L0;
                      } else {
                        stackOut_42_0 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        return stackIn_43_0 != 0;
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L4;
                          } else {
                            if (var9 == 45) {
                              var4_int = 1;
                              var8++;
                              break L3;
                            } else {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                if (!param2) {
                                  break L4;
                                } else {
                                  var8++;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 > 57) {
                                break L6;
                              } else {
                                var9 -= 48;
                                break L5;
                              }
                            }
                          }
                          L7: {
                            if (var9 < 65) {
                              break L7;
                            } else {
                              if (90 >= var9) {
                                var9 -= 55;
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (122 < var9) {
                                break L8;
                              } else {
                                var9 -= 87;
                                break L5;
                              }
                            }
                          }
                          stackOut_23_0 = 0;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0 != 0;
                        }
                        if (var9 >= param0) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          return stackIn_29_0 != 0;
                        } else {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = var6 * param0 + var9;
                          if (var10 / param0 == var6) {
                            var5 = 1;
                            var6 = var10;
                            break L3;
                          } else {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            return stackIn_35_0 != 0;
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
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_46_0 = (RuntimeException) var4;
            stackOut_46_1 = new StringBuilder().append("rl.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param3 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L10;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L10;
            }
          }
          throw t.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 41);
        }
        return stackIn_45_0 != 0;
    }

    private rl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Out of fuel!";
        field_j = false;
    }
}
