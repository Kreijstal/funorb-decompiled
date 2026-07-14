/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uha extends wda {
    private int field_r;
    private boolean field_p;
    private boolean field_t;
    private int field_o;
    private int field_q;
    static String field_s;

    final int a(int param0, int param1) {
        if (param0 != 0) {
            return -79;
        }
        param1 = fs.a((byte) 54, param1, ((uha) this).field_o);
        param1 = fs.a((byte) 100, param1, ((uha) this).field_q);
        param1 = fs.a((byte) 107, param1, ((uha) this).field_r);
        return param1;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          L1: {
            var2 = ((uha) this).d((byte) -112);
            var3 = ((uha) this).a(false);
            if (((uha) this).field_p) {
              break L1;
            } else {
              if (((uha) this).field_t) {
                break L1;
              } else {
                var4 = (cr.a(true, ((uha) this).field_q >> 879418690) >> -49443032) * (((uha) this).field_o >> -1429435608) + var2;
                var5 = var3 - -((pla.b(35, ((uha) this).field_q >> -549244414) >> 1163626504) * (((uha) this).field_o >> -1403643896));
                break L0;
              }
            }
          }
          var4 = ((uha) this).field_n.s(25745);
          var5 = ((uha) this).field_n.e(false);
          ((uha) this).field_p = false;
          break L0;
        }
        ((uha) this).field_q = ((uha) this).field_q - ((uha) this).field_r;
        ((uha) this).field_q = dfa.a(((uha) this).field_q, 32768, 78);
        var7 = 49 % ((param0 - -69) / 42);
        var6 = var2 + (cr.a(true, ((uha) this).field_q >> -2117313726) >> 511069128) * (((uha) this).field_o >> 1439269544);
        var8 = var3 - -((pla.b(102, ((uha) this).field_q >> 641018146) >> -1004938040) * (((uha) this).field_o >> -90355640));
        ((uha) this).field_n.a((byte) -94, -var4 + var6, var8 + -var5);
    }

    final static boolean a(int param0, kh param1) {
        if (param0 != 5907) {
            return false;
        }
        return param1.b((byte) 44, 1) == 1 ? true : false;
    }

    final void a(int param0, fsa param1) {
        super.a(85, param1);
        ((uha) this).field_p = true;
        if (param0 < 35) {
            ((uha) this).field_r = -34;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            int discarded$0 = ((uha) this).a(116, 3);
        }
    }

    final void c(byte param0) {
        if (param0 > -116) {
            ((uha) this).field_t = false;
        }
        super.c((byte) -120);
        ((uha) this).field_q = -((uha) this).field_q;
        ((uha) this).field_r = -((uha) this).field_r;
    }

    final static int e(byte param0) {
        if (param0 < 47) {
            field_s = null;
        }
        return 256;
    }

    final void a(kh param0, byte param1) {
        super.a(param0, (byte) -122);
        param0.a((byte) -44, ((uha) this).field_o >> -2102342032, 10);
        param0.a((byte) 90, dqa.a(true, ((uha) this).field_r, 12), 12);
        param0.a((byte) -126, cn.a((byte) 74, ((uha) this).field_q, 32768, 4), 4);
        param0.a((byte) -128, ((uha) this).field_t ? 1 : 0, 1);
        if (param1 >= -78) {
            Object var4 = null;
            uha.a((jea) null, -46, (byte) 104, (jea) null, -72, 112, (byte[]) null, -67, (jea) null, 84);
        }
    }

    uha(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((uha) this).field_p = false;
        ((uha) this).field_t = true;
        ((uha) this).field_o = param1.b((byte) 44, 10) << -1984330448;
        ((uha) this).field_r = bla.a(true, 12, param1.b((byte) 44, 12));
        if (param0.field_E >= 10) {
            ((uha) this).field_q = oo.a(4, 32768, 0, param1.b((byte) 44, 4));
            ((uha) this).field_t = 1 == param1.b((byte) 44, 1) ? true : false;
        } else {
            ((uha) this).field_q = oo.a(3, 32768, 0, param1.b((byte) 44, 3));
            ((uha) this).field_t = true;
        }
    }

    final static void a(jea param0, int param1, byte param2, jea param3, int param4, int param5, byte[] param6, int param7, jea param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        um.field_m = param6;
        hpa.field_g = param5;
        rb.field_r = -1L;
        fk.field_b = param6.length;
        uu.field_a = null;
        ifa.field_n = null;
        qa.field_o = false;
        vk.field_b = new byte[(7 + hpa.field_g) / 8];
        if (param2 == -51) {
          var10 = 0;
          var11 = 0;
          L0: while (true) {
            if (var11 >= um.field_m.length) {
              L1: {
                var10 = (var10 - -7) / 8;
                tqa.field_e = new byte[var10];
                if (null == param8.field_J) {
                  param8.field_J = new vna();
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                uma.field_b = param8.field_J;
                uma.field_b.d(param2 ^ -59);
                fua.field_a = new af(param4);
                rda.field_o = 0;
                so.field_K = 0;
                bha.field_z = -1;
                qb.field_f = -1;
                if (param3.field_J == null) {
                  param3.field_J = new vna();
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                asa.field_j = param3.field_J;
                asa.field_j.d(8);
                jb.field_K = new af(param7);
                if (param0.field_J != null) {
                  break L3;
                } else {
                  param0.field_J = new vna();
                  break L3;
                }
              }
              qha.field_g = param0.field_J;
              qha.field_g.d(8);
              tc.field_d = new af(param1);
              qsa.field_a = param9;
              uq.field_d = 0L;
              return;
            } else {
              var10 = var10 + (um.field_m[var11] & 255);
              var11++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void e(int param0) {
        int var1 = -111 % ((-80 - param0) / 46);
        field_s = null;
    }

    final int c(int param0) {
        if (param0 != 1) {
            ((uha) this).field_r = 5;
        }
        return 9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Bags";
    }
}
