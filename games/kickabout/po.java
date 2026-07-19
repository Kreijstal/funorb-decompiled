/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    static ut field_e;
    static ut field_h;
    static String field_b;
    static String[] field_a;
    static String field_d;
    static boolean field_f;
    static String field_g;
    static String field_c;

    public static void a(int param0) {
        if (param0 != 0) {
          po.a(23);
          field_g = null;
          field_b = null;
          field_a = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        } else {
          field_g = null;
          field_b = null;
          field_a = null;
          field_h = null;
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(gg param0, byte param1, gg param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            var3_int = param2.field_Cb + -param0.field_Cb;
            if (param1 == -21) {
              L1: {
                if (param2.field_zb != bh.field_h) {
                  if (null == param2.field_zb) {
                    var3_int += 200;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var3_int -= 200;
                  break L1;
                }
              }
              L2: {
                if (bh.field_h == param0.field_zb) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (null != param0.field_zb) {
                    break L2;
                  } else {
                    var3_int -= 200;
                    break L2;
                  }
                }
              }
              L3: {
                if (var3_int <= 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var3);
            stackOut_17_1 = new StringBuilder().append("po.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static int a(js param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        try {
          L0: {
            if ((param0.field_c ^ -1) == -24) {
              stackOut_2_0 = 680;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (24 == param0.field_c) {
                stackOut_6_0 = 440;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param0.field_c ^ -1) != -26) {
                  if (param0.field_c == 16) {
                    stackOut_13_0 = 680;
                    stackIn_14_0 = stackOut_13_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-19 == (param0.field_c ^ -1)) {
                      stackOut_17_0 = 680;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param0.field_c ^ -1) != 4) {
                        if (param0.field_c != param1) {
                          if ((param0.field_c ^ -1) != -20) {
                            if (20 == param0.field_c) {
                              stackOut_30_0 = 680;
                              stackIn_31_0 = stackOut_30_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param0.field_c ^ -1) == -22) {
                                stackOut_34_0 = 680;
                                stackIn_35_0 = stackOut_34_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (-23 == (param0.field_c ^ -1)) {
                                  stackOut_38_0 = 680;
                                  stackIn_39_0 = stackOut_38_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  L1: {
                                    if (0 == (param0.field_c ^ -1)) {
                                      break L1;
                                    } else {
                                      if (-3 == param0.field_c) {
                                        break L1;
                                      } else {
                                        if (1 == (param0.field_c ^ -1)) {
                                          break L1;
                                        } else {
                                          if ((param0.field_c ^ -1) != -27) {
                                            stackOut_47_0 = 423;
                                            stackIn_48_0 = stackOut_47_0;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_45_0 = 0;
                                  stackIn_46_0 = stackOut_45_0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackOut_26_0 = 680;
                            stackIn_27_0 = stackOut_26_0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackOut_23_0 = 680;
                          stackIn_24_0 = stackOut_23_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackOut_20_0 = 680;
                        stackIn_21_0 = stackOut_20_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackOut_9_0 = 680;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var2);
            stackOut_49_1 = new StringBuilder().append("po.B(");
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
              break L2;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_21_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_27_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_31_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_39_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_46_0;
                              } else {
                                return stackIn_48_0;
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
    }

    final static void a(int param0, boolean param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        js var3 = null;
        if (fb.field_J != null) {
          if (fb.field_J.a((byte) -122, param1)) {
            fb.field_J = null;
            if (param0 != -27) {
              var3 = (js) null;
              discarded$6 = po.a((js) null, 65);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -27) {
              var3 = (js) null;
              discarded$7 = po.a((js) null, 65);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -27) {
            var3 = (js) null;
            discarded$8 = po.a((js) null, 65);
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_b = "Invite players";
        field_d = "Orb coins: ";
        field_a = new String[]{"Detach", "Zoom"};
        field_g = "Your player sold successfully! The Auction House takes 10% of your bid of <%0>, giving you <%1>.";
        field_c = "The following settings need to be changed:  ";
    }
}
