/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qb extends k {
    static int[] field_m;
    static vr field_l;
    int field_o;
    int[] field_n;
    int field_p;
    private int field_k;

    public qb() {
        super(0, false);
        ((qb) this).field_k = -1;
    }

    public static void d() {
        field_l = null;
        int var1 = 0;
        field_m = null;
    }

    final boolean e(byte param0) {
        uh var2 = null;
        if (!(null == ((qb) this).field_n)) {
            return true;
        }
        if (((qb) this).field_k >= 0) {
            var2 = sp.field_l >= 0 ? uh.a(l.field_r, sp.field_l, ((qb) this).field_k) : uh.a(l.field_r, ((qb) this).field_k);
            var2.c();
            ((qb) this).field_n = var2.a();
            ((qb) this).field_o = var2.field_i;
            ((qb) this).field_p = var2.field_a;
            return true;
        }
        if (param0 >= -63) {
            return false;
        }
        return false;
    }

    int[][] a(boolean param0, int param1) {
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int[][] var15 = null;
        int[][] var16 = null;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var11 = BachelorFridge.field_y;
        var16 = ((qb) this).field_h.a(param1, -858);
        var15 = var16;
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (!param0) {
          L0: {
            if (((qb) this).field_h.field_b) {
              if (((qb) this).e((byte) -70)) {
                L1: {
                  var16 = var15;
                  var4 = var16[0];
                  var5 = var16[1];
                  var6 = var16[2];
                  stackOut_6_0 = ((qb) this).field_o;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (bi.field_g == ((qb) this).field_p) {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = param1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_7_0 = stackIn_7_0;
                    stackOut_7_1 = param1 * ((qb) this).field_p / bi.field_g;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L1;
                  }
                }
                var7 = stackIn_9_0 * stackIn_9_1;
                if (hh.field_d == ((qb) this).field_o) {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= hh.field_d) {
                      break L0;
                    } else {
                      int incrementValue$1 = var7;
                      var7++;
                      var9 = ((qb) this).field_n[incrementValue$1];
                      var6[var8] = dda.a(255, var9) << 4;
                      var5[var8] = dda.a(var9 >> 4, 4080);
                      var4[var8] = dda.a(16711680, var9) >> 12;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  var8 = 0;
                  L3: while (true) {
                    if (hh.field_d <= var8) {
                      break L0;
                    } else {
                      var9 = var8 * ((qb) this).field_o / hh.field_d;
                      var10 = ((qb) this).field_n[var9 + var7];
                      var6[var8] = dda.a(255, var10) << 4;
                      var5[var8] = dda.a(var10, 65280) >> 4;
                      var4[var8] = dda.a(16711680, var10) >> 12;
                      var8++;
                      continue L3;
                    }
                  }
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return null;
        }
    }

    final int a(int param0) {
        if (param0 != -2359) {
            return -12;
        }
        return ((qb) this).field_k;
    }

    final void b(int param0) {
        super.b(param0);
        ((qb) this).field_n = null;
    }

    final static void a(int param0, boolean param1, String param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var10 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              fv.field_w = param0;
              nla.field_f = true;
              var11 = param2;
              var6 = maa.field_x;
              if (fv.field_w == 0) {
                var7 = ut.a(db.field_b, 480, var11, qm.field_a, 127);
                var8 = var7 + 3;
                gn.field_l = new int[var8];
                pt.field_a = new String[var8];
                var9 = 0;
                L2: while (true) {
                  if (var9 >= var8) {
                    st.field_a = new int[2];
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= var7) {
                        pt.field_a[-3 + var8] = "";
                        pt.field_a[var8 + -2] = var6;
                        gn.field_l[var8 + -2] = 0;
                        st.field_a[0] = 1;
                        pt.field_a[-1 + var8] = ala.field_d;
                        gn.field_l[-1 + var8] = 1;
                        st.field_a[1] = 2;
                        break L1;
                      } else {
                        pt.field_a[var9] = db.field_b[var9];
                        var9++;
                        continue L3;
                      }
                    }
                  } else {
                    gn.field_l[var9] = -1;
                    var9++;
                    continue L2;
                  }
                }
              } else {
                if (1 != fv.field_w) {
                  throw new IllegalArgumentException();
                } else {
                  var7 = ut.a(db.field_b, 480, var11, qm.field_a, -118);
                  var8 = var7 + 2;
                  gn.field_l = new int[var8];
                  pt.field_a = new String[var8];
                  var9 = 0;
                  L4: while (true) {
                    if (var8 <= var9) {
                      st.field_a = new int[1];
                      var9 = 0;
                      L5: while (true) {
                        if (var9 >= var7) {
                          pt.field_a[-2 + var8] = "";
                          pt.field_a[-1 + var8] = ala.field_d;
                          gn.field_l[-1 + var8] = 0;
                          st.field_a[0] = 2;
                          break L1;
                        } else {
                          pt.field_a[var9] = db.field_b[var9];
                          var9++;
                          continue L5;
                        }
                      }
                    } else {
                      gn.field_l[var9] = -1;
                      var9++;
                      continue L4;
                    }
                  }
                }
              }
            }
            fw.field_i.field_e = st.field_a.length;
            var7 = 0;
            var8 = 0;
            L6: while (true) {
              if (var8 >= pt.field_a.length) {
                dfa.field_b = -(var7 >> 1) + (var7 + sd.field_a);
                ula.field_f = (pba.field_r + raa.field_J << 1) * fw.field_i.field_e;
                rs.field_a = sd.field_a - (var7 >> 1);
                var8 = 0;
                L7: while (true) {
                  if (var8 >= pt.field_a.length) {
                    vka.field_q = jfa.field_w - (ula.field_f >> 1);
                    fw.field_i.a(param4, 85, rh.a(mk.field_p, (byte) -126, gd.field_m), 0);
                    break L0;
                  } else {
                    L8: {
                      stackOut_32_0 = ula.field_f;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (gn.field_l[var8] >= 0) {
                        stackOut_34_0 = stackIn_34_0;
                        stackOut_34_1 = jo.field_t;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L8;
                      } else {
                        stackOut_33_0 = stackIn_33_0;
                        stackOut_33_1 = un.field_i;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        break L8;
                      }
                    }
                    ula.field_f = stackIn_35_0 + stackIn_35_1;
                    var8++;
                    continue L7;
                  }
                }
              } else {
                L9: {
                  stackOut_20_0 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (gn.field_l[var8] < 0) {
                    stackOut_22_0 = stackIn_22_0;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L9;
                  } else {
                    stackOut_21_0 = stackIn_21_0;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L9;
                  }
                }
                L10: {
                  var9 = hka.a(stackIn_23_0 != 0, stackIn_23_1 != 0, pt.field_a[var8]);
                  if (gn.field_l[var8] != -1) {
                    var9 = var9 + 2 * hna.field_k;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var9 > var7) {
                    var7 = var9;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                var8++;
                continue L6;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var5;
            stackOut_38_1 = new StringBuilder().append("qb.P(").append(param0).append(44).append(1).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 44 + -1 + 44 + param4 + 41);
        }
    }

    final void a(byte param0, lu param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param2 != 0) {
                break L1;
              } else {
                ((qb) this).field_k = param1.e((byte) 108);
                break L1;
              }
            }
            L2: {
              if (param0 == -71) {
                break L2;
              } else {
                int discarded$2 = ((qb) this).a(66);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qb.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[4];
    }
}
