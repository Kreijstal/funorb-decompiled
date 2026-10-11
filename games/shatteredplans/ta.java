/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static qr field_d;
    static pf field_b;
    static bi field_a;
    static String field_c;
    static String field_e;

    final static void a(String param0, ha param1, int param2, int param3, nq param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param2 != 27329) {
            ta.a(62, -55L);
          }
          var5_int = 0;
          var6 = -1;
          for (var7 = 1; param0.length() > var7; var7++) {
            var8 = param0.charAt(var7);
            if (var8 == 60) {
              var6 = (var5_int >> 8) + (param1.field_b[0] + param4.c(param0.substring(0, var7)));
            }
            if (var6 != -1) {
              param1.field_b[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param3;
              }
              param1.field_b[var7] = (var5_int >> 8) - (-param1.field_b[0] + (-param4.c(param0.substring(0, var7 + 1)) + param4.a((char) var8)));
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ta.G(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        if (ol.a(-104)) {
          param0 = false;
        }
        di.a(false, param0);
        if (f.field_C) {
          gf.h(n.field_h.field_d.field_hb, n.field_h.field_d.field_db, n.field_h.field_d.field_K, n.field_h.field_d.field_mb);
          n.field_h.field_d.b(param0, -68);
          ml.a((byte) 99, param0);
          if (param1 < 38) {
            field_c = (String) null;
            return;
          }
          return;
        }
        ml.a((byte) 99, param0);
        if (param1 >= 38) {
          return;
        }
        field_c = (String) null;
    }

    final static nk c(byte param0) {
        nk var1 = new nk(tk.field_y, eg.field_t, cf.field_H[0], sj.field_a[0], mc.field_s[0], cm.field_g[0], hd.field_q[0], eo.field_fb);
        pd.a(0);
        if (param0 > 82) {
          return var1;
        }
        ta.a(113);
        return var1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 < 110) {
          field_c = (String) null;
        }
    }

    final static boolean a(int param0) {
        int var1 = 94 / ((param0 + 29) / 49);
        return fj.field_s == ue.field_a ? true : false;
    }

    final static void b(byte param0) {
        byte[] var1;
        byte[] var2;
        byte[] var1Lifetime1;
        byte[] var2Lifetime1;
        if (param0 == -69) {
          if (w.d(true)) {
            return;
          }
          if (de.field_j == -1) {
            return;
          }
          if (de.field_j == uc.field_A) {
            return;
          }
          var2 = new byte[2];
          var1 = var2;
          var2[0] = (byte) 0;
          var2[1] = (byte)de.field_j;
          r.a(var2, (byte) -78, 6);
          uc.field_A = de.field_j;
          return;
        }
        ta.a(true, -56);
        if (w.d(true)) {
          return;
        }
        if (de.field_j == -1) {
          return;
        }
        if (de.field_j == uc.field_A) {
          return;
        }
        var2Lifetime1 = new byte[2];
        var1Lifetime1 = var2Lifetime1;
        var2Lifetime1[0] = (byte) 0;
        var2Lifetime1[1] = (byte)de.field_j;
        r.a(var2Lifetime1, (byte) -78, 6);
        uc.field_A = de.field_j;
    }

    final static mj a(int param0, long param1) {
        int var3 = -91 % ((59 - param0) / 56);
        return (mj) (ShatteredPlansClient.field_H.a(65280, param1));
    }

    final static void a(int param0, int param1, byte param2, boolean param3) {
        int var4 = 0;
        int var4Lifetime1;
        if (param1 == gr.field_o) {
          return;
        }
        gr.field_o = param1;
        br.field_m = param0;
        if (nh.a((byte) -94, vr.field_c)) {
          mj.field_Hb[vr.field_c].a(-30492, gr.field_o);
          if (nh.a((byte) -73, gr.field_o)) {
            var4 = 0;
            if (11 == gr.field_o) {
              var4 = -1;
            }
            mj.field_Hb[gr.field_o].a(var4, (byte) 27, param3);
          }
          eh.field_Q = 0;
          if (param2 != 96) {
            ta.b((byte) 9);
            return;
          }
          return;
        }
        if (nh.a((byte) -73, gr.field_o)) {
          var4Lifetime1 = 0;
          if (11 == gr.field_o) {
            var4Lifetime1 = -1;
          }
          mj.field_Hb[gr.field_o].a(var4Lifetime1, (byte) 27, param3);
        }
        eh.field_Q = 0;
        if (param2 == 96) {
          return;
        }
        ta.b((byte) 9);
    }

    static {
        field_b = new pf();
        field_e = "Percentage of battles won in friendly space.";
        field_c = "Join <%0>'s game";
    }
}
