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
        if (param0 > -110) {
            sh.c(-18);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        bm var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_33_0 = null;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        bm stackIn_44_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_36_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        bm stackOut_43_0 = null;
        bm stackOut_42_0 = null;
        L0: {
          var10 = Terraphoenix.field_V;
          var1 = jh.field_m;
          var2 = 0;
          if (2 != pe.field_e) {
            break L0;
          } else {
            var3_long = -hj.field_I + ll.a(1000);
            var2 = (int)((10999L + -var3_long) / 1000L);
            if ((var2 ^ -1) > -1) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -1) {
            break L1;
          } else {
            sh.a(-70);
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (var3 >= rb.field_d.length) {
            return;
          } else {
            L3: {
              var4 = f.field_a[var3];
              if (var4 < 0) {
                var5 = pl.field_P;
                break L3;
              } else {
                if (ai.field_i.field_h != var4) {
                  var5 = eb.field_I;
                  break L3;
                } else {
                  var5 = ib.field_cb;
                  break L3;
                }
              }
            }
            L4: {
              var6 = rb.field_d[var3];
              if (pe.field_e != -3) {
                break L4;
              } else {
                if (-2 != var2) {
                  break L4;
                } else {
                  L5: {
                    if (ia.field_r.length >= km.field_c.length) {
                      stackOut_17_0 = ia.field_r.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = km.field_c.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (kj.field_c.length < ec.field_d.length) {
                      stackOut_20_0 = ec.field_d.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = kj.field_c.length;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = stackIn_21_0;
                    if (6 > var3) {
                      break L7;
                    } else {
                      if (var3 < 6 + var7) {
                        L8: {
                          if (0 <= -var7 + (ia.field_r.length + var3 + -6)) {
                            stackOut_26_0 = ia.field_r[-var7 + ia.field_r.length + var3 - 6];
                            stackIn_27_0 = stackOut_26_0;
                            break L8;
                          } else {
                            stackOut_25_0 = "";
                            stackIn_27_0 = stackOut_25_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_27_0;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var3 < 7 + var7) {
                    break L4;
                  } else {
                    if (var8 + var7 + 7 <= var3) {
                      break L4;
                    } else {
                      L9: {
                        if (var3 - 7 + -var7 < kj.field_c.length) {
                          stackOut_32_0 = kj.field_c[-7 + (var3 + -var7)];
                          stackIn_33_0 = stackOut_32_0;
                          break L9;
                        } else {
                          stackOut_31_0 = "";
                          stackIn_33_0 = stackOut_31_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_33_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (-2 != var4) {
                break L10;
              } else {
                var6_ref = Integer.toString(var2);
                break L10;
              }
            }
            L11: {
              stackOut_36_0 = 87;
              stackIn_38_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if ((var4 ^ -1) > -1) {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                break L11;
              } else {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                break L11;
              }
            }
            L12: {
              var7 = bb.a((byte) stackIn_39_0, stackIn_39_1 != 0, var6_ref);
              var8 = -(var7 >> 708820321) + nd.field_r;
              if (var4 >= 0) {
                L13: {
                  if (var4 == ai.field_i.field_h) {
                    stackOut_43_0 = sa.field_c;
                    stackIn_44_0 = stackOut_43_0;
                    break L13;
                  } else {
                    stackOut_42_0 = pj.field_q;
                    stackIn_44_0 = stackOut_42_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_44_0;
                  var1 = var1 + hi.field_ab;
                  if (var9 == null) {
                    break L14;
                  } else {
                    var9.a(var7 - -(se.field_j << 1941204129), var8 + -se.field_j, lm.field_d - -(dc.field_b << -52449087), 0, var1);
                    break L14;
                  }
                }
                var1 = var1 + dc.field_b;
                break L12;
              } else {
                break L12;
              }
            }
            if (0 > var4) {
              da.field_h.b(var6_ref, var8, af.field_a + var1, var5, -1);
              var1 = var1 + jm.field_b;
              var3++;
              continue L2;
            } else {
              qk.field_a.b(var6_ref, var8, var1 + fh.field_a, var5, -1);
              var1 = var1 + (hi.field_ab + dc.field_b - -lm.field_d);
              var3++;
              continue L2;
            }
          }
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
