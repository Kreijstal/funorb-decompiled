/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vw {
    static nh[] field_h;
    private boolean field_g;
    private na[] field_e;
    static String field_f;
    private boolean field_d;

    final void a(int param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!((em) this).field_g) {
            ((em) this).field_c.a(0, false, ej.field_c);
        } else {
            ((em) this).field_c.e(1, false);
            ((em) this).field_c.a(true, (iva) null);
            ((em) this).field_c.a(kga.field_o, (byte) 0);
            ((em) this).field_c.p((byte) 127);
            if (!((em) this).field_d) {
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -90);
                ((em) this).field_c.e(2, false);
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -108);
                ((em) this).field_c.a(lja.field_j, 1, -15);
                ((em) this).field_c.a(0, false, ej.field_c);
                ((em) this).field_c.a(true, (iva) null);
            } else {
                ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
                ((em) this).field_c.a(ej.field_c, 0, -94);
                ((em) this).field_c.a(0, false, ej.field_c);
            }
            ((em) this).field_c.e(0, false);
            ((em) this).field_g = false;
        }
        ((em) this).field_c.a(iw.field_c, (byte) -110, iw.field_c);
        if (param0 > -4) {
            ((em) this).a((byte) 55, -114, 112);
        }
    }

    public static void d(int param0) {
        if (param0 != 0) {
            em.d(-65);
        }
        field_h = null;
        field_f = null;
    }

    em(eo param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        ((em) this).field_g = false;
        try {
          L0: {
            L1: {
              if (!param0.field_Ob) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (3 <= param0.field_Vb) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                L3: {
                  ((em) this).field_d = stackIn_5_1 != 0;
                  if (((em) this).field_d) {
                    stackOut_7_0 = 48;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 127;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var2_int = stackIn_8_0;
                var29 = new int[6][4096];
                var27 = new int[6][4096];
                var28 = new int[6][4096];
                var9 = 0;
                var14 = 0;
                L4: while (true) {
                  if (var14 >= 64) {
                    ((em) this).field_e = new na[3];
                    ((em) this).field_e[0] = ((em) this).field_c.a((byte) 37, var27, false, 64);
                    ((em) this).field_e[1] = ((em) this).field_c.a((byte) 112, var28, false, 64);
                    ((em) this).field_e[2] = ((em) this).field_c.a((byte) 64, var29, false, 64);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (var15 >= 64) {
                        var14++;
                        continue L4;
                      } else {
                        var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                        var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(1.0f + var11 * var11 + var12 * var12)));
                        var12 = var12 * var13;
                        var11 = var11 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= 6) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (var16 != 0) {
                                if (var16 != 1) {
                                  if (var16 == 2) {
                                    var10 = var12;
                                    break L7;
                                  } else {
                                    if (var16 == 3) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if (var16 == 4) {
                                        var10 = var13;
                                        break L7;
                                      } else {
                                        var10 = -var13;
                                        break L7;
                                      }
                                    }
                                  }
                                } else {
                                  var10 = var11;
                                  break L7;
                                }
                              } else {
                                var10 = -var11;
                                break L7;
                              }
                            }
                            L8: {
                              if (0.0f >= var10) {
                                var8 = 0;
                                var7 = 0;
                                var6 = 0;
                                break L8;
                              } else {
                                var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                                break L8;
                              }
                            }
                            var27[var16][var9] = var6 << 24;
                            var28[var16][var9] = var7 << 24;
                            var29[var16][var9] = var8 << 24;
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2;
            stackOut_33_1 = new StringBuilder().append("em.<init>(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (!(!((em) this).field_g)) {
            ((em) this).field_c.e(1, false);
            ((em) this).field_c.a(true, (iva) (Object) ((em) this).field_e[-1 + param1]);
            ((em) this).field_c.e(0, false);
        }
        if (param0 != 55) {
            ((em) this).a(-91);
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        asa var4 = null;
        int var5 = 0;
        L0: {
          L1: {
            var5 = TombRacer.field_G ? 1 : 0;
            var3 = -121 / ((param0 - 41) / 62);
            if (null == ((em) this).field_e) {
              break L1;
            } else {
              if (param1) {
                L2: {
                  ((em) this).field_c.e(1, false);
                  ((em) this).field_c.a(gd.field_H, (byte) 0);
                  var4 = ((em) this).field_c.C(0);
                  var4.b(-94, 1024);
                  ((em) this).field_c.a(cva.field_b, false);
                  if (!((em) this).field_d) {
                    ((em) this).field_c.a(iw.field_c, (byte) -110, ln.field_F);
                    ((em) this).field_c.a(lja.field_j, 0, -34);
                    ((em) this).field_c.e(2, false);
                    ((em) this).field_c.a(ln.field_F, (byte) -110, jv.field_m);
                    ((em) this).field_c.a(lja.field_j, 0, -47);
                    ((em) this).field_c.a(lja.field_j, 1, -6219, true, false);
                    ((em) this).field_c.a(0, false, tla.field_c);
                    ((em) this).field_c.a(true, ((em) this).field_c.field_Jb);
                    break L2;
                  } else {
                    ((em) this).field_c.a(ln.field_F, (byte) -110, jv.field_m);
                    ((em) this).field_c.a(ej.field_c, 0, -6219, true, false);
                    ((em) this).field_c.a(0, false, tla.field_c);
                    break L2;
                  }
                }
                ((em) this).field_c.e(0, false);
                ((em) this).field_g = true;
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((em) this).field_c.a(0, false, tla.field_c);
          break L0;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 5744) {
            return;
        }
        ((em) this).field_c.a(ln.field_F, (byte) -110, iw.field_c);
    }

    final boolean c(int param0) {
        if (param0 != 1185) {
            ((em) this).field_e = null;
            return true;
        }
        return true;
    }

    final void a(int param0, iva param1, int param2) {
        ((em) this).field_c.a(true, param1);
        if (param2 != 24595) {
            return;
        }
        try {
            ((em) this).field_c.a((byte) 108, param0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "em.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Email (Login):";
    }
}
