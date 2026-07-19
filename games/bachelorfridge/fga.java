/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fga extends kj {
    static int field_f;
    private vca field_g;
    static vr field_h;

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_g = (vca) null;
        }
    }

    final boolean b(int param0) {
        if (param0 <= 21) {
            return true;
        }
        return this.field_g.b(false);
    }

    final static void a(int param0, byte param1) {
        try {
            Object discarded$1 = null;
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == -2) {
                break L0;
              } else {
                field_f = -112;
                break L0;
              }
            }
            try {
              L1: {
                discarded$1 = ac.a(nia.d(param1 + -31766), "resizing", new Object[]{new Integer(param0)}, (byte) 73);
                break L1;
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

    fga(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        try {
            this.field_g = new vca(taa.field_u, Integer.toString(param3), 16736256, 20, 30, 50);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "fga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          this.a(112, -105, -15);
          this.field_g.a(32 + param0, param2 - -64, false);
          return;
        } else {
          this.field_g.a(32 + param0, param2 - -64, false);
          return;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            fga.a(126, (byte) -89);
            field_h = null;
            return;
        }
        field_h = null;
    }

    static {
    }
}
