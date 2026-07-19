/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bf extends bh {
    static w field_v;
    byte[] field_n;
    static c field_x;
    static Random field_y;
    int field_s;
    long field_p;
    static int field_r;
    static String field_q;
    static ud field_w;
    static int field_o;
    static w field_t;
    static ud field_u;

    final static void a(int param0, boolean param1, int param2, String param3, java.awt.Color param4) {
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = jh.field_b.getGraphics();
                  if (wf.field_s == null) {
                    wf.field_s = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, de.field_M, ob.field_g);
                    break L3;
                  }
                }
                L4: {
                  if (param4 != null) {
                    break L4;
                  } else {
                    param4 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == lj.field_a) {
                        lj.field_a = jh.field_b.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = lj.field_a.getGraphics();
                    var10.setColor(param4);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param0, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param0 * 3 + 2, 2, 300 + -(param0 * 3), 30);
                    var10.setFont(wf.field_s);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param3, (-(param2 * param3.length()) + 304) / 2, 22);
                    discarded$1 = var9.drawImage(lj.field_a, de.field_M / 2 - 152, ob.field_g / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + de.field_M / 2;
                    var8 = ob.field_g / 2 - 18;
                    var9.setColor(param4);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, param0 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 + 1, 301, 31);
                    var9.fillRect(2 + (var7 - -(3 * param0)), 2 + var8, 300 + -(param0 * 3), 30);
                    var9.setFont(wf.field_s);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param3, var7 - -((304 - 6 * param3.length()) / 2), 22 + var8);
                    break L7;
                  }
                }
                if (null == te.field_t) {
                  break L1;
                } else {
                  var9.setFont(wf.field_s);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(te.field_t, de.field_M / 2 - 6 * te.field_t.length() / 2, ob.field_g / 2 - 26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              jh.field_b.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5_ref);
            stackOut_18_1 = new StringBuilder().append("bf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          L9: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    final static int a(byte param0, kn param1, int param2, kc param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_27_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (null == param3.field_u) {
                  break L1;
                } else {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (param1.field_x == param3.field_n) {
                      var4_int = param1.field_s.length;
                      if (param0 == 107) {
                        var5 = param3.field_u[param2].length / var4_int;
                        var6 = 0;
                        L2: while (true) {
                          L3: {
                            if (var5 <= var6) {
                              stackOut_27_0 = -1;
                              stackIn_28_0 = stackOut_27_0;
                              break L3;
                            } else {
                              stackOut_13_0 = (param3.field_t[param2][var6] < param1.field_o ? -1 : (param3.field_t[param2][var6] == param1.field_o ? 0 : 1));
                              stackIn_28_0 = stackOut_13_0;
                              stackIn_14_0 = stackOut_13_0;
                              if (var8 != 0) {
                                break L3;
                              } else {
                                L4: {
                                  if (stackIn_14_0 != 0) {
                                    break L4;
                                  } else {
                                    if (!k.a(param3.field_r[param2][var6], true)) {
                                      break L4;
                                    } else {
                                      var7 = 0;
                                      L5: while (true) {
                                        L6: {
                                          if (var7 >= var4_int) {
                                            stackOut_24_0 = var6;
                                            stackIn_25_0 = stackOut_24_0;
                                            break L6;
                                          } else {
                                            stackOut_18_0 = param3.field_u[param2][var4_int * var6 + var7];
                                            stackIn_25_0 = stackOut_18_0;
                                            stackIn_19_0 = stackOut_18_0;
                                            if (var8 != 0) {
                                              break L6;
                                            } else {
                                              L7: {
                                                if (stackIn_19_0 == param1.field_s[var7]) {
                                                  break L7;
                                                } else {
                                                  if (var8 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L7;
                                                  }
                                                }
                                              }
                                              var7++;
                                              continue L5;
                                            }
                                          }
                                        }
                                        decompiledRegionSelector0 = 3;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                continue L2;
                              }
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        stackOut_9_0 = -88;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_6_0 = -1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var4);
            stackOut_29_1 = new StringBuilder().append("bf.D(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          L9: {
            stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_28_0;
            } else {
              return stackIn_25_0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_u = null;
        field_q = null;
        field_t = null;
        field_y = null;
        field_v = null;
        if (param0 >= -38) {
          return;
        } else {
          field_x = null;
          field_w = null;
          return;
        }
    }

    final static void c(byte param0) {
        gh.field_b.a(gg.field_y.field_mb - (!pd.field_a ? 0 : 44 + vh.field_e), 0, 0, 18, 0);
        int var1 = 44 / ((-28 - param0) / 43);
        kn.field_r.a(vh.field_e + 42, 0, 0, 18, -2 + gg.field_y.field_mb + -vh.field_e - 40);
        ec.field_k.a(6, 20, vh.field_e, 0, -20 + gg.field_y.field_N, gg.field_y.field_mb, 2);
    }

    final static void b(int param0, int param1) {
        uf var2 = null;
        if (param0 != -20861) {
          return;
        } else {
          var2 = we.field_b;
          var2.f(param1, -4);
          var2.a(true, 1);
          var2.a(true, 0);
          return;
        }
    }

    final static void a(boolean param0) {
        dh.field_b = null;
        fj.field_e = param0 ? true : false;
        vb.field_U = null;
        wb.field_Qb = null;
        tg.field_g = null;
    }

    bf(long param0, int param1, byte[] param2) {
        try {
            this.field_n = param2;
            this.field_s = param1;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_y = new Random();
        field_q = "Invalid date";
    }
}
