/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ve {
    private Random field_l;
    static String field_a;
    private int[] field_c;
    private double field_h;
    int field_k;
    private double field_f;
    private double field_e;
    private int field_d;
    private int field_i;
    private double field_g;
    private double field_j;
    static ja field_b;

    final static void a(long param0, int param1, String param2, tq param3, String param4, cj param5, int param6, int[] param7, int param8) {
        try {
            vc.field_d = param3;
            if (param1 != 196) {
                ve.a((byte) 2);
            }
            pk.field_b = new jb(param5, param0, param4, param2, param8, param6, param7);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ve.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_l.setSeed((long)this.field_k);
        var8 = (65454 & param0) >> 2037672744;
        var7 = param0 >> 789514224;
        var9 = 255 & param0;
        if (param5 == -1963) {
          var10 = 0;
          L0: while (true) {
            if ((var10 ^ -1) <= -256) {
              if (param2) {
                oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                var10 = 0;
                L1: while (true) {
                  if (var10 < this.field_d) {
                    if (var12 == 0) {
                      L2: {
                        if (!param2) {
                          break L2;
                        } else {
                          oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                          break L2;
                        }
                      }
                      L3: {
                        if (param2) {
                          oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                      var10++;
                      continue L1;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                var10 = 0;
                L4: while (true) {
                  if (var10 < this.field_d) {
                    if (var12 == 0) {
                      L5: {
                        if (!param2) {
                          break L5;
                        } else {
                          oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                          break L5;
                        }
                      }
                      L6: {
                        if (param2) {
                          oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                      var10++;
                      continue L4;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              var11 = (int)(Math.pow((double)var10, 1.5) / 16.0);
              this.field_c[var10] = cr.b(cr.b(var11 * var8 >> 1326367176 << -1295872824, var11 * var7 >> -1767996728 << 34601040), var9 * var11 >> -1849364120);
              var10++;
              if (var12 != 0) {
                oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                var10 = 0;
                L7: while (true) {
                  if (var10 < this.field_d) {
                    if (var12 == 0) {
                      L8: {
                        if (!param2) {
                          break L8;
                        } else {
                          oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                          break L8;
                        }
                      }
                      L9: {
                        if (param2) {
                          oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                      var10++;
                      continue L7;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (var12 == 0) {
                  continue L0;
                } else {
                  if (param2) {
                    oo.a(param1 << -1904160444, param3 << 899003428, this.field_i * 2 << 890753444, 254, this.field_c);
                    var10 = 0;
                    L10: while (true) {
                      if (var10 < this.field_d) {
                        if (var12 == 0) {
                          L11: {
                            if (!param2) {
                              break L11;
                            } else {
                              oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                              break L11;
                            }
                          }
                          L12: {
                            if (param2) {
                              oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                          var10++;
                          continue L10;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    var10 = 0;
                    L13: while (true) {
                      if (var10 < this.field_d) {
                        if (var12 == 0) {
                          L14: {
                            if (!param2) {
                              break L14;
                            } else {
                              oo.a(param1 << 332843588, param3 << 1236931428, this.field_i * var10 << -306831324, 254 / (var10 + 1), this.field_c);
                              break L14;
                            }
                          }
                          L15: {
                            if (param2) {
                              oo.a(param1 << 1803153860, param3 << -151686780, this.field_i * var10 << 1643550564, 196 / (1 + var10), this.field_c);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          this.a(param2, param0, this.field_i, this.field_j + (-0.5 + this.a(true)) * this.field_h, param3, param4, param1, (byte) -69, 0);
                          var10++;
                          continue L13;
                        } else {
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
          }
        } else {
          return;
        }
    }

    private final double a(boolean param0) {
        int[] var3 = null;
        if (!param0) {
          var3 = (int[]) null;
          ve.a(-109L, -96, (String) null, (tq) null, (String) null, (cj) null, 73, (int[]) null, 6);
          return (double)hp.a((byte) 115, this.field_l, 1000) / 1000.0;
        } else {
          return (double)hp.a((byte) 115, this.field_l, 1000) / 1000.0;
        }
    }

    private final void a(boolean param0, int param1, int param2, double param3, int param4, int param5, int param6, byte param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param8 <= 5) {
          if ((param2 ^ -1) <= -2) {
            var11 = param6 + (int)(nm.a(0, param3) * (double)param2);
            var12 = param4 + (int)((double)param2 * gh.a(param3, (byte) 19));
            var13 = hp.a((byte) -86, this.field_l, (int)(2.0 * this.field_g));
            var14 = param2 * 126 / this.field_i + 60;
            if (!param0) {
              if (param7 == -69) {
                oo.g(param6, param4, var11, var12, param5);
                oo.g(param6 - -1, param4, var11, var12, param5);
                oo.g(param6, 1 + param4, var11, var12, param5);
                var15 = 0;
                L0: while (true) {
                  if (var15 >= var13) {
                    return;
                  } else {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                      continue L0;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                this.field_g = 0.8709670644428569;
                oo.g(param6, param4, var11, var12, param5);
                oo.g(param6 - -1, param4, var11, var12, param5);
                oo.g(param6, 1 + param4, var11, var12, param5);
                var15 = 0;
                L1: while (true) {
                  if (var15 >= var13) {
                    return;
                  } else {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                      continue L1;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              oo.a(var11 << -637848540, var12 << 125549764, param2 << 356293060, var14, this.field_c);
              oo.a(var11 << 1805620548, var12 << -1544182876, param2 << 1823212323, var14 / 2, this.field_c);
              if (param7 == -69) {
                oo.g(param6, param4, var11, var12, param5);
                oo.g(param6 - -1, param4, var11, var12, param5);
                oo.g(param6, 1 + param4, var11, var12, param5);
                var15 = 0;
                L2: while (true) {
                  if (var15 < var13) {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                      continue L2;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                this.field_g = 0.8709670644428569;
                oo.g(param6, param4, var11, var12, param5);
                oo.g(param6 - -1, param4, var11, var12, param5);
                oo.g(param6, 1 + param4, var11, var12, param5);
                var15 = 0;
                L3: while (true) {
                  if (var15 < var13) {
                    this.a(param0, param1, (int)((double)param2 * this.field_e), (-0.5 + this.a(true)) * this.field_f + param3, var12, param5, var11, (byte) -69, param8 + 1);
                    var15++;
                    if (var16 == 0) {
                      continue L3;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 61) {
            return;
        }
        field_b = null;
    }

    ve(int param0, int param1, int param2, double param3, double param4, double param5, int param6, double param7, double param8, int param9) {
        this.field_l = new Random();
        this.field_c = new int[255];
        this.field_k = param9;
        this.field_e = param8;
        this.field_h = param4;
        this.field_i = param2;
        this.field_f = param5;
        this.field_d = param6;
        this.field_g = param7;
        this.field_j = param3;
    }

    static {
        field_a = "Powerups and Modifiers";
    }
}
