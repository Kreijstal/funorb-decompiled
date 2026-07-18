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
        int var2 = 0;
        var2 = -99 % ((4 - param0) / 52);
        if (!((da) this).field_u) {
          if (((da) this).field_D.field_l < ((da) this).field_D.field_k.length - ((da) this).field_F) {
            throw new RuntimeException();
          } else {
            return ((da) this).field_D.field_k;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void f() {
        if (!pe.field_o.c(95)) {
            vg.a(o.field_e.e((byte) 31), false, 11);
            ed.field_d = true;
            return;
        }
        dn.b(0, -108, 11);
    }

    final static void a(String param0, int param1, java.applet.Applet param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            RuntimeException var3_ref2 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                sk.field_G = param0;
                try {
                  L1: {
                    var3 = param2.getParameter("cookieprefix");
                    var4 = param2.getParameter("cookiehost");
                    if (param1 > 44) {
                      L2: {
                        var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                        if (param0.length() == 0) {
                          var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      int discarded$2 = 5797;
                      ne.a(param2, "document.cookie=\"" + var5 + "\"");
                      break L1;
                    } else {
                      return;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = decompiledCaughtException;
                    break L3;
                  }
                }
                td.a(false, param2);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("da.A(");
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param0 == null) {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "null";
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L4;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L4;
                }
              }
              L5: {
                stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param2 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L5;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  break L5;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e() {
        field_M = null;
        field_J = null;
        field_C = null;
        int var1 = 85;
        field_H = null;
        field_E = null;
        field_L = null;
    }

    final static String d() {
        if (!(2 <= qg.field_A)) {
            return kd.field_c;
        }
        if (!(null == wl.field_K)) {
            if (!(wl.field_K.a((byte) -127))) {
                return wn.field_a;
            }
            return d.field_C;
        }
        if (!(ma.field_P.a((byte) -127))) {
            return tm.field_e;
        }
        if (!ma.field_P.a("commonui", -28138)) {
            return ib.field_F + " - " + ma.field_P.b(0, "commonui") + "%";
        }
        if (!vh.field_S.a((byte) -127)) {
            return vh.field_P;
        }
        if (!(vh.field_S.a("commonui", -28138))) {
            return m.field_k + " - " + vh.field_S.b(0, "commonui") + "%";
        }
        if (!(ja.field_c.a((byte) -127))) {
            return hp.field_k;
        }
        if (!(ja.field_c.a(107))) {
            return qm.field_e + " - " + ja.field_c.b(-4126) + "%";
        }
        return kd.field_a;
    }

    da() {
    }

    final int f(int param0) {
        if (param0 != -21546) {
            byte[] discarded$9 = ((da) this).c((byte) 12);
            if (!(null != ((da) this).field_D)) {
                return 0;
            }
            return ((da) this).field_D.field_l * 100 / (-((da) this).field_F + ((da) this).field_D.field_k.length);
        }
        if (!(null != ((da) this).field_D)) {
            return 0;
        }
        return ((da) this).field_D.field_l * 100 / (-((da) this).field_F + ((da) this).field_D.field_k.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new byte[250][];
        field_M = new int[8192];
        field_H = "Enter multiplayer lobby";
        field_J = "No highscores";
    }
}
