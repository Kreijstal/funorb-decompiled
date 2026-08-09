/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fs {
    static float[] field_b;
    static int[][] field_d;
    static String[] field_c;
    static String field_a;

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_20_0;
        int stackIn_20_1;
        int stackIn_20_2;
        int stackIn_20_3;
        int stackIn_20_4;
        int stackIn_21_0;
        int stackIn_21_1;
        int stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        vb var10_ref_vb = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param2) {
                  break L3;
                } else {
                  if (null == vs.field_e[param5].field_c) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var9_int = param5 + og.field_p[param5];
                if ((vs.field_e[param5].field_h ^ -1) == -4) {
                  eq.a(20 + param0, true, (byte) 126, var9_int, param3, false, 40 + param4, param7);
                  break L4;
                } else {
                  break L4;
                }
              }
              rl.a(1, param5, param4, false, param0);
              var10_ref_vb = (vb) ((Object) jf.field_C.field_pc.e((byte) 122));
              L5: while (true) {
                if (var10_ref_vb == null) {
                  L6: {
                    if (-4 != (vs.field_e[param5].field_h ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        stackIn_20_0 = param0 + 20;

                        stackIn_20_1 = 0;

                        stackIn_20_2 = 126;

                        stackIn_20_3 = var9_int;

                        stackIn_20_4 = param3;

                        if (null == vs.field_e[param5].field_c) {
                          stackIn_21_0 = stackIn_20_0;
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = stackIn_20_2;
                          stackIn_21_3 = stackIn_20_3;
                          stackIn_21_4 = stackIn_20_4;
                          stackIn_21_5 = 0;
                          break L7;
                        } else {
                          stackIn_21_0 = stackIn_20_0;
                          stackIn_21_1 = stackIn_20_1;
                          stackIn_21_2 = stackIn_20_2;
                          stackIn_21_3 = stackIn_20_3;
                          stackIn_21_4 = stackIn_20_4;
                          stackIn_21_5 = 1;
                          break L7;
                        }
                      }
                      eq.a(stackIn_21_0, stackIn_21_1 != 0, (byte) stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5 != 0, 40 + param4, param7);
                      break L6;
                    }
                  }
                  L8: {
                    if (!vs.field_e[param5].c((byte) -79)) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          var10 = vs.field_e[param5].b((byte) -56);
                          var11 = 0;
                          if (param6 == 0) {
                            break L10;
                          } else {
                            if (vs.field_e[param5 + -1].b((byte) -55) == var10) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var11 = var11 | 1;
                        break L9;
                      }
                      L11: {
                        L12: {
                          if (param8 == 0) {
                            break L12;
                          } else {
                            if (vs.field_e[param5 - ks.field_y].b((byte) -22) == var10) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var11 = var11 | 2;
                        break L11;
                      }
                      L13: {
                        L14: {
                          if (-1 + ks.field_y == param6) {
                            break L14;
                          } else {
                            if (var10 == vs.field_e[param5 + 1].b((byte) -90)) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var11 = var11 | 4;
                        break L13;
                      }
                      L15: {
                        L16: {
                          if (param8 == -1 + ef.field_c) {
                            break L16;
                          } else {
                            if (var10 == vs.field_e[param5 - -ks.field_y].b((byte) -75)) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        var11 = var11 | 8;
                        break L15;
                      }
                      dm.a(var10, false, param0 - -20, param4 + 40, var11, false);
                      break L8;
                    }
                  }
                  var10 = bv.field_w.b(31, param8, param6, -1);
                  if (-1 == (2 & var10 ^ -1)) {
                    break L2;
                  } else {
                    nt.a(894, var9_int, ug.field_b, param4, param0);
                    return;
                  }
                } else {
                  L17: {
                    if ((param5 ^ -1) != (var10_ref_vb.field_x ^ -1)) {
                      break L17;
                    } else {
                      var10_ref_vb.a(ug.field_b, 31785, false);
                      break L17;
                    }
                  }
                  var10_ref_vb = (vb) ((Object) jf.field_C.field_pc.a((byte) 123));
                  continue L5;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var9), "fs.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hf.field_c) {
              if (param0 > 108) {
                L1: {
                  if (-3 != (rs.field_t ^ -1)) {
                    break L1;
                  } else {
                    if (null == wm.field_b) {
                      break L1;
                    } else {
                      var3 = (CharSequence) ((Object) param1);
                      if (!wm.field_b.equals(k.a(var3, false))) {
                        break L1;
                      } else {
                        return true;
                      }
                    }
                  }
                }
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("fs.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        if (!(0 <= kd.field_X)) {
            return -2;
        }
        if (param2 > param4) {
            return -2;
        }
        if (param5 + param2 <= param4) {
            return -2;
        }
        if (param3 > param0) {
            return -2;
        }
        if (param3 - -param6 <= param0) {
            return -2;
        }
        if (!(-45 >= (param0 - param3 ^ -1))) {
            return -3;
        }
        if (param1 != 24340) {
            String var10 = (String) null;
            fs.a(-51, (String) null, (String) null, 30, 0);
            if (!(-4 + (param6 + -40) >= -param3 + param0)) {
                return -3;
            }
            var7 = param3 + (-dd.field_e + 44);
            var8 = param2 - -(param5 >> 82817409);
            var9 = (-var7 + param0) / 80 * 2;
            if (!(param4 <= var8)) {
                var9++;
            }
            var9 = var9 + (od.field_c[kd.field_X] ? -1 : 0);
            if (1 > (var9 ^ -1) && var9 < bc.field_j[kd.field_X].length) {
                return var9;
            }
            return -3;
        }
        if (!(-4 + (param6 + -40) >= -param3 + param0)) {
            return -3;
        }
        var7 = param3 + (-dd.field_e + 44);
        var8 = param2 - -(param5 >> 82817409);
        var9 = (-var7 + param0) / 80 * 2;
        if (!(param4 <= var8)) {
            var9++;
        }
        var9 = var9 + (od.field_c[kd.field_X] ? -1 : 0);
        if (1 > (var9 ^ -1) && var9 < bc.field_j[kd.field_X].length) {
            return var9;
        }
        return -3;
    }

    final static boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0) {
          L0: {
            fs.a(15, false, true, 64, -122, 113, -41, -38, 58);
            if (wq.field_a != null) {
              stackIn_8_0 = 1;
              break L0;
            } else {
              stackIn_8_0 = ph.field_f ? 1 : 0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (wq.field_a != null) {
              stackIn_4_0 = 1;
              break L1;
            } else {
              stackIn_4_0 = ph.field_f ? 1 : 0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        String var2;
        field_a = null;
        if (param0 != -1) {
          var2 = (String) null;
          fs.a(-83, (String) null, (String) null, 92, 123);
          field_b = null;
          field_c = null;
          field_d = (int[][]) null;
          return;
        } else {
          field_b = null;
          field_c = null;
          field_d = (int[][]) null;
          return;
        }
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
            throw ig.a((Throwable) ((Object) runtimeException), "fs.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = new String[16];
        field_a = "Show players in <%0>'s game";
    }
}
