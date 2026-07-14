/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jm implements pf, ac {
    static volatile boolean field_j;
    private int field_c;
    int field_l;
    static String field_b;
    int field_i;
    private boolean field_n;
    int field_m;
    int field_k;
    int field_f;
    int field_h;
    int field_a;
    dj field_g;
    int field_e;
    int field_d;
    int field_o;

    public final int a(int param0, int param1, qm param2) {
        if (param1 != -13372) {
            ((jm) this).field_o = 75;
        }
        return this.a(param0, 0, (byte) 120, param2);
    }

    final static void a(int param0, byte param1, boolean param2, na param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        nl[] var8_ref_nl__ = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nl var13_ref_nl = null;
        int var14 = 0;
        int var15 = 0;
        nl[] var16 = null;
        nl[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        nl[][] stackIn_4_0 = null;
        nl[][] stackIn_5_0 = null;
        nl[][] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_50_0 = 0;
        nl[][] stackOut_3_0 = null;
        nl[][] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        nl[][] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == -25) {
          L0: {
            if (param6 >= param5) {
              var8 = 1;
              var9 = 0;
              L1: while (true) {
                if (var9 >= um.field_a.length) {
                  if (var8 != 0) {
                    bg.field_a = true;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  var21 = um.field_a[var9];
                  var20 = var21;
                  var19 = var20;
                  var18 = var19;
                  var10 = var18;
                  var11 = 0;
                  var12 = 0;
                  L2: while (true) {
                    if (var12 >= var21.length) {
                      L3: {
                        if (var11 != 0) {
                          break L3;
                        } else {
                          if (param6 == vf.field_l) {
                            break L3;
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      }
                      var12 = 0;
                      L4: while (true) {
                        if (var21.length <= var12) {
                          var8 = 0;
                          var9++;
                          continue L1;
                        } else {
                          var13 = var21[var12];
                          if (0 == (var13 ^ -1)) {
                            nb.field_d = true;
                            var12 += 2;
                            continue L4;
                          } else {
                            if (param6 > var13) {
                              tk.field_q[var13] = true;
                              var12 += 2;
                              continue L4;
                            } else {
                              var12 += 2;
                              continue L4;
                            }
                          }
                        }
                      }
                    } else {
                      L5: {
                        var13 = var21[var12];
                        var14 = var10[var12 - -1];
                        if (var13 == -1) {
                          if (var14 != ao.field_h[param0]) {
                            break L5;
                          } else {
                            var12 += 2;
                            continue L2;
                          }
                        } else {
                          L6: {
                            if (var13 != param6) {
                              break L6;
                            } else {
                              if (param4 == var14) {
                                var11 = 1;
                                var12 += 2;
                                continue L2;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (param6 > var13) {
                            if ((qa.field_l[var13] & 255) != var14) {
                              break L5;
                            } else {
                              var12 += 2;
                              continue L2;
                            }
                          } else {
                            var9++;
                            continue L1;
                          }
                        }
                      }
                      var12 = var12;
                      var9++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              L7: {
                stackOut_3_0 = s.field_e;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (-1 == param6) {
                  stackOut_5_0 = (nl[][]) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L7;
                } else {
                  stackOut_4_0 = (nl[][]) (Object) stackIn_4_0;
                  stackOut_4_1 = 4 - -param6;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L7;
                }
              }
              L8: {
                var16 = (nl[]) (Object) stackIn_6_0[stackIn_6_1];
                var17 = var16;
                var8_ref_nl__ = var17;
                var9 = 1;
                if (param2) {
                  if (param6 == -1) {
                    var10_int = 0;
                    L9: while (true) {
                      if (ao.field_h.length <= var10_int) {
                        break L8;
                      } else {
                        if (-1 != (gh.field_E[var10_int / 8] & 1 << (7 & var10_int) ^ -1)) {
                          var9 = 0;
                          break L8;
                        } else {
                          var10_int++;
                          continue L9;
                        }
                      }
                    }
                  } else {
                    var10_int = 0;
                    L10: while (true) {
                      L11: {
                        if (var10_int >= var16.length + -1) {
                          break L11;
                        } else {
                          if (0 != (ng.field_D[(param7 - -var10_int) / 8] & 1 << (var10_int + param7 & 7))) {
                            var9 = 0;
                            break L11;
                          } else {
                            var10_int++;
                            continue L10;
                          }
                        }
                      }
                      param7 = param7 + (in.field_Nb[param6] & 255);
                      break L8;
                    }
                  }
                } else {
                  break L8;
                }
              }
              var17 = var8_ref_nl__;
              var10_int = 0;
              var11 = 0;
              L12: while (true) {
                L13: {
                  stackOut_23_0 = var11 ^ -1;
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_24_0 = stackOut_23_0;
                  if (-1 == param6) {
                    stackOut_25_0 = stackIn_25_0;
                    stackOut_25_1 = ao.field_h.length;
                    stackIn_26_0 = stackOut_25_0;
                    stackIn_26_1 = stackOut_25_1;
                    break L13;
                  } else {
                    stackOut_24_0 = stackIn_24_0;
                    stackOut_24_1 = var17.length + -1;
                    stackIn_26_0 = stackOut_24_0;
                    stackIn_26_1 = stackOut_24_1;
                    break L13;
                  }
                }
                if (stackIn_26_0 <= (stackIn_26_1 ^ -1)) {
                  if (var10_int == 0) {
                    var11 = 0;
                    L14: while (true) {
                      if (var11 >= var17.length - 1) {
                        break L0;
                      } else {
                        L15: {
                          if (param6 != -1) {
                            qa.field_l[param6] = (byte)var11;
                            break L15;
                          } else {
                            param0 = var11;
                            break L15;
                          }
                        }
                        jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                        if (bg.field_a) {
                          return;
                        } else {
                          var11++;
                          continue L14;
                        }
                      }
                    }
                  } else {
                    break L0;
                  }
                } else {
                  L16: {
                    if (param6 == -1) {
                      param0 = var11;
                      break L16;
                    } else {
                      qa.field_l[param6] = (byte)var11;
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if ((param6 ^ -1) != 0) {
                        break L18;
                      } else {
                        if ((ao.field_h.length ^ -1) != -2) {
                          break L18;
                        } else {
                          var12 = 1;
                          break L17;
                        }
                      }
                    }
                    var13_ref_nl = var8_ref_nl__[var11 + 1];
                    if (param2) {
                      L19: {
                        if (!var13_ref_nl.field_ab) {
                          if (var9 != 0) {
                            if (var13_ref_nl.field_ub) {
                              stackOut_48_0 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              break L19;
                            } else {
                              stackOut_47_0 = 0;
                              stackIn_50_0 = stackOut_47_0;
                              break L19;
                            }
                          } else {
                            stackOut_45_0 = 0;
                            stackIn_50_0 = stackOut_45_0;
                            break L19;
                          }
                        } else {
                          stackOut_43_0 = 1;
                          stackIn_50_0 = stackOut_43_0;
                          break L19;
                        }
                      }
                      var12 = stackIn_50_0;
                      break L17;
                    } else {
                      if (-1 == param6) {
                        L20: {
                          if (ao.field_h[var11] != wi.field_f.field_dc) {
                            stackOut_40_0 = 0;
                            stackIn_41_0 = stackOut_40_0;
                            break L20;
                          } else {
                            stackOut_39_0 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            break L20;
                          }
                        }
                        var12 = stackIn_41_0;
                        break L17;
                      } else {
                        if ((wi.field_f.field_Wb[param6] & 255) != var11) {
                          var12 = 0;
                          break L17;
                        } else {
                          var12 = 1;
                          break L17;
                        }
                      }
                    }
                  }
                  L21: {
                    if (var12 != 0) {
                      jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                      var10_int = 1;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  if (bg.field_a) {
                    return;
                  } else {
                    var11++;
                    continue L12;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(jm param0, int param1) {
        param0.field_g = ((jm) this).field_g;
        param0.field_o = ((jm) this).field_o;
        param0.field_a = ((jm) this).field_a;
        param0.field_d = ((jm) this).field_d;
        param0.field_c = ((jm) this).field_c;
        param0.field_i = ((jm) this).field_i;
        param0.field_l = ((jm) this).field_l;
        param0.field_f = ((jm) this).field_f;
        if (param1 != 1881) {
            return;
        }
        param0.field_k = ((jm) this).field_k;
        param0.field_e = ((jm) this).field_e;
        param0.field_n = ((jm) this).field_n;
        param0.field_m = ((jm) this).field_m;
        param0.field_h = ((jm) this).field_h;
    }

    public final void a(int param0, qm param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        kh var17 = null;
        kh var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        if (param4 != param5) {
          L0: {
            if (param3 == 6600) {
              break L0;
            } else {
              ((jm) this).field_g = null;
              break L0;
            }
          }
          L1: {
            if (!param1.d(-2116)) {
              break L1;
            } else {
              L2: {
                var17 = ((jm) this).a(param1, -118);
                var18 = var17;
                if (param4 > param5) {
                  var8 = param5;
                  var9 = param4;
                  break L2;
                } else {
                  var8 = param4;
                  var9 = param5;
                  break L2;
                }
              }
              var10 = var18.a((byte) -67, var8);
              var11 = var18.a((byte) 77, var9);
              da.a(param2 + param1.field_n - -param1.field_v, param1.field_j + param0 - -param1.field_k, 123, param2 - -param1.field_n, param1.field_j + param0);
              var12 = var10;
              L3: while (true) {
                if (var12 > var11) {
                  oo.c(param3 + -22005);
                  break L1;
                } else {
                  L4: {
                    var13 = var17.field_f[var12];
                    if (var12 == var10) {
                      stackOut_12_0 = var18.a(var8, 0);
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var13.field_f[0];
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = stackIn_13_0;
                    if (var12 != var11) {
                      if (var13 == null) {
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = var13.field_f[var13.field_f.length + -1];
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    } else {
                      stackOut_14_0 = var18.a(var9, param3 ^ 6600);
                      stackIn_18_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  var15 = stackIn_18_0;
                  io.field_n.a(var13.field_e, var13.field_g + param1.field_i + ((jm) this).field_f + (param0 + param1.field_j), ((jm) this).field_e, -var14 + var15, ((jm) this).field_e >>> 54916888, param3 + -6599, this.a(param2, param3 + 2693, var14, param1));
                  var12++;
                  continue L3;
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, qm param3) {
        if (param1 != 9293) {
            ((jm) this).field_m = -128;
        }
        return param2 + param0 + (param3.field_n + ((jm) this).field_m - -param3.field_h);
    }

    public final void a(int param0, int param1, int param2, int param3, qm param4) {
        kh var13 = null;
        kh var14 = null;
        int var7 = 0;
        vd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 <= 6) {
            return;
        }
        if (param4.d(-2116)) {
            var13 = ((jm) this).a(param4, -128);
            var14 = var13;
            var7 = var14.a((byte) -109, param3);
            var8 = var13.field_f[var7];
            var9 = var14.a(param3, 0);
            var10 = this.a(param2, 9293, var9, param4);
            var11 = ((jm) this).a(param1, -13372, param4) + Math.max(0, var8.field_g);
            var12 = ((jm) this).a(param1, -13372, param4) + Math.min(this.a(param4, false), Math.min(var8.field_e, var14.field_f.length > 1 + var7 ? var13.field_f[1 + var7].field_g : var8.field_e));
            da.a(param4.field_n + param2 - -param4.field_v, param4.field_k + param4.field_j + param1, 116, param2 + param4.field_n, param1 + param4.field_j);
            io.field_n.a(var10, var10, var12, ((jm) this).field_o, var11, (byte) 102);
            oo.c(-15405);
        }
    }

    public final int a(int param0) {
        if (param0 != 27184) {
            Object var3 = null;
            int discarded$0 = ((jm) this).a((qm) null, (byte) -41, 24);
        }
        return ((jm) this).field_g.field_m + ((jm) this).field_g.field_C;
    }

    public void a(qm param0, int param1, int param2, int param3, boolean param4) {
        if (((jm) this).field_g == null) {
            return;
        }
        this.a(param3, param2, param0, (byte) -89);
        if (param1 != 5592405) {
            ((jm) this).field_c = 110;
        }
    }

    public final int b(int param0, qm param1, int param2, int param3, int param4, int param5) {
        kh discarded$6 = ((jm) this).a(param1, -35);
        if (param5 != 2454) {
            return -110;
        }
        return param1.field_s.a(-((jm) this).a(param4, -13372, param1) + param2, -((jm) this).a(param1, (byte) -105, param0) + param3, true);
    }

    private final void a(int param0, int param1, qm param2, byte param3) {
        if (param3 != -89) {
            Object var6 = null;
            this.b((byte) -88, (qm) null);
        }
        this.a(0, param3 + 23123, ((jm) this).field_k, 0, param2, param0, param1, ((jm) this).field_c);
    }

    public final int a(qm param0, byte param1) {
        int var3 = 17 % ((-9 - param1) / 44);
        return -((jm) this).field_m + (param0.field_v + -((jm) this).field_l);
    }

    String a(boolean param0, qm param1) {
        if (param0) {
            return null;
        }
        return param1.field_g;
    }

    public final int a(byte param0, qm param1) {
        kh discarded$0 = ((jm) this).a(param1, -123);
        int var3 = -79 / ((76 - param0) / 39);
        return param1.field_s.b((byte) 71) + ((jm) this).field_m + ((jm) this).field_l;
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(byte param0, qm param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = ArcanistsMulti.field_G ? 1 : 0;
          if (null != param1.field_s) {
            break L0;
          } else {
            param1.field_s = (kh) (Object) new re();
            break L0;
          }
        }
        var3 = ((jm) this).a(param1, (byte) 71);
        var4 = this.a(param1, false);
        if (param0 == -33) {
          L1: {
            var6 = ((jm) this).field_a;
            if (var6 != 0) {
              if (-3 != var6) {
                L2: {
                  if (-4 != var6) {
                    if ((var6 ^ -1) != -2) {
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                var5 = (-((jm) this).field_g.field_C + (var4 + -((jm) this).field_g.field_m) >> -532114239) + ((jm) this).field_g.field_C;
                break L1;
              } else {
                var5 = -((jm) this).field_g.field_m + var4;
                break L1;
              }
            } else {
              var5 = ((jm) this).field_g.field_C;
              break L1;
            }
          }
          L3: {
            L4: {
              var6 = ((jm) this).field_i;
              if (0 != var6) {
                if (3 == var6) {
                  break L4;
                } else {
                  if (1 == var6) {
                    if (param1.field_s instanceof re) {
                      ((re) (Object) param1.field_s).a(((jm) this).a(false, param1), var3 >> 635293025, var5, (byte) -18, ((jm) this).field_g);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    if ((var6 ^ -1) == -3) {
                      if (param1.field_s instanceof re) {
                        ((re) (Object) param1.field_s).a(var3, (byte) -105, ((jm) this).field_g, var5, ((jm) this).a(false, param1));
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            if (!(param1.field_s instanceof re)) {
              break L3;
            } else {
              ((re) (Object) param1.field_s).a(((jm) this).a(false, param1), (byte) -123, ((jm) this).field_g, var5, 0);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, qm param4, int param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          da.a(param4.field_v + (param4.field_n + param6), param5 - (-param4.field_j + -param4.field_k), 121, param6 - -param4.field_n, param4.field_j + param5);
          if (param1 == 23034) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var9 = ((jm) this).a(param4, (byte) 56);
          var10 = this.a(param4, false);
          if (((jm) this).field_n) {
            int discarded$1 = ((jm) this).field_g.a(((jm) this).a(false, param4), this.a(param6, 9293, param0, param4), this.a(param5, param3, (byte) 120, param4), var9, var10, param2, param7, ((jm) this).field_i, ((jm) this).field_a, ((jm) this).field_h);
            break L1;
          } else {
            L2: {
              var12 = ((jm) this).field_a;
              if (0 == var12) {
                var11 = ((jm) this).field_g.field_C;
                break L2;
              } else {
                if (-3 == (var12 ^ -1)) {
                  var11 = -((jm) this).field_g.field_m + var10;
                  break L2;
                } else {
                  L3: {
                    if (var12 != -4) {
                      if (-2 != var12) {
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var11 = (-((jm) this).field_g.field_C + var10 + -((jm) this).field_g.field_m >> -731991935) + ((jm) this).field_g.field_C;
                  break L2;
                }
              }
            }
            L4: {
              var12 = ((jm) this).field_i;
              if (-1 != var12) {
                if (-4 == var12) {
                  break L4;
                } else {
                  if (var12 == 1) {
                    ((jm) this).field_g.b(((jm) this).a(false, param4), (var9 >> -1518191711) + this.a(param6, 9293, param0, param4), this.a(param5, param3, (byte) 120, param4) + var11, param2, param7);
                    break L1;
                  } else {
                    if ((var12 ^ -1) != -3) {
                      break L1;
                    } else {
                      ((jm) this).field_g.c(((jm) this).a(false, param4), this.a(param6, param1 + -13741, param0, param4) + var9, var11 + this.a(param5, param3, (byte) 120, param4), param2, param7);
                      break L1;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            ((jm) this).field_g.a(((jm) this).a(false, param4), this.a(param6, 9293, param0, param4), var11 + this.a(param5, param3, (byte) 120, param4), param2, param7);
            break L1;
          }
        }
        oo.c(param1 + -38439);
    }

    public final kh a(qm param0, int param1) {
        int var3 = 58 % ((-83 - param1) / 35);
        if (!(param0.field_s != null)) {
            param0.field_s = (kh) (Object) new re();
        }
        if (!((jm) this).field_n) {
            this.b((byte) -33, param0);
        } else {
            ((re) (Object) param0.field_s).a((byte) 119, ((jm) this).field_g, this.a(param0, false), ((jm) this).field_h, ((jm) this).field_i, ((jm) this).field_a, ((jm) this).a(false, param0), ((jm) this).a(param0, (byte) -62));
        }
        return param0.field_s;
    }

    public final int b(qm param0, int param1) {
        kh discarded$6 = ((jm) this).a(param0, 6);
        if (param1 != 1) {
            return -42;
        }
        return param0.field_s.a((byte) -54) + (((jm) this).field_f + ((jm) this).field_d);
    }

    final static void b(int param0) {
        int var1 = 0;
        if (-33 <= (ul.field_A ^ -1)) {
            eb.a(0, false);
        } else {
            var1 = ul.field_A % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            eb.a(ul.field_A + -var1, false);
        }
        if (param0 < 29) {
            jm.b(-66);
        }
    }

    private final int a(qm param0, boolean param1) {
        if (param1) {
            return 122;
        }
        return -((jm) this).field_d + (-((jm) this).field_f + param0.field_k);
    }

    protected jm() {
    }

    private final int a(int param0, int param1, byte param2, qm param3) {
        if (param2 != 120) {
            Object var6 = null;
            int discarded$0 = ((jm) this).a((qm) null, (byte) 0, -49);
        }
        return param1 + (((jm) this).field_f + param0) + param3.field_j + param3.field_i;
    }

    public final int a(qm param0, byte param1, int param2) {
        if (param1 > -88) {
            return 53;
        }
        return this.a(param2, 9293, 0, param0);
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        ((jm) this).field_g = param0;
        ((jm) this).field_f = param3;
        ((jm) this).field_o = param10;
        ((jm) this).field_e = param11;
        ((jm) this).field_l = param2;
        ((jm) this).field_n = param12 ? true : false;
        ((jm) this).field_a = param8;
        ((jm) this).field_d = param4;
        ((jm) this).field_i = param7;
        ((jm) this).field_h = param9;
        ((jm) this).field_c = param6;
        ((jm) this).field_m = param1;
        ((jm) this).field_k = param5;
    }

    public static void c(int param0) {
        field_b = null;
        int var1 = -67 % ((param0 - 25) / 37);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
