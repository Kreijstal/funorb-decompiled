/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    int[] field_g;
    int field_q;
    int field_b;
    private byte[] field_n;
    int[] field_j;
    int[] field_i;
    private int[][] field_a;
    dl field_l;
    int[][] field_k;
    int[] field_c;
    byte[][] field_p;
    int[] field_d;
    private int[] field_r;
    static hl field_f;
    static int field_e;
    int field_m;
    static int field_h;
    dl[] field_s;
    private int field_o;

    public static void a(byte param0) {
        field_f = null;
        int var1 = -101 / ((param0 - 41) / 44);
    }

    private final void a(byte[] param0, int param1) {
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
        int var15 = 0;
        int var16 = 0;
        rb var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = StarCannon.field_A;
          var17 = new rb(hc.a((byte) 51, param0));
          var4 = var17.j(7909);
          if (-6 < var4) {
            break L0;
          } else {
            if (-8 < var4) {
              break L0;
            } else {
              L1: {
                if ((var4 ^ -1) > -7) {
                  ((ak) this).field_q = 0;
                  break L1;
                } else {
                  ((ak) this).field_q = var17.f((byte) -84);
                  break L1;
                }
              }
              L2: {
                var5 = var17.j(7909);
                if ((var5 & 1) == 0) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (var4 < 7) {
                  ((ak) this).field_o = var17.i(-1174051992);
                  break L3;
                } else {
                  ((ak) this).field_o = var17.e(113);
                  break L3;
                }
              }
              L4: {
                if ((2 & var5) == 0) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                if (param1 < -84) {
                  break L5;
                } else {
                  ak.a((byte) -37);
                  break L5;
                }
              }
              L6: {
                ((ak) this).field_g = new int[((ak) this).field_o];
                var9 = -1;
                if (7 > var4) {
                  var10 = 0;
                  L7: while (true) {
                    if (((ak) this).field_o <= var10) {
                      break L6;
                    } else {
                      var8 = var8 + var17.i(-1174051992);
                      ((ak) this).field_g[var10] = var8 + var17.i(-1174051992);
                      if (var9 < ((ak) this).field_g[var10]) {
                        var9 = ((ak) this).field_g[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L8: while (true) {
                    if (var10 >= ((ak) this).field_o) {
                      break L6;
                    } else {
                      var8 = var8 + var17.e(90);
                      ((ak) this).field_g[var10] = var8 + var17.e(90);
                      if (((ak) this).field_g[var10] > var9) {
                        var9 = ((ak) this).field_g[var10];
                        var10++;
                        continue L8;
                      } else {
                        var10++;
                        continue L8;
                      }
                    }
                  }
                }
              }
              L9: {
                ((ak) this).field_m = var9 + 1;
                ((ak) this).field_c = new int[((ak) this).field_m];
                ((ak) this).field_d = new int[((ak) this).field_m];
                ((ak) this).field_i = new int[((ak) this).field_m];
                if (var7 == 0) {
                  break L9;
                } else {
                  ((ak) this).field_p = new byte[((ak) this).field_m][];
                  break L9;
                }
              }
              L10: {
                ((ak) this).field_k = new int[((ak) this).field_m][];
                ((ak) this).field_j = new int[((ak) this).field_m];
                if (var6 != 0) {
                  ((ak) this).field_r = new int[((ak) this).field_m];
                  var10 = 0;
                  L11: while (true) {
                    if (((ak) this).field_m <= var10) {
                      var10 = 0;
                      L12: while (true) {
                        if (((ak) this).field_o <= var10) {
                          ((ak) this).field_l = new dl(((ak) this).field_r);
                          break L10;
                        } else {
                          ((ak) this).field_r[((ak) this).field_g[var10]] = var17.f((byte) -109);
                          var10++;
                          continue L12;
                        }
                      }
                    } else {
                      ((ak) this).field_r[var10] = -1;
                      var10++;
                      continue L11;
                    }
                  }
                } else {
                  break L10;
                }
              }
              var10 = 0;
              L13: while (true) {
                if (((ak) this).field_o <= var10) {
                  L14: {
                    if (var7 == 0) {
                      break L14;
                    } else {
                      var10 = 0;
                      L15: while (true) {
                        if (((ak) this).field_o <= var10) {
                          break L14;
                        } else {
                          var21 = new byte[64];
                          var17.a(64, (byte) 88, var21, 0);
                          ((ak) this).field_p[((ak) this).field_g[var10]] = var21;
                          var10++;
                          continue L15;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L16: while (true) {
                    if (var10 >= ((ak) this).field_o) {
                      L17: {
                        if (7 > var4) {
                          var10 = 0;
                          L18: while (true) {
                            if (var10 >= ((ak) this).field_o) {
                              var10 = 0;
                              L19: while (true) {
                                if (var10 >= ((ak) this).field_o) {
                                  break L17;
                                } else {
                                  var11 = ((ak) this).field_g[var10];
                                  var8 = 0;
                                  var12 = ((ak) this).field_i[var11];
                                  ((ak) this).field_k[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L20: while (true) {
                                    if (var12 <= var14) {
                                      ((ak) this).field_j[var11] = 1 + var13;
                                      if (var12 == var13 - -1) {
                                        ((ak) this).field_k[var11] = null;
                                        var10++;
                                        continue L19;
                                      } else {
                                        var10++;
                                        continue L19;
                                      }
                                    } else {
                                      var8 = var8 + var17.i(-1174051992);
                                      ((ak) this).field_k[var11][var14] = var8 + var17.i(-1174051992);
                                      var15 = var8 + var17.i(-1174051992);
                                      if (var13 < var15) {
                                        var13 = var15;
                                        var14++;
                                        continue L20;
                                      } else {
                                        var14++;
                                        continue L20;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ak) this).field_i[((ak) this).field_g[var10]] = var17.i(-1174051992);
                              var10++;
                              continue L18;
                            }
                          }
                        } else {
                          var10 = 0;
                          L21: while (true) {
                            if (var10 >= ((ak) this).field_o) {
                              var10 = 0;
                              L22: while (true) {
                                if (((ak) this).field_o <= var10) {
                                  break L17;
                                } else {
                                  var11 = ((ak) this).field_g[var10];
                                  var8 = 0;
                                  var12 = ((ak) this).field_i[var11];
                                  var13 = -1;
                                  ((ak) this).field_k[var11] = new int[var12];
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      ((ak) this).field_j[var11] = 1 + var13;
                                      if (1 + var13 == var12) {
                                        ((ak) this).field_k[var11] = null;
                                        var10++;
                                        continue L22;
                                      } else {
                                        var10++;
                                        continue L22;
                                      }
                                    } else {
                                      var8 = var8 + var17.e(74);
                                      ((ak) this).field_k[var11][var14] = var8 + var17.e(74);
                                      var15 = var8 + var17.e(74);
                                      if (var15 > var13) {
                                        var13 = var15;
                                        var14++;
                                        continue L23;
                                      } else {
                                        var14++;
                                        continue L23;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              ((ak) this).field_i[((ak) this).field_g[var10]] = var17.e(-116);
                              var10++;
                              continue L21;
                            }
                          }
                        }
                      }
                      L24: {
                        if (var6 == 0) {
                          break L24;
                        } else {
                          ((ak) this).field_s = new dl[var9 + 1];
                          ((ak) this).field_a = new int[var9 + 1][];
                          var10 = 0;
                          L25: while (true) {
                            if (((ak) this).field_o <= var10) {
                              break L24;
                            } else {
                              var11 = ((ak) this).field_g[var10];
                              var12 = ((ak) this).field_i[var11];
                              ((ak) this).field_a[var11] = new int[((ak) this).field_j[var11]];
                              var13 = 0;
                              L26: while (true) {
                                if (var13 >= ((ak) this).field_j[var11]) {
                                  var13 = 0;
                                  L27: while (true) {
                                    if (var12 <= var13) {
                                      ((ak) this).field_s[var11] = new dl(((ak) this).field_a[var11]);
                                      var10++;
                                      continue L25;
                                    } else {
                                      L28: {
                                        if (null == ((ak) this).field_k[var11]) {
                                          var14 = var13;
                                          break L28;
                                        } else {
                                          var14 = ((ak) this).field_k[var11][var13];
                                          break L28;
                                        }
                                      }
                                      ((ak) this).field_a[var11][var14] = var17.f((byte) -108);
                                      var13++;
                                      continue L27;
                                    }
                                  }
                                } else {
                                  ((ak) this).field_a[var11][var13] = -1;
                                  var13++;
                                  continue L26;
                                }
                              }
                            }
                          }
                        }
                      }
                      return;
                    } else {
                      ((ak) this).field_d[((ak) this).field_g[var10]] = var17.f((byte) -115);
                      var10++;
                      continue L16;
                    }
                  }
                } else {
                  ((ak) this).field_c[((ak) this).field_g[var10]] = var17.f((byte) -107);
                  var10++;
                  continue L13;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    final static void a(int param0) {
        int var1 = 0;
        ia var2 = null;
        int var3 = 0;
        int var4 = 0;
        vc var5 = null;
        long var5_long = 0L;
        int var6 = 0;
        re var7_ref_re = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String[][] var9 = null;
        String[][] var10 = null;
        long[][] var11 = null;
        int[][] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        L0: {
          var27 = StarCannon.field_A;
          var1 = -2 % ((param0 - -38) / 55);
          var2 = se.field_p;
          var3 = var2.j(7909);
          if (var3 == 0) {
            var4 = var2.i(-1174051992);
            var5 = (vc) (Object) ne.field_c.c(-3905);
            L1: while (true) {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  if (var4 == var5.field_i) {
                    break L2;
                  } else {
                    var5 = (vc) (Object) ne.field_c.a(-16913);
                    continue L1;
                  }
                }
              }
              if (var5 == null) {
                ec.a((byte) 27);
                return;
              } else {
                L3: {
                  var6 = var2.j(7909);
                  if (var6 != 0) {
                    var7 = var5.field_h;
                    ok.field_rb[0].field_f = null;
                    ok.field_rb[0].field_a = we.field_i;
                    var8 = var5.field_l;
                    ok.field_rb[0].field_e = false;
                    var9_int = 1;
                    L4: while (true) {
                      if (var6 <= var9_int) {
                        var5.field_n = new String[3][var7];
                        var9 = new String[3][var7];
                        var10 = new String[3][var7];
                        var5.field_g = new long[3][var7];
                        var11 = new long[3][var7];
                        var5.field_o = new int[3][var8 * var7];
                        var12 = new int[3][var8 * var7];
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = 0;
                        var19 = var2.j(7909);
                        if (-1 <= (var19 ^ -1)) {
                          break L3;
                        } else {
                          var20 = 0;
                          L5: while (true) {
                            if (var19 <= var20) {
                              break L3;
                            } else {
                              L6: {
                                var21 = var2.j(7909);
                                var22 = ok.field_rb[var21].field_a;
                                var23 = var2.c((byte) 5);
                                var25 = var2.field_g;
                                if (var7 > var20) {
                                  var9[0][var13] = var22;
                                  var10[0][var13] = ok.field_rb[var21].field_f;
                                  var11[0][var13] = var23;
                                  var13++;
                                  var26 = 0;
                                  L7: while (true) {
                                    if (var8 <= var26) {
                                      break L6;
                                    } else {
                                      var16++;
                                      var12[0][var16] = var2.f((byte) -101);
                                      var26++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              L8: {
                                if (var22 == null) {
                                  break L8;
                                } else {
                                  if (mc.a(var22, 0)) {
                                    var9[1][var14] = we.field_i;
                                    var10[1][var14] = null;
                                    var11[1][var14] = var23;
                                    var2.field_g = var25;
                                    var14++;
                                    var26 = 0;
                                    L9: while (true) {
                                      if (var8 <= var26) {
                                        break L8;
                                      } else {
                                        var17++;
                                        var12[1][var17] = var2.f((byte) -94);
                                        var26++;
                                        continue L9;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if (var15 < var7) {
                                if (!ok.field_rb[var21].field_e) {
                                  ok.field_rb[var21].field_e = true;
                                  var9[2][var15] = var22;
                                  var10[2][var15] = ok.field_rb[var21].field_f;
                                  var11[2][var15] = var23;
                                  var15++;
                                  var2.field_g = var25;
                                  var26 = 0;
                                  L10: while (true) {
                                    if (var26 < var8) {
                                      var18++;
                                      var12[2][var18] = var2.f((byte) -99);
                                      var26++;
                                      continue L10;
                                    } else {
                                      var20++;
                                      continue L5;
                                    }
                                  }
                                } else {
                                  var20++;
                                  continue L5;
                                }
                              } else {
                                var20++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        ok.field_rb[var9_int].field_a = var2.a(-24);
                        ok.field_rb[var9_int].field_e = false;
                        if (1 != var2.j(7909)) {
                          ok.field_rb[var9_int].field_f = null;
                          var9_int++;
                          continue L4;
                        } else {
                          ok.field_rb[var9_int].field_f = var2.a(-33);
                          var9_int++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                var5.field_j = true;
                var5.b(4);
                break L0;
              }
            }
          } else {
            if (var3 != 1) {
              hc.a((Throwable) null, "HS1: " + oe.a(-109), (byte) 70);
              ec.a((byte) 27);
              break L0;
            } else {
              var4 = var2.i(-1174051992);
              var5_long = var2.c((byte) 5);
              var7_ref_re = (re) (Object) s.field_e.c(-3905);
              L11: while (true) {
                L12: {
                  if (var7_ref_re == null) {
                    break L12;
                  } else {
                    if (var7_ref_re.field_g != var4) {
                      var7_ref_re = (re) (Object) s.field_e.a(-16913);
                      continue L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (var7_ref_re != null) {
                  var7_ref_re.field_k = var5_long;
                  var7_ref_re.b(4);
                  break L0;
                } else {
                  ec.a((byte) 27);
                  return;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5, int[] param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var43 = 0;
        var43 = StarCannon.field_A;
        if (param2 < 0) {
          return;
        } else {
          if (param0 >= gl.field_a) {
            return;
          } else {
            L0: {
              if (param1 >= 0) {
                break L0;
              } else {
                if (param13 >= 0) {
                  break L0;
                } else {
                  if (param12 >= 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (gl.field_f > param1) {
                break L1;
              } else {
                if (gl.field_f > param13) {
                  break L1;
                } else {
                  if (gl.field_f <= param12) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                var35 = 3 % ((2 - param5) / 40);
                var34 = param2 - param0;
                if (param0 == param4) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var18 = param1 << 1880032176;
                      var17 = param1 << 1880032176;
                      var22 = param15 << 1430941360;
                      var21 = param15 << 1430941360;
                      var26 = param9 << 961864848;
                      var25 = param9 << 961864848;
                      var30 = param8 << -436093072;
                      var29 = param8 << -436093072;
                      var36 = -param0 + param4;
                      var19 = (param13 + -param1 << 1984726384) / var36;
                      var20 = (-param1 + param12 << -406512848) / var34;
                      if (var19 >= var20) {
                        break L5;
                      } else {
                        var32 = (-param8 + param3 << -2011544240) / var34;
                        var31 = (-param8 + param7 << -1048086384) / var36;
                        var27 = (-param9 + param10 << -2021694864) / var36;
                        var24 = (param16 + -param15 << 1530257232) / var34;
                        var28 = (-param9 + param14 << 1120008016) / var34;
                        var23 = (param11 - param15 << -1061558672) / var36;
                        var33 = 0;
                        if (0 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var23 = (-param15 + param16 << -980114224) / var34;
                    var33 = 1;
                    var24 = (-param15 + param11 << 469594512) / var36;
                    var32 = (-param8 + param7 << -1270080976) / var36;
                    var31 = (-param8 + param3 << 753144560) / var34;
                    var37 = var19;
                    var19 = var20;
                    var20 = var37;
                    var28 = (-param9 + param10 << 253378064) / var36;
                    var27 = (-param9 + param14 << -1557940912) / var34;
                    break L4;
                  }
                  L6: {
                    L7: {
                      if (param0 >= 0) {
                        var37 = gl.field_c[param0];
                        L8: while (true) {
                          if (param0 >= param4) {
                            break L6;
                          } else {
                            L9: {
                              var38 = var17 >> 1047896464;
                              if (gl.field_f <= var38) {
                                break L9;
                              } else {
                                var39 = -(var17 >> -862826448) + (var18 >> -500177232);
                                if (var39 == 0) {
                                  if (var38 < 0) {
                                    break L9;
                                  } else {
                                    if (var38 >= gl.field_f) {
                                      break L9;
                                    } else {
                                      hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                      break L9;
                                    }
                                  }
                                } else {
                                  if (var38 < 0) {
                                    break L9;
                                  } else {
                                    if (var38 >= gl.field_f) {
                                      break L9;
                                    } else {
                                      hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            param0++;
                            if (param0 >= gl.field_a) {
                              return;
                            } else {
                              var29 = var29 + var31;
                              var22 = var22 + var24;
                              var37 = var37 + ki.field_j;
                              var25 = var25 + var27;
                              var21 = var21 + var23;
                              var30 = var30 + var32;
                              var26 = var26 + var28;
                              var17 = var17 + var19;
                              var18 = var18 + var20;
                              if (0 == 0) {
                                continue L8;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      } else {
                        L10: {
                          if (param4 >= 0) {
                            break L10;
                          } else {
                            param0 = param4 - param0;
                            var26 = var26 + var28 * param0;
                            var17 = var17 + var19 * param0;
                            var30 = var30 + param0 * var32;
                            var25 = var25 + var27 * param0;
                            var29 = var29 + var31 * param0;
                            var18 = var18 + var20 * param0;
                            var22 = var22 + param0 * var24;
                            var21 = var21 + var23 * param0;
                            param0 = param4;
                            if (0 == 0) {
                              break L6;
                            } else {
                              break L10;
                            }
                          }
                        }
                        param0 = -param0;
                        var17 = var17 + var19 * param0;
                        var18 = var18 + var20 * param0;
                        var21 = var21 + var23 * param0;
                        var26 = var26 + var28 * param0;
                        var25 = var25 + var27 * param0;
                        var22 = var22 + param0 * var24;
                        var29 = var29 + var31 * param0;
                        var30 = var30 + param0 * var32;
                        param0 = 0;
                        break L7;
                      }
                    }
                    var37 = gl.field_c[param0];
                    L11: while (true) {
                      if (param0 >= param4) {
                        break L6;
                      } else {
                        L12: {
                          var38 = var17 >> 1047896464;
                          if (gl.field_f <= var38) {
                            break L12;
                          } else {
                            var39 = -(var17 >> -862826448) + (var18 >> -500177232);
                            if (var39 == 0) {
                              if (var38 < 0) {
                                break L12;
                              } else {
                                if (var38 >= gl.field_f) {
                                  break L12;
                                } else {
                                  hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                  break L12;
                                }
                              }
                            } else {
                              if (var38 < 0) {
                                break L12;
                              } else {
                                if (var38 >= gl.field_f) {
                                  break L12;
                                } else {
                                  hb.a(0, var38 - -var37, 0, var29, var25, 68, var39, param6, var21, 0);
                                  break L12;
                                }
                              }
                            }
                          }
                        }
                        param0++;
                        if (param0 >= gl.field_a) {
                          return;
                        } else {
                          var29 = var29 + var31;
                          var22 = var22 + var24;
                          var37 = var37 + ki.field_j;
                          var25 = var25 + var27;
                          var21 = var21 + var23;
                          var30 = var30 + var32;
                          var26 = var26 + var28;
                          var17 = var17 + var19;
                          var18 = var18 + var20;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var37 = -param4 + param2;
                      if (var37 != 0) {
                        break L14;
                      } else {
                        var28 = 0;
                        var23 = 0;
                        var20 = 0;
                        var31 = 0;
                        var27 = 0;
                        var32 = 0;
                        var24 = 0;
                        var19 = 0;
                        if (0 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    L15: {
                      L16: {
                        var38 = param12 << 775833232;
                        var39 = param16 << -2139707024;
                        var40 = param14 << 582831152;
                        if (var33 == 0) {
                          break L16;
                        } else {
                          var22 = param11 << -208223600;
                          var30 = param7 << 795414576;
                          var26 = param10 << -18704176;
                          var18 = param13 << -1910714448;
                          if (0 == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      var25 = param10 << -2028421392;
                      var29 = param7 << -1986891792;
                      var17 = param13 << 1185722096;
                      var21 = param11 << 488798512;
                      break L15;
                    }
                    var41 = param3 << 1198360752;
                    var24 = (var39 + -var22) / var37;
                    var28 = (-var26 + var40) / var37;
                    var23 = (var39 + -var21) / var37;
                    var27 = (-var25 + var40) / var37;
                    var19 = (-var17 + var38) / var37;
                    var32 = (var41 - var30) / var37;
                    var20 = (var38 + -var18) / var37;
                    var31 = (var41 + -var29) / var37;
                    break L13;
                  }
                  if (0 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L17: {
                L18: {
                  if (param2 == param0) {
                    break L18;
                  } else {
                    L19: {
                      L20: {
                        var36 = -param4 + param2;
                        if (param1 >= param13) {
                          break L20;
                        } else {
                          var23 = (-param15 + param16 << -2114686864) / var34;
                          var28 = (-param10 + param14 << -1324215088) / var36;
                          var30 = param7 << -486505104;
                          var24 = (param16 + -param11 << 1483410160) / var36;
                          var26 = param10 << -367489744;
                          var17 = param1 << 1614647184;
                          var25 = param9 << -1208807856;
                          var29 = param8 << 1316735536;
                          var19 = (param12 - param1 << 1319671696) / var34;
                          var32 = (param3 + -param7 << 1644594832) / var36;
                          var18 = param13 << -1198781840;
                          var22 = param11 << -372490416;
                          var27 = (param14 - param9 << 2106508112) / var34;
                          var31 = (-param8 + param3 << -503690576) / var34;
                          var21 = param15 << -291021648;
                          var20 = (param12 + -param13 << -368646992) / var36;
                          if (0 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      var21 = param11 << -866068016;
                      var22 = param15 << -1175133840;
                      var30 = param8 << 1433556976;
                      var19 = (-param13 + param12 << 702761776) / var36;
                      var23 = (param16 + -param11 << 1299947120) / var36;
                      var29 = param7 << 1229241104;
                      var18 = param1 << 1889839856;
                      var26 = param9 << -1938459248;
                      var27 = (-param10 + param14 << -1953199472) / var36;
                      var24 = (param16 + -param15 << -1432157936) / var34;
                      var28 = (-param9 + param14 << 118413840) / var34;
                      var17 = param13 << 949506480;
                      var25 = param10 << -903855952;
                      var31 = (-param7 + param3 << 150148752) / var36;
                      var20 = (-param1 + param12 << 1766238352) / var34;
                      var32 = (-param8 + param3 << -1922842192) / var34;
                      break L19;
                    }
                    if (0 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                var18 = param13 << -696537104;
                var28 = 0;
                var29 = param8;
                var20 = 0;
                var24 = 0;
                var31 = 0;
                var17 = param1 << -189363472;
                var26 = param10;
                var25 = param9;
                var23 = 0;
                var27 = 0;
                var30 = param7;
                var32 = 0;
                var19 = 0;
                var22 = param11;
                var21 = param15;
                break L17;
              }
              var33 = 0;
              if (0 <= param0) {
                break L2;
              } else {
                param0 = Math.min(-param0, param4 - param0);
                var30 = var30 + var32 * param0;
                var18 = var18 + param0 * var20;
                var17 = var17 + var19 * param0;
                var22 = var22 + param0 * var24;
                var21 = var21 + var23 * param0;
                var26 = var26 + var28 * param0;
                var29 = var29 + param0 * var31;
                var25 = var25 + param0 * var27;
                param0 = 0;
                break L2;
              }
            }
            L21: {
              if (0 <= param0) {
                break L21;
              } else {
                param0 = -param0;
                var22 = var22 + param0 * var24;
                var17 = var17 + param0 * var19;
                var26 = var26 + var28 * param0;
                var21 = var21 + var23 * param0;
                var25 = var25 + var27 * param0;
                var29 = var29 + var31 * param0;
                var30 = var30 + param0 * var32;
                var18 = var18 + var20 * param0;
                param0 = 0;
                break L21;
              }
            }
            var36 = gl.field_c[param0];
            L22: while (true) {
              L23: {
                if (param0 >= param2) {
                  break L23;
                } else {
                  L24: {
                    var37 = var17 >> -1967238096;
                    if (gl.field_f > var37) {
                      L25: {
                        var38 = (var18 >> 2044761712) - (var17 >> -946723696);
                        if (var38 == 0) {
                          break L25;
                        } else {
                          L26: {
                            var39 = (var22 - var21) / var38;
                            var40 = (-var25 + var26) / var38;
                            var41 = (-var29 + var30) / var38;
                            if (var37 + var38 >= gl.field_f) {
                              var38 = gl.field_f + -var37 - 1;
                              break L26;
                            } else {
                              break L26;
                            }
                          }
                          L27: {
                            L28: {
                              if (var37 >= 0) {
                                break L28;
                              } else {
                                hb.a(var41, var36, var39, -(var37 * var41) + var29, var25 - var40 * var37, -58, var38 + var37, param6, -(var37 * var39) + var21, var40);
                                if (0 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            hb.a(var41, var36 + var37, var39, var29, var25, -22, var38, param6, var21, var40);
                            break L27;
                          }
                          if (0 == 0) {
                            break L24;
                          } else {
                            break L25;
                          }
                        }
                      }
                      if (var37 < 0) {
                        break L24;
                      } else {
                        if (gl.field_f > var37) {
                          hb.a(0, var37 + var36, 0, var29, var25, 77, var38, param6, var21, 0);
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                    } else {
                      break L24;
                    }
                  }
                  param0++;
                  if (param0 < gl.field_a) {
                    var36 = var36 + ki.field_j;
                    var21 = var21 + var23;
                    var18 = var18 + var20;
                    var26 = var26 + var28;
                    var22 = var22 + var24;
                    var25 = var25 + var27;
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var17 = var17 + var19;
                    if (0 == 0) {
                      continue L22;
                    } else {
                      break L23;
                    }
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
    }

    ak(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((ak) this).field_b = mg.a(param0.length, param0, (byte) -67);
        if (param1 != ((ak) this).field_b) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (64 != param2.length) {
                throw new RuntimeException();
            }
            ((ak) this).field_n = bd.a(param0.length, param0, (byte) 70, 0);
            for (var4 = 0; var4 < 64; var4++) {
                if (param2[var4] != ((ak) this).field_n[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(param0, -111);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new hl(270, 70);
        field_h = 480;
    }
}
