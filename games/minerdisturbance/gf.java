/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_d;
    private int field_k;
    static String[] field_a;
    private int field_o;
    private int field_j;
    int field_i;
    private int field_m;
    private int field_f;
    int field_g;
    private int field_c;
    int field_p;
    int field_h;
    int field_b;
    private boolean field_e;
    private int field_l;
    int field_n;

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = MinerDisturbance.field_ab;
          if (!param0) {
            break L0;
          } else {
            ((gf) this).field_m = -58;
            break L0;
          }
        }
        L1: {
          var2 = 16 + (((gf) this).field_k / 10 + ((gf) this).field_n * 32) - li.field_c;
          var3 = 16 + (((gf) this).field_f / 10 + ((gf) this).field_p * 32) - db.field_d;
          var4 = q.field_b[((gf) this).field_n][((gf) this).field_p].field_i;
          if (var4 >= 1) {
            break L1;
          } else {
            var4 = 1;
            break L1;
          }
        }
        L2: {
          if (255 >= var4) {
            break L2;
          } else {
            var4 = 255;
            break L2;
          }
        }
        L3: {
          if (((gf) this).field_d < var4) {
            ((gf) this).field_d = ((gf) this).field_d + 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var4 < ((gf) this).field_d) {
            ((gf) this).field_d = ((gf) this).field_d - 1;
            break L4;
          } else {
            break L4;
          }
        }
        var5 = ((gf) this).field_k / 10 + (32 * ((gf) this).field_n - 32 * ca.field_k) + -(sk.field_d / 10);
        var6 = -(hf.field_t * 32) - (mf.field_i / 10 - ((gf) this).field_p * 32 + -(((gf) this).field_f / 10));
        var7 = (int)Math.sqrt((double)(var6 * var6 + var5 * var5)) / ((gf) this).field_d;
        var2 = (int)((double)var2 + (double)var7 * Math.sin((double)pa.field_d * 3.14 / 16384.0) / 3.0);
        var3 = (int)((double)var3 + Math.cos((double)pa.field_d * 3.14 / 16384.0) * (double)var7 / 3.0);
        var8 = 0;
        L5: while (true) {
          if (var8 >= 4) {
            return;
          } else {
            eh.f(var2, var3, -(var8 * 8) + 64, 16777215, 16);
            var8++;
            continue L5;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ea var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        ea var16 = null;
        int stackIn_15_0 = 0;
        ea stackIn_22_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        ea stackOut_21_0 = null;
        ea stackOut_20_0 = null;
        L0: {
          var15 = MinerDisturbance.field_ab;
          if (((gf) this).field_h == 19) {
            break L0;
          } else {
            if (((gf) this).field_h == 9) {
              break L0;
            } else {
              return;
            }
          }
        }
        L1: {
          if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
            break L1;
          } else {
            L2: {
              if (je.field_O.f(((gf) this).field_p, 2, ((gf) this).field_n)) {
                break L2;
              } else {
                if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_A) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (((gf) this).field_d <= 0) {
                break L3;
              } else {
                var2 = 32 * ((gf) this).field_n + (((gf) this).field_k / 10 + -(sk.field_d / 10) + -(32 * ca.field_k));
                var3 = ((gf) this).field_f / 10 + (32 * ((gf) this).field_p + (-(mf.field_i / 10) + -(32 * hf.field_t)));
                var4 = (int)Math.sqrt((double)(var2 * var2 - -(var3 * var3))) / ((gf) this).field_d;
                if (var4 > 100) {
                  return;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              var2 = -li.field_c + 32 * ((gf) this).field_n - -(((gf) this).field_k / 10);
              var3 = -db.field_d + (((gf) this).field_p * 32 - -(((gf) this).field_f / 10));
              if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                stackOut_14_0 = 0;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var4 = stackIn_15_0;
              var5 = (((gf) this).field_c & 63) / 16;
              if (((gf) this).field_i == 0) {
                var5 = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (19 != ((gf) this).field_h) {
                L7: {
                  var7 = 91 + ((gf) this).field_j / 10 % 5;
                  if (0 > ((gf) this).field_m) {
                    var7 = 59;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (((gf) this).field_m > 0) {
                    var7 = 60;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (((gf) this).field_m <= 10) {
                    break L9;
                  } else {
                    var7 = 61;
                    break L9;
                  }
                }
                var6 = pk.field_h[var7];
                break L6;
              } else {
                L10: {
                  if (var4 != 0) {
                    stackOut_21_0 = vc.field_o[var5 + 4];
                    stackIn_22_0 = stackOut_21_0;
                    break L10;
                  } else {
                    stackOut_20_0 = vc.field_o[var5];
                    stackIn_22_0 = stackOut_20_0;
                    break L10;
                  }
                }
                var16 = stackIn_22_0;
                var6 = var16;
                var3 = var3 + (-var16.field_A + 32);
                break L6;
              }
            }
            L11: {
              if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_A) {
                L12: {
                  var3 += 8;
                  if (((gf) this).field_i < 0) {
                    var6.e().a(var2, 32 + var3 - var6.field_A, 9348351);
                    break L12;
                  } else {
                    var6.a(var2, 32 + var3 - var6.field_A, 9348351);
                    break L12;
                  }
                }
                var3 -= 8;
                break L11;
              } else {
                break L11;
              }
            }
            var7 = 4 * ((gf) this).field_n - (-(((gf) this).field_k / 80) + 1);
            var8 = -1 + (((gf) this).field_f / 80 + ((gf) this).field_p * 4);
            var11 = -68 % ((-35 - param0) / 44);
            var9 = -li.field_c + var7 * 8;
            var10 = var8 * 8 + -db.field_d;
            var12 = 0;
            L13: while (true) {
              if (var12 > 6) {
                eh.a();
                return;
              } else {
                var10 = -db.field_d + 8 * var8;
                var13 = var8;
                var14 = 0;
                L14: while (true) {
                  if (var14 > 5) {
                    var9 += 8;
                    var7++;
                    var12++;
                    continue L13;
                  } else {
                    L15: {
                      if (!je.field_O.a(var7, var13, (byte) 61)) {
                        break L15;
                      } else {
                        eh.a(var9, var10, var9 + 8, var10 - -8);
                        if (((gf) this).field_i < 0) {
                          var6.h(var2, var3);
                          break L15;
                        } else {
                          var6.f(var2, var3);
                          break L15;
                        }
                      }
                    }
                    var13++;
                    var10 += 8;
                    var14++;
                    continue L14;
                  }
                }
              }
            }
          }
        }
    }

    final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ea var5_ref_ea = null;
        int var5 = 0;
        ea var6 = null;
        int var7 = 0;
        ea stackIn_40_0 = null;
        int stackIn_62_0 = 0;
        ea stackIn_67_0 = null;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        ea stackOut_66_0 = null;
        ea stackOut_65_0 = null;
        ea stackOut_39_0 = null;
        ea stackOut_38_0 = null;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var2 = ((gf) this).field_k / 10 + (((gf) this).field_n * 32 - li.field_c);
          var3 = -db.field_d + (32 * ((gf) this).field_p + ((gf) this).field_f / 10);
          if (!this.a((byte) 103)) {
            break L0;
          } else {
            mb.field_d[((gf) this).field_h].f(var2, var3);
            break L0;
          }
        }
        L1: {
          if (param0 == -12) {
            break L1;
          } else {
            ((gf) this).b(false);
            break L1;
          }
        }
        L2: {
          if (17 == ((gf) this).field_h) {
            te.field_d[0].c(-16 + var2, var3, 128);
            break L2;
          } else {
            if (6 != ((gf) this).field_h) {
              L3: {
                if (((gf) this).field_h == 7) {
                  break L3;
                } else {
                  if (((gf) this).field_h == 15) {
                    break L3;
                  } else {
                    if (((gf) this).field_h == 18) {
                      break L3;
                    } else {
                      if (((gf) this).field_h != 22) {
                        if (20 == ((gf) this).field_h) {
                          if (((gf) this).field_g != 0) {
                            if (5 <= ((gf) this).field_g) {
                              break L2;
                            } else {
                              hk.field_a[((gf) this).field_g].f(-16 + var2, var3);
                              break L2;
                            }
                          } else {
                            if (((gf) this).field_b >= 250) {
                              g.field_j[4].f(var2, var3);
                              break L2;
                            } else {
                              g.field_j[5 * ((gf) this).field_b / 250].f(var2, var3);
                              break L2;
                            }
                          }
                        } else {
                          if (((gf) this).field_h == 8) {
                            wj.field_k[((gf) this).field_g].f(-16 + var2, var3 - 48);
                            break L2;
                          } else {
                            if (9 != ((gf) this).field_h) {
                              if (21 != ((gf) this).field_h) {
                                if (((gf) this).field_h == 19) {
                                  L4: {
                                    if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                                      stackOut_61_0 = 0;
                                      stackIn_62_0 = stackOut_61_0;
                                      break L4;
                                    } else {
                                      stackOut_60_0 = 1;
                                      stackIn_62_0 = stackOut_60_0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    var4 = stackIn_62_0;
                                    var5 = (((gf) this).field_c & 63) / 16;
                                    if (((gf) this).field_i != 0) {
                                      break L5;
                                    } else {
                                      var5 = 0;
                                      break L5;
                                    }
                                  }
                                  L6: {
                                    if (var4 != 0) {
                                      stackOut_66_0 = ph.field_e[var5 + 4];
                                      stackIn_67_0 = stackOut_66_0;
                                      break L6;
                                    } else {
                                      stackOut_65_0 = ph.field_e[var5];
                                      stackIn_67_0 = stackOut_65_0;
                                      break L6;
                                    }
                                  }
                                  var6 = stackIn_67_0;
                                  if (((gf) this).field_i < 0) {
                                    var6.h(var2, -var6.field_A + 32 + var3);
                                    break L2;
                                  } else {
                                    var6.f(var2, 32 + (var3 - var6.field_A));
                                    break L2;
                                  }
                                } else {
                                  if (10 != ((gf) this).field_h) {
                                    if (12 > ((gf) this).field_h) {
                                      break L2;
                                    } else {
                                      if (((gf) this).field_h >= 16) {
                                        break L2;
                                      } else {
                                        L7: {
                                          var4 = q.field_b[((gf) this).field_n][((gf) this).field_p].field_i;
                                          if (0 <= var4) {
                                            break L7;
                                          } else {
                                            var4 = 0;
                                            break L7;
                                          }
                                        }
                                        L8: {
                                          if (var4 > 255) {
                                            var4 = 255;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        }
                                        a.field_a[-12 + (((gf) this).field_h - -37)].c(var2, var3, var4);
                                        break L2;
                                      }
                                    }
                                  } else {
                                    if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_i != 0) {
                                      break L2;
                                    } else {
                                      L9: {
                                        if (((gf) this).field_g == 1) {
                                          break L9;
                                        } else {
                                          if (((gf) this).field_b / 25 % 2 != 0) {
                                            break L2;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
                                        break L2;
                                      } else {
                                        a.field_a[62].f(var2, var3);
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L10: {
                                  if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                                    stackOut_39_0 = fi.field_b[0];
                                    stackIn_40_0 = stackOut_39_0;
                                    break L10;
                                  } else {
                                    stackOut_38_0 = fi.field_b[1];
                                    stackIn_40_0 = stackOut_38_0;
                                    break L10;
                                  }
                                }
                                var5_ref_ea = stackIn_40_0;
                                if (0 > ((gf) this).field_i) {
                                  var5_ref_ea.h(var2, -var5_ref_ea.field_A + (32 + var3));
                                  break L2;
                                } else {
                                  var5_ref_ea.f(var2, var3 + (32 + -var5_ref_ea.field_A));
                                  break L2;
                                }
                              }
                            } else {
                              L11: {
                                var4 = 91 + ((gf) this).field_j / 10 % 5;
                                if (((gf) this).field_m >= 0) {
                                  break L11;
                                } else {
                                  var4 = 59;
                                  break L11;
                                }
                              }
                              L12: {
                                if (0 >= ((gf) this).field_m) {
                                  break L12;
                                } else {
                                  var4 = 60;
                                  break L12;
                                }
                              }
                              L13: {
                                if (((gf) this).field_m > 10) {
                                  var4 = 61;
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              if (0 <= ((gf) this).field_i) {
                                a.field_a[var4].f(var2, var3);
                                break L2;
                              } else {
                                a.field_a[var4].h(var2, var3);
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              if (0 != ((gf) this).field_g) {
                te.field_d[4 + ((gf) this).field_g].f(-16 + var2, var3);
                break L2;
              } else {
                if (((gf) this).field_b < 250) {
                  ne.field_O[((gf) this).field_b * 5 / 250].f(var2, var3);
                  break L2;
                } else {
                  ne.field_O[4].f(var2, var3);
                  break L2;
                }
              }
            } else {
              if (((gf) this).field_g != 0) {
                te.field_d[4 + ((gf) this).field_g].f(-16 + var2, var3);
                break L2;
              } else {
                if (!je.c(((gf) this).field_n, ((gf) this).field_p, 3, 3)) {
                  if (((gf) this).field_b >= 240) {
                    te.field_d[1].f(-16 + var2, var3);
                    break L2;
                  } else {
                    te.field_d[0].f(-16 + var2, var3);
                    te.field_d[((gf) this).field_b / 10 % 3 - -2].f(-16 + var2 + -(3 * ((gf) this).field_b / 250), ((gf) this).field_b * 3 / 250 + var3);
                    break L2;
                  }
                } else {
                  te.field_d[0].c(var2 - 16, var3, 128);
                  break L2;
                }
              }
            }
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (!param0) {
          L0: {
            L1: {
              if (((gf) this).field_h == 9) {
                break L1;
              } else {
                if (19 == ((gf) this).field_h) {
                  break L1;
                } else {
                  if (((gf) this).field_h != 21) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return false;
        }
    }

    private final boolean a(byte param0) {
        if (param0 < 92) {
            ((gf) this).field_f = -74;
        }
        return ((gf) this).field_h < 6 ? true : false;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          ((gf) this).field_j = ((gf) this).field_j + 1;
          if (((gf) this).field_j <= 100) {
            break L0;
          } else {
            ((gf) this).field_j = ((gf) this).field_j - 100;
            break L0;
          }
        }
        L1: {
          if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
            break L1;
          } else {
            if (q.field_b[((gf) this).field_n][((gf) this).field_p + 1].g()) {
              ((gf) this).field_m = ((gf) this).field_m - 40;
              break L1;
            } else {
              ((gf) this).field_m = ((gf) this).field_m - 20;
              break L1;
            }
          }
        }
        L2: {
          if (!q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_a) {
            break L2;
          } else {
            ((gf) this).field_b = ((gf) this).field_b + 1;
            if (((gf) this).field_b <= 250) {
              break L2;
            } else {
              L3: {
                if (100.0 * Math.random() >= 50.0) {
                  break L3;
                } else {
                  L4: {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (q.field_b[1 + ((gf) this).field_n][1 + ((gf) this).field_p].field_b) {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    } else {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L4;
                    }
                  }
                  if (stackIn_12_0 != stackIn_12_1) {
                    break L3;
                  } else {
                    q.field_b[((gf) this).field_n - -1][1 + ((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 97)] = new gf(((gf) this).field_n - -1, ((gf) this).field_p - -1, 8);
                    break L3;
                  }
                }
              }
              L5: {
                if (100.0 * Math.random() >= 50.0) {
                  break L5;
                } else {
                  if (q.field_b[1 + ((gf) this).field_n][((gf) this).field_p + -1].field_b) {
                    break L5;
                  } else {
                    q.field_b[1 + ((gf) this).field_n][-1 + ((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 59)] = new gf(((gf) this).field_n - -1, ((gf) this).field_p + -1, 8);
                    break L5;
                  }
                }
              }
              if (100.0 * Math.random() < 50.0) {
                if (((gf) this).field_n < 30) {
                  L6: {
                    stackOut_21_0 = 0;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (q.field_b[((gf) this).field_n - -1][((gf) this).field_p].field_b) {
                      stackOut_23_0 = stackIn_23_0;
                      stackOut_23_1 = 0;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      break L6;
                    } else {
                      stackOut_22_0 = stackIn_22_0;
                      stackOut_22_1 = 1;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      break L6;
                    }
                  }
                  if (stackIn_24_0 == stackIn_24_1) {
                    ((gf) this).field_m = -40;
                    break L2;
                  } else {
                    q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 95)] = new gf(((gf) this).field_n - -1, ((gf) this).field_p, 8);
                    break L2;
                  }
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L7: {
          if (q.field_b[((gf) this).field_n + -1][((gf) this).field_p].field_a) {
            ((gf) this).field_b = ((gf) this).field_b + 1;
            if (((gf) this).field_b > 250) {
              L8: {
                if (50.0 <= 100.0 * Math.random()) {
                  break L8;
                } else {
                  if (!q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p - -1].field_b) {
                    q.field_b[((gf) this).field_n - 1][1 + ((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 114)] = new gf(((gf) this).field_n + 1, ((gf) this).field_p - -1, 8);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (50.0 <= Math.random() * 100.0) {
                  break L9;
                } else {
                  if (!q.field_b[((gf) this).field_n + -1][((gf) this).field_p - 1].field_b) {
                    q.field_b[((gf) this).field_n - 1][((gf) this).field_p - 1].field_a = false;
                    uf.field_p[jf.b((byte) 76)] = new gf(1 + ((gf) this).field_n, ((gf) this).field_p - 1, 8);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              if (50.0 > 100.0 * Math.random()) {
                if (((gf) this).field_n > 1) {
                  if (q.field_b[((gf) this).field_n - 1][((gf) this).field_p].field_b) {
                    ((gf) this).field_m = -40;
                    break L7;
                  } else {
                    q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 64)] = new gf(((gf) this).field_n + -1, ((gf) this).field_p, 8);
                    break L7;
                  }
                } else {
                  break L7;
                }
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          } else {
            break L7;
          }
        }
        L10: {
          if (((gf) this).field_b <= 250) {
            break L10;
          } else {
            L11: {
              if (!q.field_b[((gf) this).field_n][((gf) this).field_p - -1].field_a) {
                if (((gf) this).field_k > 20) {
                  ((gf) this).field_k = ((gf) this).field_k - 10;
                  break L11;
                } else {
                  if (((gf) this).field_k >= -20) {
                    break L11;
                  } else {
                    ((gf) this).field_k = ((gf) this).field_k + 10;
                    break L11;
                  }
                }
              } else {
                break L11;
              }
            }
            ((gf) this).field_b = ((gf) this).field_b - 250;
            break L10;
          }
        }
        L12: {
          int fieldTemp$2 = ((gf) this).field_o;
          ((gf) this).field_o = ((gf) this).field_o + 1;
          if (600 < fieldTemp$2) {
            if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_i < 120) {
              var3 = 0;
              var4 = 0;
              L13: while (true) {
                L14: {
                  if (var4 >= uf.field_p.length) {
                    break L14;
                  } else {
                    if (null != uf.field_p[var4]) {
                      if (uf.field_p[var4].field_h == 10) {
                        var5 = -((gf) this).field_n + uf.field_p[var4].field_n;
                        var6 = uf.field_p[var4].field_p + -((gf) this).field_p;
                        if (var5 * var5 + var6 * var6 < 36) {
                          uf.field_p[var4].field_n = ((gf) this).field_n;
                          uf.field_p[var4].field_p = ((gf) this).field_p;
                          var3 = 1;
                          break L14;
                        } else {
                          var4++;
                          continue L13;
                        }
                      } else {
                        var4++;
                        continue L13;
                      }
                    } else {
                      var4++;
                      continue L13;
                    }
                  }
                }
                L15: {
                  if (var3 != 0) {
                    break L15;
                  } else {
                    uf.field_p[jf.b((byte) 117)] = new gf(((gf) this).field_n, ((gf) this).field_p, 10);
                    break L15;
                  }
                }
                ((gf) this).field_o = 0;
                break L12;
              }
            } else {
              break L12;
            }
          } else {
            break L12;
          }
        }
        L16: {
          if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_i > 120) {
            L17: {
              if (ca.field_k > ((gf) this).field_n) {
                if (((gf) this).field_i < 40) {
                  ((gf) this).field_i = ((gf) this).field_i + 2;
                  if (hf.field_t >= ((gf) this).field_p) {
                    break L17;
                  } else {
                    if (!param1) {
                      break L17;
                    } else {
                      ((gf) this).field_m = -40;
                      break L17;
                    }
                  }
                } else {
                  if (hf.field_t >= ((gf) this).field_p) {
                    break L17;
                  } else {
                    if (!param1) {
                      break L17;
                    } else {
                      ((gf) this).field_m = -40;
                      break L17;
                    }
                  }
                }
              } else {
                if (hf.field_t >= ((gf) this).field_p) {
                  break L17;
                } else {
                  if (!param1) {
                    break L17;
                  } else {
                    ((gf) this).field_m = -40;
                    break L17;
                  }
                }
              }
            }
            L18: {
              if (((gf) this).field_n <= ca.field_k) {
                if (!sc.field_b) {
                  break L18;
                } else {
                  if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
                    break L18;
                  } else {
                    ag.a(true, 1, 32 * ((gf) this).field_p, 32 * ((gf) this).field_n);
                    break L18;
                  }
                }
              } else {
                if (!sc.field_b) {
                  break L18;
                } else {
                  if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
                    break L18;
                  } else {
                    ag.a(true, 1, 32 * ((gf) this).field_p, 32 * ((gf) this).field_n);
                    break L18;
                  }
                }
              }
            }
            if (ca.field_k != ((gf) this).field_n) {
              break L16;
            } else {
              if (((gf) this).field_p != hf.field_t) {
                break L16;
              } else {
                int discarded$3 = -31391;
                if (il.e()) {
                  break L16;
                } else {
                  rj.a((byte) -38, 7);
                  break L16;
                }
              }
            }
          } else {
            if (((gf) this).field_g != 0) {
              L19: {
                if (-10 < ((gf) this).field_i) {
                  ((gf) this).field_i = ((gf) this).field_i - 2;
                  break L19;
                } else {
                  break L19;
                }
              }
              if (q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_a) {
                ((gf) this).field_g = 0;
                break L16;
              } else {
                break L16;
              }
            } else {
              L20: {
                if (10 > ((gf) this).field_i) {
                  ((gf) this).field_i = ((gf) this).field_i + 2;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_a) {
                ((gf) this).field_g = 1;
                break L16;
              } else {
                break L16;
              }
            }
          }
        }
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        double var8 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_102_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        L0: {
          var11 = MinerDisturbance.field_ab;
          ((gf) this).field_c = ((gf) this).field_c + 1;
          if (!sc.field_b) {
            break L0;
          } else {
            if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
              ag.a(true, 32, ((gf) this).field_p * 32, 32 * ((gf) this).field_n);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (120 >= q.field_b[((gf) this).field_n][((gf) this).field_p].field_i) {
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L1;
          } else {
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_7_0;
          if (((gf) this).field_l <= 32) {
            break L2;
          } else {
            L3: {
              L4: {
                if (var2 == 0) {
                  break L4;
                } else {
                  if (!((gf) this).field_e) {
                    ne.a(44, 58);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (var2 != 0) {
                break L3;
              } else {
                if (!((gf) this).field_e) {
                  break L3;
                } else {
                  ne.a(45, 69);
                  break L3;
                }
              }
            }
            ((gf) this).field_l = 0;
            break L2;
          }
        }
        L5: {
          stackOut_16_0 = this;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (var2 == 0) {
            stackOut_18_0 = this;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L5;
          } else {
            stackOut_17_0 = this;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L5;
          }
        }
        L6: {
          L7: {
            ((gf) this).field_e = stackIn_19_1 != 0;
            if (var2 == 0) {
              break L7;
            } else {
              if (~((gf) this).field_p <= ~hf.field_t) {
                break L7;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L6;
              }
            }
          }
          stackOut_22_0 = 0;
          stackIn_23_0 = stackOut_22_0;
          break L6;
        }
        L8: {
          var3 = stackIn_23_0;
          if (q.field_b[((gf) this).field_n - -1][((gf) this).field_p].field_a) {
            ((gf) this).field_b = ((gf) this).field_b + 1;
            if (((gf) this).field_b <= 150) {
              break L8;
            } else {
              if (50.0 > Math.random() * 100.0) {
                if (((gf) this).field_n >= 30) {
                  break L8;
                } else {
                  if (q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_b) {
                    break L8;
                  } else {
                    q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 71)] = new gf(((gf) this).field_n + 1, ((gf) this).field_p, 8);
                    break L8;
                  }
                }
              } else {
                break L8;
              }
            }
          } else {
            if (var3 == 0) {
              break L8;
            } else {
              if (q.field_b[((gf) this).field_n + 1][1 + ((gf) this).field_p].field_a) {
                ((gf) this).field_b = ((gf) this).field_b + 1;
                if (150 >= ((gf) this).field_b) {
                  break L8;
                } else {
                  if (50.0 <= Math.random() * 100.0) {
                    break L8;
                  } else {
                    if (((gf) this).field_n >= 30) {
                      break L8;
                    } else {
                      L9: {
                        stackOut_30_0 = 1;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (q.field_b[((gf) this).field_n + 1][1 + ((gf) this).field_p].field_b) {
                          stackOut_32_0 = stackIn_32_0;
                          stackOut_32_1 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          break L9;
                        } else {
                          stackOut_31_0 = stackIn_31_0;
                          stackOut_31_1 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          break L9;
                        }
                      }
                      if (stackIn_33_0 != stackIn_33_1) {
                        break L8;
                      } else {
                        q.field_b[1 + ((gf) this).field_n][((gf) this).field_p - -1].field_a = false;
                        uf.field_p[jf.b((byte) 95)] = new gf(((gf) this).field_n - -1, ((gf) this).field_p - -1, 8);
                        break L8;
                      }
                    }
                  }
                }
              } else {
                break L8;
              }
            }
          }
        }
        L10: {
          if (q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_a) {
            ((gf) this).field_b = ((gf) this).field_b + 1;
            if (((gf) this).field_b > 150) {
              if (50.0 > Math.random() * 100.0) {
                if (((gf) this).field_n > 1) {
                  if (q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_b) {
                    break L10;
                  } else {
                    q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_a = false;
                    uf.field_p[jf.b((byte) 63)] = new gf(((gf) this).field_n - 1, ((gf) this).field_p, 8);
                    break L10;
                  }
                } else {
                  break L10;
                }
              } else {
                break L10;
              }
            } else {
              break L10;
            }
          } else {
            if (var3 == 0) {
              break L10;
            } else {
              if (!q.field_b[((gf) this).field_n + -1][((gf) this).field_p + 1].field_a) {
                break L10;
              } else {
                ((gf) this).field_b = ((gf) this).field_b + 1;
                if (150 < ((gf) this).field_b) {
                  if (50.0 <= Math.random() * 100.0) {
                    break L10;
                  } else {
                    if (((gf) this).field_n >= 30) {
                      break L10;
                    } else {
                      if (q.field_b[((gf) this).field_n + -1][1 + ((gf) this).field_p].field_b) {
                        break L10;
                      } else {
                        q.field_b[((gf) this).field_n - 1][1 + ((gf) this).field_p].field_a = false;
                        uf.field_p[jf.b((byte) 111)] = new gf(-1 + ((gf) this).field_n, 1 + ((gf) this).field_p, 8);
                        break L10;
                      }
                    }
                  }
                } else {
                  break L10;
                }
              }
            }
          }
        }
        L11: {
          if (((gf) this).field_b <= 150) {
            break L11;
          } else {
            L12: {
              if (!q.field_b[((gf) this).field_n][((gf) this).field_p + 1].field_a) {
                if (((gf) this).field_k > 20) {
                  ((gf) this).field_k = ((gf) this).field_k - 10;
                  break L12;
                } else {
                  if (((gf) this).field_k < -20) {
                    ((gf) this).field_k = ((gf) this).field_k + 10;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              } else {
                break L12;
              }
            }
            ((gf) this).field_b = ((gf) this).field_b - 150;
            break L11;
          }
        }
        L13: {
          int fieldTemp$2 = ((gf) this).field_o;
          ((gf) this).field_o = ((gf) this).field_o + 1;
          if (fieldTemp$2 > 600) {
            if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_i < 120) {
              var4 = 0;
              var5 = 0;
              L14: while (true) {
                L15: {
                  if (var5 >= uf.field_p.length) {
                    break L15;
                  } else {
                    L16: {
                      if (null == uf.field_p[var5]) {
                        break L16;
                      } else {
                        if (10 != uf.field_p[var5].field_h) {
                          break L16;
                        } else {
                          var6 = uf.field_p[var5].field_n - ((gf) this).field_n;
                          var7 = uf.field_p[var5].field_p - ((gf) this).field_p;
                          if (var6 * var6 - -(var7 * var7) >= 36) {
                            break L16;
                          } else {
                            uf.field_p[var5].field_n = ((gf) this).field_n;
                            var4 = 1;
                            uf.field_p[var5].field_p = ((gf) this).field_p;
                            break L15;
                          }
                        }
                      }
                    }
                    var5++;
                    continue L14;
                  }
                }
                L17: {
                  if (var4 == 0) {
                    uf.field_p[jf.b((byte) 93)] = new gf(((gf) this).field_n, ((gf) this).field_p, 10);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                ((gf) this).field_o = 0;
                break L13;
              }
            } else {
              break L13;
            }
          } else {
            break L13;
          }
        }
        L18: {
          var4 = 40;
          var5 = 2;
          if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 2)) {
            stackOut_84_0 = 0;
            stackIn_85_0 = stackOut_84_0;
            break L18;
          } else {
            stackOut_83_0 = 1;
            stackIn_85_0 = stackOut_83_0;
            break L18;
          }
        }
        L19: {
          var6 = stackIn_85_0;
          if (var6 == 0) {
            var4 = 6;
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          if (!je.c(((gf) this).field_n, ((gf) this).field_p + -1, 1, 1)) {
            stackOut_90_0 = 0;
            stackIn_91_0 = stackOut_90_0;
            break L20;
          } else {
            stackOut_89_0 = 1;
            stackIn_91_0 = stackOut_89_0;
            break L20;
          }
        }
        L21: {
          var7 = stackIn_91_0;
          if (var2 == 0) {
            L22: {
              if (0 == ((gf) this).field_g) {
                L23: {
                  if (((gf) this).field_i < 10) {
                    ((gf) this).field_i = ((gf) this).field_i + var5;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (q.field_b[((gf) this).field_n + 1][((gf) this).field_p].field_a) {
                    break L24;
                  } else {
                    if (q.field_b[1 + ((gf) this).field_n][((gf) this).field_p].field_b) {
                      break L24;
                    } else {
                      break L22;
                    }
                  }
                }
                ((gf) this).field_g = 1;
                break L22;
              } else {
                L25: {
                  if (-10 < ((gf) this).field_i) {
                    ((gf) this).field_i = ((gf) this).field_i - var5;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].field_a) {
                    break L26;
                  } else {
                    if (!q.field_b[((gf) this).field_n + -1][((gf) this).field_p].field_b) {
                      break L22;
                    } else {
                      break L26;
                    }
                  }
                }
                ((gf) this).field_g = 0;
                break L22;
              }
            }
            if (var6 == 0) {
              break L21;
            } else {
              var8 = Math.sin((double)(100 * ((gf) this).field_c));
              if (0.0 < var8) {
                L27: {
                  if (-var4 < ((gf) this).field_m) {
                    ((gf) this).field_m = ((gf) this).field_m - 1;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                if (var7 == 0) {
                  ((gf) this).field_m = 0;
                  break L21;
                } else {
                  break L21;
                }
              } else {
                if (~var4 >= ~((gf) this).field_m) {
                  break L21;
                } else {
                  ((gf) this).field_m = ((gf) this).field_m + 1;
                  break L21;
                }
              }
            }
          } else {
            L28: {
              L29: {
                if (-1 + ((gf) this).field_p <= hf.field_t) {
                  break L29;
                } else {
                  if (var6 != 0) {
                    break L29;
                  } else {
                    stackOut_94_0 = 1;
                    stackIn_96_0 = stackOut_94_0;
                    break L28;
                  }
                }
              }
              stackOut_95_0 = 0;
              stackIn_96_0 = stackOut_95_0;
              break L28;
            }
            L30: {
              var8_int = stackIn_96_0;
              if (3 <= Math.abs(ca.field_k + -((gf) this).field_n)) {
                stackOut_98_0 = 0;
                stackIn_99_0 = stackOut_98_0;
                break L30;
              } else {
                stackOut_97_0 = 1;
                stackIn_99_0 = stackOut_97_0;
                break L30;
              }
            }
            L31: {
              var9 = stackIn_99_0;
              if (Math.abs(ca.field_k + -((gf) this).field_n) < 5) {
                stackOut_101_0 = 0;
                stackIn_102_0 = stackOut_101_0;
                break L31;
              } else {
                stackOut_100_0 = 1;
                stackIn_102_0 = stackOut_100_0;
                break L31;
              }
            }
            L32: {
              var10 = stackIn_102_0;
              if (~ca.field_k >= ~((gf) this).field_n) {
                break L32;
              } else {
                if (((gf) this).field_i >= var4) {
                  break L32;
                } else {
                  if (var8_int == 0) {
                    ((gf) this).field_i = ((gf) this).field_i + var5;
                    break L32;
                  } else {
                    if (var9 != 0) {
                      ((gf) this).field_i = ((gf) this).field_i - var5;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
              }
            }
            L33: {
              if (~((gf) this).field_n >= ~ca.field_k) {
                break L33;
              } else {
                if (~((gf) this).field_i >= ~-var4) {
                  break L33;
                } else {
                  if (var8_int != 0) {
                    if (var9 != 0) {
                      ((gf) this).field_i = ((gf) this).field_i + var5;
                      break L33;
                    } else {
                      break L33;
                    }
                  } else {
                    ((gf) this).field_i = ((gf) this).field_i - var5;
                    break L33;
                  }
                }
              }
            }
            L34: {
              if (var8_int == 0) {
                break L34;
              } else {
                if (((gf) this).field_i == 0) {
                  L35: {
                    if (var10 != 0) {
                      L36: {
                        if (~((gf) this).field_n >= ~ca.field_k) {
                          break L36;
                        } else {
                          if (-var4 >= ((gf) this).field_i) {
                            break L36;
                          } else {
                            ((gf) this).field_i = ((gf) this).field_i - var5;
                            break L36;
                          }
                        }
                      }
                      if (ca.field_k <= ((gf) this).field_n) {
                        break L35;
                      } else {
                        if (~((gf) this).field_i > ~var4) {
                          ((gf) this).field_i = ((gf) this).field_i + var5;
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    } else {
                      break L35;
                    }
                  }
                  if (var9 != 0) {
                    L37: {
                      if (ca.field_k >= ((gf) this).field_n) {
                        break L37;
                      } else {
                        if (~((gf) this).field_i <= ~var4) {
                          break L37;
                        } else {
                          ((gf) this).field_i = ((gf) this).field_i + var5;
                          break L37;
                        }
                      }
                    }
                    if (((gf) this).field_n >= ca.field_k) {
                      break L34;
                    } else {
                      if (~-var4 <= ~((gf) this).field_i) {
                        break L34;
                      } else {
                        ((gf) this).field_i = ((gf) this).field_i - var5;
                        break L34;
                      }
                    }
                  } else {
                    break L34;
                  }
                } else {
                  break L34;
                }
              }
            }
            L38: {
              if (-var4 > ((gf) this).field_i) {
                ((gf) this).field_i = -var4;
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (var4 >= ((gf) this).field_i) {
                break L39;
              } else {
                ((gf) this).field_i = var4;
                break L39;
              }
            }
            L40: {
              if (~hf.field_t <= ~((gf) this).field_p) {
                break L40;
              } else {
                if (var6 == 0) {
                  break L40;
                } else {
                  if (((gf) this).field_m <= -var4) {
                    break L40;
                  } else {
                    ((gf) this).field_m = ((gf) this).field_m - 1;
                    if (var7 == 0) {
                      L41: {
                        if (-hf.field_t + ((gf) this).field_p > 2) {
                          break L41;
                        } else {
                          if (Math.abs(ca.field_k - ((gf) this).field_n) > 3) {
                            break L41;
                          } else {
                            ((gf) this).field_m = 3 * -var4 / 2;
                            break L40;
                          }
                        }
                      }
                      ((gf) this).field_m = 0;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                }
              }
            }
            L42: {
              if (~((gf) this).field_m > ~(-var4 * 4)) {
                ((gf) this).field_m = 4 * -var4;
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              if (hf.field_t <= ((gf) this).field_p) {
                break L43;
              } else {
                if (var6 == 0) {
                  break L43;
                } else {
                  if (var4 > ((gf) this).field_m) {
                    ((gf) this).field_m = ((gf) this).field_m + 1;
                    break L43;
                  } else {
                    break L43;
                  }
                }
              }
            }
            L44: {
              if (!sc.field_b) {
                break L44;
              } else {
                if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
                  break L44;
                } else {
                  ag.a(true, 32, ((gf) this).field_p * 32, 32 * ((gf) this).field_n);
                  break L44;
                }
              }
            }
            L45: {
              if (((gf) this).field_n != ca.field_k) {
                break L45;
              } else {
                if (hf.field_t != ((gf) this).field_p) {
                  break L45;
                } else {
                  int discarded$3 = -31391;
                  if (il.e()) {
                    break L45;
                  } else {
                    rj.a((byte) -38, 10);
                    break L21;
                  }
                }
              }
            }
            break L21;
          }
        }
        L46: {
          L47: {
            if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_a) {
              break L47;
            } else {
              if (je.field_O.b(((gf) this).field_n, ((gf) this).field_p, (byte) 120)) {
                break L47;
              } else {
                break L46;
              }
            }
          }
          hn.field_c = true;
          ((gf) this).field_h = 16;
          ((gf) this).field_b = 250;
          ((gf) this).field_g = 0;
          break L46;
        }
    }

    public static void a(int param0) {
        if (param0 >= -90) {
            return;
        }
        field_a = null;
    }

    final gf d(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gf var8_ref_gf = null;
        int var9 = 0;
        je var9_ref_je = null;
        int var10 = 0;
        double var11_double = 0.0;
        int var11_int = 0;
        je var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gf stackIn_29_0 = null;
        gf stackIn_30_0 = null;
        gf stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_157_0 = 0;
        int stackIn_199_0 = 0;
        Object stackIn_206_0 = null;
        Object stackIn_207_0 = null;
        Object stackIn_208_0 = null;
        int stackIn_208_1 = 0;
        int stackIn_211_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_221_0 = 0;
        int stackIn_224_0 = 0;
        je stackIn_414_0 = null;
        je stackIn_415_0 = null;
        je stackIn_416_0 = null;
        int stackIn_416_1 = 0;
        gf stackIn_546_0 = null;
        gf stackIn_547_0 = null;
        gf stackIn_548_0 = null;
        int stackIn_548_1 = 0;
        gf stackOut_28_0 = null;
        gf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        gf stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_198_0 = 0;
        Object stackOut_205_0 = null;
        Object stackOut_207_0 = null;
        int stackOut_207_1 = 0;
        Object stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_210_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        je stackOut_413_0 = null;
        je stackOut_415_0 = null;
        int stackOut_415_1 = 0;
        je stackOut_414_0 = null;
        int stackOut_414_1 = 0;
        gf stackOut_545_0 = null;
        gf stackOut_547_0 = null;
        int stackOut_547_1 = 0;
        gf stackOut_546_0 = null;
        int stackOut_546_1 = 0;
        var16 = MinerDisturbance.field_ab;
        if (((gf) this).field_n >= 1) {
          if (31 > ((gf) this).field_n) {
            if (((gf) this).field_p >= 1) {
              if (je.field_t - 1 > ((gf) this).field_p) {
                L0: {
                  ((gf) this).field_l = ((gf) this).field_l + 1;
                  ((gf) this).field_c = ((gf) this).field_c + 1;
                  var2 = 0;
                  if (8 != ((gf) this).field_h) {
                    break L0;
                  } else {
                    ((gf) this).field_b = ((gf) this).field_b + 1;
                    if (((gf) this).field_b <= 5) {
                      break L0;
                    } else {
                      ((gf) this).field_g = ((gf) this).field_g + 1;
                      ((gf) this).field_b = 0;
                      if (3 >= ((gf) this).field_g) {
                        break L0;
                      } else {
                        return null;
                      }
                    }
                  }
                }
                L1: {
                  if (((gf) this).field_h != 11) {
                    break L1;
                  } else {
                    ((gf) this).field_b = 0;
                    var3 = 0;
                    L2: while (true) {
                      if (var3 != 0) {
                        L3: {
                          if (0 <= ((gf) this).field_g) {
                            ((gf) this).field_h = 6;
                            ((gf) this).field_b = 250;
                            break L3;
                          } else {
                            ((gf) this).field_b = 0;
                            ((gf) this).field_h = 8;
                            break L3;
                          }
                        }
                        ((gf) this).field_g = 0;
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            ((gf) this).field_n = ((gf) this).field_n + ((gf) this).field_i;
                            ((gf) this).field_b = ((gf) this).field_b + 1;
                            if (((gf) this).field_n <= 0) {
                              break L5;
                            } else {
                              if (((gf) this).field_n >= 31) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var3 = 1;
                          break L4;
                        }
                        L6: {
                          if (!je.field_I[((gf) this).field_n][((gf) this).field_p].field_a) {
                            break L6;
                          } else {
                            var3 = 1;
                            break L6;
                          }
                        }
                        L7: {
                          if (((gf) this).field_b <= 6) {
                            break L7;
                          } else {
                            var3 = 1;
                            break L7;
                          }
                        }
                        if (0 <= ((gf) this).field_g) {
                          var4 = 0;
                          L8: while (true) {
                            if (var4 >= 1000) {
                              continue L2;
                            } else {
                              L9: {
                                if (null == uf.field_p[var4]) {
                                  break L9;
                                } else {
                                  L10: {
                                    stackOut_28_0 = uf.field_p[var4];
                                    stackIn_30_0 = stackOut_28_0;
                                    stackIn_29_0 = stackOut_28_0;
                                    if (param0) {
                                      stackOut_30_0 = (gf) (Object) stackIn_30_0;
                                      stackOut_30_1 = 0;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      break L10;
                                    } else {
                                      stackOut_29_0 = (gf) (Object) stackIn_29_0;
                                      stackOut_29_1 = 1;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_31_1 = stackOut_29_1;
                                      break L10;
                                    }
                                  }
                                  if (((gf) (Object) stackIn_31_0).a(stackIn_31_1 != 0)) {
                                    if (~uf.field_p[var4].field_n > ~(((gf) this).field_n + -1)) {
                                      break L9;
                                    } else {
                                      if (((gf) this).field_p - 1 > uf.field_p[var4].field_p) {
                                        break L9;
                                      } else {
                                        if (uf.field_p[var4].field_n > 1 + ((gf) this).field_n) {
                                          break L9;
                                        } else {
                                          if (~(((gf) this).field_p - -1) <= ~uf.field_p[var4].field_p) {
                                            L11: {
                                              var3 = 1;
                                              if (uf.field_p[var4].field_h == 19) {
                                                hn.field_c = true;
                                                break L11;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            uf.field_p[var4].field_h = 6;
                                            uf.field_p[var4].field_b = 250;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var4++;
                              continue L8;
                            }
                          }
                        } else {
                          continue L2;
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (((gf) this).field_f < 0) {
                    break L12;
                  } else {
                    if (((gf) this).field_m >= 0) {
                      L13: {
                        if (!q.field_b[((gf) this).field_n][((gf) this).field_p + 1].g()) {
                          break L13;
                        } else {
                          var2 = 1;
                          break L13;
                        }
                      }
                      L14: {
                        if (-80 <= ((gf) this).field_k) {
                          break L14;
                        } else {
                          if (!q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p + 1].g()) {
                            break L14;
                          } else {
                            var2 = 1;
                            break L14;
                          }
                        }
                      }
                      if (((gf) this).field_k <= 80) {
                        break L12;
                      } else {
                        if (q.field_b[((gf) this).field_n + 1][((gf) this).field_p + 1].g()) {
                          var2 = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
                L15: {
                  L16: {
                    int discarded$7 = 0;
                    var3 = ne.a();
                    if (this.a((byte) 122)) {
                      break L16;
                    } else {
                      if (((gf) this).field_h < 12) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  if (((gf) this).field_h >= 15) {
                    break L15;
                  } else {
                    L17: {
                      if (12 > ((gf) this).field_h) {
                        break L17;
                      } else {
                        if (15 == ((gf) this).field_h) {
                          break L17;
                        } else {
                          if (!ni.a(13, 11764)) {
                            var4 = -((gf) this).field_n + ca.field_k;
                            var5 = -((gf) this).field_p + hf.field_t;
                            if (var4 * var4 + var5 * var5 < 25) {
                              ag.a(true, 13, 32 * ((gf) this).field_p, ((gf) this).field_n * 32);
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                    if (~((gf) this).field_n != ~ca.field_k) {
                      break L15;
                    } else {
                      if (~hf.field_t != ~((gf) this).field_p) {
                        break L15;
                      } else {
                        cl.field_I = 0;
                        if (!this.a((byte) 125)) {
                          L18: {
                            qf.field_p = qf.field_p + 1;
                            if (!ke.field_V) {
                              break L18;
                            } else {
                              if (qf.field_p == 5) {
                                fn.a(9, 246, 3);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                          }
                          L19: {
                            ((gf) this).field_h = 4;
                            if (cm.field_o != 1) {
                              stackOut_156_0 = 0;
                              stackIn_157_0 = stackOut_156_0;
                              break L19;
                            } else {
                              stackOut_155_0 = 1;
                              stackIn_157_0 = stackOut_155_0;
                              break L19;
                            }
                          }
                          var4 = stackIn_157_0;
                          var5 = 0;
                          L20: while (true) {
                            if (var5 >= 21) {
                              return (gf) this;
                            } else {
                              L21: {
                                L22: {
                                  if (var4 != 0) {
                                    break L22;
                                  } else {
                                    if (fd.field_mb[var5]) {
                                      break L21;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                if (var5 == 10) {
                                  break L21;
                                } else {
                                  if (12 == var5) {
                                    break L21;
                                  } else {
                                    if (var5 == 13) {
                                      break L21;
                                    } else {
                                      L23: {
                                        if (var5 != 1) {
                                          break L23;
                                        } else {
                                          if (!qe.field_b[0]) {
                                            break L21;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      L24: {
                                        if (var5 != 19) {
                                          break L24;
                                        } else {
                                          if (!qe.field_b[2]) {
                                            break L21;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                      L25: {
                                        if (var5 != 0) {
                                          break L25;
                                        } else {
                                          if (!qe.field_b[1]) {
                                            break L25;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      L26: {
                                        if (var5 != 2) {
                                          break L26;
                                        } else {
                                          if (qe.field_b[19]) {
                                            break L21;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      if (qe.field_b[var5]) {
                                        break L21;
                                      } else {
                                        if (100.0 * Math.random() >= 25.0) {
                                          break L21;
                                        } else {
                                          qe.field_b[var5] = true;
                                          bf.field_d = 0;
                                          ch.field_h = -var5 * 3 + -3;
                                          pa.field_c = var5;
                                          return null;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var5++;
                              continue L20;
                            }
                          }
                        } else {
                          L27: {
                            if (ch.field_h < -1) {
                              break L27;
                            } else {
                              ch.field_h = ((gf) this).field_h;
                              break L27;
                            }
                          }
                          L28: {
                            var4 = 0;
                            if (0 == ((gf) this).field_h) {
                              ne.a(12, 91);
                              var4 = var3 * 100;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                          L29: {
                            if (((gf) this).field_h == 1) {
                              var4 = 250 * var3;
                              ne.a(13, -124);
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          L30: {
                            if (2 != ((gf) this).field_h) {
                              break L30;
                            } else {
                              var4 = 500 * var3;
                              ne.a(14, -77);
                              break L30;
                            }
                          }
                          L31: {
                            if (((gf) this).field_h == 3) {
                              ne.a(15, 98);
                              var4 = var3 * 750;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                          L32: {
                            if (((gf) this).field_h == 4) {
                              var4 = var3 * 2500;
                              ne.a(16, -69);
                              break L32;
                            } else {
                              break L32;
                            }
                          }
                          L33: {
                            if (((gf) this).field_h == 5) {
                              ne.a(61, -69);
                              var4 = var3 * 1000;
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            if (!ke.field_V) {
                              break L34;
                            } else {
                              L35: {
                                if (tc.field_s > 0) {
                                  eb.field_b = eb.field_b + var4;
                                  if (eb.field_b <= 100000) {
                                    break L35;
                                  } else {
                                    if (cm.field_o != 1) {
                                      break L35;
                                    } else {
                                      fn.a(19, 236, 3);
                                      break L35;
                                    }
                                  }
                                } else {
                                  break L35;
                                }
                              }
                              L36: {
                                if (!hn.field_c) {
                                  eb.field_e = eb.field_e + var4;
                                  if (eb.field_e <= 100000) {
                                    break L36;
                                  } else {
                                    if (1 == cm.field_o) {
                                      fn.a(21, 234, 3);
                                      break L36;
                                    } else {
                                      break L36;
                                    }
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                a.field_c = a.field_c + var4;
                                if (6 == var3) {
                                  break L37;
                                } else {
                                  if (3 == var3) {
                                    break L37;
                                  } else {
                                    if (var3 == 2) {
                                      break L37;
                                    } else {
                                      if (1 != var3) {
                                        break L34;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = var4;
                              var6 = rg.field_sb % 3;
                              if (var6 != 0) {
                                if (1 == var6) {
                                  vh.field_g = vh.field_g - var5;
                                  break L34;
                                } else {
                                  var7 = var5 / 3;
                                  di.field_X = di.field_X + var7;
                                  vh.field_g = vh.field_g - (var5 - var7);
                                  break L34;
                                }
                              } else {
                                di.field_X = di.field_X + var5;
                                break L34;
                              }
                            }
                          }
                          L38: {
                            L39: {
                              if (((gf) this).field_h < 0) {
                                break L39;
                              } else {
                                if (5 < ((gf) this).field_h) {
                                  break L39;
                                } else {
                                  L40: {
                                    if (ke.field_V) {
                                      nm.field_g[((gf) this).field_h] = nm.field_g[((gf) this).field_h] + 1;
                                      break L40;
                                    } else {
                                      break L40;
                                    }
                                  }
                                  L41: {
                                    if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                                      break L41;
                                    } else {
                                      vi.field_q = vi.field_q + 1;
                                      if (vi.field_q != 25) {
                                        break L41;
                                      } else {
                                        if (!ke.field_V) {
                                          break L41;
                                        } else {
                                          fn.a(11, 244, 3);
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                  L42: {
                                    if (!ke.field_V) {
                                      break L42;
                                    } else {
                                      if (25 != nm.field_g[((gf) this).field_h]) {
                                        break L42;
                                      } else {
                                        if (0 != ((gf) this).field_h) {
                                          break L42;
                                        } else {
                                          fn.a(4, 251, 3);
                                          break L42;
                                        }
                                      }
                                    }
                                  }
                                  L43: {
                                    if (!ke.field_V) {
                                      break L43;
                                    } else {
                                      if (nm.field_g[((gf) this).field_h] != 25) {
                                        break L43;
                                      } else {
                                        if (((gf) this).field_h != 1) {
                                          break L43;
                                        } else {
                                          fn.a(5, 250, 3);
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                  L44: {
                                    if (!ke.field_V) {
                                      break L44;
                                    } else {
                                      if (nm.field_g[((gf) this).field_h] != 25) {
                                        break L44;
                                      } else {
                                        if (((gf) this).field_h != 2) {
                                          break L44;
                                        } else {
                                          fn.a(6, 249, 3);
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                  L45: {
                                    if (!ke.field_V) {
                                      break L45;
                                    } else {
                                      if (nm.field_g[((gf) this).field_h] != 25) {
                                        break L45;
                                      } else {
                                        if (3 != ((gf) this).field_h) {
                                          break L45;
                                        } else {
                                          fn.a(7, 248, 3);
                                          break L45;
                                        }
                                      }
                                    }
                                  }
                                  L46: {
                                    if (!ke.field_V) {
                                      break L46;
                                    } else {
                                      if (nm.field_g[((gf) this).field_h] != 25) {
                                        break L46;
                                      } else {
                                        if (((gf) this).field_h == 5) {
                                          fn.a(18, 237, 3);
                                          break L46;
                                        } else {
                                          break L46;
                                        }
                                      }
                                    }
                                  }
                                  if (!ke.field_V) {
                                    break L39;
                                  } else {
                                    if (10 != nm.field_g[((gf) this).field_h]) {
                                      break L39;
                                    } else {
                                      if (((gf) this).field_h == 4) {
                                        fn.a(8, 247, 3);
                                        break L39;
                                      } else {
                                        break L38;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            break L38;
                          }
                          return null;
                        }
                      }
                    }
                  }
                }
                L47: {
                  if (param0) {
                    break L47;
                  } else {
                    boolean discarded$8 = this.a((byte) -116);
                    break L47;
                  }
                }
                L48: {
                  if (var2 != 0) {
                    L49: {
                      if (((gf) this).field_i > 0) {
                        ((gf) this).field_i = ((gf) this).field_i - 1;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    if (((gf) this).field_i >= 0) {
                      break L48;
                    } else {
                      ((gf) this).field_i = ((gf) this).field_i + 1;
                      break L48;
                    }
                  } else {
                    break L48;
                  }
                }
                L50: {
                  if (((gf) this).field_h == 9) {
                    this.a(21161, var2 != 0);
                    break L50;
                  } else {
                    if (((gf) this).field_h == 19) {
                      int discarded$9 = 1;
                      this.c();
                      break L50;
                    } else {
                      if (((gf) this).field_h != 21) {
                        break L50;
                      } else {
                        L51: {
                          L52: {
                            var4 = (hf.field_t - ((gf) this).field_p) * (hf.field_t - ((gf) this).field_p) + (-((gf) this).field_n + ca.field_k) * (ca.field_k - ((gf) this).field_n);
                            if (120 >= q.field_b[((gf) this).field_n][((gf) this).field_p].field_i) {
                              break L52;
                            } else {
                              if (25 <= var4) {
                                break L52;
                              } else {
                                stackOut_197_0 = 1;
                                stackIn_199_0 = stackOut_197_0;
                                break L51;
                              }
                            }
                          }
                          stackOut_198_0 = 0;
                          stackIn_199_0 = stackOut_198_0;
                          break L51;
                        }
                        L53: {
                          var5 = stackIn_199_0;
                          if (((gf) this).field_l > 32) {
                            L54: {
                              if (var5 != 0) {
                                ne.a(ll.a((byte) -73, 4) + 37, -96);
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            ((gf) this).field_l = -10;
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        L55: {
                          stackOut_205_0 = this;
                          stackIn_207_0 = stackOut_205_0;
                          stackIn_206_0 = stackOut_205_0;
                          if (var5 == 0) {
                            stackOut_207_0 = this;
                            stackOut_207_1 = 0;
                            stackIn_208_0 = stackOut_207_0;
                            stackIn_208_1 = stackOut_207_1;
                            break L55;
                          } else {
                            stackOut_206_0 = this;
                            stackOut_206_1 = 1;
                            stackIn_208_0 = stackOut_206_0;
                            stackIn_208_1 = stackOut_206_1;
                            break L55;
                          }
                        }
                        L56: {
                          ((gf) this).field_e = stackIn_208_1 != 0;
                          var6 = 40;
                          var7 = 4;
                          if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 2)) {
                            stackOut_210_0 = 0;
                            stackIn_211_0 = stackOut_210_0;
                            break L56;
                          } else {
                            stackOut_209_0 = 1;
                            stackIn_211_0 = stackOut_209_0;
                            break L56;
                          }
                        }
                        L57: {
                          var8 = stackIn_211_0;
                          if (!je.c(((gf) this).field_n, ((gf) this).field_p + -1, 1, 1)) {
                            stackOut_213_0 = 0;
                            stackIn_214_0 = stackOut_213_0;
                            break L57;
                          } else {
                            stackOut_212_0 = 1;
                            stackIn_214_0 = stackOut_212_0;
                            break L57;
                          }
                        }
                        L58: {
                          var9 = stackIn_214_0;
                          if (var8 != 0) {
                            break L58;
                          } else {
                            var6 = 6;
                            break L58;
                          }
                        }
                        L59: {
                          if (var5 == 0) {
                            L60: {
                              var10 = 4 * (((gf) this).field_k - -160) / 320 + (((gf) this).field_n << 2);
                              if (((gf) this).field_g != 0) {
                                if (!je.i(var10, ((gf) this).field_p << 2)) {
                                  if (-10 < ((gf) this).field_i) {
                                    ((gf) this).field_i = ((gf) this).field_i - var7;
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                } else {
                                  ((gf) this).field_g = 0;
                                  break L60;
                                }
                              } else {
                                if (je.i(var10, ((gf) this).field_p << 2)) {
                                  ((gf) this).field_g = 1;
                                  break L60;
                                } else {
                                  if (((gf) this).field_i < 10) {
                                    ((gf) this).field_i = ((gf) this).field_i + var7;
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                }
                              }
                            }
                            if (var8 != 0) {
                              var11_double = Math.sin((double)(100 * ((gf) this).field_c));
                              if (0.0 >= var11_double) {
                                if (~((gf) this).field_m <= ~var6) {
                                  break L59;
                                } else {
                                  ((gf) this).field_m = ((gf) this).field_m + 1;
                                  break L59;
                                }
                              } else {
                                L61: {
                                  if (~-var6 > ~((gf) this).field_m) {
                                    ((gf) this).field_m = ((gf) this).field_m - 1;
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                                if (var9 != 0) {
                                  break L59;
                                } else {
                                  ((gf) this).field_m = 0;
                                  break L59;
                                }
                              }
                            } else {
                              break L59;
                            }
                          } else {
                            L62: {
                              L63: {
                                if (-1 + ((gf) this).field_p <= hf.field_t) {
                                  break L63;
                                } else {
                                  if (var8 != 0) {
                                    break L63;
                                  } else {
                                    stackOut_219_0 = 1;
                                    stackIn_221_0 = stackOut_219_0;
                                    break L62;
                                  }
                                }
                              }
                              stackOut_220_0 = 0;
                              stackIn_221_0 = stackOut_220_0;
                              break L62;
                            }
                            L64: {
                              var10 = stackIn_221_0;
                              if (Math.abs(ca.field_k - ((gf) this).field_n) > 4) {
                                stackOut_223_0 = 0;
                                stackIn_224_0 = stackOut_223_0;
                                break L64;
                              } else {
                                stackOut_222_0 = 1;
                                stackIn_224_0 = stackOut_222_0;
                                break L64;
                              }
                            }
                            L65: {
                              var11_int = stackIn_224_0;
                              if (~((gf) this).field_n <= ~ca.field_k) {
                                break L65;
                              } else {
                                if (((gf) this).field_i < var6) {
                                  L66: {
                                    if (var10 != 0) {
                                      break L66;
                                    } else {
                                      if (var11_int != 0) {
                                        break L66;
                                      } else {
                                        break L65;
                                      }
                                    }
                                  }
                                  ((gf) this).field_i = ((gf) this).field_i - var7;
                                  break L65;
                                } else {
                                  break L65;
                                }
                              }
                            }
                            L67: {
                              if (ca.field_k >= ((gf) this).field_n) {
                                break L67;
                              } else {
                                if (~-var6 <= ~((gf) this).field_i) {
                                  break L67;
                                } else {
                                  L68: {
                                    if (var10 != 0) {
                                      break L68;
                                    } else {
                                      if (var11_int == 0) {
                                        break L67;
                                      } else {
                                        break L68;
                                      }
                                    }
                                  }
                                  ((gf) this).field_i = ((gf) this).field_i + var7;
                                  break L67;
                                }
                              }
                            }
                            L69: {
                              if (((gf) this).field_i >= -var6) {
                                break L69;
                              } else {
                                ((gf) this).field_i = -var6;
                                break L69;
                              }
                            }
                            L70: {
                              if (~var6 > ~((gf) this).field_i) {
                                ((gf) this).field_i = var6;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                            L71: {
                              L72: {
                                if (~((gf) this).field_p >= ~hf.field_t) {
                                  break L72;
                                } else {
                                  if (var8 == 0) {
                                    break L72;
                                  } else {
                                    if (((gf) this).field_m >= var6) {
                                      break L72;
                                    } else {
                                      ((gf) this).field_m = ((gf) this).field_m + 1;
                                      break L71;
                                    }
                                  }
                                }
                              }
                              if (~((gf) this).field_p <= ~hf.field_t) {
                                break L71;
                              } else {
                                if (var8 == 0) {
                                  break L71;
                                } else {
                                  if (((gf) this).field_m > -var6) {
                                    ((gf) this).field_m = ((gf) this).field_m - 1;
                                    break L71;
                                  } else {
                                    break L71;
                                  }
                                }
                              }
                            }
                            L73: {
                              if (-var6 * 4 > ((gf) this).field_m) {
                                ((gf) this).field_m = 4 * -var6;
                                break L73;
                              } else {
                                break L73;
                              }
                            }
                            L74: {
                              if (~ca.field_k != ~((gf) this).field_n) {
                                break L74;
                              } else {
                                if (~((gf) this).field_p != ~hf.field_t) {
                                  break L74;
                                } else {
                                  L75: {
                                    fn.a(23, 232, 3);
                                    var12 = 1000 * var3;
                                    a.field_c = a.field_c + var12;
                                    var13 = var12;
                                    var14 = rg.field_sb % 3;
                                    if (0 == var14) {
                                      di.field_X = di.field_X + var13;
                                      break L75;
                                    } else {
                                      if (var14 == 1) {
                                        vh.field_g = vh.field_g - var13;
                                        break L75;
                                      } else {
                                        var15 = var13 / 3;
                                        vh.field_g = vh.field_g - (var13 + -var15);
                                        di.field_X = di.field_X + var15;
                                        break L75;
                                      }
                                    }
                                  }
                                  ne.a(ll.a((byte) -73, 4) + 37, 122);
                                  return null;
                                }
                              }
                            }
                            break L59;
                          }
                        }
                        if (!q.field_b[((gf) this).field_n][((gf) this).field_p].field_a) {
                          if (!je.field_O.b(((gf) this).field_n, ((gf) this).field_p, (byte) 15)) {
                            break L50;
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                L76: {
                  if (((gf) this).field_h == 17) {
                    ((gf) this).field_b = ((gf) this).field_b + 1;
                    if (((gf) this).field_b > 250) {
                      L77: {
                        ((gf) this).field_g = 0;
                        ((gf) this).field_h = 8;
                        ((gf) this).field_b = 0;
                        if (sc.field_b) {
                          ag.a(true, 11, ((gf) this).field_p * 32, 32 * ((gf) this).field_n);
                          break L77;
                        } else {
                          break L77;
                        }
                      }
                      return (gf) this;
                    } else {
                      if (((gf) this).field_g < 1) {
                        break L76;
                      } else {
                        if (((gf) this).field_b > 5) {
                          ((gf) this).field_g = ((gf) this).field_g + 1;
                          ((gf) this).field_b = 0;
                          if (((gf) this).field_g <= 5) {
                            break L76;
                          } else {
                            return null;
                          }
                        } else {
                          break L76;
                        }
                      }
                    }
                  } else {
                    break L76;
                  }
                }
                L78: {
                  L79: {
                    if (6 == ((gf) this).field_h) {
                      break L79;
                    } else {
                      if (7 == ((gf) this).field_h) {
                        break L79;
                      } else {
                        if (((gf) this).field_h != 16) {
                          break L78;
                        } else {
                          break L79;
                        }
                      }
                    }
                  }
                  L80: {
                    ((gf) this).field_b = ((gf) this).field_b + 1;
                    if (!je.c(((gf) this).field_n, ((gf) this).field_p, 1, 3)) {
                      break L80;
                    } else {
                      L81: {
                        if (((gf) this).field_h == 6) {
                          break L81;
                        } else {
                          if (((gf) this).field_h != 17) {
                            break L80;
                          } else {
                            break L81;
                          }
                        }
                      }
                      if (250 < ((gf) this).field_b) {
                        ((gf) this).field_g = 0;
                        ((gf) this).field_h = 8;
                        ((gf) this).field_b = 0;
                        return (gf) this;
                      } else {
                        break L80;
                      }
                    }
                  }
                  L82: {
                    if (((gf) this).field_g != 0) {
                      break L82;
                    } else {
                      if (((gf) this).field_h != 6) {
                        break L82;
                      } else {
                        if (!je.c(((gf) this).field_n, ((gf) this).field_p, 3, 3)) {
                          break L82;
                        } else {
                          if (((gf) this).field_b < 250) {
                            ((gf) this).field_h = 17;
                            var4 = 0;
                            L83: while (true) {
                              if (var4 >= 1000) {
                                break L82;
                              } else {
                                L84: {
                                  if (null == uf.field_p[var4]) {
                                    break L84;
                                  } else {
                                    if ((Object) (Object) uf.field_p[var4] == this) {
                                      ge.a(var4, (byte) 85, true);
                                      break L82;
                                    } else {
                                      break L84;
                                    }
                                  }
                                }
                                var4++;
                                continue L83;
                              }
                            }
                          } else {
                            break L82;
                          }
                        }
                      }
                    }
                  }
                  L85: {
                    if (((gf) this).field_b >= 250) {
                      break L85;
                    } else {
                      if (je.field_O.b(((gf) this).field_n, ((gf) this).field_p, (byte) 80)) {
                        ((gf) this).field_b = 251;
                        break L85;
                      } else {
                        break L85;
                      }
                    }
                  }
                  L86: {
                    if (0 != ((gf) this).field_g) {
                      break L86;
                    } else {
                      if (((gf) this).field_b > 250) {
                        L87: {
                          ne.a(8, -74);
                          oe.field_b = true;
                          if (((gf) this).field_h == 16) {
                            ((gf) this).field_h = 6;
                            break L87;
                          } else {
                            break L87;
                          }
                        }
                        lj.field_r = lj.field_r + 25;
                        ((gf) this).field_b = 0;
                        ((gf) this).field_g = 1;
                        rg.field_sb = rg.field_sb - 40;
                        var4 = 0;
                        L88: while (true) {
                          if (var4 >= 1000) {
                            L89: {
                              var4 = 1;
                              if (an.field_d) {
                                var4 = 2;
                                break L89;
                              } else {
                                break L89;
                              }
                            }
                            var5 = -var4 + ((gf) this).field_n;
                            L90: while (true) {
                              if (var5 > ((gf) this).field_n + var4) {
                                L91: {
                                  var5 = -8 + 4 * ((gf) this).field_n;
                                  if (var5 >= 0) {
                                    break L91;
                                  } else {
                                    var5 = 0;
                                    break L91;
                                  }
                                }
                                L92: {
                                  var6 = 8 + (1 + ((gf) this).field_n) * 4;
                                  if (var6 <= 124) {
                                    break L92;
                                  } else {
                                    var6 = 124;
                                    break L92;
                                  }
                                }
                                L93: {
                                  var7 = -8 + 4 * ((gf) this).field_p;
                                  var8 = 4 * ((gf) this).field_p + 12;
                                  if (var7 >= 0) {
                                    break L93;
                                  } else {
                                    var7 = 0;
                                    break L93;
                                  }
                                }
                                L94: {
                                  if (4 * je.field_t - 4 >= var8) {
                                    break L94;
                                  } else {
                                    var8 = 4 * (je.field_t - 1);
                                    break L94;
                                  }
                                }
                                var9 = var5;
                                L95: while (true) {
                                  if (~var6 >= ~var9) {
                                    if (1 == cm.field_o) {
                                      var9 = var5;
                                      L96: while (true) {
                                        if (~var6 >= ~var9) {
                                          break L86;
                                        } else {
                                          var10 = var7;
                                          L97: while (true) {
                                            L98: {
                                              if (~var10 <= ~var8) {
                                                break L98;
                                              } else {
                                                if (je.field_O.a(var9, var10, (byte) 61)) {
                                                  lj.field_r = lj.field_r + 10;
                                                  je.field_O.a(false, (byte) 63, var9 >> 2, var10 >> 2);
                                                  break L98;
                                                } else {
                                                  var10++;
                                                  continue L97;
                                                }
                                              }
                                            }
                                            var9++;
                                            continue L96;
                                          }
                                        }
                                      }
                                    } else {
                                      break L86;
                                    }
                                  } else {
                                    var10 = var7;
                                    L99: while (true) {
                                      if (var10 >= var8) {
                                        var9++;
                                        continue L95;
                                      } else {
                                        L100: {
                                          if (!je.field_O.i(-120, var9, var10)) {
                                            break L100;
                                          } else {
                                            if (je.field_O.e(var9, var10, 2)) {
                                              break L100;
                                            } else {
                                              L101: {
                                                lj.field_r = lj.field_r + 25;
                                                if ((3 & var9) != 1) {
                                                  break L101;
                                                } else {
                                                  if (1 == (3 & var10)) {
                                                    rg.field_sb = rg.field_sb - 15;
                                                    var11_int = jf.b((byte) 114);
                                                    uf.field_p[var11_int] = new gf(var9 / 4, var10 / 4, 16);
                                                    uf.field_p[var11_int].field_g = 0;
                                                    uf.field_p[var11_int].field_b = 244;
                                                    break L101;
                                                  } else {
                                                    break L101;
                                                  }
                                                }
                                              }
                                              je.field_O.b(117, false, var9, var10);
                                              je.field_O.a(-122, var10, 0, var9);
                                              break L100;
                                            }
                                          }
                                        }
                                        var10++;
                                        continue L99;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var6 = ((gf) this).field_p - var4;
                                L102: while (true) {
                                  if (var4 + ((gf) this).field_p < var6) {
                                    var5++;
                                    continue L90;
                                  } else {
                                    L103: {
                                      if (~var5 != ~ca.field_k) {
                                        break L103;
                                      } else {
                                        if (~hf.field_t != ~var6) {
                                          break L103;
                                        } else {
                                          int discarded$10 = -31391;
                                          if (!il.e()) {
                                            L104: {
                                              int discarded$11 = 13;
                                              if (!rf.a()) {
                                                break L104;
                                              } else {
                                                int discarded$12 = -2302;
                                                if (!ca.c()) {
                                                  break L104;
                                                } else {
                                                  rj.a((byte) -38, 13);
                                                  break L103;
                                                }
                                              }
                                            }
                                            rj.a((byte) -38, 5);
                                            break L103;
                                          } else {
                                            break L103;
                                          }
                                        }
                                      }
                                    }
                                    L105: {
                                      var7 = -16 + var5;
                                      if (var7 < 0) {
                                        var7 = -var7;
                                        break L105;
                                      } else {
                                        break L105;
                                      }
                                    }
                                    L106: {
                                      if (var6 <= 0) {
                                        break L106;
                                      } else {
                                        if (0 >= var5) {
                                          break L106;
                                        } else {
                                          if (var5 >= 31) {
                                            break L106;
                                          } else {
                                            if (-1 + je.field_t <= var6) {
                                              break L106;
                                            } else {
                                              if (var6 > var7 / 2) {
                                                if (q.field_b[var5][var6].field_a) {
                                                  L107: {
                                                    var8 = 1;
                                                    if (!q.field_b[var5][var6].field_b) {
                                                      if (q.field_b[var5][var6].field_S) {
                                                        q.field_b[var5][var6].field_a = false;
                                                        break L107;
                                                      } else {
                                                        break L107;
                                                      }
                                                    } else {
                                                      var8 = 0;
                                                      q.field_b[var5][var6].field_b = false;
                                                      if (q.field_b[var5][var6].field_U == -1) {
                                                        break L107;
                                                      } else {
                                                        jc.field_H = jc.field_H + 1;
                                                        break L107;
                                                      }
                                                    }
                                                  }
                                                  L108: {
                                                    if (q.field_b[var5][var6].field_E) {
                                                      break L108;
                                                    } else {
                                                      if (!q.field_b[var5][var6].field_v) {
                                                        L109: {
                                                          stackOut_413_0 = q.field_b[var5][var6];
                                                          stackIn_415_0 = stackOut_413_0;
                                                          stackIn_414_0 = stackOut_413_0;
                                                          if (var8 == 0) {
                                                            stackOut_415_0 = (je) (Object) stackIn_415_0;
                                                            stackOut_415_1 = 0;
                                                            stackIn_416_0 = stackOut_415_0;
                                                            stackIn_416_1 = stackOut_415_1;
                                                            break L109;
                                                          } else {
                                                            stackOut_414_0 = (je) (Object) stackIn_414_0;
                                                            stackOut_414_1 = 1;
                                                            stackIn_416_0 = stackOut_414_0;
                                                            stackIn_416_1 = stackOut_414_1;
                                                            break L109;
                                                          }
                                                        }
                                                        stackIn_416_0.field_S = stackIn_416_1 != 0;
                                                        q.field_b[var5][var6].field_r = 1000;
                                                        break L106;
                                                      } else {
                                                        break L108;
                                                      }
                                                    }
                                                  }
                                                  q.field_b[var5][var6].field_a = false;
                                                  q.field_b[var5][var6].field_E = false;
                                                  q.field_b[var5][var6].field_v = false;
                                                  je.field_O.h(var5, 4, var6);
                                                  if (sc.field_b) {
                                                    ag.a(param0, 25, 32 * var6, var5 * 32);
                                                    break L106;
                                                  } else {
                                                    break L106;
                                                  }
                                                } else {
                                                  if (q.field_b[var5][var6].field_b) {
                                                    q.field_b[var5][var6].field_b = false;
                                                    if (q.field_b[var5][var6].field_U != -1) {
                                                      jc.field_H = jc.field_H + 1;
                                                      break L106;
                                                    } else {
                                                      break L106;
                                                    }
                                                  } else {
                                                    break L106;
                                                  }
                                                }
                                              } else {
                                                break L106;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L102;
                                  }
                                }
                              }
                            }
                          } else {
                            L110: {
                              if (null != uf.field_p[var4]) {
                                if (uf.field_p[var4].a(false)) {
                                  if (~(-1 + ((gf) this).field_n) < ~uf.field_p[var4].field_n) {
                                    break L110;
                                  } else {
                                    if (((gf) this).field_p + -1 > uf.field_p[var4].field_p) {
                                      break L110;
                                    } else {
                                      if (~uf.field_p[var4].field_n < ~(((gf) this).field_n + 1)) {
                                        break L110;
                                      } else {
                                        if (uf.field_p[var4].field_p <= ((gf) this).field_p - -1) {
                                          L111: {
                                            if (19 != uf.field_p[var4].field_h) {
                                              break L111;
                                            } else {
                                              hn.field_c = true;
                                              break L111;
                                            }
                                          }
                                          uf.field_p[var4].field_h = 16;
                                          uf.field_p[var4].field_b = 250;
                                          break L110;
                                        } else {
                                          break L110;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (7 == uf.field_p[var4].field_h) {
                                    if (uf.field_p[var4].field_n < ((gf) this).field_n + -1) {
                                      break L110;
                                    } else {
                                      if (uf.field_p[var4].field_p < -1 + ((gf) this).field_p) {
                                        break L110;
                                      } else {
                                        if (~uf.field_p[var4].field_n < ~(((gf) this).field_n + 1)) {
                                          break L110;
                                        } else {
                                          if (((gf) this).field_p + 1 >= uf.field_p[var4].field_p) {
                                            uf.field_p[var4].field_b = 250;
                                            ge.a(var4, (byte) 85, false);
                                            break L110;
                                          } else {
                                            break L110;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (uf.field_p[var4].field_h == 6) {
                                      if (uf.field_p[var4].field_n < -1 + ((gf) this).field_n) {
                                        break L110;
                                      } else {
                                        if (uf.field_p[var4].field_p < ((gf) this).field_p - 1) {
                                          break L110;
                                        } else {
                                          if (uf.field_p[var4].field_n > ((gf) this).field_n - -1) {
                                            break L110;
                                          } else {
                                            if (uf.field_p[var4].field_p <= ((gf) this).field_p + 1) {
                                              uf.field_p[var4].field_b = 250;
                                              ge.a(var4, (byte) 85, true);
                                              break L110;
                                            } else {
                                              break L110;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      if (uf.field_p[var4].field_h == 17) {
                                        if (uf.field_p[var4].field_n < ((gf) this).field_n + -1) {
                                          break L110;
                                        } else {
                                          if (uf.field_p[var4].field_p < ((gf) this).field_p - 1) {
                                            break L110;
                                          } else {
                                            if (~uf.field_p[var4].field_n < ~(((gf) this).field_n + 1)) {
                                              break L110;
                                            } else {
                                              if (uf.field_p[var4].field_p > 1 + ((gf) this).field_p) {
                                                break L110;
                                              } else {
                                                uf.field_p[var4].field_h = 6;
                                                uf.field_p[var4].field_b = 250;
                                                break L110;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L110;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L110;
                              }
                            }
                            var4++;
                            continue L88;
                          }
                        }
                      } else {
                        break L86;
                      }
                    }
                  }
                  if (((gf) this).field_g < 1) {
                    break L78;
                  } else {
                    if (((gf) this).field_b <= 5) {
                      break L78;
                    } else {
                      ((gf) this).field_g = ((gf) this).field_g + 1;
                      ((gf) this).field_b = 0;
                      if (((gf) this).field_g <= 5) {
                        break L78;
                      } else {
                        return null;
                      }
                    }
                  }
                }
                L112: {
                  if (((gf) this).field_h != 15) {
                    break L112;
                  } else {
                    L113: {
                      ((gf) this).field_b = ((gf) this).field_b + 1;
                      if (((gf) this).field_g != 0) {
                        break L113;
                      } else {
                        if (((gf) this).field_b > 250) {
                          ne.a(8, 109);
                          ((gf) this).field_b = 0;
                          ((gf) this).field_g = 1;
                          var4 = 2;
                          var5 = ((gf) this).field_n + -var4;
                          L114: while (true) {
                            if (var5 > var4 + ((gf) this).field_n) {
                              break L113;
                            } else {
                              var6 = ((gf) this).field_p + -var4;
                              L115: while (true) {
                                if (var6 > ((gf) this).field_p - -var4) {
                                  var5++;
                                  continue L114;
                                } else {
                                  L116: {
                                    var7 = -16 + var5;
                                    if (var7 < 0) {
                                      var7 = -var7;
                                      break L116;
                                    } else {
                                      break L116;
                                    }
                                  }
                                  L117: {
                                    if (var6 <= 0) {
                                      break L117;
                                    } else {
                                      if (var5 <= 0) {
                                        break L117;
                                      } else {
                                        if (31 <= var5) {
                                          break L117;
                                        } else {
                                          if (~var6 <= ~(je.field_t + -1)) {
                                            break L117;
                                          } else {
                                            if (var6 <= var7 / 2) {
                                              break L117;
                                            } else {
                                              je.field_O.h(var5, 4, var6);
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L115;
                                }
                              }
                            }
                          }
                        } else {
                          break L113;
                        }
                      }
                    }
                    if (((gf) this).field_g < 1) {
                      break L112;
                    } else {
                      if (((gf) this).field_b <= 5) {
                        break L112;
                      } else {
                        ((gf) this).field_g = ((gf) this).field_g + 1;
                        ((gf) this).field_b = 0;
                        if (((gf) this).field_g <= 5) {
                          break L112;
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                L118: {
                  if (((gf) this).field_h == 18) {
                    L119: {
                      ((gf) this).field_b = ((gf) this).field_b + 1;
                      if (0 != ((gf) this).field_g) {
                        break L119;
                      } else {
                        if (((gf) this).field_b > 250) {
                          ne.a(8, -115);
                          ((gf) this).field_g = 1;
                          ((gf) this).field_b = 0;
                          var4 = 2;
                          var5 = -var4 + ((gf) this).field_n;
                          L120: while (true) {
                            if (~(var4 + ((gf) this).field_n) > ~var5) {
                              break L119;
                            } else {
                              var6 = -var4 + ((gf) this).field_p;
                              L121: while (true) {
                                if (~var6 < ~(((gf) this).field_p - -var4)) {
                                  var5++;
                                  continue L120;
                                } else {
                                  L122: {
                                    var7 = var5 - 16;
                                    if (var7 < 0) {
                                      var7 = -var7;
                                      break L122;
                                    } else {
                                      break L122;
                                    }
                                  }
                                  L123: {
                                    if (0 >= var6) {
                                      break L123;
                                    } else {
                                      if (var5 <= 0) {
                                        break L123;
                                      } else {
                                        if (var5 >= 31) {
                                          break L123;
                                        } else {
                                          if (var6 >= -1 + je.field_t) {
                                            break L123;
                                          } else {
                                            if (~(var7 / 2) > ~var6) {
                                              je.field_O.c(var6, var5, (byte) -48);
                                              break L123;
                                            } else {
                                              break L123;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L121;
                                }
                              }
                            }
                          }
                        } else {
                          break L119;
                        }
                      }
                    }
                    if (((gf) this).field_g < 1) {
                      break L118;
                    } else {
                      if (5 < ((gf) this).field_b) {
                        ((gf) this).field_g = ((gf) this).field_g + 1;
                        ((gf) this).field_b = 0;
                        if (((gf) this).field_g <= 5) {
                          break L118;
                        } else {
                          return null;
                        }
                      } else {
                        break L118;
                      }
                    }
                  } else {
                    break L118;
                  }
                }
                L124: {
                  if (((gf) this).field_h == 22) {
                    L125: {
                      ((gf) this).field_b = ((gf) this).field_b + 1;
                      if (((gf) this).field_g != 0) {
                        break L125;
                      } else {
                        if (((gf) this).field_b > 250) {
                          ne.a(8, 120);
                          ((gf) this).field_g = 1;
                          ((gf) this).field_b = 0;
                          var4 = 2;
                          var5 = -var4 + ((gf) this).field_n;
                          L126: while (true) {
                            if (~var5 < ~(var4 + ((gf) this).field_n)) {
                              break L125;
                            } else {
                              var6 = ((gf) this).field_p - var4;
                              L127: while (true) {
                                if (((gf) this).field_p + var4 < var6) {
                                  var5++;
                                  continue L126;
                                } else {
                                  L128: {
                                    var7 = var5 - 16;
                                    if (var7 >= 0) {
                                      break L128;
                                    } else {
                                      var7 = -var7;
                                      break L128;
                                    }
                                  }
                                  L129: {
                                    if (var6 <= 0) {
                                      break L129;
                                    } else {
                                      if (0 >= var5) {
                                        break L129;
                                      } else {
                                        if (31 <= var5) {
                                          break L129;
                                        } else {
                                          if (je.field_t - 1 <= var6) {
                                            break L129;
                                          } else {
                                            if (var7 / 2 < var6) {
                                              je.field_O.d(var6, var5, -5);
                                              break L129;
                                            } else {
                                              break L129;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  q.field_b[var5][var6].field_b = false;
                                  q.field_b[var5][var6].field_a = false;
                                  var6++;
                                  continue L127;
                                }
                              }
                            }
                          }
                        } else {
                          break L125;
                        }
                      }
                    }
                    if (((gf) this).field_g < 1) {
                      break L124;
                    } else {
                      if (((gf) this).field_b > 5) {
                        ((gf) this).field_g = ((gf) this).field_g + 1;
                        ((gf) this).field_b = 0;
                        if (((gf) this).field_g <= 5) {
                          break L124;
                        } else {
                          return null;
                        }
                      } else {
                        break L124;
                      }
                    }
                  } else {
                    break L124;
                  }
                }
                L130: {
                  if (((gf) this).field_h == 20) {
                    L131: {
                      if (!sc.field_b) {
                        break L131;
                      } else {
                        if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_V) {
                          ag.a(param0, 26, 32 * ((gf) this).field_p, ((gf) this).field_n * 32);
                          break L131;
                        } else {
                          break L131;
                        }
                      }
                    }
                    L132: {
                      ((gf) this).field_b = ((gf) this).field_b + 1;
                      if (((gf) this).field_g != 0) {
                        break L132;
                      } else {
                        if (((gf) this).field_b > 250) {
                          L133: {
                            ne.a(33, -69);
                            ((gf) this).field_g = 1;
                            ((gf) this).field_b = 0;
                            var4 = ca.field_k - ((gf) this).field_n;
                            var5 = -((gf) this).field_p + hf.field_t;
                            if (var4 * var4 > 1) {
                              break L133;
                            } else {
                              if (1 < var5 * var5) {
                                break L133;
                              } else {
                                int discarded$13 = -31391;
                                if (il.e()) {
                                  break L133;
                                } else {
                                  rj.a((byte) -38, 9);
                                  q.field_b[ca.field_k][hf.field_t].field_a = true;
                                  q.field_b[ca.field_k][hf.field_t].field_E = true;
                                  q.field_b[ca.field_k][hf.field_t].field_q = -400;
                                  break L133;
                                }
                              }
                            }
                          }
                          var6 = 0;
                          var7 = 0;
                          L134: while (true) {
                            if (var7 >= 1000) {
                              L135: {
                                if (3 > var6) {
                                  break L135;
                                } else {
                                  fn.a(20, 235, 3);
                                  break L135;
                                }
                              }
                              var7 = -1 + ((gf) this).field_n;
                              L136: while (true) {
                                if (~(1 + ((gf) this).field_n) > ~var7) {
                                  if (re.field_d >= 500) {
                                    fn.a(28, 227, 3);
                                    break L132;
                                  } else {
                                    break L132;
                                  }
                                } else {
                                  var8 = ((gf) this).field_p + -1;
                                  L137: while (true) {
                                    if (var8 > ((gf) this).field_p - -1) {
                                      var7++;
                                      continue L136;
                                    } else {
                                      L138: {
                                        var9 = var7 + -16;
                                        if (0 <= var9) {
                                          break L138;
                                        } else {
                                          var9 = -var9;
                                          break L138;
                                        }
                                      }
                                      L139: {
                                        if (0 >= var8) {
                                          break L139;
                                        } else {
                                          if (0 >= var7) {
                                            break L139;
                                          } else {
                                            if (31 <= var7) {
                                              break L139;
                                            } else {
                                              if (var8 >= je.field_t + -1) {
                                                break L139;
                                              } else {
                                                if (var8 <= var9 / 2) {
                                                  break L139;
                                                } else {
                                                  var10 = 0;
                                                  if (q.field_b[var7][var8].field_a) {
                                                    L140: {
                                                      if (q.field_b[var7][var8].field_E) {
                                                        break L140;
                                                      } else {
                                                        re.field_d = re.field_d + 1;
                                                        break L140;
                                                      }
                                                    }
                                                    q.field_b[var7][var8].field_E = true;
                                                    q.field_b[var7][var8].field_v = false;
                                                    q.field_b[var7][var8].field_q = -400;
                                                    break L139;
                                                  } else {
                                                    L141: {
                                                      if (!je.field_O.a(var7, (byte) -87, var8)) {
                                                        break L141;
                                                      } else {
                                                        je.field_O.b(122, var7, var8);
                                                        var10 = 1;
                                                        break L141;
                                                      }
                                                    }
                                                    if (var10 != 0) {
                                                      var11 = mh.field_e[var7][var8];
                                                      var11.field_q = -400;
                                                      re.field_d = re.field_d + 1;
                                                      var11.field_E = true;
                                                      var11.field_a = true;
                                                      break L139;
                                                    } else {
                                                      break L139;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      var8++;
                                      continue L137;
                                    }
                                  }
                                }
                              }
                            } else {
                              L142: {
                                var8_ref_gf = uf.field_p[var7];
                                if (var8_ref_gf == null) {
                                  break L142;
                                } else {
                                  L143: {
                                    stackOut_545_0 = (gf) var8_ref_gf;
                                    stackIn_547_0 = stackOut_545_0;
                                    stackIn_546_0 = stackOut_545_0;
                                    if (param0) {
                                      stackOut_547_0 = (gf) (Object) stackIn_547_0;
                                      stackOut_547_1 = 0;
                                      stackIn_548_0 = stackOut_547_0;
                                      stackIn_548_1 = stackOut_547_1;
                                      break L143;
                                    } else {
                                      stackOut_546_0 = (gf) (Object) stackIn_546_0;
                                      stackOut_546_1 = 1;
                                      stackIn_548_0 = stackOut_546_0;
                                      stackIn_548_1 = stackOut_546_1;
                                      break L143;
                                    }
                                  }
                                  if (((gf) (Object) stackIn_548_0).a(stackIn_548_1 != 0)) {
                                    var4 = var8_ref_gf.field_n - ((gf) this).field_n;
                                    if (var4 * var4 > 1) {
                                      break L142;
                                    } else {
                                      var5 = var8_ref_gf.field_p + -((gf) this).field_p;
                                      if (var5 * var5 > 1) {
                                        break L142;
                                      } else {
                                        L144: {
                                          var9_ref_je = mh.field_e[var8_ref_gf.field_n][var8_ref_gf.field_p];
                                          if (19 != var8_ref_gf.field_h) {
                                            break L144;
                                          } else {
                                            hn.field_c = true;
                                            break L144;
                                          }
                                        }
                                        var9_ref_je.field_a = true;
                                        var9_ref_je.field_E = true;
                                        uf.field_p[var7] = null;
                                        re.field_d = re.field_d + 1;
                                        var6++;
                                        break L142;
                                      }
                                    }
                                  } else {
                                    break L142;
                                  }
                                }
                              }
                              var7++;
                              continue L134;
                            }
                          }
                        } else {
                          break L132;
                        }
                      }
                    }
                    if (1 > ((gf) this).field_g) {
                      break L130;
                    } else {
                      if (((gf) this).field_b <= 5) {
                        break L130;
                      } else {
                        ((gf) this).field_b = 0;
                        ((gf) this).field_g = ((gf) this).field_g + 1;
                        if (((gf) this).field_g <= 5) {
                          break L130;
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    break L130;
                  }
                }
                L145: {
                  if (10 != ((gf) this).field_h) {
                    break L145;
                  } else {
                    L146: {
                      ((gf) this).field_b = ((gf) this).field_b + 1;
                      if (((gf) this).field_b <= 250) {
                        break L146;
                      } else {
                        ((gf) this).field_b = (int)(200.0 * Math.random());
                        ((gf) this).field_g = ((gf) this).field_g + 1;
                        break L146;
                      }
                    }
                    L147: {
                      if (3 != ((gf) this).field_g) {
                        break L147;
                      } else {
                        ((gf) this).field_g = 0;
                        break L147;
                      }
                    }
                    if (!sc.field_b) {
                      break L145;
                    } else {
                      if (q.field_b[((gf) this).field_n][((gf) this).field_p].field_i == 0) {
                        var4 = ca.field_k + -((gf) this).field_n;
                        var5 = -((gf) this).field_p + hf.field_t;
                        if (64 > var4 * var4 + var5 * var5) {
                          ag.a(param0, 21, ((gf) this).field_p * 32, ((gf) this).field_n * 32);
                          break L145;
                        } else {
                          break L145;
                        }
                      } else {
                        break L145;
                      }
                    }
                  }
                }
                L148: {
                  L149: {
                    if (((gf) this).field_h == 8) {
                      break L149;
                    } else {
                      if (((gf) this).field_h == 10) {
                        break L149;
                      } else {
                        if (19 == ((gf) this).field_h) {
                          break L149;
                        } else {
                          if (21 != ((gf) this).field_h) {
                            if (je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                              L150: {
                                if (((gf) this).field_m >= (int)(Math.random() * 5.0 + 1.0)) {
                                  break L150;
                                } else {
                                  ((gf) this).field_m = ((gf) this).field_m + 1;
                                  break L150;
                                }
                              }
                              L151: {
                                if (((gf) this).field_m <= (int)(5.0 * Math.random() + 1.0)) {
                                  break L151;
                                } else {
                                  ((gf) this).field_m = ((gf) this).field_m - 1;
                                  break L151;
                                }
                              }
                              L152: {
                                if (((gf) this).field_i < (int)(-2.0 + 5.0 * Math.random())) {
                                  ((gf) this).field_i = ((gf) this).field_i + 1;
                                  break L152;
                                } else {
                                  break L152;
                                }
                              }
                              if (((gf) this).field_i > (int)(-2.0 + Math.random() * 5.0)) {
                                ((gf) this).field_i = ((gf) this).field_i - 1;
                                break L148;
                              } else {
                                break L148;
                              }
                            } else {
                              if (((gf) this).field_m < 40) {
                                ((gf) this).field_m = ((gf) this).field_m + 1;
                                break L148;
                              } else {
                                break L148;
                              }
                            }
                          } else {
                            break L149;
                          }
                        }
                      }
                    }
                  }
                  L153: {
                    if (((gf) this).field_h == 19) {
                      break L153;
                    } else {
                      if (((gf) this).field_h != 21) {
                        break L148;
                      } else {
                        break L153;
                      }
                    }
                  }
                  if (je.c(((gf) this).field_n, ((gf) this).field_p, 1, 1)) {
                    break L148;
                  } else {
                    if (((gf) this).field_m >= 40) {
                      break L148;
                    } else {
                      ((gf) this).field_m = ((gf) this).field_m + 1;
                      break L148;
                    }
                  }
                }
                L154: {
                  if (16 != ((gf) this).field_h) {
                    L155: {
                      L156: {
                        ((gf) this).field_k = ((gf) this).field_k + ((gf) this).field_i;
                        ((gf) this).field_f = ((gf) this).field_f + ((gf) this).field_m;
                        if (~((gf) this).field_p < ~(-1 + je.field_t)) {
                          break L156;
                        } else {
                          if (0 >= ((gf) this).field_f) {
                            break L155;
                          } else {
                            if (!q.field_b[((gf) this).field_n][1 + ((gf) this).field_p].g()) {
                              break L155;
                            } else {
                              break L156;
                            }
                          }
                        }
                      }
                      ((gf) this).field_m = 0;
                      ((gf) this).field_f = 0;
                      break L155;
                    }
                    L157: {
                      if (((gf) this).field_f >= 0) {
                        break L157;
                      } else {
                        if (((gf) this).field_m >= 0) {
                          break L157;
                        } else {
                          if (q.field_b[((gf) this).field_n][-1 + ((gf) this).field_p].g()) {
                            ((gf) this).field_m = 0;
                            ((gf) this).field_f = 0;
                            break L157;
                          } else {
                            break L157;
                          }
                        }
                      }
                    }
                    L158: {
                      if (Math.abs(((gf) this).field_k) >= Math.abs(((gf) this).field_f)) {
                        L159: {
                          if (((gf) this).field_k <= 80) {
                            break L159;
                          } else {
                            if (((gf) this).field_f >= 0) {
                              break L159;
                            } else {
                              if (((gf) this).field_m > 0) {
                                break L159;
                              } else {
                                if (!q.field_b[((gf) this).field_n - -1][-1 + ((gf) this).field_p].g()) {
                                  break L159;
                                } else {
                                  ((gf) this).field_m = 0;
                                  ((gf) this).field_f = 0;
                                  break L159;
                                }
                              }
                            }
                          }
                        }
                        L160: {
                          if (((gf) this).field_k >= -80) {
                            break L160;
                          } else {
                            if (((gf) this).field_f >= 0) {
                              break L160;
                            } else {
                              if (((gf) this).field_m > 0) {
                                break L160;
                              } else {
                                if (!q.field_b[-1 + ((gf) this).field_n][-1 + ((gf) this).field_p].g()) {
                                  break L160;
                                } else {
                                  ((gf) this).field_f = 0;
                                  ((gf) this).field_m = 0;
                                  break L160;
                                }
                              }
                            }
                          }
                        }
                        L161: {
                          if (((gf) this).field_k <= 80) {
                            break L161;
                          } else {
                            if (((gf) this).field_f <= 0) {
                              break L161;
                            } else {
                              if (((gf) this).field_m < 0) {
                                break L161;
                              } else {
                                if (q.field_b[((gf) this).field_n + 1][((gf) this).field_p + 1].g()) {
                                  ((gf) this).field_m = 0;
                                  ((gf) this).field_f = 0;
                                  break L161;
                                } else {
                                  break L161;
                                }
                              }
                            }
                          }
                        }
                        if (-80 <= ((gf) this).field_k) {
                          break L158;
                        } else {
                          if (0 >= ((gf) this).field_f) {
                            break L158;
                          } else {
                            if (((gf) this).field_m < 0) {
                              break L158;
                            } else {
                              if (q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p + 1].g()) {
                                ((gf) this).field_f = 0;
                                ((gf) this).field_m = 0;
                                break L158;
                              } else {
                                break L158;
                              }
                            }
                          }
                        }
                      } else {
                        L162: {
                          if (80 >= ((gf) this).field_k) {
                            break L162;
                          } else {
                            if (((gf) this).field_f >= 0) {
                              break L162;
                            } else {
                              if (0 > ((gf) this).field_i) {
                                break L162;
                              } else {
                                if (q.field_b[1 + ((gf) this).field_n][-1 + ((gf) this).field_p].g()) {
                                  ((gf) this).field_k = 80;
                                  ((gf) this).field_i = -((gf) this).field_i;
                                  break L162;
                                } else {
                                  break L162;
                                }
                              }
                            }
                          }
                        }
                        L163: {
                          if (((gf) this).field_k >= -80) {
                            break L163;
                          } else {
                            if (((gf) this).field_f >= 0) {
                              break L163;
                            } else {
                              if (((gf) this).field_i > 0) {
                                break L163;
                              } else {
                                if (!q.field_b[((gf) this).field_n - 1][-1 + ((gf) this).field_p].g()) {
                                  break L163;
                                } else {
                                  ((gf) this).field_i = -((gf) this).field_i;
                                  ((gf) this).field_k = -80;
                                  break L163;
                                }
                              }
                            }
                          }
                        }
                        L164: {
                          if (80 >= ((gf) this).field_k) {
                            break L164;
                          } else {
                            if (((gf) this).field_f <= 0) {
                              break L164;
                            } else {
                              if (((gf) this).field_i < 0) {
                                break L164;
                              } else {
                                if (q.field_b[1 + ((gf) this).field_n][1 + ((gf) this).field_p].g()) {
                                  ((gf) this).field_k = 80;
                                  ((gf) this).field_i = -((gf) this).field_i;
                                  break L164;
                                } else {
                                  break L164;
                                }
                              }
                            }
                          }
                        }
                        if (((gf) this).field_k >= -80) {
                          break L158;
                        } else {
                          if (((gf) this).field_f <= 0) {
                            break L158;
                          } else {
                            if (((gf) this).field_i > 0) {
                              break L158;
                            } else {
                              if (q.field_b[((gf) this).field_n - 1][1 + ((gf) this).field_p].g()) {
                                ((gf) this).field_i = -((gf) this).field_i;
                                ((gf) this).field_k = -80;
                                break L158;
                              } else {
                                break L158;
                              }
                            }
                          }
                        }
                      }
                    }
                    L165: {
                      if (((gf) this).field_k <= 40) {
                        break L165;
                      } else {
                        if (!q.field_b[((gf) this).field_n - -1][((gf) this).field_p].g()) {
                          break L165;
                        } else {
                          ((gf) this).field_k = 40;
                          break L165;
                        }
                      }
                    }
                    L166: {
                      if (((gf) this).field_k >= -40) {
                        break L166;
                      } else {
                        if (!q.field_b[-1 + ((gf) this).field_n][((gf) this).field_p].g()) {
                          break L166;
                        } else {
                          ((gf) this).field_k = -40;
                          break L166;
                        }
                      }
                    }
                    L167: {
                      if (((gf) this).field_k > 160) {
                        ((gf) this).field_k = ((gf) this).field_k - 320;
                        ((gf) this).field_n = ((gf) this).field_n + 1;
                        break L167;
                      } else {
                        break L167;
                      }
                    }
                    L168: {
                      if (((gf) this).field_k < -160) {
                        ((gf) this).field_n = ((gf) this).field_n - 1;
                        ((gf) this).field_k = ((gf) this).field_k + 320;
                        break L168;
                      } else {
                        break L168;
                      }
                    }
                    L169: {
                      if (((gf) this).field_f > 160) {
                        ((gf) this).field_f = ((gf) this).field_f - 320;
                        ((gf) this).field_p = ((gf) this).field_p + 1;
                        break L169;
                      } else {
                        break L169;
                      }
                    }
                    if (((gf) this).field_f < -160) {
                      ((gf) this).field_f = ((gf) this).field_f + 320;
                      ((gf) this).field_p = ((gf) this).field_p - 1;
                      break L154;
                    } else {
                      break L154;
                    }
                  } else {
                    break L154;
                  }
                }
                return (gf) this;
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

    final static void a(long param0) {
        if (!(param0 > 0L)) {
            return;
        }
        if (param0 % 10L != 0L) {
            int discarded$1 = 1855635080;
            ng.a(param0);
        } else {
            int discarded$2 = 1855635080;
            ng.a(-1L + param0);
            int discarded$3 = 1855635080;
            ng.a(1L);
        }
    }

    gf(int param0, int param1, int param2) {
        ((gf) this).field_d = 0;
        ((gf) this).field_i = 0;
        ((gf) this).field_m = 0;
        ((gf) this).field_k = 0;
        ((gf) this).field_h = param2;
        ((gf) this).field_n = param0;
        ((gf) this).field_f = 0;
        ((gf) this).field_b = 0;
        ((gf) this).field_p = param1;
        ((gf) this).field_o = 0;
        ((gf) this).field_g = 0;
        if (param2 < 5) {
            ((gf) this).field_i = (int)(Math.random() * 40.0 - 20.0);
            ((gf) this).field_m = (int)(-25.0 + 20.0 * -Math.random());
        }
        if (((gf) this).a(false)) {
            ((gf) this).field_i = 1;
            q.field_b[((gf) this).field_n][((gf) this).field_p].field_a = false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[11];
    }
}
