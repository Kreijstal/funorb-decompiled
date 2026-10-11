/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_a;
    static String field_c;
    static int field_e;
    static String field_d;
    static int field_b;

    final static int a(byte param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        try {
          var1_int = 0;
          var2 = 0;
          while (qh.c(55)) {
            ua.field_i.a(0);
            if (ua.field_i.c(-107)) {
              var1_int = 1;
            }
            if (gi.field_f != 13) {
              continue;
            }
            var2 = 1;
          }
          ua.field_i.a(eb.a(eb.field_a, ni.field_e, -94), eb.a(oc.field_e, di.field_b, -119), -1);
          if (ua.field_i.c(-62)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            ua.field_i.field_f >= 0) {
            var3 = pk.field_j[ua.field_i.field_f];
            if (var3 == 2 ||
              var3 == 5) {
              wl.l(-12128);
            }
          } else {
            if (var2 != 0 &&
              2 != rb.field_s) {
              wl.l(-12128);
            }
          }
          if (var3 == 0 &&
            rb.field_s == 2) {
            var4 = ih.a((byte) -98) - jj.field_p;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (0 >= var6) {
              qc.a(5, true, 0);
              var3 = 2;
            }
          }
          if (param0 >= -59) {
            field_b = -43;
          }
          stackIn_29_0 = var3;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 != -128) {
          vd.a((byte) 99);
        }
        int var2 = param1 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          var2 < 160) {
          var3 = wf.field_a[var2 - 128];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    final static void a(nj param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = stellarshard.field_B;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            cg.field_d[var2_int] = 0;
          }
          if (param1 != -128) {
            field_c = (String) null;
          }
          for (var2_intLifetime1 = 0; gi.field_g > var2_intLifetime1; var2_intLifetime1++) {
            if (ai.field_d[var2_intLifetime1].field_p == param0.field_p) {
              dupTemp$3 = ai.field_d[var2_intLifetime1].a((byte) 95);
              cg.field_d[dupTemp$3] = cg.field_d[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a((byte) 90);
          cg.field_d[dupTemp$0] = cg.field_d[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; var3 < gi.field_g; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (param0.field_p == ai.field_d[var3].field_p) {
              var4 = ai.field_d[var3].a((byte) 105);
              if (pd.field_q < cg.field_d[var4]) {
                cg.field_d[var4] = cg.field_d[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              ai.field_d[incrementValue$2] = ai.field_d[var3];
            }
          }
          gi.field_g = var2_intLifetime2;
          fieldTemp$1 = gi.field_g;
          gi.field_g = gi.field_g + 1;
          ai.field_d[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("vd.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 73) {
          field_c = (String) null;
        }
        field_c = null;
    }

    static {
        field_c = "Age:";
        field_a = "OVER <%0>";
        field_e = 0;
    }
}
