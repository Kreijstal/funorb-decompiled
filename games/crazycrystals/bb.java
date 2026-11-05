/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends qf implements Cloneable {
    static ko field_x;
    static dl[] field_y;

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = CrazyCrystals.field_B;
        if (param5 != 4261) {
          bb.b(true);
        }
        if (this.field_u) {
          var7 = param2 + param1 << 4;
          var8 = (param4 << 4) + (param3 << 3);
          var9 = param2 * 4096 / 24;
          var10 = (int)(1024.0 * Math.random() - 512.0);
          jm.field_i.a(384, 576, var7, var8, var10, var9);
          return;
        }
        if (24 != param2) {
          jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
          return;
        }
        if (param3 == 24) {
          jm.field_i.a(param1, -param3 + param4);
          return;
        }
        jm.field_i.b(param1, -param3 + param4, 2 * param2, 3 * param3);
    }

    bb(f param0) {
        super(param0);
    }

    public static void b(boolean param0) {
        field_y = null;
        field_x = null;
        if (!param0) {
          field_x = (ko) null;
        }
    }

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        sl stackIn_4_0 = null;
        sl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 < param3) {
            fp.field_c.a(64, param4 * 12, 12 * param1, 0, (byte) -111);
          }
          if (!param2) {
            stackIn_6_0 = super.a(param0, param1, false, param3, param4, param5);
            return stackIn_6_0;
          }
          stackIn_4_0 = (sl) null;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_9_0 = var7;
          stackIn_9_1 = new StringBuilder().append("bb.R(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 23525) {
            stackIn_4_0 = ng.a(ii.field_e, param1, new bb(new kp(-1)), (byte) -83, rl.field_g);
            return stackIn_4_0;
          }
          stackIn_2_0 = (nj) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean c(f[][] param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= 0) {
            bb.b(false);
          }
          fn.field_j = fn.field_j - 5;
          mb.field_g = mb.field_g - 5;
          fp.field_a = fp.field_a + 10;
          je.field_j = je.field_j + 5;
          b.field_a = b.field_a + 5;
          we.field_h = we.field_h + 10;
          bc.field_a.a(64, 12 * param3, param1 * 12, 0, (byte) -111);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("bb.KA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final f b(f[][] param0, int param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        f stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_s > 0) {
            fp.field_c.a(64, this.field_o * this.field_m + param3 * 12, this.field_m * this.field_s + param1 * 12, 0, (byte) -111);
          }
          var5_int = -102 % ((-43 - param2) / 51);
          stackIn_4_0 = super.b(param0, param1, (byte) -105, param3);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("bb.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
