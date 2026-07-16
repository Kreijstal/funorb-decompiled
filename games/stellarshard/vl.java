/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    int field_f;
    static String field_h;
    private int field_b;
    int field_l;
    double field_j;
    static String field_i;
    private qe field_g;
    static bj[] field_r;
    int field_n;
    static int[][] field_o;
    double field_k;
    int field_q;
    double field_a;
    static boolean[] field_s;
    private int field_e;
    int field_d;
    int field_m;
    double field_c;
    int field_p;

    private final void b(byte param0) {
        int var2 = 0;
        qe var3 = null;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        double var26 = 0.0;
        double var28 = 0.0;
        vl var30 = null;
        double var31 = 0.0;
        double var33 = 0.0;
        int var35 = 0;
        int var36 = 0;
        L0: {
          var36 = stellarshard.field_B;
          if (param0 < -125) {
            break L0;
          } else {
            ((vl) this).a(88, 65, true);
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if ((var2 ^ -1) <= -1001) {
            return;
          } else {
            if (a.field_h[var2] != null) {
              if (this.a(-48, a.field_h[var2], false)) {
                L2: {
                  if (a.field_h[var2].field_m != -1) {
                    break L2;
                  } else {
                    if (nc.field_H != 2) {
                      break L2;
                    } else {
                      var2++;
                      continue L1;
                    }
                  }
                }
                var3 = a.field_h[var2];
                if (var3 != ((vl) this).field_g) {
                  if (!var3.a((byte) -47)) {
                    L3: {
                      var4 = -var3.field_a + ((vl) this).field_c;
                      var6 = ((vl) this).field_k - var3.field_l;
                      if (0.0 != var4) {
                        break L3;
                      } else {
                        if (0.0 != var6) {
                          break L3;
                        } else {
                          var2++;
                          continue L1;
                        }
                      }
                    }
                    var8 = Math.sqrt(var6 * var6 + var4 * var4);
                    var10 = var4 / var8;
                    var12 = var6 / var8;
                    var14 = -(((vl) this).field_a * var10) + var12 * ((vl) this).field_j;
                    var16 = -(var10 * var3.field_k) + var12 * var3.field_d;
                    var18 = var10 * ((vl) this).field_j + ((vl) this).field_a * var12;
                    var20 = var3.field_d * var10 + var12 * var3.field_k;
                    if (var18 < var20) {
                      L4: {
                        var22 = var18 * (double)((vl) this).field_m + (double)var3.field_n * var20;
                        var24 = -var20 + var18;
                        var26 = 0.0;
                        var26 = (var22 - var24 * (double)var3.field_n) / (double)(((vl) this).field_m - -var3.field_n);
                        var28 = 0.0;
                        if (0.0 == var10) {
                          var10 = 0.00001;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        var28 = var24 + var26;
                        if (var12 == 0.0) {
                          var12 = 0.00001;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        var30 = new vl((vl) this);
                        var30.field_b = 0;
                        var30.field_f = 6;
                        wk.field_b[eg.a(-101)] = var30;
                        ((vl) this).field_a = (var12 * (var26 / var10) - var14) / (var12 * var12 / var10 + var10);
                        var3.field_k = (var28 / var10 * var12 - var16) / (var12 * var12 / var10 + var10);
                        ((vl) this).field_j = (-(((vl) this).field_a * var12) + var26) / var10;
                        var3.field_d = (var28 - var12 * var3.field_k) / var10;
                        if (a.field_h[var2].field_m == -1) {
                          if (-1 > (el.field_I ^ -1)) {
                            break L6;
                          } else {
                            el.field_I = 50;
                            ((vl) this).field_p = ((vl) this).field_p - 1;
                            break L6;
                          }
                        } else {
                          ((vl) this).field_p = ((vl) this).field_p - 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (11 != var3.field_m) {
                            break L8;
                          } else {
                            if ((var3.field_c ^ -1) == -14) {
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var3.field_g = var3.field_g - 1;
                        break L7;
                      }
                      L9: {
                        if (fe.field_e) {
                          if (a.field_h[0] == null) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                var31 = -a.field_h[0].field_a + ((vl) this).field_c;
                                var33 = ((vl) this).field_k - a.field_h[0].field_l;
                                var35 = 128;
                                if (var31 != 0.0) {
                                  break L11;
                                } else {
                                  if (var33 != 0.0) {
                                    break L11;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              var35 = (int)(25600.0 / Math.sqrt(var31 * var31 + var33 * var33));
                              break L10;
                            }
                            L12: {
                              if ((var35 ^ -1) >= -129) {
                                break L12;
                              } else {
                                var35 = 128;
                                break L12;
                              }
                            }
                            ll.field_c.a(sb.field_e[40], 100, pk.field_h * var35 / 50);
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      L13: {
                        if (5 < ((vl) this).field_p) {
                          break L13;
                        } else {
                          if (-101 > ((vl) this).field_l) {
                            break L13;
                          } else {
                            var2++;
                            continue L1;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (-12 != var3.field_m) {
                            break L15;
                          } else {
                            if (var3.field_c == 13) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3.field_g = var3.field_g - ((vl) this).field_p;
                        break L14;
                      }
                      ((vl) this).field_f = 4;
                      var2++;
                      continue L1;
                    } else {
                      var2++;
                      continue L1;
                    }
                  } else {
                    var2++;
                    continue L1;
                  }
                } else {
                  var2++;
                  continue L1;
                }
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, pb param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        double var6 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = stellarshard.field_B;
          var3 = (int)(320.0 + ((vl) this).field_c);
          var4 = (int)(((vl) this).field_k + 240.0);
          var5 = ((vl) this).field_q;
          if (0 != (((vl) this).field_d ^ -1)) {
            var6_int = 16711680 & ((((vl) this).field_d & 16711680) * ((vl) this).field_e + (128 + -((vl) this).field_e) * (16711680 & ((vl) this).field_q)) / 128;
            var7 = 65280 & ((((vl) this).field_d & 65280) * ((vl) this).field_e + (65280 & ((vl) this).field_q) * (-((vl) this).field_e + 128)) / 128;
            var8 = 255 & ((((vl) this).field_q & 255) * (128 + -((vl) this).field_e) - -((((vl) this).field_d & 255) * ((vl) this).field_e)) / 128;
            var5 = var8 + var7 + var6_int;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if ((((vl) this).field_f ^ -1) == -1) {
            if (((vl) this).field_n != -4) {
              if (((vl) this).field_n == -2) {
                ti.c(var3, var4, 5 + ((vl) this).field_p, 16777215 + -var5, 32);
                ti.e(var3, var4, 1 - -((vl) this).field_p, var5);
                break L1;
              } else {
                L2: {
                  if ((((vl) this).field_n ^ -1) == 0) {
                    break L2;
                  } else {
                    if (((vl) this).field_n != 0) {
                      L3: {
                        if (-2 == (((vl) this).field_n ^ -1)) {
                          break L3;
                        } else {
                          if (-7 == (((vl) this).field_n ^ -1)) {
                            break L3;
                          } else {
                            if ((((vl) this).field_n ^ -1) != -3) {
                              if (-4 == (((vl) this).field_n ^ -1)) {
                                break L1;
                              } else {
                                if (7 != ((vl) this).field_n) {
                                  if ((((vl) this).field_n ^ -1) == -5) {
                                    break L1;
                                  } else {
                                    if ((((vl) this).field_n ^ -1) != -10) {
                                      if ((((vl) this).field_n ^ -1) == -6) {
                                        ti.c(var3, var4, ((vl) this).field_p + 5, var5, 32);
                                        ti.c(var3, var4, 3 - -((vl) this).field_p, var5, 32);
                                        ti.c(var3, var4, ((vl) this).field_p + 1, 16777215, 32);
                                        break L1;
                                      } else {
                                        if (((vl) this).field_n != -3) {
                                          L4: {
                                            if (-11 == (((vl) this).field_n ^ -1)) {
                                              break L4;
                                            } else {
                                              if (-12 == (((vl) this).field_n ^ -1)) {
                                                break L4;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          }
                                          ti.a(var3 << -1485503996, var4 << 442772228, ((vl) this).field_p - -6 << 456904196, 192, ei.field_I);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              var6_int = (int)(Math.sin(0.1 * (double)((vl) this).field_b) * (double)((vl) this).field_p);
                              var7 = (int)(Math.cos((double)((vl) this).field_b * 0.1) * (double)((vl) this).field_p);
                              ti.c(var3 + var6_int, var4 + var7, ((vl) this).field_p + 1, 0, 128);
                              ti.c(var3 + -var6_int, -var7 + var4, 1 - -((vl) this).field_p, 0, 128);
                              ti.c(var3 + var6_int, var4 + var7, ((vl) this).field_p, var5, 128);
                              ti.c(var3 - var6_int, var4 + -var7, ((vl) this).field_p, var5, 128);
                              ti.e(var3 - -var6_int, var4 + var7, 1 - -(((vl) this).field_p / 3), 16777215);
                              ti.e(var3 - var6_int, -var7 + var4, ((vl) this).field_p / 3 + 1, 16777215);
                              break L1;
                            }
                          }
                        }
                      }
                      ti.e(var3, var4, ((vl) this).field_p + 1, var5);
                      ti.e((int)(-(((vl) this).field_j / 2.0) + (double)var3), (int)((double)var4 - ((vl) this).field_a / 2.0), ((vl) this).field_p / 2 + 1, var5);
                      ti.e((int)(-(((vl) this).field_j / 4.0) + (double)var3), (int)((double)var4 - ((vl) this).field_a / 4.0), 1 + ((vl) this).field_p / 4, var5);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ti.e(var3, var4, ((vl) this).field_p + 1, var5);
                ti.c((int)(-((vl) this).field_j + (double)var3), (int)(-((vl) this).field_a + (double)var4), ((vl) this).field_p / 2 + 1, var5, 128);
                ti.c((int)((double)var3 - ((vl) this).field_j * 2.0), (int)(-(((vl) this).field_a * 2.0) + (double)var4), 1 + ((vl) this).field_p / 3, var5, 64);
                ti.c((int)(-(((vl) this).field_j * 3.0) + (double)var3), (int)(-(((vl) this).field_a * 3.0) + (double)var4), 1 - -(((vl) this).field_p / 4), var5, 32);
                ti.e(var3, var4, 1 - -(((vl) this).field_p / 2), 16777215);
                break L1;
              }
            } else {
              ti.c(var3, var4, 5 - -((vl) this).field_p, -var5 + 16777215, 32);
              ti.e(var3, var4, ((vl) this).field_p, var5);
              break L1;
            }
          } else {
            break L1;
          }
        }
        L5: {
          if ((((vl) this).field_f ^ -1) == -2) {
            param1.e();
            ti.c(var3, var4, ((vl) this).field_b / 16 + 1, 255, 128 + -(((vl) this).field_b / 2));
            pd.field_h.a((byte) -107);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (-5 == (((vl) this).field_f ^ -1)) {
            param1.e();
            ti.c(var3, var4, ((vl) this).field_b / 16 + 1, 255, 128 + -(((vl) this).field_b / 2));
            pd.field_h.a((byte) -107);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if ((((vl) this).field_f ^ -1) != -3) {
            break L7;
          } else {
            if (0 < ((vl) this).field_b) {
              var6_int = ((vl) this).field_b >> 340714084;
              var7 = 2 * ((vl) this).field_b / 3 - -24;
              pg.field_hb[var6_int].c(-var7 + var3, var4 - var7, var7 * 2, 2 * var7, (255 + -((vl) this).field_b) / 2);
              var7 = 24 + 2 * ((vl) this).field_b / 9;
              pg.field_hb[var6_int].c(-var7 + var3, var4 + -var7, var7 * 2, 2 * var7, 255 - ((vl) this).field_b);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L8: {
          if (((vl) this).field_f != 6) {
            break L8;
          } else {
            if ((((vl) this).field_b ^ -1) < -1) {
              var6_int = ((vl) this).field_b >> 98086564;
              var7 = 12 + ((vl) this).field_b / 3;
              pg.field_hb[var6_int].c(var3 + -var7, var4 - var7, 2 * var7, var7 * 2, (255 + -((vl) this).field_b) / 2);
              var7 = 12 + ((vl) this).field_b / 9;
              pg.field_hb[var6_int].c(-var7 + var3, var4 - var7, var7 * 2, var7 * 2, -((vl) this).field_b + 255);
              break L8;
            } else {
              break L8;
            }
          }
        }
        L9: {
          if (3 == ((vl) this).field_f) {
            ti.c(var3, var4, 7, 0, 128);
            ti.e(var3, var4, 2, var5);
            ti.c(var3, var4, 3, var5, 128);
            var6_int = 0;
            L10: while (true) {
              if (-6 >= (var6_int ^ -1)) {
                break L9;
              } else {
                ti.c((int)((double)var3 - ((vl) this).field_j), (int)((double)var4 - ((vl) this).field_a), 3, var5, 128 + -(15 * var6_int));
                var6_int++;
                continue L10;
              }
            }
          } else {
            break L9;
          }
        }
        L11: {
          if (((vl) this).field_f == 5) {
            if (-5 == ((vl) this).field_n) {
              var6 = 0.0;
              L12: while (true) {
                if (1.0 <= var6) {
                  break L11;
                } else {
                  ti.a((int)(var6 * ((vl) this).field_j + (double)var3) << -1600441820, (int)((double)var4 + var6 * ((vl) this).field_a) << -1904504156, (int)(6.0 + (-var6 + 1.0) * (double)((vl) this).field_p) << -240804572, 32 + -(int)(32.0 * var6), ei.field_I);
                  var6 = var6 + 0.1;
                  continue L12;
                }
              }
            } else {
              var6 = 0.0;
              L13: while (true) {
                if (var6 >= 1.0) {
                  break L11;
                } else {
                  ti.c((int)((double)var3 + ((vl) this).field_j * var6), (int)((double)var4 + var6 * ((vl) this).field_a), 1 + ((vl) this).field_p, var5, 255 + -(64 * ((vl) this).field_b));
                  var6 = var6 + 0.1;
                  continue L13;
                }
              }
            }
          } else {
            break L11;
          }
        }
        L14: {
          if (param0 < -35) {
            break L14;
          } else {
            var10 = null;
            boolean discarded$1 = this.a(68, (qe) null, true);
            break L14;
          }
        }
    }

    final vl a(byte param0) {
        int var2 = 0;
        double var3_double = 0.0;
        vl var3 = null;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        if (param0 < -84) {
          L0: {
            var2 = ((vl) this).field_l;
            if (var2 != 1001) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: while (true) {
            L2: {
              var2--;
              if (-1002 == (((vl) this).field_l ^ -1)) {
                var3_double = Math.sqrt(((vl) this).field_a * ((vl) this).field_a + ((vl) this).field_j * ((vl) this).field_j);
                var5 = -0.1 + (Math.atan2(((vl) this).field_j, ((vl) this).field_a) + 0.2 * Math.random());
                ((vl) this).field_j = var3_double * Math.sin(var5);
                ((vl) this).field_a = Math.cos(var5) * var3_double;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              this.a(true);
              if ((((vl) this).field_d ^ -1) != 0) {
                L4: {
                  ((vl) this).field_e = ((vl) this).field_e + 1;
                  if (128 <= ((vl) this).field_e) {
                    break L4;
                  } else {
                    ((vl) this).field_e = ((vl) this).field_e + 1;
                    if (((vl) this).field_e >= 128) {
                      ((vl) this).field_e = 0;
                      ((vl) this).field_q = ((vl) this).field_d;
                      ((vl) this).field_d = -1;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (-3 == ((vl) this).field_n) {
                  if (((vl) this).field_d != -1) {
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (((vl) this).field_f == 0) {
                L6: {
                  ((vl) this).field_b = ((vl) this).field_b + 1;
                  this.b((byte) -127);
                  if (0 < ((vl) this).field_p) {
                    break L6;
                  } else {
                    ((vl) this).field_j = ((vl) this).field_j * 0.1;
                    ((vl) this).field_a = ((vl) this).field_a * 0.1;
                    ((vl) this).field_p = 1;
                    ((vl) this).field_q = 16777215;
                    ((vl) this).field_f = 1;
                    break L6;
                  }
                }
                L7: {
                  if (-1 == ((vl) this).field_f) {
                    break L7;
                  } else {
                    ((vl) this).field_l = 0;
                    break L7;
                  }
                }
                if (-1 >= ((vl) this).field_l) {
                  break L5;
                } else {
                  if (11 != ((vl) this).field_n) {
                    L8: {
                      var3 = new vl((vl) this);
                      if (5 == ((vl) this).field_l) {
                        var3.field_p = 5 + -var2;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var4 = dc.a(true);
                    if (var4 > -1) {
                      wk.field_b[var4] = var3;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
              } else {
                break L5;
              }
            }
            L9: {
              if (((vl) this).field_f != 1) {
                if (-3 == (((vl) this).field_f ^ -1)) {
                  ((vl) this).field_b = ((vl) this).field_b + 16;
                  if (((vl) this).field_b <= 255) {
                    break L9;
                  } else {
                    return null;
                  }
                } else {
                  if (((vl) this).field_f != 6) {
                    break L9;
                  } else {
                    ((vl) this).field_b = ((vl) this).field_b + 16;
                    if ((((vl) this).field_b ^ -1) >= -256) {
                      break L9;
                    } else {
                      return null;
                    }
                  }
                }
              } else {
                ((vl) this).field_b = ((vl) this).field_b + 16;
                if (255 >= ((vl) this).field_b) {
                  break L9;
                } else {
                  return null;
                }
              }
            }
            L10: {
              if (3 == ((vl) this).field_f) {
                ((vl) this).field_b = ((vl) this).field_b + 1;
                this.b((byte) -126);
                if (-1 <= (((vl) this).field_p ^ -1)) {
                  ((vl) this).field_q = 16711680;
                  ((vl) this).field_p = 1;
                  ((vl) this).field_j = ((vl) this).field_j * 0.1;
                  ((vl) this).field_f = 1;
                  ((vl) this).field_a = ((vl) this).field_a * 0.1;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            }
            L11: {
              if ((((vl) this).field_f ^ -1) == -5) {
                this.b((byte) -128);
                ((vl) this).field_b = ((vl) this).field_b + 8;
                if (((vl) this).field_b <= 255) {
                  if (0 >= ((vl) this).field_p) {
                    ((vl) this).field_b = 0;
                    ((vl) this).field_p = 1;
                    ((vl) this).field_f = 1;
                    ((vl) this).field_q = 16777215;
                    ((vl) this).field_a = ((vl) this).field_a * 0.1;
                    ((vl) this).field_j = ((vl) this).field_j * 0.1;
                    break L11;
                  } else {
                    break L11;
                  }
                } else {
                  return null;
                }
              } else {
                break L11;
              }
            }
            if (-384.0 <= ((vl) this).field_c) {
              if (((vl) this).field_c <= 384.0) {
                if (((vl) this).field_k >= -304.0) {
                  if (304.0 >= ((vl) this).field_k) {
                    if (((vl) this).field_p > 0) {
                      if (var2 > 0) {
                        continue L1;
                      } else {
                        if (((vl) this).field_l != 1001) {
                          return (vl) this;
                        } else {
                          return null;
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1, boolean param2) {
        ((vl) this).field_k = ((vl) this).field_k - (double)param0;
        if (!param2) {
            field_o = null;
        }
        ((vl) this).field_c = ((vl) this).field_c - (double)param1;
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_o = null;
        field_i = null;
        int var1 = 118 % ((-40 - param0) / 46);
        field_h = null;
    }

    private final void a(boolean param0) {
        ((vl) this).field_c = ((vl) this).field_c + ((vl) this).field_j;
        if (!param0) {
            vl.a(-40);
        }
        ((vl) this).field_k = ((vl) this).field_k + ((vl) this).field_a;
    }

    private final boolean a(int param0, qe param1, boolean param2) {
        L0: {
          if (param1.field_a - 48.0 >= ((vl) this).field_c) {
            break L0;
          } else {
            if (((vl) this).field_c >= 48.0 + param1.field_a) {
              break L0;
            } else {
              if (-48.0 + param1.field_l >= ((vl) this).field_k) {
                break L0;
              } else {
                if (param1.field_l + 48.0 > ((vl) this).field_k) {
                  L1: {
                    if (param2) {
                      break L1;
                    } else {
                      if (param1.b(param0 ^ -688).c((int)(param1.field_a - 48.0), (int)(param1.field_l - 48.0), (int)((vl) this).field_c, (int)((vl) this).field_k)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  return true;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (-4.0 + param1.field_a >= ((vl) this).field_c) {
            break L2;
          } else {
            if (((vl) this).field_c >= 4.0 + param1.field_a) {
              break L2;
            } else {
              if (((vl) this).field_k <= param1.field_l - 4.0) {
                break L2;
              } else {
                if (((vl) this).field_k < 4.0 + param1.field_l) {
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
        }
        if (param0 == -48) {
          return false;
        } else {
          field_r = null;
          return false;
        }
    }

    private vl(vl param0) {
        ((vl) this).field_b = 0;
        ((vl) this).field_n = -2;
        ((vl) this).field_j = param0.field_j;
        ((vl) this).field_e = param0.field_e;
        ((vl) this).field_m = param0.field_m;
        ((vl) this).field_d = param0.field_d;
        ((vl) this).field_k = param0.field_k;
        ((vl) this).field_p = param0.field_p;
        ((vl) this).field_l = 0;
        ((vl) this).field_q = param0.field_q;
        ((vl) this).field_f = 5;
        ((vl) this).field_c = param0.field_c;
        ((vl) this).field_g = param0.field_g;
        ((vl) this).field_a = param0.field_a;
        if (9 == param0.field_n) {
            ((vl) this).field_n = -4;
        }
        if (param0.field_n == 10) {
            ((vl) this).field_n = -5;
        }
    }

    vl(int param0, qe param1) {
        ((vl) this).field_m = 10;
        ((vl) this).field_c = 0.0;
        ((vl) this).field_k = 0.0;
        ((vl) this).field_f = param0;
        ((vl) this).field_q = 16777215;
        ((vl) this).field_g = param1;
        ((vl) this).field_b = 0;
        ((vl) this).field_a = 0.0;
        ((vl) this).field_e = 0;
        ((vl) this).field_p = 1;
        ((vl) this).field_j = 0.0;
        ((vl) this).field_d = -1;
        if (param0 == 3) {
            ((vl) this).field_q = 16711680;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Sound: ";
        field_i = "to keep fullscreen or";
    }
}
