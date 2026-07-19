/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf {
    private static boolean field_m;
    private static int[] field_c;
    private static int[] field_j;
    private static boolean field_h;
    private static int[] field_e;
    private static int[] field_k;
    private static int[] field_g;
    private static int field_i;
    private static int[] field_n;
    private static int[] field_o;
    private static int field_l;
    private static int[] field_b;
    private static int field_f;
    private static int[] field_p;
    private static int[] field_a;
    private static int[] field_q;
    private static int field_r;
    private static int field_d;

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          L1: {
            if (param3 >= 0) {
              break L1;
            } else {
              if (param4 >= 0) {
                break L1;
              } else {
                if (param5 < 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param3 <= be.field_p) {
              break L2;
            } else {
              if (param4 <= be.field_p) {
                break L2;
              } else {
                if (param5 > be.field_p) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            if (param0 >= 0) {
              break L3;
            } else {
              if (param1 >= 0) {
                break L3;
              } else {
                if (param2 < 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            if (param0 <= be.field_f) {
              break L4;
            } else {
              if (param1 <= be.field_f) {
                break L4;
              } else {
                if (param2 <= be.field_f) {
                  break L4;
                } else {
                  break L0;
                }
              }
            }
          }
          be.a(param0, param1, param2, param3, param4, param5, param6);
          return;
        }
    }

    private final static void a() {
        int var0 = 0;
        if (!field_h) {
          L0: {
            be.field_q = field_m;
            be.field_h = 0;
            var0 = field_r & 3;
            if (var0 != 0) {
              if (var0 != 1) {
                if (var0 != 2) {
                  if (var0 != 3) {
                    break L0;
                  } else {
                    nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                    break L0;
                  }
                } else {
                  nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_i, field_d, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                  break L0;
                }
              } else {
                nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], be.field_a[field_f]);
                break L0;
              }
            } else {
              nf.a(field_j[0], field_j[1], field_j[2], field_q[0], field_q[1], field_q[2], field_f, field_i, field_d);
              break L0;
            }
          }
          return;
        } else {
          nf.b();
          return;
        }
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
        int stackIn_28_0 = 0;
        int stackIn_48_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        L0: {
          var0 = be.field_g;
          var1 = be.field_b;
          var2 = 0;
          var3 = field_c[0];
          var4 = field_c[1];
          var5 = field_c[2];
          if (var3 < 50) {
            L1: {
              var6 = field_p[0];
              var7 = field_b[0];
              var8 = field_f;
              if (var5 < 50) {
                break L1;
              } else {
                var9 = (50 - var3) * be.field_e[var5 - var3];
                field_g[var2] = var0 + (var6 + ((field_p[2] - var6) * var9 >> 16) << 9) / 50;
                field_o[var2] = var1 + (var7 + ((field_b[2] - var7) * var9 >> 16) << 9) / 50;
                incrementValue$9 = var2;
                var2++;
                field_a[incrementValue$9] = var8 + ((field_d - var8) * var9 >> 16);
                break L1;
              }
            }
            if (var4 < 50) {
              break L0;
            } else {
              var9 = (50 - var3) * be.field_e[var4 - var3];
              field_g[var2] = var0 + (var6 + ((field_p[1] - var6) * var9 >> 16) << 9) / 50;
              field_o[var2] = var1 + (var7 + ((field_b[1] - var7) * var9 >> 16) << 9) / 50;
              incrementValue$10 = var2;
              var2++;
              field_a[incrementValue$10] = var8 + ((field_i - var8) * var9 >> 16);
              break L0;
            }
          } else {
            field_g[var2] = field_q[0];
            field_o[var2] = field_j[0];
            incrementValue$11 = var2;
            var2++;
            field_a[incrementValue$11] = field_f;
            break L0;
          }
        }
        L2: {
          if (var4 < 50) {
            L3: {
              var6 = field_p[1];
              var7 = field_b[1];
              var8 = field_i;
              if (var3 < 50) {
                break L3;
              } else {
                var9 = (50 - var4) * be.field_e[var3 - var4];
                field_g[var2] = var0 + (var6 + ((field_p[0] - var6) * var9 >> 16) << 9) / 50;
                field_o[var2] = var1 + (var7 + ((field_b[0] - var7) * var9 >> 16) << 9) / 50;
                incrementValue$12 = var2;
                var2++;
                field_a[incrementValue$12] = var8 + ((field_f - var8) * var9 >> 16);
                break L3;
              }
            }
            if (var5 < 50) {
              break L2;
            } else {
              var9 = (50 - var4) * be.field_e[var5 - var4];
              field_g[var2] = var0 + (var6 + ((field_p[2] - var6) * var9 >> 16) << 9) / 50;
              field_o[var2] = var1 + (var7 + ((field_b[2] - var7) * var9 >> 16) << 9) / 50;
              incrementValue$13 = var2;
              var2++;
              field_a[incrementValue$13] = var8 + ((field_d - var8) * var9 >> 16);
              break L2;
            }
          } else {
            field_g[var2] = field_q[1];
            field_o[var2] = field_j[1];
            incrementValue$14 = var2;
            var2++;
            field_a[incrementValue$14] = field_i;
            break L2;
          }
        }
        L4: {
          if (var5 < 50) {
            L5: {
              var6 = field_p[2];
              var7 = field_b[2];
              var8 = field_d;
              if (var4 < 50) {
                break L5;
              } else {
                var9 = (50 - var5) * be.field_e[var4 - var5];
                field_g[var2] = var0 + (var6 + ((field_p[1] - var6) * var9 >> 16) << 9) / 50;
                field_o[var2] = var1 + (var7 + ((field_b[1] - var7) * var9 >> 16) << 9) / 50;
                incrementValue$15 = var2;
                var2++;
                field_a[incrementValue$15] = var8 + ((field_i - var8) * var9 >> 16);
                break L5;
              }
            }
            if (var3 < 50) {
              break L4;
            } else {
              var9 = (50 - var5) * be.field_e[var3 - var5];
              field_g[var2] = var0 + (var6 + ((field_p[0] - var6) * var9 >> 16) << 9) / 50;
              field_o[var2] = var1 + (var7 + ((field_b[0] - var7) * var9 >> 16) << 9) / 50;
              incrementValue$16 = var2;
              var2++;
              field_a[incrementValue$16] = var8 + ((field_f - var8) * var9 >> 16);
              break L4;
            }
          } else {
            field_g[var2] = field_q[2];
            field_o[var2] = field_j[2];
            incrementValue$17 = var2;
            var2++;
            field_a[incrementValue$17] = field_d;
            break L4;
          }
        }
        L6: {
          var6 = field_g[0];
          var7 = field_g[1];
          var8 = field_g[2];
          var9 = field_o[0];
          var10 = field_o[1];
          var11 = field_o[2];
          if (var2 != 3) {
            break L6;
          } else {
            L7: {
              L8: {
                if (var6 < ph.field_k) {
                  break L8;
                } else {
                  if (var7 < ph.field_k) {
                    break L8;
                  } else {
                    if (var8 < ph.field_k) {
                      break L8;
                    } else {
                      if (var6 > ph.field_a) {
                        break L8;
                      } else {
                        if (var7 > ph.field_a) {
                          break L8;
                        } else {
                          if (var8 <= ph.field_a) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
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
              stackOut_26_0 = 1;
              stackIn_28_0 = stackOut_26_0;
              break L7;
            }
            be.field_q = stackIn_28_0 != 0;
            var12 = field_r & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L6;
                  } else {
                    nf.a(var9, var10, var11, var6, var7, var8, field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                    break L6;
                  }
                } else {
                  nf.a(var9, var10, var11, var6, var7, var8, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                  break L6;
                }
              } else {
                nf.a(var9, var10, var11, var6, var7, var8, be.field_a[field_f]);
                break L6;
              }
            } else {
              nf.a(var9, var10, var11, var6, var7, var8, field_a[0], field_a[1], field_a[2]);
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
                if (var6 < ph.field_k) {
                  break L11;
                } else {
                  if (var7 < ph.field_k) {
                    break L11;
                  } else {
                    if (var8 < ph.field_k) {
                      break L11;
                    } else {
                      if (var6 > ph.field_a) {
                        break L11;
                      } else {
                        if (var7 > ph.field_a) {
                          break L11;
                        } else {
                          if (var8 > ph.field_a) {
                            break L11;
                          } else {
                            if (field_g[3] < 0) {
                              break L11;
                            } else {
                              if (field_g[3] <= ph.field_a) {
                                stackOut_47_0 = 0;
                                stackIn_48_0 = stackOut_47_0;
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
              stackOut_46_0 = 1;
              stackIn_48_0 = stackOut_46_0;
              break L10;
            }
            be.field_q = stackIn_48_0 != 0;
            var12 = field_r & 3;
            if (var12 != 0) {
              if (var12 != 1) {
                if (var12 != 2) {
                  if (var12 != 3) {
                    break L9;
                  } else {
                    nf.a(var9, var10, var11, var6, var7, var8, field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                    nf.a(var9, var11, field_o[3], var6, var8, field_g[3], field_f, field_f, field_f, field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                    break L9;
                  }
                } else {
                  nf.a(var9, var10, var11, var6, var7, var8, field_a[0], field_a[1], field_a[2], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                  nf.a(var9, var11, field_o[3], var6, var8, field_g[3], field_a[0], field_a[2], field_a[3], field_e[0], field_e[1], field_e[2], field_n[0], field_n[1], field_n[2], field_k[0], field_k[1], field_k[2], field_l);
                  break L9;
                }
              } else {
                var13 = be.field_a[field_f];
                nf.a(var9, var10, var11, var6, var7, var8, var13);
                nf.a(var9, var11, field_o[3], var6, var8, field_g[3], var13);
                break L9;
              }
            } else {
              nf.a(var9, var10, var11, var6, var7, var8, field_a[0], field_a[1], field_a[2]);
              nf.a(var9, var11, field_o[3], var6, var8, field_g[3], field_a[0], field_a[2], field_a[3]);
              break L9;
            }
          }
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        L0: {
          L1: {
            if (param3 >= 0) {
              break L1;
            } else {
              if (param4 >= 0) {
                break L1;
              } else {
                if (param5 < 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param3 <= be.field_p) {
              break L2;
            } else {
              if (param4 <= be.field_p) {
                break L2;
              } else {
                if (param5 > be.field_p) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            if (param0 >= 0) {
              break L3;
            } else {
              if (param1 >= 0) {
                break L3;
              } else {
                if (param2 < 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            if (param0 <= be.field_f) {
              break L4;
            } else {
              if (param1 <= be.field_f) {
                break L4;
              } else {
                if (param2 <= be.field_f) {
                  break L4;
                } else {
                  break L0;
                }
              }
            }
          }
          be.a(param0, param1, param2, param3, param4, param5, param6, param7, param8);
          return;
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int[] param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (param0 != -1) {
          field_r = param0;
          field_l = param1;
          field_f = param5 & 65535;
          field_i = param6;
          field_d = param7;
          var8 = be.field_g;
          var9 = be.field_b;
          field_h = false;
          var10_int = 0;
          L0: while (true) {
            if (var10_int >= 3) {
              try {
                L1: {
                  L2: {
                    var10_int = field_q[0];
                    var11 = field_q[1];
                    var12 = field_q[2];
                    if (field_h) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (var10_int < ph.field_k) {
                            break L4;
                          } else {
                            if (var11 < ph.field_k) {
                              break L4;
                            } else {
                              if (var12 < ph.field_k) {
                                break L4;
                              } else {
                                if (var10_int > ph.field_a) {
                                  break L4;
                                } else {
                                  if (var11 > ph.field_a) {
                                    break L4;
                                  } else {
                                    if (var12 <= ph.field_a) {
                                      stackOut_17_0 = 0;
                                      stackIn_18_0 = stackOut_17_0;
                                      break L3;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L3;
                      }
                      field_m = stackIn_18_0 != 0;
                      break L2;
                    }
                  }
                  nf.a();
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var10 = decompiledCaughtException;
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                var11 = param2[var10_int];
                var12 = param3[var10_int];
                var13 = param4[var10_int];
                if (var13 < 50) {
                  field_q[var10_int] = -5000;
                  field_h = true;
                  break L6;
                } else {
                  field_q[var10_int] = var8 + (var11 << 9) / var13;
                  field_j[var10_int] = var9 + (var12 << 9) / var13;
                  break L6;
                }
              }
              field_p[var10_int] = var11;
              field_b[var10_int] = var12;
              field_c[var10_int] = var13;
              var10_int++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void c() {
        field_q = null;
        field_j = null;
        field_p = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_n = null;
        field_k = null;
        field_g = null;
        field_o = null;
        field_a = null;
    }

    private final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18) {
        L0: {
          L1: {
            if (param3 >= 0) {
              break L1;
            } else {
              if (param4 >= 0) {
                break L1;
              } else {
                if (param5 < 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param3 <= be.field_p) {
              break L2;
            } else {
              if (param4 <= be.field_p) {
                break L2;
              } else {
                if (param5 > be.field_p) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            if (param0 >= 0) {
              break L3;
            } else {
              if (param1 >= 0) {
                break L3;
              } else {
                if (param2 < 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            if (param0 <= be.field_f) {
              break L4;
            } else {
              if (param1 <= be.field_f) {
                break L4;
              } else {
                if (param2 <= be.field_f) {
                  break L4;
                } else {
                  break L0;
                }
              }
            }
          }
          be.a(param0, param1, param2, param3, param4, param5, param6, param7, param8, param9, param10, param11, param12, param13, param14, param15, param16, param17, param18);
          return;
        }
    }

    static {
        field_c = new int[3];
        field_n = g.field_c;
        field_o = new int[10];
        field_j = new int[3];
        field_k = g.field_a;
        field_p = new int[3];
        field_g = new int[10];
        field_b = new int[3];
        field_e = g.field_b;
        field_a = new int[10];
        field_q = new int[3];
    }
}
