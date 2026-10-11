/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends sg {
    private int[] field_p;
    private gh field_v;
    private int field_E;
    static String field_C;
    private ha field_t;
    private int field_s;
    private ha field_o;
    private gh field_k;
    private int[] field_m;
    private boolean field_w;
    static String field_z;
    private int field_D;
    static vh field_n;
    private int field_r;
    private gh field_l;
    static String field_x;
    static String field_u;
    static boolean field_A;
    private ha field_y;
    private boolean field_q;

    final synchronized void a(int param0) {
        int var3;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_r > 0 &&
          null != this.field_o) {
          this.field_v.a(param0);
        }
        if (this.field_r < 1048576 &&
          null != this.field_t) {
          this.field_l.a(param0);
        }
        if (0 < this.field_E &&
          null != this.field_y) {
          this.field_k.a(param0);
        }
        if (this.field_w) {
          if (0 < this.field_D &&
            !this.field_v.e((byte) -8)) {
            this.field_o = null;
            this.field_D = -this.field_D;
            this.field_w = false;
          } else {
            if (this.field_D < 0 &&
              !this.field_l.e((byte) -8)) {
              this.field_t = null;
              this.field_D = -this.field_D;
              this.field_w = false;
            }
          }
        }
        if (this.field_D != 0) {
          this.field_r = this.field_r + param0 * this.field_D;
          if (this.field_r >= 1048576) {
            this.field_r = 1048576;
            if (!this.field_w) {
              this.field_D = 0;
              if (!this.field_q) {
                if (this.field_t != null) {
                  this.field_l.a((byte) -123);
                }
                this.field_t = null;
              }
            }
          } else {
            if (this.field_r <= 0) {
              this.field_r = 0;
              if (!this.field_w) {
                this.field_D = 0;
                if (!this.field_q) {
                  if (this.field_o != null) {
                    this.field_v.a((byte) -125);
                  }
                  this.field_o = null;
                }
              }
            }
          }
        }
    }

    final synchronized void a(boolean param0, int param1, byte param2, int param3, int param4, ha param5) {
        boolean stackIn_17_1 = false;
        int stackIn_30_0 = 0;
        gh stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        boolean stackIn_42_2 = false;
        gh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        boolean stackIn_50_2 = false;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_w &&
            param0) {
            if (this.field_D > 0) {
              if (null != this.field_o) {
                this.field_v.a((byte) -106);
              }
              this.field_o = param5;
              if (param5 != null) {
                this.field_v.a((byte) -96, false, param5);
                this.a(param3, (byte) -13, this.field_v, param1);
              }
            } else {
              if (null != this.field_t) {
                this.field_l.a((byte) -106);
              }
              this.field_t = param5;
              if (param5 != null) {
                this.field_l.a((byte) -96, false, param5);
                this.a(param3, (byte) -13, this.field_l, param1);
              }
            }
            return;
          }
          stackIn_17_1 = (param0);
          this.field_w = stackIn_17_1;
          if (this.field_o == param5) {
            this.field_D = param4;
            this.a(param3, (byte) -13, this.field_v, param1);
            return;
          }
          if (param5 == this.field_t) {
            this.field_D = -param4;
            this.a(param3, (byte) -13, this.field_l, param1);
            return;
          }
          if (null == this.field_o) {
            var7_int = 1;
          } else {
            if (null != this.field_t) {
              stackIn_30_0 = (this.field_r >= 524288) ? 0 : 1;
              var7_int = stackIn_30_0;
            } else {
              var7_int = 0;
            }
          }
          if (param2 != -85) {
            return;
          }
          if (var7_int != 0) {
            if (null != this.field_o) {
              this.field_v.a((byte) -124);
            }
            this.field_o = param5;
            if (param5 != null) {
              stackIn_49_0 = this.field_v;
              stackIn_49_1 = -96;
              stackIn_50_2 = !(param0);
              ((gh) (Object) stackIn_49_0).a((byte) stackIn_49_1, stackIn_50_2, param5);
              this.a(param3, (byte) -13, this.field_v, param1);
            }
            this.field_D = param4;
          } else {
            if (null != this.field_t) {
              this.field_l.a((byte) -109);
            }
            this.field_t = param5;
            if (param5 != null) {
              stackIn_41_0 = this.field_l;
              stackIn_41_1 = -96;
              stackIn_42_2 = !(param0);
              ((gh) (Object) stackIn_41_0).a((byte) stackIn_41_1, stackIn_42_2, param5);
              this.a(param3, (byte) -13, this.field_l, param1);
            }
            this.field_D = -param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_55_0 = var7;
          stackIn_55_1 = new StringBuilder().append("io.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(')').toString());
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 2) {
          return;
        }
        this.field_s = param1;
    }

    final void a(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_s <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_w) {
            if (this.field_D > 0 &&
              !this.field_v.e((byte) -8)) {
              this.field_D = -this.field_D;
              this.field_o = null;
              this.field_w = false;
            } else {
              if (this.field_D < 0 &&
                !this.field_l.e((byte) -8)) {
                this.field_D = -this.field_D;
                this.field_w = false;
                this.field_t = null;
              }
            }
          }
          var4_int = this.field_s * (this.field_r >> 12) / 256;
          var5 = this.field_s - var4_int;
          if (this.field_D != 0) {
            this.field_r = this.field_r + param2 * this.field_D;
            if (this.field_r >= 1048576) {
              this.field_r = 1048576;
              if (!this.field_w) {
                this.field_D = 0;
                if (!this.field_q) {
                  if (this.field_t != null) {
                    this.field_l.a((byte) -122);
                  }
                  this.field_t = null;
                }
              }
            } else {
              if (this.field_r <= 0) {
                this.field_r = 0;
                if (!this.field_w) {
                  this.field_D = 0;
                  if (!this.field_q) {
                    if (null != this.field_o) {
                      this.field_v.a((byte) -107);
                    }
                    this.field_o = null;
                  }
                }
              }
            }
          }
          if (lb.field_i) {
            stackIn_33_0 = param2 << 1;
          } else {
            stackIn_33_0 = param2;
          }
          var6 = stackIn_33_0;
          if (this.field_E < 256 && (null != this.field_o ||
            this.field_t != null)) {
            if (var4_int != 256) {
              if (var5 != 256) {
                if (this.field_p != null &&
                  this.field_p.length >= var6) {
                  sf.a(this.field_p, 0, var6);
                  sf.a(this.field_m, 0, var6);
                } else {
                  this.field_p = new int[var6];
                  this.field_m = new int[var6];
                }
                this.field_v.a(this.field_p, 0, param2);
                this.field_l.a(this.field_m, 0, param2);
                if (!lb.field_i) {
                  stackIn_48_0 = param1;
                } else {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var8 < var6; var8++) {
                  param0[var8 + var7] = param0[var8 + var7] + (this.field_m[var8] * var5 + var4_int * this.field_p[var8] >> 8);
                }
              } else {
                this.field_l.a(param0, param1, param2);
              }
            } else {
              this.field_v.a(param0, param1, param2);
            }
          }
          if (null != this.field_y &&
            this.field_E != 0) {
            if (this.field_p != null &&
              this.field_p.length >= var6) {
              sf.a(this.field_p, 0, var6);
            } else {
              this.field_m = new int[var6];
              this.field_p = new int[var6];
            }
            this.field_k.a(this.field_p, 0, param2);
            if (lb.field_i) {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_62_0 = localTemp$1;
            } else {
              stackIn_62_0 = param1;
            }
            var7Lifetime1 = stackIn_62_0;
            var8Lifetime1 = this.field_s * this.field_E / 256;
            var9 = -var8Lifetime1 + this.field_s;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var7Lifetime1 + var10] = this.field_p[var10] * var8Lifetime1 + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_68_0 = var4;
          stackIn_68_1 = new StringBuilder().append("io.AA(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, gh param2, int param3) {
        try {
          param2.b(-1, (byte) 69, param0);
          param2.b(param3, (byte) -118);
          if (param1 != -13) {
            io.a(-10, true);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "io.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final sg b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    public static void c(int param0) {
        field_z = null;
        field_C = null;
        field_u = null;
        field_n = null;
        if (param0 < 61) {
          field_x = (String) null;
        }
        field_x = null;
    }

    final sg a() {
        return null;
    }

    final static void a(int param0, boolean param1) {
        int var7 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        kc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_41_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var9_ref_kc = null;
        nl var10 = null;
        int var10_int = 0;
        nl var11 = null;
        int var11_int = 0;
        int var13 = 0;
        int var14 = 0;
        kc var15 = null;
        kc var16 = null;
        int var17 = 0;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          fh.field_g = de.field_e;
          ri.field_a = de.field_j;
          stackIn_3_0 = 16;
          if (!param1) {
            stackIn_4_1 = oo.field_y;
          } else {
            stackIn_4_1 = sm.field_a;
          }
          ej.a(stackIn_3_0, stackIn_4_1);
          tn.field_Ob.a(0, 0, -42 + hl.field_m.field_I, hl.field_m.field_x, 5);
          aj.field_d.a(bk.field_M.field_x, 0, 0, ga.field_r, (byte) -120);
          stackIn_6_0 = qc.field_d;
          stackIn_6_1 = bk.field_M.field_x;
          if (!fc.field_a) {
            stackIn_7_2 = 0;
          } else {
            stackIn_7_2 = nn.field_p + 2 + 42;
          }
          ((kc) (Object) stackIn_6_0).a(stackIn_6_1 - stackIn_7_2, 0, ga.field_r + 2, 18, (byte) -120);
          hf.field_q.a(nn.field_p + 42, -40 + (bk.field_M.field_x - nn.field_p - 2), ga.field_r + 2, 18, (byte) -120);
          lf.field_b.a(ga.field_r + 22, nn.field_p, bk.field_M.field_x, false, 0, bk.field_M.field_I - (ga.field_r + 2) - 20, 2);
          var2_int = -29 / ((84 - param0) / 36);
          mo.field_o.a(hl.field_m.field_x, 0, -40 + hl.field_m.field_I, 40, (byte) -120);
          nl.field_Db.a(oh.field_h.field_x, 0, 0, 30, (byte) -120);
          mi.field_m.a(oh.field_h.field_x, 0, 30, -42 + oh.field_h.field_I - 30, (byte) -120);
          var3 = 3 + vf.field_l;
          if (ao.field_h.length < 2) {
            var3--;
          }
          if (param1) {
            var3--;
          }
          var4 = ((var3 + 1) / 2 + (2 + (-5 + mi.field_m.field_I) - 5 - 10)) / (1 + var3) - 2;
          if (var4 > 30) {
            var4 = 30;
          }
          var5 = -(var3 * (2 + var4)) + (mi.field_m.field_I - 10);
          if (var5 > 40) {
            var5 = 40;
          }
          ib.field_s.a(-5 + mi.field_m.field_x - 5, 5, 5, var5, (byte) -120);
          var6 = var5 + 7;
          for (var7 = 0; var7 < 4 + vf.field_l; var7++) {
            if ((var7 != 1 ||
              !(ao.field_h.length < 2)) && (var7 != 3 ||
              !(le.field_q <= 1))) {
              if (!param1 &&
                3 == var7) {
                var16 = wd.field_g[var7];
                wd.field_g[var7].field_I = 0;
                var16.field_x = 0;
                for (var9 = 0; s.field_e[var7].length > var9; var9++) {
                  if (s.field_e[var7][var9] != null) {
                    var10 = s.field_e[var7][var9];
                    s.field_e[var7][var9].field_I = 0;
                    var10.field_x = 0;
                  }
                }
              } else if (param1 &&
                0 == var7) {
                var15 = wd.field_g[var7];
                wd.field_g[var7].field_I = 0;
                var15.field_x = 0;
                for (var9 = 0; s.field_e[var7].length > var9; var9++) {
                  if (s.field_e[var7][var9] != null) {
                    var10 = s.field_e[var7][var9];
                    s.field_e[var7][var9].field_I = 0;
                    var10.field_x = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var7 >= 4) {
                    if (dh.field_Fb != null) {
                      stackIn_41_0 = (dh.field_Fb[-4 + var7]) ? 1 : 0;
                    } else {
                      stackIn_41_0 = 0;
                    }
                  } else {
                    stackIn_41_0 = 0;
                  }
                } else {
                  stackIn_41_0 = 0;
                }
                var8 = stackIn_41_0;
                if (var8 != 0) {
                  var9_ref_kc = wd.field_g[var7];
                  wd.field_g[var7].field_I = 0;
                  var9_ref_kc.field_x = 0;
                  var17 = 0;
                  var10_int = var17;
                  while (s.field_e[var7].length > var17) {
                    if (s.field_e[var7][var17] != null) {
                      var11 = s.field_e[var7][var17];
                      s.field_e[var7][var17].field_I = 0;
                      var11.field_x = 0;
                    }
                    var17++;
                  }
                } else {
                  wd.field_g[var7].a(103, 5, var6, var4, (byte) -120);
                  var9 = 110;
                  if (param1) {
                    s.field_e[var7][0].a(2, 0, var4, 38, var9, var6, mm.field_p);
                    var9 += 40;
                  } else {
                    if (s.field_e[var7][0] != null) {
                      var10 = s.field_e[var7][0];
                      s.field_e[var7][0].field_I = 0;
                      var10.field_x = 0;
                    }
                  }
                  var10_int = 2 + oh.field_h.field_x - 5 - var9;
                  var11_int = -1 + s.field_e[var7].length;
                  for (var12 = 0; var12 < var11_int; var12++) {
                    var13 = var10_int * var12 / var11_int;
                    s.field_e[var7][1 + var12].a(2, 0, var4, -var13 + (var12 + 1) * var10_int / var11_int - 2, var9 + var13, var6, mm.field_p);
                  }
                  var6 = var6 + (2 + var4);
                }
              }
            }
          }
          nl.field_Fb.a(360, -360 + de.field_e >> 1, 10, -14 + (-120 + (de.field_j - 10)), (byte) -120);
          hf.field_t.a(nl.field_Fb.field_x, 0, 0, 24, (byte) -120);
          gk.field_g.a(nl.field_Fb.field_x, 0, 24, -24 + nl.field_Fb.field_I, (byte) -120);
          gk.field_g.field_v = of.a(3, gk.field_g.field_I, 1, 1, 11579568, 8421504);
          mj.field_s.a(-10 + gk.field_g.field_x, 5, 5, -2 + (-34 + gk.field_g.field_I), (byte) -120);
          gj.field_d.a(80, (-80 + gk.field_g.field_x) / 2, gk.field_g.field_I - 5 - 24, 24, (byte) -120);
          ie.l((byte) 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "io.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Color param0, String param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          try {
            if (param4 != -6885) {
              field_u = (String) null;
            }
            var9 = on.field_c.getGraphics();
            if (null == jb.field_m) {
              jb.field_m = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param2) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, o.field_r, co.field_c);
            }
            if (param0 == null) {
              param0 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == ik.field_e) {
                ik.field_e = on.field_c.createImage(304, 34);
              }
              var10 = ik.field_e.getGraphics();
              var10.setColor(param0);
              var10.drawRect(0, 0, 303, 33);
              var10.fillRect(2, 2, 3 * param3, 30);
              var10.setColor(java.awt.Color.black);
              var10.drawRect(1, 1, 301, 31);
              var10.fillRect(2 + param3 * 3, 2, -(param3 * 3) + 300, 30);
              var10.setFont(jb.field_m);
              var10.setColor(java.awt.Color.white);
              var10.drawString(param1, (-(param1.length() * 6) + 304) / 2, 22);
              var9.drawImage(ik.field_e, o.field_r / 2 - 152, co.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + o.field_r / 2;
              var8 = -18 + co.field_c / 2;
              var9.setColor(param0);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, param3 * 3, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, var8 + 1, 301, 31);
              var9.fillRect(var7 + (2 + 3 * param3), 2 + var8, -(param3 * 3) + 300, 30);
              var9.setFont(jb.field_m);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param1, var7 + (304 - param1.length() * 6) / 2, var8 + 22);
            }
            if (jh.field_a != null) {
              var9.setFont(jb.field_m);
              var9.setColor(java.awt.Color.white);
              var9.drawString(jh.field_a, o.field_r / 2 - 6 * jh.field_a.length() / 2, -26 + co.field_c / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            on.field_c.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var5_ref;
          stackIn_23_1 = new StringBuilder().append("io.C(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private io() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, byte param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var2_intLifetime1;
        try {
          ch.field_b = param0;
          if (eh.field_e == null) {
            eh.field_e = new qb(640, 480);
            if (de.field_l.length != eh.field_e.field_A.length) {
              var2_int = 0;
              for (var3 = -eh.field_e.field_A.length; var3 < 0; var3++) {
                eh.field_e.field_A[var2_int] = de.field_l[var2_int];
                var2_int++;
              }
              eh.field_e.a();
              de.d(2, 2, 0, 0, 640, 480);
            }
          }
          var2_intLifetime1 = -44 % ((-45 - param1) / 34);
          vf.field_g.a(true, 0, false, rl.a(me.field_I, an.field_g, -121));
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "io.H(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_x = "You can change your character's appearance on the 'Character Creation' screen, accessed from the main menu. There are thousands of combinations!";
        field_u = "You just fell into the water! Normally, this would injure you, but this arena is more lenient. In a competitive match you should avoid falling into the water at all costs. Remember that, if you lose your position, you can press 'N' to centre the screen back on your Arcanist.";
        field_z = "Book of Stone";
        field_C = "Open";
    }
}
