/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends gg implements nk {
    static String field_j;
    static int field_l;
    static String field_k;
    private c field_m;

    public final void a(int param0, c param1) {
        try {
          if (param0 != -31825) {
            this.b((byte) 39);
          }
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "r.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(dd param0, int param1) {
        try {
          we.a(-68);
          if (param1 != 45) {
            field_l = 45;
          }
          gb.a(param0.field_B, param0.field_x, param0.field_r);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "r.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        field_j = null;
        if (param0 != 0) {
          dd var2 = (dd) null;
          r.a((dd) null, -96);
        }
    }

    public final void b(int param0, c param1) {
        try {
          if (param0 != 40) {
            c var4 = (c) null;
            this.b(-35, (c) null);
          }
          this.a(param0 ^ -1323);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "r.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wd a(byte param0) {
        if (param0 == -8) {
          return this.a(160, this.field_m.field_i);
        }
        field_k = (String) null;
        return this.a(160, this.field_m.field_i);
    }

    final String b(byte param0) {
        if (param0 > 62) {
          return this.a((byte) 109, this.field_m.field_i);
        }
        field_l = -35;
        return this.a((byte) 109, this.field_m.field_i);
    }

    final static kc a(boolean param0, long param1, byte param2, String param3, String param4) {
        RuntimeException var6 = null;
        dd var7 = null;
        rg stackIn_5_0 = null;
        rj stackIn_7_0 = null;
        ef stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0L &&
            param3 != null) {
            stackIn_7_0 = new rj(param3, param4);
            return (kc) ((Object) stackIn_7_0);
          }
          if (param0) {
            stackIn_5_0 = new rg(param1, param4);
            return (kc) ((Object) stackIn_5_0);
          }
          if (param2 != 84) {
            var7 = (dd) null;
            r.a((dd) null, -52);
          }
          stackIn_11_0 = new ef(param1, param4);
          return (kc) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("r.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param4 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    abstract wd a(int param0, String param1);

    public final boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        if (null == this.field_m.field_i) {
          return true;
        }
        if (this.field_m.field_i.length() != 0) {
          return false;
        }
        return true;
    }

    abstract String a(byte param0, String param1);

    r(c param0) {
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "r.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(char param0, int param1) {
        int var2 = 45 / ((7 - param1) / 50);
        if (param0 == 160) {
          return true;
        }
        if (param0 == 32) {
          return true;
        }
        if (param0 == 95) {
          return true;
        }
        if (param0 != 45) {
          return false;
        }
        return true;
    }

    static {
        field_j = "This game has been updated! Please reload this page.";
        field_k = "Continue";
    }
}
