/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class de {
    int field_d;
    int field_i;
    pf field_g;
    int field_a;
    static int field_j;
    int[] field_k;
    int field_l;
    static bb field_b;
    static int field_n;
    static boolean field_f;
    int field_m;
    static int field_h;
    static aa[] field_e;
    static tf field_c;

    int b(int param0, int param1) {
        if ((this.field_l ^ -1) == -7) {
            if (!(jg.a((byte) 88))) {
                if (!(-3 >= (param1 ^ -1))) {
                    return this.field_d;
                }
                return this.field_i + this.field_d;
            }
        }
        int var3 = -24 % ((-13 - param0) / 37);
        return param1 * this.field_i + this.field_d;
    }

    final static void a(int param0, int param1, int param2, tf param3, int param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        tf var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (t.field_e <= param0) {
                break L1;
              } else {
                param4 = param4 - (-param0 + t.field_e);
                param0 = t.field_e;
                break L1;
              }
            }
            L2: {
              if (t.field_h < param4 + param0) {
                param4 = t.field_h - param0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (t.field_f > param1) {
                param7 = param7 - (-param1 + t.field_f);
                param1 = t.field_f;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (t.field_a >= param7 + param1) {
                break L4;
              } else {
                param7 = -param1 + t.field_a;
                break L4;
              }
            }
            L5: {
              if (param5 == -1) {
                break L5;
              } else {
                field_f = false;
                break L5;
              }
            }
            L6: {
              if (param4 <= 0) {
                break L6;
              } else {
                if ((param7 ^ -1) >= -1) {
                  break L6;
                } else {
                  var21 = param3.a();
                  var30 = t.field_k;
                  var10 = t.field_j;
                  var11 = t.field_d;
                  var29 = new int[4];
                  t.a(var29);
                  param3.c();
                  t.d(var29[0], var29[1], var29[2], var29[3]);
                  var13 = param3.field_F * param1 + param0;
                  var14 = param3.field_F - param4;
                  var25 = var21.field_G;
                  var22 = var25;
                  var15 = var22;
                  var16 = param1;
                  L7: while (true) {
                    if (var16 >= param7 + param1) {
                      var21.b(-param3.field_D, -param3.field_y);
                      t.a(var30, var10, var11);
                      t.b(var29);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var17 = param0;
                      L8: while (true) {
                        if (param4 + param0 <= var17) {
                          var13 = var13 + var14;
                          var16++;
                          continue L7;
                        } else {
                          L9: {
                            var18 = var25[var13];
                            if (var18 != 0) {
                              L10: {
                                L11: {
                                  if (0 >= var17) {
                                    break L11;
                                  } else {
                                    if (-1 == (var15[var13 - 1] ^ -1)) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if ((var16 ^ -1) >= -1) {
                                    break L12;
                                  } else {
                                    if (var15[var13 - param3.field_F] == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                L13: {
                                  if (var17 >= -1 + param3.field_F) {
                                    break L13;
                                  } else {
                                    if (var15[var13 + 1] == 0) {
                                      break L10;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                if (-1 + param3.field_E <= var16) {
                                  break L9;
                                } else {
                                  if (var15[var13 + param3.field_F] != 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              t.c(var17, var16, param6, param2);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var13++;
                          var17++;
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
          L14: {
            var8 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var8);
            stackOut_40_1 = new StringBuilder().append("de.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param3 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L14;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L14;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0);

    final void a(int param0, byte param1, int param2) {
        fi.a(320, param0, param2 + 290, oc.field_S);
        if (param1 >= -82) {
            field_e = (aa[]) null;
        }
        t.a(30, param0 + 20, 580, param2 + 250, 0, 180);
        t.b(30, param0 - -20, 580, 250 + param2, 16777215, 192);
    }

    final void b(byte param0) {
        int discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (this.field_g.field_h <= var2) {
            L1: {
              if (param0 == -71) {
                break L1;
              } else {
                discarded$1 = this.a(27, false);
                break L1;
              }
            }
            return;
          } else {
            if (this.c(param0 + -47, var2)) {
              L2: {
                stackOut_4_0 = this;
                stackOut_4_1 = -125;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (var2 != this.field_g.field_j) {
                  stackOut_6_0 = this;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L2;
                }
              }
              this.a((byte) stackIn_7_1, stackIn_7_2 != 0, var2);
              var2++;
              continue L0;
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (-97 != (ke.field_a ^ -1)) {
            break L0;
          } else {
            if (0 < this.field_g.field_j) {
              if (-3 != (this.field_g.field_j ^ -1)) {
                this.field_g.a(false, 0);
                break L0;
              } else {
                break L0;
              }
            } else {
              this.field_g.a(false, 1);
              break L0;
            }
          }
        }
        L1: {
          if (-98 == (ke.field_a ^ -1)) {
            if (-2 != (this.field_g.field_j ^ -1)) {
              if (-3 != (this.field_g.field_j ^ -1)) {
                this.field_g.a(false, 1);
                break L1;
              } else {
                break L1;
              }
            } else {
              this.field_g.a(false, 0);
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if ((ke.field_a ^ -1) != -100) {
            break L2;
          } else {
            L3: {
              if (0 > this.field_g.field_j) {
                break L3;
              } else {
                if ((this.field_g.field_j ^ -1) >= -2) {
                  this.field_g.a(false, 2);
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            this.field_g.a(false, d.field_c);
            break L2;
          }
        }
        L4: {
          if (-99 == (ke.field_a ^ -1)) {
            if (2 == this.field_g.field_j) {
              this.field_g.a(false, d.field_c);
              break L4;
            } else {
              this.field_g.a(false, 2);
              break L4;
            }
          } else {
            break L4;
          }
        }
        this.field_g.b((byte) -71);
        var2 = 44 / ((param0 - -21) / 50);
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_e = null;
    }

    void a(byte param0, boolean param1, int param2) {
        if (param0 > -116) {
            this.b((byte) 11);
        }
        this.a((byte) 35, oc.field_S, param1, param2);
    }

    void a(int param0, int param1, boolean param2) {
        this.field_g.a(param2, this.a(uf.field_d, bg.field_k, -119), 17068, param1);
        nk.field_i = pa.field_b;
        if (param0 != 2) {
            field_h = -13;
        }
    }

    int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          if (param2 <= -110) {
            break L0;
          } else {
            field_c = (tf) null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_k.length) {
            return -1;
          } else {
            var5 = this.b(-108, var4);
            if (this.c(-113, var4)) {
              if (this.a(var4, (byte) 90) <= param0) {
                if (param0 < this.a(var4, false)) {
                  if (var5 <= param1) {
                    if (param1 < var5 - -this.a(-28071, var4)) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    int a(int param0, int param1) {
        if (param0 != -28071) {
            de.a((byte) -105, true);
        }
        return 30;
    }

    final void a(boolean param0) {
        if (!param0) {
            this.field_d = 59;
        }
        if ((this.field_l ^ -1) == -6) {
            aa.field_p = null;
        }
        if (!((this.field_l ^ -1) != -7)) {
            ca.field_f = null;
        }
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
            this.field_m = -106;
        }
        this.a(we.field_o[7], oc.field_W, (byte) 109, param0);
    }

    final void a(String param0, tf param1, byte param2, boolean param3) {
        if (param2 < 98) {
            return;
        }
        try {
            this.a(param3, param0, param1, -6, 320);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "de.NA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    void c(int param0) {
        bm.field_u.f(0, param0);
        rh.b((byte) -67);
    }

    int a(int param0, boolean param1) {
        if ((this.field_l ^ -1) == -6) {
            if (!jg.a((byte) 78)) {
                return 3 <= param0 ? 380 : 200 - -(200 * param0);
            }
        }
        if (param1) {
            return 50;
        }
        if ((this.field_l ^ -1) == -7) {
            if (!(jg.a((byte) 77))) {
                return 2 <= param0 ? 380 : param0 * 240 + 300;
            }
        }
        return this.field_a;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 28) {
            field_h = -12;
        }
        if (null != he.field_f) {
            he.field_f.a(param1, 0);
        }
    }

    void b(int param0) {
        if (param0 < -35) {
          L0: {
            L1: {
              if (this.field_l != 6) {
                break L1;
              } else {
                if (!jg.a((byte) 84)) {
                  this.a((byte) 81);
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_g.a((byte) -48);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    int a(int param0, byte param1) {
        if (param1 != 90) {
            this.field_a = -74;
        }
        if ((this.field_l ^ -1) == -6) {
            if (!(jg.a((byte) 125))) {
                return param0 >= 3 ? 260 : 200 * param0 + 40;
            }
        }
        if (6 == this.field_l) {
            if (!(jg.a((byte) 66))) {
                return 2 <= param0 ? 260 : 100 - -(240 * param0);
            }
        }
        return this.field_m;
    }

    de(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        try {
            this.field_m = param1;
            this.field_l = param0;
            this.field_i = param4;
            this.field_d = param3;
            this.field_a = param2;
            this.a(param5, (byte) -24);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "de.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void c(byte param0);

    final void a(byte param0, tf param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(we.field_o[this.field_k[param3]], param2, param3, param1, (byte) 89);
              if (param0 == 35) {
                break L1;
              } else {
                field_b = (bb) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("de.VA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_k = param0;
              this.field_g = new pf(this.field_k.length);
              if (param1 == -24) {
                break L1;
              } else {
                this.field_d = 119;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("de.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    boolean c(int param0, int param1) {
        if (param0 >= -112) {
            this.field_i = 64;
            return true;
        }
        return true;
    }

    final void d(byte param0) {
        this.a(120, (byte) -102, 0);
        int var2 = -125 % ((param0 - 5) / 39);
    }

    final void a(String param0, boolean param1, int param2, tf param3, byte param4) {
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
        tf[] var16 = null;
        int var17 = 0;
        int stackIn_27_0 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var17 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = this.field_k[param2];
              if (-9 == (var6_int ^ -1)) {
                L2: {
                  if (-1 == (nc.field_a ^ -1)) {
                    break L2;
                  } else {
                    if (0 == ti.field_t) {
                      break L2;
                    } else {
                      if (-13 == (nc.field_a ^ -1)) {
                        break L2;
                      } else {
                        if ((ti.field_t ^ -1) != -13) {
                          L3: {
                            if (1 == nc.field_a) {
                              break L3;
                            } else {
                              if (ti.field_t == 1) {
                                break L3;
                              } else {
                                L4: {
                                  if (nc.field_a == 2) {
                                    break L4;
                                  } else {
                                    if ((ti.field_t ^ -1) == -3) {
                                      break L4;
                                    } else {
                                      if (nc.field_a == 4) {
                                        break L4;
                                      } else {
                                        if (-5 == (ti.field_t ^ -1)) {
                                          break L4;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                                param0 = mg.field_k;
                                break L1;
                              }
                            }
                          }
                          param0 = mk.field_b;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                param0 = we.field_o[7];
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              L6: {
                var7 = sc.field_h.c(param0);
                var8 = this.a(param2, (byte) 90);
                var9 = this.a(param2, false);
                var10 = this.b(-98, param2);
                if (-21 == (var6_int ^ -1)) {
                  break L6;
                } else {
                  if (21 == var6_int) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              var7 = 120 + h.field_T;
              break L5;
            }
            L7: {
              var11 = -128 % ((param4 - 21) / 46);
              var12 = -var7 + var9 + var8 >> -47685599;
              var13 = this.a(-28071, param2);
              if (!param1) {
                break L7;
              } else {
                fi.a(var9 + var8 >> -170157087, var10 - 2, 35, param3);
                break L7;
              }
            }
            L8: {
              if (!param1) {
                stackOut_26_0 = 2;
                stackIn_27_0 = stackOut_26_0;
                break L8;
              } else {
                stackOut_25_0 = 0;
                stackIn_27_0 = stackOut_25_0;
                break L8;
              }
            }
            L9: {
              var14 = stackIn_27_0;
              if (5 == this.field_l) {
                L10: {
                  L11: {
                    if (-15 != (var6_int ^ -1)) {
                      break L11;
                    } else {
                      if (0 == of.field_a) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((var6_int ^ -1) != -16) {
                      break L12;
                    } else {
                      if (1 == of.field_a) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (16 != var6_int) {
                    break L9;
                  } else {
                    if ((of.field_a ^ -1) == -3) {
                      break L10;
                    } else {
                      break L9;
                    }
                  }
                }
                var14 = 1;
                break L9;
              } else {
                break L9;
              }
            }
            L13: {
              L14: {
                sc.field_h.a(param0, var12, var10 + sc.field_h.field_w, var14, -1);
                if (-21 == (var6_int ^ -1)) {
                  break L14;
                } else {
                  if (var6_int == 21) {
                    break L14;
                  } else {
                    break L13;
                  }
                }
              }
              L15: {
                var12 = var12 + h.field_T;
                t.a(var12, var10 + var13 / 2 - 1, 121, 2, var14);
                if (-21 == (var6_int ^ -1)) {
                  stackOut_44_0 = 120 * ia.field_h / 256;
                  stackIn_45_0 = stackOut_44_0;
                  break L15;
                } else {
                  stackOut_43_0 = wn.field_u * 120 / 256;
                  stackIn_45_0 = stackOut_43_0;
                  break L15;
                }
              }
              var15 = stackIn_45_0;
              var16 = rj.field_C[0].field_a;
              var16[1].f(-7 + (var12 - -var15), 7 + var10);
              break L13;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var6 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var6);
            stackOut_47_1 = new StringBuilder().append("de.BB(");
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param0 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L16;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L16;
            }
          }
          L17: {
            stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, String param1, tf param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        try {
            var6_int = 6;
            var7 = var6_int + sc.field_h.c(param1) - -sn.field_m.field_A;
            var8 = param4 + -(var7 / 2);
            var9 = 420;
            var10 = 2;
            if (param0) {
                fi.a(param4, -7 + var9, 46, param2);
                var10 = 0;
            }
            if (param3 != -6) {
                field_n = -115;
            }
            sn.field_m.b(var8, var9);
            sc.field_h.a(param1, var6_int + var8 + sn.field_m.field_A, var9 - -sc.field_h.field_w, var10, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "de.AB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    void a(int param0, boolean param1, boolean param2) {
        int var6 = 0;
        if (!param1) {
            int[] var7 = (int[]) null;
            this.a((int[]) null, (byte) 12);
        }
        int var4 = param0 * 2;
        int var5 = -129 < (param0 ^ -1) ? 0 : -256 + 2 * param0;
        if (param2) {
            var6 = var4;
            var4 = var5;
            var5 = var6;
        }
        pe.field_b.c();
        this.c(0);
        qa.field_f.a(19692);
        fi.a(pe.field_b.field_G, var4, var5);
    }

    void e(byte param0) {
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (dj.field_c) {
            break L0;
          } else {
            if (ia.field_d) {
              break L0;
            } else {
              L1: while (true) {
                if (!bh.b((byte) 121)) {
                  this.field_g.a(this.a(uo.field_a, ji.field_c, -125), this.a(uf.field_d, bg.field_k, -115), -1);
                  if (-1 == this.field_g.field_j) {
                    break L0;
                  } else {
                    this.a(this.field_g.field_j, (byte) -128, true);
                    break L0;
                  }
                } else {
                  if (ke.field_a == 13) {
                    this.c((byte) -16);
                    continue L1;
                  } else {
                    L2: {
                      if (!bc.field_m[82]) {
                        break L2;
                      } else {
                        if (ke.field_a == 11) {
                          L3: {
                            if (pm.field_u) {
                              stackOut_13_0 = 0;
                              stackIn_14_0 = stackOut_13_0;
                              break L3;
                            } else {
                              stackOut_12_0 = 1;
                              stackIn_14_0 = stackOut_12_0;
                              break L3;
                            }
                          }
                          pm.field_u = stackIn_14_0 != 0;
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    this.b(-36);
                    if (-1 != this.field_g.field_j) {
                      this.a(this.field_g.field_j, (byte) -114, false);
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
        L4: {
          if (param0 <= -64) {
            break L4;
          } else {
            this.field_l = -74;
            break L4;
          }
        }
    }

    void a(int param0, byte param1, boolean param2) {
        pp discarded$2 = null;
        pp discarded$3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        tc var7 = null;
        int var8 = 0;
        int var9 = 0;
        int stackIn_52_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_162_0 = 0;
        Object stackIn_189_0 = null;
        Object stackIn_190_0 = null;
        Object stackIn_191_0 = null;
        int stackIn_191_1 = 0;
        int stackIn_208_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_206_0 = 0;
        Object stackOut_188_0 = null;
        Object stackOut_190_0 = null;
        int stackOut_190_1 = 0;
        Object stackOut_189_0 = null;
        int stackOut_189_1 = 0;
        int stackOut_161_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        L0: {
          var9 = Pixelate.field_H ? 1 : 0;
          if (!this.field_g.a(51)) {
            break L0;
          } else {
            discarded$2 = mc.a(128, -120);
            break L0;
          }
        }
        var4 = this.field_k[param0];
        if (param1 <= -103) {
          L1: {
            var6 = var4;
            if (-1 != (var6 ^ -1)) {
              if (29 != var6) {
                if (-33 != (var6 ^ -1)) {
                  if (-29 == (var6 ^ -1)) {
                    if (!this.field_g.a(74)) {
                      break L1;
                    } else {
                      var6 = param2 ? 1 : 0;
                      la.a(ti.field_t, 16, var6 != 0, -25528);
                      break L1;
                    }
                  } else {
                    if (1 == var6) {
                      if (this.field_g.a(38)) {
                        if (!jg.a((byte) 66)) {
                          var6 = param2 ? 1 : 0;
                          la.a(ti.field_t, -4, var6 != 0, -25528);
                          break L1;
                        } else {
                          ii.a(param2, 0, -4, (byte) 91, te.field_Ib);
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      if (var6 == 2) {
                        if (this.field_g.a(86)) {
                          L2: {
                            var6 = param2 ? 1 : 0;
                            if (!gq.d(107)) {
                              stackOut_73_0 = 0;
                              stackIn_74_0 = stackOut_73_0;
                              break L2;
                            } else {
                              stackOut_72_0 = 12;
                              stackIn_74_0 = stackOut_72_0;
                              break L2;
                            }
                          }
                          la.a(stackIn_74_0, -1, var6 != 0, -25528);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (var6 == 7) {
                          if (this.field_g.a(91)) {
                            var6 = param2 ? 1 : 0;
                            la.a(ti.field_t, 0, var6 != 0, -25528);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          if (24 != var6) {
                            if (-26 == (var6 ^ -1)) {
                              if (!this.field_g.a(74)) {
                                break L1;
                              } else {
                                if (this.c(-119, param0)) {
                                  ((fk) ((Object) oc.field_H[7])).a(param2, 97);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              if (var6 == 26) {
                                if (!this.field_g.a(20)) {
                                  break L1;
                                } else {
                                  if (this.c(-128, param0)) {
                                    ((fk) ((Object) oc.field_H[7])).b(false, param2);
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                }
                              } else {
                                if (-23 == (var6 ^ -1)) {
                                  if (!this.field_g.a(23)) {
                                    break L1;
                                  } else {
                                    var6 = param2 ? 1 : 0;
                                    la.a(ti.field_t, 8, var6 != 0, -25528);
                                    break L1;
                                  }
                                } else {
                                  if (var6 == 5) {
                                    if (this.field_g.a(45)) {
                                      ((fk) ((Object) oc.field_H[7])).a(2, 1, param2);
                                      var6 = param2 ? 1 : 0;
                                      la.a(ti.field_t, 7, var6 != 0, -25528);
                                      break L1;
                                    } else {
                                      break L1;
                                    }
                                  } else {
                                    if (8 != var6) {
                                      if ((var6 ^ -1) != -5) {
                                        if (3 == var6) {
                                          if (this.field_g.a(62)) {
                                            if (this.field_l != 9) {
                                              var6 = param2 ? 1 : 0;
                                              la.a(ti.field_t, 5, var6 != 0, -25528);
                                              break L1;
                                            } else {
                                              L3: {
                                                var6 = param2 ? 1 : 0;
                                                if (!gq.d(75)) {
                                                  stackOut_104_0 = 0;
                                                  stackIn_105_0 = stackOut_104_0;
                                                  break L3;
                                                } else {
                                                  stackOut_103_0 = 12;
                                                  stackIn_105_0 = stackOut_103_0;
                                                  break L3;
                                                }
                                              }
                                              la.a(stackIn_105_0, 5, var6 != 0, -25528);
                                              break L1;
                                            }
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          if (20 == var6) {
                                            L4: {
                                              var5 = 0;
                                              if (!this.field_g.d((byte) -111)) {
                                                break L4;
                                              } else {
                                                if (ia.field_h <= 0) {
                                                  break L4;
                                                } else {
                                                  var5 = 1;
                                                  nk.a((byte) 93, 0);
                                                  break L4;
                                                }
                                              }
                                            }
                                            L5: {
                                              if (!this.field_g.d(-111)) {
                                                break L5;
                                              } else {
                                                if (ia.field_h >= 256) {
                                                  break L5;
                                                } else {
                                                  var5 = 1;
                                                  nk.a((byte) 93, 256);
                                                  break L5;
                                                }
                                              }
                                            }
                                            L6: {
                                              if (this.field_g.c((byte) 35)) {
                                                var6 = this.a(param0, (byte) 90) + this.a(param0, false) + (h.field_T - 120) >> -555598399;
                                                var7_int = -var6 + uf.field_d;
                                                var8 = 256 * var7_int / 120;
                                                var5 = 1;
                                                if ((var8 ^ -1) >= -1) {
                                                  nk.a((byte) 93, 0);
                                                  break L6;
                                                } else {
                                                  if (-257 < (var8 ^ -1)) {
                                                    nk.a((byte) 93, var8);
                                                    break L6;
                                                  } else {
                                                    nk.a((byte) 93, 256);
                                                    break L6;
                                                  }
                                                }
                                              } else {
                                                break L6;
                                              }
                                            }
                                            L7: {
                                              if (!this.field_g.e(-97)) {
                                                break L7;
                                              } else {
                                                if ((ia.field_h ^ -1) >= -1) {
                                                  break L7;
                                                } else {
                                                  var5 = 1;
                                                  sn.e(99);
                                                  break L7;
                                                }
                                              }
                                            }
                                            L8: {
                                              if (!this.field_g.c(102)) {
                                                break L8;
                                              } else {
                                                if ((ia.field_h ^ -1) > -257) {
                                                  var5 = 1;
                                                  tj.i(32);
                                                  break L8;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            if (var5 == 0) {
                                              break L1;
                                            } else {
                                              L9: {
                                                if (!this.field_g.c((byte) 35)) {
                                                  break L9;
                                                } else {
                                                  if (pa.field_b > nk.field_i) {
                                                    break L9;
                                                  } else {
                                                    break L1;
                                                  }
                                                }
                                              }
                                              discarded$3 = mc.a(128, -124);
                                              nk.field_i = pa.field_b - -20;
                                              break L1;
                                            }
                                          } else {
                                            if ((var6 ^ -1) != -22) {
                                              if (-7 == (var6 ^ -1)) {
                                                if (!this.field_g.a(68)) {
                                                  break L1;
                                                } else {
                                                  if (ib.field_f == null) {
                                                    var6 = param2 ? 1 : 0;
                                                    wl.field_b = false;
                                                    var7 = qj.field_e;
                                                    u.a(((jl) ((Object) var7)).field_w + ((jl) ((Object) var7)).field_z, -879, ((jl) ((Object) var7)).field_w, 2, 320, 8, ab.field_c, var7, 240, bi.field_g, 8, var6 != 0);
                                                    break L1;
                                                  } else {
                                                    ln.a(33);
                                                    break L1;
                                                  }
                                                }
                                              } else {
                                                if (var6 != 9) {
                                                  if (-12 != (var6 ^ -1)) {
                                                    if (var6 == 13) {
                                                      if (this.field_g.a(117)) {
                                                        L10: {
                                                          if (md.field_Y) {
                                                            var6 = param2 ? 1 : 0;
                                                            la.a(ti.field_t, -5, var6 != 0, -25528);
                                                            break L10;
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                        if (oa.field_i) {
                                                          qj.a(false, 0, 11);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      if ((var6 ^ -1) == -15) {
                                                        if (this.field_g.a(68)) {
                                                          of.field_a = 0;
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      } else {
                                                        if (var6 != 15) {
                                                          if (-17 == (var6 ^ -1)) {
                                                            if (!this.field_g.a(32)) {
                                                              break L1;
                                                            } else {
                                                              of.field_a = 2;
                                                              break L1;
                                                            }
                                                          } else {
                                                            if ((var6 ^ -1) == -18) {
                                                              if (this.field_g.a(109)) {
                                                                d.field_c = 0;
                                                                break L1;
                                                              } else {
                                                                break L1;
                                                              }
                                                            } else {
                                                              if ((var6 ^ -1) == -19) {
                                                                if (this.field_g.a(32)) {
                                                                  d.field_c = 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if ((var6 ^ -1) != -24) {
                                                                  if ((var6 ^ -1) == -34) {
                                                                    if (!this.field_g.a(40)) {
                                                                      break L1;
                                                                    } else {
                                                                      ((hq) (this)).b((byte) 12, param2);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (var6 != 34) {
                                                                      if (-20 == (var6 ^ -1)) {
                                                                        if (!this.field_g.a(77)) {
                                                                          break L1;
                                                                        } else {
                                                                          d.a(0, ao.a(13867));
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        if (var6 == 27) {
                                                                          if (this.field_g.a(29)) {
                                                                            L11: {
                                                                              if (jc.field_d) {
                                                                                stackOut_207_0 = 0;
                                                                                stackIn_208_0 = stackOut_207_0;
                                                                                break L11;
                                                                              } else {
                                                                                stackOut_206_0 = 1;
                                                                                stackIn_208_0 = stackOut_206_0;
                                                                                break L11;
                                                                              }
                                                                            }
                                                                            jc.field_d = stackIn_208_0 != 0;
                                                                            if (!jc.field_d) {
                                                                              we.field_o[27] = ef.field_c;
                                                                              break L1;
                                                                            } else {
                                                                              we.field_o[27] = kl.field_d;
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            break L1;
                                                                          }
                                                                        } else {
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (!this.field_g.a(28)) {
                                                                        break L1;
                                                                      } else {
                                                                        ((hq) (this)).a(param2, -116);
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (this.field_g.a(106)) {
                                                                    if (-11 != (this.field_l ^ -1)) {
                                                                      L12: {
                                                                        if (this.field_l == 8) {
                                                                          break L12;
                                                                        } else {
                                                                          if (-6 == (this.field_l ^ -1)) {
                                                                            break L12;
                                                                          } else {
                                                                            if (this.field_l != 6) {
                                                                              break L1;
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      gi.a(te.field_Ib, this.field_l, (byte) -126);
                                                                      break L1;
                                                                    } else {
                                                                      L13: {
                                                                        stackOut_188_0 = null;
                                                                        stackIn_190_0 = stackOut_188_0;
                                                                        stackIn_189_0 = stackOut_188_0;
                                                                        if (go.field_k == 0) {
                                                                          stackOut_190_0 = stackIn_190_0;
                                                                          stackOut_190_1 = 5;
                                                                          stackIn_191_0 = stackOut_190_0;
                                                                          stackIn_191_1 = stackOut_190_1;
                                                                          break L13;
                                                                        } else {
                                                                          stackOut_189_0 = stackIn_189_0;
                                                                          stackOut_189_1 = 9;
                                                                          stackIn_191_0 = stackOut_189_0;
                                                                          stackIn_191_1 = stackOut_189_1;
                                                                          break L13;
                                                                        }
                                                                      }
                                                                      gi.a((String) ((Object) stackIn_191_0), stackIn_191_1, (byte) 79);
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (this.field_g.a(30)) {
                                                            of.field_a = 1;
                                                            break L1;
                                                          } else {
                                                            break L1;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (this.field_g.a(95)) {
                                                      L14: {
                                                        ro.field_e.e(6);
                                                        var6 = param2 ? 1 : 0;
                                                        if (!gq.d(71)) {
                                                          stackOut_161_0 = 0;
                                                          stackIn_162_0 = stackOut_161_0;
                                                          break L14;
                                                        } else {
                                                          stackOut_160_0 = 12;
                                                          stackIn_162_0 = stackOut_160_0;
                                                          break L14;
                                                        }
                                                      }
                                                      la.a(stackIn_162_0, -1, var6 != 0, -25528);
                                                      break L1;
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  if (!this.field_g.a(96)) {
                                                    break L1;
                                                  } else {
                                                    ro.field_e.a(false, 250, param2);
                                                    break L1;
                                                  }
                                                }
                                              }
                                            } else {
                                              L15: {
                                                if (this.field_g.d((byte) -94)) {
                                                  jg.a(0, -114);
                                                  break L15;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                              L16: {
                                                if (this.field_g.d(64)) {
                                                  jg.a(256, -54);
                                                  break L16;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                              L17: {
                                                if (this.field_g.c((byte) 35)) {
                                                  var6 = -120 + (this.a(param0, (byte) 90) + (this.a(param0, false) - -h.field_T)) >> -121104095;
                                                  var7_int = uf.field_d + -var6;
                                                  var8 = var7_int * 256 / 120;
                                                  if (var8 <= 0) {
                                                    jg.a(0, -50);
                                                    break L17;
                                                  } else {
                                                    if (256 <= var8) {
                                                      jg.a(256, -63);
                                                      break L17;
                                                    } else {
                                                      jg.a(var8, -109);
                                                      break L17;
                                                    }
                                                  }
                                                } else {
                                                  break L17;
                                                }
                                              }
                                              L18: {
                                                if (this.field_g.e(-97)) {
                                                  fc.a((byte) -65);
                                                  break L18;
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              if (this.field_g.c(102)) {
                                                eg.e(-4767);
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (this.field_g.a(26)) {
                                          var6 = param2 ? 1 : 0;
                                          la.a(ti.field_t, 6, var6 != 0, -25528);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    } else {
                                      if (!this.field_g.a(59)) {
                                        break L1;
                                      } else {
                                        var6 = nc.field_a;
                                        var7_int = param2 ? 1 : 0;
                                        la.a(ti.field_t, var6, var7_int != 0, -25528);
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            if (this.field_g.a(84)) {
                              var6 = param2 ? 1 : 0;
                              la.a(ti.field_t, 12, var6 != 0, -25528);
                              ce.field_a = true;
                              break L1;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (this.field_g.a(109)) {
                    L19: {
                      kj.a(-3 + param0, (byte) 127);
                      var6 = param2 ? 1 : 0;
                      if (!gq.d(90)) {
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L19;
                      } else {
                        stackOut_59_0 = 12;
                        stackIn_61_0 = stackOut_59_0;
                        break L19;
                      }
                    }
                    la.a(stackIn_61_0, -3, var6 != 0, -25528);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (this.field_g.a(6)) {
                  ((op) ((Object) oc.field_H[17])).f(76);
                  var6 = param2 ? 1 : 0;
                  la.a(ti.field_t, 17, var6 != 0, -25528);
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              if (!this.field_g.a(44)) {
                break L1;
              } else {
                L20: {
                  em.a((byte) -101);
                  var6 = param2 ? 1 : 0;
                  if (gq.d(117)) {
                    stackOut_51_0 = 12;
                    stackIn_52_0 = stackOut_51_0;
                    break L20;
                  } else {
                    stackOut_50_0 = 0;
                    stackIn_52_0 = stackOut_50_0;
                    break L20;
                  }
                }
                la.a(stackIn_52_0, -3, var6 != 0, -25528);
                break L1;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        field_b = new bb();
    }
}
