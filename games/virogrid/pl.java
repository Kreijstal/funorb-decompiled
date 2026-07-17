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
        RuntimeException decompiledCaughtException = null;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = (lk) (Object) ci.field_o.a((byte) -26);
            L1: while (true) {
              if (var1_ref == null) {
                L2: {
                  var1_ref2 = (he) (Object) te.field_f.a((byte) -94);
                  if (!param0) {
                    break L2;
                  } else {
                    pl.a(true);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (lk) (Object) qm.field_Mb.a((byte) -51);
                    L4: while (true) {
                      if (var1_ref == null) {
                        break L0;
                      } else {
                        L5: {
                          if (var1_ref.field_Gb <= 0) {
                            break L5;
                          } else {
                            var1_ref.field_Gb = var1_ref.field_Gb - 1;
                            if (0 != var1_ref.field_Gb) {
                              break L5;
                            } else {
                              var1_ref.field_Wb = 0;
                              if (!var1_ref.g(0)) {
                                break L5;
                              } else {
                                var1_ref.a(false);
                                break L5;
                              }
                            }
                          }
                        }
                        var1_ref = (lk) (Object) qm.field_Mb.a(16213);
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var1_ref2.field_Mb > 0) {
                        var1_ref2.field_Mb = var1_ref2.field_Mb - 1;
                        if (0 == var1_ref2.field_Mb) {
                          var1_ref2.field_Eb = 0;
                          if (!var1_ref2.f((byte) -89)) {
                            break L6;
                          } else {
                            var1_ref2.a(false);
                            break L6;
                          }
                        } else {
                          var1_ref2 = (he) (Object) te.field_f.a(16213);
                          continue L3;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref2 = (he) (Object) te.field_f.a(16213);
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (0 >= var1_ref.field_Gb) {
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
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "pl.B(" + param0 + 41);
        }
    }

    final static int a(byte param0, CharSequence param1) {
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
            stackOut_2_0 = p.a(16, 4330, true, param1);
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
          throw kg.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 16 + 41);
        }
        return stackIn_3_0;
    }

    final static bk a(long param0, String param1, int param2, String param3) {
        RuntimeException var6 = null;
        vi stackIn_3_0 = null;
        re stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_2_0 = null;
        re stackOut_4_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_4_0 = new re(param0, param3);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var6;
            stackOut_7_1 = new StringBuilder().append("pl.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(127).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 0 + 41);
        }
        return (bk) (Object) stackIn_5_0;
    }

    public static void a() {
        field_f = null;
        field_d = null;
        field_a = null;
        field_e = null;
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
