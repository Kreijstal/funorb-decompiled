/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends nv {
    private boolean field_t;
    private int field_r;
    private int field_q;
    static up field_o;
    static String field_u;
    static String field_s;
    private pc field_v;
    static String field_n;
    private int field_p;

    final void a(int param0, int param1, int param2) {
        if (param2 != 19072) {
            int discarded$0 = ((th) this).a(120, -24);
        }
        ((th) this).field_p = param0;
        ((th) this).field_r = param1;
    }

    public static void g(byte param0) {
        field_o = null;
        field_u = null;
        field_n = null;
        field_s = null;
    }

    th(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        ((th) this).field_r = 2;
        ((th) this).field_q = 2;
        ((th) this).field_p = 1;
        ((th) this).field_v = new pc();
        try {
            ((th) this).field_q = param1.b((byte) 44, 2);
            ((th) this).field_r = param1.b((byte) 44, 4);
            ((th) this).field_p = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "th.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 84;
        }
        return param0;
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          super.h(param0);
          var2 = ((th) this).field_q;
          if (var2 != 3) {
            if (var2 != 1) {
              break L0;
            } else {
              ((th) this).field_q = 3;
              break L0;
            }
          } else {
            ((th) this).field_q = 1;
            break L0;
          }
        }
    }

    final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        ffa[] var15 = null;
        ffa[] var16 = null;
        int var17 = 0;
        ffa var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        hr var24 = null;
        hr var25 = null;
        hr stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        hr stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hr stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hr stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        hr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        hr stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        int stackIn_23_3 = 0;
        ffa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_49_2 = 0;
        ffa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        ffa stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        hr stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        hr stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        hr stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        hr stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        hr stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        hr stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        ffa stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        ffa stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        ffa stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        L0: {
          var23 = TombRacer.field_G ? 1 : 0;
          var2 = ((th) this).field_g.d(3);
          var3 = ((th) this).field_g.e(9648);
          var4 = ((th) this).field_g.c(param0 ^ -5493);
          var5 = ((th) this).field_g.a((byte) 55);
          if (param0 == 5418) {
            break L0;
          } else {
            ((th) this).field_q = 90;
            break L0;
          }
        }
        L1: {
          var6 = dma.field_k[((th) this).field_q][0] << 16;
          var7 = dma.field_k[((th) this).field_q][1] << 16;
          var9 = ((th) this).field_p << 16;
          var10 = ((th) this).field_r << 16;
          var11 = 0;
          var13 = ((th) this).field_q;
          if (0 == var13) {
            var12 = var5;
            var11 = var3 + var5 / 2 + -1;
            break L1;
          } else {
            if (var13 == 2) {
              var11 = var3 + -(var5 / 2);
              var12 = var5;
              break L1;
            } else {
              if (var13 != 3) {
                if (var13 == 1) {
                  var12 = var4;
                  var11 = var2 + -(var4 / 2);
                  break L1;
                } else {
                  return;
                }
              } else {
                var11 = var2 - -(var4 / 2) - 1;
                var12 = var4;
                break L1;
              }
            }
          }
        }
        L2: {
          L3: {
            var14 = ((th) this).field_g.P(param0 + -5418);
            if (((th) this).field_q == 0) {
              break L3;
            } else {
              if (((th) this).field_q != 2) {
                L4: {
                  var25 = ((th) this).b(true).a(var11, ((th) this).field_g.Q(2) - -((th) this).o((byte) 46).a(var5, 0), (byte) 100, var14);
                  var25.a(false, 2, 3, 8, 10);
                  stackOut_20_0 = (hr) var25;
                  stackOut_20_1 = 72;
                  stackOut_20_2 = 0;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  stackIn_22_2 = stackOut_20_2;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  if (((th) this).field_q == 3) {
                    stackOut_22_0 = (hr) (Object) stackIn_22_0;
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = -var10;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    stackIn_23_3 = stackOut_22_3;
                    break L4;
                  } else {
                    stackOut_21_0 = (hr) (Object) stackIn_21_0;
                    stackOut_21_1 = stackIn_21_1;
                    stackOut_21_2 = stackIn_21_2;
                    stackOut_21_3 = var10;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    stackIn_23_2 = stackOut_21_2;
                    stackIn_23_3 = stackOut_21_3;
                    break L4;
                  }
                }
                ((hr) (Object) stackIn_23_0).b(stackIn_23_1, stackIn_23_2, stackIn_23_3);
                break L2;
              } else {
                break L3;
              }
            }
          }
          L5: {
            var24 = ((th) this).b(true).a(((th) this).field_g.r((byte) -95) - -((th) this).o((byte) 46).a(var4, 0), var11, (byte) 100, var14);
            var24.a(false, 2, 3, 8, 10);
            stackOut_16_0 = (hr) var24;
            stackOut_16_1 = 79;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (((th) this).field_q != 0) {
              stackOut_18_0 = (hr) (Object) stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = var10;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (hr) (Object) stackIn_17_0;
              stackOut_17_1 = stackIn_17_1;
              stackOut_17_2 = -var10;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          ((hr) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2, 0);
          break L2;
        }
        var15 = ((th) this).b(true).field_u.b(var3, -1, var2, var4, var5);
        var16 = var15;
        var17 = 0;
        L6: while (true) {
          if (~var17 <= ~var16.length) {
            return;
          } else {
            L7: {
              var18 = var16[var17];
              if ((Object) (Object) var18 == (Object) (Object) ((th) this).field_g) {
                break L7;
              } else {
                if (!((th) this).field_g.a(var18, true)) {
                  var19 = var18.d(3);
                  var20 = var18.e(param0 + 4230);
                  if (((th) this).field_g.a((byte) 110, var20, var19, 1, 1)) {
                    L8: {
                      var22 = ((th) this).field_q;
                      if (var22 == 0) {
                        var21 = var20 - -(var18.a((byte) 55) / 2);
                        break L8;
                      } else {
                        if (var22 == 2) {
                          var21 = var20 - var18.a((byte) 55) / 2;
                          break L8;
                        } else {
                          if (var22 != 3) {
                            if (var22 == 1) {
                              var21 = var19 + -(var18.c(param0 ^ -5496) / 2);
                              break L8;
                            } else {
                              return;
                            }
                          } else {
                            var21 = var19 + var18.c(-107) / 2;
                            break L8;
                          }
                        }
                      }
                    }
                    L9: {
                      var22 = ua.a(-var11 + var21, 2);
                      if (var22 <= 262144) {
                        break L9;
                      } else {
                        L10: {
                          L11: {
                            if (((th) this).field_q == 0) {
                              break L11;
                            } else {
                              if (((th) this).field_q == 2) {
                                break L11;
                              } else {
                                ((th) this).field_v.a(var11, var21, var20, var20, 44);
                                break L10;
                              }
                            }
                          }
                          ((th) this).field_v.a(var19, var19, var11, var21, 44);
                          break L10;
                        }
                        if (((th) this).b(true).a(1, ((th) this).field_v, (gma) (Object) ((th) this).e(param0 ^ 5420), (byte) 60)) {
                          break L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L12: {
                      var8 = bs.a(var12, param0 ^ -25604, var22);
                      var8 = -gqa.a(var8, (byte) 24, -var9 + var10) + var10;
                      var8 = za.a(var9, (byte) 113, var10, var8);
                      stackOut_48_0 = (ffa) var18;
                      stackOut_48_1 = 120;
                      stackOut_48_2 = 0;
                      stackIn_50_0 = stackOut_48_0;
                      stackIn_50_1 = stackOut_48_1;
                      stackIn_50_2 = stackOut_48_2;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      stackIn_49_2 = stackOut_48_2;
                      if (((th) this).field_t) {
                        stackOut_50_0 = (ffa) (Object) stackIn_50_0;
                        stackOut_50_1 = stackIn_50_1;
                        stackOut_50_2 = stackIn_50_2;
                        stackOut_50_3 = 2;
                        stackIn_51_0 = stackOut_50_0;
                        stackIn_51_1 = stackOut_50_1;
                        stackIn_51_2 = stackOut_50_2;
                        stackIn_51_3 = stackOut_50_3;
                        break L12;
                      } else {
                        stackOut_49_0 = (ffa) (Object) stackIn_49_0;
                        stackOut_49_1 = stackIn_49_1;
                        stackOut_49_2 = stackIn_49_2;
                        stackOut_49_3 = 1;
                        stackIn_51_0 = stackOut_49_0;
                        stackIn_51_1 = stackOut_49_1;
                        stackIn_51_2 = stackOut_49_2;
                        stackIn_51_3 = stackOut_49_3;
                        break L12;
                      }
                    }
                    boolean discarded$1 = ((ffa) (Object) stackIn_51_0).a(stackIn_51_1, stackIn_51_2 != 0, stackIn_51_3, gqa.a(var7, (byte) 24, var8), gqa.a(var6, (byte) 24, var8), 0);
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            var17++;
            continue L6;
          }
        }
    }

    final int a(boolean param0) {
        if (param0) {
            return -114;
        }
        return 26;
    }

    final static boolean b(int param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param1 == 8) {
          L0: {
            L1: {
              if (bqa.a(540800, param0, param2)) {
                break L1;
              } else {
                if (!no.a(param2, param0, param1 ^ 36872)) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -128, ((th) this).field_q, 2);
            param1.a((byte) 44, ((th) this).field_r, 4);
            param1.a((byte) -128, ((th) this).field_p, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "th.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void b(int param0, int param1) {
        int var3 = 118 / ((param0 - -45) / 59);
        ((th) this).field_q = param1;
    }

    th(la param0, boolean param1) {
        super(param0, param1);
        ((th) this).field_r = 2;
        ((th) this).field_q = 2;
        ((th) this).field_p = 1;
        ((th) this).field_v = new pc();
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            ((th) this).field_q = 53;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Loading extra data";
        field_s = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = new up(4, 50);
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
