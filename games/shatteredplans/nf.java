/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nf {
    long field_p;
    boolean field_h;
    static String field_m;
    int field_g;
    static String field_i;
    static int[] field_a;
    String field_o;
    String field_k;
    int field_c;
    String field_d;
    int field_l;
    int[] field_f;
    String field_b;
    int field_n;
    qr field_j;
    int field_e;

    final int a(byte param0) {
        if (!((nf) this).field_h) {
          if (((nf) this).field_n != 2) {
            if (~((nf) this).field_p == ~ec.field_p) {
              return 1;
            } else {
              if (po.field_b != 2) {
                if (param0 <= 100) {
                  return 23;
                } else {
                  return 0;
                }
              } else {
                if (!da.a(-30106, ((nf) this).field_b)) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (((nf) this).field_c <= 0) {
              if (~((nf) this).field_p == ~ec.field_p) {
                return 1;
              } else {
                if (po.field_b != 2) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  if (!da.a(-30106, ((nf) this).field_b)) {
                    if (param0 <= 100) {
                      return 23;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    final static String a(eg param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ne var4 = null;
        String var5 = null;
        String[] var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_15_0 = null;
        String stackOut_14_0 = null;
        String stackOut_30_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            var4 = (ne) (Object) param0.field_v.d(0);
            L1: while (true) {
              if (var4 == null) {
                if (var2_int != 0) {
                  L2: {
                    if (1 == var2_int) {
                      stackOut_15_0 = bk.field_d;
                      stackIn_16_0 = stackOut_15_0;
                      break L2;
                    } else {
                      stackOut_14_0 = re.a(rl.field_e, 4371, new String[1]);
                      stackIn_16_0 = stackOut_14_0;
                      break L2;
                    }
                  }
                  L3: {
                    var9 = stackIn_16_0;
                    var5 = var9;
                    if (0 != var3) {
                      var6 = new String[1 + var3];
                      var3 = 1;
                      var6[0] = var9;
                      var4 = (ne) (Object) param0.field_v.d(0);
                      L4: while (true) {
                        if (var4 == null) {
                          var5 = va.a(-2, var6);
                          break L3;
                        } else {
                          L5: {
                            if (var4.field_h != ho.field_d) {
                              break L5;
                            } else {
                              if (-1 == var4.field_r) {
                                break L5;
                              } else {
                                if (null == var4.field_k) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (-2 != var4.field_r) {
                                      var7 = re.a(wl.field_c, 4371, new String[2]);
                                      break L6;
                                    } else {
                                      var7 = re.a(lh.field_H, 4371, new String[1]);
                                      break L6;
                                    }
                                  }
                                  int incrementValue$1 = var3;
                                  var3++;
                                  var6[incrementValue$1] = var7;
                                  break L5;
                                }
                              }
                            }
                          }
                          var4 = (ne) (Object) param0.field_v.a((byte) -71);
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  stackOut_30_0 = (String) var5;
                  stackIn_31_0 = stackOut_30_0;
                  break L0;
                } else {
                  stackOut_11_0 = bq.field_f;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                }
              } else {
                L7: {
                  if (ho.field_d != var4.field_h) {
                    break L7;
                  } else {
                    L8: {
                      if (var4.field_r == 0) {
                        break L8;
                      } else {
                        if (null == var4.field_k) {
                          break L8;
                        } else {
                          var3++;
                          break L8;
                        }
                      }
                    }
                    var2_int = var2_int + var4.field_p;
                    break L7;
                  }
                }
                var4 = (ne) (Object) param0.field_v.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("nf.E(");
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + 23248 + ')');
        }
        return stackIn_31_0;
    }

    final static int[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new int[var2_int];
            var4 = 1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_8_0 = (int[]) var3;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                var5 = var4;
                L2: while (true) {
                  L3: {
                    var5--;
                    if (0 > var5) {
                      break L3;
                    } else {
                      if (param0[var3[var5]] <= param0[var4]) {
                        break L3;
                      } else {
                        var3[1 + var5] = var3[var5];
                        continue L2;
                      }
                    }
                  }
                  var3[1 + var5] = var4;
                  var4++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("nf.C(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 3718 + ')');
        }
        return stackIn_9_0;
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = param1.indexOf(param0);
        if (param2 > 57) {
          L0: while (true) {
            if (var4 == -1) {
              return param1;
            } else {
              param1 = param1.substring(0, var4) + param3 + param1.substring(var4 - -param0.length());
              var4 = param1.indexOf(param0, var4 - -param3.length());
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null == tc.field_G) {
          var3 = 0;
          return;
        } else {
          L0: {
            var3 = tc.field_G.b(param2, (byte) -68);
            if (var3 == -2) {
              break L0;
            } else {
              L1: {
                if (var3 == -1) {
                  break L1;
                } else {
                  var4 = tc.field_G.i(-86) ? 1 : 0;
                  bb.a(94, tc.field_G.field_Gb, param1, var4 != 0, tc.field_G.g((byte) -42), var3);
                  break L1;
                }
              }
              tc.field_G = null;
              ai.a(3);
              break L0;
            }
          }
          var3 = 0;
          return;
        }
    }

    nf(boolean param0) {
        ((nf) this).field_e = va.field_b;
        if (param0) {
            ((nf) this).field_f = mb.field_p;
        } else {
            ((nf) this).field_f = null;
        }
        ((nf) this).field_b = em.field_a;
        ((nf) this).field_k = ke.field_h;
        ((nf) this).field_c = nj.field_a;
        ((nf) this).field_h = kr.field_b;
        ((nf) this).field_o = mc.field_q;
        ((nf) this).field_p = sp.field_j;
        ((nf) this).field_l = el.field_f;
        ((nf) this).field_g = fm.field_f;
        ((nf) this).field_n = ob.field_k;
        ((nf) this).field_d = jc.field_s;
    }

    public static void b(byte param0) {
        field_i = null;
        field_m = null;
        field_a = null;
    }

    nf(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((nf) this).field_h = true;
            ((nf) this).field_k = param4;
            ((nf) this).field_g = param2;
            ((nf) this).field_o = param3;
            ((nf) this).field_d = param1;
            ((nf) this).field_c = 0;
            ((nf) this).field_n = param0;
            ((nf) this).field_p = 0L;
            ((nf) this).field_e = 0;
            ((nf) this).field_f = null;
            ((nf) this).field_b = param1;
            ((nf) this).field_l = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "nf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Total fleets lost.";
        field_i = "Close";
    }
}
