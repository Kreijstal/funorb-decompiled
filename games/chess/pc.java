/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
              if (param3 == -42) {
                break L1;
              } else {
                this.a(false);
                break L1;
              }
            }
            var6_int = param4.field_xb.b(param4.field_db, -(param4.field_z * 2) + param2, param4.field_K);
            param4.a(0, param2, -2147483648, var6_int, param1);
            param0.a((byte) 127, param4);
            param1 = param1 + (0 + var6_int);
            stackIn_3_0 = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("pc.G(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    pc(int param0, int param1, int param2, int param3, int param4, ci param5, ci param6, ci param7, ci param8, he param9, ci param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException runtimeException = null;
        ci[] var15 = null;
        int var15_int = 0;
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
        int var27 = 0;
        ci[] var28 = null;
        Object stackIn_7_0;
        he stackIn_7_1;
        he stackIn_7_2;
        long stackIn_7_3;
        he stackIn_7_4;
        Object stackIn_8_0;
        he stackIn_8_1;
        he stackIn_8_2;
        long stackIn_8_3;
        he stackIn_8_4;
        String stackIn_8_5;
        ci stackIn_15_0 = null;
        ci stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_19_0 = null;
        String stackIn_19_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_61_1 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_62_2 = null;
        StringBuilder stackIn_64_1 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        StringBuilder stackIn_67_1 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        var27 = Chess.field_G;
        this.field_Gb = -2;
        try {
          L0: {
            L1: {
              L2: {
                this.field_Lb = param12;
                this.field_Nb = new ci(0L, param6, se.field_W.toUpperCase());
                this.field_Nb.field_fb = 1;
                this.a((byte) 125, this.field_Nb);
                this.field_Fb = new ci(0L, param7);
                this.field_Nb.a((byte) 126, this.field_Fb);
                this.field_Eb = new ci(0L, (ci) null);
                this.a((byte) 125, this.field_Eb);
                if (param11 == null) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      this.field_Hb = new ci(0L, param8, af.field_a);
                      this.field_Hb.field_ib = 11184810;
                      this.field_Hb.field_fb = 1;
                      this.field_Eb.a((byte) 127, this.field_Hb);
                      this.field_Ob = new ci(0L, param8, td.field_m);
                      this.field_Ob.field_fb = 1;
                      this.field_Ob.field_ib = 11184810;
                      this.field_Eb.a((byte) 124, this.field_Ob);
                      this.field_Ib = new ci(0L, param8);
                      this.field_Ib.field_ib = 16764006;
                      this.field_Eb.a((byte) 125, this.field_Ib);
                      this.field_Ib.field_S = "|";
                      if (5 <= sb.field_rb) {
                        break L4;
                      } else {
                        if (sk.field_t < 2) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      L6: {
                        stackIn_7_0 = this;

                        stackIn_7_1 = null;

                        stackIn_7_2 = null;

                        stackIn_7_3 = 0L;

                        stackIn_7_4 = (he) (param9);

                        if (sb.field_rb >= 7) {
                          break L6;
                        } else {
                          stackIn_7_0 = this;

                          stackIn_7_1 = null;

                          stackIn_7_2 = null;

                          stackIn_7_4 = (he) ((Object) stackIn_7_4);

                          if ((sk.field_t ^ -1) <= -3) {
                            break L6;
                          } else {
                            stackIn_8_0 = this;
                            stackIn_8_1 = null;
                            stackIn_8_2 = null;
                            stackIn_8_3 = stackIn_7_3;
                            stackIn_8_4 = (he) ((Object) stackIn_7_4);
                            stackIn_8_5 = jd.field_a;
                            break L5;
                          }
                        }
                      }
                      stackIn_8_0 = this;
                      stackIn_8_1 = null;
                      stackIn_8_2 = null;
                      stackIn_8_3 = stackIn_7_3;
                      stackIn_8_4 = (he) ((Object) stackIn_7_4);
                      stackIn_8_5 = h.field_m;
                      break L5;
                    }
                    ((pc) (this)).field_Kb = new he(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                    this.field_Eb.a((byte) 127, this.field_Kb);
                    break L3;
                  }
                  var28 = new ci[3];
                  var15 = var28;
                  var28[0] = new ci(0L, (ci) null);
                  this.field_Eb.a((byte) 126, var28[0]);
                  var28[1] = new ci(0L, (ci) null);
                  this.field_Eb.a((byte) 126, var28[1]);
                  var28[2] = new ci(0L, (ci) null);
                  this.field_Eb.a((byte) 124, var28[2]);
                  this.field_Jb = new ci[re.field_j];
                  var16 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if ((var16 ^ -1) <= (re.field_j ^ -1)) {
                          break L9;
                        } else {
                          stackIn_19_0 = null;

                          stackIn_19_1 = mi.field_t[var16];

                          if (var27 != 0) {
                            break L8;
                          } else {
                            L10: {
                              if (stackIn_19_0 == stackIn_19_1) {
                                break L10;
                              } else {
                                L11: {
                                  this.field_Jb[var16] = new ci(0L, param10, mi.field_t[var16]);
                                  this.field_Jb[var16].field_fb = 0;
                                  stackIn_15_0 = this.field_Jb[var16];

                                  if (param11 == null) {
                                    stackIn_16_0 = (ci) ((Object) stackIn_15_0);
                                    stackIn_16_1 = 0;
                                    break L11;
                                  } else {
                                    stackIn_16_0 = (ci) ((Object) stackIn_15_0);
                                    stackIn_16_1 = 1;
                                    break L11;
                                  }
                                }
                                stackIn_16_0.field_tb = stackIn_16_1 != 0;
                                this.field_Eb.a((byte) 125, this.field_Jb[var16]);
                                break L10;
                              }
                            }
                            var16++;
                            if (var27 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      this.field_Pb = new StringBuilder(12);
                      stackIn_19_0 = null;
                      stackIn_19_1 = (String) (param11);
                      break L8;
                    }
                    L12: {
                      if (stackIn_19_0 == stackIn_19_1) {
                        break L12;
                      } else {
                        discarded$1 = this.field_Pb.append(param11);
                        break L12;
                      }
                    }
                    L13: {
                      var16 = 0;
                      var17 = param6.field_xb.b(cl.field_h);
                      if (var16 >= var17) {
                        break L13;
                      } else {
                        var16 = var17;
                        break L13;
                      }
                    }
                    L14: {
                      var17 = param6.field_xb.b(nb.field_Gb);
                      if ((var16 ^ -1) <= (var17 ^ -1)) {
                        break L14;
                      } else {
                        var16 = var17;
                        break L14;
                      }
                    }
                    L15: {
                      var17 = param6.field_xb.b(qh.field_d);
                      if (var16 >= var17) {
                        break L15;
                      } else {
                        var16 = var17;
                        break L15;
                      }
                    }
                    var17 = 0;
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var17 >= re.field_j) {
                            break L18;
                          } else {
                            if (var27 != 0) {
                              break L17;
                            } else {
                              L19: {
                                if (this.field_Jb[var17] == null) {
                                  break L19;
                                } else {
                                  var18 = this.field_Jb[var17].e((byte) -88);
                                  if (var18 <= var16) {
                                    break L19;
                                  } else {
                                    var16 = var18;
                                    break L19;
                                  }
                                }
                              }
                              var17++;
                              if (var27 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        L20: {
                          if (var16 <= 140) {
                            break L20;
                          } else {
                            var16 = 140;
                            break L20;
                          }
                        }
                        var17 = 0;
                        break L17;
                      }
                      L21: {
                        var18 = 0;
                        var18 = 0;
                        var18 = this.a(cl.field_h, (byte) 108, param6, var18, var16, var28[0]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[6]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[9]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[5]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[7]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[15]);
                        var18 = this.a(var28[0], var18, var16, (byte) -42, this.field_Jb[4]);
                        if (var17 >= var18) {
                          break L21;
                        } else {
                          var17 = var18;
                          break L21;
                        }
                      }
                      L22: {
                        var18 = 0;
                        var18 = this.a(nb.field_Gb, (byte) 108, param6, var18, var16, var28[1]);
                        var18 = this.a(var28[1], var18, var16, (byte) -42, this.field_Jb[16]);
                        var18 = this.a(var28[1], var18, var16, (byte) -42, this.field_Jb[17]);
                        var18 = this.a(var28[1], var18, var16, (byte) -42, this.field_Jb[18]);
                        var18 = this.a(var28[1], var18, var16, (byte) -42, this.field_Jb[19]);
                        var18 = this.a(var28[1], var18, var16, (byte) -42, this.field_Jb[20]);
                        if ((var18 ^ -1) >= (var17 ^ -1)) {
                          break L22;
                        } else {
                          var17 = var18;
                          break L22;
                        }
                      }
                      L23: {
                        var18 = 0;
                        var18 = this.a(qh.field_d, (byte) 108, param6, var18, var16, var28[2]);
                        var18 = this.a(var28[2], var18, var16, (byte) -42, this.field_Jb[13]);
                        var18 = this.a(var28[2], var18, var16, (byte) -42, this.field_Jb[21]);
                        var18 = this.a(var28[2], var18, var16, (byte) -42, this.field_Jb[11]);
                        if ((var17 ^ -1) <= (var18 ^ -1)) {
                          break L23;
                        } else {
                          var17 = var18;
                          break L23;
                        }
                      }
                      L24: {
                        var19 = 26 + 3 * var16;
                        var20 = this.field_Nb.e((byte) 122);
                        if (var20 <= var19) {
                          break L24;
                        } else {
                          var19 = var20;
                          break L24;
                        }
                      }
                      L25: {
                        if (null == this.field_Kb) {
                          break L25;
                        } else {
                          var20 = this.field_Kb.a((byte) 119, 4);
                          if (var20 <= var19) {
                            break L25;
                          } else {
                            var19 = var20;
                            break L25;
                          }
                        }
                      }
                      L26: {
                        this.field_Nb.a(0, 13 + (var19 - -13), -2147483648, 24, 0);
                        this.field_Fb.a(-20 + this.field_Nb.field_M, 15, -2147483648, 15, 5);
                        var21 = 10;
                        this.field_Hb.a(13, var19, -2147483648, fe.field_g * 2, var21);
                        var21 = var21 + 2 * fe.field_g;
                        this.field_Ob.a(13, var19, -2147483648, fe.field_g * 2, var21);
                        var21 = var21 + (fe.field_g * 2 - -10);
                        this.field_Ib.a(0, 0, -2147483648, fe.field_g, var21);
                        var21 = var21 + (10 + fe.field_g);
                        if (this.field_Kb == null) {
                          break L26;
                        } else {
                          var20 = this.field_Kb.a((byte) 123, 4);
                          this.field_Kb.a(fe.field_g, 13 - -((-var20 + var19) / 2), (byte) 127, 4, var20, var21);
                          var21 = var21 + (fe.field_g + 10);
                          break L26;
                        }
                      }
                      var28[0].a(13, var16, -2147483648, var17, var21);
                      var28[1].a(26 + var16, var16, -2147483648, var17, var21);
                      var28[2].a(26 + 2 * var16 + 13, var16, -2147483648, var17, var21);
                      var22 = var21;
                      this.field_Eb.a(0, 13 + var19 + 13, -2147483648, var22 - (-var17 - 10), 24);
                      this.field_Eb.field_Ab = wh.a(-116, this.field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
                      var23 = var19 + 13 - -13;
                      var24 = 24 + var22 + (var17 + 10);
                      var25 = ao.a(var23, true, param0, param2);
                      var26 = sg.a(param1, var24, param3, 0);
                      this.a(var25, var23, -2147483648, var24, var26);
                      if (var27 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_Hb = new ci(0L, param8, rf.field_c);
              this.field_Hb.field_ib = 11184810;
              this.field_Hb.field_fb = 1;
              this.field_Eb.a((byte) 125, this.field_Hb);
              var15_int = 226;
              var16 = 10;
              var17 = this.field_Hb.field_xb.b(this.field_Hb.field_db, var15_int);
              this.field_Hb.a(13, var15_int, -2147483648, fe.field_g * var17, var16);
              var16 = var16 + fe.field_g * var17;
              this.field_Eb.a(0, 13 + var15_int + 13, -2147483648, var16 + 10, 24);
              this.field_Eb.field_Ab = wh.a(93, this.field_Eb.field_pb, 3, 11579568, 8421504, 2105376);
              var18 = 26 + var15_int;
              var19 = var16 + 34;
              var20 = ao.a(var18, true, param0, param2);
              var21 = sg.a(param1, var19, param3, 0);
              this.a(var20, var18, -2147483648, var19, var21);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            runtimeException = decompiledCaughtException;
            stackIn_55_0 = (RuntimeException) (runtimeException);

            stackIn_55_1 = new StringBuilder().append("pc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "null";
              break L27;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
              stackIn_56_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',');

            if (param6 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L28;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_61_1 = ((StringBuilder) (Object) stackIn_59_1).append(stackIn_59_2).append(',');

            if (param7 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "null";
              break L29;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_62_1 = (StringBuilder) ((Object) stackIn_61_1);
              stackIn_62_2 = "{...}";
              break L29;
            }
          }
          L30: {


            stackIn_64_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_62_2).append(',');

            if (param8 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "null";
              break L30;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_65_1 = (StringBuilder) ((Object) stackIn_64_1);
              stackIn_65_2 = "{...}";
              break L30;
            }
          }
          L31: {


            stackIn_67_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(',');

            if (param9 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L31;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L31;
            }
          }
          L32: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param10 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L32;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L32;
            }
          }
          L33: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param11 == null) {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L33;
            } else {
              stackIn_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L33;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_56_0), stackIn_74_2 + ',' + param12 + ')');
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            this.field_Pb = (StringBuilder) null;
        }
        return this.field_Pb.toString();
    }

    private final int a(String param0, byte param1, ci param2, int param3, int param4, ci param5) {
        ci var7 = null;
        RuntimeException var7_ref = null;
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
              var7 = new ci(0L, param2, 0, param3, param4, 24, param0);
              if (param1 == 108) {
                break L1;
              } else {
                field_Qb = (String) null;
                break L1;
              }
            }
            param5.a((byte) 126, var7);
            param3 += 32;
            stackIn_3_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("pc.A(");

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

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
          throw fk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final int b(boolean param0, byte param1) {
        he stackIn_6_0 = null;
        he stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ci stackIn_15_0 = null;
        ci stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int var3;
        int var4;
        L0: {
          L1: {
            var4 = Chess.field_G;
            this.a(param0, (byte) 88);
            if (this.field_Ib != null) {
              L2: {
                this.field_Ib.field_db = this.field_Pb.toString();
                this.field_Ib.field_mb = (this.field_M + -this.field_Ib.field_xb.b(this.field_Ib.field_db)) / 2;
                this.field_Ib.field_M = -this.field_Ib.field_mb + this.field_M;
                if (this.field_Kb == null) {
                  break L2;
                } else {
                  if (-1 == (this.field_Kb.field_L ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      stackIn_6_0 = this.field_Kb;

                      if (this.field_Kb.field_gb) {
                        stackIn_7_0 = (he) ((Object) stackIn_6_0);
                        stackIn_7_1 = 0;
                        break L3;
                      } else {
                        stackIn_7_0 = (he) ((Object) stackIn_6_0);
                        stackIn_7_1 = 1;
                        break L3;
                      }
                    }
                    stackIn_7_0.field_gb = stackIn_7_1 != 0;
                    break L2;
                  }
                }
              }
              var3 = 0;
              L4: while (true) {
                if ((var3 ^ -1) <= (re.field_j ^ -1)) {
                  break L1;
                } else {
                  if (var4 != 0) {
                    break L0;
                  } else {
                    L5: {
                      if (null != this.field_Jb[var3]) {
                        L6: {
                          stackIn_15_0 = this.field_Jb[var3];

                          if (this.field_Pb.length() <= 0) {
                            stackIn_16_0 = (ci) ((Object) stackIn_15_0);
                            stackIn_16_1 = 0;
                            break L6;
                          } else {
                            stackIn_16_0 = (ci) ((Object) stackIn_15_0);
                            stackIn_16_1 = 1;
                            break L6;
                          }
                        }
                        stackIn_16_0.field_tb = stackIn_16_1 != 0;
                        if (!this.field_Jb[var3].field_tb) {
                          break L5;
                        } else {
                          if (-1 == (this.field_Jb[var3].field_L ^ -1)) {
                            break L5;
                          } else {
                            return var3;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    var3++;
                    if (var4 == 0) {
                      continue L4;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          if (this.field_Fb.field_L != 0) {
            break L0;
          } else {
            L7: {
              if (!param0) {
                break L7;
              } else {
                if (0 == th.field_d) {
                  break L7;
                } else {
                  if (-1 == (this.field_L ^ -1)) {
                    return -1;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              if (param1 == -95) {
                break L8;
              } else {
                this.field_Ib = (ci) null;
                break L8;
              }
            }
            return this.field_Gb;
          }
        }
        return -1;
    }

    final boolean f(byte param0) {
        if ((this.field_Gb ^ -1) != 1) {
            return false;
        }
        if (param0 != 95) {
            this.field_Nb = (ci) null;
        }
        if (-14 != (vg.field_a ^ -1)) {
            return true;
        }
        this.field_Gb = -1;
        return true;
    }

    final boolean b(boolean param0) {
        int stackIn_6_0 = 0;
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
            if (null == this.field_Kb) {
              break L2;
            } else {
              if (!this.field_Kb.field_gb) {
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

    final static void a(boolean param0, int param1, boolean param2, boolean param3, int param4) {
        ci stackIn_17_0 = null;
        ci stackIn_18_0 = null;
        ci stackIn_19_0 = null;
        ci stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_114_0 = false;
        int stackIn_131_0 = 0;
        boolean stackIn_142_0 = false;
        boolean stackIn_159_0 = false;
        int stackIn_165_0 = 0;
        ci stackIn_181_0 = null;
        ci stackIn_182_0 = null;
        ci stackIn_183_0 = null;
        ci stackIn_184_0 = null;
        ci stackIn_185_0 = null;
        int stackIn_185_1 = 0;
        ci stackIn_186_0 = null;
        ci stackIn_187_0 = null;
        ci stackIn_188_0 = null;
        ci stackIn_189_0 = null;
        ci stackIn_190_0 = null;
        int stackIn_190_1 = 0;
        ci stackIn_191_0 = null;
        ci stackIn_192_0 = null;
        ci stackIn_193_0 = null;
        ci stackIn_194_0 = null;
        ci stackIn_195_0 = null;
        int stackIn_195_1 = 0;
        Throwable caughtException = null;
        boolean stackOut_113_0;
        boolean stackOut_141_0;
        boolean stackOut_158_0;
        int statePc = 0;
        ci var5 = null;
        int var5_int = 0;
        RuntimeException var5_ref = null;
        ci var6 = null;
        ci var7 = null;
        ci var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int var13_int = 0;
        String var13_ref = null;
        int var14_int = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        jc var17 = null;
        Object var18 = null;
        int var18_int = 0;
        r var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        String var22 = null;
        String var23 = null;
        int[] var24 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var18 = null;
                    var19 = Chess.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    f.a(ed.field_c, true);
                    if (null == pd.field_Rb) {
                        statePc = 180;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    sc.field_d.field_tb = true;
                    uj.field_j.field_pb = 0;
                    var5 = uj.field_j;
                    var5.field_M = 0;
                    aa.field_g.field_pb = 0;
                    var6 = aa.field_g;
                    var6.field_M = 0;
                    tn.field_j.field_pb = 0;
                    var7 = tn.field_j;
                    var7.field_M = 0;
                    if (!ci.f(-12)) {
                        statePc = 174;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    sc.field_f.field_db = ge.field_cb.toUpperCase();
                    var9 = (2 + ri.field_k.field_M) / 2;
                    uj.field_j.a(0, var9 - 2, -2147483648, 40, -40 + ri.field_k.field_pb);
                    if (pd.field_Rb.field_Xb >= pd.field_Rb.field_hc) {
                        statePc = 6;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    uj.field_j.field_db = uh.field_v.toUpperCase();
                    uj.field_j.field_tb = true;
                    if (var19 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    uj.field_j.field_db = oj.field_b.toUpperCase();
                    uj.field_j.field_tb = false;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    uj.field_j.field_Ab = nj.field_x.field_Ab;
                    if (cb.field_f > 0) {
                        statePc = 9;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (1 != cb.field_f) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    var10_ref_String = ob.field_A;
                    if (var19 == 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    var10_ref_String = oc.a(tg.field_b, new String[]{Integer.toString(cb.field_f)}, (byte) -119);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    uj.field_j.field_db = uj.field_j.field_db + "<br>" + var10_ref_String;
                    if ((16 & g.field_c) != 0) {
                        statePc = 16;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (!jh.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    uj.field_j.field_Ab = nj.field_x.field_Q;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    aa.field_g.a(var9, ri.field_k.field_M + -var9, -2147483648, 40, ri.field_k.field_pb + -40);
                    aa.field_g.field_db = fl.field_k.toUpperCase();
                    var8 = aa.field_g;
                    stackIn_19_0 = aa.field_g;
                    stackIn_17_0 = stackIn_19_0;
                    if (!param2) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_19_0 = (ci) ((Object) stackIn_17_0);
                    stackIn_18_0 = stackIn_19_0;
                    if (0L != eg.field_e) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    stackIn_20_0 = (ci) ((Object) stackIn_18_0);
                    stackIn_20_1 = 1;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (ci) ((Object) stackIn_19_0);
                    stackIn_20_1 = 0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_20_0.field_tb = stackIn_20_1 != 0;
                    var10 = 2;
                    if (null != hd.field_n) {
                        statePc = 22;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (null != d.field_Jb) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    bi.field_d = new boolean[qa.field_e];
                    d.field_Jb = new byte[qa.field_e];
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    var11_int = 0;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if ((var11_int ^ -1) <= (qa.field_e ^ -1)) {
                        statePc = 29;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    bi.field_d[var11_int] = false;
                    var11_int++;
                    if (var19 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    if (var19 == 0) {
                        statePc = 25;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var10 = 0;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    if (2 <= var10) {
                        statePc = 68;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var11_int = 0;
                    stackIn_69_0 = 0;
                    stackIn_33_0 = stackIn_69_0;
                    if (var19 != 0) {
                        statePc = 69;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    var12 = stackIn_33_0;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = var12 ^ -1;
                    stackIn_35_1 = hd.field_n.length ^ -1;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    if (stackIn_35_0 <= stackIn_35_1) {
                        statePc = 64;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    var24 = hd.field_n[var12];
                    var21 = var24;
                    var20 = var21;
                    var13 = var20;
                    stackIn_65_0 = 0;
                    stackIn_37_0 = stackIn_65_0;
                    if (var19 != 0) {
                        statePc = 65;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    var14_int = stackIn_37_0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((var24.length ^ -1) >= (var14_int ^ -1)) {
                        statePc = 54;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    var15 = var24[var14_int];
                    var16 = var20[1 + var14_int];
                    stackIn_56_0 = var15;
                    stackIn_40_0 = stackIn_56_0;
                    stackIn_56_1 = -1;
                    stackIn_40_1 = stackIn_56_1;
                    if (var19 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    if (stackIn_40_0 != stackIn_40_1) {
                        statePc = 49;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if (0 == var10) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackIn_44_0 = pd.field_Rb.field_Xb;
                    statePc = 44;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_44_0 = pd.field_Rb.field_hc;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    var17_int = stackIn_44_0;
                    if ((var16 ^ -1) == (var17_int ^ -1)) {
                        statePc = 47;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (var19 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 47: {
                    if (var19 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((var16 ^ -1) == (255 & pd.field_Rb.field_sc[var15] ^ -1)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (var19 == 0) {
                        statePc = 63;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    var14_int += 2;
                    if (var19 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    var11_int = 1;
                    var14_int = -1;
                    var15 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    stackIn_56_0 = var24.length ^ -1;
                    stackIn_56_1 = var15 ^ -1;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 >= stackIn_56_1) {
                        statePc = 62;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var16 = var24[var15];
                    stackIn_35_0 = var14_int;
                    stackIn_58_0 = stackIn_35_0;
                    stackIn_35_1 = var16;
                    stackIn_58_1 = stackIn_35_1;
                    if (var19 != 0) {
                        statePc = 35;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 < stackIn_58_1) {
                        statePc = 60;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 60: {
                    var14_int = var16;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    var15 += 2;
                    if (var19 == 0) {
                        statePc = 55;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    bi.field_d[var14_int] = true;
                    statePc = 63;
                    continue stateLoop;
                }
                case 63: {
                    var12++;
                    if (var19 == 0) {
                        statePc = 34;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_65_0 = var11_int;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (stackIn_65_0 != 0) {
                        statePc = 68;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    var10++;
                    if (var19 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_69_0 = -3;
                    statePc = 69;
                    continue stateLoop;
                }
                case 69: {
                    if (stackIn_69_0 < (sk.field_t ^ -1)) {
                        statePc = 73;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    if (ok.field_Jb[12]) {
                        statePc = 72;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var10 = 2;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if ((var10 ^ -1) > -3) {
                        statePc = 154;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    if (null != t.field_L) {
                        statePc = 79;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (uj.field_k != null) {
                        statePc = 79;
                    } else {
                        statePc = 76;
                    }
                    continue stateLoop;
                }
                case 76: {
                    if (il.field_b != null) {
                        statePc = 79;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (nk.field_r == null) {
                        statePc = 173;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var11_int = 0;
                    var12 = 0;
                    var13_int = 0;
                    var14_int = 0;
                    var15 = 0;
                    var16 = 0;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    if ((var16 ^ -1) <= (qa.field_e ^ -1)) {
                        statePc = 110;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    var17_int = pd.field_Rb.field_sc[var16] & 255;
                    if (var19 != 0) {
                        statePc = 111;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    if (null == t.field_L) {
                        statePc = 87;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    if (t.field_L[var16] == null) {
                        statePc = 87;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    if (t.field_L[var16][var17_int]) {
                        statePc = 86;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 86: {
                    var11_int = 1;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    if (null == uj.field_k) {
                        statePc = 96;
                    } else {
                        statePc = 88;
                    }
                    continue stateLoop;
                }
                case 88: {
                    if (null != uj.field_k[var16]) {
                        statePc = 90;
                    } else {
                        statePc = 96;
                    }
                    continue stateLoop;
                }
                case 90: {
                    var18_int = uj.field_k[var16][var17_int];
                    if ((var18_int ^ -1) < (var13_int ^ -1)) {
                        statePc = 92;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 92: {
                    var13_int = var18_int;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    if (var18_int == 0) {
                        statePc = 96;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (lf.field_U) {
                        statePc = 96;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    var11_int = 1;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    if (il.field_b == null) {
                        statePc = 105;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    if (il.field_b[var16] != null) {
                        statePc = 99;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 99: {
                    var18_int = il.field_b[var16][var17_int];
                    if (var18_int > var14_int) {
                        statePc = 101;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 101: {
                    var14_int = var18_int;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var18_int == 0) {
                        statePc = 105;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    if (lf.field_U) {
                        statePc = 105;
                    } else {
                        statePc = 104;
                    }
                    continue stateLoop;
                }
                case 104: {
                    var11_int = 1;
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if (null == nk.field_r) {
                        statePc = 109;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    if (nk.field_r[var16] != null) {
                        statePc = 108;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 108: {
                    var15 = var15 | nk.field_r[var16][var17_int];
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var16++;
                    if (var19 == 0) {
                        statePc = 80;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var16 = 0;
                    statePc = 111;
                    continue stateLoop;
                }
                case 111: {
                    var17 = se.field_S.field_Kb.field_I;
                    var18_ref = (r) ((Object) var17.g(-18110));
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var18_ref == null) {
                        statePc = 130;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackOut_113_0 = var18_ref.l(1);
                    stackIn_131_0 = stackOut_113_0 ? 1 : 0;
                    stackIn_114_0 = stackOut_113_0;
                    if (var19 != 0) {
                        statePc = 131;
                    } else {
                        statePc = 114;
                    }
                    continue stateLoop;
                }
                case 114: {
                    if (stackIn_114_0) {
                        statePc = 129;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (var11_int == 0) {
                        statePc = 119;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (!var18_ref.field_Hb) {
                        statePc = 118;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 118: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    if (var13_int <= var18_ref.field_Pb) {
                        statePc = 121;
                    } else {
                        statePc = 120;
                    }
                    continue stateLoop;
                }
                case 120: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if ((var18_ref.field_Jb ^ -1) > (var14_int ^ -1)) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    if ((var15 & (var18_ref.field_Wb ^ -1) ^ -1) < -1) {
                        statePc = 126;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 126: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 127;
                    }
                    continue stateLoop;
                }
                case 127: {
                    if (var12 == 0) {
                        statePc = 129;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    var16 = 1;
                    if (var19 == 0) {
                        statePc = 130;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var18_ref = (r) ((Object) var17.a((byte) -107));
                    if (var19 == 0) {
                        statePc = 112;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = -3;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    if (stackIn_131_0 < (sk.field_t ^ -1)) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    if (ok.field_Jb[12]) {
                        statePc = 134;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 134: {
                    var16 = 0;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    if (var16 != 0) {
                        statePc = 147;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    if (var19 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    aa.field_g.field_tb = false;
                    if (aa.field_g.field_Db) {
                        statePc = 139;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 139: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    if (var13_int >= qa.field_e) {
                        statePc = 164;
                    } else {
                        statePc = 141;
                    }
                    continue stateLoop;
                }
                case 141: {
                    stackOut_141_0 = bi.field_d[var13_int];
                    stackIn_165_0 = stackOut_141_0 ? 1 : 0;
                    stackIn_142_0 = stackOut_141_0;
                    if (var19 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    if (!stackIn_142_0) {
                        statePc = 146;
                    } else {
                        statePc = 143;
                    }
                    continue stateLoop;
                }
                case 143: {
                    var22 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                    if (var11 != null) {
                        statePc = 145;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    var11 = var22;
                    if (var19 == 0) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    var12 = 1;
                    var11 = (String) (var11) + ", " + var22;
                    statePc = 146;
                    continue stateLoop;
                }
                case 146: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 140;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    aa.field_g.field_tb = false;
                    if (aa.field_g.field_Db) {
                        statePc = 149;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (-1 != (qa.field_f.field_a.field_Hb ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    field_Mb = gh.field_e;
                    if (var19 == 0) {
                        statePc = 153;
                    } else {
                        statePc = 152;
                    }
                    continue stateLoop;
                }
                case 152: {
                    field_Mb = oc.a(wm.field_j, new String[]{sg.field_b}, (byte) -119);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var19 == 0) {
                        statePc = 173;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    aa.field_g.field_tb = false;
                    if (aa.field_g.field_Db) {
                        statePc = 156;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 156: {
                    var11 = null;
                    var12 = 0;
                    var13_int = 0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    if (var13_int >= qa.field_e) {
                        statePc = 164;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackOut_158_0 = bi.field_d[var13_int];
                    stackIn_165_0 = stackOut_158_0 ? 1 : 0;
                    stackIn_159_0 = stackOut_158_0;
                    if (var19 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 159;
                    }
                    continue stateLoop;
                }
                case 159: {
                    if (!stackIn_159_0) {
                        statePc = 163;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    var23 = "<col=A00000>" + td.field_n[var13_int] + "</col>";
                    if (var11 != null) {
                        statePc = 162;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    var11 = var23;
                    if (var19 == 0) {
                        statePc = 163;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var12 = 1;
                    var11 = (String) (var11) + ", " + var23;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    var13_int++;
                    if (var19 == 0) {
                        statePc = 157;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackIn_165_0 = -1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 == (var10 ^ -1)) {
                        statePc = 169;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var13_ref = jb.field_c;
                    if (var12 != 0) {
                        statePc = 168;
                    } else {
                        statePc = 167;
                    }
                    continue stateLoop;
                }
                case 167: {
                    var14 = oc.a(ld.field_j, new String[]{(String) (var11)}, (byte) -66);
                    if (var19 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    var14 = field_Qb + (String) (var11);
                    statePc = 172;
                    continue stateLoop;
                }
                case 169: {
                    var13_ref = ke.field_c;
                    if (var12 == 0) {
                        statePc = 171;
                    } else {
                        statePc = 170;
                    }
                    continue stateLoop;
                }
                case 170: {
                    var14 = ic.field_d + (String) (var11);
                    if (var19 == 0) {
                        statePc = 172;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var14 = oc.a(qb.field_d, new String[]{(String) (var11)}, (byte) -88);
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    field_Mb = "<col=A00000>" + var13_ref + "<br>" + var14;
                    statePc = 173;
                    continue stateLoop;
                }
                case 173: {
                    if (var19 == 0) {
                        statePc = 175;
                    } else {
                        statePc = 174;
                    }
                    continue stateLoop;
                }
                case 174: {
                    var9_ref_String = pd.field_Rb.field_Gb;
                    sc.field_f.field_db = oc.a(fb.field_D, new String[]{var9_ref_String}, (byte) -88).toUpperCase();
                    tn.field_j.a(0, ri.field_k.field_M, -2147483648, 40, ri.field_k.field_pb + -40);
                    tn.field_j.field_db = oc.a(kb.field_R, new String[]{var9_ref_String}, (byte) -93);
                    var8 = tn.field_j;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    if ((eg.field_e ^ -1L) == -1L) {
                        statePc = 179;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    var9 = (int)(eg.field_e - ud.a(2));
                    var9 = (999 + var9) / 1000;
                    if ((var9 ^ -1) <= -2) {
                        statePc = 178;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var9 = 1;
                    statePc = 178;
                    continue stateLoop;
                }
                case 178: {
                    var8.field_db = oc.a(pa.field_n, new String[]{Integer.toString(var9)}, (byte) -119);
                    statePc = 179;
                    continue stateLoop;
                }
                case 179: {
                    ec.field_j.field_db = oc.a(dk.field_a, new String[]{Integer.toString(pd.field_Rb.field_Xb), Integer.toString(pd.field_Rb.field_hc)}, (byte) -44);
                    statePc = 180;
                    continue stateLoop;
                }
                case 180: {
                    stackIn_184_0 = fm.field_T;
                    stackIn_181_0 = stackIn_184_0;
                    if (!param0) {
                        statePc = 184;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    stackIn_184_0 = (ci) ((Object) stackIn_181_0);
                    stackIn_182_0 = stackIn_184_0;
                    if (param3) {
                        statePc = 184;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    stackIn_184_0 = (ci) ((Object) stackIn_182_0);
                    stackIn_183_0 = stackIn_184_0;
                    if (jh.field_a) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    stackIn_185_0 = (ci) ((Object) stackIn_183_0);
                    stackIn_185_1 = 1;
                    statePc = 185;
                    continue stateLoop;
                }
                case 184: {
                    stackIn_185_0 = (ci) ((Object) stackIn_184_0);
                    stackIn_185_1 = 0;
                    statePc = 185;
                    continue stateLoop;
                }
                case 185: {
                    ((ci) (Object) stackIn_185_0).a(stackIn_185_1 != 0, (byte) 88);
                    stackIn_189_0 = ri.field_k;
                    stackIn_186_0 = stackIn_189_0;
                    if (!param0) {
                        statePc = 189;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    stackIn_189_0 = (ci) ((Object) stackIn_186_0);
                    stackIn_187_0 = stackIn_189_0;
                    if (param3) {
                        statePc = 189;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    stackIn_189_0 = (ci) ((Object) stackIn_187_0);
                    stackIn_188_0 = stackIn_189_0;
                    if (jh.field_a) {
                        statePc = 189;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    stackIn_190_0 = (ci) ((Object) stackIn_188_0);
                    stackIn_190_1 = 1;
                    statePc = 190;
                    continue stateLoop;
                }
                case 189: {
                    stackIn_190_0 = (ci) ((Object) stackIn_189_0);
                    stackIn_190_1 = 0;
                    statePc = 190;
                    continue stateLoop;
                }
                case 190: {
                    ((ci) (Object) stackIn_190_0).a(stackIn_190_1 != 0, (byte) 88);
                    stackIn_194_0 = ah.field_i;
                    stackIn_191_0 = stackIn_194_0;
                    if (!param0) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    stackIn_194_0 = (ci) ((Object) stackIn_191_0);
                    stackIn_192_0 = stackIn_194_0;
                    if (param3) {
                        statePc = 194;
                    } else {
                        statePc = 192;
                    }
                    continue stateLoop;
                }
                case 192: {
                    stackIn_194_0 = (ci) ((Object) stackIn_192_0);
                    stackIn_193_0 = stackIn_194_0;
                    if (!jh.field_a) {
                        statePc = 194;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_195_0 = (ci) ((Object) stackIn_193_0);
                    stackIn_195_1 = 1;
                    statePc = 195;
                    continue stateLoop;
                }
                case 194: {
                    stackIn_195_0 = (ci) ((Object) stackIn_194_0);
                    stackIn_195_1 = 0;
                    statePc = 195;
                    continue stateLoop;
                }
                case 195: {
                    ((ci) (Object) stackIn_195_0).a(stackIn_195_1 != 0, (byte) 88);
                    qa.field_f.field_a.f((byte) 109);
                    var5_int = -71 % ((-3 - param1) / 54);
                    if (null != pd.field_Rb) {
                        statePc = 197;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if (sc.field_d.field_L == 0) {
                        statePc = 199;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    db.a(param4, pd.field_Rb.g((byte) -80), 28113);
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if ((aa.field_g.field_L ^ -1) == -1) {
                        statePc = 201;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    ob.field_w = true;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    if (uj.field_j.field_L == 0) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    jh.field_a = true;
                    statePc = 203;
                    continue stateLoop;
                }
                case 203: {
                    if (hn.field_d.field_L != 0) {
                        statePc = 205;
                    } else {
                        statePc = 206;
                    }
                    continue stateLoop;
                }
                case 205: {
                    jh.field_a = false;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    t.a(pd.field_Rb, false, param4, true);
                    statePc = 209;
                    continue stateLoop;
                }
                case 209: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void k(int param0) {
        field_Qb = null;
        if (param0 != 0) {
            return;
        }
        field_Mb = null;
    }

    static {
        field_Qb = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
