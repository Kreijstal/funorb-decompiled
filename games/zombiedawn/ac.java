/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac extends al {
    static String field_o;
    private jp field_n;
    private int[] field_p;
    static int field_t;
    static int field_m;
    private jp field_s;
    static boolean field_r;
    static ll field_q;

    private final void a(byte param0, int param1) {
        int var3 = 0;
        this.b(false, 2);
        if (param0 != 0) {
          this.a((byte) -7, true);
        }
        if (-1 == param1) {
          var3 = sh.field_a + 2;
          this.a(sh.field_a, (byte) -126);
          qn.field_b = 15;
          this.field_h = this.field_p;
          this.field_b = this.field_n;
          qn.field_h = false;
          this.field_b.a(this.field_s.field_j, (byte) -95, this.b(true, ha.field_b, ei.field_K), var3);
          sh.field_a = -1;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (be.field_j <= 0 &&
          sh.field_a == -1) {
          param2 -= 80;
          if (qg.field_a[2] < param0 &&
            param0 < qg.field_a[2] + u.field_d[2] &&
            to.field_c[2] < param2 &&
            dd.field_a[2] + to.field_c[2] > param2 ||
            !(param0 <= qg.field_a[3]) &&
            !(param0 >= u.field_d[3] + qg.field_a[3]) &&
            !(to.field_c[3] >= param2) &&
            !(to.field_c[3] + dd.field_a[3] <= param2)) {
            this.a((byte) 0, 4);
          }
        }
        if (param1 != 32526) {
          field_o = (String) null;
        }
    }

    private final boolean a(int param0, int param1, int param2) {
        int var4 = -44 / ((param2 - 48) / 57);
        return param0 < 4 ? true : false;
    }

    final int b(boolean param0, int param1, int param2) {
        boolean stackIn_7_0 = false;
        int stackIn_15_0 = 0;
        boolean stackOut_6_0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = ZombieDawn.field_J;
        param2 = param2 - id.field_M;
        param1 = param1 - vh.field_b;
        if (qn.field_b != 0) {
          return -1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (-1 == sh.field_a) {
          param2 -= 80;
          var4 = -1;
          var5 = 3;
          while (true) {
            if (0 <= var5) {
              var6 = 80;
              var7 = 130;
              stackOut_6_0 = this.a(var5 + 2, -1, 110);
              stackIn_15_0 = stackOut_6_0 ? 1 : 0;
              stackIn_7_0 = stackOut_6_0;
              if (var8 == 0) {
                if (stackIn_7_0 &&
                  -var6 + qg.field_a[var5] < param1 &&
                  (var6 + qg.field_a[var5]) > param1 &&
                  param2 > to.field_c[var5] &&
                  param2 < to.field_c[var5] + var7) {
                  var4 = var5;
                }
                var5--;
                continue;
              }
            } else {
              stackIn_15_0 = 0;
            }
            break;
          }
          if (stackIn_15_0 <= var4) {
            return 2 + var4;
          }
          param2 += 80;
          decompiledFrameRemainder0 = (var8 != 0);
        }
        if (decompiledFrameRemainder0) {
          var4Lifetime1 = 178;
          var5Lifetime1 = (param2 - var4Lifetime1) / 29;
          if (param2 < var4Lifetime1 ||
            var5Lifetime1 < 0 ||
            var5Lifetime1 > 6 ||
            200 > param1 ||
            param1 > 440) {
            var5Lifetime1 = -1;
          }
          if (var5Lifetime1 != -1 &&
            this.a(3 + var5Lifetime1, sh.field_a, 126)) {
            return var5Lifetime1 + 3;
          }
          if (param1 > (wi.field_c - 11) &&
            (wi.field_c + 29) > param1 &&
            param2 > 120 &&
            param2 < 160) {
            return 2;
          }
        }
        if (!param0) {
          ac.d(-64);
        }
        if (this.field_k < param2 &&
          param2 < (this.field_k + 34) &&
          this.field_g < param1 &&
          param1 < this.field_g + this.field_i) {
          return 0;
        }
        return -1;
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = ZombieDawn.field_J;
        super.a((byte) -127, param1);
        if (qn.field_b != 0) {
          if (qn.field_h) {
            qn.field_b = qn.field_b + 1;
            if (16 != qn.field_b) {
              return;
            }
            sh.field_a = kd.field_Db;
            this.a(-1, (byte) -115);
            cc.field_k.a();
            bi.h(3, 3, 0, 0, 640, 341);
            cn.field_f.b(-124);
            qn.field_b = 0;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            qn.field_b = qn.field_b - 1;
            return;
          }
        }
        int fieldTemp$0 = wm.field_e + 1;
        wm.field_e = wm.field_e + 1;
        if (fieldTemp$0 == 50) {
          wm.field_e = 0;
        }
        var3 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (4 <= var3))) {
          stackIn_25_0 = bn.field_i;
          stackIn_25_1 = var3;
          if (var5 == 0) {
            if (stackIn_25_0 == stackIn_25_1) {
              aa.field_a[var3] = aa.field_a[var3] + 30;
            } else {
              aa.field_a[var3] = aa.field_a[var3] - 30;
            }
            if (aa.field_a[var3] < 128) {
              aa.field_a[var3] = 128;
            }
            if (aa.field_a[var3] > 256) {
              aa.field_a[var3] = 256;
            }
            var3++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          fieldTemp$1 = ti.field_b + 1;
          ti.field_b = ti.field_b + 1;
          stackIn_25_0 = 50;
          stackIn_25_1 = fieldTemp$1;
        }
        if (stackIn_25_0 <= stackIn_25_1) {
          ti.field_b = 0;
        }
        var3Lifetime1 = this.field_b.field_d;
        if (2 <= var3Lifetime1) {
          if (var3Lifetime1 - 2 != bn.field_i) {
            kl.e(var3Lifetime1 - 2, 16777045);
            if (var5 != 0) {
              bn.field_i = -1;
            }
          }
        } else {
          bn.field_i = -1;
        }
        var4 = -54 % ((-39 - param0) / 61);
        return;
    }

    ac(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6, int[] param7) {
        super(param0, param1, param2, param3, param4, param5, param6);
        try {
          this.field_p = this.field_h;
          this.field_n = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ac.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0, int param1) {
        np.field_E.b(vh.field_b, param1 + (id.field_M + 5));
        this.a(!this.a(2, -1, 123) ? true : false, 0, 82, param1);
        this.a(!this.a(3, -1, 123) ? true : false, 1, 82, param1);
        if (1 == bn.field_i &&
          to.field_b[0] < 13 &&
          to.field_b[1] == 0) {
          bj.field_q.a(ch.field_c, qg.field_a[1] + (vh.field_b - 90), 170 + (to.field_c[1] + id.field_M), 240, 180, 16777215, 0, 1, 1, 0);
        }
        int var3 = -98 % ((param0 + 19) / 51);
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_13_0 = 0;
        vn var6;
        int var7;
        int var8;
        int var9;
        vn var10;
        vn var11;
        int var7Lifetime1;
        var9 = ZombieDawn.field_J;
        var10 = f.field_d;
        var11 = var10;
        var6 = jb.field_a[param1 + 1];
        jb.field_a[0].e(qg.field_a[param1] + vh.field_b, 73 + to.field_c[param1] + (id.field_M + param3), 96);
        if (~param1 == ~bn.field_i) {
          var10.b(qg.field_a[param1] + vh.field_b, param3 + to.field_c[param1] + id.field_M, 248, 16776960);
          var6.d(2 + (vh.field_b + qg.field_a[param1]), 1 + (param3 + id.field_M + to.field_c[param1]), 256);
          cc.field_b.b(qg.field_a[param1] + (vh.field_b - 10), id.field_M + to.field_c[param1] + (-10 + param3), wd.field_z[ti.field_b]);
          if (var9 != 0) {
            if (param0) {
              var10.d(qg.field_a[param1] + vh.field_b, param3 + (to.field_c[param1] + id.field_M), 100);
              var10.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
              var6.d(qg.field_a[param1] + (vh.field_b + 2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
            } else {
              var10.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
              var6.d(qg.field_a[param1] + (vh.field_b + 2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
            }
          }
        } else {
          if (param0) {
            var10.d(qg.field_a[param1] + vh.field_b, param3 + (to.field_c[param1] + id.field_M), 100);
            if (var9 != 0) {
              var10.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
              var6.d(qg.field_a[param1] + (vh.field_b + 2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
            }
          } else {
            var10.d(qg.field_a[param1] + vh.field_b, param3 + (id.field_M + to.field_c[param1]), 200);
            var6.d(qg.field_a[param1] + (vh.field_b + 2), 1 + (id.field_M - (-to.field_c[param1] - param3)), 140);
          }
        }
        if (!param0 &&
          aa.field_a[param1] != 0) {
          stackIn_13_0 = (bn.field_i == param1) ? 2 : 0;
          var7 = stackIn_13_0;
          sg.field_jb.b(q.field_G[param1], 8 + vh.field_b + qg.field_a[param1], var10.field_t + (param3 + to.field_c[param1] + (id.field_M + 20)), var7, -1, aa.field_a[param1]);
        }
        if (param0 &&
          param1 == this.b(true, ha.field_b, ei.field_K)) {
          sg.field_jb.b(q.field_G[param1], 8 + (qg.field_a[param1] + vh.field_b), to.field_c[param1] + (id.field_M + param3) + (var11.field_t + 20), 0, -1, aa.field_a[param1]);
        }
        if (param2 != 82) {
          field_o = (String) null;
        }
        if (param1 == bn.field_i &&
          !this.field_b.field_j) {
          if (-1 != hn.field_q[param1]) {
            ah.field_tb.c(-20 + vh.field_b + qg.field_a[param1], param3 + id.field_M + to.field_c[param1] + 17);
          }
          if (pd.field_a[param1] != -1 &&
            this.a(param1 + 3, -1, 117)) {
            ah.field_tb.b(vh.field_b - (-qg.field_a[param1] - 55), id.field_M - (-to.field_c[param1] - param3 - 17));
          }
        }
        if (be.field_j <= 0) {
          var7Lifetime1 = wm.field_e;
          var8 = 12 + wm.field_e;
          if (param1 == 1) {
            wd.field_y.b(vh.field_b + (qg.field_a[param1] + 2), param3 + (id.field_M + to.field_c[param1]) - 17, 50 + wd.field_z[var7Lifetime1] / 2);
          }
          if (var8 >= 50) {
            var8 -= 50;
          }
          if (param1 == 2) {
            wd.field_y.b(2 + qg.field_a[param1] + vh.field_b, -17 + (param3 + id.field_M) + to.field_c[param1], 50 + wd.field_z[var8] / 2);
          }
        }
    }

    final void e(byte param0) {
        if (qn.field_b != 0) {
          return;
        }
        int var2 = 22 / ((param0 + 83) / 42);
        ca.a(false, true, df.field_i);
    }

    final static boolean d(int param0) {
        if (param0 != 50) {
          field_r = true;
        }
        return dk.field_ac;
    }

    public static void d(byte param0) {
        field_q = null;
        field_o = null;
        if (param0 > -90) {
          field_r = false;
        }
    }

    final void a(int param0) {
        jp stackIn_39_0 = null;
        int stackIn_40_1 = 0;
        jp stackIn_60_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        jp stackIn_81_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_112_1 = 0;
        jp stackIn_113_0 = null;
        int stackIn_118_0 = 0;
        int stackIn_129_1 = 0;
        jp stackIn_131_0 = null;
        int stackIn_142_0 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0 != -31645) {
          ac.d((byte) -3);
        }
        var2 = this.field_b.field_d;
        if (kg.field_i == 48 &&
          bo.field_p[82] &&
          lo.field_j >= 2) {
          to.field_b[0] = 27;
        }
        if (69 == kg.field_i &&
          bo.field_p[82] &&
          2 <= lo.field_j) {
          to.field_b[0] = 0;
        }
        boolean decompiledFrameRemainder3 = true;
        boolean decompiledFrameRemainder0 = true;
        if (sh.field_a == -1) {
          if (kg.field_i == 96) {
            boolean decompiledSharedTail0 = !(var2 < 2);
            if (!decompiledSharedTail0) {
              this.field_b.b(0, -92);
              decompiledSharedTail0 = (var4 != 0);
            }
            if ((decompiledSharedTail0) &&
              (var2 > 2)) {
              this.field_b.b(this.field_b.field_d - 1, 60);
            }
          }
          if (kg.field_i == 97) {
            if (var2 >= 2) {
              if (5 > var2 &&
                this.a(var2 + 1, -1, -23)) {
                this.field_b.b(var2 + 1, param0 + 31525);
                if (var4 != 0) {
                  this.field_b.b(0, -76);
                }
              }
            } else {
              this.field_b.b(0, -76);
            }
          }
          if (kg.field_i == 99) {
            if (var2 >= 2) {
              ao.field_J = var2;
            }
            this.field_b.b(0, 86);
          }
          decompiledFrameRemainder0 = (98 == kg.field_i);
          if (decompiledFrameRemainder0) {
            if (var2 == -1) {
              this.field_b.b(0, 56);
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameRemainder0 = !(var2 >= 2))) {
              stackIn_39_0 = this.field_b;
              if (ao.field_J > 1 &&
                ao.field_J < 6) {
                stackIn_40_1 = ao.field_J;
              } else {
                stackIn_40_1 = 2;
              }
              ((jp) (Object) stackIn_39_0).b(stackIn_40_1, 46);
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
        }
        if (decompiledFrameRemainder0) {
          var3 = ao.field_J;
          if ((99 == kg.field_i ||
            kg.field_i == 98) && (var2 == 0 ||
            var2 == 1)) {
            ao.field_J = var2;
          }
          boolean decompiledFrameRemainder2 = true;
          if (kg.field_i == 98) {
            if (var2 < 0) {
              this.field_b.b(0, 50);
            }
            if (!(var2 < 0) ||
              var4 != 0) {
              L21: while (true) {
                if (this.field_b.field_d != 0 &&
                  this.field_b.field_d != 1) {
                  if (this.field_b.field_d != 2) {
                    this.field_b.b(this.field_b.field_d - 1, -89);
                    if (var4 != 0) {
                      stackIn_60_0 = this.field_b;
                      if (0 != var3 &&
                        var3 != 1) {
                        stackIn_62_1 = 0;
                      } else {
                        stackIn_62_1 = var3;
                      }
                      ((jp) (Object) stackIn_60_0).b(stackIn_62_1, 116);
                      this.field_b.b(-1 + this.field_b.field_h, 120);
                    }
                  } else {
                    stackIn_60_0 = this.field_b;
                    if (0 != var3 &&
                      var3 != 1) {
                      stackIn_62_1 = 0;
                    } else {
                      stackIn_62_1 = var3;
                    }
                    ((jp) (Object) stackIn_60_0).b(stackIn_62_1, 116);
                    if (var4 != 0) {
                      this.field_b.b(-1 + this.field_b.field_h, 120);
                    }
                  }
                } else {
                  this.field_b.b(-1 + this.field_b.field_h, 120);
                }
                stackIn_65_0 = this.a(this.field_b.field_d, sh.field_a, 108) ? 1 : 0;
                do {
                  if (stackIn_65_0 == 0) {
                    continue L21;
                  }
                  stackIn_65_0 = 99;
                  stackIn_67_0 = stackIn_65_0;
                } while (var4 != 0);
                break;
              }
              decompiledFrameRemainder2 = false;
            }}
          if (decompiledFrameRemainder2) {
            while (true) {
              stackIn_142_0 = 99;
              if (var4 == 0) {
                stackIn_67_0 = stackIn_142_0;
                break;
              }
              while (stackIn_142_0 == 0) {
                if (this.field_b.field_d != 0 &&
                  this.field_b.field_d != 1) {
                  if (this.field_b.field_d != 2) {
                    this.field_b.b(this.field_b.field_d - 1, -89);
                  }
                  stackIn_131_0 = this.field_b;
                  if (0 != var3 &&
                    var3 != 1) {
                    stackIn_129_1 = 0;
                  } else {
                    stackIn_129_1 = var3;
                  }
                  ((jp) (Object) stackIn_131_0).b(stackIn_129_1, 116);
                }
                this.field_b.b(-1 + this.field_b.field_h, 120);
                stackIn_142_0 = this.a(this.field_b.field_d, sh.field_a, 108) ? 1 : 0;
              }
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (stackIn_67_0 == kg.field_i) {
            if (var2 < 0) {
              this.field_b.b(0, param0 ^ 31739);
            }
            if (!(var2 < 0) ||
              var4 != 0) {
              L38: while (true) {
                if (~this.field_b.field_d != ~(this.field_b.field_h - 1)) {
                  if (this.field_b.field_d != 0 &&
                    this.field_b.field_d != 1) {
                    this.field_b.b(this.field_b.field_d + 1, 57);
                    if (var4 != 0) {
                      this.field_b.b(2, param0 + 31538);
                      stackIn_81_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_82_1 = 0;
                      } else {
                        stackIn_82_1 = var3;
                      }
                      ((jp) (Object) stackIn_81_0).b(stackIn_82_1, param0 + 31524);
                    }
                  } else {
                    this.field_b.b(2, param0 + 31538);
                    if (var4 != 0) {
                      stackIn_81_0 = this.field_b;
                      if (var3 != 0 &&
                        var3 != 1) {
                        stackIn_82_1 = 0;
                      } else {
                        stackIn_82_1 = var3;
                      }
                      ((jp) (Object) stackIn_81_0).b(stackIn_82_1, param0 + 31524);
                    }
                  }
                } else {
                  stackIn_81_0 = this.field_b;
                  if (var3 != 0 &&
                    var3 != 1) {
                    stackIn_82_1 = 0;
                  } else {
                    stackIn_82_1 = var3;
                  }
                  ((jp) (Object) stackIn_81_0).b(stackIn_82_1, param0 + 31524);
                }
                stackIn_84_0 = this.a(this.field_b.field_d, sh.field_a, -119) ? 1 : 0;
                do {
                  if (stackIn_84_0 == 0) {
                    continue L38;
                  }
                  stackIn_84_0 = kg.field_i;
                  stackIn_86_0 = stackIn_84_0;
                } while (var4 != 0);
                break;
              }
              decompiledFrameRemainder1 = false;
            }}
          if (decompiledFrameRemainder1) {
            while (true) {
              stackIn_118_0 = kg.field_i;
              if (var4 == 0) {
                stackIn_86_0 = stackIn_118_0;
                break;
              }
              while (stackIn_118_0 == 0) {
                if (~this.field_b.field_d != ~(this.field_b.field_h - 1)) {
                  if (this.field_b.field_d != 0 &&
                    this.field_b.field_d != 1) {
                    this.field_b.b(this.field_b.field_d + 1, 57);
                  }
                  this.field_b.b(2, param0 + 31538);
                }
                stackIn_113_0 = this.field_b;
                if (var3 != 0 &&
                  var3 != 1) {
                  stackIn_112_1 = 0;
                } else {
                  stackIn_112_1 = var3;
                }
                ((jp) (Object) stackIn_113_0).b(stackIn_112_1, param0 + 31524);
                stackIn_118_0 = this.a(this.field_b.field_d, sh.field_a, -119) ? 1 : 0;
              }
            }
          }
          if (stackIn_86_0 != 97 &&
            kg.field_i != 96) {
            this.field_b.g(26);
            decompiledFrameRemainder3 = false;
          }
          else {
            if (var2 == 0) {
              this.field_b.b(1, param0 ^ 31701);
              if ((var4 != 0) && (var2 == 1 ||
                0 > var2)) {
                this.field_b.b(0, 101);
              }
            } else {
              if (var2 == 1 ||
                0 > var2) {
                this.field_b.b(0, 101);
              }
            }
          }
        }
        if (decompiledFrameRemainder3) {
          this.field_b.g(26);
        }

    }

    final static void a(ec param0, boolean param1, java.awt.Component param2, rj param3, int param4, int param5) {
        try {
          wn.a(param4, param3, 1024, param2, param0, param4, param1, -112);
          if (param5 != -97) {
            field_t = 126;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "ac.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        super.a((byte) -65);
        this.e(-124, 80);
        if (qn.field_b != 0) {
          var2 = qn.field_b << 4;
          var3 = var2 * 2;
          if (var3 > 256) {
            var3 = 256;
          }
          var4 = var2 >= 128 ? 2 * (-128 + var2) : 0;
          cc.field_k.c(0, 80, var3, var4);
        }
        hk.field_H.b(vh.field_b, 80 + id.field_M);
        if (param0 >= -35) {
          this.field_s = (jp) null;
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = -9 / ((param1 + 11) / 63);
        cc.field_k = new vn(640, 341);
        cc.field_k.a();
        bi.d();
        this.e(-122, 0);
        cn.field_f.b(13);
    }

    final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = ZombieDawn.field_J;
        if (this.field_h.length <= param1) {
          return;
        }
        if (param2 != -8512) {
          this.a(false, -61, -49);
        }
        boolean decompiledFrameRemainder1 = true;
        boolean decompiledFrameRemainder2 = true;
        boolean decompiledFrameRemainder0 = true;
        var4 = this.field_h[param1];
        var5 = var4;
        if (var5 == 46 &&
          var6 == 0) {
          decompiledFrameRemainder1 = !(!this.field_b.d(-125));
          if (decompiledFrameRemainder1) {
            if (be.field_j <= 0) {
              return;
            }
            ed.a(-11325, 1);
            ca.a(param0, true, 9);
            decompiledFrameRemainder2 = false;
          }
        } else {
          decompiledFrameRemainder0 = (var5 == 45);
        }
        if (((decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (decompiledFrameRemainder0)) &&
          (decompiledFrameRemainder2 = !(!this.field_b.d(-123)))) {
          ed.a(-11325, 0);
          ca.a(param0, true, 9);
          decompiledFrameRemainder2 = (var6 != 0);
        }
        if ((decompiledFrameRemainder2) &&
          (decompiledFrameRemainder1)) {
          super.a(param0, param1, -8512);
        }

    }

    final static void c(int param0) {
        if (vk.field_b != null) {
          return;
        }
        f.field_j = new String[15];
        f.field_j[13] = vd.field_c;
        f.field_j[9] = fm.field_H;
        f.field_j[2] = uj.field_b;
        vk.field_b = new String[47];
        f.field_j[5] = qg.field_h;
        f.field_j[6] = vl.field_k;
        f.field_j[4] = uk.field_b;
        f.field_j[7] = gk.field_H;
        f.field_j[3] = p.field_c;
        vk.field_b[13] = co.field_a;
        vk.field_b[3] = uk.field_b;
        vk.field_b[14] = qg.field_h;
        vk.field_b[5] = ua.field_b;
        vk.field_b[11] = bg.field_n;
        vk.field_b[7] = ui.field_a;
        vk.field_b[2] = p.field_c;
        vk.field_b[1] = sh.field_c;
        vk.field_b[12] = wg.field_l;
        vk.field_b[15] = rc.field_r;
        vk.field_b[0] = po.field_Ab;
        vk.field_b[4] = kj.field_e;
        vk.field_b[16] = uk.field_c;
        vk.field_b[6] = ua.field_b;
        vk.field_b[43] = pa.field_A;
        vk.field_b[10] = ob.field_a[2];
        vk.field_b[39] = "Shouldn't See Me";
        vk.field_b[18] = oe.field_f;
        vk.field_b[38] = oh.field_jb;
        vk.field_b[42] = qc.field_b;
        vk.field_b[21] = pg.field_n;
        vk.field_b[8] = ob.field_a[0];
        vk.field_b[35] = sd.field_a;
        vk.field_b[44] = "";
        vk.field_b[40] = ha.field_c;
        if (param0 != -32435) {
          return;
        }
        vk.field_b[34] = md.field_qb[0];
        vk.field_b[46] = q.field_G[1];
        vk.field_b[37] = wl.field_a[0];
        vk.field_b[20] = vj.field_s;
        vk.field_b[9] = ob.field_a[1];
        vk.field_b[45] = q.field_G[0];
        vk.field_b[19] = hb.field_G;
        vk.field_b[36] = wg.field_o;
        vk.field_b[17] = dm.field_q;
        vk.field_b[41] = vd.field_c;
    }

    private final void b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        if (param0) {
          sh.field_a = -1;
          this.field_h = this.field_p;
          this.field_b = this.field_n;
        }
        bn.field_i = -1;
        var3 = 0;
        while (var3 < 4) {
          aa.field_a[var3] = 128;
          var3++;
          if (var4 != 0) {
            return;
          }
        }
        if (param1 != 2) {
          this.a(-128);
        }
        return;
    }

    static {
        field_m = 0;
        field_r = false;
        field_q = null;
        field_o = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
