/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(wq param0, wq param1, java.math.BigInteger param2, byte param3, java.math.BigInteger param4) {
        try {
            tm.a(param0, param1.field_l, (byte) 126, param2, 0, param1.field_k, param4);
            if (param3 != -72) {
                dq.a((byte) -97);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "dq.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 89) {
            return;
        }
        field_a = null;
    }

    final static int a(vl[] param0, boolean param1, wq param2, vl param3, kq param4, ga param5) {
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        on var9_ref_on = null;
        int var10 = 0;
        int var11 = 0;
        on var12 = null;
        int var13 = 0;
        java.math.BigInteger var14 = null;
        on var15 = null;
        cl var16 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              if (param0.length <= var6_int) {
                L2: {
                  if (param1) {
                    break L2;
                  } else {
                    var14 = (java.math.BigInteger) null;
                    dq.a((wq) null, (wq) null, (java.math.BigInteger) null, (byte) 57, (java.math.BigInteger) null);
                    break L2;
                  }
                }
                if (!param3.a(false)) {
                  throw new IllegalArgumentException();
                } else {
                  var6_int = param2.e(255);
                  if ((var6_int ^ -1) >= -6) {
                    L3: {
                      var7 = param2.e(255);
                      if (3 < var6_int) {
                        param4.field_p = var7 >>> 519373480;
                        var7 = var7 & 255;
                        break L3;
                      } else {
                        param4.field_p = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (3 > var6_int) {
                        var8 = param2.e(255);
                        var9 = 0;
                        L5: while (true) {
                          if (var8 <= var9) {
                            var9_ref_on = (on) ((Object) param0[0].d(-54));
                            L6: while (true) {
                              if (var9_ref_on == null) {
                                break L4;
                              } else {
                                L7: {
                                  if (-1 == (var9_ref_on.field_N & 4 ^ -1)) {
                                    break L7;
                                  } else {
                                    param0[1].a(var9_ref_on, (byte) 3);
                                    break L7;
                                  }
                                }
                                var9_ref_on = (on) ((Object) param0[0].a((byte) 116));
                                continue L6;
                              }
                            }
                          } else {
                            L8: {
                              var15 = new on();
                              if (-1 != (var6_int ^ -1)) {
                                if (-1 <= (var6_int ^ -1)) {
                                  break L8;
                                } else {
                                  var15.a(101, param2);
                                  break L8;
                                }
                              } else {
                                var15.field_j = param2.e(255);
                                var15.field_m = param2.e(255);
                                var15.field_k = param2.e(255);
                                var15.field_o = param2.e(255);
                                var15.field_i = param2.e(255);
                                var15.field_N = param2.e(255);
                                break L8;
                              }
                            }
                            param0[0].a(var15, (byte) 3);
                            var9++;
                            continue L5;
                          }
                        }
                      } else {
                        L9: {
                          if ((1 & var7) != 0) {
                            stackIn_21_0 = 0;
                            break L9;
                          } else {
                            stackIn_21_0 = 1;
                            break L9;
                          }
                        }
                        L10: {
                          var8 = stackIn_21_0;
                          if (var8 != 0) {
                            stackIn_24_0 = 15;
                            break L10;
                          } else {
                            stackIn_24_0 = 9;
                            break L10;
                          }
                        }
                        kj.a(stackIn_24_0, param0[2], 16);
                        var9 = 0;
                        L11: while (true) {
                          if (param0.length <= var9) {
                            break L4;
                          } else {
                            var10 = param2.e(255);
                            var11 = 0;
                            L12: while (true) {
                              if (var10 <= var11) {
                                var9++;
                                continue L11;
                              } else {
                                var12 = new on();
                                var12.a(91, param2);
                                param0[var9].a(var12, (byte) 3);
                                var11++;
                                continue L12;
                              }
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (var6_int > 1) {
                        var8 = param2.e(255);
                        var9 = 0;
                        L14: while (true) {
                          if (var8 <= var9) {
                            break L13;
                          } else {
                            var16 = new cl();
                            var16.a(90, param2);
                            param3.a(var16, (byte) 3);
                            var9++;
                            continue L14;
                          }
                        }
                      } else {
                        break L13;
                      }
                    }
                    L15: {
                      if ((var6_int ^ -1) < -5) {
                        param2.a((byte) 24);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    stackIn_55_0 = var7;
                    break L0;
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              } else {
                if (!param0[var6_int].a(false)) {
                  throw new IllegalArgumentException();
                } else {
                  var6_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var6);

            stackIn_58_1 = new StringBuilder().append("dq.A(");

            if (param0 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L16;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L16;
            }
          }
          L17: {


            stackIn_61_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L17;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param3 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L18;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param4 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param5 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_59_0), stackIn_71_2 + ')');
        }
        return stackIn_55_0;
    }

    static {
        field_c = "You are on <%0>";
        field_b = 0;
    }
}
