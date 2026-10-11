/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class el {
    static rn field_e;
    static int[][] field_f;
    static int field_c;
    static String field_a;
    static sn[] field_b;
    static int field_d;

    final static void a(byte param0, byte[] param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 != -105) {
            return;
          }
          var5_int = 0;
          while (true) {
            if (var5_int >= MoveAttackRequest.field_K.length) {
              return;
            }
            param4 = MoveAttackRequest.field_K[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param3 = ab.field_c[incrementValue$1];
              dupTemp$2 = param1[param3];
              dupTemp$3 = param2[dupTemp$2];
              param2[dupTemp$2] = dupTemp$3 + 1;
              ab.field_c[dupTemp$3] = param3;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("el.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(java.awt.Component param0, boolean param1);

    abstract int a(int param0);

    final static byte[] a(boolean param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        PacketBuffer var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        try {
          if (param0) {
            field_c = 69;
          }
          var9 = new PacketBuffer(param1);
          var3 = var9.readUnsignedByte(0);
          var4 = var9.readInt(1);
          if (0 <= var4 && (CombatEvent.field_P == 0 ||
            !(var4 > CombatEvent.field_P))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5 = var11;
              var9.readBytes(0, var4, 0, var13);
              stackIn_23_0 = var5;
              return stackIn_23_0;
            }
            var5_int = var9.readInt(1);
            if (var5_int >= 0 && (CombatEvent.field_P == 0 ||
              !(CombatEvent.field_P < var5_int))) {
              var12 = new byte[var5_int];
              var10 = var12;
              var6 = var10;
              if (1 != var3) {
                var7 = ph.field_c;
                synchronized (var7) {
                  ph.field_c.a((byte) -71, var9, var12);
                }
              } else {
                pb.a(var12, var5_int, param1, var4, 9);
              }
              stackIn_21_0 = var6;
              return stackIn_21_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("el.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = (int[][]) null;
        if (param0 != -8834) {
          field_a = (String) null;
        }
    }

    static {
        field_f = new int[][]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        field_a = "Rankings";
        field_e = new rn();
        field_b = new sn[9];
    }
}
