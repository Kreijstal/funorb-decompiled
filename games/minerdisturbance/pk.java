/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk {
    static vm field_b;
    static ea field_d;
    static java.awt.Image field_a;
    static int field_i;
    static int[] field_f;
    static ea field_c;
    static ea[] field_h;
    static bj field_g;
    static volatile long field_e;

    final static void a(int param0, ea[] param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 < param5) {
                  L2: {
                    var6_int = param1[0].field_x;
                    var7 = param1[2].field_x;
                    if (!param3) {
                      break L2;
                    } else {
                      field_b = (vm) null;
                      break L2;
                    }
                  }
                  var8 = param1[1].field_x;
                  param1[0].b(param0, param4, param2);
                  param1[2].b(-var7 + (param5 + param0), param4, param2);
                  eh.b(en.field_b);
                  eh.f(var6_int + param0, param4, param0 + (param5 - var7), param1[1].field_A + param4);
                  var9 = var6_int + param0;
                  var10 = -var7 + (param5 + param0);
                  param0 = var9;
                  L3: while (true) {
                    if (var10 <= param0) {
                      eh.a(en.field_b);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      param1[1].b(param0, param4, param2);
                      param0 = param0 + var8;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("pk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -77) {
          return;
        } else {
          field_a = null;
          field_c = null;
          field_f = null;
          field_g = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static ih a(int param0, bj param1, byte param2, int param3, bj param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        ih stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (cn.a(param0, 258, param3, param1)) {
              L1: {
                if (param2 >= 30) {
                  break L1;
                } else {
                  field_g = (bj) null;
                  break L1;
                }
              }
              stackIn_6_0 = ge.a(param4.a(false, param3, param0), -569);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("pk.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ih) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    final static java.awt.Frame a(byte param0, int param1, int param2, int param3, vf param4, int param5) {
        Object stackIn_24_0 = null;
        Object stackIn_34_0 = null;
        java.awt.Frame stackIn_36_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        vk[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        vk[] var10 = null;
        ia var11 = null;
        var9 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param4.b((byte) 73)) {
              L1: {
                if (param1 == 0) {
                  var10 = gn.a(-591, param4);
                  var6 = var10;
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackIn_24_0 = null;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      } else {
                        L3: {
                          if (var10[var8].field_f != param2) {
                            break L3;
                          } else {
                            if (var10[var8].field_c != param3) {
                              break L3;
                            } else {
                              L4: {
                                if (param5 == 0) {
                                  break L4;
                                } else {
                                  if (param5 == var10[var8].field_b) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (var10[var8].field_h <= param1) {
                                    break L3;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              param1 = var10[var8].field_h;
                              var7_int = 1;
                              break L3;
                            }
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param4.a(param1, param5, param2, param3, (byte) -122);
              L6: while (true) {
                if (0 != var11.field_c) {
                  var7 = (java.awt.Frame) (var11.field_a);
                  if (var7 != null) {
                    if (var11.field_c == 2) {
                      tf.a((byte) 108, param4, var7);
                      stackIn_34_0 = null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var8 = -69 % ((-42 - param0) / 41);
                      stackIn_36_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  gf.a(10L, -10309);
                  continue L6;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var6_ref);

            stackIn_39_1 = new StringBuilder().append("pk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_24_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_34_0);
          } else {
            return stackIn_36_0;
          }
        }
    }

    final static void b(int param0) {
        if (param0 < 102) {
            field_c = (ea) null;
        }
    }

    static {
        field_f = new int[8192];
        field_e = 0L;
    }
}
