/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;

    final static void a(int param0, int param1) {
        try {
            int discarded$2 = 0;
            Object discarded$3 = null;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param1 == -27844) {
                    break L1;
                  } else {
                    discarded$2 = ka.a(-22);
                    break L1;
                  }
                }
                discarded$3 = oa.a(kk.c(-14047), 22347, "resizing", new Object[]{new Integer(param0)});
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        int var1 = -117 % ((param0 - 69) / 55);
        field_a = null;
    }

    final static int a(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            discarded$12 = ug.field_A.a(rk.field_g, true, mk.field_m, (byte) 124);
            ug.field_A.f(true);
            L1: while (true) {
              L2: {
                L3: {
                  if (!ji.a((byte) -72)) {
                    break L3;
                  } else {
                    discarded$13 = ug.field_A.a((byte) 86, pe.field_b, da.field_b);
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 2) {
                  break L2;
                } else {
                  field_a = (String) null;
                  break L2;
                }
              }
              if ((il.field_c ^ -1) != 0) {
                var1_int = il.field_c;
                ni.a(-126, -1);
                stackOut_10_0 = var1_int;
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!gb.field_d) {
                  if (ee.field_c != ca.field_i) {
                    if (!qa.field_c.b(12)) {
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      if (ca.field_i != bk.field_c) {
                        stackOut_25_0 = -1;
                        stackIn_26_0 = stackOut_25_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        stackOut_23_0 = 2;
                        stackIn_24_0 = stackOut_23_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      }
                    }
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  stackOut_13_0 = 3;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "ka.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0;
                } else {
                  return stackIn_26_0;
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Suggested names: ";
    }
}
