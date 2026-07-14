/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends jc {
    static int[] field_A;
    static d field_I;
    int field_J;

    public jl() {
        super(0, 0, 0, 0, (cj) null, (sc) null);
        ((jl) this).field_J = 256;
    }

    final static void i(byte param0) {
        Object var2 = null;
        hl.a((byte) -93, (String) null, oe.field_a);
        if (param0 > -54) {
            jl.i((byte) 51);
        }
    }

    public static void g(byte param0) {
        if (param0 > -127) {
            field_I = null;
        }
        field_I = null;
        field_A = null;
    }

    final static String a(CharSequence param0, int param1, boolean param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        if (param0 == null) {
          return km.field_m;
        } else {
          if (param1 >= 110) {
            L0: {
              var3 = param0.length();
              if (var3 > -2) {
                break L0;
              } else {
                if (-13 < var3) {
                  break L0;
                } else {
                  L1: {
                    var4 = hm.a((byte) -126, param0);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (-2 < (var4.length() ^ -1)) {
                        break L1;
                      } else {
                        L2: {
                          if (ad.a((byte) 103, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!ad.a((byte) 107, var4.charAt(var4.length() - 1))) {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param0.length()) {
                                  if ((var5 ^ -1) < -1) {
                                    return vi.field_t;
                                  } else {
                                    return null;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (!ad.a((byte) 91, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (var5 >= 2) {
                                    if (!param2) {
                                      return fd.field_p;
                                    } else {
                                      var6++;
                                      continue L3;
                                    }
                                  } else {
                                    var6++;
                                    continue L3;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        return vi.field_t;
                      }
                    }
                  }
                  return km.field_m;
                }
              }
            }
            return km.field_m;
          } else {
            return null;
          }
        }
    }

    final static void h(byte param0) {
        se var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        se var5 = null;
        var4 = Terraphoenix.field_V;
        if (param0 <= -33) {
          var2 = 1;
          L0: while (true) {
            if (var2 >= rd.field_t) {
              return;
            } else {
              var3 = rd.field_t + -1;
              L1: while (true) {
                if (var2 > var3) {
                  var2++;
                  continue L0;
                } else {
                  if (tc.a(false, p.field_a[var3].field_a, 320, 240, p.field_a[var3].field_g) > tc.a(false, p.field_a[-1 + var3].field_a, 320, 240, p.field_a[-1 + var3].field_g)) {
                    var5 = p.field_a[var3];
                    var1 = var5;
                    p.field_a[var3] = p.field_a[var3 - 1];
                    p.field_a[var3 - 1] = var5;
                    var3--;
                    continue L1;
                  } else {
                    var3--;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(ci[] param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var23 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var23 = Terraphoenix.field_V;
        if (param0 == null) {
          return;
        } else {
          L0: {
            if (-1 <= (param3 ^ -1)) {
              break L0;
            } else {
              if (param1 > 0) {
                L1: {
                  if (param0[3] != null) {
                    stackOut_8_0 = param0[3].field_q;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (null == param0[5]) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = param0[5].field_q;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (param0[1] == null) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param0[1].field_u;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (null != param0[7]) {
                    stackOut_17_0 = param0[7].field_u;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                L5: {
                  var9 = stackIn_18_0;
                  var10 = param3 + param5;
                  var11 = param2 - -param1;
                  var12 = param5 - -var6;
                  var13 = -var7 + var10;
                  var14 = param2 - -var8;
                  var15 = var11 - var9;
                  var16 = var12;
                  var17 = var13;
                  if (var16 > var17) {
                    var17 = var6 * param3 / (var6 + var7) + param5;
                    var16 = var6 * param3 / (var6 + var7) + param5;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var18 = var14;
                  var19 = var15;
                  l.b(e.field_t);
                  if (var18 <= var19) {
                    break L6;
                  } else {
                    var19 = param2 - -(var8 * param1 / (var9 + var8));
                    var18 = param2 - -(var8 * param1 / (var9 + var8));
                    break L6;
                  }
                }
                L7: {
                  if (param0[0] != null) {
                    l.i(param5, param2, var16, var18);
                    param0[0].b(param5, param2);
                    l.a(e.field_t);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null != param0[2]) {
                    l.i(var17, param2, var10, var18);
                    param0[2].b(var13, param2);
                    l.a(e.field_t);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0[6] == null) {
                    break L9;
                  } else {
                    l.i(param5, var19, var16, var11);
                    param0[6].b(param5, var15);
                    l.a(e.field_t);
                    break L9;
                  }
                }
                L10: {
                  if (param0[8] == null) {
                    break L10;
                  } else {
                    l.i(var17, var19, var10, var11);
                    param0[8].b(var13, var15);
                    l.a(e.field_t);
                    break L10;
                  }
                }
                L11: {
                  if (null == param0[1]) {
                    break L11;
                  } else {
                    if (param0[1].field_q == 0) {
                      break L11;
                    } else {
                      l.i(var16, param2, var17, var18);
                      var20 = var12;
                      L12: while (true) {
                        L13: {
                          if (var20 >= var13) {
                            break L13;
                          } else {
                            param0[1].b(var20, param2);
                            var20 = var20 + param0[1].field_q;
                            if (0 == 0) {
                              continue L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        l.a(e.field_t);
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  var20 = 15 / ((param4 - -43) / 56);
                  if (null == param0[7]) {
                    break L14;
                  } else {
                    if (param0[7].field_q != 0) {
                      l.i(var16, var19, var17, var11);
                      var21 = var12;
                      L15: while (true) {
                        L16: {
                          if (var21 >= var13) {
                            break L16;
                          } else {
                            param0[7].b(var21, var15);
                            var21 = var21 + param0[7].field_q;
                            if (0 == 0) {
                              continue L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        l.a(e.field_t);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L17: {
                  if (null == param0[3]) {
                    break L17;
                  } else {
                    if (param0[3].field_u != 0) {
                      l.i(param5, var18, var16, var19);
                      var21 = var14;
                      L18: while (true) {
                        L19: {
                          if (var21 >= var15) {
                            break L19;
                          } else {
                            param0[3].b(param5, var21);
                            var21 = var21 + param0[3].field_u;
                            if (0 == 0) {
                              continue L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        l.a(e.field_t);
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                L20: {
                  if (param0[5] == null) {
                    break L20;
                  } else {
                    if (-1 != (param0[5].field_u ^ -1)) {
                      l.i(var17, var18, var10, var19);
                      var21 = var14;
                      L21: while (true) {
                        L22: {
                          if (var15 <= var21) {
                            break L22;
                          } else {
                            param0[5].b(var13, var21);
                            var21 = var21 + param0[5].field_u;
                            if (0 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        l.a(e.field_t);
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                }
                L23: {
                  if (param0[4] == null) {
                    break L23;
                  } else {
                    if (param0[4].field_q == 0) {
                      break L23;
                    } else {
                      if (param0[4].field_u == 0) {
                        break L23;
                      } else {
                        l.i(var16, var18, var17, var19);
                        var21 = var14;
                        L24: while (true) {
                          L25: {
                            if (var21 >= var15) {
                              break L25;
                            } else {
                              var22 = var12;
                              L26: while (true) {
                                L27: {
                                  if (var22 >= var13) {
                                    break L27;
                                  } else {
                                    param0[4].b(var22, var21);
                                    var22 = var22 + param0[4].field_q;
                                    if (0 == 0) {
                                      continue L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                                var21 = var21 + param0[4].field_u;
                                if (0 == 0) {
                                  continue L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                          }
                          l.a(e.field_t);
                          break L23;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    jl(gl param0) {
        super(param0.field_w, param0.field_u, param0.field_p, param0.field_n, (cj) null, (sc) null);
        param0.a(0, (byte) 112, ((jl) this).field_p, 0, ((jl) this).field_n);
        ((jl) this).field_F = param0;
        ((jl) this).field_J = 256;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param2 == 0)) {
            return;
        }
        if (!(((jl) this).field_F != null)) {
            return;
        }
        if (0 == ((jl) this).field_J) {
            return;
        }
        if ((((jl) this).field_J ^ -1) == -257) {
            ((jl) this).field_F.a(((jl) this).field_w + param0, -124, param2, ((jl) this).field_u + param3);
            return;
        }
        if (param1 >= -106) {
            jl.g((byte) -79);
        }
        ci var6 = new ci(((jl) this).field_F.field_p, ((jl) this).field_F.field_n);
        il.a(1, var6);
        ((jl) this).field_F.a(0, -128, param2, 0);
        ij.a(false);
        var6.a(param0 - -((jl) this).field_w, param3 + ((jl) this).field_u, ((jl) this).field_J);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new int[8192];
    }
}
