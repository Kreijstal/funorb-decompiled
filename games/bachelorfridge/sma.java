/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;
import java.lang.String;

final class sma extends ana {
    private int field_A;
    private int field_F;
    private int[][] field_D;
    private int field_y;
    static Random field_I;
    private int field_x;
    private int field_G;
    private lp field_w;
    static String[] field_v;
    private int field_z;
    static int field_C;
    static String field_B;
    static kv[] field_H;

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ob var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_19_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_18_0 = 0;
        L0: {
          var7 = BachelorFridge.field_y;
          if (((sma) this).field_l != 100) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              stackOut_2_0 = ((sma) this).field_z;
              stackOut_2_1 = var2;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      stackOut_4_0 = 0;
                      stackIn_19_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7 != 0) {
                        break L3;
                      } else {
                        var3 = stackIn_5_0;
                        L5: while (true) {
                          L6: {
                            if (var3 >= ((sma) this).field_x) {
                              break L6;
                            } else {
                              stackOut_7_0 = ((sma) this).field_D[var2][var3];
                              stackOut_7_1 = 1;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_3_1 = stackOut_7_1;
                              stackIn_8_0 = stackOut_7_0;
                              stackIn_8_1 = stackOut_7_1;
                              if (var7 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 != stackIn_8_1) {
                                    break L7;
                                  } else {
                                    var4 = -((sma) this).field_A + (var2 + ((sma) this).field_F);
                                    var5 = ((sma) this).field_G - (((sma) this).field_y - var3);
                                    if (var4 < 0) {
                                      break L7;
                                    } else {
                                      if (((sma) this).field_q.field_h.field_z <= var4) {
                                        break L7;
                                      } else {
                                        if (var5 < 0) {
                                          break L7;
                                        } else {
                                          L8: {
                                            if (var5 < ((sma) this).field_q.field_h.field_B) {
                                              break L8;
                                            } else {
                                              if (var7 == 0) {
                                                break L7;
                                              } else {
                                                break L8;
                                              }
                                            }
                                          }
                                          var6 = new ob(((sma) this).field_q, var4, var5);
                                          ((kj) (Object) var6).a(0);
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                }
                                var3++;
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var2++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_18_0 = 256;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                jja.a(stackIn_19_0, -1, 23);
                break L0;
              }
            }
          }
        }
        int fieldTemp$1 = ((sma) this).field_l - 1;
        ((sma) this).field_l = ((sma) this).field_l - 1;
        if (0 <= fieldTemp$1) {
          return false;
        } else {
          var2 = -32 / ((param0 - 71) / 47);
          this.d(69);
          return true;
        }
    }

    public static void e(byte param0) {
        field_B = null;
        field_I = null;
        field_v = null;
        if (param0 != -40) {
            field_B = null;
        }
        field_H = null;
    }

    final static kv[] a(byte param0, int param1, int param2) {
        int var3 = -126 % ((param0 - 14) / 52);
        return jna.a(param2, 1, (byte) 106, param1);
    }

    final static String a(int param0, Throwable param1) throws IOException {
        String var2 = null;
        gi var3 = null;
        StringWriter var3_ref = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          L1: {
            var13 = BachelorFridge.field_y;
            if (!(param1 instanceof gi)) {
              break L1;
            } else {
              var3 = (gi) (Object) param1;
              var2 = var3.field_e + " | ";
              param1 = var3.field_d;
              if (var13 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = "";
          var11 = var2;
          var2 = var11;
          var11 = var2;
          break L0;
        }
        L2: {
          var3_ref = new StringWriter();
          var4 = new PrintWriter((Writer) (Object) var3_ref);
          param1.printStackTrace(var4);
          if (param0 > 92) {
            break L2;
          } else {
            sma.a(false, true, 92, -95, -6, -4, -5);
            break L2;
          }
        }
        var4.close();
        var5 = var3_ref.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L3: while (true) {
          L4: {
            var8 = var6.readLine();
            var11 = var8;
            var2 = var11;
            var11 = var8;
            if (var8 != null) {
              break L4;
            } else {
              if (var13 == 0) {
                var2 = var2 + "| " + var7;
                return var2;
              } else {
                break L4;
              }
            }
          }
          L5: {
            L6: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 + 1);
              if (var9 == -1) {
                break L6;
              } else {
                var11 = var8.substring(0, var9);
                if (var13 == 0) {
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            var11 = var8;
            break L5;
          }
          L7: {
            var11 = var11.trim();
            var11 = var11.substring(1 + var11.lastIndexOf(' '));
            var11 = var11.substring(var11.lastIndexOf('\t') - -1);
            var2 = var11;
            var2 = var11;
            var2 = var2 + var11;
            if (var9 == -1) {
              break L7;
            } else {
              if (var10 != -1) {
                var12 = var8.indexOf(".java:", var9);
                if (var12 < 0) {
                  break L7;
                } else {
                  var2 = var2 + var8.substring(var12 + 5, var10);
                  break L7;
                }
              } else {
                break L7;
              }
            }
          }
          var2 = var2 + 32;
          continue L3;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        eaa var9 = null;
        long var10 = 0L;
        Object var12 = null;
        uha var13 = null;
        int var14 = 0;
        int var15 = 0;
        sna var19 = null;
        int var19_int = 0;
        sna var20 = null;
        sna var21 = null;
        sna var22 = null;
        int var23_int = 0;
        sna var23 = null;
        sna var24 = null;
        sna var25 = null;
        sna var26 = null;
        sna var27 = null;
        sna var28 = null;
        sna var29 = null;
        sna var30 = null;
        sna var31 = null;
        int var32 = 0;
        String var33 = null;
        String var34 = null;
        int var34_int = 0;
        int var35_int = 0;
        String var35 = null;
        Object var36 = null;
        int var37 = 0;
        int var38_int = 0;
        StringBuilder var38 = null;
        int var39_int = 0;
        String var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        kv var43 = null;
        sna var44 = null;
        sna var45 = null;
        sna var46 = null;
        sna var47 = null;
        sna var48 = null;
        sna var49 = null;
        sna var50 = null;
        sga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        sga stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        uha stackIn_10_0 = null;
        sna stackIn_10_1 = null;
        sna stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        uha stackIn_11_0 = null;
        sna stackIn_11_1 = null;
        sna stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        uha stackIn_12_0 = null;
        sna stackIn_12_1 = null;
        sna stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        sna stackIn_12_4 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        uha stackIn_31_0 = null;
        sna stackIn_31_1 = null;
        sna stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        uha stackIn_32_0 = null;
        sna stackIn_32_1 = null;
        sna stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        uha stackIn_33_0 = null;
        sna stackIn_33_1 = null;
        sna stackIn_33_2 = null;
        long stackIn_33_3 = 0L;
        sna stackIn_33_4 = null;
        int stackIn_37_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_91_0 = 0;
        kv[] stackIn_92_0 = null;
        kv[] stackIn_93_0 = null;
        kv[] stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        kv[] stackIn_100_0 = null;
        kv[] stackIn_101_0 = null;
        kv[] stackIn_102_0 = null;
        kv[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        kv[] stackIn_108_0 = null;
        boolean stackIn_153_0 = false;
        boolean stackIn_166_0 = false;
        String stackIn_176_0 = null;
        String stackIn_185_0 = null;
        String stackIn_191_0 = null;
        Throwable caughtException = null;
        sga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        sga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        sga stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        uha stackOut_9_0 = null;
        sna stackOut_9_1 = null;
        sna stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        uha stackOut_10_0 = null;
        sna stackOut_10_1 = null;
        sna stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        sna stackOut_10_4 = null;
        uha stackOut_11_0 = null;
        sna stackOut_11_1 = null;
        sna stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        sna stackOut_11_4 = null;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        uha stackOut_30_0 = null;
        sna stackOut_30_1 = null;
        sna stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        uha stackOut_31_0 = null;
        sna stackOut_31_1 = null;
        sna stackOut_31_2 = null;
        long stackOut_31_3 = 0L;
        sna stackOut_31_4 = null;
        uha stackOut_32_0 = null;
        sna stackOut_32_1 = null;
        sna stackOut_32_2 = null;
        long stackOut_32_3 = 0L;
        sna stackOut_32_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_89_0 = 0;
        kv[] stackOut_91_0 = null;
        kv[] stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        kv[] stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        kv[] stackOut_99_0 = null;
        kv[] stackOut_100_0 = null;
        kv[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        kv[] stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        kv[] stackOut_107_0 = null;
        boolean stackOut_152_0 = false;
        boolean stackOut_165_0 = false;
        String stackOut_174_0 = null;
        String stackOut_175_0 = null;
        String stackOut_182_0 = null;
        String stackOut_183_0 = null;
        String stackOut_184_0 = null;
        String stackOut_189_0 = null;
        String stackOut_190_0 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var36 = null;
                    var42 = BachelorFridge.field_y;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    var8 = -121 % ((51 - param2) / 45);
                    stackOut_1_0 = p.field_n;
                    stackOut_1_1 = 2 * (rg.field_h + 2);
                    stackOut_1_2 = 2;
                    stackOut_1_3 = param3 * (rg.field_h * 4 - -8);
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    stackIn_3_2 = stackOut_1_2;
                    stackIn_3_3 = stackOut_1_3;
                    stackIn_2_0 = stackOut_1_0;
                    stackIn_2_1 = stackOut_1_1;
                    stackIn_2_2 = stackOut_1_2;
                    stackIn_2_3 = stackOut_1_3;
                    if (bga.field_m != p.field_n) {
                        statePc = 3;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = (sga) (Object) stackIn_2_0;
                    stackOut_2_1 = stackIn_2_1;
                    stackOut_2_2 = stackIn_2_2;
                    stackOut_2_3 = stackIn_2_3;
                    stackOut_2_4 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    stackIn_4_3 = stackOut_2_3;
                    stackIn_4_4 = stackOut_2_4;
                    statePc = 4;
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = (sga) (Object) stackIn_3_0;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = stackIn_3_2;
                    stackOut_3_3 = stackIn_3_3;
                    stackOut_3_4 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    stackIn_4_2 = stackOut_3_2;
                    stackIn_4_3 = stackOut_3_3;
                    stackIn_4_4 = stackOut_3_4;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    var7_int = ((sga) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param1, true) ? 1 : 0;
                    var9 = p.field_n.field_vb.field_z;
                    var10 = f.b((byte) 73);
                    var12 = null;
                    var13 = (uha) (Object) var9.b((byte) 90);
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    if (var13 == null) {
                        statePc = 208;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var14 = 0;
                    if (var42 != 0) {
                        statePc = 208;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    if (var13.field_z != null) {
                        statePc = 34;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = -5;
                    stackOut_8_1 = param4;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var15 = stackIn_9_0 | stackIn_9_1;
                    var13.field_hc = new sna(0L, wv.field_l);
                    var13.a(-1, var13.field_hc);
                    var13.field_hc.field_N = 1;
                    var13.field_Hb = new sna(0L, gi.field_c);
                    var13.a(-1, var13.field_Hb);
                    var13.field_yb = new sna(0L, wv.field_l);
                    var13.a(-1, var13.field_yb);
                    var13.field_yb.field_L = 0;
                    var13.field_Yb = new sna(0L, wv.field_l);
                    var13.a(-1, var13.field_Yb);
                    var13.field_Yb.field_L = 0;
                    var13.field_vb = new sna(0L, gi.field_c);
                    var13.a(-1, var13.field_vb);
                    var13.field_vb.field_N = 2;
                    stackOut_9_0 = (uha) var13;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = 0L;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    stackIn_11_2 = stackOut_9_2;
                    stackIn_11_3 = stackOut_9_3;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    if (eaa.field_c) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = (uha) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = gi.field_c;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = (uha) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = wv.field_l;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_12_0.field_Db = new sna(stackIn_12_3, stackIn_12_4);
                    var13.a(-1, var13.field_Db);
                    var13.field_Ab = new sna[ld.field_q];
                    var13.field_xb = new sna(0L, (sna) null);
                    if ((1 << wba.field_c & var15) != 0) {
                        statePc = 14;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var13.field_Db.a(-1, var13.field_xb);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    var13.field_wb = new sna(0L, (sna) null);
                    if ((var15 & 1 << kf.field_b) != 0) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    var13.field_Db.a(-1, var13.field_wb);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    var13.field_Qb = new sna(0L, (sna) null);
                    if ((var15 & 1 << gf.field_l) != 0) {
                        statePc = 20;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var13.field_Db.a(-1, var13.field_Qb);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var13.field_fc = new sna(0L, (sna) null);
                    if ((var15 & 1 << lga.field_r) != 0) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    var13.field_Db.a(-1, var13.field_fc);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var46 = var13.field_xb;
                    var45 = var13.field_fc;
                    var13.field_Qb.field_Y = 1;
                    var44 = var13.field_wb;
                    var44.field_Y = 1;
                    var45.field_Y = 1;
                    var46.field_Y = 1;
                    var19_int = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (var19_int >= ld.field_q) {
                        statePc = 30;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    var13.field_Ab[var19_int] = new sna(0L, (sna) null);
                    stackOut_26_0 = 0;
                    stackOut_26_1 = var15 & 1 << bea.field_v - -var19_int;
                    stackIn_9_0 = stackOut_26_0;
                    stackIn_9_1 = stackOut_26_1;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    if (var42 != 0) {
                        statePc = 9;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (stackIn_27_0 == stackIn_27_1) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    var13.field_Db.a(-1, var13.field_Ab[var19_int]);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    var13.field_Ab[var19_int].field_Y = 1;
                    var19_int++;
                    if (var42 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (uha) var13;
                    stackOut_30_1 = null;
                    stackOut_30_2 = null;
                    stackOut_30_3 = 0L;
                    stackIn_32_0 = stackOut_30_0;
                    stackIn_32_1 = stackOut_30_1;
                    stackIn_32_2 = stackOut_30_2;
                    stackIn_32_3 = stackOut_30_3;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    stackIn_31_2 = stackOut_30_2;
                    stackIn_31_3 = stackOut_30_3;
                    if (eaa.field_c) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = (uha) (Object) stackIn_31_0;
                    stackOut_31_1 = null;
                    stackOut_31_2 = null;
                    stackOut_31_3 = stackIn_31_3;
                    stackOut_31_4 = wv.field_l;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_33_4 = stackOut_31_4;
                    statePc = 33;
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = (uha) (Object) stackIn_32_0;
                    stackOut_32_1 = null;
                    stackOut_32_2 = null;
                    stackOut_32_3 = stackIn_32_3;
                    stackOut_32_4 = gi.field_c;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    stackIn_33_2 = stackOut_32_2;
                    stackIn_33_3 = stackOut_32_3;
                    stackIn_33_4 = stackOut_32_4;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_33_0.field_Gb = new sna(stackIn_33_3, stackIn_33_4);
                    var13.a(-1, var13.field_Gb);
                    var13.field_Gb.field_N = 2;
                    var13.field_cc = new sna(0L, gi.field_c);
                    var13.a(-1, var13.field_cc);
                    var13.field_Tb = new sna(0L, dla.field_k);
                    var13.a(-1, var13.field_Tb);
                    var13.field_Ib = new sna(0L, dla.field_k);
                    var13.a(-1, var13.field_Ib);
                    var13.field_ac = new sna(0L, qs.field_m);
                    var13.a(-1, var13.field_ac);
                    var13.d((byte) 119);
                    var13.field_Ub = new sna(0L, mh.field_k);
                    var14 = 1;
                    var13.a(-1, var13.field_Ub);
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    var13.field_hc.field_Z = null;
                    if (var13.field_Zb) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = param4;
                    stackIn_37_0 = stackOut_35_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackOut_36_0 = -5;
                    stackIn_37_0 = stackOut_36_0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    var15 = stackIn_37_0;
                    var47 = var13.field_hc;
                    var13.field_hc.field_p = 0;
                    var13.field_Ub.field_Z = null;
                    var47.field_sb = 0;
                    var48 = var13.field_Ub;
                    var13.field_Ub.field_p = 0;
                    var13.field_Hb.field_Z = null;
                    var48.field_sb = 0;
                    var13.field_Hb.field_p = 0;
                    var49 = var13.field_Hb;
                    var13.field_yb.field_Z = null;
                    var49.field_sb = 0;
                    var19 = var13.field_yb;
                    var13.field_yb.field_p = 0;
                    var13.field_Yb.field_Z = null;
                    var19.field_sb = 0;
                    var13.field_Yb.field_p = 0;
                    var20 = var13.field_Yb;
                    var20.field_sb = 0;
                    var13.field_vb.field_Z = null;
                    var21 = var13.field_vb;
                    var13.field_vb.field_p = 0;
                    var21.field_sb = 0;
                    var13.field_Db.field_Z = null;
                    var22 = var13.field_Db;
                    var13.field_Db.field_p = 0;
                    var22.field_sb = 0;
                    var23_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (ld.field_q <= var23_int) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var13.field_Ab[var23_int].field_v = null;
                    var24 = var13.field_Ab[var23_int];
                    var13.field_Ab[var23_int].field_p = 0;
                    var24.field_sb = 0;
                    var23_int++;
                    if (var42 != 0) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (var42 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    var13.field_xb.field_v = null;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    var23 = var13.field_xb;
                    var13.field_xb.field_p = 0;
                    var23.field_sb = 0;
                    var13.field_fc.field_v = null;
                    var13.field_fc.field_p = 0;
                    var50 = var13.field_fc;
                    var50.field_sb = 0;
                    var13.field_wb.field_v = null;
                    var25 = var13.field_wb;
                    var13.field_wb.field_p = 0;
                    var25.field_sb = 0;
                    var13.field_Qb.field_v = null;
                    var26 = var13.field_Qb;
                    var13.field_Qb.field_p = 0;
                    var13.field_Gb.field_Z = null;
                    var26.field_sb = 0;
                    var13.field_Gb.field_p = 0;
                    var27 = var13.field_Gb;
                    var13.field_cc.field_Z = null;
                    var27.field_sb = 0;
                    var13.field_cc.field_p = 0;
                    var28 = var13.field_cc;
                    var13.field_Tb.field_Z = null;
                    var28.field_sb = 0;
                    var13.field_Tb.field_p = 0;
                    var29 = var13.field_Tb;
                    var13.field_Ib.field_Z = null;
                    var29.field_sb = 0;
                    var30 = var13.field_Ib;
                    var13.field_Ib.field_p = 0;
                    var30.field_sb = 0;
                    var13.field_ac.field_Z = null;
                    var31 = var13.field_ac;
                    var13.field_ac.field_p = 0;
                    var31.field_sb = 0;
                    var13.field_sb = p.field_n.field_vb.field_sb;
                    var32 = 0;
                    var33 = var13.field_Jb;
                    if (!var13.f(74)) {
                        statePc = 45;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var13.field_Zb) {
                        statePc = 55;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (var13.field_zb) {
                        statePc = 53;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var13.field_Wb) {
                        statePc = 53;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var13.field_Bb) {
                        statePc = 51;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    var13.field_hc.field_Z = an.field_s;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var13.field_hc.field_Z = hja.field_g;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    var13.field_Ub.field_Z = rea.field_f;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var13.field_Nb >= 0) {
                        statePc = 67;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    if (!var13.field_Fb) {
                        statePc = 60;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    if (var13.field_zb) {
                        statePc = 65;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (var13.field_Wb) {
                        statePc = 65;
                    } else {
                        statePc = 60;
                    }
                    continue stateLoop;
                }
                case 60: {
                    if (2 != var13.field_Lb) {
                        statePc = 63;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    var13.field_Ub.field_Z = pu.field_k;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 63;
                    }
                    continue stateLoop;
                }
                case 63: {
                    var13.field_hc.field_Z = gf.field_h;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    var13.field_Ub.field_Z = rea.field_f;
                    if (var42 == 0) {
                        statePc = 68;
                    } else {
                        statePc = 67;
                    }
                    continue stateLoop;
                }
                case 67: {
                    var13.field_hc.field_Z = jca.field_b;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    if (var13.field_Ub.field_Z == null) {
                        statePc = 71;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    var13.field_Ub.a(rg.field_h, 31407, 68, 0, var32);
                    if (var42 == 0) {
                        statePc = 72;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 71: {
                    var13.field_hc.a(rg.field_h, 31407, 68, 0, var32);
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    var13.field_Hb.field_Z = po.a(var13.field_Hb.field_jb, var33, 78);
                    var13.field_Hb.a(rg.field_h, 31407, 78, 70, var32);
                    if (!var13.field_Hb.field_T) {
                        statePc = 76;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    if (!var13.field_Hb.field_Z.equals((Object) (Object) var33)) {
                        statePc = 75;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 75: {
                    jja.field_m = var33;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var13.field_yb.field_Z = Integer.toString(var13.field_Rb);
                    if (!var13.field_Fb) {
                        statePc = 78;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var13.field_Yb.field_Z = "/" + var13.field_Pb;
                    var13.field_yb.field_N = 2;
                    var34_int = (-var13.field_Yb.field_jb.a("/") + 348) / 2;
                    var13.field_yb.a(rg.field_h, 31407, var34_int - 150, 150, var32);
                    var13.field_Yb.a(rg.field_h, 31407, -var34_int + 198, var34_int, var32);
                    if (var42 == 0) {
                        statePc = 79;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var13.field_yb.field_N = 1;
                    var13.field_yb.a(rg.field_h, 31407, 48, 150, var32);
                    statePc = 79;
                    continue stateLoop;
                }
                case 79: {
                    var13.field_vb.field_Z = Integer.toString(var13.field_bc);
                    var13.field_vb.a(rg.field_h, 31407, 48, 200, var32);
                    if (eaa.field_c) {
                        statePc = 81;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    stackOut_80_0 = 200;
                    stackIn_82_0 = stackOut_80_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 81: {
                    stackOut_81_0 = 250;
                    stackIn_82_0 = stackOut_81_0;
                    statePc = 82;
                    continue stateLoop;
                }
                case 82: {
                    var34_int = stackIn_82_0;
                    var13.field_Db.a(rg.field_h, 31407, -var34_int + 363, var34_int, var32);
                    var35_int = lm.field_d;
                    if ((1 << wba.field_c & var15) == 0) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    var36 = (Object) (Object) ut.field_r[var13.field_Kb];
                    var13.field_xb.field_v = (kv) var36;
                    var13.field_xb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                    var35_int = var35_int + (((kv) var36).field_n + lm.field_d);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if ((var15 & 1 << kf.field_b) == 0) {
                        statePc = 95;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    if (!var13.field_zb) {
                        statePc = 87;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackOut_86_0 = 1;
                    stackIn_91_0 = stackOut_86_0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 87: {
                    if (var13.field_Wb) {
                        statePc = 89;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    stackOut_88_0 = 0;
                    stackIn_91_0 = stackOut_88_0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 89: {
                    stackOut_89_0 = 1;
                    stackIn_91_0 = stackOut_89_0;
                    statePc = 91;
                    continue stateLoop;
                }
                case 91: {
                    var37 = stackIn_91_0;
                    stackOut_91_0 = (kv[]) field_H;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_92_0 = stackOut_91_0;
                    if (var37 != 0) {
                        statePc = 93;
                    } else {
                        statePc = 92;
                    }
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = (kv[]) (Object) stackIn_92_0;
                    stackOut_92_1 = 0;
                    stackIn_94_0 = stackOut_92_0;
                    stackIn_94_1 = stackOut_92_1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 93: {
                    stackOut_93_0 = (kv[]) (Object) stackIn_93_0;
                    stackOut_93_1 = 1;
                    stackIn_94_0 = stackOut_93_0;
                    stackIn_94_1 = stackOut_93_1;
                    statePc = 94;
                    continue stateLoop;
                }
                case 94: {
                    var36 = (Object) (Object) stackIn_94_0[stackIn_94_1];
                    var13.field_wb.field_v = (kv) var36;
                    var13.field_wb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                    var35_int = var35_int + (lm.field_d + ((kv) var36).field_n);
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if (0 == (var15 & 1 << gf.field_l)) {
                        statePc = 97;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 96: {
                    var36 = (Object) (Object) rv.field_k[var13.field_Lb - 1];
                    var13.field_Qb.field_v = (kv) var36;
                    var13.field_Qb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                    var35_int = var35_int + (lm.field_d + ((kv) var36).field_n);
                    statePc = 97;
                    continue stateLoop;
                }
                case 97: {
                    if ((var15 & 1 << lga.field_r) != 0) {
                        statePc = 99;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 99: {
                    stackOut_99_0 = gba.field_Db;
                    stackIn_100_0 = stackOut_99_0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = (kv[]) (Object) stackIn_100_0;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (!var13.field_dc) {
                        statePc = 102;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = (kv[]) (Object) stackIn_101_0;
                    stackOut_101_1 = 1;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = (kv[]) (Object) stackIn_102_0;
                    stackOut_102_1 = 0;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    var36 = (Object) (Object) stackIn_103_0[stackIn_103_1];
                    var13.field_fc.field_v = (kv) var36;
                    var13.field_fc.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                    var35_int = var35_int + (((kv) var36).field_n - -lm.field_d);
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (null == uha.field_Xb) {
                        statePc = 114;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var37 = 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (var37 >= ld.field_q) {
                        statePc = 114;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = uha.field_Xb[var37];
                    stackIn_100_0 = stackOut_107_0;
                    stackIn_108_0 = stackOut_107_0;
                    if (var42 != 0) {
                        statePc = 100;
                    } else {
                        statePc = 108;
                    }
                    continue stateLoop;
                }
                case 108: {
                    if (stackIn_108_0 == null) {
                        statePc = 113;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    if (0 != (1 << var37 + bea.field_v & var15)) {
                        statePc = 112;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    if (var42 == 0) {
                        statePc = 113;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    var43 = uha.field_Xb[var37][255 & var13.field_Eb[var37]];
                    var36 = (Object) (Object) var43;
                    var13.field_Ab[var37].field_v = var43;
                    var13.field_Ab[var37].a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                    var35_int = var35_int + (((kv) var36).field_n + lm.field_d);
                    statePc = 113;
                    continue stateLoop;
                }
                case 113: {
                    var37++;
                    if (var42 == 0) {
                        statePc = 106;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    var37 = (var13.field_Db.field_sb + -var35_int) / 2;
                    if (0 < var37) {
                        statePc = 116;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 116: {
                    var13.field_xb.field_kb = var13.field_xb.field_kb + var37;
                    var13.field_wb.field_kb = var13.field_wb.field_kb + var37;
                    var13.field_Qb.field_kb = var13.field_Qb.field_kb + var37;
                    var13.field_fc.field_kb = var13.field_fc.field_kb + var37;
                    var38_int = 0;
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    if (var38_int >= ld.field_q) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var13.field_Ab[var38_int].field_kb = var13.field_Ab[var38_int].field_kb + var37;
                    var38_int++;
                    if (var42 != 0) {
                        statePc = 124;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var42 == 0) {
                        statePc = 117;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (var13.field_Zb) {
                        statePc = 123;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var38_int = var13.field_Nb;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var38_int < 0) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var38_int = (int)(var10 - var13.field_Ob);
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    var39_int = var38_int / 1000;
                    var40 = var39_int / 60;
                    var39_int = var39_int % 60;
                    if (var40 >= 60) {
                        statePc = 130;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var13.field_Gb.field_Z = var40 + ":" + var39_int / 10 + var39_int % 10;
                    if (var42 == 0) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    var41 = var40 / 60;
                    var40 = var40 % 60;
                    var13.field_Gb.field_Z = var41 + ":" + var40 / 10 + var40 % 10 + ":" + var39_int / 10 + var39_int % 10;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var13.field_Gb.a(rg.field_h, 31407, -365 + var13.field_sb, 365, var32);
                    var32 = var32 + rg.field_h;
                    if (var13.field_Cb != null) {
                        statePc = 133;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 133: {
                    var32 += 2;
                    var38 = new StringBuilder(64);
                    StringBuilder discarded$4 = var38.append(gfa.field_k);
                    StringBuilder discarded$5 = var38.append(var13.field_Cb[0]);
                    var39_int = 1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    if (var39_int >= var13.field_Rb) {
                        statePc = 138;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    StringBuilder discarded$6 = var38.append(", ");
                    StringBuilder discarded$7 = var38.append(var13.field_Cb[var39_int]);
                    var39_int++;
                    if (var42 != 0) {
                        statePc = 139;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var42 == 0) {
                        statePc = 134;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var39 = var38.toString();
                    var13.field_cc.field_Z = var39;
                    var40 = var13.field_cc.field_jb.b(var39, -(var13.field_cc.field_L * 2) + var13.field_sb);
                    var13.field_cc.a(rg.field_h * var40, 31407, var13.field_sb, 0, var32);
                    var32 = var32 + var40 * rg.field_h;
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    if (!var13.field_Wb) {
                        statePc = 141;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    var13.field_Tb.field_Z = lga.a(true, new String[1], eka.field_o);
                    var13.field_Tb.a(rg.field_h, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                    var32 = var32 + rg.field_h;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if (!var13.field_gc) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var13.field_Ib.field_Z = lga.a(true, new String[1], wn.field_l);
                    var13.field_Ib.a(rg.field_h, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                    var32 = var32 + rg.field_h;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    var34 = qfa.a(var13.field_ec, var33, -83);
                    if (var34 == null) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var35_int = var13.field_ac.field_jb.b(var34, -gba.field_Bb + (var13.field_sb - gba.field_Bb));
                    var13.field_ac.field_Z = var34;
                    var13.field_ac.field_cb = var13.field_Mb * 256 / kla.field_x;
                    var13.field_ac.a(rg.field_h * var35_int, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                    var32 = var32 + rg.field_h * var35_int;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    if (var7_int == 0) {
                        statePc = 147;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 147: {
                    var13.field_hb = var32 - var13.field_p;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    if (var14 == 0) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    p.field_n.field_vb.a(false, (sna) (Object) var13, (sna) var12, 2);
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    var35_int = 0;
                    statePc = 151;
                    continue stateLoop;
                }
                case 151: {
                    if (var35_int >= ld.field_q) {
                        statePc = 165;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    stackOut_152_0 = var13.field_Ab[var35_int].field_T;
                    stackIn_166_0 = stackOut_152_0;
                    stackIn_153_0 = stackOut_152_0;
                    if (var42 != 0) {
                        statePc = 166;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if (stackIn_153_0) {
                        statePc = 155;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 155: {
                    if (gk.field_c == null) {
                        statePc = 159;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    if (null != gk.field_c[var35_int]) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var36 = null;
                    statePc = 160;
                    continue stateLoop;
                }
                case 158: {
                    var36 = (Object) (Object) gk.field_c[var35_int][var13.field_Eb[var35_int] & 255];
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    var36 = null;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    if (var36 != null) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    jja.field_m = kka.field_k[var35_int];
                    if (var42 == 0) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    jja.field_m = kka.field_k[var35_int] + " - " + var36;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    var35_int++;
                    if (var42 == 0) {
                        statePc = 151;
                    } else {
                        statePc = 165;
                    }
                    continue stateLoop;
                }
                case 165: {
                    stackOut_165_0 = var13.field_xb.field_T;
                    stackIn_166_0 = stackOut_165_0;
                    statePc = 166;
                    continue stateLoop;
                }
                case 166: {
                    if (!stackIn_166_0) {
                        statePc = 171;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    if (1 == var13.field_Kb) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var35 = cc.field_d[var13.field_Kb];
                    statePc = 170;
                    continue stateLoop;
                }
                case 169: {
                    var35 = lt.field_c;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    jja.field_m = jk.field_j + " - " + var35;
                    statePc = 171;
                    continue stateLoop;
                }
                case 171: {
                    if (var13.field_fc.field_T) {
                        statePc = 173;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (var13.field_dc) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = uf.field_a;
                    stackIn_176_0 = stackOut_174_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 175: {
                    stackOut_175_0 = tw.field_d;
                    stackIn_176_0 = stackOut_175_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    jja.field_m = stackIn_176_0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (var13.field_wb.field_T) {
                        statePc = 179;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (var13.field_zb) {
                        statePc = 184;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    if (var13.field_Wb) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (var13.field_Fb) {
                        statePc = 183;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackOut_182_0 = bja.field_p;
                    stackIn_185_0 = stackOut_182_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 183: {
                    stackOut_183_0 = dp.field_m;
                    stackIn_185_0 = stackOut_183_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    stackOut_184_0 = lm.field_c;
                    stackIn_185_0 = stackOut_184_0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    jja.field_m = stackIn_185_0;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (var13.field_Qb.field_T) {
                        statePc = 188;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var13.field_Lb != 2) {
                        statePc = 190;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackOut_189_0 = rs.field_h;
                    stackIn_191_0 = stackOut_189_0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 190: {
                    stackOut_190_0 = aa.field_n;
                    stackIn_191_0 = stackOut_190_0;
                    statePc = 191;
                    continue stateLoop;
                }
                case 191: {
                    jja.field_m = stackIn_191_0;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    if (0 == var13.field_R) {
                        statePc = 205;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    if (var13.f(73)) {
                        statePc = 205;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (var13.field_Ub.field_R == 0) {
                        statePc = 204;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    if (!var13.field_Zb) {
                        statePc = 202;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (!var13.field_Fb) {
                        statePc = 200;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (var13.field_zb) {
                        statePc = 202;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    if (var13.field_Wb) {
                        statePc = 202;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    sfa.a(param5, var13.f((byte) -91), false);
                    if (var42 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    ep.a(false, param5, var13.f((byte) -79));
                    if (var42 == 0) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    ii.a(var33, param0, -3, var13);
                    statePc = 205;
                    continue stateLoop;
                }
                case 205: {
                    var13 = (uha) (Object) var9.c(0);
                    if (var42 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    sma(gj param0, lp param1) {
        super(param0, (bca) (Object) param1);
        ((sma) this).field_x = 17;
        ((sma) this).field_y = -1 + ((sma) this).field_x >> 1;
        ((sma) this).field_z = 17;
        ((sma) this).field_A = -1 + ((sma) this).field_z >> 1;
        try {
            ((sma) this).field_w = param1;
            ((sma) this).field_D = ((sma) this).field_w.e((byte) -108);
            ((sma) this).field_G = ((sma) this).field_w.field_s;
            ((sma) this).field_F = ((sma) this).field_w.field_r;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "sma.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static int e(int param0) {
        if (param0 != 30) {
            field_I = null;
        }
        return ce.field_x;
    }

    private final void d(int param0) {
    }

    final static void a(int param0, ee[] param1, vr param2, vr param3, int[] param4) {
        ee[] var5 = null;
        ee[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        fea var7 = null;
        sna var8 = null;
        sna var9 = null;
        sna var10 = null;
        sna var11 = null;
        kv[] var12 = null;
        kv[] var13 = null;
        kv[] var14 = null;
        sna var15 = null;
        kv[] var16 = null;
        kv[] var17 = null;
        int var18 = 0;
        Object var19 = null;
        ee[] stackIn_10_0 = null;
        ee[] stackIn_13_0 = null;
        ee[] stackOut_9_0 = null;
        ee[] stackOut_12_0 = null;
        L0: {
          L1: {
            var18 = BachelorFridge.field_y;
            var5 = bla.a(29611, "lobby", "crowns", param2);
            re.field_E = var5.length;
            if (param1 == null) {
              break L1;
            } else {
              var6 = new ee[re.field_E - -param1.length];
              var7_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (re.field_E <= var7_int) {
                      break L4;
                    } else {
                      var6[var7_int] = var5[var7_int];
                      var7_int++;
                      if (var18 != 0) {
                        break L3;
                      } else {
                        if (var18 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var5 = var6;
                  break L3;
                }
                var7_int = 0;
                L5: while (true) {
                  if (var7_int >= param1.length) {
                    break L1;
                  } else {
                    stackOut_9_0 = (ee[]) var6;
                    stackIn_13_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      stackIn_10_0[var7_int + re.field_E] = param1[var7_int];
                      var7_int++;
                      if (var18 == 0) {
                        continue L5;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
          }
          stackOut_12_0 = (ee[]) var5;
          stackIn_13_0 = stackOut_12_0;
          break L0;
        }
        var6_array = new int[stackIn_13_0.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              L9: {
                L10: {
                  if (var7_int >= re.field_E) {
                    break L10;
                  } else {
                    var6_array[var7_int] = 10;
                    var7_int++;
                    if (var18 != 0) {
                      break L9;
                    } else {
                      if (var18 == 0) {
                        continue L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                if (param1 != null) {
                  break L9;
                } else {
                  break L8;
                }
              }
              L11: {
                if (param4 != null) {
                  break L11;
                } else {
                  var7_int = 0;
                  L12: while (true) {
                    L13: {
                      if (param1.length <= var7_int) {
                        break L13;
                      } else {
                        var6_array[re.field_E - -var7_int] = param1[var7_int].field_b;
                        var7_int++;
                        if (var18 != 0) {
                          break L7;
                        } else {
                          if (var18 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    if (var18 == 0) {
                      break L8;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              var7_int = 0;
              L14: while (true) {
                if (param1.length <= var7_int) {
                  break L8;
                } else {
                  var6_array[var7_int + re.field_E] = param4[var7_int];
                  var7_int++;
                  if (var18 != 0) {
                    break L7;
                  } else {
                    if (var18 == 0) {
                      continue L14;
                    } else {
                      break L8;
                    }
                  }
                }
              }
            }
            lm.field_d = 2;
            he.field_l = 2;
            rg.field_h = 15;
            gba.field_Bb = 4;
            df.field_r = 11;
            break L7;
          }
          L15: {
            var7 = vfa.a("largefont", param2, 76, "lobby", param3);
            ds.field_l = vfa.a("generalfont", param2, -15, "lobby", param3);
            hl.field_H = vfa.a("chatfont", param2, -62, "lobby", param3);
            var7.a((th[]) (Object) var5, var6_array);
            ds.field_l.a((th[]) (Object) var5, var6_array);
            hl.field_H.a((th[]) (Object) var5, var6_array);
            var8 = new sna(0L, (sna) null);
            var8.field_gb = 16777215;
            var8.field_B = rg.field_h;
            var8.field_jb = (po) (Object) var7;
            var8.field_Y = 1;
            var9 = var8;
            var9.field_N = 1;
            var10 = new sna(0L, (sna) null);
            var10.field_jb = (po) (Object) ds.field_l;
            var10.field_gb = 16777215;
            var10.field_B = rg.field_h;
            var11 = var10;
            var10.field_Y = 1;
            var11.field_N = 1;
            p.field_o = new sna(0L, var8);
            p.field_o.field_eb = tj.a(gw.a("lobby", "heading", param2, -74), (byte) 104);
            nu.field_c = new sna(0L, (sna) null);
            nu.field_c.field_eb = nba.a(false, 8421504, 1, false, 120, 4210752);
            oe.field_c = new sna(0L, (sna) null);
            oe.field_c.field_eb = mu.a(6316128, 3, 114, 6316128, 1, (byte) 17);
            kha.field_i = new sna(0L, (sna) null);
            kha.field_i.field_eb = tj.a(gw.a("lobby", "popup", param2, -54), (byte) -56);
            var12 = tj.a(gw.a("lobby", "popup_mouseover", param2, param0 + -30913), (byte) 125);
            var13 = gw.a("lobby", "button", param2, -96);
            var14 = tj.a(gw.a("lobby", "tab_active", param2, -128), (byte) -29);
            mda.field_c = new sna(0L, var8);
            mda.field_c.field_eb = var14;
            sm.field_s = new sna(0L, (sna) null);
            sm.field_s.field_v = hca.a("lobby", param2, -39, "closebutton");
            sm.field_s.field_U = hca.a("lobby", param2, param0 + -30996, "closebutton_mouseover");
            rda.field_a = new sna(0L, var8);
            rda.field_a.field_eb = nba.a(true, 3815994, 1, true, 40, 2039583);
            iia.field_m = new sna(0L, var10);
            iia.field_m.field_L = 2;
            iia.field_m.field_eb = nba.a(false, 3815994, param0 ^ 30868, true, 30, 2039583);
            bna.field_z = new sna(0L, var10);
            bna.field_z.field_L = 2;
            bna.field_z.field_eb = nba.a(false, 3815994, param0 ^ 30868, false, 30, 2039583);
            vda.field_a = new sna(0L, var10);
            vda.field_a.field_L = 2;
            vda.field_a.field_eb = nba.a(true, 3815994, 1, false, 30, 2039583);
            qs.field_m = new sna(0L, (sna) null);
            qs.field_m.field_Y = 1;
            qs.field_m.field_gb = 13421772;
            qs.field_m.field_B = rg.field_h;
            qs.field_m.field_jb = (po) (Object) ds.field_l;
            dla.field_k = new sna(0L, qs.field_m);
            dla.field_k.field_w = 16777215;
            dla.field_k.field_gb = 16764006;
            dla.field_k.field_G = 16777215;
            dla.field_k.field_o = 8421504;
            dla.field_k.field_ab = 16777215;
            var15 = new sna(0L, dla.field_k);
            var15.field_B = rg.field_h;
            var15.field_jb = (po) (Object) var7;
            var15.field_gb = 16777215;
            rea.field_g = new sna(0L, qs.field_m);
            rea.field_g.field_eb = nba.a(false, 2236962, 1, false, 16, 2236962);
            rea.field_g.field_L = 2;
            ina.field_n = new sna(0L, qs.field_m);
            ina.field_n.field_eb = nba.a(false, 1513239, 1, false, 16, 1513239);
            ina.field_n.field_L = 2;
            wv.field_l = new sna(0L, rea.field_g);
            wv.field_l.a(dla.field_k, param0 ^ 30944);
            gi.field_c = new sna(0L, ina.field_n);
            gi.field_c.a(dla.field_k, 41);
            var16 = gw.a("lobby", "button_mouseover", param2, param0 + -30928);
            td.field_o = new pna(kha.field_i, var12, qs.field_m, dla.field_k, 3, 2, lm.field_d, 3, rg.field_h);
            wd.field_v = new sna(0L, dla.field_k);
            wd.field_v.field_V = 1;
            wd.field_v.field_lb = 1;
            wd.field_v.field_r = 1;
            wd.field_v.field_ob = 1;
            wd.field_v.field_A = var16;
            wd.field_v.field_eb = var13;
            wd.field_v.field_db = gw.a("lobby", "button_mouseheld", param2, -32);
            wd.field_v.field_K = gw.a("lobby", "button_active", param2, param0 + -30961);
            wd.field_v.field_X = gw.a("lobby", "button_disabled", param2, -85);
            wd.field_v.field_N = 1;
            ad.field_q = new sna(0L, dla.field_k);
            ad.field_q.field_N = 1;
            ad.field_q.field_eb = tj.a(gw.a("lobby", "tab_inactive", param2, -80), (byte) 106);
            ad.field_q.field_A = tj.a(gw.a("lobby", "tab_mouseover", param2, -44), (byte) 103);
            ad.field_q.field_K = var14;
            jfa.field_f = new sna(0L, (sna) null);
            jfa.field_f.field_eb = mu.a(1856141, 3, 206, 1127256, -1, (byte) 17);
            vq.field_v = new sna(0L, (sna) null);
            vq.field_v.field_eb = mu.a(11579568, 3, 290, 6052956, -1, (byte) 17);
            vo.field_b = new sna(0L, var15);
            vo.field_b.field_ob = 1;
            vo.field_b.field_N = 1;
            vo.field_b.field_r = 1;
            vo.field_b.field_lb = 1;
            vo.field_b.field_V = 1;
            sn.field_l = new sna(0L, vo.field_b);
            ria.field_k = new sna(0L, dla.field_k);
            ria.field_k.field_r = 1;
            ria.field_k.field_ob = 1;
            ria.field_k.field_lb = 1;
            ria.field_k.field_N = 1;
            ria.field_k.field_V = 1;
            mh.field_k = new sna(0L, ria.field_k);
            tca.field_c = new sna(0L, ria.field_k);
            iw.field_a = new sna(0L, vo.field_b);
            if (param0 == 30869) {
              break L15;
            } else {
              var19 = null;
              sma.a(93, (ee[]) null, (vr) null, (vr) null, (int[]) null);
              break L15;
            }
          }
          gfa.field_f = new sna(0L, ria.field_k);
          uaa.field_i = new sna(0L, ria.field_k);
          uj.field_r = new sna(0L, ria.field_k);
          ria.field_k.field_eb = tj.a(gw.a("lobby", "smallbutton", param2, -111), (byte) -65);
          ria.field_k.field_A = tj.a(gw.a("lobby", "smallbutton_mouseover", param2, -76), (byte) -1);
          kv[] dupTemp$4 = tj.a(gw.a("lobby", "smallbutton_active", param2, -67), (byte) -9);
          ria.field_k.field_K = dupTemp$4;
          ria.field_k.field_db = dupTemp$4;
          ria.field_k.field_X = tj.a(gw.a("lobby", "smallbutton_disabled", param2, -85), (byte) 114);
          sn.field_l.field_eb = tj.a(gw.a("lobby", "mediumbutton", param2, -34), (byte) 107);
          sn.field_l.field_A = tj.a(gw.a("lobby", "mediumbutton_mouseover", param2, param0 ^ -30959), (byte) 126);
          sn.field_l.field_db = tj.a(gw.a("lobby", "mediumbutton_mouseheld", param2, -61), (byte) -90);
          vo.field_b.field_eb = tj.a(gw.a("lobby", "bigbutton", param2, -125), (byte) -81);
          vo.field_b.field_A = tj.a(gw.a("lobby", "bigbutton_mouseover", param2, -68), (byte) -32);
          vo.field_b.field_db = tj.a(gw.a("lobby", "bigbutton_mouseheld", param2, -68), (byte) 114);
          vo.field_b.field_X = tj.a(gw.a("lobby", "bigbutton_disabled", param2, -128), (byte) -40);
          mh.field_k.field_eb = tj.a(gw.a("lobby", "greenbutton", param2, -118), (byte) 123);
          mh.field_k.field_A = tj.a(gw.a("lobby", "greenbutton_mouseover", param2, -53), (byte) 114);
          mh.field_k.field_db = tj.a(gw.a("lobby", "greenbutton_mouseheld", param2, param0 + -30984), (byte) 120);
          tca.field_c.field_eb = tj.a(gw.a("lobby", "redbutton", param2, param0 ^ -30894), (byte) 123);
          tca.field_c.field_A = tj.a(gw.a("lobby", "redbutton_mouseover", param2, -84), (byte) -70);
          tca.field_c.field_db = tj.a(gw.a("lobby", "redbutton_mouseheld", param2, -88), (byte) -106);
          iw.field_a.field_eb = tj.a(gw.a("lobby", "backbutton", param2, -83), (byte) 106);
          iw.field_a.field_A = tj.a(gw.a("lobby", "backbutton_mouseover", param2, -104), (byte) -72);
          iw.field_a.field_db = tj.a(gw.a("lobby", "backbutton_mouseheld", param2, -80), (byte) -82);
          iw.field_a.field_X = tj.a(gw.a("lobby", "backbutton_disabled", param2, -38), (byte) -92);
          uj.field_r.field_eb = tj.a(gw.a("lobby", "gameoptionbutton", param2, -67), (byte) -26);
          uj.field_r.field_A = tj.a(gw.a("lobby", "gameoptionbutton_mouseover", param2, -50), (byte) -61);
          kv[] dupTemp$5 = tj.a(gw.a("lobby", "gameoptionbutton_active", param2, param0 ^ -30958), (byte) 109);
          uj.field_r.field_K = dupTemp$5;
          uj.field_r.field_db = dupTemp$5;
          uj.field_r.field_X = tj.a(gw.a("lobby", "gameoptionbutton_disabled", param2, -68), (byte) -34);
          gfa.field_f.field_eb = tj.a(gw.a("lobby", "chatbutton", param2, -83), (byte) 114);
          gfa.field_f.field_A = tj.a(gw.a("lobby", "chatbutton_mouseover", param2, -107), (byte) 118);
          kv[] dupTemp$6 = tj.a(gw.a("lobby", "chatbutton_active", param2, -64), (byte) -127);
          gfa.field_f.field_K = dupTemp$6;
          gfa.field_f.field_db = dupTemp$6;
          uaa.field_i.field_eb = tj.a(gw.a("lobby", "chatfilterbutton", param2, -74), (byte) 122);
          uaa.field_i.field_A = tj.a(gw.a("lobby", "chatfilterbutton_mouseover", param2, -69), (byte) -79);
          kv[] dupTemp$7 = tj.a(gw.a("lobby", "chatfilterbutton_active", param2, -125), (byte) 107);
          uaa.field_i.field_K = dupTemp$7;
          uaa.field_i.field_db = dupTemp$7;
          var17 = gw.a("lobby", "checkbox", param2, -76);
          nr.field_v = new daa(0L, var17[1], var17[0], 1, dla.field_k, (String) null);
          cd.field_n = new sna(0L, (sna) null);
          cd.field_n.field_eb = aba.a(hca.a("lobby", param2, -56, "slideregion"), true);
          cd.field_n.field_A = aba.a(hca.a("lobby", param2, 110, "slideregion_mouseover"), true);
          cd.field_n.field_db = aba.a(hca.a("lobby", param2, 81, "slideregion_mouseheld"), true);
          cd.field_n.field_X = aba.a(hca.a("lobby", param2, param0 + -30970, "slideregion_disabled"), true);
          dj.field_d = new sna(0L, (sna) null);
          dj.field_d.field_eb = tj.a(gw.a("lobby", "dragbar", param2, param0 + -30977), (byte) -94);
          dj.field_d.field_A = tj.a(gw.a("lobby", "dragbar_mouseover", param2, -125), (byte) -82);
          dj.field_d.field_db = tj.a(gw.a("lobby", "dragbar_mouseheld", param2, -78), (byte) -92);
          dj.field_d.field_X = tj.a(gw.a("lobby", "dragbar_disabled", param2, -76), (byte) -22);
          aha.field_F = new sna(0L, (sna) null);
          aha.field_F.field_v = hca.a("lobby", param2, 82, "upbutton");
          aha.field_F.field_U = hca.a("lobby", param2, 107, "upbutton_mouseover");
          aha.field_F.field_y = hca.a("lobby", param2, -36, "upbutton_mouseheld");
          aha.field_F.field_H = hca.a("lobby", param2, 74, "upbutton_disabled");
          lla.field_l = new sna(0L, (sna) null);
          lla.field_l.field_v = hca.a("lobby", param2, 114, "downbutton");
          lla.field_l.field_U = hca.a("lobby", param2, 120, "downbutton_mouseover");
          lla.field_l.field_y = hca.a("lobby", param2, param0 ^ -30859, "downbutton_mouseheld");
          lla.field_l.field_H = hca.a("lobby", param2, param0 ^ -30898, "downbutton_disabled");
          qf.field_y = new cw(0L, aha.field_F, lla.field_l, cd.field_n, dj.field_d);
          ob.field_g = new ok(0L, (sna) null, vg.field_k, qf.field_y, ria.field_k, (String) null, (String) null);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_I = new Random();
        field_B = "Hide game chat";
    }
}
