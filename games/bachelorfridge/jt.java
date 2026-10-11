/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jt {
    int[] field_o;
    private sna field_n;
    private ola field_c;
    static jg field_f;
    private int field_b;
    static kv field_g;
    sna field_l;
    private sna field_t;
    private sna field_s;
    private gba field_m;
    private sna field_k;
    private wl field_q;
    lha field_p;
    private int field_d;
    private sna field_r;
    int field_a;
    private int field_i;
    private int field_j;
    ula field_h;
    private sna field_e;

    private final void h(int param0) {
        int var2;
        int var3;
        var3 = BachelorFridge.field_y;
        cc.field_b.field_z = null;
        var2 = 0;
        if (param0 != -1) {
          return;
        }
        while (var2 < this.field_o.length) {
          if (var3 == 0) {
            if (this.field_o[var2] != 0) {
              cc.field_b.a(-1, new ona(var2, kka.field_i[var2], new kna(var2, this.field_o[var2])));
            }
            var2++;
            continue;
          }
          break;
        }
    }

    final void a(int param0, int param1) {
        kv stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_54_3;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jfa var6_ref_jfa = null;
        int var7 = 0;
        jfa var8_ref_jfa = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        boolean decompiledFrameRemainder2 = true;
        var11 = BachelorFridge.field_y;
        Math.sin((double)vr.field_b / 10.0 * 0.5);
        if (ku.field_q &&
          this.field_s.field_T &&
          cc.field_b.field_z == null) {
          ng.field_a.e(param0 + 410, 138);
          decompiledFrameRemainder2 = (var11 != 0);
        }
        if (decompiledFrameRemainder2) {
          if (!ku.field_q ||
            null == cc.field_b.field_z) {
            cba.field_a.e(410 + param0, 148);
            if (var11 != 0) {
              if (!this.field_s.field_T ||
                cc.field_b.field_z == null) {
                gca.field_g.e(410 + param0, 148);
                kga.field_d.e(param0 + 410, 138);
              } else {
                kga.field_d.e(param0 + 410, 138);
              }
            }
          } else {
            if (!this.field_s.field_T ||
              cc.field_b.field_z == null) {
              gca.field_g.e(410 + param0, 148);
              if (var11 != 0) {
                kga.field_d.e(param0 + 410, 138);
              }
            } else {
              kga.field_d.e(param0 + 410, 138);
            }
          }
        }
        if (!this.field_c.field_s.field_T ||
          this.field_a == 0) {
          ska.field_k.e(param0 + 519, 11);
          if (var11 != 0) {
            tl.field_s.e(525 + param0, 11);
          }
        } else {
          tl.field_s.e(525 + param0, 11);
        }
        if (this.field_a == 0 ||
          this.field_i > 0) {
          this.c(true);
          dg.c();
          if (this.field_p != null) {
            this.field_p.a(true);
          }
        }
        if (param1 != 8687) {
          this.field_n = (sna) null;
        }
        if (this.field_a == 1 ||
          this.field_b > 0) {
          boolean decompiledFrameRemainder1 = true;
          kaa.field_l[0].e(param0 + 0, 6);
          if (2 <= this.field_d) {
            if (this.field_d < 4) {
              kaa.field_l[3].e(param0, 72);
              decompiledFrameRemainder1 = (var11 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (this.field_d >= 6) {
                if (this.field_d < 8) {
                  kaa.field_l[3].e(param0, 72);
                  if (var11 != 0) {
                    kaa.field_l[1].e(param0, 72);
                    kaa.field_l[2].e(param0, 72);
                    kaa.field_l[1].e(param0, 72);
                  }
                } else {
                  kaa.field_l[1].e(param0, 72);
                  if (var11 != 0) {
                    kaa.field_l[2].e(param0, 72);
                    kaa.field_l[1].e(param0, 72);
                  }
                }
              } else {
                kaa.field_l[2].e(param0, 72);
                if (var11 != 0) {
                  kaa.field_l[1].e(param0, 72);
                }
              }
            }
          } else {
            kaa.field_l[1].e(param0, 72);
          }
          this.field_d = this.field_d + 1;
          cga.field_r.a(param0 + (640 - this.field_b), 0);
          vl.field_c.a(-this.field_b + (656 + param0), 56);
          var3 = 0;
          do {
            if (var3 >= 8) {
              an.field_r.a(param0 - this.field_b + 656, 398);
              break;
            }
            jla.field_d.a(param0 - this.field_b + 656, jla.field_d.field_e * var3 + 118);
            var3++;
          } while (var11 == 0);
          stackIn_53_0 = qt.field_m;
          stackIn_53_1 = -this.field_b + (875 + param0);
          stackIn_53_2 = 10;
          if (!this.field_k.field_T) {
            stackIn_54_3 = 16764160;
          } else {
            stackIn_54_3 = 16777215;
          }
          ((kv) (Object) stackIn_53_0).e(stackIn_53_1, stackIn_53_2, stackIn_54_3);
          var3 = 0;
          var4 = 0;
          var5 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var5 < this.field_c.field_r.length)))) {
            stackIn_66_0 = 0;
            stackIn_66_1 = dm.field_f;
            if (var11 == 0) {
              if (stackIn_66_0 >= stackIn_66_1 &&
                var5 >= 5) {
                var6 = var5 % 5;
                var7 = var5 / 5;
                kja.field_e.e(param0 + 696 - this.field_b + (45 * var6 - 34), 150 - (-(var7 * 35) + 65));
                if (null != this.field_c.field_r[var5]) {
                  var8_ref_jfa = this.field_c.field_r[var5];
                  var9 = (var4 + 5) % 5;
                  var10 = (5 + var4) / 5;
                  dg.a(45 * var9 + 696 + (-this.field_b - (34 - param0)), 87 + var10 * 35, 45 * var9 + (-this.field_b + 696) - (34 + (-param0 - 42)), 30 + (-65 + (var10 * 35 + 150)));
                  var8_ref_jfa.field_v.a(2048, 34 * var10 + 39, 128, 8, 2048, param0 - 34 + var9 * 45 + (-this.field_b + 642));
                  dg.c();
                  var4++;
                }
              } else {
                if (this.field_c.field_r[var5] != null) {
                  var6_ref_jfa = this.field_c.field_r[var5];
                  var7 = var3 % 5;
                  var8 = var3 / 5;
                  kja.field_e.e(-this.field_b + (696 + 45 * var7) - 34 + param0, 150 + var8 * 35 - 65);
                  dg.a(param0 + 662 + (-this.field_b + 45 * var7), -63 + (35 * var8 + 150), -this.field_b + (696 + var7 * 45 - (34 - param0) + 42), -65 + 35 * var8 + 150 + 30);
                  var6_ref_jfa.field_v.a(2048, 104 + (34 * var8 - 65), 192, 8, 2048, -this.field_b + 642 + var7 * 45 + (-34 + param0));
                  var3++;
                  dg.c();
                }
              }
              var5++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_66_0 = ~dm.field_f;
            stackIn_66_1 = -1;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_66_0 >= stackIn_66_1) {
            var5Lifetime1 = 5;
            while (!(var5Lifetime1 >= this.field_c.field_r.length)) {
              var6Lifetime1 = var5Lifetime1 % 5;
              var7Lifetime1 = var5Lifetime1 / 5;
              gg.field_a.e(-24 + (696 + (-this.field_b + var6Lifetime1 * 45) + param0), -65 + var7Lifetime1 * 35 + 154);
              var5Lifetime1++;
              if (var11 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            decompiledFrameRemainder0 = (this.field_h != null);
          }
          if (decompiledFrameRemainder0) {
            this.field_h.b(param1 - 26300);
          }
          if (var11 != 0) {
            this.field_d = 0;
          }
        } else {
          this.field_d = 0;
        }
    }

    private final int a(byte param0) {
        int stackIn_53_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        Object var2;
        Object var3;
        int var3_int;
        int var4_int;
        ona var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3_intLifetime1;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        Object var3Lifetime1;
        Object var3Lifetime2;
        int var3_intLifetime1Lifetime1;
        L0: {
          boolean decompiledFrameRemainder0 = true;
          var3 = null;
          var8 = BachelorFridge.field_y;
          var2 = null;
          if ((this.field_a != 0 ||
            256 > this.field_i) &&
            (decompiledFrameRemainder0 = (this.field_a == 1))) {
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            {
              if (this.a(-22263) &&
                fia.field_t == 1 &&
                !this.field_c.field_h &&
                !this.field_c.a((byte) -121)) {
                var3_int = (mk.field_p - 385) / 47;
                var4_int = (gd.field_m - 85) / 35;
                var5 = var3_int + var4_int * 5;
                var6 = 0;
                var7 = 0;
                while (!(var7 >= this.field_c.field_r.length)) {
                  stackIn_53_0 = ~dm.field_f;
                  if (var8 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if ((stackIn_53_0 < -1 ||
                    var7 < 5) &&
                    this.field_c.field_r[var7] != null) {
                    if (var5 == var6) {
                      this.field_c.field_h = true;
                      this.field_h = new ula(mk.field_p, gd.field_m, this.field_c.field_r[var7], var7, 0);
                      this.field_c.field_r[var7] = null;
                      break;
                    }
                    var6++;
                  }
                  var7++;
                }
              } else {
                if (!(fia.field_t > 0) &&
                  this.field_c.field_h &&
                  null != this.field_h) {
                  var3_intLifetime1 = this.g(50);
                  if (this.field_c.a(this.field_h.field_c, (int)this.field_h.field_a, -19906, (int)this.field_h.field_i)) {
                    this.field_c.field_m.a(this.field_h.field_c, true);
                    tw.a(this.field_h.field_g, this.field_h.field_c, -63);
                    this.field_h = null;
                    if (var8 != 0) {
                      if (this.a(-22263) &&
                        var3_intLifetime1 != -1) {
                        this.field_c.field_r[this.field_h.field_g] = this.field_h.field_c;
                        this.field_h = null;
                        this.field_h.field_d = true;
                      } else {
                        this.field_h.field_d = true;
                      }
                    }
                  } else {
                    if (this.a(-22263) &&
                      var3_intLifetime1 != -1) {
                      this.field_c.field_r[this.field_h.field_g] = this.field_h.field_c;
                      this.field_h = null;
                      if (var8 != 0) {
                        this.field_h.field_d = true;
                      }
                    } else {
                      this.field_h.field_d = true;
                    }
                  }
                  this.field_c.field_h = false;
                  if (var8 != 0) {
                    var3_intLifetime1Lifetime1 = (mk.field_p - 385) / 47;
                    var4_intLifetime1 = (gd.field_m - 85) / 35;
                    var5Lifetime1 = var3_intLifetime1Lifetime1 + var4_intLifetime1 * 5;
                    var6Lifetime1 = 0;
                    var7Lifetime1 = 0;
                    while (!(var7Lifetime1 >= this.field_c.field_r.length)) {
                      stackIn_53_0 = ~dm.field_f;
                      if (var8 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if ((stackIn_53_0 < -1 ||
                        var7Lifetime1 < 5) &&
                        this.field_c.field_r[var7Lifetime1] != null) {
                        if (var5Lifetime1 == var6Lifetime1) {
                          this.field_c.field_h = true;
                          this.field_h = new ula(mk.field_p, gd.field_m, this.field_c.field_r[var7Lifetime1], var7Lifetime1, 0);
                          this.field_c.field_r[var7Lifetime1] = null;
                          break;
                        }
                        var6Lifetime1++;
                      }
                      var7Lifetime1++;
                    }
                  }
                }
              }
            }
            if (((decompiledFrameCompleted1) && (decompiledFrameCompleted0)) &&
              (decompiledFrameRemainder0 = (this.field_h != null))) {
              this.field_h.a((byte) 125);
              stackIn_53_0 = this.field_c.field_h ? 1 : 0;
            }
            if (decompiledFrameRemainder0) {
              if ((stackIn_53_0 == 0) &&
                (decompiledFrameRemainder0 = !(this.field_h.field_d)) &&
                (decompiledFrameRemainder0 = !(this.field_c.a((byte) -104)))) {
                this.field_c.field_r[this.field_h.field_g] = this.field_h.field_c;
                this.field_h = null;
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if (decompiledFrameRemainder0) {
                this.field_h.field_i = (float)mk.field_p;
                this.field_h.field_a = (float)gd.field_m;
                decompiledFrameRemainder0 = (var8 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            boolean decompiledFrameRemainder1 = true;
            if ((fia.field_t != 1 ||
              this.field_c.field_h ||
              this.field_c.a((byte) -96) ||
              null == cc.field_b.field_z) &&
              (decompiledFrameRemainder1 = !(fia.field_t > 0)) &&
              (decompiledFrameRemainder1 = !(!this.field_c.field_h)) &&
              (decompiledFrameRemainder1 = (this.field_p != null))) {
              if (!this.field_c.a((byte) -89, (int)this.field_p.field_d, (int)this.field_p.field_f, this.field_p.field_g)) {
                this.c(-67, this.field_p.field_g);
                this.field_p.field_e = true;
                if (var8 != 0) {
                  uca.a(12, (byte) -112);
                  this.field_p = null;
                }
              } else {
                uca.a(12, (byte) -112);
                this.field_p = null;
              }
              this.field_c.field_h = false;
              decompiledFrameRemainder1 = (var8 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (this.a(-22263)) {
                var3Lifetime1 = (ona) (cc.field_b.field_z.b((byte) 90));
                while (var3Lifetime1 != null) {
                  if (((ona) (var3Lifetime1)).field_R != 1) {
                    var3Lifetime1 = (ona) (cc.field_b.field_z.c(0));
                    continue;
                  }
                  if (!fw.field_h[((ona) (var3Lifetime1)).field_wb].field_e &&
                    dm.field_f <= 0) {
                    break;
                  }
                  var2 = var3Lifetime1;
                  break;
                }
              }
              if (var2 != null) {
                this.field_c.field_h = true;
                this.field_p = new lha(nfa.field_a, jc.field_r, ((ona) (var2)).field_wb);
                this.field_o[((ona) (var2)).field_wb] = this.field_o[((ona) (var2)).field_wb] - 1;
                ((ona) (var2)).field_zb.c((byte) -126);
                if (((ona) (var2)).field_zb.field_f == 0) {
                  ((ona) (var2)).a(false);
                }
                this.h(-1);
              }
            }
            if (this.field_p != null) {
              this.field_p.c((byte) 50);
              if (!this.field_c.field_h) {
                if (!this.field_p.field_e) {
                  this.field_o[this.field_p.field_g] = this.field_o[this.field_p.field_g] + 1;
                  var3Lifetime2 = null;
                  if (cc.field_b.field_z != null) {
                    var4 = (ona) (cc.field_b.field_z.b((byte) 90));
                    while (var4 != null) {
                      stackIn_109_0 = var4.field_wb;
                      stackIn_109_1 = this.field_p.field_g;
                      if (var8 != 0) {
                        break L0;
                      }
                      if (stackIn_109_0 == stackIn_109_1) {
                        var3Lifetime2 = var4;
                      }
                      var4 = (ona) (cc.field_b.field_z.c(0));
                    }
                  }
                  if (var3Lifetime2 == null) {
                    cc.field_b.a(-1, new ona(this.field_p.field_g, kka.field_i[this.field_p.field_g], new kna(this.field_p.field_g, this.field_o[this.field_p.field_g])));
                    if (var8 != 0) {
                      ((ona) (var3Lifetime2)).field_zb.b(true);
                    }
                  } else {
                    ((ona) (var3Lifetime2)).field_zb.b(true);
                  }
                  this.field_p = null;
                  this.h(-1);
                  if (var8 != 0) {
                    this.field_p.field_d = (float)gd.field_m;
                    this.field_p.field_f = (float)mk.field_p;
                  }
                }
              } else {
                this.field_p.field_d = (float)gd.field_m;
                this.field_p.field_f = (float)mk.field_p;
              }
            }
          }
          stackIn_109_0 = param0;
          stackIn_109_1 = -17;
        }
        if (stackIn_109_0 >= stackIn_109_1) {
          this.field_b = -94;
        }
        if (var2 != null) {
          return ((ona) (var2)).field_wb;
        }
        return -1;
    }

    private final void c(boolean param0) {
        kv stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_15_3 = 0;
        ona var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (!param0) {
          this.c(false);
        }
        boolean decompiledFrameCompleted0 = true;
        dg.g(374, 0, 266, 480);
        pea.field_k.e(-this.field_i + 640, 50);
        if (this.field_i >= 256) {
          this.field_q.a(true, 7802);
          if (this.field_q.field_vb.field_T) {
            ada.field_l.a(594, 160);
            if (var3 != 0) {
              lma.field_y.a(594, 160);
            }
          } else {
            lma.field_y.a(594, 160);
          }
          if (!this.field_q.field_vb.field_T) {
            gha.field_b.a(594, 403);
            if (var3 != 0) {
              oaa.field_a.a(594, 403);
            }
          } else {
            oaa.field_a.a(594, 403);
          }
          stackIn_14_0 = qt.field_m;
          stackIn_14_1 = 590;
          stackIn_14_2 = 132;
          if (this.field_k.field_T) {
            stackIn_15_3 = 16777215;
          } else {
            stackIn_15_3 = 16764160;
          }
          ((kv) (Object) stackIn_14_0).e(stackIn_14_1, stackIn_14_2, stackIn_15_3);
          if (cc.field_b.field_z != null) {
            dg.a(this.field_q.field_kb, this.field_q.field_rb, this.field_q.field_kb + this.field_q.field_sb, this.field_q.field_rb + this.field_q.field_p);
            var2 = (ona) (cc.field_b.field_z.b((byte) 90));
            while (var2 != null) {
              jha.field_g.c(Integer.toString(var2.field_zb.field_f), this.field_q.field_kb + var2.field_kb + 28, cc.field_b.field_rb + (32 + var2.field_rb + this.field_q.field_rb), 16777215, -1);
              hfa.field_z.c(Integer.toString(var2.field_zb.field_f), this.field_q.field_kb + (var2.field_kb + 28), cc.field_b.field_rb + (32 + var2.field_rb + this.field_q.field_rb), 65793, -1);
              var2 = (ona) (cc.field_b.field_z.c(0));
              if (var3 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              dg.c();
            }
          }
        }

    }

    private final void b(int param0, int param1) {
        sna var3_ref_sna;
        int var3;
        int var4;
        sna var3_ref_snaLifetime1;
        var4 = BachelorFridge.field_y;
        if (param1 == 0) {
          this.field_k.field_rb = 128;
          this.field_k.field_kb = 587;
          var3_ref_sna = this.field_k;
          this.field_k.field_p = 20;
          var3_ref_sna.field_sb = 20;
        }
        if (param1 != 0 ||
          var4 != 0) {
          if (param1 != 1) {
            this.field_k.field_rb = -100;
            this.field_k.field_kb = -100;
            var3_ref_snaLifetime1 = this.field_k;
            this.field_k.field_p = 20;
            var3_ref_snaLifetime1.field_sb = 20;
            if (var4 != 0) {
              this.field_k.field_kb = 601;
              this.field_k.field_rb = 8;
              var3_ref_snaLifetime1 = this.field_k;
              this.field_k.field_p = 20;
              var3_ref_snaLifetime1.field_sb = 20;
            }
          } else {
            this.field_k.field_kb = 601;
            this.field_k.field_rb = 8;
            var3_ref_snaLifetime1 = this.field_k;
            this.field_k.field_p = 20;
            var3_ref_snaLifetime1.field_sb = 20;
          }
        }
        var3 = -71 / ((1 - param0) / 43);
    }

    final int d(boolean param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        var7 = BachelorFridge.field_y;
        var2 = -1;
        if (param0) {
          return 7;
        }
        var3 = (mk.field_p - 385) / 48;
        var4 = (gd.field_m - 85) / 36;
        if (var3 >= 0 &&
          var3 < 5 &&
          0 <= var4 &&
          10 > var4) {
          var2Lifetime1 = 5 * var4 + var3;
          var5 = 0;
          var6 = 0;
          while (this.field_c.field_r.length > var6) {
            if (null != this.field_c.field_r[var6]) {
              if (var5 == var2Lifetime1) {
                return var6;
              }
              var5++;
            }
            var6++;
            if (var7 == 0) {
              continue;
            }
            break;
          }
          return -1;
        }
        return -1;
    }

    private final void c(int param0) {
        sna var3 = mka.a(13558251, 13558251, 13558251, (byte) -119, jha.field_g, 13558251, 1118481, 13558251);
        var3.field_eb = wd.field_w;
        var3.field_A = bla.field_p;
        var3.field_db = op.field_I;
        this.field_s = new sna("food", var3, 410, 138, 130, 140, "");
        this.field_l = new sna("freezerbox", var3, 8, 6, 350, 74, "");
        if (param0 != 12716) {
          this.a(-121);
        }
        this.field_r = new sna("up", var3, 441, 159, 179, 16, "");
        this.field_t = new sna("down", var3, 441, 371, 179, 16, "");
        this.field_k = new sna();
        this.field_k.a(var3, param0 ^ 12760);
        this.field_n = mka.a(12688481, 12688481, 12688481, (byte) -119, jha.field_g, 12688481, 16777215, 12688481);
        this.field_e = mka.a(12688481, 12688481, 12688481, (byte) -123, jha.field_g, 12688481, 12688481, 12688481);
        this.field_e.field_db = og.field_b;
        this.field_e.field_A = og.field_b;
        this.field_e.field_N = 1;
        this.field_e.field_eb = og.field_b;
        this.field_m = new gba("scrollbar", this.field_e, new kv(8, 8), new kv(8, 8), this.field_n, this.field_e, true);
        cc.field_b = new sna();
        cc.field_b.a(506, 31407, 170, 442, 161);
        this.field_q = new wl("basket", cc.field_b, this.field_n, this.field_m);
        this.field_q.a(0, 154, false, 19, 261, 410, 198);
    }

    final int f(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int stackIn_3_0 = 0;
        var5 = BachelorFridge.field_y;
        stackIn_3_0 = (0 < dm.field_f) ? 50 : 5;
        var2 = stackIn_3_0;
        var3 = 0;
        var4 = 0;
        while (true) {
          if (var4 >= var2) {
            var4 = -57 / ((param0 + 55) / 51);
            break;
          }
          if (var5 == 0) {
            if (null != this.field_c.field_r[var4]) {
              var3++;
            }
            var4++;
            continue;
          }
          break;
        }
        return var3;
    }

    final void a(boolean param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int var3;
        var3 = BachelorFridge.field_y;
        this.field_s.a(19842, true);
        if (this.field_s.field_T) {
          if (af.field_a) {
            uca.a(2, (byte) -57);
          }
          au.field_c = 3;
        }
        this.field_l.a(19842, true);
        if (af.field_a &&
          this.field_l.field_T) {
          uca.a(5, (byte) 1);
        }
        this.field_k.a(19842, true);
        this.field_q.a(19842, true);
        this.field_q.a(vc.field_a * 32, param0, 32, 120);
        if (this.field_a == 1 &&
          this.field_b < 260) {
          this.field_b = this.field_b + 16;
          if (this.field_b >= 260) {
            uca.a(13, (byte) 2);
          }
        }
        if (this.field_a == 2 &&
          this.field_b > 0) {
          this.field_b = this.field_b - 16;
          if (0 >= this.field_b) {
            uca.a(14, (byte) 110);
          }
        }
        if (this.field_a == 0 &&
          this.field_i < 256) {
          this.field_i = this.field_i + 16;
          if (this.field_i >= 256) {
            uca.a(10, (byte) 102);
          }
        }
        if (2 == this.field_a &&
          this.field_i > 0) {
          this.field_i = this.field_i - 16;
        }
        boolean decompiledFrameRemainder1 = true;
        if (lf.field_c == 1 && (null == this.field_h ||
          !this.field_h.field_d) && (null == this.field_p ||
          !this.field_p.field_e)) {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_a != 2 ||
            this.field_s.field_R != 1 ||
            !ku.field_q) {
            if (this.field_a == 1 &&
              this.field_l.field_R == 1) {
              this.field_a = 2;
              qm.a(25, 7758);
              this.b(62, this.field_a);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_l.field_R != 1 ||
                !iaa.field_a) {
                if ((this.field_k.field_R == 1) &&
                  (sh.field_I)) {
                  if (this.field_a != 0) {
                    qm.a(25, 7758);
                    if (var3 != 0) {
                      uca.a(11, (byte) -103);
                      qm.a(21, 7758);
                    }
                  } else {
                    uca.a(11, (byte) -103);
                    qm.a(21, 7758);
                  }
                  this.field_a = 2;
                  this.b(-43, this.field_a);
                  if (var3 != 0) {
                    this.field_a = 1;
                    qm.a(26, 7758);
                    this.b(88, this.field_a);
                    this.field_a = 0;
                    qm.a(23, 7758);
                    this.b(90, this.field_a);
                  }
                }
              } else {
                this.field_a = 1;
                qm.a(26, 7758);
                this.b(88, this.field_a);
                if (var3 != 0) {
                  this.field_a = 0;
                  qm.a(23, 7758);
                  this.b(90, this.field_a);
                }
              }
            }
          } else {
            this.field_a = 0;
            qm.a(23, 7758);
            this.b(90, this.field_a);
          }
          if (this.field_a == 0) {
            if (this.field_r.field_R == 1) {
              this.field_j = this.field_j - 4;
              if (0 <= this.field_j) {
                discarded$0 = this.a((byte) -23);
                decompiledFrameRemainder1 = false;
              }
              else {
                this.field_j = 0;
                if (var3 != 0 &&
                  this.field_t.field_R == 1) {
                  this.field_j = this.field_j + 4;
                  if (this.field_j > 50) {
                    this.field_j = 48;
                  }
                }
              }
            } else {
              if (this.field_t.field_R == 1) {
                this.field_j = this.field_j + 4;
                if (this.field_j > 50) {
                  this.field_j = 48;
                }
              }
            }
          }
        }
        if (decompiledFrameRemainder1) {
          discarded$1 = this.a((byte) -23);
        }

    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
          field_f = (jg) null;
        }
    }

    final void e(int param0) {
        if (param0 != -21060) {
          this.field_j = 6;
        }
        if (this.field_a == 2 &&
          this.field_b > 0) {
          this.field_b = this.field_b - 16;
          if (this.field_b <= 0) {
            uca.a(14, (byte) -17);
          }
        }
        if (2 == this.field_a &&
          this.field_i > 0) {
          this.field_i = this.field_i - 16;
        }
    }

    final void a(boolean param0, int[] param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          if (param0) {
            return;
          }
          cc.field_b.field_z = null;
          var3_int = 0;
          while (var3_int < this.field_o.length) {
            this.field_o[var3_int] = this.field_o[var3_int] + param1[var3_int];
            if (var4 != 0) {
              return;
            }
            if (this.field_o[var3_int] != 0 &&
              this.field_o[var3_int] != 0) {
              cc.field_b.a(-1, new ona(var3_int, kka.field_i[var3_int], new kna(var3_int, this.field_o[var3_int])));
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("jt.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int g(int param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_3_0 = 0;
        var4 = BachelorFridge.field_y;
        stackIn_3_0 = (dm.field_f > 0) ? 50 : 5;
        var2 = stackIn_3_0;
        if (param0 != 50) {
          this.field_r = (sna) null;
        }
        var3 = 0;
        while (var2 > var3) {
          if (this.field_c.field_r[var3] == null) {
            return var3;
          }
          var3++;
          if (var4 == 0) {
            continue;
          }
          break;
        }
        return -1;
    }

    final boolean a(int param0) {
        if (mk.field_p > 372 &&
          mk.field_p < 640) {
          return true;
        }
        if (param0 != -22263) {
          return true;
        }
        return false;
    }

    private final void c(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BachelorFridge.field_y;
        if (param0 >= -47) {
          this.field_j = 92;
        }
        var3 = this.field_j;
        while (var3 < this.field_o.length) {
          if (var6 == 0) {
            if (~param1 == ~var3) {
              var4 = var3 % 4;
              this.field_p.field_c = 46 * var4 + (this.field_q.field_kb + cc.field_b.field_kb);
              var5 = var3 / 4;
              this.field_p.field_a = 40 * var5 + (cc.field_b.field_rb + this.field_q.field_rb);
            }
            var3++;
            continue;
          }
          break;
        }
    }

    final void d(int param0) {
        this.field_a = 2;
        this.b(-45, 2);
        if (param0 > -107) {
          this.field_i = 64;
        }
    }

    final jfa b(int param0) {
        int var8 = BachelorFridge.field_y;
        int var2 = -1;
        int var3 = (-385 + mk.field_p) / 46;
        int var4 = (gd.field_m - 85) / 36;
        if (var3 < 0) {
          return null;
        }
        if (5 < var3) {
          return null;
        }
        var2 = var3 + 5 * var4;
        int var6 = -77 % ((param0 - 42) / 63);
        int var5 = 0;
        int var7 = 0;
        do {
          if (var7 >= this.field_c.field_r.length) {
            return null;
          }
          if (this.field_c.field_r[var7] != null) {
            if (~var5 == ~var2) {
              return this.field_c.field_r[var7];
            }
            var5++;
          }
          var7++;
        } while (var8 == 0);
        return null;
    }

    jt(ola param0) {
        this.field_a = 2;
        try {
          this.field_c = param0;
          this.field_o = new int[50];
          this.c(12716);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "jt.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new jg();
    }
}
