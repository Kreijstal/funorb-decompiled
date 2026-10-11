/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg {
    private String field_m;
    String field_l;
    static dd field_f;
    private int field_d;
    static String field_a;
    int field_j;
    int[] field_c;
    static rd field_i;
    private boolean field_k;
    int field_e;
    int field_b;
    private long field_g;
    static td field_h;

    final static pd a(byte param0, ie param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        pd stackIn_2_0 = null;
        pd stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            stackIn_2_0 = (pd) null;
            return stackIn_2_0;
          }
          var2 = new pd(param1, param1);
          bk.field_d.a(false, var2);
          qg.field_f.a(param1);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("sg.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = fleas.field_A ? 1 : 0;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (ii.a(param1 + 96, param0)) {
            return true;
          }
          var2 = ei.field_m;
          var3 = 0;
          if (param1 != -95) {
            sg.a(false, -117);
          }
          while (var2.length > var3) {
            var4 = var2[var3];
            if (~param0 != ~var4) {
              var3++;
              continue;
            }
            return true;
          }
          var2Lifetime1 = sa.field_a;
          var3Lifetime1 = 0;
          while (true) {
            if (var3Lifetime1 >= var2Lifetime1.length) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (var4Lifetime1 != param0) {
              var3Lifetime1++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "sg.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static sg a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ih var8 = null;
        aj var9 = null;
        var7 = fleas.field_A ? 1 : 0;
        var8 = ae.field_a;
        var3 = var8.e(false);
        stackIn_3_0 = (0 != (var3 & 128));
        ll.field_j = stackIn_3_0;
        d.field_N = 127 & var3;
        gm.field_ob = var8.e(false);
        ki.field_b = var8.f(-83);
        if (d.field_N == 2) {
          ga.field_o = var8.d((byte) -60);
          jd.field_t = var8.c(true);
        } else {
          jd.field_t = 0;
          ga.field_o = 0;
        }
        stackIn_9_0 = (var8.e(false) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        ci.field_e = var8.h(0);
        if (var4 == 0) {
          qi.field_d = ci.field_e;
        } else {
          qi.field_d = var8.h(0);
        }
        if (d.field_N == 1 ||
          d.field_N == 4) {
          var8.d((byte) -121);
          var8.h(0);
        }
        if (param1 < 22) {
          field_f = (dd) null;
        }
        if (param0) {
          var5 = var8.d((byte) 59);
          try {
            var9 = nf.field_F.a(32768, var5);
            wf.field_d = var9.c((byte) 103);
            if (qi.field_d.equals(b.field_e)) {
              stackIn_24_0 = null;
            } else {
              stackIn_24_0 = var9.field_z;
            }
            l.field_c = stackIn_24_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ud.a("CC1", (Throwable) ((Object) var6), 0);
            l.field_c = null;
            wf.field_d = null;
          }
        } else {
          wf.field_d = tf.a(var8, 0, 80);
          l.field_c = null;
        }
        return new sg(param0);
    }

    final int b(int param0) {
        if (!this.field_k && (this.field_j != 2 ||
          0 >= this.field_d)) {
          if (jc.field_b == this.field_g) {
            return 1;
          }
          if (nb.field_i == 2 &&
            ef.a((byte) 119, this.field_m)) {
            return 1;
          }
          if (param0 == 0) {
            return 0;
          }
          this.b(53);
          return 0;
        }
        return 2;
    }

    public static void a(int param0) {
        field_i = null;
        field_f = null;
        if (param0 != -3) {
          sg.a(-59);
        }
        field_h = null;
        field_a = null;
    }

    private sg(boolean param0) {
        if (!param0) {
          this.field_c = null;
        } else {
          this.field_c = l.field_c;
        }
        this.field_j = d.field_N;
        this.field_e = jd.field_t;
        this.field_l = wf.field_d;
        this.field_g = ki.field_b;
        this.field_b = ga.field_o;
        this.field_k = ll.field_j;
        this.field_m = qi.field_d;
        this.field_d = gm.field_ob;
    }

    static {
        field_i = new rd();
    }
}
