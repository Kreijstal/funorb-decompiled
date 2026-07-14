/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pd extends sd {
    private long field_d;
    static ah field_e;
    static gn field_f;
    static String field_g;
    static go field_h;
    private String field_i;

    kb a(boolean param0) {
        if (!param0) {
            return null;
        }
        return jh.field_d;
    }

    final static int a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = HoldTheLine.field_D;
        dl.field_i = dl.field_i + 65536;
        L0: while (true) {
          if (on.a(bg.field_c, dl.field_i, (byte) -100) < 65536) {
            L1: {
              var2 = -1;
              if (param0 == -86) {
                break L1;
              } else {
                var6 = null;
                pd.a((hj) null, 75, -15, -53, 82, 25);
                break L1;
              }
            }
            L2: {
              if (qk.field_y != null) {
                var2 = qk.field_y.length;
                break L2;
              } else {
                if (null != lf.field_a) {
                  var2 = lf.field_a.length;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var2 != -1) {
                L4: {
                  if (bg.field_f <= hk.field_e) {
                    break L4;
                  } else {
                    L5: {
                      hk.field_e = hk.field_e + 1;
                      if (hk.field_e <= bg.field_g) {
                        break L5;
                      } else {
                        L6: {
                          if (null == qk.field_y) {
                            break L6;
                          } else {
                            if (null != qk.field_y[va.field_e]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        hk.field_e = hk.field_e - 1;
                        break L4;
                      }
                    }
                    if (bg.field_f > hk.field_e) {
                      break L4;
                    } else {
                      if (qk.field_y[(1 + va.field_e) % var2] == null) {
                        hk.field_e = hk.field_e - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L7: {
                  if (hk.field_e >= bg.field_f) {
                    hf.field_i = va.field_e;
                    hk.field_e = hk.field_e - bg.field_f;
                    if (!rg.field_e) {
                      va.field_e = va.field_e - 1;
                      if (va.field_e >= 0) {
                        break L7;
                      } else {
                        va.field_e = va.field_e + var2;
                        break L7;
                      }
                    } else {
                      va.field_e = va.field_e + 1;
                      if (va.field_e < var2) {
                        break L7;
                      } else {
                        va.field_e = va.field_e - var2;
                        break L7;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
                if (bg.field_g >= hk.field_e) {
                  break L3;
                } else {
                  rg.field_e = true;
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L8: {
              if (null != nl.field_i) {
                L9: {
                  var3 = -(nl.field_i.field_v / 2) + 357;
                  var4 = 0;
                  if (-1 == (gg.field_J ^ -1)) {
                    break L9;
                  } else {
                    if (jb.field_U <= var3) {
                      break L9;
                    } else {
                      if (nl.field_i.field_y + var3 > jb.field_U) {
                        L10: {
                          if (-nl.field_i.field_s + 269 >= lb.field_x) {
                            break L10;
                          } else {
                            if (lb.field_x < 269) {
                              var4 = 1;
                              hk.field_e = bg.field_f;
                              rg.field_e = false;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                        }
                        if ((lb.field_x ^ -1) >= -587) {
                          break L9;
                        } else {
                          if (lb.field_x < nl.field_i.field_s + 586) {
                            hk.field_e = bg.field_f;
                            rg.field_e = true;
                            var4 = 1;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                if (var4 != 0) {
                  break L8;
                } else {
                  if (hk.field_e <= bg.field_g) {
                    break L8;
                  } else {
                    if (rf.field_X <= var3) {
                      break L8;
                    } else {
                      if (rf.field_X < var3 + nl.field_i.field_y) {
                        L11: {
                          if (-nl.field_i.field_s + 269 >= nc.field_g) {
                            break L11;
                          } else {
                            if ((nc.field_g ^ -1) <= -270) {
                              break L11;
                            } else {
                              hk.field_e = bg.field_g;
                              break L11;
                            }
                          }
                        }
                        if (nc.field_g <= 586) {
                          break L8;
                        } else {
                          if (nl.field_i.field_s + 586 > nc.field_g) {
                            hk.field_e = bg.field_g;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              } else {
                break L8;
              }
            }
            if (param1) {
              L12: {
                ln.field_k.a(wa.a(116, jb.field_U, lb.field_x), wa.a(param0 + 203, rf.field_X, nc.field_g), 4);
                if (!ln.field_k.a(-1)) {
                  break L12;
                } else {
                  if (0 != ln.field_k.field_g) {
                    if (1 != ln.field_k.field_g) {
                      break L12;
                    } else {
                      return 2;
                    }
                  } else {
                    return 3;
                  }
                }
              }
              L13: while (true) {
                if (!qh.c(-121)) {
                  return 0;
                } else {
                  L14: {
                    ln.field_k.a((byte) -21, 0);
                    if (!ln.field_k.a(-1)) {
                      break L14;
                    } else {
                      if (ln.field_k.field_g == 0) {
                        return 3;
                      } else {
                        if (ln.field_k.field_g == 1) {
                          return 1;
                        } else {
                          break L14;
                        }
                      }
                    }
                  }
                  if (-14 == (aa.field_n ^ -1)) {
                    return 1;
                  } else {
                    continue L13;
                  }
                }
              }
            } else {
              return 0;
            }
          } else {
            io.field_b = io.field_b + 1;
            dl.field_i = dl.field_i - bg.field_c;
            continue L0;
          }
        }
    }

    final static Boolean b(byte param0) {
        if (param0 != -29) {
            Object var2 = null;
            boolean discarded$0 = pd.a((vk) null, true);
        }
        Boolean var1 = wd.field_u;
        wd.field_u = null;
        return var1;
    }

    final static boolean a(vk param0, boolean param1) {
        int[] var2 = null;
        int var3_int = 0;
        mg[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        hj[] var5 = null;
        int var6_int = 0;
        hj[] var6 = null;
        int var7 = 0;
        hj var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int stackIn_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        var9 = HoldTheLine.field_D;
        if (mm.a(param0, -65)) {
          var10 = go.field_g[param0.field_p];
          var2 = var10;
          var3_int = 0;
          L0: while (true) {
            if (var10.length <= var3_int) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_e = null;
                  break L1;
                }
              }
              if (mc.field_a[9].b((byte) 116)) {
                if (!mc.field_a[11].b((byte) 124)) {
                  return false;
                } else {
                  L2: {
                    if (!kb.a(16616, 0)) {
                      break L2;
                    } else {
                      var3 = wi.field_a.a(16);
                      if (var3 == null) {
                        return false;
                      } else {
                        va.field_d = new mg[4][var3.length];
                        var4 = new int[]{16711680, 16776960, 33023, 16711935};
                        var5_int = 0;
                        L3: while (true) {
                          if (-5 >= (var5_int ^ -1)) {
                            var5 = tn.field_b.a(180);
                            if (var5 == null) {
                              return false;
                            } else {
                              var6 = var5;
                              var7 = 0;
                              L4: while (true) {
                                if (var6.length <= var7) {
                                  break L2;
                                } else {
                                  var8 = var6[var7];
                                  var8.a();
                                  var7++;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            var6_int = 0;
                            L5: while (true) {
                              if (var3.length <= var6_int) {
                                var5_int++;
                                continue L3;
                              } else {
                                va.field_d[var5_int][var6_int] = var3[var6_int].a(-4503, var4[var5_int]);
                                va.field_d[var5_int][var6_int].a(3072, false);
                                var6_int++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (!nn.a(-74)) {
                      stackOut_34_0 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      break L6;
                    } else {
                      stackOut_33_0 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      break L6;
                    }
                  }
                  return stackIn_35_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              if (ge.field_c[var10[var3_int]].field_b.c((byte) 41) == null) {
                return false;
              } else {
                if (ge.field_c[var10[var3_int]].field_z.c((byte) -117) != null) {
                  var3_int++;
                  continue L0;
                } else {
                  return false;
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final void a(int param0, th param1) {
        param1.a((byte) -84, ((pd) this).field_d);
        param1.b(param0 + param0, ((pd) this).field_i);
    }

    public static void a(int param0) {
        if (param0 > -94) {
            return;
        }
        field_f = null;
        field_e = null;
        field_g = null;
        field_h = null;
    }

    final static void a(hj param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = HoldTheLine.field_D;
        if ((param4 ^ -1) != -1025) {
          L0: {
            param3 = param3 - ((param4 + -1024) * param0.field_s >> -1192216181);
            param2 = param2 - ((param4 + -1024) * param0.field_y >> -932809397);
            var6 = param4 * param0.field_s >> 60646826;
            var7 = param4 * param0.field_y >> 1253626186;
            var8 = 0;
            if (-1 < (param3 ^ -1)) {
              var6 = var6 + param3;
              var8 = var8 + (-param3 << 1198583284) / param4;
              param3 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = 0;
            if (0 <= param2) {
              break L1;
            } else {
              var7 = var7 + param2;
              var9 = var9 + (-param2 << 1480687188) / param4;
              param2 = 0;
              break L1;
            }
          }
          L2: {
            if (param3 - -var6 > 640) {
              var6 = 640 - param3;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-481 <= (var7 + param2 ^ -1)) {
              break L3;
            } else {
              var7 = -param2 + 480;
              break L3;
            }
          }
          var11 = 0;
          var12 = 0;
          L4: while (true) {
            if (var12 >= var7) {
              L5: {
                if (param1 <= -26) {
                  break L5;
                } else {
                  field_h = null;
                  break L5;
                }
              }
              return;
            } else {
              var10 = (var12 + param2) * tc.field_j + param3;
              var11 = var8 + ((var9 >> -1415734806) * param0.field_s << 291429898);
              var13 = 0;
              L6: while (true) {
                if (var6 <= var13) {
                  var9 = var9 + 1048576 / param4;
                  var12++;
                  continue L4;
                } else {
                  L7: {
                    if (-16777216 != (param0.field_z[var11 >> -633351286] ^ -1)) {
                      if (param0.field_z[var11 >> 1544274826] == 0) {
                        break L7;
                      } else {
                        tc.field_b[var10] = param0.field_z[var11 >> -231756086];
                        break L7;
                      }
                    } else {
                      tc.field_b[var10] = param5;
                      break L7;
                    }
                  }
                  var10++;
                  var11 = var11 + 1048576 / param4;
                  var13++;
                  continue L6;
                }
              }
            }
          }
        } else {
          w.a(param5, param0, 109, param2, param3);
          return;
        }
    }

    pd(long param0, String param1) {
        ((pd) this).field_d = param0;
        ((pd) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ah();
        field_g = "One kill remaining.";
    }
}
