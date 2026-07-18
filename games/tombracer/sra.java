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
          ina dupTemp$1 = new ina(55);
          lba.field_r = dupTemp$1;
          var4 = dupTemp$1;
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
        vna var2 = null;
        RuntimeException var2_ref = null;
        String[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String[][] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[][] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2 = new vna();
            L1: while (true) {
              if (param1.field_h >= param1.field_g.length) {
                var3 = new String[var2.a((byte) -16)][];
                var4 = -92;
                var5 = 0;
                L2: while (true) {
                  if (var3.length <= var5) {
                    stackOut_7_0 = (String[][]) var3;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    var3[var5] = ((gba) (Object) var2.c(44)).field_g;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = 73;
                var2.b((byte) -72, (vg) (Object) new gba(pe.a(param1)));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("sra.H(").append(43).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final void a(int param0, byte param1, String param2) {
        try {
            if (param1 != 47) {
                ((sra) this).field_e = null;
            }
            ima.a((float)param0, param2, -106);
            ad.field_j.c(0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "sra.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
                  int discarded$5 = 17;
                  fp.a(uba.field_g[1], 40, ((sra) this).field_h);
                  bja.a((byte) -105, ((sra) this).field_p, 50, uba.field_g[2]);
                  ((sra) this).field_p = null;
                  mj.a((byte) -86, uba.field_g[3], ((sra) this).field_q, ((sra) this).field_h, 60);
                  ((sra) this).a(65, (byte) 47, uba.field_g[4]);
                  dqa.a(((sra) this).field_r, ((sra) this).field_m, (byte) 55, ((sra) this).field_h);
                  ((sra) this).a(70, (byte) 47, uba.field_g[5]);
                  int discarded$6 = -10242;
                  this.d();
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
                                if (var3 >= 4) {
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
                int discarded$7 = 17229;
                ih.D();
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
            int discarded$8 = 17572;
            gda.a(((sra) this).field_d);
            int discarded$9 = -125;
            uo.b();
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
            int discarded$3 = 0;
            if (lga.b()) {
                ((sra) this).field_n = true;
            }
        }
        if (param0 > -124) {
            ((sra) this).field_a = null;
        }
        return ((sra) this).field_n;
    }

    final static String a(String param0) {
        try {
            RuntimeException var2 = null;
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
            String stackIn_9_0 = null;
            String stackIn_14_0 = null;
            String stackIn_16_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            String stackOut_13_0 = null;
            String stackOut_15_0 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var8 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                var9 = new kh(128);
                var9.field_h = var9.field_h + 2;
                var3 = var9.field_h;
                var9.i(8);
                try {
                  L1: {
                    var4_int = 0;
                    L2: while (true) {
                      if (param0.length() <= var4_int) {
                        break L1;
                      } else {
                        L3: {
                          var5_int = param0.charAt(var4_int);
                          if (Character.isWhitespace((char) var5_int)) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var4_int++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = (Exception) (Object) decompiledCaughtException;
                  var4.printStackTrace();
                  stackOut_8_0 = "Unable to pack " + param0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
                var9.k(-1826190686);
                var9.b(-var3 + var9.field_h, (byte) 109);
                var9.field_h = 0;
                var4 = null;
                try {
                  L4: {
                    int discarded$3 = 1;
                    int discarded$4 = -26;
                    var15 = ssa.a((uia) (Object) var9);
                    break L4;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var5 = (Exception) (Object) decompiledCaughtException;
                  var5.printStackTrace();
                  stackOut_13_0 = "funorb profile threw Exception";
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
                var11 = new kh(var15);
                var12 = new esa();
                var7 = -1;
                var6 = var11.h(255);
                int discarded$5 = 0;
                dga.a((uia) (Object) var11);
                var12.a(var11, var6, (byte) 39);
                mq.field_e = var12.a(79);
                f.field_e = var12.b((byte) -78);
                toa.field_j = true;
                stackOut_15_0 = "profile loaded";
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) var2;
                stackOut_17_1 = new StringBuilder().append("sra.G(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L5;
                } else {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L5;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + 85 + ')');
            }
            return stackIn_16_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final boolean b(int param0) {
        rg.e(-2339);
        int discarded$11 = 67;
        ln.A();
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

    public static void c() {
        field_u = null;
        field_v = null;
        field_i = null;
    }

    public final void b(byte param0) {
        bla.a(cq.field_d, (byte) 52);
        hd.a(50, param0 ^ -78);
        wm.field_a = null;
        int discarded$0 = 50;
        hb.field_t = (dfa) (Object) nl.a(0);
        ima.a(100.0f, uba.field_g[10], param0 ^ 115);
        ad.field_j.c(param0 ^ -49);
        gn.field_C.a(-19216);
        if (param0 != -49) {
            this.c(-107);
        }
        int discarded$4 = 0;
        cla.f();
        ea.a(param0 + 16);
        if (null != mq.field_e) {
            eda.a(mq.field_e.field_g, true);
        }
    }

    private final void d() {
        int var4 = 0;
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        iu[][] var2 = new iu[haa.field_C.length][];
        int var3 = 0;
        for (var4 = 0; haa.field_C.length > var4; var4++) {
            var2[var4] = new iu[haa.field_C[var4].length];
            for (var5 = 0; var5 < haa.field_C[var4].length; var5++) {
                int incrementValue$0 = var3;
                var3++;
                var2[var4][var5] = bp.field_m[incrementValue$0];
            }
        }
        if (!(dna.field_G)) {
            dea.field_c = false;
            op.a(((sra) this).field_s, 10, ws.field_o, fr.field_b, oma.field_G, qaa.field_a, 4, var2, true, 2, via.field_c, ota.field_b, jf.field_t, mga.field_f, var2);
            cq.field_d = qw.field_f;
            int discarded$1 = -71;
            int discarded$2 = 200;
            tda.a();
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
