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
        param1 = fs.a((byte) 35, param1, this.field_o);
        if (param0 != 0) {
            this.b((byte) -115);
            return param1;
        }
        return param1;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var2 = this.field_p + this.field_n.q((byte) -80);
        if (0 < this.field_r) {
          if (this.field_o - -this.field_t > this.field_r) {
            this.field_t = this.field_r + -this.field_o;
            var3 = hua.a((byte) 100, var2 >> 1716035746);
            var6 = -112 % ((param0 - -69) / 42);
            var4 = bua.a(0, var2 >> -1892328286);
            var5 = doa.a(2, this.field_t, var3);
            var7 = doa.a(2, this.field_t, var4);
            if (var7 == 0) {
              L0: {
                var5 = lw.a(var5, (byte) -52) * this.field_t;
                var8 = this.field_n.s(25745);
                var9 = this.field_n.e(false);
                this.field_n.a((byte) -17, var5, var7);
                if (!this.field_q) {
                  break L0;
                } else {
                  L1: {
                    if (!this.field_n.p((byte) -103)) {
                      break L1;
                    } else {
                      var2 = -var2;
                      this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                      break L1;
                    }
                  }
                  if (this.field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                    break L0;
                  } else {
                    if (this.field_n.s(25745) != var8) {
                      this.field_o = this.field_o + this.field_t;
                      if ((this.field_r ^ -1) < -1) {
                        if (this.field_o < this.field_r) {
                          return;
                        } else {
                          this.field_j = true;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (this.field_n.e(false) == var9) {
                        if ((this.field_r ^ -1) < -1) {
                          if (this.field_o >= this.field_r) {
                            this.field_j = true;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        this.field_o = this.field_o + this.field_t;
                        if ((this.field_r ^ -1) < -1) {
                          L2: {
                            if (this.field_o >= this.field_r) {
                              this.field_j = true;
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
              if (this.field_n.s(25745) != var8) {
                L3: {
                  this.field_o = this.field_o + this.field_t;
                  if ((this.field_r ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                if (this.field_n.e(false) == var9) {
                  L4: {
                    if ((this.field_r ^ -1) >= -1) {
                      break L4;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
                        break L4;
                      } else {
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  L5: {
                    this.field_o = this.field_o + this.field_t;
                    if ((this.field_r ^ -1) >= -1) {
                      break L5;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
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
              if (-1 == (var5 ^ -1)) {
                L6: {
                  var7 = lw.a(var7, (byte) -71) * this.field_t;
                  var8 = this.field_n.s(25745);
                  var9 = this.field_n.e(false);
                  this.field_n.a((byte) -17, var5, var7);
                  if (!this.field_q) {
                    break L6;
                  } else {
                    L7: {
                      if (!this.field_n.p((byte) -103)) {
                        break L7;
                      } else {
                        var2 = -var2;
                        this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                        break L7;
                      }
                    }
                    if (this.field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  L9: {
                    if (this.field_n.s(25745) != var8) {
                      break L9;
                    } else {
                      if (this.field_n.e(false) == var9) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_o = this.field_o + this.field_t;
                  break L8;
                }
                if ((this.field_r ^ -1) < -1) {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L10: {
                  var8 = this.field_n.s(25745);
                  var9 = this.field_n.e(false);
                  this.field_n.a((byte) -17, var5, var7);
                  if (!this.field_q) {
                    break L10;
                  } else {
                    L11: {
                      if (!this.field_n.p((byte) -103)) {
                        break L11;
                      } else {
                        var2 = -var2;
                        this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                        break L11;
                      }
                    }
                    if (this.field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  L13: {
                    if (this.field_n.s(25745) != var8) {
                      break L13;
                    } else {
                      if (this.field_n.e(false) == var9) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_o = this.field_o + this.field_t;
                  break L12;
                }
                L14: {
                  if ((this.field_r ^ -1) >= -1) {
                    break L14;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
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
            var5 = doa.a(2, this.field_t, var3);
            var7 = doa.a(2, this.field_t, var4);
            if (var7 == 0) {
              L15: {
                var5 = lw.a(var5, (byte) -52) * this.field_t;
                var8 = this.field_n.s(25745);
                var9 = this.field_n.e(false);
                this.field_n.a((byte) -17, var5, var7);
                if (!this.field_q) {
                  break L15;
                } else {
                  L16: {
                    if (!this.field_n.p((byte) -103)) {
                      break L16;
                    } else {
                      var2 = -var2;
                      this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                      break L16;
                    }
                  }
                  if (this.field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                    break L15;
                  } else {
                    L17: {
                      L18: {
                        if (this.field_n.s(25745) != var8) {
                          break L18;
                        } else {
                          if (this.field_n.e(false) == var9) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      this.field_o = this.field_o + this.field_t;
                      break L17;
                    }
                    L19: {
                      if ((this.field_r ^ -1) >= -1) {
                        break L19;
                      } else {
                        if (this.field_o >= this.field_r) {
                          this.field_j = true;
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
              if (this.field_n.s(25745) == var8) {
                if (this.field_n.e(false) == var9) {
                  if ((this.field_r ^ -1) < -1) {
                    if (this.field_o < this.field_r) {
                      return;
                    } else {
                      this.field_j = true;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  L20: {
                    this.field_o = this.field_o + this.field_t;
                    if ((this.field_r ^ -1) >= -1) {
                      break L20;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
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
                  this.field_o = this.field_o + this.field_t;
                  if ((this.field_r ^ -1) >= -1) {
                    break L21;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
                return;
              }
            } else {
              if (-1 != (var5 ^ -1)) {
                L22: {
                  var8 = this.field_n.s(25745);
                  var9 = this.field_n.e(false);
                  this.field_n.a((byte) -17, var5, var7);
                  if (!this.field_q) {
                    break L22;
                  } else {
                    L23: {
                      if (!this.field_n.p((byte) -103)) {
                        break L23;
                      } else {
                        var2 = -var2;
                        this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                        break L23;
                      }
                    }
                    if (this.field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                }
                L24: {
                  L25: {
                    if (this.field_n.s(25745) != var8) {
                      break L25;
                    } else {
                      if (this.field_n.e(false) == var9) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  this.field_o = this.field_o + this.field_t;
                  break L24;
                }
                L26: {
                  if ((this.field_r ^ -1) >= -1) {
                    break L26;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                }
                return;
              } else {
                L27: {
                  var7 = lw.a(var7, (byte) -71) * this.field_t;
                  var8 = this.field_n.s(25745);
                  var9 = this.field_n.e(false);
                  this.field_n.a((byte) -17, var5, var7);
                  if (!this.field_q) {
                    break L27;
                  } else {
                    L28: {
                      if (!this.field_n.p((byte) -103)) {
                        break L28;
                      } else {
                        var2 = -var2;
                        this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                        break L28;
                      }
                    }
                    if (this.field_n.C((byte) -43)) {
                      var2 = 4096 - var2;
                      this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                }
                L29: {
                  L30: {
                    if (this.field_n.s(25745) != var8) {
                      break L30;
                    } else {
                      if (this.field_n.e(false) == var9) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  this.field_o = this.field_o + this.field_t;
                  break L29;
                }
                L31: {
                  if ((this.field_r ^ -1) >= -1) {
                    break L31;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
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
          var5 = doa.a(2, this.field_t, var3);
          var7 = doa.a(2, this.field_t, var4);
          if (var7 == 0) {
            L32: {
              var5 = lw.a(var5, (byte) -52) * this.field_t;
              var8 = this.field_n.s(25745);
              var9 = this.field_n.e(false);
              this.field_n.a((byte) -17, var5, var7);
              if (!this.field_q) {
                break L32;
              } else {
                L33: {
                  if (!this.field_n.p((byte) -103)) {
                    break L33;
                  } else {
                    var2 = -var2;
                    this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                    break L33;
                  }
                }
                if (this.field_n.C((byte) -43)) {
                  var2 = 4096 - var2;
                  this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                  break L32;
                } else {
                  L34: {
                    L35: {
                      if (this.field_n.s(25745) != var8) {
                        break L35;
                      } else {
                        if (this.field_n.e(false) == var9) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    this.field_o = this.field_o + this.field_t;
                    break L34;
                  }
                  L36: {
                    if ((this.field_r ^ -1) >= -1) {
                      break L36;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
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
            if (this.field_n.s(25745) == var8) {
              if (this.field_n.e(false) == var9) {
                if ((this.field_r ^ -1) < -1) {
                  if (this.field_o < this.field_r) {
                    return;
                  } else {
                    this.field_j = true;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L37: {
                  this.field_o = this.field_o + this.field_t;
                  if ((this.field_r ^ -1) >= -1) {
                    break L37;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
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
                this.field_o = this.field_o + this.field_t;
                if ((this.field_r ^ -1) >= -1) {
                  break L38;
                } else {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              return;
            }
          } else {
            if (-1 != (var5 ^ -1)) {
              L39: {
                var8 = this.field_n.s(25745);
                var9 = this.field_n.e(false);
                this.field_n.a((byte) -17, var5, var7);
                if (!this.field_q) {
                  break L39;
                } else {
                  L40: {
                    if (!this.field_n.p((byte) -103)) {
                      break L40;
                    } else {
                      var2 = -var2;
                      this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                      break L40;
                    }
                  }
                  if (this.field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                    break L39;
                  } else {
                    break L39;
                  }
                }
              }
              L41: {
                L42: {
                  if (this.field_n.s(25745) != var8) {
                    break L42;
                  } else {
                    if (this.field_n.e(false) == var9) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
                this.field_o = this.field_o + this.field_t;
                break L41;
              }
              L43: {
                if ((this.field_r ^ -1) >= -1) {
                  break L43;
                } else {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
                    break L43;
                  } else {
                    break L43;
                  }
                }
              }
              return;
            } else {
              L44: {
                var7 = lw.a(var7, (byte) -71) * this.field_t;
                var8 = this.field_n.s(25745);
                var9 = this.field_n.e(false);
                this.field_n.a((byte) -17, var5, var7);
                if (!this.field_q) {
                  break L44;
                } else {
                  L45: {
                    if (!this.field_n.p((byte) -103)) {
                      break L45;
                    } else {
                      var2 = -var2;
                      this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                      break L45;
                    }
                  }
                  if (this.field_n.C((byte) -43)) {
                    var2 = 4096 - var2;
                    this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L46: {
                L47: {
                  if (this.field_n.s(25745) != var8) {
                    break L47;
                  } else {
                    if (this.field_n.e(false) == var9) {
                      break L46;
                    } else {
                      break L47;
                    }
                  }
                }
                this.field_o = this.field_o + this.field_t;
                break L46;
              }
              L48: {
                if ((this.field_r ^ -1) >= -1) {
                  break L48;
                } else {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
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
        this.field_p = param1;
    }

    wi(la param0, int param1, int param2, int param3, boolean param4) {
        super(param0, param4);
        try {
            this.field_p = param2;
            this.field_t = param1;
            this.field_r = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(byte param0) {
        super.c((byte) -119);
        if (param0 > -116) {
          this.c(33);
          this.field_p = dfa.a(-this.field_p, 8192, 118);
          return;
        } else {
          this.field_p = dfa.a(-this.field_p, 8192, 118);
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
            this.field_o = 76;
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
            this.b(99);
            this.field_t = param0;
            return;
        }
        this.field_t = param0;
    }

    final void a(kh param0, byte param1) {
        try {
            super.a(param0, (byte) -117);
            param0.a((byte) 75, this.b(0, this.field_t), 8);
            param0.a((byte) -127, this.field_r >> 178103024, 10);
            if (param1 > -78) {
                this.b(95);
            }
            param0.a((byte) -126, cn.a((byte) 46, this.field_p, 8192, 4), 4);
            param0.a((byte) 63, this.field_q ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wi.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    wi(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if ((param0.field_E ^ -1) < -8) {
                this.field_t = this.a(param1.b((byte) 44, 8), false);
                break L1;
              } else {
                this.field_t = param1.b((byte) 44, 4) << 2064710352;
                break L1;
              }
            }
            L2: {
              this.field_r = param1.b((byte) 44, 10) << 1660895664;
              if (-11 >= (param0.field_E ^ -1)) {
                L3: {
                  this.field_p = oo.a(4, 8192, 0, param1.b((byte) 44, 4));
                  stackIn_8_0 = this;

                  if (1 != param1.b((byte) 44, 1)) {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 0;
                    break L3;
                  } else {
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L3;
                  }
                }
                ((wi) (this)).field_q = stackIn_9_1 != 0;
                break L2;
              } else {
                this.field_p = oo.a(3, 8192, 0, param1.b((byte) 44, 3));
                this.field_q = false;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("wi.<init>(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    wi(la param0, boolean param1) {
        this(param0, 131072, 0, 0, param1);
    }

    static {
    }
}
