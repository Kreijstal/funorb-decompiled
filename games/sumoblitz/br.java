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
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            if (param1 != -21) {
              br.a(-109L, (byte) 47);
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
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
        if (this.field_f) {
          return 2;
        }
        if (2 == this.field_g) {
          if (this.field_a > 0) {
            return 2;
          }
          if (param0 >= -79) {
            return -19;
          }
          if (this.field_j == qj.field_d) {
            return 1;
          }
          if (wh.field_s != 2) {
            return 0;
          }
          if (lc.a(false, this.field_d)) {
            return 1;
          }
          return 0;
        }
        if (param0 >= -79) {
          return -19;
        }
        if (this.field_j == qj.field_d) {
          return 1;
        }
        if (wh.field_s != 2) {
          return 0;
        }
        if (lc.a(false, this.field_d)) {
          return 1;
        }
        return 0;
    }

    public static void a(int param0) {
        if (param0 != 23050) {
          return;
        }
        field_i = null;
    }

    br(boolean param0) {
        this.field_c = jt.field_w;
        this.field_f = is.field_a;
        this.field_a = wn.field_a;
        this.field_j = bb.field_j;
        this.field_h = eh.field_c;
        this.field_g = jb.field_h;
        this.field_e = oi.field_c;
        this.field_d = fu.field_E;
        if (!param0) {
          this.field_b = null;
        } else {
          this.field_b = tm.field_c;
        }
    }

    static {
        field_i = "INSTRUCTIONS";
    }
}
