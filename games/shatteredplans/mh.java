/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static bi[] field_b;
    private int field_i;
    private int[] field_e;
    private int field_g;
    static String field_a;
    private int field_c;
    private int field_f;
    static pf field_d;
    private int[] field_j;
    static String[] field_h;

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ob var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_34_0 = 0;
            L0: {
              if (param0 >= 15) {
                break L0;
              } else {
                field_a = null;
                break L0;
              }
            }
            if (vp.field_o.field_a < 4) {
              try {
                L1: {
                  L2: {
                    if (gb.field_i != 0) {
                      break L2;
                    } else {
                      oj.field_Gb = dh.field_a.a(65535, hn.field_i, rd.field_d);
                      gb.field_i = gb.field_i + 1;
                      break L2;
                    }
                  }
                  L3: {
                    if (gb.field_i != 1) {
                      break L3;
                    } else {
                      if (2 != oj.field_Gb.field_d) {
                        if (oj.field_Gb.field_d == 1) {
                          gb.field_i = gb.field_i + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        stackOut_13_0 = is.a((byte) -94, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      }
                    }
                  }
                  L4: {
                    if (gb.field_i != 2) {
                      break L4;
                    } else {
                      js.field_a = new ke((java.net.Socket) oj.field_Gb.field_e, dh.field_a);
                      var2 = new ob(13);
                      hq.a(ae.field_h, si.field_u, var2, (byte) 20, sr.field_q);
                      var2.c(15, (byte) -69);
                      var2.e(11135, sg.field_Cb);
                      js.field_a.a(13, 0, var2.field_h, -13976);
                      gb.field_i = gb.field_i + 1;
                      am.field_Cb = 30000L + pr.a(14274);
                      break L4;
                    }
                  }
                  L5: {
                    if (gb.field_i == 3) {
                      if (js.field_a.a(-1) <= 0) {
                        if (am.field_Cb < pr.a(14274)) {
                          stackOut_30_0 = is.a((byte) -94, -2);
                          stackIn_31_0 = stackOut_30_0;
                          return stackIn_31_0;
                        } else {
                          break L5;
                        }
                      } else {
                        var1_int = js.field_a.a((byte) 127);
                        if (0 != var1_int) {
                          stackOut_25_0 = is.a((byte) -94, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        } else {
                          gb.field_i = gb.field_i + 1;
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (4 == gb.field_i) {
                    vp.field_o.a((byte) 90, hq.field_c, (Object) (Object) js.field_a);
                    js.field_a = null;
                    gb.field_i = 0;
                    oj.field_Gb = null;
                    stackOut_34_0 = 0;
                    stackIn_35_0 = stackOut_34_0;
                    break L1;
                  } else {
                    return -1;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return is.a((byte) -94, -3);
              }
              return stackIn_35_0;
            } else {
              if (vp.field_o.field_p == -1) {
                return 3;
              } else {
                if (vp.field_o.field_p != -2) {
                  return 1;
                } else {
                  return 4;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int d(int param0) {
        if (!(((mh) this).field_c != 0)) {
            int discarded$0 = 5;
            this.c();
            ((mh) this).field_c = 256;
        }
        if (param0 != 13) {
            field_b = null;
        }
        int fieldTemp$1 = ((mh) this).field_c - 1;
        ((mh) this).field_c = ((mh) this).field_c - 1;
        return ((mh) this).field_j[fieldTemp$1];
    }

    private final void a() {
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = -1640531527;
        var10 = -1640531527;
        var8 = -1640531527;
        var4 = -1640531527;
        var6 = -1640531527;
        var5 = -1640531527;
        var9 = -1640531527;
        var7 = -1640531527;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 4) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= 256) {
                var2 = 0;
                L2: while (true) {
                  if (var2 >= 256) {
                    int discarded$1 = 5;
                    this.c();
                    ((mh) this).field_c = 256;
                    return;
                  } else {
                    var10 = var10 + ((mh) this).field_e[var2 - -7];
                    var5 = var5 + ((mh) this).field_e[var2 - -2];
                    var4 = var4 + ((mh) this).field_e[1 + var2];
                    var6 = var6 + ((mh) this).field_e[3 + var2];
                    var3 = var3 + ((mh) this).field_e[var2];
                    var9 = var9 + ((mh) this).field_e[6 + var2];
                    var7 = var7 + ((mh) this).field_e[4 + var2];
                    var8 = var8 + ((mh) this).field_e[5 + var2];
                    var3 = var3 ^ var4 << 11;
                    var6 = var6 + var3;
                    var4 = var4 + var5;
                    var4 = var4 ^ var5 >>> 2;
                    var5 = var5 + var6;
                    var7 = var7 + var4;
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
                    var9 = var9 + var10;
                    var3 = var3 + var8;
                    var9 = var9 ^ var10 << 8;
                    var4 = var4 + var9;
                    var10 = var10 + var3;
                    var10 = var10 ^ var3 >>> 9;
                    var3 = var3 + var4;
                    var5 = var5 + var10;
                    ((mh) this).field_e[var2] = var3;
                    ((mh) this).field_e[var2 - -1] = var4;
                    ((mh) this).field_e[var2 + 2] = var5;
                    ((mh) this).field_e[3 + var2] = var6;
                    ((mh) this).field_e[4 + var2] = var7;
                    ((mh) this).field_e[var2 + 5] = var8;
                    ((mh) this).field_e[var2 - -6] = var9;
                    ((mh) this).field_e[var2 + 7] = var10;
                    var2 += 8;
                    continue L2;
                  }
                }
              } else {
                var7 = var7 + ((mh) this).field_j[var2 + 4];
                var8 = var8 + ((mh) this).field_j[5 + var2];
                var3 = var3 + ((mh) this).field_j[var2];
                var9 = var9 + ((mh) this).field_j[var2 - -6];
                var6 = var6 + ((mh) this).field_j[3 + var2];
                var5 = var5 + ((mh) this).field_j[2 + var2];
                var4 = var4 + ((mh) this).field_j[var2 + 1];
                var10 = var10 + ((mh) this).field_j[var2 + 7];
                var3 = var3 ^ var4 << 11;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 2;
                var5 = var5 + var6;
                var7 = var7 + var4;
                var5 = var5 ^ var6 << 8;
                var8 = var8 + var5;
                var6 = var6 + var7;
                var6 = var6 ^ var7 >>> 16;
                var7 = var7 + var8;
                var9 = var9 + var6;
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
                var5 = var5 + var10;
                var3 = var3 + var4;
                ((mh) this).field_e[var2] = var3;
                ((mh) this).field_e[var2 - -1] = var4;
                ((mh) this).field_e[var2 - -2] = var5;
                ((mh) this).field_e[var2 + 3] = var6;
                ((mh) this).field_e[4 + var2] = var7;
                ((mh) this).field_e[5 + var2] = var8;
                ((mh) this).field_e[6 + var2] = var9;
                ((mh) this).field_e[var2 - -7] = var10;
                var2 += 8;
                continue L1;
              }
            }
          } else {
            var3 = var3 ^ var4 << 11;
            var4 = var4 + var5;
            var6 = var6 + var3;
            var4 = var4 ^ var5 >>> 2;
            var5 = var5 + var6;
            var7 = var7 + var4;
            var5 = var5 ^ var6 << 8;
            var8 = var8 + var5;
            var6 = var6 + var7;
            var6 = var6 ^ var7 >>> 16;
            var9 = var9 + var6;
            var7 = var7 + var8;
            var7 = var7 ^ var8 << 10;
            var10 = var10 + var7;
            var8 = var8 + var9;
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

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (gf.field_i > param1) {
                break L1;
              } else {
                if (param1 >= gf.field_l) {
                  break L1;
                } else {
                  L2: {
                    if (gf.field_a <= param2) {
                      break L2;
                    } else {
                      param0 = param0 + (param2 + -gf.field_a);
                      param2 = gf.field_a;
                      break L2;
                    }
                  }
                  L3: {
                    if (gf.field_f < param0 + param2) {
                      param0 = -param2 + gf.field_f;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6 = param1 + gf.field_b * param2;
                  L4: while (true) {
                    if (param0 <= 0) {
                      break L0;
                    } else {
                      param1 = gf.field_h[var6];
                      var5_int = param3;
                      param2 = var5_int - -param1;
                      var5_int = (var5_int & 16711935) - -(param1 & 16711935);
                      param1 = (var5_int & 16777472) - -(65536 & param2 - var5_int);
                      gf.field_h[var6] = ee.a(-(param1 >>> 8) + param1, -param1 + param2);
                      var6 = var6 + gf.field_b;
                      param0--;
                      continue L4;
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var5, "mh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + false + ')');
        }
    }

    final static void b(int param0) {
        p.field_A = new int[600];
        sd.field_p = 0;
        if (param0 != 1674225316) {
            int discarded$0 = mh.b((byte) -95);
        }
        np.field_f = new int[600];
    }

    private final void c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int fieldTemp$3 = ((mh) this).field_f + 1;
        ((mh) this).field_f = ((mh) this).field_f + 1;
        ((mh) this).field_i = ((mh) this).field_i + fieldTemp$3;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            return;
          } else {
            L1: {
              var3 = ((mh) this).field_e[var2];
              if ((2 & var2) == 0) {
                if (0 == (1 & var2)) {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g << 13;
                  break L1;
                } else {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g >>> 6;
                  break L1;
                }
              } else {
                if (0 == (1 & var2)) {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g << 2;
                  break L1;
                } else {
                  ((mh) this).field_g = ((mh) this).field_g ^ ((mh) this).field_g >>> 16;
                  break L1;
                }
              }
            }
            ((mh) this).field_g = ((mh) this).field_g + ((mh) this).field_e[255 & var2 + 128];
            int dupTemp$4 = ((mh) this).field_g + (((mh) this).field_e[we.a(var3 >> 2, 255)] - -((mh) this).field_i);
            var4 = dupTemp$4;
            ((mh) this).field_e[var2] = dupTemp$4;
            int dupTemp$5 = var3 + ((mh) this).field_e[we.a(255, var4 >> 8 >> 2)];
            ((mh) this).field_i = dupTemp$5;
            ((mh) this).field_j[var2] = dupTemp$5;
            var2++;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    mh(int[] param0) {
        int var2_int = 0;
        try {
            ((mh) this).field_e = new int[256];
            ((mh) this).field_j = new int[256];
            for (var2_int = 0; param0.length > var2_int; var2_int++) {
                ((mh) this).field_j[var2_int] = param0[var2_int];
            }
            int discarded$0 = 75;
            this.a();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This entry doesn't match";
        field_d = new pf();
    }
}
