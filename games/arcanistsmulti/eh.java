/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static char[] field_f;
    static String field_a;
    static int[] field_g;
    static String field_d;
    static volatile int field_c;
    static String field_b;
    static qb field_e;

    final static String[] a(boolean param0, char param1, String param2) {
        int var7 = 0;
        int incrementValue$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        CharSequence var10 = null;
        String[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0) {
            field_e = (qb) null;
          }
          var10 = (CharSequence) ((Object) param2);
          var3_int = wa.a(param1, var10, (byte) -16);
          var4 = new String[var3_int + 1];
          var5 = 0;
          var6 = 0;
          for (var7 = 0; var7 < var3_int; var7++) {
            for (var8 = var6; param1 != param2.charAt(var8); var8++) {
            }
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = param2.substring(var6, var8);
            var6 = var8 + 1;
          }
          var4[var3_int] = param2.substring(var6);
          stackIn_10_0 = var4;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("eh.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        ce var1 = (ce) (lh.field_c.b(12623));
        int var2 = -104 % ((-41 - param0) / 40);
        if (var1 == null) {
          ka.b(false);
          return;
        }
        ab var3 = df.field_z;
        var3.d(-10674);
        var3.d(-10674);
        var3.d(-10674);
        var3.d(-10674);
        var1.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        if (param0) {
          eh.b((byte) -111);
        }
        if (wh.field_g) {
          return ln.field_U.a(ed.field_Bb, (byte) 123, vn.field_d);
        }
        if (oj.field_i) {
          return rg.a(param3, -14, param2);
        }
        if (rk.a((byte) -60, param3, param2)) {
          return true;
        }
        if (ld.field_p) {
          return false;
        }
        return ko.a(-110, param1, param2);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static String a(byte param0, int param1, String param2) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        ab var6 = null;
        CharSequence var7 = null;
        try {
          var7 = (CharSequence) ((Object) param2);
          if (!vn.a(var7, 0)) {
            stackIn_3_0 = fn.field_h;
            return stackIn_3_0;
          }
          if (je.a(16, param2)) {
            stackIn_7_0 = sd.field_l;
            return stackIn_7_0;
          }
          if (jb.field_t != 2) {
            stackIn_11_0 = vi.field_K;
            return stackIn_11_0;
          }
          if (sa.a(param2, 320)) {
            stackIn_15_0 = tj.a(119, new String[]{param2}, sc.field_bb);
            return stackIn_15_0;
          }
          if (pc.field_b >= 100) {
            stackIn_19_0 = nh.field_u;
            return stackIn_19_0;
          }
          if (kl.a(param2, 1)) {
            stackIn_23_0 = tj.a(114, new String[]{param2}, ga.field_q);
            return stackIn_23_0;
          }
          var6 = he.field_e;
          var6.b((byte) -67, param1);
          var6.field_g = var6.field_g + 1;
          var4 = var6.field_g;
          var6.f(2, (byte) -70);
          if (param0 >= -14) {
            var5 = (String) null;
            eh.a(false, '￞', (String) null);
          }
          var6.a(param2, 23333);
          var6.b(-var4 + var6.field_g, (byte) 43);
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("eh.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = -93 % ((78 - param0) / 43);
        field_d = null;
        field_b = null;
        field_e = null;
        field_f = null;
        field_a = null;
    }

    final static boolean a(int param0, eg param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18306) {
            eh.a((byte) 21);
          }
          stackIn_3_0 = param1.a(-27);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("eh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        kc stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        kc stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        kc stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        int var5;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        vc.a((byte) -126);
        if (param2 != 4) {
          field_b = (String) null;
        }
        if (sk.field_e >= 0) {
          kg.field_c.field_rb = tj.a(-14, new String[]{Integer.toString(sk.field_e)}, gi.field_j);
        } else {
          kg.field_c.field_rb = null;
        }
        stackIn_11_0 = k.field_d;
        stackIn_12_1 = (param0) && (!param1) && (!pg.field_d) && (null == wi.field_f) && (om.field_x == null);
        ((kc) (Object) stackIn_11_0).b(stackIn_12_1, (byte) 75);
        stackIn_18_0 = fn.field_e;
        stackIn_19_1 = (param0) && (!param1) && (!pg.field_d) && (null == wi.field_f) && (null == om.field_x);
        ((kc) (Object) stackIn_18_0).b(stackIn_19_1, (byte) 121);
        stackIn_23_0 = gm.field_h;
        stackIn_24_1 = (param0) && (!param1) && (pg.field_d);
        ((kc) (Object) stackIn_23_0).b(stackIn_24_1, (byte) 115);
        aj.field_h.field_c.h((byte) 100);
        if (0 != ii.field_b.field_U) {
          dh.field_Mb = true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (of.field_a.field_U != 0) {
          if (!gm.field_c &&
            0 >= ah.field_c) {
            if (2 > qf.field_d) {
              me.field_C = true;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!ri.field_b[12]) {
                me.field_C = true;
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            ib.a(param3, 0);
          }
        }
        if (0 != jl.field_a.field_U) {
          if (ao.field_h.length == 1 &&
            ef.field_t != ao.field_h[0]) {
            ef.field_t = ao.field_h[0];
          }
          dn.a(param2 - 13218, 0, ml.field_m, param3, ef.field_t, true);
        }
        if (0 != dm.field_E.field_U) {
          pg.field_d = false;
        }
    }

    static {
        field_d = "Cancel rematch";
        field_b = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_f = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[]{1, 2, 2, 3, 5, 10, 2, 2, 2, 2, 3, 3, 5, 5, 10, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 5, 1, 3, 1, 3, 1, 5, 3, 3, 5, 3, 1, 1, 5, 3, 5, 10, 10, 10, 1, 1, 1, 1, 1, 1, 5, 1, 2, 2, 2, 2, 2, 4, 4, 2, 2, 4, 5, 5, 1, 1, 4, 2, 3, 4, 1, 1, 4, 5, 2, 5, 1, 3, 3, 5, 1, 3, 1, 3, 3, 4, 2, 3, 3, 3};
        field_a = "Password: ";
        field_c = 0;
    }
}
