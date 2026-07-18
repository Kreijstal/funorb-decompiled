/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wf {
    wf field_f;
    static boolean field_a;
    long field_c;
    wf field_b;
    static mi field_d;
    static String field_e;

    public static void a(boolean param0) {
        field_d = null;
        field_e = null;
    }

    final void c(int param0) {
        if (((wf) this).field_f == null) {
          return;
        } else {
          if (param0 != 5) {
            return;
          } else {
            ((wf) this).field_f.field_b = ((wf) this).field_b;
            ((wf) this).field_b.field_f = ((wf) this).field_f;
            ((wf) this).field_f = null;
            ((wf) this).field_b = null;
            return;
          }
        }
    }

    final static void a(ti[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var23 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param0[3]) {
                stackOut_3_0 = param0[3].field_r;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7_int = stackIn_4_0;
              if (param0[5] != null) {
                stackOut_6_0 = param0[5].field_r;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (param0[1] != null) {
                stackOut_9_0 = param0[1].field_s;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param0[param2] != null) {
                stackOut_12_0 = param0[7].field_s;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = 0;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              var11 = param3 + 361;
              var12 = param1 + param6;
              var13 = param3 - -var7_int;
              var14 = var11 - var8;
              var15 = param6 - -var9;
              var16 = var12 - var10;
              var17 = var13;
              var18 = var14;
              if (var18 >= var17) {
                break L5;
              } else {
                var18 = 361 * var7_int / (var7_int - -var8) + param3;
                var17 = 361 * var7_int / (var7_int - -var8) + param3;
                break L5;
              }
            }
            L6: {
              var19 = var15;
              var20 = var16;
              sb.a(fi.field_t);
              if (var19 <= var20) {
                break L6;
              } else {
                var20 = param6 + param1 * var9 / (var10 + var9);
                var19 = param6 + param1 * var9 / (var10 + var9);
                break L6;
              }
            }
            L7: {
              if (null == param0[0]) {
                break L7;
              } else {
                sb.g(param3, param6, var17, var19);
                he.a(param0[0], param4, param3, (byte) 67, param6);
                sb.b(fi.field_t);
                break L7;
              }
            }
            L8: {
              if (null == param0[2]) {
                break L8;
              } else {
                sb.g(var18, param6, var11, var19);
                he.a(param0[2], param4, var14, (byte) 108, param6);
                sb.b(fi.field_t);
                break L8;
              }
            }
            L9: {
              if (null != param0[6]) {
                sb.g(param3, var20, var17, var12);
                he.a(param0[6], param4, param3, (byte) 56, var16);
                sb.b(fi.field_t);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (param0[8] != null) {
                sb.g(var18, var20, var11, var12);
                he.a(param0[8], param4, var14, (byte) 110, var16);
                sb.b(fi.field_t);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (null == param0[1]) {
                break L11;
              } else {
                if (0 == param0[1].field_r) {
                  break L11;
                } else {
                  sb.g(var17, param6, var18, var19);
                  var21 = var13;
                  L12: while (true) {
                    if (var14 <= var21) {
                      sb.b(fi.field_t);
                      break L11;
                    } else {
                      he.a(param0[1], param4, var21, (byte) 84, param6);
                      var21 = var21 + param0[1].field_r;
                      continue L12;
                    }
                  }
                }
              }
            }
            L13: {
              if (null == param0[7]) {
                break L13;
              } else {
                if (param0[7].field_r != 0) {
                  sb.g(var17, var20, var18, var12);
                  var21 = var13;
                  L14: while (true) {
                    if (var14 <= var21) {
                      sb.b(fi.field_t);
                      break L13;
                    } else {
                      he.a(param0[7], param4, var21, (byte) 109, var16);
                      var21 = var21 + param0[7].field_r;
                      continue L14;
                    }
                  }
                } else {
                  break L13;
                }
              }
            }
            L15: {
              if (null == param0[3]) {
                break L15;
              } else {
                if (param0[3].field_s == 0) {
                  break L15;
                } else {
                  sb.g(param3, var19, var17, var20);
                  var21 = var15;
                  L16: while (true) {
                    if (var21 >= var16) {
                      sb.b(fi.field_t);
                      break L15;
                    } else {
                      he.a(param0[3], param4, param3, (byte) 77, var21);
                      var21 = var21 + param0[3].field_s;
                      continue L16;
                    }
                  }
                }
              }
            }
            L17: {
              if (null == param0[5]) {
                break L17;
              } else {
                if (param0[5].field_s != 0) {
                  sb.g(var18, var19, var11, var20);
                  var21 = var15;
                  L18: while (true) {
                    if (var21 >= var16) {
                      sb.b(fi.field_t);
                      break L17;
                    } else {
                      he.a(param0[5], param4, var14, (byte) 82, var21);
                      var21 = var21 + param0[5].field_s;
                      continue L18;
                    }
                  }
                } else {
                  break L17;
                }
              }
            }
            L19: {
              if (null == param0[4]) {
                break L19;
              } else {
                if (param0[4].field_r == 0) {
                  break L19;
                } else {
                  if (param0[4].field_s != 0) {
                    sb.g(var17, var19, var18, var20);
                    var21 = var15;
                    L20: while (true) {
                      if (var21 >= var16) {
                        sb.b(fi.field_t);
                        break L19;
                      } else {
                        var22 = var13;
                        L21: while (true) {
                          if (var14 <= var22) {
                            var21 = var21 + param0[4].field_s;
                            continue L20;
                          } else {
                            he.a(param0[4], param4, var22, (byte) 92, var21);
                            var22 = var22 + param0[4].field_r;
                            continue L21;
                          }
                        }
                      }
                    }
                  } else {
                    break L19;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var7 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var7;
            stackOut_65_1 = new StringBuilder().append("wf.AC(");
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param0 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L22;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L22;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_68_0, stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + 361 + ',' + param6 + ')');
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = ci.field_f.a(be.field_x, lc.field_R, true, 4);
            ci.field_f.l(0);
            L1: while (true) {
              if (!pc.b(96)) {
                if (sg.field_e != -1) {
                  var1_int = sg.field_e;
                  ba.a(124, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (aa.field_g) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (db.field_a != of.field_d) {
                      if (dl.field_l.b(-26753)) {
                        if (of.field_d != rh.field_v) {
                          stackOut_21_0 = -1;
                          stackIn_22_0 = stackOut_21_0;
                          break L0;
                        } else {
                          stackOut_19_0 = 2;
                          stackIn_20_0 = stackOut_19_0;
                          return stackIn_20_0;
                        }
                      } else {
                        stackOut_16_0 = 1;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0;
                    }
                  }
                }
              } else {
                boolean discarded$13 = ci.field_f.a(-81, sg.field_n, ch.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1, "wf.VB(" + -1 + ')');
        }
        return stackIn_22_0;
    }

    final boolean b(int param0) {
        if (null == ((wf) this).field_f) {
            return false;
        }
        if (param0 != 8) {
            boolean discarded$0 = ((wf) this).b(29);
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Resume Game";
    }
}
