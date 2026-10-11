/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uba extends rqa {
    final static void a(byte param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = VoidHunters.field_G;
        if (0 > nd.field_r) {
          return;
        }
        var3 = -135 + param1;
        var4 = param2 - 35;
        var5 = 256;
        if (nd.field_r < 75) {
          var5 = (nd.field_r << 8) / 75;
        }
        if (nd.field_r > 200) {
          var5 = (250 - nd.field_r << 8) / 50;
        }
        if (param0 != 82) {
          uba.a((byte) -71, -110, -57);
        }
        de.a(74, ata.field_K);
        bfb.e();
        dma.a();
        pw.a((byte) 74);
        if (var5 < 256) {
          dma.e(0, 0, dma.field_g, dma.field_j, 0, -var5 + 256);
        }
        bia.a((byte) 124);
        if (nd.field_r < 150) {
          ata.field_K.d(var3, var4);
        } else {
          cg.field_o.d(var3 + 15, 10 + var4, var5);
        }
        var6 = nd.field_r - 125;
        if (0 < var6 &&
          var6 < 50) {
          if (var6 < 20) {
            var7 = 256 * var6 / 20;
            db.field_p.c(var3, var4, var7);
          } else {
            if (30 <= var6) {
              var7 = (12800 - 256 * var6) / 20;
              db.field_p.c(var3, var4, var7);
            } else {
              db.field_p.c(var3, var4, 256);
            }
          }
        }
        var6Lifetime1 = -140 + nd.field_r;
        if (0 < var6Lifetime1) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = var6Lifetime1 * 256 / 20;
          }
          reb.field_a.d(15 + var3, var4 + 10, var5 * var7Lifetime1 >> 8);
        }
        return;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gnb.field_a = param0[0].a(30);
          if (param1 >= -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -7);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("uba.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, Object param2) {
        int var3_int = 0;
        qsa var3 = null;
        qsa var4 = null;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = VoidHunters.field_G;
        try {
          var3_int = 0;
          while (true) {
            if (var3_int >= hcb.field_p) {
              if (param0 != -100) {
                return;
              }
              var3 = lua.a((byte) -86);
              if (var3 != null) {
                var3.field_c = param2;
                var3.field_a = param1;
              }
              return;
            }
            var4 = bjb.field_p[var3_int];
            if (param2 != var4.field_c) {
              var3_int++;
              continue;
            }
            break;
          }
          if (1 == var4.field_a) {
            var4.field_a = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("uba.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    uba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
