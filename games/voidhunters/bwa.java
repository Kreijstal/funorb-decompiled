/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int discarded$1 = 0;
        llb var3;
        int stackIn_6_0 = 0;
        L0: {
          if (param0 < -59) {
            break L0;
          } else {
            var3 = (llb) null;
            discarded$1 = this.a(44, (llb) null, (String) null, 120, 54, (llb) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_wb) {
              break L2;
            } else {
              if (!this.field_wb.field_J) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final String i(int param0) {
        if (param0 != 0) {
            return (String) null;
        }
        return this.field_Fb.toString();
    }

    final boolean h(int param0) {
        if ((this.field_xb ^ -1) != 1) {
            return false;
        }
        if (13 == pma.field_o) {
            this.field_xb = -1;
        }
        if (param0 != -15244) {
            this.field_yb = 44L;
            return true;
        }
        return true;
    }

    private final int a(llb param0, int param1, int param2, llb param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1 += 8;
              var6_int = param3.field_eb.b(param3.field_R, -(param3.field_w * 2) + param2, param3.field_D);
              param3.a(0, 125, param2, param1, var6_int);
              param1 = param1 + (var6_int - 0);
              if (param4 == 28488) {
                break L1;
              } else {
                this.field_Eb = (llb) null;
                break L1;
              }
            }
            param0.b(param4 ^ -28025, param3);
            stackIn_3_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("bwa.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param4 + ')');
        }
        return stackIn_3_0;
    }

    bwa(int param0, int param1, int param2, int param3, int param4, llb param5, llb param6, llb param7, llb param8, qca param9, llb param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
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
        Object stackIn_8_0;
        qca stackIn_8_1;
        qca stackIn_8_2;
        long stackIn_8_3;
        qca stackIn_8_4;
        Object stackIn_9_0;
        qca stackIn_9_1;
        qca stackIn_9_2;
        long stackIn_9_3;
        qca stackIn_9_4;
        String stackIn_9_5;
        llb stackIn_15_0 = null;
        llb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        StringBuilder stackIn_54_1 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_57_1 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        StringBuilder stackIn_60_1 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        StringBuilder stackIn_63_1 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        StringBuilder stackIn_66_1 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_69_1 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15_ref = null;
        this.field_xb = -2;
        try {
          L0: {
            L1: {
              this.field_yb = param12;
              this.field_Cb = new llb(0L, param6, hpb.field_j.toUpperCase());
              this.field_Cb.field_F = 1;
              this.b(-561, this.field_Cb);
              this.field_zb = new llb(0L, param7);
              this.field_Cb.b(-561, this.field_zb);
              this.field_Ab = new llb(0L, (llb) null);
              this.b(-561, this.field_Ab);
              if (param11 != null) {
                L2: {
                  L3: {
                    this.field_Bb = new llb(0L, param8, lcb.field_p);
                    this.field_Bb.field_Y = 11184810;
                    this.field_Bb.field_F = 1;
                    this.field_Ab.b(-561, this.field_Bb);
                    this.field_vb = new llb(0L, param8, fh.field_j);
                    this.field_vb.field_Y = 11184810;
                    this.field_vb.field_F = 1;
                    this.field_Ab.b(-561, this.field_vb);
                    this.field_Eb = new llb(0L, param8);
                    this.field_Eb.field_Y = 16764006;
                    this.field_Ab.b(-561, this.field_Eb);
                    this.field_Eb.field_s = "|";
                    if (nfa.field_d >= 5) {
                      break L3;
                    } else {
                      if (go.field_p < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_8_0 = this;

                      stackIn_8_1 = null;

                      stackIn_8_2 = null;

                      stackIn_8_3 = 0L;

                      stackIn_8_4 = (qca) (param9);

                      if (nfa.field_d >= 7) {
                        break L5;
                      } else {
                        stackIn_8_0 = this;

                        stackIn_8_1 = null;

                        stackIn_8_2 = null;

                        stackIn_8_4 = (qca) ((Object) stackIn_8_4);

                        if (-3 >= (go.field_p ^ -1)) {
                          break L5;
                        } else {
                          stackIn_9_0 = this;
                          stackIn_9_1 = null;
                          stackIn_9_2 = null;
                          stackIn_9_3 = stackIn_8_3;
                          stackIn_9_4 = (qca) ((Object) stackIn_8_4);
                          stackIn_9_5 = po.field_p;
                          break L4;
                        }
                      }
                    }
                    stackIn_9_0 = this;
                    stackIn_9_1 = null;
                    stackIn_9_2 = null;
                    stackIn_9_3 = stackIn_8_3;
                    stackIn_9_4 = (qca) ((Object) stackIn_8_4);
                    stackIn_9_5 = pqa.field_p;
                    break L4;
                  }
                  ((bwa) (this)).field_wb = new qca(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  this.field_Ab.b(-561, this.field_wb);
                  break L2;
                }
                var28 = new llb[3];
                var15 = var28;
                var28[0] = new llb(0L, (llb) null);
                this.field_Ab.b(-561, var28[0]);
                var28[1] = new llb(0L, (llb) null);
                this.field_Ab.b(-561, var28[1]);
                var28[2] = new llb(0L, (llb) null);
                this.field_Ab.b(-561, var28[2]);
                this.field_Db = new llb[fva.field_o];
                var16 = 0;
                L6: while (true) {
                  if (fva.field_o <= var16) {
                    L7: {
                      this.field_Fb = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_Fb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_eb.b(gca.field_p);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_eb.b(oqb.field_n);
                      if (var17 <= var16) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_eb.b(jrb.field_p);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= fva.field_o) {
                        L12: {
                          if ((var16 ^ -1) >= -141) {
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
                          var18 = this.a(6300, var28[0], gca.field_p, var16, var18, param6);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[6], 28488);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[9], 28488);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[5], 28488);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[7], 28488);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[15], 28488);
                          var18 = this.a(var28[0], var18, var16, this.field_Db[4], 28488);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(6300, var28[1], oqb.field_n, var16, var18, param6);
                          var18 = this.a(var28[1], var18, var16, this.field_Db[16], 28488);
                          var18 = this.a(var28[1], var18, var16, this.field_Db[17], 28488);
                          var18 = this.a(var28[1], var18, var16, this.field_Db[18], 28488);
                          var18 = this.a(var28[1], var18, var16, this.field_Db[19], 28488);
                          var18 = this.a(var28[1], var18, var16, this.field_Db[20], 28488);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(6300, var28[2], jrb.field_p, var16, var18, param6);
                          var18 = this.a(var28[2], var18, var16, this.field_Db[13], 28488);
                          var18 = this.a(var28[2], var18, var16, this.field_Db[21], 28488);
                          var18 = this.a(var28[2], var18, var16, this.field_Db[11], 28488);
                          if (var18 <= var17) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = var16 * 3 + 26;
                          var20 = this.field_Cb.e(112);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (this.field_wb == null) {
                            break L17;
                          } else {
                            var20 = this.field_wb.b(4, 0);
                            if (var19 >= var20) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Cb.a(0, 35, 13 + (var19 - -13), 0, 24);
                          this.field_zb.a(this.field_Cb.field_hb - 20, 119, 15, 5, 15);
                          var21 = 10;
                          this.field_Bb.a(13, 118, var19, var21, nna.field_w * 2);
                          var21 = var21 + 2 * nna.field_w;
                          this.field_vb.a(13, 122, var19, var21, nna.field_w * 2);
                          var21 = var21 + (nna.field_w * 2 + 10);
                          this.field_Eb.a(0, -104, 0, var21, nna.field_w);
                          var21 = var21 + (10 + nna.field_w);
                          if (this.field_wb == null) {
                            break L18;
                          } else {
                            var20 = this.field_wb.b(4, 0);
                            this.field_wb.a((-var20 + var19) / 2 + 13, nna.field_w, 4, var21, var20, false);
                            var21 = var21 + (nna.field_w - -10);
                            break L18;
                          }
                        }
                        var28[0].a(13, 122, var16, var21, var17);
                        var28[1].a(13 + (13 + var16), -106, var16, var21, var17);
                        var28[2].a(39 + 2 * var16, -128, var16, var21, var17);
                        var22 = var21;
                        this.field_Ab.a(0, -94, var19 + 13 + 13, 24, 10 + var17 + var22);
                        this.field_Ab.field_gb = uwa.a(11579568, this.field_Ab.field_G, 2105376, 8421504, 104, 3);
                        var23 = 26 + var19;
                        var24 = 10 + (24 + (var22 + var17));
                        var25 = jv.a((byte) -109, param0, param2, var23);
                        var26 = lma.a(param3, param1, var24, (byte) -16);
                        this.a(var25, 0, var23, var26, var24);
                        break L1;
                      } else {
                        L19: {
                          if (null == this.field_Db[var17]) {
                            break L19;
                          } else {
                            var18 = this.field_Db[var17].e(80);
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
                      if (egb.field_o[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Db[var16] = new llb(0L, param10, egb.field_o[var16]);
                          this.field_Db[var16].field_F = 0;
                          stackIn_15_0 = this.field_Db[var16];

                          if (param11 == null) {
                            stackIn_16_0 = (llb) ((Object) stackIn_15_0);
                            stackIn_16_1 = 0;
                            break L21;
                          } else {
                            stackIn_16_0 = (llb) ((Object) stackIn_15_0);
                            stackIn_16_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_16_0.field_y = stackIn_16_1 != 0;
                        this.field_Ab.b(-561, this.field_Db[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                this.field_Bb = new llb(0L, param8, vgb.field_q);
                this.field_Bb.field_Y = 11184810;
                this.field_Bb.field_F = 1;
                this.field_Ab.b(-561, this.field_Bb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Bb.field_eb.c(this.field_Bb.field_R, var15_int);
                this.field_Bb.a(13, -65, var15_int, var16, nna.field_w * var17);
                var16 = var16 + var17 * nna.field_w;
                this.field_Ab.a(0, 116, 13 + var15_int + 13, 24, var16 + 10);
                this.field_Ab.field_gb = uwa.a(11579568, this.field_Ab.field_G, 2105376, 8421504, 117, 3);
                var18 = 13 + (var15_int + 13);
                var19 = 34 - -var16;
                var20 = jv.a((byte) -109, param0, param2, var18);
                var21 = lma.a(param3, param1, var19, (byte) -16);
                this.a(var20, -77, var18, var21, var19);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("bwa.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L22;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');

            if (param6 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L23;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L23;
            }
          }
          L24: {


            stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');

            if (param7 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L24;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L24;
            }
          }
          L25: {


            stackIn_60_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');

            if (param8 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "null";
              break L25;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_61_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackIn_61_2 = "{...}";
              break L25;
            }
          }
          L26: {


            stackIn_63_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');

            if (param9 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "null";
              break L26;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_64_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackIn_64_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_66_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');

            if (param10 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "null";
              break L27;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackIn_67_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_69_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');

            if (param11 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "null";
              break L28;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackIn_70_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackIn_70_2 = "{...}";
              break L28;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final static boolean a(int param0, byte param1, int param2) {
        if (param1 <= 118) {
            return true;
        }
        return (32 & param0) != 0 ? true : false;
    }

    private final int a(int param0, llb param1, String param2, int param3, int param4, llb param5) {
        int discarded$1 = 0;
        llb var7 = null;
        RuntimeException var7_ref = null;
        llb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new llb(0L, param5, 0, param4, param3, 24, param2);
              if (param0 == 6300) {
                break L1;
              } else {
                var8 = (llb) null;
                discarded$1 = this.a(-27, (llb) null, (String) null, -91, 109, (llb) null);
                break L1;
              }
            }
            param1.b(-561, var7);
            param4 += 32;
            stackIn_3_0 = param4;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("bwa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final int c(boolean param0, int param1) {
        qca stackIn_7_0 = null;
        qca stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        llb stackIn_15_0 = null;
        llb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var3;
        int var4;
        L0: {
          var4 = VoidHunters.field_G;
          this.a(param0, 1332);
          if (null == this.field_Eb) {
            break L0;
          } else {
            L1: {
              this.field_Eb.field_R = this.field_Fb.toString();
              this.field_Eb.field_L = (this.field_hb - this.field_Eb.field_eb.b(this.field_Eb.field_R)) / 2;
              this.field_Eb.field_hb = this.field_hb + -this.field_Eb.field_L;
              if (this.field_wb != null) {
                if (this.field_wb.field_o != 0) {
                  L2: {
                    stackIn_7_0 = this.field_wb;

                    if (this.field_wb.field_J) {
                      stackIn_8_0 = (qca) ((Object) stackIn_7_0);
                      stackIn_8_1 = 0;
                      break L2;
                    } else {
                      stackIn_8_0 = (qca) ((Object) stackIn_7_0);
                      stackIn_8_1 = 1;
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
                if (null != this.field_Db[var3]) {
                  L4: {
                    stackIn_15_0 = this.field_Db[var3];

                    if (0 >= this.field_Fb.length()) {
                      stackIn_16_0 = (llb) ((Object) stackIn_15_0);
                      stackIn_16_1 = 0;
                      break L4;
                    } else {
                      stackIn_16_0 = (llb) ((Object) stackIn_15_0);
                      stackIn_16_1 = 1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_y = stackIn_16_1 != 0;
                  if (this.field_Db[var3].field_y) {
                    if (-1 != (this.field_Db[var3].field_o ^ -1)) {
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
          if (this.field_zb.field_o == 0) {
            L5: {
              if (!param0) {
                break L5;
              } else {
                if (pba.field_o == 0) {
                  break L5;
                } else {
                  if (0 != this.field_o) {
                    break L5;
                  } else {
                    return -1;
                  }
                }
              }
            }
            return this.field_xb;
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
