/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gn {
    private boolean field_b;
    private int field_g;
    private int field_c;
    static String field_l;
    private int field_i;
    private int field_d;
    private int field_a;
    private int field_n;
    private int field_o;
    private int field_j;
    static int field_t;
    private int field_q;
    private bk field_h;
    private int field_r;
    private int field_s;
    private int field_f;
    private int field_p;
    private int field_e;
    static int[] field_k;
    private int field_u;
    private float field_m;

    final static void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var6_int = 0;
        int var7 = 0;
        vi var8 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var6_int = 1;
            L1: while (true) {
              if (var6_int >= 3) {
                L2: {
                  if (param5 > 69) {
                    break L2;
                  } else {
                    var8 = (vi) null;
                    gn.a(10, (vi) null);
                    break L2;
                  }
                }
                break L0;
              } else {
                si.e(var6_int + param2, param0 - -var6_int, 9 + -var6_int, 16776960, param3);
                si.d(param2 - -var6_int, param0 + var6_int, -var6_int + 9, 16776960, param3);
                si.e(-9 + param1, var6_int + param0, 9 - var6_int, 16776960, param3);
                si.d(param1 + -var6_int, param0 + var6_int, 9 + -var6_int, 16776960, param3);
                si.e(param2 - -var6_int, -var6_int + param4, 9 + -var6_int, 16776960, param3);
                si.d(var6_int + param2, -9 + param4, 9 - var6_int, 16776960, param3);
                si.e(-9 + param1, param4 + -var6_int, 1 + -var6_int + 9, 16776960, param3);
                si.d(-var6_int + param1, param4 - 9, -var6_int + 9, 16776960, param3);
                var6_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var6), "gn.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -52 % ((param0 - 23) / 50);
        field_l = null;
        field_k = null;
    }

    final void a(boolean param0) {
        int fieldTemp$1 = 0;
        if (null != wa.field_q) {
          return;
        } else {
          L0: {
            if (0 >= wb.field_S) {
              this.field_b = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_b) {
            L1: {
              if (hf.field_h >= this.field_c) {
                if (0 >= this.field_c) {
                  break L1;
                } else {
                  sg.field_a = 0;
                  break L1;
                }
              } else {
                sg.field_a = (this.field_c - hf.field_h) / 2;
                break L1;
              }
            }
            L2: {
              L3: {
                if (hf.field_h != this.field_i) {
                  break L3;
                } else {
                  if (qc.field_s != this.field_u) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_h.a((byte) -123, this.field_u, this.field_i);
              break L2;
            }
            return;
          } else {
            L4: {
              if (param0) {
                break L4;
              } else {
                gn.a(-27);
                break L4;
              }
            }
            fieldTemp$1 = this.field_o - 1;
            this.field_o = this.field_o - 1;
            if (-1 > (fieldTemp$1 ^ -1)) {
              return;
            } else {
              this.field_o = this.field_n;
              if (ca.field_d >= this.field_q) {
                this.a((byte) -97);
                return;
              } else {
                this.field_b = false;
                return;
              }
            }
          }
        }
    }

    final static boolean a(int param0, vi param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_t = 102;
                break L1;
              }
            }
            L2: {
              var2_int = param1.l(32270);
              if (1 == var2_int) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = 0;
                break L2;
              }
            }
            var3 = stackIn_5_0;
            stackIn_6_0 = var3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("gn.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final ue d(int param0) {
        this.field_d = hf.field_h;
        this.field_f = qc.field_s;
        if (param0 != 16776960) {
            this.d(47);
        }
        this.field_h.a((byte) -125, this.field_p, this.field_s);
        ih.field_s = false;
        ue var2 = jg.a(this.field_s, (byte) -61, gf.field_b, 0, this.field_p, 0);
        if (var2 == null) {
            this.c(115);
        }
        return var2;
    }

    final static ll a(String param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ll stackIn_3_0 = null;
        ll stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            if (!param1) {
              L1: while (true) {
                if (var3 >= var2_int) {
                  stackIn_12_0 = we.field_g;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var4 = param0.charAt(var3);
                  if (48 <= var4) {
                    if (var4 <= 57) {
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = (ll) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("gn.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_12_0;
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 28433) {
          L0: {
            L1: {
              if (this.field_q > ca.field_d) {
                break L1;
              } else {
                if (-1 <= (wb.field_S ^ -1)) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5, boolean[] param6) {
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        p var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var14 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var8 = 46 / ((9 - param3) / 50);
            var14 = new bd(64, 64);
            var9 = 0;
            L1: while (true) {
              if (var9 >= ll.field_a) {
                break L0;
              } else {
                L2: {
                  var10 = wh.field_b[var9];
                  param1 = -12 + -param2 + (int)(24.0 * ((double)var10.field_j.field_e + var10.field_l.field_f));
                  param4 = (int)(((double)var10.field_j.field_g + var10.field_l.field_a) * 24.0) - param0 - -12;
                  if (-96 > param1) {
                    break L2;
                  } else {
                    if ((param4 ^ -1) > 95) {
                      break L2;
                    } else {
                      if (736 < param1) {
                        break L2;
                      } else {
                        if (576 >= param4) {
                          L3: {
                            var11 = var10.field_j.b(-4);
                            if (!param6[var11]) {
                              break L3;
                            } else {
                              var10.field_n = true;
                              break L3;
                            }
                          }
                          var12 = var10.field_i;
                          if (var12 != 0) {
                            if (var12 != 1) {
                              if ((var12 ^ -1) == -3) {
                                pf.a(var14.field_D, false);
                                wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                                var14.a();
                                wk.field_b[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                                o.field_n.b((byte) -88);
                                var12 = 0;
                                L4: while (true) {
                                  if (var14.field_D.length <= var12) {
                                    var12 = em.field_c % 80;
                                    var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                                    var14.b(-32 + param1, param4 - 32, var12 / 2);
                                    if (!param5[var11]) {
                                      break L2;
                                    } else {
                                      if (param1 - 24 > j.field_c) {
                                        break L2;
                                      } else {
                                        if (-24 + param4 > rb.field_m) {
                                          break L2;
                                        } else {
                                          if (param1 - -24 < j.field_c) {
                                            break L2;
                                          } else {
                                            if (rb.field_m <= 24 + param4) {
                                              pf.field_I = bm.field_e[var10.field_h];
                                              lh.field_a = param1;
                                              aj.field_d = 8 + param4;
                                              break L2;
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L5: {
                                      if (var14.field_D[var12] == 0) {
                                        break L5;
                                      } else {
                                        var14.field_D[var12] = 16711680;
                                        break L5;
                                      }
                                    }
                                    var12++;
                                    continue L4;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              pf.a(var14.field_D, false);
                              hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, param1, param4);
                              var14.a();
                              hh.field_a[var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                              o.field_n.b((byte) 110);
                              var12 = 0;
                              L6: while (true) {
                                if (var14.field_D.length <= var12) {
                                  var12 = em.field_c % 80;
                                  var12 = (int)(100.0 * (1.0 + Math.sin((double)var12 * 3.141592653589793 / 40.0)));
                                  var14.b(-32 + param1, -32 + param4, var12 / 2);
                                  if (!param5[var11]) {
                                    break L2;
                                  } else {
                                    if (j.field_c < param1 - 24) {
                                      break L2;
                                    } else {
                                      if (rb.field_m < -24 + param4) {
                                        break L2;
                                      } else {
                                        if (j.field_c > param1 - -24) {
                                          break L2;
                                        } else {
                                          if (rb.field_m <= 24 + param4) {
                                            pf.field_I = lg.field_n[var10.field_h];
                                            lh.field_a = param1;
                                            aj.field_d = param4 + 8;
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L7: {
                                    if (var14.field_D[var12] == 0) {
                                      break L7;
                                    } else {
                                      var14.field_D[var12] = 16711680;
                                      break L7;
                                    }
                                  }
                                  var12++;
                                  continue L6;
                                }
                              }
                            }
                          } else {
                            pf.a(var14.field_D, false);
                            qa.field_g[var10.field_h - -1].a(true, 128, (int)var10.field_c, param1, param4);
                            var14.a();
                            qa.field_g[1 + var10.field_h].a(true, 128, (int)var10.field_c, 32, 32);
                            o.field_n.b((byte) 117);
                            var12 = 0;
                            L8: while (true) {
                              if (var14.field_D.length <= var12) {
                                var12 = em.field_c % 80;
                                var12 = (int)(100.0 * (1.0 + Math.sin(3.141592653589793 * (double)var12 / 40.0)));
                                var14.b(param1 - 32, -32 + param4, var12 / 2);
                                if (!param5[var11]) {
                                  break L2;
                                } else {
                                  if (param1 + -24 > j.field_c) {
                                    break L2;
                                  } else {
                                    if (-24 + param4 > rb.field_m) {
                                      break L2;
                                    } else {
                                      if (param1 - -24 < j.field_c) {
                                        break L2;
                                      } else {
                                        if (rb.field_m <= 24 + param4) {
                                          L9: {
                                            L10: {
                                              if (var10.field_h < 0) {
                                                break L10;
                                              } else {
                                                if (var10.field_h >= rf.field_s.length) {
                                                  break L10;
                                                } else {
                                                  pf.field_I = rf.field_s[var10.field_h];
                                                  break L9;
                                                }
                                              }
                                            }
                                            pf.field_I = rf.field_s[0];
                                            break L9;
                                          }
                                          aj.field_d = 8 + param4;
                                          lh.field_a = param1;
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L11: {
                                  if ((var14.field_D[var12] ^ -1) != -1) {
                                    var14.field_D[var12] = 16711680;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var12++;
                                continue L8;
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackIn_61_0 = (RuntimeException) (var7);

            stackIn_61_1 = new StringBuilder().append("gn.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L12;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param6 == null) {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L13;
            } else {
              stackIn_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L13;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_62_0), stackIn_65_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_c = param2;
        if (param1 != 1) {
            this.a(true);
        }
        this.field_e = param0;
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          var2 = this.field_c;
          var3 = this.field_e;
          if (param0 < -26) {
            break L0;
          } else {
            this.field_d = 123;
            break L0;
          }
        }
        if (!this.b(28433)) {
          this.field_b = false;
          return;
        } else {
          L1: {
            if (var3 <= this.field_j) {
              if (this.field_a > var3) {
                var3 = this.field_a;
                break L1;
              } else {
                break L1;
              }
            } else {
              var3 = this.field_j;
              break L1;
            }
          }
          L2: {
            if (this.field_r >= var2) {
              if (this.field_g <= var2) {
                break L2;
              } else {
                var2 = this.field_g;
                break L2;
              }
            } else {
              var2 = this.field_r;
              break L2;
            }
          }
          L3: {
            if (0.0f < this.field_m) {
              var4 = (int)((float)var3 * this.field_m + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / this.field_m);
                break L3;
              } else {
                if (var2 <= var4) {
                  break L3;
                } else {
                  var2 = var4;
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L4: {
            L5: {
              if (var2 != hf.field_h) {
                break L5;
              } else {
                if (qc.field_s != var3) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            this.field_h.a((byte) -120, var3, var2);
            break L4;
          }
          L6: {
            if ((this.field_c ^ -1) >= -1) {
              break L6;
            } else {
              sg.field_a = (-hf.field_h + this.field_c) / 2;
              break L6;
            }
          }
          return;
        }
    }

    final void c(int param0) {
        if (param0 <= 67) {
            this.a((byte) -115);
        }
        this.field_h.a((byte) -119, this.field_f, this.field_d);
    }

    private gn() throws Throwable {
        throw new Error();
    }

    static {
        field_t = 0;
        field_l = "Start mission";
        field_k = new int[]{0, 0};
    }
}
