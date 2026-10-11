/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jf {
    static String[] field_c;
    wd field_o;
    static kg field_b;
    static int field_k;
    wd field_j;
    wd field_g;
    wd field_n;
    int field_l;
    kg field_i;
    long field_h;
    volatile int field_a;
    byte field_d;
    kg field_m;
    volatile int field_e;
    tn field_f;

    final boolean c(int param0) {
        int var2 = -97 % ((31 - param0) / 58);
        return this.a(-28475) >= 20 ? true : false;
    }

    final int a(int param0) {
        if (param0 == -28475) {
          return this.field_o.b(true) + this.field_j.b(true);
        }
        this.c((byte) -99);
        return this.field_o.b(true) + this.field_j.b(true);
    }

    public static void b(byte param0) {
        if (param0 != -88) {
          jf.a(97, -16, 45);
          field_b = null;
          field_c = null;
          return;
        }
        field_b = null;
        field_c = null;
    }

    final tn a(int param0, boolean param1, int param2, int param3, byte param4) {
        tn stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        long var6;
        tn var8;
        var6 = (long)param3 + ((long)param0 << 32);
        var8 = new tn();
        stackIn_2_0 = var8;
        stackIn_3_1 = (!param1) ? false : true;
        stackIn_2_0.field_t = stackIn_3_1;
        var8.field_r = var6;
        var8.field_z = param4;
        if (param2 != -1911606496) {
          jf.a(-99, (byte) -57);
        }
        if (!param1) {
          if (this.c((byte) -5) >= 20) {
            throw new RuntimeException();
          }
          this.field_g.a(var8, (byte) -22);
          return var8;
        }
        if (this.a(-28475) >= 20) {
          throw new RuntimeException();
        }
        this.field_o.a(var8, (byte) -118);
        return var8;
    }

    abstract void a(boolean param0);

    final boolean b(int param0) {
        if (param0 <= -123) {
          return this.c((byte) -5) >= 20 ? true : false;
        }
        this.field_n = (wd) null;
        return this.c((byte) -5) >= 20 ? true : false;
    }

    final static void a(kg param0, java.math.BigInteger param1, kg param2, int param3, java.math.BigInteger param4) {
        try {
          id.a(param2, param1, 44, param3, param0.field_m, param4, param0.field_n);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jf.M(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static e a(byte param0, int param1) {
        int var3 = 0;
        e[] var2;
        int var4;
        e[] var5;
        var4 = Confined.field_J ? 1 : 0;
        var5 = ah.l(20253);
        var2 = var5;
        if (param0 <= 123) {
          return (e) null;
        }
        for (var3 = 0; var5.length > var3; var3++) {
          if (param1 == var5[var3].field_e) {
            return var5[var3];
          }
        }
        return null;
    }

    abstract boolean a(byte param0);

    final int c(byte param0) {
        if (param0 == -5) {
          return this.field_g.b(true) + this.field_n.b(true);
        }
        this.field_h = -5L;
        return this.field_g.b(true) + this.field_n.b(true);
    }

    abstract void a(boolean param0, Object param1, byte param2);

    final static void a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = Confined.field_J ? 1 : 0;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var6Lifetime4;
        int var7Lifetime8;
        int var7Lifetime9;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        int var7Lifetime1Lifetime4;
        int var7Lifetime1Lifetime5;
        int var7Lifetime4Lifetime1;
        if (!(0 <= tg.field_H)) {
          return;
        }
        int var3 = param1 - 135;
        int var4 = -35 + param2;
        int var5 = param0;
        if (tg.field_H < 75) {
          var5 = (tg.field_H << 8) / 75;
        }
        if (!(tg.field_H <= 200)) {
          var5 = (-tg.field_H + 250 << 8) / 50;
        }
        vm.a(mi.field_a, -8409);
        ti.b();
        fn.d();
        of.a(false);
        if (var5 < 256) {
          fn.b(0, 0, fn.field_g, fn.field_l, 0, -var5 + 256);
          ib.b(false);
          if (tg.field_H < 150) {
            mi.field_a.b(var3, var4);
          } else {
            ad.field_b.a(var3 + 15, var4 + 10, var5);
          }
          var6 = tg.field_H - 125;
          if (var6 <= 0) {
            var6 = tg.field_H - 140;
            if (var6 > 0) {
              var7 = 256;
              if (var6 < 20) {
                var7 = 256 * var6 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7 * var5 >> 8);
            }
            return;
          }
          if (50 > var6) {
            if (var6 < 20) {
              var7Lifetime8 = var6 * 256 / 20;
              bg.field_c.c(var3, var4, var7Lifetime8);
            } else {
              if (var6 >= 30) {
                var7Lifetime8 = (-var6 + 50) * 256 / 20;
                bg.field_c.c(var3, var4, var7Lifetime8);
              } else {
                bg.field_c.c(var3, var4, 256);
              }
            }
            var6 = tg.field_H - 140;
            if (var6 > 0) {
              var7Lifetime8 = 256;
              if (var6 < 20) {
                var7Lifetime8 = 256 * var6 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime8 * var5 >> 8);
            }
            return;
          }
          var6Lifetime4 = tg.field_H - 140;
          if (var6Lifetime4 > 0) {
            var7Lifetime9 = 256;
            if (var6Lifetime4 < 20) {
              var7Lifetime9 = 256 * var6Lifetime4 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime9 * var5 >> 8);
          }
          return;
        }
        ib.b(false);
        if (tg.field_H < 150) {
          mi.field_a.b(var3, var4);
          var6Lifetime1 = tg.field_H - 125;
          if (var6Lifetime1 <= 0) {
            var6Lifetime1 = tg.field_H - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1 = 256 * var6Lifetime1 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime1 * var5 >> 8);
            }
            return;
          }
          if (50 <= var6Lifetime1) {
            var6Lifetime1 = tg.field_H - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime1 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1Lifetime1 = 256 * var6Lifetime1 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime1Lifetime1 * var5 >> 8);
            }
            return;
          }
          if (var6Lifetime1 < 20) {
            var7Lifetime1Lifetime2 = var6Lifetime1 * 256 / 20;
            bg.field_c.c(var3, var4, var7Lifetime1Lifetime2);
            var6Lifetime1 = tg.field_H - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime2 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1Lifetime2 = 256 * var6Lifetime1 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime1Lifetime2 * var5 >> 8);
            }
            return;
          }
          if (var6Lifetime1 < 30) {
            bg.field_c.c(var3, var4, 256);
            var6Lifetime1 = tg.field_H - 140;
            if (var6Lifetime1 > 0) {
              var7Lifetime1Lifetime3 = 256;
              if (var6Lifetime1 < 20) {
                var7Lifetime1Lifetime3 = 256 * var6Lifetime1 / 20;
              }
              ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime1Lifetime3 * var5 >> 8);
            }
            return;
          }
          var7Lifetime1Lifetime4 = (-var6Lifetime1 + 50) * 256 / 20;
          bg.field_c.c(var3, var4, var7Lifetime1Lifetime4);
          var6Lifetime1Lifetime1 = tg.field_H - 140;
          if (var6Lifetime1Lifetime1 > 0) {
            var7Lifetime1Lifetime5 = 256;
            if (var6Lifetime1Lifetime1 < 20) {
              var7Lifetime1Lifetime5 = 256 * var6Lifetime1Lifetime1 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime1Lifetime5 * var5 >> 8);
          }
          return;
        }
        ad.field_b.a(var3 + 15, var4 + 10, var5);
        var6Lifetime2 = tg.field_H - 125;
        if (var6Lifetime2 <= 0) {
          var6Lifetime2 = tg.field_H - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime2 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime2 = 256 * var6Lifetime2 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime2 * var5 >> 8);
          }
          return;
        }
        if (50 <= var6Lifetime2) {
          var6Lifetime2 = tg.field_H - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime3 = 256 * var6Lifetime2 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime3 * var5 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 20) {
          var7Lifetime4 = var6Lifetime2 * 256 / 20;
          bg.field_c.c(var3, var4, var7Lifetime4);
          var6Lifetime2 = tg.field_H - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime4Lifetime1 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime4Lifetime1 = 256 * var6Lifetime2 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime4Lifetime1 * var5 >> 8);
          }
          return;
        }
        if (var6Lifetime2 < 30) {
          bg.field_c.c(var3, var4, 256);
          var6Lifetime2 = tg.field_H - 140;
          if (var6Lifetime2 > 0) {
            var7Lifetime5 = 256;
            if (var6Lifetime2 < 20) {
              var7Lifetime5 = 256 * var6Lifetime2 / 20;
            }
            ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime5 * var5 >> 8);
          }
          return;
        }
        var7Lifetime6 = (-var6Lifetime2 + 50) * 256 / 20;
        bg.field_c.c(var3, var4, var7Lifetime6);
        var6Lifetime3 = tg.field_H - 140;
        if (var6Lifetime3 > 0) {
          var7Lifetime7 = 256;
          if (var6Lifetime3 < 20) {
            var7Lifetime7 = 256 * var6Lifetime3 / 20;
          }
          ic.field_a.a(var3 + 15, var4 + 10, var7Lifetime7 * var5 >> 8);
        }
    }

    final static nf[] a(int param0, byte param1) {
        nf[] var3 = new nf[9];
        nf[] var2 = var3;
        if (param1 >= 2) {
          var3[4] = wm.a(64, true, param0);
          return var2;
        }
        return (nf[]) null;
    }

    abstract void d(int param0);

    jf() {
        this.field_o = new wd();
        this.field_j = new wd();
        this.field_g = new wd();
        this.field_n = new wd();
        this.field_i = new kg(6);
        this.field_d = (byte) 0;
        this.field_a = 0;
        this.field_e = 0;
        this.field_m = new kg(10);
    }

    static {
        field_c = new String[]{"Pwn a Level<nbsp>3 boss", "Defeat the second boss", "Defeat the third boss", "Defeat the fourth boss", "Defeat the fifth boss", "Defeat the head of the FunOrb team", "Complete the game in hard mode", "Get five wing pods during Levels 13 to<nbsp>16", "Get five wing pods during Levels 9 to<nbsp>12", "Get five wing pods by Level<nbsp>8", "Die in a nuclear explosion", "Blow up every alien in the first level", "Blow up every alien in the first two levels", "Defeat one of the first three bosses without letting any of its pilots escape", "Don't let a boss ram you (and don't hit the tunnel)", "Nuke a rock field", "Finish the game with four nuclear missiles", "Reach Level<nbsp>20 using only missiles", "Complete the game using only missiles and lightning", "Lose your shield on Level<nbsp>13 or later and survive"};
    }
}
