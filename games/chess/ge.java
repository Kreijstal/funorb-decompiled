/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends k implements mj {
    static hj field_fb;
    static String field_db;
    private fb field_gb;
    static int field_bb;
    static String field_cb;
    static int[] field_eb;

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        if (((ge) this).field_gb == param0) {
            this.c(true);
            if (param4 == -24221) {
                return;
            }
            ge.a(true, false);
            return;
        }
        if (param4 != -24221) {
            ge.a(true, false);
            return;
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var3 = 0;
        var3 = Chess.field_G;
        if (param0) {
          field_db = null;
          if (param1) {
            jh.field_a = false;
            if (param1) {
              if (an.field_e > 0) {
                an.field_e = an.field_e - 1;
                return;
              } else {
                if (aj.field_c > 0) {
                  aj.field_c = aj.field_c - 1;
                  return;
                } else {
                  if (ed.field_c > 0) {
                    ed.field_c = ed.field_c - 1;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L0: {
                if (pd.field_Rb != null) {
                  if (-1 <= (an.field_e ^ -1)) {
                    if (-1 <= (aj.field_c ^ -1)) {
                      if (ug.field_b <= ed.field_c) {
                        break L0;
                      } else {
                        L1: {
                          if (0 == ed.field_c) {
                            aj.a(false, true);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        ed.field_c = ed.field_c + 1;
                        return;
                      }
                    } else {
                      aj.field_c = aj.field_c - 1;
                      return;
                    }
                  } else {
                    an.field_e = an.field_e - 1;
                    return;
                  }
                } else {
                  if (null != ib.field_d) {
                    if ((an.field_e ^ -1) < -1) {
                      an.field_e = an.field_e - 1;
                      return;
                    } else {
                      if (0 < ed.field_c) {
                        ed.field_c = ed.field_c - 1;
                        return;
                      } else {
                        if (aj.field_c >= ug.field_b) {
                          break L0;
                        } else {
                          L2: {
                            if (aj.field_c == 0) {
                              aj.a(true, true);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          aj.field_c = aj.field_c + 1;
                          return;
                        }
                      }
                    }
                  } else {
                    jh.field_a = false;
                    if (-1 <= (aj.field_c ^ -1)) {
                      if (0 >= ed.field_c) {
                        if (ug.field_b <= an.field_e) {
                          break L0;
                        } else {
                          L3: {
                            if (-1 == (an.field_e ^ -1)) {
                              tj.b((byte) -126);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          an.field_e = an.field_e + 1;
                          return;
                        }
                      } else {
                        ed.field_c = ed.field_c - 1;
                        return;
                      }
                    } else {
                      aj.field_c = aj.field_c - 1;
                      break L0;
                    }
                  }
                }
              }
              return;
            }
          } else {
            if (null == pd.field_Rb) {
              jh.field_a = false;
              if (param1) {
                if (an.field_e > 0) {
                  an.field_e = an.field_e - 1;
                  return;
                } else {
                  if (aj.field_c > 0) {
                    aj.field_c = aj.field_c - 1;
                    return;
                  } else {
                    if (ed.field_c > 0) {
                      ed.field_c = ed.field_c - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L4: {
                  if (pd.field_Rb != null) {
                    if (-1 <= (an.field_e ^ -1)) {
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (ug.field_b <= ed.field_c) {
                          break L4;
                        } else {
                          L5: {
                            if (0 == ed.field_c) {
                              aj.a(false, true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ed.field_c = ed.field_c + 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        return;
                      }
                    } else {
                      an.field_e = an.field_e - 1;
                      return;
                    }
                  } else {
                    if (null != ib.field_d) {
                      if ((an.field_e ^ -1) < -1) {
                        an.field_e = an.field_e - 1;
                        return;
                      } else {
                        if (0 < ed.field_c) {
                          ed.field_c = ed.field_c - 1;
                          return;
                        } else {
                          if (aj.field_c >= ug.field_b) {
                            break L4;
                          } else {
                            L6: {
                              if (aj.field_c == 0) {
                                aj.a(true, true);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            aj.field_c = aj.field_c + 1;
                            return;
                          }
                        }
                      }
                    } else {
                      jh.field_a = false;
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (0 >= ed.field_c) {
                          if (ug.field_b <= an.field_e) {
                            break L4;
                          } else {
                            L7: {
                              if (-1 == (an.field_e ^ -1)) {
                                tj.b((byte) -126);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            an.field_e = an.field_e + 1;
                            return;
                          }
                        } else {
                          ed.field_c = ed.field_c - 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        break L4;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              if (param1) {
                if (an.field_e > 0) {
                  an.field_e = an.field_e - 1;
                  return;
                } else {
                  if (aj.field_c > 0) {
                    aj.field_c = aj.field_c - 1;
                    return;
                  } else {
                    if (ed.field_c > 0) {
                      ed.field_c = ed.field_c - 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L8: {
                  if (pd.field_Rb != null) {
                    if (-1 <= (an.field_e ^ -1)) {
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (ug.field_b <= ed.field_c) {
                          break L8;
                        } else {
                          L9: {
                            if (0 == ed.field_c) {
                              aj.a(false, true);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          ed.field_c = ed.field_c + 1;
                          return;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        return;
                      }
                    } else {
                      an.field_e = an.field_e - 1;
                      return;
                    }
                  } else {
                    if (null != ib.field_d) {
                      if ((an.field_e ^ -1) < -1) {
                        an.field_e = an.field_e - 1;
                        return;
                      } else {
                        if (0 < ed.field_c) {
                          ed.field_c = ed.field_c - 1;
                          return;
                        } else {
                          if (aj.field_c < ug.field_b) {
                            L10: {
                              if (aj.field_c == 0) {
                                aj.a(true, true);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            aj.field_c = aj.field_c + 1;
                            break L8;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      jh.field_a = false;
                      if (-1 <= (aj.field_c ^ -1)) {
                        if (0 >= ed.field_c) {
                          if (ug.field_b > an.field_e) {
                            L11: {
                              if (-1 == (an.field_e ^ -1)) {
                                tj.b((byte) -126);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            an.field_e = an.field_e + 1;
                            break L8;
                          } else {
                            return;
                          }
                        } else {
                          ed.field_c = ed.field_c - 1;
                          break L8;
                        }
                      } else {
                        aj.field_c = aj.field_c - 1;
                        break L8;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          L12: {
            if (param1) {
              jh.field_a = false;
              break L12;
            } else {
              if (null == pd.field_Rb) {
                jh.field_a = false;
                break L12;
              } else {
                if (param1) {
                  if (an.field_e > 0) {
                    an.field_e = an.field_e - 1;
                    return;
                  } else {
                    if (aj.field_c > 0) {
                      aj.field_c = aj.field_c - 1;
                      return;
                    } else {
                      if (ed.field_c > 0) {
                        ed.field_c = ed.field_c - 1;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  L13: {
                    if (pd.field_Rb != null) {
                      if (-1 <= (an.field_e ^ -1)) {
                        if (-1 <= (aj.field_c ^ -1)) {
                          if (ug.field_b <= ed.field_c) {
                            break L13;
                          } else {
                            L14: {
                              if (0 == ed.field_c) {
                                aj.a(false, true);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            ed.field_c = ed.field_c + 1;
                            return;
                          }
                        } else {
                          aj.field_c = aj.field_c - 1;
                          return;
                        }
                      } else {
                        an.field_e = an.field_e - 1;
                        break L13;
                      }
                    } else {
                      if (null != ib.field_d) {
                        if ((an.field_e ^ -1) < -1) {
                          an.field_e = an.field_e - 1;
                          break L13;
                        } else {
                          if (0 < ed.field_c) {
                            ed.field_c = ed.field_c - 1;
                            break L13;
                          } else {
                            if (aj.field_c >= ug.field_b) {
                              break L13;
                            } else {
                              L15: {
                                if (aj.field_c == 0) {
                                  aj.a(true, true);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              aj.field_c = aj.field_c + 1;
                              break L13;
                            }
                          }
                        }
                      } else {
                        jh.field_a = false;
                        if (-1 <= (aj.field_c ^ -1)) {
                          if (0 >= ed.field_c) {
                            if (ug.field_b <= an.field_e) {
                              break L13;
                            } else {
                              L16: {
                                if (-1 == (an.field_e ^ -1)) {
                                  tj.b((byte) -126);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              an.field_e = an.field_e + 1;
                              break L13;
                            }
                          } else {
                            ed.field_c = ed.field_c - 1;
                            break L13;
                          }
                        } else {
                          aj.field_c = aj.field_c - 1;
                          break L13;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param1) {
            if (an.field_e > 0) {
              an.field_e = an.field_e - 1;
              return;
            } else {
              if (aj.field_c > 0) {
                aj.field_c = aj.field_c - 1;
                return;
              } else {
                if (ed.field_c > 0) {
                  ed.field_c = ed.field_c - 1;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L17: {
              if (pd.field_Rb != null) {
                if (-1 <= (an.field_e ^ -1)) {
                  if (-1 <= (aj.field_c ^ -1)) {
                    if (ug.field_b <= ed.field_c) {
                      break L17;
                    } else {
                      L18: {
                        if (0 == ed.field_c) {
                          aj.a(false, true);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      ed.field_c = ed.field_c + 1;
                      return;
                    }
                  } else {
                    aj.field_c = aj.field_c - 1;
                    return;
                  }
                } else {
                  an.field_e = an.field_e - 1;
                  break L17;
                }
              } else {
                if (null != ib.field_d) {
                  if ((an.field_e ^ -1) < -1) {
                    an.field_e = an.field_e - 1;
                    break L17;
                  } else {
                    if (0 < ed.field_c) {
                      ed.field_c = ed.field_c - 1;
                      break L17;
                    } else {
                      if (aj.field_c >= ug.field_b) {
                        break L17;
                      } else {
                        L19: {
                          if (aj.field_c == 0) {
                            aj.a(true, true);
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        aj.field_c = aj.field_c + 1;
                        break L17;
                      }
                    }
                  }
                } else {
                  jh.field_a = false;
                  if (-1 <= (aj.field_c ^ -1)) {
                    if (0 >= ed.field_c) {
                      if (ug.field_b > an.field_e) {
                        L20: {
                          if (-1 == (an.field_e ^ -1)) {
                            tj.b((byte) -126);
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        an.field_e = an.field_e + 1;
                        break L17;
                      } else {
                        return;
                      }
                    } else {
                      ed.field_c = ed.field_c - 1;
                      break L17;
                    }
                  } else {
                    aj.field_c = aj.field_c - 1;
                    break L17;
                  }
                }
              }
            }
            return;
          }
        }
    }

    public static void k(int param0) {
        field_db = null;
        field_fb = null;
        field_cb = null;
        if (param0 != 0) {
            return;
        }
        field_eb = null;
    }

    final static pg a(boolean param0, int param1, int param2, int param3) {
        int var5 = Chess.field_G;
        pg var4 = (pg) (Object) nd.field_h.g(-18110);
        while (var4 != null) {
            if (!(var4.field_q != param2)) {
                return var4;
            }
            var4 = (pg) (Object) nd.field_h.a((byte) -111);
        }
        pg var6 = new pg();
        var4 = var6;
        var6.field_u = param3;
        if (!param0) {
            return null;
        }
        var4.field_q = param2;
        nd.field_h.a((o) (Object) var4, (byte) 102);
        tm.a(false, var4, param1);
        return var4;
    }

    private final fb a(String param0, rg param1, int param2) {
        fb var4 = new fb(param0, param1);
        var4.field_n = (jm) (Object) new sf();
        int var5 = ((ge) this).field_C - 6;
        ((ge) this).field_C = ((ge) this).field_C + 38;
        var4.a(var5, 34, param2, -30 + ((ge) this).field_y, 15);
        ((ge) this).b((mf) (Object) var4, 95);
        ((ge) this).c((byte) 112);
        return var4;
    }

    private final void c(boolean param0) {
        if (!(((ge) this).field_P)) {
            return;
        }
        ((ge) this).field_P = false;
        if (!param0) {
            ge.a(false, true);
        }
    }

    ge(fm param0, ij param1) {
        super(param0, 200, 150);
        Object var5 = null;
        mf var6 = null;
        String var7 = null;
        mf var8 = null;
        String var9 = null;
        mf var10 = null;
        String var11 = null;
        mf var12 = null;
        String var13 = null;
        mf var14 = null;
        var5 = null;
        if (gi.field_a == param1) {
          var13 = Chess.field_D;
          var14 = new mf(var13, (rg) null);
          var14.field_C = 80;
          var14.field_y = ((ge) this).field_y;
          var14.field_r = 50;
          var14.field_u = 0;
          var14.field_n = (jm) (Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
          ((ge) this).b(var14, 95);
          ((ge) this).field_gb = this.a(sj.field_m, (rg) this, 30);
          return;
        } else {
          if (kh.field_k == param1) {
            ((ge) this).field_C = ((ge) this).field_C + 10;
            var9 = le.field_c;
            if (jj.d(124)) {
              var11 = le.field_d;
              ((ge) this).field_C = ((ge) this).field_C + 20;
              var12 = new mf(var11, (rg) null);
              var12.field_C = 80;
              var12.field_y = ((ge) this).field_y;
              var12.field_r = 50;
              var12.field_u = 0;
              var12.field_n = (jm) (Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ge) this).b(var12, 95);
              ((ge) this).field_gb = this.a(sj.field_m, (rg) this, 30);
              return;
            } else {
              var10 = new mf(var9, (rg) null);
              var10.field_C = 80;
              var10.field_y = ((ge) this).field_y;
              var10.field_r = 50;
              var10.field_u = 0;
              var10.field_n = (jm) (Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ge) this).b(var10, 95);
              ((ge) this).field_gb = this.a(sj.field_m, (rg) this, 30);
              return;
            }
          } else {
            if (cm.field_t == param1) {
              ((ge) this).field_C = ((ge) this).field_C + 30;
              var7 = vd.field_Gb;
              var8 = new mf(var7, (rg) null);
              var8.field_C = 80;
              var8.field_y = ((ge) this).field_y;
              var8.field_r = 50;
              var8.field_u = 0;
              var8.field_n = (jm) (Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ge) this).b(var8, 95);
              ((ge) this).field_gb = this.a(sj.field_m, (rg) this, 30);
              return;
            } else {
              var6 = new mf((String) var5, (rg) null);
              var6.field_C = 80;
              var6.field_y = ((ge) this).field_y;
              var6.field_r = 50;
              var6.field_u = 0;
              var6.field_n = (jm) (Object) new hl(rc.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true);
              ((ge) this).b(var6, 95);
              ((ge) this).field_gb = this.a(sj.field_m, (rg) this, 30);
              return;
            }
          }
        }
    }

    final static void a(String param0, byte param1) {
        if (param1 <= 25) {
            ge.k(15);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Your game";
        field_eb = new int[1024];
        field_db = "Account created successfully!";
    }
}
