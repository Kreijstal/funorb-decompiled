/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private jj[] field_g;
    private gj field_m;
    static js field_f;
    private sna field_j;
    static sna field_e;
    private kv field_k;
    private jj field_i;
    sna field_l;
    static String field_n;
    private int field_c;
    static kv field_a;
    private jj field_h;
    private int[] field_b;
    private sna field_d;
    private int[] field_o;

    public static void c(int param0) {
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 != -621) {
          field_f = (js) null;
        }
        field_n = null;
    }

    final void b(byte param0) {
        int stackIn_13_0 = 0;
        jj var3;
        int var4;
        int var5;
        int var6;
        int var7;
        sfa var8;
        int var9;
        ad var10;
        int var6Lifetime1;
        var9 = BachelorFridge.field_y;
        var10 = this.field_m.field_P;
        if (!this.field_m.a(var10.field_s, 2)) {
          return;
        }
        var3 = (jj) (this.field_d.field_z.b((byte) 90));
        var4 = 0;
        if (param0 <= 31) {
          field_n = (String) null;
        }
        if (var10.field_s.field_y != 40) {
          if (var10.field_s.field_y != 42) {
            stackIn_13_0 = (var10.field_s.field_y != 39) ? 1 : 0;
          } else {
            stackIn_13_0 = 0;
          }
        } else {
          stackIn_13_0 = 0;
        }
        var5 = stackIn_13_0;
        while (var3 != null) {
          var6 = -1;
          if (var3.field_zb != -1) {
            var6Lifetime1 = var3.field_zb;
            if (var3.field_zb != -1 &&
              al.a(-119, var3.field_zb).field_a != 3 &&
              var3.field_T &&
              var3.field_R == 1 &&
              var4 < var10.field_s.field_m.length &&
              var3.field_yb) {
              var7 = ur.field_e[var3.field_zb].field_a;
              if (var5 != 0) {
                if (var10.field_l) {
                  var8 = this.field_m.b(var10, true);
                  this.field_m.a(var10.field_s.field_u, (byte) 126);
                  if (var3.field_zb == var8.field_g) {
                    return;
                  }
                }
                if (this.field_m.field_M == 1 &&
                  var7 == 2) {
                  this.field_m.a((byte) -30, var10.field_s.b(var3.field_zb, (byte) -116));
                  uca.a(38, (byte) 108);
                  return;
                }
                if (this.field_m.field_M == 2 &&
                  var7 == 1 &&
                  var10.field_s.c((byte) -10, var6Lifetime1)) {
                  this.field_m.b(var10.field_s.b(var3.field_zb, (byte) -122), -1);
                  return;
                }
                if (this.field_m.field_M == 2 &&
                  var7 == 4) {
                  this.field_m.a(16776960, var10.field_s.b(var3.field_zb, (byte) -126));
                  return;
                }
              }
              lf.field_c = 0;
            }
          }
          var4++;
          if (var3.field_T) {
            var3.field_vb = var3.field_vb + 1;
          } else {
            var3.field_vb = 0;
          }
          var3 = (jj) (this.field_d.field_z.c(0));
        }
        if (this.field_m.field_n != var10.field_s.field_D) {
          this.field_l.field_kb = this.field_d.field_kb + 30;
          this.field_l.field_rb = this.field_d.field_rb + 40;
          this.field_l.a(19842, true);
        }
        return;
    }

    private final int a(byte param0, int[] param1) {
        int var5 = 0;
        int var3_int = 0;
        int[] var4 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var7 = BachelorFridge.field_y;
        try {
          var3_int = 0;
          if (param0 >= -121) {
            this.field_i = (jj) null;
          }
          var4 = param1;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            if (var6 != -1 &&
              al.a(127, this.field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a != 3 &&
              al.a(124, this.field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a != 2) {
              var3_int++;
            }
          }
          stackIn_16_0 = var3_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ng.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        lu var2;
        boolean stackIn_7_0 = false;
        if (param0 != -24) {
          var2 = (lu) null;
          ng.a((op) null, 101, (lu) null);
        }
        stackIn_7_0 = (bp.e(-29919)) || !(dm.field_f > 0);
        return stackIn_7_0;
    }

    final void b(int param0, int param1, int param2) {
        this.field_d.field_rb = param2 - 6;
        if (param0 != -3) {
          field_e = (sna) null;
        }
        this.field_d.field_kb = param1 - 6;
        this.field_i.field_kb = this.field_d.field_kb + 56;
        this.field_i.field_rb = this.field_d.field_rb + 96;
        this.field_h.field_rb = this.field_d.field_rb + 80;
        this.field_h.field_kb = this.field_d.field_kb + 63;
    }

    final void c(int param0, int param1, int param2) {
        this.field_d.field_rb = param0 - 22;
        this.field_d.field_kb = param1 - 6;
        this.a(-106);
        if (param2 != -40) {
          this.b((byte) 63);
        }
    }

    final void a(int param0, int param1, int param2) {
        kv stackIn_44_0;
        int stackIn_44_1;
        int stackIn_44_2;
        int[] stackIn_44_3;
        int stackIn_45_4;
        kv stackIn_48_0;
        int stackIn_48_1;
        int stackIn_48_2;
        int[] stackIn_48_3;
        int stackIn_49_4;
        int stackIn_135_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_175_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_203_1 = 0;
        int stackIn_204_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8_int;
        jj var8;
        int var9;
        sfa var10;
        int var11;
        int var12;
        int var13;
        oha var13_ref_oha;
        int var14_int;
        String var14;
        int var15_int;
        String var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        oha var24;
        ad var25;
        oha var26;
        oha var27;
        oha var28;
        String var29;
        String var30;
        oha var31;
        var23 = BachelorFridge.field_y;
        Math.sin(0.5 * ((double)this.field_m.field_L / 10.0));
        var25 = this.field_m.field_P;
        var5 = this.field_m.field_n;
        var6 = -8 % ((-4 - param1) / 59);
        if (var25.field_s.field_D != var5) {
          this.field_l.field_kb = this.field_d.field_kb + 30;
          this.field_l.field_rb = this.field_d.field_rb + 40;
          this.field_l.a(true, 7802);
        } else {
          if (this.field_c == 0) {
            this.field_d.a(true, 7802);
            var7 = this.field_d.field_z.g(0);
            if (var7 != 1) {
              switch (var7) {
                case 2:
                  this.field_k.e(this.field_d.field_kb + 58, this.field_d.field_rb + 12, 96, 64, 255);
                  break;
                case 4:
                  this.field_k.e(this.field_d.field_kb + 34, this.field_d.field_rb + 6, 144, 84, 255);
                  break;
                case 3:
                  this.field_k.e(48 + this.field_d.field_kb, this.field_d.field_rb + 6, 116, 72, 255);
                  break;
                default:
                  break;
              }
            } else {
              this.field_k.e(74 + this.field_d.field_kb, this.field_d.field_rb + 2, 64, 64, 255);
            }
            if (var25.field_s.field_y != 0) {
              var8_int = 105;
              var9 = 12;
              if (var25.field_s.field_y != 31 &&
                !var25.field_s.g((byte) 85)) {
                ad.field_h.a(lga.a(true, new String[]{"" + var25.field_s.field_C}, vla.field_p), var8_int + this.field_d.field_kb, var9 + this.field_d.field_rb, 2, -1);
                var9 -= 15;
              }
              ad.field_h.a(c.field_k[var25.field_s.field_y], this.field_d.field_kb + var8_int, var9 + this.field_d.field_rb, 2, -1);
            }
            var8 = (jj) (this.field_d.field_z.b((byte) 90));
            var9 = 0;
            var10 = this.field_m.b(var25, true);
            while (var8 != null) {
              if (var9 < var25.field_s.field_m.length) {
                var11 = var25.field_s.field_m[var9];
                var9++;
                if (-1 == var11) {
                  if (var8.field_zb == -1) {
                    continue;
                  }
                  if (al.a(-125, var8.field_zb).field_a == 3) {
                    continue;
                  }
                  var8 = (jj) (this.field_d.field_z.c(0));
                  continue;
                }
                var26 = al.a(116, var8.field_zb);
                if (this.field_m.field_P.field_s.field_y != 40 &&
                  this.field_m.field_P.field_s.field_y != 42 &&
                  this.field_m.field_P.field_s.field_y != 39 &&
                  var26.field_a != 2) {
                  if (var26.field_a == 1) {
                    if (2 == this.field_m.field_M) {
                      var25.field_s.c((byte) -10, var26.field_j);
                    }
                  } else {
                    if (!(this.field_m.field_h.a(this.field_m.field_Y, false) > 0) ||
                      var26.field_a != 4) {
                      var25.field_s.c((byte) -10, var26.field_j);
                    }
                  }
                }
                if ((var10 == null ||
                  var10.field_g == var8.field_zb) &&
                  (this.field_m.field_Z == null ||
                  this.field_m.field_Z.field_g == var8.field_zb)) {
                  if (var8.field_xb > 2) {
                    stackIn_48_0 = vma.field_j[var8.field_xb - 3];
                    stackIn_48_1 = var8.field_kb + (this.field_d.field_kb - 19);
                    stackIn_48_2 = -9 + this.field_d.field_rb + var8.field_rb;
                    stackIn_48_3 = this.field_b;
                    if (this.field_m.field_L % 128 >= 64) {
                      stackIn_49_4 = 127 - this.field_m.field_L % 128;
                    } else {
                      stackIn_49_4 = this.field_m.field_L % 128;
                    }
                    ((kv) (Object) stackIn_48_0).e(stackIn_48_1, stackIn_48_2, stackIn_48_3[stackIn_49_4]);
                  } else {
                    stackIn_44_0 = bfa.field_b[var8.field_xb];
                    stackIn_44_1 = var8.field_kb + this.field_d.field_kb - 10;
                    stackIn_44_2 = var8.field_rb + (this.field_d.field_rb - 9);
                    stackIn_44_3 = this.field_b;
                    if (this.field_m.field_L % 128 >= 64) {
                      stackIn_45_4 = -(this.field_m.field_L % 128) + 127;
                    } else {
                      stackIn_45_4 = this.field_m.field_L % 128;
                    }
                    ((kv) (Object) stackIn_44_0).e(stackIn_44_1, stackIn_44_2, stackIn_44_3[stackIn_45_4]);
                  }
                } else {
                  if (var8.field_xb <= 2) {
                    bfa.field_b[var8.field_xb].e(-10 + this.field_d.field_kb + var8.field_kb, this.field_d.field_rb + var8.field_rb - 9, 12889);
                  } else {
                    vma.field_j[-3 + var8.field_xb].e(this.field_d.field_kb + (var8.field_kb - 19), -9 + (var8.field_rb + this.field_d.field_rb), 12889);
                  }
                }
                if (var8.field_zb == -1) {
                  continue;
                }
                if (al.a(-125, var8.field_zb).field_a == 3) {
                  continue;
                }
                var8 = (jj) (this.field_d.field_z.c(0));
                continue;
              }
              break;
            }
            var8 = (jj) (this.field_d.field_z.b((byte) 90));
            while (var8 != null) {
              boolean decompiledFrameRemainder0 = true;
              var24 = al.a(-95, var8.field_zb);
              var27 = var24;
              dg.b(11 + var8.field_kb + this.field_d.field_kb, 11 + var8.field_rb + this.field_d.field_rb, 15, 65793);
              if (!(var27 instanceof tv)) {
                if (var27 instanceof hd) {
                  if ((var10 == null ||
                    var8.field_zb != var10.field_g) &&
                    (this.field_m.field_Z == null ||
                    var8.field_zb != this.field_m.field_Z.field_g)) {
                    if (!var8.field_yb &&
                      var25.field_s.c((byte) -10, var8.field_zb)) {
                      nia.field_l[var27.field_b].e(-5 + var8.field_kb + this.field_d.field_kb, -5 + (var8.field_rb + this.field_d.field_rb), 11250603);
                    } else {
                      nia.field_l[ur.field_e[var8.field_zb].field_b].e(-5 + this.field_d.field_kb + var8.field_kb, -5 + this.field_d.field_rb + var8.field_rb, 14964736);
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    nia.field_l[var27.field_b].e(-5 + this.field_d.field_kb + var8.field_kb, this.field_d.field_rb - (-var8.field_rb + 5), 16769792);
                  }
                } else {
                  if (var27 instanceof t) {
                    if (1 != ((t) (var27)).field_p &&
                      2 != ((t) (var27)).field_p) {
                      if (((t) (var27)).field_p != 4) {
                        if ((var10 == null ||
                          var10.field_g != var8.field_zb) &&
                          (null == this.field_m.field_Z ||
                          var8.field_zb != this.field_m.field_Z.field_g)) {
                          if (!var8.field_yb &&
                            var25.field_s.c((byte) -10, var8.field_zb)) {
                            nia.field_l[var27.field_b].e(-5 + this.field_d.field_kb + var8.field_kb, this.field_d.field_rb - (-var8.field_rb + 5), 11250603);
                          } else {
                            nia.field_l[ur.field_e[var8.field_zb].field_b].e(this.field_d.field_kb + var8.field_kb - 5, this.field_d.field_rb + (var8.field_rb - 5), 15204352);
                          }
                        } else {
                          nia.field_l[var27.field_b].e(-5 + (this.field_d.field_kb + var8.field_kb), this.field_d.field_rb + var8.field_rb - 5, 16725815);
                        }
                      } else {
                        if ((var10 == null ||
                          var10.field_g != var8.field_zb) &&
                          (this.field_m.field_Z == null ||
                          var8.field_zb != this.field_m.field_Z.field_g)) {
                          if (!var8.field_yb &&
                            var25.field_s.c((byte) -10, var8.field_zb)) {
                            nia.field_l[var27.field_b].e(this.field_d.field_kb + (var8.field_kb - 5), this.field_d.field_rb + (var8.field_rb - 5), 11250603);
                          } else {
                            nia.field_l[ur.field_e[var8.field_zb].field_b].e(var8.field_kb + (this.field_d.field_kb - 5), this.field_d.field_rb - (-var8.field_rb + 5), 16754688);
                          }
                        } else {
                          nia.field_l[var27.field_b].e(-5 + var8.field_kb + this.field_d.field_kb, -5 + this.field_d.field_rb + var8.field_rb, 16769792);
                        }
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if ((var10 == null ||
                        var10.field_g != var8.field_zb) &&
                        (this.field_m.field_Z == null ||
                        this.field_m.field_Z.field_g != var8.field_zb)) {
                        if (!var8.field_yb &&
                          var25.field_s.c((byte) -10, var8.field_zb)) {
                          nia.field_l[var27.field_b].e(-5 + (var8.field_kb + this.field_d.field_kb), this.field_d.field_rb + (var8.field_rb - 5), 11250603);
                        } else {
                          nia.field_l[ur.field_e[var8.field_zb].field_b].e(this.field_d.field_kb - (-var8.field_kb + 5), -5 + (this.field_d.field_rb + var8.field_rb), 818659);
                        }
                        decompiledFrameRemainder0 = false;
                      }
                      else {
                        nia.field_l[var27.field_b].e(-5 + this.field_d.field_kb + var8.field_kb, -5 + var8.field_rb + this.field_d.field_rb, 4564479);
                      }
                    }
                  }
                }
              } else {
                if ((var10 == null ||
                  var10.field_g != var8.field_zb) &&
                  (this.field_m.field_Z == null ||
                  var8.field_zb != this.field_m.field_Z.field_g)) {
                  if (!var8.field_yb &&
                    var25.field_s.c((byte) -10, var8.field_zb)) {
                    nia.field_l[var24.field_b].e(this.field_d.field_kb + var8.field_kb - 5, -5 + this.field_d.field_rb + var8.field_rb, 11250603);
                  } else {
                    nia.field_l[ur.field_e[var8.field_zb].field_b].e(-5 + (this.field_d.field_kb + var8.field_kb), this.field_d.field_rb + var8.field_rb - 5, 51233);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  nia.field_l[var27.field_b].e(-5 + (var8.field_kb + this.field_d.field_kb), var8.field_rb + this.field_d.field_rb - 5, 4388192);
                }
              }
              if (-1 != var8.field_zb &&
                al.a(102, var8.field_zb).field_a != 3) {
                wca.a(true, -4 + this.field_d.field_rb + var8.field_rb, var8.field_kb + (this.field_d.field_kb - 4), var8.field_zb, 90);
              }
              var12 = 0;
              if (this.field_m.field_P.field_s.field_y != 40 &&
                this.field_m.field_P.field_s.field_y != 42 &&
                this.field_m.field_P.field_s.field_y != 39) {
                if (2 == var27.field_a) {
                  stackIn_135_0 = (this.field_m.field_M != 1) ? 0 : 1;
                  var12 = stackIn_135_0;
                } else if (var27.field_a == 1) {
                  if (this.field_m.field_M == 2) {
                    stackIn_143_0 = (var25.field_s.c((byte) -10, var27.field_j)) ? 1 : 0;
                  } else {
                    stackIn_143_0 = 0;
                  }
                  var12 = stackIn_143_0;
                } else {
                  if (this.field_m.field_h.a(this.field_m.field_Y, false) > 0 &&
                    var27.field_a == 4) {
                    stackIn_152_0 = 0;
                  } else {
                    stackIn_152_0 = (var25.field_s.c((byte) -10, var27.field_j)) ? 1 : 0;
                  }
                  var12 = stackIn_152_0;
                }
              } else {
                var12 = 0;
              }
              if (!var8.field_yb ||
                var12 == 0) {
                if (var25.field_s.f(0, var8.field_zb)) {
                  var13_ref_oha = ur.field_e[var8.field_zb];
                  var14_int = var25.field_s.b(var8.field_zb, (byte) -110);
                  var15_int = -var25.field_s.field_K[var14_int] + var13_ref_oha.field_g;
                  if (var15_int != -2) {
                    ad.field_h.c(Integer.toString(var15_int), 2 + (this.field_d.field_kb + var8.field_kb), var8.field_rb + this.field_d.field_rb + 20, 2, -1);
                  }
                }
                dg.d(this.field_d.field_kb + var8.field_kb, this.field_d.field_rb + var8.field_rb, (var8.field_sb >> 1) + var8.field_kb + this.field_d.field_kb + 6, 6 + (var8.field_rb + this.field_d.field_rb) + (var8.field_p >> 1), 65793, 4);
                dg.d(this.field_d.field_kb + var8.field_kb + 1, 1 + (this.field_d.field_rb + var8.field_rb), 5 + ((var8.field_sb >> 1) + var8.field_kb + this.field_d.field_kb), 5 + (var8.field_p >> 1) + (var8.field_rb + this.field_d.field_rb), 16711680, 2);
              }
              var8 = (jj) (this.field_d.field_z.c(0));
            }
            if (this.field_m.field_r) {
              var8 = (jj) (this.field_d.field_z.b((byte) 90));
              while (var8 != null) {
                if (var8.field_T &&
                  50 < var8.field_vb) {
                  var28 = al.a(117, var8.field_zb);
                  var12 = 620;
                  var13 = i.field_a.field_rb;
                  var14_int = 4 + mk.field_p;
                  var15_int = gd.field_m + 4;
                  if (!var8.field_yb) {
                    stackIn_175_0 = (var25.field_s.f(0, var8.field_zb)) ? 1 : 0;
                  } else {
                    stackIn_175_0 = 0;
                  }
                  var16 = stackIn_175_0;
                  if (!var8.field_yb) {
                    stackIn_181_0 = (!var25.field_s.c((byte) -10, var8.field_zb)) ? 1 : 0;
                  } else {
                    stackIn_181_0 = 0;
                  }
                  var17 = stackIn_181_0;
                  if (var25.field_s.a(false, var8.field_zb)) {
                    var17 = 1;
                    var16 = 0;
                  }
                  bi.a(var13, var17 != 0, 20, var28, var14_int, var12, var15_int, var16 != 0, var25.field_s.a(var28, -5313));
                }
                var8 = (jj) (this.field_d.field_z.c(0));
              }
              if (this.field_i.field_vb > 50 &&
                this.field_i.field_T &&
                0 != var25.field_s.field_y) {
                var30 = pna.field_zb[var25.field_s.field_y].field_d;
                var29 = pna.field_zb[var25.field_s.field_y].field_e;
                var13 = mk.field_p + 4;
                var14_int = gd.field_m + 4;
                var15_int = ad.field_h.c(var29, 200) + 10;
                if (var15_int + var13 > 620) {
                  var13 = var13 + (-20 - var15_int - (var13 - 640));
                }
                var16 = ad.field_h.a(var29, 200, 0) + (ad.field_h.field_F << 1);
                if (var16 + var14_int > i.field_a.field_rb) {
                  var14_int = var14_int + (-var14_int - var16 + i.field_a.field_rb);
                }
                dg.a(13 + var13, var14_int, var15_int + 6, var16, 10, 65793, 128);
                ad.field_h.c(var30, var13 + 20, var14_int + 16, 0, -1);
                ad.field_h.a(var29, var13 + 20, 20 + var14_int, 200, 200, 0, -1, 0, 0, 0);
              }
              if (this.field_h.field_vb > 50 &&
                this.field_h.field_T &&
                var10 != null) {
                var31 = al.a(-128, var10.field_g);
                var12 = mk.field_p + 4;
                var13 = gd.field_m + 4;
                var14 = var31.a((byte) 37);
                var15 = var31.field_k;
                stackIn_199_0 = (var31.field_a != 1) ? 0 : 1;
                var16 = stackIn_199_0;
                var17 = 10 + ad.field_h.c(var15, 200);
                if (var17 + var12 > 620) {
                  var12 = var12 + (-var17 - var12 + 620);
                }
                stackIn_203_0 = ad.field_h.a(var15, 200, 10);
                stackIn_203_1 = ad.field_h.field_F;
                if (var16 == 0) {
                  stackIn_204_2 = 1;
                } else {
                  stackIn_204_2 = 2;
                }
                var18 = stackIn_203_0 + (stackIn_203_1 << stackIn_204_2);
                if (i.field_a.field_rb < var13 + var18) {
                  var13 = var13 + (i.field_a.field_rb - var13 - var18);
                }
                dg.a(var12 + 13, var13, 6 + var17, var18, 10, 65793, 164);
                ad.field_h.c(var14, 20 + var12, var13 + 20, 0, -1);
                ad.field_h.a(var15, 20 + var12, var13 + 24, 200, 200, 0, -1, 0, 0, 10);
                var19 = ad.field_h.a(var15, 200, 8);
                if (var16 != 0) {
                  var20 = ((t) (var31)).field_q;
                  var21 = ((t) (var31)).field_u;
                  var22 = 2;
                  if (((t) (var31)).field_p == 1 ||
                    ((t) (var31)).field_p == 4) {
                    var22 = 3;
                  }
                  if (var20 >= 0) {
                    var20 = (int)((double)var20 * it.field_c[var25.field_s.field_k[var22]] / 100.0);
                  }
                  ad.field_h.c("Damage " + var20, 20 + var12, var19 + 48 + var13, 0, -1);
                  if (var21 != 0) {
                    ad.field_h.b("Status effect " + kna.field_g[var21], var12 + (var17 + 10), 44 + (var13 + var19), 0, -1);
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        nja.field_a = param2;
        fa.field_f = param1;
        jc.field_t = param0;
        if (param3 < 106) {
          field_e = (sna) null;
        }
    }

    final void a(int param0) {
        int var6_int = 0;
        int stackIn_3_0 = 0;
        int var3;
        int var4;
        int var5;
        jj var6;
        jj var7;
        int var7_int;
        jj[] var8;
        int var8_int;
        int var9;
        jj var10;
        int var11;
        ad var12;
        oha var13;
        int var9Lifetime1;
        int var4Lifetime1;
        var11 = BachelorFridge.field_y;
        var12 = this.field_m.field_P;
        stackIn_3_0 = (2 != this.field_m.field_M) ? 0 : 1;
        var3 = stackIn_3_0;
        var4 = 0;
        if (var3 == 0) {
          var4Lifetime1 = this.a(var12.field_s.field_m, -3);
        } else {
          var4Lifetime1 = this.a((byte) -127, var12.field_s.field_m);
        }
        this.field_g = new jj[var4Lifetime1];
        var5 = -1;
        for (var6_int = 0; var6_int < var12.field_s.field_m.length; var6_int++) {
          if (var12.field_s.field_m[var6_int] != -1) {
            var7_int = var12.field_s.field_o.field_g.field_b[var12.field_s.field_m[var6_int]];
            if (3 != al.a(102, var7_int).field_a && ((var3 == 0 ||
              al.a(124, var7_int).field_a != 2) &&
              (var3 != 0 ||
              2 == al.a(-86, var7_int).field_a))) {
              var8_int = ur.field_e[var7_int].field_a;
              if (var7_int != -1) {
                var9 = 1;
                var13 = al.a(96, var7_int);
                if (var13.field_g != 0 &&
                  var12.field_s.field_K[var6_int] != var13.field_g + 1) {
                  var9 = 0;
                }
                var5++;
                this.a((byte) 104, var8_int, var4Lifetime1, var9 != 0, var7_int, var5);
              }
            }
          }
        }
        this.field_i.field_kb = this.field_d.field_kb + 56;
        this.field_i.field_rb = 96 + this.field_d.field_rb;
        var6 = this.field_i;
        this.field_i.field_p = 32;
        var6.field_sb = 32;
        if (param0 > -73) {
          ng.c(-36);
        }
        this.field_h.field_rb = 80 + this.field_d.field_rb;
        this.field_h.field_kb = this.field_d.field_kb + 63;
        var7 = this.field_h;
        this.field_h.field_p = 16;
        var7.field_sb = 16;
        this.field_d.field_z = null;
        var8 = this.field_g;
        for (var9Lifetime1 = 0; var9Lifetime1 < var8.length; var9Lifetime1++) {
          var10 = var8[var9Lifetime1];
          this.field_d.a(-1, var10);
        }
    }

    private final int a(int[] param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          if (param1 != -3) {
            stackIn_3_0 = -65;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = param0;
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = var4[var5];
            if (var6 != -1 &&
              al.a(107, this.field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a != 3 &&
              al.a(param1 + 123, this.field_m.field_P.field_s.field_o.field_g.field_b[var6]).field_a == 2) {
              var3_int++;
            }
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ng.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (this.field_m.field_P != null) {
          for (var2 = 0; var2 < 128; var2++) {
            this.field_o[var2] = (128 - var2) * dda.a(65793, this.field_m.c(this.field_m.field_P.field_s.field_D, 2271));
          }
        }
        this.field_d.a(19842, param0);
        this.field_i.a(19842, true);
        if (!this.field_i.field_T) {
          this.field_i.field_vb = 0;
        } else {
          this.field_i.field_vb = this.field_i.field_vb + 1;
        }
        this.field_h.a(19842, true);
        if (this.field_h.field_T) {
          this.field_h.field_vb = this.field_h.field_vb + 1;
        } else {
          this.field_h.field_vb = 0;
        }
    }

    final static aga a(op param0, int param1, lu param2) {
        int var5 = 0;
        aga stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        aga stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        aga var4 = null;
        int var6 = 0;
        rk var7 = null;
        var6 = BachelorFridge.field_y;
        try {
          var7 = gka.a(param2, 255);
          if (var7 == null) {
            return null;
          }
          var4 = new aga(var7, param0, -1, -1);
          var4.field_I = param2.e((byte) 54);
          var4.field_t = param2.e((byte) 109);
          var4.field_D = param2.b(16711935);
          var4.field_u = param2.b(param1 + 16711986);
          var4.field_F = param2.b(param1 + 16711986);
          var4.field_x = param2.b(param1 ^ -16711886);
          var4.field_J = param2.b(16711935);
          var4.field_s = param2.b(16711935);
          var4.field_y = param2.b(16711935);
          var4.field_C = param2.b(16711935);
          var4.field_E = param2.b(16711935);
          if (param1 != -51) {
            ng.a((byte) 43);
          }
          for (var5 = 0; 5 > var5; var5++) {
            var4.field_K[var5] = param2.b(true);
          }
          var4.field_H = param2.b(16711935);
          stackIn_11_0 = var4;
          stackIn_12_1 = (param2.b(16711935) == 1);
          stackIn_11_0.field_A = stackIn_12_1;
          if (!var4.i(param1 ^ -100)) {
            param0.field_a[var4.field_x][var4.field_J].field_l = var4;
            var4.d(51);
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ng.E(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2, boolean param3, int param4, int param5) {
        int stackIn_39_0 = 0;
        int stackIn_44_0 = 0;
        jj stackIn_52_0 = null;
        kv stackIn_53_1 = null;
        jj stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        double var7;
        int var9;
        int var10;
        int var11;
        var11 = BachelorFridge.field_y;
        this.field_g[param5] = new jj(param4);
        this.field_g[param5].field_sb = 32;
        this.field_g[param5].field_p = 32;
        var7 = (double)(-(2 * param2) + 2 * param5 + 1) * 3.141592653589793 / (double)(2 * param2);
        Math.cos(var7);
        Math.sin(var7);
        var9 = -1;
        if (param1 == 2) {
          var9 = al.a(-49, param4).field_h;
        } else {
          if (param1 != 1) {
            if (param1 == 4) {
              var9 = al.a(-75, param4).field_h;
            }
          } else {
            var9 = al.a(-60, param4).field_h;
          }
        }
        this.field_m.b(this.field_m.field_P, true);
        if (param2 != 4) {
          if (param2 == 3) {
            if (param5 == 0) {
              this.field_g[param5].field_xb = 0;
            } else {
              if (param5 == 1) {
                this.field_g[param5].field_xb = 2;
              } else {
                if (2 == param5) {
                  this.field_g[param5].field_xb = 3;
                }
              }
            }
          } else {
            if (param2 != 2) {
              this.field_g[param5].field_xb = 2;
            } else {
              if (param5 != 0) {
                if (param5 == 1) {
                  this.field_g[param5].field_xb = 4;
                }
              } else {
                this.field_g[param5].field_xb = 1;
              }
            }
          }
        } else {
          if (param5 == 0) {
            this.field_g[param5].field_xb = 0;
          } else {
            if (param5 != 1) {
              if (param5 != 2) {
                if (3 == param5) {
                  this.field_g[param5].field_xb = 3;
                }
              } else {
                this.field_g[param5].field_xb = 4;
              }
            } else {
              this.field_g[param5].field_xb = 1;
            }
          }
        }
        var10 = 1;
        if (this.field_m.field_P.field_s.field_y != 40 &&
          42 != this.field_m.field_P.field_s.field_y &&
          this.field_m.field_P.field_s.field_y != 39) {
          if (!param3) {
            var10 = 0;
          } else if (this.field_m.field_P.field_s.c((byte) -10, param4) &&
            !this.field_m.field_P.field_s.f(param0 - 104, param4)) {
            if (param1 == 2) {
              stackIn_39_0 = (this.field_m.field_M != 1) ? 0 : 1;
              var10 = stackIn_39_0;
            } else if (param1 == 1) {
              stackIn_44_0 = (this.field_m.field_M != 2) ? 0 : 1;
              var10 = stackIn_44_0;
            }
          } else {
            var10 = 0;
          }
        } else {
          var10 = 0;
        }
        if (param0 != 104) {
          return;
        }
        stackIn_52_0 = this.field_g[param5];
        if (var10 == 0) {
          stackIn_53_1 = hl.field_D[var9];
        } else {
          stackIn_53_1 = hh.field_b[var9];
        }
        stackIn_52_0.field_v = stackIn_53_1;
        this.field_g[param5].field_kb = gja.field_k[param2 - 1][param5][0];
        this.field_g[param5].field_rb = gja.field_k[-1 + param2][param5][1];
        stackIn_55_0 = this.field_g[param5];
        stackIn_56_1 = (var10 == 0) ? false : true;
        stackIn_55_0.field_yb = stackIn_56_1;
    }

    final static boolean b(int param0) {
        int var1;
        boolean stackIn_5_0 = false;
        var1 = -100 / ((param0 + 83) / 43);
        stackIn_5_0 = (null != jea.field_c) || (gm.field_k);
        return stackIn_5_0;
    }

    ng(gj param0, sna param1) {
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_m = param0;
          this.field_c = 0;
          this.field_j = new sna();
          this.field_j.field_gb = 16777215;
          this.field_d = new sna("moveselect", this.field_j, -15, 162, 192, 170, "");
          this.field_l = new sna("stats", param1, 0, 360, 60, 20, tv.field_n);
          this.field_i = new jj(0);
          this.field_h = new jj(0);
          this.field_d.a(-1, this.field_i);
          this.field_o = new int[256];
          for (var3_int = 0; var3_int < 256; var3_int++) {
            this.field_o[var3_int] = var3_int * 65793;
          }
          this.field_b = a.a(12889, 64, 16763049, 46335);
          this.field_k = new kv(84, 84);
          this.field_k.b();
          dg.a(672, 672, 672, 128, this.field_o);
          hga.field_U.a((byte) 114);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ng.<init>(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_n = "Use the magnifier or right click on a creature to view its stats.";
    }
}
