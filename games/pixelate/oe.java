/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class oe extends ak {
    static int field_Sb;
    private ak field_Tb;
    private ak field_Eb;
    private ak field_Fb;
    private fb field_Pb;
    private ak[] field_Lb;
    private int field_Jb;
    private ak field_Nb;
    long field_Ub;
    static int[] field_Hb;
    private ak field_Ob;
    static String field_Gb;
    static String field_Mb;
    static String field_Vb;
    private StringBuilder field_Ib;
    static byte[] field_Rb;
    static String field_Kb;
    private ak field_Qb;

    final boolean j(int param0) {
        if (-2 != ((oe) this).field_Jb) {
            return false;
        }
        if (ke.field_a == 13) {
            ((oe) this).field_Jb = -1;
        }
        if (param0 != -1) {
            field_Mb = null;
            return true;
        }
        return true;
    }

    oe(int param0, int param1, int param2, int param3, int param4, ak param5, ak param6, ak param7, ak param8, fb param9, ak param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        ak[] var15 = null;
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
        ak[] var28 = null;
        Object stackIn_4_0 = null;
        fb stackIn_4_1 = null;
        fb stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        fb stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        fb stackIn_5_1 = null;
        fb stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        fb stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        fb stackIn_6_1 = null;
        fb stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        fb stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        fb stackIn_7_1 = null;
        fb stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        fb stackIn_7_4 = null;
        String stackIn_7_5 = null;
        ak stackIn_12_0 = null;
        ak stackIn_13_0 = null;
        ak stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        fb stackOut_3_1 = null;
        fb stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        fb stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        fb stackOut_4_1 = null;
        fb stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        fb stackOut_4_4 = null;
        Object stackOut_6_0 = null;
        fb stackOut_6_1 = null;
        fb stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        fb stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_5_0 = null;
        fb stackOut_5_1 = null;
        fb stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        fb stackOut_5_4 = null;
        String stackOut_5_5 = null;
        ak stackOut_11_0 = null;
        ak stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ak stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((oe) this).field_Jb = -2;
          ((oe) this).field_Ub = param12;
          ((oe) this).field_Eb = new ak(0L, param6, qo.field_m.toUpperCase());
          ((oe) this).field_Eb.field_Bb = 1;
          ((oe) this).a(((oe) this).field_Eb, (byte) 26);
          ((oe) this).field_Ob = new ak(0L, param7);
          ((oe) this).field_Eb.a(((oe) this).field_Ob, (byte) 26);
          ((oe) this).field_Qb = new ak(0L, (ak) null);
          ((oe) this).a(((oe) this).field_Qb, (byte) 26);
          if (param11 == null) {
            ((oe) this).field_Tb = new ak(0L, param8, im.field_Lb);
            ((oe) this).field_Tb.field_Bb = 1;
            ((oe) this).field_Tb.field_N = 11184810;
            ((oe) this).field_Qb.a(((oe) this).field_Tb, (byte) 26);
            var15_int = 226;
            var16 = 10;
            var17 = ((oe) this).field_Tb.field_Db.b(((oe) this).field_Tb.field_cb, var15_int);
            ((oe) this).field_Tb.a(var16, var17 * fq.field_q, 13, 256, var15_int);
            var16 = var16 + var17 * fq.field_q;
            ((oe) this).field_Qb.a(24, var16 + 10, 0, 256, 13 + (var15_int + 13));
            int discarded$5 = 3;
            ((oe) this).field_Qb.field_zb = op.a(8421504, 16, 11579568, ((oe) this).field_Qb.field_nb, 2105376);
            var18 = 13 - (-var15_int - 13);
            var19 = 34 - -var16;
            int discarded$6 = -1;
            var20 = ui.a(param2, param0, var18);
            var21 = pj.a(var19, param1, param3, (byte) 32);
            ((oe) this).a(var21, var19, var20, 256, var18);
            break L0;
          } else {
            L1: {
              L2: {
                ((oe) this).field_Tb = new ak(0L, param8, ge.field_d);
                ((oe) this).field_Tb.field_N = 11184810;
                ((oe) this).field_Tb.field_Bb = 1;
                ((oe) this).field_Qb.a(((oe) this).field_Tb, (byte) 26);
                ((oe) this).field_Fb = new ak(0L, param8, no.field_j);
                ((oe) this).field_Fb.field_N = 11184810;
                ((oe) this).field_Fb.field_Bb = 1;
                ((oe) this).field_Qb.a(((oe) this).field_Fb, (byte) 26);
                ((oe) this).field_Nb = new ak(0L, param8);
                ((oe) this).field_Nb.field_N = 16764006;
                ((oe) this).field_Qb.a(((oe) this).field_Nb, (byte) 26);
                ((oe) this).field_Nb.field_qb = "|";
                if (rj.field_I >= 5) {
                  break L2;
                } else {
                  if (wo.field_h < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_3_0 = this;
                  stackOut_3_1 = null;
                  stackOut_3_2 = null;
                  stackOut_3_3 = 0L;
                  stackOut_3_4 = (fb) param9;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  stackIn_5_3 = stackOut_3_3;
                  stackIn_5_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (rj.field_I >= 7) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (fb) (Object) stackIn_4_4;
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
                    if (wo.field_h < 2) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (fb) (Object) stackIn_6_4;
                      stackOut_6_5 = wi.field_c;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      stackIn_7_3 = stackOut_6_3;
                      stackIn_7_4 = stackOut_6_4;
                      stackIn_7_5 = stackOut_6_5;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                stackOut_5_0 = this;
                stackOut_5_1 = null;
                stackOut_5_2 = null;
                stackOut_5_3 = stackIn_5_3;
                stackOut_5_4 = (fb) (Object) stackIn_5_4;
                stackOut_5_5 = nh.field_d;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_7_5 = stackOut_5_5;
                break L3;
              }
              ((oe) this).field_Pb = new fb(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((oe) this).field_Qb.a((ak) (Object) ((oe) this).field_Pb, (byte) 26);
              break L1;
            }
            var28 = new ak[3];
            var15 = var28;
            var28[0] = new ak(0L, (ak) null);
            ((oe) this).field_Qb.a(var28[0], (byte) 26);
            var28[1] = new ak(0L, (ak) null);
            ((oe) this).field_Qb.a(var28[1], (byte) 26);
            var28[2] = new ak(0L, (ak) null);
            ((oe) this).field_Qb.a(var28[2], (byte) 26);
            ((oe) this).field_Lb = new ak[d.field_b];
            var16 = 0;
            L5: while (true) {
              if (d.field_b <= var16) {
                L6: {
                  ((oe) this).field_Ib = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$7 = ((oe) this).field_Ib.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_Db.c(bh.field_l);
                  if (~var17 >= ~var16) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_Db.c(km.field_t);
                  if (~var17 >= ~var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_Db.c(lh.field_j);
                  if (var16 >= var17) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (~d.field_b >= ~var17) {
                    L11: {
                      if (var16 <= 140) {
                        break L11;
                      } else {
                        var16 = 140;
                        break L11;
                      }
                    }
                    L12: {
                      var17 = 0;
                      var18 = 0;
                      var18 = 0;
                      var18 = this.a((byte) 126, var18, param6, var16, var28[0], bh.field_l);
                      var18 = this.a(var28[0], var18, (byte) 110, var16, ((oe) this).field_Lb[6]);
                      var18 = this.a(var28[0], var18, (byte) 112, var16, ((oe) this).field_Lb[9]);
                      var18 = this.a(var28[0], var18, (byte) 101, var16, ((oe) this).field_Lb[5]);
                      var18 = this.a(var28[0], var18, (byte) 126, var16, ((oe) this).field_Lb[7]);
                      var18 = this.a(var28[0], var18, (byte) 98, var16, ((oe) this).field_Lb[15]);
                      var18 = this.a(var28[0], var18, (byte) 108, var16, ((oe) this).field_Lb[4]);
                      if (var17 >= var18) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a((byte) 112, var18, param6, var16, var28[1], km.field_t);
                      var18 = this.a(var28[1], var18, (byte) 114, var16, ((oe) this).field_Lb[16]);
                      var18 = this.a(var28[1], var18, (byte) 95, var16, ((oe) this).field_Lb[17]);
                      var18 = this.a(var28[1], var18, (byte) 95, var16, ((oe) this).field_Lb[18]);
                      var18 = this.a(var28[1], var18, (byte) 99, var16, ((oe) this).field_Lb[19]);
                      var18 = this.a(var28[1], var18, (byte) 108, var16, ((oe) this).field_Lb[20]);
                      if (var17 >= var18) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a((byte) 114, var18, param6, var16, var28[2], lh.field_j);
                      var18 = this.a(var28[2], var18, (byte) 94, var16, ((oe) this).field_Lb[13]);
                      var18 = this.a(var28[2], var18, (byte) 98, var16, ((oe) this).field_Lb[21]);
                      var18 = this.a(var28[2], var18, (byte) 120, var16, ((oe) this).field_Lb[11]);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + var16 * 3;
                      var20 = ((oe) this).field_Eb.g(0);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((oe) this).field_Pb == null) {
                        break L16;
                      } else {
                        var20 = ((oe) this).field_Pb.b((byte) 115, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((oe) this).field_Eb.a(0, 24, 0, 256, 13 + (var19 + 13));
                      ((oe) this).field_Ob.a(5, 15, ((oe) this).field_Eb.field_K - 20, 256, 15);
                      var21 = 10;
                      ((oe) this).field_Tb.a(var21, 2 * fq.field_q, 13, 256, var19);
                      var21 = var21 + 2 * fq.field_q;
                      ((oe) this).field_Fb.a(var21, 2 * fq.field_q, 13, 256, var19);
                      var21 = var21 + (fq.field_q * 2 - -10);
                      ((oe) this).field_Nb.a(var21, fq.field_q, 0, 256, 0);
                      var21 = var21 + (fq.field_q + 10);
                      if (((oe) this).field_Pb == null) {
                        break L17;
                      } else {
                        var20 = ((oe) this).field_Pb.b((byte) 115, 4);
                        ((oe) this).field_Pb.a(fq.field_q, (var19 + -var20) / 2 + 13, var21, var20, 4, 0);
                        var21 = var21 + (fq.field_q - -10);
                        break L17;
                      }
                    }
                    var28[0].a(var21, var17, 13, 256, var16);
                    var28[1].a(var21, var17, 26 - -var16, 256, var16);
                    var28[2].a(var21, var17, 39 - -(2 * var16), 256, var16);
                    var22 = var21;
                    ((oe) this).field_Qb.a(24, var17 + (var22 + 10), 0, 256, 13 + (var19 + 13));
                    int discarded$8 = 3;
                    ((oe) this).field_Qb.field_zb = op.a(8421504, 16, 11579568, ((oe) this).field_Qb.field_nb, 2105376);
                    var23 = 13 + (var19 + 13);
                    var24 = var17 + (24 - -var22) + 10;
                    int discarded$9 = -1;
                    var25 = ui.a(param2, param0, var23);
                    var26 = pj.a(var24, param1, param3, (byte) 110);
                    ((oe) this).a(var26, var24, var25, 256, var23);
                    break L0;
                  } else {
                    L18: {
                      if (null == ((oe) this).field_Lb[var17]) {
                        break L18;
                      } else {
                        var18 = ((oe) this).field_Lb[var17].g(0);
                        if (var16 >= var18) {
                          break L18;
                        } else {
                          var16 = var18;
                          break L18;
                        }
                      }
                    }
                    var17++;
                    continue L10;
                  }
                }
              } else {
                L19: {
                  if (null == cd.field_e[var16]) {
                    break L19;
                  } else {
                    L20: {
                      ((oe) this).field_Lb[var16] = new ak(0L, param10, cd.field_e[var16]);
                      ((oe) this).field_Lb[var16].field_Bb = 0;
                      stackOut_11_0 = ((oe) this).field_Lb[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (ak) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (ak) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_rb = stackIn_14_1 != 0;
                    ((oe) this).field_Qb.a(((oe) this).field_Lb[var16], (byte) 26);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          }
        }
    }

    private final int a(byte param0, int param1, ak param2, int param3, ak param4, String param5) {
        ak var7 = null;
        RuntimeException var7_ref = null;
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
              var7 = new ak(0L, param2, 0, param1, param3, 24, param5);
              if (param0 >= 111) {
                break L1;
              } else {
                ((oe) this).field_Ob = null;
                break L1;
              }
            }
            param1 += 32;
            param4.a(var7, (byte) 26);
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("oe.E(").append(param0).append(44).append(param1).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final static java.awt.Canvas b(byte param0) {
        if (param0 > -68) {
            oe.m(38);
        }
        return ib.field_f == null ? ec.field_u : (java.awt.Canvas) (Object) ib.field_f;
    }

    final int a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        fb stackIn_6_0 = null;
        fb stackIn_7_0 = null;
        fb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ak stackIn_14_0 = null;
        ak stackIn_15_0 = null;
        ak stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        fb stackOut_5_0 = null;
        fb stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        fb stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ak stackOut_13_0 = null;
        ak stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        ak stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          ((oe) this).a(-28476, param1);
          if (((oe) this).field_Nb != null) {
            L1: {
              ((oe) this).field_Nb.field_cb = ((oe) this).field_Ib.toString();
              ((oe) this).field_Nb.field_D = (((oe) this).field_K + -((oe) this).field_Nb.field_Db.c(((oe) this).field_Nb.field_cb)) / 2;
              ((oe) this).field_Nb.field_K = -((oe) this).field_Nb.field_D + ((oe) this).field_K;
              if (null == ((oe) this).field_Pb) {
                break L1;
              } else {
                if (((oe) this).field_Pb.field_P != 0) {
                  L2: {
                    stackOut_5_0 = ((oe) this).field_Pb;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((oe) this).field_Pb.field_U) {
                      stackOut_7_0 = (fb) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (fb) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_U = stackIn_8_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (d.field_b <= var3) {
                break L0;
              } else {
                L4: {
                  if (((oe) this).field_Lb[var3] != null) {
                    L5: {
                      stackOut_13_0 = ((oe) this).field_Lb[var3];
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (0 >= ((oe) this).field_Ib.length()) {
                        stackOut_15_0 = (ak) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L5;
                      } else {
                        stackOut_14_0 = (ak) (Object) stackIn_14_0;
                        stackOut_14_1 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L5;
                      }
                    }
                    stackIn_16_0.field_rb = stackIn_16_1 != 0;
                    if (!((oe) this).field_Lb[var3].field_rb) {
                      break L4;
                    } else {
                      if (((oe) this).field_Lb[var3].field_P == 0) {
                        break L4;
                      } else {
                        return var3;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                var3++;
                continue L3;
              }
            }
          } else {
            break L0;
          }
        }
        L6: {
          if (param0 > 30) {
            break L6;
          } else {
            ((oe) this).field_Ob = null;
            break L6;
          }
        }
        if (((oe) this).field_Ob.field_P == 0) {
          L7: {
            if (!param1) {
              break L7;
            } else {
              if (nm.field_c == 0) {
                break L7;
              } else {
                if (((oe) this).field_P == 0) {
                  return -1;
                } else {
                  break L7;
                }
              }
            }
          }
          return ((oe) this).field_Jb;
        } else {
          return -1;
        }
    }

    public static void m(int param0) {
        field_Kb = null;
        field_Gb = null;
        field_Hb = null;
        field_Mb = null;
        if (param0 != 1) {
            java.awt.Canvas discarded$0 = oe.b((byte) -8);
        }
        field_Rb = null;
        field_Vb = null;
    }

    final static void a(int param0, fm param1, hh[] param2, int[] param3, fm param4) {
        hh[] var5 = null;
        int[] var6 = null;
        hh[] var6_array = null;
        int var7_int = 0;
        tc var7 = null;
        ak var8 = null;
        ak var9 = null;
        ak var10 = null;
        ak var11 = null;
        tf[] var12 = null;
        tf[] var13 = null;
        tf[] var14 = null;
        ak var15 = null;
        tf[] var16 = null;
        tf[] var17 = null;
        int var18 = 0;
        int[] var19 = null;
        L0: {
          var18 = Pixelate.field_H ? 1 : 0;
          var5 = lb.a(param1, 47, "lobby", "crowns");
          kk.field_s = var5.length;
          if (param2 == null) {
            break L0;
          } else {
            var6_array = new hh[param2.length + kk.field_s];
            var7_int = 0;
            L1: while (true) {
              if (kk.field_s <= var7_int) {
                var7_int = 0;
                L2: while (true) {
                  if (var7_int >= param2.length) {
                    var5 = var6_array;
                    break L0;
                  } else {
                    var6_array[var7_int + kk.field_s] = param2[var7_int];
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
        var19 = new int[var5.length];
        var6 = var19;
        var7_int = 0;
        L3: while (true) {
          if (kk.field_s <= var7_int) {
            L4: {
              if (param2 != null) {
                if (param3 != null) {
                  var7_int = 0;
                  L5: while (true) {
                    if (param2.length <= var7_int) {
                      break L4;
                    } else {
                      var6[var7_int + kk.field_s] = param3[var7_int];
                      var7_int++;
                      continue L5;
                    }
                  }
                } else {
                  var7_int = 0;
                  L6: while (true) {
                    if (var7_int >= param2.length) {
                      break L4;
                    } else {
                      var6[var7_int + kk.field_s] = param2[var7_int].field_a;
                      var7_int++;
                      continue L6;
                    }
                  }
                }
              } else {
                break L4;
              }
            }
            v.field_c = 4;
            fq.field_q = 15;
            nc.field_d = 11;
            r.field_c = 2;
            hd.field_q = 2;
            var7 = bf.a(0, param4, "largefont", param1, "lobby");
            ig.field_d = bf.a(0, param4, "generalfont", param1, "lobby");
            c.field_Y = bf.a(0, param4, "chatfont", param1, "lobby");
            var7.a((sl[]) (Object) var5, var6);
            ig.field_d.a((sl[]) (Object) var5, var6);
            c.field_Y.a((sl[]) (Object) var5, var6);
            var8 = new ak(0L, (ak) null);
            var8.field_mb = fq.field_q;
            var8.field_N = 16777215;
            var8.field_Db = (jl) (Object) var7;
            var8.field_kb = 1;
            var9 = var8;
            var9.field_Bb = 1;
            var10 = new ak(0L, (ak) null);
            var10.field_Db = (jl) (Object) ig.field_d;
            var10.field_mb = fq.field_q;
            var10.field_N = 16777215;
            var10.field_kb = 1;
            var11 = var10;
            var11.field_Bb = 1;
            io.field_f = new ak(0L, var8);
            io.field_f.field_zb = al.a(false, eh.a("heading", "lobby", (byte) 47, param1));
            eg.field_k = new ak(0L, (ak) null);
            eg.field_k.field_zb = ve.a(false, false, 4210752, 120, true, 8421504);
            sc.field_g = new ak(0L, (ak) null);
            int discarded$7 = 3;
            sc.field_g.field_zb = op.a(6316128, 16, 6316128, 114, 1);
            po.field_c = new ak(0L, (ak) null);
            po.field_c.field_zb = al.a(false, eh.a("popup", "lobby", (byte) 47, param1));
            var12 = al.a(false, eh.a("popup_mouseover", "lobby", (byte) 47, param1));
            var13 = eh.a("button", "lobby", (byte) 47, param1);
            var14 = al.a(false, eh.a("tab_active", "lobby", (byte) 47, param1));
            pj.field_i = new ak(0L, var8);
            pj.field_i.field_zb = var14;
            ae.field_f = new ak(0L, (ak) null);
            ae.field_f.field_H = bi.a("lobby", "closebutton", param1, (byte) -127);
            ae.field_f.field_B = bi.a("lobby", "closebutton_mouseover", param1, (byte) -106);
            ff.field_j = new ak(0L, var8);
            ff.field_j.field_zb = ve.a(true, true, 2039583, 40, true, 3815994);
            u.field_l = new ak(0L, var10);
            u.field_l.field_C = 2;
            u.field_l.field_zb = ve.a(true, false, 2039583, 30, true, 3815994);
            vk.field_mb = new ak(0L, var10);
            vk.field_mb.field_C = 2;
            vk.field_mb.field_zb = ve.a(false, false, 2039583, 30, true, 3815994);
            ni.field_s = new ak(0L, var10);
            ni.field_s.field_C = 2;
            ni.field_s.field_zb = ve.a(false, true, 2039583, 30, true, 3815994);
            mg.field_h = new ak(0L, (ak) null);
            mg.field_h.field_kb = 1;
            mg.field_h.field_N = 13421772;
            mg.field_h.field_mb = fq.field_q;
            mg.field_h.field_Db = (jl) (Object) ig.field_d;
            dn.field_c = new ak(0L, mg.field_h);
            dn.field_c.field_Cb = 16777215;
            dn.field_c.field_pb = 16777215;
            dn.field_c.field_N = 16764006;
            dn.field_c.field_O = 8421504;
            dn.field_c.field_y = 16777215;
            var15 = new ak(0L, dn.field_c);
            var15.field_N = 16777215;
            var15.field_mb = fq.field_q;
            var15.field_Db = (jl) (Object) var7;
            kj.field_l = new ak(0L, mg.field_h);
            kj.field_l.field_zb = ve.a(false, false, 2236962, 16, true, 2236962);
            kj.field_l.field_C = 2;
            qk.field_d = new ak(0L, mg.field_h);
            qk.field_d.field_zb = ve.a(false, false, 1513239, 16, true, 1513239);
            qk.field_d.field_C = 2;
            if (param0 < -117) {
              of.field_i = new ak(0L, kj.field_l);
              of.field_i.a(-27813, dn.field_c);
              ak.field_T = new ak(0L, qk.field_d);
              ak.field_T.a(-27813, dn.field_c);
              var16 = eh.a("button_mouseover", "lobby", (byte) 47, param1);
              a.field_O = new pi(po.field_c, var12, mg.field_h, dn.field_c, 3, 2, hd.field_q, 3, fq.field_q);
              lc.field_q = new ak(0L, dn.field_c);
              lc.field_q.field_sb = 1;
              lc.field_q.field_Q = 1;
              lc.field_q.field_hb = 1;
              lc.field_q.field_ab = var16;
              lc.field_q.field_zb = var13;
              lc.field_q.field_V = 1;
              lc.field_q.field_bb = eh.a("button_mouseheld", "lobby", (byte) 47, param1);
              lc.field_q.field_eb = eh.a("button_active", "lobby", (byte) 47, param1);
              lc.field_q.field_M = eh.a("button_disabled", "lobby", (byte) 47, param1);
              lc.field_q.field_Bb = 1;
              ab.field_a = new ak(0L, dn.field_c);
              ab.field_a.field_Bb = 1;
              ab.field_a.field_zb = al.a(false, eh.a("tab_inactive", "lobby", (byte) 47, param1));
              ab.field_a.field_ab = al.a(false, eh.a("tab_mouseover", "lobby", (byte) 47, param1));
              ab.field_a.field_eb = var14;
              vl.field_J = new ak(0L, (ak) null);
              int discarded$8 = 3;
              vl.field_J.field_zb = op.a(1127256, 16, 1856141, 206, -1);
              ff.field_a = new ak(0L, (ak) null);
              int discarded$9 = 3;
              ff.field_a.field_zb = op.a(6052956, 16, 11579568, 290, -1);
              bf.field_k = new ak(0L, var15);
              bf.field_k.field_V = 1;
              bf.field_k.field_sb = 1;
              bf.field_k.field_Bb = 1;
              bf.field_k.field_hb = 1;
              bf.field_k.field_Q = 1;
              nk.field_f = new ak(0L, bf.field_k);
              u.field_a = new ak(0L, dn.field_c);
              u.field_a.field_Q = 1;
              u.field_a.field_sb = 1;
              u.field_a.field_V = 1;
              u.field_a.field_hb = 1;
              u.field_a.field_Bb = 1;
              ul.field_p = new ak(0L, u.field_a);
              ge.field_h = new ak(0L, u.field_a);
              be.field_R = new ak(0L, bf.field_k);
              bl.field_d = new ak(0L, u.field_a);
              l.field_q = new ak(0L, u.field_a);
              bc.field_o = new ak(0L, u.field_a);
              u.field_a.field_zb = al.a(false, eh.a("smallbutton", "lobby", (byte) 47, param1));
              u.field_a.field_ab = al.a(false, eh.a("smallbutton_mouseover", "lobby", (byte) 47, param1));
              tf[] dupTemp$10 = al.a(false, eh.a("smallbutton_active", "lobby", (byte) 47, param1));
              u.field_a.field_eb = dupTemp$10;
              u.field_a.field_bb = dupTemp$10;
              u.field_a.field_M = al.a(false, eh.a("smallbutton_disabled", "lobby", (byte) 47, param1));
              nk.field_f.field_zb = al.a(false, eh.a("mediumbutton", "lobby", (byte) 47, param1));
              nk.field_f.field_ab = al.a(false, eh.a("mediumbutton_mouseover", "lobby", (byte) 47, param1));
              nk.field_f.field_bb = al.a(false, eh.a("mediumbutton_mouseheld", "lobby", (byte) 47, param1));
              bf.field_k.field_zb = al.a(false, eh.a("bigbutton", "lobby", (byte) 47, param1));
              bf.field_k.field_ab = al.a(false, eh.a("bigbutton_mouseover", "lobby", (byte) 47, param1));
              bf.field_k.field_bb = al.a(false, eh.a("bigbutton_mouseheld", "lobby", (byte) 47, param1));
              bf.field_k.field_M = al.a(false, eh.a("bigbutton_disabled", "lobby", (byte) 47, param1));
              ul.field_p.field_zb = al.a(false, eh.a("greenbutton", "lobby", (byte) 47, param1));
              ul.field_p.field_ab = al.a(false, eh.a("greenbutton_mouseover", "lobby", (byte) 47, param1));
              ul.field_p.field_bb = al.a(false, eh.a("greenbutton_mouseheld", "lobby", (byte) 47, param1));
              ge.field_h.field_zb = al.a(false, eh.a("redbutton", "lobby", (byte) 47, param1));
              ge.field_h.field_ab = al.a(false, eh.a("redbutton_mouseover", "lobby", (byte) 47, param1));
              ge.field_h.field_bb = al.a(false, eh.a("redbutton_mouseheld", "lobby", (byte) 47, param1));
              be.field_R.field_zb = al.a(false, eh.a("backbutton", "lobby", (byte) 47, param1));
              be.field_R.field_ab = al.a(false, eh.a("backbutton_mouseover", "lobby", (byte) 47, param1));
              be.field_R.field_bb = al.a(false, eh.a("backbutton_mouseheld", "lobby", (byte) 47, param1));
              be.field_R.field_M = al.a(false, eh.a("backbutton_disabled", "lobby", (byte) 47, param1));
              bc.field_o.field_zb = al.a(false, eh.a("gameoptionbutton", "lobby", (byte) 47, param1));
              bc.field_o.field_ab = al.a(false, eh.a("gameoptionbutton_mouseover", "lobby", (byte) 47, param1));
              tf[] dupTemp$11 = al.a(false, eh.a("gameoptionbutton_active", "lobby", (byte) 47, param1));
              bc.field_o.field_eb = dupTemp$11;
              bc.field_o.field_bb = dupTemp$11;
              bc.field_o.field_M = al.a(false, eh.a("gameoptionbutton_disabled", "lobby", (byte) 47, param1));
              bl.field_d.field_zb = al.a(false, eh.a("chatbutton", "lobby", (byte) 47, param1));
              bl.field_d.field_ab = al.a(false, eh.a("chatbutton_mouseover", "lobby", (byte) 47, param1));
              tf[] dupTemp$12 = al.a(false, eh.a("chatbutton_active", "lobby", (byte) 47, param1));
              bl.field_d.field_eb = dupTemp$12;
              bl.field_d.field_bb = dupTemp$12;
              l.field_q.field_zb = al.a(false, eh.a("chatfilterbutton", "lobby", (byte) 47, param1));
              l.field_q.field_ab = al.a(false, eh.a("chatfilterbutton_mouseover", "lobby", (byte) 47, param1));
              tf[] dupTemp$13 = al.a(false, eh.a("chatfilterbutton_active", "lobby", (byte) 47, param1));
              l.field_q.field_eb = dupTemp$13;
              l.field_q.field_bb = dupTemp$13;
              var17 = eh.a("checkbox", "lobby", (byte) 47, param1);
              um.field_q = new fb(0L, var17[1], var17[0], 1, dn.field_c, (String) null);
              on.field_mb = new ak(0L, (ak) null);
              on.field_mb.field_zb = db.a(24414, bi.a("lobby", "slideregion", param1, (byte) -73));
              on.field_mb.field_ab = db.a(24414, bi.a("lobby", "slideregion_mouseover", param1, (byte) -123));
              on.field_mb.field_bb = db.a(24414, bi.a("lobby", "slideregion_mouseheld", param1, (byte) -64));
              on.field_mb.field_M = db.a(24414, bi.a("lobby", "slideregion_disabled", param1, (byte) -50));
              jn.field_p = new ak(0L, (ak) null);
              jn.field_p.field_zb = al.a(false, eh.a("dragbar", "lobby", (byte) 47, param1));
              jn.field_p.field_ab = al.a(false, eh.a("dragbar_mouseover", "lobby", (byte) 47, param1));
              jn.field_p.field_bb = al.a(false, eh.a("dragbar_mouseheld", "lobby", (byte) 47, param1));
              jn.field_p.field_M = al.a(false, eh.a("dragbar_disabled", "lobby", (byte) 47, param1));
              dj.field_a = new ak(0L, (ak) null);
              dj.field_a.field_H = bi.a("lobby", "upbutton", param1, (byte) -78);
              dj.field_a.field_B = bi.a("lobby", "upbutton_mouseover", param1, (byte) -126);
              dj.field_a.field_ob = bi.a("lobby", "upbutton_mouseheld", param1, (byte) -43);
              dj.field_a.field_xb = bi.a("lobby", "upbutton_disabled", param1, (byte) -58);
              ek.field_b = new ak(0L, (ak) null);
              ek.field_b.field_H = bi.a("lobby", "downbutton", param1, (byte) -25);
              ek.field_b.field_B = bi.a("lobby", "downbutton_mouseover", param1, (byte) -71);
              ek.field_b.field_ob = bi.a("lobby", "downbutton_mouseheld", param1, (byte) -83);
              ek.field_b.field_xb = bi.a("lobby", "downbutton_disabled", param1, (byte) -97);
              ug.field_s = new vp(0L, dj.field_a, ek.field_b, on.field_mb, jn.field_p);
              rm.field_a = new pd(0L, (ak) null, ff.field_g, ug.field_s, u.field_a, (String) null, (String) null);
              return;
            } else {
              return;
            }
          } else {
            var19[var7_int] = 10;
            var7_int++;
            continue L3;
          }
        }
    }

    final boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 2) {
            break L0;
          } else {
            oe.a(-5, (fm) null, (hh[]) null, (int[]) null, (fm) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (((oe) this).field_Pb == null) {
              break L2;
            } else {
              if (!((oe) this).field_Pb.field_U) {
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

    private final int a(ak param0, int param1, byte param2, int param3, ak param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
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
        try {
          L0: {
            L1: {
              param1 += 8;
              var6_int = param4.field_Db.a(param4.field_cb, -(param4.field_C * 2) + param3, param4.field_mb);
              param4.a(param1, var6_int, 0, 256, param3);
              if (param2 >= 93) {
                break L1;
              } else {
                int discarded$2 = this.a((ak) null, 19, (byte) -78, -14, (ak) null);
                break L1;
              }
            }
            param0.a(param4, (byte) 26);
            param1 = param1 + var6_int;
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("oe.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final String k(int param0) {
        if (param0 <= 102) {
            int discarded$0 = this.a((ak) null, 8, (byte) 76, -63, (ak) null);
        }
        return ((oe) this).field_Ib.toString();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Sb = 0;
        field_Vb = "Emergent Behaviour";
        field_Gb = "Players: <%0>/<%1>";
        field_Mb = "You must play 1 more rated game before playing with the current options.";
        field_Kb = "Spectate <%0>'s game";
    }
}
