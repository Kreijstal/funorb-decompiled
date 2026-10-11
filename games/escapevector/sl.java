/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sl {
    static String[] field_c;
    static uf field_d;
    static long field_a;
    static ed[][] field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 == 127) {
          field_b = (ed[][]) null;
          field_d = null;
          return;
        }
        sl.a((mf) null, (mf) null, (int[]) null, (byte[][][]) null, -11, 8);
        field_b = (ed[][]) null;
        field_d = null;
    }

    final static byte[][][] a(mf param0, mf param1, int[] param2, byte[][][] param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        byte[][] var12 = null;
        byte[][][] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = EscapeVector.field_A;
        try {
          var6_int = dh.field_e.length;
          if (param3 == null) {
            param3 = new byte[var6_int][][];
          }
          var7 = param5;
          while (var7 < var6_int) {
            var8 = dh.field_e[var7];
            if ((param4 == var8 ||
              var10 != 0) && (param3[var7] == null ||
              var10 != 0)) {
              var12 = ol.a(-51, param1, param2, var7, param0);
              param3[var7] = var12;
            }
            var7++;
            if (var10 == 0) {
              continue;
            }
            break;
          }
          stackIn_14_0 = (byte[][][]) (param3);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_17_0 = var6;
          stackIn_17_1 = new StringBuilder().append("sl.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static gi a(boolean param0, int param1) {
        boolean stackIn_3_0 = false;
        int stackIn_11_0 = 0;
        int[] stackIn_26_0 = null;
        Throwable decompiledCaughtException = null;
        c var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        si var8 = null;
        var7 = EscapeVector.field_A;
        var2 = om.field_g;
        var3 = var2.e(0);
        fl.field_o = var3 & 127;
        stackIn_3_0 = (0 != (128 & var3));
        rm.field_c = stackIn_3_0;
        ve.field_g = var2.e(0);
        ah.field_e = var2.i(-800509813);
        if (fl.field_o != 2) {
          im.field_a = 0;
          jn.field_d = 0;
        } else {
          jn.field_d = var2.f(1952);
          im.field_a = var2.d((byte) -119);
          if (var7 != 0) {
            im.field_a = 0;
            jn.field_d = 0;
          }
        }
        stackIn_11_0 = (var2.e(param1 ^ param1) != 1) ? 0 : 1;
        var4 = stackIn_11_0;
        gm.field_e = var2.c(false);
        if (var4 != 0) {
          rm.field_g = var2.c(false);
        } else {
          rm.field_g = gm.field_e;
          if (var7 != 0) {
            rm.field_g = var2.c(false);
          }
        }
        if (1 == fl.field_o) {
          var2.f(1952);
          var2.c(false);
        } else {
          if (fl.field_o == 4) {
            var2.f(1952);
            var2.c(false);
          }
        }
        if (!param0) {
          od.field_d = fn.a(var2, 10241, 80);
          bo.field_H = null;
          return new gi(param0);
        }
        var5 = var2.f(1952);
        try {
          var8 = hi.field_s.a(var5, (byte) -126);
          od.field_d = var8.g(-4);
          if (rm.field_g.equals(ck.field_r)) {
            stackIn_26_0 = null;
          } else {
            stackIn_26_0 = var8.field_z;
          }
          bo.field_H = stackIn_26_0;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (Exception) (Object) decompiledCaughtException;
          pf.a(false, "CC1", (Throwable) ((Object) var6));
          bo.field_H = null;
          od.field_d = null;
        }
        if (var7 == 0) {
          return new gi(param0);
        }
        od.field_d = fn.a(var2, 10241, 80);
        bo.field_H = null;
        return new gi(param0);
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          long dupTemp$1 = 0L;
          IOException var2 = null;
          c var4 = null;
          c var5 = null;
          int stackIn_11_0 = 0;
          Throwable decompiledCaughtException = null;
          if (sk.field_d == null) {
            sk.field_d = ca.field_c.a(ej.field_b, 4, cn.field_h);
          }
          if (param1 != 0) {
            field_b = (ed[][]) null;
          }
          if (sk.field_d.field_f == 0) {
            return false;
          }
          dupTemp$1 = td.b(128);
          le.field_c = dupTemp$1;
          field_a = dupTemp$1;
          if (sk.field_d.field_f != 1) {
            al.field_d = ak.field_d;
          } else {
            try {
              pg.field_c = new pj((java.net.Socket) (sk.field_d.field_b), ca.field_c);
              om.field_c.field_m = 0;
              var4 = om.field_g;
              var5 = var4;
              al.field_d = sf.field_d;
              var5.field_m = 0;
              stackIn_11_0 = (!param0) ? -1 : -2;
              g.field_q = stackIn_11_0;
              f.field_t = stackIn_11_0;
              jj.field_b = stackIn_11_0;
              wc.a(rd.field_a, ac.field_b, true, qa.field_D, om.field_c);
              rn.a(-1, 30785);
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = (IOException) (Object) decompiledCaughtException;
              al.field_d = ak.field_d;
              if (EscapeVector.field_A == 0) {
                sk.field_d = null;
                return true;
              }
              al.field_d = ak.field_d;
              sk.field_d = null;
              return true;
            }
          }
          sk.field_d = null;
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_b = new ed[7][4];
    }
}
