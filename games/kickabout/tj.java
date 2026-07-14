/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tj extends mo {
    int field_j;
    int field_i;
    int field_q;
    boolean field_y;
    int field_o;
    int field_h;
    int field_v;
    int field_A;
    static ff field_z;
    int field_l;
    int field_t;
    static boolean field_u;
    static kg[] field_f;
    boolean field_x;
    boolean field_k;
    static String field_g;
    static String[][] field_w;
    int field_r;
    int field_s;
    int field_n;
    int field_m;
    int field_p;

    public static void f(int param0) {
        field_w = null;
        field_f = null;
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_z = null;
    }

    final int d(int param0) {
        int var3 = 18 / ((81 - param0) / 37);
        int var2 = 0;
        var2 = fj.a(-40, var2 ^ ((tj) this).field_t);
        var2 = fj.a(-40, ((tj) this).field_p ^ var2);
        var2 = fj.a(-40, ((tj) this).field_v ^ var2);
        var2 = fj.a(-40, ((tj) this).field_q ^ var2);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_h);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_n);
        var2 = fj.a(-40, ((tj) this).field_m ^ var2);
        var2 = fj.a(-40, ((tj) this).field_s ^ var2);
        var2 = fj.a(-40, var2 ^ ((tj) this).field_r);
        var2 = fj.a(-40, ((tj) this).field_A ^ var2);
        var2 = fj.a(-40, ((tj) this).field_l ^ var2);
        return var2;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 != 26) {
          return;
        } else {
          ((tj) this).field_t = param0;
          ((tj) this).field_n = 0;
          ((tj) this).field_p = param3;
          ((tj) this).field_v = param1;
          ((tj) this).field_q = 0;
          ((tj) this).field_h = 0;
          return;
        }
    }

    public final String toString() {
        StringBuilder var2 = new StringBuilder("AgentBall p=[");
        eh.a(((tj) this).field_t, 100, var2);
        StringBuilder discarded$0 = var2.append(",");
        eh.a(((tj) this).field_p, 100, var2);
        StringBuilder discarded$1 = var2.append(",");
        eh.a(((tj) this).field_v, 100, var2);
        StringBuilder discarded$2 = var2.append("]\tv=[");
        eh.a(((tj) this).field_q, 100, var2);
        StringBuilder discarded$3 = var2.append(",");
        eh.a(((tj) this).field_h, 100, var2);
        StringBuilder discarded$4 = var2.append(",");
        eh.a(((tj) this).field_n, 100, var2);
        StringBuilder discarded$5 = var2.append("]\tposessor=" + ((tj) this).field_m + "/" + ((tj) this).field_s);
        StringBuilder discarded$6 = var2.append("\tuncatchable=" + ((tj) this).field_r);
        StringBuilder discarded$7 = var2.append("\thigh_friction=" + ((tj) this).field_A);
        StringBuilder discarded$8 = var2.append("\tmodel_id=" + ((tj) this).field_l);
        return var2.toString();
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, long param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var8 = param1.getParameter("cookiehost");
                var7 = var8;
                var7 = var8;
                var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                var7 = var9;
                var7 = var9;
                if (param2 == -5) {
                  break L0;
                } else {
                  field_u = false;
                  break L0;
                }
              }
              L1: {
                if (-1L < (param3 ^ -1L)) {
                  var7 = var9 + "; Discard;";
                  break L1;
                } else {
                  var7 = var9 + "; Expires=" + rj.a(nj.a(-121) + 1000L * param3, -102) + "; Max-Age=" + param3;
                  break L1;
                }
              }
              mm.a("document.cookie=\"" + var7 + "\"", param1, (byte) 24);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int b(boolean param0) {
        if (!param0) {
            return 99;
        }
        return ((tj) this).field_v >> 1809189968;
    }

    final int a(boolean param0) {
        if (!param0) {
            ((tj) this).field_p = 99;
            return ((tj) this).field_t >> -142805232;
        }
        return ((tj) this).field_t >> -142805232;
    }

    final int e(int param0) {
        int var2 = ((tj) this).field_q >> 194310024;
        int var3 = ((tj) this).field_h >> -1413577176;
        int var4 = -84 / ((-60 - param0) / 39);
        return var3 * var3 + var2 * var2;
    }

    final int c(int param0) {
        if (param0 != 879306160) {
            return 87;
        }
        return ((tj) this).field_p >> 879306160;
    }

    final void c(ml param0, int param1) {
        if (!mu.a(param0, (byte) -39)) {
          if (param1 == 17) {
            L0: {
              if (mu.a(param0, (byte) -39)) {
                ((tj) this).field_t = ((tj) this).field_t + ew.a((byte) 125, 17, param0, 0, 22, 30);
                ((tj) this).field_p = ((tj) this).field_p + ew.a((byte) 125, 17, param0, 0, 22, 30);
                ((tj) this).field_v = ((tj) this).field_v + ew.a((byte) 125, 20, param0, 0, 24, 30);
                ((tj) this).field_q = ((tj) this).field_q + ew.a((byte) 125, 11, param0, 0, 16, 30);
                ((tj) this).field_h = ((tj) this).field_h + ew.a((byte) 125, 11, param0, 0, 16, 30);
                ((tj) this).field_n = ((tj) this).field_n + ew.a((byte) 125, 18, param0, 0, 24, 30);
                break L0;
              } else {
                break L0;
              }
            }
            if (mu.a(param0, (byte) -39)) {
              ((tj) this).field_r = hq.a(22531, 9, param0, 0);
              ((tj) this).field_A = hq.a(22531, 5, param0, 0);
              ((tj) this).field_l = param0.l(4, 59);
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((tj) this).field_m = -1 + param0.l(2, param1 ^ 42);
          ((tj) this).field_s = param0.l(3, 59);
          if (param1 == 17) {
            L1: {
              if (mu.a(param0, (byte) -39)) {
                ((tj) this).field_t = ((tj) this).field_t + ew.a((byte) 125, 17, param0, 0, 22, 30);
                ((tj) this).field_p = ((tj) this).field_p + ew.a((byte) 125, 17, param0, 0, 22, 30);
                ((tj) this).field_v = ((tj) this).field_v + ew.a((byte) 125, 20, param0, 0, 24, 30);
                ((tj) this).field_q = ((tj) this).field_q + ew.a((byte) 125, 11, param0, 0, 16, 30);
                ((tj) this).field_h = ((tj) this).field_h + ew.a((byte) 125, 11, param0, 0, 16, 30);
                ((tj) this).field_n = ((tj) this).field_n + ew.a((byte) 125, 18, param0, 0, 24, 30);
                break L1;
              } else {
                break L1;
              }
            }
            if (!mu.a(param0, (byte) -39)) {
              return;
            } else {
              ((tj) this).field_r = hq.a(22531, 9, param0, 0);
              ((tj) this).field_A = hq.a(22531, 5, param0, 0);
              ((tj) this).field_l = param0.l(4, 59);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void a(ml param0, byte param1) {
        ((tj) this).field_m = param0.l(2, 59) + -1;
        ((tj) this).field_s = param0.l(3, 59);
        ((tj) this).field_t = param0.l(32, 59);
        ((tj) this).field_p = param0.l(32, 59);
        ((tj) this).field_v = param0.l(32, 59);
        ((tj) this).field_q = param0.l(32, 59);
        ((tj) this).field_h = param0.l(32, 59);
        ((tj) this).field_n = param0.l(32, 59);
        ((tj) this).field_r = param0.l(10, 59);
        ((tj) this).field_A = param0.l(5, 59);
        if (param1 >= -94) {
            int discarded$1 = this.b(false);
        } else {
            ((tj) this).field_l = param0.l(4, 59);
            return;
        }
        ((tj) this).field_l = param0.l(4, 59);
    }

    final boolean g(int param0) {
        int var2 = 0;
        var2 = 58 / ((param0 - -51) / 54);
        if (((tj) this).field_r == 0) {
          if (this.b(true) < 30) {
            if (0 <= ((tj) this).field_p) {
              if (-88080385 > (((tj) this).field_p ^ -1)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, mo param1) {
        Object var4 = null;
        tj var5 = null;
        var5 = (tj) (Object) param1;
        ((tj) this).field_m = var5.field_m;
        ((tj) this).field_n = var5.field_n;
        ((tj) this).field_s = var5.field_s;
        ((tj) this).field_l = var5.field_l;
        ((tj) this).field_o = var5.field_o;
        ((tj) this).field_v = var5.field_v;
        if (param0 > -52) {
          var4 = null;
          ((tj) this).c((ml) null, -54);
          ((tj) this).field_t = var5.field_t;
          ((tj) this).field_q = var5.field_q;
          ((tj) this).field_p = var5.field_p;
          ((tj) this).field_A = var5.field_A;
          ((tj) this).field_r = var5.field_r;
          ((tj) this).field_i = var5.field_i;
          ((tj) this).field_h = var5.field_h;
          return;
        } else {
          ((tj) this).field_t = var5.field_t;
          ((tj) this).field_q = var5.field_q;
          ((tj) this).field_p = var5.field_p;
          ((tj) this).field_A = var5.field_A;
          ((tj) this).field_r = var5.field_r;
          ((tj) this).field_i = var5.field_i;
          ((tj) this).field_h = var5.field_h;
          return;
        }
    }

    void a(byte param0, int param1, la[] param2) {
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int[] var18 = null;
        int[] var19 = null;
        long stackIn_15_0 = 0L;
        long stackIn_31_0 = 0L;
        long stackIn_43_0 = 0L;
        long stackIn_55_0 = 0L;
        long stackIn_67_0 = 0L;
        int stackIn_75_0 = 0;
        long stackIn_78_0 = 0L;
        long stackIn_92_0 = 0L;
        long stackIn_104_0 = 0L;
        long stackIn_116_0 = 0L;
        long stackIn_128_0 = 0L;
        long stackIn_148_0 = 0L;
        long stackIn_163_0 = 0L;
        long stackIn_187_0 = 0L;
        long stackIn_210_0 = 0L;
        long stackOut_14_0 = 0L;
        long stackOut_13_0 = 0L;
        long stackOut_66_0 = 0L;
        long stackOut_65_0 = 0L;
        long stackOut_64_0 = 0L;
        long stackOut_54_0 = 0L;
        long stackOut_53_0 = 0L;
        long stackOut_52_0 = 0L;
        long stackOut_42_0 = 0L;
        long stackOut_41_0 = 0L;
        long stackOut_40_0 = 0L;
        long stackOut_30_0 = 0L;
        long stackOut_29_0 = 0L;
        long stackOut_28_0 = 0L;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        long stackOut_77_0 = 0L;
        long stackOut_76_0 = 0L;
        long stackOut_209_0 = 0L;
        long stackOut_208_0 = 0L;
        long stackOut_207_0 = 0L;
        long stackOut_186_0 = 0L;
        long stackOut_185_0 = 0L;
        long stackOut_184_0 = 0L;
        long stackOut_162_0 = 0L;
        long stackOut_161_0 = 0L;
        long stackOut_160_0 = 0L;
        long stackOut_147_0 = 0L;
        long stackOut_146_0 = 0L;
        long stackOut_145_0 = 0L;
        long stackOut_127_0 = 0L;
        long stackOut_126_0 = 0L;
        long stackOut_125_0 = 0L;
        long stackOut_115_0 = 0L;
        long stackOut_114_0 = 0L;
        long stackOut_113_0 = 0L;
        long stackOut_103_0 = 0L;
        long stackOut_102_0 = 0L;
        long stackOut_101_0 = 0L;
        long stackOut_91_0 = 0L;
        long stackOut_90_0 = 0L;
        long stackOut_89_0 = 0L;
        L0: {
          ((tj) this).field_x = false;
          if (((tj) this).field_r > 0) {
            ((tj) this).field_r = ((tj) this).field_r - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((tj) this).field_y = false;
          ((tj) this).field_k = false;
          if (-1 > (((tj) this).field_A ^ -1)) {
            ((tj) this).field_A = ((tj) this).field_A - 1;
            break L1;
          } else {
            break L1;
          }
        }
        var4 = 90 / ((-3 - param0) / 59);
        ((tj) this).field_j = -1;
        if (((tj) this).field_m == -1) {
          L2: {
            if (65535 >= (((tj) this).field_p ^ -1)) {
              if (((tj) this).field_p > 88145920) {
                L3: {
                  var5 = 1;
                  if (var5 != 0) {
                    stackOut_14_0 = 2000L;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 58982L;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_15_0;
                  var8 = jk.field_m[param1];
                  var18 = lt.a(((tj) this).field_q, ((tj) this).field_h, param2, -66, ((tj) this).field_v, ((tj) this).field_p, ((tj) this).field_t, ((tj) this).field_n);
                  ((tj) this).field_v = var18[2];
                  ((tj) this).field_t = var18[0];
                  ((tj) this).field_p = var18[1];
                  if (((tj) this).field_q == var18[3]) {
                    break L4;
                  } else {
                    ((tj) this).field_q = jw.a(var6, var18[3], (byte) 115);
                    ((tj) this).field_y = true;
                    break L4;
                  }
                }
                L5: {
                  if (((tj) this).field_h == var18[4]) {
                    break L5;
                  } else {
                    ((tj) this).field_h = jw.a(var6, var18[4], (byte) 119);
                    ((tj) this).field_y = true;
                    break L5;
                  }
                }
                L6: {
                  if (var18[5] != ((tj) this).field_n) {
                    L7: {
                      ((tj) this).field_n = d.a(true, jw.a(var8, var18[5], (byte) 105));
                      if (((tj) this).field_n == 0) {
                        ((tj) this).field_v = 0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((tj) this).field_k = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (((tj) this).field_q == 0) {
                  if (((tj) this).field_h == 0) {
                    if (((tj) this).field_n == -1) {
                      if (((tj) this).field_v == 0) {
                        return;
                      } else {
                        L8: {
                          if (((tj) this).field_A > 10) {
                            stackOut_66_0 = 60293L;
                            stackIn_67_0 = stackOut_66_0;
                            break L8;
                          } else {
                            if (-65537 <= ((tj) this).field_v) {
                              stackOut_65_0 = sg.field_d[param1];
                              stackIn_67_0 = stackOut_65_0;
                              break L8;
                            } else {
                              stackOut_64_0 = en.field_q[param1];
                              stackIn_67_0 = stackOut_64_0;
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var11 = stackIn_67_0;
                          ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                          ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                          if ((((tj) this).field_v ^ -1) < -1) {
                            ((tj) this).field_n = ((tj) this).field_n - 16384;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: {
                          var13 = ((tj) this).e(-128);
                          if (4096 <= var13) {
                            break L10;
                          } else {
                            ((tj) this).field_h = 0;
                            ((tj) this).field_q = 0;
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L11: {
                        if (((tj) this).field_A > 10) {
                          stackOut_54_0 = 60293L;
                          stackIn_55_0 = stackOut_54_0;
                          break L11;
                        } else {
                          if (-65537 <= ((tj) this).field_v) {
                            stackOut_53_0 = sg.field_d[param1];
                            stackIn_55_0 = stackOut_53_0;
                            break L11;
                          } else {
                            stackOut_52_0 = en.field_q[param1];
                            stackIn_55_0 = stackOut_52_0;
                            break L11;
                          }
                        }
                      }
                      L12: {
                        var11 = stackIn_55_0;
                        ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                        ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                        if ((((tj) this).field_v ^ -1) < -1) {
                          ((tj) this).field_n = ((tj) this).field_n - 16384;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        var13 = ((tj) this).e(-128);
                        if (4096 <= var13) {
                          break L13;
                        } else {
                          ((tj) this).field_h = 0;
                          ((tj) this).field_q = 0;
                          break L13;
                        }
                      }
                      return;
                    }
                  } else {
                    L14: {
                      if (((tj) this).field_A > 10) {
                        stackOut_42_0 = 60293L;
                        stackIn_43_0 = stackOut_42_0;
                        break L14;
                      } else {
                        if (-65537 <= ((tj) this).field_v) {
                          stackOut_41_0 = sg.field_d[param1];
                          stackIn_43_0 = stackOut_41_0;
                          break L14;
                        } else {
                          stackOut_40_0 = en.field_q[param1];
                          stackIn_43_0 = stackOut_40_0;
                          break L14;
                        }
                      }
                    }
                    L15: {
                      var11 = stackIn_43_0;
                      ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                      ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                      if ((((tj) this).field_v ^ -1) < -1) {
                        ((tj) this).field_n = ((tj) this).field_n - 16384;
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      var13 = ((tj) this).e(-128);
                      if (4096 <= var13) {
                        break L16;
                      } else {
                        ((tj) this).field_h = 0;
                        ((tj) this).field_q = 0;
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L17: {
                    if (((tj) this).field_A > 10) {
                      stackOut_30_0 = 60293L;
                      stackIn_31_0 = stackOut_30_0;
                      break L17;
                    } else {
                      if (-65537 <= ((tj) this).field_v) {
                        stackOut_29_0 = sg.field_d[param1];
                        stackIn_31_0 = stackOut_29_0;
                        break L17;
                      } else {
                        stackOut_28_0 = en.field_q[param1];
                        stackIn_31_0 = stackOut_28_0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    var11 = stackIn_31_0;
                    ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                    ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                    if ((((tj) this).field_v ^ -1) < -1) {
                      ((tj) this).field_n = ((tj) this).field_n - 16384;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    var13 = ((tj) this).e(-128);
                    if (4096 <= var13) {
                      break L19;
                    } else {
                      ((tj) this).field_h = 0;
                      ((tj) this).field_q = 0;
                      break L19;
                    }
                  }
                  return;
                }
              } else {
                stackOut_11_0 = 0;
                stackIn_75_0 = stackOut_11_0;
                break L2;
              }
            } else {
              stackOut_9_0 = 1;
              stackIn_75_0 = stackOut_9_0;
              break L2;
            }
          }
          L20: {
            var5 = stackIn_75_0;
            if (var5 != 0) {
              stackOut_77_0 = 2000L;
              stackIn_78_0 = stackOut_77_0;
              break L20;
            } else {
              stackOut_76_0 = 58982L;
              stackIn_78_0 = stackOut_76_0;
              break L20;
            }
          }
          var6 = stackIn_78_0;
          var8 = jk.field_m[param1];
          var19 = lt.a(((tj) this).field_q, ((tj) this).field_h, param2, -66, ((tj) this).field_v, ((tj) this).field_p, ((tj) this).field_t, ((tj) this).field_n);
          ((tj) this).field_v = var19[2];
          ((tj) this).field_t = var19[0];
          ((tj) this).field_p = var19[1];
          if (((tj) this).field_q == var19[3]) {
            if (((tj) this).field_h == var19[4]) {
              L21: {
                if (var19[5] != ((tj) this).field_n) {
                  L22: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L21;
                } else {
                  break L21;
                }
              }
              L23: {
                if (((tj) this).field_q != 0) {
                  break L23;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L23;
                  } else {
                    if (((tj) this).field_n != -1) {
                      break L23;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L23;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L24: {
                if (((tj) this).field_A > 10) {
                  stackOut_209_0 = 60293L;
                  stackIn_210_0 = stackOut_209_0;
                  break L24;
                } else {
                  if (-65537 <= ((tj) this).field_v) {
                    stackOut_208_0 = sg.field_d[param1];
                    stackIn_210_0 = stackOut_208_0;
                    break L24;
                  } else {
                    stackOut_207_0 = en.field_q[param1];
                    stackIn_210_0 = stackOut_207_0;
                    break L24;
                  }
                }
              }
              L25: {
                var11 = stackIn_210_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                if ((((tj) this).field_v ^ -1) < -1) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L25;
                } else {
                  break L25;
                }
              }
              var13 = ((tj) this).e(-128);
              if (4096 <= var13) {
                return;
              } else {
                ((tj) this).field_h = 0;
                ((tj) this).field_q = 0;
                return;
              }
            } else {
              L26: {
                ((tj) this).field_h = jw.a(var6, var19[4], (byte) 119);
                ((tj) this).field_y = true;
                if (var19[5] != ((tj) this).field_n) {
                  L27: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L26;
                } else {
                  break L26;
                }
              }
              L28: {
                if (((tj) this).field_q != 0) {
                  break L28;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L28;
                  } else {
                    if (((tj) this).field_n != -1) {
                      break L28;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L28;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L29: {
                if (((tj) this).field_A > 10) {
                  stackOut_186_0 = 60293L;
                  stackIn_187_0 = stackOut_186_0;
                  break L29;
                } else {
                  if (-65537 <= ((tj) this).field_v) {
                    stackOut_185_0 = sg.field_d[param1];
                    stackIn_187_0 = stackOut_185_0;
                    break L29;
                  } else {
                    stackOut_184_0 = en.field_q[param1];
                    stackIn_187_0 = stackOut_184_0;
                    break L29;
                  }
                }
              }
              L30: {
                var11 = stackIn_187_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                if ((((tj) this).field_v ^ -1) < -1) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L30;
                } else {
                  break L30;
                }
              }
              var13 = ((tj) this).e(-128);
              if (4096 <= var13) {
                return;
              } else {
                ((tj) this).field_h = 0;
                ((tj) this).field_q = 0;
                return;
              }
            }
          } else {
            ((tj) this).field_q = jw.a(var6, var19[3], (byte) 115);
            ((tj) this).field_y = true;
            if (((tj) this).field_h != var19[4]) {
              L31: {
                ((tj) this).field_h = jw.a(var6, var19[4], (byte) 119);
                ((tj) this).field_y = true;
                if (var19[5] != ((tj) this).field_n) {
                  L32: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L31;
                } else {
                  break L31;
                }
              }
              if (((tj) this).field_q == 0) {
                L33: {
                  if (((tj) this).field_h != 0) {
                    break L33;
                  } else {
                    if (((tj) this).field_n != -1) {
                      break L33;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L33;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L34: {
                  if (((tj) this).field_A > 10) {
                    stackOut_162_0 = 60293L;
                    stackIn_163_0 = stackOut_162_0;
                    break L34;
                  } else {
                    if (-65537 <= ((tj) this).field_v) {
                      stackOut_161_0 = sg.field_d[param1];
                      stackIn_163_0 = stackOut_161_0;
                      break L34;
                    } else {
                      stackOut_160_0 = en.field_q[param1];
                      stackIn_163_0 = stackOut_160_0;
                      break L34;
                    }
                  }
                }
                L35: {
                  var11 = stackIn_163_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                var13 = ((tj) this).e(-128);
                if (4096 <= var13) {
                  return;
                } else {
                  ((tj) this).field_h = 0;
                  ((tj) this).field_q = 0;
                  return;
                }
              } else {
                L36: {
                  if (((tj) this).field_A > 10) {
                    stackOut_147_0 = 60293L;
                    stackIn_148_0 = stackOut_147_0;
                    break L36;
                  } else {
                    if (-65537 >= (((tj) this).field_v ^ -1)) {
                      stackOut_146_0 = sg.field_d[param1];
                      stackIn_148_0 = stackOut_146_0;
                      break L36;
                    } else {
                      stackOut_145_0 = en.field_q[param1];
                      stackIn_148_0 = stackOut_145_0;
                      break L36;
                    }
                  }
                }
                L37: {
                  var11 = stackIn_148_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  var13 = ((tj) this).e(-128);
                  if (4096 <= var13) {
                    break L38;
                  } else {
                    ((tj) this).field_h = 0;
                    ((tj) this).field_q = 0;
                    break L38;
                  }
                }
                return;
              }
            } else {
              L39: {
                if (var19[5] != ((tj) this).field_n) {
                  L40: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L39;
                } else {
                  break L39;
                }
              }
              if (((tj) this).field_q == 0) {
                if (((tj) this).field_h == 0) {
                  if (((tj) this).field_n == -1) {
                    if (((tj) this).field_v == 0) {
                      return;
                    } else {
                      L41: {
                        if (((tj) this).field_A > 10) {
                          stackOut_127_0 = 60293L;
                          stackIn_128_0 = stackOut_127_0;
                          break L41;
                        } else {
                          if (-65537 <= ((tj) this).field_v) {
                            stackOut_126_0 = sg.field_d[param1];
                            stackIn_128_0 = stackOut_126_0;
                            break L41;
                          } else {
                            stackOut_125_0 = en.field_q[param1];
                            stackIn_128_0 = stackOut_125_0;
                            break L41;
                          }
                        }
                      }
                      L42: {
                        var11 = stackIn_128_0;
                        ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                        ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                        if ((((tj) this).field_v ^ -1) < -1) {
                          ((tj) this).field_n = ((tj) this).field_n - 16384;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                      L43: {
                        var13 = ((tj) this).e(-128);
                        if (4096 <= var13) {
                          break L43;
                        } else {
                          ((tj) this).field_h = 0;
                          ((tj) this).field_q = 0;
                          break L43;
                        }
                      }
                      return;
                    }
                  } else {
                    L44: {
                      if (((tj) this).field_A > 10) {
                        stackOut_115_0 = 60293L;
                        stackIn_116_0 = stackOut_115_0;
                        break L44;
                      } else {
                        if (-65537 <= ((tj) this).field_v) {
                          stackOut_114_0 = sg.field_d[param1];
                          stackIn_116_0 = stackOut_114_0;
                          break L44;
                        } else {
                          stackOut_113_0 = en.field_q[param1];
                          stackIn_116_0 = stackOut_113_0;
                          break L44;
                        }
                      }
                    }
                    L45: {
                      var11 = stackIn_116_0;
                      ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                      ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                      if ((((tj) this).field_v ^ -1) < -1) {
                        ((tj) this).field_n = ((tj) this).field_n - 16384;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L46: {
                      var13 = ((tj) this).e(-128);
                      if (4096 <= var13) {
                        break L46;
                      } else {
                        ((tj) this).field_h = 0;
                        ((tj) this).field_q = 0;
                        break L46;
                      }
                    }
                    return;
                  }
                } else {
                  L47: {
                    if (((tj) this).field_A > 10) {
                      stackOut_103_0 = 60293L;
                      stackIn_104_0 = stackOut_103_0;
                      break L47;
                    } else {
                      if (-65537 <= ((tj) this).field_v) {
                        stackOut_102_0 = sg.field_d[param1];
                        stackIn_104_0 = stackOut_102_0;
                        break L47;
                      } else {
                        stackOut_101_0 = en.field_q[param1];
                        stackIn_104_0 = stackOut_101_0;
                        break L47;
                      }
                    }
                  }
                  L48: {
                    var11 = stackIn_104_0;
                    ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                    ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                    if ((((tj) this).field_v ^ -1) < -1) {
                      ((tj) this).field_n = ((tj) this).field_n - 16384;
                      break L48;
                    } else {
                      break L48;
                    }
                  }
                  L49: {
                    var13 = ((tj) this).e(-128);
                    if (4096 <= var13) {
                      break L49;
                    } else {
                      ((tj) this).field_h = 0;
                      ((tj) this).field_q = 0;
                      break L49;
                    }
                  }
                  return;
                }
              } else {
                L50: {
                  if (((tj) this).field_A > 10) {
                    stackOut_91_0 = 60293L;
                    stackIn_92_0 = stackOut_91_0;
                    break L50;
                  } else {
                    if (-65537 <= ((tj) this).field_v) {
                      stackOut_90_0 = sg.field_d[param1];
                      stackIn_92_0 = stackOut_90_0;
                      break L50;
                    } else {
                      stackOut_89_0 = en.field_q[param1];
                      stackIn_92_0 = stackOut_89_0;
                      break L50;
                    }
                  }
                }
                L51: {
                  var11 = stackIn_92_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L51;
                  } else {
                    break L51;
                  }
                }
                L52: {
                  var13 = ((tj) this).e(-128);
                  if (4096 <= var13) {
                    break L52;
                  } else {
                    ((tj) this).field_h = 0;
                    ((tj) this).field_q = 0;
                    break L52;
                  }
                }
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public tj() {
        ((tj) this).field_j = -1;
        ((tj) this).field_o = -1;
        ((tj) this).field_s = 0;
        ((tj) this).field_i = -1;
        ((tj) this).field_m = -1;
        ((tj) this).field_A = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new ff(14, 0, 4, 1);
        field_u = false;
        field_g = "Move";
        field_w = new String[][]{new String[4], new String[2]};
    }
}
