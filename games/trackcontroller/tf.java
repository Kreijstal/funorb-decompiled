/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    static String field_b;
    static int field_a;

    final static oi a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var6 = TrackController.field_F ? 1 : 0;
        var2 = param1.length();
        if (param0 == var2) {
          return oc.field_j;
        } else {
          if (-65 <= (var2 ^ -1)) {
            if (param1.charAt(0) == 34) {
              if (param1.charAt(var2 - 1) == 34) {
                var3 = 0;
                var4 = 1;
                L0: while (true) {
                  if (-1 + var2 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 == 92) {
                      L1: {
                        if (var3 != 0) {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          break L1;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L1;
                        }
                      }
                      var3 = stackIn_17_0;
                      var4++;
                      continue L0;
                    } else {
                      L2: {
                        if (var5 != 34) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            return fh.field_e;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return fh.field_e;
              }
            } else {
              var3 = 0;
              var4 = 0;
              L3: while (true) {
                if (var4 < var2) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L4: {
                      if (0 == var4) {
                        break L4;
                      } else {
                        if (-1 + var2 == var4) {
                          break L4;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    return fh.field_e;
                  } else {
                    if ((qk.field_O.indexOf(var5) ^ -1) != 0) {
                      var3 = 0;
                      var4++;
                      continue L3;
                    } else {
                      return fh.field_e;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            return bl.field_c;
          }
        }
    }

    final static rc a(int param0, boolean param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            rc var5 = null;
            ub var5_ref = null;
            rc stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            rc stackOut_2_0 = null;
            try {
              L0: {
                var4 = Class.forName("qb");
                if (param1) {
                  break L0;
                } else {
                  field_b = null;
                  break L0;
                }
              }
              var5 = (rc) var4.newInstance();
              var5.a(param0, -48, param3, param2);
              stackOut_2_0 = (rc) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -1) {
            tf.a(26);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "It's the opening morning of your model railway exhibition, and you find that the delivery men have scattered your blocks of track seemingly at random.  Panic!  You must act quickly to push them into the right layout before the public arrive.  The task is complicated by the curious design of the exhibition hall, which has some highly polished floors and conveyor belts.";
    }
}
