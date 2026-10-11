/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(105, 97));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("bj.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int e(byte param0) {
        if (2 > ef.field_z) {
          return 0;
        }
        if (ahb.field_p != 0) {
          if (ppb.field_a != null) {
            if (!ppb.field_a.b((byte) -118)) {
              return 14;
            }
            if (!ppb.field_a.a(true, "")) {
              return 29;
            }
            if (!ppb.field_a.a(32171, "")) {
              return 29;
            }
          }
          if (!btb.field_b.b((byte) -47)) {
            return 43;
          }
          if (!btb.field_b.a(32171, "commonui")) {
            return 57;
          }
          if (!dt.field_o.b((byte) 124)) {
            return 71;
          }
          if (!dt.field_o.a(32171, "commonui")) {
            return 80;
          }
          if (!gdb.field_i.b((byte) -103)) {
            return 82;
          }
          if (!gdb.field_i.a(120)) {
            return 86;
          }
        } else {
          if (!btb.field_b.b((byte) 94)) {
            return 20;
          }
          if (!btb.field_b.a(32171, "commonui")) {
            return 40;
          }
          if (!dt.field_o.b((byte) -97)) {
            return 50;
          }
          if (!dt.field_o.a(32171, "commonui")) {
            return 60;
          }
          if (!gdb.field_i.b((byte) 127)) {
            return 70;
          }
          if (!gdb.field_i.a(54)) {
            return 80;
          }
        }
        if (param0 > 94) {
          return 100;
        }
        return 36;
    }

    bj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, asb param1, no param2) {
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        rn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        Throwable var10 = null;
        Throwable var11 = null;
        no var12 = null;
        int[] var16 = null;
        var9 = VoidHunters.field_G;
        try {
          var3_int = ahb.field_p;
          tra.field_o = new llb(0L, (llb) null);
          if (param1 == null) {
            var10 = (Throwable) null;
            gna.a((Throwable) null, "QC1", 0);
            return;
          }
          param1.field_e = false;
          param1.field_h = 0;
          lnb.field_i = new jv(var3_int, param1, param1);
          usa.field_o = new voa(var3_int, param1, param1, new wk());
          var4 = cqb.d(10);
          if (var4 == null) {
            var11 = (Throwable) null;
            gna.a((Throwable) null, "QC2", 0);
            return;
          }
          jka.a(var4, (byte) -111);
          var12 = (no) null;
          wdb.field_Ab = ocb.a(65793, 4020342, 10204, (no) null, 1513239, 8947848, 1513239, 5138823, 65793, 1127256, 0, 65793, 2245737);
          ej.field_a = ocb.a(0, 0, param0 ^ -10239, param2, 0, 0, 0, 0, 0, 0, 16764006, 0, 0);
          jwa.field_k = ocb.a(0, 0, 10204, param2, 0, 0, 0, 0, 0, 0, 16777215, 0, 0);
          var5 = dma.field_g;
          var6 = dma.field_j;
          var16 = dma.field_i;
          ie.field_o = new phb(10, 14);
          ie.field_o.b();
          for (var8 = 2; var8 < 7; var8++) {
            dma.d(var8, 1 + var8, 14 - (var8 << 1), 16777215);
          }
          dma.a(var16, var5, var6);
          tha.field_o = vcb.a(0, jwa.field_k, wdb.field_Ab, ej.field_a, var4);
          if (param0 != -35) {
            return;
          }
          tra.field_o.field_lb = new ij();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("bj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
    }
}
