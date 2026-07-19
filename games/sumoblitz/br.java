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
        try {
            InterruptedException var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                Thread.sleep(param0);
                if (param1 == -21) {
                  break L0;
                } else {
                  br.a(-109L, (byte) 47);
                  return;
                }
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
        if (!this.field_f) {
          if (2 != this.field_g) {
            if (param0 < -79) {
              if (this.field_j == qj.field_d) {
                return 1;
              } else {
                if (-3 == (wh.field_s ^ -1)) {
                  if (!lc.a(false, this.field_d)) {
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
            if ((this.field_a ^ -1) >= -1) {
              if (param0 < -79) {
                if (this.field_j == qj.field_d) {
                  return 1;
                } else {
                  if (-3 == (wh.field_s ^ -1)) {
                    if (!lc.a(false, this.field_d)) {
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
        L0: {
          L1: {
            this.field_c = jt.field_w;
            this.field_f = is.field_a;
            this.field_a = wn.field_a;
            this.field_j = bb.field_j;
            this.field_h = eh.field_c;
            this.field_g = jb.field_h;
            this.field_e = oi.field_c;
            this.field_d = fu.field_E;
            if (param0) {
              break L1;
            } else {
              this.field_b = null;
              if (!Sumoblitz.field_L) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          this.field_b = tm.field_c;
          break L0;
        }
    }

    static {
        field_i = "INSTRUCTIONS";
    }
}
