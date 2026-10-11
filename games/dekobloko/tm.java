/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    static String field_g;
    static jd field_b;
    static int[] field_a;
    static int field_d;
    static String field_e;
    static String[] field_f;
    static String field_h;
    static int field_c;

    final static int a(byte param0) {
        int stackIn_31_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          while (ab.$cfr$intArgs$c$a284cb190b53(52)) {
            k.field_f.a(-111);
            if (k.field_f.b((byte) 114)) {
              var1_int = 1;
            }
            if (wh.field_c != 13) {
              continue;
            }
            var2 = 1;
          }
          k.field_f.a(ub.a(bh.field_g, (byte) -81, pm.field_f), -20563, ub.a(he.field_S, (byte) -81, nf.field_h));
          if (k.field_f.b((byte) 114)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            k.field_f.field_h >= 0) {
            var3 = qf.field_i[k.field_f.field_h];
            if (2 == var3 ||
              var3 == 5) {
              bf.a(false);
            }
          } else {
            if (var2 != 0 &&
              bc.field_B != 2) {
              bf.a(false);
            }
          }
          if (param0 > -88) {
            tm.a((byte) 116);
          }
          if (var3 == 0 &&
            2 == bc.field_B) {
            var4 = ik.a(4) - di.field_F;
            var6 = (int)((10999L - var4) / 1000L);
            if (0 >= var6) {
              var3 = 2;
              bl.a(-79, 5, true);
            }
          }
          stackIn_31_0 = var3;
          return stackIn_31_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "tm.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_h = null;
        if (param0 > 87) {
          field_g = null;
          return;
        }
        field_h = (String) null;
        field_g = null;
    }

    final static void b(byte param0) {
        md.field_U[4] = dn.field_j;
        md.field_U[7] = pa.field_W;
        md.field_U[1] = t.field_ib;
        md.field_U[2] = u.field_c;
        md.field_U[3] = kl.field_w;
        md.field_U[6] = l.field_e;
        if (param0 <= -30) {
          md.field_U[5] = ea.field_y;
          md.field_U[0] = vf.field_c;
          ac.field_z[ac.field_z.length - 2] = ta.field_g;
          ac.field_z[-1 + ac.field_z.length] = ph.field_zb;
          return;
        }
    }

    static {
        field_e = "You have not yet unlocked this option for use.";
        field_d = 0;
        field_g = "Waiting for music";
        field_f = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_h = "Create your own free Jagex account";
    }
}
