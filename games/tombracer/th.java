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
            this.a(120, -24);
        }
        this.field_p = param0;
        this.field_r = param1;
    }

    public static void g(byte param0) {
        if (param0 != 91) {
            return;
        }
        field_o = null;
        field_u = null;
        field_n = null;
        field_s = null;
    }

    th(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        this.field_r = 2;
        this.field_q = 2;
        this.field_p = 1;
        this.field_v = new pc();
        try {
            this.field_q = param1.b((byte) 44, 2);
            this.field_r = param1.b((byte) 44, 4);
            this.field_p = param1.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "th.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= -48) {
            return 84;
        }
        return param0;
    }

    final void h(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          super.h(param0);
          var2 = this.field_q;
          if (-4 != (var2 ^ -1)) {
            if (-2 != (var2 ^ -1)) {
              break L0;
            } else {
              this.field_q = 3;
              break L0;
            }
          } else {
            this.field_q = 1;
            break L0;
          }
        }
    }

    final void k(int param0) {
        hr stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hr stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        hr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        hr stackIn_23_0;
        int stackIn_23_1;
        int stackIn_23_2;
        int stackIn_23_3;
        ffa stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        ffa stackIn_53_0;
        int stackIn_53_1;
        int stackIn_53_2;
        int stackIn_53_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        ffa[] var15;
        ffa[] var16;
        int var17;
        ffa var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        hr var24;
        hr var25;
        L0: {
          var23 = TombRacer.field_G ? 1 : 0;
          var2 = this.field_g.d(3);
          var3 = this.field_g.e(9648);
          var4 = this.field_g.c(param0 ^ -5493);
          var5 = this.field_g.a((byte) 55);
          if (param0 == 5418) {
            break L0;
          } else {
            this.field_q = 90;
            break L0;
          }
        }
        L1: {
          var6 = dma.field_k[this.field_q][0] << 139053264;
          var7 = dma.field_k[this.field_q][1] << -757434704;
          var9 = this.field_p << 1620753776;
          var10 = this.field_r << -473544624;
          var11 = 0;
          var13 = this.field_q;
          if (0 == var13) {
            var12 = var5;
            var11 = var3 + var5 / 2 + -1;
            break L1;
          } else {
            if (-3 == (var13 ^ -1)) {
              var11 = var3 + -(var5 / 2);
              var12 = var5;
              break L1;
            } else {
              if (var13 != 3) {
                if ((var13 ^ -1) == -2) {
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
            var14 = this.field_g.P(param0 + -5418);
            if (this.field_q == 0) {
              break L3;
            } else {
              if ((this.field_q ^ -1) != -3) {
                L4: {
                  var25 = this.b(true).a(var11, this.field_g.Q(2) - -this.o((byte) 46).a(var5, 0), (byte) 100, var14);
                  var25.a(false, 2, 3, 8, 10);
                  stackIn_22_0 = (hr) (var25);

                  stackIn_22_1 = 72;

                  stackIn_22_2 = 0;

                  if (this.field_q == 3) {
                    stackIn_23_0 = (hr) ((Object) stackIn_22_0);
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = -var10;
                    break L4;
                  } else {
                    stackIn_23_0 = (hr) ((Object) stackIn_22_0);
                    stackIn_23_1 = stackIn_22_1;
                    stackIn_23_2 = stackIn_22_2;
                    stackIn_23_3 = var10;
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
            var24 = this.b(true).a(this.field_g.r((byte) -95) - -this.o((byte) 46).a(var4, 0), var11, (byte) 100, var14);
            var24.a(false, 2, 3, 8, 10);
            stackIn_18_0 = (hr) (var24);

            stackIn_18_1 = 79;

            if (-1 != (this.field_q ^ -1)) {
              stackIn_19_0 = (hr) ((Object) stackIn_18_0);
              stackIn_19_1 = stackIn_18_1;
              stackIn_19_2 = var10;
              break L5;
            } else {
              stackIn_19_0 = (hr) ((Object) stackIn_18_0);
              stackIn_19_1 = stackIn_18_1;
              stackIn_19_2 = -var10;
              break L5;
            }
          }
          ((hr) (Object) stackIn_19_0).b(stackIn_19_1, stackIn_19_2, 0);
          break L2;
        }
        var15 = this.b(true).field_u.b(var3, -1, var2, var4, var5);
        var16 = var15;
        var17 = 0;
        L6: while (true) {
          if (var17 >= var16.length) {
            return;
          } else {
            var18 = var16[var17];
            if (var18 != this.field_g) {
              if (!this.field_g.a(var18, true)) {
                var19 = var18.d(3);
                var20 = var18.e(param0 + 4230);
                if (this.field_g.a((byte) 110, var20, var19, 1, 1)) {
                  L7: {
                    var22 = this.field_q;
                    if (-1 == (var22 ^ -1)) {
                      var21 = var20 - -(var18.a((byte) 55) / 2);
                      break L7;
                    } else {
                      if (-3 == (var22 ^ -1)) {
                        var21 = var20 - var18.a((byte) 55) / 2;
                        break L7;
                      } else {
                        if (var22 != 3) {
                          if (var22 == 1) {
                            var21 = var19 + -(var18.c(param0 ^ -5496) / 2);
                            break L7;
                          } else {
                            return;
                          }
                        } else {
                          var21 = var19 + var18.c(-107) / 2;
                          break L7;
                        }
                      }
                    }
                  }
                  L8: {
                    var22 = ua.a(-var11 + var21, 2);
                    if (-262145 <= (var22 ^ -1)) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          if (this.field_q == 0) {
                            break L10;
                          } else {
                            if (this.field_q == 2) {
                              break L10;
                            } else {
                              this.field_v.a(var11, var21, var20, var20, 44);
                              break L9;
                            }
                          }
                        }
                        this.field_v.a(var19, var19, var11, var21, 44);
                        break L9;
                      }
                      if (!this.b(true).a(1, this.field_v, this.e(param0 ^ 5420), (byte) 60)) {
                        break L8;
                      } else {
                        var17++;
                        continue L6;
                      }
                    }
                  }
                  L11: {
                    var8 = bs.a(var12, param0 ^ -25604, var22);
                    var8 = -gqa.a(var8, (byte) 24, -var9 + var10) + var10;
                    var8 = za.a(var9, (byte) 113, var10, var8);
                    stackIn_52_0 = (ffa) (var18);

                    stackIn_52_1 = 120;

                    stackIn_52_2 = 0;

                    if (this.field_t) {
                      stackIn_53_0 = (ffa) ((Object) stackIn_52_0);
                      stackIn_53_1 = stackIn_52_1;
                      stackIn_53_2 = stackIn_52_2;
                      stackIn_53_3 = 2;
                      break L11;
                    } else {
                      stackIn_53_0 = (ffa) ((Object) stackIn_52_0);
                      stackIn_53_1 = stackIn_52_1;
                      stackIn_53_2 = stackIn_52_2;
                      stackIn_53_3 = 1;
                      break L11;
                    }
                  }
                  ((ffa) (Object) stackIn_53_0).a(stackIn_53_1, stackIn_53_2 != 0, stackIn_53_3, gqa.a(var7, (byte) 24, var8), gqa.a(var6, (byte) 24, var8), 0);
                  var17++;
                  continue L6;
                } else {
                  var17++;
                  continue L6;
                }
              } else {
                var17++;
                continue L6;
              }
            } else {
              var17++;
              continue L6;
            }
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
        if (param1 == 8) {
          L0: {
            L1: {
              if (bqa.a(540800, param0, param2)) {
                break L1;
              } else {
                if (!no.a(param2, param0, param1 ^ 36872)) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
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
            param1.a((byte) -128, this.field_q, 2);
            param1.a((byte) 44, this.field_r, 4);
            param1.a((byte) -128, this.field_p, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "th.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        int var3 = 118 / ((param0 - -45) / 59);
        this.field_q = param1;
    }

    th(la param0, boolean param1) {
        super(param0, param1);
        this.field_r = 2;
        this.field_q = 2;
        this.field_p = 1;
        this.field_v = new pc();
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            this.field_q = 53;
            return true;
        }
        return true;
    }

    static {
        field_u = "Loading extra data";
        field_s = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_o = new up(4, 50);
        field_n = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
