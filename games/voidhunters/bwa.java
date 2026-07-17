/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class bwa extends llb {
    private llb field_vb;
    private StringBuilder field_Fb;
    private llb field_Cb;
    long field_yb;
    private int field_xb;
    private llb field_Ab;
    private llb field_Bb;
    private qca field_wb;
    private llb field_zb;
    private llb[] field_Db;
    private llb field_Eb;

    final boolean e(byte param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -59) {
            break L0;
          } else {
            var3 = null;
            int discarded$2 = this.a(44, (llb) null, (String) null, 120, 54, (llb) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((bwa) this).field_wb) {
              break L2;
            } else {
              if (!((bwa) this).field_wb.field_J) {
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

    final String i(int param0) {
        if (param0 != 0) {
            return null;
        }
        return ((bwa) this).field_Fb.toString();
    }

    final boolean h(int param0) {
        if (((bwa) this).field_xb != -2) {
            return false;
        }
        if (13 == pma.field_o) {
            ((bwa) this).field_xb = -1;
        }
        if (param0 != -15244) {
            ((bwa) this).field_yb = 44L;
            return true;
        }
        return true;
    }

    private final int a(llb param0, int param1, int param2, llb param3, int param4) {
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
            var6_int = param3.field_eb.b(param3.field_R, -(param3.field_w * 2) + param2, param3.field_D);
            param3.a(0, 125, param2, param1, var6_int);
            param1 = param1 + var6_int;
            param0.b(-561, param3);
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var6;
            stackOut_2_1 = new StringBuilder().append("bwa.D(");
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 28488 + 41);
        }
        return stackIn_1_0;
    }

    bwa(int param0, int param1, int param2, int param3, int param4, llb param5, llb param6, llb param7, llb param8, qca param9, llb param10, String param11, long param12) {
        super(0L, param5);
        int var15_int = 0;
        llb[] var15 = null;
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
        llb[] var28 = null;
        Object stackIn_5_0 = null;
        qca stackIn_5_1 = null;
        qca stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        qca stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        qca stackIn_6_1 = null;
        qca stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        qca stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        qca stackIn_7_1 = null;
        qca stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        qca stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        qca stackIn_8_1 = null;
        qca stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        qca stackIn_8_4 = null;
        String stackIn_8_5 = null;
        llb stackIn_13_0 = null;
        llb stackIn_14_0 = null;
        llb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_4_0 = null;
        qca stackOut_4_1 = null;
        qca stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        qca stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        qca stackOut_5_1 = null;
        qca stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        qca stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        qca stackOut_6_1 = null;
        qca stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        qca stackOut_6_4 = null;
        String stackOut_6_5 = null;
        Object stackOut_7_0 = null;
        qca stackOut_7_1 = null;
        qca stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        qca stackOut_7_4 = null;
        String stackOut_7_5 = null;
        llb stackOut_12_0 = null;
        llb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        llb stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        L0: {
          ((bwa) this).field_xb = -2;
          ((bwa) this).field_yb = param12;
          ((bwa) this).field_Cb = new llb(0L, param6, hpb.field_j.toUpperCase());
          ((bwa) this).field_Cb.field_F = 1;
          ((bwa) this).b(-561, ((bwa) this).field_Cb);
          ((bwa) this).field_zb = new llb(0L, param7);
          ((bwa) this).field_Cb.b(-561, ((bwa) this).field_zb);
          ((bwa) this).field_Ab = new llb(0L, (llb) null);
          ((bwa) this).b(-561, ((bwa) this).field_Ab);
          if (param11 != null) {
            L1: {
              L2: {
                ((bwa) this).field_Bb = new llb(0L, param8, lcb.field_p);
                ((bwa) this).field_Bb.field_Y = 11184810;
                ((bwa) this).field_Bb.field_F = 1;
                ((bwa) this).field_Ab.b(-561, ((bwa) this).field_Bb);
                ((bwa) this).field_vb = new llb(0L, param8, fh.field_j);
                ((bwa) this).field_vb.field_Y = 11184810;
                ((bwa) this).field_vb.field_F = 1;
                ((bwa) this).field_Ab.b(-561, ((bwa) this).field_vb);
                ((bwa) this).field_Eb = new llb(0L, param8);
                ((bwa) this).field_Eb.field_Y = 16764006;
                ((bwa) this).field_Ab.b(-561, ((bwa) this).field_Eb);
                ((bwa) this).field_Eb.field_s = "|";
                if (nfa.field_d >= 5) {
                  break L2;
                } else {
                  if (go.field_p < 2) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  stackOut_4_0 = this;
                  stackOut_4_1 = null;
                  stackOut_4_2 = null;
                  stackOut_4_3 = 0L;
                  stackOut_4_4 = (qca) param9;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_7_1 = stackOut_4_1;
                  stackIn_7_2 = stackOut_4_2;
                  stackIn_7_3 = stackOut_4_3;
                  stackIn_7_4 = stackOut_4_4;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  stackIn_5_3 = stackOut_4_3;
                  stackIn_5_4 = stackOut_4_4;
                  if (nfa.field_d >= 7) {
                    break L4;
                  } else {
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = stackIn_5_3;
                    stackOut_5_4 = (qca) (Object) stackIn_5_4;
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
                    if (go.field_p >= 2) {
                      break L4;
                    } else {
                      stackOut_6_0 = this;
                      stackOut_6_1 = null;
                      stackOut_6_2 = null;
                      stackOut_6_3 = stackIn_6_3;
                      stackOut_6_4 = (qca) (Object) stackIn_6_4;
                      stackOut_6_5 = po.field_p;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      stackIn_8_3 = stackOut_6_3;
                      stackIn_8_4 = stackOut_6_4;
                      stackIn_8_5 = stackOut_6_5;
                      break L3;
                    }
                  }
                }
                stackOut_7_0 = this;
                stackOut_7_1 = null;
                stackOut_7_2 = null;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = (qca) (Object) stackIn_7_4;
                stackOut_7_5 = pqa.field_p;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                break L3;
              }
              ((bwa) this).field_wb = new qca(stackIn_8_3, stackIn_8_4, stackIn_8_5);
              ((bwa) this).field_Ab.b(-561, (llb) (Object) ((bwa) this).field_wb);
              break L1;
            }
            var28 = new llb[3];
            var15 = var28;
            var28[0] = new llb(0L, (llb) null);
            ((bwa) this).field_Ab.b(-561, var28[0]);
            var28[1] = new llb(0L, (llb) null);
            ((bwa) this).field_Ab.b(-561, var28[1]);
            var28[2] = new llb(0L, (llb) null);
            ((bwa) this).field_Ab.b(-561, var28[2]);
            ((bwa) this).field_Db = new llb[fva.field_o];
            var16 = 0;
            L5: while (true) {
              if (fva.field_o <= var16) {
                L6: {
                  ((bwa) this).field_Fb = new StringBuilder(12);
                  if (param11 == null) {
                    break L6;
                  } else {
                    StringBuilder discarded$1 = ((bwa) this).field_Fb.append(param11);
                    break L6;
                  }
                }
                L7: {
                  var16 = 0;
                  var17 = param6.field_eb.b(gca.field_p);
                  if (var16 >= var17) {
                    break L7;
                  } else {
                    var16 = var17;
                    break L7;
                  }
                }
                L8: {
                  var17 = param6.field_eb.b(oqb.field_n);
                  if (var17 <= var16) {
                    break L8;
                  } else {
                    var16 = var17;
                    break L8;
                  }
                }
                L9: {
                  var17 = param6.field_eb.b(jrb.field_p);
                  if (var17 <= var16) {
                    break L9;
                  } else {
                    var16 = var17;
                    break L9;
                  }
                }
                var17 = 0;
                L10: while (true) {
                  if (var17 >= fva.field_o) {
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
                      var18 = this.a(6300, var28[0], gca.field_p, var16, var18, param6);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[6], 28488);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[9], 28488);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[5], 28488);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[7], 28488);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[15], 28488);
                      var18 = this.a(var28[0], var18, var16, ((bwa) this).field_Db[4], 28488);
                      if (var18 <= var17) {
                        break L12;
                      } else {
                        var17 = var18;
                        break L12;
                      }
                    }
                    L13: {
                      var18 = 0;
                      var18 = this.a(6300, var28[1], oqb.field_n, var16, var18, param6);
                      var18 = this.a(var28[1], var18, var16, ((bwa) this).field_Db[16], 28488);
                      var18 = this.a(var28[1], var18, var16, ((bwa) this).field_Db[17], 28488);
                      var18 = this.a(var28[1], var18, var16, ((bwa) this).field_Db[18], 28488);
                      var18 = this.a(var28[1], var18, var16, ((bwa) this).field_Db[19], 28488);
                      var18 = this.a(var28[1], var18, var16, ((bwa) this).field_Db[20], 28488);
                      if (var18 <= var17) {
                        break L13;
                      } else {
                        var17 = var18;
                        break L13;
                      }
                    }
                    L14: {
                      var18 = 0;
                      var18 = this.a(6300, var28[2], jrb.field_p, var16, var18, param6);
                      var18 = this.a(var28[2], var18, var16, ((bwa) this).field_Db[13], 28488);
                      var18 = this.a(var28[2], var18, var16, ((bwa) this).field_Db[21], 28488);
                      var18 = this.a(var28[2], var18, var16, ((bwa) this).field_Db[11], 28488);
                      if (var18 <= var17) {
                        break L14;
                      } else {
                        var17 = var18;
                        break L14;
                      }
                    }
                    L15: {
                      var19 = var16 * 3 + 26;
                      var20 = ((bwa) this).field_Cb.e(112);
                      if (var19 >= var20) {
                        break L15;
                      } else {
                        var19 = var20;
                        break L15;
                      }
                    }
                    L16: {
                      if (((bwa) this).field_wb == null) {
                        break L16;
                      } else {
                        var20 = ((bwa) this).field_wb.b(4, 0);
                        if (var19 >= var20) {
                          break L16;
                        } else {
                          var19 = var20;
                          break L16;
                        }
                      }
                    }
                    L17: {
                      ((bwa) this).field_Cb.a(0, 35, 13 + (var19 - -13), 0, 24);
                      ((bwa) this).field_zb.a(((bwa) this).field_Cb.field_hb - 20, 119, 15, 5, 15);
                      var21 = 10;
                      ((bwa) this).field_Bb.a(13, 118, var19, var21, nna.field_w * 2);
                      var21 = var21 + 2 * nna.field_w;
                      ((bwa) this).field_vb.a(13, 122, var19, var21, nna.field_w * 2);
                      var21 = var21 + (nna.field_w * 2 + 10);
                      ((bwa) this).field_Eb.a(0, -104, 0, var21, nna.field_w);
                      var21 = var21 + (10 + nna.field_w);
                      if (((bwa) this).field_wb == null) {
                        break L17;
                      } else {
                        var20 = ((bwa) this).field_wb.b(4, 0);
                        ((bwa) this).field_wb.a((-var20 + var19) / 2 + 13, nna.field_w, 4, var21, var20, false);
                        var21 = var21 + (nna.field_w - -10);
                        break L17;
                      }
                    }
                    var28[0].a(13, 122, var16, var21, var17);
                    var28[1].a(13 + (13 + var16), -106, var16, var21, var17);
                    var28[2].a(39 + 2 * var16, -128, var16, var21, var17);
                    var22 = var21;
                    ((bwa) this).field_Ab.a(0, -94, var19 + 26, 24, 10 + var17 + var22);
                    ((bwa) this).field_Ab.field_gb = uwa.a(11579568, ((bwa) this).field_Ab.field_G, 2105376, 8421504, 104, 3);
                    var23 = 26 + var19;
                    var24 = 10 + (24 + (var22 + var17));
                    var25 = jv.a((byte) -109, param0, param2, var23);
                    var26 = lma.a(param3, param1, var24, (byte) -16);
                    ((bwa) this).a(var25, 0, var23, var26, var24);
                    break L0;
                  } else {
                    L18: {
                      if (null == ((bwa) this).field_Db[var17]) {
                        break L18;
                      } else {
                        var18 = ((bwa) this).field_Db[var17].e(80);
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
                  if (egb.field_o[var16] == null) {
                    break L19;
                  } else {
                    L20: {
                      ((bwa) this).field_Db[var16] = new llb(0L, param10, egb.field_o[var16]);
                      ((bwa) this).field_Db[var16].field_F = 0;
                      stackOut_12_0 = ((bwa) this).field_Db[var16];
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_13_0 = stackOut_12_0;
                      if (param11 == null) {
                        stackOut_14_0 = (llb) (Object) stackIn_14_0;
                        stackOut_14_1 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        break L20;
                      } else {
                        stackOut_13_0 = (llb) (Object) stackIn_13_0;
                        stackOut_13_1 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        break L20;
                      }
                    }
                    stackIn_15_0.field_y = stackIn_15_1 != 0;
                    ((bwa) this).field_Ab.b(-561, ((bwa) this).field_Db[var16]);
                    break L19;
                  }
                }
                var16++;
                continue L5;
              }
            }
          } else {
            ((bwa) this).field_Bb = new llb(0L, param8, vgb.field_q);
            ((bwa) this).field_Bb.field_Y = 11184810;
            ((bwa) this).field_Bb.field_F = 1;
            ((bwa) this).field_Ab.b(-561, ((bwa) this).field_Bb);
            var15_int = 226;
            var16 = 10;
            var17 = ((bwa) this).field_Bb.field_eb.c(((bwa) this).field_Bb.field_R, var15_int);
            ((bwa) this).field_Bb.a(13, -65, var15_int, var16, nna.field_w * var17);
            var16 = var16 + var17 * nna.field_w;
            ((bwa) this).field_Ab.a(0, 116, 13 + var15_int + 13, 24, var16 + 10);
            ((bwa) this).field_Ab.field_gb = uwa.a(11579568, ((bwa) this).field_Ab.field_G, 2105376, 8421504, 117, 3);
            var18 = 13 + (var15_int + 13);
            var19 = 34 - -var16;
            var20 = jv.a((byte) -109, param0, param2, var18);
            var21 = lma.a(param3, param1, var19, (byte) -16);
            ((bwa) this).a(var20, -77, var18, var21, var19);
            break L0;
          }
        }
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 <= 118) {
            return true;
        }
        return (32 & param0) != 0 ? true : false;
    }

    private final int a(int param0, llb param1, String param2, int param3, int param4, llb param5) {
        llb var7 = null;
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
              var7 = new llb(0L, param5, 0, param4, param3, 24, param2);
              if (param0 == 6300) {
                break L1;
              } else {
                var8 = null;
                int discarded$2 = this.a(-27, (llb) null, (String) null, -91, 109, (llb) null);
                break L1;
              }
            }
            param1.b(-561, var7);
            param4 += 32;
            stackOut_2_0 = param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("bwa.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param3).append(44).append(param4).append(44);
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
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final int c(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        qca stackIn_6_0 = null;
        qca stackIn_7_0 = null;
        qca stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        llb stackIn_14_0 = null;
        llb stackIn_15_0 = null;
        llb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        qca stackOut_5_0 = null;
        qca stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        qca stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        llb stackOut_13_0 = null;
        llb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        llb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          ((bwa) this).a(param0, 1332);
          if (null == ((bwa) this).field_Eb) {
            break L0;
          } else {
            L1: {
              ((bwa) this).field_Eb.field_R = ((bwa) this).field_Fb.toString();
              ((bwa) this).field_Eb.field_L = (((bwa) this).field_hb - ((bwa) this).field_Eb.field_eb.b(((bwa) this).field_Eb.field_R)) / 2;
              ((bwa) this).field_Eb.field_hb = ((bwa) this).field_hb + -((bwa) this).field_Eb.field_L;
              if (((bwa) this).field_wb != null) {
                if (((bwa) this).field_wb.field_o != 0) {
                  L2: {
                    stackOut_5_0 = ((bwa) this).field_wb;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (((bwa) this).field_wb.field_J) {
                      stackOut_7_0 = (qca) (Object) stackIn_7_0;
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (qca) (Object) stackIn_6_0;
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_J = stackIn_8_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (var3 >= fva.field_o) {
                break L0;
              } else {
                if (null != ((bwa) this).field_Db[var3]) {
                  L4: {
                    stackOut_13_0 = ((bwa) this).field_Db[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (0 >= ((bwa) this).field_Fb.length()) {
                      stackOut_15_0 = (llb) (Object) stackIn_15_0;
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (llb) (Object) stackIn_14_0;
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_y = stackIn_16_1 != 0;
                  if (((bwa) this).field_Db[var3].field_y) {
                    if (((bwa) this).field_Db[var3].field_o != 0) {
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
          }
        }
        if (param1 == -8703) {
          if (((bwa) this).field_zb.field_o == 0) {
            L5: {
              if (!param0) {
                break L5;
              } else {
                if (pba.field_o == 0) {
                  break L5;
                } else {
                  if (0 != ((bwa) this).field_o) {
                    break L5;
                  } else {
                    return -1;
                  }
                }
              }
            }
            return ((bwa) this).field_xb;
          } else {
            return -1;
          }
        } else {
          return -41;
        }
    }

    static {
    }
}
