/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static float[][] field_f;
    static int field_b;
    static pe field_d;
    static int field_e;
    static uj field_c;
    static int[] field_a;

    final static le[] a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 34;
        return c.a(65793, 3, 0, 1, 0, 0, 1, 1, true);
    }

    final static h a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        h stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        h stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!bb.field_a.a(0)) {
                break L1;
              } else {
                if (param1.equals((Object) (Object) bb.field_a.a(true))) {
                  break L1;
                } else {
                  bb.field_a = ia.a(29, param1);
                  break L1;
                }
              }
            }
            var2_int = 9 / ((param0 - 35) / 62);
            stackOut_3_0 = bb.field_a;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("jc.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(ki param0, byte param1, ki param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        ki[] var3_array = null;
        il var3_ref = null;
        int var4 = 0;
        ki[] var5 = null;
        il var6 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param2.field_m) {
                if (param2.field_w != 4) {
                  if (4 == param0.field_w) {
                    L2: {
                      if (5 == param2.field_w) {
                        break L2;
                      } else {
                        if (param2.field_v * param2.field_v + param2.field_D * param2.field_D >= 0.009999999776482582f) {
                          L3: {
                            if (param0.field_p != param2.field_l) {
                              param2.field_D = param2.field_D - 0.0010000000474974513f * param2.field_D;
                              param2.field_v = param2.field_v - param2.field_v * 0.0010000000474974513f;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if (param0.field_w != 4) {
                        break L4;
                      } else {
                        if (param0.field_o.length != param0.field_m) {
                          break L4;
                        } else {
                          var5 = new ki[param0.field_m + 6];
                          var3_array = var5;
                          gl.a((Object[]) (Object) param0.field_o, 0, (Object[]) (Object) var5, 0, param0.field_m);
                          param0.field_o = var3_array;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (param2.field_w != 5) {
                        break L5;
                      } else {
                        param0.field_p = param2.field_l;
                        break L5;
                      }
                    }
                    int fieldTemp$5 = param2.field_m;
                    param2.field_m = param2.field_m + 1;
                    param2.field_o[fieldTemp$5] = param0;
                    int fieldTemp$6 = param0.field_m;
                    param0.field_m = param0.field_m + 1;
                    param0.field_o[fieldTemp$6] = param2;
                    param2.field_v = 0.0f;
                    param2.field_D = 0.0f;
                    param2.field_x = true;
                    return;
                  } else {
                    L6: {
                      L7: {
                        if (2 == param0.field_w) {
                          break L7;
                        } else {
                          if (param0.field_w != 3) {
                            L8: {
                              int fieldTemp$7 = param2.field_m;
                              param2.field_m = param2.field_m + 1;
                              param2.field_o[fieldTemp$7] = param0;
                              int fieldTemp$8 = param0.field_m;
                              param0.field_m = param0.field_m + 1;
                              param0.field_o[fieldTemp$8] = param2;
                              if (!aj.field_b.e(11253)) {
                                var6 = (il) (Object) aj.field_b.d(4011);
                                var3_ref = var6;
                                var6.a(-1, param2, 32.0f, param0);
                                break L8;
                              } else {
                                var3_ref = new il(param2, param0, 32.0f);
                                break L8;
                              }
                            }
                            L9: {
                              rf.field_a.a(-8212, (ug) (Object) var3_ref);
                              if (param0.field_w == 0) {
                                kc.b(true);
                                break L9;
                              } else {
                                if (param2.field_w == 0) {
                                  kc.b(true);
                                  break L9;
                                } else {
                                  int discarded$9 = -127;
                                  be.b();
                                  break L9;
                                }
                              }
                            }
                            if (param0.field_l == param2.field_l) {
                              param2.field_F = param2.field_F + 1;
                              param0.field_F = param0.field_F + 1;
                              ok.field_d = true;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (3 == param0.field_w) {
                        param0.field_n = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    break L0;
                  }
                } else {
                  return;
                }
              } else {
                if (param0 == param2.field_o[var3_int]) {
                  return;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("jc.A(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          L11: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',').append(-124).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L11;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L11;
            }
          }
          throw la.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_f = null;
        field_a = null;
    }

    final static void b() {
        if (re.field_e > 32) {
            qb.a(256, -32 + re.field_e);
        } else {
            qb.a(256, 0);
        }
        int var1 = -54;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[][]{new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2]};
    }
}
