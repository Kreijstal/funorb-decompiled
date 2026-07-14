/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
            ((eh) this).a((byte) 23);
        }
        hk.a(((eh) this).field_f, ((eh) this).field_g, ((eh) this).field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = client.field_A ? 1 : 0;
          if (param0 == -72) {
            break L0;
          } else {
            field_a = 89;
            break L0;
          }
        }
        var16 = new wl(param1);
        var17 = var16;
        var17.field_n = -2 + param1.length;
        ec.field_g = var17.e(3);
        da.field_d = new boolean[ec.field_g];
        sg.field_d = new int[ec.field_g];
        fh.field_a = new int[ec.field_g];
        tm.field_a = new int[ec.field_g];
        hc.field_c = new int[ec.field_g];
        pd.field_e = new byte[ec.field_g][];
        tc.field_Nb = new byte[ec.field_g][];
        var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
        ed.field_f = var17.e(3);
        i.field_d = var17.e(3);
        var3 = 1 + (var17.d((byte) -104) & 255);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (var4 >= ec.field_g) {
              break L2;
            } else {
              sg.field_d[var4] = var16.e(qm.b((int) param0, -69));
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (ec.field_g <= var4) {
                break L4;
              } else {
                fh.field_a[var4] = var16.e(qm.b((int) param0, -69));
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= ec.field_g) {
                  break L6;
                } else {
                  tm.field_a[var4] = var16.e(3);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (ec.field_g <= var4) {
                    break L8;
                  } else {
                    hc.field_c[var4] = var16.e(3);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_n = -(3 * (var3 + -1)) + (param1.length - (7 + ec.field_g * 8));
                mb.field_d = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        mb.field_d[var4] = var16.h(param0 + 65352);
                        if (0 == mb.field_d[var4]) {
                          mb.field_d[var4] = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_n = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (ec.field_g <= var4) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = tm.field_a[var4];
                            var6 = hc.field_c[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            tc.field_Nb[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            pd.field_e[var4] = var25;
                            var10 = 0;
                            var11 = var17.d((byte) -35);
                            if ((var11 & 1) != 0) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var7 <= var12) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.g((byte) -127);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if ((var11 & 2) == 0) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.g((byte) -119);
                                          var13 = var16.g((byte) -119);
                                          stackOut_34_0 = var10;
                                          stackIn_36_0 = stackOut_34_0;
                                          stackIn_35_0 = stackOut_34_0;
                                          if ((var13 ^ -1) == 0) {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 0;
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            break L20;
                                          } else {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackOut_35_1 = 1;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_37_1 = stackOut_35_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_37_0 | stackIn_37_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var5 <= var12) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var13 >= var6) {
                                      break L24;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.g((byte) -124);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if ((2 & var11) != 0) {
                              var12 = 0;
                              L25: while (true) {
                                if (var5 <= var12) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var6 <= var13) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var12 + var13 * var5] = var16.g((byte) -115);
                                          var14 = var16.g((byte) -115);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (-1 == var14) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        da.field_d[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
            eh.a(125);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
