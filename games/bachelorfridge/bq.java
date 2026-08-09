/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends wia {
    boolean field_o;

    bq(int param0) {
        super(param0);
    }

    final static boolean a(String param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (kaa.a(param0, (byte) 63)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (tfa.a(41, param0)) {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (eha.a(15, param0)) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (param1 == 20133) {
                    if (-1 == (param2.length() ^ -1)) {
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (vs.a(param1 + -20165, param2, param0)) {
                        stackIn_22_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (cw.a(param0, param2, true)) {
                          stackIn_26_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (!db.a(param2, param0, false)) {
                            stackIn_31_0 = 1;
                            decompiledRegionSelector0 = 8;
                            break L0;
                          } else {
                            stackIn_29_0 = 0;
                            decompiledRegionSelector0 = 7;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    stackIn_14_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var3);

            stackIn_34_1 = new StringBuilder().append("bq.A(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L1;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L2;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_26_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0 != 0;
                      } else {
                        return stackIn_31_0 != 0;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    static {
    }
}
