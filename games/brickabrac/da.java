/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends hb {
    static byte[][] field_L;
    wq field_D;
    static int field_G;
    static jp[] field_E;
    static int[] field_C;
    static int[] field_M;
    int field_K;
    byte field_F;
    static String field_H;
    static String field_J;

    final byte[] c(byte param0) {
        int var2 = -99 % ((4 - param0) / 52);
        if (this.field_u) {
          throw new RuntimeException();
        }
        if (this.field_D.field_l >= this.field_D.field_k.length - this.field_F) {
          return this.field_D.field_k;
        }
        throw new RuntimeException();
    }

    final static void f(byte param0) {
        if (!pe.field_o.c(95)) {
          vg.a(o.field_e.e((byte) 31), false, 11);
          ed.field_d = true;
          if (param0 != 122) {
            field_E = (jp[]) null;
            return;
          }
          return;
        }
        dn.b(0, -108, 11);
        if (param0 != 122) {
          field_E = (jp[]) null;
          return;
        }
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
          String var3 = null;
          String var4 = null;
          String var5 = null;
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            sk.field_G = param0;
            try {
              var3 = param2.getParameter("cookieprefix");
              var4 = param2.getParameter("cookiehost");
              if (param1 <= 44) {
                return;
              }
              var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
              if (param0.length() == 0) {
                var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              ne.a(param2, "document.cookie=\"" + var5 + "\"", 5797);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            td.a(false, param2);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("da.A(");
            if (param0 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        field_M = null;
        field_J = null;
        field_C = null;
        int var1 = -85 / ((4 - param0) / 55);
        field_H = null;
        field_E = null;
        field_L = (byte[][]) null;
    }

    final static String d(byte param0) {
        if (!(2 <= qg.field_A)) {
          return kd.field_c;
        }
        if (null != wl.field_K) {
          if (!wl.field_K.a((byte) -127)) {
            return wn.field_a;
          }
          return d.field_C;
        }
        if (param0 != 103) {
          return (String) null;
        }
        if (!ma.field_P.a((byte) -127)) {
          return tm.field_e;
        }
        if (!ma.field_P.a("commonui", -28138)) {
          return ib.field_F + " - " + ma.field_P.b(0, "commonui") + "%";
        }
        if (!vh.field_S.a((byte) -127)) {
          return vh.field_P;
        }
        if (!vh.field_S.a("commonui", -28138)) {
          return m.field_k + " - " + vh.field_S.b(0, "commonui") + "%";
        }
        if (!ja.field_c.a((byte) -127)) {
          return hp.field_k;
        }
        if (!ja.field_c.a(param0 ^ 12)) {
          return qm.field_e + " - " + ja.field_c.b(-4126) + "%";
        }
        return kd.field_a;
    }

    da() {
    }

    final int f(int param0) {
        if (param0 != -21546) {
          this.c((byte) 12);
          if (null == this.field_D) {
            return 0;
          }
          return this.field_D.field_l * 100 / (-this.field_F + this.field_D.field_k.length);
        }
        if (null == this.field_D) {
          return 0;
        }
        return this.field_D.field_l * 100 / (-this.field_F + this.field_D.field_k.length);
    }

    static {
        field_L = new byte[250][];
        field_M = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
