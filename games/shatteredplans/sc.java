/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ka {
    private ln field_r;
    static String field_p;
    private ln[] field_t;
    static boolean field_q;
    private int field_s;

    final int a(int param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_r &&
            this.field_r.field_y == param2) {
            stackIn_4_0 = 4;
            return stackIn_4_0;
          }
          if (param1 != 0) {
            field_q = true;
          }
          stackIn_8_0 = super.a(param0, param1 + 0, param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("sc.UA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        int incrementValue$0 = 0;
        int var2;
        ln[] var3;
        int var4;
        int var6;
        ln[] var7;
        ln var9;
        ln var8;
        ln var10;
        int var4Lifetime1;
        ln[] var3Lifetime1;
        int var2Lifetime1;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var7 = this.field_g.field_g.field_e;
        var3 = var7;
        for (var4 = 0; var4 < var7.length; var4++) {
          var9 = var7[var4];
          if (var9.field_L >= 1 &&
            this.field_n != var9.field_y) {
            var2++;
          }
        }
        this.field_t = new ln[var2];
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_g.field_g.field_e;
        for (var4Lifetime1 = 0; var3Lifetime1.length > var4Lifetime1; var4Lifetime1++) {
          var8 = var3Lifetime1[var4Lifetime1];
          var10 = var8;
          if (var10.field_L >= 1 &&
            var10.field_y != this.field_n) {
            incrementValue$0 = var2Lifetime1;
            var2Lifetime1++;
            this.field_t[incrementValue$0] = var8;
          }
        }
        super.a(param0);
    }

    final int b(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        fb var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 41) {
            var5 = (fb) null;
            sc.a(-12, false, (fb) null, -124);
          }
          if (param0.field_R != null) {
            stackIn_5_0 = param0.field_R.field_r;
          } else {
            stackIn_5_0 = 0;
          }
          var3_int = stackIn_5_0;
          var4 = this.a(-5, param0) + 2 * (param0.field_x + var3_int);
          stackIn_8_0 = (var4 != 0) ? var4 : 1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("sc.D(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final int c(ln param0, int param1) {
        int var7 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
        ln var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3_int = super.c(param0, param1);
          var4 = param0.field_p;
          var5 = 2147483647;
          var6 = this.field_t;
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            var9 = this.field_g.field_g.field_c[var4][var8.field_p];
            if (var5 > var9) {
              var5 = var9;
            }
          }
          if (this.field_s > var5) {
            var3_int += 1000;
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sc.NA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_p = null;
        if (param0 != 97) {
          sc.f((byte) -65);
        }
    }

    final static void a(int param0, boolean param1, fb param2, int param3) {
        sg dupTemp$0 = null;
        int var18_int = 0;
        int var25 = 0;
        sg dupTemp$1 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        sg stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        sg stackIn_30_0 = null;
        boolean stackIn_31_1 = false;
        int stackIn_44_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_60_0 = 0;
        sg stackIn_70_0 = null;
        boolean stackIn_71_1 = false;
        sg stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        boolean stackIn_78_1 = false;
        sg stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        sg stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        boolean stackIn_98_1 = false;
        sg stackIn_103_0 = null;
        boolean stackIn_103_1 = false;
        boolean stackIn_104_2 = false;
        sg stackIn_108_0 = null;
        boolean stackIn_109_1 = false;
        int stackIn_113_0 = 0;
        sg stackIn_126_0 = null;
        boolean stackIn_127_1 = false;
        sg stackIn_131_0 = null;
        boolean stackIn_132_1 = false;
        sg stackIn_135_0 = null;
        boolean stackIn_136_1 = false;
        sg stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        String stackIn_156_0 = null;
        sg stackIn_160_0 = null;
        boolean stackIn_161_1 = false;
        sg stackIn_163_0 = null;
        boolean stackIn_164_1 = false;
        int stackIn_170_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_229_0 = 0;
        sg stackIn_330_0 = null;
        boolean stackIn_331_1 = false;
        sg stackIn_337_0 = null;
        boolean stackIn_337_1 = false;
        boolean stackIn_338_2 = false;
        sg stackIn_340_0 = null;
        byte stackIn_340_1 = 0;
        int stackIn_340_2 = 0;
        int stackIn_340_3 = 0;
        boolean stackIn_343_1 = false;
        sg stackIn_347_0 = null;
        boolean stackIn_348_1 = false;
        RuntimeException stackIn_357_0 = null;
        StringBuilder stackIn_357_1 = null;
        String stackIn_358_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        String var9 = null;
        sg[] var9_array = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        sg var18 = null;
        int var19 = 0;
        Object var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        Object var23 = null;
        int var23_int = 0;
        int var24 = 0;
        Object var26 = null;
        String var26_ref = null;
        int var27 = 0;
        int var28 = 0;
        sg var29 = null;
        sg var30 = null;
        sg[] var31 = null;
        String var32 = null;
        String var33 = null;
        sg dupTemp$1Lifetime1;
        sg stackIn_103_0Lifetime1;
        Object var26Lifetime1;
        String var26_refLifetime1;
        sg dupTemp$1Lifetime2;
        Object var26Lifetime1Lifetime1;
        boolean stackIn_103_1Lifetime1;
        boolean stackIn_104_2Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var9_intLifetime1;
        int var17Lifetime1;
        int var19Lifetime1;
        boolean stackIn_104_2Lifetime2;
        int var17Lifetime2;
        var27 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!param1) {
            if (ip.a((byte) -92)) {
              stackIn_12_0 = (!param2.field_Ab) ? 1 : 0;
            } else {
              stackIn_12_0 = 0;
            }
            var4_int = stackIn_12_0;
          } else {
            stackIn_5_0 = (k.field_i) ? 0 : 1;
            var4_int = stackIn_5_0;
          }
          var5 = -12 / ((param0 + 47) / 49);
          var6 = 0;
          if (!param1) {
            for (var7 = 0; var7 < 5; var7++) {
              if (var4_int != 0 &&
                fk.field_p[0][1 + var7].field_rb != 0 &&
                param2.field_nc != var7) {
                param2.field_nc = var7;
                var6 = 1;
              }
              stackIn_23_0 = fk.field_p[0][1 + var7];
              stackIn_24_1 = (var4_int != 0);
              stackIn_23_0.field_s = stackIn_24_1;
              if (!ns.field_pb &&
                var7 == 3) {
                fk.field_p[0][var7 + 1].field_s = false;
              }
              stackIn_30_0 = fk.field_p[0][1 + var7];
              stackIn_31_1 = (param2.field_nc == var7);
              stackIn_30_0.field_bb = stackIn_31_1;
            }
            if (fk.field_p[0][2].field_v) {
              if (!ip.a((byte) -126)) {
                dn.field_k = re.a(ef.field_b, 4371, new String[]{np.field_a.field_Xb});
              } else {
                dn.field_k = po.field_c;
              }
            }
          }
          if (nl.field_a.length >= 2) {
            if (param1) {
              stackIn_44_0 = (ih.field_d != -1) ? 1 : 0;
            } else {
              stackIn_44_0 = 0;
            }
            var7Lifetime1 = stackIn_44_0;
            if (var7Lifetime1 != 0) {
              var8 = ih.field_d;
              for (var9_int = 0; var9_int < id.field_c.length; var9_int++) {
                id.field_c[var9_int] = (byte) 0;
              }
              id.field_c[var8 / 8] = (byte)ee.a((int) id.field_c[var8 / 8], 1 << var8 % 8);
            }
            stackIn_52_0 = (param1) ? -1 : 0;
            for (var8 = stackIn_52_0; var8 < nl.field_a.length; var8++) {
              if (var7Lifetime1 != 0) {
                stackIn_60_0 = (var8 != ih.field_d) ? 1 : 0;
              } else {
                stackIn_60_0 = 0;
              }
              L16: {
                boolean decompiledFrameCompleted0 = true;
                var9_intLifetime1 = stackIn_60_0;
                if (var4_int != 0 &&
                  0 != fk.field_p[1][1 + var8].field_rb) {
                  if (param1) {
                    if (var7Lifetime1 != 0) {
                      if (!param1) {
                        var10 = nl.field_a[var8];
                        stackIn_70_0 = fk.field_p[1][var8 + 1];
                        stackIn_71_1 = (var10 == param2.field_Eb);
                        stackIn_70_0.field_bb = stackIn_71_1;
                        break L16;
                      }
                      if (-1 != var8) {
                        stackIn_75_0 = fk.field_p[1][var8 + 1];
                        stackIn_75_1 = -1;
                        stackIn_75_2 = ~(id.field_c[var8 / 8] & 1 << (var8 & 7));
                        stackIn_78_1 = (stackIn_75_1 != stackIn_75_2);
                        stackIn_75_0.field_bb = stackIn_78_1;
                        break L16;
                      }
                      fk.field_p[1][1 + var8].field_bb = true;
                      var10 = 0;
                      if (var10 >= nl.field_a.length) {
                        break L16;
                      }
                      dupTemp$0 = fk.field_p[1][1 + var8];
                      stackIn_103_0 = dupTemp$0;
                      stackIn_103_1 = dupTemp$0.field_bb;
                      if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) != 0) {
                        while (true) {
                          stackIn_104_2 = false;
                          while (true) {
                            stackIn_103_0.field_bb = stackIn_103_1 & stackIn_104_2;
                            var10++;
                            if (var10 >= nl.field_a.length) {
                              break L16;
                            }
                            dupTemp$1 = fk.field_p[1][1 + var8];
                            stackIn_103_0 = dupTemp$1;
                            stackIn_103_1 = dupTemp$1.field_bb;
                            if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) != 0) {
                              break;
                            }
                            stackIn_104_2 = true;
                          }
                        }
                      }
                      stackIn_104_2Lifetime2 = true;
                      while (true) {
                        stackIn_103_0.field_bb = stackIn_103_1 & stackIn_104_2Lifetime2;
                        var10++;
                        if (var10 >= nl.field_a.length) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        dupTemp$1Lifetime2 = fk.field_p[1][1 + var8];
                        stackIn_103_0 = dupTemp$1Lifetime2;
                        stackIn_103_1 = dupTemp$1Lifetime2.field_bb;
                        if ((id.field_c[var10 / 8] & 1 << (var10 & 7)) != 0) {
                          stackIn_104_2Lifetime2 = false;
                          continue;
                        }
                        stackIn_104_2Lifetime2 = true;
                      }
                    }
                    if (decompiledFrameCompleted0) {
                      if (var8 == -1) {
                        for (var10 = 0; id.field_c.length > var10; var10++) {
                          id.field_c[var10] = (byte) 0;
                        }
                      } else {
                        id.field_c[var8 / 8] = (byte)nc.a((int) id.field_c[var8 / 8], 1 << we.a(7, var8));
                      }
                    }
                  } else {
                    var10 = nl.field_a[var8];
                    if (var10 != param2.field_Eb) {
                      var6 = 1;
                      param2.field_Eb = var10;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  if (param1) {
                    if (-1 == var8) {
                      fk.field_p[1][1 + var8].field_bb = true;
                      for (var10 = 0; var10 < nl.field_a.length; var10++) {
                        dupTemp$1Lifetime1 = fk.field_p[1][1 + var8];
                        stackIn_103_0Lifetime1 = dupTemp$1Lifetime1;
                        stackIn_103_1Lifetime1 = dupTemp$1Lifetime1.field_bb;
                        stackIn_104_2Lifetime1 = ((id.field_c[var10 / 8] & 1 << (var10 & 7)) == 0);
                        stackIn_103_0Lifetime1.field_bb = stackIn_103_1Lifetime1 & stackIn_104_2Lifetime1;
                      }
                    } else {
                      stackIn_95_0 = fk.field_p[1][var8 + 1];
                      stackIn_95_1 = -1;
                      stackIn_95_2 = ~(id.field_c[var8 / 8] & 1 << (var8 & 7));
                      stackIn_98_1 = (stackIn_95_1 != stackIn_95_2);
                      stackIn_95_0.field_bb = stackIn_98_1;
                    }
                  } else {
                    var10 = nl.field_a[var8];
                    stackIn_90_0 = fk.field_p[1][var8 + 1];
                    stackIn_91_1 = (var10 == param2.field_Eb);
                    stackIn_90_0.field_bb = stackIn_91_1;
                  }
                }
              }
              stackIn_108_0 = fk.field_p[1][var8 + 1];
              stackIn_109_1 = (var4_int != 0) && (var9_intLifetime1 == 0);
              stackIn_108_0.field_s = stackIn_109_1;
            }
          }
          stackIn_113_0 = (!param1) ? 1 : 0;
          for (var7Lifetime2 = stackIn_113_0; 3 > var7Lifetime2; var7Lifetime2++) {
            var29 = fk.field_p[2][var7Lifetime2];
            if (var4_int != 0 &&
              var29.field_rb != 0) {
              if (!param1) {
                if (var7Lifetime2 != param2.field_Fb) {
                  var6 = 1;
                  param2.field_Fb = var7Lifetime2;
                }
              } else {
                if (var7Lifetime2 == 0) {
                  rj.field_q = 0;
                } else {
                  rj.field_q = rj.field_q ^ var7Lifetime2;
                }
              }
            }
            stackIn_126_0 = var29;
            stackIn_127_1 = (var4_int != 0);
            stackIn_126_0.field_s = stackIn_127_1;
            if (!param1) {
              stackIn_139_0 = var29;
              stackIn_140_1 = (0 != (var7Lifetime2 & param2.field_Fb));
              stackIn_139_0.field_bb = stackIn_140_1;
            } else {
              if (0 == var7Lifetime2) {
                stackIn_135_0 = var29;
                stackIn_136_1 = (0 == rj.field_q);
                stackIn_135_0.field_bb = stackIn_136_1;
              } else {
                stackIn_131_0 = var29;
                stackIn_132_1 = (0 != (var7Lifetime2 & rj.field_q));
                stackIn_131_0.field_bb = stackIn_132_1;
              }
            }
          }
          if (param1 &&
            mg.field_A > 1) {
            for (var7Lifetime3 = 0; var7Lifetime3 < 1 + mg.field_A; var7Lifetime3++) {
              var30 = fk.field_p[3][var7Lifetime3];
              if (var4_int != 0 &&
                var30.field_rb != 0) {
                qj.field_b = var7Lifetime3;
              }
              if (var30.field_v &&
                var7Lifetime3 > 0) {
                if (null == ec.field_v) {
                  stackIn_156_0 = null;
                } else {
                  stackIn_156_0 = ec.field_v[-1 + var7Lifetime3];
                }
                var9 = stackIn_156_0;
                if (var9 != null) {
                  dn.field_k = var9;
                }
              }
              stackIn_160_0 = var30;
              stackIn_161_1 = (var4_int != 0);
              stackIn_160_0.field_s = stackIn_161_1;
              stackIn_163_0 = var30;
              stackIn_164_1 = (qj.field_b == var7Lifetime3);
              stackIn_163_0.field_bb = stackIn_164_1;
            }
          }
          var7Lifetime4 = 0;
          for (var8 = 0; em.field_k > var8; var8++) {
            var31 = fk.field_p[var8 + 4];
            var9_array = var31;
            stackIn_170_0 = (!param1) ? 0 : -1;
            for (var10 = stackIn_170_0; -1 + var31.length > var10; var10++) {
              var11 = 0;
              var12 = 0;
              var13 = 0;
              var14 = 0;
              var15 = 0;
              var16 = 0;
              if (var4_int != 0 &&
                var10 >= 0) {
                if (ji.field_D != null &&
                  null != ji.field_D[var8] &&
                  (~vr.field_m & ji.field_D[var8][var10]) > 0) {
                  var15 = 1;
                  var16 = db.a(107, ji.field_D[var8][var10] & ~vr.field_m);
                }
                if (td.field_E != null &&
                  td.field_E[var8] != null &&
                  0 >= es.field_m &&
                  td.field_E[var8][var10]) {
                  var11 = 1;
                }
                if (null != ci.field_h &&
                  null != ci.field_h[var8]) {
                  var17 = ci.field_h[var8][var10];
                  if (var17 != 0 &&
                    !hm.field_o &&
                    es.field_m <= 0) {
                    var11 = 1;
                  }
                  if (var17 > 0 &&
                    var17 > a.field_j) {
                    var13 = 1;
                  }
                }
                if (pg.field_A != null &&
                  null != pg.field_A[var8]) {
                  var17Lifetime2 = pg.field_A[var8][var10];
                  if (var17Lifetime2 > 0 &&
                    var17Lifetime2 > bh.field_h) {
                    var12 = 1;
                  }
                  if (var17Lifetime2 != 0 &&
                    !hm.field_o &&
                    es.field_m <= 0) {
                    var11 = 1;
                  }
                }
                if (param1) {
                  if (nr.field_q != null) {
                    if (null != nr.field_q[var8]) {
                      stackIn_216_0 = (!nr.field_q[var8][var10]) ? 0 : 1;
                    } else {
                      stackIn_216_0 = 0;
                    }
                  } else {
                    stackIn_216_0 = 0;
                  }
                } else {
                  stackIn_216_0 = 0;
                }
                var14 = stackIn_216_0;
              }
              if (bs.field_b >= 2 &&
                di.field_p[12]) {
                var15 = 0;
                var12 = 0;
                var14 = 0;
                var13 = 0;
                var11 = 0;
              }
              if (var11 == 0 &&
                var12 == 0 &&
                var13 == 0 &&
                var14 == 0) {
                if (var15 == 0) {
                  stackIn_229_0 = 0;
                } else {
                  stackIn_229_0 = 1;
                }
              } else {
                stackIn_229_0 = 1;
              }
              var17Lifetime1 = stackIn_229_0;
              wg.field_d = true;
              if (var17Lifetime1 == 0 &&
                var10 >= 0 &&
                null != pe.field_D && (!param1 ||
                !k.field_i)) {
                wg.field_d = false;
                if (lr.field_c == null) {
                  lr.field_c = new byte[em.field_k];
                  ek.field_F = new boolean[em.field_k];
                }
                qd.field_h = false;
                for (var18_int = 0; var18_int < var8; var18_int++) {
                  ek.field_F[var18_int] = false;
                }
                js.a(-1, 1, param2, var8, 0, param1, var10, -1);
                if (bs.field_b >= 2 &&
                  di.field_p[12]) {
                  wg.field_d = true;
                }
                if (!wg.field_d) {
                  var17Lifetime1 = 1;
                }
              }
              var18 = var9_array[var10 + 1];
              if (var4_int != 0 &&
                var18.field_rb != 0) {
                if (param1) {
                  if (var10 == -1) {
                    for (var19 = var7Lifetime4; var19 < var31.length + (var7Lifetime4 - 1); var19++) {
                      qj.field_f[var19 / 8] = (byte)we.a((int) qj.field_f[var19 / 8], ~(1 << we.a(var19, 7)));
                    }
                  } else {
                    qj.field_f[(var10 + var7Lifetime4) / 8] = (byte)nc.a((int) qj.field_f[(var10 + var7Lifetime4) / 8], 1 << we.a(var10 + var7Lifetime4, 7));
                  }
                } else {
                  if (var17Lifetime1 == 0 &&
                    (byte)var10 != param2.field_dc[var8]) {
                    var6 = 1;
                    param2.field_dc[var8] = (byte)var10;
                  }
                }
              }
              if (param1 &&
                var17Lifetime1 != 0) {
                qj.field_f[(var10 + var7Lifetime4) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7Lifetime4) / 8], ~(1 << we.a(7, var7Lifetime4 + var10)));
              }
              if (var10 >= 0 &&
                var18.field_v) {
                if (wa.field_d == null) {
                  var19_ref = null;
                } else {
                  if (wa.field_d[var8] == null) {
                    var19_ref = null;
                  } else {
                    var19_ref = wa.field_d[var8][var10];
                  }
                }
                if (ei.field_f == null) {
                  var20 = null;
                } else {
                  if (ei.field_f[var8] == null) {
                    var20 = null;
                  } else {
                    var20 = ei.field_f[var8][var10];
                  }
                }
                var21 = null;
                if (var20 != null &&
                  !((String) (var20)).equals(var19_ref)) {
                  var21 = var20;
                }
                var22 = null;
                if (var14 == 0) {
                  if (var11 != 0) {
                    var22 = vd.field_r;
                    var23 = var22;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    var26 = var22;
                    var23 = var26;
                    var26 = var23;
                    var23 = var26;
                    var22 = var23;
                    var23 = var26;
                  } else {
                    if (var12 != 0) {
                      var23_int = -bh.field_h + pg.field_A[var8][var10];
                      if (var23_int != 1) {
                        var22 = re.a(nc.field_n, 4371, new String[]{Integer.toString(var23_int)});
                      } else {
                        var22 = ip.field_g;
                      }
                    }
                    if (var13 != 0) {
                      var32 = re.a(dh.field_d, 4371, new String[]{Integer.toString(a.field_j), Integer.toString(ci.field_h[var8][var10])});
                      var23 = var32;
                      var26 = var23;
                      var23 = var26;
                      var22 = var23;
                      var26_ref = var32;
                      var23 = var26_ref;
                      if (var22 == null) {
                        var22 = var32;
                      } else {
                        var22 = (String) (var22) + "<br>" + var32;
                      }
                    }
                    if (var15 != 0) {
                      var23 = ar.field_e;
                      if (0 < var16 &&
                        null != qa.field_s &&
                        var16 <= qa.field_s.length &&
                        qa.field_s[var16 - 1] != null) {
                        var23 = qa.field_s[-1 + var16][0];
                      }
                      if (var22 != null) {
                        var22 = (String) (var22) + "<br>" + (String) (var23);
                      } else {
                        var22 = var23;
                      }
                    }
                  }
                } else {
                  var22 = qh.field_D;
                }
                if (var4_int != 0 &&
                  !wg.field_d) {
                  var23 = null;
                  var24 = 0;
                  if (qd.field_h) {
                    var23 = "</col>" + wl.field_b + "<col=A00000>";
                    var26Lifetime1 = var23;
                    var23 = var26Lifetime1;
                    var26Lifetime1Lifetime1 = var23;
                    var23 = var26Lifetime1Lifetime1;
                    var22 = var23;
                  }
                  for (var25 = 0; var8 > var25; var25++) {
                    if (ek.field_F[var25]) {
                      var26_refLifetime1 = "</col>" + gm.field_l[var25] + "<col=A00000>";
                      var23 = var26_refLifetime1;
                      var22 = var23;
                      var23 = var26_refLifetime1;
                      if (var23 == null) {
                        var23 = var26_refLifetime1;
                        var22 = var23;
                        var22 = var23;
                      } else {
                        var23 = (String) (var23) + ", " + var26_refLifetime1;
                        var24 = 1;
                      }
                    }
                  }
                  if (var24 == 0) {
                    var22 = re.a(n.field_q, 4371, new String[]{(String) (var23)});
                  } else {
                    var22 = mp.field_d + (String) (var23);
                  }
                }
                if (var22 != null) {
                  var22 = "<col=A00000>" + (String) (var22);
                  var33 = qr.a((String) (var22), (byte) -125, "<br><col=A00000>", "<br>");
                  if (var21 == null) {
                    var21 = var33;
                  } else {
                    var21 = (String) (var21) + "<br>" + var33;
                  }
                }
                if (var21 != null) {
                  dn.field_k = (String) (var21);
                }
              }
              if (param1) {
                if (var10 == -1) {
                  var18.field_bb = true;
                  var28 = var7Lifetime4;
                  var19Lifetime1 = var28;
                  while (var28 < -1 + (var31.length + var7Lifetime4)) {
                    stackIn_337_0 = var18;
                    stackIn_337_1 = var18.field_bb;
                    stackIn_338_2 = ((qj.field_f[var28 / 8] & 1 << (var28 & 7)) == 0);
                    stackIn_337_0.field_bb = stackIn_337_1 & stackIn_338_2;
                    var28++;
                  }
                } else {
                  stackIn_340_0 = var18;
                  stackIn_340_1 = qj.field_f[(var7Lifetime4 + var10) / 8];
                  stackIn_340_2 = 1;
                  stackIn_340_3 = 7 & var10 + var7Lifetime4;
                  stackIn_343_1 = ((stackIn_340_1 & stackIn_340_2 << stackIn_340_3) != 0);
                  stackIn_340_0.field_bb = stackIn_343_1;
                }
              } else {
                stackIn_330_0 = var18;
                stackIn_331_1 = (wg.field_d) && (param2.field_dc[var8] == (byte)var10);
                stackIn_330_0.field_bb = stackIn_331_1;
              }
              stackIn_347_0 = var18;
              stackIn_348_1 = (var4_int != 0) && (var17Lifetime1 == 0);
              stackIn_347_0.field_s = stackIn_348_1;
            }
            var7Lifetime4 = var7Lifetime4 + (ks.field_e[var8] & 255);
          }
          if (var6 != 0) {
            if (param1) {
              return;
            }
            ti.a(param3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_357_0 = var4;
          stackIn_357_1 = new StringBuilder().append("sc.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_358_2 = "null";
          } else {
            stackIn_358_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_357_0), ((StringBuilder) (Object) stackIn_357_1).append(stackIn_358_2).append(',').append(param3).append(')').toString());
        }
    }

    final int[] b(int param0) {
        int var2 = 10 % ((param0 + 48) / 61);
        return new int[]{14, 16};
    }

    sc(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 4);
        this.field_r = null;
        this.field_t = null;
    }

    final void e(byte param0) {
        Object var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        ln[] var7;
        qm var7_ref;
        int var8;
        ln var9;
        int var10;
        int var11;
        int var12;
        ln var13;
        ln[] var14;
        ln var15;
        ln var16;
        int var4Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        Object var5Lifetime1;
        ln[] var7Lifetime1;
        ln var9Lifetime1;
        ln var9Lifetime2;
        ln var15Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 != 101) {
          this.field_r = (ln) null;
        }
        var2 = null;
        var3 = 0;
        for (var4 = 0; var4 < this.field_o; var4++) {
          var13 = this.field_g.field_g.field_e[var4];
          var2 = var13;
          var15 = var13;
          var9 = var15;
          var5 = var9;
          if (var13.field_y == this.field_n) {
            var6 = oe.field_i[var4];
            if (var13.field_u) {
              var6 = var6 * 2 + 5;
            }
            if (var6 > var3) {
              var2 = var13;
              var3 = var6;
            }
          }
        }
        if (var2 == null) {
          return;
        }
        var4Lifetime1 = ((ln) (var2)).field_p;
        var5Lifetime1 = null;
        var6Lifetime1 = 2147483647;
        var14 = this.field_t;
        var7 = var14;
        for (var8 = 0; var8 < var14.length; var8++) {
          var15Lifetime1 = var14[var8];
          var5Lifetime1 = var15Lifetime1;
          var5Lifetime1 = var15Lifetime1;
          var9Lifetime1 = var15Lifetime1;
          var10 = var15Lifetime1.field_p;
          if ((this.field_r == null ||
            this.field_r.field_R == var15Lifetime1.field_R) && this.field_g.field_g.field_c[var4Lifetime1][var10] > 2) {
            var11 = hs.field_i[var10];
            if (var11 < var6Lifetime1) {
              var5Lifetime1 = var15Lifetime1;
              var6Lifetime1 = var11;
            }
          }
        }
        if (var5Lifetime1 == null) {
          var7Lifetime1 = this.field_t;
          for (var8Lifetime1 = 0; var8Lifetime1 < var7Lifetime1.length; var8Lifetime1++) {
            var16 = var7Lifetime1[var8Lifetime1];
            var5Lifetime1 = var16;
            var5Lifetime1 = var16;
            var9Lifetime2 = var16;
            var10Lifetime1 = var16.field_p;
            if (null != this.field_r &&
              this.field_r.field_R != var9Lifetime2.field_R &&
              this.field_g.field_g.field_c[var4Lifetime1][var10Lifetime1] > 2) {
              var11Lifetime1 = hs.field_i[var10Lifetime1];
              if (var6Lifetime1 > var11Lifetime1) {
                var5Lifetime1 = var9Lifetime2;
                var6Lifetime1 = var11Lifetime1;
              }
            }
          }
        }
        if (null != var5Lifetime1) {
          var7_ref = new qm(3, this.field_n, (ln) (var2), (ln) (var5Lifetime1));
          lh.field_G.a((byte) -113, var7_ref);
        }
        return;
    }

    final void b(boolean param0) {
        int var4_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_1 = 0;
        Object var2;
        int var3;
        qm var4;
        int var5;
        ln var6;
        int var7;
        int var8;
        int var9;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        for (var4_int = 0; var4_int < this.field_o; var4_int++) {
          boolean decompiledFrameRemainder0 = true;
          var5 = hs.field_i[var4_int];
          if (var5 != 0) {
            var6 = this.field_g.field_g.field_e[var4_int];
            var2 = var6;
            var2 = var6;
            stackIn_7_0 = ~var6.field_x;
            if (!var6.field_u) {
              stackIn_8_1 = 10;
            } else {
              stackIn_8_1 = 5;
            }
            if (stackIn_7_0 <= ~stackIn_8_1) {
              if (null == var6.field_y) {
                decompiledFrameRemainder0 = (var6.field_L != 0);
              } else {
                var7 = this.field_g.field_D[var6.field_y.field_x];
                var8 = this.field_g.field_D[this.field_n.field_x];
                decompiledFrameRemainder0 = (!(var7 > var6.field_x * 4) ||
                  !(var8 > 2 * var6.field_x));
              }
              if (decompiledFrameRemainder0) {
                var7Lifetime1 = cb.field_o[var4_int];
                var8Lifetime1 = var5 * (var7Lifetime1 * var7Lifetime1);
                if (var3 < var8Lifetime1) {
                  var2 = var6;
                  var3 = var8Lifetime1;
                }
              }
            }
          }
        }
        if (!param0) {
          this.a((byte) 23);
        }
        if (var2 != null) {
          var4 = new qm(2, this.field_n, (ln) (var2));
          lh.field_G.a((byte) -113, var4);
        }
    }

    final void a(int param0, sd param1, byte param2) {
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          this.field_r = null;
          this.field_s = 2147483647;
          var4 = param1.j(18229);
          while (var4 != null) {
            var5 = var4.field_p;
            var6 = this.field_t;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              var9 = this.field_g.field_g.field_c[var5][var8.field_p];
              if (var9 < this.field_s) {
                this.field_s = var9;
                this.field_r = var8;
              }
            }
            var4 = param1.h(-23410);
          }
          super.a(param0, param1, param2);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sc.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_q = false;
        field_p = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
