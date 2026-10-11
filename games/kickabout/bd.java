/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd extends qt {
    static boolean field_D;
    static String field_B;
    static vg field_A;

    public static void f(int param0) {
        field_B = null;
        if (param0 >= -25) {
          return;
        }
        field_A = null;
    }

    final void a(byte param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int var3;
        int var4;
        int var4Lifetime1;
        super.a((byte) 117, param1);
        stackIn_3_0 = !(up.a((byte) -3));
        var3 = rp.a(stackIn_3_0, -587);
        if (var3 != 3) {
          if (var3 == 1) {
            jm.a(0, false, -2);
          }
        } else {
          if (null == e.field_m) {
            cq.a(so.a(-98), (byte) 126);
            var4 = 62 / ((38 - param0) / 60);
            return;
          } else {
            fd.h(0);
            cq.a(so.a(-98), (byte) 126);
          }
        }
        if (var3 == 2) {
          jm.a(0, true, -2);
        }
        var4Lifetime1 = 62 / ((38 - param0) / 60);
    }

    final static int a(int param0, boolean param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var3 = param2 >> 16;
        int var4 = param2 & 65535;
        if (!param1) {
          var5 = param0 >> 16;
          var6 = 65535 & param0;
          return (var6 * var4 >> 16) + param0 * var3 + var5 * var4;
        }
        return 87;
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
    }

    bd() {
    }

    final static void e(int param0) {
        int var1;
        int var2;
        var2 = Kickabout.field_G;
        st.field_m = null;
        wq.field_g = false;
        if (param0 != -1) {
          return;
        }
        if (hk.field_G) {
          rk.field_f.r(2121792);
        } else {
          var1 = rl.field_n;
          if (var1 > 0) {
            if (var1 != 1) {
              st.field_m = vo.$cfr$intArgs$a$53ce4ab4c593(-18, tk.field_Lb, new String[]{Integer.toString(var1)});
            } else {
              st.field_m = dq.field_h;
            }
            st.field_m = kr.a(new CharSequence[]{(CharSequence) ((Object) st.field_m), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) he.field_Kb)}, false);
          }
          rk.field_f.q(-105);
          fj.a(param0 ^ 44);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          bu stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          wu var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = Kickabout.field_G;
          try {
            var3 = "";
            if (param1 != null) {
              var3 = le.a(true, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            or.a(var3, param2 ^ 0);
            var7 = aj.a(-1, ":", "%3a", var3);
            var8 = aj.a(param2 ^ -2, "@", "%40", var7);
            var9 = aj.a(-1, "&", "%26", var8);
            var10 = aj.a(-1, "#", "%23", var9);
            if (null == ug.field_a) {
              return;
            }
            stackIn_13_0 = sa.field_a;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = ug.field_a.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(ei.field_e).append("&u=");
            if (null == ds.field_b) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + tn.field_a;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = ds.field_b;
            }
            var4 = ((bu) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(bu.field_u).append("&v2=").append(bu.field_r).append("&e=").append(var10).toString()), (byte) -29);
            while (var4.field_a == 0) {
              aj.a(1L, param2 + 0);
            }
            if (param2 == var4.field_a) {
              var5 = (DataInputStream) (var4.field_b);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_B = "This auction has been bought out! Your bid of <%0> was returned to you.";
    }
}
