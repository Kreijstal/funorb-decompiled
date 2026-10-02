/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends IntrusiveNode {
    int field_l;
    int field_j;
    static boolean field_m;
    int field_h;
    static ue field_i;
    static int[] field_o;
    int field_g;
    int field_n;
    static int field_k;
    int field_f;

    final static void a(int[] param0, int[] param1, nf param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
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
        int var15 = 0;
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
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        var30 = Geoblox.field_C;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var13 = var25 * param1[4] + (param1[3] * var24 + var26 * param1[5]) >> 14;
          var29 = param0[11] >> 2;
          var12 = param1[3] * var21 + var22 * param1[4] + var23 * param1[5] >> 14;
          var18 = param1[11] * var23 + (param1[10] * var22 + param1[9] * var21) >> 14;
          var15 = param1[6] * var21 - (-(param1[7] * var22) - param1[8] * var23) >> 14;
          var16 = var25 * param1[7] + (var24 * param1[6] + var26 * param1[8]) >> 14;
          var14 = var29 * param1[5] + param1[3] * var27 + param1[4] * var28 >> 14;
          var19 = param1[10] * var25 + var24 * param1[9] + param1[11] * var26 >> 14;
          var20 = var27 * param1[9] + var28 * param1[10] + param1[11] * var29 >> 14;
          var17 = param1[8] * var29 + param1[6] * var27 + var28 * param1[7] >> 14;
          var21 = param1[0] - param0[0];
          var22 = -param0[1] + param1[1];
          var23 = param1[2] - param0[2];
          var9 = param0[3] * var21 - (-(var22 * param0[4]) - param0[5] * var23) >> -ok.field_g + 16;
          var10 = var23 * param0[8] + (var21 * param0[6] + var22 * param0[7]) >> 16 - ok.field_g;
          var11 = param0[11] * var23 + var21 * param0[9] + var22 * param0[10] >> 16;
          if (!param3) {
            p.b(-2);
          }
          var21 = mh.field_d;
          var22 = mh.field_i;
          var23 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (param2.field_o > var23) {
                  var24 = param2.field_O[var23];
                  var25 = param2.field_q[var23];
                  var26 = param2.field_K[var23];
                  var27 = (var24 * var12 + var25 * var15 + var18 * var26 >> -ok.field_g + 16) + var9;
                  var28 = var10 + (var13 * var24 + var25 * var16 + var26 * var19 >> 16 - ok.field_g);
                  var29 = var11 + (var26 * var20 + var14 * var24 + var17 * var25 >> 16);
                  stackIn_66_0 = -51;
                  stackIn_66_1 = ~var29;
                  if (var30 != 0) {
                    break L3;
                  }
                  L5: {
                    if (stackIn_66_0 >= stackIn_66_1) {
                      sh.field_x[var23] = var27 / var29 + var21;
                      dj.field_N[var23] = var22 + var28 / var29;
                      if (~var29 > ~var7_int) {
                        var7_int = var29;
                      }
                      if (var8 < var29) {
                        var8 = var29;
                      }
                      CachedArchiveSource.field_j[var23] = var29;
                      if (var30 == 0) {
                        break L5;
                      }
                    }
                    CachedArchiveSource.field_j[var23] = -2147483648;
                  }
                  if (param4) {
                    a.field_c[var23] = var27 >> ok.field_g;
                    uk.field_i[var23] = var28 >> ok.field_g;
                    gf.field_b[var23] = var29;
                  }
                  var23++;
                  if (var30 == 0) {
                    continue L1;
                  }
                }
                L10: {
                  if (null != param2.field_L) {
                    if (param2.field_d != null) {
                      if (param2.field_C != null) {
                        if (param2.field_x != null) {
                          if (null != param2.field_a) {
                            if (param2.field_y != null) {
                              if (param2.field_l != null) {
                                if (null != param2.field_p) {
                                  if (param2.field_b != null) {
                                    var23 = 0;
                                    L11: while (true) {
                                      if (~var23 <= ~param2.field_f) {
                                        break L10;
                                      }
                                      var24 = param2.field_L[var23];
                                      var25 = param2.field_d[var23];
                                      var26 = param2.field_C[var23];
                                      ii.field_d[var23] = (var12 * var24 - (-(var15 * var25) - var18 * var26) >> 16) + var9;
                                      pg.field_d[var23] = var10 + (var26 * var19 + var16 * var25 + var24 * var13 >> 16);
                                      kf.field_a[var23] = (var26 * var20 + (var17 * var25 + var14 * var24) >> 16) + var11;
                                      var24 = param2.field_x[var23];
                                      var25 = param2.field_a[var23];
                                      var26 = param2.field_y[var23];
                                      qf.field_Y[var23] = (var15 * var25 + var12 * var24 + var26 * var18 >> 16) + var9;
                                      ac.field_w[var23] = var10 + (var19 * var26 + var25 * var16 + var13 * var24 >> 16);
                                      vk.field_c[var23] = (var26 * var20 + var24 * var14 + var17 * var25 >> 16) + var11;
                                      var24 = param2.field_l[var23];
                                      var25 = param2.field_p[var23];
                                      var26 = param2.field_b[var23];
                                      qe.field_c[var23] = (var25 * var15 + (var12 * var24 + var26 * var18) >> 16) + var9;
                                      BufferedSocket.thirdVertexTransformedY[var23] = var10 + (var24 * var13 + (var16 * var25 + var19 * var26) >> 16);
                                      hg.field_c[var23] = var11 + (var26 * var20 + var25 * var17 + var14 * var24 >> 16);
                                      var23++;
                                      if (var30 != 0) {
                                        break L2;
                                      }
                                      if (var30 == 0) {
                                        continue L11;
                                      }
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L12: {
                  if (param6) {
                    var9 = param1[3];
                    var10 = param1[4];
                    var11 = param1[5];
                    var12 = param1[6];
                    var13 = param1[7];
                    var14 = param1[8];
                    var15 = param1[9];
                    var16 = param1[10];
                    var17 = param1[11];
                    var18 = 0;
                    L13: while (true) {
                      if (~param2.field_m >= ~var18) {
                        break L12;
                      }
                      stackIn_66_0 = ok.field_h.length;
                      stackIn_66_1 = var18;
                      if (var30 != 0) {
                        break L3;
                      }
                      if (stackIn_66_0 <= stackIn_66_1) {
                        break L12;
                      }
                      var19 = param2.field_M[var18];
                      var20 = param2.field_t[var18];
                      var21 = param2.field_i[var18];
                      ok.field_h[var18] = var21 * var15 + (var12 * var20 + var19 * var9) >> 16;
                      oa.field_f[var18] = var16 * var21 + (var19 * var10 + var20 * var13) >> 16;
                      gi.field_b[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                      var18++;
                      if (var30 == 0) {
                        continue L13;
                      }
                      break L12;
                    }
                  }
                }
                stackIn_66_0 = var7_int;
                stackIn_66_1 = 22;
              }
              i.a(stackIn_66_0, (byte) stackIn_66_1, param2, var8, param5);
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = (RuntimeException) (var7);
          stackIn_71_1 = new StringBuilder().append("p.B(");
          if (param0 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',');
          if (param1 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          stackIn_79_1 = ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(',');
          if (param2 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -21) {
            field_k = 120;
          }
          field_o = null;
          field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "p.A(" + param0 + ')');
        }
    }

    p(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_f = param2;
            this.field_g = param3;
            this.field_n = param5;
            this.field_j = param4;
            this.field_h = param1;
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "p.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            field_i = (ue) null;
          }
          var2 = fh.a(ResourceArchive.a(param0, -48), -78);
          if (null == var2) {
            var2 = "";
          }
          stackIn_6_0 = (String) (var2);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var2_ref);
          stackIn_10_1 = new StringBuilder().append("p.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
