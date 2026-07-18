/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class pe extends kc {
    private kc field_Hb;
    private int field_Bb;
    private int field_Gb;
    private int field_Eb;
    private qb[] field_Rb;
    private kc field_Qb;
    private nl[] field_Ob;
    private int[] field_Pb;
    private int field_Mb;
    private int field_Sb;
    private int field_Kb;
    private int field_Cb;
    static vn field_Lb;
    static am field_Db;
    static qb field_Ib;
    static int[][] field_Fb;
    static String field_Nb;
    static boolean field_Jb;

    final static boolean a(byte param0, int param1) {
        try {
            if (param0 != -86) {
                boolean discarded$0 = pe.a(-103, 27, (byte) -56, 44);
            }
            if (param1 <= df.field_z.field_g) {
                return true;
            }
            if (null == ch.field_c) {
                return false;
            }
            int var2_int = ch.field_c.b(0);
            if (!(var2_int <= 0)) {
                if (!(param1 - df.field_z.field_g >= var2_int)) {
                    var2_int = param1 - df.field_z.field_g;
                }
                ch.field_c.a(df.field_z.field_j, (byte) -127, df.field_z.field_g, var2_int);
                hi.field_d = qj.b(-26572);
                df.field_z.field_g = df.field_z.field_g + var2_int;
                if (param1 > df.field_z.field_g) {
                    return false;
                }
                df.field_z.field_g = 0;
                return true;
            }
            {
                if (var2_int >= 0) {
                    if (rk.a(-66) <= 30000L) {
                        return false;
                    }
                }
                ka.b(false);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, boolean param6) {
        int var7_int = 0;
        vn var8 = null;
        long var9 = 0L;
        Object var11 = null;
        na var12 = null;
        int var13 = 0;
        int var14 = 0;
        kc var18 = null;
        int var18_int = 0;
        kc var19 = null;
        kc var20 = null;
        kc var21 = null;
        int var22_int = 0;
        kc var22 = null;
        kc var23 = null;
        kc var24 = null;
        kc var25 = null;
        kc var26 = null;
        kc var27 = null;
        kc var28 = null;
        kc var29 = null;
        kc var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        kc var43 = null;
        kc var44 = null;
        kc var45 = null;
        kc var46 = null;
        kc var47 = null;
        kc var48 = null;
        kc var49 = null;
        Object var50 = null;
        qb var50_ref = null;
        Object var51 = null;
        qb var51_ref = null;
        Object var52 = null;
        qb var52_ref = null;
        Object var53 = null;
        qb var53_ref = null;
        dn stackIn_1_0 = null;
        dn stackIn_2_0 = null;
        dn stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        na stackIn_8_0 = null;
        kc stackIn_8_1 = null;
        kc stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        na stackIn_9_0 = null;
        kc stackIn_9_1 = null;
        kc stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        na stackIn_10_0 = null;
        kc stackIn_10_1 = null;
        kc stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        kc stackIn_10_4 = null;
        na stackIn_26_0 = null;
        kc stackIn_26_1 = null;
        kc stackIn_26_2 = null;
        long stackIn_26_3 = 0L;
        na stackIn_27_0 = null;
        kc stackIn_27_1 = null;
        kc stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        na stackIn_28_0 = null;
        kc stackIn_28_1 = null;
        kc stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        kc stackIn_28_4 = null;
        int stackIn_65_0 = 0;
        int stackIn_75_0 = 0;
        qb[] stackIn_76_0 = null;
        qb[] stackIn_77_0 = null;
        qb[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        qb[] stackIn_84_0 = null;
        qb[] stackIn_85_0 = null;
        qb[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_143_0 = null;
        String stackIn_152_0 = null;
        String stackIn_157_0 = null;
        dn stackOut_0_0 = null;
        dn stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        dn stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        na stackOut_7_0 = null;
        kc stackOut_7_1 = null;
        kc stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        na stackOut_9_0 = null;
        kc stackOut_9_1 = null;
        kc stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        kc stackOut_9_4 = null;
        na stackOut_8_0 = null;
        kc stackOut_8_1 = null;
        kc stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        kc stackOut_8_4 = null;
        na stackOut_25_0 = null;
        kc stackOut_25_1 = null;
        kc stackOut_25_2 = null;
        long stackOut_25_3 = 0L;
        na stackOut_27_0 = null;
        kc stackOut_27_1 = null;
        kc stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        kc stackOut_27_4 = null;
        na stackOut_26_0 = null;
        kc stackOut_26_1 = null;
        kc stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        kc stackOut_26_4 = null;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        qb[] stackOut_75_0 = null;
        qb[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        qb[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        qb[] stackOut_83_0 = null;
        qb[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        qb[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        String stackOut_142_0 = null;
        String stackOut_141_0 = null;
        String stackOut_150_0 = null;
        String stackOut_149_0 = null;
        String stackOut_151_0 = null;
        String stackOut_156_0 = null;
        String stackOut_155_0 = null;
        L0: {
          var50 = null;
          var51 = null;
          var52 = null;
          var53 = null;
          var41 = ArcanistsMulti.field_G ? 1 : 0;
          stackOut_0_0 = ee.field_g;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (dd.field_h != ee.field_g) {
            stackOut_2_0 = (dn) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (dn) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        var7_int = ((dn) (Object) stackIn_3_0).a(stackIn_3_1 != 0, (byte) 98, (2 + ga.field_r) * 2, 2, param1 * (8 + ga.field_r * 4), param6) ? 1 : 0;
        var8 = ee.field_g.field_Cb.field_G;
        var9 = qj.b(-26572);
        var11 = null;
        var12 = (na) (Object) var8.b(12623);
        L1: while (true) {
          if (var12 == null) {
            return;
          } else {
            L2: {
              var13 = 0;
              if (var12.field_G == null) {
                L3: {
                  var12.field_Gb = new kc(0L, le.field_E);
                  var14 = 16777215;
                  var12.a(var12.field_Gb, 47);
                  var12.field_Gb.field_X = 1;
                  var12.field_jc = new kc(0L, qa.field_j);
                  var12.a(var12.field_jc, 80);
                  var12.field_Mb = new kc(0L, le.field_E);
                  var12.a(var12.field_Mb, 65);
                  var12.field_Mb.field_t = 0;
                  var12.field_Eb = new kc(0L, le.field_E);
                  var12.a(var12.field_Eb, 35);
                  var12.field_Eb.field_t = 0;
                  var12.field_cc = new kc(0L, qa.field_j);
                  var12.a(var12.field_cc, 125);
                  var12.field_cc.field_X = 2;
                  stackOut_7_0 = (na) var12;
                  stackOut_7_1 = null;
                  stackOut_7_2 = null;
                  stackOut_7_3 = 0L;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  if (fc.field_a) {
                    stackOut_9_0 = (na) (Object) stackIn_9_0;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = le.field_E;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    break L3;
                  } else {
                    stackOut_8_0 = (na) (Object) stackIn_8_0;
                    stackOut_8_1 = null;
                    stackOut_8_2 = null;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = qa.field_j;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    stackIn_10_4 = stackOut_8_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_10_0.field_ec = new kc(stackIn_10_3, stackIn_10_4);
                  var12.a(var12.field_ec, 35);
                  var12.field_pc = new kc[vf.field_l];
                  var12.field_Ub = new kc(0L, (kc) null);
                  if ((1 << ma.field_U & var14) == 0) {
                    break L4;
                  } else {
                    var12.field_ec.a(var12.field_Ub, 76);
                    break L4;
                  }
                }
                L5: {
                  var12.field_Cb = new kc(0L, (kc) null);
                  if ((var14 & 1 << gn.field_k) != 0) {
                    var12.field_ec.a(var12.field_Cb, 125);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12.field_Jb = new kc(0L, (kc) null);
                  if ((1 << hb.field_Kb & var14) == 0) {
                    break L6;
                  } else {
                    var12.field_ec.a(var12.field_Jb, 44);
                    break L6;
                  }
                }
                L7: {
                  var12.field_Xb = new kc(0L, (kc) null);
                  if (0 != (var14 & 1 << gm.field_a)) {
                    var12.field_ec.a(var12.field_Xb, 37);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var45 = var12.field_Ub;
                var44 = var12.field_Xb;
                var12.field_Jb.field_gb = 1;
                var43 = var12.field_Cb;
                var43.field_gb = 1;
                var44.field_gb = 1;
                var45.field_gb = 1;
                var18_int = 0;
                L8: while (true) {
                  if (var18_int >= vf.field_l) {
                    L9: {
                      stackOut_25_0 = (na) var12;
                      stackOut_25_1 = null;
                      stackOut_25_2 = null;
                      stackOut_25_3 = 0L;
                      stackIn_27_0 = stackOut_25_0;
                      stackIn_27_1 = stackOut_25_1;
                      stackIn_27_2 = stackOut_25_2;
                      stackIn_27_3 = stackOut_25_3;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      stackIn_26_2 = stackOut_25_2;
                      stackIn_26_3 = stackOut_25_3;
                      if (fc.field_a) {
                        stackOut_27_0 = (na) (Object) stackIn_27_0;
                        stackOut_27_1 = null;
                        stackOut_27_2 = null;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = qa.field_j;
                        stackIn_28_0 = stackOut_27_0;
                        stackIn_28_1 = stackOut_27_1;
                        stackIn_28_2 = stackOut_27_2;
                        stackIn_28_3 = stackOut_27_3;
                        stackIn_28_4 = stackOut_27_4;
                        break L9;
                      } else {
                        stackOut_26_0 = (na) (Object) stackIn_26_0;
                        stackOut_26_1 = null;
                        stackOut_26_2 = null;
                        stackOut_26_3 = stackIn_26_3;
                        stackOut_26_4 = le.field_E;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        stackIn_28_2 = stackOut_26_2;
                        stackIn_28_3 = stackOut_26_3;
                        stackIn_28_4 = stackOut_26_4;
                        break L9;
                      }
                    }
                    stackIn_28_0.field_hc = new kc(stackIn_28_3, stackIn_28_4);
                    var12.a(var12.field_hc, 7);
                    var12.field_hc.field_X = 2;
                    var12.field_Vb = new kc(0L, qa.field_j);
                    var12.a(var12.field_Vb, 14);
                    var12.field_Ib = new kc(0L, nj.field_d);
                    var12.a(var12.field_Ib, 56);
                    var12.field_fc = new kc(0L, nj.field_d);
                    var12.a(var12.field_fc, 24);
                    var12.field_Kb = new kc(0L, pg.field_c);
                    var12.a(var12.field_Kb, 44);
                    var12.e((byte) 20);
                    var12.field_Zb = new kc(0L, ml.field_V);
                    var13 = 1;
                    var12.a(var12.field_Zb, 69);
                    break L2;
                  } else {
                    L10: {
                      var12.field_pc[var18_int] = new kc(0L, (kc) null);
                      if ((var14 & 1 << var18_int + fe.field_j) == 0) {
                        break L10;
                      } else {
                        var12.field_ec.a(var12.field_pc[var18_int], 20);
                        break L10;
                      }
                    }
                    var12.field_pc[var18_int].field_gb = 1;
                    var18_int++;
                    continue L8;
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              var12.field_Gb.field_rb = null;
              if (var12.field_Lb) {
                break L11;
              } else {
                break L11;
              }
            }
            var14 = 16777215;
            var46 = var12.field_Gb;
            var12.field_Gb.field_I = 0;
            var46.field_x = 0;
            var12.field_Zb.field_rb = null;
            var47 = var12.field_Zb;
            var12.field_Zb.field_I = 0;
            var47.field_x = 0;
            var12.field_jc.field_rb = null;
            var12.field_jc.field_I = 0;
            var48 = var12.field_jc;
            var12.field_Mb.field_rb = null;
            var48.field_x = 0;
            var12.field_Mb.field_I = 0;
            var18 = var12.field_Mb;
            var12.field_Eb.field_rb = null;
            var18.field_x = 0;
            var19 = var12.field_Eb;
            var12.field_Eb.field_I = 0;
            var12.field_cc.field_rb = null;
            var19.field_x = 0;
            var20 = var12.field_cc;
            var12.field_cc.field_I = 0;
            var20.field_x = 0;
            var12.field_ec.field_rb = null;
            var21 = var12.field_ec;
            var12.field_ec.field_I = 0;
            var21.field_x = 0;
            var22_int = 0;
            L12: while (true) {
              if (vf.field_l <= var22_int) {
                L13: {
                  var12.field_Ub.field_W = null;
                  var12.field_Ub.field_I = 0;
                  var22 = var12.field_Ub;
                  var12.field_Xb.field_W = null;
                  var22.field_x = 0;
                  var12.field_Xb.field_I = 0;
                  var49 = var12.field_Xb;
                  var49.field_x = 0;
                  var12.field_Cb.field_W = null;
                  var24 = var12.field_Cb;
                  var12.field_Cb.field_I = 0;
                  var12.field_Jb.field_W = null;
                  var24.field_x = 0;
                  var12.field_Jb.field_I = 0;
                  var25 = var12.field_Jb;
                  var25.field_x = 0;
                  var12.field_hc.field_rb = null;
                  var12.field_hc.field_I = 0;
                  var26 = var12.field_hc;
                  var12.field_Vb.field_rb = null;
                  var26.field_x = 0;
                  var12.field_Vb.field_I = 0;
                  var27 = var12.field_Vb;
                  var12.field_Ib.field_rb = null;
                  var27.field_x = 0;
                  var28 = var12.field_Ib;
                  var12.field_Ib.field_I = 0;
                  var28.field_x = 0;
                  var12.field_fc.field_rb = null;
                  var12.field_fc.field_I = 0;
                  var29 = var12.field_fc;
                  var12.field_Kb.field_rb = null;
                  var29.field_x = 0;
                  var30 = var12.field_Kb;
                  var12.field_Kb.field_I = 0;
                  var30.field_x = 0;
                  var12.field_x = ee.field_g.field_Cb.field_x;
                  var31 = 0;
                  var32 = var12.field_ic;
                  if (!var12.e(-55)) {
                    L14: {
                      if (var12.field_Lb) {
                        if (var12.field_nc >= 0) {
                          var12.field_Gb.field_rb = nh.field_y;
                          break L14;
                        } else {
                          L15: {
                            if (!var12.field_kc) {
                              break L15;
                            } else {
                              L16: {
                                if (var12.field_Ob) {
                                  break L16;
                                } else {
                                  if (!var12.field_Hb) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var12.field_Zb.field_rb = qn.field_pb;
                              break L14;
                            }
                          }
                          if (2 != var12.field_Fb) {
                            var12.field_Gb.field_rb = kl.field_x;
                            break L14;
                          } else {
                            var12.field_Zb.field_rb = ol.field_b;
                            break L14;
                          }
                        }
                      } else {
                        L17: {
                          if (var12.field_Ob) {
                            break L17;
                          } else {
                            if (var12.field_Hb) {
                              break L17;
                            } else {
                              if (!var12.field_mc) {
                                var12.field_Gb.field_rb = ti.field_C;
                                break L14;
                              } else {
                                var12.field_Gb.field_rb = lo.field_z;
                                break L14;
                              }
                            }
                          }
                        }
                        var12.field_Zb.field_rb = qn.field_pb;
                        break L14;
                      }
                    }
                    L18: {
                      if (var12.field_Zb.field_rb == null) {
                        var12.field_Gb.a(68, 0, var31, ga.field_r, (byte) -120);
                        break L18;
                      } else {
                        var12.field_Zb.a(68, 0, var31, ga.field_r, (byte) -120);
                        break L18;
                      }
                    }
                    L19: {
                      var12.field_jc.field_rb = dj.a(var12.field_jc.field_Z, var32, 78);
                      var12.field_jc.a(78, 70, var31, ga.field_r, (byte) -120);
                      if (!var12.field_jc.field_C) {
                        break L19;
                      } else {
                        if (var12.field_jc.field_rb.equals((Object) (Object) var32)) {
                          break L19;
                        } else {
                          kh.field_c = var32;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var12.field_Mb.field_rb = Integer.toString(var12.field_Rb);
                      if (!var12.field_kc) {
                        var12.field_Mb.field_X = 1;
                        var12.field_Mb.a(48, 150, var31, ga.field_r, (byte) -120);
                        break L20;
                      } else {
                        var12.field_Mb.field_X = 2;
                        var12.field_Eb.field_rb = "/" + var12.field_dc;
                        var33_int = (348 - var12.field_Eb.field_Z.b("/")) / 2;
                        var12.field_Mb.a(-150 + var33_int, 150, var31, ga.field_r, (byte) -120);
                        var12.field_Eb.a(198 - var33_int, var33_int, var31, ga.field_r, (byte) -120);
                        break L20;
                      }
                    }
                    L21: {
                      var12.field_cc.field_rb = Integer.toString(var12.field_Db);
                      var12.field_cc.a(48, 200, var31, ga.field_r, (byte) -120);
                      if (!fc.field_a) {
                        stackOut_64_0 = 200;
                        stackIn_65_0 = stackOut_64_0;
                        break L21;
                      } else {
                        stackOut_63_0 = 250;
                        stackIn_65_0 = stackOut_63_0;
                        break L21;
                      }
                    }
                    L22: {
                      var33_int = stackIn_65_0;
                      var12.field_ec.a(365 + -var33_int - 2, var33_int, var31, ga.field_r, (byte) -120);
                      var34_int = mm.field_p;
                      if ((var14 & 1 << ma.field_U) != 0) {
                        var50_ref = mo.field_b[var12.field_Pb];
                        var12.field_Ub.field_W = var50_ref;
                        var12.field_Ub.a(var50_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                        var34_int = var34_int + (var50_ref.field_n - -mm.field_p);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if ((1 << gn.field_k & var14) != 0) {
                        L24: {
                          if (!var12.field_Ob) {
                            if (var12.field_Hb) {
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
                          var36 = stackIn_75_0;
                          stackOut_75_0 = sk.field_f;
                          stackIn_77_0 = stackOut_75_0;
                          stackIn_76_0 = stackOut_75_0;
                          if (var36 != 0) {
                            stackOut_77_0 = (qb[]) (Object) stackIn_77_0;
                            stackOut_77_1 = 1;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            break L25;
                          } else {
                            stackOut_76_0 = (qb[]) (Object) stackIn_76_0;
                            stackOut_76_1 = 0;
                            stackIn_78_0 = stackOut_76_0;
                            stackIn_78_1 = stackOut_76_1;
                            break L25;
                          }
                        }
                        var51_ref = stackIn_78_0[stackIn_78_1];
                        var12.field_Cb.field_W = var51_ref;
                        var12.field_Cb.a(var51_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                        var34_int = var34_int + (var51_ref.field_n + mm.field_p);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L26: {
                      if ((1 << hb.field_Kb & var14) == 0) {
                        break L26;
                      } else {
                        var52_ref = ec.field_i[var12.field_Fb + -1];
                        var12.field_Jb.field_W = var52_ref;
                        var12.field_Jb.a(var52_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                        var34_int = var34_int + (var52_ref.field_n - -mm.field_p);
                        break L26;
                      }
                    }
                    L27: {
                      if ((var14 & 1 << gm.field_a) != 0) {
                        L28: {
                          stackOut_83_0 = re.field_j;
                          stackIn_85_0 = stackOut_83_0;
                          stackIn_84_0 = stackOut_83_0;
                          if (var12.field_oc) {
                            stackOut_85_0 = (qb[]) (Object) stackIn_85_0;
                            stackOut_85_1 = 1;
                            stackIn_86_0 = stackOut_85_0;
                            stackIn_86_1 = stackOut_85_1;
                            break L28;
                          } else {
                            stackOut_84_0 = (qb[]) (Object) stackIn_84_0;
                            stackOut_84_1 = 0;
                            stackIn_86_0 = stackOut_84_0;
                            stackIn_86_1 = stackOut_84_1;
                            break L28;
                          }
                        }
                        var53_ref = stackIn_86_0[stackIn_86_1];
                        var12.field_Xb.field_W = var53_ref;
                        var12.field_Xb.a(var53_ref.field_n, var34_int, 0, var12.field_ec.field_I, (byte) -120);
                        var34_int = var34_int + (var53_ref.field_n - -mm.field_p);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L29: {
                      if (null == nk.field_m) {
                        break L29;
                      } else {
                        var36 = 0;
                        L30: while (true) {
                          if (var36 >= vf.field_l) {
                            break L29;
                          } else {
                            L31: {
                              if (nk.field_m[var36] == null) {
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            var36++;
                            continue L30;
                          }
                        }
                      }
                    }
                    L32: {
                      var36 = (-var34_int + var12.field_ec.field_x) / 2;
                      if (0 < var36) {
                        var12.field_Ub.field_T = var12.field_Ub.field_T + var36;
                        var12.field_Cb.field_T = var12.field_Cb.field_T + var36;
                        var12.field_Jb.field_T = var12.field_Jb.field_T + var36;
                        var12.field_Xb.field_T = var12.field_Xb.field_T + var36;
                        var37_int = 0;
                        L33: while (true) {
                          if (var37_int >= vf.field_l) {
                            break L32;
                          } else {
                            var12.field_pc[var37_int].field_T = var12.field_pc[var37_int].field_T + var36;
                            var37_int++;
                            continue L33;
                          }
                        }
                      } else {
                        break L32;
                      }
                    }
                    L34: {
                      if (!var12.field_Lb) {
                        break L34;
                      } else {
                        L35: {
                          var37_int = var12.field_nc;
                          if (0 <= var37_int) {
                            break L35;
                          } else {
                            var37_int = (int)(-var12.field_Yb + var9);
                            break L35;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 >= 60) {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_hc.field_rb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        } else {
                          var12.field_hc.field_rb = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        }
                      }
                    }
                    L36: {
                      var12.field_hc.a(-365 + var12.field_x, 365, var31, ga.field_r, (byte) -120);
                      var31 = var31 + ga.field_r;
                      if (var12.field_Qb != null) {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(ad.field_a);
                        StringBuilder discarded$5 = var37.append(var12.field_Qb[0]);
                        var38_int = 1;
                        L37: while (true) {
                          if (var12.field_Rb <= var38_int) {
                            var38 = var37.toString();
                            var12.field_Vb.field_rb = var38;
                            var39 = var12.field_Vb.field_Z.a(var38, var12.field_x - 2 * var12.field_Vb.field_t);
                            var12.field_Vb.a(var12.field_x, 0, var31, var39 * ga.field_r, (byte) -120);
                            var31 = var31 + ga.field_r * var39;
                            break L36;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_Qb[var38_int]);
                            var38_int++;
                            continue L37;
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                    L38: {
                      if (var12.field_Hb) {
                        var12.field_Ib.field_rb = tj.a(127, new String[1], dk.field_i);
                        var12.field_Ib.a(var12.field_x + -(dh.field_Gb * 2), dh.field_Gb, var31, ga.field_r, (byte) -120);
                        var31 = var31 + ga.field_r;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    if (!var12.field_Nb) {
                      break L13;
                    } else {
                      var12.field_fc.field_rb = tj.a(121, new String[1], fh.field_f);
                      var12.field_fc.a(-(2 * dh.field_Gb) + var12.field_x, dh.field_Gb, var31, ga.field_r, (byte) -120);
                      var31 = var31 + ga.field_r;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L39: {
                  var33 = vf.a(-111, var32, var12.field_ac);
                  if (var33 != null) {
                    var34_int = var12.field_Kb.field_Z.a(var33, -dh.field_Gb + -dh.field_Gb + var12.field_x);
                    var12.field_Kb.field_u = 256 * var12.field_bc / vd.field_i;
                    var12.field_Kb.field_rb = var33;
                    var12.field_Kb.a(var12.field_x - 2 * dh.field_Gb, dh.field_Gb, var31, var34_int * ga.field_r, (byte) -120);
                    var31 = var31 + var34_int * ga.field_r;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (var7_int != 0) {
                    break L40;
                  } else {
                    var12.field_B = var31 + -var12.field_I;
                    break L40;
                  }
                }
                L41: {
                  if (var13 == 0) {
                    break L41;
                  } else {
                    ee.field_g.field_Cb.a((byte) 124, (kc) var11, (kc) (Object) var12, 2);
                    break L41;
                  }
                }
                var34_int = 0;
                L42: while (true) {
                  if (var34_int >= vf.field_l) {
                    L43: {
                      if (!var12.field_Ub.field_C) {
                        break L43;
                      } else {
                        L44: {
                          if (var12.field_Pb == 1) {
                            var34 = n.field_c;
                            break L44;
                          } else {
                            var34 = vm.field_c[var12.field_Pb];
                            break L44;
                          }
                        }
                        kh.field_c = on.field_a + " - " + var34;
                        break L43;
                      }
                    }
                    L45: {
                      if (var12.field_Xb.field_C) {
                        L46: {
                          if (var12.field_oc) {
                            stackOut_142_0 = ri.field_c;
                            stackIn_143_0 = stackOut_142_0;
                            break L46;
                          } else {
                            stackOut_141_0 = n.field_h;
                            stackIn_143_0 = stackOut_141_0;
                            break L46;
                          }
                        }
                        kh.field_c = stackIn_143_0;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (var12.field_Cb.field_C) {
                        L48: {
                          L49: {
                            if (var12.field_Ob) {
                              break L49;
                            } else {
                              if (var12.field_Hb) {
                                break L49;
                              } else {
                                if (!var12.field_kc) {
                                  stackOut_150_0 = pc.field_c;
                                  stackIn_152_0 = stackOut_150_0;
                                  break L48;
                                } else {
                                  stackOut_149_0 = fi.field_g;
                                  stackIn_152_0 = stackOut_149_0;
                                  break L48;
                                }
                              }
                            }
                          }
                          stackOut_151_0 = qo.field_g;
                          stackIn_152_0 = stackOut_151_0;
                          break L48;
                        }
                        kh.field_c = stackIn_152_0;
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    L50: {
                      if (!var12.field_Jb.field_C) {
                        break L50;
                      } else {
                        L51: {
                          if (2 == var12.field_Fb) {
                            stackOut_156_0 = sk.field_d;
                            stackIn_157_0 = stackOut_156_0;
                            break L51;
                          } else {
                            stackOut_155_0 = bh.field_d;
                            stackIn_157_0 = stackOut_155_0;
                            break L51;
                          }
                        }
                        kh.field_c = stackIn_157_0;
                        break L50;
                      }
                    }
                    L52: {
                      if (0 == var12.field_U) {
                        break L52;
                      } else {
                        if (!var12.e(-125)) {
                          if (0 == var12.field_Zb.field_U) {
                            je.a(949002930, var12, var32, true);
                            break L52;
                          } else {
                            L53: {
                              if (!var12.field_Lb) {
                                break L53;
                              } else {
                                L54: {
                                  if (!var12.field_kc) {
                                    break L54;
                                  } else {
                                    if (var12.field_Ob) {
                                      break L53;
                                    } else {
                                      if (!var12.field_Hb) {
                                        break L54;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                qe.a(var12.h((byte) 78), (byte) -35, param0);
                                break L52;
                              }
                            }
                            uj.a(var12.h((byte) 76), (byte) -122, param0);
                            break L52;
                          }
                        } else {
                          var12 = (na) (Object) var8.a(0);
                          continue L1;
                        }
                      }
                    }
                    var12 = (na) (Object) var8.a(0);
                    continue L1;
                  } else {
                    L55: {
                      if (!var12.field_pc[var34_int].field_C) {
                        break L55;
                      } else {
                        L56: {
                          if (null != qa.field_o) {
                            if (null != qa.field_o[var34_int]) {
                              var35_ref = qa.field_o[var34_int][var12.field_Wb[var34_int] & 255];
                              break L56;
                            } else {
                              var35_ref = null;
                              break L56;
                            }
                          } else {
                            var35_ref = null;
                            break L56;
                          }
                        }
                        if (var35_ref != null) {
                          kh.field_c = ob.field_bb[var34_int] + " - " + var35_ref;
                          break L55;
                        } else {
                          kh.field_c = ob.field_bb[var34_int];
                          break L55;
                        }
                      }
                    }
                    var34_int++;
                    continue L42;
                  }
                }
              } else {
                var12.field_pc[var22_int].field_W = null;
                var23 = var12.field_pc[var22_int];
                var12.field_pc[var22_int].field_I = 0;
                var23.field_x = 0;
                var22_int++;
                continue L12;
              }
            }
          }
        }
    }

    final boolean e(int param0) {
        if (!(((pe) this).field_Cb == -2)) {
            return false;
        }
        if (!(vn.field_d != 13)) {
            ((pe) this).field_Cb = -1;
        }
        if (param0 != -22632) {
            ((pe) this).field_Hb = null;
            return true;
        }
        return true;
    }

    final static boolean a(int param0, int param1, byte param2, int param3) {
        if (null != eo.field_c) {
            if (!(!eo.field_c.b((byte) 49))) {
                oc.a(false);
                return true;
            }
        }
        if (db.field_a != null) {
            if (db.field_a.i((byte) 2)) {
                db.field_a = null;
                oc.a(false);
                return true;
            }
        }
        if (!(!lo.e(false))) {
            return true;
        }
        if (eh.a(false, param1, param3, param0)) {
            return true;
        }
        if (param2 <= 25) {
            Object var5 = null;
            pe.a(6, (nf) null, (byte) -73, -25, -95, (qb) null, (ll) null);
        }
        return false;
    }

    final static ho e(boolean param0) {
        if (!(in.field_Gb != uj.field_h)) {
            throw new IllegalStateException();
        }
        if (!(pa.field_g != in.field_Gb)) {
            in.field_Gb = uj.field_h;
            return i.field_i;
        }
        pe.g(-113);
        return null;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        ((pe) this).b(param1, (byte) 73);
        if (!param1) {
            return -2;
        }
        if (param0 != -1) {
            Object var5 = null;
            ((pe) this).a((byte) -81, 76, (qb) null, (String) null);
        }
        for (var3 = 0; ((pe) this).field_Kb > var3; var3++) {
            if (0 != ((pe) this).field_Ob[var3].field_U) {
                return ((pe) this).field_Pb[var3];
            }
        }
        if (!(re.field_r == 0)) {
            return -1;
        }
        return ((pe) this).field_Cb;
    }

    final static void h(int param0) {
    }

    final static void a(int param0, nf param1, byte param2, int param3, int param4, qb param5, ll param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              param0 = param0 >> 1;
              param3 = param3 >> 1;
              var7_int = param5.field_q >> 1;
              param0 = param0 + param5.field_x / 2;
              var8 = param5.field_y >> 1;
              param3 = param3 + param5.field_o / 2;
              var9 = 0;
              var10 = 0;
              var11 = param1.field_hb;
              var12 = param1.field_Hb;
              if (var9 > param0) {
                stackOut_3_0 = -param0 + var9 << 1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var13 = stackIn_4_0;
            if (param4 == 21374) {
              L2: {
                if (param0 + var7_int > var11) {
                  stackOut_8_0 = -2 + (var11 - param0 << 1);
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = -2 + param5.field_q;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var14 = stackIn_9_0;
                if (var10 > param3) {
                  stackOut_11_0 = var10 + -param3 << 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L3;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  break L3;
                }
              }
              L4: {
                var15 = stackIn_12_0;
                if (~var12 <= ~(param3 + var8)) {
                  stackOut_14_0 = -2 + param5.field_y;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = (-param3 + var12 << 1) + -2;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              }
              var16 = stackIn_15_0;
              var28 = new int[4];
              var27 = var28;
              var26 = var27;
              var25 = var26;
              var17 = var25;
              var19 = var15;
              L5: while (true) {
                if (~var16 > ~var19) {
                  break L0;
                } else {
                  var20 = var13;
                  L6: while (true) {
                    if (var14 < var20) {
                      var19 += 2;
                      continue L5;
                    } else {
                      var21 = var20 + var19 * param5.field_q;
                      var22 = (param3 + (var19 >> 1)) * param1.field_hb - (-param0 - (var20 >> 1));
                      var17[0] = dg.a(param5.field_A[var21], 255);
                      var17[1] = dg.a(param5.field_A[1 + var21], 255);
                      var17[2] = dg.a(param5.field_A[param5.field_q + var21], 255);
                      var17[3] = dg.a(255, param5.field_A[1 + var21 - -param5.field_q]);
                      var18 = param6.field_m[var22];
                      var23 = 0;
                      L7: while (true) {
                        if (var23 >= 4) {
                          param6.field_m[var22] = (byte)var18;
                          var20 += 2;
                          continue L6;
                        } else {
                          L8: {
                            if (var28[var23] == 0) {
                              break L8;
                            } else {
                              var18 = param2;
                              break L8;
                            }
                          }
                          var23++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var7;
            stackOut_27_1 = new StringBuilder().append("pe.A(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param6 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    final static kc f(int param0) {
        return dd.field_c.field_Eb;
    }

    final void a(int param0, String param1, byte param2) {
        try {
            ((pe) this).field_Ob[((pe) this).field_Kb] = new nl(0L, (kc) null, (kc) null, ((pe) this).field_Hb, (qb) null, param1);
            ((pe) this).field_Ob[((pe) this).field_Kb].field_Ab = ((pe) this).field_Rb;
            if (param2 != -26) {
                boolean discarded$0 = pe.a((byte) 5, 119);
            }
            ((pe) this).field_Ob[((pe) this).field_Kb].field_yb = true;
            ((pe) this).field_Ob[((pe) this).field_Kb].field_gb = 1;
            ((pe) this).a((kc) (Object) ((pe) this).field_Ob[((pe) this).field_Kb], 69);
            ((pe) this).field_Pb[((pe) this).field_Kb] = param0;
            ((pe) this).field_Kb = ((pe) this).field_Kb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pe.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void g(int param0) {
        field_Nb = null;
        field_Fb = null;
        field_Db = null;
        field_Lb = null;
        field_Ib = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if (((pe) this).field_Kb == 0) {
            ((pe) this).field_Ob[((pe) this).field_Kb] = new nl(0L, (kc) null, (kc) null, ((pe) this).field_Qb, (qb) null, db.field_c);
            ((pe) this).field_Ob[((pe) this).field_Kb].field_gb = 1;
            ((pe) this).a((kc) (Object) ((pe) this).field_Ob[((pe) this).field_Kb], 97);
            ((pe) this).field_Pb[((pe) this).field_Kb] = -1;
            ((pe) this).field_Kb = ((pe) this).field_Kb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((pe) this).field_Kb <= var7) {
            var6 = var6 + 2 * ((pe) this).field_Bb;
            var7 = ((pe) this).field_Kb * ((pe) this).field_Mb + ((pe) this).field_Sb - -((pe) this).field_Sb;
            if (param2 == -29466) {
              var8 = ih.a(param4, var6, param0, 246);
              var9 = ql.a(10, param1, var7, param3);
              ((pe) this).a(var6, var8, var9, var7, (byte) -120);
              var10 = 0;
              L2: while (true) {
                if (var10 >= ((pe) this).field_Kb) {
                  return;
                } else {
                  ((pe) this).field_Ob[var10].a(((pe) this).field_Gb, 0, ((pe) this).field_Mb, -(2 * ((pe) this).field_Bb) + var6, ((pe) this).field_Bb, ((pe) this).field_Mb * var10 + ((pe) this).field_Sb, ((pe) this).field_Eb);
                  var10++;
                  continue L2;
                }
              }
            } else {
              return;
            }
          } else {
            var8 = ((pe) this).field_Ob[var7].a(((pe) this).field_Eb, ((pe) this).field_Gb, -74);
            if (var6 < var8) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    pe(kc param0, qb[] param1, kc param2, kc param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((pe) this).field_Ob = new nl[256];
        ((pe) this).field_Pb = new int[256];
        ((pe) this).field_Cb = -2;
        try {
            ((pe) this).field_Gb = param5;
            ((pe) this).field_Rb = param1;
            ((pe) this).field_Hb = param3;
            ((pe) this).field_Bb = param4;
            ((pe) this).field_Sb = param7;
            ((pe) this).field_Qb = param2;
            ((pe) this).field_Mb = param8;
            ((pe) this).field_Eb = param6;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(byte param0, int param1, qb param2, String param3) {
        try {
            ((pe) this).field_Ob[((pe) this).field_Kb] = new nl(0L, (kc) null, (kc) null, ((pe) this).field_Hb, param2, param3);
            ((pe) this).field_Ob[((pe) this).field_Kb].field_Ab = ((pe) this).field_Rb;
            ((pe) this).field_Ob[((pe) this).field_Kb].field_yb = true;
            ((pe) this).field_Ob[((pe) this).field_Kb].field_gb = 1;
            ((pe) this).a((kc) (Object) ((pe) this).field_Ob[((pe) this).field_Kb], param0 + 103);
            if (param0 != -32) {
                field_Db = null;
            }
            ((pe) this).field_Pb[((pe) this).field_Kb] = param1;
            ((pe) this).field_Kb = ((pe) this).field_Kb + 1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "pe.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    pe(pe param0) {
        this((kc) (Object) param0, param0.field_Rb, param0.field_Qb, param0.field_Hb, param0.field_Bb, param0.field_Gb, param0.field_Eb, param0.field_Sb, param0.field_Mb);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Lb = new vn();
        field_Db = new am();
        field_Nb = "Accept draw";
    }
}
