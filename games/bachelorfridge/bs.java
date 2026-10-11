/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bs extends bw {
    long field_f;
    int field_i;
    byte[] field_h;
    static wba field_g;
    static String field_j;
    static int field_k;

    final static kv a(kv param0, byte param1) {
        kv var2 = null;
        RuntimeException var2_ref = null;
        kv stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 112) {
            bs.a(-13);
          }
          var2 = new kv(param0.field_n, param0.field_o);
          var2.b();
          param0.c(0, 0, 65793);
          hga.field_U.a((byte) 14);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("bs.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 < 88) {
          kv var2 = (kv) null;
          bs.a((kv) null, (byte) -55);
        }
    }

    final static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        kv var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = BachelorFridge.field_y;
        try {
          if (dma.field_a) {
            return;
          }
          if (!dma.field_a &&
            null == vla.field_x) {
            vla.field_x = cn.a((byte) -68, 4);
          }
          if (!dma.field_a &&
            vla.field_x.field_j) {
            var13 = sg.field_q;
            var11 = var13;
            var6 = var11;
            var1 = var6;
            var17 = vla.field_x.field_m;
            for (var3 = 0; var3 < 8; var3++) {
              var6[var3] = mp.a(var13[var3], var17[var3]);
            }
            var14 = nga.field_i;
            var12 = var14;
            var8 = var12;
            var1Lifetime1 = var8;
            var18 = vla.field_x.field_m;
            var10 = 0;
            var3Lifetime1 = var10;
            while (var10 < 8) {
              var8[var10] = dda.a(var14[var10], ~var18[var10]);
              var10++;
            }
            dma.field_a = true;
            vla.field_x = null;
          }
          if (param0 > -106) {
            var5 = (kv) null;
            bs.a((kv) null, (byte) 34);
          }
          if (dma.field_a) {
            of.b(115);
            dca.d(-122);
            if (iba.field_s == 8 &&
              !hs.a(false, nga.field_i)) {
              lg.a(true, 0, false);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "bs.A(" + param0 + ')');
        }
    }

    bs(long param0, int param1, byte[] param2) {
        try {
          this.field_h = param2;
          this.field_f = param0;
          this.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bs.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new wba(3);
        field_j = "Name";
        field_k = 256;
    }
}
