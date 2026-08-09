/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends o {
    static String field_v;
    private int field_y;
    private int field_u;
    private bi[] field_t;
    static in field_w;
    private int field_x;

    final static int[] a(boolean param0, int[] param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int fieldTemp$20 = 0;
        int fieldTemp$21 = 0;
        int fieldTemp$22 = 0;
        int fieldTemp$23 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_62_0 = null;
        int[] stackIn_64_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = param1.length;
                if (null == ai.field_b) {
                  break L2;
                } else {
                  if (ai.field_b.length >= var2_int * 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ai.field_b = new int[2 * var2_int];
              en.field_b = new int[var2_int * 2];
              break L1;
            }
            sl.field_r = 0;
            var5 = param1[var2_int - 2];
            var6 = param1[-1 + var2_int];
            var7_int = 0;
            L3: while (true) {
              if (var7_int >= var2_int) {
                if (-1 != (sl.field_r ^ -1)) {
                  var7 = en.field_b;
                  en.field_b = ai.field_b;
                  ai.field_b = var7;
                  var2_int = sl.field_r;
                  sl.field_r = 0;
                  var5 = en.field_b[var2_int + -2];
                  var6 = en.field_b[-1 + var2_int];
                  var8_int = 0;
                  L4: while (true) {
                    if (var2_int <= var8_int) {
                      L5: {
                        if (param0) {
                          break L5;
                        } else {
                          field_w = (in) null;
                          break L5;
                        }
                      }
                      if (-1 != (sl.field_r ^ -1)) {
                        var7 = en.field_b;
                        en.field_b = ai.field_b;
                        ai.field_b = var7;
                        var2_int = sl.field_r;
                        sl.field_r = 0;
                        var5 = en.field_b[var2_int + -2];
                        var6 = en.field_b[var2_int + -1];
                        var8_int = 0;
                        L6: while (true) {
                          if (var2_int <= var8_int) {
                            if (0 != sl.field_r) {
                              var7 = en.field_b;
                              en.field_b = ai.field_b;
                              var2_int = sl.field_r;
                              ai.field_b = var7;
                              sl.field_r = 0;
                              var6 = en.field_b[-1 + var2_int];
                              var5 = en.field_b[var2_int - 2];
                              var8_int = 0;
                              L7: while (true) {
                                if (var8_int >= var2_int) {
                                  if (-1 != (sl.field_r ^ -1)) {
                                    var15 = new int[sl.field_r];
                                    var14 = var15;
                                    var8 = var14;
                                    ps.a(ai.field_b, 0, var15, 0, sl.field_r);
                                    stackIn_64_0 = (int[]) (var8);
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    stackIn_62_0 = null;
                                    decompiledRegionSelector0 = 1;
                                    break L0;
                                  }
                                } else {
                                  L8: {
                                    var3 = var5;
                                    var4 = var6;
                                    var5 = en.field_b[var8_int];
                                    var6 = en.field_b[1 + var8_int];
                                    if (var6 >= gf.field_f) {
                                      if (var4 < gf.field_f) {
                                        var9 = var3;
                                        var10 = var4;
                                        var11 = var5;
                                        var12 = var6;
                                        fieldTemp$0 = sl.field_r;
                                        sl.field_r = sl.field_r + 1;
                                        ai.field_b[fieldTemp$0] = (gf.field_f - var10) * (var11 + -var9) / (var12 - var10) + var9;
                                        fieldTemp$1 = sl.field_r;
                                        sl.field_r = sl.field_r + 1;
                                        ai.field_b[fieldTemp$1] = gf.field_f;
                                        break L8;
                                      } else {
                                        break L8;
                                      }
                                    } else {
                                      L9: {
                                        if (gf.field_f <= var4) {
                                          var9 = var5;
                                          var10 = var6;
                                          var11 = var3;
                                          var12 = var4;
                                          fieldTemp$2 = sl.field_r;
                                          sl.field_r = sl.field_r + 1;
                                          ai.field_b[fieldTemp$2] = (-var9 + var11) * (gf.field_f - var10) / (var12 - var10) + var9;
                                          fieldTemp$3 = sl.field_r;
                                          sl.field_r = sl.field_r + 1;
                                          ai.field_b[fieldTemp$3] = gf.field_f;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                      fieldTemp$4 = sl.field_r;
                                      sl.field_r = sl.field_r + 1;
                                      ai.field_b[fieldTemp$4] = var5;
                                      fieldTemp$5 = sl.field_r;
                                      sl.field_r = sl.field_r + 1;
                                      ai.field_b[fieldTemp$5] = var6;
                                      break L8;
                                    }
                                  }
                                  var8_int += 2;
                                  continue L7;
                                }
                              }
                            } else {
                              return null;
                            }
                          } else {
                            L10: {
                              var4 = var6;
                              var3 = var5;
                              var6 = en.field_b[var8_int + 1];
                              var5 = en.field_b[var8_int];
                              if (var6 >= gf.field_a) {
                                L11: {
                                  if (var4 < gf.field_a) {
                                    var9 = var5;
                                    var10 = var6;
                                    var11 = var3;
                                    var12 = var4;
                                    fieldTemp$6 = sl.field_r;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[fieldTemp$6] = var9 + (-var9 + var11) * (-var10 + gf.field_a) / (var12 - var10);
                                    fieldTemp$7 = sl.field_r;
                                    sl.field_r = sl.field_r + 1;
                                    ai.field_b[fieldTemp$7] = gf.field_a;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                fieldTemp$8 = sl.field_r;
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[fieldTemp$8] = var5;
                                fieldTemp$9 = sl.field_r;
                                sl.field_r = sl.field_r + 1;
                                ai.field_b[fieldTemp$9] = var6;
                                break L10;
                              } else {
                                if (var4 >= gf.field_a) {
                                  var9 = var3;
                                  var10 = var4;
                                  var11 = var5;
                                  var12 = var6;
                                  fieldTemp$10 = sl.field_r;
                                  sl.field_r = sl.field_r + 1;
                                  ai.field_b[fieldTemp$10] = var9 - -((gf.field_a + -var10) * (-var9 + var11) / (-var10 + var12));
                                  fieldTemp$11 = sl.field_r;
                                  sl.field_r = sl.field_r + 1;
                                  ai.field_b[fieldTemp$11] = gf.field_a;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            var8_int += 2;
                            continue L6;
                          }
                        }
                      } else {
                        return null;
                      }
                    } else {
                      L12: {
                        var3 = var5;
                        var4 = var6;
                        var6 = en.field_b[1 + var8_int];
                        var5 = en.field_b[var8_int];
                        if (gf.field_l > var5) {
                          L13: {
                            if (var3 >= gf.field_l) {
                              var9 = var5;
                              var10 = var6;
                              var11 = var3;
                              var12 = var4;
                              fieldTemp$12 = sl.field_r;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[fieldTemp$12] = gf.field_l;
                              fieldTemp$13 = sl.field_r;
                              sl.field_r = sl.field_r + 1;
                              ai.field_b[fieldTemp$13] = (var12 - var10) * (-var9 + gf.field_l) / (var11 + -var9) + var10;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          fieldTemp$14 = sl.field_r;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[fieldTemp$14] = var5;
                          fieldTemp$15 = sl.field_r;
                          sl.field_r = sl.field_r + 1;
                          ai.field_b[fieldTemp$15] = var6;
                          break L12;
                        } else {
                          if (var3 < gf.field_l) {
                            var9 = var3;
                            var10 = var4;
                            var11 = var5;
                            var12 = var6;
                            fieldTemp$16 = sl.field_r;
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[fieldTemp$16] = gf.field_l;
                            fieldTemp$17 = sl.field_r;
                            sl.field_r = sl.field_r + 1;
                            ai.field_b[fieldTemp$17] = var10 - -((-var10 + var12) * (gf.field_l + -var9) / (-var9 + var11));
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var8_int += 2;
                      continue L4;
                    }
                  }
                } else {
                  stackIn_18_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L14: {
                  var3 = var5;
                  var4 = var6;
                  var5 = param1[var7_int];
                  var6 = param1[var7_int + 1];
                  if ((gf.field_i ^ -1) >= (var5 ^ -1)) {
                    L15: {
                      if (gf.field_i > var3) {
                        var8_int = var5;
                        var9 = var6;
                        var10 = var3;
                        var11 = var4;
                        fieldTemp$18 = sl.field_r;
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[fieldTemp$18] = gf.field_i;
                        fieldTemp$19 = sl.field_r;
                        sl.field_r = sl.field_r + 1;
                        ai.field_b[fieldTemp$19] = var9 - -((-var8_int + gf.field_i) * (-var9 + var11) / (var10 + -var8_int));
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    fieldTemp$20 = sl.field_r;
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[fieldTemp$20] = var5;
                    fieldTemp$21 = sl.field_r;
                    sl.field_r = sl.field_r + 1;
                    ai.field_b[fieldTemp$21] = var6;
                    break L14;
                  } else {
                    if (gf.field_i <= var3) {
                      var8_int = var3;
                      var9 = var4;
                      var10 = var5;
                      var11 = var6;
                      fieldTemp$22 = sl.field_r;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[fieldTemp$22] = gf.field_i;
                      fieldTemp$23 = sl.field_r;
                      sl.field_r = sl.field_r + 1;
                      ai.field_b[fieldTemp$23] = var9 - -((var11 + -var9) * (gf.field_i + -var8_int) / (-var8_int + var10));
                      break L14;
                    } else {
                      var7_int += 2;
                      continue L3;
                    }
                  }
                }
                var7_int += 2;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var2 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var2);

            stackIn_67_1 = new StringBuilder().append("qp.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L16;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L16;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (int[]) ((Object) stackIn_18_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (int[]) ((Object) stackIn_62_0);
          } else {
            return stackIn_64_0;
          }
        }
    }

    public qp() {
        this(2188450, 2591221, 9543);
    }

    public final void a(vg param0, int param1, boolean param2, int param3, byte param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (param4 == 12) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            L2: {
              if (!param0.field_k) {
                if (param0.f(1)) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param0 instanceof kg) {
                param2 = param2 & ((kg) ((Object) param0)).field_y;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param2) {
                if (var6_int != 0) {
                  stackIn_16_0 = this.field_x;
                  break L4;
                } else {
                  stackIn_16_0 = this.field_y;
                  break L4;
                }
              } else {
                stackIn_16_0 = this.field_u;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_16_0;
              mj.a(param0.field_x, 2, var7, param3 + param0.field_q + (param0.field_n - this.field_t[0].field_p >> -1289075455), param0.field_m + param1, this.field_t);
              if (param2) {
                stackIn_19_0 = 16777215;
                break L5;
              } else {
                stackIn_19_0 = 7105644;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            this.field_c.a(param0.field_s, param1 - -param0.field_m, -2 + param0.field_q + param3, param0.field_x, param0.field_n, var8, -1, 1, 1, this.field_c.field_J);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("qp.E(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static bi[] a(int param0, int param1, int param2) {
        int var3 = 124 % ((-27 - param1) / 41);
        return cr.a(param0, 1, -10, param2);
    }

    public static void b(byte param0) {
        field_w = null;
        if (param0 >= -126) {
            return;
        }
        field_v = null;
    }

    private qp(int param0, int param1, int param2) {
        this.field_t = kl.field_q;
        this.field_y = param0;
        this.field_c = sl.field_p;
        this.field_x = param1;
        this.field_u = param2;
    }

    static {
        field_v = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
