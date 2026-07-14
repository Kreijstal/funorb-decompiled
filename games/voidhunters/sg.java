/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sg extends anb implements ntb, utb {
    private int[] field_x;
    private int field_P;
    private int field_G;
    private boolean field_y;
    private int field_A;
    private boolean field_R;
    private qua field_L;
    private boa field_S;
    private int field_N;
    static int field_H;
    private int field_u;
    static int field_E;
    private int field_M;
    private int field_v;
    boolean field_T;
    private int field_Q;
    private boolean field_K;
    private int field_F;
    boolean field_D;
    private int field_I;
    private int[] field_J;
    private int field_C;
    private boolean field_O;
    boolean field_w;
    private aoa field_z;

    final void g(int param0, int param1) {
        int var3 = -108 % ((param1 - 35) / 49);
        ((sg) this).field_Q = param0;
    }

    public final void a(faa param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          super.a(param0, 32);
          ((sg) this).field_Q = param0.i(0, 32);
          ((sg) this).field_N = param0.i(param1 ^ 32, 32);
          ((sg) this).field_u = param0.i(param1 + -32, 32);
          if (!kv.a(false, param0)) {
            ((sg) this).field_z = null;
            break L0;
          } else {
            L1: {
              if (((sg) this).field_z != null) {
                break L1;
              } else {
                ((sg) this).field_z = new aoa();
                break L1;
              }
            }
            ((sg) this).field_z.a(param0, false);
            break L0;
          }
        }
        L2: {
          ((sg) this).field_P = param0.i(0, 32);
          ((sg) this).field_I = param0.i(0, 32);
          ((sg) this).field_C = param0.i(0, 32);
          ((sg) this).field_G = param0.i(0, 32);
          ((sg) this).field_y = kv.a(false, param0);
          ((sg) this).field_K = kv.a(false, param0);
          ((sg) this).field_O = kv.a(false, param0);
          ((sg) this).field_M = param0.i(0, param1);
          ((sg) this).field_T = kv.a(false, param0);
          ((sg) this).field_w = kv.a(false, param0);
          ((sg) this).field_R = kv.a(false, param0);
          ((sg) this).field_v = param0.i(0, 32);
          ((sg) this).field_J = wkb.a((byte) 37, ((sg) this).field_J, param0, 4);
          if (!kv.a(false, param0)) {
            ((sg) this).field_S = null;
            break L2;
          } else {
            L3: {
              if (((sg) this).field_S == null) {
                ((sg) this).field_S = new boa();
                break L3;
              } else {
                break L3;
              }
            }
            ((sg) this).field_S.a(param0, false);
            break L2;
          }
        }
        ((sg) this).field_F = param0.i(0, 32);
    }

    final boolean q(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -6) {
            break L0;
          } else {
            ((sg) this).field_x = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((sg) this).field_y) {
              break L2;
            } else {
              if (oq.field_I != ((sg) this).field_G) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void a(byte param0, boa param1) {
        int var3 = -32 % ((-79 - param0) / 42);
        ((sg) this).field_S = param1;
    }

    final int w(int param0) {
        if (param0 <= 36) {
            ((sg) this).field_x = null;
        }
        return ((sg) this).field_G;
    }

    final boolean s(int param0) {
        Object var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 31) {
            break L0;
          } else {
            var3 = null;
            ((sg) this).a((aoa) null, -101);
            break L0;
          }
        }
        L1: {
          L2: {
            if (1 == vqa.field_k) {
              break L2;
            } else {
              if (((sg) this).g(false)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void a(int[] param0, int param1) {
        if (param1 >= -7) {
            return;
        }
        ((sg) this).field_x = param0;
    }

    final void a(qua param0, int param1) {
        ((sg) this).field_L = param0;
        if (param1 != 3) {
            int discarded$0 = ((sg) this).o((byte) -104);
        }
    }

    final boolean j(byte param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 76 / ((param0 - 49) / 42);
            if (((sg) this).field_z != null) {
              break L1;
            } else {
              if (((sg) this).field_F >= oq.field_A) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean n(int param0) {
        if (param0 != 31390) {
            int[] discarded$0 = ((sg) this).A(125);
        }
        return ((sg) this).field_R;
    }

    final int d(int param0) {
        if (param0 < 42) {
            field_H = -63;
            return 1;
        }
        return 1;
    }

    final void e(byte param0) {
        super.e(param0);
        ((sg) this).field_C = jo.field_e + ((sg) this).field_k.a(0);
    }

    final boolean r(byte param0) {
        if (param0 >= -83) {
            return false;
        }
        return ((sg) this).field_K;
    }

    final boolean s(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -90) {
            break L0;
          } else {
            boolean discarded$2 = ((sg) this).r((byte) -68);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((sg) this).field_P > 0) {
              break L2;
            } else {
              if ((((sg) this).field_I ^ -1) >= -1) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void m(int param0) {
        if (param0 != -13539) {
            return;
        }
        if (((sg) this).field_v > 0) {
        } else {
            ((sg) this).field_R = !((sg) this).field_R ? true : false;
            ((sg) this).field_v = pca.field_i[3].d((byte) 64);
            ((sg) this).d((byte) 39);
            if (!((sg) this).field_R) {
                qba.a(20382, ((sg) this).d(false), 25, ((sg) this).g((byte) -3), 50);
            } else {
                qba.a(20382, ((sg) this).d(false), 26, ((sg) this).g((byte) -71), 50);
            }
        }
    }

    private final void B(int param0) {
        ((sg) this).field_J = null;
        if (param0 >= -127) {
            ((sg) this).field_S = null;
        }
    }

    final void a(boolean param0, pe param1) {
        if (!param0) {
            Object var4 = null;
            boolean discarded$0 = ((sg) this).a((byte) 18, (tv) null);
        }
        boolean discarded$1 = ((sg) this).field_z.a((sg) this, (byte) -73, param1);
    }

    final void c(int param0, int param1) {
        // if_icmpgt L51
        if (fwa.a(param0, 1, ((sg) this).field_J)) {
            // if_icmpeq L67
            ((sg) this).field_M = 18;
        } else {
            ((sg) this).field_J = qi.a(param0, true, ((sg) this).field_J, (byte) -14);
            if (param1 != 19581) {
                ((sg) this).field_M = 18;
            }
        }
    }

    final boolean b(int param0, byte param1) {
        int var3 = -67 % ((param1 - -53) / 48);
        return (((sg) this).field_A & param0) != 0 ? true : false;
    }

    final int y(int param0) {
        if (param0 != 8) {
            ((sg) this).field_z = null;
        }
        return -oq.field_e + ((sg) this).field_M;
    }

    final int q(byte param0) {
        if (param0 <= 63) {
            ((sg) this).u(39);
        }
        return ((sg) this).field_N;
    }

    final boa n(byte param0) {
        if (param0 != 28) {
            int discarded$0 = ((sg) this).l(45);
        }
        return ((sg) this).field_S;
    }

    final void a(ij param0, int param1, boolean param2, boolean param3) {
        if (param1 != 9) {
            Object var6 = null;
            ((sg) this).a((qua) null, 93);
        }
        if (1 == era.field_p) {
            param0.b(param1 ^ -10265, (ksa) (Object) new ihb(4, ((sg) this).field_y ? 2 : 0));
        } else {
            param0.b(param1 + -10267, (ksa) (Object) new ihb(4, ((sg) this).field_G));
        }
        if (!param2) {
            if (!param3) {
                if (!((sg) this).field_O) {
                    param0.b(param1 ^ -10265, (ksa) (Object) new ihb(8, 0));
                }
                if (!(!((sg) this).field_K)) {
                    param0.b(-10258, (ksa) (Object) new ihb(9, ((sg) this).field_M));
                }
            }
        }
        ((sg) this).field_k.a(param0, (sg) this, 0);
    }

    final int c(int param0, byte param1) {
        Object var4 = null;
        int var3 = ((sg) this).field_k.g(param0, param1 + 5);
        if (param1 != -2) {
            var4 = null;
            ((sg) this).a(false, (pe) null);
            // if_icmple L58
            this.B(-128);
        } else {
            if (-1 < var3) {
                this.B(-128);
            }
        }
        return var3;
    }

    final void r(int param0) {
        ((sg) this).field_F = oq.field_A;
        if (param0 != -2) {
            Object var3 = null;
            ((sg) this).a((int[]) null, 59);
        }
    }

    final void a(boolean param0, lta param1, int param2) {
        int var4 = ((sg) this).t(0);
        int var5 = (int)((float)tu.field_d * param1.field_a);
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (int)((float)lua.field_d * param1.field_a);
        if (1 <= var6) {
            // if_icmpeq L85
            ((sg) this).field_D = false;
        } else {
            var6 = 1;
            if (param2 != 32) {
                ((sg) this).field_D = false;
            }
        }
        int var7 = (((sg) this).f((byte) -23)[0] + ((sg) this).f((byte) -46)[1]) / 2;
        int var8 = param1.a(var7, (byte) 117) + -(var5 / 2);
        int var9 = param1.b(true, ((sg) this).f((byte) -94)[2]) + -(4 * var6);
        nhb.a(qpb.a(false, ((sg) this).field_N, param2 ^ 13894111), var4, var9, var6, param0, var5, var8, 2);
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = 0;
        sg var5 = null;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        boolean stackIn_24_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_26_0 = false;
        int stackIn_26_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        boolean stackIn_37_0 = false;
        boolean stackIn_38_0 = false;
        boolean stackIn_39_0 = false;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        boolean stackOut_23_0 = false;
        boolean stackOut_25_0 = false;
        int stackOut_25_1 = 0;
        boolean stackOut_24_0 = false;
        int stackOut_24_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        boolean stackOut_36_0 = false;
        boolean stackOut_38_0 = false;
        int stackOut_38_1 = 0;
        boolean stackOut_37_0 = false;
        int stackOut_37_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        L0: {
          L1: {
            var4 = -46 % ((param0 - 22) / 59);
            var5 = (sg) (Object) param1;
            if (super.a((byte) -43, param1)) {
              break L1;
            } else {
              if (var5.field_Q != var5.field_Q) {
                break L1;
              } else {
                if (var5.field_N != var5.field_N) {
                  break L1;
                } else {
                  if (var5.field_u != var5.field_u) {
                    break L1;
                  } else {
                    aoa discarded$2 = var5.field_z;
                    L2: {
                      if (null == var5.field_z) {
                        break L2;
                      } else {
                        if (var5.field_z.a((byte) -43, (tv) (Object) var5.field_z)) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var5.field_P != var5.field_P) {
                      break L1;
                    } else {
                      if (var5.field_I != var5.field_I) {
                        break L1;
                      } else {
                        if (var5.field_G != var5.field_G) {
                          break L1;
                        } else {
                          L3: {
                            if (var5.field_y) {
                              stackOut_14_0 = 0;
                              stackIn_15_0 = stackOut_14_0;
                              break L3;
                            } else {
                              stackOut_13_0 = 1;
                              stackIn_15_0 = stackOut_13_0;
                              break L3;
                            }
                          }
                          if (stackIn_15_0 == (var5.field_y ? 1 : 0)) {
                            break L1;
                          } else {
                            L4: {
                              if (var5.field_K) {
                                stackOut_18_0 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                break L4;
                              } else {
                                stackOut_17_0 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                break L4;
                              }
                            }
                            L5: {
                              stackOut_19_0 = stackIn_19_0;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_20_0 = stackOut_19_0;
                              if (var5.field_K) {
                                stackOut_21_0 = stackIn_21_0;
                                stackOut_21_1 = 0;
                                stackIn_22_0 = stackOut_21_0;
                                stackIn_22_1 = stackOut_21_1;
                                break L5;
                              } else {
                                stackOut_20_0 = stackIn_20_0;
                                stackOut_20_1 = 1;
                                stackIn_22_0 = stackOut_20_0;
                                stackIn_22_1 = stackOut_20_1;
                                break L5;
                              }
                            }
                            if (stackIn_22_0 != stackIn_22_1) {
                              break L1;
                            } else {
                              L6: {
                                stackOut_23_0 = var5.field_O;
                                stackIn_25_0 = stackOut_23_0;
                                stackIn_24_0 = stackOut_23_0;
                                if (var5.field_O) {
                                  stackOut_25_0 = stackIn_25_0;
                                  stackOut_25_1 = 0;
                                  stackIn_26_0 = stackOut_25_0;
                                  stackIn_26_1 = stackOut_25_1;
                                  break L6;
                                } else {
                                  stackOut_24_0 = stackIn_24_0;
                                  stackOut_24_1 = 1;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  break L6;
                                }
                              }
                              if ((stackIn_26_0 ? 1 : 0) == stackIn_26_1) {
                                break L1;
                              } else {
                                if (var5.field_M != var5.field_M) {
                                  break L1;
                                } else {
                                  L7: {
                                    if (var5.field_T) {
                                      stackOut_30_0 = 0;
                                      stackIn_31_0 = stackOut_30_0;
                                      break L7;
                                    } else {
                                      stackOut_29_0 = 1;
                                      stackIn_31_0 = stackOut_29_0;
                                      break L7;
                                    }
                                  }
                                  if (stackIn_31_0 == (var5.field_T ? 1 : 0)) {
                                    break L1;
                                  } else {
                                    L8: {
                                      if (var5.field_w) {
                                        stackOut_34_0 = 0;
                                        stackIn_35_0 = stackOut_34_0;
                                        break L8;
                                      } else {
                                        stackOut_33_0 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        break L8;
                                      }
                                    }
                                    if (stackIn_35_0 == (var5.field_w ? 1 : 0)) {
                                      break L1;
                                    } else {
                                      L9: {
                                        stackOut_36_0 = var5.field_R;
                                        stackIn_38_0 = stackOut_36_0;
                                        stackIn_37_0 = stackOut_36_0;
                                        if (var5.field_R) {
                                          stackOut_38_0 = stackIn_38_0;
                                          stackOut_38_1 = 0;
                                          stackIn_39_0 = stackOut_38_0;
                                          stackIn_39_1 = stackOut_38_1;
                                          break L9;
                                        } else {
                                          stackOut_37_0 = stackIn_37_0;
                                          stackOut_37_1 = 1;
                                          stackIn_39_0 = stackOut_37_0;
                                          stackIn_39_1 = stackOut_37_1;
                                          break L9;
                                        }
                                      }
                                      if ((stackIn_39_0 ? 1 : 0) == stackIn_39_1) {
                                        break L1;
                                      } else {
                                        if (var5.field_v != var5.field_v) {
                                          break L1;
                                        } else {
                                          if (wpb.a(var5.field_J, var5.field_J, (byte) 28)) {
                                            break L1;
                                          } else {
                                            boa discarded$3 = var5.field_S;
                                            L10: {
                                              if (null == var5.field_S) {
                                                break L10;
                                              } else {
                                                if (var5.field_S.a((byte) -92, (tv) (Object) var5.field_S)) {
                                                  break L1;
                                                } else {
                                                  break L10;
                                                }
                                              }
                                            }
                                            if (var5.field_F == var5.field_F) {
                                              stackOut_50_0 = 0;
                                              stackIn_51_0 = stackOut_50_0;
                                              break L0;
                                            } else {
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_49_0 = 1;
          stackIn_51_0 = stackOut_49_0;
          break L0;
        }
        return stackIn_51_0 != 0;
    }

    final int x(int param0) {
        int var2 = 10 / ((-20 - param0) / 55);
        return ((sg) this).field_u;
    }

    final qua p(byte param0) {
        if (param0 != 49) {
            int discarded$0 = ((sg) this).t(-25);
        }
        return ((sg) this).field_L;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          super.a(param0, false);
          ((sg) this).field_Q = param0.i(0, 32);
          ((sg) this).field_N = param0.i(0, 32);
          ((sg) this).field_u = param0.i(0, 32);
          if (!kv.a(false, param0)) {
            ((sg) this).field_z = null;
            break L0;
          } else {
            if (null == ((sg) this).field_z) {
              ((sg) this).field_z = new aoa();
              ((sg) this).field_z.a(param0, false);
              break L0;
            } else {
              ((sg) this).field_z.a(param0, false);
              break L0;
            }
          }
        }
        L1: {
          ((sg) this).field_P = param0.i(0, 32);
          ((sg) this).field_I = param0.i(0, 32);
          ((sg) this).field_G = param0.i(0, 32);
          ((sg) this).field_y = kv.a(param1, param0);
          ((sg) this).field_K = kv.a(false, param0);
          ((sg) this).field_O = kv.a(param1, param0);
          ((sg) this).field_M = param0.i(0, 32);
          ((sg) this).field_T = kv.a(false, param0);
          ((sg) this).field_w = kv.a(false, param0);
          ((sg) this).field_R = kv.a(false, param0);
          ((sg) this).field_v = param0.i(0, 32);
          ((sg) this).field_J = wkb.a((byte) 37, ((sg) this).field_J, param0, 4);
          if (!kv.a(false, param0)) {
            ((sg) this).field_S = null;
            break L1;
          } else {
            L2: {
              if (((sg) this).field_S != null) {
                break L2;
              } else {
                ((sg) this).field_S = new boa();
                break L2;
              }
            }
            ((sg) this).field_S.a(param0, false);
            break L1;
          }
        }
        ((sg) this).field_F = param0.i(0, 32);
    }

    final int o(byte param0) {
        if (param0 != -117) {
            field_H = -115;
        }
        return ((sg) this).field_Q;
    }

    final boolean a(pe param0, int param1, int param2, int param3) {
        ml[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ml var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ml[] var17 = null;
        ml[] var18 = null;
        var16 = VoidHunters.field_G;
        if (!((sg) this).d(4, 67)) {
          return true;
        } else {
          ((sg) this).field_k.i(param3 + 110);
          ((sg) this).a(param0, true, (byte) 67, true);
          if (((sg) this).q(-107)) {
            L0: {
              if (param3 == 0) {
                break L0;
              } else {
                boolean discarded$1 = ((sg) this).n(-12);
                break L0;
              }
            }
            L1: {
              var17 = ((sg) this).field_k.a((byte) 101, param1, nw.field_o, (ml[]) null, param2);
              var18 = var17;
              var5 = var18;
              var6 = 1;
              if (var5 == null) {
                break L1;
              } else {
                if ((var17.length ^ -1) < -1) {
                  var7 = -1;
                  var8 = 0;
                  L2: while (true) {
                    L3: {
                      if (var17.length <= var8) {
                        break L3;
                      } else {
                        if (var17[var8] != ((sg) this).field_k) {
                          var8++;
                          continue L2;
                        } else {
                          var7 = var8;
                          break L3;
                        }
                      }
                    }
                    var8 = wda.field_p / var18.length;
                    var9 = 0;
                    var10 = 0;
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= var18.length) {
                        if (var10 == 0) {
                          if (var10 == 0) {
                            break L1;
                          } else {
                            if (0 != kdb.field_o % 80) {
                              break L1;
                            } else {
                              qba.a(20382, param1, 19, param2, 20);
                              break L1;
                            }
                          }
                        } else {
                          if (0 != kdb.field_o % 80) {
                            break L1;
                          } else {
                            qba.a(20382, param1, 19, param2, 20);
                            break L1;
                          }
                        }
                      } else {
                        L5: {
                          var12 = var18[var11];
                          var13 = var8 - -var9;
                          if (var11 != var7) {
                            var9 = var12.a(true, false, var13);
                            break L5;
                          } else {
                            var14 = var8 / 4;
                            var9 = var13 - var14 + var12.a(true, false, var14);
                            break L5;
                          }
                        }
                        var14 = -var9 + var13;
                        if ((var14 ^ -1) < -1) {
                          L6: {
                            var15 = var14 / 32;
                            if (0 == var15) {
                              var15 = 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          param0.a(5, var12.field_n, var12.field_r, 1000, 11184895, var15, 5);
                          var10 = 1;
                          var11++;
                          continue L4;
                        } else {
                          var11++;
                          continue L4;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            L7: {
              if (var6 == 0) {
                break L7;
              } else {
                rmb.a(param2, ((sg) this).field_l, 72, -72, param1);
                break L7;
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(pe param0, boolean param1, byte param2, boolean param3) {
        L0: {
          super.a(param0, param1, param2, param3);
          if (((sg) this).field_P > 0) {
            break L0;
          } else {
            ((sg) this).field_I = ((sg) this).field_I + 1;
            break L0;
          }
        }
        L1: {
          ((sg) this).field_F = ((sg) this).field_F + 1;
          if (((sg) this).field_D) {
            ((sg) this).field_D = false;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (vdb.field_d <= ((sg) this).field_I) {
            ((sg) this).field_I = 0;
            ((sg) this).field_P = ((sg) this).f(true);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if ((((sg) this).field_P ^ -1) < -1) {
            ((sg) this).field_P = ((sg) this).field_P + sja.field_b;
            if (((sg) this).field_P > ((sg) this).f(true)) {
              ((sg) this).field_P = ((sg) this).f(true);
              if (!((sg) this).field_O) {
                break L3;
              } else {
                if (0 >= ((sg) this).field_M) {
                  break L3;
                } else {
                  ((sg) this).field_M = ((sg) this).field_M - 1;
                  break L3;
                }
              }
            } else {
              if (!((sg) this).field_O) {
                break L3;
              } else {
                if (0 >= ((sg) this).field_M) {
                  break L3;
                } else {
                  ((sg) this).field_M = ((sg) this).field_M - 1;
                  break L3;
                }
              }
            }
          } else {
            if (!((sg) this).field_O) {
              break L3;
            } else {
              if (0 >= ((sg) this).field_M) {
                break L3;
              } else {
                ((sg) this).field_M = ((sg) this).field_M - 1;
                break L3;
              }
            }
          }
        }
        L4: {
          L5: {
            if (era.field_p != 1) {
              if (-1 < ((sg) this).field_G) {
                ((sg) this).field_G = ((sg) this).field_G - 1;
                if (!((sg) this).field_O) {
                  break L5;
                } else {
                  if (((sg) this).field_M > oq.field_e) {
                    break L5;
                  } else {
                    boolean discarded$4 = ((sg) this).field_k.a(400, param2 + -20, param0, (anb) this);
                    if (-1 <= (((sg) this).field_v ^ -1)) {
                      break L4;
                    } else {
                      ((sg) this).field_v = ((sg) this).field_v - 1;
                      break L4;
                    }
                  }
                }
              } else {
                if (!((sg) this).field_O) {
                  break L5;
                } else {
                  if (((sg) this).field_M > oq.field_e) {
                    break L5;
                  } else {
                    boolean discarded$5 = ((sg) this).field_k.a(400, param2 + -20, param0, (anb) this);
                    if (-1 <= (((sg) this).field_v ^ -1)) {
                      break L4;
                    } else {
                      ((sg) this).field_v = ((sg) this).field_v - 1;
                      break L4;
                    }
                  }
                }
              }
            } else {
              L6: {
                if (!((sg) this).field_y) {
                  break L6;
                } else {
                  if (((sg) this).field_G >= oq.field_I) {
                    break L6;
                  } else {
                    ((sg) this).field_G = ((sg) this).field_G + 1;
                    break L6;
                  }
                }
              }
              if (!((sg) this).field_y) {
                if (((sg) this).field_G < -1) {
                  ((sg) this).field_G = ((sg) this).field_G - 1;
                  if (!((sg) this).field_O) {
                    break L5;
                  } else {
                    if (((sg) this).field_M > oq.field_e) {
                      break L5;
                    } else {
                      boolean discarded$6 = ((sg) this).field_k.a(400, param2 + -20, param0, (anb) this);
                      if (-1 <= (((sg) this).field_v ^ -1)) {
                        break L4;
                      } else {
                        ((sg) this).field_v = ((sg) this).field_v - 1;
                        break L4;
                      }
                    }
                  }
                } else {
                  if (-1 >= ((sg) this).field_v) {
                    break L4;
                  } else {
                    ((sg) this).field_v = ((sg) this).field_v - 1;
                    break L4;
                  }
                }
              } else {
                if (!((sg) this).field_O) {
                  break L5;
                } else {
                  if (((sg) this).field_M > oq.field_e) {
                    break L5;
                  } else {
                    boolean discarded$7 = ((sg) this).field_k.a(400, param2 + -20, param0, (anb) this);
                    if (-1 <= ((sg) this).field_v) {
                      break L4;
                    } else {
                      ((sg) this).field_v = ((sg) this).field_v - 1;
                      break L4;
                    }
                  }
                }
              }
            }
          }
          if (-1 <= (((sg) this).field_v ^ -1)) {
            break L4;
          } else {
            ((sg) this).field_v = ((sg) this).field_v - 1;
            break L4;
          }
        }
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        Object var5 = null;
        sg var6 = null;
        sg var7 = null;
        L0: {
          var4 = VoidHunters.field_G;
          var6 = (sg) (Object) param1;
          var7 = var6;
          super.b((byte) 89, param1);
          var6.field_Q = var6.field_Q;
          var6.field_N = var6.field_N;
          var6.field_u = var6.field_u;
          if (var6.field_z != null) {
            if (null == var7.field_z) {
              var7.field_z = new aoa();
              var6.field_z.b((byte) 103, (tv) (Object) var7.field_z);
              var7.field_v = var6.field_v;
              var7.field_R = var6.field_R;
              var7.field_y = var6.field_y;
              var7.field_M = var6.field_M;
              var7.field_O = var6.field_O;
              var7.field_T = var6.field_T;
              var7.field_C = var6.field_C;
              var7.field_P = var6.field_P;
              var7.field_I = var6.field_I;
              var7.field_G = var6.field_G;
              var7.field_K = var6.field_K;
              var7.field_w = var6.field_w;
              if (param0 > 54) {
                break L0;
              } else {
                var5 = null;
                ((sg) this).b((faa) null, -85);
                break L0;
              }
            } else {
              var6.field_z.b((byte) 103, (tv) (Object) var7.field_z);
              var7.field_v = var6.field_v;
              var7.field_R = var6.field_R;
              var7.field_y = var6.field_y;
              var7.field_M = var6.field_M;
              var7.field_O = var6.field_O;
              var7.field_T = var6.field_T;
              var7.field_C = var6.field_C;
              var7.field_P = var6.field_P;
              var7.field_I = var6.field_I;
              var7.field_G = var6.field_G;
              var7.field_K = var6.field_K;
              var7.field_w = var6.field_w;
              if (param0 > 54) {
                break L0;
              } else {
                var5 = null;
                ((sg) this).b((faa) null, -85);
                break L0;
              }
            }
          } else {
            var6.field_z = null;
            var7.field_v = var6.field_v;
            var7.field_R = var6.field_R;
            var7.field_y = var6.field_y;
            var7.field_M = var6.field_M;
            var7.field_O = var6.field_O;
            var7.field_T = var6.field_T;
            var7.field_C = var6.field_C;
            var7.field_P = var6.field_P;
            var7.field_I = var6.field_I;
            var7.field_G = var6.field_G;
            var7.field_K = var6.field_K;
            var7.field_w = var6.field_w;
            if (param0 > 54) {
              break L0;
            } else {
              var5 = null;
              ((sg) this).b((faa) null, -85);
              break L0;
            }
          }
        }
        L1: {
          var7.field_J = dob.a(var7.field_J, (byte) -102, var6.field_J);
          if (var6.field_S != null) {
            L2: {
              if (null == var7.field_S) {
                var7.field_S = new boa();
                break L2;
              } else {
                break L2;
              }
            }
            var6.field_S.b((byte) 89, (tv) (Object) var7.field_S);
            break L1;
          } else {
            var7.field_S = null;
            break L1;
          }
        }
        var7.field_F = var6.field_F;
    }

    final void f(int param0, int param1) {
        ((sg) this).field_A = ((sg) this).field_A | param1;
        if (param0 != 0) {
            boolean discarded$0 = ((sg) this).l((byte) -73);
        }
    }

    final void a(aoa param0, int param1) {
        if (param1 != 4) {
            int discarded$0 = ((sg) this).w(105);
        }
        ((sg) this).field_z = param0;
    }

    final int t(int param0) {
        int[] var5 = new int[2];
        int[] var2 = var5;
        ((sg) this).field_k.a(var5, (byte) -17, true);
        int var3 = var5[0] * 256 / var5[1];
        var5[1] = param0;
        var5[0] = 0;
        ((sg) this).field_k.a(var5, (byte) -17, false);
        int var4 = 256 * var5[0] / var5[1];
        if (var4 < var3) {
            var3 = var4;
        }
        return var3;
    }

    public final void b(faa param0, int param1) {
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        L0: {
          super.b(param0, -118);
          param0.a(-632, ((sg) this).field_Q, 32);
          if (param1 < -109) {
            break L0;
          } else {
            boolean discarded$7 = ((sg) this).s((byte) -86);
            break L0;
          }
        }
        L1: {
          param0.a(-632, ((sg) this).field_N, 32);
          param0.a(-632, ((sg) this).field_u, 32);
          stackOut_2_0 = (faa) param0;
          stackOut_2_1 = -76;
          stackIn_5_0 = stackOut_2_0;
          stackIn_5_1 = stackOut_2_1;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          if (((sg) this).field_z == null) {
            if (!vq.a(stackIn_5_0, stackIn_5_1, false)) {
              break L1;
            } else {
              ((sg) this).field_z.b(param0, -113);
              break L1;
            }
          } else {
            if (!vq.a(stackIn_3_0, stackIn_3_1, true)) {
              break L1;
            } else {
              ((sg) this).field_z.b(param0, -113);
              break L1;
            }
          }
        }
        L2: {
          param0.a(-632, ((sg) this).field_P, 32);
          param0.a(-632, ((sg) this).field_I, 32);
          param0.a(-632, ((sg) this).field_G, 32);
          boolean discarded$8 = vq.a(param0, 81, ((sg) this).field_y);
          boolean discarded$9 = vq.a(param0, 47, ((sg) this).field_K);
          boolean discarded$10 = vq.a(param0, 82, ((sg) this).field_O);
          param0.a(-632, ((sg) this).field_M, 32);
          boolean discarded$11 = vq.a(param0, 70, ((sg) this).field_T);
          boolean discarded$12 = vq.a(param0, -121, ((sg) this).field_w);
          boolean discarded$13 = vq.a(param0, 104, ((sg) this).field_R);
          param0.a(-632, ((sg) this).field_v, 32);
          stackOut_7_0 = 4;
          stackIn_9_0 = stackOut_7_0;
          stackIn_8_0 = stackOut_7_0;
          if (((sg) this).field_J != null) {
            stackOut_9_0 = stackIn_9_0;
            stackOut_9_1 = ((sg) this).field_J.length;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L2;
          } else {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            break L2;
          }
        }
        L3: {
          pgb.a(stackIn_10_0, stackIn_10_1, -125, param0, ((sg) this).field_J);
          stackOut_10_0 = (faa) param0;
          stackOut_10_1 = 78;
          stackIn_12_0 = stackOut_10_0;
          stackIn_12_1 = stackOut_10_1;
          stackIn_11_0 = stackOut_10_0;
          stackIn_11_1 = stackOut_10_1;
          if (null == ((sg) this).field_S) {
            stackOut_12_0 = (faa) (Object) stackIn_12_0;
            stackOut_12_1 = stackIn_12_1;
            stackOut_12_2 = 0;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            stackIn_13_2 = stackOut_12_2;
            break L3;
          } else {
            stackOut_11_0 = (faa) (Object) stackIn_11_0;
            stackOut_11_1 = stackIn_11_1;
            stackOut_11_2 = 1;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            break L3;
          }
        }
        L4: {
          if (vq.a(stackIn_13_0, stackIn_13_1, stackIn_13_2 != 0)) {
            ((sg) this).field_S.b(param0, -116);
            break L4;
          } else {
            break L4;
          }
        }
        param0.a(-632, ((sg) this).field_F, 32);
    }

    final boolean d(int param0, int param1) {
        Object var4 = null;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 > 38) {
            break L0;
          } else {
            var4 = null;
            ((sg) this).b((byte) -22, (tv) null);
            break L0;
          }
        }
        if ((param0 ^ -1) != -5) {
          if (param0 != 9) {
            return false;
          } else {
            return ((sg) this).field_O;
          }
        } else {
          if ((era.field_p ^ -1) == -2) {
            L1: {
              L2: {
                if (((sg) this).field_y) {
                  break L2;
                } else {
                  if (-1 <= (((sg) this).field_G ^ -1)) {
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L1;
            }
            return stackIn_13_0 != 0;
          } else {
            L3: {
              if (((sg) this).field_G <= pca.field_i[4].d((byte) 64)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L3;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L3;
              }
            }
            return stackIn_7_0 != 0;
          }
        }
    }

    final void z(int param0) {
        if (param0 < 77) {
            Object var3 = null;
            ((sg) this).b((faa) null, -12);
        }
        ((sg) this).field_A = 0;
    }

    final int l(int param0) {
        if (param0 != -465) {
            ((sg) this).field_P = -114;
        }
        return ((sg) this).field_v;
    }

    final int[] p(int param0) {
        if (param0 != -26448) {
            return null;
        }
        return ((sg) this).field_J;
    }

    final void a(int param0, byte param1) {
        ((sg) this).field_u = param0;
        if (param1 > -48) {
            field_E = 125;
        }
    }

    final void h(int param0, int param1) {
        if (param0 != 17704) {
            aoa discarded$0 = ((sg) this).k((byte) -15);
        }
        ((sg) this).field_N = param1;
    }

    final boolean v(int param0) {
        if (param0 != 32) {
            return false;
        }
        return ((sg) this).field_y;
    }

    final int[] A(int param0) {
        if (param0 < 21) {
            int discarded$0 = ((sg) this).y(-71);
        }
        return ((sg) this).field_x;
    }

    final boolean a(byte param0, int param1) {
        if (param0 != 11) {
            return false;
        }
        if ((((sg) this).field_P ^ -1) < -1) {
            ((sg) this).field_P = ((sg) this).field_P - param1;
            ((sg) this).d((byte) -126);
            return true;
        }
        return false;
    }

    final void u(int param0) {
        ((sg) this).field_k.f(14546);
        if (!(era.field_p != 1)) {
            ((sg) this).field_G = 0;
            ((sg) this).field_y = false;
        }
        int var2 = 90 / ((72 - param0) / 44);
    }

    public final void a(faa param0, byte param1) {
        faa stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        faa stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        faa stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_6_0 = 0;
        faa stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        L0: {
          super.a(param0, (byte) -107);
          param0.a(-632, ((sg) this).field_Q, 32);
          param0.a(-632, ((sg) this).field_N, 32);
          param0.a(-632, ((sg) this).field_u, 32);
          stackOut_0_0 = (faa) param0;
          stackOut_0_1 = -128;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (null == ((sg) this).field_z) {
            stackOut_2_0 = (faa) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (faa) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
            ((sg) this).field_z.b(param0, -116);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          param0.a(-632, ((sg) this).field_P, 32);
          param0.a(-632, ((sg) this).field_I, 32);
          param0.a(-632, ((sg) this).field_C, 32);
          param0.a(-632, ((sg) this).field_G, 32);
          boolean discarded$8 = vq.a(param0, -73, ((sg) this).field_y);
          boolean discarded$9 = vq.a(param0, 90, ((sg) this).field_K);
          boolean discarded$10 = vq.a(param0, 113, ((sg) this).field_O);
          param0.a(-632, ((sg) this).field_M, 32);
          boolean discarded$11 = vq.a(param0, -92, ((sg) this).field_T);
          boolean discarded$12 = vq.a(param0, 107, ((sg) this).field_w);
          boolean discarded$13 = vq.a(param0, -102, ((sg) this).field_R);
          param0.a(-632, ((sg) this).field_v, 32);
          stackOut_6_0 = 4;
          stackIn_9_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (((sg) this).field_J == null) {
            pgb.a(stackIn_9_0, 0, -90, param0, ((sg) this).field_J);
            if (param1 <= -91) {
              break L2;
            } else {
              boolean discarded$14 = ((sg) this).s(57);
              break L2;
            }
          } else {
            pgb.a(stackIn_7_0, ((sg) this).field_J.length, -90, param0, ((sg) this).field_J);
            if (param1 <= -91) {
              break L2;
            } else {
              boolean discarded$15 = ((sg) this).s(57);
              break L2;
            }
          }
        }
        L3: {
          stackOut_11_0 = (faa) param0;
          stackOut_11_1 = 101;
          stackIn_14_0 = stackOut_11_0;
          stackIn_14_1 = stackOut_11_1;
          stackIn_12_0 = stackOut_11_0;
          stackIn_12_1 = stackOut_11_1;
          if (null == ((sg) this).field_S) {
            if (!vq.a(stackIn_14_0, stackIn_14_1, false)) {
              break L3;
            } else {
              ((sg) this).field_S.b(param0, -118);
              break L3;
            }
          } else {
            if (!vq.a(stackIn_12_0, stackIn_12_1, true)) {
              break L3;
            } else {
              ((sg) this).field_S.b(param0, -118);
              break L3;
            }
          }
        }
        param0.a(-632, ((sg) this).field_F, 32);
    }

    final void t(byte param0) {
        int var2 = ((sg) this).a((byte) 11, fna.field_p * (-fra.field_a + 1)) ? 1 : 0;
        int var3 = 85 % ((47 - param0) / 51);
        if (!(var2 != 0)) {
            ((sg) this).field_R = false;
            ((sg) this).d((byte) 124);
            return;
        }
    }

    final int m(byte param0) {
        if (param0 != -64) {
            return 120;
        }
        return ((sg) this).field_I * 255 / Math.max(vdb.field_d, 1);
    }

    final int o(int param0) {
        int var2 = -44 / ((param0 - 33) / 44);
        return 255 * ((sg) this).field_P / Math.max(((sg) this).f(true), 1);
    }

    final void e(int param0, int param1) {
        // ifne L78
        if (-1 <= (((sg) this).field_P ^ -1)) {
            // if_icmpeq L92
            ((sg) this).field_M = 49;
        } else {
            ((sg) this).field_P = ((sg) this).field_P + param1;
            if (((sg) this).field_P <= ((sg) this).f(true)) {
                // if_icmpeq L92
                ((sg) this).field_M = 49;
            } else {
                ((sg) this).field_P = ((sg) this).f(true);
                if (param0 != -1) {
                    ((sg) this).field_M = 49;
                }
            }
        }
    }

    final void a(lta param0, int param1, pe param2) {
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
        L0: {
          var13 = VoidHunters.field_G;
          var4 = qpb.a(false, ((sg) this).field_N, 13894143);
          if (!((sg) this).j((byte) 108)) {
            break L0;
          } else {
            L1: {
              var5 = ((sg) this).b(true);
              if (var5 <= 0) {
                break L1;
              } else {
                var5 = oq.field_A * var5 / (1 + ((sg) this).field_F);
                var6 = 256;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= 5) {
                    break L1;
                  } else {
                    var8 = ((sg) this).field_F * ((var7 << 416594116) + var6);
                    var9 = ((sg) this).field_d - -((fc.a(var8, (byte) 74) >> 213571880) * (var5 >> -838818584));
                    var10 = ((sg) this).field_e + (eu.a(var8, 77) >> 826945544) * (var5 >> -527391064);
                    var11 = ((sg) this).field_d - -((fc.a(var8 + var6, (byte) -73) >> -888368184) * (var5 >> 78660712));
                    var12 = ((sg) this).field_e + (var5 >> 299618216) * (eu.a(var6 + var8, 56) >> 221532296);
                    c.a(param0.b(true, var12), param0.a(var11, (byte) 122), param0.a(var9, (byte) 116), param0.b(true, var10), -16777216, var4);
                    var7++;
                    continue L2;
                  }
                }
              }
            }
            if ((((sg) this).field_F & 8) == 0) {
              break L0;
            } else {
              var4 = var4 ^ 4473924;
              break L0;
            }
          }
        }
        L3: {
          super.a(param0, var4, param2, 16);
          if (param1 >= 119) {
            break L3;
          } else {
            ((sg) this).field_z = null;
            break L3;
          }
        }
    }

    final aoa k(byte param0) {
        if (param0 != -108) {
            int discarded$0 = ((sg) this).q((byte) -110);
        }
        return ((sg) this).field_z;
    }

    final boolean l(byte param0) {
        if (param0 != -10) {
            int discarded$0 = ((sg) this).q((byte) 25);
        }
        return null != ((sg) this).field_z ? true : false;
    }

    final void a(int param0, int param1, pe param2, int param3, int param4) {
        uj var7 = null;
        uj var8 = null;
        uj var8_ref = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          super.a(-53, param1, param2, param3, param4);
          if (param1 == 4) {
            if (era.field_p != 1) {
              if (((sg) this).field_G > 0) {
                break L0;
              } else {
                var7 = pca.field_i[4];
                var8 = var7;
                var8 = var7;
                ((sg) this).field_G = var7.d((byte) 64) - -var7.b(-25131);
                break L0;
              }
            } else {
              stackOut_3_0 = this;
              stackIn_7_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (((sg) this).field_y) {
                ((sg) this).field_y = false;
                ((sg) this).field_u = -1;
                break L0;
              } else {
                ((sg) this).field_y = true;
                ((sg) this).field_u = -1;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 != 8) {
            break L1;
          } else {
            if (!((sg) this).field_O) {
              L2: {
                stackOut_13_0 = this;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (((sg) this).field_K) {
                  stackOut_15_0 = this;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L2;
                } else {
                  stackOut_14_0 = this;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L2;
                }
              }
              ((sg) this).field_K = stackIn_16_1 != 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L3: {
          if ((param1 ^ -1) == -10) {
            L4: {
              if (!((sg) this).field_K) {
                break L4;
              } else {
                if (!((sg) this).field_O) {
                  ((sg) this).field_O = true;
                  var8_ref = pca.field_i[9];
                  ((sg) this).field_M = var8_ref.d((byte) 64) - -var8_ref.b(-25131);
                  break L4;
                } else {
                  if (param0 <= -36) {
                    break L3;
                  } else {
                    ((sg) this).field_G = -108;
                    break L3;
                  }
                }
              }
            }
            if (param0 <= -36) {
              break L3;
            } else {
              ((sg) this).field_G = -108;
              break L3;
            }
          } else {
            if (param0 <= -36) {
              break L3;
            } else {
              ((sg) this).field_G = -108;
              if (param0 <= -36) {
                break L3;
              } else {
                ((sg) this).field_G = -108;
                break L3;
              }
            }
          }
        }
    }

    final boolean g(boolean param0) {
        if (param0) {
            boolean discarded$0 = ((sg) this).r((byte) -85);
        }
        return ((sg) this).field_k.field_j == 0 ? true : false;
    }

    final int f(boolean param0) {
        if (!param0) {
            return 10;
        }
        return ((sg) this).field_C;
    }

    final void C(int param0) {
        ((sg) this).field_F = 0;
        ((sg) this).field_D = true;
        if (param0 != 32) {
            Object var3 = null;
            ((sg) this).a((faa) null, true);
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        sg var5 = null;
        boolean stackIn_35_0 = false;
        boolean stackIn_36_0 = false;
        boolean stackIn_37_0 = false;
        int stackIn_37_1 = 0;
        boolean stackIn_40_0 = false;
        boolean stackIn_41_0 = false;
        boolean stackIn_42_0 = false;
        int stackIn_42_1 = 0;
        boolean stackIn_45_0 = false;
        boolean stackIn_46_0 = false;
        boolean stackIn_47_0 = false;
        int stackIn_47_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        boolean stackOut_34_0 = false;
        boolean stackOut_36_0 = false;
        int stackOut_36_1 = 0;
        boolean stackOut_35_0 = false;
        int stackOut_35_1 = 0;
        boolean stackOut_39_0 = false;
        boolean stackOut_41_0 = false;
        int stackOut_41_1 = 0;
        boolean stackOut_40_0 = false;
        int stackOut_40_1 = 0;
        boolean stackOut_44_0 = false;
        boolean stackOut_46_0 = false;
        int stackOut_46_1 = 0;
        boolean stackOut_45_0 = false;
        int stackOut_45_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        L0: {
          super.a(param0, -85);
          var5 = (sg) (Object) param0;
          if (null == var5.field_z) {
            break L0;
          } else {
            if (null != var5.field_z) {
              var5.field_z.a((tv) (Object) var5.field_z, -49);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (var5.field_S == null) {
            break L1;
          } else {
            if (null != var5.field_S) {
              var5.field_S.a((tv) (Object) var5.field_S, -54);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var4 = 0;
          if (var5.field_Q == var5.field_Q) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int owner has changed. before=" + var5.field_Q + ", now=" + var5.field_Q);
            break L2;
          }
        }
        L3: {
          if (var5.field_N != var5.field_N) {
            System.out.println("int team has changed. before=" + var5.field_N + ", now=" + var5.field_N);
            var4 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var5.field_u != var5.field_u) {
            System.out.println("int dragging has changed. before=" + var5.field_u + ", now=" + var5.field_u);
            var4 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          aoa discarded$2 = var5.field_z;
          if (var5.field_z == null) {
            break L5;
          } else {
            if (!var5.field_z.a((byte) 89, (tv) (Object) var5.field_z)) {
              break L5;
            } else {
              var4 = 1;
              System.out.println("ShipAI ai has changed. before=" + var5.field_z + ", now=" + var5.field_z);
              break L5;
            }
          }
        }
        L6: {
          if (var5.field_P == var5.field_P) {
            break L6;
          } else {
            System.out.println("int energy has changed. before=" + var5.field_P + ", now=" + var5.field_P);
            var4 = 1;
            break L6;
          }
        }
        L7: {
          if (var5.field_I != var5.field_I) {
            System.out.println("int reloadtimer has changed. before=" + var5.field_I + ", now=" + var5.field_I);
            var4 = 1;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (var5.field_C != var5.field_C) {
            var4 = 1;
            System.out.println("int max_energy has changed. before=" + var5.field_C + ", now=" + var5.field_C);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (var5.field_G != var5.field_G) {
            var4 = 1;
            System.out.println("int repair_mode_reload has changed. before=" + var5.field_G + ", now=" + var5.field_G);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          stackOut_34_0 = var5.field_y;
          stackIn_36_0 = stackOut_34_0;
          stackIn_35_0 = stackOut_34_0;
          if (var5.field_y) {
            stackOut_36_0 = stackIn_36_0;
            stackOut_36_1 = 0;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            break L10;
          } else {
            stackOut_35_0 = stackIn_35_0;
            stackOut_35_1 = 1;
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            break L10;
          }
        }
        L11: {
          if ((stackIn_37_0 ? 1 : 0) != stackIn_37_1) {
            break L11;
          } else {
            System.out.println("boolean repair_mode_on has changed. before=" + var5.field_y + ", now=" + var5.field_y);
            var4 = 1;
            break L11;
          }
        }
        L12: {
          stackOut_39_0 = var5.field_K;
          stackIn_41_0 = stackOut_39_0;
          stackIn_40_0 = stackOut_39_0;
          if (var5.field_K) {
            stackOut_41_0 = stackIn_41_0;
            stackOut_41_1 = 0;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            break L12;
          } else {
            stackOut_40_0 = stackIn_40_0;
            stackOut_40_1 = 1;
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            break L12;
          }
        }
        L13: {
          if ((stackIn_42_0 ? 1 : 0) != stackIn_42_1) {
            break L13;
          } else {
            var4 = 1;
            System.out.println("boolean self_destruct_prepared has changed. before=" + var5.field_K + ", now=" + var5.field_K);
            break L13;
          }
        }
        L14: {
          stackOut_44_0 = var5.field_O;
          stackIn_46_0 = stackOut_44_0;
          stackIn_45_0 = stackOut_44_0;
          if (var5.field_O) {
            stackOut_46_0 = stackIn_46_0;
            stackOut_46_1 = 0;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            break L14;
          } else {
            stackOut_45_0 = stackIn_45_0;
            stackOut_45_1 = 1;
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            break L14;
          }
        }
        L15: {
          if ((stackIn_47_0 ? 1 : 0) == stackIn_47_1) {
            System.out.println("boolean self_destruct_activated has changed. before=" + var5.field_O + ", now=" + var5.field_O);
            var4 = 1;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (var5.field_M != var5.field_M) {
            System.out.println("int self_destruct_countdown has changed. before=" + var5.field_M + ", now=" + var5.field_M);
            var4 = 1;
            if (param1 < -19) {
              break L16;
            } else {
              ((sg) this).field_A = 114;
              break L16;
            }
          } else {
            if (param1 < -19) {
              break L16;
            } else {
              ((sg) this).field_A = 114;
              break L16;
            }
          }
        }
        L17: {
          if (var5.field_T) {
            stackOut_57_0 = 0;
            stackIn_58_0 = stackOut_57_0;
            break L17;
          } else {
            stackOut_56_0 = 1;
            stackIn_58_0 = stackOut_56_0;
            break L17;
          }
        }
        L18: {
          if (stackIn_58_0 == (var5.field_T ? 1 : 0)) {
            var4 = 1;
            System.out.println("boolean salvo_just_fired has changed. before=" + var5.field_T + ", now=" + var5.field_T);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          if (var5.field_w == var5.field_w) {
            break L19;
          } else {
            var4 = 1;
            System.out.println("boolean just_attached_something has changed. before=" + var5.field_w + ", now=" + var5.field_w);
            break L19;
          }
        }
        L20: {
          if (var5.field_R) {
            stackOut_65_0 = 0;
            stackIn_66_0 = stackOut_65_0;
            break L20;
          } else {
            stackOut_64_0 = 1;
            stackIn_66_0 = stackOut_64_0;
            break L20;
          }
        }
        L21: {
          stackOut_66_0 = stackIn_66_0;
          stackIn_68_0 = stackOut_66_0;
          stackIn_67_0 = stackOut_66_0;
          if (var5.field_R) {
            stackOut_68_0 = stackIn_68_0;
            stackOut_68_1 = 0;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            break L21;
          } else {
            stackOut_67_0 = stackIn_67_0;
            stackOut_67_1 = 1;
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            break L21;
          }
        }
        L22: {
          if (stackIn_69_0 == stackIn_69_1) {
            break L22;
          } else {
            System.out.println("boolean shields_on has changed. before=" + var5.field_R + ", now=" + var5.field_R);
            var4 = 1;
            break L22;
          }
        }
        L23: {
          if (var5.field_v != var5.field_v) {
            var4 = 1;
            System.out.println("int shields_toggle_cooldown has changed. before=" + var5.field_v + ", now=" + var5.field_v);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          if (ikb.a(var5.field_J, var5.field_J, false)) {
            var4 = 1;
            System.out.println("int[] last_attackers has changed. ");
            break L24;
          } else {
            break L24;
          }
        }
        boa discarded$3 = var5.field_S;
        L25: {
          if (null == var5.field_S) {
            break L25;
          } else {
            if (!var5.field_S.a((byte) -92, (tv) (Object) var5.field_S)) {
              break L25;
            } else {
              var4 = 1;
              System.out.println("ShipBlueprint target_blueprint has changed. before=" + var5.field_S + ", now=" + var5.field_S);
              break L25;
            }
          }
        }
        L26: {
          if (var5.field_F != var5.field_F) {
            System.out.println("int spawn_timer has changed. before=" + var5.field_F + ", now=" + var5.field_F);
            var4 = 1;
            if (var4 == 0) {
              break L26;
            } else {
              System.out.println("This instance of Ship has changed, where owner=" + var5.field_Q);
              break L26;
            }
          } else {
            if (var4 == 0) {
              break L26;
            } else {
              System.out.println("This instance of Ship has changed, where owner=" + var5.field_Q);
              break L26;
            }
          }
        }
    }

    public sg() {
        ((sg) this).field_u = -1;
        ((sg) this).field_P = jo.field_e;
        ((sg) this).field_z = null;
        ((sg) this).field_N = 0;
        ((sg) this).field_Q = -1;
        ((sg) this).field_x = null;
        ((sg) this).field_L = null;
    }

    static {
    }
}
