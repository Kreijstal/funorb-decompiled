/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    sn field_j;
    String field_f;
    static String field_a;
    private long field_i;
    private int field_h;
    int field_b;
    private String field_d;
    static cj field_c;
    cj field_e;
    private int[] field_g;
    static String field_k;

    final void b(boolean param0, byte param1) {
        if (param1 < 38) {
            ((jb) this).field_f = null;
            ((jb) this).field_j.c(param0, -1);
            return;
        }
        ((jb) this).field_j.c(param0, -1);
    }

    public static void a(int param0) {
        if (param0 != -2) {
            return;
        }
        field_k = null;
        field_a = null;
        field_c = null;
    }

    private final boolean a(byte param0, int param1, int param2) {
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != 98) {
          ((jb) this).c(123);
          if (-9 == (param1 ^ -1)) {
            gm.a(((jb) this).field_i, ((jb) this).field_f, -1);
            return true;
          } else {
            if ((param1 ^ -1) == -19) {
              fg.a(-16745, ((jb) this).field_i, ((jb) this).field_f);
              return true;
            } else {
              if (11 == param1) {
                kp.a(((jb) this).field_h, param2, 0, true);
                return true;
              } else {
                if (-13 != (param1 ^ -1)) {
                  if ((param1 ^ -1) == -14) {
                    kp.a(((jb) this).field_h, param2, 2, true);
                    return true;
                  } else {
                    if ((param1 ^ -1) == -15) {
                      mg.b(false);
                      return true;
                    } else {
                      if (param1 != 20) {
                        if (param1 != 19) {
                          return false;
                        } else {
                          boolean discarded$2 = na.a(((jb) this).field_g, (byte) -50, ((jb) this).field_f, ((jb) this).field_i, ((jb) this).field_h);
                          return true;
                        }
                      } else {
                        q.a(13151);
                        return true;
                      }
                    }
                  }
                } else {
                  kp.a(((jb) this).field_h, param2, 1, true);
                  return true;
                }
              }
            }
          }
        } else {
          if (-9 == (param1 ^ -1)) {
            gm.a(((jb) this).field_i, ((jb) this).field_f, -1);
            return true;
          } else {
            if ((param1 ^ -1) == -19) {
              fg.a(-16745, ((jb) this).field_i, ((jb) this).field_f);
              return true;
            } else {
              if (11 == param1) {
                kp.a(((jb) this).field_h, param2, 0, true);
                return true;
              } else {
                if (-13 != (param1 ^ -1)) {
                  if ((param1 ^ -1) == -14) {
                    kp.a(((jb) this).field_h, param2, 2, true);
                    return true;
                  } else {
                    if ((param1 ^ -1) == -15) {
                      mg.b(false);
                      return true;
                    } else {
                      if (param1 != 20) {
                        if (param1 != 19) {
                          return false;
                        } else {
                          boolean discarded$3 = na.a(((jb) this).field_g, (byte) -50, ((jb) this).field_f, ((jb) this).field_i, ((jb) this).field_h);
                          return true;
                        }
                      } else {
                        q.a(13151);
                        return true;
                      }
                    }
                  }
                } else {
                  kp.a(((jb) this).field_h, param2, 1, true);
                  return true;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, byte param1) {
        dm var4 = null;
        String var5 = null;
        int var6 = 0;
        dm var7 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null != ((jb) this).field_f) {
          if (((jb) this).field_i != ie.field_sb) {
            if (mh.field_c != null) {
              L0: {
                if (hl.b(0)) {
                  var7 = en.a((byte) 50, ((jb) this).field_i);
                  var4 = vm.a(((jb) this).field_i, (byte) -104);
                  var5 = this.b(-20516);
                  if (var4 == null) {
                    if (var7 == null) {
                      break L0;
                    } else {
                      if (!mh.field_c.field_Wb) {
                        break L0;
                      } else {
                        if ((mh.field_c.field_cc ^ -1) <= (mh.field_c.field_mc ^ -1)) {
                          break L0;
                        } else {
                          if (var7.field_Pb) {
                            ((jb) this).field_j.a((byte) -118, vl.a(bl.field_f, new String[1], 2), 1);
                            if (param1 < -80) {
                              return;
                            } else {
                              ((jb) this).c(-88);
                              return;
                            }
                          } else {
                            if (!param0) {
                              ((jb) this).field_j.a((byte) -118, vl.a(ge.field_qb, new String[1], 2), 0);
                              if (param1 < -80) {
                                return;
                              } else {
                                ((jb) this).c(-88);
                                return;
                              }
                            } else {
                              if (var7.field_Ob) {
                                ((jb) this).field_j.a((byte) -118, vl.a(mq.field_p, new String[1], 2), 0);
                                ((jb) this).field_j.a((byte) -118, vl.a(r.field_g, new String[1], 2), 1);
                                if (param1 < -80) {
                                  return;
                                } else {
                                  ((jb) this).c(-88);
                                  return;
                                }
                              } else {
                                ((jb) this).field_j.a((byte) -118, vl.a(ge.field_qb, new String[1], 2), 0);
                                if (param1 < -80) {
                                  return;
                                } else {
                                  ((jb) this).c(-88);
                                  return;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (mh.field_c.field_Fb) {
                      if (-1 >= (mh.field_c.field_Sb ^ -1)) {
                        ((jb) this).field_j.a((byte) -118, vl.a(lk.field_I, new String[1], 2), 1);
                        if (param1 < -80) {
                          return;
                        } else {
                          ((jb) this).c(-88);
                          return;
                        }
                      } else {
                        if (param1 < -80) {
                          return;
                        } else {
                          ((jb) this).c(-88);
                          return;
                        }
                      }
                    } else {
                      ((jb) this).field_j.a((byte) -118, vl.a(lk.field_I, new String[1], 2), 1);
                      if (param1 < -80) {
                        return;
                      } else {
                        ((jb) this).c(-88);
                        return;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param1 < -80) {
                return;
              } else {
                ((jb) this).c(-88);
                return;
              }
            } else {
              if (param1 < -80) {
                return;
              } else {
                ((jb) this).c(-88);
                return;
              }
            }
          } else {
            if (param1 < -80) {
              return;
            } else {
              ((jb) this).c(-88);
              return;
            }
          }
        } else {
          if (param1 < -80) {
            return;
          } else {
            ((jb) this).c(-88);
            return;
          }
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 != 19) {
            return false;
        }
        if (param2 == 0) {
            so.a(-21148, ((jb) this).field_i, param0);
            return true;
        }
        if ((param2 ^ -1) == -2) {
            cg.a(param0, -27404, ((jb) this).field_i);
            return true;
        }
        if (2 != param2) {
            if ((param2 ^ -1) == -4) {
                ml.a(((jb) this).field_b, param0, -76);
                return true;
            }
            if (10 == param2) {
                kk.a(param1 + -6, ((jb) this).field_b, param0);
                return true;
            }
            if (-16 == (param2 ^ -1)) {
                jm.a(((jb) this).field_b, param0, -105);
                return true;
            }
            if ((param2 ^ -1) == -17) {
                jm.a(0, param0, param1 + -107);
                return true;
            }
            return false;
        }
        pl.a(param0, (byte) 111, ((jb) this).field_b);
        return true;
    }

    final void a(byte param0) {
        String var3 = null;
        int var4 = 0;
        jh var5 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (mh.field_c == null) {
          var5 = on.c(false, ((jb) this).field_b);
          if (var5 != null) {
            var3 = var5.field_Nb;
            if (!var5.field_lc) {
              if (var5.field_Ob) {
                L0: {
                  ((jb) this).field_j.a((byte) -118, vl.a(jo.field_c, new String[1], 2), 2);
                  if (var5.field_rc) {
                    ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (param0 <= -8) {
                  return;
                } else {
                  ((jb) this).field_i = -51L;
                  return;
                }
              } else {
                L1: {
                  if (var5.field_rc) {
                    break L1;
                  } else {
                    if (!var5.field_Wb) {
                      break L1;
                    } else {
                      L2: {
                        if (!var5.field_Fb) {
                          break L2;
                        } else {
                          if (var5.field_Ob) {
                            break L2;
                          } else {
                            L3: {
                              if (var5.field_rc) {
                                ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            if (param0 <= -8) {
                              return;
                            } else {
                              ((jb) this).field_i = -51L;
                              return;
                            }
                          }
                        }
                      }
                      L4: {
                        ((jb) this).field_j.a((byte) -118, vl.a(hp.field_o, new String[1], 2), 2);
                        if (var5.field_rc) {
                          ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      if (param0 <= -8) {
                        return;
                      } else {
                        ((jb) this).field_i = -51L;
                        return;
                      }
                    }
                  }
                }
                if (var5.field_rc) {
                  ((jb) this).field_j.a((byte) -118, vl.a(b.field_e, new String[1], 2), 3);
                  if (param0 <= -8) {
                    return;
                  } else {
                    ((jb) this).field_i = -51L;
                    return;
                  }
                } else {
                  if (param0 <= -8) {
                    return;
                  } else {
                    ((jb) this).field_i = -51L;
                    return;
                  }
                }
              }
            } else {
              ((jb) this).field_j.a((byte) -118, vl.a(ke.field_d, new String[1], 2), 2);
              ((jb) this).field_j.a((byte) -118, vl.a(gg.field_e, new String[1], 2), 3);
              if (param0 <= -8) {
                return;
              } else {
                ((jb) this).field_i = -51L;
                return;
              }
            }
          } else {
            if (param0 <= -8) {
              return;
            } else {
              ((jb) this).field_i = -51L;
              return;
            }
          }
        } else {
          if (param0 <= -8) {
            return;
          } else {
            ((jb) this).field_i = -51L;
            return;
          }
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            String discarded$1 = this.b(95);
            if (((jb) this).field_j == null) {
                return false;
            }
            if (!((jb) this).field_j.d((byte) 90)) {
                return false;
            }
            return true;
        }
        if (((jb) this).field_j == null) {
            return false;
        }
        if (!((jb) this).field_j.d((byte) 90)) {
            return false;
        }
        return true;
    }

    final boolean a(int param0, int param1, byte param2, boolean param3, int param4) {
        int var6 = ((jb) this).field_j.e(param3, param2 ^ 1839469049);
        if (-2 == var6) {
            return false;
        }
        if (param2 != -8) {
            ((jb) this).field_b = -116;
            boolean discarded$0 = this.b(param0, 19, var6);
            boolean discarded$1 = this.a(param4, var6, (byte) 57);
            boolean discarded$2 = this.a((byte) 98, var6, param4);
            boolean discarded$3 = this.a(17, var6, param1);
            return true;
        }
        boolean discarded$4 = this.b(param0, 19, var6);
        boolean discarded$5 = this.a(param4, var6, (byte) 57);
        boolean discarded$6 = this.a((byte) 98, var6, param4);
        boolean discarded$7 = this.a(17, var6, param1);
        return true;
    }

    final void a(ka param0, int param1) {
        if (param0.field_k) {
          return;
        } else {
          if (param1 == 2) {
            ((jb) this).field_h = param0.field_l;
            if (-1 != (param0.field_l ^ -1)) {
              if (param0.field_l != 1) {
                L0: {
                  if (-3 == (param0.field_l ^ -1)) {
                    L1: {
                      if (0 == ba.field_q) {
                        ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                if (0 != qe.field_g) {
                  L2: {
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    if (-3 == (param0.field_l ^ -1)) {
                      L3: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                } else {
                  ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                  L4: {
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    if (-3 == (param0.field_l ^ -1)) {
                      L5: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  return;
                }
              }
            } else {
              if (0 != li.field_C) {
                ((jb) this).field_j.a((byte) -118, rq.field_g, 13);
                if (param0.field_l != 1) {
                  L6: {
                    if (-3 == (param0.field_l ^ -1)) {
                      L7: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                } else {
                  if (0 != qe.field_g) {
                    L8: {
                      ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                      if (-3 == (param0.field_l ^ -1)) {
                        L9: {
                          if (0 == ba.field_q) {
                            ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return;
                  } else {
                    ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                    L10: {
                      ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                      if (-3 == (param0.field_l ^ -1)) {
                        L11: {
                          if (0 == ba.field_q) {
                            ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                }
              } else {
                ((jb) this).field_j.a((byte) -118, ha.field_k, 12);
                ((jb) this).field_j.a((byte) -118, rq.field_g, 13);
                if (param0.field_l != 1) {
                  L12: {
                    if (-3 == (param0.field_l ^ -1)) {
                      L13: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                } else {
                  if (0 != qe.field_g) {
                    L14: {
                      ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                      if (-3 == (param0.field_l ^ -1)) {
                        L15: {
                          if (0 == ba.field_q) {
                            ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    return;
                  } else {
                    ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                    L16: {
                      ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                      if (-3 == (param0.field_l ^ -1)) {
                        L17: {
                          if (0 == ba.field_q) {
                            ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            ((jb) this).field_g = null;
            ((jb) this).field_h = param0.field_l;
            if (-1 == (param0.field_l ^ -1)) {
              L18: {
                if (0 != li.field_C) {
                  ((jb) this).field_j.a((byte) -118, rq.field_g, 13);
                  break L18;
                } else {
                  ((jb) this).field_j.a((byte) -118, ha.field_k, 12);
                  ((jb) this).field_j.a((byte) -118, rq.field_g, 13);
                  break L18;
                }
              }
              if (param0.field_l == 1) {
                if (0 != qe.field_g) {
                  L19: {
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    if (-3 == (param0.field_l ^ -1)) {
                      L20: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  return;
                } else {
                  ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                  L21: {
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    if (-3 == (param0.field_l ^ -1)) {
                      L22: {
                        if (0 == ba.field_q) {
                          ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                L23: {
                  if (-3 == (param0.field_l ^ -1)) {
                    L24: {
                      if (0 == ba.field_q) {
                        ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              }
            } else {
              L25: {
                if (param0.field_l != 1) {
                  break L25;
                } else {
                  if (0 != qe.field_g) {
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    break L25;
                  } else {
                    ((jb) this).field_j.a((byte) -118, bg.field_n, 12);
                    ((jb) this).field_j.a((byte) -118, jk.field_c, 13);
                    break L25;
                  }
                }
              }
              L26: {
                if (-3 == (param0.field_l ^ -1)) {
                  L27: {
                    if (0 == ba.field_q) {
                      ((jb) this).field_j.a((byte) -118, aj.field_i, 12);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  ((jb) this).field_j.a((byte) -118, gg.field_n, 13);
                  break L26;
                } else {
                  break L26;
                }
              }
              return;
            }
          }
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        var4 = null;
        if ((param1 ^ -1) != -5) {
          if (5 != param1) {
            if ((param1 ^ -1) != -7) {
              if (7 != param1) {
                return false;
              } else {
                L0: {
                  var10 = ng.a(((jb) this).field_f, ((jb) this).field_d, -69, param0);
                  if (var10 != null) {
                    var6 = null;
                    vm.a(((jb) this).field_f, 0, (String) null, var10, 2, 0);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var5 = -84 % ((-56 - param2) / 51);
                return true;
              }
            } else {
              L1: {
                var9 = sf.a(-107, param0, ((jb) this).field_f);
                if (var9 != null) {
                  var6 = null;
                  vm.a(((jb) this).field_f, 0, (String) null, var9, 2, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              var5 = -84 % ((-56 - param2) / 51);
              return true;
            }
          } else {
            L2: {
              var8 = gn.a(((jb) this).field_f, 113, param0);
              if (var8 != null) {
                var6 = null;
                vm.a(((jb) this).field_f, 0, (String) null, var8, 2, 0);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = -84 % ((-56 - param2) / 51);
            return true;
          }
        } else {
          L3: {
            var7 = ii.a(((jb) this).field_f, (byte) 116, param0);
            if (var7 != null) {
              var6 = null;
              vm.a(((jb) this).field_f, 0, (String) null, var7, 2, 0);
              break L3;
            } else {
              break L3;
            }
          }
          var5 = -84 % ((-56 - param2) / 51);
          return true;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        if (param0 == param1) {
            bk.field_i = new fa(((jb) this).field_e.field_w, ((jb) this).field_e.field_qb, ((jb) this).field_e.field_zb, ((jb) this).field_e.field_z, param2, wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b, ((jb) this).field_f, ((jb) this).field_i);
            return true;
        }
        return false;
    }

    private final String b(int param0) {
        String var2 = null;
        if (param0 != -20516) {
            field_k = null;
            if (null != ((jb) this).field_d) {
                var2 = ((jb) this).field_d;
            } else {
                var2 = ((jb) this).field_f;
            }
            return var2;
        }
        if (null != ((jb) this).field_d) {
            var2 = ((jb) this).field_d;
        } else {
            var2 = ((jb) this).field_f;
        }
        return var2;
    }

    final void c(int param0) {
        String var3 = null;
        String var2 = null;
        if (param0 >= -45) {
            field_c = null;
            if (null != ((jb) this).field_f) {
                if ((ie.field_sb ^ -1L) != (((jb) this).field_i ^ -1L)) {
                    var3 = this.b(-20516);
                    var2 = var3;
                    ((jb) this).field_j.a((byte) -118, vl.a(mi.field_Jb, new String[1], 2), 17);
                }
            }
            return;
        }
        if (null != ((jb) this).field_f) {
            if ((ie.field_sb ^ -1L) != (((jb) this).field_i ^ -1L)) {
                var3 = this.b(-20516);
                var2 = var3;
                ((jb) this).field_j.a((byte) -118, vl.a(mi.field_Jb, new String[1], 2), 17);
            }
        }
    }

    final void a(int param0, int[] param1, byte param2) {
        String var4 = null;
        ml var5 = null;
        int var6 = 0;
        String var7 = null;
        if (((jb) this).field_f != null) {
          if (ie.field_sb == ((jb) this).field_i) {
            if (2 == param0) {
              L0: {
                if (ge.field_zb == 2) {
                  L1: {
                    var7 = this.b(-20516);
                    var4 = var7;
                    var5 = dn.a(((jb) this).field_f, false);
                    var6 = hp.a(((jb) this).field_f, param2 ^ 1009) ? 1 : 0;
                    if (var5 != null) {
                      break L1;
                    } else {
                      if (var6 == 0) {
                        ((jb) this).field_j.a((byte) -118, vl.a(th.field_e, new String[1], param2 + -11), 4);
                        ((jb) this).field_j.a((byte) -118, vl.a(sb.field_g, new String[1], 2), 6);
                        if (param1 == null) {
                          break L1;
                        } else {
                          if (-3 == (param0 ^ -1)) {
                            break L1;
                          } else {
                            if (!nh.field_m) {
                              ((jb) this).field_g = param1;
                              ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                              break L1;
                            } else {
                              L2: {
                                if (var5 != null) {
                                  L3: {
                                    if (cq.a(((jb) this).field_f, -118)) {
                                      break L3;
                                    } else {
                                      if (nh.field_m) {
                                        break L3;
                                      } else {
                                        L4: {
                                          if (sh.field_L) {
                                            break L4;
                                          } else {
                                            ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                            break L4;
                                          }
                                        }
                                        ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                                        if (param1 != null) {
                                          ((jb) this).field_g = param1;
                                          ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                          break L3;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  }
                                  ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                              L5: {
                                if (var6 == 0) {
                                  break L5;
                                } else {
                                  ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                  break L5;
                                }
                              }
                              if (param2 == 13) {
                                return;
                              } else {
                                field_a = null;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (var5 != null) {
                            L7: {
                              if (cq.a(((jb) this).field_f, -118)) {
                                break L7;
                              } else {
                                if (nh.field_m) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (sh.field_L) {
                                      break L8;
                                    } else {
                                      ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                      break L8;
                                    }
                                  }
                                  ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                                  if (param1 != null) {
                                    ((jb) this).field_g = param1;
                                    ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L9: {
                          if (var6 == 0) {
                            break L9;
                          } else {
                            ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                            break L9;
                          }
                        }
                        L10: {
                          if (param2 == 13) {
                            break L10;
                          } else {
                            field_a = null;
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                  L11: {
                    if (var5 != null) {
                      if (!cq.a(((jb) this).field_f, -118)) {
                        L12: {
                          if (nh.field_m) {
                            break L12;
                          } else {
                            if (sh.field_L) {
                              ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                              if (param1 != null) {
                                ((jb) this).field_g = param1;
                                ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                break L12;
                              } else {
                                ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                                if (var6 == 0) {
                                  if (param2 == 13) {
                                    return;
                                  } else {
                                    field_a = null;
                                    return;
                                  }
                                } else {
                                  L13: {
                                    ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                    if (param2 == 13) {
                                      break L13;
                                    } else {
                                      field_a = null;
                                      break L13;
                                    }
                                  }
                                  return;
                                }
                              }
                            } else {
                              L14: {
                                ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                                if (param1 != null) {
                                  ((jb) this).field_g = param1;
                                  ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                              if (var6 == 0) {
                                if (param2 == 13) {
                                  return;
                                } else {
                                  field_a = null;
                                  return;
                                }
                              } else {
                                L15: {
                                  ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                  if (param2 == 13) {
                                    break L15;
                                  } else {
                                    field_a = null;
                                    break L15;
                                  }
                                }
                                return;
                              }
                            }
                          }
                        }
                        ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                        break L11;
                      } else {
                        ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                        if (var6 == 0) {
                          if (param2 == 13) {
                            return;
                          } else {
                            field_a = null;
                            return;
                          }
                        } else {
                          ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                          if (param2 == 13) {
                            return;
                          } else {
                            field_a = null;
                            return;
                          }
                        }
                      }
                    } else {
                      break L11;
                    }
                  }
                  if (var6 == 0) {
                    break L0;
                  } else {
                    ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                    if (param2 == 13) {
                      return;
                    } else {
                      field_a = null;
                      return;
                    }
                  }
                } else {
                  break L0;
                }
              }
              if (param2 == 13) {
                return;
              } else {
                field_a = null;
                return;
              }
            } else {
              if (param2 == 13) {
                return;
              } else {
                field_a = null;
                return;
              }
            }
          } else {
            L16: {
              if (ge.field_zb == 2) {
                L17: {
                  var7 = this.b(-20516);
                  var4 = var7;
                  var5 = dn.a(((jb) this).field_f, false);
                  var6 = hp.a(((jb) this).field_f, param2 ^ 1009) ? 1 : 0;
                  if (var5 != null) {
                    break L17;
                  } else {
                    if (var6 == 0) {
                      var7 = var4;
                      ((jb) this).field_j.a((byte) -118, vl.a(th.field_e, new String[1], param2 + -11), 4);
                      ((jb) this).field_j.a((byte) -118, vl.a(sb.field_g, new String[1], 2), 6);
                      if (param1 == null) {
                        break L17;
                      } else {
                        if (-3 == (param0 ^ -1)) {
                          break L17;
                        } else {
                          if (!nh.field_m) {
                            ((jb) this).field_g = param1;
                            ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                            break L17;
                          } else {
                            L18: {
                              if (var5 != null) {
                                L19: {
                                  if (cq.a(((jb) this).field_f, -118)) {
                                    break L19;
                                  } else {
                                    if (nh.field_m) {
                                      break L19;
                                    } else {
                                      L20: {
                                        if (sh.field_L) {
                                          break L20;
                                        } else {
                                          ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                          break L20;
                                        }
                                      }
                                      ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                                      if (param1 != null) {
                                        ((jb) this).field_g = param1;
                                        ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                }
                                ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L21: {
                              if (var6 == 0) {
                                break L21;
                              } else {
                                ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                break L21;
                              }
                            }
                            L22: {
                              if (param2 == 13) {
                                break L22;
                              } else {
                                field_a = null;
                                break L22;
                              }
                            }
                            return;
                          }
                        }
                      }
                    } else {
                      L23: {
                        if (var5 != null) {
                          L24: {
                            if (cq.a(((jb) this).field_f, -118)) {
                              break L24;
                            } else {
                              if (nh.field_m) {
                                break L24;
                              } else {
                                L25: {
                                  if (sh.field_L) {
                                    break L25;
                                  } else {
                                    ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                                    break L25;
                                  }
                                }
                                var7 = var4;
                                ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                                if (param1 != null) {
                                  ((jb) this).field_g = param1;
                                  ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                  break L24;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          var7 = var4;
                          ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      L26: {
                        var7 = var4;
                        if (var6 == 0) {
                          break L26;
                        } else {
                          ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                          break L26;
                        }
                      }
                      L27: {
                        if (param2 == 13) {
                          break L27;
                        } else {
                          field_a = null;
                          break L27;
                        }
                      }
                      return;
                    }
                  }
                }
                L28: {
                  if (var5 != null) {
                    L29: {
                      if (cq.a(((jb) this).field_f, -118)) {
                        break L29;
                      } else {
                        if (nh.field_m) {
                          break L29;
                        } else {
                          if (sh.field_L) {
                            ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                            if (param1 != null) {
                              ((jb) this).field_g = param1;
                              ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                              break L29;
                            } else {
                              L30: {
                                ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                                if (var6 == 0) {
                                  break L30;
                                } else {
                                  ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                  break L30;
                                }
                              }
                              L31: {
                                if (param2 == 13) {
                                  break L31;
                                } else {
                                  field_a = null;
                                  break L31;
                                }
                              }
                              return;
                            }
                          } else {
                            L32: {
                              ((jb) this).field_j.a((byte) -118, vl.a(jk.field_i, new String[1], 2), 8);
                              ((jb) this).field_j.a((byte) -118, vl.a(mp.field_c, new String[1], 2), 18);
                              if (param1 != null) {
                                ((jb) this).field_g = param1;
                                ((jb) this).field_j.a((byte) -118, vl.a(ff.field_u, new String[1], 2), 19);
                                break L32;
                              } else {
                                break L32;
                              }
                            }
                            L33: {
                              ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                              if (var6 == 0) {
                                break L33;
                              } else {
                                ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                                break L33;
                              }
                            }
                            L34: {
                              if (param2 == 13) {
                                break L34;
                              } else {
                                field_a = null;
                                break L34;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                    ((jb) this).field_j.a((byte) -118, vl.a(nk.field_j, new String[1], 2), 5);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                if (var6 == 0) {
                  break L16;
                } else {
                  L35: {
                    ((jb) this).field_j.a((byte) -118, vl.a(we.field_l, new String[1], 2), 7);
                    if (param2 == 13) {
                      break L35;
                    } else {
                      field_a = null;
                      break L35;
                    }
                  }
                  return;
                }
              } else {
                break L16;
              }
            }
            if (param2 == 13) {
              return;
            } else {
              field_a = null;
              return;
            }
          }
        } else {
          if (param2 == 13) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    jb(cj param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        ((jb) this).field_j = new sn(ql.field_d);
        ((jb) this).field_f = param2;
        ((jb) this).field_d = param3;
        ((jb) this).field_g = param6;
        ((jb) this).field_h = param5;
        ((jb) this).field_b = param4;
        ((jb) this).field_i = param1;
        ((jb) this).field_e = param0;
        param0.field_Ab = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Playing";
        field_k = "Passwords must be between 5 and 20 characters long";
    }
}
