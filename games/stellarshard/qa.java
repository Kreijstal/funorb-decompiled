/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    private static int[] field_j;
    private static int[] field_k;
    private static int field_s;
    private static int field_g;
    private static int field_b;
    private static int[] field_v;
    private static int[] field_a;
    private static int[] field_p;
    private static int field_r;
    private static int[] field_d;
    private static int field_f;
    private static boolean field_i;
    private static int[] field_o;
    private static int field_m;
    private static int[] field_u;
    private static int[] field_e;
    private static int field_n;
    private static int[] field_q;
    private static int[] field_h;
    private static int[] field_t;
    private static int[] field_c;
    private static boolean field_l;

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int[] param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Exception var18 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          field_s = param0;
          field_m = param1;
          field_r = param2;
          field_n = param9;
          field_g = param10;
          field_b = param11;
          var12 = cc.field_n;
          var13 = cc.field_p;
          var14 = 0;
          var15 = param3[param6];
          var16 = param4[param6];
          var17 = param5[param6];
          if (var17 < field_f) {
            field_q[0] = -5000;
            var14 = 1;
            break L0;
          } else {
            field_q[0] = var12 + (var15 << 9) / var17;
            field_a[0] = var13 + (var16 << 9) / var17;
            break L0;
          }
        }
        L1: {
          field_c[0] = var15;
          field_k[0] = var16;
          field_u[0] = var17;
          var15 = param3[param7];
          var16 = param4[param7];
          var17 = param5[param7];
          if (var17 < field_f) {
            field_q[1] = -5000;
            var14 = 1;
            break L1;
          } else {
            field_q[1] = var12 + (var15 << 9) / var17;
            field_a[1] = var13 + (var16 << 9) / var17;
            break L1;
          }
        }
        L2: {
          field_c[1] = var15;
          field_k[1] = var16;
          field_u[1] = var17;
          var15 = param3[param8];
          var16 = param4[param8];
          var17 = param5[param8];
          if (var17 < field_f) {
            field_q[2] = -5000;
            var14 = 1;
            break L2;
          } else {
            field_q[2] = var12 + (var15 << 9) / var17;
            field_a[2] = var13 + (var16 << 9) / var17;
            break L2;
          }
        }
        field_c[2] = var15;
        field_k[2] = var16;
        field_u[2] = var17;
        try {
          L3: {
            qa.a(var14 != 0, false, 0);
            break L3;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var18 = (Exception) (Object) decompiledCaughtException;
            break L4;
          }
        }
    }

    private final static void a() {
        int var0 = 0;
        if (field_i) {
          qa.b();
          return;
        } else {
          L0: {
            cc.field_q = field_l;
            cc.field_d = field_s;
            var0 = field_m & 3;
            if (var0 != 0) {
              if (var0 != 1) {
                if (var0 != 2) {
                  if (var0 != 3) {
                    break L0;
                  } else {
                    cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                    break L0;
                  }
                } else {
                  cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_g, field_b, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                  break L0;
                }
              } else {
                cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_t[field_n]);
                break L0;
              }
            } else {
              cc.a(field_a[0], field_a[1], field_a[2], field_q[0], field_q[1], field_q[2], field_n, field_g, field_b);
              break L0;
            }
          }
          return;
        }
    }

    final static void a(int[] param0, int[] param1, int[] param2, int param3, int param4, int param5, int[] param6, int[] param7, int param8, int param9, int param10) {
        int var11 = param6[param8];
        int var12 = param7[param8];
        int var13 = param6[param9];
        int var14 = param7[param9];
        int var15 = param6[param10];
        int var16 = param7[param10];
        int var17 = var13 * var16 - var15 * var14 + 2048 >> 12;
        int var18 = var14 * 4096 - var16 * 4096 + 2048 >> 12;
        int var19 = 4096 * var15 - 4096 * var13 + 2048 >> 12;
        int var20 = var15 * var12 - var11 * var16 + 2048 >> 12;
        int var21 = var16 * 4096 - var12 * 4096 + 2048 >> 12;
        int var22 = 4096 * var11 - 4096 * var15 + 2048 >> 12;
        int var23 = var11 * var14 - var13 * var12 + 2048 >> 12;
        int var24 = var12 * 4096 - var14 * 4096 + 2048 >> 12;
        int var25 = 4096 * var13 - 4096 * var11 + 2048 >> 12;
        int var26 = 16777216 / (4096 * var17 + var11 * var18 + var12 * var19 + 2048 >> 12);
        var17 = var17 * var26 + 2048 >> 12;
        var20 = var20 * var26 + 2048 >> 12;
        var23 = var23 * var26 + 2048 >> 12;
        var18 = var18 * var26 + 2048 >> 12;
        var21 = var21 * var26 + 2048 >> 12;
        var24 = var24 * var26 + 2048 >> 12;
        var19 = var19 * var26 + 2048 >> 12;
        var22 = var22 * var26 + 2048 >> 12;
        var25 = var25 * var26 + 2048 >> 12;
        int var27 = param0[param3];
        int var28 = param1[param3];
        int var29 = param2[param3];
        int var30 = param0[param4];
        int var31 = param1[param4];
        int var32 = param2[param4];
        int var33 = param0[param5];
        int var34 = param1[param5];
        int var35 = param2[param5];
        var26 = var27 * var17 + var30 * var20 + var33 * var23;
        field_v[0] = var27 * var17 + var30 * var20 + var33 * var23 + 2048 >> 12;
        field_v[1] = var26 + var27 * var18 + var30 * var21 + var33 * var24 + 2048 >> 12;
        field_v[2] = var26 + var27 * var19 + var30 * var22 + var33 * var25 + 2048 >> 12;
        var26 = var28 * var17 + var31 * var20 + var34 * var23;
        field_o[0] = var28 * var17 + var31 * var20 + var34 * var23 + 2048 >> 12;
        field_o[1] = var26 + var28 * var18 + var31 * var21 + var34 * var24 + 2048 >> 12;
        field_o[2] = var26 + var28 * var19 + var31 * var22 + var34 * var25 + 2048 >> 12;
        var26 = var29 * var17 + var32 * var20 + var35 * var23;
        field_j[0] = var29 * var17 + var32 * var20 + var35 * var23 + 2048 >> 12;
        field_j[1] = var26 + var29 * var18 + var32 * var21 + var35 * var24 + 2048 >> 12;
        field_j[2] = var26 + var29 * var19 + var32 * var22 + var35 * var25 + 2048 >> 12;
    }

    public static void c() {
        field_q = null;
        field_a = null;
        field_c = null;
        field_k = null;
        field_u = null;
        field_v = null;
        field_o = null;
        field_j = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_t = null;
        field_p = null;
    }

    private final static void b() {
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
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
        L0: {
          var0 = cc.field_n;
          var1 = cc.field_p;
          var2 = 0;
          var3 = field_u[0];
          var4 = field_u[1];
          var5 = field_u[2];
          if (var3 < field_f) {
            L1: {
              var6 = field_c[0];
              var7 = field_k[0];
              var8 = field_n;
              if (var5 < field_f) {
                break L1;
              } else {
                var9 = (field_f - var3) * field_p[var5 - var3];
                field_h[var2] = var0 + (var6 + ((field_c[2] - var6) * var9 >> 16) << 9) / field_f;
                field_e[var2] = var1 + (var7 + ((field_k[2] - var7) * var9 >> 16) << 9) / field_f;
                incrementValue$9 = var2;
                var2++;
                field_d[incrementValue$9] = var8 + ((field_b - var8) * var9 >> 16);
                break L1;
              }
            }
            if (var4 < field_f) {
              break L0;
            } else {
              var9 = (field_f - var3) * field_p[var4 - var3];
              field_h[var2] = var0 + (var6 + ((field_c[1] - var6) * var9 >> 16) << 9) / field_f;
              field_e[var2] = var1 + (var7 + ((field_k[1] - var7) * var9 >> 16) << 9) / field_f;
              incrementValue$10 = var2;
              var2++;
              field_d[incrementValue$10] = var8 + ((field_g - var8) * var9 >> 16);
              break L0;
            }
          } else {
            field_h[var2] = field_q[0];
            field_e[var2] = field_a[0];
            incrementValue$11 = var2;
            var2++;
            field_d[incrementValue$11] = field_n;
            break L0;
          }
        }
        L2: {
          if (var4 < field_f) {
            L3: {
              var6 = field_c[1];
              var7 = field_k[1];
              var8 = field_g;
              if (var3 < field_f) {
                break L3;
              } else {
                var9 = (field_f - var4) * field_p[var3 - var4];
                field_h[var2] = var0 + (var6 + ((field_c[0] - var6) * var9 >> 16) << 9) / field_f;
                field_e[var2] = var1 + (var7 + ((field_k[0] - var7) * var9 >> 16) << 9) / field_f;
                incrementValue$12 = var2;
                var2++;
                field_d[incrementValue$12] = var8 + ((field_n - var8) * var9 >> 16);
                break L3;
              }
            }
            if (var5 < field_f) {
              break L2;
            } else {
              var9 = (field_f - var4) * field_p[var5 - var4];
              field_h[var2] = var0 + (var6 + ((field_c[2] - var6) * var9 >> 16) << 9) / field_f;
              field_e[var2] = var1 + (var7 + ((field_k[2] - var7) * var9 >> 16) << 9) / field_f;
              incrementValue$13 = var2;
              var2++;
              field_d[incrementValue$13] = var8 + ((field_b - var8) * var9 >> 16);
              break L2;
            }
          } else {
            field_h[var2] = field_q[1];
            field_e[var2] = field_a[1];
            incrementValue$14 = var2;
            var2++;
            field_d[incrementValue$14] = field_g;
            break L2;
          }
        }
        L4: {
          if (var5 < field_f) {
            L5: {
              var6 = field_c[2];
              var7 = field_k[2];
              var8 = field_b;
              if (var4 < field_f) {
                break L5;
              } else {
                var9 = (field_f - var5) * field_p[var4 - var5];
                field_h[var2] = var0 + (var6 + ((field_c[1] - var6) * var9 >> 16) << 9) / field_f;
                field_e[var2] = var1 + (var7 + ((field_k[1] - var7) * var9 >> 16) << 9) / field_f;
                incrementValue$15 = var2;
                var2++;
                field_d[incrementValue$15] = var8 + ((field_g - var8) * var9 >> 16);
                break L5;
              }
            }
            if (var3 < field_f) {
              break L4;
            } else {
              var9 = (field_f - var5) * field_p[var3 - var5];
              field_h[var2] = var0 + (var6 + ((field_c[0] - var6) * var9 >> 16) << 9) / field_f;
              field_e[var2] = var1 + (var7 + ((field_k[0] - var7) * var9 >> 16) << 9) / field_f;
              incrementValue$16 = var2;
              var2++;
              field_d[incrementValue$16] = var8 + ((field_n - var8) * var9 >> 16);
              break L4;
            }
          } else {
            field_h[var2] = field_q[2];
            field_e[var2] = field_a[2];
            incrementValue$17 = var2;
            var2++;
            field_d[incrementValue$17] = field_b;
            break L4;
          }
        }
        L6: {
          var6 = field_h[0];
          var7 = field_h[1];
          var8 = field_h[2];
          var9 = field_e[0];
          var10 = field_e[1];
          var11 = field_e[2];
          cc.field_q = false;
          if (var2 != 3) {
            break L6;
          } else {
            L7: {
              L8: {
                if (var6 < 0) {
                  break L8;
                } else {
                  if (var7 < 0) {
                    break L8;
                  } else {
                    if (var8 < 0) {
                      break L8;
                    } else {
                      if (var6 > cc.field_m) {
                        break L8;
                      } else {
                        if (var7 > cc.field_m) {
                          break L8;
                        } else {
                          if (var8 <= cc.field_m) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                }
              }
              cc.field_q = true;
              break L7;
            }
            var12 = field_m & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L6;
                  } else {
                    cc.a(var9, var10, var11, var6, var7, var8, field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                    break L6;
                  }
                } else {
                  cc.a(var9, var10, var11, var6, var7, var8, field_d[0], field_d[1], field_d[2], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                  break L6;
                }
              } else {
                cc.a(var9, var10, var11, var6, var7, var8, field_t[field_n]);
                break L6;
              }
            } else {
              cc.a(var9, var10, var11, var6, var7, var8, field_d[0], field_d[1], field_d[2]);
              break L6;
            }
          }
        }
        L9: {
          if (var2 != 4) {
            break L9;
          } else {
            L10: {
              L11: {
                if (var6 < 0) {
                  break L11;
                } else {
                  if (var7 < 0) {
                    break L11;
                  } else {
                    if (var8 < 0) {
                      break L11;
                    } else {
                      if (var6 > cc.field_m) {
                        break L11;
                      } else {
                        if (var7 > cc.field_m) {
                          break L11;
                        } else {
                          if (var8 > cc.field_m) {
                            break L11;
                          } else {
                            if (field_h[3] < 0) {
                              break L11;
                            } else {
                              if (field_h[3] <= cc.field_m) {
                                break L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              cc.field_q = true;
              break L10;
            }
            var12 = field_m & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L9;
                  } else {
                    cc.a(var9, var10, var11, var6, var7, var8, field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                    cc.a(var9, var11, field_e[3], var6, var8, field_h[3], field_n, field_n, field_n, field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                    break L9;
                  }
                } else {
                  cc.a(var9, var10, var11, var6, var7, var8, field_d[0], field_d[1], field_d[2], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                  cc.a(var9, var11, field_e[3], var6, var8, field_h[3], field_d[0], field_d[2], field_d[3], field_v[0], field_v[1], field_v[2], field_o[0], field_o[1], field_o[2], field_j[0], field_j[1], field_j[2], field_r);
                  break L9;
                }
              } else {
                var13 = field_t[field_n];
                cc.a(var9, var10, var11, var6, var7, var8, var13);
                cc.a(var9, var11, field_e[3], var6, var8, field_h[3], var13);
                break L9;
              }
            } else {
              cc.a(var9, var10, var11, var6, var7, var8, field_d[0], field_d[1], field_d[2]);
              cc.a(var9, var11, field_e[3], var6, var8, field_h[3], field_d[0], field_d[2], field_d[3]);
              break L9;
            }
          }
        }
    }

    private final static void a(boolean param0, boolean param1, int param2) {
        int var3 = 0;
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
        if (field_m != -1) {
          L0: {
            var3 = field_q[0];
            var4 = field_q[1];
            var5 = field_q[2];
            if (!param0) {
              break L0;
            } else {
              L1: {
                if (var3 == -5000) {
                  break L1;
                } else {
                  if (var4 == -5000) {
                    break L1;
                  } else {
                    if (var5 != -5000) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var6 = field_c[0];
              var7 = field_c[1];
              var8 = field_c[2];
              var9 = field_k[0];
              var10 = field_k[1];
              var11 = field_k[2];
              var12 = field_u[0];
              var13 = field_u[1];
              var14 = field_u[2];
              var6 = var6 - var7;
              var8 = var8 - var7;
              var9 = var9 - var10;
              var11 = var11 - var10;
              var12 = var12 - var13;
              var14 = var14 - var13;
              var15 = var9 * var14 - var12 * var11;
              var16 = var12 * var8 - var6 * var14;
              var17 = var6 * var11 - var9 * var8;
              if (var7 * var15 + var10 * var16 + var13 * var17 > 0) {
                field_i = true;
                qa.a();
                return;
              } else {
                return;
              }
            }
          }
          if ((var3 - var4) * (field_a[2] - field_a[1]) - (field_a[0] - field_a[1]) * (var5 - var4) <= 0) {
            return;
          } else {
            L2: {
              L3: {
                field_i = false;
                if (var3 < 0) {
                  break L3;
                } else {
                  if (var4 < 0) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var3 > cc.field_m) {
                        break L3;
                      } else {
                        if (var4 > cc.field_m) {
                          break L3;
                        } else {
                          if (var5 <= cc.field_m) {
                            field_l = false;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              field_l = true;
              break L2;
            }
            qa.a();
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_p = cc.field_l;
        field_o = new int[3];
        field_v = new int[3];
        field_e = new int[10];
        field_d = new int[10];
        field_a = new int[3];
        field_k = new int[3];
        field_f = 50;
        field_q = new int[3];
        field_h = new int[10];
        field_j = new int[3];
        field_u = new int[3];
        field_c = new int[3];
        field_t = cc.field_e;
    }
}
