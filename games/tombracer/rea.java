/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rea extends nv {
    private int field_s;
    private int field_q;
    private boolean field_u;
    private boolean field_p;
    private int field_o;
    private int field_v;
    private int field_n;
    private int field_w;
    static String field_r;
    private int field_x;
    private up field_t;

    final boolean l(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -5) {
          L0: {
            this.field_t = (up) null;
            if (-5 != (this.field_n ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-5 != (this.field_n ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(int param0) {
        int var2 = 97 / ((param0 - 2) / 62);
        return -2 == (this.field_n ^ -1) ? true : false;
    }

    final boolean r(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -31) {
          L0: {
            this.field_o = 10;
            if (this.field_n != 2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_n != 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1);
              if (4 > this.b(true).field_E) {
                param1.h(3, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.b((byte) -62, 8);
              if (0 != this.field_q) {
                break L2;
              } else {
                param1.b((byte) 17, true);
                this.field_q = param1.b(73);
                param1.a((byte) -3, 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("rea.Q(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 116, this.field_v, 8);
            param1.a((byte) -128, this.field_o, 8);
            param1.a((byte) 107, this.field_s, 8);
            param1.a((byte) -20, this.field_x, 8);
            param1.a((byte) -126, this.field_u ? 1 : 0, 1);
            param1.a((byte) -23, this.field_p ? 1 : 0, 1);
            this.field_t.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rea(la param0, boolean param1) {
        super(param0, param1);
        this.field_u = false;
        this.field_p = false;
        try {
            this.field_s = 25;
            this.field_x = 50;
            this.field_v = 50;
            this.field_o = 25;
            this.field_t = new up(0, 100);
            this.field_t.b(1, 4);
            this.k((byte) -106);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "rea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        if (0 < this.field_s) {
          L0: {
            if (0 >= this.field_v) {
              this.field_v = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 <= (this.field_o ^ -1)) {
              this.field_o = 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (this.field_x <= 0) {
            this.field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        } else {
          L2: {
            this.field_s = 1;
            if (0 >= this.field_v) {
              this.field_v = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-1 <= (this.field_o ^ -1)) {
              this.field_o = 1;
              break L3;
            } else {
              break L3;
            }
          }
          if (this.field_x > 0) {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            this.field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        }
    }

    final int j(byte param0) {
        if (param0 != 90) {
            field_r = (String) null;
            return this.field_o;
        }
        return this.field_o;
    }

    final void b(byte param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (param0 <= 64) {
            this.field_q = -123;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            this.a(109, 0, 65, 72, 73);
            return 2;
        }
        return 2;
    }

    final boolean s(int param0) {
        int var2 = -108 % ((param0 - -19) / 49);
        return (this.field_n ^ -1) == -4 ? true : false;
    }

    rea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_u = false;
        this.field_p = false;
        try {
          L0: {
            L1: {
              L2: {
                if (-4 >= (param0.field_E ^ -1)) {
                  break L2;
                } else {
                  this.field_o = 25;
                  this.field_u = false;
                  this.field_v = 50;
                  this.field_x = 50;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                this.field_v = param1.b((byte) 44, 8);
                this.field_o = param1.b((byte) 44, 8);
                if ((param0.field_E ^ -1) > -21) {
                  break L3;
                } else {
                  this.field_s = param1.b((byte) 44, 8);
                  break L3;
                }
              }
              L4: {
                this.field_x = param1.b((byte) 44, 8);
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L4;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L4;
                }
              }
              ((rea) (this)).field_u = stackIn_8_1 != 0;
              if (param0.field_E < 20) {
                break L1;
              } else {
                L5: {
                  stackOut_9_0 = this;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                    stackOut_11_0 = this;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L5;
                  } else {
                    stackOut_10_0 = this;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L5;
                  }
                }
                ((rea) (this)).field_p = stackIn_12_1 != 0;
                break L1;
              }
            }
            L6: {
              L7: {
                if (16 <= param0.field_E) {
                  this.field_t = ad.a((byte) 87, param1);
                  break L7;
                } else {
                  this.field_t = new up(0, 100);
                  if (var5 != 0) {
                    this.field_t = ad.a((byte) 87, param1);
                    break L7;
                  } else {
                    this.k((byte) -101);
                    break L6;
                  }
                }
              }
              this.k((byte) -101);
              break L6;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("rea.<init>(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          L9: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L9;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            return true;
        }
        return true;
    }

    final void k(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        la var6 = null;
        int var7 = 0;
        hca var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = this.field_g.H(param0 + -5537);
          var3 = this.field_p ? 1 : 0;
          var4 = this.field_g.d(3);
          var5 = this.field_g.e(param0 + 4230);
          if (var3 == 0) {
            L1: {
              if (-1 != (this.field_n ^ -1)) {
                break L1;
              } else {
                var3 = ck.a(var8.d(3), var8.a((byte) 55), var4, this.field_g.c(-23), this.field_g.a((byte) 55), var8.e(9648), (byte) 69, var5, var8.c(param0 + -5519)) ? 1 : 0;
                if (var7 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (1 != this.field_n) {
              break L0;
            } else {
              var3 = ck.a(var8.d(3), 1, var4, this.field_g.c(param0 + -5496), this.field_g.a((byte) 55), var8.e(9648), (byte) 82, var5, 1) ? 1 : 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var6_int = this.field_n;
        if (-1 != (var6_int ^ -1)) {
          if (var6_int == 1) {
            L2: {
              if (var7 == 0) {
                L3: {
                  if (var3 == 0) {
                    break L3;
                  } else {
                    L4: {
                      this.field_n = 1;
                      if (!this.field_u) {
                        break L4;
                      } else {
                        this.field_g.G(121);
                        break L4;
                      }
                    }
                    this.field_w = this.field_w + 1;
                    if (this.field_v < this.field_w) {
                      this.b(param0 ^ 5418, 2);
                      if (!this.field_u) {
                        this.field_g.G(121);
                        if (var7 != 0) {
                          break L3;
                        } else {
                          if (param0 != 5418) {
                            this.field_v = -69;
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param0 != 5418) {
                          this.field_v = -69;
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.b(0, 0);
                if (this.field_u) {
                  this.field_g.L(-31);
                  if (var7 == 0) {
                    break L2;
                  } else {
                    this.field_w = this.field_w + 1;
                    if (this.field_w <= this.field_o) {
                      if (param0 != 5418) {
                        this.field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var6 = this.b(true);
                      discarded$4 = var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                      this.b(0, 3);
                      this.field_g.a((byte) -3, this.field_q);
                      this.field_g.b((byte) 17, false);
                      if (param0 != 5418) {
                        this.field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  if (param0 != 5418) {
                    this.field_v = -69;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (2 == var6_int) {
                  this.field_w = this.field_w + 1;
                  if (this.field_w <= this.field_o) {
                    break L2;
                  } else {
                    var6 = this.b(true);
                    discarded$5 = var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                    this.b(0, 3);
                    this.field_g.a((byte) -3, this.field_q);
                    this.field_g.b((byte) 17, false);
                    if (param0 != 5418) {
                      this.field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L5: {
                    if (3 != var6_int) {
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if ((var6_int ^ -1) == -5) {
                    this.field_w = this.field_w + 1;
                    if (this.field_w > this.field_x) {
                      this.b(param0 + -5418, 1);
                      this.field_g.L(127);
                      break L2;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        this.field_v = -69;
                        return;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 == 5418) {
              return;
            } else {
              this.field_v = -69;
              return;
            }
          } else {
            L6: {
              if (2 == var6_int) {
                this.field_w = this.field_w + 1;
                if (this.field_w <= this.field_o) {
                  break L6;
                } else {
                  L7: {
                    var6 = this.b(true);
                    discarded$6 = var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                    this.b(0, 3);
                    this.field_g.a((byte) -3, this.field_q);
                    this.field_g.b((byte) 17, false);
                    if (param0 == 5418) {
                      break L7;
                    } else {
                      this.field_v = -69;
                      break L7;
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  if (3 != var6_int) {
                    break L8;
                  } else {
                    if (var7 == 0) {
                      this.field_w = this.field_w + 1;
                      if (this.field_s >= this.field_w) {
                        break L6;
                      } else {
                        this.b(param0 + -5418, 4);
                        this.field_g.a((byte) -3, 0);
                        this.field_g.b((byte) 17, true);
                        if (var7 == 0) {
                          break L6;
                        } else {
                          L9: {
                            this.field_w = this.field_w + 1;
                            if (this.field_w > this.field_x) {
                              this.b(param0 + -5418, 1);
                              this.field_g.L(127);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            if (param0 == 5418) {
                              break L10;
                            } else {
                              this.field_v = -69;
                              break L10;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                }
                if ((var6_int ^ -1) == -5) {
                  this.field_w = this.field_w + 1;
                  if (this.field_w > this.field_x) {
                    this.b(param0 + -5418, 1);
                    this.field_g.L(127);
                    break L6;
                  } else {
                    L11: {
                      if (param0 == 5418) {
                        break L11;
                      } else {
                        this.field_v = -69;
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  break L6;
                }
              }
            }
            if (param0 != 5418) {
              this.field_v = -69;
              return;
            } else {
              return;
            }
          }
        } else {
          L12: {
            L13: {
              if (var3 == 0) {
                break L13;
              } else {
                L14: {
                  this.field_n = 1;
                  if (!this.field_u) {
                    break L14;
                  } else {
                    this.field_g.G(121);
                    break L14;
                  }
                }
                this.field_w = this.field_w + 1;
                if (this.field_v < this.field_w) {
                  this.b(param0 ^ 5418, 2);
                  if (!this.field_u) {
                    this.field_g.G(121);
                    if (var7 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  } else {
                    L15: {
                      if (param0 == 5418) {
                        break L15;
                      } else {
                        this.field_v = -69;
                        break L15;
                      }
                    }
                    return;
                  }
                } else {
                  break L12;
                }
              }
            }
            this.b(0, 0);
            if (!this.field_u) {
              break L12;
            } else {
              this.field_g.L(-31);
              if (var7 == 0) {
                break L12;
              } else {
                L16: {
                  this.field_w = this.field_w + 1;
                  if (this.field_w <= this.field_o) {
                    break L16;
                  } else {
                    var6 = this.b(true);
                    discarded$7 = var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                    this.b(0, 3);
                    this.field_g.a((byte) -3, this.field_q);
                    this.field_g.b((byte) 17, false);
                    break L16;
                  }
                }
                L17: {
                  if (param0 == 5418) {
                    break L17;
                  } else {
                    this.field_v = -69;
                    break L17;
                  }
                }
                return;
              }
            }
          }
          if (param0 != 5418) {
            this.field_v = -69;
            return;
          } else {
            return;
          }
        }
    }

    final static hja[] a(cn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        hja[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        hja[] stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (jna.a(false, param2, param1, param0)) {
              L1: {
                if (param3 > 20) {
                  break L1;
                } else {
                  field_r = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = uj.a(0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("rea.FA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_r = null;
        if (param0 != 12134) {
            discarded$0 = rea.a(85, 105, 55, -55, 43, true, 103);
        }
    }

    private final void b(int param0, int param1) {
        this.field_n = param1;
        this.field_w = param0;
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 49, param0, this.field_n);
        if (param1 >= -48) {
            return -52;
        }
        return param0;
    }

    final int d(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.g((byte) -41);
            return this.field_x;
        }
        return this.field_x;
    }

    final int g(byte param0) {
        if (param0 > -36) {
            field_r = (String) null;
            return this.field_w;
        }
        return this.field_w;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        boolean discarded$11 = false;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        if (!param5) {
          if (param2 <= param3) {
            if (param1 + param2 <= param3) {
              return false;
            } else {
              L0: {
                L1: {
                  if (param6 > param0) {
                    break L1;
                  } else {
                    if (param4 + param6 <= param0) {
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
          discarded$11 = rea.a(-44, -75, 109, 115, -67, true, -126);
          if (param2 <= param3) {
            if (param1 + param2 > param3) {
              if (param6 <= param0) {
                if (param4 + param6 <= param0) {
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

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ffa param6) {
        int discarded$2 = 0;
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                discarded$2 = this.g((byte) 48);
                break L1;
              }
            }
            L2: {
              if ((this.field_n ^ -1) != -4) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var8);
            stackOut_6_1 = new StringBuilder().append("rea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.field_o = param1;
        if (param2 != 1) {
          this.field_q = -90;
          this.field_v = param4;
          this.field_x = param3;
          this.field_s = param0;
          return;
        } else {
          this.field_v = param4;
          this.field_x = param3;
          this.field_s = param0;
          return;
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        pc var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (3 != this.field_n) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  var6 = (pc) null;
                  discarded$2 = this.a(-121, -9, (pc) null, -81);
                  break L1;
                }
              }
              param2.a(param3, (byte) 47);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("rea.K(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_7_0 != 0;
        }
    }

    static {
        field_r = "Player Name: ";
    }
}
