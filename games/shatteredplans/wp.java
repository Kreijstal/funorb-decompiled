/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static gh field_a;
    static String field_b;
    static String field_c;

    final static void a(int param0) {
        int var2;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (ce.field_x.field_M) {
          if ((1 << ce.field_x.field_h & ce.field_x.field_P.field_e) == 0) {
            if (ce.field_x.field_P.field_e == 0) {
              if ((1 << ce.field_x.field_P.field_r) + -1 != (1 << ce.field_x.field_h | ce.field_x.field_i)) {
                oq.field_i[13] = uo.field_b;
                if (param0 != -2) {
                  field_a = (gh) null;
                  return;
                } else {
                  return;
                }
              } else {
                oq.field_i[13] = mq.field_a;
                if (param0 != -2) {
                  field_a = (gh) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oq.field_i[13] = qq.field_s;
              if (param0 != -2) {
                field_a = (gh) null;
                return;
              } else {
                return;
              }
            }
          } else {
            oq.field_i[13] = eq.field_i;
            if (param0 == -2) {
              return;
            } else {
              field_a = (gh) null;
              return;
            }
          }
        } else {
          if (0 != (ce.field_x.field_P.field_e & 1 << ce.field_x.field_h)) {
            oq.field_i[13] = qc.field_s;
            if (param0 == -2) {
              return;
            } else {
              field_a = (gh) null;
              return;
            }
          } else {
            if (-1 == (ce.field_x.field_P.field_e ^ -1)) {
              if (-1 + (1 << ce.field_x.field_P.field_r) == (ce.field_x.field_i | 1 << ce.field_x.field_h)) {
                oq.field_i[13] = ip.field_d;
                if (param0 != -2) {
                  field_a = (gh) null;
                  return;
                } else {
                  return;
                }
              } else {
                oq.field_i[13] = hn.field_a;
                if (param0 != -2) {
                  field_a = (gh) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oq.field_i[13] = en.field_d;
              if (param0 != -2) {
                field_a = (gh) null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -90) {
            field_b = (String) null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, oh param1, oh param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_e == null) {
                break L1;
              } else {
                param1.b((byte) -111);
                break L1;
              }
            }
            param1.field_f = param2;
            param1.field_e = param2.field_e;
            param1.field_e.field_f = param1;
            param1.field_f.field_e = param1;
            if (param0 <= -122) {
              break L0;
            } else {
              field_c = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wp.A(").append(param0).append(',');

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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_30_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    L2: {
                      var4 = ji.a(param1, true);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (-2 >= (var4.length() ^ -1)) {
                          if (param0 <= -46) {
                            L3: {
                              if (tc.a(var4.charAt(0), 2)) {
                                break L3;
                              } else {
                                if (!tc.a(var4.charAt(-1 + var4.length()), 2)) {
                                  var5 = 0;
                                  var6 = 0;
                                  L4: while (true) {
                                    if (param1.length() <= var6) {
                                      if ((var5 ^ -1) < -1) {
                                        stackIn_35_0 = cr.field_a;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      } else {
                                        return null;
                                      }
                                    } else {
                                      L5: {
                                        var7 = param1.charAt(var6);
                                        if (!tc.a((char) var7, 2)) {
                                          var5 = 0;
                                          break L5;
                                        } else {
                                          var5++;
                                          break L5;
                                        }
                                      }
                                      L6: {
                                        if (-3 < (var5 ^ -1)) {
                                          break L6;
                                        } else {
                                          if (param2) {
                                            break L6;
                                          } else {
                                            stackIn_30_0 = ms.field_g;
                                            decompiledRegionSelector0 = 5;
                                            break L0;
                                          }
                                        }
                                      }
                                      var6++;
                                      continue L4;
                                    }
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                            stackIn_21_0 = cr.field_a;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            stackIn_16_0 = (String) null;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = fp.field_a;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_8_0 = fp.field_a;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = fp.field_a;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("wp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_30_0;
                  } else {
                    return stackIn_35_0;
                  }
                }
              }
            }
          }
        }
    }

    static {
        field_b = "Click";
        field_c = "Place fleets in territory <%0> (<%1> remaining)";
    }
}
