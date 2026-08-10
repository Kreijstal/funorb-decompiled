/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb extends br {
    static String field_r;
    private int field_f;
    private int field_t;
    private int field_n;
    static boolean field_l;
    static int field_i;
    private int field_h;
    static String field_g;
    private int field_s;
    static boolean field_o;
    int field_m;
    private int field_q;
    private ja field_p;
    static int[] field_j;
    private int field_k;

    final static void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (ki.field_h == null) {
                break L0;
              } else {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (vo.field_l == pi.field_a) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                }
                L3: {
                  if (ma.field_a.field_j != 0) {
                    break L3;
                  } else {
                    if (cf.field_g - -10000L < bl.a((byte) 59)) {
                      ma.field_a.b((byte) -35, param0);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 >= ma.field_a.field_j) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        ki.field_h.a(0, -100, ma.field_a.field_j, ma.field_a.field_m);
                        cf.field_g = bl.a((byte) 125);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L6: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        ak.a((byte) -121);
                        break L6;
                      }
                    }
                    ma.field_a.field_j = 0;
                    break L4;
                  }
                }
                return;
              }
            }
            ma.field_a.field_j = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(byte param0) {
        this.field_n = this.field_q;
        if (param0 != 99) {
            pd var3 = (pd) null;
            cb.a(96, 89, 115, (pd) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, ja param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param2 - param5 << 870091624) / param4.field_z;
              param3 = param3 + param4.field_r;
              var7 = var6_int * param4.field_r + (param5 << -1754660152);
              param0 = param0 + param4.field_y;
              var8 = param3 - -(param0 * oo.field_b);
              var9 = 0;
              if (!param1) {
                break L1;
              } else {
                field_o = false;
                break L1;
              }
            }
            L2: {
              var10 = param4.field_w;
              var11 = param4.field_x;
              var12 = oo.field_b + -var11;
              if (oo.field_e > param0) {
                var14 = oo.field_e - param0;
                var9 = var9 + var14 * var11;
                var8 = var8 + var14 * oo.field_b;
                var10 = var10 - var14;
                param0 = oo.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var13 = 0;
              if (param3 >= oo.field_f) {
                break L3;
              } else {
                var14 = oo.field_f + -param3;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                param3 = oo.field_f;
                var7 = var7 + var6_int * var14;
                var8 = var8 + var14;
                break L3;
              }
            }
            L4: {
              if (var10 + param0 <= oo.field_d) {
                break L4;
              } else {
                var10 = var10 - (-oo.field_d + (var10 + param0));
                break L4;
              }
            }
            L5: {
              if (oo.field_g < param3 + var11) {
                var14 = -oo.field_g + (var11 + param3);
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 <= (var11 ^ -1)) {
                break L6;
              } else {
                if (var10 <= 0) {
                  break L6;
                } else {
                  param0 = -var10;
                  L7: while (true) {
                    if (0 <= param0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param3 = -var11;
                      L8: while (true) {
                        if (0 <= param3) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param0++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -395202744;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (-1 < (var15 ^ -1)) {
                              var9++;
                              var8++;
                              break L9;
                            } else {
                              incrementValue$0 = var9;
                              var9++;
                              var17 = param4.field_B[incrementValue$0];
                              if (var17 != 0) {
                                L10: {
                                  if (255 >= var15) {
                                    var18 = oo.field_i[var8];
                                    var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> -1174207160 & 16711935;
                                    oo.field_i[var8] = (tq.b(var15 * tq.b(var17, 65280) + var16 * tq.b(var18, 65280), 16711705) >> 1952195688) + var19;
                                    break L10;
                                  } else {
                                    oo.field_i[var8] = var17;
                                    break L10;
                                  }
                                }
                                var8++;
                                break L9;
                              } else {
                                var8++;
                                break L9;
                              }
                            }
                          }
                          param3++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6);

            stackIn_35_1 = new StringBuilder().append("cb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L11;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L11;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        this.field_m = param2;
        this.field_h = param3;
        this.field_k = 70;
        this.field_p = new ja(this.field_k, this.field_h);
        if (ll.field_k.c(param3 ^ 57, this.field_m)) {
          L0: {
            this.field_s = cr.a(this.field_m, param3 + -193);
            stackIn_4_0 = this;

            if (ll.field_k.d(this.field_m, 53)) {
              stackIn_5_0 = this;
              stackIn_5_1 = this.field_s;
              break L0;
            } else {
              stackIn_5_0 = this;
              stackIn_5_1 = ll.field_k.field_t[this.field_m];
              break L0;
            }
          }
          ((cb) (this)).field_n = stackIn_5_1;
          if (this.field_s < this.field_n) {
            this.field_n = this.field_s;
            this.field_f = 0;
            this.field_q = this.field_n;
            this.a((byte) -117);
            return;
          } else {
            this.field_f = 0;
            this.field_q = this.field_n;
            this.a((byte) -117);
            return;
          }
        } else {
          this.field_s = 0;
          this.field_n = 0;
          this.field_f = 0;
          this.field_q = this.field_n;
          this.a((byte) -117);
          return;
        }
    }

    final void d(byte param0) {
        if (param0 == -102) {
          if (this.field_f > this.field_n) {
            L0: {
              this.field_n = this.field_n + 1;
              if (this.field_s < this.field_n) {
                this.field_n = this.field_s;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (this.field_s < this.field_n) {
                this.field_n = this.field_s;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          field_g = (String) null;
          if (this.field_f <= this.field_n) {
            L2: {
              if (this.field_s < this.field_n) {
                this.field_n = this.field_s;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              this.field_n = this.field_n + 1;
              if (this.field_s < this.field_n) {
                this.field_n = this.field_s;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    final static void a(String param0, int param1, String param2) {
        if (param1 != 32) {
            return;
        }
        try {
            if (!(h.field_L == null)) {
                h.field_L.m(-7435);
            }
            b.field_c = new qm(param2, param0, false, true, true);
            wj.field_i.a((cf) (b.field_c), (byte) -110);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
            cb.a(-85);
            field_r = null;
            field_j = null;
            return;
        }
        field_r = null;
        field_j = null;
    }

    final static int b(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1720081695;
        param1 = param1 | param1 >>> -1671718942;
        param1 = param1 | param1 >>> 734924772;
        param1 = param1 | param1 >>> -769769048;
        param1 = param1 | param1 >>> 1473530480;
        if (param0 >= -69) {
          field_r = (String) null;
          return 1 + param1;
        } else {
          return 1 + param1;
        }
    }

    private final void a(byte param0) {
        int var2;
        ja var3;
        int var5;
        ja var4;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          g.c(this.field_p);
          var2 = 60 % ((param0 - -53) / 55);
          if (this.field_t == 0) {
            var3 = fg.field_m;
            break L0;
          } else {
            if ((this.field_t ^ -1) == -2) {
              var3 = nm.field_w;
              break L0;
            } else {
              var3 = ol.field_n;
              break L0;
            }
          }
        }
        if (-20 >= (this.field_m ^ -1)) {
          if ((this.field_m ^ -1) > -45) {
            L1: {
              if (!ch.a(this.field_m, false)) {
                break L1;
              } else {
                var3.g(0, 0, 4202528);
                break L1;
              }
            }
            if (this.field_s != 0) {
              if (19 <= this.field_m) {
                if (32 <= this.field_m) {
                  if (this.field_m > 38) {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  } else {
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                var4 = wa.field_b[this.field_m];
                var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                g.d();
                return;
              }
            } else {
              oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
              pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
              g.d();
              return;
            }
          } else {
            if (this.field_m <= 62) {
              var3.g(0, 0, 1922601);
              if (this.field_s != 0) {
                if (19 <= this.field_m) {
                  if (32 <= this.field_m) {
                    if (this.field_m > 38) {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    } else {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  } else {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  var4 = wa.field_b[this.field_m];
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                g.d();
                return;
              }
            } else {
              if (ch.a(this.field_m, false)) {
                L2: {
                  var3.g(0, 0, 4202528);
                  if (this.field_s != 0) {
                    if (19 <= this.field_m) {
                      if (32 > this.field_m) {
                        var4 = wa.field_b[26 + (this.field_m - 44)];
                        var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                        g.d();
                        return;
                      } else {
                        L3: {
                          if (this.field_m <= 38) {
                            var4 = wa.field_b[-32 + (this.field_m + 19)];
                            break L3;
                          } else {
                            var4 = wa.field_b[26 + (this.field_m - 44)];
                            break L3;
                          }
                        }
                        var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
                    } else {
                      var4 = wa.field_b[this.field_m];
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      break L2;
                    }
                  } else {
                    oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                    break L2;
                  }
                }
                g.d();
                return;
              } else {
                L4: {
                  if (this.field_s != 0) {
                    L5: {
                      if (19 <= this.field_m) {
                        L6: {
                          if (32 > this.field_m) {
                            break L6;
                          } else {
                            if (this.field_m <= 38) {
                              var4 = wa.field_b[-32 + (this.field_m + 19)];
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4 = wa.field_b[26 + (this.field_m - 44)];
                        break L5;
                      } else {
                        var4 = wa.field_b[this.field_m];
                        break L5;
                      }
                    }
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    break L4;
                  } else {
                    oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                    break L4;
                  }
                }
                g.d();
                return;
              }
            }
          }
        } else {
          var3.g(0, 0, 6707010);
          if (this.field_s != 0) {
            if (19 <= this.field_m) {
              if (32 <= this.field_m) {
                if (this.field_m > 38) {
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                } else {
                  var4 = wa.field_b[-32 + (this.field_m + 19)];
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                var4 = wa.field_b[26 + (this.field_m - 44)];
                var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                g.d();
                return;
              }
            } else {
              var4 = wa.field_b[this.field_m];
              var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
              g.d();
              return;
            }
          } else {
            oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
            pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
            g.d();
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        this.field_f = this.field_n + param1;
        if (param0 != 0) {
            this.field_q = -95;
        }
    }

    public cb() {
        this.field_k = 70;
        this.field_h = 70;
        this.field_p = new ja(this.field_k, this.field_h);
    }

    final static void a(int param0, int param1, int param2, pd param3) {
        try {
            e.field_a = param1;
            if (param2 != -8388) {
                ja var5 = (ja) null;
                cb.a(97, false, 53, -73, (ja) null, -43);
            }
            ic.field_g = param0;
            qf.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "cb.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = false;
        field_g = "RuneScape clan";
        field_r = "Powerups with this modifier will work even on enemy zombies.";
        field_j = new int[]{2, 4};
        field_o = true;
    }
}
