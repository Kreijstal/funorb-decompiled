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
        this.field_J = 256;
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -41) {
                break L1;
              } else {
                field_B = (String[]) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < np.field_o) {
                  break L2;
                } else {
                  if (param1.length() > oq.field_c) {
                    break L2;
                  } else {
                    return false;
                  }
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("cg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        bi var6;
        if (0 != param0) {
          return;
        } else {
          if (this.field_z != null) {
            if (-1 == (this.field_J ^ -1)) {
              return;
            } else {
              if ((this.field_J ^ -1) == -257) {
                this.field_z.a(param0, -11857, param2 - -this.field_q, param3 + this.field_m);
                return;
              } else {
                var6 = new bi(this.field_z.field_x, this.field_z.field_n);
                aq.a((byte) 114, var6);
                this.field_z.a(param0, param1, 0, 0);
                ln.f((byte) -78);
                var6.a(param3 - -this.field_m, param2 + this.field_q, this.field_J);
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
        RuntimeException var2_ref = null;
        aa var3 = null;
        bi[] var4 = null;
        bi[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15338) {
                break L1;
              } else {
                var3 = (aa) null;
                cg.a((String) null, false, (String) null, -21, (String) null, (aa) null, -88);
                break L1;
              }
            }
            var4 = new bi[9];
            var2 = var4;
            var4[4] = param1;
            stackIn_3_0 = (bi[]) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("cg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(String param0, boolean param1, String param2, int param3, String param4, aa param5, int param6) {
        RuntimeException var7 = null;
        oj var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param6 == -13037) {
              if (oj.field_Fb != ee.field_l) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var8 = new oj(le.field_e, param5);
                le.field_e.a(true, var8);
                if (!go.j(0)) {
                  L1: {
                    ee.field_l = ue.field_a;
                    if (!param1) {
                      stackIn_12_0 = 0;
                      break L1;
                    } else {
                      stackIn_12_0 = 1;
                      break L1;
                    }
                  }
                  np.field_m = stackIn_12_0 != 0;
                  aa.field_G = param4;
                  um.field_j = param2;
                  wh.field_c = null;
                  ae.field_g = param0;
                  jm.field_t = param3;
                  return true;
                } else {
                  var8.f(false);
                  stackIn_14_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var7);

            stackIn_17_1 = new StringBuilder().append("cg.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    final static void i(int param0) {
        ra.field_k = ra.field_k - 1;
        gf.a(bc.field_c[ra.field_k], oj.field_Cb[ra.field_k], vp.field_s[ra.field_k]);
        gf.field_i = cb.field_f[ra.field_k];
        if (param0 != 0) {
          field_A = (qr) null;
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
            L0: {
              if (param0) {
                break L0;
              } else {
                field_E = (StringBuilder) null;
                break L0;
              }
            }
            try {
              L1: {
                stackIn_3_0 = (ib) (Class.forName("rb").newInstance());
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        aa var2;
        field_B = null;
        field_E = null;
        field_F = null;
        field_C = null;
        field_A = null;
        if (param0 < 104) {
          var2 = (aa) null;
          cg.a((String) null, false, (String) null, 41, (String) null, (aa) null, 17);
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
        try {
            param0.a(0, this.field_n, (byte) 120, 0, this.field_x);
            this.field_z = param0;
            this.field_J = 256;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_E = new StringBuilder(80);
        field_F = null;
        field_I = 0;
        field_B = new String[]{"Perhaps you could consider...", "...adding game-specific benefits...", "...to ShatteredPlansText.text_benefits."};
        field_G = "Asking for or providing contact information";
    }
}
