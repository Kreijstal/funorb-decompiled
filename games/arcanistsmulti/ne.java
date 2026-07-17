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
        String var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        Object var4 = null;
        if (param0 != 4) {
            if (param0 == 5) {
                var4_ref = oe.a(((ne) this).field_h, 29140, param2);
                var5 = 61;
                if (var4_ref == null) {
                    return true;
                }
                var6 = null;
                ao.a(0, (byte) 97, var4_ref, ((ne) this).field_h, 2, (String) null);
                return true;
            }
            if (param0 == 6) {
                var4_ref = eh.a((byte) -120, param2, ((ne) this).field_h);
                var5 = 61;
                if (!(var4_ref == null)) {
                    var6 = null;
                    ao.a(0, (byte) 97, var4_ref, ((ne) this).field_h, 2, (String) null);
                }
                return true;
            }
            if (param0 == 7) {
                int discarded$0 = 10068666;
                var4_ref = hf.a(((ne) this).field_h, ((ne) this).field_k, param2);
                var5 = 61;
                if (!(var4_ref == null)) {
                    var6 = null;
                    ao.a(0, (byte) 97, var4_ref, ((ne) this).field_h, 2, (String) null);
                }
                return true;
            }
            return false;
        }
        var4_ref = bo.a(((ne) this).field_h, (byte) -26, param2);
        var5 = 61;
        if (!(var4_ref == null)) {
            var6 = null;
            ao.a(0, (byte) 97, var4_ref, ((ne) this).field_h, 2, (String) null);
        }
        return true;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (param4 != 12815) {
            ((ne) this).d(102);
            var6 = ((ne) this).field_l.a(-1, param0);
            if (!(var6 != -2)) {
                return false;
            }
            boolean discarded$0 = this.b(param2, param4 ^ 32446, var6);
            boolean discarded$1 = this.a(var6, -68, param3);
            int discarded$2 = 0;
            boolean discarded$3 = this.a(var6, param3);
            boolean discarded$4 = this.a(param1, (byte) -64, var6);
            return true;
        }
        var6 = ((ne) this).field_l.a(-1, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$5 = this.b(param2, param4 ^ 32446, var6);
        boolean discarded$6 = this.a(var6, -68, param3);
        int discarded$7 = 0;
        boolean discarded$8 = this.a(var6, param3);
        boolean discarded$9 = this.a(param1, (byte) -64, var6);
        return true;
    }

    private final boolean a(int param0, byte param1, int param2) {
        if (param2 == 17) {
          db.field_a = new w(((ne) this).field_c.field_V, ((ne) this).field_c.field_nb, ((ne) this).field_c.field_x, ((ne) this).field_c.field_I, param0, mf.field_d, be.field_l, wj.field_b, pg.field_c, ec.field_g, nj.field_d, ((ne) this).field_h, ((ne) this).field_d);
          return true;
        } else {
          return false;
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
              int discarded$2 = 32;
              var3 = this.a();
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

    private final String a() {
        String var2 = null;
        if (null == ((ne) this).field_k) {
            var2 = ((ne) this).field_h;
        } else {
            var2 = ((ne) this).field_k;
        }
        return var2;
    }

    final static boolean b() {
        if (ob.field_Y == null) {
            return false;
        }
        if (!ob.field_Y.d((byte) -126)) {
            return false;
        }
        return true;
    }

    final void a(int param0, jg param1) {
        if (param1.field_i) {
            return;
        }
        try {
            ((ne) this).field_i = param1.field_m;
            if (param0 != 19) {
                ((ne) this).field_m = null;
            }
            if (!(param1.field_m != 0)) {
                if (!(0 != on.field_h)) {
                    ((ne) this).field_l.a(12, fg.field_g, (byte) -26);
                }
                ((ne) this).field_l.a(13, jg.field_j, (byte) -26);
            }
            if (!(param1.field_m != 1)) {
                if (ra.field_m == 0) {
                    ((ne) this).field_l.a(12, go.field_a, (byte) -26);
                }
                ((ne) this).field_l.a(13, dm.field_J, (byte) -26);
            }
            if (param1.field_m == 2) {
                if (!(hd.field_b != 0)) {
                    ((ne) this).field_l.a(12, va.field_d, (byte) -26);
                }
                ((ne) this).field_l.a(13, ol.field_c, (byte) -26);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ne.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
            L0: {
              if (((ne) this).field_d == qf.field_a) {
                break L0;
              } else {
                if (null == wi.field_f) {
                  break L0;
                } else {
                  if (qk.k((byte) 98)) {
                    var12 = fn.a(((ne) this).field_d, 110);
                    int discarded$4 = 8192;
                    var4 = vf.a(((ne) this).field_d);
                    int discarded$5 = 32;
                    var5 = this.a();
                    if (var4 != null) {
                      if (!wi.field_f.field_Lb) {
                        ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                        return;
                      } else {
                        if (wi.field_f.field_nc < 0) {
                          break L0;
                        } else {
                          ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                          return;
                        }
                      }
                    } else {
                      if (var12 == null) {
                        break L0;
                      } else {
                        if (!wi.field_f.field_kc) {
                          break L0;
                        } else {
                          if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                            if (var12.field_Db) {
                              ((ne) this).field_l.a(1, tj.a(124, new String[1], na.field_gc), (byte) -26);
                              return;
                            } else {
                              L1: {
                                if (!param1) {
                                  break L1;
                                } else {
                                  if (!var12.field_Kb) {
                                    break L1;
                                  } else {
                                    ((ne) this).field_l.a(0, tj.a(-55, new String[1], se.field_L), (byte) -26);
                                    ((ne) this).field_l.a(1, tj.a(param0 + 54, new String[1], gh.field_z), (byte) -26);
                                    return;
                                  }
                                }
                              }
                              ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          if (((ne) this).field_h != null) {
            if (((ne) this).field_d != qf.field_a) {
              if (null != wi.field_f) {
                if (qk.k((byte) 98)) {
                  var11 = fn.a(((ne) this).field_d, 110);
                  int discarded$6 = 8192;
                  var4 = vf.a(((ne) this).field_d);
                  int discarded$7 = 32;
                  var5 = this.a();
                  if (var4 != null) {
                    if (!wi.field_f.field_Lb) {
                      ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                      return;
                    } else {
                      if (wi.field_f.field_nc < 0) {
                        return;
                      } else {
                        ((ne) this).field_l.a(1, tj.a(-18, new String[1], gg.field_a), (byte) -26);
                        return;
                      }
                    }
                  } else {
                    if (var11 != null) {
                      if (wi.field_f.field_kc) {
                        if (wi.field_f.field_dc > wi.field_f.field_Rb) {
                          if (var11.field_Db) {
                            ((ne) this).field_l.a(1, tj.a(124, new String[1], na.field_gc), (byte) -26);
                            return;
                          } else {
                            L2: {
                              if (!param1) {
                                break L2;
                              } else {
                                if (!var11.field_Kb) {
                                  break L2;
                                } else {
                                  ((ne) this).field_l.a(0, tj.a(-55, new String[1], se.field_L), (byte) -26);
                                  ((ne) this).field_l.a(1, tj.a(param0 + 54, new String[1], gh.field_z), (byte) -26);
                                  return;
                                }
                              }
                            }
                            ((ne) this).field_l.a(0, tj.a(param0 + 48, new String[1], nh.field_x), (byte) -26);
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
                  if (!var8.field_Nb) {
                    return;
                  } else {
                    ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
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
                              if (!var8.field_Nb) {
                                return;
                              } else {
                                ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                                return;
                              }
                            }
                          }
                        }
                        ((ne) this).field_l.a(2, tj.a(-53, new String[1], bm.field_i), (byte) -26);
                        if (!var8.field_Nb) {
                          return;
                        } else {
                          ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
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
                  if (!var7.field_Nb) {
                    return;
                  } else {
                    ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                    return;
                  }
                } else {
                  if (!var7.field_Nb) {
                    if (!var7.field_kc) {
                      if (!var7.field_Nb) {
                        return;
                      } else {
                        ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                        return;
                      }
                    } else {
                      if (var7.field_Lb) {
                        if (!var7.field_Ob) {
                          if (!var7.field_Nb) {
                            return;
                          } else {
                            ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                            return;
                          }
                        } else {
                          ((ne) this).field_l.a(2, tj.a(-53, new String[1], bm.field_i), (byte) -26);
                          if (!var7.field_Nb) {
                            return;
                          } else {
                            ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                            return;
                          }
                        }
                      } else {
                        ((ne) this).field_l.a(2, tj.a(-53, new String[1], bm.field_i), (byte) -26);
                        if (var7.field_Nb) {
                          ((ne) this).field_l.a(3, tj.a(-82, new String[1], hl.field_h), (byte) -26);
                          return;
                        } else {
                          return;
                        }
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
        RuntimeException var4 = null;
        String var4_ref = null;
        wa var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (null == ((ne) this).field_h) {
                break L1;
              } else {
                L2: {
                  if (~qf.field_a != ~((ne) this).field_d) {
                    break L2;
                  } else {
                    if (param0 != 2) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (jb.field_t != 2) {
                  break L1;
                } else {
                  L3: {
                    int discarded$2 = 32;
                    var8 = this.a();
                    var4_ref = var8;
                    var5 = im.a(param2 ^ 13, ((ne) this).field_h);
                    var6 = sa.a(((ne) this).field_h, param2 ^ 333) ? 1 : 0;
                    if (var5 != null) {
                      break L3;
                    } else {
                      if (var6 == 0) {
                        ((ne) this).field_l.a(4, tj.a(param2 + -80, new String[1], ArcanistsMulti.field_F), (byte) -26);
                        ((ne) this).field_l.a(6, tj.a(-108, new String[1], tn.field_Lb), (byte) -26);
                        if (param1 == null) {
                          break L3;
                        } else {
                          if (param0 == 2) {
                            break L3;
                          } else {
                            if (!wh.field_g) {
                              ((ne) this).field_m = param1;
                              ((ne) this).field_l.a(19, tj.a(-25, new String[1], gh.field_O), (byte) -26);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 == null) {
                      break L4;
                    } else {
                      L5: {
                        int discarded$3 = -31046;
                        if (tc.a(((ne) this).field_h)) {
                          break L5;
                        } else {
                          if (!wh.field_g) {
                            L6: {
                              if (ld.field_p) {
                                break L6;
                              } else {
                                ((ne) this).field_l.a(8, tj.a(-94, new String[1], mb.field_S), (byte) -26);
                                break L6;
                              }
                            }
                            ((ne) this).field_l.a(18, tj.a(127, new String[1], bh.field_b), (byte) -26);
                            if (param1 == null) {
                              break L5;
                            } else {
                              ((ne) this).field_m = param1;
                              ((ne) this).field_l.a(19, tj.a(-98, new String[1], gh.field_O), (byte) -26);
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      ((ne) this).field_l.a(5, tj.a(param2 + -48, new String[1], ke.field_F), (byte) -26);
                      break L4;
                    }
                  }
                  if (var6 != 0) {
                    ((ne) this).field_l.a(7, tj.a(126, new String[1], ja.field_t), (byte) -26);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param2 == 13) {
              break L0;
            } else {
              var7 = null;
              ne.a(-44, -48, (qb[]) null, 59, 24, -88);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var4;
            stackOut_28_1 = new StringBuilder().append("ne.K(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 41);
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
        if (param2 == 1) {
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

    private final boolean a(int param0, int param1) {
        int var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (8 == param0) {
            int discarded$0 = -26510;
            nb.a(((ne) this).field_h, ((ne) this).field_d);
            return true;
        }
        if (18 != param0) {
            if (param0 == 11) {
                ea.a(param1, 0, true, ((ne) this).field_i);
                return true;
            }
            if (param0 != 12) {
                if (param0 != 13) {
                    if (param0 != 14) {
                        if (param0 == 20) {
                            gj.a((byte) -61);
                            return true;
                        }
                        if (19 == param0) {
                            boolean discarded$1 = va.a(((ne) this).field_d, 1, ((ne) this).field_m, ((ne) this).field_h, ((ne) this).field_i);
                            return true;
                        }
                        return false;
                    }
                    j.a(false);
                    return true;
                }
                ea.a(param1, 2, true, ((ne) this).field_i);
                return true;
            }
            ea.a(param1, 1, true, ((ne) this).field_i);
            return true;
        }
        h.a(((ne) this).field_d, -30687, ((ne) this).field_h);
        return true;
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

    public static void c() {
        field_f = null;
        field_a = null;
        field_j = null;
    }

    ne(kc param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
            ((ne) this).field_l = new pe(ml.field_H);
            param0.field_ab = true;
            ((ne) this).field_i = param5;
            ((ne) this).field_m = param6;
            ((ne) this).field_h = param2;
            ((ne) this).field_d = param1;
            ((ne) this).field_k = param3;
            ((ne) this).field_e = param4;
            ((ne) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ne.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, qb[] param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == null) {
                break L1;
              } else {
                if (param1 > 0) {
                  var6_int = param2[0].field_n;
                  var7 = param2[2].field_n;
                  var8 = param2[1].field_n;
                  param2[0].e(param4, param3, param5);
                  param2[2].e(param4 - -param1 - var7, param3, param5);
                  de.a(sl.field_H);
                  de.a(param4 - -var6_int, param3, -var7 + (param1 + param4), param2[1].field_w + param3);
                  var9 = var6_int + param4;
                  var10 = -var7 + param4 - -param1;
                  if (param0 <= -30) {
                    param4 = var9;
                    L2: while (true) {
                      if (param4 >= var10) {
                        de.b(sl.field_H);
                        break L0;
                      } else {
                        param2[1].e(param4, param3, param5);
                        param4 = param4 + var8;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("ne.G(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
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
