/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends tj implements nq, he {
    static String field_G;
    static int field_K;
    static mq field_I;
    private hv field_F;
    private oe field_H;
    private fw field_M;
    static String field_L;
    static String field_J;

    public static void k(int param0) {
        field_L = null;
        field_G = null;
        field_I = null;
        if (param0 != -15) {
            qd.k(71);
            field_J = null;
            return;
        }
        field_J = null;
    }

    private final String a(byte param0) {
        if (param0 != -117) {
            ((qd) this).field_M = null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, int param1, byte param2, hv param3) {
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (-1 != (param0 ^ -1)) {
          if ((param0 ^ -1) == -2) {
            ak.a("privacy.ws", (byte) -77);
            if (param2 <= 102) {
              ((qd) this).field_F = null;
              return;
            } else {
              return;
            }
          } else {
            if ((param0 ^ -1) != -3) {
              if (param2 <= 102) {
                ((qd) this).field_F = null;
                return;
              } else {
                return;
              }
            } else {
              ak.a("conduct.ws", (byte) -117);
              if (param2 > 102) {
                return;
              } else {
                ((qd) this).field_F = null;
                return;
              }
            }
          }
        } else {
          ak.a("terms.ws", (byte) -98);
          if (param2 > 102) {
            return;
          } else {
            ((qd) this).field_F = null;
            return;
          }
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        Object var4 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (ab.a(param0, 0)) {
          return false;
        } else {
          if (ph.a(param0, (byte) 123)) {
            return false;
          } else {
            if (!pd.a(param0, 0)) {
              if (-1 == (param1.length() ^ -1)) {
                return true;
              } else {
                if (!rb.a(param1, param0, 113)) {
                  if (e.a(86, param1, param0)) {
                    return false;
                  } else {
                    if (param2) {
                      var4 = null;
                      qd.a((kl) null, (byte) 120, (uv) null, -19);
                      if (!ha.a(param0, (byte) -26, param1)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      L0: {
                        if (ha.a(param0, (byte) -26, param1)) {
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          break L0;
                        } else {
                          stackOut_18_0 = 1;
                          stackIn_20_0 = stackOut_18_0;
                          break L0;
                        }
                      }
                      return stackIn_20_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (!this.a(param0, param1, param2, param3)) {
          if (98 == param1) {
            return ((qd) this).a(false, param0);
          } else {
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              return ((qd) this).b((byte) -125, param0);
            }
          }
        } else {
          return true;
        }
    }

    final static void a(kl param0, byte param1, uv param2, int param3) {
        Object var5 = null;
        fw.field_C = tp.b(-74) * param3 / 1000;
        ui.a((byte) -124, param0);
        jj.a(-93, param0);
        lg.a(32381, param0);
        gs.a(54);
        ng.b(true);
        if (param1 <= 70) {
          var5 = null;
          boolean discarded$2 = qd.a((String) null, (String) null, true);
          ib.field_j = 0 - fw.field_C;
          return;
        } else {
          ib.field_j = 0 - fw.field_C;
          return;
        }
    }

    qd(oe param0) {
        super(0, 0, 288, 0, (kh) null);
        ((qd) this).field_H = param0;
        ((qd) this).field_M = new fw(ro.field_kb, (qo) null);
        ((qd) this).field_M.field_k = (kh) (Object) new nu();
        String var7 = fo.a(4800, ih.field_R, new String[2]);
        int var3 = 20;
        lk var4 = new lk(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        ((qd) this).field_F = new hv(var7, (kh) (Object) var4);
        ((qd) this).field_F.field_s = "";
        ((qd) this).field_F.a(nh.field_I, false, 0);
        ((qd) this).field_F.a(nh.field_I, false, 1);
        ((qd) this).field_F.field_l = -40 + ((qd) this).field_l;
        ((qd) this).field_F.field_x = (qo) this;
        ((qd) this).field_F.a(((qd) this).field_l + -40, 9567, 26, var3);
        var3 = var3 + (((qd) this).field_F.field_w - -15);
        ((qd) this).a((byte) 10, (kb) (Object) ((qd) this).field_F);
        int var5 = 4;
        int var6 = 200;
        ((qd) this).field_M.a(-var6 + 300 >> -1548355359, var6, var3, 8192, 40);
        ((qd) this).field_M.field_x = (qo) this;
        ((qd) this).a((byte) 10, (kb) (Object) ((qd) this).field_M);
        ((qd) this).a(0, 300, 0, 8192, var5 + var3 + 55);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        if (param1 != 11) {
          L0: {
            field_L = null;
            if (param4 == ((qd) this).field_M) {
              bt.b(0);
              ((qd) this).field_H.b(true);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param4 == ((qd) this).field_M) {
              bt.b(0);
              ((qd) this).field_H.b(true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String a(int param0) {
        if (param0 != -29442) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Off";
    }
}
