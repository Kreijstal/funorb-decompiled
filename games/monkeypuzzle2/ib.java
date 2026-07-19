/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static le field_d;
    static int field_a;
    static le field_b;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final boolean b(int param0) {
        if (param0 == 2) {
          if (this != qk.field_c) {
            if (ea.field_a != this) {
              if (this == wh.field_b) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= jk.field_A) {
                    break L3;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (null == jk.field_C[var2]) {
                            break L5;
                          } else {
                            if (!jk.field_C[var2].h()) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var1_int = 1;
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                      var2++;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var1_int == 0) {
                  break L2;
                } else {
                  jk.field_C[var2] = li.a(ke.field_h[2], param0, 96);
                  na.a((byte) 38, jk.field_C[var2]);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "ib.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_d = null;
        int var1 = 1 % ((-67 - param0) / 49);
    }

    static {
    }
}
