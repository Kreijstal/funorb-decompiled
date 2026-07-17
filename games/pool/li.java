/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li {
    private int field_m;
    private int field_i;
    private int field_c;
    static int field_e;
    static jg field_l;
    static int field_d;
    static String field_g;
    static int[] field_h;
    private int[] field_j;
    private int[] field_a;
    static dd[] field_f;
    static int[] field_b;
    private int field_k;

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        field_l = null;
        field_h = null;
        field_b = null;
        if (param0 >= 0) {
            Object var2 = null;
            li.a(57, (al) null);
        }
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        if (param1 <= 0) {
            throw new IllegalArgumentException();
        }
        int var3 = 2147483647 + -(int)(4294967296L % (long)param1);
        if (param0 != 23165) {
            Object var5 = null;
            li.a(73, (al) null);
        }
        do {
            var4 = ((li) this).a((byte) 7);
        } while (var4 > var3);
        return aj.a(true, param1, var4);
    }

    private final void a() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int fieldTemp$3 = ((li) this).field_i + 1;
        ((li) this).field_i = ((li) this).field_i + 1;
        ((li) this).field_k = ((li) this).field_k + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((li) this).field_a[var2];
              if (0 == (var2 & 2)) {
                if ((var2 & 1) != 0) {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m >>> 6;
                  break L1;
                } else {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m << 13;
                  break L1;
                }
              } else {
                if ((var2 & 1) != 0) {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m >>> 16;
                  break L1;
                } else {
                  ((li) this).field_m = ((li) this).field_m ^ ((li) this).field_m << 2;
                  break L1;
                }
              }
            }
            ((li) this).field_m = ((li) this).field_m + ((li) this).field_a[255 & var2 + 128];
            int dupTemp$4 = ((li) this).field_k + (((li) this).field_a[rb.b(var3 >> 2, 255)] + ((li) this).field_m);
            var4 = dupTemp$4;
            ((li) this).field_a[var2] = dupTemp$4;
            int dupTemp$5 = ((li) this).field_a[rb.b(var4, 261279) >> 8 >> 2] - -var3;
            ((li) this).field_k = dupTemp$5;
            ((li) this).field_j[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    private final void b() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var4 = -1640531527;
        var10 = -1640531527;
        var5 = -1640531527;
        var6 = -1640531527;
        var3 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var8 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    int discarded$1 = 1;
                    this.a();
                    ((li) this).field_c = 256;
                    return;
                  } else {
                    var10 = var10 + ((li) this).field_a[7 + var2];
                    var9 = var9 + ((li) this).field_a[6 + var2];
                    var3 = var3 + ((li) this).field_a[var2];
                    var8 = var8 + ((li) this).field_a[5 + var2];
                    var6 = var6 + ((li) this).field_a[3 + var2];
                    var4 = var4 + ((li) this).field_a[1 + var2];
                    var5 = var5 + ((li) this).field_a[var2 - -2];
                    var7 = var7 + ((li) this).field_a[4 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var7 = var7 + var4;
                    var5 = var5 + var6;
                    var5 = var5 ^ var6 << 8;
                    var6 = var6 + var7;
                    var8 = var8 + var5;
                    var6 = var6 ^ var7 >>> 16;
                    var7 = var7 + var8;
                    var9 = var9 + var6;
                    var7 = var7 ^ var8 << 10;
                    var8 = var8 + var9;
                    var10 = var10 + var7;
                    var8 = var8 ^ var9 >>> 4;
                    var3 = var3 + var8;
                    var9 = var9 + var10;
                    var9 = var9 ^ var10 << 8;
                    var10 = var10 + var3;
                    var4 = var4 + var9;
                    var10 = var10 ^ var3 >>> 9;
                    var5 = var5 + var10;
                    var3 = var3 + var4;
                    ((li) this).field_a[var2] = var3;
                    ((li) this).field_a[var2 - -1] = var4;
                    ((li) this).field_a[var2 - -2] = var5;
                    ((li) this).field_a[var2 - -3] = var6;
                    ((li) this).field_a[var2 - -4] = var7;
                    ((li) this).field_a[5 + var2] = var8;
                    ((li) this).field_a[6 + var2] = var9;
                    ((li) this).field_a[var2 - -7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var5 = var5 + ((li) this).field_j[var2 - -2];
                var4 = var4 + ((li) this).field_j[1 + var2];
                var6 = var6 + ((li) this).field_j[3 + var2];
                var7 = var7 + ((li) this).field_j[4 + var2];
                var9 = var9 + ((li) this).field_j[var2 - -6];
                var3 = var3 + ((li) this).field_j[var2];
                var8 = var8 + ((li) this).field_j[5 + var2];
                var10 = var10 + ((li) this).field_j[var2 - -7];
                var3 = var3 ^ var4 << 11;
                var4 = var4 + var5;
                var6 = var6 + var3;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> 16;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << 10;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 4;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 8;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> 9;
                var3 = var3 + var4;
                var5 = var5 + var10;
                ((li) this).field_a[var2] = var3;
                ((li) this).field_a[1 + var2] = var4;
                ((li) this).field_a[var2 + 2] = var5;
                ((li) this).field_a[3 + var2] = var6;
                ((li) this).field_a[var2 - -4] = var7;
                ((li) this).field_a[5 + var2] = var8;
                ((li) this).field_a[var2 - -6] = var9;
                ((li) this).field_a[7 + var2] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var6 = var6 + var3;
            var4 = var4 + var5;
            var4 = var4 ^ var5 >>> 2;
            var7 = var7 + var4;
            var5 = var5 + var6;
            var5 = var5 ^ var6 << 8;
            var6 = var6 + var7;
            var8 = var8 + var5;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var8 = var8 + var9;
            var10 = var10 + var7;
            var8 = var8 ^ var9 >>> 4;
            var3 = var3 + var8;
            var9 = var9 + var10;
            var9 = var9 ^ var10 << 8;
            var4 = var4 + var9;
            var10 = var10 + var3;
            var10 = var10 ^ var3 >>> 9;
            var5 = var5 + var10;
            var3 = var3 + var4;
            var2++;
            continue L0;
          }
        }
    }

    final static void a(eg param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            var2_int = 0;
            var3 = 0;
            L1: while (true) {
              if (param0.field_K <= var3) {
                param0.field_o = sh.a((byte) 60, param0.field_o, var2_int);
                param0.field_p = ap.a(param0.field_p, (byte) -73, var2_int * 3);
                param0.field_H = ap.a(param0.field_H, (byte) -73, var2_int * 3);
                param0.field_C = ap.a(param0.field_C, (byte) -73, var2_int * 3);
                param0.field_g = jh.a(var2_int * 3, (byte) 108, param0.field_g);
                param0.field_Y = jh.a(3 * var2_int, (byte) 108, param0.field_Y);
                param0.field_q = jh.a(var2_int * 3, (byte) 108, param0.field_q);
                var13 = 0;
                var2_int = var13;
                L2: while (true) {
                  if (param0.field_K <= var13) {
                    break L0;
                  } else {
                    L3: {
                      if (param0.field_L[var13] == -1) {
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var13++;
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (param0.field_L[var3] == -1) {
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("li.C(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 41);
        }
    }

    li(int[] param0) {
        int var2_int = 0;
        try {
            ((li) this).field_j = new int[256];
            ((li) this).field_a = new int[256];
            for (var2_int = 0; var2_int < param0.length; var2_int++) {
                ((li) this).field_j[var2_int] = param0[var2_int];
            }
            int discarded$0 = 2;
            this.b();
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "li.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(byte param0) {
        if (param0 != 7) {
            return -38;
        }
        if (((li) this).field_c == 0) {
            int discarded$0 = 1;
            this.a();
            ((li) this).field_c = 256;
        }
        int fieldTemp$1 = ((li) this).field_c - 1;
        ((li) this).field_c = ((li) this).field_c - 1;
        return ((li) this).field_j[fieldTemp$1];
    }

    final static void a(int param0, al param1) {
        RuntimeException var2 = null;
        aa var3 = null;
        qe var4 = null;
        oq var5 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 2243) {
                break L1;
              } else {
                field_d = 116;
                break L1;
              }
            }
            L2: {
              var5 = new oq(4096);
              var3 = new aa(param1.field_u);
              if (param1.field_f instanceof af) {
                var5.a(0, false);
                break L2;
              } else {
                if (!(param1.field_f instanceof fj)) {
                  if (param1.field_f instanceof rj) {
                    var5.a(2, false);
                    break L2;
                  } else {
                    if (!(param1.field_f instanceof mc)) {
                      if (param1.field_f instanceof vp) {
                        var5.a(4, false);
                        break L2;
                      } else {
                        var5.a(-1, false);
                        break L2;
                      }
                    } else {
                      var5.a(3, false);
                      break L2;
                    }
                  }
                } else {
                  var5.a(1, false);
                  break L2;
                }
              }
            }
            var4 = (qe) (Object) var3.b((byte) -92);
            L3: while (true) {
              if (var4 == null) {
                var5.a(true, -1);
                System.out.println("pool2:" + np.a(false, var5));
                break L0;
              } else {
                L4: {
                  var5.a(true, var4.field_v);
                  var5.a(var4.field_L, false);
                  var5.a((byte) -81, var4.field_M);
                  var5.a(true, var4.field_P);
                  var5.a(true, var4.field_Q);
                  var5.a((byte) -81, (int) var4.field_C);
                  var5.a((byte) -81, (int) var4.field_A);
                  var5.a((byte) -81, (int) var4.field_V);
                  var5.a((int) var4.field_D, false);
                  var5.a((int) var4.field_H, false);
                  var5.a(var4.field_q, false);
                  if (var4.field_q < 2) {
                    break L4;
                  } else {
                    var4.b((ge) (Object) var5, (byte) -122);
                    var5.a(var4.field_x, (byte) -122);
                    break L4;
                  }
                }
                L5: {
                  if (var4.field_q < 3) {
                    break L5;
                  } else {
                    var4.a((ge) (Object) var5, (byte) 0);
                    break L5;
                  }
                }
                var4 = (qe) (Object) var3.b(-126);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("li.D(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "ESC - cancel private message";
        field_d = 0;
        field_h = new int[8192];
    }
}
