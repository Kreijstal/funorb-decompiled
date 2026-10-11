/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class op {
    static nn field_d;
    static String field_a;
    static String field_b;
    static int[] field_c;

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != sp.field_c && (param1 < 0 ||
            pd.field_A == qa.field_c)) {
            if (param0 == ac.field_B.field_o &&
              kd.c(-2456) > 10000L + wh.field_e) {
              ac.field_B.d((byte) -91, param1);
            }
            if (0 < ac.field_B.field_o) {
              try {
                sp.field_c.b(ac.field_B.field_m, false, 0, ac.field_B.field_o);
                wh.field_e = kd.c(-2456);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                tl.a(117);
              }
              ac.field_B.field_o = 0;
            }
            return;
          }
          ac.field_B.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(cd param0, int param1, int param2, cd param3, String param4, int param5, boolean param6) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        ec stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        String stackIn_13_2 = null;
        ec stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_16_2 = null;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        String var11_ref_StringLifetime1;
        String var11_ref_StringLifetime2;
        String var11_ref_StringLifetime3;
        String var11_ref_StringLifetime4;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var13 = DungeonAssault.field_K;
        try {
          if (param5 > -47) {
            op.a(3, -113);
          }
          var14 = param0.b(-1);
          var11_ref_String = var14;
          var11_ref_StringLifetime1 = var14;
          var8 = param3.b(-1);
          var11_ref_StringLifetime2 = var8;
          var11_ref_StringLifetime3 = var8;
          if (null == sp.field_c &&
            !rj.a((byte) 83, false)) {
            stackIn_7_0 = -1;
            return stackIn_7_0;
          }
          if (no.field_c == pd.field_A) {
            fj.field_e = null;
            ac.field_B.field_o = 0;
            if (param4 != null) {
              var9 = 0;
              if (param6) {
                var9 = var9 | 1;
              }
              ta.field_c.field_o = 0;
              ta.field_c.a((byte) 63, bl.field_i.nextInt());
              ta.field_c.a((byte) 63, bl.field_i.nextInt());
              ta.field_c.a(2, var14);
              ta.field_c.a(2, var8);
              var15 = (CharSequence) ((Object) param4);
              ta.field_c.a(2, qf.a(var15, -1));
              ta.field_c.i(param1, -86);
              ta.field_c.a(6, param2);
              ta.field_c.a(6, var9);
              ac.field_B.a(6, 18);
              ac.field_B.field_o = ac.field_B.field_o + 2;
              var10 = ac.field_B.field_o;
              var11_ref_StringLifetime4 = oj.a(m.c(true), (byte) -21);
              if (var11_ref_StringLifetime4 == null) {
                var11_ref_StringLifetime4 = "";
              }
              ac.field_B.b(var11_ref_StringLifetime4, (byte) -20);
              of.a(ac.field_B, kd.field_d, om.field_c, (byte) -120, ta.field_c);
              ac.field_B.b(-var10 + ac.field_B.field_o, 1);
            } else {
              ta.field_c.field_o = 0;
              ta.field_c.a((byte) 63, bl.field_i.nextInt());
              ta.field_c.a((byte) 63, bl.field_i.nextInt());
              stackIn_12_0 = ta.field_c;
              stackIn_12_1 = 2;
              if (!param0.a((byte) -102)) {
                stackIn_13_2 = "";
              } else {
                stackIn_13_2 = var14;
              }
              ((ec) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2);
              stackIn_15_0 = ta.field_c;
              stackIn_15_1 = 2;
              if (param3.a((byte) 123)) {
                stackIn_16_2 = var8;
              } else {
                stackIn_16_2 = "";
              }
              ((ec) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
              ac.field_B.a(6, 16);
              ac.field_B.field_o = ac.field_B.field_o + 1;
              var9 = ac.field_B.field_o;
              of.a(ac.field_B, kd.field_d, om.field_c, (byte) -116, ta.field_c);
              ac.field_B.c(ac.field_B.field_o - var9, -1);
            }
            op.a(0, -1);
            pd.field_A = kp.field_b;
          }
          if (pd.field_A == kp.field_b &&
            oi.a(-12929, 1)) {
            var9Lifetime1 = ra.field_c.c(true);
            ra.field_c.field_o = 0;
            if (var9Lifetime1 >= 100 &&
              105 >= var9Lifetime1) {
              pd.field_A = jg.field_a;
              mf.field_c = new String[-100 + var9Lifetime1];
            } else {
              if (248 == var9Lifetime1) {
                np.a((byte) -126, m.c(true));
                tp.field_v = m.field_f;
                tl.a(-84);
                nh.field_e = false;
                stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (99 == var9Lifetime1) {
                oi.a(-12929, la.a(23940));
                fj.field_e = new Boolean(fm.a(ra.field_c, -127));
                ra.field_c.field_o = 0;
              } else {
                nj.field_b = -1;
                hc.field_c = var9Lifetime1;
                pd.field_A = sd.field_G;
              }
            }
          }
          if (pd.field_A == jg.field_a) {
            var9Lifetime2 = 2;
            if (oi.a(-12929, var9Lifetime2)) {
              var10Lifetime1 = ra.field_c.k(0);
              ra.field_c.field_o = 0;
              if (oi.a(-12929, var10Lifetime1)) {
                var11 = mf.field_c.length;
                for (var12 = 0; var11 > var12; var12++) {
                  mf.field_c[var12] = ra.field_c.a(-21030);
                }
                tl.a(-60);
                nh.field_e = false;
                stackIn_45_0 = var11 + 100;
                return stackIn_45_0;
              }
            }
          }
          if (pd.field_A == sd.field_G &&
            kh.d((byte) -75)) {
            if (hc.field_c != 255) {
              tp.field_v = ra.field_c.d(-101);
            } else {
              var9_ref_String = ra.field_c.b(true);
              if (var9_ref_String != null) {
                jb.a(true, var9_ref_String, m.c(true));
              }
            }
            tl.a(-59);
            nh.field_e = false;
            stackIn_54_0 = hc.field_c;
            return stackIn_54_0;
          }
          if (null == sp.field_c) {
            if (nh.field_e) {
              if (30000L >= b.a(119)) {
                tp.field_v = fc.field_l;
              } else {
                tp.field_v = lh.field_r;
              }
              nh.field_e = false;
              stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            var9Lifetime3 = an.field_E;
            an.field_E = l.field_b;
            nh.field_e = true;
            l.field_b = var9Lifetime3;
          }
          stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("op.A(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_c = null;
        if (param0 > -8) {
          op.a((byte) -85);
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Dark Elf Assassin";
        field_a = "Orb points: ";
    }
}
