/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static dd[] field_a;
    static mg field_c;
    static String field_e;
    static String field_f;
    static boolean[] field_d;
    static int field_b;

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 3) {
            field_c = (mg) null;
          }
          if (!param2) {
            stackIn_6_0 = pb.field_e.b(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = lj.field_a.b(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("se.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1, boolean param2, float param3) {
        if (param1 < 108) {
          return;
        }
        try {
          if (em.field_g == null) {
            em.field_g = new nd(nb.field_a, rh.field_e);
            nb.field_a.b(em.field_g, (byte) -35);
          }
          em.field_g.a(param0, param3, param2, -122);
          gb.c();
          kb.a(0, true);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "se.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        fi var4_ref_fi = null;
        ql var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        ih var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          var10 = ae.field_a;
          if (param0 > -94) {
            return;
          }
          var2 = var10.e(false);
          var3 = var10.e(false);
          if (var2 == 0) {
            var4_ref_fi = (fi) (lk.field_O.c((byte) 47));
            if (var4_ref_fi == null) {
              k.c(-28354);
              return;
            }
            var5_int = -var10.field_i + pd.field_l;
            var12 = var4_ref_fi.field_m;
            var11 = var12;
            var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.e(false) << sc.a(768, var7 << 8));
            }
            var4_ref_fi.field_p = true;
            var4_ref_fi.c(-1);
            return;
          }
          if (var2 == 1) {
            var4 = var10.a(255);
            var5 = (ql) (sd.field_d.c((byte) 47));
            while (var5 != null) {
              if (var5.field_i != var3 ||
                var5.field_m != var4) {
                var5 = (ql) (sd.field_d.b((byte) -105));
                continue;
              }
              break;
            }
            if (var5 == null) {
              k.c(-28354);
              return;
            }
            var5.c(-1);
            return;
          }
          ud.a("LR1: " + ak.a(true), (Throwable) null, 0);
          k.c(-28354);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "se.E(" + param0 + ')');
        }
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, byte param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
            var9 = ol.field_e.getGraphics();
            if (null == ic.field_bb) {
              ic.field_bb = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, ki.field_a, gm.field_nb);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (param4 > -37) {
                field_f = (String) null;
              }
              if (bd.field_kb == null) {
                bd.field_kb = ol.field_e.createImage(304, 34);
              }
              var10 = bd.field_kb.getGraphics();
              var10.setColor(param1);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param0, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(3 * param0 + 2, 2, 300 - param0 * 3, 30);
              var10.setFont(ic.field_bb);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
              var9.drawImage(bd.field_kb, -152 + ki.field_a / 2, -18 + gm.field_nb / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = ki.field_a / 2 - 152;
              var8 = gm.field_nb / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(1 + var7, 1 + var8, 301, 31);
              var9.fillRect(2 + (var7 + param0 * 3), var8 + 2, 300 - param0 * 3, 30);
              var9.setFont(ic.field_bb);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param2, var7 + (304 - 6 * param2.length()) / 2, var8 + 22);
            }
            if (null != vi.field_b) {
              var9.setFont(ic.field_bb);
              var9.setColor(java.awt.Color.white);
              var9.drawString(vi.field_b, ki.field_a / 2 - 6 * vi.field_b.length() / 2, -26 + gm.field_nb / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ol.field_e.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_22_0 = var5_ref;
          stackIn_22_1 = new StringBuilder().append("se.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_e = null;
        if (!param0) {
          return;
        }
        field_f = null;
        field_c = null;
    }

    static {
        field_f = "Create your own free Jagex account";
        field_e = "Login: ";
        field_c = new mg();
        field_b = 16822275;
    }
}
