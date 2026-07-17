/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ng extends rq {
    private ef[] field_i;
    static hr[] field_f;
    private boolean field_h;
    private boolean field_g;
    static String field_e;

    final void a(boolean param0, byte param1) {
        ((ng) this).field_b.a((byte) -83, lf.field_e, vi.field_v);
        if (param1 > -71) {
            ((ng) this).field_i = null;
        }
    }

    public static void d() {
        field_f = null;
        field_e = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            return true;
        }
        return true;
    }

    final static void e() {
        jp.b((byte) 126);
    }

    final void c(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((ng) this).a(114, 98, -46);
            break L0;
          }
        }
        L1: {
          if (!((ng) this).field_h) {
            ((ng) this).field_b.a(jq.field_a, 0, true);
            break L1;
          } else {
            ((ng) this).field_b.g(1, -109);
            ((ng) this).field_b.a((ed) null, 102);
            ((ng) this).field_b.a(13754, lf.field_c);
            ((ng) this).field_b.l(0);
            if (!((ng) this).field_g) {
              ((ng) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
              ((ng) this).field_b.a(jq.field_a, 0, 0);
              ((ng) this).field_b.g(2, -117);
              ((ng) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
              ((ng) this).field_b.a(jq.field_a, 0, 0);
              ((ng) this).field_b.a(ta.field_a, 1, 0);
              ((ng) this).field_b.a(jq.field_a, 0, true);
              ((ng) this).field_b.a((ed) null, 110);
              ((ng) this).field_b.g(0, -126);
              ((ng) this).field_h = false;
              break L1;
            } else {
              ((ng) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
              ((ng) this).field_b.a(jq.field_a, 0, 0);
              ((ng) this).field_b.a(jq.field_a, 0, true);
              ((ng) this).field_b.g(0, -126);
              ((ng) this).field_h = false;
              break L1;
            }
          }
        }
        ((ng) this).field_b.a((byte) -83, vi.field_v, vi.field_v);
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != 34023) {
            return;
        }
        if (((ng) this).field_h) {
            ((ng) this).field_b.g(1, -122);
            ((ng) this).field_b.a((ed) (Object) ((ng) this).field_i[-1 + param2], 93);
            ((ng) this).field_b.g(0, -119);
        }
    }

    final static ki a(int param0, int param1, boolean param2, int param3, boolean param4, boolean param5) {
        try {
            int var6_int = 0;
            IOException var6 = null;
            Object var7 = null;
            Object var8 = null;
            am var9 = null;
            ki stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_8_0 = null;
            try {
              L0: {
                L1: {
                  var6_int = 100 % ((param1 - -29) / 42);
                  var7 = null;
                  if (gk.field_u.field_l == null) {
                    break L1;
                  } else {
                    bc.field_a = new gj(gk.field_u.field_l, 5200, 0);
                    gk.field_u.field_l = null;
                    var7 = (Object) (Object) new wl(255, bc.field_a, new gj(gk.field_u.field_d, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  var8 = null;
                  if (null == bc.field_a) {
                    break L2;
                  } else {
                    L3: {
                      if (null != m.field_O) {
                        break L3;
                      } else {
                        m.field_O = new gj[gk.field_u.field_i.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (m.field_O[param3] != null) {
                        break L4;
                      } else {
                        m.field_O[param3] = new gj(gk.field_u.field_i[param3], 12000, 0);
                        gk.field_u.field_i[param3] = null;
                        break L4;
                      }
                    }
                    var8 = (Object) (Object) new wl(param3, bc.field_a, m.field_O[param3], 2097152);
                    break L2;
                  }
                }
                var9 = wt.field_i.a(false, param3, (wl) var7, param5, (wl) var8);
                stackOut_8_0 = new ki((rb) (Object) var9, true, param0);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var6.toString());
            }
            return stackIn_9_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
            return;
        }
        try {
            ((ng) this).field_b.a(param2, 125);
            ((ng) this).field_b.h(84, param0);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ng.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    ng(aw param0) {
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
        ((ng) this).field_h = false;
        try {
          L0: {
            L1: {
              if (!param0.field_W) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (param0.field_cc >= 3) {
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
                  ((ng) this).field_g = stackIn_5_1 != 0;
                  if (!((ng) this).field_g) {
                    stackOut_7_0 = 127;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 48;
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
                    ((ng) this).field_i = new ef[3];
                    ((ng) this).field_i[0] = ((ng) this).field_b.a(64, (byte) -105, var27, false);
                    ((ng) this).field_i[1] = ((ng) this).field_b.a(64, (byte) -84, var28, false);
                    ((ng) this).field_i[2] = ((ng) this).field_b.a(64, (byte) 122, var29, false);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (var15 >= 64) {
                        var14++;
                        continue L4;
                      } else {
                        var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                        var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                        var11 = var11 * var13;
                        var12 = var12 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= 6) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (var16 != 0) {
                                if (1 != var16) {
                                  if (var16 == 2) {
                                    var10 = var12;
                                    break L7;
                                  } else {
                                    if (var16 == 3) {
                                      var10 = -var12;
                                      break L7;
                                    } else {
                                      if (var16 != 4) {
                                        var10 = -var13;
                                        break L7;
                                      } else {
                                        var10 = var13;
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
                              if (var10 > 0.0f) {
                                var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2_int);
                                var7 = (int)((double)var2_int * Math.pow((double)var10, 36.0));
                                var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2_int);
                                break L8;
                              } else {
                                var8 = 0;
                                var7 = 0;
                                var6 = 0;
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
            stackOut_33_1 = new StringBuilder().append("ng.<init>(");
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
          throw qo.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 41);
        }
    }

    final void a(boolean param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        ut var6 = null;
        L0: {
          var4 = Sumoblitz.field_L ? 1 : 0;
          if (((ng) this).field_i == null) {
            ((ng) this).field_b.a(fv.field_y, 0, true);
            break L0;
          } else {
            if (!param0) {
              ((ng) this).field_b.a(fv.field_y, 0, true);
              break L0;
            } else {
              ((ng) this).field_b.g(1, -118);
              ((ng) this).field_b.a(param1 ^ 31584, nl.field_n);
              var6 = ((ng) this).field_b.B(0);
              var6.a((byte) 79, 1024);
              ((ng) this).field_b.a(ip.field_y, 28880);
              if (!((ng) this).field_g) {
                ((ng) this).field_b.a((byte) -83, vi.field_v, lf.field_e);
                ((ng) this).field_b.a(ta.field_a, 0, param1 ^ 20186);
                ((ng) this).field_b.g(2, param1 + -20295);
                ((ng) this).field_b.a((byte) -83, lf.field_e, cv.field_F);
                ((ng) this).field_b.a(ta.field_a, 0, 0);
                ((ng) this).field_b.a((byte) 102, 1, true, false, ta.field_a);
                ((ng) this).field_b.a(fv.field_y, 0, true);
                ((ng) this).field_b.a(((ng) this).field_b.field_D, param1 + -20079);
                ((ng) this).field_b.g(0, -113);
                ((ng) this).field_h = true;
                break L0;
              } else {
                ((ng) this).field_b.a((byte) -83, lf.field_e, cv.field_F);
                ((ng) this).field_b.a((byte) -66, 0, true, false, jq.field_a);
                ((ng) this).field_b.a(fv.field_y, 0, true);
                ((ng) this).field_b.g(0, -113);
                ((ng) this).field_h = true;
                break L0;
              }
            }
          }
        }
        L1: {
          if (param1 == 20186) {
            break L1;
          } else {
            var5 = null;
            ((ng) this).a(105, 46, (ed) null);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "No highscores";
    }
}
