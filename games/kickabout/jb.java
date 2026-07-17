/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jb extends gn {
    private int field_k;
    static String field_h;
    private int field_p;
    static String field_f;
    private ko field_j;
    private int field_q;
    private int field_r;
    private int field_e;
    hd[] field_i;
    private ut field_l;
    int field_n;
    static java.security.SecureRandom field_g;
    private String[] field_o;
    private int field_m;

    abstract void a(byte param0, int param1, int param2);

    final void b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        hd stackIn_23_0 = null;
        hd stackIn_24_0 = null;
        hd stackIn_25_0 = null;
        hd stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        hd stackOut_22_0 = null;
        hd stackOut_23_0 = null;
        hd stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        hd stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        var5 = Kickabout.field_G;
        if (param0 == -16536) {
          L0: {
            ((jb) this).a(3, param1);
            ((jb) this).field_j.a(param0 ^ 4642, this.a(true, us.field_j, wt.field_x), this.a(true, kf.field_Eb, dn.field_yb));
            if (((jb) this).field_n != 0) {
              break L0;
            } else {
              if (0 != ((jb) this).field_m) {
                break L0;
              } else {
                wh discarded$2 = sp.c(((jb) this).a(false), -104);
                break L0;
              }
            }
          }
          L1: {
            if (((jb) this).field_n != 0) {
              if (((jb) this).field_n == 1) {
                var3 = 0;
                L2: while (true) {
                  if (((jb) this).field_i.length <= var3) {
                    ((jb) this).field_q = 4096;
                    break L1;
                  } else {
                    L3: {
                      if (var3 != ((jb) this).field_j.field_e) {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        break L3;
                      } else {
                        stackOut_20_0 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        break L3;
                      }
                    }
                    L4: {
                      L5: {
                        var4 = stackIn_22_0;
                        ((jb) this).field_i[var3].b(0, param1);
                        stackOut_22_0 = ((jb) this).field_i[var3];
                        stackIn_25_0 = stackOut_22_0;
                        stackIn_23_0 = stackOut_22_0;
                        if (!((jb) this).field_i[var3].field_lb) {
                          break L5;
                        } else {
                          stackOut_23_0 = (hd) (Object) stackIn_23_0;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_24_0 = stackOut_23_0;
                          if (var4 == 0) {
                            break L5;
                          } else {
                            stackOut_24_0 = (hd) (Object) stackIn_24_0;
                            stackOut_24_1 = 1;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            break L4;
                          }
                        }
                      }
                      stackOut_25_0 = (hd) (Object) stackIn_25_0;
                      stackOut_25_1 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L4;
                    }
                    L6: {
                      stackIn_26_0.field_gb = stackIn_26_1 != 0;
                      if (1 != ((jb) this).field_i[var3].field_sb) {
                        break L6;
                      } else {
                        ((jb) this).a(118, var3);
                        ((jb) this).e(param0 ^ -3410);
                        break L6;
                      }
                    }
                    if (null != ((jb) this).field_o) {
                      if (null != ((jb) this).field_o[var3]) {
                        if (((jb) this).field_i[var3].field_gb) {
                          qd.a((byte) -67, ((jb) this).field_o[var3]);
                          var3++;
                          continue L2;
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (2 == ((jb) this).field_n) {
                  L7: {
                    ((jb) this).field_j.field_e = -1;
                    if (((jb) this).field_m > 0) {
                      ((jb) this).field_m = ((jb) this).field_m - 2;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ((jb) this).field_q = (((jb) this).field_m << 12) / kh.field_q.length;
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              L8: {
                int fieldTemp$3 = ((jb) this).field_m + 1;
                ((jb) this).field_m = ((jb) this).field_m + 1;
                if (fieldTemp$3 >= kh.field_q.length + -1) {
                  ((jb) this).field_n = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              ((jb) this).field_q = kh.field_q[((jb) this).field_m];
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0, int param1);

    public static void c() {
        field_f = null;
        field_h = null;
        field_g = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        hd var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var11 = Kickabout.field_G;
          var2 = ((jb) this).field_m << 4;
          if (var2 > 100) {
            var2 = 100;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param0) {
            break L1;
          } else {
            ((jb) this).field_r = 11;
            break L1;
          }
        }
        L2: {
          on.a(0, 0, 640, 480, 0, var2);
          if (((jb) this).field_q == 4096) {
            this.a(32, ((jb) this).field_p, ((jb) this).field_k);
            var12 = 0;
            var3 = var12;
            L3: while (true) {
              if (((jb) this).field_i.length <= var12) {
                break L2;
              } else {
                var4 = ((jb) this).field_i[var12];
                var4.a(100, false);
                var12++;
                continue L3;
              }
            }
          } else {
            var3 = ((jb) this).field_e * ((jb) this).field_q >> 12;
            var4_int = ((jb) this).field_r * ((jb) this).field_q >> 12;
            var5 = -var3 + 640 >> 1;
            iw.a(73, ((jb) this).field_l);
            var6 = -var4_int + 480 >> 1;
            this.a(32, 0, 0);
            var7 = 0;
            L4: while (true) {
              if (var7 >= ((jb) this).field_i.length) {
                L5: {
                  ta.e(119);
                  var7 = (((jb) this).field_m << 10) / kh.field_q.length;
                  if (var7 > 256) {
                    var7 = 256;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((jb) this).field_l.d(var5, var6, var3, var4_int, var7);
                break L2;
              } else {
                var8 = ((jb) this).field_i[var7];
                var9 = var8.field_s;
                var8.field_s = var8.field_s - ((jb) this).field_p;
                var10 = var8.field_J;
                var8.field_J = var8.field_J - ((jb) this).field_k;
                var8.b(0, false);
                var8.a(74, false);
                var8.field_J = var10;
                var8.field_s = var9;
                var7++;
                continue L4;
              }
            }
          }
        }
    }

    abstract void a(int param0, boolean param1);

    abstract int a(byte param0);

    final void a(String[] param0, byte param1) {
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
              ((jb) this).field_o = param0;
              if (param1 == 90) {
                break L1;
              } else {
                ((jb) this).field_p = -12;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("jb.IA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    boolean a(int param0, byte param1, char param2) {
        int var5 = 0;
        var5 = Kickabout.field_G;
        if (1 == ((jb) this).field_n) {
          L0: {
            if (param0 == 13) {
              ((jb) this).e(19910);
              break L0;
            } else {
              L1: {
                ((jb) this).field_j.a(0, true);
                if (((jb) this).field_j.field_e != -1) {
                  L2: while (true) {
                    if (((jb) this).field_i[((jb) this).field_j.field_e].field_lb) {
                      break L1;
                    } else {
                      ((jb) this).field_j.field_e = (((jb) this).field_j.field_e + 1) % ((jb) this).field_j.field_a;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              if (((jb) this).field_j.field_e < 0) {
                break L0;
              } else {
                if (((jb) this).field_j.c(-1)) {
                  ((jb) this).a(114, ((jb) this).field_j.field_e);
                  ((jb) this).e(19910);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
          L3: {
            if (param1 == -21) {
              break L3;
            } else {
              ((jb) this).b(45, true);
              break L3;
            }
          }
          return true;
        } else {
          return true;
        }
    }

    abstract int a(boolean param0);

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var4 = 0;
        L0: while (true) {
          if (((jb) this).field_i.length <= var4) {
            return -1;
          } else {
            var5 = ((jb) this).field_i[var4].field_q;
            var6 = ((jb) this).field_i[var4].field_mb;
            var7 = ((jb) this).field_i[var4].field_F;
            var8 = ((jb) this).field_i[var4].field_T;
            if (param2 >= var7) {
              if (var7 - -var5 > param2) {
                if (param1 >= var8) {
                  if (param1 < var8 + var6) {
                    return var4;
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    abstract int b(int param0);

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -31268) {
            break L0;
          } else {
            ((jb) this).field_q = 38;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((jb) this).field_n != 2) {
              break L2;
            } else {
              if (((jb) this).field_m > 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void e(int param0) {
        ((jb) this).field_n = 2;
        if (param0 != 19910) {
            ((jb) this).field_m = 118;
        }
    }

    final void a(int param0, String[] param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((jb) this).field_n = 0;
              if (param2 == 1054928844) {
                break L1;
              } else {
                ((jb) this).a(46, true);
                break L1;
              }
            }
            ((jb) this).field_q = 0;
            ((jb) this).field_e = ((jb) this).b(-1379118556);
            ((jb) this).field_r = ((jb) this).a((byte) 115);
            ((jb) this).field_k = 480 + -((jb) this).field_r >> 1;
            ((jb) this).field_p = -((jb) this).field_e + 640 >> 1;
            ((jb) this).field_l = new ut(((jb) this).field_e, ((jb) this).field_r);
            ((jb) this).field_i = new hd[param1.length];
            var4_int = ((jb) this).field_i.length;
            var5 = -(95 * var4_int) - 5 * (var4_int + -1) + 640 >> 1;
            var6 = 0;
            L2: while (true) {
              if (((jb) this).field_i.length <= var6) {
                ((jb) this).field_j = new ko(((jb) this).field_i.length);
                ((jb) this).field_j.field_e = param0;
                break L0;
              } else {
                param1[var6] = param1[var6].toLowerCase();
                ((jb) this).field_i[var6] = eo.a(param1[var6], 7126504, (hu) (Object) un.field_d, 90, false);
                var7 = ((jb) this).field_k + ((jb) this).field_r + (-((jb) this).field_i[var6].field_mb + -10);
                ((jb) this).field_i[var6].field_s = 100 * var6 + var5;
                ((jb) this).field_i[var6].field_J = var7;
                var6++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("jb.GA(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        pt.a(param1 + ((jb) this).field_e, -22914, param1, param2 + ((jb) this).field_r, param2);
        for (var4 = 0; ((jb) this).field_e > var4; var4++) {
            mk.field_a.d(var4 + param1, param2 - -((jb) this).field_r - 480);
        }
        cq.field_j.e(param1 - 10, 15 + param2, cq.field_j.field_o * 2 / 3, 2 * cq.field_j.field_v / 3, 32);
        ((jb) this).a((byte) -29, param1, param2);
        on.c(param1, param2, ((jb) this).field_e, ((jb) this).field_r, 2, 65793);
        ta.e(124);
    }

    jb() {
        ((jb) this).field_q = 0;
        ((jb) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "(<%0> players want to join)";
        field_h = "Kickabout is also availible as an application on <col=ffff00>Facebook</col>.";
    }
}
