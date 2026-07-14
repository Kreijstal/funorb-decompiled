/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends vf {
    private dm field_Q;
    private int field_P;
    static int[][] field_R;
    private dg field_M;
    static na field_O;
    static rf field_S;
    private String field_N;

    final String c(byte param0) {
        if (param0 == 69) {
            return null;
        }
        return null;
    }

    final static nc a(rh param0, int param1, int param2, rh param3, int param4) {
        int var5 = 0;
        var5 = -107 % ((-62 - param2) / 58);
        if (!mf.a(param4, param1, 116, param3)) {
          return null;
        } else {
          return ni.a(param0.a(param1, -28153, param4), -108);
        }
    }

    final static void c(int param0, int param1) {
        L0: {
          wg.field_a = param0 >> -1651040092 & 3;
          if (-3 > (wg.field_a ^ -1)) {
            wg.field_a = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          qc.field_i = param0 >> 356020514 & 3;
          ad.field_j = 3 & param0;
          if (qc.field_i > 2) {
            qc.field_i = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 == -12718) {
          if (ad.field_j > 2) {
            ad.field_j = 2;
            return;
          } else {
            return;
          }
        } else {
          pi.j(-27);
          if (ad.field_j <= 2) {
            return;
          } else {
            ad.field_j = 2;
            return;
          }
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        ((pi) this).field_P = ((pi) this).field_P + 1;
        super.a(param0, param1, param2, param3);
    }

    final boolean a(byte param0, el param1) {
        if (param0 > -30) {
            ((pi) this).field_P = 97;
            return false;
        }
        return false;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        String var5 = null;
        lh var6 = null;
        cc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        dm var15 = null;
        dm var16 = null;
        dm var17 = null;
        dm var18 = null;
        dm var19 = null;
        L0: {
          L1: {
            var14 = Geoblox.field_C;
            var6 = ((pi) this).field_M.a((byte) -105);
            if (var6 == bf.field_g) {
              break L1;
            } else {
              if (var6 != si.field_n) {
                var5 = ((pi) this).field_M.c(-21666);
                if (var5 == null) {
                  var5 = ((pi) this).field_N;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          var5 = cm.field_h;
          break L0;
        }
        L2: {
          if (var5.equals((Object) (Object) ((pi) this).field_s)) {
            break L2;
          } else {
            ((pi) this).field_s = var5;
            ((pi) this).g(-55);
            break L2;
          }
        }
        super.a(param0, param1, (byte) 106, param3);
        var6 = ((pi) this).field_M.a((byte) -105);
        var8 = (cc) (Object) ((pi) this).field_q;
        var9 = ((pi) this).field_v + param0;
        var10 = var8.a(param1, -2, (el) this) + (var8.a((byte) 125, (el) this).b(-3111) >> -1236998751);
        var11 = 7 % ((param2 - 1) / 43);
        if (bf.field_g == var6) {
          var19 = oa.field_e[0];
          var12 = var19.field_s << -1404171775;
          var13 = var19.field_o << 603574881;
          if (((pi) this).field_Q != null) {
            if (((pi) this).field_Q.field_r >= var12) {
              if (((pi) this).field_Q.field_m < var13) {
                ((pi) this).field_Q = new dm(var12, var13);
                Geoblox.a(1, ((pi) this).field_Q);
                var19.a(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
                id.a(true);
                ((pi) this).field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
                return;
              } else {
                Geoblox.a(1, ((pi) this).field_Q);
                vb.c();
                var19.a(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
                id.a(true);
                ((pi) this).field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
                return;
              }
            } else {
              ((pi) this).field_Q = new dm(var12, var13);
              Geoblox.a(1, ((pi) this).field_Q);
              var19.a(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
              id.a(true);
              ((pi) this).field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
              return;
            }
          } else {
            ((pi) this).field_Q = new dm(var12, var13);
            Geoblox.a(1, ((pi) this).field_Q);
            var19.a(112, 144, var19.field_s << -506922012, var19.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
            id.a(true);
            ((pi) this).field_Q.c(-(var19.field_s >> 408076481) + var9, var10 - var19.field_o, 256);
            return;
          }
        } else {
          if (var6 != si.field_n) {
            if (si.field_m != var6) {
              if (kk.field_w == var6) {
                var16 = oa.field_e[1];
                var16.c(var9, var10 - (var16.field_m >> 2016960417), 256);
                return;
              } else {
                return;
              }
            } else {
              var17 = oa.field_e[2];
              var17.c(var9, var10 - (var17.field_m >> 84361697), 256);
              return;
            }
          } else {
            var18 = oa.field_e[0];
            var15 = var18;
            var12 = var18.field_s << -1404171775;
            var13 = var18.field_o << 603574881;
            if (((pi) this).field_Q != null) {
              if (((pi) this).field_Q.field_r >= var12) {
                if (((pi) this).field_Q.field_m < var13) {
                  ((pi) this).field_Q = new dm(var12, var13);
                  Geoblox.a(1, ((pi) this).field_Q);
                  var18.a(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
                  id.a(true);
                  ((pi) this).field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                  return;
                } else {
                  Geoblox.a(1, ((pi) this).field_Q);
                  vb.c();
                  var18.a(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
                  id.a(true);
                  ((pi) this).field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                  return;
                }
              } else {
                ((pi) this).field_Q = new dm(var12, var13);
                Geoblox.a(1, ((pi) this).field_Q);
                var18.a(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
                id.a(true);
                ((pi) this).field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
                return;
              }
            } else {
              ((pi) this).field_Q = new dm(var12, var13);
              Geoblox.a(1, ((pi) this).field_Q);
              var18.a(112, 144, var18.field_s << -506922012, var18.field_o << -190785340, -((pi) this).field_P << 456857898, 4096);
              id.a(true);
              ((pi) this).field_Q.c(-(var18.field_s >> 408076481) + var9, var10 - var18.field_o, 256);
              return;
            }
          }
        }
    }

    public static void j(int param0) {
        field_R = null;
        field_S = null;
        if (param0 != 24033) {
            field_R = null;
            field_O = null;
            return;
        }
        field_O = null;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
            return;
        }
        kd.field_e.a(0, 0, 0);
    }

    pi(dg param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (dh) (Object) ah.a((byte) -66));
        ((pi) this).field_M = param0;
        ((pi) this).field_N = param1;
        ((pi) this).a(param5, param4, (byte) -77, param3, param2);
    }

    static {
    }
}
