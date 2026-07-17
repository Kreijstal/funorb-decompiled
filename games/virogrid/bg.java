/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bg extends km {
    private km field_Kb;
    private km[] field_Hb;
    private int field_Nb;
    private StringBuilder field_Ib;
    private km field_Qb;
    private km field_Eb;
    long field_Mb;
    private en field_Jb;
    static String field_Pb;
    private km field_Ob;
    private km field_Fb;
    static ml field_Lb;
    private km field_Gb;

    public static void g(int param0) {
        field_Lb = null;
        field_Pb = null;
        if (param0 != 0) {
            field_Pb = null;
        }
    }

    private final int a(km param0, km param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            param3 += 8;
            var6_int = param1.field_C.a(param1.field_V, -(2 * param1.field_z) + param4, param1.field_fb);
            param1.a(0, var6_int, param4, (byte) -66, param3);
            param3 = param3 + var6_int;
            if (param2 >= 37) {
              param0.a(0, param1);
              stackOut_3_0 = param3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 122;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var6;
            stackOut_5_1 = new StringBuilder().append("bg.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_4_0;
    }

    bg(int param0, int param1, int param2, int param3, int param4, km param5, km param6, km param7, km param8, en param9, km param10, String param11, long param12) {
        super(0L, param5);
        RuntimeException var15 = null;
        int var15_int = 0;
        km[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        km[] var28 = null;
        Object stackIn_5_0 = null;
        en stackIn_5_1 = null;
        en stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        en stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        en stackIn_6_1 = null;
        en stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        en stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        en stackIn_7_1 = null;
        en stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        en stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        en stackIn_8_1 = null;
        en stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        en stackIn_8_4 = null;
        String stackIn_8_5 = null;
        km stackIn_13_0 = null;
        km stackIn_14_0 = null;
        km stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        en stackOut_4_1 = null;
        en stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        en stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        en stackOut_5_1 = null;
        en stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        en stackOut_5_4 = null;
        Object stackOut_7_0 = null;
        en stackOut_7_1 = null;
        en stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        en stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_6_0 = null;
        en stackOut_6_1 = null;
        en stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        en stackOut_6_4 = null;
        String stackOut_6_5 = null;
        km stackOut_12_0 = null;
        km stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        km stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        ((bg) this).field_Nb = -2;
        try {
          L0: {
            L1: {
              ((bg) this).field_Mb = param12;
              ((bg) this).field_Ob = new km(0L, param6, we.field_i.toUpperCase());
              ((bg) this).field_Ob.field_lb = 1;
              ((bg) this).a(0, ((bg) this).field_Ob);
              ((bg) this).field_Qb = new km(0L, param7);
              ((bg) this).field_Ob.a(0, ((bg) this).field_Qb);
              ((bg) this).field_Gb = new km(0L, (km) null);
              ((bg) this).a(0, ((bg) this).field_Gb);
              if (param11 == null) {
                ((bg) this).field_Fb = new km(0L, param8, ji.field_a);
                ((bg) this).field_Fb.field_E = 11184810;
                ((bg) this).field_Fb.field_lb = 1;
                ((bg) this).field_Gb.a(0, ((bg) this).field_Fb);
                var15_int = 226;
                var16 = 10;
                var17 = ((bg) this).field_Fb.field_C.b(((bg) this).field_Fb.field_V, var15_int);
                ((bg) this).field_Fb.a(13, pg.field_e * var17, var15_int, (byte) -78, var16);
                var16 = var16 + var17 * pg.field_e;
                ((bg) this).field_Gb.a(0, var16 + 10, 13 + (13 - -var15_int), (byte) -45, 24);
                ((bg) this).field_Gb.field_vb = ne.a(((bg) this).field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
                var18 = var15_int + 26;
                var19 = var16 + 34;
                var20 = sh.b(0, param2, param0, var18);
                var21 = p.a(-1, var19, param1, param3);
                ((bg) this).a(var20, var19, var18, (byte) -104, var21);
                break L1;
              } else {
                L2: {
                  L3: {
                    ((bg) this).field_Fb = new km(0L, param8, qa.field_f);
                    ((bg) this).field_Fb.field_lb = 1;
                    ((bg) this).field_Fb.field_E = 11184810;
                    ((bg) this).field_Gb.a(0, ((bg) this).field_Fb);
                    ((bg) this).field_Eb = new km(0L, param8, jf.field_l);
                    ((bg) this).field_Eb.field_lb = 1;
                    ((bg) this).field_Eb.field_E = 11184810;
                    ((bg) this).field_Gb.a(0, ((bg) this).field_Eb);
                    ((bg) this).field_Kb = new km(0L, param8);
                    ((bg) this).field_Kb.field_E = 16764006;
                    ((bg) this).field_Gb.a(0, ((bg) this).field_Kb);
                    ((bg) this).field_Kb.field_eb = "|";
                    if (og.field_s >= 5) {
                      break L3;
                    } else {
                      if (hd.field_d < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_4_0 = this;
                      stackOut_4_1 = null;
                      stackOut_4_2 = null;
                      stackOut_4_3 = 0L;
                      stackOut_4_4 = (en) param9;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      stackIn_6_4 = stackOut_4_4;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      stackIn_5_3 = stackOut_4_3;
                      stackIn_5_4 = stackOut_4_4;
                      if (og.field_s >= 7) {
                        break L5;
                      } else {
                        stackOut_5_0 = this;
                        stackOut_5_1 = null;
                        stackOut_5_2 = null;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = (en) (Object) stackIn_5_4;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        stackIn_6_3 = stackOut_5_3;
                        stackIn_6_4 = stackOut_5_4;
                        if (hd.field_d < 2) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = null;
                          stackOut_7_2 = null;
                          stackOut_7_3 = stackIn_7_3;
                          stackOut_7_4 = (en) (Object) stackIn_7_4;
                          stackOut_7_5 = ai.field_i;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          stackIn_8_3 = stackOut_7_3;
                          stackIn_8_4 = stackOut_7_4;
                          stackIn_8_5 = stackOut_7_5;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_6_0 = this;
                    stackOut_6_1 = null;
                    stackOut_6_2 = null;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = (en) (Object) stackIn_6_4;
                    stackOut_6_5 = ne.field_d;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    break L4;
                  }
                  ((bg) this).field_Jb = new en(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  ((bg) this).field_Gb.a(0, (km) (Object) ((bg) this).field_Jb);
                  break L2;
                }
                var28 = new km[3];
                var15_array = var28;
                var28[0] = new km(0L, (km) null);
                ((bg) this).field_Gb.a(0, var28[0]);
                var28[1] = new km(0L, (km) null);
                ((bg) this).field_Gb.a(0, var28[1]);
                var28[2] = new km(0L, (km) null);
                ((bg) this).field_Gb.a(0, var28[2]);
                ((bg) this).field_Hb = new km[ad.field_c];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= ad.field_c) {
                    L7: {
                      ((bg) this).field_Ib = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        StringBuilder discarded$1 = ((bg) this).field_Ib.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_C.a(jg.field_c);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_C.a(hn.field_s);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_C.a(gd.field_p);
                      if (var16 >= var17) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= ad.field_c) {
                        L12: {
                          if (140 >= var16) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(var18, -61, var28[0], var16, jg.field_c, param6);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[6], 99, var18, var16);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[9], 108, var18, var16);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[5], 124, var18, var16);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[7], 56, var18, var16);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[15], 92, var18, var16);
                          var18 = this.a(var28[0], ((bg) this).field_Hb[4], 45, var18, var16);
                          if (var17 >= var18) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(var18, -40, var28[1], var16, hn.field_s, param6);
                          var18 = this.a(var28[1], ((bg) this).field_Hb[16], 69, var18, var16);
                          var18 = this.a(var28[1], ((bg) this).field_Hb[17], 41, var18, var16);
                          var18 = this.a(var28[1], ((bg) this).field_Hb[18], 58, var18, var16);
                          var18 = this.a(var28[1], ((bg) this).field_Hb[19], 81, var18, var16);
                          var18 = this.a(var28[1], ((bg) this).field_Hb[20], 102, var18, var16);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(var18, -97, var28[2], var16, gd.field_p, param6);
                          var18 = this.a(var28[2], ((bg) this).field_Hb[13], 56, var18, var16);
                          var18 = this.a(var28[2], ((bg) this).field_Hb[21], 71, var18, var16);
                          var18 = this.a(var28[2], ((bg) this).field_Hb[11], 65, var18, var16);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 3 * var16 + 26;
                          var20 = ((bg) this).field_Ob.c((byte) 40);
                          if (var20 <= var19) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == ((bg) this).field_Jb) {
                            break L17;
                          } else {
                            var20 = ((bg) this).field_Jb.a((byte) -126, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          ((bg) this).field_Ob.a(0, 24, var19 + 26, (byte) -117, 0);
                          ((bg) this).field_Qb.a(((bg) this).field_Ob.field_K - 20, 15, 15, (byte) -119, 5);
                          var21 = 10;
                          ((bg) this).field_Fb.a(13, pg.field_e * 2, var19, (byte) -110, var21);
                          var21 = var21 + 2 * pg.field_e;
                          ((bg) this).field_Eb.a(13, pg.field_e * 2, var19, (byte) -41, var21);
                          var21 = var21 + (10 + 2 * pg.field_e);
                          ((bg) this).field_Kb.a(0, pg.field_e, 0, (byte) -83, var21);
                          var21 = var21 + (pg.field_e + 10);
                          if (((bg) this).field_Jb == null) {
                            break L18;
                          } else {
                            var20 = ((bg) this).field_Jb.a((byte) -128, 4);
                            ((bg) this).field_Jb.a(var20, 4, 13 - -((var19 - var20) / 2), (byte) -127, pg.field_e, var21);
                            var21 = var21 + (10 + pg.field_e);
                            break L18;
                          }
                        }
                        var28[0].a(13, var17, var16, (byte) -95, var21);
                        var28[1].a(26 + var16, var17, var16, (byte) -108, var21);
                        var28[2].a(39 - -(var16 * 2), var17, var16, (byte) -60, var21);
                        var22 = var21;
                        ((bg) this).field_Gb.a(0, var22 - (-var17 - 10), 13 + (var19 + 13), (byte) -92, 24);
                        ((bg) this).field_Gb.field_vb = ne.a(((bg) this).field_Gb.field_ub, 3, 2105376, (byte) 106, 8421504, 11579568);
                        var23 = var19 + 26;
                        var24 = var22 + 24 + var17 - -10;
                        var25 = sh.b(0, param2, param0, var23);
                        var26 = p.a(-1, var24, param1, param3);
                        ((bg) this).a(var25, var24, var23, (byte) -124, var26);
                        break L1;
                      } else {
                        L19: {
                          if (((bg) this).field_Hb[var17] == null) {
                            break L19;
                          } else {
                            var18 = ((bg) this).field_Hb[var17].c((byte) 33);
                            if (var16 >= var18) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (null == se.field_f[var16]) {
                        break L20;
                      } else {
                        L21: {
                          ((bg) this).field_Hb[var16] = new km(0L, param10, se.field_f[var16]);
                          ((bg) this).field_Hb[var16].field_lb = 0;
                          stackOut_12_0 = ((bg) this).field_Hb[var16];
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (param11 == null) {
                            stackOut_14_0 = (km) (Object) stackIn_14_0;
                            stackOut_14_1 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            break L21;
                          } else {
                            stackOut_13_0 = (km) (Object) stackIn_13_0;
                            stackOut_13_1 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_Y = stackIn_15_1 != 0;
                        ((bg) this).field_Gb.a(0, ((bg) this).field_Hb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var15;
            stackOut_49_1 = new StringBuilder().append("bg.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          L23: {
            stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L23;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L23;
            }
          }
          L24: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(44);
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L24;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L24;
            }
          }
          L25: {
            stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param8 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L25;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L25;
            }
          }
          L26: {
            stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(44);
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param9 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L26;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L26;
            }
          }
          L27: {
            stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param10 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L27;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L27;
            }
          }
          L28: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param11 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param12 + 41);
        }
    }

    final static boolean f() {
        int var1 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var1 = 82;
            if (oj.field_Ub == null) {
              break L1;
            } else {
              if (!ug.field_a.a(false)) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 140) {
            break L0;
          } else {
            ((bg) this).field_Gb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((bg) this).field_Jb == null) {
              break L2;
            } else {
              if (!((bg) this).field_Jb.field_xb) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final boolean d(boolean param0) {
        if (param0) {
            bg.g(-40);
        }
        if (!(((bg) this).field_Nb == -2)) {
            return false;
        }
        if (um.field_Gb == 13) {
            ((bg) this).field_Nb = -1;
            return true;
        }
        return true;
    }

    final String e(byte param0) {
        if (param0 != -72) {
            return null;
        }
        return ((bg) this).field_Ib.toString();
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        en stackIn_5_0 = null;
        en stackIn_6_0 = null;
        en stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        km stackIn_13_0 = null;
        km stackIn_14_0 = null;
        km stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        en stackOut_4_0 = null;
        en stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        en stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        km stackOut_12_0 = null;
        km stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        km stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          ((bg) this).a(param1, (byte) 119);
          if (null != ((bg) this).field_Kb) {
            L1: {
              ((bg) this).field_Kb.field_V = ((bg) this).field_Ib.toString();
              ((bg) this).field_Kb.field_tb = (((bg) this).field_K - ((bg) this).field_Kb.field_C.a(((bg) this).field_Kb.field_V)) / 2;
              if (((bg) this).field_Jb == null) {
                break L1;
              } else {
                if (0 == ((bg) this).field_Jb.field_nb) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = ((bg) this).field_Jb;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((bg) this).field_Jb.field_xb) {
                      stackOut_6_0 = (en) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (en) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_xb = stackIn_7_1 != 0;
                  break L1;
                }
              }
            }
            ((bg) this).field_Kb.field_K = -((bg) this).field_Kb.field_tb + ((bg) this).field_K;
            var3 = 0;
            L3: while (true) {
              if (var3 >= ad.field_c) {
                break L0;
              } else {
                if (null != ((bg) this).field_Hb[var3]) {
                  L4: {
                    stackOut_12_0 = ((bg) this).field_Hb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((bg) this).field_Ib.length() <= 0) {
                      stackOut_14_0 = (km) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (km) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_Y = stackIn_15_1 != 0;
                  if (((bg) this).field_Hb[var3].field_Y) {
                    if (((bg) this).field_Hb[var3].field_nb != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (((bg) this).field_Qb.field_nb == 0) {
          if (param0 == 2105376) {
            L5: {
              if (!param1) {
                break L5;
              } else {
                if (0 == oi.field_g) {
                  break L5;
                } else {
                  if (((bg) this).field_nb == 0) {
                    return -1;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return ((bg) this).field_Nb;
          } else {
            return 9;
          }
        } else {
          return -1;
        }
    }

    private final int a(int param0, int param1, km param2, int param3, String param4, km param5) {
        km var7 = null;
        RuntimeException var7_ref = null;
        Object var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7 = new km(0L, param5, 0, param0, param3, 24, param4);
              param0 += 32;
              if (param1 < -10) {
                break L1;
              } else {
                var8 = null;
                int discarded$2 = this.a((km) null, (km) null, -49, 28, 48);
                break L1;
              }
            }
            param2.a(0, var7);
            stackOut_2_0 = param0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("bg.G(").append(param0).append(44).append(param1).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param3).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param4 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param5 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "Suggested names: ";
    }
}
