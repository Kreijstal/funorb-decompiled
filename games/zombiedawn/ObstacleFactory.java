/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ObstacleFactory {
    static String field_a;
    static int field_b;

    final static int getMessageListHeight(int param0) {
        if (param0 != -13043) {
          String var2 = (String) null;
          ObstacleFactory.createNameCheckRequest((String) null, -49);
          return SessionSocketHelpers.field_d;
        }
        return SessionSocketHelpers.field_d;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 28186) {
          String var2 = (String) null;
          ObstacleFactory.createNameCheckRequest((String) null, -91);
        }
    }

    final static LevelObstacle createObstacle(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        Object stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        Object stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        Object stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        Object var6;
        int var7;
        Object var6Lifetime1;
        if (param5 != -19653) {
          return (LevelObstacle) null;
        }
        var6 = null;
        var7 = 0;
        while (true) {
          if (HuffmanCodec.field_a.length <= var7) {
            if (param4 == ByteArrayPool.field_b) {
              var6 = new Alien(param2, param1, 0, param0);
            }
            if (var6 == null) {
              var6 = new LevelObstacle(param2, param1, param4);
            }
            stackIn_12_0 = var6;
            stackIn_13_1 = (param0);
            ((LevelObstacle) (stackIn_12_0)).field_P = stackIn_13_1;
            stackIn_15_0 = var6;
            stackIn_16_1 = (param3);
            ((LevelObstacle) (stackIn_15_0)).field_J = stackIn_16_1;
            return (LevelObstacle) (var6);
          }
          if (HuffmanCodec.field_a[var7] != param4) {
            var7++;
            continue;
          }
          break;
        }
        var6Lifetime1 = new LaserBarrier(param2, param1, SpriteState.field_u[var7], param0, param3, ConnectionCleanupHelpers.field_a[var7], HunterHuman.field_Qb[var7]);
        ScrollViewport.field_J.addLast((DualLinkNode) (var6Lifetime1), (byte) -119);
        if (param4 == ByteArrayPool.field_b) {
          var6Lifetime1 = new Alien(param2, param1, 0, param0);
        }
        if (var6Lifetime1 == null) {
          var6Lifetime1 = new LevelObstacle(param2, param1, param4);
        }
        stackIn_27_0 = var6Lifetime1;
        stackIn_28_1 = (param0);
        ((LevelObstacle) (stackIn_27_0)).field_P = stackIn_28_1;
        stackIn_30_0 = var6Lifetime1;
        stackIn_31_1 = (param3);
        ((LevelObstacle) (stackIn_30_0)).field_J = stackIn_31_1;
        return (LevelObstacle) (var6Lifetime1);
    }

    final static NameCheckRequest createNameCheckRequest(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        NameCheckRequest stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -10 / ((param1 + 49) / 51);
          stackIn_1_0 = new NameCheckRequest(param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("co.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void removeFinishedSounds(int param0) {
        IntrusiveNode var1 = null;
        IntrusiveNode var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        IntrusiveNode var2Lifetime1;
        IntrusiveNode var2Lifetime2;
        var3 = ZombieDawn.field_J;
        try {
          var1 = NameSuggestionsPanel.field_L.last((byte) 26);
          while (var1 instanceof SoundEffectNode) {
            var2 = var1.previous;
            if (((SoundEffectNode) (var1)).field_j.isSamplePositionOutOfRange()) {
              var1.unlink(-27598);
            }
            var1 = var2;
          }
          if (param0 != 0) {
            field_a = (String) null;
          }
          var1 = ProxySocketConnector.field_m.last((byte) 26);
          while (var1 instanceof SoundEffectNode) {
            var2Lifetime1 = var1.previous;
            if (((SoundEffectNode) (var1)).field_j.isSamplePositionOutOfRange()) {
              var1.unlink(-27598);
            }
            var1 = var2Lifetime1;
          }
          var1 = DelegatingCanvas.field_e.last((byte) 26);
          while (var1 instanceof SoundEffectNode) {
            var2Lifetime2 = var1.previous;
            if (((SoundEffectNode) (var1)).field_j.isSamplePositionOutOfRange()) {
              var1.unlink(-27598);
            }
            var1 = var2Lifetime2;
          }
          QueuedByteRecord.serviceAudio(-120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1_ref), "co.C(" + param0 + ')');
        }
    }

    final static boolean getAccountOptInFlag(int param0) {
        if (param0 != 17821) {
          field_b = 79;
          return PendingFlagRequest.field_l;
        }
        return PendingFlagRequest.field_l;
    }

    static {
        field_a = "Music: ";
    }
}
