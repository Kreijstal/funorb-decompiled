/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jd extends IOException {
    static int field_a;
    static int field_b;

    final static mi a(byte[] param0, int param1, ii[] param2) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        byte[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        byte[][] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        byte[][] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        mi stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (256 == param2.length) {
              var27 = new int[256];
              var22 = var27;
              var17 = var22;
              var12 = var17;
              var11 = var12;
              var3_array = var11;
              var5 = -98 / ((-28 - param1) / 54);
              var28 = new int[256];
              var23 = var28;
              var18 = var23;
              var13 = var18;
              var4 = var13;
              var29 = new int[256];
              var24 = var29;
              var19 = var24;
              var14 = var19;
              var6 = var14;
              var30 = new int[256];
              var25 = var30;
              var20 = var25;
              var15 = var20;
              var7 = var15;
              var31 = new byte[256][];
              var26 = var31;
              var21 = var26;
              var16 = var21;
              var8 = var16;
              var9 = 0;
              L1: while (true) {
                if (var9 >= 256) {
                  stackOut_6_0 = new mi(param0, var27, var28, var29, var30, var31);
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  var11[var9] = param2[var9].field_c;
                  var4[var9] = param2[var9].field_b;
                  var6[var9] = param2[var9].field_f;
                  var7[var9] = param2[var9].field_g;
                  var8[var9] = param2[var9].field_i;
                  var9++;
                  continue L1;
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("jd.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    final static void a(byte param0) {
        int var1 = -128 / ((-25 - param0) / 47);
    }

    jd(String param0) {
        super(param0);
    }

    final static void a(int param0, int param1, ti[] param2, int param3, int param4, int param5, kg param6, int param7, int param8, ti[] param9, boolean param10) {
        RuntimeException var11 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            je.a(-11);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var11;
            stackOut_2_1 = new StringBuilder().append("jd.A(").append(param0).append(44).append(param1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param6 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param7).append(44).append(param8).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param9 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + 0 + 41);
        }
    }

    final static int a(int param0, hg param1, byte param2, String param3, int param4, boolean param5, hg param6) {
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        oa stackIn_12_0 = null;
        oa stackIn_13_0 = null;
        oa stackIn_14_0 = null;
        String stackIn_14_1 = null;
        oa stackIn_15_0 = null;
        oa stackIn_16_0 = null;
        oa stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        oa stackOut_11_0 = null;
        oa stackOut_13_0 = null;
        String stackOut_13_1 = null;
        oa stackOut_12_0 = null;
        String stackOut_12_1 = null;
        oa stackOut_14_0 = null;
        oa stackOut_16_0 = null;
        String stackOut_16_1 = null;
        oa stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_32_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        var13 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var14 = param6.a(false);
            var8 = param1.a(false);
            if (param2 == -9) {
              L1: {
                if (null != nk.field_b) {
                  break L1;
                } else {
                  if (gk.a(false, 127)) {
                    break L1;
                  } else {
                    stackOut_6_0 = -1;
                    stackIn_7_0 = stackOut_6_0;
                    return stackIn_7_0;
                  }
                }
              }
              L2: {
                if (lj.field_z == jk.field_y) {
                  L3: {
                    ch.field_f = null;
                    ff.field_D.field_h = 0;
                    if (param3 != null) {
                      L4: {
                        var9 = 0;
                        if (param5) {
                          var9 = var9 | 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -94, d.field_c.nextInt());
                        d.field_d.a(param2 ^ 110, d.field_c.nextInt());
                        d.field_d.a(var14, 123);
                        d.field_d.a(var8, 125);
                        var15 = (CharSequence) (Object) param3;
                        d.field_d.a(ob.a((byte) 107, var15), param2 ^ -120);
                        d.field_d.c(param4, -159688920);
                        d.field_d.f(6389, param0);
                        d.field_d.f(6389, var9);
                        ff.field_D.f(6389, 18);
                        ff.field_D.field_h = ff.field_D.field_h + 2;
                        var10 = ff.field_D.field_h;
                        var11_ref_String = wk.a(ha.b(116), (byte) -45);
                        if (var11_ref_String == null) {
                          var11_ref_String = "";
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ff.field_D.a(92, var11_ref_String);
                      bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -123, d.field_d);
                      ff.field_D.b(-109, ff.field_D.field_h - var10);
                      break L3;
                    } else {
                      L6: {
                        d.field_d.field_h = 0;
                        d.field_d.a(param2 + -96, d.field_c.nextInt());
                        d.field_d.a(-103, d.field_c.nextInt());
                        stackOut_11_0 = d.field_d;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (param6.a((byte) -121)) {
                          stackOut_13_0 = (oa) (Object) stackIn_13_0;
                          stackOut_13_1 = (String) var14;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L6;
                        } else {
                          stackOut_12_0 = (oa) (Object) stackIn_12_0;
                          stackOut_12_1 = "";
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L6;
                        }
                      }
                      L7: {
                        ((oa) (Object) stackIn_14_0).a(stackIn_14_1, 126);
                        stackOut_14_0 = d.field_d;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (param1.a((byte) -121)) {
                          stackOut_16_0 = (oa) (Object) stackIn_16_0;
                          stackOut_16_1 = (String) var8;
                          stackIn_17_0 = stackOut_16_0;
                          stackIn_17_1 = stackOut_16_1;
                          break L7;
                        } else {
                          stackOut_15_0 = (oa) (Object) stackIn_15_0;
                          stackOut_15_1 = "";
                          stackIn_17_0 = stackOut_15_0;
                          stackIn_17_1 = stackOut_15_1;
                          break L7;
                        }
                      }
                      ((oa) (Object) stackIn_17_0).a(stackIn_17_1, param2 ^ -117);
                      ff.field_D.f(6389, 16);
                      ff.field_D.field_h = ff.field_D.field_h + 1;
                      var9 = ff.field_D.field_h;
                      bj.a(kb.field_p, q.field_f, (oa) (Object) ff.field_D, (byte) -108, d.field_d);
                      ff.field_D.a((byte) -42, -var9 + ff.field_D.field_h);
                      break L3;
                    }
                  }
                  rb.a(-1, -377);
                  lj.field_z = vf.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L8: {
                if (vf.field_b != lj.field_z) {
                  break L8;
                } else {
                  if (!ue.a(1, 0)) {
                    break L8;
                  } else {
                    L9: {
                      var9 = nf.field_l.d((byte) 97);
                      nf.field_l.field_h = 0;
                      if (var9 < 100) {
                        break L9;
                      } else {
                        if (var9 > 105) {
                          break L9;
                        } else {
                          lj.field_z = aa.field_b;
                          wh.field_F = new String[var9 + -100];
                          break L8;
                        }
                      }
                    }
                    if (var9 != 248) {
                      if (99 != var9) {
                        lj.field_z = gg.field_f;
                        tg.field_a = -1;
                        ca.field_e = var9;
                        break L8;
                      } else {
                        boolean discarded$1 = ue.a(jk.a((byte) -114), 0);
                        ch.field_f = new Boolean(oh.a((byte) -87, (oa) (Object) nf.field_l));
                        nf.field_l.field_h = 0;
                        break L8;
                      }
                    } else {
                      tb.a(ha.b(param2 ^ -66), true);
                      Transmogrify.field_B = nj.field_j;
                      pc.a(1);
                      ej.field_k = false;
                      stackOut_32_0 = var9;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0;
                    }
                  }
                }
              }
              L10: {
                if (aa.field_b != lj.field_z) {
                  break L10;
                } else {
                  var9 = 2;
                  if (ue.a(var9, 0)) {
                    var10 = nf.field_l.a((byte) -102);
                    nf.field_l.field_h = 0;
                    if (!ue.a(var10, 0)) {
                      break L10;
                    } else {
                      var11 = wh.field_F.length;
                      var12 = 0;
                      L11: while (true) {
                        if (var11 <= var12) {
                          pc.a(1);
                          ej.field_k = false;
                          stackOut_44_0 = var11 + 100;
                          stackIn_45_0 = stackOut_44_0;
                          return stackIn_45_0;
                        } else {
                          wh.field_F[var12] = nf.field_l.e(26);
                          var12++;
                          continue L11;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L12: {
                if (gg.field_f == lj.field_z) {
                  if (ce.a(0)) {
                    L13: {
                      if (ca.field_e == 255) {
                        var9_ref_String = nf.field_l.j(-1640531527);
                        if (var9_ref_String == null) {
                          break L13;
                        } else {
                          v.a(0, var9_ref_String, ha.b(114));
                          break L13;
                        }
                      } else {
                        Transmogrify.field_B = nf.field_l.g(param2 + 12257);
                        break L13;
                      }
                    }
                    pc.a(1);
                    ej.field_k = false;
                    stackOut_54_0 = ca.field_e;
                    stackIn_55_0 = stackOut_54_0;
                    return stackIn_55_0;
                  } else {
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L14: {
                if (null != nk.field_b) {
                  break L14;
                } else {
                  if (ej.field_k) {
                    L15: {
                      if (mc.b(true) <= 30000L) {
                        Transmogrify.field_B = bd.field_s;
                        break L15;
                      } else {
                        Transmogrify.field_B = ng.field_h;
                        break L15;
                      }
                    }
                    ej.field_k = false;
                    stackOut_62_0 = 249;
                    stackIn_63_0 = stackOut_62_0;
                    return stackIn_63_0;
                  } else {
                    var9 = lf.field_c;
                    lf.field_c = kf.field_p;
                    kf.field_p = var9;
                    ej.field_k = true;
                    break L14;
                  }
                }
              }
              stackOut_64_0 = -1;
              stackIn_65_0 = stackOut_64_0;
              break L0;
            } else {
              stackOut_2_0 = -40;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var7;
            stackOut_66_1 = new StringBuilder().append("jd.C(").append(param0).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L16;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L16;
            }
          }
          L17: {
            stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
            stackOut_69_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(44).append(param2).append(44);
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param3 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L17;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L17;
            }
          }
          L18: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param6 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L18;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L18;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 41);
        }
        return stackIn_65_0;
    }

    static {
    }
}
