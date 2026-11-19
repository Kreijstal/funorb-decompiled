/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FriendOrderingHelpers {
    static boolean field_e;
    static EmailValidationError field_d;
    static String field_b;
    static PcmStreamMixer field_a;
    static NineSliceFrame field_c;

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 >= -47) {
          FriendOrderingHelpers.releaseStatics((byte) -113);
        }
    }

    final static boolean isFriendOrderedAfter(FriendEntry param0, FriendEntry param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        FriendEntry var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = wizardrun.field_H;
        try {
          if (param2 != -1) {
            var5 = (FriendEntry) null;
            FriendOrderingHelpers.isFriendOrderedAfter((FriendEntry) null, (FriendEntry) null, 6);
          }
          var3_int = param0.insertionOrder - param1.insertionOrder;
          if (LoadingMessageHelpers.field_d != param0.serverName) {
            if (null == param0.serverName) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (LoadingMessageHelpers.field_d != param1.serverName) {
            if (param1.serverName == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("tl.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = true;
        field_d = new EmailValidationError();
        field_b = "Username: ";
    }
}
