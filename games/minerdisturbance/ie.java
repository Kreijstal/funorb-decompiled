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
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.net.URL var4 = null;
          try {
            if (!param1) {
              return;
            }
            try {
              var4 = param0.getCodeBase();
              var3 = nn.a(99, param0, var4).getFile();
              lk.a("updatelinks", param0, 16715, new Object[]{"home", var3 + "home.ws"});
              lk.a("updatelinks", param0, 16715, new Object[]{"gamelist", var3 + "togamelist.ws"});
              lk.a("updatelinks", param0, 16715, new Object[]{"serverlist", var3 + "toserverlist.ws"});
              lk.a("updatelinks", param0, 16715, new Object[]{"options", var3 + "options.ws"});
              lk.a("updatelinks", param0, 16715, new Object[]{"terms", var3 + "terms.ws"});
              lk.a("updatelinks", param0, 16715, new Object[]{"privacy", var3 + "privacy.ws"});
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("ie.H(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
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
        int var6;
        int var7;
        int var6Lifetime1;
        var7 = MinerDisturbance.field_ab;
        if (!param2) {
          for (var6 = 0; var6 < 5; var6++) {
            fieldTemp$0 = this.field_b;
            this.field_b = this.field_b + 1;
            this.field_c.a((byte) -126, new dn(fieldTemp$0, ke.a(32, -21937, this.field_d) + param4, param3 + ke.a(32, -21937, this.field_d), param1 + ke.a(32, -21937, this.field_d), param0 + ke.a(32, -21937, this.field_d)));
          }
          return;
        }
        this.a((byte) 47);
        for (var6Lifetime1 = 0; var6Lifetime1 < 5; var6Lifetime1++) {
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          this.field_c.a((byte) -126, new dn(fieldTemp$1, ke.a(32, -21937, this.field_d) + param4, param3 + ke.a(32, -21937, this.field_d), param1 + ke.a(32, -21937, this.field_d), param0 + ke.a(32, -21937, this.field_d)));
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        int var3 = -122 % ((param2 - 18) / 60);
        String var4 = (String) null;
        bb.a(19931, param0, (String) null, param1);
    }

    final void a(int param0) {
        int var4 = MinerDisturbance.field_ab;
        dn var5 = (dn) (this.field_c.b(69));
        while (var5 != null) {
          if (var5.a((byte) -126)) {
            var5.b(34);
          }
          var5 = (dn) (this.field_c.b((byte) 56));
        }
        int var3 = 21 % ((93 - param0) / 33);
    }

    final void a(byte param0) {
        int var3 = MinerDisturbance.field_ab;
        dn var4 = (dn) (this.field_c.b(84));
        while (var4 != null) {
          var4.a(110);
          var4 = (dn) (this.field_c.b((byte) 56));
        }
        if (param0 != -19) {
          this.a((byte) 99);
          return;
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, byte param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          var4_int = param0.length();
          param0.setLength(param2);
          if (param3 >= -36) {
            field_a = (String) null;
          }
          for (var5 = var4_int; param2 > var5; var5++) {
            param0.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ie.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != 5) {
          StringBuilder var2 = (StringBuilder) null;
          ie.a((StringBuilder) null, '@', 48, (byte) 21);
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
