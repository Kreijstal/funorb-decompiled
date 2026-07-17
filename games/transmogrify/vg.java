/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    private int field_c;
    private int field_d;
    static String field_g;
    static String field_a;
    al field_j;
    static ea field_b;
    private int field_e;
    private int field_h;
    private int field_f;
    private int field_i;

    private final int f(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Transmogrify.field_A ? 1 : 0;
          if (-3 != ((vg) this).field_i) {
            break L0;
          } else {
            if (qj.b((byte) 112)) {
              break L0;
            } else {
              if (-4 <= param0) {
                return fd.field_b[((vg) this).field_i] + fd.field_a[((vg) this).field_i];
              } else {
                return fd.field_a[((vg) this).field_i];
              }
            }
          }
        }
        if (((vg) this).field_i != 3) {
          L1: {
            if (((vg) this).field_i == 1) {
              break L1;
            } else {
              if (((vg) this).field_i == 7) {
                break L1;
              } else {
                return fd.field_a[((vg) this).field_i] - -(param0 * fd.field_b[((vg) this).field_i]);
              }
            }
          }
          var3 = fd.field_a[((vg) this).field_i];
          var4 = 0;
          L2: while (true) {
            if (var4 >= param0) {
              return var3;
            } else {
              if (this.a(var4, false)) {
                var3 = var3 + fd.field_b[((vg) this).field_i];
                var4++;
                continue L2;
              } else {
                var4++;
                continue L2;
              }
            }
          }
        } else {
          return fd.field_a[((vg) this).field_i];
        }
    }

    private final void e(int param0, int param1) {
        int var7 = Transmogrify.field_A ? 1 : 0;
        String[] var8 = new String[16];
        String[] var3 = var8;
        int var4 = wf.field_d.a(db.field_b[ra.field_a], lk.field_e, var3);
        int var5 = 0;
        int var6 = 156 + param0;
        while (var4 > var5) {
            wf.field_d.b(var8[var5], 54, var6, 119, -1);
            var5++;
            var6 += 22;
        }
        wf.field_d.a(rh.a((byte) 117, 1 + ra.field_a), 548, param0 + 142, 0, -1);
        se.field_t.c(166, param0);
    }

    private final boolean a(int param0, boolean param1) {
        L0: {
          if (3 == ((vg) this).field_i) {
            L1: {
              if (param0 != 0) {
                break L1;
              } else {
                if (ra.field_a == 0) {
                  return false;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (2 != param0) {
                break L2;
              } else {
                if (ra.field_a == -1 + db.field_b.length) {
                  return false;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 != 3) {
                break L3;
              } else {
                if (~(-1 + db.field_b.length) != ~ra.field_a) {
                  return false;
                } else {
                  break L3;
                }
              }
            }
            if (param0 != 3) {
              break L0;
            } else {
              if (wc.field_d == 1) {
                return false;
              } else {
                if (wc.field_d != 7) {
                  break L0;
                } else {
                  return false;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          L5: {
            if (((vg) this).field_i == 1) {
              break L5;
            } else {
              if (((vg) this).field_i != 7) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          if (fd.field_h[((vg) this).field_i][param0] != 4) {
            break L4;
          } else {
            if (wj.field_o > 0) {
              break L4;
            } else {
              return false;
            }
          }
        }
        return true;
    }

    private final int a(int param0, byte param1) {
        if (((vg) this).field_i == 2) {
            if (!qj.b((byte) 80)) {
                if (param0 < 3) {
                    return fd.field_e[((vg) this).field_i] - -(param0 * 200);
                }
                return 200 + fd.field_e[((vg) this).field_i];
            }
        }
        if (((vg) this).field_i == 3) {
            if (!(param0 != 3)) {
                return fd.field_e[((vg) this).field_i] + 400;
            }
            return param0 * 200 + fd.field_e[((vg) this).field_i];
        }
        return fd.field_e[((vg) this).field_i];
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_42_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        L0: {
          var15 = Transmogrify.field_A ? 1 : 0;
          var4 = 283;
          var5 = 112;
          if (!param0) {
            stackOut_2_0 = rh.field_n;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = hc.field_u;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var7 = 0;
        var8 = -1;
        var9 = 0;
        L1: while (true) {
          if (~qj.field_a.length >= ~var9) {
            L2: {
              if (-1 >= ((vg) this).field_e) {
                break L2;
              } else {
                var8 = ((vg) this).field_e;
                break L2;
              }
            }
            if (param1 == -2) {
              L3: {
                if (var8 != -1) {
                  L4: {
                    var9 = wf.field_d.field_t + (wf.field_d.field_D + 2);
                    wf.field_d.c(qj.field_a[var8], 438, param2 + 206, 0, -1);
                    if ((var6 & 1 << var8) == 0) {
                      stackOut_41_0 = 0;
                      stackIn_42_0 = stackOut_41_0;
                      break L4;
                    } else {
                      stackOut_40_0 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      break L4;
                    }
                  }
                  L5: {
                    var10 = stackIn_42_0;
                    if (var10 != 0) {
                      wf.field_d.c(rl.field_i, 438, 206 + (var9 - -param2), 0, -1);
                      break L5;
                    } else {
                      wf.field_d.c(ff.field_x, 438, var9 + 206 + param2, 16711680, -1);
                      break L5;
                    }
                  }
                  L6: {
                    if (var10 == 0) {
                      ff.field_z.c(263, 206 - -var9 + param2);
                      break L6;
                    } else {
                      fc.field_h[var8].c(263, param2 + (206 - -var9));
                      break L6;
                    }
                  }
                  var11 = 4 + (wf.field_d.field_y * 2 + (206 - -param2));
                  var12 = new String[16];
                  var13 = wf.field_d.a(bl.field_b[var8], new int[1], var12);
                  var11 = var11 + ((-var13 + 4) * var9 >> 1);
                  var14 = 0;
                  L7: while (true) {
                    if (~var14 <= ~var13) {
                      L8: {
                        if (var13 < 3) {
                          var11 = var11 + var9;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      wf.field_d.b(gj.field_f + rg.field_B[var8], 394, var11, 0, -1);
                      var4 = 394;
                      var11 = var11 + var9;
                      wf.field_d.b(ck.field_F, var4, var11, 0, -1);
                      var4 = var4 + wf.field_d.a(ck.field_F);
                      var14 = 0;
                      L9: while (true) {
                        if (~wd.field_k[var8] >= ~var14) {
                          break L3;
                        } else {
                          og.field_b.c(var4, -wf.field_d.field_y + var11);
                          var4 = var4 + og.field_b.field_n / 3;
                          var14++;
                          continue L9;
                        }
                      }
                    } else {
                      wf.field_d.b(var12[var14], 394, var11, 0, -1);
                      var11 = var11 + var9;
                      var14++;
                      continue L7;
                    }
                  }
                } else {
                  var5 = param2 + 206 - wf.field_d.field_y;
                  var9 = wf.field_d.field_t + wf.field_d.field_y;
                  var5 = var5 + var9 * wf.field_d.a(aj.field_v, 283, var5, 310, 1000, 0, -1, 1, 0, var9);
                  var5 = var5 + var9;
                  if (!qj.b((byte) 95)) {
                    break L3;
                  } else {
                    int discarded$2 = wf.field_d.a(tj.field_t, 283, var5, 310, 1000, 0, -1, 1, 0, var9);
                    break L3;
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L10: {
              L11: {
                if (wl.a(false, 0)) {
                  break L11;
                } else {
                  if (var9 != 15) {
                    break L11;
                  } else {
                    if ((32768 & var6) != 0) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              L12: {
                if ((1 << var9 & var6) != 0) {
                  fc.field_h[var9].e(var4, param2 + var5);
                  break L12;
                } else {
                  if (!param0) {
                    ff.field_z.e(var4, var5 + param2);
                    break L12;
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (var4 > oa.field_j) {
                  break L13;
                } else {
                  if (~(32 + var4) > ~oa.field_j) {
                    break L13;
                  } else {
                    if (~(param2 + var5) < ~bk.field_a) {
                      break L13;
                    } else {
                      if (bk.field_a > param2 + (var5 - -32)) {
                        break L13;
                      } else {
                        sb.b(-2 + var4, -2 + var5, 36, 36, 6, 8421504);
                        var8 = var9;
                        break L13;
                      }
                    }
                  }
                }
              }
              L14: {
                if (~var4 < ~((vg) this).field_d) {
                  break L14;
                } else {
                  if (~((vg) this).field_d < ~(32 + var4)) {
                    break L14;
                  } else {
                    if (~(param2 + var5) < ~((vg) this).field_h) {
                      break L14;
                    } else {
                      if (32 + (var5 - -param2) < ((vg) this).field_h) {
                        break L14;
                      } else {
                        ((vg) this).field_d = -1;
                        if (~var9 != ~((vg) this).field_e) {
                          ((vg) this).field_e = var9;
                          break L14;
                        } else {
                          ((vg) this).field_e = -1;
                          break L14;
                        }
                      }
                    }
                  }
                }
              }
              L15: {
                if (((vg) this).field_e != var9) {
                  break L15;
                } else {
                  sb.b(var4 - 2, var5 - 2, 36, 36, 6, 1579032);
                  break L15;
                }
              }
              int incrementValue$3 = var7;
              var7++;
              if (incrementValue$3 != 7) {
                var4 += 40;
                break L10;
              } else {
                var4 = 283;
                var5 += 40;
                break L10;
              }
            }
            var9++;
            continue L1;
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 256) {
            field_g = null;
        }
        int var3 = 0;
        if (((vg) this).field_i == 0) {
            if (((vg) this).field_j.field_d != -1) {
                var3 = ((vg) this).field_j.field_d;
            }
        }
        if (((vg) this).field_i == 1) {
            if (((vg) this).field_j.field_d != -1) {
                if (!(be.field_q == 0)) {
                    var3 = ((vg) this).field_j.field_d;
                }
            }
        }
        if (!(-4 != ((vg) this).field_i)) {
            var3 = 2;
        }
        ((vg) this).field_j.a(this.a(oa.field_j, param1 + 1192, bk.field_a), var3, (byte) 61, param0);
        ((vg) this).field_e = -1;
        ((vg) this).field_f = 0;
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var10 = Transmogrify.field_A ? 1 : 0;
          if (!rj.field_b) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          if (null == ub.field_c) {
            break L1;
          } else {
            if (!ub.field_c.field_c) {
              var4 = 1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var5 = fd.field_h[((vg) this).field_i][param1];
          if (var5 != 0) {
            break L2;
          } else {
            if (uc.field_d) {
              L3: {
                if (qj.b((byte) 120)) {
                  break L3;
                } else {
                  L4: {
                    if (null == sh.field_c) {
                      break L4;
                    } else {
                      if (!sh.field_c.field_k) {
                        break L4;
                      } else {
                        if (null == sh.field_c.field_l) {
                          break L4;
                        } else {
                          if (sh.field_c.field_l[1][0] != 0) {
                            break L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  uc.field_d = false;
                  break L2;
                }
              }
              var5 = 20;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L5: {
          L6: {
            var9 = var5;
            if (0 != var9) {
              if (var9 == 20) {
                if (((vg) this).field_j.f(-9112)) {
                  if (var4 == 0) {
                    break L6;
                  } else {
                    od discarded$24 = vk.a((byte) 105, dg.field_d[0]);
                    sh.field_c = null;
                    rh.field_t = null;
                    rc.a(true, (byte) -13);
                    wc.field_d = 0;
                    qf.field_d = -1;
                    uc.field_d = false;
                    wd.a(17099, true, bd.field_u[1]);
                    break L5;
                  }
                } else {
                  break L5;
                }
              } else {
                L7: {
                  if (var9 == 1) {
                    break L7;
                  } else {
                    if (var9 != 21) {
                      if (var9 == 5) {
                        if (!((vg) this).field_j.f(-9112)) {
                          break L6;
                        } else {
                          od discarded$25 = vk.a((byte) 127, dg.field_d[0]);
                          qf.field_d = 0;
                          break L5;
                        }
                      } else {
                        if (16 != var9) {
                          if (var9 != 14) {
                            if (var9 != 3) {
                              if (var9 != 6) {
                                if (var9 != 2) {
                                  if (12 == var9) {
                                    L8: {
                                      var6 = kc.field_g;
                                      var7 = 0;
                                      if (((vg) this).field_j.e(0)) {
                                        ec.a(0, 9956);
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (!((vg) this).field_j.c(-4135)) {
                                        break L9;
                                      } else {
                                        var7 = 1;
                                        ec.a(256, 9956);
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (((vg) this).field_j.b((byte) 78)) {
                                        var9 = 256 * (oa.field_j + -((vg) this).field_c) / 80;
                                        if (var9 <= 0) {
                                          ec.a(0, 9956);
                                          break L10;
                                        } else {
                                          if (var9 >= 256) {
                                            ec.a(256, 9956);
                                            break L10;
                                          } else {
                                            ec.a(var9, 9956);
                                            break L10;
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (!((vg) this).field_j.c(true)) {
                                        break L11;
                                      } else {
                                        qj.e(-127);
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      if (((vg) this).field_j.c((byte) -72)) {
                                        lf.a((byte) -125);
                                        var7 = 1;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      if (~kc.field_g != ~var6) {
                                        break L13;
                                      } else {
                                        if (var7 == 0) {
                                          break L6;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (!lj.field_u.b(8)) {
                                        break L14;
                                      } else {
                                        if (lj.field_u.l()) {
                                          break L14;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    lj.field_u.j(0);
                                    lj.field_u.k(255);
                                    od discarded$26 = ic.a(lj.field_u, 4);
                                    break L5;
                                  } else {
                                    if (13 != var9) {
                                      if (var9 == 4) {
                                        if (!((vg) this).field_j.f(-9112)) {
                                          break L6;
                                        } else {
                                          od discarded$27 = vk.a((byte) 83, dg.field_d[0]);
                                          if (null == ub.field_c) {
                                            var9 = param0 ? 1 : 0;
                                            dj.a(true, var9 != 0);
                                            break L5;
                                          } else {
                                            qd.b(5);
                                            break L5;
                                          }
                                        }
                                      } else {
                                        if (var9 == 7) {
                                          if (((vg) this).field_j.f(-9112)) {
                                            L15: {
                                              L16: {
                                                od discarded$28 = vk.a((byte) 120, dg.field_d[0]);
                                                if (hc.field_u != 0) {
                                                  break L16;
                                                } else {
                                                  if (pf.field_g == 0) {
                                                    qf.field_d = 0;
                                                    break L15;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (qj.b((byte) 82)) {
                                                qf.field_d = 5;
                                                break L15;
                                              } else {
                                                L17: {
                                                  ug.b(true);
                                                  if (hc.field_u != 0) {
                                                    qf.field_d = 6;
                                                    break L17;
                                                  } else {
                                                    qf.field_d = 2;
                                                    break L17;
                                                  }
                                                }
                                                sh.field_c = null;
                                                break L15;
                                              }
                                            }
                                            wc.field_d = 0;
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          if (var9 != 22) {
                                            if (8 != var9) {
                                              if (var9 == 9) {
                                                if (((vg) this).field_j.f(-9112)) {
                                                  od discarded$29 = vk.a((byte) 88, dg.field_d[0]);
                                                  ck.field_y = 1;
                                                  break L5;
                                                } else {
                                                  break L5;
                                                }
                                              } else {
                                                if (var9 == 10) {
                                                  if (((vg) this).field_j.f(-9112)) {
                                                    od discarded$30 = vk.a((byte) 105, dg.field_d[0]);
                                                    ck.field_y = 2;
                                                    break L5;
                                                  } else {
                                                    break L5;
                                                  }
                                                } else {
                                                  if (var9 != 15) {
                                                    if (var9 == 18) {
                                                      if (!((vg) this).field_j.f(-9112)) {
                                                        break L6;
                                                      } else {
                                                        if (this.a(param1, false)) {
                                                          od discarded$31 = vk.a((byte) 105, dg.field_d[0]);
                                                          ra.field_a = ra.field_a - 1;
                                                          if (ra.field_a == 0) {
                                                            ((vg) this).field_j.field_d = 2;
                                                            break L5;
                                                          } else {
                                                            break L5;
                                                          }
                                                        } else {
                                                          break L5;
                                                        }
                                                      }
                                                    } else {
                                                      if (var9 == 19) {
                                                        if (!((vg) this).field_j.f(-9112)) {
                                                          break L6;
                                                        } else {
                                                          if (this.a(param1, false)) {
                                                            od discarded$32 = vk.a((byte) 127, dg.field_d[0]);
                                                            ra.field_a = ra.field_a + 1;
                                                            if (-1 + db.field_b.length == ra.field_a) {
                                                              L18: {
                                                                if (wc.field_d == 1) {
                                                                  break L18;
                                                                } else {
                                                                  if (wc.field_d != 7) {
                                                                    ((vg) this).field_j.field_d = 3;
                                                                    break L5;
                                                                  } else {
                                                                    break L18;
                                                                  }
                                                                }
                                                              }
                                                              ((vg) this).field_j.field_d = 1;
                                                              break L5;
                                                            } else {
                                                              break L5;
                                                            }
                                                          } else {
                                                            break L5;
                                                          }
                                                        }
                                                      } else {
                                                        if (var9 != 11) {
                                                          if (17 != var9) {
                                                            break L5;
                                                          } else {
                                                            L19: {
                                                              if (((vg) this).field_j.d(104)) {
                                                                od discarded$33 = vk.a((byte) 120, dg.field_d[0]);
                                                                L20: while (true) {
                                                                  L21: {
                                                                    int fieldTemp$34 = am.field_n + 1;
                                                                    am.field_n = am.field_n + 1;
                                                                    if (~fieldTemp$34 == ~we.field_l.length) {
                                                                      am.field_n = 0;
                                                                      break L21;
                                                                    } else {
                                                                      break L21;
                                                                    }
                                                                  }
                                                                  if (we.field_l[am.field_n].field_g) {
                                                                    continue L20;
                                                                  } else {
                                                                    break L19;
                                                                  }
                                                                }
                                                              } else {
                                                                break L19;
                                                              }
                                                            }
                                                            if (((vg) this).field_j.a((byte) -112)) {
                                                              od discarded$35 = vk.a((byte) 113, dg.field_d[0]);
                                                              L22: while (true) {
                                                                L23: {
                                                                  int fieldTemp$36 = am.field_n - 1;
                                                                  am.field_n = am.field_n - 1;
                                                                  if (fieldTemp$36 >= 0) {
                                                                    break L23;
                                                                  } else {
                                                                    am.field_n = -1 + we.field_l.length;
                                                                    break L23;
                                                                  }
                                                                }
                                                                if (we.field_l[am.field_n].field_g) {
                                                                  continue L22;
                                                                } else {
                                                                  break L6;
                                                                }
                                                              }
                                                            } else {
                                                              break L5;
                                                            }
                                                          }
                                                        } else {
                                                          if (((vg) this).field_j.f(-9112)) {
                                                            od discarded$37 = vk.a((byte) 106, dg.field_d[0]);
                                                            vl.a((byte) 93, ha.b(125));
                                                            break L5;
                                                          } else {
                                                            break L5;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (((vg) this).field_j.f(-9112)) {
                                                      L24: {
                                                        od discarded$38 = vk.a((byte) 92, dg.field_d[0]);
                                                        if (4 == ((vg) this).field_i) {
                                                          break L24;
                                                        } else {
                                                          if (((vg) this).field_i == 2) {
                                                            break L24;
                                                          } else {
                                                            if (((vg) this).field_i == 5) {
                                                              vb.a(5, 6, (byte) 99);
                                                              break L5;
                                                            } else {
                                                              break L5;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      vb.a(((vg) this).field_i, ((vg) this).field_i, (byte) 121);
                                                      break L5;
                                                    } else {
                                                      break L5;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              if (((vg) this).field_j.f(-9112)) {
                                                od discarded$39 = vk.a((byte) 92, dg.field_d[0]);
                                                ck.field_y = 0;
                                                break L5;
                                              } else {
                                                break L5;
                                              }
                                            }
                                          } else {
                                            if (((vg) this).field_j.f(-9112)) {
                                              od discarded$40 = vk.a((byte) 127, dg.field_d[0]);
                                              wc.field_d = 0;
                                              qf.field_d = 0;
                                              break L5;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      L25: {
                                        if (((vg) this).field_j.e(0)) {
                                          uc.a(0, (byte) -118);
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        var8 = 128;
                                        if (((vg) this).field_j.c(-4135)) {
                                          uc.a(var8, (byte) -121);
                                          break L26;
                                        } else {
                                          break L26;
                                        }
                                      }
                                      L27: {
                                        if (!((vg) this).field_j.b((byte) 83)) {
                                          break L27;
                                        } else {
                                          var9 = 256 * (oa.field_j + -((vg) this).field_c) / 80;
                                          if (var9 <= 0) {
                                            uc.a(0, (byte) -117);
                                            break L27;
                                          } else {
                                            if (var9 >= 256) {
                                              uc.a(var8, (byte) -127);
                                              break L27;
                                            } else {
                                              uc.a(128 * var9 >> 8, (byte) -122);
                                              break L27;
                                            }
                                          }
                                        }
                                      }
                                      L28: {
                                        if (((vg) this).field_j.c(true)) {
                                          if (~lb.field_a >= ~(var8 >> 3)) {
                                            uc.a(0, (byte) -125);
                                            break L28;
                                          } else {
                                            uc.a(-(var8 >> 3) + lb.field_a, (byte) -124);
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      if (!((vg) this).field_j.c((byte) -72)) {
                                        break L6;
                                      } else {
                                        if (var8 * 7 >> 3 <= lb.field_a) {
                                          uc.a(var8, (byte) -127);
                                          break L5;
                                        } else {
                                          uc.a((var8 >> 3) + lb.field_a, (byte) -123);
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (((vg) this).field_j.f(-9112)) {
                                    od discarded$41 = vk.a((byte) 91, dg.field_d[0]);
                                    qf.field_d = 2;
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                              } else {
                                if (((vg) this).field_j.f(-9112)) {
                                  od discarded$42 = vk.a((byte) 125, dg.field_d[0]);
                                  qf.field_d = wc.field_d;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            } else {
                              if (((vg) this).field_j.f(-9112)) {
                                od discarded$43 = vk.a((byte) 110, dg.field_d[0]);
                                wc.field_d = ((vg) this).field_i;
                                qf.field_d = 3;
                                ra.field_a = 0;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          } else {
                            if (((vg) this).field_j.f(-9112)) {
                              od discarded$44 = vk.a((byte) 120, dg.field_d[0]);
                              qf.field_d = 4;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        } else {
                          if (((vg) this).field_j.f(-9112)) {
                            od discarded$45 = vk.a((byte) 89, dg.field_d[0]);
                            qf.field_d = 0;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                if (((vg) this).field_j.f(-9112)) {
                  if (var4 != 0) {
                    od discarded$46 = vk.a((byte) 112, dg.field_d[0]);
                    wc.field_d = 0;
                    qf.field_d = -1;
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
            } else {
              if (((vg) this).field_j.f(-9112)) {
                if (var4 == 0) {
                  break L6;
                } else {
                  od discarded$47 = vk.a((byte) 91, dg.field_d[0]);
                  sh.field_c = null;
                  rh.field_t = null;
                  rc.a(false, (byte) -13);
                  wc.field_d = 0;
                  qf.field_d = -1;
                  wd.a(17099, true, bd.field_u[1]);
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          break L5;
        }
    }

    private final int b(int param0, int param1) {
        if (param0 <= 100) {
            ((vg) this).field_d = 62;
        }
        if (!(!ci.field_g[((vg) this).field_i])) {
            return jk.field_x.a(true);
        }
        return fd.field_b[((vg) this).field_i];
    }

    final void c(byte param0) {
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        ((vg) this).field_f = ((vg) this).field_f + 1;
        L0: while (true) {
          if (!pc.b(-128)) {
            L1: {
              if (3 != ((vg) this).field_i) {
                break L1;
              } else {
                ob.a(1, 2, sg.field_p, ((vg) this).field_f);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((vg) this).field_i == 2) {
                  break L3;
                } else {
                  if (((vg) this).field_i != 6) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (null == d.field_e) {
                wd.a(17099, true, bd.field_u[6]);
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              if (param0 == 122) {
                break L4;
              } else {
                this.g(-27, -43);
                break L4;
              }
            }
            L5: {
              ((vg) this).field_j.a(-107, this.a(ol.field_b, 1448, nk.field_c), this.a(oa.field_j, 1448, bk.field_a));
              if (-1 == ((vg) this).field_j.field_d) {
                break L5;
              } else {
                this.a(true, ((vg) this).field_j.field_d, true);
                break L5;
              }
            }
            L6: {
              if (tg.field_d == 0) {
                break L6;
              } else {
                ((vg) this).field_h = nk.field_c;
                ((vg) this).field_d = ol.field_b;
                break L6;
              }
            }
            return;
          } else {
            if (13 != ch.field_d) {
              this.b((byte) -120);
              if (((vg) this).field_j.field_d == -1) {
                continue L0;
              } else {
                this.a(false, ((vg) this).field_j.field_d, true);
                continue L0;
              }
            } else {
              L7: {
                if (((vg) this).field_i == 1) {
                  break L7;
                } else {
                  if (((vg) this).field_i == 7) {
                    break L7;
                  } else {
                    if (((vg) this).field_i != 5) {
                      qf.field_d = wc.field_d;
                      continue L0;
                    } else {
                      continue L0;
                    }
                  }
                }
              }
              qf.field_d = -1;
              continue L0;
            }
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 != null) {
              var3_int = param1.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = hj.a((byte) -125, param1);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (uf.a(var4.charAt(0), (byte) -56)) {
                            break L2;
                          } else {
                            if (uf.a(var4.charAt(-1 + var4.length()), (byte) -104)) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (var5 <= 0) {
                                    stackOut_33_0 = 1;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L0;
                                  } else {
                                    stackOut_31_0 = 0;
                                    stackIn_32_0 = stackOut_31_0;
                                    return stackIn_32_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (uf.a((char) var7, (byte) -121)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  L5: {
                                    if (var5 < 2) {
                                      break L5;
                                    } else {
                                      if (!param0) {
                                        stackOut_27_0 = 0;
                                        stackIn_28_0 = stackOut_27_0;
                                        return stackIn_28_0 != 0;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("vg.E(").append(param0).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L6;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + 26 + 41);
        }
        return stackIn_34_0 != 0;
    }

    public static void a(byte param0) {
        if (param0 != -60) {
            return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    private final int a(int param0, int param1) {
        if (((vg) this).field_i == 2) {
            if (!(qj.b((byte) 94))) {
                return 180 + this.a(param0, (byte) 123);
            }
        }
        if (!(((vg) this).field_i != 3)) {
            return this.a(param0, (byte) 123) + 180;
        }
        return fd.field_c[((vg) this).field_i];
    }

    private final void g(int param0, int param1) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        mi var5_ref_mi = null;
        o var6 = null;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        int var12 = 0;
        int var13_int = 0;
        ti var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        String var17 = null;
        ti var18 = null;
        int var19 = 0;
        int[] var26 = null;
        long[] var27 = null;
        L0: {
          var19 = Transmogrify.field_A ? 1 : 0;
          var4 = -66 / ((param0 - 41) / 60);
          if (qj.b((byte) 93)) {
            var3 = tj.field_t;
            break L0;
          } else {
            L1: {
              if (sh.field_c != null) {
                break L1;
              } else {
                sh.field_c = pj.a(29, (byte) -10, 3, 10, 1);
                break L1;
              }
            }
            var5_ref_mi = wf.field_d;
            var6 = sh.field_c;
            var7 = ck.field_y;
            if (var6.field_k) {
              if (var6.field_m != null) {
                var3 = th.field_e;
                var8 = 0;
                var9 = var6.field_m[var7];
                var27 = var6.field_g[var7];
                var26 = var6.field_l[var7];
                var12 = param1 + var5_ref_mi.field_y + 23;
                var13_int = 0;
                L2: while (true) {
                  if (var13_int >= 10) {
                    if (-2147483648 == pf.field_g) {
                      break L0;
                    } else {
                      if (var8 != 0) {
                        break L0;
                      } else {
                        if (pf.field_g == 0) {
                          break L0;
                        } else {
                          var5_ref_mi.b(w.field_a, 268, var12, 255, -1);
                          var5_ref_mi.a(Integer.toString(pf.field_g), 520, var12, 255, -1);
                          var13 = qi.field_c.field_a;
                          var13.f(528, (24 + -var13.field_m) / 2 + (-1 + var5_ref_mi.field_C + -var5_ref_mi.field_y) + (var12 - 24));
                          break L0;
                        }
                      }
                    }
                  } else {
                    if (var9[var13_int] != null) {
                      L3: {
                        var14 = 119;
                        var15 = var26[var13_int] >> 6;
                        var16 = 63 & var26[var13_int];
                        var17 = var9[var13_int];
                        if (!qg.a(var17, (byte) 106)) {
                          break L3;
                        } else {
                          if (var8 != 0) {
                            break L3;
                          } else {
                            if (rh.field_t == null) {
                              break L3;
                            } else {
                              if (var27[var13_int] != rh.field_t.field_o) {
                                break L3;
                              } else {
                                if (pf.field_g != var15) {
                                  break L3;
                                } else {
                                  if (qi.field_c.field_o == var16) {
                                    var8 = 1;
                                    var14 = 255;
                                    break L3;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var5_ref_mi.a(var13_int + 1 + ". ", 268, var12, var14, -1);
                      var5_ref_mi.b(var17, 268, var12, var14, -1);
                      var5_ref_mi.a(Integer.toString(var15), 520, var12, var14, -1);
                      var18 = we.field_l[var16].field_a;
                      var18.f(528, -1 + (-var5_ref_mi.field_y + (var12 + var5_ref_mi.field_C)) - (24 + -((-var18.field_m + 24) / 2)));
                      var3 = "";
                      var12 += 28;
                      var13_int++;
                      continue L2;
                    } else {
                      var12 += 28;
                      var13_int++;
                      continue L2;
                    }
                  }
                }
              } else {
                var3 = wg.field_e;
                break L0;
              }
            } else {
              var3 = mh.field_d;
              break L0;
            }
          }
        }
        L4: {
          var5 = param1 + 163;
          int discarded$2 = wf.field_d.a(var3, 224, var5, 346, 1000, 119, -1, 1, 0, -4 + (wf.field_d.field_t + wf.field_d.field_y));
          if (0 == var3.length()) {
            var5 = 331 + param1;
            int discarded$3 = og.field_a.a(sg.field_o, 224, var5, 346, 1000, 119, -1, 1, 0, og.field_a.field_y - (-og.field_a.field_t - -4));
            break L4;
          } else {
            break L4;
          }
        }
    }

    final void d(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        Object stackOut_34_0 = null;
        Object stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          var7 = Transmogrify.field_A ? 1 : 0;
          rk.field_r[((vg) this).field_i].f(0, param1);
          if (((vg) this).field_i != 2) {
            if (3 == ((vg) this).field_i) {
              this.e(param1, -92);
              break L0;
            } else {
              if (4 == ((vg) this).field_i) {
                this.a(false, -2, param1);
                break L0;
              } else {
                if (((vg) this).field_i != 6) {
                  if (((vg) this).field_i == 5) {
                    L1: {
                      var3 = 130 + param1;
                      var4 = 4 + wf.field_d.field_t + wf.field_d.field_D;
                      var5 = var4 * wf.field_d.b(sd.field_Q, 341);
                      int discarded$4 = wf.field_d.a(sd.field_Q, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                      var3 = var3 + var5;
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (hc.field_u == 0) {
                        stackOut_10_0 = stackIn_10_0;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L1;
                      } else {
                        stackOut_9_0 = stackIn_9_0;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L1;
                      }
                    }
                    L2: {
                      stackOut_11_0 = stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      if (pf.field_g == 0) {
                        stackOut_13_0 = stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = stackIn_13_2;
                        stackOut_13_3 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        break L2;
                      } else {
                        stackOut_12_0 = stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        break L2;
                      }
                    }
                    L3: {
                      var8 = aj.a(stackIn_14_0 != 0, stackIn_14_1 != 0, stackIn_14_2 != 0, stackIn_14_3 != 0);
                      var5 = var4 * wf.field_d.b(var8, 341);
                      int discarded$5 = wf.field_d.a(var8, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                      var3 = var3 + var5;
                      var3 = var3 + (jk.field_x.a(true) + var4);
                      stackOut_14_0 = -85;
                      stackOut_14_1 = 0;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if (pf.field_g == 0) {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L3;
                      } else {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L3;
                      }
                    }
                    L4: {
                      stackOut_17_0 = stackIn_17_0;
                      stackOut_17_1 = stackIn_17_1;
                      stackOut_17_2 = stackIn_17_2;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      stackIn_19_2 = stackOut_17_2;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      stackIn_18_2 = stackOut_17_2;
                      if (hc.field_u == 0) {
                        stackOut_19_0 = stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = 0;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        stackIn_20_3 = stackOut_19_3;
                        break L4;
                      } else {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = stackIn_18_1;
                        stackOut_18_2 = stackIn_18_2;
                        stackOut_18_3 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        stackIn_20_3 = stackOut_18_3;
                        break L4;
                      }
                    }
                    L5: {
                      var9 = gd.a((byte) stackIn_20_0, stackIn_20_1 != 0, stackIn_20_2 != 0, stackIn_20_3 != 0);
                      var5 = var4 * wf.field_d.b(var9, 341);
                      int discarded$6 = wf.field_d.a(var9, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                      var3 = var3 + var5;
                      var3 = var3 + jk.field_x.a(true);
                      stackOut_20_0 = 0;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (hc.field_u == 0) {
                        stackOut_22_0 = stackIn_22_0;
                        stackOut_22_1 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L5;
                      } else {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L5;
                      }
                    }
                    L6: {
                      stackOut_23_0 = stackIn_23_0;
                      stackOut_23_1 = stackIn_23_1;
                      stackOut_23_2 = -106;
                      stackIn_25_0 = stackOut_23_0;
                      stackIn_25_1 = stackOut_23_1;
                      stackIn_25_2 = stackOut_23_2;
                      stackIn_24_0 = stackOut_23_0;
                      stackIn_24_1 = stackOut_23_1;
                      stackIn_24_2 = stackOut_23_2;
                      if (pf.field_g == 0) {
                        stackOut_25_0 = stackIn_25_0;
                        stackOut_25_1 = stackIn_25_1;
                        stackOut_25_2 = stackIn_25_2;
                        stackOut_25_3 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        stackIn_26_1 = stackOut_25_1;
                        stackIn_26_2 = stackOut_25_2;
                        stackIn_26_3 = stackOut_25_3;
                        break L6;
                      } else {
                        stackOut_24_0 = stackIn_24_0;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = stackIn_24_2;
                        stackOut_24_3 = 1;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        stackIn_26_2 = stackOut_24_2;
                        stackIn_26_3 = stackOut_24_3;
                        break L6;
                      }
                    }
                    var10 = we.a(stackIn_26_0 != 0, stackIn_26_1 != 0, stackIn_26_2, stackIn_26_3 != 0);
                    var5 = wf.field_d.b(var10, 341) * var4;
                    int discarded$7 = wf.field_d.a(var10, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  this.a(true, -2, param1);
                  break L0;
                }
              }
            }
          } else {
            this.g(param0 + -20002, param1);
            break L0;
          }
        }
        if (param0 == 20104) {
          var3 = 0;
          L7: while (true) {
            if (((vg) this).field_j.field_a <= var3) {
              return;
            } else {
              L8: {
                if (!this.a(var3, false)) {
                  break L8;
                } else {
                  L9: {
                    stackOut_34_0 = this;
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (~var3 != ~((vg) this).field_j.field_d) {
                      stackOut_36_0 = this;
                      stackOut_36_1 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      stackIn_37_1 = stackOut_36_1;
                      break L9;
                    } else {
                      stackOut_35_0 = this;
                      stackOut_35_1 = 1;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_37_1 = stackOut_35_1;
                      break L9;
                    }
                  }
                  this.a(stackIn_37_1 != 0, -118, param1, var3);
                  break L8;
                }
              }
              var3++;
              continue L7;
            }
          }
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        int var3 = 0;
        L0: {
          var3 = Transmogrify.field_A ? 1 : 0;
          if (2 != ((vg) this).field_i) {
            break L0;
          } else {
            if (qj.b((byte) 114)) {
              break L0;
            } else {
              if (!((vg) this).field_j.b((byte) 117)) {
                L1: {
                  if (ch.field_d == 96) {
                    ((vg) this).field_j.field_f = false;
                    if (((vg) this).field_j.field_d > 0) {
                      if (((vg) this).field_j.field_d != 3) {
                        ((vg) this).field_j.field_d = ((vg) this).field_j.field_d - 1;
                        break L1;
                      } else {
                        break L1;
                      }
                    } else {
                      ((vg) this).field_j.field_d = 2;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (ch.field_d != 97) {
                    break L2;
                  } else {
                    L3: {
                      if (2 <= ((vg) this).field_j.field_d) {
                        if (((vg) this).field_j.field_d != 2) {
                          break L3;
                        } else {
                          ((vg) this).field_j.field_d = 0;
                          break L3;
                        }
                      } else {
                        ((vg) this).field_j.field_d = ((vg) this).field_j.field_d + 1;
                        break L3;
                      }
                    }
                    ((vg) this).field_j.field_f = false;
                    break L2;
                  }
                }
                L4: {
                  if (ch.field_d != 99) {
                    break L4;
                  } else {
                    L5: {
                      ((vg) this).field_j.field_f = false;
                      if (0 > ((vg) this).field_j.field_d) {
                        break L5;
                      } else {
                        if (((vg) this).field_j.field_d > 2) {
                          break L5;
                        } else {
                          ((vg) this).field_j.field_d = 3;
                          break L4;
                        }
                      }
                    }
                    ((vg) this).field_j.field_d = ck.field_y;
                    break L4;
                  }
                }
                L6: {
                  if (98 != ch.field_d) {
                    break L6;
                  } else {
                    ((vg) this).field_j.field_f = false;
                    if (((vg) this).field_j.field_d != 3) {
                      ((vg) this).field_j.field_d = 3;
                      break L6;
                    } else {
                      ((vg) this).field_j.field_d = ck.field_y;
                      break L6;
                    }
                  }
                }
                ((vg) this).field_j.a(false);
                return;
              } else {
                ((vg) this).field_j.a(false);
                return;
              }
            }
          }
        }
        if (((vg) this).field_i == 3) {
          L7: {
            ((vg) this).field_j.b(false);
            if (ch.field_d == 96) {
              break L7;
            } else {
              if (ch.field_d != 97) {
                return;
              } else {
                break L7;
              }
            }
          }
          L8: while (true) {
            if (this.a(((vg) this).field_j.field_d, false)) {
              return;
            } else {
              ((vg) this).field_j.b(false);
              continue L8;
            }
          }
        } else {
          L9: {
            L10: {
              ((vg) this).field_j.d((byte) -6);
              if (ch.field_d == 98) {
                break L10;
              } else {
                if (ch.field_d == 99) {
                  break L10;
                } else {
                  break L9;
                }
              }
            }
            L11: while (true) {
              if (this.a(((vg) this).field_j.field_d, false)) {
                break L9;
              } else {
                ((vg) this).field_j.d((byte) -6);
                continue L11;
              }
            }
          }
          return;
        }
    }

    vg(int param0) {
        ((vg) this).field_c = -1;
        ((vg) this).field_d = -1;
        ((vg) this).field_e = -1;
        ((vg) this).field_i = param0;
        ((vg) this).field_j = new al(fd.field_h[param0].length);
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Transmogrify.field_A ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (fd.field_h[((vg) this).field_i].length <= var4) {
            if (param1 == 1448) {
              return -1;
            } else {
              return 99;
            }
          } else {
            var5 = this.f(var4, 206);
            if (this.a(var4, false)) {
              if (param0 >= this.a(var4, (byte) 123)) {
                if (param0 < this.a(var4, 180)) {
                  if (var5 <= param2) {
                    if (var5 + this.b(param1 ^ 1476, var4) > param2) {
                      return var4;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 <= param5) {
              return;
            } else {
              if (1 + param5 >= param1) {
                return;
              } else {
                L1: {
                  if (5 + param5 >= param1) {
                    break L1;
                  } else {
                    if (param4 == param6) {
                      break L1;
                    } else {
                      var7_int = (param6 >> 1) + ((param4 >> 1) - -(1 & (param4 & param6)));
                      var8 = param5;
                      var9 = param6;
                      var10 = param4;
                      var11 = param5;
                      L2: while (true) {
                        if (var11 >= param1) {
                          vg.a(param0, var8, true, param3, var9, param5, param6);
                          vg.a(param0, param1, param2, param3, param4, var8, var10);
                          break L0;
                        } else {
                          L3: {
                            var12 = lk.field_d[var11];
                            if (param3) {
                              stackOut_23_0 = dk.field_k[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = tb.field_d[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_24_0;
                          if (var13 > var7_int) {
                            L4: {
                              lk.field_d[var11] = lk.field_d[var8];
                              if (var9 <= var13) {
                                break L4;
                              } else {
                                var9 = var13;
                                break L4;
                              }
                            }
                            int incrementValue$1 = var8;
                            var8++;
                            lk.field_d[incrementValue$1] = var12;
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var13 <= var10) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                }
                var7_int = -1 + param1;
                L6: while (true) {
                  if (var7_int <= param5) {
                    return;
                  } else {
                    var8 = param5;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = lk.field_d[var8];
                          var10 = lk.field_d[1 + var8];
                          if (!h.a(var9, var10, -7079, param3)) {
                            break L8;
                          } else {
                            lk.field_d[var8] = var10;
                            lk.field_d[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var7, "vg.J(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        mi var11 = null;
        int var12 = 0;
        ti var12_ref_ti = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_12_0 = 0;
        int stackIn_40_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var16 = Transmogrify.field_A ? 1 : 0;
          var5 = param2 + this.f(param3, 206);
          var6 = this.a(param3, (byte) 123);
          var7 = this.a(param3, 180);
          var8 = fd.field_h[((vg) this).field_i][param3];
          var9 = de.field_c[var8];
          if (mg.field_d) {
            L1: {
              if (1 != var8) {
                break L1;
              } else {
                var9 = re.field_m;
                break L1;
              }
            }
            if (var8 != 7) {
              break L0;
            } else {
              var9 = ca.field_a;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (var9 == null) {
            var9 = "ERROR: missing text";
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 119;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var10 = stackIn_12_0;
        if (param1 <= -116) {
          L4: {
            L5: {
              var11 = wf.field_d;
              if (var8 == 12) {
                break L5;
              } else {
                if (var8 == 13) {
                  break L5;
                } else {
                  if (var8 != 17) {
                    if (!ci.field_g[((vg) this).field_i]) {
                      if (!param0) {
                        var11.c(var9, var7 + var6 >> 1, var11.field_y + var5, var10, -1);
                        break L4;
                      } else {
                        le.field_A.c(var9, var6 + var7 >> 1, var5 + var11.field_y, var10, -1);
                        break L4;
                      }
                    } else {
                      L6: {
                        var12 = 16710412;
                        if (var8 < 8) {
                          break L6;
                        } else {
                          if (var8 > 10) {
                            break L6;
                          } else {
                            if (param3 == ck.field_y) {
                              var12 = 9240408;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L7: {
                        if (!param0) {
                          break L7;
                        } else {
                          var12 = 16776867;
                          break L7;
                        }
                      }
                      pa.a(var5, var9, 39935, var12, -var6 + var7, var12, var6, -10, 39935);
                      break L4;
                    }
                  } else {
                    var12_ref_ti = we.field_l[am.field_n].field_a;
                    var13 = var11.a(var9);
                    var14 = 36 + var13;
                    var15 = var6 - -var7 + -var14 >> 1;
                    var12_ref_ti.c(var13 + (var15 - -((36 + -var12_ref_ti.field_n) / 2)), -24 + var5 + (var11.field_C + -1) + (-var12_ref_ti.field_m + 24) / 2);
                    if (!param0) {
                      var11.b(var9, var15, var11.field_y + var5, var10, -1);
                      break L4;
                    } else {
                      le.field_A.b(var9, var15, var11.field_y + var5, var10, -1);
                      break L4;
                    }
                  }
                }
              }
            }
            L8: {
              if (((vg) this).field_c == -1) {
                L9: {
                  var12 = var11.a(de.field_c[12]);
                  var13 = var11.a(de.field_c[13]);
                  if (var13 <= var12) {
                    break L9;
                  } else {
                    var12 = var13;
                    break L9;
                  }
                }
                ((vg) this).field_c = var6 + var7 - (-var12 + 81) >> 1;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              sb.d(((vg) this).field_c, fd.field_b[((vg) this).field_i] / 2 + var5 - 1, 81, 2, var10);
              if (var8 != 12) {
                stackOut_39_0 = (lb.field_a << 8) / 128;
                stackIn_40_0 = stackOut_39_0;
                break L10;
              } else {
                stackOut_38_0 = kc.field_g;
                stackIn_40_0 = stackOut_38_0;
                break L10;
              }
            }
            var12 = stackIn_40_0;
            var12 = 80 * var12 / 256;
            sb.d(var12 + (((vg) this).field_c + -1), 3 + var5, 3, -6 + fd.field_b[((vg) this).field_i], var10);
            if (param0) {
              le.field_A.a(var9, ((vg) this).field_c, var5 - -var11.field_y, var10, -1);
              break L4;
            } else {
              var11.a(var9, ((vg) this).field_c, var5 + var11.field_y, var10, -1);
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Members";
        field_a = "Waiting for graphics";
        field_b = null;
    }
}
