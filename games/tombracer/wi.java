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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2 = this.field_p + this.field_n.q((byte) -80);
        if (0 < this.field_r) {
          if (this.field_o - -this.field_t <= this.field_r) {
            L0: {
              L1: {
                var3 = hua.a((byte) 100, var2 >> 1716035746);
                var6 = -112 % ((param0 - -69) / 42);
                var4 = bua.a(0, var2 >> -1892328286);
                var5 = doa.a(2, this.field_t, var3);
                var7 = doa.a(2, this.field_t, var4);
                if (var7 == 0) {
                  break L1;
                } else {
                  if (-1 == (var5 ^ -1)) {
                    var7 = lw.a(var7, (byte) -71) * this.field_t;
                    if (!TombRacer.field_G) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    L2: {
                      var8 = this.field_n.s(25745);
                      var9 = this.field_n.e(false);
                      this.field_n.a((byte) -17, var5, var7);
                      if (!this.field_q) {
                        break L2;
                      } else {
                        L3: {
                          if (!this.field_n.p((byte) -103)) {
                            break L3;
                          } else {
                            var2 = -var2;
                            this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                            break L3;
                          }
                        }
                        if (this.field_n.C((byte) -43)) {
                          var2 = 4096 - var2;
                          this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (this.field_n.s(25745) != var8) {
                          break L5;
                        } else {
                          if (this.field_n.e(false) == var9) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      this.field_o = this.field_o + this.field_t;
                      break L4;
                    }
                    L6: {
                      if ((this.field_r ^ -1) >= -1) {
                        break L6;
                      } else {
                        if (this.field_o >= this.field_r) {
                          this.field_j = true;
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
              var5 = lw.a(var5, (byte) -52) * this.field_t;
              break L0;
            }
            L7: {
              var8 = this.field_n.s(25745);
              var9 = this.field_n.e(false);
              this.field_n.a((byte) -17, var5, var7);
              if (!this.field_q) {
                break L7;
              } else {
                L8: {
                  if (!this.field_n.p((byte) -103)) {
                    break L8;
                  } else {
                    var2 = -var2;
                    this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                    break L8;
                  }
                }
                if (this.field_n.C((byte) -43)) {
                  var2 = 4096 - var2;
                  this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                  break L7;
                } else {
                  L9: {
                    L10: {
                      if (this.field_n.s(25745) != var8) {
                        break L10;
                      } else {
                        if (this.field_n.e(false) == var9) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    this.field_o = this.field_o + this.field_t;
                    break L9;
                  }
                  L11: {
                    if ((this.field_r ^ -1) >= -1) {
                      break L11;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
                        break L11;
                      } else {
                        break L11;
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
                L12: {
                  this.field_o = this.field_o + this.field_t;
                  if ((this.field_r ^ -1) >= -1) {
                    break L12;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
                return;
              }
            } else {
              L13: {
                this.field_o = this.field_o + this.field_t;
                if ((this.field_r ^ -1) >= -1) {
                  break L13;
                } else {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              return;
            }
          } else {
            L14: {
              L15: {
                this.field_t = this.field_r + -this.field_o;
                var3 = hua.a((byte) 100, var2 >> 1716035746);
                var6 = -112 % ((param0 - -69) / 42);
                var4 = bua.a(0, var2 >> -1892328286);
                var5 = doa.a(2, this.field_t, var3);
                var7 = doa.a(2, this.field_t, var4);
                if (var7 == 0) {
                  break L15;
                } else {
                  if (-1 == (var5 ^ -1)) {
                    var7 = lw.a(var7, (byte) -71) * this.field_t;
                    if (!TombRacer.field_G) {
                      break L14;
                    } else {
                      break L15;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              var5 = lw.a(var5, (byte) -52) * this.field_t;
              break L14;
            }
            L16: {
              var8 = this.field_n.s(25745);
              var9 = this.field_n.e(false);
              this.field_n.a((byte) -17, var5, var7);
              if (!this.field_q) {
                break L16;
              } else {
                L17: {
                  if (!this.field_n.p((byte) -103)) {
                    break L17;
                  } else {
                    var2 = -var2;
                    this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                    break L17;
                  }
                }
                if (this.field_n.C((byte) -43)) {
                  var2 = 4096 - var2;
                  this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L18: {
              L19: {
                if (this.field_n.s(25745) != var8) {
                  break L19;
                } else {
                  if (this.field_n.e(false) == var9) {
                    break L18;
                  } else {
                    break L19;
                  }
                }
              }
              this.field_o = this.field_o + this.field_t;
              break L18;
            }
            L20: {
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
            L22: {
              var3 = hua.a((byte) 100, var2 >> 1716035746);
              var6 = -112 % ((param0 - -69) / 42);
              var4 = bua.a(0, var2 >> -1892328286);
              var5 = doa.a(2, this.field_t, var3);
              var7 = doa.a(2, this.field_t, var4);
              if (var7 == 0) {
                break L22;
              } else {
                if (-1 == (var5 ^ -1)) {
                  var7 = lw.a(var7, (byte) -71) * this.field_t;
                  if (!TombRacer.field_G) {
                    break L21;
                  } else {
                    break L22;
                  }
                } else {
                  L23: {
                    var8 = this.field_n.s(25745);
                    var9 = this.field_n.e(false);
                    this.field_n.a((byte) -17, var5, var7);
                    if (!this.field_q) {
                      break L23;
                    } else {
                      L24: {
                        if (!this.field_n.p((byte) -103)) {
                          break L24;
                        } else {
                          var2 = -var2;
                          this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                          break L24;
                        }
                      }
                      if (this.field_n.C((byte) -43)) {
                        var2 = 4096 - var2;
                        this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    L26: {
                      if (this.field_n.s(25745) != var8) {
                        break L26;
                      } else {
                        if (this.field_n.e(false) == var9) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    this.field_o = this.field_o + this.field_t;
                    break L25;
                  }
                  L27: {
                    if ((this.field_r ^ -1) >= -1) {
                      break L27;
                    } else {
                      if (this.field_o >= this.field_r) {
                        this.field_j = true;
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                  }
                  return;
                }
              }
            }
            var5 = lw.a(var5, (byte) -52) * this.field_t;
            break L21;
          }
          L28: {
            var8 = this.field_n.s(25745);
            var9 = this.field_n.e(false);
            this.field_n.a((byte) -17, var5, var7);
            if (!this.field_q) {
              break L28;
            } else {
              L29: {
                if (!this.field_n.p((byte) -103)) {
                  break L29;
                } else {
                  var2 = -var2;
                  this.field_p = dfa.a(-this.field_n.q((byte) -80) + var2, 8192, 69);
                  break L29;
                }
              }
              if (this.field_n.C((byte) -43)) {
                var2 = 4096 - var2;
                this.field_p = dfa.a(var2 + -this.field_n.q((byte) -80), 8192, 112);
                break L28;
              } else {
                L30: {
                  L31: {
                    if (this.field_n.s(25745) != var8) {
                      break L31;
                    } else {
                      if (this.field_n.e(false) == var9) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  this.field_o = this.field_o + this.field_t;
                  break L30;
                }
                L32: {
                  if ((this.field_r ^ -1) >= -1) {
                    break L32;
                  } else {
                    if (this.field_o >= this.field_r) {
                      this.field_j = true;
                      break L32;
                    } else {
                      break L32;
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
              L33: {
                this.field_o = this.field_o + this.field_t;
                if ((this.field_r ^ -1) >= -1) {
                  break L33;
                } else {
                  if (this.field_o >= this.field_r) {
                    this.field_j = true;
                    break L33;
                  } else {
                    break L33;
                  }
                }
              }
              return;
            }
          } else {
            L34: {
              this.field_o = this.field_o + this.field_t;
              if ((this.field_r ^ -1) >= -1) {
                break L34;
              } else {
                if (this.field_o >= this.field_r) {
                  this.field_j = true;
                  break L34;
                } else {
                  break L34;
                }
              }
            }
            return;
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
        int discarded$2 = 0;
        super.c((byte) -119);
        if (param0 > -116) {
          discarded$2 = this.c(33);
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
        RuntimeException runtimeException = null;
        int var5 = 0;
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
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if ((param0.field_E ^ -1) < -8) {
                  break L2;
                } else {
                  this.field_t = param1.b((byte) 44, 4) << 2064710352;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_t = this.a(param1.b((byte) 44, 8), false);
              break L1;
            }
            L3: {
              L4: {
                this.field_r = param1.b((byte) 44, 10) << 1660895664;
                if (-11 >= (param0.field_E ^ -1)) {
                  break L4;
                } else {
                  this.field_p = oo.a(3, 8192, 0, param1.b((byte) 44, 3));
                  this.field_q = false;
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                this.field_p = oo.a(4, 8192, 0, param1.b((byte) 44, 4));
                stackOut_6_0 = this;
                stackIn_8_0 = stackOut_6_0;
                stackIn_7_0 = stackOut_6_0;
                if (1 != param1.b((byte) 44, 1)) {
                  stackOut_8_0 = this;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L5;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  break L5;
                }
              }
              ((wi) (this)).field_q = stackIn_9_1 != 0;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (runtimeException);
            stackOut_11_1 = new StringBuilder().append("wi.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L6;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L6;
            }
          }
          L7: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L7;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    wi(la param0, boolean param1) {
        this(param0, 131072, 0, 0, param1);
    }

    static {
    }
}
