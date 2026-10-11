/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    static int field_i;
    static String field_d;
    static int[][] field_e;
    private int field_a;
    private boolean field_b;
    private int field_j;
    int field_h;
    private int field_g;
    int field_k;
    static int[] field_c;
    private int field_f;

    final void b(byte param0) {
        this.field_j = 0;
        this.field_a = 0;
        if (this.field_f == 0 &&
          rs.field_q == 98) {
          if (this.field_h <= 0) {
            this.field_h = this.field_k;
          }
          this.field_h = this.field_h - 1;
          this.field_b = false;
        }
        if (param0 != -120) {
          return;
        }
        if (0 == this.field_f) {
          this.field_j = rs.field_q;
        }
        if (this.field_f == 0 &&
          rs.field_q == 99) {
          this.field_h = this.field_h + 1;
          if (this.field_h >= this.field_k) {
            this.field_h = 0;
          }
          this.field_b = false;
        }
    }

    final boolean b(int param0) {
        if (param0 != 96) {
          return true;
        }
        return this.field_j == 103 ? true : false;
    }

    final boolean a(boolean param0) {
        if (param0) {
          return false;
        }
        return this.field_f != 0 ? true : false;
    }

    final boolean d(byte param0) {
        boolean stackIn_8_0 = false;
        if (param0 < 35) {
          this.field_a = -104;
        }
        stackIn_8_0 = (0 != this.field_a) || (this.field_j == 84) || (this.field_j == 83);
        return stackIn_8_0;
    }

    public static void c(byte param0) {
        field_e = (int[][]) null;
        field_c = null;
        int var1 = -45 / ((param0 + 26) / 46);
        field_d = null;
    }

    final void a(int param0, boolean param1) {
        if (this.field_f == 0) {
          this.field_b = false;
          this.field_h = param0;
        }
        if (param1) {
          this.b(15);
        }
    }

    final static void a(byte param0, boolean param1) {
        se.field_g.a(param1, true);
        if (param0 != 32) {
          field_c = (int[]) null;
        }
    }

    final boolean e(int param0) {
        int var2 = -105 % ((param0 + 19) / 60);
        return this.field_j == 102 ? true : false;
    }

    final void a(int param0, byte param1) {
        this.field_j = 0;
        int var3 = 61 % ((param1 - 78) / 48);
        this.field_a = 0;
        if (this.field_f == 0) {
          this.field_j = rs.field_q;
        }
        if (0 == this.field_f &&
          rs.field_q == 96) {
          if (this.field_h <= 0) {
            this.field_h = this.field_k;
          }
          this.field_h = this.field_h - 1;
          this.field_b = false;
        }
        if (0 == this.field_f &&
          rs.field_q == 97) {
          this.field_h = this.field_h + 1;
          this.field_b = false;
          if (this.field_h >= this.field_k) {
            this.field_h = 0;
          }
        }
        if (this.field_f == 0 &&
          (rs.field_q == 98 || rs.field_q == 99)) {
          this.field_b = false;
          if (this.field_h < 0) {
            this.field_h = param0;
          }
        }
    }

    final boolean a(int param0) {
        if (param0 != -98) {
          this.c(6);
        }
        return this.field_j == 97 ? true : false;
    }

    final static boolean d(int param0) {
        boolean stackIn_12_0 = false;
        if (param0 != 95) {
          dl.f(46);
        }
        stackIn_12_0 = ((OwnerChangeEvent.field_B &&
          im.field_w &&
          sh.field_h &&
          ve.field_b &&
          mv.field_b) ||
          DamageEvent.g(105));
        return stackIn_12_0;
    }

    final void c(int param0) {
        this.field_a = 0;
        this.field_j = 0;
        if (param0 == this.field_f) {
          this.field_j = rs.field_q;
        }
    }

    final boolean a(byte param0) {
        if (param0 >= -48) {
          this.field_f = 73;
        }
        return 96 == this.field_j ? true : false;
    }

    final static void a(int param0, int param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        je var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        mo var9 = null;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (mj.field_c > sj.field_d) {
            sj.field_d = sj.field_d + 1;
          }
          if (gb.field_y != so.field_b.field_g) {
            sh.field_l = sh.field_l + (-gb.field_y + so.field_b.field_g);
            gb.field_y = so.field_b.field_g;
          }
          if (sj.field_d <= 0) {
            return;
          }
          vi.a(-68);
          CombatEvent.field_I.a(true, param3);
          if (aw.field_i != null) {
            if (bb.field_a) {
              aw.field_i.a(param3, -6226, CombatEvent.field_I.field_V, CombatEvent.field_I.field_D);
            } else {
              aw.field_i = null;
            }
          }
          for (var4_int = param2; var4_int < 5; var4_int++) {
            var5 = gt.field_b[var4_int];
            if (var5 != null) {
              if (0 != var5.field_yb) {
                mq.a(var5, var4_int, false);
              }
              var6 = kp.a(var4_int, -119);
              we.field_g[var4_int].field_cb = dh.field_n[var6];
              bp.field_j[var4_int].field_X = co.field_k[var6];
            }
          }
          if (mc.field_f.field_yb != 0) {
            ik.field_b = new i(mc.field_f.field_V, mc.field_f.field_D, mc.field_f.field_gb, mc.field_f.field_ob, param0, jm.field_b, hr.field_m, uc.field_b, eq.field_h, hs.field_H, ms.field_k, (String) null, 0L);
          }
          var9 = wm.a(jn.field_d, mi.field_l, (byte) 127, param1);
          if (var9 != null) {
            pg.a(0, var9);
          }
          var8 = wd.a(false);
          if (var8 != null) {
            ad.field_I = var8;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "dl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 >= this.field_k) {
          throw new IllegalArgumentException();
        }
        if (param1 >= this.field_k) {
          throw new IllegalArgumentException();
        }
        this.field_a = 0;
        this.field_j = 0;
        if (param0 != DeployEvent.field_A) {
          this.field_f = DeployEvent.field_A;
          this.field_a = DeployEvent.field_A;
          this.field_b = true;
          this.field_h = param1;
          this.field_g = eu.field_a;
        }
        if (this.field_f != 0 &&
          0 != ro.field_ub) {
          if (this.field_g <= 0) {
            this.field_g = GameEvent.field_k;
          }
          this.field_g = this.field_g - 1;
        }
        if (DeployEvent.field_A == 0 &&
          ro.field_ub == 0) {
          this.field_f = 0;
        }
        if (this.field_f == 0 && (this.field_b ||
          lk.field_f)) {
          if (0 > param2) {
            if (this.field_b) {
              this.field_h = -1;
            }
          } else {
            if (param2 == this.field_h) {
            }
            this.field_b = true;
            this.field_h = param2;
          }
        }
    }

    final static void f(int param0) {
        TurnEffectEvent.a(8, eq.field_h, jm.field_b, cb.field_c, hr.field_m);
        if (param0 != 0) {
          field_i = 123;
        }
    }

    dl(int param0) {
        this.field_b = false;
        this.field_h = 0;
        this.field_k = param0;
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        this.field_f = param3;
        this.field_b = param1 ? true : false;
        if (this.field_b) {
          this.field_h = param2;
        } else {
          this.field_h = param0;
        }
    }

    static {
        field_e = new int[][]{new int[]{0, 0, 0, 0, 0}, new int[]{94, 97, 100, 127, 131}, new int[]{95, 98, 101, 128, 132}, new int[]{96, 99, 102, 129, 133}, new int[]{0, 124, 125, 126, 0}, new int[]{0, 124, 125, 126, 0}, new int[]{105, 106, 107, 130, 134}};
        field_d = "LEVEL";
        field_c = new int[8192];
    }
}
