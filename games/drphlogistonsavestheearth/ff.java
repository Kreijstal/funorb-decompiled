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
        this.field_L = new hf(ai.field_v, (fd) null);
        this.field_M = new hf(ej.field_c, (fd) null);
        this.field_J = new hf(ml.field_m, (fd) null);
        ie var1 = new ie();
        this.field_L.field_l = (cg) ((Object) var1);
        this.field_M.field_l = (cg) ((Object) var1);
        this.field_J.field_l = (cg) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -1387580223;
        this.field_M.a(this.field_k - 48 - var2, 30, -var3 + this.field_w >> -746061279, 16535, var4);
        this.field_J.a(this.field_k + -48 - var2, 30, var2 + ((this.field_w - var3 >> 166861089) - -var4), 16535, var4);
        this.field_L.a(-(2 * var2) + (-78 + this.field_k), 30, -var3 + this.field_w >> -1589491935, 16535, var3);
        this.field_M.field_u = (fd) (this);
        this.field_L.field_u = (fd) (this);
        this.field_L.field_v = ai.field_w;
        this.field_J.field_u = (fd) (this);
        this.field_J.field_v = v.field_X;
        this.b(this.field_M, (byte) 101);
        this.b(this.field_L, (byte) 95);
        this.b(this.field_J, (byte) 82);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.field_o;
        int var6 = this.field_m - -param3;
        uh.field_i.a(qk.field_a, var5 - -20, 20 + var6, -40 + this.field_w, this.field_k + -50, 16777215, -1, 1, 0, uh.field_i.field_x);
        super.a(param0, param1, param2, param3);
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_M != param3) {
                if (param3 != this.field_L) {
                  if (param3 == this.field_J) {
                    ka.a((byte) -123);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ta.b(false);
                  break L1;
                }
              } else {
                h.d(-126);
                break L1;
              }
            }
            if (param2) {
              break L0;
            } else {
              ff.i(99);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("ff.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -2) {
                break L1;
              } else {
                var5 = (java.applet.Applet) null;
                ff.a(-48, (String) null, (java.applet.Applet) null);
                break L1;
              }
            }
            var6 = uh.field_h;
            var1 = var6;
            var2 = 0;
            var3 = var6.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var6[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ie.a((Throwable) ((Object) var1_ref), "ff.B(" + param0 + ')');
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        RuntimeException var5 = null;
        hf var6 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 >= 63) {
                break L1;
              } else {
                var6 = (hf) null;
                this.a(-113, 58, true, (hf) null, 25);
                break L1;
              }
            }
            if (super.a(param0, param1, param2, 97)) {
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 != param0) {
                if (param0 != 99) {
                  stackIn_13_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_11_0 = this.a(param2, (byte) 61);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = this.a(param2, 65535);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("ff.BA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_13_0 != 0;
            }
          }
        }
    }

    public static void i(int param0) {
        java.applet.Applet var2;
        if (param0 != -1) {
          var2 = (java.applet.Applet) null;
          ff.a(121, (String) null, (java.applet.Applet) null);
          field_O = null;
          field_R = null;
          field_K = null;
          field_N = null;
          field_Q = (he[][]) null;
          field_P = null;
          return;
        } else {
          field_O = null;
          field_R = null;
          field_K = null;
          field_N = null;
          field_Q = (he[][]) null;
          field_P = null;
          return;
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            java.net.URL var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            int var4 = 0;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            StringBuilder stackIn_9_1 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  var3 = new java.net.URL(param2.getCodeBase(), param1);
                  var3 = kk.a(var3, param2, 4767999);
                  wa.a(var3.toString(), true, param2, (byte) 9);
                  var4 = 4 % ((param0 - 33) / 48);
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3_ref = (Exception) (Object) decompiledCaughtException;
                var3_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L1: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var3_ref2);

                stackIn_6_1 = new StringBuilder().append("ff.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L1;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L1;
                }
              }
              L2: {


                stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

                if (param2 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_K = "Cancel";
        field_O = new vd();
        field_N = new double[]{0.0, 5.0, 8.0, 10.0, 10.0, 1.5, 0.0, 5.0, 4.5, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 3.0, 3.0, 1.5, 1.5, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 5.0, 5.0, 8.0, 3.5, 5.0, 2.5, 0.0, 0.0, 0.0, 0.0, 8.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        field_Q = new he[77][];
    }
}
