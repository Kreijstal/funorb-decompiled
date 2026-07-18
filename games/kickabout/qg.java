/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends gn {
    int field_j;
    int field_g;
    int field_e;
    int field_l;
    int field_f;
    int[] field_h;
    static int field_k;
    int field_i;

    final void a(byte param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7) {
        try {
            ((qg) this).field_j = param5;
            ((qg) this).field_h = param3;
            int var9_int = -116 % ((param0 - -20) / 50);
            ((qg) this).field_l = param1;
            ((qg) this).field_f = param6;
            ((qg) this).field_g = param4;
            ((qg) this).field_e = param2;
            ((qg) this).field_i = param7;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "qg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        ob var12_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        var12 = null;
        var12_ref = (ob) (Object) et.field_d.field_V;
        if (param3 != var12_ref.field_t) {
          L0: {
            var5 = var12_ref.field_t;
            var6 = var12_ref.field_p;
            if (var5 >= param3) {
              stackOut_32_0 = 0;
              stackIn_33_0 = stackOut_32_0;
              break L0;
            } else {
              stackOut_31_0 = 1;
              stackIn_33_0 = stackOut_31_0;
              break L0;
            }
          }
          L1: {
            var7 = stackIn_33_0;
            if (param1 <= var6) {
              stackOut_35_0 = 0;
              stackIn_36_0 = stackOut_35_0;
              break L1;
            } else {
              stackOut_34_0 = 1;
              stackIn_36_0 = stackOut_34_0;
              break L1;
            }
          }
          L2: {
            var8 = stackIn_36_0;
            var9 = (param3 >> 16) - var12_ref.a(true);
            var10 = (param1 >> 16) + -var12_ref.c(879306160);
            if (param0 == 2235) {
              break L2;
            } else {
              boolean discarded$2 = qg.a(-120, 112, -101, 49);
              break L2;
            }
          }
          var11 = de.a(var10 * var10 + var9 * var9, (byte) 80);
          if (0 != var11) {
            L3: {
              L4: {
                L5: {
                  var6 = var6 + (param2 * var10 << 16) / var11;
                  var5 = var5 + (param2 * var9 << 16) / var11;
                  if (var8 == 0) {
                    break L5;
                  } else {
                    if (var6 > param1) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var8 != 0) {
                  break L3;
                } else {
                  if (var6 < param1) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              var6 = param1;
              break L3;
            }
            L6: {
              if (var7 == 0) {
                break L6;
              } else {
                if (var5 <= param3) {
                  break L6;
                } else {
                  var5 = param3;
                  var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                  return false;
                }
              }
            }
            if (var7 == 0) {
              if (param3 > var5) {
                var5 = param3;
                var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                return false;
              } else {
                var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                return false;
              }
            } else {
              var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
              return false;
            }
          } else {
            var5 = param3;
            var6 = param1;
            var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
            return false;
          }
        } else {
          if (var12_ref.field_p != param1) {
            L7: {
              var5 = var12_ref.field_t;
              var6 = var12_ref.field_p;
              if (var5 >= param3) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L7;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L7;
              }
            }
            L8: {
              var7 = stackIn_6_0;
              if (param1 <= var6) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L8;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L8;
              }
            }
            L9: {
              var8 = stackIn_9_0;
              var9 = (param3 >> 16) - var12_ref.a(true);
              var10 = (param1 >> 16) + -var12_ref.c(879306160);
              if (param0 == 2235) {
                break L9;
              } else {
                boolean discarded$3 = qg.a(-120, 112, -101, 49);
                break L9;
              }
            }
            var11 = de.a(var10 * var10 + var9 * var9, (byte) 80);
            if (0 != var11) {
              L10: {
                L11: {
                  L12: {
                    var6 = var6 + (param2 * var10 << 16) / var11;
                    var5 = var5 + (param2 * var9 << 16) / var11;
                    if (var8 == 0) {
                      break L12;
                    } else {
                      if (var6 > param1) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (var8 != 0) {
                    break L10;
                  } else {
                    if (var6 < param1) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                var6 = param1;
                break L10;
              }
              L13: {
                if (var7 == 0) {
                  break L13;
                } else {
                  if (var5 <= param3) {
                    break L13;
                  } else {
                    var5 = param3;
                    var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                    return false;
                  }
                }
              }
              if (var7 == 0) {
                if (param3 <= var5) {
                  var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                  return false;
                } else {
                  var5 = param3;
                  var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                  return false;
                }
              } else {
                var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
                return false;
              }
            } else {
              var5 = param3;
              var6 = param1;
              var12_ref.a(var5, var12_ref.field_v, (byte) 26, var6);
              return false;
            }
          } else {
            return true;
          }
        }
    }

    qg() {
    }

    final static void a(int param0) {
        am var1 = null;
        int var2 = Kickabout.field_G;
        try {
            ou.field_y = 0;
            bc.field_d = 0;
            bh.field_h = null;
            ne.field_I.b(22997);
            qn.field_b.b(22997);
            var1 = kw.field_b.b((byte) 72);
            while (var1 != null) {
                var1.f(-104);
                var1 = kw.field_b.a(0);
            }
            var1 = ni.field_m.b((byte) 72);
            while (var1 != null) {
                var1.f(-106);
                var1 = ni.field_m.a(0);
            }
            ts.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "qg.A(" + 0 + ')');
        }
    }

    static {
    }
}
