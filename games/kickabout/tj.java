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
                L1: {
                  var8 = param1.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if (param2 == -5) {
                    break L1;
                  } else {
                    field_u = false;
                    break L1;
                  }
                }
                L2: {
                  if (-1L < (param3 ^ -1L)) {
                    var7 = var9 + "; Discard;";
                    break L2;
                  } else {
                    var7 = var9 + "; Expires=" + rj.a(nj.a(-121) + 1000L * param3, -102) + "; Max-Age=" + param3;
                    break L2;
                  }
                }
                mm.a("document.cookie=\"" + var7 + "\"", param1, (byte) 24);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var6 = decompiledCaughtException;
                break L3;
              }
            }
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
        long stackIn_13_0 = 0L;
        long stackIn_33_0 = 0L;
        int stackIn_41_0 = 0;
        long stackIn_44_0 = 0L;
        long stackIn_62_0 = 0L;
        long stackIn_80_0 = 0L;
        long stackIn_95_0 = 0L;
        long stackIn_118_0 = 0L;
        long stackIn_140_0 = 0L;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        long stackOut_12_0 = 0L;
        long stackOut_11_0 = 0L;
        long stackOut_32_0 = 0L;
        long stackOut_31_0 = 0L;
        long stackOut_30_0 = 0L;
        long stackOut_43_0 = 0L;
        long stackOut_42_0 = 0L;
        long stackOut_139_0 = 0L;
        long stackOut_138_0 = 0L;
        long stackOut_137_0 = 0L;
        long stackOut_117_0 = 0L;
        long stackOut_116_0 = 0L;
        long stackOut_115_0 = 0L;
        long stackOut_94_0 = 0L;
        long stackOut_93_0 = 0L;
        long stackOut_92_0 = 0L;
        long stackOut_79_0 = 0L;
        long stackOut_78_0 = 0L;
        long stackOut_77_0 = 0L;
        long stackOut_61_0 = 0L;
        long stackOut_60_0 = 0L;
        long stackOut_59_0 = 0L;
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
            if (65535 < (((tj) this).field_p ^ -1)) {
              stackOut_39_0 = 1;
              stackIn_41_0 = stackOut_39_0;
              break L2;
            } else {
              if (((tj) this).field_p <= 88145920) {
                stackOut_40_0 = 0;
                stackIn_41_0 = stackOut_40_0;
                break L2;
              } else {
                L3: {
                  var5 = 1;
                  if (var5 != 0) {
                    stackOut_12_0 = 2000L;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = 58982L;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                L4: {
                  var6 = stackIn_13_0;
                  var8 = jk.field_m[param1];
                  var18 = lt.a(((tj) this).field_q, ((tj) this).field_h, param2, -66, ((tj) this).field_v, ((tj) this).field_p, ((tj) this).field_t, ((tj) this).field_n);
                  ((tj) this).field_v = var18[2];
                  ((tj) this).field_t = var18[0];
                  ((tj) this).field_p = var18[1];
                  if ((((tj) this).field_q ^ -1) == (var18[3] ^ -1)) {
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
                  if ((var18[5] ^ -1) != (((tj) this).field_n ^ -1)) {
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
                L8: {
                  if (((tj) this).field_q != 0) {
                    break L8;
                  } else {
                    if (((tj) this).field_h != 0) {
                      break L8;
                    } else {
                      if ((((tj) this).field_n ^ -1) != -1) {
                        break L8;
                      } else {
                        if (((tj) this).field_v != 0) {
                          break L8;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (((tj) this).field_A > 10) {
                    stackOut_32_0 = 60293L;
                    stackIn_33_0 = stackOut_32_0;
                    break L9;
                  } else {
                    if (-65537 >= (((tj) this).field_v ^ -1)) {
                      stackOut_31_0 = sg.field_d[param1];
                      stackIn_33_0 = stackOut_31_0;
                      break L9;
                    } else {
                      stackOut_30_0 = en.field_q[param1];
                      stackIn_33_0 = stackOut_30_0;
                      break L9;
                    }
                  }
                }
                L10: {
                  var11 = stackIn_33_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var13 = ((tj) this).e(-128);
                  if (4096 <= var13) {
                    break L11;
                  } else {
                    ((tj) this).field_h = 0;
                    ((tj) this).field_q = 0;
                    break L11;
                  }
                }
                return;
              }
            }
          }
          L12: {
            var5 = stackIn_41_0;
            if (var5 != 0) {
              stackOut_43_0 = 2000L;
              stackIn_44_0 = stackOut_43_0;
              break L12;
            } else {
              stackOut_42_0 = 58982L;
              stackIn_44_0 = stackOut_42_0;
              break L12;
            }
          }
          var6 = stackIn_44_0;
          var8 = jk.field_m[param1];
          var19 = lt.a(((tj) this).field_q, ((tj) this).field_h, param2, -66, ((tj) this).field_v, ((tj) this).field_p, ((tj) this).field_t, ((tj) this).field_n);
          ((tj) this).field_v = var19[2];
          ((tj) this).field_t = var19[0];
          ((tj) this).field_p = var19[1];
          if ((((tj) this).field_q ^ -1) == (var19[3] ^ -1)) {
            if (((tj) this).field_h == var19[4]) {
              L13: {
                if ((var19[5] ^ -1) != (((tj) this).field_n ^ -1)) {
                  L14: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L13;
                } else {
                  break L13;
                }
              }
              L15: {
                if (((tj) this).field_q != 0) {
                  break L15;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L15;
                  } else {
                    if ((((tj) this).field_n ^ -1) != -1) {
                      break L15;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L15;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L16: {
                if (((tj) this).field_A > 10) {
                  stackOut_139_0 = 60293L;
                  stackIn_140_0 = stackOut_139_0;
                  break L16;
                } else {
                  if (-65537 >= (((tj) this).field_v ^ -1)) {
                    stackOut_138_0 = sg.field_d[param1];
                    stackIn_140_0 = stackOut_138_0;
                    break L16;
                  } else {
                    stackOut_137_0 = en.field_q[param1];
                    stackIn_140_0 = stackOut_137_0;
                    break L16;
                  }
                }
              }
              L17: {
                var11 = stackIn_140_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                if ((((tj) this).field_v ^ -1) < -1) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L17;
                } else {
                  break L17;
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
              L18: {
                ((tj) this).field_h = jw.a(var6, var19[4], (byte) 119);
                ((tj) this).field_y = true;
                if ((var19[5] ^ -1) != (((tj) this).field_n ^ -1)) {
                  L19: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L18;
                } else {
                  break L18;
                }
              }
              L20: {
                if (((tj) this).field_q != 0) {
                  break L20;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L20;
                  } else {
                    if ((((tj) this).field_n ^ -1) != -1) {
                      break L20;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L20;
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              L21: {
                if (((tj) this).field_A > 10) {
                  stackOut_117_0 = 60293L;
                  stackIn_118_0 = stackOut_117_0;
                  break L21;
                } else {
                  if (-65537 >= (((tj) this).field_v ^ -1)) {
                    stackOut_116_0 = sg.field_d[param1];
                    stackIn_118_0 = stackOut_116_0;
                    break L21;
                  } else {
                    stackOut_115_0 = en.field_q[param1];
                    stackIn_118_0 = stackOut_115_0;
                    break L21;
                  }
                }
              }
              L22: {
                var11 = stackIn_118_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                if ((((tj) this).field_v ^ -1) < -1) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L22;
                } else {
                  break L22;
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
              L23: {
                ((tj) this).field_h = jw.a(var6, var19[4], (byte) 119);
                ((tj) this).field_y = true;
                if ((var19[5] ^ -1) != (((tj) this).field_n ^ -1)) {
                  L24: {
                    ((tj) this).field_n = d.a(true, jw.a(var8, var19[5], (byte) 105));
                    if (((tj) this).field_n == 0) {
                      ((tj) this).field_v = 0;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  ((tj) this).field_k = true;
                  break L23;
                } else {
                  break L23;
                }
              }
              if (((tj) this).field_q == 0) {
                L25: {
                  if (((tj) this).field_h != 0) {
                    break L25;
                  } else {
                    if ((((tj) this).field_n ^ -1) != -1) {
                      break L25;
                    } else {
                      if (((tj) this).field_v != 0) {
                        break L25;
                      } else {
                        return;
                      }
                    }
                  }
                }
                L26: {
                  if (((tj) this).field_A > 10) {
                    stackOut_94_0 = 60293L;
                    stackIn_95_0 = stackOut_94_0;
                    break L26;
                  } else {
                    if (-65537 >= (((tj) this).field_v ^ -1)) {
                      stackOut_93_0 = sg.field_d[param1];
                      stackIn_95_0 = stackOut_93_0;
                      break L26;
                    } else {
                      stackOut_92_0 = en.field_q[param1];
                      stackIn_95_0 = stackOut_92_0;
                      break L26;
                    }
                  }
                }
                L27: {
                  var11 = stackIn_95_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L27;
                  } else {
                    break L27;
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
                L28: {
                  if (((tj) this).field_A > 10) {
                    stackOut_79_0 = 60293L;
                    stackIn_80_0 = stackOut_79_0;
                    break L28;
                  } else {
                    if (-65537 >= (((tj) this).field_v ^ -1)) {
                      stackOut_78_0 = sg.field_d[param1];
                      stackIn_80_0 = stackOut_78_0;
                      break L28;
                    } else {
                      stackOut_77_0 = en.field_q[param1];
                      stackIn_80_0 = stackOut_77_0;
                      break L28;
                    }
                  }
                }
                L29: {
                  var11 = stackIn_80_0;
                  ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                  ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                  if ((((tj) this).field_v ^ -1) < -1) {
                    ((tj) this).field_n = ((tj) this).field_n - 16384;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  var13 = ((tj) this).e(-128);
                  if (4096 <= var13) {
                    break L30;
                  } else {
                    ((tj) this).field_h = 0;
                    ((tj) this).field_q = 0;
                    break L30;
                  }
                }
                return;
              }
            } else {
              L31: {
                if ((var19[5] ^ -1) != (((tj) this).field_n ^ -1)) {
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
              L33: {
                if (((tj) this).field_q != 0) {
                  break L33;
                } else {
                  if (((tj) this).field_h != 0) {
                    break L33;
                  } else {
                    if ((((tj) this).field_n ^ -1) != -1) {
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
              }
              L34: {
                if (((tj) this).field_A > 10) {
                  stackOut_61_0 = 60293L;
                  stackIn_62_0 = stackOut_61_0;
                  break L34;
                } else {
                  if (-65537 >= (((tj) this).field_v ^ -1)) {
                    stackOut_60_0 = sg.field_d[param1];
                    stackIn_62_0 = stackOut_60_0;
                    break L34;
                  } else {
                    stackOut_59_0 = en.field_q[param1];
                    stackIn_62_0 = stackOut_59_0;
                    break L34;
                  }
                }
              }
              L35: {
                var11 = stackIn_62_0;
                ((tj) this).field_q = (int)(var11 * (long)((tj) this).field_q >> 829138128);
                ((tj) this).field_h = (int)((long)((tj) this).field_h * var11 >> -1540122928);
                if ((((tj) this).field_v ^ -1) < -1) {
                  ((tj) this).field_n = ((tj) this).field_n - 16384;
                  break L35;
                } else {
                  break L35;
                }
              }
              L36: {
                var13 = ((tj) this).e(-128);
                if (4096 <= var13) {
                  break L36;
                } else {
                  ((tj) this).field_h = 0;
                  ((tj) this).field_q = 0;
                  break L36;
                }
              }
              return;
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
