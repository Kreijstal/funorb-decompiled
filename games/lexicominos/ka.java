/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static String field_a;

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 == -27844) {
                  break L0;
                } else {
                  int discarded$2 = ka.a(-22);
                  break L0;
                }
              }
              Object discarded$3 = oa.a(kk.c(-14047), 22347, "resizing", new Object[1]);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
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
        int var1 = 0;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        boolean discarded$12 = ug.field_A.a(rk.field_g, true, mk.field_m, (byte) 124);
        ug.field_A.f(true);
        L0: while (true) {
          if (!ji.a((byte) -72)) {
            if (param0 == 2) {
              if ((il.field_c ^ -1) != 0) {
                var1 = il.field_c;
                ni.a(-126, -1);
                return var1;
              } else {
                if (!gb.field_d) {
                  if (ee.field_c != ca.field_i) {
                    if (!qa.field_c.b(12)) {
                      return 1;
                    } else {
                      if (ca.field_i == bk.field_c) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              }
            } else {
              field_a = null;
              if ((il.field_c ^ -1) != 0) {
                var1 = il.field_c;
                ni.a(-126, -1);
                return var1;
              } else {
                if (!gb.field_d) {
                  if (ee.field_c != ca.field_i) {
                    if (!qa.field_c.b(12)) {
                      return 1;
                    } else {
                      if (ca.field_i == bk.field_c) {
                        return 2;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 3;
                }
              }
            }
          } else {
            boolean discarded$13 = ug.field_A.a((byte) 86, pe.field_b, da.field_b);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Suggested names: ";
    }
}
