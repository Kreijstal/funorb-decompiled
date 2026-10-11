/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hm {
    static int field_c;
    static String field_b;
    static String field_a;

    abstract long a(byte param0);

    final static r a(int param0) {
        if (param0 >= -88) {
          return (r) null;
        }
        return hd.field_g;
    }

    final static boolean a(String param0, long param1, int param2) {
        gh var4 = null;
        RuntimeException var4_ref = null;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = j.a(0, param0);
          if (param2 != -24236) {
            hm.a(false, false);
          }
          if (var4 != null &&
            null != var4.field_Pb) {
            return true;
          }
          stackIn_11_0 = (wl.field_d != null) && (null != ic.a(param1, (byte) -127));
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_14_0 = var4_ref;
          stackIn_14_1 = new StringBuilder().append("hm.N(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
        }
        String var2 = (String) null;
        nd.a((byte) 40, de.field_sb, (String) null);
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 0 / ((param0 + 49) / 54);
        field_b = null;
    }

    abstract void d(int param0);

    final static void a(boolean param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        km stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_9_4 = 0;
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        km var7 = null;
        int var7_int = 0;
        int var8 = 0;
        km var8_ref_km = null;
        hk var9 = null;
        int var9_int = 0;
        int var10 = 0;
        hk var10_ref_hk = null;
        int var12 = 0;
        int var13 = 0;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          f.field_b = df.field_f;
          if (!param1) {
            hm.a((String) null, 18L, 31);
          }
          eb.field_f = df.field_e;
          if (param0) {
            stackIn_6_0 = hn.field_h;
          } else {
            stackIn_6_0 = th.field_z;
          }
          rf.a(stackIn_6_0, -4);
          he.field_pc.a(36, 0, 0, -2 + ao.field_Eb.field_ub - 40, ao.field_Eb.field_K);
          qh.field_R.a(0, pg.field_e, ia.field_d.field_K, (byte) -52, 0);
          stackIn_8_0 = kh.field_g;
          stackIn_8_1 = 0;
          stackIn_8_2 = 18;
          stackIn_8_3 = ia.field_d.field_K;
          if (!ql.field_d) {
            stackIn_9_4 = 0;
          } else {
            stackIn_9_4 = 4 + (oc.field_k + 40);
          }
          ((km) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 - stackIn_9_4, (byte) -105, 2 + pg.field_e);
          gn.field_F.a(-oc.field_k + (ia.field_d.field_K - 42), 18, 42 + oc.field_k, (byte) -107, 2 + pg.field_e);
          wm.field_r.a(2 + pg.field_e + 20, -114, ia.field_d.field_K, 2, -pg.field_e + (ia.field_d.field_ub - 2 - 20), 0, oc.field_k);
          fb.field_o.a(0, 40, ao.field_Eb.field_K, (byte) -120, -40 + ao.field_Eb.field_ub);
          qi.field_e.a(0, 30, dm.field_r.field_K, (byte) -57, 0);
          nn.field_b.a(0, -30 + dm.field_r.field_ub - 42, dm.field_r.field_K, (byte) -118, 30);
          var2_int = vb.field_h + 3;
          if (vj.field_b.length < 2) {
            var2_int--;
          }
          if (param0) {
            var2_int--;
          }
          var3 = ((var2_int + 1) / 2 + (-13 + (nn.field_b.field_ub - 5))) / (1 + var2_int) - 2;
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (nn.field_b.field_ub - 5 - var2_int * (var3 + 2));
          if (var4 > 40) {
            var4 = 40;
          }
          qa.field_c.a(5, var4, -5 + nn.field_b.field_K - 5, (byte) -92, 5);
          var5 = 2 + var4 + 5;
          for (var6 = 0; var6 < vb.field_h + 4; var6++) {
            if ((var6 != 1 ||
              !(vj.field_b.length < 2)) && (var6 != 3 ||
              !(qi.field_f <= 1))) {
              if (!param0 &&
                3 == var6) {
                var7 = f.field_f[var6];
                f.field_f[var6].field_ub = 0;
                var7.field_K = 0;
                for (var8 = 0; var8 < oe.field_b[var6].length; var8++) {
                  if (null != oe.field_b[var6][var8]) {
                    var9 = oe.field_b[var6][var8];
                    oe.field_b[var6][var8].field_ub = 0;
                    var9.field_K = 0;
                  }
                }
              } else if (param0 &&
                var6 == 0) {
                var7 = f.field_f[var6];
                f.field_f[var6].field_ub = 0;
                var7.field_K = 0;
                for (var8 = 0; var8 < oe.field_b[var6].length; var8++) {
                  if (oe.field_b[var6][var8] != null) {
                    var9 = oe.field_b[var6][var8];
                    oe.field_b[var6][var8].field_ub = 0;
                    var9.field_K = 0;
                  }
                }
              } else {
                if (param0) {
                  if (var6 >= 4) {
                    if (null != je.field_J) {
                      stackIn_50_0 = (je.field_J[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_50_0 = 0;
                    }
                  } else {
                    stackIn_50_0 = 0;
                  }
                } else {
                  stackIn_50_0 = 0;
                }
                var7_int = stackIn_50_0;
                if (var7_int != 0) {
                  var8_ref_km = f.field_f[var6];
                  f.field_f[var6].field_ub = 0;
                  var8_ref_km.field_K = 0;
                  for (var9_int = 0; var9_int < oe.field_b[var6].length; var9_int++) {
                    if (null != oe.field_b[var6][var9_int]) {
                      var10_ref_hk = oe.field_b[var6][var9_int];
                      oe.field_b[var6][var9_int].field_ub = 0;
                      var10_ref_hk.field_K = 0;
                    }
                  }
                } else {
                  f.field_f[var6].a(5, var3, 103, (byte) -58, var5);
                  var8 = 110;
                  if (!param0) {
                    if (oe.field_b[var6][0] != null) {
                      var9 = oe.field_b[var6][0];
                      oe.field_b[var6][0].field_ub = 0;
                      var9.field_K = 0;
                    }
                  } else {
                    oe.field_b[var6][0].a(38, var8, 2, var5, dl.field_b, var3, 2);
                    var8 += 40;
                  }
                  var9_int = -5 + dm.field_r.field_K + (-var8 + 2);
                  var10 = oe.field_b[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    oe.field_b[var6][1 + var11].a(var9_int * (var11 + 1) / var10 + (-2 - var12), var8 + var12, 2, var5, dl.field_b, var3, 2);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          pm.field_n.a(df.field_e - 360 >> 1, -130 + (df.field_f - 14), 360, (byte) -97, 10);
          jj.field_m.a(0, 24, pm.field_n.field_K, (byte) -69, 0);
          jb.field_J.a(0, -24 + pm.field_n.field_ub, pm.field_n.field_K, (byte) -77, 24);
          jb.field_J.field_vb = ne.a(jb.field_J.field_ub, 3, 1, (byte) 106, 8421504, 11579568);
          ij.field_m.a(5, jb.field_J.field_ub - 34 - 2, -10 + jb.field_J.field_K, (byte) -120, 5);
          na.field_Ib.a((-80 + jb.field_J.field_K) / 2, 24, 80, (byte) -117, -24 + jb.field_J.field_ub - 5);
          rc.d(-20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "hm.L(" + param0 + ',' + param1 + ')');
        }
    }

    abstract int a(byte param0, long param1);

    final int a(int param0, long param1) {
        long var4 = this.a((byte) -84);
        if (var4 > 0L) {
          mm.a(-17, var4);
        }
        if (param0 != 16680) {
          return 113;
        }
        return this.a((byte) -103, param1);
    }

    static {
        field_b = "Password: ";
        field_a = "Remove friend";
    }
}
