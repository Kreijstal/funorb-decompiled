/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static String field_g;
    static rc field_h;
    static String[] field_f;
    static h field_e;
    static ll[] field_d;
    static qb field_a;
    static sa field_b;
    static int field_c;

    final static boolean a(char param0, int param1) {
        if (Character.isISOControl(param0)) {
          return false;
        } else {
          if (!hn.a(param0, 17769)) {
            if (param0 != (char)param1) {
              if (160 != param0) {
                if (param0 != 32) {
                  if (param0 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_c = 72;
          field_h = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          field_f = null;
          return;
        }
    }

    final static ri a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ri stackIn_3_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        ri stackIn_25_0 = null;
        ri stackIn_31_0 = null;
        ri stackIn_42_0 = null;
        ri stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_6_0 = null;
        ri stackOut_41_0 = null;
        ri stackOut_46_0 = null;
        ri stackOut_30_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        ri stackOut_24_0 = null;
        ri stackOut_10_0 = null;
        ri stackOut_2_0 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (0 != var2_int) {
              if (var2_int > 64) {
                stackOut_6_0 = b.field_e;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1.charAt(0) != 34) {
                  var3 = 0;
                  if (param0 == -58) {
                    var4 = 0;
                    L1: while (true) {
                      if (var2_int > var4) {
                        L2: {
                          var5 = param1.charAt(var4);
                          if (var5 == 46) {
                            L3: {
                              if (var4 == 0) {
                                break L3;
                              } else {
                                if (var4 == -1 + var2_int) {
                                  break L3;
                                } else {
                                  if (var3 != 0) {
                                    break L3;
                                  } else {
                                    var3 = 1;
                                    break L2;
                                  }
                                }
                              }
                            }
                            stackOut_41_0 = n.field_b;
                            stackIn_42_0 = stackOut_41_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            if (tl.field_b.indexOf(var5) == -1) {
                              stackOut_46_0 = n.field_b;
                              stackIn_47_0 = stackOut_46_0;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            } else {
                              var3 = 0;
                              break L2;
                            }
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_30_0 = (ri) null;
                    stackIn_31_0 = stackOut_30_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  if (34 == param1.charAt(-1 + var2_int)) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (-1 + var2_int > var4) {
                        L5: {
                          var5 = param1.charAt(var4);
                          if (92 == var5) {
                            L6: {
                              if (var3 != 0) {
                                stackOut_19_0 = 0;
                                stackIn_20_0 = stackOut_19_0;
                                break L6;
                              } else {
                                stackOut_18_0 = 1;
                                stackIn_20_0 = stackOut_18_0;
                                break L6;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  stackOut_24_0 = n.field_b;
                                  stackIn_25_0 = stackOut_24_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_10_0 = n.field_b;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = uh.field_i;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) (var2);
            stackOut_52_1 = new StringBuilder().append("pm.C(").append(param0).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L8;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_42_0;
                  } else {
                    return stackIn_47_0;
                  }
                }
              }
            }
          }
        }
    }

    final static qb[] a(int param0, qb param1) {
        qb[] var2 = null;
        RuntimeException var2_ref = null;
        qb[] var3 = null;
        qb[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qb[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 29) {
                break L1;
              } else {
                field_a = (qb) null;
                break L1;
              }
            }
            var3 = new qb[9];
            var2 = var3;
            var3[4] = param1;
            stackOut_2_0 = (qb[]) (var2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2_ref);
            stackOut_4_1 = new StringBuilder().append("pm.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(uj[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        uj var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length;
            if (param1 == -1) {
              var3 = 1;
              L1: while (true) {
                if (var2_int <= var3) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = param0[var3];
                  var5 = var3 + -1;
                  L2: while (true) {
                    L3: {
                      if ((var5 ^ -1) > -1) {
                        break L3;
                      } else {
                        if (!cg.a((byte) -111, param0[var5], var4)) {
                          break L3;
                        } else {
                          param0[var5 + 1] = param0[var5];
                          var5--;
                          continue L2;
                        }
                      }
                    }
                    param0[1 + var5] = var4;
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("pm.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_g = "Explode on contact with the landscape. Hold the mouse to increase the velocity of the attack.";
    }
}
