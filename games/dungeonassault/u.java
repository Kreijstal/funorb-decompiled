/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends gd {
    static ad field_U;
    static cf[] field_T;
    static int field_P;
    static String field_S;
    h field_Q;
    static boolean field_O;
    static String field_R;

    final static int a(int param0, int param1, boolean param2) {
        if (param2) {
          if (param0 == 0) {
            if (0 != param1) {
              if (-1 < (param1 ^ -1)) {
                return -2048;
              } else {
                return 2048;
              }
            } else {
              return 0;
            }
          } else {
            if (param0 < 0) {
              if (0 != param1) {
                if (-1 >= (param1 ^ -1)) {
                  return -d.a(-81, -param0, param1) + 4096;
                } else {
                  return d.a(-89, -param0, -param1) - 4096;
                }
              } else {
                return 4096;
              }
            } else {
              if (0 != param1) {
                if (-1 >= (param1 ^ -1)) {
                  return d.a(-103, param0, param1);
                } else {
                  return -d.a(-120, param0, -param1);
                }
              } else {
                return 0;
              }
            }
          }
        } else {
          return 117;
        }
    }

    u(int param0, int param1, h param2) {
        super(param0, param1, 0, 0, 0);
        String var4 = null;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        int var15 = 0;
        String var19 = null;
        cn var20 = null;
        cn var21 = null;
        cn var22 = null;
        cn var23 = null;
        cn var24 = null;
        cn var25 = null;
        cn var26 = null;
        cn var27 = null;
        cn var28 = null;
        cn var29 = null;
        cn var32 = null;
        cn var33 = null;
        cn var34 = null;
        cn var35 = null;
        cn var36 = null;
        cn var39 = null;
        cn var40 = null;
        cn var41 = null;
        cn var42 = null;
        cn var43 = null;
        cn var46 = null;
        cn var47 = null;
        cn var50 = null;
        cn var51 = null;
        cn var52 = null;
        cn var53 = null;
        cn var54 = null;
        cn var55 = null;
        cn var56 = null;
        cn var57 = null;
        cn var58 = null;
        cn var59 = null;
        cn var60 = null;
        cn var61 = null;
        cn var62 = null;
        cn var63 = null;
        cn var64 = null;
        cn var65 = null;
        cn var66 = null;
        cn var67 = null;
        cn var68 = null;
        cn var69 = null;
        cn var70 = null;
        cn var71 = null;
        cn var72 = null;
        cn var73 = null;
        cn var74 = null;
        cn var75 = null;
        cn var76 = null;
        cn var77 = null;
        cn var78 = null;
        int stackIn_7_0 = 0;
        gp stackIn_10_0 = null;
        String stackIn_10_1 = null;
        gp stackIn_11_0 = null;
        String stackIn_11_1 = null;
        gp stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        gp stackIn_13_0 = null;
        String stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        gp stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        gp stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        gp stackIn_29_0 = null;
        String stackIn_29_1 = null;
        gp stackIn_30_0 = null;
        String stackIn_30_1 = null;
        gp stackIn_31_0 = null;
        String stackIn_31_1 = null;
        int stackIn_31_2 = 0;
        gp stackIn_32_0 = null;
        String stackIn_32_1 = null;
        int stackIn_32_2 = 0;
        int stackIn_32_3 = 0;
        gp stackIn_33_0 = null;
        String stackIn_33_1 = null;
        int stackIn_33_2 = 0;
        int stackIn_33_3 = 0;
        gp stackIn_34_0 = null;
        String stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        int stackIn_34_4 = 0;
        gp stackIn_48_0 = null;
        String stackIn_48_1 = null;
        gp stackIn_49_0 = null;
        String stackIn_49_1 = null;
        gp stackIn_50_0 = null;
        String stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        gp stackIn_51_0 = null;
        String stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        gp stackIn_52_0 = null;
        String stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_52_3 = 0;
        gp stackIn_53_0 = null;
        String stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        gp stackIn_66_0 = null;
        String stackIn_66_1 = null;
        gp stackIn_67_0 = null;
        String stackIn_67_1 = null;
        gp stackIn_68_0 = null;
        String stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        gp stackIn_69_0 = null;
        String stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        gp stackIn_70_0 = null;
        String stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        gp stackIn_71_0 = null;
        String stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        gp stackIn_89_0 = null;
        String stackIn_89_1 = null;
        gp stackIn_90_0 = null;
        String stackIn_90_1 = null;
        gp stackIn_91_0 = null;
        String stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        gp stackIn_92_0 = null;
        String stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        gp stackIn_93_0 = null;
        String stackIn_93_1 = null;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        gp stackIn_94_0 = null;
        String stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackIn_94_4 = 0;
        gp stackIn_110_0 = null;
        String stackIn_110_1 = null;
        gp stackIn_111_0 = null;
        String stackIn_111_1 = null;
        gp stackIn_112_0 = null;
        String stackIn_112_1 = null;
        int stackIn_112_2 = 0;
        gp stackIn_113_0 = null;
        String stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        gp stackIn_114_0 = null;
        String stackIn_114_1 = null;
        int stackIn_114_2 = 0;
        int stackIn_114_3 = 0;
        gp stackIn_115_0 = null;
        String stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        int stackIn_115_4 = 0;
        gp stackIn_130_0 = null;
        String stackIn_130_1 = null;
        gp stackIn_131_0 = null;
        String stackIn_131_1 = null;
        gp stackIn_132_0 = null;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        gp stackIn_133_0 = null;
        String stackIn_133_1 = null;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        gp stackIn_134_0 = null;
        String stackIn_134_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_134_3 = 0;
        gp stackIn_135_0 = null;
        String stackIn_135_1 = null;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        int stackIn_135_4 = 0;
        gp stackOut_129_0 = null;
        String stackOut_129_1 = null;
        gp stackOut_131_0 = null;
        String stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        gp stackOut_130_0 = null;
        String stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        gp stackOut_132_0 = null;
        String stackOut_132_1 = null;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        gp stackOut_134_0 = null;
        String stackOut_134_1 = null;
        int stackOut_134_2 = 0;
        int stackOut_134_3 = 0;
        int stackOut_134_4 = 0;
        gp stackOut_133_0 = null;
        String stackOut_133_1 = null;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        int stackOut_133_4 = 0;
        gp stackOut_109_0 = null;
        String stackOut_109_1 = null;
        gp stackOut_111_0 = null;
        String stackOut_111_1 = null;
        int stackOut_111_2 = 0;
        gp stackOut_110_0 = null;
        String stackOut_110_1 = null;
        int stackOut_110_2 = 0;
        gp stackOut_112_0 = null;
        String stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        gp stackOut_114_0 = null;
        String stackOut_114_1 = null;
        int stackOut_114_2 = 0;
        int stackOut_114_3 = 0;
        int stackOut_114_4 = 0;
        gp stackOut_113_0 = null;
        String stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        gp stackOut_88_0 = null;
        String stackOut_88_1 = null;
        gp stackOut_90_0 = null;
        String stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        gp stackOut_89_0 = null;
        String stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        gp stackOut_91_0 = null;
        String stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        gp stackOut_93_0 = null;
        String stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        gp stackOut_92_0 = null;
        String stackOut_92_1 = null;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        gp stackOut_65_0 = null;
        String stackOut_65_1 = null;
        gp stackOut_67_0 = null;
        String stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        gp stackOut_66_0 = null;
        String stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        gp stackOut_68_0 = null;
        String stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        gp stackOut_70_0 = null;
        String stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        gp stackOut_69_0 = null;
        String stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        gp stackOut_47_0 = null;
        String stackOut_47_1 = null;
        gp stackOut_49_0 = null;
        String stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        gp stackOut_48_0 = null;
        String stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        gp stackOut_50_0 = null;
        String stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        gp stackOut_52_0 = null;
        String stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        gp stackOut_51_0 = null;
        String stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        int stackOut_51_3 = 0;
        int stackOut_51_4 = 0;
        gp stackOut_28_0 = null;
        String stackOut_28_1 = null;
        gp stackOut_30_0 = null;
        String stackOut_30_1 = null;
        int stackOut_30_2 = 0;
        gp stackOut_29_0 = null;
        String stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        gp stackOut_31_0 = null;
        String stackOut_31_1 = null;
        int stackOut_31_2 = 0;
        int stackOut_31_3 = 0;
        gp stackOut_33_0 = null;
        String stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        int stackOut_33_4 = 0;
        gp stackOut_32_0 = null;
        String stackOut_32_1 = null;
        int stackOut_32_2 = 0;
        int stackOut_32_3 = 0;
        int stackOut_32_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        gp stackOut_9_0 = null;
        String stackOut_9_1 = null;
        gp stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        gp stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        gp stackOut_12_0 = null;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        gp stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        gp stackOut_13_0 = null;
        String stackOut_13_1 = null;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        ((u) this).field_Q = param2;
        var19 = ((u) this).field_Q.field_F;
        var4 = var19;
        var5 = ib.a(((u) this).field_Q, 918);
        var6 = jn.a(var19, new int[2], -78, (se) (Object) db.field_v);
        var7 = var6.length * db.field_v.field_H - -la.field_b.field_H - -42;
        if (0 >= pb.field_G) {
          if (0 != (1 & ((u) this).field_Q.field_x)) {
            var8 = 1;
            if (0 == gm.field_d.field_e) {
              if (0 != (((u) this).field_Q.field_x & 2)) {
                var9 = 1;
                var10 = var8 | var9;
                var70 = new cn(140, var7);
                var71 = new cn(140, var7);
                var72 = new cn(140, var7);
                jh.a(var70);
                gf.a();
                var14 = 0;
                var15 = 0;
                L0: while (true) {
                  if (var6.length <= var15) {
                    var14 = var14 + (la.field_b.field_H - -2);
                    if (var8 == 0) {
                      if (var9 == 0) {
                        L1: {
                          la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                          var14 += 4;
                          var71.e();
                          var15 = -45 + var7;
                          gf.a();
                          var70.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var72.e();
                          gf.a();
                          var70.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var70.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var78 = rb.a(16, var71, 255, (byte) 99);
                          var77 = rb.a(16, var71, 16711680, (byte) -128);
                          ((u) this).a(var71, var70, var77, var72, (byte) 106, var78);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L1;
                          } else {
                            ((u) this).field_w = false;
                            break L1;
                          }
                        }
                      } else {
                        L2: {
                          la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                          var14 += 4;
                          var71.e();
                          var15 = -45 + var7;
                          gf.a();
                          var70.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var72.e();
                          gf.a();
                          var70.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var70.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var76 = rb.a(16, var71, 255, (byte) 99);
                          var75 = rb.a(16, var71, 16711680, (byte) -128);
                          ((u) this).a(var71, var70, var75, var72, (byte) 106, var76);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            ((u) this).field_w = false;
                            break L2;
                          }
                        }
                      }
                    } else {
                      L3: {
                        la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                        var14 += 4;
                        var71.e();
                        var15 = -45 + var7;
                        gf.a();
                        var70.e(0, 0, 16744448);
                        gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var72.e();
                        gf.a();
                        var70.e(0, 0, 12690143);
                        gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var70.e();
                        gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        jh.b();
                        var74 = rb.a(16, var71, 255, (byte) 99);
                        var73 = rb.a(16, var71, 16711680, (byte) -128);
                        ((u) this).a(var71, var70, var73, var72, (byte) 106, var74);
                        ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          ((u) this).field_w = false;
                          break L3;
                        }
                      }
                    }
                  } else {
                    L4: {
                      var14 = var14 + la.field_b.field_H;
                      stackOut_129_0 = la.field_b;
                      stackOut_129_1 = var6[var15];
                      stackIn_131_0 = stackOut_129_0;
                      stackIn_131_1 = stackOut_129_1;
                      stackIn_130_0 = stackOut_129_0;
                      stackIn_130_1 = stackOut_129_1;
                      if (var15 != 0) {
                        stackOut_131_0 = (gp) (Object) stackIn_131_0;
                        stackOut_131_1 = (String) (Object) stackIn_131_1;
                        stackOut_131_2 = la.field_b.field_H;
                        stackIn_132_0 = stackOut_131_0;
                        stackIn_132_1 = stackOut_131_1;
                        stackIn_132_2 = stackOut_131_2;
                        break L4;
                      } else {
                        stackOut_130_0 = (gp) (Object) stackIn_130_0;
                        stackOut_130_1 = (String) (Object) stackIn_130_1;
                        stackOut_130_2 = 0;
                        stackIn_132_0 = stackOut_130_0;
                        stackIn_132_1 = stackOut_130_1;
                        stackIn_132_2 = stackOut_130_2;
                        break L4;
                      }
                    }
                    L5: {
                      stackOut_132_0 = (gp) (Object) stackIn_132_0;
                      stackOut_132_1 = (String) (Object) stackIn_132_1;
                      stackOut_132_2 = stackIn_132_2;
                      stackOut_132_3 = var14;
                      stackIn_134_0 = stackOut_132_0;
                      stackIn_134_1 = stackOut_132_1;
                      stackIn_134_2 = stackOut_132_2;
                      stackIn_134_3 = stackOut_132_3;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      stackIn_133_2 = stackOut_132_2;
                      stackIn_133_3 = stackOut_132_3;
                      if (var10 == 0) {
                        stackOut_134_0 = (gp) (Object) stackIn_134_0;
                        stackOut_134_1 = (String) (Object) stackIn_134_1;
                        stackOut_134_2 = stackIn_134_2;
                        stackOut_134_3 = stackIn_134_3;
                        stackOut_134_4 = 16760832;
                        stackIn_135_0 = stackOut_134_0;
                        stackIn_135_1 = stackOut_134_1;
                        stackIn_135_2 = stackOut_134_2;
                        stackIn_135_3 = stackOut_134_3;
                        stackIn_135_4 = stackOut_134_4;
                        break L5;
                      } else {
                        stackOut_133_0 = (gp) (Object) stackIn_133_0;
                        stackOut_133_1 = (String) (Object) stackIn_133_1;
                        stackOut_133_2 = stackIn_133_2;
                        stackOut_133_3 = stackIn_133_3;
                        stackOut_133_4 = 8421504;
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_135_1 = stackOut_133_1;
                        stackIn_135_2 = stackOut_133_2;
                        stackIn_135_3 = stackOut_133_3;
                        stackIn_135_4 = stackOut_133_4;
                        break L5;
                      }
                    }
                    ((gp) (Object) stackIn_135_0).b(stackIn_135_1, stackIn_135_2, stackIn_135_3, stackIn_135_4, -1);
                    var15++;
                    continue L0;
                  }
                }
              } else {
                var9 = 0;
                var10 = var8 | var9;
                var61 = new cn(140, var7);
                var62 = new cn(140, var7);
                var63 = new cn(140, var7);
                jh.a(var61);
                gf.a();
                var14 = 0;
                var15 = 0;
                L6: while (true) {
                  if (var6.length <= var15) {
                    var14 = var14 + (la.field_b.field_H - -2);
                    if (var8 == 0) {
                      if (var9 == 0) {
                        L7: {
                          la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                          var14 += 4;
                          var62.e();
                          var15 = -45 + var7;
                          gf.a();
                          var61.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var63.e();
                          gf.a();
                          var61.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var61.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var69 = rb.a(16, var62, 255, (byte) 99);
                          var68 = rb.a(16, var62, 16711680, (byte) -128);
                          ((u) this).a(var62, var61, var68, var63, (byte) 106, var69);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L7;
                          } else {
                            ((u) this).field_w = false;
                            break L7;
                          }
                        }
                      } else {
                        L8: {
                          la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                          var14 += 4;
                          var62.e();
                          var15 = -45 + var7;
                          gf.a();
                          var61.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var63.e();
                          gf.a();
                          var61.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var61.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var67 = rb.a(16, var62, 255, (byte) 99);
                          var66 = rb.a(16, var62, 16711680, (byte) -128);
                          ((u) this).a(var62, var61, var66, var63, (byte) 106, var67);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L8;
                          } else {
                            ((u) this).field_w = false;
                            break L8;
                          }
                        }
                      }
                    } else {
                      L9: {
                        la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                        var14 += 4;
                        var62.e();
                        var15 = -45 + var7;
                        gf.a();
                        var61.e(0, 0, 16744448);
                        gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var63.e();
                        gf.a();
                        var61.e(0, 0, 12690143);
                        gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var61.e();
                        gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        jh.b();
                        var65 = rb.a(16, var62, 255, (byte) 99);
                        var64 = rb.a(16, var62, 16711680, (byte) -128);
                        ((u) this).a(var62, var61, var64, var63, (byte) 106, var65);
                        ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                        if (var10 == 0) {
                          break L9;
                        } else {
                          ((u) this).field_w = false;
                          break L9;
                        }
                      }
                    }
                  } else {
                    L10: {
                      var14 = var14 + la.field_b.field_H;
                      stackOut_109_0 = la.field_b;
                      stackOut_109_1 = var6[var15];
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      if (var15 != 0) {
                        stackOut_111_0 = (gp) (Object) stackIn_111_0;
                        stackOut_111_1 = (String) (Object) stackIn_111_1;
                        stackOut_111_2 = la.field_b.field_H;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        break L10;
                      } else {
                        stackOut_110_0 = (gp) (Object) stackIn_110_0;
                        stackOut_110_1 = (String) (Object) stackIn_110_1;
                        stackOut_110_2 = 0;
                        stackIn_112_0 = stackOut_110_0;
                        stackIn_112_1 = stackOut_110_1;
                        stackIn_112_2 = stackOut_110_2;
                        break L10;
                      }
                    }
                    L11: {
                      stackOut_112_0 = (gp) (Object) stackIn_112_0;
                      stackOut_112_1 = (String) (Object) stackIn_112_1;
                      stackOut_112_2 = stackIn_112_2;
                      stackOut_112_3 = var14;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      stackIn_114_3 = stackOut_112_3;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      stackIn_113_3 = stackOut_112_3;
                      if (var10 == 0) {
                        stackOut_114_0 = (gp) (Object) stackIn_114_0;
                        stackOut_114_1 = (String) (Object) stackIn_114_1;
                        stackOut_114_2 = stackIn_114_2;
                        stackOut_114_3 = stackIn_114_3;
                        stackOut_114_4 = 16760832;
                        stackIn_115_0 = stackOut_114_0;
                        stackIn_115_1 = stackOut_114_1;
                        stackIn_115_2 = stackOut_114_2;
                        stackIn_115_3 = stackOut_114_3;
                        stackIn_115_4 = stackOut_114_4;
                        break L11;
                      } else {
                        stackOut_113_0 = (gp) (Object) stackIn_113_0;
                        stackOut_113_1 = (String) (Object) stackIn_113_1;
                        stackOut_113_2 = stackIn_113_2;
                        stackOut_113_3 = stackIn_113_3;
                        stackOut_113_4 = 8421504;
                        stackIn_115_0 = stackOut_113_0;
                        stackIn_115_1 = stackOut_113_1;
                        stackIn_115_2 = stackOut_113_2;
                        stackIn_115_3 = stackOut_113_3;
                        stackIn_115_4 = stackOut_113_4;
                        break L11;
                      }
                    }
                    ((gp) (Object) stackIn_115_0).b(stackIn_115_1, stackIn_115_2, stackIn_115_3, stackIn_115_4, -1);
                    var15++;
                    continue L6;
                  }
                }
              }
            } else {
              var9 = 0;
              var10 = var8 | var9;
              var52 = new cn(140, var7);
              var53 = new cn(140, var7);
              var54 = new cn(140, var7);
              jh.a(var52);
              gf.a();
              var14 = 0;
              var15 = 0;
              L12: while (true) {
                if (var6.length <= var15) {
                  var14 = var14 + (la.field_b.field_H - -2);
                  if (var8 == 0) {
                    if (var9 == 0) {
                      L13: {
                        la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                        var14 += 4;
                        var53.e();
                        var15 = -45 + var7;
                        gf.a();
                        var52.e(0, 0, 16744448);
                        gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var54.e();
                        gf.a();
                        var52.e(0, 0, 12690143);
                        gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var52.e();
                        gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        jh.b();
                        var60 = rb.a(16, var53, 255, (byte) 99);
                        var59 = rb.a(16, var53, 16711680, (byte) -128);
                        ((u) this).a(var53, var52, var59, var54, (byte) 106, var60);
                        ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                        if (var10 == 0) {
                          break L13;
                        } else {
                          ((u) this).field_w = false;
                          break L13;
                        }
                      }
                    } else {
                      L14: {
                        la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                        var14 += 4;
                        var53.e();
                        var15 = -45 + var7;
                        gf.a();
                        var52.e(0, 0, 16744448);
                        gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var54.e();
                        gf.a();
                        var52.e(0, 0, 12690143);
                        gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var52.e();
                        gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        jh.b();
                        var58 = rb.a(16, var53, 255, (byte) 99);
                        var57 = rb.a(16, var53, 16711680, (byte) -128);
                        ((u) this).a(var53, var52, var57, var54, (byte) 106, var58);
                        ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                        if (var10 == 0) {
                          break L14;
                        } else {
                          ((u) this).field_w = false;
                          break L14;
                        }
                      }
                    }
                  } else {
                    L15: {
                      la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                      var14 += 4;
                      var53.e();
                      var15 = -45 + var7;
                      gf.a();
                      var52.e(0, 0, 16744448);
                      gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      var54.e();
                      gf.a();
                      var52.e(0, 0, 12690143);
                      gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      var52.e();
                      gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      jh.b();
                      var56 = rb.a(16, var53, 255, (byte) 99);
                      var55 = rb.a(16, var53, 16711680, (byte) -128);
                      ((u) this).a(var53, var52, var55, var54, (byte) 106, var56);
                      ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                      if (var10 == 0) {
                        break L15;
                      } else {
                        ((u) this).field_w = false;
                        break L15;
                      }
                    }
                  }
                } else {
                  L16: {
                    var14 = var14 + la.field_b.field_H;
                    stackOut_88_0 = la.field_b;
                    stackOut_88_1 = var6[var15];
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_90_1 = stackOut_88_1;
                    stackIn_89_0 = stackOut_88_0;
                    stackIn_89_1 = stackOut_88_1;
                    if (var15 != 0) {
                      stackOut_90_0 = (gp) (Object) stackIn_90_0;
                      stackOut_90_1 = (String) (Object) stackIn_90_1;
                      stackOut_90_2 = la.field_b.field_H;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      stackIn_91_2 = stackOut_90_2;
                      break L16;
                    } else {
                      stackOut_89_0 = (gp) (Object) stackIn_89_0;
                      stackOut_89_1 = (String) (Object) stackIn_89_1;
                      stackOut_89_2 = 0;
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_91_1 = stackOut_89_1;
                      stackIn_91_2 = stackOut_89_2;
                      break L16;
                    }
                  }
                  L17: {
                    stackOut_91_0 = (gp) (Object) stackIn_91_0;
                    stackOut_91_1 = (String) (Object) stackIn_91_1;
                    stackOut_91_2 = stackIn_91_2;
                    stackOut_91_3 = var14;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_93_2 = stackOut_91_2;
                    stackIn_93_3 = stackOut_91_3;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    stackIn_92_3 = stackOut_91_3;
                    if (var10 == 0) {
                      stackOut_93_0 = (gp) (Object) stackIn_93_0;
                      stackOut_93_1 = (String) (Object) stackIn_93_1;
                      stackOut_93_2 = stackIn_93_2;
                      stackOut_93_3 = stackIn_93_3;
                      stackOut_93_4 = 16760832;
                      stackIn_94_0 = stackOut_93_0;
                      stackIn_94_1 = stackOut_93_1;
                      stackIn_94_2 = stackOut_93_2;
                      stackIn_94_3 = stackOut_93_3;
                      stackIn_94_4 = stackOut_93_4;
                      break L17;
                    } else {
                      stackOut_92_0 = (gp) (Object) stackIn_92_0;
                      stackOut_92_1 = (String) (Object) stackIn_92_1;
                      stackOut_92_2 = stackIn_92_2;
                      stackOut_92_3 = stackIn_92_3;
                      stackOut_92_4 = 8421504;
                      stackIn_94_0 = stackOut_92_0;
                      stackIn_94_1 = stackOut_92_1;
                      stackIn_94_2 = stackOut_92_2;
                      stackIn_94_3 = stackOut_92_3;
                      stackIn_94_4 = stackOut_92_4;
                      break L17;
                    }
                  }
                  ((gp) (Object) stackIn_94_0).b(stackIn_94_1, stackIn_94_2, stackIn_94_3, stackIn_94_4, -1);
                  var15++;
                  continue L12;
                }
              }
            }
          } else {
            var8 = 0;
            if (0 == gm.field_d.field_e) {
              if (0 != (((u) this).field_Q.field_x & 2)) {
                var9 = 1;
                var10 = var8 | var9;
                var39 = new cn(140, var7);
                var11 = var39;
                var40 = new cn(140, var7);
                var12 = var40;
                var41 = new cn(140, var7);
                var13 = var41;
                jh.a(var39);
                gf.a();
                var14 = 0;
                var15 = 0;
                L18: while (true) {
                  if (var6.length <= var15) {
                    var14 = var14 + (la.field_b.field_H - -2);
                    if (var8 == 0) {
                      if (var9 == 0) {
                        L19: {
                          la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                          var14 += 4;
                          var40.e();
                          var15 = -45 + var7;
                          gf.a();
                          var39.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var41.e();
                          gf.a();
                          var39.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var39.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var51 = rb.a(16, var40, 255, (byte) 99);
                          var50 = rb.a(16, var40, 16711680, (byte) -128);
                          ((u) this).a(var40, var39, var50, var41, (byte) 106, var51);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L19;
                          } else {
                            ((u) this).field_w = false;
                            break L19;
                          }
                        }
                      } else {
                        L20: {
                          la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                          var14 += 4;
                          var40.e();
                          var15 = -45 + var7;
                          gf.a();
                          var39.e(0, 0, 16744448);
                          gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var41.e();
                          gf.a();
                          var39.e(0, 0, 12690143);
                          gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          var39.e();
                          gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                          jh.b();
                          var47 = rb.a(16, var40, 255, (byte) 99);
                          var46 = rb.a(16, var40, 16711680, (byte) -128);
                          ((u) this).a(var40, var39, var46, var41, (byte) 106, var47);
                          ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                          if (var10 == 0) {
                            break L20;
                          } else {
                            ((u) this).field_w = false;
                            break L20;
                          }
                        }
                      }
                    } else {
                      L21: {
                        la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                        var14 += 4;
                        var40.e();
                        var15 = -45 + var7;
                        gf.a();
                        var39.e(0, 0, 16744448);
                        gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var41.e();
                        gf.a();
                        var39.e(0, 0, 12690143);
                        gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        var39.e();
                        gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                        rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                        jh.b();
                        var43 = rb.a(16, var40, 255, (byte) 99);
                        var42 = rb.a(16, var40, 16711680, (byte) -128);
                        ((u) this).a(var40, var39, var42, var41, (byte) 106, var43);
                        ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                        if (var10 == 0) {
                          break L21;
                        } else {
                          ((u) this).field_w = false;
                          break L21;
                        }
                      }
                    }
                  } else {
                    L22: {
                      var14 = var14 + la.field_b.field_H;
                      stackOut_65_0 = la.field_b;
                      stackOut_65_1 = var6[var15];
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_67_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if (var15 != 0) {
                        stackOut_67_0 = (gp) (Object) stackIn_67_0;
                        stackOut_67_1 = (String) (Object) stackIn_67_1;
                        stackOut_67_2 = la.field_b.field_H;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        stackIn_68_2 = stackOut_67_2;
                        break L22;
                      } else {
                        stackOut_66_0 = (gp) (Object) stackIn_66_0;
                        stackOut_66_1 = (String) (Object) stackIn_66_1;
                        stackOut_66_2 = 0;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        stackIn_68_2 = stackOut_66_2;
                        break L22;
                      }
                    }
                    L23: {
                      stackOut_68_0 = (gp) (Object) stackIn_68_0;
                      stackOut_68_1 = (String) (Object) stackIn_68_1;
                      stackOut_68_2 = stackIn_68_2;
                      stackOut_68_3 = var14;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_70_2 = stackOut_68_2;
                      stackIn_70_3 = stackOut_68_3;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      if (var10 == 0) {
                        stackOut_70_0 = (gp) (Object) stackIn_70_0;
                        stackOut_70_1 = (String) (Object) stackIn_70_1;
                        stackOut_70_2 = stackIn_70_2;
                        stackOut_70_3 = stackIn_70_3;
                        stackOut_70_4 = 16760832;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        stackIn_71_3 = stackOut_70_3;
                        stackIn_71_4 = stackOut_70_4;
                        break L23;
                      } else {
                        stackOut_69_0 = (gp) (Object) stackIn_69_0;
                        stackOut_69_1 = (String) (Object) stackIn_69_1;
                        stackOut_69_2 = stackIn_69_2;
                        stackOut_69_3 = stackIn_69_3;
                        stackOut_69_4 = 8421504;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackIn_71_2 = stackOut_69_2;
                        stackIn_71_3 = stackOut_69_3;
                        stackIn_71_4 = stackOut_69_4;
                        break L23;
                      }
                    }
                    ((gp) (Object) stackIn_71_0).b(stackIn_71_1, stackIn_71_2, stackIn_71_3, stackIn_71_4, -1);
                    var15++;
                    continue L18;
                  }
                }
              } else {
                var9 = 0;
                var10 = var8 | var9;
                var32 = new cn(140, var7);
                var11 = var32;
                var33 = new cn(140, var7);
                var12 = var33;
                var34 = new cn(140, var7);
                var13 = var34;
                jh.a(var32);
                gf.a();
                var14 = 0;
                var15 = 0;
                L24: while (true) {
                  if (var6.length <= var15) {
                    L25: {
                      var14 = var14 + (la.field_b.field_H - -2);
                      if (var8 == 0) {
                        if (var9 == 0) {
                          la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                          break L25;
                        } else {
                          la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                          break L25;
                        }
                      } else {
                        la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                        break L25;
                      }
                    }
                    L26: {
                      var14 += 4;
                      var33.e();
                      var15 = -45 + var7;
                      gf.a();
                      var32.e(0, 0, 16744448);
                      gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      var34.e();
                      gf.a();
                      var32.e(0, 0, 12690143);
                      gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      var32.e();
                      gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                      rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                      jh.b();
                      var36 = rb.a(16, var33, 255, (byte) 99);
                      var35 = rb.a(16, var33, 16711680, (byte) -128);
                      ((u) this).a(var33, var32, var35, var34, (byte) 106, var36);
                      ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                      if (var10 == 0) {
                        break L26;
                      } else {
                        ((u) this).field_w = false;
                        break L26;
                      }
                    }
                  } else {
                    L27: {
                      var14 = var14 + la.field_b.field_H;
                      stackOut_47_0 = la.field_b;
                      stackOut_47_1 = var6[var15];
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_49_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (var15 != 0) {
                        stackOut_49_0 = (gp) (Object) stackIn_49_0;
                        stackOut_49_1 = (String) (Object) stackIn_49_1;
                        stackOut_49_2 = la.field_b.field_H;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        stackIn_50_2 = stackOut_49_2;
                        break L27;
                      } else {
                        stackOut_48_0 = (gp) (Object) stackIn_48_0;
                        stackOut_48_1 = (String) (Object) stackIn_48_1;
                        stackOut_48_2 = 0;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        stackIn_50_2 = stackOut_48_2;
                        break L27;
                      }
                    }
                    L28: {
                      stackOut_50_0 = (gp) (Object) stackIn_50_0;
                      stackOut_50_1 = (String) (Object) stackIn_50_1;
                      stackOut_50_2 = stackIn_50_2;
                      stackOut_50_3 = var14;
                      stackIn_52_0 = stackOut_50_0;
                      stackIn_52_1 = stackOut_50_1;
                      stackIn_52_2 = stackOut_50_2;
                      stackIn_52_3 = stackOut_50_3;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      stackIn_51_2 = stackOut_50_2;
                      stackIn_51_3 = stackOut_50_3;
                      if (var10 == 0) {
                        stackOut_52_0 = (gp) (Object) stackIn_52_0;
                        stackOut_52_1 = (String) (Object) stackIn_52_1;
                        stackOut_52_2 = stackIn_52_2;
                        stackOut_52_3 = stackIn_52_3;
                        stackOut_52_4 = 16760832;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        stackIn_53_2 = stackOut_52_2;
                        stackIn_53_3 = stackOut_52_3;
                        stackIn_53_4 = stackOut_52_4;
                        break L28;
                      } else {
                        stackOut_51_0 = (gp) (Object) stackIn_51_0;
                        stackOut_51_1 = (String) (Object) stackIn_51_1;
                        stackOut_51_2 = stackIn_51_2;
                        stackOut_51_3 = stackIn_51_3;
                        stackOut_51_4 = 8421504;
                        stackIn_53_0 = stackOut_51_0;
                        stackIn_53_1 = stackOut_51_1;
                        stackIn_53_2 = stackOut_51_2;
                        stackIn_53_3 = stackOut_51_3;
                        stackIn_53_4 = stackOut_51_4;
                        break L28;
                      }
                    }
                    ((gp) (Object) stackIn_53_0).b(stackIn_53_1, stackIn_53_2, stackIn_53_3, stackIn_53_4, -1);
                    var15++;
                    continue L24;
                  }
                }
              }
            } else {
              var9 = 0;
              var10 = var8 | var9;
              var25 = new cn(140, var7);
              var11 = var25;
              var26 = new cn(140, var7);
              var12 = var26;
              var27 = new cn(140, var7);
              var13 = var27;
              jh.a(var25);
              gf.a();
              var14 = 0;
              var15 = 0;
              L29: while (true) {
                if (var6.length <= var15) {
                  L30: {
                    var14 = var14 + (la.field_b.field_H - -2);
                    if (var8 == 0) {
                      if (var9 == 0) {
                        la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                        break L30;
                      } else {
                        la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                        break L30;
                      }
                    } else {
                      la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                      break L30;
                    }
                  }
                  L31: {
                    var14 += 4;
                    var26.e();
                    var15 = -45 + var7;
                    gf.a();
                    var25.e(0, 0, 16744448);
                    gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                    rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                    var27.e();
                    gf.a();
                    var25.e(0, 0, 12690143);
                    gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                    rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                    var25.e();
                    gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                    rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                    jh.b();
                    var29 = rb.a(16, var26, 255, (byte) 99);
                    var28 = rb.a(16, var26, 16711680, (byte) -128);
                    ((u) this).a(var26, var25, var28, var27, (byte) 106, var29);
                    ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                    if (var10 == 0) {
                      break L31;
                    } else {
                      ((u) this).field_w = false;
                      break L31;
                    }
                  }
                } else {
                  L32: {
                    var14 = var14 + la.field_b.field_H;
                    stackOut_28_0 = la.field_b;
                    stackOut_28_1 = var6[var15];
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    if (var15 != 0) {
                      stackOut_30_0 = (gp) (Object) stackIn_30_0;
                      stackOut_30_1 = (String) (Object) stackIn_30_1;
                      stackOut_30_2 = la.field_b.field_H;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      stackIn_31_2 = stackOut_30_2;
                      break L32;
                    } else {
                      stackOut_29_0 = (gp) (Object) stackIn_29_0;
                      stackOut_29_1 = (String) (Object) stackIn_29_1;
                      stackOut_29_2 = 0;
                      stackIn_31_0 = stackOut_29_0;
                      stackIn_31_1 = stackOut_29_1;
                      stackIn_31_2 = stackOut_29_2;
                      break L32;
                    }
                  }
                  L33: {
                    stackOut_31_0 = (gp) (Object) stackIn_31_0;
                    stackOut_31_1 = (String) (Object) stackIn_31_1;
                    stackOut_31_2 = stackIn_31_2;
                    stackOut_31_3 = var14;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    stackIn_33_2 = stackOut_31_2;
                    stackIn_33_3 = stackOut_31_3;
                    stackIn_32_0 = stackOut_31_0;
                    stackIn_32_1 = stackOut_31_1;
                    stackIn_32_2 = stackOut_31_2;
                    stackIn_32_3 = stackOut_31_3;
                    if (var10 == 0) {
                      stackOut_33_0 = (gp) (Object) stackIn_33_0;
                      stackOut_33_1 = (String) (Object) stackIn_33_1;
                      stackOut_33_2 = stackIn_33_2;
                      stackOut_33_3 = stackIn_33_3;
                      stackOut_33_4 = 16760832;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      stackIn_34_3 = stackOut_33_3;
                      stackIn_34_4 = stackOut_33_4;
                      break L33;
                    } else {
                      stackOut_32_0 = (gp) (Object) stackIn_32_0;
                      stackOut_32_1 = (String) (Object) stackIn_32_1;
                      stackOut_32_2 = stackIn_32_2;
                      stackOut_32_3 = stackIn_32_3;
                      stackOut_32_4 = 8421504;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_34_2 = stackOut_32_2;
                      stackIn_34_3 = stackOut_32_3;
                      stackIn_34_4 = stackOut_32_4;
                      break L33;
                    }
                  }
                  ((gp) (Object) stackIn_34_0).b(stackIn_34_1, stackIn_34_2, stackIn_34_3, stackIn_34_4, -1);
                  var15++;
                  continue L29;
                }
              }
            }
          }
        } else {
          L34: {
            var8 = 0;
            if (0 == gm.field_d.field_e) {
              if (0 != (((u) this).field_Q.field_x & 2)) {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L34;
              } else {
                stackOut_4_0 = 0;
                stackIn_7_0 = stackOut_4_0;
                break L34;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_7_0 = stackOut_2_0;
              break L34;
            }
          }
          var9 = stackIn_7_0;
          var10 = var8 | var9;
          var20 = new cn(140, var7);
          var21 = new cn(140, var7);
          var22 = new cn(140, var7);
          jh.a(var20);
          gf.a();
          var14 = 0;
          var15 = 0;
          L35: while (true) {
            if (var6.length <= var15) {
              L36: {
                var14 = var14 + (la.field_b.field_H - -2);
                if (var8 == 0) {
                  if (var9 == 0) {
                    la.field_b.b(jk.a(new String[1], n.field_a, 30496), 52, var14, 12632256, -1);
                    break L36;
                  } else {
                    la.field_b.b(be.field_q, 52, var14, 16711680, -1);
                    break L36;
                  }
                } else {
                  la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
                  break L36;
                }
              }
              L37: {
                var14 += 4;
                var21.e();
                var15 = -45 + var7;
                gf.a();
                var20.e(0, 0, 16744448);
                gk.a(52, ((u) this).field_Q, 95, 16744448, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var22.e();
                gf.a();
                var20.e(0, 0, 12690143);
                gk.a(52, ((u) this).field_Q, 118, 10449103, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                var20.e();
                gk.a(52, ((u) this).field_Q, 115, 12632256, var14);
                rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15);
                jh.b();
                var24 = rb.a(16, var21, 255, (byte) 99);
                var23 = rb.a(16, var21, 16711680, (byte) -128);
                ((u) this).a(var21, var20, var23, var22, (byte) 106, var24);
                ((u) this).field_n = (en) (Object) new fc(((u) this).field_Q);
                if (var10 == 0) {
                  break L37;
                } else {
                  ((u) this).field_w = false;
                  break L37;
                }
              }
            } else {
              L38: {
                var14 = var14 + la.field_b.field_H;
                stackOut_9_0 = la.field_b;
                stackOut_9_1 = var6[var15];
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (var15 != 0) {
                  stackOut_11_0 = (gp) (Object) stackIn_11_0;
                  stackOut_11_1 = (String) (Object) stackIn_11_1;
                  stackOut_11_2 = la.field_b.field_H;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L38;
                } else {
                  stackOut_10_0 = (gp) (Object) stackIn_10_0;
                  stackOut_10_1 = (String) (Object) stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L38;
                }
              }
              L39: {
                stackOut_12_0 = (gp) (Object) stackIn_12_0;
                stackOut_12_1 = (String) (Object) stackIn_12_1;
                stackOut_12_2 = stackIn_12_2;
                stackOut_12_3 = var14;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                stackIn_13_3 = stackOut_12_3;
                if (var10 == 0) {
                  stackOut_14_0 = (gp) (Object) stackIn_14_0;
                  stackOut_14_1 = (String) (Object) stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = 16760832;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L39;
                } else {
                  stackOut_13_0 = (gp) (Object) stackIn_13_0;
                  stackOut_13_1 = (String) (Object) stackIn_13_1;
                  stackOut_13_2 = stackIn_13_2;
                  stackOut_13_3 = stackIn_13_3;
                  stackOut_13_4 = 8421504;
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  stackIn_15_3 = stackOut_13_3;
                  stackIn_15_4 = stackOut_13_4;
                  break L39;
                }
              }
              ((gp) (Object) stackIn_15_0).b(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, -1);
              var15++;
              continue L35;
            }
          }
        }
    }

    final static void a(int param0, lb param1) {
        int var2 = 0;
        eh var3 = null;
        int var4 = 0;
        eh var5 = null;
        eh var7 = null;
        eh var10 = null;
        eh stackIn_11_0 = null;
        eh stackIn_21_0 = null;
        eh stackIn_36_0 = null;
        eh stackOut_35_0 = null;
        eh stackOut_34_0 = null;
        eh stackOut_20_0 = null;
        eh stackOut_19_0 = null;
        eh stackOut_10_0 = null;
        eh stackOut_9_0 = null;
        var4 = DungeonAssault.field_K;
        if (um.field_i != null) {
          if (param0 != 1) {
            return;
          } else {
            var2 = 0;
            L0: while (true) {
              if (8 <= var2) {
                ho.b((byte) -36);
                return;
              } else {
                L1: {
                  if (param1 == null) {
                    break L1;
                  } else {
                    if (um.field_i[var2] == param1.field_a[var2]) {
                      break L1;
                    } else {
                      var2++;
                      continue L0;
                    }
                  }
                }
                um.field_i[var2] = gm.field_d.field_a[var2];
                if (null != um.field_i[var2]) {
                  L2: {
                    if (255 != um.field_i[var2].field_p) {
                      stackOut_35_0 = um.field_i[var2].field_n.field_e;
                      stackIn_36_0 = stackOut_35_0;
                      break L2;
                    } else {
                      stackOut_34_0 = k.field_c;
                      stackIn_36_0 = stackOut_34_0;
                      break L2;
                    }
                  }
                  var10 = stackIn_36_0;
                  var3 = var10;
                  um.field_i[var2].field_b = new wd(var10);
                  var2++;
                  continue L0;
                } else {
                  var2++;
                  continue L0;
                }
              }
            }
          }
        } else {
          um.field_i = new hb[8];
          if (param0 == 1) {
            var2 = 0;
            if (8 > var2) {
              if (param1 != null) {
                if (um.field_i[var2] == param1.field_a[var2]) {
                  L3: {
                    um.field_i[var2] = gm.field_d.field_a[var2];
                    if (null != um.field_i[var2]) {
                      L4: {
                        if (255 != um.field_i[var2].field_p) {
                          stackOut_20_0 = um.field_i[var2].field_n.field_e;
                          stackIn_21_0 = stackOut_20_0;
                          break L4;
                        } else {
                          stackOut_19_0 = k.field_c;
                          stackIn_21_0 = stackOut_19_0;
                          break L4;
                        }
                      }
                      var7 = stackIn_21_0;
                      var3 = var7;
                      um.field_i[var2].field_b = new wd(var7);
                      break L3;
                    } else {
                      var2++;
                      break L3;
                    }
                  }
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  ho.b((byte) -36);
                  return;
                } else {
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  var2++;
                  ho.b((byte) -36);
                  return;
                }
              } else {
                L5: {
                  um.field_i[var2] = gm.field_d.field_a[var2];
                  if (null != um.field_i[var2]) {
                    L6: {
                      if (255 != um.field_i[var2].field_p) {
                        stackOut_10_0 = um.field_i[var2].field_n.field_e;
                        stackIn_11_0 = stackOut_10_0;
                        break L6;
                      } else {
                        stackOut_9_0 = k.field_c;
                        stackIn_11_0 = stackOut_9_0;
                        break L6;
                      }
                    }
                    var5 = stackIn_11_0;
                    var3 = var5;
                    um.field_i[var2].field_b = new wd(var5);
                    break L5;
                  } else {
                    var2++;
                    break L5;
                  }
                }
                var2++;
                var2++;
                var2++;
                var2++;
                ho.b((byte) -36);
                return;
              }
            } else {
              ho.b((byte) -36);
              return;
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        cn var8 = null;
        int var9 = 0;
        int var10 = 0;
        cn var13 = null;
        cn stackIn_12_0 = null;
        cn stackOut_11_0 = null;
        Object stackOut_10_0 = null;
        var4 = -3 + ((u) this).field_t - -param0;
        var5 = -3 + (param2 + ((u) this).field_i);
        var6 = ((u) this).field_q + var4 + 5;
        var7 = ((u) this).field_x + var5 - -5;
        if (var4 <= gf.field_h) {
          if (gf.field_e >= var5) {
            if (gf.field_j <= var6) {
              if (gf.field_f <= var7) {
                L0: {
                  gf.b(var4, var5, 5 + ((u) this).field_q, ((u) this).field_x + 5, 0, 128);
                  super.b(param0, param1, param2);
                  if (null != ((u) this).field_Q.field_e) {
                    stackOut_11_0 = ((u) this).field_Q.field_e.a(40, 0, 40, 0);
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    stackOut_10_0 = null;
                    stackIn_12_0 = (cn) (Object) stackOut_10_0;
                    break L0;
                  }
                }
                var13 = stackIn_12_0;
                var8 = var13;
                var9 = ((u) this).field_x + var5 + -2 - 40;
                var10 = 5 + var4;
                if (var13 == null) {
                  gf.b(var10, var9, 32, 32, 0);
                  return;
                } else {
                  var13.c(var10, var9);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static String a(se param0, byte param1, String param2, int param3, int param4, int param5) {
        int var6 = 106 % ((-21 - param1) / 43);
        return ia.a(param5, param0, an.a(param4, (byte) -109, param3, param2), 0);
    }

    public static void c(byte param0) {
        field_R = null;
        field_S = null;
        field_T = null;
        int var1 = 52 / ((param0 - 30) / 54);
        field_U = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = "<col=8B1717>Disarm</col>";
        field_U = new ad(7, 0, 1, 1);
        field_R = "Monster attacks.";
    }
}
