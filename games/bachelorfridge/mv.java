/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mv extends at {
    gj field_l;
    static String field_m;
    vja field_k;
    static int field_n;
    int field_j;

    final void d(byte param0) {
        int var7 = 0;
        int stackIn_97_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        aga var3 = null;
        Object var4 = null;
        pp var4_ref = null;
        Object var5 = null;
        t var5_ref = null;
        int var6 = 0;
        wia var8 = null;
        int var8_int = 0;
        fga var9 = null;
        int var10 = 0;
        kj var11 = null;
        fa var11_ref = null;
        qla var11_ref2 = null;
        int var11_int = 0;
        ad var12 = null;
        bn var13 = null;
        int var14 = 0;
        sl var15 = null;
        aga var16 = null;
        at var17 = null;
        ad var18 = null;
        aga var19 = null;
        ad var20 = null;
        sl var21 = null;
        int var6Lifetime1;
        var4 = null;
        var5 = null;
        var14 = BachelorFridge.field_y;
        try {
          var2_int = -128 / ((-44 - param0) / 40);
          if (!this.field_k.field_r &&
            !this.field_k.field_n) {
            var3 = this.field_k.field_l.a(67, this.field_l.field_h);
            if (var3.i(87)) {
              return;
            }
            var4_ref = (pp) (this.field_k.field_o.b((byte) 90));
            var5_ref = (t) (al.a(106, this.field_k.field_k));
            var6 = 0;
            while (var4_ref != null) {
              boolean decompiledFrameRemainder0 = true;
              if (!(var4_ref instanceof iv)) {
                if (var4_ref instanceof sl) {
                  var15 = (sl) (var4_ref);
                  var21 = var15;
                  var8 = this.field_l.field_h.field_a[var15.field_i][var15.field_l];
                  var9 = new fga(this.field_l, var21.field_i, var21.field_l, var21.field_f);
                  ((kj) ((Object) var9)).a(0);
                  stackIn_97_0 = (var8.field_n != 28) ? 0 : 1;
                  var10 = stackIn_97_0;
                  if (var10 != 0 &&
                    var8.field_h <= var21.field_f) {
                    var11 = (kj) ((Object) new uaa(this.field_l, var21, var3));
                    var11.field_b = ((kj) ((Object) var9)).field_b;
                    ((kj) ((Object) var9)).field_b = var11;
                  } else {
                    var21.a(var3, this.field_l.field_h, 12);
                  }
                } else {
                  if (var4_ref instanceof ro) {
                    ((ro) (var4_ref)).a(var3, this.field_l.field_h, 12);
                  } else {
                    if (var4_ref instanceof o) {
                      for (var7 = 0; this.field_l.field_h.field_z > var7; var7++) {
                        for (var8_int = 0; this.field_l.field_h.field_B > var8_int; var8_int++) {
                          var19 = this.field_l.field_h.field_a[var7][var8_int].field_l;
                          if (var19 != null) {
                            var20 = new nq(var19).a(-27449, this.field_l);
                            this.a(27799, new ek(this.field_l, var20, var4_ref.field_f));
                          }
                        }
                      }
                      this.field_l.field_s.a(-1907, 20);
                      ((o) (var4_ref)).a(var3, this.field_l.field_h, 12);
                    } else {
                      if (var4_ref instanceof bm) {
                        ((bm) (var4_ref)).a(var3, this.field_l.field_h, 12);
                      }
                    }
                  }
                }
              } else {
                var16 = var4_ref.field_h.a(54, this.field_l.field_h);
                if (var16.a(13, (byte) 104)) {
                  var3.a(5, var16, (byte) 2);
                  this.a(27799, new ek(this.field_l, this.field_k.field_l.a(-27449, this.field_l), 5));
                }
                var8_int = this.field_k.field_q;
                if (this instanceof ba) {
                  var8_int = nn.a(var16, var3, (byte) 104);
                }
                var17 = ((iv) (var4_ref)).a(this.field_k.field_l.a(-27449, this.field_l), this.field_l, false, var8_int);
                if (var17 != null) {
                  this.a(27799, var17);
                }
                var18 = var4_ref.field_h.a(-27449, this.field_l);
                if (this.field_k.field_k != 61) {
                  if (this.field_k.field_k != 62) {
                    if (this.field_k.field_k != 63) {
                      var18.b(-1, 6);
                    } else {
                      var18.b(-1, 7);
                    }
                  } else {
                    var18.b(-1, 7);
                  }
                } else {
                  var18.b(-1, 7);
                }
                if (!((iv) (var4_ref)).field_j) {
                  if (0 >= var4_ref.field_f) {
                    if (var5_ref.field_p != 4 ||
                      var4_ref.field_f != 0) {
                      this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                    }
                  } else {
                    this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                    var11_ref = new fa(this.field_l, var18.field_s.field_x, var18.field_s.field_J, var18.field_f);
                    ((kj) ((Object) var11_ref)).a(0);
                  }
                } else {
                  var18.a(16777215, 106, bja.field_n);
                  if (var5_ref.field_p != 4 ||
                    0 != var4_ref.field_f) {
                    this.a(27799, new ek(this.field_l, var18, var4_ref.field_f));
                  }
                }
                if (0 != var5_ref.field_u &&
                  15 != var5_ref.field_u &&
                  var5_ref.field_u != 45 &&
                  var5_ref.field_u != 46 &&
                  23 != var5_ref.field_u &&
                  var5_ref.field_u != 20 && (var18.field_s.field_y != 32 ||
                  var5_ref.c(27863))) {
                  if (!var18.field_s.g((byte) 85)) {
                    var18.a(24831, 14, kna.field_g[var5_ref.field_u]);
                    if (pna.field_zb[var5_ref.field_u].field_i != -1 &&
                      var5_ref.field_u != 9) {
                      var11_ref2 = new qla(this.field_l, var18.field_s.field_x, var18.field_s.field_J, pna.field_zb[var5_ref.field_u].field_i);
                      ((kj) ((Object) var11_ref2)).a(0);
                    }
                  } else {
                    var18.a(24831, 87, lma.field_A);
                  }
                }
                var6Lifetime1 = var4_ref.field_f;
                c.a(1220394217, var16.field_o.field_e);
                var11_int = ((t) (al.a(112, this.field_k.field_k))).field_s;
                if (this.field_k.field_p == 31) {
                  var11_int = 0;
                }
                if ((this.field_k.field_k != 68 &&
                  this.field_k.field_k != 69 &&
                  70 != this.field_k.field_k) &&
                  (decompiledFrameRemainder0 = (var11_int != 0))) {
                  var3.a(var11_int, var3, (byte) 2);
                  if (this.field_k.field_l.a(-27449, this.field_l) != null) {
                    this.field_k.field_l.a(-27449, this.field_l).a(65280, 121, Integer.toString(-var11_int));
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var4_ref = (pp) (this.field_k.field_o.c(0));
                    continue;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var3.a(-var6Lifetime1, var3, (byte) 2);
                  if (null != this.field_k.field_l.a(-27449, this.field_l) &&
                    var6Lifetime1 != 0) {
                    var12 = this.field_k.field_l.a(-27449, this.field_l);
                    this.field_k.field_l.a(-27449, this.field_l).a(65280, 9, Integer.toString(var6Lifetime1));
                    var13 = new bn(this.field_l, var12.field_s.field_x, var12.field_s.field_J);
                    ((kj) ((Object) var13)).a(0);
                  }
                }
              }
              var4_ref = (pp) (this.field_k.field_o.c(0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.H(" + param0 + ')');
        }
    }

    void d(int param0) {
        if (param0 <= 16) {
          return;
        }
        aga var2 = this.field_k.field_l.a(44, this.field_l.field_h);
        if (var2.i(-85)) {
          return;
        }
        try {
          this.field_k.field_l.a(-27449, this.field_l).b(false);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mv.B(" + param0 + ')');
        }
    }

    boolean c(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        aga var4 = null;
        ad var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        t var8_ref = null;
        var8 = null;
        var7 = BachelorFridge.field_y;
        try {
          var3 = 14 % ((71 - param0) / 47);
          var8_ref = (t) (al.a(88, this.field_k.field_k));
          var4 = this.field_k.field_l.a(72, this.field_l.field_h);
          var5 = this.field_k.field_l.a(-27449, this.field_l);
          this.field_l.field_s.a((byte) -57, var4.field_J, var4.field_x);
          var6 = ok.c(var8_ref.field_n, -26684) + 12;
          if (var6 >= 100) {
            var6 = 99;
          }
          fieldTemp$0 = this.field_j - 1;
          this.field_j = this.field_j - 1;
          if (fieldTemp$0 < 0) {
            this.d(30);
            return true;
          }
          if (var6 == this.field_j) {
            mk.a(var8_ref.field_n, -101);
          }
          if (this.field_j == 25 &&
            !this.field_k.d((byte) -70)) {
            this.d((byte) -111);
          }
          if (this.field_j == 25 &&
            !this.field_k.d((byte) -73)) {
            this.f(87);
          }
          if (15 == this.field_j &&
            !this.field_k.d((byte) -112) &&
            4 == var8_ref.field_r) {
            this.field_l.field_fb.a(new ha(this.field_l, var5), true);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_j == 35 &&
            !this.field_k.d((byte) -81)) {
            if (this.field_k.field_k != 31 &&
              this.field_k.field_k != 32 &&
              this.field_k.field_k != 33) {
              if (var8_ref.field_r == 6) {
                this.field_l.field_fb.a(new jv(this.field_l, var5, this.field_k.field_q), true);
              } else {
                if (var8_ref.field_r == 8) {
                  this.field_l.field_fb.a(new ah(this.field_l, var5, this.field_k.field_q, 2), true);
                } else {
                  if ((var8_ref.field_r == 7)) {
                    this.field_l.field_fb.a(new gja(this.field_l, var5, this.field_k.field_q), true);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_l.field_fb.a(new ut(this.field_l, var5, this.field_k.field_q, this.field_k.field_p), true);
            }
          }
          if (this.field_j < 25 &&
            !this.field_k.d((byte) -53)) {
            this.e(-32);
          }
          if (50 == this.field_j) {
            if (this.field_k.d((byte) -120)) {
              return false;
            }
            var5.b(-1, var8_ref.field_o);
            id.e(49, var5.field_s.field_o.field_e);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.A(" + param0 + ')');
        }
    }

    void e(int param0) {
        pp var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        ad var3 = null;
        var4 = BachelorFridge.field_y;
        try {
          if (~this.field_k.field_p == param0) {
            return;
          }
          var2 = (pp) (this.field_k.field_o.b((byte) 90));
          while (var2 != null) {
            if (var2 instanceof iv) {
              var3 = var2.field_h.a(-27449, this.field_l);
              if (var3.field_f.field_u.field_e) {
                var3.b(false);
              }
            }
            var2 = (pp) (this.field_k.field_o.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "mv.I(" + param0 + ')');
        }
    }

    final void f(int param0) {
        int var12 = 0;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        aga var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        int var17 = 0;
        op var19 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          al.a(91, this.field_k.field_k);
          var19 = this.field_l.field_h;
          var3 = this.field_k.field_l.a(84, this.field_l.field_h);
          var22 = haa.b(1, var3.d(124, this.field_k.field_k), this.field_k.field_q);
          var5 = var3.field_x;
          var6 = var3.field_J;
          if (this.field_k.field_q == 2) {
            var5 = var5 - this.field_k.field_p;
          } else {
            if (4 != this.field_k.field_q) {
              if (1 == this.field_k.field_q) {
                var6 = var6 - this.field_k.field_p;
              } else {
                if (this.field_k.field_q == 3) {
                  var6 = var6 + this.field_k.field_p;
                }
              }
            } else {
              var5 = var5 + this.field_k.field_p;
            }
          }
          if (31 == this.field_k.field_p) {
            var22[8][8] = 1;
          }
          var7 = 17;
          var8 = 17;
          var9 = -1 + var7 >> 1;
          var11 = -31 / ((param0 - 27) / 42);
          var10 = -1 + var8 >> 1;
          for (var12 = 0; var7 > var12; var12++) {
            for (var13 = 0; var8 > var13; var13++) {
              if (1 == var22[var12][var13]) {
                var14 = var12 - (var9 - var5);
                var15 = var6 + var13 - var10;
                if (var14 >= 0 &&
                  var14 < var19.field_z &&
                  var15 >= 0 &&
                  var19.field_B > var15 &&
                  this.field_l.field_h.field_a[var14][var15].e(-88)) {
                  var16 = null;
                  if (this.field_k.field_k != 61 &&
                    62 != this.field_k.field_k &&
                    63 != this.field_k.field_k) {
                    if (this.field_k.field_k != 24 &&
                      this.field_k.field_k != 25 &&
                      this.field_k.field_k != 26) {
                      if (this.field_l.field_h.field_a[var14][var15].field_l == null) {
                        var16 = new uea(this.field_l, var14, var15, 16711680);
                      }
                    } else {
                      var16 = null;
                    }
                  } else {
                    var16 = new bn(this.field_l, var14, var15);
                  }
                  if (var16 != null) {
                    ((kj) (var16)).a(0);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "mv.F(" + param0 + ')');
        }
    }

    public static void e(byte param0) {
        try {
          field_m = null;
          if (param0 <= 0) {
            field_m = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "mv.G(" + param0 + ')');
        }
    }

    mv(gj param0, vja param1) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ad var4 = null;
        t var6 = null;
        try {
          this.field_k = param1;
          this.field_l = param0;
          var6 = (t) (al.a(-91, this.field_k.field_k));
          var4 = this.field_k.field_l.a(-27449, this.field_l);
          if (var6.field_p != 2 &&
            var6.field_p != 3) {
            this.a(27799, new taa(this.field_l, var4));
          }
          if (!var4.field_s.i(-120)) {
            this.field_j = 100;
            if (this.field_k.field_s) {
              var4.a(16777152, 72, qfa.field_w);
            } else {
              if (!this.field_k.field_r) {
                if (!this.field_k.field_n) {
                  var4.a(12648384, 43, var6.a((byte) 37));
                  this.field_j = 100;
                  var4.field_s.d(this.field_k.field_k, (byte) -120);
                } else {
                  var4.a(16761024, 84, dc.field_o);
                }
              } else {
                var4.a(16777152, 41, m.field_c);
              }
            }
          }
          if (this.field_k.field_q != 0) {
            var4.field_s.field_s = this.field_k.field_q;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("mv.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_27_0 = stackIn_23_0;
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_28_0 = stackIn_27_0;
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = stackIn_23_0;
            stackIn_28_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
        field_m = "Create unrated game";
    }
}
