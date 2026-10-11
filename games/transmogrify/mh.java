/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static int[] field_b;
    static qj field_e;
    static String field_c;
    static String field_d;
    static qj field_a;

    final static void a(int param0, String param1) {
        try {
          ql.field_a = param1;
          if (param0 != 11207) {
            field_e = (qj) null;
          }
          ba.a(108, 12);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        q var7 = null;
        int var8 = 0;
        q stackIn_3_0 = null;
        q stackIn_7_0 = null;
        q stackIn_10_0 = null;
        q stackIn_15_0 = null;
        q stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = ai.field_a;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = rd.field_d;
            return stackIn_7_0;
          }
          var3 = vi.a((char)param1, param0, 0);
          if (var3.length < 2) {
            stackIn_10_0 = ai.field_a;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              stackIn_18_0 = uf.a(false, var3[var3.length - 1]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = gj.a(param1 - 46, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("mh.B(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, sg param1) {
        int dupTemp$3 = 0;
        int dupTemp$0 = 0;
        int var3 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < 3; var2_int++) {
            ol.field_d[var2_int] = 0;
          }
          for (var2_intLifetime1 = 0; q.field_b > var2_intLifetime1; var2_intLifetime1++) {
            if (~eg.field_a[var2_intLifetime1].field_i == ~param1.field_i) {
              dupTemp$3 = eg.field_a[var2_intLifetime1].a(true);
              ol.field_d[dupTemp$3] = ol.field_d[dupTemp$3] + 1;
            }
          }
          if (param0 != -27968) {
            field_b = (int[]) null;
          }
          dupTemp$0 = param1.a(true);
          ol.field_d[dupTemp$0] = ol.field_d[dupTemp$0] + 1;
          var2_intLifetime2 = 0;
          for (var3 = 0; q.field_b > var3; var3++) {
            boolean decompiledFrameRemainder0 = true;
            if (eg.field_a[var3].field_i == param1.field_i) {
              var4 = eg.field_a[var3].a(true);
              if (ol.field_d[var4] > kh.field_d) {
                ol.field_d[var4] = ol.field_d[var4] - 1;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              incrementValue$2 = var2_intLifetime2;
              var2_intLifetime2++;
              eg.field_a[incrementValue$2] = eg.field_a[var3];
            }
          }
          q.field_b = var2_intLifetime2;
          fieldTemp$1 = q.field_b;
          q.field_b = q.field_b + 1;
          eg.field_a[fieldTemp$1] = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("mh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static String b(int param0) {
        if (!(bi.field_L >= 2)) {
          return vj.field_a;
        }
        if (null != hg.field_a) {
          if (!hg.field_a.a((byte) -118)) {
            return dj.field_c;
          }
          return od.field_h;
        }
        if (!cj.field_c.a((byte) -124)) {
          return vg.field_a;
        }
        if (!cj.field_c.a((byte) 120, "commonui")) {
          return aa.field_f + " - " + cj.field_c.a(0, "commonui") + "%";
        }
        if (param0 <= 75) {
          return (String) null;
        }
        if (!wi.field_e.a((byte) -121)) {
          return dj.field_a;
        }
        if (!wi.field_e.a((byte) 120, "commonui")) {
          return i.field_c + " - " + wi.field_e.a(0, "commonui") + "%";
        }
        if (!nd.field_n.a((byte) -123)) {
          return gk.field_a;
        }
        if (!nd.field_n.c(32031)) {
          return fj.field_b + " - " + nd.field_n.b(-22884) + "%";
        }
        return field_d;
    }

    final static ci a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          be var8 = null;
          ci stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          if (param0 != -26159) {
            return (ci) null;
          }
          try {
            var6 = null;
            if (null != qi.field_a.field_b) {
              kk.field_b = new we(qi.field_a.field_b, 5200, 0);
              qi.field_a.field_b = null;
              var6 = new ak(255, kk.field_b, new we(qi.field_a.field_h, 12000, 0), 2097152);
            }
            var7 = null;
            if (kk.field_b != null) {
              if (null == oa.field_m) {
                oa.field_m = new we[qi.field_a.field_s.length];
              }
              if (oa.field_m[param5] == null) {
                oa.field_m[param5] = new we(qi.field_a.field_s[param5], 12000, 0);
                qi.field_a.field_s[param5] = null;
              }
              var7 = new ak(param5, kk.field_b, oa.field_m[param5], 2097152);
            }
            var8 = we.field_j.a(param5, param3, 24108, (ak) (var6), (ak) (var7));
            if (param1) {
              var8.a(true);
            }
            stackIn_15_0 = new ci(var8, param2, param4);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 != 0) {
          mh.a(1);
        }
    }

    static {
        field_b = new int[1024];
        field_e = new qj();
        field_d = "Please wait...";
        field_a = new qj();
    }
}
