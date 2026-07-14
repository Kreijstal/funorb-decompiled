/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sra implements eb {
    static boolean field_t;
    private boolean field_c;
    private cn field_g;
    private cn field_p;
    private cn field_e;
    private cn field_m;
    private static String[] field_v;
    private cn field_j;
    private cn field_o;
    private cn field_k;
    private cn field_d;
    private cn field_f;
    private cn field_h;
    static String field_i;
    private cn field_q;
    private cn field_a;
    private cn field_b;
    static String[] field_u;
    private boolean field_n;
    private cn field_s;
    private cn field_l;
    private cn field_r;

    public final void a(byte param0) {
        cn var3 = null;
        ina var4 = null;
        cn var6 = null;
        cn var7 = null;
        L0: {
          if (null != oqa.field_v) {
            pfa.a(oqa.field_v, param0 + 157);
            oqa.field_v = null;
            ea.a(-33);
            break L0;
          } else {
            break L0;
          }
        }
        ((sra) this).field_h = dd.a(16, param0 ^ -37);
        ((sra) this).field_q = dd.a(17, param0 ^ -37);
        ((sra) this).field_p = dd.a(18, param0 + 39);
        ((sra) this).field_j = dd.a(19, 1);
        ((sra) this).field_g = dd.a(20, 1);
        ((sra) this).field_f = dd.a(21, 1);
        ((sra) this).field_a = dd.a(22, param0 + 39);
        ((sra) this).field_r = dd.a(23, 1);
        ((sra) this).field_m = dd.a(24, 1);
        ((sra) this).field_k = dd.a(26, 1);
        ((sra) this).field_l = dd.a(27, 1);
        ((sra) this).field_o = dd.a(28, 1);
        ((sra) this).field_b = dd.a(29, 1);
        ((sra) this).field_d = dd.a(30, 1);
        ((sra) this).field_s = dd.a(ea.field_i.field_c, 1);
        if (param0 == -38) {
          ((sra) this).field_e = dd.a(kn.field_j.field_c, param0 ^ -37);
          var6 = oma.field_G;
          var7 = var6;
          var3 = ota.field_b;
          lba.field_r = new ina(55);
          var4 = new ina(55);
          var4.a(256, ((sra) this).field_k, fv.field_d[0], hca.field_U[0]);
          var4.a(256, ((sra) this).field_l, fv.field_d[1], hca.field_U[1]);
          var4.a(256, ((sra) this).field_o, fv.field_d[2], hca.field_U[2]);
          var4.a(256, ((sra) this).field_b, fv.field_d[3], hca.field_U[3]);
          var4.a(256, ((sra) this).field_h, fv.field_d[4], hca.field_U[4]);
          var4.a(param0 ^ -294, ((sra) this).field_p, fv.field_d[5], hca.field_U[5]);
          var4.a(256, ((sra) this).field_s, fv.field_d[6], hca.field_U[6]);
          var4.a(hca.field_U[7], (byte) -36, "basic", var7, fv.field_d[7]);
          var4.a(hca.field_U[8], (byte) -36, "lobby", var7, fv.field_d[8]);
          var4.a(hca.field_U[9], (byte) -36, "lobby", var3, fv.field_d[9]);
          var4.a(256, ((sra) this).field_d, fv.field_d[10], hca.field_U[10]);
          var4.a(256, ((sra) this).field_e, fv.field_d[11], hca.field_U[11]);
          var4.a(256, ((sra) this).field_q, fv.field_d[12], hca.field_U[12]);
          var4.a(256, ((sra) this).field_r, fv.field_d[13], hca.field_U[13]);
          var4.a(256, ((sra) this).field_m, fv.field_d[14], hca.field_U[14]);
          var4.a(param0 + 294, ((sra) this).field_j, fv.field_d[15], hca.field_U[15]);
          var4.a(256, ((sra) this).field_f, fv.field_d[16], hca.field_U[16]);
          var4.a(param0 ^ -294, ((sra) this).field_g, fv.field_d[17], hca.field_U[17]);
          var4.a(param0 ^ -294, ((sra) this).field_a, fv.field_d[18], hca.field_U[18]);
          return;
        } else {
          return;
        }
    }

    final static String[][] a(byte param0, uia param1) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        vna var2 = new vna();
        while (param1.field_h < param1.field_g.length) {
            var2.b((byte) -72, (vg) (Object) new gba(pe.a(param1, (byte) 73)));
        }
        String[][] var3 = new String[var2.a((byte) -16)][];
        int var4 = -92 / ((param0 - -9) / 51);
        for (var5 = 0; var3.length > var5; var5++) {
            var3[var5] = ((gba) (Object) var2.c(44)).field_g;
        }
        return var3;
    }

    final void a(int param0, byte param1, String param2) {
        if (param1 != 47) {
            ((sra) this).field_e = null;
        }
        ima.a((float)param0, param2, -106);
        ad.field_j.c(0);
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 5 / ((55 - param0) / 58);
        if (((sra) this).field_e == null) {
          if (((sra) this).field_d == null) {
            L0: {
              if (((sra) this).field_h == null) {
                break L0;
              } else {
                if (null != ((sra) this).field_p) {
                  fp.a(uba.field_g[1], 40, ((sra) this).field_h, (byte) 17);
                  bja.a((byte) -105, ((sra) this).field_p, 50, uba.field_g[2]);
                  ((sra) this).field_p = null;
                  mj.a((byte) -86, uba.field_g[3], ((sra) this).field_q, ((sra) this).field_h, 60);
                  ((sra) this).a(65, (byte) 47, uba.field_g[4]);
                  dqa.a(((sra) this).field_r, ((sra) this).field_m, (byte) 55, ((sra) this).field_h);
                  ((sra) this).a(70, (byte) 47, uba.field_g[5]);
                  this.d(-10242);
                  ((sra) this).a(75, (byte) 47, uba.field_g[6]);
                  ((sra) this).field_r = null;
                  ((sra) this).field_m = null;
                  ((sra) this).field_h = null;
                  ea.a(-33);
                  return;
                } else {
                  break L0;
                }
              }
            }
            if (((sra) this).field_j == null) {
              if (null == ((sra) this).field_f) {
                L1: {
                  if (((sra) this).field_k == null) {
                    break L1;
                  } else {
                    if (((sra) this).field_l == null) {
                      break L1;
                    } else {
                      if (((sra) this).field_b == null) {
                        break L1;
                      } else {
                        if (((sra) this).field_o != null) {
                          sb.a(-70, ((sra) this).field_k, ((sra) this).field_o, ((sra) this).field_l, ((sra) this).field_b);
                          var3 = 0;
                          L2: while (true) {
                            if (237 <= var3) {
                              var3 = 0;
                              L3: while (true) {
                                if (-5 >= (var3 ^ -1)) {
                                  ab.field_n.field_y.e(0);
                                  ((sra) this).field_o = null;
                                  ((sra) this).field_k = null;
                                  ((sra) this).field_l = null;
                                  ((sra) this).field_b = null;
                                  return;
                                } else {
                                  paa.a(false, var3);
                                  var3++;
                                  continue L3;
                                }
                              }
                            } else {
                              fea.a(false, var3);
                              var3++;
                              continue L2;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                L4: {
                  if (baa.field_d != null) {
                    break L4;
                  } else {
                    ((sra) this).a(95, (byte) 47, uba.field_g[9]);
                    bha.e((byte) -33);
                    baa.field_d = new di(qra.field_l, rc.field_a);
                    break L4;
                  }
                }
                ih.D(17229);
                if (null == baa.field_d.field_i) {
                  return;
                } else {
                  ((sra) this).field_c = true;
                  return;
                }
              } else {
                nfa.a(((sra) this).field_f, uba.field_g[8], false, 90, ((sra) this).field_g, ((sra) this).field_a);
                ((sra) this).field_g = null;
                ((sra) this).field_a = null;
                ((sra) this).field_f = null;
                ea.a(-33);
                return;
              }
            } else {
              ui.a(((sra) this).field_j, uba.field_g[7], 80, -79);
              ((sra) this).field_j = null;
              ea.a(-33);
              return;
            }
          } else {
            wca.a(-18035);
            ((sra) this).a(30, (byte) 47, uba.field_g[0]);
            gda.a(((sra) this).field_d, 17572);
            uo.b((byte) -125);
            ((sra) this).field_d = null;
            ea.a(-33);
            return;
          }
        } else {
          csa.a(1048576, new kra(((sra) this).field_e.a("", (byte) 113, "huffman")));
          ((sra) this).field_e = null;
          ea.a(-33);
          return;
        }
    }

    public final boolean a(int param0) {
        if (!((sra) this).field_n) {
            if (lga.b(false)) {
                ((sra) this).field_n = true;
            }
        }
        if (param0 > -124) {
            ((sra) this).field_a = null;
        }
        return ((sra) this).field_n;
    }

    final static String a(String param0, int param1) {
        try {
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            kh var9 = null;
            kh var11 = null;
            esa var12 = null;
            byte[] var15 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TombRacer.field_G ? 1 : 0;
                        var9 = new kh(128);
                        var9.field_h = var9.field_h + 2;
                        var3 = var9.field_h;
                        var9.i(8);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var4_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (param0.length() <= var4_int) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var5_int = param0.charAt(var4_int);
                            if (Character.isWhitespace((char) var5_int)) {
                                statePc = 4;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var4 = (Exception) (Object) caughtException;
                        var4.printStackTrace();
                        return "Unable to pack " + param0;
                    }
                    case 8: {
                        var9.k(-1826190686);
                        var9.b(-var3 + var9.field_h, (byte) 109);
                        var9.field_h = 0;
                        var4 = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            var15 = ssa.a((uia) (Object) var9, -26, true);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var5 = (Exception) (Object) caughtException;
                        var5.printStackTrace();
                        return "funorb profile threw Exception";
                    }
                    case 12: {
                        var11 = new kh(var15);
                        var12 = new esa();
                        var7 = -101 % ((-14 - param1) / 49);
                        var6 = var11.h(255);
                        dga.a((uia) (Object) var11, 0);
                        var12.a(var11, var6, (byte) 39);
                        mq.field_e = var12.a(79);
                        f.field_e = var12.b((byte) -78);
                        toa.field_j = true;
                        return "profile loaded";
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean b(int param0) {
        rg.e(-2339);
        ln.A(67);
        if (!(((sra) this).field_c)) {
            this.c(124);
            return false;
        }
        ea.a(-33);
        if (param0 != -4171) {
            return true;
        }
        return true;
    }

    public static void c(byte param0) {
        if (param0 != -35) {
            field_u = null;
        }
        field_u = null;
        field_v = null;
        field_i = null;
    }

    public final void b(byte param0) {
        bla.a(cq.field_d, (byte) 52);
        hd.a(50, param0 ^ -78);
        wm.field_a = null;
        hb.field_t = (dfa) (Object) nl.a(0, (byte) 50);
        ima.a(100.0f, uba.field_g[10], param0 ^ 115);
        ad.field_j.c(param0 ^ -49);
        gn.field_C.a(-19216);
        if (param0 != -49) {
            this.c(-107);
        }
        cla.f(0);
        ea.a(param0 + 16);
        if (null != mq.field_e) {
            eda.a(mq.field_e.field_g, true);
        }
    }

    private final void d(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        iu[][] var2 = new iu[haa.field_C.length][];
        int var3 = 0;
        for (var4 = 0; haa.field_C.length > var4; var4++) {
            var2[var4] = new iu[haa.field_C[var4].length];
            for (var5 = 0; var5 < haa.field_C[var4].length; var5++) {
                var3++;
                var2[var4][var5] = bp.field_m[var3];
            }
        }
        if (param0 != -10242) {
            ((sra) this).b((byte) 30);
        }
        if (!(dna.field_G)) {
            dea.field_c = false;
            op.a(((sra) this).field_s, 10, ws.field_o, fr.field_b, oma.field_G, qaa.field_a, 4, var2, true, 2, via.field_c, ota.field_b, jf.field_t, mga.field_f, var2);
            cq.field_d = qw.field_f;
            tda.a(200, (byte) -71);
            fta.field_b = ff.field_p;
        }
    }

    sra() {
        ((sra) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[6];
        field_v[3] = "Key";
        field_v[0] = "Coin";
        field_v[2] = "Idol";
        field_v[4] = "Gun";
        field_v[1] = "Coinbag";
        field_v[5] = "Powerup: Misc";
        field_u = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_i = "Return to game";
    }
}
