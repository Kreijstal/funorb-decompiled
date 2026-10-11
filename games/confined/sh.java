/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends am {
    static volatile int field_K;
    private mn field_J;

    final void i(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        if (param0 <= 9) {
          return;
        }
        vb var2 = new vb(this.field_J);
        oe var3 = (oe) (var2.a((byte) 120));
        while (var3 != null) {
          if (var3.l(-6)) {
            var3.a(true);
          }
          var3 = (oe) (var2.b(-92));
        }
        this.field_H = (fj) ((Object) this.h(0));
    }

    public sh() {
        super(0, 0, tg.field_L, qk.field_c, (fe) null, (uk) null);
        this.field_J = new mn();
    }

    final oe h(int param0) {
        vb var2;
        oe var3;
        int var4;
        var4 = Confined.field_J ? 1 : 0;
        var2 = new vb(this.field_J);
        if (param0 != 0) {
          return (oe) null;
        }
        var3 = (oe) (var2.a((byte) 120));
        while (var3 != null) {
          if (var3.field_H) {
            return var3;
          }
          var3 = (oe) (var2.b(param0 ^ -90));
        }
        return null;
    }

    final void g(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(this.field_J);
        oe var3 = (oe) (var2.a((byte) 120));
        while (var3 != null) {
          var3.field_H = false;
          var3 = (oe) (var2.b(-102));
        }
        this.field_H = null;
        if (param0 <= 103) {
          this.field_J = (mn) null;
        }
    }

    final void c(fj param0, int param1) {
        oe var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param0 instanceof oe)) {
            throw new IllegalArgumentException();
          }
          var3 = (oe) (param0);
          this.field_J.a(var3, -1);
          var3.field_H = true;
          var3.a((fj) (this), param1 ^ 418);
          if (param1 != 0) {
            this.h((byte) -3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("sh.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        if (this.field_n != null) {
          this.field_n.a((byte) -122, param3, true, (fj) (this), param0);
        }
        if (param2 < 36) {
          return;
        }
        vb var5 = new vb(this.field_J);
        fj var6 = (fj) (var5.c(7));
        while (var6 != null) {
          var6.a(this.field_m + param0, param1, (byte) 38, this.field_q + param3);
          var6 = (fj) (var5.a(0));
        }
    }

    final static em a(int param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        em stackIn_5_0 = null;
        em stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (param1.indexOf('@') == -1) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = ra.a(var7, 125);
          } else {
            var6 = param1;
          }
          if (param0 == 12831) {
            stackIn_7_0 = g.a(-26547, var4_long, param3, (String) (var6), param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = (em) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("sh.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final fj a(byte param0) {
        vb var2;
        oe var3;
        int var4;
        String var5;
        var4 = Confined.field_J ? 1 : 0;
        var2 = new vb(this.field_J);
        var3 = (oe) (var2.a((byte) 120));
        if (param0 != -110) {
          var5 = (String) null;
          sh.a(64, (String) null, (String) null, false);
        }
        while (var3 != null) {
          if (var3.field_H) {
            return var3.f(-1);
          }
          var3 = (oe) (var2.b(-24));
        }
        return null;
    }

    final void h(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(this.field_J);
        if (param0 != -3) {
          this.h((byte) -125);
        }
        oe var3 = (oe) (var2.a((byte) 120));
        while (var3 != null) {
          if (var3.j(-53)) {
            var3.a(true);
          }
          var3 = (oe) (var2.b(62));
        }
    }

    static {
        field_K = 0;
    }
}
