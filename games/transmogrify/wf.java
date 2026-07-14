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
        if (param0) {
            field_a = true;
        }
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
        int var7 = 0;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var23 = Transmogrify.field_A ? 1 : 0;
          if (null != param0[3]) {
            stackOut_2_0 = param0[3].field_r;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (param0[5] != null) {
            stackOut_5_0 = param0[5].field_r;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          if (param0[1] != null) {
            stackOut_8_0 = param0[1].field_s;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 0;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var9 = stackIn_9_0;
          if (param0[param2] != null) {
            stackOut_11_0 = param0[7].field_s;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 0;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var10 = stackIn_12_0;
          var11 = param3 + param5;
          var12 = param1 + param6;
          var13 = param3 - -var7;
          var14 = var11 - var8;
          var15 = param6 - -var9;
          var16 = var12 - var10;
          var17 = var13;
          var18 = var14;
          if (var18 >= var17) {
            break L4;
          } else {
            var18 = param5 * var7 / (var7 - -var8) + param3;
            var17 = param5 * var7 / (var7 - -var8) + param3;
            break L4;
          }
        }
        L5: {
          var19 = var15;
          var20 = var16;
          sb.a(fi.field_t);
          if (var19 <= var20) {
            break L5;
          } else {
            var20 = param6 + param1 * var9 / (var10 + var9);
            var19 = param6 + param1 * var9 / (var10 + var9);
            break L5;
          }
        }
        L6: {
          if (null == param0[0]) {
            break L6;
          } else {
            sb.g(param3, param6, var17, var19);
            he.a(param0[0], param4, param3, (byte) 67, param6);
            sb.b(fi.field_t);
            break L6;
          }
        }
        L7: {
          if (null == param0[2]) {
            break L7;
          } else {
            sb.g(var18, param6, var11, var19);
            he.a(param0[2], param4, var14, (byte) 108, param6);
            sb.b(fi.field_t);
            break L7;
          }
        }
        L8: {
          if (null != param0[6]) {
            sb.g(param3, var20, var17, var12);
            he.a(param0[6], param4, param3, (byte) 56, var16);
            sb.b(fi.field_t);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (param0[8] != null) {
            sb.g(var18, var20, var11, var12);
            he.a(param0[8], param4, var14, (byte) 110, var16);
            sb.b(fi.field_t);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (null == param0[1]) {
            break L10;
          } else {
            if (0 == param0[1].field_r) {
              break L10;
            } else {
              sb.g(var17, param6, var18, var19);
              var21 = var13;
              L11: while (true) {
                L12: {
                  if (var14 <= var21) {
                    break L12;
                  } else {
                    he.a(param0[1], param4, var21, (byte) 84, param6);
                    var21 = var21 + param0[1].field_r;
                    if (0 == 0) {
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                sb.b(fi.field_t);
                break L10;
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
                L15: {
                  if (var14 <= var21) {
                    break L15;
                  } else {
                    he.a(param0[7], param4, var21, (byte) 109, var16);
                    var21 = var21 + param0[7].field_r;
                    if (0 == 0) {
                      continue L14;
                    } else {
                      break L15;
                    }
                  }
                }
                sb.b(fi.field_t);
                break L13;
              }
            } else {
              break L13;
            }
          }
        }
        L16: {
          if (null == param0[3]) {
            break L16;
          } else {
            if (param0[3].field_s == 0) {
              break L16;
            } else {
              sb.g(param3, var19, var17, var20);
              var21 = var15;
              L17: while (true) {
                L18: {
                  if (var21 >= var16) {
                    break L18;
                  } else {
                    he.a(param0[3], param4, param3, (byte) 77, var21);
                    var21 = var21 + param0[3].field_s;
                    if (0 == 0) {
                      continue L17;
                    } else {
                      break L18;
                    }
                  }
                }
                sb.b(fi.field_t);
                break L16;
              }
            }
          }
        }
        L19: {
          if (null == param0[5]) {
            break L19;
          } else {
            if (param0[5].field_s != 0) {
              sb.g(var18, var19, var11, var20);
              var21 = var15;
              L20: while (true) {
                L21: {
                  if (var21 >= var16) {
                    break L21;
                  } else {
                    he.a(param0[5], param4, var14, (byte) 82, var21);
                    var21 = var21 + param0[5].field_s;
                    if (0 == 0) {
                      continue L20;
                    } else {
                      break L21;
                    }
                  }
                }
                sb.b(fi.field_t);
                break L19;
              }
            } else {
              break L19;
            }
          }
        }
        L22: {
          if (null == param0[4]) {
            break L22;
          } else {
            if (-1 == (param0[4].field_r ^ -1)) {
              break L22;
            } else {
              if (param0[4].field_s != 0) {
                sb.g(var17, var19, var18, var20);
                var21 = var15;
                L23: while (true) {
                  L24: {
                    if (var21 >= var16) {
                      break L24;
                    } else {
                      var22 = var13;
                      L25: while (true) {
                        L26: {
                          if (var14 <= var22) {
                            break L26;
                          } else {
                            he.a(param0[4], param4, var22, (byte) 92, var21);
                            var22 = var22 + param0[4].field_r;
                            if (0 == 0) {
                              continue L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        var21 = var21 + param0[4].field_s;
                        if (0 == 0) {
                          continue L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                  }
                  sb.b(fi.field_t);
                  break L22;
                }
              } else {
                break L22;
              }
            }
          }
        }
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = Transmogrify.field_A ? 1 : 0;
          boolean discarded$12 = ci.field_f.a(be.field_x, lc.field_R, true, 4);
          if (param0 == -1) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        ci.field_f.l(0);
        L1: while (true) {
          if (!pc.b(param0 ^ -97)) {
            if ((sg.field_e ^ -1) != 0) {
              var1 = sg.field_e;
              ba.a(124, -1);
              return var1;
            } else {
              if (aa.field_g) {
                return 3;
              } else {
                if (db.field_a != of.field_d) {
                  if (dl.field_l.b(-26753)) {
                    if (of.field_d == rh.field_v) {
                      return 2;
                    } else {
                      return -1;
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            boolean discarded$13 = ci.field_f.a(param0 + -80, sg.field_n, ch.field_d);
            continue L1;
          }
        }
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
