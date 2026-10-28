/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static PcmSample field_a;

    final static void a(int param0) {
        if (param0 != 16) {
          field_a = (PcmSample) null;
        }
        if (pg.field_c != null) {
          pg.field_c.c(12497);
          pg.field_c = null;
        }
    }

    final static ce a(int param0, String param1, SoundCache param2, ResourceArchive param3, String param4) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        try {
          if (param0 != 2) {
            field_a = (PcmSample) null;
          }
          int var5_int = param3.b(-1, param1);
          int var6 = param3.a(var5_int, param4, true);
          ce stackIn_3_0 = ml.a(param0 ^ -15620, param3, param2, var6, var5_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var5;
          StringBuilder stackIn_6_1 = new StringBuilder().append("nm.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          StringBuilder stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          StringBuilder stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 != 78) {
          field_a = (PcmSample) null;
        }
        int var2 = 0;
        if (param0 < 0 ||
          param0 >= 65536) {
          var2 += 16;
          param0 = param0 >>> 16;
        }
        if (param0 >= 256) {
          param0 = param0 >>> 8;
          var2 += 8;
        }
        if (16 <= param0) {
          var2 += 4;
          param0 = param0 >>> 4;
        }
        if (4 <= param0) {
          var2 += 2;
          param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
          var2++;
          param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final static void a(byte param0, int param1, dk[] param2) {
        try {
          HudMessage.a(param2, -1, param1, (byte) -28);
          if (param0 > -50) {
            field_a = (PcmSample) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "nm.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          nm.a(-36, (byte) -52);
        }
        field_a = null;
    }

    final static boolean a(byte param0, qh[] param1) {
        String stackIn_15_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          boolean var2_int = true;
          if (param0 > -71) {
            field_a = (PcmSample) null;
          }
          for (int var3 = 0; var3 < param1.length; var3++) {
            Sprite var4 = param1[var3].b(110);
            if (var4 == null) {
              var2_int = false;
            }
          }
          boolean stackIn_11_0 = var2_int;
          return (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var2;
          StringBuilder stackIn_14_1 = new StringBuilder().append("nm.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
    }
}
