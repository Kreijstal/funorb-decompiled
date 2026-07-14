/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    String field_h;
    static String field_j;
    pe field_l;
    private String field_k;
    static String field_a;
    private int[] field_m;
    static int field_g;
    private int field_i;
    private long field_d;
    int field_e;
    kc field_c;
    static int field_b;
    static String field_f;

    private final boolean a(int param0, int param1, int param2) {
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        var4 = null;
        if (param0 != -5) {
          if (-6 != param0) {
            if (param0 != 6) {
              if ((param0 ^ -1) == -8) {
                L0: {
                  var4 = hf.a(((ne) this).field_h, ((ne) this).field_k, param2, 10068666);
                  var5 = 61 / ((11 - param1) / 63);
                  if (var4 != null) {
                    var6 = null;
                    ao.a(0, (byte) 97, var4, ((ne) this).field_h, 2, (String) null);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return true;
              } else {
                return false;
              }
            } else {
              L1: {
                var4 = eh.a((byte) -120, param2, ((ne) this).field_h);
                var5 = 61 / ((11 - param1) / 63);
                if (var4 != null) {
                  var6 = null;
                  ao.a(0, (byte) 97, var4, ((ne) this).field_h, 2, (String) null);
                  break L1;
                } else {
                  break L1;
                }
              }
              return true;
            }
          } else {
            var4 = oe.a(((ne) this).field_h, 29140, param2);
            var5 = 61 / ((11 - param1) / 63);
            if (var4 == null) {
              return true;
            } else {
              var6 = null;
              ao.a(0, (byte) 97, var4, ((ne) this).field_h, 2, (String) null);
              return true;
            }
          }
        } else {
          L2: {
            var4 = bo.a(((ne) this).field_h, (byte) -26, param2);
            var5 = 61 / ((11 - param1) / 63);
            if (var4 != null) {
              var6 = null;
              ao.a(0, (byte) 97, var4, ((ne) this).field_h, 2, (String) null);
              break L2;
            } else {
              break L2;
            }
          }
          return true;
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param4 != 12815) {
            ((ne) this).d(102);
            var6 = ((ne) this).field_l.a(-1, param0);
            if (!(1 != (var6 ^ -1))) {
                return false;
            }
            boolean discarded$0 = this.b(param2, param4 ^ 32446, var6);
            boolean discarded$1 = this.a(var6, -68, param3);
            boolean discarded$2 = this.a(var6, param3, false);
            boolean discarded$3 = this.a(param1, (byte) -64, var6);
            return true;
        }
        var6 = ((ne) this).field_l.a(-1, param0);
        if (!(1 != (var6 ^ -1))) {
            return false;
        }
        boolean discarded$4 = this.b(param2, param4 ^ 32446, var6);
        boolean discarded$5 = this.a(var6, -68, param3);
        boolean discarded$6 = this.a(var6, param3, false);
        boolean discarded$7 = this.a(param1, (byte) -64, var6);
        return true;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if ((param2 ^ -1) != -18) {
          if (param1 != -64) {
            ((ne) this).field_c = null;
            return false;
          } else {
            return false;
          }
        } else {
          db.field_a = new w(((ne) this).field_c.field_V, ((ne) this).field_c.field_nb, ((ne) this).field_c.field_x, ((ne) this).field_c.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, ((ne) this).field_h, ((ne) this).field_d);
          return true;
        }
    }

    final void d(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (((ne) this).field_h == null) {
            break L0;
          } else {
            if (((ne) this).field_d != qf.field_a) {
              var3 = this.a((byte) 32);
              var2 = var3;
              ((ne) this).field_l.a(17, tj.a(-38, new String[1], ad.field_b), (byte) -26);
              break L0;
            } else {
              if (param0 == 5552) {
                return;
              } else {
                field_a = null;
                return;
              }
            }
          }
        }
        if (param0 != 5552) {
          field_a = null;
          return;
        } else {
          return;
        }
    }

    private final String a(byte param0) {
        String var2 = null;
        if (param0 != 32) {
          L0: {
            boolean discarded$18 = ((ne) this).a(false, -123, 50, 70, -1);
            if (null != ((ne) this).field_k) {
              var2 = ((ne) this).field_k;
              break L0;
            } else {
              var2 = ((ne) this).field_h;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (null != ((ne) this).field_k) {
              var2 = ((ne) this).field_k;
              break L1;
            } else {
              var2 = ((ne) this).field_h;
              break L1;
            }
          }
          return var2;
        }
    }

    final static boolean b(int param0) {
        if (param0 == -22768) {
          if (ob.field_Y != null) {
            if (!ob.field_Y.d((byte) -126)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_g = 24;
          if (ob.field_Y != null) {
            if (!ob.field_Y.d((byte) -126)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, jg param1) {
        if (!param1.field_i) {
          ((ne) this).field_i = param1.field_m;
          if (param0 == 19) {
            L0: {
              if (param1.field_m == 0) {
                L1: {
                  if (0 == on.field_h) {
                    ((ne) this).field_l.a(12, fg.field_g, (byte) -26);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ne) this).field_l.a(13, jg.field_j, (byte) -26);
                break L0;
              } else {
                break L0;
              }
            }
            if (-2 == (param1.field_m ^ -1)) {
              if (-1 != (ra.field_m ^ -1)) {
                L2: {
                  ((ne) this).field_l.a(13, dm.field_J, (byte) -26);
                  if ((param1.field_m ^ -1) != -3) {
                    break L2;
                  } else {
                    L3: {
                      if (hd.field_b == 0) {
                        ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                    break L2;
                  }
                }
                return;
              } else {
                ((ne) this).field_l.a(12, go.field_a, (byte) -26);
                L4: {
                  ((ne) this).field_l.a(13, dm.field_J, (byte) -26);
                  if ((param1.field_m ^ -1) != -3) {
                    break L4;
                  } else {
                    L5: {
                      if (hd.field_b == 0) {
                        ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                    break L4;
                  }
                }
                return;
              }
            } else {
              L6: {
                if ((param1.field_m ^ -1) != -3) {
                  break L6;
                } else {
                  L7: {
                    if (hd.field_b == 0) {
                      ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                  break L6;
                }
              }
              return;
            }
          } else {
            L8: {
              ((ne) this).field_m = null;
              if (param1.field_m == 0) {
                L9: {
                  if (0 == on.field_h) {
                    ((ne) this).field_l.a(12, fg.field_g, (byte) -26);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((ne) this).field_l.a(13, jg.field_j, (byte) -26);
                break L8;
              } else {
                break L8;
              }
            }
            if (-2 == (param1.field_m ^ -1)) {
              if (-1 != (ra.field_m ^ -1)) {
                L10: {
                  ((ne) this).field_l.a(13, dm.field_J, (byte) -26);
                  if ((param1.field_m ^ -1) != -3) {
                    break L10;
                  } else {
                    L11: {
                      if (hd.field_b == 0) {
                        ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                    break L10;
                  }
                }
                return;
              } else {
                ((ne) this).field_l.a(12, go.field_a, (byte) -26);
                L12: {
                  ((ne) this).field_l.a(13, dm.field_J, (byte) -26);
                  if ((param1.field_m ^ -1) != -3) {
                    break L12;
                  } else {
                    L13: {
                      if (hd.field_b == 0) {
                        ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                    break L12;
                  }
                }
                return;
              }
            } else {
              L14: {
                if ((param1.field_m ^ -1) != -3) {
                  break L14;
                } else {
                  L15: {
                    if (hd.field_b == 0) {
                      ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
                  break L14;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        cg var4 = null;
        String var5 = null;
        int var6 = 0;
        cg var11 = null;
        cg var12 = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 72) {
          ((ne) this).a((byte) -94, false);
          if (((ne) this).field_h != null) {
            if (((ne) this).field_d != qf.field_a) {
              if (null != wi.field_f) {
                if (qk.k((byte) 98)) {
                  var12 = fn.a(((ne) this).field_d, 110);
                  var4 = vf.a(((ne) this).field_d, 8192);
                  var5 = this.a((byte) 32);
                  if (var4 != null) {
                    if (wi.field_f.field_Lb) {
                      if (wi.field_f.field_nc >= 0) {
                        ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                      return;
                    }
                  } else {
                    if (var12 != null) {
                      if (wi.field_f.field_kc) {
                        if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                          if (!var12.field_Db) {
                            if (param1) {
                              if (!var12.field_Kb) {
                                ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
                                return;
                              } else {
                                ((ne) this).field_l.a(0, tj.a(-55, new String[1], se.field_L), (byte) -26);
                                ((ne) this).field_l.a(1, tj.a(param0 + 54, new String[1], gh.field_z), (byte) -26);
                                return;
                              }
                            } else {
                              ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
                              return;
                            }
                          } else {
                            ((ne) this).field_l.a(1, tj.a(124, new String[1], na.field_gc), (byte) -26);
                            return;
                          }
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
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (((ne) this).field_h != null) {
            if (((ne) this).field_d != qf.field_a) {
              if (null != wi.field_f) {
                if (qk.k((byte) 98)) {
                  var11 = fn.a(((ne) this).field_d, 110);
                  var4 = vf.a(((ne) this).field_d, 8192);
                  var5 = this.a((byte) 32);
                  if (var4 != null) {
                    if (wi.field_f.field_Lb) {
                      if (wi.field_f.field_nc >= 0) {
                        ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                      return;
                    }
                  } else {
                    if (var11 != null) {
                      if (wi.field_f.field_kc) {
                        if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                          if (!var11.field_Db) {
                            if (param1) {
                              if (var11.field_Kb) {
                                ((ne) this).field_l.a(0, tj.a(-55, new String[1], se.field_L), (byte) -26);
                                ((ne) this).field_l.a(1, tj.a(param0 + 54, new String[1], gh.field_z), (byte) -26);
                                return;
                              } else {
                                ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
                                return;
                              }
                            } else {
                              ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
                              return;
                            }
                          } else {
                            ((ne) this).field_l.a(1, tj.a(124, new String[1], na.field_gc), (byte) -26);
                            return;
                          }
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
                } else {
                  return;
                }
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
    }

    final void a(int param0) {
        String var3 = null;
        int var4 = 0;
        Object var5 = null;
        na var6 = null;
        na var7 = null;
        na var8 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 != 3) {
          var5 = null;
          ne.a(39, -67, (qb[]) null, -123, 12, 116);
          if (wi.field_f == null) {
            var8 = im.a(((ne) this).field_e, (byte) -103);
            if (var8 != null) {
              var3 = var8.field_ic;
              if (!var8.field_Hb) {
                if (var8.field_Ob) {
                  ((ne) this).field_l.a(2, tj.a(118, new String[1], ec.field_a), (byte) -26);
                  if (var8.field_Nb) {
                    ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L0: {
                    if (var8.field_Nb) {
                      break L0;
                    } else {
                      if (!var8.field_kc) {
                        break L0;
                      } else {
                        L1: {
                          if (!var8.field_Lb) {
                            break L1;
                          } else {
                            if (var8.field_Ob) {
                              break L1;
                            } else {
                              if (var8.field_Nb) {
                                ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                                return;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                        ((ne) this).field_l.a(2, tj.a(-53, new String[1], bm.field_i), (byte) -26);
                        if (var8.field_Nb) {
                          ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (!var8.field_Nb) {
                    return;
                  } else {
                    ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                    return;
                  }
                }
              } else {
                ((ne) this).field_l.a(2, tj.a(-106, new String[1], na.field_Sb), (byte) -26);
                ((ne) this).field_l.a(3, tj.a(-91, new String[1], mk.field_I), (byte) -26);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          if (wi.field_f == null) {
            var7 = im.a(((ne) this).field_e, (byte) -103);
            var6 = var7;
            if (var7 != null) {
              var3 = var7.field_ic;
              if (!var7.field_Hb) {
                if (var7.field_Ob) {
                  ((ne) this).field_l.a(2, tj.a(118, new String[1], ec.field_a), (byte) -26);
                  if (var7.field_Nb) {
                    ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!var7.field_Nb) {
                    if (!var7.field_kc) {
                      if (var7.field_Nb) {
                        ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      L2: {
                        if (!var7.field_Lb) {
                          break L2;
                        } else {
                          if (var7.field_Ob) {
                            break L2;
                          } else {
                            if (var7.field_Nb) {
                              ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                              return;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      ((ne) this).field_l.a(2, tj.a(-53, new String[1], bm.field_i), (byte) -26);
                      if (var7.field_Nb) {
                        ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var7.field_Nb) {
                      ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((ne) this).field_l.a(2, tj.a(-106, new String[1], na.field_Sb), (byte) -26);
                ((ne) this).field_l.a(3, tj.a(-91, new String[1], mk.field_I), (byte) -26);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != -22717) {
            field_b = -81;
            ((ne) this).field_l.a(param1, true);
            return;
        }
        ((ne) this).field_l.a(param1, true);
    }

    final void a(int param0, int[] param1, int param2) {
        String var4 = null;
        wa var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        if (null != ((ne) this).field_h) {
          if ((qf.field_a ^ -1L) == (((ne) this).field_d ^ -1L)) {
            if (param0 == 2) {
              if ((jb.field_t ^ -1) == -3) {
                L0: {
                  var8 = this.a((byte) 32);
                  var4 = var8;
                  var5 = im.a(param2 ^ 13, ((ne) this).field_h);
                  var6 = sa.a(((ne) this).field_h, param2 ^ 333) ? 1 : 0;
                  if (var5 != null) {
                    break L0;
                  } else {
                    if (var6 == 0) {
                      ((ne) this).field_l.a(4, tj.a(param2 + -80, new String[1], ArcanistsMulti.field_F), (byte) -26);
                      ((ne) this).field_l.a(6, tj.a(-108, new String[1], tn.field_Lb), (byte) -26);
                      if (param1 == null) {
                        break L0;
                      } else {
                        if (param0 == 2) {
                          break L0;
                        } else {
                          if (!wh.field_g) {
                            ((ne) this).field_m = param1;
                            ((ne) this).field_l.a(19, tj.a(-25, new String[1], gh.field_O), (byte) -26);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                if (var5 == null) {
                  if (var6 != 0) {
                    ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                    if (param2 == 13) {
                      return;
                    } else {
                      var7 = null;
                      ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                      return;
                    }
                  } else {
                    if (param2 == 13) {
                      return;
                    } else {
                      var7 = null;
                      ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                      return;
                    }
                  }
                } else {
                  if (tc.a(((ne) this).field_h, -31046)) {
                    L1: {
                      ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                      if (var6 != 0) {
                        ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (param2 != 13) {
                      var7 = null;
                      ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (!wh.field_g) {
                      if (ld.field_p) {
                        ((ne) this).field_l.a(18, tj.a(127, new String[1], bh.field_b), (byte) -26);
                        if (param1 == null) {
                          L2: {
                            ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                            if (var6 != 0) {
                              ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          if (param2 != 13) {
                            var7 = null;
                            ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((ne) this).field_m = param1;
                          ((ne) this).field_l.a(19, tj.a(-98, new String[1], gh.field_O), (byte) -26);
                          L3: {
                            ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                            if (var6 != 0) {
                              ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          if (param2 != 13) {
                            var7 = null;
                            ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        ((ne) this).field_l.a(8, tj.a(-94, new String[1], mb.field_S), (byte) -26);
                        ((ne) this).field_l.a(18, tj.a(127, new String[1], bh.field_b), (byte) -26);
                        if (param1 == null) {
                          L4: {
                            ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                            if (var6 != 0) {
                              ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            if (param2 == 13) {
                              break L5;
                            } else {
                              var7 = null;
                              ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                              break L5;
                            }
                          }
                          return;
                        } else {
                          ((ne) this).field_m = param1;
                          ((ne) this).field_l.a(19, tj.a(-98, new String[1], gh.field_O), (byte) -26);
                          L6: {
                            ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                            if (var6 != 0) {
                              ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          L7: {
                            if (param2 == 13) {
                              break L7;
                            } else {
                              var7 = null;
                              ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                              break L7;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L8: {
                        ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                        if (var6 != 0) {
                          ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      if (param2 != 13) {
                        var7 = null;
                        ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
              } else {
                if (param2 != 13) {
                  var7 = null;
                  ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param2 != 13) {
                var7 = null;
                ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                return;
              } else {
                return;
              }
            }
          } else {
            L9: {
              if ((jb.field_t ^ -1) != -3) {
                break L9;
              } else {
                L10: {
                  var8 = this.a((byte) 32);
                  var4 = var8;
                  var5 = im.a(param2 ^ 13, ((ne) this).field_h);
                  var6 = sa.a(((ne) this).field_h, param2 ^ 333) ? 1 : 0;
                  if (var5 != null) {
                    break L10;
                  } else {
                    if (var6 == 0) {
                      ((ne) this).field_l.a(4, tj.a(param2 + -80, new String[1], ArcanistsMulti.field_F), (byte) -26);
                      ((ne) this).field_l.a(6, tj.a(-108, new String[1], tn.field_Lb), (byte) -26);
                      if (param1 == null) {
                        break L10;
                      } else {
                        if (param0 == 2) {
                          break L10;
                        } else {
                          if (!wh.field_g) {
                            ((ne) this).field_m = param1;
                            ((ne) this).field_l.a(19, tj.a(-25, new String[1], gh.field_O), (byte) -26);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                if (var5 == null) {
                  if (var6 != 0) {
                    ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                    break L9;
                  } else {
                    L11: {
                      if (param2 == 13) {
                        break L11;
                      } else {
                        var7 = null;
                        ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  if (!tc.a(((ne) this).field_h, -31046)) {
                    if (!wh.field_g) {
                      L12: {
                        if (ld.field_p) {
                          break L12;
                        } else {
                          ((ne) this).field_l.a(8, tj.a(-94, new String[1], mb.field_S), (byte) -26);
                          break L12;
                        }
                      }
                      ((ne) this).field_l.a(18, tj.a(127, new String[1], bh.field_b), (byte) -26);
                      if (param1 != null) {
                        ((ne) this).field_m = param1;
                        ((ne) this).field_l.a(19, tj.a(-98, new String[1], gh.field_O), (byte) -26);
                        L13: {
                          ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                          if (var6 != 0) {
                            ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (param2 == 13) {
                            break L14;
                          } else {
                            var7 = null;
                            ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                          if (var6 != 0) {
                            ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (param2 == 13) {
                            break L16;
                          } else {
                            var7 = null;
                            ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                            break L16;
                          }
                        }
                        return;
                      }
                    } else {
                      L17: {
                        ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                        if (var6 != 0) {
                          ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (param2 == 13) {
                          break L18;
                        } else {
                          var7 = null;
                          ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                          break L18;
                        }
                      }
                      return;
                    }
                  } else {
                    L19: {
                      ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                      if (var6 != 0) {
                        ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (param2 == 13) {
                        break L20;
                      } else {
                        var7 = null;
                        ne.a(-44, -48, (qb[]) null, 59, 24, -88);
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (param2 != 13) {
              var7 = null;
              ne.a(-44, -48, (qb[]) null, 59, 24, -88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != 13) {
            var7 = null;
            ne.a(-44, -48, (qb[]) null, 59, 24, -88);
            return;
          } else {
            return;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 19633) {
            return false;
        }
        if (param2 == 0) {
            qo.a(param0, (byte) -102, ((ne) this).field_d);
            return true;
        }
        if ((param2 ^ -1) == -2) {
            na.a(((ne) this).field_d, 126, param0);
            return true;
        }
        if (param2 == 2) {
            uj.a(((ne) this).field_e, (byte) -123, param0);
        } else {
            if (param2 == 3) {
                qc.a(false, ((ne) this).field_e, param0);
                return true;
            }
            if (10 == param2) {
                qe.a(((ne) this).field_e, (byte) -35, param0);
                return true;
            }
            if (param2 == 15) {
                ce.a(((ne) this).field_e, param0, -123);
                return true;
            }
            if (param2 == 16) {
                ce.a(0, param0, -79);
                return true;
            }
            return false;
        }
        return true;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param2) {
          if (8 != param0) {
            if (18 != param0) {
              if (param0 != -12) {
                if (-13 != param0) {
                  if (-14 != (param0 ^ -1)) {
                    if ((param0 ^ -1) != -15) {
                      if ((param0 ^ -1) != -21) {
                        if (19 != param0) {
                          return false;
                        } else {
                          boolean discarded$2 = va.a(((ne) this).field_d, 1, ((ne) this).field_m, ((ne) this).field_h, ((ne) this).field_i);
                          return true;
                        }
                      } else {
                        gj.a((byte) -61);
                        return true;
                      }
                    } else {
                      j.a(param2);
                      return true;
                    }
                  } else {
                    ea.a(param1, 2, true, ((ne) this).field_i);
                    return true;
                  }
                } else {
                  ea.a(param1, 1, true, ((ne) this).field_i);
                  return true;
                }
              } else {
                L0: {
                  stackOut_36_0 = param1;
                  stackOut_36_1 = 0;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (param2) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L0;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L0;
                  }
                }
                ea.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0, ((ne) this).field_i);
                return true;
              }
            } else {
              h.a(((ne) this).field_d, -30687, ((ne) this).field_h);
              return true;
            }
          } else {
            nb.a(((ne) this).field_h, ((ne) this).field_d, -26510);
            return true;
          }
        } else {
          ((ne) this).field_c = null;
          if (8 != param0) {
            if (18 != param0) {
              L1: {
                if (param0 != -12) {
                  if (-13 != param0) {
                    if (-14 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -15) {
                        if ((param0 ^ -1) != -21) {
                          if (19 == param0) {
                            boolean discarded$3 = va.a(((ne) this).field_d, 1, ((ne) this).field_m, ((ne) this).field_h, ((ne) this).field_i);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          gj.a((byte) -61);
                          break L1;
                        }
                      } else {
                        j.a(param2);
                        return true;
                      }
                    } else {
                      ea.a(param1, 2, true, ((ne) this).field_i);
                      return true;
                    }
                  } else {
                    ea.a(param1, 1, true, ((ne) this).field_i);
                    return true;
                  }
                } else {
                  L2: {
                    stackOut_7_0 = param1;
                    stackOut_7_1 = 0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (param2) {
                      stackOut_9_0 = stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      break L2;
                    } else {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      break L2;
                    }
                  }
                  ea.a(stackIn_10_0, stackIn_10_1, stackIn_10_2 != 0, ((ne) this).field_i);
                  break L1;
                }
              }
              return true;
            } else {
              h.a(((ne) this).field_d, -30687, ((ne) this).field_h);
              return true;
            }
          } else {
            nb.a(((ne) this).field_h, ((ne) this).field_d, -26510);
            return true;
          }
        }
    }

    final boolean b(byte param0) {
        if (param0 == 49) {
          if (((ne) this).field_l != null) {
            if (!((ne) this).field_l.e(param0 ^ -22615)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    public static void c(int param0) {
        if (param0 >= -1) {
          field_j = null;
          field_f = null;
          field_a = null;
          field_j = null;
          return;
        } else {
          field_f = null;
          field_a = null;
          field_j = null;
          return;
        }
    }

    ne(kc param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((ne) this).field_l = new pe(ml.field_H);
        param0.field_ab = true;
        ((ne) this).field_i = param5;
        ((ne) this).field_m = param6;
        ((ne) this).field_h = param2;
        ((ne) this).field_d = param1;
        ((ne) this).field_k = param3;
        ((ne) this).field_e = param4;
        ((ne) this).field_c = param0;
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (param2 == null) {
            break L0;
          } else {
            if (param1 > 0) {
              var6 = param2[0].field_n;
              var7 = param2[2].field_n;
              var8 = param2[1].field_n;
              param2[0].e(param4, param3, param5);
              param2[2].e(param4 - -param1 - var7, param3, param5);
              de.a(sl.field_H);
              de.a(param4 - -var6, param3, -var7 + (param1 + param4), param2[1].field_w + param3);
              var9 = var6 + param4;
              var10 = -var7 + param4 - -param1;
              if (param0 > -30) {
                return;
              } else {
                param4 = var9;
                L1: while (true) {
                  if (param4 >= var10) {
                    de.b(sl.field_H);
                    return;
                  } else {
                    param2[1].e(param4, param3, param5);
                    param4 = param4 + var8;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "These green slopes are where all young Arcanists train to become great mages. All that can be found here is a clean battleground in which to test your skills.";
        field_a = "Clan";
        field_f = "Day";
    }
}
