/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends wda {
    private int field_q;
    static String field_p;
    static iu field_s;
    private boolean field_u;
    private int field_v;
    static int field_t;
    private boolean field_r;
    private ir field_o;

    final void b(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        hca var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var3 = -93 % ((param0 - -69) / 42);
        var14 = this.field_n.H(-122);
        if (var14.u(-25561)) {
          return;
        } else {
          this.field_o.field_f = var14.d(3);
          this.field_o.field_d = var14.e(9648);
          this.field_n.a(this.field_o, 30);
          var4 = this.field_o.field_f - this.field_n.s(25745);
          var5 = this.field_o.field_d + -this.field_n.e(false);
          var6 = this.field_q >> -450006160;
          var6 = var6 * var6;
          var7 = (var4 >> -1643954256) * (var4 >> 348233296) + (var5 >> -1774965552) * (var5 >> 38151056);
          if (var7 <= var6) {
            return;
          } else {
            if (var4 != 0) {
              L0: {
                if (this.field_u) {
                  break L0;
                } else {
                  L1: {
                    if (0 != var4) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        var5 = 1;
                        break L1;
                      } else {
                        var8 = qva.a((byte) -73, var5, var4);
                        var9 = hua.a((byte) 107, var8 >> -316068894);
                        var10 = bua.a(0, var8 >> 554838914);
                        var11 = doa.a(2, this.field_v, var9);
                        var12 = doa.a(2, this.field_v, var10);
                        this.field_n.a((byte) -113, var11, var12);
                        if (var13 != 0) {
                          var8 = ua.a(var4, -106);
                          var9 = ua.a(var5, -115);
                          var10 = 0;
                          var11 = 0;
                          if (this.field_r) {
                            if (var8 * 4 < var9 * 3) {
                              if (!this.field_r) {
                                if (var9 * 4 < 3 * var8) {
                                  L2: {
                                    L3: {
                                      this.field_r = true;
                                      if (-1 > (var4 ^ -1)) {
                                        break L3;
                                      } else {
                                        var10 = -this.field_v;
                                        if (var13 == 0) {
                                          break L2;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    var10 = this.field_v;
                                    break L2;
                                  }
                                  if (var8 < ua.a(var10, -103)) {
                                    var10 = var4;
                                    if (var13 != 0) {
                                      L4: {
                                        this.field_r = false;
                                        if ((var5 ^ -1) < -1) {
                                          break L4;
                                        } else {
                                          var11 = -this.field_v;
                                          break L4;
                                        }
                                      }
                                      var11 = this.field_v;
                                      if (var9 < ua.a(var11, 60)) {
                                        var11 = var5;
                                        this.field_n.a((byte) -120, var10, var11);
                                        return;
                                      } else {
                                        this.field_n.a((byte) -120, var10, var11);
                                        return;
                                      }
                                    } else {
                                      this.field_n.a((byte) -120, var10, var11);
                                      return;
                                    }
                                  } else {
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  }
                                } else {
                                  L5: {
                                    L6: {
                                      this.field_r = false;
                                      if ((var5 ^ -1) < -1) {
                                        break L6;
                                      } else {
                                        var11 = -this.field_v;
                                        if (var13 == 0) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var11 = this.field_v;
                                    break L5;
                                  }
                                  if (var9 >= ua.a(var11, 60)) {
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  } else {
                                    var11 = var5;
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  }
                                }
                              } else {
                                L7: {
                                  L8: {
                                    this.field_r = false;
                                    if ((var5 ^ -1) < -1) {
                                      break L8;
                                    } else {
                                      var11 = -this.field_v;
                                      if (var13 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  var11 = this.field_v;
                                  break L7;
                                }
                                if (var9 >= ua.a(var11, 60)) {
                                  this.field_n.a((byte) -120, var10, var11);
                                  return;
                                } else {
                                  var11 = var5;
                                  this.field_n.a((byte) -120, var10, var11);
                                  return;
                                }
                              }
                            } else {
                              L9: {
                                L10: {
                                  this.field_r = true;
                                  if (-1 > (var4 ^ -1)) {
                                    break L10;
                                  } else {
                                    var10 = -this.field_v;
                                    if (var13 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var10 = this.field_v;
                                break L9;
                              }
                              if (var8 < ua.a(var10, -103)) {
                                var10 = var4;
                                if (var13 != 0) {
                                  L11: {
                                    this.field_r = false;
                                    if ((var5 ^ -1) < -1) {
                                      break L11;
                                    } else {
                                      var11 = -this.field_v;
                                      break L11;
                                    }
                                  }
                                  var11 = this.field_v;
                                  if (var9 < ua.a(var11, 60)) {
                                    var11 = var5;
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  } else {
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  }
                                } else {
                                  this.field_n.a((byte) -120, var10, var11);
                                  return;
                                }
                              } else {
                                this.field_n.a((byte) -120, var10, var11);
                                return;
                              }
                            }
                          } else {
                            L12: {
                              if (this.field_r) {
                                break L12;
                              } else {
                                if (var9 * 4 >= 3 * var8) {
                                  break L12;
                                } else {
                                  L13: {
                                    this.field_r = true;
                                    if (-1 > (var4 ^ -1)) {
                                      break L13;
                                    } else {
                                      var10 = -this.field_v;
                                      break L13;
                                    }
                                  }
                                  var10 = this.field_v;
                                  if (var8 < ua.a(var10, -103)) {
                                    var10 = var4;
                                    if (var13 != 0) {
                                      break L12;
                                    } else {
                                      this.field_n.a((byte) -120, var10, var11);
                                      return;
                                    }
                                  } else {
                                    this.field_n.a((byte) -120, var10, var11);
                                    return;
                                  }
                                }
                              }
                            }
                            L14: {
                              L15: {
                                this.field_r = false;
                                if ((var5 ^ -1) < -1) {
                                  break L15;
                                } else {
                                  var11 = -this.field_v;
                                  if (var13 == 0) {
                                    break L14;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              var11 = this.field_v;
                              break L14;
                            }
                            if (var9 < ua.a(var11, 60)) {
                              var11 = var5;
                              this.field_n.a((byte) -120, var10, var11);
                              return;
                            } else {
                              this.field_n.a((byte) -120, var10, var11);
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  var8 = qva.a((byte) -73, var5, var4);
                  var9 = hua.a((byte) 107, var8 >> -316068894);
                  var10 = bua.a(0, var8 >> 554838914);
                  var11 = doa.a(2, this.field_v, var9);
                  var12 = doa.a(2, this.field_v, var10);
                  this.field_n.a((byte) -113, var11, var12);
                  if (var13 != 0) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
              L16: {
                var8 = ua.a(var4, -106);
                var9 = ua.a(var5, -115);
                var10 = 0;
                var11 = 0;
                if (!this.field_r) {
                  if (this.field_r) {
                    break L16;
                  } else {
                    if (var9 * 4 >= 3 * var8) {
                      break L16;
                    } else {
                      L17: {
                        L18: {
                          this.field_r = true;
                          if (-1 > (var4 ^ -1)) {
                            break L18;
                          } else {
                            var10 = -this.field_v;
                            if (var13 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        var10 = this.field_v;
                        break L17;
                      }
                      if (var8 < ua.a(var10, -103)) {
                        var10 = var4;
                        if (var13 != 0) {
                          L19: {
                            this.field_r = false;
                            if ((var5 ^ -1) < -1) {
                              break L19;
                            } else {
                              var11 = -this.field_v;
                              break L19;
                            }
                          }
                          var11 = this.field_v;
                          if (var9 < ua.a(var11, 60)) {
                            var11 = var5;
                            this.field_n.a((byte) -120, var10, var11);
                            return;
                          } else {
                            this.field_n.a((byte) -120, var10, var11);
                            return;
                          }
                        } else {
                          this.field_n.a((byte) -120, var10, var11);
                          return;
                        }
                      } else {
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    }
                  }
                } else {
                  if (var8 * 4 >= var9 * 3) {
                    L20: {
                      L21: {
                        this.field_r = true;
                        if (-1 > (var4 ^ -1)) {
                          break L21;
                        } else {
                          var10 = -this.field_v;
                          if (var13 == 0) {
                            break L20;
                          } else {
                            break L21;
                          }
                        }
                      }
                      var10 = this.field_v;
                      break L20;
                    }
                    if (var8 < ua.a(var10, -103)) {
                      var10 = var4;
                      if (var13 != 0) {
                        break L16;
                      } else {
                        this.field_n.a((byte) -120, var10, var11);
                        return;
                      }
                    } else {
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    L22: {
                      if (this.field_r) {
                        break L22;
                      } else {
                        if (var9 * 4 >= 3 * var8) {
                          break L22;
                        } else {
                          L23: {
                            L24: {
                              this.field_r = true;
                              if (-1 > (var4 ^ -1)) {
                                break L24;
                              } else {
                                var10 = -this.field_v;
                                if (var13 == 0) {
                                  break L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var10 = this.field_v;
                            break L23;
                          }
                          if (var8 < ua.a(var10, -103)) {
                            var10 = var4;
                            if (var13 != 0) {
                              break L22;
                            } else {
                              this.field_n.a((byte) -120, var10, var11);
                              return;
                            }
                          } else {
                            this.field_n.a((byte) -120, var10, var11);
                            return;
                          }
                        }
                      }
                    }
                    L25: {
                      L26: {
                        this.field_r = false;
                        if ((var5 ^ -1) < -1) {
                          break L26;
                        } else {
                          var11 = -this.field_v;
                          if (var13 == 0) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var11 = this.field_v;
                      break L25;
                    }
                    if (var9 < ua.a(var11, 60)) {
                      var11 = var5;
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    } else {
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  }
                }
              }
              L27: {
                L28: {
                  this.field_r = false;
                  if ((var5 ^ -1) < -1) {
                    break L28;
                  } else {
                    var11 = -this.field_v;
                    if (var13 == 0) {
                      break L27;
                    } else {
                      break L28;
                    }
                  }
                }
                var11 = this.field_v;
                break L27;
              }
              if (var9 < ua.a(var11, 60)) {
                var11 = var5;
                this.field_n.a((byte) -120, var10, var11);
                return;
              } else {
                this.field_n.a((byte) -120, var10, var11);
                return;
              }
            } else {
              if (var5 != 0) {
                L29: {
                  if (this.field_u) {
                    break L29;
                  } else {
                    L30: {
                      if (0 != var4) {
                        break L30;
                      } else {
                        if (var5 == 0) {
                          var5 = 1;
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                    var8 = qva.a((byte) -73, var5, var4);
                    var9 = hua.a((byte) 107, var8 >> -316068894);
                    var10 = bua.a(0, var8 >> 554838914);
                    var11 = doa.a(2, this.field_v, var9);
                    var12 = doa.a(2, this.field_v, var10);
                    this.field_n.a((byte) -113, var11, var12);
                    if (var13 != 0) {
                      break L29;
                    } else {
                      return;
                    }
                  }
                }
                L31: {
                  L32: {
                    L33: {
                      var8 = ua.a(var4, -106);
                      var9 = ua.a(var5, -115);
                      var10 = 0;
                      var11 = 0;
                      if (!this.field_r) {
                        break L33;
                      } else {
                        if (var8 * 4 >= var9 * 3) {
                          break L32;
                        } else {
                          break L33;
                        }
                      }
                    }
                    if (this.field_r) {
                      break L31;
                    } else {
                      if (var9 * 4 >= 3 * var8) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  L34: {
                    L35: {
                      this.field_r = true;
                      if (-1 > (var4 ^ -1)) {
                        break L35;
                      } else {
                        var10 = -this.field_v;
                        if (var13 == 0) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    var10 = this.field_v;
                    break L34;
                  }
                  if (var8 < ua.a(var10, -103)) {
                    var10 = var4;
                    if (var13 != 0) {
                      break L31;
                    } else {
                      this.field_n.a((byte) -120, var10, var11);
                      return;
                    }
                  } else {
                    this.field_n.a((byte) -120, var10, var11);
                    return;
                  }
                }
                L36: {
                  L37: {
                    this.field_r = false;
                    if ((var5 ^ -1) < -1) {
                      break L37;
                    } else {
                      var11 = -this.field_v;
                      if (var13 == 0) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  var11 = this.field_v;
                  break L36;
                }
                if (var9 < ua.a(var11, 60)) {
                  var11 = var5;
                  this.field_n.a((byte) -120, var10, var11);
                  return;
                } else {
                  this.field_n.a((byte) -120, var10, var11);
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void c(int param0, int param1) {
        this.field_q = param1;
        int var3 = 108 / ((param0 - -57) / 33);
    }

    final void a(kh param0, byte param1) {
        if (param1 >= -78) {
            return;
        }
        try {
            super.a(param0, (byte) -83);
            param0.a((byte) -128, this.field_q >> 1657486128, 10);
            param0.a((byte) -25, this.b(0, this.field_v), 8);
            param0.a((byte) -128, this.field_u ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bg.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, boolean param1) {
        super(param0, param1);
        this.field_r = true;
        this.field_o = new ir();
        try {
            this.field_q = 1048576;
            this.field_v = 131072;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "bg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bg(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
        this.field_r = true;
        this.field_o = new ir();
        try {
          L0: {
            L1: {
              L2: {
                this.field_q = param1.b((byte) 44, 10) << 1507414544;
                if (7 < param0.field_E) {
                  break L2;
                } else {
                  this.field_v = param1.b((byte) 44, 4) << -1552938064;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_v = this.a(param1.b((byte) 44, 8), false);
              break L1;
            }
            L3: {
              L4: {
                if (this.c(true).field_E < 3) {
                  break L4;
                } else {
                  L5: {
                    stackOut_5_0 = this;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (1 == param1.b((byte) 44, 1)) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = 1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L5;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L5;
                    }
                  }
                  ((bg) (this)).field_u = stackIn_8_1 != 0;
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              this.field_u = false;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("bg.<init>(");
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

    final void b(int param0) {
        if (param0 != 1) {
            this.field_q = 125;
        }
    }

    final int a(int param0, int param1) {
        int discarded$0 = 0;
        param1 = fs.a((byte) 75, param1, this.field_v);
        if (param0 != 0) {
            discarded$0 = this.a(-97, -102);
            return param1;
        }
        return param1;
    }

    final void a(boolean param0, int param1) {
        this.field_v = param1;
        if (param0) {
            field_p = (String) null;
        }
    }

    public static void e(byte param0) {
        if (param0 != 67) {
            return;
        }
        field_s = null;
        field_p = null;
    }

    final void a(int param0, fsa param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              super.a(66, param1);
              if (param0 > 35) {
                break L1;
              } else {
                this.c(65, 104);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("bg.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            this.b((byte) -128);
            return 1;
        }
        return 1;
    }

    static {
        field_p = "Play free version";
    }
}
