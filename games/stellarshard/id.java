/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class id implements uk, pj {
    int field_c;
    int field_h;
    int field_i;
    static oj field_g;
    bd field_a;
    private boolean field_b;
    int field_d;
    int field_j;
    int field_f;
    int field_o;
    static String field_l;
    int field_k;
    int field_m;
    private int field_e;
    int field_n;

    public final void a(rj param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        uj var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vk var17 = null;
        vk var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var16 = stellarshard.field_B;
        if (param5 == param1) {
          return;
        } else {
          L0: {
            if (param0.e(param3)) {
              L1: {
                var17 = ((id) this).b(param0, (byte) 111);
                var18 = var17;
                if (param5 >= param1) {
                  var9 = param5;
                  var8 = param1;
                  break L1;
                } else {
                  var9 = param1;
                  var8 = param5;
                  break L1;
                }
              }
              var10 = var18.a(111, var8);
              var11 = var18.a(62, var9);
              gg.a(23, param4 + (param0.field_w - -param0.field_p), param2 - -param0.field_k, param0.field_t + param0.field_k + param2, param0.field_w + param4);
              var12 = var10;
              L2: while (true) {
                if (var11 < var12) {
                  id.b((byte) -58);
                  break L0;
                } else {
                  L3: {
                    var13 = var17.field_a[var12];
                    if (var10 != var12) {
                      stackOut_12_0 = var13.field_a[0];
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = var18.b(var8, param3 ^ 109);
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  L4: {
                    var14 = stackIn_13_0;
                    if (var12 == var11) {
                      stackOut_17_0 = var18.b(var9, -128);
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      if (var13 == null) {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = var13.field_a[-1 + var13.field_a.length];
                        stackIn_18_0 = stackOut_15_0;
                        break L4;
                      }
                    }
                  }
                  var15 = stackIn_18_0;
                  n.field_i.a(this.a(param0, var14, param4, false), ((id) this).field_o, ((id) this).field_o >>> -783129448, param0.field_n + (param2 + param0.field_k) - -((id) this).field_c - -var13.field_b, var13.field_c, var15 + -var14, (byte) 76);
                  var12++;
                  continue L2;
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    public final void a(int param0, boolean param1, int param2, rj param3, int param4) {
        int var7 = 0;
        uj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vk var13 = null;
        vk var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        L0: {
          if (param3.e(0)) {
            L1: {
              var13 = ((id) this).b(param3, (byte) 100);
              var14 = var13;
              var7 = var14.a(74, param0);
              var8 = var13.field_a[var7];
              var9 = var14.b(param0, -126);
              var10 = this.a(param3, var9, param4, false);
              var11 = ((id) this).a((byte) -64, param3, param2) + Math.max(0, var8.field_b);
              stackOut_2_0 = ((id) this).a((byte) -117, param3, param2);
              stackOut_2_1 = this.a((byte) -89, param3);
              stackOut_2_2 = var8.field_c;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              stackIn_3_2 = stackOut_2_2;
              if (1 + var7 >= var14.field_a.length) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = var8.field_c;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                break L1;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = var13.field_a[1 + var7].field_b;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_5_3 = stackOut_3_3;
                break L1;
              }
            }
            var12 = stackIn_5_0 + Math.min(stackIn_5_1, Math.min(stackIn_5_2, stackIn_5_3));
            gg.a(61, param4 - (-param3.field_w - param3.field_p), param3.field_k + param2, param2 - (-param3.field_k + -param3.field_t), param3.field_w + param4);
            n.field_i.a(((id) this).field_n, var11, 10066329, var10, var10, var12);
            id.b((byte) -58);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1) {
          ((id) this).field_j = -62;
          return;
        } else {
          return;
        }
    }

    public final int a(int param0, rj param1, int param2) {
        if (param0 != 0) {
            return 44;
        }
        return this.a(param1, 0, param2, false);
    }

    public final int a(rj param0, int param1) {
        if (param1 != 28361) {
          id.a(true);
          vk discarded$4 = ((id) this).b(param0, (byte) 125);
          return param0.field_r.a(17201) - -((id) this).field_c + ((id) this).field_k;
        } else {
          vk discarded$5 = ((id) this).b(param0, (byte) 125);
          return param0.field_r.a(17201) - -((id) this).field_c + ((id) this).field_k;
        }
    }

    public final int a(byte param0) {
        if (param0 != -73) {
          field_l = null;
          return ((id) this).field_a.field_N + ((id) this).field_a.field_r;
        } else {
          return ((id) this).field_a.field_N + ((id) this).field_a.field_r;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        pf.field_c = true;
        if (param0 != -4) {
          L0: {
            field_l = null;
            vc.field_a = 15000L + ih.a((byte) -98);
            if (eg.field_d != 11) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            vc.field_a = 15000L + ih.a((byte) -98);
            if (eg.field_d != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final int a(rj param0, byte param1) {
        Object var4 = null;
        if (param1 < 25) {
          var4 = null;
          this.a(-8, -64, -12, -116, -119, -62, (rj) null, 87);
          vk discarded$4 = ((id) this).b(param0, (byte) 111);
          return param0.field_r.a(false) - (-((id) this).field_m + -((id) this).field_f);
        } else {
          vk discarded$5 = ((id) this).b(param0, (byte) 111);
          return param0.field_r.a(false) - (-((id) this).field_m + -((id) this).field_f);
        }
    }

    private final int a(int param0, rj param1, byte param2, int param3) {
        if (param2 >= -122) {
          return 14;
        } else {
          return param1.field_k + (param3 + ((id) this).field_c) + (param1.field_n - -param0);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 1392322465) {
            field_g = null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, rj param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        Object var14 = null;
        var13 = stellarshard.field_B;
        gg.a(83, param3 + (param6.field_w + param6.field_p), param2 + param6.field_k, param6.field_k + param2 - -param6.field_t, param6.field_w + param3);
        var9 = ((id) this).a(param0 + -27246, param6);
        var10 = this.a((byte) -89, param6);
        if (!((id) this).field_b) {
          L0: {
            var12 = ((id) this).field_d;
            if (0 != var12) {
              if ((var12 ^ -1) != -3) {
                if (3 != var12) {
                  if (var12 != 1) {
                    var11 = (-((id) this).field_a.field_r + var10 - ((id) this).field_a.field_N >> -474684703) + ((id) this).field_a.field_N;
                    break L0;
                  } else {
                    var11 = (-((id) this).field_a.field_r + var10 - ((id) this).field_a.field_N >> -474684703) + ((id) this).field_a.field_N;
                    var12 = ((id) this).field_h;
                    if (var12 != 0) {
                      if (-4 != (var12 ^ -1)) {
                        if (1 != var12) {
                          if (2 != var12) {
                            L1: {
                              id.b((byte) -58);
                              if (param0 == 0) {
                                break L1;
                              } else {
                                var14 = null;
                                int discarded$22 = this.a((byte) 2, (rj) null);
                                break L1;
                              }
                            }
                            return;
                          } else {
                            L2: {
                              ((id) this).field_a.b(((id) this).b(param6, 0), this.a(param6, param4, param3, false) - -var9, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                              id.b((byte) -58);
                              if (param0 == 0) {
                                break L2;
                              } else {
                                var14 = null;
                                int discarded$23 = this.a((byte) 2, (rj) null);
                                break L2;
                              }
                            }
                            return;
                          }
                        } else {
                          L3: {
                            ((id) this).field_a.c(((id) this).b(param6, 0), this.a(param6, param4, param3, false) + (var9 >> 650109889), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                            id.b((byte) -58);
                            if (param0 == 0) {
                              break L3;
                            } else {
                              var14 = null;
                              int discarded$24 = this.a((byte) 2, (rj) null);
                              break L3;
                            }
                          }
                          return;
                        }
                      } else {
                        L4: {
                          ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                          id.b((byte) -58);
                          if (param0 == 0) {
                            break L4;
                          } else {
                            var14 = null;
                            int discarded$25 = this.a((byte) 2, (rj) null);
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      L5: {
                        ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                        id.b((byte) -58);
                        if (param0 == 0) {
                          break L5;
                        } else {
                          var14 = null;
                          int discarded$26 = this.a((byte) 2, (rj) null);
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var11 = (-((id) this).field_a.field_r + var10 - ((id) this).field_a.field_N >> -474684703) + ((id) this).field_a.field_N;
                  var12 = ((id) this).field_h;
                  if (var12 != 0) {
                    if (-4 != (var12 ^ -1)) {
                      if (1 != var12) {
                        if (2 != var12) {
                          L6: {
                            id.b((byte) -58);
                            if (param0 == 0) {
                              break L6;
                            } else {
                              var14 = null;
                              int discarded$27 = this.a((byte) 2, (rj) null);
                              break L6;
                            }
                          }
                          return;
                        } else {
                          L7: {
                            ((id) this).field_a.b(((id) this).b(param6, 0), this.a(param6, param4, param3, false) - -var9, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                            id.b((byte) -58);
                            if (param0 == 0) {
                              break L7;
                            } else {
                              var14 = null;
                              int discarded$28 = this.a((byte) 2, (rj) null);
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          ((id) this).field_a.c(((id) this).b(param6, 0), this.a(param6, param4, param3, false) + (var9 >> 650109889), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                          id.b((byte) -58);
                          if (param0 == 0) {
                            break L8;
                          } else {
                            var14 = null;
                            int discarded$29 = this.a((byte) 2, (rj) null);
                            break L8;
                          }
                        }
                        return;
                      }
                    } else {
                      L9: {
                        ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                        id.b((byte) -58);
                        if (param0 == 0) {
                          break L9;
                        } else {
                          var14 = null;
                          int discarded$30 = this.a((byte) 2, (rj) null);
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                      id.b((byte) -58);
                      if (param0 == 0) {
                        break L10;
                      } else {
                        var14 = null;
                        int discarded$31 = this.a((byte) 2, (rj) null);
                        break L10;
                      }
                    }
                    return;
                  }
                }
              } else {
                var11 = var10 - ((id) this).field_a.field_r;
                var12 = ((id) this).field_h;
                if (var12 != 0) {
                  if (-4 != (var12 ^ -1)) {
                    if (1 != var12) {
                      if (2 != var12) {
                        L11: {
                          id.b((byte) -58);
                          if (param0 == 0) {
                            break L11;
                          } else {
                            var14 = null;
                            int discarded$32 = this.a((byte) 2, (rj) null);
                            break L11;
                          }
                        }
                        return;
                      } else {
                        L12: {
                          ((id) this).field_a.b(((id) this).b(param6, 0), this.a(param6, param4, param3, false) - -var9, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                          id.b((byte) -58);
                          if (param0 == 0) {
                            break L12;
                          } else {
                            var14 = null;
                            int discarded$33 = this.a((byte) 2, (rj) null);
                            break L12;
                          }
                        }
                        return;
                      }
                    } else {
                      L13: {
                        ((id) this).field_a.c(((id) this).b(param6, 0), this.a(param6, param4, param3, false) + (var9 >> 650109889), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                        id.b((byte) -58);
                        if (param0 == 0) {
                          break L13;
                        } else {
                          var14 = null;
                          int discarded$34 = this.a((byte) 2, (rj) null);
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                      id.b((byte) -58);
                      if (param0 == 0) {
                        break L14;
                      } else {
                        var14 = null;
                        int discarded$35 = this.a((byte) 2, (rj) null);
                        break L14;
                      }
                    }
                    return;
                  }
                } else {
                  L15: {
                    ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
                    id.b((byte) -58);
                    if (param0 == 0) {
                      break L15;
                    } else {
                      var14 = null;
                      int discarded$36 = this.a((byte) 2, (rj) null);
                      break L15;
                    }
                  }
                  return;
                }
              }
            } else {
              var11 = ((id) this).field_a.field_N;
              break L0;
            }
          }
          var12 = ((id) this).field_h;
          if (var12 != 0) {
            if (-4 != (var12 ^ -1)) {
              if (1 != var12) {
                if (2 == var12) {
                  ((id) this).field_a.b(((id) this).b(param6, 0), this.a(param6, param4, param3, false) - -var9, var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                  id.b((byte) -58);
                  if (param0 != 0) {
                    var14 = null;
                    int discarded$37 = this.a((byte) 2, (rj) null);
                    return;
                  } else {
                    return;
                  }
                } else {
                  id.b((byte) -58);
                  if (param0 != 0) {
                    var14 = null;
                    int discarded$38 = this.a((byte) 2, (rj) null);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((id) this).field_a.c(((id) this).b(param6, 0), this.a(param6, param4, param3, false) + (var9 >> 650109889), var11 + this.a(param5, param6, (byte) -127, param2), param7, param1);
                id.b((byte) -58);
                if (param0 != 0) {
                  var14 = null;
                  int discarded$39 = this.a((byte) 2, (rj) null);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
              id.b((byte) -58);
              if (param0 != 0) {
                var14 = null;
                int discarded$40 = this.a((byte) 2, (rj) null);
                return;
              } else {
                return;
              }
            }
          } else {
            ((id) this).field_a.a(((id) this).b(param6, param0 ^ 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -128, param2) + var11, param7, param1);
            id.b((byte) -58);
            if (param0 != 0) {
              var14 = null;
              int discarded$41 = this.a((byte) 2, (rj) null);
              return;
            } else {
              return;
            }
          }
        } else {
          int discarded$42 = ((id) this).field_a.a(((id) this).b(param6, 0), this.a(param6, param4, param3, false), this.a(param5, param6, (byte) -126, param2), var9, var10, param7, param1, ((id) this).field_h, ((id) this).field_d, ((id) this).field_j);
          id.b((byte) -58);
          if (param0 == 0) {
            return;
          } else {
            var14 = null;
            int discarded$43 = this.a((byte) 2, (rj) null);
            return;
          }
        }
    }

    public void a(boolean param0, int param1, int param2, rj param3, int param4) {
        if (null != ((id) this).field_a) {
          if (param4 != 4549) {
            ((id) this).field_c = 84;
            this.a(param3, param1, 0, param2);
            return;
          } else {
            this.a(param3, param1, 0, param2);
            return;
          }
        } else {
          return;
        }
    }

    private final void b(byte param0, rj param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        if (param1.field_r == null) {
          param1.field_r = (vk) (Object) new pd();
          var3 = ((id) this).a(-27246, param1);
          var4 = this.a((byte) -89, param1);
          if (param0 <= 77) {
            L0: {
              ((id) this).field_e = 29;
              var6 = ((id) this).field_d;
              if (var6 != 0) {
                if (2 != var6) {
                  L1: {
                    if (-4 != (var6 ^ -1)) {
                      if (1 == var6) {
                        break L1;
                      } else {
                        var5 = (var4 - ((id) this).field_a.field_N - ((id) this).field_a.field_r >> 1392322465) + ((id) this).field_a.field_N;
                        var6 = ((id) this).field_h;
                        if (-1 != (var6 ^ -1)) {
                          if (var6 != 3) {
                            L2: {
                              if (-2 != (var6 ^ -1)) {
                                if (var6 != 2) {
                                  break L2;
                                } else {
                                  if (param1.field_r instanceof pd) {
                                    ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                                    break L2;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                if (!(param1.field_r instanceof pd)) {
                                  break L2;
                                } else {
                                  ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                                  return;
                                }
                              }
                            }
                            return;
                          } else {
                            if (!(param1.field_r instanceof pd)) {
                              return;
                            } else {
                              ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                              return;
                            }
                          }
                        } else {
                          if (!(param1.field_r instanceof pd)) {
                            return;
                          } else {
                            ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                            return;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                  var5 = (var4 - ((id) this).field_a.field_N - ((id) this).field_a.field_r >> 1392322465) + ((id) this).field_a.field_N;
                  break L0;
                } else {
                  L3: {
                    var5 = -((id) this).field_a.field_r + var4;
                    var6 = ((id) this).field_h;
                    if (-1 != (var6 ^ -1)) {
                      if (var6 != 3) {
                        if (-2 != (var6 ^ -1)) {
                          if (var6 == 2) {
                            if (param1.field_r instanceof pd) {
                              ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                              break L3;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (!(param1.field_r instanceof pd)) {
                            break L3;
                          } else {
                            ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                            return;
                          }
                        }
                      } else {
                        L4: {
                          if (!(param1.field_r instanceof pd)) {
                            break L4;
                          } else {
                            ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      if (!(param1.field_r instanceof pd)) {
                        break L3;
                      } else {
                        ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                        return;
                      }
                    }
                  }
                  return;
                }
              } else {
                var5 = ((id) this).field_a.field_N;
                break L0;
              }
            }
            var6 = ((id) this).field_h;
            if (-1 != (var6 ^ -1)) {
              if (var6 != 3) {
                L5: {
                  if (-2 != (var6 ^ -1)) {
                    if (var6 != 2) {
                      break L5;
                    } else {
                      if (param1.field_r instanceof pd) {
                        ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                        break L5;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (!(param1.field_r instanceof pd)) {
                      break L5;
                    } else {
                      ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                      return;
                    }
                  }
                }
                return;
              } else {
                if (!(param1.field_r instanceof pd)) {
                  return;
                } else {
                  ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                  return;
                }
              }
            } else {
              if (!(param1.field_r instanceof pd)) {
                return;
              } else {
                ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                return;
              }
            }
          } else {
            L6: {
              var6 = ((id) this).field_d;
              if (var6 != 0) {
                if (2 != var6) {
                  L7: {
                    if (-4 != (var6 ^ -1)) {
                      if (1 != var6) {
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  var5 = (var4 - ((id) this).field_a.field_N - ((id) this).field_a.field_r >> 1392322465) + ((id) this).field_a.field_N;
                  break L6;
                } else {
                  L8: {
                    L9: {
                      var5 = -((id) this).field_a.field_r + var4;
                      var6 = ((id) this).field_h;
                      if (-1 != (var6 ^ -1)) {
                        if (var6 != 3) {
                          if (-2 != (var6 ^ -1)) {
                            if (var6 != 2) {
                              break L8;
                            } else {
                              if (param1.field_r instanceof pd) {
                                ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            if (!(param1.field_r instanceof pd)) {
                              break L8;
                            } else {
                              ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                              break L8;
                            }
                          }
                        } else {
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    if (!(param1.field_r instanceof pd)) {
                      break L8;
                    } else {
                      ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                var5 = ((id) this).field_a.field_N;
                break L6;
              }
            }
            var6 = ((id) this).field_h;
            if (-1 != (var6 ^ -1)) {
              if (var6 != 3) {
                L10: {
                  if (-2 != (var6 ^ -1)) {
                    if (var6 != 2) {
                      break L10;
                    } else {
                      if (param1.field_r instanceof pd) {
                        ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                        break L10;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (!(param1.field_r instanceof pd)) {
                      break L10;
                    } else {
                      ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                      return;
                    }
                  }
                }
                return;
              } else {
                L11: {
                  if (!(param1.field_r instanceof pd)) {
                    break L11;
                  } else {
                    ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                    break L11;
                  }
                }
                return;
              }
            } else {
              L12: {
                if (!(param1.field_r instanceof pd)) {
                  break L12;
                } else {
                  ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                  break L12;
                }
              }
              return;
            }
          }
        } else {
          L13: {
            var3 = ((id) this).a(-27246, param1);
            var4 = this.a((byte) -89, param1);
            if (param0 > 77) {
              break L13;
            } else {
              ((id) this).field_e = 29;
              break L13;
            }
          }
          L14: {
            var6 = ((id) this).field_d;
            if (var6 != 0) {
              if (2 != var6) {
                L15: {
                  if (-4 != (var6 ^ -1)) {
                    if (1 != var6) {
                      break L15;
                    } else {
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                var5 = (var4 - ((id) this).field_a.field_N - ((id) this).field_a.field_r >> 1392322465) + ((id) this).field_a.field_N;
                break L14;
              } else {
                L16: {
                  L17: {
                    var5 = -((id) this).field_a.field_r + var4;
                    var6 = ((id) this).field_h;
                    if (-1 != (var6 ^ -1)) {
                      if (var6 != 3) {
                        if (-2 != (var6 ^ -1)) {
                          if (var6 != 2) {
                            break L16;
                          } else {
                            if (param1.field_r instanceof pd) {
                              ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          if (!(param1.field_r instanceof pd)) {
                            break L16;
                          } else {
                            ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                            break L16;
                          }
                        }
                      } else {
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                  if (!(param1.field_r instanceof pd)) {
                    break L16;
                  } else {
                    ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                    break L16;
                  }
                }
                return;
              }
            } else {
              var5 = ((id) this).field_a.field_N;
              break L14;
            }
          }
          var6 = ((id) this).field_h;
          if (-1 != (var6 ^ -1)) {
            if (var6 != 3) {
              L18: {
                if (-2 != (var6 ^ -1)) {
                  if (var6 != 2) {
                    break L18;
                  } else {
                    if (param1.field_r instanceof pd) {
                      ((pd) (Object) param1.field_r).a(var3, ((id) this).field_a, var5, ((id) this).b(param1, 0), (byte) 22);
                      break L18;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (!(param1.field_r instanceof pd)) {
                    break L18;
                  } else {
                    ((pd) (Object) param1.field_r).a(true, ((id) this).b(param1, 0), var5, var3 >> 588558657, ((id) this).field_a);
                    return;
                  }
                }
              }
              return;
            } else {
              L19: {
                if (!(param1.field_r instanceof pd)) {
                  break L19;
                } else {
                  ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                  break L19;
                }
              }
              return;
            }
          } else {
            L20: {
              if (!(param1.field_r instanceof pd)) {
                break L20;
              } else {
                ((pd) (Object) param1.field_r).a(0, ((id) this).field_a, ((id) this).b(param1, 0), 0, var5);
                break L20;
              }
            }
            return;
          }
        }
    }

    final static void a(boolean param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = stellarshard.field_B;
              if (od.field_v != null) {
                od.field_v.a((byte) 112);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (ib.field_k == null) {
                break L1;
              } else {
                ib.field_k.a((byte) -103);
                break L1;
              }
            }
            L2: {
              if (param0) {
                break L2;
              } else {
                id.a(true);
                break L2;
              }
            }
            L3: {
              if (ma.field_s == null) {
                break L3;
              } else {
                try {
                  L4: {
                    ma.field_s.a(-4506);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              }
            }
            if (null != df.field_d) {
              var1 = 0;
              L6: while (true) {
                if (df.field_d.length > var1) {
                  if (df.field_d[var1] != null) {
                    try {
                      L7: {
                        df.field_d[var1].a(-4506);
                        var1++;
                        break L7;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        var2 = (IOException) (Object) decompiledCaughtException;
                        var1++;
                        break L8;
                      }
                    }
                    continue L6;
                  } else {
                    var1++;
                    continue L6;
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(rj param0, int param1, int param2, boolean param3) {
        Object var6 = null;
        if (param3) {
          var6 = null;
          String discarded$2 = ((id) this).b((rj) null, 81);
          return param0.field_l + (param2 + param0.field_w + ((id) this).field_m) - -param1;
        } else {
          return param0.field_l + (param2 + param0.field_w + ((id) this).field_m) - -param1;
        }
    }

    public final vk b(rj param0, byte param1) {
        if (null != param0.field_r) {
          if (!((id) this).field_b) {
            this.b((byte) 122, param0);
            if (param1 <= 93) {
              ((id) this).field_b = true;
              return param0.field_r;
            } else {
              return param0.field_r;
            }
          } else {
            ((pd) (Object) param0.field_r).a(((id) this).field_d, ((id) this).field_j, ((id) this).a(-27246, param0), ((id) this).field_h, ((id) this).field_a, this.a((byte) -89, param0), ((id) this).b(param0, 0), (byte) -100);
            if (param1 > 93) {
              return param0.field_r;
            } else {
              ((id) this).field_b = true;
              return param0.field_r;
            }
          }
        } else {
          param0.field_r = (vk) (Object) new pd();
          if (!((id) this).field_b) {
            this.b((byte) 122, param0);
            if (param1 > 93) {
              return param0.field_r;
            } else {
              ((id) this).field_b = true;
              return param0.field_r;
            }
          } else {
            ((pd) (Object) param0.field_r).a(((id) this).field_d, ((id) this).field_j, ((id) this).a(-27246, param0), ((id) this).field_h, ((id) this).field_a, this.a((byte) -89, param0), ((id) this).b(param0, 0), (byte) -100);
            if (param1 > 93) {
              return param0.field_r;
            } else {
              ((id) this).field_b = true;
              return param0.field_r;
            }
          }
        }
    }

    public final int a(int param0, rj param1) {
        if (param0 != -27246) {
          ((id) this).field_i = 49;
          return -((id) this).field_m + param1.field_p + -((id) this).field_f;
        } else {
          return -((id) this).field_m + param1.field_p + -((id) this).field_f;
        }
    }

    String b(rj param0, int param1) {
        if (param1 != 0) {
            Object var4 = null;
            int discarded$0 = this.a((byte) -122, (rj) null);
            return param0.field_m;
        }
        return param0.field_m;
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    public final int a(int param0, rj param1, int param2, int param3, int param4, int param5) {
        vk discarded$0 = ((id) this).b(param1, (byte) 115);
        int var7 = 63 % ((-53 - param0) / 37);
        return param1.field_r.a(param5 + -((id) this).a(0, param1, param2), (byte) -53, -((id) this).a((byte) 118, param1, param4) + param3);
    }

    public final int a(byte param0, rj param1, int param2) {
        int var4 = -54 % ((param0 - 46) / 41);
        return this.a(0, param1, (byte) -126, param2);
    }

    private final int a(byte param0, rj param1) {
        if (param0 != -89) {
          ((id) this).field_b = false;
          return -((id) this).field_k + param1.field_t + -((id) this).field_c;
        } else {
          return -((id) this).field_k + param1.field_t + -((id) this).field_c;
        }
    }

    final static void b(byte param0) {
        ma var1_ref = null;
        Object var1 = null;
        if (param0 != -58) {
            boolean discarded$0 = id.b(46);
            var1_ref = (ma) (Object) dd.field_g.c((byte) -111);
            if (!(var1_ref != null)) {
                throw new IllegalStateException();
            }
            ti.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_r);
            ti.d(var1_ref.field_t, var1_ref.field_u, var1_ref.field_n, var1_ref.field_l);
            var1_ref.field_p = null;
            mb.field_b.b(param0 + -61, (gg) (Object) var1_ref);
            return;
        }
        var1_ref = (ma) (Object) dd.field_g.c((byte) -111);
        if (!(var1_ref != null)) {
            throw new IllegalStateException();
        }
        ti.a(var1_ref.field_p, var1_ref.field_q, var1_ref.field_r);
        ti.d(var1_ref.field_t, var1_ref.field_u, var1_ref.field_n, var1_ref.field_l);
        var1_ref.field_p = null;
        mb.field_b.b(param0 + -61, (gg) (Object) var1_ref);
    }

    private final void a(rj param0, int param1, int param2, int param3) {
        this.a(param2, ((id) this).field_e, param3, param1, 0, 0, param0, ((id) this).field_i);
    }

    protected id() {
    }

    final void a(id param0, byte param1) {
        param0.field_f = ((id) this).field_f;
        param0.field_d = ((id) this).field_d;
        param0.field_m = ((id) this).field_m;
        param0.field_o = ((id) this).field_o;
        param0.field_b = ((id) this).field_b;
        param0.field_c = ((id) this).field_c;
        param0.field_e = ((id) this).field_e;
        param0.field_j = ((id) this).field_j;
        param0.field_a = ((id) this).field_a;
        param0.field_n = ((id) this).field_n;
        if (param1 != -34) {
          ((id) this).field_d = -80;
          param0.field_k = ((id) this).field_k;
          param0.field_i = ((id) this).field_i;
          param0.field_h = ((id) this).field_h;
          return;
        } else {
          param0.field_k = ((id) this).field_k;
          param0.field_i = ((id) this).field_i;
          param0.field_h = ((id) this).field_h;
          return;
        }
    }

    id(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((id) this).field_h = param7;
        ((id) this).field_c = param3;
        ((id) this).field_j = param9;
        ((id) this).field_o = param11;
        ((id) this).field_b = param12 ? true : false;
        ((id) this).field_m = param1;
        ((id) this).field_e = param6;
        ((id) this).field_f = param2;
        ((id) this).field_i = param5;
        ((id) this).field_a = param0;
        ((id) this).field_n = param10;
        ((id) this).field_k = param4;
        ((id) this).field_d = param8;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new oj();
        field_l = "Mouse over an icon for details";
    }
}
