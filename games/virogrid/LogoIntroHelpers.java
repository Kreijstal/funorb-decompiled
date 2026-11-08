/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoIntroHelpers {
    static long[] field_b;
    static String field_d;
    static WidgetLayerStack field_c;
    static String field_a;

    public static void releaseStatics(int param0) {
        if (param0 < -46) {
          field_a = null;
          field_d = null;
          field_b = null;
          field_c = null;
          return;
        }
        Js5Archive var2 = (Js5Archive) null;
        LogoIntroHelpers.prepareLogoAnimation(true, (PcmStreamMixer) null, (Js5Archive) null, 84);
        field_a = null;
        field_d = null;
        field_b = null;
        field_c = null;
    }

    final static SocketConnector createSocketConnector(int param0, String param1, int param2) {
        ProxySocketConnector var3 = null;
        RuntimeException var3_ref = null;
        ProxySocketConnector stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ProxySocketConnector();
          if (param2 >= -48) {
            field_b = (long[]) null;
          }
          ((SocketConnector) ((Object) var3)).field_b = param0;
          ((SocketConnector) ((Object) var3)).field_d = param1;
          stackIn_3_0 = var3;
          return (SocketConnector) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ig.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean isPrintableCharacter(byte param0, char param1) {
        if (32 > param1) {
          if (param0 >= -104) {
            return false;
          }
          if (param1 >= 160 &&
            param1 <= 255) {
            return true;
          }
          if (param1 == 8364) {
            return true;
          }
          if (338 == param1) {
            return true;
          }
          if (param1 == 8212) {
            return true;
          }
          if (param1 == 339) {
            return true;
          }
          if (param1 == 376) {
            return true;
          }
          return false;
        }
        if (param1 <= 126) {
          return true;
        }
        if (param0 >= -104) {
          return false;
        }
        if (param1 < 160) {
          if (param1 == 8364) {
            return true;
          }
          if (338 == param1) {
            return true;
          }
          if (param1 == 8212) {
            return true;
          }
          if (param1 == 339) {
            return true;
          }
          if (param1 == 376) {
            return true;
          }
          return false;
        }
        if (param1 <= 255) {
          return true;
        }
        if (param1 == 8364) {
          return true;
        }
        if (338 == param1) {
          return true;
        }
        if (param1 == 8212) {
          return true;
        }
        if (param1 == 339) {
          return true;
        }
        if (param1 != 376) {
          return false;
        }
        return true;
    }

    final static void prepareLogoAnimation(boolean param0, PcmStreamMixer param1, Js5Archive param2, int param3) {
        try {
          LobbyControlHelpers.field_a = ByteStorage.getFramesPerSecond((byte) 5) * param3 / 1000;
          QueuedRequest.loadLogoSound(1048576, param2);
          MouseTrailPoint.loadLogoModel(param2, 106);
          Virogrid.loadFinalFrame(param2, (byte) -9);
          DelegatingCanvas.initializeSpecularTable(255);
          DualLinkDeque.renderLogoGlowSprite(param0);
          DualLinkHashTable.field_e = -LobbyControlHelpers.field_a + 0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_b = new long[32];
        field_d = "Players: ";
        field_a = "Your ignore list is full. Max of 100 hit.";
    }
}
