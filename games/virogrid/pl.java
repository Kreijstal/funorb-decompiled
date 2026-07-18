/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static int field_b;
    static int field_c;
    static String field_f;
    static km field_a;
    static String field_d;
    static String field_e;

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        lk var1_ref = null;
        he var1_ref2 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        he stackIn_21_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        he stackOut_20_0 = null;
        l stackOut_33_0 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (lk) (Object) ci.field_o.a((byte) -26);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var1_ref) {
                      break L4;
                    } else {
                      stackOut_3_0 = 0;
                      stackOut_3_1 = var1_ref.field_Gb;
                      stackIn_39_0 = stackOut_3_0;
                      stackIn_39_1 = stackOut_3_1;
                      stackIn_4_0 = stackOut_3_0;
                      stackIn_4_1 = stackOut_3_1;
                      if (var2 != 0) {
                        L5: while (true) {
                          L6: {
                            if (stackIn_39_0 <= stackIn_39_1) {
                              break L6;
                            } else {
                              var1_ref.field_Gb = var1_ref.field_Gb - 1;
                              if (0 != var1_ref.field_Gb) {
                                break L6;
                              } else {
                                var1_ref.field_Wb = 0;
                                if (!var1_ref.g(0)) {
                                  break L6;
                                } else {
                                  var1_ref.a(false);
                                  break L6;
                                }
                              }
                            }
                          }
                          var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                          if (var2 == 0) {
                            if (null == var1_ref) {
                              break L3;
                            } else {
                              if (var2 != 0) {
                                break L2;
                              } else {
                                stackOut_37_0 = -1;
                                stackOut_37_1 = ~var1_ref.field_Gb;
                                stackIn_39_0 = stackOut_37_0;
                                stackIn_39_1 = stackOut_37_1;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      } else {
                        L7: {
                          if (stackIn_4_0 >= stackIn_4_1) {
                            break L7;
                          } else {
                            var1_ref.field_Gb = var1_ref.field_Gb - 1;
                            if (var1_ref.field_Gb != 0) {
                              break L7;
                            } else {
                              var1_ref.field_Wb = 0;
                              if (!var1_ref.g(0)) {
                                break L7;
                              } else {
                                var1_ref.a(false);
                                break L7;
                              }
                            }
                          }
                        }
                        var1_ref = (lk) (Object) ci.field_o.a(16213);
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    var1_ref2 = (he) (Object) te.field_f.a((byte) -94);
                    if (!param0) {
                      break L8;
                    } else {
                      pl.a(true);
                      break L8;
                    }
                  }
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (var1_ref2 == null) {
                          break L11;
                        } else {
                          stackOut_20_0 = (he) var1_ref2;
                          stackIn_34_0 = (Object) (Object) stackOut_20_0;
                          stackIn_21_0 = stackOut_20_0;
                          if (var2 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (stackIn_21_0.field_Mb > 0) {
                                var1_ref2.field_Mb = var1_ref2.field_Mb - 1;
                                if (0 == var1_ref2.field_Mb) {
                                  var1_ref2.field_Eb = 0;
                                  if (!var1_ref2.f((byte) -89)) {
                                    break L12;
                                  } else {
                                    var1_ref2.a(false);
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                            var1_ref2 = (he) (Object) te.field_f.a(16213);
                            if (var2 == 0) {
                              continue L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      stackOut_33_0 = qm.field_Mb.a((byte) -51);
                      stackIn_34_0 = (Object) (Object) stackOut_33_0;
                      break L10;
                    }
                    var1_ref = (lk) (Object) stackIn_34_0;
                    L13: while (true) {
                      if (null == var1_ref) {
                        break L3;
                      } else {
                        if (var2 != 0) {
                          break L2;
                        } else {
                          stackOut_37_0 = -1;
                          stackOut_37_1 = ~var1_ref.field_Gb;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_39_1 = stackOut_37_1;
                          L14: {
                            if (stackIn_39_0 <= stackIn_39_1) {
                              break L14;
                            } else {
                              var1_ref.field_Gb = var1_ref.field_Gb - 1;
                              if (0 != var1_ref.field_Gb) {
                                break L14;
                              } else {
                                var1_ref.field_Wb = 0;
                                if (!var1_ref.g(0)) {
                                  break L14;
                                } else {
                                  var1_ref.a(false);
                                  break L14;
                                }
                              }
                            }
                          }
                          var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                          if (var2 == 0) {
                            continue L13;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "pl.B(" + param0 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_3_0 = p.a(param2, 4330, true, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pl.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static bk a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        vi stackIn_5_0 = null;
        re stackIn_8_0 = null;
        mh stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_4_0 = null;
        mh stackOut_12_0 = null;
        re stackOut_7_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != 0L) {
                break L1;
              } else {
                if (null == param1) {
                  break L1;
                } else {
                  stackOut_4_0 = new vi(param1, param3);
                  stackIn_5_0 = stackOut_4_0;
                  return (bk) (Object) stackIn_5_0;
                }
              }
            }
            if (!param4) {
              L2: {
                if (param2 > 126) {
                  break L2;
                } else {
                  field_d = null;
                  break L2;
                }
              }
              stackOut_12_0 = new mh(param0, param3);
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_7_0 = new re(param0, param3);
              stackIn_8_0 = stackOut_7_0;
              return (bk) (Object) stackIn_8_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("pl.C(").append(param0).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param4 + ')');
        }
        return (bk) (Object) stackIn_13_0;
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              if (param0 < -88) {
                break L1;
              } else {
                field_e = null;
                break L1;
              }
            }
            field_d = null;
            field_a = null;
            field_e = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "pl.D(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "You are offering to draw.";
        field_c = -1;
        field_d = "Loading models";
        field_e = "You are invited to <%0>'s game.";
    }
}
