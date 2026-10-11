/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends db {
    final static q a(boolean param0, int param1) {
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        la var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        la var8 = null;
        ob var9 = null;
        var7 = TrackController.field_F ? 1 : 0;
        if (param1 != 21552) {
          return (q) null;
        }
        var8 = ne.field_a;
        var2 = var8;
        var3 = var8.h(16383);
        fd.field_e = 127 & var3;
        stackIn_5_0 = (0 != (128 & var3));
        nl.field_b = stackIn_5_0;
        id.field_h = var8.h(16383);
        lg.field_a = var8.f((byte) 84);
        if (fd.field_e == 2) {
          jb.field_d = var8.d((byte) -124);
          ka.field_c = var8.e(8);
        } else {
          ka.field_c = 0;
          jb.field_d = 0;
        }
        stackIn_11_0 = (var8.h(16383) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        ai.field_c = var8.g(0);
        if (var4 != 0) {
          o.field_b = var8.g(0);
        } else {
          o.field_b = ai.field_c;
        }
        if (fd.field_e == 1) {
          var8.d((byte) -117);
          var8.g(0);
        } else {
          if (fd.field_e == 4) {
            var8.d((byte) -117);
            var8.g(0);
          }
        }
        if (!param0) {
          li.field_l = nd.a(-101, var8, 80);
          hi.field_A = null;
          return new q(param0);
        }
        var5 = var8.d((byte) -67);
        try {
          var9 = od.field_a.a(98, var5);
          li.field_l = var9.a((byte) 2);
          if (o.field_b.equals(ue.field_a)) {
            stackIn_24_0 = null;
          } else {
            stackIn_24_0 = var9.field_r;
          }
          hi.field_A = stackIn_24_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          hb.a((Throwable) ((Object) var6), param1 ^ 21552, "CC1");
          li.field_l = null;
          hi.field_A = null;
          return new q(param0);
        }
        return new q(param0);
    }

    pj(vl param0, al param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void b(al param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.b(param0, -77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("pj.O(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ng a(kk param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        ng stackIn_5_0 = null;
        ng stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!sk.a(param1, param0, 1, param3)) {
            return null;
          }
          if (param2 < -123) {
            stackIn_7_0 = kj.a((byte) 106);
            return stackIn_7_0;
          }
          stackIn_5_0 = (ng) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("pj.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
