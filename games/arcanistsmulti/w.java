/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends kc {
    long field_Fb;
    private kc field_Eb;
    private af field_Kb;
    static String field_Bb;
    private kc field_Gb;
    private kc field_Ib;
    private int field_Hb;
    static boolean field_Cb;
    static int[] field_Lb;
    private StringBuilder field_Db;
    private kc field_Mb;
    static String field_Qb;
    private kc field_Pb;
    private kc field_Nb;
    static String field_Jb;
    private kc[] field_Ob;

    final static boolean a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        if (!(!pn.a((byte) -123))) {
            mc.a(param3, param5, -113, param4);
            if (null != eo.field_c) {
                if (!(!eo.field_c.a(param4, param2, param6, param3, param0 ^ 12815))) {
                    param4 = false;
                    oc.a(false);
                }
            }
            tk.a(0, param4, param3);
            ve.a(param1, param4, (byte) 59);
            param4 = false;
        }
        if (param0 != 0) {
            return false;
        }
        return param4;
    }

    final boolean h(byte param0) {
        int discarded$2 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 >= 105) {
            break L0;
          } else {
            discarded$2 = this.c(true, (byte) -123);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_Kb) {
              break L2;
            } else {
              if (!this.field_Kb.field_ab) {
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

    w(int param0, int param1, int param2, int param3, int param4, kc param5, kc param6, kc param7, kc param8, af param9, kc param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        kc[] var15_array = null;
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
        kc[] var28 = null;
        Object stackIn_6_0 = null;
        af stackIn_6_1 = null;
        af stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        af stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        af stackIn_7_1 = null;
        af stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        af stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        af stackIn_8_1 = null;
        af stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        af stackIn_8_4 = null;
        Object stackIn_9_0 = null;
        af stackIn_9_1 = null;
        af stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        af stackIn_9_4 = null;
        String stackIn_9_5 = null;
        kc stackIn_14_0 = null;
        kc stackIn_15_0 = null;
        kc stackIn_16_0 = null;
        int stackIn_16_1 = 0;
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
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        af stackOut_5_1 = null;
        af stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        af stackOut_5_4 = null;
        Object stackOut_6_0 = null;
        af stackOut_6_1 = null;
        af stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        af stackOut_6_4 = null;
        Object stackOut_8_0 = null;
        af stackOut_8_1 = null;
        af stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        af stackOut_8_4 = null;
        String stackOut_8_5 = null;
        Object stackOut_7_0 = null;
        af stackOut_7_1 = null;
        af stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        af stackOut_7_4 = null;
        String stackOut_7_5 = null;
        kc stackOut_13_0 = null;
        kc stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        kc stackOut_14_0 = null;
        int stackOut_14_1 = 0;
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
        this.field_Hb = -2;
        try {
          L0: {
            L1: {
              this.field_Fb = param12;
              this.field_Nb = new kc(0L, param6, qj.field_e.toUpperCase());
              this.field_Nb.field_X = 1;
              this.a(this.field_Nb, 81);
              this.field_Gb = new kc(0L, param7);
              this.field_Nb.a(this.field_Gb, 10);
              this.field_Pb = new kc(0L, (kc) null);
              this.a(this.field_Pb, 89);
              if (param11 != null) {
                L2: {
                  L3: {
                    this.field_Eb = new kc(0L, param8, da.field_e);
                    this.field_Eb.field_ob = 11184810;
                    this.field_Eb.field_X = 1;
                    this.field_Pb.a(this.field_Eb, 104);
                    this.field_Ib = new kc(0L, param8, rf.field_q);
                    this.field_Ib.field_X = 1;
                    this.field_Ib.field_ob = 11184810;
                    this.field_Pb.a(this.field_Ib, 61);
                    this.field_Mb = new kc(0L, param8);
                    this.field_Mb.field_ob = 16764006;
                    this.field_Pb.a(this.field_Mb, 95);
                    this.field_Mb.field_L = "|";
                    if (5 <= ib.field_r) {
                      break L3;
                    } else {
                      if (qf.field_d < 2) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_5_0 = this;
                      stackOut_5_1 = null;
                      stackOut_5_2 = null;
                      stackOut_5_3 = 0L;
                      stackOut_5_4 = (af) (param9);
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
                      if (-8 >= (ib.field_r ^ -1)) {
                        break L5;
                      } else {
                        stackOut_6_0 = this;
                        stackOut_6_1 = null;
                        stackOut_6_2 = null;
                        stackOut_6_3 = stackIn_6_3;
                        stackOut_6_4 = (af) ((Object) stackIn_6_4);
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        stackIn_8_2 = stackOut_6_2;
                        stackIn_8_3 = stackOut_6_3;
                        stackIn_8_4 = stackOut_6_4;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        stackIn_7_4 = stackOut_6_4;
                        if ((qf.field_d ^ -1) > -3) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = null;
                          stackOut_8_2 = null;
                          stackOut_8_3 = stackIn_8_3;
                          stackOut_8_4 = (af) ((Object) stackIn_8_4);
                          stackOut_8_5 = vd.field_a;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          stackIn_9_2 = stackOut_8_2;
                          stackIn_9_3 = stackOut_8_3;
                          stackIn_9_4 = stackOut_8_4;
                          stackIn_9_5 = stackOut_8_5;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_7_0 = this;
                    stackOut_7_1 = null;
                    stackOut_7_2 = null;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = (af) ((Object) stackIn_7_4);
                    stackOut_7_5 = no.field_wb;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    stackIn_9_5 = stackOut_7_5;
                    break L4;
                  }
                  ((w) (this)).field_Kb = new af(stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  this.field_Pb.a(this.field_Kb, 31);
                  break L2;
                }
                var28 = new kc[3];
                var15_array = var28;
                var28[0] = new kc(0L, (kc) null);
                this.field_Pb.a(var28[0], 7);
                var28[1] = new kc(0L, (kc) null);
                this.field_Pb.a(var28[1], 107);
                var28[2] = new kc(0L, (kc) null);
                this.field_Pb.a(var28[2], 60);
                this.field_Ob = new kc[aj.field_g];
                var16 = 0;
                L6: while (true) {
                  if (aj.field_g <= var16) {
                    L7: {
                      this.field_Db = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_Db.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_Z.b(ri.field_e);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_Z.b(ul.field_s);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_Z.b(ed.field_Db);
                      if (var16 >= var17) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (aj.field_g <= var17) {
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
                          var18 = this.a(param6, var18, var28[0], ri.field_e, var16, (byte) 126);
                          var18 = this.a(var16, var18, var28[0], 77, this.field_Ob[6]);
                          var18 = this.a(var16, var18, var28[0], 15, this.field_Ob[9]);
                          var18 = this.a(var16, var18, var28[0], 103, this.field_Ob[5]);
                          var18 = this.a(var16, var18, var28[0], 97, this.field_Ob[7]);
                          var18 = this.a(var16, var18, var28[0], 94, this.field_Ob[15]);
                          var18 = this.a(var16, var18, var28[0], -7, this.field_Ob[4]);
                          if (var18 <= var17) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var28[1], ul.field_s, var16, (byte) 127);
                          var18 = this.a(var16, var18, var28[1], -104, this.field_Ob[16]);
                          var18 = this.a(var16, var18, var28[1], -107, this.field_Ob[17]);
                          var18 = this.a(var16, var18, var28[1], -117, this.field_Ob[18]);
                          var18 = this.a(var16, var18, var28[1], -111, this.field_Ob[19]);
                          var18 = this.a(var16, var18, var28[1], -110, this.field_Ob[20]);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(param6, var18, var28[2], ed.field_Db, var16, (byte) 127);
                          var18 = this.a(var16, var18, var28[2], -118, this.field_Ob[13]);
                          var18 = this.a(var16, var18, var28[2], 94, this.field_Ob[21]);
                          var18 = this.a(var16, var18, var28[2], -126, this.field_Ob[11]);
                          if (var18 <= var17) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + 3 * var16;
                          var20 = this.field_Nb.c(-25921);
                          if (var20 <= var19) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_Kb) {
                            break L17;
                          } else {
                            var20 = this.field_Kb.a(4, (byte) -126);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Nb.a(var19 + 13 + 13, 0, 0, 24, (byte) -120);
                          this.field_Gb.a(15, -20 + this.field_Nb.field_x, 5, 15, (byte) -120);
                          var21 = 10;
                          this.field_Eb.a(var19, 13, var21, 2 * ga.field_r, (byte) -120);
                          var21 = var21 + 2 * ga.field_r;
                          this.field_Ib.a(var19, 13, var21, ga.field_r * 2, (byte) -120);
                          var21 = var21 + (ga.field_r * 2 - -10);
                          this.field_Mb.a(0, 0, var21, ga.field_r, (byte) -120);
                          var21 = var21 + (ga.field_r - -10);
                          if (null == this.field_Kb) {
                            break L18;
                          } else {
                            var20 = this.field_Kb.a(4, (byte) -126);
                            this.field_Kb.a(13 - -((-var20 + var19) / 2), ga.field_r, var20, var21, -31179, 4);
                            var21 = var21 + (ga.field_r - -10);
                            break L18;
                          }
                        }
                        var28[0].a(var16, 13, var21, var17, (byte) -120);
                        var28[1].a(var16, 13 + var16 + 13, var21, var17, (byte) -120);
                        var28[2].a(var16, 39 + 2 * var16, var21, var17, (byte) -120);
                        var22 = var21;
                        this.field_Pb.a(var19 + 26, 0, 24, 10 + (var22 + var17), (byte) -120);
                        this.field_Pb.field_v = of.a(3, this.field_Pb.field_I, 1, 2105376, 11579568, 8421504);
                        var23 = 13 + (13 - -var19);
                        var24 = 34 - -var22 + var17;
                        var25 = ih.a(param0, var23, param2, 246);
                        var26 = ql.a(10, param3, var24, param1);
                        this.a(var23, var25, var26, var24, (byte) -120);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Ob[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Ob[var17].c(-25921);
                            if (var18 <= var16) {
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
                      if (h.field_K[var16] == null) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Ob[var16] = new kc(0L, param10, h.field_K[var16]);
                          this.field_Ob[var16].field_X = 0;
                          stackOut_13_0 = this.field_Ob[var16];
                          stackIn_15_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (param11 == null) {
                            stackOut_15_0 = (kc) ((Object) stackIn_15_0);
                            stackOut_15_1 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            break L21;
                          } else {
                            stackOut_14_0 = (kc) ((Object) stackIn_14_0);
                            stackOut_14_1 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            break L21;
                          }
                        }
                        stackIn_16_0.field_ub = stackIn_16_1 != 0;
                        this.field_Pb.a(this.field_Ob[var16], 97);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              } else {
                this.field_Eb = new kc(0L, param8, mn.field_x);
                this.field_Eb.field_ob = 11184810;
                this.field_Eb.field_X = 1;
                this.field_Pb.a(this.field_Eb, 109);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Eb.field_Z.a(this.field_Eb.field_rb, var15_int);
                this.field_Eb.a(var15_int, 13, var16, ga.field_r * var17, (byte) -120);
                var16 = var16 + var17 * ga.field_r;
                this.field_Pb.a(13 + var15_int - -13, 0, 24, 10 + var16, (byte) -120);
                this.field_Pb.field_v = of.a(3, this.field_Pb.field_I, 1, 2105376, 11579568, 8421504);
                var18 = var15_int + 26;
                var19 = 34 + var16;
                var20 = ih.a(param0, var18, param2, 246);
                var21 = ql.a(10, param3, var19, param1);
                this.a(var18, var20, var21, var19, (byte) -120);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var15);
            stackOut_49_1 = new StringBuilder().append("w.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          L23: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L23;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L23;
            }
          }
          L24: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L24;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L24;
            }
          }
          L25: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param8 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L25;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L25;
            }
          }
          L26: {
            stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param9 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L26;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L26;
            }
          }
          L27: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param10 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L27;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L27;
            }
          }
          L28: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param11 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    private final int a(kc param0, int param1, kc param2, String param3, int param4, byte param5) {
        kc var7 = null;
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
              var7 = new kc(0L, param0, 0, param1, param4, 24, param3);
              param2.a(var7, 20);
              param1 += 32;
              if (param5 >= 125) {
                break L1;
              } else {
                field_Cb = true;
                break L1;
              }
            }
            stackOut_2_0 = param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7_ref);
            stackOut_4_1 = new StringBuilder().append("w.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final boolean i(byte param0) {
        if (param0 != 2) {
            return false;
        }
        if (!(this.field_Hb == -2)) {
            return false;
        }
        if (vn.field_d == 13) {
            this.field_Hb = -1;
            return true;
        }
        return true;
    }

    public static void g(byte param0) {
        field_Qb = null;
        field_Jb = null;
        if (param0 <= 80) {
            field_Jb = (String) null;
        }
        field_Bb = null;
        field_Lb = null;
    }

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
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
        try {
          L0: {
            L1: {
              param0 = fb.a(false, '_', param0, "");
              if (param2 == 0) {
                break L1;
              } else {
                field_Jb = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = pn.a(param2 ^ 8671, param0);
                if (param1.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if ((param1.indexOf(var3) ^ -1) == 0) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("w.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final String f(byte param0) {
        boolean discarded$0 = false;
        if (param0 != 51) {
            discarded$0 = this.h((byte) -75);
        }
        return this.field_Db.toString();
    }

    private final int a(int param0, int param1, kc param2, int param3, kc param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
            var6_int = 2 / ((param3 - -64) / 34);
            param1 += 8;
            var7 = param4.field_Z.a(param4.field_rb, -(param4.field_t * 2) + param0, param4.field_z);
            param4.a(param0, 0, param1, var7, (byte) -120);
            param1 = param1 + (var7 + 0);
            param2.a(param4, 89);
            stackOut_0_0 = param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var6);
            stackOut_2_1 = new StringBuilder().append("w.F(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param3).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final int c(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        af stackIn_7_0 = null;
        af stackIn_8_0 = null;
        af stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        kc stackIn_15_0 = null;
        kc stackIn_16_0 = null;
        kc stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        af stackOut_6_0 = null;
        af stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        af stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kc stackOut_14_0 = null;
        kc stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        kc stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          var4 = ArcanistsMulti.field_G ? 1 : 0;
          this.b(param0, (byte) 90);
          if (null != this.field_Mb) {
            L1: {
              this.field_Mb.field_rb = this.field_Db.toString();
              this.field_Mb.field_T = (this.field_x + -this.field_Mb.field_Z.b(this.field_Mb.field_rb)) / 2;
              if (null != this.field_Kb) {
                if (this.field_Kb.field_U != 0) {
                  L2: {
                    stackOut_6_0 = this.field_Kb;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (this.field_Kb.field_ab) {
                      stackOut_8_0 = (af) ((Object) stackIn_8_0);
                      stackOut_8_1 = 0;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = (af) ((Object) stackIn_7_0);
                      stackOut_7_1 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                  stackIn_9_0.field_ab = stackIn_9_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            this.field_Mb.field_x = this.field_x - this.field_Mb.field_T;
            var3 = 0;
            L3: while (true) {
              if (var3 >= aj.field_g) {
                break L0;
              } else {
                if (null != this.field_Ob[var3]) {
                  L4: {
                    stackOut_14_0 = this.field_Ob[var3];
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (0 >= this.field_Db.length()) {
                      stackOut_16_0 = (kc) ((Object) stackIn_16_0);
                      stackOut_16_1 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      break L4;
                    } else {
                      stackOut_15_0 = (kc) ((Object) stackIn_15_0);
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L4;
                    }
                  }
                  stackIn_17_0.field_ub = stackIn_17_1 != 0;
                  if (this.field_Ob[var3].field_ub) {
                    if (-1 != (this.field_Ob[var3].field_U ^ -1)) {
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
        if (0 != this.field_Gb.field_U) {
          return -1;
        } else {
          L5: {
            if (param1 == 33) {
              break L5;
            } else {
              field_Bb = (String) null;
              break L5;
            }
          }
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (0 == re.field_r) {
                break L6;
              } else {
                if (0 != this.field_U) {
                  break L6;
                } else {
                  return -1;
                }
              }
            }
          }
          return this.field_Hb;
        }
    }

    static {
        field_Lb = new int[16384];
        field_Bb = "Players";
        field_Jb = "Show all private chat";
        field_Qb = "Log in";
    }
}
