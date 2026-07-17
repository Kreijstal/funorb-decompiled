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
                  field_g = null;
                  if (ma.field_a.field_j != 0) {
                    break L2;
                  } else {
                    if (cf.field_g - -10000L < bl.a((byte) 59)) {
                      ma.field_a.b((byte) -35, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (0 >= ma.field_a.field_j) {
                    break L3;
                  } else {
                    {
                      L4: {
                        ki.field_h.a(0, -100, ma.field_a.field_j, ma.field_a.field_m);
                        cf.field_g = bl.a((byte) 125);
                        break L4;
                      }
                    }
                    ma.field_a.field_j = 0;
                    break L3;
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
        ((cb) this).field_n = ((cb) this).field_q;
        if (param0 != 99) {
            Object var3 = null;
            cb.a(96, 89, 115, (pd) null);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, ja param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int var20 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param2 - param5 << 8) / param4.field_z;
              param3 = param3 + param4.field_r;
              var7 = var6_int * param4.field_r + (param5 << 8);
              param0 = param0 + param4.field_y;
              var8 = param3 - -(param0 * oo.field_b);
              var9 = 0;
              var10 = param4.field_w;
              var11 = param4.field_x;
              var12 = oo.field_b + -var11;
              if (oo.field_e > param0) {
                var14 = oo.field_e - param0;
                var9 = var9 + var14 * var11;
                var8 = var8 + var14 * oo.field_b;
                var10 = var10 - var14;
                param0 = oo.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (param3 >= oo.field_f) {
                break L2;
              } else {
                var14 = oo.field_f + -param3;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var12 = var12 + var14;
                var11 = var11 - var14;
                param3 = oo.field_f;
                var7 = var7 + var6_int * var14;
                var8 = var8 + var14;
                break L2;
              }
            }
            L3: {
              if (var10 + param0 <= oo.field_d) {
                break L3;
              } else {
                var10 = var10 - (-oo.field_d + (var10 + param0));
                break L3;
              }
            }
            L4: {
              if (oo.field_g < param3 + var11) {
                var14 = -oo.field_g + (var11 + param3);
                var12 = var12 + var14;
                var13 = var13 + var14;
                var11 = var11 - var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var11 <= 0) {
                break L5;
              } else {
                if (var10 <= 0) {
                  break L5;
                } else {
                  param0 = -var10;
                  L6: while (true) {
                    if (0 <= param0) {
                      break L0;
                    } else {
                      var14 = var7;
                      param3 = -var11;
                      L7: while (true) {
                        if (0 <= param3) {
                          var9 = var9 + var13;
                          var8 = var8 + var12;
                          param0++;
                          continue L6;
                        } else {
                          L8: {
                            var15 = var14 >> 8;
                            var16 = -var15 + 256;
                            var14 = var14 + var6_int;
                            if (var15 < 0) {
                              var9++;
                              var8++;
                              break L8;
                            } else {
                              L9: {
                                int incrementValue$1 = var9;
                                var9++;
                                var17 = param4.field_B[incrementValue$1];
                                if (var17 == 0) {
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("cb.I(").append(param0).append(44).append(0).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param5 + 41);
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
            int discarded$11 = -117;
            this.a();
            return;
          } else {
            ((cb) this).field_f = 0;
            ((cb) this).field_q = ((cb) this).field_n;
            int discarded$12 = -117;
            this.a();
            return;
          }
        } else {
          ((cb) this).field_s = 0;
          ((cb) this).field_n = 0;
          ((cb) this).field_f = 0;
          ((cb) this).field_q = ((cb) this).field_n;
          int discarded$13 = -117;
          this.a();
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
        try {
            if (!(h.field_L == null)) {
                h.field_L.m(-7435);
            }
            b.field_c = new qm(param2, param0, false, true, true);
            wj.field_i.a((cf) (Object) b.field_c, (byte) -110);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "cb.G(" + (param0 != null ? "{...}" : "null") + 44 + 32 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        param1 = param1 | param1 >>> 4;
        param1 = param1 | param1 >>> 8;
        param1 = param1 | param1 >>> 16;
        if (param0 >= -69) {
          field_r = null;
          return 1 + param1;
        } else {
          return 1 + param1;
        }
    }

    private final void a() {
        int var2 = 0;
        ja var3 = null;
        ja var4 = null;
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
        ja var27 = null;
        ja var28 = null;
        ja var29 = null;
        ja var30 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          g.c(((cb) this).field_p);
          var2 = 0;
          if (((cb) this).field_t == 0) {
            var3 = fg.field_m;
            break L0;
          } else {
            if (((cb) this).field_t == 1) {
              var3 = nm.field_w;
              break L0;
            } else {
              var3 = ol.field_n;
              break L0;
            }
          }
        }
        if (((cb) this).field_m >= 19) {
          if (((cb) this).field_m < 44) {
            if (!ch.a(((cb) this).field_m, false)) {
              L1: {
                if (((cb) this).field_s != 0) {
                  if (19 <= ((cb) this).field_m) {
                    if (32 > ((cb) this).field_m) {
                      var29 = wa.field_b[26 + (((cb) this).field_m - 44)];
                      var4 = var29;
                      var4.g((var3.field_x + -var29.field_x) / 2, (var3.field_w - var29.field_w) / 2 + 4);
                      g.d();
                      return;
                    } else {
                      if (((cb) this).field_m <= 38) {
                        var30 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                        var4 = var30;
                        var4.g((var3.field_x + -var30.field_x) / 2, (var3.field_w - var30.field_w) / 2 + 4);
                        break L1;
                      } else {
                        var28 = wa.field_b[26 + (((cb) this).field_m - 44)];
                        var4 = var28;
                        var4.g((var3.field_x + -var28.field_x) / 2, (var3.field_w - var28.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
                    }
                  } else {
                    var27 = wa.field_b[((cb) this).field_m];
                    var4 = var27;
                    var4.g((var3.field_x + -var27.field_x) / 2, (var3.field_w - var27.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                  pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
                  break L1;
                }
              }
              g.d();
              return;
            } else {
              L2: {
                var3.g(0, 0, 4202528);
                if (((cb) this).field_s != 0) {
                  if (19 <= ((cb) this).field_m) {
                    if (32 > ((cb) this).field_m) {
                      var17 = wa.field_b[26 + (((cb) this).field_m - 44)];
                      var4 = var17;
                      var4.g((var3.field_x + -var17.field_x) / 2, (var3.field_w - var17.field_w) / 2 + 4);
                      g.d();
                      return;
                    } else {
                      if (((cb) this).field_m <= 38) {
                        var19 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                        var4 = var19;
                        var4.g((var3.field_x + -var19.field_x) / 2, (var3.field_w - var19.field_w) / 2 + 4);
                        break L2;
                      } else {
                        var15 = wa.field_b[26 + (((cb) this).field_m - 44)];
                        var4 = var15;
                        var4.g((var3.field_x + -var15.field_x) / 2, (var3.field_w - var15.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
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
                  break L2;
                }
              }
              g.d();
              return;
            }
          } else {
            if (((cb) this).field_m <= 62) {
              L3: {
                var3.g(0, 0, 1922601);
                if (((cb) this).field_s != 0) {
                  if (19 <= ((cb) this).field_m) {
                    if (32 > ((cb) this).field_m) {
                      var24 = wa.field_b[26 + (((cb) this).field_m - 44)];
                      var4 = var24;
                      var4.g((var3.field_x + -var24.field_x) / 2, (var3.field_w - var24.field_w) / 2 + 4);
                      g.d();
                      return;
                    } else {
                      if (((cb) this).field_m <= 38) {
                        var26 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                        var4 = var26;
                        var4.g((var3.field_x + -var26.field_x) / 2, (var3.field_w - var26.field_w) / 2 + 4);
                        break L3;
                      } else {
                        var22 = wa.field_b[26 + (((cb) this).field_m - 44)];
                        var4 = var22;
                        var4.g((var3.field_x + -var22.field_x) / 2, (var3.field_w - var22.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
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
                  break L3;
                }
              }
              g.d();
              return;
            } else {
              if (ch.a(((cb) this).field_m, false)) {
                L4: {
                  var3.g(0, 0, 4202528);
                  if (((cb) this).field_s != 0) {
                    L5: {
                      if (19 <= ((cb) this).field_m) {
                        if (32 <= ((cb) this).field_m) {
                          if (((cb) this).field_m <= 38) {
                            var4 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                            break L5;
                          } else {
                            var4 = wa.field_b[26 + (((cb) this).field_m - 44)];
                            break L5;
                          }
                        } else {
                          var11 = wa.field_b[26 + (((cb) this).field_m - 44)];
                          var4 = var11;
                          var4.g((var3.field_x + -var11.field_x) / 2, (var3.field_w - var11.field_w) / 2 + 4);
                          g.d();
                          return;
                        }
                      } else {
                        var4 = wa.field_b[((cb) this).field_m];
                        break L5;
                      }
                    }
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    break L4;
                  } else {
                    oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
                    break L4;
                  }
                }
                g.d();
                return;
              } else {
                L6: {
                  if (((cb) this).field_s != 0) {
                    L7: {
                      if (19 <= ((cb) this).field_m) {
                        L8: {
                          if (32 > ((cb) this).field_m) {
                            break L8;
                          } else {
                            if (((cb) this).field_m <= 38) {
                              var4 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                              break L7;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var4 = wa.field_b[26 + (((cb) this).field_m - 44)];
                        break L7;
                      } else {
                        var4 = wa.field_b[((cb) this).field_m];
                        break L7;
                      }
                    }
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    break L6;
                  } else {
                    oo.f(5, 5, -10 + ((cb) this).field_k, ((cb) this).field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, ((cb) this).field_k / 2, 32, 16777215, 0, 128);
                    break L6;
                  }
                }
                g.d();
                return;
              }
            }
          }
        } else {
          L9: {
            var3.g(0, 0, 6707010);
            if (((cb) this).field_s != 0) {
              if (19 <= ((cb) this).field_m) {
                if (32 > ((cb) this).field_m) {
                  var8 = wa.field_b[26 + (((cb) this).field_m - 44)];
                  var4 = var8;
                  var4.g((var3.field_x + -var8.field_x) / 2, (var3.field_w - var8.field_w) / 2 + 4);
                  g.d();
                  return;
                } else {
                  if (((cb) this).field_m <= 38) {
                    var9 = wa.field_b[-32 + (((cb) this).field_m + 19)];
                    var4 = var9;
                    var4.g((var3.field_x + -var9.field_x) / 2, (var3.field_w - var9.field_w) / 2 + 4);
                    break L9;
                  } else {
                    var7 = wa.field_b[26 + (((cb) this).field_m - 44)];
                    var4 = var7;
                    var4.g((var3.field_x + -var7.field_x) / 2, (var3.field_w - var7.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
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
              break L9;
            }
          }
          g.d();
          return;
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
        try {
            e.field_a = param1;
            if (param2 != -8388) {
                Object var5 = null;
                cb.a(97, false, 53, -73, (ja) null, -43);
            }
            ic.field_g = param0;
            qf.field_c = param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "cb.H(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
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
