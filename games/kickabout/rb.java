/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb extends hd {
    static int field_yb;
    static int field_Bb;
    private StringBuilder field_Db;
    private hd field_Lb;
    private hd field_Cb;
    static String field_Hb;
    private hd field_Nb;
    private hd[] field_Jb;
    static int field_Kb;
    private om field_zb;
    static String field_Ib;
    long field_Eb;
    private hd field_Ab;
    private hd field_Fb;
    static int field_Mb;
    private int field_Ob;
    private hd field_Gb;

    final static tv a(int param0, int param1, byte param2, int param3) {
        int stackIn_41_0 = 0;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        tv var8_ref_tv;
        int var9;
        tv var9_ref_tv;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        var13 = Kickabout.field_G;
        pw.field_G.field_Ab.field_jb.b(22997);
        var4 = null;
        var5 = 0;
        var6 = 0;
        var7 = vb.field_j - 1;
        L0: while (true) {
          if (var7 < 0) {
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (vb.field_j <= var8) {
                L2: {
                  var8 = var6 + -var7 + pw.field_G.field_Ab.field_L + pw.field_G.field_Ab.field_mb;
                  pw.field_G.field_Ab.field_mb = pw.field_G.field_Ab.field_mb - var8;
                  pw.field_G.field_Ab.field_J = pw.field_G.field_Ab.field_J + var8;
                  if (!wj.field_z) {
                    break L2;
                  } else {
                    pw.field_G.field_Ab.field_mb = var7;
                    break L2;
                  }
                }
                if (param2 == 26) {
                  L3: {
                    pw.field_G.field_Ab.field_L = var7 - pw.field_G.field_Ab.field_mb;
                    if (wj.field_z) {
                      dg.field_a = true;
                      pw.field_G.field_Ab.field_J = -pw.field_G.field_Ab.field_mb + pw.field_G.field_zb.field_mb;
                      wj.field_z = false;
                      pw.field_G.field_Ab.field_v = 0;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (!vg.field_Wb) {
                      break L4;
                    } else {
                      if (mu.field_Y == null) {
                        break L4;
                      } else {
                        dg.field_a = true;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    var9 = -pw.field_G.field_Ab.field_mb + (-pw.field_G.field_Ab.field_L + pw.field_G.field_zb.field_mb);
                    if (!dg.field_a) {
                      break L5;
                    } else {
                      pw.field_G.field_Ab.field_v = var9 - pw.field_G.field_Ab.field_J;
                      break L5;
                    }
                  }
                  L6: {
                    pw.field_G.a(param1, param0 * param1 * 2, true, param2 ^ 26);
                    if (pw.field_G.field_Ab.field_J - -pw.field_G.field_Ab.field_v != var9) {
                      stackIn_41_0 = 0;
                      break L6;
                    } else {
                      stackIn_41_0 = 1;
                      break L6;
                    }
                  }
                  dg.field_a = stackIn_41_0 != 0;
                  return (tv) (var4);
                } else {
                  return (tv) null;
                }
              } else {
                var9_ref_tv = fu.field_b[var8];
                if (null != var9_ref_tv.field_s) {
                  pw.field_G.field_Ab.a((byte) -105, var9_ref_tv.field_s);
                  var9_ref_tv.field_s.a(true, var9_ref_tv.field_s.g((byte) -44), param3, var7, param1);
                  var7 = var7 + param1;
                  if (-1 != (var9_ref_tv.field_s.field_sb ^ -1)) {
                    var4 = var9_ref_tv;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                } else {
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            L7: {
              var8_ref_tv = fu.field_b[var7];
              var9 = 0;
              if (iw.field_l) {
                break L7;
              } else {
                if (var5 < at.field_Hb) {
                  var10_int = r.a(0, var8_ref_tv.field_c);
                  if (var10_int > var8_ref_tv.b(80)) {
                    break L7;
                  } else {
                    L8: {
                      if (var8_ref_tv.field_m) {
                        break L8;
                      } else {
                        if (!hi.a(param2 ^ 26, var8_ref_tv.field_q)) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var9 = 1;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            if (var9 != 0) {
              L9: {
                if (var8_ref_tv.field_s == null) {
                  break L9;
                } else {
                  if (wj.field_z) {
                    break L9;
                  } else {
                    var5++;
                    var7--;
                    continue L0;
                  }
                }
              }
              L10: {
                if (var8_ref_tv.field_s != null) {
                  break L10;
                } else {
                  break L10;
                }
              }
              var10 = ob.a((byte) -92, var8_ref_tv);
              var11 = var10 + hu.c(var8_ref_tv.field_g);
              var12 = qa.a(var8_ref_tv, 31100);
              var8_ref_tv.field_s = new hd(0L, vv.field_o, var11);
              var6 = var6 + param1;
              var8_ref_tv.field_s.field_X = nl.field_i;
              var8_ref_tv.field_s.field_ub = -(8355711 & var12 >> -810913951) + var12 - -(8355711 & vv.field_o.field_ub >> -1039946463);
              var8_ref_tv.field_s.field_ab = var12 - (((16711423 & var12) >> 1187469889) + -((vv.field_o.field_ab & 16711422) >> 966118849));
              var8_ref_tv.field_s.field_y = var12;
              var5++;
              var7--;
              continue L0;
            } else {
              var8_ref_tv.field_s = null;
              var7--;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, String param1) {
        try {
            ek.field_M = param1;
            qd.b(38, 12);
            if (param0 != -51) {
                field_Ib = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rb.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 26) {
            break L0;
          } else {
            this.field_Lb = (hd) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == this.field_zb) {
              break L2;
            } else {
              if (!this.field_zb.field_I) {
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

    public static void c(boolean param0) {
        field_Ib = null;
        field_Hb = null;
        if (!param0) {
            field_Mb = -83;
        }
    }

    final int a(boolean param0, int param1) {
        om stackIn_6_0 = null;
        om stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        hd stackIn_14_0 = null;
        hd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int var3;
        int var4;
        L0: {
          var4 = Kickabout.field_G;
          this.b(param1, param0);
          if (null == this.field_Fb) {
            break L0;
          } else {
            L1: {
              this.field_Fb.field_E = this.field_Db.toString();
              this.field_Fb.field_s = (this.field_q - this.field_Fb.field_X.a(this.field_Fb.field_E)) / 2;
              if (null != this.field_zb) {
                if (0 == this.field_zb.field_sb) {
                  break L1;
                } else {
                  L2: {
                    stackIn_6_0 = this.field_zb;

                    if (this.field_zb.field_I) {
                      stackIn_7_0 = (om) ((Object) stackIn_6_0);
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = (om) ((Object) stackIn_6_0);
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  stackIn_7_0.field_I = stackIn_7_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            this.field_Fb.field_q = -this.field_Fb.field_s + this.field_q;
            var3 = 0;
            L3: while (true) {
              if (var3 >= ob.field_B) {
                break L0;
              } else {
                if (this.field_Jb[var3] != null) {
                  L4: {
                    stackIn_14_0 = this.field_Jb[var3];

                    if (this.field_Db.length() <= 0) {
                      stackIn_15_0 = (hd) ((Object) stackIn_14_0);
                      stackIn_15_1 = 0;
                      break L4;
                    } else {
                      stackIn_15_0 = (hd) ((Object) stackIn_14_0);
                      stackIn_15_1 = 1;
                      break L4;
                    }
                  }
                  stackIn_15_0.field_lb = stackIn_15_1 != 0;
                  if (this.field_Jb[var3].field_lb) {
                    if (0 != this.field_Jb[var3].field_sb) {
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
        if (-1 == (this.field_Ab.field_sb ^ -1)) {
          L5: {
            if (!param0) {
              break L5;
            } else {
              if (0 == wj.field_A) {
                break L5;
              } else {
                if (this.field_sb != 0) {
                  break L5;
                } else {
                  return -1;
                }
              }
            }
          }
          return this.field_Ob;
        } else {
          return -1;
        }
    }

    final String a(int param0) {
        if (param0 != -15596) {
            this.field_Ob = -119;
        }
        return this.field_Db.toString();
    }

    private final int a(int param0, String param1, int param2, hd param3, hd param4, byte param5) {
        hd var7 = null;
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
              var7 = new hd(0L, param3, 0, param0, param2, 24, param1);
              param0 += 32;
              param4.a((byte) -106, var7);
              if (param5 >= 4) {
                break L1;
              } else {
                this.b(-117);
                break L1;
              }
            }
            stackIn_3_0 = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("rb.J(").append(param0).append(',');

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param4 == null) {
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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -46) {
            return true;
        }
        return (param1 ^ -1) == -7 ? true : false;
    }

    rb(int param0, int param1, int param2, int param3, int param4, hd param5, hd param6, hd param7, hd param8, om param9, hd param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$0 = null;
        Object stackIn_6_0;
        om stackIn_6_1;
        om stackIn_6_2;
        long stackIn_6_3;
        om stackIn_6_4;
        Object stackIn_7_0;
        Object stackIn_8_0;
        om stackIn_8_1;
        om stackIn_8_2;
        long stackIn_8_3;
        om stackIn_8_4;
        String stackIn_8_5;
        hd stackIn_14_0 = null;
        hd stackIn_15_0 = null;
        int stackIn_15_1 = 0;
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
        int var15_int = 0;
        hd[] var15 = null;
        RuntimeException var15_ref = null;
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
        hd[] var28 = null;
        this.field_Ob = -2;
        try {
          L0: {
            L1: {
              this.field_Eb = param12;
              this.field_Gb = new hd(0L, param6, fi.field_c.toUpperCase());
              this.field_Gb.field_A = 1;
              this.a((byte) -110, this.field_Gb);
              this.field_Ab = new hd(0L, param7);
              this.field_Gb.a((byte) -116, this.field_Ab);
              this.field_Nb = new hd(0L, (hd) null);
              this.a((byte) -111, this.field_Nb);
              if (param11 == null) {
                this.field_Cb = new hd(0L, param8, sl.field_Bb);
                this.field_Cb.field_y = 11184810;
                this.field_Cb.field_A = 1;
                this.field_Nb.a((byte) -110, this.field_Cb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_Cb.field_X.b(this.field_Cb.field_E, var15_int);
                this.field_Cb.a(true, var15_int, 13, var16, var17 * sh.field_c);
                var16 = var16 + var17 * sh.field_c;
                this.field_Nb.a(true, 13 - -var15_int - -13, 0, 24, var16 + 10);
                this.field_Nb.field_R = fs.a(this.field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 96);
                var18 = var15_int + 13 - -13;
                var19 = var16 + 34;
                var20 = ou.b(var18, param0, param2, 127);
                var21 = nj.a(param1, param3, var19, 29079);
                this.a(true, var18, var20, var21, var19);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_Cb = new hd(0L, param8, cf.field_Ib);
                    this.field_Cb.field_A = 1;
                    this.field_Cb.field_y = 11184810;
                    this.field_Nb.a((byte) -110, this.field_Cb);
                    this.field_Lb = new hd(0L, param8, nc.field_d);
                    this.field_Lb.field_y = 11184810;
                    this.field_Lb.field_A = 1;
                    this.field_Nb.a((byte) -116, this.field_Lb);
                    this.field_Fb = new hd(0L, param8);
                    this.field_Fb.field_y = 16764006;
                    this.field_Nb.a((byte) -105, this.field_Fb);
                    this.field_Fb.field_V = "|";
                    if (bl.field_c >= 5) {
                      break L3;
                    } else {
                      if ((tk.field_Ib ^ -1) > -3) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackIn_6_0 = this;

                      stackIn_6_1 = null;

                      stackIn_6_2 = null;

                      stackIn_6_3 = 0L;

                      stackIn_6_4 = (om) (param9);

                      if (-8 >= (bl.field_c ^ -1)) {
                        break L5;
                      } else {
                        stackIn_7_0 = this;
                        stackIn_6_0 = stackIn_7_0;

                        if (2 > tk.field_Ib) {
                          stackIn_8_0 = this;
                          stackIn_8_1 = null;
                          stackIn_8_2 = null;
                          stackIn_8_3 = stackIn_6_3;
                          stackIn_8_4 = (om) ((Object) stackIn_6_4);
                          stackIn_8_5 = vv.field_s;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = null;
                    stackIn_8_2 = null;
                    stackIn_8_3 = stackIn_6_3;
                    stackIn_8_4 = (om) ((Object) stackIn_6_4);
                    stackIn_8_5 = mc.field_h;
                    break L4;
                  }
                  ((rb) (this)).field_zb = new om(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_Nb.a((byte) -118, (hd) (this.field_zb));
                  break L2;
                }
                var28 = new hd[3];
                var15 = var28;
                var28[0] = new hd(0L, (hd) null);
                this.field_Nb.a((byte) -105, var28[0]);
                var28[1] = new hd(0L, (hd) null);
                this.field_Nb.a((byte) -111, var28[1]);
                var28[2] = new hd(0L, (hd) null);
                this.field_Nb.a((byte) -127, var28[2]);
                this.field_Jb = new hd[ob.field_B];
                var16 = 0;
                L6: while (true) {
                  if (ob.field_B <= var16) {
                    L7: {
                      this.field_Db = new StringBuilder(12);
                      if (null == param11) {
                        break L7;
                      } else {
                        discarded$0 = this.field_Db.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_X.a(ce.field_F);
                      if (var16 >= var17) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_X.a(cj.field_H);
                      if (var17 <= var16) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_X.a(tk.field_Hb);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (var17 >= ob.field_B) {
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
                          var18 = this.a(var18, ce.field_F, var16, param6, var28[0], (byte) 9);
                          var18 = this.a(-6305, this.field_Jb[6], var16, var18, var28[0]);
                          var18 = this.a(-6305, this.field_Jb[9], var16, var18, var28[0]);
                          var18 = this.a(-6305, this.field_Jb[5], var16, var18, var28[0]);
                          var18 = this.a(-6305, this.field_Jb[7], var16, var18, var28[0]);
                          var18 = this.a(-6305, this.field_Jb[15], var16, var18, var28[0]);
                          var18 = this.a(-6305, this.field_Jb[4], var16, var18, var28[0]);
                          if (var17 >= var18) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(var18, cj.field_H, var16, param6, var28[1], (byte) 119);
                          var18 = this.a(-6305, this.field_Jb[16], var16, var18, var28[1]);
                          var18 = this.a(-6305, this.field_Jb[17], var16, var18, var28[1]);
                          var18 = this.a(-6305, this.field_Jb[18], var16, var18, var28[1]);
                          var18 = this.a(-6305, this.field_Jb[19], var16, var18, var28[1]);
                          var18 = this.a(-6305, this.field_Jb[20], var16, var18, var28[1]);
                          if (var17 >= var18) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(var18, tk.field_Hb, var16, param6, var28[2], (byte) 127);
                          var18 = this.a(-6305, this.field_Jb[13], var16, var18, var28[2]);
                          var18 = this.a(-6305, this.field_Jb[21], var16, var18, var28[2]);
                          var18 = this.a(-6305, this.field_Jb[11], var16, var18, var28[2]);
                          if (var18 <= var17) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + var16 * 3;
                          var20 = this.field_Gb.g((byte) 108);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (null == this.field_zb) {
                            break L17;
                          } else {
                            var20 = this.field_zb.b(0, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Gb.a(true, var19 + 13 + 13, 0, 0, 24);
                          this.field_Ab.a(true, 15, -20 + this.field_Gb.field_q, 5, 15);
                          var21 = 10;
                          this.field_Cb.a(true, var19, 13, var21, 2 * sh.field_c);
                          var21 = var21 + sh.field_c * 2;
                          this.field_Lb.a(true, var19, 13, var21, 2 * sh.field_c);
                          var21 = var21 + (10 + 2 * sh.field_c);
                          this.field_Fb.a(true, 0, 0, var21, sh.field_c);
                          var21 = var21 + (10 + sh.field_c);
                          if (null == this.field_zb) {
                            break L18;
                          } else {
                            var20 = this.field_zb.b(0, 4);
                            this.field_zb.a(4, var21, sh.field_c, var20, 13 - -((var19 + -var20) / 2), -10481);
                            var21 = var21 + (10 + sh.field_c);
                            break L18;
                          }
                        }
                        var28[0].a(true, var16, 13, var21, var17);
                        var28[1].a(true, var16, var16 + 13 - -13, var21, var17);
                        var28[2].a(true, var16, 26 + (13 - -(var16 * 2)), var21, var17);
                        var22 = var21;
                        this.field_Nb.a(true, 13 + (13 + var19), 0, 24, 10 + var22 + var17);
                        this.field_Nb.field_R = fs.a(this.field_Nb.field_mb, 3, 2105376, 11579568, 8421504, (byte) 127);
                        var23 = var19 + 13 + 13;
                        var24 = 10 + (var17 + 24) + var22;
                        var25 = ou.b(var23, param0, param2, 127);
                        var26 = nj.a(param1, param3, var24, 29079);
                        this.a(true, var23, var25, var26, var24);
                        break L1;
                      } else {
                        L19: {
                          if (this.field_Jb[var17] == null) {
                            break L19;
                          } else {
                            var18 = this.field_Jb[var17].g((byte) -40);
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
                      if (null == bh.field_i[var16]) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Jb[var16] = new hd(0L, param10, bh.field_i[var16]);
                          this.field_Jb[var16].field_A = 0;
                          stackIn_14_0 = this.field_Jb[var16];

                          if (param11 == null) {
                            stackIn_15_0 = (hd) ((Object) stackIn_14_0);
                            stackIn_15_1 = 0;
                            break L21;
                          } else {
                            stackIn_15_0 = (hd) ((Object) stackIn_14_0);
                            stackIn_15_1 = 1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_lb = stackIn_15_1 != 0;
                        this.field_Nb.a((byte) -124, this.field_Jb[var16]);
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
            var15_ref = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var15_ref);

            stackIn_51_1 = new StringBuilder().append("rb.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_52_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    private final int a(int param0, hd param1, int param2, int param3, hd param4) {
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
              param3 += 8;
              if (param0 == -6305) {
                break L1;
              } else {
                this.field_Db = (StringBuilder) null;
                break L1;
              }
            }
            var6_int = param1.field_X.c(param1.field_E, -(2 * param1.field_kb) + param2, param1.field_xb);
            param1.a(true, param2, 0, param3, var6_int);
            param3 = param3 + (0 + var6_int);
            param4.a((byte) -120, param1);
            stackIn_3_0 = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("rb.F(").append(param0).append(',');

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean h(byte param0) {
        if (1 != (this.field_Ob ^ -1)) {
            return false;
        }
        if (!((cc.field_e ^ -1) != -14)) {
            this.field_Ob = -1;
        }
        if (param0 != 37) {
            this.field_Cb = (hd) null;
            return true;
        }
        return true;
    }

    static {
        field_Bb = 20;
        field_Hb = "Spectate";
        field_Kb = 33;
        field_Ib = "null";
        field_Mb = 4;
    }
}
