/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    private static d field_i;
    static int field_b;
    private static String[] field_k;
    private static int field_a;
    private static wk field_g;
    private static int field_f;
    static wk[] field_l;
    private static int[] field_d;
    private static int field_n;
    static int[][] field_o;
    private static int field_h;
    private static int field_c;
    private static int field_j;
    private static int field_m;
    private static int[] field_e;

    private final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, boolean param6) {
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
        var7 = 0;
        var8 = (param5.length << 16) / param3;
        var9 = 0;
        var11 = param4[0].field_y;
        var12 = param4[0].field_v;
        var14 = 0;
        L0: while (true) {
          if (var14 >= param3) {
            return;
          } else {
            L1: {
              if (var14 >= var12) {
                if (param3 - var14 > var12) {
                  var13 = 3;
                  break L1;
                } else {
                  var13 = 6;
                  if (param3 - var14 != var12) {
                    break L1;
                  } else {
                    var7 = 0;
                    break L1;
                  }
                }
              } else {
                var13 = 0;
                break L1;
              }
            }
            var10 = param5[var9 >> 16];
            var9 = var9 + var8;
            var17 = (param1 + var14) * qn.field_l + param0;
            var18 = 0;
            L2: while (true) {
              if (var18 >= 3) {
                var7++;
                var14++;
                continue L0;
              } else {
                var19 = var7 % var12 * var11;
                if (var18 != 1) {
                  var15 = -var11;
                  L3: while (true) {
                    if (var15 < 0) {
                      var20 = param4[var13].field_B[var19];
                      if (var20 != 0) {
                        L4: {
                          if ((var20 & -65281) != 0) {
                            break L4;
                          } else {
                            var20 = fe.a(var10, var20 >> 8, 0, 0);
                            break L4;
                          }
                        }
                        qn.field_d[var17] = var20;
                        var15++;
                        var19++;
                        var17++;
                        continue L3;
                      } else {
                        var15++;
                        var19++;
                        var17++;
                        continue L3;
                      }
                    } else {
                      var18++;
                      var13++;
                      continue L2;
                    }
                  }
                } else {
                  L5: {
                    var16 = param2 - (var11 << 1);
                    if (var13 != 4) {
                      break L5;
                    } else {
                      if (param6) {
                        break L5;
                      } else {
                        var17 = var17 + var16;
                        var18++;
                        var13++;
                        continue L2;
                      }
                    }
                  }
                  var20 = param4[var13].field_B[var19];
                  if (var20 != 0) {
                    L6: {
                      if ((var20 & -65281) != 0) {
                        break L6;
                      } else {
                        var20 = fe.a(var10, var20 >> 8, 0, 0);
                        break L6;
                      }
                    }
                    var15 = -var16;
                    L7: while (true) {
                      if (var15 < 0) {
                        qn.field_d[var17] = var20;
                        var15++;
                        var17++;
                        continue L7;
                      } else {
                        var18++;
                        var13++;
                        continue L2;
                      }
                    }
                  } else {
                    var17 = var17 + var16;
                    var18++;
                    var13++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7) {
        fe.a(param0, param1, param2, param3, param4, param5, param6, param7, true);
    }

    final static void a(String param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        int var12 = 0;
        field_d[0] = param3 << (param5 ? 1 : 0);
        int var8 = field_i.a(param0, field_d, field_k);
        int var9 = field_i.field_v >> (param5 ? 1 : 0);
        int var10 = var9 * var8;
        int var11 = 0;
        if (param7 == 1) {
            var11 = (param6 - var10) / 2;
        } else {
            if (param7 == 2) {
                var11 = param6 - var10;
            }
        }
        for (var12 = 0; var12 < var8; var12++) {
            fe.c(field_k[var12], param1, param2 + var11 + var9 * var12, param4, param5);
        }
    }

    final static void b(String param0, int param1, int param2, int[] param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 1 : 0));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static int a(int param0) {
        int var1 = 0;
        int var2 = 16384;
        while (var2 > param0) {
            var2 = var2 >> 2;
        }
        while (var2 != 0) {
            if (var1 + var2 < param0) {
                param0 = param0 - (var1 + var2);
                var1 = var1 + 2 * var2;
            }
            var1 = var1 >> 1;
            var2 = var2 >> 2;
        }
        return var1;
    }

    private final static boolean c(int param0, int param1) {
        if (field_m < 0) {
            return false;
        }
        int var2 = field_f - param0;
        int var3 = field_n - param1;
        int var4 = var2 * var2 + var3 * var3;
        if (var4 > field_m * field_m) {
            return true;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        param4[0].e(param0, param1, param5);
        param4[1].e(param0 + param2 - param4[0].field_y, param1, param5);
        param4[2].e(param0, param1 + param3 - param4[0].field_v, param5);
        param4[3].e(param0 + param2 - param4[0].field_y, param1 + param3 - param4[0].field_v, param5);
        var6 = param1;
        var7 = param3 - param4[0].field_v;
        var8 = param2 - param4[0].field_y;
        param1 = 0;
        L0: while (true) {
          if (param1 >= param3) {
            return;
          } else {
            if (param1 >= param4[0].field_v) {
              if (param1 < var7) {
                qn.d(param0, var6, param0 + param2 - 1, var6, 0, param5);
                var6++;
                param1++;
                continue L0;
              } else {
                qn.d(param0 + param4[0].field_y, var6, param0 + var8 - 1, var6, 0, param5);
                var6++;
                param1++;
                continue L0;
              }
            } else {
              qn.d(param0 + param4[0].field_y, var6, param0 + var8 - 1, var6, 0, param5);
              var6++;
              param1++;
              continue L0;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        double var11 = 0.0;
        var7 = param5 / 2 + 1;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param3) {
            return;
          } else {
            var9 = (double)param4 * 3.141592653589793 * 2.0 / 100.0;
            var11 = (double)var8 * 3.141592653589793 * 2.0 / (double)param3;
            qn.a((int)(((double)param0 + (Math.cos(var9) * Math.cos(var11) * (double)param5 - Math.sin(var9) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9) * Math.cos(var11) * (double)var7 + Math.cos(var9) * Math.sin(var11) * (double)param5)) * 16.0), param6, 15, field_o[param2]);
            var9 = (double)(param4 + 5) * 3.141592653589793 * 2.0 / 100.0;
            qn.a((int)(((double)param0 + (Math.cos(var9) * Math.cos(var11) * (double)param5 - Math.sin(var9) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9) * Math.cos(var11) * (double)var7 + Math.cos(var9) * Math.sin(var11) * (double)param5)) * 16.0), param6, 31, field_o[param2]);
            var9 = (double)(param4 + 10) * 3.141592653589793 * 2.0 / 100.0;
            qn.a((int)(((double)param0 + (Math.cos(var9) * Math.cos(var11) * (double)param5 - Math.sin(var9) * Math.sin(var11) * (double)var7)) * 16.0), (int)(((double)param1 + (Math.sin(var9) * Math.cos(var11) * (double)var7 + Math.cos(var9) * Math.sin(var11) * (double)param5)) * 16.0), param6, 63, field_o[param2]);
            var8++;
            continue L0;
          }
        }
    }

    final static void a(String param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        L0: {
          var4 = field_i.a(param0) + 40;
          if (!param3) {
            param2 -= 26;
            param1 -= 20;
            fe.a(field_l[0], param1, param2);
            fe.a(field_l[2], param1 + var4 - field_l[2].field_y, param2);
            fe.a(field_l[1], param1 + field_l[0].field_y, param2, var4 - (field_l[0].field_y << 1), field_l[1].field_v);
            break L0;
          } else {
            var4 = var4 >> 1;
            param2 -= 26;
            param1 -= 10;
            fe.a(field_l[0], param1, param2, field_l[2].field_y >> 1, field_l[2].field_v >> 1);
            fe.a(field_l[2], param1 + var4 - (field_l[2].field_y >> 1), param2, field_l[2].field_y >> 1, field_l[2].field_v >> 1);
            fe.a(field_l[1], param1 + (field_l[0].field_y >> 1), param2, var4 - field_l[0].field_y, field_l[1].field_v >> 1);
            break L0;
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int incrementValue$145 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        var16 = param3;
        L0: while (true) {
          if (param8 >= 0) {
            return;
          } else {
            param7 = (param9 >> 16) * param15;
            param6 = -param12;
            L1: while (true) {
              if (param6 >= 0) {
                param9 = param9 + param14;
                param3 = var16;
                param10 = param10 + param11;
                param8++;
                continue L0;
              } else {
                L2: {
                  param0 = param4[(param3 >> 16) + param7];
                  if (param0 == 0) {
                    param10++;
                    break L2;
                  } else {
                    param1 = param5[param10];
                    if (param1 == 0) {
                      param10++;
                      break L2;
                    } else {
                      var17 = ((param0 & 16711680) >>> 16) * ((param1 & 16711680) >>> 16) >>> 8;
                      var18 = (param0 & 65280) * (param1 & 65280) >>> 24;
                      var19 = (param0 & 255) * (param1 & 255) >>> 8;
                      incrementValue$145 = param10;
                      param10++;
                      param5[incrementValue$145] = (var17 << 16) + (var18 << 8) + var19;
                      param3 = param3 + param13;
                      param6++;
                      continue L1;
                    }
                  }
                }
                param3 = param3 + param13;
                param6++;
                continue L1;
              }
            }
          }
        }
    }

    final static void c(String param0, int param1, int param2, int[] param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 2 : 1));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 > 256) {
            var2 = param1 - 256;
            param1 = 256;
        }
        int var3 = ((param0 & 16711680) * param1 >> 8 & 16711680) + (var2 << 16);
        int var4 = ((param0 & 65280) * param1 >> 8 & 65280) + (var2 << 8);
        int var5 = ((param0 & 255) * param1 >> 8 & 255) + var2;
        if (var3 > 16711680) {
            var3 = 16711680;
        }
        if (var4 > 65280) {
            var4 = 65280;
        }
        if (var5 > 255) {
            var5 = 255;
        }
        return var3 | var4 | var5;
    }

    final static void a(String param0, int param1, int param2, int[] param3, boolean param4) {
        int var8 = 0;
        fe.a();
        int[] var5 = qn.field_d;
        int var6 = qn.field_l;
        int var7 = qn.field_g;
        if (field_g != null) {
            if (field_i == null) {
                return;
            }
            param2 = param2 - (field_i.field_v - field_i.field_L);
            var8 = field_i.a(param0);
            if ((var8 & 1) == 1) {
                var8++;
            }
            field_g.b();
            qn.b();
            field_i.b(param0, 0, field_i.field_H + 3, 0, -1);
            qn.a(var5, var6, var7);
            fe.c();
            if (param4) {
                fe.a(field_g, param1, param2, var8, param3);
            } else {
                fe.b(field_g, param1, param2, var8, param3);
            }
            return;
        }
    }

    final static void a(wk param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
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
        if (param3 <= 0) {
          return;
        } else {
          if (param4 > 0) {
            L0: {
              var5 = param0.field_y;
              var6 = param0.field_v;
              var7 = 0;
              var8 = 0;
              var9 = param0.field_A;
              var10 = param0.field_x;
              var11 = (var9 << 16) / param3;
              var12 = (var10 << 16) / param4;
              if (param0.field_w <= 0) {
                break L0;
              } else {
                var13 = ((param0.field_w << 16) + var11 - 1) / var11;
                param1 = param1 + var13;
                var7 = var7 + (var13 * var11 - (param0.field_w << 16));
                break L0;
              }
            }
            L1: {
              if (param0.field_z <= 0) {
                break L1;
              } else {
                var13 = ((param0.field_z << 16) + var12 - 1) / var12;
                param2 = param2 + var13;
                var8 = var8 + (var13 * var12 - (param0.field_z << 16));
                break L1;
              }
            }
            L2: {
              if (var5 >= var9) {
                break L2;
              } else {
                param3 = ((var5 << 16) - var7 + var11 - 1) / var11;
                break L2;
              }
            }
            L3: {
              if (var6 >= var10) {
                break L3;
              } else {
                param4 = ((var6 << 16) - var8 + var12 - 1) / var12;
                break L3;
              }
            }
            L4: {
              var13 = param1 + param2 * qn.field_l;
              var14 = qn.field_l - param3;
              if (param2 + param4 <= qn.field_f) {
                break L4;
              } else {
                param4 = param4 - (param2 + param4 - qn.field_f);
                break L4;
              }
            }
            L5: {
              if (param2 >= qn.field_a) {
                break L5;
              } else {
                var15 = qn.field_a - param2;
                param4 = param4 - var15;
                var13 = var13 + var15 * qn.field_l;
                var8 = var8 + var12 * var15;
                break L5;
              }
            }
            L6: {
              if (param1 + param3 <= qn.field_e) {
                break L6;
              } else {
                var15 = param1 + param3 - qn.field_e;
                param3 = param3 - var15;
                var14 = var14 + var15;
                break L6;
              }
            }
            L7: {
              if (param1 >= qn.field_j) {
                break L7;
              } else {
                var15 = qn.field_j - param1;
                param3 = param3 - var15;
                var13 = var13 + var15;
                var7 = var7 + var11 * var15;
                var14 = var14 + var15;
                break L7;
              }
            }
            fe.a(0, 0, 0, var7, param0.field_B, qn.field_d, 0, 0, -param4, var8, var13, var14, param3, var11, var12, var5);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(wk param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param1 = param1 + param0.field_w;
          param2 = param2 + param0.field_z;
          var4 = param1 + param2 * qn.field_l;
          var5 = 0;
          var6 = param0.field_v;
          var7 = param0.field_y;
          var8 = qn.field_l - var7;
          var9 = 0;
          if (param2 >= qn.field_a) {
            break L0;
          } else {
            var10 = qn.field_a - param2;
            var6 = var6 - var10;
            param2 = qn.field_a;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= qn.field_f) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param1 >= qn.field_j) {
            break L2;
          } else {
            var10 = qn.field_j - param1;
            var7 = var7 - var10;
            param1 = qn.field_j;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= qn.field_e) {
            break L3;
          } else {
            var10 = param1 + var7 - qn.field_e;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        if (var7 <= 0) {
          return;
        } else {
          if (var6 > 0) {
            fe.a(0, qn.field_d, param0.field_B, 0, var5, var4, var7, var6, var8, var9, param3);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(String param0, int param1, int param2, int param3, boolean param4) {
        int var8 = 0;
        fe.a();
        int[] var5 = qn.field_d;
        int var6 = qn.field_l;
        int var7 = qn.field_g;
        if (field_g != null) {
            if (field_i == null) {
                return;
            }
            param2 = param2 - (field_i.field_H - field_i.field_L);
            var8 = field_i.a(param0);
            if ((var8 & 1) == 1) {
                var8++;
            }
            field_g.b();
            qn.b();
            field_i.b(param0, 0, field_i.field_H + 3, 0, -1);
            qn.a(var5, var6, var7);
            fe.c();
            if (param4) {
                fe.b(field_g, param1, param2, var8, param3);
            } else {
                fe.c(field_g, param1, param2, var8, param3);
            }
            return;
        }
    }

    final static void d(String param0, int param1, int param2, int param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 1 : 0));
        fe.a(param0, param1, param2, param3, param4);
    }

    final static wk[] a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5) {
        wk[] var6 = null;
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
        var6 = new wk[4];
        var6[0] = new wk(param2, param4[0].field_v);
        var6[3] = new wk(param2, param4[0].field_v);
        var6[1] = new wk(param4[0].field_y, param3 - param4[0].field_v * 2);
        var6[2] = new wk(param4[0].field_y, param3 - param4[0].field_v * 2);
        var9 = 0;
        var10 = 0;
        var11 = 0;
        var12 = (param5.length << 16) / param3;
        var13 = 0;
        var14 = 0;
        L0: while (true) {
          if (var14 >= param3) {
            return var6;
          } else {
            var11 = param5[var13 >> 16];
            var13 = var13 + var12;
            if (var14 >= param4[0].field_v) {
              if (var14 >= param3 - param4[0].field_v) {
                L1: {
                  if (var14 != param3 - param4[0].field_v) {
                    break L1;
                  } else {
                    var9 = 0;
                    break L1;
                  }
                }
                var8 = 6;
                var15 = 0;
                L2: while (true) {
                  if (var15 < param2) {
                    L3: {
                      if (var15 >= param4[0].field_y) {
                        if (param2 - var15 > param4[0].field_y) {
                          var7 = 1;
                          break L3;
                        } else {
                          L4: {
                            if (param2 - var15 != param4[0].field_y) {
                              break L4;
                            } else {
                              var10 = 0;
                              break L4;
                            }
                          }
                          var7 = 2;
                          break L3;
                        }
                      } else {
                        var7 = 0;
                        break L3;
                      }
                    }
                    var16 = var7 + var8;
                    var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
                    var10++;
                    if (var17 != 0) {
                      L5: {
                        if ((var17 & 65280) != var17) {
                          break L5;
                        } else {
                          var17 = fe.a(var11, var17 >> 8, 0, 0);
                          break L5;
                        }
                      }
                      var6[3].field_B[var15 + (var14 - param3 + param4[0].field_v) * param2] = var17;
                      var15++;
                      continue L2;
                    } else {
                      var15++;
                      continue L2;
                    }
                  } else {
                    var9++;
                    var14++;
                    continue L0;
                  }
                }
              } else {
                var10 = 0;
                var15 = 0;
                L6: while (true) {
                  if (var15 >= param4[0].field_y) {
                    var9++;
                    var9++;
                    var14++;
                    continue L0;
                  } else {
                    L7: {
                      var16 = 3;
                      var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
                      if (var17 == 0) {
                        break L7;
                      } else {
                        L8: {
                          if ((var17 & 65280) != var17) {
                            break L8;
                          } else {
                            var17 = fe.a(var11, var17 >> 8, 0, 0);
                            break L8;
                          }
                        }
                        var6[1].field_B[var15 + (var14 - param4[0].field_v) * param4[0].field_y] = var17;
                        break L7;
                      }
                    }
                    var16 = 5;
                    var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
                    if (var17 != 0) {
                      L9: {
                        if ((var17 & 65280) != var17) {
                          break L9;
                        } else {
                          var17 = fe.a(var11, var17 >> 8, 0, 0);
                          break L9;
                        }
                      }
                      var6[2].field_B[var15 + (var14 - param4[0].field_v) * param4[0].field_y] = var17;
                      var10++;
                      var15++;
                      continue L6;
                    } else {
                      var10++;
                      var15++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              var8 = 0;
              var15 = 0;
              L10: while (true) {
                if (var15 < param2) {
                  L11: {
                    if (var15 >= param4[0].field_y) {
                      if (param2 - var15 > param4[0].field_y) {
                        var7 = 1;
                        break L11;
                      } else {
                        L12: {
                          if (param2 - var15 != param4[0].field_y) {
                            break L12;
                          } else {
                            var10 = 0;
                            break L12;
                          }
                        }
                        var7 = 2;
                        break L11;
                      }
                    } else {
                      var7 = 0;
                      break L11;
                    }
                  }
                  var16 = var7 + var8;
                  var17 = param4[var16].field_B[var10 % param4[0].field_y + var9 % param4[0].field_v * param4[0].field_y];
                  var10++;
                  if (var17 != 0) {
                    L13: {
                      if ((var17 & 65280) != var17) {
                        break L13;
                      } else {
                        var17 = fe.a(var11, var17 >> 8, 0, 0);
                        break L13;
                      }
                    }
                    var6[0].field_B[var15 + var14 * param2] = var17;
                    var15++;
                    continue L10;
                  } else {
                    var15++;
                    continue L10;
                  }
                } else {
                  var9++;
                  var14++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final static void a(wk param0) {
        int var1 = 0;
        if (param0 == null) {
          return;
        } else {
          if (param0.field_B != null) {
            var1 = 0;
            L0: while (true) {
              if (var1 >= param0.field_B.length) {
                return;
              } else {
                if (param0.field_B[var1] == 1) {
                  param0.field_B[var1] = 0;
                  var1++;
                  continue L0;
                } else {
                  var1++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    private final static void a(String param0, int param1, int param2) {
        fe.a(param0, param1, param2, false);
    }

    final static void a(wk param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
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
        Exception var19 = null;
        int var19_int = 0;
        int var20 = 0;
        int var21 = 0;
        Throwable decompiledCaughtException = null;
        L0: {
          L1: {
            if (field_e == null) {
              break L1;
            } else {
              if (field_e.length == qn.field_l) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          field_e = new int[qn.field_l];
          break L0;
        }
        var7 = param2 & 15;
        var8 = param1 & 15;
        param2 = param2 >> 4;
        param1 = param1 >> 4;
        var15 = param3 + param4 * qn.field_l;
        var16 = qn.field_l - param5;
        var17 = param2 * param0.field_y + param1;
        var18 = param0.field_y - param5;
        try {
          L2: {
            var19_int = -qn.field_g;
            L3: while (true) {
              if (var19_int >= 0) {
                break L2;
              } else {
                var20 = param6[-1 - var19_int];
                var21 = param5 - 1;
                L4: while (true) {
                  if (var21 < 0) {
                    var15 = var15 + var16;
                    param6[-1 - var19_int] = var20;
                    var19_int++;
                    var17 = var17 + var18;
                    continue L3;
                  } else {
                    var9 = param0.field_B[var17];
                    var10 = var9 & 16711935;
                    var11 = var9 & 65280;
                    var13 = var10 * var8 & 267390960;
                    var14 = var11 * var8 & 1044480;
                    var12 = var13 | var14;
                    var11 = var12 + var20;
                    var20 = (var9 << 4) - var12;
                    var10 = var11 & 267390960;
                    var9 = var11 & 1044480;
                    var13 = var10 * var7 & -16711936;
                    var14 = var9 * var7 & 16711680;
                    var12 = var13 | var14;
                    qn.field_d[var15] = var12 + field_e[var21] >> 8;
                    field_e[var21] = (var11 << 4) - var12;
                    var21--;
                    var15++;
                    var17++;
                    continue L4;
                  }
                }
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = (Exception) (Object) decompiledCaughtException;
          return;
        }
    }

    final static void c(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
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
        L0: {
          var4 = 1;
          var5 = param2 * param2;
          var6 = (param2 - var4) * (param2 - var4);
          var7 = var5 - var6;
          var8 = param0 - param2 - 1;
          var9 = param0 + param2 + 1;
          if (var8 >= qn.field_j) {
            break L0;
          } else {
            var8 = qn.field_j;
            break L0;
          }
        }
        if (var8 <= qn.field_e) {
          if (var9 >= qn.field_j) {
            L1: {
              if (var9 <= qn.field_e) {
                break L1;
              } else {
                var9 = qn.field_e;
                break L1;
              }
            }
            L2: {
              var10 = param1 - param2 - 1;
              var11 = param1 + param2 + 1;
              if (var10 >= qn.field_a) {
                break L2;
              } else {
                var10 = qn.field_a;
                break L2;
              }
            }
            if (var10 <= qn.field_f) {
              if (var11 >= qn.field_a) {
                L3: {
                  if (var11 <= qn.field_f) {
                    break L3;
                  } else {
                    var11 = qn.field_f;
                    break L3;
                  }
                }
                L4: {
                  if (field_m <= 0) {
                    break L4;
                  } else {
                    L5: {
                      var12 = field_f - field_m;
                      var13 = field_f + field_m;
                      var14 = field_n - field_m;
                      var15 = field_n + field_m;
                      if (var8 >= var12) {
                        break L5;
                      } else {
                        var8 = var12;
                        break L5;
                      }
                    }
                    if (var8 <= var13) {
                      if (var9 >= var12) {
                        L6: {
                          if (var9 <= var13) {
                            break L6;
                          } else {
                            var9 = var13;
                            break L6;
                          }
                        }
                        L7: {
                          if (var10 >= var14) {
                            break L7;
                          } else {
                            var10 = var14;
                            break L7;
                          }
                        }
                        if (var10 <= var15) {
                          if (var11 >= var14) {
                            if (var11 <= var15) {
                              break L4;
                            } else {
                              var11 = var15;
                              break L4;
                            }
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
                var12 = var8 + var10 * qn.field_l;
                var13 = qn.field_l + var8 - var9;
                var14 = var10;
                L8: while (true) {
                  if (var14 >= var11) {
                    return;
                  } else {
                    var15 = var8;
                    L9: while (true) {
                      if (var15 >= var9) {
                        var12 = var12 + var13;
                        var14++;
                        continue L8;
                      } else {
                        if (!fe.c(var15, var14)) {
                          var16 = param0 - var15;
                          var17 = param1 - var14;
                          var18 = var16 * var16 + var17 * var17;
                          if (var18 < var5) {
                            if (var18 >= var6) {
                              var18 = 256 - (var18 - var6 << 8) / var7;
                              qn.field_d[var12] = fe.a(qn.field_d[var12], param3, var18);
                              var12++;
                              var15++;
                              continue L9;
                            } else {
                              qn.field_d[var12] = param3;
                              if (var16 > 0) {
                                var19 = 0;
                                L10: while (true) {
                                  if (var19 < var16 * 2) {
                                    if (var15 < var9) {
                                      qn.field_d[var12] = param3;
                                      var12++;
                                      var15++;
                                      if (!fe.c(var15, var14)) {
                                        var19++;
                                        continue L10;
                                      } else {
                                        var15--;
                                        var15++;
                                        continue L9;
                                      }
                                    } else {
                                      var15--;
                                      var15++;
                                      continue L9;
                                    }
                                  } else {
                                    var15--;
                                    var15++;
                                    continue L9;
                                  }
                                }
                              } else {
                                var12++;
                                var15++;
                                continue L9;
                              }
                            }
                          } else {
                            var12++;
                            var15++;
                            continue L9;
                          }
                        } else {
                          var12++;
                          var15++;
                          continue L9;
                        }
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
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void c(String param0, int param1, int param2, int param3, boolean param4) {
        param1 = param1 - (field_i.a(param0) >> (param4 ? 2 : 1));
        fe.a(param0, param1, param2, param3, param4);
    }

    private final static int a(int param0, int param1, int param2) {
        if (param2 < 1) {
            return param0;
        }
        if (param2 > 255) {
            return param1;
        }
        int var3 = param0 & 16711935;
        int var4 = param0 & 65280;
        int var5 = param1 & 16711935;
        int var6 = param1 & 65280;
        int var7 = 256 - param2;
        return var3 * var7 + var5 * param2 >> 8 & 16711935 | var4 * var7 + var6 * param2 >> 8 & 65280;
    }

    public static void b() {
        field_o = (int[][]) null;
        field_l = null;
        field_i = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_e = null;
    }

    final static void c(wk param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        param2 -= 3;
        param1 = param1 + param0.field_w;
        param2 = param2 + param0.field_z;
        var5 = 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= param0.field_v) {
            return;
          } else {
            var7 = 0;
            L1: while (true) {
              if (var7 >= param3) {
                var5 = var5 + (param0.field_y - param3);
                var6++;
                continue L0;
              } else {
                if (param0.field_B[var5] > 0) {
                  fe.b(param1 + var7, param2 + var6, param4, param0.field_B[var5] & 255);
                  var5++;
                  var7++;
                  continue L1;
                } else {
                  var5++;
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var10 = -param7;
        L0: while (true) {
          if (var10 >= 0) {
            return;
          } else {
            var11 = -param6;
            L1: while (true) {
              if (var11 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var10++;
                continue L0;
              } else {
                incrementValue$14 = param4;
                param4++;
                param3 = param2[incrementValue$14];
                if (param3 != 0) {
                  param0 = param1[param5];
                  if (param0 != 0) {
                    var12 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                    var13 = (param3 & 65280) * (param0 & 65280) >>> 24;
                    var14 = (param3 & 255) * (param0 & 255) >>> 8;
                    incrementValue$15 = param5;
                    param5++;
                    param1[incrementValue$15] = (var12 << 16) + (var13 << 8) + var14;
                    var11++;
                    continue L1;
                  } else {
                    param5++;
                    var11++;
                    continue L1;
                  }
                } else {
                  param5++;
                  var11++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(String param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        field_d[0] = param3 << (param4 ? 1 : 0);
        int var5 = field_i.a(param0, field_d, field_k);
        int var6 = field_i.field_v >> (param4 ? 1 : 0);
        for (var7 = 0; var7 < var5; var7++) {
            fe.b(field_k[var7], param1, param2 + var6 * var7, param4);
        }
    }

    final static int b(int param0, int param1) {
        int var2 = (param0 & 16711935) * param1 >>> 8;
        int var3 = (param0 & 65280) * param1 >>> 8;
        return var2 & 16711935 | var3 & 65280;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 15;
        int var6 = 64;
        fe.a(param0, param1, param2, param3, param4, var5, var6);
    }

    private final static void a() {
        field_h = qn.field_j;
        field_a = qn.field_a;
        field_j = qn.field_e;
        field_c = qn.field_f;
    }

    private final static void b(int param0, int param1, int param2, int param3) {
        if (param0 < qn.field_j) {
            return;
        }
        if (param0 >= qn.field_e) {
            return;
        }
        if (param1 < qn.field_a) {
            return;
        }
        if (param1 >= qn.field_f) {
            return;
        }
        int var4 = param2 & 65280;
        param2 = param2 & 16711935;
        var4 = var4 * param3;
        param2 = param2 * param3;
        var4 = var4 & 16711680;
        param2 = param2 & -16711936;
        int var5 = qn.field_l * param1 + param0;
        int var6 = qn.field_d[var5];
        var4 = var4 + ((var6 & 65280) * (256 - param3) & 16711680);
        param2 = param2 + ((var6 & 16711935) * (256 - param3) & -16711936);
        qn.field_d[var5] = (param2 | var4) >>> 8;
    }

    final static void a(wk param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param1 = param1 + param0.field_w;
          param2 = param2 + param0.field_z;
          var3 = param1 + param2 * qn.field_l;
          var4 = 0;
          var5 = param0.field_v;
          var6 = param0.field_y;
          var7 = qn.field_l - var6;
          var8 = 0;
          if (param2 >= qn.field_a) {
            break L0;
          } else {
            var9 = qn.field_a - param2;
            var5 = var5 - var9;
            param2 = qn.field_a;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * qn.field_l;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= qn.field_f) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - qn.field_f);
            break L1;
          }
        }
        L2: {
          if (param1 >= qn.field_j) {
            break L2;
          } else {
            var9 = qn.field_j - param1;
            var6 = var6 - var9;
            param1 = qn.field_j;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= qn.field_e) {
            break L3;
          } else {
            var9 = param1 + var6 - qn.field_e;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        if (var6 <= 0) {
          return;
        } else {
          if (var5 > 0) {
            fe.a(0, qn.field_d, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
            return;
          } else {
            return;
          }
        }
    }

    private final static void a(wk param0, int param1, int param2, int param3, int[] param4) {
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          param2 -= 3;
          if (param3 <= param0.field_y) {
            break L0;
          } else {
            param3 = param0.field_y;
            break L0;
          }
        }
        var5 = 0;
        var6 = param0.field_y;
        var7 = 0;
        L1: while (true) {
          if (var7 >= param0.field_v >> 1) {
            return;
          } else {
            var8 = param4[var7 * param4.length / (param0.field_v >> 1)];
            var9 = 0;
            L2: while (true) {
              if (var9 >= param3 >> 1) {
                var5 = var5 + (param0.field_y - param3);
                var5 = var5 + param0.field_y;
                var6 = var6 + (param0.field_y - param3);
                var6 = var6 + param0.field_y;
                var7++;
                continue L1;
              } else {
                incrementValue$4 = var5;
                var5++;
                var10 = param0.field_B[incrementValue$4] & 255;
                incrementValue$5 = var5;
                var5++;
                var10 = var10 + (param0.field_B[incrementValue$5] & 255);
                incrementValue$6 = var6;
                var6++;
                var10 = var10 + (param0.field_B[incrementValue$6] & 255);
                incrementValue$7 = var6;
                var6++;
                var10 = var10 + (param0.field_B[incrementValue$7] & 255);
                var10 = var10 >> 2;
                if (var10 > 0) {
                  fe.b(param1 + var9, param2 + var7, var8, var10);
                  var9++;
                  continue L2;
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final static void c() {
        qn.field_j = field_h;
        qn.field_a = field_a;
        qn.field_e = field_j;
        qn.field_f = field_c;
    }

    private final static void b(wk param0, int param1, int param2, int param3, int param4) {
        int incrementValue$256 = 0;
        int incrementValue$257 = 0;
        int incrementValue$258 = 0;
        int incrementValue$259 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          param2 -= 3;
          if (param3 <= param0.field_y) {
            break L0;
          } else {
            param3 = param0.field_y;
            break L0;
          }
        }
        var5 = 0;
        var6 = param0.field_y;
        var7 = 0;
        L1: while (true) {
          if (var7 >= param0.field_v >> 1) {
            return;
          } else {
            var8 = 0;
            L2: while (true) {
              if (var8 >= param3 >> 1) {
                var5 = var5 + (param0.field_y - param3);
                var5 = var5 + param0.field_y;
                var6 = var6 + (param0.field_y - param3);
                var6 = var6 + param0.field_y;
                var7++;
                continue L1;
              } else {
                incrementValue$256 = var5;
                var5++;
                var9 = param0.field_B[incrementValue$256] & 255;
                incrementValue$257 = var5;
                var5++;
                var9 = var9 + (param0.field_B[incrementValue$257] & 255);
                incrementValue$258 = var6;
                var6++;
                var9 = var9 + (param0.field_B[incrementValue$258] & 255);
                incrementValue$259 = var6;
                var6++;
                var9 = var9 + (param0.field_B[incrementValue$259] & 255);
                var9 = var9 >> 2;
                if (var9 > 0) {
                  fe.b(param1 + var8, param2 + var7, param4, var9);
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(String param0, int param1, int param2, int[] param3, int param4, boolean param5) {
        L0: {
          if (param4 != 0) {
            if (param4 != 1) {
              if (param4 != 2) {
                return;
              } else {
                fe.b(param0, param1, param2, param3, param5);
                break L0;
              }
            } else {
              fe.b(param0, param1, param2, param5);
              fe.c(param0, param1, param2, param3, param5);
              break L0;
            }
          } else {
            fe.a(param0, param1, param2, param5);
            fe.a(param0, param1, param2, param3, param5);
            break L0;
          }
        }
    }

    final static void a(String param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var8 = 0;
        field_d[0] = param3 << (param5 ? 1 : 0);
        int var6 = field_i.a(param0, field_d, field_k);
        int var7 = field_i.field_v >> (param5 ? 1 : 0);
        for (var8 = 0; var8 < var6; var8++) {
            fe.c(field_k[var8], param1, param2 + var7 * var8, param4, param5);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7, boolean param8) {
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
        int var21 = 0;
        int var22 = 0;
        L0: {
          if (param7 <= 0) {
            break L0;
          } else {
            qn.b(param0, param1, param2, param3, param6, param7);
            break L0;
          }
        }
        L1: {
          if (param0 < qn.field_j) {
            break L1;
          } else {
            if (param1 < qn.field_a) {
              break L1;
            } else {
              if (param0 + param2 >= qn.field_e) {
                break L1;
              } else {
                if (param1 + param3 >= qn.field_f) {
                  break L1;
                } else {
                  fe.a(param0, param1, param2, param3, param4, param5, param8);
                  return;
                }
              }
            }
          }
        }
        var9 = 0;
        var10 = 0;
        var11 = (param5.length << 16) / param3;
        var12 = 0;
        var13 = param4[0].field_y;
        var14 = param4[0].field_v;
        var16 = 0;
        L2: while (true) {
          if (var16 >= param3) {
            return;
          } else {
            L3: {
              if (var16 >= var14) {
                if (param3 - var16 > var14) {
                  var15 = 3;
                  break L3;
                } else {
                  var15 = 6;
                  if (param3 - var16 != var14) {
                    break L3;
                  } else {
                    var9 = 0;
                    break L3;
                  }
                }
              } else {
                var15 = 0;
                break L3;
              }
            }
            var10 = param5[var12 >> 16];
            var12 = var12 + var11;
            var19 = param0;
            var20 = 0;
            L4: while (true) {
              if (var20 >= 3) {
                var9++;
                var16++;
                continue L2;
              } else {
                var21 = var9 % var14 * var13;
                if (var20 != 1) {
                  var17 = -var13;
                  L5: while (true) {
                    if (var17 < 0) {
                      var22 = param4[var15].field_B[var21];
                      if (var22 != 0) {
                        L6: {
                          if ((var22 & -65281) != 0) {
                            break L6;
                          } else {
                            var22 = fe.a(var10, var22 >> 8, 0, 0);
                            break L6;
                          }
                        }
                        qn.a(var19, param1 + var16, var22);
                        var17++;
                        var21++;
                        var19++;
                        continue L5;
                      } else {
                        var17++;
                        var21++;
                        var19++;
                        continue L5;
                      }
                    } else {
                      var20++;
                      var15++;
                      continue L4;
                    }
                  }
                } else {
                  L7: {
                    var18 = param2 - (var13 << 1);
                    if (var15 != 4) {
                      break L7;
                    } else {
                      if (param8) {
                        break L7;
                      } else {
                        var19 = var19 + var18;
                        var20++;
                        var15++;
                        continue L4;
                      }
                    }
                  }
                  var22 = param4[var15].field_B[var21];
                  if (var22 != 0) {
                    var17 = -var18;
                    L8: while (true) {
                      if (var17 < 0) {
                        L9: {
                          if ((var22 & -65281) != 0) {
                            break L9;
                          } else {
                            var22 = fe.a(var10, var22 >> 8, 0, 0);
                            break L9;
                          }
                        }
                        qn.a(var19, param1 + var16, var22);
                        var17++;
                        var19++;
                        continue L8;
                      } else {
                        var20++;
                        var15++;
                        continue L4;
                      }
                    }
                  } else {
                    var19 = var19 + var18;
                    var20++;
                    var15++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
    }

    final static void b(String param0, int param1, int param2, boolean param3) {
        param1 = param1 - (field_i.a(param0) >> (param3 ? 2 : 1));
        fe.a(param0, param1, param2, param3);
    }

    final static void a(d param0) {
        field_i = param0;
        int var1 = 1000;
        int var2 = field_i.field_v + field_i.field_L + 6;
        if ((var2 & 1) == 1) {
            var2++;
        }
        field_g = new wk(var1, var2);
    }

    final static void a(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7, String param8, boolean param9, int[] param10) {
        fe.b(param0, param1, param2, param3, param4, param5, param6, param7);
        int var11 = param0 + param2 / 2;
        int var12 = param1 + field_i.field_v / (param9 ? 2 : 1) - 4;
        fe.a(param8, var11, var12, param10, 1, param9);
    }

    final static void a(String param0, int param1, int param2, int param3, int[] param4, boolean param5) {
        fe.a(param0, param1, param2, param3, param4, param5, 0, 0);
    }

    final static void b(String param0, int param1, int param2) {
        param1 = param1 - (field_i.a(param0) >> 1);
        fe.a(param0, param1, param2);
    }

    private final static int a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        param2 = param0 & 16711935;
        param3 = param0 & 65280;
        if (param1 < 128) {
            param0 = (param2 * param1 & 2139127680 | param3 * param1 & 8355840) >>> 7;
        } else {
            param1 -= 128;
            var4 = 256 - param1;
            param2 = param2 * var4;
            param3 = param3 * var4;
            param2 = param2 + 16711935 * param1;
            param3 = param3 + 65280 * param1;
            param0 = (param2 & -16711936 | param3 & 16711680) >>> 8;
        }
        return param0;
    }

    final static void b(int param0, int param1, int param2, int param3, wk[] param4, int[] param5, int param6, int param7) {
        fe.a(param0, param1, param2, param3, param4, param5, param6, param7, false);
    }

    private final static void a(int param0, int[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var11 = -param7;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param6;
            L1: while (true) {
              if (var12 >= 0) {
                param5 = param5 + param8;
                param4 = param4 + param9;
                var11++;
                continue L0;
              } else {
                incrementValue$2 = param4;
                param4++;
                param3 = param2[incrementValue$2];
                if (param3 != 0) {
                  param0 = param1[param5];
                  if (param0 != 0) {
                    var13 = ((param3 & 16711680) >>> 16) * ((param0 & 16711680) >>> 16) >>> 8;
                    var14 = (param3 & 65280) * (param0 & 65280) >>> 24;
                    var15 = (param3 & 255) * (param0 & 255) >>> 8;
                    var13 = var13 * param10 + ((param0 & 16711680) >>> 16) * (256 - param10) >> 8;
                    var14 = var14 * param10 + ((param0 & 65280) >>> 8) * (256 - param10) >> 8;
                    var15 = var15 * param10 + (param0 & 255) * (256 - param10) >> 8;
                    incrementValue$3 = param5;
                    param5++;
                    param1[incrementValue$3] = (var13 << 16) + (var14 << 8) + var15;
                    var12++;
                    continue L1;
                  } else {
                    param5++;
                    var12++;
                    continue L1;
                  }
                } else {
                  param5++;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void b(wk param0, int param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          param2 -= 3;
          var5 = 0;
          if (param3 <= param0.field_y) {
            break L0;
          } else {
            param3 = param0.field_y;
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= param0.field_v) {
            return;
          } else {
            var7 = param4[var6 * param4.length / param0.field_v];
            var8 = 0;
            L2: while (true) {
              if (var8 >= param3) {
                var5 = var5 + (param0.field_y - param3);
                var6++;
                continue L1;
              } else {
                if (param0.field_B[var5] > 0) {
                  fe.b(param1 + var8, param2 + var6, var7, param0.field_B[var5] & 255);
                  var5++;
                  var8++;
                  continue L2;
                } else {
                  var5++;
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        field_b = 0;
        field_k = new String[20];
        field_m = -1;
        field_d = new int[]{0};
    }
}
