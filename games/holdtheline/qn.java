/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qn extends hl {
    int field_i;
    static boolean field_k;
    static pf[] field_l;
    int field_j;
    static bm[] field_m;
    static String field_n;

    final static void a(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (lk.field_h != null && (param0 < 0 ||
            d.field_f == ad.field_b)) {
            if (param1 == da.field_p.field_l &&
              bb.b(-1) > (10000L + qf.field_l)) {
              da.field_p.c((byte) 33, param0);
            }
            if (da.field_p.field_l > 0) {
              try {
                lk.field_h.a(da.field_p.field_l, da.field_p.field_i, 0, 1);
                qf.field_l = bb.b(-1);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                r.a(-28036);
              }
              da.field_p.field_l = 0;
            }
            return;
          }
          da.field_p.field_l = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 >= -41) {
          field_l = (pf[]) null;
        }
        field_l = null;
        field_m = null;
    }

    private qn() throws Throwable {
        throw new Error();
    }

    final static lc a(String param0, int param1) {
        RuntimeException var2 = null;
        lc stackIn_2_0 = null;
        lc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -7079) {
            stackIn_4_0 = new lc(param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (lc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        float stackIn_31_0 = 0.0f;
        float stackIn_59_0 = 0.0f;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        float var5 = 0.0f;
        float var6 = 0.0f;
        float var7 = 0.0f;
        int var8 = 0;
        String var9 = null;
        ja var10 = null;
        ja var11 = null;
        ja var12 = null;
        ja var13 = null;
        int var3_intLifetime1;
        float var5Lifetime1;
        float var6Lifetime1;
        float var7Lifetime1;
        int var3_intLifetime1Lifetime1;
        var8 = HoldTheLine.field_D;
        try {
          if (nd.field_e) {
            nd.field_e = false;
            tn.a(param0 - 7);
          }
          if (3 == bl.field_r.field_J) {
            wm.a(param1, false, 0);
            return;
          }
          ce.field_r = -1;
          if (mi.field_d != 7) {
            if (bl.field_r.field_U &&
              !param2) {
              if (0 == mi.field_d) {
                ek.field_x = 4;
                for (var3_int = 0; var3_int < 4; var3_int++) {
                  var10 = bl.field_r.field_C[var3_int];
                  var12 = var10;
                  if (bl.field_r.field_B >= var12.field_bc) {
                    if (var12.field_vb < var12.field_Ib) {
                      stackIn_31_0 = var12.field_vb;
                    } else {
                      stackIn_31_0 = var12.field_Ib;
                    }
                    var5 = stackIn_31_0;
                    var6 = cd.a(bl.field_r.field_sb, 1, var5);
                    var7 = (-1.0f + ((float)var12.field_bc + var6)) / (float)bl.field_r.field_B;
                    if (0.0f == var7) {
                      pe.field_g[var3_int] = -1;
                    } else {
                      pe.field_g[var3_int] = (int)((float)bl.field_r.field_ob / var7);
                      if (pe.field_g[var3_int] > bl.field_r.field_ob + 1000) {
                        pe.field_g[var3_int] = -1;
                      }
                    }
                  } else {
                    pe.field_g[var3_int] = var10.field_Pb;
                  }
                }
                cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -126);
              } else {
                if (2 != mi.field_d) {
                  throw new RuntimeException();
                }
                ek.field_x = 5;
              }
              wm.a(param1, false, 11);
              return;
            }
            if (pj.b((byte) 121)) {
              if (0 == ii.field_c &&
                !ad.field_a) {
                wm.a(param1, false, 0);
                return;
              }
              wm.a(param1, false, 9);
            } else {
              if (ii.field_c == 0) {
                wm.a(param1, false, 0);
              } else {
                wm.a(param1, false, 8);
              }
            }
            return;
          }
          ((ti) (l.field_a[3])).g(0, cf.field_w);
          if (bl.field_r.field_U &&
            !param2) {
            cc.a(bl.field_r.field_C[0].field_R, cf.field_w, vg.field_P, bl.field_r.field_ob, -122);
            for (var3_intLifetime1 = 0; var3_intLifetime1 < 4; var3_intLifetime1++) {
              var11 = bl.field_r.field_C[var3_intLifetime1];
              var13 = var11;
              t.field_j[var3_intLifetime1] = t.field_j[var3_intLifetime1] + ub.field_C[var11.field_R];
              if (var13.field_bc > bl.field_r.field_B) {
                pe.field_g[var3_intLifetime1] = var11.field_Pb;
              } else {
                if (!(var13.field_Ib > var13.field_vb)) {
                  stackIn_59_0 = var13.field_Ib;
                } else {
                  stackIn_59_0 = var13.field_vb;
                }
                var5Lifetime1 = stackIn_59_0;
                var6Lifetime1 = cd.a(bl.field_r.field_sb, param0 ^ 6, var5Lifetime1);
                var7Lifetime1 = (var6Lifetime1 + (float)var13.field_bc - 1.0f) / (float)bl.field_r.field_B;
                if (0.0f == var7Lifetime1) {
                  pe.field_g[var3_intLifetime1] = -1;
                } else {
                  pe.field_g[var3_intLifetime1] = (int)((float)bl.field_r.field_ob / var7Lifetime1);
                  if (bl.field_r.field_ob + 1000 < pe.field_g[var3_intLifetime1]) {
                    pe.field_g[var3_intLifetime1] = -1;
                  }
                }
              }
            }
            if (bl.field_r.field_C[0].field_R >= 2) {
              pg.a(3, (byte) 102, true);
              fieldTemp$0 = kk.field_l - 1;
              kk.field_l = kk.field_l - 1;
              if (1 > fieldTemp$0) {
                ek.field_x = 6;
                wm.a(param1, false, 11);
              } else {
                ek.field_x = 1;
                dk.field_g = dk.field_g - 1;
                wm.a(param1, false, 10);
              }
              return;
            }
            pg.a(2, (byte) 116, true);
            if (param0 != 7) {
              var9 = (String) null;
              qn.a((String) null, -40);
            }
            if (cf.field_w == ao.field_b &&
              hk.field_d == vg.field_P) {
              fieldTemp$1 = hk.field_d + 1;
              hk.field_d = hk.field_d + 1;
              if (fieldTemp$1 == pc.field_l[ao.field_b]) {
                hk.field_d = hk.field_d - 1;
              }
              tn.a(0);
              h.b((byte) 121);
            }
            var3_intLifetime1Lifetime1 = bl.field_r.field_ob;
            kk.field_m[vg.field_P] = var3_intLifetime1Lifetime1;
            nj.field_d = bl.field_r.field_t;
            hn.field_y = hn.field_y + var3_intLifetime1Lifetime1;
            ni.field_b = bl.field_r.field_hb;
            cm.field_a = bl.field_r.field_y;
            tn.field_c = bl.field_r.field_g;
            ni.field_b = ni.field_b - 1;
            tn.field_c = tn.field_c + 1;
            cm.field_a = cm.field_a - (tn.field_c + hn.field_y);
            nj.field_d = nj.field_d + ni.field_b;
            fieldTemp$2 = vg.field_P + 1;
            vg.field_P = vg.field_P + 1;
            if (fieldTemp$2 == pc.field_l[cf.field_w]) {
              if (eg.field_a == 0) {
                cc.a(kk.field_m, (byte) -89, cf.field_w);
                if (cf.field_w == ao.field_b &&
                  3 > ao.field_b) {
                  hk.field_d = 0;
                  fieldTemp$3 = ao.field_b + 1;
                  ao.field_b = ao.field_b + 1;
                  ce.field_r = fieldTemp$3;
                  tn.a(0);
                  h.b((byte) -125);
                }
              }
              vg.field_P = 0;
              ek.field_x = 2;
            } else {
              dk.field_g = 3;
              ek.field_x = 0;
            }
            if (ek.field_x != 0 &&
              1 != ek.field_x) {
              wm.a(param1, false, 11);
              return;
            }
            wm.a(param1, false, 10);
            return;
          }
          bn.a(1, param0 - 121);
          if (pj.b((byte) 102)) {
            if (0 == ii.field_c &&
              !ad.field_a) {
              wm.a(param1, false, 12);
              return;
            }
            wm.a(param1, false, 9);
          } else {
            if (0 != ii.field_c) {
              wm.a(param1, false, 7);
            } else {
              wm.a(param1, false, 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "qn.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
