/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_c;
    static String field_n;
    static String field_g;
    private long field_l;
    ak field_o;
    pi field_b;
    String field_h;
    private String field_i;
    int field_m;
    static vj field_d;
    static bb field_a;
    static String field_e;
    private int field_k;
    private int[] field_j;
    static int[] field_f;

    public static void c(byte param0) {
        if (param0 <= 52) {
          return;
        } else {
          field_e = null;
          field_f = null;
          field_n = null;
          field_a = null;
          field_c = null;
          field_g = null;
          field_d = null;
          return;
        }
    }

    private final String a(byte param0) {
        String var2 = null;
        if (((wi) this).field_i != null) {
            var2 = ((wi) this).field_i;
        } else {
            var2 = ((wi) this).field_h;
        }
        if (param0 <= 7) {
            return null;
        }
        return var2;
    }

    final void a(int param0, int[] param1, int param2) {
        String var4 = null;
        im var5 = null;
        int var6 = 0;
        String var7 = null;
        if (param2 == -3) {
          if (((wi) this).field_h != null) {
            if (hn.field_f == ((wi) this).field_l) {
              if (2 == param0) {
                if (2 == gk.field_db) {
                  L0: {
                    var7 = this.a((byte) 114);
                    var4 = var7;
                    var5 = re.a(((wi) this).field_h, -1);
                    var6 = i.a(-640, ((wi) this).field_h) ? 1 : 0;
                    if (var5 != null) {
                      break L0;
                    } else {
                      if (var6 != 0) {
                        break L0;
                      } else {
                        ((wi) this).field_b.a(sd.a(ji.field_d, 52, new String[1]), (byte) -106, 4);
                        ((wi) this).field_b.a(sd.a(ff.field_e, 18, new String[1]), (byte) -53, 6);
                        if (param1 == null) {
                          break L0;
                        } else {
                          if ((param0 ^ -1) == -3) {
                            break L0;
                          } else {
                            if (!ln.field_q) {
                              ((wi) this).field_j = param1;
                              ((wi) this).field_b.a(sd.a(nl.field_d, 61, new String[1]), (byte) -80, 19);
                              break L0;
                            } else {
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (var5 == null) {
                    if (var6 == 0) {
                      return;
                    } else {
                      ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                      return;
                    }
                  } else {
                    if (ul.a(57, ((wi) this).field_h)) {
                      ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                      if (var6 != 0) {
                        ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (ln.field_q) {
                        ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                        if (var6 != 0) {
                          ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (lh.field_g) {
                          ((wi) this).field_b.a(sd.a(ho.field_f, 83, new String[1]), (byte) -33, 18);
                          if (param1 == null) {
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            if (var6 != 0) {
                              ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((wi) this).field_j = param1;
                            ((wi) this).field_b.a(sd.a(nl.field_d, 22, new String[1]), (byte) -95, 19);
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            if (var6 == 0) {
                              return;
                            } else {
                              ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                              return;
                            }
                          }
                        } else {
                          ((wi) this).field_b.a(sd.a(nf.field_e, 105, new String[1]), (byte) -119, 8);
                          ((wi) this).field_b.a(sd.a(ho.field_f, 83, new String[1]), (byte) -33, 18);
                          if (param1 == null) {
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            if (var6 != 0) {
                              ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((wi) this).field_j = param1;
                            ((wi) this).field_b.a(sd.a(nl.field_d, 22, new String[1]), (byte) -95, 19);
                            L1: {
                              ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                              if (var6 == 0) {
                                break L1;
                              } else {
                                ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                                break L1;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (2 == gk.field_db) {
                L2: {
                  var7 = this.a((byte) 114);
                  var4 = var7;
                  var5 = re.a(((wi) this).field_h, -1);
                  var6 = i.a(-640, ((wi) this).field_h) ? 1 : 0;
                  if (var5 != null) {
                    break L2;
                  } else {
                    if (var6 != 0) {
                      break L2;
                    } else {
                      ((wi) this).field_b.a(sd.a(ji.field_d, 52, new String[1]), (byte) -106, 4);
                      ((wi) this).field_b.a(sd.a(ff.field_e, 18, new String[1]), (byte) -53, 6);
                      if (param1 == null) {
                        break L2;
                      } else {
                        if ((param0 ^ -1) == -3) {
                          break L2;
                        } else {
                          if (!ln.field_q) {
                            ((wi) this).field_j = param1;
                            ((wi) this).field_b.a(sd.a(nl.field_d, 61, new String[1]), (byte) -80, 19);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
                if (var5 == null) {
                  if (var6 != 0) {
                    ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!ul.a(57, ((wi) this).field_h)) {
                    if (!ln.field_q) {
                      if (lh.field_g) {
                        ((wi) this).field_b.a(sd.a(ho.field_f, 83, new String[1]), (byte) -33, 18);
                        if (param1 != null) {
                          ((wi) this).field_j = param1;
                          ((wi) this).field_b.a(sd.a(nl.field_d, 22, new String[1]), (byte) -95, 19);
                          L3: {
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            if (var6 == 0) {
                              break L3;
                            } else {
                              ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                              break L3;
                            }
                          }
                          return;
                        } else {
                          L4: {
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            if (var6 == 0) {
                              break L4;
                            } else {
                              ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                              break L4;
                            }
                          }
                          return;
                        }
                      } else {
                        L5: {
                          ((wi) this).field_b.a(sd.a(nf.field_e, 105, new String[1]), (byte) -119, 8);
                          ((wi) this).field_b.a(sd.a(ho.field_f, 83, new String[1]), (byte) -33, 18);
                          if (param1 == null) {
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            break L5;
                          } else {
                            ((wi) this).field_j = param1;
                            ((wi) this).field_b.a(sd.a(nl.field_d, 22, new String[1]), (byte) -95, 19);
                            ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                            break L5;
                          }
                        }
                        L6: {
                          if (var6 == 0) {
                            break L6;
                          } else {
                            ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                        if (var6 == 0) {
                          break L7;
                        } else {
                          ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      ((wi) this).field_b.a(sd.a(ni.field_p, 18, new String[1]), (byte) -33, 5);
                      if (var6 == 0) {
                        break L8;
                      } else {
                        ((wi) this).field_b.a(sd.a(hk.field_a, param2 + 72, new String[1]), (byte) -77, 7);
                        break L8;
                      }
                    }
                    return;
                  }
                }
              } else {
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

    final static void b(byte param0) {
        if (!hf.b((byte) 100)) {
            return;
        }
        bq.a(false, (byte) -110, 4);
        if (param0 != -53) {
            field_d = null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 == 0) {
          bg.a(((wi) this).field_l, param1, param2 ^ -31541);
          if (param2 == 7490) {
            return true;
          } else {
            boolean discarded$7 = this.a(67, true, 49);
            return true;
          }
        } else {
          if (-2 == (param0 ^ -1)) {
            pe.a(7, param1, ((wi) this).field_l);
            if (param2 == 7490) {
              return true;
            } else {
              boolean discarded$8 = this.a(67, true, 49);
              return true;
            }
          } else {
            if (-3 == (param0 ^ -1)) {
              wi.b(param1, param2 ^ -7903, ((wi) this).field_m);
              if (param2 == 7490) {
                return true;
              } else {
                boolean discarded$9 = this.a(67, true, 49);
                return true;
              }
            } else {
              if ((param0 ^ -1) == -4) {
                qg.a(((wi) this).field_m, param1, false);
                if (param2 != 7490) {
                  boolean discarded$10 = this.a(67, true, 49);
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((param0 ^ -1) == -11) {
                  qj.a(false, ((wi) this).field_m, param1);
                  if (param2 != 7490) {
                    boolean discarded$11 = this.a(67, true, 49);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) == -16) {
                    df.a(param2 ^ 7489, ((wi) this).field_m, param1);
                    if (param2 == 7490) {
                      return true;
                    } else {
                      boolean discarded$12 = this.a(67, true, 49);
                      return true;
                    }
                  } else {
                    if ((param0 ^ -1) == -17) {
                      df.a(3, 0, param1);
                      if (param2 == 7490) {
                        return true;
                      } else {
                        boolean discarded$13 = this.a(67, true, 49);
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 != 20) {
            field_n = null;
            ((wi) this).field_b.a(param0, 0);
            return;
        }
        ((wi) this).field_b.a(param0, 0);
    }

    final void b(boolean param0, byte param1) {
        uj var4 = null;
        String var5 = null;
        int var6 = 0;
        uj var7 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        if (((wi) this).field_h != null) {
          if (((wi) this).field_l != hn.field_f) {
            if (null != io.field_c) {
              if (pl.m(param1 + 197)) {
                var7 = gp.a(param1 + 100, ((wi) this).field_l);
                var4 = ll.a(((wi) this).field_l, param1 + 14526);
                var5 = this.a((byte) 27);
                if (var4 != null) {
                  if (!io.field_c.field_dc) {
                    ((wi) this).field_b.a(sd.a(vf.field_b, 123, new String[1]), (byte) -112, 1);
                    if (param1 == -98) {
                      return;
                    } else {
                      boolean discarded$14 = this.a(48, 58, -125);
                      return;
                    }
                  } else {
                    if ((io.field_c.field_nc ^ -1) > -1) {
                      if (param1 == -98) {
                        return;
                      } else {
                        boolean discarded$15 = this.a(48, 58, -125);
                        return;
                      }
                    } else {
                      ((wi) this).field_b.a(sd.a(vf.field_b, 123, new String[1]), (byte) -112, 1);
                      if (param1 == -98) {
                        return;
                      } else {
                        boolean discarded$16 = this.a(48, 58, -125);
                        return;
                      }
                    }
                  }
                } else {
                  if (var7 != null) {
                    if (io.field_c.field_Mb) {
                      if (io.field_c.field_mc < io.field_c.field_ec) {
                        if (var7.field_Vb) {
                          ((wi) this).field_b.a(sd.a(fm.field_j, param1 + 180, new String[1]), (byte) -111, 1);
                          if (param1 == -98) {
                            return;
                          } else {
                            boolean discarded$17 = this.a(48, 58, -125);
                            return;
                          }
                        } else {
                          if (!param0) {
                            ((wi) this).field_b.a(sd.a(i.field_m, 67, new String[1]), (byte) -83, 0);
                            if (param1 == -98) {
                              return;
                            } else {
                              boolean discarded$18 = this.a(48, 58, -125);
                              return;
                            }
                          } else {
                            if (var7.field_Jb) {
                              ((wi) this).field_b.a(sd.a(md.field_V, 59, new String[1]), (byte) -70, 0);
                              ((wi) this).field_b.a(sd.a(po.field_f, 101, new String[1]), (byte) -41, 1);
                              if (param1 == -98) {
                                return;
                              } else {
                                boolean discarded$19 = this.a(48, 58, -125);
                                return;
                              }
                            } else {
                              ((wi) this).field_b.a(sd.a(i.field_m, 67, new String[1]), (byte) -83, 0);
                              if (param1 != -98) {
                                boolean discarded$20 = this.a(48, 58, -125);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        if (param1 != -98) {
                          boolean discarded$21 = this.a(48, 58, -125);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (param1 != -98) {
                        boolean discarded$22 = this.a(48, 58, -125);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param1 != -98) {
                      boolean discarded$23 = this.a(48, 58, -125);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param1 != -98) {
                  boolean discarded$24 = this.a(48, 58, -125);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != -98) {
                boolean discarded$25 = this.a(48, 58, -125);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 != -98) {
              boolean discarded$26 = this.a(48, 58, -125);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != -98) {
            boolean discarded$27 = this.a(48, 58, -125);
            return;
          } else {
            return;
          }
        }
    }

    final static void b(int param0, int param1, int param2) {
        pc var3 = null;
        if (param1 != -925) {
          field_e = null;
          var3 = aa.field_f;
          var3.g(param0, 15514);
          var3.e(160, 3);
          var3.e(160, 8);
          var3.b(1276387944, param2);
          return;
        } else {
          var3 = aa.field_f;
          var3.g(param0, 15514);
          var3.e(160, 3);
          var3.e(160, 8);
          var3.b(1276387944, param2);
          return;
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var4 = null;
        if (param2 != 4) {
          if (param2 != 5) {
            if (param2 != 6) {
              if (7 == param2) {
                var8 = aq.a(((wi) this).field_h, param0, ((wi) this).field_i, -20867);
                if (var8 == null) {
                  if (param1 < -123) {
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  ti.a(0, (String) null, ((wi) this).field_h, (byte) -50, 2, var8);
                  if (param1 >= -123) {
                    return true;
                  } else {
                    return true;
                  }
                }
              } else {
                return false;
              }
            } else {
              var7 = mj.a(85, ((wi) this).field_h, param0);
              if (var7 == null) {
                if (param1 >= -123) {
                  return true;
                } else {
                  return true;
                }
              } else {
                ti.a(0, (String) null, ((wi) this).field_h, (byte) -50, 2, var7);
                if (param1 >= -123) {
                  return true;
                } else {
                  return true;
                }
              }
            }
          } else {
            var6 = ff.a(param0, ((wi) this).field_h, (byte) -106);
            if (var6 != null) {
              ti.a(0, (String) null, ((wi) this).field_h, (byte) -50, 2, var6);
              if (param1 >= -123) {
                return true;
              } else {
                return true;
              }
            } else {
              if (param1 >= -123) {
                return true;
              } else {
                return true;
              }
            }
          }
        } else {
          var5 = jf.a(((wi) this).field_h, param0, (byte) 79);
          if (var5 != null) {
            ti.a(0, (String) null, ((wi) this).field_h, (byte) -50, 2, var5);
            if (param1 >= -123) {
              return true;
            } else {
              return true;
            }
          } else {
            if (param1 >= -123) {
              return true;
            } else {
              return true;
            }
          }
        }
    }

    final boolean a(int param0) {
        if (param0 < -94) {
          if (null != ((wi) this).field_b) {
            if (!((wi) this).field_b.j(-52)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final void a(byte param0, aa param1) {
        if (param0 > 66) {
          if (param1.field_a) {
            return;
          } else {
            L0: {
              ((wi) this).field_k = param1.field_j;
              if (-1 != (param1.field_j ^ -1)) {
                break L0;
              } else {
                L1: {
                  if (-1 == (io.field_e ^ -1)) {
                    ((wi) this).field_b.a(gd.field_j, (byte) -31, 12);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((wi) this).field_b.a(uo.field_d, (byte) -127, 13);
                break L0;
              }
            }
            if (1 == param1.field_j) {
              if (0 != gh.field_v) {
                ((wi) this).field_b.a(ec.field_n, (byte) -106, 13);
                if (2 != param1.field_j) {
                  return;
                } else {
                  if (0 != ib.field_e) {
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  } else {
                    ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  }
                }
              } else {
                ((wi) this).field_b.a(m.field_l, (byte) -97, 12);
                ((wi) this).field_b.a(ec.field_n, (byte) -106, 13);
                if (2 != param1.field_j) {
                  return;
                } else {
                  if (0 != ib.field_e) {
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  } else {
                    ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  }
                }
              }
            } else {
              if (2 != param1.field_j) {
                return;
              } else {
                if (0 != ib.field_e) {
                  ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                  return;
                } else {
                  ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                  ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                  return;
                }
              }
            }
          }
        } else {
          ((wi) this).field_l = 31L;
          if (param1.field_a) {
            return;
          } else {
            L2: {
              ((wi) this).field_k = param1.field_j;
              if (-1 != (param1.field_j ^ -1)) {
                break L2;
              } else {
                L3: {
                  if (-1 == (io.field_e ^ -1)) {
                    ((wi) this).field_b.a(gd.field_j, (byte) -31, 12);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                ((wi) this).field_b.a(uo.field_d, (byte) -127, 13);
                break L2;
              }
            }
            if (1 == param1.field_j) {
              if (0 != gh.field_v) {
                ((wi) this).field_b.a(ec.field_n, (byte) -106, 13);
                if (2 != param1.field_j) {
                  return;
                } else {
                  if (0 != ib.field_e) {
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  } else {
                    ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  }
                }
              } else {
                ((wi) this).field_b.a(m.field_l, (byte) -97, 12);
                ((wi) this).field_b.a(ec.field_n, (byte) -106, 13);
                if (2 != param1.field_j) {
                  return;
                } else {
                  if (0 != ib.field_e) {
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  } else {
                    ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                    ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                    return;
                  }
                }
              }
            } else {
              if (2 != param1.field_j) {
                return;
              } else {
                if (0 != ib.field_e) {
                  ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                  return;
                } else {
                  ((wi) this).field_b.a(gf.field_d, (byte) -78, 12);
                  ((wi) this).field_b.a(sf.field_a, (byte) -62, 13);
                  return;
                }
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, boolean param2, int param3, boolean param4) {
        int var6 = ((wi) this).field_b.b(-12487, param4);
        if (param2) {
            return true;
        }
        if (!(-2 != var6)) {
            return false;
        }
        boolean discarded$0 = this.a(var6, param1, 7490);
        boolean discarded$1 = this.a(param0, (byte) -128, var6);
        boolean discarded$2 = this.b(var6, (byte) 10, param0);
        boolean discarded$3 = this.a(var6, param2, param3);
        return true;
    }

    private final boolean b(int param0, byte param1, int param2) {
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        if ((param0 ^ -1) == -9) {
          pm.a((byte) 85, ((wi) this).field_h, ((wi) this).field_l);
          if (param1 != 10) {
            wi.b((byte) -113);
            return true;
          } else {
            return true;
          }
        } else {
          if (param0 == 18) {
            qj.a(((wi) this).field_h, ((wi) this).field_l, (byte) 8);
            if (param1 != 10) {
              wi.b((byte) -113);
              return true;
            } else {
              return true;
            }
          } else {
            if (param0 != 11) {
              if (param0 == 12) {
                am.a(1, -26931, ((wi) this).field_k, param2);
                if (param1 != 10) {
                  wi.b((byte) -113);
                  return true;
                } else {
                  return true;
                }
              } else {
                if ((param0 ^ -1) == -14) {
                  am.a(2, -26931, ((wi) this).field_k, param2);
                  if (param1 == 10) {
                    return true;
                  } else {
                    wi.b((byte) -113);
                    return true;
                  }
                } else {
                  if ((param0 ^ -1) != -15) {
                    if (20 != param0) {
                      if (-20 == (param0 ^ -1)) {
                        boolean discarded$1 = tg.a(((wi) this).field_h, ((wi) this).field_l, ((wi) this).field_k, -2, ((wi) this).field_j);
                        if (param1 == 10) {
                          return true;
                        } else {
                          wi.b((byte) -113);
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      ak.c(true);
                      if (param1 != 10) {
                        wi.b((byte) -113);
                        return true;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    kl.a(7500);
                    if (param1 != 10) {
                      wi.b((byte) -113);
                      return true;
                    } else {
                      return true;
                    }
                  }
                }
              }
            } else {
              am.a(0, -26931, ((wi) this).field_k, param2);
              if (param1 != 10) {
                wi.b((byte) -113);
                return true;
              } else {
                return true;
              }
            }
          }
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        if (param0 == 17) {
          hc.field_M = new oe(((wi) this).field_o.field_tb, ((wi) this).field_o.field_gb, ((wi) this).field_o.field_K, ((wi) this).field_o.field_nb, param2, cm.field_o, pj.field_i, ae.field_f, mg.field_h, um.field_q, dn.field_c, ((wi) this).field_h, ((wi) this).field_l);
          return true;
        } else {
          if (param1) {
            boolean discarded$2 = this.a(-50, false, 11);
            return false;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        eq var3 = null;
        String var4 = null;
        int var5 = 0;
        var5 = Pixelate.field_H ? 1 : 0;
        var2 = -90 % ((42 - param0) / 62);
        if (io.field_c == null) {
          var3 = vm.a(((wi) this).field_m, (byte) -107);
          if (var3 != null) {
            var4 = var3.field_pc;
            if (!var3.field_cc) {
              if (!var3.field_hc) {
                L0: {
                  if (var3.field_Ob) {
                    break L0;
                  } else {
                    if (!var3.field_Mb) {
                      break L0;
                    } else {
                      if (!var3.field_dc) {
                        ((wi) this).field_b.a(sd.a(hd.field_o, 87, new String[1]), (byte) -32, 2);
                        if (var3.field_Ob) {
                          ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (var3.field_hc) {
                          ((wi) this).field_b.a(sd.a(hd.field_o, 87, new String[1]), (byte) -32, 2);
                          if (var3.field_Ob) {
                            ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (var3.field_Ob) {
                            ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
                if (var3.field_Ob) {
                  ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                  return;
                } else {
                  return;
                }
              } else {
                ((wi) this).field_b.a(sd.a(vg.field_f, 53, new String[1]), (byte) -106, 2);
                if (!var3.field_Ob) {
                  return;
                } else {
                  ((wi) this).field_b.a(sd.a(ve.field_Jb, 46, new String[1]), (byte) -96, 3);
                  return;
                }
              }
            } else {
              ((wi) this).field_b.a(sd.a(fp.field_b, 97, new String[1]), (byte) -105, 2);
              ((wi) this).field_b.a(sd.a(oi.field_a, 52, new String[1]), (byte) -118, 3);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    wi(ak param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((wi) this).field_b = new pi(a.field_O);
        param0.field_U = true;
        ((wi) this).field_o = param0;
        ((wi) this).field_k = param5;
        ((wi) this).field_h = param2;
        ((wi) this).field_l = param1;
        ((wi) this).field_j = param6;
        ((wi) this).field_i = param3;
        ((wi) this).field_m = param4;
    }

    final void b(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (null == ((wi) this).field_h) {
            break L0;
          } else {
            if ((((wi) this).field_l ^ -1L) != (hn.field_f ^ -1L)) {
              var3 = this.a((byte) 43);
              var2 = var3;
              ((wi) this).field_b.a(sd.a(sl.field_j, param0 + -8830, new String[1]), (byte) -72, 17);
              break L0;
            } else {
              if (param0 == 8893) {
                return;
              } else {
                boolean discarded$4 = this.a(-105, 67, -5);
                return;
              }
            }
          }
        }
        if (param0 != 8893) {
          boolean discarded$5 = this.a(-105, 67, -5);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggest muting this player";
        field_g = "This is your RuneScape clan if you have one.";
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
        field_e = "<%0> cannot join; the game has started.";
        field_f = new int[4];
    }
}
