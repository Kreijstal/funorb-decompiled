/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends tc implements uo {
    int field_E;
    hr field_x;
    int field_ab;
    boolean field_eb;
    boolean field_Z;
    boolean field_U;
    int field_Y;
    static String field_n;
    int field_B;
    int field_N;
    private int field_k;
    int field_J;
    ha field_l;
    boolean field_I;
    boolean field_F;
    int field_fb;
    int field_m;
    int field_t;
    boolean field_D;
    static boolean field_L;
    int field_A;
    boolean field_u;
    int field_V;
    static String field_y;
    int field_o;
    int field_cb;
    int field_H;
    cl field_p;
    int[] field_R;
    static String field_T;
    int field_z;
    boolean field_C;
    boolean field_X;
    boolean field_S;
    private int field_db;
    int field_r;
    int field_q;
    int field_w;
    String field_K;
    int field_P;
    int field_O;
    int field_M;
    boolean field_W;
    boolean field_s;
    boolean field_G;
    boolean field_v;
    boolean field_bb;

    final boolean c(boolean param0) {
        if (param0) {
            this.field_bb = true;
        }
        return (1 & this.field_V ^ -1) != -1 ? true : false;
    }

    final int a(boolean param0) {
        if (param0) {
            jd var3 = (jd) null;
            this.a((jd) null, (byte) 94);
        }
        return this.field_db;
    }

    final boolean p(byte param0) {
        if (param0 >= -94) {
            this.field_m = -85;
        }
        return (2 & bw.field_m[this.field_N][10] ^ -1) < -1 ? true : false;
    }

    final int h(byte param0) {
        int var2 = 0;
        if (!(!this.field_bb)) {
            var2 = var2 | 256;
        }
        if (this.field_I) {
            var2 = var2 | 16;
        }
        if (this.field_W) {
            var2 = var2 | 8;
        }
        if (!(!this.field_C)) {
            var2 = var2 | 64;
        }
        if (!(!this.field_F)) {
            var2 = var2 | 32;
        }
        if (!(!this.field_s)) {
            var2 = var2 | 4;
        }
        if (this.field_D) {
            var2 = var2 | 512;
        }
        if (param0 < 96) {
            this.field_ab = -60;
        }
        var2 = var2 | 3 & this.field_B;
        return var2;
    }

    final boolean e(byte param0) {
        if (param0 < 73) {
            this.field_w = -27;
        }
        return (this.field_N ^ -1) == -40 ? true : false;
    }

    final void c(int param0, int param1) {
        if (param1 != 8) {
            this.n((byte) 80);
        }
        if (this.field_x == null) {
            this.field_x = new hr(this.field_R, param0, this.field_fb);
        } else {
            this.field_x.a((byte) 59, param0);
        }
    }

    final boolean k(byte param0) {
        if (param0 < 75) {
            this.field_p = (cl) null;
        }
        return -28 == (this.field_N ^ -1) ? true : false;
    }

    final void n(byte param0) {
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        Object var3;
        int var4;
        jd var5;
        jd var6;
        jd var7;
        jd var8;
        L0: {
          if (0 >= this.field_A) {
            break L0;
          } else {
            this.field_l.field_l.a((byte) -119, (tc) (new st((jd) (this), 5)));
            break L0;
          }
        }
        L1: {
          if (!this.a(param0 ^ -23050)) {
            break L1;
          } else {
            L2: {
              L3: {
                var3 = this;
                var4 = 0;
                var5 = this.field_l.c(((jd) (var3)).field_w, true, -1 + ((jd) (var3)).field_J);
                stackIn_6_0 = var4;

                if (var5 == null) {
                  break L3;
                } else {

                  if (0 == (8 & bw.field_m[var5.field_N][10])) {
                    break L3;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 1;
                    break L2;
                  }
                }
              }
              stackIn_7_0 = stackIn_6_0;
              stackIn_7_1 = 0;
              break L2;
            }
            L4: {
              L5: {
                var4 = stackIn_7_0 | stackIn_7_1;
                var6 = this.field_l.c(((jd) (var3)).field_w, true, 1 + ((jd) (var3)).field_J);
                stackIn_10_0 = var4;

                if (var6 == null) {
                  break L5;
                } else {

                  if (-1 == (8 & bw.field_m[var6.field_N][10] ^ -1)) {
                    break L5;
                  } else {
                    stackIn_11_0 = stackIn_10_0;
                    stackIn_11_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = 0;
              break L4;
            }
            L6: {
              L7: {
                var4 = stackIn_11_0 | stackIn_11_1;
                var7 = this.field_l.c(1 + ((jd) (var3)).field_w, true, ((jd) (var3)).field_J);
                stackIn_14_0 = var4;

                if (var7 == null) {
                  break L7;
                } else {

                  if (-1 == (bw.field_m[var7.field_N][10] & 8 ^ -1)) {
                    break L7;
                  } else {
                    stackIn_15_0 = stackIn_14_0;
                    stackIn_15_1 = 1;
                    break L6;
                  }
                }
              }
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = 0;
              break L6;
            }
            L8: {
              L9: {
                var4 = stackIn_15_0 | stackIn_15_1;
                var8 = this.field_l.c(-1 + ((jd) (var3)).field_w, true, ((jd) (var3)).field_J);
                stackIn_18_0 = var4;

                if (var8 == null) {
                  break L9;
                } else {

                  if (0 == (bw.field_m[var8.field_N][10] & 8)) {
                    break L9;
                  } else {
                    stackIn_19_0 = stackIn_18_0;
                    stackIn_19_1 = 1;
                    break L8;
                  }
                }
              }
              stackIn_19_0 = stackIn_18_0;
              stackIn_19_1 = 0;
              break L8;
            }
            var4 = stackIn_19_0 | stackIn_19_1;
            if (var4 == 0) {
              this.field_l.field_l.a((byte) -119, (tc) (new st((jd) (this), 3)));
              break L1;
            } else {
              break L1;
            }
          }
        }
        L10: {
          if (!this.field_I) {
            break L10;
          } else {
            this.field_l.field_l.a((byte) -119, (tc) (new st((jd) (this), 2)));
            break L10;
          }
        }
        L11: {
          if (param0 == -42) {
            break L11;
          } else {
            jd.m(45);
            break L11;
          }
        }
    }

    final int l(byte param0) {
        if (param0 != -79) {
            this.c((byte) -122);
        }
        int var2 = bw.field_m[this.field_N][6];
        if (this.field_W && this.field_N == 34) {
            var2 = 2;
        }
        return var2;
    }

    final int j(int param0) {
        if (0 > this.field_r) {
            return -1;
        }
        if (param0 != 20640) {
            this.field_C = true;
        }
        return this.field_r >> 1341083717;
    }

    final boolean i(int param0) {
        int stackIn_7_0 = 0;
        if (param0 == -21428) {
          L0: {
            L1: {
              if ((512 & bw.field_m[this.field_N][10] ^ -1) < -1) {
                break L1;
              } else {
                if (this.field_ab != 1) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final int d(int param0, int param1) {
        if (!(0 <= this.field_r)) {
            return 0;
        }
        int var3 = 62 / ((-23 - param1) / 63);
        return np.field_Vb[this.field_r & 31][param0];
    }

    final int g(byte param0) {
        if (param0 != 122) {
            return 34;
        }
        return this.field_Y + this.field_A;
    }

    final boolean n(int param0) {
        int var2;
        int stackIn_5_0 = 0;
        L0: {
          L1: {
            var2 = 106 % ((80 - param0) / 34);
            if (-1 > (bw.field_m[this.field_N][10] & 2048 ^ -1)) {
              break L1;
            } else {
              if ((this.field_ab ^ -1) != -3) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackIn_5_0 = 1;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    final jd b(int param0, int param1) {
        this.e(-97);
        if (param1 != -1) {
            this.field_K = (String) null;
        }
        if (this.field_S) {
            return null;
        }
        if (-1 == (this.field_Y + this.field_A ^ -1)) {
            return null;
        }
        jd var3 = new jd(this.field_J, this.field_w, this.field_N, param0, this.field_t, this.field_Y, this.h((byte) 105), this.field_ab, this.field_A, this.field_l, this.field_P, this.field_o, this.field_r, false, this.field_cb);
        this.field_l.a(8288, var3);
        return var3;
    }

    final boolean p(int param0) {
        int var2;
        int stackIn_8_0 = 0;
        L0: {
          L1: {
            var2 = -69 % ((3 - param0) / 46);
            if (-59 == (this.field_N ^ -1)) {
              break L1;
            } else {
              if (-64 == (this.field_N ^ -1)) {
                break L1;
              } else {
                if (this.field_N == 59) {
                  break L1;
                } else {
                  if (this.field_N == 53) {
                    break L1;
                  } else {
                    if (this.field_N != 43) {
                      stackIn_8_0 = 0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackIn_8_0 = 1;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!(this.field_s)) {
            var2 = var2 | 1;
        }
        if (!(0 >= this.field_B)) {
            var2 = var2 | 2;
        }
        if (this.field_I) {
            var2 = var2 | 4;
        }
        if (!(!this.field_Z)) {
            var2 = var2 | 8;
        }
        if (!(!this.field_v)) {
            var2 = var2 | 16;
        }
        if (!(!this.field_eb)) {
            var2 = var2 | 32;
        }
        if (this.field_F) {
            var2 = var2 | 64;
        }
        if (this.field_bb) {
            var2 = var2 | 128;
        }
        if (this.field_C) {
            var2 = var2 | 256;
        }
        if (param0 != -27014) {
            return 27;
        }
        if (!(-1 >= this.field_r)) {
            var2 = var2 | 512;
        }
        if (!(0 >= this.field_o)) {
            var2 = var2 | 1024;
        }
        if (-1 != (this.field_ab ^ -1)) {
            var2 = var2 | 2048;
        }
        if (-1 > (this.field_cb ^ -1)) {
            var2 = var2 | 4096;
        }
        return var2;
    }

    final boolean a(jd param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.k((byte) 107)) {
              L1: {
                if (!param0.field_W) {
                  break L1;
                } else {
                  if (param0.field_N == 0) {
                    break L1;
                  } else {
                    stackIn_6_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (param1 >= 113) {
                  break L2;
                } else {
                  this.field_z = -18;
                  break L2;
                }
              }
              L3: {
                if (this.field_A + this.field_Y < param0.field_Y - -param0.field_A) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("jd.T(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var4;
        L0: {
          L1: {
            var4 = ArmiesOfGielinor.field_M ? 1 : 0;
            if (-8 == (this.field_P ^ -1)) {
              break L1;
            } else {
              if (this.field_P == 8) {
                break L1;
              } else {
                this.field_Y = this.field_Y - param0;
                break L0;
              }
            }
          }
          if (this.field_o > 1) {
            this.field_o = this.field_o - 1;
            break L0;
          } else {
            this.field_P = 0;
            break L0;
          }
        }
        if (param1) {
          this.w(22331);
          return;
        } else {
          return;
        }
    }

    final boolean j(byte param0) {
        int var2;
        int stackIn_11_0 = 0;
        L0: {
          var2 = 31 % ((-9 - param0) / 61);
          if (this.field_N != 34) {
            break L0;
          } else {
            if (!this.field_W) {
              break L0;
            } else {
              return true;
            }
          }
        }
        L1: {
          L2: {
            if (-5 == (bw.field_m[this.field_N][0] ^ -1)) {
              break L2;
            } else {
              if (-4 == (bw.field_m[this.field_N][0] ^ -1)) {
                break L2;
              } else {
                if (bw.field_m[this.field_N][0] == 2) {
                  break L2;
                } else {
                  if ((2048 & bw.field_m[this.field_N][10]) > 0) {
                    break L2;
                  } else {
                    if ((this.field_ab ^ -1) != -3) {
                      stackIn_11_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
          }
          stackIn_11_0 = 1;
          break L1;
        }
        return stackIn_11_0 != 0;
    }

    final int D(int param0) {
        if (param0 > -63) {
            this.field_J = 66;
        }
        return this.field_k;
    }

    final static boolean i(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        var1 = va.field_w;
        synchronized (var1) {
          L0: {
            if (rd.field_d == be.field_E) {
              stackIn_4_0 = 0;
              return stackIn_4_0 != 0;
            } else {
              rs.field_q = gt.field_d[be.field_E];
              ui.field_i = ua.field_u[be.field_E];
              var2 = 86 % ((param0 - 0) / 48);
              be.field_E = 127 & be.field_E - -1;
              stackIn_6_0 = 1;
              break L0;
            }
          }
        }
        return stackIn_6_0 != 0;
    }

    final void m(byte param0) {
        if (!this.field_I && !this.a(23072) && this.field_t > this.field_Y && !this.field_s && 0 < this.field_B) {
            this.field_l.field_l.a((byte) -119, (tc) (new st((jd) (this), 1)));
        }
        if (!(0 >= this.field_cb)) {
            this.field_cb = this.field_cb - 1;
        }
        if (param0 != -36) {
            this.field_x = (hr) null;
        }
        if (-1 != (this.field_cb ^ -1)) {
        } else {
            if (!this.h(param0 + -13458)) {
                this.field_s = false;
            } else {
                this.field_s = true;
            }
            this.field_B = 1;
            this.field_D = false;
            if (!(74 != this.field_N)) {
                this.field_B = 2;
            }
        }
    }

    final boolean f(byte param0) {
        if (param0 >= -99) {
            return true;
        }
        return 0 < (8 & bw.field_m[this.field_N][10]) ? true : false;
    }

    final String q(byte param0) {
        if (param0 <= 37) {
            this.b(true);
        }
        String var2 = new String(this.field_K);
        if (!(!this.c(false))) {
            var2 = var2 + " " + og.field_r;
        }
        if (!(!this.u(8))) {
            var2 = var2 + " " + fa.field_f;
        }
        return var2;
    }

    final boolean t(int param0) {
        if (param0 != 26440) {
            return true;
        }
        return this != this.field_l.field_Eb[this.field_l.field_v * this.field_w + this.field_J].field_c ? true : false;
    }

    final void z(int param0) {
        if (null != this.field_x) {
            if (!(this.field_N != 34)) {
                this.field_x.a((byte) 115, 75);
            }
            if (!((this.field_N ^ -1) != -8)) {
                this.field_x.a((byte) 77, 76);
            }
            this.field_x.a(-23162, 0);
        }
        if (param0 != 10) {
            this.field_R = (int[]) null;
        }
    }

    final boolean o(byte param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == 98) {
            break L0;
          } else {
            this.o(-50);
            break L0;
          }
        }
        L1: {
          L2: {
            if (-74 == (this.field_N ^ -1)) {
              break L2;
            } else {
              if (-5 != (this.field_ab ^ -1)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void e(int param0, int param1) {
        if (0 > (param1 ^ -1)) {
            if (!((param1 ^ -1) <= -2049)) {
                this.field_fb = param1;
            }
        }
        if (this.field_x != null) {
            this.field_x.a(false, param1);
        }
        int var3 = 114 / ((-56 - param0) / 54);
    }

    public static void q(int param0) {
        field_T = null;
        field_n = null;
        if (param0 != -9480) {
            field_n = (String) null;
        }
        field_y = null;
    }

    final void e(int param0) {
        this.field_l.field_Eb[this.field_l.field_v * this.field_w + this.field_J].field_c = null;
        this.d(-100);
        this.field_l.a(this.field_w, this.field_J, 0, 3);
        if (param0 > -82) {
            field_y = (String) null;
        }
    }

    final boolean a(int param0) {
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        L0: {
          if (param0 == 23072) {
            break L0;
          } else {
            this.field_o = -127;
            break L0;
          }
        }
        L1: {
          stackIn_4_0 = this.field_C;

          if ((256 & bw.field_m[this.field_N][10]) <= 0) {
            stackIn_5_0 = stackIn_4_0;
            stackIn_5_1 = 0;
            break L1;
          } else {
            stackIn_5_0 = stackIn_4_0;
            stackIn_5_1 = 1;
            break L1;
          }
        }
        L2: {
          L3: {
            if (stackIn_5_0 | stackIn_5_1 == 0) {
              break L3;
            } else {
              if (this.c(false)) {
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L2;
              }
            }
          }
          stackIn_9_0 = 0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    public final void a(int param0, bv param1, String param2, byte param3) {
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        StringBuilder stackIn_50_1 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 37) {
                break L1;
              } else {
                this.field_F = false;
                break L1;
              }
            }
            L2: {
              L3: {
                if (param2.equals("c")) {
                  if (param0 > 0) {
                    this.field_N = (int)tn.a(false, param0, param1);
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (!param2.equals("o")) {
                    if (param2.equals("str")) {
                      if (-1 <= (param0 ^ -1)) {
                        break L3;
                      } else {
                        this.field_Y = (int)tn.a(false, param0, param1);
                        break L2;
                      }
                    } else {
                      if (!param2.equals("max")) {
                        if (param2.equals("x")) {
                          if (0 < param0) {
                            this.field_J = (int)tn.a(false, param0, param1);
                            break L2;
                          } else {
                            break L2;
                          }
                        } else {
                          if (!param2.equals("y")) {
                            if (param2.equals("mf")) {
                              if ((param0 ^ -1) >= -1) {
                                break L3;
                              } else {
                                this.field_V = (int)tn.a(false, param0, param1);
                                break L2;
                              }
                            } else {
                              if (!param2.equals("nm")) {
                                if (!param2.equals("tag")) {
                                  if (param2.equals("obj")) {
                                    if (-1 > (param0 ^ -1)) {
                                      this.field_H = (int)tn.a(false, param0, param1);
                                      break L2;
                                    } else {
                                      break L2;
                                    }
                                  } else {
                                    if (!param2.equals("tnk")) {
                                      break L3;
                                    } else {
                                      if ((param0 ^ -1) < -1) {
                                        this.field_q = (int)tn.a(false, param0, param1);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    }
                                  }
                                } else {
                                  if (param0 > 0) {
                                    this.field_E = (int)tn.a(false, param0, param1);
                                    break L2;
                                  } else {
                                    break L2;
                                  }
                                }
                              } else {
                                if (0 < param0) {
                                  this.field_K = up.a(param1, param0, (byte) -122);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            }
                          } else {
                            if (-1 <= (param0 ^ -1)) {
                              break L3;
                            } else {
                              this.field_w = (int)tn.a(false, param0, param1);
                              break L2;
                            }
                          }
                        }
                      } else {
                        if ((param0 ^ -1) < -1) {
                          this.field_t = (int)tn.a(false, param0, param1);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    if ((param0 ^ -1) < -1) {
                      this.field_O = (int)tn.a(false, param0, param1);
                      break L2;
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
            var5 = decompiledCaughtException;
            stackIn_47_0 = (RuntimeException) (var5);

            stackIn_47_1 = new StringBuilder().append("jd.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "null";
              break L4;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackIn_48_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackIn_48_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_50_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_48_2).append(',');

            if (param2 == null) {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "null";
              break L5;
            } else {
              stackIn_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackIn_51_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackIn_51_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_48_0), stackIn_51_2 + ',' + param3 + ')');
        }
    }

    final void w(int param0) {
        int var2 = 0;
        if (param0 != 22331) {
            this.field_H = 111;
        }
        if (!(!this.field_S)) {
            return;
        }
        if (-2 < (this.g((byte) 122) ^ -1)) {
            this.field_S = true;
            var2 = -1;
            if (!((this.field_ab ^ -1) != -6)) {
                var2 = this.field_l.a(this.field_w, this.field_O, this.field_J, (byte) -53);
            }
            if (0 > (var2 ^ -1)) {
                this.field_l.field_Eb[var2].field_l = true;
                this.field_l.field_l.a(750, new rt((jd) (this), var2 % this.field_l.field_v, var2 / this.field_l.field_v));
            } else {
                this.field_l.field_l.a(750, new hp((jd) (this)));
            }
        }
    }

    final boolean h(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == -13494) {
          L0: {
            L1: {
              if (34 != this.field_N) {
                break L1;
              } else {
                if (!this.field_W) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(boolean param0, byte param1) {
        ne var3;
        int var4;
        int var5;
        ne var6;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          this.field_Y = 0;
          this.field_S = true;
          this.field_A = 0;
          var6 = this.field_l.field_Eb[this.field_J - -(this.field_l.field_v * this.field_w)];
          var3 = var6;
          var3.field_m = var6.e(10);
          if (0 != this.field_N) {
            break L0;
          } else {
            if (!this.field_W) {
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          L2: {
            var4 = this.field_N;
            if ((var4 ^ -1) != -44) {
              if (-54 != (var4 ^ -1)) {
                if (59 != var4) {
                  if (-59 != (var4 ^ -1)) {
                    if ((var4 ^ -1) != -64) {
                      if (this.v(10)) {
                        break L1;
                      } else {
                        if (!param0) {
                          break L1;
                        } else {
                          var6.a(106);
                          break L1;
                        }
                      }
                    } else {
                      this.field_l.a(this.field_w, this.field_J, 0, 1);
                      if (this.v(10)) {
                        break L1;
                      } else {
                        if (!param0) {
                          break L1;
                        } else {
                          var6.a(106);
                          break L1;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                } else {
                  this.field_l.a(this.field_w, this.field_J, 0, 1);
                  if (this.v(10)) {
                    break L1;
                  } else {
                    if (!param0) {
                      break L1;
                    } else {
                      var6.a(106);
                      break L1;
                    }
                  }
                }
              } else {
                this.field_l.a(this.field_w, this.field_J, 0, 1);
                if (this.v(10)) {
                  break L1;
                } else {
                  if (!param0) {
                    break L1;
                  } else {
                    var6.a(106);
                    break L1;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          this.field_l.a(this.field_w, this.field_J, 0, 1);
          if (this.v(10)) {
            break L1;
          } else {
            if (!param0) {
              break L1;
            } else {
              var6.a(106);
              break L1;
            }
          }
        }
        L3: {
          if (this != var6.field_c) {
            break L3;
          } else {
            var3.field_c = null;
            break L3;
          }
        }
        L4: {
          this.d(39);
          if (param1 == 105) {
            break L4;
          } else {
            this.field_X = false;
            break L4;
          }
        }
        L5: {
          this.field_l.a(this.field_w, this.field_J, 0, 3);
          if (!this.c(false)) {
            break L5;
          } else {
            this.field_l.a((byte) 89, this.field_O);
            break L5;
          }
        }
        L6: {
          if (this.field_l.field_b) {
            this.field_l.field_h[this.field_O] = this.field_l.field_h[this.field_O] + 1;
            break L6;
          } else {
            break L6;
          }
        }
        this.field_l.b(this.field_O, true);
    }

    final boolean s(int param0) {
        if (param0 < 123) {
            this.k((byte) -126);
        }
        return (32 & bw.field_m[this.field_N][10] ^ -1) < -1 ? true : false;
    }

    final boolean o(int param0) {
        int stackIn_9_0 = 0;
        L0: {
          if (this.field_db != this.field_J) {
            break L0;
          } else {
            if (this.field_k != this.field_w) {
              break L0;
            } else {
              this.A(-1);
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -28467) {
            break L1;
          } else {
            this.field_W = false;
            break L1;
          }
        }
        L2: {
          L3: {
            if (this.field_db == -1) {
              break L3;
            } else {
              if (0 == (this.field_k ^ -1)) {
                break L3;
              } else {
                stackIn_9_0 = 1;
                break L2;
              }
            }
          }
          stackIn_9_0 = 0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    final int g(int param0) {
        if (param0 != 0) {
            this.o(82);
        }
        return bw.field_m[this.field_N][0];
    }

    final int c(byte param0) {
        if (param0 != 81) {
            this.g((byte) -105);
        }
        if (!(0 <= this.field_r)) {
            return 0;
        }
        return 31 & this.field_r;
    }

    final boolean y(int param0) {
        if (param0 > -92) {
            this.field_A = -12;
        }
        return (64 & bw.field_m[this.field_N][10]) > 0 ? true : false;
    }

    final jd b(boolean param0) {
        if (param0) {
            return (jd) null;
        }
        return new jd(this.field_J, this.field_w, this.field_N, this.field_O, this.field_t, this.field_Y, this.h((byte) 110), this.field_ab, this.field_A, this.field_l, this.field_P, this.field_o, this.field_r, true, this.field_cb);
    }

    final int f(int param0) {
        if (this.field_N == 34) {
            if (!(this.field_W)) {
                return 0;
            }
        }
        if (-40 == (this.field_N ^ -1)) {
            return 2;
        }
        if (param0 != 16) {
            this.field_q = -22;
        }
        if (this.field_N == 17) {
            return 1;
        }
        if (!(this.field_N != 72)) {
            return 3;
        }
        if (7 == this.field_N) {
            if (!(this.field_W)) {
                return 4;
            }
        }
        return -1;
    }

    final void a(jd param0, int param1) {
        if (this.field_J == param0.field_J) {
            if (!(this.field_w != param0.field_w)) {
                return;
            }
        }
        try {
            this.e(param1 ^ 2079, 256 + (param1 + -(int)(2048.0 * Math.atan2((double)(-(this.field_w - param0.field_w)), (double)(this.field_J + -param0.field_J)) / 3.141592653589793 / 2.0)) & 2047);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "jd.HB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean u(int param0) {
        int stackIn_6_0 = 0;
        L0: {
          if (param0 == 8) {
            break L0;
          } else {
            jd.i((byte) 14);
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == (this.field_V & 8)) {
              break L2;
            } else {
              if (this.field_Y < this.field_t) {
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

    final boolean x(int param0) {
        if (param0 >= -80) {
            jd var3 = (jd) null;
            this.a((jd) null, -117);
        }
        return 4 == this.g(0) ? true : false;
    }

    final boolean r(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 > 41) {
          L0: {
            L1: {
              if (0 != (bw.field_m[this.field_N][10] & 4096)) {
                break L1;
              } else {
                if ((this.field_ab ^ -1) != -4) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackIn_7_0 = 1;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final void k(int param0) {
        if (this.e((byte) 102)) {
            this.field_l.field_l.a((byte) -119, (tc) (new qj(this.field_J, this.field_w)));
        }
        if (!(!this.p((byte) -128))) {
            this.field_l.field_l.a((byte) -119, (tc) (new qq(2, this.field_J, this.field_w, this.field_O)));
        }
        if (!(!this.d((byte) 105))) {
            this.field_l.field_l.a((byte) -119, (tc) (new qq(3, this.field_J, this.field_w, this.field_O)));
        }
        if (this.f((byte) -116)) {
            this.field_l.field_l.a((byte) -119, (tc) (new qq(1, this.field_J, this.field_w, this.field_O)));
        }
        if (param0 != -1) {
            return;
        }
        if (!(!this.s(124))) {
            this.field_l.field_l.a((byte) -119, (tc) (new qq(4, this.field_J, this.field_w, this.field_O)));
        }
        if (this.t(26440)) {
            this.field_l.field_l.a((byte) -119, (tc) (new kn((jd) (this))));
        }
    }

    final int B(int param0) {
        int var2;
        int var3;
        L0: {
          var3 = ArmiesOfGielinor.field_M ? 1 : 0;
          var2 = bw.field_m[this.field_N][7];
          if (this.field_W) {
            if (this.field_N == 34) {
              var2 = 7;
              if (-4 != (this.j(20640) ^ -1)) {
                break L0;
              } else {
                var2 = var2 + this.d(1, -93);
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if ((this.field_N ^ -1) == -82) {
                break L3;
              } else {
                if (this.field_N == 4) {
                  break L3;
                } else {
                  if (-75 != (this.field_N ^ -1)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            if (3 == this.j(20640)) {
              var2 = var2 + this.d(1, 83);
              break L1;
            } else {
              break L2;
            }
          }
          L4: {
            if (3 != this.g(param0 + -3257)) {
              break L4;
            } else {
              if ((this.j(20640) ^ -1) == -3) {
                var2 = var2 + this.d(1, param0 + -3158);
                break L1;
              } else {
                break L4;
              }
            }
          }
          if ((this.g(0) ^ -1) != -3) {
            break L1;
          } else {
            if (this.j(20640) == 1) {
              var2 = var2 + this.d(1, 88);
              break L1;
            } else {
              break L1;
            }
          }
        }
        if (param0 == 3257) {
          return var2;
        } else {
          return 117;
        }
    }

    private final boolean v(int param0) {
        if (param0 != 10) {
            this.field_u = true;
        }
        return (bw.field_m[this.field_N][10] & 1) > 0 ? true : false;
    }

    final boolean r(int param0) {
        if (param0 != -40) {
            return true;
        }
        return (this.field_N ^ -1) != -40 ? true : false;
    }

    final void A(int param0) {
        this.field_db = param0;
        this.field_k = -1;
    }

    final boolean d(byte param0) {
        if (param0 != 105) {
            return true;
        }
        return -1 > (bw.field_m[this.field_N][10] & 16 ^ -1) ? true : false;
    }

    final static void m(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            if (io.a(rq.field_n, (byte) 108)) {
              if (!as.field_B) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var17 = rq.field_n;
                var13 = var17;
                var6 = var13;
                var1 = var6;
                var24 = ei.field_e;
                var3 = 0;
                L1: while (true) {
                  if (var3 >= 8) {
                    var1_int = 0;
                    L2: while (true) {
                      if (var1_int >= so.field_a.length) {
                        var18 = ei.field_e;
                        var14 = var18;
                        var8 = var14;
                        var1 = var8;
                        var25 = rq.field_n;
                        var3 = 0;
                        L3: while (true) {
                          if ((var3 ^ -1) <= -9) {
                            var19 = i.field_Nb;
                            var15 = var19;
                            var10 = var15;
                            var1 = var10;
                            var26 = rq.field_n;
                            var3 = 0;
                            var4 = 124 % ((-63 - param0) / 63);
                            L4: while (true) {
                              if (var3 >= 8) {
                                var20 = rq.field_n;
                                var16 = var20;
                                var12 = var16;
                                var1 = var12;
                                var2 = 0;
                                L5: while (true) {
                                  if ((var2 ^ -1) <= -9) {
                                    decompiledRegionSelector0 = 2;
                                    break L0;
                                  } else {
                                    var20[var2] = 0;
                                    var2++;
                                    continue L5;
                                  }
                                }
                              } else {
                                var10[var3] = oe.c(var19[var3], var26[var3]);
                                var3++;
                                continue L4;
                              }
                            }
                          } else {
                            var8[var3] = oe.c(var18[var3], var25[var3]);
                            var3++;
                            continue L3;
                          }
                        }
                      } else {
                        L6: {
                          if (rb.a(var1_int, rq.field_n, 1)) {
                            ai.field_P.a((byte) -119, (tc) (new jg(var1_int)));
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var1_int++;
                        continue L2;
                      }
                    }
                  } else {
                    var6[var3] = rn.a(var17[var3], var24[var3] ^ -1);
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1_ref), "jd.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void a(byte param0) {
        int var2 = 8 / ((19 - param0) / 34);
        this.field_l.a((jd) (this), -97);
    }

    jd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, ha param9, int param10, int param11, int param12, boolean param13, int param14) {
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var16 = null;
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
        try {
          L0: {
            L1: {
              this.field_J = param0;
              this.field_A = param8;
              stackIn_3_0 = this;

              if ((param6 & 64) == 0) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((jd) (this)).field_C = stackIn_4_1 != 0;
              this.field_B = 3 & param6;
              stackIn_6_0 = this;

              if ((256 & param6) == 0) {
                stackIn_7_0 = this;
                stackIn_7_1 = 0;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = 1;
                break L2;
              }
            }
            L3: {
              ((jd) (this)).field_bb = stackIn_7_1 != 0;
              this.field_r = param12;
              stackIn_9_0 = this;

              if (-1 == (param6 & 4 ^ -1)) {
                stackIn_10_0 = this;
                stackIn_10_1 = 0;
                break L3;
              } else {
                stackIn_10_0 = this;
                stackIn_10_1 = 1;
                break L3;
              }
            }
            L4: {
              ((jd) (this)).field_s = stackIn_10_1 != 0;
              this.field_l = param9;
              this.field_m = 0;
              this.field_t = param4;
              this.field_M = 0;
              this.field_cb = param14;
              this.field_N = param2;
              this.field_ab = param7;
              stackIn_12_0 = this;

              if (0 == (param6 & 8)) {
                stackIn_13_0 = this;
                stackIn_13_1 = 0;
                break L4;
              } else {
                stackIn_13_0 = this;
                stackIn_13_1 = 1;
                break L4;
              }
            }
            L5: {
              ((jd) (this)).field_W = stackIn_13_1 != 0;
              stackIn_15_0 = this;

              if ((512 & param6) == 0) {
                stackIn_16_0 = this;
                stackIn_16_1 = 0;
                break L5;
              } else {
                stackIn_16_0 = this;
                stackIn_16_1 = 1;
                break L5;
              }
            }
            L6: {
              ((jd) (this)).field_D = stackIn_16_1 != 0;
              this.field_O = param3;
              stackIn_18_0 = this;

              if (0 == (param6 & 32)) {
                stackIn_19_0 = this;
                stackIn_19_1 = 0;
                break L6;
              } else {
                stackIn_19_0 = this;
                stackIn_19_1 = 1;
                break L6;
              }
            }
            L7: {
              ((jd) (this)).field_F = stackIn_19_1 != 0;
              this.field_Y = param5;
              stackIn_21_0 = this;

              if ((16 & param6) == 0) {
                stackIn_22_0 = this;
                stackIn_22_1 = 0;
                break L7;
              } else {
                stackIn_22_0 = this;
                stackIn_22_1 = 1;
                break L7;
              }
            }
            L8: {
              ((jd) (this)).field_I = stackIn_22_1 != 0;
              this.field_o = param11;
              this.field_P = param10;
              this.field_w = param1;
              if (param13) {
                break L8;
              } else {
                param9.field_Eb[param0 + param9.field_v * param1].field_c = (jd) (this);
                this.a((byte) -122);
                break L8;
              }
            }
            L9: {
              L10: {
                this.field_z = -1;
                this.field_R = new int[3];
                this.field_fb = 1792;
                if (0 != this.field_N) {
                  break L10;
                } else {
                  if (!this.field_W) {
                    break L10;
                  } else {
                    this.field_K = ov.field_a;
                    break L9;
                  }
                }
              }
              if (this.field_N >= dn.field_Pb.length) {
                break L9;
              } else {
                this.field_K = dn.field_Pb[this.field_N];
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var16 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var16);

            stackIn_32_1 = new StringBuilder().append("jd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');

            if (param9 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L11;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    jd() {
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
    }

    jd(int param0, int param1, int param2) {
        this.field_E = 0;
        this.field_q = -1;
        this.field_k = -1;
        this.field_db = -1;
        this.field_H = 0;
        this.field_S = false;
        this.field_G = false;
        this.field_w = param1;
        this.field_J = param0;
        this.field_N = param2;
    }

    static {
        field_n = "Resizable";
        field_y = "Level:<nbsp><col=ff0000><%0></col>  Speed:<nbsp><col=ff0000><%1></col>  Strength:<nbsp><col=ff0000><%2></col>  Range:<nbsp><col=ff0000><%4></col>  Cost:<nbsp><col=ff0000><%5></col>";
        field_T = "This unit is already poisoned.";
    }
}
