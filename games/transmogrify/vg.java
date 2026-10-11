/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    private int field_c;
    private int field_d;
    static String field_g;
    static String field_a;
    al field_j;
    static ea field_b;
    private int field_e;
    private int field_h;
    private int field_f;
    private int field_i;

    private final int f(int param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = Transmogrify.field_A ? 1 : 0;
        if (param1 != 206) {
          this.field_i = 39;
        }
        if (this.field_i == 2 &&
          !qj.b((byte) 112)) {
          if (param0 >= 3) {
            return fd.field_b[this.field_i] + fd.field_a[this.field_i];
          }
          return fd.field_a[this.field_i];
        }
        if (this.field_i == 3) {
          return fd.field_a[this.field_i];
        }
        if (this.field_i != 1 &&
          this.field_i != 7) {
          return fd.field_a[this.field_i] + param0 * fd.field_b[this.field_i];
        }
        var3 = fd.field_a[this.field_i];
        for (var4 = 0; var4 < param0; var4++) {
          if (this.a(var4, false)) {
            var3 = var3 + fd.field_b[this.field_i];
          }
        }
        return var3;
    }

    private final void e(int param0, int param1) {
        int var7 = Transmogrify.field_A ? 1 : 0;
        String[] var8 = new String[16];
        String[] var3 = var8;
        int var4 = wf.field_d.a(db.field_b[ra.field_a], lk.field_e, var3);
        int var5 = 0;
        int var6 = 156 + param0;
        while (var4 > var5) {
          wf.field_d.b(var8[var5], 54, var6, 119, -1);
          var5++;
          var6 += 22;
        }
        if (param1 >= -25) {
          this.a(true, -9, -1, 116);
        }
        wf.field_d.a(rh.a((byte) 117, 1 + ra.field_a), 548, param0 + 142, 0, -1);
        se.field_t.c(166, param0);
    }

    private final boolean a(int param0, boolean param1) {
        if (param1) {
          return false;
        }
        if (3 == this.field_i) {
          if (param0 == 0 &&
            ra.field_a == 0) {
            return false;
          }
          if (2 == param0 &&
            ra.field_a == -1 + db.field_b.length) {
            return false;
          }
          if (param0 == 3 &&
            -1 + db.field_b.length != ra.field_a) {
            return false;
          }
          if (param0 == 3) {
            if (wc.field_d == 1) {
              return false;
            }
            if (wc.field_d == 7) {
              return false;
            }
          }
        }
        if ((this.field_i == 1 ||
          this.field_i == 7) &&
          (fd.field_h[this.field_i][param0] == 4 &&
          wj.field_o <= 0)) {
          return false;
        }
        return true;
    }

    private final int a(int param0, byte param1) {
        if (this.field_i == 2 &&
          !qj.b((byte) 80)) {
          if (param0 < 3) {
            return fd.field_e[this.field_i] + param0 * 200;
          }
          return 200 + fd.field_e[this.field_i];
        }
        if (this.field_i == 3) {
          if (param0 == 3) {
            return fd.field_e[this.field_i] + 400;
          }
          return param0 * 200 + fd.field_e[this.field_i];
        }
        if (param1 != 123) {
          return -90;
        }
        return fd.field_e[this.field_i];
    }

    private final void a(boolean param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_46_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String[] var12;
        int var13;
        int var14;
        int var15;
        int var4Lifetime1;
        int var5Lifetime1;
        int var9Lifetime1;
        int var14Lifetime1;
        var15 = Transmogrify.field_A ? 1 : 0;
        var4 = 283;
        var5 = 112;
        if (!param0) {
          stackIn_3_0 = rh.field_n;
        } else {
          stackIn_3_0 = hc.field_u;
        }
        var6 = stackIn_3_0;
        var7 = 0;
        var8 = -1;
        for (var9 = 0; qj.field_a.length > var9; var9++) {
          L10: {
            if (wl.a(false, 0) ||
              var9 != 15 ||
              (32768 & var6) != 0) {
              if ((1 << var9 & var6) != 0) {
                fc.field_h[var9].e(var4, param2 + var5);
              } else {
                if (param0) {
                  break L10;
                }
                ff.field_z.e(var4, var5 + param2);
              }
              if (var4 <= oa.field_j &&
                32 + var4 >= oa.field_j &&
                param2 + var5 <= bk.field_a &&
                bk.field_a <= param2 + (var5 + 32)) {
                sb.b(-2 + var4, -2 + var5, 36, 36, 6, 8421504);
                var8 = var9;
              }
              if (var4 <= this.field_d &&
                this.field_d <= 32 + var4 &&
                param2 + var5 <= this.field_h &&
                32 + (var5 + param2) >= this.field_h) {
                this.field_d = -1;
                if (var9 != this.field_e) {
                  this.field_e = var9;
                } else {
                  this.field_e = -1;
                }
              }
              if (this.field_e == var9) {
                sb.b(var4 - 2, var5 - 2, 36, 36, 6, 1579032);
              }
              incrementValue$0 = var7;
              var7++;
              if (incrementValue$0 != 7) {
                var4 += 40;
              } else {
                var4 = 283;
                var5 += 40;
              }
            }
          }
        }
        if (-1 < this.field_e) {
          var8 = this.field_e;
        }
        if (param1 != -2) {
          return;
        }
        if (var8 != -1) {
          var9Lifetime1 = wf.field_d.field_t + (wf.field_d.field_D + 2);
          wf.field_d.c(qj.field_a[var8], 438, param2 + 206, 0, -1);
          stackIn_46_0 = ((var6 & 1 << var8) == 0) ? 0 : 1;
          var10 = stackIn_46_0;
          if (var10 != 0) {
            wf.field_d.c(rl.field_i, 438, 206 + (var9Lifetime1 + param2), 0, -1);
          } else {
            wf.field_d.c(ff.field_x, 438, var9Lifetime1 + 206 + param2, 16711680, -1);
          }
          if (var10 == 0) {
            ff.field_z.c(263, 206 + var9Lifetime1 + param2);
          } else {
            fc.field_h[var8].c(263, param2 + (206 + var9Lifetime1));
          }
          var11 = 4 + (wf.field_d.field_y * 2 + (206 + param2));
          var12 = new String[16];
          var13 = wf.field_d.a(bl.field_b[var8], new int[]{219}, var12);
          var11 = var11 + ((-var13 + 4) * var9Lifetime1 >> 1);
          for (var14 = 0; var14 < var13; var14++) {
            wf.field_d.b(var12[var14], 394, var11, 0, -1);
            var11 = var11 + var9Lifetime1;
          }
          if (var13 < 3) {
            var11 = var11 + var9Lifetime1;
          }
          wf.field_d.b(gj.field_f + rg.field_B[var8], 394, var11, 0, -1);
          var4Lifetime1 = 394;
          var11 = var11 + var9Lifetime1;
          wf.field_d.b(ck.field_F, var4Lifetime1, var11, 0, -1);
          var4Lifetime1 = var4Lifetime1 + wf.field_d.a(ck.field_F);
          for (var14Lifetime1 = 0; wd.field_k[var8] > var14Lifetime1; var14Lifetime1++) {
            og.field_b.c(var4Lifetime1, -wf.field_d.field_y + var11);
            var4Lifetime1 = var4Lifetime1 + og.field_b.field_n / 3;
          }
        } else {
          var5Lifetime1 = param2 + 206 - wf.field_d.field_y;
          var9Lifetime1 = wf.field_d.field_t + wf.field_d.field_y;
          var5Lifetime1 = var5Lifetime1 + var9Lifetime1 * wf.field_d.a(aj.field_v, 283, var5Lifetime1, 310, 1000, 0, -1, 1, 0, var9Lifetime1);
          var5Lifetime1 = var5Lifetime1 + var9Lifetime1;
          if (qj.b((byte) 95)) {
            wf.field_d.a(tj.field_t, 283, var5Lifetime1, 310, 1000, 0, -1, 1, 0, var9Lifetime1);
          }
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 256) {
          field_g = (String) null;
        }
        int var3 = 0;
        if (this.field_i == 0 &&
          this.field_j.field_d != -1) {
          var3 = this.field_j.field_d;
        }
        if (this.field_i == 1 && this.field_j.field_d != -1 &&
          be.field_q != -1) {
          var3 = this.field_j.field_d;
        }
        if (this.field_i == 3) {
          var3 = 2;
        }
        this.field_j.a(this.a(oa.field_j, param1 + 1192, bk.field_a), var3, (byte) 61, param0);
        this.field_e = -1;
        this.field_f = 0;
    }

    private final void a(boolean param0, int param1, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_3_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var10 = Transmogrify.field_A ? 1 : 0;
        stackIn_3_0 = (!rj.field_b) ? 0 : 1;
        var4 = stackIn_3_0;
        if (null != ub.field_c &&
          !ub.field_c.field_c) {
          var4 = 1;
        }
        var5 = fd.field_h[this.field_i][param1];
        if (!param2) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var5 == 0 &&
          uc.field_d) {
          if (!qj.b((byte) 120)) {
            if (null == sh.field_c) {
              uc.field_d = false;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (!sh.field_c.field_k) {
                uc.field_d = false;
                decompiledFrameRemainder0 = false;
              }
              else {
                if (null == sh.field_c.field_l) {
                  uc.field_d = false;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (sh.field_c.field_l[1][0] != 0) {
                    uc.field_d = false;
                    decompiledFrameRemainder0 = false;
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var5 = 20;
          }
        }
        L4: {
          L5: {
            var9 = var5;
            if (0 != var9) {
              if (var9 != 20) {
                if (var9 != 1 &&
                  var9 != 21) {
                  if (var9 == 5) {
                    if (!this.field_j.f(-9112)) {
                      break L5;
                    }
                    vk.a((byte) 127, dg.field_d[0]);
                    qf.field_d = 0;
                    break L4;
                  }
                  if (16 == var9) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 89, dg.field_d[0]);
                      qf.field_d = 0;
                    }
                    break L4;
                  }
                  if (var9 == 14) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 120, dg.field_d[0]);
                      qf.field_d = 4;
                    }
                    break L4;
                  }
                  if (var9 == 3) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 110, dg.field_d[0]);
                      wc.field_d = this.field_i;
                      qf.field_d = 3;
                      ra.field_a = 0;
                    }
                    break L4;
                  }
                  if (var9 == 6) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 125, dg.field_d[0]);
                      qf.field_d = wc.field_d;
                    }
                    break L4;
                  }
                  if (var9 == 2) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 91, dg.field_d[0]);
                      qf.field_d = 2;
                    }
                    break L4;
                  }
                  if (12 == var9) {
                    var6 = kc.field_g;
                    var7 = 0;
                    if (this.field_j.e(0)) {
                      ec.a(0, 9956);
                    }
                    if (this.field_j.c(-4135)) {
                      var7 = 1;
                      ec.a(256, 9956);
                    }
                    if (this.field_j.b((byte) 78)) {
                      var9 = 256 * (oa.field_j - this.field_c) / 80;
                      if (var9 <= 0) {
                        ec.a(0, 9956);
                      } else {
                        if (var9 >= 256) {
                          ec.a(256, 9956);
                        } else {
                          ec.a(var9, 9956);
                        }
                      }
                    }
                    if (this.field_j.c(param2)) {
                      qj.e(-127);
                    }
                    if (this.field_j.c((byte) -72)) {
                      lf.a((byte) -125);
                      var7 = 1;
                    }
                    if (kc.field_g == var6 &&
                      var7 == 0) {
                      break L5;
                    }
                    if ((!(lj.field_u.b(8)) ||
                      lj.field_u.l())) {
                      lj.field_u.j(0);
                      lj.field_u.k(255);
                      ic.a(lj.field_u, 4);
                    }
                    break L4;
                  }
                  if (13 == var9) {
                    if (this.field_j.e(0)) {
                      uc.a(0, (byte) -118);
                    }
                    var8 = 128;
                    if (this.field_j.c(-4135)) {
                      uc.a(var8, (byte) -121);
                    }
                    if (this.field_j.b((byte) 83)) {
                      var9 = 256 * (oa.field_j - this.field_c) / 80;
                      if (var9 <= 0) {
                        uc.a(0, (byte) -117);
                      } else {
                        if (var9 >= 256) {
                          uc.a(var8, (byte) -127);
                        } else {
                          uc.a(128 * var9 >> 8, (byte) -122);
                        }
                      }
                    }
                    if (this.field_j.c(param2)) {
                      if (lb.field_a <= var8 >> 3) {
                        uc.a(0, (byte) -125);
                      } else {
                        uc.a(-(var8 >> 3) + lb.field_a, (byte) -124);
                      }
                    }
                    if (!this.field_j.c((byte) -72)) {
                      break L5;
                    }
                    if (var8 * 7 >> 3 <= lb.field_a) {
                      uc.a(var8, (byte) -127);
                    } else {
                      uc.a((var8 >> 3) + lb.field_a, (byte) -123);
                    }
                    break L4;
                  }
                  if (var9 == 4) {
                    if (!this.field_j.f(-9112)) {
                      break L5;
                    }
                    vk.a((byte) 83, dg.field_d[0]);
                    if (null != ub.field_c) {
                      qd.b(5);
                    } else {
                      var9 = param0 ? 1 : 0;
                      dj.a(param2, var9 != 0);
                    }
                    break L4;
                  }
                  if (var9 == 7) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 120, dg.field_d[0]);
                      if (hc.field_u == 0 &&
                        pf.field_g == 0) {
                        qf.field_d = 0;
                      } else {
                        if (qj.b((byte) 82)) {
                          qf.field_d = 5;
                        } else {
                          ug.b(true);
                          if (hc.field_u != 0) {
                            qf.field_d = 6;
                          } else {
                            qf.field_d = 2;
                          }
                          sh.field_c = null;
                        }
                      }
                      wc.field_d = 0;
                    }
                    break L4;
                  }
                  if (var9 == 22) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 127, dg.field_d[0]);
                      wc.field_d = 0;
                      qf.field_d = 0;
                    }
                    break L4;
                  }
                  if (8 == var9) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 92, dg.field_d[0]);
                      ck.field_y = 0;
                    }
                    break L4;
                  }
                  if (var9 == 9) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 88, dg.field_d[0]);
                      ck.field_y = 1;
                    }
                    break L4;
                  }
                  if (var9 == 10) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 105, dg.field_d[0]);
                      ck.field_y = 2;
                    }
                    break L4;
                  }
                  if (var9 == 15) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 92, dg.field_d[0]);
                      if (4 != this.field_i &&
                        this.field_i != 2) {
                        if ((this.field_i == 5)) {
                          vb.a(5, 6, (byte) 99);
                        }
                      } else {
                        vb.a(this.field_i, this.field_i, (byte) 121);
                      }
                    }
                    break L4;
                  }
                  if (var9 == 18) {
                    if (!this.field_j.f(-9112)) {
                      break L5;
                    }
                    if (!(!this.a(param1, false))) {
                      vk.a((byte) 105, dg.field_d[0]);
                      ra.field_a = ra.field_a - 1;
                      if ((ra.field_a == 0)) {
                        this.field_j.field_d = 2;
                      }
                    }
                    break L4;
                  }
                  if (var9 == 19) {
                    if (!this.field_j.f(-9112)) {
                      break L5;
                    }
                    if (!(!this.a(param1, false))) {
                      vk.a((byte) 127, dg.field_d[0]);
                      ra.field_a = ra.field_a + 1;
                      if ((-1 + db.field_b.length == ra.field_a)) {
                        if (wc.field_d != 1 &&
                          wc.field_d != 7) {
                          this.field_j.field_d = 3;
                        } else {
                          this.field_j.field_d = 1;
                        }
                      }
                    }
                    break L4;
                  }
                  if (var9 == 11) {
                    if (!(!this.field_j.f(-9112))) {
                      vk.a((byte) 106, dg.field_d[0]);
                      vl.a((byte) 93, ha.b(125));
                    }
                    break L4;
                  }
                  if (17 != var9) {
                    break L4;
                  }
                  if (this.field_j.d(104)) {
                    vk.a((byte) 120, dg.field_d[0]);
                    while (true) {
                      fieldTemp$0 = am.field_n + 1;
                      am.field_n = am.field_n + 1;
                      if (fieldTemp$0 == we.field_l.length) {
                        am.field_n = 0;
                      }
                      if (we.field_l[am.field_n].field_g) {
                        continue;
                      }
                      break;
                    }
                  }
                  if (!this.field_j.a((byte) -112)) {
                    break L4;
                  }
                  vk.a((byte) 113, dg.field_d[0]);
                  while (true) {
                    fieldTemp$1 = am.field_n - 1;
                    am.field_n = am.field_n - 1;
                    if (fieldTemp$1 < 0) {
                      am.field_n = -1 + we.field_l.length;
                    }
                    if (we.field_l[am.field_n].field_g) {
                      continue;
                    }
                    break;
                  }
                  break L5;
                }
                if ((!(!this.field_j.f(-9112))) &&
                  ((var4 != 0))) {
                  vk.a((byte) 112, dg.field_d[0]);
                  wc.field_d = 0;
                  qf.field_d = -1;
                }
                break L4;
              }
              if (!this.field_j.f(-9112)) {
                break L4;
              }
              if (var4 != 0) {
                vk.a((byte) 105, dg.field_d[0]);
                sh.field_c = null;
                rh.field_t = null;
                rc.a(true, (byte) -13);
                wc.field_d = 0;
                qf.field_d = -1;
                uc.field_d = false;
                wd.a(17099, true, bd.field_u[1]);
              }
            } else {
              if (!this.field_j.f(-9112)) {
                break L4;
              }
              if (var4 != 0) {
                vk.a((byte) 91, dg.field_d[0]);
                sh.field_c = null;
                rh.field_t = null;
                rc.a(false, (byte) -13);
                wc.field_d = 0;
                qf.field_d = -1;
                wd.a(17099, true, bd.field_u[1]);
              }
            }
          }
        }
    }

    private final int b(int param0, int param1) {
        if (param0 <= 100) {
          this.field_d = 62;
        }
        if (ci.field_g[this.field_i]) {
          return jk.field_x.a(true);
        }
        return fd.field_b[this.field_i];
    }

    final void c(byte param0) {
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        this.field_f = this.field_f + 1;
        while (pc.b(-128)) {
          if (13 != ch.field_d) {
            this.b((byte) -120);
            if (this.field_j.field_d == -1) {
              continue;
            }
            this.a(false, this.field_j.field_d, true);
            continue;
          }
          if (this.field_i != 1 &&
            this.field_i != 7) {
            if (this.field_i == 5) {
              continue;
            }
            qf.field_d = wc.field_d;
            continue;
          }
          qf.field_d = -1;
        }
        if (3 == this.field_i) {
          ob.a(1, 2, sg.field_p, this.field_f);
        }
        if ((this.field_i == 2 ||
          this.field_i == 6) &&
          null == d.field_e) {
          wd.a(17099, true, bd.field_u[6]);
        }
        if (param0 != 122) {
          this.g(-27, -43);
        }
        this.field_j.a(-107, this.a(ol.field_b, 1448, nk.field_c), this.a(oa.field_j, 1448, bk.field_a));
        if (-1 != this.field_j.field_d) {
          this.a(true, this.field_j.field_d, true);
        }
        if (tg.field_d != 0) {
          this.field_h = nk.field_c;
          this.field_d = ol.field_b;
        }
    }

    final static boolean a(boolean param0, CharSequence param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int < 1) {
            return false;
          }
          if (var3_int > 12) {
            return false;
          }
          var4 = hj.a((byte) -125, param1);
          if (var4 != null &&
            var4.length() >= 1) {
            if (!uf.a(var4.charAt(0), (byte) -56) &&
              !uf.a(var4.charAt(-1 + var4.length()), (byte) -104)) {
              if (param2 != 26) {
                vg.a((byte) -35);
              }
              var5 = 0;
              for (var6 = 0; var6 < param1.length(); var6++) {
                var7 = param1.charAt(var6);
                if (uf.a((char) var7, (byte) -121)) {
                  var5++;
                } else {
                  var5 = 0;
                }
                if (var5 >= 2 &&
                  !param0) {
                  return false;
                }
              }
              if (var5 <= 0) {
                return true;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_39_0 = var3;
          stackIn_39_1 = new StringBuilder().append("vg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != -60) {
          return;
        }
        field_b = null;
        field_g = null;
        field_a = null;
    }

    private final int a(int param0, int param1) {
        if (this.field_i == 2 &&
          !qj.b((byte) 94)) {
          return 180 + this.a(param0, (byte) 123);
        }
        if (this.field_i == 3) {
          return this.a(param0, (byte) 123) + 180;
        }
        if (param1 != 180) {
          vg.a(127, 64, false, true, 96, 2, 81);
        }
        return fd.field_c[this.field_i];
    }

    private final void g(int param0, int param1) {
        int var13_int = 0;
        String var3;
        int var4;
        mi var5_ref_mi;
        int var5;
        o var6;
        int var7;
        int var8;
        String[] var9;
        int var12;
        ti var13;
        int var14;
        int var15;
        int var16;
        String var17;
        ti var18;
        int var19;
        int[] var26;
        long[] var27;
        int var5Lifetime1;
        L0: {
          var19 = Transmogrify.field_A ? 1 : 0;
          var4 = -66 / ((param0 - 41) / 60);
          if (qj.b((byte) 93)) {
            var3 = tj.field_t;
          } else {
            if (sh.field_c == null) {
              sh.field_c = pj.a(29, (byte) -10, 3, 10, 1);
            }
            var5_ref_mi = wf.field_d;
            var6 = sh.field_c;
            var7 = ck.field_y;
            if (var6.field_k) {
              if (var6.field_m != null) {
                var3 = th.field_e;
                var8 = 0;
                var9 = var6.field_m[var7];
                var27 = var6.field_g[var7];
                var26 = var6.field_l[var7];
                var12 = param1 + var5_ref_mi.field_y + 23;
                for (var13_int = 0; var13_int < 10; var13_int++) {
                  if (var9[var13_int] != null) {
                    var14 = 119;
                    var15 = var26[var13_int] >> 6;
                    var16 = 63 & var26[var13_int];
                    var17 = var9[var13_int];
                    if (qg.a(var17, (byte) 106) &&
                      var8 == 0 &&
                      rh.field_t != null &&
                      var27[var13_int] == rh.field_t.field_o &&
                      pf.field_g == var15 &&
                      qi.field_c.field_o == var16) {
                      var8 = 1;
                      var14 = 255;
                    }
                    var5_ref_mi.a(var13_int + 1 + ". ", 268, var12, var14, -1);
                    var5_ref_mi.b(var17, 268, var12, var14, -1);
                    var5_ref_mi.a(Integer.toString(var15), 520, var12, var14, -1);
                    var18 = we.field_l[var16].field_a;
                    var18.f(528, -1 + (-var5_ref_mi.field_y + (var12 + var5_ref_mi.field_C)) - (24 - (-var18.field_m + 24) / 2));
                    var3 = "";
                  }
                  var12 += 28;
                }
                if (((-2147483648 != pf.field_g)) &&
                  ((var8 == 0)) &&
                  ((pf.field_g != 0))) {
                  var5_ref_mi.b(w.field_a, 268, var12, 255, -1);
                  var5_ref_mi.a(Integer.toString(pf.field_g), 520, var12, 255, -1);
                  var13 = qi.field_c.field_a;
                  var13.f(528, (24 - var13.field_m) / 2 + (-1 + var5_ref_mi.field_C - var5_ref_mi.field_y) + (var12 - 24));
                }
                break L0;
              }
              var3 = wg.field_e;
            } else {
              var3 = mh.field_d;
            }
          }
        }
        var5 = param1 + 163;
        wf.field_d.a(var3, 224, var5, 346, 1000, 119, -1, 1, 0, -4 + (wf.field_d.field_t + wf.field_d.field_y));
        if (0 == var3.length()) {
          var5Lifetime1 = 331 + param1;
          og.field_a.a(sg.field_o, 224, var5Lifetime1, 346, 1000, 119, -1, 1, 0, og.field_a.field_y - (-og.field_a.field_t + 4));
        }
    }

    final void d(int param0, int param1) {
        boolean stackIn_10_0 = false;
        boolean stackIn_11_1 = false;
        boolean stackIn_13_2 = false;
        boolean stackIn_14_3 = false;
        int stackIn_16_0 = 0;
        boolean stackIn_16_1 = false;
        boolean stackIn_17_2 = false;
        boolean stackIn_20_3 = false;
        boolean stackIn_22_0 = false;
        boolean stackIn_23_1 = false;
        int stackIn_25_2 = 0;
        boolean stackIn_26_3;
        boolean stackIn_39_1 = false;
        int var3;
        int var4;
        int var5;
        int var7;
        String var8;
        String var9;
        String var10;
        int var3Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var7 = Transmogrify.field_A ? 1 : 0;
        rk.field_r[this.field_i].f(0, param1);
        if (this.field_i != 2) {
          if (3 == this.field_i) {
            this.e(param1, -92);
          } else {
            if (4 == this.field_i) {
              this.a(false, -2, param1);
            } else {
              if (this.field_i != 6) {
                if (this.field_i == 5) {
                  var3 = 130 + param1;
                  var4 = 4 + wf.field_d.field_t + wf.field_d.field_D;
                  var5 = var4 * wf.field_d.b(sd.field_Q, 341);
                  wf.field_d.a(sd.field_Q, 150, var3, 341, var5, 0, -1, 1, 0, var4);
                  var3 = var3 + var5;
                  stackIn_10_0 = true;
                  stackIn_11_1 = (hc.field_u == 0) ? false : true;
                  stackIn_13_2 = false;
                  stackIn_14_3 = (pf.field_g == 0) ? false : true;
                  var8 = aj.a(stackIn_10_0, stackIn_11_1, stackIn_13_2, stackIn_14_3);
                  var5Lifetime1 = var4 * wf.field_d.b(var8, 341);
                  wf.field_d.a(var8, 150, var3, 341, var5Lifetime1, 0, -1, 1, 0, var4);
                  var3 = var3 + var5Lifetime1;
                  var3 = var3 + (jk.field_x.a(true) + var4);
                  stackIn_16_0 = -85;
                  stackIn_16_1 = false;
                  stackIn_17_2 = (pf.field_g == 0) ? false : true;
                  stackIn_20_3 = (hc.field_u == 0) ? false : true;
                  var9 = gd.$cfr$intArgs$a$c7de0d339b2a(stackIn_16_0, stackIn_16_1, stackIn_17_2, stackIn_20_3);
                  var5Lifetime2 = var4 * wf.field_d.b(var9, 341);
                  wf.field_d.a(var9, 150, var3, 341, var5Lifetime2, 0, -1, 1, 0, var4);
                  var3 = var3 + var5Lifetime2;
                  var3 = var3 + jk.field_x.a(true);
                  stackIn_22_0 = false;
                  stackIn_23_1 = (hc.field_u == 0) ? false : true;
                  stackIn_25_2 = -106;
                  stackIn_26_3 = (pf.field_g == 0) ? false : true;
                  var10 = we.a(stackIn_22_0, stackIn_23_1, stackIn_25_2, stackIn_26_3);
                  var5Lifetime3 = wf.field_d.b(var10, 341) * var4;
                  wf.field_d.a(var10, 150, var3, 341, var5Lifetime3, 0, -1, 1, 0, var4);
                }
              } else {
                this.a(true, -2, param1);
              }
            }
          }
        } else {
          this.g(param0 - 20002, param1);
        }
        if (param0 != 20104) {
          return;
        }
        for (var3Lifetime1 = 0; this.field_j.field_a > var3Lifetime1; var3Lifetime1++) {
          if (this.a(var3Lifetime1, false)) {
            stackIn_39_1 = (var3Lifetime1 == this.field_j.field_d);
            this.a(stackIn_39_1, -118, param1, var3Lifetime1);
          }
        }
    }

    private final void b(byte param0) {
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (2 == this.field_i &&
          !qj.b((byte) 114)) {
          if (!this.field_j.b((byte) 117)) {
            if (ch.field_d == 96) {
              this.field_j.field_f = false;
              if (this.field_j.field_d > 0) {
                if (this.field_j.field_d != 3) {
                  this.field_j.field_d = this.field_j.field_d - 1;
                }
              } else {
                this.field_j.field_d = 2;
              }
            }
            if (ch.field_d == 97) {
              if (2 <= this.field_j.field_d) {
                if (this.field_j.field_d == 2) {
                  this.field_j.field_d = 0;
                }
              } else {
                this.field_j.field_d = this.field_j.field_d + 1;
              }
              this.field_j.field_f = false;
            }
            if (ch.field_d == 99) {
              this.field_j.field_f = false;
              if (0 <= this.field_j.field_d &&
                this.field_j.field_d <= 2) {
                this.field_j.field_d = 3;
              } else {
                this.field_j.field_d = ck.field_y;
              }
            }
            if (98 == ch.field_d) {
              this.field_j.field_f = false;
              if (this.field_j.field_d != 3) {
                this.field_j.field_d = 3;
              } else {
                this.field_j.field_d = ck.field_y;
              }
            }
          }
          this.field_j.a(false);
          return;
        }
        if (this.field_i == 3) {
          this.field_j.b(false);
          if (ch.field_d != 96 &&
            ch.field_d != 97) {
            return;
          }
          while (!this.a(this.field_j.field_d, false)) {
            this.field_j.b(false);
          }
          return;
        }
        this.field_j.d((byte) -6);
        if (ch.field_d == 98 ||
          ch.field_d == 99) {
          while (!this.a(this.field_j.field_d, false)) {
            this.field_j.d((byte) -6);
          }
        }
        if (param0 != -120) {
          this.field_i = 51;
        }
    }

    vg(int param0) {
        this.field_c = -1;
        this.field_d = -1;
        this.field_e = -1;
        this.field_i = param0;
        this.field_j = new al(fd.field_h[param0].length);
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        int var6;
        var6 = Transmogrify.field_A ? 1 : 0;
        for (var4 = 0; fd.field_h[this.field_i].length > var4; var4++) {
          var5 = this.f(var4, 206);
          if (this.a(var4, false) &&
            param0 >= this.a(var4, (byte) 123) &&
            param0 < this.a(var4, 180) &&
            var5 <= param2 &&
            var5 + this.b(param1 ^ 1476, var4) > param2) {
            return var4;
          }
        }
        if (param1 == 1448) {
          return -1;
        }
        return 99;
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 <= param5) {
            return;
          }
          if (1 + param5 >= param1) {
            return;
          }
          if (5 + param5 < param1 &&
            param4 != param6) {
            var7_int = (param6 >> 1) + ((param4 >> 1) + (1 & (param4 & param6)));
            var8 = param5;
            var9 = param6;
            var10 = param4;
            for (var11 = param5; var11 < param1; var11++) {
              var12 = lk.field_d[var11];
              if (param3) {
                stackIn_24_0 = dk.field_k[var12];
              } else {
                stackIn_24_0 = tb.field_d[var12];
              }
              var13 = stackIn_24_0;
              if (var13 > var7_int) {
                lk.field_d[var11] = lk.field_d[var8];
                if (var9 > var13) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                lk.field_d[incrementValue$0] = var12;
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            vg.a(param0, var8, true, param3, var9, param5, param6);
            vg.a(param0, param1, param2, param3, param4, var8, var10);
            return;
          }
          for (var7_intLifetime1 = -1 + param1; var7_intLifetime1 > param5; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = lk.field_d[var8Lifetime1];
              var10Lifetime1 = lk.field_d[1 + var8Lifetime1];
              if (h.a(var9Lifetime1, var10Lifetime1, -7079, param3)) {
                lk.field_d[var8Lifetime1] = var10Lifetime1;
                lk.field_d[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var7), "vg.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static int c(int param0, int param1) {
        return param0 & param1;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int stackIn_12_0 = 0;
        int stackIn_40_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        String var9;
        int var10;
        mi var11;
        int var12;
        ti var12_ref_ti;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = Transmogrify.field_A ? 1 : 0;
        var5 = param2 + this.f(param3, 206);
        var6 = this.a(param3, (byte) 123);
        var7 = this.a(param3, 180);
        var8 = fd.field_h[this.field_i][param3];
        var9 = de.field_c[var8];
        if (mg.field_d) {
          if (1 == var8) {
            var9 = re.field_m;
          }
          if (var8 == 7) {
            var9 = ca.field_a;
          }
        }
        if (var9 == null) {
          var9 = "ERROR: missing text";
        }
        stackIn_12_0 = (param0) ? 0 : 119;
        var10 = stackIn_12_0;
        if (param1 > -116) {
          return;
        }
        var11 = wf.field_d;
        if (var8 != 12 &&
          var8 != 13) {
          if (var8 == 17) {
            var12_ref_ti = we.field_l[am.field_n].field_a;
            var13 = var11.a(var9);
            var14 = 36 + var13;
            var15 = var6 + var7 - var14 >> 1;
            var12_ref_ti.c(var13 + (var15 + (36 - var12_ref_ti.field_n) / 2), -24 + var5 + (var11.field_C - 1) + (-var12_ref_ti.field_m + 24) / 2);
            if (!param0) {
              var11.b(var9, var15, var11.field_y + var5, var10, -1);
            } else {
              le.field_A.b(var9, var15, var11.field_y + var5, var10, -1);
            }
          } else if (!ci.field_g[this.field_i]) {
            if (!param0) {
              var11.c(var9, var7 + var6 >> 1, var11.field_y + var5, var10, -1);
            } else {
              le.field_A.c(var9, var6 + var7 >> 1, var5 + var11.field_y, var10, -1);
            }
          } else {
            var12 = 16710412;
            if (var8 >= 8 &&
              var8 <= 10 &&
              param3 == ck.field_y) {
              var12 = 9240408;
            }
            if (param0) {
              var12 = 16776867;
            }
            pa.a(var5, var9, 39935, var12, -var6 + var7, var12, var6, -10, 39935);
          }
        } else {
          if (this.field_c == -1) {
            var12 = var11.a(de.field_c[12]);
            var13 = var11.a(de.field_c[13]);
            if (var13 > var12) {
              var12 = var13;
            }
            this.field_c = var6 + var7 - (-var12 + 81) >> 1;
          }
          sb.d(this.field_c, fd.field_b[this.field_i] / 2 + var5 - 1, 81, 2, var10);
          if (var8 != 12) {
            stackIn_40_0 = (lb.field_a << 8) / 128;
          } else {
            stackIn_40_0 = kc.field_g;
          }
          var12 = stackIn_40_0;
          var12 = 80 * var12 / 256;
          sb.d(var12 + (this.field_c - 1), 3 + var5, 3, -6 + fd.field_b[this.field_i], var10);
          if (param0) {
            le.field_A.a(var9, this.field_c, var5 + var11.field_y, var10, -1);
          } else {
            var11.a(var9, this.field_c, var5 + var11.field_y, var10, -1);
          }
        }
    }

    static {
        field_g = "Members";
        field_a = "Waiting for graphics";
        field_b = null;
    }
}
