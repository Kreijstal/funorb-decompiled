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
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((mjb) this).field_m + ((mjb) this).field_n - -((mjb) this).field_g;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "mjb.J()");
        }
        return stackIn_1_0;
    }

    public static void a(int param0) {
        try {
            field_c = null;
            if (param0 > -79) {
                mjb.a(9);
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "mjb.M(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        oj var9 = null;
        RuntimeException var9_ref = null;
        oj var10 = null;
        eb stackIn_1_0 = null;
        eb stackIn_2_0 = null;
        eb stackIn_4_0 = null;
        eb stackIn_5_0 = null;
        eb stackIn_7_0 = null;
        eb stackIn_9_0 = null;
        eb stackIn_10_0 = null;
        tu stackIn_10_1 = null;
        RuntimeException decompiledCaughtException = null;
        eb stackOut_0_0 = null;
        eb stackOut_1_0 = null;
        eb stackOut_2_0 = null;
        eb stackOut_4_0 = null;
        eb stackOut_9_0 = null;
        tu stackOut_9_1 = null;
        eb stackOut_5_0 = null;
        eb stackOut_7_0 = null;
        tu stackOut_7_1 = null;
        try {
          L0: {
            L1: {
              L2: {
                var9 = ((mjb) this).field_h.A(11);
                var10 = ((mjb) this).field_h.H((byte) -119);
                stackOut_0_0 = ((mjb) this).field_o;
                stackIn_7_0 = stackOut_0_0;
                stackIn_1_0 = stackOut_0_0;
                if (((mjb) this).field_j) {
                  break L2;
                } else {
                  stackOut_1_0 = (eb) (Object) stackIn_1_0;
                  stackIn_7_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (((mjb) this).field_i) {
                    break L2;
                  } else {
                    stackOut_2_0 = (eb) (Object) stackIn_2_0;
                    stackIn_4_0 = stackOut_2_0;
                    stackOut_4_0 = (eb) (Object) stackIn_4_0;
                    stackIn_9_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if ((1 & param7) != 0) {
                      stackOut_9_0 = (eb) (Object) stackIn_9_0;
                      stackOut_9_1 = cs.field_a;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L1;
                    } else {
                      stackOut_5_0 = (eb) (Object) stackIn_5_0;
                      stackIn_7_0 = stackOut_5_0;
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = (eb) (Object) stackIn_7_0;
              stackOut_7_1 = jd.field_o;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              break L1;
            }
            L3: {
              ((eb) (Object) stackIn_10_0).a(stackIn_10_1, -28798);
              ((mjb) this).field_h.E((byte) 111);
              ((mjb) this).field_h.a((ura) (Object) ((mjb) this).field_o, -109);
              ((mjb) this).field_h.c(124, param6);
              ((mjb) this).field_h.h(-117, param4);
              ((mjb) this).field_h.a(1, pea.field_d, 7);
              ((mjb) this).field_h.a(1, (byte) -97, pea.field_d);
              ((mjb) this).field_h.e(-127, param5);
              var10.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 106), 1.0f);
              if (!((mjb) this).field_k) {
                break L3;
              } else {
                param2 = ((mjb) this).field_d * param2 / ((mjb) this).c();
                param3 = ((mjb) this).field_n * param3 / ((mjb) this).b();
                param0 = param0 + ((mjb) this).field_l * param2 / ((mjb) this).field_d;
                param1 = param1 + param3 * ((mjb) this).field_m / ((mjb) this).field_n;
                break L3;
              }
            }
            var9.a(5557, (float)param2, (float)param3, 0.0f);
            var9.a(param1, 16383, 0, param0);
            ((mjb) this).field_h.a(vf.field_a, true);
            ((mjb) this).field_h.h(20837);
            ((mjb) this).field_h.r((byte) -79);
            ((mjb) this).field_h.F((byte) 74);
            ((mjb) this).field_h.a(1, pja.field_l, 7);
            ((mjb) this).field_h.a(1, (byte) -55, pja.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var9_ref, "mjb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static int b(int param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 21957) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param1 <= 1) {
                    stackOut_9_0 = -param1 + 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = param1;
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = -115;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var2, "mjb.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        oj var6 = null;
        RuntimeException var6_ref = null;
        oj var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6 = ((mjb) this).field_h.A(11);
            var7 = ((mjb) this).field_h.H((byte) 124);
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
            var6.a(5557, (float)((mjb) this).field_d, (float)((mjb) this).field_n, 0.0f);
            var6.a(param1, 16383, 0, param0);
            var7.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 117), 1.0f);
            ((mjb) this).field_h.a(vf.field_a, true);
            ((mjb) this).field_h.h(20837);
            ((mjb) this).field_h.r((byte) -72);
            ((mjb) this).field_h.F((byte) 85);
            ((mjb) this).field_h.a(1, pja.field_l, 7);
            ((mjb) this).field_h.a(1, (byte) -72, pja.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var6_ref, "mjb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int c() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((mjb) this).field_f + (((mjb) this).field_d + ((mjb) this).field_l);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "mjb.G()");
        }
        return stackIn_1_0;
    }

    final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9) {
        oj var11 = null;
        RuntimeException var11_ref = null;
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
        eb stackIn_1_0 = null;
        eb stackIn_2_0 = null;
        eb stackIn_4_0 = null;
        eb stackIn_5_0 = null;
        eb stackIn_7_0 = null;
        eb stackIn_9_0 = null;
        eb stackIn_10_0 = null;
        tu stackIn_10_1 = null;
        RuntimeException decompiledCaughtException = null;
        eb stackOut_0_0 = null;
        eb stackOut_1_0 = null;
        eb stackOut_2_0 = null;
        eb stackOut_4_0 = null;
        eb stackOut_5_0 = null;
        eb stackOut_7_0 = null;
        tu stackOut_7_1 = null;
        eb stackOut_9_0 = null;
        tu stackOut_9_1 = null;
        try {
          L0: {
            L1: {
              L2: {
                var11 = ((mjb) this).field_h.A(11);
                var12 = ((mjb) this).field_h.H((byte) 81);
                stackOut_0_0 = ((mjb) this).field_o;
                stackIn_9_0 = stackOut_0_0;
                stackIn_1_0 = stackOut_0_0;
                if (((mjb) this).field_j) {
                  break L2;
                } else {
                  stackOut_1_0 = (eb) (Object) stackIn_1_0;
                  stackIn_9_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (((mjb) this).field_i) {
                    break L2;
                  } else {
                    stackOut_2_0 = (eb) (Object) stackIn_2_0;
                    stackIn_4_0 = stackOut_2_0;
                    stackOut_4_0 = (eb) (Object) stackIn_4_0;
                    stackIn_9_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if ((param9 & 1) == 0) {
                      break L2;
                    } else {
                      stackOut_5_0 = (eb) (Object) stackIn_5_0;
                      stackIn_7_0 = stackOut_5_0;
                      stackOut_7_0 = (eb) (Object) stackIn_7_0;
                      stackOut_7_1 = cs.field_a;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      break L1;
                    }
                  }
                }
              }
              stackOut_9_0 = (eb) (Object) stackIn_9_0;
              stackOut_9_1 = jd.field_o;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              break L1;
            }
            L3: {
              ((eb) (Object) stackIn_10_0).a(stackIn_10_1, -28798);
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
                break L3;
              } else {
                break L3;
              }
            }
            var11.a(0.0f, 0.0f, (byte) 101, param2 - param0, 0.0f, 0.0f, -param1 + param5, param3 - param1, 1.0f, -param0 + param4);
            var11.a(0.0f, param0, param1, (byte) 13);
            var12.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 110), 1.0f);
            ((mjb) this).field_h.a(vf.field_a, true);
            ((mjb) this).field_h.h(20837);
            ((mjb) this).field_h.r((byte) -102);
            ((mjb) this).field_h.F((byte) 72);
            ((mjb) this).field_h.a(1, pja.field_l, 7);
            ((mjb) this).field_h.a(1, (byte) -123, pja.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11_ref = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var11_ref, "mjb.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((mjb) this).field_n;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "mjb.B()");
        }
        return stackIn_1_0;
    }

    final void b(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        oj var8_ref = null;
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
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_54_0 = 0;
        var22 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              L2: {
                var8_ref = ((mjb) this).field_h.A(11);
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
                  break L2;
                } else {
                  if (0 != ((mjb) this).field_m) {
                    break L2;
                  } else {
                    if (((mjb) this).field_g != 0) {
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L1;
            }
            L3: {
              L4: {
                var10 = stackIn_11_0;
                if (!((mjb) this).field_b) {
                  break L4;
                } else {
                  if (((mjb) this).field_l != 0) {
                    break L4;
                  } else {
                    if (((mjb) this).field_f != 0) {
                      break L4;
                    } else {
                      stackOut_18_0 = 1;
                      stackIn_21_0 = stackOut_18_0;
                      break L3;
                    }
                  }
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L3;
            }
            L5: {
              L6: {
                var11 = stackIn_21_0;
                if ((var11 & var10) == 0) {
                  break L6;
                } else {
                  var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)param3, 88), 1.0f);
                  var8_ref.a(5557, (float)param2, (float)param3, 0.0f);
                  var8_ref.a(param1, 16383, 0, param0);
                  ((mjb) this).field_h.a(vf.field_a, true);
                  ((mjb) this).field_h.h(20837);
                  ((mjb) this).field_h.r((byte) -66);
                  if (var22 == 0) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var11 == 0) {
                  break L7;
                } else {
                  var12 = param3 + param1;
                  var13 = ((mjb) this).b();
                  var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 91), 1.0f);
                  ((mjb) this).field_h.a(vf.field_a, true);
                  var14 = param1 - -((mjb) this).field_m;
                  var15 = var14 + ((mjb) this).field_n;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (~var15 < ~var12) {
                          break L10;
                        } else {
                          var8_ref.a(5557, (float)param2, (float)((mjb) this).field_n, 0.0f);
                          var8_ref.a(var14, 16383, 0, param0);
                          ((mjb) this).field_h.h(20837);
                          ((mjb) this).field_h.r((byte) -87);
                          var14 = var14 + var13;
                          var15 = var15 + var13;
                          if (var22 != 0) {
                            break L9;
                          } else {
                            if (var22 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      if (~var12 >= ~var14) {
                        break L9;
                      } else {
                        var16 = var12 - var14;
                        var9.a(5557, ((mjb) this).field_o.a((float)param2, -1080), ((mjb) this).field_o.b((float)var16, 90), 1.0f);
                        ((mjb) this).field_h.a(vf.field_a, true);
                        var8_ref.a(5557, (float)param2, (float)var16, 0.0f);
                        var8_ref.a(var14, 16383, 0, param0);
                        ((mjb) this).field_h.h(20837);
                        ((mjb) this).field_h.r((byte) -81);
                        break L9;
                      }
                    }
                    if (var22 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L11: {
                if (var10 != 0) {
                  break L11;
                } else {
                  var12 = param1 + param3;
                  var13 = param2 + param0;
                  var14 = ((mjb) this).c();
                  var15 = ((mjb) this).b();
                  var16 = ((mjb) this).field_m + param1;
                  var17 = ((mjb) this).field_n + var16;
                  L12: while (true) {
                    L13: {
                      L14: {
                        if (~var17 < ~var12) {
                          break L14;
                        } else {
                          var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 107), 1.0f);
                          ((mjb) this).field_h.a(vf.field_a, true);
                          var18 = param0 - -((mjb) this).field_l;
                          stackOut_42_0 = ((mjb) this).field_d + var18;
                          stackIn_55_0 = stackOut_42_0;
                          stackIn_43_0 = stackOut_42_0;
                          if (var22 != 0) {
                            break L13;
                          } else {
                            var19 = stackIn_43_0;
                            L15: while (true) {
                              L16: {
                                L17: {
                                  L18: {
                                    if (var19 > var13) {
                                      break L18;
                                    } else {
                                      var8_ref.a(5557, (float)((mjb) this).field_d, (float)((mjb) this).field_n, 0.0f);
                                      var8_ref.a(var16, 16383, 0, var18);
                                      ((mjb) this).field_h.h(20837);
                                      var19 = var19 + var14;
                                      var18 = var18 + var14;
                                      ((mjb) this).field_h.r((byte) -82);
                                      if (var22 != 0) {
                                        break L17;
                                      } else {
                                        if (var22 == 0) {
                                          continue L15;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  if (~var13 < ~var18) {
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                                var20 = -var18 + var13;
                                var9.a(5557, ((mjb) this).field_o.a((float)var20, -1080), ((mjb) this).field_o.b((float)((mjb) this).field_n, 78), 1.0f);
                                ((mjb) this).field_h.a(vf.field_a, true);
                                var8_ref.a(5557, (float)var20, (float)((mjb) this).field_n, 0.0f);
                                var8_ref.a(var16, 16383, 0, var18);
                                ((mjb) this).field_h.h(20837);
                                ((mjb) this).field_h.r((byte) -90);
                                break L16;
                              }
                              var16 = var16 + var15;
                              var17 = var17 + var15;
                              if (var22 == 0) {
                                continue L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                        }
                      }
                      stackOut_54_0 = var12;
                      stackIn_55_0 = stackOut_54_0;
                      break L13;
                    }
                    L19: {
                      if (stackIn_55_0 <= var16) {
                        break L19;
                      } else {
                        var18 = -var16 + var12;
                        var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)var18, 104), 1.0f);
                        ((mjb) this).field_h.a(vf.field_a, true);
                        var19 = ((mjb) this).field_l + param0;
                        var20 = var19 + ((mjb) this).field_d;
                        L20: while (true) {
                          L21: {
                            L22: {
                              if (~var13 > ~var20) {
                                break L22;
                              } else {
                                var8_ref.a(5557, (float)((mjb) this).field_d, (float)var18, 0.0f);
                                var8_ref.a(var16, 16383, 0, var19);
                                ((mjb) this).field_h.h(20837);
                                var19 = var19 + var14;
                                ((mjb) this).field_h.r((byte) -109);
                                var20 = var20 + var14;
                                if (var22 != 0) {
                                  break L21;
                                } else {
                                  if (var22 == 0) {
                                    continue L20;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (~var13 < ~var19) {
                              break L21;
                            } else {
                              break L19;
                            }
                          }
                          var21 = -var19 + var13;
                          var9.a(5557, ((mjb) this).field_o.a((float)var21, -1080), ((mjb) this).field_o.b((float)var18, 92), 1.0f);
                          ((mjb) this).field_h.a(vf.field_a, true);
                          var8_ref.a(5557, (float)var21, (float)var18, 0.0f);
                          var8_ref.a(var16, 16383, 0, var19);
                          ((mjb) this).field_h.h(20837);
                          ((mjb) this).field_h.r((byte) -80);
                          break L19;
                        }
                      }
                    }
                    if (var22 == 0) {
                      break L5;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var12 = param2 + param0;
              var13 = ((mjb) this).c();
              var9.a(5557, ((mjb) this).field_o.a((float)((mjb) this).field_d, -1080), ((mjb) this).field_o.b((float)param3, 75), 1.0f);
              ((mjb) this).field_h.a(vf.field_a, true);
              var14 = ((mjb) this).field_l + param0;
              var15 = ((mjb) this).field_d + var14;
              L23: while (true) {
                L24: {
                  L25: {
                    if (var12 < var15) {
                      break L25;
                    } else {
                      var8_ref.a(5557, (float)((mjb) this).field_d, (float)param3, 0.0f);
                      var8_ref.a(param1, 16383, 0, var14);
                      ((mjb) this).field_h.h(20837);
                      ((mjb) this).field_h.r((byte) -91);
                      var15 = var15 + var13;
                      var14 = var14 + var13;
                      if (var22 != 0) {
                        break L24;
                      } else {
                        if (var22 == 0) {
                          continue L23;
                        } else {
                          break L25;
                        }
                      }
                    }
                  }
                  if (~var12 < ~var14) {
                    break L24;
                  } else {
                    break L5;
                  }
                }
                var16 = -var14 + var12;
                var9.a(5557, ((mjb) this).field_o.a((float)var16, -1080), ((mjb) this).field_o.b((float)param3, 121), 1.0f);
                ((mjb) this).field_h.a(vf.field_a, true);
                var8_ref.a(5557, (float)var16, (float)param3, 0.0f);
                var8_ref.a(param1, 16383, 0, var14);
                ((mjb) this).field_h.h(20837);
                ((mjb) this).field_h.r((byte) -89);
                break L5;
              }
            }
            ((mjb) this).field_h.F((byte) 125);
            ((mjb) this).field_h.a(1, pja.field_l, 7);
            ((mjb) this).field_h.a(1, (byte) -101, pja.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var8, "mjb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        faa var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = dpa.field_p;
              var2.h(24335, param1);
              var2.field_e = var2.field_e + 1;
              var3 = var2.field_e;
              if (param0 > 93) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var2.c(0, 2);
            var2.a(0, ce.field_o, -1, ce.field_o.length);
            var2.c(0, imb.field_a);
            var2.c(0, qd.field_d);
            var2.a(0, nkb.field_p, -1, nkb.field_p.length);
            var2.e(-var3 + var2.field_e, -129);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rta.a((Throwable) (Object) runtimeException, "mjb.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        try {
          L0: {
            L1: {
              L2: {
                ((mjb) this).field_m = param1;
                ((mjb) this).field_l = param0;
                ((mjb) this).field_g = param3;
                ((mjb) this).field_f = param2;
                stackOut_0_0 = this;
                stackIn_10_0 = stackOut_0_0;
                stackIn_1_0 = stackOut_0_0;
                if (((mjb) this).field_l != 0) {
                  break L2;
                } else {
                  stackOut_1_0 = this;
                  stackIn_10_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (0 != ((mjb) this).field_m) {
                    break L2;
                  } else {
                    stackOut_2_0 = this;
                    stackIn_4_0 = stackOut_2_0;
                    stackOut_4_0 = this;
                    stackIn_10_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (0 != ((mjb) this).field_f) {
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackIn_7_0 = stackOut_5_0;
                      stackOut_7_0 = this;
                      stackIn_12_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (((mjb) this).field_g == 0) {
                        stackOut_12_0 = this;
                        stackOut_12_1 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        break L1;
                      } else {
                        stackOut_8_0 = this;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                  }
                }
              }
              stackOut_10_0 = this;
              stackOut_10_1 = 1;
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              break L1;
            }
            ((mjb) this).field_k = stackIn_13_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var5, "mjb.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int d() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = ((mjb) this).field_d;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) (Object) var1, "mjb.L()");
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((mjb) this).field_o.a(param1, param3, param2, param5, param6, param4, param0, (byte) -101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("mjb.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    mjb(pf param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
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
        Object stackIn_4_0 = null;
        pf stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        kb stackIn_4_5 = null;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        pf stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        Object stackOut_3_0 = null;
        pf stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        kb stackOut_3_5 = null;
        Object stackOut_2_0 = null;
        pf stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        kb stackOut_2_5 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_20_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        ((mjb) this).field_m = 0;
        ((mjb) this).field_k = false;
        ((mjb) this).field_f = 0;
        ((mjb) this).field_l = 0;
        ((mjb) this).field_g = 0;
        try {
          L0: {
            L1: {
              ((mjb) this).field_n = param2;
              ((mjb) this).field_d = param1;
              ((mjb) this).field_h = param0;
              stackOut_1_0 = this;
              stackOut_1_1 = (pf) param0;
              stackOut_1_2 = 118;
              stackOut_1_3 = param1;
              stackOut_1_4 = param2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              if (param3) {
                stackOut_3_0 = this;
                stackOut_3_1 = (pf) (Object) stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = stackIn_3_4;
                stackOut_3_5 = qua.field_d;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                stackIn_4_5 = stackOut_3_5;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (pf) (Object) stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = stackIn_2_4;
                stackOut_2_5 = ep.field_o;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                break L1;
              }
            }
            L2: {
              ((mjb) this).field_o = ((pf) (Object) stackIn_4_1).a(stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, mj.field_f);
              ((mjb) this).field_o.a(true, (byte) -98, true);
              stackOut_4_0 = this;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (~param1 == ~((mjb) this).field_o.b((byte) 113)) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((mjb) this).field_j = stackIn_8_1 != 0;
              stackOut_8_0 = this;
              stackIn_11_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (param2 == ((mjb) this).field_o.a((byte) -55)) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L3;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_12_0 = stackOut_9_0;
                stackIn_12_1 = stackOut_9_1;
                break L3;
              }
            }
            L4: {
              L5: {
                ((mjb) this).field_i = stackIn_12_1 != 0;
                stackOut_12_0 = this;
                stackIn_18_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (((mjb) this).field_j) {
                  break L5;
                } else {
                  stackOut_13_0 = this;
                  stackIn_18_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (!((mjb) this).field_o.a(-127)) {
                    break L5;
                  } else {
                    stackOut_14_0 = this;
                    stackIn_16_0 = stackOut_14_0;
                    stackOut_16_0 = this;
                    stackOut_16_1 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    break L4;
                  }
                }
              }
              stackOut_18_0 = this;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L4;
            }
            L6: {
              L7: {
                ((mjb) this).field_b = stackIn_19_1 != 0;
                stackOut_19_0 = this;
                stackIn_25_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (((mjb) this).field_i) {
                  break L7;
                } else {
                  stackOut_20_0 = this;
                  stackIn_25_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (!((mjb) this).field_o.a(36)) {
                    break L7;
                  } else {
                    stackOut_21_0 = this;
                    stackIn_23_0 = stackOut_21_0;
                    stackOut_23_0 = this;
                    stackOut_23_1 = 1;
                    stackIn_26_0 = stackOut_23_0;
                    stackIn_26_1 = stackOut_23_1;
                    break L6;
                  }
                }
              }
              stackOut_25_0 = this;
              stackOut_25_1 = 0;
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              break L6;
            }
            ((mjb) this).field_a = stackIn_26_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("mjb.<init>(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    mjb(pf param0, int param1, int param2, int[] param3, int param4, int param5) {
        RuntimeException var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        ((mjb) this).field_m = 0;
        ((mjb) this).field_k = false;
        ((mjb) this).field_f = 0;
        ((mjb) this).field_l = 0;
        ((mjb) this).field_g = 0;
        try {
          L0: {
            L1: {
              ((mjb) this).field_n = param2;
              ((mjb) this).field_d = param1;
              ((mjb) this).field_h = param0;
              ((mjb) this).field_o = param0.a(param1, false, param3, param2, param5, true, param4);
              ((mjb) this).field_o.a(true, (byte) -98, true);
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (param1 == ((mjb) this).field_o.b((byte) 113)) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((mjb) this).field_j = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (~((mjb) this).field_o.a((byte) -57) == ~param2) {
                stackOut_7_0 = this;
                stackOut_7_1 = 0;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_8_0 = stackOut_5_0;
                stackIn_8_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              L4: {
                ((mjb) this).field_i = stackIn_8_1 != 0;
                stackOut_8_0 = this;
                stackIn_14_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((mjb) this).field_j) {
                  break L4;
                } else {
                  stackOut_9_0 = this;
                  stackIn_14_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (!((mjb) this).field_o.a(-13)) {
                    break L4;
                  } else {
                    stackOut_10_0 = this;
                    stackIn_12_0 = stackOut_10_0;
                    stackOut_12_0 = this;
                    stackOut_12_1 = 1;
                    stackIn_15_0 = stackOut_12_0;
                    stackIn_15_1 = stackOut_12_1;
                    break L3;
                  }
                }
              }
              stackOut_14_0 = this;
              stackOut_14_1 = 0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              break L3;
            }
            L5: {
              L6: {
                ((mjb) this).field_b = stackIn_15_1 != 0;
                stackOut_15_0 = this;
                stackIn_21_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (((mjb) this).field_i) {
                  break L6;
                } else {
                  stackOut_16_0 = this;
                  stackIn_21_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (!((mjb) this).field_o.a(-128)) {
                    break L6;
                  } else {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackOut_19_0 = this;
                    stackOut_19_1 = 1;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    break L5;
                  }
                }
              }
              stackOut_21_0 = this;
              stackOut_21_1 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              break L5;
            }
            ((mjb) this).field_a = stackIn_22_1 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var7;
            stackOut_24_1 = new StringBuilder().append("mjb.<init>(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = (dja) (Object) new ada();
    }
}
