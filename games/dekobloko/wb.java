/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends w {
    String field_Pb;
    w field_Sb;
    static int field_Rb;
    w field_Wb;
    String field_Vb;
    static int[] field_Zb;
    int field_Xb;
    static Boolean field_Ub;
    static fm field_Nb;
    w field_Yb;
    String field_Tb;
    String field_Ob;
    static String[] field_Qb;

    final static void a(kc param0, int param1, int param2) {
        uf var3 = null;
        try {
          var3 = we.field_b;
          var3.f(param1, param2 - 64);
          if (param2 != 60) {
            field_Nb = (fm) null;
          }
          var3.a(true, 5);
          var3.a(true, 0);
          var3.d(param2 ^ -61, param0.field_n);
          var3.a(true, param0.field_o);
          var3.a(true, param0.field_v);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "wb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              if (param1 != 30307) {
                field_Rb = 64;
              }
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (0 <= var3) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(gn.a(var5, -1, param0), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("wb.C(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = client.field_A ? 1 : 0;
        try {
          if (hk.field_c > param1) {
            param5 = param5 - (-param1 + hk.field_c);
            param1 = hk.field_c;
          }
          if (param1 + param5 > hk.field_g) {
            param5 = hk.field_g - param1;
          }
          if (hk.field_h > param3) {
            param2 = param2 - (-param3 + hk.field_h);
            param3 = hk.field_h;
          }
          if (param3 + param2 > hk.field_b) {
            param2 = -param3 + hk.field_b;
          }
          if (0 < param5 &&
            param2 > 0) {
            var6_int = param3 * hk.field_j + param1;
            if (param0 != 31) {
              field_Qb = (String[]) null;
            }
            var7 = -param5 + hk.field_j;
            for (param3 = -param2; param3 < 0; param3++) {
              for (param1 = -param5; param1 < 0; param1++) {
                var8 = hk.field_l[var6_int];
                if ((65280 & var8) >> 8 > param4 &&
                  (255 & var8 >> 16) <= (var8 >> 8 & 255)) {
                  var9 = ((16711680 & var8) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = 31 & var8 >> 3;
                  hk.field_l[var6_int] = de.b(var11, de.b(var9 << 16, var10));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var6), "wb.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 < -73) {
          field_Qb = null;
          field_Zb = null;
          field_Nb = null;
          field_Ub = null;
          return;
        }
        field_Zb = (int[]) null;
        field_Qb = null;
        field_Zb = null;
        field_Nb = null;
        field_Ub = null;
    }

    final static int b(byte param0, int param1) {
        int var2 = param1 >>> 1;
        var2 = var2 | var2 >>> 1;
        if (param0 <= -77) {
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return param1 & ~var2;
        }
        kc var3 = (kc) null;
        wb.a((kc) null, -48, 106);
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param1 & ~var2;
    }

    wb() {
        super(0L, (w) null);
    }

    static {
        field_Nb = null;
    }
}
