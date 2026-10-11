/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk {
    qb field_a;
    static String field_f;
    static String field_e;
    static String[] field_c;
    static String field_b;
    private qb field_d;

    final qb a(byte param0) {
        qb var2 = this.field_a.field_d;
        if (param0 != 74) {
          this.field_d = (qb) null;
          if (var2 != this.field_a) {
            this.field_d = var2.field_d;
            return var2;
          }
          this.field_d = null;
          return null;
        }
        if (var2 != this.field_a) {
          this.field_d = var2.field_d;
          return var2;
        }
        this.field_d = null;
        return null;
    }

    final static void a(java.applet.Applet param0, int param1, String param2, boolean param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != -25573) {
              return;
            }
            if (le.field_m.startsWith("win") &&
              gl.a(param2, 873140897)) {
              return;
            }
            try {
              param0.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              k.a((Throwable) null, (byte) -120, "MGR1: " + param2);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("bk.C(");
            if (param0 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final qb d(int param0) {
        qb var2 = this.field_a.field_d;
        if (param0 >= -58) {
          qb var3 = (qb) null;
          this.a((qb) null, -66);
          if (var2 != this.field_a) {
            var2.c(111);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_a) {
          var2.c(111);
          return var2;
        }
        return null;
    }

    final qb b(byte param0) {
        qb var2 = this.field_d;
        if (this.field_a == var2) {
          this.field_d = null;
          return null;
        }
        if (param0 <= -91) {
          this.field_d = var2.field_d;
          return var2;
        }
        return (qb) null;
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_b = null;
        field_e = null;
        field_f = null;
        field_c = null;
    }

    final boolean a(int param0) {
        if (param0 == 2220) {
          return this.field_a == this.field_a.field_d ? true : false;
        }
        field_c = (String[]) null;
        return this.field_a == this.field_a.field_d ? true : false;
    }

    final qb b(int param0) {
        qb var2 = null;
        qb var2Lifetime1;
        if (param0 >= -6) {
          field_f = (String) null;
          var2 = this.field_a.field_a;
          if (this.field_a != var2) {
            var2.c(126);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_a.field_a;
        if (this.field_a != var2Lifetime1) {
          var2Lifetime1.c(126);
          return var2Lifetime1;
        }
        return null;
    }

    final void a(int param0, qb param1) {
        try {
          if (null != param1.field_a) {
            param1.c(109);
          }
          param1.field_a = this.field_a;
          if (param0 > -119) {
            String var4 = (String) null;
            bk.a((java.applet.Applet) null, 44, (String) null, true);
          }
          param1.field_d = this.field_a.field_d;
          param1.field_a.field_d = param1;
          param1.field_d.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bk.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public bk() {
        this.field_a = new qb();
        this.field_a.field_d = this.field_a;
        this.field_a.field_a = this.field_a;
    }

    final void a(qb param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_a != null) {
            param0.c(107);
          }
          param0.field_a = this.field_a.field_a;
          param0.field_d = this.field_a;
          param0.field_a.field_d = param0;
          param0.field_d.field_a = param0;
          if (param1 == 27362) {
            return;
          }
          var4 = (String) null;
          bk.a((java.applet.Applet) null, -120, (String) null, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("bk.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0) {
        qb var2 = null;
        int var3 = Main.field_T;
        while (true) {
          var2 = this.field_a.field_d;
          if (var2 == this.field_a) {
            break;
          }
          var2.c(param0 ^ 28988);
        }
        if (param0 == 29026) {
          this.field_d = null;
          return;
        }
        field_c = (String[]) null;
        this.field_d = null;
    }

    static {
        field_e = "Account created successfully!";
        field_b = "Email address is unavailable";
        field_f = "Loading graphics";
    }
}
