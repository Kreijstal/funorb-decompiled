/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_b;
    static int field_a;

    final static oi a(int param0, String param1) {
        oi stackIn_4_0 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        int stackIn_21_0 = 0;
        oi stackIn_26_0 = null;
        oi stackIn_40_0 = null;
        oi stackIn_44_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 == var2_int) {
              stackIn_4_0 = oc.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param1.charAt(0) == 34) {
                  if (param1.charAt(var2_int - 1) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L1: while (true) {
                      if (-1 + var2_int > var4) {
                        L2: {
                          var5 = param1.charAt(var4);
                          if (var5 == 92) {
                            L3: {
                              if (var3 != 0) {
                                stackIn_21_0 = 0;
                                break L3;
                              } else {
                                stackIn_21_0 = 1;
                                break L3;
                              }
                            }
                            var3 = stackIn_21_0;
                            break L2;
                          } else {
                            L4: {
                              if (var5 != 34) {
                                break L4;
                              } else {
                                if (var3 == 0) {
                                  stackIn_26_0 = fh.field_e;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            var3 = 0;
                            break L2;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_12_0 = fh.field_e;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  var3 = 0;
                  var4 = 0;
                  L5: while (true) {
                    if (var4 < var2_int) {
                      L6: {
                        var5 = param1.charAt(var4);
                        if (var5 == 46) {
                          L7: {
                            if (0 == var4) {
                              break L7;
                            } else {
                              if (-1 + var2_int == var4) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  var3 = 1;
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          stackIn_40_0 = fh.field_e;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if ((qk.field_O.indexOf(var5) ^ -1) != 0) {
                            var3 = 0;
                            break L6;
                          } else {
                            stackIn_44_0 = fh.field_e;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      }
                      var4++;
                      continue L5;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                stackIn_7_0 = bl.field_c;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_50_0 = (RuntimeException) (var2);

            stackIn_50_1 = new StringBuilder().append("tf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L8;
            } else {
              stackIn_51_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L8;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_51_0), stackIn_51_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_40_0;
                } else {
                  return stackIn_44_0;
                }
              }
            }
          }
        }
    }

    final static rc a(int param0, boolean param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            rc var5 = null;
            ub var5_ref = null;
            rc stackIn_3_0 = null;
            ub stackIn_5_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var4 = Class.forName("qb");
                      if (param1) {
                        break L2;
                      } else {
                        field_b = (String) null;
                        break L2;
                      }
                    }
                    var5 = (rc) (var4.newInstance());
                    var5.a(param0, -48, param3, param2);
                    stackIn_3_0 = (rc) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new ub();
                  ((rc) ((Object) var5_ref)).a(param0, -123, param3, param2);
                  stackIn_5_0 = (ub) (var5_ref);
                  return (rc) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var4_ref2);

                stackIn_8_1 = new StringBuilder().append("tf.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            tf.a(26);
        }
    }

    static {
        field_b = "It's the opening morning of your model railway exhibition, and you find that the delivery men have scattered your blocks of track seemingly at random.  Panic!  You must act quickly to push them into the right layout before the public arrive.  The task is complicated by the curious design of the exhibition hall, which has some highly polished floors and conveyor belts.";
    }
}
