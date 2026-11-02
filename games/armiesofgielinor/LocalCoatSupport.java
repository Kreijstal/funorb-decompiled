/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LocalCoatSupport {
    static String field_c;
    static int field_b;
    static String loginPassword;
    static CoatOfArms localCoat;

    public static void a(byte param0) {
        field_c = null;
        localCoat = null;
        loginPassword = null;
        if (param0 == 32) {
          return;
        }
        field_b = 97;
    }

    final static void writeLocalCoat(byte obfuscationGuard) {
        if (obfuscationGuard == 90) {
          EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 71);
          AiInfluenceMap.writeCoatOfArms(localCoat.parts, (byte) 100, EmailValidator.outgoingPacket, localCoat.colourIndices);
          return;
        }
        LocalCoatSupport.a((byte) 9, -104);
        EmailValidator.outgoingPacket.writeCipheredOpcode(32161, 71);
        AiInfluenceMap.writeCoatOfArms(localCoat.parts, (byte) 100, EmailValidator.outgoingPacket, localCoat.colourIndices);
    }

    final static Class loadClassOrPrimitive(String name, byte obfuscationGuard) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_18_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        Class stackIn_29_0 = null;
        Class stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (name.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (obfuscationGuard != 90) {
            localCoat = (CoatOfArms) null;
          }
          if (name.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (name.equals("S")) {
            stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (name.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (name.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (name.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (name.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!name.equals("C")) {
            stackIn_31_0 = Class.forName(name);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ah.D(");
          if (name == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != 22) {
          return (String) null;
        }
        return SoundCache.a(param2, 0, (byte) -123, param0);
    }

    final static void a(byte param0, int param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        iw var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (iw) (ScreenWipeTransition.field_c.first((byte) 107));
          while (var4 != null) {
            FixInvisibleUnitsConsoleCommand.a((byte) 112, param1, var4);
            var4 = (iw) (ScreenWipeTransition.field_c.next((byte) 123));
          }
          var2 = LabeledWidgetContainer.field_O.first((byte) 116);
          while (var2 != null) {
            RegionAnchor.a(param1, (byte) -32);
            var2 = LabeledWidgetContainer.field_O.next((byte) 123);
          }
          if (param0 == 33) {
            return;
          }
          LocalCoatSupport.writeLocalCoat((byte) -34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2_ref), "ah.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = "Flying units cannot carry additional melee weapons.";
        localCoat = new CoatOfArms();
    }
}
