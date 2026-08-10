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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = bb.field_a;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("jc.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(ki param0, byte param1, ki param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        ki stackIn_19_0 = null;
        ki stackIn_19_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ki[] var3 = null;
        il var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        ki[] var5 = null;
        il var6 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param2.field_m) {
                if ((param2.field_w ^ -1) != -5) {
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
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      if ((param0.field_w ^ -1) != -5) {
                        break L4;
                      } else {
                        if (param0.field_o.length != param0.field_m) {
                          break L4;
                        } else {
                          var5 = new ki[param0.field_m + 6];
                          var3 = var5;
                          gl.a(param0.field_o, 0, var5, 0, param0.field_m);
                          param0.field_o = var3;
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (-6 != (param2.field_w ^ -1)) {
                        break L5;
                      } else {
                        stackIn_19_0 = (ki) (param0);
                        stackIn_19_1 = (ki) (param2);
                        stackIn_19_0.field_p = stackIn_19_1.field_l;
                        break L5;
                      }
                    }
                    fieldTemp$0 = param2.field_m;
                    param2.field_m = param2.field_m + 1;
                    param2.field_o[fieldTemp$0] = param0;
                    fieldTemp$1 = param0.field_m;
                    param0.field_m = param0.field_m + 1;
                    param0.field_o[fieldTemp$1] = param2;
                    param2.field_v = 0.0f;
                    param2.field_D = 0.0f;
                    param2.field_x = true;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L6: {
                      if (param1 < -88) {
                        break L6;
                      } else {
                        jc.a(117, 85, 82, 12, -45);
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        if (2 == param0.field_w) {
                          break L8;
                        } else {
                          if (param0.field_w != 3) {
                            L9: {
                              fieldTemp$2 = param2.field_m;
                              param2.field_m = param2.field_m + 1;
                              param2.field_o[fieldTemp$2] = param0;
                              fieldTemp$3 = param0.field_m;
                              param0.field_m = param0.field_m + 1;
                              param0.field_o[fieldTemp$3] = param2;
                              if (!aj.field_b.e(11253)) {
                                var6 = (il) ((Object) aj.field_b.d(4011));
                                var3_ref = var6;
                                var6.a(-1, param2, 32.0f, param0);
                                break L9;
                              } else {
                                var3_ref = new il(param2, param0, 32.0f);
                                break L9;
                              }
                            }
                            L10: {
                              rf.field_a.a(-8212, var3_ref);
                              if (-1 == (param0.field_w ^ -1)) {
                                kc.b(true);
                                break L10;
                              } else {
                                if (param2.field_w == 0) {
                                  kc.b(true);
                                  break L10;
                                } else {
                                  be.b(-127);
                                  break L10;
                                }
                              }
                            }
                            if (param0.field_l == param2.field_l) {
                              param2.field_F = param2.field_F + 1;
                              param0.field_F = param0.field_F + 1;
                              ok.field_d = true;
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (3 == param0.field_w) {
                        param0.field_n = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if (param0 == param2.field_o[var3_int]) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3_ref2 = decompiledCaughtException;
            stackIn_48_0 = (RuntimeException) (var3_ref2);

            stackIn_48_1 = new StringBuilder().append("jc.A(");

            if (param0 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "null";
              break L11;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_49_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackIn_49_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_51_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L12;
            } else {
              stackIn_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L12;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_49_0), stackIn_52_2 + ')');
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
        if ((re.field_e ^ -1) < -33) {
            qb.a(256, -32 + re.field_e);
        } else {
            qb.a(256, 0);
        }
        int var1 = -54 / ((65 - param0) / 61);
    }

    static {
        field_f = new float[][]{new float[]{80.0f, 299.0f}, new float[]{128.0f, 311.0f}, new float[]{162.0f, 345.0f}, new float[]{208.0f, 345.0f}, new float[]{239.0f, 340.0f}, new float[]{284.0f, 339.0f}, new float[]{315.0f, 350.0f}, new float[]{370.0f, 344.0f}, new float[]{402.0f, 343.0f}, new float[]{466.0f, 351.0f}, new float[]{497.0f, 342.0f}, new float[]{547.0f, 336.0f}};
    }
}
