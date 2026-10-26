/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends IntrusiveNode {
    private float field_f;
    private int field_i;
    private int field_j;
    private int field_h;
    private int field_g;
    private int field_e;

    final static Object a(boolean param0, int param1, byte[] param2) {
        ku var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ku stackIn_5_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          if (~param2.length < param1) {
            var3 = new ku();
            ((af) ((Object) var3)).a((byte) 56, param2);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param0) {
            stackIn_10_0 = fg.a(param2, (byte) 121);
            return stackIn_10_0;
          }
          stackIn_8_0 = (byte[]) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("sf.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 <= 53) {
          this.a(true);
          return this.field_g;
        }
        return this.field_g;
    }

    final static ej[] d(byte param0) {
        if (param0 >= 52) {
          return new ej[]{gm.field_v, FlightBody.field_c, av.field_a, pg.field_d, qe.field_e, HudMessage.field_g, ej.field_b, kb.field_C, op.field_b, qd.field_n, rc.field_e, NetworkGameClient.field_H, lc.field_b, ml.field_j};
        }
        return (ej[]) null;
    }

    final int c(byte param0) {
        if (param0 >= -73) {
          return 71;
        }
        return this.field_i;
    }

    final static void a(byte param0, java.applet.Applet param1, String param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          gt.field_r = param2;
          try {
            var6 = param1.getParameter("cookieprefix");
            var5 = var6;
            var5Lifetime1 = var6;
            var4 = param1.getParameter("cookiehost");
            var5Lifetime2 = var4;
            var5Lifetime3 = var4;
            var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
            var5Lifetime4 = var7;
            var5Lifetime5 = var7;
            if (param2.length() == 0) {
              var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
              var5Lifetime6 = var7 + "; Expires=" + bt.a(false, 94608000000L + kh.a(-125)) + "; Max-Age=" + 94608000L;
            }
            fe.a(param1, -7012, "document.cookie=\"" + var5Lifetime6 + "\"");
          } catch (Throwable throwable) {
          }
          if (param0 > -110) {
            return;
          }
          try {
            v.a(true, param1);
          } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "sf.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int e(int param0) {
        if (param0 != 0) {
          return 32;
        }
        return this.field_j;
    }

    final int d(int param0) {
        if (param0 != 0) {
          this.field_i = 76;
          return this.field_e;
        }
        return this.field_e;
    }

    final int a(byte param0) {
        int var2 = 104 % ((70 - param0) / 34);
        return this.field_h;
    }

    final float a(boolean param0) {
        if (param0) {
          return -0.44879353046417236f;
        }
        return this.field_f;
    }

    private sf() throws Throwable {
        throw new Error();
    }

    static {
    }
}
