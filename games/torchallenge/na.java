/*
 * Decompiled by CFR-JS 0.4.0.
 */
class na extends t {
    private long field_h;
    static IntrusiveDeque field_d;
    static int field_c;
    static boolean field_f;
    private String field_g;
    static boolean field_e;

    public static void e(int param0) {
        if (param0 != -7345) {
          na.e(3);
          field_d = null;
          return;
        }
        field_d = null;
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.previous != null) {
            param2.unlink(true);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          if (param0 == 52) {
            return;
          }
          na.e(18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("na.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(PacketBuffer param0, int param1) {
        try {
          param0.a(true, this.field_h);
          param0.b(this.field_g, (byte) -73);
          if (param1 >= -29) {
            field_e = true;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "na.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    am a(boolean param0) {
        if (!param0) {
          return (am) null;
        }
        return ja.field_g;
    }

    na(long param0, String param1) {
        try {
          this.field_h = param0;
          this.field_g = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = false;
        field_e = true;
        field_d = new IntrusiveDeque();
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$83744e1822f8(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.previous != null) {
            param2.unlink(true);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          if (param0 == 52) {
            return;
          }
          na.e(18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("na.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }
}
