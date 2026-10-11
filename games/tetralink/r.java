/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends eb {
    private int[] field_x;
    private int field_z;
    private ri field_C;
    private g field_A;
    private int field_r;
    private boolean field_w;
    private ri field_y;
    static String field_v;
    private int field_D;
    private boolean field_B;
    private int field_E;
    private int[] field_F;
    private g field_u;
    private ri field_s;
    private g field_t;

    private final void a(int param0, g param1, int param2, int param3) {
        try {
          param1.b(param0, -1, 99);
          param1.c(param3, param2 - 26097);
          if (param2 != 26025) {
            this.field_C = (ri) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "r.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ah param0, ah param1, boolean param2, boolean param3) {
        try {
          tg.a(0, ek.field_n, t.field_o, uf.field_g, u.field_b, sd.field_rb, tn.field_b, bk.field_i, param3, rh.field_N, ek.field_o, qc.field_cb);
          ec.field_n = bf.a((byte) -99, param0, "lobby", "chatfilter");
          gk.field_a[0] = oj.field_h;
          gk.field_a[2] = mk.field_f;
          gk.field_a[1] = am.field_a;
          db.a(param1, rn.field_e, 122);
          if (!param2) {
            field_v = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "r.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(int param0) {
        int var3;
        var3 = TetraLink.field_J;
        if (this.field_z > 0 &&
          null != this.field_y) {
          this.field_A.a(param0);
        }
        if (1048576 > this.field_z &&
          null != this.field_s) {
          this.field_u.a(param0);
        }
        if (this.field_D > 0 &&
          null != this.field_C) {
          this.field_t.a(param0);
        }
        if (this.field_w) {
          if (this.field_r > 0 &&
            !this.field_A.d((byte) 107)) {
            this.field_r = -this.field_r;
            this.field_y = null;
            this.field_w = false;
          } else {
            if (this.field_r < 0 &&
              !this.field_u.d((byte) 81)) {
              this.field_s = null;
              this.field_w = false;
              this.field_r = -this.field_r;
            }
          }
        }
        if (this.field_r != 0) {
          this.field_z = this.field_z + this.field_r * param0;
          if (1048576 <= this.field_z) {
            this.field_z = 1048576;
            if (!this.field_w) {
              this.field_r = 0;
              if (!this.field_B) {
                if (this.field_s != null) {
                  this.field_u.d(80);
                }
                this.field_s = null;
              }
            }
          } else {
            if (0 >= this.field_z) {
              this.field_z = 0;
              if (!this.field_w) {
                this.field_r = 0;
                if (!this.field_B) {
                  if (this.field_y != null) {
                    this.field_A.d(109);
                  }
                  this.field_y = null;
                }
              }
            }
          }
        }
    }

    final static void a(ie param0, java.awt.Frame param1, int param2) {
        vl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = TetraLink.field_J;
        try {
          while (true) {
            var3 = param0.a(param1, 0);
            while (0 == var3.field_d) {
              tb.a(false, 10L);
            }
            if (var3.field_d != 1) {
              tb.a(false, 100L);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          if (param2 != 0) {
            field_v = (String) null;
          }
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("r.H(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final synchronized void a(ri param0, int param1, boolean param2, int param3, int param4, byte param5) {
        boolean stackIn_22_1 = false;
        int stackIn_36_0 = 0;
        g stackIn_44_0 = null;
        boolean stackIn_45_1 = false;
        g stackIn_54_0 = null;
        boolean stackIn_55_1 = false;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int[] var9 = null;
        var8 = TetraLink.field_J;
        try {
          if (this.field_w &&
            param2) {
            if (this.field_r <= 0) {
              if (this.field_s != null) {
                this.field_u.d(76);
              }
              this.field_s = param0;
              if (param0 != null) {
                this.field_u.a(false, param0, (byte) 113);
                this.a(param3, this.field_u, 26025, param4);
              }
            } else {
              if (null != this.field_y) {
                this.field_A.d(38);
              }
              this.field_y = param0;
              if (param0 != null) {
                this.field_A.a(false, param0, (byte) 117);
                this.a(param3, this.field_A, 26025, param4);
              }
            }
            return;
          }
          if (param5 > -120) {
            var9 = (int[]) null;
            this.b((int[]) null, -67, 0);
          }
          stackIn_22_1 = (param2);
          this.field_w = stackIn_22_1;
          if (param0 == this.field_y) {
            this.field_r = param1;
            this.a(param3, this.field_A, 26025, param4);
            return;
          }
          if (param0 == this.field_s) {
            this.field_r = -param1;
            this.a(param3, this.field_u, 26025, param4);
            return;
          }
          if (this.field_y != null) {
            if (this.field_s != null) {
              stackIn_36_0 = (this.field_z >= 524288) ? 0 : 1;
              var7_int = stackIn_36_0;
            } else {
              var7_int = 0;
            }
          } else {
            var7_int = 1;
          }
          if (var7_int != 0) {
            if (null != this.field_y) {
              this.field_A.d(111);
            }
            this.field_y = param0;
            if (param0 != null) {
              stackIn_54_0 = this.field_A;
              stackIn_55_1 = !(param2);
              ((g) (Object) stackIn_54_0).a(stackIn_55_1, param0, (byte) 52);
              this.a(param3, this.field_A, 26025, param4);
            }
            this.field_r = param1;
          } else {
            if (this.field_s != null) {
              this.field_u.d(68);
            }
            this.field_s = param0;
            if (param0 != null) {
              stackIn_44_0 = this.field_u;
              stackIn_45_1 = !(param2);
              ((g) (Object) stackIn_44_0).a(stackIn_45_1, param0, (byte) 76);
              this.a(param3, this.field_u, 26025, param4);
            }
            this.field_r = -param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_60_0 = var7;
          stackIn_60_1 = new StringBuilder().append("r.E(");
          if (param0 == null) {
            stackIn_61_2 = "null";
          } else {
            stackIn_61_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_60_0), ((StringBuilder) (Object) stackIn_60_1).append(stackIn_61_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean d(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (wa.field_e != null) && (li.field_a == qi.field_p);
        return stackIn_6_0;
    }

    final void b(int[] param0, int param1, int param2) {
        int localTemp$0 = 0;
        int localTemp$1 = 0;
        int var10 = 0;
        int stackIn_33_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
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
        var11 = TetraLink.field_J;
        try {
          if (this.field_E <= 0) {
            this.a(param2);
            return;
          }
          if (this.field_w) {
            if (this.field_r > 0 &&
              !this.field_A.d((byte) -54)) {
              this.field_y = null;
              this.field_r = -this.field_r;
              this.field_w = false;
            } else {
              if (this.field_r < 0 &&
                !this.field_u.d((byte) 78)) {
                this.field_r = -this.field_r;
                this.field_w = false;
                this.field_s = null;
              }
            }
          }
          var4_int = (this.field_z >> 12) * this.field_E / 256;
          var5 = -var4_int + this.field_E;
          if (this.field_r != 0) {
            this.field_z = this.field_z + param2 * this.field_r;
            if (this.field_z >= 1048576) {
              this.field_z = 1048576;
              if (!this.field_w) {
                this.field_r = 0;
                if (!this.field_B) {
                  if (this.field_s != null) {
                    this.field_u.d(105);
                  }
                  this.field_s = null;
                }
              }
            } else {
              if (0 >= this.field_z) {
                this.field_z = 0;
                if (!this.field_w) {
                  this.field_r = 0;
                  if (!this.field_B) {
                    if (this.field_y != null) {
                      this.field_A.d(111);
                    }
                    this.field_y = null;
                  }
                }
              }
            }
          }
          if (!nk.field_s) {
            stackIn_33_0 = param2;
          } else {
            stackIn_33_0 = param2 << 1;
          }
          var6 = stackIn_33_0;
          if (256 > this.field_D && (null != this.field_y ||
            null != this.field_s)) {
            if (var4_int == 256) {
              this.field_A.b(param0, param1, param2);
            } else {
              if (var5 != 256) {
                if (null != this.field_x &&
                  this.field_x.length >= var6) {
                  rd.a(this.field_x, 0, var6);
                  rd.a(this.field_F, 0, var6);
                } else {
                  this.field_F = new int[var6];
                  this.field_x = new int[var6];
                }
                this.field_A.b(this.field_x, 0, param2);
                this.field_u.b(this.field_F, 0, param2);
                if (nk.field_s) {
                  localTemp$0 = param1 << 1;
                  param1 = localTemp$0;
                  stackIn_48_0 = localTemp$0;
                } else {
                  stackIn_48_0 = param1;
                }
                var7 = stackIn_48_0;
                for (var8 = 0; var6 > var8; var8++) {
                  param0[var7 + var8] = param0[var7 + var8] + (var5 * this.field_F[var8] + this.field_x[var8] * var4_int >> 8);
                }
              } else {
                this.field_u.b(param0, param1, param2);
              }
            }
          }
          if (this.field_C != null) {
            if (this.field_D == 0) {
              return;
            }
            if (this.field_x != null &&
              this.field_x.length >= var6) {
              rd.a(this.field_x, 0, var6);
            } else {
              this.field_x = new int[var6];
              this.field_F = new int[var6];
            }
            this.field_t.b(this.field_x, 0, param2);
            if (!nk.field_s) {
              stackIn_63_0 = param1;
            } else {
              localTemp$1 = param1 << 1;
              param1 = localTemp$1;
              stackIn_63_0 = localTemp$1;
            }
            var7Lifetime1 = stackIn_63_0;
            var8Lifetime1 = this.field_E * this.field_D / 256;
            var9 = -var8Lifetime1 + this.field_E;
            for (var10 = 0; var6 > var10; var10++) {
              param0[var10 + var7Lifetime1] = this.field_x[var10] * var8Lifetime1 + param0[var7Lifetime1 + var10] * var9 >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_69_0 = var4;
          stackIn_69_1 = new StringBuilder().append("r.BA(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(int param0) {
        int var1 = 57 / ((-10 - param0) / 44);
        field_v = null;
    }

    final synchronized void b(int param0, int param1) {
        this.field_E = param0;
        if (param1 != 1) {
          this.field_w = false;
        }
    }

    final synchronized int a() {
        return 2;
    }

    final eb b() {
        return null;
    }

    final static fj a(int param0, int param1, int param2, int param3) {
        boolean stackIn_45_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        fj var8_ref_fj;
        int var9;
        fj var9_ref_fj;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = TetraLink.field_J;
        id.field_M.field_Pb.field_fb.b(1);
        var4 = null;
        var5 = 0;
        var6 = 0;
        for (var7 = pl.field_d - 1; var7 >= 0; var7--) {
          var8_ref_fj = n.field_L[var7];
          var9 = 0;
          if (!cd.field_a &&
            var5 < fh.field_a) {
            var10_int = fh.a((byte) 79, var8_ref_fj.field_i);
            if (var8_ref_fj.a((byte) -63) >= var10_int && (var8_ref_fj.field_l ||
              !sb.a((byte) 2, var8_ref_fj.field_n))) {
              var9 = 1;
            }
          }
          if (var9 != 0) {
            if (null == var8_ref_fj.field_f ||
              hg.field_c) {
              if (var8_ref_fj.field_f == null) {
                lb.field_R = lb.field_R + 1;
              }
              var10 = u.a(18440, var8_ref_fj);
              var11 = var10 + jb.c(var8_ref_fj.field_h);
              var12 = fi.a((byte) 100, var8_ref_fj);
              var8_ref_fj.field_f = new hl(0L, ll.field_A, var11);
              var6 = var6 + param2;
              var8_ref_fj.field_f.field_ib = var12 - (((var12 & 16711422) >> 1) - ((16711423 & ll.field_A.field_ib) >> 1));
              var8_ref_fj.field_f.field_N = var12;
              var8_ref_fj.field_f.field_L = -((var12 & 16711422) >> 1) + (var12 + (8355711 & ll.field_A.field_L >> 1));
              var8_ref_fj.field_f.field_Ib = we.field_k;
            }
            var5++;
          } else {
            var8_ref_fj.field_f = null;
          }
        }
        var7Lifetime1 = 0;
        for (var8 = param3; pl.field_d > var8; var8++) {
          var9_ref_fj = n.field_L[var8];
          if (var9_ref_fj.field_f != null) {
            id.field_M.field_Pb.a((byte) -118, var9_ref_fj.field_f);
            var9_ref_fj.field_f.a((byte) -126, var9_ref_fj.field_f.f(param3 - 121), var7Lifetime1, param2, param0);
            var7Lifetime1 = var7Lifetime1 + param2;
            if (var9_ref_fj.field_f.field_F != 0) {
              var4 = var9_ref_fj;
            }
          }
        }
        var8Lifetime1 = id.field_M.field_Pb.field_mb + id.field_M.field_Pb.field_R - var7Lifetime1 + var6;
        id.field_M.field_Pb.field_yb = id.field_M.field_Pb.field_yb + var8Lifetime1;
        id.field_M.field_Pb.field_R = id.field_M.field_Pb.field_R - var8Lifetime1;
        if (hg.field_c) {
          id.field_M.field_Pb.field_R = var7Lifetime1;
        }
        if (hg.field_c) {
          fi.field_Cb = true;
          hg.field_c = false;
          id.field_M.field_Pb.field_Db = 0;
          id.field_M.field_Pb.field_yb = -id.field_M.field_Pb.field_R + id.field_M.field_Ob.field_R;
        }
        id.field_M.field_Pb.field_mb = -id.field_M.field_Pb.field_R + var7Lifetime1;
        if (cl.field_e &&
          gn.field_I != null) {
          fi.field_Cb = true;
        }
        var9Lifetime1 = id.field_M.field_Ob.field_R - (id.field_M.field_Pb.field_R + id.field_M.field_Pb.field_mb);
        if (fi.field_Cb) {
          id.field_M.field_Pb.field_Db = -id.field_M.field_Pb.field_yb + var9Lifetime1;
        }
        id.field_M.a(-1, true, param1 * param2 * 2, param2);
        stackIn_45_0 = (var9Lifetime1 == id.field_M.field_Pb.field_yb + id.field_M.field_Pb.field_Db);
        fi.field_Cb = stackIn_45_0;
        return (fj) (var4);
    }

    final eb c() {
        return null;
    }

    private r() throws Throwable {
        throw new Error();
    }

    static {
        field_v = "Public";
    }
}
