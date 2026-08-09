/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends hd {
    private hd field_Hb;
    private hd field_Cb;
    private hd field_yb;
    static int field_Ab;
    private hd field_Gb;
    private hd field_Fb;
    static String field_Eb;
    static int field_Ib;
    private int field_Db;
    static int[][] field_zb;
    private hd field_Bb;

    na(long param0, hd param1, hd param2, hd param3, hd param4) {
        super(param0, (hd) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        hd var9 = null;
        hd var10 = null;
        try {
          L0: {
            this.field_Bb = new hd(0L, param1);
            this.field_Gb = new hd(0L, param2);
            this.a((byte) -107, this.field_Bb);
            this.a((byte) -106, this.field_Gb);
            this.field_Cb = new hd(0L, (hd) null);
            this.a((byte) -127, this.field_Cb);
            this.field_Fb = new hd(0L, param3);
            this.field_yb = new hd(0L, param3);
            var9 = this.field_Fb;
            var10 = var9;
            this.field_yb.field_ob = true;
            var10.field_ob = true;
            this.field_Cb.a((byte) -127, this.field_Fb);
            this.field_Cb.a((byte) -112, this.field_yb);
            this.field_Hb = new hd(0L, param4);
            this.field_Hb.field_Y = true;
            this.field_Cb.a((byte) -127, this.field_Hb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("na.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        if (param0 > 103) {
          L0: {
            var5 = 0;
            var6 = this.field_Cb.field_mb - this.field_Hb.field_mb;
            if ((var6 ^ -1) >= -1) {
              break L0;
            } else {
              var7 = this.field_Hb.field_J;
              var8 = param2 - param3;
              var5 = (var7 * var8 - -(var6 / 2)) / var6;
              break L0;
            }
          }
          L1: {
            if (param1) {
              L2: {
                if (-1 >= (var5 ^ -1)) {
                  break L2;
                } else {
                  var5 = 0;
                  break L2;
                }
              }
              if (var5 > param2 - param3) {
                var5 = param2 + -param3;
                break L1;
              } else {
                break L1;
              }
            } else {
              L3: {
                if (var5 <= param2 - param3) {
                  break L3;
                } else {
                  var5 = -param3 + param2;
                  break L3;
                }
              }
              if ((var5 ^ -1) > -1) {
                var5 = 0;
                break L1;
              } else {
                break L1;
              }
            }
          }
          return var5;
        } else {
          return 2;
        }
    }

    final boolean b(int param0) {
        if (param0 != 23028) {
            this.m(124);
        }
        if (!(0 == this.field_Fb.field_sb)) {
            this.field_Db = 20;
            return true;
        }
        if (0 == this.field_Fb.field_qb) {
            return false;
        }
        if (!(0 >= this.field_Db)) {
            this.field_Db = this.field_Db - 1;
        }
        if (0 == this.field_Db) {
            if (!(n.field_m >= this.field_Hb.field_T - -this.field_Hb.field_v)) {
                this.field_Db = 3;
                return true;
            }
        }
        return false;
    }

    final boolean m(int param0) {
        if (this.field_yb.field_sb != 0) {
            this.field_Db = 20;
            return true;
        }
        if ((this.field_yb.field_qb ^ -1) != param0) {
            if ((this.field_Db ^ -1) < -1) {
                this.field_Db = this.field_Db - 1;
            }
            if (this.field_Db == 0) {
                if (this.field_Hb.field_T + this.field_Hb.field_v - -this.field_Hb.field_mb - -this.field_Hb.field_L > n.field_m) {
                    return false;
                }
                this.field_Db = 3;
                return true;
            }
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_q = param3;
        this.field_J = param6;
        this.field_s = param0;
        if (!param1) {
            return;
        }
        this.field_mb = param2;
        this.a(param4, param5, (byte) 64, param7);
    }

    final static void h(int param0) {
        m.field_m = new hd(0L, (hd) null);
        if (ui.field_t) {
            m.field_m.a((byte) -127, li.field_a);
        }
        m.field_m.a((byte) -114, mc.field_d);
        tn.field_d = new rf(qt.field_z, m.field_m);
        ss.field_c = new hd((long)param0, (hd) null);
        ss.field_c.a((byte) -127, (hd) (tn.field_d.field_b));
        ss.field_c.a((byte) -116, rg.field_a);
        ml.c(false);
    }

    final boolean j(int param0) {
        if (!(-1 == (this.field_Bb.field_sb ^ -1))) {
            this.field_Db = 20;
            return true;
        }
        if (0 != this.field_Bb.field_qb) {
            if (-1 > (this.field_Db ^ -1)) {
                this.field_Db = this.field_Db - 1;
            }
            if (!(this.field_Db != 0)) {
                this.field_Db = 3;
                return true;
            }
        }
        if (param0 != -819561055) {
            field_Eb = (String) null;
            return false;
        }
        return false;
    }

    public static void a(int param0) {
        field_zb = (int[][]) null;
        int var1 = 42 / ((52 - param0) / 62);
        field_Eb = null;
    }

    final boolean h(byte param0) {
        if (this.field_Gb.field_sb != 0) {
            this.field_Db = 20;
            return true;
        }
        if (0 != this.field_Gb.field_qb) {
            if (!(-1 <= (this.field_Db ^ -1))) {
                this.field_Db = this.field_Db - 1;
            }
            if (0 == this.field_Db) {
                this.field_Db = 3;
                return true;
            }
        }
        if (param0 != -40) {
            this.field_Gb = (hd) null;
            return false;
        }
        return false;
    }

    na(long param0, na param1) {
        this(param0, param1.field_Bb, param1.field_Gb, param1.field_Fb, param1.field_Hb);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        hd stackIn_16_0 = null;
        hd stackIn_16_1 = null;
        hd stackIn_16_2 = null;
        hd stackIn_17_0 = null;
        hd stackIn_17_1 = null;
        hd stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        hd var14;
        hd var15;
        hd var16;
        hd var17;
        hd var18;
        hd var19;
        L0: {
          if (2 * this.field_q > this.field_mb) {
            var6 = this.field_mb / 2;
            var5 = this.field_mb / 2;
            break L0;
          } else {
            var6 = this.field_mb - this.field_q;
            var5 = this.field_q;
            break L0;
          }
        }
        L1: {
          var7 = var6 + -var5;
          var8 = var7;
          if (-1 > (param0 ^ -1)) {
            L2: {
              var8 = param1 * var8 / param0;
              if (this.field_q > var8) {
                var8 = this.field_q;
                break L2;
              } else {
                break L2;
              }
            }
            if (var8 <= var7) {
              break L1;
            } else {
              var8 = var7;
              break L1;
            }
          } else {
            break L1;
          }
        }
        L3: {
          var9 = -param1 + param0;
          var10 = -var8 + var7;
          var11 = 0;
          if (-1 <= (var9 ^ -1)) {
            break L3;
          } else {
            var11 = (param3 * var10 + var9 / 2) / var9;
            break L3;
          }
        }
        var12 = var8 / 2 + var11;
        var14 = this.field_Bb;
        var14.field_mb = var5;
        var14.field_s = 0;
        var14.field_q = this.field_q;
        var14.field_J = 0;
        var15 = this.field_Gb;
        var15.field_J = var6;
        var15.field_mb = -var6 + this.field_mb;
        var15.field_s = 0;
        var15.field_q = this.field_q;
        var16 = this.field_Cb;
        var16.field_q = this.field_q;
        var16.field_mb = var7;
        var16.field_J = var5;
        var16.field_s = 0;
        var17 = this.field_Fb;
        var17.field_mb = var12;
        var17.field_q = this.field_q;
        var17.field_J = 0;
        var17.field_s = 0;
        var18 = this.field_yb;
        var18.field_J = var12;
        var18.field_mb = -var12 + var7;
        var18.field_s = 0;
        if (param2 > 33) {
          L4: {
            var18.field_q = this.field_q;
            var19 = this.field_Hb;
            var19.field_s = 0;
            var19.field_J = var11;
            var19.field_mb = var8;
            stackIn_16_0 = this.field_Bb;

            stackIn_16_1 = this.field_Gb;

            stackIn_16_2 = this.field_Cb;

            if (param1 >= param0) {
              stackIn_17_0 = (hd) ((Object) stackIn_16_0);
              stackIn_17_1 = (hd) ((Object) stackIn_16_1);
              stackIn_17_2 = (hd) ((Object) stackIn_16_2);
              stackIn_17_3 = 0;
              break L4;
            } else {
              stackIn_17_0 = (hd) ((Object) stackIn_16_0);
              stackIn_17_1 = (hd) ((Object) stackIn_16_1);
              stackIn_17_2 = (hd) ((Object) stackIn_16_2);
              stackIn_17_3 = 1;
              break L4;
            }
          }
          stackIn_17_2.field_lb = stackIn_17_3 != 0;
          stackIn_17_1.field_lb = stackIn_17_3 != 0;
          stackIn_17_0.field_lb = stackIn_17_3 != 0;
          var19.field_q = this.field_q;
          return;
        } else {
          return;
        }
    }

    final static void k(int param0) {
        int stackIn_11_0 = 0;
        dg stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var1_int = -nb.field_k + so.field_e;
            nb.field_k = qg.field_k + -(var1_int >> 572159937);
            so.field_e = nb.field_k - -var1_int;
            hm.field_I = -(fr.field_G >> 905985825) + eh.field_e;
            var2 = hm.field_I;
            var3 = param0;
            L1: while (true) {
              if (j.field_a.length <= var3) {
                break L0;
              } else {
                L2: {
                  var4 = wj.field_x[var3];
                  if (0 > var4) {
                    var5 = du.field_a;
                    break L2;
                  } else {
                    if (re.field_c.field_e == var4) {
                      var5 = gt.field_w;
                      break L2;
                    } else {
                      var5 = ju.field_U;
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = j.field_a[var3];
                  if ((var4 ^ -1) > -1) {
                    stackIn_11_0 = 0;
                    break L3;
                  } else {
                    stackIn_11_0 = 1;
                    break L3;
                  }
                }
                L4: {
                  var7 = ec.a(stackIn_11_0 != 0, var6, -23044);
                  var8 = qg.field_k + -(var7 >> 1534179681);
                  if (var4 < 0) {
                    break L4;
                  } else {
                    L5: {
                      if (re.field_c.field_e != var4) {
                        stackIn_15_0 = ta.field_B;
                        break L5;
                      } else {
                        stackIn_15_0 = oh.field_d;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_15_0;
                      var2 = var2 + of.field_a;
                      if (var9 != null) {
                        var9.a(var8 + -vg.field_zb, tk.field_zb - -(pb.field_H << -21119999), var2, (vg.field_zb << 602982305) + var7, 3);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + pb.field_H;
                    break L4;
                  }
                }
                L7: {
                  if (-1 < (var4 ^ -1)) {
                    sn.field_i.a(var6, var8, var2 - -bs.field_f, var5, -1);
                    var2 = var2 + qp.field_H;
                    break L7;
                  } else {
                    sn.field_a.a(var6, var8, var2 + ag.field_g, var5, -1);
                    var2 = var2 + (pb.field_H + of.field_a + tk.field_zb);
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "na.B(" + param0 + ')');
        }
    }

    final boolean l(int param0) {
        if (param0 >= -30) {
            this.field_yb = (hd) null;
        }
        return 0 != this.field_Hb.field_qb ? true : false;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Kickabout.field_G;
        try {
          L0: {
            if (param6 >= param5) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param6 + param4 < param2) {
                L1: {
                  if (5 + param6 >= param2) {
                    break L1;
                  } else {
                    if (param3 != param0) {
                      var7_int = (1 & (param3 & param0)) + (param0 >> 416072801) + (param3 >> -819561055);
                      var8 = param6;
                      var9 = param0;
                      var10 = param3;
                      var11 = param6;
                      L2: while (true) {
                        if (var11 >= param2) {
                          na.a(param0, param1, var8, var9, 1, param5, param6);
                          na.a(var10, param1, param2, param3, 1, param5, var8);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = pf.field_d[var11];
                            if (param1) {
                              stackIn_24_0 = bl.field_m[var12];
                              break L3;
                            } else {
                              stackIn_24_0 = w.field_a[var12];
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var13 <= var7_int) {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                var11++;
                                continue L2;
                              }
                            } else {
                              pf.field_d[var11] = pf.field_d[var8];
                              incrementValue$0 = var8;
                              var8++;
                              pf.field_d[incrementValue$0] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param2;
                L5: while (true) {
                  if (var7_int <= param6) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param6;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = pf.field_d[var8];
                          var10 = pf.field_d[1 + var8];
                          if (gn.a((byte) 8, param1, var9, var10)) {
                            pf.field_d[var8] = var10;
                            pf.field_d[var8 - -1] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "na.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void i(int param0) {
        he stackIn_91_0 = null;
        he stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_140_0 = 0;
        he stackIn_147_0 = null;
        he stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ml var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3 = 0L;
        int var3_int = 0;
        he var3_ref_he = null;
        int var4 = 0;
        qb var4_ref_qb = null;
        int var5 = 0;
        String var6 = null;
        qb var6_ref = null;
        he var7 = null;
        he var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        he var12 = null;
        qb var13 = null;
        he var15 = null;
        Object var16 = null;
        Object var17 = null;
        qb var17_ref = null;
        he var18 = null;
        he var19 = null;
        String var20 = null;
        String var21 = null;
        he var22 = null;
        Object var23 = null;
        qb var23_ref = null;
        qb var24 = null;
        Object var25 = null;
        he var26 = null;
        String var27 = null;
        String var28 = null;
        he var29 = null;
        qb var30 = null;
        qb var31 = null;
        var16 = null;
        var23 = null;
        var17 = null;
        var25 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1 = un.field_e;
              var2 = ((iw) ((Object) var1)).h((byte) -118);
              if (param0 == 14) {
                break L1;
              } else {
                field_zb = (int[][]) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (-1 == (var2 ^ -1)) {
                    break L4;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      break L4;
                    } else {
                      if (2 == var2) {
                        break L4;
                      } else {
                        if ((var2 ^ -1) == -4) {
                          break L4;
                        } else {
                          if (4 != var2) {
                            if (var2 == 5) {
                              L5: {
                                var3 = ((iw) ((Object) var1)).i((byte) -124);
                                var27 = ((iw) ((Object) var1)).a(62);
                                var6 = ((iw) ((Object) var1)).a(param0 + 64);
                                var28 = ((iw) ((Object) var1)).a(-101);
                                var29 = lo.a(var3, false);
                                var8 = var29;
                                if (var6.equals("")) {
                                  stackIn_140_0 = 0;
                                  break L5;
                                } else {
                                  stackIn_140_0 = 1;
                                  break L5;
                                }
                              }
                              L6: {
                                var9 = stackIn_140_0;
                                if (var29 != null) {
                                  if (var9 != 0) {
                                    var29.a((byte) -2, var28, var27);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  var8 = new he(var27, var28, var3);
                                  pq.field_N.a(var8, (byte) -4, var3);
                                  break L6;
                                }
                              }
                              L7: {
                                var8.field_Ib = nj.a(-93) + -(long)((iw) ((Object) var1)).k(4);
                                var8.field_Qb = ((iw) ((Object) var1)).a((byte) 81);
                                var10 = ((iw) ((Object) var1)).l(127);
                                var8.field_Db = var10 >> 19134209;
                                stackIn_147_0 = (he) (var8);

                                if ((1 & var10) == 0) {
                                  stackIn_148_0 = (he) ((Object) stackIn_147_0);
                                  stackIn_148_1 = 0;
                                  break L7;
                                } else {
                                  stackIn_148_0 = (he) ((Object) stackIn_147_0);
                                  stackIn_148_1 = 1;
                                  break L7;
                                }
                              }
                              stackIn_148_0.field_Cb = stackIn_148_1 != 0;
                              var8.field_Sb = ((iw) ((Object) var1)).h((byte) -105);
                              var8.field_Pb = ((iw) ((Object) var1)).h((byte) -110);
                              iw.a((byte) 84, var8);
                              break L3;
                            } else {
                              if ((var2 ^ -1) == -7) {
                                L8: {
                                  var3 = ((iw) ((Object) var1)).i((byte) -124);
                                  var5 = ((iw) ((Object) var1)).h((byte) -121);
                                  var26 = lo.a(var3, false);
                                  if (var26 == null) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (!var26.field_Fb) {
                                        break L9;
                                      } else {
                                        fh.field_b = fh.field_b - 1;
                                        var26.field_Fb = false;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var5 != 0) {
                                        var26.field_Jb = mg.field_c;
                                        var26.field_Mb = var5;
                                        break L10;
                                      } else {
                                        var26.c((byte) -109);
                                        break L10;
                                      }
                                    }
                                    var26.f(param0 ^ -71);
                                    break L8;
                                  }
                                }
                                break L2;
                              } else {
                                if (7 != var2) {
                                  if (var2 != 8) {
                                    if (-10 == (var2 ^ -1)) {
                                      L11: {
                                        var3_int = ((iw) ((Object) var1)).a((byte) 81);
                                        var4 = ((iw) ((Object) var1)).h((byte) -108);
                                        var31 = (qb) ((Object) sr.field_f.a(-3611, (long)var3_int));
                                        if (var31 == null) {
                                          break L11;
                                        } else {
                                          L12: {
                                            if (-1 != (var4 ^ -1)) {
                                              var31.field_Ab = var4;
                                              var31.field_Db = mg.field_c;
                                              break L12;
                                            } else {
                                              var31.c((byte) -109);
                                              break L12;
                                            }
                                          }
                                          var31.f(-95);
                                          break L11;
                                        }
                                      }
                                      break L2;
                                    } else {
                                      if (10 != var2) {
                                        L13: {
                                          if (11 == var2) {
                                            break L13;
                                          } else {
                                            if (-13 == (var2 ^ -1)) {
                                              break L13;
                                            } else {
                                              if (var2 == 13) {
                                                var3_int = ((iw) ((Object) var1)).a((byte) 81);
                                                var4 = ((iw) ((Object) var1)).h((byte) -110);
                                                var23_ref = (qb) ((Object) sr.field_f.a(-3611, (long)var3_int));
                                                if (var23_ref != null) {
                                                  L14: {
                                                    var23_ref.field_Tb = false;
                                                    var13 = var23_ref;
                                                    var6_ref = var13;
                                                    if (var4 != 0) {
                                                      var23_ref.field_Ab = var4;
                                                      var23_ref.field_Db = mg.field_c;
                                                      break L14;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                  var13.field_hc = false;
                                                  ve.a(var23_ref, (byte) -119);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                L15: {
                                                  if (var2 == 14) {
                                                    break L15;
                                                  } else {
                                                    if ((var2 ^ -1) != -17) {
                                                      L16: {
                                                        if (-16 == (var2 ^ -1)) {
                                                          break L16;
                                                        } else {
                                                          if (-18 != (var2 ^ -1)) {
                                                            if (-19 != (var2 ^ -1)) {
                                                              if (-20 != (var2 ^ -1)) {
                                                                if (-21 == (var2 ^ -1)) {
                                                                  ra.a(false, param0 ^ 116, var1, uv.field_i);
                                                                  break L2;
                                                                } else {
                                                                  if (21 != var2) {
                                                                    if (-23 == (var2 ^ -1)) {
                                                                      mi.field_d = ((iw) ((Object) var1)).a((byte) 81);
                                                                      da.field_o = ((iw) ((Object) var1)).l(121);
                                                                      break L2;
                                                                    } else {
                                                                      if (23 == var2) {
                                                                        dd.field_c = ((iw) ((Object) var1)).i((byte) -124);
                                                                        break L2;
                                                                      } else {
                                                                        bd.a("L1: " + tr.b(0), (Throwable) null, param0 ^ 15);
                                                                        lr.b((byte) -116);
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3_int = ((iw) ((Object) var1)).a((byte) 81);
                                                                    if (-1 == (var3_int ^ -1)) {
                                                                      vg.field_Ib = 0L;
                                                                      break L2;
                                                                    } else {
                                                                      vg.field_Ib = (long)var3_int + nj.a(36);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var3 = ((iw) ((Object) var1)).i((byte) -124);
                                                                var5 = ((iw) ((Object) var1)).h((byte) -126);
                                                                var22 = nk.a(31253, var3);
                                                                if (var22 != null) {
                                                                  L17: {
                                                                    if (-1 != (var5 ^ -1)) {
                                                                      var22.field_Mb = var5;
                                                                      var22.field_Jb = mg.field_c;
                                                                      break L17;
                                                                    } else {
                                                                      var22.c((byte) -109);
                                                                      break L17;
                                                                    }
                                                                  }
                                                                  var22.f(-111);
                                                                  uv.field_i.field_gc = uv.field_i.field_gc - 1;
                                                                  break L2;
                                                                } else {
                                                                  break L2;
                                                                }
                                                              }
                                                            } else {
                                                              L18: {
                                                                var3 = ((iw) ((Object) var1)).i((byte) -124);
                                                                var20 = ((iw) ((Object) var1)).a(-128);
                                                                var21 = ((iw) ((Object) var1)).a(-114);
                                                                var7 = nk.a(31253, var3);
                                                                if (var7 != null) {
                                                                  break L18;
                                                                } else {
                                                                  var7 = new he(var20, var21, var3);
                                                                  pu.field_Eb.a(var7, (byte) -4, var3);
                                                                  uv.field_i.field_gc = uv.field_i.field_gc + 1;
                                                                  break L18;
                                                                }
                                                              }
                                                              L19: {
                                                                var7.field_Qb = ((iw) ((Object) var1)).a((byte) 81);
                                                                var8_int = ((iw) ((Object) var1)).l(param0 ^ 120);
                                                                stackIn_91_0 = (he) (var7);

                                                                if (-1 == (1 & var8_int ^ -1)) {
                                                                  stackIn_92_0 = (he) ((Object) stackIn_91_0);
                                                                  stackIn_92_1 = 0;
                                                                  break L19;
                                                                } else {
                                                                  stackIn_92_0 = (he) ((Object) stackIn_91_0);
                                                                  stackIn_92_1 = 1;
                                                                  break L19;
                                                                }
                                                              }
                                                              stackIn_92_0.field_Cb = stackIn_92_1 != 0;
                                                              var7.field_Db = var8_int >> 830957377;
                                                              var7.field_Sb = ((iw) ((Object) var1)).h((byte) -113);
                                                              var7.field_Pb = ((iw) ((Object) var1)).h((byte) -119);
                                                              lw.field_d.a(var7, 3);
                                                              break L2;
                                                            }
                                                          } else {
                                                            break L16;
                                                          }
                                                        }
                                                      }
                                                      L20: {
                                                        var3 = ((iw) ((Object) var1)).i((byte) -124);
                                                        var5 = ((iw) ((Object) var1)).h((byte) -123);
                                                        var12 = lo.a(var3, false);
                                                        var19 = var12;
                                                        if (var12 == null) {
                                                          break L20;
                                                        } else {
                                                          L21: {
                                                            if (var5 == 0) {
                                                              break L21;
                                                            } else {
                                                              var12.field_Mb = var5;
                                                              var12.field_Jb = mg.field_c;
                                                              break L21;
                                                            }
                                                          }
                                                          L22: {
                                                            if (-16 != (var2 ^ -1)) {
                                                              if (!var19.field_Fb) {
                                                                break L22;
                                                              } else {
                                                                var19.field_Fb = false;
                                                                fh.field_b = fh.field_b - 1;
                                                                break L22;
                                                              }
                                                            } else {
                                                              var12.field_Gb = false;
                                                              break L22;
                                                            }
                                                          }
                                                          iw.a((byte) 56, var19);
                                                          break L20;
                                                        }
                                                      }
                                                      break L2;
                                                    } else {
                                                      break L15;
                                                    }
                                                  }
                                                }
                                                L23: {
                                                  var3 = ((iw) ((Object) var1)).i((byte) -124);
                                                  var18 = lo.a(var3, false);
                                                  if (var18 == null) {
                                                    break L23;
                                                  } else {
                                                    L24: {
                                                      if (14 != var2) {
                                                        if (!var18.field_Fb) {
                                                          var18.field_Fb = true;
                                                          fh.field_b = fh.field_b + 1;
                                                          break L24;
                                                        } else {
                                                          break L24;
                                                        }
                                                      } else {
                                                        var18.field_Gb = true;
                                                        break L24;
                                                      }
                                                    }
                                                    iw.a((byte) 72, var18);
                                                    break L23;
                                                  }
                                                }
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                        var3_int = ((iw) ((Object) var1)).a((byte) 81);
                                        var17_ref = (qb) ((Object) sr.field_f.a(-3611, (long)var3_int));
                                        var24 = var17_ref;
                                        if (var24 != null) {
                                          L25: {
                                            if (-12 == (var2 ^ -1)) {
                                              var24.field_hc = true;
                                              break L25;
                                            } else {
                                              var24.field_Tb = true;
                                              break L25;
                                            }
                                          }
                                          ve.a(var24, (byte) -119);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      } else {
                                        var30 = (qb) ((Object) kq.field_yb.g(24009));
                                        L26: while (true) {
                                          if (var30 == null) {
                                            break L3;
                                          } else {
                                            var30.c((byte) -109);
                                            var30.f(-98);
                                            var30 = (qb) ((Object) kq.field_yb.c(33));
                                            continue L26;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L27: {
                                      var3_int = ((iw) ((Object) var1)).a((byte) 81);
                                      var4_ref_qb = (qb) ((Object) sr.field_f.a(-3611, (long)var3_int));
                                      if (var4_ref_qb == null) {
                                        var4_ref_qb = new qb(ss.field_j);
                                        sr.field_f.a(var4_ref_qb, (byte) -4, (long)var3_int);
                                        break L27;
                                      } else {
                                        break L27;
                                      }
                                    }
                                    ra.a(true, 116, var1, var4_ref_qb);
                                    ve.a(var4_ref_qb, (byte) -119);
                                    break L2;
                                  }
                                } else {
                                  var15 = (he) ((Object) rp.field_B.g(24009));
                                  L28: while (true) {
                                    if (var15 == null) {
                                      fh.field_b = 0;
                                      break L2;
                                    } else {
                                      var15.c((byte) -109);
                                      var15.f(-5);
                                      var15 = (he) ((Object) rp.field_B.c(33));
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_he = (he) ((Object) lw.field_d.g(24009));
                L29: while (true) {
                  if (var3_ref_he == null) {
                    var3_ref_he = (he) ((Object) pq.field_N.b((byte) 72));
                    L30: while (true) {
                      if (var3_ref_he == null) {
                        L31: {
                          if ((var2 ^ -1) != -2) {
                            break L31;
                          } else {
                            if (null != uv.field_i) {
                              h.field_f = uv.field_i.field_ec;
                              break L31;
                            } else {
                              break L31;
                            }
                          }
                        }
                        L32: {
                          if ((var2 ^ -1) != -5) {
                            uv.field_i = null;
                            break L32;
                          } else {
                            var3_int = ((iw) ((Object) var1)).a((byte) 81);
                            uv.field_i = new qb(ss.field_j);
                            uv.field_i.a((long)var3_int, (byte) -113);
                            ra.a(false, 114, var1, uv.field_i);
                            vg.field_Ib = 0L;
                            break L32;
                          }
                        }
                        L33: {
                          L34: {
                            if (var2 == 2) {
                              break L34;
                            } else {
                              if (-4 != (var2 ^ -1)) {
                                ow.field_b = null;
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          if (null != ow.field_b) {
                            break L33;
                          } else {
                            ow.field_b = new qb(ss.field_j);
                            break L33;
                          }
                        }
                        if (-4 != (var2 ^ -1)) {
                          hw.field_k = false;
                          break L2;
                        } else {
                          hw.field_k = true;
                          var3_int = 0;
                          L35: while (true) {
                            if (er.field_h.length <= var3_int) {
                              lk.field_l = ((iw) ((Object) var1)).h((byte) -110);
                              ru.field_C = ((iw) ((Object) var1)).h((byte) -105);
                              var3_int = 0;
                              L36: while (true) {
                                if (rf.field_d.length <= var3_int) {
                                  break L3;
                                } else {
                                  rf.field_d[var3_int] = ((iw) ((Object) var1)).j((byte) -81);
                                  var3_int++;
                                  continue L36;
                                }
                              }
                            } else {
                              er.field_h[var3_int] = ((iw) ((Object) var1)).j((byte) -82);
                              var3_int++;
                              continue L35;
                            }
                          }
                        }
                      } else {
                        L37: {
                          L38: {
                            if (var3_ref_he.field_Gb) {
                              break L38;
                            } else {
                              if (!var3_ref_he.field_Fb) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          L39: {
                            if (var3_ref_he.field_Fb) {
                              fh.field_b = fh.field_b - 1;
                              var3_ref_he.field_Fb = false;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          var3_ref_he.field_Gb = false;
                          iw.a((byte) 81, var3_ref_he);
                          break L37;
                        }
                        var3_ref_he = (he) ((Object) pq.field_N.a(param0 + -14));
                        continue L30;
                      }
                    }
                  } else {
                    var3_ref_he.c((byte) -109);
                    var3_ref_he.f(9);
                    var3_ref_he = (he) ((Object) lw.field_d.c(33));
                    continue L29;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref), "na.E(" + param0 + ')');
        }
    }

    static {
        field_Eb = "Player is not involved in an auction.";
        field_Ab = 480;
        field_zb = new int[][]{new int[]{0, 31, 34, 34, 91, 93, 93, 99, 99, 99, 100}, new int[]{0, 19, 19, 19, 90, 90, 90, 95, 95, 99, 100}, new int[]{0, 10, 10, 10, 70, 73, 76, 79, 98, 99, 100}, new int[]{0, 7, 8, 29, 66, 69, 74, 76, 99, 99, 100}};
    }
}
