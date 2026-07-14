/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class hk extends pb {
    static jp field_d;
    static ko field_e;

    hk() {
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        we var4 = null;
        pp var5 = null;
        var3 = CrazyCrystals.field_B;
        var4 = (we) (Object) tb.field_b.g(32073);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == 5) {
              var5 = (pp) (Object) nh.field_A.g(param0 ^ 32076);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  pk.a(param1, var5, (byte) 113);
                  var5 = (pp) (Object) nh.field_A.a(false);
                  continue L1;
                }
              }
            } else {
              hk.b(72);
              var5 = (pp) (Object) nh.field_A.g(param0 ^ 32076);
              L2: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  pk.a(param1, var5, (byte) 113);
                  var5 = (pp) (Object) nh.field_A.a(false);
                  continue L2;
                }
              }
            }
          } else {
            pm.a(param1, var4, (byte) 71);
            var4 = (we) (Object) tb.field_b.a(false);
            continue L0;
          }
        }
    }

    final int a(byte param0, boolean param1) {
        if (param0 >= -53) {
            field_e = null;
            return 30;
        }
        return 30;
    }

    final void a(boolean param0, ta param1, boolean param2) {
        if (param0) {
          int discarded$2 = ((hk) this).a(-126, -48);
          param1.field_g = param1.field_g + 1;
          return;
        } else {
          param1.field_g = param1.field_g + 1;
          return;
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 6388) {
            field_e = null;
        }
    }

    final int a(int param0, int param1) {
        Object var4 = null;
        if (param0 != 1843275042) {
          var4 = null;
          ((hk) this).a(true, (ta) null, false);
          return vm.field_j[param1].size();
        } else {
          return vm.field_j[param1].size();
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            int var2_int = 0;
            Throwable var2 = null;
            java.net.URL var3 = null;
            String var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              var2_int = -109 / ((59 - param0) / 33);
              var3 = param1.getCodeBase();
              var4 = gh.a(param1, var3, (byte) 67).getFile();
              Object discarded$6 = hi.a(-3729, "updatelinks", param1, new Object[2]);
              Object discarded$7 = hi.a(-3729, "updatelinks", param1, new Object[2]);
              Object discarded$8 = hi.a(-3729, "updatelinks", param1, new Object[2]);
              Object discarded$9 = hi.a(-3729, "updatelinks", param1, new Object[2]);
              Object discarded$10 = hi.a(-3729, "updatelinks", param1, new Object[2]);
              Object discarded$11 = hi.a(-3729, "updatelinks", param1, new Object[2]);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new jp();
    }
}
