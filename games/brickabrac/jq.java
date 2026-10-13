/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jq extends bc {
    static int[] field_t;
    static TextFont field_y;
    private ve field_B;
    private ih field_j;
    private byte[] field_i;
    private hb field_s;
    private int field_A;
    private IntrusiveHashTable field_l;
    private ko field_v;
    private byte[] field_e;
    private ve field_g;
    static NodeDeque field_n;
    private int field_h;
    static int field_r;
    static int field_p;
    private int field_o;
    private kg field_u;
    private boolean field_f;
    private int field_m;
    private NodeDeque field_x;
    private NodeDeque field_z;
    private boolean field_k;
    private long field_q;
    private boolean field_w;

    final int a(byte param0, int param1) {
        hb var3 = (hb) (this.field_l.get(-117, (long)param1));
        if (param0 >= -60) {
          this.field_k = true;
        }
        if (var3 != null) {
          return var3.f(-21546);
        }
        return 0;
    }

    final static void d(int param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        String stackIn_12_1 = null;
        boolean stackIn_13_2 = false;
        ta stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ta var9 = null;
        int var10 = 0;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = -LevelPack.field_k + lk.field_p;
          if (param0 != -16085) {
            return;
          }
          LevelPack.field_k = NewAchievementsScreen.field_J - (var1_int >> 1);
          mi.field_d = ea.field_e - (bg.field_r >> 1);
          lk.field_p = var1_int + LevelPack.field_k;
          var2 = mi.field_d;
          for (var3 = 0; var3 < kn.field_E.length; var3++) {
            var4 = MenuSelection.field_q[var3];
            if (var4 < 0) {
              var5 = qh.field_d;
            } else {
              if (fi.field_r.selectedIndex != var4) {
                var5 = ug.field_I;
              } else {
                var5 = om.field_hc;
              }
            }
            var6 = kn.field_E[var3];
            stackIn_12_0 = 0;
            stackIn_12_1 = var6;
            stackIn_13_2 = !(var4 < 0);
            var7 = pl.a(stackIn_12_0, stackIn_12_1, stackIn_13_2);
            var8 = NewAchievementsScreen.field_J - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + dj.field_g;
              if (fi.field_r.selectedIndex != var4) {
                stackIn_17_0 = ag.field_F;
              } else {
                stackIn_17_0 = uc.field_l;
              }
              var9 = stackIn_17_0;
              if (var9 != null) {
                var9.a((ek.field_lb << 1) + var7, (GameCanvas.field_f << 1) + TooltipSprite.field_i, -ek.field_lb + var8, false, var2);
              }
              var2 = var2 + GameCanvas.field_f;
            }
            if (var4 >= 0) {
              lj.field_r.drawLeft(var6, var8, lj.field_i + var2, var5, -1);
              var2 = var2 + (TooltipSprite.field_i + dj.field_g + GameCanvas.field_f);
            } else {
              oc.field_m.drawLeft(var6, var8, DualLinkDeque.field_b + var2, var5, -1);
              var2 = var2 + wh.field_m;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "jq.J(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var3 = 0;
        hb discarded$0 = null;
        hb discarded$1 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (null == this.field_z) {
          return;
        }
        if (param0 != 20312) {
          this.field_o = -97;
        }
        if (this.b((byte) -112) == null) {
          return;
        }
        IntrusiveNode var2 = this.field_x.first(-9);
        while (var2 != null) {
          var3 = (int)var2.key;
          if (var3 < 0) {
            var2.unlink((byte) 111);
          } else {
            if (this.field_v.field_f <= var3) {
              var2.unlink((byte) 111);
            } else {
              if (this.field_v.field_m[var3] == 0) {
                var2.unlink((byte) 111);
              } else {
                if (this.field_e[var3] == 0) {
                  discarded$0 = this.a(1, var3, (byte) -109);
                }
                if (this.field_e[var3] == -1) {
                  discarded$1 = this.a(2, var3, (byte) -116);
                }
                if (this.field_e[var3] == 1) {
                  var2.unlink((byte) 111);
                }
              }
            }
          }
          var2 = this.field_x.next((byte) 116);
        }
    }

    final void f(int param0) {
        if (param0 != -10476) {
          this.field_v = (ko) null;
        }
        if (null == this.field_B) {
          return;
        }
        this.field_f = true;
        if (this.field_z == null) {
          this.field_z = new NodeDeque();
        }
    }

    final static void e(int param0) {
        int var1 = -91 / ((33 - param0) / 48);
        cb.a(uc.e((byte) -119), 9);
    }

    final byte[] a(int param0, byte param1) {
        hb var3 = this.a(0, param0, (byte) -110);
        if (param1 > -33) {
          this.field_h = 38;
        }
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.c((byte) -85);
        var3.unlink((byte) 111);
        return var4;
    }

    final void c(int param0) {
        hb discarded$3 = null;
        hb discarded$2 = null;
        hb discarded$1 = null;
        hb discarded$0 = null;
        int var2_int;
        hb var2;
        IntrusiveNode var3;
        int var4;
        int var5;
        IntrusiveNode var6;
        IntrusiveNode var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        IntrusiveNode var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (null != this.field_z) {
          if (this.b((byte) -112) == null) {
            return;
          }
          if (this.field_k) {
            var2_int = 1;
            var3 = this.field_z.first(-101);
            while (var3 != null) {
              var4 = (int)var3.key;
              if (this.field_e[var4] == 0) {
                discarded$3 = this.a(1, var4, (byte) -118);
              }
              if (this.field_e[var4] == 0) {
                var2_int = 0;
              } else {
                var3.unlink((byte) 111);
              }
              var3 = this.field_z.next((byte) 116);
            }
            while (this.field_m < this.field_v.field_m.length) {
              if (0 == this.field_v.field_m[this.field_m]) {
                this.field_m = this.field_m + 1;
                continue;
              }
              if (250 > this.field_u.field_c) {
                if (this.field_e[this.field_m] == 0) {
                  discarded$2 = this.a(1, this.field_m, (byte) -119);
                }
                if (this.field_e[this.field_m] == 0) {
                  var6 = new IntrusiveNode();
                  var6.key = (long)this.field_m;
                  this.field_z.addLast(var6, (byte) 3);
                  var2_int = 0;
                }
                this.field_m = this.field_m + 1;
                continue;
              }
              var2_int = 0;
              break;
            }
            if ((var2_int != 0)) {
              this.field_m = 0;
              this.field_k = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_f) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_z.first(-127);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.key;
                if (this.field_e[var4Lifetime1] != 1) {
                  discarded$1 = this.a(2, var4Lifetime1, (byte) -118);
                }
                if (1 == this.field_e[var4Lifetime1]) {
                  var3Lifetime1.unlink((byte) 111);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_z.next((byte) 116);
              }
              scanLoop1: while (true) {
                if (this.field_v.field_m.length > this.field_m) {
                  if (this.field_v.field_m[this.field_m] != 0) {
                    if (this.field_j.d((byte) 101)) {
                      var2_intLifetime1 = 0;
                      break scanLoop1;
                    }
                    if (1 != this.field_e[this.field_m]) {
                      discarded$0 = this.a(2, this.field_m, (byte) -121);
                    }
                    if (1 != this.field_e[this.field_m]) {
                      var7 = new IntrusiveNode();
                      var7.key = (long)this.field_m;
                      this.field_z.addLast(var7, (byte) 3);
                      var2_intLifetime1 = 0;
                    }
                  }
                  this.field_m = this.field_m + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_f = false;
                this.field_m = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_z = null;
            }
          }
        }
        if (this.field_w &&
          this.field_q <= ue.a(false)) {
          var2 = (hb) (this.field_l.first(-15519));
          while (var2 != null) {
            if (!var2.field_u) {
              if (!var2.field_v) {
                var2.field_v = true;
              } else {
                if (!var2.field_B) {
                  throw new RuntimeException();
                }
                var2.unlink((byte) 111);
              }
            }
            var2 = (hb) (this.field_l.next(true));
          }
          this.field_q = ue.a(false) + 1000L;
        }
        if (param0 != 1) {
          this.b(-33);
        }
    }

    private final hb a(int param0, int param1, byte param2) {
        Object stackIn_59_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        var12 = (hb) (this.field_l.get(-48, (long)param1));
        var4 = var12;
        if (var12 != null &&
          0 == param0 &&
          !var12.field_B &&
          var12.field_u) {
          var12.unlink((byte) 111);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 == 0) {
            if (this.field_B != null &&
              this.field_e[param1] != -1) {
              var4 = this.field_u.a(this.field_B, param1, 125);
            } else {
              if (this.field_j.a(2)) {
                return null;
              }
              var4 = this.field_j.a(-952050528, this.field_h, (byte) 2, param1, true);
            }
          } else {
            if (param0 == 1) {
              if (null == this.field_B) {
                throw new RuntimeException();
              }
              var4 = this.field_u.a(param1, this.field_B, (byte) -114);
            } else {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_B == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_e[param1]) {
                throw new RuntimeException();
              }
              if (this.field_j.d((byte) 101)) {
                return null;
              }
              var4 = this.field_j.a(-952050528, this.field_h, (byte) 2, param1, false);
            }
          }
          this.field_l.put(34, (IntrusiveNode) (var4), (long)param1);
        }
        if (((hb) (var4)).field_u) {
          return null;
        }
        if (param2 > -104) {
          return (hb) null;
        }
        var18 = ((hb) (var4)).c((byte) -74);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof kj) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              fq.field_a.reset();
              fq.field_a.update(var5, 0, -2 + var18.length);
              var6_int = (int)fq.field_a.getValue();
              if (var6_int != this.field_v.field_p[param1]) {
                throw new RuntimeException();
              }
              if (this.field_v.field_c != null &&
                this.field_v.field_c[param1] != null) {
                var28 = this.field_v.field_c[param1];
                var27 = jd.a(var5, 0, -14970, -2 + var18.length);
                for (var9 = 0; var9 < 64; var9++) {
                  if (var27[var9] != var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = ((var5[-2 + var18.length] & 255) << 8) + (255 & var5[var18.length - 1]);
              if (var7 != (65535 & this.field_v.field_r[param1])) {
                throw new RuntimeException();
              }
              if (this.field_e[param1] != 1) {
                if (this.field_e[param1] != 0) {
                }
                this.field_e[param1] = (byte) 1;
              }
              if (!((hb) (var4)).field_B) {
                ((hb) (var4)).unlink((byte) 111);
              }
              stackIn_59_0 = var4;
              return (hb) (stackIn_59_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_e[param1] = (byte)-1;
            ((hb) (var4)).unlink((byte) 111);
            if (((hb) (var4)).field_B &&
              !this.field_j.a(2)) {
              var4 = this.field_j.a(-952050528, this.field_h, (byte) 2, param1, true);
              this.field_l.put(34, (IntrusiveNode) (var4), (long)param1);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            fq.field_a.reset();
            fq.field_a.update(var5, 0, -2 + var18.length);
            var6_int = (int)fq.field_a.getValue();
            if (var6_int != this.field_v.field_p[param1]) {
              throw new RuntimeException();
            }
            if (this.field_v.field_c != null &&
              this.field_v.field_c[param1] != null) {
              var29 = this.field_v.field_c[param1];
              var30 = jd.a(var5, 0, -14970, -2 + var18.length);
              var11 = 0;
              var9 = var11;
              while (64 > var11) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_j.field_i = 0;
            this.field_j.field_f = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_j.a((byte) 8);
          ((hb) (var4)).unlink((byte) 111);
          if (((hb) (var4)).field_B) {
            if (this.field_j.a(2)) {
              return null;
            }
            var4 = this.field_j.a(-952050528, this.field_h, (byte) 2, param1, true);
            this.field_l.put(34, (IntrusiveNode) (var4), (long)param1);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_v.field_r[param1] >>> 8);
        var5[var18.length - 1] = (byte)this.field_v.field_r[param1];
        if (this.field_B != null) {
          this.field_u.a(param1, false, var18, this.field_B);
          if (this.field_e[param1] != 1) {
            this.field_e[param1] = (byte) 1;
          }
        }
        if (!((hb) (var4)).field_B) {
          ((hb) (var4)).unlink((byte) 111);
        }
        return (hb) (var4);
    }

    final ko b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (this.field_v != null) {
          return this.field_v;
        }
        if (this.field_s == null) {
          if (this.field_j.a(2)) {
            return null;
          }
          this.field_s = (hb) ((Object) this.field_j.a(-952050528, 255, (byte) 0, this.field_h, true));
        }
        if (this.field_s.field_u) {
          return null;
        }
        var7 = this.field_s.c((byte) 99);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_s instanceof kj) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new ko(var7, this.field_A, this.field_i);
            if (this.field_o != this.field_v.field_a) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_v = null;
            if (this.field_j.a(param0 ^ -110)) {
              this.field_s = null;
            } else {
              this.field_s = (hb) ((Object) this.field_j.a(param0 ^ 952050480, 255, (byte) 0, this.field_h, true));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_v = new ko(var7, this.field_A, this.field_i);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_j.a((byte) 8);
            this.field_v = null;
            if (!this.field_j.a(2)) {
              this.field_s = (hb) ((Object) this.field_j.a(-952050528, 255, (byte) 0, this.field_h, true));
            } else {
              this.field_s = null;
            }
            return null;
          }
          if (null != this.field_g) {
            this.field_u.a(this.field_h, false, var7, this.field_g);
          }
        }
        if (null != this.field_B) {
          this.field_e = new byte[this.field_v.field_f];
        }
        if (param0 != -112) {
          this.f(-85);
        }
        this.field_s = null;
        return this.field_v;
    }

    public static void c(byte param0) {
        field_y = null;
        field_t = null;
        if (param0 != 56) {
          field_r = 120;
        }
        field_n = null;
    }

    jq(int param0, ve param1, ve param2, ih param3, kg param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_l = new IntrusiveHashTable(16);
        this.field_m = 0;
        this.field_x = new NodeDeque();
        this.field_q = 0L;
        try {
          this.field_B = param1;
          this.field_h = param0;
          if (null == this.field_B) {
            this.field_k = false;
          } else {
            this.field_k = true;
            this.field_z = new NodeDeque();
          }
          stackIn_7_1 = (param8);
          this.field_w = stackIn_7_1;
          this.field_i = param6;
          this.field_A = param5;
          this.field_j = param3;
          this.field_o = param7;
          this.field_u = param4;
          this.field_g = param2;
          if (this.field_g != null) {
            this.field_s = (hb) ((Object) this.field_u.a(this.field_g, this.field_h, -25));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("jq.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_t = new int[]{510};
        field_p = 0;
    }
}
