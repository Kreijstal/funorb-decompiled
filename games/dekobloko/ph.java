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
        int var1 = 39;
        field_yb = null;
        field_Hb = null;
        field_Cb = null;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        uc.a(180, true, param3, 320);
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
                if (!param5) {
                  L1: {
                    vh.field_g = (-640 + wj.field_Lb) / 2;
                    hg.a(param5, -1843);
                    if (param7 <= ~lg.field_W) {
                      break L1;
                    } else {
                      qm.a(param4, param9, param5, (byte) -8);
                      break L1;
                    }
                  }
                  L2: {
                    tg.field_i.field_X = 1;
                    tg.field_i.field_ub = fc.field_c.field_ub;
                    if (bf.field_r > 0) {
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
                        if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                          break L5;
                        } else {
                          gg.field_y.field_Hb = false;
                          ec.field_k.field_Rb.field_Y = cb.field_k;
                          gk.a(ec.field_k.field_Ob, true);
                          break L4;
                        }
                      }
                    }
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    break L4;
                  }
                  client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                } else {
                  L6: {
                    vh.field_g = ea.field_t;
                    hg.a(param5, -1843);
                    if (param7 <= ~lg.field_W) {
                      break L6;
                    } else {
                      qm.a(param4, param9, param5, (byte) -8);
                      break L6;
                    }
                  }
                  L7: {
                    tg.field_i.field_X = 1;
                    tg.field_i.field_ub = fc.field_c.field_ub;
                    if (bf.field_r > 0) {
                      vg.a(param9, param4, param5, 48);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (0 < tg.field_e) {
                      mn.a(0, param6, param4, param5, param9);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    L10: {
                      if (!dn.field_k) {
                        break L10;
                      } else {
                        if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                          break L10;
                        } else {
                          gg.field_y.field_Hb = false;
                          ec.field_k.field_Rb.field_Y = cb.field_k;
                          gk.a(ec.field_k.field_Ob, true);
                          break L9;
                        }
                      }
                    }
                    gg.field_y.field_Hb = true;
                    ec.field_k.field_Rb.field_Y = null;
                    cl.a(param1, -17339, param9, ec.field_k, param0);
                    break L9;
                  }
                  client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              }
            }
          }
          L11: {
            if (~hk.field_i != ~le.field_m.field_i) {
              break L11;
            } else {
              if (le.field_m.field_g != hk.field_j) {
                break L11;
              } else {
                if (cd.field_m == null) {
                  if (g.field_N != null) {
                    L12: {
                      vb.a(true, -2);
                      if (param5) {
                        vh.field_g = ea.field_t;
                        break L12;
                      } else {
                        vh.field_g = (-640 + wj.field_Lb) / 2;
                        break L12;
                      }
                    }
                    L13: {
                      hg.a(param5, -1843);
                      if (param7 <= ~lg.field_W) {
                        break L13;
                      } else {
                        qm.a(param4, param9, param5, (byte) -8);
                        break L13;
                      }
                    }
                    L14: {
                      tg.field_i.field_X = 1;
                      tg.field_i.field_ub = fc.field_c.field_ub;
                      if (bf.field_r > 0) {
                        vg.a(param9, param4, param5, 48);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (0 < tg.field_e) {
                        mn.a(0, param6, param4, param5, param9);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      L17: {
                        if (!dn.field_k) {
                          break L17;
                        } else {
                          if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                            break L17;
                          } else {
                            gg.field_y.field_Hb = false;
                            ec.field_k.field_Rb.field_Y = cb.field_k;
                            gk.a(ec.field_k.field_Ob, true);
                            break L16;
                          }
                        }
                      }
                      gg.field_y.field_Hb = true;
                      ec.field_k.field_Rb.field_Y = null;
                      cl.a(param1, -17339, param9, ec.field_k, param0);
                      break L16;
                    }
                    client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                    cl.a(param1, -17339, param9, tb.field_b, param0);
                    oe.field_G = oe.field_G + 1;
                    return;
                  } else {
                    mf.h(5);
                    break L11;
                  }
                } else {
                  vb.a(false, -2);
                  break L11;
                }
              }
            }
          }
          if (param5) {
            vh.field_g = ea.field_t;
            hg.a(param5, -1843);
            if (param7 <= ~lg.field_W) {
              L18: {
                tg.field_i.field_X = 1;
                tg.field_i.field_ub = fc.field_c.field_ub;
                if (bf.field_r > 0) {
                  vg.a(param9, param4, param5, 48);
                  break L18;
                } else {
                  break L18;
                }
              }
              L19: {
                if (0 < tg.field_e) {
                  mn.a(0, param6, param4, param5, param9);
                  break L19;
                } else {
                  break L19;
                }
              }
              if (dn.field_k) {
                if (~cd.field_m.field_mc >= ~cd.field_m.field_rc) {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                  client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                } else {
                  gg.field_y.field_Hb = true;
                  ec.field_k.field_Rb.field_Y = null;
                  cl.a(param1, -17339, param9, ec.field_k, param0);
                  client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              } else {
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
                client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                cl.a(param1, -17339, param9, tb.field_b, param0);
                oe.field_G = oe.field_G + 1;
                return;
              }
            } else {
              L20: {
                qm.a(param4, param9, param5, (byte) -8);
                tg.field_i.field_X = 1;
                tg.field_i.field_ub = fc.field_c.field_ub;
                if (bf.field_r > 0) {
                  vg.a(param9, param4, param5, 48);
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (0 < tg.field_e) {
                  mn.a(0, param6, param4, param5, param9);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                L23: {
                  if (!dn.field_k) {
                    break L23;
                  } else {
                    if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                      break L23;
                    } else {
                      gg.field_y.field_Hb = false;
                      ec.field_k.field_Rb.field_Y = cb.field_k;
                      gk.a(ec.field_k.field_Ob, true);
                      break L22;
                    }
                  }
                }
                gg.field_y.field_Hb = true;
                ec.field_k.field_Rb.field_Y = null;
                cl.a(param1, -17339, param9, ec.field_k, param0);
                break L22;
              }
              client.a(param1, param2, param0, param8, true, param9, (byte) -119);
              cl.a(param1, -17339, param9, tb.field_b, param0);
              oe.field_G = oe.field_G + 1;
              return;
            }
          } else {
            L24: {
              vh.field_g = (-640 + wj.field_Lb) / 2;
              hg.a(param5, -1843);
              if (param7 <= ~lg.field_W) {
                break L24;
              } else {
                qm.a(param4, param9, param5, (byte) -8);
                break L24;
              }
            }
            L25: {
              tg.field_i.field_X = 1;
              tg.field_i.field_ub = fc.field_c.field_ub;
              if (bf.field_r > 0) {
                vg.a(param9, param4, param5, 48);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              if (0 < tg.field_e) {
                mn.a(0, param6, param4, param5, param9);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              if (!dn.field_k) {
                break L27;
              } else {
                if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                  break L27;
                } else {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                  client.a(param1, param2, param0, param8, true, param9, (byte) -119);
                  cl.a(param1, -17339, param9, tb.field_b, param0);
                  oe.field_G = oe.field_G + 1;
                  return;
                }
              }
            }
            gg.field_y.field_Hb = true;
            ec.field_k.field_Rb.field_Y = null;
            cl.a(param1, -17339, param9, ec.field_k, param0);
            client.a(param1, param2, param0, param8, true, param9, (byte) -119);
            cl.a(param1, -17339, param9, tb.field_b, param0);
            oe.field_G = oe.field_G + 1;
            return;
          }
        } else {
          L28: {
            vh.field_g = ea.field_t;
            hg.a(param5, -1843);
            if (param7 <= ~lg.field_W) {
              break L28;
            } else {
              qm.a(param4, param9, param5, (byte) -8);
              break L28;
            }
          }
          L29: {
            tg.field_i.field_X = 1;
            tg.field_i.field_ub = fc.field_c.field_ub;
            if (bf.field_r > 0) {
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
          L31: {
            L32: {
              if (!dn.field_k) {
                break L32;
              } else {
                if (~cd.field_m.field_mc < ~cd.field_m.field_rc) {
                  break L32;
                } else {
                  gg.field_y.field_Hb = false;
                  ec.field_k.field_Rb.field_Y = cb.field_k;
                  gk.a(ec.field_k.field_Ob, true);
                  break L31;
                }
              }
            }
            gg.field_y.field_Hb = true;
            ec.field_k.field_Rb.field_Y = null;
            cl.a(param1, -17339, param9, ec.field_k, param0);
            break L31;
          }
          client.a(param1, param2, param0, param8, true, param9, (byte) -119);
          cl.a(param1, -17339, param9, tb.field_b, param0);
          oe.field_G = oe.field_G + 1;
          return;
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
