/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static java.awt.Frame field_c;
    static nk field_e;
    static int field_b;
    static String field_d;
    static ck field_a;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        L0: {
          var3 = client.field_A ? 1 : 0;
          if (!param0) {
            if (null != cd.field_m) {
              L1: {
                if (null == cd.field_m) {
                  if (null == g.field_N) {
                    dn.field_k = false;
                    if (-1 <= bf.field_r) {
                      if (tg.field_e > 0) {
                        L2: {
                          tg.field_e = tg.field_e - 1;
                          if (param1 == -1843) {
                            break L2;
                          } else {
                            field_b = -111;
                            break L2;
                          }
                        }
                        return;
                      } else {
                        if (dl.field_M <= lg.field_W) {
                          break L1;
                        } else {
                          L3: {
                            if (-1 == lg.field_W) {
                              tj.h((byte) -40);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          lg.field_W = lg.field_W + 1;
                          break L1;
                        }
                      }
                    } else {
                      L4: {
                        bf.field_r = bf.field_r - 1;
                        if (param1 == -1843) {
                          break L4;
                        } else {
                          field_b = -111;
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    if (lg.field_W > 0) {
                      lg.field_W = lg.field_W - 1;
                      break L1;
                    } else {
                      if ((tg.field_e ^ -1) < -1) {
                        tg.field_e = tg.field_e - 1;
                        break L1;
                      } else {
                        if (dl.field_M > bf.field_r) {
                          if (0 == bf.field_r) {
                            mg.b(param1 + 1843, true);
                            bf.field_r = bf.field_r + 1;
                            break L1;
                          } else {
                            bf.field_r = bf.field_r + 1;
                            if (param1 != -1843) {
                              field_b = -111;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  if (0 < lg.field_W) {
                    lg.field_W = lg.field_W - 1;
                    break L1;
                  } else {
                    if (0 < bf.field_r) {
                      bf.field_r = bf.field_r - 1;
                      break L1;
                    } else {
                      if (tg.field_e < dl.field_M) {
                        L5: {
                          if (tg.field_e == 0) {
                            mg.b(0, false);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        tg.field_e = tg.field_e + 1;
                        break L1;
                      } else {
                        if (param1 != -1843) {
                          field_b = -111;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (param1 != -1843) {
                field_b = -111;
                return;
              } else {
                return;
              }
            } else {
              dn.field_k = false;
              break L0;
            }
          } else {
            dn.field_k = false;
            break L0;
          }
        }
        L6: {
          if (param0) {
            if (0 < lg.field_W) {
              lg.field_W = lg.field_W - 1;
              if (param1 == -1843) {
                return;
              } else {
                field_b = -111;
                return;
              }
            } else {
              if ((bf.field_r ^ -1) < -1) {
                bf.field_r = bf.field_r - 1;
                if (param1 == -1843) {
                  return;
                } else {
                  field_b = -111;
                  return;
                }
              } else {
                if (tg.field_e <= 0) {
                  break L6;
                } else {
                  tg.field_e = tg.field_e - 1;
                  if (param1 == -1843) {
                    return;
                  } else {
                    field_b = -111;
                    return;
                  }
                }
              }
            }
          } else {
            if (null == cd.field_m) {
              if (null == g.field_N) {
                dn.field_k = false;
                if (-1 > bf.field_r) {
                  bf.field_r = bf.field_r - 1;
                  if (param1 == -1843) {
                    return;
                  } else {
                    field_b = -111;
                    return;
                  }
                } else {
                  if (tg.field_e > 0) {
                    tg.field_e = tg.field_e - 1;
                    if (param1 == -1843) {
                      return;
                    } else {
                      field_b = -111;
                      return;
                    }
                  } else {
                    if (dl.field_M > lg.field_W) {
                      L7: {
                        if (-1 == lg.field_W) {
                          tj.h((byte) -40);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      lg.field_W = lg.field_W + 1;
                      if (param1 == -1843) {
                        return;
                      } else {
                        field_b = -111;
                        return;
                      }
                    } else {
                      if (param1 == -1843) {
                        return;
                      } else {
                        field_b = -111;
                        return;
                      }
                    }
                  }
                }
              } else {
                if (lg.field_W > 0) {
                  lg.field_W = lg.field_W - 1;
                  if (param1 == -1843) {
                    return;
                  } else {
                    field_b = -111;
                    return;
                  }
                } else {
                  if ((tg.field_e ^ -1) < -1) {
                    tg.field_e = tg.field_e - 1;
                    if (param1 != -1843) {
                      field_b = -111;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (dl.field_M > bf.field_r) {
                      L8: {
                        if (0 != bf.field_r) {
                          break L8;
                        } else {
                          mg.b(param1 + 1843, true);
                          break L8;
                        }
                      }
                      bf.field_r = bf.field_r + 1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
              }
            } else {
              if (0 < lg.field_W) {
                lg.field_W = lg.field_W - 1;
                break L6;
              } else {
                if (0 < bf.field_r) {
                  bf.field_r = bf.field_r - 1;
                  break L6;
                } else {
                  if (tg.field_e < dl.field_M) {
                    L9: {
                      if (tg.field_e == 0) {
                        mg.b(0, false);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    tg.field_e = tg.field_e + 1;
                    break L6;
                  } else {
                    if (param1 != -1843) {
                      field_b = -111;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
        if (param1 == -1843) {
          return;
        } else {
          field_b = -111;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        if (param0 < 59) {
          hg.a(true, -112);
          if (null != gn.field_e) {
            if (gn.field_e.length <= te.field_w) {
              L0: {
                var6 = te.field_w * 2;
                if (var6 == 0) {
                  var6 = 80;
                  break L0;
                } else {
                  break L0;
                }
              }
              var7 = new int[var6];
              var8 = 0;
              L1: while (true) {
                if (te.field_w <= var8) {
                  gn.field_e = var7;
                  int fieldTemp$40 = te.field_w;
                  te.field_w = te.field_w + 1;
                  gn.field_e[fieldTemp$40] = param2;
                  int fieldTemp$41 = te.field_w;
                  te.field_w = te.field_w + 1;
                  gn.field_e[fieldTemp$41] = param1;
                  int fieldTemp$42 = te.field_w;
                  te.field_w = te.field_w + 1;
                  gn.field_e[fieldTemp$42] = param5;
                  int fieldTemp$43 = te.field_w;
                  te.field_w = te.field_w + 1;
                  gn.field_e[fieldTemp$43] = param4;
                  int fieldTemp$44 = te.field_w;
                  te.field_w = te.field_w + 1;
                  gn.field_e[fieldTemp$44] = param3;
                  return;
                } else {
                  var7[var8] = gn.field_e[var8];
                  var8++;
                  continue L1;
                }
              }
            } else {
              int fieldTemp$45 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$45] = param2;
              int fieldTemp$46 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$46] = param1;
              int fieldTemp$47 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$47] = param5;
              int fieldTemp$48 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$48] = param4;
              int fieldTemp$49 = te.field_w;
              te.field_w = te.field_w + 1;
              gn.field_e[fieldTemp$49] = param3;
              return;
            }
          } else {
            L2: {
              var6 = te.field_w * 2;
              if (var6 == 0) {
                var6 = 80;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = new int[var6];
            var8 = 0;
            L3: while (true) {
              if (te.field_w <= var8) {
                gn.field_e = var7;
                int fieldTemp$50 = te.field_w;
                te.field_w = te.field_w + 1;
                gn.field_e[fieldTemp$50] = param2;
                int fieldTemp$51 = te.field_w;
                te.field_w = te.field_w + 1;
                gn.field_e[fieldTemp$51] = param1;
                int fieldTemp$52 = te.field_w;
                te.field_w = te.field_w + 1;
                gn.field_e[fieldTemp$52] = param5;
                int fieldTemp$53 = te.field_w;
                te.field_w = te.field_w + 1;
                gn.field_e[fieldTemp$53] = param4;
                int fieldTemp$54 = te.field_w;
                te.field_w = te.field_w + 1;
                gn.field_e[fieldTemp$54] = param3;
                return;
              } else {
                var7[var8] = gn.field_e[var8];
                var8++;
                continue L3;
              }
            }
          }
        } else {
          L4: {
            L5: {
              if (null == gn.field_e) {
                break L5;
              } else {
                if (gn.field_e.length <= te.field_w) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              var6 = te.field_w * 2;
              if (var6 == 0) {
                var6 = 80;
                break L6;
              } else {
                break L6;
              }
            }
            var7 = new int[var6];
            var8 = 0;
            L7: while (true) {
              if (te.field_w <= var8) {
                gn.field_e = var7;
                break L4;
              } else {
                var7[var8] = gn.field_e[var8];
                var8++;
                continue L7;
              }
            }
          }
          int fieldTemp$55 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$55] = param2;
          int fieldTemp$56 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$56] = param1;
          int fieldTemp$57 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$57] = param5;
          int fieldTemp$58 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$58] = param4;
          int fieldTemp$59 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$59] = param3;
          return;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 87) {
            return;
        }
        field_d = null;
        field_c = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Activating Special Items";
    }
}
