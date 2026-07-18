/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ufa {
    boolean field_a;
    static int[] field_e;
    int field_h;
    static int[] field_d;
    int field_g;
    private static int[] field_p;
    private static int[] field_f;
    static String field_u;
    boolean field_l;
    private vna field_i;
    private BitSet field_s;
    int field_k;
    static int[] field_t;
    private static int[] field_b;
    int[] field_n;
    private static int[] field_j;
    BitSet field_o;
    private BitSet field_m;
    static int field_c;
    static String[] field_q;
    static nh[] field_r;

    final static void a(boolean param0) {
        vc.field_n.setLength(0);
        bta.field_q = 0;
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "Profile - ";
        var1 = var1 + "RoomsComplete[" + (Object) (Object) ((ufa) this).field_o + "]";
        var1 = var1 + "CharUnlocked[" + ((ufa) this).field_s.toString() + "]";
        var1 = var1 + "CourUnlocked[" + ((ufa) this).field_m.toString() + "]";
        var1 = var1 + "WorldMedals[";
        for (var2 = 0; ((ufa) this).field_n.length > var2; var2++) {
            var1 = var1 + ((ufa) this).field_n[var2] + " ,";
        }
        var1 = var1 + "]";
        return var1;
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_p = null;
        int var1 = 76 / ((-14 - param0) / 48);
        field_u = null;
        field_t = null;
        field_d = null;
        field_b = null;
        field_r = null;
        field_j = null;
        field_q = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 >= -22) {
            return true;
        }
        return ((ufa) this).field_m.get(param1);
    }

    final void a(kh param0, byte param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = param0.h(255);
            if (var3_int >= 16) {
              param0.h((byte) -11);
              ((ufa) this).field_l = uha.a(5907, param0);
              var4 = param0.b((byte) 44, 8);
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  var6 = -25 % ((69 - param1) / 53);
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= 13) {
                      var5 = 0;
                      L3: while (true) {
                        if (var5 >= 9) {
                          var5 = 0;
                          L4: while (true) {
                            if (((ufa) this).field_n.length <= var5) {
                              ((ufa) this).field_g = param0.b((byte) 44, 4);
                              ((ufa) this).field_h = param0.b((byte) 44, 8);
                              ((ufa) this).field_k = param0.b((byte) 44, 8);
                              param0.i((byte) 98);
                              break L0;
                            } else {
                              ((ufa) this).field_n[var5] = param0.b((byte) 44, 2);
                              var5++;
                              continue L4;
                            }
                          }
                        } else {
                          L5: {
                            if (!uha.a(5907, param0)) {
                              break L5;
                            } else {
                              ((ufa) this).field_m.set(var5);
                              break L5;
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      L6: {
                        if (uha.a(5907, param0)) {
                          ((ufa) this).field_s.set(var5);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  L7: {
                    if (!uha.a(5907, param0)) {
                      break L7;
                    } else {
                      ((ufa) this).field_o.set(var5);
                      break L7;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("ufa.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0, int param1) {
        if (param0 != 4) {
            ((ufa) this).field_l = false;
        }
        return ((ufa) this).field_s.get(param1);
    }

    final taa c(int param0) {
        if (param0 < 29) {
            ufa.b(90);
        }
        return (taa) (Object) ((ufa) this).field_i.c(59);
    }

    final int a(int param0) {
        int var2 = -45 / ((-54 - param0) / 34);
        return ((ufa) this).field_i.a((byte) -16);
    }

    final static void a(int param0, int param1) {
        L0: {
          L1: {
            if (null == pqa.field_m) {
              break L1;
            } else {
              if (param1 <= pqa.field_m.length) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          pqa.field_m = new int[param1];
          break L0;
        }
        L2: {
          if (param0 < -29) {
            break L2;
          } else {
            field_b = null;
            break L2;
          }
        }
    }

    final void a(int param0, kh param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            param1.i(16, 0);
            param1.i(8);
            boolean discarded$4 = wfa.a(((ufa) this).field_l, 126, param1);
            var3_int = -1 + ((ufa) this).field_o.size();
            param1.a((byte) -4, var3_int, 8);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3_int) {
                var4 = 0;
                L2: while (true) {
                  if (var4 >= 13) {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= 9) {
                        L4: {
                          if (param0 == -2016804080) {
                            break L4;
                          } else {
                            field_e = null;
                            break L4;
                          }
                        }
                        var4 = 0;
                        L5: while (true) {
                          if (((ufa) this).field_n.length <= var4) {
                            param1.a((byte) 93, ((ufa) this).field_g, 4);
                            param1.a((byte) -128, ((ufa) this).field_h, 8);
                            param1.a((byte) -26, ((ufa) this).field_k, 8);
                            param1.k(-1826190686);
                            break L0;
                          } else {
                            param1.a((byte) -125, ((ufa) this).field_n[var4], 2);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        boolean discarded$5 = wfa.a(((ufa) this).field_m.get(var4), param0 ^ -2016803978, param1);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    boolean discarded$6 = wfa.a(((ufa) this).field_s.get(var4), param0 + 2016803960, param1);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                boolean discarded$7 = wfa.a(((ufa) this).field_o.get(var4), -52, param1);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ufa.G(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    public ufa() {
        ((ufa) this).field_l = false;
        ((ufa) this).field_a = false;
        ((ufa) this).field_o = new BitSet(255);
        ((ufa) this).field_i = new vna();
        ((ufa) this).field_n = new int[9];
        ((ufa) this).field_s = new BitSet(13);
        ((ufa) this).field_m = new BitSet(9);
        ((ufa) this).field_s.set(0);
        ((ufa) this).field_s.set(6);
        ((ufa) this).field_m.set(0);
        ((ufa) this).field_g = 0;
        ((ufa) this).field_h = 255;
        ((ufa) this).field_k = 255;
    }

    final void a(int param0, taa param1) {
        try {
            if (param0 != 8) {
                ufa.a(true);
            }
            ((ufa) this).field_i.b((byte) -48, (vg) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ufa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_u = "Won";
        field_p = new int[256];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_b = new int[256];
            var0 = 0;
            L1: while (true) {
              if (var0 >= 256) {
                field_j = new int[256];
                var0 = 0;
                L2: while (true) {
                  if (var0 >= 256) {
                    field_f = new int[256];
                    var0 = 0;
                    L3: while (true) {
                      if (var0 >= 256) {
                        field_d = new int[256];
                        var0 = 0;
                        L4: while (true) {
                          if (256 <= var0) {
                            field_e = new int[8];
                            var0 = 0;
                            L5: while (true) {
                              if (var0 >= 8) {
                                field_t = new int[8];
                                var0 = 0;
                                L6: while (true) {
                                  if (8 <= var0) {
                                    field_q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
                                    field_c = -1;
                                    return;
                                  } else {
                                    field_t[var0] = fh.a(var0, fh.a(var0 << 16, sea.c(-127926241, var0) << 11));
                                    var0++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_e[var0] = fh.a(var0, fh.a(var0 << 21, sea.c(var0, -480247777) << 11));
                                var0++;
                                continue L5;
                              }
                            }
                          } else {
                            field_d[var0] = fh.a(var0, fh.a(var0 << 16, sea.c(var0, 1795162367) << 8));
                            var0++;
                            continue L4;
                          }
                        }
                      } else {
                        field_f[var0] = fh.a(var0 >> 5, fh.a(var0 << 16, sea.c(-1207958532, var0) << 6));
                        var0++;
                        continue L3;
                      }
                    }
                  } else {
                    field_j[var0] = fh.a(fh.a(sea.c(65306, var0 << 7), sea.c(-861666308, var0) << 14), var0);
                    var0++;
                    continue L2;
                  }
                }
              } else {
                field_b[var0] = fh.a(fh.a(sea.c(65308, var0 << 6), sea.c(var0, 762841080) << 13), var0);
                var0++;
                continue L1;
              }
            }
          } else {
            field_p[var0] = fh.a(var0 >> 3, fh.a(var0 << 16, sea.c(1342178300, var0) << 6));
            var0++;
            continue L0;
          }
        }
    }
}
