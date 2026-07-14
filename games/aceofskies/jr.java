/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends wt {
    static String field_p;
    private int[][] field_s;
    static boolean field_u;
    private String[] field_q;
    static int[] field_n;
    private int[] field_o;
    static String field_r;
    int[] field_t;

    public static void a(boolean param0) {
        field_r = null;
        if (param0) {
            return;
        }
        field_n = null;
        field_p = null;
    }

    final static boolean a(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 32) {
            break L0;
          } else {
            boolean discarded$2 = jr.a((byte) 88);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-11 < (ob.field_d ^ -1)) {
              break L2;
            } else {
              if (13 > bl.field_c) {
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

    final static void a(byte[] param0, int param1) {
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
        byte[] var16 = null;
        rb var17 = null;
        rb var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_39_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        var15 = AceOfSkies.field_G ? 1 : 0;
        var17 = new rb(param0);
        var18 = var17;
        var18.field_g = param0.length + -2;
        to.field_t = var18.i((byte) 0);
        ji.field_b = new int[to.field_t];
        lh.field_a = new int[to.field_t];
        q.field_k = new boolean[to.field_t];
        lg.field_j = new int[to.field_t];
        ql.field_p = new byte[to.field_t][];
        fk.field_a = new byte[to.field_t][];
        ee.field_e = new int[to.field_t];
        var18.field_g = -(to.field_t * 8) + (-7 + param0.length);
        pu.field_a = var18.i((byte) 0);
        cc.field_i = var18.i((byte) 0);
        var3 = (var18.g(param1 ^ 7055) & 255) - -1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (to.field_t <= var4) {
              break L1;
            } else {
              lh.field_a[var4] = var17.i((byte) 0);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= to.field_t) {
                break L3;
              } else {
                lg.field_j[var4] = var17.i((byte) 0);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 == 7148) {
                break L4;
              } else {
                var16 = (byte[]) null;
                jr.a((byte[]) null, -128);
                break L4;
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (to.field_t <= var4) {
                  break L6;
                } else {
                  ji.field_b[var4] = var17.i((byte) 0);
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
                  if (var4 >= to.field_t) {
                    break L8;
                  } else {
                    ee.field_e[var4] = var17.i((byte) 0);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_g = param0.length + -7 + -(to.field_t * 8) - (-3 + 3 * var3);
                ud.field_e = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        ud.field_e[var4] = var17.g((byte) -107);
                        if ((ud.field_e[var4] ^ -1) == -1) {
                          ud.field_e[var4] = 1;
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
                  var18.field_g = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= to.field_t) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = ji.field_b[var4];
                            var6 = ee.field_e[var4];
                            var7 = var5 * var6;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            fk.field_a[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            ql.field_p[var4] = var26;
                            var10 = 0;
                            var11 = var18.g(param1 ^ 7088);
                            if (0 == (var11 & 1)) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var5) {
                                    break L17;
                                  } else {
                                    var13 = 0;
                                    L18: while (true) {
                                      L19: {
                                        if (var6 <= var13) {
                                          break L19;
                                        } else {
                                          var8[var13 * var5 + var12] = var17.d(0);
                                          var13++;
                                          if (0 == 0) {
                                            continue L18;
                                          } else {
                                            break L19;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                                if (-1 == (var11 & 2 ^ -1)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L20: while (true) {
                                    L21: {
                                      if (var5 <= var12) {
                                        break L21;
                                      } else {
                                        var13 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var6 <= var13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                var9[var5 * var13 + var12] = var17.d(0);
                                                var14 = var17.d(0);
                                                stackOut_39_0 = var10;
                                                stackIn_41_0 = stackOut_39_0;
                                                stackIn_40_0 = stackOut_39_0;
                                                if (0 == (var14 ^ -1)) {
                                                  stackOut_41_0 = stackIn_41_0;
                                                  stackOut_41_1 = 0;
                                                  stackIn_42_0 = stackOut_41_0;
                                                  stackIn_42_1 = stackOut_41_1;
                                                  break L24;
                                                } else {
                                                  stackOut_40_0 = stackIn_40_0;
                                                  stackOut_40_1 = 1;
                                                  stackIn_42_0 = stackOut_40_0;
                                                  stackIn_42_1 = stackOut_40_1;
                                                  break L24;
                                                }
                                              }
                                              var10 = stackIn_42_0 | stackIn_42_1;
                                              var13++;
                                              if (0 == 0) {
                                                continue L22;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          var12++;
                                          if (0 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
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
                          L25: while (true) {
                            L26: {
                              if (var12 >= var7) {
                                break L26;
                              } else {
                                var8[var12] = var17.d(param1 + -7148);
                                var12++;
                                if (0 == 0) {
                                  continue L25;
                                } else {
                                  break L26;
                                }
                              }
                            }
                            if ((2 & var11) == 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L27: while (true) {
                                if (var7 <= var12) {
                                  break L14;
                                } else {
                                  L28: {
                                    var9[var12] = var17.d(id.a(param1, 7148));
                                    var13 = var17.d(id.a(param1, 7148));
                                    stackOut_52_0 = var10;
                                    stackIn_54_0 = stackOut_52_0;
                                    stackIn_53_0 = stackOut_52_0;
                                    if (var13 == -1) {
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
                                  var12++;
                                  if (0 == 0) {
                                    continue L27;
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                            }
                          }
                        }
                        q.field_k[var4] = var10 != 0;
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

    final String c(byte param0) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (!(null != ((jr) this).field_q)) {
            return "";
        }
        StringBuilder discarded$8 = var6.append(((jr) this).field_q[0]);
        if (param0 != 1) {
            byte[] var5 = (byte[]) null;
            jr.a((byte[]) null, 105);
        }
        for (var3 = 1; ((jr) this).field_q.length > var3; var3++) {
            StringBuilder discarded$9 = var2.append("...");
            StringBuilder discarded$10 = var6.append(((jr) this).field_q[var3]);
        }
        return var2.toString();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!param0) {
            return;
        }
        if (null != ((jr) this).field_t) {
            for (var2 = 0; var2 < ((jr) this).field_t.length; var2++) {
                ((jr) this).field_t[var2] = vo.a(((jr) this).field_t[var2], 32768);
            }
        }
    }

    private final void a(rb param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ej var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = AceOfSkies.field_G ? 1 : 0;
          if (param1 <= -71) {
            break L0;
          } else {
            ((jr) this).field_t = (int[]) null;
            break L0;
          }
        }
        L1: {
          if (param2 == 1) {
            ((jr) this).field_q = ee.a((byte) 10, '<', param0.h(-17883));
            break L1;
          } else {
            if (param2 == 2) {
              var4 = param0.g(-61);
              ((jr) this).field_t = new int[var4];
              var5 = 0;
              L2: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((jr) this).field_t[var5] = param0.i((byte) 0);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if (3 != param2) {
                if ((param2 ^ -1) != -5) {
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var4 = param0.g(82);
                ((jr) this).field_o = new int[var4];
                ((jr) this).field_s = new int[var4][];
                var5 = 0;
                L3: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param0.i((byte) 0);
                    var7 = ks.a(var6, -28228);
                    if (var7 != null) {
                      ((jr) this).field_o[var5] = var6;
                      ((jr) this).field_s[var5] = new int[((ej) var7).field_c];
                      var8 = 0;
                      L4: while (true) {
                        if (((ej) var7).field_c > var8) {
                          ((jr) this).field_s[var5][var8] = param0.i((byte) 0);
                          var8++;
                          continue L4;
                        } else {
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(byte param0, rb param1) {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        while (true) {
            var3 = param1.g(99);
            if (var3 == 0) {
                break;
            }
            this.a(param1, -112, var3);
        }
        if (param0 <= 99) {
            field_n = (int[]) null;
        }
    }

    jr() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[16384];
        field_r = "Please wait...";
        field_p = "Invalid password.";
    }
}
