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

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = this.field_f;
        var3 = this.field_h;
        if (!this.a(20)) {
          this.field_b = false;
          return;
        } else {
          L0: {
            if (var3 <= this.field_n) {
              if (this.field_l > var3) {
                var3 = this.field_l;
                break L0;
              } else {
                break L0;
              }
            } else {
              var3 = this.field_n;
              break L0;
            }
          }
          L1: {
            if (this.field_o < var2) {
              var2 = this.field_o;
              break L1;
            } else {
              if (var2 < this.field_g) {
                var2 = this.field_g;
                break L1;
              } else {
                if (param0 == -17698) {
                  if (0.0f < this.field_j) {
                    L2: {
                      var4 = (int)(0.5f + (float)var3 * this.field_j);
                      if (var2 < var4) {
                        var3 = (int)((float)var2 / this.field_j);
                        break L2;
                      } else {
                        if (var2 <= var4) {
                          break L2;
                        } else {
                          L3: {
                            var2 = var4;
                            if (var2 != rda.field_p) {
                              this.field_a.a(99, var2, var3);
                              break L3;
                            } else {
                              if (fua.field_p != var3) {
                                this.field_a.a(99, var2, var3);
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L4: {
                            if (0 < this.field_f) {
                              qtb.field_o = (this.field_f + -rda.field_p) / 2;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if (var2 == rda.field_p) {
                      if (fua.field_p == var3) {
                        L5: {
                          if (0 < this.field_f) {
                            qtb.field_o = (this.field_f + -rda.field_p) / 2;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        return;
                      } else {
                        L6: {
                          this.field_a.a(99, var2, var3);
                          if (0 < this.field_f) {
                            qtb.field_o = (this.field_f + -rda.field_p) / 2;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        return;
                      }
                    } else {
                      L7: {
                        this.field_a.a(99, var2, var3);
                        if (0 < this.field_f) {
                          qtb.field_o = (this.field_f + -rda.field_p) / 2;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      if (var2 != rda.field_p) {
                        this.field_a.a(99, var2, var3);
                        break L8;
                      } else {
                        if (fua.field_p != var3) {
                          this.field_a.a(99, var2, var3);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (0 < this.field_f) {
                        qtb.field_o = (this.field_f + -rda.field_p) / 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                } else {
                  L10: {
                    this.field_n = -54;
                    if (0.0f < this.field_j) {
                      var4 = (int)(0.5f + (float)var3 * this.field_j);
                      if (var2 < var4) {
                        var3 = (int)((float)var2 / this.field_j);
                        break L10;
                      } else {
                        if (var2 <= var4) {
                          break L10;
                        } else {
                          var2 = var4;
                          break L10;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var2 != rda.field_p) {
                      this.field_a.a(99, var2, var3);
                      break L11;
                    } else {
                      if (fua.field_p != var3) {
                        this.field_a.a(99, var2, var3);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param0 == -17698) {
            if (0.0f < this.field_j) {
              L13: {
                var4 = (int)(0.5f + (float)var3 * this.field_j);
                if (var2 < var4) {
                  var3 = (int)((float)var2 / this.field_j);
                  break L13;
                } else {
                  if (var2 <= var4) {
                    break L13;
                  } else {
                    var2 = var4;
                    if (var2 == rda.field_p) {
                      if (fua.field_p == var3) {
                        L14: {
                          if (0 < this.field_f) {
                            qtb.field_o = (this.field_f + -rda.field_p) / 2;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          this.field_a.a(99, var2, var3);
                          if (0 < this.field_f) {
                            qtb.field_o = (this.field_f + -rda.field_p) / 2;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      L16: {
                        this.field_a.a(99, var2, var3);
                        if (0 < this.field_f) {
                          qtb.field_o = (this.field_f + -rda.field_p) / 2;
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
              if (var2 == rda.field_p) {
                if (fua.field_p != var3) {
                  L17: {
                    this.field_a.a(99, var2, var3);
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                } else {
                  L18: {
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  this.field_a.a(99, var2, var3);
                  if (0 < this.field_f) {
                    qtb.field_o = (this.field_f + -rda.field_p) / 2;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            } else {
              if (var2 == rda.field_p) {
                if (fua.field_p == var3) {
                  L20: {
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                } else {
                  L21: {
                    this.field_a.a(99, var2, var3);
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                L22: {
                  this.field_a.a(99, var2, var3);
                  if (0 < this.field_f) {
                    qtb.field_o = (this.field_f + -rda.field_p) / 2;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return;
              }
            }
          } else {
            this.field_n = -54;
            if (0.0f < this.field_j) {
              var4 = (int)(0.5f + (float)var3 * this.field_j);
              if (var2 >= var4) {
                if (var2 <= var4) {
                  L23: {
                    if (var2 != rda.field_p) {
                      this.field_a.a(99, var2, var3);
                      break L23;
                    } else {
                      if (fua.field_p != var3) {
                        this.field_a.a(99, var2, var3);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                } else {
                  var2 = var4;
                  L25: {
                    if (var2 != rda.field_p) {
                      this.field_a.a(99, var2, var3);
                      break L25;
                    } else {
                      if (fua.field_p != var3) {
                        this.field_a.a(99, var2, var3);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (0 < this.field_f) {
                      qtb.field_o = (this.field_f + -rda.field_p) / 2;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  return;
                }
              } else {
                L27: {
                  var3 = (int)((float)var2 / this.field_j);
                  if (var2 != rda.field_p) {
                    this.field_a.a(99, var2, var3);
                    break L27;
                  } else {
                    if (fua.field_p != var3) {
                      this.field_a.a(99, var2, var3);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                }
                L28: {
                  if (0 < this.field_f) {
                    qtb.field_o = (this.field_f + -rda.field_p) / 2;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              }
            } else {
              L29: {
                if (var2 != rda.field_p) {
                  this.field_a.a(99, var2, var3);
                  break L29;
                } else {
                  if (fua.field_p != var3) {
                    this.field_a.a(99, var2, var3);
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              L30: {
                if (0 < this.field_f) {
                  qtb.field_o = (this.field_f + -rda.field_p) / 2;
                  break L30;
                } else {
                  break L30;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_q = param2;
        if (param1 != 480) {
            this.field_s = -38;
            this.field_e = param0;
            return;
        }
        this.field_e = param0;
    }

    final ufb a(byte param0) {
        ufb var2 = null;
        this.field_s = rda.field_p;
        this.field_r = fua.field_p;
        if (param0 >= 112) {
          this.field_a.a(65, this.field_q, this.field_e);
          rda.field_q = false;
          var2 = ob.a(0, bm.field_o, this.field_q, this.field_e, 0, 0);
          if (var2 == null) {
            this.c(-29674);
            return var2;
          } else {
            return var2;
          }
        } else {
          vfa.a(false, -4);
          this.field_a.a(65, this.field_q, this.field_e);
          rda.field_q = false;
          var2 = ob.a(0, bm.field_o, this.field_q, this.field_e, 0, 0);
          if (var2 != null) {
            return var2;
          } else {
            this.c(-29674);
            return var2;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 < 0) {
            return false;
        }
        if (this.field_i > qob.field_b) {
            return false;
        }
        if (hcb.field_o <= 0) {
            return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 == -17) {
          if ((hcb.field_o ^ -1) < -1) {
            if (this.field_i <= qob.field_b) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_i = 13;
          if ((hcb.field_o ^ -1) < -1) {
            if (this.field_i <= qob.field_b) {
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
        this.field_f = param1;
        int var4 = 89 / ((param0 - 14) / 39);
        this.field_h = param2;
    }

    public static void c(byte param0) {
        field_d = null;
        field_p = null;
        if (param0 != 120) {
            field_p = (ij) null;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 == 0) {
          if (this.field_g <= param1) {
            if (param1 <= this.field_o) {
              if (this.field_l <= param0) {
                if (this.field_n >= param0) {
                  if (this.field_j != 0.0f) {
                    if (Math.round(this.field_j * (float)param0) == param1) {
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
          this.field_b = true;
          if (this.field_g <= param1) {
            if (param1 <= this.field_o) {
              if (this.field_l <= param0) {
                if (this.field_n >= param0) {
                  if (this.field_j == 0.0f) {
                    return true;
                  } else {
                    L0: {
                      if (Math.round(this.field_j * (float)param0) != param1) {
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
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == psb.field_b) {
          if (0 >= hcb.field_o) {
            this.field_b = false;
            if (this.field_b) {
              fieldTemp$2 = this.field_k - 1;
              this.field_k = this.field_k - 1;
              if (0 < fieldTemp$2) {
                return;
              } else {
                this.field_k = this.field_m;
                if (param0 == 3908) {
                  if (qob.field_b >= this.field_i) {
                    this.b(-17698);
                    return;
                  } else {
                    this.field_b = false;
                    return;
                  }
                } else {
                  field_d = (phb[]) null;
                  if (qob.field_b >= this.field_i) {
                    this.b(-17698);
                    return;
                  } else {
                    this.field_b = false;
                    return;
                  }
                }
              }
            } else {
              if (this.field_f > rda.field_p) {
                qtb.field_o = (this.field_f + -rda.field_p) / 2;
                if (this.field_c == rda.field_p) {
                  if (this.field_t == fua.field_p) {
                    return;
                  } else {
                    this.field_a.a(98, this.field_c, this.field_t);
                    return;
                  }
                } else {
                  this.field_a.a(98, this.field_c, this.field_t);
                  return;
                }
              } else {
                if (-1 > (this.field_f ^ -1)) {
                  L0: {
                    qtb.field_o = 0;
                    if (this.field_c != rda.field_p) {
                      this.field_a.a(98, this.field_c, this.field_t);
                      break L0;
                    } else {
                      if (this.field_t != fua.field_p) {
                        this.field_a.a(98, this.field_c, this.field_t);
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                  return;
                } else {
                  if (this.field_c == rda.field_p) {
                    if (this.field_t == fua.field_p) {
                      return;
                    } else {
                      this.field_a.a(98, this.field_c, this.field_t);
                      return;
                    }
                  } else {
                    this.field_a.a(98, this.field_c, this.field_t);
                    return;
                  }
                }
              }
            }
          } else {
            if (this.field_b) {
              fieldTemp$3 = this.field_k - 1;
              this.field_k = this.field_k - 1;
              if (0 < fieldTemp$3) {
                return;
              } else {
                this.field_k = this.field_m;
                if (param0 == 3908) {
                  if (qob.field_b < this.field_i) {
                    this.field_b = false;
                    return;
                  } else {
                    this.b(-17698);
                    return;
                  }
                } else {
                  field_d = (phb[]) null;
                  if (qob.field_b < this.field_i) {
                    this.field_b = false;
                    return;
                  } else {
                    this.b(-17698);
                    return;
                  }
                }
              }
            } else {
              if (this.field_f <= rda.field_p) {
                if (-1 > (this.field_f ^ -1)) {
                  L1: {
                    qtb.field_o = 0;
                    if (this.field_c != rda.field_p) {
                      this.field_a.a(98, this.field_c, this.field_t);
                      break L1;
                    } else {
                      if (this.field_t != fua.field_p) {
                        this.field_a.a(98, this.field_c, this.field_t);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return;
                } else {
                  if (this.field_c == rda.field_p) {
                    if (this.field_t == fua.field_p) {
                      return;
                    } else {
                      this.field_a.a(98, this.field_c, this.field_t);
                      return;
                    }
                  } else {
                    this.field_a.a(98, this.field_c, this.field_t);
                    return;
                  }
                }
              } else {
                L2: {
                  qtb.field_o = (this.field_f + -rda.field_p) / 2;
                  if (this.field_c != rda.field_p) {
                    this.field_a.a(98, this.field_c, this.field_t);
                    break L2;
                  } else {
                    if (this.field_t != fua.field_p) {
                      this.field_a.a(98, this.field_c, this.field_t);
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
          return;
        }
    }

    vfa(nka param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final static void a(boolean param0, int param1) {
        if (vba.f((byte) -91)) {
          L0: {
            if (param0) {
              dma.e(0, 0, dma.field_g, dma.field_j, 0, 192);
              break L0;
            } else {
              break L0;
            }
          }
          if (param1 != 20637) {
            field_d = (phb[]) null;
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
            this.field_j = 0.0f;
            this.field_a = param8;
            this.field_c = param4;
            this.field_b = false;
            this.field_l = param1;
            this.field_m = param7;
            this.field_i = param6;
            this.field_e = 480;
            this.field_t = param5;
            this.field_g = param0;
            this.field_o = param2;
            this.field_n = param3;
            this.field_q = 640;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "vfa.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 != -29674) {
          this.field_e = -17;
          this.field_a.a(114, this.field_s, this.field_r);
          return;
        } else {
          this.field_a.a(114, this.field_s, this.field_r);
          return;
        }
    }

    static {
        field_p = new ij();
    }
}
