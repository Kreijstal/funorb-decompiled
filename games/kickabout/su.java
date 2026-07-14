/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static jb field_c;
    static ut field_a;
    static gu field_b;

    final static kw a(int param0, String param1) {
        if (param0 != -3505) {
            field_c = null;
            return new kw(param1);
        }
        return new kw(param1);
    }

    final static void a(int param0, int param1, int param2, java.awt.Canvas param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param3.getGraphics();
            if (param0 != 27744) {
                field_a = null;
            }
            ea.field_f.a(param1, 10, param2, var4);
            var4.dispose();
        } catch (Exception exception) {
            param3.repaint();
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        var9 = Kickabout.field_G;
        if (-1L > (param1 ^ -1L)) {
          if (-6582952005840035282L < (param1 ^ -1L)) {
            if (0L == param1 % 37L) {
              return null;
            } else {
              var3 = param0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (-1L == (param1 ^ -1L)) {
                      return var6.reverse().toString();
                    } else {
                      var7 = param1;
                      param1 = param1 / 37L;
                      StringBuilder discarded$1 = var6.append(gu.field_yb[(int)(var7 - param1 * 37L)]);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        oo.field_e[wf.field_O] = param3;
        pf.field_d[wf.field_O] = wf.field_O;
        bl.field_m[wf.field_O] = param4;
        if (kt.field_g >= param4) {
          if (er.field_k <= param4) {
            L0: {
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              } else {
                stackOut_43_0 = param5 * 1000 / var6;
                stackIn_45_0 = stackOut_43_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_45_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            L3: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L3;
              } else {
                stackOut_30_0 = param5 * 1000 / var6;
                stackIn_32_0 = stackOut_30_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_32_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        } else {
          lm.field_V = param4;
          if (er.field_k > param4) {
            L6: {
              vi.field_s = param4;
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L6;
              } else {
                stackOut_16_0 = param5 * 1000 / var6;
                stackIn_18_0 = stackOut_16_0;
                break L6;
              }
            }
            L7: {
              var7 = stackIn_18_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L8;
              } else {
                break L8;
              }
            }
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          } else {
            L9: {
              qp.field_G[wf.field_O] = param5;
              fo.field_j[wf.field_O] = param0;
              ln.field_B[wf.field_O] = param2;
              var6 = param5 - (-param0 - param2);
              if (var6 == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L9;
              } else {
                stackOut_3_0 = param5 * 1000 / var6;
                stackIn_5_0 = stackOut_3_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_5_0;
              w.field_a[wf.field_O] = var7;
              wf.field_O = wf.field_O + 1;
              if (vi.field_s > var7) {
                vi.field_s = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (var7 > lm.field_V) {
                lm.field_V = var7;
                break L11;
              } else {
                break L11;
              }
            }
            if (param1 != -106) {
              field_b = null;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        int var1 = -21 % ((param0 - -46) / 55);
    }

    final static int a(byte param0, up param1) {
        int var2 = 79 % ((-40 - param0) / 58);
        int var3 = (gp.a(param1, -576054046) << 1406248801) / 3;
        if (!(var3 >= 10)) {
            var3 = 10;
        }
        return var3;
    }

    final static hd a(int param0, int param1, int param2, boolean param3, int param4, hu param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
        hd var13 = null;
        if (!param3) {
          field_c = null;
          var13 = new hd(0L, (hd) null);
          var13.field_R = ih.a(param4, 0, param11);
          var13.field_S = ih.a(param2, 0, param9);
          var13.field_rb = ih.a(param12, 0, param1);
          var13.field_u = ih.a(param8, 0, param0);
          var13.field_tb = ih.a(param7, 0, param6);
          var13.field_X = param5;
          var13.field_y = param10;
          return var13;
        } else {
          var13 = new hd(0L, (hd) null);
          var13.field_R = ih.a(param4, 0, param11);
          var13.field_S = ih.a(param2, 0, param9);
          var13.field_rb = ih.a(param12, 0, param1);
          var13.field_u = ih.a(param8, 0, param0);
          var13.field_tb = ih.a(param7, 0, param6);
          var13.field_X = param5;
          var13.field_y = param10;
          return var13;
        }
    }

    static {
    }
}
