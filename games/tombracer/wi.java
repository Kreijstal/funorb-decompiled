/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends wda {
    private int field_p;
    private int field_r;
    private boolean field_q;
    private int field_t;
    static jea field_s;
    private int field_o;

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 35, param1, ((wi) this).field_o);
        if (param0 != 0) {
            ((wi) this).b((byte) -115);
            return param1;
        }
        return param1;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2 = ((wi) this).field_p + ((wi) this).field_n.q((byte) -80);
        if (0 < ((wi) this).field_r) {
          if (((wi) this).field_o - -((wi) this).field_t > ((wi) this).field_r) {
            ((wi) this).field_t = ((wi) this).field_r + -((wi) this).field_o;
            var3 = hua.a((byte) 100, var2 >> 1716035746);
            var6 = -112 % ((param0 - -69) / 42);
            var4 = bua.a(0, var2 >> -1892328286);
            var5 = doa.a(2, ((wi) this).field_t, var3);
            var7 = doa.a(2, ((wi) this).field_t, var4);
            if (var7 == -1) {
              L0: {
                var5 = lw.a(var5, (byte) -52) * ((wi) this).field_t;
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L0;
                } else {
                  L1: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L1;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L1;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L0;
                  } else {
                    if (((wi) this).field_n.s(25745) != var8) {
                      ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                      if ((((wi) this).field_r ^ -1) < -1) {
                        if (((wi) this).field_o < ((wi) this).field_r) {
                          return;
                        } else {
                          ((wi) this).field_j = true;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (((wi) this).field_n.e(false) == var9) {
                        if ((((wi) this).field_r ^ -1) < -1) {
                          if (((wi) this).field_o >= ((wi) this).field_r) {
                            ((wi) this).field_j = true;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                        if ((((wi) this).field_r ^ -1) < -1) {
                          L2: {
                            if (((wi) this).field_o >= ((wi) this).field_r) {
                              ((wi) this).field_j = true;
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
              if (((wi) this).field_n.s(25745) != var8) {
                L3: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                if (((wi) this).field_n.e(false) == var9) {
                  L4: {
                    if ((((wi) this).field_r ^ -1) >= -1) {
                      break L4;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L4;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L5: {
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    if ((((wi) this).field_r ^ -1) >= -1) {
                      break L5;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L5;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (-1 == var5) {
                L6: {
                  var7 = lw.a(var7, (byte) -71) * ((wi) this).field_t;
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L6;
                  } else {
                    L7: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L7;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L7;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  L9: {
                    if (((wi) this).field_n.s(25745) != var8) {
                      break L9;
                    } else {
                      if (((wi) this).field_n.e(false) == var9) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L8;
                }
                if ((((wi) this).field_r ^ -1) < -1) {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L10: {
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L10;
                  } else {
                    L11: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L11;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L11;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  L13: {
                    if (((wi) this).field_n.s(25745) != var8) {
                      break L13;
                    } else {
                      if (((wi) this).field_n.e(false) == var9) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L12;
                }
                L14: {
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L14;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                }
                return;
              }
            }
          } else {
            var3 = hua.a((byte) 100, var2 >> 1716035746);
            var6 = -112 % ((param0 - -69) / 42);
            var4 = bua.a(0, var2 >> -1892328286);
            var5 = doa.a(2, ((wi) this).field_t, var3);
            var7 = doa.a(2, ((wi) this).field_t, var4);
            if (var7 == -1) {
              L15: {
                var5 = lw.a(var5, (byte) -52) * ((wi) this).field_t;
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L15;
                } else {
                  L16: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L16;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L16;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L15;
                  } else {
                    L17: {
                      L18: {
                        if (((wi) this).field_n.s(25745) != var8) {
                          break L18;
                        } else {
                          if (((wi) this).field_n.e(false) == var9) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                      break L17;
                    }
                    L19: {
                      if ((((wi) this).field_r ^ -1) >= -1) {
                        break L19;
                      } else {
                        if (((wi) this).field_o >= ((wi) this).field_r) {
                          ((wi) this).field_j = true;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (((wi) this).field_n.s(25745) == var8) {
                if (((wi) this).field_n.e(false) == var9) {
                  if ((((wi) this).field_r ^ -1) < -1) {
                    if (((wi) this).field_o < ((wi) this).field_r) {
                      return;
                    } else {
                      ((wi) this).field_j = true;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L20: {
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    if ((((wi) this).field_r ^ -1) >= -1) {
                      break L20;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  return;
                }
              } else {
                L21: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L21;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                return;
              }
            } else {
              if (-1 != var5) {
                L22: {
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L22;
                  } else {
                    L23: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L23;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L23;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (((wi) this).field_n.s(25745) != var8) {
                      break L25;
                    } else {
                      if (((wi) this).field_n.e(false) == var9) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L24;
                }
                L26: {
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L26;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                return;
              } else {
                L27: {
                  var7 = lw.a(var7, (byte) -71) * ((wi) this).field_t;
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L27;
                  } else {
                    L28: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L28;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L28;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                }
                L29: {
                  L30: {
                    if (((wi) this).field_n.s(25745) != var8) {
                      break L30;
                    } else {
                      if (((wi) this).field_n.e(false) == var9) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L29;
                }
                L31: {
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L31;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          var3 = hua.a((byte) 100, var2 >> 1716035746);
          var6 = -112 % ((param0 - -69) / 42);
          var4 = bua.a(0, var2 >> -1892328286);
          var5 = doa.a(2, ((wi) this).field_t, var3);
          var7 = doa.a(2, ((wi) this).field_t, var4);
          if (var7 == -1) {
            L32: {
              var5 = lw.a(var5, (byte) -52) * ((wi) this).field_t;
              var8 = ((wi) this).field_n.s(25745);
              var9 = ((wi) this).field_n.e(false);
              ((wi) this).field_n.a((byte) -17, var5, var7);
              if (!((wi) this).field_q) {
                break L32;
              } else {
                L33: {
                  if (!((wi) this).field_n.p((byte) -103)) {
                    break L33;
                  } else {
                    var2 = -var2;
                    ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                    break L33;
                  }
                }
                if (((wi) this).field_n.C((byte) -43)) {
                  var2 = 4096 - var2;
                  ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                  break L32;
                } else {
                  L34: {
                    L35: {
                      if (((wi) this).field_n.s(25745) != var8) {
                        break L35;
                      } else {
                        if (((wi) this).field_n.e(false) == var9) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    break L34;
                  }
                  L36: {
                    if ((((wi) this).field_r ^ -1) >= -1) {
                      break L36;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L36;
                      } else {
                        break L36;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (((wi) this).field_n.s(25745) == var8) {
              if (((wi) this).field_n.e(false) == var9) {
                if ((((wi) this).field_r ^ -1) < -1) {
                  if (((wi) this).field_o < ((wi) this).field_r) {
                    return;
                  } else {
                    ((wi) this).field_j = true;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L37: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if ((((wi) this).field_r ^ -1) >= -1) {
                    break L37;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                }
                return;
              }
            } else {
              L38: {
                ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                if ((((wi) this).field_r ^ -1) >= -1) {
                  break L38;
                } else {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              return;
            }
          } else {
            if (-1 != var5) {
              L39: {
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L39;
                } else {
                  L40: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L40;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L40;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L39;
                  } else {
                    break L39;
                  }
                }
              }
              L41: {
                L42: {
                  if (((wi) this).field_n.s(25745) != var8) {
                    break L42;
                  } else {
                    if (((wi) this).field_n.e(false) == var9) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
                ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                break L41;
              }
              L43: {
                if ((((wi) this).field_r ^ -1) >= -1) {
                  break L43;
                } else {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    break L43;
                  } else {
                    break L43;
                  }
                }
              }
              return;
            } else {
              L44: {
                var7 = lw.a(var7, (byte) -71) * ((wi) this).field_t;
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L44;
                } else {
                  L45: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L45;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L45;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L46: {
                L47: {
                  if (((wi) this).field_n.s(25745) != var8) {
                    break L47;
                  } else {
                    if (((wi) this).field_n.e(false) == var9) {
                      break L46;
                    } else {
                      break L47;
                    }
                  }
                }
                ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                break L46;
              }
              L48: {
                if ((((wi) this).field_r ^ -1) >= -1) {
                  break L48;
                } else {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    break L48;
                  } else {
                    break L48;
                  }
                }
              }
              return;
            }
          }
        }
    }

    final void d(int param0, int param1) {
        if (param0 != 4) {
            return;
        }
        ((wi) this).field_p = param1;
    }

    wi(la param0, int param1, int param2, int param3, boolean param4) {
        super(param0, param4);
        ((wi) this).field_p = param2;
        ((wi) this).field_t = param1;
        ((wi) this).field_r = param3;
    }

    final void c(byte param0) {
        super.c((byte) -119);
        if (param0 > -116) {
          int discarded$2 = ((wi) this).c(33);
          ((wi) this).field_p = dfa.a(-((wi) this).field_p, 8192, 118);
          return;
        } else {
          ((wi) this).field_p = dfa.a(-((wi) this).field_p, 8192, 118);
          return;
        }
    }

    public static void e(byte param0) {
        field_s = null;
        if (param0 != -92) {
            wi.e((byte) -48);
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            ((wi) this).field_o = 76;
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 18;
        }
        return 0;
    }

    final void c(int param0, int param1) {
        if (param1 != 26621) {
            ((wi) this).b(99);
            ((wi) this).field_t = param0;
            return;
        }
        ((wi) this).field_t = param0;
    }

    final void a(kh param0, byte param1) {
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kh stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        kh stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        kh stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        kh stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        super.a(param0, (byte) -117);
        param0.a((byte) 75, ((wi) this).b(0, ((wi) this).field_t), 8);
        param0.a((byte) -127, ((wi) this).field_r >> 178103024, 10);
        if (param1 > -78) {
          L0: {
            ((wi) this).b(95);
            param0.a((byte) -126, cn.a((byte) 46, ((wi) this).field_p, 8192, 4), 4);
            stackOut_5_0 = (kh) param0;
            stackOut_5_1 = 63;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!((wi) this).field_q) {
              stackOut_7_0 = (kh) (Object) stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = (kh) (Object) stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          ((kh) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, 1);
          return;
        } else {
          L1: {
            param0.a((byte) -126, cn.a((byte) 46, ((wi) this).field_p, 8192, 4), 4);
            stackOut_1_0 = (kh) param0;
            stackOut_1_1 = 63;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!((wi) this).field_q) {
              stackOut_3_0 = (kh) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = (kh) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          ((kh) (Object) stackIn_4_0).a((byte) stackIn_4_1, stackIn_4_2, 1);
          return;
        }
    }

    wi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        if ((param0.field_E ^ -1) >= -8) {
            ((wi) this).field_t = param1.b((byte) 44, 4) << 2064710352;
        } else {
            ((wi) this).field_t = ((wi) this).a(param1.b((byte) 44, 8), false);
        }
        ((wi) this).field_r = param1.b((byte) 44, 10) << 1660895664;
        if (-11 < (param0.field_E ^ -1)) {
            ((wi) this).field_p = oo.a(3, 8192, 0, param1.b((byte) 44, 3));
            ((wi) this).field_q = false;
        } else {
            ((wi) this).field_p = oo.a(4, 8192, 0, param1.b((byte) 44, 4));
            ((wi) this).field_q = 1 == param1.b((byte) 44, 1) ? true : false;
        }
    }

    wi(la param0, boolean param1) {
        this(param0, 131072, 0, 0, param1);
    }

    static {
    }
}
