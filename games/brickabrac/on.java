/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends bn {
    static String field_F;
    int field_H;
    int field_B;
    int field_N;
    static int[] field_D;
    private int field_v;
    private static int[] field_y;
    static int[] field_L;
    int field_M;
    ee[] field_P;
    static jp field_K;
    int field_S;
    int field_J;
    private int field_G;
    static jp[][] field_I;
    static int field_E;
    static kg field_x;
    static byte[] field_O;
    static mh field_A;
    static String field_z;
    int field_R;
    int field_C;
    static jp field_w;

    final int a(int param0, StringBuilder param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 79) {
                break L1;
              } else {
                this.f(-33);
                break L1;
              }
            }
            L2: {
              var3_int = super.a(107, param1);
              if (param1 == null) {
                break L2;
              } else {
                discarded$4 = param1.append(this.field_j + " " + this.field_m + " ");
                discarded$5 = param1.append(this.field_k + " " + " " + this.field_o + " ");
                discarded$6 = param1.append(this.field_G + " " + this.field_J + " " + this.field_S + " " + this.field_M + " ");
                discarded$7 = param1.append(this.field_R + "\n");
                break L2;
              }
            }
            var3_int = var3_int ^ (this.field_J * 19 + this.field_G * 23 - (-(this.field_S * 17) - 4641) ^ 405 + 27 * this.field_N << -243762059 ^ 47802 + this.field_M * 3 << -970213756 ^ 4643 + this.field_R * 23 << -128595032);
            var3_int = var3_int ^ this.field_H * 7 - -35 << 1072801154;
            stackIn_5_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("on.A(").append(param0).append(',');

            if (param1 == null) {
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
          throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(cl param0, byte param1) {
        int var3_int = 0;
        ee var4_ref_ee = null;
        int incrementValue$0 = 0;
        int var4 = 0;
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(!param0.field_p.a(false))) {
            return;
        }
        if (param1 > -87) {
            return;
        }
        try {
            this.field_G = param0.field_t;
            this.field_P = new ee[param0.field_p.e(119)];
            var3_int = 0;
            var4_ref_ee = (ee) ((Object) param0.field_p.d(-38));
            while (var4_ref_ee != null) {
                incrementValue$0 = var3_int;
                var3_int++;
                this.field_P[incrementValue$0] = var4_ref_ee;
                var4_ref_ee = (ee) ((Object) param0.field_p.a((byte) 116));
            }
            this.field_v = -1 + this.field_P.length;
            this.field_C = 0;
            var3_int = 0;
            var4 = 0;
            while (var3_int <= this.field_J) {
                var4 = var3_int;
                this.f(68);
                var3_int = var3_int + this.field_P[this.field_C].field_t;
            }
            this.field_S = -var4 + this.field_J;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "on.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    on() {
        this(0, 0, 0, 0, 0);
    }

    on(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0, param1, param2, param3, 8704, 4096, param4);
        this.field_R = -1;
        this.field_J = param7;
        this.field_N = param5;
        this.field_M = param6;
    }

    private final void a(j param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 == 15165) {
                break L1;
              } else {
                this.a((byte) -67, false);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((this.field_N & 2) == 0) {
                  break L3;
                } else {
                  if (!param0.a(26, this.field_i)) {
                    break L3;
                  } else {
                    param0.field_pb.a(new ge(this.field_j - -(this.field_u / 2) - 2048, this.field_m - -(this.field_s * 2), this.field_i), (byte) 3);
                    if (r.field_A) {
                      jc.a(this.field_i, 2, (byte) -92);
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("on.R(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    final void a(cl param0, boolean param1, int param2) {
        try {
            this.a(param0, (byte) -105);
            this.a((byte) 36, param1);
            if (param2 != 4) {
                on.a((byte) -120, -81);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) ((Object) runtimeException), "on.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        ee var6 = this.field_P[this.field_v];
        ee var4 = this.field_P[this.field_C];
        this.field_k = -var6.field_j + var4.field_j;
        int var5 = var4.field_t;
        this.field_o = var4.field_m + -var6.field_m;
        if (param0 <= 33) {
            this.f(-3);
        }
        this.field_j = this.field_S * this.field_k / var5 + var6.field_j;
        this.field_m = var6.field_m + this.field_o * this.field_S / var5;
        if (param1) {
            this.field_k = this.field_k / var5;
            this.field_o = this.field_o / var5;
        } else {
            this.field_k = 0;
            this.field_o = 0;
        }
    }

    public static void d(int param0) {
        field_D = null;
        field_w = null;
        field_I = (jp[][]) null;
        field_A = null;
        field_z = null;
        if (param0 != 4641) {
            field_x = (kg) null;
        }
        field_L = null;
        field_y = null;
        field_x = null;
        field_K = null;
        field_O = null;
        field_F = null;
    }

    final void a(byte param0, j param1, no param2) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn var7 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var7 = (vn) ((Object) param2);
            if (this.field_i != 28) {
              L1: {
                L2: {
                  if ((sg.field_n & 1 << this.field_i) != 0) {
                    break L2;
                  } else {
                    if (var7.field_v != 0) {
                      break L1;
                    } else {
                      if (var7.field_J != 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    super.a((byte) 53, param1, param2);
                    var7.field_I = var7.field_I + 1;
                    if (sh.field_a == 8) {
                      break L4;
                    } else {
                      if ((sh.field_a ^ -1) != -5) {
                        var7.field_o = -var7.field_o;
                        var5 = ae.field_b * (this.field_o - var7.field_o);
                        if ((var5 ^ -1) <= -1) {
                          break L3;
                        } else {
                          var7.field_o = this.field_o;
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  var7.field_k = -var7.field_k;
                  var5 = mn.field_A * (this.field_k - var7.field_k);
                  if (0 <= var5) {
                    break L3;
                  } else {
                    var7.field_k = this.field_k;
                    break L3;
                  }
                }
                var7.field_C = var7.field_C + 1;
                if (-1 == (var7.field_I & 3 ^ -1)) {
                  var7.field_k = var7.field_k + (-param1.a(4, (byte) 62) + 2);
                  var7.field_o = var7.field_o + (2 + -param1.a(4, (byte) 62));
                  break L1;
                } else {
                  break L1;
                }
              }
              L5: {
                if (-1 != (var7.field_J ^ -1)) {
                  stackIn_21_0 = 0;
                  break L5;
                } else {
                  stackIn_21_0 = 1;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var5 = stackIn_21_0;
                  stackIn_24_0 = var5;

                  if ((this.field_i ^ -1) != -20) {
                    break L7;
                  } else {


                    if (-2 != (sh.field_a ^ -1)) {
                      stackIn_26_0 = stackIn_24_0;
                      stackIn_26_1 = 0;
                      break L6;
                    } else {

                      break L7;
                    }
                  }
                }
                stackIn_26_0 = stackIn_24_0;
                stackIn_26_1 = 1;
                break L6;
              }
              L8: {
                L9: {
                  var5 = stackIn_26_0 & stackIn_26_1;
                  stackIn_29_0 = var5;

                  if (20 != this.field_i) {
                    break L9;
                  } else {


                    if (sh.field_a != 2) {
                      stackIn_31_0 = stackIn_29_0;
                      stackIn_31_1 = 0;
                      break L8;
                    } else {

                      break L9;
                    }
                  }
                }
                stackIn_31_0 = stackIn_29_0;
                stackIn_31_1 = 1;
                break L8;
              }
              L10: {
                var5 = stackIn_31_0 & stackIn_31_1;
                if (var5 != 0) {
                  L11: {
                    if (25 != this.field_i) {
                      break L11;
                    } else {
                      param1.a(-27);
                      break L11;
                    }
                  }
                  L12: {
                    if (this.field_i != 27) {
                      break L12;
                    } else {
                      if (this.field_R == 26) {
                        break L10;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if ((this.field_i ^ -1) != -27) {
                        break L14;
                      } else {
                        if (-28 != (this.field_R ^ -1)) {
                          break L14;
                        } else {
                          this.field_i = 27;
                          this.field_R = 0;
                          this.field_B = 1;
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (param1.field_l + 1 != ej.field_E[this.field_i]) {
                        if ((this.field_N & 1) != 0) {
                          break L15;
                        } else {
                          param1.field_l = 0;
                          break L15;
                        }
                      } else {
                        param1.field_l = param1.field_l + 1;
                        break L15;
                      }
                    }
                    L16: {
                      this.field_R = ue.field_b[this.field_i];
                      dupTemp$0 = rb.field_a[this.field_i];
                      this.field_B = dupTemp$0;
                      if ((dupTemp$0 ^ -1) > -1) {
                        if ((param1.a(100, (byte) 62) ^ -1) < -66) {
                          if (-2 != (sh.field_a ^ -1)) {
                            if (sh.field_a == 2) {
                              this.field_B = 7;
                              break L16;
                            } else {
                              if (-9 != (sh.field_a ^ -1)) {
                                this.field_B = 9;
                                break L16;
                              } else {
                                this.field_B = 8;
                                break L16;
                              }
                            }
                          } else {
                            this.field_B = 6;
                            break L16;
                          }
                        } else {
                          this.field_B = param1.a(6, (byte) 62);
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                    this.a(param1, 15165);
                    break L13;
                  }
                  this.field_l = 0;
                  break L10;
                } else {
                  break L10;
                }
              }
              L17: {
                if (19 != this.field_i) {
                  break L17;
                } else {
                  if ((this.field_R ^ -1) <= -1) {
                    break L17;
                  } else {
                    this.field_R = this.field_i;
                    this.field_B = 12;
                    break L17;
                  }
                }
              }
              L18: {
                if (20 != this.field_i) {
                  break L18;
                } else {
                  if (-1 < (this.field_R ^ -1)) {
                    this.field_B = 12;
                    this.field_R = this.field_i;
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (param0 == 53) {
                  break L19;
                } else {
                  field_F = (String) null;
                  break L19;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              param1.a((byte) -63, (on) (this), var7);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var4 = decompiledCaughtException;
            stackIn_70_0 = (RuntimeException) (var4);

            stackIn_70_1 = new StringBuilder().append("on.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_73_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');

            if (param2 == null) {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L21;
            } else {
              stackIn_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L21;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_71_0), stackIn_74_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean a(no param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 == (4 & this.field_N)) {
                break L1;
              } else {
                if (this.field_P[this.field_v].field_t != 1) {
                  break L1;
                } else {
                  if (0 != this.field_S) {
                    break L1;
                  } else {
                    stackIn_4_0 = 0;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                }
              }
            }
            L2: {
              if ((1 << this.field_i & sg.field_n) != 0) {
                break L2;
              } else {
                if (0 == ((vn) ((Object) param0)).field_J) {
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            if (this.field_R != 0) {
              var3_int = -83 % ((-29 - param1) / 35);
              stackIn_13_0 = super.a(param0, (byte) -120);
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackIn_11_0 = 0;
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("on.F(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_13_0;
            }
          }
        }
    }

    final static void e(int param0) {
        int var1 = (-640 + kp.field_a) / 2;
        int var2 = hj.field_Yb * hj.field_Yb;
        int var3 = var2 - ml.field_b * ml.field_b;
        fe.field_gb.a(-124 + (lb.field_d + -90), 90, -(199 * var3 / var2) + var1, 199, (byte) 64);
        if (param0 >= -50) {
            on.d(61);
        }
        rm.field_a.a(-4 + lb.field_d + -120, 0, 438 * var3 / var2 + (var1 - -202), 438, (byte) 64);
    }

    on(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, 0, 0, 0);
    }

    final void f(int param0) {
        int fieldTemp$0 = this.field_C + 1;
        this.field_C = this.field_C + 1;
        this.field_C = fieldTemp$0 % this.field_P.length;
        int fieldTemp$1 = this.field_v + 1;
        this.field_v = this.field_v + 1;
        this.field_v = fieldTemp$1 % this.field_P.length;
        if (param0 <= 61) {
            wq var3 = (wq) null;
            this.a(-99, (wq) null);
        }
        this.field_J = this.field_J % this.field_G;
        this.field_S = 0;
    }

    final static int a(byte param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        qj.field_j = 0;
        dm.field_d = null;
        fc.field_e = null;
        int var2 = gd.field_a;
        gd.field_a = up.field_z;
        int var3 = -47 / ((param0 - -22) / 61);
        if (-52 == (param1 ^ -1)) {
            vd.field_f.field_f = 2;
        } else {
            if ((param1 ^ -1) != -51) {
                vd.field_f.field_f = 1;
            } else {
                vd.field_f.field_f = 5;
            }
        }
        up.field_z = var2;
        vd.field_f.field_i = vd.field_f.field_i + 1;
        if (2 <= vd.field_f.field_i && (param1 ^ -1) == -52) {
            return 2;
        }
        if (-3 >= (vd.field_f.field_i ^ -1)) {
            if (!(param1 != 50)) {
                return 5;
            }
        }
        if (!(-5 < (vd.field_f.field_i ^ -1))) {
            return 1;
        }
        return -1;
    }

    final void a(int param0, wq param1) {
        cl var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param0 > 89) {
                break L1;
              } else {
                var4 = (cl) null;
                this.a((cl) null, (byte) 44);
                break L1;
              }
            }
            L2: {
              super.a(93, param1);
              this.field_R = param1.b(true);
              if ((this.field_R ^ -1) >= -1) {
                break L2;
              } else {
                this.field_B = param1.l(255);
                break L2;
              }
            }
            L3: {
              this.field_N = param1.l(255) & 255;
              if ((4 & this.field_N) != 0) {
                this.field_M = param1.l(255);
                this.field_J = param1.i(65280);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("on.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        field_y = new int[65536];
        field_L = new int[65536];
        field_D = new int[]{100, 200, 300, 300, 500, 100, 300, 300, 500, 200, 500, 500, 500, 1000, 300, 1000, 100, 300, 500, 300, 500, 1000, 500, 300, 500, 1000, 300, 200, 500, 200, 100, 200, 100, 200, 100, 100, 100, 100, 100, 500, 1000, 200};
        field_F = "You must play <%1> more rated games before playing with the current options.";
        for (var0 = 0; var0 < 65536; var0++) {
            var1 = 256.0 - Math.sqrt((double)var0);
            field_L[var0] = (int)(var1 * var1 + 0.5);
        }
        for (var0 = 0; (var0 ^ -1) > -65537; var0++) {
            var1 = Math.sqrt((double)var0);
            field_y[var0] = (int)Math.floor((double)var0 * 0.0234375 + (-(9.0 * var1) + 768.5));
        }
        field_z = "<%0> has lost connection.";
    }
}
