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
        int var5 = -68 / ((-34 - param2) / 37);
        return c.a(param0, 3, param3, 1, param4, param1, 1, 1, true);
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
                if (param1.equals(bb.field_a.a(true))) {
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
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("jc.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(ki param0, byte param1, ki param2) {
        le[] discarded$5 = null;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        ki[] var3_array = null;
        il var3_ref = null;
        int var4 = 0;
        ki[] var5 = null;
        il var6 = null;
        ki stackIn_4_0 = null;
        ki stackIn_4_1 = null;
        ki stackIn_20_0 = null;
        ki stackIn_20_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ki stackOut_3_0 = null;
        ki stackOut_3_1 = null;
        ki stackOut_19_0 = null;
        ki stackOut_19_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var3_int >= param2.field_m) {
                      break L4;
                    } else {
                      stackOut_3_0 = (ki) (param0);
                      stackOut_3_1 = param2.field_o[var3_int];
                      stackIn_20_0 = stackOut_3_0;
                      stackIn_20_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var4 != 0) {
                        break L3;
                      } else {
                        if (stackIn_4_0 == stackIn_4_1) {
                          decompiledRegionSelector0 = 0;
                          break L0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  if ((param2.field_w ^ -1) != -5) {
                    if (4 == param0.field_w) {
                      L5: {
                        if (5 == param2.field_w) {
                          break L5;
                        } else {
                          if (param2.field_v * param2.field_v + param2.field_D * param2.field_D >= 0.009999999776482582f) {
                            L6: {
                              if (param0.field_p != param2.field_l) {
                                param2.field_D = param2.field_D - 0.0010000000474974513f * param2.field_D;
                                param2.field_v = param2.field_v - param2.field_v * 0.0010000000474974513f;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L7: {
                        if ((param0.field_w ^ -1) != -5) {
                          break L7;
                        } else {
                          if (param0.field_o.length != param0.field_m) {
                            break L7;
                          } else {
                            var5 = new ki[param0.field_m + 6];
                            var3_array = var5;
                            gl.a(param0.field_o, 0, var5, 0, param0.field_m);
                            param0.field_o = var3_array;
                            break L7;
                          }
                        }
                      }
                      if (-6 != (param2.field_w ^ -1)) {
                        break L2;
                      } else {
                        stackOut_19_0 = (ki) (param0);
                        stackOut_19_1 = (ki) (param2);
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        break L3;
                      }
                    } else {
                      L8: {
                        if (param1 < -88) {
                          break L8;
                        } else {
                          discarded$5 = jc.a(117, 85, 82, 12, -45);
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          L11: {
                            if (2 == param0.field_w) {
                              break L11;
                            } else {
                              if (param0.field_w != 3) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          if (3 == param0.field_w) {
                            param0.field_n = 1;
                            if (var4 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          } else {
                            return;
                          }
                        }
                        L12: {
                          fieldTemp$6 = param2.field_m;
                          param2.field_m = param2.field_m + 1;
                          param2.field_o[fieldTemp$6] = param0;
                          fieldTemp$7 = param0.field_m;
                          param0.field_m = param0.field_m + 1;
                          param0.field_o[fieldTemp$7] = param2;
                          if (!aj.field_b.e(11253)) {
                            var6 = (il) ((Object) aj.field_b.d(4011));
                            var3_ref = var6;
                            var6.a(-1, param2, 32.0f, param0);
                            break L12;
                          } else {
                            var3_ref = new il(param2, param0, 32.0f);
                            break L12;
                          }
                        }
                        L13: {
                          rf.field_a.a(-8212, var3_ref);
                          if (-1 == (param0.field_w ^ -1)) {
                            kc.b(true);
                            break L13;
                          } else {
                            if (param2.field_w == 0) {
                              kc.b(true);
                              break L13;
                            } else {
                              be.b(-127);
                              if (var4 == 0) {
                                break L13;
                              } else {
                                kc.b(true);
                                break L13;
                              }
                            }
                          }
                        }
                        if (param0.field_l == param2.field_l) {
                          param2.field_F = param2.field_F + 1;
                          param0.field_F = param0.field_F + 1;
                          ok.field_d = true;
                          break L9;
                        } else {
                          return;
                        }
                      }
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
                stackIn_20_0.field_p = stackIn_20_1.field_l;
                break L2;
              }
              fieldTemp$8 = param2.field_m;
              param2.field_m = param2.field_m + 1;
              param2.field_o[fieldTemp$8] = param0;
              fieldTemp$9 = param0.field_m;
              param0.field_m = param0.field_m + 1;
              param0.field_o[fieldTemp$9] = param2;
              param2.field_v = 0.0f;
              param2.field_D = 0.0f;
              param2.field_x = true;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var3);
            stackOut_49_1 = new StringBuilder().append("jc.A(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L14;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L14;
            }
          }
          L15: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param1).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param2 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 336) {
            return;
        }
        field_f = (float[][]) null;
        field_a = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        if ((re.field_e ^ -1) < -33) {
          qb.a(256, -32 + re.field_e);
          if (MonkeyPuzzle2.field_F) {
            qb.a(256, 0);
            var1 = -54 / ((65 - param0) / 61);
            return;
          } else {
            var1 = -54 / ((65 - param0) / 61);
            return;
          }
        } else {
          qb.a(256, 0);
          var1 = -54 / ((65 - param0) / 61);
          return;
        }
    }

    static {
        field_f = new float[][]{new float[]{80.0f, 299.0f}, new float[]{128.0f, 311.0f}, new float[]{162.0f, 345.0f}, new float[]{208.0f, 345.0f}, new float[]{239.0f, 340.0f}, new float[]{284.0f, 339.0f}, new float[]{315.0f, 350.0f}, new float[]{370.0f, 344.0f}, new float[]{402.0f, 343.0f}, new float[]{466.0f, 351.0f}, new float[]{497.0f, 342.0f}, new float[]{547.0f, 336.0f}};
    }
}
