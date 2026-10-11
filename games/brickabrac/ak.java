/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    j[] field_l;
    static String field_e;
    int field_i;
    int field_k;
    static mh field_d;
    boolean field_c;
    int[] field_m;
    int field_n;
    int field_h;
    String[] field_f;
    int field_a;
    oi field_b;
    int field_g;
    int field_j;

    final void a(int param0, int param1, vl param2, byte param3) {
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        ge var8 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param3 > -39) {
            this.c(86);
          }
          var8 = (ge) (param2.d(-44));
          while (var8 != null) {
            stackIn_6_0 = this.field_k;
            stackIn_6_1 = 1;
            if (stackIn_6_0 != stackIn_6_1 &&
              !var8.b(false)) {
              for (var6 = 0; var6 < this.field_k; var6++) {
                if (var6 != param0 &&
                  (1 << var6 & (this.field_g | this.field_i | this.field_a)) == 0) {
                  this.field_l[var6].field_kb.a(new ge(var8, param1 + this.field_l[var6].field_F), (byte) -39);
                }
              }
            } else {
              this.field_l[param0].field_kb.a(new ge(var8, param1 + this.field_l[param0].field_F), (byte) -39);
            }
            var8 = (ge) (param2.a((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("ak.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(byte param0) {
        boolean discarded$1 = false;
        int var3 = 0;
        int var2;
        int var4;
        vn var5;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        if (param0 != -92) {
          var5 = (vn) null;
          discarded$1 = this.a((j) null, (vl) null, -18, 53, (vn) null);
        }
        for (var3 = 0; var3 < this.field_k; var3++) {
          if (((this.field_i | (this.field_a | this.field_g)) & 1 << var3) == 0 &&
            this.field_l[var3].field_M == 0) {
            var2 = var2 | 1 << var3;
          }
        }
        return var2;
    }

    final void a(boolean param0) {
        if (param0) {
          this.c(-32);
        }
        this.field_c = true;
    }

    final int c(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 0;
        if (param0 != -17566) {
          return -12;
        }
        while (var3 < this.field_k) {
          if ((1 << var3 & this.field_a) == 0 &&
            7 == this.field_l[var3].field_Z) {
            var2 = var2 | 1 << var3;
          }
          var3++;
        }
        return var2;
    }

    final void a(j param0, vl param1, vl param2, int param3) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$3 = 0;
        on dupTemp$4 = null;
        int fieldTemp$5 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        j stackIn_55_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_142_0 = 0;
        j stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_156_2 = 0;
        j stackIn_158_0 = null;
        String[] stackIn_159_1 = null;
        int stackIn_245_0 = 0;
        j stackIn_270_0 = null;
        int stackIn_270_1 = 0;
        int stackIn_271_2 = 0;
        int stackIn_279_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_285_1 = 0;
        j stackIn_287_0 = null;
        int stackIn_288_1 = 0;
        j stackIn_300_0 = null;
        String[] stackIn_302_1 = null;
        RuntimeException stackIn_388_0 = null;
        StringBuilder stackIn_388_1 = null;
        String stackIn_389_2 = null;
        StringBuilder stackIn_391_1 = null;
        String stackIn_392_2 = null;
        StringBuilder stackIn_394_1 = null;
        String stackIn_395_2 = null;
        RuntimeException decompiledCaughtException = null;
        kc var5 = null;
        RuntimeException var5_ref = null;
        ul var6 = null;
        vo var7 = null;
        int var8 = 0;
        vl[] var8_ref_vl__ = null;
        vn var9 = null;
        int var9_int = 0;
        cl var9_ref = null;
        il var9_ref2 = null;
        vo var9_ref3 = null;
        on var9_ref4 = null;
        Object var10_ref = null;
        on var10_ref_on = null;
        int var10 = 0;
        ge var10_ref_ge = null;
        vn var10_ref_vn = null;
        Object var11_ref = null;
        int var11 = 0;
        on var11_ref_on = null;
        ee var11_ref_ee = null;
        Object var12_ref = null;
        int var12 = 0;
        on var12_ref_on = null;
        vn var13 = null;
        on var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        vl var18 = null;
        vl var19 = null;
        no var20 = null;
        vl var21 = null;
        vl var22 = null;
        vl var23 = null;
        ee var24 = null;
        vl var25 = null;
        vl var26 = null;
        vn var9Lifetime1;
        vn var9Lifetime2;
        on var10_ref_onLifetime1;
        vn var10_ref_vnLifetime1;
        vn var10_ref_vnLifetime2;
        on var11_ref_onLifetime1;
        on var11_ref_onLifetime2;
        vl var21Lifetime1;
        vl var22Lifetime1;
        vl var22Lifetime2;
        vl var26Lifetime1;
        vl var21Lifetime2;
        vl var26Lifetime2;
        vl var22Lifetime1Lifetime1;
        int var12Lifetime1;
        int var12Lifetime1Lifetime1;
        var12_ref = null;
        var11_ref = null;
        var17 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledSharedTail0 = !(param3 < param0.field_i);
          if (!decompiledSharedTail0) {
            fieldTemp$0 = param0.field_i - 1;
            param0.field_i = param0.field_i - 1;
            decompiledSharedTail0 = (!(fieldTemp$0 > 0));
          }
          if (decompiledSharedTail0) {
            param0.field_fb = param0.field_lb;
            if (null != param0.field_fb) {
              param0.field_i = 100;
            }
            param0.field_lb = null;
          }
          if (param0.field_M > 0) {
            param0.field_M = param0.field_M - 1;
          }
          if (param0.field_ib > 0) {
            fieldTemp$1 = param0.field_ib - 1;
            param0.field_ib = param0.field_ib - 1;
            if (0 == fieldTemp$1) {
              param0.b(16387, 0);
            }
          }
          var5 = (kc) (param0.field_x.d(-58));
          while (var5 != null) {
            if (!var5.c((byte) 69)) {
              var5.b((byte) 111);
            }
            var5 = (kc) (param0.field_x.a((byte) 116));
          }
          var6 = (ul) (param0.field_nb.d(-85));
          while (var6 != null) {
            if (!var6.b(false)) {
              var6.b((byte) 111);
            }
            var6 = (ul) (param0.field_nb.a((byte) 116));
          }
          var7 = param0.field_yb;
          if (param0.field_Z == 2) {
            if (param1 != null &&
              0 != (3 & param0.field_db) &&
              3 != param0.field_db) {
              param1.a(new qc(4), (byte) 3);
            }
            if (0 < var7.field_w) {
              param0.field_db = param0.field_db ^ 3;
            }
            if ((param0.field_db & 2) != 0) {
              var7.field_k = 2048;
            }
            if ((param0.field_db & 1) != 0) {
              var7.field_k = var7.field_k - 2048;
            }
            if ((param0.field_db & 4) != 0) {
              var8 = 0;
              if (!param0.field_gb.a(false)) {
                var9 = (vn) (param0.field_gb.d(-76));
                while (var9 != null) {
                  if (40 <= var9.field_C) {
                    if (param1 != null) {
                      param1.a(new qc(6), (byte) 3);
                    }
                    var8 = 1;
                    var9.field_C = 0;
                    param0.field_x.a(new kc(var9.field_j, var9.field_m), (byte) 3);
                    param0.field_l = 0;
                    var20 = new no(var9.field_u + var9.field_j, var9.field_u + var9.field_m, 0, 0, 15360, 0);
                    var11 = 0;
                    for (var12 = 0; param0.field_z.length > var12; var12++) {
                      var19 = param0.field_z[var12];
                      var21 = var19;
                      var22 = var21;
                      var21Lifetime2 = var19;
                      var14 = (on) (var19.d(-78));
                      while (var14 != null) {
                        if (var14.a(var20, false)) {
                          if (var14.field_i <= 0) {
                            if (var14.field_i != 19) {
                              if (var14.field_i != 20) {
                                if (21 != var14.field_i) {
                                  stackIn_132_0 = (var14.field_i == 22) ? 1 : 0;
                                } else {
                                  stackIn_132_0 = 1;
                                }
                              } else {
                                stackIn_132_0 = 1;
                              }
                            } else {
                              stackIn_132_0 = 1;
                            }
                          } else {
                            stackIn_132_0 = 1;
                          }
                          var15 = stackIn_132_0;
                          if (var14.field_i == 22) {
                            var14.field_i = 23;
                          }
                          if (var14.field_i == 21) {
                            var14.field_i = 22;
                          }
                          if (var15 != 0) {
                            stackIn_142_0 = (var14.field_R != 0) ? 0 : 1;
                            var16 = stackIn_142_0;
                            var14.field_R = ue.field_b[var14.field_i];
                            var14.field_B = rb.field_a[var14.field_i];
                            var14.field_l = 0;
                            if (19 == var14.field_i ||
                              var14.field_i == 20) {
                              var14.field_B = 1;
                              var14.field_R = 0;
                            }
                            if (1 == this.field_k &&
                              var14.field_R == 0 &&
                              var16 == 0) {
                              param0.a(2 * var9.field_B + 10, var14, 2);
                              var11++;
                            }
                          }
                        }
                        var14 = (on) (var19.a((byte) 116));
                      }
                    }
                    stackIn_155_0 = (j) (param0);
                    stackIn_155_1 = 16387;
                    if (var11 > 0) {
                      stackIn_156_2 = 1;
                    } else {
                      stackIn_156_2 = 6;
                    }
                    ((j) (Object) stackIn_155_0).b(stackIn_155_1, stackIn_156_2);
                    stackIn_158_0 = (j) (param0);
                    if (var11 > 0) {
                      stackIn_159_1 = ml.field_e;
                    } else {
                      stackIn_159_1 = eh.field_e;
                    }
                    ((j) (Object) stackIn_158_0).a(stackIn_159_1, (byte) 75);
                  }
                  var9 = (vn) (param0.field_gb.a((byte) 116));
                }
              }
              if (var8 == 0 &&
                !param0.field_K.a(false)) {
                param0.field_gb.a(param0.field_K.c(3), (byte) 3);
              }
              if (var8 != 0) {
                fieldTemp$2 = param0.field_A + 1;
                param0.field_A = param0.field_A + 1;
                if (1 == fieldTemp$2) {
                }
              }
            }
            L30: {
              var8 = 1;
              if (param0.field_n == 0) {
                var8 = 0;
              } else {
                if (this.field_k != 1) {
                  for (var9_int = 0; param0.field_z.length > var9_int; var9_int++) {
                    var21Lifetime1 = param0.field_z[var9_int];
                    var22Lifetime1 = var21Lifetime1;
                    var22Lifetime1Lifetime1 = var21Lifetime1;
                    var11_ref_on = (on) (var21Lifetime1.d(param3 - 91));
                    while (var11_ref_on != null) {
                      if ((1 << var11_ref_on.field_i & hp.field_m) != 0 &&
                        81920 <= var11_ref_on.field_m) {
                        var8 = 0;
                        break L30;
                      }
                      var11_ref_on = (on) (var21Lifetime1.a((byte) 116));
                    }
                  }
                  break L30;
                }
                var8 = 1;
              }
            }
            if (var8 != 0) {
              var9_ref = (cl) (param0.field_v.d(-120));
              while (var9_ref != null) {
                var22Lifetime2 = var9_ref.field_p;
                var11_ref_ee = (ee) (var22Lifetime2.d(-125));
                while (var11_ref_ee != null) {
                  var11_ref_ee.field_m = var11_ref_ee.field_m + 256;
                  var11_ref_ee = (ee) (var22Lifetime2.a((byte) 116));
                }
                var9_ref = (cl) (param0.field_v.a((byte) 116));
              }
            }
            for (var9_int = 0; param0.field_z.length > var9_int; var9_int++) {
              var23 = param0.field_z[var9_int];
              var11_ref_onLifetime1 = (on) (var23.d(param3 ^ -42));
              while (var11_ref_onLifetime1 != null) {
                if (var8 != 0 &&
                  (5 & var11_ref_onLifetime1.field_N) == 0) {
                  var11_ref_onLifetime1.field_m = var11_ref_onLifetime1.field_m + 256;
                }
                if (0 <= var11_ref_onLifetime1.field_R) {
                  fieldTemp$6 = var11_ref_onLifetime1.field_l + 1;
                  var11_ref_onLifetime1.field_l = var11_ref_onLifetime1.field_l + 1;
                  if (fieldTemp$6 == 16) {
                    var11_ref_onLifetime1.field_B = 0;
                    var11_ref_onLifetime1.field_l = 0;
                    if (0 == var11_ref_onLifetime1.field_R) {
                      var11_ref_onLifetime1.b((byte) 111);
                      if ((1 << var11_ref_onLifetime1.field_i & hp.field_m) != 0) {
                        param0.field_L = param0.field_L - 1;
                        param0.field_m = param0.field_m + 1;
                        param0.field_Q = param0.field_Q + 1;
                      }
                      if (r.field_A) {
                        jc.a(var11_ref_onLifetime1.field_N, 1, (byte) -95);
                      }
                    } else {
                      if (var11_ref_onLifetime1.field_i == 0) {
                        param0.field_L = param0.field_L + 1;
                      }
                      var11_ref_onLifetime1.field_i = var11_ref_onLifetime1.field_R;
                      var11_ref_onLifetime1.field_R = -1;
                    }
                  }
                }
                if ((4 & var11_ref_onLifetime1.field_N) != 0) {
                  var11_ref_onLifetime1.a((byte) 58, true);
                  var11_ref_onLifetime1.field_S = var11_ref_onLifetime1.field_S + 1;
                  var11_ref_onLifetime1.field_J = var11_ref_onLifetime1.field_J + 1;
                  var24 = var11_ref_onLifetime1.field_P[var11_ref_onLifetime1.field_C];
                  if (var24.field_t == var11_ref_onLifetime1.field_S) {
                    var11_ref_onLifetime1.f(105);
                  }
                }
                var11_ref_onLifetime1 = (on) (var23.a((byte) 116));
              }
            }
            var9Lifetime1 = (vn) (param0.field_K.d(-105));
            while (var9Lifetime1 != null) {
              if (var9Lifetime1.field_J > 0) {
                var9Lifetime1.field_J = var9Lifetime1.field_J - 1;
              }
              if (var9Lifetime1.field_v > 0) {
                var9Lifetime1.field_v = var9Lifetime1.field_v - 1;
              }
              var9Lifetime1 = (vn) (param0.field_K.a((byte) 116));
            }
            var9Lifetime2 = (vn) (param0.field_gb.d(param3 - 13));
            while (var9Lifetime2 != null) {
              var9Lifetime2.field_E.a(-7255, var9Lifetime2.field_j + var9Lifetime2.field_u);
              var9Lifetime2.field_y.a(-7255, var9Lifetime2.field_m + var9Lifetime2.field_u);
              if (var9Lifetime2.field_J > 0) {
                var9Lifetime2.field_J = var9Lifetime2.field_J - 1;
              }
              if (var9Lifetime2.field_v > 0) {
                var9Lifetime2.field_v = var9Lifetime2.field_v - 1;
              }
              var9Lifetime2 = (vn) (param0.field_gb.a((byte) 116));
            }
            if (var7.field_w > 0) {
              var7.field_w = var7.field_w - 1;
            }
            if (var7.field_H > 0) {
              var7.field_H = var7.field_H - 1;
            }
            if (0 < var7.field_z) {
              var7.field_z = var7.field_z - 1;
            }
            if (var8 != 0) {
              fieldTemp$3 = param0.field_n - 1;
              param0.field_n = param0.field_n - 1;
              if (fieldTemp$3 % 16 == 0) {
                stackIn_245_0 = (1 == this.field_k) ? 13 : 7;
                var9_int = stackIn_245_0;
                var10_ref = null;
                for (var11 = 1; var11 <= var9_int; var11++) {
                  dupTemp$4 = new on(34 * var11 << 8, 4096, 0, 0, 0);
                  var10_ref_on = dupTemp$4;
                  param0.field_z[2].a(dupTemp$4, (byte) 3);
                  var10_ref_on.field_R = 2;
                  var10_ref_on.field_B = 10;
                }
                for (var11 = 0; var11 < 3; var11++) {
                  var25 = param0.field_z[var11];
                  var26 = var25;
                  var26Lifetime2 = var25;
                  var10_ref_onLifetime1 = (on) (var25.d(-44));
                  while (var10_ref_onLifetime1 != null) {
                    if ((1 & var10_ref_onLifetime1.field_N) == 0 &&
                      81920 < var10_ref_onLifetime1.field_m) {
                      var10_ref_onLifetime1.field_B = 7;
                      var10_ref_onLifetime1.field_R = 0;
                      var10_ref_onLifetime1.field_l = 0;
                    }
                    var10_ref_onLifetime1 = (on) (var25.a((byte) 116));
                  }
                }
              }
            }
            if (param0.field_k >= 0) {
              var9_ref2 = (il) (param0.field_C.d(-118));
              while (var9_ref2 != null) {
                var9_ref2.d(param3 - 2081170685);
                var9_ref2 = (il) (param0.field_C.a((byte) 116));
              }
              param0.field_k = param0.field_k + 1;
            }
            var9_int = 0;
            while (true) {
              if (var9_int >= 8) {
                var9_ref3 = var7;
                var7.field_o = 0;
                var9_ref3.field_k = 0;
                for (var10 = 0; var10 < 3; var10++) {
                  var11_ref_onLifetime2 = (on) (param0.field_z[var10].d(-49));
                  while (var11_ref_onLifetime2 != null) {
                    if ((var11_ref_onLifetime2.field_N & 4) != 0) {
                      var11_ref_onLifetime2.a((byte) 119, true);
                    }
                    var11_ref_onLifetime2 = (on) (param0.field_z[var10].a((byte) 116));
                  }
                }
                boolean decompiledFrameRemainder0 = true;
                if (param0.field_L == 0 &&
                  param0.field_n == 0) {
                  param0.field_P = 0;
                  param0.field_r = param0.field_r + 1;
                  param0.field_hb = param0.field_hb + 1;
                  param0.field_t = param0.field_t + 1;
                  if (1 == this.field_k) {
                    param0.a(250, false, 65280, var7.field_m - 12800);
                  }
                  fieldTemp$5 = param0.field_qb + 1;
                  param0.field_qb = param0.field_qb + 1;
                  if (fieldTemp$5 >= this.field_b.a(param3 - 125) &&
                    !this.field_b.field_c) {
                    if (this.field_k != 1) {
                      param0.field_Z = 7;
                    } else {
                      param0.field_Z = 5;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    param0.field_Z = 0;
                    param0.field_P = 0;
                  }
                }
                if (param0.field_lb != null) {
                  return;
                }
                var10 = 0;
                var11 = 0;
                var12Lifetime1 = 0;
                var13 = (vn) (param0.field_gb.d(-26));
                while (var13 != null) {
                  var12Lifetime1Lifetime1 = var13.field_I;
                  if (var13.field_I > var10) {
                    var10 = var12Lifetime1Lifetime1;
                  }
                  var12Lifetime1Lifetime1 = var13.field_B;
                  if (var11 < var13.field_B) {
                    var11 = var12Lifetime1Lifetime1;
                  }
                  var13 = (vn) (param0.field_gb.a((byte) 116));
                }
                if (var10 <= 20 &&
                  15 >= var11) {
                  return;
                }
                param0.a(ml.field_e, (byte) 75);
                return;
              }
              var10_ref_ge = (ge) (param0.field_pb.d(-119));
              while (var10_ref_ge != null) {
                var10_ref_ge.field_j = var10_ref_ge.field_j + var10_ref_ge.field_k / 8;
                var10_ref_ge.field_m = var10_ref_ge.field_m + var10_ref_ge.field_o / 8;
                if (var10_ref_ge.field_m > 122880) {
                  stackIn_270_0 = (j) (param0);
                  stackIn_270_1 = 16387;
                  if (param0.a(100, (byte) 62) > 50) {
                    stackIn_271_2 = 4;
                  } else {
                    stackIn_271_2 = 5;
                  }
                  ((j) (Object) stackIn_270_0).b(stackIn_270_1, stackIn_271_2);
                  if (r.field_A) {
                    jc.a(var10_ref_ge.field_i, 4, (byte) -110);
                  }
                  var10_ref_ge.b((byte) 111);
                } else {
                  if (var7.a(var10_ref_ge, (byte) 25)) {
                    var10_ref_ge.b((byte) 111);
                    stackIn_279_0 = (!var10_ref_ge.b(false)) ? 0 : 1;
                    var11 = stackIn_279_0;
                    if (param2 != null) {
                      param2.a(var10_ref_ge, (byte) 3);
                    }
                    if (this.field_k == 1) {
                      stackIn_284_0 = var11;
                      if (var10_ref_ge.field_i != 13) {
                        stackIn_285_1 = 0;
                      } else {
                        stackIn_285_1 = 1;
                      }
                      var11 = stackIn_284_0 | stackIn_285_1;
                      stackIn_287_0 = (j) (param0);
                      if (var11 != 0) {
                        stackIn_288_1 = 100;
                      } else {
                        stackIn_288_1 = 500;
                      }
                      ((j) (Object) stackIn_287_0).a(stackIn_288_1, var7, param3 + 2);
                      if (var11 != 0) {
                        param0.field_u = 0;
                        param0.field_hb = 0;
                        param0.field_N = param0.field_N + 1;
                      } else {
                        param0.field_u = param0.field_u + 1;
                        param0.field_N = 0;
                      }
                    }
                    if (r.field_A) {
                      jc.a(var10_ref_ge.field_i, 3, (byte) -115);
                    }
                    if (param1 != null) {
                      param1.a(new qc(3, var10_ref_ge.field_i), (byte) 3);
                    }
                    stackIn_300_0 = (j) (param0);
                    if (1 >= this.field_k &&
                      var10_ref_ge.field_i != 13 &&
                      var11 == 0) {
                      stackIn_302_1 = eh.field_e;
                    } else {
                      stackIn_302_1 = ml.field_e;
                    }
                    ((j) (Object) stackIn_300_0).a(stackIn_302_1, (byte) 75);
                  }
                }
                var10_ref_ge = (ge) (param0.field_pb.a((byte) 116));
              }
              var7.field_j = var7.field_j + var7.field_k / 8;
              if (var7.field_B > var7.field_j) {
                var7.field_j = var7.field_B;
              }
              if (-var7.field_u + var7.field_y < var7.field_j) {
                var7.field_j = -var7.field_u + var7.field_y;
              }
              if (var7.field_H > 0) {
                var10_ref_vn = (vn) (param0.field_gb.d(-111));
                while (var10_ref_vn != null) {
                  if ((var10_ref_vn.field_j + var10_ref_vn.field_u) > (var7.field_u / 2 + var7.field_j)) {
                    if (var10_ref_vn.field_k > 0) {
                      var10_ref_vn.field_k = -var10_ref_vn.field_k;
                    }
                  } else {
                    if (0 <= var10_ref_vn.field_k) {
                      var10_ref_vn = (vn) (param0.field_gb.a((byte) 116));
                      continue;
                    }
                    var10_ref_vn.field_k = -var10_ref_vn.field_k;
                  }
                  var10_ref_vn = (vn) (param0.field_gb.a((byte) 116));
                }
              }
              for (var10 = 0; param0.field_z.length > var10; var10++) {
                var26Lifetime1 = param0.field_z[var10];
                var12_ref_on = (on) (var26Lifetime1.d(-38));
                while (var12_ref_on != null) {
                  if (0 != (var12_ref_on.field_N & 4) &&
                    1 < var12_ref_on.field_P[var12_ref_on.field_C].field_t) {
                    var12_ref_on.field_j = var12_ref_on.field_j + var12_ref_on.field_k / 8;
                    var12_ref_on.field_m = var12_ref_on.field_m + var12_ref_on.field_o / 8;
                  }
                  var12_ref_on = (on) (var26Lifetime1.a((byte) 116));
                }
              }
              var10_ref_vnLifetime1 = (vn) (param0.field_gb.d(-122));
              while (var10_ref_vnLifetime1 != null) {
                for (var11 = 0; var11 < 5; var11++) {
                  if (this.a(param0, param1, 8, -128, var10_ref_vnLifetime1)) {
                    continue;
                  }
                  break;
                }
                if (var10_ref_vnLifetime1.b(0) && (var11 == 5 ||
                  !(var10_ref_vnLifetime1.field_j >= 0) ||
                  !(0 <= var10_ref_vnLifetime1.field_m) ||
                  !(param0.field_mb << 8 >= var10_ref_vnLifetime1.field_j))) {
                  var10_ref_vnLifetime1.a(-1024 + param0.a(2048, (byte) 62), 1536, 105);
                  var10_ref_vnLifetime1.field_E.field_j = -1;
                  var10_ref_vnLifetime1.field_B = 0;
                  var10_ref_vnLifetime1.field_y.field_j = -1;
                  var10_ref_vnLifetime1.field_I = 0;
                  var10_ref_vnLifetime1.field_C = 0;
                  param0.field_K.a(var10_ref_vnLifetime1, (byte) 3);
                }
                if (!param0.field_gb.a(false)) {
                  var10_ref_vnLifetime1 = (vn) (param0.field_gb.a((byte) 116));
                  continue;
                }
                break;
              }
              var10_ref_vnLifetime2 = (vn) (param0.field_K.d(-91));
              while (var10_ref_vnLifetime2 != null) {
                var10_ref_vnLifetime2.a(var7, 0);
                var10_ref_vnLifetime2 = (vn) (param0.field_K.a((byte) 116));
              }
              var9_int++;
            }
          } else {
            if (param0.field_Z == 0) {
              var8_ref_vl__ = new vl[3];
              for (var9_int = 0; 3 > var9_int; var9_int++) {
                var8_ref_vl__[var9_int] = new vl();
              }
              var18 = new vl();
              var10 = param0.field_ab.field_p;
              this.field_b.a(new ga(), param0.field_ab, var18, param0.field_qb, (byte) -118, var8_ref_vl__);
              param0.a(var18, param3 + 9, var8_ref_vl__);
              param0.a(26496, false);
              if (this.field_k == 1 &&
                0 < param0.field_r && (param0.field_ab.field_p == 0 ||
                var10 != param0.field_ab.field_p)) {
                param0.field_tb = true;
              }
              if (param0.field_r != 0) {
                for (var11 = 0; var11 < 3; var11++) {
                  var12_ref_on = (on) (var8_ref_vl__[var11].d(param3 ^ -107));
                  while (var12_ref_on != null) {
                    var12_ref_on.field_l = 0;
                    var12_ref_on.field_B = 5;
                    var12_ref_on.field_R = var12_ref_on.field_i;
                    var12_ref_on = (on) (var8_ref_vl__[var11].a((byte) 116));
                  }
                }
              }
              param0.field_Z = 1;
              param0.field_P = 0;
              param0.field_A = 0;
              return;
            }
            if (param0.field_Z == 1) {
              if (param0.field_P == 0) {
                if (this.field_k == 1) {
                  param0.field_lb = null;
                  param0.field_fb = this.field_b.a((byte) 115, param0.field_qb);
                  param0.field_i = 100;
                }
                if (param1 != null) {
                  param1.a(new qc(14), (byte) 3);
                }
              }
              if (param0.field_r != 0) {
                for (var8 = 0; var8 < 3; var8++) {
                  var9_ref4 = (on) (param0.field_z[var8].d(-30));
                  while (var9_ref4 != null) {
                    if (var9_ref4.field_R >= 0) {
                      fieldTemp$7 = var9_ref4.field_l + 1;
                      var9_ref4.field_l = var9_ref4.field_l + 1;
                      if (fieldTemp$7 == 16) {
                        var9_ref4.field_B = 0;
                        var9_ref4.field_l = 0;
                        var9_ref4.field_R = -1;
                      }
                    }
                    var9_ref4 = (on) (param0.field_z[var8].a((byte) 116));
                  }
                }
              }
              var8 = 0;
              if (this.field_k == 1) {
                var8 = 125;
              } else {
                var8 = (param0.field_r == 0) ? 75 : 40;
              }
              fieldTemp$8 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$8 != var8) {
                return;
              }
              param0.field_P = 0;
              param0.field_Z = 4;
              return;
            }
            if (param0.field_Z == 4) {
              if (param0.field_P == 0 &&
                param1 != null) {
                param1.a(new qc(13), (byte) 3);
              }
              fieldTemp$11 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$11 != 75) {
                if (this.field_k != 1) {
                  return;
                }
                if (25 != param0.field_P) {
                  return;
                }
              }
              param0.field_lb = lq.field_c;
              stackIn_55_0 = (j) (param0);
              if (param0.field_i > 25) {
                stackIn_56_1 = 25;
              } else {
                stackIn_56_1 = param0.field_i;
              }
              stackIn_55_0.field_i = stackIn_56_1;
              param0.field_Z = 2;
              param0.field_P = 0;
              return;
            }
            if (param0.field_Z == 3) {
              fieldTemp$9 = param0.field_P + 1;
              param0.field_P = param0.field_P + 1;
              if (fieldTemp$9 != 350) {
                return;
              }
              param0.field_P = 0;
              param0.field_Z = 8;
              return;
            }
            if (param0.field_Z != 5) {
              return;
            }
            fieldTemp$10 = param0.field_P + 1;
            param0.field_P = param0.field_P + 1;
            if (fieldTemp$10 == 350) {
              param0.field_P = 0;
              param0.field_Z = 9;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_388_0 = var5_ref;
          stackIn_388_1 = new StringBuilder().append("ak.F(");
          if (param0 == null) {
            stackIn_389_2 = "null";
          } else {
            stackIn_389_2 = "{...}";
          }
          stackIn_391_1 = ((StringBuilder) (Object) stackIn_388_1).append(stackIn_389_2).append(',');
          if (param1 == null) {
            stackIn_392_2 = "null";
          } else {
            stackIn_392_2 = "{...}";
          }
          stackIn_394_1 = ((StringBuilder) (Object) stackIn_391_1).append(stackIn_392_2).append(',');
          if (param2 == null) {
            stackIn_395_2 = "null";
          } else {
            stackIn_395_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_388_0), ((StringBuilder) (Object) stackIn_394_1).append(stackIn_395_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -19537) {
          field_e = (String) null;
        }
    }

    private final void a(vn param0, int param1, j param2) {
        int var4_int = 0;
        vl var5 = null;
        on var6 = null;
        int var7 = BrickABrac.field_J ? 1 : 0;
        try {
          hg.a(param1);
          for (var4_int = -1 + param2.field_z.length; var4_int > -1; var4_int--) {
            var5 = param2.field_z[var4_int];
            var6 = (on) (var5.f(~param1));
            while (var6 != null) {
              var6.a(param0, (byte) 119);
              var6 = (on) (var5.b(-126));
            }
            if (dj.field_c != null) {
              break;
            }
          }
          param2.field_yb.a(param0, (byte) 110);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = 30 * this.field_k;
        if (param0 <= 120) {
          return -109;
        }
        for (var4 = 0; var4 < this.field_k; var4++) {
          if (((this.field_i | (this.field_a | this.field_g)) & 1 << var4) == 0) {
            var5 = this.field_l[var4].field_p + this.field_l[var4].field_ub;
            var6 = 0;
            var7 = (var4 + 1) % this.field_k;
            while (this.field_k - 1 > var6) {
              if ((1 << var7 & (this.field_a | this.field_g | this.field_i)) != 0) {
                var7++;
                var7 = var7 % this.field_k;
                var6++;
                continue;
              }
              var8 = this.field_l[var7].field_ub + this.field_l[var7].field_p;
              if (var7 < var4) {
                var8 = var8 + var3;
              }
              if (var8 >= var5) {
                break;
              }
              var2 = var2 | 1 << var7;
              break;
            }
          }
        }
        return var2;
    }

    final void a(byte param0, int param1) {
        j var3;
        ge var4;
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (param0 < 81) {
          this.field_c = true;
        }
        var3 = this.field_l[param1];
        while (var3.field_X <= var3.field_kb.field_n) {
          var4 = (ge) (var3.field_kb.a(var3.field_X, 67));
          if (var4.field_y <= var3.field_F) {
            var4.a(var3, (byte) 99);
            var3.field_X = var3.field_X + 1;
            continue;
          }
          break;
        }
    }

    private final boolean a(j param0, vl param1, int param2, int param3, vn param4) {
        boolean stackIn_99_0 = false;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        StringBuilder stackIn_107_1 = null;
        String stackIn_108_2 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        on var9 = null;
        on var10 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          param4.field_j = param4.field_j + param4.field_k / param2;
          param4.field_m = param4.field_m + param4.field_o / param2;
          if (122880 < param4.field_m) {
            param4.b((byte) 111);
            if (param1 != null) {
              param1.a(new qc(7), (byte) 3);
            }
            if (param0.field_gb.a(false) &&
              param0.field_K.a(false)) {
              if (1 == this.field_k && (!r.field_A ||
                0 != this.field_b.field_b.field_h ||
                !(0 >= param0.field_qb))) {
                param0.field_rb = param0.field_rb - 1;
              }
              if (param0.field_rb <= 0) {
                param0.b(16387, 3);
                param0.a((byte) 22);
              } else {
                if (3 != param0.field_y) {
                  if (param0.field_y == 6) {
                    param0.a(7, true, 150);
                  } else {
                    param0.a(3, true, 150);
                  }
                } else {
                  param0.a(6, true, 150);
                }
                if (r.field_A) {
                  jc.a(0, 5, (byte) -124);
                }
                param0.a(26496, true);
                param0.field_P = 0;
                param0.field_Z = 4;
              }
              param0.a(eh.field_e, (byte) 75);
              return false;
            }
            param0.b(16387, 2);
            return false;
          }
          this.a(param4, -1, param0);
          if (param3 > -125) {
            return false;
          }
          if (null != dj.field_c) {
            if (r.field_A) {
              if (wl.field_N) {
                if (!cm.field_s &&
                  param4.field_C == 39) {
                  jc.a(0, 6, (byte) -108);
                }
              } else {
                param4.field_C = 0;
              }
            }
            if (39 == param4.field_C &&
              param1 != null) {
              param1.a(new qc(5), (byte) 3);
            }
            if (param0.field_yb == dj.field_c) {
              if (param0.field_yb.field_z > 0) {
                if (param1 != null) {
                  param1.a(new qc(10), (byte) 3);
                }
                param0.field_yb.a((byte) 53, param0, param4);
                param4.field_E.field_j = -1;
                param4.field_C = 0;
                param4.field_y.field_j = -1;
                param0.field_K.a(param4, (byte) 3);
                return false;
              }
              if (param1 != null) {
                param1.a(new qc(0), (byte) 3);
              }
              param0.field_yb.a((byte) 53, param0, param4);
              param4.field_B = 0;
            } else {
              dj.field_c.a((byte) 53, param0, param4);
              var9 = (on) (dj.field_c);
              if (param1 != null) {
                boolean decompiledFrameRemainder0 = true;
                var7 = 1;
                if ((var9.field_N & 1) == 0) {
                  if (var9.field_i != 28) {
                    if (var9.field_i != 25) {
                      if (var9.field_i != 1 &&
                        var9.field_i != 21 &&
                        22 != var9.field_i) {
                        if (26 == var9.field_i &&
                          var9.field_R != 27) {
                          var7 = 11;
                        } else {
                          if (19 == var9.field_i &&
                            sh.field_a != 1) {
                            var7 = 11;
                          } else {
                            if (var9.field_i == 20 &&
                              sh.field_a != 2) {
                              var7 = 11;
                            } else {
                              if (((var9.field_i == 27)) &&
                                ((var9.field_R != 26))) {
                                var7 = 12;
                              }
                            }
                          }
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        var7 = 11;
                      }
                    } else {
                      var7 = 9;
                    }
                  } else {
                    var7 = 8;
                  }
                } else {
                  var7 = 2;
                }
                if (0 == param4.field_J ||
                  0 != (1 << var9.field_i & sg.field_n)) {
                  param1.a(new qc(var7), (byte) 3);
                }
              }
              if (param4.field_J == 0 &&
                var9.field_R == 0) {
                if (1 == this.field_k) {
                  param0.a(10 + param4.field_B, var9, 2);
                }
                param4.field_B = param4.field_B + 1;
              }
            }
          }
          this.a(param4, -1, param0);
          if (dj.field_c == null) {
            return false;
          }
          if (param4.field_J == 0) {
            return true;
          }
          if (dj.field_c == param0.field_yb) {
            return true;
          }
          var10 = (on) (dj.field_c);
          stackIn_99_0 = ((1 & var10.field_N) != 0);
          return stackIn_99_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_104_0 = var6;
          stackIn_104_1 = new StringBuilder().append("ak.B(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          stackIn_107_1 = ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',');
          if (param1 == null) {
            stackIn_108_2 = "null";
          } else {
            stackIn_108_2 = "{...}";
          }
          stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        int var2;
        if (param0 < 75) {
          field_e = (String) null;
        }
        var2 = ~(this.field_g | this.field_a | this.field_i) & -1 + (1 << this.field_k);
        if (var2 == 0) {
          this.a(false);
        } else {
          if (wn.a(var2, (byte) -6)) {
            this.field_h = ed.b(9, var2 - 1);
            this.field_a = this.field_a | 1 << this.field_h;
            this.a(false);
          }
        }
        return this.field_c;
    }

    ak(String[] param0, int param1, oi param2, int[] param3, int[] param4) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        vo stackIn_8_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        try {
          this.field_k = param0.length;
          this.field_f = param0;
          this.field_b = param2;
          this.field_l = new j[this.field_k];
          stackIn_4_0 = (this.field_k >= 2) ? 306 : 510;
          var6_int = stackIn_4_0;
          var7 = 0;
          for (var8 = 0; this.field_k > var8; var8++) {
            this.field_l[var8] = new j(var6_int, var8 * 30, var7, param3[var8], param4[var8]);
            stackIn_8_0 = this.field_l[var8].field_yb;
            if (1 < this.field_k) {
              stackIn_9_1 = 102400;
            } else {
              stackIn_9_1 = 114688;
            }
            stackIn_8_0.field_m = stackIn_9_1;
            if ((param1 & 1 << var8) != 0) {
              var7++;
            }
          }
          this.field_m = new int[this.field_k];
          this.field_h = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("ak.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param4 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
        field_e = "Create unrated game";
    }
}
