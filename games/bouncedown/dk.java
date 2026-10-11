/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static int field_a;
    static String field_b;
    static int field_c;

    final static void a(int param0, int param1, wi param2, int param3, java.math.BigInteger param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        var10 = Bounce.field_N;
        try {
          var7_int = ca.a(param0, (byte) 27);
          if (null == ug.field_g) {
            ug.field_g = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = ug.field_g.nextInt();
          }
          if (ae.field_a == null ||
            !(var7_int <= ae.field_a.field_i.length)) {
            ae.field_a = new wi(var7_int);
          }
          ae.field_a.field_h = 0;
          ae.field_a.a(param1, true, param0, param6);
          ae.field_a.a(var7_int, false);
          ae.field_a.a(var13, 4);
          if (null == fb.field_jb ||
            !(fb.field_jb.field_i.length >= 100)) {
            fb.field_jb = new wi(100);
          }
          fb.field_jb.field_h = 0;
          fb.field_jb.a(10, (byte) 54);
          var11 = param3;
          var9Lifetime1 = var11;
          while (4 > var11) {
            fb.field_jb.b(var13[var11], (byte) -46);
            var11++;
          }
          fb.field_jb.e(param3 ^ -750655096, param0);
          fb.field_jb.a((byte) 50, param5, param4);
          param2.a(0, true, fb.field_jb.field_h, fb.field_jb.field_i);
          param2.a(0, true, ae.field_a.field_h, ae.field_a.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("dk.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param6 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_b = null;
    }

    final static lj a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        lj stackIn_4_0 = null;
        lj stackIn_7_0 = null;
        lj stackIn_17_0 = null;
        lj stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Bounce.field_N;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = uc.field_E;
            return stackIn_4_0;
          }
          if (~var2_int < param0) {
            stackIn_7_0 = lk.field_t;
            return stackIn_7_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (var4 == 45) {
              if (0 == var3 ||
                var3 == -1 + var2_int) {
                stackIn_17_0 = mh.field_R;
                return stackIn_17_0;
              }
            } else {
              if (vh.field_g.indexOf(var4) == -1) {
                stackIn_21_0 = mh.field_R;
                return stackIn_21_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("dk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (param0) {
          field_a = 1;
        }
        int var3 = 1 << param1;
        if (0 != (ui.field_g & var3)) {
          return;
        }
        kb.field_a = kb.field_a | var3;
        ui.field_g = ui.field_g | var3;
        ci.field_F.a(1, new ab(param1));
        if (!bf.field_k) {
          if (jh.b(767564065)) {
            m.field_c.a(1, new ke(param1, param2, qf.field_c, vg.field_j, nb.field_a, ve.field_a));
          } else {
            hc.a(param1, vg.field_j, param2, qf.field_c, 4, (byte) -127, ve.field_a, nb.field_a);
          }
        }
    }

    static {
        field_b = "Waiting for graphics";
        field_a = 0;
    }
}
