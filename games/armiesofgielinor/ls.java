/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ls {
    int field_e;
    int field_a;
    int field_b;
    static int[] field_c;
    static String field_d;
    int field_f;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        var5 = param3;
        var6 = param2;
        var7 = param0;
        if (param1 == 7) {
          if (param3 == 11) {
            var5 = 7;
          }
          if (param2 == 11) {
            var6 = 7;
          }
          if (11 == param0) {
            var7 = 7;
          }
        }
        if (param1 == 4) {
          if (param3 == 2 ||
            param3 == 9) {
            var5 = 4;
          }
          if (param0 == 2 ||
            param0 == 9) {
            var7 = 4;
          }
          if (param2 == 2 ||
            param2 == 9) {
            var6 = 4;
          }
        }
        if (param1 == 2) {
          if (param2 == 4 ||
            param2 == 9) {
            var6 = 2;
          }
          if (param3 == 4 ||
            9 == param3) {
            var5 = 2;
          }
          if (4 == param0 ||
            param0 == 9) {
            var7 = 2;
          }
        }
        if (param1 == 1) {
          if (param2 == 9) {
            var6 = 1;
          }
          if (param0 == 9) {
            var7 = 1;
          }
          if (9 == param3) {
            var5 = 1;
          }
        }
        if (param4 > -3) {
          return -51;
        }
        var8 = 0;
        if (var5 == param1) {
          var8++;
        }
        if (param1 == var6) {
          var8 += 2;
        }
        if (3 == var8 &&
          var7 == param1) {
          var8++;
        }
        var8 = var8 * 4;
        if (param1 == 4) {
          if ((var8 == 4 ||
            8 == var8) &&
            (param3 == 2 ||
            param2 == 2 ||
            param3 == 9 ||
            param2 == 9)) {
            var8 += 48;
          }
          if (12 == var8 && (param3 == 2 ||
            param2 == 2 ||
            param3 == 9 ||
            9 == param2)) {
            var8 += 24;
            if (param3 == 2 ||
              param3 == 9) {
              var8 += 8;
            }
            if (param2 == 2 ||
              param2 == 9) {
              var8 += 4;
            }
          }
        }
        return var8;
    }

    final static ru a(int param0, kl param1, int param2, int param3) {
        RuntimeException var4 = null;
        ru stackIn_5_0 = null;
        ru stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!kp.a(false, param2, param1, param0)) {
            return null;
          }
          if (param3 <= -2) {
            stackIn_7_0 = rr.b(0);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ru) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ls.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(PacketBuffer param0, int param1, java.math.BigInteger param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = jq.b(7, param4);
          if (dt.field_b == null) {
            dt.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = dt.field_b.nextInt();
          }
          if (null == sb.field_h ||
            !(sb.field_h.payload.length >= var7_int)) {
            sb.field_h = new PacketBuffer(var7_int);
          }
          if (param3 != 6727) {
            return;
          }
          sb.field_h.position = 0;
          sb.field_h.a(param6, param1, param4, param3 - 6621);
          sb.field_h.b(var7_int, (byte) 100);
          sb.field_h.a((byte) 31, var13);
          if (ArmiesOfGielinor.field_L == null ||
            !(ArmiesOfGielinor.field_L.payload.length >= 100)) {
            ArmiesOfGielinor.field_L = new PacketBuffer(100);
          }
          ArmiesOfGielinor.field_L.position = 0;
          ArmiesOfGielinor.field_L.b(1, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            ArmiesOfGielinor.field_L.a((byte) -111, var13[var11]);
            var11++;
          }
          ArmiesOfGielinor.field_L.b(true, param4);
          ArmiesOfGielinor.field_L.a(-5247, param5, param2);
          param0.a(ArmiesOfGielinor.field_L.payload, 0, ArmiesOfGielinor.field_L.position, 99);
          param0.a(sb.field_h.payload, 0, sb.field_h.position, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("ls.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param6 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -114) {
          return;
        }
        field_c = null;
    }

    static {
        field_c = new int[8192];
        field_d = "If you do nothing the game will revert to normal view once the timer reaches 0.";
    }
}
