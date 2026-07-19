/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static byte[][] field_c;
    private fd field_d;
    static boolean field_i;
    static volatile boolean field_f;
    static int[][] field_h;
    private int field_e;
    private ak field_k;
    private int field_j;
    static long field_a;
    static ka field_b;
    static ka field_g;

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -90) {
          field_h = (int[][]) null;
          field_g = null;
          field_h = (int[][]) null;
          field_c = (byte[][]) null;
          return;
        } else {
          field_g = null;
          field_h = (int[][]) null;
          field_c = (byte[][]) null;
          return;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        lb var6 = null;
        re var6_ref = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        try {
            if (!(this.field_e >= param2)) {
                throw new IllegalStateException();
            }
            this.a(50, param3);
            this.field_j = this.field_j - param2;
            while (this.field_j < 0) {
                var6 = (lb) ((Object) this.field_k.a(0));
                this.a(var6, -27615);
            }
            var6_ref = new re(param1, param2);
            this.field_d.a((byte) 31, var6_ref, param3);
            this.field_k.a(var6_ref, 2);
            ((lb) ((Object) var6_ref)).field_l = (long)param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "je.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackOut_4_0 = new String(var3);
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                var3[var2_int + (-1 - var4)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("je.F(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(int param0, long param1) {
        lb var4 = null;
        if (param0 != 50) {
          this.a((Object) null, (byte) -11, -42L);
          var4 = (lb) ((Object) this.field_d.a(104, param1));
          this.a(var4, -27615);
          return;
        } else {
          var4 = (lb) ((Object) this.field_d.a(104, param1));
          this.a(var4, -27615);
          return;
        }
    }

    final static void a(byte param0, nc param1) {
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
              mj.field_a.b(param1);
              if (param0 == 15) {
                break L1;
              } else {
                field_h = (int[][]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("je.A(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        nh.field_jb = 0;
        n.field_cb = null;
        bl.field_V = null;
        var2 = wb.field_d;
        wb.field_d = pg.field_m;
        if (-52 == (param0 ^ -1)) {
          gb.field_d.field_b = 2;
          gb.field_d.field_h = gb.field_d.field_h + 1;
          pg.field_m = var2;
          if (param1) {
            if ((gb.field_d.field_h ^ -1) > -3) {
              if (gb.field_d.field_h < 2) {
                if (4 > gb.field_d.field_h) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param0) {
                  return 5;
                } else {
                  if (4 > gb.field_d.field_h) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (-52 == (param0 ^ -1)) {
                return 2;
              } else {
                if (gb.field_d.field_h < 2) {
                  if (4 > gb.field_d.field_h) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (50 == param0) {
                    return 5;
                  } else {
                    if (4 > gb.field_d.field_h) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            return 25;
          }
        } else {
          if (-51 == (param0 ^ -1)) {
            gb.field_d.field_b = 5;
            gb.field_d.field_h = gb.field_d.field_h + 1;
            pg.field_m = var2;
            if (param1) {
              if ((gb.field_d.field_h ^ -1) > -3) {
                if (gb.field_d.field_h < 2) {
                  if (4 <= gb.field_d.field_h) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 > gb.field_d.field_h) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                if (-52 != (param0 ^ -1)) {
                  if (gb.field_d.field_h >= 2) {
                    if (50 == param0) {
                      return 5;
                    } else {
                      if (4 <= gb.field_d.field_h) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  return 2;
                }
              }
            } else {
              return 25;
            }
          } else {
            gb.field_d.field_b = 1;
            gb.field_d.field_h = gb.field_d.field_h + 1;
            pg.field_m = var2;
            if (param1) {
              if ((gb.field_d.field_h ^ -1) <= -3) {
                if (-52 == (param0 ^ -1)) {
                  return 2;
                } else {
                  if (gb.field_d.field_h >= 2) {
                    if (50 == param0) {
                      return 5;
                    } else {
                      if (4 <= gb.field_d.field_h) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                if (gb.field_d.field_h < 2) {
                  if (4 <= gb.field_d.field_h) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param0) {
                    if (4 <= gb.field_d.field_h) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              }
            } else {
              return 25;
            }
          }
        }
    }

    private je() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (kj.field_G != -1) {
                break L1;
              } else {
                if (0 != (sd.field_b ^ -1)) {
                  break L1;
                } else {
                  kj.field_G = kc.field_u;
                  sd.field_b = ph.field_d;
                  break L1;
                }
              }
            }
            L2: {
              bk.field_p = bk.field_p + 1;
              if (param0 == -109) {
                break L2;
              } else {
                field_a = 50L;
                break L2;
              }
            }
            L3: {
              L4: {
                if (param1 == null) {
                  if (ie.field_g == null) {
                    break L4;
                  } else {
                    break L3;
                  }
                } else {
                  if (param1.equals(ie.field_g)) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (!sj.field_R) {
                  if (bk.field_p >= cf.field_a) {
                    if (ef.field_e + cf.field_a > bk.field_p) {
                      stackOut_17_0 = 1;
                      stackIn_19_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_19_0 = stackOut_16_0;
                      break L5;
                    }
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_19_0 = stackOut_14_0;
                    break L5;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_19_0 = stackOut_12_0;
                  break L5;
                }
              }
              L6: {
                var2_int = stackIn_19_0;
                if (param1 == null) {
                  bk.field_p = 0;
                  break L6;
                } else {
                  if (sj.field_R) {
                    bk.field_p = cf.field_a;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      bk.field_p = cf.field_a;
                      break L6;
                    } else {
                      bk.field_p = 0;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                if (param1 != null) {
                  sj.field_R = false;
                  break L7;
                } else {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    sj.field_R = true;
                    break L7;
                  }
                }
              }
              ul.field_n = sd.field_b;
              bi.field_h = kj.field_G;
              break L3;
            }
            L8: {
              if (sj.field_R) {
                break L8;
              } else {
                if (cf.field_a <= bk.field_p) {
                  break L8;
                } else {
                  if (ek.field_P) {
                    bi.field_h = kj.field_G;
                    ul.field_n = sd.field_b;
                    bk.field_p = 0;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              ie.field_g = param1;
              kj.field_G = -1;
              sd.field_b = -1;
              if (!sj.field_R) {
                break L9;
              } else {
                if (bk.field_p == gi.field_e) {
                  bk.field_p = 0;
                  sj.field_R = false;
                  break L9;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var2);
            stackOut_42_1 = new StringBuilder().append("je.E(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
    }

    private final void a(lb param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                param0.a(true);
                param0.a(12695);
                this.field_j = this.field_j + param0.field_r;
                break L1;
              }
            }
            if (param1 == -27615) {
              break L0;
            } else {
              this.field_j = 30;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("je.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(Object param0, byte param1, long param2) {
        try {
            int var5_int = -44 % ((param1 - 24) / 43);
            this.a(0, param0, 1, param2);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "je.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final Object a(long param0, int param1) {
        re var6 = null;
        lb var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (lb) ((Object) this.field_d.a(103, param0));
        if (var7 != null) {
          if (param1 == 0) {
            var9 = var7.c((byte) 70);
            if (var9 == null) {
              var7.a(true);
              var7.a(param1 ^ 12695);
              this.field_j = this.field_j + var7.field_r;
              return null;
            } else {
              L0: {
                if (var7.e(1024)) {
                  var6 = new re(var9, var7.field_r);
                  this.field_d.a((byte) 112, var6, var7.field_d);
                  this.field_k.a(var6, 2);
                  ((lb) ((Object) var6)).field_l = 0L;
                  var7.a(true);
                  var7.a(12695);
                  break L0;
                } else {
                  this.field_k.a(var7, 2);
                  var7.field_l = 0L;
                  break L0;
                }
              }
              return var9;
            }
          } else {
            this.a(28, -88L);
            var8 = var7.c((byte) 70);
            if (var8 == null) {
              var7.a(true);
              var7.a(param1 ^ 12695);
              this.field_j = this.field_j + var7.field_r;
              return null;
            } else {
              L1: {
                if (var7.e(1024)) {
                  var6 = new re(var8, var7.field_r);
                  this.field_d.a((byte) 112, var6, var7.field_d);
                  this.field_k.a(var6, 2);
                  ((lb) ((Object) var6)).field_l = 0L;
                  var7.a(true);
                  var7.a(12695);
                  break L1;
                } else {
                  this.field_k.a(var7, 2);
                  var7.field_l = 0L;
                  break L1;
                }
              }
              return var8;
            }
          }
        } else {
          return null;
        }
    }

    static {
        field_i = false;
        field_f = true;
        field_h = new int[][]{new int[]{110, 77}, new int[]{191, 61}, new int[]{194, 69}};
    }
}
