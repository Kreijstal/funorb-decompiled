/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mr {
    static Boolean field_a;
    static jj field_b;

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) as.field_b;
        synchronized (var1) {
          L0: {
            cf.field_a = cf.field_a + 1;
            q.field_v = cl.field_f;
            ed.field_n = ja.field_h;
            gb.field_d = ca.field_c;
            wo.field_s = ej.field_f;
            ej.field_f = false;
            kf.field_c = kc.field_a;
            sd.field_N = hn.field_o;
            no.field_e = gf.field_e;
            kc.field_a = 0;
            break L0;
          }
        }
    }

    final static void a(byte param0) {
        if (ol.field_B != 1) {
            ol.field_B = 1;
            return;
        }
        ol.field_B = -1;
    }

    public static void c(boolean param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 - -param0;
              var6 = param2 + param1;
              if (param3 == 0) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              if (param4 > bi.field_d) {
                stackOut_5_0 = param4;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = bi.field_d;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_6_0;
              if (param1 <= bi.field_f) {
                stackOut_8_0 = bi.field_f;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = param1;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            L4: {
              var8 = stackIn_9_0;
              if (bi.field_i > var5_int) {
                stackOut_11_0 = var5_int;
                stackIn_12_0 = stackOut_11_0;
                break L4;
              } else {
                stackOut_10_0 = bi.field_i;
                stackIn_12_0 = stackOut_10_0;
                break L4;
              }
            }
            L5: {
              var9 = stackIn_12_0;
              if (bi.field_c > var6) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L5;
              } else {
                stackOut_13_0 = bi.field_c;
                stackIn_15_0 = stackOut_13_0;
                break L5;
              }
            }
            L6: {
              var10 = stackIn_15_0;
              if (bi.field_d > param4) {
                break L6;
              } else {
                if (param4 < bi.field_i) {
                  var11 = param4 + var8 * bi.field_e;
                  var12 = var10 + 1 + -var8 >> 1;
                  L7: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L6;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 = var11 + 2 * bi.field_e;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (param1 < bi.field_f) {
                break L8;
              } else {
                if (bi.field_c > var6) {
                  var11 = param1 * bi.field_e + var7;
                  var12 = 1 + (var9 - var7) >> 1;
                  L9: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L8;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L9;
                    }
                  }
                } else {
                  break L8;
                }
              }
            }
            L10: {
              if (bi.field_d > var5_int) {
                break L10;
              } else {
                if (bi.field_i > var5_int) {
                  var11 = var5_int + bi.field_e * ((-param4 + var5_int & 1) + var8);
                  var12 = -var8 + 1 + var10 >> 1;
                  L11: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L10;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 = var11 + bi.field_e * 2;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
            L12: {
              if (bi.field_f > param1) {
                break L12;
              } else {
                if (bi.field_c > var6) {
                  var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                  var12 = -var7 + var9 + 1 >> 1;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L12;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L13;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "mr.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(boolean param0) {
        fk.a(ob.e((byte) 99), 11514);
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (param1 != -48) {
          return null;
        } else {
          var4 = param3.indexOf(param0);
          L0: while (true) {
            if (-1 == var4) {
              return param3;
            } else {
              param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param0.length());
              var4 = param3.indexOf(param0, var4 - -param2.length());
              continue L0;
            }
          }
        }
    }

    static {
    }
}
