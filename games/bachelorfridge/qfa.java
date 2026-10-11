/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qfa extends cga {
    lu field_v;
    int field_u;
    static String field_w;
    byte field_s;
    static String field_t;

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = BachelorFridge.field_y;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          if (param0 != 20) {
            qfa.i(-118);
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (65 <= var5 &&
              var5 <= 90) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_23_0 = new String(var8);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("qfa.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int e(int param0) {
        if (this.field_v == null) {
          return 0;
        }
        if (param0 == -6298) {
          return this.field_v.field_g * 100 / (-this.field_s + this.field_v.field_h.length);
        }
        field_w = (String) null;
        return this.field_v.field_g * 100 / (-this.field_s + this.field_v.field_h.length);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6, int param7, int param8) {
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        try {
          qc.field_b.field_Z = param5;
          if (2 == gk.field_d) {
            qq.field_k.field_Z = ru.field_l;
          } else {
            qq.field_k.field_Z = ro.field_k;
          }
          var9_int = 495;
          var10 = 5;
          aja.field_p.a(param4, 31407, -10 + var9_int, 5, var10);
          jba.field_A.a(param4, 31407, aja.field_p.field_sb - ts.field_r.field_sb, 0, 0);
          var10 = var10 + (param4 + param0);
          ts.field_r.a(param4, 31407, ts.field_r.field_sb, jba.field_A.field_sb, 0);
          ub.field_k.a(param1, 31407, ub.field_k.e(-1), 5, var10);
          var11 = qq.field_k.e(-1);
          qq.field_k.a(param1, 31407, var11, -var11 + (var9_int - 5), var10);
          var12 = param1 + (var10 + 5);
          qc.field_b.a(param8, 31407, var9_int, 0, 0);
          tga.field_m.a(var12, 31407, var9_int, 0, param8);
          if (param3 > -114) {
            field_w = (String) null;
          }
          tga.field_m.field_eb = mu.a(11579568, 3, tga.field_m.field_p, 8421504, 2105376, (byte) 17);
          var12 = var12 + param8;
          bi.field_h.a(var12, 31407, var9_int, param2 - var9_int / 2, -(var12 / 2) + param6);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qfa.M(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          int var3 = 0;
          String var4 = null;
          java.net.URL var5 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          String var4Lifetime1;
          String var4Lifetime2;
          try {
            try {
              var2 = param0.getDocumentBase().getFile();
              var4 = var2;
              var4Lifetime1 = var2;
              if (param1 >= -18) {
                field_t = (String) null;
              }
              var3 = var2.indexOf('?');
              var4Lifetime2 = "reload.ws";
              if (var3 >= 0) {
                var4Lifetime2 = var4Lifetime2 + var2.substring(var3);
              }
              var5 = new java.net.URL(param0.getCodeBase(), var4Lifetime2);
              param0.getAppletContext().showDocument(ow.a(var5, (byte) -107, param0), "_self");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("qfa.N(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qfa() {
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 3) {
            stackIn_3_0 = lda.field_d;
            return stackIn_3_0;
          }
          if (param2 >= -75) {
            var4 = (String) null;
            qfa.a(1, -126, -56, (byte) -48, -64, (String) null, -14, 77, -120);
          }
          if (param0 == 6) {
            stackIn_9_0 = ed.field_c;
            return stackIn_9_0;
          }
          if (param0 == 7) {
            stackIn_12_0 = vc.field_b;
            return stackIn_12_0;
          }
          if (param0 == 8) {
            stackIn_16_0 = hr.field_e;
            return stackIn_16_0;
          }
          if (param0 == 9) {
            stackIn_19_0 = bm.field_m;
            return stackIn_19_0;
          }
          if (param0 == 10) {
            stackIn_23_0 = wm.field_l;
            return stackIn_23_0;
          }
          if (param0 == 11) {
            stackIn_26_0 = nla.field_e;
            return stackIn_26_0;
          }
          if (param0 != 14) {
            return null;
          }
          stackIn_30_0 = lga.a(true, new String[]{param1}, vfa.field_r);
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("qfa.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_w = null;
        if (param0 != 97) {
          return;
        }
        field_t = null;
    }

    final static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bga var4_ref_bga = null;
        Object var5 = null;
        int var6 = 0;
        fm var9 = null;
        pf var10 = null;
        byte[] var14 = null;
        var6 = BachelorFridge.field_y;
        try {
          var10 = ig.field_m;
          var2 = var10.b(16711935);
          if (param0 >= -44) {
            return;
          }
          if (0 == var2) {
            var9 = (fm) (us.field_e.b((byte) 90));
            if (var9 == null) {
              vc.a((byte) -118);
              return;
            }
            var4 = var10.b(16711935);
            if (0 == var4) {
              var5 = null;
            } else {
              var14 = new byte[var4];
              var10.a(var14, var4, 128, 0);
            }
            var10.field_g = var10.field_g + 4;
            if (var10.j(4)) {
              var9.a(false);
              return;
            }
            vc.a((byte) -124);
            return;
          }
          if (var2 != 1) {
            cv.a(1, "A1: " + nia.d((byte) -108), (Throwable) null);
            vc.a((byte) -115);
            return;
          }
          var3 = var10.f(-108);
          var4_ref_bga = (bga) (on.field_r.b((byte) 90));
          while (var4_ref_bga != null) {
            if (var4_ref_bga.field_i != var3) {
              var4_ref_bga = (bga) (on.field_r.c(0));
              continue;
            }
            break;
          }
          if (var4_ref_bga == null) {
            vc.a((byte) -80);
            return;
          }
          var4_ref_bga.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "qfa.L(" + param0 + ')');
        }
    }

    final static void i(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        pf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        try {
          if (param0 != 8) {
            field_t = (String) null;
          }
          var1 = sja.field_fb;
          while (tg.c(-43)) {
            var1.c(8, (byte) 119);
            fieldTemp$0 = var1.field_g + 1;
            var1.field_g = var1.field_g + 1;
            var2 = fieldTemp$0;
            sia.a(var1, 108);
            sja.field_fb.b((byte) -68, var1.field_g - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref), "qfa.P(" + param0 + ')');
        }
    }

    final static void f(int param0) {
        qi.field_b = new ue();
        kka.field_l.e(qi.field_b, 33);
        int var1 = -78 / ((param0 - 45) / 53);
    }

    final byte[] d(byte param0) {
        if (this.field_n) {
          throw new RuntimeException();
        }
        if (-this.field_s + this.field_v.field_h.length > this.field_v.field_g) {
          throw new RuntimeException();
        }
        if (param0 == -65) {
          return this.field_v.field_h;
        }
        qfa.i(1);
        return this.field_v.field_h;
    }

    static {
        field_w = "***Ignored!***";
        field_t = "Player";
    }
}
