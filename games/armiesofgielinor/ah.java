/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_c;
    static int field_b;
    static String field_d;
    static CoatOfArms localCoat;

    public static void a(byte param0) {
        field_c = null;
        localCoat = null;
        field_d = null;
        if (param0 == 32) {
          return;
        }
        field_b = 97;
    }

    final static void b(byte param0) {
        if (param0 == 90) {
          vl.field_n.writeCipheredOpcode(32161, 71);
          AiInfluenceMap.writeCoatOfArms(localCoat.parts, (byte) 100, vl.field_n, localCoat.colourIndices);
          return;
        }
        ah.a((byte) 9, -104);
        vl.field_n.writeCipheredOpcode(32161, 71);
        AiInfluenceMap.writeCoatOfArms(localCoat.parts, (byte) 100, vl.field_n, localCoat.colourIndices);
    }

    final static Class a(String param0, byte param1) throws ClassNotFoundException {
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
          if (param0.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          if (param1 != 90) {
            localCoat = (CoatOfArms) null;
          }
          if (param0.equals("I")) {
            stackIn_8_0 = Integer.TYPE;
            return stackIn_8_0;
          }
          if (param0.equals("S")) {
            stackIn_12_0 = Short.TYPE;
            return stackIn_12_0;
          }
          if (param0.equals("J")) {
            stackIn_15_0 = Long.TYPE;
            return stackIn_15_0;
          }
          if (param0.equals("Z")) {
            stackIn_18_0 = Boolean.TYPE;
            return stackIn_18_0;
          }
          if (param0.equals("F")) {
            stackIn_22_0 = Float.TYPE;
            return stackIn_22_0;
          }
          if (param0.equals("D")) {
            stackIn_26_0 = Double.TYPE;
            return stackIn_26_0;
          }
          if (!param0.equals("C")) {
            stackIn_31_0 = Class.forName(param0);
            return stackIn_31_0;
          }
          stackIn_29_0 = Character.TYPE;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_34_0 = var2;
          stackIn_34_1 = new StringBuilder().append("ah.D(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, byte param1, int param2) {
        if (param1 != 22) {
          return (String) null;
        }
        return p.a(param2, 0, (byte) -123, param0);
    }

    final static void a(byte param0, int param1) {
        IntrusiveNode var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        iw var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = (iw) (cg.field_c.first((byte) 107));
          while (var4 != null) {
            ot.a((byte) 112, param1, var4);
            var4 = (iw) (cg.field_c.next((byte) 123));
          }
          var2 = ta.field_O.first((byte) 116);
          while (var2 != null) {
            a.a(param1, (byte) -32);
            var2 = ta.field_O.next((byte) 123);
          }
          if (param0 == 33) {
            return;
          }
          ah.b((byte) -34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2_ref), "ah.E(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = 0;
        field_c = "Flying units cannot carry additional melee weapons.";
        localCoat = new CoatOfArms();
    }
}
