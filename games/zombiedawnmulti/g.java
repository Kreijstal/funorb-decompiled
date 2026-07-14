/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class g {
    private static th field_b;
    private static th field_c;
    static Random field_a;
    private static String field_z;

    final static int b(int param0) {
        return le.a(param0, (byte) -80) >> 8;
    }

    final static void a(ja param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var3 = param1 + param2 * oo.field_b;
          var4 = 0;
          var5 = param0.field_w;
          var6 = param0.field_x;
          var7 = oo.field_b - var6;
          var8 = 0;
          if (param2 >= oo.field_e) {
            break L0;
          } else {
            var9 = oo.field_e - param2;
            var5 = var5 - var9;
            param2 = oo.field_e;
            var4 = var4 + var9 * var6;
            var3 = var3 + var9 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param2 + var5 <= oo.field_d) {
            break L1;
          } else {
            var5 = var5 - (param2 + var5 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= oo.field_f) {
            break L2;
          } else {
            var9 = oo.field_f - param1;
            var6 = var6 - var9;
            param1 = oo.field_f;
            var4 = var4 + var9;
            var3 = var3 + var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L2;
          }
        }
        L3: {
          if (param1 + var6 <= oo.field_g) {
            break L3;
          } else {
            var9 = param1 + var6 - oo.field_g;
            var6 = var6 - var9;
            var8 = var8 + var9;
            var7 = var7 + var9;
            break L3;
          }
        }
        L4: {
          if (var6 <= 0) {
            break L4;
          } else {
            if (var5 > 0) {
              g.a(oo.field_i, param0.field_B, 0, var4, var3, var6, var5, var7, var8);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    public static void a() {
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static void c() {
        oh var0_ref = null;
        oh var0 = (oh) (Object) field_c.a(true);
        if (var0 == null) {
            var0_ref = new oh();
        }
        var0_ref.a(oo.field_i, oo.field_b, oo.field_l, oo.field_f, oo.field_e, oo.field_g, oo.field_d);
        field_b.a((br) (Object) var0_ref, false);
    }

    final static ja b(ja param0) {
        ja var1 = new ja(param0.field_z, param0.field_u);
        g.c(var1);
        oo.b();
        param0.f(0, 0, 16777215);
        g.a(12303291);
        g.a(8947848);
        g.a(4473924);
        param0.f(0, 0, 0);
        g.d();
        return var1;
    }

    final static void a(ja param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var4 = param1 + param2 * oo.field_b;
          var5 = 0;
          var6 = param0.field_w;
          var7 = param0.field_x;
          var8 = oo.field_b - var7;
          var9 = 0;
          if (param2 >= oo.field_e) {
            break L0;
          } else {
            var10 = oo.field_e - param2;
            var6 = var6 - var10;
            param2 = oo.field_e;
            var5 = var5 + var10 * var7;
            var4 = var4 + var10 * oo.field_b;
            break L0;
          }
        }
        L1: {
          if (param2 + var6 <= oo.field_d) {
            break L1;
          } else {
            var6 = var6 - (param2 + var6 - oo.field_d);
            break L1;
          }
        }
        L2: {
          if (param1 >= oo.field_f) {
            break L2;
          } else {
            var10 = oo.field_f - param1;
            var7 = var7 - var10;
            param1 = oo.field_f;
            var5 = var5 + var10;
            var4 = var4 + var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L2;
          }
        }
        L3: {
          if (param1 + var7 <= oo.field_g) {
            break L3;
          } else {
            var10 = param1 + var7 - oo.field_g;
            var7 = var7 - var10;
            var9 = var9 + var10;
            var8 = var8 + var10;
            break L3;
          }
        }
        L4: {
          if (var7 <= 0) {
            break L4;
          } else {
            if (var6 > 0) {
              g.a(oo.field_i, param0.field_B, 0, var5, var4, var7, var6, var8, var9, param3);
              return;
            } else {
              break L4;
            }
          }
        }
    }

    final static void b() {
        oh var0 = (oh) (Object) field_b.a(true);
        if (var0 == null) {
            throw new IllegalStateException(field_z);
        }
        oo.a(var0.field_g, var0.field_i, var0.field_h);
        oo.h(var0.field_l, var0.field_f, var0.field_j, var0.field_k);
        var0.field_g = null;
        field_c.a((br) (Object) var0, false);
    }

    private final static boolean b(th param0) {
        br var1 = param0.c(51);
        while (var1 instanceof id) {
            // ifeq L63
            if (((id) (Object) var1).field_E > ((id) (Object) var1.field_d).field_E) {
                return false;
            }
            var1 = var1.field_d;
        }
        return true;
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var12 = -param6;
        L0: while (true) {
          if (var12 >= 0) {
            return;
          } else {
            var13 = -param5;
            L1: while (true) {
              if (var13 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var12++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var13++;
                  continue L1;
                } else {
                  var10 = param0[param4];
                  var11 = 256 - ((param2 & 255) * param9 >> 8);
                  param4++;
                  param0[param4] = (var10 & 16711935) * var11 >> 8 & 16711935 | (var10 & 65280) * var11 >> 8 & 65280;
                  var13++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void a(ja param0) {
        int var4 = 0;
        int var5 = 0;
        int var3 = 0;
        int[] var1 = param0.field_B;
        int var2 = 0;
        for (var4 = 0; var4 < param0.field_w; var4++) {
            for (var5 = 0; var5 < param0.field_x / 2; var5++) {
                var3 = var1[var2 + var5];
                var1[var2 + var5] = var1[var2 + param0.field_x - var5 - 1];
                var1[var2 + param0.field_x - var5 - 1] = var3;
            }
            var2 = var2 + param0.field_x;
        }
        param0.field_r = param0.field_z - param0.field_x - param0.field_r;
    }

    final static void c(ja param0) {
        g.a(param0.field_B, param0.field_x, param0.field_w);
    }

    final static void a(int param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var1 = 0;
        var12 = oo.field_i;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var2 = var9;
        var3 = oo.field_b;
        var4 = oo.field_l;
        var5 = new ja(var3, var4);
        var6 = var5.field_B;
        var7 = 0;
        L0: while (true) {
          if (var7 >= var4) {
            var5.c(0, 0);
            return;
          } else {
            var8 = 0;
            L1: while (true) {
              if (var8 >= var3) {
                var7++;
                continue L0;
              } else {
                L2: {
                  if (var12[var1] != 0) {
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (var1 >= var12.length - 1) {
                          break L4;
                        } else {
                          if (var2[var1 + 1] != 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var1 <= 1) {
                          break L5;
                        } else {
                          if (var2[var1 - 1] != 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var1 <= var3) {
                          break L6;
                        } else {
                          if (var2[var1 - var3] != 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (var1 >= var12.length - 1 - var3) {
                        break L2;
                      } else {
                        if (var2[var1 + var3] == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var1++;
                    var6[var1] = param0;
                    var8++;
                    continue L1;
                  }
                }
                var1++;
                var6[var1] = var2[var1];
                var8++;
                continue L1;
              }
            }
          }
        }
    }

    final static void a(th param0) {
        br var1 = null;
        br var2 = null;
        L0: while (true) {
          if (g.b(param0)) {
            return;
          } else {
            var1 = param0.c(51);
            L1: while (true) {
              if (!(var1 instanceof id)) {
                continue L0;
              } else {
                if (!(var1.field_d instanceof id)) {
                  continue L0;
                } else {
                  L2: {
                    var2 = var1.field_d;
                    if (((id) (Object) var1).field_E <= ((id) (Object) var2).field_E) {
                      break L2;
                    } else {
                      var1.a(true);
                      qc.a(var1, var2, 0);
                      break L2;
                    }
                  }
                  var1 = var2;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void d() {
        g.b();
    }

    final static int a(int param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = 750;
        if (param0 != 255) {
          L0: {
            if (param0 != 18) {
              L1: {
                if (param0 == 5) {
                  break L1;
                } else {
                  if (param0 != 12) {
                    L2: {
                      if (param0 == 7) {
                        break L2;
                      } else {
                        if (param0 == 13) {
                          break L2;
                        } else {
                          if (param0 == 9) {
                            break L2;
                          } else {
                            if (param0 == 10) {
                              break L2;
                            } else {
                              if (param0 == 11) {
                                break L2;
                              } else {
                                if (param0 == 14) {
                                  break L2;
                                } else {
                                  if (param0 != 16) {
                                    L3: {
                                      if (param0 == 8) {
                                        break L3;
                                      } else {
                                        if (param0 == 4) {
                                          break L3;
                                        } else {
                                          if (param0 == 1) {
                                            break L3;
                                          } else {
                                            if (param0 == 3) {
                                              break L3;
                                            } else {
                                              if (param0 == 15) {
                                                break L3;
                                              } else {
                                                if (param0 != 17) {
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
                                    var4 = var4 * 2;
                                    break L0;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    var4 = var4 * 3;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var4 = var4 * 4;
              break L0;
            } else {
              var4 = var4 * 5;
              break L0;
            }
          }
          if (param1 != 255) {
            L4: {
              L5: {
                if (param1 == 33) {
                  break L5;
                } else {
                  if (param1 != 32) {
                    if (param1 != 36) {
                      var4 = var4 * 3 / 2;
                      break L4;
                    } else {
                      var4 = var4 * 4;
                      break L4;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var4 = var4 * 4 / 3;
              break L4;
            }
            L6: {
              var5 = var4;
              if (!param2) {
                break L6;
              } else {
                var4 = var4 - var5 / 4;
                break L6;
              }
            }
            L7: {
              if (!param3) {
                break L7;
              } else {
                var4 = var4 - var5 / 3;
                break L7;
              }
            }
            return var4;
          } else {
            L8: {
              var5 = var4;
              if (!param2) {
                break L8;
              } else {
                var4 = var4 - var5 / 4;
                break L8;
              }
            }
            L9: {
              if (!param3) {
                break L9;
              } else {
                var4 = var4 - var5 / 3;
                break L9;
              }
            }
            return var4;
          }
        } else {
          return 0;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        param0 += 2;
        param1 += 2;
        param2 -= 4;
        param3 -= 4;
        int var5 = param0 + param1 * oo.field_b;
        int var6 = oo.field_b - param2;
        g.a(oo.field_i, var5, param4, 0, 0, 0, 0, param2, param3, var6);
    }

    private final static void a(int[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var11 = -param6;
        L0: while (true) {
          if (var11 >= 0) {
            return;
          } else {
            var12 = -param5;
            L1: while (true) {
              if (var12 >= 0) {
                param4 = param4 + param7;
                param3 = param3 + param8;
                var11++;
                continue L0;
              } else {
                param3++;
                param2 = param1[param3];
                if (param2 == 0) {
                  param4++;
                  var12++;
                  continue L1;
                } else {
                  var9 = param0[param4];
                  var10 = 256 - (param2 & 255);
                  param4++;
                  param0[param4] = (var9 & 16711935) * var10 >> 8 & 16711935 | (var9 & 65280) * var10 >> 8 & 65280;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final static void a(int[] param0, int param1, int param2) {
        g.c();
        oo.a(param0, param1, param2);
    }

    private final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var10 = 0;
        int var11 = 0;
        param8--;
        L0: while (true) {
          if (param8 < 0) {
            return;
          } else {
            var10 = param7 - 1;
            L1: while (true) {
              if (var10 < 0) {
                param1 = param1 + param9;
                param8--;
                continue L0;
              } else {
                var11 = param0[param1];
                if (var11 != 0) {
                  if (var11 != param2) {
                    L2: {
                      param3 = param1 - 1;
                      param4 = param1 + 1;
                      param5 = param1 - oo.field_b;
                      param6 = param1 + oo.field_b;
                      if (param0[param5 + 1] != 0) {
                        break L2;
                      } else {
                        param0[param5 + 1] = param2;
                        break L2;
                      }
                    }
                    L3: {
                      if (param0[param6 + 1] != 0) {
                        break L3;
                      } else {
                        param0[param6 + 1] = param2;
                        break L3;
                      }
                    }
                    L4: {
                      if (param0[param5 - 1] != 0) {
                        break L4;
                      } else {
                        param0[param5 - 1] = param2;
                        break L4;
                      }
                    }
                    L5: {
                      if (param0[param6 - 1] != 0) {
                        break L5;
                      } else {
                        param0[param6 - 1] = param2;
                        break L5;
                      }
                    }
                    L6: {
                      if (param0[param3] != 0) {
                        break L6;
                      } else {
                        param0[param3] = param2;
                        break L6;
                      }
                    }
                    L7: {
                      if (param0[param4] != 0) {
                        break L7;
                      } else {
                        param0[param4] = param2;
                        break L7;
                      }
                    }
                    L8: {
                      if (param0[param5] != 0) {
                        break L8;
                      } else {
                        param0[param5] = param2;
                        break L8;
                      }
                    }
                    L9: {
                      if (param0[param6] != 0) {
                        break L9;
                      } else {
                        param0[param6] = param2;
                        break L9;
                      }
                    }
                    L10: {
                      if (param0[param3 - 1] != 0) {
                        break L10;
                      } else {
                        param0[param3 - 1] = param2;
                        break L10;
                      }
                    }
                    L11: {
                      if (param0[param4 + 1] != 0) {
                        break L11;
                      } else {
                        param0[param4 + 1] = param2;
                        break L11;
                      }
                    }
                    L12: {
                      if (param0[param5 - oo.field_b] != 0) {
                        break L12;
                      } else {
                        param0[param5 - oo.field_b] = param2;
                        break L12;
                      }
                    }
                    if (param0[param6 + oo.field_b] == 0) {
                      param0[param6 + oo.field_b] = param2;
                      param1++;
                      var10--;
                      continue L1;
                    } else {
                      param1++;
                      var10--;
                      continue L1;
                    }
                  } else {
                    param1++;
                    var10--;
                    continue L1;
                  }
                } else {
                  param1++;
                  var10--;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "No pixdest to pop!";
        field_b = new th();
        field_c = new th();
        field_a = new Random();
    }
}
