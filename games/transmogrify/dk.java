/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    private uh field_e;
    static boolean field_b;
    private oa field_l;
    private pj field_f;
    static int field_h;
    private java.math.BigInteger field_g;
    private be[] field_d;
    private java.math.BigInteger field_j;
    static int[] field_k;
    private cd field_c;
    static int field_i;
    static String field_a;

    dk(uh param0, cd param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final static kk a(String param0, long param1, boolean param2, String param3, int param4) {
        if (param4 < 7) {
            dk.a((byte) 119);
        }
        if (-1L == (param1 ^ -1L)) {
            if (param0 != null) {
                return (kk) (Object) new ac(param0, param3);
            }
        }
        if (!(!param2)) {
            return (kk) (Object) new bd(param1, param3);
        }
        return (kk) (Object) new wj(param1, param3);
    }

    final static void a(int param0, ti[] param1, int param2, int param3, int param4, int param5) {
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
        var22 = Transmogrify.field_A ? 1 : 0;
        if (param1 != null) {
          L0: {
            if ((param5 ^ -1) >= -1) {
              break L0;
            } else {
              if ((param0 ^ -1) >= -1) {
                break L0;
              } else {
                L1: {
                  if (null == param1[3]) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    break L1;
                  } else {
                    stackOut_7_0 = param1[3].field_r;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
                L2: {
                  var6 = stackIn_9_0;
                  if (null != param1[5]) {
                    stackOut_11_0 = param1[5].field_r;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 0;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_12_0;
                  if (null == param1[1]) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = param1[1].field_s;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var8 = stackIn_15_0;
                  if (null == param1[7]) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L4;
                  } else {
                    stackOut_16_0 = param1[7].field_s;
                    stackIn_18_0 = stackOut_16_0;
                    break L4;
                  }
                }
                var9 = stackIn_18_0;
                var10 = param5 + param3;
                if (param2 == -28018) {
                  L5: {
                    var11 = param4 + param0;
                    var12 = var6 + param3;
                    var13 = var10 - var7;
                    var14 = param4 - -var8;
                    var15 = -var9 + var11;
                    var16 = var12;
                    var17 = var13;
                    if (var16 > var17) {
                      var17 = param5 * var6 / (var6 + var7) + param3;
                      var16 = param5 * var6 / (var6 + var7) + param3;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var18 = var14;
                    var19 = var15;
                    sb.a(cc.field_d);
                    if (var19 >= var18) {
                      break L6;
                    } else {
                      var19 = param4 - -(param0 * var8 / (var8 - -var9));
                      var18 = param4 - -(param0 * var8 / (var8 - -var9));
                      break L6;
                    }
                  }
                  L7: {
                    if (param1[0] != null) {
                      sb.g(param3, param4, var16, var18);
                      param1[0].c(param3, param4);
                      sb.b(cc.field_d);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (null != param1[2]) {
                      sb.g(var17, param4, var10, var18);
                      param1[2].c(var13, param4);
                      sb.b(cc.field_d);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (null != param1[6]) {
                      sb.g(param3, var19, var16, var11);
                      param1[6].c(param3, var15);
                      sb.b(cc.field_d);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (null != param1[8]) {
                      sb.g(var17, var19, var10, var11);
                      param1[8].c(var13, var15);
                      sb.b(cc.field_d);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (param1[1] == null) {
                      break L11;
                    } else {
                      if (-1 == (param1[1].field_r ^ -1)) {
                        break L11;
                      } else {
                        sb.g(var16, param4, var17, var18);
                        var20 = var12;
                        L12: while (true) {
                          L13: {
                            if (var20 >= var13) {
                              break L13;
                            } else {
                              param1[1].c(var20, param4);
                              var20 = var20 + param1[1].field_r;
                              if (0 == 0) {
                                continue L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          sb.b(cc.field_d);
                          break L11;
                        }
                      }
                    }
                  }
                  L14: {
                    if (param1[7] == null) {
                      break L14;
                    } else {
                      if (-1 == (param1[7].field_r ^ -1)) {
                        break L14;
                      } else {
                        sb.g(var16, var19, var17, var11);
                        var20 = var12;
                        L15: while (true) {
                          L16: {
                            if (var13 <= var20) {
                              break L16;
                            } else {
                              param1[7].c(var20, var15);
                              var20 = var20 + param1[7].field_r;
                              if (0 == 0) {
                                continue L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          sb.b(cc.field_d);
                          break L14;
                        }
                      }
                    }
                  }
                  L17: {
                    if (null == param1[3]) {
                      break L17;
                    } else {
                      if (-1 == (param1[3].field_s ^ -1)) {
                        break L17;
                      } else {
                        sb.g(param3, var18, var16, var19);
                        var20 = var14;
                        L18: while (true) {
                          L19: {
                            if (var15 <= var20) {
                              break L19;
                            } else {
                              param1[3].c(param3, var20);
                              var20 = var20 + param1[3].field_s;
                              if (0 == 0) {
                                continue L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          sb.b(cc.field_d);
                          break L17;
                        }
                      }
                    }
                  }
                  L20: {
                    if (null == param1[5]) {
                      break L20;
                    } else {
                      if (0 == param1[5].field_s) {
                        break L20;
                      } else {
                        sb.g(var17, var18, var10, var19);
                        var20 = var14;
                        L21: while (true) {
                          L22: {
                            if (var20 >= var15) {
                              break L22;
                            } else {
                              param1[5].c(var13, var20);
                              var20 = var20 + param1[5].field_s;
                              if (0 == 0) {
                                continue L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          sb.b(cc.field_d);
                          break L20;
                        }
                      }
                    }
                  }
                  L23: {
                    if (null == param1[4]) {
                      break L23;
                    } else {
                      if (param1[4].field_r == 0) {
                        break L23;
                      } else {
                        if (-1 == (param1[4].field_s ^ -1)) {
                          break L23;
                        } else {
                          sb.g(var16, var18, var17, var19);
                          var20 = var14;
                          L24: while (true) {
                            L25: {
                              if (var20 >= var15) {
                                break L25;
                              } else {
                                var21 = var12;
                                L26: while (true) {
                                  L27: {
                                    if (var13 <= var21) {
                                      break L27;
                                    } else {
                                      param1[4].c(var21, var20);
                                      var21 = var21 + param1[4].field_r;
                                      if (0 == 0) {
                                        continue L26;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var20 = var20 + param1[4].field_s;
                                  if (0 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            sb.b(cc.field_d);
                            break L23;
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
            }
          }
          return;
        } else {
          return;
        }
    }

    final be a(int param0, boolean param1, int param2, ak param3, ak param4) {
        if (!(((dk) this).field_l != null)) {
            throw new RuntimeException();
        }
        if (-1 >= (param0 ^ -1)) {
            // if_icmple L37
        } else {
            throw new RuntimeException();
        }
        if (null != ((dk) this).field_d[param0]) {
            return ((dk) this).field_d[param0];
        }
        ((dk) this).field_l.field_h = 6 + 72 * param0;
        int var6 = ((dk) this).field_l.c((byte) -112);
        int var7 = ((dk) this).field_l.c((byte) -108);
        byte[] var11 = new byte[64];
        ((dk) this).field_l.a(64, 2, var11, 0);
        if (param2 != 24108) {
            field_b = true;
        }
        be var9 = new be(param0, param4, param3, ((dk) this).field_e, ((dk) this).field_c, var6, var11, var7, param1);
        ((dk) this).field_d[param0] = var9;
        return var9;
    }

    private dk(uh param0, cd param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((dk) this).field_j = param3;
        ((dk) this).field_e = param0;
        ((dk) this).field_g = param2;
        ((dk) this).field_c = param1;
        if (!((dk) this).field_e.b(6)) {
            ((dk) this).field_f = ((dk) this).field_e.a(255, false, true, (byte) 0, 255);
        }
    }

    final boolean b(boolean param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        int var8 = 0;
        oa var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        if (((dk) this).field_l != null) {
          return true;
        } else {
          L0: {
            if (null == ((dk) this).field_f) {
              if (!((dk) this).field_e.b(6)) {
                ((dk) this).field_f = ((dk) this).field_e.a(255, false, true, (byte) 0, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((dk) this).field_f.field_m) {
            var10 = new oa(((dk) this).field_f.e(256));
            var10.field_h = 5;
            var3 = var10.d((byte) 30);
            var10.field_h = var10.field_h + var3 * 72;
            var16 = new byte[var10.field_g.length + -var10.field_h];
            var14 = var16;
            var13 = var14;
            var11 = var13;
            var4 = var11;
            var10.a(var16.length, 2, var16, 0);
            if (!param0) {
              L1: {
                L2: {
                  if (((dk) this).field_g == null) {
                    break L2;
                  } else {
                    if (null == ((dk) this).field_j) {
                      break L2;
                    } else {
                      var12 = new java.math.BigInteger(var16);
                      var7_ref = var12.modPow(((dk) this).field_g, ((dk) this).field_j);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if ((var5.length ^ -1) != -66) {
                throw new RuntimeException();
              } else {
                var17 = n.a(var10.field_g, -5 + (-var16.length + var10.field_h), -5705, 5);
                var7 = 0;
                L3: while (true) {
                  if (-65 >= (var7 ^ -1)) {
                    ((dk) this).field_l = var10;
                    ((dk) this).field_d = new be[var3];
                    return true;
                  } else {
                    if (var17[var7] != var5[var7 - -1]) {
                      throw new RuntimeException();
                    } else {
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public static void a(byte param0) {
        field_k = null;
        field_a = null;
        int var1 = 45 % ((67 - param0) / 36);
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int var5 = 0;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            var4 = null;
            be discarded$2 = ((dk) this).a(-91, false, 38, (ak) null, (ak) null);
            break L0;
          }
        }
        if (((dk) this).field_d == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            if (((dk) this).field_d.length <= var2) {
              var5 = 0;
              var2 = var5;
              L2: while (true) {
                if (var5 >= ((dk) this).field_d.length) {
                  return;
                } else {
                  if (null != ((dk) this).field_d[var5]) {
                    ((dk) this).field_d[var5].b((byte) 126);
                    var5++;
                    continue L2;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((dk) this).field_d[var2] != null) {
                ((dk) this).field_d[var2].d(23881);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_i = 0;
        field_a = "Next";
    }
}
