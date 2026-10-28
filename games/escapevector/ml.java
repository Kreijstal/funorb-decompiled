/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    static Sprite field_c;
    static nn field_a;
    static String field_b;

    final static boolean a(char param0, int param1) {
        if (param1 != 21654) {
          ik var3 = (ik) null;
          ml.a((ik) null, -66, (byte) -72);
          return EmailAvailabilityRequest.a(param0, -11217);
        }
        return EmailAvailabilityRequest.a(param0, -11217);
    }

    public static void releaseStatics(int guard) {
        if (guard >= -112) {
          return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static TrackerMusicDefinition a(int param0, ResourceArchive param1, SoundCache param2, int param3, int param4) {
        String stackIn_11_2 = null;
        String stackIn_14_2 = null;
        try {
          byte[] var6 = param1.a(param4, (byte) -97, param3);
          byte[] var5 = var6;
          if (var6 == null) {
            return null;
          }
          if (param0 == -15618) {
            TrackerMusicDefinition stackIn_7_0 = new TrackerMusicDefinition(new PacketBuffer(var6), param2);
            return stackIn_7_0;
          }
          TrackerMusicDefinition stackIn_5_0 = (TrackerMusicDefinition) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5_ref = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var5_ref;
          StringBuilder stackIn_10_1 = new StringBuilder().append("ml.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          StringBuilder stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(ik param0, int param1, byte param2) {
        try {
          vj.field_d.addLast(-12328, param0);
          ig.a(-75, param1, param0);
          if (param2 != 101) {
            ml.releaseStatics(-42);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "ml.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = "Password is valid";
    }
}
