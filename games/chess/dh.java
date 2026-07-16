/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    private int field_a;
    private String field_f;
    cf field_b;
    static String field_g;
    int field_d;
    private int[] field_e;
    private long field_j;
    String field_i;
    ci field_k;
    static String field_h;
    static int field_c;

    private final boolean b(int param0, int param1, int param2) {
        if (17 == param1) {
          pj.field_h = new pc(((dh) this).field_k.field_U, ((dh) this).field_k.field_wb, ((dh) this).field_k.field_M, ((dh) this).field_k.field_pb, param0, ki.field_P, dc.field_s, gd.field_b, qn.field_P, kj.field_g, sj.field_k, ((dh) this).field_i, ((dh) this).field_j);
          return true;
        } else {
          if (param2 != 13563) {
            field_g = null;
            return false;
          } else {
            return false;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            if (!param1) {
                field_c = -94;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(rh.a(var2, param0, (byte) -87), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(byte param0) {
        if (param0 != -75) {
            return;
        }
        field_h = null;
        field_g = null;
    }

    final void a(int param0, boolean param1) {
        r var4 = null;
        String var5 = null;
        int var6 = 0;
        r var7 = null;
        r var8 = null;
        r var9 = null;
        var6 = Chess.field_G;
        if (param0 != 0) {
          ((dh) this).field_j = 17L;
          if (null != ((dh) this).field_i) {
            if (((dh) this).field_j != gb.field_t) {
              if (pd.field_Rb != null) {
                if (ci.f(-52)) {
                  var9 = ug.a((byte) -86, ((dh) this).field_j);
                  var4 = mi.a(134217727, ((dh) this).field_j);
                  var5 = this.a(28);
                  if (var4 != null) {
                    if (pd.field_Rb.field_Vb) {
                      if (pd.field_Rb.field_pc < 0) {
                        return;
                      } else {
                        ((dh) this).field_b.a((byte) -12, oc.a(am.field_b, new String[1], (byte) -124), 1);
                        return;
                      }
                    } else {
                      ((dh) this).field_b.a((byte) -12, oc.a(am.field_b, new String[1], (byte) -124), 1);
                      return;
                    }
                  } else {
                    if (var9 != null) {
                      if (pd.field_Rb.field_ac) {
                        if (pd.field_Rb.field_Xb < pd.field_Rb.field_hc) {
                          if (!var9.field_ac) {
                            if (param1) {
                              if (!var9.field_Qb) {
                                ((dh) this).field_b.a((byte) -12, oc.a(pi.field_b, new String[1], (byte) -102), 0);
                                return;
                              } else {
                                ((dh) this).field_b.a((byte) -12, oc.a(ub.field_c, new String[1], (byte) -127), 0);
                                ((dh) this).field_b.a((byte) -12, oc.a(w.field_Fb, new String[1], (byte) -81), 1);
                                return;
                              }
                            } else {
                              ((dh) this).field_b.a((byte) -12, oc.a(pi.field_b, new String[1], (byte) -102), 0);
                              return;
                            }
                          } else {
                            ((dh) this).field_b.a((byte) -12, oc.a(sh.field_a, new String[1], (byte) -92), 1);
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
          if (null != ((dh) this).field_i) {
            if (((dh) this).field_j != gb.field_t) {
              if (pd.field_Rb != null) {
                if (ci.f(-52)) {
                  var8 = ug.a((byte) -86, ((dh) this).field_j);
                  var7 = var8;
                  var4 = mi.a(134217727, ((dh) this).field_j);
                  var5 = this.a(28);
                  if (var4 != null) {
                    if (pd.field_Rb.field_Vb) {
                      if (pd.field_Rb.field_pc < 0) {
                        return;
                      } else {
                        ((dh) this).field_b.a((byte) -12, oc.a(am.field_b, new String[1], (byte) -124), 1);
                        return;
                      }
                    } else {
                      ((dh) this).field_b.a((byte) -12, oc.a(am.field_b, new String[1], (byte) -124), 1);
                      return;
                    }
                  } else {
                    if (var8 != null) {
                      if (pd.field_Rb.field_ac) {
                        if (pd.field_Rb.field_Xb < pd.field_Rb.field_hc) {
                          if (!var8.field_ac) {
                            if (param1) {
                              if (!var8.field_Qb) {
                                ((dh) this).field_b.a((byte) -12, oc.a(pi.field_b, new String[1], (byte) -102), 0);
                                return;
                              } else {
                                ((dh) this).field_b.a((byte) -12, oc.a(ub.field_c, new String[1], (byte) -127), 0);
                                ((dh) this).field_b.a((byte) -12, oc.a(w.field_Fb, new String[1], (byte) -81), 1);
                                return;
                              }
                            } else {
                              ((dh) this).field_b.a((byte) -12, oc.a(pi.field_b, new String[1], (byte) -102), 0);
                              return;
                            }
                          } else {
                            ((dh) this).field_b.a((byte) -12, oc.a(sh.field_a, new String[1], (byte) -92), 1);
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

    final static void a(int param0, j param1) {
        int var2 = 22 / ((35 - param0) / 41);
        param1.field_s = new char[]{(char)63};
        param1.field_t = new int[]{-1};
    }

    private final boolean d(int param0, int param1, int param2) {
        int var5 = 0;
        var5 = Chess.field_G;
        if (param1 > 63) {
          if (-9 != (param0 ^ -1)) {
            if ((param0 ^ -1) != -19) {
              if (param0 != 11) {
                if ((param0 ^ -1) != -13) {
                  if (13 != param0) {
                    if (-15 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -21) {
                        if ((param0 ^ -1) == -20) {
                          boolean discarded$1 = fl.a(((dh) this).field_e, ((dh) this).field_j, ((dh) this).field_a, ((dh) this).field_i, (byte) 113);
                          return true;
                        } else {
                          return false;
                        }
                      } else {
                        sh.a(false);
                        return true;
                      }
                    } else {
                      jg.n(-66);
                      return true;
                    }
                  } else {
                    oj.a(((dh) this).field_a, (byte) -99, 2, param2);
                    return true;
                  }
                } else {
                  oj.a(((dh) this).field_a, (byte) -99, 1, param2);
                  return true;
                }
              } else {
                oj.a(((dh) this).field_a, (byte) -99, 0, param2);
                return true;
              }
            } else {
              lj.a(((dh) this).field_i, ((dh) this).field_j, 112);
              return true;
            }
          } else {
            wg.a(((dh) this).field_i, (byte) -118, ((dh) this).field_j);
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, ld param1) {
        int var3 = 0;
        if (param1.field_d) {
          return;
        } else {
          ((dh) this).field_a = param1.field_k;
          if (0 == param1.field_k) {
            if (sg.field_d != 0) {
              ((dh) this).field_b.a((byte) -12, ua.field_e, 13);
              var3 = -49 % ((param0 - 3) / 36);
              if (param1.field_k == 1) {
                if (-1 != (ii.field_Q ^ -1)) {
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  if (param1.field_k == 2) {
                    if (-1 != (v.field_d ^ -1)) {
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    } else {
                      ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((dh) this).field_b.a((byte) -12, nk.field_v, 12);
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  if (param1.field_k == 2) {
                    if (-1 != (v.field_d ^ -1)) {
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    } else {
                      ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (param1.field_k == 2) {
                  if (-1 != (v.field_d ^ -1)) {
                    ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                    return;
                  } else {
                    ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                    ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              ((dh) this).field_b.a((byte) -12, dl.field_m, 12);
              ((dh) this).field_b.a((byte) -12, ua.field_e, 13);
              var3 = -49 % ((param0 - 3) / 36);
              if (param1.field_k == 1) {
                if (-1 != (ii.field_Q ^ -1)) {
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  if (param1.field_k == 2) {
                    if (-1 != (v.field_d ^ -1)) {
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    } else {
                      ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((dh) this).field_b.a((byte) -12, nk.field_v, 12);
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  if (param1.field_k == 2) {
                    if (-1 != (v.field_d ^ -1)) {
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    } else {
                      ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                      ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (param1.field_k == 2) {
                  if (-1 != (v.field_d ^ -1)) {
                    ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                    return;
                  } else {
                    ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                    ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L0: {
              var3 = -49 % ((param0 - 3) / 36);
              if (param1.field_k == 1) {
                if (-1 != (ii.field_Q ^ -1)) {
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  break L0;
                } else {
                  ((dh) this).field_b.a((byte) -12, nk.field_v, 12);
                  ((dh) this).field_b.a((byte) -12, un.field_i, 13);
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (param1.field_k == 2) {
              if (-1 != (v.field_d ^ -1)) {
                ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                return;
              } else {
                ((dh) this).field_b.a((byte) -12, wf.field_X, 12);
                ((dh) this).field_b.a((byte) -12, in.field_e, 13);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void c(byte param0) {
        hh var1 = null;
        nk var2 = null;
        var1 = (hh) (Object) eh.field_R.g(-18110);
        if (var1 != null) {
          var2 = tk.field_h;
          int discarded$34 = var2.e((byte) -96);
          int discarded$35 = var2.e((byte) -92);
          int discarded$36 = var2.e((byte) -99);
          if (param0 != 49) {
            field_c = -36;
            int discarded$37 = var2.e((byte) -109);
            var1.c(-2193);
            return;
          } else {
            int discarded$38 = var2.e((byte) -109);
            var1.c(-2193);
            return;
          }
        } else {
          si.d(65280);
          return;
        }
    }

    final void b(int param0, boolean param1) {
        ((dh) this).field_b.a(false, param1);
        if (param0 > -58) {
            ((dh) this).field_f = null;
        }
    }

    final void a(int param0, int[] param1, int param2) {
        String var4 = null;
        ve var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        if (((dh) this).field_i != null) {
          if ((((dh) this).field_j ^ -1L) == (gb.field_t ^ -1L)) {
            if (param2 == 2) {
              L0: {
                if (-3 == (ld.field_g ^ -1)) {
                  L1: {
                    var8 = this.a(param0 + 106);
                    var4 = var8;
                    var5 = mn.a(param0 + -18, ((dh) this).field_i);
                    var6 = va.a(((dh) this).field_i, -19554) ? 1 : 0;
                    if (var5 != null) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        ((dh) this).field_b.a((byte) -12, oc.a(jl.field_a, new String[1], (byte) -71), 4);
                        ((dh) this).field_b.a((byte) -12, oc.a(bb.field_c, new String[1], (byte) -62), 6);
                        if (param1 == null) {
                          break L1;
                        } else {
                          if (-3 == (param2 ^ -1)) {
                            break L1;
                          } else {
                            if (qf.field_b) {
                              break L1;
                            } else {
                              ((dh) this).field_e = param1;
                              ((dh) this).field_b.a((byte) -12, oc.a(ci.field_x, new String[1], (byte) -93), 19);
                              break L1;
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  if (var5 != null) {
                    if (am.a(false, ((dh) this).field_i)) {
                      L2: {
                        ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                        if (var6 != 0) {
                          ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      if (param0 != 17) {
                        var7 = null;
                        dh.a(29, -33, -123, 35, (p) null);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (!qf.field_b) {
                        if (kh.field_o) {
                          ((dh) this).field_b.a((byte) -12, oc.a(nd.field_b, new String[1], (byte) -89), 18);
                          if (param1 == null) {
                            L3: {
                              ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                              if (var6 != 0) {
                                ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (param0 != 17) {
                              var7 = null;
                              dh.a(29, -33, -123, 35, (p) null);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            ((dh) this).field_e = param1;
                            ((dh) this).field_b.a((byte) -12, oc.a(ci.field_x, new String[1], (byte) -62), 19);
                            L4: {
                              ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                              if (var6 != 0) {
                                ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            if (param0 != 17) {
                              var7 = null;
                              dh.a(29, -33, -123, 35, (p) null);
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          ((dh) this).field_b.a((byte) -12, oc.a(bc.field_c, new String[1], (byte) -57), 8);
                          ((dh) this).field_b.a((byte) -12, oc.a(nd.field_b, new String[1], (byte) -89), 18);
                          if (param1 == null) {
                            L5: {
                              ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                              if (var6 != 0) {
                                ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (param0 == 17) {
                                break L6;
                              } else {
                                var7 = null;
                                dh.a(29, -33, -123, 35, (p) null);
                                break L6;
                              }
                            }
                            return;
                          } else {
                            ((dh) this).field_e = param1;
                            ((dh) this).field_b.a((byte) -12, oc.a(ci.field_x, new String[1], (byte) -62), 19);
                            L7: {
                              ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                              if (var6 != 0) {
                                ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (param0 == 17) {
                                break L8;
                              } else {
                                var7 = null;
                                dh.a(29, -33, -123, 35, (p) null);
                                break L8;
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L9: {
                          ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                          if (var6 != 0) {
                            ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        if (param0 != 17) {
                          var7 = null;
                          dh.a(29, -33, -123, 35, (p) null);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    if (var6 != 0) {
                      ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                      break L0;
                    } else {
                      if (param0 != 17) {
                        var7 = null;
                        dh.a(29, -33, -123, 35, (p) null);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param0 == 17) {
                return;
              } else {
                var7 = null;
                dh.a(29, -33, -123, 35, (p) null);
                return;
              }
            } else {
              if (param0 != 17) {
                var7 = null;
                dh.a(29, -33, -123, 35, (p) null);
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (-3 == (ld.field_g ^ -1)) {
                L11: {
                  var8 = this.a(param0 + 106);
                  var4 = var8;
                  var5 = mn.a(param0 + -18, ((dh) this).field_i);
                  var6 = va.a(((dh) this).field_i, -19554) ? 1 : 0;
                  if (var5 != null) {
                    break L11;
                  } else {
                    if (var6 == 0) {
                      ((dh) this).field_b.a((byte) -12, oc.a(jl.field_a, new String[1], (byte) -71), 4);
                      ((dh) this).field_b.a((byte) -12, oc.a(bb.field_c, new String[1], (byte) -62), 6);
                      if (param1 == null) {
                        break L11;
                      } else {
                        if (-3 == (param2 ^ -1)) {
                          break L11;
                        } else {
                          if (qf.field_b) {
                            break L11;
                          } else {
                            ((dh) this).field_e = param1;
                            ((dh) this).field_b.a((byte) -12, oc.a(ci.field_x, new String[1], (byte) -93), 19);
                            break L11;
                          }
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                }
                if (var5 != null) {
                  if (!am.a(false, ((dh) this).field_i)) {
                    if (!qf.field_b) {
                      L12: {
                        if (kh.field_o) {
                          break L12;
                        } else {
                          ((dh) this).field_b.a((byte) -12, oc.a(bc.field_c, new String[1], (byte) -57), 8);
                          break L12;
                        }
                      }
                      ((dh) this).field_b.a((byte) -12, oc.a(nd.field_b, new String[1], (byte) -89), 18);
                      if (param1 != null) {
                        ((dh) this).field_e = param1;
                        ((dh) this).field_b.a((byte) -12, oc.a(ci.field_x, new String[1], (byte) -62), 19);
                        L13: {
                          ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                          if (var6 != 0) {
                            ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (param0 == 17) {
                            break L14;
                          } else {
                            var7 = null;
                            dh.a(29, -33, -123, 35, (p) null);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                          if (var6 != 0) {
                            ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        L16: {
                          if (param0 == 17) {
                            break L16;
                          } else {
                            var7 = null;
                            dh.a(29, -33, -123, 35, (p) null);
                            break L16;
                          }
                        }
                        return;
                      }
                    } else {
                      L17: {
                        ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                        if (var6 != 0) {
                          ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (param0 == 17) {
                          break L18;
                        } else {
                          var7 = null;
                          dh.a(29, -33, -123, 35, (p) null);
                          break L18;
                        }
                      }
                      return;
                    }
                  } else {
                    L19: {
                      ((dh) this).field_b.a((byte) -12, oc.a(un.field_h, new String[1], (byte) -100), 5);
                      if (var6 != 0) {
                        ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (param0 == 17) {
                        break L20;
                      } else {
                        var7 = null;
                        dh.a(29, -33, -123, 35, (p) null);
                        break L20;
                      }
                    }
                    return;
                  }
                } else {
                  if (var6 != 0) {
                    ((dh) this).field_b.a((byte) -12, oc.a(tb.field_b, new String[1], (byte) -119), 7);
                    break L10;
                  } else {
                    L21: {
                      if (param0 == 17) {
                        break L21;
                      } else {
                        var7 = null;
                        dh.a(29, -33, -123, 35, (p) null);
                        break L21;
                      }
                    }
                    return;
                  }
                }
              } else {
                break L10;
              }
            }
            if (param0 != 17) {
              var7 = null;
              dh.a(29, -33, -123, 35, (p) null);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 17) {
            var7 = null;
            dh.a(29, -33, -123, 35, (p) null);
            return;
          } else {
            return;
          }
        }
    }

    final boolean a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        Object var7 = null;
        var6 = ((dh) this).field_b.a(param1, -19);
        if ((var6 ^ -1) == 1) {
          return false;
        } else {
          boolean discarded$7 = this.a(5069, var6, param0);
          if (param4 != -11) {
            var7 = null;
            dh.a(113, (j) null);
            boolean discarded$8 = this.a(false, var6, param2);
            boolean discarded$9 = this.d(var6, param4 + 120, param2);
            boolean discarded$10 = this.b(param3, var6, 13563);
            return true;
          } else {
            boolean discarded$11 = this.a(false, var6, param2);
            boolean discarded$12 = this.d(var6, param4 + 120, param2);
            boolean discarded$13 = this.b(param3, var6, 13563);
            return true;
          }
        }
    }

    final void b(byte param0) {
        String var3 = null;
        int var4 = 0;
        ln var5 = null;
        var4 = Chess.field_G;
        if (param0 < -67) {
          if (null == pd.field_Rb) {
            var5 = bk.a(-118, ((dh) this).field_d);
            if (var5 != null) {
              var3 = var5.field_Gb;
              if (!var5.field_dc) {
                if (var5.field_Pb) {
                  ((dh) this).field_b.a((byte) -12, oc.a(lj.field_d, new String[1], (byte) -46), 2);
                  if (var5.field_Tb) {
                    ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!var5.field_Tb) {
                    if (var5.field_ac) {
                      if (var5.field_Vb) {
                        if (!var5.field_Pb) {
                          if (var5.field_Tb) {
                            ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((dh) this).field_b.a((byte) -12, oc.a(ki.field_O, new String[1], (byte) -68), 2);
                          if (var5.field_Tb) {
                            ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        ((dh) this).field_b.a((byte) -12, oc.a(ki.field_O, new String[1], (byte) -68), 2);
                        if (var5.field_Tb) {
                          ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (var5.field_Tb) {
                        ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (var5.field_Tb) {
                      ((dh) this).field_b.a((byte) -12, oc.a(qa.field_g, new String[1], (byte) -96), 3);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                ((dh) this).field_b.a((byte) -12, oc.a(sj.field_p, new String[1], (byte) -76), 2);
                ((dh) this).field_b.a((byte) -12, oc.a(kh.field_p, new String[1], (byte) -101), 3);
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

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        var4 = Chess.field_G;
        var5 = lc.field_n;
        var1 = var5;
        var2 = 0;
        var3 = var5.length;
        L0: while (true) {
          if (var3 <= var2) {
            if (param0 <= 61) {
              dh.d((byte) 5);
              return;
            } else {
              return;
            }
          } else {
            int incrementValue$16 = var2;
            var2++;
            var5[incrementValue$16] = 0;
            int incrementValue$17 = var2;
            var2++;
            var5[incrementValue$17] = 0;
            int incrementValue$18 = var2;
            var2++;
            var5[incrementValue$18] = 0;
            int incrementValue$19 = var2;
            var2++;
            var5[incrementValue$19] = 0;
            int incrementValue$20 = var2;
            var2++;
            var5[incrementValue$20] = 0;
            int incrementValue$21 = var2;
            var2++;
            var5[incrementValue$21] = 0;
            int incrementValue$22 = var2;
            var2++;
            var5[incrementValue$22] = 0;
            int incrementValue$23 = var2;
            var2++;
            var5[incrementValue$23] = 0;
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, p param4) {
        param4.c(12, (byte) -81);
        param4.b(17, 91);
        param4.b(param0, param1 + 78);
        param4.b(param2, param1 ^ 118);
        if (param1 != 11) {
          return;
        } else {
          param4.c(param3, (byte) 109);
          return;
        }
    }

    final void d(int param0) {
        String var2 = null;
        Object var3 = null;
        String var4 = null;
        if (param0 >= -6) {
          L0: {
            var3 = null;
            dh.a(57, (j) null);
            if (((dh) this).field_i == null) {
              break L0;
            } else {
              if (((dh) this).field_j == gb.field_t) {
                break L0;
              } else {
                var4 = this.a(72);
                var2 = var4;
                ((dh) this).field_b.a((byte) -12, oc.a(oh.field_c, new String[1], (byte) -127), 17);
                break L0;
              }
            }
          }
          return;
        } else {
          L1: {
            if (((dh) this).field_i == null) {
              break L1;
            } else {
              if (((dh) this).field_j == gb.field_t) {
                break L1;
              } else {
                var4 = this.a(72);
                var2 = var4;
                ((dh) this).field_b.a((byte) -12, oc.a(oh.field_c, new String[1], (byte) -127), 17);
                break L1;
              }
            }
          }
          return;
        }
    }

    private final static void c(int param0, int param1, int param2) {
        nk var4 = null;
        ln var6 = null;
        ln var7 = null;
        if (param2 == cn.field_g) {
          if (param0 <= 107) {
            field_g = null;
            return;
          } else {
            return;
          }
        } else {
          var6 = (ln) (Object) ae.field_f.a((long)cn.field_g, 3000);
          var7 = var6;
          cn.field_g = param2;
          if (var7 == null) {
            var4 = qn.field_U;
            var4.f(param1, -94);
            var4.c(3, (byte) 82);
            var4.c(11, (byte) 76);
            var4.b(param2, 117);
            if (param0 > 107) {
              return;
            } else {
              field_g = null;
              return;
            }
          } else {
            var7.field_ec = null;
            var4 = qn.field_U;
            var4.f(param1, -94);
            var4.c(3, (byte) 82);
            var4.c(11, (byte) 76);
            var4.b(param2, 117);
            if (param0 > 107) {
              return;
            } else {
              field_g = null;
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var5 = Chess.field_G;
        if (param0 != 5069) {
            return false;
        }
        if (param1 == 0) {
            ue.a(((dh) this).field_j, 16581, param2);
        } else {
            if (-2 == (param1 ^ -1)) {
                fd.a(param2, -125, ((dh) this).field_j);
                return true;
            }
            if (-3 == (param1 ^ -1)) {
                fj.a(param2, 3, ((dh) this).field_d);
                return true;
            }
            if (-4 != (param1 ^ -1)) {
                if (10 != param1) {
                    if (param1 != 15) {
                        if (16 != param1) {
                            return false;
                        }
                        dh.c(113, param2, 0);
                        return true;
                    }
                    dh.c(114, param2, ((dh) this).field_d);
                    return true;
                }
                la.a(param2, (byte) 127, ((dh) this).field_d);
                return true;
            }
            db.a(param2, ((dh) this).field_d, param0 ^ 32284);
            return true;
        }
        return true;
    }

    final boolean b(int param0) {
        if (param0 == 4) {
          if (((dh) this).field_b != null) {
            if (!((dh) this).field_b.l(3)) {
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

    private final boolean a(boolean param0, int param1, int param2) {
        Object var4 = null;
        Object var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        if (!param0) {
          var4 = null;
          if (-5 != (param1 ^ -1)) {
            if (5 != param1) {
              if (-7 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -8) {
                  return false;
                } else {
                  L0: {
                    var8 = of.a(((dh) this).field_f, param2, ((dh) this).field_i, -1);
                    if (var8 != null) {
                      var5 = null;
                      lc.a(((dh) this).field_i, (String) null, 2, 0, var8, false);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return true;
                }
              } else {
                L1: {
                  var7 = a.a(param2, ((dh) this).field_i, (byte) 64);
                  if (var7 != null) {
                    var5 = null;
                    lc.a(((dh) this).field_i, (String) null, 2, 0, var7, false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return true;
              }
            } else {
              L2: {
                var9 = ab.a(param2, 21250, ((dh) this).field_i);
                if (var9 != null) {
                  var5 = null;
                  lc.a(((dh) this).field_i, (String) null, 2, 0, var9, false);
                  break L2;
                } else {
                  break L2;
                }
              }
              return true;
            }
          } else {
            var6 = hf.a(param2, 107, ((dh) this).field_i);
            if (var6 == null) {
              return true;
            } else {
              var5 = null;
              lc.a(((dh) this).field_i, (String) null, 2, 0, var6, false);
              return true;
            }
          }
        } else {
          return true;
        }
    }

    private final String a(int param0) {
        String var2 = null;
        if (param0 <= 17) {
          L0: {
            ((dh) this).field_d = -57;
            if (((dh) this).field_f != null) {
              var2 = ((dh) this).field_f;
              break L0;
            } else {
              var2 = ((dh) this).field_i;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (((dh) this).field_f != null) {
              var2 = ((dh) this).field_f;
              break L1;
            } else {
              var2 = ((dh) this).field_i;
              break L1;
            }
          }
          return var2;
        }
    }

    final static void c(int param0) {
        if (-11 == (rm.field_Q ^ -1)) {
          sh.a((byte) -59);
          rm.field_Q = 11;
          if (param0 != 12) {
            return;
          } else {
            gg.field_n = true;
            return;
          }
        } else {
          if (!tb.a((byte) 87)) {
            sh.a((byte) -59);
            rm.field_Q = 11;
            if (param0 != 12) {
              return;
            } else {
              gg.field_n = true;
              return;
            }
          } else {
            if (param0 != 12) {
              return;
            } else {
              gg.field_n = true;
              return;
            }
          }
        }
    }

    dh(ci param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((dh) this).field_b = new cf(bd.field_a);
        ((dh) this).field_j = param1;
        ((dh) this).field_a = param5;
        param0.field_gb = true;
        ((dh) this).field_e = param6;
        ((dh) this).field_k = param0;
        ((dh) this).field_f = param3;
        ((dh) this).field_i = param2;
        ((dh) this).field_d = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Discard";
        field_g = "<%0> is already on your ignore list.";
    }
}
