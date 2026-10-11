/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static int field_c;
    static int[] field_a;
    static int field_b;
    static String field_d;
    static fj field_e;

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 != 0) {
          uf var2 = (uf) null;
          rf.a((uf) null, false);
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        aj var4 = null;
        ti var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          var4 = (aj) (ub.field_e.b(param1 + 2));
          while (var4 != null) {
            we.a(param0, var4, (byte) -47);
            var4 = (aj) (ub.field_e.a(10));
          }
          if (param1 != 0) {
            field_d = (String) null;
          }
          var5 = (ti) (ea.field_s.b(2));
          while (var5 != null) {
            mc.a(false, param0, var5);
            var5 = (ti) (ea.field_s.a(10));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2), "rf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        int var1 = 70 / ((param0 - 57) / 63);
        if (null == tk.field_u) {
          return false;
        }
        if (tk.field_u.a(32130)) {
          return true;
        }
        return false;
    }

    final static void a(boolean param0) {
        r.field_j = -1;
        if (!param0) {
          return;
        }
        nl.field_f = null;
        cd.field_j = false;
        aj.field_m = -1;
        vl.field_H = 0;
    }

    final static ji[] a(uf param0, boolean param1) {
        int var5 = 0;
        ji[] stackIn_4_0 = null;
        ji[] stackIn_10_0 = null;
        ji[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        ji[] var4 = null;
        ji var6 = null;
        int var7 = 0;
        uf var8 = null;
        ce var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = TrackController.field_F ? 1 : 0;
        try {
          if (!param0.b(-4)) {
            stackIn_4_0 = new ji[]{};
            return stackIn_4_0;
          }
          var9 = param0.a(75);
          while (var9.field_f == 0) {
            wl.a(10L, false);
          }
          if (var9.field_f == 2) {
            stackIn_10_0 = new ji[]{};
            return stackIn_10_0;
          }
          var11 = (int[]) (var9.field_e);
          var10 = var11;
          var3 = var10;
          var4 = new ji[var11.length >> 2];
          if (param1) {
            var8 = (uf) null;
            rf.a((uf) null, false);
          }
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new ji();
            var4[var5] = var6;
            var6.field_f = var3[var5 << 2];
            var6.field_c = var3[(var5 << 2) + 1];
            var6.field_b = var3[2 + (var5 << 2)];
            var6.field_g = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("rf.A(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = "Password: ";
        field_a = new int[1024];
    }
}
