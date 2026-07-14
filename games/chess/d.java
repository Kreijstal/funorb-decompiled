/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class d extends ci {
    static String field_Lb;
    private ci[] field_Kb;
    static boolean field_Gb;
    static char field_Ib;
    int field_Hb;
    static byte[] field_Jb;
    private ci field_Fb;
    private ci[] field_Eb;
    static dk field_Mb;

    final static boolean a(boolean param0) {
        sk.field_p = param0 ? true : false;
        ma.field_E = ud.a(2) + 15000L;
        return (rm.field_Q ^ -1) == -12 ? true : false;
    }

    final static void a(vl param0, int param1, vl param2, jk param3, java.awt.Component param4, boolean param5, byte param6) {
        md.a(param1, param5, 10);
        mh.field_d = md.a(param3, param4, 0, 22050);
        kn.field_F = md.a(param3, param4, 1, 2048);
        h.field_s = new lb();
        kn.field_F.b((nm) (Object) h.field_s);
        fk.field_q = param2;
        fk.field_q.a(64 * bc.field_b / 80, (byte) -100);
        mh.field_d.b((nm) (Object) fk.field_q);
        if (param6 > -21) {
            field_Mb = null;
        }
        ka.field_a = param0;
        ka.field_a.a(lf.field_S * 64 / 80, (byte) -100);
        h.field_s.a((nm) (Object) ka.field_a);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var7 = Chess.field_G;
        var4 = param0;
        L0: while (true) {
          if (((d) this).field_Eb.length <= var4) {
            ((d) this).field_Fb.a(0, ((d) this).field_M, param0 ^ -2147483648, ((d) this).field_pb + -param2, param2);
            var8 = 0;
            var4 = var8;
            L1: while (true) {
              if (var8 >= ((d) this).field_Kb.length) {
                return;
              } else {
                ((d) this).field_Kb[var8].a(param1, -(2 * param1) + ((d) this).field_Fb.field_M, -2147483648, -(param1 * 2) + ((d) this).field_Fb.field_pb, param1);
                if (var8 != ((d) this).field_Hb) {
                  ((d) this).field_Kb[var8].field_mb = ((d) this).field_Kb[var8].field_mb + 10000;
                  var8++;
                  continue L1;
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var5 = ((d) this).field_M * var4 / ((d) this).field_Eb.length;
            var6 = (1 + var4) * ((d) this).field_M / ((d) this).field_Eb.length;
            ((d) this).field_Eb[var4].field_mb = var5;
            ((d) this).field_Eb[var4].field_V = 0;
            ((d) this).field_Eb[var4].field_M = -var5 + var6;
            ((d) this).field_Eb[var4].field_pb = param2;
            var4++;
            continue L0;
          }
        }
    }

    d(long param0, ci param1, String[] param2, ci param3, ci[] param4, int param5) {
        super(param0, (ci) null);
        int var8 = 0;
        ci var9 = null;
        ((d) this).field_Eb = new ci[param2.length];
        ((d) this).field_Fb = new ci(0L, param3);
        ((d) this).field_Kb = param4;
        for (var8 = 0; var8 < param2.length; var8++) {
            var9 = new ci(0L, param1);
            var9.field_db = param2[var8];
            ((d) this).field_Eb[var8] = var9;
            ((d) this).a((byte) 124, var9);
        }
        ((d) this).a((byte) 127, ((d) this).field_Fb);
        int var11 = 0;
        var8 = var11;
        while (param4.length > var11) {
            ((d) this).field_Fb.a((byte) 126, param4[var11]);
            var11++;
        }
        ((d) this).field_Hb = param5;
        ((d) this).field_Eb[param5].field_gb = true;
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Chess.field_G;
        var2 = 0;
        L0: while (true) {
          if (((d) this).field_Eb.length <= var2) {
            L1: {
              if (param0 == 109) {
                break L1;
              } else {
                var4 = null;
                d.a((vl) null, -126, (vl) null, (jk) null, (java.awt.Component) null, false, (byte) 69);
                break L1;
              }
            }
            return;
          } else {
            if (((d) this).field_Hb != var2) {
              if (((d) this).field_Eb[var2].field_L != 0) {
                ((d) this).field_Eb[((d) this).field_Hb].field_gb = false;
                ((d) this).field_Kb[((d) this).field_Hb].field_mb = ((d) this).field_Kb[((d) this).field_Hb].field_mb + 10000;
                ((d) this).field_Hb = var2;
                ((d) this).field_Eb[var2].field_gb = true;
                ((d) this).field_Kb[var2].field_mb = ((d) this).field_Kb[var2].field_mb - 10000;
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final static void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Chess.field_G;
        if (param0 != 465918340) {
            field_Ib = '';
        }
        int var1 = ge.field_eb[0];
        for (var2 = 1; var2 < ge.field_eb.length; var2++) {
            var3 = ge.field_eb[var2];
            ne.a(ve.field_Hb, var2 << 465918340, ve.field_Hb, var1, var3);
            var1 = var1 + var3;
        }
    }

    final static void a(byte param0, ld param1) {
        int var2 = 0;
        ld var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        if (param1.field_n != null) {
          L0: {
            L1: {
              if (0 != param1.field_e) {
                break L1;
              } else {
                if (-1 == param1.field_q) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (var2 >= qf.field_c) {
                break L0;
              } else {
                var3 = ik.field_i[var2];
                if (-3 == var3.field_k) {
                  if (param1.field_e == var3.field_e) {
                    if (var3.field_q == param1.field_q) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if (param1.field_l != null) {
              ca.field_i = param1.field_l;
              a.field_f = param1.field_m;
              v.field_b = param1.field_i;
              hn.field_s = param1.field_k;
              break L3;
            } else {
              break L3;
            }
          }
          var2 = 79 / ((92 - param0) / 33);
          ml.a((byte) 90, param1);
          return;
        } else {
          return;
        }
    }

    public static void k(int param0) {
        int var1 = -83 % ((-59 - param0) / 40);
        field_Jb = null;
        field_Lb = null;
        field_Mb = null;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = -14 / ((param0 - -10) / 47);
        ((d) this).field_V = param1;
        ((d) this).field_M = param2;
        ((d) this).field_pb = param6;
        ((d) this).field_mb = param3;
        this.a(0, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = "Add name";
    }
}
