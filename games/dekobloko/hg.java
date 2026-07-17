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
          if (param0) {
            dn.field_k = false;
            break L0;
          } else {
            if (null == cd.field_m) {
              dn.field_k = false;
              break L0;
            } else {
              L1: {
                if (param0) {
                  if (0 < lg.field_W) {
                    L2: {
                      lg.field_W = lg.field_W - 1;
                      if (param1 == -1843) {
                        break L2;
                      } else {
                        field_b = -111;
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (bf.field_r > 0) {
                      L3: {
                        bf.field_r = bf.field_r - 1;
                        if (param1 == -1843) {
                          break L3;
                        } else {
                          field_b = -111;
                          break L3;
                        }
                      }
                      return;
                    } else {
                      if (tg.field_e <= 0) {
                        break L1;
                      } else {
                        L4: {
                          tg.field_e = tg.field_e - 1;
                          if (param1 == -1843) {
                            break L4;
                          } else {
                            field_b = -111;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  if (null == cd.field_m) {
                    if (null == g.field_N) {
                      dn.field_k = false;
                      if (bf.field_r > 0) {
                        L5: {
                          bf.field_r = bf.field_r - 1;
                          if (param1 == -1843) {
                            break L5;
                          } else {
                            field_b = -111;
                            break L5;
                          }
                        }
                        return;
                      } else {
                        if (tg.field_e > 0) {
                          L6: {
                            tg.field_e = tg.field_e - 1;
                            if (param1 == -1843) {
                              break L6;
                            } else {
                              field_b = -111;
                              break L6;
                            }
                          }
                          return;
                        } else {
                          if (dl.field_M <= lg.field_W) {
                            break L1;
                          } else {
                            L7: {
                              if (lg.field_W == 0) {
                                tj.h((byte) -40);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            lg.field_W = lg.field_W + 1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (lg.field_W > 0) {
                        lg.field_W = lg.field_W - 1;
                        break L1;
                      } else {
                        if (tg.field_e > 0) {
                          tg.field_e = tg.field_e - 1;
                          break L1;
                        } else {
                          if (~dl.field_M < ~bf.field_r) {
                            if (0 == bf.field_r) {
                              mg.b(param1 + 1843, true);
                              bf.field_r = bf.field_r + 1;
                              break L1;
                            } else {
                              bf.field_r = bf.field_r + 1;
                              if (param1 == -1843) {
                                return;
                              } else {
                                field_b = -111;
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
                          L8: {
                            if (tg.field_e == 0) {
                              mg.b(0, false);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          tg.field_e = tg.field_e + 1;
                          break L1;
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
          }
        }
        L9: {
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
              if (bf.field_r > 0) {
                bf.field_r = bf.field_r - 1;
                if (param1 == -1843) {
                  return;
                } else {
                  field_b = -111;
                  return;
                }
              } else {
                if (tg.field_e <= 0) {
                  break L9;
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
                if (bf.field_r > 0) {
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
                      L10: {
                        if (lg.field_W == 0) {
                          tj.h((byte) -40);
                          break L10;
                        } else {
                          break L10;
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
                  if (tg.field_e > 0) {
                    tg.field_e = tg.field_e - 1;
                    if (param1 == -1843) {
                      return;
                    } else {
                      field_b = -111;
                      return;
                    }
                  } else {
                    if (~dl.field_M < ~bf.field_r) {
                      L11: {
                        if (0 != bf.field_r) {
                          break L11;
                        } else {
                          mg.b(param1 + 1843, true);
                          break L11;
                        }
                      }
                      bf.field_r = bf.field_r + 1;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            } else {
              if (0 < lg.field_W) {
                lg.field_W = lg.field_W - 1;
                break L9;
              } else {
                if (0 < bf.field_r) {
                  bf.field_r = bf.field_r - 1;
                  break L9;
                } else {
                  if (tg.field_e < dl.field_M) {
                    L12: {
                      if (tg.field_e == 0) {
                        mg.b(0, false);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    tg.field_e = tg.field_e + 1;
                    break L9;
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
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 59) {
                break L1;
              } else {
                hg.a(true, -112);
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == gn.field_e) {
                  break L3;
                } else {
                  if (gn.field_e.length <= te.field_w) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var6_int = te.field_w * 2;
                if (var6_int == 0) {
                  var6_int = 80;
                  break L4;
                } else {
                  break L4;
                }
              }
              var7 = new int[var6_int];
              var8 = 0;
              L5: while (true) {
                if (te.field_w <= var8) {
                  gn.field_e = var7;
                  break L2;
                } else {
                  var7[var8] = gn.field_e[var8];
                  var8++;
                  continue L5;
                }
              }
            }
            int fieldTemp$10 = te.field_w;
            te.field_w = te.field_w + 1;
            gn.field_e[fieldTemp$10] = param2;
            int fieldTemp$11 = te.field_w;
            te.field_w = te.field_w + 1;
            gn.field_e[fieldTemp$11] = param1;
            int fieldTemp$12 = te.field_w;
            te.field_w = te.field_w + 1;
            gn.field_e[fieldTemp$12] = param5;
            int fieldTemp$13 = te.field_w;
            te.field_w = te.field_w + 1;
            gn.field_e[fieldTemp$13] = param4;
            int fieldTemp$14 = te.field_w;
            te.field_w = te.field_w + 1;
            gn.field_e[fieldTemp$14] = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hg.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
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
