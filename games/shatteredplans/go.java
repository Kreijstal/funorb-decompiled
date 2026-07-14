/*
 * Decompiled by CFR-JS 0.4.0.
 */
class go extends kg {
    private int field_H;
    private int field_R;
    private int field_N;
    static os field_E;
    static String field_K;
    static boolean field_D;
    static String field_G;
    private long field_F;
    static qr field_I;
    static bi field_L;
    private boolean field_P;
    private int field_O;
    private long field_Q;
    private boolean field_M;

    private final void k(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (((go) this).field_H != ((go) this).field_N) {
            var2 = ((go) this).field_N < ((go) this).field_H ? ((go) this).field_N : ((go) this).field_H;
            var3 = ((go) this).field_H > ((go) this).field_N ? ((go) this).field_H : ((go) this).field_N;
            ((go) this).field_N = var2;
            ((go) this).field_H = var2;
            ((go) this).field_s = ((go) this).field_s.substring(0, var2) + ((go) this).field_s.substring(var3, ((go) this).field_s.length());
            ((go) this).i(5018);
        }
        var2 = 75 % ((-61 - param0) / 54);
    }

    private final void h(byte param0) {
        if (param0 > -33) {
          field_E = null;
          this.h(-1);
          this.k((byte) 120);
          return;
        } else {
          this.h(-1);
          this.k((byte) 120);
          return;
        }
    }

    private final void a(byte param0, String param1) {
        int var3 = 0;
        L0: {
          if (((go) this).field_O == -1) {
            break L0;
          } else {
            var3 = ((go) this).field_O + -((go) this).field_s.length();
            if (0 <= var3) {
              return;
            } else {
              param1 = param1.substring(0, var3);
              break L0;
            }
          }
        }
        if (((go) this).field_H == ((go) this).field_s.length()) {
          ((go) this).field_s = ((go) this).field_s + param1;
          ((go) this).field_H = ((go) this).field_H + param1.length();
          if (param0 > -88) {
            return;
          } else {
            ((go) this).field_N = ((go) this).field_H;
            ((go) this).i(5018);
            return;
          }
        } else {
          ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
          ((go) this).field_H = ((go) this).field_H + param1.length();
          if (param0 > -88) {
            return;
          } else {
            ((go) this).field_N = ((go) this).field_H;
            ((go) this).i(5018);
            return;
          }
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            return;
        }
        ((go) this).field_N = 0;
        ((go) this).field_H = 0;
        ((go) this).field_s = "";
        ((go) this).i(5018);
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, int param5, vg param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        if (!super.a(param0, param1, (byte) 100, param3, param4, param5, param6)) {
          if (param2 <= 95) {
            field_L = null;
            return false;
          } else {
            return false;
          }
        } else {
          if (((go) this).field_p instanceof pj) {
            L0: {
              var8_int = ((pj) (Object) ((go) this).field_p).a(param4, pd.field_k, param5, (vg) this, true, bb.field_b);
              stackOut_6_0 = this;
              stackOut_6_1 = 119;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (0 == (var8_int ^ -1)) {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                break L0;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = stackIn_7_1;
                stackOut_7_2 = var8_int;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_9_2 = stackOut_7_2;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_9_1, stackIn_9_2);
              var8 = pr.a(14274);
              stackOut_9_0 = this;
              stackIn_11_0 = stackOut_9_0;
              stackIn_10_0 = stackOut_9_0;
              if (-251L >= (-((go) this).field_F + var8 ^ -1L)) {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                break L1;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                break L1;
              }
            }
            ((go) this).field_P = stackIn_12_1 != 0;
            if (((go) this).field_P) {
              ((go) this).field_N = this.g((byte) 96);
              ((go) this).field_H = this.a(-1);
              if (-1 > (((go) this).field_H ^ -1)) {
                if (((go) this).field_s.charAt(-1 + ((go) this).field_H) != 32) {
                  ((go) this).field_R = ((go) this).field_H;
                  ((go) this).field_F = var8;
                  return true;
                } else {
                  ((go) this).field_H = ((go) this).field_H - 1;
                  ((go) this).field_R = ((go) this).field_H;
                  ((go) this).field_F = var8;
                  return true;
                }
              } else {
                ((go) this).field_R = ((go) this).field_H;
                ((go) this).field_F = var8;
                return true;
              }
            } else {
              ((go) this).field_F = var8;
              return true;
            }
          } else {
            if (param2 > 95) {
              return false;
            } else {
              field_L = null;
              return false;
            }
          }
        }
    }

