/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    static ng field_c;
    static int[] field_d;
    static int field_a;
    static byte[] field_e;
    static int[] field_b;

    final static void a(int param0, int param1) {
        if (param1 != -17274) {
          return;
        }
        CipherPacketBuffer var2 = mm.field_g;
        var2.a(param0, (byte) -117);
        var2.a((byte) 114, 1);
        var2.a((byte) 117, 2);
    }

    final static char a(byte param0, byte param1) {
        int var3 = 0;
        int var2 = param1 & 255;
        if (param0 != -71) {
          return '"';
        }
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 >= 128 &&
          160 > var2) {
          var3 = gl.field_w[-128 + var2];
          if (0 == var3) {
            var3 = 63;
          }
          var2 = var3;
        }
        return (char)var2;
    }

    final static SceneWidget a(boolean param0) {
        if (param0) {
          field_c = (ng) null;
        }
        return km.field_j.field_Wb;
    }

    final static int a(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var7 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        long var4 = 0L;
        int var6 = 0;
        var7 = SteelSentinels.obfuscationControl;
        try {
          var1_int = 0;
          var2 = 0;
          while (dl.f(22759)) {
            DualNodeDeque.field_f.a(true);
            if (DualNodeDeque.field_f.c(0)) {
              var1_int = 1;
            }
            if (ei.field_q != 13) {
              continue;
            }
            var2 = 1;
          }
          DualNodeDeque.field_f.a(param0 + 125, GameApplet.a(param0 + 5, pi.field_c, oh.field_f), GameApplet.a(param0 + 5, rj.field_j, oa.field_S));
          if (DualNodeDeque.field_f.c(0)) {
            var1_int = 1;
          }
          var3 = param0;
          if (var1_int != 0 &&
            0 <= DualNodeDeque.field_f.field_e) {
            var3 = oc.field_b[DualNodeDeque.field_f.field_e];
            if (var3 == 2 ||
              5 == var3) {
              NodeIterator.a((byte) -2);
            }
          } else {
            if (var2 != 0 &&
              in.field_a != 2) {
              NodeIterator.a((byte) -2);
            }
          }
          if (var3 == 0 &&
            in.field_a == 2) {
            var4 = mm.a(-63) - rb.field_c;
            var6 = (int)((-var4 + 10999L) / 1000L);
            if (var6 <= 0) {
              var3 = 2;
              cl.a(114, true, 5);
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "eh.F(" + param0 + ')');
        }
    }

    final static cn b(boolean param0) {
        if (param0) {
          return (cn) null;
        }
        if (uc.field_i == null) {
          uc.field_i = new cn(rc.field_m, 20, 0, 0, 0, 11579568, -1, 0, 0, rc.field_m.field_G, -1, 2147483647, true);
        }
        return uc.field_i;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        kg stackIn_5_0;
        int stackIn_5_1;
        int stackIn_5_2;
        int stackIn_5_3;
        boolean stackIn_6_4 = false;
        SceneWidget stackIn_22_0 = null;
        String stackIn_23_1 = null;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dd var16 = null;
        dd var17 = null;
        var15 = SteelSentinels.obfuscationControl;
        try {
          if (param1 != -1) {
            field_a = 45;
          }
          stackIn_5_0 = vi.field_W.field_Xb;
          stackIn_5_1 = 2;
          stackIn_5_2 = 2 + db.field_b;
          stackIn_5_3 = 3 * ((db.field_b + 2) * param2);
          stackIn_6_4 = (vi.field_W.field_Xb == la.field_c);
          var3_int = ((kg) (Object) stackIn_5_0).a(stackIn_5_1, stackIn_5_2, stackIn_5_3, stackIn_6_4, param0, (byte) -41) ? 1 : 0;
          var4 = vi.field_W.field_Wb.field_M;
          if (qc.field_P != 2 &&
            1 != qc.field_P) {
            vi.field_W.field_T = false;
            vi.field_W.field_Xb.field_Tb.field_S = eb.field_q;
            ue.a(0, vi.field_W.field_Wb);
            return;
          }
          vi.field_W.field_Xb.field_Tb.field_S = null;
          vi.field_W.field_T = true;
          var5 = null;
          var6 = (ah) (var4.first(13058));
          while (var6 != null) {
            var7 = 0;
            if (var6.field_M == null) {
              var6.field_Ub = new SceneWidget(0L, bb.field_W);
              var6.a(var6.field_Ub, 121);
              var6.field_cc = new SceneWidget(0L, bb.field_W);
              var6.a(var6.field_cc, param1 ^ -123);
              var7 = 1;
              var6.h(-100);
            }
            var6.field_zb = vi.field_W.field_Wb.field_zb;
            var6.field_Ub.a(0, 0, db.field_b, 0, var6.field_zb);
            var8 = 0;
            if (null != var6.field_Vb &&
              !var6.field_Vb.equals("")) {
              var6.field_cc.field_rb = 16737894;
              var6.field_cc.field_Pb = ce.field_p;
              var6.field_cc.a(0, 0, db.field_b, 0, 3 + ce.field_p.field_z);
              var8 = 1;
            }
            var9 = 0;
            var10 = var6.field_zb;
            if (var8 != 0) {
              var9 = 3 + ce.field_p.field_z;
              var10 = var10 - var9;
            }
            stackIn_22_0 = var6.field_Ub;
            if (var10 > 0) {
              stackIn_23_1 = BitmapFont.a(var6.field_Ub.field_L, var6.field_dc, var10);
            } else {
              stackIn_23_1 = var6.field_dc;
            }
            stackIn_22_0.field_S = stackIn_23_1;
            stackIn_26_0 = (var6.field_Ub.field_S.equals(var6.field_dc)) ? 0 : 1;
            var11 = stackIn_26_0;
            var6.field_Ub.a(~param1, 0, db.field_b, var9, var10);
            if (var3_int == 0) {
              var6.field_lb = -var6.field_Lb + db.field_b;
            }
            if (var7 != 0) {
              vi.field_W.field_Wb.a(2, (byte) 70, (SceneWidget) (var5), var6);
            }
            if (null != var6.field_cc &&
              var6.field_cc.field_kb) {
              ll.field_i = var6.field_Vb;
            } else {
              if (var6.field_Ub.field_kb &&
                var11 != 0) {
                ll.field_i = var6.field_dc;
              }
            }
            var5 = var6;
            if (0 != var6.field_Eb) {
              kk.a(var6, -1, -1, (int[]) null, var6.field_Tb, var6.field_dc, 1073741824, 0L, vi.field_W.field_Xb);
              var16 = an.field_i;
              var13_ref_String = sa.field_a;
              var16.field_j.a(param1 ^ -3, 7, var13_ref_String);
              var17 = an.field_i;
              var13 = oa.field_S;
              var14 = rj.field_j;
              var17.field_j.a(0, 0, var14, (byte) -115, var13);
            }
            var6 = (ah) (var4.next((byte) -11));
          }
          if (vi.field_W.field_bc.field_Eb != 0) {
            kc.field_y = new el(vi.field_W.field_bc.field_Rb, vi.field_W.field_bc.field_cb, vi.field_W.field_bc.field_zb, vi.field_W.field_bc.field_Lb, bm.field_W, kf.field_y, bd.field_f, bd.field_f);
            ol.field_bc = 2;
          }
          if (vi.field_W.field_Sb.field_Eb == 0) {
            return;
          }
          kc.field_y = new el(vi.field_W.field_Sb.field_Rb, vi.field_W.field_Sb.field_cb, vi.field_W.field_Sb.field_zb, vi.field_W.field_Sb.field_Lb, va.field_g, kf.field_y, bd.field_f, bd.field_f);
          ol.field_bc = 3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "eh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = new int[8192];
        field_a = -1;
        field_b = new int[36];
        field_b[32] = 360;
        field_b[20] = 60;
        field_b[9] = 30;
        field_b[8] = 60;
        field_b[6] = 30;
        field_b[7] = 30;
        field_b[19] = 60;
        field_b[33] = 180;
        field_b[34] = 120;
    }
}
