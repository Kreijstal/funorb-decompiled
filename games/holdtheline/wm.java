/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ee {
    int field_P;
    private int field_K;
    private int field_Q;
    int field_T;
    int field_J;
    private int field_M;
    static ll field_U;
    int field_F;
    int field_D;
    private int field_I;
    hj field_H;
    int field_C;
    private ja field_G;
    private int field_R;
    private int[] field_S;
    om field_E;
    int field_O;

    final static void a(boolean param0, boolean param1, int param2) {
        int var4 = HoldTheLine.field_D;
        if (param1) {
            field_U = (ll) null;
        }
        lm.field_a = ej.field_b;
        if (param2 == dg.field_c) {
            if (-2 == (ej.field_b ^ -1)) {
                dg.field_c = 1;
                ((ti) ((Object) l.field_a[1])).f(0);
            }
            ej.field_b = param2;
            return;
        }
        ej.field_b = param2;
        if (13 == dg.field_c || (dg.field_c ^ -1) != 0) {
            ((ec) ((Object) l.field_a[dg.field_c])).d((byte) -116);
        }
        if (ej.field_b == 13 || 0 != (ej.field_b ^ -1)) {
            ((ec) ((Object) l.field_a[ej.field_b])).a((byte) 69, param0);
        }
    }

    final boolean a(int param0, qm param1) {
        float var3_float = 0.0f;
        RuntimeException var3 = null;
        float var4 = 0.0f;
        float var5 = 0.0f;
        float var6 = 0.0f;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this.field_E.field_d) {
                var3_float = (float)(-this.field_A.field_h + param1.field_h);
                var4 = (float)(param1.field_f - this.field_A.field_f);
                var5 = this.field_w.field_g * var4 + this.field_w.field_j * var3_float;
                var6 = var3_float * this.field_w.field_g - var4 * this.field_w.field_j;
                if (Math.abs(var5) >= (float)this.field_E.field_m) {
                  break L1;
                } else {
                  if (Math.abs(var6) >= (float)this.field_E.field_h) {
                    break L1;
                  } else {
                    stackIn_7_0 = 1;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              } else {
                if (this.field_E.field_a * this.field_E.field_a <= (param1.field_f - this.field_A.field_f) * (-this.field_A.field_f + param1.field_f) + (-this.field_A.field_h + param1.field_h) * (-this.field_A.field_h + param1.field_h)) {
                  break L1;
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            if (param0 == 2048) {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              this.a((byte) -59);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("wm.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final void g(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        float var2;
        float var3;
        L0: {
          if (this.field_S != null) {
            fieldTemp$0 = this.field_R - 1;
            this.field_R = this.field_R - 1;
            if (fieldTemp$0 <= 0) {
              L1: {
                fieldTemp$1 = this.field_I + 1;
                this.field_I = this.field_I + 1;
                if (this.field_K <= fieldTemp$1) {
                  this.field_I = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_Q = this.field_S[this.field_I * 2];
              this.field_R = this.field_S[1 + this.field_I * 2];
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if ((4 & this.field_J) == param0) {
            break L2;
          } else {
            this.a(0);
            if (-1 == (this.field_J & 16 ^ -1)) {
              break L2;
            } else {
              this.field_x = this.field_x * o.field_c;
              this.field_t = this.field_t * o.field_c;
              if (this.field_t * this.field_t + this.field_x * this.field_x < 0.25f) {
                this.field_J = this.field_J & -5;
                if ((this.field_J & 1024) == 0) {
                  break L2;
                } else {
                  this.field_J = this.field_J | 2048;
                  this.a(fh.field_d, 98);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L3: {
          if ((8192 & this.field_J) != 0) {
            this.a(false);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 == (this.field_J & 131072)) {
            break L4;
          } else {
            L5: {
              fieldTemp$2 = this.field_C - 1;
              this.field_C = this.field_C - 1;
              if (0 == fieldTemp$2) {
                L6: {
                  this.field_J = this.field_J & -131073;
                  this.field_q = this.field_T;
                  stackIn_22_0 = this;

                  if ((this.field_J & 8) == 0) {
                    stackIn_23_0 = this;
                    stackIn_23_1 = 0;
                    break L6;
                  } else {
                    stackIn_23_0 = this;
                    stackIn_23_1 = 1;
                    break L6;
                  }
                }
                ((wm) (this)).field_z = stackIn_23_1 != 0;
                break L5;
              } else {
                break L5;
              }
            }
            var2 = (float)this.field_C / 150.0f;
            var3 = 0.1428571343421936f * var2 + (-(var2 * (-2.5714285373687744f * var2)) + var2 * -1.7142857313156128f * var2 * var2);
            this.field_A.field_h = this.field_D - (int)(var3 * (float)this.field_P);
            this.field_A.field_f = -(int)(var3 * (float)this.field_O) + this.field_F;
            break L4;
          }
        }
    }

    final hj a(byte param0) {
        if (param0 > -107) {
            this.field_K = -60;
        }
        if ((32 & this.field_J) == 0) {
            this.field_H = this.field_E.field_g[this.field_Q];
        } else {
            this.field_H = this.field_E.field_f[this.field_Q].a(this.field_r, 27788);
        }
        return this.field_H;
    }

    private final void a(boolean param0) {
        int fieldTemp$0 = 0;
        float var2;
        int var3_int;
        float var3;
        ja var4_ref_ja;
        int var4;
        float var5_float;
        int var5;
        float var6_float;
        int var6;
        float var7_float;
        int var7;
        float var8_float;
        int var8;
        float var9_float;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        L0: {
          var16 = HoldTheLine.field_D;
          if ((this.field_M ^ -1) < -1) {
            fieldTemp$0 = this.field_M - 1;
            this.field_M = this.field_M - 1;
            if (-1 != (fieldTemp$0 ^ -1)) {
              break L0;
            } else {
              this.field_J = this.field_J | 2048;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_G != null) {
            break L1;
          } else {
            if ((this.field_J & 2048) != 0) {
              var2 = -1.0f;
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= bl.field_r.field_h) {
                  break L1;
                } else {
                  if (var3_int != (this.field_J & 3)) {
                    var4_ref_ja = bl.field_r.field_C[var3_int];
                    if (var4_ref_ja != null) {
                      if (-1 <= this.field_q + -var4_ref_ja.field_q) {
                        if (this.field_q - var4_ref_ja.field_q <= 1) {
                          var5_float = var4_ref_ja.field_y - this.field_y;
                          var6_float = var4_ref_ja.field_u - this.field_u;
                          var7_float = this.field_w.field_j * var5_float + this.field_w.field_g * var6_float;
                          var8_float = var5_float * this.field_w.field_g - this.field_w.field_j * var6_float;
                          if (2.0f * Math.abs(var8_float) < var7_float) {
                            L3: {
                              var9_float = Math.abs(var8_float) + var7_float;
                              if (null == this.field_G) {
                                break L3;
                              } else {
                                if (var9_float < var2) {
                                  break L3;
                                } else {
                                  var3_int++;
                                  continue L2;
                                }
                              }
                            }
                            this.field_G = var4_ref_ja;
                            var2 = var9_float;
                            var3_int++;
                            continue L2;
                          } else {
                            var3_int++;
                            continue L2;
                          }
                        } else {
                          var3_int++;
                          continue L2;
                        }
                      } else {
                        var3_int++;
                        continue L2;
                      }
                    } else {
                      var3_int++;
                      continue L2;
                    }
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        L4: {
          if (this.field_G == null) {
            break L4;
          } else {
            L5: {
              var2 = ha.a(this.field_A, this.field_G.field_A, false);
              var3 = var2 - this.field_r;
              if ((double)var3 <= 3.141592653589793) {
                break L5;
              } else {
                var3 = (float)((double)var3 - 6.283185307179586);
                break L5;
              }
            }
            L6: {
              if (-3.141592653589793 <= (double)var3) {
                break L6;
              } else {
                var3 = (float)((double)var3 + 6.283185307179586);
                break L6;
              }
            }
            L7: {
              if (10.0f < var3) {
                var3 = 10.0f;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var3 < -10.0f) {
                var3 = -10.0f;
                break L8;
              } else {
                break L8;
              }
            }
            this.field_r = this.field_r + var3;
            this.field_w.a(this.field_r, (byte) -54);
            break L4;
          }
        }
        L9: {
          var2 = (float)Math.sqrt((double)(this.field_t * this.field_t + this.field_x * this.field_x));
          var2 = var2 + 0.05000000074505806f * (55.0f - var2);
          this.field_t = this.field_w.field_j * var2;
          this.field_x = var2 * this.field_w.field_g;
          var3 = 4.0f * (float)Math.cos((double)((float)this.field_M / 10.0f));
          var4 = this.field_A.field_h + -(int)(this.field_w.field_j * 5.0f) + (int)(this.field_w.field_g * var3);
          var5 = this.field_A.field_f - ((int)(this.field_w.field_g * 5.0f) - -(int)(this.field_w.field_j * var3));
          if (!param0) {
            break L9;
          } else {
            this.field_S = (int[]) null;
            break L9;
          }
        }
        L10: {
          if (!bl.field_r.d((byte) 47)) {
            L11: {
              if (bl.field_r.field_ab % 2 != 0) {
                break L11;
              } else {
                kn.a((int)(-this.field_w.field_j * 2048.0f), var5, 1, 64, 1, -2, var4, this.field_q, bl.field_r.field_O, 12632256, (int)(-this.field_w.field_g * 2048.0f), 32, 4);
                break L11;
              }
            }
            var6 = (int)(1024.0f * -this.field_w.field_j);
            var7 = (int)(-this.field_w.field_g * 1024.0f);
            var6 = var6 + (-256 + kj.b(2, 512));
            var7 = var7 + (kj.b(2, 512) + -256);
            var8 = (kj.b(2, 128) | 520159104) << 1275358504;
            kn.a(var6, var5, 0, 16, 1, -16, var4, this.field_q, bl.field_r.field_O, var8, var7, 128, 1);
            break L10;
          } else {
            var6 = bl.field_r.field_C[this.field_J & 3].field_Eb;
            var7 = (int)(-this.field_w.field_j * 1024.0f);
            var8 = (int)(-this.field_w.field_g * 1024.0f);
            var9 = 0;
            L12: while (true) {
              if (-5 >= (var9 ^ -1)) {
                break L10;
              } else {
                L13: {
                  var11 = kj.b(2, 256);
                  if (-129 < (var11 ^ -1)) {
                    var10 = -16711936 & (-var11 + 256) * (16711935 & var6) | 16711680 & (var6 & 65280) * (256 + -var11);
                    var10 = var10 + (-16711936 & var11 * 16711935 | 16711680 & 65280 * var11);
                    var10 = var10 >>> 8;
                    break L13;
                  } else {
                    var10 = 16744448 | var11 - 128 << 973190824;
                    break L13;
                  }
                }
                var12 = var4 + dg.a(-2, -1, 2);
                var13 = dg.a(-2, -1, 2) + var5;
                var14 = var7 + dg.a(-512, -1, 512);
                var15 = dg.a(-512, -1, 512) + var8;
                kn.a(var14, var13, 0, 16, 1, -16, var12, this.field_q, bl.field_r.field_O, var10, var15, 128, 2);
                var9++;
                continue L12;
              }
            }
          }
        }
    }

    wm(qm param0, int param1, int param2) {
        super((float)param0.field_h, (float)param0.field_f, param2);
        try {
            this.a(-43, param1, 0.0f, 0.0f);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, int param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              this.field_Q = 0;
              this.field_S = param0;
              if (null != this.field_S) {
                this.field_K = this.field_S.length / 2;
                this.field_I = 0;
                this.field_Q = this.field_S[0];
                this.field_R = this.field_S[1];
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 >= 3) {
                break L2;
              } else {
                this.field_K = -78;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("wm.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, float param2, float param3) {
        this.field_E = ci.a(param1, (byte) 17);
        if (param0 >= -35) {
            this.field_J = 78;
        }
        this.field_J = this.field_E.field_b;
        this.field_x = param3;
        this.field_t = param2;
        if (!((256 & this.field_J) != 0)) {
            this.a(this.field_E.field_l, 71);
        }
        if (0 != (8192 & this.field_J)) {
            this.field_G = null;
            this.field_M = 5;
        }
        if (!(0 == (8 & this.field_J))) {
            this.field_B = this.field_E.field_a;
            this.field_z = true;
            if (-1 != (1024 & this.field_J ^ -1)) {
                this.field_B = 6;
            }
        }
    }

    public static void f(int param0) {
        field_U = null;
        if (param0 != -20668) {
            field_U = (ll) null;
        }
    }

    wm(qm param0, int param1, int param2, float param3, float param4, float param5) {
        super((float)param0.field_h, (float)param0.field_f, param2, param3);
        try {
            this.a(-62, param1, param4, param5);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "wm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_U = new ll();
    }
}