    private final void j(byte param0) {
        qo var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        pj var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!((go) this).field_M) {
          ((go) this).field_l = 0;
          ((go) this).field_h = 0;
          return;
        } else {
          if (((go) this).field_p instanceof pj) {
            var9 = (pj) (Object) ((go) this).field_p;
            var3 = var9.a((vg) this, true);
            var4 = var3.c(126);
            if (param0 == -59) {
              var5 = var9.a(120, (vg) this);
              var6 = var9.a(false) >> 203183073;
              if (var4 >= -var6 + var5) {
                var7 = ((go) this).field_h - -var3.a(true, ((go) this).field_H);
                if (-var6 + var5 < var7) {
                  ((go) this).field_h = ((go) this).field_h - var6 + (var5 - var7);
                  if (-1 <= (((go) this).field_h ^ -1)) {
                    if (((go) this).field_h >= -var5 + var6) {
                      return;
                    } else {
                      ((go) this).field_h = -var5 + var6;
                      return;
                    }
                  } else {
                    ((go) this).field_h = 0;
                    return;
                  }
                } else {
                  if (var6 > var7) {
                    ((go) this).field_h = -var7 - -var6 + ((go) this).field_h;
                    if (-1 <= (((go) this).field_h ^ -1)) {
                      if (((go) this).field_h >= -var5 + var6) {
                        return;
                      } else {
                        ((go) this).field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      ((go) this).field_h = 0;
                      return;
                    }
                  } else {
                    if (-1 <= (((go) this).field_h ^ -1)) {
                      if (((go) this).field_h >= -var5 + var6) {
                        return;
                      } else {
                        ((go) this).field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      ((go) this).field_h = 0;
                      return;
                    }
                  }
                }
              } else {
                ((go) this).field_l = 0;
                ((go) this).field_h = 0;
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

    final void a(int param0, int param1, int param2, int param3) {
        pj var5 = null;
        long var6 = 0L;
        if (param1 == -11857) {
          if (((go) this).field_p != null) {
            if (param0 == 0) {
              ((go) this).field_p.a((vg) this, param3, ((go) this).field_y, param2, (byte) 12);
              if (((go) this).field_p instanceof pj) {
                L0: {
                  var5 = (pj) (Object) ((go) this).field_p;
                  if (((go) this).field_H != ((go) this).field_N) {
                    var5.a(((go) this).field_N, param2, param3, ((go) this).field_H, 0, (vg) this);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                var6 = pr.a(param1 + 26131);
                if ((var6 - ((go) this).field_Q) % 1000L >= 500L) {
                  return;
                } else {
                  var5.a(((go) this).field_H, param3, -127, param2, (vg) this);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1) {
        if (param0 < 64) {
            return;
        }
        ((go) this).field_H = param1;
        if (di.field_p[81]) {
            return;
        }
        ((go) this).field_N = ((go) this).field_H;
    }

    final boolean a(int param0, char param1, int param2, vg param3) {
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        Object stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        Object stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        Object stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        Object stackIn_180_0 = null;
        int stackIn_180_1 = 0;
        Object stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        Object stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_182_2 = 0;
        Object stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        Object stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        Object stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        Object stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        Object stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        Object stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        Object stackOut_179_0 = null;
        int stackOut_179_1 = 0;
        Object stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        int stackOut_181_2 = 0;
        Object stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_180_2 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        if (param2 == 13) {
          L0: {
            ((go) this).field_Q = pr.a(param2 ^ 14287);
            if (param1 == 60) {
              break L0;
            } else {
              if (62 == param1) {
                break L0;
              } else {
                if (param1 < 32) {
                  if (85 != param0) {
                    if (param0 == 101) {
                      if (((go) this).field_N != ((go) this).field_H) {
                        this.k((byte) -117);
                        return true;
                      } else {
                        if (((go) this).field_H < ((go) this).field_s.length()) {
                          ((go) this).field_N = 1 + ((go) this).field_H;
                          this.k((byte) -117);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      if (13 != param0) {
                        if (param0 == 96) {
                          if (-1 > (((go) this).field_H ^ -1)) {
                            L1: {
                              stackOut_185_0 = this;
                              stackOut_185_1 = 127;
                              stackIn_187_0 = stackOut_185_0;
                              stackIn_187_1 = stackOut_185_1;
                              stackIn_186_0 = stackOut_185_0;
                              stackIn_186_1 = stackOut_185_1;
                              if (di.field_p[82]) {
                                stackOut_187_0 = this;
                                stackOut_187_1 = stackIn_187_1;
                                stackOut_187_2 = this.g((byte) 88);
                                stackIn_188_0 = stackOut_187_0;
                                stackIn_188_1 = stackOut_187_1;
                                stackIn_188_2 = stackOut_187_2;
                                break L1;
                              } else {
                                stackOut_186_0 = this;
                                stackOut_186_1 = stackIn_186_1;
                                stackOut_186_2 = -1 + ((go) this).field_H;
                                stackIn_188_0 = stackOut_186_0;
                                stackIn_188_1 = stackOut_186_1;
                                stackIn_188_2 = stackOut_186_2;
                                break L1;
                              }
                            }
                            this.a(stackIn_188_1, stackIn_188_2);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          if (-98 == (param0 ^ -1)) {
                            if (((go) this).field_H < ((go) this).field_s.length()) {
                              L2: {
                                stackOut_179_0 = this;
                                stackOut_179_1 = 88;
                                stackIn_181_0 = stackOut_179_0;
                                stackIn_181_1 = stackOut_179_1;
                                stackIn_180_0 = stackOut_179_0;
                                stackIn_180_1 = stackOut_179_1;
                                if (!di.field_p[82]) {
                                  stackOut_181_0 = this;
                                  stackOut_181_1 = stackIn_181_1;
                                  stackOut_181_2 = 1 + ((go) this).field_H;
                                  stackIn_182_0 = stackOut_181_0;
                                  stackIn_182_1 = stackOut_181_1;
                                  stackIn_182_2 = stackOut_181_2;
                                  break L2;
                                } else {
                                  stackOut_180_0 = this;
                                  stackOut_180_1 = stackIn_180_1;
                                  stackOut_180_2 = this.a(-1);
                                  stackIn_182_0 = stackOut_180_0;
                                  stackIn_182_1 = stackOut_180_1;
                                  stackIn_182_2 = stackOut_180_2;
                                  break L2;
                                }
                              }
                              this.a(stackIn_182_1, stackIn_182_2);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (102 != param0) {
                              if ((param0 ^ -1) != -104) {
                                if (param0 != -85) {
                                  if (di.field_p[82]) {
                                    if (param0 == -66) {
                                      this.h((byte) -95);
                                      return true;
                                    } else {
                                      if (!di.field_p[82]) {
                                        L3: {
                                          if (!di.field_p[82]) {
                                            break L3;
                                          } else {
                                            if (67 == param0) {
                                              this.m((byte) -7);
                                              return true;
                                            } else {
                                              break L3;
                                            }
                                          }
                                        }
                                        return false;
                                      } else {
                                        if (-67 == param0) {
                                          this.h(param2 + -14);
                                          return true;
                                        } else {
                                          L4: {
                                            if (!di.field_p[82]) {
                                              break L4;
                                            } else {
                                              if (67 == param0) {
                                                this.m((byte) -7);
                                                return true;
                                              } else {
                                                break L4;
                                              }
                                            }
                                          }
                                          return false;
                                        }
                                      }
                                    }
                                  } else {
                                    if (!di.field_p[82]) {
                                      L5: {
                                        if (!di.field_p[82]) {
                                          break L5;
                                        } else {
                                          if (67 == param0) {
                                            this.m((byte) -7);
                                            return true;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                      return false;
                                    } else {
                                      if (-67 != param0) {
                                        if (di.field_p[82]) {
                                          if (67 == param0) {
                                            this.m((byte) -7);
                                            return true;
                                          } else {
                                            return false;
                                          }
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        this.h(param2 + -14);
                                        return true;
                                      }
                                    }
                                  }
                                } else {
                                  this.i((byte) 2);
                                  return true;
                                }
                              } else {
                                this.a(88, ((go) this).field_s.length());
                                return true;
                              }
                            } else {
                              this.a(97, 0);
                              return true;
                            }
                          }
                        }
                      } else {
                        ((go) this).e(true);
                        return true;
                      }
                    }
                  } else {
                    if (((go) this).field_N == ((go) this).field_H) {
                      if (-1 > (((go) this).field_H ^ -1)) {
                        ((go) this).field_N = -1 + ((go) this).field_H;
                        this.k((byte) -120);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.k((byte) 22);
                      return true;
                    }
                  }
                } else {
                  if (param1 <= 126) {
                    if (((go) this).field_H == ((go) this).field_N) {
                      if (((go) this).field_O == -1) {
                        if (((go) this).field_H < ((go) this).field_s.length()) {
                          ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
                          ((go) this).field_H = ((go) this).field_H + 1;
                          ((go) this).field_N = ((go) this).field_H;
                          ((go) this).i(5018);
                          return true;
                        } else {
                          ((go) this).field_s = ((go) this).field_s + param1;
                          ((go) this).field_H = ((go) this).field_s.length();
                          ((go) this).field_N = ((go) this).field_s.length();
                          ((go) this).i(5018);
                          return true;
                        }
                      } else {
                        if (((go) this).field_s.length() >= ((go) this).field_O) {
                          return true;
                        } else {
                          if (((go) this).field_H < ((go) this).field_s.length()) {
                            ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
                            ((go) this).field_H = ((go) this).field_H + 1;
                            ((go) this).field_N = ((go) this).field_H;
                            ((go) this).i(5018);
                            return true;
                          } else {
                            ((go) this).field_s = ((go) this).field_s + param1;
                            ((go) this).field_H = ((go) this).field_s.length();
                            ((go) this).field_N = ((go) this).field_s.length();
                            ((go) this).i(5018);
                            return true;
                          }
                        }
                      }
                    } else {
                      this.k((byte) -116);
                      if (((go) this).field_O != -1) {
                        if (((go) this).field_s.length() >= ((go) this).field_O) {
                          return true;
                        } else {
                          if (((go) this).field_H < ((go) this).field_s.length()) {
                            ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
                            ((go) this).field_H = ((go) this).field_H + 1;
                            ((go) this).field_N = ((go) this).field_H;
                            ((go) this).i(5018);
                            return true;
                          } else {
                            ((go) this).field_s = ((go) this).field_s + param1;
                            ((go) this).field_H = ((go) this).field_s.length();
                            ((go) this).field_N = ((go) this).field_s.length();
                            ((go) this).i(5018);
                            return true;
                          }
                        }
                      } else {
                        L6: {
                          if (((go) this).field_H < ((go) this).field_s.length()) {
                            ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
                            ((go) this).field_H = ((go) this).field_H + 1;
                            ((go) this).field_N = ((go) this).field_H;
                            ((go) this).i(5018);
                            break L6;
                          } else {
                            ((go) this).field_s = ((go) this).field_s + param1;
                            ((go) this).field_H = ((go) this).field_s.length();
                            ((go) this).field_N = ((go) this).field_s.length();
                            ((go) this).i(5018);
                            break L6;
                          }
                        }
                        return true;
                      }
                    }
                  } else {
                    L7: {
                      if (85 != param0) {
                        if (param0 == 101) {
                          if (((go) this).field_N == ((go) this).field_H) {
                            if (((go) this).field_H < ((go) this).field_s.length()) {
                              ((go) this).field_N = 1 + ((go) this).field_H;
                              this.k((byte) -117);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            this.k((byte) -117);
                            return true;
                          }
                        } else {
                          if (13 != param0) {
                            if (param0 == 96) {
                              if (-1 > (((go) this).field_H ^ -1)) {
                                L8: {
                                  stackOut_115_0 = this;
                                  stackOut_115_1 = 127;
                                  stackIn_117_0 = stackOut_115_0;
                                  stackIn_117_1 = stackOut_115_1;
                                  stackIn_116_0 = stackOut_115_0;
                                  stackIn_116_1 = stackOut_115_1;
                                  if (di.field_p[82]) {
                                    stackOut_117_0 = this;
                                    stackOut_117_1 = stackIn_117_1;
                                    stackOut_117_2 = this.g((byte) 88);
                                    stackIn_118_0 = stackOut_117_0;
                                    stackIn_118_1 = stackOut_117_1;
                                    stackIn_118_2 = stackOut_117_2;
                                    break L8;
                                  } else {
                                    stackOut_116_0 = this;
                                    stackOut_116_1 = stackIn_116_1;
                                    stackOut_116_2 = -1 + ((go) this).field_H;
                                    stackIn_118_0 = stackOut_116_0;
                                    stackIn_118_1 = stackOut_116_1;
                                    stackIn_118_2 = stackOut_116_2;
                                    break L8;
                                  }
                                }
                                this.a(stackIn_118_1, stackIn_118_2);
                                return true;
                              } else {
                                break L7;
                              }
                            } else {
                              if (-98 == (param0 ^ -1)) {
                                if (((go) this).field_H < ((go) this).field_s.length()) {
                                  L9: {
                                    stackOut_109_0 = this;
                                    stackOut_109_1 = 88;
                                    stackIn_111_0 = stackOut_109_0;
                                    stackIn_111_1 = stackOut_109_1;
                                    stackIn_110_0 = stackOut_109_0;
                                    stackIn_110_1 = stackOut_109_1;
                                    if (!di.field_p[82]) {
                                      stackOut_111_0 = this;
                                      stackOut_111_1 = stackIn_111_1;
                                      stackOut_111_2 = 1 + ((go) this).field_H;
                                      stackIn_112_0 = stackOut_111_0;
                                      stackIn_112_1 = stackOut_111_1;
                                      stackIn_112_2 = stackOut_111_2;
                                      break L9;
                                    } else {
                                      stackOut_110_0 = this;
                                      stackOut_110_1 = stackIn_110_1;
                                      stackOut_110_2 = this.a(-1);
                                      stackIn_112_0 = stackOut_110_0;
                                      stackIn_112_1 = stackOut_110_1;
                                      stackIn_112_2 = stackOut_110_2;
                                      break L9;
                                    }
                                  }
                                  this.a(stackIn_112_1, stackIn_112_2);
                                  return true;
                                } else {
                                  break L7;
                                }
                              } else {
                                if (102 != param0) {
                                  if ((param0 ^ -1) != -104) {
                                    if ((param0 ^ -1) != -85) {
                                      L10: {
                                        if (!di.field_p[82]) {
                                          break L10;
                                        } else {
                                          if (param0 != -66) {
                                            break L10;
                                          } else {
                                            this.h((byte) -95);
                                            return true;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (!di.field_p[82]) {
                                          break L11;
                                        } else {
                                          if (-67 != param0) {
                                            break L11;
                                          } else {
                                            this.h(param2 + -14);
                                            return true;
                                          }
                                        }
                                      }
                                      if (di.field_p[82]) {
                                        if (67 == param0) {
                                          this.m((byte) -7);
                                          return true;
                                        } else {
                                          break L7;
                                        }
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      this.i((byte) 2);
                                      return true;
                                    }
                                  } else {
                                    this.a(88, ((go) this).field_s.length());
                                    return true;
                                  }
                                } else {
                                  this.a(97, 0);
                                  return true;
                                }
                              }
                            }
                          } else {
                            ((go) this).e(true);
                            return true;
                          }
                        }
                      } else {
                        if (((go) this).field_N == ((go) this).field_H) {
                          if (-1 > (((go) this).field_H ^ -1)) {
                            ((go) this).field_N = -1 + ((go) this).field_H;
                            this.k((byte) -120);
                            return true;
                          } else {
                            break L7;
                          }
                        } else {
                          this.k((byte) 22);
                          return true;
                        }
                      }
                    }
                    return false;
                  }
                }
              }
            }
          }
          return false;
        } else {
          L12: {
            ((go) this).field_F = -52L;
            ((go) this).field_Q = pr.a(param2 ^ 14287);
            if (param1 == 60) {
              break L12;
            } else {
              if (62 == param1) {
                break L12;
              } else {
                L13: {
                  if (param1 < 32) {
                    break L13;
                  } else {
                    if (param1 > 126) {
                      break L13;
                    } else {
                      L14: {
                        if (((go) this).field_H == ((go) this).field_N) {
                          break L14;
                        } else {
                          this.k((byte) -116);
                          break L14;
                        }
                      }
                      L15: {
                        L16: {
                          if (((go) this).field_O == -1) {
                            break L16;
                          } else {
                            if (((go) this).field_s.length() >= ((go) this).field_O) {
                              break L15;
                            } else {
                              break L16;
                            }
                          }
                        }
                        if (((go) this).field_H < ((go) this).field_s.length()) {
                          ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_H) + param1 + ((go) this).field_s.substring(((go) this).field_H, ((go) this).field_s.length());
                          ((go) this).field_H = ((go) this).field_H + 1;
                          ((go) this).field_N = ((go) this).field_H;
                          ((go) this).i(5018);
                          break L15;
                        } else {
                          ((go) this).field_s = ((go) this).field_s + param1;
                          ((go) this).field_H = ((go) this).field_s.length();
                          ((go) this).field_N = ((go) this).field_s.length();
                          ((go) this).i(5018);
                          break L15;
                        }
                      }
                      return true;
                    }
                  }
                }
                if (85 != param0) {
                  if (param0 == 101) {
                    if (((go) this).field_N == ((go) this).field_H) {
                      if (((go) this).field_H >= ((go) this).field_s.length()) {
                        return false;
                      } else {
                        ((go) this).field_N = 1 + ((go) this).field_H;
                        this.k((byte) -117);
                        return true;
                      }
                    } else {
                      this.k((byte) -117);
                      return true;
                    }
                  } else {
                    if (13 != param0) {
                      L17: {
                        if (param0 == 96) {
                          if (-1 > (((go) this).field_H ^ -1)) {
                            L18: {
                              stackOut_58_0 = this;
                              stackOut_58_1 = 127;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              stackIn_59_0 = stackOut_58_0;
                              stackIn_59_1 = stackOut_58_1;
                              if (di.field_p[82]) {
                                stackOut_60_0 = this;
                                stackOut_60_1 = stackIn_60_1;
                                stackOut_60_2 = this.g((byte) 88);
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                stackIn_61_2 = stackOut_60_2;
                                break L18;
                              } else {
                                stackOut_59_0 = this;
                                stackOut_59_1 = stackIn_59_1;
                                stackOut_59_2 = -1 + ((go) this).field_H;
                                stackIn_61_0 = stackOut_59_0;
                                stackIn_61_1 = stackOut_59_1;
                                stackIn_61_2 = stackOut_59_2;
                                break L18;
                              }
                            }
                            this.a(stackIn_61_1, stackIn_61_2);
                            return true;
                          } else {
                            break L17;
                          }
                        } else {
                          if (-98 == (param0 ^ -1)) {
                            if (((go) this).field_H < ((go) this).field_s.length()) {
                              L19: {
                                stackOut_52_0 = this;
                                stackOut_52_1 = 88;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_54_1 = stackOut_52_1;
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                if (!di.field_p[82]) {
                                  stackOut_54_0 = this;
                                  stackOut_54_1 = stackIn_54_1;
                                  stackOut_54_2 = 1 + ((go) this).field_H;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  stackIn_55_2 = stackOut_54_2;
                                  break L19;
                                } else {
                                  stackOut_53_0 = this;
                                  stackOut_53_1 = stackIn_53_1;
                                  stackOut_53_2 = this.a(-1);
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  stackIn_55_2 = stackOut_53_2;
                                  break L19;
                                }
                              }
                              this.a(stackIn_55_1, stackIn_55_2);
                              return true;
                            } else {
                              break L17;
                            }
                          } else {
                            if (102 != param0) {
                              if ((param0 ^ -1) != -104) {
                                if ((param0 ^ -1) != -85) {
                                  L20: {
                                    if (!di.field_p[82]) {
                                      break L20;
                                    } else {
                                      if (param0 != -66) {
                                        break L20;
                                      } else {
                                        this.h((byte) -95);
                                        return true;
                                      }
                                    }
                                  }
                                  L21: {
                                    if (!di.field_p[82]) {
                                      break L21;
                                    } else {
                                      if (-67 != param0) {
                                        break L21;
                                      } else {
                                        this.h(param2 + -14);
                                        return true;
                                      }
                                    }
                                  }
                                  if (di.field_p[82]) {
                                    if (67 == param0) {
                                      this.m((byte) -7);
                                      return true;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  this.i((byte) 2);
                                  return true;
                                }
                              } else {
                                this.a(88, ((go) this).field_s.length());
                                return true;
                              }
                            } else {
                              this.a(97, 0);
                              return true;
                            }
                          }
                        }
                      }
                      return false;
                    } else {
                      ((go) this).e(true);
                      return true;
                    }
                  }
                } else {
                  if (((go) this).field_N == ((go) this).field_H) {
                    if (-1 <= (((go) this).field_H ^ -1)) {
                      return false;
                    } else {
                      ((go) this).field_N = -1 + ((go) this).field_H;
                      this.k((byte) -120);
                      return true;
                    }
                  } else {
                    this.k((byte) 22);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final static boolean j(int param0) {
        if (param0 != 0) {
            return false;
        }
        return js.a(-83, kq.f((byte) 127));
    }

    private final int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = ((go) this).field_s.length();
        if (var2 == ((go) this).field_H) {
          return ((go) this).field_H;
        } else {
          var3 = 1 + ((go) this).field_H;
          L0: while (true) {
            if (var2 > var3) {
              if (((go) this).field_s.charAt(-1 + var3) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != -1) {
                  this.h((byte) 17);
                  return var3;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != -1) {
                this.h((byte) 17);
                return var3;
              } else {
                return var3;
              }
            }
          }
        }
    }

    go(String param0, ko param1, int param2) {
        super(param0, param1);
        ((go) this).field_F = 0L;
        ((go) this).field_R = -1;
        ((go) this).field_P = false;
        ((go) this).field_p = qq.field_I.field_f;
        ((go) this).field_O = param2;
        ((go) this).a(67, param0, true);
        ((go) this).field_M = true;
        ((go) this).field_Q = pr.a(14274);
    }

    void a(int param0, int param1, vg param2, byte param3) {
        pj var5 = null;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        this.j((byte) -59);
        if (1 == ((go) this).field_o) {
          if (!(((go) this).field_p instanceof pj)) {
            ((go) this).field_Q = pr.a(14274);
            return;
          } else {
            L0: {
              var5 = (pj) (Object) ((go) this).field_p;
              var6 = var5.a(param0, pd.field_k, param1, (vg) this, true, bb.field_b);
              if ((var6 ^ -1) == 0) {
                break L0;
              } else {
                L1: {
                  if (!((go) this).field_P) {
                    break L1;
                  } else {
                    if (((go) this).field_R <= var6) {
                      break L1;
                    } else {
                      if (var6 <= ((go) this).field_N) {
                        break L1;
                      } else {
                        var6 = ((go) this).field_R;
                        break L1;
                      }
                    }
                  }
                }
                ((go) this).field_H = var6;
                break L0;
              }
            }
            ((go) this).field_Q = pr.a(14274);
            return;
          }
        } else {
          return;
        }
    }

    void i(int param0) {
        L0: {
          if (((go) this).field_u instanceof od) {
            ((od) (Object) ((go) this).field_u).a((go) this, 95);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 5018) {
          return;
        } else {
          ((go) this).field_N = -127;
          return;
        }
    }

    final void a(int param0, String param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = 98 % ((4 - param0) / 40);
          if (param1 == null) {
            param1 = "";
            break L0;
          } else {
            break L0;
          }
        }
        ((go) this).field_s = param1;
        var5 = param1.length();
        if (((go) this).field_O != -1) {
          if (((go) this).field_O < var5) {
            ((go) this).field_s = ((go) this).field_s.substring(0, ((go) this).field_O);
            ((go) this).field_N = ((go) this).field_s.length();
            ((go) this).field_H = ((go) this).field_s.length();
            if (param2) {
              return;
            } else {
              ((go) this).i(5018);
              return;
            }
          } else {
            ((go) this).field_N = ((go) this).field_s.length();
            ((go) this).field_H = ((go) this).field_s.length();
            if (param2) {
              return;
            } else {
              ((go) this).i(5018);
              return;
            }
          }
        } else {
          ((go) this).field_N = ((go) this).field_s.length();
          ((go) this).field_H = ((go) this).field_s.length();
          if (param2) {
            return;
          } else {
            ((go) this).i(5018);
            return;
          }
        }
    }

    private final String l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (((go) this).field_H <= ((go) this).field_N) {
            stackOut_2_0 = ((go) this).field_H;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((go) this).field_N;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((go) this).field_N >= ((go) this).field_H) {
            stackOut_5_0 = ((go) this).field_N;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((go) this).field_H;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (param0 < 78) {
          var4 = null;
          this.a((byte) 98, (String) null);
          return ((go) this).field_s.substring(var2, var3);
        } else {
          return ((go) this).field_s.substring(var2, var3);
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 0) {
          field_E = null;
          return wk.a(10, param1, param0 ^ 126, true);
        } else {
          return wk.a(10, param1, param0 ^ 126, true);
        }
    }

    private final void m(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.k((byte) -117);
                            this.a((byte) -109, var2);
                            if (param0 == -7) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((go) this).field_R = -30;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hh a(int param0, String param1, bc param2, bc param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        var5 = param2.a(126, param4);
        var6 = param2.a(var5, (byte) 106, param1);
        if (param0 < 94) {
          return null;
        } else {
          return cf.a(param3, 1, param2, var5, var6);
        }
    }

    private final void h(int param0) {
        try {
            String var2 = null;
            var2 = this.l((byte) 102);
            if (param0 <= (var2.length() ^ -1)) {
              return;
            } else {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.l((byte) 120)), (java.awt.datatransfer.ClipboardOwner) null);
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void k(int param0) {
        field_G = null;
        if (param0 <= 73) {
            return;
        }
        field_I = null;
        field_E = null;
        field_K = null;
        field_L = null;
    }

    private final int g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((go) this).field_H != 0) {
          var2 = -1 + ((go) this).field_H;
          if (param0 >= 87) {
            L0: while (true) {
              if (0 < var2) {
                if (((go) this).field_s.charAt(var2 - 1) != 32) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          } else {
            return -4;
          }
        } else {
          return ((go) this).field_H;
        }
    }

    private final void i(byte param0) {
        if (!(((go) this).field_u instanceof od)) {
          if (param0 == 2) {
            return;
          } else {
            String discarded$4 = this.l((byte) -113);
            return;
          }
        } else {
          ((od) (Object) ((go) this).field_u).a(4340, (go) this);
          if (param0 == 2) {
            return;
          } else {
            String discarded$5 = this.l((byte) -113);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = false;
        field_K = "If you are not, please change your password to something more obscure!";
        field_G = "Please remove <%0> from your ignore list first.";
    }
}
