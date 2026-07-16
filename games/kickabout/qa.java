/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends dj {
    static hd field_E;
    static hd field_H;
    static String field_F;
    static String field_G;

    final static int a(tv param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Kickabout.field_G;
          if (param1 == 31100) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: {
          var2 = ag.field_e;
          if (-3 == (param0.field_c ^ -1)) {
            if (param0.field_m) {
              var2 = ag.field_e;
              break L1;
            } else {
              L2: {
                if (-1 != (param0.field_j ^ -1)) {
                  break L2;
                } else {
                  if (param0.field_p == 0) {
                    var2 = sg.field_c[param0.field_c];
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = sb.field_h[param0.field_c];
              break L1;
            }
          } else {
            if (4 == param0.field_c) {
              var2 = sb.field_h[param0.field_c];
              break L1;
            } else {
              if (param0.field_d == dd.field_c) {
                var2 = sg.field_c[param0.field_c];
                break L1;
              } else {
                var2 = sb.field_h[param0.field_c];
                break L1;
              }
            }
          }
        }
        return var2;
    }

    qa() {
    }

    public static void g(int param0) {
        field_E = null;
        field_F = null;
        field_H = null;
        if (param0 != 60) {
            wc discarded$0 = qa.h(-115);
        }
        field_G = null;
    }

    final static wc h(int param0) {
        if (param0 >= -58) {
            field_E = null;
        }
        if (wb.field_p == null) {
            wb.field_p = new wc();
            wb.field_p.a(gf.field_a, 3422);
            wb.field_p.field_a = qo.field_k;
            wb.field_p.field_m = 0;
            wb.field_p.field_p = 4;
            wb.field_p.field_d = 5;
            wb.field_p.field_i = 6;
            wb.field_p.field_j = 7697781;
            wb.field_p.field_t = 2763306;
            wb.field_p.field_f = 14;
        }
        return wb.field_p;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        L0: {
          var10 = Kickabout.field_G;
          super.a(param0, param1);
          if (0 != ((qa) this).field_C) {
            break L0;
          } else {
            ms.a(cd.field_b, 40 + ((qa) this).field_j, 280, true, 0, 263);
            on.a(350 - -((qa) this).field_j, 144, 226, 232, 10, 65793, 140);
            un.field_d.a(ic.field_b.toLowerCase(), 370 + ((qa) this).field_j, 172, 16777215, -1);
            var3 = ((qa) this).field_j + 370;
            on.a(var3, 186, 184, 174, 16777215, 30);
            on.h(var3 - 1, 185, 186, 176, 16777215, 128);
            var4 = 0;
            L1: while (true) {
              if (var4 >= 6) {
                on.f(var3 + 127, 186, 174, 16777215, 128);
                var4 = 0;
                L2: while (true) {
                  if ((var4 ^ -1) <= -6) {
                    lo.a(206, ((qa) this).field_j + 180, 100);
                    break L0;
                  } else {
                    on.c(var3 + 4, 187 + 28 * var4 + 28, 174, 16777215, 30);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                pb.field_C.c(q.field_h[var4 + 1], 120 + var3, 180 + (var4 + 1) * 28, 16777215, -1);
                pb.field_C.a(Integer.toString(ps.field_d[1 + var4]), 134 + var3, var4 * 28 - -28 + 180, 16777215, -1);
                var4++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (-2 != (((qa) this).field_C ^ -1)) {
            break L3;
          } else {
            var11 = 0;
            var3 = var11;
            var4 = 0;
            L4: while (true) {
              if (2 <= var4) {
                var4 = 0;
                L5: while (true) {
                  if (kb.field_E.length <= var4) {
                    break L3;
                  } else {
                    kb.field_E[var4].d(30 * var4 + ((qa) this).field_j + 50, 150);
                    var4++;
                    continue L5;
                  }
                }
              } else {
                L6: {
                  if (1 != var4) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L6;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L6;
                  }
                }
                L7: {
                  var5 = stackIn_14_0;
                  if (var5 == 0) {
                    stackOut_16_0 = 50;
                    stackIn_17_0 = stackOut_16_0;
                    break L7;
                  } else {
                    stackOut_15_0 = 345;
                    stackIn_17_0 = stackOut_15_0;
                    break L7;
                  }
                }
                L8: {
                  var6 = stackIn_17_0;
                  var6 = var6 + ((qa) this).field_j;
                  var7 = 146;
                  on.a(var6 - 10, 126, 265, 270, 10, 65793, 140);
                  if (var4 == 0) {
                    var7 += 60;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: while (true) {
                  if (var11 < tm.field_q.length) {
                    var8 = tm.field_q[var11];
                    var9 = pb.field_C.c(var8, 245, 16);
                    if (var7 - -var9 <= 396) {
                      var11++;
                      var7 = var7 + (16 * pb.field_C.a(var8, var6, var7, 245, 999, 16777215, -1, 0, 0, 16) + 25);
                      continue L9;
                    } else {
                      var4++;
                      continue L4;
                    }
                  } else {
                    var4++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
    }

    final static void i(int param0) {
        int var1 = 0;
        int var2 = 0;
        gm var2_ref_gm = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        var1 = 0;
        L0: while (true) {
          if (var1 >= mn.field_b.length) {
            var2 = 118 / ((param0 - -70) / 44);
            return;
          } else {
            L1: {
              var2_ref_gm = (gm) (Object) sh.field_a.field_P[ae.field_G][1 + var1];
              var3 = null;
              var4 = 0;
              if (var2_ref_gm.field_C > 0) {
                var5 = Math.min(-1 + kj.field_b.length, 210 * var2_ref_gm.field_C / var2_ref_gm.a((byte) -99));
                var4 = 72;
                var3 = (Object) (Object) kj.field_b[var5];
                break L1;
              } else {
                if (-1 > (mn.field_b[var1] ^ -1)) {
                  var4 = qi.field_n[-1 + mn.field_b[var1]];
                  var3 = (Object) (Object) ac.field_a[mn.field_b[var1] - 1];
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (var3 != null) {
              var5 = ug.a(0, var2_ref_gm.field_kb >> 725111984);
              var6 = lf.a((byte) -114, var2_ref_gm.field_bb >> 491129232);
              if (hw.field_i == 256) {
                var7 = var4 >> 260263585;
                eo.a((byte[]) var3, -var7 + var5, -var7 + var6, var4);
                var1++;
                continue L0;
              } else {
                var7 = hw.field_i * var4 >> -39051064;
                var8 = var7 >> 1021409345;
                eo.a((byte[]) var3, -var8 + var5, -var8 + var6, var4, var7);
                var1++;
                continue L0;
              }
            } else {
              var1++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "to the Semi-Finals";
        field_G = "Warning: The Auction House takes a 10% commission on all sales";
    }
}
