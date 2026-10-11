/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh implements dja {
    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          return (tv[]) null;
        }
        return (tv[]) ((Object) new rgb[param1]);
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        faa var2 = dpa.field_p;
        int var3Lifetime1;
        int var4Lifetime1;
        var2.h(24335, param0);
        if (param1) {
          var2.field_e = var2.field_e + 1;
          var3 = var2.field_e;
          var2.c(0, 5);
          var2.c(0, lqa.field_o.field_Fb);
          var4 = lqa.field_o.field_Cb + (lqa.field_o.field_Bb << 6);
          var2.c(0, var4);
          var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
          var2.e(-var3 + var2.field_e, -129);
          return;
        }
        bh.a(-30, true);
        var2.field_e = var2.field_e + 1;
        var3Lifetime1 = var2.field_e;
        var2.c(0, 5);
        var2.c(0, lqa.field_o.field_Fb);
        var4Lifetime1 = lqa.field_o.field_Cb + (lqa.field_o.field_Bb << 6);
        var2.c(0, var4Lifetime1);
        var2.a(0, lqa.field_o.field_Pb, -1, lqa.field_o.field_Pb.length);
        var2.e(-var3Lifetime1 + var2.field_e, -129);
    }

    final static apb[] a(faa param0, byte param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        apb[] var4 = null;
        apb var6_ref_apb = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        apb[] stackIn_6_0 = null;
        apb[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = VoidHunters.field_G;
        try {
          var2_int = param0.i(0, 8);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (apb[]) (stackIn_3_0);
          }
          if (param1 > -31) {
            stackIn_6_0 = (apb[]) null;
            return stackIn_6_0;
          }
          var3 = param0.i(0, 12);
          var4 = new apb[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!kv.a(false, param0)) {
              var6 = param0.i(0, iia.a(-97, var5 - 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_apb = new apb();
              param0.i(0, 24);
              param0.i(0, 24);
              var6_ref_apb.field_c = param0.i(0, 24);
              param0.i(0, 9);
              param0.i(0, 12);
              param0.i(0, 12);
              param0.i(0, 12);
              var4[var5] = var6_ref_apb;
            }
          }
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("bh.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 15 / ((param0 + 64) / 50);
        return (tv) ((Object) new rgb());
    }

    static {
    }
}
