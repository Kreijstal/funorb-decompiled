/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static String[] field_a;
    wf field_d;
    static String field_c;
    private wf field_b;

    final wf a(byte param0) {
        if (param0 != -95) {
          return (wf) null;
        }
        wf var2 = this.field_d.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2.field_b;
        return var2;
    }

    final wf a(int param0) {
        wf var2 = null;
        wf var2Lifetime1;
        if (param0 != -9424) {
          qj.c((byte) 97);
          var2 = this.field_d.field_f;
          if (this.field_d != var2) {
            var2.c(5);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_d.field_f;
        if (this.field_d != var2Lifetime1) {
          var2Lifetime1.c(5);
          return var2Lifetime1;
        }
        return null;
    }

    final static ti[] a(int param0, int param1, ci param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -57) {
            field_a = (String[]) null;
          }
          if (rl.a(param1, 0, param0, param2)) {
            return uj.a(31151);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("qj.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (param0 < 65) {
          field_c = (String) null;
          return ge.field_x;
        }
        return ge.field_x;
    }

    final wf a(boolean param0) {
        wf var2 = this.field_b;
        if (this.field_d == var2) {
          this.field_b = null;
          return null;
        }
        if (param0) {
          this.field_b = var2.field_b;
          return var2;
        }
        this.a(true);
        this.field_b = var2.field_b;
        return var2;
    }

    final void a(wf param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.field_f) {
            param0.c(5);
          }
          param0.field_f = this.field_d.field_f;
          param0.field_b = this.field_d;
          param0.field_f.field_b = param0;
          param0.field_b.field_f = param0;
          if (param1 <= -81) {
            return;
          }
          this.field_d = (wf) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("qj.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final wf b(int param0) {
        wf var2 = this.field_d.field_f;
        if (param0 != -10231) {
          field_c = (String) null;
          if (this.field_d != var2) {
            this.field_b = var2.field_f;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        if (this.field_d != var2) {
          this.field_b = var2.field_f;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 36) {
            stackIn_4_0 = ig.a(10, false, true, param0);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qj.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void g(int param0) {
        int var3;
        wf var5;
        wf var4;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param0 == -1) {
          while (true) {
            var4 = this.field_d.field_b;
            if (this.field_d != var4) {
              var4.c(5);
              continue;
            }
            break;
          }
          this.field_b = null;
          return;
        }
        qj.b((byte) 115);
        while (true) {
          var5 = this.field_d.field_b;
          if (this.field_d != var5) {
            var5.c(5);
            continue;
          }
          break;
        }
        this.field_b = null;
        return;
    }

    public static void c(byte param0) {
        field_a = null;
        int var1 = -105 % ((-25 - param0) / 33);
        field_c = null;
    }

    final wf f(int param0) {
        wf var2 = this.field_b;
        if (var2 == this.field_d) {
          this.field_b = null;
          return null;
        }
        if (param0 == -33) {
          this.field_b = var2.field_f;
          return var2;
        }
        this.field_d = (wf) null;
        this.field_b = var2.field_f;
        return var2;
    }

    final void a(wf param0, byte param1) {
        if (param0.field_f != null) {
          param0.c(5);
        }
        if (param1 != 33) {
          return;
        }
        try {
          param0.field_b = this.field_d.field_b;
          param0.field_f = this.field_d;
          param0.field_f.field_b = param0;
          param0.field_b.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "qj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          return true;
        }
        return this.field_d == this.field_d.field_b ? true : false;
    }

    final wf c(int param0) {
        wf var2 = this.field_d.field_b;
        if (var2 == this.field_d) {
          return null;
        }
        if (param0 <= -71) {
          var2.c(5);
          return var2;
        }
        CharSequence var3 = (CharSequence) null;
        qj.a((CharSequence) null, 11);
        var2.c(5);
        return var2;
    }

    public qj() {
        this.field_d = new wf();
        this.field_d.field_f = this.field_d;
        this.field_d.field_b = this.field_d;
    }

    final static void e(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 > -65) {
          field_a = (String[]) null;
          if (kc.field_g <= 32) {
            ec.a(0, 9956);
          } else {
            var1 = kc.field_g % 32;
            if (var1 == 0) {
              var1 = 32;
            }
            ec.a(-var1 + kc.field_g, 9956);
            return;
          }
          return;
        }
        if (kc.field_g <= 32) {
          ec.a(0, 9956);
        } else {
          var1Lifetime1 = kc.field_g % 32;
          if (var1Lifetime1 == 0) {
            var1Lifetime1 = 32;
          }
          ec.a(-var1Lifetime1 + kc.field_g, 9956);
          return;
        }
    }

    static {
        field_c = "This password is part of your Player Name, and would be easy to guess";
        field_a = new String[]{"Decent Score", "Great Score", "Anagram", "Super Anagram", "Recycler", "Supercycler", "Focus", "Double Focus", "Brave Effort", "Sterling Effort", "DIY Builder", "Word of Power", "Speedster", "Super Speedster", "Multitasker", "Monster Speller"};
    }
}
