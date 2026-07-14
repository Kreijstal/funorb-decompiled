/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ai extends em {
    private String field_j;
    private long field_h;
    static String field_g;
    static int field_i;

    final void a(kg param0, byte param1) {
        param0.a(((ai) this).field_h, (byte) -96);
        if (param1 < 47) {
          ((ai) this).field_h = -58L;
          param0.a(11404, ((ai) this).field_j);
          return;
        } else {
          param0.a(11404, ((ai) this).field_j);
          return;
        }
    }

    ai(long param0, String param1) {
        ((ai) this).field_h = param0;
        ((ai) this).field_j = param1;
    }

    si b(byte param0) {
        int var2 = -9 % ((51 - param0) / 57);
        return vf.field_e;
    }

    final static int a(int param0, String param1, bn param2, boolean param3, int param4, int param5, bn param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        kg stackIn_10_0 = null;
        kg stackIn_11_0 = null;
        kg stackIn_12_0 = null;
        String stackIn_12_1 = null;
        kg stackIn_13_0 = null;
        kg stackIn_14_0 = null;
        kg stackIn_15_0 = null;
        String stackIn_15_1 = null;
        kg stackIn_77_0 = null;
        kg stackIn_78_0 = null;
        kg stackIn_79_0 = null;
        String stackIn_79_1 = null;
        kg stackIn_80_0 = null;
        kg stackIn_81_0 = null;
        kg stackIn_82_0 = null;
        String stackIn_82_1 = null;
        kg stackOut_76_0 = null;
        kg stackOut_78_0 = null;
        String stackOut_78_1 = null;
        kg stackOut_77_0 = null;
        String stackOut_77_1 = null;
        kg stackOut_79_0 = null;
        kg stackOut_81_0 = null;
        String stackOut_81_1 = null;
        kg stackOut_80_0 = null;
        String stackOut_80_1 = null;
        kg stackOut_9_0 = null;
        kg stackOut_11_0 = null;
        String stackOut_11_1 = null;
        kg stackOut_10_0 = null;
        String stackOut_10_1 = null;
        kg stackOut_12_0 = null;
        kg stackOut_14_0 = null;
        String stackOut_14_1 = null;
        kg stackOut_13_0 = null;
        String stackOut_13_1 = null;
        var13 = Confined.field_J ? 1 : 0;
        var14 = param6.a(-120);
        var11_ref = var14;
        var11_ref = var14;
        var8 = param2.a(-75);
        var11_ref = var8;
        var11_ref = var8;
        if (null == kl.field_G) {
          if (!mb.a(false, (byte) 17)) {
            return -1;
          } else {
            L0: {
              if (lk.field_d != si.field_g) {
                break L0;
              } else {
                L1: {
                  vh.field_a.field_n = 0;
                  ca.field_o = null;
                  if (param1 == null) {
                    L2: {
                      qf.field_c.field_n = 0;
                      qf.field_c.d(-106, hj.field_h.nextInt());
                      qf.field_c.d(-103, hj.field_h.nextInt());
                      stackOut_76_0 = qf.field_c;
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_77_0 = stackOut_76_0;
                      if (!param6.b(0)) {
                        stackOut_78_0 = (kg) (Object) stackIn_78_0;
                        stackOut_78_1 = "";
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        break L2;
                      } else {
                        stackOut_77_0 = (kg) (Object) stackIn_77_0;
                        stackOut_77_1 = (String) var14;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        break L2;
                      }
                    }
                    L3: {
                      ((kg) (Object) stackIn_79_0).a(stackIn_79_1, (byte) 112);
                      stackOut_79_0 = qf.field_c;
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_80_0 = stackOut_79_0;
                      if (!param2.b(0)) {
                        stackOut_81_0 = (kg) (Object) stackIn_81_0;
                        stackOut_81_1 = "";
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        break L3;
                      } else {
                        stackOut_80_0 = (kg) (Object) stackIn_80_0;
                        stackOut_80_1 = (String) var8;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_82_1 = stackOut_80_1;
                        break L3;
                      }
                    }
                    ((kg) (Object) stackIn_82_0).a(stackIn_82_1, (byte) 28);
                    vh.field_a.f(110, 16);
                    vh.field_a.field_n = vh.field_a.field_n + 1;
                    var9 = vh.field_a.field_n;
                    jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                    vh.field_a.a(25859, vh.field_a.field_n - var9);
                    break L1;
                  } else {
                    L4: {
                      var9 = 0;
                      if (param3) {
                        var9 = var9 | 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      qf.field_c.field_n = 0;
                      qf.field_c.d(-98, hj.field_h.nextInt());
                      qf.field_c.d(-114, hj.field_h.nextInt());
                      qf.field_c.a(var14, (byte) 45);
                      qf.field_c.a(var8, (byte) 105);
                      var15 = (CharSequence) (Object) param1;
                      qf.field_c.a(ka.a(var15, 23617), (byte) 75);
                      qf.field_c.c(param0, 8);
                      qf.field_c.f(114, param4);
                      qf.field_c.f(117, var9);
                      vh.field_a.f(101, 18);
                      vh.field_a.field_n = vh.field_a.field_n + 2;
                      var10 = vh.field_a.field_n;
                      var11_ref = pa.a(ii.b(false), 59);
                      if (var11_ref != null) {
                        break L5;
                      } else {
                        var11_ref = "";
                        break L5;
                      }
                    }
                    vh.field_a.a(var11_ref, 123);
                    jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                    vh.field_a.b(-var10 + vh.field_a.field_n, -109);
                    break L1;
                  }
                }
                tb.a(-1, 123);
                lk.field_d = dg.field_p;
                break L0;
              }
            }
            if (dg.field_p == lk.field_d) {
              L6: {
                if (!jj.a(1, (byte) -119)) {
                  break L6;
                } else {
                  L7: {
                    var9 = e.field_c.c(32);
                    e.field_c.field_n = 0;
                    if (-101 < (var9 ^ -1)) {
                      break L7;
                    } else {
                      if ((var9 ^ -1) >= -106) {
                        lk.field_d = la.field_M;
                        sc.field_g = new String[var9 + -100];
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (248 != var9) {
                    if (99 == var9) {
                      boolean discarded$2 = jj.a(lb.c(-30316), (byte) 16);
                      ca.field_o = new Boolean(qe.a((byte) -73, (kg) (Object) e.field_c));
                      e.field_c.field_n = 0;
                      break L6;
                    } else {
                      Confined.field_F = var9;
                      field_i = -1;
                      lk.field_d = rf.field_c;
                      break L6;
                    }
                  } else {
                    gb.a((byte) -94, ii.b(false));
                    gl.field_k = oj.field_y;
                    dc.d(115);
                    sg.field_y = false;
                    return var9;
                  }
                }
              }
              L8: {
                if (lk.field_d == la.field_M) {
                  var9 = 2;
                  if (!jj.a(var9, (byte) -126)) {
                    break L8;
                  } else {
                    var10 = e.field_c.a((byte) 25);
                    e.field_c.field_n = 0;
                    if (!jj.a(var10, (byte) 49)) {
                      break L8;
                    } else {
                      var11 = sc.field_g.length;
                      var12 = 0;
                      L9: while (true) {
                        if (var11 <= var12) {
                          dc.d(103);
                          sg.field_y = false;
                          return var11 + 100;
                        } else {
                          sc.field_g[var12] = e.field_c.g((byte) 31);
                          var12++;
                          continue L9;
                        }
                      }
                    }
                  }
                } else {
                  break L8;
                }
              }
              if (lk.field_d == rf.field_c) {
                if (!jc.a(-77)) {
                  if (param5 >= 121) {
                    if (kl.field_G == null) {
                      if (sg.field_y) {
                        if ((la.h(112) ^ -1L) >= -30001L) {
                          gl.field_k = ka.field_G;
                          sg.field_y = false;
                          return 249;
                        } else {
                          gl.field_k = hf.field_S;
                          sg.field_y = false;
                          return 249;
                        }
                      } else {
                        var9 = nd.field_s;
                        nd.field_s = ac.field_b;
                        sg.field_y = true;
                        ac.field_b = var9;
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return 33;
                  }
                } else {
                  if (Confined.field_F == 255) {
                    var9_ref = e.field_c.e((byte) 102);
                    if (var9_ref != null) {
                      qc.a(var9_ref, ii.b(false), -1);
                      dc.d(106);
                      sg.field_y = false;
                      return Confined.field_F;
                    } else {
                      dc.d(106);
                      sg.field_y = false;
                      return Confined.field_F;
                    }
                  } else {
                    gl.field_k = e.field_c.d(true);
                    dc.d(106);
                    sg.field_y = false;
                    return Confined.field_F;
                  }
                }
              } else {
                if (param5 >= 121) {
                  if (kl.field_G == null) {
                    if (sg.field_y) {
                      L10: {
                        if ((la.h(112) ^ -1L) >= -30001L) {
                          gl.field_k = ka.field_G;
                          break L10;
                        } else {
                          gl.field_k = hf.field_S;
                          break L10;
                        }
                      }
                      sg.field_y = false;
                      return 249;
                    } else {
                      var9 = nd.field_s;
                      nd.field_s = ac.field_b;
                      sg.field_y = true;
                      ac.field_b = var9;
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return 33;
                }
              }
            } else {
              L11: {
                if (lk.field_d == la.field_M) {
                  var9 = 2;
                  if (!jj.a(var9, (byte) -126)) {
                    break L11;
                  } else {
                    var10 = e.field_c.a((byte) 25);
                    e.field_c.field_n = 0;
                    if (!jj.a(var10, (byte) 49)) {
                      break L11;
                    } else {
                      var11 = sc.field_g.length;
                      var12 = 0;
                      L12: while (true) {
                        if (var11 <= var12) {
                          dc.d(103);
                          sg.field_y = false;
                          return var11 + 100;
                        } else {
                          sc.field_g[var12] = e.field_c.g((byte) 31);
                          var12++;
                          continue L12;
                        }
                      }
                    }
                  }
                } else {
                  break L11;
                }
              }
              if (lk.field_d == rf.field_c) {
                if (!jc.a(-77)) {
                  if (param5 >= 121) {
                    if (kl.field_G == null) {
                      if (sg.field_y) {
                        if ((la.h(112) ^ -1L) < -30001L) {
                          gl.field_k = hf.field_S;
                          sg.field_y = false;
                          return 249;
                        } else {
                          gl.field_k = ka.field_G;
                          sg.field_y = false;
                          return 249;
                        }
                      } else {
                        var9 = nd.field_s;
                        nd.field_s = ac.field_b;
                        sg.field_y = true;
                        ac.field_b = var9;
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return 33;
                  }
                } else {
                  if (Confined.field_F == 255) {
                    var9_ref = e.field_c.e((byte) 102);
                    if (var9_ref == null) {
                      dc.d(106);
                      sg.field_y = false;
                      return Confined.field_F;
                    } else {
                      qc.a(var9_ref, ii.b(false), -1);
                      dc.d(106);
                      sg.field_y = false;
                      return Confined.field_F;
                    }
                  } else {
                    gl.field_k = e.field_c.d(true);
                    dc.d(106);
                    sg.field_y = false;
                    return Confined.field_F;
                  }
                }
              } else {
                if (param5 >= 121) {
                  if (kl.field_G == null) {
                    if (sg.field_y) {
                      L13: {
                        if ((la.h(112) ^ -1L) >= -30001L) {
                          gl.field_k = ka.field_G;
                          break L13;
                        } else {
                          gl.field_k = hf.field_S;
                          break L13;
                        }
                      }
                      sg.field_y = false;
                      return 249;
                    } else {
                      var9 = nd.field_s;
                      nd.field_s = ac.field_b;
                      sg.field_y = true;
                      ac.field_b = var9;
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return 33;
                }
              }
            }
          }
        } else {
          L14: {
            if (lk.field_d != si.field_g) {
              break L14;
            } else {
              L15: {
                vh.field_a.field_n = 0;
                ca.field_o = null;
                if (param1 == null) {
                  L16: {
                    qf.field_c.field_n = 0;
                    qf.field_c.d(-106, hj.field_h.nextInt());
                    qf.field_c.d(-103, hj.field_h.nextInt());
                    stackOut_9_0 = qf.field_c;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!param6.b(0)) {
                      stackOut_11_0 = (kg) (Object) stackIn_11_0;
                      stackOut_11_1 = "";
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L16;
                    } else {
                      stackOut_10_0 = (kg) (Object) stackIn_10_0;
                      stackOut_10_1 = (String) var14;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L16;
                    }
                  }
                  L17: {
                    ((kg) (Object) stackIn_12_0).a(stackIn_12_1, (byte) 112);
                    stackOut_12_0 = qf.field_c;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (!param2.b(0)) {
                      stackOut_14_0 = (kg) (Object) stackIn_14_0;
                      stackOut_14_1 = "";
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L17;
                    } else {
                      stackOut_13_0 = (kg) (Object) stackIn_13_0;
                      stackOut_13_1 = (String) var8;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L17;
                    }
                  }
                  ((kg) (Object) stackIn_15_0).a(stackIn_15_1, (byte) 28);
                  vh.field_a.f(110, 16);
                  vh.field_a.field_n = vh.field_a.field_n + 1;
                  var9 = vh.field_a.field_n;
                  jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                  vh.field_a.a(25859, vh.field_a.field_n - var9);
                  break L15;
                } else {
                  L18: {
                    var9 = 0;
                    if (param3) {
                      var9 = var9 | 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    qf.field_c.field_n = 0;
                    qf.field_c.d(-98, hj.field_h.nextInt());
                    qf.field_c.d(-114, hj.field_h.nextInt());
                    qf.field_c.a(var14, (byte) 45);
                    qf.field_c.a(var8, (byte) 105);
                    var15 = (CharSequence) (Object) param1;
                    qf.field_c.a(ka.a(var15, 23617), (byte) 75);
                    qf.field_c.c(param0, 8);
                    qf.field_c.f(114, param4);
                    qf.field_c.f(117, var9);
                    vh.field_a.f(101, 18);
                    vh.field_a.field_n = vh.field_a.field_n + 2;
                    var10 = vh.field_a.field_n;
                    var11_ref = pa.a(ii.b(false), 59);
                    if (var11_ref != null) {
                      break L19;
                    } else {
                      var11_ref = "";
                      break L19;
                    }
                  }
                  vh.field_a.a(var11_ref, 123);
                  jf.a(qf.field_c, hk.field_a, (kg) (Object) vh.field_a, 0, an.field_r);
                  vh.field_a.b(-var10 + vh.field_a.field_n, -109);
                  break L15;
                }
              }
              tb.a(-1, 123);
              lk.field_d = dg.field_p;
              break L14;
            }
          }
          L20: {
            if (dg.field_p != lk.field_d) {
              break L20;
            } else {
              if (!jj.a(1, (byte) -119)) {
                break L20;
              } else {
                L21: {
                  var9 = e.field_c.c(32);
                  e.field_c.field_n = 0;
                  if (-101 < (var9 ^ -1)) {
                    break L21;
                  } else {
                    if ((var9 ^ -1) >= -106) {
                      lk.field_d = la.field_M;
                      sc.field_g = new String[var9 + -100];
                      break L20;
                    } else {
                      break L21;
                    }
                  }
                }
                if (248 != var9) {
                  if (99 == var9) {
                    boolean discarded$3 = jj.a(lb.c(-30316), (byte) 16);
                    ca.field_o = new Boolean(qe.a((byte) -73, (kg) (Object) e.field_c));
                    e.field_c.field_n = 0;
                    break L20;
                  } else {
                    Confined.field_F = var9;
                    field_i = -1;
                    lk.field_d = rf.field_c;
                    break L20;
                  }
                } else {
                  gb.a((byte) -94, ii.b(false));
                  gl.field_k = oj.field_y;
                  dc.d(115);
                  sg.field_y = false;
                  return var9;
                }
              }
            }
          }
          L22: {
            if (lk.field_d == la.field_M) {
              var9 = 2;
              if (!jj.a(var9, (byte) -126)) {
                break L22;
              } else {
                var10 = e.field_c.a((byte) 25);
                e.field_c.field_n = 0;
                if (!jj.a(var10, (byte) 49)) {
                  break L22;
                } else {
                  var11 = sc.field_g.length;
                  var12 = 0;
                  L23: while (true) {
                    if (var11 <= var12) {
                      dc.d(103);
                      sg.field_y = false;
                      return var11 + 100;
                    } else {
                      sc.field_g[var12] = e.field_c.g((byte) 31);
                      var12++;
                      continue L23;
                    }
                  }
                }
              }
            } else {
              break L22;
            }
          }
          if (lk.field_d == rf.field_c) {
            if (!jc.a(-77)) {
              if (param5 >= 121) {
                if (kl.field_G == null) {
                  if (sg.field_y) {
                    if ((la.h(112) ^ -1L) < -30001L) {
                      gl.field_k = hf.field_S;
                      sg.field_y = false;
                      return 249;
                    } else {
                      gl.field_k = ka.field_G;
                      sg.field_y = false;
                      return 249;
                    }
                  } else {
                    var9 = nd.field_s;
                    nd.field_s = ac.field_b;
                    sg.field_y = true;
                    ac.field_b = var9;
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return 33;
              }
            } else {
              if (Confined.field_F == 255) {
                var9_ref = e.field_c.e((byte) 102);
                if (var9_ref == null) {
                  dc.d(106);
                  sg.field_y = false;
                  return Confined.field_F;
                } else {
                  qc.a(var9_ref, ii.b(false), -1);
                  dc.d(106);
                  sg.field_y = false;
                  return Confined.field_F;
                }
              } else {
                gl.field_k = e.field_c.d(true);
                dc.d(106);
                sg.field_y = false;
                return Confined.field_F;
              }
            }
          } else {
            if (param5 >= 121) {
              if (kl.field_G == null) {
                if (sg.field_y) {
                  L24: {
                    if ((la.h(112) ^ -1L) >= -30001L) {
                      gl.field_k = ka.field_G;
                      break L24;
                    } else {
                      gl.field_k = hf.field_S;
                      break L24;
                    }
                  }
                  sg.field_y = false;
                  return 249;
                } else {
                  var9 = nd.field_s;
                  nd.field_s = ac.field_b;
                  sg.field_y = true;
                  ac.field_b = var9;
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return 33;
            }
          }
        }
    }

    final static void a(ok param0, ji param1, int param2, int param3, int param4, int param5, int param6, int param7, ji param8, int param9, int param10, int param11, int param12, ji param13, int param14, int param15, int param16, ok param17, int param18, int param19, int param20) {
        nl.a(param0, param7, param17, 2);
        ue.a(param5, param11, param2, param9, 243);
        ud.a(param15, (byte) -12, param18);
        int var21 = -30 % ((-19 - param12) / 55);
        pb.a(param13, (byte) -71, param8, param16, param10, param14);
        kc.a(13421772, param3, param1, param20);
        am.a(param19, (byte) -18, param6, param4);
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -12875) {
          var2 = null;
          ai.a((ok) null, (ji) null, -92, 60, -114, 84, 108, 23, (ji) null, 15, -93, 33, 98, (ji) null, 19, 105, -6, (ok) null, -59, -38, -101);
          field_g = null;
          return;
        } else {
          field_g = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Change display name";
    }
}
