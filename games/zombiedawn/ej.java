/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    private int[][] field_B;
    private int field_z;
    private int field_g;
    private int[][] field_k;
    private int field_l;
    private int field_c;
    private boolean field_t;
    private int[][] field_D;
    int field_u;
    on field_A;
    private int[][] field_v;
    boolean[][] field_b;
    private int[][] field_E;
    static int field_s;
    private int field_y;
    int field_p;
    private kk[] field_i;
    private kk[] field_C;
    private int[][] field_h;
    private int[][] field_w;
    private int field_j;
    private int field_n;
    private boolean field_q;
    private int[] field_e;
    static int field_d;
    private int field_f;
    static int field_x;
    private int field_r;
    static vn field_a;
    private int[] field_m;
    static vn[] field_o;

    final int[][] a(int param0) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        int[][] var6 = new int[((ej) this).field_A.field_r][((ej) this).field_A.field_k];
        int[][] var2 = var6;
        int var3 = 0;
        if (param0 != 8728) {
            return null;
        }
        while (((ej) this).field_A.field_r > var3) {
            for (var4 = 0; (var4 ^ -1) > (((ej) this).field_A.field_k ^ -1); var4++) {
                var6[var3][var4] = !this.b(param0 + -8728, var4, var3) ? -1 : 0;
            }
            var3++;
        }
        return var2;
    }

    final boolean a(boolean param0, int param1, int param2, boolean param3) {
        int var5 = param2 / 24;
        int var6 = param1 / 24;
        if ((var5 ^ -1) <= -1) {
            // if_icmpgt L59
            // if_icmple L59
            // if_icmpge L59
        } else {
            return false;
        }
        int var7 = param2 % 24;
        if (param0) {
            int discarded$0 = ((ej) this).c(126, 21, -100);
        }
        int var8 = 1;
        if (!(!param3)) {
            if (var7 > 8) {
                var8 = (byte)(var8 | 4);
            }
            if (!((var7 ^ -1) <= -17)) {
                var8 = (byte)(var8 | 2);
            }
        }
        int var9 = (byte)(7 & ((ej) this).field_A.field_p[var6][var5]);
        return (var8 & var9 ^ -1) == (var8 ^ -1) ? true : false;
    }

    public static void b(byte param0) {
        if (param0 > -83) {
            ej.a((byte) 29);
        }
        field_o = null;
        field_a = null;
    }

    private final void b(int param0) {
        ((ej) this).field_u = 24 * ((ej) this).field_A.field_k;
        if (param0 != -1) {
            this.a(49, (wk) null);
        }
        ((ej) this).field_p = ((ej) this).field_A.field_r * 24;
    }

    final void a(wk param0, int param1, boolean param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vn var12_ref_vn = null;
        vn var13 = null;
        int var13_int = 0;
        vn var13_ref = null;
        int var14 = 0;
        L0: {
          var14 = ZombieDawn.field_J;
          var5 = bd.field_d - param0.field_u;
          var6 = nh.field_G - param0.field_c;
          if (-24 > var5) {
            var5 = var5 % 24;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (23 < (var6 ^ -1)) {
            var6 = var6 % 24;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (((ej) this).field_v.length < nh.field_I) {
              break L3;
            } else {
              if (bd.field_a > ((ej) this).field_v[0].length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ((ej) this).field_v = new int[nh.field_I][bd.field_a];
          break L2;
        }
        var7 = var5;
        if (param2) {
          var8 = 0;
          L4: while (true) {
            if (var8 >= nh.field_I) {
              return;
            } else {
              var9 = 0;
              L5: while (true) {
                if ((var9 ^ -1) <= (bd.field_a ^ -1)) {
                  var5 = var7;
                  var6 += 24;
                  var8++;
                  continue L4;
                } else {
                  L6: {
                    if ((((ej) this).field_b[0].length ^ -1) >= (var9 + ((ej) this).field_f ^ -1)) {
                      break L6;
                    } else {
                      if ((((ej) this).field_b.length ^ -1) >= (var8 - -((ej) this).field_j ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          var10 = ((ej) this).field_v[var8][var9];
                          if (param1 == 1) {
                            if (!((ej) this).field_b[((ej) this).field_j + var8][var9 + ((ej) this).field_f]) {
                              L8: {
                                var11 = -1 + (var10 >> 1361820007 & 511);
                                var12 = -2 + tm.field_h.length;
                                if (!ng.field_e) {
                                  break L8;
                                } else {
                                  if (!bo.field_p[86]) {
                                    var12 += 3;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              if ((var11 ^ -1) > -1) {
                                break L7;
                              } else {
                                if ((var12 ^ -1) < (var11 ^ -1)) {
                                  var13 = tm.field_h[var11];
                                  if (-1 > (1073741824 & var10 ^ -1)) {
                                    var13.c(var5, var6);
                                    break L7;
                                  } else {
                                    if ((536870912 & var10 ^ -1) >= -1) {
                                      var13.b(var5, var6);
                                      break L7;
                                    } else {
                                      var13.f(var5, var6);
                                      break L7;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              var5 += 24;
                              break L6;
                            }
                          } else {
                            if (param1 != 2) {
                              if (3 == param1) {
                                L9: {
                                  if ((-2147483648 & var10 ^ -1) == -1) {
                                    break L9;
                                  } else {
                                    if (param3) {
                                      if ((var10 & 67108864) != 0) {
                                        bi.a(var5, var6, 24, 24, 65280, 128);
                                        break L9;
                                      } else {
                                        bi.a(var5, var6, 24, 24, 16711935, 128);
                                        break L9;
                                      }
                                    } else {
                                      if ((var10 & 67108864) == 0) {
                                        bi.a(var5, var6, 24, 24, 0, 128);
                                        break L9;
                                      } else {
                                        L10: {
                                          var11 = -1;
                                          var12 = var10 >> -721969177 & 511;
                                          var13_int = (var10 & 33488896) >> -1015908816;
                                          if (var13_int < 9) {
                                            break L10;
                                          } else {
                                            if ((var13_int ^ -1) >= -33) {
                                              var11 = -9 + var13_int;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        L11: {
                                          if (var12 < 9) {
                                            break L11;
                                          } else {
                                            if ((var12 ^ -1) >= -33) {
                                              var11 = var12 + -9;
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                        L12: {
                                          if (var13_int == 29) {
                                            var11 = 9;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if ((var11 ^ -1) > -1) {
                                            break L13;
                                          } else {
                                            if ((la.field_c.length ^ -1) >= (var11 ^ -1)) {
                                              break L13;
                                            } else {
                                              la.field_c[var11].e(var5, var6, 128);
                                              break L9;
                                            }
                                          }
                                        }
                                        bi.a(var5, var6, 24, 24, 0, 128);
                                        la.field_c[21].e(var5, 24 + var6, 128);
                                        break L9;
                                      }
                                    }
                                  }
                                }
                                if (kc.field_Q) {
                                  bi.c(var5, var6, 25, 25, 7864183);
                                  break L7;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            } else {
                              if (((ej) this).field_b[((ej) this).field_j + var8][var9 + ((ej) this).field_f]) {
                                var5 += 24;
                                break L6;
                              } else {
                                L14: {
                                  var11 = ((var10 & 33488896) >> 900358512) - 1;
                                  if (var11 < 0) {
                                    break L14;
                                  } else {
                                    if ((var11 ^ -1) <= (tm.field_h.length ^ -1)) {
                                      break L14;
                                    } else {
                                      var12_ref_vn = tm.field_h[var11];
                                      var13_ref = var12_ref_vn;
                                      var13_ref = var12_ref_vn;
                                      if (-1 <= (var10 & 268435456 ^ -1)) {
                                        if ((134217728 & var10) <= 0) {
                                          var12_ref_vn.b(var5, var6);
                                          break L14;
                                        } else {
                                          var12_ref_vn.f(var5, var6);
                                          break L14;
                                        }
                                      } else {
                                        var12_ref_vn.c(var5, var6);
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                L15: {
                                  if (!dg.field_a) {
                                    break L15;
                                  } else {
                                    L16: {
                                      if (0 == (33554432 & var10)) {
                                        break L16;
                                      } else {
                                        bi.a(var5, var6, 24, 24, 16744448, 128);
                                        break L16;
                                      }
                                    }
                                    if ((var11 ^ -1) > -1) {
                                      break L15;
                                    } else {
                                      if (var11 >= tm.field_h.length) {
                                        break L15;
                                      } else {
                                        L17: {
                                          var12 = ((ej) this).field_f + var9;
                                          var13_int = var8 + ((ej) this).field_j;
                                          if (this.b(0, var12, 1 + var13_int)) {
                                            break L17;
                                          } else {
                                            if (!this.b(0, var12, var13_int - -2)) {
                                              break L15;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        bi.c(var5, var6, 24, 24, 16711808);
                                        break L7;
                                      }
                                    }
                                  }
                                }
                                break L7;
                              }
                            }
                          }
                        }
                        var5 += 24;
                        break L6;
                      }
                    }
                  }
                  var9++;
                  continue L5;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        jc var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        rc var6_ref_rc = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        am var27 = null;
        var26 = ZombieDawn.field_J;
        var27 = fj.field_g;
        if (param0 < -71) {
          L0: {
            var2 = var27.d((byte) -128);
            if (-1 == (var2 ^ -1)) {
              var3 = var27.f(2);
              var4 = (jc) (Object) on.field_g.b((byte) 26);
              L1: while (true) {
                L2: {
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (var4.field_s != var3) {
                      var4 = (jc) (Object) on.field_g.a(false);
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var4 == null) {
                  p.a(1);
                  return;
                } else {
                  L3: {
                    var5 = var27.d((byte) -122);
                    if ((var5 ^ -1) != -1) {
                      var6 = var4.field_u;
                      cm.field_b[0].field_d = null;
                      cm.field_b[0].field_a = false;
                      cm.field_b[0].field_c = ce.field_r;
                      var7 = var4.field_o;
                      var8_int = 1;
                      L4: while (true) {
                        if ((var5 ^ -1) >= (var8_int ^ -1)) {
                          var4.field_m = new String[3][var6];
                          var8 = new String[3][var6];
                          var9 = new String[3][var6];
                          var4.field_i = new long[3][var6];
                          var10 = new long[3][var6];
                          var4.field_k = new int[3][var7 * var6];
                          var11 = new int[3][var7 * var6];
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          var16 = 0;
                          var17 = 0;
                          var18 = var27.d((byte) -120);
                          if (0 < var18) {
                            var19 = 0;
                            L5: while (true) {
                              if (var18 <= var19) {
                                break L3;
                              } else {
                                L6: {
                                  var20 = var27.d((byte) -127);
                                  var21 = cm.field_b[var20].field_c;
                                  var22 = var27.c(true);
                                  var24 = var27.field_j;
                                  if (var19 >= var6) {
                                    break L6;
                                  } else {
                                    var8[0][var12] = var21;
                                    var9[0][var12] = cm.field_b[var20].field_d;
                                    var10[0][var12] = var22;
                                    var12++;
                                    var25 = 0;
                                    L7: while (true) {
                                      if ((var25 ^ -1) <= (var7 ^ -1)) {
                                        break L6;
                                      } else {
                                        var15++;
                                        var11[0][var15] = var27.c(126);
                                        var25++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                                L8: {
                                  if (var21 == null) {
                                    break L8;
                                  } else {
                                    if (!l.a(89, var21)) {
                                      break L8;
                                    } else {
                                      var8[1][var13] = ce.field_r;
                                      var9[1][var13] = null;
                                      var10[1][var13] = var22;
                                      var27.field_j = var24;
                                      var13++;
                                      var25 = 0;
                                      L9: while (true) {
                                        if ((var7 ^ -1) >= (var25 ^ -1)) {
                                          break L8;
                                        } else {
                                          var16++;
                                          var11[1][var16] = var27.c(-43);
                                          var25++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                }
                                L10: {
                                  if ((var6 ^ -1) >= (var14 ^ -1)) {
                                    break L10;
                                  } else {
                                    if (cm.field_b[var20].field_a) {
                                      break L10;
                                    } else {
                                      cm.field_b[var20].field_a = true;
                                      var8[2][var14] = var21;
                                      var9[2][var14] = cm.field_b[var20].field_d;
                                      var10[2][var14] = var22;
                                      var14++;
                                      var27.field_j = var24;
                                      var25 = 0;
                                      L11: while (true) {
                                        if (var25 >= var7) {
                                          break L10;
                                        } else {
                                          var17++;
                                          var11[2][var17] = var27.c(-89);
                                          var25++;
                                          continue L11;
                                        }
                                      }
                                    }
                                  }
                                }
                                var19++;
                                continue L5;
                              }
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          L12: {
                            cm.field_b[var8_int].field_c = var27.a(true);
                            cm.field_b[var8_int].field_a = false;
                            if (1 != var27.d((byte) -128)) {
                              cm.field_b[var8_int].field_d = null;
                              break L12;
                            } else {
                              cm.field_b[var8_int].field_d = var27.a(true);
                              break L12;
                            }
                          }
                          var8_int++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  var4.field_j = true;
                  var4.b(-27598);
                  break L0;
                }
              }
            } else {
              if (1 != var2) {
                ae.a((Throwable) null, 10331, "HS1: " + cb.f(3));
                p.a(1);
                break L0;
              } else {
                var3 = var27.f(2);
                var4_long = var27.c(true);
                var6_ref_rc = (rc) (Object) hk.field_F.b((byte) 26);
                L13: while (true) {
                  L14: {
                    if (var6_ref_rc == null) {
                      break L14;
                    } else {
                      if ((var3 ^ -1) == (var6_ref_rc.field_i ^ -1)) {
                        break L14;
                      } else {
                        var6_ref_rc = (rc) (Object) hk.field_F.a(false);
                        continue L13;
                      }
                    }
                  }
                  if (var6_ref_rc != null) {
                    var6_ref_rc.field_s = var4_long;
                    var6_ref_rc.b(-27598);
                    break L0;
                  } else {
                    p.a(1);
                    return;
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

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          ((ej) this).field_l = ((ej) this).field_l + 1;
          if (3 != (((ej) this).field_l ^ -1)) {
            if (((ej) this).field_l == -3) {
              ((ej) this).field_E = new int[((ej) this).field_C.length][((ej) this).field_C.length];
              var2 = 1;
              L1: while (true) {
                if ((((ej) this).field_C.length / 2 ^ -1) >= (var2 ^ -1)) {
                  break L0;
                } else {
                  var3 = 0;
                  L2: while (true) {
                    if (var2 <= var3) {
                      var2++;
                      continue L1;
                    } else {
                      ((ej) this).field_E[var2][var3] = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                      ((ej) this).field_E[var3][var2] = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              if ((((ej) this).field_l ^ -1) != 1) {
                if ((((ej) this).field_l ^ -1) != 0) {
                  var2 = ((ej) this).field_C.length;
                  var3 = ((ej) this).field_l * 3;
                  var4 = var3;
                  L3: while (true) {
                    if (var4 >= var3 - -3) {
                      break L0;
                    } else {
                      if ((var2 ^ -1) >= (var4 ^ -1)) {
                        ((ej) this).field_t = false;
                        ((ej) this).field_h = ((ej) this).field_D;
                        ((ej) this).field_i = ((ej) this).field_C;
                        ((ej) this).field_w = ((ej) this).field_E;
                        ((ej) this).field_k = ((ej) this).field_B;
                        ((ej) this).field_e = new int[((ej) this).field_C.length];
                        ((ej) this).field_m = new int[((ej) this).field_C.length];
                        return;
                      } else {
                        var5 = 0;
                        L4: while (true) {
                          if ((var5 ^ -1) <= (var2 ^ -1)) {
                            var4++;
                            continue L3;
                          } else {
                            var6 = 0;
                            L5: while (true) {
                              if (var2 <= var6) {
                                var5++;
                                continue L4;
                              } else {
                                L6: {
                                  L7: {
                                    var7 = ((ej) this).field_D[var5][var6];
                                    var8 = ((ej) this).field_D[var5][var4] - -((ej) this).field_D[var4][var6];
                                    if ((var7 ^ -1) == 0) {
                                      break L7;
                                    } else {
                                      if ((var7 ^ -1) >= (var8 ^ -1)) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  if (0 > ((ej) this).field_D[var5][var4]) {
                                    break L6;
                                  } else {
                                    if ((((ej) this).field_D[var4][var6] ^ -1) <= -1) {
                                      ((ej) this).field_D[var5][var6] = var8;
                                      ((ej) this).field_B[var5][var6] = ((ej) this).field_B[var5][var4];
                                      break L6;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                                var6++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  var2 = ((ej) this).field_C.length;
                  ((ej) this).field_B = new int[var2][var2];
                  ((ej) this).field_D = new int[var2][var2];
                  var3 = 0;
                  L8: while (true) {
                    if ((var2 ^ -1) >= (var3 ^ -1)) {
                      break L0;
                    } else {
                      var4 = 0;
                      L9: while (true) {
                        if ((((ej) this).field_C.length ^ -1) >= (var4 ^ -1)) {
                          var3++;
                          continue L8;
                        } else {
                          var5 = ((ej) this).field_E[var3][var4];
                          ((ej) this).field_D[var3][var4] = var5;
                          ((ej) this).field_B[var3][var4] = var4;
                          var4++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
              } else {
                var2 = ((ej) this).field_C.length / 2;
                L10: while (true) {
                  if (((ej) this).field_C.length <= var2) {
                    break L0;
                  } else {
                    var3 = 0;
                    L11: while (true) {
                      if (var2 <= var3) {
                        var2++;
                        continue L10;
                      } else {
                        ((ej) this).field_E[var2][var3] = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                        ((ej) this).field_E[var3][var2] = this.a((byte) -128, ((ej) this).field_C[var2], ((ej) this).field_C[var3]);
                        var3++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
          } else {
            ((ej) this).field_C = new kk[]{};
            var2 = 0;
            L12: while (true) {
              if ((var2 ^ -1) <= (((ej) this).field_A.field_r ^ -1)) {
                break L0;
              } else {
                var3 = 0;
                L13: while (true) {
                  if (var3 >= ((ej) this).field_A.field_k) {
                    var2++;
                    continue L12;
                  } else {
                    L14: {
                      if (!this.b(0, var3, var2)) {
                        break L14;
                      } else {
                        if (!this.b(0, 1 + var3, var2)) {
                          break L14;
                        } else {
                          if (!this.b(0, var3, 1 + var2)) {
                            break L14;
                          } else {
                            if (this.b(0, 1 + var3, 1 + var2)) {
                              break L14;
                            } else {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -97, new kk(24 * var3 - -1, 12 + var2 * 24));
                              break L14;
                            }
                          }
                        }
                      }
                    }
                    L15: {
                      if (!this.b(param0 + 88, var3, var2)) {
                        break L15;
                      } else {
                        if (!this.b(0, var3 + 1, var2)) {
                          break L15;
                        } else {
                          if (this.b(0, var3, 1 + var2)) {
                            break L15;
                          } else {
                            if (!this.b(param0 ^ -88, 1 + var3, 1 + var2)) {
                              break L15;
                            } else {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -87, new kk((var3 + 2) * 24 + -1, 12 + 24 * var2));
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    L16: {
                      if (!this.b(param0 ^ -88, var3, var2)) {
                        break L16;
                      } else {
                        if (!this.b(param0 ^ -88, 1 + var3, var2)) {
                          break L16;
                        } else {
                          if (!this.b(0, var3, var2 + -1)) {
                            break L16;
                          } else {
                            if (!this.b(0, var3 + 1, -1 + var2)) {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -111, new kk(var3 * 24 - -1, (var2 + 1) * 24 - 12));
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                    }
                    L17: {
                      if (!this.b(0, var3, var2)) {
                        break L17;
                      } else {
                        if (!this.b(0, 1 + var3, var2)) {
                          break L17;
                        } else {
                          if (this.b(0, var3, var2 + -1)) {
                            break L17;
                          } else {
                            if (this.b(0, 1 + var3, var2 - 1)) {
                              ((ej) this).field_C = this.a(((ej) this).field_C, (byte) -105, new kk(24 * var3 + 48 - 1, 12 + 24 * var2));
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    var3++;
                    continue L13;
                  }
                }
              }
            }
          }
        }
        L18: {
          if (param0 == -88) {
            break L18;
          } else {
            ej.a((byte) -52);
            break L18;
          }
        }
    }

    final int a(int param0, int param1, int param2, byte param3, boolean param4, int param5) {
        int var17 = ZombieDawn.field_J;
        if (!(((ej) this).a(false, param0, param5, param4))) {
            return -1;
        }
        float var7 = 12.0f;
        int var8 = -param1 + param5;
        int var9 = param0 - param2;
        int var10 = so.b(var9 * var9 + var8 * var8);
        if (var10 == 0) {
            return 0;
        }
        float var11 = var7 / (float)var10;
        float var12 = var11 * (float)var8;
        float var13 = var11 * (float)var9;
        if (param3 > -90) {
            int discarded$0 = ((ej) this).a(80, -57, 113, (byte) -23, true, 59);
        }
        float var14 = (float)param1;
        float var15 = (float)param2;
        int var16 = var10;
        while (var7 < (float)var16) {
            var15 = var15 + var13;
            var14 = var14 + var12;
            if (!((ej) this).a(false, (int)var15, (int)var14, param4)) {
                return -1;
            }
            var16 = (int)((float)var16 - var7);
        }
        return var10;
    }

    final int c(int param0, int param1, int param2) {
        if (!(0 <= param2)) {
            return 0;
        }
        int var4 = -61 % ((param1 - 23) / 44);
        if (0 > param0) {
            return 0;
        }
        if ((param0 ^ -1) <= (((ej) this).field_A.field_r ^ -1)) {
            return 0;
        }
        if (param2 >= ((ej) this).field_A.field_k) {
            return 0;
        }
        return ((ej) this).field_A.field_h[param0][param2];
    }

    final void a(boolean param0, int param1) {
        int var4 = ZombieDawn.field_J;
        int var3 = 46 % ((param1 - -45) / 52);
        if (((ej) this).field_t) {
            ((ej) this).field_q = true;
        } else {
            ((ej) this).field_t = true;
            ((ej) this).field_l = -5;
        }
        if (!param0) {
            while (((ej) this).field_t) {
                this.c((byte) -88);
            }
        }
    }

    private final kk[] a(kk[] param0, byte param1, kk param2) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        kk[] var7 = new kk[1 + param0.length];
        kk[] var4 = var7;
        if (param1 > -86) {
            ((ej) this).field_m = null;
        }
        for (var5 = 0; (param0.length ^ -1) < (var5 ^ -1); var5++) {
            var7[var5] = param0[var5];
        }
        var4[param0.length] = (kk) (Object) param0;
        return var4;
    }

    final void a(boolean param0) {
        if (!(!((ej) this).field_t)) {
            this.c((byte) -88);
            if (!(((ej) this).field_t)) {
                dj.field_e.a(true);
                if (!(!((ej) this).field_q)) {
                    ((ej) this).field_q = false;
                    ((ej) this).a(true, 108);
                }
            }
        }
        if (param0) {
            qh discarded$0 = ((ej) this).a(true, -110, 79, -29, -111);
        }
    }

    private final void a(int param0, wk param1) {
        int var3 = 0;
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
        int var15_int = 0;
        le var15 = null;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        oo var19 = null;
        L0: {
          var18 = null;
          var17 = ZombieDawn.field_J;
          ((ej) this).field_r = 1;
          ((ej) this).field_n = 1;
          ((ej) this).field_g = 0;
          ((ej) this).field_z = 0;
          var3 = bd.field_d - param1.field_u;
          var4 = -param1.field_c + nh.field_G;
          var5 = 0;
          var6 = 0;
          if (var4 < -24) {
            var6 = -(var4 / 24);
            var4 = var4 % 24;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var3 >= -24) {
            break L1;
          } else {
            var5 = -(var3 / 24);
            var3 = var3 % 24;
            break L1;
          }
        }
        L2: {
          L3: {
            var7 = 0;
            if (((ej) this).field_v.length < nh.field_I) {
              break L3;
            } else {
              if ((bd.field_a ^ -1) >= (((ej) this).field_v[0].length ^ -1)) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          ((ej) this).field_v = new int[nh.field_I][bd.field_a];
          break L2;
        }
        L4: {
          var8 = var5 + bd.field_a;
          if ((((ej) this).field_A.field_k ^ -1) <= (var8 ^ -1)) {
            break L4;
          } else {
            var8 = ((ej) this).field_A.field_k;
            break L4;
          }
        }
        L5: {
          var9 = nh.field_I + var6;
          if ((((ej) this).field_A.field_r ^ -1) <= (var9 ^ -1)) {
            break L5;
          } else {
            var9 = ((ej) this).field_A.field_r;
            break L5;
          }
        }
        L6: {
          var10 = var5;
          if (param0 == -19795) {
            break L6;
          } else {
            int discarded$1 = this.a((byte) 93, (kk) null, (kk) null);
            break L6;
          }
        }
        L7: {
          L8: {
            var11 = 0;
            ((ej) this).field_f = var5;
            var12 = 0;
            ((ej) this).field_j = var6;
            if (24 + bd.field_e != m.field_A.field_r) {
              break L8;
            } else {
              if ((m.field_A.field_q ^ -1) != (nh.field_P - -24 ^ -1)) {
                break L8;
              } else {
                if (0 <= ((ej) this).field_y) {
                  break L7;
                } else {
                  gp.a(m.field_A.field_z, 0, m.field_A.field_z.length, 0);
                  break L7;
                }
              }
            }
          }
          m.field_A = null;
          m.field_A = new vn(24 + bd.field_e, nh.field_P - -24);
          ((ej) this).field_y = -1;
          break L7;
        }
        L9: {
          if (((ej) this).field_y >= 0) {
            L10: {
              var13 = var5 + -((ej) this).field_y;
              var14 = var6 - ((ej) this).field_c;
              if ((var13 ^ -1) != -1) {
                break L10;
              } else {
                if ((var14 ^ -1) != -1) {
                  break L10;
                } else {
                  break L9;
                }
              }
            }
            ((ej) this).field_r = var5;
            ((ej) this).field_n = var6;
            var7 = 1;
            ((ej) this).field_g = var6 - -(m.field_A.field_t / 24);
            ((ej) this).field_z = var5 + m.field_A.field_w / 24;
            break L9;
          } else {
            var7 = 1;
            ((ej) this).field_n = var6;
            ((ej) this).field_z = m.field_A.field_w / 24 + var5;
            ((ej) this).field_r = var5;
            ((ej) this).field_g = m.field_A.field_t / 24 + var6;
            break L9;
          }
        }
        L11: {
          ((ej) this).field_y = var5;
          ((ej) this).field_c = var6;
          if (var7 == 0) {
            break L11;
          } else {
            ki.a((byte) -121, m.field_A);
            var13 = 0;
            var14 = 0;
            L12: while (true) {
              if (var9 <= var6) {
                L13: {
                  param1.field_u = param1.field_u + var3;
                  param1.field_c = param1.field_c + var4;
                  if (6 != ((ej) this).field_A.field_a) {
                    break L13;
                  } else {
                    L14: {
                      if ((((ej) this).field_n ^ -1) >= (((ej) this).field_g ^ -1)) {
                        break L14;
                      } else {
                        if (((ej) this).field_z >= ((ej) this).field_r) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    var15 = dj.field_e.field_R.b((byte) 26);
                    L15: while (true) {
                      if (var15 == null) {
                        break L13;
                      } else {
                        L16: {
                          if (!(var15 instanceof oo)) {
                            break L16;
                          } else {
                            var19 = (oo) (Object) var15;
                            var19.a(param1, (byte) 65);
                            break L16;
                          }
                        }
                        var15 = dj.field_e.field_R.a(false);
                        continue L15;
                      }
                    }
                  }
                }
                param1.field_c = param1.field_c - var4;
                param1.field_u = param1.field_u - var3;
                pa.a(-21189);
                break L11;
              } else {
                L17: while (true) {
                  if (var5 >= var8) {
                    var13 = 0;
                    var11 = 0;
                    var14 += 24;
                    var12++;
                    var5 = var10;
                    var6++;
                    continue L12;
                  } else {
                    L18: {
                      L19: {
                        var15_int = ((ej) this).c(var6, -39, var5);
                        if (ub.a(127, ((ej) this).field_A.field_f[var6][var5]) != null) {
                          break L19;
                        } else {
                          L20: {
                            if (((ej) this).field_r > var5) {
                              break L20;
                            } else {
                              if (((ej) this).field_z >= var5) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          if ((((ej) this).field_n ^ -1) < (var6 ^ -1)) {
                            break L18;
                          } else {
                            if ((((ej) this).field_g ^ -1) > (var6 ^ -1)) {
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                      }
                      L21: {
                        var16 = (127 & var15_int) >> 811434976;
                        if ((var16 ^ -1) > -1) {
                          break L21;
                        } else {
                          if (var16 >= field_o.length) {
                            break L21;
                          } else {
                            field_o[var16].e(var13, var14);
                            break L18;
                          }
                        }
                      }
                      bi.b(var13, var14, 24, 24, 7631988);
                      break L18;
                    }
                    ((ej) this).field_v[var12][var11] = var15_int;
                    var13 += 24;
                    var11++;
                    var5++;
                    continue L17;
                  }
                }
              }
            }
          }
        }
        m.field_A.e(var3, var4);
    }

    final qh a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        kk var8 = null;
        kk var9 = null;
        qh var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        L0: {
          var16 = ZombieDawn.field_J;
          var6 = param3 / 24;
          var7 = param2 / 24;
          if (!this.b(0, var6, var7)) {
            if (this.b(0, var6, -1 + var7)) {
              param2 -= 24;
              break L0;
            } else {
              if (!this.b(0, var6, 1 + var7)) {
                if (!this.b(0, var6, 2 + var7)) {
                  if (this.b(0, 1 + var6, var7)) {
                    param3 += 24;
                    break L0;
                  } else {
                    if (!this.b(0, -1 + var6, var7)) {
                      break L0;
                    } else {
                      param3 -= 24;
                      break L0;
                    }
                  }
                } else {
                  param2 += 48;
                  break L0;
                }
              } else {
                param2 += 24;
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var6 = param3 / 24;
        var7 = param2 / 24;
        if (this.b(0, var6, var7)) {
          L1: {
            stackOut_14_0 = this;
            stackIn_16_0 = stackOut_14_0;
            stackIn_15_0 = stackOut_14_0;
            if (param0) {
              stackOut_16_0 = this;
              stackOut_16_1 = 0;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              break L1;
            } else {
              stackOut_15_0 = this;
              stackOut_15_1 = 1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              break L1;
            }
          }
          L2: {
            if (((ej) this).a(stackIn_17_1 != 0, param2, param3, param0)) {
              break L2;
            } else {
              if (this.b(0, var6 + -1, var7)) {
                if (!this.b(0, 1 + var6, var7)) {
                  param3 = var6 * 24;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                param3 = var6 * 24 + 24 - 1;
                break L2;
              }
            }
          }
          var8 = new kk(param1, param4);
          var9 = new kk(param3, param2);
          var10 = new qh();
          var10.a(0, (le) (Object) var9);
          var11 = this.a((byte) -128, var9, var8);
          var10.field_g = var11;
          if (0 <= var11) {
            return var10;
          } else {
            var12 = 0;
            L3: while (true) {
              if ((((ej) this).field_e.length ^ -1) >= (var12 ^ -1)) {
                var12 = 0;
                L4: while (true) {
                  if (((ej) this).field_e.length <= var12) {
                    var12 = -1;
                    var13 = -1;
                    var14 = 0;
                    L5: while (true) {
                      if (var14 >= ((ej) this).field_e.length) {
                        if ((var13 ^ -1) != 0) {
                          var10.field_g = var13;
                          L6: while (true) {
                            if (0 == (var12 ^ -1)) {
                              return var10;
                            } else {
                              if ((((ej) this).field_m[var12] ^ -1) != (var12 ^ -1)) {
                                var10.a((le) (Object) ((ej) this).field_i[var12].c(49), -112);
                                var12 = ((ej) this).field_m[var12];
                                continue L6;
                              } else {
                                return null;
                              }
                            }
                          }
                        } else {
                          return null;
                        }
                      } else {
                        L7: {
                          var15 = this.a((byte) -128, var9, ((ej) this).field_i[var14]);
                          if (-1 < (var15 ^ -1)) {
                            break L7;
                          } else {
                            if (0 == (((ej) this).field_e[var14] ^ -1)) {
                              break L7;
                            } else {
                              L8: {
                                if (var13 == -1) {
                                  break L8;
                                } else {
                                  if (var13 <= var15 + ((ej) this).field_e[var14]) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var13 = var15 - -((ej) this).field_e[var14];
                              var12 = var14;
                              break L7;
                            }
                          }
                        }
                        var14++;
                        continue L5;
                      }
                    }
                  } else {
                    L9: {
                      if (((ej) this).field_e[var12] >= 0) {
                        var13 = 0;
                        L10: while (true) {
                          if (var13 >= ((ej) this).field_e.length) {
                            break L9;
                          } else {
                            L11: {
                              if (var13 != var12) {
                                if (-1 == ((ej) this).field_h[var12][var13]) {
                                  break L11;
                                } else {
                                  L12: {
                                    if ((((ej) this).field_e[var13] ^ -1) == 0) {
                                      break L12;
                                    } else {
                                      if ((((ej) this).field_e[var13] ^ -1) < (((ej) this).field_h[var12][var13] + ((ej) this).field_e[var12] ^ -1)) {
                                        break L12;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ((ej) this).field_e[var13] = ((ej) this).field_e[var12] - -((ej) this).field_h[var12][var13];
                                  ((ej) this).field_m[var13] = ((ej) this).field_k[var13][var12];
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                            var13++;
                            continue L10;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    var12++;
                    continue L4;
                  }
                }
              } else {
                L13: {
                  var13 = this.a((byte) -128, var8, ((ej) this).field_i[var12]);
                  ((ej) this).field_e[var12] = var13;
                  stackOut_28_0 = ((ej) this).field_m;
                  stackOut_28_1 = var12;
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  if (var13 < 0) {
                    stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                    stackOut_30_1 = stackIn_30_1;
                    stackOut_30_2 = -2;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    break L13;
                  } else {
                    stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                    stackOut_29_1 = stackIn_29_1;
                    stackOut_29_2 = -1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    stackIn_31_2 = stackOut_29_2;
                    break L13;
                  }
                }
                stackIn_31_0[stackIn_31_1] = stackIn_31_2;
                var12++;
                continue L3;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        if (-1 <= (param1 ^ -1)) {
            return false;
        }
        if (param2 <= param0) {
            return false;
        }
        if ((param2 ^ -1) <= (((ej) this).field_A.field_r - 1 ^ -1)) {
            return false;
        }
        if (param1 >= ((ej) this).field_A.field_k + -1) {
            return false;
        }
        return (1 & ((ej) this).field_A.field_p[param2][param1] ^ -1) != -1 ? true : false;
    }

    private final int a(byte param0, kk param1, kk param2) {
        if (param0 != -128) {
            return -108;
        }
        return ((ej) this).a(param1.field_h, param2.field_h, param1.field_l, param2.field_l, 117);
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var4 = param0 / 24;
        var5 = param1 / 24;
        var6 = 4;
        if (this.b(0, var4, var5)) {
          L0: {
            var7 = param0 % 24;
            var8 = param1 % 24;
            if (-1 != (var4 ^ -1)) {
              stackOut_4_0 = this.b(0, -1 + var4, var5);
              stackIn_5_0 = stackOut_4_0 ? 1 : 0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var9 = stackIn_5_0;
            if (((ej) this).field_A.field_k + -1 == var4) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = this.b(0, var4 - -1, var5);
              stackIn_8_0 = stackOut_6_0 ? 1 : 0;
              break L1;
            }
          }
          L2: {
            var10 = stackIn_8_0;
            if (param2 > 8) {
              break L2;
            } else {
              int discarded$1 = ((ej) this).a(-111, -117, 12, 52, 71);
              break L2;
            }
          }
          L3: {
            if (var5 != -1 + ((ej) this).field_A.field_r) {
              stackOut_12_0 = this.b(0, var4, 1 + var5);
              stackIn_13_0 = stackOut_12_0 ? 1 : 0;
              break L3;
            } else {
              stackOut_11_0 = 0;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          L4: {
            var11 = stackIn_13_0;
            if (var10 == 0) {
              break L4;
            } else {
              L5: {
                L6: {
                  stackOut_14_0 = var10;
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if ((var6 ^ -1) < (var8 ^ -1)) {
                    break L6;
                  } else {
                    stackOut_15_0 = stackIn_15_0;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (!this.b(0, 1 + var4, var5 - -1)) {
                      stackOut_18_0 = stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L5;
                    } else {
                      stackOut_16_0 = stackIn_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      break L6;
                    }
                  }
                }
                stackOut_17_0 = stackIn_17_0;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
              var10 = stackIn_19_0 & stackIn_19_1;
              break L4;
            }
          }
          L7: {
            if (var9 == 0) {
              break L7;
            } else {
              L8: {
                L9: {
                  stackOut_21_0 = var9;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  if (var6 > var8) {
                    break L9;
                  } else {
                    stackOut_22_0 = stackIn_22_0;
                    stackIn_25_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (!this.b(0, -1 + var4, var5 - -1)) {
                      stackOut_25_0 = stackIn_25_0;
                      stackOut_25_1 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L8;
                    } else {
                      stackOut_23_0 = stackIn_23_0;
                      stackIn_24_0 = stackOut_23_0;
                      break L9;
                    }
                  }
                }
                stackOut_24_0 = stackIn_24_0;
                stackOut_24_1 = 1;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                break L8;
              }
              var9 = stackIn_26_0 & stackIn_26_1;
              break L7;
            }
          }
          L10: {
            if (var9 != 0) {
              break L10;
            } else {
              if (var7 >= 6) {
                break L10;
              } else {
                return false;
              }
            }
          }
          L11: {
            if (var10 != 0) {
              break L11;
            } else {
              if (-9 <= (var7 ^ -1)) {
                break L11;
              } else {
                return false;
              }
            }
          }
          if (var11 != 0) {
            return true;
          } else {
            if (var6 < var8) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final void a(wk param0, boolean param1) {
        int var3 = 0;
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
        L0: {
          L1: {
            var15 = ZombieDawn.field_J;
            if (ng.field_e) {
              break L1;
            } else {
              if (!((ej) this).field_A.field_e) {
                this.a(-19795, param0);
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var3 = -param0.field_u + bd.field_d;
            var4 = -param0.field_c + nh.field_G;
            var5 = 0;
            var6 = 0;
            if ((var3 ^ -1) <= 23) {
              break L2;
            } else {
              var5 = -(var3 / 24);
              var3 = var3 % 24;
              break L2;
            }
          }
          L3: {
            if (23 < (var4 ^ -1)) {
              var6 = -(var4 / 24);
              var4 = var4 % 24;
              break L3;
            } else {
              break L3;
            }
          }
          var7 = var5 + bd.field_a;
          var8 = var6 - -nh.field_I;
          var9 = var3;
          var10 = var5;
          var11 = 0;
          var12 = 0;
          var13 = 0;
          L4: while (true) {
            if ((var13 ^ -1) <= (nh.field_I ^ -1)) {
              ((ej) this).field_j = var6;
              ((ej) this).field_f = var5;
              L5: while (true) {
                L6: {
                  if ((var8 ^ -1) >= (var6 ^ -1)) {
                    break L6;
                  } else {
                    if ((var6 ^ -1) <= (((ej) this).field_A.field_r ^ -1)) {
                      break L6;
                    } else {
                      L7: while (true) {
                        L8: {
                          if (var7 <= var5) {
                            break L8;
                          } else {
                            if ((((ej) this).field_A.field_k ^ -1) >= (var5 ^ -1)) {
                              break L8;
                            } else {
                              L9: {
                                L10: {
                                  var13 = ((ej) this).c(var6, 123, var5);
                                  var14 = var13 >> -445014720 & 127;
                                  if (-1 < (var14 ^ -1)) {
                                    break L10;
                                  } else {
                                    if ((var14 ^ -1) > (field_o.length ^ -1)) {
                                      field_o[var14].e(var3, var4);
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                bi.b(var3, var4, 24, 24, 7631988);
                                break L9;
                              }
                              ((ej) this).field_v[var12][var11] = var13;
                              var3 += 24;
                              var11++;
                              var5++;
                              continue L7;
                            }
                          }
                        }
                        var11 = 0;
                        var3 = var9;
                        var5 = var10;
                        var12++;
                        var4 += 24;
                        var6++;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              }
            } else {
              var14 = 0;
              L11: while (true) {
                if ((var14 ^ -1) <= (bd.field_a ^ -1)) {
                  var13++;
                  continue L4;
                } else {
                  ((ej) this).field_v[var13][var14] = 0;
                  var14++;
                  continue L11;
                }
              }
            }
          }
        }
        if (!param1) {
          L12: {
            if (!ga.field_w) {
              break L12;
            } else {
              var3 = param0.a(ha.field_b, false);
              var4 = param0.b(ei.field_K, true);
              var5 = 0;
              L13: while (true) {
                if ((((ej) this).field_i.length ^ -1) >= (var5 ^ -1)) {
                  var5 = 0;
                  L14: while (true) {
                    if ((var5 ^ -1) <= (((ej) this).field_i.length ^ -1)) {
                      L15: {
                        if (!((ej) this).field_t) {
                          break L15;
                        } else {
                          if ((((ej) this).field_l ^ -1) >= -1) {
                            break L15;
                          } else {
                            var5 = 0;
                            L16: while (true) {
                              if ((var5 ^ -1) <= (((ej) this).field_C.length ^ -1)) {
                                var5 = 0;
                                L17: while (true) {
                                  if (var5 >= ((ej) this).field_C.length) {
                                    break L15;
                                  } else {
                                    var6 = bd.field_d + (-param0.field_u + ((ej) this).field_C[var5].field_l);
                                    var7 = ((ej) this).field_C[var5].field_h + (-param0.field_c - -nh.field_G);
                                    bi.d(var6, var7, 2, 34952, 256);
                                    pc.field_k.a(Integer.toString(var5), var6, var7, 2285021, 0, 64);
                                    var5++;
                                    continue L17;
                                  }
                                }
                              } else {
                                var6 = param0.a(((ej) this).field_C[var5].field_l, (byte) -99);
                                var7 = param0.a(((ej) this).field_C[var5].field_h, 0);
                                var8 = 0;
                                L18: while (true) {
                                  if (var8 >= ((ej) this).field_C.length) {
                                    var5++;
                                    continue L16;
                                  } else {
                                    L19: {
                                      var9 = param0.a(((ej) this).field_C[var8].field_l, (byte) -75);
                                      var10 = param0.a(((ej) this).field_C[var8].field_h, 0);
                                      if ((((ej) this).field_E[var5][var8] ^ -1) < -1) {
                                        bi.d(var6, var7, var9, var10, 16711680, 48);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    var8++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      break L12;
                    } else {
                      var6 = bd.field_d + -param0.field_u + ((ej) this).field_i[var5].field_l;
                      var7 = -param0.field_c + ((ej) this).field_i[var5].field_h + nh.field_G;
                      bi.d(var6, var7, 2, 16711680, 256);
                      pc.field_k.a(Integer.toString(var5), var6, var7, 16777215, 0, 64);
                      var5++;
                      continue L14;
                    }
                  }
                } else {
                  var6 = param0.a(((ej) this).field_i[var5].field_l, (byte) -104);
                  var7 = param0.a(((ej) this).field_i[var5].field_h, 0);
                  var8 = 0;
                  L20: while (true) {
                    if ((((ej) this).field_i.length ^ -1) >= (var8 ^ -1)) {
                      L21: {
                        if (0 != (((ej) this).a(var4, ((ej) this).field_i[var5].field_h, var3, ((ej) this).field_i[var5].field_l, 112) ^ -1)) {
                          var8 = param0.a(var3, (byte) -64);
                          var9 = param0.a(var4, 0);
                          bi.e(var6, var7, var8, var9, 16711680);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      var5++;
                      continue L13;
                    } else {
                      L22: {
                        var9 = param0.a(((ej) this).field_i[var8].field_l, (byte) -82);
                        var10 = param0.a(((ej) this).field_i[var8].field_h, 0);
                        if (-1 <= (((ej) this).field_w[var5][var8] ^ -1)) {
                          break L22;
                        } else {
                          bi.d(var6, var7, var9, var10, 65280, 48);
                          break L22;
                        }
                      }
                      var8++;
                      continue L20;
                    }
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

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 <= 102) {
            field_d = -128;
        }
        return ((ej) this).a(param0, param3, param1, (byte) -126, true, param2);
    }

    ej(on param0) {
        ((ej) this).field_v = new int[nh.field_I][bd.field_a];
        ((ej) this).field_c = -1;
        ((ej) this).field_y = -1;
        ((ej) this).field_A = param0;
        ((ej) this).a(false, 11);
        this.b(-1);
        ((ej) this).field_c = -1;
        ((ej) this).field_b = new boolean[((ej) this).field_A.field_r][((ej) this).field_A.field_k];
        ((ej) this).field_y = -1;
    }

    static {
    }
}
