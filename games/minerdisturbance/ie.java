/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ie {
    private ta field_c;
    static String field_a;
    private Random field_d;
    private int field_b;

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                if (param1) {
                  try {
                    L1: {
                      var4 = param0.getCodeBase();
                      var3 = nn.a(99, param0, var4).getFile();
                      discarded$6 = lk.a("updatelinks", param0, 16715, new Object[]{"home", var3 + "home.ws"});
                      discarded$7 = lk.a("updatelinks", param0, 16715, new Object[]{"gamelist", var3 + "togamelist.ws"});
                      discarded$8 = lk.a("updatelinks", param0, 16715, new Object[]{"serverlist", var3 + "toserverlist.ws"});
                      discarded$9 = lk.a("updatelinks", param0, 16715, new Object[]{"options", var3 + "options.ws"});
                      discarded$10 = lk.a("updatelinks", param0, 16715, new Object[]{"terms", var3 + "terms.ws"});
                      discarded$11 = lk.a("updatelinks", param0, 16715, new Object[]{"privacy", var3 + "privacy.ws"});
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      var2 = decompiledCaughtException;
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("ie.H(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw lj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        if (param2) {
            this.a((byte) 47);
            for (var6 = 0; var6 < 5; var6++) {
                fieldTemp$0 = this.field_b;
                this.field_b = this.field_b + 1;
                this.field_c.a((byte) -126, new dn(fieldTemp$0, ke.a(32, -21937, this.field_d) + param4, param3 + ke.a(32, -21937, this.field_d), param1 - -ke.a(32, -21937, this.field_d), param0 - -ke.a(32, -21937, this.field_d)));
            }
            return;
        }
        for (var6 = 0; var6 < 5; var6++) {
            fieldTemp$1 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_c.a((byte) -126, new dn(fieldTemp$1, ke.a(32, -21937, this.field_d) + param4, param3 + ke.a(32, -21937, this.field_d), param1 - -ke.a(32, -21937, this.field_d), param0 - -ke.a(32, -21937, this.field_d)));
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -122 % ((param2 - 18) / 60);
        String var4 = (String) null;
        bb.a(19931, param0, (String) null, param1);
    }

    final void a(int param0) {
        int var4 = MinerDisturbance.field_ab;
        dn var5 = (dn) ((Object) this.field_c.b(69));
        while (var5 != null) {
            if (var5.a((byte) -126)) {
                var5.b(34);
            }
            var5 = (dn) ((Object) this.field_c.b((byte) 56));
        }
        int var3 = 21 % ((93 - param0) / 33);
    }

    final void a(byte param0) {
        int var3 = MinerDisturbance.field_ab;
        dn var4 = (dn) ((Object) this.field_c.b(84));
        while (var4 != null) {
            var4.a(110);
            var4 = (dn) ((Object) this.field_c.b((byte) 56));
        }
        if (param0 != -19) {
            this.a((byte) 99);
            return;
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var4_int = param0.length();
              param0.setLength(param2);
              if (param3 < -36) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var5 = var4_int;
            L2: while (true) {
              if (param2 <= var5) {
                stackOut_6_0 = (StringBuilder) (param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.setCharAt(var5, param1);
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ie.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void b(int param0) {
        StringBuilder discarded$0 = null;
        field_a = null;
        if (param0 != 5) {
            StringBuilder var2 = (StringBuilder) null;
            discarded$0 = ie.a((StringBuilder) null, '@', 48, (byte) 21);
        }
    }

    final void c(int param0) {
        this.field_c.a((byte) 55);
        if (param0 != -29727) {
            this.a((byte) -30);
        }
    }

    ie() {
        this.field_c = new ta();
        this.field_d = new Random();
    }

    static {
        field_a = "OFF";
    }
}
