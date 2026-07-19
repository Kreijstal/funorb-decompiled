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
        RuntimeException var2 = null;
        int var3 = 0;
        we var4 = null;
        pp var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = CrazyCrystals.field_B;
        try {
          L0: {
            var4 = (we) ((Object) tb.field_b.g(32073));
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  if (param0 == 5) {
                    break L2;
                  } else {
                    hk.b(72);
                    break L2;
                  }
                }
                var5 = (pp) ((Object) nh.field_A.g(param0 ^ 32076));
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pk.a(param1, var5, (byte) 113);
                    var5 = (pp) ((Object) nh.field_A.a(false));
                    continue L3;
                  }
                }
              } else {
                pm.a(param1, var4, (byte) 71);
                var4 = (we) ((Object) tb.field_b.a(false));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var2), "hk.J(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(byte param0, boolean param1) {
        if (param0 >= -53) {
            field_e = (ko) null;
            return 30;
        }
        return 30;
    }

    final void a(boolean param0, ta param1, boolean param2) {
        int discarded$0 = 0;
        try {
            if (param0) {
                discarded$0 = this.a(-126, -48);
            }
            param1.field_g = param1.field_g + 1;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "hk.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 6388) {
            field_e = (ko) null;
        }
    }

    final int a(int param0, int param1) {
        ta var4 = null;
        if (param0 != 1843275042) {
          var4 = (ta) null;
          this.a(true, (ta) null, false);
          return vm.field_j[param1].size();
        } else {
          return vm.field_j[param1].size();
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            int var2_int = 0;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var3 = null;
            String var4 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                L0: {
                  var2_int = -109 / ((59 - param0) / 33);
                  var3 = param1.getCodeBase();
                  var4 = gh.a(param1, var3, (byte) 67).getFile();
                  discarded$6 = hi.a(-3729, "updatelinks", param1, new Object[]{"home", var4 + "home.ws"});
                  discarded$7 = hi.a(-3729, "updatelinks", param1, new Object[]{"gamelist", var4 + "togamelist.ws"});
                  discarded$8 = hi.a(-3729, "updatelinks", param1, new Object[]{"serverlist", var4 + "toserverlist.ws"});
                  discarded$9 = hi.a(-3729, "updatelinks", param1, new Object[]{"options", var4 + "options.ws"});
                  discarded$10 = hi.a(-3729, "updatelinks", param1, new Object[]{"terms", var4 + "terms.ws"});
                  discarded$11 = hi.a(-3729, "updatelinks", param1, new Object[]{"privacy", var4 + "privacy.ws"});
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) (var2_ref);
                stackOut_4_1 = new StringBuilder().append("hk.E(").append(param0).append(',');
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param1 == null) {
                  stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L1;
                } else {
                  stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
                  stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L1;
                }
              }
              throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_d = new jp();
    }
}
