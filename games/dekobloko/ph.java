/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends ca {
    static String field_Bb;
    static String[] field_Eb;
    static ji field_Db;
    static String field_Hb;
    static ji field_Fb;
    static ck[] field_yb;
    static String field_Cb;
    static um field_xb;
    static boolean field_Ab;
    static String field_Gb;
    static String field_zb;

    final void c(ce param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.c(param0, (byte) 31);
              if (param1 >= 10) {
                break L1;
              } else {
                discarded$2 = ph.n(39);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ph.T(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final static boolean n(int param0) {
        if (param0 != -30146) {
            ph.a(false, -84, 71, true, false, false, false, -53, -127, 124);
            return v.field_d;
        }
        return v.field_d;
    }

    ph(ka param0, ce param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(byte param0) {
        field_Bb = null;
        field_Db = null;
        field_zb = null;
        field_Gb = null;
        field_xb = null;
        field_Fb = null;
        field_Eb = null;
        int var1 = -79 / ((-72 - param0) / 41);
        field_yb = null;
        field_Hb = null;
        field_Cb = null;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        uc.a(param0, true, param3, param1);
        if (param2) {
            field_Gb = (String) null;
        }
    }

    final static void a(boolean param0, int param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6, int param7, int param8, int param9) {
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        if (!param5) {
          L0: {
            if (wj.field_Lb != hk.field_j) {
              break L0;
            } else {
              if (vk.field_f != hk.field_i) {
                break L0;
              } else {
                if (param5) {
                  L1: {
                    vh.field_g = ea.field_t;
                    hg.a(param5, -1843);
                    if (param7 <= (lg.field_W ^ -1)) {
                      break L1;
                    } else {
                      qm.a(param4, param9, param5, (byte) -8);
                      break L1;
                    }
                  }
                  L2: {
                    tg.field_i.field_X = 1;
                    tg.field_i.field_ub = fc.field_c.field_ub;
                    if (-1 > (bf.field_r ^ -1)) {
                      vg.a(param9, param4, param5, 48);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (0 < tg.field_e) {
                      mn.a(0, param6, param4, param5, param9);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (!dn.field_k) {
                        break L5;
                      } else {
                        if (cd.field_m.field_mc > cd.field_m.field_rc) {
                          break L5;
                        } else {
                          gg.field_y.field_Hb = false;
                          ec.field_k.field_Rb.field_Y = cb.field_k;
                          gk.a(ec.field_k.field_Ob, true);
                          if (var11 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    break L4;
                  }
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                } else {
                  vh.field_g = (-640 + wj.field_Lb) / 2;
                  if (var11 == 0) {
                    hg.a(param5, -1843);
                    if (param7 <= (lg.field_W ^ -1)) {
                      L6: {
                        tg.field_i.field_X = 1;
                        tg.field_i.field_ub = fc.field_c.field_ub;
                        if (-1 > (bf.field_r ^ -1)) {
                          vg.a(param9, param4, param5, 48);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if (0 < tg.field_e) {
                          mn.a(0, param6, param4, param5, param9);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      if (dn.field_k) {
                        if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                          gg.field_y.field_Hb = false;
                          ec.field_k.field_Rb.field_Y = cb.field_k;
                          gk.a(ec.field_k.field_Ob, true);
                          if (var11 != 0) {
                            gg.field_y.field_Hb = true;
                            ec.field_k.field_Rb.field_Y = null;
                            cl.a(param1, -17339, param9, ec.field_k, param0);
                            client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                            cl.a(param1, -17339, param9, tb.field_b, param0);
                            oe.field_G = oe.field_G + 1;
                            return;
                          } else {
                            client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                            cl.a(param1, -17339, param9, tb.field_b, param0);
                            oe.field_G = oe.field_G + 1;
                            return;
                          }
                        } else {
                          gg.field_y.field_Hb = true;
                          ec.field_k.field_Rb.field_Y = null;
                          cl.a(param1, -17339, param9, ec.field_k, param0);
                          client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                          cl.a(param1, -17339, param9, tb.field_b, param0);
                          oe.field_G = oe.field_G + 1;
                          return;
                        }
                      } else {
                        gg.field_y.field_Hb = true;
                        ec.field_k.field_Rb.field_Y = null;
                        cl.a(param1, -17339, param9, ec.field_k, param0);
                        client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                        cl.a(param1, -17339, param9, tb.field_b, param0);
                        oe.field_G = oe.field_G + 1;
                        return;
                      }
                    } else {
                      L8: {
                        qm.a(param4, param9, param5, (byte) -8);
                        tg.field_i.field_X = 1;
                        tg.field_i.field_ub = fc.field_c.field_ub;
                        if (-1 > (bf.field_r ^ -1)) {
                          vg.a(param9, param4, param5, 48);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (0 < tg.field_e) {
                          mn.a(0, param6, param4, param5, param9);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        L11: {
                          if (!dn.field_k) {
                            break L11;
                          } else {
                            if (cd.field_m.field_mc > cd.field_m.field_rc) {
                              break L11;
                            } else {
                              gg.field_y.field_Hb = false;
                              ec.field_k.field_Rb.field_Y = cb.field_k;
                              gk.a(ec.field_k.field_Ob, true);
                              if (var11 == 0) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        gg.field_y.field_Hb = true;
                        ec.field_k.field_Rb.field_Y = null;
                        cl.a(param1, -17339, param9, ec.field_k, param0);
                        break L10;
                      }
                      client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                      cl.a(param1, -17339, param9, tb.field_b, param0);
                      oe.field_G = oe.field_G + 1;
                      return;
                    }
                  } else {
                    L12: {
                      vh.field_g = ea.field_t;
                      hg.a(param5, -1843);
                      if (param7 <= (lg.field_W ^ -1)) {
                        break L12;
                      } else {
                        qm.a(param4, param9, param5, (byte) -8);
                        break L12;
                      }
                    }
                    L13: {
                      tg.field_i.field_X = 1;
                      tg.field_i.field_ub = fc.field_c.field_ub;
                      if (-1 > (bf.field_r ^ -1)) {
                        vg.a(param9, param4, param5, 48);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (0 < tg.field_e) {
                        mn.a(0, param6, param4, param5, param9);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      L16: {
                        if (!dn.field_k) {
                          break L16;
                        } else {
                          if (cd.field_m.field_mc > cd.field_m.field_rc) {
                            break L16;
                          } else {
                            gg.field_y.field_Hb = false;
                            ec.field_k.field_Rb.field_Y = cb.field_k;
                            gk.a(ec.field_k.field_Ob, true);
                            if (var11 == 0) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      gg.field_y.field_Hb = true;
                      ec.field_k.field_Rb.field_Y = null;
                      cl.a(param1, -17339, param9, ec.field_k, param0);
                      break L15;
                    }
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  }
                }
              }
            }
          }
          L17: {
            if (hk.field_i != le.field_m.field_i) {
              break L17;
            } else {
              if (le.field_m.field_g != hk.field_j) {
                break L17;
              } else {
                L18: {
                  if (cd.field_m == null) {
                    break L18;
                  } else {
                    vb.a(false, -2);
                    if (var11 == 0) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
                if (g.field_N != null) {
                  vb.a(true, -2);
                  break L17;
                } else {
                  mf.h(5);
                  if (var11 == 0) {
                    break L17;
                  } else {
                    L19: {
                      vb.a(true, -2);
                      if (param5) {
                        vh.field_g = ea.field_t;
                        break L19;
                      } else {
                        vh.field_g = (-640 + wj.field_Lb) / 2;
                        if (var11 == 0) {
                          break L19;
                        } else {
                          vh.field_g = ea.field_t;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      hg.a(param5, -1843);
                      if (param7 <= (lg.field_W ^ -1)) {
                        break L20;
                      } else {
                        qm.a(param4, param9, param5, (byte) -8);
                        break L20;
                      }
                    }
                    L21: {
                      tg.field_i.field_X = 1;
                      tg.field_i.field_ub = fc.field_c.field_ub;
                      if (-1 > (bf.field_r ^ -1)) {
                        vg.a(param9, param4, param5, 48);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    L22: {
                      if (0 < tg.field_e) {
                        mn.a(0, param6, param4, param5, param9);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      L24: {
                        if (!dn.field_k) {
                          break L24;
                        } else {
                          if (cd.field_m.field_mc > cd.field_m.field_rc) {
                            break L24;
                          } else {
                            gg.field_y.field_Hb = false;
                            ec.field_k.field_Rb.field_Y = cb.field_k;
                            gk.a(ec.field_k.field_Ob, true);
                            if (var11 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      gg.field_y.field_Hb = true;
                      ec.field_k.field_Rb.field_Y = null;
                      cl.a(param1, -17339, param9, ec.field_k, param0);
                      break L23;
                    }
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  }
                }
              }
            }
          }
          if (param5) {
            L25: {
              vh.field_g = ea.field_t;
              hg.a(param5, -1843);
              if (param7 <= (lg.field_W ^ -1)) {
                break L25;
              } else {
                qm.a(param4, param9, param5, (byte) -8);
                break L25;
              }
            }
            L26: {
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (-1 > (bf.field_r ^ -1)) {
                vg.a(param9, param4, param5, 48);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
                break L27;
              } else {
                break L27;
              }
            }
            if (dn.field_k) {
              if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                gg.field_y.field_Hb = false;
                ec.field_k.field_Rb.field_Y = cb.field_k;
                gk.a(ec.field_k.field_Ob, true);
                if (var11 != 0) {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                } else {
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
                client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
            } else {
              gg.field_y.field_Hb = true;
              ec.field_k.field_Rb.field_Y = null;
              cl.a(param1, -17339, param9, ec.field_k, param0);
              client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
              cl.a(param1, -17339, param9, tb.field_b, param0);
              oe.field_G = oe.field_G + 1;
              return;
            }
          } else {
            vh.field_g = (-640 + wj.field_Lb) / 2;
            if (var11 == 0) {
              L28: {
                hg.a(param5, -1843);
                if (param7 <= (lg.field_W ^ -1)) {
                  break L28;
                } else {
                  qm.a(param4, param9, param5, (byte) -8);
                  break L28;
                }
              }
              L29: {
                tg.field_i.field_X = 1;
                tg.field_i.field_ub = fc.field_c.field_ub;
                if (-1 > (bf.field_r ^ -1)) {
                  vg.a(param9, param4, param5, 48);
                  break L29;
                } else {
                  break L29;
                }
              }
              L30: {
                if (0 < tg.field_e) {
                  mn.a(0, param6, param4, param5, param9);
                  break L30;
                } else {
                  break L30;
                }
              }
              if (dn.field_k) {
                if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                  if (var11 != 0) {
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  } else {
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  }
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
                client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
            } else {
              vh.field_g = ea.field_t;
              hg.a(param5, -1843);
              if (param7 <= (lg.field_W ^ -1)) {
                L31: {
                  tg.field_i.field_X = 1;
                  tg.field_i.field_ub = fc.field_c.field_ub;
                  if (-1 > (bf.field_r ^ -1)) {
                    vg.a(param9, param4, param5, 48);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (0 < tg.field_e) {
                    mn.a(0, param6, param4, param5, param9);
                    break L32;
                  } else {
                    break L32;
                  }
                }
                if (dn.field_k) {
                  if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                    gg.field_y.field_Hb = false;
                    ec.field_k.field_Rb.field_Y = cb.field_k;
                    gk.a(ec.field_k.field_Ob, true);
                    if (var11 == 0) {
                      client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                      cl.a(param1, -17339, param9, tb.field_b, param0);
                      oe.field_G = oe.field_G + 1;
                      return;
                    } else {
                      gg.field_y.field_Hb = true;
                      ec.field_k.field_Rb.field_Y = null;
                      cl.a(param1, -17339, param9, ec.field_k, param0);
                      client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                      cl.a(param1, -17339, param9, tb.field_b, param0);
                      oe.field_G = oe.field_G + 1;
                      return;
                    }
                  } else {
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  }
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              } else {
                L33: {
                  qm.a(param4, param9, param5, (byte) -8);
                  tg.field_i.field_X = 1;
                  tg.field_i.field_ub = fc.field_c.field_ub;
                  if (-1 > (bf.field_r ^ -1)) {
                    vg.a(param9, param4, param5, 48);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (0 < tg.field_e) {
                    mn.a(0, param6, param4, param5, param9);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  L36: {
                    if (!dn.field_k) {
                      break L36;
                    } else {
                      if (cd.field_m.field_mc > cd.field_m.field_rc) {
                        break L36;
                      } else {
                        gg.field_y.field_Hb = false;
                        ec.field_k.field_Rb.field_Y = cb.field_k;
                        gk.a(ec.field_k.field_Ob, true);
                        if (var11 == 0) {
                          break L35;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  break L35;
                }
                client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
            }
          }
        } else {
          if (param5) {
            L37: {
              vh.field_g = ea.field_t;
              hg.a(param5, -1843);
              if (param7 <= (lg.field_W ^ -1)) {
                break L37;
              } else {
                qm.a(param4, param9, param5, (byte) -8);
                break L37;
              }
            }
            L38: {
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (-1 > (bf.field_r ^ -1)) {
                vg.a(param9, param4, param5, 48);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              L41: {
                if (!dn.field_k) {
                  break L41;
                } else {
                  if (cd.field_m.field_mc > cd.field_m.field_rc) {
                    break L41;
                  } else {
                    gg.field_y.field_Hb = false;
                    ec.field_k.field_Rb.field_Y = cb.field_k;
                    gk.a(ec.field_k.field_Ob, true);
                    if (var11 == 0) {
                      break L40;
                    } else {
                      break L41;
                    }
                  }
                }
              }
              gg.field_y.field_Hb = true;
              ec.field_k.field_Rb.field_Y = null;
              cl.a(param1, -17339, param9, ec.field_k, param0);
              break L40;
            }
            client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
            cl.a(param1, -17339, param9, tb.field_b, param0);
            oe.field_G = oe.field_G + 1;
            return;
          } else {
            vh.field_g = (-640 + wj.field_Lb) / 2;
            if (var11 == 0) {
              hg.a(param5, -1843);
              if (param7 <= (lg.field_W ^ -1)) {
                L42: {
                  tg.field_i.field_X = 1;
                  tg.field_i.field_ub = fc.field_c.field_ub;
                  if (-1 > (bf.field_r ^ -1)) {
                    vg.a(param9, param4, param5, 48);
                    break L42;
                  } else {
                    break L42;
                  }
                }
                L43: {
                  if (0 < tg.field_e) {
                    mn.a(0, param6, param4, param5, param9);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                if (dn.field_k) {
                  if (cd.field_m.field_mc <= cd.field_m.field_rc) {
                    gg.field_y.field_Hb = false;
                    ec.field_k.field_Rb.field_Y = cb.field_k;
                    gk.a(ec.field_k.field_Ob, true);
                    if (var11 != 0) {
                      gg.field_y.field_Hb = true;
                      ec.field_k.field_Rb.field_Y = null;
                      cl.a(param1, -17339, param9, ec.field_k, param0);
                      client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                      cl.a(param1, -17339, param9, tb.field_b, param0);
                      oe.field_G = oe.field_G + 1;
                      return;
                    } else {
                      client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                      cl.a(param1, -17339, param9, tb.field_b, param0);
                      oe.field_G = oe.field_G + 1;
                      return;
                    }
                  } else {
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  }
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              } else {
                L44: {
                  qm.a(param4, param9, param5, (byte) -8);
                  tg.field_i.field_X = 1;
                  tg.field_i.field_ub = fc.field_c.field_ub;
                  if (-1 > (bf.field_r ^ -1)) {
                    vg.a(param9, param4, param5, 48);
                    break L44;
                  } else {
                    break L44;
                  }
                }
                L45: {
                  if (0 < tg.field_e) {
                    mn.a(0, param6, param4, param5, param9);
                    break L45;
                  } else {
                    break L45;
                  }
                }
                L46: {
                  L47: {
                    if (!dn.field_k) {
                      break L47;
                    } else {
                      if (cd.field_m.field_mc > cd.field_m.field_rc) {
                        break L47;
                      } else {
                        gg.field_y.field_Hb = false;
                        ec.field_k.field_Rb.field_Y = cb.field_k;
                        gk.a(ec.field_k.field_Ob, true);
                        if (var11 == 0) {
                          break L46;
                        } else {
                          break L47;
                        }
                      }
                    }
                  }
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  break L46;
                }
                client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
            } else {
              L48: {
                vh.field_g = ea.field_t;
                hg.a(param5, -1843);
                if (param7 <= (lg.field_W ^ -1)) {
                  break L48;
                } else {
                  qm.a(param4, param9, param5, (byte) -8);
                  break L48;
                }
              }
              L49: {
                tg.field_i.field_X = 1;
                tg.field_i.field_ub = fc.field_c.field_ub;
                if (-1 > (bf.field_r ^ -1)) {
                  vg.a(param9, param4, param5, 48);
                  break L49;
                } else {
                  break L49;
                }
              }
              L50: {
                if (0 < tg.field_e) {
                  mn.a(0, param6, param4, param5, param9);
                  break L50;
                } else {
                  break L50;
                }
              }
              L51: {
                L52: {
                  if (!dn.field_k) {
                    break L52;
                  } else {
                    if (cd.field_m.field_mc > cd.field_m.field_rc) {
                      break L52;
                    } else {
                      gg.field_y.field_Hb = false;
                      ec.field_k.field_Rb.field_Y = cb.field_k;
                      gk.a(ec.field_k.field_Ob, true);
                      if (var11 == 0) {
                        break L51;
                      } else {
                        break L52;
                      }
                    }
                  }
                }
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
                break L51;
              }
              client.a(param1, param2, param0, param8, param3, param9, (byte) -119);
              cl.a(param1, -17339, param9, tb.field_b, param0);
              oe.field_G = oe.field_G + 1;
              return;
            }
          }
        }
    }

    static {
        field_Hb = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
        field_Bb = "<%0> is already on your ignore list.";
        field_Ab = false;
        field_Cb = "\"I think it's shaping up quite nicely!\" - Ian T";
        field_Gb = "Deko Bloko";
        field_zb = "No adverts";
    }
}
