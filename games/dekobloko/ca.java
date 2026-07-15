/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends t {
    private ef field_ub;
    private int field_nb;
    private int field_tb;
    static int field_vb;
    static ke field_wb;
    private int field_lb;
    private ce field_sb;
    private i field_pb;
    private int field_rb;
    private int field_mb;
    static ck field_qb;
    static int field_kb;
    static String field_ob;

    final void j(byte param0) {
        int var2 = 0;
        if (((ca) this).field_pb == da.field_b) {
          return;
        } else {
          var2 = -119 % ((param0 - 30) / 39);
          ((ca) this).field_rb = 0;
          ((ca) this).field_pb = rb.field_c;
          this.a(((ca) this).field_sb, -29870);
          ((ca) this).field_ub.field_Q = 0;
          ((ca) this).field_sb = null;
          return;
        }
    }

    private final void a(ce param0, int param1) {
        Object var4 = null;
        L0: {
          if (((ca) this).field_ub == null) {
            break L0;
          } else {
            ((ca) this).field_ub.b((byte) 111);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 != null) {
              break L2;
            } else {
              ((ca) this).field_ub = new ef();
              if (!client.field_A) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          param0.b(param0.field_y, param0.field_t, 6, ((ca) this).field_nb + 6, -16555);
          ((ca) this).field_ub = new ef(param0);
          break L1;
        }
        L3: {
          ((ca) this).b((ce) (Object) ((ca) this).field_ub, (byte) -55);
          ((ca) this).field_sb = null;
          if (param1 == -29870) {
            break L3;
          } else {
            var4 = null;
            ((ca) this).c((ce) null, (byte) -56);
            break L3;
          }
        }
    }

    final static void a(String param0, String param1, String param2, byte param3, int param4, int param5) {
        hl var6 = new hl(param4, param0, param5, param1, param2);
        rb.a(var6, -3);
        int var7 = 121 % ((20 - param3) / 42);
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int var9 = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          var9 = param1 + (param3 + param4);
          var10 = new ck[]{new ck(var9, var9), new ck(param8, var9), new ck(var9, var9), new ck(var9, param8), new ck(64, 64), new ck(var9, param8), new ck(var9, var9), new ck(param8, var9), new ck(var9, var9)};
          var11_ref_ck__ = var10;
          if (!param5) {
            break L0;
          } else {
            field_kb = -21;
            break L0;
          }
        }
        var12 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if (var11_ref_ck__.length <= var12) {
                break L3;
              } else {
                var13 = var11_ref_ck__[var12];
                stackOut_4_0 = 0;
                stackIn_11_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var15 != 0) {
                  break L2;
                } else {
                  var14 = stackIn_5_0;
                  L4: while (true) {
                    L5: {
                      if (var14 >= var13.field_D.length) {
                        break L5;
                      } else {
                        var13.field_D[var14] = param0;
                        var14++;
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var12++;
                    if (var15 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            stackOut_10_0 = 0;
            stackIn_11_0 = stackOut_10_0;
            break L2;
          }
          var11 = stackIn_11_0;
          L6: while (true) {
            L7: {
              if (var11 >= param3) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L7;
              } else {
                stackOut_13_0 = 0;
                stackIn_20_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var15 != 0) {
                  break L7;
                } else {
                  var12 = stackIn_14_0;
                  L8: while (true) {
                    if (var9 <= var12) {
                      var11++;
                      continue L6;
                    } else {
                      var10[6].field_D[var12 + (var9 + -var11 - 1) * var9] = param2;
                      var10[8].field_D[(-1 + (var9 + -var11)) * var9 + var12] = param2;
                      var10[2].field_D[-var11 - 1 - -var9 + var12 * var9] = param2;
                      var10[8].field_D[var12 * var9 + (-var11 + (-1 + var9))] = param2;
                      var12++;
                      continue L8;
                    }
                  }
                }
              }
            }
            var11 = stackIn_20_0;
            L9: while (true) {
              L10: {
                if (var11 >= param3) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L10;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_31_0 = stackOut_22_0;
                  stackIn_23_0 = stackOut_22_0;
                  if (var15 != 0) {
                    break L10;
                  } else {
                    var12 = stackIn_23_0;
                    L11: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L9;
                      } else {
                        L12: {
                          var10[0].field_D[var12 - -(var9 * var11)] = param7;
                          var10[0].field_D[var9 * var12 + var11] = param7;
                          if ((-var11 + var9 ^ -1) < (var12 ^ -1)) {
                            var10[2].field_D[var12 - -(var11 * var9)] = param7;
                            var10[6].field_D[var12 * var9 + var11] = param7;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              }
              var11 = stackIn_31_0;
              L13: while (true) {
                L14: {
                  if (param8 <= var11) {
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L14;
                  } else {
                    stackOut_33_0 = 0;
                    stackIn_40_0 = stackOut_33_0;
                    stackIn_34_0 = stackOut_33_0;
                    if (var15 != 0) {
                      break L14;
                    } else {
                      var12 = stackIn_34_0;
                      L15: while (true) {
                        if (var12 >= param3) {
                          var11++;
                          continue L13;
                        } else {
                          var10[7].field_D[(-1 + var9 - var12) * param8 + var11] = param2;
                          var10[5].field_D[-var12 - (1 + -var9 - var11 * var9)] = param2;
                          var10[1].field_D[var12 * param8 + var11] = param7;
                          var10[3].field_D[var9 * var11 - -var12] = param7;
                          var12++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
                var11 = stackIn_40_0;
                L16: while (true) {
                  L17: {
                    if (param8 >> 949160769 <= var11) {
                      break L17;
                    } else {
                      var12 = 0;
                      L18: while (true) {
                        L19: {
                          if (var12 >= param4) {
                            var11++;
                            break L19;
                          } else {
                            var10[1].field_D[var11 + param8 * (-1 + -var12 + var9)] = param6;
                            var10[3].field_D[-var12 - (1 + -var9 - var9 * var11)] = param6;
                            var10[7].field_D[var12 * param8 - -var11] = param6;
                            var10[5].field_D[var12 + var9 * var11] = param6;
                            var12++;
                            if (var15 != 0) {
                              break L19;
                            } else {
                              continue L18;
                            }
                          }
                        }
                        if (var15 == 0) {
                          continue L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  return var10;
                }
              }
            }
          }
        }
    }

    void c(ce param0, byte param1) {
        L0: {
          if (param1 >= 10) {
            break L0;
          } else {
            field_kb = -79;
            break L0;
          }
        }
        L1: {
          L2: {
            ((ca) this).field_sb = param0;
            if (fh.field_e != ((ca) this).field_pb) {
              break L2;
            } else {
              ((ca) this).b(((ca) this).field_sb.field_t + 12, ((ca) this).field_tb, ((ca) this).field_sb.field_y + ((ca) this).field_nb + 12, 194);
              ((ca) this).field_rb = 0;
              if (!client.field_A) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          if (da.field_b == ((ca) this).field_pb) {
            break L1;
          } else {
            ((ca) this).field_pb = da.field_b;
            ((ca) this).field_rb = 0;
            break L1;
          }
        }
    }

    final static ck[] m(int param0) {
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        byte[] var19 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        boolean stackIn_3_0 = false;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        boolean stackOut_2_0 = false;
        var8 = client.field_A ? 1 : 0;
        var1 = new ck[ec.field_g];
        var2 = param0;
        L0: while (true) {
          L1: {
            if (var2 >= ec.field_g) {
              stackOut_17_0 = 126;
              stackIn_18_0 = stackOut_17_0;
              break L1;
            } else {
              var3 = hc.field_c[var2] * tm.field_a[var2];
              var19 = tc.field_Nb[var2];
              stackOut_2_0 = da.field_d[var2];
              stackIn_18_0 = stackOut_2_0 ? 1 : 0;
              stackIn_3_0 = stackOut_2_0;
              if (var8 != 0) {
                break L1;
              } else {
                L2: {
                  L3: {
                    L4: {
                      if (stackIn_3_0) {
                        break L4;
                      } else {
                        var20 = new int[var3];
                        var16 = var20;
                        var9 = var16;
                        var6_int = 0;
                        L5: while (true) {
                          if (var3 <= var6_int) {
                            var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var20);
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            var9[var6_int] = mb.field_d[lb.a(255, (int) var19[var6_int])];
                            var6_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    var21 = pd.field_e[var2];
                    var22 = new int[var3];
                    var18 = var22;
                    var14 = var18;
                    var12 = var14;
                    var6 = var12;
                    var7 = 0;
                    L6: while (true) {
                      if (var3 <= var7) {
                        var1[var2] = (ck) (Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var22);
                        break L3;
                      } else {
                        var6[var7] = de.b(lb.a((int) var21[var7], 255) << -1019066312, mb.field_d[lb.a((int) var19[var7], 255)]);
                        var7++;
                        if (var8 != 0) {
                          break L2;
                        } else {
                          continue L6;
                        }
                      }
                    }
                  }
                  var2++;
                  break L2;
                }
                continue L0;
              }
            }
          }
          oa.a(stackIn_18_0);
          return var1;
        }
    }

    public static void l(int param0) {
        if (param0 <= 72) {
            return;
        }
        field_wb = null;
        field_ob = null;
        field_qb = null;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5 = 0;
        if (super.a(82, param1, param2, param3)) {
          return true;
        } else {
          var5 = 54 % ((param0 - -22) / 49);
          if (((ca) this).field_ub != null) {
            L0: {
              if (98 == param1) {
                boolean discarded$4 = ((ca) this).field_ub.a(false, param2);
                break L0;
              } else {
                break L0;
              }
            }
            if ((param1 ^ -1) != -100) {
              return false;
            } else {
              boolean discarded$5 = ((ca) this).field_ub.a(false, param2);
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void j(int param0) {
        if (!(null == ((ca) this).field_pb)) {
            if (((ca) this).field_pb != rb.field_c) {
                ((ca) this).a(108, ((ca) this).field_sb.field_t + 12, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y);
                this.a(((ca) this).field_sb, -29870);
            }
            ((ca) this).field_ub.field_Q = 256;
            ((ca) this).field_pb = null;
        }
        super.j(92);
        int var2 = 11 % ((-15 - param0) / 49);
    }

    boolean h(byte param0) {
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (param0 > 15) {
            break L0;
          } else {
            field_kb = -126;
            break L0;
          }
        }
        L1: {
          if (((ca) this).field_pb == null) {
            break L1;
          } else {
            L2: {
              if (da.field_b == ((ca) this).field_pb) {
                break L2;
              } else {
                if (((ca) this).field_pb != rb.field_c) {
                  break L1;
                } else {
                  L3: {
                    int fieldTemp$4 = ((ca) this).field_rb + 1;
                    ((ca) this).field_rb = ((ca) this).field_rb + 1;
                    if (fieldTemp$4 == ((ca) this).field_mb) {
                      break L3;
                    } else {
                      ((ca) this).field_ub.field_Q = (((ca) this).field_rb << -1699061016) / ((ca) this).field_mb;
                      if (var3 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((ca) this).field_ub.field_Q = 256;
                  ((ca) this).field_pb = null;
                  break L2;
                }
              }
            }
            L4: {
              int fieldTemp$5 = ((ca) this).field_rb + 1;
              ((ca) this).field_rb = ((ca) this).field_rb + 1;
              if (fieldTemp$5 == ((ca) this).field_lb) {
                break L4;
              } else {
                ((ca) this).field_ub.field_Q = -((((ca) this).field_rb << 1615067112) / ((ca) this).field_lb) + 256;
                break L4;
              }
            }
            ((ca) this).field_pb = fh.field_e;
            ((ca) this).b(12 + ((ca) this).field_sb.field_t, ((ca) this).field_tb, ((ca) this).field_nb + 12 - -((ca) this).field_sb.field_y, 194);
            ((ca) this).field_ub.field_Q = 0;
            ((ca) this).field_rb = 0;
            break L1;
          }
        }
        return super.h((byte) 47);
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 - -param1.field_y));
        ((ca) this).field_mb = param3;
        ((ca) this).field_lb = param3;
        ((ca) this).field_nb = param2;
        ((ca) this).field_tb = param4;
        this.a(param1, -29870);
    }

    final boolean f(byte param0) {
        if (param0 <= 77) {
            ((ca) this).field_pb = null;
        }
        ((ca) this).j(-109);
        return super.f((byte) 116);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
