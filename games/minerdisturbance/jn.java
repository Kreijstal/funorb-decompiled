/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends pi {
    byte[] field_s;
    long field_o;
    static ae field_r;
    int field_q;
    static long field_n;
    static String field_p;
    static String[][] field_t;

    final static void a(int param0) {
        pj.field_c = new th();
        if (null == aa.field_j) {
            return;
        }
        aa.field_j = new th();
        ck.a(-30833);
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        mj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ld var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            var15 = kj.field_a;
            var2 = var15.d((byte) -54);
            var3 = (mj) (Object) nh.field_a.b(100);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var3.field_r != var2) {
                    var3 = (mj) (Object) nh.field_a.b((byte) 56);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var15.d((byte) -54);
                  if (0 != var4) {
                    var5 = var3.field_q;
                    fl.field_b[0] = ti.field_J;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        pn.a(var4, 11760, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            si.a(var5, -14391);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = fb.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var13 < var8) {
                                    L8: {
                                      var11 = an.field_a[var13 + var5];
                                      var6[1][var14] = fl.field_b[var11];
                                      var19[1][4 * var14] = pi.field_h[var11];
                                      var19[1][4 * var14 + 1] = jk.field_db[var11];
                                      var19[1][var14 * 4 + 2] = qa.field_c[var11];
                                      var19[1][3 + var14 * 4] = li.field_a[var11];
                                      if (!ci.a(-27933, fl.field_b[var11])) {
                                        break L8;
                                      } else {
                                        if (li.field_a[var11] + qa.field_c[var11] + jk.field_db[var11] != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var13++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var3.b(34);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = an.field_a[var9];
                                  var6[0][var10] = fl.field_b[var11];
                                  var19[0][var10 * 4] = pi.field_h[var11];
                                  var19[0][4 * var10 + 1] = jk.field_db[var11];
                                  var19[0][2 + 4 * var10] = qa.field_c[var11];
                                  var19[0][var10 * 4 - -3] = li.field_a[var11];
                                  if (ci.a(-27933, fl.field_b[var11])) {
                                    if (li.field_a[var11] + (jk.field_db[var11] + qa.field_c[var11]) == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              fg.a((byte) -86, (sb) (Object) var15);
                              if (var6_int != 0) {
                                qm.a(fl.field_c, tk.field_h, var6_int, true, ah.field_b, vb.field_b);
                                break L10;
                              } else {
                                qm.a(fl.field_c, tk.field_h, var6_int, true, ah.field_b, vb.field_b);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        fl.field_b[var6_int] = var15.a(false);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.b(34);
                    break L3;
                  }
                }
                break L0;
              } else {
                si.a(-68);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "jn.C(" + -105 + ')');
        }
    }

    final static ea a(String param0, int param1, String param2, bj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        ea stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ea stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -29553) {
                break L1;
              } else {
                var6 = null;
                ea discarded$2 = jn.a((String) null, -42, (String) null, (bj) null);
                break L1;
              }
            }
            var4_int = param3.a(-118, param2);
            var5 = param3.a(param0, var4_int, param1 ^ 29451);
            stackOut_2_0 = el.a(var5, var4_int, param3, 2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("jn.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void e(int param0) {
        field_p = null;
        int var1 = 0;
        field_r = null;
        field_t = null;
    }

    jn(long param0, int param1, byte[] param2) {
        try {
            ((jn) this).field_s = param2;
            ((jn) this).field_o = param0;
            ((jn) this).field_q = param1;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "jn.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Look sharp in this greaseproof suit. This fetching non-stick two piece will let you swim through oil as if it were water.";
        field_r = new ae();
        field_t = new String[][]{null, new String[1]};
    }
}
