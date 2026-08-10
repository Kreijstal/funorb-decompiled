/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            try {
              L0: {
                L1: {
                  if (param1 == -27844) {
                    break L1;
                  } else {
                    ka.a(-22);
                    break L1;
                  }
                }
                oa.a(kk.c(-14047), 22347, "resizing", new Object[]{new Integer(param0)});
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
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            ug.field_A.a(rk.field_g, true, mk.field_m, (byte) 124);
            ug.field_A.f(true);
            L1: while (true) {
              if (!ji.a((byte) -72)) {
                L2: {
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
                  stackIn_9_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (!gb.field_d) {
                    if (ee.field_c != ca.field_i) {
                      if (!qa.field_c.b(12)) {
                        stackIn_19_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        if (ca.field_i != bk.field_c) {
                          stackIn_24_0 = -1;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          stackIn_22_0 = 2;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    } else {
                      stackIn_15_0 = 1;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = 3;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                ug.field_A.a((byte) 86, pe.field_b, da.field_b);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "ka.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0;
                } else {
                  return stackIn_24_0;
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
