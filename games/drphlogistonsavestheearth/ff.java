/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff extends pj implements ke {
    private hf field_J;
    static String field_K;
    private hf field_L;
    private hf field_M;
    static vj field_P;
    static vd field_O;
    static double[] field_N;
    static he[] field_R;
    static he[][] field_Q;

    public ff() {
        super(0, 0, 476, 225, (cg) null);
        ((ff) this).field_L = new hf(ai.field_v, (fd) null);
        ((ff) this).field_M = new hf(ej.field_c, (fd) null);
        ((ff) this).field_J = new hf(ml.field_m, (fd) null);
        ie var1 = new ie();
        ((ff) this).field_L.field_l = (cg) (Object) var1;
        ((ff) this).field_M.field_l = (cg) (Object) var1;
        ((ff) this).field_J.field_l = (cg) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1387580223;
        ((ff) this).field_M.a(((ff) this).field_k - 48 - var2, 30, -var3 + ((ff) this).field_w >> -746061279, 16535, var4);
        ((ff) this).field_J.a(((ff) this).field_k + -48 - var2, 30, var2 + ((((ff) this).field_w - var3 >> 166861089) - -var4), 16535, var4);
        ((ff) this).field_L.a(-(2 * var2) + (-78 + ((ff) this).field_k), 30, -var3 + ((ff) this).field_w >> -1589491935, 16535, var3);
        ((ff) this).field_M.field_u = (fd) this;
        ((ff) this).field_L.field_u = (fd) this;
        ((ff) this).field_L.field_v = ai.field_w;
        ((ff) this).field_J.field_u = (fd) this;
        ((ff) this).field_J.field_v = v.field_X;
        ((ff) this).b((vg) (Object) ((ff) this).field_M, (byte) 101);
        ((ff) this).b((vg) (Object) ((ff) this).field_L, (byte) 95);
        ((ff) this).b((vg) (Object) ((ff) this).field_J, (byte) 82);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + ((ff) this).field_o;
        int var6 = ((ff) this).field_m - -param3;
        int discarded$0 = uh.field_i.a(qk.field_a, var5 - -20, 20 + var6, -40 + ((ff) this).field_w, ((ff) this).field_k + -50, 16777215, -1, 1, 0, uh.field_i.field_x);
        super.a(param0, param1, param2, param3);
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((ff) this).field_M != param3) {
          if (param3 != ((ff) this).field_L) {
            if (param3 == ((ff) this).field_J) {
              ka.a((byte) -123);
              if (!param2) {
                ff.i(99);
                return;
              } else {
                return;
              }
            } else {
              if (!param2) {
                ff.i(99);
                return;
              } else {
                return;
              }
            }
          } else {
            ta.b(false);
            if (param2) {
              return;
            } else {
              ff.i(99);
              return;
            }
          }
        } else {
          h.d(-126);
          if (param2) {
            return;
          } else {
            ff.i(99);
            return;
          }
        }
    }

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 != -2) {
          var5 = null;
          ff.a(-48, (String) null, (java.applet.Applet) null);
          var9 = uh.field_h;
          var7 = var9;
          var6 = var7;
          var1 = var6;
          var2 = 0;
          var3 = var9.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L0;
            }
          }
        } else {
          var10 = uh.field_h;
          var8 = var10;
          var6 = var8;
          var1 = var6;
          var2 = 0;
          var3 = var10.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              var2++;
              var6[var2] = 0;
              continue L1;
            }
          }
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        Object var6 = null;
        if (param3 >= 63) {
          if (super.a(param0, param1, param2, 97)) {
            return true;
          } else {
            if (98 != param0) {
              if (param0 == 99) {
                return ((ff) this).a(param2, (byte) 61);
              } else {
                return false;
              }
            } else {
              return ((ff) this).a(param2, 65535);
            }
          }
        } else {
          var6 = null;
          ((ff) this).a(-113, 58, true, (hf) null, 25);
          if (super.a(param0, param1, param2, 97)) {
            return true;
          } else {
            if (98 != param0) {
              if (param0 == 99) {
                return ((ff) this).a(param2, (byte) 61);
              } else {
                return false;
              }
            } else {
              return ((ff) this).a(param2, 65535);
            }
          }
        }
    }

    public static void i(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          ff.a(121, (String) null, (java.applet.Applet) null);
          field_O = null;
          field_R = null;
          field_K = null;
          field_N = null;
          field_Q = null;
          field_P = null;
          return;
        } else {
          field_O = null;
          field_R = null;
          field_K = null;
          field_N = null;
          field_Q = null;
          field_P = null;
          return;
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            try {
                var3 = new java.net.URL(param2.getCodeBase(), param1);
                var3 = kk.a(var3, param2, 4767999);
                wa.a(var3.toString(), true, param2, (byte) 9);
                int var4 = 4 % ((param0 - 33) / 48);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Cancel";
        field_O = new vd();
        field_N = new double[]{0.0, 5.0, 8.0, 10.0, 10.0, 1.5, 0.0, 5.0, 4.5, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 3.0, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5.0, 5.0, 8.0, 3.5, 5.0, 2.5, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        field_Q = new he[77][];
    }
}
