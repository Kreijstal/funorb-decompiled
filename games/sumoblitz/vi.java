/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends nt {
    private int field_w;
    static tg field_v;
    private int field_t;
    private int field_x;
    static int[] field_z;
    boolean field_u;
    static dc field_y;
    private int field_s;

    final static void e() {
        int discarded$0 = 5178;
        od.a();
        rd.a(4, -27);
    }

    final boolean a(int param0) {
        int var3 = Sumoblitz.field_L ? 1 : 0;
        if (((vi) this).field_t <= ((vi) this).field_p) {
        } else {
            ((vi) this).field_k = ((vi) this).field_k + ((vi) this).field_w;
            ((vi) this).field_o = ((vi) this).field_o + ((vi) this).field_x;
            ((vi) this).field_w = ((vi) this).field_w * 251 / 300;
            ((vi) this).field_x = ((vi) this).field_x * 251 / 300;
            if (((vi) this).field_w >= 0) {
                ((vi) this).field_w = ((vi) this).field_w + 1;
            } else {
                ((vi) this).field_w = ((vi) this).field_w - 1;
            }
            if (((vi) this).field_x >= 0) {
                ((vi) this).field_x = ((vi) this).field_x + 1;
            } else {
                ((vi) this).field_x = ((vi) this).field_x - 1;
            }
        }
        if (param0 != -2567) {
            return true;
        }
        return super.a(-2567);
    }

    final static boolean f() {
        int var1 = 0;
        if (null == kd.field_a[0]) {
          L0: {
            si.a(135, 38, 148, 2, new int[7], 0, 492);
            si.a(150, 38, 170, 2, new int[6], 1, 470);
            si.a(150, 38, 170, 2, new int[5], 8, 470);
            si.a(400, 38, 150, 2, new int[2], 2, 490);
            si.a(430, 38, 170, 2, new int[3], 3, 470);
            si.a(430, 38, 170, 2, new int[2], 4, 470);
            si.a(430, 38, 170, 2, new int[2], 5, 470);
            si.a(200, 96, 170, 2, new int[2], 6, 470);
            si.a(390, 38, 170, 2, new int[2], 7, 468);
            si.a(400, 38, 200, 2, new int[2], 9, 440);
            si.a(370, 38, 200, 2, new int[2], 10, 440);
            si.a(240, 38, 200, 2, new int[2], 11, 440);
            si.a(370, 38, 200, 2, new int[1], 12, 440);
            t.field_q = (int)((double)ma.field_b.a(fn.field_u[12], 0) * 1.5);
            var1 = (int)((double)ma.field_b.a(fn.field_u[13], 0) * 1.5);
            if (t.field_q >= var1) {
              break L0;
            } else {
              t.field_q = var1;
              break L0;
            }
          }
          hg.field_o = new lg();
          return true;
        } else {
          return false;
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_z = null;
        field_v = null;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (((vi) this).field_s == 0) {
                uc.field_a.a((float)(((vi) this).field_k >> 8), (float)(((vi) this).field_o >> 8), 2048, 0, 3, 16777215 - -(((vi) this).field_p * (256 / ((vi) this).field_t) << 24), 1);
                break L1;
              } else {
                im.field_a.a((float)(((vi) this).field_k >> 8), (float)(((vi) this).field_o >> 8), 8192, 0, 0, (256 / ((vi) this).field_t * ((vi) this).field_p << 24) + ((vi) this).field_q, 1);
                break L1;
              }
            }
            L2: {
              if (param1 <= -121) {
                break L2;
              } else {
                field_v = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("vi.C(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    vi(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param0, param1, param2, param3);
        ((vi) this).field_s = param6;
        ((vi) this).field_x = param5;
        ((vi) this).field_t = param0;
        ((vi) this).field_w = param4;
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        km var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        pl var13 = null;
        int var14 = 0;
        int var15 = 0;
        pl var16 = null;
        int[][] var20 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var13 = ig.field_a;
            var16 = var13;
            var2 = var16.e(-31302);
            var3 = (km) (Object) dk.field_a.b(122);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 == var3.field_n) {
                    break L2;
                  } else {
                    var3 = (km) (Object) dk.field_a.d((byte) 18);
                    continue L1;
                  }
                }
              }
              if (var3 != null) {
                L3: {
                  var4 = var16.e(-31302);
                  if (var4 != 0) {
                    var5 = var3.field_l;
                    rf.field_b[0] = qv.field_o;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        tn.b(var4, -2147483648, var5);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            qr.a(13136, var5);
                            var6 = new String[2][var5];
                            var20 = new int[2][var5 * 4];
                            var8 = se.field_d;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var14 = 0;
                                var9 = var14;
                                var15 = 0;
                                var10 = var15;
                                L7: while (true) {
                                  if (var14 < var8) {
                                    L8: {
                                      var11 = pd.field_q[var14 + var5];
                                      var6[1][var15] = rf.field_b[var11];
                                      var20[1][4 * var15] = lj.field_a[var11];
                                      var20[1][1 + 4 * var15] = jf.field_f[var11];
                                      var20[1][2 + 4 * var15] = ic.field_c[var11];
                                      var20[1][var15 * 4 + 3] = field_z[var11];
                                      int discarded$2 = -25;
                                      if (!ea.a(rf.field_b[var11])) {
                                        break L8;
                                      } else {
                                        if (jf.field_f[var11] - (-ic.field_c[var11] - field_z[var11]) != 0) {
                                          break L8;
                                        } else {
                                          var6[1][var15] = null;
                                          var15--;
                                          break L8;
                                        }
                                      }
                                    }
                                    var15++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var3.b(false);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = pd.field_q[var9];
                                  var6[0][var10] = rf.field_b[var11];
                                  var20[0][var10 * 4] = lj.field_a[var11];
                                  var20[0][var10 * 4 + 1] = jf.field_f[var11];
                                  var20[0][2 + 4 * var10] = ic.field_c[var11];
                                  var20[0][var10 * 4 + 3] = field_z[var11];
                                  int discarded$3 = -25;
                                  if (ea.a(rf.field_b[var11])) {
                                    if (field_z[var11] + jf.field_f[var11] + ic.field_c[var11] == 0) {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              nm.a((fs) (Object) var16, (byte) 61);
                              if (var6_int == 0) {
                                oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                                break L10;
                              } else {
                                oc.a(bb.field_l, qk.field_U, true, var6_int, sd.field_f, ch.field_d);
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        rf.field_b[var6_int] = var13.d(-1);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.b(false);
                    break L3;
                  }
                }
                break L0;
              } else {
                kk.a((byte) -115);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "vi.A(" + -77 + ')');
        }
    }

    final static void a() {
        RuntimeException var2 = null;
        int var3 = 0;
        id var4 = null;
        of var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (id) (Object) ow.field_f.b(85);
            L1: while (true) {
              if (var4 == null) {
                var5 = (of) (Object) oi.field_b.b(109);
                L2: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    pd.a((byte) -65, 3, var5);
                    var5 = (of) (Object) oi.field_b.d((byte) 18);
                    continue L2;
                  }
                }
              } else {
                km.a((byte) -120, 3, var4);
                var4 = (id) (Object) ow.field_f.d((byte) 18);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "vi.D(" + 3 + ',' + -73 + ')');
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param3) {
            var4 += 4;
        }
        if (param1) {
            var4 += 2;
        }
        var4++;
        return kr.field_f[var4];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new tg();
    }
}
