/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class in {
    static Random field_b;
    static String field_a;
    static String field_e;
    static String field_d;
    static String field_f;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_d = null;
        if (param0 != 0) {
          field_f = (String) null;
        }
    }

    final static String a(byte param0) {
        if (param0 != 86) {
          return (String) null;
        }
        if (un.field_Hb == bf.field_b) {
          return af.field_H;
        }
        return fi.field_e;
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, int param5, int param6, int param7, byte param8, boolean param9) {
        int var11;
        var11 = Vertigo2.field_L ? 1 : 0;
        if (!param9 && (qg.field_G != bi.field_e ||
          bi.field_j != om.field_D) && (bi.field_j == ro.field_g.field_d &&
          ro.field_g.field_i == bi.field_e)) {
          if (null != gd.field_j) {
            ho.a(param8 ^ -66, false);
          } else {
            if (sj.field_d != null) {
              ho.a(0, true);
            } else {
              jr.a(-127);
            }
          }
        }
        if (!param9) {
          ml.field_w = (qg.field_G - 640) / 2;
        } else {
          ml.field_w = on.field_c;
        }
        mn.b(param9, -127);
        if (rk.field_y > 0) {
          dg.a(0, param5, param9, param3);
        }
        if (param8 != -66) {
          in.a((byte) -46, -104);
        }
        kk.field_f.field_R = pn.field_N.field_R;
        kk.field_f.field_O = 1;
        if (ko.field_P > 0) {
          an.a(param9, -86, param3, param5);
        }
        if (mp.field_b > 0) {
          gj.a(param0, param5, param9, param8 ^ -66, param3);
        }
        if (im.field_g &&
          gd.field_j.field_Qb >= gd.field_j.field_uc) {
          im.field_j.field_lb = false;
          ja.field_f.field_Lb.field_S = fg.field_db;
          tg.a(0, ja.field_f.field_Nb);
        } else {
          im.field_j.field_lb = true;
          ja.field_f.field_Lb.field_S = null;
          dg.a((byte) -86, ja.field_f, param1, param6, param5);
        }
        uo.a(param7, param2, param5, param1, param4, param6, 0);
        dg.a((byte) -121, vd.field_d, param1, param6, param5);
        lo.field_d = lo.field_d + 1;
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        ub var5 = null;
        be var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          var5 = (ub) (ob.field_Q.a((byte) 100));
          while (var5 != null) {
            he.a(param1, var5, -27011);
            var5 = (ub) (ob.field_Q.b(113));
          }
          var3 = 52 % ((-5 - param0) / 37);
          var6 = (be) (mb.field_v.a((byte) 100));
          while (var6 != null) {
            ec.a(param1, (byte) 122, var6);
            var6 = (be) (mb.field_v.b(45));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "in.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(tn param0, int param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 != 640) {
            field_b = (Random) null;
          }
          for (var2_int = 0; var2_int < 3; var2_int++) {
            wq.field_I[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; no.field_d > var2_intLifetime1; var2_intLifetime1++) {
            if (param0.field_s == eo.field_l[var2_intLifetime1].field_s) {
              dupTemp$3 = eo.field_l[var2_intLifetime1].a((byte) -128);
              wq.field_I[dupTemp$3] = wq.field_I[dupTemp$3] + 1;
            }
          }
          dupTemp$0 = param0.a((byte) 110);
          wq.field_I[dupTemp$0] = wq.field_I[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; no.field_d > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (eo.field_l[var3].field_s == param0.field_s) {
              var4 = eo.field_l[var3].a((byte) 77);
              if (wq.field_I[var4] > ll.field_b) {
                wq.field_I[var4] = wq.field_I[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              eo.field_l[incrementValue$2] = eo.field_l[var3];
            }
          }
          no.field_d = var2_intLifetime2;
          fieldTemp$1 = no.field_d;
          no.field_d = no.field_d + 1;
          eo.field_l[fieldTemp$1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("in.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_d = (String) null;
          }
          stackIn_3_0 = mj.a(-106, param1, 0, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("in.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        qn var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          var4 = (qn) (te.field_z.a((byte) 100));
          while (var4 != null) {
            pn.a(param1, (byte) -4, var4);
            var4 = (qn) (te.field_z.b(42));
          }
          if (param0 >= -97) {
            field_a = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "in.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_b = new Random();
        field_a = "Restart Level";
        field_d = "The '<%0>' setting needs to be changed.";
        field_f = "Allow spectators?";
        field_e = "No spectators";
    }
}
