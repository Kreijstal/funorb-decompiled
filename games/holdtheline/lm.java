/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class lm {
    static String field_c;
    static int field_a;
    lf[] field_b;
    static int[] field_d;

    final static vk a(byte[] param0, byte param1) throws IOException {
        vk stackIn_15_0 = null;
        vk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        dd stackIn_28_0;
        dd stackIn_28_1;
        qm stackIn_28_2;
        qm stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        int stackIn_28_7;
        int stackIn_28_8;
        int stackIn_28_9;
        int stackIn_28_10;
        int stackIn_28_11;
        int stackIn_28_12;
        int stackIn_28_13;
        int stackIn_28_14;
        dd stackIn_29_0 = null;
        dd stackIn_29_1 = null;
        qm stackIn_29_2 = null;
        qm stackIn_29_3 = null;
        int stackIn_29_4 = 0;
        int stackIn_29_5 = 0;
        int stackIn_29_6 = 0;
        int stackIn_29_7 = 0;
        int stackIn_29_8 = 0;
        int stackIn_29_9 = 0;
        int stackIn_29_10 = 0;
        int stackIn_29_11 = 0;
        int stackIn_29_12 = 0;
        int stackIn_29_13 = 0;
        int stackIn_29_14 = 0;
        int stackIn_29_15 = 0;
        int stackIn_32_16 = 0;
        int stackIn_35_17 = 0;
        int stackIn_38_18 = 0;
        int stackIn_41_19 = 0;
        int stackIn_44_20 = 0;
        hn stackIn_46_0;
        hn stackIn_46_1;
        qm stackIn_46_2;
        int stackIn_46_3;
        float stackIn_46_4;
        float stackIn_46_5;
        int stackIn_46_6;
        int stackIn_46_7;
        int stackIn_46_8;
        int stackIn_46_9;
        int stackIn_46_10;
        Object stackIn_46_11;
        Object stackIn_46_12;
        qm stackIn_46_13;
        hn stackIn_47_0 = null;
        hn stackIn_47_1 = null;
        qm stackIn_47_2 = null;
        int stackIn_47_3 = 0;
        float stackIn_47_4 = 0.0f;
        float stackIn_47_5 = 0.0f;
        int stackIn_47_6 = 0;
        int stackIn_47_7 = 0;
        int stackIn_47_8 = 0;
        int stackIn_47_9 = 0;
        int stackIn_47_10 = 0;
        Object stackIn_47_11 = null;
        Object stackIn_47_12 = null;
        qm stackIn_47_13 = null;
        int stackIn_47_14 = 0;
        int stackIn_50_15 = 0;
        int stackIn_53_16 = 0;
        int stackIn_56_17 = 0;
        int stackIn_59_18 = 0;
        int stackIn_62_19;
        dd stackIn_65_0;
        dd stackIn_65_1;
        qm stackIn_65_2;
        qm stackIn_65_3;
        int stackIn_65_4;
        int stackIn_65_5;
        int stackIn_65_6;
        int stackIn_65_7;
        int stackIn_65_8;
        int stackIn_65_9;
        int stackIn_65_10;
        int stackIn_65_11;
        int stackIn_65_12;
        int stackIn_65_13;
        int stackIn_65_14;
        dd stackIn_66_0 = null;
        dd stackIn_66_1 = null;
        qm stackIn_66_2 = null;
        qm stackIn_66_3 = null;
        int stackIn_66_4 = 0;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        int stackIn_66_8 = 0;
        int stackIn_66_9 = 0;
        int stackIn_66_10 = 0;
        int stackIn_66_11 = 0;
        int stackIn_66_12 = 0;
        int stackIn_66_13 = 0;
        int stackIn_66_14 = 0;
        int stackIn_66_15 = 0;
        int stackIn_69_16 = 0;
        int stackIn_72_17 = 0;
        int stackIn_75_18 = 0;
        int stackIn_78_19 = 0;
        int stackIn_81_20 = 0;
        float stackIn_84_0 = 0.0f;
        float stackIn_95_0 = 0.0f;
        Object stackIn_98_0 = null;
        vk stackIn_129_0 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        String stackIn_133_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        th var3 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        char[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ei var18 = null;
        qm var19 = null;
        qm var20 = null;
        qm var22 = null;
        Object var23 = null;
        hn var23_ref = null;
        int var23_int = 0;
        int[] var24 = null;
        float var25 = 0.0f;
        int var26 = 0;
        float var26_float = 0.0f;
        int var27 = 0;
        qm var27_ref_qm = null;
        int var28 = 0;
        hn var28_ref_hn = null;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        float var34 = 0.0f;
        float var35 = 0.0f;
        Object var36 = null;
        Object var37_ref = null;
        dd var37_ref_dd = null;
        int var37 = 0;
        Object var38_ref = null;
        int var38 = 0;
        hn var38_ref_hn = null;
        Object var39_ref = null;
        int var39 = 0;
        hn var39_ref_hn = null;
        int var44_int = 0;
        qm var44 = null;
        int var45 = 0;
        float var46 = 0.0f;
        wm var47 = null;
        int var48 = 0;
        int var49 = 0;
        na var50 = null;
        int var51 = 0;
        qm var52 = null;
        int[] var53 = null;
        Object var54 = null;
        vk var57 = null;
        char[] var58 = null;
        dd var59 = null;
        dd var60 = null;
        Object var61 = null;
        hn var61_ref = null;
        ei var62 = null;
        ei var63 = null;
        ei var64 = null;
        ei var65 = null;
        ei var66 = null;
        ei var67 = null;
        ei var68 = null;
        ei var69 = null;
        char[] var72 = null;
        byte[] var75 = null;
        byte[] var76 = null;
        dd var77 = null;
        var54 = null;
        var23 = null;
        var61 = null;
        var37_ref = null;
        var38_ref = null;
        var39_ref = null;
        var51 = HoldTheLine.field_D;
        try {
          L0: {
            ti.c(false);
            var57 = new vk(param0);
            var3 = new th(param0);
            var75 = new byte[ho.field_m.length];
            var3.a(ho.field_m.length, 0, (byte) 113, var75);
            if (!nd.a(ho.field_m, 0, var75)) {
              throw new IOException("Invalid file format!");
            } else {
              L1: {
                var76 = new byte[rh.field_a.length];
                var3.a(rh.field_a.length, 0, (byte) 75, var76);
                if (nd.a(bi.field_b, 0, var76)) {
                  var6 = 0;
                  break L1;
                } else {
                  if (nd.a(nc.field_e, 0, var76)) {
                    var6 = 1;
                    break L1;
                  } else {
                    throw new IOException("Invalid file version!");
                  }
                }
              }
              L2: {
                var57.field_v = (byte)var3.f((byte) -83);
                var57.field_o = var57.field_v & 7;
                stackIn_15_0 = (vk) (var57);

                if (var57.field_o == 0) {
                  stackIn_16_0 = (vk) ((Object) stackIn_15_0);
                  stackIn_16_1 = 0;
                  break L2;
                } else {


                  if ((var57.field_o ^ -1) > -4) {
                    stackIn_16_0 = (vk) ((Object) stackIn_15_0);
                    stackIn_16_1 = 1;
                    break L2;
                  } else {


                    if (var57.field_o >= 6) {
                      stackIn_16_0 = (vk) ((Object) stackIn_15_0);
                      stackIn_16_1 = 3;
                      break L2;
                    } else {
                      stackIn_16_0 = (vk) ((Object) stackIn_15_0);
                      stackIn_16_1 = 2;
                      break L2;
                    }
                  }
                }
              }
              L3: {
                stackIn_16_0.field_p = stackIn_16_1;
                var7 = var3.f((byte) -44);
                if (param1 >= 107) {
                  break L3;
                } else {
                  field_d = (int[]) null;
                  break L3;
                }
              }
              L4: {
                var8 = var3.f((byte) -109);
                var9 = 0;
                var10 = 0;
                if (var6 != 0) {
                  var9 = var3.f((byte) -19);
                  var10 = var3.f((byte) -33);
                  break L4;
                } else {
                  break L4;
                }
              }
              var11 = var3.f((byte) -26);
              var72 = new char[var7];
              var58 = var72;
              var12 = var58;
              var13 = 0;
              L5: while (true) {
                if (var7 <= var13) {
                  var57.field_b = new String(var72);
                  var18 = new ei();
                  var13 = 0;
                  L6: while (true) {
                    if (var13 >= var8) {
                      L7: {
                        var19 = new qm(var3.h(-14232), var3.h(-14232));
                        var20 = new qm(var3.h(-14232), var3.h(-14232));
                        var14 = var3.f(0);
                        var15 = var3.f((byte) -101);
                        var16 = var3.f(0);
                        var17 = var3.f(0);
                        stackIn_65_0 = null;

                        stackIn_65_1 = null;

                        stackIn_65_2 = (qm) (var19);

                        stackIn_65_3 = (qm) (var20);

                        stackIn_65_4 = var14;

                        stackIn_65_5 = 0;

                        stackIn_65_6 = 0;

                        stackIn_65_7 = 0;

                        stackIn_65_8 = 0;

                        stackIn_65_9 = 0;

                        stackIn_65_10 = 0;

                        stackIn_65_11 = 0;

                        stackIn_65_12 = 0;

                        stackIn_65_13 = var16;

                        stackIn_65_14 = var17;

                        if (-1 == (2 & var15 ^ -1)) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_65_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_65_3);
                          stackIn_66_4 = stackIn_65_4;
                          stackIn_66_5 = stackIn_65_5;
                          stackIn_66_6 = stackIn_65_6;
                          stackIn_66_7 = stackIn_65_7;
                          stackIn_66_8 = stackIn_65_8;
                          stackIn_66_9 = stackIn_65_9;
                          stackIn_66_10 = stackIn_65_10;
                          stackIn_66_11 = stackIn_65_11;
                          stackIn_66_12 = stackIn_65_12;
                          stackIn_66_13 = stackIn_65_13;
                          stackIn_66_14 = stackIn_65_14;
                          stackIn_66_15 = 0;
                          break L7;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_65_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_65_3);
                          stackIn_66_4 = stackIn_65_4;
                          stackIn_66_5 = stackIn_65_5;
                          stackIn_66_6 = stackIn_65_6;
                          stackIn_66_7 = stackIn_65_7;
                          stackIn_66_8 = stackIn_65_8;
                          stackIn_66_9 = stackIn_65_9;
                          stackIn_66_10 = stackIn_65_10;
                          stackIn_66_11 = stackIn_65_11;
                          stackIn_66_12 = stackIn_65_12;
                          stackIn_66_13 = stackIn_65_13;
                          stackIn_66_14 = stackIn_65_14;
                          stackIn_66_15 = 1;
                          break L7;
                        }
                      }
                      L8: {
































                        if ((4 & var15) == 0) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);












                          stackIn_69_16 = 0;
                          break L8;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);












                          stackIn_69_16 = 1;
                          break L8;
                        }
                      }
                      L9: {


































                        if ((1 & var15) == 0) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);













                          stackIn_72_17 = 0;
                          break L9;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);













                          stackIn_72_17 = 1;
                          break L9;
                        }
                      }
                      L10: {




































                        if (-1 == (var15 & 8 ^ -1)) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);














                          stackIn_75_18 = 0;
                          break L10;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);














                          stackIn_75_18 = 1;
                          break L10;
                        }
                      }
                      L11: {






































                        if ((var15 & 16) == 0) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);















                          stackIn_78_19 = 0;
                          break L11;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);















                          stackIn_78_19 = 1;
                          break L11;
                        }
                      }
                      L12: {








































                        if (0 == (32 & var15)) {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);
















                          stackIn_81_20 = 0;
                          break L12;
                        } else {
                          stackIn_66_0 = null;
                          stackIn_66_1 = null;
                          stackIn_66_2 = (qm) ((Object) stackIn_66_2);
                          stackIn_66_3 = (qm) ((Object) stackIn_66_3);
















                          stackIn_81_20 = 1;
                          break L12;
                        }
                      }
                      L13: {
                        var60 = new dd(stackIn_66_2, stackIn_66_3, stackIn_66_4, stackIn_66_5, stackIn_66_6, stackIn_66_7, stackIn_66_8, stackIn_66_9, stackIn_66_10, stackIn_66_11, stackIn_66_12, stackIn_66_13, stackIn_66_14, stackIn_66_15 != 0, stackIn_69_16 != 0, stackIn_72_17 != 0, stackIn_75_18 != 0, stackIn_78_19 != 0, stackIn_81_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                        var77 = (dd) (var18.field_b[0]);
                        var23_ref = (hn) (var18.field_b[1]);
                        var61_ref = (hn) (var18.field_b[var18.field_e - 1]);
                        var18.a(var60, (byte) 6);
                        var25 = var60.f(50) / (var60.f(50) + var77.f(50));
                        var26 = var61_ref.field_N;
                        var27 = var23_ref.field_N;
                        var28 = var61_ref.field_P;
                        var29 = var23_ref.field_P;
                        var30 = var61_ref.field_B;
                        var31 = var23_ref.field_B;
                        var32 = var61_ref.field_L;
                        var33 = var23_ref.field_L;
                        var34 = (float)(3.141592653589793 * (double)var25);
                        if (var23_ref.field_E < var23_ref.field_I) {
                          stackIn_84_0 = var23_ref.field_E;
                          break L13;
                        } else {
                          stackIn_84_0 = 3.1415927410125732f + var23_ref.field_E;
                          break L13;
                        }
                      }
                      var35 = stackIn_84_0;
                      var77.field_G = var34;
                      var60.field_z = var61_ref.field_L;
                      var13 = 0;
                      var60.field_I = var61_ref.field_B;
                      var60.field_y = var34;
                      var60.field_O = var61_ref.field_N;
                      var60.field_K = var61_ref.field_P;
                      var36 = null;
                      L14: while (true) {
                        L15: {
                          L16: {
                            var37_ref_dd = (dd) (var18.field_b[var13]);
                            var37_ref_dd.b(58, var35);
                            if (var37_ref_dd.field_P.field_h != var37_ref_dd.field_R.field_h) {
                              break L16;
                            } else {
                              if ((var37_ref_dd.field_R.field_f ^ -1) != (var37_ref_dd.field_P.field_f ^ -1)) {
                                break L16;
                              } else {
                                var18.a(true, var13);
                                break L15;
                              }
                            }
                          }
                          var13++;
                          var37_ref_dd.field_O = var26;
                          var37_ref_dd.field_C = var31;
                          var37_ref_dd.field_L = var29;
                          var37_ref_dd.field_N = var27;
                          var37_ref_dd.field_z = var32;
                          var37_ref_dd.field_K = var28;
                          var37_ref_dd.field_I = var30;
                          var37_ref_dd.field_A = var33;
                          break L15;
                        }
                        L17: {
                          if (var36 == null) {
                            break L17;
                          } else {
                            ((hn) (var36)).field_Q = var37_ref_dd.p(-1);
                            break L17;
                          }
                        }
                        if (var13 >= var18.field_e) {
                          var57.field_u = new wd[var18.field_e];
                          var13 = 0;
                          L18: while (true) {
                            if (var13 >= var18.field_e) {
                              var37 = var57.field_u[-1 + var57.field_u.length].field_k;
                              var38 = var57.field_u[0].field_k;
                              var13 = 0;
                              L19: while (true) {
                                if (var13 >= var57.field_u.length) {
                                  L20: {
                                    var57.field_e = new ei();
                                    var64 = new ei();
                                    var62 = new ei();
                                    var65 = new ei();
                                    var63 = new ei();
                                    lf.a(var62, var63, var64, var57.field_e, var57.field_u, var65, -68);
                                    var57.field_e = mk.a(var57.field_e, (byte) -127);
                                    var67 = mk.a(var64, (byte) -127);
                                    var69 = mk.a(var65, (byte) -127);
                                    var66 = mk.a(var62, (byte) -127);
                                    var68 = mk.a(var63, (byte) -127);
                                    var57.field_c = ao.a(var66, (byte) 21, false, var67);
                                    var57.field_t = ao.a(var68, (byte) 21, false, var69);
                                    if (var6 == 0) {
                                      break L20;
                                    } else {
                                      var44_int = var10 * 8 + var9 * 3;
                                      var3.a(var44_int, 0, (byte) 84, new byte[var44_int]);
                                      break L20;
                                    }
                                  }
                                  var13 = 0;
                                  L21: while (true) {
                                    if (var13 >= var11) {
                                      stackIn_129_0 = (vk) (var57);
                                      break L0;
                                    } else {
                                      L22: {
                                        var44 = new qm(var3.h(-14232), var3.h(-14232));
                                        var45 = var3.f((byte) -27);
                                        var46 = (float)(3.141592653589793 * (double)var3.f((byte) -55) / 128.0);
                                        var14 = var3.f(0);
                                        if (var45 < 5) {
                                          break L22;
                                        } else {
                                          if (-9 > (var45 ^ -1)) {
                                            break L22;
                                          } else {
                                            var13++;
                                            continue L21;
                                          }
                                        }
                                      }
                                      L23: {
                                        L24: {
                                          if ((var45 ^ -1) > -63) {
                                            break L24;
                                          } else {
                                            if (-70 > (var45 ^ -1)) {
                                              break L24;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L25: {
                                          var47 = new wm(var44, var45, var14, var46, 0.0f, 0.0f);
                                          if ((32768 & var47.field_J) == 0) {
                                            var57.field_k.a((byte) -88, var47);
                                            break L25;
                                          } else {
                                            var57.field_m.a((byte) -103, var47);
                                            break L25;
                                          }
                                        }
                                        if ((var45 ^ -1) == -54) {
                                          var48 = var44.field_h + -(int)(Math.sin((double)var46) * 10.0);
                                          var49 = var44.field_f + -(int)(10.0 * Math.cos((double)var46));
                                          var50 = new na(var48, var49, var14, 60, de.field_Q);
                                          var57.field_x.a((byte) -78, var50);
                                          break L23;
                                        } else {
                                          if (-55 == (var45 ^ -1)) {
                                            var48 = var44.field_h - (int)(35.0 * Math.sin((double)var46));
                                            var49 = var44.field_f + -(int)(35.0 * Math.cos((double)var46));
                                            var50 = new na(var48, var49, var14, 60, de.field_Q);
                                            var57.field_x.a((byte) -99, var50);
                                            var48 = var44.field_h - -(int)(35.0 * Math.sin((double)var46));
                                            var49 = var44.field_f + (int)(35.0 * Math.cos((double)var46));
                                            var50 = new na(var48, var49, var14, 60, de.field_Q);
                                            var57.field_x.a((byte) -114, var50);
                                            break L23;
                                          } else {
                                            break L23;
                                          }
                                        }
                                      }
                                      var13++;
                                      continue L21;
                                    }
                                  }
                                } else {
                                  L26: {
                                    var39 = var57.field_u[(1 + var13) % var57.field_u.length].field_k;
                                    if (0 == var38) {
                                      var57.field_u[var13].field_o = (float)(var39 - var37) / var57.field_u[var13].f(50);
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  var37 = var38;
                                  var38 = var39;
                                  var13++;
                                  continue L19;
                                }
                              }
                            } else {
                              var57.field_u[var13] = (wd) (var18.field_b[var13]);
                              var13++;
                              continue L18;
                            }
                          }
                        } else {
                          L27: {
                            var38_ref_hn = (hn) (var18.field_b[var13]);
                            var38_ref_hn.field_F = var37_ref_dd.b((byte) -77);
                            var13++;
                            if (var38_ref_hn.field_E >= var38_ref_hn.field_I) {
                              stackIn_95_0 = 3.1415927410125732f + var38_ref_hn.field_I;
                              break L27;
                            } else {
                              stackIn_95_0 = var38_ref_hn.field_I;
                              break L27;
                            }
                          }
                          L28: {
                            var35 = stackIn_95_0;
                            if (-1 + var18.field_e <= var13) {
                              stackIn_98_0 = (hn) (var23_ref);
                              break L28;
                            } else {
                              stackIn_98_0 = var18.field_b[var13 + 1];
                              break L28;
                            }
                          }
                          var39_ref_hn = (hn) ((Object) stackIn_98_0);
                          var26 = var27;
                          var28 = var29;
                          var27 = var39_ref_hn.field_N;
                          var30 = var31;
                          var29 = var39_ref_hn.field_P;
                          var32 = var33;
                          var31 = var39_ref_hn.field_B;
                          var33 = var39_ref_hn.field_L;
                          var36 = var38_ref_hn;
                          continue L14;
                        }
                      }
                    } else {
                      L29: {
                        var19 = new qm(var3.k(-48), var3.k(-128));
                        var20 = new qm(var3.k(-114), var3.k(71));
                        var14 = var3.f(0);
                        var15 = var3.f((byte) -19);
                        var16 = var3.f(0);
                        var17 = var3.f(0);
                        stackIn_28_0 = null;

                        stackIn_28_1 = null;

                        stackIn_28_2 = (qm) (var19);

                        stackIn_28_3 = (qm) (var20);

                        stackIn_28_4 = var14;

                        stackIn_28_5 = 0;

                        stackIn_28_6 = 0;

                        stackIn_28_7 = 0;

                        stackIn_28_8 = 0;

                        stackIn_28_9 = 0;

                        stackIn_28_10 = 0;

                        stackIn_28_11 = 0;

                        stackIn_28_12 = 0;

                        stackIn_28_13 = var16;

                        stackIn_28_14 = var17;

                        if (-1 == (2 & var15 ^ -1)) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_28_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_28_3);
                          stackIn_29_4 = stackIn_28_4;
                          stackIn_29_5 = stackIn_28_5;
                          stackIn_29_6 = stackIn_28_6;
                          stackIn_29_7 = stackIn_28_7;
                          stackIn_29_8 = stackIn_28_8;
                          stackIn_29_9 = stackIn_28_9;
                          stackIn_29_10 = stackIn_28_10;
                          stackIn_29_11 = stackIn_28_11;
                          stackIn_29_12 = stackIn_28_12;
                          stackIn_29_13 = stackIn_28_13;
                          stackIn_29_14 = stackIn_28_14;
                          stackIn_29_15 = 0;
                          break L29;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_28_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_28_3);
                          stackIn_29_4 = stackIn_28_4;
                          stackIn_29_5 = stackIn_28_5;
                          stackIn_29_6 = stackIn_28_6;
                          stackIn_29_7 = stackIn_28_7;
                          stackIn_29_8 = stackIn_28_8;
                          stackIn_29_9 = stackIn_28_9;
                          stackIn_29_10 = stackIn_28_10;
                          stackIn_29_11 = stackIn_28_11;
                          stackIn_29_12 = stackIn_28_12;
                          stackIn_29_13 = stackIn_28_13;
                          stackIn_29_14 = stackIn_28_14;
                          stackIn_29_15 = 1;
                          break L29;
                        }
                      }
                      L30: {
































                        if (-1 == (4 & var15 ^ -1)) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);












                          stackIn_32_16 = 0;
                          break L30;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);












                          stackIn_32_16 = 1;
                          break L30;
                        }
                      }
                      L31: {


































                        if (-1 == (1 & var15 ^ -1)) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);













                          stackIn_35_17 = 0;
                          break L31;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);













                          stackIn_35_17 = 1;
                          break L31;
                        }
                      }
                      L32: {




































                        if (0 == (var15 & 8)) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);














                          stackIn_38_18 = 0;
                          break L32;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);














                          stackIn_38_18 = 1;
                          break L32;
                        }
                      }
                      L33: {






































                        if (0 == (16 & var15)) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);















                          stackIn_41_19 = 0;
                          break L33;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);















                          stackIn_41_19 = 1;
                          break L33;
                        }
                      }
                      L34: {








































                        if ((32 & var15) == 0) {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);
















                          stackIn_44_20 = 0;
                          break L34;
                        } else {
                          stackIn_29_0 = null;
                          stackIn_29_1 = null;
                          stackIn_29_2 = (qm) ((Object) stackIn_29_2);
                          stackIn_29_3 = (qm) ((Object) stackIn_29_3);
















                          stackIn_44_20 = 1;
                          break L34;
                        }
                      }
                      L35: {
                        var59 = new dd(stackIn_29_2, stackIn_29_3, stackIn_29_4, stackIn_29_5, stackIn_29_6, stackIn_29_7, stackIn_29_8, stackIn_29_9, stackIn_29_10, stackIn_29_11, stackIn_29_12, stackIn_29_13, stackIn_29_14, stackIn_29_15 != 0, stackIn_32_16 != 0, stackIn_35_17 != 0, stackIn_38_18 != 0, stackIn_41_19 != 0, stackIn_44_20 != 0, 0.0f, 0.0f, 3.1415927410125732f);
                        var18.a(var59, (byte) 6);
                        var52 = new qm(var3.k(101), var3.k(-49));
                        var22 = var52;
                        var23_int = var3.k(-109);
                        var53 = new int[]{-var3.f((byte) -62), -var3.f((byte) -125), var3.f((byte) -45), var3.f((byte) -120)};
                        var24 = var53;
                        var15 = var3.f((byte) -127);
                        var25 = (float)var3.h(-14232) / 256.0f;
                        var26_float = (float)var3.h(-14232) / 256.0f;
                        var14 = var3.f(0);
                        var27_ref_qm = new qm(var3.k(-127), var3.k(97));
                        stackIn_46_0 = null;

                        stackIn_46_1 = null;

                        stackIn_46_2 = (qm) (var52);

                        stackIn_46_3 = var23_int;

                        stackIn_46_4 = var25;

                        stackIn_46_5 = var26_float;

                        stackIn_46_6 = var14;

                        stackIn_46_7 = var53[1];

                        stackIn_46_8 = var53[2];

                        stackIn_46_9 = var53[0];

                        stackIn_46_10 = var53[3];

                        stackIn_46_11 = null;

                        stackIn_46_12 = null;

                        stackIn_46_13 = (qm) (var27_ref_qm);

                        if (-1 == (var15 & 2 ^ -1)) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_46_2);
                          stackIn_47_3 = stackIn_46_3;
                          stackIn_47_4 = stackIn_46_4;
                          stackIn_47_5 = stackIn_46_5;
                          stackIn_47_6 = stackIn_46_6;
                          stackIn_47_7 = stackIn_46_7;
                          stackIn_47_8 = stackIn_46_8;
                          stackIn_47_9 = stackIn_46_9;
                          stackIn_47_10 = stackIn_46_10;
                          stackIn_47_11 = stackIn_46_11;
                          stackIn_47_12 = stackIn_46_12;
                          stackIn_47_13 = (qm) ((Object) stackIn_46_13);
                          stackIn_47_14 = 0;
                          break L35;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_46_2);
                          stackIn_47_3 = stackIn_46_3;
                          stackIn_47_4 = stackIn_46_4;
                          stackIn_47_5 = stackIn_46_5;
                          stackIn_47_6 = stackIn_46_6;
                          stackIn_47_7 = stackIn_46_7;
                          stackIn_47_8 = stackIn_46_8;
                          stackIn_47_9 = stackIn_46_9;
                          stackIn_47_10 = stackIn_46_10;
                          stackIn_47_11 = stackIn_46_11;
                          stackIn_47_12 = stackIn_46_12;
                          stackIn_47_13 = (qm) ((Object) stackIn_46_13);
                          stackIn_47_14 = 1;
                          break L35;
                        }
                      }
                      L36: {






























                        if ((var15 & 4) == 0) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);

                          stackIn_50_15 = 0;
                          break L36;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);

                          stackIn_50_15 = 1;
                          break L36;
                        }
                      }
                      L37: {
































                        if ((1 & var15) == 0) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);


                          stackIn_53_16 = 0;
                          break L37;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);


                          stackIn_53_16 = 1;
                          break L37;
                        }
                      }
                      L38: {


































                        if (-1 == (8 & var15 ^ -1)) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);



                          stackIn_56_17 = 0;
                          break L38;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);



                          stackIn_56_17 = 1;
                          break L38;
                        }
                      }
                      L39: {




































                        if (-1 == (var15 & 16 ^ -1)) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);




                          stackIn_59_18 = 0;
                          break L39;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);




                          stackIn_59_18 = 1;
                          break L39;
                        }
                      }
                      L40: {






































                        if ((var15 & 32) == 0) {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);





                          stackIn_62_19 = 0;
                          break L40;
                        } else {
                          stackIn_47_0 = null;
                          stackIn_47_1 = null;
                          stackIn_47_2 = (qm) ((Object) stackIn_47_2);










                          stackIn_47_13 = (qm) ((Object) stackIn_47_13);





                          stackIn_62_19 = 1;
                          break L40;
                        }
                      }
                      var28_ref_hn = new hn(stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_47_7, stackIn_47_8, stackIn_47_9, stackIn_47_10, (qm) ((Object) stackIn_47_11), (qm) ((Object) stackIn_47_12), stackIn_47_13, stackIn_47_14 != 0, stackIn_50_15 != 0, stackIn_53_16 != 0, stackIn_56_17 != 0, stackIn_59_18 != 0, stackIn_62_19 != 0);
                      var18.a(var28_ref_hn, (byte) 6);
                      var13++;
                      continue L6;
                    }
                  }
                } else {
                  var12[var13] = (char)kc.a(var3.f((byte) -102) << -1917278744, var3.f((byte) -95));
                  var13++;
                  continue L5;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L41: {
            var2 = decompiledCaughtException;
            stackIn_132_0 = (RuntimeException) (var2);

            stackIn_132_1 = new StringBuilder().append("lm.I(");

            if (param0 == null) {
              stackIn_133_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackIn_133_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackIn_133_2 = "null";
              break L41;
            } else {
              stackIn_133_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackIn_133_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackIn_133_2 = "{...}";
              break L41;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_133_0), stackIn_133_2 + ',' + param1 + ')');
        }
        return stackIn_129_0;
    }

    final int a(int param0, int param1, int param2) {
        lf var6 = null;
        int var7 = 0;
        int var8 = HoldTheLine.field_D;
        if (null == this.field_b || this.field_b.length == 0 || this.field_b[0].field_h > param2) {
            return -1;
        }
        if (param2 > this.field_b[-1 + this.field_b.length].field_k) {
            return -1;
        }
        if (!((this.field_b.length ^ -1) != -2)) {
            return this.field_b[0].a(param0, 1800174305);
        }
        int var4 = 0;
        int var5 = 0;
        if (param1 != 8) {
            this.b(58, -57);
        }
        while (this.field_b.length > var5) {
            var6 = this.field_b[var5];
            if (var6.field_h <= param2 && param2 <= var6.field_k) {
                var7 = var6.a(param0, 1800174305);
                if (!(var7 != -1)) {
                    return -1;
                }
                return var4 - -var7;
            }
            var4 = var4 + (var6.field_c.length - 1);
            var5++;
        }
        return -1;
    }

    final int a(int param0, int param1) {
        int var4 = 0;
        lf var5 = null;
        int var6 = HoldTheLine.field_D;
        lf[] var7 = this.field_b;
        lf[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5.field_c.length > param1) {
                return var5.field_c[param1];
            }
            param1 = param1 - (-1 + var5.field_c.length);
        }
        if (param0 != 16777215) {
            lm.b(-28);
        }
        return 0;
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        lf var4 = null;
        int var5 = HoldTheLine.field_D;
        if (param1 != -22539) {
            return 80;
        }
        for (var3 = 0; this.field_b.length > var3; var3++) {
            var4 = this.field_b[var3];
            if (var4.field_c.length > param0) {
                return var3;
            }
            param0 = param0 - (var4.field_c.length + -1);
        }
        return this.field_b.length;
    }

    final static void a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        try {
            var2_int = HoldTheLine.field_F.d(param1, 180);
            var3 = 20 + var2_int * 20;
            var4 = 0 != (qj.field_I & 2) ? nc.field_g : -200 + nc.field_g;
            var5 = -1 == (1 & qj.field_I ^ -1) ? -var3 + rf.field_X : rf.field_X;
            int var6 = -2 % ((param0 - 12) / 60);
            tc.c(var4, var5, 200, var3, 0, 192);
            tc.a(var4, var5, 200, var3, 16777215);
            HoldTheLine.field_F.a(param1, 10 + var4, var5, 180, var3, 0, -1, 1, 1, 20);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "lm.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, String param2, byte param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = 0;
              var6 = 0;
              var7 = param2.length();
              if (param3 < -37) {
                break L1;
              } else {
                this.field_b = (lf[]) null;
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (var8 >= var7) {
                if ((var5_int ^ -1) < -1) {
                  stackIn_18_0 = (-param0 + param1 << 755881480) / var5_int;
                  break L0;
                } else {
                  return 0;
                }
              } else {
                L3: {
                  var9 = param2.charAt(var8);
                  if (60 != var9) {
                    if (62 == var9) {
                      var6 = 0;
                      break L3;
                    } else {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    var6 = 1;
                    break L3;
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5);

            stackIn_21_1 = new StringBuilder().append("lm.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param3 + ')');
        }
        return stackIn_18_0;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 <= -32) {
            break L0;
          } else {
            field_a = -50;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_b == null) {
              break L2;
            } else {
              if (0 >= this.field_b.length) {
                break L2;
              } else {
                stackIn_6_0 = -this.field_b[0].field_h + this.field_b[this.field_b.length - 1].field_k;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0;
    }

    public static void b(int param0) {
        if (param0 != -11521) {
            return;
        }
        field_c = null;
        field_d = null;
    }

    final int a(byte param0) {
        int var2;
        int var3;
        lf[] var4;
        int var5;
        lf var6;
        int var8;
        int var7;
        L0: {
          var8 = HoldTheLine.field_D;
          var3 = -127 % ((60 - param0) / 36);
          var2 = -1;
          if (null == this.field_b) {
            break L0;
          } else {
            var4 = this.field_b;
            var5 = 0;
            L1: while (true) {
              if (var5 >= var4.length) {
                break L0;
              } else {
                var6 = var4[var5];
                if (var6 != null) {
                  var7 = var6.a((byte) -100);
                  if (var2 < var7) {
                    var2 = var7;
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
        return var2;
    }

    static {
        field_a = -1;
        field_c = "Please send me news and updates (I can unsubscribe at any time)";
    }
}
