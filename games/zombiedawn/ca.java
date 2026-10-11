/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static double field_a;
    static vn[] field_b;

    final static void a(byte param0, String param1) {
        try {
          pa.a(param1, false);
          if (param0 != 2) {
            ca.a(11, -83, 78, 21, -117, 67, 107, -114, 29);
          }
          ti.a(md.field_wb, false, false);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ca.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 63) {
            field_a = 0.4810407079298756;
          }
          var2 = param1.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) ((Object) var2);
            if (sd.a(-66, var3) != 0L) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ca.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static vn[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var15 = 0;
        int var9;
        vn[] var10;
        int var11;
        vn[] var12_ref_vn__;
        int var12;
        int var13;
        vn var14;
        int var16;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        var16 = ZombieDawn.field_J;
        var9 = param3 + param5 + param2;
        var10 = new vn[]{new vn(var9, var9), new vn(param6, var9), new vn(var9, var9), new vn(var9, param6), new vn(64, 64), new vn(var9, param6), new vn(var9, var9), new vn(param6, var9), new vn(var9, var9)};
        var11 = 73 % ((-38 - param8) / 56);
        var12_ref_vn__ = var10;
        for (var13 = 0; var13 < var12_ref_vn__.length; var13++) {
          var14 = var12_ref_vn__[var13];
          for (var15 = 0; var15 < var14.field_z.length; var15++) {
            var14.field_z[var15] = param7;
          }
        }
        for (var12 = 0; param2 > var12; var12++) {
          for (var13Lifetime1 = 0; var9 > var13Lifetime1; var13Lifetime1++) {
            var10[6].field_z[var13Lifetime1 + var9 * (-1 + var9 - var12)] = param0;
            var10[8].field_z[var13Lifetime1 + (-var12 + (var9 - 1)) * var9] = param0;
            var10[2].field_z[-var12 - 1 + (var9 + var13Lifetime1 * var9)] = param0;
            var10[8].field_z[var13Lifetime1 * var9 - var12 - (1 - var9)] = param0;
          }
        }
        for (var12Lifetime1 = 0; param2 > var12Lifetime1; var12Lifetime1++) {
          for (var13Lifetime2 = 0; var13Lifetime2 < var9; var13Lifetime2++) {
            var10[0].field_z[var13Lifetime2 + var9 * var12Lifetime1] = param1;
            var10[0].field_z[var13Lifetime2 * var9 + var12Lifetime1] = param1;
            if (var13Lifetime2 < (-var12Lifetime1 + var9)) {
              var10[2].field_z[var13Lifetime2 + var9 * var12Lifetime1] = param1;
              var10[6].field_z[var9 * var13Lifetime2 + var12Lifetime1] = param1;
            }
          }
        }
        for (var12Lifetime2 = 0; param6 > var12Lifetime2; var12Lifetime2++) {
          for (var13Lifetime3 = 0; param2 > var13Lifetime3; var13Lifetime3++) {
            var10[7].field_z[var12Lifetime2 + param6 * (var9 - (var13Lifetime3 + 1))] = param0;
            var10[5].field_z[var12Lifetime2 * var9 + (-var13Lifetime3 - 1) + var9] = param0;
            var10[1].field_z[var12Lifetime2 + param6 * var13Lifetime3] = param1;
            var10[3].field_z[var9 * var12Lifetime2 + var13Lifetime3] = param1;
          }
        }
        for (var12Lifetime3 = 0; var12Lifetime3 < param6 >> 1; var12Lifetime3++) {
          for (var13Lifetime4 = 0; param3 > var13Lifetime4; var13Lifetime4++) {
            var10[1].field_z[param6 * (var9 - var13Lifetime4 - 1) + var12Lifetime3] = param4;
            var10[3].field_z[-1 + (var9 - (var13Lifetime4 - var9 * var12Lifetime3))] = param4;
            var10[7].field_z[param6 * var13Lifetime4 + var12Lifetime3] = param4;
            var10[5].field_z[var13Lifetime4 + var12Lifetime3 * var9] = param4;
          }
        }
        return var10;
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        wg var4 = null;
        lo var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawn.field_J;
        try {
          var4 = (wg) (jb.field_b.b((byte) 26));
          while (var4 != null) {
            nd.a(param0, 1, var4);
            var4 = (wg) (jb.field_b.a(false));
          }
          var5 = (lo) (c.field_b.b((byte) 26));
          while (var5 != null) {
            ga.a(param0, 0, var5);
            var5 = (lo) (c.field_b.a(false));
          }
          if (param1 > -95) {
            ca.a(33, (byte) -47);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "ca.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (vn[]) null;
        }
        field_b = null;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        boolean stackIn_19_0 = false;
        int var4;
        var4 = ZombieDawn.field_J;
        if (!ng.field_e) {
          if (param2 == 1) {
            ph.a((byte) 106, w.field_a[0]);
          } else {
            if (4 != param2) {
              if (param2 == 2 &&
                ke.field_c.field_d == 4) {
                vl.field_b.c(9091);
              }
            } else {
              tp.a(109, true, w.field_a[9]);
            }
          }
          if (ke.field_c.field_d == 0) {
            if (param2 == 2) {
              qc.b(1400888196);
            } else {
              hm.a(9);
            }
          } else {
            if (ke.field_c.field_d == 2 &&
              param2 == 0) {
              vj.c(74);
            }
          }
        }
        if (param2 == 7) {
          rf.field_d = nk.a(8, kg.field_g);
          stackIn_19_0 = (0 != vl.field_b.field_G);
          eh.field_z = stackIn_19_0;
        }
        sg.field_eb = jj.c(param2, 96);
        po.field_xb = 0;
        if (ke.field_c.field_d == 1 &&
          sg.field_eb.field_d == 14 ||
          ke.field_c.field_d == 14 &&
          sg.field_eb.field_d == 1) {
          po.field_xb = 31;
        }
        if (sg.field_eb.field_d >= 0) {
          sg.field_eb.a((byte) 74, 0, param0);
        }
        if (sg.field_eb.field_d == 1 &&
          ke.field_c.field_d != 14) {
          ip.c(-94);
        }
        if (!param1) {
          field_a = -0.24351234703539312;
        }
    }

    static {
        field_a = 0.0;
    }
}
