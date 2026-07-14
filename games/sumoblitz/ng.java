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

    public static void d(int param0) {
        field_f = null;
        if (param0 != 0) {
            return;
        }
        field_e = null;
    }

    final boolean b(byte param0) {
        if (param0 >= -8) {
            return true;
        }
        return true;
    }

    final static void e(int param0) {
        if (param0 > -9) {
            return;
        }
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
            wl var7 = null;
            wl var8 = null;
            am var9 = null;
            ki stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            ki stackOut_10_0 = null;
            try {
              L0: {
                var6_int = 100 % ((param1 - -29) / 42);
                var7 = null;
                if (gk.field_u.field_l == null) {
                  break L0;
                } else {
                  bc.field_a = new gj(gk.field_u.field_l, 5200, 0);
                  gk.field_u.field_l = null;
                  var7 = new wl(255, bc.field_a, new gj(gk.field_u.field_d, 12000, 0), 2097152);
                  break L0;
                }
              }
              L1: {
                var8 = null;
                if (null == bc.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (null != m.field_O) {
                      break L2;
                    } else {
                      m.field_O = new gj[gk.field_u.field_i.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (m.field_O[param3] != null) {
                      break L3;
                    } else {
                      m.field_O[param3] = new gj(gk.field_u.field_i[param3], 12000, 0);
                      gk.field_u.field_i[param3] = null;
                      break L3;
                    }
                  }
                  var8 = new wl(param3, bc.field_a, m.field_O[param3], 2097152);
                  break L1;
                }
              }
              L4: {
                var9 = wt.field_i.a(false, param3, var7, param5, var8);
                if (!param4) {
                  break L4;
                } else {
                  var9.c((byte) -81);
                  break L4;
                }
              }
              stackOut_10_0 = new ki((rb) (Object) var9, param2, param0);
              stackIn_11_0 = stackOut_10_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_11_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final void a(int param0, int param1, ed param2) {
        if (param1 != 18834) {
            return;
        }
        ((ng) this).field_b.a(param2, 125);
        ((ng) this).field_b.h(84, param0);
    }

    ng(aw param0) {
        super(param0);
        int var2 = 0;
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
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_7_0 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          ((ng) this).field_h = false;
          if (!param0.field_W) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if ((param0.field_cc ^ -1) <= -4) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ng) this).field_g = stackIn_4_1 != 0;
              if (!((ng) this).field_g) {
                stackOut_6_0 = 127;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 48;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var2 = stackIn_7_0;
            var29 = new int[6][4096];
            var27 = new int[6][4096];
            var28 = new int[6][4096];
            var9 = 0;
            var14 = 0;
            L3: while (true) {
              if ((var14 ^ -1) <= -65) {
                ((ng) this).field_i = new ef[3];
                ((ng) this).field_i[0] = ((ng) this).field_b.a(64, (byte) -105, var27, false);
                ((ng) this).field_i[1] = ((ng) this).field_b.a(64, (byte) -84, var28, false);
                ((ng) this).field_i[2] = ((ng) this).field_b.a(64, (byte) 122, var29, false);
                break L0;
              } else {
                var15 = 0;
                L4: while (true) {
                  if (var15 >= 64) {
                    var14++;
                    continue L3;
                  } else {
                    var12 = -1.0f + 2.0f * (float)var14 / 64.0f;
                    var11 = -1.0f + (float)var15 * 2.0f / 64.0f;
                    var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                    var11 = var11 * var13;
                    var12 = var12 * var13;
                    var16 = 0;
                    L5: while (true) {
                      if (var16 >= 6) {
                        var9++;
                        var15++;
                        continue L4;
                      } else {
                        L6: {
                          if (var16 != 0) {
                            if (1 != var16) {
                              if (-3 == (var16 ^ -1)) {
                                var10 = var12;
                                break L6;
                              } else {
                                if (var16 == 3) {
                                  var10 = -var12;
                                  break L6;
                                } else {
                                  if (var16 != 4) {
                                    var10 = -var13;
                                    break L6;
                                  } else {
                                    var10 = var13;
                                    break L6;
                                  }
                                }
                              }
                            } else {
                              var10 = var11;
                              break L6;
                            }
                          } else {
                            var10 = -var11;
                            break L6;
                          }
                        }
                        L7: {
                          if (var10 > 0.0f) {
                            var6 = (int)(Math.pow((double)var10, 96.0) * (double)var2);
                            var7 = (int)((double)var2 * Math.pow((double)var10, 36.0));
                            var8 = (int)(Math.pow((double)var10, 12.0) * (double)var2);
                            break L7;
                          } else {
                            var8 = 0;
                            var7 = 0;
                            var6 = 0;
                            break L7;
                          }
                        }
                        var27[var16][var9] = var6 << -36905544;
                        var28[var16][var9] = var7 << -1061053576;
                        var29[var16][var9] = var8 << -108557352;
                        var16++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
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
