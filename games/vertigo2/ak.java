/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static int[] field_d;
    static String field_c;
    static String field_f;
    static int field_e;
    private gp field_a;
    private gp field_b;

    final static void a(boolean param0, boolean param1, int param2) {
        String var4 = (String) null;
        or.a((String) null, param0, 65536, param1);
        if (param2 != 3) {
          ak.a(false, true, -39);
        }
    }

    final gp b(byte param0) {
        gp var2 = null;
        gp var2Lifetime1;
        if (param0 != -50) {
          field_e = -33;
          var2 = this.field_a.field_p;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_p;
          return var2;
        }
        var2Lifetime1 = this.field_a.field_p;
        if (this.field_a == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_p;
        return var2Lifetime1;
    }

    final int a(byte param0) {
        gp var3 = null;
        int var4 = Vertigo2.field_L ? 1 : 0;
        int var2 = 0;
        gp var3Lifetime1;
        if (param0 >= 6) {
          var3 = this.field_a.field_p;
          while (var3 != this.field_a) {
            var3 = var3.field_p;
            var2++;
          }
          return var2;
        }
        ak.b(24);
        var3Lifetime1 = this.field_a.field_p;
        while (var3Lifetime1 != this.field_a) {
          var3Lifetime1 = var3Lifetime1.field_p;
          var2++;
        }
        return var2;
    }

    public static void b(int param0) {
        field_d = null;
        int var1 = 118 % ((64 - param0) / 40);
        field_f = null;
        field_c = null;
    }

    final void a(boolean param0, gp param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.field_o) {
            param1.a(-125);
          }
          param1.field_p = this.field_a;
          param1.field_o = this.field_a.field_o;
          param1.field_o.field_p = param1;
          param1.field_p.field_o = param1;
          if (!param0) {
            return;
          }
          this.a((byte) 76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ak.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!il.field_a) {
            return false;
          }
          var2_int = 83 / ((14 - param0) / 60);
          if (ui.field_g == 2 &&
            sm.field_Kb != null) {
            var3 = (CharSequence) ((Object) param1);
            if (!sm.field_Kb.equals(rc.a(var3, 320))) {
              return false;
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ak.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public ak() {
        this.field_a = new gp();
        this.field_a.field_p = this.field_a;
        this.field_a.field_o = this.field_a;
    }

    final gp a(int param0) {
        if (param0 > -8) {
          return (gp) null;
        }
        gp var2 = this.field_a.field_p;
        if (var2 != this.field_a) {
          var2.a(-122);
          return var2;
        }
        return null;
    }

    final gp a(boolean param0) {
        gp var2 = this.field_b;
        if (var2 == this.field_a) {
          this.field_b = null;
          return null;
        }
        if (param0) {
          this.field_b = var2.field_p;
          return var2;
        }
        field_e = 54;
        this.field_b = var2.field_p;
        return var2;
    }

    static {
        field_d = new int[4];
        field_f = "Your email address is used to identify this account";
        field_c = "You must play 1 more rated game before playing with the current options.";
        field_e = 3;
    }
}
