/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StrongCacheReference extends CacheReference {
    static int field_u;
    static String field_t;
    static PlatformTask archiveConnectTask;
    private Object field_r;

    final static void writeIntArrayQuery(byte methodGuard, int packetOpcode, IntArrayQuery query) {
        PacketBuffer var3 = null;
        try {
            var3 = CacheReference.outgoingSessionBuffer;
            var3.writeCipherByte(packetOpcode, (byte) -80);
            int var4 = 66 % ((methodGuard - 23) / 51);
            var3.writeByte((byte) 122, 2);
            var3.writeByte((byte) 125, 0);
            var3.writeByte((byte) -90, query.queryByte);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gj.E(" + methodGuard + ',' + packetOpcode + ',' + (query != null ? "{...}" : "null") + ')');
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
          ClientFlowState.accountCreationFlowState = MeshPrioritySupport.completedClientFlowToken;
          if (param2 != 30) {
            return;
          }
          if (param1 != 255) {
            if (param1 < 100) {
              UsernameQueryState.pendingAccountUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(param0, param1, false);
              return;
            }
            if (param1 <= 105) {
              UsernameQueryState.pendingAccountUsernameResult = TextInputRenderer.a(28, param3);
              return;
            }
            UsernameQueryState.pendingAccountUsernameResult = RankedComparisonSupport.createUsernameResponseQuery(param0, param1, false);
            return;
          }
          stackIn_6_0 = -106;
          if (StatefulWidgetRenderer.accountCreationAgeYears >= 13) {
            stackIn_7_1 = false;
          } else {
            stackIn_7_1 = true;
          }
          UsernameQueryState.pendingAccountUsernameResult = UiFontResources.createAcceptedUsernameQuery(stackIn_6_0, stackIn_7_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
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
            StrongCacheReference.a((String) null, 21, (byte) -91, (String[]) null);
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
            var1 = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
            while (var1 != null) {
                if (var1.entitySpriteKindId != 0) {
                    var1.drawEntityAtPosition(1643839728);
                }
                var1 = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
            }
            if (param0 > -33) {
                StrongCacheReference.drawSpecialAttachedEntities((byte) 90);
                return;
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "gj.B(" + param0 + ')');
        }
    }

    public static void h(int param0) {
        if (param0 != -1) {
            StrongCacheReference.h(-23);
            archiveConnectTask = null;
            field_t = null;
            return;
        }
        archiveConnectTask = null;
        field_t = null;
    }

    StrongCacheReference(Object param0, int param1) {
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
