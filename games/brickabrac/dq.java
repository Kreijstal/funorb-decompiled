/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq {
    static String field_a;
    static String field_c;
    static int field_b;

    final static void a(wq param0, wq param1, java.math.BigInteger param2, byte param3, java.math.BigInteger param4) {
        try {
          tm.a(param0, param1.field_l, (byte) 126, param2, 0, param1.field_k, param4);
          if (param3 != -72) {
            dq.a((byte) -97);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "dq.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 89) {
          return;
        }
        field_a = null;
    }

    final static int a(NodeDeque[] param0, boolean param1, wq param2, NodeDeque param3, kq param4, ga param5) {
        int var11 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Brick var9_ref_on = null;
        int var10 = 0;
        Brick var12 = null;
        int var13 = 0;
        java.math.BigInteger var14 = null;
        Brick var15 = null;
        BrickMotionPath var16 = null;
        int var6_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var6_int = 0; param0.length > var6_int; var6_int++) {
            if (!param0[var6_int].isEmpty(false)) {
              throw new IllegalArgumentException();
            }
          }
          if (!param1) {
            var14 = (java.math.BigInteger) null;
            dq.a((wq) null, (wq) null, (java.math.BigInteger) null, (byte) 57, (java.math.BigInteger) null);
          }
          if (!param3.isEmpty(false)) {
            throw new IllegalArgumentException();
          }
          var6_intLifetime1 = param2.e(255);
          if (var6_intLifetime1 > 5) {
            throw new IllegalArgumentException();
          }
          var7 = param2.e(255);
          if (3 < var6_intLifetime1) {
            param4.field_p = var7 >>> 8;
            var7 = var7 & 255;
          } else {
            param4.field_p = 0;
          }
          if (3 <= var6_intLifetime1) {
            stackIn_21_0 = ((1 & var7) != 0) ? 0 : 1;
            var8 = stackIn_21_0;
            stackIn_24_0 = (var8 != 0) ? 15 : 9;
            kj.a(stackIn_24_0, param0[2], 16);
            for (var9 = 0; param0.length > var9; var9++) {
              var10 = param2.e(255);
              for (var11 = 0; var10 > var11; var11++) {
                var12 = new Brick();
                var12.readBodySnapshot(91, param2);
                param0[var9].addLast(var12, (byte) 3);
              }
            }
          } else {
            var8 = param2.e(255);
            for (var9 = 0; var8 > var9; var9++) {
              var15 = new Brick();
              if (var6_intLifetime1 != 0) {
                if (var6_intLifetime1 > 0) {
                  var15.readBodySnapshot(101, param2);
                }
              } else {
                var15.x256 = param2.e(255);
                var15.y256 = param2.e(255);
                var15.velocityX256 = param2.e(255);
                var15.velocityY256 = param2.e(255);
                var15.typeId = param2.e(255);
                var15.flags = param2.e(255);
              }
              param0[0].addLast(var15, (byte) 3);
            }
            var9_ref_on = (Brick) (param0[0].first(-54));
            while (var9_ref_on != null) {
              if ((var9_ref_on.flags & 4) != 0) {
                param0[1].addLast(var9_ref_on, (byte) 3);
              }
              var9_ref_on = (Brick) (param0[0].next((byte) 116));
            }
          }
          if (var6_intLifetime1 > 1) {
            var8Lifetime1 = param2.e(255);
            for (var9Lifetime1 = 0; var8Lifetime1 > var9Lifetime1; var9Lifetime1++) {
              var16 = new BrickMotionPath();
              var16.readBodySnapshot(90, param2);
              param3.addLast(var16, (byte) 3);
            }
          }
          if (var6_intLifetime1 > 4) {
            param2.a((byte) 24);
          }
          stackIn_55_0 = var7;
          return stackIn_55_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_58_0 = var6;
          stackIn_58_1 = new StringBuilder().append("dq.A(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_61_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          stackIn_64_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',');
          if (param3 == null) {
            stackIn_65_2 = "null";
          } else {
            stackIn_65_2 = "{...}";
          }
          stackIn_67_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_65_2).append(',');
          if (param4 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    static {
        field_c = "You are on <%0>";
        field_b = 0;
    }
}
