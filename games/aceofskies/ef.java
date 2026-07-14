/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef {
    private int field_d;
    private int field_n;
    private int field_f;
    private boolean field_b;
    static gu field_k;
    private int field_v;
    private dj field_l;
    private int field_a;
    private int field_c;
    private int field_p;
    private int field_j;
    static String field_i;
    private int field_t;
    private int field_h;
    private int field_s;
    static String field_g;
    private int field_o;
    private float field_q;
    private int field_u;
    private int field_r;
    private int field_e;
    static int field_m;

    public static void a(int param0) {
        if (param0 != 0) {
          float discarded$2 = ef.a(-0.783437192440033f, -0.508948802947998f, 119, 0.7036879658699036f, 56);
          field_k = null;
          field_g = null;
          field_i = null;
          return;
        } else {
          field_k = null;
          field_g = null;
          field_i = null;
          return;
        }
    }

    final static void a(byte param0, rk param1, gk param2) {
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        rj.field_b = param2;
        bl.field_g = "";
        if (param0 <= 93) {
          L0: {
            field_k = (gu) null;
            bm.field_I = param1;
            if (!rr.field_b.startsWith("win")) {
              if (rr.field_b.startsWith("linux")) {
                bl.field_g = bl.field_g + "linux/";
                break L0;
              } else {
                if (rr.field_b.startsWith("mac")) {
                  bl.field_g = bl.field_g + "macos/";
                  break L0;
                } else {
                  if (!bm.field_I.field_p) {
                    if (!rr.field_a.startsWith("amd64")) {
                      if (!rr.field_a.startsWith("x86_64")) {
                        if (!rr.field_a.startsWith("i386")) {
                          if (!rr.field_a.startsWith("i486")) {
                            if (!rr.field_a.startsWith("i586")) {
                              if (!rr.field_a.startsWith("x86")) {
                                if (!rr.field_a.startsWith("ppc")) {
                                  bl.field_g = bl.field_g + "universal/";
                                  return;
                                } else {
                                  bl.field_g = bl.field_g + "ppc/";
                                  return;
                                }
                              } else {
                                bl.field_g = bl.field_g + "x86/";
                                return;
                              }
                            } else {
                              bl.field_g = bl.field_g + "x86/";
                              return;
                            }
                          } else {
                            bl.field_g = bl.field_g + "x86/";
                            return;
                          }
                        } else {
                          bl.field_g = bl.field_g + "x86/";
                          return;
                        }
                      } else {
                        bl.field_g = bl.field_g + "x86_64/";
                        return;
                      }
                    } else {
                      bl.field_g = bl.field_g + "x86_64/";
                      return;
                    }
                  } else {
                    bl.field_g = bl.field_g + "msjava/";
                    return;
                  }
                }
              }
            } else {
              bl.field_g = bl.field_g + "windows/";
              break L0;
            }
          }
          if (!bm.field_I.field_p) {
            if (!rr.field_a.startsWith("amd64")) {
              if (!rr.field_a.startsWith("x86_64")) {
                if (!rr.field_a.startsWith("i386")) {
                  if (!rr.field_a.startsWith("i486")) {
                    if (!rr.field_a.startsWith("i586")) {
                      if (!rr.field_a.startsWith("x86")) {
                        if (rr.field_a.startsWith("ppc")) {
                          bl.field_g = bl.field_g + "ppc/";
                          return;
                        } else {
                          bl.field_g = bl.field_g + "universal/";
                          return;
                        }
                      } else {
                        bl.field_g = bl.field_g + "x86/";
                        return;
                      }
                    } else {
                      bl.field_g = bl.field_g + "x86/";
                      return;
                    }
                  } else {
                    bl.field_g = bl.field_g + "x86/";
                    return;
                  }
                } else {
                  bl.field_g = bl.field_g + "x86/";
                  return;
                }
              } else {
                bl.field_g = bl.field_g + "x86_64/";
                return;
              }
            } else {
              bl.field_g = bl.field_g + "x86_64/";
              return;
            }
          } else {
            bl.field_g = bl.field_g + "msjava/";
            return;
          }
        } else {
          L1: {
            bm.field_I = param1;
            if (!rr.field_b.startsWith("win")) {
              if (rr.field_b.startsWith("linux")) {
                bl.field_g = bl.field_g + "linux/";
                break L1;
              } else {
                if (!rr.field_b.startsWith("mac")) {
                  break L1;
                } else {
                  bl.field_g = bl.field_g + "macos/";
                  break L1;
                }
              }
            } else {
              bl.field_g = bl.field_g + "windows/";
              break L1;
            }
          }
          if (!bm.field_I.field_p) {
            if (!rr.field_a.startsWith("amd64")) {
              if (!rr.field_a.startsWith("x86_64")) {
                if (!rr.field_a.startsWith("i386")) {
                  if (!rr.field_a.startsWith("i486")) {
                    if (!rr.field_a.startsWith("i586")) {
                      if (!rr.field_a.startsWith("x86")) {
                        if (rr.field_a.startsWith("ppc")) {
                          bl.field_g = bl.field_g + "ppc/";
                          return;
                        } else {
                          bl.field_g = bl.field_g + "universal/";
                          return;
                        }
                      } else {
                        bl.field_g = bl.field_g + "x86/";
                        return;
                      }
                    } else {
                      bl.field_g = bl.field_g + "x86/";
                      return;
                    }
                  } else {
                    bl.field_g = bl.field_g + "x86/";
                    return;
                  }
                } else {
                  bl.field_g = bl.field_g + "x86/";
                  return;
                }
              } else {
                bl.field_g = bl.field_g + "x86_64/";
                return;
              }
            } else {
              bl.field_g = bl.field_g + "x86_64/";
              return;
            }
          } else {
            bl.field_g = bl.field_g + "msjava/";
            return;
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 <= -115) {
          var2 = ((ef) this).field_e;
          var3 = ((ef) this).field_p;
          if (((ef) this).a(false)) {
            L0: {
              if (((ef) this).field_a >= var3) {
                if (((ef) this).field_o <= var3) {
                  break L0;
                } else {
                  var3 = ((ef) this).field_o;
                  break L0;
                }
              } else {
                var3 = ((ef) this).field_a;
                break L0;
              }
            }
            if (((ef) this).field_d < var2) {
              L1: {
                var2 = ((ef) this).field_d;
                if (0.0f >= ((ef) this).field_q) {
                  break L1;
                } else {
                  var4 = (int)(((ef) this).field_q * (float)var3 + 0.5f);
                  if (var2 < var4) {
                    var3 = (int)((float)var2 / ((ef) this).field_q);
                    break L1;
                  } else {
                    if (var4 >= var2) {
                      break L1;
                    } else {
                      var2 = var4;
                      if (td.field_b != var2) {
                        L2: {
                          ((ef) this).field_l.a(var3, false, var2);
                          if (-1 <= (((ef) this).field_e ^ -1)) {
                            break L2;
                          } else {
                            ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                            break L2;
                          }
                        }
                        return;
                      } else {
                        if (var3 == ps.field_h) {
                          if (-1 < ((ef) this).field_e) {
                            ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          ((ef) this).field_l.a(var3, false, var2);
                          if (-1 > ((ef) this).field_e) {
                            ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (td.field_b != var2) {
                ((ef) this).field_l.a(var3, false, var2);
                if (-1 > (((ef) this).field_e ^ -1)) {
                  ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (var3 == ps.field_h) {
                  if (-1 < ((ef) this).field_e) {
                    ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((ef) this).field_l.a(var3, false, var2);
                  if (-1 > ((ef) this).field_e) {
                    ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var2 < ((ef) this).field_v) {
                L3: {
                  var2 = ((ef) this).field_v;
                  if (0.0f >= ((ef) this).field_q) {
                    break L3;
                  } else {
                    var4 = (int)(((ef) this).field_q * (float)var3 + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((ef) this).field_q);
                      break L3;
                    } else {
                      if (var4 >= var2) {
                        break L3;
                      } else {
                        var2 = var4;
                        break L3;
                      }
                    }
                  }
                }
                L4: {
                  if (td.field_b != var2) {
                    ((ef) this).field_l.a(var3, false, var2);
                    break L4;
                  } else {
                    if (var3 == ps.field_h) {
                      break L4;
                    } else {
                      ((ef) this).field_l.a(var3, false, var2);
                      break L4;
                    }
                  }
                }
                if (-1 > (((ef) this).field_e ^ -1)) {
                  ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (0.0f < ((ef) this).field_q) {
                  var4 = (int)(((ef) this).field_q * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      L5: {
                        if (td.field_b != var2) {
                          ((ef) this).field_l.a(var3, false, var2);
                          break L5;
                        } else {
                          if (var3 == ps.field_h) {
                            break L5;
                          } else {
                            ((ef) this).field_l.a(var3, false, var2);
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (-1 <= (((ef) this).field_e ^ -1)) {
                          break L6;
                        } else {
                          ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                          break L6;
                        }
                      }
                      return;
                    } else {
                      var2 = var4;
                      L7: {
                        if (td.field_b != var2) {
                          ((ef) this).field_l.a(var3, false, var2);
                          break L7;
                        } else {
                          if (var3 == ps.field_h) {
                            break L7;
                          } else {
                            ((ef) this).field_l.a(var3, false, var2);
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (-1 <= (((ef) this).field_e ^ -1)) {
                          break L8;
                        } else {
                          ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                          break L8;
                        }
                      }
                      return;
                    }
                  } else {
                    L9: {
                      var3 = (int)((float)var2 / ((ef) this).field_q);
                      if (td.field_b != var2) {
                        ((ef) this).field_l.a(var3, false, var2);
                        break L9;
                      } else {
                        if (var3 == ps.field_h) {
                          break L9;
                        } else {
                          ((ef) this).field_l.a(var3, false, var2);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (-1 <= (((ef) this).field_e ^ -1)) {
                        break L10;
                      } else {
                        ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    if (td.field_b != var2) {
                      ((ef) this).field_l.a(var3, false, var2);
                      break L11;
                    } else {
                      if (var3 == ps.field_h) {
                        break L11;
                      } else {
                        ((ef) this).field_l.a(var3, false, var2);
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (-1 <= (((ef) this).field_e ^ -1)) {
                      break L12;
                    } else {
                      ci.field_g = (-td.field_b + ((ef) this).field_e) / 2;
                      break L12;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            ((ef) this).field_b = false;
            return;
          }
        } else {
          return;
        }
    }

    final hj b(byte param0) {
        hj var2 = null;
        ((ef) this).field_n = ps.field_h;
        ((ef) this).field_r = td.field_b;
        ((ef) this).field_l.a(((ef) this).field_u, false, ((ef) this).field_c);
        if (param0 != -111) {
          L0: {
            ((ef) this).field_p = -7;
            or.field_c = false;
            var2 = uj.a(pt.field_b, 0, ((ef) this).field_c, 0, 0, ((ef) this).field_u);
            if (var2 == null) {
              ((ef) this).c(1);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            or.field_c = false;
            var2 = uj.a(pt.field_b, 0, ((ef) this).field_c, 0, 0, ((ef) this).field_u);
            if (var2 == null) {
              ((ef) this).c(1);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final static float a(float param0, float param1, int param2, float param3, int param4) {
        float[] var5 = null;
        float[] var6 = null;
        if (param2 >= -30) {
          field_k = (gu) null;
          var6 = uj.field_a[param4];
          var5 = var6;
          return var6[1] * param3 + var6[0] * param0 + var6[2] * param1;
        } else {
          var6 = uj.field_a[param4];
          var5 = var6;
          return var6[1] * param3 + var6[0] * param0 + var6[2] * param1;
        }
    }

    final void c(int param0) {
        if (param0 != 1) {
          this.a((byte) -112);
          ((ef) this).field_l.a(((ef) this).field_n, false, ((ef) this).field_r);
          return;
        } else {
          ((ef) this).field_l.a(((ef) this).field_n, false, ((ef) this).field_r);
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ef) this).field_p = param2;
        ((ef) this).field_e = param1;
        if (param0 != 0) {
            ((ef) this).a(-48, -58, -98);
        }
    }

    final static void a(int param0, mg param1, mg param2, int param3, int param4, int param5) {
        if (param0 < 15) {
          field_g = (String) null;
          as.field_c = param3;
          ej.field_a = param2;
          pp.field_a = param5;
          u.field_g = param1;
          ud.field_g = param4;
          return;
        } else {
          as.field_c = param3;
          ej.field_a = param2;
          pp.field_a = param5;
          u.field_g = param1;
          ud.field_g = param4;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          if (((ef) this).field_s <= ki.field_g) {
            if (qr.field_a <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((ef) this).field_u = -43;
          if (((ef) this).field_s <= ki.field_g) {
            if (qr.field_a <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0) {
        if (jf.field_a == null) {
          if (param0 < 38) {
            float discarded$1 = ef.a(0.5743587017059326f, 1.6069247722625732f, 74, -0.5514667630195618f, -105);
            if (qr.field_a > 0) {
              if (((ef) this).field_b) {
                ((ef) this).field_j = ((ef) this).field_j - 1;
                if (0 >= ((ef) this).field_j - 1) {
                  ((ef) this).field_j = ((ef) this).field_f;
                  if (ki.field_g < ((ef) this).field_s) {
                    ((ef) this).field_b = false;
                    return;
                  } else {
                    this.a((byte) -122);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (((ef) this).field_e > td.field_b) {
                  ci.field_g = (((ef) this).field_e + -td.field_b) / 2;
                  if (((ef) this).field_t == td.field_b) {
                    if (((ef) this).field_h != ps.field_h) {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                    return;
                  }
                } else {
                  if (0 >= ((ef) this).field_e) {
                    if (((ef) this).field_t == td.field_b) {
                      if (((ef) this).field_h != ps.field_h) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      return;
                    }
                  } else {
                    ci.field_g = 0;
                    if (((ef) this).field_t == td.field_b) {
                      if (((ef) this).field_h == ps.field_h) {
                        return;
                      } else {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        return;
                      }
                    } else {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      return;
                    }
                  }
                }
              }
            } else {
              ((ef) this).field_b = false;
              if (((ef) this).field_b) {
                ((ef) this).field_j = ((ef) this).field_j - 1;
                if (0 >= ((ef) this).field_j - 1) {
                  ((ef) this).field_j = ((ef) this).field_f;
                  if (ki.field_g < ((ef) this).field_s) {
                    ((ef) this).field_b = false;
                    return;
                  } else {
                    this.a((byte) -122);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (((ef) this).field_e <= td.field_b) {
                  if (0 >= ((ef) this).field_e) {
                    L0: {
                      if (((ef) this).field_t != td.field_b) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        break L0;
                      } else {
                        if (((ef) this).field_h != ps.field_h) {
                          ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  } else {
                    ci.field_g = 0;
                    L1: {
                      if (((ef) this).field_t != td.field_b) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        break L1;
                      } else {
                        if (((ef) this).field_h != ps.field_h) {
                          ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  ci.field_g = (((ef) this).field_e + -td.field_b) / 2;
                  L2: {
                    if (((ef) this).field_t != td.field_b) {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      break L2;
                    } else {
                      if (((ef) this).field_h != ps.field_h) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return;
                }
              }
            }
          } else {
            if (qr.field_a > 0) {
              if (((ef) this).field_b) {
                ((ef) this).field_j = ((ef) this).field_j - 1;
                if (0 >= ((ef) this).field_j - 1) {
                  ((ef) this).field_j = ((ef) this).field_f;
                  if (ki.field_g < ((ef) this).field_s) {
                    ((ef) this).field_b = false;
                    return;
                  } else {
                    this.a((byte) -122);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (((ef) this).field_e <= td.field_b) {
                  if (0 >= ((ef) this).field_e) {
                    if (((ef) this).field_t == td.field_b) {
                      if (((ef) this).field_h == ps.field_h) {
                        return;
                      } else {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        return;
                      }
                    } else {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      return;
                    }
                  } else {
                    L3: {
                      ci.field_g = 0;
                      if (((ef) this).field_t != td.field_b) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        break L3;
                      } else {
                        if (((ef) this).field_h != ps.field_h) {
                          ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L4: {
                    ci.field_g = (((ef) this).field_e + -td.field_b) / 2;
                    if (((ef) this).field_t != td.field_b) {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      break L4;
                    } else {
                      if (((ef) this).field_h != ps.field_h) {
                        ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              ((ef) this).field_b = false;
              if (((ef) this).field_b) {
                ((ef) this).field_j = ((ef) this).field_j - 1;
                if (0 >= ((ef) this).field_j - 1) {
                  ((ef) this).field_j = ((ef) this).field_f;
                  if (ki.field_g < ((ef) this).field_s) {
                    ((ef) this).field_b = false;
                    return;
                  } else {
                    this.a((byte) -122);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L5: {
                  if (((ef) this).field_e > td.field_b) {
                    ci.field_g = (((ef) this).field_e + -td.field_b) / 2;
                    break L5;
                  } else {
                    if (0 >= ((ef) this).field_e) {
                      break L5;
                    } else {
                      ci.field_g = 0;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (((ef) this).field_t != td.field_b) {
                    ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                    break L6;
                  } else {
                    if (((ef) this).field_h != ps.field_h) {
                      ((ef) this).field_l.a(((ef) this).field_h, false, ((ef) this).field_t);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    private ef() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Menu";
        field_g = "Achievements are awarded in classic mode only";
        field_k = new gu("email");
        field_m = 0;
    }
}
