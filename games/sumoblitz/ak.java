/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ak {
    private er field_g;
    private int field_c;
    static int field_f;
    private int field_h;
    private int field_d;
    private int field_e;
    static jn field_b;
    static hr[] field_a;

    private final void a(boolean param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        Object stackIn_57_0;
        int stackIn_57_1;
        int stackIn_57_2;
        int stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_59_6;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        int stackIn_77_0 = 0;
        int stackIn_127_6;
        Object stackIn_128_0;
        int stackIn_128_1;
        int stackIn_128_2;
        int stackIn_128_3;
        int stackIn_128_4;
        int stackIn_128_5;
        int stackIn_150_0 = 0;
        int stackIn_150_1 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        boolean[] var10 = null;
        boolean[] var11 = null;
        boolean[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        int var20_int = 0;
        int var21 = 0;
        ha var22 = null;
        String var17_ref_StringLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var13Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var18Lifetime2;
        int var19Lifetime2;
        int var8Lifetime2Lifetime1;
        int var8Lifetime2Lifetime2;
        int var8Lifetime2Lifetime3;
        int var13Lifetime1Lifetime1;
        int var13Lifetime1Lifetime2;
        int var13Lifetime1Lifetime3;
        var21 = Sumoblitz.field_L ? 1 : 0;
        var22 = nq.field_h.a(-106);
        var5 = 16777215 | param2 << 24;
        var6 = 16777215 | param2 << 23;
        var7 = param2 << 24;
        var8 = 53;
        var9 = gd.field_o;
        if (param0) {
          var9 = sd.field_b;
        }
        var10 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
        var11 = new boolean[]{false, false, false, true, true, false, false, false, false, true, true, true, false, true, false, true, false, false, false, false, true, true, false, true, true, false, true, false};
        var12 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, true};
        wo.a(up.field_c, 380, -5, param2 << 24, 3, var22, 650, 55, 1, true);
        var8Lifetime1 = 35;
        if (param1 >= -56) {
          return;
        }
        this.a(var9, param2, 29228);
        var13 = 117;
        if (!param0) {
          stackIn_7_0 = kh.field_e;
        } else {
          stackIn_7_0 = wj.field_e;
        }
        var14 = stackIn_7_0;
        var15 = -1;
        var16 = 0;
        var17 = 0;
        L3: while (true) {
          boolean decompiledFrameRemainder1 = true;
          if (var17 < 28) {
            stackIn_150_0 = -1;
            stackIn_150_1 = ~var16;
            if (var21 != 0) {
              if (stackIn_150_0 > stackIn_150_1) {
                stackIn_67_0 = ~var16;
                stackIn_67_1 = -1;
                break L3;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (stackIn_150_0 != stackIn_150_1 &&
                var16 % 9 == 0) {
                var13 += 64;
                var8Lifetime1 = 35;
              }
              if ((var14 & 1 << var17) != 0 ||
                !param0 ||
                var21 != 0) {
                var18 = var8Lifetime1;
                var19 = var13;
                if (var18 <= ko.field_p &&
                  (var18 + 48) >= ko.field_p &&
                  pi.field_e >= var19 &&
                  pi.field_e <= var19 + 48 && (!var12[var17] ||
                  (var14 & 1 << var17) != 0)) {
                  var15 = var17;
                }
                if (~var17 != ~this.field_c) {
                }
                if (!var12[var17] ||
                  0 != (1 << var17 & var14)) {
                  var8Lifetime1 += 65;
                  var16++;
                }
              }
              var17++;
              continue;
            }
          }
          if (decompiledFrameRemainder1) {
            var13 = 117;
            var16 = 0;
            var8Lifetime1 = 35;
            var17 = 0;
            while (28 > var17) {
              stackIn_67_0 = ~var16;
              stackIn_67_1 = -1;
              if (var21 != 0) {
                break L3;
              }
              if (stackIn_67_0 != stackIn_67_1 &&
                var16 % 9 == 0) {
                var8Lifetime1 = 35;
                var13 += 64;
              }
              boolean decompiledFrameRemainder0 = true;
              var18Lifetime2 = var8Lifetime1;
              var19Lifetime2 = var13;
              var20 = null;
              if ((var14 & 1 << var17) == 0) {
                decompiledFrameRemainder0 = (!(param0) ||
                  var21 != 0);
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder0 = !(var12[var17]))) {
                  if (ct.field_x <= 0 &&
                    var10[var17]) {
                    var20 = uj.field_a;
                  } else {
                    var20 = pi.field_d;
                  }
                }
              } else {
                if (qw.field_a.length > var17) {
                  var20 = qw.field_a[var17];
                }
              }
              if (decompiledFrameRemainder0) {
                if (var20 != null) {
                  if (~var17 == ~var15) {
                    ((hr) (var20)).a(var18Lifetime2, var19Lifetime2, 48, 48, 0, var5, 1);
                  } else {
                    stackIn_57_0 = var20;
                    stackIn_57_1 = var18Lifetime2;
                    stackIn_57_2 = var19Lifetime2;
                    stackIn_57_3 = 48;
                    stackIn_57_4 = 48;
                    stackIn_57_5 = 0;
                    if (var15 == -1 &&
                      this.field_c == -1) {
                      stackIn_59_6 = var5;
                    } else {
                      stackIn_59_6 = var6;
                    }
                    ((hr) stackIn_57_0).a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_59_6, 1);
                  }
                }
                if (var12.length > var17 && (!var12[var17] ||
                  (1 << var17 & var14) != 0)) {
                  var16++;
                  var8Lifetime1 += 65;
                }
              }
              var17++;
            }
          }
          stackIn_67_0 = ~this.field_c;
          stackIn_67_1 = -1;
          break;
        }
        if (stackIn_67_0 <= stackIn_67_1) {
          var15 = this.field_c;
        }
        if (var15 == -1) {
          gt.field_db.a(hk.field_b, param2 << 24 | 5023231, -1, 348, 320, 0);
          bq.field_c.a(hk.field_b, var5, -1, 348, 320, 0);
          if (vs.b((byte) 9)) {
            gt.field_db.a(tj.field_o, var5, -1, 64 + (g.field_a.field_i * 3 + 200), 320, 0);
            bq.field_c.a(tj.field_o, var5, -1, 32 + (g.field_a.field_i * 3 + 200 + 32), 320, 0);
          }
        } else {
          wo.a(hf.field_H, 160, 140, param2 << 24, 3, var22, 360, 160, 1, true);
          var8Lifetime2 = 390;
          var13Lifetime1 = 310;
          var17_ref_String = Integer.toString(sl.field_c[var15] * 100);
          if (var11[var15] &&
            (1 << var15 & var14) == 0) {
            var17_ref_String = uu.field_s;
          }
          gt.field_db.a(pe.field_D + ": " + var17_ref_String, param2 << 24 | 5023231, var7, var13Lifetime1, var8Lifetime2, 0);
          bq.field_c.a(pe.field_D + ": " + var17_ref_String, var5, var7, var13Lifetime1, var8Lifetime2, 0);
          var13Lifetime1Lifetime1 = 280;
          var8Lifetime2Lifetime1 = 490;
          stackIn_77_0 = ((1 << var15 & var14) == 0) ? 0 : 1;
          var18Lifetime1 = stackIn_77_0;
          var8Lifetime2Lifetime2 = 390;
          var13Lifetime1Lifetime2 = 210;
          if (var18Lifetime1 == 0) {
            gt.field_db.a(gi.field_f, param2 << 24 | 5023231, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
            bq.field_c.a(gi.field_f, 16720452 | param2 << 24, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
          }
          if (var18Lifetime1 != 0 ||
            var21 != 0) {
            gt.field_db.a(ab.field_e, 5023231 | param2 << 24, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
            bq.field_c.a(ab.field_e, param2 << 24 | 2293572, var7, var13Lifetime1Lifetime2, var8Lifetime2Lifetime2, 0);
          }
          var13Lifetime1Lifetime2 += 10;
          var8Lifetime2Lifetime2 -= 10;
          var19Lifetime1 = 160;
          var17_ref_StringLifetime1 = jh.field_K[var15];
          if (var11[var15] &&
            (var14 & 1 << var15) == 0) {
            var17_ref_StringLifetime1 = jf.field_b;
          }
          gt.field_db.a(480, 5023231 | param2 << 24, 0, var19Lifetime1 + 20, -(var19Lifetime1 / 2) + var8Lifetime2Lifetime2, (int[]) null, (hr[]) null, 8 + var13Lifetime1Lifetime2, var7, 0, g.field_a.field_i, -8787, var17_ref_StringLifetime1, (aa) null, 1, 0);
          bq.field_c.a(480, var5, 0, 20 + var19Lifetime1, -(var19Lifetime1 / 2) + var8Lifetime2Lifetime2, (int[]) null, (hr[]) null, var13Lifetime1Lifetime2 + 8, var7, 0, g.field_a.field_i, -8787, var17_ref_StringLifetime1, (aa) null, 1, 0);
          var8Lifetime2Lifetime3 = 390;
          var13Lifetime1Lifetime3 = 190;
          qv.field_k.a(rb.field_d[var15], param2 << 24 | 5023231, var7, var13Lifetime1Lifetime3, var8Lifetime2Lifetime3, 0);
          uq.field_a.a(rb.field_d[var15], var5, var7, var13Lifetime1Lifetime3, var8Lifetime2Lifetime3, 0);
          var20_int = 200;
          if (var18Lifetime1 != 0) {
            qw.field_a[var15].a(160, -30 + var20_int, 0, var5, 1);
            if (var21 != 0) {
              if (!(ct.field_x <= 0) ||
                !var10[var15]) {
                pi.field_d.a(160, -30 + var20_int, 0, var5, 1);
                uj.field_a.a(160, var20_int - 30, 0, var5, 1);
              } else {
                uj.field_a.a(160, var20_int - 30, 0, var5, 1);
              }
            }
          } else {
            if (!(ct.field_x <= 0) ||
              !var10[var15]) {
              pi.field_d.a(160, -30 + var20_int, 0, var5, 1);
              if (var21 != 0) {
                uj.field_a.a(160, var20_int - 30, 0, var5, 1);
              }
            } else {
              uj.field_a.a(160, var20_int - 30, 0, var5, 1);
            }
          }
          var20_int = var20_int + g.field_a.field_i;
        }
        return;
    }

    private final void a(int param0, boolean param1) {
        boolean stackIn_12_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Sumoblitz.field_L ? 1 : 0;
        var3 = 53;
        var4 = 130;
        var5 = 0;
        while (true) {
          if (!(var5 < mb.field_i.length)) {
            var5 = 5;
            stackIn_12_0 = param1;
            break;
          }
          stackIn_12_0 = mb.field_i[var5].startsWith("<b>");
          if (var6 == 0) {
            if (stackIn_12_0) {
              qv.field_k.a(var4, var3, 5023231 | param0 << 24, mb.field_i[var5], (byte) -11, 0);
              uq.field_a.a(var4, var3, 16777215 | param0 << 24, mb.field_i[var5], (byte) -37, 0);
            } else {
              gt.field_db.a(100, param0 << 24 | 5023231, 0, 520, var3, (int[]) null, (hr[]) null, var4, -1, 0, 0, -8787, mb.field_i[var5], (aa) null, 0, 1);
              bq.field_c.a(100, 16777215 | param0 << 24, 0, 520, var3, (int[]) null, (hr[]) null, var4, -1, 0, 0, -8787, mb.field_i[var5], (aa) null, 0, 1);
            }
            if (var5 >= 1) {
              var4 += 50;
            }
            var5++;
            continue;
          }
          break;
        }
        if (!stackIn_12_0) {
          this.a(28, false);
        }
        while (mb.field_a.length > var5) {
          gt.field_db.a(100, 5023231 | param0 << 24, 0, 520, var3, (int[]) null, (hr[]) null, var4, -1, 0, 0, -8787, mb.field_a[var5], (aa) null, 0, 1);
          bq.field_c.a(100, param0 << 24 | 16777215, 0, 520, var3, (int[]) null, (hr[]) null, var4, -1, 0, 0, -8787, mb.field_a[var5], (aa) null, 0, 1);
          if (var6 == 0) {
            if (var5 >= 1) {
              var4 += 50;
            }
            var5++;
            continue;
          }
          break;
        }
        return;
    }

    private final void a(boolean param0, int param1, int param2, ha param3, int param4) {
        int discarded$0 = 0;
        boolean discarded$1 = false;
        String stackIn_30_0 = null;
        int stackIn_44_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        da var13_ref = null;
        Object var14 = null;
        da var14_ref = null;
        Object var15 = null;
        ta var15_ref = null;
        int var16 = 0;
        int var17 = 0;
        String var18_ref_String = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var18_ref_StringLifetime1;
        String var18_ref_StringLifetime2;
        var21 = Sumoblitz.field_L ? 1 : 0;
        try {
          var6_int = this.g(param1, 108);
          var7 = this.b(param1, 50);
          discarded$0 = this.f(-116, param1);
          var8 = kd.field_a[this.field_h][param1];
          var9 = fn.field_u[var8].toUpperCase();
          if (var9 == null) {
            var9 = "ERROR: missing text";
          }
          if (29 == var8 &&
            bl.field_e == -1) {
            param0 = false;
          }
          var10 = this.f(101, param1) - var7;
          var11 = this.c(8, param1);
          if (param0) {
            if (hk.field_c != 1 &&
              !hw.field_b[84]) {
              wo.a(jn.field_c, var11 << 1, var7, param4 << 24, 1, param3, var10, var6_int - var11 + 10, 1, true);
              if (var21 != 0) {
                wo.a(ok.field_j, var11 << 1, var7, param4 << 24, 1, param3, var10, -var11 + (var6_int + 10), 1, true);
                wo.a(vv.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
              }
            } else {
              wo.a(ok.field_j, var11 << 1, var7, param4 << 24, 1, param3, var10, -var11 + (var6_int + 10), 1, true);
              if (var21 != 0) {
                wo.a(vv.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
              }
            }
          } else {
            wo.a(vv.field_a, var11 << 1, var7, param4 << 24, 1, param3, var10, 10 + (var6_int - var11), 1, true);
          }
          var12 = 16777215 | param4 << 24;
          var13 = null;
          var14 = null;
          var15 = null;
          var16 = 0;
          if (this.field_h == 0 &&
            param1 < 2) {
            var14_ref = be.field_t;
            var15_ref = ma.field_b;
            var13_ref = hc.field_e;
          } else {
            var13_ref = uq.field_a;
            var14_ref = qv.field_k;
            var15_ref = qr.field_a;
            var16 = 11;
          }
          if (param2 >= -85) {
            discarded$1 = this.e(-39, -98);
          }
          var17 = -16;
          if (var8 != 12 &&
            var8 != 13) {
            if (var8 != 25) {
              if (var8 != 27) {
                if (var8 == 33) {
                  if (!gt.field_bb) {
                    stackIn_30_0 = mm.field_d;
                  } else {
                    stackIn_30_0 = wp.field_A;
                  }
                  var22 = stackIn_30_0;
                  var18_ref_String = var22;
                  var18_ref_String = var22.toUpperCase();
                  var14_ref.a(var18_ref_String, 5023231 | param4 << 24, -1, var16 + (var6_int + var15_ref.field_i) + var17, -4 + ((var10 >> 1) + var7), 0);
                  var13_ref.a(var18_ref_String, var12, -1, var16 + var17 + (var6_int + var15_ref.field_i), (var10 >> 1) + var7 - 4, 0);
                  if (var21 == 0) {
                    return;
                  }
                }
                if (17 == var8 ||
                  18 == var8) {
                  var9 = var9.toLowerCase();
                }
                var14_ref.a(var9, param4 << 24 | 5023231, -1, var15_ref.field_i + var6_int + (var17 + var16), -4 + (var7 + (var10 >> 1)), 0);
                var13_ref.a(var9, var12, -1, var16 + var6_int - (-var15_ref.field_i - var17), (var10 >> 1) + (var7 - 4), 0);
                if (29 != var8) {
                  return;
                }
                if (bl.field_e != -1) {
                  return;
                }
                wo.a(hf.field_H, var11 + 8, 9 + var7, param4, 1, param3, var10 - 18, 22 + var6_int - var11, 1, true);
                if (var21 == 0) {
                  return;
                }
              }
              var23 = ni.field_g + dt.field_i[ul.field_f];
              var18_ref_StringLifetime2 = var23.toUpperCase();
              var14_ref.a(var18_ref_StringLifetime2, 5023231 | param4 << 24, -1, var6_int - (-var15_ref.field_i - var17) + var16, (var10 >> 1) + (var7 - 4), 0);
              var13_ref.a(var18_ref_StringLifetime2, var12, -1, var16 + (var6_int + var15_ref.field_i) + var17, -4 + (var10 >> 1) + var7, 0);
              if (var21 == 0) {
                return;
              }
            }
            var24 = ea.field_b + ge.field_k[mi.field_a];
            var18_ref_StringLifetime1 = var24.toUpperCase();
            var14_ref.a(var18_ref_StringLifetime1, param4 << 24 | 5023231, -1, var16 + (var17 + (var15_ref.field_i + var6_int)), (var10 >> 1) + (var7 - 4), 0);
            var13_ref.a(var18_ref_StringLifetime1, var12, -1, var17 + var6_int + (var15_ref.field_i + var16), -4 + (var7 + (var10 >> 1)), 0);
            if (var21 == 0) {
              return;
            }
          }
          var7 -= 8;
          var18 = 9 + t.field_q + 128;
          var19 = -(t.field_q >> 2) + ((var10 - var18 >> 1) + var7);
          var14_ref.a(-1, -24 + (var10 >> 1) + var7, var9.toUpperCase(), var16 + (var17 + var15_ref.field_i + var6_int), param4 << 24 | 5023231, 115);
          var13_ref.a(-1, -24 + var7 + (var10 >> 1), var9.toUpperCase(), var6_int + var15_ref.field_i - (-var17 - var16), var12, 127);
          var19 = var19 + (16 + t.field_q);
          vm.field_a[1].a((float)(8 + (-2 + var19)), (float)(-2 + (var6_int + 3) + 10), 4096, 0, 1, 0, 2);
          vm.field_a[2].a((float)(vm.field_a[1].b() + (-2 + var19) + 8), (float)(var6_int + 3 - 2 + 10), 4096, 0, 1, 0, 2);
          vm.field_a[2].a((float)(vm.field_a[1].b() * 2 - 2 - 2 + (var19 + 10)), (float)(-2 + (var6_int + 3 + 10)), 4096, 0, 1, 0, 2);
          vm.field_a[2].a((float)(vm.field_a[1].b() * 3 - 2 + var19 - 2 + 10), (float)(10 + (3 + var6_int) - 2), 4096, 0, 1, 0, 2);
          vm.field_a[3].a((float)(-2 + var19 - 2 + 10 + 4 * vm.field_a[1].b()), (float)(3 + var6_int + 8), 4096, 0, 1, 0, 2);
          if (var8 != 12) {
            stackIn_44_0 = tt.field_l;
          } else {
            stackIn_44_0 = kr.field_c;
          }
          var20 = stackIn_44_0;
          vm.field_a[0].a((float)(10 + (var19 + (var20 >> 1) - 2) - 2), (float)(10 + (var6_int + 1)), 4096, 0, 1, 0, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_48_0 = var6;
          stackIn_48_1 = new StringBuilder().append("ak.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int g(int param0, int param1) {
        if (this.field_h == 2 &&
          !vs.b((byte) 9)) {
          if (param0 >= 5) {
            return -6 + (pj.field_k[this.field_h] + rh.field_s[this.field_h]);
          }
          return -6 + pj.field_k[this.field_h];
        }
        if (this.field_h == 2 &&
          vs.b((byte) 9)) {
          return pj.field_k[this.field_h] - (-(param0 * rh.field_s[this.field_h]) + 6);
        }
        if (this.field_h != 3 &&
          this.field_h != 4 &&
          this.field_h != 5) {
          if (this.field_h != 9 &&
            this.field_h != 7 &&
            this.field_h != 10 &&
            this.field_h != 11) {
            if (5 == this.field_h) {
              if (kd.field_a[this.field_h].length > 1) {
                return 382;
              }
              return 430 + param0 * rh.field_s[this.field_h] - 4;
            }
            if (this.field_h != 0) {
              if (param1 <= 79) {
                this.field_h = 83;
              }
              return rh.field_s[this.field_h] * param0 + pj.field_k[this.field_h];
            }
            if (param0 < 2) {
              return param0 * (int)((double)rh.field_s[this.field_h] * 2.0) + pj.field_k[this.field_h] + 28;
            }
            if (param0 > 1 &&
              param0 < 4) {
              return rh.field_s[this.field_h] * 2 + pj.field_k[this.field_h] + 100;
            }
            if (param0 == 6) {
              return (-1 + param0) * rh.field_s[this.field_h] + pj.field_k[this.field_h] + 100;
            }
            if (4 <= param0) {
              return pj.field_k[this.field_h] + 100 + rh.field_s[this.field_h] * (-1 + param0);
            }
            return rh.field_s[this.field_h] * param0 + pj.field_k[this.field_h] + 128;
          }
          return pj.field_k[this.field_h];
        }
        return pj.field_k[this.field_h] - 32;
    }

    private final void a(byte param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 122) {
          return;
        }
        if (this.field_h == 2 &&
          !vs.b((byte) 9)) {
          if (tg.field_a == 96) {
            if (0 < this.field_g.field_g) {
              if (3 != this.field_g.field_g) {
                this.field_g.a(-31865, this.field_g.field_g - 1);
                if (var3 != 0) {
                  this.field_g.a(-31865, 2);
                }
              }
            } else {
              this.field_g.a(-31865, 2);
            }
          }
          if (tg.field_a == 97) {
            if (this.field_g.field_g >= 2) {
              if (this.field_g.field_g == 2) {
                this.field_g.a(-31865, 0);
                if (var3 != 0) {
                  this.field_g.a(-31865, 1 + this.field_g.field_g);
                }
              }
            } else {
              this.field_g.a(-31865, 1 + this.field_g.field_g);
            }
          }
          if (tg.field_a == 99) {
            if (!(this.field_g.field_g >= 0) ||
              !(this.field_g.field_g <= 2)) {
              this.field_g.a(-31865, gu.field_j);
              if (var3 != 0) {
                this.field_g.a(-31865, 3);
              }
            } else {
              this.field_g.a(-31865, 3);
            }
          }
          if (tg.field_a == 98) {
            if (this.field_g.field_g == 3) {
              this.field_g.a(-31865, gu.field_j);
              if (var3 != 0) {
                this.field_g.a(-31865, 3);
              }
            } else {
              this.field_g.a(-31865, 3);
            }
          }
          this.field_g.f(-22);
          return;
        }
        if (this.field_h == 3) {
          this.field_g.a(-20);
          if (tg.field_a != 96 &&
            97 != tg.field_a) {
            return;
          }
          while (!this.e(this.field_g.field_g, 7746)) {
            this.field_g.a(-125);
            if (var3 == 0) {
              continue;
            }
            break;
          }
          return;
        }
        this.field_g.a((byte) 95);
        if (tg.field_a == 98 ||
          tg.field_a == 99) {
          while (!this.e(this.field_g.field_g, 7746)) {
            this.field_g.a((byte) 38);
            if (var3 != 0) {
              break;
            }
          }
        }

    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int stackIn_19_0 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        if (param1 <= 28) {
          this.b(-8, true);
        }
        var4 = 0;
        while (kd.field_a[this.field_h].length > var4) {
          var5 = this.g(var4, 111);
          var6 = this.c(8, var4);
          stackIn_19_0 = 0;
          if (var7 != 0) {
            return stackIn_19_0;
          }
          if (stackIn_19_0 == this.field_h &&
            2 > var4 ||
            this.field_h == 11) {
            var5 -= 28;
            var6 += 28;
          }
          if (this.e(var4, 7746) &&
            param0 >= this.b(var4, 65) &&
            this.f(-115, var4) > param0 &&
            var5 <= param2 &&
            (var5 + var6) > param2) {
            return var4;
          }
          var4++;
        }
        return -1;
    }

    final void b(int param0, boolean param1) {
        if (param0 != -8628) {
          return;
        }
        int var3 = 0;
        if (this.field_h == 0 &&
          this.field_g.field_g != -1) {
          var3 = this.field_g.field_g;
        }
        if (this.field_h == 1 && this.field_g.field_g != -1 &&
          nj.field_b != -1) {
          var3 = this.field_g.field_g;
        }
        if (this.field_h == 3) {
          var3 = 2;
        }
        this.field_g.a(param1, -123, this.a(ko.field_p, (byte) 41, pi.field_e), var3);
        this.field_c = -1;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 53;
        int var4 = 480;
        int var5 = 130;
        qv.field_k.a(var5, var3, 5023231 | param1 << 24, mb.field_d[0], (byte) -37, 0);
        uq.field_a.a(var5, var3, 16777215 | param1 << 24, mb.field_d[0], (byte) -8, 0);
        var5 += 30;
        dc.field_ab[0].a((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        dc.field_ab[1].a((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        gt.field_db.a(var5, 60 + var3, param1 << 24 | 5023231, mb.field_d[1], (byte) -120, 0);
        bq.field_c.a(var5, 60 + var3, 5023231 | param1 << 24, mb.field_d[1], (byte) -56, 0);
        gt.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[2], (aa) null, 0, 0);
        bq.field_c.a(100, 16777215 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[2], (aa) null, 0, 0);
        var5 += 70;
        s.field_n[0].a((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        s.field_n[1].a((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        gt.field_db.a(var5, var3 + 60, param1 << 24 | 5023231, mb.field_d[3], (byte) -110, 0);
        bq.field_c.a(var5, 60 + var3, param1 << 24 | 5023231, mb.field_d[3], (byte) -117, 0);
        gt.field_db.a(100, param1 << 24 | 5023231, 0, var4, 60 + var3, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[4], (aa) null, 0, 0);
        bq.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[4], (aa) null, 0, 0);
        var5 += 70;
        hv.field_d[0].a((float)(var3 + 30), (float)(10 + var5), 4096, 0, 1, 0, 2);
        hv.field_d[1].a((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        if (!param0) {
          this.b(-98, false);
        }
        gt.field_db.a(var5, 60 + var3, param1 << 24 | 5023231, mb.field_d[5], (byte) -92, 0);
        bq.field_c.a(var5, var3 + 60, 5023231 | param1 << 24, mb.field_d[5], (byte) -59, 0);
        gt.field_db.a(100, 5023231 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[6], (aa) null, 0, 0);
        bq.field_c.a(100, 16777215 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_d[6], (aa) null, 0, 0);
    }

    private final void a(boolean param0, byte param1, int param2) {
        int stackIn_247_0 = 0;
        int stackIn_248_1 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var4 = kd.field_a[this.field_h][param2];
        if (this.field_g.d(-31260)) {
          if (var4 != 5) {
            gn.a(16, true);
            if (var9 != 0) {
              gn.a(15, true);
              if (var4 != this.field_d &&
                kd.field_a[this.field_h].length != 1) {
                this.field_d = var4;
                gn.a(17, true);
              }
            }
          } else {
            gn.a(15, true);
            if ((var9 != 0) && (var4 != this.field_d &&
              kd.field_a[this.field_h].length != 1)) {
              this.field_d = var4;
              gn.a(17, true);
            }
          }
        } else {
          if (var4 != this.field_d &&
            kd.field_a[this.field_h].length != 1) {
            this.field_d = var4;
            gn.a(17, true);
          }
        }
        L3: {
          L4: {
            var6 = var4;
            if (0 == var6 &&
              var9 == 0) {
              if (!(!this.field_g.d(-31260))) {
                av.a(-7753, param0, 7);
                ut.field_j = this.field_h;
              }
              break L4;
            } else {
              if (var6 != 22) {
                switch ((var9 == 0
                  || var6 == 1
                  || var6 == 3
                  || var6 == 6
                  || var6 == 7
                  || var6 == 9
                  || var6 == 11
                  || var6 == 15
                  || var6 == 17
                  || var6 == 18
                  || var6 == 19
                  || var6 == 20
                  || var6 == 21
                  || var6 == 25
                  || var6 == 29
                  ) ? var6 : -1) {
                  case 25:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    mi.field_a = mi.field_a + 1;
                    if (mi.field_a <= 1) {
                      break L4;
                    }
                    mi.field_a = 0;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 27:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    ul.field_f = ul.field_f + 1;
                    if (1 >= ul.field_f) {
                      break L4;
                    }
                    ul.field_f = 0;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 19:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, -1);
                    ut.field_j = this.field_h;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 23:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    ph.field_b.b((byte) -120);
                    av.a(-7753, param0, -1);
                    ut.field_j = this.field_h;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 1:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, -1);
                    ph.field_b.c((byte) 112);
                    ut.field_j = 0;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 28:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    {
                      qc.a(param0, true, false);
                      av.a(-7753, param0, -1);
                      if (gt.field_bb) {
                        ph.field_b.b((byte) -120);
                        if (var9 != 0) {
                          ph.field_b.a(oh.field_e, false, false);
                        }
                      } else {
                        ph.field_b.a(oh.field_e, false, false);
                      }
                    }
                    ld.field_C = oh.field_e;
                    te.field_c = 0;
                    ph.field_b.c((byte) 112);
                    ut.field_j = 0;
                    pk.d((byte) -60);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 31:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    ih.a(-125);
                    av.a(-7753, param0, -1);
                    qb.d(10);
                    gg.a((byte) 104);
                    ph.field_b.c((byte) 112);
                    pk.d((byte) -117);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 32:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    {
                      ph.field_b.a(70);
                      qc.a(param0, true, false);
                      if (vs.b((byte) 9)) {
                        if (0 < te.field_c) {
                          av.a(-7753, param0, 6);
                          if (var9 != 0) {
                            av.a(-7753, true, 7);
                          }
                        } else {
                          av.a(-7753, true, 7);
                        }
                        ut.field_j = 0;
                        if (var9 != 0) {
                          av.a(-7753, true, 7);
                        }
                      } else {
                        av.a(-7753, true, 7);
                      }
                    }
                    ag.a(0, 0);
                    ut.field_j = 0;
                    pk.d((byte) -107);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 33:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    L62: {
                      qc.a(param0, true, false);
                      if (!vs.b((byte) 9)) {
                        if (!gt.field_bb) {
                          av.a(-7753, true, 7);
                          if (var9 == 0) {
                            break L62;
                          }
                        }
                        av.a(-7753, true, 0);
                        if (var9 == 0) {
                          break L62;
                        }
                      }
                      if (te.field_c > 0) {
                        av.a(-7753, param0, 6);
                        if (var9 != 0) {
                          if (!gt.field_bb) {
                            av.a(-7753, true, 7);
                            av.a(-7753, true, 0);
                          } else {
                            av.a(-7753, true, 0);
                          }
                        }
                      } else {
                        if (!gt.field_bb) {
                          av.a(-7753, true, 7);
                          if (var9 != 0) {
                            av.a(-7753, true, 0);
                          }
                        } else {
                          av.a(-7753, true, 0);
                        }
                      }
                      ut.field_j = 0;
                    }
                    ut.field_j = 0;
                    ag.a(0, 0);
                    pk.d((byte) -52);
                    ph.field_b.a(111);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 26:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    hg.field_o.a(5295);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 29:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (bl.field_e <= -1) {
                      break L4;
                    }
                    pu.a((byte) -33);
                    av.a(-7753, param0, 9);
                    ut.field_j = 7;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 30:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    pk.d((byte) -32);
                    tt.a(30692);
                    av.a(-7753, param0, ut.field_j);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 5:
                    var5 = 0;
                    if (~vl.field_a != ~var5) {
                      lc.a((byte) 100, true, false, 4, 2, nt.field_m[var5]);
                    }
                    vl.field_a = var5;
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, 0);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 16:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, 0);
                    ll.a(17534);
                    wj.field_e = 0;
                    kh.field_e = 0;
                    pn.field_q.e(115);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 14:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, 4);
                    ut.field_j = this.field_h;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 3:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    fl.field_n = 0;
                    av.a(-7753, param0, 3);
                    ut.field_j = this.field_h;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 6:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, ut.field_j);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 24:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, 8);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 2:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    av.a(-7753, param0, 2);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 12:
                    if (this.field_g.c(-103)) {
                      lt.c((byte) 53);
                      gn.a(0, true);
                    }
                    if (this.field_g.b(103)) {
                      is.b(80);
                      gn.a(0, true);
                    }
                    if (this.field_g.e(2542)) {
                      ng.e(-124);
                      gn.a(0, true);
                    }
                    if (this.field_g.g(116224)) {
                      js.h(0);
                      gn.a(0, true);
                    }
                    if (!this.field_g.b((byte) 52)) {
                      break L4;
                    }
                    {
                      var6 = 9 + (t.field_q + 128);
                      var7 = (this.b(param2, 49) + (this.f(-113, param2) - var6) >> 1) + (t.field_q + 8 - (t.field_q >> 2));
                      var8 = -var7 + ko.field_p << 1;
                      if (0 < var8) {
                        if (var8 < 256) {
                          fq.a(16440, var8);
                          if (var9 != 0) {
                            is.b(100);
                            lt.c((byte) 53);
                          }
                        } else {
                          is.b(100);
                          if (var9 != 0) {
                            lt.c((byte) 53);
                          }
                        }
                      } else {
                        lt.c((byte) 53);
                      }
                    }
                    if (var9 == 0) {
                      break L4;
                    }
                  case 13:
                    if (this.field_g.c(-103)) {
                      wv.a(24238);
                    }
                    if (this.field_g.b(103)) {
                      ig.a(22075);
                    }
                    if (this.field_g.e(2542)) {
                      kq.l(34168);
                    }
                    if (this.field_g.g(116224)) {
                      rj.a((byte) -6);
                    }
                    if (!this.field_g.b((byte) 52)) {
                      break L4;
                    }
                    {
                      var6 = 9 + (t.field_q + 128);
                      var7 = 8 + ((-var6 + (this.b(param2, 35) + this.f(90, param2)) >> 1) + (t.field_q - (t.field_q >> 2)));
                      var8 = -var7 + ko.field_p << 1;
                      if (var8 <= 0) {
                        lf.a(0, 0);
                        if (var9 != 0) {
                          if (var8 >= 256) {
                            lf.a(0, 256);
                            lf.a(0, var8);
                          } else {
                            lf.a(0, var8);
                          }
                        }
                      } else {
                        if (var8 >= 256) {
                          lf.a(0, 256);
                          if (var9 != 0) {
                            lf.a(0, var8);
                          }
                        } else {
                          lf.a(0, var8);
                        }
                      }
                    }
                    if (var9 == 0) {
                      break L4;
                    }
                  case 4:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (null != gk.field_o) {
                      b.c((byte) 127);
                      if (var9 == 0) {
                        break L4;
                      }
                    }
                    vb.a((byte) 126, param0);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 7:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    qc.a(param0, true, false);
                    if (wj.field_e == 0) {
                      av.a(-7753, param0, 2);
                      if (var9 == 0) {
                        break L4;
                      }
                    }
                    av.a(-7753, param0, 5);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 8:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    gu.field_j = 0;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 9:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    gu.field_j = 1;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 10:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    gu.field_j = 2;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 15:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (this.field_h != 4 &&
                      this.field_h != 2) {
                      if (this.field_h != 6) {
                        break L4;
                      }
                      stackIn_247_0 = 4025;
                      if (wj.field_e != 0) {
                        stackIn_248_1 = 5;
                      } else {
                        stackIn_248_1 = 2;
                      }
                      ul.a(stackIn_247_0, stackIn_248_1, 6);
                      if (var9 == 0) {
                        break L4;
                      }
                    }
                    ul.a(4025, this.field_h, this.field_h);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 18:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (!this.e(param2, 7746)) {
                      break L4;
                    }
                    if (this.field_h == 3) {
                      fl.field_n = fl.field_n - 1;
                    }
                    if (4 != this.field_h &&
                      this.field_h != 5) {
                    }
                    if (this.e(param2, 7746)) {
                      break L4;
                    }
                    this.field_g.field_g = 2;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 17:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (!this.e(param2, 7746)) {
                      break L4;
                    }
                    if (this.field_h == 3) {
                      fl.field_n = fl.field_n + 1;
                    }
                    if (this.field_h != 4 &&
                      this.field_h != 5) {
                    }
                    if (this.e(param2, 7746)) {
                      break L4;
                    }
                    this.field_g.field_g = 0;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 11:
                    if (!this.field_g.d(-31260)) {
                      break L4;
                    }
                    if (gk.field_o != null) {
                      b.c((byte) 126);
                    }
                    jl.a(ra.c(2), false);
                    if (var9 == 0) {
                      break L4;
                    }
                  case 20:
                    if (!this.field_g.d(-31260)) {
                      var5 = 24 / ((-15 - param1) / 43);
                      break L3;
                    }
                    mk.field_a = 1;
                    mr.field_f = null;
                    if (var9 == 0) {
                      break L4;
                    }
                  case 21:
                    break;
                  default:
                    break L4;
                }
                if (!(!this.field_g.d(-31260))) {
                  mr.field_f = null;
                  mk.field_a = 0;
                }
                break L4;
              }
            }
            if (!this.field_g.d(-31260)) {
            }
          }
          var5 = 24 / ((-15 - param1) / 43);
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 53;
        int var4 = 480;
        int var5 = 130;
        qv.field_k.a(var5, var3, 5023231 | param0 << 24, mb.field_j[0], (byte) -21, 0);
        uq.field_a.a(var5, var3, param0 << 24 | 16777215, mb.field_j[0], (byte) -15, 0);
        var5 += 30;
        field_a[0].a((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        field_a[1].a((float)(var3 + 30), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        gt.field_db.a(var5, var3 + 60, 5023231 | param0 << 24, mb.field_j[1], (byte) -76, 0);
        bq.field_c.a(var5, var3 + 60, param0 << 24 | 5023231, mb.field_j[1], (byte) -28, 0);
        gt.field_db.a(100, param0 << 24 | 5023231, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_j[2], (aa) null, 0, 0);
        bq.field_c.a(100, 16777215 | param0 << 24, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_j[2], (aa) null, 0, 0);
        var5 += 70;
        mr.field_e[0].a((float)(30 + var3), (float)(var5 + 10), 4096, 0, 1, 0, 2);
        mr.field_e[1].a((float)(30 + var3), (float)(10 + var5), 4096, 0, 1, 0, 2);
        gt.field_db.a(var5, var3 + 60, param0 << 24 | 5023231, mb.field_j[3], (byte) -44, 0);
        bq.field_c.a(var5, 60 + var3, param0 << 24 | 5023231, mb.field_j[3], (byte) -117, 0);
        gt.field_db.a(100, param0 << 24 | 5023231, 0, var4, 60 + var3, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_j[4], (aa) null, 0, 0);
        bq.field_c.a(100, 16777215 | param0 << 24, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_j[4], (aa) null, 0, 0);
        if (param1 >= -25) {
          this.b(-117);
        }
    }

    void a(int param0, ha param1, int param2) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        da stackIn_32_0 = null;
        boolean stackIn_32_1 = false;
        boolean stackIn_33_2 = false;
        boolean stackIn_36_3 = false;
        da stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        boolean stackIn_39_2 = false;
        boolean stackIn_41_3;
        boolean stackIn_42_4 = false;
        da stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        boolean stackIn_47_3;
        boolean stackIn_48_4 = false;
        da stackIn_50_0 = null;
        boolean stackIn_50_1 = false;
        boolean stackIn_51_2 = false;
        boolean stackIn_54_3 = false;
        da stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_57_2 = false;
        boolean stackIn_59_3;
        boolean stackIn_60_4 = false;
        da stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        boolean stackIn_63_2 = false;
        boolean stackIn_65_3;
        boolean stackIn_66_4 = false;
        boolean stackIn_80_1 = false;
        boolean stackIn_83_0 = false;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_90_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var6Lifetime1;
        int var6Lifetime2;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param2 != -2355) {
            this.a((byte) 91);
          }
          stackIn_6_0 = (ul.field_f == 0) ? 3 : 1;
          var4_int = stackIn_6_0;
          stackIn_9_0 = (ku.field_j < 2) ? 0 : 1;
          var5 = stackIn_9_0;
          if (0 == this.field_h ||
            1 == this.field_h ||
            this.field_h == 8) {
            wo.a(up.field_c, 490, 320 + (-(ns.field_b.c() / 2) - 20), param0 << 24, var4_int, param1, ns.field_b.c() + 40, -5, 1, true);
            if (ul.field_f == 0 &&
              !wj.field_k) {
              stackIn_18_0 = 3;
            } else {
              stackIn_18_0 = 1;
            }
            var6 = stackIn_18_0;
            ns.field_b.a(-(ns.field_b.c() / 2) + 320, 20, var6, param0 << 24, 1);
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_h != 2) {
            if (3 == this.field_h) {
              this.b((byte) 120, param0);
              decompiledFrameRemainder0 = (var8 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.field_h == 4) {
                this.a(false, param2 ^ 2407, param0);
                decompiledFrameRemainder0 = (var8 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_h == 5) {
                  this.a(true, -70, param0);
                  decompiledFrameRemainder0 = (var8 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.field_h == 6)) {
                  wo.a(up.field_c, 380, -5, param0 << 24, var4_int, param1, 650, 55, 1, true);
                  pj.field_k[this.field_h] = 200;
                  var6Lifetime1 = 200 - (-g.field_a.field_i + 70);
                  var7 = 4 + g.field_a.field_c + g.field_a.field_h;
                  qv.field_k.a(b.field_d, 5023231 | param0 << 24, -1, var6Lifetime1, 320, 0);
                  stackIn_32_0 = qv.field_k;
                  stackIn_32_1 = false;
                  stackIn_33_2 = (0 != te.field_c);
                  stackIn_36_3 = (wj.field_e != 0);
                  ((da) (Object) stackIn_32_0).a(fl.a(stackIn_32_1, stackIn_33_2, stackIn_36_3, (byte) 63), 5023231 | param0 << 24, -1, var7 + var6Lifetime1, 320, 0);
                  stackIn_38_0 = qv.field_k;
                  stackIn_38_1 = 26;
                  stackIn_39_2 = (wj.field_e != 0);
                  stackIn_41_3 = false;
                  stackIn_42_4 = (0 != te.field_c);
                  ((da) (Object) stackIn_38_0).a(pe.$cfr$intArgs$a$c7de0d339b2a(stackIn_38_1, stackIn_39_2, stackIn_41_3, stackIn_42_4), param0 << 24 | 5023231, -1, 32 + (var7 * 4 + var6Lifetime1), 320, 0);
                  stackIn_44_0 = qv.field_k;
                  stackIn_44_1 = 0;
                  stackIn_45_2 = (te.field_c != 0);
                  stackIn_47_3 = false;
                  stackIn_48_4 = (0 != wj.field_e);
                  ((da) (Object) stackIn_44_0).a(vi.a(stackIn_44_1, stackIn_45_2, stackIn_47_3, stackIn_48_4), param0 << 24 | 5023231, -1, 64 + var7 * 7 + var6Lifetime1, 320, 0);
                  uq.field_a.a(b.field_d, param0 << 24 | 16777215, -1, var6Lifetime1, 320, 0);
                  stackIn_50_0 = uq.field_a;
                  stackIn_50_1 = false;
                  stackIn_51_2 = (te.field_c != 0);
                  stackIn_54_3 = (wj.field_e != 0);
                  ((da) (Object) stackIn_50_0).a(fl.a(stackIn_50_1, stackIn_51_2, stackIn_54_3, (byte) 63), param0 << 24 | 16777215, -1, var6Lifetime1 + var7, 320, 0);
                  stackIn_56_0 = uq.field_a;
                  stackIn_56_1 = 26;
                  stackIn_57_2 = (wj.field_e != 0);
                  stackIn_59_3 = false;
                  stackIn_60_4 = (0 != te.field_c);
                  ((da) (Object) stackIn_56_0).a(pe.$cfr$intArgs$a$c7de0d339b2a(stackIn_56_1, stackIn_57_2, stackIn_59_3, stackIn_60_4), param0 << 24 | 16777215, -1, 32 + var7 * 4 + var6Lifetime1, 320, 0);
                  stackIn_62_0 = uq.field_a;
                  stackIn_62_1 = 0;
                  stackIn_63_2 = (te.field_c != 0);
                  stackIn_65_3 = false;
                  stackIn_66_4 = (wj.field_e != 0);
                  ((da) (Object) stackIn_62_0).a(vi.a(stackIn_62_1, stackIn_63_2, stackIn_65_3, stackIn_66_4), 16777215 | param0 << 24, -1, 64 + var7 * 7 + var6Lifetime1, 320, 0);
                  if (var8 != 0) {
                    this.h(param0, 1);
                  }
                }
              }
            }
          } else {
            this.h(param0, 1);
          }
          boolean decompiledFrameCompleted0 = true;
          if (var5 == 0 ||
            !hw.field_b[70] &&
            !hw.field_b[69]) {
            var6Lifetime2 = 0;
            while (!(var6Lifetime2 >= this.field_g.field_e)) {
              stackIn_83_0 = this.e(var6Lifetime2, 7746);
              if (var8 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_83_0) {
                stackIn_80_1 = (var6Lifetime2 == this.field_g.field_g);
                this.a(stackIn_80_1, var6Lifetime2, -112, param1, param0);
              }
              var6Lifetime2++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_83_0 = hg.field_o.a(false);
          }
          if (stackIn_83_0) {
            hg.field_o.a(param1, 22707);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_89_0 = var4;
          stackIn_89_1 = new StringBuilder().append("ak.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_90_2 = "null";
          } else {
            stackIn_90_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_89_0), ((StringBuilder) (Object) stackIn_89_1).append(stackIn_90_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 53;
        int var4 = 520;
        int var5 = 130;
        qv.field_k.a(var5, var3, 5023231 | param1 << 24, mb.field_g[0], (byte) -34, 0);
        uq.field_a.a(var5, var3, param1 << 24 | 16777215, mb.field_g[0], (byte) -40, 0);
        var5 += 30;
        gt.field_db.a(100, 5023231 | param1 << 24, 0, var4, var3, (int[]) null, (hr[]) null, var5 - 30, -1, 0, 0, -8787, mb.field_g[1], (aa) null, 0, 1);
        bq.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[1], (aa) null, 0, 1);
        var5 += 42;
        ud.field_q[0].a((float)(30 + var3), (float)(var5 + 20), 2048, 0, 1, 0, 2);
        gt.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[2], (aa) null, 0, 1);
        bq.field_c.a(100, 16777215 | param1 << 24, 0, var4, var3 + 60, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[2], (aa) null, 0, 1);
        var5 += 35;
        ud.field_q[1].a((float)(var3 + 30), (float)(20 + var5), 2048, 0, 1, 0, 2);
        gt.field_db.a(100, 5023231 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[3], (aa) null, 0, 1);
        if (param0 > -54) {
          this.field_h = 74;
        }
        bq.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3 + 60, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[3], (aa) null, 0, 1);
        var5 += 35;
        ud.field_q[2].a((float)(30 + var3), (float)(var5 + 20), 2048, 0, 1, 0, 2);
        gt.field_db.a(100, param1 << 24 | 5023231, 0, var4, var3 + 60, (int[]) null, (hr[]) null, var5 - 30, -1, 0, 0, -8787, mb.field_g[4], (aa) null, 0, 1);
        bq.field_c.a(100, 16777215 | param1 << 24, 0, var4, 60 + var3, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[4], (aa) null, 0, 1);
        var5 += 40;
        gt.field_db.a(100, param1 << 24 | 5023231, 0, var4, var3, (int[]) null, (hr[]) null, var5 - 30, -1, 0, 0, -8787, mb.field_g[5], (aa) null, 0, 1);
        bq.field_c.a(100, param1 << 24 | 16777215, 0, var4, var3, (int[]) null, (hr[]) null, -30 + var5, -1, 0, 0, -8787, mb.field_g[5], (aa) null, 0, 1);
    }

    private final void b(byte param0, int param1) {
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int var4;
        int var5;
        int[] var6;
        int var7;
        int var8;
        ha var9;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var9 = nq.field_h.a(-125);
        var4 = param1 << 24 | 16777215;
        var5 = 664;
        wo.a(up.field_c, 380, -5, param1 << 24, 3, var9, 650, 55, 1, true);
        if (param0 < 114) {
          return;
        }
        this.a(br.field_i, param1, 29228);
        var6 = new int[50];
        var7 = 0;
        L1: while (true) {
          L2: {
            L3: {
              L4: {
                boolean decompiledFrameRemainder1 = true;
                boolean decompiledFrameRemainder0 = true;
                if (var7 < 50) {
                  var6[var7] = -24 + var5;
                  stackIn_11_0 = 5;
                  stackIn_11_1 = fl.field_n;
                  if (var8 == 0) {
                    if (stackIn_11_0 == stackIn_11_1) {
                      var6[var7] = var6[var7] - 64;
                    }
                    var7++;
                    continue;
                  }
                } else {
                  var7 = fl.field_n;
                  decompiledFrameRemainder0 = (var7 != 0);
                  if (decompiledFrameRemainder0) {
                    stackIn_11_0 = ~var7;
                    stackIn_11_1 = -2;
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledFrameRemainder1 = (stackIn_11_0 != stackIn_11_1 ||
                  var8 != 0))) {
                  switch (var7) {
                    case 2:
                      break L4;
                    case 3:
                      break L3;
                    default:
                      break L1;
                    case 4:
                      if (var8 == 0) {
                        break L2;
                      }
                      break;
                  }
                }
                if (decompiledFrameRemainder1) {
                  this.a(param1, true);
                  if (var8 == 0) {
                    break L1;
                  }
                }
                this.d(param1, 8);
                if (var8 == 0) {
                  break L1;
                }
              }
              this.a(true, param1);
              if (var8 == 0) {
                break L1;
              }
            }
            this.a(param1, -119);
            if (var8 == 0) {
              break L1;
            }
          }
          this.a((byte) -123, param1);
          break;
        }
        gt.field_db.a(vl.a(1 + fl.field_n, true, mb.field_e.length), 5023231 | param1 << 24, -1, 380, 555, 0);
        bq.field_c.a(vl.a(1 + fl.field_n, true, mb.field_e.length), var4, -1, 380, 555, 0);
        return;
    }

    private final String a(int param0, byte param1) {
        int discarded$1 = 0;
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String stackIn_11_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var3 = "";
        if (param1 >= -28) {
          discarded$1 = this.b(110, 125);
        }
        while (param0 >= 1000) {
          var4 = param0 % 1000;
          stackIn_11_0 = var4 + var3;
          if (var5 != 0) {
            return stackIn_11_0;
          }
          var6 = stackIn_11_0;
          var3 = var6;
          if (var4 >= 10) {
            if (100 > var4) {
              var3 = ck.field_a + "0" + var6;
            } else {
              var3 = ck.field_a + var3;
            }
          } else {
            var3 = ck.field_a + "00" + var3;
          }
          param0 = param0 / 1000;
        }
        return param0 + var3;
    }

    private final boolean e(int param0, int param1) {
        if (this.field_h == 3) {
          if (0 == param0 &&
            fl.field_n == 0) {
            return false;
          }
          if (param0 == 2 &&
            ~fl.field_n == ~(-1 + mb.field_e.length)) {
            return false;
          }
        }
        if (this.field_h != 4 &&
          this.field_h == 5) {
        }
        if (param1 != 7746) {
          return false;
        }
        if (this.field_h != 2) {
          return true;
        }
        if (param0 == 3 &&
          0 == mk.field_a) {
          return false;
        }
        if (param0 == 4 &&
          mk.field_a == 1) {
          return false;
        }
        if (ku.field_j < 2) {
        }
        return true;
    }

    private final int b(int param0, int param1) {
        int var3;
        if (this.field_h == 2 &&
          !vs.b((byte) 9)) {
          if (3 != param0 &&
            4 != param0) {
            if (param0 == 5) {
              return 240;
            }
            return 155 * (param0 % 3) + za.field_l[this.field_h];
          }
          return 465 + za.field_l[this.field_h];
        }
        var3 = 27 / ((-40 - param1) / 47);
        if (this.field_h == 3) {
          return 20 + param0 * 200;
        }
        if (this.field_h != 9 &&
          10 != this.field_h) {
          if (this.field_h == 7) {
            return 200 * param0 + 205;
          }
          if (this.field_h == 11) {
            return 40 + 280 * param0;
          }
          if (this.field_h == 4 &&
            !vs.b((byte) 9)) {
            return 220;
          }
          if (4 == this.field_h &&
            vs.b((byte) 9)) {
            return 20 + 300 * param0;
          }
          if (this.field_h == 0 &&
            1 < param0 &&
            4 > param0) {
            return -14 + (-163 + 163 * param0);
          }
          if (this.field_h == 5 &&
            vs.b((byte) 9)) {
            return 300 * param0 + 20;
          }
          if (this.field_h == 5) {
            return 120 + 200 * param0;
          }
          return za.field_l[this.field_h];
        }
        return 120 + param0 * 200;
    }

    private final int c(int param0, int param1) {
        if (this.field_h != 11 &&
          12 != this.field_h) {
          if (0 == this.field_h &&
            param1 < 2) {
            return 48;
          }
          if (param0 != 8) {
            field_f = -98;
          }
          return 32;
        }
        return 48;
    }

    final static void a(ki param0, int param1) {
        q var2 = null;
        try {
          if (param1 != 100) {
            field_a = (hr[]) null;
          }
          q.a(param0.a("", "headers.packvorbis", -1));
          var2 = q.a(param0, "jagex logo2.packvorbis", "");
          var2.c();
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ak.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(int param0) {
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (oj.a(false)) {
          return;
        }
        if (hg.field_o.a(false)) {
          hg.field_o.c(15);
          return;
        }
        if (100 > rd.field_q) {
          rd.field_q = rd.field_q + 1;
        }
        if (this.field_e > 0) {
          this.field_e = this.field_e - 1;
        }
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!wd.c(-102)))) {
          if (tg.field_a == 13) {
            if (this.field_h == 1) {
              av.a(-7753, false, -1);
              ph.field_b.c((byte) 112);
              ut.field_j = 0;
              gn.a(15, true);
              if (var3 == 0) {
                continue;
              }
            }
            if (this.field_h == 6) {
              continue;
            }
            if (this.field_h == 10) {
              continue;
            }
            if (11 == this.field_h) {
              continue;
            }
            if (this.field_h == 12) {
              continue;
            }
            av.a(-7753, false, ut.field_j);
            gn.a(15, true);
            if (var3 == 0) {
              continue;
            }
          }
          this.a((byte) 126);
          if (this.field_g.field_g == -1) {
            continue;
          }
          this.a(false, (byte) -75, this.field_g.field_g);
          if (var3 == 0) {
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          this.field_g.a(true, this.a(nb.field_a, (byte) 97, jc.field_f), this.a(ko.field_p, (byte) 49, pi.field_e));
        }
        if (-1 != this.field_g.field_g) {
          this.a(true, (byte) 105, this.field_g.field_g);
        }
        if (hk.field_c == 0) {
        }
        if (param0 != -18556) {
          this.field_e = -17;
        }
        return;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -6) {
          ak.a(61);
        }
        field_a = null;
    }

    private final int f(int param0, int param1) {
        int var3;
        var3 = 121 % ((-59 - param0) / 50);
        if (this.field_h == 2 &&
          !vs.b((byte) 9)) {
          return 170 + this.b(param1, -92);
        }
        if (3 == this.field_h) {
          return 200 + this.b(param1, -106);
        }
        if (!vs.b((byte) 9) && (this.field_h == 4 ||
          this.field_h == 5)) {
          return 200 + this.b(param1, -88);
        }
        if (vs.b((byte) 9) && (this.field_h == 4 ||
          5 == this.field_h)) {
          return this.b(param1, 41) + 300;
        }
        if (this.field_h != 9 &&
          this.field_h != 10) {
          if (this.field_h == 7) {
            return this.b(param1, -121) + 165;
          }
          if (this.field_h == 11) {
            return 280 + this.b(param1, -121);
          }
          if (0 == this.field_h &&
            param1 > 1 &&
            param1 < 4) {
            return 179 + this.b(param1, 77);
          }
          return nj.field_d[this.field_h];
        }
        return 200 + this.b(param1, -108);
    }

    private final void h(int param0, int param1) {
        int var4;
        String var5;
        String var6;
        of var7_ref_of;
        int var7;
        String[] var8;
        int[] var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        String var17;
        String var18;
        int var19;
        ha var20;
        int stackIn_34_0 = 0;
        String stackIn_37_0 = null;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        String var6Lifetime1;
        var19 = Sumoblitz.field_L ? 1 : 0;
        var20 = nq.field_h.a(-124);
        wo.a(up.field_c, 424, -5, param0 << 24, 3, var20, 650, 45, param1, true);
        var4 = 0;
        if (dk.field_c == 2) {
        }
        if (3 == dk.field_c) {
        }
        var5 = wq.field_a;
        if (1 == gu.field_j) {
          var5 = mu.field_r;
        }
        if (2 == gu.field_j) {
          var5 = jm.field_c;
        }
        L4: {
          L5: {
            this.a(var5, param0, param1 + 29227);
            if (vs.b((byte) 9)) {
              var6 = ng.field_e;
              if (var19 == 0) {
                break L5;
              }
            }
            if (mr.field_f == null) {
              mr.field_f = of.a(2, 1, mk.field_a, 3, 10);
            }
            var7_ref_of = mr.field_f;
            if (var7_ref_of.field_q) {
              if (var7_ref_of.field_o == null) {
                var6 = wl.field_b;
                if (var19 == 0) {
                  break L5;
                }
              }
              var6 = ng.field_e;
              var8 = var7_ref_of.field_o[gu.field_j];
              var9 = var7_ref_of.field_m[gu.field_j];
              var10 = kp.a(var7_ref_of, param1 - 2, hb.field_a, gu.field_j);
              g.field_a.a("10. ", param1 - 1);
              var11 = qr.field_a.field_i + 140;
              var11 -= 20;
              var12 = 128;
              var13 = 512;
              var14 = 28900 - (qr.field_a.field_i / 2 - var11 + 240) * (-var11 + (240 + qr.field_a.field_i / 2));
              if (var14 > 0) {
                Math.sqrt((double)var14);
              }
              var15 = param0 << 24 | 16777215;
              qv.field_k.a(var11, var12, 5023231 | param0 << 24, pd.field_r, (byte) -30, -1);
              if (~var10 == ~var4) {
                var15 = -17409;
              }
              uq.field_a.a(var11, var12, var15, pd.field_r, (byte) -71, -1);
              qv.field_k.a(-1, var13, se.field_a, var11, 5023231 | param0 << 24, 72);
              uq.field_a.a(-1, var13, se.field_a, var11, var15, 59);
              var11 += 20;
              var4 = 0;
              while (10 > var4) {
                var12Lifetime1 = 128;
                var13Lifetime1 = 512;
                var14Lifetime1 = 28900 - (240 - var11 + qr.field_a.field_i / 2) * (qr.field_a.field_i / 2 + (-var11 + 240));
                stackIn_34_0 = var14Lifetime1;
                if (var19 != 0) {
                  break L4;
                }
                if (stackIn_34_0 > 0) {
                  Math.sqrt((double)var14Lifetime1);
                }
                if (var8[var4] != null) {
                  var15Lifetime1 = -1;
                  var16 = var9[var4 * 2];
                  var17 = var8[var4];
                  if (var10 == var4) {
                    var20.a((byte) -59, 60 + (var13Lifetime1 - var12Lifetime1), var11 - 12, 16759807 | (param0 & 772132860) << 22, var12Lifetime1 - 30, 16);
                    var15Lifetime1 = -17409;
                  }
                  gt.field_db.a(0, var12Lifetime1 - 1, 1 + var4 + ". ", var11, param0 << 24 | 5023231, param1 ^ 64);
                  gt.field_db.a(var11, var12Lifetime1 - 1, 5023231 | param0 << 24, var17, (byte) -54, 0);
                  gt.field_db.a(0, var12Lifetime1, 1 + var4 + ". ", -1 + var11, param0 << 24 | 5023231, 96);
                  gt.field_db.a(var11 - 1, var12Lifetime1, 5023231 | param0 << 24, var17, (byte) -41, 0);
                  gt.field_db.a(-1, var12Lifetime1, var4 + 1 + ". ", var11, param0 << 24 | 5023231, param1 ^ 80);
                  gt.field_db.a(var11, var12Lifetime1, param0 << 24 | 5023231, var17, (byte) -119, -1);
                  bq.field_c.a(0, -1 + var12Lifetime1, 1 + var4 + ". ", var11, 0, 80);
                  bq.field_c.a(var11, var12Lifetime1 - 1, 0, var17, (byte) -110, 0);
                  bq.field_c.a(0, var12Lifetime1, var4 + 1 + ". ", var11 - 1, 0, 82);
                  bq.field_c.a(-1 + var11, var12Lifetime1, 0, var17, (byte) -92, 0);
                  bq.field_c.a(-1, var12Lifetime1, 1 + var4 + ". ", var11, var15Lifetime1, 84);
                  bq.field_c.a(var11, var12Lifetime1, var15Lifetime1, var17, (byte) -116, -1);
                  var18 = this.a(var16, (byte) -81);
                  gt.field_db.a(-1, -1 + var13Lifetime1, var18, var11, 5023231 | param0 << 24, 124);
                  gt.field_db.a(-1, var13Lifetime1, var18, var11 - 1, param0 << 24 | 5023231, 124);
                  gt.field_db.a(-1, var13Lifetime1, var18, var11, 5023231 | param0 << 24, 43);
                  bq.field_c.a(-1, var13Lifetime1, var18, var11, param0 << 24 | var15Lifetime1, 116);
                  var6 = "";
                }
                var11 += 20;
                var4++;
              }
              if (var19 != 0) {
                var6 = mm.field_b;
              }
            } else {
              var6 = mm.field_b;
            }
          }
          stackIn_34_0 = 100 + (140 + g.field_a.field_i);
        }
        var7 = stackIn_34_0;
        gt.field_db.a(var6, 5023231 | param0 << 24, -1, var7, 320, 0);
        bq.field_c.a(var6, param0 << 24 | 16777215, -1, var7, 320, param1 - 1);
        if (!vs.b((byte) 9)) {
          stackIn_37_0 = bv.field_b;
        } else {
          stackIn_37_0 = tj.field_o;
        }
        var6Lifetime1 = stackIn_37_0;
        gt.field_db.a(var6Lifetime1, param0 << 24 | 5023231, -1, g.field_a.field_i + 140 + 220, 320, 0);
        bq.field_c.a(var6Lifetime1, 16777215 | param0 << 24, -1, 140 + g.field_a.field_i + 220, 320, 0);
    }

    private final void a(String param0, int param1, int param2) {
        try {
          ma.field_b.a(param0, 0);
          if (param2 != 29228) {
            this.b(-7, true);
          }
          be.field_t.a(param0, 5023231 | param1 << 24, -1, 96, 320, 0);
          hc.field_e.a(param0, 16777215 | param1 << 24, -1, 96, 320, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ak.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ak(int param0) {
        this.field_c = -1;
        this.field_h = param0;
        this.field_g = new er(kd.field_a[param0].length);
    }

    private final void d(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var3 = 53;
        var4 = 520;
        var5 = 140;
        var6 = 0;
        if (param1 != 8) {
          this.b((byte) -41, 2);
        }
        while (var6 < 5) {
          if (var7 == 0) {
            if (var6 != 2) {
              if (var6 != 4) {
                var3Lifetime1 = 53;
                var4Lifetime1 = 540;
              } else {
                var3Lifetime1 = 200;
                var4Lifetime1 = 350;
              }
            } else {
              var3Lifetime1 = 200;
              var4Lifetime1 = 370;
            }
            if (mb.field_a[var6].startsWith("<b>")) {
              qv.field_k.a(var5, var3Lifetime1, param0 << 24 | 5023231, mb.field_a[var6], (byte) -98, 0);
              uq.field_a.a(var5, var3Lifetime1, param0 << 24 | 16777215, mb.field_a[var6], (byte) -32, 0);
            } else if (var6 != 1) {
              if (3 != var6) {
                gt.field_db.a(100, 5023231 | param0 << 24, 0, var4Lifetime1, var3Lifetime1, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_a[var6], (aa) null, 0, 1);
                bq.field_c.a(100, 16777215 | param0 << 24, 0, var4Lifetime1, var3Lifetime1, (int[]) null, (hr[]) null, var5, -1, 0, 0, -8787, mb.field_a[var6], (aa) null, 0, 1);
              } else {
                bt.field_e.a(var3Lifetime1 + 16, 14 + var5);
              }
            } else {
              to.field_m.a(28 + var3Lifetime1, var5 + 20);
            }
            if (var6 == 2) {
              var5 += 80;
            }
            if (var6 == 1) {
              var5 += 20;
            }
            var6++;
            continue;
          }
          break;
        }
    }

    static {
        field_b = new jn();
    }
}
