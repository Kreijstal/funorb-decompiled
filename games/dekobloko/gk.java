/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class gk extends ca implements vn {
    static String field_Db;
    static boolean field_Ib;
    private boolean field_Fb;
    private boolean field_Ab;
    private mm field_Bb;
    private r field_xb;
    static byte[][] field_yb;
    static int[] field_Cb;
    static w field_Hb;
    static String field_Gb;
    private boolean field_Eb;
    private boolean field_zb;

    final void n(int param0) {
        int var2 = 0;
        if (((gk) this).field_S) {
          ((gk) this).field_S = false;
          var2 = 6 % ((-68 - param0) / 51);
          if (!((gk) this).field_Ab) {
            if (!((gk) this).field_Eb) {
              return;
            } else {
              ai.h(-73);
              return;
            }
          } else {
            qf.a(true);
            return;
          }
        } else {
          return;
        }
    }

    final void o(int param0) {
        ((gk) this).field_xb.a(param0, 4088, 2121792);
        dj var2 = new dj((gk) this, ((gk) this).field_Bb, fm.field_a);
        var2.a(mn.field_a, 15, param0 ^ 4210766);
        ((gk) this).c((ce) (Object) var2, (byte) 51);
    }

    final static int c(int param0, int param1, int param2) {
        if (param1 != param2) {
            return fc.field_b[param2];
        }
        if (!ll.a(param0, (byte) -96)) {
            return fc.field_b[param2];
        }
        return 29;
    }

    gk(ka param0, mm param1, String param2, boolean param3, boolean param4) {
        super(param0, (ce) (Object) new dj((gk) null, param1, param2), 77, 10, 10);
        ((gk) this).field_Bb = param1;
        ((gk) this).field_Ab = param3 ? true : false;
        ((gk) this).field_zb = false;
        ((gk) this).field_Fb = false;
        ((gk) this).field_Eb = param4 ? true : false;
        ((gk) this).field_xb = new r(13, 50, 274, 30, 15, 2113632, 4210752);
        ((gk) this).field_xb.field_L = true;
        ((gk) this).b((ce) (Object) ((gk) this).field_xb, (byte) -55);
    }

    final static void a(w param0, boolean param1) {
        w var2 = null;
        int var3 = 0;
        w var4 = null;
        w var5 = null;
        var3 = client.field_A ? 1 : 0;
        var4 = (w) (Object) param0.field_M.c((byte) -76);
        var2 = var4;
        L0: while (true) {
          if (var4 == null) {
            if (!param1) {
              field_yb = null;
              param0.field_Mb = 0;
              param0.field_Ib = 0;
              param0.field_F = 0;
              param0.field_N = 0;
              return;
            } else {
              param0.field_Mb = 0;
              param0.field_Ib = 0;
              param0.field_F = 0;
              param0.field_N = 0;
              return;
            }
          } else {
            var4.field_Ib = 0;
            var4.field_Mb = 0;
            var4.field_F = 0;
            var4.field_N = 0;
            var5 = (w) (Object) param0.field_M.d(true);
            var5 = var5;
            continue L0;
          }
        }
    }

    final void a(byte param0, String param1, int param2) {
        int var5 = 0;
        dj var6 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        dj stackIn_11_0 = null;
        dj stackIn_12_0 = null;
        dj stackIn_13_0 = null;
        String stackIn_13_1 = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        dj stackOut_10_0 = null;
        dj stackOut_12_0 = null;
        String stackOut_12_1 = null;
        dj stackOut_11_0 = null;
        String stackOut_11_1 = null;
        var5 = client.field_A ? 1 : 0;
        if (param0 == 48) {
          if (!((gk) this).field_Fb) {
            L0: {
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (256 != param2) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            ((gk) this).field_zb = stackIn_7_1 != 0;
            ((gk) this).field_Fb = true;
            ((gk) this).field_xb.a(4210752, 4088, 8405024);
            var6 = new dj((gk) this, ((gk) this).field_Bb, param1);
            if (-6 == (param2 ^ -1)) {
              var6.a(pb.field_e, 11, 14);
              var6.a(ig.field_Tb, 17, param0 ^ 62);
              if (3 != param2) {
                if ((param2 ^ -1) != -5) {
                  if (6 != param2) {
                    if (-10 == (param2 ^ -1)) {
                      ek discarded$3 = var6.a(127, pc.field_e, (kg) this);
                      ((gk) this).c((ce) (Object) var6, (byte) 84);
                      return;
                    } else {
                      ((gk) this).c((ce) (Object) var6, (byte) 84);
                      return;
                    }
                  } else {
                    var6.a(vb.field_Y, 9, 14);
                    ((gk) this).c((ce) (Object) var6, (byte) 84);
                    return;
                  }
                } else {
                  var6.a(ai.field_U, 8, 14);
                  ((gk) this).c((ce) (Object) var6, (byte) 84);
                  return;
                }
              } else {
                var6.a(ce.field_z, 7, 14);
                ((gk) this).c((ce) (Object) var6, (byte) 84);
                return;
              }
            } else {
              L1: {
                if (-257 != (param2 ^ -1)) {
                  L2: {
                    stackOut_10_0 = (dj) var6;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (!((gk) this).field_Ab) {
                      stackOut_12_0 = (dj) (Object) stackIn_12_0;
                      stackOut_12_1 = bl.field_X;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L2;
                    } else {
                      stackOut_11_0 = (dj) (Object) stackIn_11_0;
                      stackOut_11_1 = sh.field_c;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      break L2;
                    }
                  }
                  ((dj) (Object) stackIn_13_0).a(stackIn_13_1, -1, 14);
                  break L1;
                } else {
                  ek discarded$4 = var6.a(116, sh.field_c, (kg) this);
                  break L1;
                }
              }
              if (3 != param2) {
                if ((param2 ^ -1) != -5) {
                  if (6 != param2) {
                    if (-10 == (param2 ^ -1)) {
                      ek discarded$5 = var6.a(127, pc.field_e, (kg) this);
                      ((gk) this).c((ce) (Object) var6, (byte) 84);
                      return;
                    } else {
                      ((gk) this).c((ce) (Object) var6, (byte) 84);
                      return;
                    }
                  } else {
                    var6.a(vb.field_Y, 9, 14);
                    ((gk) this).c((ce) (Object) var6, (byte) 84);
                    return;
                  }
                } else {
                  var6.a(ai.field_U, 8, 14);
                  ((gk) this).c((ce) (Object) var6, (byte) 84);
                  return;
                }
              } else {
                var6.a(ce.field_z, 7, 14);
                ((gk) this).c((ce) (Object) var6, (byte) 84);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(int param0, int param1, byte param2, cc param3) {
        int var4 = -111 % ((param2 - 41) / 38);
    }

    final boolean a(int param0, int param1, ce param2, char param3) {
        if (!(param1 != 13)) {
            ((gk) this).n(63);
            return true;
        }
        int var5 = -15 / ((param0 - -22) / 49);
        return super.a(123, param1, param2, param3);
    }

    public void a(byte param0, int param1, ek param2, int param3, int param4) {
        if (param0 == 67) {
          if (((gk) this).field_zb) {
            hm.a(3, (byte) -124);
            ((gk) this).n(-9);
            return;
          } else {
            aj.a("tochangedisplayname.ws", param0 ^ -79, se.h(param0 ^ 25211));
            return;
          }
        } else {
          ((gk) this).field_Eb = true;
          if (((gk) this).field_zb) {
            hm.a(3, (byte) -124);
            ((gk) this).n(-9);
            return;
          } else {
            aj.a("tochangedisplayname.ws", param0 ^ -79, se.h(param0 ^ 25211));
            return;
          }
        }
    }

    public static void p(int param0) {
        field_Gb = null;
        field_yb = null;
        int var1 = 107 % ((-66 - param0) / 34);
        field_Db = null;
        field_Cb = null;
        field_Hb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Db = "Options";
        field_yb = new byte[50][];
        field_Cb = new int[4];
        field_Gb = "Quick Chat Help";
    }
}
