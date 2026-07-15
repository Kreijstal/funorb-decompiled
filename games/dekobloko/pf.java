/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pf {
    private String field_m;
    gb field_h;
    private int[] field_j;
    static volatile int field_g;
    w field_l;
    private int field_a;
    String field_b;
    static String[] field_k;
    private long field_e;
    static String field_c;
    static int[] field_i;
    static byte[] field_d;
    int field_f;

    final void a(int param0) {
        String var2 = null;
        String var3 = null;
        L0: {
          if (((pf) this).field_b == null) {
            break L0;
          } else {
            if (((pf) this).field_e != uc.field_g) {
              var3 = this.d(-116);
              var2 = var3;
              ((pf) this).field_h.a(cm.a((byte) 104, li.field_f, new String[1]), 17, param0 ^ 89);
              break L0;
            } else {
              if (param0 == 17) {
                return;
              } else {
                field_k = null;
                return;
              }
            }
          }
        }
        if (param0 != 17) {
          field_k = null;
          return;
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        Object var3 = null;
        if (param0 == -3) {
          if (null != ((pf) this).field_h) {
            if (!((pf) this).field_h.f(30)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var3 = null;
          pf.a((java.applet.Applet) null, (String) null, 28L, (byte) 102, (String) null);
          if (null != ((pf) this).field_h) {
            if (!((pf) this).field_h.f(30)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param0 != (param1 ^ -1)) {
          return false;
        } else {
          pd.field_f = new mg(((pf) this).field_l.field_E, ((pf) this).field_l.field_pb, ((pf) this).field_l.field_mb, ((pf) this).field_l.field_N, param2, ui.field_x, tg.field_h, ib.field_nb, ua.field_H, al.field_h, df.field_ab, ((pf) this).field_b, ((pf) this).field_e);
          return true;
        }
    }

    final void a(byte param0, boolean param1) {
        if (param0 < 25) {
          ((pf) this).a((byte) 114, true);
          ((pf) this).field_h.a(1141039778, param1);
          return;
        } else {
          ((pf) this).field_h.a(1141039778, param1);
          return;
        }
    }

    private final boolean a(int param0, boolean param1, int param2) {
        int var5 = client.field_A ? 1 : 0;
        if (!param1) {
            return true;
        }
        if (0 == param2) {
            bn.a(((pf) this).field_e, param0, (byte) -84);
        } else {
            if (1 != param2) {
                if ((param2 ^ -1) == -3) {
                    cg.a(((pf) this).field_f, (byte) -9, param0);
                    return true;
                }
                if (-4 == (param2 ^ -1)) {
                    md.a(9, param0, ((pf) this).field_f);
                    return true;
                }
                if (param2 != 10) {
                    if (param2 != 15) {
                        if (param2 == 16) {
                            vg.a(-20974, param0, 0);
                            return true;
                        }
                        return false;
                    }
                    vg.a(-20974, param0, ((pf) this).field_f);
                    return true;
                }
                ga.a(false, ((pf) this).field_f, param0);
                return true;
            }
            mn.a(param1, ((pf) this).field_e, param0);
            return true;
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        tj var4 = null;
        String var5 = null;
        int var6 = 0;
        tj var7 = null;
        var6 = client.field_A ? 1 : 0;
        if (param1 != 29072) {
          pf.a(false);
          if (null != ((pf) this).field_b) {
            if (((pf) this).field_e != uc.field_g) {
              if (cd.field_m != null) {
                if (ig.b(true)) {
                  var7 = ma.a(-105, ((pf) this).field_e);
                  var4 = bj.a(((pf) this).field_e, (byte) 58);
                  var5 = this.d(-124);
                  if (var4 != null) {
                    if (cd.field_m.field_lc) {
                      if (0 <= cd.field_m.field_Nb) {
                        ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                      return;
                    }
                  } else {
                    if (var7 != null) {
                      if (cd.field_m.field_wc) {
                        if (cd.field_m.field_rc < cd.field_m.field_mc) {
                          if (!var7.field_bc) {
                            if (param0) {
                              if (!var7.field_fc) {
                                ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                return;
                              } else {
                                ((pf) this).field_h.a(cm.a((byte) 101, jh.field_g, new String[1]), 0, -124);
                                ((pf) this).field_h.a(cm.a((byte) 108, df.field_T, new String[1]), 1, param1 ^ -29114);
                                return;
                              }
                            } else {
                              ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                              return;
                            }
                          } else {
                            ((pf) this).field_h.a(cm.a((byte) 93, vm.field_p, new String[1]), 1, 64);
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
          if (null != ((pf) this).field_b) {
            if (((pf) this).field_e != uc.field_g) {
              if (cd.field_m != null) {
                if (ig.b(true)) {
                  var7 = ma.a(-105, ((pf) this).field_e);
                  var4 = bj.a(((pf) this).field_e, (byte) 58);
                  var5 = this.d(-124);
                  if (var4 != null) {
                    if (cd.field_m.field_lc) {
                      if (0 <= cd.field_m.field_Nb) {
                        ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((pf) this).field_h.a(cm.a((byte) 106, un.field_c, new String[1]), 1, -20);
                      return;
                    }
                  } else {
                    if (var7 != null) {
                      if (cd.field_m.field_wc) {
                        if (cd.field_m.field_rc < cd.field_m.field_mc) {
                          if (!var7.field_bc) {
                            if (param0) {
                              if (!var7.field_fc) {
                                ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                                return;
                              } else {
                                ((pf) this).field_h.a(cm.a((byte) 101, jh.field_g, new String[1]), 0, -124);
                                ((pf) this).field_h.a(cm.a((byte) 108, df.field_T, new String[1]), 1, param1 ^ -29114);
                                return;
                              }
                            } else {
                              ((pf) this).field_h.a(cm.a((byte) 92, lj.field_b, new String[1]), 0, -30);
                              return;
                            }
                          } else {
                            ((pf) this).field_h.a(cm.a((byte) 93, vm.field_p, new String[1]), 1, 64);
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

    final void b(int param0) {
        String var3 = null;
        int var4 = 0;
        ve var5 = null;
        var4 = client.field_A ? 1 : 0;
        if (cd.field_m == null) {
          var5 = ob.a(((pf) this).field_f, 8);
          if (var5 != null) {
            var3 = var5.field_Vb;
            if (var5.field_Zb) {
              ((pf) this).field_h.a(cm.a((byte) 124, di.field_C, new String[1]), 2, 73);
              ((pf) this).field_h.a(cm.a((byte) 89, hl.field_b, new String[1]), 3, 126);
              if (param0 <= -71) {
                return;
              } else {
                ((pf) this).field_f = -11;
                return;
              }
            } else {
              if (!var5.field_gc) {
                if (!var5.field_Ob) {
                  if (var5.field_wc) {
                    if (!var5.field_lc) {
                      ((pf) this).field_h.a(cm.a((byte) 114, u.field_d, new String[1]), 2, -93);
                      if (var5.field_Ob) {
                        ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                        if (param0 <= -71) {
                          return;
                        } else {
                          ((pf) this).field_f = -11;
                          return;
                        }
                      } else {
                        if (param0 > -71) {
                          ((pf) this).field_f = -11;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (var5.field_gc) {
                        L0: {
                          ((pf) this).field_h.a(cm.a((byte) 114, u.field_d, new String[1]), 2, -93);
                          if (var5.field_Ob) {
                            ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                        if (param0 > -71) {
                          ((pf) this).field_f = -11;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        if (var5.field_Ob) {
                          ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                          if (param0 > -71) {
                            ((pf) this).field_f = -11;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          if (param0 > -71) {
                            ((pf) this).field_f = -11;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (var5.field_Ob) {
                      ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                      if (param0 > -71) {
                        ((pf) this).field_f = -11;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 > -71) {
                        ((pf) this).field_f = -11;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (!var5.field_Ob) {
                    L1: {
                      if (param0 <= -71) {
                        break L1;
                      } else {
                        ((pf) this).field_f = -11;
                        break L1;
                      }
                    }
                    return;
                  } else {
                    L2: {
                      ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                      if (param0 <= -71) {
                        break L2;
                      } else {
                        ((pf) this).field_f = -11;
                        break L2;
                      }
                    }
                    return;
                  }
                }
              } else {
                ((pf) this).field_h.a(cm.a((byte) 119, fl.field_c, new String[1]), 2, -98);
                if (var5.field_Ob) {
                  ((pf) this).field_h.a(cm.a((byte) 120, fj.field_j, new String[1]), 3, -110);
                  if (param0 <= -71) {
                    return;
                  } else {
                    ((pf) this).field_f = -11;
                    return;
                  }
                } else {
                  if (param0 <= -71) {
                    return;
                  } else {
                    ((pf) this).field_f = -11;
                    return;
                  }
                }
              }
            }
          } else {
            if (param0 <= -71) {
              return;
            } else {
              ((pf) this).field_f = -11;
              return;
            }
          }
        } else {
          if (param0 > -71) {
            ((pf) this).field_f = -11;
            return;
          } else {
            return;
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (param2 != -92) {
          ((pf) this).field_h = null;
          if (-9 != (param0 ^ -1)) {
            if (param0 != 18) {
              if (param0 == 11) {
                eg.a(((pf) this).field_a, param1, 0, (byte) 73);
                return true;
              } else {
                if (-13 != (param0 ^ -1)) {
                  if ((param0 ^ -1) == -14) {
                    eg.a(((pf) this).field_a, param1, 2, (byte) 91);
                    return true;
                  } else {
                    if (14 == param0) {
                      ke.o(0);
                      return true;
                    } else {
                      if ((param0 ^ -1) == -21) {
                        aj.a(-1045);
                        return true;
                      } else {
                        if (-20 != (param0 ^ -1)) {
                          return false;
                        } else {
                          boolean discarded$2 = vm.a(((pf) this).field_j, ((pf) this).field_e, ((pf) this).field_b, param2 + -28, ((pf) this).field_a);
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  eg.a(((pf) this).field_a, param1, 1, (byte) 91);
                  return true;
                }
              }
            } else {
              pn.a(38, ((pf) this).field_e, ((pf) this).field_b);
              return true;
            }
          } else {
            u.a((byte) 115, ((pf) this).field_b, ((pf) this).field_e);
            return true;
          }
        } else {
          if (-9 != (param0 ^ -1)) {
            if (param0 != 18) {
              if (param0 == 11) {
                eg.a(((pf) this).field_a, param1, 0, (byte) 73);
                return true;
              } else {
                if (-13 != (param0 ^ -1)) {
                  if ((param0 ^ -1) == -14) {
                    eg.a(((pf) this).field_a, param1, 2, (byte) 91);
                    return true;
                  } else {
                    if (14 == param0) {
                      ke.o(0);
                      return true;
                    } else {
                      if ((param0 ^ -1) == -21) {
                        aj.a(-1045);
                        return true;
                      } else {
                        if (-20 != (param0 ^ -1)) {
                          return false;
                        } else {
                          boolean discarded$3 = vm.a(((pf) this).field_j, ((pf) this).field_e, ((pf) this).field_b, param2 + -28, ((pf) this).field_a);
                          return true;
                        }
                      }
                    }
                  }
                } else {
                  eg.a(((pf) this).field_a, param1, 1, (byte) 91);
                  return true;
                }
              }
            } else {
              pn.a(38, ((pf) this).field_e, ((pf) this).field_b);
              return true;
            }
          } else {
            u.a((byte) 115, ((pf) this).field_b, ((pf) this).field_e);
            return true;
          }
        }
    }

    final static void a(java.applet.Applet param0, String param1, long param2, byte param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param0.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param1 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param3 > 87) {
                  L1: {
                    if (-1L >= (param2 ^ -1L)) {
                      var7 = var9 + "; Expires=" + uf.a((byte) 60, param2 * 1000L + ik.a(4)) + "; Max-Age=" + param2;
                      break L1;
                    } else {
                      var7 = var9 + "; Discard;";
                      break L1;
                    }
                  }
                  nc.a((byte) -51, param0, "document.cookie=\"" + var7 + "\"");
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var6 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String d(int param0) {
        String var2 = null;
        L0: {
          if (((pf) this).field_m == null) {
            var2 = ((pf) this).field_b;
            break L0;
          } else {
            var2 = ((pf) this).field_m;
            break L0;
          }
        }
        if (param0 > -65) {
          field_i = null;
          return var2;
        } else {
          return var2;
        }
    }

    final static String a(char param0, byte param1) {
        if (param1 != -9) {
            field_k = null;
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public static void a(byte param0) {
        field_k = null;
        field_d = null;
        field_c = null;
        int var1 = 3 / ((-2 - param0) / 52);
        field_i = null;
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = ((pf) this).field_h.b(-56, param0);
        if (!(var6 != -2)) {
            return false;
        }
        boolean discarded$0 = this.a(param1, true, var6);
        boolean discarded$1 = this.b(param4, var6, param3);
        boolean discarded$2 = this.a(var6, param4, (byte) -92);
        boolean discarded$3 = this.a(param3 ^ -18, var6, param2);
        return true;
    }

    final void a(byte param0, hl param1) {
        if (!param1.field_j) {
          ((pf) this).field_a = param1.field_m;
          if (param1.field_m != 0) {
            if (1 == param1.field_m) {
              if (wh.field_d != 0) {
                L0: {
                  ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                  if (2 != param1.field_m) {
                    break L0;
                  } else {
                    L1: {
                      if (-1 == (wl.field_o ^ -1)) {
                        ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((pf) this).field_h.a(ci.field_g, 13, -77);
                    break L0;
                  }
                }
                if (param0 != -51) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                ((pf) this).field_h.a(ai.field_L, 12, param0 + 126);
                L2: {
                  ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                  if (2 != param1.field_m) {
                    break L2;
                  } else {
                    L3: {
                      if (-1 == (wl.field_o ^ -1)) {
                        ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((pf) this).field_h.a(ci.field_g, 13, -77);
                    break L2;
                  }
                }
                if (param0 != -51) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L4: {
                if (2 != param1.field_m) {
                  break L4;
                } else {
                  L5: {
                    if (-1 == (wl.field_o ^ -1)) {
                      ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((pf) this).field_h.a(ci.field_g, 13, -77);
                  break L4;
                }
              }
              if (param0 != -51) {
                field_c = null;
                return;
              } else {
                return;
              }
            }
          } else {
            if (qk.field_i != 0) {
              L6: {
                ((pf) this).field_h.a(gf.field_h, 13, -65);
                if (1 == param1.field_m) {
                  if (wh.field_d != 0) {
                    ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                    break L6;
                  } else {
                    ((pf) this).field_h.a(ai.field_L, 12, param0 + 126);
                    ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (2 != param1.field_m) {
                  break L7;
                } else {
                  L8: {
                    if (-1 == (wl.field_o ^ -1)) {
                      ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  ((pf) this).field_h.a(ci.field_g, 13, -77);
                  break L7;
                }
              }
              if (param0 == -51) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              ((pf) this).field_h.a(vg.field_p, 12, 95);
              L9: {
                ((pf) this).field_h.a(gf.field_h, 13, -65);
                if (1 == param1.field_m) {
                  if (wh.field_d != 0) {
                    ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                    break L9;
                  } else {
                    ((pf) this).field_h.a(ai.field_L, 12, param0 + 126);
                    ((pf) this).field_h.a(dk.field_d, 13, param0 + 153);
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              L10: {
                if (2 != param1.field_m) {
                  break L10;
                } else {
                  L11: {
                    if (-1 == (wl.field_o ^ -1)) {
                      ((pf) this).field_h.a(ec.field_j, 12, param0 ^ -10);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((pf) this).field_h.a(ci.field_g, 13, -77);
                  break L10;
                }
              }
              if (param0 == -51) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, byte param1, int[] param2) {
        String var4 = null;
        wb var5 = null;
        int var6 = 0;
        Object var7 = null;
        String var8 = null;
        if (param1 != -43) {
          var7 = null;
          ((pf) this).a(85, (byte) 40, (int[]) null);
          if (((pf) this).field_b != null) {
            L0: {
              if (uc.field_g != ((pf) this).field_e) {
                break L0;
              } else {
                if ((param0 ^ -1) == -3) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            if (jj.field_b == 2) {
              L1: {
                var8 = this.d(-66);
                var4 = var8;
                var5 = ed.a(((pf) this).field_b, (byte) -125);
                var6 = ik.a(((pf) this).field_b, (byte) -118) ? 1 : 0;
                if (var5 != null) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    ((pf) this).field_h.a(cm.a((byte) 93, pl.field_e, new String[1]), 4, param1 + -60);
                    ((pf) this).field_h.a(cm.a((byte) 122, pj.field_G, new String[1]), 6, param1 ^ 12);
                    if (param2 == null) {
                      break L1;
                    } else {
                      if ((param0 ^ -1) == -3) {
                        break L1;
                      } else {
                        if (wc.field_n) {
                          break L1;
                        } else {
                          ((pf) this).field_j = param2;
                          ((pf) this).field_h.a(cm.a((byte) 94, ta.field_h, new String[1]), 19, param1 + -85);
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
                if (wi.a(-119, ((pf) this).field_b)) {
                  ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                  if (var6 != 0) {
                    ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!wc.field_n) {
                    if (wl.field_p) {
                      ((pf) this).field_h.a(cm.a((byte) 124, wa.field_e, new String[1]), 18, 80);
                      if (param2 == null) {
                        ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                        if (var6 == 0) {
                          return;
                        } else {
                          ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                          return;
                        }
                      } else {
                        ((pf) this).field_j = param2;
                        ((pf) this).field_h.a(cm.a((byte) 99, ta.field_h, new String[1]), 19, param1 + 140);
                        ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                        if (var6 == 0) {
                          return;
                        } else {
                          ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                          return;
                        }
                      }
                    } else {
                      ((pf) this).field_h.a(cm.a((byte) 125, ai.field_M, new String[1]), 8, 89);
                      ((pf) this).field_h.a(cm.a((byte) 124, wa.field_e, new String[1]), 18, 80);
                      if (param2 == null) {
                        ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                        if (var6 != 0) {
                          ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((pf) this).field_j = param2;
                        ((pf) this).field_h.a(cm.a((byte) 99, ta.field_h, new String[1]), 19, param1 + 140);
                        L2: {
                          ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                          if (var6 == 0) {
                            break L2;
                          } else {
                            ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                            break L2;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                    if (var6 != 0) {
                      ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (var6 == 0) {
                  return;
                } else {
                  ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
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
          if (((pf) this).field_b != null) {
            L3: {
              if (uc.field_g != ((pf) this).field_e) {
                break L3;
              } else {
                if ((param0 ^ -1) == -3) {
                  break L3;
                } else {
                  return;
                }
              }
            }
            if (jj.field_b == 2) {
              L4: {
                var8 = this.d(-66);
                var4 = var8;
                var5 = ed.a(((pf) this).field_b, (byte) -125);
                var6 = ik.a(((pf) this).field_b, (byte) -118) ? 1 : 0;
                if (var5 != null) {
                  break L4;
                } else {
                  if (var6 == 0) {
                    ((pf) this).field_h.a(cm.a((byte) 93, pl.field_e, new String[1]), 4, param1 + -60);
                    ((pf) this).field_h.a(cm.a((byte) 122, pj.field_G, new String[1]), 6, param1 ^ 12);
                    if (param2 == null) {
                      break L4;
                    } else {
                      if ((param0 ^ -1) == -3) {
                        break L4;
                      } else {
                        if (wc.field_n) {
                          break L4;
                        } else {
                          ((pf) this).field_j = param2;
                          ((pf) this).field_h.a(cm.a((byte) 94, ta.field_h, new String[1]), 19, param1 + -85);
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
              }
              if (var5 != null) {
                if (!wi.a(-119, ((pf) this).field_b)) {
                  if (!wc.field_n) {
                    if (wl.field_p) {
                      ((pf) this).field_h.a(cm.a((byte) 124, wa.field_e, new String[1]), 18, 80);
                      if (param2 != null) {
                        ((pf) this).field_j = param2;
                        ((pf) this).field_h.a(cm.a((byte) 99, ta.field_h, new String[1]), 19, param1 + 140);
                        L5: {
                          ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                          if (var6 == 0) {
                            break L5;
                          } else {
                            ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                            break L5;
                          }
                        }
                        return;
                      } else {
                        L6: {
                          ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                          if (var6 == 0) {
                            break L6;
                          } else {
                            ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        ((pf) this).field_h.a(cm.a((byte) 125, ai.field_M, new String[1]), 8, 89);
                        ((pf) this).field_h.a(cm.a((byte) 124, wa.field_e, new String[1]), 18, 80);
                        if (param2 == null) {
                          ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                          break L7;
                        } else {
                          ((pf) this).field_j = param2;
                          ((pf) this).field_h.a(cm.a((byte) 99, ta.field_h, new String[1]), 19, param1 + 140);
                          ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                          break L7;
                        }
                      }
                      L8: {
                        if (var6 == 0) {
                          break L8;
                        } else {
                          ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                          break L8;
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                      if (var6 == 0) {
                        break L9;
                      } else {
                        ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    ((pf) this).field_h.a(cm.a((byte) 118, cn.field_ab, new String[1]), 5, param1 ^ 102);
                    if (var6 == 0) {
                      break L10;
                    } else {
                      ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                      break L10;
                    }
                  }
                  return;
                }
              } else {
                if (var6 != 0) {
                  ((pf) this).field_h.a(cm.a((byte) 116, oj.field_a, new String[1]), 7, -12);
                  return;
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
    }

    final static void a(boolean param0) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        jh.field_h = stackIn_3_0 != 0;
        if (null != mg.field_bc) {
          L1: {
            mg.field_bc.e(0);
            if (pk.field_r != 0) {
              qk.a((byte) 94);
              break L1;
            } else {
              break L1;
            }
          }
          l.field_f = 0;
          return;
        } else {
          L2: {
            if (pk.field_r != 0) {
              qk.a((byte) 94);
              break L2;
            } else {
              break L2;
            }
          }
          l.field_f = 0;
          return;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        Object var4 = null;
        String var4_ref = null;
        Object var5 = null;
        if (param2 == 0) {
          var4 = null;
          if (4 != param1) {
            if ((param1 ^ -1) == -6) {
              var4_ref = md.a(param0, ((pf) this).field_b, false);
              if (var4_ref != null) {
                var5 = null;
                ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                return true;
              } else {
                return true;
              }
            } else {
              if ((param1 ^ -1) != -7) {
                if (7 == param1) {
                  var4_ref = sg.a(((pf) this).field_b, ((pf) this).field_m, param0, (byte) 126);
                  if (var4_ref != null) {
                    var5 = null;
                    ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                    return true;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                var4_ref = dd.b(((pf) this).field_b, 127, param0);
                if (var4_ref == null) {
                  return true;
                } else {
                  var5 = null;
                  ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79, 2, 0);
                  return true;
                }
              }
            }
          } else {
            var4_ref = rb.a(param0, 0, ((pf) this).field_b);
            if (var4_ref == null) {
              return true;
            } else {
              var5 = null;
              ca.a(((pf) this).field_b, (String) null, var4_ref, (byte) -79, 2, 0);
              return true;
            }
          }
        } else {
          return false;
        }
    }

    pf(w param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((pf) this).field_h = new gb(ik.field_e);
        ((pf) this).field_f = param4;
        ((pf) this).field_l = param0;
        ((pf) this).field_m = param3;
        ((pf) this).field_a = param5;
        param0.field_ab = true;
        ((pf) this).field_b = param2;
        ((pf) this).field_j = param6;
        ((pf) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_i = new int[128];
        field_c = "Year";
        field_d = new byte[]{(byte) 0, (byte) 0, (byte)2, (byte) 1, (byte) 1};
    }
}
