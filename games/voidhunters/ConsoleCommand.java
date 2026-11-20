/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ConsoleCommand extends DualLinkNode {
    String signatureText;
    String name;
    Class[] parameterTypes;
    static int[] field_m;

    public static void clearSharedReferences(boolean param0) {
        field_m = null;
        if (!param0) {
          field_m = (int[]) null;
        }
    }

    public final String toString() {
        return this.signatureText;
    }

    final boolean matchesSignature(boolean param0, String param1, ConsoleValue[] param2) {
        int var4_int = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        Class var5 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          if (!this.name.equals(param1)) {
            return false;
          }
          if (param2.length != this.parameterTypes.length) {
            return false;
          }
          if (!param0) {
            field_m = (int[]) null;
          }
          for (var4_int = 0; var4_int < this.parameterTypes.length; var4_int++) {
            if (param2[var4_int].primitive) {
              var5 = sna.getPrimitiveType(param2[var4_int].value, (byte) 124);
              if (var5 == Boolean.TYPE &&
                this.parameterTypes[var4_int] != Boolean.TYPE) {
                return false;
              }
              if (var5 == Character.TYPE &&
                this.parameterTypes[var4_int] != Character.TYPE) {
                return false;
              }
              if (GetTorpedoFireForce.a(var5, 24145) &&
                !GetTorpedoFireForce.a(this.parameterTypes[var4_int], 24145)) {
                return false;
              }
            } else {
              if (!this.parameterTypes[var4_int].isInstance(param2[var4_int].value)) {
                return false;
              }
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("rqa.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param2 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    ConsoleCommand(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
          this.name = param0;
          this.parameterTypes = param1;
          var7 = new StringBuilder(this.name).append('(');
          var8 = var7;
          for (var5 = 0; var5 < this.parameterTypes.length; var5++) {
            discarded$18 = var7.append(wp.a(this.parameterTypes[var5], false));
            if (var5 < -1 + this.parameterTypes.length) {
              discarded$19 = var8.append(", ");
            }
          }
          discarded$28 = var8.append(')');
          if (param2 != null) {
            discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
          }
          this.signatureText = var8.toString();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard);

    static {
        field_m = new int[5];
    }
}
