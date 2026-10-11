/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 > -104) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          vf.a((java.applet.Applet) null, 33);
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -37) {
            return;
          }
          var5 = sc.field_i;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "vf.E(" + param0 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (dd.a(param1, (byte) 122)) {
            return true;
          }
          var2 = wh.field_r;
          var3 = 0;
          if (param0 != -3) {
            field_c = (String) null;
          }
          while (var3 < var2.length) {
            var4 = var2[var3];
            if (~var4 == ~param1) {
              return true;
            }
            var3++;
          }
          var2Lifetime1 = uh.field_b;
          for (var3Lifetime1 = 0; var3Lifetime1 < var2Lifetime1.length; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2_ref), "vf.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        gp stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        ak stackIn_20_0 = null;
        String stackIn_21_1 = null;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        bb var4 = null;
        Object var5 = null;
        im var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wi var17 = null;
        wi var18 = null;
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          stackIn_3_0 = v.field_e.field_Gb;
          stackIn_3_1 = param0;
          stackIn_4_2 = (bj.field_d == v.field_e.field_Gb);
          var3_int = ((gp) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, 2, 3 * (fq.field_q + 2) * param2, param1 ^ param1, 2 + fq.field_q) ? 1 : 0;
          var4 = v.field_e.field_Fb.field_L;
          if (2 != gk.field_db &&
            1 != gk.field_db) {
            v.field_e.field_Gb.field_Ib.field_cb = mk.field_c;
            v.field_e.field_rb = false;
            wd.a(v.field_e.field_Fb, false);
            return;
          }
          v.field_e.field_rb = true;
          v.field_e.field_Gb.field_Ib.field_cb = null;
          var5 = null;
          var6 = (im) (var4.c(1504642273));
          while (var6 != null) {
            var7 = 0;
            if (null == var6.field_L) {
              var6.field_Pb = new ak(0L, ak.field_T);
              var6.a(var6.field_Pb, (byte) 26);
              var6.field_Ob = new ak(0L, ak.field_T);
              var6.a(var6.field_Ob, (byte) 26);
              var6.h(-257);
              var7 = 1;
            }
            var6.field_K = v.field_e.field_Fb.field_K;
            var6.field_Pb.a(0, fq.field_q, 0, param1 ^ 256, var6.field_K);
            var8 = 0;
            if (null != var6.field_Gb &&
              !var6.field_Gb.equals("")) {
              var6.field_Ob.field_y = 16737894;
              var6.field_Ob.field_H = dk.field_e;
              var6.field_Ob.a(0, fq.field_q, 0, param1 + 256, dk.field_e.field_A + 3);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_K;
            if (var8 != 0) {
              var9 = dk.field_e.field_A + 3;
              var10 = var10 - var9;
            }
            stackIn_20_0 = var6.field_Pb;
            if (0 >= var10) {
              stackIn_21_1 = var6.field_Fb;
            } else {
              stackIn_21_1 = jl.a(var6.field_Pb.field_Db, var6.field_Fb, var10);
            }
            stackIn_20_0.field_cb = stackIn_21_1;
            stackIn_24_0 = (var6.field_Pb.field_cb.equals(var6.field_Fb)) ? 0 : 1;
            var11 = stackIn_24_0;
            var6.field_Pb.a(0, fq.field_q, var9, param1 + 256, var10);
            if (var3_int == 0) {
              var6.field_Z = fq.field_q - var6.field_nb;
            }
            if (var7 != 0) {
              v.field_e.field_Fb.a(var6, 2, -1, (ak) (var5));
            }
            if (var6.field_Ob != null &&
              var6.field_Ob.field_W) {
              up.field_o = var6.field_Gb;
            } else {
              if (var6.field_Pb.field_W &&
                var11 != 0) {
                up.field_o = var6.field_Fb;
              }
            }
            if (var6.field_P != 0) {
              em.a(var6.field_Fb, 0L, var6.field_Ib, -1, var6, -163, v.field_e.field_Gb, (int[]) null, -1);
              var17 = eg.field_n;
              var13_ref_String = k.field_n;
              var17.field_b.a(var13_ref_String, (byte) -107, 7);
              var18 = eg.field_n;
              var13 = uo.field_a;
              var14 = ji.field_c;
              var18.field_b.b(0, var13, 43, var14, 0);
            }
            var5 = var6;
            var6 = (im) (var4.f(1504642273));
          }
          if (v.field_e.field_Ib.field_P != 0) {
            he.field_f = new ve(v.field_e.field_Ib.field_tb, v.field_e.field_Ib.field_gb, v.field_e.field_Ib.field_K, v.field_e.field_Ib.field_nb, dp.field_p, po.field_c, mg.field_h, mg.field_h);
            il.field_e = 2;
          }
          if (v.field_e.field_Hb.field_P == 0) {
            return;
          }
          he.field_f = new ve(v.field_e.field_Hb.field_tb, v.field_e.field_Hb.field_gb, v.field_e.field_Hb.field_K, v.field_e.field_Hb.field_nb, uf.field_f, po.field_c, mg.field_h, mg.field_h);
          il.field_e = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "vf.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              if (param1 != 3279) {
                field_c = (String) null;
              }
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(lg.a(false, param0, var5), "_self");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("vf.D(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "Kick <%0> from this game";
        field_c = "Click";
        field_a = "Connection lost. <%0>";
    }
}
