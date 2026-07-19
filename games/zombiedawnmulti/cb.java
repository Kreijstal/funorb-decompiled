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
        int incrementValue$1 = 0;
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
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
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
                      if (var20 == 0) {
                        param3 = -var11;
                        L8: while (true) {
                          L9: {
                            if (0 <= param3) {
                              var9 = var9 + var13;
                              stackOut_34_0 = var8;
                              stackOut_34_1 = var12;
                              stackIn_35_0 = stackOut_34_0;
                              stackIn_35_1 = stackOut_34_1;
                              break L9;
                            } else {
                              var15 = var14 >> -395202744;
                              var16 = -var15 + 256;
                              var14 = var14 + var6_int;
                              stackOut_23_0 = -1;
                              stackOut_23_1 = var15 ^ -1;
                              stackIn_35_0 = stackOut_23_0;
                              stackIn_35_1 = stackOut_23_1;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (var20 != 0) {
                                break L9;
                              } else {
                                L10: {
                                  L11: {
                                    if (stackIn_24_0 < stackIn_24_1) {
                                      var9++;
                                      var8++;
                                      if (var20 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    incrementValue$1 = var9;
                                    var9++;
                                    var17 = param4.field_B[incrementValue$1];
                                    if (var17 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (255 >= var15) {
                                          break L13;
                                        } else {
                                          oo.field_i[var8] = var17;
                                          if (var20 == 0) {
                                            break L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      var18 = oo.field_i[var8];
                                      var19 = (var18 & 16711935) * var16 + var15 * (var17 & 16711935) >> -1174207160 & 16711935;
                                      oo.field_i[var8] = (tq.b(var15 * tq.b(var17, 65280) + var16 * tq.b(var18, 65280), 16711705) >> 1952195688) + var19;
                                      break L12;
                                    }
                                  }
                                  var8++;
                                  break L10;
                                }
                                param3++;
                                continue L8;
                              }
                            }
                          }
                          var8 = stackIn_35_0 + stackIn_35_1;
                          param0++;
                          continue L7;
                        }
                      } else {
                        return;
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
          L14: {
            var6 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) (var6);
            stackOut_37_1 = new StringBuilder().append("cb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param4 == null) {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L14;
            } else {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param5 + ')');
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
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        this.field_m = param2;
        this.field_h = param3;
        this.field_k = 70;
        this.field_p = new ja(this.field_k, this.field_h);
        if (ll.field_k.c(param3 ^ 57, this.field_m)) {
          L0: {
            this.field_s = cr.a(this.field_m, param3 + -193);
            stackOut_10_0 = this;
            stackIn_12_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (ll.field_k.d(this.field_m, 53)) {
              stackOut_12_0 = this;
              stackOut_12_1 = this.field_s;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              break L0;
            } else {
              stackOut_11_0 = this;
              stackOut_11_1 = ll.field_k.field_t[this.field_m];
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L0;
            }
          }
          ((cb) (this)).field_n = stackIn_13_1;
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
          if (ZombieDawnMulti.field_E) {
            L1: {
              this.field_s = cr.a(this.field_m, param3 + -193);
              stackOut_3_0 = this;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (ll.field_k.d(this.field_m, 53)) {
                stackOut_5_0 = this;
                stackOut_5_1 = this.field_s;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L1;
              } else {
                stackOut_4_0 = this;
                stackOut_4_1 = ll.field_k.field_t[this.field_m];
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L1;
              }
            }
            ((cb) (this)).field_n = stackIn_6_1;
            if (this.field_s >= this.field_n) {
              this.field_f = 0;
              this.field_q = this.field_n;
              this.a((byte) -117);
              return;
            } else {
              this.field_n = this.field_s;
              this.field_f = 0;
              this.field_q = this.field_n;
              this.a((byte) -117);
              return;
            }
          } else {
            this.field_f = 0;
            this.field_q = this.field_n;
            this.a((byte) -117);
            return;
          }
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
        int var2 = 0;
        ja var3 = null;
        ja var4 = null;
        int var5 = 0;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            g.c(this.field_p);
            var2 = 60 % ((param0 - -53) / 55);
            if (this.field_t == 0) {
              break L1;
            } else {
              L2: {
                if ((this.field_t ^ -1) == -2) {
                  break L2;
                } else {
                  var3 = ol.field_n;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = nm.field_w;
              if (var5 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var3 = fg.field_m;
          break L0;
        }
        if (-20 >= (this.field_m ^ -1)) {
          if ((this.field_m ^ -1) > -45) {
            L3: {
              if (!ch.a(this.field_m, false)) {
                break L3;
              } else {
                var3.g(0, 0, 4202528);
                if (var5 == 0) {
                  break L3;
                } else {
                  var3.g(0, 0, 1922601);
                  if (this.field_s != 0) {
                    L4: {
                      if (19 <= this.field_m) {
                        break L4;
                      } else {
                        var4 = wa.field_b[this.field_m];
                        if (var5 != 0) {
                          break L4;
                        } else {
                          var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                          g.d();
                          return;
                        }
                      }
                    }
                    if (32 <= this.field_m) {
                      if (this.field_m <= 38) {
                        var4 = wa.field_b[-32 + (this.field_m + 19)];
                        var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                        g.d();
                        return;
                      } else {
                        L5: {
                          var4 = wa.field_b[26 + (this.field_m - 44)];
                          if (var5 == 0) {
                            break L5;
                          } else {
                            var4 = wa.field_b[-32 + (this.field_m + 19)];
                            break L5;
                          }
                        }
                        var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
                    } else {
                      L6: {
                        var4 = wa.field_b[26 + (this.field_m - 44)];
                        if (var5 == 0) {
                          break L6;
                        } else {
                          var4 = wa.field_b[-32 + (this.field_m + 19)];
                          break L6;
                        }
                      }
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  } else {
                    oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                    if (var5 == 0) {
                      g.d();
                      return;
                    } else {
                      L7: {
                        if (19 <= this.field_m) {
                          break L7;
                        } else {
                          var4 = wa.field_b[this.field_m];
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          L10: {
                            if (32 > this.field_m) {
                              break L10;
                            } else {
                              if (this.field_m <= 38) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var4 = wa.field_b[26 + (this.field_m - 44)];
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                        var4 = wa.field_b[-32 + (this.field_m + 19)];
                        break L8;
                      }
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  }
                }
              }
            }
            L11: {
              if (this.field_s != 0) {
                L12: {
                  L13: {
                    if (19 <= this.field_m) {
                      break L13;
                    } else {
                      var4 = wa.field_b[this.field_m];
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (32 > this.field_m) {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      if (var5 == 0) {
                        break L12;
                      } else {
                        break L14;
                      }
                    } else {
                      if (this.field_m <= 38) {
                        break L14;
                      } else {
                        L15: {
                          var4 = wa.field_b[26 + (this.field_m - 44)];
                          if (var5 == 0) {
                            break L15;
                          } else {
                            var4 = wa.field_b[-32 + (this.field_m + 19)];
                            break L15;
                          }
                        }
                        var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                        g.d();
                        return;
                      }
                    }
                  }
                  var4 = wa.field_b[-32 + (this.field_m + 19)];
                  break L12;
                }
                var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                break L11;
              } else {
                oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                if (var5 == 0) {
                  break L11;
                } else {
                  L16: {
                    if (19 <= this.field_m) {
                      break L16;
                    } else {
                      var4 = wa.field_b[this.field_m];
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      if (32 > this.field_m) {
                        var4 = wa.field_b[26 + (this.field_m - 44)];
                        if (var5 == 0) {
                          break L17;
                        } else {
                          break L18;
                        }
                      } else {
                        if (this.field_m <= 38) {
                          break L18;
                        } else {
                          L19: {
                            var4 = wa.field_b[26 + (this.field_m - 44)];
                            if (var5 == 0) {
                              break L19;
                            } else {
                              var4 = wa.field_b[-32 + (this.field_m + 19)];
                              break L19;
                            }
                          }
                          var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                          g.d();
                          return;
                        }
                      }
                    }
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    break L17;
                  }
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              }
            }
            g.d();
            return;
          } else {
            if (this.field_m <= 62) {
              var3.g(0, 0, 1922601);
              if (this.field_s != 0) {
                L20: {
                  if (19 <= this.field_m) {
                    break L20;
                  } else {
                    var4 = wa.field_b[this.field_m];
                    if (var5 != 0) {
                      break L20;
                    } else {
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  }
                }
                if (32 <= this.field_m) {
                  if (this.field_m <= 38) {
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  } else {
                    L21: {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      if (var5 == 0) {
                        break L21;
                      } else {
                        var4 = wa.field_b[-32 + (this.field_m + 19)];
                        break L21;
                      }
                    }
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  L22: {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    if (var5 == 0) {
                      break L22;
                    } else {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                      break L22;
                    }
                  }
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                if (var5 == 0) {
                  g.d();
                  return;
                } else {
                  L23: {
                    if (19 <= this.field_m) {
                      break L23;
                    } else {
                      var4 = wa.field_b[this.field_m];
                      break L23;
                    }
                  }
                  L24: {
                    L25: {
                      L26: {
                        if (32 > this.field_m) {
                          break L26;
                        } else {
                          if (this.field_m <= 38) {
                            break L25;
                          } else {
                            break L26;
                          }
                        }
                      }
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      if (var5 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    break L24;
                  }
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              }
            } else {
              if (ch.a(this.field_m, false)) {
                L27: {
                  var3.g(0, 0, 4202528);
                  if (var5 == 0) {
                    break L27;
                  } else {
                    var3.g(0, 0, 1922601);
                    break L27;
                  }
                }
                L28: {
                  if (this.field_s != 0) {
                    break L28;
                  } else {
                    oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                    pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                    if (var5 != 0) {
                      break L28;
                    } else {
                      g.d();
                      return;
                    }
                  }
                }
                L29: {
                  if (19 <= this.field_m) {
                    break L29;
                  } else {
                    var4 = wa.field_b[this.field_m];
                    if (var5 != 0) {
                      break L29;
                    } else {
                      var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                      g.d();
                      return;
                    }
                  }
                }
                if (32 <= this.field_m) {
                  if (this.field_m <= 38) {
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  } else {
                    L30: {
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      if (var5 == 0) {
                        break L30;
                      } else {
                        var4 = wa.field_b[-32 + (this.field_m + 19)];
                        break L30;
                      }
                    }
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                } else {
                  L31: {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    if (var5 == 0) {
                      break L31;
                    } else {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                      break L31;
                    }
                  }
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  g.d();
                  return;
                }
              } else {
                L32: {
                  L33: {
                    if (this.field_s != 0) {
                      break L33;
                    } else {
                      oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                      pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                      if (var5 == 0) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L34: {
                    L35: {
                      if (19 <= this.field_m) {
                        break L35;
                      } else {
                        var4 = wa.field_b[this.field_m];
                        if (var5 == 0) {
                          break L34;
                        } else {
                          break L35;
                        }
                      }
                    }
                    L36: {
                      L37: {
                        if (32 > this.field_m) {
                          break L37;
                        } else {
                          if (this.field_m <= 38) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                      }
                      var4 = wa.field_b[26 + (this.field_m - 44)];
                      if (var5 == 0) {
                        break L34;
                      } else {
                        break L36;
                      }
                    }
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    break L34;
                  }
                  var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                  break L32;
                }
                g.d();
                return;
              }
            }
          }
        } else {
          var3.g(0, 0, 6707010);
          if (var5 == 0) {
            if (this.field_s != 0) {
              L38: {
                if (19 <= this.field_m) {
                  break L38;
                } else {
                  var4 = wa.field_b[this.field_m];
                  if (var5 != 0) {
                    break L38;
                  } else {
                    var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                    g.d();
                    return;
                  }
                }
              }
              if (32 <= this.field_m) {
                if (this.field_m > 38) {
                  L39: {
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    if (var5 == 0) {
                      break L39;
                    } else {
                      var4 = wa.field_b[-32 + (this.field_m + 19)];
                      break L39;
                    }
                  }
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
                L40: {
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                  if (var5 == 0) {
                    break L40;
                  } else {
                    var4 = wa.field_b[-32 + (this.field_m + 19)];
                    break L40;
                  }
                }
                var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                g.d();
                return;
              }
            } else {
              oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
              pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
              if (var5 != 0) {
                L41: {
                  if (19 <= this.field_m) {
                    break L41;
                  } else {
                    var4 = wa.field_b[this.field_m];
                    break L41;
                  }
                }
                L42: {
                  L43: {
                    L44: {
                      if (32 > this.field_m) {
                        break L44;
                      } else {
                        if (this.field_m <= 38) {
                          break L43;
                        } else {
                          break L44;
                        }
                      }
                    }
                    var4 = wa.field_b[26 + (this.field_m - 44)];
                    if (var5 == 0) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                  var4 = wa.field_b[-32 + (this.field_m + 19)];
                  break L42;
                }
                var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
                g.d();
                return;
              } else {
                g.d();
                return;
              }
            }
          } else {
            L45: {
              L46: {
                if ((this.field_m ^ -1) > -45) {
                  break L46;
                } else {
                  if (this.field_m <= 62) {
                    var3.g(0, 0, 1922601);
                    break L45;
                  } else {
                    break L46;
                  }
                }
              }
              if (!ch.a(this.field_m, false)) {
                break L45;
              } else {
                var3.g(0, 0, 4202528);
                if (var5 == 0) {
                  break L45;
                } else {
                  var3.g(0, 0, 1922601);
                  break L45;
                }
              }
            }
            L47: {
              L48: {
                if (this.field_s != 0) {
                  break L48;
                } else {
                  oo.f(5, 5, -10 + this.field_k, this.field_h + -10, 0, 96);
                  pb.field_e.a(ro.field_N, this.field_k / 2, 32, 16777215, 0, 128);
                  if (var5 == 0) {
                    break L47;
                  } else {
                    break L48;
                  }
                }
              }
              L49: {
                L50: {
                  if (19 <= this.field_m) {
                    break L50;
                  } else {
                    var4 = wa.field_b[this.field_m];
                    if (var5 == 0) {
                      break L49;
                    } else {
                      break L50;
                    }
                  }
                }
                L51: {
                  L52: {
                    if (32 > this.field_m) {
                      break L52;
                    } else {
                      if (this.field_m <= 38) {
                        break L51;
                      } else {
                        break L52;
                      }
                    }
                  }
                  var4 = wa.field_b[26 + (this.field_m - 44)];
                  if (var5 == 0) {
                    break L49;
                  } else {
                    break L51;
                  }
                }
                var4 = wa.field_b[-32 + (this.field_m + 19)];
                break L49;
              }
              var4.g((var3.field_x + -var4.field_x) / 2, (var3.field_w - var4.field_w) / 2 + 4);
              break L47;
            }
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
