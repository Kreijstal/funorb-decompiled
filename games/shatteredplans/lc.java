/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lc {
    static gq field_b;
    static String field_d;
    static volatile int field_c;
    static String field_a;

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(param1 >>> -1215982463 & -715827883);
        param1 = ((-858993460 & param1) >>> 906798786) + (param1 & 858993459);
        param1 = 252645135 & param1 + (param1 >>> -1914941756);
        param1 = param1 + (param1 >>> -316234392);
        if (param0 != 12330) {
          field_d = (String) null;
          param1 = param1 + (param1 >>> 432933744);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 432933744);
          return param1 & 255;
        }
    }

    final static String a(int param0, byte param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_38_0 = null;
        String stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            if (param1 <= -60) {
              if (param0 != 1) {
                if (-3 != (param0 ^ -1)) {
                  if (3 == param0) {
                    stackIn_12_0 = re.a(fa.field_Y, 4371, new String[]{param2});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (4 != param0) {
                      if (-6 != (param0 ^ -1)) {
                        if (6 == param0) {
                          stackIn_22_0 = re.a(lh.field_E, 4371, new String[]{param2});
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (7 == param0) {
                            stackIn_26_0 = re.a(kq.field_i, 4371, new String[]{param2});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (-9 == (param0 ^ -1)) {
                              stackIn_30_0 = re.a(cq.field_F, 4371, new String[]{param2});
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if (11 == param0) {
                                stackIn_34_0 = re.a(s.field_b, 4371, new String[]{param2});
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (-13 == (param0 ^ -1)) {
                                  stackIn_38_0 = re.a(ja.field_l, 4371, new String[]{param2});
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  if (-14 == (param0 ^ -1)) {
                                    stackIn_42_0 = re.a(sa.field_c, 4371, new String[]{param2});
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  } else {
                                    return null;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        stackIn_18_0 = re.a(eh.field_N, 4371, new String[]{param2});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_15_0 = re.a(vn.field_p, 4371, new String[]{param2});
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                } else {
                  stackIn_8_0 = re.a(p.field_y, 4371, new String[]{param2});
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = re.a(ea.field_e, 4371, new String[]{param2});
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_45_0 = (RuntimeException) (var3);

            stackIn_45_1 = new StringBuilder().append("lc.L(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "null";
              break L1;
            } else {
              stackIn_46_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackIn_46_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackIn_46_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_12_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_18_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_22_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_26_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_30_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_34_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_38_0;
                            } else {
                              return stackIn_42_0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void b(int param0) {
        String var2;
        if (param0 <= -63) {
          if (js.field_j != -aj.field_c + 0) {
            if (250 + -aj.field_c == js.field_j) {
              js.field_j = js.field_j + 1;
              return;
            } else {
              js.field_j = js.field_j + 1;
              return;
            }
          } else {
            js.field_j = js.field_j + 1;
            return;
          }
        } else {
          var2 = (String) null;
          lc.a(-68, (byte) 83, (String) null);
          if (js.field_j != -aj.field_c + 0) {
            if (250 + -aj.field_c == js.field_j) {
              js.field_j = js.field_j + 1;
              return;
            } else {
              js.field_j = js.field_j + 1;
              return;
            }
          } else {
            js.field_j = js.field_j + 1;
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_a = (String) null;
            field_d = null;
            field_a = null;
            return;
        }
        field_d = null;
        field_a = null;
    }

    abstract ci a(int param0);

    abstract byte[] a(byte param0, int param1);

    abstract int a(int param0, byte param1);

    static {
        field_d = "Click to hide the Fleet Info window.";
        field_b = new gq(11, 0, 1, 2);
        field_c = 0;
        field_a = "Kick";
    }
}
