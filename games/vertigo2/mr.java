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
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 - -param0;
              var6 = param2 + param1;
              if (param4 > bi.field_d) {
                stackOut_3_0 = param4;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = bi.field_d;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param1 <= bi.field_f) {
                stackOut_6_0 = bi.field_f;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (bi.field_i > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = bi.field_i;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (bi.field_c > var6) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = bi.field_c;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (bi.field_d > param4) {
                break L5;
              } else {
                if (param4 < bi.field_i) {
                  var11 = param4 + var8 * bi.field_e;
                  var12 = var10 + 1 + -var8 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 = var11 + 2 * bi.field_e;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (param1 < bi.field_f) {
                break L7;
              } else {
                if (bi.field_c > var6) {
                  var11 = param1 * bi.field_e + var7;
                  var12 = 1 + (var9 - var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L7;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (bi.field_d > var5_int) {
                break L9;
              } else {
                if (bi.field_i > var5_int) {
                  var11 = var5_int + bi.field_e * ((-param4 + var5_int & 1) + var8);
                  var12 = -var8 + 1 + var10 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 = var11 + bi.field_e * 2;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (bi.field_f > param1) {
                break L11;
              } else {
                if (bi.field_c > var6) {
                  var11 = var7 + (var6 * bi.field_e + (-param1 + var6 & 1));
                  var12 = -var7 + var9 + 1 >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      bi.field_l[var11] = 16777215;
                      var11 += 2;
                      continue L12;
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
          throw wn.a((Throwable) (Object) var5, "mr.C(" + param0 + ',' + param1 + ',' + param2 + ',' + 0 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0) {
        fk.a(ob.e((byte) 99), 11514);
    }

    final static String a(String param0, byte param1, String param2, String param3) {
        int var5 = Vertigo2.field_L ? 1 : 0;
        int var4 = param3.indexOf(param0);
        while (-1 != var4) {
            param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param0.length());
            var4 = param3.indexOf(param0, var4 - -param2.length());
        }
        return param3;
    }

    static {
    }
}
