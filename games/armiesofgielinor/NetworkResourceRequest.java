/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NetworkResourceRequest extends ResourceRequest {
    static ClientConnectionState field_D;
    byte paddingBytes;
    PacketBuffer responseBuffer;
    int blockPosition;
    static GameplayController field_C;
    static String field_G;

    public static void h(int param0) {
        if (param0 != -29390) {
          return;
        }
        field_G = null;
        field_D = null;
        field_C = null;
    }

    final int getProgress(int obfuscationGuard) {
        if (obfuscationGuard != 0) {
          NetworkResourceRequest.b(-42, -14);
          if (null == this.responseBuffer) {
            return 0;
          }
          return this.responseBuffer.position * 100 / (-this.paddingBytes + this.responseBuffer.payload.length);
        }
        if (null == this.responseBuffer) {
          return 0;
        }
        return this.responseBuffer.position * 100 / (-this.paddingBytes + this.responseBuffer.payload.length);
    }

    final byte[] getBytes(byte obfuscationGuard) {
        if (this.pending) {
          throw new RuntimeException();
        }
        if (this.responseBuffer.position >= this.responseBuffer.payload.length - this.paddingBytes) {
          int var2 = -74 / ((-35 - obfuscationGuard) / 45);
          return this.responseBuffer.payload;
        }
        throw new RuntimeException();
    }

    final static void b(int param0, int param1) {
        te.field_n = param0;
        if (param1 >= 83) {
          if (null != LobbyRoom.field_Kb) {
            LobbyRoom.field_Kb.f(-122, param0);
          }
          if (null != lk.field_e) {
            lk.field_e.b(param0, 6);
          }
          return;
        }
        field_C = (GameplayController) null;
        if (null != LobbyRoom.field_Kb) {
          LobbyRoom.field_Kb.f(-122, param0);
        }
        if (null != lk.field_e) {
          lk.field_e.b(param0, 6);
        }
    }

    NetworkResourceRequest() {
    }

    final static String a(String[][] param0, int param1, String param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        String var6_ref_String = null;
        int var6 = 0;
        String var7 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kq.a(param2, false)) {
            stackIn_2_0 = (String) (param2);
            return stackIn_2_0;
          }
          var5_int = dq.a((byte) -105, param1);
          if (param1 != var5_int) {
            var6_ref_String = VineGrowthAction.a(var5_int, false, param0);
            if (var6_ref_String != null) {
              var7 = SpellCastAction.a(var5_int, (byte) 83, var6_ref_String);
              stackIn_7_0 = var7;
              return stackIn_7_0;
            }
          }
          var6 = 68 / ((param4 + 77) / 49);
          stackIn_9_0 = (String) (param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("jf.D(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_D = new ClientConnectionState();
        field_G = "New Game";
    }
}
