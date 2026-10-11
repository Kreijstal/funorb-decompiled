/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends pi {
    static int field_n;
    int[] field_p;
    boolean field_o;

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        ld var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        sl var11 = null;
        ki var12 = null;
        ld var13 = null;
        ki var14 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          if (param0 != -15003) {
            field_n = -89;
          }
          var13 = kj.field_a;
          var2 = var13.d((byte) -54);
          if (0 == var2) {
            var10 = hk.b(0);
            var3 = var10;
            var9 = var10;
            var4 = var9;
            var5 = var13;
            var6 = ((sb) ((Object) var5)).d((byte) -54);
            for (var7 = 0; var6 > var7; var7++) {
              var9[var7] = ((sb) ((Object) var5)).b((byte) 118);
            }
            var12 = (ki) (on.field_v.b(110));
            if (var12 == null) {
              si.a(param0 + 14967);
              return;
            }
            var12.field_p = var3;
            var12.field_o = true;
            var12.b(34);
            return;
          }
          if (var2 == 1) {
            var11 = (sl) (tc.field_v.b(101));
            if (var11 == null) {
              si.a(param0 + 14908);
              return;
            }
            var11.b(param0 + 15037);
            return;
          }
          if (var2 != 2) {
            di.a((Throwable) null, param0 ^ -15004, "A1: " + hj.a((byte) 116));
            si.a(-110);
            return;
          }
          var14 = (ki) (on.field_v.b(64));
          if (var14 == null) {
            si.a(-79);
            return;
          }
          var14.field_p = hk.b(param0 + 15003);
          var14.field_o = true;
          var14.b(34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "ki.A(" + param0 + ')');
        }
    }

    final static ea[] a(int param0, bj param1, int param2, byte param3) {
        RuntimeException var4 = null;
        bj var5 = null;
        ea[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!cn.a(param0, param3 ^ -261, param2, param1)) {
            return null;
          }
          if (param3 != -7) {
            var5 = (bj) null;
            ki.a(-56, (bj) null, -11, (byte) 16);
          }
          stackIn_6_0 = wc.a(-29);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("ki.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    ki() {
        this.field_o = false;
    }

    static {
    }
}
