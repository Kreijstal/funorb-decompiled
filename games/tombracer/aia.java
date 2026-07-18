/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aia extends vg {
    private int field_i;
    private int field_w;
    private int field_g;
    private int field_u;
    private int field_m;
    static String field_j;
    static String field_v;
    private boolean field_l;
    static int[] field_t;
    private int field_r;
    private int field_s;
    private int field_n;
    private int field_f;
    private int field_h;
    private int field_p;
    private int field_q;
    private int field_k;
    private int field_o;

    final void a(int param0, int param1, int param2, byte param3) {
        ((aia) this).field_i = 0;
        int var5 = -52 % ((param3 - 44) / 36);
        ((aia) this).field_k = 0;
    }

    final int f(int param0) {
        if (param0 != 0) {
            ((aia) this).field_l = true;
        }
        return ((aia) this).field_r;
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, fsa param5, la param6) {
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qea var17 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (((aia) this).field_k > 0) {
              ((aia) this).field_k = ((aia) this).field_k - 1;
              return;
            } else {
              L1: {
                var17 = param6.q(57);
                if (param6.a(-1553494544).f(8, 10915)) {
                  ((aia) this).field_o = 100 - -var17.a(50, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var9 = ((aia) this).a(0) ? 1 : 0;
                int discarded$4 = 21302;
                var10 = this.h() ? 1 : 0;
                if (param4 <= -55) {
                  break L2;
                } else {
                  int discarded$5 = ((aia) this).g(-9);
                  break L2;
                }
              }
              L3: {
                var11 = 0;
                if (var9 != 0) {
                  break L3;
                } else {
                  if (var10 == 0) {
                    if (var17.a(500, 0) == 0) {
                      var11 = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (((aia) this).field_h <= 0) {
                  break L4;
                } else {
                  ((aia) this).field_h = ((aia) this).field_h - 1;
                  if (((aia) this).field_h == 0) {
                    var11 = 1;
                    if (0 >= ((aia) this).field_i) {
                      break L4;
                    } else {
                      ((aia) this).field_o = ((aia) this).field_i;
                      ((aia) this).field_i = 0;
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var11 == 0) {
                  break L5;
                } else {
                  if (((aia) this).field_l) {
                    break L5;
                  } else {
                    L6: {
                      ((aia) this).field_p = 0;
                      ((aia) this).field_s = 0;
                      if (var10 != 0) {
                        break L6;
                      } else {
                        if (var9 == 0) {
                          int discarded$6 = -92;
                          this.a(param6);
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
              L7: {
                if (((aia) this).field_l) {
                  var12 = 65536;
                  ((aia) this).field_s = var12 * ne.field_f[((aia) this).field_f][0];
                  ((aia) this).field_p = var12 * ne.field_f[((aia) this).field_f][1];
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (0 != ((aia) this).field_s) {
                  break L8;
                } else {
                  if (0 == ((aia) this).field_p) {
                    L9: {
                      if (var9 == 0) {
                        var13 = var17.a(8, 0);
                        var12 = var17.a(32768, 0) + 32768;
                        break L9;
                      } else {
                        var12 = 196608;
                        var13 = var17.a(8, 0);
                        break L9;
                      }
                    }
                    L10: {
                      ((aia) this).field_f = var13;
                      ((aia) this).field_s = var12 * ne.field_f[((aia) this).field_f][0];
                      ((aia) this).field_p = ne.field_f[((aia) this).field_f][1] * var12;
                      if (0 < ((aia) this).field_i) {
                        L11: {
                          if (((aia) this).field_s == 0) {
                            break L11;
                          } else {
                            if (lw.a(((aia) this).field_s, (byte) -87) == lw.a(-((aia) this).field_n + ((aia) this).field_u, (byte) -87)) {
                              ((aia) this).field_s = -((aia) this).field_s;
                              ((aia) this).field_f = sw.a(((aia) this).field_f, 6);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        if (((aia) this).field_p == 0) {
                          break L10;
                        } else {
                          if (lw.a(((aia) this).field_p, (byte) -95) == lw.a(((aia) this).field_m + -((aia) this).field_r, (byte) -93)) {
                            ((aia) this).field_p = -((aia) this).field_p;
                            ((aia) this).field_f = ona.b(0, ((aia) this).field_f);
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                    L12: {
                      if (0 == ((aia) this).field_s) {
                        break L12;
                      } else {
                        if (((aia) this).field_p != 0) {
                          ((aia) this).field_s = 180 * (((aia) this).field_s >> 8);
                          ((aia) this).field_p = 180 * (((aia) this).field_p >> 8);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    }
                    ((aia) this).field_h = var17.a(75, 0) + 25;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L13: {
                if (0 < ((aia) this).field_i) {
                  ((aia) this).field_i = ((aia) this).field_i - 1;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var12 = ((aia) this).field_n;
                ((aia) this).field_n = ((aia) this).field_n + ((aia) this).field_s;
                var13 = ((aia) this).field_r;
                ((aia) this).field_r = ((aia) this).field_r + ((aia) this).field_p;
                var14 = (-((aia) this).field_q + param1) / 2;
                if (-var14 > ((aia) this).field_n) {
                  ((aia) this).field_n = -var14;
                  ((aia) this).field_h = 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                var15 = (-((aia) this).field_q + param2) / 2;
                if (var14 >= ((aia) this).field_n) {
                  break L15;
                } else {
                  ((aia) this).field_h = 1;
                  ((aia) this).field_n = var14;
                  break L15;
                }
              }
              L16: {
                if (-var15 > ((aia) this).field_r) {
                  ((aia) this).field_r = -var15;
                  ((aia) this).field_h = 1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (((aia) this).field_r > var15) {
                  ((aia) this).field_h = 1;
                  ((aia) this).field_r = var15;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                L19: {
                  if (var12 != ((aia) this).field_n) {
                    break L19;
                  } else {
                    if (((aia) this).field_r != var13) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                if (param6.a((ffa) null, ((aia) this).field_q, 2, 1, param3 - -((aia) this).field_r, param0 + ((aia) this).field_n, false, (gma) (Object) param5, ((aia) this).field_q)) {
                  ((aia) this).field_o = ((aia) this).field_o + 2;
                  ((aia) this).field_o = et.b(75, ((aia) this).field_o, 125);
                  int discarded$7 = 21302;
                  if (this.h()) {
                    ((aia) this).field_n = (((aia) this).field_n - var12) / 4 + var12;
                    ((aia) this).field_r = var13 + (-var13 + ((aia) this).field_r) / 4;
                    break L18;
                  } else {
                    ((aia) this).field_p = 0;
                    ((aia) this).field_n = var12;
                    ((aia) this).field_r = var13;
                    ((aia) this).field_s = 0;
                    break L18;
                  }
                } else {
                  if (((aia) this).field_o > 0) {
                    ((aia) this).field_o = ((aia) this).field_o - 1;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var8 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var8;
            stackOut_77_1 = new StringBuilder().append("aia.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param5 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L20;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L20;
            }
          }
          L21: {
            stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
            stackOut_80_1 = ((StringBuilder) (Object) stackIn_80_1).append(stackIn_80_2).append(',');
            stackIn_82_0 = stackOut_80_0;
            stackIn_82_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param6 == null) {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L21;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_83_0 = stackOut_81_0;
              stackIn_83_1 = stackOut_81_1;
              stackIn_83_2 = stackOut_81_2;
              break L21;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_83_0, stackIn_83_2 + ')');
        }
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -7;
        }
        return ((aia) this).field_q;
    }

    final void c(int param0) {
        int var2 = -1 / ((param0 - 75) / 51);
        ((aia) this).field_s = -((aia) this).field_s;
        ((aia) this).field_n = -((aia) this).field_n;
        ((aia) this).field_u = -((aia) this).field_u;
        ((aia) this).field_f = sw.a(((aia) this).field_f, 6);
    }

    final void a(int param0, boolean param1, int param2, int param3, hca param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (!param4.q(122)) {
              L1: {
                if (param4.k((byte) -127) <= 0) {
                  ((aia) this).field_w = ((aia) this).field_w + 1;
                  if (((aia) this).field_w <= 20) {
                    break L1;
                  } else {
                    ((aia) this).field_g = 0;
                    break L1;
                  }
                } else {
                  ((aia) this).field_w = 0;
                  ((aia) this).field_g = ((aia) this).field_g + 1;
                  break L1;
                }
              }
              L2: {
                if (param4.g(false) < 196608) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var6_int = stackIn_9_0;
                if (!param1) {
                  break L3;
                } else {
                  L4: {
                    if (15 > ((aia) this).field_g) {
                      stackOut_12_0 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 1;
                      stackIn_13_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                  var7 = stackIn_13_0;
                  if (!this.a(-196609, param4, param2, param3)) {
                    break L3;
                  } else {
                    if (var6_int == 0) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        param4.a(2, (byte) 97, 7);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                ((aia) this).field_l = false;
                if (((aia) this).a(0)) {
                  break L5;
                } else {
                  int discarded$2 = 21302;
                  if (this.h()) {
                    break L5;
                  } else {
                    if (var6_int == 0) {
                      break L5;
                    } else {
                      if (!param1) {
                        break L5;
                      } else {
                        if (0 >= ((aia) this).field_g) {
                          break L5;
                        } else {
                          var7 = param3 - -((aia) this).field_n;
                          var8 = ((aia) this).field_r + param2;
                          var9 = -var7 + param4.d(3);
                          var10 = -var8 + param4.e(9648);
                          ((aia) this).field_f = uqa.a(var9, var10, -111);
                          ((aia) this).field_l = true;
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (param0 > 98) {
                  break L6;
                } else {
                  int discarded$3 = ((aia) this).d(5);
                  break L6;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var6;
            stackOut_27_1 = new StringBuilder().append("aia.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ')');
        }
    }

    final static int e() {
        if (null != baa.field_d.field_i) {
          if ((Object) (Object) kra.field_a == (Object) (Object) baa.field_d.field_i.field_b) {
            return 0;
          } else {
            if ((Object) (Object) nj.field_t != (Object) (Object) baa.field_d.field_i.field_b) {
              if ((Object) (Object) baa.field_d.field_i.field_b != (Object) (Object) paa.field_z) {
                if ((Object) (Object) baa.field_d.field_i.field_b == (Object) (Object) vea.field_c) {
                  return 3;
                } else {
                  if ((Object) (Object) baa.field_d.field_i.field_b != (Object) (Object) laa.field_x) {
                    if ((Object) (Object) daa.field_d == (Object) (Object) baa.field_d.field_i.field_b) {
                      return 5;
                    } else {
                      return -1;
                    }
                  } else {
                    return 4;
                  }
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          kh.a(true, ska.field_r, kva.field_s);
          return 4;
        }
    }

    final int a(byte param0) {
        if (param0 < 32) {
            ((aia) this).field_q = 85;
        }
        return ((aia) this).field_n;
    }

    private final boolean h() {
        return 20 < ((aia) this).field_o;
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        if (!param3) {
            Object var6 = null;
            ((aia) this).a(-51, -111, -16, -86, (byte) -10, (fsa) null, (la) null);
        }
        ((aia) this).field_p = 0;
        if (0 == ((aia) this).field_i) {
            ((aia) this).field_s = 0;
        }
        ((aia) this).field_i = 200;
        ((aia) this).field_k = 0;
        ((aia) this).field_u = param0;
        ((aia) this).field_m = param2;
    }

    public static void i() {
        field_v = null;
        field_t = null;
        int var1 = 0;
        field_j = null;
    }

    final int d(int param0) {
        if (param0 != 2) {
            ((aia) this).field_u = 118;
        }
        return ((aia) this).field_f;
    }

    final static int a(byte[] param0, int param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
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
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var4_int = -1;
            var5 = param3;
            L1: while (true) {
              if (param1 <= var5) {
                var5 = -75 % ((param2 - -33) / 55);
                var4_int = ~var4_int;
                stackOut_4_0 = var4_int;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var4_int = coa.field_q[(var4_int ^ param0[var5]) & 255] ^ var4_int >>> 8;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("aia.N(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final boolean a(int param0, hca param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = io.a(param1.c(-28) / 2, ((aia) this).field_r + param2, (byte) -63, param1.a((byte) 55) / 2, ((aia) this).field_n + param3, param1.e(9648), ((aia) this).field_q / 2, ((aia) this).field_q / 2, param1.d(3));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("aia.Q(").append(-196609).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    private final void a(la param0) {
        try {
            ((aia) this).field_k = 50 - -param0.q(-120).a(50, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "aia.C(" + (param0 != null ? "{...}" : "null") + ',' + -92 + ')');
        }
    }

    final boolean a(int param0) {
        if (param0 != 0) {
            int discarded$0 = ((aia) this).g(-80);
        }
        return 0 < ((aia) this).field_i ? true : false;
    }

    final boolean b(int param0) {
        if (param0 != 180) {
            Object var3 = null;
            ((aia) this).a(79, false, 55, 0, (hca) null);
        }
        return 0 < ((aia) this).field_k ? true : false;
    }

    aia(int param0, int param1, int param2) {
        ((aia) this).field_n = param0;
        ((aia) this).field_q = param2;
        ((aia) this).field_r = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[16384];
        field_v = "You are not currently logged in to the<nbsp>game.";
    }
}
