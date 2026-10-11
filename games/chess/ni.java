/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static String[] field_b;
    static String[] field_a;
    static jc field_c;
    static int field_d;

    final static void a(int param0, int param1, java.math.BigInteger param2, p param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Chess.field_G;
        try {
          var7_int = uh.a(false, param1);
          if (null == ae.field_j) {
            ae.field_j = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          if (param4 != -21105) {
            return;
          }
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = ae.field_j.nextInt();
          }
          if (n.field_g == null ||
            !(var7_int <= n.field_g.field_o.length)) {
            n.field_g = new p(var7_int);
          }
          n.field_g.field_l = 0;
          n.field_g.a(param6, (byte) -45, param0, param1);
          n.field_g.a((byte) -54, var7_int);
          n.field_g.a(var13, 12246);
          if (vg.field_c == null ||
            !(vg.field_c.field_o.length >= 100)) {
            vg.field_c = new p(100);
          }
          vg.field_c.field_l = 0;
          vg.field_c.c(10, (byte) 94);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            vg.field_c.d(var13[var11], (byte) -81);
            var11++;
          }
          vg.field_c.b(param1, 94);
          vg.field_c.a(param2, param5, (byte) 76);
          param3.a(vg.field_c.field_o, (byte) -45, 0, vg.field_c.field_l);
          param3.a(n.field_g.field_o, (byte) -45, 0, n.field_g.field_l);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param6 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (sl.field_a != param0 - eg.field_i &&
          sl.field_a == -eg.field_i + 250) {
        }
        sl.field_a = sl.field_a + 1;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_b = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = new jc();
    }
}
