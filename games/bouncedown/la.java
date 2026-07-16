/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class la extends wd {
    private uh field_B;
    static gk field_D;
    private int field_F;
    static Random field_C;
    static tg[] field_E;

    public static void d(byte param0) {
        field_D = null;
        if (param0 != -59) {
            return;
        }
        field_E = null;
        field_C = null;
    }

    final void a(int param0, int param1, int param2, lk param3) {
        ((la) this).field_F = ((la) this).field_F + 1;
        super.a(param0, param1, param2, param3);
    }

    final String d(int param0) {
        if (!(!((la) this).field_g)) {
            return ((la) this).field_B.c((byte) 66);
        }
        if (param0 == 0) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        tg var7 = null;
        vf var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Bounce.field_N;
        super.a(param0, param1, 119, param3);
        if (-1 == (param0 ^ -1)) {
          var5 = (((la) this).field_k >> -1216831583) + (((la) this).field_r + param3);
          var6 = (((la) this).field_m >> -1885576191) + param1 - -((la) this).field_i;
          var8 = ((la) this).field_B.a((byte) 125);
          if (param2 >= 33) {
            L0: {
              if (ui.field_o == var8) {
                break L0;
              } else {
                if (var8 == mi.field_c) {
                  break L0;
                } else {
                  L1: {
                    if (a.field_e != var8) {
                      break L1;
                    } else {
                      var7 = field_E[2];
                      var7.a(var5 - (var7.field_s >> 876323393), -(var7.field_q >> -990239455) + var6, 256);
                      if (var11 != 0) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  if (mc.field_a == var8) {
                    var7 = field_E[1];
                    var7.a(-(var7.field_s >> 1724835265) + var5, -(var7.field_q >> -1108905727) + var6, 256);
                    if (var11 != 0) {
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              var7 = field_E[0];
              var9 = var7.field_t << -204073759;
              var10 = var7.field_o << -42131423;
              if (sj.field_c == null) {
                break L2;
              } else {
                if (var9 > sj.field_c.field_s) {
                  break L2;
                } else {
                  if (var10 > sj.field_c.field_q) {
                    sj.field_c = new tg(var9, var10);
                    kh.a(sj.field_c, 1);
                    kh.a(sj.field_c, 1);
                    na.a();
                    var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                    ve.a(-121);
                    sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                    return;
                  } else {
                    kh.a(sj.field_c, 1);
                    na.a();
                    var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                    ve.a(-121);
                    sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                    return;
                  }
                }
              }
            }
            sj.field_c = new tg(var9, var10);
            kh.a(sj.field_c, 1);
            kh.a(sj.field_c, 1);
            na.a();
            var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
            ve.a(-121);
            sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
            return;
          } else {
            ((la) this).a(54, -73, 123, 16);
            if (ui.field_o != var8) {
              if (var8 != mi.field_c) {
                L3: {
                  if (a.field_e != var8) {
                    break L3;
                  } else {
                    var7 = field_E[2];
                    var7.a(var5 - (var7.field_s >> 876323393), -(var7.field_q >> -990239455) + var6, 256);
                    if (var11 != 0) {
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                if (mc.field_a == var8) {
                  var7 = field_E[1];
                  var7.a(-(var7.field_s >> 1724835265) + var5, -(var7.field_q >> -1108905727) + var6, 256);
                  if (var11 != 0) {
                    L4: {
                      var7 = field_E[0];
                      var9 = var7.field_t << -204073759;
                      var10 = var7.field_o << -42131423;
                      if (sj.field_c == null) {
                        break L4;
                      } else {
                        if (var9 > sj.field_c.field_s) {
                          break L4;
                        } else {
                          if (var10 > sj.field_c.field_q) {
                            L5: {
                              sj.field_c = new tg(var9, var10);
                              kh.a(sj.field_c, 1);
                              if (var11 == 0) {
                                break L5;
                              } else {
                                kh.a(sj.field_c, 1);
                                na.a();
                                break L5;
                              }
                            }
                            var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                            ve.a(-121);
                            sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                            return;
                          } else {
                            kh.a(sj.field_c, 1);
                            na.a();
                            var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                            ve.a(-121);
                            sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                            return;
                          }
                        }
                      }
                    }
                    sj.field_c = new tg(var9, var10);
                    kh.a(sj.field_c, 1);
                    if (var11 != 0) {
                      kh.a(sj.field_c, 1);
                      na.a();
                      var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                      ve.a(-121);
                      sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                      return;
                    } else {
                      var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                      ve.a(-121);
                      sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L6: {
                  L7: {
                    var7 = field_E[0];
                    var9 = var7.field_t << -204073759;
                    var10 = var7.field_o << -42131423;
                    if (sj.field_c == null) {
                      break L7;
                    } else {
                      if (var9 > sj.field_c.field_s) {
                        break L7;
                      } else {
                        if (var10 <= sj.field_c.field_q) {
                          kh.a(sj.field_c, 1);
                          na.a();
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  sj.field_c = new tg(var9, var10);
                  kh.a(sj.field_c, 1);
                  if (var11 == 0) {
                    break L6;
                  } else {
                    kh.a(sj.field_c, 1);
                    na.a();
                    break L6;
                  }
                }
                var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
                ve.a(-121);
                sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
                return;
              }
            } else {
              L8: {
                L9: {
                  var7 = field_E[0];
                  var9 = var7.field_t << -204073759;
                  var10 = var7.field_o << -42131423;
                  if (sj.field_c == null) {
                    break L9;
                  } else {
                    if (var9 > sj.field_c.field_s) {
                      break L9;
                    } else {
                      if (var10 <= sj.field_c.field_q) {
                        kh.a(sj.field_c, 1);
                        na.a();
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                sj.field_c = new tg(var9, var10);
                kh.a(sj.field_c, 1);
                if (var11 == 0) {
                  break L8;
                } else {
                  kh.a(sj.field_c, 1);
                  na.a();
                  break L8;
                }
              }
              var7.b(112, 144, var7.field_t << -1841618044, var7.field_o << -1089549596, -((la) this).field_F << 961365770, 4096);
              ve.a(-121);
              sj.field_c.a(var5 - var7.field_t, var6 + -var7.field_o, 256);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static String a(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        String stackIn_8_0 = null;
        String stackIn_9_0 = null;
        String stackOut_7_0 = null;
        L0: {
          var5 = Bounce.field_N;
          var1 = "(" + ak.field_z + " " + i.field_f + " " + ck.field_b + ") " + wa.field_d;
          if (param0 <= -104) {
            break L0;
          } else {
            var6 = null;
            we[] discarded$1 = la.a(-118, -34, (gk) null, (byte) -39);
            break L0;
          }
        }
        if (-1 > (pe.field_d ^ -1)) {
          var1 = var1 + ":";
          var2 = 0;
          L1: while (true) {
            if (pe.field_d > var2) {
              stackOut_7_0 = var1 + 32;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 == 0) {
                L2: {
                  L3: {
                    var1 = stackIn_9_0;
                    var3 = jc.field_g.field_i[var2] & 255;
                    var4 = var3 >> 1227938436;
                    var3 = var3 & 15;
                    if (10 > var4) {
                      break L3;
                    } else {
                      var4 += 55;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4 += 48;
                  break L2;
                }
                L4: {
                  L5: {
                    var1 = var1 + (char)var4;
                    if (10 <= var3) {
                      break L5;
                    } else {
                      var3 += 48;
                      if (var5 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 += 55;
                  break L4;
                }
                var1 = var1 + (char)var3;
                var2++;
                continue L1;
              } else {
                return stackIn_8_0;
              }
            } else {
              return var1;
            }
          }
        } else {
          return var1;
        }
    }

    final boolean a(lk param0, boolean param1) {
        if (param1) {
            ((la) this).field_F = 61;
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = Bounce.field_N;
        if (param1 == 2) {
          param2--;
          L0: while (true) {
            if ((param2 ^ -1) <= -1) {
              var9 = param4;
              var5 = var9;
              var6 = param3;
              var7 = param0;
              var9[var6] = var7 - -(da.b(var9[var6], 16711422) >> -1965231103);
              param3++;
              if (var8 == 0) {
                param2--;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_E = null;
          param2--;
          L1: while (true) {
            if ((param2 ^ -1) <= -1) {
              var9 = param4;
              var5 = var9;
              var6 = param3;
              var7 = param0;
              var9[var6] = var7 - -(da.b(var9[var6], 16711422) >> -1965231103);
              param3++;
              if (var8 == 0) {
                param2--;
                continue L1;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Bounce.field_N;
        if (param0 == 640) {
          L0: {
            L1: {
              if (-1 <= (ui.field_m ^ -1)) {
                break L1;
              } else {
                if (null != vd.field_b) {
                  L2: {
                    sj.field_f = vd.field_b.c((byte) 105);
                    bi.a(0, 2);
                    if (null == sj.field_f) {
                      break L2;
                    } else {
                      l.a(param0 + -640, (java.awt.Canvas) (Object) sj.field_f);
                      var2 = 2;
                      break L2;
                    }
                  }
                  L3: {
                    var2 = 3;
                    if (jh.b(param0 ^ 767564705)) {
                      break L3;
                    } else {
                      var2 = 1;
                      break L3;
                    }
                  }
                  var2 = 0;
                  if (vd.field_b == null) {
                    if (!kg.field_i) {
                      return;
                    } else {
                      nj.a(param1, -25698, var2);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  sj.field_f = qd.a(0, 640, ck.field_e, 127, 0, 480);
                  if (var3 == 0) {
                    L4: {
                      if (null == sj.field_f) {
                        break L4;
                      } else {
                        l.a(param0 + -640, (java.awt.Canvas) (Object) sj.field_f);
                        var2 = 2;
                        if (var3 == 0) {
                          break L0;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var2 = 3;
                    break L1;
                  } else {
                    L5: {
                      sj.field_f = vd.field_b.c((byte) 105);
                      bi.a(0, 2);
                      if (null == sj.field_f) {
                        break L5;
                      } else {
                        l.a(param0 + -640, (java.awt.Canvas) (Object) sj.field_f);
                        var2 = 2;
                        break L5;
                      }
                    }
                    L6: {
                      var2 = 3;
                      if (jh.b(param0 ^ 767564705)) {
                        break L6;
                      } else {
                        var2 = 1;
                        break L6;
                      }
                    }
                    var2 = 0;
                    if (vd.field_b == null) {
                      if (!kg.field_i) {
                        return;
                      } else {
                        nj.a(param1, -25698, var2);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L7: {
              if (jh.b(param0 ^ 767564705)) {
                break L7;
              } else {
                var2 = 1;
                break L7;
              }
            }
            var2 = 0;
            break L0;
          }
          if (vd.field_b == null) {
            if (kg.field_i) {
              nj.a(param1, -25698, var2);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static we[] a(int param0, int param1, gk param2, byte param3) {
        int var4 = 0;
        if (!c.a(param2, false, param1, param0)) {
          return null;
        } else {
          var4 = 112 % ((param3 - 31) / 34);
          return pe.b(0);
        }
    }

    la(uh param0) {
        ((la) this).field_B = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new Random();
    }
}
