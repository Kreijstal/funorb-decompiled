/*
 * Decompiled by CFR-JS 0.4.0.
 */
class al {
    static String field_c;
    int field_d;
    int[] field_h;
    int field_k;
    static boolean field_e;
    int field_g;
    static dj field_a;
    private int field_j;
    static vn field_f;
    int field_i;
    private boolean field_l;
    jp field_b;

    private final void d(int param0, int param1) {
        if (param0 >= 0 &&
          this.field_h.length > param0) {
          param0 = this.field_h[param0];
          if (0 <= param0 &&
            param0 != 12 &&
            13 != param0 &&
            this.field_b.d(param1 ^ -61)) {
            wm.a(param1 + 28, vb.field_D[68]);
          }
          if (param1 != 68) {
            this.a(35, 8);
          }
          return;
        }
    }

    public static void c(byte param0) {
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != 2) {
          al.a((dj) null, 55, (dj) null, (dj) null);
        }
    }

    void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ZombieDawn.field_J;
        if (bd.field_e == 640 &&
          nh.field_P == 480) {
          if (param0 <= 105) {
            this.field_l = false;
          }
          L3: {
            L4: {
              var2 = this.field_d;
              if (var2 != 1 && ((14 != var2 ||
                var5 != 0) &&
                (var2 != 8 ||
                var5 != 0))) {
                if (2 == var2) {
                  break L4;
                }
                if (var2 == 3 &&
                  var5 == 0) {
                  break L4;
                }
                if (4 == var2 &&
                  var5 == 0) {
                  break L4;
                }
                if (var2 == 5 &&
                  var5 == 0) {
                  break L4;
                }
                if (var2 == 6 &&
                  var5 == 0) {
                  break L4;
                }
                if (7 == var2 &&
                  var5 == 0) {
                  break L4;
                }
                switch (var2) {
                  case 9:
                    break L4;
                  case 13:
                    break L4;
                  case 11:
                    break L3;
                  default:
                    return;
                  case 12:
                    if (var5 == 0) {
                      break L3;
                    }
                    break;
                }
              }
              qk.field_Hb[0].e(0, 0);
              if (var5 == 0) {
                return;
              }
            }
            qk.field_Hb[4].e(0, 0);
            if (var5 == 0) {
              return;
            }
          }
          bi.b(0, 0, 640, 480, 65793);
          return;
        }
        L13: {
          L14: {
            L15: {
              var2 = bd.field_e / 128;
              var3 = nh.field_P / 96;
              var4 = this.field_d;
              if (1 != var4 &&
                var4 != 14 &&
                var4 != 8) {
                if (2 == var4) {
                  break L15;
                }
                if (var4 == 3 &&
                  var5 == 0) {
                  break L15;
                }
                if (var4 == 4 &&
                  var5 == 0) {
                  break L15;
                }
                if (var4 == 5 &&
                  var5 == 0) {
                  break L15;
                }
                switch (var4) {
                  case 6:
                    break L15;
                  case 7:
                    break L15;
                  case 9:
                    break L15;
                  case 13:
                    break L15;
                  case 11:
                    break L14;
                  default:
                    break L13;
                  case 12:
                    if (var5 == 0) {
                      break L14;
                    }
                    break;
                }
              }
              qk.field_Hb[0].a(-var2, -var3, bd.field_e + 2 * var2, nh.field_P + 2 * var3);
              of.a(11690);
              if (var5 == 0) {
                break L13;
              }
            }
            qk.field_Hb[4].a(-var2, -var3, bd.field_e + var2 * 2, nh.field_P + var3 * 2);
            of.a(11690);
            if (var5 == 0) {
              break L13;
            }
          }
          bi.b(0, 0, bd.field_e, nh.field_P, 65793);
        }
    }

    final void a(int param0, byte param1, boolean param2) {
        int var6 = 0;
        int var4 = 2 * param0;
        int var5 = param0 >= 128 ? param0 * 2 - 256 : 0;
        int var6Lifetime1;
        if (param2) {
          var6 = var4;
          var4 = var5;
          var5 = var6;
        }
        var6Lifetime1 = this.field_d;
        if (0 == var6Lifetime1) {
          var6Lifetime1 = 2;
        }
        if (11 == var6Lifetime1) {
          var6Lifetime1 = 1;
        }
        lf.field_h.a();
        qk.field_Jb[var6Lifetime1].b((byte) 119);
        cn.field_f.b(64);
        int var7 = -57 / ((param1 + 72) / 47);
        lf.field_h.c(0, 0, var4, var5);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    int c(int param0, int param1) {
        if (param1 != 6) {
          this.field_k = -83;
        }
        if (!this.field_l) {
          return this.field_i * param0 + (this.field_g + vh.field_b);
        }
        return vh.field_b + this.field_g;
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_74_0 = 0;
        vn stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        boolean stackIn_80_3;
        int var4;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        vn var19;
        int var20;
        int var21;
        int var22;
        var22 = ZombieDawn.field_J;
        var4 = this.a(param0, -1);
        var5 = this.c(param0, 6);
        var6 = this.field_h[param0];
        if (var6 != 22 &&
          var6 != 23 &&
          24 != var6 &&
          25 != var6 &&
          27 != var6 &&
          var6 != 28 &&
          29 != var6 &&
          var6 != 30 &&
          31 != var6 &&
          var6 != 32 &&
          var6 != 33 &&
          var6 != 44 &&
          var6 != 26) {
          var7 = vk.field_b[var6];
          var8 = this.a(true, param0) - var5;
          var9 = this.b(param0, true);
          stackIn_18_0 = (!param2) ? 0 : 2;
          var10 = stackIn_18_0;
          if (var6 == 4 &&
            cn.field_b == null && (!(be.field_j > 0) ||
            !nh.a((byte) 77, vh.field_a))) {
            stackIn_26_0 = (!param2) ? 6 : 7;
            var10 = stackIn_26_0;
          }
          if (this.field_d == 3 && (var6 == 8 &&
            ad.field_e == 0 ||
            var6 == 9 &&
            1 == ad.field_e ||
            var6 == 10 &&
            ad.field_e == 2)) {
            stackIn_40_0 = (param2) ? 1 : 10;
            var10 = stackIn_40_0;
          }
          if (dj.field_e != null) {
            stackIn_44_0 = dj.field_e.j(-5402);
          } else {
            stackIn_44_0 = 0;
          }
          boolean decompiledFrameRemainder1 = true;
          var11 = stackIn_44_0;
          if (var7 == null) {
            var7 = "ERROR: missing text";
            decompiledFrameRemainder1 = (var22 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (var6 != 20) {
              if (var6 == 21) {
                if (var11 == 0) {
                  var10 = 6;
                }
                var7 = s.a(1938762664, var7, new String[]{Integer.toString(var11)});
                if (var22 != 0) {
                  var7 = s.a(1938762664, var7, new String[]{Integer.toString(var11)});
                }
              }
            } else {
              var7 = s.a(1938762664, var7, new String[]{Integer.toString(var11)});
            }
          }
          var12 = -sg.field_jb.field_x - sg.field_jb.field_I - ca.field_b[6].field_q + (-ca.field_b[0].field_q + var9);
          if (param1 > -123) {
            field_c = (String) null;
          }
          if (var6 == 12 ||
            var6 == 13) {
            stackIn_62_0 = (12 == var6) ? 224 : 288;
            var13 = stackIn_62_0;
            var14 = 137 + ff.field_b;
            var15 = (var8 - var14 >> 1) + var5;
            sg.field_jb.c(var7, var15, (var12 >> 1) + (ca.field_b[0].field_q + sg.field_jb.field_I + var4), var10, 0);
            var15 = var15 + (ff.field_b + 8);
            bi.c(var15, var9 / 2 + var4 - 1, 129, 2, var10);
            if (var6 == 12) {
              stackIn_65_0 = ge.field_c;
            } else {
              stackIn_65_0 = ce.field_u;
            }
            boolean decompiledFrameRemainder0 = true;
            var16 = stackIn_65_0;
            var16 = (var16 << 8) / var13;
            if (ad.field_g == null ||
              ad.field_g[0] == null ||
              ad.field_g[0][0] == null) {
              bi.b(-1 + (var16 >> 1) + var15, 3 + var4, 3, -6 + var9, 6684672);
              bi.c(-1 + (var16 >> 1) + var15, var4 + 3, 3, -6 + var9, 11141120);
              decompiledFrameRemainder0 = (var22 != 0);
            }
            if (decompiledFrameRemainder0) {
              stackIn_74_0 = (var6 == 12) ? 0 : 1;
              var17 = stackIn_74_0;
              var18 = (int)((tp.field_p >> 3) % 7L) + 7;
              if (param2) {
                var18 = (int)((tp.field_p >> 3) % 4L) + 14;
              }
              bi.b(var15, var9 / 2 + var4 - 1, 129, 6, 6815744);
              bi.b(var15, -1 + var9 / 2 + var4, (var16 >> 1) + 1, 6, 13373713);
              bi.c(var15, -1 + (var4 + var9 / 2), 129, 6, var10);
              bi.e(var15, var4 + (var9 / 2 - 1), 129, 6, 1, var10);
              stackIn_79_0 = ad.field_g[var17][var18];
              stackIn_79_1 = 0;
              stackIn_79_2 = 339;
              stackIn_80_3 = (var6 == 12);
              var19 = fj.a(stackIn_79_0, stackIn_79_1, stackIn_79_2, stackIn_80_3);
              var20 = 1;
              var21 = 1;
              var19.h(var15 + (var16 >> 1) + (-1 + (-23 + var20)), var21 - 10 + var4 + 2, 1);
              var19.b(var15 + ((var16 >> 1) - 24), 2 + var4 - 10);
            }
            if (var22 == 0) {
              return;
            }
          }
          sg.field_jb.a(var7, var5 + (var8 >> 1), var4 + (sg.field_jb.field_I + ca.field_b[0].field_q) + (var12 >> 1), var10, 0);
          return;
        }
    }

    void a(int param0) {
        int var3;
        var3 = ZombieDawn.field_J;
        if (!this.field_l) {
          this.field_b.a(0, param0 ^ 31644);
          if (var3 != 0) {
            this.field_b.a(21657);
          }
        } else {
          this.field_b.a(21657);
        }
        if (0 > this.field_b.field_d) {
          return;
        }
        if (this.field_d == 2 &&
          this.field_h[this.field_b.field_d] == 21 &&
          dj.field_e.j(-5402) == 0) {
          if (kg.field_i != 98) {
            if (99 == kg.field_i) {
              this.field_b.b(this.field_b.field_d + 1, param0 + 31542);
              if (var3 != 0) {
                this.field_b.b(this.field_b.field_d - 1, -69);
              }
            }
          } else {
            this.field_b.b(this.field_b.field_d - 1, -69);
          }
        }
        if (param0 != -31645) {
          this.field_d = -13;
        }
    }

    void a(byte param0, boolean param1) {
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = ZombieDawn.field_J;
        var3 = this.field_b.field_d;
        if (this.field_d == 11) {
          return;
        }
        if (this.field_d == 0) {
          vl.field_b.a(-1, param1);
          return;
        }
        if (this.field_d == 8) {
          var4 = jp.field_c.b(param1, 257);
          if (var4 == 3) {
            ca.a(true, true, 1);
          }
          if (var4 == 1) {
            ca.a(false, true, 1);
          }
          if (var4 == 2) {
            ca.a(true, true, 1);
          }
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (param1) {
          this.field_b.a((byte) -13, this.b(true, ha.field_b, ei.field_K), this.b(true, nc.field_j, hp.field_D));
          if (-1 != this.field_b.field_d) {
            this.d(this.field_b.field_d, 68);
            this.a(true, this.field_b.field_d, -8512);
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if ((decompiledFrameRemainder0) &&
            (ci.field_d == 1)) {
            if (9 == this.field_d) {
              ((pl) (this)).a((byte) -114, ei.field_K, ha.field_b);
              if ((var5 != 0) &&
                (this.field_d == 13)) {
                ((ac) (this)).b(ha.field_b, 32526, ei.field_K);
              }
            } else {
              if (this.field_d == 13) {
                ((ac) (this)).b(ha.field_b, 32526, ei.field_K);
              }
            }
          }
        }
        var4Lifetime1 = 62 % ((-39 - param0) / 61);
        if (var3 != this.field_b.field_d &&
          this.field_b.field_d != -1) {
          kh.a(69, false);
        }
    }

    final void b(int param0) {
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int[] var6;
        int[] var7;
        int[] var8;
        boolean decompiledFrameCompleted0 = true;
        boolean decompiledFrameRemainder0 = true;
        var5 = ZombieDawn.field_J;
        if (this.field_d != 2) {
          if (this.field_d != 3) {
            if (this.field_d != 5) {
              if ((9 != this.field_d) &&
                (decompiledFrameRemainder0 = (1 == this.field_d)) &&
                (decompiledFrameRemainder0 = !(be.field_j <= 0))) {
                var8 = new int[-1 + this.field_h.length];
                var7 = var8;
                var6 = var7;
                var2 = var6;
                var3 = 0;
                var4 = 0;
                while (this.field_h.length > var4) {
                  var6[var3] = this.field_h[var4];
                  stackIn_23_0 = var8[var3];
                  stackIn_23_1 = 42;
                  if (var5 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_23_0 == stackIn_23_1) {
                    var3--;
                  }
                  var4++;
                  var3++;
                }
                if (decompiledFrameCompleted0) {
                  this.field_h = var6;
                  this.field_b = new jp(this.field_h.length);
                  la.field_d.b(param0 ^ -20093, 1);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
              }
              if ((decompiledFrameCompleted0) &&
                (decompiledFrameRemainder0) &&
                (!(0 >= be.field_j))) {
                this.field_h[0] = 41;
                ((pl) (this)).field_o[0] = 41;
                if (var5 != 0) {
                  this.field_h = new int[]{5};
                  this.field_b = new jp(this.field_h.length);
                  this.field_h = new int[]{44, 44, 8, 9, 10, 5};
                  this.field_b = new jp(this.field_h.length);
                  this.field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
                  this.field_k = this.field_k - sg.field_jb.field_I / 2;
                  this.field_b = new jp(this.field_h.length);
                }
              }
            } else {
              this.field_h = new int[]{5};
              this.field_b = new jp(this.field_h.length);
              if (var5 != 0) {
                this.field_h = new int[]{44, 44, 8, 9, 10, 5};
                this.field_b = new jp(this.field_h.length);
                this.field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
                this.field_k = this.field_k - sg.field_jb.field_I / 2;
                this.field_b = new jp(this.field_h.length);
              }
            }
          } else {
            this.field_h = new int[]{44, 44, 8, 9, 10, 5};
            this.field_b = new jp(this.field_h.length);
            if (var5 != 0) {
              this.field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
              this.field_k = this.field_k - sg.field_jb.field_I / 2;
              this.field_b = new jp(this.field_h.length);
            }
          }
        } else {
          this.field_h = new int[]{1, 12, 13, 34, 4, 3, 21, 7};
          this.field_k = this.field_k - sg.field_jb.field_I / 2;
          this.field_b = new jp(this.field_h.length);
        }
        if (decompiledFrameCompleted0) {
          stackIn_23_0 = param0;
          stackIn_23_1 = 24136;
        }
        if (stackIn_23_0 != stackIn_23_1) {
          this.field_h = (int[]) null;
        }
    }

    int b(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_7_0 = false;
        var6 = ZombieDawn.field_J;
        if (!param0) {
          return 7;
        }
        var4 = 0;
        while (true) {
          if (var4 >= this.field_h.length) {
            return -1;
          }
          var5 = this.a(var4, -1);
          stackIn_7_0 = this.b(var4, -1);
          if (var6 != 0) {
            return stackIn_7_0 ? 1 : 0;
          }
          if (stackIn_7_0 &&
            this.c(var4, 6) <= param1 &&
            this.a(true, var4) > param1 &&
            var5 <= param2 &&
            param2 < var5 + this.b(var4, param0)) {
            return var4;
          }
          var4++;
        }
    }

    boolean a(int param0, int param1, char param2) {
        int var4;
        if (this.field_d == 0) {
          return vl.field_b.a(param0, param2, -29638);
        }
        if (param0 != 13) {
          if (this.field_d == 8) {
            var4 = jp.field_c.b(3782);
            if (var4 == 3) {
              ca.a(true, true, 1);
            }
            if (var4 == 1) {
              ca.a(false, true, 1);
            }
            return (0 != var4);
          }
          this.a(-31645);
          if (-1 != this.field_b.field_d) {
            this.d(this.field_b.field_d, param1 - 65725);
            this.a(false, this.field_b.field_d, param1 ^ -73791);
            return true;
          }
        } else {
          if (this.field_d == 2) {
            ca.a(false, true, 0);
            df.field_i = 1;
            return true;
          }
          if (10 != this.field_d) {
            if (this.field_d == 9) {
              ((pl) (this)).c(-26931);
              return true;
            }
            if (this.field_d == 13) {
              ((ac) (this)).e((byte) 54);
              return true;
            }
            if (this.field_d != 7 &&
              this.field_d != 1) {
              ca.a(false, true, df.field_i);
              return true;
            }
          }
        }
        if (param1 != 65793) {
          return true;
        }
        return false;
    }

    private final void a(int param0, boolean param1) {
        int var4;
        var4 = ZombieDawn.field_J;
        if (param0 != -10) {
          return;
        }
        if (!po.w(param0 + 13306)) {
          vl.field_b.c(true);
          vl.field_b.d(false);
          bd.field_m = null;
          if (!nk.a(8, kg.field_g)) {
            ca.a(param1, true, 3);
            if (var4 != 0) {
              ca.a(param1, true, 6);
              ca.a(param1, true, 7);
            }
          } else {
            ca.a(param1, true, 6);
            if (var4 != 0) {
              ca.a(param1, true, 7);
            }
          }
        } else {
          ca.a(param1, true, 7);
        }
        df.field_i = 1;
    }

    int a(int param0, int param1) {
        if (param1 != -1) {
          return 62;
        }
        if (this.field_l) {
          return id.field_M + param0 * this.field_i + this.field_k;
        }
        return id.field_M + this.field_k;
    }

    void a(boolean param0, int param1, int param2) {
        boolean stackIn_69_0 = false;
        boolean stackIn_69_1 = false;
        int stackIn_70_2 = 0;
        int stackIn_206_0 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = ZombieDawn.field_J;
        var4 = this.field_h[param1];
        if (param2 != -8512) {
          return;
        }
        L0: {
          L1: {
            L2: {
              L3: {
                L4: {
                  L5: {
                    boolean decompiledFrameRemainder22 = true;
                    boolean decompiledFrameRemainder21 = true;
                    boolean decompiledFrameRemainder20 = true;
                    boolean decompiledFrameRemainder19 = true;
                    boolean decompiledFrameRemainder18 = true;
                    boolean decompiledFrameRemainder17 = true;
                    boolean decompiledFrameRemainder16 = true;
                    boolean decompiledFrameRemainder15 = true;
                    boolean decompiledFrameRemainder14 = true;
                    boolean decompiledFrameRemainder13 = true;
                    boolean decompiledFrameRemainder12 = true;
                    boolean decompiledFrameRemainder11 = true;
                    boolean decompiledFrameRemainder10 = true;
                    boolean decompiledFrameRemainder9 = true;
                    boolean decompiledFrameRemainder8 = true;
                    boolean decompiledFrameRemainder7 = true;
                    boolean decompiledFrameRemainder6 = true;
                    boolean decompiledFrameRemainder5 = true;
                    boolean decompiledFrameRemainder4 = true;
                    boolean decompiledFrameRemainder3 = true;
                    boolean decompiledFrameRemainder2 = true;
                    boolean decompiledFrameRemainder1 = true;
                    boolean decompiledFrameRemainder0 = true;
                    var6 = var4;
                    if ((var6 != 0) &&
                      (decompiledFrameRemainder0 = (var6 != 42 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder1 = (var6 != 1 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder2 = (var6 != 41 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder3 = (var6 != 40 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder4 = (5 != var6)) &&
                      (decompiledFrameRemainder5 = (var6 != 16 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder6 = (14 != var6)) &&
                      (decompiledFrameRemainder7 = (3 != var6 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder8 = (var6 != 6)) &&
                      (decompiledFrameRemainder9 = (var6 != 43)) &&
                      (decompiledFrameRemainder10 = (var6 != 2)) &&
                      (decompiledFrameRemainder11 = (var6 != 12)) &&
                      (decompiledFrameRemainder12 = (var6 != 13)) &&
                      (decompiledFrameRemainder13 = (var6 != 4 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder14 = (7 != var6)) &&
                      (decompiledFrameRemainder15 = (44 != var6)) &&
                      (decompiledFrameRemainder16 = (var6 != 8 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder17 = (var6 != 9 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder18 = (var6 != 10 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder19 = (var6 != 15)) &&
                      (decompiledFrameRemainder20 = (var6 != 17)) &&
                      (decompiledFrameRemainder21 = (var6 != 18 ||
                      var9 != 0)) &&
                      (decompiledFrameRemainder22 = (11 != var6))) {
                      if (var6 == 19) {
                        break L5;
                      }
                      if (20 == var6 &&
                        var9 == 0) {
                        break L4;
                      }
                      if (var6 == 21) {
                        break L4;
                      }
                      if (var6 == 34 &&
                        var9 == 0) {
                        break L3;
                      }
                      if (37 == var6) {
                        break L2;
                      }
                      if (var6 == 35) {
                        break L1;
                      }
                      if (var6 == 36 &&
                        var9 == 0) {
                        break L1;
                      }
                      if (var6 == 38) {
                        break L1;
                      }
                      if (var6 != 39) {
                        break L0;
                      }
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      if (!this.field_b.d(-127)) {
                        break L0;
                      }
                      wi.field_b = null;
                      bd.field_m = null;
                      stackIn_69_0 = param0;
                      stackIn_69_1 = true;
                      if (0 < be.field_j) {
                        stackIn_70_2 = 13;
                      } else {
                        stackIn_70_2 = 9;
                      }
                      ca.a(stackIn_69_0, stackIn_69_1, stackIn_70_2);
                      df.field_i = 1;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1)) {
                      if (!this.field_b.d(-128)) {
                        break L0;
                      }
                      ca.a(param0, true, 8);
                      df.field_i = 1;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2)) {
                      if (!this.field_b.d(param2 + 8386)) {
                        break L0;
                      }
                      ca.a(param0, true, 0);
                      df.field_i = 1;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3)) {
                      if (!this.field_b.d(-122)) {
                        break L0;
                      }
                      ca.a(param0, true, 13);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4)) {
                      if (!this.field_b.d(-122)) {
                        break L0;
                      }
                      ca.a(param0, true, 9);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5)) {
                      if (!this.field_b.d(-128)) {
                        break L0;
                      }
                      ca.a(param0, true, 1);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6)) {
                      if (!this.field_b.d(-127)) {
                        break L0;
                      }
                      var6 = 1;
                      ca.a(param0, true, var6);
                      var12 = kg.field_g;
                      var11 = var12;
                      var10 = var11;
                      var7_ref_int__ = var10;
                      var8 = 0;
                      do {
                        if (8 <= var8) {
                          var7_ref_int__ = dj.field_i;
                          break;
                        }
                        var12[var8] = 0;
                        var8++;
                      } while (var9 == 0);
                      var8 = 0;
                      do {
                        if (8 <= var8) {
                          kk.field_j.b(param2 + 8482);
                          dn.field_D.b(-63);
                          to.field_b[0] = 0;
                          break;
                        }
                        var7_ref_int__[var8] = 0;
                        var8++;
                      } while (var9 == 0);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7)) {
                      if (!this.field_b.d(-127)) {
                        break L0;
                      }
                      ca.a(param0, true, 5);
                      df.field_i = this.field_d;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8)) {
                      if (!this.field_b.d(-126)) {
                        break L0;
                      }
                      ((fg) (qk.field_Jb[4])).d((byte) -37);
                      ca.a(param0, true, 4);
                      df.field_i = this.field_d;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9)) {
                      if (!this.field_b.d(-122)) {
                        break L0;
                      }
                      ca.a(param0, true, df.field_i);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10)) {
                      if (!this.field_b.d(param2 + 8388)) {
                        break L0;
                      }
                      ca.a(param0, true, 14);
                      df.field_i = this.field_d;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11)) {
                      if (!this.field_b.d(param2 + 8386)) {
                        break L0;
                      }
                      ca.a(param0, true, 3);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12)) {
                      var5 = ge.field_c;
                      if (this.field_b.b(false)) {
                        qb.a(false, 0);
                      }
                      if (this.field_b.f(param2 ^ 8536)) {
                        qb.a(false, 224);
                      }
                      if (this.field_b.b(-126)) {
                        var6 = 137 + ff.field_b;
                        var7 = (this.c(param1, 6) + (this.a(true, param1) - var6) >> 1) + (ff.field_b + 8);
                        var8 = ha.field_b - var7 << 1;
                        var8 = var8 * 224 >> 8;
                        if (var8 <= 0) {
                          qb.a(false, 0);
                          if (var9 != 0) {
                            if (224 <= var8) {
                              qb.a(false, 224);
                              qb.a(false, var8);
                            } else {
                              qb.a(false, var8);
                            }
                          }
                        } else {
                          if (224 <= var8) {
                            qb.a(false, 224);
                            if (var9 != 0) {
                              qb.a(false, var8);
                            }
                          } else {
                            qb.a(false, var8);
                          }
                        }
                      }
                      if (this.field_b.c(-97)) {
                        boolean decompiledSharedTail2 = !(ge.field_c <= 28);
                        if (!decompiledSharedTail2) {
                          qb.a(false, 0);
                          decompiledSharedTail2 = (var9 != 0);
                        }
                        if (decompiledSharedTail2) {
                          var6 = ge.field_c % 28;
                          if (0 == var6) {
                            var6 = 28;
                          }
                          qb.a(false, -var6 + ge.field_c);
                        }
                      }
                      if (this.field_b.e(-98)) {
                        boolean decompiledSharedTail1 = !(ge.field_c >= 196);
                        if (!decompiledSharedTail1) {
                          qb.a(false, 224);
                          decompiledSharedTail1 = (var9 != 0);
                        }
                        if (decompiledSharedTail1) {
                          var6 = ge.field_c % 28;
                          qb.a(false, 28 + (ge.field_c - var6));
                        }
                      }
                      if (ge.field_c == var5) {
                        break L0;
                      }
                      if (null != wh.field_e &&
                        !wh.field_e.l()) {
                        break L0;
                      }
                      wh.field_e = kh.a(47, false);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13)) {
                      if (this.field_b.b(false)) {
                        ZombieDawn.b(127, 0);
                      }
                      if (this.field_b.f(-104)) {
                        ZombieDawn.b(115, 288);
                      }
                      if (this.field_b.b(param2 ^ 8491)) {
                        var6 = ff.field_b + 137;
                        var7 = 8 + ((this.c(param1, 6) + this.a(true, param1) - var6 >> 1) + ff.field_b);
                        var8 = ha.field_b - var7 << 1;
                        var8 = var8 * 288 >> 8;
                        if (var8 > 0) {
                          if (288 <= var8) {
                            ZombieDawn.b(param2 ^ -8521, 288);
                            if (var9 != 0) {
                              ZombieDawn.b(124, var8);
                              ZombieDawn.b(118, 0);
                            }
                          } else {
                            ZombieDawn.b(124, var8);
                            if (var9 != 0) {
                              ZombieDawn.b(118, 0);
                            }
                          }
                        } else {
                          ZombieDawn.b(118, 0);
                        }
                      }
                      if (this.field_b.c(-97)) {
                        var6 = ce.field_u;
                        boolean decompiledSharedTail0 = !(36 >= var6);
                        if (!decompiledSharedTail0) {
                          ZombieDawn.b(124, 0);
                          decompiledSharedTail0 = (var9 != 0);
                        }
                        if (decompiledSharedTail0) {
                          var7 = var6 % 36;
                          if (var7 == 0) {
                            var7 = 36;
                          }
                          ZombieDawn.b(param2 + 8635, var6 - var7);
                        }
                      }
                      if (!this.field_b.e(param2 ^ 8542)) {
                        break L0;
                      }
                      var6 = ce.field_u;
                      if (252 <= var6) {
                        ZombieDawn.b(119, 288);
                      }
                      if (252 > var6 ||
                        var9 != 0) {
                        var7 = var6 % 36;
                        ZombieDawn.b(127, 36 + (var6 - var7));
                      }
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14)) {
                      if (!this.field_b.d(-123)) {
                        break L0;
                      }
                      ra.d((byte) 76);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15)) {
                      if (!this.field_b.d(-123)) {
                        break L0;
                      }
                      if (2 == this.field_d) {
                        tp.a(param2 ^ -8478, false, w.field_a[5]);
                      }
                      this.a(-10, param0);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16)) {
                      if (!this.field_b.d(-122)) {
                        break L0;
                      }
                      ((vj) (jj.c(3, 115))).d((byte) 77);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17)) {
                      if (!this.field_b.d(param2 + 8389)) {
                        break L0;
                      }
                      ad.field_e = 0;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18)) {
                      if (!this.field_b.d(-128)) {
                        break L0;
                      }
                      ad.field_e = 1;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder19)) {
                      if (!this.field_b.d(-122)) {
                        break L0;
                      }
                      ad.field_e = 2;
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21) &&
                      (decompiledFrameRemainder20)) {
                      if (!this.field_b.d(-121)) {
                        break L0;
                      }
                      if (this.field_d == 5 ||
                        3 == this.field_d) {
                        hd.a(this.field_d, param2 ^ 8500, this.field_d);
                        if (var9 == 0) {
                          break L0;
                        }
                      }
                      if (7 != this.field_d) {
                        break L0;
                      }
                      stackIn_206_0 = (nk.a(param2 + 8520, kg.field_g)) ? 6 : 3;
                      hd.a(stackIn_206_0, -126, 7);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if ((decompiledFrameRemainder22) &&
                      (decompiledFrameRemainder21)) {
                      if (!this.field_b.d(-128)) {
                        break L0;
                      }
                      if (!this.b(param1, param2 + 8511)) {
                        break L0;
                      }
                      ((fg) (qk.field_Jb[4])).c(20921, param0);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if (decompiledFrameRemainder22) {
                      if (!this.field_b.d(-124)) {
                        break L0;
                      }
                      if (!this.b(param1, param2 + 8511)) {
                        break L0;
                      }
                      ((fg) (qk.field_Jb[4])).b(param0, 126);
                      if (var9 == 0) {
                        break L0;
                      }
                    }
                    if (!this.field_b.d(-126)) {
                      break L0;
                    }
                    if (null != cn.field_b) {
                      re.a((byte) -71);
                    }
                    bo.a(-99, hc.a(param2 + 8512));
                    if (var9 == 0) {
                      break L0;
                    }
                  }
                  if (!this.field_b.d(-125)) {
                    break L0;
                  }
                  if (!vl.field_b.g(true)) {
                    this.a(param2 ^ 8502, param0);
                    if (var9 == 0) {
                      break L0;
                    }
                  }
                  ca.a(true, true, 0);
                  if (var9 == 0) {
                    break L0;
                  }
                }
                if (!this.field_b.d(-125)) {
                  break L0;
                }
                if (!vl.field_b.b(-25983)) {
                  break L0;
                }
                vl.field_b.a(param2 + 8398);
                ca.a(true, true, 0);
                if (var9 == 0) {
                  break L0;
                }
              }
              if (!this.field_b.d(param2 + 8388)) {
                break L0;
              }
              dc.a((byte) 124);
              vk.field_b[34] = hc.a(true);
              if (var9 == 0) {
                break L0;
              }
            }
            if (!this.field_b.d(-124)) {
              break L0;
            }
            if (vi.field_a) {
              vk.field_b[37] = wl.field_a[0];
              vi.field_a = false;
              if (var9 == 0) {
                break L0;
              }
            }
            vk.field_b[37] = wl.field_a[1];
            vi.field_a = true;
            if (var9 == 0) {
              break L0;
            }
          }
          if (this.field_b.d(param2 ^ 8520)) {
            this.a(-10, param0);
          }
        }
    }

    boolean b(int param0, int param1) {
        if (this.field_h[param0] != 39 &&
          this.field_h[param0] != 45 &&
          this.field_h[param0] != 46) {
          if (param1 != -1) {
            this.a(71, -63);
          }
          if (this.field_h[param0] != 21) {
            return true;
          }
          if (dj.field_e.j(-5402) != 0) {
            return true;
          }
          return false;
        }
        return false;
    }

    void a(byte param0) {
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0;
        boolean stackIn_16_3;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        Object stackIn_40_0;
        boolean stackIn_40_3;
        int var2;
        int var3;
        int var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var4Lifetime1;
        int var2Lifetime3;
        var5 = ZombieDawn.field_J;
        if (this.field_d == 0) {
          vl.field_b.e(9844);
          return;
        }
        if (this.field_d == 11) {
          return;
        }
        if (this.field_d == 7) {
          li.a(false);
          var2 = 100 + sg.field_jb.field_I;
          var3 = 4 + sg.field_jb.field_x + sg.field_jb.field_w;
          var4 = 16777215;
          bj.field_q.a(wi.field_d, 320, var2, var4, -1);
          bj.field_q.a(ma.a(rf.field_d, 98, eh.field_z, false), 320, var3 + var2, var4, -1);
          bj.field_q.a(fh.a(false, rf.field_d, 0, eh.field_z), 320, 42 + (var3 * 3 + var2), var4, -1);
          bj.field_q.a(g.a(rf.field_d, -121, false, eh.field_z), 320, var2 + var3 * 4 + 84, var4, -1);
          if (param0 > -35) {
            this.field_j = -46;
          }
          var2Lifetime3 = 0;
          while (this.field_b.field_h > var2Lifetime3) {
            if (var5 != 0) {
              return;
            }
            if (this.b(var2Lifetime3, -1) ||
              21 == this.field_h[var2Lifetime3]) {
              stackIn_15_1 = var2Lifetime3;
              stackIn_15_2 = -128;
              if (this.field_b.field_d != var2Lifetime3) {
                stackIn_16_0 = this;
                stackIn_16_3 = false;
              } else {
                stackIn_16_0 = this;
                stackIn_16_3 = true;
              }
              this.a(stackIn_15_1, stackIn_15_2, stackIn_16_3);
            }
            var2Lifetime3++;
          }
          if (ed.field_b[this.field_d] != null) {
            ed.field_b[this.field_d].b(vh.field_b, id.field_M / 2);
          }
          return;
        }
        if (this.field_d == 8) {
          jp.field_c.b((byte) 123);
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (2 == this.field_d) {
          li.a(false);
          decompiledFrameRemainder0 = (var5 != 0);
        }
        if ((decompiledFrameRemainder0) &&
          (10 == this.field_d)) {
          li.a(false);
          if (var5 != 0) {
            li.a(false);
            var2Lifetime1 = 100 + sg.field_jb.field_I;
            var3Lifetime1 = 4 + sg.field_jb.field_x + sg.field_jb.field_w;
            var4Lifetime1 = 16777215;
            bj.field_q.a(wi.field_d, 320, var2Lifetime1, var4Lifetime1, -1);
            bj.field_q.a(ma.a(rf.field_d, 98, eh.field_z, false), 320, var3Lifetime1 + var2Lifetime1, var4Lifetime1, -1);
            bj.field_q.a(fh.a(false, rf.field_d, 0, eh.field_z), 320, 42 + (var3Lifetime1 * 3 + var2Lifetime1), var4Lifetime1, -1);
            bj.field_q.a(g.a(rf.field_d, -121, false, eh.field_z), 320, var2Lifetime1 + var3Lifetime1 * 4 + 84, var4Lifetime1, -1);
          }
        }
        if (param0 > -35) {
          this.field_j = -46;
        }
        var2Lifetime2 = 0;
        while (this.field_b.field_h > var2Lifetime2) {
          if (var5 != 0) {
            return;
          }
          if (this.b(var2Lifetime2, -1) ||
            21 == this.field_h[var2Lifetime2]) {
            stackIn_39_1 = var2Lifetime2;
            stackIn_39_2 = -128;
            if (this.field_b.field_d != var2Lifetime2) {
              stackIn_40_0 = this;
              stackIn_40_3 = false;
            } else {
              stackIn_40_0 = this;
              stackIn_40_3 = true;
            }
            this.a(stackIn_39_1, stackIn_39_2, stackIn_40_3);
          }
          var2Lifetime2++;
        }
        if (ed.field_b[this.field_d] != null) {
          ed.field_b[this.field_d].b(vh.field_b, id.field_M / 2);
        }
        return;
    }

    final static boolean a(dj param0, int param1, dj param2, dj param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a((byte) 73)) {
            return false;
          }
          if (!param2.a(-1, "commonui")) {
            return false;
          }
          if (param3.a((byte) 73) &&
            param3.a(-1, "commonui")) {
            if (param0.a((byte) 73) &&
              param0.a(param1 + 31525, "button.gif")) {
              if (param1 == -31526) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("al.WA(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    void a(al param0, int param1) {
        try {
          if (param1 < 70) {
            this.field_b = (jp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "al.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    int b(int param0, boolean param1) {
        if (!param1) {
          this.field_l = false;
        }
        return 42;
    }

    void a(byte param0, int param1, boolean param2) {
        if (this.field_b.field_d != -1) {
          param1 = this.field_b.field_d;
        }
        this.field_b.a(param2, (byte) -107, this.b(true, ha.field_b, ei.field_K), param1);
        if (param0 > 65) {
          if (8 == this.field_d) {
            jp.field_c.a(param2, 1);
          }
          if (this instanceof pl) {
            ((pl) (this)).b((byte) 122, true);
          }
          return;
        }
    }

    int a(boolean param0, int param1) {
        if (!param0) {
          return -117;
        }
        if (this.field_l) {
          return this.field_j + vh.field_b;
        }
        return this.c(param1, 6) + this.field_i;
    }

    al(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        try {
          this.field_i = param5;
          this.field_k = param4;
          this.field_j = param3;
          this.field_h = param6;
          this.field_g = param2;
          this.field_l = param1 ? true : false;
          this.field_d = param0;
          this.field_b = new jp(this.field_h.length);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "al.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = false;
        field_c = "Create";
    }
}
