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
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_16_0 = 0;
                  break L3;
                } else {
                  stackIn_16_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var3);

            stackIn_19_1 = new StringBuilder().append("po.A(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_22_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_16_0 != 0;
        }
    }

    final static int a(js param0, int param1) {
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
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if ((param0.field_c ^ -1) == -24) {
              stackIn_3_0 = 680;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (24 == param0.field_c) {
                stackIn_7_0 = 440;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((param0.field_c ^ -1) != -26) {
                  if (param0.field_c == 16) {
                    stackIn_14_0 = 680;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (-19 == (param0.field_c ^ -1)) {
                      stackIn_18_0 = 680;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((param0.field_c ^ -1) != 4) {
                        if (param0.field_c != param1) {
                          if ((param0.field_c ^ -1) != -20) {
                            if (20 == param0.field_c) {
                              stackIn_31_0 = 680;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            } else {
                              if ((param0.field_c ^ -1) == -22) {
                                stackIn_35_0 = 680;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              } else {
                                if (-23 == (param0.field_c ^ -1)) {
                                  stackIn_39_0 = 680;
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
                                            stackIn_48_0 = 423;
                                            decompiledRegionSelector0 = 12;
                                            break L0;
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackIn_46_0 = 0;
                                  decompiledRegionSelector0 = 11;
                                  break L0;
                                }
                              }
                            }
                          } else {
                            stackIn_27_0 = 680;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        } else {
                          stackIn_24_0 = 680;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_21_0 = 680;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_10_0 = 680;
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
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("po.B(");

            if (param0 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L2;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
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
        js var3;
        if (fb.field_J != null) {
          if (fb.field_J.a((byte) -122, param1)) {
            fb.field_J = null;
            if (param0 != -27) {
              var3 = (js) null;
              po.a((js) null, 65);
              return;
            } else {
              return;
            }
          } else {
            if (param0 != -27) {
              var3 = (js) null;
              po.a((js) null, 65);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != -27) {
            var3 = (js) null;
            po.a((js) null, 65);
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
