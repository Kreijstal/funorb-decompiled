/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends tm {
    static boolean field_q;
    static jg field_l;
    static int field_p;
    static String field_n;
    static int field_o;
    static boolean[][] field_m;

    final void a(di param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (((to) this).field_a != null) {
              return;
            } else {
              L1: {
                if (param1 == 117) {
                  break L1;
                } else {
                  field_q = true;
                  break L1;
                }
              }
              ((to) this).field_a = new eg[16];
              ((to) this).field_a[0] = eg.a(param0, "", "balls/POLAR/polar_ball_white");
              eg dupTemp$2 = eg.a(param0, "", "balls/POLAR/polar_ball_1");
              ((to) this).field_a[7] = dupTemp$2;
              ((to) this).field_a[6] = dupTemp$2;
              ((to) this).field_a[5] = dupTemp$2;
              ((to) this).field_a[4] = dupTemp$2;
              ((to) this).field_a[3] = dupTemp$2;
              ((to) this).field_a[2] = dupTemp$2;
              ((to) this).field_a[1] = dupTemp$2;
              ((to) this).field_a[8] = eg.a(param0, "", "balls/POLAR/polar_ball_black");
              eg dupTemp$3 = eg.a(param0, "", "balls/POLAR/polar_ball_2");
              ((to) this).field_a[15] = dupTemp$3;
              ((to) this).field_a[14] = dupTemp$3;
              ((to) this).field_a[13] = dupTemp$3;
              ((to) this).field_a[12] = dupTemp$3;
              ((to) this).field_a[11] = dupTemp$3;
              ((to) this).field_a[10] = dupTemp$3;
              ((to) this).field_a[9] = dupTemp$3;
              ((to) this).field_a[0].a(8, 8, 8, 8);
              ((to) this).field_a[1].a(8, 8, 8, 8);
              ((to) this).field_a[8].a(8, 8, 8, 8);
              ((to) this).field_a[9].a(8, 8, 8, 8);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("to.C(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    private final int b(int param0, byte param1) {
        if (param0 == 0) {
            return 13158;
        }
        if (param0 == 1) {
            return 6715289;
        }
        return 16777215;
    }

    to() {
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            String discarded$0 = ((to) this).a((byte) -23, 90);
            return false;
        }
        return false;
    }

    public static void i(int param0) {
        field_l = null;
        field_n = null;
        if (param0 != 8) {
            to.a((byte) 80, true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var3 = param0;
        if (var3 != 0) {
          if (1 != var3) {
            if (2 != var3) {
              if (var3 != 3) {
                if (4 != var3) {
                  if (var3 != 5) {
                    if (var3 != 6) {
                      if (var3 != 7) {
                        if (var3 == 8) {
                          return 3355443;
                        } else {
                          if (var3 != 9) {
                            if (var3 != 10) {
                              if (var3 != 11) {
                                if (var3 != 12) {
                                  if (var3 != 13) {
                                    if (var3 == 14) {
                                      return this.b(1, (byte) -102);
                                    } else {
                                      if (var3 != 15) {
                                        if (param1) {
                                          return 16711935;
                                        } else {
                                          field_q = true;
                                          return 16711935;
                                        }
                                      } else {
                                        return this.b(1, (byte) -102);
                                      }
                                    }
                                  } else {
                                    return this.b(1, (byte) -102);
                                  }
                                } else {
                                  return this.b(1, (byte) -102);
                                }
                              } else {
                                return this.b(1, (byte) -102);
                              }
                            } else {
                              return this.b(1, (byte) -102);
                            }
                          } else {
                            return this.b(1, (byte) -102);
                          }
                        }
                      } else {
                        return this.b(0, (byte) -102);
                      }
                    } else {
                      return this.b(0, (byte) -102);
                    }
                  } else {
                    return this.b(0, (byte) -102);
                  }
                } else {
                  return this.b(0, (byte) -102);
                }
              } else {
                return this.b(0, (byte) -102);
              }
            } else {
              return this.b(0, (byte) -102);
            }
          } else {
            return this.b(0, (byte) -102);
          }
        } else {
          return 13421772;
        }
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            return;
        }
        try {
            ((to) this).field_e = aj.a(0, "", param1, "top_bar_balls_polar");
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "to.D(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, boolean param1) {
        wd.field_Ub.a(0, (byte) 92, 0);
        int var2 = -32 % ((37 - param0) / 60);
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            field_l = null;
            return param1 == 0 ? ij.field_t : ld.field_h;
        }
        return param1 == 0 ? ij.field_t : ld.field_h;
    }

    final static ml[] a() {
        return new ml[]{eo.field_Xb, ug.field_v, ve.field_l};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_q = false;
        field_n = "Password: ";
        field_m = new boolean[][]{new boolean[6], new boolean[3], new boolean[6], new boolean[2]};
    }
}
