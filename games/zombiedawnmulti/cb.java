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
                    field_g = null;
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
                      ki.field_h.a(0, -100, ma.field_a.field_j, ma.field_a.field_m);
                      cf.field_g = bl.a((byte) 125);
                    } catch (java.io.IOException decompiledCaughtParameter) {
                      decompiledCaughtException = decompiledCaughtParameter;
                    }
                    iOException = (IOException) (Object) decompiledCaughtException;
                    ak.a((byte) -121);
                    break L4;
                  }
                }
                ma.field_a.field_j = 0;
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
        ((cb) this).field_n = ((cb) this).field_q;
        if (param0 != 99) {
            Object var3 = null;
            cb.a(96, 89, 115, (pd) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, ja param4, int param5) {
        int var6 = 0;
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
        var6 = (param2 - param5 << 870091624) / param4.field_z;
        param3 = param3 + param4.field_r;
        var7 = var6 * param4.field_r + (param5 << -1754660152);
        param0 = param0 + param4.field_y;
        var8 = param3 - -(param0 * oo.field_b);
        var9 = 0;
        if (!param1) {
          L0: {
            var10 = param4.field_w;
            var11 = param4.field_x;
            var12 = oo.field_b + -var11;
            if (oo.field_e > param0) {
              var14 = oo.field_e - param0;
              var9 = var9 + var14 * var11;
              var8 = var8 + var14 * oo.field_b;
              var10 = var10 - var14;
              param0 = oo.field_e;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var13 = 0;
            if (param3 >= oo.field_f) {
              break L1;
            } else {
              var14 = oo.field_f + -param3;
              var13 = var13 + var14;
              var9 = var9 + var14;
              var12 = var12 + var14;
              var11 = var11 - var14;
              param3 = oo.field_f;
              var7 = var7 + var6 * var14;
              var8 = var8 + var14;
              break L1;
            }
          }
          L2: {
            if (var10 + param0 <= oo.field_d) {
              break L2;
            } else {
              var10 = var10 - (-oo.field_d + (var10 + param0));
              break L2;
            }
          }
          L3: {
            if (oo.field_g < param3 + var11) {
              var14 = -oo.field_g + (var11 + param3);
              var12 = var12 + var14;
              var13 = var13 + var14;
              var11 = var11 - var14;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-1 <= (var11 ^ -1)) {
              break L4;
            } else {
              if (var10 <= 0) {
                break L4;
              } else {
                param0 = -var10;
                L5: while (true) {
                  if (0 <= param0) {
                    return;
                  } else {
                    var14 = var7;
                    param3 = -var11;
                    L6: while (true) {
                      if (0 <= param3) {
                        var9 = var9 + var13;
                        var8 = var8 + var12;
                        param0++;
                        continue L5;
                      } else {
                        var15 = var14 >> -395202744;
                        var16 = -var15 + 256;
                        var14 = var14 + var6;
                        if (-1 < (var15 ^ -1)) {
                          var9++;
                          var8++;
                          param3++;
                          continue L6;
                        } else {
                          var9++;
                          var17 = param4.field_B[var9];
                          if (var17 != 0) {
                            if (255 >= var15) {
                              var18 = oo.field_i[var8];
                              var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> -1174207160 & 16711935;
                              oo.field_i[var8] = (tq.b(var15 * tq.b(var17, 65280) + var16 * tq.b(var18, 65280), 16711705) >> 1952195688) + var19;
                              var8++;
                              param3++;
                              continue L6;
                            } else {
                              oo.field_i[var8] = var17;
                              var8++;
                              param3++;
                              continue L6;
                            }
                          } else {
                            var8++;
                            param3++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          return;
        } else {
          L7: {
            field_o = false;
            var10 = param4.field_w;
            var11 = param4.field_x;
            var12 = oo.field_b + -var11;
            if (oo.field_e > param0) {
              var14 = oo.field_e - param0;
              var9 = var9 + var14 * var11;
              var8 = var8 + var14 * oo.field_b;
              var10 = var10 - var14;
              param0 = oo.field_e;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            var13 = 0;
            if (param3 >= oo.field_f) {
              break L8;
            } else {
              var14 = oo.field_f + -param3;
              var13 = var13 + var14;
              var9 = var9 + var14;
              var12 = var12 + var14;
              var11 = var11 - var14;
              param3 = oo.field_f;
              var7 = var7 + var6 * var14;
              var8 = var8 + var14;
              break L8;
            }
          }
          L9: {
            if (var10 + param0 <= oo.field_d) {
              break L9;
            } else {
              var10 = var10 - (-oo.field_d + (var10 + param0));
              break L9;
            }
          }
          L10: {
            if (oo.field_g < param3 + var11) {
              var14 = -oo.field_g + (var11 + param3);
              var12 = var12 + var14;
              var13 = var13 + var14;
              var11 = var11 - var14;
              break L10;
            } else {
              break L10;
            }
          }
          if (-1 > (var11 ^ -1)) {
            if (var10 <= 0) {
              return;
            } else {
              param0 = -var10;
              L11: while (true) {
                if (0 <= param0) {
                  return;
                } else {
                  var14 = var7;
                  param3 = -var11;
                  L12: while (true) {
                    if (0 <= param3) {
                      var9 = var9 + var13;
                      var8 = var8 + var12;
                      param0++;
                      continue L11;
                    } else {
                      var15 = var14 >> -395202744;
                      var16 = -var15 + 256;
                      var14 = var14 + var6;
                      if (-1 < (var15 ^ -1)) {
                        var9++;
                        var8++;
                        param3++;
                        continue L12;
                      } else {
                        var9++;
                        var17 = param4.field_B[var9];
                        if (var17 != 0) {
                          if (255 >= var15) {
                            var18 = oo.field_i[var8];
                            var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> -1174207160 & 16711935;
                            oo.field_i[var8] = (tq.b(var15 * tq.b(var17, 65280) + var16 * tq.b(var18, 65280), 16711705) >> 1952195688) + var19;
                            var8++;
                            param3++;
                            continue L12;
                          } else {
                            oo.field_i[var8] = var17;
                            var8++;
                            param3++;
                            continue L12;
                          }
                        } else {
                          var8++;
                          param3++;
                          continue L12;
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
    }

    final void a(int param0, int param1, int param2, int param3) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ((cb) this).field_m = param2;
        ((cb) this).field_h = param3;
        ((cb) this).field_k = 70;
        ((cb) this).field_p = new ja(((cb) this).field_k, ((cb) this).field_h);
        if (ll.field_k.c(param3 ^ 57, ((cb) this).field_m)) {
          L0: {
            ((cb) this).field_s = cr.a(((cb) this).field_m, param3 + -193);
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (ll.field_k.d(((cb) this).field_m, 53)) {
              stackOut_4_0 = this;
              stackOut_4_1 = ((cb) this).field_s;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = ll.field_k.field_t[((cb) this).field_m];
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          ((cb) this).field_n = stackIn_5_1;
          if (((cb) this).field_s < ((cb) this).field_n) {
            ((cb) this).field_n = ((cb) this).field_s;
            ((cb) this).field_f = 0;
            ((cb) this).field_q = ((cb) this).field_n;
            this.a((byte) -117);
            return;
          } else {
            ((cb) this).field_f = 0;
            ((cb) this).field_q = ((cb) this).field_n;
            this.a((byte) -117);
            return;
          }
        } else {
          ((cb) this).field_s = 0;
          ((cb) this).field_n = 0;
          ((cb) this).field_f = 0;
          ((cb) this).field_q = ((cb) this).field_n;
          this.a((byte) -117);
          return;
        }
    }

    final void d(byte param0) {
        if (param0 == -102) {
          if (((cb) this).field_f > ((cb) this).field_n) {
            L0: {
              ((cb) this).field_n = ((cb) this).field_n + 1;
              if (((cb) this).field_s < ((cb) this).field_n) {
                ((cb) this).field_n = ((cb) this).field_s;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (((cb) this).field_s < ((cb) this).field_n) {
                ((cb) this).field_n = ((cb) this).field_s;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          field_g = null;
          if (((cb) this).field_f <= ((cb) this).field_n) {
            L2: {
              if (((cb) this).field_s < ((cb) this).field_n) {
                ((cb) this).field_n = ((cb) this).field_s;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ((cb) this).field_n = ((cb) this).field_n + 1;
              if (((cb) this).field_s < ((cb) this).field_n) {
                ((cb) this).field_n = ((cb) this).field_s;
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
        } else {
          L0: {
            if (h.field_L != null) {
              h.field_L.m(-7435);
              break L0;
            } else {
              break L0;
            }
          }
          b.field_c = new qm(param2, param0, false, true, true);
          wj.field_i.a((cf) (Object) b.field_c, (byte) -110);
          return;
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
          field_r = null;
          return 1 + param1;
        } else {
          return 1 + param1;
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        ja var3 = null;
        ja var4 = null;
        ja var4_ref = null;
        int var5 = 0;
        ja var6 = null;
        ja var7 = null;
        ja var8 = null;
        ja var9 = null;
        ja var11 = null;
        ja var13 = null;
        ja var15 = null;
        ja var17 = null;
        ja var19 = null;
        ja var20 = null;
        ja var22 = null;
        ja var24 = null;
        ja var26 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          g.c(((cb) this).field_p);
          var2 = 60 % ((param0 - -53) / 55);
          if (((cb) this).field_t == 0) {
            var3 = fg.field_m;
            break L0;
          } else {
            if (((cb) this).field_t == -2) {
              var3 = nm.field_w;
              break L0;
            } else {
              var3 = ol.field_n;
              break L0;
            }
          }
        }
        if (-20 <= ((cb) this).field_m) {
          if ((((cb) this).field_m ^ -1) > -45) {
            L1: {
              if (!ch.a(((cb) this).field_m, false)) {
                break L1;
              } else {
                var3.g(0, 0, 4202528);
                break L1;
              }
            }
            if (((cb) this).field_s != 0) {
              if (19 <= ((cb) this).field_m) {
                if (32 <= ((cb) this).field_m) {
                  if (((cb) this).field_m > 38) {
                    var15 = wa.field_b[26 + (((cb) this).field_m - 44)];
                    var4 = var15;
                    var4.g((var3.field_x + -var15.field_x) / 2, (var3.field_w - var15.field_w) / 2 + 4);
                    g.d();
                    return;
                  } else {
                    var19 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                    var4 = var19;
                    var4.g((var3.field_x + -var19.field_x) / 2, (var3.field_w - var19.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  var17 = wa.field_b[26 + (((cb) this).field_m - 44)];
                  var4 = var17;
                  var4.g((var3.field_x + -var17.field_x) / 2, (var3.field_w - var17.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                var13 = wa.field_b[((cb) this).field_m];
                var4 = var13;
                var4.g((var3.field_x + -var13.field_x) / 2, (var3.field_w - var13.field_w) / 2 + 4);
                g.d();
                return;
              }
            } else {
              oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
              pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
              g.d();
              return;
            }
          } else {
            if (((cb) this).field_m <= 62) {
              var3.g(0, 0, 1922601);
              if (((cb) this).field_s != 0) {
                if (19 <= ((cb) this).field_m) {
                  if (32 <= ((cb) this).field_m) {
                    if (((cb) this).field_m > 38) {
                      var22 = wa.field_b[26 + (((cb) this).field_m - 44)];
                      var4 = var22;
                      var4.g((var3.field_x + -var22.field_x) / 2, (var3.field_w - var22.field_w) / 2 + 4);
                      g.d();
                      return;
                    } else {
                      var26 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                      var4 = var26;
                      var4.g((var3.field_x + -var26.field_x) / 2, (var3.field_w - var26.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  } else {
                    var24 = wa.field_b[26 + (((cb) this).field_m - 44)];
                    var4 = var24;
                    var4.g((var3.field_x + -var24.field_x) / 2, (var3.field_w - var24.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  var20 = wa.field_b[((cb) this).field_m];
                  var4 = var20;
                  var4.g((var3.field_x + -var20.field_x) / 2, (var3.field_w - var20.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
                g.d();
                return;
              }
            } else {
              if (ch.a(((cb) this).field_m, false)) {
                L2: {
                  var3.g(0, 0, 4202528);
                  if (((cb) this).field_s != 0) {
                    if (19 <= ((cb) this).field_m) {
                      if (32 > ((cb) this).field_m) {
                        var11 = wa.field_b[26 + (((cb) this).field_m - 44)];
                        var4 = var11;
                        var4.g((var3.field_x + -var11.field_x) / 2, (var3.field_w - var11.field_w) / 2 + 4);
                        g.d();
                        return;
                      } else {
                        L3: {
                          if (((cb) this).field_m <= 38) {
                            var4_ref = wa.field_b[-32 + (((cb) this).field_m + 19)];
                            break L3;
                          } else {
                            var4_ref = wa.field_b[26 + (((cb) this).field_m - 44)];
                            break L3;
                          }
                        }
                        var4_ref.g((var3.field_x + -var4_ref.field_x) / 2, (var3.field_w - var4_ref.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
                    } else {
                      var4_ref = wa.field_b[((cb) this).field_m];
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      break L2;
                    }
                  } else {
                    oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
                    break L2;
                  }
                }
                g.d();
                return;
              } else {
                L4: {
                  if (((cb) this).field_s != 0) {
                    L5: {
                      if (19 <= ((cb) this).field_m) {
                        L6: {
                          if (32 > ((cb) this).field_m) {
                            break L6;
                          } else {
                            if (((cb) this).field_m <= 38) {
                              var4_ref = wa.field_b[-32 + (((cb) this).field_m + 19)];
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var4_ref = wa.field_b[26 + (((cb) this).field_m - 44)];
                        break L5;
                      } else {
                        var4_ref = wa.field_b[((cb) this).field_m];
                        break L5;
                      }
                    }
                    var4_ref.g((var3.field_x + -var4_ref.field_x) / 2, (var3.field_w - var4_ref.field_w) / 2 + 4);
                    break L4;
                  } else {
                    oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
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
          if (((cb) this).field_s != 0) {
            if (19 <= ((cb) this).field_m) {
              if (32 <= ((cb) this).field_m) {
                if (((cb) this).field_m > 38) {
                  var7 = wa.field_b[26 + (((cb) this).field_m - 44)];
                  var4 = var7;
                  var4.g((var3.field_x + -var7.field_x) / 2, (var3.field_w - var7.field_w) / 2 + 4);
                  g.d();
                  return;
                } else {
                  var9 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                  var4 = var9;
                  var4.g((var3.field_x + -var9.field_x) / 2, (var3.field_w - var9.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                var8 = wa.field_b[26 + (((cb) this).field_m - 44)];
                var4 = var8;
                var4.g((var3.field_x + -var8.field_x) / 2, (var3.field_w - var8.field_w) / 2 + 4);
                g.d();
                return;
              }
            } else {
              var6 = wa.field_b[((cb) this).field_m];
              var4 = var6;
              var4.g((var3.field_x + -var6.field_x) / 2, (var3.field_w - var6.field_w) / 2 + 4);
              g.d();
              return;
            }
          } else {
            oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
            pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
            g.d();
            return;
          }
        }
    }

    final void a(int param0, int param1) {
        ((cb) this).field_f = ((cb) this).field_n + param1;
        if (param0 != 0) {
            ((cb) this).field_q = -95;
        }
    }

    public cb() {
        ((cb) this).field_k = 70;
        ((cb) this).field_h = 70;
        ((cb) this).field_p = new ja(((cb) this).field_k, ((cb) this).field_h);
    }

    final static void a(int param0, int param1, int param2, pd param3) {
        Object var5 = null;
        e.field_a = param1;
        if (param2 != -8388) {
          var5 = null;
          cb.a(97, false, 53, -73, (ja) null, -43);
          ic.field_g = param0;
          qf.field_c = param3;
          return;
        } else {
          ic.field_g = param0;
          qf.field_c = param3;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = false;
        field_g = "RuneScape clan";
        field_r = "Powerups with this modifier will work even on enemy zombies.";
        field_j = new int[]{2, 4};
        field_o = true;
    }
}
