/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po {
    int field_h;
    String field_g;
    mf field_b;
    String field_d;
    static ad field_e;
    static String field_c;
    static int field_a;
    String field_f;

    final static void a(boolean param0) {
        if (!param0) {
          return;
        }
        sq.field_c = new kb(re.field_m, rf.field_c, am.field_Zb, ad.field_l, of.field_k, tk.field_t);
    }

    public static void b(int param0) {
        field_e = null;
        field_c = null;
        int var1 = -88 % ((param0 - 44) / 45);
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 != 13) {
          return;
        }
        if (224 <= ul.field_p) {
          wp.a(1, 256);
        } else {
          var1 = ul.field_p % 32;
          wp.a(param0 ^ 12, 32 + (ul.field_p - var1));
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            var9 = kj.field_D.getGraphics();
            if (eo.field_g == null) {
              eo.field_g = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, to.field_b, be.field_g);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == oj.field_r) {
                oj.field_r = kj.field_D.createImage(304, 34);
              }
              var10 = oj.field_r.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, param4, 303, 33);
              var10.fillRect(2, 2, param2 * 3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + 3 * param2, 2, -(3 * param2) + 300, 30);
              var10.setFont(eo.field_g);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param0, (-(param0.length() * 6) + 304) / 2, 22);
              var9.drawImage(oj.field_r, to.field_b / 2 - 152, be.field_g / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + to.field_b / 2;
              var8 = be.field_g / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param2 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, var8 + 1, 301, 31);
              var9.fillRect(2 + var7 + param2 * 3, var8 + 2, 300 - param2 * 3, 30);
              var9.setFont(eo.field_g);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (-(param0.length() * 6) + 304) / 2, 22 + var8);
            }
            if (oi.field_g != null) {
              var9.setFont(eo.field_g);
              var9.setColor(java.awt.Color.white);
              var9.drawString(oi.field_g, to.field_b / 2 - 6 * oi.field_g.length() / 2, -26 + be.field_g / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            kj.field_D.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("po.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(byte param0) {
        boolean stackIn_13_0 = false;
        boolean stackIn_18_0 = false;
        boolean stackIn_19_1 = false;
        String[] stackIn_25_0 = null;
        tp[] stackIn_28_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ak var4 = null;
        ak var5 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var4 = pe.field_o.field_w;
          var5 = var4;
          ec.field_Q = oa.field_Sb;
          ci.field_r = pe.field_o.field_p;
          eg.field_k = pe.field_o.c(124);
          cb.field_n = pe.field_o.field_n;
          sk.field_I = pe.field_o.field_w.field_k;
          fh.field_h = new String[sk.field_I];
          for (var2 = 0; var2 < sk.field_I; var2++) {
            fh.field_h[var2] = var4.field_f[var2];
          }
          pi.field_o = new int[var5.field_m.length];
          for (var2Lifetime1 = 0; var5.field_m.length > var2Lifetime1; var2Lifetime1++) {
            pi.field_o[var2Lifetime1] = var5.field_m[var2Lifetime1];
          }
          da.field_C = new int[sk.field_I];
          for (var2Lifetime2 = 0; var2Lifetime2 < sk.field_I; var2Lifetime2++) {
            da.field_C[var2Lifetime2] = var5.field_l[var2Lifetime2].field_H;
          }
          stackIn_13_0 = !(ci.field_r);
          wk.field_p = stackIn_13_0;
          if (!eg.field_k) {
            for (var2Lifetime3 = 0; pi.field_o.length > var2Lifetime3; var2Lifetime3++) {
              stackIn_18_0 = wk.field_p;
              stackIn_19_1 = (~pe.field_o.field_k == ~var5.field_m[var2Lifetime3]);
              wk.field_p = stackIn_18_0 | stackIn_19_1;
            }
          }
          if (ci.field_r) {
            if (cb.field_n) {
              stackIn_25_0 = hm.field_b;
            } else {
              stackIn_25_0 = ih.field_j;
            }
          } else {
            stackIn_25_0 = ar.field_a;
          }
          sj.field_c = stackIn_25_0;
          var2Lifetime4 = 57 % ((-7 - param0) / 42);
          if (sk.field_I == 2) {
            stackIn_28_0 = me.field_a;
          } else {
            stackIn_28_0 = pl.field_f;
          }
          qp.field_e = stackIn_28_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "po.A(" + param0 + ')');
        }
    }

    static {
        field_a = 0;
        field_c = "Not yet achieved";
    }
}
