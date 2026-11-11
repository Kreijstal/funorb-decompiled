/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleTokenStream {
    private ConsoleToken[] field_a;
    int field_c;
    static volatile int field_d;
    static String field_b;

    final static int sin8192(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (param1 >= 4096) {
            if (param1 >= 6144) {
              stackIn_19_0 = -ida.field_b[-param1 + 8192];
            } else {
              stackIn_19_0 = -ida.field_b[-4096 + param1];
            }
            return stackIn_19_0;
          }
          if (param1 < 2048) {
            stackIn_15_0 = ida.field_b[param1];
          } else {
            stackIn_15_0 = ida.field_b[4096 - param1];
          }
          return stackIn_15_0;
        }
        field_b = (String) null;
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          if (param1 >= 6144) {
            stackIn_9_0 = -ida.field_b[-param1 + 8192];
          } else {
            stackIn_9_0 = -ida.field_b[-4096 + param1];
          }
          return stackIn_9_0;
        }
        if (param1 < 2048) {
          stackIn_5_0 = ida.field_b[param1];
        } else {
          stackIn_5_0 = ida.field_b[4096 - param1];
        }
        return stackIn_5_0;
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -127) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final boolean isAtEnd(byte param0) {
        if (param0 >= 77) {
          return this.field_a.length <= this.field_c ? true : false;
        }
        return true;
    }

    final static void a(int[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != 35) {
            field_b = (String) null;
          }
          if (TextureCombineOperation.field_a) {
            tga.field_a.da(param2 >> 14, -param1 >> 14, -param3 >> 14, param0);
            return;
          }
          tga.field_a.HA(param2 >> 14, -param1 >> 14, -param3 >> 14, 2048, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("cr.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    ConsoleTokenStream(IntrusiveDeque param0) {
        int incrementValue$2 = 0;
        int var2_int = 0;
        ConsoleToken var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_c = 0;
        try {
          this.field_a = new ConsoleToken[param0.size((byte) -16)];
          var2_int = 0;
          var3 = (ConsoleToken) (param0.first(-80));
          while (var3 != null) {
            var3.unlink(67);
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_a[incrementValue$2] = var3;
            var3 = (ConsoleToken) (param0.next(124));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cr.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final ConsoleToken next(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 < -125) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          return this.field_a[fieldTemp$0];
        }
        this.field_a = (ConsoleToken[]) null;
        int fieldTemp$1 = this.field_c;
        this.field_c = this.field_c + 1;
        return this.field_a[fieldTemp$1];
    }

    static {
        field_d = 0;
    }
}
