/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends qs {
    static StringBuilder field_E;
    int field_J;
    static String field_F;
    static java.awt.Frame field_K;
    static int field_I;
    static qr field_A;
    static String[] field_B;
    static String field_G;
    static qr field_C;

    public cg() {
        super(0, 0, 0, 0, (iq) null, (ko) null);
        ((cg) this).field_J = 256;
    }

    final static boolean a(int param0, String param1) {
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 <= -41) {
          if (param1 != null) {
            if (param1.length() < np.field_o) {
              return true;
            } else {
              L0: {
                if (param1.length() > oq.field_c) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          field_B = null;
          if (param1 != null) {
            if (param1.length() >= np.field_o) {
              if (param1.length() <= oq.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        bi var6 = null;
        if (0 != param0) {
          return;
        } else {
          if (((cg) this).field_z != null) {
            if (-1 == (((cg) this).field_J ^ -1)) {
              return;
            } else {
              if ((((cg) this).field_J ^ -1) == -257) {
                ((cg) this).field_z.a(param0, -11857, param2 - -((cg) this).field_q, param3 + ((cg) this).field_m);
                return;
              } else {
                var6 = new bi(((cg) this).field_z.field_x, ((cg) this).field_z.field_n);
                aq.a((byte) 114, var6);
                ((cg) this).field_z.a(param0, param1, 0, 0);
                ln.f((byte) -78);
                var6.a(param3 - -((cg) this).field_m, param2 + ((cg) this).field_q, ((cg) this).field_J);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static bi[] a(int param0, bi param1) {
        bi[] var2 = null;
        Object var3 = null;
        bi[] var4 = null;
        if (param0 != -15338) {
          var3 = null;
          boolean discarded$2 = cg.a((String) null, false, (String) null, -21, (String) null, (aa) null, -88);
          var4 = new bi[9];
          var2 = var4;
          var4[4] = param1;
          return var2;
        } else {
          var4 = new bi[9];
          var2 = var4;
          var4[4] = param1;
          return var2;
        }
    }

    final static boolean a(String param0, boolean param1, String param2, int param3, String param4, aa param5, int param6) {
        if (param6 != -13037) {
            return false;
        }
        if (!(oj.field_Fb == ee.field_l)) {
            return false;
        }
        oj var8 = new oj(le.field_e, param5);
        le.field_e.a(true, (vg) (Object) var8);
        if (go.j(0)) {
            var8.f(false);
        } else {
            ee.field_l = ue.field_a;
            np.field_m = param1 ? true : false;
            aa.field_G = param4;
            um.field_j = param2;
            wh.field_c = null;
            ae.field_g = param0;
            jm.field_t = param3;
            return true;
        }
        return true;
    }

    final static void i(int param0) {
        ra.field_k = ra.field_k - 1;
        gf.a(bc.field_c[ra.field_k], oj.field_Cb[ra.field_k], vp.field_s[ra.field_k]);
        gf.field_i = cb.field_f[ra.field_k];
        if (param0 != 0) {
          field_A = null;
          gf.field_l = dk.field_b[ra.field_k];
          gf.field_a = bf.field_c[ra.field_k];
          gf.field_f = da.field_d[ra.field_k];
          return;
        } else {
          gf.field_l = dk.field_b[ra.field_k];
          gf.field_a = bf.field_c[ra.field_k];
          gf.field_f = da.field_d[ra.field_k];
          return;
        }
    }

    final static ib e(boolean param0) {
        try {
            Throwable var1 = null;
            ib stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ib stackOut_2_0 = null;
            L0: {
              if (param0) {
                break L0;
              } else {
                field_E = null;
                break L0;
              }
            }
            try {
              stackOut_2_0 = (ib) Class.forName("rb").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public static void j(int param0) {
        Object var2 = null;
        field_B = null;
        field_E = null;
        field_F = null;
        field_C = null;
        field_A = null;
        if (param0 < 104) {
          var2 = null;
          boolean discarded$2 = cg.a((String) null, false, (String) null, 41, (String) null, (aa) null, 17);
          field_K = null;
          field_G = null;
          return;
        } else {
          field_K = null;
          field_G = null;
          return;
        }
    }

    cg(vg param0) {
        super(param0.field_m, param0.field_q, param0.field_x, param0.field_n, (iq) null, (ko) null);
        param0.a(0, ((cg) this).field_n, (byte) 120, 0, ((cg) this).field_x);
        ((cg) this).field_z = param0;
        ((cg) this).field_J = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new StringBuilder(80);
        field_F = null;
        field_I = 0;
        field_B = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to ShatteredPlansText.text_benefits."};
        field_G = "Asking for or providing contact information";
    }
}
