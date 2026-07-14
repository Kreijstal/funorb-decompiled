/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends wv implements vh {
    static hd field_lb;
    static ut field_qb;
    private boolean field_nb;
    private boolean field_pb;
    static int field_ob;
    static r field_rb;
    static int field_kb;
    private ae field_mb;

    public static void s(int param0) {
        field_lb = null;
        field_rb = null;
        if (param0 != 248) {
            jn.s(-37);
            field_qb = null;
            return;
        }
        field_qb = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_7_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_19_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_17_0 = 0;
            int stackOut_18_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Kickabout.field_G;
                        if (!lb.field_F) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) mm.a(30858, "getcookies", param1);
                            var4 = wr.a(var3, 2, ';');
                            var5 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 9;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param0 == 17) {
                                statePc = 16;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var8 = null;
                            boolean discarded$6 = jn.a(100, (java.applet.Applet) null);
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = 1;
                            stackIn_13_0 = stackOut_11_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            return stackIn_13_0 != 0;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2_ref = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        stackOut_17_0 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    jn(se param0, ae param1) {
        super(param0, fj.field_b, kk.field_L, false, false);
        ((jn) this).field_mb = param1;
    }

    final void t(int param0) {
        this.a(true, wb.a(param0 ^ -105, nb.field_g, 248), (byte) -71);
        if (param0 != 17) {
            field_qb = null;
        }
    }

    final boolean k(int param0) {
        wn var2 = null;
        if (param0 == -1) {
          if (((jn) this).field_C) {
            if (!((jn) this).field_pb) {
              var2 = uf.a(param0 + -1459);
              if (var2 != null) {
                this.a(false, var2, (byte) -71);
                return super.k(-1);
              } else {
                return super.k(-1);
              }
            } else {
              return super.k(-1);
            }
          } else {
            return super.k(-1);
          }
        } else {
          jn.s(-114);
          if (((jn) this).field_C) {
            if (!((jn) this).field_pb) {
              var2 = uf.a(param0 + -1459);
              if (var2 != null) {
                this.a(false, var2, (byte) -71);
                return super.k(-1);
              } else {
                return super.k(-1);
              }
            } else {
              return super.k(-1);
            }
          } else {
            return super.k(-1);
          }
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (((jn) this).field_nb) {
          bl.a(false, true, (byte) -121);
          return;
        } else {
          L0: {
            oh.a(-87);
            ((jn) this).q(-96);
            if (param3 > 64) {
              break L0;
            } else {
              field_rb = null;
              break L0;
            }
          }
          return;
        }
    }

    private final void a(boolean param0, wn param1, byte param2) {
        String var4 = null;
        qp var5 = null;
        int var6 = 0;
        String var7 = null;
        qp var8 = null;
        qp var9 = null;
        var6 = Kickabout.field_G;
        ((jn) this).field_pb = true;
        if (!param1.field_g) {
          if (param1.field_f != null) {
            var7 = se.field_B;
            var4 = var7;
            if (null != ((jn) this).field_mb) {
              ((jn) this).field_mb.a(-1);
              if (param2 == -71) {
                var9 = new qp((wv) this, fj.field_b, var4);
                var5 = var9;
                if (param1.field_g) {
                  if (param1.field_c) {
                    ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                    return;
                  } else {
                    wi discarded$12 = var9.a(es.field_g, (jv) this, (byte) 79);
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  }
                } else {
                  if (!((jn) this).field_nb) {
                    if (param1.field_e != 5) {
                      var9.a((byte) 55, -1, is.field_f);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) == -7) {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a((byte) 75, 11, ql.field_d);
                      var9.a((byte) 66, 17, bv.field_o);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) == -7) {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    }
                  } else {
                    wi discarded$13 = var9.a(es.field_g, (jv) this, (byte) 79);
                    if (param1.field_e != 3) {
                      if ((param1.field_e ^ -1) == -7) {
                        var9.a((byte) 114, 9, bv.field_p);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      } else {
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a((byte) 94, 7, ha.field_J);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            } else {
              if (param2 == -71) {
                var8 = new qp((wv) this, fj.field_b, var7);
                if (param1.field_g) {
                  if (param1.field_c) {
                    ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                    return;
                  } else {
                    wi discarded$14 = var8.a(es.field_g, (jv) this, (byte) 79);
                    ((jn) this).a((byte) -122, (fd) (Object) var8);
                    return;
                  }
                } else {
                  if (!((jn) this).field_nb) {
                    if (param1.field_e != 5) {
                      var8.a((byte) 55, -1, is.field_f);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) == -7) {
                          var8.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var8);
                          return;
                        } else {
                          ((jn) this).a((byte) -122, (fd) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var8);
                        return;
                      }
                    } else {
                      L0: {
                        var8.a((byte) 75, 11, ql.field_d);
                        var8.a((byte) 66, 17, bv.field_o);
                        if (param1.field_e != 3) {
                          if ((param1.field_e ^ -1) == -7) {
                            var8.a((byte) 114, 9, bv.field_p);
                            break L0;
                          } else {
                            ((jn) this).a((byte) -122, (fd) (Object) var8);
                            return;
                          }
                        } else {
                          var8.a((byte) 94, 7, ha.field_J);
                          break L0;
                        }
                      }
                      ((jn) this).a((byte) -122, (fd) (Object) var8);
                      return;
                    }
                  } else {
                    L1: {
                      wi discarded$15 = var8.a(es.field_g, (jv) this, (byte) 79);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) == -7) {
                          var8.a((byte) 114, 9, bv.field_p);
                          break L1;
                        } else {
                          ((jn) this).a((byte) -122, (fd) (Object) var8);
                          return;
                        }
                      } else {
                        var8.a((byte) 94, 7, ha.field_J);
                        break L1;
                      }
                    }
                    ((jn) this).a((byte) -122, (fd) (Object) var8);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            var4 = param1.field_d;
            if ((param1.field_e ^ -1) == -249) {
              if (param0) {
                var4 = nb.field_g;
                ((jn) this).field_nb = true;
                if (param2 == -71) {
                  var9 = new qp((wv) this, fj.field_b, var4);
                  var5 = var9;
                  if (param1.field_g) {
                    if (param1.field_c) {
                      ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                      return;
                    } else {
                      wi discarded$16 = var9.a(es.field_g, (jv) this, (byte) 79);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  } else {
                    if (!((jn) this).field_nb) {
                      if (param1.field_e != 5) {
                        var9.a((byte) 55, -1, is.field_f);
                        if (param1.field_e != 3) {
                          if ((param1.field_e ^ -1) == -7) {
                            var9.a((byte) 114, 9, bv.field_p);
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          } else {
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          }
                        } else {
                          var9.a((byte) 94, 7, ha.field_J);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 75, 11, ql.field_d);
                        var9.a((byte) 66, 17, bv.field_o);
                        if (param1.field_e != 3) {
                          if ((param1.field_e ^ -1) != -7) {
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          } else {
                            var9.a((byte) 114, 9, bv.field_p);
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          }
                        } else {
                          var9.a((byte) 94, 7, ha.field_J);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      }
                    } else {
                      wi discarded$17 = var9.a(es.field_g, (jv) this, (byte) 79);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) != -7) {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                pc.a(536870912);
                var4 = nb.field_g;
                ((jn) this).field_nb = true;
                if (param2 == -71) {
                  var9 = new qp((wv) this, fj.field_b, var4);
                  var5 = var9;
                  if (param1.field_g) {
                    if (param1.field_c) {
                      ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                      return;
                    } else {
                      wi discarded$18 = var9.a(es.field_g, (jv) this, (byte) 79);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  } else {
                    if (!((jn) this).field_nb) {
                      if (param1.field_e != 5) {
                        var9.a((byte) 55, -1, is.field_f);
                        if (param1.field_e != 3) {
                          if ((param1.field_e ^ -1) == -7) {
                            var9.a((byte) 114, 9, bv.field_p);
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          } else {
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          }
                        } else {
                          var9.a((byte) 94, 7, ha.field_J);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 75, 11, ql.field_d);
                        var9.a((byte) 66, 17, bv.field_o);
                        if (param1.field_e != 3) {
                          if ((param1.field_e ^ -1) == -7) {
                            var9.a((byte) 114, 9, bv.field_p);
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          } else {
                            ((jn) this).a((byte) -122, (fd) (Object) var9);
                            return;
                          }
                        } else {
                          var9.a((byte) 94, 7, ha.field_J);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      }
                    } else {
                      wi discarded$19 = var9.a(es.field_g, (jv) this, (byte) 79);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) == -7) {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (param2 == -71) {
                var9 = new qp((wv) this, fj.field_b, var4);
                var5 = var9;
                if (param1.field_g) {
                  if (param1.field_c) {
                    ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                    return;
                  } else {
                    wi discarded$20 = var9.a(es.field_g, (jv) this, (byte) 79);
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  }
                } else {
                  if (!((jn) this).field_nb) {
                    if (param1.field_e != 5) {
                      var9.a((byte) 55, -1, is.field_f);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) != -7) {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a((byte) 75, 11, ql.field_d);
                      var9.a((byte) 66, 17, bv.field_o);
                      if (param1.field_e != 3) {
                        if ((param1.field_e ^ -1) != -7) {
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        } else {
                          var9.a((byte) 114, 9, bv.field_p);
                          ((jn) this).a((byte) -122, (fd) (Object) var9);
                          return;
                        }
                      } else {
                        var9.a((byte) 94, 7, ha.field_J);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    }
                  } else {
                    wi discarded$21 = var9.a(es.field_g, (jv) this, (byte) 79);
                    if (param1.field_e != 3) {
                      if ((param1.field_e ^ -1) != -7) {
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      } else {
                        var9.a((byte) 114, 9, bv.field_p);
                        ((jn) this).a((byte) -122, (fd) (Object) var9);
                        return;
                      }
                    } else {
                      var9.a((byte) 94, 7, ha.field_J);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } else {
          var4 = cb.field_e;
          if (param2 == -71) {
            var9 = new qp((wv) this, fj.field_b, var4);
            var5 = var9;
            if (param1.field_g) {
              if (param1.field_c) {
                ((jn) this).a((byte) -126, (fd) (Object) new ai((jn) this));
                return;
              } else {
                wi discarded$22 = var9.a(es.field_g, (jv) this, (byte) 79);
                ((jn) this).a((byte) -122, (fd) (Object) var9);
                return;
              }
            } else {
              if (!((jn) this).field_nb) {
                if (param1.field_e != 5) {
                  var9.a((byte) 55, -1, is.field_f);
                  if (param1.field_e != 3) {
                    if ((param1.field_e ^ -1) != -7) {
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    } else {
                      var9.a((byte) 114, 9, bv.field_p);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a((byte) 94, 7, ha.field_J);
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  }
                } else {
                  var9.a((byte) 75, 11, ql.field_d);
                  var9.a((byte) 66, 17, bv.field_o);
                  if (param1.field_e != 3) {
                    if ((param1.field_e ^ -1) != -7) {
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    } else {
                      var9.a((byte) 114, 9, bv.field_p);
                      ((jn) this).a((byte) -122, (fd) (Object) var9);
                      return;
                    }
                  } else {
                    var9.a((byte) 94, 7, ha.field_J);
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  }
                }
              } else {
                wi discarded$23 = var9.a(es.field_g, (jv) this, (byte) 79);
                if (param1.field_e != 3) {
                  if ((param1.field_e ^ -1) != -7) {
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  } else {
                    var9.a((byte) 114, 9, bv.field_p);
                    ((jn) this).a((byte) -122, (fd) (Object) var9);
                    return;
                  }
                } else {
                  var9.a((byte) 94, 7, ha.field_J);
                  ((jn) this).a((byte) -122, (fd) (Object) var9);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_rb = new r();
    }
}
