/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mf extends al {
    static pk field_s;
    static Calendar field_t;
    static int field_u;
    static oh[] field_q;
    static ah field_v;
    static String field_r;
    static ob field_w;

    final static boolean a(byte param0, String param1, String param2) {
        int var3 = 0;
        String var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_1_0 = 0;
        var3 = -36 % ((param0 - 89) / 33);
        param1 = um.a(param1, '_', false, "");
        var4 = dj.a(116, param2);
        if (0 == (param1.indexOf(param2) ^ -1)) {
          if ((param1.indexOf(var4) ^ -1) != 0) {
            return true;
          } else {
            return false;
          }
        } else {
          stackOut_1_0 = 1;
          stackIn_3_0 = stackOut_1_0;
          return stackIn_3_0 != 0;
        }
    }

    mf(jb param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_N, -1, 2147483647, false);
    }

    final static void a(int param0) {
        int var2 = 0;
        var2 = TetraLink.field_J;
        if (!hl.a(true)) {
          if (null != hd.field_u) {
            if (!hd.field_u.field_c) {
              return;
            } else {
              qa.b((byte) 59);
              pj.field_i.a((na) (Object) new qc(pj.field_i, wg.field_d), false);
              return;
            }
          } else {
            return;
          }
        } else {
          boolean discarded$2 = pj.field_i.a(aa.field_Vb, true, p.field_m, false);
          pj.field_i.j(param0 ^ param0);
          L0: while (true) {
            if (!nj.b((byte) 28)) {
              return;
            } else {
              boolean discarded$3 = pj.field_i.a(dg.field_e, tb.field_m, param0 ^ -81);
              continue L0;
            }
          }
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        if (!(!param4)) {
            in.a(param1 - -param0.field_t, param0.field_w + param2, (byte) -110, param0.field_F, param0.field_u);
        }
        super.a(param0, param1, param2, param3, param4);
    }

    public static void b(boolean param0) {
        field_s = null;
        field_q = null;
        if (param0) {
          mf.a(-30);
          field_t = null;
          field_r = null;
          field_v = null;
          field_w = null;
          return;
        } else {
          field_t = null;
          field_r = null;
          field_v = null;
          field_w = null;
          return;
        }
    }

    final static int b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        var1 = 0;
        var2 = 0;
        L0: while (true) {
          if (!nj.b((byte) 28)) {
            L1: {
              gm.field_h.a(gd.a(aa.field_Nb, a.field_a, 8395), gd.a(ci.field_B, li.field_o, 8395), (byte) 92);
              if (!gm.field_h.b(83)) {
                break L1;
              } else {
                var1 = 1;
                break L1;
              }
            }
            var3 = 0;
            if (var1 == 0) {
              if (var2 != 0) {
                if ((f.field_z ^ -1) != -3) {
                  L2: {
                    ka.c(param0 + -916);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (2 == f.field_z) {
                        var4 = -tg.field_a + k.a(0);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) >= -1) {
                          var3 = 2;
                          om.a(true, 10, 5);
                          break L2;
                        } else {
                          if (param0 == 1000) {
                            return var3;
                          } else {
                            return -33;
                          }
                        }
                      } else {
                        if (param0 == 1000) {
                          return var3;
                        } else {
                          return -33;
                        }
                      }
                    }
                  }
                  if (param0 == 1000) {
                    return var3;
                  } else {
                    return -33;
                  }
                } else {
                  L3: {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      if (2 == f.field_z) {
                        var4 = -tg.field_a + k.a(0);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) >= -1) {
                          var3 = 2;
                          om.a(true, 10, 5);
                          break L3;
                        } else {
                          if (param0 != 1000) {
                            return -33;
                          } else {
                            return var3;
                          }
                        }
                      } else {
                        if (param0 != 1000) {
                          return -33;
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  if (param0 == 1000) {
                    return var3;
                  } else {
                    return -33;
                  }
                }
              } else {
                L4: {
                  if (var3 != 0) {
                    break L4;
                  } else {
                    if (2 == f.field_z) {
                      var4 = -tg.field_a + k.a(0);
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if ((var6 ^ -1) >= -1) {
                        var3 = 2;
                        om.a(true, 10, 5);
                        break L4;
                      } else {
                        if (param0 != 1000) {
                          return -33;
                        } else {
                          return var3;
                        }
                      }
                    } else {
                      if (param0 != 1000) {
                        return -33;
                      } else {
                        return var3;
                      }
                    }
                  }
                }
                if (param0 != 1000) {
                  return -33;
                } else {
                  return var3;
                }
              }
            } else {
              if (-1 >= (gm.field_h.field_b ^ -1)) {
                var3 = io.field_g[gm.field_h.field_b];
                if ((var3 ^ -1) == -3) {
                  L5: {
                    ka.c(88);
                    if (var3 != 0) {
                      break L5;
                    } else {
                      if (2 == f.field_z) {
                        var4 = -tg.field_a + k.a(0);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) >= -1) {
                          var3 = 2;
                          om.a(true, 10, 5);
                          break L5;
                        } else {
                          if (param0 == 1000) {
                            return var3;
                          } else {
                            return -33;
                          }
                        }
                      } else {
                        if (param0 == 1000) {
                          return var3;
                        } else {
                          return -33;
                        }
                      }
                    }
                  }
                  if (param0 == 1000) {
                    return var3;
                  } else {
                    return -33;
                  }
                } else {
                  if (var3 != 5) {
                    L6: {
                      if (var3 != 0) {
                        break L6;
                      } else {
                        if (2 == f.field_z) {
                          var4 = -tg.field_a + k.a(0);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) >= -1) {
                            var3 = 2;
                            om.a(true, 10, 5);
                            break L6;
                          } else {
                            if (param0 == 1000) {
                              return var3;
                            } else {
                              return -33;
                            }
                          }
                        } else {
                          if (param0 == 1000) {
                            return var3;
                          } else {
                            return -33;
                          }
                        }
                      }
                    }
                    if (param0 == 1000) {
                      return var3;
                    } else {
                      return -33;
                    }
                  } else {
                    L7: {
                      ka.c(88);
                      if (var3 != 0) {
                        break L7;
                      } else {
                        if (2 == f.field_z) {
                          var4 = -tg.field_a + k.a(0);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) >= -1) {
                            var3 = 2;
                            om.a(true, 10, 5);
                            break L7;
                          } else {
                            if (param0 == 1000) {
                              return var3;
                            } else {
                              return -33;
                            }
                          }
                        } else {
                          if (param0 == 1000) {
                            return var3;
                          } else {
                            return -33;
                          }
                        }
                      }
                    }
                    if (param0 == 1000) {
                      return var3;
                    } else {
                      return -33;
                    }
                  }
                }
              } else {
                if (var2 != 0) {
                  if ((f.field_z ^ -1) != -3) {
                    L8: {
                      ka.c(param0 + -916);
                      if (var3 != 0) {
                        break L8;
                      } else {
                        if (2 == f.field_z) {
                          var4 = -tg.field_a + k.a(0);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) >= -1) {
                            var3 = 2;
                            om.a(true, 10, 5);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (param0 != 1000) {
                      return -33;
                    } else {
                      return var3;
                    }
                  } else {
                    L9: {
                      if (var3 != 0) {
                        break L9;
                      } else {
                        if (2 == f.field_z) {
                          var4 = -tg.field_a + k.a(0);
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if ((var6 ^ -1) >= -1) {
                            var3 = 2;
                            om.a(true, 10, 5);
                            break L9;
                          } else {
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    if (param0 != 1000) {
                      return -33;
                    } else {
                      return var3;
                    }
                  }
                } else {
                  L10: {
                    if (var3 != 0) {
                      break L10;
                    } else {
                      if (2 == f.field_z) {
                        var4 = -tg.field_a + k.a(0);
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if ((var6 ^ -1) >= -1) {
                          var3 = 2;
                          om.a(true, 10, 5);
                          break L10;
                        } else {
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                  if (param0 != 1000) {
                    return -33;
                  } else {
                    return var3;
                  }
                }
              }
            }
          } else {
            L11: {
              gm.field_h.a(93);
              if (!gm.field_h.b(83)) {
                break L11;
              } else {
                var1 = 1;
                break L11;
              }
            }
            if (-14 != (dg.field_e ^ -1)) {
              continue L0;
            } else {
              var2 = 1;
              continue L0;
            }
          }
        }
    }

    mf(int param0) {
        this(od.field_S, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_r = "Unpacking music";
    }
}
