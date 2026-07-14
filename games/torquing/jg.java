/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends am {
    static String field_v;
    private int field_s;
    static String field_u;
    static String field_w;
    static t field_t;
    private int field_x;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var15 = 0;
        int[] var21 = null;
        int var17 = Torquing.field_u;
        int var11 = ln.a(qk.field_p, j.field_q, param4, 113);
        int var12 = ln.a(qk.field_p, j.field_q, param6, 69);
        int var13 = ln.a(qg.field_z, kn.field_e, param5, 96);
        int var14 = ln.a(qg.field_z, kn.field_e, param1, 113);
        int var7 = ln.a(qk.field_p, j.field_q, param3 + param4, 99);
        int var8 = ln.a(qk.field_p, j.field_q, -param3 + param6, 71);
        for (var15 = var11; var7 > var15; var15++) {
            di.a(var13, (byte) -92, param0, qd.field_a[var15], var14);
        }
        for (var15 = var12; var8 < var15; var15--) {
            di.a(var13, (byte) 90, param0, qd.field_a[var15], var14);
        }
        int var9 = ln.a(qg.field_z, kn.field_e, param5 + param3, 75);
        int var10 = ln.a(qg.field_z, kn.field_e, -param3 + param1, 119);
        for (var15 = var7; var15 <= var8; var15++) {
            var21 = qd.field_a[var15];
            di.a(var13, (byte) -118, param0, var21, var9);
            di.a(var10, (byte) 4, param0, var21, var14);
        }
        if (param2 >= -108) {
            field_u = null;
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            ((jg) this).field_s = 60;
            break L0;
          }
        }
        L1: {
          var8 = ((jg) this).field_l.a(param1, 25657);
          var3 = var8;
          if (((jg) this).field_l.field_b) {
            var4 = ((jg) this).b(0, 0, param1);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  L4: {
                    var6 = var4[var5];
                    stackOut_6_0 = (int[]) var8;
                    stackOut_6_1 = var5;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (((jg) this).field_s > var6) {
                      break L4;
                    } else {
                      stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var6 <= ((jg) this).field_x) {
                        stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 4096;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L3;
                      } else {
                        stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L4;
                      }
                    }
                  }
                  stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                var5++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var8;
    }

    public static void g(byte param0) {
        field_v = null;
        field_w = null;
        field_t = null;
        if (param0 < 68) {
            jg.a(124, 87, (byte) 71, 65, 68, 33, -72);
        }
        field_u = null;
    }

    final static String a(boolean param0) {
        if (!param0) {
            return null;
        }
        if (!(null != re.field_e)) {
            return "";
        }
        return re.field_e;
    }

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Torquing.field_u;
          var4 = param2;
          if (0 != var4) {
            if (-2 != (var4 ^ -1)) {
              break L0;
            } else {
              ((jg) this).field_x = param0.i(7088);
              break L0;
            }
          } else {
            ((jg) this).field_s = param0.i(7088);
            break L0;
          }
        }
        L1: {
          if (param1 == 35) {
            break L1;
          } else {
            jg.a(57, -27, (byte) 70, -55, -8, -83, -31);
            break L1;
          }
        }
    }

    public jg() {
        super(1, true);
        ((jg) this).field_s = 0;
        ((jg) this).field_x = 4096;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = Torquing.field_u;
        if (param4 < param0) {
          if (param4 + 1 >= param6) {
            return;
          } else {
            L0: {
              if (param4 - -5 >= param6) {
                break L0;
              } else {
                if (param3 != param5) {
                  var7 = (1 & (param3 & param5)) + ((param3 >> 1653788577) + (param5 >> 315164833));
                  var8 = param4;
                  if (param1 <= -27) {
                    var9 = param3;
                    var10 = param5;
                    var11 = param4;
                    L1: while (true) {
                      if (var11 >= param6) {
                        jg.a(param0, -101, param2, param3, param4, var9, var8);
                        jg.a(param0, -29, param2, var10, var8, param5, param6);
                        return;
                      } else {
                        L2: {
                          var12 = lp.field_g[var11];
                          if (param2) {
                            stackOut_22_0 = il.field_o[var12];
                            stackIn_23_0 = stackOut_22_0;
                            break L2;
                          } else {
                            stackOut_21_0 = ji.field_a[var12];
                            stackIn_23_0 = stackOut_21_0;
                            break L2;
                          }
                        }
                        var13 = stackIn_23_0;
                        if (var13 <= var7) {
                          if (var10 < var13) {
                            var10 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        } else {
                          lp.field_g[var11] = lp.field_g[var8];
                          var8++;
                          lp.field_g[var8] = var12;
                          if (var9 > var13) {
                            var9 = var13;
                            var11++;
                            continue L1;
                          } else {
                            var11++;
                            continue L1;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
            var7 = -1 + param6;
            L3: while (true) {
              if (var7 <= param4) {
                return;
              } else {
                var8 = param4;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = lp.field_g[var8];
                    var10 = lp.field_g[1 + var8];
                    if (vc.a(param2, var10, 0, var9)) {
                      lp.field_g[var8] = var10;
                      lp.field_g[var8 + 1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Connection lost. <%0>";
        field_u = "This password contains repeated characters, and would be easy to guess";
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
