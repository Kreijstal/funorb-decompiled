/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc extends rk {
    private int field_n;
    private int field_o;
    static String field_p;
    static int field_m;

    final static void b() {
        RuntimeException var1 = null;
        int var2 = 0;
        cc var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        hb var13 = null;
        int var14 = 0;
        hb var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var13 = e.field_c;
            var15 = var13;
            var2 = var15.c(32);
            var3 = (cc) (Object) uc.field_bb.a(77);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_o) {
                    break L2;
                  } else {
                    var3 = (cc) (Object) uc.field_bb.d(2123);
                    continue L1;
                  }
                }
              }
              if (var3 == null) {
                dc.d(122);
                return;
              } else {
                L3: {
                  var4 = var15.c(32);
                  if (0 != var4) {
                    var5 = var3.field_n;
                    em.field_f[0] = qc.field_m;
                    var6_int = 1;
                    L4: while (true) {
                      if (var6_int >= var4) {
                        int discarded$2 = -63;
                        fg.a(var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= var4) {
                            wa.a(var5, (byte) 117);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = mc.field_c;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var9 = 0;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var9 < var8) {
                                    L8: {
                                      var11 = sj.field_rb[var5 - -var9];
                                      var6[1][var14] = em.field_f[var11];
                                      var19[1][4 * var14] = an.field_n[var11];
                                      var19[1][var14 * 4 + 1] = am.field_I[var11];
                                      var19[1][2 + 4 * var14] = em.field_b[var11];
                                      var19[1][4 * var14 - -3] = oc.field_m[var11];
                                      if (im.a(em.field_f[var11], 44)) {
                                        if (em.field_b[var11] + am.field_I[var11] + oc.field_m[var11] == 0) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    var14++;
                                    var9++;
                                    continue L7;
                                  } else {
                                    var3.a(true);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = sj.field_rb[var9];
                                  var6[0][var10] = em.field_f[var11];
                                  var19[0][4 * var10] = an.field_n[var11];
                                  var19[0][4 * var10 - -1] = am.field_I[var11];
                                  var19[0][4 * var10 - -2] = em.field_b[var11];
                                  var19[0][4 * var10 + 3] = oc.field_m[var11];
                                  if (im.a(em.field_f[var11], -110)) {
                                    if (em.field_b[var11] + am.field_I[var11] - -oc.field_m[var11] != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
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
                              int discarded$3 = -45;
                              bd.a((kg) (Object) var15);
                              if (0 == var6_int) {
                                cl.a(eh.field_R, qg.field_h, var6_int, dj.field_gb, (byte) -127, ll.field_d);
                                break L10;
                              } else {
                                cl.a(eh.field_R, qg.field_h, var6_int, dj.field_gb, (byte) 74, ll.field_d);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        em.field_f[var6_int] = var13.d(true);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(true);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "cc.F(" + 0 + ')');
        }
    }

    final static mi a(int param0, int param1) {
        if (param1 != -14245) {
            field_p = null;
        }
        return we.a(param0, false, (byte) -106, true, 1, false);
    }

    final static boolean a() {
        return null == dn.field_d ? on.field_e : true;
    }

    final static int a(boolean param0, byte param1, int param2, int param3) {
        int discarded$0 = 1;
        return oc.b();
    }

    public static void b(boolean param0) {
        field_p = null;
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = b.a(true, 10, (byte) 16, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("cc.C(").append(true).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private cc() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Swap up/down: ";
    }
}
