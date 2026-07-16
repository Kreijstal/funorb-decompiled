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
          if (param0 >= ((hm) this).field_k + param2) {
            if (param4 + ((hm) this).field_j <= param1) {
              if (((hm) this).field_k + (param2 + ((hm) this).field_g) > param0) {
                if (((hm) this).field_x + (param4 - -((hm) this).field_j) <= param1) {
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
        int var4 = 0;
        if (((hm) this).h(0)) {
          if (!((hm) this).a((hm) this, param0, param1, 23)) {
            var4 = param1;
            if (var4 == 80) {
              return ((hm) this).a(-4659, (hm) this);
            } else {
              if (param2 >= -106) {
                boolean discarded$4 = ((hm) this).a(44, -93, 57, (byte) 126, 65);
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
            return ((hm) this).a(-4659, (hm) this);
          } else {
            if (param2 >= -106) {
              boolean discarded$5 = ((hm) this).a(44, -93, 57, (byte) 126, 65);
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final boolean a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        ni var6 = null;
        int var7 = 0;
        Object var8 = null;
        var7 = EscapeVector.field_A;
        ((hm) this).a(-14472, param3, param2, (hm) this);
        if (param1 != -33) {
          L0: {
            var8 = null;
            boolean discarded$3 = ((hm) this).a(1, (hm) null);
            var5 = ((hm) this).h(0) ? 1 : 0;
            if (!param0) {
              if (var5 == 0) {
                break L0;
              } else {
                if (0 == qi.field_N) {
                  break L0;
                } else {
                  ((hm) this).f(84);
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              }
            } else {
              if (mg.field_f != 0) {
                L1: {
                  if (var5 == 0) {
                    break L1;
                  } else {
                    boolean discarded$4 = ((hm) this).b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) this, param2);
                    break L1;
                  }
                }
                if (qi.field_N != 0) {
                  L2: {
                    L3: {
                      if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
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
                      ((hm) this).f(122);
                      break L2;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                          var6 = gf.field_b;
                          if (var6 != null) {
                            if (!(var6.field_q instanceof mk)) {
                              L4: {
                                gf.field_b = null;
                                if (var5 == 0) {
                                  break L4;
                                } else {
                                  if (0 == qi.field_N) {
                                    break L4;
                                  } else {
                                    ((hm) this).f(84);
                                    break L4;
                                  }
                                }
                              }
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, ((hm) this).d(1));
                              return param0;
                            } else {
                              ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
                              L5: {
                                gf.field_b = null;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  if (0 == qi.field_N) {
                                    break L5;
                                  } else {
                                    ((hm) this).f(84);
                                    break L5;
                                  }
                                }
                              }
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, ((hm) this).d(1));
                              return param0;
                            }
                          } else {
                            if (var7 != 0) {
                              if (var5 != 0) {
                                if (0 == qi.field_N) {
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, ((hm) this).d(1));
                                  return param0;
                                } else {
                                  ((hm) this).f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, ((hm) this).d(1));
                                  return param0;
                                }
                              } else {
                                bb.field_H = eb.field_K;
                                ve.a((byte) -112, ((hm) this).d(1));
                                return param0;
                              }
                            } else {
                              bb.field_H = eb.field_K;
                              ve.a((byte) -112, ((hm) this).d(1));
                              return param0;
                            }
                          }
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    }
                  }
                  if (0 != eb.field_K) {
                    break L0;
                  } else {
                    if (bb.field_H != 0) {
                      ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                      var6 = gf.field_b;
                      if (var6 != null) {
                        if (!(var6.field_q instanceof mk)) {
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
                                  ((hm) this).f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, ((hm) this).d(1));
                                  return param0;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        } else {
                          ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                                  ((hm) this).f(84);
                                  bb.field_H = eb.field_K;
                                  ve.a((byte) -112, ((hm) this).d(1));
                                  return param0;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
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
                                ((hm) this).f(84);
                                bb.field_H = eb.field_K;
                                ve.a((byte) -112, ((hm) this).d(1));
                                return param0;
                              }
                            }
                          }
                        }
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  }
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H == 0) {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      L9: {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 != null) {
                          if (!(var6.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L9;
                          } else {
                            ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                              ((hm) this).f(84);
                              break L10;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                }
              } else {
                if (qi.field_N != 0) {
                  L11: {
                    L12: {
                      if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
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
                      ((hm) this).f(122);
                      break L11;
                    } else {
                      if (0 == eb.field_K) {
                        if (bb.field_H != 0) {
                          L13: {
                            ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                            var6 = gf.field_b;
                            if (var6 != null) {
                              if (!(var6.field_q instanceof mk)) {
                                gf.field_b = null;
                                break L13;
                              } else {
                                ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                                  ((hm) this).f(84);
                                  break L14;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        } else {
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        }
                      } else {
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    }
                  }
                  if (0 == eb.field_K) {
                    if (bb.field_H != 0) {
                      ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                      var6 = gf.field_b;
                      if (var6 != null) {
                        if (!(var6.field_q instanceof mk)) {
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
                                  ((hm) this).f(84);
                                  break L15;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
                          return param0;
                        } else {
                          ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                                  ((hm) this).f(84);
                                  break L16;
                                }
                              }
                            }
                          }
                          bb.field_H = eb.field_K;
                          ve.a((byte) -112, ((hm) this).d(1));
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
                                ((hm) this).f(84);
                                break L17;
                              }
                            }
                          }
                        }
                        bb.field_H = eb.field_K;
                        ve.a((byte) -112, ((hm) this).d(1));
                        return param0;
                      }
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H != 0) {
                      L18: {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 != null) {
                          if (!(var6.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L18;
                          } else {
                            ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                              ((hm) this).f(84);
                              break L19;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                }
              }
            }
          }
          bb.field_H = eb.field_K;
          ve.a((byte) -112, ((hm) this).d(1));
          return param0;
        } else {
          var5 = ((hm) this).h(0) ? 1 : 0;
          if (!param0) {
            if (var5 != 0) {
              if (0 != qi.field_N) {
                ((hm) this).f(84);
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              bb.field_H = eb.field_K;
              ve.a((byte) -112, ((hm) this).d(1));
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
                  boolean discarded$5 = ((hm) this).b(param3, mg.field_f, (byte) -109, bj.field_y, dh.field_d, (hm) this, param2);
                  break L20;
                }
              }
            }
            if (qi.field_N != 0) {
              L21: {
                L22: {
                  if (!((hm) this).a(param3, sf.field_c, (byte) 3, ng.field_ob, param2, (hm) this, qi.field_N)) {
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
                  ((hm) this).f(122);
                  break L21;
                } else {
                  if (0 == eb.field_K) {
                    if (bb.field_H == 0) {
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      L23: {
                        ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                        var6 = gf.field_b;
                        if (var6 != null) {
                          if (!(var6.field_q instanceof mk)) {
                            gf.field_b = null;
                            break L23;
                          } else {
                            ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                              ((hm) this).f(84);
                              break L24;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    }
                  } else {
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                }
              }
              if (0 == eb.field_K) {
                if (bb.field_H != 0) {
                  ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                  var6 = gf.field_b;
                  if (var6 != null) {
                    if (!(var6.field_q instanceof mk)) {
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
                              ((hm) this).f(84);
                              break L25;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
                      return param0;
                    } else {
                      ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                              ((hm) this).f(84);
                              break L26;
                            }
                          }
                        }
                      }
                      bb.field_H = eb.field_K;
                      ve.a((byte) -112, ((hm) this).d(1));
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
                            ((hm) this).f(84);
                            break L27;
                          }
                        }
                      }
                    }
                    bb.field_H = eb.field_K;
                    ve.a((byte) -112, ((hm) this).d(1));
                    return param0;
                  }
                } else {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            } else {
              if (0 == eb.field_K) {
                if (bb.field_H == 0) {
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                } else {
                  L28: {
                    ((hm) this).a(bj.field_y, param2, dh.field_d, param3, (hm) this, (byte) -113);
                    var6 = gf.field_b;
                    if (var6 != null) {
                      if (!(var6.field_q instanceof mk)) {
                        gf.field_b = null;
                        break L28;
                      } else {
                        ((mk) (Object) var6.field_q).a((qa) null, var6, (byte) -124);
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
                          ((hm) this).f(84);
                          break L29;
                        }
                      }
                    }
                  }
                  bb.field_H = eb.field_K;
                  ve.a((byte) -112, ((hm) this).d(1));
                  return param0;
                }
              } else {
                bb.field_H = eb.field_K;
                ve.a((byte) -112, ((hm) this).d(1));
                return param0;
              }
            }
          }
        }
    }

    final void i(int param0) {
        ((hm) this).a(((hm) this).field_g, ((hm) this).field_j, ((hm) this).field_k, true, ((hm) this).field_x);
        if (param0 != 0) {
            ((hm) this).field_u = true;
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = EscapeVector.field_A;
        var4 = ((hm) this).e(12050);
        var5_int = -73 / ((8 - param2) / 59);
        var6 = 0;
        L0: while (true) {
          L1: {
            if (var4 < var6) {
              break L1;
            } else {
              ((hm) this).a(param1, (byte) 88, var6, param0);
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
        if (param2 >= -103) {
            field_r = null;
            return false;
        }
        return false;
    }

    public final String toString() {
        return ((hm) this).a(0, new Hashtable(), new StringBuilder(), 0).toString();
    }

    void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        int var7 = -66 / ((-39 - param5) / 45);
        ((hm) this).field_t = 0;
    }

    hm(String param0, wn param1) {
        this(param0, mb.field_g.field_i, param1);
    }

    StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        if (param0 != 0) {
          L0: {
            ((hm) this).field_t = 15;
            if (((hm) this).a(param3, param1, param2, false)) {
              ((hm) this).a(param1, param2, param3, param0 + 1);
              break L0;
            } else {
              break L0;
            }
          }
          return param2;
        } else {
          L1: {
            if (((hm) this).a(param3, param1, param2, false)) {
              ((hm) this).a(param1, param2, param3, param0 + 1);
              break L1;
            } else {
              break L1;
            }
          }
          return param2;
        }
    }

    boolean a(int param0, hm param1) {
        if (param0 != -4659) {
            boolean discarded$0 = ((hm) this).h(1);
            return false;
        }
        return false;
    }

    public static void d(byte param0) {
        field_o = null;
        if (param0 != 58) {
          boolean discarded$2 = hm.g(80);
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
            String discarded$0 = ((hm) this).toString();
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        if (param3 < 0) {
            return true;
        }
        return false;
    }

    int e(int param0) {
        if (param0 != 12050) {
            ((hm) this).field_q = null;
            return 0;
        }
        return 0;
    }

    String d(int param0) {
        if (param0 != 1) {
            return null;
        }
        if (!((hm) this).field_u) {
            return null;
        }
        return ((hm) this).field_i;
    }

    void a(int param0, byte param1, int param2, int param3) {
        if (param1 < 85) {
            field_r = null;
            if (-1 != (param2 ^ -1)) {
                return;
            }
            if (((hm) this).field_s == null) {
                return;
            }
            ((hm) this).field_s.a(param3, param0, -88, (hm) this, true);
            return;
        }
        if (-1 != (param2 ^ -1)) {
            return;
        }
        if (((hm) this).field_s == null) {
            return;
        }
        ((hm) this).field_s.a(param3, param0, -88, (hm) this, true);
    }

    final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var6 = 0;
        var6 = EscapeVector.field_A;
        StringBuilder discarded$37 = param1.append(this.getClass().getName()).append("[0x").append(Integer.toHexString(this.hashCode())).append("] @").append(((hm) this).field_k).append(",").append(((hm) this).field_j).append(" ").append(((hm) this).field_g).append("x").append(((hm) this).field_x);
        if (null != ((hm) this).field_l) {
          L0: {
            StringBuilder discarded$38 = param1.append(" text=\"").append(((hm) this).field_l).append(34);
            if (((hm) this).field_u) {
              StringBuilder discarded$39 = param1.append(" mouseover");
              break L0;
            } else {
              break L0;
            }
          }
          if (!((hm) this).h(param3 ^ param3)) {
            if (null != ((hm) this).field_s) {
              L1: {
                StringBuilder discarded$40 = param1.append(" renderer=");
                if (!(((hm) this).field_s instanceof hm)) {
                  break L1;
                } else {
                  param1 = ((hm) this).a(0, param0, param1, 1 + param2);
                  if (var6 == 0) {
                    if (null != ((hm) this).field_q) {
                      StringBuilder discarded$41 = param1.append(" listener=");
                      if (!(((hm) this).field_q instanceof hm)) {
                        StringBuilder discarded$42 = param1.append(((hm) this).field_q);
                        if (var6 != 0) {
                          param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                StringBuilder discarded$43 = param1.append(((hm) this).field_s);
                if (null != ((hm) this).field_q) {
                  StringBuilder discarded$44 = param1.append(" listener=");
                  if (((hm) this).field_q instanceof hm) {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L2;
                  } else {
                    StringBuilder discarded$45 = param1.append(((hm) this).field_q);
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              return;
            } else {
              L3: {
                if (null != ((hm) this).field_q) {
                  StringBuilder discarded$46 = param1.append(" listener=");
                  if (((hm) this).field_q instanceof hm) {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L3;
                  } else {
                    StringBuilder discarded$47 = param1.append(((hm) this).field_q);
                    if (var6 == 0) {
                      break L3;
                    } else {
                      param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            StringBuilder discarded$48 = param1.append(" focused");
            if (null != ((hm) this).field_s) {
              StringBuilder discarded$49 = param1.append(" renderer=");
              if (((hm) this).field_s instanceof hm) {
                param1 = ((hm) this).a(0, param0, param1, 1 + param2);
                if (var6 == 0) {
                  L4: {
                    if (null != ((hm) this).field_q) {
                      StringBuilder discarded$50 = param1.append(" listener=");
                      if (((hm) this).field_q instanceof hm) {
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        break L4;
                      } else {
                        StringBuilder discarded$51 = param1.append(((hm) this).field_q);
                        if (var6 == 0) {
                          break L4;
                        } else {
                          param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  StringBuilder discarded$52 = param1.append(((hm) this).field_s);
                  L5: {
                    if (null != ((hm) this).field_q) {
                      StringBuilder discarded$53 = param1.append(" listener=");
                      if (((hm) this).field_q instanceof hm) {
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        break L5;
                      } else {
                        StringBuilder discarded$54 = param1.append(((hm) this).field_q);
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                StringBuilder discarded$55 = param1.append(((hm) this).field_s);
                L6: {
                  if (null != ((hm) this).field_q) {
                    StringBuilder discarded$56 = param1.append(" listener=");
                    if (((hm) this).field_q instanceof hm) {
                      param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                      break L6;
                    } else {
                      StringBuilder discarded$57 = param1.append(((hm) this).field_q);
                      if (var6 == 0) {
                        break L6;
                      } else {
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              L7: {
                if (null != ((hm) this).field_q) {
                  StringBuilder discarded$58 = param1.append(" listener=");
                  if (((hm) this).field_q instanceof hm) {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L7;
                  } else {
                    StringBuilder discarded$59 = param1.append(((hm) this).field_q);
                    if (var6 == 0) {
                      break L7;
                    } else {
                      param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                      break L7;
                    }
                  }
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          L8: {
            if (((hm) this).field_u) {
              StringBuilder discarded$60 = param1.append(" mouseover");
              break L8;
            } else {
              break L8;
            }
          }
          if (!((hm) this).h(param3 ^ param3)) {
            if (null != ((hm) this).field_s) {
              L9: {
                StringBuilder discarded$61 = param1.append(" renderer=");
                if (!(((hm) this).field_s instanceof hm)) {
                  break L9;
                } else {
                  param1 = ((hm) this).a(0, param0, param1, 1 + param2);
                  if (var6 == 0) {
                    if (null != ((hm) this).field_q) {
                      StringBuilder discarded$62 = param1.append(" listener=");
                      if (!(((hm) this).field_q instanceof hm)) {
                        StringBuilder discarded$63 = param1.append(((hm) this).field_q);
                        if (var6 != 0) {
                          param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                StringBuilder discarded$64 = param1.append(((hm) this).field_s);
                if (null != ((hm) this).field_q) {
                  StringBuilder discarded$65 = param1.append(" listener=");
                  if (((hm) this).field_q instanceof hm) {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L10;
                  } else {
                    StringBuilder discarded$66 = param1.append(((hm) this).field_q);
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              return;
            } else {
              L11: {
                if (null != ((hm) this).field_q) {
                  StringBuilder discarded$67 = param1.append(" listener=");
                  if (((hm) this).field_q instanceof hm) {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L11;
                  } else {
                    StringBuilder discarded$68 = param1.append(((hm) this).field_q);
                    if (var6 == 0) {
                      break L11;
                    } else {
                      param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                      break L11;
                    }
                  }
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            L12: {
              StringBuilder discarded$69 = param1.append(" focused");
              if (null != ((hm) this).field_s) {
                L13: {
                  StringBuilder discarded$70 = param1.append(" renderer=");
                  if (!(((hm) this).field_s instanceof hm)) {
                    break L13;
                  } else {
                    param1 = ((hm) this).a(0, param0, param1, 1 + param2);
                    if (var6 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                StringBuilder discarded$71 = param1.append(((hm) this).field_s);
                break L12;
              } else {
                break L12;
              }
            }
            L14: {
              if (null != ((hm) this).field_q) {
                StringBuilder discarded$72 = param1.append(" listener=");
                if (((hm) this).field_q instanceof hm) {
                  param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                  break L14;
                } else {
                  StringBuilder discarded$73 = param1.append(((hm) this).field_q);
                  if (var6 == 0) {
                    break L14;
                  } else {
                    param1 = ((hm) this).a(param3 + -1, param0, param1, 1 + param2);
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0, Hashtable param1, StringBuilder param2, boolean param3) {
        if (!param3) {
          if (param1.containsKey(this)) {
            StringBuilder discarded$13 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          } else {
            Object discarded$14 = param1.put(this, this);
            return true;
          }
        } else {
          String discarded$15 = ((hm) this).toString();
          if (param1.containsKey(this)) {
            StringBuilder discarded$16 = param2.append("<circular [0x").append(Integer.toHexString(this.hashCode())).append("]>");
            return false;
          } else {
            Object discarded$17 = param1.put(this, this);
            return true;
          }
        }
    }

    boolean h(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        L0: {
          if (((hm) this).a(param1, param3, param4, (byte) 105, param0)) {
            ((hm) this).field_t = param6;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != 3) {
          ((hm) this).f(99);
          return false;
        } else {
          return false;
        }
    }

    void a(int param0, int param1, int param2, boolean param3, int param4) {
        Object var7 = null;
        if (!param3) {
          var7 = null;
          boolean discarded$2 = ((hm) this).a(-63, -124, (byte) 29, -14, 125, (hm) null, -5);
          ((hm) this).field_k = param2;
          ((hm) this).field_x = param4;
          ((hm) this).field_j = param1;
          ((hm) this).field_g = param0;
          return;
        } else {
          ((hm) this).field_k = param2;
          ((hm) this).field_x = param4;
          ((hm) this).field_j = param1;
          ((hm) this).field_g = param0;
          return;
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        int var5 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (param0 == -14472) {
          L0: {
            var5 = ((hm) this).a(dh.field_d, bj.field_y, param2, (byte) 70, param1) ? 1 : 0;
            stackOut_2_0 = ((hm) this).field_u;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (var5 != 0) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
            L1: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (var5 == 0) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((hm) this).field_u = stackIn_10_1 != 0;
            if (((hm) this).field_q != null) {
              if (!(((hm) this).field_q instanceof nj)) {
                return;
              } else {
                ((nj) (Object) ((hm) this).field_q).a((hm) this, -27200, var5 != 0);
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

    final static boolean g(int param0) {
        if (param0 != 11187) {
            return false;
        }
        return df.field_d == null ? rk.field_b : true;
    }

    protected hm() {
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
    }

    hm(String param0, db param1, wn param2) {
        ao var4 = null;
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
        ((hm) this).field_s = param1;
        ((hm) this).field_q = param2;
        ((hm) this).field_l = param0;
        if (((hm) this).field_s instanceof ao) {
            var4 = (ao) (Object) ((hm) this).field_s;
            ((hm) this).field_g = var4.a((byte) -46, (hm) this);
            ((hm) this).field_x = var4.a(-127, (hm) this);
        }
    }

    hm(int param0, int param1, int param2, int param3, db param4, wn param5) {
        ((hm) this).field_n = 0;
        ((hm) this).field_v = 0;
        ((hm) this).field_g = param2;
        ((hm) this).field_k = param0;
        ((hm) this).field_s = param4;
        ((hm) this).field_q = param5;
        ((hm) this).field_j = param1;
        ((hm) this).field_x = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Suggested names: ";
        field_r = "FROM ONLY";
        field_w = new int[8192];
        field_h = new int[8192];
    }
}
