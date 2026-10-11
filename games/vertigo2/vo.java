/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vo extends va {
    private int field_z;
    static int field_x;
    static int field_y;
    private int field_t;
    static String[] field_u;
    private int field_B;
    static String field_C;
    static String field_v;
    private er[] field_w;

    final static r a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          uk var8 = null;
          String var9 = null;
          r stackIn_17_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != or.field_f.field_o) {
              ad.field_g = new im(or.field_f.field_o, 5200, 0);
              or.field_f.field_o = null;
              var6 = new qh(255, ad.field_g, new im(or.field_f.field_r, 12000, 0), 2097152);
            }
            if (ad.field_g != null) {
              if (null == rg.field_g) {
                rg.field_g = new im[or.field_f.field_n.length];
              }
              if (null == rg.field_g[param3]) {
                rg.field_g[param3] = new im(or.field_f.field_n[param3], 12000, 0);
                or.field_f.field_n[param3] = null;
              }
              var7 = new qh(param3, ad.field_g, rg.field_g[param3], 2097152);
            }
            var8 = pd.field_c.a(18162, (qh) (var6), param0, param3, (qh) (var7));
            if (param4) {
              var8.a((byte) 81);
            }
            if (param1 < 116) {
              var9 = (String) null;
              vo.a((String) null, 52);
            }
            stackIn_17_0 = new r(var8, param5, param2);
            return stackIn_17_0;
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

    public vo() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        if (!param0) {
          return;
        }
        field_C = null;
    }

    final static tp a(String param0, int param1) {
        String var2 = null;
        tp var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_12_0 = null;
        tp stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (se.field_A == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          if (param1 != 0) {
            vo.a(true);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = rc.a(var6, 320);
          if (var2 == null) {
            stackIn_12_0 = null;
            return (tp) (stackIn_12_0);
          }
          var3 = (tp) (se.field_A.a(3661, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_Mb);
            var4 = rc.a(var7, param1 + 320);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (tp) (se.field_A.a(-121));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("vo.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    private vo(int param0, int param1, int param2) {
        this.field_l = sg.field_a;
        this.field_z = param1;
        this.field_w = q.field_z;
        this.field_B = param2;
        this.field_t = param0;
    }

    final static void c(byte param0) {
        int var1;
        int var2;
        var2 = Vertigo2.field_L ? 1 : 0;
        eg.field_t = null;
        if (param0 != 117) {
          return;
        }
        ed.field_t = false;
        if (tk.field_e) {
          df.field_l.m(param0 ^ 2121781);
        } else {
          var1 = rc.field_b;
          if (0 < var1) {
            if (1 != var1) {
              eg.field_t = Vertigo2.a(new String[]{Integer.toString(var1)}, kn.field_a, param0 - 111);
            } else {
              eg.field_t = ll.field_c;
            }
            eg.field_t = oq.a(new CharSequence[]{(CharSequence) ((Object) eg.field_t), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) e.field_j)}, param0 - 31);
          }
          df.field_l.h((byte) 63);
          p.a(-33);
        }
    }

    public final void a(boolean param0, int param1, boolean param2, iq param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param2) {
            return;
          }
          if (!param3.field_p) {
            stackIn_8_0 = (param3.f(110)) ? 1 : 0;
          } else {
            stackIn_8_0 = 1;
          }
          var6_int = stackIn_8_0;
          if (param3 instanceof d) {
            param0 = param0 & ((d) (param3)).field_F;
          }
          if (param0) {
            if (var6_int != 0) {
              stackIn_16_0 = this.field_z;
            } else {
              stackIn_16_0 = this.field_t;
            }
          } else {
            stackIn_16_0 = this.field_B;
          }
          var7 = stackIn_16_0;
          stackIn_19_0 = (param0) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          s.a((byte) 49, this.field_w, (param3.field_s - this.field_w[0].field_B >> 1) + param4 + param3.field_t, param3.field_n, param3.field_o + param1, var7);
          this.field_l.a(param3.field_w, param1 + param3.field_o, -2 + (param4 + param3.field_t), param3.field_n, param3.field_s, var8, -1, 1, 1, this.field_l.field_z);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("vo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_v = "Options";
        field_C = "Spectate";
    }
}
