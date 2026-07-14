/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends ie {
    int field_O;
    static int[] field_Q;
    static String field_J;
    static ak field_P;
    static int field_K;
    static boolean field_N;
    static String field_M;
    static int field_L;
    static boolean field_I;

    public static void a(byte param0) {
        int var1 = 74 % ((param0 - 31) / 58);
        field_Q = null;
        field_M = null;
        field_J = null;
        field_P = null;
    }

    sd(ng param0) {
        super(param0.field_z, param0.field_p, param0.field_E, param0.field_C, (eb) null, (fn) null);
        param0.a(((sd) this).field_E, (byte) 89, 0, 0, ((sd) this).field_C);
        ((sd) this).field_O = 256;
        ((sd) this).field_H = param0;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param1 != 0) {
            return;
        }
        if (!(null != ((sd) this).field_H)) {
            return;
        }
        if (!(((sd) this).field_O != 0)) {
            return;
        }
        if (!(256 != ((sd) this).field_O)) {
            ((sd) this).field_H.a(param0 + ((sd) this).field_p, param1, param2 + ((sd) this).field_z, (byte) 122);
            return;
        }
        tf var7 = new tf(((sd) this).field_H.field_E, ((sd) this).field_H.field_C);
        h.a(-111, var7);
        int var6 = -5 % ((70 - param3) / 49);
        ((sd) this).field_H.a(0, param1, 0, (byte) -79);
        ia.a((byte) 92);
        var7.a(((sd) this).field_z + param2, ((sd) this).field_p + param0, ((sd) this).field_O);
    }

    final static String a(String param0, int param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        var3 = param0.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param0.indexOf("<%", var5);
          if (0 <= var6_int) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!ti.a(121, param0.charAt(var5))) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref = param0.substring(var6_int + 2, var5);
              if (!td.a(-128, (CharSequence) (Object) var7_ref)) {
                continue L0;
              } else {
                if (var5 >= var3) {
                  continue L0;
                } else {
                  if (param0.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = na.a((CharSequence) (Object) var7_ref, (byte) -33);
                    var4 = var4 + (param2[var8].length() + var6_int + -var5);
                    continue L0;
                  }
                }
              }
            }
          } else {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L3: while (true) {
              var8 = param0.indexOf("<%", var5);
              if (0 <= var8) {
                var5 = 2 + var8;
                L4: while (true) {
                  L5: {
                    if (var5 >= var3) {
                      break L5;
                    } else {
                      if (!ti.a(112, param0.charAt(var5))) {
                        break L5;
                      } else {
                        var5++;
                        continue L4;
                      }
                    }
                  }
                  var9 = param0.substring(2 + var8, var5);
                  if (!td.a(-105, (CharSequence) (Object) var9)) {
                    continue L3;
                  } else {
                    if (var3 <= var5) {
                      continue L3;
                    } else {
                      if (62 == param0.charAt(var5)) {
                        var5++;
                        var10 = na.a((CharSequence) (Object) var9, (byte) -33);
                        StringBuilder discarded$3 = var6.append(param0.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        var7 = var5;
                        continue L3;
                      } else {
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param0.substring(var7));
                if (param1 > 17) {
                  return var6.toString();
                } else {
                  return null;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, rh param1, int param2) {
        int var5 = 0;
        int var6 = Pixelate.field_H ? 1 : 0;
        pc var7 = aa.field_f;
        pc var8 = var7;
        var8.g(param2, 15514);
        var8.field_m = var8.field_m + 1;
        int var4 = var8.field_m;
        var8.e(160, 1);
        var8.b(1276387944, param1.field_o);
        var8.b(1276387944, param1.field_t);
        var8.b(1276387944, param1.field_p);
        var8.d(param1.field_s, -93);
        var8.d(param1.field_v, -71);
        var8.d(param1.field_l, -40);
        var8.d(param1.field_n, -71);
        var8.e(160, param1.field_k.length);
        for (var5 = 0; param1.field_k.length > var5; var5++) {
            var7.d(param1.field_k[var5], -123);
        }
        if (param0 >= -37) {
            field_I = false;
        }
        int discarded$0 = var8.b(var4, (byte) 86);
        var8.f(var8.field_m + -var4, -1);
    }

    public sd() {
        super(0, 0, 0, 0, (eb) null, (fn) null);
        ((sd) this).field_O = 256;
    }

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
        Object var16 = null;
        we var17 = null;
        we var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = Pixelate.field_H ? 1 : 0;
        var17 = new we(param1);
        var18 = var17;
        var18.field_m = -2 + param1.length;
        im.field_Qb = var18.a((byte) 97);
        gd.field_k = new byte[im.field_Qb][];
        rl.field_m = new boolean[im.field_Qb];
        gf.field_g = new int[im.field_Qb];
        ge.field_c = new int[im.field_Qb];
        fa.field_b = new int[im.field_Qb];
        e.field_b = new int[im.field_Qb];
        wo.field_f = new byte[im.field_Qb][];
        var18.field_m = -7 + (param1.length - 8 * im.field_Qb);
        tj.field_y = var18.a((byte) 38);
        jb.field_a = var18.a((byte) 46);
        var3 = 1 + (var18.f(255) & 255);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= im.field_Qb) {
              break L1;
            } else {
              fa.field_b[var4] = var17.a((byte) 88);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param0 == -95) {
              break L2;
            } else {
              var16 = null;
              String discarded$1 = sd.a((String) null, 80, (String[]) null);
              break L2;
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (var4 >= im.field_Qb) {
                break L4;
              } else {
                e.field_b[var4] = var17.a((byte) -122);
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
                if (im.field_Qb <= var4) {
                  break L6;
                } else {
                  gf.field_g[var4] = var17.a((byte) -14);
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
                  if (var4 >= im.field_Qb) {
                    break L8;
                  } else {
                    ge.field_c[var4] = var17.a((byte) -116);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var18.field_m = param1.length - (7 - (-(8 * im.field_Qb) - 3 * (-1 + var3)));
                fl.field_g = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var3 <= var4) {
                      break L10;
                    } else {
                      L11: {
                        fl.field_g[var4] = var17.c((byte) 13);
                        if (0 != fl.field_g[var4]) {
                          break L11;
                        } else {
                          fl.field_g[var4] = 1;
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
                  var18.field_m = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= im.field_Qb) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = gf.field_g[var4];
                            var6 = ge.field_c[var4];
                            var7 = var5 * var6;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var8 = var19;
                            wo.field_f[var4] = var25;
                            var26 = new byte[var7];
                            var24 = var26;
                            var22 = var24;
                            var20 = var22;
                            var9 = var20;
                            gd.field_k[var4] = var26;
                            var10 = 0;
                            var11 = var18.f(255);
                            if ((var11 & 1) != 0) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var7 <= var12) {
                                    break L17;
                                  } else {
                                    var8[var12] = var17.a(0);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if (-1 == (var11 & 2 ^ -1)) {
                                  break L14;
                                } else {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var17.a(bn.a((int) param0, -95));
                                          var13 = var17.a(bn.a((int) param0, -95));
                                          stackOut_33_0 = var10;
                                          stackIn_35_0 = stackOut_33_0;
                                          stackIn_34_0 = stackOut_33_0;
                                          if (-1 == var13) {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackOut_35_1 = 0;
                                            stackIn_36_0 = stackOut_35_0;
                                            stackIn_36_1 = stackOut_35_1;
                                            break L20;
                                          } else {
                                            stackOut_34_0 = stackIn_34_0;
                                            stackOut_34_1 = 1;
                                            stackIn_36_0 = stackOut_34_0;
                                            stackIn_36_1 = stackOut_34_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_36_0 | stackIn_36_1;
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
                                      var8[var12 + var5 * var13] = var17.a(0);
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
                            if ((var11 & 2) != 0) {
                              var12 = 0;
                              L25: while (true) {
                                if (var12 >= var5) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var13 >= var6) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var12 + var13 * var5] = var17.a(0);
                                          var14 = var17.a(0);
                                          stackOut_51_0 = var10;
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_52_0 = stackOut_51_0;
                                          if (var14 == -1) {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 0;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            break L28;
                                          } else {
                                            stackOut_52_0 = stackIn_52_0;
                                            stackOut_52_1 = 1;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_54_0 | stackIn_54_1;
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
                        rl.field_m[var4] = var10 != 0;
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

    final static void a(boolean param0, int param1) {
        pc var2 = aa.field_f;
        if (!param0) {
            return;
        }
        var2.g(param1, 15514);
        var2.e(160, 1);
        var2.e(160, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_Q = new int[64];
        for (var0 = 0; field_Q.length > var0; var0++) {
            field_Q[var0] = 256 / field_Q.length * (65793 * var0);
        }
        field_J = "Show players in <%0>'s game";
        field_M = "Create a free Account";
    }
}
