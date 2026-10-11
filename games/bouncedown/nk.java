/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    private double field_d;
    static tg[] field_h;
    private int field_l;
    private mj field_k;
    String field_f;
    private boolean field_j;
    int field_c;
    int field_i;
    private int field_g;
    private int field_m;
    static int[] field_b;
    static sh field_a;
    static String field_e;

    private final void a(int param0, int param1, String param2, int param3, int param4) {
        try {
          if (param4 != 21641) {
            field_e = (String) null;
          }
          od.field_f.a(param2, param3 - 2, param0, 0, 0);
          od.field_f.a(param2, -1 + param3, param0, 0, 0);
          od.field_f.a(param2, param3, -1 + param0, 0, 0);
          od.field_f.a(param2, param3 - 1, param0, 0, -1);
          od.field_f.a(param2, param3, -2 + param0, 0, 0);
          od.field_f.a(param2, param3 + 2, param0, 0, -1);
          od.field_f.a(param2, param3, 2 + param0, 0, -1);
          od.field_f.a(param2, param3, param0, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "nk.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          od.field_f.a(param4, -2 + param0, param5, param7, param2, 0, 0, param3, param6, param9);
          od.field_f.a(param4, param0, param5 - 2, param7, param2, 0, 0, param3, param6, param9);
          od.field_f.a(param4, -1 + param0, -1 + param5, param7, param2, 0, 0, param3, param6, param9);
          od.field_f.a(param4, param0, param5, param7, param2, 0, 0, param3, param6, param9);
          od.field_f.a(param4, 1 + param0, param5 - 1, param7, param2, 0, 0, param3, param6, param9);
          if (param8 != 20066) {
            this.field_f = (String) null;
          }
          od.field_f.a(param4, param0 - 1, param5 + 1, param7, param2, 0, 0, param3, param6, param9);
          stackIn_3_0 = od.field_f.a(param4, param0, param5, param7, param2, param1, -1, param3, param6, param9);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("nk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, byte param1, boolean param2) {
        ud dupTemp$0 = null;
        ud dupTemp$1 = null;
        ud dupTemp$2 = null;
        ud dupTemp$3 = null;
        mj stackIn_76_0 = null;
        int stackIn_77_1 = 0;
        mj stackIn_82_0 = null;
        int stackIn_83_1 = 0;
        boolean stackIn_89_0 = false;
        boolean stackIn_99_0 = false;
        pk stackIn_103_0 = null;
        be stackIn_104_1 = null;
        mj stackIn_129_0 = null;
        int stackIn_130_1 = 0;
        mj stackIn_147_0 = null;
        int stackIn_148_1 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5_int = 0;
        Object var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        if (u.field_g) {
          return;
        }
        if (!param2) {
          this.field_k.field_o = false;
        }
        L1: {
          L2: {
            var5_int = this.field_i;
            if (0 != var5_int) {
              if (1 != var5_int &&
                var5_int != 2) {
                switch (var5_int) {
                  case 3:
                    if (param0 != 0) {
                      return;
                    }
                    this.field_k.field_l = false;
                    this.field_k.field_d = true;
                    stackIn_76_0 = this.field_k;
                    if (!param2) {
                      stackIn_77_1 = 0;
                    } else {
                      stackIn_77_1 = -1;
                    }
                    stackIn_76_0.field_n = stackIn_77_1;
                    this.field_k.field_e = false;
                    break L2;
                  case 4:
                    if (param0 != 0) {
                      return;
                    }
                    stackIn_82_0 = this.field_k;
                    if (!param2) {
                      stackIn_83_1 = 11;
                    } else {
                      stackIn_83_1 = -1;
                    }
                    stackIn_82_0.field_n = stackIn_83_1;
                    this.field_k.field_e = true;
                    this.field_k.field_d = false;
                    this.field_k.field_l = false;
                    if (jh.b(767564065)) {
                      break L2;
                    }
                    pe.field_f = pe.a(3, 10, 1, -16947, 13);
                    break L2;
                  case 5:
                    if (param0 == 0) {
                      stackIn_89_0 = !(wd.field_x);
                      wd.field_x = stackIn_89_0;
                      break L2;
                    }
                    md.field_w = md.field_w + param0;
                    if (0 > md.field_w) {
                      md.field_w = 0;
                    }
                    if (md.field_w > 256) {
                      md.field_w = 256;
                      break L2;
                    }
                    var4 = -114 / ((36 - param1) / 33);
                    break L1;
                  case 6:
                    if (param0 != 0) {
                      jd.field_a = jd.field_a + param0;
                      if (jd.field_a < 0) {
                        jd.field_a = 0;
                      }
                      if (jd.field_a > 256) {
                        jd.field_a = 256;
                      }
                      ld.field_l.g(jd.field_a / 2, 100);
                      break L2;
                    }
                    stackIn_99_0 = !(rd.field_a);
                    rd.field_a = stackIn_99_0;
                    var5 = jl.field_d;
                    synchronized (var5) {
                      if (!rd.field_a) {
                        ld.field_l.f(-22719);
                      } else {
                        stackIn_103_0 = ld.field_l;
                        if (u.field_g) {
                          stackIn_104_1 = wj.field_c;
                        } else {
                          stackIn_104_1 = sd.field_mb;
                        }
                        ((pk) (Object) stackIn_103_0).a(stackIn_104_1, true, 123);
                      }
                      jl.field_d.d();
                    }
                    break L2;
                  case 7:
                    if (param0 != 0) {
                      return;
                    }
                    if (sj.field_f != null) {
                      mh.a(sj.field_f, (byte) 122);
                      sj.field_f.a((byte) -124, ck.field_e);
                      sj.field_f = null;
                      ch.field_h.requestFocus();
                      break L2;
                    }
                    mg.d(30432);
                    if (param2) {
                      break L2;
                    }
                    qf.field_b = 0;
                    break L2;
                  case 8:
                    if (param0 != 0) {
                      return;
                    }
                    this.field_k.field_l = true;
                    stackIn_129_0 = this.field_k;
                    if (!param2) {
                      stackIn_130_1 = 0;
                    } else {
                      stackIn_130_1 = -1;
                    }
                    stackIn_129_0.field_n = stackIn_130_1;
                    kb.field_a = 0;
                    this.field_k.field_d = false;
                    this.field_k.field_e = false;
                    break L2;
                  case 9:
                    if (param0 != 0) {
                      return;
                    }
                    if (null != sj.field_f) {
                      mh.a(sj.field_f, (byte) 84);
                      sj.field_f.a((byte) -127, ck.field_e);
                      sj.field_f = null;
                      ch.field_h.requestFocus();
                    }
                    tc.a(vi.b(0), 6091);
                    break L2;
                  case 11:
                  case 14:
                  default:
                    if (10 != var5_int &&
                      12 != var5_int &&
                      var5_int != 13) {
                      if (var5_int != 11) {
                        if ((var5_int == 14)) {
                          if (param0 != 0) {
                            return;
                          }
                          tk.d(-6144);
                          rj.field_j = 3;
                        }
                      } else {
                        if (param2) {
                          ii.field_k = 1;
                          if (uc.field_C < 256) {
                            ii.field_k = 0;
                          }
                          if (!(uc.field_C <= 384)) {
                            ii.field_k = 2;
                          }
                        } else {
                          if (param0 >= 0) {
                            ii.field_k = ii.field_k + 1;
                          } else {
                            ii.field_k = ii.field_k - 1;
                          }
                          if (ii.field_k < 0) {
                            ii.field_k = ii.field_k + 3;
                          }
                          this.field_k.field_o = false;
                          if (ii.field_k >= 3) {
                            ii.field_k = ii.field_k - 3;
                          }
                          this.field_k.field_n = this.field_m;
                        }
                      }
                      break L2;
                    }
                    if (this.field_i == 13) {
                      if (param0 >= 0) {
                        if (param0 > 0) {
                          qa.field_j = 235;
                        }
                      } else {
                        qa.field_j = 0;
                      }
                    }
                    if (param0 != 0) {
                      return;
                    }
                    this.field_k.field_d = false;
                    this.field_k.field_e = false;
                    this.field_k.field_l = false;
                    stackIn_147_0 = this.field_k;
                    if (param2) {
                      stackIn_148_1 = -1;
                    } else {
                      stackIn_148_1 = 0;
                    }
                    stackIn_147_0.field_n = stackIn_148_1;
                    break L2;
                }
              }
            } else {
              if (param0 != 0) {
                return;
              }
              nb.field_a = 0;
              kb.field_a = 0;
              pe.field_f = null;
              hg.field_l = 0;
              nb.field_e = 0;
              kg.field_f = 0;
              vg.field_j = 0;
              k.field_C = 0;
              bf.field_k = false;
              qe.field_f = 0;
              qf.field_c = 0;
              ve.field_a = 0;
            }
            if (param0 != 0) {
              return;
            }
            var4 = this.field_i + 1;
            ne.field_w = 0;
            this.field_k.field_b = false;
            l.field_c = l.field_c - fa.field_c;
            bk.field_c = var4;
            ta.field_c = 1.0;
            u.field_g = true;
            vk.field_b = 1;
            fa.field_c = 0;
            if (rd.field_a) {
              var5 = jl.field_d;
              synchronized (var5) {
                ld.field_l.a(wj.field_c, true, 89);
                jl.field_d.d();
              }
            }
            jk.field_q = -1;
            for (var5_int = 0; 3 > var5_int; var5_int++) {
              he.field_n[var5_int].a(true);
            }
            if (var4 == 2) {
              dupTemp$0 = he.field_n[0];
              dupTemp$0.field_u = dupTemp$0.field_u - 20.0;
              dupTemp$1 = he.field_n[1];
              dupTemp$1.field_u = dupTemp$1.field_u + 20.0;
            }
            if (var4 == 3) {
              dupTemp$2 = he.field_n[0];
              dupTemp$2.field_u = dupTemp$2.field_u - 40.0;
              dupTemp$3 = he.field_n[1];
              dupTemp$3.field_u = dupTemp$3.field_u + 40.0;
            }
            vk.field_b = var4;
            for (var5_int = 0; var5_int < ua.field_b; var5_int++) {
              var6 = (int)(Math.random() * 384.0 + 64.0);
              if (0 == var5_int) {
                var6 = 256;
              }
              if (var5_int == 1) {
                var6 = 64;
              }
              if (var5_int == 2) {
                var6 = 448;
              }
              if (3 == var5_int) {
                var6 = 160;
              }
              if (4 == var5_int) {
                var6 = 352;
              }
              if (var5_int == 5) {
                var6 = 256;
              }
              ua.field_c[var5_int].a(33, 0, (double)var6);
              ua.field_c[var5_int].field_h = (double)(320 + var5_int * 64);
              if (var5_int == 0) {
                ua.field_c[var5_int].field_b = var4;
              }
            }
          }
          var4 = -114 / ((36 - param1) / 33);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        ve.a(param2, param0, ig.field_d, (byte) -87, param4, param1);
        na.a(4 + param1, param0 + param3, -8 + param4, param2 - 8, 0, 192);
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8, int param9) {
        RuntimeException var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gk.field_e.a(param6, param8 + param2, param9, param1, param0, 0, 0, param7, param3, param4);
          gk.field_e.a(param6, param8, -1 + param9, param1, param0, 0, 0, param7, param3, param4);
          stackIn_1_0 = gk.field_e.a(param6, param8, param9, param1, param0, param5, -1, param7, param3, param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_4_0 = var11;
          stackIn_4_1 = new StringBuilder().append("nk.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    final void a(int param0, int param1) {
        int discarded$0 = 0;
        tg discarded$1 = null;
        tg stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_180_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6_int;
        String var6;
        int var7;
        String var7_ref_String;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String[] var17;
        String var18;
        String var19;
        String var20;
        String var21;
        String var22;
        String var23;
        String var24;
        String[] var25;
        String var26;
        String var27;
        String var28;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var13Lifetime1;
        int var13Lifetime2;
        int var14Lifetime1;
        int var7Lifetime3Lifetime1;
        int var8Lifetime3Lifetime1;
        int var9Lifetime2Lifetime1;
        int var10Lifetime2Lifetime1;
        int var10Lifetime3Lifetime1;
        String var6Lifetime1;
        String var19Lifetime1;
        var16 = Bounce.field_N;
        if (this.field_g <= -10 &&
          0 <= this.field_i) {
          return;
        }
        if (param1 != 16741888) {
          this.field_d = 0.04776527549427232;
        }
        if (this.field_g < -310 &&
          0 > this.field_i) {
          return;
        }
        var3 = 1;
        if (this.field_c == 0 && (this.field_k.field_e ||
          this.field_k.field_d ||
          this.field_k.field_l)) {
          this.field_j = false;
          var3 = 0;
        }
        if (this.field_c == 1 &&
          !this.field_k.field_e) {
          var3 = 0;
          this.field_j = false;
        }
        if (this.field_c == 2 &&
          !this.field_k.field_l) {
          var3 = 0;
          this.field_j = false;
        }
        if (this.field_c == 3 &&
          !this.field_k.field_d) {
          var3 = 0;
          this.field_j = false;
        }
        if (this.field_i == 13) {
          if (!this.field_k.field_d) {
            mb.field_j = 0;
            qa.field_j = 0;
          }
          if (250 < mb.field_j) {
            qa.field_j = -qa.field_j + 235;
            mb.field_j = mb.field_j - 250;
          }
          fj.field_b = (9 * fj.field_b + qa.field_j) / 10;
          var4 = 80;
          var5 = 240;
          if (3 == ud.field_a) {
            var5 += 30;
            var4 += 40;
          }
          var6_int = this.field_l;
          this.field_l = -12 + (-480 + this.field_g) + 96 + 8;
          this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[1], this.field_l, 0, 480, 20066, 20) * 20;
          this.field_l = this.field_l + 10;
          this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[2], this.field_l, 0, 480, 20066, 20) * 20;
          this.field_l = this.field_l + this.a(80, 16741888, 480, 1, Bounce.field_A[3], this.field_l, 0, 480, 20066, 20) * 20;
          this.field_l = this.field_l + 10;
          var7 = -this.field_l - 40 + this.field_g;
          this.a(this.field_l, 80, var7, 4, 480);
          na.e(84, this.field_l + 4, 556, -4 + var7 + this.field_l);
          var8 = fj.field_b;
          this.field_l = this.field_l - var8;
          var9 = 6;
          var10 = 120 + (320 - kc.field_c.field_t / 2);
          this.field_l = this.field_l + 8;
          kc.field_c.a(var10, var9 + this.field_l);
          this.field_l = this.field_l + this.a(60 + (var4 - gk.field_e.b(Bounce.field_A[4]) / 2), 16741888, 480, 1, Bounce.field_A[4], this.field_l, 0, var5, param1 - 16721822, 20) * 20;
          if (ud.field_a == 3) {
            this.field_l = this.field_l - 6;
          }
          this.field_l = this.field_l + 24;
          var11 = ae.field_f % 24;
          if (var11 <= 12) {
            a.field_f.a(var10, var9 + (this.field_l + re.field_a.field_q - a.field_f.field_q));
          } else {
            re.field_a.a(var10, var9 + this.field_l);
          }
          this.field_l = this.field_l + this.a(-(gk.field_e.b(Bounce.field_A[5]) / 2) + var4 + 60, 16741888, 480, 1, Bounce.field_A[5], this.field_l, 0, var5, 20066, 20) * 20;
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + 12 * this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[6], 1, 80, this.field_l);
          if (ud.field_a == 3) {
            this.field_l = this.field_l - 6;
          }
          this.field_l = this.field_l + 22;
          q.field_F.d(var10, var9 + this.field_l, (int)(128.0 + 128.0 * Math.sin((double)(ae.field_f / 4))));
          this.field_l = this.field_l + 20 * this.a(var4 + 60 - gk.field_e.b(Bounce.field_A[7]) / 2, 16741888, 480, 1, Bounce.field_A[7], this.field_l, 0, var5, 20066, 20);
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[8], 1, 80, this.field_l) * 12;
          if (ud.field_a == 3) {
            this.field_l = this.field_l - 6;
          }
          this.field_l = this.field_l + 22;
          fd.field_n[ae.field_f / 8 % 6].a(var10, var9 + this.field_l);
          this.field_l = this.field_l + 20 * this.a(57 + (var4 - gk.field_e.b(Bounce.field_A[9]) / 2), 16741888, 480, 1, Bounce.field_A[9], this.field_l, 0, var5, param1 - 16721822, 20);
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + this.a(480, 480, -1, 0, 12, 16777215, Bounce.field_A[10], 1, 80, this.field_l) * 12;
          if (ud.field_a == 3) {
            this.field_l = this.field_l + 4;
          }
          this.field_l = this.field_l + 26;
          bd.field_j[ae.field_f / 8 % 3].a(var10, this.field_l + var9);
          this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[11]) / 2) + (60 + var4), 16741888, 480, 1, Bounce.field_A[11], this.field_l, 0, var5, 20066, 20);
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + this.a(480, 480, param1 - 16741889, 0, 12, 16777215, Bounce.field_A[12], 1, 80, this.field_l) * 12;
          this.field_l = this.field_l + 22;
          wb.field_e[ae.field_f / 8 % 3].a(var10, this.field_l + var9);
          this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[13]) / 2) + 60 + var4, 16741888, 480, 1, Bounce.field_A[13], this.field_l, 0, var5, 20066, 20);
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + 12 * this.a(480, 480, param1 - 16741889, 0, 12, 16777215, Bounce.field_A[14], 1, 80, this.field_l);
          this.field_l = this.field_l + 22;
          field_h[ae.field_f / 8 % 4].a(var10, var9 + this.field_l);
          nl.field_d[0].a(var10, this.field_l + var9 - nl.field_d[0].field_q);
          this.field_l = this.field_l + 20 * this.a(-(gk.field_e.b(Bounce.field_A[15]) / 2) + (var4 + 60), 16741888, 480, 1, Bounce.field_A[15], this.field_l, 0, var5, param1 ^ 16726114, 20);
          this.field_l = this.field_l + 8;
          this.field_l = this.field_l + this.a(480, 480, param1 ^ -16741889, 0, 12, 16777215, Bounce.field_A[16], 1, 80, this.field_l) * 12;
          this.field_l = this.field_l + 12 * this.a(480, 480, param1 - 16741889, 0, 12, 16777215, Bounce.field_A[17], 1, 80, this.field_l);
          na.d();
          this.field_l = var6_int;
        }
        var4Lifetime1 = 320;
        var5Lifetime1 = param0;
        var18 = this.field_f;
        var6 = var18;
        var6Lifetime1 = var18;
        if (this.field_k.field_b) {
          if (this.field_j &&
            this.field_k.field_n == -1 &&
            var3 != 0) {
            var5Lifetime1 = 16777215;
          }
          if (this.field_m == this.field_k.field_n &&
            var3 != 0) {
            var5Lifetime1 = 16777215;
          }
          if (this.field_i == 7 &&
            !kh.a(ck.field_e, 30256)) {
            var5Lifetime1 = 8930338;
          }
        }
        if (this.field_i == -1) {
          var7Lifetime1 = this.field_g - 35;
          var8Lifetime1 = 295;
          this.a(var7Lifetime1, 80, var8Lifetime1, 4, 480);
          mf.field_b.a(320 - mf.field_b.field_t / 2, this.field_g - 120);
          na.e(84, var7Lifetime1 + 4, 556, -4 + (var7Lifetime1 + var8Lifetime1));
        }
        if (this.field_i == 1) {
          stackIn_68_0 = l.field_e;
          stackIn_68_1 = 20;
          if (-160 + this.field_g >= 0) {
            stackIn_69_2 = 0;
          } else {
            stackIn_69_2 = -160 + this.field_g;
          }
          ((tg) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
        }
        if (this.field_i == 13) {
          mi.field_k.a(-(mi.field_k.field_t / 2) + 320, this.field_g - 470);
        }
        if (this.field_i < 0 &&
          tk.field_c == this.field_i) {
          var6Lifetime1 = Bounce.field_A[18] + var18;
          var19 = var6Lifetime1;
          var6Lifetime1 = var19;
          var5Lifetime1 = 16711680;
        }
        if (this.field_i == 10 &&
          !jh.b(767564065)) {
          var19Lifetime1 = jc.field_m;
          var6Lifetime1 = var19Lifetime1;
          var6Lifetime1 = var19Lifetime1;
          gk.field_e.a(var19Lifetime1, -1 + var4Lifetime1, -70 + this.field_g, 0, 0);
          gk.field_e.a(var19Lifetime1, var4Lifetime1, this.field_g - 1 - 70, 0, 0);
          gk.field_e.a(var19Lifetime1, var4Lifetime1, -70 + this.field_g, 16777215, -1);
        }
        if (7 == this.field_i) {
          if (null != sj.field_f) {
            var6Lifetime1 = var6Lifetime1 + Bounce.field_A[19];
          } else {
            var6Lifetime1 = var6Lifetime1 + Bounce.field_A[20];
          }
        }
        if (this.field_i == 13) {
          var20 = od.field_c;
          var7_ref_String = var20;
          var8Lifetime2 = od.field_f.b(var20);
          var9Lifetime1 = var4Lifetime1;
          if (0 == qa.field_j) {
            var7_ref_String = sg.field_b;
            var9Lifetime1 += 150;
          } else {
            var9Lifetime1 -= 150;
          }
          var10Lifetime1 = var9Lifetime1 - var8Lifetime2 / 2;
          var11 = this.field_g - od.field_f.field_s - 10;
          var12 = var8Lifetime2;
          var13 = 8 + od.field_f.field_s;
          var14 = 16697912;
          if (var10Lifetime1 <= uc.field_C &&
            uc.field_C < var10Lifetime1 + var12 &&
            var11 <= ll.field_y &&
            var13 + var11 > ll.field_y &&
            this.field_k.field_o &&
            var3 != 0) {
            if (n.field_m != 0) {
              qa.field_j = -qa.field_j + 235;
            }
            var14 = 16777215;
          }
          this.a(-10 + this.field_g, var14, var7_ref_String.toUpperCase(), var9Lifetime1, param1 ^ 16720521);
        }
        L31: {
          if (this.field_i != 5) {
            if (this.field_i != 6) {
              if (this.field_i != 12 &&
                10 != this.field_i &&
                this.field_i != 13 && (this.field_i != 4 ||
                this.field_m != 1 ||
                var6Lifetime1 != bk.field_d) && this.field_i != 14) {
                if (this.field_i == 11 &&
                  !jh.b(767564065)) {
                  var7Lifetime2 = od.field_f.b(of.field_d[1]);
                  for (var8Lifetime3 = 0; var8Lifetime3 < 3; var8Lifetime3++) {
                    var4Lifetime1 = 320 + (48 + var7Lifetime2) * (var8Lifetime3 - 1);
                    var26 = of.field_d[var8Lifetime3];
                    var9Lifetime2 = var4Lifetime1 - (var7Lifetime2 / 2 + 5);
                    var10Lifetime2 = this.field_g - (od.field_f.field_s + 10);
                    var11 = var7Lifetime2 + 10;
                    var12Lifetime1 = od.field_f.field_s;
                    var13Lifetime1 = param0;
                    if (~ii.field_k == ~var8Lifetime3) {
                      var13Lifetime1 = 16729088;
                    }
                    var5Lifetime1 = 16741888;
                    if (var9Lifetime2 <= uc.field_C &&
                      var11 + var9Lifetime2 > uc.field_C &&
                      ll.field_y >= var10Lifetime2 &&
                      ll.field_y < var10Lifetime2 + var12Lifetime1 &&
                      this.field_k.field_o &&
                      var3 != 0) {
                      this.field_j = true;
                      this.field_k.field_n = this.field_m;
                      var13Lifetime1 = (var13Lifetime1 == 16729088) ? 16746632 : 16777096;
                      if (n.field_m != 0) {
                      }
                    }
                    if (ii.field_k == var8Lifetime3) {
                      var5Lifetime1 = 16768544;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (this.field_k.field_o &&
                      this.field_k.field_n == this.field_m) {
                      if ((var13Lifetime1 == 16777096 ||
                        var13Lifetime1 == 16746632)) {
                        var5Lifetime1 = 16777215;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      if (this.field_k.field_n == this.field_m && (var13Lifetime1 == 16729088 ||
                        16746632 == var13Lifetime1)) {
                        var5Lifetime1 = 16777215;
                      }
                    }
                    this.a(-10 + this.field_g, var5Lifetime1, var26.toUpperCase(), var4Lifetime1, 21641);
                  }
                } else {
                  if (0 <= this.field_i) {
                    this.a(this.field_g, var5Lifetime1, var6Lifetime1, var4Lifetime1, 21641);
                  } else {
                    var17 = di.a(-108, ',', var6Lifetime1);
                    var25 = var17;
                    if (var17.length <= 2) {
                      discarded$0 = this.a(140, var5Lifetime1, 480, 1, var6Lifetime1, this.field_g - 75, 0, 360, 20066, 20);
                    } else {
                      if (var5Lifetime1 == 16741888 &&
                        (this.field_i & 1) == 0) {
                        var5Lifetime1 = 7785983;
                      }
                      if (var17[0].length() <= 4) {
                        od.field_f.c(var25[0], var4Lifetime1 - 136, -4 + this.field_g, 0, 0);
                        od.field_f.c(var25[0], var4Lifetime1 - 135, this.field_g - 1 - 4, 0, 0);
                        od.field_f.c(var25[0], -135 + var4Lifetime1, this.field_g - 4, var5Lifetime1, -1);
                        od.field_f.b(var25[1], -1 + (var4Lifetime1 - 125), -4 + this.field_g, 0, 0);
                        od.field_f.b(var25[1], -125 + var4Lifetime1, -4 + (-1 + this.field_g), 0, 0);
                        od.field_f.b(var25[1], var4Lifetime1 - 125, this.field_g - 4, var5Lifetime1, -1);
                      } else {
                        od.field_f.c(var17[0], -135 + (var4Lifetime1 - 1), -4 + this.field_g, 0, 0);
                        od.field_f.c(var17[0], var4Lifetime1 - 135, this.field_g - 1 - 4, 0, 0);
                        od.field_f.c(var17[0], var4Lifetime1 - 135, this.field_g - 4, var5Lifetime1, -1);
                        od.field_f.b(var17[1], var4Lifetime1 - 125 - 1, -4 + this.field_g, 0, 0);
                        od.field_f.b(var17[1], -125 + var4Lifetime1, this.field_g - 5, 0, 0);
                        od.field_f.b(var17[1], -125 + var4Lifetime1, this.field_g - 4, var5Lifetime1, -1);
                      }
                      od.field_f.b(var25[2], 75 + var4Lifetime1 - 1, -4 + this.field_g, 0, 0);
                      od.field_f.b(var25[2], 75 + var4Lifetime1, -4 + (-1 + this.field_g), 0, 0);
                      od.field_f.b(var25[2], var4Lifetime1 + 75, this.field_g - 4, var5Lifetime1, -1);
                    }
                    if ((this.field_i == -10)) {
                      na.d();
                    }
                  }
                }
                break L31;
              }
              var7Lifetime2 = od.field_f.b(var6Lifetime1);
              var8Lifetime3Lifetime1 = -(var7Lifetime2 / 2) + var4Lifetime1;
              var9Lifetime2Lifetime1 = -od.field_f.field_s + this.field_g - 10;
              var10Lifetime2Lifetime1 = var7Lifetime2;
              var11 = 8 + od.field_f.field_s;
              if (uc.field_C >= var8Lifetime3Lifetime1 &&
                uc.field_C < var8Lifetime3Lifetime1 + var10Lifetime2Lifetime1 &&
                ll.field_y >= var9Lifetime2Lifetime1 &&
                var11 + var9Lifetime2Lifetime1 > ll.field_y &&
                this.field_k.field_o &&
                var3 != 0) {
                this.field_k.field_n = this.field_m;
                this.field_j = true;
                if (n.field_m == 0) {
                }
              }
              this.a(this.field_g - 10, var5Lifetime1, var6Lifetime1.toUpperCase(), var4Lifetime1, 21641);
            } else {
              if (!rd.field_a &&
                param0 == var5Lifetime1) {
                var5Lifetime1 = 8930338;
              }
              this.a(this.field_g, var5Lifetime1, var6Lifetime1, var4Lifetime1 - od.field_f.b(var6Lifetime1) / 2 - 35, 21641);
              var23 = "----------------";
              var6Lifetime1 = var23;
              this.a(2 + this.field_g, var5Lifetime1, var6Lifetime1, -35 + (od.field_f.b(var23) / 2 + var4Lifetime1), 21641);
              var24 = "l";
              var6Lifetime1 = var24;
              var7Lifetime2 = jd.field_a / 2 + var4Lifetime1;
              this.a(this.field_g, var5Lifetime1, var6Lifetime1, var7Lifetime2 + od.field_f.b(var24) / 2 - 35, param1 - 16720247);
            }
          } else {
            if (!wd.field_x &&
              param0 == var5Lifetime1) {
              var5Lifetime1 = 8930338;
            }
            this.a(this.field_g, var5Lifetime1, var6Lifetime1, -35 + (var4Lifetime1 - od.field_f.b(var6Lifetime1) / 2), 21641);
            var21 = "----------------";
            var6Lifetime1 = var21;
            this.a(this.field_g + 2, var5Lifetime1, var6Lifetime1, od.field_f.b(var21) / 2 + (var4Lifetime1 - 35), 21641);
            var22 = "l";
            var6Lifetime1 = var22;
            var7Lifetime2 = md.field_w / 2 + var4Lifetime1;
            this.a(this.field_g, var5Lifetime1, var6Lifetime1, -35 + var7Lifetime2 + od.field_f.b(var22) / 2, param1 - 16720247);
          }
        }
        if (12 == this.field_i) {
          ej.field_a.a(-(ej.field_a.field_t / 2) + 320, -430 + this.field_g);
          discarded$1 = new tg(32, 32);
          fa.field_b = -1;
          var7Lifetime3 = 140;
          var7Lifetime3Lifetime1 = 144;
          var8Lifetime4 = this.field_g - 318;
          if (0 < kb.field_a) {
            stackIn_180_0 = kb.field_a;
          } else {
            if (!jh.b(767564065)) {
              stackIn_180_0 = ui.field_g;
            } else {
              stackIn_180_0 = 0;
            }
          }
          var9Lifetime3 = stackIn_180_0;
          var8Lifetime4 -= 24;
          if (!vh.a(0, (byte) 88) &&
            (var9Lifetime3 & 512) <= 0) {
            this.a(-6 + (var8Lifetime4 - 4), -4 + var7Lifetime3Lifetime1 - 6, 53, 4, 373);
          } else {
            var7Lifetime3Lifetime1 -= 20;
            this.a(-6 + var8Lifetime4 - 4, -6 + (var7Lifetime3Lifetime1 - 4), 53, 4, 413);
          }
          var10Lifetime3 = -od.field_f.field_s + (-228 + this.field_g);
          this.a(var10Lifetime3 - 5, 75, 3 * od.field_f.field_s + 138, 4, 490);
          if (kb.field_a <= 0) {
            var28 = Bounce.field_A[25];
            this.a(-272 + this.field_g, 16777215, var28, 320, 21641);
          } else {
            var27 = Bounce.field_A[24];
            this.a(-44 + this.field_g - 228, 16777215, var27, 320, 21641);
          }
          var10Lifetime3Lifetime1 = 1;
          for (var11 = 0; lj.field_b.length > var11; var11++) {
            var12Lifetime2 = 1;
            if (var11 == 9 &&
              (var9Lifetime3 & 1 << var11) == 0 &&
              !vh.a(0, (byte) 88)) {
              var12Lifetime2 = 0;
            }
            L58: {
              if (var12Lifetime2 != 0) {
                var13Lifetime2 = 0;
                if (var7Lifetime3Lifetime1 <= uc.field_C &&
                  uc.field_C <= var7Lifetime3Lifetime1 + 32 &&
                  var8Lifetime4 <= ll.field_y &&
                  ll.field_y <= var8Lifetime4 + 32) {
                  fa.field_b = var11;
                  var13Lifetime2 = 2;
                }
                if (ua.field_a == var11) {
                  var13Lifetime2 = 2;
                  na.b(var7Lifetime3Lifetime1 + 16, 16 + var8Lifetime4, 20, 0);
                  na.b(16 + var7Lifetime3Lifetime1, 16 + var8Lifetime4, 18, 16741888);
                  na.b(16 + var7Lifetime3Lifetime1, var8Lifetime4 + 16, 16, 0);
                }
                if ((var9Lifetime3 & 1 << var11) == 0) {
                  if (kb.field_a > 0) {
                    break L58;
                  }
                  cf.field_c.a(-var13Lifetime2 + var7Lifetime3Lifetime1, -var13Lifetime2 + var8Lifetime4, 32 + var13Lifetime2 * 2, var13Lifetime2 * 2 + 32);
                } else {
                  ug.field_h[var11].a(var7Lifetime3Lifetime1 - var13Lifetime2, -var13Lifetime2 + var8Lifetime4, 32 + var13Lifetime2 * 2, 2 * var13Lifetime2 + 32);
                }
                if (var11 == ua.field_a ||
                  !(uc.field_C < var7Lifetime3Lifetime1) &&
                  !(uc.field_C > 32 + var7Lifetime3Lifetime1) &&
                  !(var8Lifetime4 > ll.field_y) &&
                  !(ll.field_y > var8Lifetime4 + 32) &&
                  -1 == ua.field_a) {
                  this.a(-228 + this.field_g, 16741888, lj.field_b[var11], 400, 21641);
                  var10Lifetime3Lifetime1 = 0;
                  if ((1 << var11 & var9Lifetime3) != 0) {
                    this.a(od.field_f.field_s + this.field_g - 228, 16741888, oh.field_f, 400, 21641);
                  } else {
                    this.a(od.field_f.field_s + (-228 + this.field_g), 16711680, b.field_c, 400, 21641);
                  }
                  var14Lifetime1 = this.field_g + (-228 + 4 * od.field_f.field_s / 2);
                  if ((var9Lifetime3 & 1 << var11) == 0) {
                    cf.field_c.a(112, -36 + (1 + var14Lifetime1));
                  } else {
                    ug.field_h[var11].a(112, 1 + (var14Lifetime1 - 36));
                  }
                  var15 = 0;
                  if (ud.field_a == 3) {
                    var15 += 20;
                  }
                  var14Lifetime1 = var14Lifetime1 + 20 * this.a(240 - var15 + 30, 8840959, 480, 1, bb.field_a[var11], var14Lifetime1, 0, -300 + (560 + var15 * 2), 20066, 20);
                  var14Lifetime1 += 10;
                  var14Lifetime1 = var14Lifetime1 + this.a(270, 8840959, 480, 1, jf.a(jf.field_g, new String[]{Integer.toString(bf.field_j[var11])}, (byte) -126), var14Lifetime1, 0, 260, 20066, 20) * 20;
                  var14Lifetime1 = var14Lifetime1 + this.a(270, 8840959, 480, 1, jf.a(ha.field_m, new String[]{Integer.toString(jg.field_A[var11])}, (byte) -126), var14Lifetime1, 0, 260, 20066, 20) * 20;
                }
                var7Lifetime3Lifetime1 += 40;
              }
            }
          }
          if (var10Lifetime3Lifetime1 != 0) {
            var11 = -228 + this.field_g;
            var11 = var11 + od.field_f.field_s;
            if (ud.field_a == 0) {
              this.a(var11, 16741888, pd.field_b, 320, param1 ^ 16720521);
            } else {
              od.field_f.a(pd.field_b, 128, var11, 384, 256, 16741888, -1, 1, 0, 20);
            }
            if (jh.b(767564065)) {
              var11 += 40;
            }
          }
        }
    }

    final boolean a(boolean param0, byte param1) {
        boolean stackIn_29_0 = false;
        int stackIn_65_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_78_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_86_1 = 0;
        boolean stackIn_93_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var3 = od.field_f.b(this.field_f) + 32;
        if (this.field_i == 11) {
          var3 = 512;
        }
        if (this.field_i == 5 ||
          this.field_i == 6) {
          var3 = 270;
        }
        var4 = this.field_l;
        if (!param0) {
          var4 = -40;
          if (this.field_i < 0) {
            var4 -= 320;
          }
        }
        if (var4 > this.field_g) {
          this.field_d = this.field_d + 2.0;
        }
        if (this.field_g > var4) {
          this.field_d = this.field_d - 2.0;
        }
        this.field_d = 9.0 * this.field_d / 10.0;
        if (0.5 > Math.abs(this.field_d)) {
          this.field_d = 0.0;
        }
        if (param1 != -72) {
          field_b = (int[]) null;
        }
        if (0.0 > this.field_d) {
          this.field_d = this.field_d + 0.5;
        }
        if (0.0 < this.field_d) {
          this.field_d = this.field_d - 0.5;
        }
        this.field_g = (int)((double)this.field_g + this.field_d);
        if (!param0) {
          stackIn_29_0 = !(-10 >= this.field_g);
          return stackIn_29_0;
        }
        if (this.field_i >= 0) {
          if (this.field_k.field_o &&
            n.field_m == 0) {
            this.field_j = false;
          }
          if (uc.field_C > 320 - var3 / 2 &&
            uc.field_C < 320 + var3 / 2 &&
            -od.field_f.field_s + this.field_g < ll.field_y &&
            this.field_g > ll.field_y &&
            n.field_m == 0 &&
            this.field_k.field_o) {
            this.field_k.field_n = this.field_m;
            this.field_j = true;
          }
        }
        if (12 == this.field_i ||
          this.field_i == 10 ||
          this.field_i == 13) {
          var5 = od.field_f.b(this.field_f);
          var6 = 320 - var5 / 2;
          var7 = this.field_g - od.field_f.field_s;
          var8 = var5;
          var9 = od.field_f.field_s;
          if (var6 <= uc.field_C &&
            uc.field_C < var6 + var8 &&
            ll.field_y >= var7 &&
            ll.field_y < var7 + var9 &&
            this.field_k.field_o &&
            n.field_m == 0) {
            this.field_j = true;
            this.field_k.field_n = this.field_m;
          }
        }
        boolean decompiledFrameRemainder2 = true;
        if (param0 &&
          this.field_j) {
          if (this.field_i != 5 &&
            this.field_i != 6) {
            if ((vh.field_e == 1)) {
              this.a(0, (byte) 114, true);
            }
            decompiledFrameRemainder2 = false;
          }
          else {
            if (n.field_m == 1) {
              boolean decompiledFrameRemainder1 = true;
              boolean decompiledFrameRemainder0 = true;
              stackIn_65_0 = 0;
              if (this.field_i == 5) {
                decompiledFrameRemainder0 = !(wd.field_x);
              } else {
                decompiledFrameRemainder0 = !(rd.field_a);
              }
              if (decompiledFrameRemainder0) {
                stackIn_68_1 = 1;
                decompiledFrameRemainder1 = false;
              }
              if (decompiledFrameRemainder1) {
                stackIn_68_1 = 0;
              }
              if (stackIn_65_0 != stackIn_68_1) {
                this.a(0, (byte) 104, true);
              }
              stackIn_73_0 = -320 + (uc.field_C + 33);
              if (this.field_i != 5) {
                stackIn_74_1 = jd.field_a;
              } else {
                stackIn_74_1 = md.field_w;
              }
              if (stackIn_73_0 < stackIn_74_1 / 2) {
                if (this.field_i == 5) {
                  stackIn_78_1 = md.field_w;
                } else {
                  stackIn_78_1 = jd.field_a;
                }
                this.a(-(stackIn_78_1 / 2) + (35 + uc.field_C) - 322, (byte) -51, true);
              }
              stackIn_81_0 = uc.field_C - 320 + 33;
              if (this.field_i != 5) {
                stackIn_82_1 = jd.field_a;
              } else {
                stackIn_82_1 = md.field_w;
              }
              if (stackIn_81_0 > stackIn_82_1 / 2) {
                if (this.field_i == 5) {
                  stackIn_86_1 = md.field_w;
                } else {
                  stackIn_86_1 = jd.field_a;
                }
                this.a(-(stackIn_86_1 / 2) + (2 + (-320 + uc.field_C)) + 35, (byte) 84, true);
              }
            }
          }
        }
        stackIn_93_0 = !(this.field_g <= -10);
        return stackIn_93_0;
    }

    public static void a(int param0) {
        if (param0 >= -68) {
          return;
        }
        field_b = null;
        field_a = null;
        field_h = null;
        field_e = null;
    }

    nk(int param0, int param1, String param2, int param3, mj param4) {
        try {
          this.field_k = param4;
          this.field_i = param3;
          this.field_f = param2;
          param1 += 128;
          this.field_g = -100;
          this.field_l = param1;
          this.field_d = (double)(-(480 - param1)) / 10.0;
          this.field_m = param0;
          this.field_j = false;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "nk.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[8192];
        field_e = "Suggested names: ";
    }
}
