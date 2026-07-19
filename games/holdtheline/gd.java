/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gd extends ob implements ed {
    private nk field_f;
    static jc[] field_h;
    static int field_g;
    static int[] field_d;
    static int[] field_c;
    static int[][] field_e;

    final static void a(jg param0, byte param1, int param2) {
        da var3 = null;
        try {
            var3 = da.field_p;
            var3.c((byte) 33, param2);
            var3.f(param1 ^ 57, 5);
            if (param1 != 86) {
                field_d = (int[]) null;
            }
            var3.f(param1 + 25, 0);
            var3.b(-652561784, param0.field_i);
            var3.f(111, param0.field_l);
            var3.f(111, param0.field_n);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gd.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void e(int param0) {
        boolean discarded$0 = false;
        field_e = (int[][]) null;
        field_c = null;
        field_d = null;
        field_h = null;
        if (param0 != -1) {
            discarded$0 = gd.e((byte) -13);
        }
    }

    final fd c(byte param0) {
        if (param0 != -92) {
            return (fd) null;
        }
        return this.a(this.field_f.field_q, (byte) 70);
    }

    final static void a(String param0, hj param1, int param2) {
        boolean discarded$0 = false;
        try {
            if (param2 != 0) {
                discarded$0 = gd.e((byte) -29);
            }
            lf.field_e = param1;
            dl.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gd.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    abstract String a(String param0, boolean param1);

    final static int a(int param0, byte param1, int param2) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 <= -1) {
                break L1;
              } else {
                discarded$2 = gd.e((byte) 28);
                break L1;
              }
            }
            L2: while (true) {
              if (-1 <= (param2 ^ -1)) {
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                var3_int = param0 & 1 | var3_int << -606366175;
                param0 = param0 >>> 1;
                param2--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3), "gd.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    public final void a(byte param0, nk param1) {
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
              if (param0 == 19) {
                break L1;
              } else {
                field_d = (int[]) null;
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
            stackOut_3_1 = new StringBuilder().append("gd.F(").append(param0).append(',');
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
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final boolean a(byte param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -10) {
            break L0;
          } else {
            this.field_f = (nk) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_f.field_q == null) {
              break L2;
            } else {
              if (this.field_f.field_q.length() != 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    gd(nk param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(nk param0, int param1) {
        try {
            this.a(21871);
            int var3_int = -21 % ((param1 - -61) / 38);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "gd.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(int param0) {
        if (param0 <= 79) {
            gd.e(-126);
        }
        return this.a(this.field_f.field_q, true);
    }

    final static boolean e(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 >= 1) {
          L0: {
            L1: {
              if (null == lk.field_h) {
                break L1;
              } else {
                if (d.field_f != ad.field_b) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final static ji f(int param0) {
        StringBuilder discarded$1 = null;
        ji var2 = null;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String[] var7 = null;
        int var8 = 0;
        String var9 = null;
        ok var10 = null;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        var11 = HoldTheLine.field_D;
        L0: while (true) {
          if (null != kf.field_q) {
            if (kf.field_q.charAt(0) != 91) {
              jf.a(4);
              continue L0;
            } else {
              L1: {
                if (param0 < -108) {
                  break L1;
                } else {
                  field_h = (jc[]) null;
                  break L1;
                }
              }
              var13 = kf.field_q.substring(1, kf.field_q.indexOf(']'));
              jf.a(4);
              var2 = new ji(var13);
              var3 = new StringBuilder();
              L2: while (true) {
                L3: {
                  if (kf.field_q == null) {
                    break L3;
                  } else {
                    if (91 == kf.field_q.charAt(0)) {
                      break L3;
                    } else {
                      L4: {
                        if (kf.field_q.charAt(0) != 64) {
                          discarded$1 = var3.append(kf.field_q);
                          break L4;
                        } else {
                          var4 = kf.field_q.indexOf(' ');
                          if (-1 != var4) {
                            L5: {
                              var5 = kf.field_q.substring(1, var4);
                              var6 = kf.field_q.substring(var4);
                              var7 = ca.a((byte) -116, ',', var6);
                              if (var5.equalsIgnoreCase("left")) {
                                ac.a(var2, var7, 1, 0);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              if (!var5.equalsIgnoreCase("right")) {
                                break L6;
                              } else {
                                ac.a(var2, var7, 1, 1);
                                break L6;
                              }
                            }
                            L7: {
                              if (!var5.equalsIgnoreCase("top")) {
                                break L7;
                              } else {
                                ac.a(var2, var7, 1, 2);
                                break L7;
                              }
                            }
                            L8: {
                              if (var5.equalsIgnoreCase("bottom")) {
                                ac.a(var2, var7, 1, 3);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (var5.equalsIgnoreCase("tag")) {
                                if (1 == var7.length) {
                                  var2.field_l = var7[0];
                                  break L9;
                                } else {
                                  throw new IllegalArgumentException();
                                }
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (!var5.equalsIgnoreCase("jump")) {
                                break L10;
                              } else {
                                var8 = var7[0].indexOf(' ');
                                if (-1 != var8) {
                                  var9 = var7[0].substring(0, var8).trim();
                                  var7[0] = var7[0].substring(var8);
                                  var10 = w.a(var7, (byte) 55);
                                  var10.field_b = var9;
                                  var2.a(var10, (byte) 7);
                                  break L10;
                                } else {
                                  throw new IllegalArgumentException();
                                }
                              }
                            }
                            L11: {
                              if (var5.equalsIgnoreCase("continue")) {
                                var2.a(w.a(var7, (byte) 55), (byte) 7);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            if (!var5.equalsIgnoreCase("action")) {
                              break L4;
                            } else {
                              var12 = 0;
                              var8 = var12;
                              L12: while (true) {
                                if (var7.length <= var12) {
                                  break L4;
                                } else {
                                  var2.a(tl.a(var7[var12], (byte) -95), 0);
                                  var12++;
                                  continue L12;
                                }
                              }
                            }
                          } else {
                            throw new IllegalArgumentException();
                          }
                        }
                      }
                      jf.a(4);
                      continue L2;
                    }
                  }
                }
                var2.field_f = var3.toString();
                return var2;
              }
            }
          } else {
            return null;
          }
        }
    }

    abstract fd a(String param0, byte param1);

    static {
        int var0 = 0;
        field_h = new jc[255];
        for (var0 = 0; var0 < field_h.length; var0++) {
            field_h[var0] = new jc();
        }
        field_d = new int[8192];
        field_c = new int[4];
        field_g = 0;
    }
}
