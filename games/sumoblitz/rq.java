/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rq {
    static String field_a;
    static boolean field_d;
    static ri field_c;
    aw field_b;

    void b(int param0) {
        int var2 = -35 / ((param0 - 41) / 46);
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == wd.field_e) {
          if (!param0) {
            return;
          }
          rq.c(106);
          return;
        }
        var1 = wd.field_e;
        synchronized (var1) {
          wd.field_e = null;
        }
        if (param0) {
          rq.c(106);
        }
    }

    abstract void a(int param0, int param1, int param2);

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -99) {
          field_c = (ri) null;
        }
    }

    abstract void a(boolean param0, int param1);

    abstract void c(boolean param0);

    void c(byte param0) {
        if (param0 <= 0) {
          this.a((byte) -128);
        }
    }

    void a(int param0) {
        if (param0 != 260) {
          this.c((byte) -26);
        }
    }

    abstract void a(int param0, int param1, ed param2);

    void a(byte param0) {
        if (param0 >= -47) {
          this.c((byte) 119);
        }
    }

    rq(aw param0) {
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "rq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, tg param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -9267) {
            rq.c(38);
          }
          if (param1 == lf.field_e) {
            stackIn_4_0 = 7681;
            return stackIn_4_0;
          }
          if (param1 == vi.field_v) {
            stackIn_16_0 = 8448;
            return stackIn_16_0;
          }
          if (param1 == ua.field_n) {
            stackIn_8_0 = 34165;
            return stackIn_8_0;
          }
          if (cv.field_F == param1) {
            stackIn_14_0 = 260;
            return stackIn_14_0;
          }
          if (bj.field_c != param1) {
            throw new IllegalArgumentException();
          }
          stackIn_12_0 = 34023;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("rq.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static ne[] a(String param0, ki param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ne[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 28) {
            field_a = (String) null;
          }
          var4_int = param1.a(0, param3);
          var5 = param1.a(var4_int, param0, (byte) 127);
          stackIn_3_0 = kk.a(var4_int, -1, var5, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("rq.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void b(boolean param0) {
        if (param0) {
          field_c = (ri) null;
        }
    }

    abstract boolean b(byte param0);

    abstract void a(boolean param0, byte param1);

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
