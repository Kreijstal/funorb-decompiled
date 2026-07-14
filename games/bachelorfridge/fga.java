/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fga extends kj {
    static int field_f;
    private vca field_g;
    static vr field_h;

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((fga) this).field_g = null;
        }
    }

    final boolean b(int param0) {
        if (param0 <= 21) {
            return true;
        }
        return ((fga) this).field_g.b(false);
    }

    final static void a(int param0, byte param1) {
        try {
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
              Object discarded$1 = ac.a(nia.d(param1 + -31766), "resizing", new Object[1], (byte) 73);
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

    fga(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((fga) this).field_g = new vca((po) (Object) taa.field_u, Integer.toString(param3), 16736256, 20, 30, 50);
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
          ((fga) this).a(112, -105, -15);
          ((fga) this).field_g.a(32 + param0, param2 - -64, false);
          return;
        } else {
          ((fga) this).field_g.a(32 + param0, param2 - -64, false);
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
