/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends pg {
    int field_n;
    static char[] field_i;
    static kc field_j;
    static String[][] field_o;
    static byte[] field_l;
    static String field_k;
    static char[] field_h;
    static int field_m;
    static volatile boolean field_g;
    static String field_p;

    final static qb[] a(int param0, int param1, int param2, int param3, byte param4) {
        qb[] var6 = new qb[9];
        qb[] var5 = var6;
        if (param4 != 123) {
          return (qb[]) null;
        }
        qb dupTemp$0 = ce.b(param2, param3, 21385);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        qb dupTemp$1 = ce.b(param2, param1, param4 + 21262);
        var5[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param0 != 0) {
          var5[4] = ce.b(64, param0, hh.a((int) param4, 21490));
        }
        return var5;
    }

    public static void a(byte param0) {
        field_i = null;
        field_l = null;
        field_h = null;
        int var1 = -124 % ((param0 - 0) / 41);
        field_p = null;
        field_o = (String[][]) null;
        field_j = null;
        field_k = null;
    }

    final static void a(boolean param0, int param1, int param2) {
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        String[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        String stackIn_45_2 = null;
        String[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        String stackIn_51_2 = null;
        boolean stackIn_93_0 = false;
        int stackIn_114_0 = 0;
        int stackIn_115_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String[] var4_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String[] var10 = null;
        String var11 = null;
        String var12 = null;
        String[] var4_ref_String__Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var8Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime2;
        int var8Lifetime3;
        int var5Lifetime2Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 != -4693) {
            field_m = -4;
          }
          go.field_i = param2;
          if (go.field_i == 0) {
            var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
            var4 = 3 + var3_int;
            ib.field_v = new String[var4];
            oe.field_c = new int[var4];
            for (var5 = 0; var5 < var4; var5++) {
              oe.field_c[var5] = -1;
            }
            hn.field_k = new int[2];
            for (var5 = 0; var5 < var3_int; var5++) {
              ib.field_v[var5] = qg.field_a[var5];
            }
            ib.field_v[var4 - 3] = "";
            ib.field_v[-2 + var4] = la.field_e;
            oe.field_c[var4 - 2] = 0;
            hn.field_k[0] = 4;
            ib.field_v[-1 + var4] = dd.field_e;
            oe.field_c[var4 - 1] = 1;
            hn.field_k[1] = 5;
          } else if (go.field_i == 1) {
            var3_int = hf.a(qg.field_a, oc.field_d, eb.field_a, mg.field_C, param1 + 25923);
            var4 = 2 + var3_int;
            ib.field_v = new String[var4];
            oe.field_c = new int[var4];
            for (var5 = 0; var4 > var5; var5++) {
              oe.field_c[var5] = -1;
            }
            hn.field_k = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              ib.field_v[var5] = qg.field_a[var5];
            }
            ib.field_v[var4 - 2] = "";
            ib.field_v[var4 - 1] = dd.field_e;
            oe.field_c[-1 + var4] = 0;
            hn.field_k[0] = 5;
          } else if (go.field_i != 2) {
            if (go.field_i == 3) {
              if (fi.field_d.field_p) {
                var3_int = hf.a(qg.field_a, of.field_l, eb.field_a, mg.field_C, 21230);
              } else {
                var3_int = hf.a(qg.field_a, wi.field_j, eb.field_a, mg.field_C, param1 ^ -16571);
              }
              var4 = var3_int + 2;
              ib.field_v = new String[var4];
              oe.field_c = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                oe.field_c[var5] = -1;
              }
              hn.field_k = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ib.field_v[var5] = qg.field_a[var5];
              }
              ib.field_v[var4 - 2] = "";
              ib.field_v[var4 - 1] = dd.field_e;
              oe.field_c[var4 - 1] = 0;
              hn.field_k[0] = 5;
            } else if (go.field_i == 4) {
              var3_int = hf.a(qg.field_a, ki.field_w, eb.field_a, mg.field_C, 21230);
              var4 = 2 + var3_int;
              oe.field_c = new int[var4];
              ib.field_v = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                oe.field_c[var5] = -1;
              }
              hn.field_k = new int[1];
              for (var5 = 0; var5 < var3_int; var5++) {
                ib.field_v[var5] = qg.field_a[var5];
              }
              ib.field_v[var4 - 2] = "";
              ib.field_v[var4 - 1] = dd.field_e;
              oe.field_c[-1 + var4] = 0;
              hn.field_k[0] = 5;
            } else {
              if (go.field_i != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = hf.a(qg.field_a, fl.field_d, eb.field_a, mg.field_C, param1 + 25923);
              var4 = 3 + var3_int;
              ib.field_v = new String[var4];
              oe.field_c = new int[var4];
              for (var5 = 0; var5 < var4; var5++) {
                oe.field_c[var5] = -1;
              }
              hn.field_k = new int[2];
              for (var5 = 0; var5 < var3_int; var5++) {
                ib.field_v[var5] = qg.field_a[var5];
              }
              ib.field_v[var4 - 3] = "";
              ib.field_v[-2 + var4] = sl.field_R;
              oe.field_c[var4 - 2] = 0;
              hn.field_k[0] = 3;
              ib.field_v[-1 + var4] = dd.field_e;
              oe.field_c[-1 + var4] = 1;
              hn.field_k[1] = 5;
            }
          } else {
            var3_int = hf.a(qg.field_a, tj.a(-112, new String[]{"<br><%0><br>"}, dm.field_F), eb.field_a, mg.field_C, param1 + 25923);
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(qg.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            jb.field_u = new String[var4];
            sf.a(qg.field_a, 0, jb.field_u, 0, var4);
            ik.field_c = new String[-1 + (-var4 + var3_int)];
            sf.a(qg.field_a, var4 + 1, ik.field_c, 0, var3_int - var4 - 1);
            var4 = -1;
            var3_int = hf.a(qg.field_a, tj.a(param1 ^ -4656, new String[]{"<br><%0><br>"}, bo.field_b), eb.field_a, mg.field_C, 21230);
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(qg.field_a[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            lo.field_u = new String[var4];
            sf.a(qg.field_a, 0, lo.field_u, 0, var4);
            dk.field_c = new String[-1 + var3_int - var4];
            sf.a(qg.field_a, 1 + var4, dk.field_c, 0, -var4 + var3_int - 1);
            if (jb.field_u.length >= lo.field_u.length) {
              stackIn_34_0 = jb.field_u.length;
            } else {
              stackIn_34_0 = lo.field_u.length;
            }
            var5 = stackIn_34_0;
            if (ik.field_c.length < dk.field_c.length) {
              stackIn_37_0 = dk.field_c.length;
            } else {
              stackIn_37_0 = ik.field_c.length;
            }
            var6 = stackIn_37_0;
            var7 = var5 + (7 + var6);
            ib.field_v = new String[var7];
            oe.field_c = new int[var7];
            for (var8 = 0; var7 > var8; var8++) {
              oe.field_c[var8] = -1;
            }
            ib.field_v[1] = ln.field_R;
            oe.field_c[1] = 0;
            ib.field_v[0] = tc.field_C;
            hn.field_k = new int[2];
            ib.field_v[4] = we.field_d;
            ib.field_v[5] = "";
            ib.field_v[2] = li.field_G;
            ib.field_v[3] = ki.field_t;
            oe.field_c[3] = 1;
            hn.field_k[0] = 5;
            hn.field_k[1] = 2;
            for (var8Lifetime2 = 0; var8Lifetime2 < var5; var8Lifetime2++) {
              stackIn_44_0 = ib.field_v;
              stackIn_44_1 = 6 + var8Lifetime2;
              if (lo.field_u.length + var8Lifetime2 - var5 >= 0) {
                stackIn_45_2 = lo.field_u[lo.field_u.length + (var8Lifetime2 - var5)];
              } else {
                stackIn_45_2 = "";
              }
              stackIn_44_0[stackIn_44_1] = stackIn_45_2;
            }
            ib.field_v[6 + var5] = null;
            oe.field_c[6 + var5] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_50_0 = ib.field_v;
              stackIn_50_1 = var8Lifetime3 + (var5 + 7);
              if (var8Lifetime3 < dk.field_c.length) {
                stackIn_51_2 = dk.field_c[var8Lifetime3];
              } else {
                stackIn_51_2 = "";
              }
              stackIn_50_0[stackIn_50_1] = stackIn_51_2;
            }
            qj.b(-26572);
          }
          hi.field_h.field_f = hn.field_k.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; ib.field_v.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_93_0 = !(0 > oe.field_c[var4Lifetime1]);
            var5Lifetime1 = vh.a(stackIn_93_0, (byte) 10, ib.field_v[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (go.field_i == 2) {
            var10 = jb.field_u;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = vh.a(false, (byte) 37, var11);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ik.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = vh.a(false, (byte) 96, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          rd.field_a = (bm.field_h + da.field_c << 1) * hi.field_h.field_f;
          for (var4Lifetime2 = 0; ib.field_v.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_114_0 = rd.field_a;
            if (oe.field_c[var4Lifetime2] < 0) {
              stackIn_115_1 = qj.field_a;
            } else {
              stackIn_115_1 = mo.field_h;
            }
            rd.field_a = stackIn_114_0 + stackIn_115_1;
          }
          hf.field_r = to.field_p - (rd.field_a >> 1);
          wh.field_d = new int[ib.field_v.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = hf.field_r;
          while (var4Lifetime3 < ib.field_v.length) {
            var6Lifetime1 = oe.field_c[var4Lifetime3];
            if (0 <= var6Lifetime1) {
              var7Lifetime2 = vh.a(true, (byte) 111, ib.field_v[var4Lifetime3]);
              var8Lifetime1 = -(var7Lifetime2 >> 1) + vd.field_l;
              var5Lifetime3 = var5Lifetime3 + da.field_c;
              wh.field_d[var4Lifetime3] = new int[4];
              wh.field_d[var4Lifetime3][0] = var8Lifetime1 - la.field_d;
              wh.field_d[var4Lifetime3][1] = var5Lifetime3;
              wh.field_d[var4Lifetime3][2] = var7Lifetime2 + (la.field_d << 1);
              var5Lifetime3 = var5Lifetime3 + ((bm.field_h << 1) + da.field_c + mo.field_h);
              wh.field_d[var4Lifetime3][3] = mo.field_h + (bm.field_h << 1);
            } else {
              var5Lifetime3 = var5Lifetime3 + qj.field_a;
            }
            var4Lifetime3++;
          }
          if (go.field_i == 2) {
            hi.field_h.a(param0, -1, false, -1);
          } else {
            hi.field_h.a(param0, 0, false, bl.a(me.field_I, (byte) 70, an.field_g));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "qa.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qa(int param0) {
        this.field_n = param0;
    }

    final static boolean a(boolean param0, wa param1, wa param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0) {
            return true;
          }
          var3_int = -param2.field_Bb + param1.field_Bb;
          if (param1.field_Lb == ie.field_Nb) {
            var3_int -= 200;
          } else {
            if (param1.field_Lb == null) {
              var3_int += 200;
            }
          }
          if (param2.field_Lb != ie.field_Nb) {
            if (param2.field_Lb == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("qa.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
        field_i = new char[128];
        field_h = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_g = false;
        field_k = "You are already in a tower";
        field_p = "MOST ANNOYING - ";
    }
}
