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
        int var3 = 0;
        int var4 = 0;
        he stackIn_15_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        he stackOut_14_0 = null;
        l stackOut_22_0 = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (lk) (Object) ci.field_o.a((byte) -26);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1_ref == null) {
                      break L4;
                    } else {
                      var4 = var1_ref.field_Gb;
                      var3 = 0;
                      if (var2 != 0) {
                        if (var3 <= var4) {
                          L5: while (true) {
                            var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                            if (var1_ref == null) {
                              break L2;
                            } else {
                              if (var2 == 0) {
                                if (var1_ref.field_Gb <= 0) {
                                  continue L5;
                                } else {
                                  var1_ref.field_Gb = var1_ref.field_Gb - 1;
                                  if (0 != var1_ref.field_Gb) {
                                    continue L5;
                                  } else {
                                    var1_ref.field_Wb = 0;
                                    if (!var1_ref.g(0)) {
                                      continue L5;
                                    } else {
                                      var1_ref.a(false);
                                      continue L5;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                        } else {
                          L6: while (true) {
                            L7: {
                              var1_ref.field_Gb = var1_ref.field_Gb - 1;
                              if (0 != var1_ref.field_Gb) {
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
                            L8: while (true) {
                              var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                              if (var1_ref == null) {
                                break L2;
                              } else {
                                if (var2 == 0) {
                                  if (var1_ref.field_Gb <= 0) {
                                    continue L8;
                                  } else {
                                    continue L6;
                                  }
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L9: {
                          if (var3 >= var4) {
                            break L9;
                          } else {
                            var1_ref.field_Gb = var1_ref.field_Gb - 1;
                            if (var1_ref.field_Gb != 0) {
                              break L9;
                            } else {
                              var1_ref.field_Wb = 0;
                              if (!var1_ref.g(0)) {
                                break L9;
                              } else {
                                var1_ref.a(false);
                                break L9;
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
                  var1_ref2 = (he) (Object) te.field_f.a((byte) -94);
                  pl.a(true);
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var1_ref2 == null) {
                          break L12;
                        } else {
                          stackOut_14_0 = (he) var1_ref2;
                          stackIn_23_0 = (Object) (Object) stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var2 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if (stackIn_15_0.field_Mb > 0) {
                                var1_ref2.field_Mb = var1_ref2.field_Mb - 1;
                                if (0 == var1_ref2.field_Mb) {
                                  var1_ref2.field_Eb = 0;
                                  if (!var1_ref2.f((byte) -89)) {
                                    break L13;
                                  } else {
                                    var1_ref2.a(false);
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var1_ref2 = (he) (Object) te.field_f.a(16213);
                            if (var2 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      stackOut_22_0 = qm.field_Mb.a((byte) -51);
                      stackIn_23_0 = (Object) (Object) stackOut_22_0;
                      break L11;
                    }
                    var1_ref = (lk) (Object) stackIn_23_0;
                    L14: while (true) {
                      if (var1_ref == null) {
                        break L2;
                      } else {
                        if (var2 == 0) {
                          L15: {
                            if (var1_ref.field_Gb <= 0) {
                              break L15;
                            } else {
                              var1_ref.field_Gb = var1_ref.field_Gb - 1;
                              if (0 != var1_ref.field_Gb) {
                                break L15;
                              } else {
                                var1_ref.field_Wb = 0;
                                if (!var1_ref.g(0)) {
                                  break L15;
                                } else {
                                  var1_ref.a(false);
                                  break L15;
                                }
                              }
                            }
                          }
                          var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                          continue L14;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                return;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "pl.B(" + 1 + 41);
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 < -44) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_2_0 = p.a(param2, 4330, true, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pl.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final static bk a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        vi stackIn_3_0 = null;
        re stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_2_0 = null;
        mh stackOut_9_0 = null;
        re stackOut_5_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != 0L) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackOut_2_0 = new vi(param1, param3);
                  stackIn_3_0 = stackOut_2_0;
                  return (bk) (Object) stackIn_3_0;
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
              stackOut_9_0 = new mh(param0, param3);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_5_0 = new re(param0, param3);
              stackIn_6_0 = stackOut_5_0;
              return (bk) (Object) stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("pl.C(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param4 + 41);
        }
        return (bk) (Object) stackIn_10_0;
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -88) {
          field_e = null;
          field_d = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_e = null;
          return;
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
