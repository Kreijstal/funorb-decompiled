/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wta extends sc implements en, aca {
    vq field_c;

    public final void a(uf param0, byte param1) {
        try {
          this.a(18);
          if (param1 != 100) {
            this.field_c = (vq) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wta.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, nva param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -3) {
            this.field_c = (vq) null;
            this.a(79);
          } else {
            this.a(79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wta.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public wta() {
    }

    final String d(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_c.e(-5);
          var3 = this.field_c.c(true);
          var4 = this.field_c.f(3476);
          if (param0 != 16384) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = vga.a(true);
          if (var4 >= 1890 &&
            -3 + var5 >= var4) {
            if (iia.a(var3, var2_int, true, var4)) {
              return null;
            }
          } else {
            stackIn_7_0 = isa.a(fob.field_d, new String[]{"1890", Integer.toString(var5 - 3)}, 79);
            return stackIn_7_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
        }
        return apa.field_o;
    }

    final qrb b(int param0) {
        int var2_int = 0;
        NumberFormatException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qrb stackIn_5_0 = null;
        qrb stackIn_9_0 = null;
        qrb stackIn_12_0 = null;
        Throwable decompiledCaughtException = null;
        try {
          var2_int = this.field_c.e(-5);
          var3 = this.field_c.c(true);
          if (param0 != -1) {
            this.field_c = (vq) null;
          }
          var4 = this.field_c.f(3476);
          var5 = vga.a(true);
          if (var4 < 1890) {
            stackIn_5_0 = cca.field_o;
            return stackIn_5_0;
          }
          if (var4 > -3 + var5) {
            stackIn_9_0 = cca.field_o;
            return stackIn_9_0;
          }
          if (!iia.a(var3, var2_int, true, var4)) {
            stackIn_12_0 = cca.field_o;
            return stackIn_12_0;
          }
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return cca.field_o;
        }
        return lea.field_o;
    }

    public final void a(int param0, uf param1) {
        try {
          if (param0 != -12409) {
            this.d(116);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "wta.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean b(byte param0) {
        if (param0 >= -100) {
          this.b((byte) 87);
          return this.field_c.d(0);
        }
        return this.field_c.d(0);
    }

    static {
    }
}
