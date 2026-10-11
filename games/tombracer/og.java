/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends hl implements qm {
    static int field_m;
    private byte field_l;

    og(kda param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (param0 != -15730) {
          this.field_l = (byte) -118;
        }
        return super.a(this.field_h.field_Tc, param1, 1);
    }

    final static void b(int param0) {
        if (null == dq.field_f) {
          return;
        }
        pq.a(dq.field_f, false);
        dq.field_f.a((byte) -34, dsa.field_c);
        dq.field_f = null;
        if (null != wba.field_o) {
          wba.field_o.a(118);
        }
        nma.field_l.requestFocus();
        if (param0 != 0) {
          field_m = -90;
        }
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_10_0 = null;
          Object stackIn_15_0 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = TombRacer.field_G ? 1 : 0;
          try {
            try {
              if (param2 != 86) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var3 = (String) (lb.b(param0, 2864, "getcookies"));
              var4 = rga.a(param2 + 32201, var3, ';');
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_10_0 = var4[var5].substring(var6 + 1).trim();
                  return stackIn_10_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_15_0 = null;
            return (String) (stackIn_15_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = var3_ref2;
            stackIn_18_1 = new StringBuilder().append("og.F(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean a(int param0, int param1, boolean param2) {
        if (!param2) {
          return false;
        }
        this.field_l = (byte)param1;
        super.a(-97, param0);
        return true;
    }

    final int a(byte param0) {
        if (param0 > -25) {
          return 2;
        }
        return this.field_l;
    }

    public final void a(int param0) {
        if (param0 != 12574) {
          return;
        }
        super.a(param0 ^ 0);
    }

    public final boolean a(boolean param0) {
        if (!param0) {
          field_m = 54;
        }
        return super.a(this.field_h.field_Tc, 108);
    }

    static {
    }
}
