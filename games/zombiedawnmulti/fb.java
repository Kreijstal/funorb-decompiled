/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb {
    static qd field_e;
    int field_m;
    private int field_n;
    static String field_g;
    private boolean field_k;
    private int field_c;
    private int field_f;
    static int[] field_d;
    private int field_j;
    int field_l;
    private int field_a;
    private int field_i;
    private int field_h;
    boolean field_b;

    final boolean b(byte param0) {
        if (param0 < 14) {
            this.field_c = -121;
            return this.field_k;
        }
        return this.field_k;
    }

    public static void d(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        if (param0 > -29) {
            field_d = (int[]) null;
        }
    }

    final int a(int param0, byte param1) {
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param1 <= -43) {
          if (!this.field_b) {
            if (this.field_h <= 55) {
              return -1;
            } else {
              L0: {
                L1: {
                  if (param0 + -this.field_m <= 0) {
                    break L1;
                  } else {
                    if ((-this.field_m + param0 ^ -1) <= -41) {
                      break L1;
                    } else {
                      stackOut_16_0 = this.field_n;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = -1;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0;
            }
          } else {
            return -1;
          }
        } else {
          this.field_b = false;
          if (!this.field_b) {
            if (this.field_h > 55) {
              if (param0 + -this.field_m > 0) {
                if ((-this.field_m + param0 ^ -1) <= -41) {
                  return -1;
                } else {
                  return this.field_n;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final static void a(ob param0, byte param1) {
        try {
            param0.field_D = new char[]{(char)63};
            int var2_int = 54 / ((23 - param1) / 40);
            param0.field_B = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fb.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        jk.field_j = param0;
        if (param1 < 43) {
            fb.d(-36);
        }
    }

    private final int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        float var7 = 0.0f;
        var4 = Math.abs(20 + (this.field_m - param2));
        if (param0 < 81) {
          return 73;
        } else {
          L0: {
            var5 = 480 - param1;
            var6 = 55;
            var7 = (float)(-(var4 * var4) + -(var5 * var5)) + 8100.0f;
            if (0.0f < var7) {
              L1: {
                if (var7 <= 8000.0f) {
                  break L1;
                } else {
                  var7 = 8000.0f;
                  break L1;
                }
              }
              var6 = var6 + (int)(10.0f * (var7 / 8000.0f));
              break L0;
            } else {
              break L0;
            }
          }
          return var6;
        }
    }

    final void b(int param0) {
        this.field_a = param0;
        this.field_k = true;
        this.field_b = false;
    }

    final void c(byte param0) {
        this.field_k = false;
        if (param0 != 18) {
            this.field_b = false;
        }
    }

    final void a(int param0) {
        this.field_k = false;
        this.field_b = true;
        this.field_a = param0;
        this.field_h = 0;
        this.field_c = 0;
    }

    final int a(byte param0) {
        int discarded$0 = 0;
        if (param0 < 37) {
            discarded$0 = this.a((byte) -62);
            return this.field_n;
        }
        return this.field_n;
    }

    final boolean a(int param0, int param1, byte param2) {
        int discarded$7 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (param2 < -32) {
          if (55 > 480 + -param0) {
            if (this.field_b) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param1 <= this.field_m) {
                    break L1;
                  } else {
                    if (param1 >= this.field_m - -40) {
                      break L1;
                    } else {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L0;
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          discarded$7 = this.a(83, (byte) -68);
          if (55 > 480 + -param0) {
            if (!this.field_b) {
              if (param1 > this.field_m) {
                if (param1 >= this.field_m - -40) {
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
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var2 = 76 / ((param0 - 82) / 33);
        if (this.field_h > 0) {
          if (this.field_l == 0) {
            return;
          } else {
            L0: {
              var3 = -(255 * (-this.field_c + this.field_l) / this.field_l) + 255;
              if (var3 < 0) {
                var3 = 0;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var3 <= 255) {
                break L1;
              } else {
                var3 = 255;
                break L1;
              }
            }
            el.field_H[this.field_a].c(this.field_m, -this.field_h + 480, var3);
            if (-3 == (this.field_a ^ -1)) {
              if (this.field_l <= this.field_c) {
                var4 = (this.field_i - -(this.field_m / 3)) % 50;
                if (25 >= var4) {
                  if (this.field_k) {
                    L2: {
                      el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
                      wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
                      if (this.field_k) {
                        wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      el.field_H[3].g(this.field_m, 480 - this.field_h);
                      if (!ZombieDawnMulti.field_E) {
                        break L3;
                      } else {
                        var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
                        wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
                        var16 = new int[4];
                        oo.a(var16);
                        oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
                        wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
                        oo.b(var16);
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
                      if (this.field_k) {
                        wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      el.field_H[3].g(this.field_m, 480 - this.field_h);
                      if (!ZombieDawnMulti.field_E) {
                        break L5;
                      } else {
                        var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
                        wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
                        var17 = new int[4];
                        oo.a(var17);
                        oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
                        wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
                        oo.b(var17);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  oo.d(wa.field_b[this.field_n].field_x / 2 + 8 + this.field_m, 504 - (this.field_h + -(wa.field_b[this.field_n].field_w / 2)), lh.field_b[var4] * 5 / 8, 13421772, 68 + -var4);
                  oo.d(wa.field_b[this.field_n].field_x / 2 + (this.field_m + 8), -this.field_h + 480 + (24 - -(wa.field_b[this.field_n].field_w / 2)), 4 * lh.field_b[var4] / 8, 11206570, 118 + -var4);
                  if (!this.field_k) {
                    L6: {
                      wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
                      if (this.field_k) {
                        wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      el.field_H[3].g(this.field_m, 480 - this.field_h);
                      if (!ZombieDawnMulti.field_E) {
                        break L7;
                      } else {
                        var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
                        wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
                        var14 = new int[4];
                        oo.a(var14);
                        oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
                        wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
                        oo.b(var14);
                        break L7;
                      }
                    }
                    return;
                  } else {
                    L8: {
                      el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
                      wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
                      if (this.field_k) {
                        wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      el.field_H[3].g(this.field_m, 480 - this.field_h);
                      if (!ZombieDawnMulti.field_E) {
                        break L9;
                      } else {
                        var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
                        wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
                        var15 = new int[4];
                        oo.a(var15);
                        oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
                        wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
                        oo.b(var15);
                        break L9;
                      }
                    }
                    return;
                  }
                }
              } else {
                L10: {
                  if (!this.field_k) {
                    break L10;
                  } else {
                    el.field_H[this.field_a].e(this.field_m, -this.field_h + 480, lh.field_b[this.field_i] + 96);
                    break L10;
                  }
                }
                L11: {
                  wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 480 + 24);
                  if (this.field_k) {
                    wa.field_b[this.field_n].e(8 + this.field_m, 24 + (480 - this.field_h), 196 + lh.field_b[this.field_i]);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  el.field_H[3].g(this.field_m, 480 - this.field_h);
                  if (!ZombieDawnMulti.field_E) {
                    break L12;
                  } else {
                    var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
                    wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
                    var13 = new int[4];
                    oo.a(var13);
                    oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
                    wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
                    oo.b(var13);
                    break L12;
                  }
                }
                return;
              }
            } else {
              var4 = wa.field_b[this.field_n].field_w + -(wa.field_b[this.field_n].field_w * (-this.field_c + this.field_l) / this.field_l);
              wa.field_b[this.field_n].c(this.field_m - -8, -this.field_h + 504, var3);
              var17 = new int[4];
              oo.a(var17);
              oo.h(8 + this.field_m, -var4 + (wa.field_b[this.field_n].field_w + 24) + (480 + -this.field_h), wa.field_b[this.field_n].field_x + 8 + this.field_m, wa.field_b[this.field_n].field_w + (24 + -this.field_h + 480));
              wa.field_b[this.field_n].g(this.field_m + 8, -this.field_h + 504);
              oo.b(var17);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_37_0 = 0;
        int stackIn_121_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          fieldTemp$1 = this.field_i + 1;
          this.field_i = this.field_i + 1;
          if (fieldTemp$1 == 50) {
            this.field_i = 0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_m <= this.field_f) {
            break L1;
          } else {
            this.field_m = this.field_m - 2;
            if (this.field_m < this.field_f) {
              this.field_m = this.field_f;
              break L1;
            } else {
              L2: {
                if (!this.field_b) {
                  break L2;
                } else {
                  this.field_a = 1;
                  this.field_h = 65;
                  this.field_c = this.field_c + 1;
                  this.field_c = op.field_m.field_H - (tg.field_e.field_b[this.field_j] - field_e.a(this.field_j, (byte) 109));
                  this.field_l = field_e.a(this.field_j, (byte) 108);
                  if (this.field_l > this.field_c) {
                    return;
                  } else {
                    this.field_a = 2;
                    this.field_c = this.field_l;
                    this.field_b = false;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L3: {
                        if (this.field_k) {
                          break L3;
                        } else {
                          if (-66 > (this.field_h ^ -1)) {
                            this.field_h = 65;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (param2 == 255) {
                          break L4;
                        } else {
                          fb.d(30);
                          break L4;
                        }
                      }
                      L5: {
                        if (this.field_b) {
                          break L5;
                        } else {
                          if (-56 < (this.field_h ^ -1)) {
                            this.field_h = 55;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (!this.field_k) {
                L6: {
                  var4 = 425;
                  if (var4 > param1) {
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L6;
                  } else {
                    stackOut_35_0 = this.a((byte) 118, param1, param0);
                    stackIn_37_0 = stackOut_35_0;
                    break L6;
                  }
                }
                var5 = stackIn_37_0;
                if ((Math.abs(-this.field_h + var5) ^ -1) < -3) {
                  L7: {
                    L8: {
                      if (this.field_h >= var5) {
                        break L8;
                      } else {
                        this.field_h = this.field_h + 2;
                        if (var6 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_h = this.field_h - 2;
                    break L7;
                  }
                  L9: {
                    if (65 >= this.field_h) {
                      break L9;
                    } else {
                      this.field_h = 65;
                      break L9;
                    }
                  }
                  L10: {
                    if ((this.field_h ^ -1) > -56) {
                      this.field_h = 55;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (var6 == 0) {
                      break L11;
                    } else {
                      this.field_h = 70;
                      break L11;
                    }
                  }
                  L12: {
                    if (this.field_k) {
                      break L12;
                    } else {
                      if (-66 > (this.field_h ^ -1)) {
                        this.field_h = 65;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    if (param2 == 255) {
                      break L13;
                    } else {
                      fb.d(30);
                      break L13;
                    }
                  }
                  L14: {
                    if (this.field_b) {
                      break L14;
                    } else {
                      if (-56 < (this.field_h ^ -1)) {
                        this.field_h = 55;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                  return;
                } else {
                  L15: {
                    this.field_h = var5;
                    if (var6 == 0) {
                      break L15;
                    } else {
                      L16: {
                        if (this.field_h >= var5) {
                          break L16;
                        } else {
                          this.field_h = this.field_h + 2;
                          break L16;
                        }
                      }
                      this.field_h = this.field_h - 2;
                      break L15;
                    }
                  }
                  L17: {
                    if (65 >= this.field_h) {
                      break L17;
                    } else {
                      this.field_h = 65;
                      break L17;
                    }
                  }
                  L18: {
                    if ((this.field_h ^ -1) > -56) {
                      this.field_h = 55;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var6 == 0) {
                      break L19;
                    } else {
                      this.field_h = 70;
                      break L19;
                    }
                  }
                  L20: {
                    if (this.field_k) {
                      break L20;
                    } else {
                      if (-66 > (this.field_h ^ -1)) {
                        this.field_h = 65;
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (param2 == 255) {
                      break L21;
                    } else {
                      fb.d(30);
                      break L21;
                    }
                  }
                  L22: {
                    if (this.field_b) {
                      break L22;
                    } else {
                      if (-56 < (this.field_h ^ -1)) {
                        this.field_h = 55;
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  return;
                }
              } else {
                this.field_h = 70;
                L23: {
                  if (this.field_k) {
                    break L23;
                  } else {
                    if (-66 > (this.field_h ^ -1)) {
                      this.field_h = 65;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  if (param2 == 255) {
                    break L24;
                  } else {
                    fb.d(30);
                    break L24;
                  }
                }
                L25: {
                  if (this.field_b) {
                    break L25;
                  } else {
                    if (-56 < (this.field_h ^ -1)) {
                      this.field_h = 55;
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        L26: {
          if (!this.field_b) {
            break L26;
          } else {
            this.field_a = 1;
            this.field_h = 65;
            this.field_c = this.field_c + 1;
            this.field_c = op.field_m.field_H - (tg.field_e.field_b[this.field_j] - field_e.a(this.field_j, (byte) 109));
            this.field_l = field_e.a(this.field_j, (byte) 108);
            if (this.field_l > this.field_c) {
              return;
            } else {
              this.field_a = 2;
              this.field_c = this.field_l;
              this.field_b = false;
              if (var6 != 0) {
                break L26;
              } else {
                L27: {
                  if (this.field_k) {
                    break L27;
                  } else {
                    if (-66 > (this.field_h ^ -1)) {
                      this.field_h = 65;
                      break L27;
                    } else {
                      if (param2 == 255) {
                        if (!this.field_b) {
                          if (-56 >= (this.field_h ^ -1)) {
                            return;
                          } else {
                            this.field_h = 55;
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        L28: {
                          fb.d(30);
                          if (this.field_b) {
                            break L28;
                          } else {
                            if (-56 < (this.field_h ^ -1)) {
                              this.field_h = 55;
                              break L28;
                            } else {
                              break L28;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                if (param2 == 255) {
                  if (!this.field_b) {
                    if (-56 >= (this.field_h ^ -1)) {
                      return;
                    } else {
                      this.field_h = 55;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  fb.d(30);
                  if (!this.field_b) {
                    if (-56 >= (this.field_h ^ -1)) {
                      return;
                    } else {
                      this.field_h = 55;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
        L29: {
          if (this.field_k) {
            break L29;
          } else {
            L30: {
              var4 = 425;
              if (var4 > param1) {
                stackOut_120_0 = 0;
                stackIn_121_0 = stackOut_120_0;
                break L30;
              } else {
                stackOut_119_0 = this.a((byte) 118, param1, param0);
                stackIn_121_0 = stackOut_119_0;
                break L30;
              }
            }
            L31: {
              var5 = stackIn_121_0;
              if ((Math.abs(-this.field_h + var5) ^ -1) < -3) {
                break L31;
              } else {
                this.field_h = var5;
                if (var6 != 0) {
                  break L31;
                } else {
                  if (65 >= this.field_h) {
                    L32: {
                      if ((this.field_h ^ -1) > -56) {
                        this.field_h = 55;
                        break L32;
                      } else {
                        break L32;
                      }
                    }
                    if (var6 == 0) {
                      L33: {
                        if (this.field_k) {
                          break L33;
                        } else {
                          if (-66 > (this.field_h ^ -1)) {
                            this.field_h = 65;
                            break L33;
                          } else {
                            if (param2 == 255) {
                              if (!this.field_b) {
                                if (-56 < (this.field_h ^ -1)) {
                                  this.field_h = 55;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                return;
                              }
                            } else {
                              L34: {
                                fb.d(30);
                                if (this.field_b) {
                                  break L34;
                                } else {
                                  if (-56 < (this.field_h ^ -1)) {
                                    this.field_h = 55;
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
                      }
                      if (param2 == 255) {
                        L35: {
                          if (this.field_b) {
                            break L35;
                          } else {
                            if (-56 < (this.field_h ^ -1)) {
                              this.field_h = 55;
                              break L35;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        fb.d(30);
                        if (!this.field_b) {
                          if (-56 >= (this.field_h ^ -1)) {
                            return;
                          } else {
                            this.field_h = 55;
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      L36: {
                        this.field_h = 70;
                        if (this.field_k) {
                          break L36;
                        } else {
                          if (-66 > (this.field_h ^ -1)) {
                            this.field_h = 65;
                            break L36;
                          } else {
                            L37: {
                              if (param2 == 255) {
                                break L37;
                              } else {
                                fb.d(30);
                                break L37;
                              }
                            }
                            L38: {
                              if (this.field_b) {
                                break L38;
                              } else {
                                if (-56 < (this.field_h ^ -1)) {
                                  this.field_h = 55;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            return;
                          }
                        }
                      }
                      if (param2 == 255) {
                        if (!this.field_b) {
                          if (-56 < (this.field_h ^ -1)) {
                            this.field_h = 55;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        L39: {
                          fb.d(30);
                          if (this.field_b) {
                            break L39;
                          } else {
                            if (-56 < (this.field_h ^ -1)) {
                              this.field_h = 55;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L40: {
                      this.field_h = 65;
                      if ((this.field_h ^ -1) > -56) {
                        this.field_h = 55;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (var6 == 0) {
                        break L41;
                      } else {
                        this.field_h = 70;
                        break L41;
                      }
                    }
                    L42: {
                      if (this.field_k) {
                        break L42;
                      } else {
                        if (-66 > (this.field_h ^ -1)) {
                          this.field_h = 65;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L43: {
                      if (param2 == 255) {
                        break L43;
                      } else {
                        fb.d(30);
                        break L43;
                      }
                    }
                    L44: {
                      if (this.field_b) {
                        break L44;
                      } else {
                        if (-56 < (this.field_h ^ -1)) {
                          this.field_h = 55;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            L45: {
              if (this.field_h >= var5) {
                break L45;
              } else {
                this.field_h = this.field_h + 2;
                if (var6 == 0) {
                  if (65 >= this.field_h) {
                    L46: {
                      if ((this.field_h ^ -1) > -56) {
                        this.field_h = 55;
                        break L46;
                      } else {
                        break L46;
                      }
                    }
                    if (var6 == 0) {
                      L47: {
                        if (this.field_k) {
                          break L47;
                        } else {
                          if (-66 > (this.field_h ^ -1)) {
                            this.field_h = 65;
                            break L47;
                          } else {
                            if (param2 == 255) {
                              L48: {
                                if (this.field_b) {
                                  break L48;
                                } else {
                                  if (-56 < (this.field_h ^ -1)) {
                                    this.field_h = 55;
                                    break L48;
                                  } else {
                                    return;
                                  }
                                }
                              }
                              return;
                            } else {
                              L49: {
                                fb.d(30);
                                if (this.field_b) {
                                  break L49;
                                } else {
                                  if (-56 < (this.field_h ^ -1)) {
                                    this.field_h = 55;
                                    break L49;
                                  } else {
                                    return;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                      }
                      if (param2 == 255) {
                        L50: {
                          if (this.field_b) {
                            break L50;
                          } else {
                            if (-56 < (this.field_h ^ -1)) {
                              this.field_h = 55;
                              break L50;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      } else {
                        L51: {
                          fb.d(30);
                          if (this.field_b) {
                            break L51;
                          } else {
                            if (-56 < (this.field_h ^ -1)) {
                              this.field_h = 55;
                              break L51;
                            } else {
                              return;
                            }
                          }
                        }
                        return;
                      }
                    } else {
                      break L29;
                    }
                  } else {
                    L52: {
                      this.field_h = 65;
                      if ((this.field_h ^ -1) > -56) {
                        this.field_h = 55;
                        break L52;
                      } else {
                        break L52;
                      }
                    }
                    L53: {
                      if (var6 == 0) {
                        break L53;
                      } else {
                        this.field_h = 70;
                        break L53;
                      }
                    }
                    L54: {
                      if (this.field_k) {
                        break L54;
                      } else {
                        if (-66 > (this.field_h ^ -1)) {
                          this.field_h = 65;
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                    }
                    L55: {
                      if (param2 == 255) {
                        break L55;
                      } else {
                        fb.d(30);
                        break L55;
                      }
                    }
                    L56: {
                      if (this.field_b) {
                        break L56;
                      } else {
                        if (-56 < (this.field_h ^ -1)) {
                          this.field_h = 55;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  break L45;
                }
              }
            }
            L57: {
              this.field_h = this.field_h - 2;
              if (65 >= this.field_h) {
                break L57;
              } else {
                this.field_h = 65;
                break L57;
              }
            }
            L58: {
              if ((this.field_h ^ -1) > -56) {
                this.field_h = 55;
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              if (var6 == 0) {
                break L59;
              } else {
                this.field_h = 70;
                break L59;
              }
            }
            L60: {
              if (this.field_k) {
                break L60;
              } else {
                if (-66 > (this.field_h ^ -1)) {
                  this.field_h = 65;
                  break L60;
                } else {
                  break L60;
                }
              }
            }
            L61: {
              if (param2 == 255) {
                break L61;
              } else {
                fb.d(30);
                break L61;
              }
            }
            L62: {
              if (this.field_b) {
                break L62;
              } else {
                if (-56 < (this.field_h ^ -1)) {
                  this.field_h = 55;
                  break L62;
                } else {
                  break L62;
                }
              }
            }
            return;
          }
        }
        L63: {
          this.field_h = 70;
          if (this.field_k) {
            break L63;
          } else {
            if (-66 > (this.field_h ^ -1)) {
              this.field_h = 65;
              break L63;
            } else {
              L64: {
                if (param2 == 255) {
                  break L64;
                } else {
                  fb.d(30);
                  break L64;
                }
              }
              L65: {
                if (this.field_b) {
                  break L65;
                } else {
                  if (-56 < (this.field_h ^ -1)) {
                    this.field_h = 55;
                    break L65;
                  } else {
                    break L65;
                  }
                }
              }
              return;
            }
          }
        }
        if (param2 == 255) {
          L66: {
            if (this.field_b) {
              break L66;
            } else {
              if (-56 < (this.field_h ^ -1)) {
                this.field_h = 55;
                break L66;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          L67: {
            fb.d(30);
            if (this.field_b) {
              break L67;
            } else {
              if (-56 < (this.field_h ^ -1)) {
                this.field_h = 55;
                break L67;
              } else {
                return;
              }
            }
          }
          return;
        }
    }

    fb(int param0, int param1, int param2) {
        this.field_k = false;
        this.field_b = false;
        this.field_m = param0;
        this.field_f = this.field_m;
        this.field_a = 2;
        this.field_j = param2;
        this.field_h = 0;
        this.field_n = param1;
        this.field_c = 0;
    }

    static {
        field_g = "You know what you want, so should your zombies. This will hurry them up, making them move faster.";
    }
}
