/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br {
    int field_h;
    int field_c;
    private long field_j;
    private String field_d;
    static String field_i;
    private boolean field_f;
    int field_g;
    int[] field_b;
    private int field_a;
    String field_e;

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param0);
                        if (param1 == -21) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        br.a(-109L, (byte) 47);
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int b(int param0) {
        if (param0 > -3) {
            br.a(101);
            return 1;
        }
        return 1;
    }

    final int c(int param0) {
        if (!((br) this).field_f) {
          if (2 != ((br) this).field_g) {
            if (param0 < -79) {
              if (((br) this).field_j == qj.field_d) {
                return 1;
              } else {
                if (-3 == (wh.field_s ^ -1)) {
                  if (!lc.a(false, ((br) this).field_d)) {
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return -19;
            }
          } else {
            if ((((br) this).field_a ^ -1) >= -1) {
              if (param0 < -79) {
                if (((br) this).field_j == qj.field_d) {
                  return 1;
                } else {
                  if (-3 == (wh.field_s ^ -1)) {
                    if (!lc.a(false, ((br) this).field_d)) {
                      return 0;
                    } else {
                      return 1;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return -19;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    public static void a(int param0) {
        if (param0 != 23050) {
            return;
        }
        field_i = null;
    }

    br(boolean param0) {
        ((br) this).field_c = jt.field_w;
        ((br) this).field_f = is.field_a;
        ((br) this).field_a = wn.field_a;
        ((br) this).field_j = bb.field_j;
        ((br) this).field_h = eh.field_c;
        ((br) this).field_g = jb.field_h;
        ((br) this).field_e = oi.field_c;
        ((br) this).field_d = fu.field_E;
        if (!param0) {
            ((br) this).field_b = null;
        } else {
            ((br) this).field_b = tm.field_c;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "INSTRUCTIONS";
    }
}
