/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nha {
    static ee field_a;
    static String field_d;
    static vr field_c;
    static String field_b;
    static gba field_e;

    final static void a(int param0, bga param1, byte param2) {
        pf var6 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var6 = sja.field_fb;
            pf var3 = var6;
            var6.c(param0, (byte) 110);
            var6.field_g = var6.field_g + 1;
            var4 = var6.field_g;
            var6.d(1, 0);
            if (param1.field_g != null) {
                var6.d(param1.field_g.length, 0);
                var6.a(0, -72, param1.field_g.length, param1.field_g);
            } else {
                var6.d(0, 0);
            }
            discarded$0 = var6.a(var4, 19);
            var6.field_g = var6.field_g - 4;
            if (param2 >= -22) {
                bga var5 = (bga) null;
                nha.a(-98, (bga) null, (byte) 0);
            }
            param1.field_i = var6.f(-76);
            var6.b((byte) 117, var6.field_g - var4);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "nha.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != -18307) {
            nha.a(91, -69, -16, true, -30, -112);
        }
        field_b = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param2 > ha.field_n) {
                break L1;
              } else {
                if (an.field_q <= param1) {
                  L2: {
                    if (param4 < eo.field_l) {
                      var6_int = 0;
                      param4 = eo.field_l;
                      break L2;
                    } else {
                      if (param4 <= pw.field_x) {
                        var6_int = 1;
                        break L2;
                      } else {
                        var6_int = 0;
                        param4 = pw.field_x;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (param5 < eo.field_l) {
                      param5 = eo.field_l;
                      var7 = 0;
                      break L3;
                    } else {
                      if (pw.field_x < param5) {
                        var7 = 0;
                        param5 = pw.field_x;
                        break L3;
                      } else {
                        var7 = 1;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param2 < an.field_q) {
                      param2 = an.field_q;
                      break L4;
                    } else {
                      incrementValue$2 = param2;
                      param2++;
                      hba.a(param0, param4, tj.field_b[incrementValue$2], 7, param5);
                      break L4;
                    }
                  }
                  L5: {
                    if (ha.field_n >= param1) {
                      incrementValue$3 = param1;
                      param1--;
                      hba.a(param0, param4, tj.field_b[incrementValue$3], 7, param5);
                      break L5;
                    } else {
                      param1 = ha.field_n;
                      break L5;
                    }
                  }
                  L6: {
                    if (var6_int == 0) {
                      break L6;
                    } else {
                      if (var7 == 0) {
                        break L6;
                      } else {
                        var8 = param2;
                        L7: while (true) {
                          if (var8 > param1) {
                            break L1;
                          } else {
                            var12 = tj.field_b[var8];
                            var11 = var12;
                            var9 = var11;
                            var12[param5] = param0;
                            var9[param4] = param0;
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  if (var6_int != 0) {
                    var8 = param2;
                    L8: while (true) {
                      if (param1 < var8) {
                        break L1;
                      } else {
                        tj.field_b[var8][param4] = param0;
                        var8++;
                        continue L8;
                      }
                    }
                  } else {
                    if (var7 == 0) {
                      break L1;
                    } else {
                      var8 = param2;
                      L9: while (true) {
                        if (var8 > param1) {
                          break L1;
                        } else {
                          tj.field_b[var8][param5] = param0;
                          var8++;
                          continue L9;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L10: {
              if (param3) {
                break L10;
              } else {
                field_b = (String) null;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "nha.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_b = "Menu";
        field_d = "Unable to delete friend - system busy";
    }
}
