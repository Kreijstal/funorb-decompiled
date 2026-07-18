/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pc extends ci {
    private ci field_Eb;
    long field_Lb;
    private ci field_Fb;
    private ci field_Hb;
    private ci field_Ib;
    private int field_Gb;
    private ci[] field_Jb;
    private ci field_Nb;
    private ci field_Ob;
    static String field_Qb;
    private he field_Kb;
    private StringBuilder field_Pb;
    static String field_Mb;

    private final int a(ci param0, int param1, int param2, byte param3, ci param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_1_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
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
        try {
          L0: {
            param1 += 8;
            var6_int = param4.field_xb.b(param4.field_db, -(param4.field_z * 2) + param2, param4.field_K);
            param4.a(0, param2, -2147483648, var6_int, param1);
            param0.a((byte) 127, param4);
            param1 = param1 + var6_int;
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("pc.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',').append(param2).append(',').append(-42).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    pc(int param0, int param1, int param2, int param3, int param4, ci param5, ci param6, ci param7, ci param8, he param9, ci param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        ci[] var15 = null;
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
        ci[] var28 = null;
        Object stackIn_4_0 = null;
        he stackIn_4_1 = null;
        he stackIn_4_2 = null;
        long stackIn_4_3 = 0L;
        he stackIn_4_4 = null;
        Object stackIn_5_0 = null;
        he stackIn_5_1 = null;
        he stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        he stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        he stackIn_6_1 = null;
        he stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        he stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        he stackIn_7_1 = null;
        he stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        he stackIn_7_4 = null;
        String stackIn_7_5 = null;
        ci stackIn_12_0 = null;
        ci stackIn_13_0 = null;
        ci stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_3_0 = null;
        he stackOut_3_1 = null;
        he stackOut_3_2 = null;
        long stackOut_3_3 = 0L;
        he stackOut_3_4 = null;
        Object stackOut_4_0 = null;
        he stackOut_4_1 = null;
        he stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        he stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        he stackOut_5_1 = null;
        he stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        he stackOut_5_4 = null;
        String stackOut_5_5 = null;
        Object stackOut_6_0 = null;
        he stackOut_6_1 = null;
        he stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        he stackOut_6_4 = null;
        String stackOut_6_5 = null;
        ci stackOut_11_0 = null;
        ci stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ci stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          ((pc) this).field_Gb = -2;
          ((pc) this).field_Lb = param12;
          ((pc) this).field_Nb = new ci(0L, param6, se.field_W.toUpperCase());
          ((pc) this).field_Nb.field_fb = 1;
          ((pc) this).a((byte) 125, ((pc) this).field_Nb);
          ((pc) this).field_Fb = new ci(0L, param7);
          ((pc) this).field_Nb.a((byte) 126, ((pc) this).field_Fb);
          ((pc) this).field_Eb = new ci(0L, (ci) null);
          ((pc) this).a((byte) 125, ((pc) this).field_Eb);
          if (param11 == null) {
            ((pc) this).field_Hb = new ci(0L, param8, rf.field_c);
            ((pc) this).field_Hb.field_ib = 11184810;
            ((pc) this).field_Hb.field_fb = 1;
            ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Hb);
            var15_int = 226;
            var16 = 10;
            var17 = ((pc) this).field_Hb.field_xb.b(((pc) this).field_Hb.field_db, var15_int);
            ((pc) this).field_Hb.a(13, var15_int, -2147483648, fe.field_g * var17, var16);
            var16 = var16 + fe.field_g * var17;
            ((pc) this).field_Eb.a(0, 13 + var15_int + 13, -2147483648, var16 + 10, 24);
            ((pc) this).field_Eb.field_Ab = wh.a(93, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
            var18 = 26 + var15_int;
            var19 = var16 + 34;
            var20 = ao.a(var18, true, param0, param2);
            var21 = sg.a(param1, var19, param3, 0);
            ((pc) this).a(var20, var18, -2147483648, var19, var21);
            break L0;
          } else {
            L1: {
              L2: {
                ((pc) this).field_Hb = new ci(0L, param8, af.field_a);
                ((pc) this).field_Hb.field_ib = 11184810;
                ((pc) this).field_Hb.field_fb = 1;
                ((pc) this).field_Eb.a((byte) 127, ((pc) this).field_Hb);
                ((pc) this).field_Ob = new ci(0L, param8, td.field_m);
                ((pc) this).field_Ob.field_fb = 1;
                ((pc) this).field_Ob.field_ib = 11184810;
                ((pc) this).field_Eb.a((byte) 124, ((pc) this).field_Ob);
                ((pc) this).field_Ib = new ci(0L, param8);
                ((pc) this).field_Ib.field_ib = 16764006;
                ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Ib);
                ((pc) this).field_Ib.field_S = "|";
                if (5 <= sb.field_rb) {
                  break L2;
                } else {
                  if (sk.field_t < 2) {
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
                  stackOut_3_4 = (he) param9;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_6_2 = stackOut_3_2;
                  stackIn_6_3 = stackOut_3_3;
                  stackIn_6_4 = stackOut_3_4;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  stackIn_4_4 = stackOut_3_4;
                  if (sb.field_rb >= 7) {
                    break L4;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = null;
                    stackOut_4_2 = null;
                    stackOut_4_3 = stackIn_4_3;
                    stackOut_4_4 = (he) (Object) stackIn_4_4;
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
                    if (sk.field_t >= 2) {
                      break L4;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = stackIn_5_3;
                      stackOut_5_4 = (he) (Object) stackIn_5_4;
                      stackOut_5_5 = jd.field_a;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      stackIn_7_3 = stackOut_5_3;
                      stackIn_7_4 = stackOut_5_4;
                      stackIn_7_5 = stackOut_5_5;
                      break L3;
                    }
                  }
                }
                stackOut_6_0 = this;
                stackOut_6_1 = null;
                stackOut_6_2 = null;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = (he) (Object) stackIn_6_4;
                stackOut_6_5 = h.field_m;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                break L3;
              }
              ((pc) this).field_Kb = new he(stackIn_7_3, stackIn_7_4, stackIn_7_5);
              ((pc) this).field_Eb.a((byte) 127, (ci) (Object) ((pc) this).field_Kb);
              break L1;
            }
            var28 = new ci[3];
            var15 = var28;
            var28[0] = new ci(0L, (ci) null);
            ((pc) this).field_Eb.a((byte) 126, var28[0]);
            var28[1] = new ci(0L, (ci) null);
            ((pc) this).field_Eb.a((byte) 126, var28[1]);
            var28[2] = new ci(0L, (ci) null);
            ((pc) this).field_Eb.a((byte) 124, var28[2]);
            ((pc) this).field_Jb = new ci[re.field_j];
            var16 = 0;
            L5: while (true) {
              if (var16 >= re.field_j) {
                L6: {
                  ((pc) this).field_Pb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((pc) this).field_Pb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_xb.b(cl.field_h);
                  if (var16 >= var17) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_xb.b(nb.field_Gb);
                  if (var16 >= var17) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_xb.b(qh.field_d);
                  if (var16 >= var17) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= re.field_j) {
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
                      var18 = this.a(cl.field_h, (byte) 108, param6, var18, var16, var28[0]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[6]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[9]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[5]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[7]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[15]);
                      var18 = this.a(var28[0], var18, var16, (byte) -42, ((pc) this).field_Jb[4]);
                      if (var17 >= var18) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(nb.field_Gb, (byte) 108, param6, var18, var16, var28[1]);
                      var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[16]);
                      var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[17]);
                      var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[18]);
                      var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[19]);
                      var18 = this.a(var28[1], var18, var16, (byte) -42, ((pc) this).field_Jb[20]);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(qh.field_d, (byte) 108, param6, var18, var16, var28[2]);
                      var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[13]);
                      var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[21]);
                      var18 = this.a(var28[2], var18, var16, (byte) -42, ((pc) this).field_Jb[11]);
                      if (var17 >= var18) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = 26 + 3 * var16;
                      var20 = ((pc) this).field_Nb.e((byte) 122);
                      if (var20 <= var19) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (null == ((pc) this).field_Kb) {
                        break L16;
                      } else {
                        var20 = ((pc) this).field_Kb.a((byte) 119, 4);
                        if (var20 <= var19) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((pc) this).field_Nb.a(0, 13 + (var19 - -13), -2147483648, 24, 0);
                      ((pc) this).field_Fb.a(-20 + ((pc) this).field_Nb.field_M, 15, -2147483648, 15, 5);
                      var21 = 10;
                      ((pc) this).field_Hb.a(13, var19, -2147483648, fe.field_g * 2, var21);
                      var21 = var21 + 2 * fe.field_g;
                      ((pc) this).field_Ob.a(13, var19, -2147483648, fe.field_g * 2, var21);
                      var21 = var21 + (fe.field_g * 2 - -10);
                      ((pc) this).field_Ib.a(0, 0, -2147483648, fe.field_g, var21);
                      var21 = var21 + (10 + fe.field_g);
                      if (((pc) this).field_Kb == null) {
                        break L17;
                      } else {
                        var20 = ((pc) this).field_Kb.a((byte) 123, 4);
                        ((pc) this).field_Kb.a(fe.field_g, 13 - -((-var20 + var19) / 2), (byte) 127, 4, var20, var21);
                        var21 = var21 + (fe.field_g + 10);
                        break L17;
                      }
                    }
                    var28[0].a(13, var16, -2147483648, var17, var21);
                    var28[1].a(26 + var16, var16, -2147483648, var17, var21);
                    var28[2].a(26 + 2 * var16 + 13, var16, -2147483648, var17, var21);
                    var22 = var21;
                    ((pc) this).field_Eb.a(0, 13 + var19 + 13, -2147483648, var22 - (-var17 - 10), 24);
                    ((pc) this).field_Eb.field_Ab = wh.a(-116, ((pc) this).field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
                    var23 = var19 + 26;
                    var24 = 24 + var22 + (var17 + 10);
                    var25 = ao.a(var23, true, param0, param2);
                    var26 = sg.a(param1, var24, param3, 0);
                    ((pc) this).a(var25, var23, -2147483648, var24, var26);
                    break L0;
                  } else {
                    L18: {
                      if (((pc) this).field_Jb[var17] == null) {
                        break L18;
                      } else {
                        var18 = ((pc) this).field_Jb[var17].e((byte) -88);
                        if (var18 <= var16) {
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
                  if (null == mi.field_t[var16]) {
                    break L19;
                  } else {
                    L20: {
                      ((pc) this).field_Jb[var16] = new ci(0L, param10, mi.field_t[var16]);
                      ((pc) this).field_Jb[var16].field_fb = 0;
                      stackOut_11_0 = ((pc) this).field_Jb[var16];
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (param11 == null) {
                        stackOut_13_0 = (ci) (Object) stackIn_13_0;
                        stackOut_13_1 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        break L20;
                      } else {
                        stackOut_12_0 = (ci) (Object) stackIn_12_0;
                        stackOut_12_1 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        break L20;
                      }
                    }
                    stackIn_14_0.field_tb = stackIn_14_1 != 0;
                    ((pc) this).field_Eb.a((byte) 125, ((pc) this).field_Jb[var16]);
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

    final String a(boolean param0) {
        if (!param0) {
            ((pc) this).field_Pb = null;
        }
        return ((pc) this).field_Pb.toString();
    }

    private final int a(String param0, byte param1, ci param2, int param3, int param4, ci param5) {
        ci var7 = null;
        RuntimeException var7_ref = null;
        int stackIn_1_0 = 0;
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
        int stackOut_0_0 = 0;
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
            var7 = new ci(0L, param2, 0, param3, param4, 24, param0);
            param5.a((byte) 126, var7);
            param3 += 32;
            stackOut_0_0 = param3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var7_ref;
            stackOut_2_1 = new StringBuilder().append("pc.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(108).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final int b(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        he stackIn_5_0 = null;
        he stackIn_6_0 = null;
        he stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_13_0 = null;
        ci stackIn_14_0 = null;
        ci stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        he stackOut_4_0 = null;
        he stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        he stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ci stackOut_12_0 = null;
        ci stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        ci stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          var4 = Chess.field_G;
          ((pc) this).a(param0, (byte) 88);
          if (((pc) this).field_Ib != null) {
            L1: {
              ((pc) this).field_Ib.field_db = ((pc) this).field_Pb.toString();
              ((pc) this).field_Ib.field_mb = (((pc) this).field_M + -((pc) this).field_Ib.field_xb.b(((pc) this).field_Ib.field_db)) / 2;
              ((pc) this).field_Ib.field_M = -((pc) this).field_Ib.field_mb + ((pc) this).field_M;
              if (((pc) this).field_Kb == null) {
                break L1;
              } else {
                if (((pc) this).field_Kb.field_L == 0) {
                  break L1;
                } else {
                  L2: {
                    stackOut_4_0 = ((pc) this).field_Kb;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((pc) this).field_Kb.field_gb) {
                      stackOut_6_0 = (he) (Object) stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (he) (Object) stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_gb = stackIn_7_1 != 0;
                  break L1;
                }
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= re.field_j) {
                break L0;
              } else {
                if (null != ((pc) this).field_Jb[var3]) {
                  L4: {
                    stackOut_12_0 = ((pc) this).field_Jb[var3];
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    if (((pc) this).field_Pb.length() <= 0) {
                      stackOut_14_0 = (ci) (Object) stackIn_14_0;
                      stackOut_14_1 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      break L4;
                    } else {
                      stackOut_13_0 = (ci) (Object) stackIn_13_0;
                      stackOut_13_1 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_15_1 = stackOut_13_1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_tb = stackIn_15_1 != 0;
                  if (((pc) this).field_Jb[var3].field_tb) {
                    if (((pc) this).field_Jb[var3].field_L != 0) {
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
        if (((pc) this).field_Fb.field_L != 0) {
          return -1;
        } else {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (0 == th.field_d) {
                break L5;
              } else {
                if (((pc) this).field_L == 0) {
                  return -1;
                } else {
                  break L5;
                }
              }
            }
          }
          L6: {
            if (param1 == -95) {
              break L6;
            } else {
              ((pc) this).field_Ib = null;
              break L6;
            }
          }
          return ((pc) this).field_Gb;
        }
    }

    final boolean f(byte param0) {
        if (((pc) this).field_Gb != -2) {
            return false;
        }
        if (param0 != 95) {
            ((pc) this).field_Nb = null;
        }
        if (vg.field_a != 13) {
            return true;
        }
        ((pc) this).field_Gb = -1;
        return true;
    }

    final boolean b(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            pc.a(false, 126, false, false, 82);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((pc) this).field_Kb) {
              break L2;
            } else {
              if (!((pc) this).field_Kb.field_gb) {
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

    final static void a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        RuntimeException var5 = null;
        ci var5_ref = null;
        int var5_int = 0;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        int[] var13_array = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        jc var17 = null;
        int var17_int = 0;
        Object var18 = null;
        r var18_ref = null;
        int var18_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        ci stackIn_16_0 = null;
        ci stackIn_17_0 = null;
        ci stackIn_18_0 = null;
        ci stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_36_0 = 0;
        ci stackIn_141_0 = null;
        ci stackIn_142_0 = null;
        ci stackIn_143_0 = null;
        ci stackIn_144_0 = null;
        ci stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        ci stackIn_146_0 = null;
        ci stackIn_147_0 = null;
        ci stackIn_148_0 = null;
        ci stackIn_149_0 = null;
        ci stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        ci stackIn_151_0 = null;
        ci stackIn_152_0 = null;
        ci stackIn_153_0 = null;
        ci stackIn_154_0 = null;
        ci stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ci stackOut_15_0 = null;
        ci stackOut_16_0 = null;
        ci stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        ci stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        ci stackOut_140_0 = null;
        ci stackOut_141_0 = null;
        ci stackOut_142_0 = null;
        ci stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        ci stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        ci stackOut_145_0 = null;
        ci stackOut_146_0 = null;
        ci stackOut_147_0 = null;
        ci stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        ci stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        ci stackOut_150_0 = null;
        ci stackOut_151_0 = null;
        ci stackOut_152_0 = null;
        ci stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        ci stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        var18 = null;
        var19 = Chess.field_G;
        try {
          L0: {
            L1: {
              f.a(ed.field_c, true);
              if (null == pd.field_Rb) {
                break L1;
              } else {
                L2: {
                  sc.field_d.field_tb = true;
                  uj.field_j.field_pb = 0;
                  var5_ref = uj.field_j;
                  var5_ref.field_M = 0;
                  aa.field_g.field_pb = 0;
                  var6 = aa.field_g;
                  var6.field_M = 0;
                  tn.field_j.field_pb = 0;
                  var7 = tn.field_j;
                  var7.field_M = 0;
                  if (!ci.f(-12)) {
                    var9_ref_String = pd.field_Rb.field_Gb;
                    sc.field_f.field_db = oc.a(fb.field_D, new String[1], (byte) -88).toUpperCase();
                    tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb + -40);
                    tn.field_j.field_db = oc.a(kb.field_R, new String[1], (byte) -93);
                    var8 = tn.field_j;
                    break L2;
                  } else {
                    L3: {
                      sc.field_f.field_db = ge.field_cb.toUpperCase();
                      var9 = (2 + ri.field_k.field_M) / 2;
                      uj.field_j.a(0, var9 - 2, -2147483648, 40, -40 + ri.field_k.field_pb);
                      if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
                        uj.field_j.field_db = oj.field_b.toUpperCase();
                        uj.field_j.field_tb = false;
                        break L3;
                      } else {
                        uj.field_j.field_db = uh.field_v.toUpperCase();
                        uj.field_j.field_tb = true;
                        break L3;
                      }
                    }
                    L4: {
                      uj.field_j.field_Ab = nj.field_x.field_Ab;
                      if (cb.field_f > 0) {
                        L5: {
                          if (1 != cb.field_f) {
                            var10_ref_String = oc.a(tg.field_b, new String[1], (byte) -119);
                            break L5;
                          } else {
                            var10_ref_String = ob.field_A;
                            break L5;
                          }
                        }
                        uj.field_j.field_db = uj.field_j.field_db + "<br>" + var10_ref_String;
                        if ((16 & g.field_c) != 0) {
                          break L4;
                        } else {
                          if (!jh.field_a) {
                            uj.field_j.field_Ab = nj.field_x.field_Q;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      L7: {
                        aa.field_g.a(var9, ri.field_k.field_M + -var9, -2147483648, 40, ri.field_k.field_pb + -40);
                        aa.field_g.field_db = fl.field_k.toUpperCase();
                        var8 = aa.field_g;
                        stackOut_15_0 = aa.field_g;
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (!param2) {
                          break L7;
                        } else {
                          stackOut_16_0 = (ci) (Object) stackIn_16_0;
                          stackIn_18_0 = stackOut_16_0;
                          stackIn_17_0 = stackOut_16_0;
                          if (0L != eg.field_e) {
                            break L7;
                          } else {
                            stackOut_17_0 = (ci) (Object) stackIn_17_0;
                            stackOut_17_1 = 1;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_19_1 = stackOut_17_1;
                            break L6;
                          }
                        }
                      }
                      stackOut_18_0 = (ci) (Object) stackIn_18_0;
                      stackOut_18_1 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L6;
                    }
                    L8: {
                      stackIn_19_0.field_tb = stackIn_19_1 != 0;
                      var10 = 2;
                      if (null != hd.field_n) {
                        L9: {
                          if (null != d.field_Jb) {
                            break L9;
                          } else {
                            bi.field_d = new boolean[qa.field_e];
                            d.field_Jb = new byte[qa.field_e];
                            break L9;
                          }
                        }
                        var11_int = 0;
                        L10: while (true) {
                          if (var11_int >= qa.field_e) {
                            var10 = 0;
                            L11: while (true) {
                              L12: {
                                if (2 <= var10) {
                                  break L12;
                                } else {
                                  var11_int = 0;
                                  var12 = 0;
                                  L13: while (true) {
                                    if (var12 >= hd.field_n.length) {
                                      if (var11_int != 0) {
                                        break L12;
                                      } else {
                                        var10++;
                                        continue L11;
                                      }
                                    } else {
                                      var25 = hd.field_n[var12];
                                      var24 = var25;
                                      var23 = var24;
                                      var20 = var23;
                                      var13_array = var20;
                                      var14_int = 0;
                                      L14: while (true) {
                                        L15: {
                                          if (var25.length <= var14_int) {
                                            var11_int = 1;
                                            var14_int = -1;
                                            var15 = 0;
                                            L16: while (true) {
                                              if (var25.length <= var15) {
                                                bi.field_d[var14_int] = true;
                                                break L15;
                                              } else {
                                                L17: {
                                                  var16 = var25[var15];
                                                  if (var14_int < var16) {
                                                    var14_int = var16;
                                                    break L17;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                                var15 += 2;
                                                continue L16;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              var15 = var25[var14_int];
                                              var16 = var13_array[1 + var14_int];
                                              if (var15 != -1) {
                                                if (var16 == (255 & pd.field_Rb.field_sc[var15])) {
                                                  break L18;
                                                } else {
                                                  break L15;
                                                }
                                              } else {
                                                L19: {
                                                  if (0 == var10) {
                                                    stackOut_35_0 = pd.field_Rb.field_hc;
                                                    stackIn_36_0 = stackOut_35_0;
                                                    break L19;
                                                  } else {
                                                    stackOut_34_0 = pd.field_Rb.field_Xb;
                                                    stackIn_36_0 = stackOut_34_0;
                                                    break L19;
                                                  }
                                                }
                                                var17_int = stackIn_36_0;
                                                if (var16 == var17_int) {
                                                  break L18;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            var14_int += 2;
                                            continue L14;
                                          }
                                        }
                                        var12++;
                                        continue L13;
                                      }
                                    }
                                  }
                                }
                              }
                              if (sk.field_t < 2) {
                                break L8;
                              } else {
                                if (ok.field_Jb[12]) {
                                  var10 = 2;
                                  break L8;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          } else {
                            bi.field_d[var11_int] = false;
                            var11_int++;
                            continue L10;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    if (var10 < 2) {
                      aa.field_g.field_tb = false;
                      if (aa.field_g.field_Db) {
                        var11 = null;
                        var12 = 0;
                        var13_int = 0;
                        L20: while (true) {
                          if (var13_int >= qa.field_e) {
                            L21: {
                              if (var10 == 0) {
                                var13 = ke.field_c;
                                var14 = var13;
                                var14 = var13;
                                if (var12 == 0) {
                                  var14 = oc.a(qb.field_d, new String[1], (byte) -88);
                                  break L21;
                                } else {
                                  var14 = ic.field_d + (String) var11;
                                  break L21;
                                }
                              } else {
                                var13 = jb.field_c;
                                var14 = var13;
                                var14 = var13;
                                if (var12 != 0) {
                                  var14 = field_Qb + (String) var11;
                                  break L21;
                                } else {
                                  var14 = oc.a(ld.field_j, new String[1], (byte) -66);
                                  break L21;
                                }
                              }
                            }
                            field_Mb = "<col=A00000>" + var13 + "<br>" + var14;
                            break L2;
                          } else {
                            L22: {
                              if (!bi.field_d[var13_int]) {
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            var13_int++;
                            continue L20;
                          }
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      L23: {
                        if (null != t.field_L) {
                          break L23;
                        } else {
                          if (uj.field_k != null) {
                            break L23;
                          } else {
                            if (il.field_b != null) {
                              break L23;
                            } else {
                              if (nk.field_r == null) {
                                break L2;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                      var11_int = 0;
                      var12 = 0;
                      var13_int = 0;
                      var14_int = 0;
                      var15 = 0;
                      var16 = 0;
                      L24: while (true) {
                        if (var16 >= qa.field_e) {
                          var16 = 0;
                          var17 = se.field_S.field_Kb.field_I;
                          var18_ref = (r) (Object) var17.g(-18110);
                          L25: while (true) {
                            L26: {
                              if (var18_ref == null) {
                                break L26;
                              } else {
                                L27: {
                                  if (var18_ref.l(1)) {
                                    break L27;
                                  } else {
                                    L28: {
                                      if (var11_int == 0) {
                                        break L28;
                                      } else {
                                        if (!var18_ref.field_Hb) {
                                          var16 = 1;
                                          break L26;
                                        } else {
                                          break L28;
                                        }
                                      }
                                    }
                                    if (var13_int <= var18_ref.field_Pb) {
                                      if (var18_ref.field_Jb < var14_int) {
                                        var16 = 1;
                                        break L26;
                                      } else {
                                        if ((var15 & ~var18_ref.field_Wb) > 0) {
                                          var16 = 1;
                                          break L26;
                                        } else {
                                          if (var12 == 0) {
                                            break L27;
                                          } else {
                                            var16 = 1;
                                            break L26;
                                          }
                                        }
                                      }
                                    } else {
                                      var16 = 1;
                                      break L26;
                                    }
                                  }
                                }
                                var18_ref = (r) (Object) var17.a((byte) -107);
                                continue L25;
                              }
                            }
                            L29: {
                              if (sk.field_t < 2) {
                                break L29;
                              } else {
                                if (ok.field_Jb[12]) {
                                  var16 = 0;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            if (var16 != 0) {
                              aa.field_g.field_tb = false;
                              if (aa.field_g.field_Db) {
                                if (qa.field_f.field_a.field_Hb != 0) {
                                  field_Mb = oc.a(wm.field_j, new String[1], (byte) -119);
                                  break L2;
                                } else {
                                  field_Mb = gh.field_e;
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            } else {
                              break L2;
                            }
                          }
                        } else {
                          L30: {
                            var17_int = pd.field_Rb.field_sc[var16] & 255;
                            if (null == t.field_L) {
                              break L30;
                            } else {
                              if (t.field_L[var16] == null) {
                                break L30;
                              } else {
                                if (t.field_L[var16][var17_int]) {
                                  var11_int = 1;
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                            }
                          }
                          L31: {
                            if (null == uj.field_k) {
                              break L31;
                            } else {
                              if (null != uj.field_k[var16]) {
                                L32: {
                                  var18_int = uj.field_k[var16][var17_int];
                                  if (var18_int > var13_int) {
                                    var13_int = var18_int;
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L31;
                                } else {
                                  if (lf.field_U) {
                                    break L31;
                                  } else {
                                    var11_int = 1;
                                    break L31;
                                  }
                                }
                              } else {
                                break L31;
                              }
                            }
                          }
                          L33: {
                            if (il.field_b == null) {
                              break L33;
                            } else {
                              if (il.field_b[var16] != null) {
                                L34: {
                                  var18_int = il.field_b[var16][var17_int];
                                  if (var18_int > var14_int) {
                                    var14_int = var18_int;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                if (var18_int == 0) {
                                  break L33;
                                } else {
                                  if (lf.field_U) {
                                    break L33;
                                  } else {
                                    var11_int = 1;
                                    break L33;
                                  }
                                }
                              } else {
                                break L33;
                              }
                            }
                          }
                          L35: {
                            if (null == nk.field_r) {
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          var16++;
                          continue L24;
                        }
                      }
                    }
                  }
                }
                L36: {
                  if (eg.field_e == 0L) {
                    break L36;
                  } else {
                    L37: {
                      var9 = (int)(eg.field_e - ud.a(2));
                      var9 = (999 + var9) / 1000;
                      if (var9 >= 1) {
                        break L37;
                      } else {
                        var9 = 1;
                        break L37;
                      }
                    }
                    var8.field_db = oc.a(pa.field_n, new String[1], (byte) -119);
                    break L36;
                  }
                }
                ec.field_j.field_db = oc.a(dk.field_a, new String[2], (byte) -44);
                break L1;
              }
            }
            L38: {
              L39: {
                stackOut_140_0 = fm.field_T;
                stackIn_144_0 = stackOut_140_0;
                stackIn_141_0 = stackOut_140_0;
                if (!param0) {
                  break L39;
                } else {
                  stackOut_141_0 = (ci) (Object) stackIn_141_0;
                  stackIn_144_0 = stackOut_141_0;
                  stackIn_142_0 = stackOut_141_0;
                  if (param3) {
                    break L39;
                  } else {
                    stackOut_142_0 = (ci) (Object) stackIn_142_0;
                    stackIn_144_0 = stackOut_142_0;
                    stackIn_143_0 = stackOut_142_0;
                    if (jh.field_a) {
                      break L39;
                    } else {
                      stackOut_143_0 = (ci) (Object) stackIn_143_0;
                      stackOut_143_1 = 1;
                      stackIn_145_0 = stackOut_143_0;
                      stackIn_145_1 = stackOut_143_1;
                      break L38;
                    }
                  }
                }
              }
              stackOut_144_0 = (ci) (Object) stackIn_144_0;
              stackOut_144_1 = 0;
              stackIn_145_0 = stackOut_144_0;
              stackIn_145_1 = stackOut_144_1;
              break L38;
            }
            L40: {
              L41: {
                ((ci) (Object) stackIn_145_0).a(stackIn_145_1 != 0, (byte) 88);
                stackOut_145_0 = ri.field_k;
                stackIn_149_0 = stackOut_145_0;
                stackIn_146_0 = stackOut_145_0;
                if (!param0) {
                  break L41;
                } else {
                  stackOut_146_0 = (ci) (Object) stackIn_146_0;
                  stackIn_149_0 = stackOut_146_0;
                  stackIn_147_0 = stackOut_146_0;
                  if (param3) {
                    break L41;
                  } else {
                    stackOut_147_0 = (ci) (Object) stackIn_147_0;
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_148_0 = stackOut_147_0;
                    if (jh.field_a) {
                      break L41;
                    } else {
                      stackOut_148_0 = (ci) (Object) stackIn_148_0;
                      stackOut_148_1 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      stackIn_150_1 = stackOut_148_1;
                      break L40;
                    }
                  }
                }
              }
              stackOut_149_0 = (ci) (Object) stackIn_149_0;
              stackOut_149_1 = 0;
              stackIn_150_0 = stackOut_149_0;
              stackIn_150_1 = stackOut_149_1;
              break L40;
            }
            L42: {
              L43: {
                ((ci) (Object) stackIn_150_0).a(stackIn_150_1 != 0, (byte) 88);
                stackOut_150_0 = ah.field_i;
                stackIn_154_0 = stackOut_150_0;
                stackIn_151_0 = stackOut_150_0;
                if (!param0) {
                  break L43;
                } else {
                  stackOut_151_0 = (ci) (Object) stackIn_151_0;
                  stackIn_154_0 = stackOut_151_0;
                  stackIn_152_0 = stackOut_151_0;
                  if (param3) {
                    break L43;
                  } else {
                    stackOut_152_0 = (ci) (Object) stackIn_152_0;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_153_0 = stackOut_152_0;
                    if (!jh.field_a) {
                      break L43;
                    } else {
                      stackOut_153_0 = (ci) (Object) stackIn_153_0;
                      stackOut_153_1 = 1;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      break L42;
                    }
                  }
                }
              }
              stackOut_154_0 = (ci) (Object) stackIn_154_0;
              stackOut_154_1 = 0;
              stackIn_155_0 = stackOut_154_0;
              stackIn_155_1 = stackOut_154_1;
              break L42;
            }
            L44: {
              ((ci) (Object) stackIn_155_0).a(stackIn_155_1 != 0, (byte) 88);
              qa.field_f.field_a.f((byte) 109);
              var5_int = -71 % ((-3 - param1) / 54);
              if (null != pd.field_Rb) {
                L45: {
                  if (sc.field_d.field_L == 0) {
                    break L45;
                  } else {
                    db.a(param4, pd.field_Rb.g((byte) -80), 28113);
                    break L45;
                  }
                }
                L46: {
                  if (aa.field_g.field_L == 0) {
                    break L46;
                  } else {
                    ob.field_w = true;
                    break L46;
                  }
                }
                L47: {
                  if (uj.field_j.field_L == 0) {
                    break L47;
                  } else {
                    jh.field_a = true;
                    break L47;
                  }
                }
                L48: {
                  if (hn.field_d.field_L != 0) {
                    jh.field_a = false;
                    break L48;
                  } else {
                    break L48;
                  }
                }
                t.a(pd.field_Rb, false, param4, true);
                break L44;
              } else {
                break L44;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fk.a((Throwable) (Object) var5, "pc.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void k(int param0) {
        field_Qb = null;
        field_Mb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
