/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb implements fc {
    private int field_c;
    static String field_o;
    private int field_l;
    static String[] field_k;
    private int field_j;
    private tj field_n;
    private int field_a;
    private int field_b;
    static tg[] field_m;
    private int field_h;
    private int field_i;
    static qc field_g;
    private int field_f;
    private int field_p;
    private int field_e;
    private int field_d;

    public static void a(int param0) {
        field_o = null;
        field_k = null;
        field_g = null;
        if (param0 <= 65) {
            field_o = null;
            field_m = null;
            return;
        }
        field_m = null;
    }

    final static int a(boolean param0, String param1, int param2, int param3, ve param4, int param5, ve param6) {
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var10_ref = null;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        wi stackIn_11_0 = null;
        wi stackIn_12_0 = null;
        wi stackIn_13_0 = null;
        String stackIn_13_1 = null;
        wi stackIn_14_0 = null;
        wi stackIn_15_0 = null;
        wi stackIn_16_0 = null;
        String stackIn_16_1 = null;
        wi stackOut_10_0 = null;
        wi stackOut_12_0 = null;
        String stackOut_12_1 = null;
        wi stackOut_11_0 = null;
        String stackOut_11_1 = null;
        wi stackOut_13_0 = null;
        wi stackOut_15_0 = null;
        String stackOut_15_1 = null;
        wi stackOut_14_0 = null;
        String stackOut_14_1 = null;
        L0: {
          var16 = null;
          var14 = Bounce.field_N;
          var15 = param4.c((byte) -56);
          var11_ref = var15;
          var11_ref = var15;
          var8 = param6.c((byte) -106);
          var11_ref = var8;
          var11_ref = var8;
          if (dh.field_a != null) {
            break L0;
          } else {
            if (ok.a(false, 122)) {
              break L0;
            } else {
              return -1;
            }
          }
        }
        L1: {
          if (ga.field_c != pj.field_a) {
            break L1;
          } else {
            L2: {
              lk.field_p = null;
              hh.field_p.field_h = 0;
              if (param1 == null) {
                L3: {
                  lb.field_g.field_h = 0;
                  lb.field_g.b(la.field_C.nextInt(), (byte) 124);
                  lb.field_g.b(la.field_C.nextInt(), (byte) 67);
                  stackOut_10_0 = lb.field_g;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!param4.a((byte) 56)) {
                    stackOut_12_0 = (wi) (Object) stackIn_12_0;
                    stackOut_12_1 = "";
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = (wi) (Object) stackIn_11_0;
                    stackOut_11_1 = (String) var15;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                L4: {
                  ((wi) (Object) stackIn_13_0).a(stackIn_13_1, (byte) -67);
                  stackOut_13_0 = lb.field_g;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (!param6.a((byte) 56)) {
                    stackOut_15_0 = (wi) (Object) stackIn_15_0;
                    stackOut_15_1 = "";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L4;
                  } else {
                    stackOut_14_0 = (wi) (Object) stackIn_14_0;
                    stackOut_14_1 = (String) var8;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L4;
                  }
                }
                ((wi) (Object) stackIn_16_0).a(stackIn_16_1, (byte) -67);
                hh.field_p.a(16, (byte) 94);
                hh.field_p.field_h = hh.field_p.field_h + 1;
                var9 = hh.field_p.field_h;
                f.a(dh.field_b, false, (wi) (Object) hh.field_p, lb.field_g, ja.field_a);
                hh.field_p.b(-var9 + hh.field_p.field_h, true);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  lb.field_g.field_h = 0;
                  if (!param0) {
                    break L5;
                  } else {
                    var9 = var9 | 1;
                    break L5;
                  }
                }
                L6: {
                  lb.field_g.b(la.field_C.nextInt(), (byte) -97);
                  lb.field_g.b(la.field_C.nextInt(), (byte) -64);
                  lb.field_g.a(var15, (byte) -67);
                  lb.field_g.a(var8, (byte) -67);
                  var17 = (CharSequence) (Object) param1;
                  lb.field_g.a(ck.a(-109, var17), (byte) -67);
                  lb.field_g.e(-750655096, param3);
                  lb.field_g.a(param5, (byte) 106);
                  lb.field_g.a(var9, (byte) 100);
                  hh.field_p.a(18, (byte) 105);
                  hh.field_p.field_h = hh.field_p.field_h + 2;
                  var10 = hh.field_p.field_h;
                  var11_ref = uj.a(true, vi.b(0));
                  if (var11_ref != null) {
                    break L6;
                  } else {
                    var11_ref = "";
                    break L6;
                  }
                }
                hh.field_p.a(-256, var11_ref);
                f.a(dh.field_b, false, (wi) (Object) hh.field_p, lb.field_g, ja.field_a);
                hh.field_p.c(-124, hh.field_p.field_h + -var10);
                break L2;
              }
            }
            jj.a(-1, true);
            pj.field_a = rj.field_q;
            break L1;
          }
        }
        L7: {
          if (pj.field_a == rj.field_q) {
            if (qb.a(1, 3)) {
              var9 = jc.field_g.d((byte) -84);
              jc.field_g.field_h = 0;
              if (var9 >= 100) {
                if ((var9 ^ -1) >= -106) {
                  L8: {
                    bi.field_l = new String[-100 + var9];
                    pj.field_a = kb.field_b;
                    var9 = 71 / ((param2 - -45) / 32);
                    if (pj.field_a == kb.field_b) {
                      var10 = 2;
                      if (qb.a(var10, 3)) {
                        var11 = jc.field_g.a(-1640531527);
                        jc.field_g.field_h = 0;
                        if (qb.a(var11, 3)) {
                          var12 = bi.field_l.length;
                          var13 = 0;
                          L9: while (true) {
                            if (var12 <= var13) {
                              kc.a((byte) 18);
                              fa.field_a = false;
                              return 100 + var12;
                            } else {
                              bi.field_l[var13] = jc.field_g.a(true);
                              var13++;
                              continue L9;
                            }
                          }
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (id.field_i != pj.field_a) {
                    L10: {
                      if (dh.field_a == null) {
                        if (!fa.field_a) {
                          var10 = td.field_b;
                          td.field_b = wa.field_b;
                          fa.field_a = true;
                          wa.field_b = var10;
                          break L10;
                        } else {
                          if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                            ib.field_o = jh.field_t;
                            fa.field_a = false;
                            return 249;
                          } else {
                            ib.field_o = dg.field_k;
                            fa.field_a = false;
                            return 249;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    return -1;
                  } else {
                    if (va.b(1)) {
                      if (255 == wa.field_d) {
                        var10_ref = jc.field_g.g((byte) 57);
                        if (var10_ref == null) {
                          kc.a((byte) 18);
                          fa.field_a = false;
                          return wa.field_d;
                        } else {
                          jd.a(0, vi.b(0), var10_ref);
                          kc.a((byte) 18);
                          fa.field_a = false;
                          return wa.field_d;
                        }
                      } else {
                        ib.field_o = jc.field_g.b(true);
                        kc.a((byte) 18);
                        fa.field_a = false;
                        return wa.field_d;
                      }
                    } else {
                      if (dh.field_a == null) {
                        if (!fa.field_a) {
                          var10 = td.field_b;
                          td.field_b = wa.field_b;
                          fa.field_a = true;
                          wa.field_b = var10;
                          return -1;
                        } else {
                          L11: {
                            if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                              ib.field_o = jh.field_t;
                              break L11;
                            } else {
                              ib.field_o = dg.field_k;
                              break L11;
                            }
                          }
                          fa.field_a = false;
                          return 249;
                        }
                      } else {
                        return -1;
                      }
                    }
                  }
                } else {
                  if (var9 != -249) {
                    if (-100 != var9) {
                      pj.field_a = id.field_i;
                      pe.field_d = -1;
                      wa.field_d = var9;
                      break L7;
                    } else {
                      boolean discarded$2 = qb.a(jf.b(false), 3);
                      lk.field_p = new Boolean(pb.a((wi) (Object) jc.field_g, (byte) 87));
                      jc.field_g.field_h = 0;
                      break L7;
                    }
                  } else {
                    ta.a((byte) -118, vi.b(0));
                    ib.field_o = vf.field_a;
                    kc.a((byte) 18);
                    fa.field_a = false;
                    return var9;
                  }
                }
              } else {
                if (var9 != -249) {
                  L12: {
                    if (-100 != var9) {
                      pj.field_a = id.field_i;
                      pe.field_d = -1;
                      wa.field_d = var9;
                      break L12;
                    } else {
                      boolean discarded$3 = qb.a(jf.b(false), 3);
                      lk.field_p = new Boolean(pb.a((wi) (Object) jc.field_g, (byte) 87));
                      jc.field_g.field_h = 0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = 71 / ((param2 - -45) / 32);
                    if (pj.field_a == kb.field_b) {
                      var10 = 2;
                      if (qb.a(var10, 3)) {
                        var11 = jc.field_g.a(-1640531527);
                        jc.field_g.field_h = 0;
                        if (qb.a(var11, 3)) {
                          var12 = bi.field_l.length;
                          var13 = 0;
                          L14: while (true) {
                            if (var12 <= var13) {
                              kc.a((byte) 18);
                              fa.field_a = false;
                              return 100 + var12;
                            } else {
                              bi.field_l[var13] = jc.field_g.a(true);
                              var13++;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  if (id.field_i != pj.field_a) {
                    if (dh.field_a == null) {
                      if (fa.field_a) {
                        if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                          ib.field_o = jh.field_t;
                          fa.field_a = false;
                          return 249;
                        } else {
                          ib.field_o = dg.field_k;
                          fa.field_a = false;
                          return 249;
                        }
                      } else {
                        var10 = td.field_b;
                        td.field_b = wa.field_b;
                        fa.field_a = true;
                        wa.field_b = var10;
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    if (va.b(1)) {
                      if (255 == wa.field_d) {
                        var10_ref = jc.field_g.g((byte) 57);
                        if (var10_ref != null) {
                          jd.a(0, vi.b(0), var10_ref);
                          kc.a((byte) 18);
                          fa.field_a = false;
                          return wa.field_d;
                        } else {
                          kc.a((byte) 18);
                          fa.field_a = false;
                          return wa.field_d;
                        }
                      } else {
                        ib.field_o = jc.field_g.b(true);
                        kc.a((byte) 18);
                        fa.field_a = false;
                        return wa.field_d;
                      }
                    } else {
                      if (dh.field_a == null) {
                        if (fa.field_a) {
                          L15: {
                            if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                              ib.field_o = jh.field_t;
                              break L15;
                            } else {
                              ib.field_o = dg.field_k;
                              break L15;
                            }
                          }
                          fa.field_a = false;
                          return 249;
                        } else {
                          var10 = td.field_b;
                          td.field_b = wa.field_b;
                          fa.field_a = true;
                          wa.field_b = var10;
                          return -1;
                        }
                      } else {
                        return -1;
                      }
                    }
                  }
                } else {
                  ta.a((byte) -118, vi.b(0));
                  ib.field_o = vf.field_a;
                  kc.a((byte) 18);
                  fa.field_a = false;
                  return var9;
                }
              }
            } else {
              L16: {
                var9 = 71 / ((param2 - -45) / 32);
                if (pj.field_a == kb.field_b) {
                  var10 = 2;
                  if (qb.a(var10, 3)) {
                    var11 = jc.field_g.a(-1640531527);
                    jc.field_g.field_h = 0;
                    if (qb.a(var11, 3)) {
                      var12 = bi.field_l.length;
                      var13 = 0;
                      L17: while (true) {
                        if (var12 <= var13) {
                          kc.a((byte) 18);
                          fa.field_a = false;
                          return 100 + var12;
                        } else {
                          bi.field_l[var13] = jc.field_g.a(true);
                          var13++;
                          continue L17;
                        }
                      }
                    } else {
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              if (id.field_i != pj.field_a) {
                if (dh.field_a == null) {
                  if (fa.field_a) {
                    if (-30001L <= (ph.a((byte) 76) ^ -1L)) {
                      ib.field_o = dg.field_k;
                      fa.field_a = false;
                      return 249;
                    } else {
                      ib.field_o = jh.field_t;
                      fa.field_a = false;
                      return 249;
                    }
                  } else {
                    var10 = td.field_b;
                    td.field_b = wa.field_b;
                    fa.field_a = true;
                    wa.field_b = var10;
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (va.b(1)) {
                  if (255 == wa.field_d) {
                    var10_ref = jc.field_g.g((byte) 57);
                    if (var10_ref != null) {
                      jd.a(0, vi.b(0), var10_ref);
                      kc.a((byte) 18);
                      fa.field_a = false;
                      return wa.field_d;
                    } else {
                      kc.a((byte) 18);
                      fa.field_a = false;
                      return wa.field_d;
                    }
                  } else {
                    ib.field_o = jc.field_g.b(true);
                    kc.a((byte) 18);
                    fa.field_a = false;
                    return wa.field_d;
                  }
                } else {
                  if (dh.field_a == null) {
                    if (fa.field_a) {
                      L18: {
                        if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                          ib.field_o = jh.field_t;
                          break L18;
                        } else {
                          ib.field_o = dg.field_k;
                          break L18;
                        }
                      }
                      fa.field_a = false;
                      return 249;
                    } else {
                      var10 = td.field_b;
                      td.field_b = wa.field_b;
                      fa.field_a = true;
                      wa.field_b = var10;
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                }
              }
            }
          } else {
            break L7;
          }
        }
        var9 = 71 / ((param2 - -45) / 32);
        if (pj.field_a == kb.field_b) {
          var10 = 2;
          if (qb.a(var10, 3)) {
            var11 = jc.field_g.a(-1640531527);
            jc.field_g.field_h = 0;
            if (qb.a(var11, 3)) {
              var12 = bi.field_l.length;
              var13 = 0;
              L19: while (true) {
                if (var12 <= var13) {
                  kc.a((byte) 18);
                  fa.field_a = false;
                  return 100 + var12;
                } else {
                  bi.field_l[var13] = jc.field_g.a(true);
                  var13++;
                  continue L19;
                }
              }
            } else {
              if (id.field_i != pj.field_a) {
                L20: {
                  if (dh.field_a == null) {
                    if (!fa.field_a) {
                      var10 = td.field_b;
                      td.field_b = wa.field_b;
                      fa.field_a = true;
                      wa.field_b = var10;
                      break L20;
                    } else {
                      if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                        ib.field_o = jh.field_t;
                        fa.field_a = false;
                        return 249;
                      } else {
                        ib.field_o = dg.field_k;
                        fa.field_a = false;
                        return 249;
                      }
                    }
                  } else {
                    break L20;
                  }
                }
                return -1;
              } else {
                if (va.b(1)) {
                  if (255 != wa.field_d) {
                    ib.field_o = jc.field_g.b(true);
                    kc.a((byte) 18);
                    fa.field_a = false;
                    return wa.field_d;
                  } else {
                    var10_ref = jc.field_g.g((byte) 57);
                    if (var10_ref == null) {
                      kc.a((byte) 18);
                      fa.field_a = false;
                      return wa.field_d;
                    } else {
                      jd.a(0, vi.b(0), var10_ref);
                      kc.a((byte) 18);
                      fa.field_a = false;
                      return wa.field_d;
                    }
                  }
                } else {
                  L21: {
                    if (dh.field_a == null) {
                      if (!fa.field_a) {
                        var10 = td.field_b;
                        td.field_b = wa.field_b;
                        fa.field_a = true;
                        wa.field_b = var10;
                        break L21;
                      } else {
                        L22: {
                          if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                            ib.field_o = jh.field_t;
                            break L22;
                          } else {
                            ib.field_o = dg.field_k;
                            break L22;
                          }
                        }
                        fa.field_a = false;
                        return 249;
                      }
                    } else {
                      break L21;
                    }
                  }
                  return -1;
                }
              }
            }
          } else {
            if (id.field_i != pj.field_a) {
              L23: {
                if (dh.field_a == null) {
                  if (!fa.field_a) {
                    var10 = td.field_b;
                    td.field_b = wa.field_b;
                    fa.field_a = true;
                    wa.field_b = var10;
                    break L23;
                  } else {
                    if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                      ib.field_o = jh.field_t;
                      fa.field_a = false;
                      return 249;
                    } else {
                      ib.field_o = dg.field_k;
                      fa.field_a = false;
                      return 249;
                    }
                  }
                } else {
                  break L23;
                }
              }
              return -1;
            } else {
              if (va.b(1)) {
                if (255 != wa.field_d) {
                  ib.field_o = jc.field_g.b(true);
                  kc.a((byte) 18);
                  fa.field_a = false;
                  return wa.field_d;
                } else {
                  var10_ref = jc.field_g.g((byte) 57);
                  if (var10_ref == null) {
                    kc.a((byte) 18);
                    fa.field_a = false;
                    return wa.field_d;
                  } else {
                    jd.a(0, vi.b(0), var10_ref);
                    kc.a((byte) 18);
                    fa.field_a = false;
                    return wa.field_d;
                  }
                }
              } else {
                L24: {
                  if (dh.field_a == null) {
                    if (!fa.field_a) {
                      var10 = td.field_b;
                      td.field_b = wa.field_b;
                      fa.field_a = true;
                      wa.field_b = var10;
                      break L24;
                    } else {
                      L25: {
                        if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                          ib.field_o = jh.field_t;
                          break L25;
                        } else {
                          ib.field_o = dg.field_k;
                          break L25;
                        }
                      }
                      fa.field_a = false;
                      return 249;
                    }
                  } else {
                    break L24;
                  }
                }
                return -1;
              }
            }
          }
        } else {
          if (id.field_i != pj.field_a) {
            L26: {
              if (dh.field_a == null) {
                if (!fa.field_a) {
                  var10 = td.field_b;
                  td.field_b = wa.field_b;
                  fa.field_a = true;
                  wa.field_b = var10;
                  break L26;
                } else {
                  if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                    ib.field_o = jh.field_t;
                    fa.field_a = false;
                    return 249;
                  } else {
                    ib.field_o = dg.field_k;
                    fa.field_a = false;
                    return 249;
                  }
                }
              } else {
                break L26;
              }
            }
            return -1;
          } else {
            if (va.b(1)) {
              if (255 != wa.field_d) {
                ib.field_o = jc.field_g.b(true);
                kc.a((byte) 18);
                fa.field_a = false;
                return wa.field_d;
              } else {
                var10_ref = jc.field_g.g((byte) 57);
                if (var10_ref == null) {
                  kc.a((byte) 18);
                  fa.field_a = false;
                  return wa.field_d;
                } else {
                  jd.a(0, vi.b(0), var10_ref);
                  kc.a((byte) 18);
                  fa.field_a = false;
                  return wa.field_d;
                }
              }
            } else {
              L27: {
                if (dh.field_a == null) {
                  if (!fa.field_a) {
                    var10 = td.field_b;
                    td.field_b = wa.field_b;
                    fa.field_a = true;
                    wa.field_b = var10;
                    break L27;
                  } else {
                    L28: {
                      if (-30001L > (ph.a((byte) 76) ^ -1L)) {
                        ib.field_o = jh.field_t;
                        break L28;
                      } else {
                        ib.field_o = dg.field_k;
                        break L28;
                      }
                    }
                    fa.field_a = false;
                    return 249;
                  }
                } else {
                  break L27;
                }
              }
              return -1;
            }
          }
        }
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ff var12 = null;
        lk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        lk stackOut_1_0 = null;
        L0: {
          if (!(param1 instanceof ff)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (lk) param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (ff) (Object) stackIn_3_0;
          var8 = -100 / ((-60 - param2) / 56);
          if (var12 == null) {
            break L1;
          } else {
            param3 = param3 & var12.field_y;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          na.e(param1.field_r + param4, param1.field_i + param0, param1.field_k, param1.field_m, ((vb) this).field_h);
          if (!param3) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        L3: {
          var9 = ((vb) this).field_a + param4 - -param1.field_r;
          var10 = param0 + param1.field_i + ((vb) this).field_p;
          na.d(var9, var10, ((vb) this).field_d, ((vb) this).field_l, 5592405);
          na.e(var9, var10, ((vb) this).field_d, ((vb) this).field_l, var7);
          if (var12.field_z) {
            na.a(var9, var10, ((vb) this).field_d + var9, var10 - -((vb) this).field_l, 1);
            na.a(((vb) this).field_d + var9, var10, var9, var10 + ((vb) this).field_l, 1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (null != ((vb) this).field_n) {
            var11 = ((vb) this).field_i + ((vb) this).field_a + ((vb) this).field_d;
            int discarded$1 = ((vb) this).field_n.a(param1.field_h, var11 + (param4 - -param1.field_r), ((vb) this).field_f + param1.field_i + param0, param1.field_k - (var11 - -((vb) this).field_i), param1.field_m - (((vb) this).field_i << 1959255201), ((vb) this).field_c, ((vb) this).field_b, ((vb) this).field_e, ((vb) this).field_j, 0);
            break L4;
          } else {
            break L4;
          }
        }
    }

    final static void a(byte param0) {
        ih.field_V = null;
        ph.field_c = null;
        cl.field_n = null;
        if (param0 != 122) {
          vb.a(75);
          he.field_k = null;
          ae.field_c = null;
          qh.field_i = null;
          return;
        } else {
          he.field_k = null;
          ae.field_c = null;
          qh.field_i = null;
          return;
        }
    }

    vb(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vb) this).field_j = 1;
        ((vb) this).field_e = 1;
        ((vb) this).field_n = param0;
        ((vb) this).field_p = param6;
        ((vb) this).field_d = param8;
        ((vb) this).field_a = param5;
        ((vb) this).field_c = param3;
        ((vb) this).field_b = param4;
        ((vb) this).field_l = param7;
        ((vb) this).field_f = param2;
        ((vb) this).field_i = param1;
        ((vb) this).field_h = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Connection lost - attempting to reconnect";
        field_g = new qc();
    }
}
