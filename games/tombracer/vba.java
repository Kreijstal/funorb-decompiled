/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vba extends we {
    private int[] field_w;
    private int[] field_r;
    private int field_t;
    static float field_v;
    static int[] field_x;
    static boolean[] field_u;
    private int field_s;

    vba(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        this.field_w = new int[42];
        this.field_r = new int[42];
        try {
          L0: {
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var7_int >= this.field_w.length) {
                    break L3;
                  } else {
                    this.field_w[var7_int] = uca.field_c.a(3, 0);
                    var7_int++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_o = false;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("vba.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param5 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -48) {
          return 48;
        } else {
          return this.a((byte) 126, param0) + this.field_m[param0].e(param1 ^ 141);
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        super.a(param0, param1, param2);
        var4 = 0;
        L0: while (true) {
          if (42 <= var4) {
            if (-1 == this.field_s) {
              L1: {
                if (0 == (this.field_t ^ -1)) {
                  break L1;
                } else {
                  this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                  if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                    break L1;
                  } else {
                    this.field_r[this.field_t] = 8;
                    break L1;
                  }
                }
              }
              if (!this.field_q.b(20)) {
                return;
              } else {
                this.field_s = this.b(sta.field_B, jba.field_j, true);
                if (-2 == (hf.field_b ^ -1)) {
                  L2: {
                    var4 = this.b(lba.field_p, jm.field_m, true);
                    if (var4 != this.field_t) {
                      if (0 != (var4 ^ -1)) {
                        this.field_t = var4;
                        break L2;
                      } else {
                        return;
                      }
                    } else {
                      this.field_t = -1;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        L3: {
                          if (0 != (var4 ^ -1)) {
                            this.field_t = var4;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.field_r[this.field_s] = this.field_r[this.field_s] + 2;
              if (this.field_r[this.field_s] + 2 > 4) {
                L4: {
                  this.field_r[this.field_s] = 4;
                  if (0 == (this.field_t ^ -1)) {
                    break L4;
                  } else {
                    this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                    if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                      break L4;
                    } else {
                      this.field_r[this.field_t] = 8;
                      if (!this.field_q.b(20)) {
                        return;
                      } else {
                        this.field_s = this.b(sta.field_B, jba.field_j, true);
                        if (-2 != (hf.field_b ^ -1)) {
                          return;
                        } else {
                          L5: {
                            L6: {
                              var4 = this.b(lba.field_p, jm.field_m, true);
                              if (var4 != this.field_t) {
                                break L6;
                              } else {
                                this.field_t = -1;
                                if (var5 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            if (0 != (var4 ^ -1)) {
                              this.field_t = var4;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                }
                if (!this.field_q.b(20)) {
                  return;
                } else {
                  this.field_s = this.b(sta.field_B, jba.field_j, true);
                  if (-2 == (hf.field_b ^ -1)) {
                    var4 = this.b(lba.field_p, jm.field_m, true);
                    if (var4 != this.field_t) {
                      if (0 != (var4 ^ -1)) {
                        this.field_t = var4;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_t = -1;
                      if (var5 != 0) {
                        L7: {
                          if (0 != (var4 ^ -1)) {
                            this.field_t = var4;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  if (0 == (this.field_t ^ -1)) {
                    break L8;
                  } else {
                    this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                    if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                      break L8;
                    } else {
                      this.field_r[this.field_t] = 8;
                      break L8;
                    }
                  }
                }
                if (!this.field_q.b(20)) {
                  return;
                } else {
                  this.field_s = this.b(sta.field_B, jba.field_j, true);
                  if (-2 != (hf.field_b ^ -1)) {
                    return;
                  } else {
                    L9: {
                      L10: {
                        var4 = this.b(lba.field_p, jm.field_m, true);
                        if (var4 != this.field_t) {
                          break L10;
                        } else {
                          this.field_t = -1;
                          if (var5 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        this.field_t = var4;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    return;
                  }
                }
              }
            }
          } else {
            this.field_r[var4] = this.field_r[var4] - 1;
            var7 = this.field_r[var4] - 1;
            var6 = 0;
            if (var5 != 0) {
              if (var6 == var7) {
                L11: {
                  if (0 == (this.field_t ^ -1)) {
                    break L11;
                  } else {
                    this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                    if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                      break L11;
                    } else {
                      this.field_r[this.field_t] = 8;
                      break L11;
                    }
                  }
                }
                if (!this.field_q.b(20)) {
                  return;
                } else {
                  this.field_s = this.b(sta.field_B, jba.field_j, true);
                  if (-2 != (hf.field_b ^ -1)) {
                    return;
                  } else {
                    L12: {
                      L13: {
                        var4 = this.b(lba.field_p, jm.field_m, true);
                        if (var4 != this.field_t) {
                          break L13;
                        } else {
                          this.field_t = -1;
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      if (0 != (var4 ^ -1)) {
                        this.field_t = var4;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  }
                }
              } else {
                this.field_r[this.field_s] = this.field_r[this.field_s] + 2;
                if (this.field_r[this.field_s] + 2 > 4) {
                  L14: {
                    this.field_r[this.field_s] = 4;
                    if (0 == (this.field_t ^ -1)) {
                      break L14;
                    } else {
                      this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                      if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                        break L14;
                      } else {
                        this.field_r[this.field_t] = 8;
                        if (!this.field_q.b(20)) {
                          return;
                        } else {
                          this.field_s = this.b(sta.field_B, jba.field_j, true);
                          if (-2 != (hf.field_b ^ -1)) {
                            return;
                          } else {
                            L15: {
                              L16: {
                                var4 = this.b(lba.field_p, jm.field_m, true);
                                if (var4 != this.field_t) {
                                  break L16;
                                } else {
                                  this.field_t = -1;
                                  if (var5 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (0 != (var4 ^ -1)) {
                                this.field_t = var4;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                  if (!this.field_q.b(20)) {
                    return;
                  } else {
                    this.field_s = this.b(sta.field_B, jba.field_j, true);
                    if (-2 == (hf.field_b ^ -1)) {
                      var4 = this.b(lba.field_p, jm.field_m, true);
                      if (var4 != this.field_t) {
                        if (0 == (var4 ^ -1)) {
                          return;
                        } else {
                          this.field_t = var4;
                          return;
                        }
                      } else {
                        this.field_t = -1;
                        if (var5 != 0) {
                          L17: {
                            if (0 != (var4 ^ -1)) {
                              this.field_t = var4;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L18: {
                    if (0 == (this.field_t ^ -1)) {
                      break L18;
                    } else {
                      this.field_r[this.field_t] = this.field_r[this.field_t] + 3;
                      if ((this.field_r[this.field_t] + 3 ^ -1) >= -9) {
                        break L18;
                      } else {
                        this.field_r[this.field_t] = 8;
                        break L18;
                      }
                    }
                  }
                  if (!this.field_q.b(20)) {
                    return;
                  } else {
                    this.field_s = this.b(sta.field_B, jba.field_j, true);
                    if (-2 != (hf.field_b ^ -1)) {
                      return;
                    } else {
                      L19: {
                        L20: {
                          var4 = this.b(lba.field_p, jm.field_m, true);
                          if (var4 != this.field_t) {
                            break L20;
                          } else {
                            this.field_t = -1;
                            if (var5 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (0 != (var4 ^ -1)) {
                          this.field_t = var4;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      return;
                    }
                  }
                }
              }
            } else {
              L21: {
                if (var6 <= var7) {
                  break L21;
                } else {
                  this.field_r[var4] = 0;
                  break L21;
                }
              }
              var4++;
              continue L0;
            }
          }
        }
    }

    private final nh h(int param0, int param1) {
        if (!eq.c(param1)) {
          if (this.a(false, param0)) {
            return lva.field_m[param0];
          } else {
            return lva.field_m[42 + this.field_w[param0]];
          }
        } else {
          if (!oj.field_tb[82]) {
            if (this.a(false, param0)) {
              return lva.field_m[param0];
            } else {
              return lva.field_m[42 + this.field_w[param0]];
            }
          } else {
            return lva.field_m[param0];
          }
        }
    }

    private final int b(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var4 = this.d(-29787);
        var5 = -1;
        var6 = 0;
        var7 = -1;
        var8 = -1;
        var9 = 0;
        if (!param2) {
          this.field_s = -44;
          L0: while (true) {
            if (-1 > (var4 ^ -1)) {
              stackOut_24_0 = -1;
              stackIn_26_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (var11 == 0) {
                L1: {
                  L2: {
                    if (stackIn_26_0 == var5) {
                      break L2;
                    } else {
                      if (9 != var6) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var6 = 0;
                    var5++;
                    if (-10 >= (var4 ^ -1)) {
                      stackOut_31_0 = 9;
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    } else {
                      stackOut_30_0 = var4;
                      stackIn_32_0 = stackOut_30_0;
                      break L3;
                    }
                  }
                  var10 = stackIn_32_0;
                  var7 = (40 * (9 - var10) >> 1933619713) + ((-360 + (-188 + (aaa.a(false) - 80)) >> -486271103) + 40);
                  var8 = 44 * var5 + ((-540 + (-80 + aaa.a(false) - 8) >> 923471041) + 80);
                  break L1;
                }
                L4: {
                  if (!this.i(var9, 38)) {
                    break L4;
                  } else {
                    L5: {
                      if (param1 < var7) {
                        break L5;
                      } else {
                        if (param0 < var8) {
                          break L5;
                        } else {
                          if (var7 - -40 <= param1) {
                            break L5;
                          } else {
                            if (param0 >= 44 + var8) {
                              break L5;
                            } else {
                              return var9;
                            }
                          }
                        }
                      }
                    }
                    var4--;
                    var7 += 40;
                    var6++;
                    break L4;
                  }
                }
                var9++;
                continue L0;
              } else {
                return stackIn_25_0;
              }
            } else {
              return -1;
            }
          }
        } else {
          L6: while (true) {
            if (-1 > (var4 ^ -1)) {
              stackOut_3_0 = -1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (var11 == 0) {
                L7: {
                  L8: {
                    if (stackIn_5_0 == var5) {
                      break L8;
                    } else {
                      if (9 != var6) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    var6 = 0;
                    var5++;
                    if (-10 >= (var4 ^ -1)) {
                      stackOut_10_0 = 9;
                      stackIn_11_0 = stackOut_10_0;
                      break L9;
                    } else {
                      stackOut_9_0 = var4;
                      stackIn_11_0 = stackOut_9_0;
                      break L9;
                    }
                  }
                  var10 = stackIn_11_0;
                  var7 = (40 * (9 - var10) >> 1933619713) + ((-360 + (-188 + (aaa.a(false) - 80)) >> -486271103) + 40);
                  var8 = 44 * var5 + ((-540 + (-80 + aaa.a(false) - 8) >> 923471041) + 80);
                  break L7;
                }
                L10: {
                  if (!this.i(var9, 38)) {
                    break L10;
                  } else {
                    L11: {
                      if (param1 < var7) {
                        break L11;
                      } else {
                        if (param0 < var8) {
                          break L11;
                        } else {
                          if (var7 - -40 <= param1) {
                            break L11;
                          } else {
                            if (param0 >= 44 + var8) {
                              break L11;
                            } else {
                              return var9;
                            }
                          }
                        }
                      }
                    }
                    var4--;
                    var7 += 40;
                    var6++;
                    break L10;
                  }
                }
                var9++;
                continue L6;
              } else {
                return stackIn_4_0;
              }
            } else {
              return -1;
            }
          }
        }
    }

    private final void j(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        nh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = this.d(-29787);
        var4 = -1;
        if (param0 <= -102) {
          var5 = 0;
          var6 = -1;
          var7 = -1;
          var8 = 0;
          L0: while (true) {
            if (-1 > (var3 ^ -1)) {
              if (var11 == 0) {
                L1: {
                  L2: {
                    if (var4 == -1) {
                      break L2;
                    } else {
                      if ((var5 ^ -1) == -10) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var5 = 0;
                    var4++;
                    if (var3 < 9) {
                      stackOut_12_0 = var3;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = 9;
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  var9_int = stackIn_13_0;
                  var6 = (40 * (-var9_int + 9) >> -1682440063) + (-540 + (-80 + aaa.a(false) + -8) >> 1178670177) + 40;
                  var7 = (-8 + (aaa.a(false) + -80) - 540 >> 1421631809) + param1 - -80 - -(44 * var4);
                  break L1;
                }
                L4: {
                  L5: {
                    if (this.i(var8, 94)) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = this.h(var8, 0);
                  var10 = this.field_r[var8];
                  var9.a(-(var10 >> -1977970271) + (var6 - -4), -(var10 >> 889818081) + (var7 - -4), var10 + 32, var10 + 32);
                  var5++;
                  var3--;
                  var6 += 40;
                  break L4;
                }
                var8++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final boolean a(boolean param0, int param1) {
        int discarded$2 = 0;
        da var4 = null;
        if (param0) {
          var4 = (da) null;
          discarded$2 = this.a((String) null, (qla) null, -5, -61, -30, (da) null, 39, -50, -125);
          return vaa.a(rb.field_o, param1, -101);
        } else {
          return vaa.a(rb.field_o, param1, -101);
        }
    }

    final static pha a(byte param0, long param1) {
        if (param0 != -40) {
          field_v = -0.5121414661407471f;
          return (pha) ((Object) tc.field_d.a(param0 ^ 88, param1));
        } else {
          return (pha) ((Object) tc.field_d.a(param0 ^ 88, param1));
        }
    }

    private final boolean i(int param0, int param1) {
        if (param1 <= 30) {
            this.a(false, 72, (byte) -87);
            return lk.field_h[param0];
        }
        return lk.field_h[param0];
    }

    final int a(byte param0, int param1) {
        if (param0 <= 111) {
          return 68;
        } else {
          return aaa.a(false) / 2 - (-15 + this.field_m[param1].e(-163) / 2 * this.field_m.length) - -(this.field_m[param1].e(-163) * param1);
        }
    }

    private final void c(int param0, byte param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ha var6_ref_ha = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        int var10 = 0;
        String var12 = null;
        nh[] var13 = null;
        String var14 = null;
        nh[] var15 = null;
        String var16 = null;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var3 = 26;
        var4 = -180 + aaa.a(false) - 40;
        var5 = 9 + (80 + param0);
        var6_ref_ha = tga.field_a;
        if (param1 == -22) {
          L0: {
            var7 = var4;
            var8_int = var5;
            var15 = dr.field_a;
            tra.a(1, var15, (byte) -89, var7, var6_ref_ha, 180, 1, 180, var8_int, 0);
            if ((this.field_t ^ -1) != 0) {
              stackOut_16_0 = this.field_t;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              stackOut_15_0 = this.field_s;
              stackIn_17_0 = stackOut_15_0;
              break L0;
            }
          }
          var6 = stackIn_17_0;
          if (-1 != var6) {
            if (this.i(var6, 65)) {
              this.h(var6, 0).a(var4 - -var3, var3 + var5);
              var7 = var5 + 20 + 180;
              var8 = lq.field_p[var6].toUpperCase();
              var16 = kv.field_c[var6];
              var10 = this.a(var8, ds.field_n, -6671872, 180, var4, eda.field_f, 128, var7, 15);
              var7 = var7 + (5 + 15 * var10);
              if (this.a(false, var6)) {
                kn.field_p.a(var7, false, dl.field_p, var4, -14671840, -1);
                if (TombRacer.field_G) {
                  kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                  var7 += 20;
                  discarded$6 = this.a(var16 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                  return;
                } else {
                  var7 += 20;
                  discarded$7 = this.a(var16 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                  return;
                }
              } else {
                kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                var7 += 20;
                discarded$8 = this.a(var16 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L1: {
            this.field_w = (int[]) null;
            var7 = var4;
            var8_int = var5;
            var13 = dr.field_a;
            tra.a(1, var13, (byte) -89, var7, var6_ref_ha, 180, 1, 180, var8_int, 0);
            if ((this.field_t ^ -1) != 0) {
              stackOut_3_0 = this.field_t;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = this.field_s;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          var6 = stackIn_4_0;
          if (-1 != var6) {
            if (this.i(var6, 65)) {
              this.h(var6, 0).a(var4 - -var3, var3 + var5);
              var7 = var5 + 20 + 180;
              var8 = lq.field_p[var6].toUpperCase();
              var14 = kv.field_c[var6];
              var12 = var14;
              var10 = this.a(var8, ds.field_n, -6671872, 180, var4, eda.field_f, 128, var7, 15);
              var7 = var7 + (5 + 15 * var10);
              if (this.a(false, var6)) {
                kn.field_p.a(var7, false, dl.field_p, var4, -14671840, -1);
                if (TombRacer.field_G) {
                  kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                  var7 += 20;
                  discarded$9 = this.a(var14 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                  return;
                } else {
                  var7 += 20;
                  discarded$10 = this.a(var14 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                  return;
                }
              } else {
                kn.field_p.a(var7, false, pg.field_x, var4, -6671872, -1);
                var7 += 20;
                discarded$11 = this.a(var14 + "<br><br>" + jn.field_r + sw.field_zb[var6] + "       " + vla.field_m + sw.field_zb[var6] / 100, kv.field_a, -14671840, 180, var4, kn.field_p, param1 ^ -150, var7, 15);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int g(int param0, int param1) {
        if (param1 != 30) {
          this.field_r = (int[]) null;
          return -30 + koa.b(param1 ^ 30);
        } else {
          return -30 + koa.b(param1 ^ 30);
        }
    }

    private final int a(String param0, qla param1, int param2, int param3, int param4, da param5, int param6, int param7, int param8) {
        String[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var14 = new String[10];
            var10 = var14;
            var11 = param1.a(param0, -99, var14, (nh[]) null, new int[]{param3});
            if (param6 == 128) {
              var12 = 0;
              L1: while (true) {
                L2: {
                  if (var14.length <= var12) {
                    break L2;
                  } else {
                    param5.a(var12 * param8 + param7, false, var14[var12], param4, param2, -1);
                    var12++;
                    if (var13 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = var11;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -59;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var10_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var10_ref);
            stackOut_9_1 = new StringBuilder().append("vba.IA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param5 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final String b(int param0, byte param1) {
        if (param1 <= 111) {
            field_u = (boolean[]) null;
            if (!(0 != param0)) {
                return fga.field_a;
            }
            return super.b(param0, (byte) 121);
        }
        if (!(0 != param0)) {
            return fga.field_a;
        }
        return super.b(param0, (byte) 121);
    }

    final void a(boolean param0, int param1, byte param2) {
        L0: {
          qr.field_v.a(63 + param1, false, qja.field_i.toUpperCase(), 65, -14279929, -1);
          this.j(-119, param1);
          this.c(param1, (byte) -22);
          if (vpa.a(7)) {
            kn.field_p.a(-1, -1, aaa.a(false) / 2, -14345466, 405 + param1, ooa.field_h);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 < -9) {
          return;
        } else {
          this.field_r = (int[]) null;
          return;
        }
    }

    private final int d(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackOut_5_0 = false;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param0 == -29787) {
            break L0;
          } else {
            discarded$2 = this.d(76);
            break L0;
          }
        }
        var2 = 0;
        var3 = 0;
        L1: while (true) {
          if (42 > var3) {
            stackOut_5_0 = this.i(var3, 37);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var4 == 0) {
              L2: {
                if (!stackIn_7_0) {
                  break L2;
                } else {
                  var2++;
                  break L2;
                }
              }
              var3++;
              continue L1;
            } else {
              return stackIn_6_0 ? 1 : 0;
            }
          } else {
            return var2;
          }
        }
    }

    public static void d(byte param0) {
        field_x = null;
        field_u = null;
        if (param0 == -10) {
            return;
        }
        field_x = (int[]) null;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 0) {
            return true;
        }
        return super.c(param0, 0);
    }

    static {
        field_x = new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128};
        field_v = 0.25f;
    }
}
