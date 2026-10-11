/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ka extends q {
    int field_m;
    static int[][] field_n;
    int field_k;
    static int field_j;
    static String field_l;

    final static void a(int param0, boolean param1, byte param2) {
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        String[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        String stackIn_41_2 = null;
        String[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        String stackIn_47_2 = null;
        boolean stackIn_89_0 = false;
        int stackIn_116_0 = 0;
        int stackIn_117_1 = 0;
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
        var9 = Torquing.field_u;
        try {
          i.field_R = true;
          go.field_x = param0;
          if (go.field_x == 0) {
            var3_int = rf.a(dd.field_e, bo.field_e, field_j, 87, pc.field_i);
            var4 = var3_int + 3;
            mn.field_Z = new int[var4];
            wh.field_z = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              mn.field_Z[var5] = -1;
            }
            di.field_e = new int[2];
            for (var5 = 0; var3_int > var5; var5++) {
              wh.field_z[var5] = dd.field_e[var5];
            }
            wh.field_z[-3 + var4] = "";
            wh.field_z[-2 + var4] = ol.field_b;
            mn.field_Z[var4 - 2] = 0;
            di.field_e[0] = 4;
            wh.field_z[var4 - 1] = qd.field_i;
            mn.field_Z[-1 + var4] = 1;
            di.field_e[1] = 5;
          } else if (go.field_x == 1) {
            var3_int = rf.a(dd.field_e, bo.field_e, field_j, 74, pc.field_i);
            var4 = var3_int + 2;
            mn.field_Z = new int[var4];
            wh.field_z = new String[var4];
            for (var5 = 0; var4 > var5; var5++) {
              mn.field_Z[var5] = -1;
            }
            di.field_e = new int[1];
            for (var5 = 0; var5 < var3_int; var5++) {
              wh.field_z[var5] = dd.field_e[var5];
            }
            wh.field_z[-2 + var4] = "";
            wh.field_z[var4 - 1] = qd.field_i;
            mn.field_Z[var4 - 1] = 0;
            di.field_e[0] = 5;
          } else if (go.field_x != 2) {
            if (go.field_x == 3) {
              if (!nk.field_u.field_d) {
                var3_int = rf.a(dd.field_e, bo.field_e, field_j, 115, ak.field_h);
              } else {
                var3_int = rf.a(dd.field_e, bo.field_e, field_j, 84, hj.field_a);
              }
              var4 = 2 + var3_int;
              wh.field_z = new String[var4];
              mn.field_Z = new int[var4];
              for (var5 = 0; var4 > var5; var5++) {
                mn.field_Z[var5] = -1;
              }
              di.field_e = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                wh.field_z[var5] = dd.field_e[var5];
              }
              wh.field_z[var4 - 2] = "";
              wh.field_z[-1 + var4] = qd.field_i;
              mn.field_Z[-1 + var4] = 0;
              di.field_e[0] = 5;
            } else if (go.field_x == 4) {
              var3_int = rf.a(dd.field_e, bo.field_e, field_j, 75, wj.field_j);
              var4 = 2 + var3_int;
              mn.field_Z = new int[var4];
              wh.field_z = new String[var4];
              for (var5 = 0; var5 < var4; var5++) {
                mn.field_Z[var5] = -1;
              }
              di.field_e = new int[1];
              for (var5 = 0; var3_int > var5; var5++) {
                wh.field_z[var5] = dd.field_e[var5];
              }
              wh.field_z[var4 - 2] = "";
              wh.field_z[-1 + var4] = qd.field_i;
              mn.field_Z[var4 - 1] = 0;
              di.field_e[0] = 5;
            } else {
              if (go.field_x != 5) {
                throw new IllegalArgumentException();
              }
              var3_int = rf.a(dd.field_e, bo.field_e, field_j, 74, dn.field_c);
              var4 = var3_int + 3;
              mn.field_Z = new int[var4];
              wh.field_z = new String[var4];
              for (var5 = 0; var4 > var5; var5++) {
                mn.field_Z[var5] = -1;
              }
              di.field_e = new int[2];
              for (var5 = 0; var3_int > var5; var5++) {
                wh.field_z[var5] = dd.field_e[var5];
              }
              wh.field_z[var4 - 3] = "";
              wh.field_z[-2 + var4] = ud.field_l;
              mn.field_Z[-2 + var4] = 0;
              di.field_e[0] = 3;
              wh.field_z[var4 - 1] = qd.field_i;
              mn.field_Z[-1 + var4] = 1;
              di.field_e[1] = 5;
            }
          } else {
            var3_int = rf.a(dd.field_e, bo.field_e, field_j, 99, ff.a(new String[]{"<br><%0><br>"}, 0, fi.field_c));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(dd.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            fd.field_k = new String[var4];
            dk.a(dd.field_e, 0, fd.field_k, 0, var4);
            ib.field_c = new String[-1 - var4 + var3_int];
            dk.a(dd.field_e, var4 + 1, ib.field_c, 0, -1 + var3_int - var4);
            var3_int = rf.a(dd.field_e, bo.field_e, field_j, 122, ff.a(new String[]{"<br><%0><br>"}, 0, k.field_f));
            var4 = -1;
            for (var5 = 0; var3_int > var5; var5++) {
              if (!"<%0>".equals(dd.field_e[var5])) {
                continue;
              }
              var4 = var5;
              break;
            }
            if (var4 == -1) {
              throw new IllegalStateException();
            }
            qh.field_b = new String[var4];
            dk.a(dd.field_e, 0, qh.field_b, 0, var4);
            me.field_a = new String[var3_int - var4 - 1];
            dk.a(dd.field_e, 1 + var4, me.field_a, 0, -1 + var3_int - var4);
            if (fd.field_k.length < qh.field_b.length) {
              stackIn_30_0 = qh.field_b.length;
            } else {
              stackIn_30_0 = fd.field_k.length;
            }
            var5 = stackIn_30_0;
            if (ib.field_c.length >= me.field_a.length) {
              stackIn_33_0 = ib.field_c.length;
            } else {
              stackIn_33_0 = me.field_a.length;
            }
            var6 = stackIn_33_0;
            var7 = var5 + (7 + var6);
            mn.field_Z = new int[var7];
            wh.field_z = new String[var7];
            for (var8 = 0; var8 < var7; var8++) {
              mn.field_Z[var8] = -1;
            }
            di.field_e = new int[2];
            wh.field_z[1] = tn.field_m;
            wh.field_z[0] = vb.field_b;
            mn.field_Z[1] = 0;
            di.field_e[1] = 2;
            di.field_e[0] = 5;
            wh.field_z[5] = "";
            wh.field_z[2] = gn.field_f;
            mn.field_Z[3] = 1;
            wh.field_z[3] = fo.field_E;
            wh.field_z[4] = gp.field_Q;
            for (var8Lifetime2 = 0; var5 > var8Lifetime2; var8Lifetime2++) {
              stackIn_40_0 = wh.field_z;
              stackIn_40_1 = 6 + var8Lifetime2;
              if (-var5 + (var8Lifetime2 + qh.field_b.length) >= 0) {
                stackIn_41_2 = qh.field_b[-var5 + (qh.field_b.length + var8Lifetime2)];
              } else {
                stackIn_41_2 = "";
              }
              stackIn_40_0[stackIn_40_1] = stackIn_41_2;
            }
            wh.field_z[6 + var5] = null;
            mn.field_Z[var5 + 6] = -2;
            for (var8Lifetime3 = 0; var6 > var8Lifetime3; var8Lifetime3++) {
              stackIn_46_0 = wh.field_z;
              stackIn_46_1 = 7 + var5 + var8Lifetime3;
              if (var8Lifetime3 < me.field_a.length) {
                stackIn_47_2 = me.field_a[var8Lifetime3];
              } else {
                stackIn_47_2 = "";
              }
              stackIn_46_0[stackIn_46_1] = stackIn_47_2;
            }
            dc.field_c = km.b(-1);
          }
          kb.field_g.field_i = di.field_e.length;
          var3_intLifetime1 = 0;
          for (var4Lifetime1 = 0; wh.field_z.length > var4Lifetime1; var4Lifetime1++) {
            stackIn_89_0 = !(0 > mn.field_Z[var4Lifetime1]);
            var5Lifetime1 = mh.a(stackIn_89_0, -125, wh.field_z[var4Lifetime1]);
            if (var3_intLifetime1 < var5Lifetime1) {
              var3_intLifetime1 = var5Lifetime1;
            }
          }
          if (param2 >= -31) {
            ka.a(true, '+');
          }
          if (2 == go.field_x) {
            var10 = fd.field_k;
            var4_ref_String__ = var10;
            for (var5Lifetime2 = 0; var10.length > var5Lifetime2; var5Lifetime2++) {
              var11 = var10[var5Lifetime2];
              var7Lifetime1 = mh.a(false, -122, var11);
              if (var3_intLifetime1 < var7Lifetime1) {
                var3_intLifetime1 = var7Lifetime1;
              }
            }
            var4_ref_String__Lifetime1 = ib.field_c;
            for (var5Lifetime2Lifetime1 = 0; var4_ref_String__Lifetime1.length > var5Lifetime2Lifetime1; var5Lifetime2Lifetime1++) {
              var12 = var4_ref_String__Lifetime1[var5Lifetime2Lifetime1];
              var7Lifetime1Lifetime1 = mh.a(false, -86, var12);
              if (var3_intLifetime1 < var7Lifetime1Lifetime1) {
                var3_intLifetime1 = var7Lifetime1Lifetime1;
              }
            }
          }
          bh.field_b = vk.field_A + var3_intLifetime1 - (var3_intLifetime1 >> 1);
          v.field_a = -(var3_intLifetime1 >> 1) + vk.field_A;
          ii.field_k = (hn.field_z + ln.field_D << 1) * kb.field_g.field_i;
          for (var4Lifetime2 = 0; wh.field_z.length > var4Lifetime2; var4Lifetime2++) {
            stackIn_116_0 = ii.field_k;
            if (0 <= mn.field_Z[var4Lifetime2]) {
              stackIn_117_1 = kp.field_d;
            } else {
              stackIn_117_1 = bp.field_e;
            }
            ii.field_k = stackIn_116_0 + stackIn_117_1;
          }
          a.field_d = jo.field_b - (ii.field_k >> 1);
          kb.field_e = new int[wh.field_z.length][];
          var4Lifetime3 = 0;
          var5Lifetime3 = a.field_d;
          while (wh.field_z.length > var4Lifetime3) {
            var6Lifetime1 = mn.field_Z[var4Lifetime3];
            if (var6Lifetime1 < 0) {
              var5Lifetime3 = var5Lifetime3 + bp.field_e;
            } else {
              var7Lifetime2 = mh.a(true, -119, wh.field_z[var4Lifetime3]);
              var5Lifetime3 = var5Lifetime3 + hn.field_z;
              var8Lifetime1 = vk.field_A - (var7Lifetime2 >> 1);
              kb.field_e[var4Lifetime3] = new int[4];
              kb.field_e[var4Lifetime3][0] = -aq.field_b + var8Lifetime1;
              kb.field_e[var4Lifetime3][1] = var5Lifetime3;
              kb.field_e[var4Lifetime3][2] = var7Lifetime2 + (aq.field_b << 1);
              kb.field_e[var4Lifetime3][3] = (ln.field_D << 1) + kp.field_d;
              var5Lifetime3 = var5Lifetime3 + (hn.field_z + ((ln.field_D << 1) + kp.field_d));
            }
            var4Lifetime3++;
          }
          if (go.field_x != 2) {
            kb.field_g.a(qd.a(16452, n.field_t, k.field_e), (byte) 52, param1, 0);
          } else {
            kb.field_g.a(-1, (byte) 123, param1, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3), "ka.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static byte a(boolean param0, char param1) {
        int var2;
        int var3;
        {
          var3 = Torquing.field_u;
          if ((param1 <= 0 ||
            param1 >= 128) && (param1 < 160 ||
            255 < param1)) {
            if (8364 == param1) {
              var2 = -128;
            } else if (param1 == 8218) {
              var2 = -126;
            } else if (param1 == 402) {
              var2 = -125;
            } else if (8222 == param1) {
              var2 = -124;
            } else if (8230 == param1) {
              var2 = -123;
            } else if (param1 == 8224) {
              var2 = -122;
            } else if (param1 == 8225) {
              var2 = -121;
            } else if (710 == param1) {
              var2 = -120;
            } else if (param1 == 8240) {
              var2 = -119;
            } else if (param1 == 352) {
              var2 = -118;
            } else if (param1 == 8249) {
              var2 = -117;
            } else if (338 == param1) {
              var2 = -116;
            } else if (param1 == 381) {
              var2 = -114;
            } else if (param1 == 8216) {
              var2 = -111;
            } else if (param1 == 8217) {
              var2 = -110;
            } else if (param1 == 8220) {
              var2 = -109;
            } else if (param1 == 8221) {
              var2 = -108;
            } else if (8226 == param1) {
              var2 = -107;
            } else if (param1 == 8211) {
              var2 = -106;
            } else if (param1 == 8212) {
              var2 = -105;
            } else if (param1 == 732) {
              var2 = -104;
            } else if (param1 == 8482) {
              var2 = -103;
            } else if (param1 == 353) {
              var2 = -102;
            } else if (param1 == 8250) {
              var2 = -101;
            } else if (param1 == 339) {
              var2 = -100;
            } else if (param1 == 382) {
              var2 = -98;
            } else if (param1 != 376) {
              var2 = 63;
            } else {
              var2 = -97;
            }
          } else {
            var2 = (byte)param1;
          }
        }
        if (!param0) {
          return (byte) var2;
        }
        return (byte) -87;
    }

    final static bp a(String param0, byte param1) {
        bp stackIn_6_0 = null;
        bp stackIn_10_0 = null;
        bp stackIn_14_0 = null;
        int stackIn_23_0 = 0;
        bp stackIn_28_0 = null;
        bp stackIn_42_0 = null;
        bp stackIn_46_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = Torquing.field_u;
        try {
          if (param1 != -10) {
            field_j = -54;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = oj.field_l;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = wn.field_s;
            return stackIn_10_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_14_0 = va.field_H;
              return stackIn_14_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_23_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_23_0;
              } else {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_28_0 = va.field_H;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (46 == var5Lifetime1) {
              if (0 != var4Lifetime1 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = va.field_H;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (pb.field_g.indexOf(var5Lifetime1) == -1) {
                stackIn_46_0 = va.field_H;
                return stackIn_46_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("ka.B(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, java.awt.Frame param1, vh param2) {
        rc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Torquing.field_u;
        try {
          while (true) {
            var3 = param2.a(false, param1);
            while (0 == var3.field_a) {
              ub.a(1976, 10L);
            }
            if (var3.field_a != 1) {
              ub.a(1976, 100L);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          if (param0 >= -94) {
            field_l = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("ka.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 > -101) {
          String var2 = (String) null;
          ka.a((String) null, (byte) 100);
        }
        od.b(128, 4);
    }

    final static String a(long param0, int param1) {
        ne.field_b.setTime(new Date(param0));
        int var3 = ne.field_b.get(7);
        int var4 = ne.field_b.get(5);
        if (param1 != -2) {
          field_n = (int[][]) null;
        }
        int var5 = ne.field_b.get(2);
        int var6 = ne.field_b.get(1);
        int var7 = ne.field_b.get(11);
        int var8 = ne.field_b.get(12);
        int var9 = ne.field_b.get(13);
        return sb.field_n[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + nh.field_j[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    ka(int param0, int param1) {
        this.field_m = param0;
        this.field_k = param1;
    }

    public static void a(int param0) {
        field_l = null;
        if (param0 < 89) {
          field_n = (int[][]) null;
        }
        field_n = (int[][]) null;
    }

    static {
        field_n = new int[32][5];
        field_l = "You collected <%0> of <%1> powerups";
    }
}
