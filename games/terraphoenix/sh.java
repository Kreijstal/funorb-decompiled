/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends uf {
    static String field_x;
    static String field_q;
    int field_i;
    int field_w;
    int field_t;
    int field_y;
    int field_D;
    qd field_B;
    static int[] field_E;
    int field_o;
    int field_v;
    static volatile int field_z;
    int field_h;
    int field_l;
    gm field_m;
    int field_j;
    int field_r;
    int field_s;
    lh field_k;
    static long field_n;
    int field_u;
    gg field_F;
    int field_C;
    int field_G;
    int field_p;
    int field_A;

    public static void c(int param0) {
        field_x = null;
        field_E = null;
        if (param0 > -26) {
            field_x = null;
        }
        field_q = null;
    }

    final static void a(byte param0, int param1, int param2) {
        ll.field_a = param1;
        tf.field_k = param2;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        bm var9 = null;
        int var10 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_34_0 = null;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        bm stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        bm stackOut_44_0 = null;
        bm stackOut_43_0 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var1_int = jh.field_m;
              var2 = 0;
              if (2 != pe.field_e) {
                break L1;
              } else {
                var3_long = -hj.field_I + ll.a(1000);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -1) {
                break L2;
              } else {
                sh.a(-70);
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= rb.field_d.length) {
                break L0;
              } else {
                L4: {
                  var4 = f.field_a[var3];
                  if (var4 < 0) {
                    var5 = pl.field_P;
                    break L4;
                  } else {
                    if (~ai.field_i.field_h != ~var4) {
                      var5 = eb.field_I;
                      break L4;
                    } else {
                      var5 = ib.field_cb;
                      break L4;
                    }
                  }
                }
                L5: {
                  var6 = rb.field_d[var3];
                  if (pe.field_e != 2) {
                    break L5;
                  } else {
                    if (var2 != 1) {
                      break L5;
                    } else {
                      L6: {
                        if (ia.field_r.length >= km.field_c.length) {
                          stackOut_18_0 = ia.field_r.length;
                          stackIn_19_0 = stackOut_18_0;
                          break L6;
                        } else {
                          stackOut_17_0 = km.field_c.length;
                          stackIn_19_0 = stackOut_17_0;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_19_0;
                        if (~kj.field_c.length > ~ec.field_d.length) {
                          stackOut_21_0 = ec.field_d.length;
                          stackIn_22_0 = stackOut_21_0;
                          break L7;
                        } else {
                          stackOut_20_0 = kj.field_c.length;
                          stackIn_22_0 = stackOut_20_0;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_22_0;
                        if (6 > var3) {
                          break L8;
                        } else {
                          if (var3 < 6 + var7) {
                            L9: {
                              if (0 <= -var7 + (ia.field_r.length + var3 + -6)) {
                                stackOut_27_0 = ia.field_r[-var7 + ia.field_r.length + var3 - 6];
                                stackIn_28_0 = stackOut_27_0;
                                break L9;
                              } else {
                                stackOut_26_0 = "";
                                stackIn_28_0 = stackOut_26_0;
                                break L9;
                              }
                            }
                            var6 = stackIn_28_0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var3 < 7 + var7) {
                        break L5;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L5;
                        } else {
                          L10: {
                            if (var3 - 7 + -var7 < kj.field_c.length) {
                              stackOut_33_0 = kj.field_c[-7 + (var3 + -var7)];
                              stackIn_34_0 = stackOut_33_0;
                              break L10;
                            } else {
                              stackOut_32_0 = "";
                              stackIn_34_0 = stackOut_32_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L5;
                        }
                      }
                    }
                  }
                }
                L11: {
                  if (-2 != var4) {
                    break L11;
                  } else {
                    var6 = Integer.toString(var2);
                    break L11;
                  }
                }
                L12: {
                  stackOut_37_0 = 87;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var4 < 0) {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    stackIn_40_1 = stackOut_39_1;
                    break L12;
                  } else {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = 1;
                    stackIn_40_0 = stackOut_38_0;
                    stackIn_40_1 = stackOut_38_1;
                    break L12;
                  }
                }
                L13: {
                  var7 = bb.a((byte) stackIn_40_0, stackIn_40_1 != 0, var6);
                  var8 = -(var7 >> 1) + nd.field_r;
                  if (var4 >= 0) {
                    L14: {
                      if (var4 == ai.field_i.field_h) {
                        stackOut_44_0 = sa.field_c;
                        stackIn_45_0 = stackOut_44_0;
                        break L14;
                      } else {
                        stackOut_43_0 = pj.field_q;
                        stackIn_45_0 = stackOut_43_0;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_45_0;
                      var1_int = var1_int + hi.field_ab;
                      if (var9 == null) {
                        break L15;
                      } else {
                        var9.a(var7 - -(se.field_j << 1), var8 + -se.field_j, lm.field_d - -(dc.field_b << 1), 0, var1_int);
                        break L15;
                      }
                    }
                    var1_int = var1_int + dc.field_b;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if (0 > var4) {
                    da.field_h.b(var6, var8, af.field_a + var1_int, var5, -1);
                    var1_int = var1_int + jm.field_b;
                    break L16;
                  } else {
                    qk.field_a.b(var6, var8, var1_int + fh.field_a, var5, -1);
                    var1_int = var1_int + (hi.field_ab + dc.field_b - -lm.field_d);
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1, "sh.A(" + param0 + 41);
        }
    }

    final void c(byte param0) {
        ((sh) this).field_F = null;
        ((sh) this).field_m = null;
        ((sh) this).field_k = null;
        ((sh) this).field_B = null;
        if (param0 >= -107) {
            sh.c(-17);
        }
    }

    sh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Account created successfully!";
        field_z = 0;
        field_E = new int[192];
        field_x = "This game has been updated! Please reload this page.";
    }
}
