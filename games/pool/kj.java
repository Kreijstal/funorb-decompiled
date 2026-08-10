/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kj {
    static sa[] field_g;
    int field_k;
    static int field_m;
    static int field_b;
    int field_n;
    int field_d;
    static int field_j;
    int field_e;
    int field_h;
    static String field_l;
    static String[] field_i;
    static vh field_a;
    static volatile int field_c;
    static int field_f;

    public static void b(int param0) {
        field_l = null;
        field_a = null;
        field_g = null;
        field_i = null;
        if (param0 != -9379) {
            field_j = -47;
        }
    }

    final kj a(int param0) {
        if (param0 != -14513) {
            return (kj) null;
        }
        return new kj(this.field_n, this.field_h, this.field_k, this.field_d, this.field_e);
    }

    final void a(mm param0, pq param1, byte param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
            var4_int = param1.field_g >> -596930995;
            var5 = param1.field_k >> 1565632333;
            var6 = (int)(8.0 * param0.field_a + 0.5);
            var7 = (int)(0.5 + param0.field_d * 8.0);
            this.field_h = tj.c(-var4_int + var7, var6 + -var5, 4096) >> -442181854;
            int var8 = -57 % ((param2 - 66) / 54);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kj.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(byte param0) {
        this.field_n = -1;
        if (param0 < 61) {
            kj.a((byte) 30);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            pq var3 = (pq) null;
            this.a((mm) null, (pq) null, (byte) 16);
        }
        return 0 <= this.field_n ? true : false;
    }

    final void a(ge param0, byte param1) {
        if (param1 < 67) {
            return;
        }
        try {
            param0.a((byte) -81, this.field_n);
            param0.a((byte) -81, this.field_h & 2047);
            param0.a((byte) -81, this.field_k);
            param0.a(this.field_d, false);
            param0.a(this.field_e, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, oc param2, int param3, int param4, int param5, int param6, int param7) {
        int stackIn_14_0 = 0;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        nj stackIn_38_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        nj var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int[] var40 = null;
        int var43 = 0;
        oc var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        try {
          L0: {
            L1: {
              L2: {
                var44 = param2;
                if (var44.field_K == null) {
                  break L2;
                } else {
                  if (var44.field_I > 1) {
                    var60 = var44.field_K;
                    ko.a(wa.field_ib, 0, var60, 0, -147296924);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              bo.a(-94);
              break L1;
            }
            var54 = new int[param2.field_o];
            var49 = var54;
            var40 = var49;
            var8 = var40;
            var64 = new int[param2.field_o];
            var61 = oj.field_r;
            var62 = wa.field_mb;
            var63 = al.field_g;
            var13 = 0;
            L3: while (true) {
              if (param2.field_o <= var13) {
                L4: {
                  if (param1 == 8355711) {
                    break L4;
                  } else {
                    field_f = -76;
                    break L4;
                  }
                }
                var43 = 0;
                var13 = var43;
                L5: while (true) {
                  if (var43 >= eh.field_x) {
                    break L0;
                  } else {
                    L6: {
                      var14 = tl.field_I[var43];
                      var15 = param2.field_y[var14];
                      var16 = param2.field_r[var14];
                      var17 = param2.field_u[var14];
                      if (param2.field_x[var14] >= oj.field_r.length) {
                        stackIn_25_0 = -1;
                        break L6;
                      } else {
                        stackIn_25_0 = param2.field_x[var14];
                        break L6;
                      }
                    }
                    L7: {
                      var18 = stackIn_25_0;
                      if (oj.field_r.length > param2.field_w[var14]) {
                        stackIn_28_0 = param2.field_w[var14];
                        break L7;
                      } else {
                        stackIn_28_0 = -1;
                        break L7;
                      }
                    }
                    L8: {
                      var19 = stackIn_28_0;
                      if (param2.field_O[var14] < oj.field_r.length) {
                        stackIn_31_0 = param2.field_O[var14];
                        break L8;
                      } else {
                        stackIn_31_0 = -1;
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        var20 = stackIn_31_0;
                        if (null == cf.field_a) {
                          break L10;
                        } else {
                          if (null == param2.field_H) {
                            break L10;
                          } else {
                            if (param2.field_H.length <= var14) {
                              break L10;
                            } else {
                              if (param2.field_H[var14] == -1) {
                                break L10;
                              } else {
                                if (param2.field_H[var14] >= cf.field_a.length) {
                                  break L10;
                                } else {
                                  stackIn_38_0 = cf.field_a[param2.field_H[var14]];
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackIn_38_0 = null;
                      break L9;
                    }
                    L11: {
                      L12: {
                        var21 = stackIn_38_0;
                        var22 = ch.field_M[var15];
                        var23 = li.field_h[var15];
                        var24 = ch.field_M[var16];
                        var25 = li.field_h[var16];
                        var26 = ch.field_M[var17];
                        var27 = li.field_h[var17];
                        if (var19 != var18) {
                          break L12;
                        } else {
                          if (var19 != var20) {
                            break L12;
                          } else {
                            L13: {
                              var28 = var54[var18];
                              var29 = var64[var18];
                              if (var21 == null) {
                                stackIn_43_0 = 8355711;
                                break L13;
                              } else {
                                stackIn_43_0 = var21.field_a;
                                break L13;
                              }
                            }
                            var30 = stackIn_43_0;
                            var31 = var30 & 16711935;
                            var32 = var30 & 65280;
                            var33 = (-16711742 & var31 * var28) >>> 768236168 | 922812160 & var32 * var28 >>> -1709030136;
                            var33 = var33 + 65793 * var29;
                            dp.a(var24, var27, var23, var25, var26, var33 >> -1579306719 & 8355711, 108, var22);
                            break L11;
                          }
                        }
                      }
                      L14: {
                        var28 = var54[var18];
                        var29 = var54[var19];
                        var30 = var54[var20];
                        var31 = var64[var18];
                        var32 = var64[var19];
                        var33 = var64[var20];
                        if (var21 != null) {
                          stackIn_47_0 = var21.field_a;
                          break L14;
                        } else {
                          stackIn_47_0 = 8355711;
                          break L14;
                        }
                      }
                      var34 = stackIn_47_0;
                      var35 = var34 & 16711935;
                      var36 = 65280 & var34;
                      var37 = 2130771712 & var36 * var28 >>> 349982920 | (var35 * var28 & -16711742) >>> 1515875592;
                      var38 = (var36 * var29 & 16711777) >>> 276023848 | -83951361 & var29 * var35 >>> -1185598168;
                      var37 = var37 + var31 * 65793;
                      var39 = (16711913 & var36 * var30) >>> -762119768 | -755040001 & var30 * var35 >>> -1060456088;
                      var38 = var38 + var32 * 65793;
                      var39 = var39 + 65793 * var33;
                      ta.a((byte) -125, var27, var22, 255 & var37, var39 >> -1913183984, var38 >> -1089064216 & 255, var23, var38 >> -240642800, (var39 & 65528) >> -1110945816, var37 >> 1191002728 & 255, var38 & 255, var24, var37 >> -812058832, var25, var26, 255 & var39);
                      break L11;
                    }
                    var43++;
                    continue L5;
                  }
                }
              } else {
                L15: {
                  var14 = var61[var13] * param7 + (param3 * var62[var13] + param5 * var63[var13]) >> -814503096;
                  if (0 <= var14) {
                    break L15;
                  } else {
                    var14 = -var14;
                    break L15;
                  }
                }
                L16: {
                  if ((var14 ^ -1) <= -1) {
                    if (var14 >= 128) {
                      stackIn_14_0 = 256;
                      break L16;
                    } else {
                      stackIn_14_0 = var14 + 128;
                      break L16;
                    }
                  } else {
                    stackIn_14_0 = 128;
                    break L16;
                  }
                }
                L17: {
                  var14 = stackIn_14_0;
                  var15 = param4 * var62[var13] + param6 * var61[var13] - -(var63[var13] * param0) >> 1656855880;
                  stackIn_16_0 = cp.field_d;

                  if ((var15 ^ -1) <= -1) {
                    stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                    stackIn_17_1 = var15;
                    break L17;
                  } else {
                    stackIn_17_0 = (int[]) ((Object) stackIn_16_0);
                    stackIn_17_1 = -var15;
                    break L17;
                  }
                }
                var15 = stackIn_17_0[stackIn_17_1];
                var14 = (-var15 + 256) * var14 >>> -1373201944;
                var54[var13] = var14;
                var64[var13] = var15;
                var13++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var8_ref = decompiledCaughtException;
            stackIn_52_0 = (RuntimeException) (var8_ref);

            stackIn_52_1 = new StringBuilder().append("kj.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "null";
              break L18;
            } else {
              stackIn_53_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackIn_53_2 = "{...}";
              break L18;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void a(byte param0) {
        uh.a(-124, ub.field_n, uo.field_Lb, dg.field_J, tq.field_m);
        if (param0 > -97) {
            oc var2 = (oc) null;
            kj.a(-66, 60, (oc) null, -82, -71, 60, 97, 51);
        }
    }

    final void c(int param0, kj param1) {
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (this.field_n == param1.field_n) {
                break L1;
              } else {
                L2: {
                  var3_int = param1.field_n - this.field_n;
                  if (8 <= var3_int) {
                    break L2;
                  } else {
                    if (7 <= (var3_int ^ -1)) {
                      break L2;
                    } else {
                      this.field_n = param1.field_n;
                      break L1;
                    }
                  }
                }
                this.field_n = this.field_n + var3_int / 8;
                break L1;
              }
            }
            if (param0 == 255) {
              L3: {
                if (this.field_h != param1.field_h) {
                  L4: {
                    var3_int = -this.field_h + param1.field_h;
                    if ((var3_int ^ -1) < -1025) {
                      var3_int -= 2048;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (1023 < (var3_int ^ -1)) {
                      var3_int += 2048;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if ((var3_int ^ -1) <= -9) {
                        break L7;
                      } else {
                        if ((var3_int ^ -1) < 7) {
                          this.field_h = param1.field_h;
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    this.field_h = this.field_h + var3_int / 8;
                    break L6;
                  }
                  this.field_h = this.field_h & 2047;
                  break L3;
                } else {
                  break L3;
                }
              }
              L8: {
                if (this.field_k != param1.field_k) {
                  L9: {
                    var3_int = param1.field_k - this.field_k;
                    if (var3_int >= 8) {
                      break L9;
                    } else {
                      if (var3_int > -8) {
                        this.field_k = param1.field_k;
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_k = this.field_k + var3_int / 8;
                  break L8;
                } else {
                  break L8;
                }
              }
              L10: {
                if (this.field_d != param1.field_d) {
                  L11: {
                    var3_int = -this.field_d + param1.field_d;
                    if (8 <= var3_int) {
                      break L11;
                    } else {
                      if (var3_int <= -8) {
                        break L11;
                      } else {
                        this.field_d = param1.field_d;
                        break L10;
                      }
                    }
                  }
                  this.field_d = this.field_d + var3_int / 8;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (this.field_e == param1.field_e) {
                  break L12;
                } else {
                  L13: {
                    var3_int = param1.field_e + -this.field_e;
                    if (var3_int >= 8) {
                      break L13;
                    } else {
                      if (-8 < var3_int) {
                        this.field_e = param1.field_e;
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  this.field_e = this.field_e + var3_int / 8;
                  break L12;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var3);

            stackIn_44_1 = new StringBuilder().append("kj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L14;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L14;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, dd param1) {
        try {
            uc.a((byte) 90);
            qh.a(param1.field_D, param1.field_w, param1.field_y);
            if (param0 < 38) {
                dd var3 = (dd) null;
                kj.a(30, (dd) null);
            }
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kj.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0, kj param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2043) {
                break L1;
              } else {
                field_j = -19;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_n != this.field_n) {
                  break L3;
                } else {
                  if (param1.field_h != this.field_h) {
                    break L3;
                  } else {
                    if (param1.field_k != this.field_k) {
                      break L3;
                    } else {
                      if (this.field_d != param1.field_d) {
                        break L3;
                      } else {
                        if (param1.field_e != this.field_e) {
                          break L3;
                        } else {
                          stackIn_9_0 = 1;
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_9_0 = 0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("kj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final void a(int param0, ge param1) {
        this.field_n = param1.d(-1034);
        this.field_h = param1.d(-1034);
        this.field_k = param1.d(param0 ^ -64266);
        if (param0 != 65280) {
            return;
        }
        try {
            this.field_d = param1.e((byte) 105);
            this.field_e = param1.e((byte) 105);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kj.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, kj param1) {
        try {
            this.field_h = param1.field_h;
            this.field_d = param1.field_d;
            this.field_n = param1.field_n;
            this.field_k = param1.field_k;
            if (param0 < 21) {
                oc var4 = (oc) null;
                kj.a(63, -58, (oc) null, 93, 55, 29, 35, -81);
            }
            this.field_e = param1.field_e;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    kj() {
        this.field_d = 0;
        this.field_k = 576;
        this.field_e = 0;
        this.field_h = 0;
        this.field_n = 2048;
    }

    private kj(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = param0;
        this.field_d = param3;
        this.field_k = param2;
        this.field_h = param1;
        this.field_e = param4;
    }

    static {
        int var0 = 0;
        field_g = new sa[512];
        field_l = "Potting the rest of your group for you.";
        field_i = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        for (var0 = 0; field_g.length > var0; var0++) {
            field_g[var0] = new sa();
        }
        field_c = 0;
        field_f = 479232;
    }
}
