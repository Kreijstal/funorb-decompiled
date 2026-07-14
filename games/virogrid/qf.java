/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    private static boolean field_h;
    private static int[] field_f;
    private static int[] field_v;
    private static int field_m;
    private static int[] field_a;
    private static int[] field_u;
    private static int field_p;
    private static int field_b;
    private static int[] field_e;
    private static int[] field_j;
    private static int[] field_c;
    private static int field_q;
    private static int field_d;
    private static int[] field_g;
    private static int[] field_n;
    private static boolean field_o;
    private static int field_t;
    private static int[] field_i;
    private static int field_k;
    private static int[] field_r;
    private static int[] field_s;
    private static int[] field_l;

    private final static void b() {
        int var0 = 0;
        if (!field_o) {
          L0: {
            fk.field_g = field_h;
            fk.field_d = field_p;
            var0 = field_q & 3;
            if (var0 != 0) {
              if (var0 != 1) {
                if (var0 != 2) {
                  if (var0 != 3) {
                    break L0;
                  } else {
                    fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                    break L0;
                  }
                } else {
                  fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_t, field_d, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                  break L0;
                }
              } else {
                fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_j[field_m]);
                break L0;
              }
            } else {
              fk.a(field_v[0], field_v[1], field_v[2], field_e[0], field_e[1], field_e[2], field_m, field_t, field_d);
              break L0;
            }
          }
          return;
        } else {
          qf.a();
          return;
        }
    }

    private final static void a() {
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
          var0 = fk.field_j;
          var1 = fk.field_k;
          var2 = 0;
          var3 = field_a[0];
          var4 = field_a[1];
          var5 = field_a[2];
          if (var3 < field_k) {
            L1: {
              var6 = field_g[0];
              var7 = field_l[0];
              var8 = field_m;
              if (var5 < field_k) {
                break L1;
              } else {
                var9 = (field_k - var3) * field_c[var5 - var3];
                field_r[var2] = var0 + (var6 + ((field_g[2] - var6) * var9 >> 16) << 9) / field_k;
                field_s[var2] = var1 + (var7 + ((field_l[2] - var7) * var9 >> 16) << 9) / field_k;
                var2++;
                field_n[var2] = var8 + ((field_d - var8) * var9 >> 16);
                break L1;
              }
            }
            if (var4 < field_k) {
              break L0;
            } else {
              var9 = (field_k - var3) * field_c[var4 - var3];
              field_r[var2] = var0 + (var6 + ((field_g[1] - var6) * var9 >> 16) << 9) / field_k;
              field_s[var2] = var1 + (var7 + ((field_l[1] - var7) * var9 >> 16) << 9) / field_k;
              var2++;
              field_n[var2] = var8 + ((field_t - var8) * var9 >> 16);
              break L0;
            }
          } else {
            field_r[var2] = field_e[0];
            field_s[var2] = field_v[0];
            var2++;
            field_n[var2] = field_m;
            break L0;
          }
        }
        L2: {
          if (var4 < field_k) {
            L3: {
              var6 = field_g[1];
              var7 = field_l[1];
              var8 = field_t;
              if (var3 < field_k) {
                break L3;
              } else {
                var9 = (field_k - var4) * field_c[var3 - var4];
                field_r[var2] = var0 + (var6 + ((field_g[0] - var6) * var9 >> 16) << 9) / field_k;
                field_s[var2] = var1 + (var7 + ((field_l[0] - var7) * var9 >> 16) << 9) / field_k;
                var2++;
                field_n[var2] = var8 + ((field_m - var8) * var9 >> 16);
                break L3;
              }
            }
            if (var5 < field_k) {
              break L2;
            } else {
              var9 = (field_k - var4) * field_c[var5 - var4];
              field_r[var2] = var0 + (var6 + ((field_g[2] - var6) * var9 >> 16) << 9) / field_k;
              field_s[var2] = var1 + (var7 + ((field_l[2] - var7) * var9 >> 16) << 9) / field_k;
              var2++;
              field_n[var2] = var8 + ((field_d - var8) * var9 >> 16);
              break L2;
            }
          } else {
            field_r[var2] = field_e[1];
            field_s[var2] = field_v[1];
            var2++;
            field_n[var2] = field_t;
            break L2;
          }
        }
        L4: {
          if (var5 < field_k) {
            L5: {
              var6 = field_g[2];
              var7 = field_l[2];
              var8 = field_d;
              if (var4 < field_k) {
                break L5;
              } else {
                var9 = (field_k - var5) * field_c[var4 - var5];
                field_r[var2] = var0 + (var6 + ((field_g[1] - var6) * var9 >> 16) << 9) / field_k;
                field_s[var2] = var1 + (var7 + ((field_l[1] - var7) * var9 >> 16) << 9) / field_k;
                var2++;
                field_n[var2] = var8 + ((field_t - var8) * var9 >> 16);
                break L5;
              }
            }
            if (var3 < field_k) {
              break L4;
            } else {
              var9 = (field_k - var5) * field_c[var3 - var5];
              field_r[var2] = var0 + (var6 + ((field_g[0] - var6) * var9 >> 16) << 9) / field_k;
              field_s[var2] = var1 + (var7 + ((field_l[0] - var7) * var9 >> 16) << 9) / field_k;
              var2++;
              field_n[var2] = var8 + ((field_m - var8) * var9 >> 16);
              break L4;
            }
          } else {
            field_r[var2] = field_e[2];
            field_s[var2] = field_v[2];
            var2++;
            field_n[var2] = field_d;
            break L4;
          }
        }
        L6: {
          var6 = field_r[0];
          var7 = field_r[1];
          var8 = field_r[2];
          var9 = field_s[0];
          var10 = field_s[1];
          var11 = field_s[2];
          fk.field_g = false;
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
                      if (var6 > fk.field_o) {
                        break L8;
                      } else {
                        if (var7 > fk.field_o) {
                          break L8;
                        } else {
                          if (var8 <= fk.field_o) {
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
              fk.field_g = true;
              break L7;
            }
            var12 = field_q & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L6;
                  } else {
                    fk.a(var9, var10, var11, var6, var7, var8, field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                    break L6;
                  }
                } else {
                  fk.a(var9, var10, var11, var6, var7, var8, field_n[0], field_n[1], field_n[2], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                  break L6;
                }
              } else {
                fk.a(var9, var10, var11, var6, var7, var8, field_j[field_m]);
                break L6;
              }
            } else {
              fk.a(var9, var10, var11, var6, var7, var8, field_n[0], field_n[1], field_n[2]);
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
                      if (var6 > fk.field_o) {
                        break L11;
                      } else {
                        if (var7 > fk.field_o) {
                          break L11;
                        } else {
                          if (var8 > fk.field_o) {
                            break L11;
                          } else {
                            if (field_r[3] < 0) {
                              break L11;
                            } else {
                              if (field_r[3] <= fk.field_o) {
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
              fk.field_g = true;
              break L10;
            }
            var12 = field_q & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L9;
                  } else {
                    fk.a(var9, var10, var11, var6, var7, var8, field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                    fk.a(var9, var11, field_s[3], var6, var8, field_r[3], field_m, field_m, field_m, field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                    break L9;
                  }
                } else {
                  fk.a(var9, var10, var11, var6, var7, var8, field_n[0], field_n[1], field_n[2], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                  fk.a(var9, var11, field_s[3], var6, var8, field_r[3], field_n[0], field_n[2], field_n[3], field_f[0], field_f[1], field_f[2], field_i[0], field_i[1], field_i[2], field_u[0], field_u[1], field_u[2], field_b);
                  break L9;
                }
              } else {
                var13 = field_j[field_m];
                fk.a(var9, var10, var11, var6, var7, var8, var13);
                fk.a(var9, var11, field_s[3], var6, var8, field_r[3], var13);
                break L9;
              }
            } else {
              fk.a(var9, var10, var11, var6, var7, var8, field_n[0], field_n[1], field_n[2]);
              fk.a(var9, var11, field_s[3], var6, var8, field_r[3], field_n[0], field_n[2], field_n[3]);
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
        if (field_q != -1) {
          L0: {
            L1: {
              var3 = field_e[0];
              var4 = field_e[1];
              var5 = field_e[2];
              if (!param0) {
                break L1;
              } else {
                L2: {
                  if (var3 == -5000) {
                    break L2;
                  } else {
                    if (var4 == -5000) {
                      break L2;
                    } else {
                      if (var5 != -5000) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var6 = field_g[0];
                var7 = field_g[1];
                var8 = field_g[2];
                var9 = field_l[0];
                var10 = field_l[1];
                var11 = field_l[2];
                var12 = field_a[0];
                var13 = field_a[1];
                var14 = field_a[2];
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
                  field_o = true;
                  break L0;
                } else {
                  return;
                }
              }
            }
            if ((var3 - var4) * (field_v[2] - field_v[1]) - (field_v[0] - field_v[1]) * (var5 - var4) > 0) {
              L3: {
                field_o = false;
                if (var3 < 0) {
                  break L3;
                } else {
                  if (var4 < 0) {
                    break L3;
                  } else {
                    if (var5 < 0) {
                      break L3;
                    } else {
                      if (var3 > fk.field_o) {
                        break L3;
                      } else {
                        if (var4 > fk.field_o) {
                          break L3;
                        } else {
                          if (var5 <= fk.field_o) {
                            field_h = false;
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              field_h = true;
              break L0;
            } else {
              return;
            }
          }
          qf.b();
          return;
        } else {
          return;
        }
    }

    public static void c() {
        field_e = null;
        field_v = null;
        field_g = null;
        field_l = null;
        field_a = null;
        field_f = null;
        field_i = null;
        field_u = null;
        field_r = null;
        field_s = null;
        field_n = null;
        field_j = null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4, int[] param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        Exception var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Throwable decompiledCaughtException = null;
        field_p = param0;
        field_q = param1;
        field_b = param2;
        field_m = param6;
        field_t = param7;
        field_d = param8;
        var9 = fk.field_j;
        var10 = fk.field_k;
        var11 = 0;
        var12_int = 0;
        L0: while (true) {
          if (var12_int >= 3) {
            try {
              qf.a(var11 != 0, false, 0);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var12 = (Exception) (Object) decompiledCaughtException;
          } else {
            L1: {
              var13 = param3[var12_int];
              var14 = param4[var12_int];
              var15 = param5[var12_int];
              if (var15 < field_k) {
                field_e[var12_int] = -5000;
                var11 = 1;
                break L1;
              } else {
                field_e[var12_int] = var9 + (var13 << 9) / var15;
                field_v[var12_int] = var10 + (var14 << 9) / var15;
                break L1;
              }
            }
            field_g[var12_int] = var13;
            field_l[var12_int] = var14;
            field_a[var12_int] = var15;
            var12_int++;
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[3];
        field_j = fk.field_l;
        field_e = new int[3];
        field_u = new int[3];
        field_c = fk.field_a;
        field_i = new int[3];
        field_v = new int[3];
        field_k = 50;
        field_r = new int[10];
        field_g = new int[3];
        field_s = new int[10];
        field_f = new int[3];
        field_n = new int[10];
        field_l = new int[3];
    }
}
