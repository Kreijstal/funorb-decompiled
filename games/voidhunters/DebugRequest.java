/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DebugRequest extends DebugSendable implements DiffableState {
    String field_i;
    static String field_j;

    public final void readState(IsaacPacketBuffer param0, boolean param1) {
        param0.endBitRead((byte) -74);
        this.field_i = param0.readCircumfixedString(-1609246200);
        if (param1) {
          return;
        }
        try {
          param0.beginBitRead(-23497);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mo.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    DebugRequest() {
    }

    public final void copyTo(byte param0, SerializableGameState param1) {
        DebugRequest var6 = null;
        DebugRequest var7 = null;
        try {
          var6 = (DebugRequest) (param1);
          var7 = var6;
          if (param0 <= 54) {
            SerializableGameState var4 = (SerializableGameState) null;
            this.copyTo((byte) -13, (SerializableGameState) null);
          }
          var7.field_i = this.field_i;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mo.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_j = null;
        if (param0 != 46) {
          field_j = (String) null;
        }
    }

    public final void writeState(IsaacPacketBuffer param0, int param1) {
        param0.endBitWrite(32712);
        param0.writeCircumfixedString((byte) 0, this.field_i);
        if (param1 >= -109) {
          return;
        }
        try {
          param0.beginBitWrite(-100);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mo.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    DebugRequest(String param0) {
        try {
          this.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "mo.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean differsFrom(byte param0, SerializableGameState param1) {
        DebugRequest var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 34 / ((param0 - 22) / 59);
          var3 = (DebugRequest) (param1);
          stackIn_3_0 = !(var3.field_i.equals(this.field_i));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("mo.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void reportDifferences(SerializableGameState other, int obfuscationGuard) {
        DebugRequest var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -19) {
            field_j = (String) null;
          }
          var3 = (DebugRequest) (other);
          var4 = 0;
          if (!var3.field_i.equals(this.field_i)) {
            GetSniperCannonAimarc.a(-6940, "String requeststring has changed. ");
            var4 = 1;
          }
          if (var4 == 0) {
            return;
          }
          SetDebrisGrabbingRange.a((byte) -116, "This instance of DebugRequest has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("mo.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_j = "Screen Size";
    }
}
