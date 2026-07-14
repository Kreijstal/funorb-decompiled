/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sp implements ca, ai {
    static ri field_C;
    static int field_H;
    private uk field_G;
    private wp field_D;
    static hr field_B;
    private ar field_F;

    final boolean a(pk param0, char param1, byte param2, int param3) {
        if (super.a(param0, param1, (byte) 60, param3)) {
          return true;
        } else {
          if (98 != param3) {
            if (-100 != (param3 ^ -1)) {
              if (param2 < 9) {
                th.e(false);
                return false;
              } else {
                return false;
              }
            } else {
              return ((th) this).a(param0, false);
            }
          } else {
            return ((th) this).a((byte) -94, param0);
          }
        }
    }

    th(uk param0) {
        super(0, 0, 288, 0, (mh) null);
        ((th) this).field_G = param0;
        ((th) this).field_D = new wp(wd.field_h, (qm) null);
        ((th) this).field_D.field_w = (mh) (Object) new ue();
        String var7 = ic.a(qv.field_l, new String[2], (byte) -128);
        int var3 = 20;
        gm var4 = new gm(kw.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, kw.field_b.field_s, -1, 2147483647, true);
        ((th) this).field_F = new ar(var7, (mh) (Object) var4);
        ((th) this).field_F.field_t = "";
        ((th) this).field_F.a(-57, sb.field_e, 0);
        ((th) this).field_F.a(-66, sb.field_e, 1);
        ((th) this).field_F.field_o = (qm) this;
        ((th) this).field_F.field_q = -40 + ((th) this).field_q;
        ((th) this).field_F.a(var3, false, 26, -40 + ((th) this).field_q);
        var3 = var3 + (15 + ((th) this).field_F.field_p);
        ((th) this).a((pk) (Object) ((th) this).field_F, 99);
        int var5 = 4;
        int var6 = 200;
        ((th) this).field_D.a(-79, 300 + -var6 >> 1811237697, var3, 40, var6);
        ((th) this).field_D.field_o = (qm) this;
        ((th) this).a((pk) (Object) ((th) this).field_D, 76);
        ((th) this).a(-112, 0, 0, 55 + var3 + var5, 300);
    }

    final static void b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        var3 = 1 << param2;
        if ((var3 & kh.field_e) == 0) {
          L0: {
            kh.field_e = kh.field_e | var3;
            wj.field_e = wj.field_e | var3;
            pl.field_v.a((ms) (Object) new ge(param2), (byte) 39);
            if (-6 >= (gj.a((byte) -84, 10) ^ -1)) {
              fb.field_a = fb.field_a + iw.field_b;
              break L0;
            } else {
              ha.field_f = ha.field_f + iw.field_b;
              break L0;
            }
          }
          L1: {
            if ((gj.a((byte) -84, 10) ^ -1) > -6) {
              ts.field_a = ts.field_a - te.field_c;
              break L1;
            } else {
              kn.field_b = kn.field_b - te.field_c;
              break L1;
            }
          }
          ia.a(param2, (byte) -82);
          if (param0 == 24753) {
            L2: {
              if (3 == param2) {
                kn.field_b = kn.field_b - ld.field_C;
                ha.field_f = ha.field_f + oh.field_e;
                ts.field_a = ts.field_a - nq.field_i;
                break L2;
              } else {
                if (param2 != 4) {
                  if (param2 != 5) {
                    L3: {
                      if (6 == param2) {
                        break L3;
                      } else {
                        if (-8 != (param2 ^ -1)) {
                          if (param2 != 10) {
                            if (param2 != 0) {
                              if (param2 != 1) {
                                if (2 != param2) {
                                  break L2;
                                } else {
                                  fb.field_a = fb.field_a + oh.field_e;
                                  break L2;
                                }
                              } else {
                                fb.field_a = fb.field_a + oh.field_e;
                                break L2;
                              }
                            } else {
                              fb.field_a = fb.field_a + oh.field_e;
                              break L2;
                            }
                          } else {
                            ha.field_f = ha.field_f + oh.field_e;
                            break L2;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    ts.field_a = ts.field_a + nq.field_i;
                    break L2;
                  } else {
                    L4: {
                      ts.field_a = ts.field_a + nq.field_i;
                      if (!f.field_w) {
                        pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (3 != param2) {
                        if (param2 != 4) {
                          if ((param2 ^ -1) != -6) {
                            if (6 != param2) {
                              if (param2 != 7) {
                                if (10 == param2) {
                                  L6: {
                                    ha.field_f = ha.field_f - oh.field_e;
                                    if (5 > gj.a((byte) -84, 10)) {
                                      ha.field_f = ha.field_f - iw.field_b;
                                      break L6;
                                    } else {
                                      fb.field_a = fb.field_a - iw.field_b;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (gj.a((byte) -84, 10) >= 5) {
                                      kn.field_b = kn.field_b + te.field_c;
                                      break L7;
                                    } else {
                                      ts.field_a = ts.field_a + te.field_c;
                                      break L7;
                                    }
                                  }
                                  return;
                                } else {
                                  L8: {
                                    if (param2 == 0) {
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  fb.field_a = fb.field_a - oh.field_e;
                                  break L5;
                                }
                              } else {
                                L9: {
                                  ts.field_a = ts.field_a - nq.field_i;
                                  if (5 > gj.a((byte) -84, 10)) {
                                    ha.field_f = ha.field_f - iw.field_b;
                                    break L9;
                                  } else {
                                    fb.field_a = fb.field_a - iw.field_b;
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    break L10;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    break L10;
                                  }
                                }
                                return;
                              }
                            } else {
                              L11: {
                                ts.field_a = ts.field_a - nq.field_i;
                                if (5 > gj.a((byte) -84, 10)) {
                                  ha.field_f = ha.field_f - iw.field_b;
                                  break L11;
                                } else {
                                  fb.field_a = fb.field_a - iw.field_b;
                                  break L11;
                                }
                              }
                              L12: {
                                if (gj.a((byte) -84, 10) >= 5) {
                                  kn.field_b = kn.field_b + te.field_c;
                                  break L12;
                                } else {
                                  ts.field_a = ts.field_a + te.field_c;
                                  break L12;
                                }
                              }
                              return;
                            }
                          } else {
                            L13: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L13;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L13;
                              }
                            }
                            L14: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L14;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L14;
                              }
                            }
                            return;
                          }
                        } else {
                          L15: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              ha.field_f = ha.field_f - iw.field_b;
                              break L15;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              break L15;
                            }
                          }
                          L16: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              kn.field_b = kn.field_b + te.field_c;
                              break L16;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              break L16;
                            }
                          }
                          return;
                        }
                      } else {
                        kn.field_b = kn.field_b + ld.field_C;
                        ha.field_f = ha.field_f - oh.field_e;
                        ts.field_a = ts.field_a + nq.field_i;
                        break L5;
                      }
                    }
                    if (5 <= gj.a((byte) -84, 10)) {
                      L17: {
                        fb.field_a = fb.field_a - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          break L17;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          break L17;
                        }
                      }
                      return;
                    } else {
                      L18: {
                        ha.field_f = ha.field_f - iw.field_b;
                        if (gj.a((byte) -84, 10) >= 5) {
                          kn.field_b = kn.field_b + te.field_c;
                          break L18;
                        } else {
                          ts.field_a = ts.field_a + te.field_c;
                          break L18;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L19: {
                    ts.field_a = ts.field_a + nq.field_i;
                    if (!f.field_w) {
                      pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (3 != param2) {
                      if (param2 != 4) {
                        if ((param2 ^ -1) != -6) {
                          if (6 != param2) {
                            if (param2 != 7) {
                              if (10 == param2) {
                                L21: {
                                  ha.field_f = ha.field_f - oh.field_e;
                                  if (5 > gj.a((byte) -84, 10)) {
                                    ha.field_f = ha.field_f - iw.field_b;
                                    break L21;
                                  } else {
                                    fb.field_a = fb.field_a - iw.field_b;
                                    break L21;
                                  }
                                }
                                L22: {
                                  if (gj.a((byte) -84, 10) >= 5) {
                                    kn.field_b = kn.field_b + te.field_c;
                                    break L22;
                                  } else {
                                    ts.field_a = ts.field_a + te.field_c;
                                    break L22;
                                  }
                                }
                                return;
                              } else {
                                L23: {
                                  if (param2 == 0) {
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                fb.field_a = fb.field_a - oh.field_e;
                                break L20;
                              }
                            } else {
                              L24: {
                                ts.field_a = ts.field_a - nq.field_i;
                                if (5 > gj.a((byte) -84, 10)) {
                                  ha.field_f = ha.field_f - iw.field_b;
                                  break L24;
                                } else {
                                  fb.field_a = fb.field_a - iw.field_b;
                                  break L24;
                                }
                              }
                              L25: {
                                if (gj.a((byte) -84, 10) >= 5) {
                                  kn.field_b = kn.field_b + te.field_c;
                                  break L25;
                                } else {
                                  ts.field_a = ts.field_a + te.field_c;
                                  break L25;
                                }
                              }
                              return;
                            }
                          } else {
                            L26: {
                              ts.field_a = ts.field_a - nq.field_i;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L26;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L26;
                              }
                            }
                            L27: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L27;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L27;
                              }
                            }
                            return;
                          }
                        } else {
                          L28: {
                            ts.field_a = ts.field_a - nq.field_i;
                            if (5 > gj.a((byte) -84, 10)) {
                              ha.field_f = ha.field_f - iw.field_b;
                              break L28;
                            } else {
                              fb.field_a = fb.field_a - iw.field_b;
                              break L28;
                            }
                          }
                          L29: {
                            if (gj.a((byte) -84, 10) >= 5) {
                              kn.field_b = kn.field_b + te.field_c;
                              break L29;
                            } else {
                              ts.field_a = ts.field_a + te.field_c;
                              break L29;
                            }
                          }
                          return;
                        }
                      } else {
                        L30: {
                          ts.field_a = ts.field_a - nq.field_i;
                          if (5 > gj.a((byte) -84, 10)) {
                            ha.field_f = ha.field_f - iw.field_b;
                            break L30;
                          } else {
                            fb.field_a = fb.field_a - iw.field_b;
                            break L30;
                          }
                        }
                        L31: {
                          if (gj.a((byte) -84, 10) >= 5) {
                            kn.field_b = kn.field_b + te.field_c;
                            break L31;
                          } else {
                            ts.field_a = ts.field_a + te.field_c;
                            break L31;
                          }
                        }
                        return;
                      }
                    } else {
                      kn.field_b = kn.field_b + ld.field_C;
                      ha.field_f = ha.field_f - oh.field_e;
                      ts.field_a = ts.field_a + nq.field_i;
                      break L20;
                    }
                  }
                  if (5 <= gj.a((byte) -84, 10)) {
                    L32: {
                      fb.field_a = fb.field_a - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L32;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L32;
                      }
                    }
                    return;
                  } else {
                    L33: {
                      ha.field_f = ha.field_f - iw.field_b;
                      if (gj.a((byte) -84, 10) >= 5) {
                        kn.field_b = kn.field_b + te.field_c;
                        break L33;
                      } else {
                        ts.field_a = ts.field_a + te.field_c;
                        break L33;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L34: {
              if (!f.field_w) {
                pn.field_q.a((ms) (Object) new hg(param2, param1, ha.field_f, fb.field_a, ts.field_a, kn.field_b), (byte) 39);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              if (3 != param2) {
                L36: {
                  if (param2 == 4) {
                    break L36;
                  } else {
                    if (param2 == -6) {
                      break L36;
                    } else {
                      if (6 == param2) {
                        break L36;
                      } else {
                        if (param2 == 7) {
                          break L36;
                        } else {
                          if (10 == param2) {
                            L37: {
                              ha.field_f = ha.field_f - oh.field_e;
                              if (5 > gj.a((byte) -84, 10)) {
                                ha.field_f = ha.field_f - iw.field_b;
                                break L37;
                              } else {
                                fb.field_a = fb.field_a - iw.field_b;
                                break L37;
                              }
                            }
                            L38: {
                              if (gj.a((byte) -84, 10) >= 5) {
                                kn.field_b = kn.field_b + te.field_c;
                                break L38;
                              } else {
                                ts.field_a = ts.field_a + te.field_c;
                                break L38;
                              }
                            }
                            return;
                          } else {
                            L39: {
                              if (param2 == 0) {
                                break L39;
                              } else {
                                if (-2 == param2) {
                                  break L39;
                                } else {
                                  if ((param2 ^ -1) == -3) {
                                    break L39;
                                  } else {
                                    break L35;
                                  }
                                }
                              }
                            }
                            fb.field_a = fb.field_a - oh.field_e;
                            break L35;
                          }
                        }
                      }
                    }
                  }
                }
                ts.field_a = ts.field_a - nq.field_i;
                if (5 > gj.a((byte) -84, 10)) {
                  ha.field_f = ha.field_f - iw.field_b;
                  if (gj.a((byte) -84, 10) >= 5) {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  } else {
                    ts.field_a = ts.field_a + te.field_c;
                    return;
                  }
                } else {
                  fb.field_a = fb.field_a - iw.field_b;
                  if (gj.a((byte) -84, 10) >= 5) {
                    kn.field_b = kn.field_b + te.field_c;
                    return;
                  } else {
                    ts.field_a = ts.field_a + te.field_c;
                    return;
                  }
                }
              } else {
                kn.field_b = kn.field_b + ld.field_C;
                ha.field_f = ha.field_f - oh.field_e;
                ts.field_a = ts.field_a + nq.field_i;
                break L35;
              }
            }
            if (5 > gj.a((byte) -84, 10)) {
              ha.field_f = ha.field_f - iw.field_b;
              if (gj.a((byte) -84, 10) >= 5) {
                kn.field_b = kn.field_b + te.field_c;
                return;
              } else {
                ts.field_a = ts.field_a + te.field_c;
                return;
              }
            } else {
              fb.field_a = fb.field_a - iw.field_b;
              if (gj.a((byte) -84, 10) >= 5) {
                kn.field_b = kn.field_b + te.field_c;
                return;
              } else {
                ts.field_a = ts.field_a + te.field_c;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0, ar param1, int param2, int param3) {
        int var6 = 0;
        var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == -1) {
          hn.a((byte) 113, "terms.ws");
          if (param3 != -20036) {
            ((th) this).field_G = null;
            return;
          } else {
            return;
          }
        } else {
          if (1 == param0) {
            hn.a((byte) 80, "privacy.ws");
            if (param3 == -20036) {
              return;
            } else {
              ((th) this).field_G = null;
              return;
            }
          } else {
            if (-3 != param0) {
              if (param3 != -20036) {
                ((th) this).field_G = null;
                return;
              } else {
                return;
              }
            } else {
              hn.a((byte) 98, "conduct.ws");
              if (param3 == -20036) {
                return;
              } else {
                ((th) this).field_G = null;
                return;
              }
            }
          }
        }
    }

    private final String g(int param0) {
        if (param0 <= 2) {
            Object var3 = null;
            ((th) this).a(-104, (ar) null, -45, 28);
            return "</col></u>";
        }
        return "</col></u>";
    }

    final static void e(boolean param0) {
        ha.field_d = fd.field_i + " <b>" + km.field_m + "</b> " + ws.field_a + " <b>" + up.field_b + "</b> " + oh.field_b + "<br>" + "<br>" + c.field_q;
        if (!param0) {
            th.e(false);
        }
    }

    private final String a(byte param0) {
        int var2 = 75 / ((-65 - param0) / 44);
        return "<u=2164A2><col=2164A2>";
    }

    public final void a(int param0, int param1, wp param2, int param3, int param4) {
        if (param2 != ((th) this).field_D) {
          if (param1 != 710) {
            th.f(true);
            return;
          } else {
            return;
          }
        } else {
          kh.a(false);
          ((th) this).field_G.n(-7);
          if (param1 == 710) {
            return;
          } else {
            th.f(true);
            return;
          }
        }
    }

    public static void f(boolean param0) {
        if (param0) {
            th.b(82, -23, -57);
            field_C = null;
            field_B = null;
            return;
        }
        field_C = null;
        field_B = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = 0;
    }
}
