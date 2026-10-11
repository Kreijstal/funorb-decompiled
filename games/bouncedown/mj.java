/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj {
    private nk[] field_m;
    static String field_j;
    static eh field_f;
    private nk[] field_c;
    static String field_k;
    private nk[] field_g;
    private nk[] field_i;
    boolean field_l;
    boolean field_e;
    boolean field_d;
    int field_n;
    private int field_h;
    boolean field_o;
    private int field_a;
    boolean field_b;

    final void b(int param0) {
        int stackIn_9_1 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            return;
          }
          if (this.field_e) {
            this.field_e = false;
            if (this.field_o) {
              stackIn_9_1 = -1;
            } else {
              stackIn_9_1 = 0;
            }
            this.field_n = stackIn_9_1;
          }
          if (this.field_l) {
            if (!this.field_o) {
              stackIn_17_1 = 0;
            } else {
              stackIn_17_1 = -1;
            }
            this.field_n = stackIn_17_1;
            this.field_l = false;
          }
          if (this.field_d) {
            this.field_d = false;
            if (!this.field_o) {
              stackIn_25_1 = 0;
            } else {
              stackIn_25_1 = -1;
            }
            this.field_n = stackIn_25_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "mj.C(" + param0 + ')');
        }
    }

    final static String b(byte param0) {
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        String stackIn_39_0 = null;
        String stackIn_41_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (2 > sa.field_k) {
            stackIn_2_0 = qh.field_e;
            return stackIn_2_0;
          }
          if (jb.field_a != null) {
            if (!jb.field_a.c(48)) {
              stackIn_10_0 = pc.field_p;
              return stackIn_10_0;
            }
            stackIn_12_0 = ii.field_l;
            return stackIn_12_0;
          }
          if (!pa.field_i.c(83)) {
            stackIn_15_0 = dk.field_b;
            return stackIn_15_0;
          }
          if (param0 != -26) {
            stackIn_18_0 = (String) null;
            return stackIn_18_0;
          }
          if (!pa.field_i.b("commonui", false)) {
            stackIn_23_0 = fi.field_a + " - " + pa.field_i.b("commonui", (byte) -100) + "%";
            return stackIn_23_0;
          }
          if (!kg.field_b.c(96)) {
            stackIn_26_0 = mg.field_k;
            return stackIn_26_0;
          }
          if (!kg.field_b.b("commonui", false)) {
            stackIn_29_0 = vc.field_B + " - " + kg.field_b.b("commonui", (byte) -100) + "%";
            return stackIn_29_0;
          }
          if (!ea.field_e.c(-111)) {
            stackIn_34_0 = se.field_F;
            return stackIn_34_0;
          }
          if (!ea.field_e.a((byte) -100)) {
            stackIn_39_0 = da.field_b + " - " + ea.field_e.a(100) + "%";
            return stackIn_39_0;
          }
          stackIn_41_0 = gf.field_h;
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "mj.E(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = Bounce.field_N;
        try {
          if (param1 != -31729) {
            return;
          }
          if (this.field_n == -1) {
            this.field_n = 0;
            if (!this.field_d) {
              return;
            }
            this.field_i[this.field_n].a(32 * param2, (byte) 99, param0);
            if (var5 == 0) {
              return;
            }
          }
          if (this.field_e ||
            this.field_l ||
            this.field_d) {
            if (!this.field_e) {
              if (!this.field_l) {
                if (!this.field_d) {
                  return;
                }
                this.field_i[this.field_n].a(param2 * 32, (byte) -84, param0);
                if (var5 == 0) {
                  return;
                }
              }
              this.field_g[this.field_n].a(param2 * 32, (byte) 114, param0);
              if (var5 == 0) {
                return;
              }
            }
            this.field_c[this.field_n].a(32 * param2, (byte) -61, param0);
            if (var5 == 0) {
              return;
            }
          }
          this.field_m[this.field_n].a(param2 * 32, (byte) -47, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var4), "mj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final mj a(byte param0) {
        int stackIn_27_0 = 0;
        boolean stackIn_45_1 = false;
        boolean stackIn_60_1 = false;
        nk stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        boolean stackIn_73_1 = false;
        boolean stackIn_82_1 = false;
        nk stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        boolean stackIn_112_1 = false;
        nk stackIn_125_0 = null;
        boolean stackIn_125_1 = false;
        boolean stackIn_132_1 = false;
        Object stackIn_140_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_44_1;
        boolean stackOut_72_1;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        nk stackIn_125_0Lifetime1;
        boolean stackIn_125_1Lifetime1;
        boolean stackIn_132_1Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = Bounce.field_N;
        try {
          if (~uc.field_C != ~this.field_h ||
            ~this.field_a != ~ll.field_y ||
            vh.field_e != 0) {
            this.field_o = true;
          }
          if (0 != vh.field_e &&
            -1 != fa.field_b) {
            if (ua.field_a == fa.field_b) {
              ua.field_a = -1;
              if (var4 != 0) {
                ua.field_a = fa.field_b;
              }
            } else {
              ua.field_a = fa.field_b;
            }
          }
          stackIn_27_0 = (this.field_b) ? 0 : 1;
          var2_int = stackIn_27_0;
          if (var2_int != 0) {
            this.field_e = false;
          }
          if (var2_int != 0) {
            this.field_d = false;
          }
          if (var2_int != 0) {
            this.field_l = false;
          }
          if (!this.field_l) {
            ua.field_a = -1;
          }
          var3 = 0;
          L10: while (true) {
            if (this.field_m.length > var3) {
              stackIn_69_0 = this.field_m[var3];
              stackOut_44_1 = this.field_b;
              stackIn_69_1 = stackOut_44_1 ? 1 : 0;
              stackIn_45_1 = stackOut_44_1;
              if (var4 == 0) {
                stackIn_60_1 = (stackIn_45_1) && (!this.field_e) && (!this.field_l) && (!this.field_d);
                if (((nk) (Object) stackIn_69_0).a(stackIn_60_1, (byte) -72)) {
                  var2_int = 0;
                }
                var3++;
                continue;
              }
            } else {
              if (!jh.b(767564065)) {
                this.field_c[10].field_f = "";
                this.field_c[10].field_i = 11;
                this.field_c[11].field_f = hi.field_b;
                this.field_c[11].field_i = 10;
                if (var4 == 0) {
                  break L10;
                }
              }
              this.field_c[11].field_f = qe.field_c;
              this.field_c[11].field_i = 14;
              this.field_c[10].field_f = hi.field_b;
              stackIn_69_0 = this.field_c[10];
              stackIn_69_1 = 10;
            }
            stackIn_69_0.field_i = stackIn_69_1;
            break;
          }
          var3Lifetime1 = 0;
          L18: while (true) {
            if (var3Lifetime1 < this.field_c.length) {
              stackIn_99_0 = this.field_c[var3Lifetime1];
              stackOut_72_1 = this.field_b;
              stackIn_99_1 = stackOut_72_1 ? 1 : 0;
              stackIn_73_1 = stackOut_72_1;
              if (var4 == 0) {
                stackIn_82_1 = (stackIn_73_1) && (this.field_e);
                if (((nk) (Object) stackIn_99_0).a(stackIn_82_1, (byte) -72)) {
                  var2_int = 0;
                }
                var3Lifetime1++;
                continue;
              }
            } else {
              if (kb.field_a > 0) {
                this.field_g[1].field_f = bk.field_d;
                this.field_g[1].field_i = 4;
                this.field_g[0].field_f = hi.field_b;
                this.field_g[0].field_i = 12;
                if (var4 == 0) {
                  break L18;
                }
              }
              if (jh.b(767564065)) {
                this.field_g[1].field_f = qe.field_c;
                this.field_g[1].field_i = 14;
                this.field_g[0].field_i = 12;
                this.field_g[0].field_f = hi.field_b;
                if (var4 == 0) {
                  break L18;
                }
              }
              this.field_g[0].field_f = hi.field_b;
              this.field_g[0].field_i = 12;
              stackIn_99_0 = this.field_g[1];
              stackIn_99_1 = 4;
            }
            stackIn_99_0.field_i = stackIn_99_1;
            this.field_g[1].field_f = "";
            break;
          }
          var3Lifetime2 = 0;
          L27: while (true) {
            boolean decompiledFrameCompleted0 = true;
            if (this.field_g.length > var3Lifetime2) {
              stackIn_125_0 = this.field_g[var3Lifetime2];
              stackIn_125_1 = this.field_b;
              if (var4 != 0) {
                while (true) {
                  stackIn_132_1 = (stackIn_125_1) && (this.field_d);
                  if (((nk) (Object) stackIn_125_0).a(stackIn_132_1, (byte) -72)) {
                    var2_int = 0;
                  }
                  var3Lifetime2++;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                stackIn_112_1 = (stackIn_125_1) && (this.field_l);
                if (((nk) (Object) stackIn_125_0).a(stackIn_112_1, (byte) -72)) {
                  var2_int = 0;
                }
                var3Lifetime2++;
                if (var4 == 0) {
                  continue;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              if (param0 != -77) {
                this.a(61, 39);
              }
              var3Lifetime2 = 0;
              while (this.field_i.length > var3Lifetime2) {
                if (var4 != 0) {
                  break L27;
                }
                stackIn_125_0Lifetime1 = this.field_i[var3Lifetime2];
                stackIn_125_1Lifetime1 = this.field_b;
                stackIn_132_1Lifetime1 = (stackIn_125_1Lifetime1) && (this.field_d);
                if (((nk) (Object) stackIn_125_0Lifetime1).a(stackIn_132_1Lifetime1, (byte) -72)) {
                  var2_int = 0;
                }
                var3Lifetime2++;
              }
            }
            this.field_h = uc.field_C;
            break;
          }
          this.field_a = ll.field_y;
          if (var2_int != 0) {
            stackIn_140_0 = null;
            return (mj) (stackIn_140_0);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2), "mj.G(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_73_0 = 0;
        int stackIn_96_1 = 0;
        nk stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        RuntimeException decompiledCaughtException = null;
        String[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        long[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        he var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        nk stackIn_110_0Lifetime1;
        int stackIn_110_1Lifetime1;
        int stackIn_110_2Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        var13 = Bounce.field_N;
        try {
          if (this.field_o) {
            this.field_n = -1;
          }
          boolean decompiledFrameRemainder0 = true;
          if (jh.b(767564065)) {
            this.field_c[6].field_f = kg.field_d;
            decompiledFrameRemainder0 = (var13 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == pe.field_f) {
              tk.field_c = 0;
              pe.field_f = pe.a(3, 10, 1, -16947, 13);
            }
            if (!pe.field_f.field_i) {
              this.field_c[6].field_f = ib.field_j;
              decompiledFrameRemainder0 = (var13 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (pe.field_f.field_h != null) {
                var2 = pe.field_f.field_h[ii.field_k];
                var3 = pe.field_f.field_l[ii.field_k];
                var4 = pe.field_f.field_o[ii.field_k];
                var5 = 0;
                var6 = qc.field_a;
                var7 = 0;
                var8 = 0;
                while (true) {
                  if (var8 < 10) {
                    stackIn_73_0 = var5;
                    if (var13 == 0) {
                      if (stackIn_73_0 == 0 &&
                        var6 != null &&
                        s.a(var2[var8], param0 - 23409) &&
                        ~var3[var8] == ~var6.field_o &&
                        var4[var8] == ti.field_O) {
                        var5 = 1;
                        tk.field_c = -(1 + var8);
                      }
                      if (var2[var8] != null ||
                        var5 == 0 &&
                        var8 == 9 &&
                        !(ti.field_O <= 0)) {
                        var9 = 0;
                        var10 = 0;
                        var11 = 0;
                        var12 = " , , ";
                        if (var2[var8] != null) {
                          var9Lifetime1 = var4[var8];
                          var11 = var9Lifetime1;
                          var12 = var2[var8];
                          var12 = 1 + var8 + ". ," + var12 + ",   " + var11;
                        }
                        if (var5 == 0 &&
                          9 == var8 &&
                          0 < ti.field_O) {
                          var9Lifetime2 = ti.field_O;
                          var12 = ja.field_b;
                          var11 = var9Lifetime2;
                          tk.field_c = -(var8 + 1);
                          if (0 == var10) {
                            var12 = "," + var12 + ",   " + var11;
                          }
                        }
                        if (var8 == 0) {
                          ca.field_a = new int[1];
                          eh.field_b = new String[1];
                          ca.field_a[0] = var11;
                          eh.field_b[0] = var2[var8];
                        }
                        var7 = 1;
                        this.field_c[var8].field_f = var12;
                      } else {
                        this.field_c[var8].field_f = "";
                      }
                      var8++;
                      continue;
                    }
                  } else {
                    stackIn_73_0 = var7;
                  }
                  break;
                }
                if (stackIn_73_0 == 0) {
                  this.field_c[6].field_f = kk.field_w;
                }
                if (var13 != 0) {
                  this.field_c[6].field_f = jk.field_m;
                }
              } else {
                this.field_c[6].field_f = jk.field_m;
              }
            }
          }
          var2_int = 0;
          do {
            if (this.field_m.length <= var2_int) {
              var2_int = 0;
              break;
            }
            this.field_m[var2_int].a(16741888, 16741888);
            var2_int++;
          } while (var13 == 0);
          while (this.field_c.length > var2_int) {
            stackIn_110_0 = this.field_c[var2_int];
            stackIn_110_1 = var2_int;
            stackIn_110_2 = this.field_c.length - 2;
            if (var13 != 0) {
              while (true) {
                ((nk) (Object) stackIn_110_0).a(stackIn_110_1, stackIn_110_2);
                var2_int++;
                return;
              }
            }
            if (stackIn_110_1 < stackIn_110_2) {
              stackIn_96_1 = 16741888;
            } else {
              stackIn_96_1 = 16697912;
            }
            ((nk) (Object) stackIn_110_0).a(stackIn_96_1, 16741888);
            var2_int++;
            if (var13 == 0) {
              continue;
            }
            break;
          }
          if (param0 != 23417) {
            this.b(42);
          }
          var2_int = 0;
          do {
            if (var2_int >= this.field_g.length) {
              var2_int = 0;
              break;
            }
            this.field_g[var2_int].a(16697912, 16741888);
            var2_int++;
          } while (var13 == 0);
          while (true) {
            if (var2_int >= this.field_i.length) {
              return;
            }
            stackIn_110_0Lifetime1 = this.field_i[var2_int];
            stackIn_110_1Lifetime1 = 16697912;
            stackIn_110_2Lifetime1 = 16741888;
            ((nk) (Object) stackIn_110_0Lifetime1).a(stackIn_110_1Lifetime1, stackIn_110_2Lifetime1);
            var2_int++;
            if (var13 != 0) {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2_ref), "mj.B(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_j = null;
          field_k = null;
          if (param0 != 4) {
            mj.b((byte) 102);
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "mj.A(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Bounce.field_N;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.field_o = false;
          if (this.field_e) {
            if (10 != this.field_n) {
              this.field_n = 10;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_n = 11;
              decompiledFrameRemainder0 = (var4 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            if (!this.field_l) {
              if (!this.field_d) {
                this.field_n = this.field_n + param0;
                if (this.field_n < 0) {
                  this.field_n = this.field_m.length - 1;
                }
                if (!(this.field_n < this.field_m.length)) {
                  this.field_n = 0;
                  if (var4 != 0) {
                    this.field_n = 0;
                    this.field_n = this.field_n + param0;
                    if (this.field_n < 0) {
                      this.field_n = -1 + this.field_g.length;
                    }
                    if (this.field_g.length <= this.field_n) {
                      this.field_n = 0;
                    }
                    if (kb.field_a == 0 &&
                      !jh.b(767564065)) {
                      this.field_n = 0;
                    }
                  }
                }
              } else {
                this.field_n = 0;
                if (var4 != 0) {
                  this.field_n = this.field_n + param0;
                  if (this.field_n < 0) {
                    this.field_n = -1 + this.field_g.length;
                  }
                  if (this.field_g.length <= this.field_n) {
                    this.field_n = 0;
                  }
                  if (kb.field_a == 0 &&
                    !jh.b(767564065)) {
                    this.field_n = 0;
                  }
                }
              }
            } else {
              this.field_n = this.field_n + param0;
              if (this.field_n < 0) {
                this.field_n = -1 + this.field_g.length;
              }
              if (this.field_g.length <= this.field_n) {
                this.field_n = 0;
              }
              if (kb.field_a == 0 &&
                !jh.b(767564065)) {
                this.field_n = 0;
              }
            }
          }
          if (param1 != 12011) {
            this.field_o = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var3), "mj.D(" + param0 + ',' + param1 + ')');
        }
    }

    mj() {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Bounce.field_N;
        this.field_m = new nk[]{new nk(0, 22, c.field_b, 0, this), new nk(1, 54, nf.field_b, 1, this), new nk(2, 86, kl.field_m, 2, this), new nk(3, 118, qe.field_j, 3, this), new nk(4, 150, md.field_u, 5, this), new nk(5, 182, ob.field_b, 6, this), new nk(6, 214, fj.field_g, 7, this), new nk(7, 246, bk.field_d, 4, this), new nk(8, 278, kc.field_d, 8, this), new nk(9, 310, wa.field_c, 9, this)};
        this.field_c = new nk[]{new nk(0, -5, "", -1, this), new nk(1, 23, "", -2, this), new nk(2, 51, "", -3, this), new nk(3, 79, "", -4, this), new nk(4, 107, "", -5, this), new nk(5, 135, "", -6, this), new nk(6, 163, "", -7, this), new nk(7, 191, "", -8, this), new nk(8, 219, "", -9, this), new nk(9, 247, "", -10, this), new nk(10, 315, "", 11, this), new nk(11, 347, hi.field_b, 10, this)};
        this.field_g = new nk[]{new nk(0, 310, hi.field_b, 12, this), new nk(1, 347, bk.field_d, 4, this)};
        this.field_i = new nk[]{new nk(0, 347, hi.field_b, 13, this)};
        try {
          this.field_a = ll.field_y;
          this.field_b = true;
          this.field_h = uc.field_C;
          var1_int = 0;
          do {
            if (var1_int >= this.field_m.length) {
              var1_int = 0;
              break;
            }
            this.field_m[var1_int].field_c = 0;
            var1_int++;
          } while (var2 == 0);
          do {
            if (var1_int >= this.field_c.length) {
              var1_int = 0;
              break;
            }
            this.field_c[var1_int].field_c = 1;
            var1_int++;
          } while (var2 == 0);
          do {
            if (this.field_g.length <= var1_int) {
              var1_int = 0;
              break;
            }
            this.field_g[var1_int].field_c = 2;
            var1_int++;
          } while (var2 == 0);
          while (var1_int < this.field_i.length) {
            this.field_i[var1_int].field_c = 3;
            var1_int++;
            if (var2 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) runtimeException), "mj.<init>()");
        }
    }

    static {
        field_j = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_f = new eh(4, 1, 1, 1);
    }
}
