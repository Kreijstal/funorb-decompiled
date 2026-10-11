/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dmb implements ntb {
    static ri field_b;
    static int field_c;
    static int field_a;

    public void b(byte param0, tv param1) {
        try {
          if (param0 <= 54) {
            tv var4 = (tv) null;
            this.a((byte) -58, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dmb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -110 % ((22 - param0) / 59);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("dmb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public void a(faa param0, boolean param1) {
        try {
          if (param1) {
            asb var4 = (asb) null;
            dmb.a(-64, (byte) 110, (asb) null, -56);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dmb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public void a(tv param0, int param1) {
        try {
          if (param1 >= -19) {
            field_b = (ri) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dmb.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -99) {
          asb var2 = (asb) null;
          dmb.a(-84, (byte) -24, (asb) null, 25);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public void b(faa param0, int param1) {
        try {
          if (param1 > -109) {
            asb var4 = (asb) null;
            dmb.a(34, (byte) -8, (asb) null, 110);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "dmb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static phb[] a(int param0, byte param1, asb param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        phb[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 75) {
            dmb.a((byte) -84);
          }
          if (pa.a(param3, 2, param2, param0)) {
            stackIn_6_0 = v.b(false);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (phb[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("dmb.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void a(pe param0, boolean param1);

    static {
        field_b = new ri(7, 0, 1, 1);
    }
}
