/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    final static void a(java.awt.Canvas param0, boolean param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          mb.a(!param1, (java.awt.Component) ((Object) param0));
          if (!param1) {
            mm.a(-16, (byte) -13);
          }
          aq.a((byte) 60, (java.awt.Component) ((Object) param0));
          if (ok.field_g != null) {
            ok.field_g.a(13212, (java.awt.Component) ((Object) param0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("mm.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static dl[] a(int param0) {
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var2 = 0;
        int var7 = CrazyCrystals.field_B;
        dl[] var1 = new dl[mg.field_a];
        int var2Lifetime1;
        for (var2 = 0; var2 < mg.field_a; var2++) {
          var3 = uo.field_l[var2] * je.field_c[var2];
          var10 = ui.field_c[var2];
          var11 = new int[var3];
          var9 = var11;
          var5 = var9;
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = gh.field_z[pf.b((int) var10[var6], 255)];
          }
          var1[var2] = new dl(km.field_c, bo.field_o, uo.field_k[var2], jm.field_a[var2], uo.field_l[var2], je.field_c[var2], var11);
        }
        ok.a(2188450);
        var2Lifetime1 = -46 % ((-74 - param0) / 50);
        return var1;
    }

    final static int a(int param0, byte param1) {
        param0 = (param0 >>> 1 & 1431655765) + (1431655765 & param0);
        param0 = (param0 >>> 2 & 1932735283) + (858993459 & param0);
        param0 = (param0 >>> 4) + param0 & 252645135;
        param0 = param0 + (param0 >>> 8);
        param0 = param0 + (param0 >>> 16);
        if (param1 >= -22) {
          return -82;
        }
        return param0 & 255;
    }

    static {
    }
}
