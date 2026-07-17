/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    static int field_a;

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
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
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == sg.field_d) {
                break L1;
              } else {
                qi.a((byte) 117);
                break L1;
              }
            }
            L2: {
              var2_int = ni.a((byte) -113);
              if (var2_int == 0) {
                L3: {
                  if (ad.field_e) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                ad.field_e = stackIn_8_0 != 0;
                if (ad.field_e) {
                  od discarded$21 = vk.a((byte) 115, dg.field_d[7]);
                  a.field_S.a(kk.a(param0 + 23327, oa.field_j, bk.field_a), 1, (byte) -112, param1);
                  return;
                } else {
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (var2_int >= 0) {
                L5: {
                  if (wl.a(false, 0)) {
                    var3_int = 0;
                    L6: while (true) {
                      if (var3_int >= ua.field_a.length) {
                        break L5;
                      } else {
                        L7: {
                          if (ua.field_a[var3_int].equalsIgnoreCase(of.field_e.toString())) {
                            boolean discarded$22 = fi.b(0, 240, 15);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var3_int++;
                        continue L6;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  StringBuilder discarded$23 = vi.field_g[n.field_a].append(of.field_e);
                  vi.field_a[n.field_a] = var2_int;
                  hf.field_j = hf.field_j + (var2_int << 6);
                  eh.field_a = eh.field_a + var2_int;
                  var18 = dg.field_d[10].field_l;
                  var17 = var18;
                  var16 = var17;
                  var13 = var16;
                  var3 = var13;
                  var4 = var3[(2147483647 & bc.field_b) % var18.length];
                  nc.field_t = nc.field_t + var4 * jk.field_B;
                  gh.field_l = gh.field_l + var4;
                  od discarded$24 = vk.a((byte) 123, dg.field_d[1]);
                  var5 = var2_int;
                  if (var2_int > 0) {
                    var6 = 0;
                    var7 = 0;
                    L9: while (true) {
                      L10: {
                        if (~gd.field_n.length >= ~var7) {
                          break L10;
                        } else {
                          if (~gd.field_n[var7] < ~field_a) {
                            var6++;
                            var7++;
                            continue L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      wk.field_d = wk.field_d + var6;
                      var7 = gj.a((byte) -39, vi.field_g[n.field_a].toString(), true);
                      if (0 < n.field_a) {
                        eh.field_a = eh.field_a + var7;
                        var5 = var5 + var7;
                        ce.field_c = ce.field_c + var7;
                        hf.field_j = hf.field_j + (var7 << 6);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L11: {
                  L12: {
                    n.field_a = n.field_a + 1;
                    rb.field_a = rb.field_a + field_a;
                    re.field_A = 0;
                    eg.field_b = 0;
                    field_a = 0;
                    var6 = 0;
                    if (n.field_a == 10) {
                      rb.field_a = rb.field_a / 10;
                      var7 = 0;
                      var8 = 0;
                      L13: while (true) {
                        L14: {
                          if (var8 >= gd.field_n.length) {
                            break L14;
                          } else {
                            if (~gd.field_n[var8] < ~rb.field_a) {
                              var7 += 5;
                              var8++;
                              continue L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var8 = 0;
                        var9 = 0;
                        L15: while (true) {
                          if (10 <= var9) {
                            L16: {
                              var7 = var8 * var7 / 10;
                              wk.field_d = wk.field_d + var7;
                              vh.field_n = vh.field_n - (wk.field_d << 5);
                              eh.field_a = eh.field_a + wk.field_d;
                              hf.field_j = hf.field_j + (wk.field_d << 5);
                              ug.b(true);
                              if (100 > wk.field_d) {
                                break L16;
                              } else {
                                L17: {
                                  if (fi.b(0, 243, 12)) {
                                    var6++;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (wk.field_d < 150) {
                                    break L18;
                                  } else {
                                    if (!fi.b(0, 242, 13)) {
                                      break L18;
                                    } else {
                                      var6++;
                                      break L18;
                                    }
                                  }
                                }
                                if (eh.field_a < 600) {
                                  break L16;
                                } else {
                                  if (!fi.b(0, 241, 14)) {
                                    break L16;
                                  } else {
                                    var6++;
                                    break L16;
                                  }
                                }
                              }
                            }
                            var9 = 0;
                            var10 = 0;
                            L19: while (true) {
                              L20: {
                                if (var10 >= 12) {
                                  break L20;
                                } else {
                                  var11 = od.field_g.field_e[var10];
                                  if (var11 != null) {
                                    L21: {
                                      if (var11.field_l != 9) {
                                        break L21;
                                      } else {
                                        if (qi.field_c.field_d.indexOf((int) var11.field_i) != -1) {
                                          break L21;
                                        } else {
                                          var9++;
                                          break L21;
                                        }
                                      }
                                    }
                                    var10++;
                                    continue L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              if (var9 >= 1) {
                                L22: {
                                  if (fi.b(0, 249, 6)) {
                                    var6++;
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                L23: {
                                  if (var9 < 2) {
                                    break L23;
                                  } else {
                                    if (!fi.b(0, 248, 7)) {
                                      break L23;
                                    } else {
                                      var6++;
                                      break L23;
                                    }
                                  }
                                }
                                L24: {
                                  if (eh.field_a < 300) {
                                    break L24;
                                  } else {
                                    var6 = var6 + (-200 + eh.field_a) / 100;
                                    break L24;
                                  }
                                }
                                L25: {
                                  if (800 > eh.field_a) {
                                    if (400 > eh.field_a) {
                                      wd.a(17099, false, bd.field_u[9]);
                                      break L25;
                                    } else {
                                      wd.a(17099, false, bd.field_u[8]);
                                      break L25;
                                    }
                                  } else {
                                    wd.a(17099, false, bd.field_u[7]);
                                    break L25;
                                  }
                                }
                                if (var6 != 0) {
                                  break L12;
                                } else {
                                  var6++;
                                  break L12;
                                }
                              } else {
                                L26: {
                                  if (eh.field_a < 300) {
                                    break L26;
                                  } else {
                                    var6 = var6 + (-200 + eh.field_a) / 100;
                                    break L26;
                                  }
                                }
                                L27: {
                                  if (800 > eh.field_a) {
                                    if (400 > eh.field_a) {
                                      wd.a(17099, false, bd.field_u[9]);
                                      break L27;
                                    } else {
                                      wd.a(17099, false, bd.field_u[8]);
                                      break L27;
                                    }
                                  } else {
                                    wd.a(17099, false, bd.field_u[7]);
                                    break L27;
                                  }
                                }
                                L28: {
                                  if (var6 != 0) {
                                    break L28;
                                  } else {
                                    var6++;
                                    break L28;
                                  }
                                }
                                L29: {
                                  if (eh.field_a < 600) {
                                    break L29;
                                  } else {
                                    L30: {
                                      if (!fi.b(0, 255, 0)) {
                                        break L30;
                                      } else {
                                        var6++;
                                        break L30;
                                      }
                                    }
                                    if (1000 > eh.field_a) {
                                      break L29;
                                    } else {
                                      if (fi.b(param0 + 22991, 254, 1)) {
                                        var6++;
                                        break L29;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                                L31: {
                                  if (100 > var2_int) {
                                    break L31;
                                  } else {
                                    if (!fi.b(0, 244, 11)) {
                                      break L31;
                                    } else {
                                      var6++;
                                      break L31;
                                    }
                                  }
                                }
                                var8 = 2147483647;
                                var9 = 0;
                                var7 = 0;
                                L32: while (true) {
                                  if (var7 >= 12) {
                                    break L11;
                                  } else {
                                    var14 = od.field_g.field_e[var7];
                                    if (var14 == null) {
                                      break L11;
                                    } else {
                                      L33: {
                                        if (var14.field_l <= 0) {
                                          break L33;
                                        } else {
                                          var9++;
                                          break L33;
                                        }
                                      }
                                      L34: {
                                        if (~var14.field_h > ~var8) {
                                          var8 = var14.field_h;
                                          break L34;
                                        } else {
                                          break L34;
                                        }
                                      }
                                      var7++;
                                      continue L32;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L35: {
                              if (vi.field_a[var9] > 0) {
                                var8++;
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            var9++;
                            continue L15;
                          }
                        }
                      }
                    } else {
                      if (var5 > 100) {
                        var6 += 4;
                        break L12;
                      } else {
                        if (75 >= var5) {
                          if (var5 > 50) {
                            var6 += 2;
                            break L12;
                          } else {
                            if (var5 <= 20) {
                              break L12;
                            } else {
                              var6++;
                              break L12;
                            }
                          }
                        } else {
                          var6 += 3;
                          break L12;
                        }
                      }
                    }
                  }
                  L36: {
                    if (eh.field_a < 600) {
                      break L36;
                    } else {
                      L37: {
                        if (!fi.b(0, 255, 0)) {
                          break L37;
                        } else {
                          var6++;
                          break L37;
                        }
                      }
                      if (1000 > eh.field_a) {
                        break L36;
                      } else {
                        if (fi.b(param0 + 22991, 254, 1)) {
                          var6++;
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  L38: {
                    if (100 > var2_int) {
                      break L38;
                    } else {
                      if (!fi.b(0, 244, 11)) {
                        break L38;
                      } else {
                        var6++;
                        break L38;
                      }
                    }
                  }
                  var8 = 2147483647;
                  var9 = 0;
                  var7 = 0;
                  L39: while (true) {
                    if (var7 >= 12) {
                      break L11;
                    } else {
                      var15 = od.field_g.field_e[var7];
                      if (var15 == null) {
                        break L11;
                      } else {
                        L40: {
                          if (var15.field_l <= 0) {
                            break L40;
                          } else {
                            var9++;
                            break L40;
                          }
                        }
                        L41: {
                          if (~var15.field_h > ~var8) {
                            var8 = var15.field_h;
                            break L41;
                          } else {
                            break L41;
                          }
                        }
                        var7++;
                        continue L39;
                      }
                    }
                  }
                }
                L42: {
                  if (var7 >= 10) {
                    L43: {
                      if (!fi.b(0, 247, 8)) {
                        break L43;
                      } else {
                        var6++;
                        break L43;
                      }
                    }
                    if (var7 != 12) {
                      break L42;
                    } else {
                      if (fi.b(0, 246, 9)) {
                        var6++;
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                  } else {
                    break L42;
                  }
                }
                L44: {
                  if (0 >= var7) {
                    break L44;
                  } else {
                    if (var8 >= 2) {
                      L45: {
                        if (fi.b(0, 251, 4)) {
                          var6++;
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      if (var8 < 3) {
                        break L44;
                      } else {
                        if (fi.b(0, 250, 5)) {
                          var6++;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                    } else {
                      break L44;
                    }
                  }
                }
                L46: {
                  if (1 >= n.field_a) {
                    break L46;
                  } else {
                    var10 = vi.field_g[-2 + n.field_a].length();
                    if (~var10 == ~var9) {
                      if (var7 != var10) {
                        if (var7 < 3 + var10) {
                          break L46;
                        } else {
                          if (var10 < 4) {
                            break L46;
                          } else {
                            if (!fi.b(0, 245, 10)) {
                              break L46;
                            } else {
                              var6++;
                              break L46;
                            }
                          }
                        }
                      } else {
                        if (var7 >= 6) {
                          L47: {
                            if (fi.b(0, 253, 2)) {
                              var6++;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                          if (var7 < 9) {
                            break L46;
                          } else {
                            if (!fi.b(param0 ^ -22991, 252, 3)) {
                              break L46;
                            } else {
                              var6++;
                              break L46;
                            }
                          }
                        } else {
                          break L46;
                        }
                      }
                    } else {
                      break L46;
                    }
                  }
                }
                L48: {
                  if (var6 != 1) {
                    if (var6 == 2) {
                      od discarded$25 = jj.a((byte) 105, 0, dg.field_d[11]);
                      od discarded$26 = jj.a((byte) 95, 256, dg.field_d[8]);
                      od discarded$27 = fa.a(256, dg.field_d[11], (byte) 125, 40);
                      od discarded$28 = fa.a(0, dg.field_d[8], (byte) 127, 40);
                      break L48;
                    } else {
                      if (3 == var6) {
                        od discarded$29 = jj.a((byte) 90, 0, dg.field_d[9]);
                        od discarded$30 = fa.a(256, dg.field_d[9], (byte) 125, 40);
                        break L48;
                      } else {
                        if (var6 == 4) {
                          od discarded$31 = jj.a((byte) 85, 0, dg.field_d[12]);
                          od discarded$32 = fa.a(256, dg.field_d[12], (byte) 125, 40);
                          break L48;
                        } else {
                          if (var6 == 5) {
                            od discarded$33 = jj.a((byte) 105, 0, dg.field_d[10]);
                            od discarded$34 = fa.a(256, dg.field_d[10], (byte) 127, 40);
                            break L48;
                          } else {
                            if (var6 > 0) {
                              od discarded$35 = jj.a((byte) 115, 0, dg.field_d[12]);
                              od discarded$36 = jj.a((byte) 119, 256, dg.field_d[10]);
                              od discarded$37 = fa.a(256, dg.field_d[12], (byte) 127, 40);
                              od discarded$38 = fa.a(0, dg.field_d[10], (byte) 126, 40);
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    od discarded$39 = jj.a((byte) 78, 0, dg.field_d[11]);
                    od discarded$40 = fa.a(256, dg.field_d[11], (byte) 127, 40);
                    break L48;
                  }
                }
                L49: {
                  if (n.field_a <= 1) {
                    break L49;
                  } else {
                    if (0 == var6) {
                      hi.field_a = 4;
                      break L49;
                    } else {
                      break L49;
                    }
                  }
                }
                L50: {
                  if (4 > var6) {
                    if (var6 < 2) {
                      break L50;
                    } else {
                      hi.field_a = 1;
                      break L50;
                    }
                  } else {
                    hi.field_a = 17;
                    break L50;
                  }
                }
                bg.field_m = 1500;
                if (10 != n.field_a) {
                  break L4;
                } else {
                  hi.field_a = 28;
                  break L4;
                }
              } else {
                od discarded$41 = vk.a((byte) 98, dg.field_d[2]);
                break L4;
              }
            }
            L51: {
              if (param0 == -22991) {
                break L51;
              } else {
                field_a = -122;
                break L51;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "dc.B(" + param0 + 44 + param1 + 41);
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
