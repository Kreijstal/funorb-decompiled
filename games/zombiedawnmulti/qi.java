/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static String field_b;
    static ua field_a;
    static long field_c;

    final static void a(byte param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        u var4_ref_u = null;
        hp var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        k var9 = null;
        ga var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var11 = s.field_e;
          if (param0 < 101) {
            var9 = (k) null;
            qi.a(31, false, (java.math.BigInteger) null, 54, (java.math.BigInteger) null, (byte[]) null, (k) null);
          }
          var2 = var11.g(31365);
          var3 = var11.g(31365);
          if (var2 == 0) {
            var4_ref_u = (u) (cp.field_T.c(83));
            if (var4_ref_u == null) {
              ak.a((byte) -119);
              return;
            }
            var5_int = -var11.field_j + hd.field_q;
            var13 = var4_ref_u.field_h;
            var12 = var13;
            var6 = var12;
            if (var13.length << 2 < var5_int) {
              var5_int = var13.length << 2;
            }
            for (var7 = 0; var5_int > var7; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var11.g(31365) << tq.b(768, var7 << 8));
            }
            var4_ref_u.a(true);
            return;
          }
          if (var2 != 1) {
            bd.a("LR1: " + ci.a(0), (Throwable) null, false);
            ak.a((byte) -115);
            return;
          }
          var4 = var11.h(22219);
          var5 = (hp) (mh.field_l.c(83));
          while (var5 != null) {
            if (var5.field_v != var3 ||
              var4 != var5.field_f) {
              var5 = (hp) (mh.field_l.b(6));
              continue;
            }
            break;
          }
          if (var5 == null) {
            ak.a((byte) -117);
            return;
          }
          var5.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "qi.E(" + param0 + ')');
        }
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          eo.a((java.awt.Component) ((Object) param1), 11);
          if (param0 != 100) {
            qi.b((byte) 52);
          }
          so.a((java.awt.Component) ((Object) param1), 127);
          if (null == ll.field_a) {
            return;
          }
          ll.field_a.a((byte) 127, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qi.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        fb.a(4, 102);
        if (param0) {
          qi.b((byte) -45);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != -17) {
          qi.a((byte) -34);
        }
    }

    final static void a(int param0, boolean param1, java.math.BigInteger param2, int param3, java.math.BigInteger param4, byte[] param5, k param6) {
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
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var7_int = vj.b(param1, param3);
          if (null == kf.field_j) {
            kf.field_j = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; 4 > var9; var9++) {
            var8[var9] = kf.field_j.nextInt();
          }
          if (null == so.field_k ||
            !(so.field_k.field_m.length >= var7_int)) {
            so.field_k = new k(var7_int);
          }
          so.field_k.field_j = 0;
          so.field_k.a(param5, param3, param0, 114);
          so.field_k.b(var7_int, (byte) 119);
          so.field_k.a(0, var13);
          if (null == l.field_e ||
            !(l.field_e.field_m.length >= 100)) {
            l.field_e = new k(100);
          }
          l.field_e.field_j = 0;
          l.field_e.a(-30, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            l.field_e.b(-128, var13[var11]);
            var11++;
          }
          l.field_e.a(param3, (byte) -82);
          l.field_e.a(param4, -2628, param2);
          param6.a(l.field_e.field_m, l.field_e.field_j, 0, 127);
          param6.a(so.field_k.field_m, so.field_k.field_j, 0, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_22_0 = var7;
          stackIn_22_1 = new StringBuilder().append("qi.A(").append(param0).append(',').append(param1).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    static {
        field_b = "Your request to join has been declined.";
    }
}
