/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gpa {
    static int field_b;
    private boolean field_c;
    static ft field_a;
    int field_d;

    final static void a(int param0) {
        rg.a((byte) -114);
        oo.a(vda.field_m[0].field_n, (byte) -104, mna.field_d, io.field_a, wg.field_i, di.field_a);
        if (param0 < 50) {
          gpa.a(76);
        }
    }

    final boolean b(int param0) {
        if (param0 != 59) {
          field_b = 33;
        }
        return this.field_c;
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
          field_a = (ft) null;
        }
    }

    public final String toString() {
        return "SwitchableID: " + this.field_d + " dud: " + this.field_c;
    }

    gpa(int param0) {
        this.field_d = param0;
    }

    final static ata a(int param0, uia param1) {
        RuntimeException var2 = null;
        ata stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 4) {
            gpa.a(true);
          }
          stackIn_3_0 = new ata(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 - 32772), param1.a(-32768), param1.h(255));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gpa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 < 13) {
          return 49;
        }
        return this.field_d;
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
          int var6 = 0;
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          boolean stackIn_18_0 = false;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var8 = TombRacer.field_G ? 1 : 0;
          try {
            if (hpa.field_f) {
              return true;
            }
            try {
              var3 = 46 / ((param0 - 67) / 33);
              var2 = "tuhstatbut";
              var4 = (String) (lb.b(param1, 2864, "getcookies"));
              var5 = rga.a(32287, var4, ';');
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (var7 >= 0 &&
                  var5[var6].substring(0, var7).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_18_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_18_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref2;
            stackIn_21_1 = new StringBuilder().append("gpa.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new ft(4);
    }
}
