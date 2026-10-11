/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mf extends uh {
    int field_C;
    int field_y;
    int field_v;
    int field_w;
    static String field_u;
    static int[] field_x;
    static sd field_A;
    int field_D;
    static int field_F;
    static int[] field_E;
    int field_z;

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    public static void g(int param0) {
        if (param0 < -44) {
          field_x = null;
          field_E = null;
          field_u = null;
          field_A = null;
          return;
        }
        mf.h(-109);
        field_x = null;
        field_E = null;
        field_u = null;
        field_A = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        if (param0 == 5) {
          var6 = this.field_z << 3;
          param4 = (param4 << 4) + (15 & var6);
          var7 = this.field_C << 3;
          param1 = (param1 << 4) + (15 & var7);
          this.a(var6, var7, param4, param1, param3, param2);
          return;
        }
        this.field_z = 65;
        var6Lifetime1 = this.field_z << 3;
        param4 = (param4 << 4) + (15 & var6Lifetime1);
        var7Lifetime1 = this.field_C << 3;
        param1 = (param1 << 4) + (15 & var7Lifetime1);
        this.a(var6Lifetime1, var7Lifetime1, param4, param1, param3, param2);
    }

    final static void h(int param0) {
        int var1;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        cj.field_e = null;
        gm.field_J = 0;
        ul.field_d = 0;
        ck.field_j = new td[3];
        if (param0 == -8372) {
          pa.field_c = -100;
          sd.field_a.a(255, 0);
          sd.field_a.field_N = (double)(-am.field_l);
          sd.field_a.field_D = 190.0;
          sd.field_a.field_q = sd.field_a.field_q + 1;
          sd.field_a.field_j = 0.0;
          sd.field_a.field_c = 0.0;
          if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
            ib.field_t = 0;
          }
          sd.field_a.field_T = 0;
          sd.field_a.field_R = 0;
          var1 = sd.field_a.field_q;
          if (var1 != 0 &&
            var1 != 3 &&
            var1 != 6) {
            r.field_d = 7;
            tc.field_d = -1;
          } else {
            tc.field_d = -1;
            r.field_d = 6;
          }
          sd.field_a.field_X = 0;
          var1 = sd.field_a.field_q;
          switch (var1) {
            case 0:
              sc.a(-1, true, ki.field_c);
              break;
            case 3:
              sc.a(-1, true, hi.field_l);
              break;
            case 4:
              sc.a(-1, true, hi.field_l);
              break;
            default:
              if (7 != var1 &&
                var1 != 8) {
                break;
              }
              sc.a(param0 + 8371, true, le.field_e);
              if (sd.field_a.field_q >= 3) {
                if (oh.a(param0 ^ -8372)) {
                  sd.field_a.d((byte) 69);
                } else {
                  if (0 >= hb.field_g) {
                    sd.field_a.d((byte) 69);
                  }
                }
              }
              if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                ib.field_t = 0;
              }
              if (bi.field_K.length <= sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              }
              qe.field_a = -150;
              sd.field_a.field_J = 0;
              sd.field_a.s(86);
              return;
            case 6:
              sc.a(param0 + 8371, true, le.field_e);
              break;
            case 5:
              sc.a(-1, true, hi.field_l);
              break;
            case 2:
              sc.a(-1, true, ki.field_c);
              break;
            case 1:
              sc.a(-1, true, ki.field_c);
              break;
          }
          boolean decompiledFrameRemainder0 = true;
          if (sd.field_a.field_q >= 3) {
            if (oh.a(param0 ^ -8372)) {
              sd.field_a.d((byte) 69);
              if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                ib.field_t = 0;
              }
              if (bi.field_K.length <= sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 >= hb.field_g) {
                sd.field_a.d((byte) 69);
                if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                  ib.field_t = 0;
                }
                if (bi.field_K.length <= sd.field_a.field_q) {
                  sc.a(param0 ^ 8371, false, ml.field_l);
                  sd.field_a.d((byte) 98);
                } else {
                  sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                }
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
              ib.field_t = 0;
              if (bi.field_K.length <= sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              }
            } else {
              if (bi.field_K.length > sd.field_a.field_q) {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              } else {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
              }
            }
          }
        } else {
          mf.h(85);
          pa.field_c = -100;
          sd.field_a.a(255, 0);
          sd.field_a.field_N = (double)(-am.field_l);
          sd.field_a.field_D = 190.0;
          sd.field_a.field_q = sd.field_a.field_q + 1;
          sd.field_a.field_j = 0.0;
          sd.field_a.field_c = 0.0;
          if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
            ib.field_t = 0;
          }
          sd.field_a.field_T = 0;
          sd.field_a.field_R = 0;
          var1 = sd.field_a.field_q;
          if (var1 != 0 &&
            var1 != 3 &&
            var1 != 6) {
            r.field_d = 7;
            tc.field_d = -1;
          } else {
            tc.field_d = -1;
            r.field_d = 6;
          }
          sd.field_a.field_X = 0;
          var1 = sd.field_a.field_q;
          switch (var1) {
            case 0:
              sc.a(-1, true, ki.field_c);
              break;
            case 3:
              sc.a(-1, true, hi.field_l);
              if (sd.field_a.field_q >= 3) {
                if (oh.a(param0 ^ -8372)) {
                  sd.field_a.d((byte) 69);
                  if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                    ib.field_t = 0;
                  }
                  if (bi.field_K.length <= sd.field_a.field_q) {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                  } else {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                  }
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                }
                if (0 >= hb.field_g) {
                  sd.field_a.d((byte) 69);
                  if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                    ib.field_t = 0;
                  }
                  if (bi.field_K.length <= sd.field_a.field_q) {
                    sc.a(param0 ^ 8371, false, ml.field_l);
                    sd.field_a.d((byte) 98);
                  } else {
                    sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                  }
                  qe.field_a = -150;
                  sd.field_a.field_J = 0;
                  sd.field_a.s(86);
                  return;
                }
              }
              if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                ib.field_t = 0;
                if (bi.field_K.length <= sd.field_a.field_q) {
                  sc.a(param0 ^ 8371, false, ml.field_l);
                  sd.field_a.d((byte) 98);
                } else {
                  sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                }
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              }
              if (bi.field_K.length > sd.field_a.field_q) {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
                qe.field_a = -150;
                sd.field_a.field_J = 0;
                sd.field_a.s(86);
                return;
              }
              sc.a(param0 ^ 8371, false, ml.field_l);
              sd.field_a.d((byte) 98);
              qe.field_a = -150;
              sd.field_a.field_J = 0;
              sd.field_a.s(86);
              return;
            case 4:
              sc.a(-1, true, hi.field_l);
              break;
            default:
              if (7 != var1 &&
                var1 != 8) {
                break;
              }
              sc.a(param0 + 8371, true, le.field_e);
              if (sd.field_a.field_q >= 3) {
                if (oh.a(param0 ^ -8372)) {
                  sd.field_a.d((byte) 69);
                } else {
                  if (0 >= hb.field_g) {
                    sd.field_a.d((byte) 69);
                  }
                }
              }
              if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
                ib.field_t = 0;
              }
              if (bi.field_K.length <= sd.field_a.field_q) {
                sc.a(param0 ^ 8371, false, ml.field_l);
                sd.field_a.d((byte) 98);
              } else {
                sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
              }
              qe.field_a = -150;
              sd.field_a.field_J = 0;
              sd.field_a.s(86);
              return;
            case 6:
              sc.a(param0 + 8371, true, le.field_e);
              break;
            case 5:
              sc.a(-1, true, hi.field_l);
              break;
            case 2:
              sc.a(-1, true, ki.field_c);
              break;
            case 1:
              sc.a(-1, true, ki.field_c);
              break;
          }
          if (sd.field_a.field_q >= 3) {
            if (oh.a(param0 ^ -8372)) {
              sd.field_a.d((byte) 69);
            } else {
              if (0 >= hb.field_g) {
                sd.field_a.d((byte) 69);
              }
            }
          }
          if (!nc.field_J[sd.field_a.field_q][ib.field_t]) {
            ib.field_t = 0;
          }
          if (bi.field_K.length > sd.field_a.field_q) {
            sd.field_a.field_G = bi.field_K[sd.field_a.field_q];
          } else {
            sc.a(param0 ^ 8371, false, ml.field_l);
            sd.field_a.d((byte) 98);
          }
        }
        qe.field_a = -150;
        sd.field_a.field_J = 0;
        sd.field_a.s(86);
    }

    mf() {
    }

    static {
        field_u = null;
        field_A = new sd("");
    }
}
