/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hm extends hg {
    wn field_q;
    boolean field_u;
    pg field_p;
    int field_j;
    String field_l;
    int field_x;
    db field_s;
    int field_n;
    int field_t;
    int field_k;
    static String field_m;
    int field_g;
    static String field_r;
    static pf field_o;
    static int[] field_h;
    static int[] field_w;
    String field_i;
    int field_v;

    final boolean a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 57) {
          if (param0 >= this.field_k + param2) {
            if (param4 + this.field_j <= param1) {
              if (this.field_k + (param2 + this.field_g) > param0) {
                if (this.field_x + (param4 - -this.field_j) <= param1) {
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
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(char param0, int param1, byte param2) {
        int var4;
        if (this.h(0)) {
          if (!this.a((hm) (this), param0, param1, 23)) {
            var4 = param1;
            if (var4 == 80) {
              return this.a(-4659, (hm) (this));
            } else {
              if (param2 >= -106) {
                this.a(44, -93, 57, (byte) 126, 65);
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          var4 = param1;
          if (var4 == 80) {
            return this.a(-4659, (hm) (this));
          } else {
            if (param2 >= -106) {
              this.a(44, -93, 57, (byte) 126, 65);
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var7;
        hm var8;
        ni var9;
        ni var10;
        ni var11;
        ni var12;
        ni var13;
        ni var14;
        ni var15;
        ni var16;
        ni var17;
        var7 = EscapeVector.field_A;
        this.a(-14472, param3, param2, (hm) (this));
        if (param1 != -33) {
          L0: {
            var8 = (hm) null;
            this.a(1, (hm) null);
            var5 = this.h(0) ? 1 : 0;
            if (!param0) {
              if (var5 == 0) {
                break L0;
              } else {
                if (0 == qi.field_N) {
                  break L0;
                } else {
                  this.f(84);
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
              }
            } else {
              if (mg.field_f != 0) {
                L1: {
                  if (var5 == 0) {
                    break L1;
                  } else {
                    this.b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) (this), param2);
                    break L1;
                  }
                }
                if (qi.field_N != 0) {
                  L2: {
                    L3: {
                      if (!this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) (this), qi.field_N)) {
                        break L3;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (var5 != 0) {
                      this.f(122);
                      break L2;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                          var16 = gf.field_b;
                          if (var16 != null) {
                            if (!(var16.field_q instanceof mk)) {
                              L4: {
                                gf.field_b = null;
                                if (var7 == 0) {
                                  break L4;
                                } else {
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    if (0 == qi.field_N) {
                                      break L4;
                                    } else {
                                      this.f(84);
                                      break L4;
                                    }
                                  }
                                }
                              }
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, this.d(1));
                              return param0;
                            } else {
                              ((mk) ((Object) var16.field_q)).a((qa) null, var16, (byte) -124);
                              L5: {
                                gf.field_b = null;
                                if (var7 == 0) {
                                  break L5;
                                } else {
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    if (0 == qi.field_N) {
                                      break L5;
                                    } else {
                                      this.f(84);
                                      break L5;
                                    }
                                  }
                                }
                              }
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, this.d(1));
                              return param0;
                            }
                          } else {
                            if (var7 != 0) {
                              if (var5 != 0) {
                                if (0 == qi.field_N) {
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, this.d(1));
                                  return param0;
                                } else {
                                  this.f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, this.d(1));
                                  return param0;
                                }
                              } else {
                                bb.field_H = eb.field_K;
                                ve.a((byte) -112, this.d(1));
                                return param0;
                              }
                            } else {
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, this.d(1));
                              return param0;
                            }
                          }
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, this.d(1));
                        return param0;
                      }
                    }
                  }
                  if (0 != eb.field_K) {
                    break L0;
                  } else {
                    if (bb.field_H != 0) {
                      this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                      var17 = gf.field_b;
                      if (var17 != null) {
                        if (!(var17.field_q instanceof mk)) {
                          L6: {
                            gf.field_b = null;
                            if (var7 == 0) {
                              break L6;
                            } else {
                              if (var5 == 0) {
                                break L6;
                              } else {
                                if (0 == qi.field_N) {
                                  break L6;
                                } else {
                                  this.f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, this.d(1));
                                  return param0;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        } else {
                          ((mk) ((Object) var17.field_q)).a((qa) null, var17, (byte) -124);
                          L7: {
                            gf.field_b = null;
                            if (var7 == 0) {
                              break L7;
                            } else {
                              if (var5 == 0) {
                                break L7;
                              } else {
                                if (0 == qi.field_N) {
                                  break L7;
                                } else {
                                  this.f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, this.d(1));
                                  return param0;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        }
                      } else {
                        L8: {
                          if (var7 == 0) {
                            break L8;
                          } else {
                            if (var5 == 0) {
                              break L8;
                            } else {
                              if (0 == qi.field_N) {
                                break L8;
                              } else {
                                this.f(84);
                                bb.field_H = eb.field_K;
                                ve.a((byte) -112, this.d(1));
                                return param0;
                              }
                            }
                          }
                        }
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, this.d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  }
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H == 0) {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    } else {
                      L9: {
                        this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                        var15 = gf.field_b;
                        if (var15 != null) {
                          if (!(var15.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L9;
                          } else {
                            ((mk) ((Object) var15.field_q)).a((qa) null, var15, (byte) -124);
                            gf.field_b = null;
                            break L9;
                          }
                        } else {
                          break L9;
                        }
                      }
                      L10: {
                        if (var7 == 0) {
                          break L10;
                        } else {
                          if (var5 == 0) {
                            break L10;
                          } else {
                            if (0 == qi.field_N) {
                              break L10;
                            } else {
                              this.f(84);
                              break L10;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, this.d(1));
                    return param0;
                  }
                }
              } else {
                if (qi.field_N != 0) {
                  L11: {
                    L12: {
                      if (!this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) (this), qi.field_N)) {
                        break L12;
                      } else {
                        param0 = false;
                        if (var7 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (var5 != 0) {
                      this.f(122);
                      break L11;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          L13: {
                            this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                            var13 = gf.field_b;
                            if (var13 != null) {
                              if (!(var13.field_q instanceof mk)) {
                                gf.field_b = null;
                                break L13;
                              } else {
                                ((mk) ((Object) var13.field_q)).a((qa) null, var13, (byte) -124);
                                gf.field_b = null;
                                break L13;
                              }
                            } else {
                              break L13;
                            }
                          }
                          L14: {
                            if (var7 == 0) {
                              break L14;
                            } else {
                              if (var5 == 0) {
                                break L14;
                              } else {
                                if (0 == qi.field_N) {
                                  break L14;
                                } else {
                                  this.f(84);
                                  break L14;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, this.d(1));
                        return param0;
                      }
                    }
                  }
                  if (0 == eb.field_K) {
                    if (bb.field_H != 0) {
                      this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                      var14 = gf.field_b;
                      if (var14 != null) {
                        if (!(var14.field_q instanceof mk)) {
                          L15: {
                            gf.field_b = null;
                            if (var7 == 0) {
                              break L15;
                            } else {
                              if (var5 == 0) {
                                break L15;
                              } else {
                                if (0 == qi.field_N) {
                                  break L15;
                                } else {
                                  this.f(84);
                                  break L15;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        } else {
                          ((mk) ((Object) var14.field_q)).a((qa) null, var14, (byte) -124);
                          L16: {
                            gf.field_b = null;
                            if (var7 == 0) {
                              break L16;
                            } else {
                              if (var5 == 0) {
                                break L16;
                              } else {
                                if (0 == qi.field_N) {
                                  break L16;
                                } else {
                                  this.f(84);
                                  break L16;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, this.d(1));
                          return param0;
                        }
                      } else {
                        L17: {
                          if (var7 == 0) {
                            break L17;
                          } else {
                            if (var5 == 0) {
                              break L17;
                            } else {
                              if (0 == qi.field_N) {
                                break L17;
                              } else {
                                this.f(84);
                                break L17;
                              }
                            }
                          }
                        }
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, this.d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, this.d(1));
                    return param0;
                  }
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H != 0) {
                      L18: {
                        this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                        var12 = gf.field_b;
                        if (var12 != null) {
                          if (!(var12.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L18;
                          } else {
                            ((mk) ((Object) var12.field_q)).a((qa) null, var12, (byte) -124);
                            gf.field_b = null;
                            break L18;
                          }
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (var7 == 0) {
                          break L19;
                        } else {
                          if (var5 == 0) {
                            break L19;
                          } else {
                            if (0 == qi.field_N) {
                              break L19;
                            } else {
                              this.f(84);
                              break L19;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, this.d(1));
                    return param0;
                  }
                }
              }
            }
          }
          bb.field_H = eb.field_K;
          ve.a((byte) -112, this.d(1));
          return param0;
        } else {
          var5 = this.h(0) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (0 != qi.field_N) {
                this.f(84);
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
            } else {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, this.d(1));
              return param0;
            }
          } else {
            L20: {
              if (mg.field_f == 0) {
                break L20;
              } else {
                if (var5 == 0) {
                  break L20;
                } else {
                  this.b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) (this), param2);
                  break L20;
                }
              }
            }
            if (qi.field_N != 0) {
              L21: {
                L22: {
                  if (!this.a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) (this), qi.field_N)) {
                    break L22;
                  } else {
                    param0 = false;
                    if (var7 == 0) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
                if (var5 != 0) {
                  this.f(122);
                  break L21;
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H == 0) {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    } else {
                      L23: {
                        this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                        var10 = gf.field_b;
                        if (var10 != null) {
                          if (!(var10.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L23;
                          } else {
                            ((mk) ((Object) var10.field_q)).a((qa) null, var10, (byte) -124);
                            gf.field_b = null;
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      L24: {
                        if (var7 == 0) {
                          break L24;
                        } else {
                          if (var5 == 0) {
                            break L24;
                          } else {
                            if (0 == qi.field_N) {
                              break L24;
                            } else {
                              this.f(84);
                              break L24;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, this.d(1));
                    return param0;
                  }
                }
              }
              if (0 == eb.field_K) {
                if (bb.field_H != 0) {
                  this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                  var11 = gf.field_b;
                  if (var11 != null) {
                    if (!(var11.field_q instanceof mk)) {
                      L25: {
                        gf.field_b = null;
                        if (var7 == 0) {
                          break L25;
                        } else {
                          if (var5 == 0) {
                            break L25;
                          } else {
                            if (0 == qi.field_N) {
                              break L25;
                            } else {
                              this.f(84);
                              break L25;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    } else {
                      ((mk) ((Object) var11.field_q)).a((qa) null, var11, (byte) -124);
                      L26: {
                        gf.field_b = null;
                        if (var7 == 0) {
                          break L26;
                        } else {
                          if (var5 == 0) {
                            break L26;
                          } else {
                            if (0 == qi.field_N) {
                              break L26;
                            } else {
                              this.f(84);
                              break L26;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, this.d(1));
                      return param0;
                    }
                  } else {
                    L27: {
                      if (var7 == 0) {
                        break L27;
                      } else {
                        if (var5 == 0) {
                          break L27;
                        } else {
                          if (0 == qi.field_N) {
                            break L27;
                          } else {
                            this.f(84);
                            break L27;
                          }
                        }
                      }
                    }
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, this.d(1));
                    return param0;
                  }
                } else {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
            } else {
              if (0 == eb.field_K) {
                if (bb.field_H == 0) {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                } else {
                  L28: {
                    this.a(bj.field_y, param2, dh.field_d, param3, (hm) (this), (byte) -113);
                    var9 = gf.field_b;
                    if (var9 != null) {
                      if (!(var9.field_q instanceof mk)) {
                        gf.field_b = null;
                        break L28;
                      } else {
                        ((mk) ((Object) var9.field_q)).a((qa) null, var9, (byte) -124);
                        gf.field_b = null;
                        break L28;
                      }
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (var7 == 0) {
                      break L29;
                    } else {
                      if (var5 == 0) {
                        break L29;
                      } else {
                        if (0 == qi.field_N) {
                          break L29;
                        } else {
                          this.f(84);
                          break L29;
                        }
                      }
                    }
                  }
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, this.d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, this.d(1));
                return param0;
              }
            }
          }
        }
    }

    final void i(int param0) {
        this.a(this.field_g, this.field_j, this.field_k, true, this.field_x);
        if (param0 != 0) {
            this.field_u = true;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        var7 = EscapeVector.field_A;
        var4 = this.e(12050);
        var5_int = -73 / ((8 - param2) / 59);
        var6 = 0;
        L0: while (true) {
          L1: {
            if (var4 < var6) {
              break L1;
            } else {
              this.a(param1, (byte) 88, var6, param0);
              var6++;
              if (var7 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            var5 = eo.a((byte) 46);
            if (var5 != null) {
              mb.field_g.a((byte) -44, var5, ni.field_O, ci.field_g);
              break L2;
            } else {
              break L2;
            }
          }
          return;
        }
    }

    boolean b(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 < -103) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              field_r = (String) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var8);

            stackIn_6_1 = new StringBuilder().append("hm.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param6 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final String toString() {
        return this.a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
            int var7_int = -66 / ((-39 - param5) / 45);
            this.field_t = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hm.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    hm(String param0, wn param1) {
        this(param0, mb.field_g.field_i, param1);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        RuntimeException var5 = null;
        StringBuilder stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                this.field_t = 15;
                break L1;
              }
            }
            L2: {
              if (this.a(param3, param1, param2, false)) {
                this.a(param1, param2, param3, param0 + 1);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (StringBuilder) (param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hm.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -4659) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              this.h(1);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("hm.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void d(byte param0) {
        field_o = null;
        if (param0 != 58) {
          hm.g(80);
          field_r = null;
          field_m = null;
          field_h = null;
          field_w = null;
          return;
        } else {
          field_r = null;
          field_m = null;
          field_h = null;
          field_w = null;
          return;
        }
    }

    void f(int param0) {
        if (param0 <= 46) {
            this.toString();
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 >= 0) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("hm.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    int e(int param0) {
        if (param0 != 12050) {
            this.field_q = (wn) null;
            return 0;
        }
        return 0;
    }

    String d(int param0) {
        if (param0 != 1) {
            return (String) null;
        }
        if (!this.field_u) {
            return null;
        }
        return this.field_i;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 >= 85) {
          if (-1 == (param2 ^ -1)) {
            if (this.field_s == null) {
              return;
            } else {
              this.field_s.a(param3, param0, -88, (hm) (this), true);
              return;
            }
          } else {
            return;
          }
        } else {
          field_r = (String) null;
          if (-1 == (param2 ^ -1)) {
            if (this.field_s == null) {
              return;
            } else {
              this.field_s.a(param3, param0, -88, (hm) (this), true);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              discarded$0 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(this.field_k).append(",").append(this.field_j).append(" ").append(this.field_g).append("x").append(this.field_x);
              if (null == this.field_l) {
                break L1;
              } else {
                discarded$1 = param1.append(" text=\"").append(this.field_l).append('"');
                break L1;
              }
            }
            L2: {
              if (this.field_u) {
                discarded$2 = param1.append(" mouseover");
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!this.h(param3 ^ param3)) {
                break L3;
              } else {
                discarded$3 = param1.append(" focused");
                break L3;
              }
            }
            L4: {
              if (null != this.field_s) {
                L5: {
                  discarded$4 = param1.append(" renderer=");
                  if (!(this.field_s instanceof hm)) {
                    break L5;
                  } else {
                    param1 = this.a(0, param0, param1, 1 + param2);
                    if (var6 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                discarded$5 = param1.append(this.field_s);
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (null != this.field_q) {
                L7: {
                  L8: {
                    discarded$6 = param1.append(" listener=");
                    if (this.field_q instanceof hm) {
                      break L8;
                    } else {
                      discarded$7 = param1.append(this.field_q);
                      if (var6 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  param1 = this.a(param3 + -1, param0, param1, 1 + param2);
                  break L7;
                }
                break L6;
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("hm.HB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$1 = null;
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                this.toString();
                break L1;
              }
            }
            if (!param1.containsKey(this)) {
              param1.put(this, this);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              discarded$1 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("hm.FB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.a(param1, param3, param4, (byte) 105, param0)) {
                this.field_t = param6;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param2 == 3) {
                break L2;
              } else {
                this.f(99);
                break L2;
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var8);

            stackIn_9_1 = new StringBuilder().append("hm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param6 + ')');
        }
        return stackIn_6_0 != 0;
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        hm var7;
        if (!param3) {
          var7 = (hm) null;
          this.a(-63, -124, (byte) 29, -14, 125, (hm) null, -5);
          this.field_k = param2;
          this.field_x = param4;
          this.field_j = param1;
          this.field_g = param0;
          return;
        } else {
          this.field_k = param2;
          this.field_x = param4;
          this.field_j = param1;
          this.field_g = param0;
          return;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var5_int = 0;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            if (param0 == -14472) {
              L1: {
                var5_int = this.a(dh.field_d, bj.field_y, param2, (byte) 70, param1) ? 1 : 0;
                stackIn_4_0 = this.field_u;

                if (var5_int != 0) {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = stackIn_4_0;
                  stackIn_5_1 = 1;
                  break L1;
                }
              }
              L2: {
                if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
                  L3: {
                    stackIn_9_0 = this;

                    if (var5_int == 0) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 0;
                      break L3;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 1;
                      break L3;
                    }
                  }
                  L4: {
                    ((hm) (this)).field_u = stackIn_10_1 != 0;
                    if (this.field_q == null) {
                      break L4;
                    } else {
                      if (this.field_q instanceof nj) {
                        ((nj) ((Object) this.field_q)).a((hm) (this), -27200, var5_int != 0);
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  break L2;
                } else {
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("hm.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean g(int param0) {
        if (param0 != 11187) {
            return false;
        }
        return df.field_d == null ? rk.field_b : true;
    }

    protected hm() {
        this.field_n = 0;
        this.field_v = 0;
    }

    hm(String param0, db param1, wn param2) {
        RuntimeException runtimeException = null;
        ao var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_n = 0;
        this.field_v = 0;
        try {
          L0: {
            L1: {
              this.field_s = param1;
              this.field_q = param2;
              this.field_l = param0;
              if (!(this.field_s instanceof ao)) {
                break L1;
              } else {
                var4 = (ao) ((Object) this.field_s);
                this.field_g = var4.a((byte) -46, (hm) (this));
                this.field_x = var4.a(-127, (hm) (this));
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("hm.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
    }

    hm(int param0, int param1, int param2, int param3, db param4, wn param5) {
        this.field_n = 0;
        this.field_v = 0;
        try {
            this.field_g = param2;
            this.field_k = param0;
            this.field_s = param4;
            this.field_q = param5;
            this.field_j = param1;
            this.field_x = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Suggested names: ";
        field_r = "FROM ONLY";
        field_w = new int[8192];
        field_h = new int[8192];
    }
}
