/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kc extends pl {
    static int field_I;
    static int[] field_G;
    static od field_H;
    static String field_J;
    private int field_K;
    private dk field_F;

    final void a(int param0, int param1, int param2, ub param3) {
        try {
            ((kc) this).field_K = ((kc) this).field_K + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kc.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(boolean param0) {
        if (!(!((kc) this).field_v)) {
            return ((kc) this).field_F.a(-2864);
        }
        if (!param0) {
            return null;
        }
        ((kc) this).field_K = -116;
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        ok var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        o var12 = null;
        o var15 = null;
        o var18 = null;
        o var21 = null;
        var11 = wizardrun.field_H;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        } else {
          var5 = ((kc) this).field_o + param0 + (((kc) this).field_r >> 1);
          var6 = (((kc) this).field_n >> 1) + (param3 - -((kc) this).field_l);
          var8 = ((kc) this).field_F.a(true);
          if (nf.field_c != var8) {
            if (l.field_S != var8) {
              if (hg.field_c != var8) {
                if (gf.field_V != var8) {
                  return;
                } else {
                  var21 = te.field_k[1];
                  var21.a(-(var21.field_z >> 1) + var5, var6 - (var21.field_p >> 1), 256);
                  return;
                }
              } else {
                var12 = te.field_k[2];
                var12.a(-(var12.field_z >> 1) + var5, -(var12.field_p >> 1) + var6, 256);
                return;
              }
            } else {
              var18 = te.field_k[0];
              var9 = var18.field_x << 1;
              var10 = var18.field_s << 1;
              if (null != ue.field_d) {
                if (ue.field_d.field_z >= var9) {
                  if (ue.field_d.field_p < var10) {
                    ue.field_d = new o(var9, var10);
                    int discarded$16 = 0;
                    ud.a(ue.field_d);
                    var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -((kc) this).field_K << 10, 4096);
                    int discarded$17 = 4;
                    bb.b();
                    ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                    return;
                  } else {
                    int discarded$18 = 0;
                    ud.a(ue.field_d);
                    ed.d();
                    var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -((kc) this).field_K << 10, 4096);
                    int discarded$19 = 4;
                    bb.b();
                    ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                    return;
                  }
                } else {
                  ue.field_d = new o(var9, var10);
                  int discarded$20 = 0;
                  ud.a(ue.field_d);
                  var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -((kc) this).field_K << 10, 4096);
                  int discarded$21 = 4;
                  bb.b();
                  ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                  return;
                }
              } else {
                ue.field_d = new o(var9, var10);
                int discarded$22 = 0;
                ud.a(ue.field_d);
                var18.b(112, 144, var18.field_x << 4, var18.field_s << 4, -((kc) this).field_K << 10, 4096);
                int discarded$23 = 4;
                bb.b();
                ue.field_d.a(var5 - var18.field_x, var6 - var18.field_s, 256);
                return;
              }
            }
          } else {
            var15 = te.field_k[0];
            var9 = var15.field_x << 1;
            var10 = var15.field_s << 1;
            if (null != ue.field_d) {
              if (ue.field_d.field_z >= var9) {
                if (ue.field_d.field_p < var10) {
                  ue.field_d = new o(var9, var10);
                  int discarded$24 = 0;
                  ud.a(ue.field_d);
                  var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -((kc) this).field_K << 10, 4096);
                  int discarded$25 = 4;
                  bb.b();
                  ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                  return;
                } else {
                  int discarded$26 = 0;
                  ud.a(ue.field_d);
                  ed.d();
                  var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -((kc) this).field_K << 10, 4096);
                  int discarded$27 = 4;
                  bb.b();
                  ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                  return;
                }
              } else {
                ue.field_d = new o(var9, var10);
                int discarded$28 = 0;
                ud.a(ue.field_d);
                var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -((kc) this).field_K << 10, 4096);
                int discarded$29 = 4;
                bb.b();
                ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
                return;
              }
            } else {
              ue.field_d = new o(var9, var10);
              int discarded$30 = 0;
              ud.a(ue.field_d);
              var15.b(112, 144, var15.field_x << 4, var15.field_s << 4, -((kc) this).field_K << 10, 4096);
              int discarded$31 = 4;
              bb.b();
              ue.field_d.a(var5 - var15.field_x, var6 - var15.field_s, 256);
              return;
            }
          }
        }
    }

    final boolean a(ub param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 8) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("kc.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    public static void d() {
        field_G = null;
        field_J = null;
        field_H = null;
    }

    kc(dk param0) {
        try {
            ((kc) this).field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Names should contain a maximum of 12 characters";
        field_G = new int[256];
    }
}
