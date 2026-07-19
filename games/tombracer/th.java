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
        int discarded$0 = 0;
        if (param2 != 19072) {
            discarded$0 = this.a(120, -24);
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
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                var3 = TombRacer.field_G ? 1 : 0;
                super.h(param0);
                var2 = this.field_q;
                if (-4 != (var2 ^ -1)) {
                  break L3;
                } else {
                  if (var3 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-2 != (var2 ^ -1)) {
                break L0;
              } else {
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            this.field_q = 1;
            if (var3 == 0) {
              break L0;
            } else {
              break L1;
            }
          }
          this.field_q = 3;
          break L0;
        }
    }

    final void k(int param0) {
        boolean discarded$1 = false;
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
        hr stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        hr stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        hr stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        hr stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        hr stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        hr stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        ffa stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        ffa stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        ffa stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        hr stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        hr stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        hr stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int stackOut_22_3 = 0;
        hr stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        hr stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        hr stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        ffa stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        ffa stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        ffa stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
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
          L2: {
            L3: {
              L4: {
                L5: {
                  var6 = dma.field_k[this.field_q][0] << 139053264;
                  var7 = dma.field_k[this.field_q][1] << -757434704;
                  var9 = this.field_p << 1620753776;
                  var10 = this.field_r << -473544624;
                  var11 = 0;
                  var13 = this.field_q;
                  if (0 == var13) {
                    var12 = var5;
                    var11 = var3 + var5 / 2 + -1;
                    if (var23 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  } else {
                    if (-3 == (var13 ^ -1)) {
                      break L5;
                    } else {
                      L6: {
                        if (var13 != 3) {
                          break L6;
                        } else {
                          if (var23 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if ((var13 ^ -1) == -2) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var11 = var3 + -(var5 / 2);
                var12 = var5;
                if (var23 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
              var11 = var2 - -(var4 / 2) - 1;
              var12 = var4;
              if (var23 == 0) {
                break L1;
              } else {
                break L3;
              }
            }
            var12 = var4;
            var11 = var2 + -(var4 / 2);
            if (var23 == 0) {
              break L1;
            } else {
              break L2;
            }
          }
          return;
        }
        L7: {
          L8: {
            var14 = this.field_g.P(param0 + -5418);
            if (this.field_q == 0) {
              break L8;
            } else {
              if ((this.field_q ^ -1) != -3) {
                L9: {
                  var25 = this.b(true).a(var11, this.field_g.Q(2) - -this.o((byte) 46).a(var5, 0), (byte) 100, var14);
                  var25.a(false, 2, 3, 8, 10);
                  stackOut_21_0 = (hr) (var25);
                  stackOut_21_1 = 72;
                  stackOut_21_2 = 0;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  stackIn_23_2 = stackOut_21_2;
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  if (this.field_q == 3) {
                    stackOut_23_0 = (hr) ((Object) stackIn_23_0);
                    stackOut_23_1 = stackIn_23_1;
                    stackOut_23_2 = stackIn_23_2;
                    stackOut_23_3 = -var10;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    stackIn_24_2 = stackOut_23_2;
                    stackIn_24_3 = stackOut_23_3;
                    break L9;
                  } else {
                    stackOut_22_0 = (hr) ((Object) stackIn_22_0);
                    stackOut_22_1 = stackIn_22_1;
                    stackOut_22_2 = stackIn_22_2;
                    stackOut_22_3 = var10;
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_24_1 = stackOut_22_1;
                    stackIn_24_2 = stackOut_22_2;
                    stackIn_24_3 = stackOut_22_3;
                    break L9;
                  }
                }
                ((hr) (Object) stackIn_24_0).b(stackIn_24_1, stackIn_24_2, stackIn_24_3);
                break L7;
              } else {
                break L8;
              }
            }
          }
          L10: {
            var24 = this.b(true).a(this.field_g.r((byte) -95) - -this.o((byte) 46).a(var4, 0), var11, (byte) 100, var14);
            var24.a(false, 2, 3, 8, 10);
            stackOut_17_0 = (hr) (var24);
            stackOut_17_1 = 79;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (-1 != (this.field_q ^ -1)) {
              stackOut_19_0 = (hr) ((Object) stackIn_19_0);
              stackOut_19_1 = stackIn_19_1;
              stackOut_19_2 = var10;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L10;
            } else {
              stackOut_18_0 = (hr) ((Object) stackIn_18_0);
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = -var10;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L10;
            }
          }
          ((hr) (Object) stackIn_20_0).b(stackIn_20_1, stackIn_20_2, 0);
          break L7;
        }
        var15 = this.b(true).field_u.b(var3, -1, var2, var4, var5);
        var16 = var15;
        var17 = 0;
        L11: while (true) {
          if (var17 < var16.length) {
            var18 = var16[var17];
            if (var23 == 0) {
              L12: {
                if (var18 == this.field_g) {
                  break L12;
                } else {
                  L13: {
                    if (!this.field_g.a(var18, true)) {
                      break L13;
                    } else {
                      if (var23 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    var19 = var18.d(3);
                    var20 = var18.e(param0 + 4230);
                    if (this.field_g.a((byte) 110, var20, var19, 1, 1)) {
                      break L14;
                    } else {
                      if (var23 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          L19: {
                            var22 = this.field_q;
                            if (-1 == (var22 ^ -1)) {
                              var21 = var20 - -(var18.a((byte) 55) / 2);
                              if (var23 == 0) {
                                break L15;
                              } else {
                                break L19;
                              }
                            } else {
                              if (-3 == (var22 ^ -1)) {
                                break L19;
                              } else {
                                L20: {
                                  if (var22 != 3) {
                                    break L20;
                                  } else {
                                    if (var23 == 0) {
                                      break L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                if (var22 == 1) {
                                  break L17;
                                } else {
                                  break L16;
                                }
                              }
                            }
                          }
                          var21 = var20 - var18.a((byte) 55) / 2;
                          if (var23 == 0) {
                            break L15;
                          } else {
                            break L18;
                          }
                        }
                        var21 = var19 + var18.c(-107) / 2;
                        if (var23 == 0) {
                          break L15;
                        } else {
                          break L17;
                        }
                      }
                      var21 = var19 + -(var18.c(param0 ^ -5496) / 2);
                      if (var23 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    return;
                  }
                  L21: {
                    var22 = ua.a(-var11 + var21, 2);
                    if (-262145 <= (var22 ^ -1)) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          if (this.field_q == 0) {
                            break L23;
                          } else {
                            if (this.field_q == 2) {
                              break L23;
                            } else {
                              this.field_v.a(var11, var21, var20, var20, 44);
                              if (var23 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                        this.field_v.a(var19, var19, var11, var21, 44);
                        break L22;
                      }
                      if (this.b(true).a(1, this.field_v, this.e(param0 ^ 5420), (byte) 60)) {
                        break L12;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L24: {
                    var8 = bs.a(var12, param0 ^ -25604, var22);
                    var8 = -gqa.a(var8, (byte) 24, -var9 + var10) + var10;
                    var8 = za.a(var9, (byte) 113, var10, var8);
                    stackOut_56_0 = (ffa) (var18);
                    stackOut_56_1 = 120;
                    stackOut_56_2 = 0;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    if (this.field_t) {
                      stackOut_58_0 = (ffa) ((Object) stackIn_58_0);
                      stackOut_58_1 = stackIn_58_1;
                      stackOut_58_2 = stackIn_58_2;
                      stackOut_58_3 = 2;
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      stackIn_59_3 = stackOut_58_3;
                      break L24;
                    } else {
                      stackOut_57_0 = (ffa) ((Object) stackIn_57_0);
                      stackOut_57_1 = stackIn_57_1;
                      stackOut_57_2 = stackIn_57_2;
                      stackOut_57_3 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      stackIn_59_3 = stackOut_57_3;
                      break L24;
                    }
                  }
                  discarded$1 = ((ffa) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2 != 0, stackIn_59_3, gqa.a(var7, (byte) 24, var8), gqa.a(var6, (byte) 24, var8), 0);
                  break L12;
                }
              }
              var17++;
              if (var23 == 0) {
                continue L11;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
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
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param1 != 8) {
          return true;
        } else {
          L0: {
            L1: {
              if (bqa.a(540800, param0, param2)) {
                break L1;
              } else {
                if (!no.a(param2, param0, param1 ^ 36872)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L0;
          }
          return stackIn_6_0 != 0;
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
