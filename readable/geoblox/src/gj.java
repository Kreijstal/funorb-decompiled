/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj extends fj {
    static int field_u;
    static String field_t;
    static PlatformTask archiveConnectTask;
    private Object field_r;

    final static void a(byte param0, int param1, ea param2) {
        PacketBuffer var3 = null;
        try {
            var3 = fj.field_q;
            var3.writeCipherByte(param1, (byte) -80);
            int var4 = 66 % ((param0 - 23) / 51);
            var3.writeByte((byte) 122, 2);
            var3.writeByte((byte) 125, 0);
            var3.writeByte((byte) -90, param2.field_f);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gj.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(String param0, int param1, byte param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.clientControlFlowFlag;
        try {
          kd.field_b = va.field_e;
          if (param2 != 30) {
            return;
          }
          if (param1 != 255) {
            if (param1 < 100) {
              dl.field_a = ig.a(param0, param1, false);
              return;
            }
            if (param1 <= 105) {
              dl.field_a = ac.a(28, param3);
              return;
            }
            dl.field_a = ig.a(param0, param1, false);
            return;
          }
          stackIn_6_0 = -106;
          if (rd.field_u >= 13) {
            stackIn_7_1 = false;
          } else {
            stackIn_7_1 = true;
          }
          dl.field_a = hh.a(stackIn_6_0, stackIn_7_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = (RuntimeException) (var4);
          stackIn_17_1 = new StringBuilder().append("gj.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final Object e(byte param0) {
        if (param0 <= 50) {
            String[] var3 = (String[]) null;
            gj.a((String) null, 21, (byte) -91, (String[]) null);
            return this.field_r;
        }
        return this.field_r;
    }

    final boolean g(int param0) {
        if (param0 != 13) {
            return true;
        }
        return false;
    }

    final static void drawSpecialAttachedEntities(byte param0) {
        GameplayEntity var1 = null;
        int var2 = Geoblox.clientControlFlowFlag;
        try {
            var1 = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
            while (var1 != null) {
                if (var1.entitySpriteKindId != 0) {
                    var1.drawEntityAtPosition(1643839728);
                }
                var1 = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
            }
            if (param0 > -33) {
                gj.drawSpecialAttachedEntities((byte) 90);
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gj.B(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            gj.h(-23);
            archiveConnectTask = null;
            field_t = null;
            return;
        }
        archiveConnectTask = null;
        field_t = null;
    }

    gj(Object param0, int param1) {
        super(param1);
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_t = "Login / Register";
    }
}
