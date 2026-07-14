/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    String field_k;
    private String field_a;
    private int field_f;
    private int[] field_i;
    int field_g;
    static int field_d;
    static gh field_b;
    static volatile boolean field_e;
    static String field_l;
    private long field_h;
    dn field_j;
    gh field_c;

    final static String a(int param0, byte param1, String param2) {
        int var4 = 0;
        kj var6 = null;
        kj var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param2;
        if (fa.a(true, var8)) {
          if (wl.a(86, param2)) {
            return o.field_f;
          } else {
            if (qc.field_P != 2) {
              return nc.field_p;
            } else {
              if (param1 == 55) {
                if (o.a(-42, param2)) {
                  return db.a(sn.field_s, param1 + -78, new String[1]);
                } else {
                  if (cc.field_gc < 100) {
                    if (pf.a(param2, -112)) {
                      return db.a(mg.field_ic, -12, new String[1]);
                    } else {
                      var7 = mm.field_g;
                      var7.a(param0, (byte) -117);
                      var7.field_p = var7.field_p + 1;
                      var4 = var7.field_p;
                      var7.a((byte) 111, 2);
                      var7.a(param2, -93);
                      var7.b((byte) -28, var7.field_p + -var4);
                      return null;
                    }
                  } else {
                    return jc.field_g;
                  }
                }
              } else {
                field_l = null;
                if (o.a(-42, param2)) {
                  return db.a(sn.field_s, param1 + -78, new String[1]);
                } else {
                  if (cc.field_gc < 100) {
                    if (pf.a(param2, -112)) {
                      return db.a(mg.field_ic, -12, new String[1]);
                    } else {
                      var6 = mm.field_g;
                      var6.a(param0, (byte) -117);
                      var6.field_p = var6.field_p + 1;
                      var4 = var6.field_p;
                      var6.a((byte) 111, 2);
                      var6.a(param2, -93);
                      var6.b((byte) -28, var6.field_p + -var4);
                      return null;
                    }
                  } else {
                    return jc.field_g;
                  }
                }
              }
            }
          }
        } else {
          return en.field_a;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        if (param0 != 0) {
            Object var2 = null;
            ld discarded$0 = dd.a((cm) null, (cm) null, false, (String) null, (String) null);
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (17 == param0) {
          n.field_x = new td(((dd) this).field_c.field_Rb, ((dd) this).field_c.field_cb, ((dd) this).field_c.field_zb, ((dd) this).field_c.field_Lb, param2, an.field_a, od.field_g, hg.field_e, bd.field_f, ol.field_Tb, qb.field_K, ((dd) this).field_k, ((dd) this).field_h);
          return true;
        } else {
          if (param1 <= 115) {
            return true;
          } else {
            return false;
          }
        }
    }

    final void c(int param0) {
        String var2 = null;
        String var3 = null;
        if (param0 > -1) {
          L0: {
            field_l = null;
            if (((dd) this).field_k == null) {
              break L0;
            } else {
              if (((dd) this).field_h == nb.field_G) {
                break L0;
              } else {
                var3 = this.b(2);
                var2 = var3;
                ((dd) this).field_j.a(2, 17, db.a(gd.field_ob, -40, new String[1]));
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (((dd) this).field_k == null) {
              break L1;
            } else {
              if (((dd) this).field_h == nb.field_G) {
                break L1;
              } else {
                var3 = this.b(2);
                var2 = var3;
                ((dd) this).field_j.a(2, 17, db.a(gd.field_ob, -40, new String[1]));
                break L1;
              }
            }
          }
          return;
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (0 != param1) {
          if (param1 != -2) {
            if (-3 != param1) {
              if (3 != param1) {
                if (param1 != 10) {
                  if (-16 != (param1 ^ -1)) {
                    if (param1 == 16) {
                      nl.a(0, param0, 5);
                      var4 = -14 / ((35 - param2) / 45);
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    nl.a(((dd) this).field_g, param0, 5);
                    var4 = -14 / ((35 - param2) / 45);
                    return true;
                  }
                } else {
                  ei.a(((dd) this).field_g, (byte) -23, param0);
                  var4 = -14 / ((35 - param2) / 45);
                  return true;
                }
              } else {
                na.a((byte) -40, param0, ((dd) this).field_g);
                var4 = -14 / ((35 - param2) / 45);
                return true;
              }
            } else {
              jg.a(((dd) this).field_g, (byte) 112, param0);
              var4 = -14 / ((35 - param2) / 45);
              return true;
            }
          } else {
            ec.a(param0, false, ((dd) this).field_h);
            var4 = -14 / ((35 - param2) / 45);
            return true;
          }
        } else {
          ik.a(((dd) this).field_h, param0, false);
          var4 = -14 / ((35 - param2) / 45);
          return true;
        }
    }

    final boolean b(byte param0) {
        if (param0 > 66) {
          if (null != ((dd) this).field_j) {
            if (!((dd) this).field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((dd) this).field_g = -63;
          if (null != ((dd) this).field_j) {
            if (!((dd) this).field_j.j(-108)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, na param1) {
        if (!param1.field_g) {
          L0: {
            ((dd) this).field_f = param1.field_k;
            if (0 != param1.field_k) {
              break L0;
            } else {
              L1: {
                if (0 == sg.field_c) {
                  ((dd) this).field_j.a(param0 + 2, 12, jh.field_f);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((dd) this).field_j.a(param0 ^ 2, 13, lk.field_V);
              break L0;
            }
          }
          if ((param1.field_k ^ -1) != -2) {
            if ((param1.field_k ^ -1) != -3) {
              if (param0 != 0) {
                field_d = -60;
                return;
              } else {
                return;
              }
            } else {
              if (fi.field_y != 0) {
                ((dd) this).field_j.a(2, 13, he.field_f);
                if (param0 != 0) {
                  field_d = -60;
                  return;
                } else {
                  return;
                }
              } else {
                ((dd) this).field_j.a(2, 12, fj.field_c);
                ((dd) this).field_j.a(2, 13, he.field_f);
                if (param0 != 0) {
                  field_d = -60;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (0 != pm.field_Z) {
              ((dd) this).field_j.a(2, 13, og.field_a);
              if ((param1.field_k ^ -1) == -3) {
                L2: {
                  if (fi.field_y != 0) {
                    ((dd) this).field_j.a(2, 13, he.field_f);
                    break L2;
                  } else {
                    ((dd) this).field_j.a(2, 12, fj.field_c);
                    ((dd) this).field_j.a(2, 13, he.field_f);
                    break L2;
                  }
                }
                if (param0 == 0) {
                  return;
                } else {
                  field_d = -60;
                  return;
                }
              } else {
                if (param0 == 0) {
                  return;
                } else {
                  field_d = -60;
                  return;
                }
              }
            } else {
              ((dd) this).field_j.a(2, 12, ne.field_H);
              ((dd) this).field_j.a(2, 13, og.field_a);
              if ((param1.field_k ^ -1) != -3) {
                if (param0 != 0) {
                  field_d = -60;
                  return;
                } else {
                  return;
                }
              } else {
                if (fi.field_y != 0) {
                  L3: {
                    ((dd) this).field_j.a(2, 13, he.field_f);
                    if (param0 == 0) {
                      break L3;
                    } else {
                      field_d = -60;
                      break L3;
                    }
                  }
                  return;
                } else {
                  ((dd) this).field_j.a(2, 12, fj.field_c);
                  L4: {
                    ((dd) this).field_j.a(2, 13, he.field_f);
                    if (param0 == 0) {
                      break L4;
                    } else {
                      field_d = -60;
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != 2) {
          L0: {
            ((dd) this).field_i = null;
            if (((dd) this).field_a != null) {
              var2 = ((dd) this).field_a;
              break L0;
            } else {
              var2 = ((dd) this).field_k;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (((dd) this).field_a != null) {
              var2 = ((dd) this).field_a;
              break L1;
            } else {
              var2 = ((dd) this).field_k;
              break L1;
            }
          }
          return var2;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var6 = ((dd) this).field_j.a(param0, true);
        var7 = -12 % ((-56 - param1) / 50);
        if (-2 == var6) {
          return false;
        } else {
          boolean discarded$8 = this.a(param4, var6, (byte) 109);
          boolean discarded$9 = this.b(var6, -7, param3);
          boolean discarded$10 = this.a(false, param3, var6);
          boolean discarded$11 = this.a(var6, 120, param2);
          return true;
        }
    }

    final void b(boolean param0, byte param1) {
        ((dd) this).field_j.a(param0, (byte) 126);
        int var3 = -36 % ((param1 - 65) / 48);
    }

    final void a(int[] param0, int param1, int param2) {
        String var4 = null;
        ah var5 = null;
        int var6 = 0;
        String var7 = null;
        if (null != ((dd) this).field_k) {
          if ((nb.field_G ^ -1L) == (((dd) this).field_h ^ -1L)) {
            if (2 == param2) {
              L0: {
                if (qc.field_P == 2) {
                  L1: {
                    var7 = this.b(param1 + 4);
                    var4 = var7;
                    var5 = wi.a(((dd) this).field_k, (byte) 114);
                    var6 = o.a(-128, ((dd) this).field_k) ? 1 : 0;
                    if (var5 != null) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        ((dd) this).field_j.a(param1 ^ -4, 4, db.a(ti.field_r, param1 + -121, new String[1]));
                        ((dd) this).field_j.a(2, 6, db.a(g.field_g, param1 + -30, new String[1]));
                        if (param0 == null) {
                          break L1;
                        } else {
                          if ((param2 ^ -1) == -3) {
                            break L1;
                          } else {
                            if (!fj.field_e) {
                              ((dd) this).field_i = param0;
                              ((dd) this).field_j.a(2, 19, db.a(lj.field_f, -75, new String[1]));
                              break L1;
                            } else {
                              L2: {
                                if (var5 == null) {
                                  break L2;
                                } else {
                                  L3: {
                                    if (ob.a((byte) -38, ((dd) this).field_k)) {
                                      break L3;
                                    } else {
                                      if (!fj.field_e) {
                                        L4: {
                                          if (!uc.field_g) {
                                            ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                        ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                                        if (param0 != null) {
                                          ((dd) this).field_i = param0;
                                          ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                                  break L2;
                                }
                              }
                              L5: {
                                if (var6 == 0) {
                                  break L5;
                                } else {
                                  ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                                  break L5;
                                }
                              }
                              if (param1 != -2) {
                                int discarded$16 = dd.a(45, 110);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (var5 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (ob.a((byte) -38, ((dd) this).field_k)) {
                                break L7;
                              } else {
                                if (!fj.field_e) {
                                  L8: {
                                    if (!uc.field_g) {
                                      ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                                  if (param0 != null) {
                                    ((dd) this).field_i = param0;
                                    ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  break L7;
                                }
                              }
                            }
                            ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                            break L6;
                          }
                        }
                        L9: {
                          if (var6 == 0) {
                            break L9;
                          } else {
                            ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                            break L9;
                          }
                        }
                        L10: {
                          if (param1 == -2) {
                            break L10;
                          } else {
                            int discarded$17 = dd.a(45, 110);
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L11: {
                    if (var5 == null) {
                      break L11;
                    } else {
                      L12: {
                        if (ob.a((byte) -38, ((dd) this).field_k)) {
                          break L12;
                        } else {
                          if (!fj.field_e) {
                            L13: {
                              if (!uc.field_g) {
                                ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                            if (param0 != null) {
                              ((dd) this).field_i = param0;
                              ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                              break L12;
                            } else {
                              ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                              if (var6 == 0) {
                                if (param1 != -2) {
                                  int discarded$18 = dd.a(45, 110);
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L14: {
                                  ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                                  if (param1 == -2) {
                                    break L14;
                                  } else {
                                    int discarded$19 = dd.a(45, 110);
                                    break L14;
                                  }
                                }
                                return;
                              }
                            }
                          } else {
                            ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                            if (var6 == 0) {
                              if (param1 != -2) {
                                int discarded$20 = dd.a(45, 110);
                                return;
                              } else {
                                return;
                              }
                            } else {
                              L15: {
                                ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                                if (param1 == -2) {
                                  break L15;
                                } else {
                                  int discarded$21 = dd.a(45, 110);
                                  break L15;
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                      break L11;
                    }
                  }
                  if (var6 == 0) {
                    break L0;
                  } else {
                    ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                    if (param1 != -2) {
                      int discarded$22 = dd.a(45, 110);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param1 != -2) {
                int discarded$23 = dd.a(45, 110);
                return;
              } else {
                return;
              }
            } else {
              if (param1 != -2) {
                int discarded$24 = dd.a(45, 110);
                return;
              } else {
                return;
              }
            }
          } else {
            L16: {
              if (qc.field_P == 2) {
                L17: {
                  var7 = this.b(param1 + 4);
                  var4 = var7;
                  var5 = wi.a(((dd) this).field_k, (byte) 114);
                  var6 = o.a(-128, ((dd) this).field_k) ? 1 : 0;
                  if (var5 != null) {
                    break L17;
                  } else {
                    if (var6 == 0) {
                      var7 = var4;
                      ((dd) this).field_j.a(param1 ^ -4, 4, db.a(ti.field_r, param1 + -121, new String[1]));
                      ((dd) this).field_j.a(2, 6, db.a(g.field_g, param1 + -30, new String[1]));
                      if (param0 == null) {
                        break L17;
                      } else {
                        if ((param2 ^ -1) == -3) {
                          break L17;
                        } else {
                          if (!fj.field_e) {
                            ((dd) this).field_i = param0;
                            ((dd) this).field_j.a(2, 19, db.a(lj.field_f, -75, new String[1]));
                            break L17;
                          } else {
                            L18: {
                              if (var5 == null) {
                                break L18;
                              } else {
                                L19: {
                                  if (ob.a((byte) -38, ((dd) this).field_k)) {
                                    break L19;
                                  } else {
                                    if (!fj.field_e) {
                                      L20: {
                                        if (!uc.field_g) {
                                          ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                                      if (param0 != null) {
                                        ((dd) this).field_i = param0;
                                        ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                                ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                                break L18;
                              }
                            }
                            L21: {
                              if (var6 == 0) {
                                break L21;
                              } else {
                                ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                                break L21;
                              }
                            }
                            L22: {
                              if (param1 == -2) {
                                break L22;
                              } else {
                                int discarded$25 = dd.a(45, 110);
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (var5 == null) {
                          break L23;
                        } else {
                          L24: {
                            if (ob.a((byte) -38, ((dd) this).field_k)) {
                              break L24;
                            } else {
                              if (!fj.field_e) {
                                L25: {
                                  if (!uc.field_g) {
                                    var7 = var4;
                                    ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                                    break L25;
                                  } else {
                                    break L25;
                                  }
                                }
                                var7 = var4;
                                ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                                if (param0 != null) {
                                  ((dd) this).field_i = param0;
                                  ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                                  break L24;
                                } else {
                                  break L24;
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                          var7 = var4;
                          ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                          break L23;
                        }
                      }
                      var7 = var4;
                      ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                      L26: {
                        if (param1 == -2) {
                          break L26;
                        } else {
                          int discarded$26 = dd.a(45, 110);
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
                L27: {
                  var7 = var4;
                  if (var5 == null) {
                    break L27;
                  } else {
                    L28: {
                      if (ob.a((byte) -38, ((dd) this).field_k)) {
                        break L28;
                      } else {
                        if (!fj.field_e) {
                          L29: {
                            if (!uc.field_g) {
                              ((dd) this).field_j.a(2, 8, db.a(rj.field_c, -108, new String[1]));
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                          ((dd) this).field_j.a(param1 + 4, 18, db.a(dg.field_b, param1 ^ 61, new String[1]));
                          if (param0 != null) {
                            ((dd) this).field_i = param0;
                            ((dd) this).field_j.a(param1 ^ -4, 19, db.a(lj.field_f, param1 + -77, new String[1]));
                            break L28;
                          } else {
                            L30: {
                              ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                              if (var6 == 0) {
                                break L30;
                              } else {
                                ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                                break L30;
                              }
                            }
                            L31: {
                              if (param1 == -2) {
                                break L31;
                              } else {
                                int discarded$27 = dd.a(45, 110);
                                break L31;
                              }
                            }
                            return;
                          }
                        } else {
                          L32: {
                            ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                            if (var6 == 0) {
                              break L32;
                            } else {
                              ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                              break L32;
                            }
                          }
                          L33: {
                            if (param1 == -2) {
                              break L33;
                            } else {
                              int discarded$28 = dd.a(45, 110);
                              break L33;
                            }
                          }
                          return;
                        }
                      }
                    }
                    ((dd) this).field_j.a(2, 5, db.a(ei.field_r, -76, new String[1]));
                    break L27;
                  }
                }
                if (var6 == 0) {
                  break L16;
                } else {
                  L34: {
                    ((dd) this).field_j.a(2, 7, db.a(fk.field_n, -52, new String[1]));
                    if (param1 == -2) {
                      break L34;
                    } else {
                      int discarded$29 = dd.a(45, 110);
                      break L34;
                    }
                  }
                  return;
                }
              } else {
                break L16;
              }
            }
            if (param1 != -2) {
              int discarded$30 = dd.a(45, 110);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 != -2) {
            int discarded$31 = dd.a(45, 110);
            return;
          } else {
            return;
          }
        }
    }

    final void a(boolean param0, byte param1) {
        cc var4 = null;
        String var5 = null;
        int var6 = 0;
        cc var7 = null;
        var6 = SteelSentinels.field_G;
        if (null != ((dd) this).field_k) {
          if (nb.field_G != ((dd) this).field_h) {
            if (null != nf.field_b) {
              L0: {
                if (kk.a(-28548)) {
                  var7 = ri.a(((dd) this).field_h, false);
                  var4 = kh.a(false, ((dd) this).field_h);
                  var5 = this.b(2);
                  if (var4 == null) {
                    if (var7 == null) {
                      break L0;
                    } else {
                      if (!nf.field_b.field_dc) {
                        break L0;
                      } else {
                        if (nf.field_b.field_wc < nf.field_b.field_Ub) {
                          if (var7.field_Zb) {
                            ((dd) this).field_j.a(2, 1, db.a(va.field_a, -118, new String[1]));
                            if (param1 < -73) {
                              return;
                            } else {
                              String discarded$11 = this.b(96);
                              return;
                            }
                          } else {
                            L1: {
                              if (!param0) {
                                break L1;
                              } else {
                                if (!var7.field_kc) {
                                  break L1;
                                } else {
                                  ((dd) this).field_j.a(2, 0, db.a(nk.field_P, -104, new String[1]));
                                  ((dd) this).field_j.a(2, 1, db.a(bh.field_o, -54, new String[1]));
                                  if (param1 >= -73) {
                                    String discarded$12 = this.b(96);
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              }
                            }
                            ((dd) this).field_j.a(2, 0, db.a(t.field_j, -18, new String[1]));
                            if (param1 < -73) {
                              return;
                            } else {
                              String discarded$13 = this.b(96);
                              return;
                            }
                          }
                        } else {
                          if (param1 >= -73) {
                            String discarded$14 = this.b(96);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (!nf.field_b.field_rc) {
                      ((dd) this).field_j.a(2, 1, db.a(bg.field_E, -88, new String[1]));
                      if (param1 >= -73) {
                        String discarded$15 = this.b(96);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if ((nf.field_b.field_Mc ^ -1) > -1) {
                        if (param1 >= -73) {
                          String discarded$16 = this.b(96);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L2: {
                          ((dd) this).field_j.a(2, 1, db.a(bg.field_E, -88, new String[1]));
                          if (param1 < -73) {
                            break L2;
                          } else {
                            String discarded$17 = this.b(96);
                            break L2;
                          }
                        }
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param1 < -73) {
                return;
              } else {
                String discarded$18 = this.b(96);
                return;
              }
            } else {
              if (param1 >= -73) {
                String discarded$19 = this.b(96);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 >= -73) {
              String discarded$20 = this.b(96);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 >= -73) {
            String discarded$21 = this.b(96);
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        hk var5 = null;
        var4 = SteelSentinels.field_G;
        if (null == nf.field_b) {
          var5 = en.a(((dd) this).field_g, 28858);
          if (var5 != null) {
            var3 = var5.field_Xb;
            if (var5.field_vc) {
              ((dd) this).field_j.a(2, 2, db.a(ah.field_Xb, -31, new String[1]));
              ((dd) this).field_j.a(param0 ^ 66, 3, db.a(vi.field_Z, -38, new String[1]));
              if (param0 == 64) {
                return;
              } else {
                ((dd) this).field_a = null;
                return;
              }
            } else {
              if (var5.field_cc) {
                ((dd) this).field_j.a(param0 ^ 66, 2, db.a(cl.field_a, -126, new String[1]));
                if (!var5.field_bc) {
                  if (param0 == 64) {
                    return;
                  } else {
                    ((dd) this).field_a = null;
                    return;
                  }
                } else {
                  ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                  if (param0 == 64) {
                    return;
                  } else {
                    ((dd) this).field_a = null;
                    return;
                  }
                }
              } else {
                if (!var5.field_bc) {
                  if (var5.field_dc) {
                    if (!var5.field_rc) {
                      ((dd) this).field_j.a(2, 2, db.a(cd.field_f, -70, new String[1]));
                      if (!var5.field_bc) {
                        if (param0 == 64) {
                          return;
                        } else {
                          ((dd) this).field_a = null;
                          return;
                        }
                      } else {
                        ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                        if (param0 != 64) {
                          ((dd) this).field_a = null;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (!var5.field_cc) {
                        if (!var5.field_bc) {
                          if (param0 == 64) {
                            return;
                          } else {
                            ((dd) this).field_a = null;
                            return;
                          }
                        } else {
                          ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                          if (param0 == 64) {
                            return;
                          } else {
                            ((dd) this).field_a = null;
                            return;
                          }
                        }
                      } else {
                        ((dd) this).field_j.a(2, 2, db.a(cd.field_f, -70, new String[1]));
                        if (!var5.field_bc) {
                          if (param0 != 64) {
                            ((dd) this).field_a = null;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L0: {
                            ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                            if (param0 == 64) {
                              break L0;
                            } else {
                              ((dd) this).field_a = null;
                              break L0;
                            }
                          }
                          return;
                        }
                      }
                    }
                  } else {
                    if (!var5.field_bc) {
                      if (param0 != 64) {
                        ((dd) this).field_a = null;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                      if (param0 != 64) {
                        ((dd) this).field_a = null;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!var5.field_bc) {
                    if (param0 != 64) {
                      ((dd) this).field_a = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((dd) this).field_j.a(2, 3, db.a(km.field_d, param0 + -109, new String[1]));
                    if (param0 != 64) {
                      ((dd) this).field_a = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (param0 != 64) {
              ((dd) this).field_a = null;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 64) {
            ((dd) this).field_a = null;
            return;
          } else {
            return;
          }
        }
    }

    final static int a(int param0, int param1) {
        Object var3 = null;
        if (param0 != 20612) {
          var3 = null;
          String discarded$2 = dd.a(120, (byte) -58, (String) null);
          return lf.field_e[2047 & param1];
        } else {
          return lf.field_e[2047 & param1];
        }
    }

    final static ld a(cm param0, cm param1, boolean param2, String param3, String param4) {
        if (!param2) {
            dd.a(18);
        }
        int var5 = param0.a(param3, 46);
        int var6 = param0.a(var5, -32759, param4);
        return in.a(param1, 112, var6, param0, var5);
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        if (param0) {
          dd.a(-11);
          if ((param2 ^ -1) != -9) {
            if (param2 != 18) {
              if (param2 != 11) {
                if (param2 != -13) {
                  if (-14 != param2) {
                    if (param2 != -15) {
                      if (-21 != param2) {
                        if ((param2 ^ -1) == -20) {
                          boolean discarded$2 = dl.a(((dd) this).field_h, ((dd) this).field_i, -116, ((dd) this).field_f, ((dd) this).field_k);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        pd.j(13171);
                        return true;
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, ((dd) this).field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, ((dd) this).field_f, param1, -18853);
                  return true;
                }
              } else {
                il.a(0, ((dd) this).field_f, param1, -18853);
                return true;
              }
            } else {
              ic.a(-23543, ((dd) this).field_h, ((dd) this).field_k);
              return true;
            }
          } else {
            bc.a(((dd) this).field_h, ((dd) this).field_k, 2);
            return true;
          }
        } else {
          if ((param2 ^ -1) != -9) {
            if (param2 != 18) {
              if (param2 != 11) {
                if (param2 != -13) {
                  if (-14 != param2) {
                    if (param2 != -15) {
                      if (-21 != param2) {
                        if ((param2 ^ -1) == -20) {
                          boolean discarded$3 = dl.a(((dd) this).field_h, ((dd) this).field_i, -116, ((dd) this).field_f, ((dd) this).field_k);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        pd.j(13171);
                        return true;
                      }
                    } else {
                      lk.g(0);
                      return true;
                    }
                  } else {
                    il.a(2, ((dd) this).field_f, param1, -18853);
                    return true;
                  }
                } else {
                  il.a(1, ((dd) this).field_f, param1, -18853);
                  return true;
                }
              } else {
                il.a(0, ((dd) this).field_f, param1, -18853);
                return true;
              }
            } else {
              ic.a(-23543, ((dd) this).field_h, ((dd) this).field_k);
              return true;
            }
          } else {
            bc.a(((dd) this).field_h, ((dd) this).field_k, 2);
            return true;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        Object var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        if (param1 == -7) {
          var4 = null;
          if (4 == param0) {
            var8 = lj.a(((dd) this).field_k, (byte) -79, param2);
            if (var8 != null) {
              sj.a((String) null, var8, 0, (byte) 21, ((dd) this).field_k, 2);
              return true;
            } else {
              return true;
            }
          } else {
            if (param0 != 5) {
              if (param0 == -7) {
                var7 = dd.a(param2, (byte) 55, ((dd) this).field_k);
                if (var7 != null) {
                  sj.a((String) null, var7, 0, (byte) 21, ((dd) this).field_k, 2);
                  return true;
                } else {
                  return true;
                }
              } else {
                if (-8 == param0) {
                  var6 = rn.a(((dd) this).field_a, param2, ((dd) this).field_k, true);
                  if (var6 == null) {
                    return true;
                  } else {
                    sj.a((String) null, var6, 0, (byte) 21, ((dd) this).field_k, 2);
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              var5 = nl.a(((dd) this).field_k, param2, true);
              if (var5 == null) {
                return true;
              } else {
                sj.a((String) null, var5, 0, (byte) 21, ((dd) this).field_k, 2);
                return true;
              }
            }
          }
        } else {
          return false;
        }
    }

    dd(gh param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((dd) this).field_j = new dn(jn.field_h);
        ((dd) this).field_k = param2;
        ((dd) this).field_i = param6;
        ((dd) this).field_g = param4;
        ((dd) this).field_h = param1;
        ((dd) this).field_f = param5;
        ((dd) this).field_a = param3;
        ((dd) this).field_c = param0;
        param0.field_G = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = true;
        field_l = "(Including <%0>)";
    }
}
