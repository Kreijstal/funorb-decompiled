/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re {
    boolean field_q;
    static String[] field_h;
    int field_m;
    static String field_d;
    int[] field_b;
    boolean field_t;
    int[] field_g;
    String field_i;
    int field_c;
    String field_r;
    int field_a;
    boolean field_f;
    String field_e;
    int field_n;
    int field_o;
    int field_s;
    String field_j;
    String field_k;
    int field_p;
    int field_l;

    final static int a(int param0, byte param1, int param2) {
        int var5 = Terraphoenix.field_V;
        int var3 = 0;
        while (param2 > 0) {
            var3 = 1 & param0 | var3 << -863504319;
            param2--;
            param0 = param0 >>> 1;
        }
        int var4 = -20 / ((-11 - param1) / 61);
        return var3;
    }

    public static void a(int param0) {
        if (param0 != 52) {
            field_h = null;
        }
        field_h = null;
        field_d = null;
    }

    final static void a(int param0, byte param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = Terraphoenix.field_V;
        if (param6 > param5) {
          if (param0 <= 1 + param5) {
            return;
          } else {
            L0: {
              if (param0 <= 5 + param5) {
                break L0;
              } else {
                if (param2 == param3) {
                  break L0;
                } else {
                  L1: {
                    var7 = (param3 >> -2062059871) - -(param2 >> 20129377) + (param3 & param2 & 1);
                    var8 = param5;
                    if (param1 < -19) {
                      break L1;
                    } else {
                      boolean discarded$1 = re.a(-91, '\n');
                      break L1;
                    }
                  }
                  var9 = param2;
                  var10 = param3;
                  var11 = param5;
                  L2: while (true) {
                    if (var11 >= param0) {
                      re.a(var8, (byte) -77, param2, var9, param4, param5, param6);
                      re.a(param0, (byte) -62, var10, param3, param4, var8, param6);
                      return;
                    } else {
                      L3: {
                        var12 = pf.field_b[var11];
                        if (param4) {
                          stackOut_24_0 = a.field_c[var12];
                          stackIn_25_0 = stackOut_24_0;
                          break L3;
                        } else {
                          stackOut_23_0 = al.field_bb[var12];
                          stackIn_25_0 = stackOut_23_0;
                          break L3;
                        }
                      }
                      var13 = stackIn_25_0;
                      if (var13 > var7) {
                        L4: {
                          pf.field_b[var11] = pf.field_b[var8];
                          if (var13 >= var9) {
                            break L4;
                          } else {
                            var9 = var13;
                            break L4;
                          }
                        }
                        var8++;
                        pf.field_b[var8] = var12;
                        var11++;
                        continue L2;
                      } else {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L2;
                        } else {
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = -1 + param0;
            L5: while (true) {
              if (var7 <= param5) {
                return;
              } else {
                var8 = param5;
                L6: while (true) {
                  if (var8 >= var7) {
                    var7--;
                    continue L5;
                  } else {
                    var9 = pf.field_b[var8];
                    var10 = pf.field_b[var8 + 1];
                    if (rb.a(var9, param4, (byte) 126, var10)) {
                      pf.field_b[var8] = var10;
                      pf.field_b[1 + var8] = var9;
                      var8++;
                      continue L6;
                    } else {
                      var8++;
                      continue L6;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          var5 = Terraphoenix.field_V;
          if (param1 <= 0) {
            break L0;
          } else {
            if (128 > param1) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 < 160) {
            break L1;
          } else {
            if (255 < param1) {
              break L1;
            } else {
              return true;
            }
          }
        }
        if (param0 == -10152) {
          L2: {
            if (param1 != 0) {
              var6 = oj.field_s;
              var2 = var6;
              var3 = 0;
              L3: while (true) {
                if (var3 >= var6.length) {
                  break L2;
                } else {
                  var4 = var6[var3];
                  if (param1 != var4) {
                    var3++;
                    continue L3;
                  } else {
                    return true;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          return false;
        } else {
          return true;
        }
    }

    re(int param0) {
        int var2 = 0;
        L0: {
          ((re) this).field_b = new int[3];
          ((re) this).field_g = new int[5];
          ((re) this).field_t = false;
          ((re) this).field_r = "";
          ((re) this).field_f = false;
          ((re) this).field_e = "";
          ((re) this).field_k = "";
          ((re) this).field_q = false;
          ((re) this).field_i = "";
          ((re) this).field_s = 0;
          ((re) this).field_j = "";
          ((re) this).field_j = uh.field_L[param0];
          ((re) this).field_k = of.field_h[param0];
          ((re) this).field_e = i.field_b[param0];
          ((re) this).field_i = da.field_i[param0];
          var2 = param0;
          if (-1 == var2) {
            ((re) this).field_l = 16;
            ((re) this).field_o = 12;
            ((re) this).field_p = 2;
            ((re) this).field_g[0] = 80;
            ((re) this).field_r = df.field_M;
            ((re) this).field_b[0] = 22;
            ((re) this).field_g[1] = 40;
            ((re) this).field_g[2] = 5;
            ((re) this).field_b[1] = 20;
            ((re) this).field_m = 1;
            ((re) this).field_c = 0;
            ((re) this).field_g[4] = 50;
            ((re) this).field_g[3] = 90;
            ((re) this).field_n = 72;
            ((re) this).field_s = 0;
            ((re) this).field_b[2] = 20;
            ((re) this).field_a = 73;
            ((re) this).field_t = true;
            break L0;
          } else {
            if (-2 == var2) {
              ((re) this).field_g[0] = 15;
              ((re) this).field_r = ml.field_r;
              ((re) this).field_p = 1;
              ((re) this).field_l = 5;
              ((re) this).field_o = 8;
              ((re) this).field_g[1] = 10;
              ((re) this).field_b[0] = 40;
              ((re) this).field_n = 74;
              ((re) this).field_g[4] = 10;
              ((re) this).field_m = 0;
              ((re) this).field_s = 15;
              ((re) this).field_t = true;
              ((re) this).field_g[3] = 15;
              ((re) this).field_b[1] = 30;
              ((re) this).field_c = 0;
              ((re) this).field_a = 75;
              break L0;
            } else {
              if (var2 == 2) {
                ((re) this).field_r = sa.field_a;
                ((re) this).field_o = 30;
                ((re) this).field_l = 30;
                ((re) this).field_p = 2;
                ((re) this).field_g[0] = 110;
                ((re) this).field_g[1] = 50;
                ((re) this).field_b[0] = 55;
                ((re) this).field_b[1] = 30;
                ((re) this).field_g[2] = 10;
                ((re) this).field_n = 70;
                ((re) this).field_g[4] = 75;
                ((re) this).field_g[3] = 140;
                ((re) this).field_c = 0;
                ((re) this).field_b[2] = 10;
                ((re) this).field_q = true;
                ((re) this).field_s = 30;
                ((re) this).field_a = 71;
                ((re) this).field_m = 2;
                ((re) this).field_t = true;
                break L0;
              } else {
                if (3 == var2) {
                  ((re) this).field_g[0] = 95;
                  ((re) this).field_r = sd.field_a;
                  ((re) this).field_l = 16;
                  ((re) this).field_p = 2;
                  ((re) this).field_o = 24;
                  ((re) this).field_g[1] = 55;
                  ((re) this).field_b[0] = 20;
                  ((re) this).field_b[1] = 15;
                  ((re) this).field_g[2] = 2;
                  ((re) this).field_g[4] = 75;
                  ((re) this).field_g[3] = 100;
                  ((re) this).field_t = true;
                  ((re) this).field_a = 69;
                  ((re) this).field_b[2] = 5;
                  ((re) this).field_c = 0;
                  ((re) this).field_s = 8;
                  ((re) this).field_m = 1;
                  ((re) this).field_n = 68;
                  break L0;
                } else {
                  if (var2 == -19) {
                    ((re) this).field_o = 50;
                    ((re) this).field_l = 40;
                    ((re) this).field_g[0] = 80;
                    ((re) this).field_r = vc.field_b;
                    ((re) this).field_p = 2;
                    ((re) this).field_g[1] = 0;
                    ((re) this).field_b[0] = 70;
                    ((re) this).field_b[1] = 50;
                    ((re) this).field_g[2] = 5;
                    ((re) this).field_g[4] = 90;
                    ((re) this).field_a = 67;
                    ((re) this).field_s = 50;
                    ((re) this).field_g[3] = 100;
                    ((re) this).field_b[2] = 5;
                    ((re) this).field_t = true;
                    ((re) this).field_q = true;
                    ((re) this).field_m = 1;
                    ((re) this).field_c = 0;
                    ((re) this).field_n = 66;
                    break L0;
                  } else {
                    if (var2 == 4) {
                      ((re) this).field_r = k.field_a;
                      ((re) this).field_l = 100;
                      ((re) this).field_o = 1;
                      ((re) this).field_g[0] = 150;
                      ((re) this).field_p = 0;
                      ((re) this).field_g[3] = 150;
                      ((re) this).field_c = 1;
                      ((re) this).field_a = 80;
                      ((re) this).field_n = 79;
                      ((re) this).field_s = 50;
                      ((re) this).field_t = true;
                      ((re) this).field_m = 3;
                      ((re) this).field_g[4] = 150;
                      ((re) this).field_b[0] = 80;
                      ((re) this).field_q = true;
                      break L0;
                    } else {
                      if (-6 == var2) {
                        ((re) this).field_g[0] = 100;
                        ((re) this).field_l = 50;
                        ((re) this).field_o = -1;
                        ((re) this).field_r = dm.field_e;
                        ((re) this).field_p = 0;
                        ((re) this).field_m = 1;
                        ((re) this).field_a = 77;
                        ((re) this).field_g[4] = 100;
                        ((re) this).field_c = 6;
                        ((re) this).field_g[3] = 100;
                        ((re) this).field_t = true;
                        ((re) this).field_s = 1;
                        ((re) this).field_b[0] = 20;
                        ((re) this).field_q = true;
                        ((re) this).field_n = 76;
                        break L0;
                      } else {
                        if (6 == var2) {
                          ((re) this).field_p = 2;
                          ((re) this).field_r = ab.field_m;
                          ((re) this).field_g[0] = 90;
                          ((re) this).field_l = 45;
                          ((re) this).field_o = 0;
                          ((re) this).field_b[0] = 80;
                          ((re) this).field_g[1] = 50;
                          ((re) this).field_g[2] = 25;
                          ((re) this).field_q = true;
                          ((re) this).field_b[1] = 60;
                          ((re) this).field_n = 56;
                          ((re) this).field_a = 57;
                          ((re) this).field_g[3] = 200;
                          ((re) this).field_c = 2;
                          ((re) this).field_m = 3;
                          ((re) this).field_b[2] = 10;
                          ((re) this).field_g[4] = 75;
                          ((re) this).field_s = 60;
                          break L0;
                        } else {
                          if (-8 == var2) {
                            ((re) this).field_p = 2;
                            ((re) this).field_g[0] = 125;
                            ((re) this).field_o = 0;
                            ((re) this).field_l = 40;
                            ((re) this).field_r = fc.field_j;
                            ((re) this).field_b[0] = 35;
                            ((re) this).field_g[1] = 65;
                            ((re) this).field_g[2] = 25;
                            ((re) this).field_q = true;
                            ((re) this).field_b[1] = 25;
                            ((re) this).field_b[2] = 25;
                            ((re) this).field_a = 55;
                            ((re) this).field_m = 3;
                            ((re) this).field_c = 2;
                            ((re) this).field_n = 54;
                            ((re) this).field_t = false;
                            ((re) this).field_g[4] = 75;
                            ((re) this).field_g[3] = 300;
                            ((re) this).field_s = 40;
                            break L0;
                          } else {
                            if (var2 == 8) {
                              ((re) this).field_o = 25;
                              ((re) this).field_r = hh.field_p;
                              ((re) this).field_l = 6;
                              ((re) this).field_g[0] = 40;
                              ((re) this).field_p = 2;
                              ((re) this).field_g[1] = 25;
                              ((re) this).field_b[0] = 30;
                              ((re) this).field_g[2] = 1;
                              ((re) this).field_b[1] = 10;
                              ((re) this).field_n = 62;
                              ((re) this).field_g[3] = 75;
                              ((re) this).field_m = 1;
                              ((re) this).field_c = 3;
                              ((re) this).field_b[2] = 8;
                              ((re) this).field_a = 63;
                              ((re) this).field_g[4] = 50;
                              ((re) this).field_s = 15;
                              break L0;
                            } else {
                              if (9 == var2) {
                                ((re) this).field_o = 25;
                                ((re) this).field_p = 2;
                                ((re) this).field_r = ij.field_c;
                                ((re) this).field_g[0] = 80;
                                ((re) this).field_l = 9;
                                ((re) this).field_g[1] = 30;
                                ((re) this).field_b[0] = 30;
                                ((re) this).field_g[2] = 2;
                                ((re) this).field_b[1] = 15;
                                ((re) this).field_b[2] = 6;
                                ((re) this).field_c = 3;
                                ((re) this).field_g[4] = 50;
                                ((re) this).field_s = 30;
                                ((re) this).field_n = 60;
                                ((re) this).field_g[3] = 100;
                                ((re) this).field_m = 2;
                                ((re) this).field_a = 61;
                                break L0;
                              } else {
                                if (-12 == var2) {
                                  ((re) this).field_r = bb.field_h;
                                  ((re) this).field_o = -1;
                                  ((re) this).field_g[0] = 100;
                                  ((re) this).field_p = 0;
                                  ((re) this).field_l = 90;
                                  ((re) this).field_g[3] = 100;
                                  ((re) this).field_q = true;
                                  ((re) this).field_a = 64;
                                  ((re) this).field_m = 1;
                                  ((re) this).field_n = 76;
                                  ((re) this).field_c = 7;
                                  ((re) this).field_s = 5;
                                  ((re) this).field_g[4] = 100;
                                  ((re) this).field_b[0] = 20;
                                  break L0;
                                } else {
                                  if (var2 == 10) {
                                    ((re) this).field_l = 8;
                                    ((re) this).field_p = 2;
                                    ((re) this).field_r = kh.field_O;
                                    ((re) this).field_g[0] = 100;
                                    ((re) this).field_o = 25;
                                    ((re) this).field_b[0] = 25;
                                    ((re) this).field_g[1] = 30;
                                    ((re) this).field_b[1] = 10;
                                    ((re) this).field_g[2] = 3;
                                    ((re) this).field_g[4] = 50;
                                    ((re) this).field_b[2] = 6;
                                    ((re) this).field_c = 3;
                                    ((re) this).field_a = 59;
                                    ((re) this).field_g[3] = 100;
                                    ((re) this).field_m = 2;
                                    ((re) this).field_s = 25;
                                    ((re) this).field_q = true;
                                    ((re) this).field_n = 58;
                                    break L0;
                                  } else {
                                    if (12 == var2) {
                                      ((re) this).field_p = 2;
                                      ((re) this).field_o = 26;
                                      ((re) this).field_g[0] = 85;
                                      ((re) this).field_l = 50;
                                      ((re) this).field_r = kf.field_a;
                                      ((re) this).field_g[1] = 65;
                                      ((re) this).field_b[0] = 25;
                                      ((re) this).field_g[2] = 5;
                                      ((re) this).field_b[1] = 18;
                                      ((re) this).field_n = 50;
                                      ((re) this).field_m = 1;
                                      ((re) this).field_g[4] = 75;
                                      ((re) this).field_g[3] = 100;
                                      ((re) this).field_c = 4;
                                      ((re) this).field_b[2] = 12;
                                      ((re) this).field_a = 51;
                                      ((re) this).field_s = 20;
                                      break L0;
                                    } else {
                                      if (-14 == var2) {
                                        ((re) this).field_l = 80;
                                        ((re) this).field_o = 24;
                                        ((re) this).field_p = 2;
                                        ((re) this).field_r = jh.field_k;
                                        ((re) this).field_g[0] = 100;
                                        ((re) this).field_b[0] = 40;
                                        ((re) this).field_g[1] = 86;
                                        ((re) this).field_g[2] = 10;
                                        ((re) this).field_b[1] = 30;
                                        ((re) this).field_m = 2;
                                        ((re) this).field_c = 4;
                                        ((re) this).field_g[3] = 150;
                                        ((re) this).field_n = 45;
                                        ((re) this).field_g[4] = 100;
                                        ((re) this).field_a = 46;
                                        ((re) this).field_b[2] = 20;
                                        ((re) this).field_s = 60;
                                        break L0;
                                      } else {
                                        if (14 == var2) {
                                          ((re) this).field_p = 2;
                                          ((re) this).field_l = 115;
                                          ((re) this).field_r = wl.field_y;
                                          ((re) this).field_o = 16;
                                          ((re) this).field_g[0] = 110;
                                          ((re) this).field_g[1] = 75;
                                          ((re) this).field_b[0] = 50;
                                          ((re) this).field_b[1] = 35;
                                          ((re) this).field_g[2] = 15;
                                          ((re) this).field_g[4] = 125;
                                          ((re) this).field_s = 70;
                                          ((re) this).field_m = 2;
                                          ((re) this).field_n = 43;
                                          ((re) this).field_a = 44;
                                          ((re) this).field_g[3] = 200;
                                          ((re) this).field_c = 4;
                                          ((re) this).field_b[2] = 15;
                                          break L0;
                                        } else {
                                          if (15 == var2) {
                                            ((re) this).field_g[0] = 150;
                                            ((re) this).field_p = 0;
                                            ((re) this).field_o = 1;
                                            ((re) this).field_r = wa.field_q;
                                            ((re) this).field_l = 150;
                                            ((re) this).field_c = 5;
                                            ((re) this).field_s = 80;
                                            ((re) this).field_b[0] = 55;
                                            ((re) this).field_n = 47;
                                            ((re) this).field_g[3] = 150;
                                            ((re) this).field_m = 3;
                                            ((re) this).field_g[4] = 150;
                                            ((re) this).field_a = 48;
                                            break L0;
                                          } else {
                                            if (-17 == var2) {
                                              ((re) this).field_p = 2;
                                              ((re) this).field_l = 90;
                                              ((re) this).field_o = 20;
                                              ((re) this).field_g[0] = 110;
                                              ((re) this).field_r = sa.field_b;
                                              ((re) this).field_g[1] = 90;
                                              ((re) this).field_b[0] = 40;
                                              ((re) this).field_g[2] = 20;
                                              ((re) this).field_b[1] = 30;
                                              ((re) this).field_q = true;
                                              ((re) this).field_n = 52;
                                              ((re) this).field_g[3] = 200;
                                              ((re) this).field_a = 53;
                                              ((re) this).field_m = 2;
                                              ((re) this).field_c = 4;
                                              ((re) this).field_g[4] = 125;
                                              ((re) this).field_b[2] = 20;
                                              ((re) this).field_s = 50;
                                              break L0;
                                            } else {
                                              if (17 == var2) {
                                                ((re) this).field_o = 0;
                                                ((re) this).field_r = kd.field_a;
                                                ((re) this).field_p = -1;
                                                ((re) this).field_l = 50;
                                                ((re) this).field_s = 10;
                                                break L0;
                                              } else {
                                                if (20 != var2) {
                                                  break L0;
                                                } else {
                                                  ((re) this).field_g[0] = 40;
                                                  ((re) this).field_p = 2;
                                                  ((re) this).field_l = 50;
                                                  ((re) this).field_o = 25;
                                                  ((re) this).field_g[1] = 25;
                                                  ((re) this).field_b[0] = 30;
                                                  ((re) this).field_g[2] = 1;
                                                  ((re) this).field_b[1] = 10;
                                                  ((re) this).field_g[3] = 75;
                                                  ((re) this).field_m = 4;
                                                  ((re) this).field_c = 8;
                                                  ((re) this).field_b[2] = 8;
                                                  ((re) this).field_n = 82;
                                                  ((re) this).field_s = 15;
                                                  ((re) this).field_a = 82;
                                                  ((re) this).field_g[4] = 50;
                                                  break L0;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (((re) this).field_t) {
            break L1;
          } else {
            ((re) this).field_f = true;
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"TODO Summary page of the goal and control mechanism.", "TODO Full controls.", "TODO Objective and/or plot. May want to go from this page to tutorial."};
        field_d = "More suggestions";
    }
}
