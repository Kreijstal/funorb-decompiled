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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        try {
            if (param0) {
                this.a(-126, -48);
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
        ta var4;
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
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            int var2_int = 0;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            java.net.URL var3 = null;
            String var4 = null;
            try {
              try {
                L0: {
                  var2_int = -109 / ((59 - param0) / 33);
                  var3 = param1.getCodeBase();
                  var4 = gh.a(param1, var3, (byte) 67).getFile();
                  hi.a(-3729, "updatelinks", param1, new Object[]{"home", var4 + "home.ws"});
                  hi.a(-3729, "updatelinks", param1, new Object[]{"gamelist", var4 + "togamelist.ws"});
                  hi.a(-3729, "updatelinks", param1, new Object[]{"serverlist", var4 + "toserverlist.ws"});
                  hi.a(-3729, "updatelinks", param1, new Object[]{"options", var4 + "options.ws"});
                  hi.a(-3729, "updatelinks", param1, new Object[]{"terms", var4 + "terms.ws"});
                  hi.a(-3729, "updatelinks", param1, new Object[]{"privacy", var4 + "privacy.ws"});
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
                stackIn_6_0 = (RuntimeException) (var2_ref);

                stackIn_6_1 = new StringBuilder().append("hk.E(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
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
