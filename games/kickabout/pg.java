/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static uh field_d;
    static String field_c;
    static int field_b;
    static String[] field_a;

    final static void a(int param0, boolean param1) {
        rf stackIn_3_0 = null;
        L0: {
          if (!param1) {
            stackIn_3_0 = new rf(c.field_d, fm.field_C);
            break L0;
          } else {
            stackIn_3_0 = new rf(lb.field_H, w.field_e);
            break L0;
          }
        }
        ni.field_l = stackIn_3_0;
        dn.field_Cb = new hd(0L, (hd) null);
        if (param0 != -35) {
          field_c = (String) null;
          dn.field_Cb.a((byte) -110, (hd) (ni.field_l.field_b));
          dn.field_Cb.a((byte) -126, ac.field_b);
          tn.field_f = new hd(0L, tv.field_e);
          vj.field_g = new hd(0L, (hd) null);
          tn.field_f.a((byte) -125, is.field_b);
          tn.field_f.a((byte) -105, vj.field_g);
          vj.field_g.a((byte) -124, mc.field_d);
          vj.field_g.a((byte) -119, kt.field_i);
          bq.a(93, param1);
          return;
        } else {
          dn.field_Cb.a((byte) -110, (hd) (ni.field_l.field_b));
          dn.field_Cb.a((byte) -126, ac.field_b);
          tn.field_f = new hd(0L, tv.field_e);
          vj.field_g = new hd(0L, (hd) null);
          tn.field_f.a((byte) -125, is.field_b);
          tn.field_f.a((byte) -105, vj.field_g);
          vj.field_g.a((byte) -124, mc.field_d);
          vj.field_g.a((byte) -119, kt.field_i);
          bq.a(93, param1);
          return;
        }
    }

    final static int a(int param0) {
        int stackIn_11_0 = 0;
        int stackIn_28_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = Kickabout.field_G;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!nk.b((byte) -59)) {
                L2: {
                  ll.field_k.a(-21174, sj.a(el.field_A, n.field_m, (byte) -96), sj.a(sm.field_q, vc.field_y, (byte) -101));
                  if (!ll.field_k.c(-1)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                if (param0 == -3) {
                  L3: {
                    L4: {
                      var3 = 0;
                      if (var1_int == 0) {
                        break L4;
                      } else {
                        if (-1 < (ll.field_k.field_e ^ -1)) {
                          break L4;
                        } else {
                          var3 = sh.field_f[ll.field_k.field_e];
                          if (-3 == (var3 ^ -1)) {
                            oc.a((byte) -43);
                            break L3;
                          } else {
                            if (var3 == 5) {
                              oc.a((byte) -43);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (-3 == (ck.field_a ^ -1)) {
                        break L3;
                      } else {
                        oc.a((byte) -16);
                        break L3;
                      }
                    }
                  }
                  L5: {
                    if (var3 != 0) {
                      break L5;
                    } else {
                      if ((ck.field_a ^ -1) == -3) {
                        var4 = -va.field_o + nj.a(param0 ^ -51);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) < -1) {
                          break L5;
                        } else {
                          ba.a(true, 6, 5);
                          var3 = 2;
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackIn_28_0 = var3;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = -10;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L6: {
                  ll.field_k.d(param0 + 101);
                  if (!ll.field_k.c(param0 + 2)) {
                    break L6;
                  } else {
                    var1_int = 1;
                    break L6;
                  }
                }
                if ((cc.field_e ^ -1) != -14) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "pg.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_28_0;
        }
    }

    final static String[] a(boolean param0, int param1) {
        if (-2 != (param1 ^ -1)) {
          if (param1 == 9) {
            return rd.field_e;
          } else {
            if (10 == param1) {
              return rd.field_e;
            } else {
              if (-9 == (param1 ^ -1)) {
                return ow.field_d;
              } else {
                if ((param1 ^ -1) != -12) {
                  if ((param1 ^ -1) == -19) {
                    return fs.field_a;
                  } else {
                    if ((param1 ^ -1) == -20) {
                      return fs.field_a;
                    } else {
                      if (param1 == 32) {
                        return fs.field_a;
                      } else {
                        if (37 == param1) {
                          return fs.field_a;
                        } else {
                          if ((param1 ^ -1) == -25) {
                            return fs.field_a;
                          } else {
                            if ((param1 ^ -1) == -26) {
                              return pd.field_M;
                            } else {
                              if (!param0) {
                                if (23 == param1) {
                                  return vq.field_i;
                                } else {
                                  if ((param1 ^ -1) != -30) {
                                    if (-35 == (param1 ^ -1)) {
                                      return fs.field_a;
                                    } else {
                                      if (param1 != 30) {
                                        if ((param1 ^ -1) == -22) {
                                          return si.field_q;
                                        } else {
                                          if (param1 == 20) {
                                            return fs.field_a;
                                          } else {
                                            return fp.field_u;
                                          }
                                        }
                                      } else {
                                        return fs.field_a;
                                      }
                                    }
                                  } else {
                                    return fs.field_a;
                                  }
                                }
                              } else {
                                pg.a(false, -50);
                                if (23 == param1) {
                                  return vq.field_i;
                                } else {
                                  if ((param1 ^ -1) != -30) {
                                    if (-35 == (param1 ^ -1)) {
                                      return fs.field_a;
                                    } else {
                                      if (param1 != 30) {
                                        if ((param1 ^ -1) == -22) {
                                          return si.field_q;
                                        } else {
                                          if (param1 == 20) {
                                            return fs.field_a;
                                          } else {
                                            return fp.field_u;
                                          }
                                        }
                                      } else {
                                        return fs.field_a;
                                      }
                                    }
                                  } else {
                                    return fs.field_a;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  return fs.field_a;
                }
              }
            }
          }
        } else {
          return nn.field_I;
        }
    }

    public static void b(int param0) {
        if (param0 <= 125) {
            return;
        }
        field_a = null;
        field_d = null;
        field_c = null;
    }

    final static gm a(int param0, int param1, up param2, int param3, int param4) {
        long var5_long = 0L;
        RuntimeException var5 = null;
        gm stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        up stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        up stackIn_8_3;
        int stackIn_8_4;
        up stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        up stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        up stackIn_13_0;
        int stackIn_13_1;
        int stackIn_13_2;
        int stackIn_13_3;
        gm stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 < -62) {
              var5_long = nj.a(51);
              if (80L <= -tr.field_d + var5_long) {
                L1: {
                  tr.field_d = var5_long;
                  stackIn_8_0 = (up) (param2);

                  stackIn_8_1 = param1;

                  stackIn_8_2 = param4;

                  stackIn_8_3 = (up) (param2);

                  stackIn_8_4 = -107;

                  if (param2.f(13467)) {
                    stackIn_9_0 = (up) ((Object) stackIn_8_0);
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = stackIn_8_2;
                    stackIn_9_3 = (up) ((Object) stackIn_8_3);
                    stackIn_9_4 = stackIn_8_4;
                    stackIn_9_5 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = (up) ((Object) stackIn_8_0);
                    stackIn_9_1 = stackIn_8_1;
                    stackIn_9_2 = stackIn_8_2;
                    stackIn_9_3 = (up) ((Object) stackIn_8_3);
                    stackIn_9_4 = stackIn_8_4;
                    stackIn_9_5 = 1;
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    stackIn_9_0 = (up) ((Object) stackIn_9_0);

                    if (!((up) (Object) stackIn_9_3).c((byte) stackIn_9_4, stackIn_9_5 != 0)) {
                      break L3;
                    } else {
                      stackIn_9_0 = (up) ((Object) stackIn_9_0);

                      if (!wn.a((byte) 34)) {
                        break L3;
                      } else {
                        stackIn_13_0 = (up) ((Object) stackIn_9_0);
                        stackIn_13_1 = stackIn_9_1;
                        stackIn_13_2 = stackIn_9_2;
                        stackIn_13_3 = 1;
                        break L2;
                      }
                    }
                  }
                  stackIn_13_0 = (up) ((Object) stackIn_9_0);
                  stackIn_13_1 = stackIn_9_1;
                  stackIn_13_2 = stackIn_9_2;
                  stackIn_13_3 = 0;
                  break L2;
                }
                stackIn_14_0 = mg.a(stackIn_13_0, stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0, param0, (byte) 106);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (gm) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("pg.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (gm) ((Object) stackIn_5_0);
          } else {
            return stackIn_14_0;
          }
        }
    }

    static {
        field_c = "Close";
    }
}
