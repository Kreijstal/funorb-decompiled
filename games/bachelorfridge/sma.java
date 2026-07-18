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
        L0: {
          var7 = BachelorFridge.field_y;
          if (((sma) this).field_l != 100) {
            break L0;
          } else {
            var2 = 0;
            L1: while (true) {
              if (((sma) this).field_z <= var2) {
                jja.a(256, -1, 23);
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var3 >= ((sma) this).field_x) {
                    var2++;
                    continue L1;
                  } else {
                    if (((sma) this).field_D[var2][var3] == 1) {
                      var4 = -((sma) this).field_A + (var2 + ((sma) this).field_F);
                      var5 = ((sma) this).field_G - (((sma) this).field_y - var3);
                      if (var4 >= 0) {
                        if (((sma) this).field_q.field_h.field_z > var4) {
                          if (var5 >= 0) {
                            if (var5 < ((sma) this).field_q.field_h.field_B) {
                              var6 = new ob(((sma) this).field_q, var4, var5);
                              ((kj) (Object) var6).a(0);
                              var3++;
                              continue L2;
                            } else {
                              var3++;
                              continue L2;
                            }
                          } else {
                            var3++;
                            continue L2;
                          }
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var3++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        }
        int fieldTemp$1 = ((sma) this).field_l - 1;
        ((sma) this).field_l = ((sma) this).field_l - 1;
        if (0 > fieldTemp$1) {
          var2 = -32 / ((param0 - 71) / 47);
          this.d(69);
          return true;
        } else {
          return false;
        }
    }

    public static void e() {
        field_B = null;
        field_I = null;
        field_v = null;
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
          var13 = BachelorFridge.field_y;
          if (!(param1 instanceof gi)) {
            var2 = "";
            var11 = var2;
            break L0;
          } else {
            var3 = (gi) (Object) param1;
            var2 = var3.field_e + " | ";
            param1 = var3.field_d;
            break L0;
          }
        }
        var3_ref = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var3_ref);
        param1.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var2 = var5;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var2 = var7;
        var11 = var7;
        L1: while (true) {
          var8 = var6.readLine();
          var2 = var8;
          var11 = var8;
          var2 = var11;
          if (var8 != null) {
            L2: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 + 1);
              if (var9 == -1) {
                var11 = var8;
                break L2;
              } else {
                var11 = var8.substring(0, var9);
                break L2;
              }
            }
            L3: {
              var11 = var11.trim();
              var11 = var11.substring(1 + var11.lastIndexOf(' '));
              var11 = var11.substring(var11.lastIndexOf('\t') - -1);
              var2 = var11;
              var2 = var11;
              var2 = var2 + var11;
              if (var9 == -1) {
                break L3;
              } else {
                if (var10 != -1) {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L3;
                  } else {
                    var2 = var2 + var8.substring(var12 + 5, var10);
                    break L3;
                  }
                } else {
                  var2 = var2 + ' ';
                  continue L1;
                }
              }
            }
            var2 = var2 + ' ';
            continue L1;
          } else {
            var2 = var11;
            var11 = var2;
            var2 = var2 + "| " + var7;
            return var2;
          }
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
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
        sna var44 = null;
        sna var45 = null;
        sna var46 = null;
        sna var47 = null;
        sna var48 = null;
        sna var49 = null;
        sna var50 = null;
        sga stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        sga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        sga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        uha stackIn_7_0 = null;
        sna stackIn_7_1 = null;
        sna stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        uha stackIn_8_0 = null;
        sna stackIn_8_1 = null;
        sna stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        uha stackIn_9_0 = null;
        sna stackIn_9_1 = null;
        sna stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        sna stackIn_9_4 = null;
        uha stackIn_27_0 = null;
        sna stackIn_27_1 = null;
        sna stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        uha stackIn_28_0 = null;
        sna stackIn_28_1 = null;
        sna stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        uha stackIn_29_0 = null;
        sna stackIn_29_1 = null;
        sna stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        sna stackIn_29_4 = null;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        kv[] stackIn_76_0 = null;
        kv[] stackIn_77_0 = null;
        kv[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        kv[] stackIn_84_0 = null;
        kv[] stackIn_85_0 = null;
        kv[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_145_0 = null;
        String stackIn_154_0 = null;
        String stackIn_160_0 = null;
        sga stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        sga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        sga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        uha stackOut_6_0 = null;
        sna stackOut_6_1 = null;
        sna stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        uha stackOut_8_0 = null;
        sna stackOut_8_1 = null;
        sna stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        sna stackOut_8_4 = null;
        uha stackOut_7_0 = null;
        sna stackOut_7_1 = null;
        sna stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        sna stackOut_7_4 = null;
        uha stackOut_26_0 = null;
        sna stackOut_26_1 = null;
        sna stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        uha stackOut_28_0 = null;
        sna stackOut_28_1 = null;
        sna stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        sna stackOut_28_4 = null;
        uha stackOut_27_0 = null;
        sna stackOut_27_1 = null;
        sna stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        sna stackOut_27_4 = null;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        kv[] stackOut_75_0 = null;
        kv[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        kv[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        kv[] stackOut_83_0 = null;
        kv[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        kv[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        String stackOut_144_0 = null;
        String stackOut_143_0 = null;
        String stackOut_152_0 = null;
        String stackOut_151_0 = null;
        String stackOut_153_0 = null;
        String stackOut_159_0 = null;
        String stackOut_158_0 = null;
        L0: {
          var36 = null;
          var42 = BachelorFridge.field_y;
          var8 = 0;
          stackOut_0_0 = p.field_n;
          stackOut_0_1 = 2 * (rg.field_h + 2);
          stackOut_0_2 = 2;
          stackOut_0_3 = param3 * (rg.field_h * 4 - -8);
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (bga.field_m != p.field_n) {
            stackOut_2_0 = (sga) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (sga) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        var7_int = ((sga) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param1, true) ? 1 : 0;
        var9 = p.field_n.field_vb.field_z;
        var10 = f.b((byte) 73);
        var12 = null;
        var13 = (uha) (Object) var9.b((byte) 90);
        L1: while (true) {
          if (var13 == null) {
            return;
          } else {
            L2: {
              var14 = 0;
              if (var13.field_z != null) {
                break L2;
              } else {
                L3: {
                  var15 = 16777215;
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
                  stackOut_6_0 = (uha) var13;
                  stackOut_6_1 = null;
                  stackOut_6_2 = null;
                  stackOut_6_3 = 0L;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  if (eaa.field_c) {
                    stackOut_8_0 = (uha) (Object) stackIn_8_0;
                    stackOut_8_1 = null;
                    stackOut_8_2 = null;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = wv.field_l;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    stackIn_9_4 = stackOut_8_4;
                    break L3;
                  } else {
                    stackOut_7_0 = (uha) (Object) stackIn_7_0;
                    stackOut_7_1 = null;
                    stackOut_7_2 = null;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = gi.field_c;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0.field_Db = new sna(stackIn_9_3, stackIn_9_4);
                  var13.a(-1, var13.field_Db);
                  var13.field_Ab = new sna[ld.field_q];
                  var13.field_xb = new sna(0L, (sna) null);
                  if ((1 << wba.field_c & var15) != 0) {
                    var13.field_Db.a(-1, var13.field_xb);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var13.field_wb = new sna(0L, (sna) null);
                  if ((var15 & 1 << kf.field_b) != 0) {
                    var13.field_Db.a(-1, var13.field_wb);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var13.field_Qb = new sna(0L, (sna) null);
                  if ((var15 & 1 << gf.field_l) != 0) {
                    var13.field_Db.a(-1, var13.field_Qb);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var13.field_fc = new sna(0L, (sna) null);
                  if ((var15 & 1 << lga.field_r) != 0) {
                    var13.field_Db.a(-1, var13.field_fc);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var46 = var13.field_xb;
                var45 = var13.field_fc;
                var13.field_Qb.field_Y = 1;
                var44 = var13.field_wb;
                var44.field_Y = 1;
                var45.field_Y = 1;
                var46.field_Y = 1;
                var19_int = 0;
                L8: while (true) {
                  if (var19_int >= ld.field_q) {
                    L9: {
                      stackOut_26_0 = (uha) var13;
                      stackOut_26_1 = null;
                      stackOut_26_2 = null;
                      stackOut_26_3 = 0L;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      if (eaa.field_c) {
                        stackOut_28_0 = (uha) (Object) stackIn_28_0;
                        stackOut_28_1 = null;
                        stackOut_28_2 = null;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = gi.field_c;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        stackIn_29_3 = stackOut_28_3;
                        stackIn_29_4 = stackOut_28_4;
                        break L9;
                      } else {
                        stackOut_27_0 = (uha) (Object) stackIn_27_0;
                        stackOut_27_1 = null;
                        stackOut_27_2 = null;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = wv.field_l;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        stackIn_29_3 = stackOut_27_3;
                        stackIn_29_4 = stackOut_27_4;
                        break L9;
                      }
                    }
                    stackIn_29_0.field_Gb = new sna(stackIn_29_3, stackIn_29_4);
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
                    break L2;
                  } else {
                    L10: {
                      var13.field_Ab[var19_int] = new sna(0L, (sna) null);
                      if (0 == (var15 & 1 << bea.field_v - -var19_int)) {
                        break L10;
                      } else {
                        var13.field_Db.a(-1, var13.field_Ab[var19_int]);
                        break L10;
                      }
                    }
                    var13.field_Ab[var19_int].field_Y = 1;
                    var19_int++;
                    continue L8;
                  }
                }
              }
            }
            L11: {
              var13.field_hc.field_Z = null;
              if (var13.field_Zb) {
                break L11;
              } else {
                break L11;
              }
            }
            var15 = 16777215;
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
            L12: while (true) {
              if (ld.field_q <= var23_int) {
                L13: {
                  var13.field_xb.field_v = null;
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
                    L14: {
                      if (var13.field_Zb) {
                        if (var13.field_Nb >= 0) {
                          var13.field_hc.field_Z = jca.field_b;
                          break L14;
                        } else {
                          L15: {
                            if (!var13.field_Fb) {
                              break L15;
                            } else {
                              L16: {
                                if (var13.field_zb) {
                                  break L16;
                                } else {
                                  if (var13.field_Wb) {
                                    break L16;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              var13.field_Ub.field_Z = rea.field_f;
                              break L14;
                            }
                          }
                          if (2 != var13.field_Lb) {
                            var13.field_hc.field_Z = gf.field_h;
                            break L14;
                          } else {
                            var13.field_Ub.field_Z = pu.field_k;
                            break L14;
                          }
                        }
                      } else {
                        L17: {
                          if (var13.field_zb) {
                            break L17;
                          } else {
                            if (var13.field_Wb) {
                              break L17;
                            } else {
                              if (var13.field_Bb) {
                                var13.field_hc.field_Z = hja.field_g;
                                break L14;
                              } else {
                                var13.field_hc.field_Z = an.field_s;
                                break L14;
                              }
                            }
                          }
                        }
                        var13.field_Ub.field_Z = rea.field_f;
                        break L14;
                      }
                    }
                    L18: {
                      if (var13.field_Ub.field_Z == null) {
                        var13.field_hc.a(rg.field_h, 31407, 68, 0, var32);
                        break L18;
                      } else {
                        var13.field_Ub.a(rg.field_h, 31407, 68, 0, var32);
                        break L18;
                      }
                    }
                    L19: {
                      var13.field_Hb.field_Z = po.a(var13.field_Hb.field_jb, var33, 78);
                      var13.field_Hb.a(rg.field_h, 31407, 78, 70, var32);
                      if (!var13.field_Hb.field_T) {
                        break L19;
                      } else {
                        if (!var13.field_Hb.field_Z.equals((Object) (Object) var33)) {
                          jja.field_m = var33;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var13.field_yb.field_Z = Integer.toString(var13.field_Rb);
                      if (!var13.field_Fb) {
                        var13.field_yb.field_N = 1;
                        var13.field_yb.a(rg.field_h, 31407, 48, 150, var32);
                        break L20;
                      } else {
                        var13.field_Yb.field_Z = "/" + var13.field_Pb;
                        var13.field_yb.field_N = 2;
                        var34_int = (-var13.field_Yb.field_jb.a("/") + 348) / 2;
                        var13.field_yb.a(rg.field_h, 31407, var34_int - 150, 150, var32);
                        var13.field_Yb.a(rg.field_h, 31407, -var34_int + 198, var34_int, var32);
                        break L20;
                      }
                    }
                    L21: {
                      var13.field_vb.field_Z = Integer.toString(var13.field_bc);
                      var13.field_vb.a(rg.field_h, 31407, 48, 200, var32);
                      if (eaa.field_c) {
                        stackOut_66_0 = 250;
                        stackIn_67_0 = stackOut_66_0;
                        break L21;
                      } else {
                        stackOut_65_0 = 200;
                        stackIn_67_0 = stackOut_65_0;
                        break L21;
                      }
                    }
                    L22: {
                      var34_int = stackIn_67_0;
                      var13.field_Db.a(rg.field_h, 31407, -var34_int + 363, var34_int, var32);
                      var35_int = lm.field_d;
                      if ((1 << wba.field_c & var15) == 0) {
                        break L22;
                      } else {
                        var36 = (Object) (Object) ut.field_r[var13.field_Kb];
                        var13.field_xb.field_v = (kv) var36;
                        var13.field_xb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                        var35_int = var35_int + (((kv) var36).field_n + lm.field_d);
                        break L22;
                      }
                    }
                    L23: {
                      if ((var15 & 1 << kf.field_b) == 0) {
                        break L23;
                      } else {
                        L24: {
                          if (!var13.field_zb) {
                            if (var13.field_Wb) {
                              stackOut_74_0 = 1;
                              stackIn_75_0 = stackOut_74_0;
                              break L24;
                            } else {
                              stackOut_73_0 = 0;
                              stackIn_75_0 = stackOut_73_0;
                              break L24;
                            }
                          } else {
                            stackOut_71_0 = 1;
                            stackIn_75_0 = stackOut_71_0;
                            break L24;
                          }
                        }
                        L25: {
                          var37 = stackIn_75_0;
                          stackOut_75_0 = (kv[]) field_H;
                          stackIn_77_0 = stackOut_75_0;
                          stackIn_76_0 = stackOut_75_0;
                          if (var37 != 0) {
                            stackOut_77_0 = (kv[]) (Object) stackIn_77_0;
                            stackOut_77_1 = 1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            break L25;
                          } else {
                            stackOut_76_0 = (kv[]) (Object) stackIn_76_0;
                            stackOut_76_1 = 0;
                            stackIn_78_0 = stackOut_76_0;
                            stackIn_78_1 = stackOut_76_1;
                            break L25;
                          }
                        }
                        var36 = (Object) (Object) stackIn_78_0[stackIn_78_1];
                        var13.field_wb.field_v = (kv) var36;
                        var13.field_wb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                        var35_int = var35_int + (lm.field_d + ((kv) var36).field_n);
                        break L23;
                      }
                    }
                    L26: {
                      if (0 == (var15 & 1 << gf.field_l)) {
                        break L26;
                      } else {
                        var36 = (Object) (Object) rv.field_k[var13.field_Lb - 1];
                        var13.field_Qb.field_v = (kv) var36;
                        var13.field_Qb.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                        var35_int = var35_int + (lm.field_d + ((kv) var36).field_n);
                        break L26;
                      }
                    }
                    L27: {
                      if ((var15 & 1 << lga.field_r) != 0) {
                        L28: {
                          stackOut_83_0 = gba.field_Db;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_84_0 = stackOut_83_0;
                          if (!var13.field_dc) {
                            stackOut_85_0 = (kv[]) (Object) stackIn_85_0;
                            stackOut_85_1 = 0;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            break L28;
                          } else {
                            stackOut_84_0 = (kv[]) (Object) stackIn_84_0;
                            stackOut_84_1 = 1;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            break L28;
                          }
                        }
                        var36 = (Object) (Object) stackIn_86_0[stackIn_86_1];
                        var13.field_fc.field_v = (kv) var36;
                        var13.field_fc.a(var13.field_Db.field_p, 31407, ((kv) var36).field_n, var35_int, 0);
                        var35_int = var35_int + (((kv) var36).field_n - -lm.field_d);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L29: {
                      if (null == uha.field_Xb) {
                        break L29;
                      } else {
                        var37 = 0;
                        L30: while (true) {
                          if (var37 >= ld.field_q) {
                            break L29;
                          } else {
                            L31: {
                              if (uha.field_Xb[var37] == null) {
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            var37++;
                            continue L30;
                          }
                        }
                      }
                    }
                    L32: {
                      var37 = (var13.field_Db.field_sb + -var35_int) / 2;
                      if (0 < var37) {
                        var13.field_xb.field_kb = var13.field_xb.field_kb + var37;
                        var13.field_wb.field_kb = var13.field_wb.field_kb + var37;
                        var13.field_Qb.field_kb = var13.field_Qb.field_kb + var37;
                        var13.field_fc.field_kb = var13.field_fc.field_kb + var37;
                        var38_int = 0;
                        L33: while (true) {
                          if (var38_int >= ld.field_q) {
                            break L32;
                          } else {
                            var13.field_Ab[var38_int].field_kb = var13.field_Ab[var38_int].field_kb + var37;
                            var38_int++;
                            continue L33;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    L34: {
                      if (var13.field_Zb) {
                        L35: {
                          var38_int = var13.field_Nb;
                          if (var38_int < 0) {
                            var38_int = (int)(var10 - var13.field_Ob);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        var39_int = var38_int / 1000;
                        var40 = var39_int / 60;
                        var39_int = var39_int % 60;
                        if (var40 >= 60) {
                          var41 = var40 / 60;
                          var40 = var40 % 60;
                          var13.field_Gb.field_Z = var41 + ":" + var40 / 10 + var40 % 10 + ":" + var39_int / 10 + var39_int % 10;
                          break L34;
                        } else {
                          var13.field_Gb.field_Z = var40 + ":" + var39_int / 10 + var39_int % 10;
                          break L34;
                        }
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      var13.field_Gb.a(rg.field_h, 31407, -365 + var13.field_sb, 365, var32);
                      var32 = var32 + rg.field_h;
                      if (var13.field_Cb != null) {
                        var32 += 2;
                        var38 = new StringBuilder(64);
                        StringBuilder discarded$5 = var38.append(gfa.field_k);
                        StringBuilder discarded$6 = var38.append(var13.field_Cb[0]);
                        var39_int = 1;
                        L37: while (true) {
                          if (var39_int >= var13.field_Rb) {
                            var39 = var38.toString();
                            var13.field_cc.field_Z = var39;
                            var40 = var13.field_cc.field_jb.b(var39, -(var13.field_cc.field_L * 2) + var13.field_sb);
                            var13.field_cc.a(rg.field_h * var40, 31407, var13.field_sb, 0, var32);
                            var32 = var32 + var40 * rg.field_h;
                            break L36;
                          } else {
                            StringBuilder discarded$7 = var38.append(", ");
                            StringBuilder discarded$8 = var38.append(var13.field_Cb[var39_int]);
                            var39_int++;
                            continue L37;
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                    L38: {
                      if (!var13.field_Wb) {
                        break L38;
                      } else {
                        var13.field_Tb.field_Z = lga.a(true, new String[1], eka.field_o);
                        var13.field_Tb.a(rg.field_h, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                        var32 = var32 + rg.field_h;
                        break L38;
                      }
                    }
                    if (!var13.field_gc) {
                      break L13;
                    } else {
                      var13.field_Ib.field_Z = lga.a(true, new String[1], wn.field_l);
                      var13.field_Ib.a(rg.field_h, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                      var32 = var32 + rg.field_h;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L39: {
                  int discarded$9 = -83;
                  var34 = qfa.a(var13.field_ec, var33);
                  if (var34 == null) {
                    break L39;
                  } else {
                    var35_int = var13.field_ac.field_jb.b(var34, -gba.field_Bb + (var13.field_sb - gba.field_Bb));
                    var13.field_ac.field_Z = var34;
                    var13.field_ac.field_cb = var13.field_Mb * 256 / kla.field_x;
                    var13.field_ac.a(rg.field_h * var35_int, 31407, var13.field_sb + -(2 * gba.field_Bb), gba.field_Bb, var32);
                    var32 = var32 + rg.field_h * var35_int;
                    break L39;
                  }
                }
                L40: {
                  if (var7_int == 0) {
                    var13.field_hb = var32 - var13.field_p;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if (var14 == 0) {
                    break L41;
                  } else {
                    p.field_n.field_vb.a(false, (sna) (Object) var13, (sna) var12, 2);
                    break L41;
                  }
                }
                var35_int = 0;
                L42: while (true) {
                  if (var35_int >= ld.field_q) {
                    L43: {
                      if (!var13.field_xb.field_T) {
                        break L43;
                      } else {
                        L44: {
                          if (1 == var13.field_Kb) {
                            var35 = lt.field_c;
                            break L44;
                          } else {
                            var35 = cc.field_d[var13.field_Kb];
                            break L44;
                          }
                        }
                        jja.field_m = jk.field_j + " - " + var35;
                        break L43;
                      }
                    }
                    L45: {
                      if (var13.field_fc.field_T) {
                        L46: {
                          if (var13.field_dc) {
                            stackOut_144_0 = tw.field_d;
                            stackIn_145_0 = stackOut_144_0;
                            break L46;
                          } else {
                            stackOut_143_0 = uf.field_a;
                            stackIn_145_0 = stackOut_143_0;
                            break L46;
                          }
                        }
                        jja.field_m = stackIn_145_0;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (var13.field_wb.field_T) {
                        L48: {
                          L49: {
                            if (var13.field_zb) {
                              break L49;
                            } else {
                              if (var13.field_Wb) {
                                break L49;
                              } else {
                                if (var13.field_Fb) {
                                  stackOut_152_0 = dp.field_m;
                                  stackIn_154_0 = stackOut_152_0;
                                  break L48;
                                } else {
                                  stackOut_151_0 = bja.field_p;
                                  stackIn_154_0 = stackOut_151_0;
                                  break L48;
                                }
                              }
                            }
                          }
                          stackOut_153_0 = lm.field_c;
                          stackIn_154_0 = stackOut_153_0;
                          break L48;
                        }
                        jja.field_m = stackIn_154_0;
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    L50: {
                      if (var13.field_Qb.field_T) {
                        L51: {
                          if (var13.field_Lb != 2) {
                            stackOut_159_0 = aa.field_n;
                            stackIn_160_0 = stackOut_159_0;
                            break L51;
                          } else {
                            stackOut_158_0 = rs.field_h;
                            stackIn_160_0 = stackOut_158_0;
                            break L51;
                          }
                        }
                        jja.field_m = stackIn_160_0;
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L52: {
                      if (0 == var13.field_R) {
                        break L52;
                      } else {
                        if (var13.f(73)) {
                          break L52;
                        } else {
                          if (var13.field_Ub.field_R == 0) {
                            ii.a(var33, true, -3, var13);
                            break L52;
                          } else {
                            L53: {
                              if (!var13.field_Zb) {
                                break L53;
                              } else {
                                L54: {
                                  if (!var13.field_Fb) {
                                    break L54;
                                  } else {
                                    if (var13.field_zb) {
                                      break L53;
                                    } else {
                                      if (var13.field_Wb) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                }
                                sfa.a(11, var13.f((byte) -91), false);
                                break L52;
                              }
                            }
                            ep.a(false, 11, var13.f((byte) -79));
                            break L52;
                          }
                        }
                      }
                    }
                    var13 = (uha) (Object) var9.c(0);
                    continue L1;
                  } else {
                    L55: {
                      if (var13.field_Ab[var35_int].field_T) {
                        L56: {
                          if (gk.field_c == null) {
                            var36 = null;
                            break L56;
                          } else {
                            if (null != gk.field_c[var35_int]) {
                              var36 = (Object) (Object) gk.field_c[var35_int][var13.field_Eb[var35_int] & 255];
                              break L56;
                            } else {
                              var36 = null;
                              break L56;
                            }
                          }
                        }
                        if (var36 != null) {
                          jja.field_m = kka.field_k[var35_int] + " - " + (String) var36;
                          break L55;
                        } else {
                          jja.field_m = kka.field_k[var35_int];
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    var35_int++;
                    continue L42;
                  }
                }
              } else {
                var13.field_Ab[var23_int].field_v = null;
                var24 = var13.field_Ab[var23_int];
                var13.field_Ab[var23_int].field_p = 0;
                var24.field_sb = 0;
                var23_int++;
                continue L12;
              }
            }
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
            throw pe.a((Throwable) (Object) runtimeException, "sma.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int e(int param0) {
        return ce.field_x;
    }

    private final void d(int param0) {
    }

    final static void a(int param0, ee[] param1, vr param2, vr param3, int[] param4) {
        ee[] var5 = null;
        int[] var6 = null;
        ee[] var6_array = null;
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
        int[] var20 = null;
        L0: {
          var18 = BachelorFridge.field_y;
          var5 = bla.a(29611, "lobby", "crowns", param2);
          re.field_E = var5.length;
          if (param1 == null) {
            break L0;
          } else {
            var6_array = new ee[re.field_E - -param1.length];
            var7_int = 0;
            L1: while (true) {
              if (re.field_E <= var7_int) {
                var5 = var6_array;
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= param1.length) {
                    break L0;
                  } else {
                    var6_array[var7_int + re.field_E] = param1[var7_int];
                    var7_int++;
                    continue L2;
                  }
                }
              } else {
                var6_array[var7_int] = var5[var7_int];
                var7_int++;
                continue L1;
              }
            }
          }
        }
        var20 = new int[var5.length];
        var6 = var20;
        var7_int = 0;
        L3: while (true) {
          if (var7_int >= re.field_E) {
            L4: {
              if (param1 != null) {
                if (param4 != null) {
                  var7_int = 0;
                  L5: while (true) {
                    if (param1.length <= var7_int) {
                      break L4;
                    } else {
                      var6[var7_int + re.field_E] = param4[var7_int];
                      var7_int++;
                      continue L5;
                    }
                  }
                } else {
                  var7_int = 0;
                  L6: while (true) {
                    if (param1.length <= var7_int) {
                      break L4;
                    } else {
                      var6[re.field_E - -var7_int] = param1[var7_int].field_b;
                      var7_int++;
                      continue L6;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              lm.field_d = 2;
              he.field_l = 2;
              rg.field_h = 15;
              gba.field_Bb = 4;
              df.field_r = 11;
              var7 = vfa.a("largefont", param2, 76, "lobby", param3);
              ds.field_l = vfa.a("generalfont", param2, -15, "lobby", param3);
              hl.field_H = vfa.a("chatfont", param2, -62, "lobby", param3);
              var7.a((th[]) (Object) var5, var6);
              ds.field_l.a((th[]) (Object) var5, var6);
              hl.field_H.a((th[]) (Object) var5, var6);
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
                break L7;
              } else {
                var19 = null;
                sma.a(93, (ee[]) null, (vr) null, (vr) null, (int[]) null);
                break L7;
              }
            }
            gfa.field_f = new sna(0L, ria.field_k);
            uaa.field_i = new sna(0L, ria.field_k);
            uj.field_r = new sna(0L, ria.field_k);
            ria.field_k.field_eb = tj.a(gw.a("lobby", "smallbutton", param2, -111), (byte) -65);
            ria.field_k.field_A = tj.a(gw.a("lobby", "smallbutton_mouseover", param2, -76), (byte) -1);
            kv[] dupTemp$8 = tj.a(gw.a("lobby", "smallbutton_active", param2, -67), (byte) -9);
            ria.field_k.field_K = dupTemp$8;
            ria.field_k.field_db = dupTemp$8;
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
            kv[] dupTemp$9 = tj.a(gw.a("lobby", "gameoptionbutton_active", param2, param0 ^ -30958), (byte) 109);
            uj.field_r.field_K = dupTemp$9;
            uj.field_r.field_db = dupTemp$9;
            uj.field_r.field_X = tj.a(gw.a("lobby", "gameoptionbutton_disabled", param2, -68), (byte) -34);
            gfa.field_f.field_eb = tj.a(gw.a("lobby", "chatbutton", param2, -83), (byte) 114);
            gfa.field_f.field_A = tj.a(gw.a("lobby", "chatbutton_mouseover", param2, -107), (byte) 118);
            kv[] dupTemp$10 = tj.a(gw.a("lobby", "chatbutton_active", param2, -64), (byte) -127);
            gfa.field_f.field_K = dupTemp$10;
            gfa.field_f.field_db = dupTemp$10;
            uaa.field_i.field_eb = tj.a(gw.a("lobby", "chatfilterbutton", param2, -74), (byte) 122);
            uaa.field_i.field_A = tj.a(gw.a("lobby", "chatfilterbutton_mouseover", param2, -69), (byte) -79);
            kv[] dupTemp$11 = tj.a(gw.a("lobby", "chatfilterbutton_active", param2, -125), (byte) 107);
            uaa.field_i.field_K = dupTemp$11;
            uaa.field_i.field_db = dupTemp$11;
            var17 = gw.a("lobby", "checkbox", param2, -76);
            nr.field_v = new daa(0L, var17[1], var17[0], 1, dla.field_k, (String) null);
            cd.field_n = new sna(0L, (sna) null);
            int discarded$12 = 1;
            cd.field_n.field_eb = aba.a(hca.a("lobby", param2, -56, "slideregion"));
            int discarded$13 = 1;
            cd.field_n.field_A = aba.a(hca.a("lobby", param2, 110, "slideregion_mouseover"));
            int discarded$14 = 1;
            cd.field_n.field_db = aba.a(hca.a("lobby", param2, 81, "slideregion_mouseheld"));
            int discarded$15 = 1;
            cd.field_n.field_X = aba.a(hca.a("lobby", param2, param0 + -30970, "slideregion_disabled"));
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
          } else {
            var20[var7_int] = 10;
            var7_int++;
            continue L3;
          }
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
