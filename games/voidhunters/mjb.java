/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mjb extends aja {
    private boolean field_k;
    private eb field_o;
    private int field_l;
    static dja field_c;
    private boolean field_j;
    private int field_m;
    static boolean field_e;
    private boolean field_b;
    private int field_n;
    private int field_f;
    private int field_d;
    private boolean field_i;
    private pf field_h;
    private int field_g;
    private boolean field_a;

    final int b() {
        return ((mjb) this).field_m + ((mjb) this).field_n - -((mjb) this).field_g;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -79) {
            mjb.a(9);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        oj var10 = null;
        oj var11 = null;
        eb stackIn_1_0 = null;
        eb stackIn_2_0 = null;
        eb stackIn_3_0 = null;
        eb stackIn_4_0 = null;
        eb stackIn_5_0 = null;
        eb stackIn_6_0 = null;
        tu stackIn_6_1 = null;
        eb stackOut_0_0 = null;
        eb stackOut_1_0 = null;
        eb stackOut_2_0 = null;
        eb stackOut_5_0 = null;
        tu stackOut_5_1 = null;
        eb stackOut_3_0 = null;
        eb stackOut_4_0 = null;
        tu stackOut_4_1 = null;
        L0: {
          L1: {
            var11 = ((mjb) this).field_h.A(11);
            var10 = ((mjb) this).field_h.H((byte) -119);
            stackOut_0_0 = ((mjb) this).field_o;
            stackIn_4_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((mjb) this).field_j) {
              break L1;
            } else {
              stackOut_1_0 = (eb) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((mjb) this).field_i) {
                break L1;
              } else {
                stackOut_2_0 = (eb) (Object) stackIn_2_0;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if ((1 & param7) != 0) {
                  stackOut_5_0 = (eb) (Object) stackIn_5_0;
                  stackOut_5_1 = cs.field_a;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L0;
                } else {
                  stackOut_3_0 = (eb) (Object) stackIn_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  break L1;
                }
              }
            }
          }
          stackOut_4_0 = (eb) (Object) stackIn_4_0;
          stackOut_4_1 = jd.field_o;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          break L0;
        }
        L2: {
          ((eb) (Object) stackIn_6_0).a(stackIn_6_1, -28798);
          ((mjb) this).field_h.E((byte) 111);
          ((mjb) this).field_h.a((ura) (Object) ((mjb) this).field_o, -109);
          ((mjb) this).field_h.c(124, param6);
          ((mjb) this).field_h.h(-117, param4);
          ((mjb) this).field_h.a(1, pea.field_d, 7);
          ((mjb) this).field_h.a(1, (byte) -97, pea.field_d);
          ((mjb) this).field_h.e(-127, param5);
          var10.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 106), 1.0f);
          if (!((mjb) this).field_k) {
            break L2;
          } else {
            param2 = ((mjb) this).field_d * param2 / ((mjb) this).c();
            param3 = ((mjb) this).field_n * param3 / ((mjb) this).b();
            param0 = param0 + ((mjb) this).field_l * param2 / ((mjb) this).field_d;
            param1 = param1 + param3 * ((mjb) this).field_m / ((mjb) this).field_n;
            break L2;
          }
        }
        var11.a(5557, (float)param2, (float)param3, 0.0f);
        var11.a(param1, 16383, 0, param0);
        ((mjb) this).field_h.a(vf.field_a, true);
        ((mjb) this).field_h.h(20837);
        ((mjb) this).field_h.r((byte) -79);
        ((mjb) this).field_h.F((byte) 74);
        ((mjb) this).field_h.a(1, pja.field_l, 7);
        ((mjb) this).field_h.a(1, (byte) -55, pja.field_l);
    }

    final static int b(int param0, int param1) {
        if (param0 != 21957) {
            return -115;
        }
        if ((param1 ^ -1) <= -1) {
            if (!(param1 > 1)) {
                return -param1 + 1;
            }
        }
        return param1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        oj var8 = ((mjb) this).field_h.A(11);
        oj var7 = ((mjb) this).field_h.H((byte) 124);
        param1 = param1 + ((mjb) this).field_m;
        param0 = param0 + ((mjb) this).field_l;
        ((mjb) this).field_o.a(jd.field_o, -28798);
        ((mjb) this).field_h.E((byte) 111);
        ((mjb) this).field_h.a((ura) (Object) ((mjb) this).field_o, -123);
        ((mjb) this).field_h.c(121, param4);
        ((mjb) this).field_h.h(107, param2);
        ((mjb) this).field_h.a(1, pea.field_d, 7);
        ((mjb) this).field_h.a(1, (byte) -54, pea.field_d);
        ((mjb) this).field_h.e(-127, param3);
        var8.a(5557, (float)((mjb) this).field_d, (float)((mjb) this).field_n, 0.0f);
        var8.a(param1, 16383, 0, param0);
        var7.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 117), 1.0f);
        ((mjb) this).field_h.a(vf.field_a, true);
        ((mjb) this).field_h.h(20837);
        ((mjb) this).field_h.r((byte) -72);
        ((mjb) this).field_h.F((byte) 85);
        ((mjb) this).field_h.a(1, pja.field_l, 7);
        ((mjb) this).field_h.a(1, (byte) -72, pja.field_l);
    }

    final int c() {
        return ((mjb) this).field_f + (((mjb) this).field_d + ((mjb) this).field_l);
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        oj var12 = null;
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
        oj var27 = null;
        eb stackIn_1_0 = null;
        eb stackIn_2_0 = null;
        eb stackIn_3_0 = null;
        eb stackIn_4_0 = null;
        eb stackIn_5_0 = null;
        tu stackIn_5_1 = null;
        eb stackOut_0_0 = null;
        eb stackOut_1_0 = null;
        eb stackOut_2_0 = null;
        eb stackOut_3_0 = null;
        tu stackOut_3_1 = null;
        eb stackOut_4_0 = null;
        tu stackOut_4_1 = null;
        L0: {
          L1: {
            var27 = ((mjb) this).field_h.A(11);
            var12 = ((mjb) this).field_h.H((byte) 81);
            stackOut_0_0 = ((mjb) this).field_o;
            stackIn_4_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((mjb) this).field_j) {
              break L1;
            } else {
              stackOut_1_0 = (eb) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((mjb) this).field_i) {
                break L1;
              } else {
                stackOut_2_0 = (eb) (Object) stackIn_2_0;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if ((param9 & 1 ^ -1) == -1) {
                  break L1;
                } else {
                  stackOut_3_0 = (eb) (Object) stackIn_3_0;
                  stackOut_3_1 = cs.field_a;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = (eb) (Object) stackIn_4_0;
          stackOut_4_1 = jd.field_o;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          break L0;
        }
        L2: {
          ((eb) (Object) stackIn_5_0).a(stackIn_5_1, -28798);
          ((mjb) this).field_h.E((byte) 111);
          ((mjb) this).field_h.a((ura) (Object) ((mjb) this).field_o, -122);
          ((mjb) this).field_h.c(54, param8);
          ((mjb) this).field_h.h(13, param6);
          ((mjb) this).field_h.a(1, pea.field_d, 7);
          ((mjb) this).field_h.a(1, (byte) -121, pea.field_d);
          ((mjb) this).field_h.e(-126, param7);
          if (((mjb) this).field_k) {
            var13 = (float)((mjb) this).c();
            var14 = (float)((mjb) this).b();
            var15 = (-param0 + param2) / var13;
            var16 = (param3 - param1) / var13;
            var17 = (-param0 + param4) / var14;
            var18 = (-param1 + param5) / var14;
            var19 = var17 * (float)((mjb) this).field_m;
            var20 = var18 * (float)((mjb) this).field_m;
            var21 = (float)((mjb) this).field_l * var15;
            var22 = var16 * (float)((mjb) this).field_l;
            var23 = (float)((mjb) this).field_f * -var15;
            var24 = (float)((mjb) this).field_f * -var16;
            var25 = (float)((mjb) this).field_g * -var17;
            param1 = var20 + (var22 + param1);
            param2 = param2 + var23 + var19;
            param3 = var24 + param3 + var20;
            param4 = var21 + param4 + var25;
            var26 = -var18 * (float)((mjb) this).field_g;
            param0 = var19 + (var21 + param0);
            param5 = var26 + (param5 + var22);
            break L2;
          } else {
            break L2;
          }
        }
        var27.a(0.0f, 0.0f, (byte) 101, param2 - param0, 0.0f, 0.0f, -param1 + param5, param3 - param1, 1.0f, -param0 + param4);
        var27.a(0.0f, param0, param1, (byte) 13);
        var12.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 110), 1.0f);
        ((mjb) this).field_h.a(vf.field_a, true);
        ((mjb) this).field_h.h(20837);
        ((mjb) this).field_h.r((byte) -102);
        ((mjb) this).field_h.F((byte) 72);
        ((mjb) this).field_h.a(1, pja.field_l, 7);
        ((mjb) this).field_h.a(1, (byte) -123, pja.field_l);
    }

    final int a() {
        return ((mjb) this).field_n;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        oj var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        oj var23 = null;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          L1: {
            var22 = VoidHunters.field_G;
            var23 = ((mjb) this).field_h.A(11);
            var9 = ((mjb) this).field_h.H((byte) -122);
            ((mjb) this).field_o.a(jd.field_o, -28798);
            ((mjb) this).field_h.E((byte) 111);
            ((mjb) this).field_h.a((ura) (Object) ((mjb) this).field_o, -119);
            ((mjb) this).field_h.c(75, param6);
            ((mjb) this).field_h.h(-124, param4);
            ((mjb) this).field_h.a(1, pea.field_d, 7);
            ((mjb) this).field_h.a(1, (byte) -98, pea.field_d);
            ((mjb) this).field_h.e(-123, param5);
            if (!((mjb) this).field_a) {
              break L1;
            } else {
              if (0 != ((mjb) this).field_m) {
                break L1;
              } else {
                if (-1 != (((mjb) this).field_g ^ -1)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        L2: {
          L3: {
            var10 = stackIn_5_0;
            if (!((mjb) this).field_b) {
              break L3;
            } else {
              if (-1 != (((mjb) this).field_l ^ -1)) {
                break L3;
              } else {
                if (-1 != (((mjb) this).field_f ^ -1)) {
                  break L3;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
            }
          }
          stackOut_9_0 = 0;
          stackIn_10_0 = stackOut_9_0;
          break L2;
        }
        L4: {
          L5: {
            var11 = stackIn_10_0;
            if ((var11 & var10) == 0) {
              if (var11 == 0) {
                if (var10 != 0) {
                  var12 = param2 + param0;
                  var13 = ((mjb) this).c();
                  var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)param3, 75), 1.0f);
                  ((mjb) this).field_h.a(vf.field_a, true);
                  var14 = ((mjb) this).field_l + param0;
                  var15 = ((mjb) this).field_d + var14;
                  L6: while (true) {
                    if (var12 < var15) {
                      if ((var12 ^ -1) < (var14 ^ -1)) {
                        var16 = -var14 + var12;
                        var9.a(5557, ((mjb) this).field_o.a((float)var16, -1080), ((mjb) this).field_o.b((float)param3, 121), 1.0f);
                        ((mjb) this).field_h.a(vf.field_a, true);
                        var23.a(5557, (float)var16, (float)param3, 0.0f);
                        var23.a(param1, 16383, 0, var14);
                        ((mjb) this).field_h.h(20837);
                        ((mjb) this).field_h.r((byte) -89);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      var23.a(5557, (float)((mjb) this).field_d, (float)param3, 0.0f);
                      var23.a(param1, 16383, 0, var14);
                      ((mjb) this).field_h.h(20837);
                      ((mjb) this).field_h.r((byte) -91);
                      var15 = var15 + var13;
                      var14 = var14 + var13;
                      continue L6;
                    }
                  }
                } else {
                  var12 = param1 + param3;
                  var13 = param2 + param0;
                  var14 = ((mjb) this).c();
                  var15 = ((mjb) this).b();
                  var16 = ((mjb) this).field_m + param1;
                  var17 = ((mjb) this).field_n + var16;
                  L7: while (true) {
                    if ((var17 ^ -1) < (var12 ^ -1)) {
                      L8: {
                        if (var12 <= var16) {
                          break L8;
                        } else {
                          var18 = -var16 + var12;
                          var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)var18, 104), 1.0f);
                          ((mjb) this).field_h.a(vf.field_a, true);
                          var19 = ((mjb) this).field_l + param0;
                          var20 = var19 + ((mjb) this).field_d;
                          L9: while (true) {
                            if ((var13 ^ -1) > (var20 ^ -1)) {
                              if ((var13 ^ -1) < (var19 ^ -1)) {
                                var21 = -var19 + var13;
                                var9.a(5557, ((mjb) this).field_o.a((float)var21, -1080), ((mjb) this).field_o.b((float)var18, 92), 1.0f);
                                ((mjb) this).field_h.a(vf.field_a, true);
                                var23.a(5557, (float)var21, (float)var18, 0.0f);
                                var23.a(var16, 16383, 0, var19);
                                ((mjb) this).field_h.h(20837);
                                ((mjb) this).field_h.r((byte) -80);
                                break L8;
                              } else {
                                ((mjb) this).field_h.F((byte) 125);
                                ((mjb) this).field_h.a(1, pja.field_l, 7);
                                ((mjb) this).field_h.a(1, (byte) -101, pja.field_l);
                                break L4;
                              }
                            } else {
                              var23.a(5557, (float)((mjb) this).field_d, (float)var18, 0.0f);
                              var23.a(var16, 16383, 0, var19);
                              ((mjb) this).field_h.h(20837);
                              var19 = var19 + var14;
                              ((mjb) this).field_h.r((byte) -109);
                              var20 = var20 + var14;
                              continue L9;
                            }
                          }
                        }
                      }
                      break L5;
                    } else {
                      var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 107), 1.0f);
                      ((mjb) this).field_h.a(vf.field_a, true);
                      var18 = param0 - -((mjb) this).field_l;
                      var19 = ((mjb) this).field_d + var18;
                      L10: while (true) {
                        if (var19 > var13) {
                          L11: {
                            if ((var13 ^ -1) < (var18 ^ -1)) {
                              var20 = -var18 + var13;
                              var9.a(5557, ((mjb) this).field_o.a((float)var20, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 78), 1.0f);
                              ((mjb) this).field_h.a(vf.field_a, true);
                              var23.a(5557, (float)var20, (float)((mjb) this).field_n, 0.0f);
                              var23.a(var16, 16383, 0, var18);
                              ((mjb) this).field_h.h(20837);
                              ((mjb) this).field_h.r((byte) -90);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          var16 = var16 + var15;
                          var17 = var17 + var15;
                          continue L7;
                        } else {
                          var23.a(5557, (float)((mjb) this).field_d, (float)((mjb) this).field_n, 0.0f);
                          var23.a(var16, 16383, 0, var18);
                          ((mjb) this).field_h.h(20837);
                          var19 = var19 + var14;
                          var18 = var18 + var14;
                          ((mjb) this).field_h.r((byte) -82);
                          continue L10;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = param3 + param1;
                var13 = ((mjb) this).b();
                var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 91), 1.0f);
                ((mjb) this).field_h.a(vf.field_a, true);
                var14 = param1 - -((mjb) this).field_m;
                var15 = var14 + ((mjb) this).field_n;
                L12: while (true) {
                  if ((var15 ^ -1) < (var12 ^ -1)) {
                    L13: {
                      if ((var12 ^ -1) >= (var14 ^ -1)) {
                        break L13;
                      } else {
                        var16 = var12 - var14;
                        var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)var16, 90), 1.0f);
                        ((mjb) this).field_h.a(vf.field_a, true);
                        var23.a(5557, (float)param2, (float)var16, 0.0f);
                        var23.a(var14, 16383, 0, param0);
                        ((mjb) this).field_h.h(20837);
                        ((mjb) this).field_h.r((byte) -81);
                        break L13;
                      }
                    }
                    break L5;
                  } else {
                    var23.a(5557, (float)param2, (float)((mjb) this).field_n, 0.0f);
                    var23.a(var14, 16383, 0, param0);
                    ((mjb) this).field_h.h(20837);
                    ((mjb) this).field_h.r((byte) -87);
                    var14 = var14 + var13;
                    var15 = var15 + var13;
                    continue L12;
                  }
                }
              }
            } else {
              var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)param3, 88), 1.0f);
              var23.a(5557, (float)param2, (float)param3, 0.0f);
              var23.a(param1, 16383, 0, param0);
              ((mjb) this).field_h.a(vf.field_a, true);
              ((mjb) this).field_h.h(20837);
              ((mjb) this).field_h.r((byte) -66);
              break L5;
            }
          }
          ((mjb) this).field_h.F((byte) 125);
          ((mjb) this).field_h.a(1, pja.field_l, 7);
          ((mjb) this).field_h.a(1, (byte) -101, pja.field_l);
          break L4;
        }
    }

    final static void a(byte param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.field_e = var2.field_e + 1;
        int var3 = var2.field_e;
        if (param0 <= 93) {
            field_c = null;
        }
        var2.c(0, 2);
        var2.a(0, ce.field_o, -1, ce.field_o.length);
        var2.c(0, imb.field_a);
        var2.c(0, qd.field_d);
        var2.a(0, nkb.field_p, -1, nkb.field_p.length);
        var2.e(-var3 + var2.field_e, -129);
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          L1: {
            ((mjb) this).field_m = param1;
            ((mjb) this).field_l = param0;
            ((mjb) this).field_g = param3;
            ((mjb) this).field_f = param2;
            stackOut_0_0 = this;
            stackIn_5_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (((mjb) this).field_l != 0) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackIn_5_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (0 != ((mjb) this).field_m) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (0 != ((mjb) this).field_f) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (((mjb) this).field_g == 0) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_5_0 = this;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L0;
        }
        ((mjb) this).field_k = stackIn_7_1 != 0;
    }

    final int d() {
        return ((mjb) this).field_d;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        ((mjb) this).field_o.a(param1, param3, param2, param5, param6, param4, param0, (byte) -101);
    }

    mjb(pf param0, int param1, int param2, boolean param3) {
        Object stackIn_1_0 = null;
        pf stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        int stackIn_1_4 = 0;
        Object stackIn_2_0 = null;
        pf stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_2_4 = 0;
        Object stackIn_3_0 = null;
        pf stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        kb stackIn_3_5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackOut_0_0 = null;
        pf stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        int stackOut_0_4 = 0;
        Object stackOut_2_0 = null;
        pf stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        kb stackOut_2_5 = null;
        Object stackOut_1_0 = null;
        pf stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        kb stackOut_1_5 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          ((mjb) this).field_m = 0;
          ((mjb) this).field_k = false;
          ((mjb) this).field_f = 0;
          ((mjb) this).field_l = 0;
          ((mjb) this).field_g = 0;
          ((mjb) this).field_n = param2;
          ((mjb) this).field_d = param1;
          ((mjb) this).field_h = param0;
          stackOut_0_0 = this;
          stackOut_0_1 = (pf) param0;
          stackOut_0_2 = 118;
          stackOut_0_3 = param1;
          stackOut_0_4 = param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          if (param3) {
            stackOut_2_0 = this;
            stackOut_2_1 = (pf) (Object) stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = stackIn_2_4;
            stackOut_2_5 = qua.field_d;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = (pf) (Object) stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = stackIn_1_4;
            stackOut_1_5 = ep.field_o;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            break L0;
          }
        }
        L1: {
          ((mjb) this).field_o = ((pf) (Object) stackIn_3_1).a(stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, mj.field_f);
          ((mjb) this).field_o.a(true, (byte) -98, true);
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((param1 ^ -1) == (((mjb) this).field_o.b((byte) 113) ^ -1)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((mjb) this).field_j = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (param2 == ((mjb) this).field_o.a((byte) -55)) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          L4: {
            ((mjb) this).field_i = stackIn_9_1 != 0;
            stackOut_9_0 = this;
            stackIn_12_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (((mjb) this).field_j) {
              break L4;
            } else {
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!((mjb) this).field_o.a(-127)) {
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L3;
              }
            }
          }
          stackOut_12_0 = this;
          stackOut_12_1 = 0;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L3;
        }
        L5: {
          L6: {
            ((mjb) this).field_b = stackIn_13_1 != 0;
            stackOut_13_0 = this;
            stackIn_16_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (((mjb) this).field_i) {
              break L6;
            } else {
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!((mjb) this).field_o.a(36)) {
                break L6;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L5;
              }
            }
          }
          stackOut_16_0 = this;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L5;
        }
        ((mjb) this).field_a = stackIn_17_1 != 0;
    }

    mjb(pf param0, int param1, int param2, int[] param3, int param4, int param5) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((mjb) this).field_m = 0;
          ((mjb) this).field_k = false;
          ((mjb) this).field_f = 0;
          ((mjb) this).field_l = 0;
          ((mjb) this).field_g = 0;
          ((mjb) this).field_n = param2;
          ((mjb) this).field_d = param1;
          ((mjb) this).field_h = param0;
          ((mjb) this).field_o = param0.a(param1, false, param3, param2, param5, true, param4);
          ((mjb) this).field_o.a(true, (byte) -98, true);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (param1 == ((mjb) this).field_o.b((byte) 113)) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((mjb) this).field_j = stackIn_3_1 != 0;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if ((((mjb) this).field_o.a((byte) -57) ^ -1) == (param2 ^ -1)) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          L3: {
            ((mjb) this).field_i = stackIn_6_1 != 0;
            stackOut_6_0 = this;
            stackIn_9_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (((mjb) this).field_j) {
              break L3;
            } else {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!((mjb) this).field_o.a(-13)) {
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L2;
              }
            }
          }
          stackOut_9_0 = this;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L2;
        }
        L4: {
          L5: {
            ((mjb) this).field_b = stackIn_10_1 != 0;
            stackOut_10_0 = this;
            stackIn_13_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (((mjb) this).field_i) {
              break L5;
            } else {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (!((mjb) this).field_o.a(-128)) {
                break L5;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L4;
              }
            }
          }
          stackOut_13_0 = this;
          stackOut_13_1 = 0;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          break L4;
        }
        ((mjb) this).field_a = stackIn_14_1 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = (dja) (Object) new ada();
    }
}
