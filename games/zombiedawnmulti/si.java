/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends nc {
    private int[] field_y;
    private int field_x;
    private int field_v;
    private int field_m;
    private int[] field_r;
    private int field_E;
    private int field_n;
    private int[] field_A;
    private int field_p;
    private int field_w;
    static double field_C;
    static String field_D;
    private cb[] field_u;
    private int field_s;
    private String field_l;
    private kb field_z;
    private int field_t;
    private int field_B;
    private int field_q;
    private boolean field_o;

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        int stackIn_9_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == -118) {
          L0: {
            var4 = this.field_j.length;
            if (var4 == 1) {
              var3 = 1;
              break L0;
            } else {
              if (-3 != (var4 ^ -1)) {
                var3 = param1;
                break L0;
              } else {
                L1: {
                  if (0 == param1) {
                    stackIn_9_0 = 0;
                    break L1;
                  } else {
                    stackIn_9_0 = 2;
                    break L1;
                  }
                }
                var3 = stackIn_9_0;
                break L0;
              }
            }
          }
          var4 = var3;
          if (0 == var4) {
            return 50;
          } else {
            if (1 != var4) {
              if (-3 != (var4 ^ -1)) {
                return super.a((byte) -118, param1);
              } else {
                return 430;
              }
            } else {
              return 240;
            }
          }
        } else {
          return 5;
        }
    }

    final void a(int param0, int param1, int param2, int[] param3, kb param4) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int[] stackIn_14_1 = null;
        int stackIn_21_0 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        rp var13 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_t = param0;
              this.field_B = param1;
              this.field_x = 50;
              this.field_z = param4;
              we.field_g[42] = u.field_j;
              this.field_q = param2;
              we.field_g[43] = ec.field_a;
              this.field_n = 0;
              stackIn_3_0 = this;

              if (-1 >= (fb.field_e.field_M ^ -1)) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((si) (this)).field_o = stackIn_4_1 != 0;
              if (fb.field_e.field_M != this.field_q) {
                if (!this.field_o) {
                  this.field_l = gf.field_c;
                  break L2;
                } else {
                  this.field_l = "";
                  break L2;
                }
              } else {
                this.field_l = nh.field_h;
                break L2;
              }
            }
            L3: {
              gj.a(6962);
              if (this.field_o) {
                this.field_j = cq.field_c;
                break L3;
              } else {
                L4: {
                  L5: {
                    stackIn_13_0 = this;

                    if (!this.field_z.field_i) {
                      break L5;
                    } else {
                      stackIn_13_0 = this;

                      if (this.field_t <= 0) {
                        break L5;
                      } else {
                        stackIn_14_0 = this;
                        stackIn_14_1 = ga.field_s;
                        break L4;
                      }
                    }
                  }
                  stackIn_14_0 = this;
                  stackIn_14_1 = wk.field_L;
                  break L4;
                }
                ((si) (this)).field_j = stackIn_14_1;
                break L3;
              }
            }
            this.field_g.a(-9049, true, this.a(-6003, bo.field_d, bd.field_g));
            this.field_g.field_c = this.field_j.length;
            this.field_y = (int[]) ((Object) param3.clone());
            var6_int = 0;
            L6: while (true) {
              if (this.field_y.length <= var6_int) {
                this.field_w = 1;
                this.field_p = this.field_z.field_H * 20 / 1000;
                this.field_A = new int[this.field_y.length];
                var6_int = 0;
                L7: while (true) {
                  if (var6_int >= param3.length) {
                    L8: {
                      this.field_v = 0;
                      if (!gf.field_h) {
                        var13 = ll.field_k;
                        var7 = var13.g((byte) -32);
                        var8 = 0;
                        L9: while (true) {
                          if (var7 <= var8) {
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= 3) {
                                if (0 < this.field_v) {
                                  this.field_r = new int[this.field_v];
                                  var8 = this.field_t;
                                  var9 = 0;
                                  L11: while (true) {
                                    if (var9 >= this.field_v) {
                                      th.b((byte) -61);
                                      break L8;
                                    } else {
                                      var10 = var8 / (this.field_v - var9);
                                      var11 = this.field_u[var9].field_m;
                                      ll.field_k.a(-126, var10, var11);
                                      this.field_u[var9].a(0, var10);
                                      var8 = var8 - var10;
                                      this.field_r[var9] = var10;
                                      var9++;
                                      continue L11;
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              } else {
                                L12: {
                                  if (255 != ll.field_k.field_s[var8]) {
                                    this.e(ll.field_k.field_s[var8], 4);
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var8++;
                                continue L10;
                              }
                            }
                          } else {
                            L13: {
                              if (ll.field_k.field_m[var8] != 255) {
                                this.e(ll.field_k.field_m[var8], param1 + 4);
                                if (255 != ll.field_k.field_g[var8]) {
                                  this.e(ll.field_k.field_g[var8], 4);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              } else {
                                break L13;
                              }
                            }
                            var8++;
                            continue L9;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    break L0;
                  } else {
                    L14: {
                      var7 = this.field_y[var6_int];
                      stackIn_29_0 = this;

                      if (var7 < this.field_w) {
                        stackIn_30_0 = this;
                        stackIn_30_1 = this.field_w;
                        break L14;
                      } else {
                        stackIn_30_0 = this;
                        stackIn_30_1 = var7;
                        break L14;
                      }
                    }
                    ((si) (this)).field_w = stackIn_30_1;
                    this.field_A[var6_int] = var6_int;
                    var8 = -1 + var6_int;
                    L15: while (true) {
                      L16: {
                        if ((var8 ^ -1) > -1) {
                          break L16;
                        } else {
                          if (this.field_y[var6_int] < this.field_y[this.field_A[var8]]) {
                            break L16;
                          } else {
                            this.field_A[var8 + 1] = this.field_A[var8];
                            var8--;
                            continue L15;
                          }
                        }
                      }
                      this.field_A[var8 - -1] = var6_int;
                      var6_int++;
                      continue L7;
                    }
                  }
                }
              } else {
                L17: {
                  if (-1 == (1 << var6_int & this.field_z.field_F ^ -1)) {
                    stackIn_21_0 = 0;
                    break L17;
                  } else {
                    stackIn_21_0 = 1;
                    break L17;
                  }
                }
                L18: {
                  var7 = stackIn_21_0;
                  if (var7 != 0) {
                    this.field_y[var6_int] = 0;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                var6_int++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var6 = decompiledCaughtException;
            stackIn_60_0 = (RuntimeException) (var6);

            stackIn_60_1 = new StringBuilder().append("si.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L19;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param4 == null) {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L20;
            } else {
              stackIn_61_0 = (RuntimeException) ((Object) stackIn_61_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L20;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_61_0), stackIn_64_2 + ')');
        }
    }

    private final String e(int param0) {
        if (param0 >= -85) {
            return (String) null;
        }
        int var2 = this.field_p / 60;
        int var3 = this.field_p % 60;
        return var2 + ":" + (10 > var3 ? "0" : "") + var3;
    }

    final static void a(boolean param0, boolean param1, ul param2, ul param3, ul param4) {
        try {
            tg.field_g = tg.a("", !param0 ? true : false);
            tg.field_g.a(-17853, param0);
            qe.a(param4, -8995, param3, param2);
            dg.i(4);
            id.field_B = mp.field_b;
            ta.field_hb = mp.field_b;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "si.P(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1) {
        if (param1 != 23697) {
            return 127;
        }
        return 430;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        int var6;
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        L0: {
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -64) {
            break L0;
          } else {
            this.field_v = -63;
            break L0;
          }
        }
        L1: {
          var4 = this.field_j[param2];
          var5 = var4;
          if ((var5 ^ -1) == -44) {
            if (this.field_g.c(-85)) {
              if (!this.field_o) {
                L2: {
                  if (this.field_B != 0) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                L3: {


                  if ((this.field_n ^ -1) >= -1) {

                    stackIn_15_1 = 0;
                    break L3;
                  } else {

                    stackIn_15_1 = 1;
                    break L3;
                  }
                }
                if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
                  this.b(false, 1);
                  break L1;
                } else {
                  this.b(false, 0);
                  break L1;
                }
              } else {
                return;
              }
            } else {
              break L1;
            }
          } else {
            if ((var5 ^ -1) == -43) {
              if (this.field_g.c(-85)) {
                ma.field_a.b((byte) -35, 61);
                break L1;
              } else {
                break L1;
              }
            } else {
              super.b(-110, param1, param2);
              break L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, byte[] param2, int[] param3, int param4) {
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        byte dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                field_C = 1.243267543236342;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (hl.field_e.length <= var5_int) {
                break L0;
              } else {
                param4 = hl.field_e[var5_int];
                var6 = var5_int << -179841596;
                L3: while (true) {
                  incrementValue$5 = param4;
                  param4--;
                  if (0 == incrementValue$5) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$6 = var6;
                    var6++;
                    param0 = ah.field_f[incrementValue$6];
                    dupTemp$7 = param2[param0];
                    dupTemp$8 = param3[dupTemp$7];
                    param3[dupTemp$7] = dupTemp$8 + 1;
                    ah.field_f[dupTemp$8] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("si.CA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    si(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, wk.field_L);
        int var8_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        this.field_B = 0;
        try {
          L0: {
            this.field_u = new cb[13];
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= this.field_u.length) {
                break L0;
              } else {
                this.field_u[var8_int] = new cb();
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var8);

            stackIn_7_1 = new StringBuilder().append("si.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void a(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        sl stackIn_33_0;
        String stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        sl stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        sl stackIn_40_0;
        String stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        sl stackIn_41_0;
        String stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        int stackIn_41_4;
        int stackIn_45_0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        int stackIn_45_4;
        int stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_46_4;
        int stackIn_46_5;
        int stackIn_51_0 = 0;
        ef stackIn_61_0;
        String stackIn_61_1;
        int stackIn_61_2;
        int stackIn_61_3;
        ef stackIn_62_0;
        String stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_62_4;
        int stackIn_83_0 = 0;
        int stackIn_95_0 = 0;
        ef stackIn_108_0;
        String stackIn_108_1;
        int stackIn_108_2;
        int stackIn_108_3;
        ef stackIn_109_0 = null;
        String stackIn_109_1 = null;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        int stackIn_109_4 = 0;
        ef stackIn_115_0;
        String stackIn_115_1;
        int stackIn_115_2;
        int stackIn_115_3;
        ef stackIn_116_0;
        String stackIn_116_1;
        int stackIn_116_2;
        int stackIn_116_3;
        int stackIn_116_4;
        ef stackIn_131_0;
        String stackIn_131_1;
        int stackIn_131_2;
        int stackIn_131_3;
        ef stackIn_132_0;
        String stackIn_132_1;
        int stackIn_132_2;
        int stackIn_132_3;
        int stackIn_132_4;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8_int;
        int[] var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        ja var25;
        int var26;
        L0: {
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          super.a(param0);
          var2 = 378;
          var3 = 0;
          var4 = ah.field_e.field_C + ah.field_e.field_r;
          this.field_E = 255;
          if (this.field_n == 0) {
            stackIn_3_0 = 255;
            break L0;
          } else {
            stackIn_3_0 = this.field_n * 255 / 33;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = stackIn_3_0;
            if (0 == this.field_B) {
              break L2;
            } else {
              if (this.field_n <= 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (this.field_B == 0) {
              stackIn_9_0 = var5;
              break L3;
            } else {
              stackIn_9_0 = 255 - var5;
              break L3;
            }
          }
          var6 = stackIn_9_0;
          var7 = 94;
          if (null == this.field_l) {
            return;
          } else {
            L4: {
              qp.field_w.a(dj.field_o, 90, 134, 16777215, 1, var6);
              qp.field_w.a(qm.field_N, 478, 134, 16777215, 1, var6);
              var8_int = 555;
              if (this.field_z.field_i) {
                qp.field_w.a(th.field_d, var8_int, 122, 16777215, 1, var6);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              qp.field_w.a(bo.field_c, var8_int, 134, 16777215, 1, var6);
              var7 = var7 + (-5 + (1 - -pb.field_e.a(this.field_l, 0, 90, 640, 240, 65280, var3, var6, 1, 0, 30)) * var4);
              if (205 <= var7) {
                break L5;
              } else {
                var7 = 205;
                break L5;
              }
            }
            var9 = qb.field_h.field_e;
            var10 = 150;
            var11 = 0;
            var12 = 0;
            L6: while (true) {
              if (var12 >= this.field_z.field_t) {
                L7: {
                  var7 = var7 + (1 + var4);
                  if (!this.field_o) {
                    pb.field_e.a(vl.a(wi.field_o, new String[]{this.e(-95)}, 2), 320, 380, 16556032, var3, var6);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (-1 <= (this.field_n ^ -1)) {
                    var7 = var2;
                    break L8;
                  } else {
                    var7 = (255 - var6) * 120 / 256 + var6 * var2 / 256;
                    break L8;
                  }
                }
                L9: {
                  if (this.field_o) {
                    break L9;
                  } else {
                    if (this.field_z.field_i) {
                      pb.field_e.a(vl.a(ig.field_g, new String[]{Integer.toString(this.field_t)}, 2), 320, 365, 16776960, var3, var6);
                      break L9;
                    } else {
                      pb.field_e.a(aa.field_p, 320, 410, 16777096, var3, var6);
                      break L9;
                    }
                  }
                }
                this.f(var6, 96);
                break L1;
              } else {
                L10: {
                  var13 = this.field_A[var12];
                  if (wp.field_h.field_M != var13) {
                    stackIn_22_0 = 0;
                    break L10;
                  } else {
                    stackIn_22_0 = 1;
                    break L10;
                  }
                }
                L11: {
                  var14 = stackIn_22_0;
                  var15 = var9 * this.field_y[var13] / this.field_w;
                  if (-1 == (this.field_z.field_F & 1 << var13 ^ -1)) {
                    stackIn_25_0 = 0;
                    break L11;
                  } else {
                    stackIn_25_0 = 1;
                    break L11;
                  }
                }
                L12: {
                  var16 = stackIn_25_0;
                  if (-1 == (op.field_m.field_j & 1 << var13 ^ -1)) {
                    stackIn_28_0 = 0;
                    break L12;
                  } else {
                    stackIn_28_0 = 1;
                    break L12;
                  }
                }
                L13: {
                  var17 = stackIn_28_0;
                  if (var9 >= var15) {
                    stackIn_31_0 = var15;
                    break L13;
                  } else {
                    stackIn_31_0 = var9;
                    break L13;
                  }
                }
                L14: {
                  var15 = stackIn_31_0;
                  stackIn_33_0 = ah.field_e;

                  stackIn_33_1 = this.field_z.field_b[var13];

                  stackIn_33_2 = 280;

                  stackIn_33_3 = var10;

                  if (var14 == 0) {
                    stackIn_34_0 = (sl) ((Object) stackIn_33_0);
                    stackIn_34_1 = (String) ((Object) stackIn_33_1);
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = 6;
                    break L14;
                  } else {
                    stackIn_34_0 = (sl) ((Object) stackIn_33_0);
                    stackIn_34_1 = (String) ((Object) stackIn_33_1);
                    stackIn_34_2 = stackIn_33_2;
                    stackIn_34_3 = stackIn_33_3;
                    stackIn_34_4 = 0;
                    break L14;
                  }
                }
                L15: {
                  ((sl) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, var3, var6);
                  if (var17 != 0) {
                    oo.e(33, var10 - 14, qp.field_w.a(ak.field_d) - -14, 15, 7, 16777215);
                    oo.b(33, -15 + var10, qp.field_w.a(ak.field_d) + 16, 17, 7, 65793);
                    qp.field_w.b(ak.field_d, 40, var10 + -2, 65793, -1, var6);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (var16 != 0) {
                    qp.field_w.a(io.field_d, 90, var10 - -24, 11184810, 1, var6);
                    break L16;
                  } else {
                    L17: {
                      stackIn_40_0 = ah.field_e;

                      stackIn_40_1 = Integer.toString(this.field_y[var13]);

                      stackIn_40_2 = 90;

                      stackIn_40_3 = var10 + 28;

                      if (var14 == 0) {
                        stackIn_41_0 = (sl) ((Object) stackIn_40_0);
                        stackIn_41_1 = (String) ((Object) stackIn_40_1);
                        stackIn_41_2 = stackIn_40_2;
                        stackIn_41_3 = stackIn_40_3;
                        stackIn_41_4 = 6;
                        break L17;
                      } else {
                        stackIn_41_0 = (sl) ((Object) stackIn_40_0);
                        stackIn_41_1 = (String) ((Object) stackIn_40_1);
                        stackIn_41_2 = stackIn_40_2;
                        stackIn_41_3 = stackIn_40_3;
                        stackIn_41_4 = 0;
                        break L17;
                      }
                    }
                    ((sl) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, var3, var6);
                    break L16;
                  }
                }
                L18: {
                  qb.field_h.a(135, 4 + var10, var6);
                  oo.h(138, 0, var15 + 138, 480);
                  stackIn_45_0 = 140;

                  stackIn_45_1 = 9 + var10;

                  stackIn_45_2 = qb.field_h.field_e - 10;

                  stackIn_45_3 = 16;

                  stackIn_45_4 = 7;

                  if (var14 != 0) {
                    stackIn_46_0 = stackIn_45_0;
                    stackIn_46_1 = stackIn_45_1;
                    stackIn_46_2 = stackIn_45_2;
                    stackIn_46_3 = stackIn_45_3;
                    stackIn_46_4 = stackIn_45_4;
                    stackIn_46_5 = 16711680;
                    break L18;
                  } else {
                    stackIn_46_0 = stackIn_45_0;
                    stackIn_46_1 = stackIn_45_1;
                    stackIn_46_2 = stackIn_45_2;
                    stackIn_46_3 = stackIn_45_3;
                    stackIn_46_4 = stackIn_45_4;
                    stackIn_46_5 = 65535;
                    break L18;
                  }
                }
                oo.b(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_46_4, stackIn_46_5, var6 / 2);
                oo.h(0, 0, 640, 480);
                var18 = 436;
                var19 = 0;
                L19: while (true) {
                  if ((var19 ^ -1) <= -64) {
                    L20: {
                      var19 = op.field_m.field_o[var13];
                      var20 = op.field_m.field_v[var13];
                      if (this.field_z.field_i) {
                        L21: {
                          qp.field_w.a(Integer.toString(var20), var8_int, 15 + var10, 16777215, 1, var6);
                          stackIn_61_0 = qp.field_w;

                          stackIn_61_1 = eb.a(var20 - var19, true, param0);

                          stackIn_61_2 = var8_int - 2;

                          stackIn_61_3 = 30 + var10;

                          if (var19 < var20) {
                            stackIn_62_0 = (ef) ((Object) stackIn_61_0);
                            stackIn_62_1 = (String) ((Object) stackIn_61_1);
                            stackIn_62_2 = stackIn_61_2;
                            stackIn_62_3 = stackIn_61_3;
                            stackIn_62_4 = 65280;
                            break L21;
                          } else {
                            stackIn_62_0 = (ef) ((Object) stackIn_61_0);
                            stackIn_62_1 = (String) ((Object) stackIn_61_1);
                            stackIn_62_2 = stackIn_61_2;
                            stackIn_62_3 = stackIn_61_3;
                            stackIn_62_4 = 16711680;
                            break L21;
                          }
                        }
                        ((ef) (Object) stackIn_62_0).a(stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_62_4, 1, var6);
                        break L20;
                      } else {
                        qp.field_w.a(Integer.toString(var20), var8_int, var10 + 22, 16777215, 1, var6);
                        break L20;
                      }
                    }
                    L22: {
                      var21 = op.field_m.field_D[var13][0];
                      var22 = op.field_m.field_D[var13][1];
                      var23 = 4;
                      var24 = wf.field_m / gg.field_b[var23];
                      var24 = var24 % gg.field_j[var23];
                      var24 = var24 + gg.field_l[var23];
                      am.a(var24, var22, var11, 1, var21).c(8, var10 - 11, var6);
                      var25 = am.a(var24, var22, -var11 + 1, 1, var21);
                      var25.e();
                      var11 = -var11 + 1;
                      var25.c(575, -11 + var10, var6);
                      if (var17 == 0) {
                        break L22;
                      } else {
                        oo.g(44, 4 + var10, 47, var10 + 1, 16777215);
                        oo.g(43, 4 + var10, 46, var10 - -1, 16777215);
                        oo.g(45, var10 - -4, 48, var10 + 1, 16777215);
                        oo.g(42, var10 - -4, 45, var10 - -1, 65793);
                        oo.g(46, var10 - -4, 49, var10 - -1, 65793);
                        break L22;
                      }
                    }
                    var7 = var7 + (var4 + 1);
                    var10 += 58;
                    var12++;
                    continue L6;
                  } else {
                    L23: {
                      if (!this.field_z.b((byte) -121, var19, var13)) {
                        stackIn_51_0 = 0;
                        break L23;
                      } else {
                        stackIn_51_0 = 1;
                        break L23;
                      }
                    }
                    var20 = stackIn_51_0;
                    if (var20 != 0) {
                      wa.field_b[-18 + var19].c(var18, var10 + 5, var6);
                      if (wa.field_b[var19 - 18].b(var18, 5 + var10, bd.field_g, bo.field_d)) {
                        this.field_E = var19;
                        var18 += 28;
                        var19++;
                        continue L19;
                      } else {
                        var18 += 28;
                        var19++;
                        continue L19;
                      }
                    } else {
                      var19++;
                      continue L19;
                    }
                  }
                }
              }
            }
          }
        }
        L24: {
          L25: {
            if (this.field_B == 1) {
              break L25;
            } else {
              if (-1 <= (this.field_n ^ -1)) {
                break L24;
              } else {
                break L25;
              }
            }
          }
          L26: {
            if (-2 == (this.field_B ^ -1)) {
              stackIn_83_0 = var5;
              break L26;
            } else {
              stackIn_83_0 = 255 - var5;
              break L26;
            }
          }
          var6 = stackIn_83_0;
          rg.field_C.a(-40, 233, var6);
          var7 = 0;
          var8 = new int[]{30, 239, 448};
          var9 = 0;
          L27: while (true) {
            if (5 <= var9) {
              var9 = 0;
              L28: while (true) {
                if (var9 >= 3) {
                  oo.h(0, 0, var7, 480);
                  var9 = 0;
                  L29: while (true) {
                    if (var9 >= 64) {
                      oo.c();
                      rq.field_l.a(30, 231, var6);
                      rq.field_l.a(239, 231, var6);
                      rq.field_l.a(448, 231, var6);
                      var9 = 0;
                      var10 = ll.field_k.g((byte) 125);
                      var11 = 0;
                      L30: while (true) {
                        if (var11 >= var10) {
                          var11 = 0;
                          L31: while (true) {
                            if (var11 >= 3) {
                              ul.field_f.a(93, 231, var6);
                              ul.field_f.a(209, 231, var6);
                              ul.field_f.a(329, 231, var6);
                              ul.field_f.a(573, 231, var6);
                              break L24;
                            } else {
                              var12 = ll.field_k.field_s[var11];
                              if ((var12 ^ -1) != -256) {
                                qj.field_m.a(38 + 209 * var11, 244, var6);
                                oo.h(0, 0, 640, 366);
                                var13 = 0;
                                L32: while (true) {
                                  if (16 <= var13) {
                                    var13 = 0;
                                    L33: while (true) {
                                      if (-9 >= (var13 ^ -1)) {
                                        L34: {
                                          pm.field_N.a(var11 * 209 + 38, 244, var6);
                                          oo.c();
                                          qh.a(var12, -29990, ll.field_k, 280, var11 * 209 + 91, var6);
                                          var13 = ll.field_k.field_t[var12];
                                          var14 = cr.a(var12, -95);
                                          incrementValue$0 = var9;
                                          var9++;
                                          stackIn_131_0 = qp.field_w;

                                          stackIn_131_1 = eb.a(this.field_r[incrementValue$0], true, true);

                                          stackIn_131_2 = 209 * var11 + 166;

                                          stackIn_131_3 = 295;

                                          if (var13 < var14) {
                                            stackIn_132_0 = (ef) ((Object) stackIn_131_0);
                                            stackIn_132_1 = (String) ((Object) stackIn_131_1);
                                            stackIn_132_2 = stackIn_131_2;
                                            stackIn_132_3 = stackIn_131_3;
                                            stackIn_132_4 = 16777215;
                                            break L34;
                                          } else {
                                            stackIn_132_0 = (ef) ((Object) stackIn_131_0);
                                            stackIn_132_1 = (String) ((Object) stackIn_131_1);
                                            stackIn_132_2 = stackIn_131_2;
                                            stackIn_132_3 = stackIn_131_3;
                                            stackIn_132_4 = 16711680;
                                            break L34;
                                          }
                                        }
                                        ((ef) (Object) stackIn_132_0).b(stackIn_132_1, stackIn_132_2, stackIn_132_3, stackIn_132_4, 1, var6);
                                        var11++;
                                        continue L31;
                                      } else {
                                        oo.a(((var13 / 5 + 19) * wf.field_m + var13 * 300) % 720 + 8 + (209 * var11 + 48 << 1302155300), 5744, 112, var6 * 125 >> -379242520, wp.field_f);
                                        var13++;
                                        continue L33;
                                      }
                                    }
                                  } else {
                                    oo.a((48 + 209 * var11 << -1224495516) + 8, 4000 + (wf.field_m * (var13 / 5 + 19) + 300 * var13) % 1920, 112, 125 * var6 >> 46580680, wp.field_f);
                                    var13++;
                                    continue L32;
                                  }
                                }
                              } else {
                                wk.field_J.a(38 - -(209 * var11), 244, var6);
                                hn.field_i.a(var11 * 209 + 91, 280, var6);
                                var11++;
                                continue L31;
                              }
                            }
                          }
                        } else {
                          L35: {
                            var12 = ll.field_k.field_m[var11];
                            var13 = ll.field_k.field_g[var11];
                            na.field_I.a(-32 + ga.field_v[var11], 126, var6);
                            if (255 == var12) {
                              break L35;
                            } else {
                              if (63 <= var12) {
                                break L35;
                              } else {
                                pq.field_o.a(ga.field_v[var11], 166, var6);
                                var14 = 0;
                                L36: while (true) {
                                  if (-9 >= (var14 ^ -1)) {
                                    L37: {
                                      w.field_z.a(ga.field_v[var11], 166, var6);
                                      mg.a(var12, var13, (byte) 46, 106, ll.field_k, var6, -28 + ga.field_v[var11]);
                                      var14 = ll.field_k.field_t[var12];
                                      var15 = cr.a(var12, -107);
                                      incrementValue$1 = var9;
                                      var9++;
                                      stackIn_108_0 = qp.field_w;

                                      stackIn_108_1 = eb.a(this.field_r[incrementValue$1], true, true);

                                      stackIn_108_2 = ga.field_v[var11] - 50;

                                      stackIn_108_3 = 123;

                                      if (var14 < var15) {
                                        stackIn_109_0 = (ef) ((Object) stackIn_108_0);
                                        stackIn_109_1 = (String) ((Object) stackIn_108_1);
                                        stackIn_109_2 = stackIn_108_2;
                                        stackIn_109_3 = stackIn_108_3;
                                        stackIn_109_4 = 16777215;
                                        break L37;
                                      } else {
                                        stackIn_109_0 = (ef) ((Object) stackIn_108_0);
                                        stackIn_109_1 = (String) ((Object) stackIn_108_1);
                                        stackIn_109_2 = stackIn_108_2;
                                        stackIn_109_3 = stackIn_108_3;
                                        stackIn_109_4 = 16711680;
                                        break L37;
                                      }
                                    }
                                    ((ef) (Object) stackIn_109_0).b(stackIn_109_1, stackIn_109_2, stackIn_109_3, stackIn_109_4, 1, var6);
                                    if (255 != var13) {
                                      if ((var13 ^ -1) > -64) {
                                        L38: {
                                          var14 = ll.field_k.field_t[var13];
                                          var15 = cr.a(var13, -101);
                                          incrementValue$2 = var9;
                                          var9++;
                                          stackIn_115_0 = qp.field_w;

                                          stackIn_115_1 = eb.a(this.field_r[incrementValue$2], true, true);

                                          stackIn_115_2 = -73 + ga.field_v[var11];

                                          stackIn_115_3 = 111;

                                          if (var14 >= var15) {
                                            stackIn_116_0 = (ef) ((Object) stackIn_115_0);
                                            stackIn_116_1 = (String) ((Object) stackIn_115_1);
                                            stackIn_116_2 = stackIn_115_2;
                                            stackIn_116_3 = stackIn_115_3;
                                            stackIn_116_4 = 16711680;
                                            break L38;
                                          } else {
                                            stackIn_116_0 = (ef) ((Object) stackIn_115_0);
                                            stackIn_116_1 = (String) ((Object) stackIn_115_1);
                                            stackIn_116_2 = stackIn_115_2;
                                            stackIn_116_3 = stackIn_115_3;
                                            stackIn_116_4 = 16777215;
                                            break L38;
                                          }
                                        }
                                        ((ef) (Object) stackIn_116_0).b(stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_116_4, 1, var6);
                                        var11++;
                                        continue L30;
                                      } else {
                                        var11++;
                                        continue L30;
                                      }
                                    } else {
                                      var11++;
                                      continue L30;
                                    }
                                  } else {
                                    oo.a(10 + ga.field_v[var11] << 471656292, -(((var14 / 5 + 19) * wf.field_m - -(var14 * 300)) % 960) + 3728, 96, 125 * var6 >> -1958180312, wp.field_f);
                                    var14++;
                                    continue L36;
                                  }
                                }
                              }
                            }
                          }
                          tm.field_f.a(ga.field_v[var11], 166, var6);
                          var11++;
                          continue L30;
                        }
                      }
                    } else {
                      oo.a(-176 + ((var9 / 11 + 25) * wf.field_m + 1000 * var9) % 10560, 3952, 176, var6 * 125 >> -97135736, wp.field_f);
                      var9++;
                      continue L29;
                    }
                  }
                } else {
                  var10 = ll.field_k.field_s[var9];
                  if (255 != var10) {
                    L39: {
                      if (var7 <= var8[var9]) {
                        stackIn_95_0 = var8[var9];
                        break L39;
                      } else {
                        stackIn_95_0 = var7;
                        break L39;
                      }
                    }
                    var7 = stackIn_95_0;
                    var9++;
                    continue L28;
                  } else {
                    var9++;
                    continue L28;
                  }
                }
              }
            } else {
              var10 = ll.field_k.field_m[var9];
              if (255 != var10) {
                var7 = ga.field_v[var9];
                var9++;
                continue L27;
              } else {
                var9++;
                continue L27;
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
            field_C = 0.5614934243533339;
        }
        field_D = null;
    }

    private final void f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var10 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1 > 2) {
            break L0;
          } else {
            si.d(true);
            break L0;
          }
        }
        L1: {
          if (-256 != (this.field_E ^ -1)) {
            L2: {
              if (this.field_m != 0) {
                break L2;
              } else {
                if (10 >= b.a(true)) {
                  break L2;
                } else {
                  this.field_m = this.field_m + 1;
                  break L2;
                }
              }
            }
            if (this.field_m > 0) {
              L3: {
                this.field_m = this.field_m + 2;
                if (-256 > (this.field_m ^ -1)) {
                  this.field_m = 255;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var7 = gh.field_f[this.field_E];
                var8 = qp.field_w.a(var7);
                var9 = param0 * (this.field_m * 8) >> 1447045448;
                var5 = qp.field_w.field_w;
                if (255 < var9) {
                  var9 = 255;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: while (true) {
                if (var8 <= 300) {
                  L6: {
                    var6 = var8 - -16;
                    var3 = bd.field_g;
                    var5 += 16;
                    if (0 > var3) {
                      var3 = 0;
                      break L6;
                    } else {
                      if ((var3 - -var6 ^ -1) >= -636) {
                        break L6;
                      } else {
                        var3 = 640 + -var6 - 5;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    var4 = 32 + bo.field_d;
                    if ((var9 ^ -1) < -251) {
                      oo.b(var3 - -2, var4 + 2, var6, var5, 4, 0, var9 / 2);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  oo.b(var3, var4, var6, var5, 4, 10061892, var9);
                  qp.field_w.a(var7, var3, var4, var6, var5, 16777215, 0, var9, 1, 1, 0);
                  break L1;
                } else {
                  var5 = var5 + qp.field_w.field_w;
                  var8 = var8 / 2;
                  continue L5;
                }
              }
            } else {
              break L1;
            }
          } else {
            this.field_m = 0;
            break L1;
          }
        }
    }

    private final void e(int param0, int param1) {
        this.field_u[this.field_v].a(this.field_v / 4 * 75 + 130, 35 - -(640 * (this.field_v % param1) / 5), param0, 70);
        this.field_v = this.field_v + 1;
    }

    private final void b(boolean param0, int param1) {
        int var3;
        int var4;
        L0: {
          var4 = ZombieDawnMulti.field_E ? 1 : 0;
          if ((this.field_n ^ -1) < -1) {
            this.field_n = 33 + -this.field_n;
            this.field_B = this.field_s;
            break L0;
          } else {
            this.field_n = 33;
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            this.field_l = (String) null;
            break L1;
          }
        }
        L2: {
          this.field_s = param1;
          var3 = this.field_s;
          if (var3 != 1) {
            if (var3 != 0) {
              break L2;
            } else {
              we.field_g[43] = ec.field_a;
              break L2;
            }
          } else {
            we.field_g[43] = ip.field_c;
            break L2;
          }
        }
    }

    final int d(int param0, int param1) {
        int var4;
        int var5;
        int stackIn_10_0 = 0;
        int var3;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= -65) {
          L0: {
            var4 = this.field_j.length;
            if (-2 != (var4 ^ -1)) {
              if (-3 == (var4 ^ -1)) {
                L1: {
                  if (param1 != 0) {
                    stackIn_10_0 = 2;
                    break L1;
                  } else {
                    stackIn_10_0 = 0;
                    break L1;
                  }
                }
                var3 = stackIn_10_0;
                break L0;
              } else {
                var3 = param1;
                break L0;
              }
            } else {
              var3 = 1;
              break L0;
            }
          }
          var4 = var3;
          if (0 != var4) {
            if ((var4 ^ -1) == -2) {
              return 400;
            } else {
              if (var4 != 2) {
                return super.d(-93, param1);
              } else {
                return 560;
              }
            }
          } else {
            return 210;
          }
        } else {
          return -1;
        }
    }

    final void f(int param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (0 != (op.field_m.field_j & 1 << fb.field_e.field_M)) {
            we.field_g[42] = ih.field_c;
        } else {
            if (-1 > (cm.a(op.field_m.field_j, true) ^ -1)) {
                we.field_g[42] = ih.field_c;
            } else {
                we.field_g[42] = u.field_j;
            }
        }
        if (param0 <= 123) {
            this.field_w = -88;
        }
    }

    final void a(int param0) {
        cb[] var2;
        int var3;
        int var5;
        cb[] var6;
        cb[] var7;
        int var8;
        cb var9;
        cb var10;
        L0: {
          L1: {
            var5 = ZombieDawnMulti.field_E ? 1 : 0;
            super.a(0);
            if (this.field_n > param0) {
              this.field_n = this.field_n - 1;
              if (-1 <= (this.field_n ^ -1)) {
                this.field_B = this.field_s;
                if (this.field_B == 0) {
                  var7 = this.field_u;
                  var2 = var7;
                  var8 = 0;
                  var3 = var8;
                  L2: while (true) {
                    if (var7.length > var8) {
                      var10 = var7[var8];
                      var10.c((byte) 99);
                      var8++;
                      continue L2;
                    } else {
                      if (this.field_g.field_d != 0) {
                        break L0;
                      } else {
                        if (39 != this.field_j[0]) {
                          break L0;
                        } else {
                          this.field_g.a(1, param0 ^ -1);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            } else {
              if ((this.field_B ^ -1) == -2) {
                if (0 == wf.field_m % 2) {
                  var6 = this.field_u;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var6.length > var3) {
                      var9 = var6[var3];
                      var10 = var9;
                      var10 = var9;
                      var9.d((byte) -102);
                      var3++;
                      continue L3;
                    } else {
                      if (this.field_g.field_d != 0) {
                        break L0;
                      } else {
                        if (39 != this.field_j[0]) {
                          break L0;
                        } else {
                          this.field_g.a(1, param0 ^ -1);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                if (this.field_g.field_d != 0) {
                  break L0;
                } else {
                  if (39 != this.field_j[0]) {
                    break L0;
                  } else {
                    this.field_g.a(1, param0 ^ -1);
                    break L0;
                  }
                }
              }
            }
          }
          if (this.field_g.field_d != 0) {
            break L0;
          } else {
            if (39 != this.field_j[0]) {
              break L0;
            } else {
              this.field_g.a(1, param0 ^ -1);
              break L0;
            }
          }
        }
        int fieldTemp$0 = this.field_x - 1;
        this.field_x = this.field_x - 1;
        if (fieldTemp$0 <= 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_C = 0.0;
        field_D = "Advertising websites";
    }
}
