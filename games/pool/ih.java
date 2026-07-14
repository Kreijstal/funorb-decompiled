/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_b;
    static vh field_e;
    static String[] field_f;
    static int[] field_d;
    static ir field_a;
    static String[] field_c;

    public static void a(int param0) {
        field_f = null;
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 <= 98) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    final static int a(String param0, byte param1, int param2, boolean param3, ke param4, ke param5, int param6) {
        String var8 = null;
        int var9 = 0;
        String var9_ref = null;
        int var10 = 0;
        String var11_ref = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        CharSequence var14 = null;
        ge stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        ge stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        ge stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        String stackIn_17_2 = null;
        ge stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        ge stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ge stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        String stackIn_20_2 = null;
        ge stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ge stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        String stackOut_16_2 = null;
        ge stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        String stackOut_15_2 = null;
        ge stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ge stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        String stackOut_19_2 = null;
        ge stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        String stackOut_18_2 = null;
        L0: {
          var13 = param4.a((byte) 104);
          var8 = param5.a((byte) 104);
          if (null == jd.field_c) {
            if (sa.a((byte) 65, false)) {
              break L0;
            } else {
              return -1;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (no.field_h == tl.field_J) {
            L2: {
              ej.field_j.field_v = 0;
              bq.field_q = null;
              if (param0 == null) {
                L3: {
                  bc.field_b.field_v = 0;
                  bc.field_b.a(true, lc.field_P.nextInt());
                  bc.field_b.a(true, lc.field_P.nextInt());
                  stackOut_14_0 = bc.field_b;
                  stackOut_14_1 = 0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (param4.b(true)) {
                    stackOut_16_0 = (ge) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = (String) var13;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L3;
                  } else {
                    stackOut_15_0 = (ge) (Object) stackIn_15_0;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = "";
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L3;
                  }
                }
                L4: {
                  ((ge) (Object) stackIn_17_0).a(stackIn_17_1 != 0, stackIn_17_2);
                  stackOut_17_0 = bc.field_b;
                  stackOut_17_1 = 0;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  if (!param5.b(true)) {
                    stackOut_19_0 = (ge) (Object) stackIn_19_0;
                    stackOut_19_1 = stackIn_19_1;
                    stackOut_19_2 = "";
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    stackIn_20_2 = stackOut_19_2;
                    break L4;
                  } else {
                    stackOut_18_0 = (ge) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = (String) var8;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    stackIn_20_2 = stackOut_18_2;
                    break L4;
                  }
                }
                ((ge) (Object) stackIn_20_0).a(stackIn_20_1 != 0, stackIn_20_2);
                ej.field_j.a(16, false);
                ej.field_j.field_v = ej.field_j.field_v + 1;
                var9 = ej.field_j.field_v;
                ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, (ge) (Object) ej.field_j);
                ej.field_j.b(-var9 + ej.field_j.field_v, true);
                break L2;
              } else {
                L5: {
                  var9 = 0;
                  if (param3) {
                    var9 = var9 | 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  bc.field_b.field_v = 0;
                  bc.field_b.a(true, lc.field_P.nextInt());
                  bc.field_b.a(true, lc.field_P.nextInt());
                  bc.field_b.a(false, var13);
                  bc.field_b.a(false, var8);
                  var14 = (CharSequence) (Object) param0;
                  bc.field_b.a(false, cn.a(-28, var14));
                  bc.field_b.a((byte) -81, param2);
                  bc.field_b.a(param6, false);
                  bc.field_b.a(var9, false);
                  ej.field_j.a(18, false);
                  ej.field_j.field_v = ej.field_j.field_v + 2;
                  var10 = ej.field_j.field_v;
                  var11_ref = eq.a(hk.d(79), (byte) 112);
                  if (var11_ref == null) {
                    var11_ref = "";
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ej.field_j.a(-9946, var11_ref);
                ad.a((byte) 93, rb.field_l, bc.field_b, ei.field_q, (ge) (Object) ej.field_j);
                ej.field_j.c(-var10 + ej.field_j.field_v, (byte) -92);
                break L2;
              }
            }
            de.a(-1, 0);
            tl.field_J = dr.field_a;
            break L1;
          } else {
            break L1;
          }
        }
        if (tl.field_J == dr.field_a) {
          if (lq.b((byte) 118, 1)) {
            L7: {
              L8: {
                var9 = kn.field_e.g(-80);
                kn.field_e.field_v = 0;
                if (-101 < (var9 ^ -1)) {
                  break L8;
                } else {
                  if (105 < var9) {
                    break L8;
                  } else {
                    bi.field_b = new String[-100 + var9];
                    tl.field_J = og.field_L;
                    break L7;
                  }
                }
              }
              if ((var9 ^ -1) == -249) {
                cr.a(16, hk.d(71));
                ke.field_g = oe.field_N;
                dn.c(-70);
                we.field_e = false;
                return var9;
              } else {
                if (99 == var9) {
                  boolean discarded$1 = lq.b((byte) 63, ld.a(0));
                  bq.field_q = new Boolean(de.a((byte) 104, (ge) (Object) kn.field_e));
                  kn.field_e.field_v = 0;
                  break L7;
                } else {
                  tl.field_J = eh.field_l;
                  uq.field_c = var9;
                  of.field_Pb = -1;
                  break L7;
                }
              }
            }
            if (tl.field_J != og.field_L) {
              if (tl.field_J != eh.field_l) {
                if (param1 > 38) {
                  L9: {
                    if (null != jd.field_c) {
                      break L9;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L9;
                      } else {
                        L10: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L10;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L10;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                } else {
                  L11: {
                    ih.a(-57);
                    if (null != jd.field_c) {
                      break L11;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L11;
                      } else {
                        L12: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L12;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L12;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                if (wf.a((byte) 39)) {
                  if (uq.field_c != 255) {
                    ke.field_g = kn.field_e.j(-122);
                    dn.c(55);
                    we.field_e = false;
                    return uq.field_c;
                  } else {
                    var9_ref = kn.field_e.m(110);
                    if (var9_ref != null) {
                      fg.a(hk.d(86), -128, var9_ref);
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    } else {
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    }
                  }
                } else {
                  if (param1 > 38) {
                    L13: {
                      if (null != jd.field_c) {
                        break L13;
                      } else {
                        if (!we.field_e) {
                          var9 = vj.field_d;
                          vj.field_d = cq.field_a;
                          we.field_e = true;
                          cq.field_a = var9;
                          break L13;
                        } else {
                          L14: {
                            if (bf.d((byte) 123) <= 30000L) {
                              ke.field_g = er.field_Q;
                              break L14;
                            } else {
                              ke.field_g = wd.field_Rb;
                              break L14;
                            }
                          }
                          we.field_e = false;
                          return 249;
                        }
                      }
                    }
                    return -1;
                  } else {
                    L15: {
                      ih.a(-57);
                      if (null != jd.field_c) {
                        break L15;
                      } else {
                        if (!we.field_e) {
                          var9 = vj.field_d;
                          vj.field_d = cq.field_a;
                          we.field_e = true;
                          cq.field_a = var9;
                          break L15;
                        } else {
                          L16: {
                            if (bf.d((byte) 123) <= 30000L) {
                              ke.field_g = er.field_Q;
                              break L16;
                            } else {
                              ke.field_g = wd.field_Rb;
                              break L16;
                            }
                          }
                          we.field_e = false;
                          return 249;
                        }
                      }
                    }
                    return -1;
                  }
                }
              }
            } else {
              var9 = 2;
              if (lq.b((byte) 44, var9)) {
                var10 = kn.field_e.d(-1034);
                kn.field_e.field_v = 0;
                if (lq.b((byte) 49, var10)) {
                  var11 = bi.field_b.length;
                  var12 = 0;
                  L17: while (true) {
                    if (var11 <= var12) {
                      dn.c(53);
                      we.field_e = false;
                      return var11 + 100;
                    } else {
                      bi.field_b[var12] = kn.field_e.a(10762);
                      var12++;
                      continue L17;
                    }
                  }
                } else {
                  if (tl.field_J != eh.field_l) {
                    if (param1 > 38) {
                      L18: {
                        if (null != jd.field_c) {
                          break L18;
                        } else {
                          if (!we.field_e) {
                            var9 = vj.field_d;
                            vj.field_d = cq.field_a;
                            we.field_e = true;
                            cq.field_a = var9;
                            break L18;
                          } else {
                            L19: {
                              if (bf.d((byte) 123) <= 30000L) {
                                ke.field_g = er.field_Q;
                                break L19;
                              } else {
                                ke.field_g = wd.field_Rb;
                                break L19;
                              }
                            }
                            we.field_e = false;
                            return 249;
                          }
                        }
                      }
                      return -1;
                    } else {
                      L20: {
                        ih.a(-57);
                        if (null != jd.field_c) {
                          break L20;
                        } else {
                          if (!we.field_e) {
                            var9 = vj.field_d;
                            vj.field_d = cq.field_a;
                            we.field_e = true;
                            cq.field_a = var9;
                            break L20;
                          } else {
                            L21: {
                              if (bf.d((byte) 123) <= 30000L) {
                                ke.field_g = er.field_Q;
                                break L21;
                              } else {
                                ke.field_g = wd.field_Rb;
                                break L21;
                              }
                            }
                            we.field_e = false;
                            return 249;
                          }
                        }
                      }
                      return -1;
                    }
                  } else {
                    if (wf.a((byte) 39)) {
                      if (uq.field_c != 255) {
                        ke.field_g = kn.field_e.j(-122);
                        dn.c(55);
                        we.field_e = false;
                        return uq.field_c;
                      } else {
                        var9_ref = kn.field_e.m(110);
                        if (var9_ref != null) {
                          fg.a(hk.d(86), -128, var9_ref);
                          dn.c(55);
                          we.field_e = false;
                          return uq.field_c;
                        } else {
                          dn.c(55);
                          we.field_e = false;
                          return uq.field_c;
                        }
                      }
                    } else {
                      L22: {
                        if (param1 > 38) {
                          break L22;
                        } else {
                          ih.a(-57);
                          break L22;
                        }
                      }
                      L23: {
                        if (null != jd.field_c) {
                          break L23;
                        } else {
                          if (!we.field_e) {
                            var9 = vj.field_d;
                            vj.field_d = cq.field_a;
                            we.field_e = true;
                            cq.field_a = var9;
                            break L23;
                          } else {
                            L24: {
                              if (bf.d((byte) 123) <= 30000L) {
                                ke.field_g = er.field_Q;
                                break L24;
                              } else {
                                ke.field_g = wd.field_Rb;
                                break L24;
                              }
                            }
                            we.field_e = false;
                            return 249;
                          }
                        }
                      }
                      return -1;
                    }
                  }
                }
              } else {
                L25: {
                  if (tl.field_J != eh.field_l) {
                    break L25;
                  } else {
                    if (wf.a((byte) 39)) {
                      L26: {
                        if (uq.field_c != 255) {
                          ke.field_g = kn.field_e.j(-122);
                          break L26;
                        } else {
                          var9_ref = kn.field_e.m(110);
                          if (var9_ref != null) {
                            fg.a(hk.d(86), -128, var9_ref);
                            break L26;
                          } else {
                            break L26;
                          }
                        }
                      }
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    } else {
                      break L25;
                    }
                  }
                }
                if (param1 > 38) {
                  L27: {
                    if (null != jd.field_c) {
                      break L27;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L27;
                      } else {
                        L28: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L28;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L28;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                } else {
                  L29: {
                    ih.a(-57);
                    if (null != jd.field_c) {
                      break L29;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L29;
                      } else {
                        L30: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L30;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L30;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                }
              }
            }
          } else {
            if (tl.field_J != og.field_L) {
              if (tl.field_J != eh.field_l) {
                if (param1 > 38) {
                  L31: {
                    if (null != jd.field_c) {
                      break L31;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L31;
                      } else {
                        L32: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L32;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L32;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                } else {
                  L33: {
                    ih.a(-57);
                    if (null != jd.field_c) {
                      break L33;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L33;
                      } else {
                        L34: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L34;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L34;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                if (wf.a((byte) 39)) {
                  if (uq.field_c != 255) {
                    ke.field_g = kn.field_e.j(-122);
                    dn.c(55);
                    we.field_e = false;
                    return uq.field_c;
                  } else {
                    var9_ref = kn.field_e.m(110);
                    if (var9_ref != null) {
                      fg.a(hk.d(86), -128, var9_ref);
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    } else {
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    }
                  }
                } else {
                  L35: {
                    if (param1 > 38) {
                      break L35;
                    } else {
                      ih.a(-57);
                      break L35;
                    }
                  }
                  L36: {
                    if (null != jd.field_c) {
                      break L36;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L36;
                      } else {
                        L37: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L37;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L37;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                }
              }
            } else {
              var9 = 2;
              if (lq.b((byte) 44, var9)) {
                var10 = kn.field_e.d(-1034);
                kn.field_e.field_v = 0;
                if (lq.b((byte) 49, var10)) {
                  var11 = bi.field_b.length;
                  var12 = 0;
                  L38: while (true) {
                    if (var11 <= var12) {
                      dn.c(53);
                      we.field_e = false;
                      return var11 + 100;
                    } else {
                      bi.field_b[var12] = kn.field_e.a(10762);
                      var12++;
                      continue L38;
                    }
                  }
                } else {
                  L39: {
                    if (tl.field_J != eh.field_l) {
                      break L39;
                    } else {
                      if (wf.a((byte) 39)) {
                        L40: {
                          if (uq.field_c != 255) {
                            ke.field_g = kn.field_e.j(-122);
                            break L40;
                          } else {
                            var9_ref = kn.field_e.m(110);
                            if (var9_ref != null) {
                              fg.a(hk.d(86), -128, var9_ref);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                        }
                        dn.c(55);
                        we.field_e = false;
                        return uq.field_c;
                      } else {
                        break L39;
                      }
                    }
                  }
                  L41: {
                    if (param1 > 38) {
                      break L41;
                    } else {
                      ih.a(-57);
                      break L41;
                    }
                  }
                  L42: {
                    if (null != jd.field_c) {
                      break L42;
                    } else {
                      if (!we.field_e) {
                        var9 = vj.field_d;
                        vj.field_d = cq.field_a;
                        we.field_e = true;
                        cq.field_a = var9;
                        break L42;
                      } else {
                        L43: {
                          if (bf.d((byte) 123) <= 30000L) {
                            ke.field_g = er.field_Q;
                            break L43;
                          } else {
                            ke.field_g = wd.field_Rb;
                            break L43;
                          }
                        }
                        we.field_e = false;
                        return 249;
                      }
                    }
                  }
                  return -1;
                }
              } else {
                L44: {
                  if (tl.field_J != eh.field_l) {
                    break L44;
                  } else {
                    if (wf.a((byte) 39)) {
                      L45: {
                        if (uq.field_c != 255) {
                          ke.field_g = kn.field_e.j(-122);
                          break L45;
                        } else {
                          var9_ref = kn.field_e.m(110);
                          if (var9_ref != null) {
                            fg.a(hk.d(86), -128, var9_ref);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                      }
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    } else {
                      break L44;
                    }
                  }
                }
                L46: {
                  if (param1 > 38) {
                    break L46;
                  } else {
                    ih.a(-57);
                    break L46;
                  }
                }
                if (null == jd.field_c) {
                  if (we.field_e) {
                    L47: {
                      if (bf.d((byte) 123) <= 30000L) {
                        ke.field_g = er.field_Q;
                        break L47;
                      } else {
                        ke.field_g = wd.field_Rb;
                        break L47;
                      }
                    }
                    we.field_e = false;
                    return 249;
                  } else {
                    var9 = vj.field_d;
                    vj.field_d = cq.field_a;
                    we.field_e = true;
                    cq.field_a = var9;
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            }
          }
        } else {
          if (tl.field_J != og.field_L) {
            if (tl.field_J != eh.field_l) {
              if (param1 > 38) {
                if (null == jd.field_c) {
                  if (!we.field_e) {
                    var9 = vj.field_d;
                    vj.field_d = cq.field_a;
                    we.field_e = true;
                    cq.field_a = var9;
                    return -1;
                  } else {
                    L48: {
                      if (bf.d((byte) 123) <= 30000L) {
                        ke.field_g = er.field_Q;
                        break L48;
                      } else {
                        ke.field_g = wd.field_Rb;
                        break L48;
                      }
                    }
                    we.field_e = false;
                    return 249;
                  }
                } else {
                  return -1;
                }
              } else {
                ih.a(-57);
                if (null == jd.field_c) {
                  if (!we.field_e) {
                    var9 = vj.field_d;
                    vj.field_d = cq.field_a;
                    we.field_e = true;
                    cq.field_a = var9;
                    return -1;
                  } else {
                    L49: {
                      if (bf.d((byte) 123) <= 30000L) {
                        ke.field_g = er.field_Q;
                        break L49;
                      } else {
                        ke.field_g = wd.field_Rb;
                        break L49;
                      }
                    }
                    we.field_e = false;
                    return 249;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (wf.a((byte) 39)) {
                if (uq.field_c == 255) {
                  var9_ref = kn.field_e.m(110);
                  if (var9_ref != null) {
                    fg.a(hk.d(86), -128, var9_ref);
                    dn.c(55);
                    we.field_e = false;
                    return uq.field_c;
                  } else {
                    dn.c(55);
                    we.field_e = false;
                    return uq.field_c;
                  }
                } else {
                  ke.field_g = kn.field_e.j(-122);
                  dn.c(55);
                  we.field_e = false;
                  return uq.field_c;
                }
              } else {
                L50: {
                  if (param1 > 38) {
                    break L50;
                  } else {
                    ih.a(-57);
                    break L50;
                  }
                }
                if (null == jd.field_c) {
                  if (we.field_e) {
                    L51: {
                      if (bf.d((byte) 123) <= 30000L) {
                        ke.field_g = er.field_Q;
                        break L51;
                      } else {
                        ke.field_g = wd.field_Rb;
                        break L51;
                      }
                    }
                    we.field_e = false;
                    return 249;
                  } else {
                    var9 = vj.field_d;
                    vj.field_d = cq.field_a;
                    we.field_e = true;
                    cq.field_a = var9;
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            }
          } else {
            var9 = 2;
            if (lq.b((byte) 44, var9)) {
              var10 = kn.field_e.d(-1034);
              kn.field_e.field_v = 0;
              if (!lq.b((byte) 49, var10)) {
                L52: {
                  if (tl.field_J != eh.field_l) {
                    break L52;
                  } else {
                    if (wf.a((byte) 39)) {
                      L53: {
                        if (uq.field_c != 255) {
                          ke.field_g = kn.field_e.j(-122);
                          break L53;
                        } else {
                          var9_ref = kn.field_e.m(110);
                          if (var9_ref != null) {
                            fg.a(hk.d(86), -128, var9_ref);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                      }
                      dn.c(55);
                      we.field_e = false;
                      return uq.field_c;
                    } else {
                      break L52;
                    }
                  }
                }
                L54: {
                  if (param1 > 38) {
                    break L54;
                  } else {
                    ih.a(-57);
                    break L54;
                  }
                }
                if (null == jd.field_c) {
                  if (we.field_e) {
                    L55: {
                      if (bf.d((byte) 123) <= 30000L) {
                        ke.field_g = er.field_Q;
                        break L55;
                      } else {
                        ke.field_g = wd.field_Rb;
                        break L55;
                      }
                    }
                    we.field_e = false;
                    return 249;
                  } else {
                    var9 = vj.field_d;
                    vj.field_d = cq.field_a;
                    we.field_e = true;
                    cq.field_a = var9;
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                var11 = bi.field_b.length;
                var12 = 0;
                L56: while (true) {
                  if (var11 <= var12) {
                    dn.c(53);
                    we.field_e = false;
                    return var11 + 100;
                  } else {
                    bi.field_b[var12] = kn.field_e.a(10762);
                    var12++;
                    continue L56;
                  }
                }
              }
            } else {
              L57: {
                if (tl.field_J != eh.field_l) {
                  break L57;
                } else {
                  if (wf.a((byte) 39)) {
                    L58: {
                      if (uq.field_c != 255) {
                        ke.field_g = kn.field_e.j(-122);
                        break L58;
                      } else {
                        var9_ref = kn.field_e.m(110);
                        if (var9_ref != null) {
                          fg.a(hk.d(86), -128, var9_ref);
                          break L58;
                        } else {
                          break L58;
                        }
                      }
                    }
                    dn.c(55);
                    we.field_e = false;
                    return uq.field_c;
                  } else {
                    break L57;
                  }
                }
              }
              L59: {
                if (param1 > 38) {
                  break L59;
                } else {
                  ih.a(-57);
                  break L59;
                }
              }
              if (null == jd.field_c) {
                if (we.field_e) {
                  L60: {
                    if (bf.d((byte) 123) <= 30000L) {
                      ke.field_g = er.field_Q;
                      break L60;
                    } else {
                      ke.field_g = wd.field_Rb;
                      break L60;
                    }
                  }
                  we.field_e = false;
                  return 249;
                } else {
                  var9 = vj.field_d;
                  vj.field_d = cq.field_a;
                  we.field_e = true;
                  cq.field_a = var9;
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        hm var1 = null;
        Object var2 = null;
        var1 = new hm();
        var1.a(86, 0, 0, 65536, 64);
        if (param0 != 46) {
          var2 = null;
          int discarded$2 = ih.a((String) null, (byte) -72, 28, true, (ke) null, (ke) null, 104);
          var1.b(true);
          jc.field_e.a(param0 ^ 45, var1);
          return;
        } else {
          var1.b(true);
          jc.field_e.a(param0 ^ 45, var1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_f = new String[]{"All scores", "My scores", "Best each"};
        field_c = new String[16];
    }
}
