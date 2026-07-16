/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends g implements cl, qh {
    private bg field_K;
    private hl field_F;
    private dg field_D;
    static de field_J;
    static int field_E;
    static de field_H;
    static int field_I;

    public static void e(byte param0) {
        if (param0 != 73) {
            return;
        }
        field_J = null;
        field_H = null;
    }

    final boolean a(char param0, byte param1, int param2, lk param3) {
        if (super.a(param0, (byte) -121, param2, param3)) {
          return true;
        } else {
          if (param2 != 98) {
            if (param1 <= -99) {
              if (99 != param2) {
                return false;
              } else {
                return ((qe) this).a(param3, (byte) -28);
              }
            } else {
              return true;
            }
          } else {
            return ((qe) this).b(-116, param3);
          }
        }
    }

    qe(bg param0) {
        super(0, 0, 288, 0, (ci) null);
        ((qe) this).field_K = param0;
        ((qe) this).field_F = new hl(bj.field_b, (pl) null);
        ((qe) this).field_F.field_v = (ci) (Object) new ki();
        String var7 = re.a(dd.field_h, new String[2], (byte) -50);
        int var3 = 20;
        ek var4 = new ek(j.field_C, 0, 0, 0, 0, 16777215, -1, 3, 0, j.field_C.field_s, -1, 2147483647, true);
        ((qe) this).field_D = new dg(var7, (ci) (Object) var4);
        ((qe) this).field_D.field_n = "";
        ((qe) this).field_D.a(ni.field_b, (byte) 126, 0);
        ((qe) this).field_D.a(ni.field_b, (byte) 98, 1);
        ((qe) this).field_D.field_k = (pl) this;
        ((qe) this).field_D.field_h = -40 + ((qe) this).field_h;
        ((qe) this).field_D.b(96, -40 + ((qe) this).field_h, 26, var3);
        var3 = var3 + (15 + ((qe) this).field_D.field_q);
        ((qe) this).b((lk) (Object) ((qe) this).field_D, (byte) 118);
        int var5 = 4;
        int var6 = 200;
        ((qe) this).field_F.a(40, var3, var6, 300 - var6 >> 1622253025, true);
        ((qe) this).field_F.field_k = (pl) this;
        ((qe) this).b((lk) (Object) ((qe) this).field_F, (byte) 118);
        ((qe) this).a(var5 + (55 + var3), 0, 300, 0, true);
    }

    final static boolean a(java.applet.Applet param0, byte param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            int var4 = 0;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_13_0 = 0;
            var8 = Main.field_T;
            if (!rc.field_m) {
              try {
                L0: {
                  var2 = "tuhstatbut";
                  var4 = 75 / ((-12 - param1) / 46);
                  var3 = (String) vh.a("getcookies", -12151, param0);
                  var5 = rh.a(';', var3, -44);
                  var6 = 0;
                  L1: while (true) {
                    if (var5.length <= var6) {
                      break L0;
                    } else {
                      L2: {
                        var7 = var5[var6].indexOf('=');
                        if (var7 < 0) {
                          break L2;
                        } else {
                          if (var5[var6].substring(0, var7).trim().equals((Object) (Object) var2)) {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0 != 0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var6++;
                      continue L1;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var2_ref = decompiledCaughtException;
                  break L3;
                }
              }
              L4: {
                if (null == param0.getParameter("tuhstatbut")) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              return stackIn_15_0 != 0;
            } else {
              return true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String l(int param0) {
        if (param0 != 1) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, int param2, hl param3, int param4) {
        int var6 = 0;
        var6 = 125 / ((param1 - -62) / 32);
        if (param3 == ((qe) this).field_F) {
          rg.a((byte) 126);
          ((qe) this).field_K.s(50);
          return;
        } else {
          return;
        }
    }

    private final String d(byte param0) {
        if (param0 != -110) {
            return null;
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, byte param2, dg param3) {
        int var6 = 0;
        Object var7 = null;
        var6 = Main.field_T;
        if (param2 == 26) {
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if (param1 == 2) {
                he.a(0, "conduct.ws");
                return;
              } else {
                return;
              }
            } else {
              he.a(param2 ^ 26, "privacy.ws");
              return;
            }
          } else {
            he.a(param2 + -26, "terms.ws");
            return;
          }
        } else {
          var7 = null;
          ((qe) this).a(-56, -104, (byte) -34, (dg) null);
          if (param1 != 0) {
            if ((param1 ^ -1) != -2) {
              if (param1 != 2) {
                return;
              } else {
                he.a(0, "conduct.ws");
                return;
              }
            } else {
              he.a(param2 ^ 26, "privacy.ws");
              return;
            }
          } else {
            he.a(param2 + -26, "terms.ws");
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new de(7, 0, 1, 1);
        field_H = new de(6, 0, 4, 2);
    }
}
