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
        RuntimeException decompiledCaughtException = null;
        lk var1 = null;
        he var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1 = (lk) ((Object) ci.field_o.a((byte) -26));
            L1: while (true) {
              if (var1 == null) {
                L2: {
                  var1_ref = (he) ((Object) te.field_f.a((byte) -94));
                  if (!param0) {
                    break L2;
                  } else {
                    pl.a(true);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var1_ref == null) {
                    var1 = (lk) ((Object) qm.field_Mb.a((byte) -51));
                    L4: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L5: {
                          if (-1 <= (var1.field_Gb ^ -1)) {
                            break L5;
                          } else {
                            var1.field_Gb = var1.field_Gb - 1;
                            if (0 != var1.field_Gb) {
                              break L5;
                            } else {
                              var1.field_Wb = 0;
                              if (!var1.g(0)) {
                                break L5;
                              } else {
                                var1.a(false);
                                break L5;
                              }
                            }
                          }
                        }
                        var1 = (lk) ((Object) qm.field_Mb.a(16213));
                        continue L4;
                      }
                    }
                  } else {
                    L6: {
                      if ((var1_ref.field_Mb ^ -1) < -1) {
                        var1_ref.field_Mb = var1_ref.field_Mb - 1;
                        if (0 == var1_ref.field_Mb) {
                          var1_ref.field_Eb = 0;
                          if (!var1_ref.f((byte) -89)) {
                            break L6;
                          } else {
                            var1_ref.a(false);
                            break L6;
                          }
                        } else {
                          var1_ref = (he) ((Object) te.field_f.a(16213));
                          continue L3;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var1_ref = (he) ((Object) te.field_f.a(16213));
                    continue L3;
                  }
                }
              } else {
                L7: {
                  if (0 >= var1.field_Gb) {
                    break L7;
                  } else {
                    var1.field_Gb = var1.field_Gb - 1;
                    if (var1.field_Gb != 0) {
                      break L7;
                    } else {
                      var1.field_Wb = 0;
                      if (!var1.g(0)) {
                        break L7;
                      } else {
                        var1.a(false);
                        break L7;
                      }
                    }
                  }
                }
                var1 = (lk) ((Object) ci.field_o.a(16213));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref2), "pl.B(" + param0 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -44) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = p.a(param2, 4330, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pl.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static bk a(long param0, String param1, int param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        vi stackIn_3_0 = null;
        re stackIn_6_0 = null;
        mh stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((param0 ^ -1L) != -1L) {
                break L1;
              } else {
                if (param1 == null) {
                  break L1;
                } else {
                  stackIn_3_0 = new vi(param1, param3);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (!param4) {
              L2: {
                if (param2 > 126) {
                  break L2;
                } else {
                  field_d = (String) null;
                  break L2;
                }
              }
              stackIn_10_0 = new mh(param0, param3);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_6_0 = new re(param0, param3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("pl.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (bk) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (bk) ((Object) stackIn_6_0);
          } else {
            return (bk) ((Object) stackIn_10_0);
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -88) {
          field_e = (String) null;
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
        field_f = "You are offering to draw.";
        field_c = -1;
        field_d = "Loading models";
        field_e = "You are invited to <%0>'s game.";
    }
}
