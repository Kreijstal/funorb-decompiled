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
        if (this.field_f == null) {
          return;
        } else {
          if (param0 != 5) {
            return;
          } else {
            this.field_f.field_b = this.field_b;
            this.field_b.field_f = this.field_f;
            this.field_f = null;
            this.field_b = null;
            return;
          }
        }
    }

    final static void a(ti[] param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
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
        var23 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param0[3]) {
                stackIn_4_0 = param0[3].field_r;
                break L1;
              } else {
                stackIn_4_0 = 0;
                break L1;
              }
            }
            L2: {
              var7_int = stackIn_4_0;
              if (param0[5] != null) {
                stackIn_7_0 = param0[5].field_r;
                break L2;
              } else {
                stackIn_7_0 = 0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (param0[1] != null) {
                stackIn_10_0 = param0[1].field_s;
                break L3;
              } else {
                stackIn_10_0 = 0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (param0[param2] != null) {
                stackIn_13_0 = param0[7].field_s;
                break L4;
              } else {
                stackIn_13_0 = 0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              var11 = param3 + param5;
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
                var18 = param5 * var7_int / (var7_int - -var8) + param3;
                var17 = param5 * var7_int / (var7_int - -var8) + param3;
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
              L20: {
                if (null == param0[4]) {
                  break L20;
                } else {
                  if (-1 == (param0[4].field_r ^ -1)) {
                    break L20;
                  } else {
                    if (param0[4].field_s != 0) {
                      sb.g(var17, var19, var18, var20);
                      var21 = var15;
                      L21: while (true) {
                        if (var21 >= var16) {
                          sb.b(fi.field_t);
                          break L20;
                        } else {
                          var22 = var13;
                          L22: while (true) {
                            if (var14 <= var22) {
                              var21 = var21 + param0[4].field_s;
                              continue L21;
                            } else {
                              he.a(param0[4], param4, var22, (byte) 92, var21);
                              var22 = var22 + param0[4].field_r;
                              continue L22;
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
              break L19;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("wf.AC(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L23;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L23;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              ci.field_f.a(be.field_x, lc.field_R, true, 4);
              if (param0 == -1) {
                break L1;
              } else {
                field_d = (mi) null;
                break L1;
              }
            }
            ci.field_f.l(0);
            L2: while (true) {
              if (!pc.b(param0 ^ -97)) {
                if ((sg.field_e ^ -1) != 0) {
                  var1_int = sg.field_e;
                  ba.a(124, -1);
                  stackIn_9_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (aa.field_g) {
                    stackIn_13_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (db.field_a != of.field_d) {
                      if (dl.field_l.b(-26753)) {
                        if (of.field_d != rh.field_v) {
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                ci.field_f.a(param0 + -80, sg.field_n, ch.field_d);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "wf.VB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_16_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_24_0;
                }
              }
            }
          }
        }
    }

    final boolean b(int param0) {
        if (null == this.field_f) {
            return false;
        }
        if (param0 != 8) {
            this.b(29);
            return true;
        }
        return true;
    }

    static {
        field_e = "Resume Game";
    }
}
