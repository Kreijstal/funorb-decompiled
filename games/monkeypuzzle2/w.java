/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w {
    static cj field_c;
    static le[] field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        ki.field_s = param0;
        lc.field_e = param2;
        qj.field_D = param1;
        if (param3 != -21734) {
            Object var5 = null;
            w.a(-62, 77, (de) null);
        }
    }

    final static void a(int param0, int param1, de param2) {
        hb var3 = null;
        var3 = gf.field_c;
        var3.b(true, param1);
        if (param0 > -69) {
          field_b = null;
          var3.b(5, -49152);
          var3.b(0, -49152);
          var3.c(param2.field_k, 85);
          var3.b(param2.field_h, -49152);
          var3.b(param2.field_e, -49152);
          return;
        } else {
          var3.b(5, -49152);
          var3.b(0, -49152);
          var3.c(param2.field_k, 85);
          var3.b(param2.field_h, -49152);
          var3.b(param2.field_e, -49152);
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 >= -8) {
            field_b = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param6 <= param3) {
          return;
        } else {
          if (1 + param3 >= param2) {
            return;
          } else {
            if (param3 - -5 < param2) {
              if (param1 != param5) {
                L0: {
                  var7 = (param1 >> 1567357409) + ((param5 >> -1898454591) + (1 & (param1 & param5)));
                  var8 = param3;
                  var9 = param1;
                  var10 = param5;
                  var11 = param3;
                  if (param2 <= var11) {
                    break L0;
                  } else {
                    L1: {
                      var12 = hl.field_f[var11];
                      if (param4) {
                        stackOut_31_0 = gi.field_e[var12];
                        stackIn_32_0 = stackOut_31_0;
                        break L1;
                      } else {
                        stackOut_30_0 = cj.field_c[var12];
                        stackIn_32_0 = stackOut_30_0;
                        break L1;
                      }
                    }
                    L2: {
                      L3: {
                        var13 = stackIn_32_0;
                        if (var13 > var7) {
                          hl.field_f[var11] = hl.field_f[var8];
                          var8++;
                          hl.field_f[var8] = var12;
                          if (var9 <= var13) {
                            break L3;
                          } else {
                            var9 = var13;
                            break L2;
                          }
                        } else {
                          L4: {
                            if (var10 < var13) {
                              var10 = var13;
                              break L4;
                            } else {
                              var11++;
                              break L4;
                            }
                          }
                          var11++;
                          break L3;
                        }
                      }
                      var11++;
                      break L2;
                    }
                    var11++;
                    var11++;
                    break L0;
                  }
                }
                if (param0 >= -65) {
                  w.a(-28, 119);
                  w.a((byte) -80, param1, var8, param3, param4, var9, param6);
                  w.a((byte) -74, var10, param2, var8, param4, param5, param6);
                  return;
                } else {
                  w.a((byte) -80, param1, var8, param3, param4, var9, param6);
                  w.a((byte) -74, var10, param2, var8, param4, param5, param6);
                  return;
                }
              } else {
                L5: {
                  var7 = param2 + -1;
                  if (var7 <= param3) {
                    break L5;
                  } else {
                    L6: {
                      var8 = param3;
                      if (var7 <= var8) {
                        break L6;
                      } else {
                        L7: {
                          var9 = hl.field_f[var8];
                          var10 = hl.field_f[var8 - -1];
                          if (e.a(param4, var10, var9, (byte) 126)) {
                            hl.field_f[var8] = var10;
                            hl.field_f[var8 - -1] = var9;
                            break L7;
                          } else {
                            var8++;
                            break L7;
                          }
                        }
                        var8++;
                        var8++;
                        var8++;
                        break L6;
                      }
                    }
                    var7--;
                    break L5;
                  }
                }
                return;
              }
            } else {
              var7 = param2 + -1;
              L8: while (true) {
                if (var7 <= param3) {
                  return;
                } else {
                  var8 = param3;
                  L9: while (true) {
                    if (var7 <= var8) {
                      var7--;
                      continue L8;
                    } else {
                      var9 = hl.field_f[var8];
                      var10 = hl.field_f[var8 - -1];
                      if (e.a(param4, var10, var9, (byte) 126)) {
                        hl.field_f[var8] = var10;
                        hl.field_f[var8 - -1] = var9;
                        var8++;
                        var8++;
                        continue L9;
                      } else {
                        var8++;
                        var8++;
                        continue L9;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        if (param2 != -18694) {
          w.a(-3, 81, 26, 15);
          return rc.a(0, param0, 40, param1);
        } else {
          return rc.a(0, param0, 40, param1);
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          ol.field_e = param1;
          if (null != vl.field_h) {
            vl.field_h.a(ol.field_e * 80 / 256);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -1) {
          w.a((byte) -106, -49, -97, -73, false, 7, -74);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Checking";
    }
}
