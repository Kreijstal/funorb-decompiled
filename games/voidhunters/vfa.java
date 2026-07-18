/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vfa {
    private int field_r;
    private int field_c;
    private int field_h;
    private int field_m;
    private int field_s;
    private int field_f;
    private int field_o;
    private int field_n;
    int field_q;
    static ij field_p;
    private int field_t;
    private float field_j;
    int field_i;
    private int field_l;
    private int field_g;
    private nka field_a;
    int field_e;
    static phb[] field_d;
    private int field_k;
    boolean field_b;

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = ((vfa) this).field_f;
        var3 = ((vfa) this).field_h;
        if (!((vfa) this).a(20)) {
          ((vfa) this).field_b = false;
          return;
        } else {
          L0: {
            if (var3 <= ((vfa) this).field_n) {
              if (((vfa) this).field_l > var3) {
                var3 = ((vfa) this).field_l;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = ((vfa) this).field_n;
              break L0;
            }
          }
          L1: {
            if (((vfa) this).field_o < var2) {
              var2 = ((vfa) this).field_o;
              break L1;
            } else {
              if (var2 >= ((vfa) this).field_g) {
                break L1;
              } else {
                L2: {
                  var2 = ((vfa) this).field_g;
                  if (0.0f < ((vfa) this).field_j) {
                    var4 = (int)(0.5f + (float)var3 * ((vfa) this).field_j);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((vfa) this).field_j);
                      break L2;
                    } else {
                      if (var2 <= var4) {
                        if (var2 == rda.field_p) {
                          if (fua.field_p == var3) {
                            L3: {
                              if (0 < ((vfa) this).field_f) {
                                qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            return;
                          } else {
                            L4: {
                              ((vfa) this).field_a.a(99, var2, var3);
                              if (0 < ((vfa) this).field_f) {
                                qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            return;
                          }
                        } else {
                          L5: {
                            ((vfa) this).field_a.a(99, var2, var3);
                            if (0 < ((vfa) this).field_f) {
                              qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          return;
                        }
                      } else {
                        L6: {
                          var2 = var4;
                          if (var2 != rda.field_p) {
                            ((vfa) this).field_a.a(99, var2, var3);
                            break L6;
                          } else {
                            if (fua.field_p != var3) {
                              ((vfa) this).field_a.a(99, var2, var3);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (0 < ((vfa) this).field_f) {
                            qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                if (var2 == rda.field_p) {
                  if (fua.field_p == var3) {
                    L8: {
                      if (0 < ((vfa) this).field_f) {
                        qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    return;
                  } else {
                    L9: {
                      ((vfa) this).field_a.a(99, var2, var3);
                      if (0 < ((vfa) this).field_f) {
                        qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    ((vfa) this).field_a.a(99, var2, var3);
                    if (0 < ((vfa) this).field_f) {
                      qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  return;
                }
              }
            }
          }
          if (0.0f < ((vfa) this).field_j) {
            L11: {
              var4 = (int)(0.5f + (float)var3 * ((vfa) this).field_j);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((vfa) this).field_j);
                break L11;
              } else {
                if (var2 <= var4) {
                  break L11;
                } else {
                  var2 = var4;
                  if (var2 == rda.field_p) {
                    if (fua.field_p == var3) {
                      L12: {
                        if (0 < ((vfa) this).field_f) {
                          qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      return;
                    } else {
                      L13: {
                        ((vfa) this).field_a.a(99, var2, var3);
                        if (0 < ((vfa) this).field_f) {
                          qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      ((vfa) this).field_a.a(99, var2, var3);
                      if (0 < ((vfa) this).field_f) {
                        qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (var2 == rda.field_p) {
              if (fua.field_p != var3) {
                L15: {
                  ((vfa) this).field_a.a(99, var2, var3);
                  if (0 < ((vfa) this).field_f) {
                    qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                return;
              } else {
                L16: {
                  if (0 < ((vfa) this).field_f) {
                    qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                return;
              }
            } else {
              L17: {
                ((vfa) this).field_a.a(99, var2, var3);
                if (0 < ((vfa) this).field_f) {
                  qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            }
          } else {
            if (var2 == rda.field_p) {
              if (fua.field_p == var3) {
                L18: {
                  if (0 < ((vfa) this).field_f) {
                    qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                return;
              } else {
                L19: {
                  ((vfa) this).field_a.a(99, var2, var3);
                  if (0 < ((vfa) this).field_f) {
                    qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            } else {
              L20: {
                ((vfa) this).field_a.a(99, var2, var3);
                if (0 < ((vfa) this).field_f) {
                  qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                  break L20;
                } else {
                  break L20;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        ((vfa) this).field_q = param2;
        if (param1 != 480) {
            ((vfa) this).field_s = -38;
            ((vfa) this).field_e = param0;
            return;
        }
        ((vfa) this).field_e = param0;
    }

    final ufb a(byte param0) {
        ufb var2 = null;
        ((vfa) this).field_s = rda.field_p;
        ((vfa) this).field_r = fua.field_p;
        if (param0 >= 112) {
          ((vfa) this).field_a.a(65, ((vfa) this).field_q, ((vfa) this).field_e);
          rda.field_q = false;
          int discarded$8 = 0;
          int discarded$9 = 0;
          var2 = ob.a(0, bm.field_o, ((vfa) this).field_q, ((vfa) this).field_e);
          if (var2 == null) {
            ((vfa) this).c(-29674);
            return var2;
          } else {
            return var2;
          }
        } else {
          vfa.a(false, -4);
          ((vfa) this).field_a.a(65, ((vfa) this).field_q, ((vfa) this).field_e);
          rda.field_q = false;
          int discarded$10 = 0;
          int discarded$11 = 0;
          var2 = ob.a(0, bm.field_o, ((vfa) this).field_q, ((vfa) this).field_e);
          if (var2 != null) {
            return var2;
          } else {
            ((vfa) this).c(-29674);
            return var2;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 < 0) {
            return false;
        }
        if (((vfa) this).field_i > qob.field_b) {
            return false;
        }
        if (hcb.field_o <= 0) {
            return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 == -17) {
          if (hcb.field_o > 0) {
            if (((vfa) this).field_i <= qob.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((vfa) this).field_i = 13;
          if (hcb.field_o > 0) {
            if (((vfa) this).field_i <= qob.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        ((vfa) this).field_f = param1;
        int var4 = 89 / ((param0 - 14) / 39);
        ((vfa) this).field_h = param2;
    }

    public static void c() {
        field_d = null;
        field_p = null;
    }

    final boolean b(int param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 == 0) {
          if (((vfa) this).field_g <= param1) {
            if (param1 <= ((vfa) this).field_o) {
              if (((vfa) this).field_l <= param0) {
                if (((vfa) this).field_n >= param0) {
                  if (((vfa) this).field_j != 0.0f) {
                    if (Math.round(((vfa) this).field_j * (float)param0) == param1) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((vfa) this).field_b = true;
          if (((vfa) this).field_g <= param1) {
            if (param1 <= ((vfa) this).field_o) {
              if (((vfa) this).field_l <= param0) {
                if (((vfa) this).field_n >= param0) {
                  if (((vfa) this).field_j == 0.0f) {
                    return true;
                  } else {
                    L0: {
                      if (Math.round(((vfa) this).field_j * (float)param0) != param1) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L0;
                      }
                    }
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void d(int param0) {
        if (null == psb.field_b) {
          if (0 >= hcb.field_o) {
            ((vfa) this).field_b = false;
            if (((vfa) this).field_b) {
              int fieldTemp$6 = ((vfa) this).field_k - 1;
              ((vfa) this).field_k = ((vfa) this).field_k - 1;
              if (0 < fieldTemp$6) {
                return;
              } else {
                ((vfa) this).field_k = ((vfa) this).field_m;
                if (param0 == 3908) {
                  if (qob.field_b >= ((vfa) this).field_i) {
                    int discarded$7 = -17698;
                    this.b();
                    return;
                  } else {
                    ((vfa) this).field_b = false;
                    return;
                  }
                } else {
                  field_d = null;
                  if (qob.field_b >= ((vfa) this).field_i) {
                    int discarded$8 = -17698;
                    this.b();
                    return;
                  } else {
                    ((vfa) this).field_b = false;
                    return;
                  }
                }
              }
            } else {
              if (((vfa) this).field_f > rda.field_p) {
                qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                if (((vfa) this).field_c != rda.field_p) {
                  ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                  return;
                } else {
                  if (((vfa) this).field_t != fua.field_p) {
                    ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (((vfa) this).field_f > 0) {
                  qtb.field_o = 0;
                  if (((vfa) this).field_c != rda.field_p) {
                    ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                    return;
                  } else {
                    if (((vfa) this).field_t != fua.field_p) {
                      ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  if (((vfa) this).field_c != rda.field_p) {
                    ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                    return;
                  } else {
                    if (((vfa) this).field_t != fua.field_p) {
                      ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          } else {
            if (((vfa) this).field_b) {
              int fieldTemp$9 = ((vfa) this).field_k - 1;
              ((vfa) this).field_k = ((vfa) this).field_k - 1;
              if (0 < fieldTemp$9) {
                return;
              } else {
                ((vfa) this).field_k = ((vfa) this).field_m;
                if (param0 == 3908) {
                  if (qob.field_b >= ((vfa) this).field_i) {
                    int discarded$10 = -17698;
                    this.b();
                    return;
                  } else {
                    ((vfa) this).field_b = false;
                    return;
                  }
                } else {
                  field_d = null;
                  if (qob.field_b >= ((vfa) this).field_i) {
                    int discarded$11 = -17698;
                    this.b();
                    return;
                  } else {
                    ((vfa) this).field_b = false;
                    return;
                  }
                }
              }
            } else {
              if (((vfa) this).field_f > rda.field_p) {
                qtb.field_o = (((vfa) this).field_f + -rda.field_p) / 2;
                if (((vfa) this).field_c == rda.field_p) {
                  if (((vfa) this).field_t == fua.field_p) {
                    return;
                  } else {
                    ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                    return;
                  }
                } else {
                  ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                  return;
                }
              } else {
                if (((vfa) this).field_f > 0) {
                  L0: {
                    qtb.field_o = 0;
                    if (((vfa) this).field_c != rda.field_p) {
                      ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                      break L0;
                    } else {
                      if (((vfa) this).field_t != fua.field_p) {
                        ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                  return;
                } else {
                  if (((vfa) this).field_c != rda.field_p) {
                    ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                    return;
                  } else {
                    if (((vfa) this).field_t != fua.field_p) {
                      ((vfa) this).field_a.a(98, ((vfa) this).field_c, ((vfa) this).field_t);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    vfa(nka param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final static void a(boolean param0, int param1) {
        if (vba.f((byte) -91)) {
          if (param1 != 20637) {
            field_d = null;
            qn.field_h.a(0, 0, 0);
            return;
          } else {
            qn.field_h.a(0, 0, 0);
            return;
          }
        } else {
          return;
        }
    }

    private vfa(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, nka param8) {
        try {
            ((vfa) this).field_j = 0.0f;
            ((vfa) this).field_a = param8;
            ((vfa) this).field_c = param4;
            ((vfa) this).field_b = false;
            ((vfa) this).field_l = param1;
            ((vfa) this).field_m = param7;
            ((vfa) this).field_i = param6;
            ((vfa) this).field_e = 480;
            ((vfa) this).field_t = param5;
            ((vfa) this).field_g = param0;
            ((vfa) this).field_o = param2;
            ((vfa) this).field_n = param3;
            ((vfa) this).field_q = 640;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "vfa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -29674) {
          ((vfa) this).field_e = -17;
          ((vfa) this).field_a.a(114, ((vfa) this).field_s, ((vfa) this).field_r);
          return;
        } else {
          ((vfa) this).field_a.a(114, ((vfa) this).field_s, ((vfa) this).field_r);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new ij();
    }
}
