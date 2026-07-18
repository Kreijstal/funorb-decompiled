/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static float[] field_b;
    static int[][] field_d;
    static String[] field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        vb var10_ref_vb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param2) {
                  break L2;
                } else {
                  if (null == vs.field_e[param5].field_c) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var9_int = param5 + og.field_p[param5];
                if (vs.field_e[param5].field_h == 3) {
                  eq.a(20 + param0, true, (byte) 126, var9_int, param3, false, 40 + param4, param7);
                  break L3;
                } else {
                  break L3;
                }
              }
              rl.a(1, param5, param4, false, param0);
              var10_ref_vb = (vb) (Object) jf.field_C.field_pc.e((byte) 122);
              L4: while (true) {
                if (var10_ref_vb == null) {
                  L5: {
                    if (vs.field_e[param5].field_h != 3) {
                      break L5;
                    } else {
                      L6: {
                        stackOut_14_0 = param0 + 20;
                        stackOut_14_1 = 0;
                        stackOut_14_2 = 126;
                        stackOut_14_3 = var9_int;
                        stackOut_14_4 = param3;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_16_2 = stackOut_14_2;
                        stackIn_16_3 = stackOut_14_3;
                        stackIn_16_4 = stackOut_14_4;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        if (null == vs.field_e[param5].field_c) {
                          stackOut_16_0 = stackIn_16_0;
                          stackOut_16_1 = stackIn_16_1;
                          stackOut_16_2 = stackIn_16_2;
                          stackOut_16_3 = stackIn_16_3;
                          stackOut_16_4 = stackIn_16_4;
                          stackOut_16_5 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          stackIn_17_2 = stackOut_16_2;
                          stackIn_17_3 = stackOut_16_3;
                          stackIn_17_4 = stackOut_16_4;
                          stackIn_17_5 = stackOut_16_5;
                          break L6;
                        } else {
                          stackOut_15_0 = stackIn_15_0;
                          stackOut_15_1 = stackIn_15_1;
                          stackOut_15_2 = stackIn_15_2;
                          stackOut_15_3 = stackIn_15_3;
                          stackOut_15_4 = stackIn_15_4;
                          stackOut_15_5 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          stackIn_17_2 = stackOut_15_2;
                          stackIn_17_3 = stackOut_15_3;
                          stackIn_17_4 = stackOut_15_4;
                          stackIn_17_5 = stackOut_15_5;
                          break L6;
                        }
                      }
                      eq.a(stackIn_17_0, stackIn_17_1 != 0, (byte) stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5 != 0, 40 + param4, param7);
                      break L5;
                    }
                  }
                  L7: {
                    if (!vs.field_e[param5].c((byte) -79)) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          var10 = vs.field_e[param5].b((byte) -56);
                          var11 = 0;
                          if (param6 == 0) {
                            break L9;
                          } else {
                            if (vs.field_e[param5 + -1].b((byte) -55) == var10) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        var11 = var11 | 1;
                        break L8;
                      }
                      L10: {
                        L11: {
                          if (param8 == 0) {
                            break L11;
                          } else {
                            if (vs.field_e[param5 - ks.field_y].b((byte) -22) == var10) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        var11 = var11 | 2;
                        break L10;
                      }
                      L12: {
                        L13: {
                          if (-1 + ks.field_y == param6) {
                            break L13;
                          } else {
                            if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        var11 = var11 | 4;
                        break L12;
                      }
                      L14: {
                        L15: {
                          if (param8 == -1 + ef.field_c) {
                            break L15;
                          } else {
                            if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var11 = var11 | 8;
                        break L14;
                      }
                      dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                      break L7;
                    }
                  }
                  var10 = bv.field_w.b(31, param8, param6, -1);
                  if ((2 & var10) == 0) {
                    break L1;
                  } else {
                    nt.a(894, var9_int, ug.field_b, param4, param0);
                    return;
                  }
                } else {
                  L16: {
                    if (param5 != var10_ref_vb.field_x) {
                      break L16;
                    } else {
                      var10_ref_vb.a(ug.field_b, 31785, false);
                      break L16;
                    }
                  }
                  var10_ref_vb = (vb) (Object) jf.field_C.field_pc.a((byte) 123);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var9, "fs.D(" + param0 + ',' + false + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (hf.field_c) {
              if (param0 > 108) {
                L1: {
                  if (rs.field_t != 2) {
                    break L1;
                  } else {
                    if (null == wm.field_b) {
                      break L1;
                    } else {
                      var3 = (CharSequence) (Object) param1;
                      if (!wm.field_b.equals((Object) (Object) k.a(var3, false))) {
                        break L1;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("fs.F(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (!(0 <= kd.field_X)) {
            return -2;
        }
        if (~param2 < ~param4) {
            return -2;
        }
        if (param5 + param2 <= param4) {
            return -2;
        }
        if (~param3 < ~param0) {
            return -2;
        }
        if (param3 - -param6 <= param0) {
            return -2;
        }
        if (!(param0 - param3 >= 44)) {
            return -3;
        }
        if (!(~(-4 + (param6 + -40)) <= ~(-param3 + param0))) {
            return -3;
        }
        int var7 = param3 + (-dd.field_e + 44);
        int var8 = param2 - -(param5 >> 1);
        int var9 = (-var7 + param0) / 80 * 2;
        if (!(~param4 >= ~var8)) {
            var9++;
        }
        var9 = var9 + (od.field_c[kd.field_X] ? -1 : 0);
        if (var9 > -2) {
            if (~var9 > ~bc.field_j[kd.field_X].length) {
                return var9;
            }
        }
        return -3;
    }

    final static boolean a(boolean param0) {
        return wq.field_a == null ? ph.field_f : true;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        try {
            qj.field_z.field_I = param1;
            qj.field_z.field_X = param2;
            qj.field_z.field_N = param0;
            int var5_int = 112 % ((param3 - -51) / 39);
            qj.field_z.field_gb = qj.field_z.field_gb + rb.field_b.field_gb;
            rb.field_b.field_S = rb.field_b.field_S + rb.field_b.field_gb;
            rb.field_b.field_gb = param4;
            qj.field_z.field_gb = qj.field_z.field_gb - rb.field_b.field_gb;
            rb.field_b.field_S = rb.field_b.field_S - rb.field_b.field_gb;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "fs.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[16];
        field_a = "Show players in <%0>'s game";
    }
}
