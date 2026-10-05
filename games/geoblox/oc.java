/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc implements dh {
    static dm field_d;
    static ba field_e;
    static int field_f;
    static String field_a;
    static int field_c;
    static int field_b;

    final static void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Geoblox.field_C;
        fe.field_j.b(0, 0);
        ne.field_b.b(320 - (ne.field_b.field_s >> 1), param0 - (ne.field_b.field_o >> 1));
        kh.field_h[0].b(0, 20);
        int var1 = -70 + n.field_j;
        if (var1 >= 0) {
            if (!((double)var1 * 0.0174532925 < 1.5707963267948966)) {
                var2 = tl.field_r[vc.field_h].field_s >> 1;
                if (vc.field_h >= 11) {
                    var3 = (n.field_j - fh.field_c >> 1) * (n.field_j - fh.field_c >> 1) >> 1;
                    tl.field_r[vc.field_h].b(-(tl.field_r[vc.field_h].field_s >> 1) + 320, var3 + (-(tl.field_r[vc.field_h].field_o >> 1) + 240), si.field_j);
                    qh.field_O[0].b(var2 + 320, -34 + var3 - (qh.field_O[0].field_o >> 1) + 240);
                    qh.field_O[1].b(-var2 + 320 - qh.field_O[1].field_s, -(qh.field_O[1].field_o >> 1) + (240 + var3 + 22));
                    return;
                }
                var3 = n.field_j << 2;
                if (var2 + 320 < 1000 - var3) {
                    qh.field_O[0].b(1000 - var3, -34 + (240 - (qh.field_O[0].field_o >> 1)));
                } else {
                    qh.field_O[0].b(320 + var2, 206 - (qh.field_O[0].field_o >> 1));
                }
                if (-qh.field_O[1].field_s + (320 - var2) > var3 - 1200) {
                    qh.field_O[1].b(var3 - 1200, 22 + (240 - (qh.field_O[1].field_o >> 1)));
                    tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
                    return;
                }
                qh.field_O[1].b(-qh.field_O[1].field_s - var2 + 320, 240 - (qh.field_O[1].field_o >> 1) + 22);
                tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
                return;
            }
            kh.field_h[0].c(0, 20, (int)(0.5 + Math.sin(2.0 * ((double)var1 * 0.0174532925)) * 90.0));
        }
        var2 = tl.field_r[vc.field_h].field_s >> 1;
        if (vc.field_h >= 11) {
            var3 = (n.field_j - fh.field_c >> 1) * (n.field_j - fh.field_c >> 1) >> 1;
            tl.field_r[vc.field_h].b(-(tl.field_r[vc.field_h].field_s >> 1) + 320, var3 + (-(tl.field_r[vc.field_h].field_o >> 1) + 240), si.field_j);
            qh.field_O[0].b(var2 + 320, -34 + var3 - (qh.field_O[0].field_o >> 1) + 240);
            qh.field_O[1].b(-var2 + 320 - qh.field_O[1].field_s, -(qh.field_O[1].field_o >> 1) + (240 + var3 + 22));
            return;
        }
        var3 = n.field_j << 2;
        if (var2 + 320 < 1000 - var3) {
            qh.field_O[0].b(1000 - var3, -34 + (240 - (qh.field_O[0].field_o >> 1)));
            if (-qh.field_O[1].field_s + (320 - var2) > var3 - 1200) {
                qh.field_O[1].b(var3 - 1200, 22 + (240 - (qh.field_O[1].field_o >> 1)));
                tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
                return;
            }
            qh.field_O[1].b(-qh.field_O[1].field_s - var2 + 320, 240 - (qh.field_O[1].field_o >> 1) + 22);
            tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
            return;
        }
        qh.field_O[0].b(320 + var2, 206 - (qh.field_O[0].field_o >> 1));
        if (-qh.field_O[1].field_s + (320 - var2) > var3 - 1200) {
            qh.field_O[1].b(var3 - 1200, 22 + (240 - (qh.field_O[1].field_o >> 1)));
            tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
            return;
        }
        qh.field_O[1].b(-qh.field_O[1].field_s - var2 + 320, 240 - (qh.field_O[1].field_o >> 1) + 22);
        tl.field_r[vc.field_h].b(320 - var2, 240 - (tl.field_r[vc.field_h].field_o >> 1), si.field_j);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (!param0) {
            return;
        }
        field_a = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        dm var8 = null;
        try {
          var6_int = param4.field_v + param0;
          var7 = param4.field_m + param2;
          ik.a(var6_int, param4.field_h, var7, param4.field_r, -1540604944);
          var8 = oa.field_e[1];
          if (param4 instanceof hk &&
              ((hk) ((Object) param4)).field_y) {
            var8.c(var6_int - (-1 - (-var8.field_s + param4.field_r >> 1)), (-var8.field_o + param4.field_h >> 1) + 1 + var7, 256);
          }
          if (param4.e((byte) 54)) {
            bf.a(var7 + 2, -4 + param4.field_r, 14164, -4 + param4.field_h, var6_int + 2);
          }
          if (param1 < -5) {
            return;
          }
          field_c = 68;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("oc.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var2 = -117 / ((-46 - param0) / 50);
        tl var1 = (tl) ((Object) sg.field_b.e(1));
        if (var1 == null) {
            var1 = new tl();
        }
        var1.a(vb.field_e, vb.field_k, vb.field_d, vb.field_f, vb.field_b, vb.field_i, vb.field_c, true);
        n.field_l.a(-88, var1);
    }

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
            int var1 = 0;
            Exception var1_ref_Exception = null;
            Runtime var2 = null;
            Throwable var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[]{});
              if (var1_ref_java_lang_reflect_Method == null) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
              try {
                var2 = Runtime.getRuntime();
                var4 = (Object[]) null;
                var3 = (Long) (var1_ref_java_lang_reflect_Method.invoke((Object) (var2), (Object[]) null));
                li.field_c = 1 + (int)(var3.longValue() / 1048576L);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                var1 = -93 / ((-13 - param0) / 47);
                return;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
              var1 = -93 / ((-13 - param0) / 47);
              return;
            }
            var1 = -93 / ((-13 - param0) / 47);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = 80;
        field_d = new dm(640, 640);
    }
}
