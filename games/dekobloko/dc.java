/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static tb field_b;
    static boolean field_d;
    static String field_g;
    static String field_c;
    static String field_k;
    int field_j;
    int field_f;
    int field_h;
    int field_a;
    static ak field_e;
    static String field_i;

    final static boolean a(int param0, int param1, int param2) {
        if (param2 != 6774) {
          field_c = (String) null;
        }
        int var3 = g.field_N != null ? 1 : 0;
        if (wh.field_c == 9 &&
          pc.a(uh.field_d, param2 - 6772, ng.field_a, he.field_Y, wf.field_o)) {
          if (2 != uh.field_d &&
            var3 != 0) {
            return false;
          }
          return vm.a(wf.field_o, ng.field_a, he.field_Y, -12, uh.field_d);
        }
        if (wh.field_c == 10) {
          if (var3 != 0) {
            return false;
          }
          aj.a(-1045);
          return true;
        }
        if (11 == wh.field_c) {
          if (!ch.field_c) {
            return false;
          }
          if (qa.field_y == 2 &&
            !sg.a(fa.field_r, param2 ^ 6671, li.field_e)) {
            return false;
          }
          if (qa.field_y != 2 &&
            var3 != 0) {
            return false;
          }
          if (vh.a((byte) 70)) {
            String var4 = (String) null;
            ce.a(param1, (byte) -85, qa.field_y, fa.field_r, cd.field_a, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void a(boolean param0, int param1) {
        boolean stackIn_7_0 = false;
        boolean stackIn_8_1 = false;
        boolean stackIn_11_2 = false;
        if (ph.n(-30146) && (tf.a((byte) 38, j.field_d) ||
          gh.field_e != null ||
          !(id.field_P <= 0))) {
          ba.field_c = true;
          stackIn_7_0 = true;
          stackIn_8_1 = !(id.field_P <= 0);
          stackIn_11_2 = (null != gh.field_e);
          pd.field_d = rc.a(stackIn_7_0, stackIn_8_1, stackIn_11_2, (byte) -61, param0);
          return;
        }
        ba.field_c = false;
        ob.field_k = false;
        if (tf.a((byte) 64, j.field_d)) {
          lk.field_F = true;
        }
        if (ge.field_c) {
          ge.field_c = false;
          fm.field_e = true;
        }
        if (gn.field_b) {
          mg.field_Zb = true;
          gn.field_b = false;
        }
        if (param1 <= 75) {
          field_i = (String) null;
        }
        qi.a(param0, (byte) -108);
    }

    final static boolean a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          if (!cb.a(true, param0, 4564)) {
            return false;
          }
          for (var2_int = 0; param0.length() > var2_int; var2_int++) {
            if (!oe.a(param0.charAt(var2_int), -6237)) {
              return false;
            }
          }
          if (param1 == -70) {
            return true;
          }
          field_i = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("dc.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = client.field_A ? 1 : 0;
        try {
          if (!nm.field_Qb) {
            if (null == dm.field_b) {
              dm.field_b = cc.a(4, (byte) -115);
            }
            if (dm.field_b.field_u) {
              var12 = o.field_g;
              var10 = var12;
              var5 = var10;
              var1 = var5;
              var16 = dm.field_b.field_t;
              for (var3 = 0; var3 < 8; var3++) {
                var5[var3] = de.b(var12[var3], var16[var3]);
              }
              var13 = j.field_d;
              var11 = var13;
              var7 = var11;
              var1Lifetime1 = var7;
              var17 = dm.field_b.field_t;
              var9 = 0;
              var3Lifetime1 = var9;
              while (var9 < 8) {
                var7[var9] = lb.a(var13[var9], ~var17[var9]);
                var9++;
              }
              nm.field_Qb = true;
              dm.field_b = null;
            }
          }
          if (!qj.field_k) {
            if (null == mf.field_N) {
              mf.field_N = ub.a(1, 5, 0, 107);
            }
            if (mf.field_N.field_s) {
              var1_int = mf.field_N.field_q[0];
              mf.field_N = null;
              qj.field_k = true;
              if (id.field_P < var1_int) {
                id.field_P = var1_int;
              }
            }
          }
          if (param0 > -59) {
            dc.a(true, 110);
          }
          if (nm.field_Qb &&
            qj.field_k) {
            fh.b((byte) -125);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1_ref), "dc.D(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_i = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_k = null;
        field_g = null;
    }

    static {
        field_g = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_c = "Shortcut Reference";
        field_d = false;
        field_k = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_b = new tb();
        field_i = "You have withdrawn your request to join.";
    }
}
