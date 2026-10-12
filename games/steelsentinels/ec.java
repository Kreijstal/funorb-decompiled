/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static int[] field_c;
    static ef field_b;
    static String field_g;
    static String[] field_e;
    static String field_f;
    static String field_d;
    static char[] field_a;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    final static byte[] a(int param0, kj param1, byte[] param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = SteelSentinels.field_G;
        try {
          if (param3 != -13035) {
            field_c = (int[]) null;
          }
          var4_int = param1.g(param3 + 12957, param0);
          if (var4_int == 0) {
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          if (param2 == null ||
            param2.length != var4_int) {
            param2 = new byte[var4_int];
          }
          var5 = param1.g(-119, 3);
          var6 = (byte)param1.g(111, 8);
          if (var5 <= 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)(param1.g(33, var5) + var6);
            }
          }
          stackIn_18_0 = (byte[]) (param2);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ec.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, long param2) {
        kj var4 = mm.field_g;
        var4.a(param0, (byte) -117);
        var4.field_p = var4.field_p + 1;
        int var5 = var4.field_p;
        var4.a((byte) 127, 7);
        var4.b(-28875, param2);
        var4.b((byte) 105, -var5 + var4.field_p);
        if (param1) {
          field_c = (int[]) null;
        }
    }

    public static void b(byte param0) {
        if (param0 != 24) {
          return;
        }
        field_d = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_g = null;
        field_c = null;
        field_e = null;
    }

    final static void a(int param0) {
        String[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        String stackIn_6_2 = null;
        String[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        String stackIn_9_2 = null;
        String[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_12_2 = null;
        String[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        String stackIn_15_2 = null;
        String[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_18_2 = null;
        String[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_21_2 = null;
        if (null != ti.field_A) {
          return;
        }
        ti.field_A = new String[48];
        ti.field_A[13] = bi.field_c;
        ti.field_A[3] = kj.field_G;
        ti.field_A[2] = fb.field_q;
        ti.field_A[7] = jn.field_a;
        ti.field_A[0] = fk.field_f;
        ti.field_A[8] = null;
        ti.field_A[6] = ge.field_g;
        ti.field_A[5] = kd.field_s;
        ti.field_A[9] = ck.field_m;
        ti.field_A[1] = qb.field_C;
        ti.field_A[11] = vc.field_l;
        ti.field_A[4] = hb.field_h;
        stackIn_5_0 = ti.field_A;
        stackIn_5_1 = 44;
        if (!ik.field_h) {
          stackIn_6_2 = sa.field_b;
        } else {
          stackIn_6_2 = o.field_a;
        }
        stackIn_5_0[stackIn_5_1] = stackIn_6_2;
        stackIn_8_0 = ti.field_A;
        stackIn_8_1 = 43;
        if (ui.field_G) {
          stackIn_9_2 = tm.field_f;
        } else {
          stackIn_9_2 = fj.field_i;
        }
        stackIn_8_0[stackIn_8_1] = stackIn_9_2;
        ti.field_A[param0] = jd.field_pb;
        ti.field_A[14] = qj.field_d[0];
        ti.field_A[23] = cf.field_v;
        stackIn_11_0 = ti.field_A;
        stackIn_11_1 = 41;
        if (!si.field_p) {
          stackIn_12_2 = fm.field_h;
        } else {
          stackIn_12_2 = hf.field_b;
        }
        stackIn_11_0[stackIn_11_1] = stackIn_12_2;
        ti.field_A[21] = li.field_y;
        ti.field_A[46] = jd.field_jb;
        ti.field_A[24] = sn.field_h;
        ti.field_A[27] = q.field_g;
        ti.field_A[16] = qj.field_d[2];
        ti.field_A[18] = wc.field_b[1];
        ti.field_A[17] = wc.field_b[0];
        ti.field_A[32] = pm.field_P;
        ti.field_A[29] = jc.field_j;
        ti.field_A[31] = mg.field_Tb;
        ti.field_A[38] = "";
        ti.field_A[33] = na.field_u;
        ti.field_A[20] = kj.field_y;
        ti.field_A[26] = ng.field_b;
        ti.field_A[19] = ul.field_a;
        stackIn_14_0 = ti.field_A;
        stackIn_14_1 = 47;
        if (tj.field_a) {
          stackIn_15_2 = qj.field_u;
        } else {
          stackIn_15_2 = he.field_d;
        }
        stackIn_14_0[stackIn_14_1] = stackIn_15_2;
        ti.field_A[15] = qj.field_d[1];
        ti.field_A[22] = mg.field_ec;
        stackIn_17_0 = ti.field_A;
        stackIn_17_1 = 42;
        if (dm.field_c) {
          stackIn_18_2 = qm.field_c;
        } else {
          stackIn_18_2 = od.field_j;
        }
        stackIn_17_0[stackIn_17_1] = stackIn_18_2;
        ti.field_A[45] = un.field_e;
        ti.field_A[30] = ed.field_e;
        stackIn_20_0 = ti.field_A;
        stackIn_20_1 = 37;
        if (ka.field_V) {
          stackIn_21_2 = ge.field_i;
        } else {
          stackIn_21_2 = fg.field_Vb;
        }
        stackIn_20_0[stackIn_20_1] = stackIn_21_2;
        ti.field_A[34] = ea.field_e;
        ti.field_A[28] = hc.field_cb;
        ti.field_A[25] = vf.field_a;
        ti.field_A[40] = pe.field_R;
        ti.field_A[39] = mg.field_nc;
        i.field_a = db.a(i.field_a, param0 ^ -25, new String[]{ln.a("<img=26>", (byte) 11, "<img=17>", he.field_d)});
        bc.field_yb = db.a(bc.field_yb, param0 ^ -56, new String[]{ln.a("<img=26>", (byte) 11, "<img=17>", qj.field_u)});
    }

    final static void a(byte param0) {
        int var1 = rd.a((byte) -78);
        if (param0 >= -60) {
          field_d = (String) null;
        }
        int var2 = al.a(0);
        gl.field_l.a((ok.field_c << 1) + var1, -15203, -ok.field_c + hl.field_q, var2 + (cl.field_b << 1), -cl.field_b + lk.field_W);
        rg.a(118);
    }

    final static wk[] a(byte param0, String param1, cm param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        wk[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -27) {
            var6 = (String) null;
            ec.a((byte) -7, (String) null, (cm) null, (String) null);
          }
          var4_int = param2.a(param3, 27);
          var5 = param2.a(var4_int, -32759, param1);
          stackIn_3_0 = vh.a(var5, param2, var4_int, (byte) 48);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ec.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_g = "Unfortunately you are not eligible to create an account.";
        field_c = new int[]{11, 14, -1, 6, -1, 3, -1, 6, -1, 6};
        field_e = new String[3];
        field_b = new ef();
        field_f = "End mission";
        field_d = "Try again";
        field_a = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
