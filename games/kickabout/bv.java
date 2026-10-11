/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bv extends jd {
    private String field_k;
    static String field_p;
    static String field_m;
    static rk[] field_l;
    static String field_o;
    private boolean field_j;
    static String field_n;

    final rv a(String param0, int param1) {
        wn var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rv stackIn_2_0 = null;
        rv stackIn_5_0 = null;
        rv stackIn_12_0 = null;
        rv stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ih.a(var4, true)) {
            stackIn_2_0 = jt.field_Bb;
            return stackIn_2_0;
          }
          if (param1 != -5) {
            stackIn_5_0 = (rv) null;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_k)) {
            var3 = cp.a(param1 - 86, param0);
            if (var3 != null &&
              null == var3.field_d) {
              this.field_k = param0;
              this.field_j = var3.field_g;
            } else {
              stackIn_12_0 = en.field_p;
              return stackIn_12_0;
            }
          }
          if (this.field_j) {
            stackIn_17_0 = he.field_yb;
          } else {
            stackIn_17_0 = jt.field_Bb;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("bv.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        if (param0 <= 70) {
          return;
        }
        this.field_k = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wn var4 = null;
        CharSequence var5 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 25) {
            field_o = (String) null;
          }
          var5 = (CharSequence) ((Object) param1);
          var3 = hk.a(var5, false);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param1.equals(this.field_k)) {
            var4 = cp.a(-37, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_d != null) {
              stackIn_12_0 = null;
              return (String) (stackIn_12_0);
            }
            this.field_k = param1;
            this.field_j = var4.field_g;
          }
          if (this.field_j) {
            stackIn_18_0 = Kickabout.field_I;
            return stackIn_18_0;
          }
          stackIn_16_0 = se.field_B;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("bv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, String param1, byte param2) {
        try {
          String var7 = null;
          String var5 = null;
          String var4 = null;
          String var8 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            lu.field_t = param1;
            try {
              if (param2 != 15) {
                String var6 = (String) null;
                bv.a((java.applet.Applet) null, (String) null, (byte) 80);
              }
              var7 = param0.getParameter("cookieprefix");
              var5 = var7;
              var5Lifetime1 = var7;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var8 = var7 + "session=" + param1 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var8;
              var5Lifetime5 = var8;
              var5Lifetime6 = var8;
              if (0 == param1.length()) {
                var5Lifetime6 = var8 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              mm.a("document.cookie=\"" + var5Lifetime6 + "\"", param0, (byte) -19);
            } catch (Throwable throwable) {
            }
            nt.a(param0, (byte) 99);
          } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "bv.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, he param5, np param6) {
        uv var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (param3 < 90) {
          return;
        }
        try {
          el.a(param5, false, param6, -1, param5.field_Rb, (int[]) null, param5.field_Ab, param5.field_Nb, -1);
          wi.field_v.a(true, 0);
          wi.field_v.a(0, -116, (int[]) null);
          wi.field_v.b(-80);
          var12 = wi.field_v;
          var8 = param1;
          var9 = param0;
          var10 = param4;
          var11 = param2;
          var12.field_j.a(0, var10, var8, var9, var11);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bv.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    bv(ga param0) {
        super(param0);
        this.field_j = false;
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param0 != 0) {
              return;
            }
            if (bu.field_h.startsWith("win") &&
              fv.a((byte) -92, param1)) {
              return;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              bd.a("MGR1: " + param1, (Throwable) null, 1);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var4_ref;
            stackIn_13_1 = new StringBuilder().append("bv.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ob param0, int param1, int param2) {
        try {
          if (param1 != 256) {
            String var4 = (String) null;
            bv.a((java.applet.Applet) null, (String) null, (byte) 46);
          }
          ui.g(0).a(param2, (byte) 15, param0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "bv.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        field_m = null;
        field_o = null;
        field_p = null;
        if (param0 > -29) {
          field_l = (rk[]) null;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(boolean param0, int[] param1, int param2) {
        int var4_int = 0;
        double[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        double stackIn_21_2 = 0.0;
        double[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        double stackIn_24_2 = 0.0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        Object var4 = null;
        double[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ea var14 = null;
        ea var15 = null;
        ea var16 = null;
        ea var17 = null;
        int[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        ea[] var23 = null;
        int[] var24 = null;
        int var25 = 0;
        ea[] var26 = null;
        double[] var27 = null;
        int[] var28 = null;
        double[] var29 = null;
        int[] var30 = null;
        double var6Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        var22 = Kickabout.field_G;
        try {
          mh.field_j = param1;
          sc.field_D = param1.length;
          hh.field_d = param2;
          var23 = new ea[256];
          var26 = var23;
          for (var4_int = 0; var4_int < 256; var4_int++) {
            var23[var4_int] = new ea();
          }
          var4 = null;
          var29 = new double[256];
          var27 = var29;
          var5 = var27;
          var6 = 0.0;
          var8 = 0;
          var9 = 0;
          if (!param0) {
            field_n = (String) null;
          }
          var10 = 0;
          var11 = 0;
          var12 = 0;
          bb.field_Mb = new int[sc.field_D];
          var13 = 0;
          for (var11Lifetime1 = 0; var11Lifetime1 < 33; var11Lifetime1++) {
            for (var12Lifetime1 = 0; var12Lifetime1 < 33; var12Lifetime1++) {
              var25 = 0;
              var13Lifetime1 = var25;
              while (var25 < 33) {
                ao.field_i[var11Lifetime1][var12Lifetime1][var25] = 0;
                ra.field_F[var11Lifetime1][var12Lifetime1][var25] = 0;
                tf.field_g[var11Lifetime1][var12Lifetime1][var25] = 0;
                gm.field_fb[var11Lifetime1][var12Lifetime1][var25] = 0;
                uc.field_C[var11Lifetime1][var12Lifetime1][var25] = 0.0;
                var25++;
              }
            }
          }
          wp.a(uc.field_C, ao.field_i, ra.field_F, 121, gm.field_fb, tf.field_g);
          ld.a(ao.field_i, gm.field_fb, uc.field_C, ra.field_F, tf.field_g, false);
          var14 = var26[0];
          var26[0].field_k = 0;
          var15 = var26[0];
          var15.field_i = 0;
          var14.field_c = 0;
          var16 = var26[0];
          var26[0].field_e = 32;
          var17 = var26[0];
          var10Lifetime1 = 0;
          var17.field_d = 32;
          var16.field_l = 32;
          var8Lifetime1 = 1;
          while (var8Lifetime1 < hh.field_d) {
            if (tr.a(var26[var8Lifetime1], false, var26[var10Lifetime1]) == 0) {
              var8Lifetime1--;
              var5[var10Lifetime1] = 0.0;
            } else {
              stackIn_20_0 = var5;
              stackIn_20_1 = var10Lifetime1;
              if (1 >= var26[var10Lifetime1].field_h) {
                stackIn_21_2 = 0.0;
              } else {
                stackIn_21_2 = er.a((byte) 108, var26[var10Lifetime1]);
              }
              stackIn_20_0[stackIn_20_1] = stackIn_21_2;
              stackIn_23_0 = var5;
              stackIn_23_1 = var8Lifetime1;
              if (var26[var8Lifetime1].field_h > 1) {
                stackIn_24_2 = er.a((byte) 108, var26[var8Lifetime1]);
              } else {
                stackIn_24_2 = 0.0;
              }
              stackIn_23_0[stackIn_23_1] = stackIn_24_2;
            }
            var10Lifetime1 = 0;
            var6Lifetime1 = var29[0];
            for (var12Lifetime2 = 1; var8Lifetime1 >= var12Lifetime2; var12Lifetime2++) {
              if (var6Lifetime1 < var29[var12Lifetime2]) {
                var6Lifetime1 = var29[var12Lifetime2];
                var10Lifetime1 = var12Lifetime2;
              }
            }
            if (var6Lifetime1 <= 0.0) {
              hh.field_d = var8Lifetime1 + 1;
            } else {
              var8Lifetime1++;
              continue;
            }
            break;
          }
          var30 = new int[256];
          var28 = var30;
          var18 = var28;
          var24 = new int[35937];
          for (var12Lifetime3 = 0; var12Lifetime3 < hh.field_d; var12Lifetime3++) {
            av.a(var12Lifetime3, 1, var24, var26[var12Lifetime3]);
            var9Lifetime1 = fr.a(var26[var12Lifetime3], ao.field_i, true);
            if (var9Lifetime1 == 0) {
              var30[var12Lifetime3] = 0;
            } else {
              var19 = fr.a(var26[var12Lifetime3], ra.field_F, true) / var9Lifetime1 & 255;
              var20 = fr.a(var26[var12Lifetime3], tf.field_g, true) / var9Lifetime1 & 255;
              var21 = fr.a(var26[var12Lifetime3], gm.field_fb, param0) / var9Lifetime1 & 255;
              var18[var12Lifetime3] = var21 + (var19 << 16) + (var20 << 8);
            }
          }
          for (var8Lifetime2 = 0; sc.field_D > var8Lifetime2; var8Lifetime2++) {
            param1[var8Lifetime2] = var18[qj.b(var24[bb.field_Mb[var8Lifetime2]], 255)];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_48_0 = var3;
          stackIn_48_1 = new StringBuilder().append("bv.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_p = "To Customer Support";
        field_o = "Quit to website";
        field_n = "to the Qualifying Round";
        field_m = "<%0>'s game";
    }
}
