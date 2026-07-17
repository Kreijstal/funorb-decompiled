/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String field_a;
    d field_c;
    static km field_b;
    static String field_d;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((jm) this).field_c.a(var6, param3, param4, param0 + -22397, var7, param1, param2);
        ee.field_e.a(0, pg.field_e, dg.field_E.field_K, (byte) -90, 0);
        se.field_c.a(0, 18, dg.field_E.field_K + (-oc.field_k - 84), (byte) -65, pg.field_e + 2);
        if (param0 != 36) {
            boolean discarded$0 = jm.a((byte) 30);
        }
        wb.field_m.a(-80 + -oc.field_k + (dg.field_E.field_K - 2), 18, oc.field_k + 82, (byte) -45, 2 + pg.field_e);
        ve.field_q.a(dg.field_E.field_K, 0, 2, -20 + (-2 + -pg.field_e + dg.field_E.field_ub), oc.field_k, 20 + (2 + pg.field_e), 20, 0);
        lg.field_a.a(oc.field_k, 2, 20, 0);
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    final static hh a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              if (var2_int <= var3) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                stackOut_11_0 = jj.field_f;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4 = param1.charAt(var3);
                if (48 <= var4) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("jm.C(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_12_0;
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != -2) {
            field_b = null;
        }
        j.field_b = param0;
        si.field_a = param0;
        tm.field_g = param1;
        si.field_b = param1;
        fk.a(param0, param1);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        vf.field_c = param0;
        if (!(db.field_D == ve.field_t)) {
            var2 = ve.field_t * ve.field_t;
            var3 = -(db.field_D * db.field_D) + var2;
            param0 = param0 + (-param0 + p.field_h) * var3 / var2;
        }
        we.field_c.a(oh.field_f, 120, 640, (byte) -120, param0);
        ql.a((byte) 117, 5, 640, qi.field_d, 0, -24 + p.field_h, dl.field_b);
    }

    final static boolean a(int param0, int param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_27_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_38_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > param0) {
                break L1;
              } else {
                if (36 >= param0) {
                  L2: {
                    var4_int = 0;
                    if (param1 > 85) {
                      break L2;
                    } else {
                      jm.a(88);
                      break L2;
                    }
                  }
                  var5 = 0;
                  var6 = 0;
                  var7 = param3.length();
                  var8 = 0;
                  L3: while (true) {
                    if (var8 >= var7) {
                      stackOut_42_0 = var5;
                      stackIn_43_0 = stackOut_42_0;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (0 == var8) {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L5;
                              } else {
                                L6: {
                                  if (param2) {
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                }
                                var8++;
                                continue L3;
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L7: {
                          L8: {
                            if (48 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (65 > var9) {
                              break L9;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                          if (var9 < 97) {
                            stackOut_26_0 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            return stackIn_27_0 != 0;
                          } else {
                            if (var9 <= 122) {
                              var9 -= 87;
                              break L7;
                            } else {
                              return false;
                            }
                          }
                        }
                        if (param0 <= var9) {
                          stackOut_33_0 = 0;
                          stackIn_34_0 = stackOut_33_0;
                          return stackIn_34_0 != 0;
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = param0 * var6 - -var9;
                          if (var6 == var10 / param0) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0 != 0;
                          }
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var4;
            stackOut_44_1 = new StringBuilder().append("jm.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param3 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 41);
        }
        return stackIn_43_0 != 0;
    }

    jm(String param0, km param1) {
        String[] var3 = null;
        km[] var4 = null;
        try {
            var3 = new String[]{param0, ng.field_Y, tl.field_k};
            var4 = new km[]{param1, dg.field_E, (km) (Object) lg.field_a};
            ((jm) this).field_c = new d(0L, ve.field_w, var3, sl.field_h, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "jm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = -125 / 0;
            if (an.field_b) {
              break L1;
            } else {
              if (!qm.i(20)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 1;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final static void a(int param0, int[] param1, int param2, boolean param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param0--;
              if (param0 < 0) {
                L2: {
                  if (param3) {
                    break L2;
                  } else {
                    field_a = null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var9 = param1;
                var5 = var9;
                var6 = param2;
                var7 = param4;
                var9[var6] = var7 + rb.a(8355711, var9[var6] >> 1);
                param2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5_ref;
            stackOut_6_1 = new StringBuilder().append("jm.H(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Connection lost - attempting to reconnect";
        field_d = "Quit";
    }
}
