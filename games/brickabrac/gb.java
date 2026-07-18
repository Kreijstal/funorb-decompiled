/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    int field_a;
    static int field_h;
    static int[] field_i;
    int field_o;
    int field_d;
    mh field_b;
    int[] field_g;
    static mh[] field_l;
    String field_q;
    String field_m;
    int field_c;
    String field_p;
    String field_j;
    long field_k;
    int field_f;
    static int field_n;
    boolean field_e;

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_30_0 = null;
        Object stackOut_28_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!ik.a((byte) -9, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!ik.a((byte) -9, param0.charAt(var3 - 1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      L5: {
                        var5 = new StringBuilder(var4);
                        if (param1 >= 46) {
                          break L5;
                        } else {
                          gb.a(-114);
                          break L5;
                        }
                      }
                      var6 = var2_int;
                      L6: while (true) {
                        if (var6 >= var3) {
                          if (0 != var5.length()) {
                            stackOut_30_0 = var5.toString();
                            stackIn_31_0 = stackOut_30_0;
                            break L0;
                          } else {
                            stackOut_28_0 = null;
                            stackIn_29_0 = stackOut_28_0;
                            return (String) (Object) stackIn_29_0;
                          }
                        } else {
                          L7: {
                            var7 = param0.charAt(var6);
                            if (m.a(true, (char) var7)) {
                              var8 = ah.a(207, (char) var7);
                              if (0 != var8) {
                                StringBuilder discarded$1 = var5.append((char) var8);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var6++;
                          continue L6;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var2;
            stackOut_32_1 = new StringBuilder().append("gb.C(");
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
              break L8;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ')');
        }
        return stackIn_31_0;
    }

    final int a(boolean param0) {
        Object var3 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            var3 = null;
            String discarded$2 = gb.a((CharSequence) null, -7);
            break L0;
          }
        }
        L1: {
          if (((gb) this).field_e) {
            break L1;
          } else {
            L2: {
              if (-3 != ((gb) this).field_c) {
                break L2;
              } else {
                if (-1 < ((gb) this).field_a) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (((gb) this).field_k != oc.field_p) {
              L3: {
                if (wk.field_m != 2) {
                  break L3;
                } else {
                  if (!nc.a(0, ((gb) this).field_m)) {
                    break L3;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            } else {
              return 1;
            }
          }
        }
        return 2;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 != 0) {
            field_h = -77;
        }
        field_i = null;
    }

    gb(boolean param0) {
        ((gb) this).field_o = ka.field_E;
        ((gb) this).field_f = field_h;
        if (param0) {
            ((gb) this).field_g = rn.field_m;
        } else {
            ((gb) this).field_g = null;
        }
        ((gb) this).field_q = dp.field_t;
        ((gb) this).field_p = sl.field_y;
        ((gb) this).field_a = nh.field_b;
        ((gb) this).field_k = an.field_k;
        ((gb) this).field_m = nd.field_g;
        ((gb) this).field_e = ji.field_f;
        ((gb) this).field_j = gd.field_d;
        ((gb) this).field_c = gj.field_a;
        ((gb) this).field_d = vq.field_H;
    }

    gb(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((gb) this).field_k = 0L;
            ((gb) this).field_f = 0;
            ((gb) this).field_q = param1;
            ((gb) this).field_g = null;
            ((gb) this).field_e = true;
            ((gb) this).field_d = 0;
            ((gb) this).field_p = param3;
            ((gb) this).field_j = param4;
            ((gb) this).field_c = param0;
            ((gb) this).field_m = param1;
            ((gb) this).field_o = param2;
            ((gb) this).field_a = 0;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "gb.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[]{33, 34, 35};
    }
}
