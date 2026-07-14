/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp extends pa {
    private boolean field_f;
    private int field_d;
    private int field_b;
    private int field_a;
    private int field_h;
    private int field_k;
    private bf field_e;
    private boolean field_i;
    private int field_l;
    private boolean field_j;
    private qi field_g;
    static String field_m;
    static String field_c;

    public static void a(int param0) {
        if (param0 != 16523) {
            rp.b(89);
            field_c = null;
            field_m = null;
            return;
        }
        field_c = null;
        field_m = null;
    }

    final int c() {
        return ((rp) this).field_b + ((rp) this).field_h + ((rp) this).field_l;
    }

    final static void b(int param0) {
        if (param0 == 1) {
          if (it.field_c != -la.field_k + 0) {
            if (250 - la.field_k != it.field_c) {
              it.field_c = it.field_c + 1;
              return;
            } else {
              it.field_c = it.field_c + 1;
              return;
            }
          } else {
            it.field_c = it.field_c + 1;
            return;
          }
        } else {
          field_c = (String) null;
          if (it.field_c != -la.field_k + 0) {
            if (250 - la.field_k != it.field_c) {
              it.field_c = it.field_c + 1;
              return;
            } else {
              it.field_c = it.field_c + 1;
              return;
            }
          } else {
            it.field_c = it.field_c + 1;
            return;
          }
        }
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        ec var12 = null;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var25 = 0.0f;
        float var26 = 0.0f;
        ec var27 = null;
        qi stackIn_1_0 = null;
        qi stackIn_4_0 = null;
        qi stackIn_5_0 = null;
        qi stackIn_8_0 = null;
        qi stackIn_9_0 = null;
        qi stackIn_12_0 = null;
        qi stackOut_0_0 = null;
        qi stackOut_4_0 = null;
        qi stackOut_8_0 = null;
        var27 = ((rp) this).field_e.y(-125);
        var12 = ((rp) this).field_e.d(12343);
        stackOut_0_0 = ((rp) this).field_g;
        stackIn_4_0 = stackOut_0_0;
        stackIn_1_0 = stackOut_0_0;
        if (!((rp) this).field_f) {
          stackOut_4_0 = (qi) (Object) stackIn_4_0;
          stackIn_8_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (!((rp) this).field_i) {
            stackOut_8_0 = (qi) (Object) stackIn_8_0;
            stackIn_12_0 = stackOut_8_0;
            stackIn_9_0 = stackOut_8_0;
            if (-1 != (1 & param9 ^ -1)) {
              L0: {
                ((qi) (Object) stackIn_12_0).a(fg.field_A, -31662);
                ((rp) this).field_e.r((byte) 112);
                ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
                ((rp) this).field_e.e(true, param8);
                ((rp) this).field_e.b(param6, false);
                ((rp) this).field_e.a((byte) 124, 1, bs.field_a);
                ((rp) this).field_e.a(bs.field_a, 1, 0);
                ((rp) this).field_e.a((byte) -74, param7);
                if (!((rp) this).field_j) {
                  break L0;
                } else {
                  var13 = (float)((rp) this).d();
                  var14 = (float)((rp) this).c();
                  var15 = (param2 - param0) / var13;
                  var16 = (-param1 + param3) / var13;
                  var17 = (-param0 + param4) / var14;
                  var18 = (param5 - param1) / var14;
                  var19 = var17 * (float)((rp) this).field_h;
                  var20 = (float)((rp) this).field_h * var18;
                  var21 = var15 * (float)((rp) this).field_a;
                  var22 = (float)((rp) this).field_a * var16;
                  var23 = -var15 * (float)((rp) this).field_d;
                  var24 = -var16 * (float)((rp) this).field_d;
                  var25 = (float)((rp) this).field_b * -var17;
                  param1 = var20 + (var22 + param1);
                  param4 = var25 + (param4 + var21);
                  param0 = var21 + param0 + var19;
                  param2 = var23 + param2 + var19;
                  var26 = -var18 * (float)((rp) this).field_b;
                  param3 = param3 + var24 + var20;
                  param5 = var22 + param5 + var26;
                  break L0;
                }
              }
              var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
              var27.b(param1, (byte) -128, 0.0f, param0);
              var12.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(112, (float)((rp) this).field_k), 1.0f, 32);
              ((rp) this).field_e.a(tr.field_a, (byte) 103);
              ((rp) this).field_e.q((byte) 83);
              ((rp) this).field_e.s(2);
              ((rp) this).field_e.f(-21041);
              ((rp) this).field_e.a((byte) 118, 1, un.field_i);
              ((rp) this).field_e.a(un.field_i, 1, 0);
              return;
            } else {
              L1: {
                ((qi) (Object) stackIn_9_0).a(jp.field_a, -31662);
                ((rp) this).field_e.r((byte) 112);
                ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
                ((rp) this).field_e.e(true, param8);
                ((rp) this).field_e.b(param6, false);
                ((rp) this).field_e.a((byte) 124, 1, bs.field_a);
                ((rp) this).field_e.a(bs.field_a, 1, 0);
                ((rp) this).field_e.a((byte) -74, param7);
                if (!((rp) this).field_j) {
                  break L1;
                } else {
                  var13 = (float)((rp) this).d();
                  var14 = (float)((rp) this).c();
                  var15 = (param2 - param0) / var13;
                  var16 = (-param1 + param3) / var13;
                  var17 = (-param0 + param4) / var14;
                  var18 = (param5 - param1) / var14;
                  var19 = var17 * (float)((rp) this).field_h;
                  var20 = (float)((rp) this).field_h * var18;
                  var21 = var15 * (float)((rp) this).field_a;
                  var22 = (float)((rp) this).field_a * var16;
                  var23 = -var15 * (float)((rp) this).field_d;
                  var24 = -var16 * (float)((rp) this).field_d;
                  var25 = (float)((rp) this).field_b * -var17;
                  param1 = var20 + (var22 + param1);
                  param4 = var25 + (param4 + var21);
                  param0 = var21 + param0 + var19;
                  param2 = var23 + param2 + var19;
                  var26 = -var18 * (float)((rp) this).field_b;
                  param3 = param3 + var24 + var20;
                  param5 = var22 + param5 + var26;
                  break L1;
                }
              }
              var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
              var27.b(param1, (byte) -128, 0.0f, param0);
              var12.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(112, (float)((rp) this).field_k), 1.0f, 32);
              ((rp) this).field_e.a(tr.field_a, (byte) 103);
              ((rp) this).field_e.q((byte) 83);
              ((rp) this).field_e.s(2);
              ((rp) this).field_e.f(-21041);
              ((rp) this).field_e.a((byte) 118, 1, un.field_i);
              ((rp) this).field_e.a(un.field_i, 1, 0);
              return;
            }
          } else {
            L2: {
              ((qi) (Object) stackIn_5_0).a(jp.field_a, -31662);
              ((rp) this).field_e.r((byte) 112);
              ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
              ((rp) this).field_e.e(true, param8);
              ((rp) this).field_e.b(param6, false);
              ((rp) this).field_e.a((byte) 124, 1, bs.field_a);
              ((rp) this).field_e.a(bs.field_a, 1, 0);
              ((rp) this).field_e.a((byte) -74, param7);
              if (!((rp) this).field_j) {
                break L2;
              } else {
                var13 = (float)((rp) this).d();
                var14 = (float)((rp) this).c();
                var15 = (param2 - param0) / var13;
                var16 = (-param1 + param3) / var13;
                var17 = (-param0 + param4) / var14;
                var18 = (param5 - param1) / var14;
                var19 = var17 * (float)((rp) this).field_h;
                var20 = (float)((rp) this).field_h * var18;
                var21 = var15 * (float)((rp) this).field_a;
                var22 = (float)((rp) this).field_a * var16;
                var23 = -var15 * (float)((rp) this).field_d;
                var24 = -var16 * (float)((rp) this).field_d;
                var25 = (float)((rp) this).field_b * -var17;
                param1 = var20 + (var22 + param1);
                param4 = var25 + (param4 + var21);
                param0 = var21 + param0 + var19;
                param2 = var23 + param2 + var19;
                var26 = -var18 * (float)((rp) this).field_b;
                param3 = param3 + var24 + var20;
                param5 = var22 + param5 + var26;
                break L2;
              }
            }
            var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
            var27.b(param1, (byte) -128, 0.0f, param0);
            var12.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(112, (float)((rp) this).field_k), 1.0f, 32);
            ((rp) this).field_e.a(tr.field_a, (byte) 103);
            ((rp) this).field_e.q((byte) 83);
            ((rp) this).field_e.s(2);
            ((rp) this).field_e.f(-21041);
            ((rp) this).field_e.a((byte) 118, 1, un.field_i);
            ((rp) this).field_e.a(un.field_i, 1, 0);
            return;
          }
        } else {
          L3: {
            ((qi) (Object) stackIn_1_0).a(jp.field_a, -31662);
            ((rp) this).field_e.r((byte) 112);
            ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
            ((rp) this).field_e.e(true, param8);
            ((rp) this).field_e.b(param6, false);
            ((rp) this).field_e.a((byte) 124, 1, bs.field_a);
            ((rp) this).field_e.a(bs.field_a, 1, 0);
            ((rp) this).field_e.a((byte) -74, param7);
            if (!((rp) this).field_j) {
              break L3;
            } else {
              var13 = (float)((rp) this).d();
              var14 = (float)((rp) this).c();
              var15 = (param2 - param0) / var13;
              var16 = (-param1 + param3) / var13;
              var17 = (-param0 + param4) / var14;
              var18 = (param5 - param1) / var14;
              var19 = var17 * (float)((rp) this).field_h;
              var20 = (float)((rp) this).field_h * var18;
              var21 = var15 * (float)((rp) this).field_a;
              var22 = (float)((rp) this).field_a * var16;
              var23 = -var15 * (float)((rp) this).field_d;
              var24 = -var16 * (float)((rp) this).field_d;
              var25 = (float)((rp) this).field_b * -var17;
              param1 = var20 + (var22 + param1);
              param4 = var25 + (param4 + var21);
              param0 = var21 + param0 + var19;
              param2 = var23 + param2 + var19;
              var26 = -var18 * (float)((rp) this).field_b;
              param3 = param3 + var24 + var20;
              param5 = var22 + param5 + var26;
              break L3;
            }
          }
          var27.a(-9596, 0.0f, -param0 + param4, 1.0f, -param0 + param2, 0.0f, 0.0f, -param1 + param5, 0.0f, param3 - param1);
          var27.b(param1, (byte) -128, 0.0f, param0);
          var12.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(112, (float)((rp) this).field_k), 1.0f, 32);
          ((rp) this).field_e.a(tr.field_a, (byte) 103);
          ((rp) this).field_e.q((byte) 83);
          ((rp) this).field_e.s(2);
          ((rp) this).field_e.f(-21041);
          ((rp) this).field_e.a((byte) 118, 1, un.field_i);
          ((rp) this).field_e.a(un.field_i, 1, 0);
          return;
        }
    }

    final int b() {
        return ((rp) this).field_l;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ec var10 = null;
        ec var11 = null;
        qi stackIn_1_0 = null;
        qi stackIn_2_0 = null;
        qi stackIn_3_0 = null;
        qi stackIn_4_0 = null;
        qi stackIn_5_0 = null;
        ke stackIn_5_1 = null;
        qi stackOut_0_0 = null;
        qi stackOut_1_0 = null;
        qi stackOut_2_0 = null;
        qi stackOut_3_0 = null;
        ke stackOut_3_1 = null;
        qi stackOut_4_0 = null;
        ke stackOut_4_1 = null;
        L0: {
          L1: {
            var11 = ((rp) this).field_e.y(-118);
            var10 = ((rp) this).field_e.d(12343);
            stackOut_0_0 = ((rp) this).field_g;
            stackIn_4_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((rp) this).field_f) {
              break L1;
            } else {
              stackOut_1_0 = (qi) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((rp) this).field_i) {
                break L1;
              } else {
                stackOut_2_0 = (qi) (Object) stackIn_2_0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (-1 == (param7 & 1 ^ -1)) {
                  break L1;
                } else {
                  stackOut_3_0 = (qi) (Object) stackIn_3_0;
                  stackOut_3_1 = fg.field_A;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = (qi) (Object) stackIn_4_0;
          stackOut_4_1 = jp.field_a;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          break L0;
        }
        L2: {
          ((qi) (Object) stackIn_5_0).a((ke) (Object) stackIn_5_1, -31662);
          ((rp) this).field_e.r((byte) 107);
          ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
          ((rp) this).field_e.e(true, param6);
          ((rp) this).field_e.b(param4, false);
          ((rp) this).field_e.a((byte) 124, 1, bs.field_a);
          ((rp) this).field_e.a(bs.field_a, 1, 0);
          ((rp) this).field_e.a((byte) -74, param5);
          var10.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(84, (float)((rp) this).field_k), 1.0f, -82);
          if (((rp) this).field_j) {
            param2 = param2 * ((rp) this).field_k / ((rp) this).d();
            param3 = param3 * ((rp) this).field_l / ((rp) this).c();
            param0 = param0 + ((rp) this).field_a * param2 / ((rp) this).field_k;
            param1 = param1 + ((rp) this).field_h * param3 / ((rp) this).field_l;
            break L2;
          } else {
            break L2;
          }
        }
        var11.b((float)param3, (float)param2, 0.0f, 68);
        var11.a(param1, param0, 0, -120);
        ((rp) this).field_e.a(tr.field_a, (byte) -111);
        ((rp) this).field_e.q((byte) 119);
        ((rp) this).field_e.s(2);
        ((rp) this).field_e.f(-21041);
        ((rp) this).field_e.a((byte) 120, 1, un.field_i);
        ((rp) this).field_e.a(un.field_i, 1, 0);
    }

    final int d() {
        return ((rp) this).field_d + (((rp) this).field_a + ((rp) this).field_k);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ec var8 = ((rp) this).field_e.y(-112);
        ec var7 = ((rp) this).field_e.d(12343);
        param1 = param1 + ((rp) this).field_h;
        param0 = param0 + ((rp) this).field_a;
        ((rp) this).field_g.a(jp.field_a, -31662);
        ((rp) this).field_e.r((byte) 117);
        ((rp) this).field_e.a((jj) (Object) ((rp) this).field_g, -9135);
        ((rp) this).field_e.e(true, param4);
        ((rp) this).field_e.b(param2, false);
        ((rp) this).field_e.a((byte) 120, 1, bs.field_a);
        ((rp) this).field_e.a(bs.field_a, 1, 0);
        ((rp) this).field_e.a((byte) -74, param3);
        var8.b((float)((rp) this).field_l, (float)((rp) this).field_k, 0.0f, -83);
        var8.a(param1, param0, 0, 124);
        var7.b(((rp) this).field_g.a((float)((rp) this).field_l, (byte) -32), ((rp) this).field_g.a(118, (float)((rp) this).field_k), 1.0f, -94);
        ((rp) this).field_e.a(tr.field_a, (byte) 55);
        ((rp) this).field_e.q((byte) 73);
        ((rp) this).field_e.s(2);
        ((rp) this).field_e.f(-21041);
        ((rp) this).field_e.a((byte) 126, 1, un.field_i);
        ((rp) this).field_e.a(un.field_i, 1, 0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ((rp) this).field_d = param2;
        ((rp) this).field_b = param3;
        ((rp) this).field_a = param0;
        ((rp) this).field_h = param1;
        stackOut_0_0 = this;
        stackIn_2_0 = stackOut_0_0;
        stackIn_1_0 = stackOut_0_0;
        if (((rp) this).field_a == 0) {
          stackOut_2_0 = this;
          stackIn_4_0 = stackOut_2_0;
          stackIn_3_0 = stackOut_2_0;
          if (((rp) this).field_h == 0) {
            stackOut_4_0 = this;
            stackIn_8_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (((rp) this).field_d == 0) {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (((rp) this).field_b != 0) {
                ((rp) this).field_j = true;
                return;
              } else {
                ((rp) this).field_j = false;
                return;
              }
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              ((rp) this).field_j = stackIn_7_1 != 0;
              return;
            }
          } else {
            ((rp) this).field_j = true;
            return;
          }
        } else {
          ((rp) this).field_j = true;
          return;
        }
    }

    rp(bf param0, int param1, int param2, int[] param3, int param4, int param5) {
        ((rp) this).field_h = 0;
        ((rp) this).field_d = 0;
        ((rp) this).field_b = 0;
        ((rp) this).field_a = 0;
        ((rp) this).field_j = false;
        ((rp) this).field_k = param1;
        ((rp) this).field_l = param2;
        ((rp) this).field_e = param0;
        ((rp) this).field_g = param0.a(param4, true, false, param2, param5, param3, param1);
        ((rp) this).field_g.a(true, true, (byte) -127);
        ((rp) this).field_f = ((rp) this).field_g.a(72) != param1 ? true : false;
        ((rp) this).field_i = param2 != ((rp) this).field_g.b((byte) 87) ? true : false;
        if (!((rp) this).field_f) {
            boolean discarded$0 = ((rp) this).field_g.c((byte) -113);
        }
        if (!((rp) this).field_i) {
            boolean discarded$1 = ((rp) this).field_g.c((byte) -127);
        }
    }

    final int a() {
        return ((rp) this).field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "This entry doesn't match";
    }
}
