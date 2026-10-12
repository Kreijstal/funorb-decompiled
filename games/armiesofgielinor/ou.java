/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ou {
    static int field_c;
    static String field_f;
    static char[] field_a;
    static DiskCacheWorker field_h;
    private NodeDeque[][] field_i;
    private MapLayout[] field_b;
    static String field_g;
    private ResourceArchive[] field_e;
    private boolean field_d;
    static String field_j;

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          field_g = null;
          if (param0 != 4116) {
            ou.a(-15);
          }
          field_h = null;
          field_f = null;
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "ou.A(" + param0 + ')');
        }
    }

    final static void a(boolean param0) {
        fh.field_i = false;
        ac.field_n = false;
        if (!param0) {
          return;
        }
        try {
          gl.a(127, -1);
          oh.field_L = nb.field_i;
          mh.field_b = nb.field_i;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ou.M(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, ResourceArchive param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 24402) {
            this.field_d = false;
          }
          if (null != this.field_e &&
            2 <= this.field_e.length) {
            if (param1 != 0 &&
              param1 != 1) {
              return;
            }
            if (df.field_M <= 0 &&
              param1 == 1 &&
              !this.field_d) {
              return;
            }
            this.field_e[param1] = param2;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ou.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void b(byte param0) {
        if (param0 <= 114) {
          return;
        }
        try {
          vi.a("", 640, (String) null);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ou.D(" + param0 + ')');
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        NodeIterator var6 = null;
        MapLayout var7 = null;
        int var8 = 0;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.field_i != null &&
            param2 >= 0 &&
            this.field_i.length > param2) {
            if (this.field_i[param2] != null &&
              param1 >= 0 &&
              this.field_i[param2].length > param1) {
              if (null == this.field_i[param2][param1]) {
                stackIn_25_0 = 0;
                return stackIn_25_0;
              }
              var5_int = param0;
              var6 = new NodeIterator(this.field_i[param2][param1]);
              var7 = (MapLayout) (var6.first(param0 + 50));
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (null == var7))) {
                stackIn_36_0 = var7.field_k;
                if (var8 == 0) {
                  if (stackIn_36_0 >= param3) {
                    var5_int++;
                  }
                  var7 = (MapLayout) (var6.next(param0 + 50));
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_36_0 = var5_int;
              }
              return stackIn_36_0;
            }
            stackIn_20_0 = 0;
            return stackIn_20_0;
          }
          stackIn_9_0 = 0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var5), "ou.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0) {
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_b = new MapLayout[wn.field_eb.length];
          var2_int = 0;
          if (param0 <= 110) {
            this.a((byte) -41);
          }
          while (wn.field_eb.length > var2_int) {
            var3 = this.field_e[0].getFileByName(wn.field_eb[var2_int], 35, "");
            if (var4 != 0) {
              return;
            }
            if (var3 != null &&
              var3.length != 0) {
              this.field_b[var2_int] = new MapLayout(-1, var3);
              var2_int++;
              continue;
            } else {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ou.F(" + param0 + ')');
        }
    }

    final MapLayout a(int param0, int param1, int param2, int param3, int param4) {
        Object stackIn_12_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_42_0 = null;
        MapLayout stackIn_45_0 = null;
        Object stackIn_50_0 = null;
        MapLayout stackIn_67_0 = null;
        RuntimeException decompiledCaughtException = null;
        NodeIterator var6 = null;
        RuntimeException var6_ref = null;
        MapLayout var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != this.field_i &&
            param3 >= 0 &&
            param3 < this.field_i.length &&
            AttackEvent.field_A.length > param3) {
            if (null != this.field_i[param3] &&
              0 <= param2 &&
              param2 < this.field_i[param3].length) {
              if (this.field_i.length == AttackEvent.field_A.length &&
                AttackEvent.field_A[param3].length == this.field_i[param3].length) {
                if (param3 == 1 &&
                  !this.field_d &&
                  df.field_M < 0) {
                  stackIn_42_0 = null;
                  return (MapLayout) (stackIn_42_0);
                }
                if (param1 != 4136) {
                  stackIn_45_0 = (MapLayout) null;
                  return stackIn_45_0;
                }
                if (null == this.field_i[param3][param2]) {
                  stackIn_50_0 = null;
                  return (MapLayout) (stackIn_50_0);
                }
                var6 = new NodeIterator(this.field_i[param3][param2]);
                var7 = (MapLayout) (var6.first(param1 - 4086));
                var8 = 0;
                while (var7 != null) {
                  if (!(param0 <= var7.field_k) ||
                    ~var8 != ~param4 ||
                    var9 != 0) {
                    if (param0 <= var7.field_k) {
                      var8++;
                    }
                    var7 = (MapLayout) (var6.next(50));
                    if (var9 == 0) {
                      continue;
                    }
                  }
                  break;
                }
                stackIn_67_0 = var7;
                return stackIn_67_0;
              }
              stackIn_31_0 = null;
              return (MapLayout) (stackIn_31_0);
            }
            stackIn_23_0 = null;
            return (MapLayout) (stackIn_23_0);
          }
          stackIn_12_0 = null;
          return (MapLayout) (stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var6_ref), "ou.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(pu param0, boolean param1, boolean param2, boolean param3, boolean param4, int[] param5, int[] param6) {
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_78_2 = null;
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
        var30 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param6[3] >> 2;
          var22 = param6[4] >> 2;
          var23 = param6[5] >> 2;
          var24 = param6[6] >> 2;
          var25 = param6[7] >> 2;
          var26 = param6[8] >> 2;
          var27 = param6[9] >> 2;
          var28 = param6[10] >> 2;
          var12 = param5[3] * var21 + param5[4] * var22 + param5[5] * var23 >> 14;
          var29 = param6[11] >> 2;
          var13 = param5[5] * var26 + (var25 * param5[4] + var24 * param5[3]) >> 14;
          var18 = var22 * param5[10] + var21 * param5[9] + var23 * param5[11] >> 14;
          var16 = var24 * param5[6] + param5[7] * var25 + param5[8] * var26 >> 14;
          var17 = var29 * param5[8] + (param5[6] * var27 + var28 * param5[7]) >> 14;
          var14 = param5[5] * var29 + var27 * param5[3] + var28 * param5[4] >> 14;
          var15 = param5[7] * var22 + (param5[6] * var21 + param5[8] * var23) >> 14;
          var19 = param5[9] * var24 + (param5[10] * var25 + var26 * param5[11]) >> 14;
          var20 = param5[10] * var28 + var27 * param5[9] + var29 * param5[11] >> 14;
          var21 = -param6[0] + param5[0];
          var22 = -param6[1] + param5[1];
          var23 = param5[2] - param6[2];
          var9 = param6[5] * var23 + (param6[4] * var22 + param6[3] * var21) >> -fn.field_M + 16;
          if (!param2) {
            return;
          }
          var11 = var23 * param6[11] + var22 * param6[10] + var21 * param6[9] >> 16;
          var10 = param6[6] * var21 + param6[7] * var22 + param6[8] * var23 >> -fn.field_M + 16;
          var21 = TriangleRasterizer.projectionCenterX;
          var22 = TriangleRasterizer.projectionCenterY;
          var23 = 0;
          scanLoop1: while (true) {
            if (var23 < param0.field_O) {
              var24 = param0.field_z[var23];
              var25 = param0.field_y[var23];
              var26 = param0.field_o[var23];
              var27 = (var18 * var26 + (var24 * var12 + var25 * var15) >> -fn.field_M + 16) + var9;
              var28 = (var13 * var24 + var25 * var16 + var19 * var26 >> -fn.field_M + 16) + var10;
              var29 = (var26 * var20 + var25 * var17 + var14 * var24 >> 16) + var11;
              stackIn_59_0 = 50;
              stackIn_59_1 = var29;
              if (var30 != 0) {
                if (stackIn_59_0 > stackIn_59_1) {
                  if (var18 >= ArmiesOfGielinor.field_I.length) {
                    break scanLoop1;
                  }
                  var19 = param0.field_l[var18];
                  var20 = param0.field_f[var18];
                  var21 = param0.field_x[var18];
                  ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 + var21 * var15) >> 16;
                  Widget.field_m[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                  rj.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                  var18++;
                  break scanLoop1;
                }
                break scanLoop1;
              }
              if (stackIn_59_0 > stackIn_59_1) {
                ls.field_c[var23] = -2147483648;
              } else {
                TileMetadata.field_f[var23] = var21 + var27 / var29;
                fa.field_k[var23] = var28 / var29 + var22;
                ls.field_c[var23] = var29;
                if (var29 > var8) {
                  var8 = var29;
                }
                if (var7_int > var29) {
                  var7_int = var29;
                }
              }
              if (param4) {
                uh.field_f[var23] = var27 >> fn.field_M;
                ArchiveProvider.field_a[var23] = var28 >> fn.field_M;
                qt.field_c[var23] = var29;
              }
              var23++;
              continue;
            }
            if (null != param0.field_g &&
              param0.field_M != null &&
              param0.field_v != null &&
              param0.field_N != null &&
              null != param0.field_a &&
              param0.field_n != null &&
              param0.field_m != null &&
              param0.field_F != null &&
              param0.field_I != null) {
              var23 = 0;
              while (!(var23 >= param0.field_q)) {
                var24 = param0.field_g[var23];
                var25 = param0.field_M[var23];
                var26 = param0.field_v[var23];
                UiSelectionState.field_c[var23] = (var26 * var18 + (var24 * var12 + var15 * var25) >> 16) + var9;
                AiActionCandidate.field_p[var23] = (var26 * var19 + var13 * var24 + var16 * var25 >> 16) + var10;
                uq.field_u[var23] = (var24 * var14 + (var17 * var25 + var26 * var20) >> 16) + var11;
                var24 = param0.field_N[var23];
                var25 = param0.field_a[var23];
                var26 = param0.field_n[var23];
                ju.field_c[var23] = (var18 * var26 + (var12 * var24 + var15 * var25) >> 16) + var9;
                ji.field_c[var23] = var10 + (var13 * var24 + (var16 * var25 + var26 * var19) >> 16);
                fl.field_f[var23] = (var26 * var20 + var24 * var14 + var25 * var17 >> 16) + var11;
                var24 = param0.field_m[var23];
                var25 = param0.field_F[var23];
                var26 = param0.field_I[var23];
                dj.field_b[var23] = (var26 * var18 + var12 * var24 + var15 * var25 >> 16) + var9;
                li.field_k[var23] = var10 + (var16 * var25 + var24 * var13 + var19 * var26 >> 16);
                is.field_e[var23] = var11 + (var26 * var20 + (var25 * var17 + var24 * var14) >> 16);
                var23++;
                if (var30 != 0) {
                  return;
                }
              }
            }
            if (param1) {
              var9 = param5[3];
              var10 = param5[4];
              var11 = param5[5];
              var12 = param5[6];
              var13 = param5[7];
              var14 = param5[8];
              var15 = param5[9];
              var16 = param5[10];
              var17 = param5[11];
              var18 = 0;
              do {
                stackIn_59_0 = param0.field_t;
                stackIn_59_1 = var18;
                if (stackIn_59_0 <= stackIn_59_1) {
                  break;
                }
                if (var18 >= ArmiesOfGielinor.field_I.length) {
                  break;
                }
                var19 = param0.field_l[var18];
                var20 = param0.field_f[var18];
                var21 = param0.field_x[var18];
                ArmiesOfGielinor.field_I[var18] = var12 * var20 + (var19 * var9 + var21 * var15) >> 16;
                Widget.field_m[var18] = var16 * var21 + var10 * var19 + var20 * var13 >> 16;
                rj.field_Q[var18] = var14 * var20 + (var11 * var19 + var17 * var21) >> 16;
                var18++;
              } while (var30 == 0);
            }
            break;
          }
          et.a(param0, -10, param3, var7_int, var8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("ou.L(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_77_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param6 == null) {
            stackIn_78_2 = "null";
          } else {
            stackIn_78_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_77_1).append(stackIn_78_2).append(')').toString());
        }
    }

    private final int b(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackIn_23_0Lifetime1;
        int stackIn_23_1Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3_int = -1;
          var4 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var4 <= 1) {
              stackIn_31_0 = -1;
              stackIn_31_1 = ~var4;
              if (var6 != 0) {
                break scanLoop1;
              }
              if (stackIn_31_0 >= stackIn_31_1 &&
                var4 < lp.field_a.length) {
                var5 = 0;
                while (lp.field_a[var4].length > var5) {
                  stackIn_23_0 = ~lp.field_a[var4][var5];
                  stackIn_23_1 = ~param1;
                  if (stackIn_23_0 == stackIn_23_1) {
                    var3_int = var4;
                  } else {
                    var5++;
                    continue;
                  }
                  break;
                }
                stackIn_23_0Lifetime1 = 0;
                stackIn_23_1Lifetime1 = var3_int;
                decompiledFrameRemainder0 = (!(stackIn_23_0Lifetime1 <= stackIn_23_1Lifetime1) ||
                  var6 != 0);
                if (decompiledFrameRemainder0) {
                  var4++;
                  continue scanLoop1;
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_11_0 = -1;
                return stackIn_11_0;
              }
            }
            stackIn_31_0 = param0;
            stackIn_31_1 = var3_int;
            break;
          }
          if (stackIn_31_0 != stackIn_31_1 &&
            1 != var3_int) {
            stackIn_38_0 = -1;
            return stackIn_38_0;
          }
          stackIn_40_0 = var3_int;
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final ResourceArchive a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_5_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_30_0 = null;
        ResourceArchive stackIn_32_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e != null &&
            this.field_e.length == 2) {
            if (param1 >= 0 &&
              AttackEvent.field_A.length > param1) {
              var3_int = this.b(0, param1);
              if (~var3_int != param0 &&
                var3_int != 1) {
                stackIn_21_0 = null;
                return (ResourceArchive) (stackIn_21_0);
              }
              if (var3_int == 1 &&
                !this.field_d &&
                0 >= df.field_M) {
                stackIn_30_0 = null;
                return (ResourceArchive) (stackIn_30_0);
              }
              stackIn_32_0 = this.field_e[var3_int];
              return stackIn_32_0;
            }
            stackIn_13_0 = null;
            return (ResourceArchive) (stackIn_13_0);
          }
          stackIn_5_0 = null;
          return (ResourceArchive) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        NodeDeque[] array$1 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.field_i = new NodeDeque[AttackEvent.field_A.length][];
          var2_int = 35 / ((70 - param0) / 47);
          var3 = 0;
          while (var3 < AttackEvent.field_A.length) {
            array$1 = new NodeDeque[AttackEvent.field_A[var3].length];
            this.field_i[var3] = array$1;
            var3++;
            if (var4 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "ou.N(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != 0 &&
            param1 != 1) {
            return;
          }
          if (0 >= df.field_M &&
            param1 == 1 &&
            !this.field_d) {
            return;
          }
          var3 = lp.field_a[param1];
          if (param0) {
            field_h = (DiskCacheWorker) null;
          }
          var4 = 0;
          while (var4 < var3.length) {
            boolean decompiledFrameCompleted0 = true;
            var5 = var3[var4];
            if (var5 >= 0 && (!(var5 >= AttackEvent.field_A.length) ||
              var8 != 0)) {
              var6 = AttackEvent.field_A[var5].length;
              var7 = 0;
              while (var6 > var7) {
                this.a(5301, var7, var5);
                var7++;
                if (var8 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              var4++;
            }
            if (var8 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "ou.B(" + param0 + ',' + param1 + ')');
        }
    }

    final MapLayout a(byte param0, int param1) {
        RuntimeException var3 = null;
        MapLayout stackIn_4_0 = null;
        MapLayout stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < this.field_b.length) {
            stackIn_4_0 = this.field_b[param1];
            return stackIn_4_0;
          }
          if (param0 != 59) {
            field_c = 32;
          }
          stackIn_9_0 = this.field_b[0];
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3), "ou.E(" + param0 + ',' + param1 + ')');
        }
    }

    ou(ResourceArchive param0, ResourceArchive param1, boolean param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_e = new ResourceArchive[2];
          this.field_d = param2;
          this.a(24402, 0, param0);
          this.a(24402, 1, param1);
          this.b(-127);
          this.a(false, 0);
          this.a(false, 1);
          this.a((byte) 111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ou.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int param2) {
        ResourceArchive var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        byte[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4 = this.a(param0 ^ -5302, param2);
          if (param0 != 5301) {
            return;
          }
          if (var4 == null) {
            return;
          }
          this.field_i[param2][param1] = new NodeDeque();
          var5 = 0;
          while (AttackEvent.field_A[param2][param1].length > var5) {
            var6 = var4.getFileByName(AttackEvent.field_A[param2][param1][var5], param0 - 5249, "");
            if (var6 != null && (var6.length != 0 ||
              var7 != 0)) {
              this.field_i[param2][param1].addLast((byte) -119, (IntrusiveNode) (new MapLayout(var5, var6)));
            }
            var5++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4_ref), "ou.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_a = new char[]{'€', '\0', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\0', 'Ž', '\0', '\0', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\0', 'ž', 'Ÿ'};
        field_f = "Played";
        field_c = 0;
        field_g = "Hide lobby chat";
        field_j = "Equipment Stock";
    }
}
