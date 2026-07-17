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
            var3 = hua.a((byte) 100, var2 >> 2);
            var6 = -112 % ((param0 - -69) / 42);
            var4 = bua.a(0, var2 >> 2);
            var5 = doa.a(2, ((wi) this).field_t, var3);
            var7 = doa.a(2, ((wi) this).field_t, var4);
            if (var7 == 0) {
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
                    if (~((wi) this).field_n.s(25745) != ~var8) {
                      L2: {
                        ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                        if (((wi) this).field_r <= 0) {
                          break L2;
                        } else {
                          if (((wi) this).field_o >= ((wi) this).field_r) {
                            ((wi) this).field_j = true;
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      return;
                    } else {
                      if (~((wi) this).field_n.e(false) == ~var9) {
                        L3: {
                          if (((wi) this).field_r <= 0) {
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
                        ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                        if (((wi) this).field_r > 0) {
                          L4: {
                            if (((wi) this).field_o >= ((wi) this).field_r) {
                              ((wi) this).field_j = true;
                              break L4;
                            } else {
                              break L4;
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
              if (~((wi) this).field_n.s(25745) != ~var8) {
                L5: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if (((wi) this).field_r <= 0) {
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
              } else {
                if (~((wi) this).field_n.e(false) == ~var9) {
                  L6: {
                    if (((wi) this).field_r <= 0) {
                      break L6;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L6;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L7: {
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    if (((wi) this).field_r <= 0) {
                      break L7;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L7;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (var5 == 0) {
                L8: {
                  var7 = lw.a(var7, (byte) -71) * ((wi) this).field_t;
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L8;
                  } else {
                    L9: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L9;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L9;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  L11: {
                    if (~((wi) this).field_n.s(25745) != ~var8) {
                      break L11;
                    } else {
                      if (~((wi) this).field_n.e(false) == ~var9) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L10;
                }
                L12: {
                  if (((wi) this).field_r <= 0) {
                    break L12;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L12;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L13: {
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L13;
                  } else {
                    L14: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L14;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L14;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L15: {
                  L16: {
                    if (~((wi) this).field_n.s(25745) != ~var8) {
                      break L16;
                    } else {
                      if (~((wi) this).field_n.e(false) == ~var9) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L15;
                }
                L17: {
                  if (((wi) this).field_r <= 0) {
                    break L17;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                }
                return;
              }
            }
          } else {
            var3 = hua.a((byte) 100, var2 >> 2);
            var6 = -112 % ((param0 - -69) / 42);
            var4 = bua.a(0, var2 >> 2);
            var5 = doa.a(2, ((wi) this).field_t, var3);
            var7 = doa.a(2, ((wi) this).field_t, var4);
            if (var7 == 0) {
              L18: {
                var5 = lw.a(var5, (byte) -52) * ((wi) this).field_t;
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L18;
                } else {
                  L19: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L19;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L19;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L18;
                  } else {
                    L20: {
                      L21: {
                        if (~((wi) this).field_n.s(25745) != ~var8) {
                          break L21;
                        } else {
                          if (~((wi) this).field_n.e(false) == ~var9) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                      break L20;
                    }
                    L22: {
                      if (((wi) this).field_r <= 0) {
                        break L22;
                      } else {
                        if (((wi) this).field_o >= ((wi) this).field_r) {
                          ((wi) this).field_j = true;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              if (~((wi) this).field_n.s(25745) != ~var8) {
                L23: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if (((wi) this).field_r <= 0) {
                    break L23;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                return;
              } else {
                if (~((wi) this).field_n.e(false) == ~var9) {
                  L24: {
                    if (((wi) this).field_r <= 0) {
                      break L24;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L24;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L25: {
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    if (((wi) this).field_r <= 0) {
                      break L25;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (var5 == 0) {
                L26: {
                  var7 = lw.a(var7, (byte) -71) * ((wi) this).field_t;
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L26;
                  } else {
                    L27: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L27;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L27;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                L28: {
                  L29: {
                    if (~((wi) this).field_n.s(25745) != ~var8) {
                      break L29;
                    } else {
                      if (~((wi) this).field_n.e(false) == ~var9) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L28;
                }
                L30: {
                  if (((wi) this).field_r <= 0) {
                    break L30;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                }
                return;
              } else {
                L31: {
                  var8 = ((wi) this).field_n.s(25745);
                  var9 = ((wi) this).field_n.e(false);
                  ((wi) this).field_n.a((byte) -17, var5, var7);
                  if (!((wi) this).field_q) {
                    break L31;
                  } else {
                    L32: {
                      if (!((wi) this).field_n.p((byte) -103)) {
                        break L32;
                      } else {
                        var2 = -var2;
                        ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                        break L32;
                      }
                    }
                    if (((wi) this).field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                L33: {
                  L34: {
                    if (~((wi) this).field_n.s(25745) != ~var8) {
                      break L34;
                    } else {
                      if (~((wi) this).field_n.e(false) == ~var9) {
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  break L33;
                }
                L35: {
                  if (((wi) this).field_r <= 0) {
                    break L35;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          var3 = hua.a((byte) 100, var2 >> 2);
          var6 = -112 % ((param0 - -69) / 42);
          var4 = bua.a(0, var2 >> 2);
          var5 = doa.a(2, ((wi) this).field_t, var3);
          var7 = doa.a(2, ((wi) this).field_t, var4);
          if (var7 == 0) {
            L36: {
              var5 = lw.a(var5, (byte) -52) * ((wi) this).field_t;
              var8 = ((wi) this).field_n.s(25745);
              var9 = ((wi) this).field_n.e(false);
              ((wi) this).field_n.a((byte) -17, var5, var7);
              if (!((wi) this).field_q) {
                break L36;
              } else {
                L37: {
                  if (!((wi) this).field_n.p((byte) -103)) {
                    break L37;
                  } else {
                    var2 = -var2;
                    ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                    break L37;
                  }
                }
                if (((wi) this).field_n.C((byte) -43)) {
                  var2 = 4096 - var2;
                  ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                  break L36;
                } else {
                  L38: {
                    L39: {
                      if (~((wi) this).field_n.s(25745) != ~var8) {
                        break L39;
                      } else {
                        if (~((wi) this).field_n.e(false) == ~var9) {
                          break L38;
                        } else {
                          break L39;
                        }
                      }
                    }
                    ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                    break L38;
                  }
                  L40: {
                    if (((wi) this).field_r <= 0) {
                      break L40;
                    } else {
                      if (((wi) this).field_o >= ((wi) this).field_r) {
                        ((wi) this).field_j = true;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                  }
                  return;
                }
              }
            }
            if (~((wi) this).field_n.s(25745) != ~var8) {
              L41: {
                ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                if (((wi) this).field_r <= 0) {
                  break L41;
                } else {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    break L41;
                  } else {
                    break L41;
                  }
                }
              }
              return;
            } else {
              if (~((wi) this).field_n.e(false) == ~var9) {
                L42: {
                  if (((wi) this).field_r <= 0) {
                    break L42;
                  } else {
                    if (((wi) this).field_o >= ((wi) this).field_r) {
                      ((wi) this).field_j = true;
                      break L42;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L43: {
                  ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                  if (((wi) this).field_r <= 0) {
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
              }
            }
          } else {
            if (var5 == 0) {
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
                  if (~((wi) this).field_n.s(25745) != ~var8) {
                    break L47;
                  } else {
                    if (~((wi) this).field_n.e(false) == ~var9) {
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
                if (((wi) this).field_r <= 0) {
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
            } else {
              L49: {
                var8 = ((wi) this).field_n.s(25745);
                var9 = ((wi) this).field_n.e(false);
                ((wi) this).field_n.a((byte) -17, var5, var7);
                if (!((wi) this).field_q) {
                  break L49;
                } else {
                  L50: {
                    if (!((wi) this).field_n.p((byte) -103)) {
                      break L50;
                    } else {
                      var2 = -var2;
                      ((wi) this).field_p = dfa.a(-((wi) this).field_n.q((byte) -80) + var2, 8192, 69);
                      break L50;
                    }
                  }
                  if (((wi) this).field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    ((wi) this).field_p = dfa.a(var2 + -((wi) this).field_n.q((byte) -80), 8192, 112);
                    break L49;
                  } else {
                    break L49;
                  }
                }
              }
              L51: {
                L52: {
                  if (~((wi) this).field_n.s(25745) != ~var8) {
                    break L52;
                  } else {
                    if (~((wi) this).field_n.e(false) == ~var9) {
                      break L51;
                    } else {
                      break L52;
                    }
                  }
                }
                ((wi) this).field_o = ((wi) this).field_o + ((wi) this).field_t;
                break L51;
              }
              L53: {
                if (((wi) this).field_r <= 0) {
                  break L53;
                } else {
                  if (((wi) this).field_o >= ((wi) this).field_r) {
                    ((wi) this).field_j = true;
                    break L53;
                  } else {
                    break L53;
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
        try {
            ((wi) this).field_p = param2;
            ((wi) this).field_t = param1;
            ((wi) this).field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
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
        try {
            super.a(param0, (byte) -117);
            param0.a((byte) 75, ((wi) this).b(0, ((wi) this).field_t), 8);
            param0.a((byte) -127, ((wi) this).field_r >> 16, 10);
            if (param1 > -78) {
                ((wi) this).b(95);
            }
            param0.a((byte) -126, cn.a((byte) 46, ((wi) this).field_p, 8192, 4), 4);
            param0.a((byte) 63, ((wi) this).field_q ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "wi.R(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    wi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              if (param0.field_E > 7) {
                ((wi) this).field_t = ((wi) this).a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                ((wi) this).field_t = param1.b((byte) 44, 4) << 16;
                break L1;
              }
            }
            L2: {
              ((wi) this).field_r = param1.b((byte) 44, 10) << 16;
              if (param0.field_E >= 10) {
                L3: {
                  ((wi) this).field_p = oo.a(4, 8192, 0, param1.b((byte) 44, 4));
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (1 != param1.b((byte) 44, 1)) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                ((wi) this).field_q = stackIn_9_1 != 0;
                break L2;
              } else {
                ((wi) this).field_p = oo.a(3, 8192, 0, param1.b((byte) 44, 3));
                ((wi) this).field_q = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("wi.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    wi(la param0, boolean param1) {
        this(param0, 131072, 0, 0, param1);
    }

    static {
    }
}
