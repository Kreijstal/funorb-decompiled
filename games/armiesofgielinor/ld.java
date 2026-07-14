/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends bd {
    private int field_v;
    static int field_s;
    private int field_F;
    static String field_G;
    static int[] field_x;
    private int field_D;
    private int field_u;
    private int field_E;
    private int field_A;
    private jd field_z;
    private int field_t;
    private jd field_y;
    private int field_w;
    private int field_B;
    private int[] field_C;

    final static void a(int param0, String param1, boolean param2, byte param3, boolean param4) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_3_0 = null;
        String stackIn_23_0 = null;
        String stackIn_24_0 = null;
        String stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        String stackOut_2_0 = null;
        String stackOut_1_0 = null;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        String stackOut_22_0 = null;
        String stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        String stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          var10 = ArmiesOfGielinor.field_M ? 1 : 0;
          jm.field_g = true;
          ui.field_f = param0;
          var11 = param1;
          if (!param4) {
            stackOut_2_0 = tg.field_j;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = tl.field_h;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var6 = (String) (Object) stackIn_3_0;
          if (ui.field_f == 0) {
            var7 = iu.a(480, var11, param3 ^ 7444, ej.field_G, fs.field_c);
            var8 = 3 + var7;
            cj.field_k = new int[var8];
            nb.field_h = new String[var8];
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                rg.field_m = new int[2];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var7) {
                    nb.field_h[var8 - 3] = "";
                    nb.field_h[-2 + var8] = var6;
                    cj.field_k[-2 + var8] = 0;
                    rg.field_m[0] = 1;
                    nb.field_h[var8 + -1] = pd.field_f;
                    cj.field_k[var8 + -1] = 1;
                    rg.field_m[1] = 2;
                    break L1;
                  } else {
                    nb.field_h[var9] = fs.field_c[var9];
                    var9++;
                    continue L3;
                  }
                }
              } else {
                cj.field_k[var9] = -1;
                var9++;
                continue L2;
              }
            }
          } else {
            if (ui.field_f == 1) {
              var7 = iu.a(480, var11, param3 + 7412, ej.field_G, fs.field_c);
              var8 = 2 + var7;
              cj.field_k = new int[var8];
              nb.field_h = new String[var8];
              var9 = 0;
              L4: while (true) {
                if (var9 >= var8) {
                  rg.field_m = new int[1];
                  var9 = 0;
                  L5: while (true) {
                    if (var7 <= var9) {
                      nb.field_h[var8 - 2] = "";
                      nb.field_h[var8 - 1] = pd.field_f;
                      cj.field_k[var8 - 1] = 0;
                      rg.field_m[0] = 2;
                      break L1;
                    } else {
                      nb.field_h[var9] = fs.field_c[var9];
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  cj.field_k[var9] = -1;
                  var9++;
                  continue L4;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        }
        nn.field_z.field_k = rg.field_m.length;
        var7 = 0;
        var8 = 0;
        L6: while (true) {
          if (var8 >= nb.field_h.length) {
            bm.field_h = var7 + bt.field_g + -(var7 >> -1245385087);
            co.field_f = bt.field_g - (var7 >> 1437814529);
            ms.field_r = (ar.field_w + rd.field_b << 33785409) * nn.field_z.field_k;
            var8 = 0;
            L7: while (true) {
              if (nb.field_h.length <= var8) {
                L8: {
                  if (param3 == 90) {
                    break L8;
                  } else {
                    field_x = null;
                    break L8;
                  }
                }
                rk.field_r = -(ms.field_r >> -533383551) + lm.field_g;
                nn.field_z.a(0, param2, vo.a((byte) -73, ko.field_b, sm.field_d), 0);
                return;
              } else {
                L9: {
                  stackOut_32_0 = ms.field_r;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if ((cj.field_k[var8] ^ -1) <= -1) {
                    stackOut_34_0 = stackIn_34_0;
                    stackOut_34_1 = jg.field_k;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L9;
                  } else {
                    stackOut_33_0 = stackIn_33_0;
                    stackOut_33_1 = cn.field_o;
                    stackIn_35_0 = stackOut_33_0;
                    stackIn_35_1 = stackOut_33_1;
                    break L9;
                  }
                }
                ms.field_r = stackIn_35_0 + stackIn_35_1;
                var8++;
                continue L7;
              }
            }
          } else {
            L10: {
              stackOut_22_0 = nb.field_h[var8];
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if ((cj.field_k[var8] ^ -1) > -1) {
                stackOut_24_0 = (String) (Object) stackIn_24_0;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L10;
              } else {
                stackOut_23_0 = (String) (Object) stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L10;
              }
            }
            L11: {
              var9 = lp.a((String) (Object) stackIn_25_0, stackIn_25_1 != 0, false);
              if (cj.field_k[var8] == -1) {
                break L11;
              } else {
                var9 = var9 + df.field_E * 2;
                break L11;
              }
            }
            if (var9 > var7) {
              var7 = var9;
              var8++;
              continue L6;
            } else {
              var8++;
              continue L6;
            }
          }
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 62) {
            Object var3 = null;
            ld.a(-105, (java.applet.Applet) null);
        }
        return tm.field_e[param1 & 2047];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param0 == 16058) {
                var4 = param1.getCodeBase();
                var3 = ck.a(-3780, var4, param1).getFile();
                Object discarded$6 = lj.a(param1, "updatelinks", new Object[2], 116);
                Object discarded$7 = lj.a(param1, "updatelinks", new Object[2], 74);
                Object discarded$8 = lj.a(param1, "updatelinks", new Object[2], 98);
                Object discarded$9 = lj.a(param1, "updatelinks", new Object[2], 75);
                Object discarded$10 = lj.a(param1, "updatelinks", new Object[2], 122);
                Object discarded$11 = lj.a(param1, "updatelinks", new Object[2], param0 + -15938);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ha param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((ld) this).field_E = ((ld) this).field_u;
        var10 = new int[((ld) this).field_D];
        var9 = var10;
        var8 = var9;
        var7 = var8;
        var3 = var7;
        ((ld) this).field_F = ((ld) this).field_v;
        var4 = 0;
        L0: while (true) {
          if (var4 >= ((ld) this).field_D) {
            L1: {
              L2: {
                if (!((ld) this).field_y.field_W) {
                  break L2;
                } else {
                  if (((ld) this).field_y.field_N != 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param1.field_l.a((byte) -119, (tc) (Object) new kr(((ld) this).field_u, ((ld) this).field_v, var10));
              break L1;
            }
            L3: {
              if (param0 == 64) {
                break L3;
              } else {
                int discarded$1 = ld.a((byte) -102, 105);
                break L3;
              }
            }
            L4: {
              L5: {
                if (-1 != (((ld) this).field_w ^ -1)) {
                  break L5;
                } else {
                  if (0 == ((ld) this).field_t) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (!((ld) this).field_y.field_W) {
                  break L6;
                } else {
                  if (7 != ((ld) this).field_y.field_N) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              param1.field_l.a((byte) -119, (tc) (Object) new ns(((ld) this).field_E, ((ld) this).field_F, ((ld) this).field_w, ((ld) this).field_t, ((ld) this).field_z, ((ld) this).field_A, ((ld) this).field_B));
              break L4;
            }
            return;
          } else {
            L7: {
              var5 = ((ld) this).field_C[var4];
              if ((var5 ^ -1) == -2) {
                ((ld) this).field_F = ((ld) this).field_F - 1;
                break L7;
              } else {
                if (var5 == 2) {
                  ((ld) this).field_F = ((ld) this).field_F + 1;
                  break L7;
                } else {
                  if (var5 != 0) {
                    if ((var5 ^ -1) == -4) {
                      ((ld) this).field_E = ((ld) this).field_E - 1;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    ((ld) this).field_E = ((ld) this).field_E + 1;
                    break L7;
                  }
                }
              }
            }
            var3[var4] = ((ld) this).field_C[var4];
            var4++;
            continue L0;
          }
        }
    }

    final static void a(int param0, wk[] param1, tu param2, String param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (param6 < -33) {
            break L0;
          } else {
            field_x = null;
            break L0;
          }
        }
        L1: {
          var7 = param2.a(param3) - -(param1[0].field_y << -1192671775);
          var8 = -(var7 >> 1652655617) + param5;
          var9 = (var7 >> 1427571553) + param5;
          if (0 > var8) {
            param5 = param5 - var8;
            break L1;
          } else {
            if (var9 > 640) {
              param5 = param5 - (var9 + -640);
              break L1;
            } else {
              break L1;
            }
          }
        }
        jp.a(-(var7 >> -820423231) + param5, param0, var7, param1, param4, -8991);
    }

    public static void e(int param0) {
        if (param0 >= -40) {
            return;
        }
        field_G = null;
        field_x = null;
    }

    ld(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, jd param7, jd param8) {
        int var10 = 0;
        int var11 = 0;
        ((ld) this).field_v = param1;
        ((ld) this).field_w = param4;
        ((ld) this).field_y = param7;
        ((ld) this).field_D = param3;
        ((ld) this).field_u = param0;
        ((ld) this).field_t = param5;
        ((ld) this).field_m = param6;
        ((ld) this).field_C = param2;
        if (param8 != null) {
            ((ld) this).field_z = param8.b(false);
            var10 = bw.field_m[((ld) this).field_y.field_N][9];
            ((ld) this).field_A = ((ld) this).field_y.field_Y * vu.field_N[var10] / ((ld) this).field_y.field_t - -(((ld) this).field_y.field_Y * vu.field_N[var10] % ((ld) this).field_y.field_t == 0 ? 0 : 1);
            var11 = bw.field_m[((ld) this).field_z.field_N][9];
            ((ld) this).field_B = (0 == ((ld) this).field_z.field_Y * vu.field_N[var11] % ((ld) this).field_z.field_t ? 0 : 1) + ((ld) this).field_z.field_Y * vu.field_N[var11] / ((ld) this).field_z.field_t;
        } else {
            ((ld) this).field_w = 0;
            ((ld) this).field_z = null;
            ((ld) this).field_t = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "No target selected.";
        field_s = -1;
    }
}
