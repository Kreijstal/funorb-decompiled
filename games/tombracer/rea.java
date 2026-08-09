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
        if (param0 != -5) {
          L0: {
            this.field_t = (up) null;
            if (-5 != (this.field_n ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-5 != (this.field_n ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        if (param0 > -31) {
          L0: {
            this.field_o = 10;
            if (this.field_n != 2) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_n != 2) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(boolean param0, fsa param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("rea.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        int var2;
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
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = false;
        this.field_p = false;
        try {
          L0: {
            L1: {
              if (-4 >= (param0.field_E ^ -1)) {
                L2: {
                  this.field_v = param1.b((byte) 44, 8);
                  this.field_o = param1.b((byte) 44, 8);
                  if ((param0.field_E ^ -1) > -21) {
                    break L2;
                  } else {
                    this.field_s = param1.b((byte) 44, 8);
                    break L2;
                  }
                }
                L3: {
                  this.field_x = param1.b((byte) 44, 8);
                  stackIn_7_0 = this;

                  if (-2 != (param1.b((byte) 44, 1) ^ -1)) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  }
                }
                ((rea) (this)).field_u = stackIn_8_1 != 0;
                if (param0.field_E < 20) {
                  break L1;
                } else {
                  L4: {
                    stackIn_11_0 = this;

                    if ((param1.b((byte) 44, 1) ^ -1) != -2) {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 0;
                      break L4;
                    } else {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 1;
                      break L4;
                    }
                  }
                  ((rea) (this)).field_p = stackIn_12_1 != 0;
                  break L1;
                }
              } else {
                this.field_o = 25;
                this.field_u = false;
                this.field_v = 50;
                this.field_x = 50;
                break L1;
              }
            }
            L5: {
              if (16 <= param0.field_E) {
                this.field_t = ad.a((byte) 87, param1);
                break L5;
              } else {
                this.field_t = new up(0, 100);
                break L5;
              }
            }
            this.k((byte) -101);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("rea.<init>(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            return true;
        }
        return true;
    }

    final void k(int param0) {
        int var3;
        int var4;
        int var5;
        int var6_int;
        la var6;
        int var7;
        hca var8;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = this.field_g.H(param0 + -5537);
          var3 = this.field_p ? 1 : 0;
          var4 = this.field_g.d(3);
          var5 = this.field_g.e(param0 + 4230);
          if (var3 == 0) {
            if (-1 != (this.field_n ^ -1)) {
              if (1 != this.field_n) {
                break L0;
              } else {
                var3 = ck.a(var8.d(3), 1, var4, this.field_g.c(param0 + -5496), this.field_g.a((byte) 55), var8.e(9648), (byte) 82, var5, 1) ? 1 : 0;
                break L0;
              }
            } else {
              var3 = ck.a(var8.d(3), var8.a((byte) 55), var4, this.field_g.c(-23), this.field_g.a((byte) 55), var8.e(9648), (byte) 69, var5, var8.c(param0 + -5519)) ? 1 : 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var6_int = this.field_n;
        if (-1 != (var6_int ^ -1)) {
          L1: {
            if (var6_int != 1) {
              if (2 == var6_int) {
                this.field_w = this.field_w + 1;
                if (this.field_w <= this.field_o) {
                  break L1;
                } else {
                  var6 = this.b(true);
                  var6.a(123, var5, this.field_t, this.field_g.a((byte) 55), this.field_g.c(-79), var4);
                  this.b(0, 3);
                  this.field_g.a((byte) -3, this.field_q);
                  this.field_g.b((byte) 17, false);
                  if (param0 == 5418) {
                    return;
                  } else {
                    this.field_v = -69;
                    return;
                  }
                }
              } else {
                if (3 != var6_int) {
                  if ((var6_int ^ -1) == -5) {
                    this.field_w = this.field_w + 1;
                    if (this.field_w > this.field_x) {
                      this.b(param0 + -5418, 1);
                      this.field_g.L(127);
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        this.field_v = -69;
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  this.field_w = this.field_w + 1;
                  if (this.field_s >= this.field_w) {
                    break L1;
                  } else {
                    this.b(param0 + -5418, 4);
                    this.field_g.a((byte) -3, 0);
                    this.field_g.b((byte) 17, true);
                    if (param0 == 5418) {
                      return;
                    } else {
                      this.field_v = -69;
                      return;
                    }
                  }
                }
              }
            } else {
              if (var3 == 0) {
                this.b(0, 0);
                if (!this.field_u) {
                  break L1;
                } else {
                  this.field_g.L(-31);
                  if (param0 != 5418) {
                    this.field_v = -69;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_n = 1;
                if (this.field_u) {
                  this.field_g.G(121);
                  this.field_w = this.field_w + 1;
                  if (this.field_v < this.field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!this.field_u) {
                      this.field_g.G(121);
                      if (param0 != 5418) {
                        this.field_v = -69;
                        return;
                      } else {
                        return;
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
                    if (param0 != 5418) {
                      this.field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  this.field_w = this.field_w + 1;
                  if (this.field_v < this.field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!this.field_u) {
                      this.field_g.G(121);
                      if (param0 != 5418) {
                        this.field_v = -69;
                        return;
                      } else {
                        return;
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
                    if (param0 != 5418) {
                      this.field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
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
          L2: {
            if (var3 == 0) {
              this.b(0, 0);
              if (!this.field_u) {
                break L2;
              } else {
                L3: {
                  this.field_g.L(-31);
                  if (param0 == 5418) {
                    break L3;
                  } else {
                    this.field_v = -69;
                    break L3;
                  }
                }
                return;
              }
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
                  L5: {
                    this.field_g.G(121);
                    if (param0 == 5418) {
                      break L5;
                    } else {
                      this.field_v = -69;
                      break L5;
                    }
                  }
                  return;
                } else {
                  break L2;
                }
              } else {
                break L2;
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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = uj.a(0);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("rea.FA(");

            if (param0 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    public static void b(int param0) {
        field_r = null;
        if (param0 != 12134) {
            rea.a(85, 105, 55, -55, 43, true, 103);
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
        if (param0) {
            this.g((byte) -41);
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
        int stackIn_18_0 = 0;
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
                      stackIn_18_0 = 1;
                      break L0;
                    }
                  }
                }
                stackIn_18_0 = 0;
                break L0;
              }
              return stackIn_18_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          rea.a(-44, -75, 109, 115, -67, true, -126);
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
        RuntimeException var8 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                this.g((byte) 48);
                break L1;
              }
            }
            L2: {
              if ((this.field_n ^ -1) != -4) {
                stackIn_5_0 = 0;
                break L2;
              } else {
                stackIn_5_0 = 1;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("rea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
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
        RuntimeException var5 = null;
        pc var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (3 != this.field_n) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  var6 = (pc) null;
                  this.a(-121, -9, (pc) null, -81);
                  break L1;
                }
              }
              param2.a(param3, (byte) 47);
              stackIn_7_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("rea.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
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
