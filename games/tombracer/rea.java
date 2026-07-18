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
            ((rea) this).field_t = null;
            if (-5 != ((rea) this).field_n) {
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
            if (-5 != ((rea) this).field_n) {
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
        return ((rea) this).field_n == 1 ? true : false;
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
            ((rea) this).field_o = 10;
            if (((rea) this).field_n != 2) {
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
            if (((rea) this).field_n != 2) {
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
              if (4 > ((rea) this).b(true).field_E) {
                param1.h(3, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              param1.b((byte) -62, 8);
              if (0 != ((rea) this).field_q) {
                break L2;
              } else {
                param1.b((byte) 17, true);
                ((rea) this).field_q = param1.b(73);
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
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("rea.Q(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) 116, ((rea) this).field_v, 8);
            param1.a((byte) -128, ((rea) this).field_o, 8);
            param1.a((byte) 107, ((rea) this).field_s, 8);
            param1.a((byte) -20, ((rea) this).field_x, 8);
            param1.a((byte) -126, ((rea) this).field_u ? 1 : 0, 1);
            param1.a((byte) -23, ((rea) this).field_p ? 1 : 0, 1);
            ((rea) this).field_t.a(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    rea(la param0, boolean param1) {
        super(param0, param1);
        ((rea) this).field_u = false;
        ((rea) this).field_p = false;
        try {
            ((rea) this).field_s = 25;
            ((rea) this).field_x = 50;
            ((rea) this).field_v = 50;
            ((rea) this).field_o = 25;
            ((rea) this).field_t = new up(0, 100);
            ((rea) this).field_t.b(1, 4);
            this.k((byte) -106);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void k(byte param0) {
        int var2 = 0;
        if (0 < ((rea) this).field_s) {
          L0: {
            if (0 >= ((rea) this).field_v) {
              ((rea) this).field_v = 1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (((rea) this).field_o <= 0) {
              ((rea) this).field_o = 1;
              break L1;
            } else {
              break L1;
            }
          }
          if (((rea) this).field_x <= 0) {
            ((rea) this).field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        } else {
          L2: {
            ((rea) this).field_s = 1;
            if (0 >= ((rea) this).field_v) {
              ((rea) this).field_v = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (((rea) this).field_o <= 0) {
              ((rea) this).field_o = 1;
              break L3;
            } else {
              break L3;
            }
          }
          if (((rea) this).field_x > 0) {
            var2 = 7 % ((-26 - param0) / 56);
            return;
          } else {
            ((rea) this).field_x = 1;
            var2 = 7 % ((-26 - param0) / 56);
            return;
          }
        }
    }

    final int j(byte param0) {
        if (param0 != 90) {
            field_r = null;
            return ((rea) this).field_o;
        }
        return ((rea) this).field_o;
    }

    final void b(byte param0, boolean param1) {
        ((rea) this).field_u = param1 ? true : false;
        if (param0 <= 64) {
            ((rea) this).field_q = -123;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            ((rea) this).a(109, 0, 65, 72, 73);
            return 2;
        }
        return 2;
    }

    final boolean s(int param0) {
        int var2 = -108 % ((param0 - -19) / 49);
        return ((rea) this).field_n == 3 ? true : false;
    }

    rea(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        ((rea) this).field_u = false;
        ((rea) this).field_p = false;
        try {
          L0: {
            L1: {
              if (param0.field_E >= 3) {
                L2: {
                  ((rea) this).field_v = param1.b((byte) 44, 8);
                  ((rea) this).field_o = param1.b((byte) 44, 8);
                  if (param0.field_E < 20) {
                    break L2;
                  } else {
                    ((rea) this).field_s = param1.b((byte) 44, 8);
                    break L2;
                  }
                }
                L3: {
                  ((rea) this).field_x = param1.b((byte) 44, 8);
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (param1.b((byte) 44, 1) != 1) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((rea) this).field_u = stackIn_8_1 != 0;
                if (param0.field_E < 20) {
                  break L1;
                } else {
                  L4: {
                    stackOut_9_0 = this;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (param1.b((byte) 44, 1) != 1) {
                      stackOut_11_0 = this;
                      stackOut_11_1 = 0;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L4;
                    } else {
                      stackOut_10_0 = this;
                      stackOut_10_1 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L4;
                    }
                  }
                  ((rea) this).field_p = stackIn_12_1 != 0;
                  break L1;
                }
              } else {
                ((rea) this).field_o = 25;
                ((rea) this).field_u = false;
                ((rea) this).field_v = 50;
                ((rea) this).field_x = 50;
                break L1;
              }
            }
            L5: {
              if (16 <= param0.field_E) {
                ((rea) this).field_t = ad.a((byte) 87, param1);
                break L5;
              } else {
                ((rea) this).field_t = new up(0, 100);
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
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("rea.<init>(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ')');
        }
    }

    final boolean p(byte param0) {
        if (param0 != 120) {
            return true;
        }
        return true;
    }

    final void k(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        la var6 = null;
        int var7 = 0;
        hca var8 = null;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var8 = ((rea) this).field_g.H(param0 + -5537);
          var3 = ((rea) this).field_p ? 1 : 0;
          var4 = ((rea) this).field_g.d(3);
          var5 = ((rea) this).field_g.e(param0 + 4230);
          if (var3 == 0) {
            if (((rea) this).field_n != 0) {
              if (1 != ((rea) this).field_n) {
                break L0;
              } else {
                var3 = ck.a(var8.d(3), 1, var4, ((rea) this).field_g.c(param0 + -5496), ((rea) this).field_g.a((byte) 55), var8.e(9648), (byte) 82, var5, 1) ? 1 : 0;
                break L0;
              }
            } else {
              var3 = ck.a(var8.d(3), var8.a((byte) 55), var4, ((rea) this).field_g.c(-23), ((rea) this).field_g.a((byte) 55), var8.e(9648), (byte) 69, var5, var8.c(param0 + -5519)) ? 1 : 0;
              break L0;
            }
          } else {
            break L0;
          }
        }
        var6_int = ((rea) this).field_n;
        if (var6_int != 0) {
          L1: {
            if (var6_int != 1) {
              if (2 == var6_int) {
                ((rea) this).field_w = ((rea) this).field_w + 1;
                if (((rea) this).field_w <= ((rea) this).field_o) {
                  break L1;
                } else {
                  var6 = ((rea) this).b(true);
                  int discarded$1 = var6.a(123, var5, ((rea) this).field_t, ((rea) this).field_g.a((byte) 55), ((rea) this).field_g.c(-79), var4);
                  this.b(0, 3);
                  ((rea) this).field_g.a((byte) -3, ((rea) this).field_q);
                  ((rea) this).field_g.b((byte) 17, false);
                  if (param0 == 5418) {
                    return;
                  } else {
                    ((rea) this).field_v = -69;
                    return;
                  }
                }
              } else {
                if (3 != var6_int) {
                  if (var6_int == 4) {
                    ((rea) this).field_w = ((rea) this).field_w + 1;
                    if (((rea) this).field_w > ((rea) this).field_x) {
                      this.b(param0 + -5418, 1);
                      ((rea) this).field_g.L(127);
                      break L1;
                    } else {
                      if (param0 == 5418) {
                        return;
                      } else {
                        ((rea) this).field_v = -69;
                        return;
                      }
                    }
                  } else {
                    break L1;
                  }
                } else {
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_s >= ((rea) this).field_w) {
                    break L1;
                  } else {
                    this.b(param0 + -5418, 4);
                    ((rea) this).field_g.a((byte) -3, 0);
                    ((rea) this).field_g.b((byte) 17, true);
                    if (param0 == 5418) {
                      return;
                    } else {
                      ((rea) this).field_v = -69;
                      return;
                    }
                  }
                }
              }
            } else {
              if (var3 == 0) {
                this.b(0, 0);
                if (!((rea) this).field_u) {
                  break L1;
                } else {
                  ((rea) this).field_g.L(-31);
                  if (param0 != 5418) {
                    ((rea) this).field_v = -69;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((rea) this).field_n = 1;
                if (((rea) this).field_u) {
                  ((rea) this).field_g.G(121);
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_v < ((rea) this).field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!((rea) this).field_u) {
                      ((rea) this).field_g.G(121);
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 5418) {
                      ((rea) this).field_v = -69;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  ((rea) this).field_w = ((rea) this).field_w + 1;
                  if (((rea) this).field_v < ((rea) this).field_w) {
                    this.b(param0 ^ 5418, 2);
                    if (!((rea) this).field_u) {
                      ((rea) this).field_g.G(121);
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (param0 != 5418) {
                        ((rea) this).field_v = -69;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 != 5418) {
                      ((rea) this).field_v = -69;
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
            ((rea) this).field_v = -69;
            return;
          }
        } else {
          L2: {
            if (var3 == 0) {
              this.b(0, 0);
              if (!((rea) this).field_u) {
                break L2;
              } else {
                L3: {
                  ((rea) this).field_g.L(-31);
                  if (param0 == 5418) {
                    break L3;
                  } else {
                    ((rea) this).field_v = -69;
                    break L3;
                  }
                }
                return;
              }
            } else {
              L4: {
                ((rea) this).field_n = 1;
                if (!((rea) this).field_u) {
                  break L4;
                } else {
                  ((rea) this).field_g.G(121);
                  break L4;
                }
              }
              ((rea) this).field_w = ((rea) this).field_w + 1;
              if (((rea) this).field_v < ((rea) this).field_w) {
                this.b(param0 ^ 5418, 2);
                if (!((rea) this).field_u) {
                  L5: {
                    ((rea) this).field_g.G(121);
                    if (param0 == 5418) {
                      break L5;
                    } else {
                      ((rea) this).field_v = -69;
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
            ((rea) this).field_v = -69;
            return;
          } else {
            return;
          }
        }
    }

    final static hja[] a(cn param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (jna.a(false, param2, param1, param0)) {
            return uj.a(0);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("rea.FA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + 42 + ')');
        }
    }

    public static void b(int param0) {
        field_r = null;
    }

    private final void b(int param0, int param1) {
        ((rea) this).field_n = param1;
        ((rea) this).field_w = param0;
    }

    final int a(int param0, int param1) {
        param0 = fs.a((byte) 49, param0, ((rea) this).field_n);
        if (param1 >= -48) {
            return -52;
        }
        return param0;
    }

    final int d(boolean param0) {
        if (param0) {
            int discarded$0 = ((rea) this).g((byte) -41);
            return ((rea) this).field_x;
        }
        return ((rea) this).field_x;
    }

    final int g(byte param0) {
        if (param0 > -36) {
            field_r = null;
            return ((rea) this).field_w;
        }
        return ((rea) this).field_w;
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
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
          boolean discarded$11 = rea.a(-44, -75, 109, 115, -67, true, -126);
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
                int discarded$2 = ((rea) this).g((byte) 48);
                break L1;
              }
            }
            L2: {
              if (((rea) this).field_n != 3) {
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
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("rea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param6 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((rea) this).field_o = param1;
        if (param2 != 1) {
          ((rea) this).field_q = -90;
          ((rea) this).field_v = param4;
          ((rea) this).field_x = param3;
          ((rea) this).field_s = param0;
          return;
        } else {
          ((rea) this).field_v = param4;
          ((rea) this).field_x = param3;
          ((rea) this).field_s = param0;
          return;
        }
    }

    final boolean a(int param0, int param1, pc param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
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
            if (3 != ((rea) this).field_n) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param1 == 1) {
                  break L1;
                } else {
                  var6 = null;
                  boolean discarded$2 = ((rea) this).a(-121, -9, (pc) null, -81);
                  break L1;
                }
              }
              param2.a(param3, (byte) 47);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("rea.K(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Player Name: ";
    }
}
