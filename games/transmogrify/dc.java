/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sj var11 = null;
        int var12 = 0;
        byte[] var13 = null;
        sj var14 = null;
        sj var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var12 = Transmogrify.field_A ? 1 : 0;
          if (null == sg.field_d) {
            break L0;
          } else {
            qi.a((byte) 117);
            break L0;
          }
        }
        L1: {
          var2 = ni.a((byte) -113);
          if (var2 == 0) {
            L2: {
              if (ad.field_e) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            ad.field_e = stackIn_7_0 != 0;
            if (ad.field_e) {
              od discarded$21 = vk.a((byte) 115, dg.field_d[7]);
              a.field_S.a(kk.a(param0 + 23327, oa.field_j, bk.field_a), 1, (byte) -112, param1);
              return;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          if (-1 >= (var2 ^ -1)) {
            L4: {
              if (wl.a(false, 0)) {
                var3_int = 0;
                L5: while (true) {
                  if (var3_int >= ua.field_a.length) {
                    break L4;
                  } else {
                    if (ua.field_a[var3_int].equalsIgnoreCase(of.field_e.toString())) {
                      boolean discarded$22 = fi.b(0, 240, 15);
                      var3_int++;
                      continue L5;
                    } else {
                      var3_int++;
                      continue L5;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            L6: {
              StringBuilder discarded$23 = vi.field_g[n.field_a].append(of.field_e);
              vi.field_a[n.field_a] = var2;
              hf.field_j = hf.field_j + (var2 << -565285210);
              eh.field_a = eh.field_a + var2;
              var18 = dg.field_d[10].field_l;
              var17 = var18;
              var16 = var17;
              var13 = var16;
              var3 = var13;
              var4 = var3[(2147483647 & bc.field_b) % var18.length];
              nc.field_t = nc.field_t + var4 * jk.field_B;
              gh.field_l = gh.field_l + var4;
              od discarded$24 = vk.a((byte) 123, dg.field_d[1]);
              var5 = var2;
              if ((var2 ^ -1) < -1) {
                var6 = 0;
                var7 = 0;
                L7: while (true) {
                  L8: {
                    if (gd.field_n.length <= var7) {
                      break L8;
                    } else {
                      if (gd.field_n[var7] > field_a) {
                        var6++;
                        var7++;
                        continue L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  wk.field_d = wk.field_d + var6;
                  var7 = gj.a((byte) -39, vi.field_g[n.field_a].toString(), true);
                  if (0 < n.field_a) {
                    eh.field_a = eh.field_a + var7;
                    var5 = var5 + var7;
                    ce.field_c = ce.field_c + var7;
                    hf.field_j = hf.field_j + (var7 << 1157131718);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              } else {
                break L6;
              }
            }
            L9: {
              L10: {
                n.field_a = n.field_a + 1;
                rb.field_a = rb.field_a + field_a;
                re.field_A = 0;
                eg.field_b = 0;
                field_a = 0;
                var6 = 0;
                if ((n.field_a ^ -1) == -11) {
                  rb.field_a = rb.field_a / 10;
                  var7 = 0;
                  var8 = 0;
                  L11: while (true) {
                    L12: {
                      if (var8 >= gd.field_n.length) {
                        break L12;
                      } else {
                        if (gd.field_n[var8] > rb.field_a) {
                          var7 += 5;
                          var8++;
                          continue L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var8 = 0;
                    var9 = 0;
                    L13: while (true) {
                      if (10 <= var9) {
                        L14: {
                          var7 = var8 * var7 / 10;
                          wk.field_d = wk.field_d + var7;
                          vh.field_n = vh.field_n - (wk.field_d << 1301839141);
                          eh.field_a = eh.field_a + wk.field_d;
                          hf.field_j = hf.field_j + (wk.field_d << 1374049669);
                          ug.b(true);
                          if (100 > wk.field_d) {
                            break L14;
                          } else {
                            L15: {
                              if (fi.b(0, 243, 12)) {
                                var6++;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            if (wk.field_d < 150) {
                              if ((eh.field_a ^ -1) <= -601) {
                                if (!fi.b(0, 241, 14)) {
                                  break L14;
                                } else {
                                  var6++;
                                  break L14;
                                }
                              } else {
                                if ((eh.field_a ^ -1) > -601) {
                                  break L14;
                                } else {
                                  if (!fi.b(0, 241, 14)) {
                                    break L14;
                                  } else {
                                    var6++;
                                    break L14;
                                  }
                                }
                              }
                            } else {
                              if ((eh.field_a ^ -1) > -601) {
                                break L14;
                              } else {
                                if (!fi.b(0, 241, 14)) {
                                  break L14;
                                } else {
                                  var6++;
                                  break L14;
                                }
                              }
                            }
                          }
                        }
                        var9 = 0;
                        var10 = 0;
                        L16: while (true) {
                          L17: {
                            if ((var10 ^ -1) <= -13) {
                              break L17;
                            } else {
                              var11 = od.field_g.field_e[var10];
                              if (var11 != null) {
                                if ((var11.field_l ^ -1) == -10) {
                                  if (qi.field_c.field_d.indexOf((int) var11.field_i) == 0) {
                                    var9++;
                                    var10++;
                                    continue L16;
                                  } else {
                                    var10++;
                                    continue L16;
                                  }
                                } else {
                                  var10++;
                                  continue L16;
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (var9 >= 1) {
                            L18: {
                              if (fi.b(0, 249, 6)) {
                                var6++;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var9 > -3) {
                                break L19;
                              } else {
                                if (!fi.b(0, 248, 7)) {
                                  break L19;
                                } else {
                                  var6++;
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              if (-301 > eh.field_a) {
                                break L20;
                              } else {
                                var6 = var6 + (-200 + eh.field_a) / 100;
                                break L20;
                              }
                            }
                            L21: {
                              if (800 > eh.field_a) {
                                if (400 > eh.field_a) {
                                  wd.a(17099, false, bd.field_u[9]);
                                  break L21;
                                } else {
                                  wd.a(17099, false, bd.field_u[8]);
                                  break L21;
                                }
                              } else {
                                wd.a(17099, false, bd.field_u[7]);
                                break L21;
                              }
                            }
                            if (var6 != 0) {
                              break L10;
                            } else {
                              var6++;
                              break L10;
                            }
                          } else {
                            L22: {
                              if (-301 > eh.field_a) {
                                break L22;
                              } else {
                                var6 = var6 + (-200 + eh.field_a) / 100;
                                break L22;
                              }
                            }
                            L23: {
                              if (800 > eh.field_a) {
                                if (400 > eh.field_a) {
                                  wd.a(17099, false, bd.field_u[9]);
                                  break L23;
                                } else {
                                  wd.a(17099, false, bd.field_u[8]);
                                  break L23;
                                }
                              } else {
                                wd.a(17099, false, bd.field_u[7]);
                                break L23;
                              }
                            }
                            L24: {
                              if (var6 != 0) {
                                break L24;
                              } else {
                                var6++;
                                break L24;
                              }
                            }
                            L25: {
                              if ((eh.field_a ^ -1) > -601) {
                                if (100 > var2) {
                                  break L25;
                                } else {
                                  if (fi.b(0, 244, 11)) {
                                    var6++;
                                    break L25;
                                  } else {
                                    if (100 > var2) {
                                      break L25;
                                    } else {
                                      if (!fi.b(0, 244, 11)) {
                                        break L25;
                                      } else {
                                        var6++;
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (100 > var2) {
                                  break L25;
                                } else {
                                  if (!fi.b(0, 244, 11)) {
                                    break L25;
                                  } else {
                                    var6++;
                                    break L25;
                                  }
                                }
                              }
                            }
                            var8 = 2147483647;
                            var9 = 0;
                            var7 = 0;
                            L26: while (true) {
                              if (-13 >= var7) {
                                break L9;
                              } else {
                                var14 = od.field_g.field_e[var7];
                                if (var14 == null) {
                                  break L9;
                                } else {
                                  L27: {
                                    if (-1 >= var14.field_l) {
                                      break L27;
                                    } else {
                                      var9++;
                                      break L27;
                                    }
                                  }
                                  if (var14.field_h < var8) {
                                    var8 = var14.field_h;
                                    var7++;
                                    continue L26;
                                  } else {
                                    var7++;
                                    continue L26;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        if (vi.field_a[var9] > 0) {
                          var8++;
                          var9++;
                          continue L13;
                        } else {
                          var9++;
                          continue L13;
                        }
                      }
                    }
                  }
                } else {
                  if ((var5 ^ -1) < -101) {
                    var6 += 4;
                    break L10;
                  } else {
                    if (75 >= var5) {
                      if ((var5 ^ -1) < -51) {
                        var6 += 2;
                        break L10;
                      } else {
                        if (var5 <= 20) {
                          break L10;
                        } else {
                          var6++;
                          break L10;
                        }
                      }
                    } else {
                      var6 += 3;
                      break L10;
                    }
                  }
                }
              }
              L28: {
                if ((eh.field_a ^ -1) > -601) {
                  if (100 > var2) {
                    break L28;
                  } else {
                    if (fi.b(0, 244, 11)) {
                      var6++;
                      break L28;
                    } else {
                      if (100 > var2) {
                        break L28;
                      } else {
                        if (!fi.b(0, 244, 11)) {
                          break L28;
                        } else {
                          var6++;
                          break L28;
                        }
                      }
                    }
                  }
                } else {
                  if (100 > var2) {
                    break L28;
                  } else {
                    if (!fi.b(0, 244, 11)) {
                      break L28;
                    } else {
                      var6++;
                      break L28;
                    }
                  }
                }
              }
              var8 = 2147483647;
              var9 = 0;
              var7 = 0;
              L29: while (true) {
                if (-13 >= var7) {
                  break L9;
                } else {
                  var15 = od.field_g.field_e[var7];
                  if (var15 == null) {
                    break L9;
                  } else {
                    L30: {
                      if (-1 >= var15.field_l) {
                        break L30;
                      } else {
                        var9++;
                        break L30;
                      }
                    }
                    if (var15.field_h < var8) {
                      var8 = var15.field_h;
                      var7++;
                      continue L29;
                    } else {
                      var7++;
                      continue L29;
                    }
                  }
                }
              }
            }
            L31: {
              if (-11 >= (var7 ^ -1)) {
                L32: {
                  if (!fi.b(0, 247, 8)) {
                    break L32;
                  } else {
                    var6++;
                    break L32;
                  }
                }
                if ((var7 ^ -1) != -13) {
                  break L31;
                } else {
                  if (fi.b(0, 246, 9)) {
                    var6++;
                    break L31;
                  } else {
                    break L31;
                  }
                }
              } else {
                break L31;
              }
            }
            L33: {
              if (0 >= var7) {
                break L33;
              } else {
                if ((var8 ^ -1) <= -3) {
                  L34: {
                    if (fi.b(0, 251, 4)) {
                      var6++;
                      break L34;
                    } else {
                      break L34;
                    }
                  }
                  if (var8 < 3) {
                    break L33;
                  } else {
                    if (fi.b(0, 250, 5)) {
                      var6++;
                      break L33;
                    } else {
                      break L33;
                    }
                  }
                } else {
                  break L33;
                }
              }
            }
            L35: {
              if (1 >= n.field_a) {
                break L35;
              } else {
                var10 = vi.field_g[-2 + n.field_a].length();
                if (var10 == var9) {
                  if (var7 != var10) {
                    if (var7 < 3 + var10) {
                      break L35;
                    } else {
                      if (-5 < (var10 ^ -1)) {
                        break L35;
                      } else {
                        if (!fi.b(0, 245, 10)) {
                          break L35;
                        } else {
                          var6++;
                          break L35;
                        }
                      }
                    }
                  } else {
                    if ((var7 ^ -1) <= -7) {
                      L36: {
                        if (fi.b(0, 253, 2)) {
                          var6++;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                      if ((var7 ^ -1) > -10) {
                        break L35;
                      } else {
                        if (!fi.b(param0 ^ -22991, 252, 3)) {
                          break L35;
                        } else {
                          var6++;
                          break L35;
                        }
                      }
                    } else {
                      break L35;
                    }
                  }
                } else {
                  break L35;
                }
              }
            }
            L37: {
              if ((var6 ^ -1) != -2) {
                if (var6 == -3) {
                  od discarded$25 = jj.a((byte) 105, 0, dg.field_d[11]);
                  od discarded$26 = jj.a((byte) 95, 256, dg.field_d[8]);
                  od discarded$27 = fa.a(256, dg.field_d[11], (byte) 125, 40);
                  od discarded$28 = fa.a(0, dg.field_d[8], (byte) 127, 40);
                  break L37;
                } else {
                  if (3 == var6) {
                    od discarded$29 = jj.a((byte) 90, 0, dg.field_d[9]);
                    od discarded$30 = fa.a(256, dg.field_d[9], (byte) 125, 40);
                    break L37;
                  } else {
                    if (var6 == 4) {
                      od discarded$31 = jj.a((byte) 85, 0, dg.field_d[12]);
                      od discarded$32 = fa.a(256, dg.field_d[12], (byte) 125, 40);
                      break L37;
                    } else {
                      if (var6 == 5) {
                        od discarded$33 = jj.a((byte) 105, 0, dg.field_d[10]);
                        od discarded$34 = fa.a(256, dg.field_d[10], (byte) 127, 40);
                        break L37;
                      } else {
                        if (-1 < var6) {
                          od discarded$35 = jj.a((byte) 115, 0, dg.field_d[12]);
                          od discarded$36 = jj.a((byte) 119, 256, dg.field_d[10]);
                          od discarded$37 = fa.a(256, dg.field_d[12], (byte) 127, 40);
                          od discarded$38 = fa.a(0, dg.field_d[10], (byte) 126, 40);
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                }
              } else {
                od discarded$39 = jj.a((byte) 78, 0, dg.field_d[11]);
                od discarded$40 = fa.a(256, dg.field_d[11], (byte) 127, 40);
                break L37;
              }
            }
            L38: {
              if ((n.field_a ^ -1) >= -2) {
                break L38;
              } else {
                if (0 == var6) {
                  hi.field_a = 4;
                  break L38;
                } else {
                  break L38;
                }
              }
            }
            L39: {
              if (4 > var6) {
                if (var6 < 2) {
                  break L39;
                } else {
                  hi.field_a = 1;
                  break L39;
                }
              } else {
                hi.field_a = 17;
                break L39;
              }
            }
            bg.field_m = 1500;
            if (10 != n.field_a) {
              break L3;
            } else {
              hi.field_a = 28;
              break L3;
            }
          } else {
            od discarded$41 = vk.a((byte) 98, dg.field_d[2]);
            break L3;
          }
        }
        L40: {
          if (param0 == -22991) {
            break L40;
          } else {
            field_a = -122;
            break L40;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        hi.field_c = param4;
        fi.field_x = param3;
        if (param2 > -35) {
            field_a = -68;
        }
        pi.field_k = param1;
        hd.field_d = param0;
    }

    static {
    }
}
