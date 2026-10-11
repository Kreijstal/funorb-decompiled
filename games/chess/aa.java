/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static ci field_g;
    private int field_d;
    private int field_h;
    static int field_i;
    private int field_c;
    static String field_a;
    private int field_b;
    private of field_e;
    static int field_f;

    private final int d(int param0, int param1) {
        if (this.field_c == 4 &&
          !vi.a(-3)) {
          return param1 >= 2 ? 380 : 300 + 240 * param1;
        }
        if (this.field_c != 5) {
          if (param0 != -3) {
            this.field_e = (of) null;
          }
          return ak.field_r[this.field_c];
        }
        return this.e(0, param1) + 140;
    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        boolean stackIn_7_0 = false;
        var6 = Chess.field_G;
        if (param1 > -43) {
          this.a(false, -21, 28);
        }
        var4 = 0;
        while (true) {
          if (ak.field_q[this.field_c].length <= var4) {
            return -1;
          }
          var5 = this.a(var4, 210);
          stackIn_7_0 = this.a(var4, (byte) 113);
          if (var6 != 0) {
            return stackIn_7_0 ? 1 : 0;
          }
          if (stackIn_7_0 &&
            param0 >= this.e(0, var4) &&
            param0 < this.d(-3, var4) &&
            param2 >= var5 &&
            var5 + this.c(32, var4) > param2) {
            return var4;
          }
          var4++;
        }
    }

    final void d(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_51_0;
        rk[] stackIn_51_1;
        int stackIn_51_2;
        int stackIn_51_3;
        int stackIn_51_4;
        int stackIn_51_5;
        int stackIn_51_6;
        int stackIn_51_7;
        int stackIn_51_8;
        boolean stackIn_51_9;
        boolean stackIn_52_10 = false;
        int stackIn_55_9 = 0;
        int stackIn_57_0;
        rk[] stackIn_57_1;
        int stackIn_57_2;
        int stackIn_57_3;
        int stackIn_57_4;
        int stackIn_57_5;
        int stackIn_57_6;
        int stackIn_57_7;
        boolean stackIn_57_8;
        boolean stackIn_58_9 = false;
        int stackIn_61_8;
        Object stackIn_70_0;
        boolean stackIn_71_4 = false;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var14 = null;
        var10 = Chess.field_G;
        var2 = this.c(param0 ^ -40);
        if (nc.field_T != 0 &&
          16 <= nc.field_T) {
          stackIn_5_0 = qk.field_h;
        } else {
          stackIn_5_0 = this.field_c;
        }
        var3 = stackIn_5_0;
        var4 = 64;
        var14 = wb.field_d;
        if (param0 != 59) {
          this.a(108);
        }
        var6 = wb.field_h;
        var7 = wb.field_c;
        if (var3 == 0) {
          ph.a(-7125);
        }
        if (rn.field_b == 2 && (uh.i(23156) == null ||
          uh.i(23156).field_g &&
          nc.field_T == 0)) {
          if (null == b.field_a) {
            b.field_a = new km(wb.field_h, wb.field_c);
          }
          b.field_a.e();
          nh.a();
          nh.c(370, 240 + ec.c((byte) -63));
        }
        boolean decompiledFrameRemainder1 = true;
        if (var3 == 0 ||
          var3 == 6 ||
          var3 == 4 ||
          5 == var3 &&
          (0 == qk.field_h ||
          pg.field_s == 0) ||
          var3 == 8) {
          qd.field_w.h(param0 ^ -113);
          var4 = 32;
          this.a(var4, -var2, 13551);
          decompiledFrameRemainder1 = (var10 != 0);
        }
        if (decompiledFrameRemainder1) {
          if (var3 != 2 &&
            11 != var3 &&
            var3 != 1 &&
            var3 != 9 && (5 != var3 ||
            0 == qk.field_h ||
            pg.field_s == 0)) {
            if (3 == var3 ||
              var3 == 10) {
              this.a(17922);
              var4 = 128;
              if (var10 != 0) {
                this.b(130);
                var4 = 128;
                this.a(var4 / 2, -var2, param0 ^ 13524);
              }
            }
          } else {
            this.b(130);
            var4 = 128;
            this.a(var4 / 2, -var2, param0 ^ 13524);
          }
        }
        this.f(var2, -7098);
        if (uh.i(param0 + 23097) != null &&
          (this.field_c == 1 ||
          2 == this.field_c ||
          this.field_c == 11)) {
          ek.a(16777215, ak.field_m[this.field_c] - 50, -100 + (var2 + 320), 10, ak.field_m[this.field_c] - 25, 0, (byte) 63, 100 + var2 + 320);
          stackIn_51_0 = 16777215;
          stackIn_51_1 = pg.field_v;
          stackIn_51_2 = 320 + (var2 - 90);
          stackIn_51_3 = ak.field_m[this.field_c] - 50;
          stackIn_51_4 = 3;
          stackIn_51_5 = 60;
          stackIn_51_6 = 0;
          stackIn_51_7 = uh.i(23156).field_e / 50;
          stackIn_51_8 = 3;
          stackIn_51_9 = uh.i(param0 ^ 23119).field_b;
          stackIn_52_10 = (0 == (r.field_Eb / 50 & 1));
          if (stackIn_51_9 | !stackIn_52_10) {
            stackIn_55_9 = 0;
          } else {
            stackIn_55_9 = 32;
          }
          se.a(stackIn_51_0, stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4, stackIn_51_5, stackIn_51_6, stackIn_51_7, stackIn_51_8 | stackIn_55_9, da.field_y);
          stackIn_57_0 = 16711680;
          stackIn_57_1 = pg.field_v;
          stackIn_57_2 = 10 + (320 + var2);
          stackIn_57_3 = -50 + ak.field_m[this.field_c];
          stackIn_57_4 = 3;
          stackIn_57_5 = 60;
          stackIn_57_6 = 0;
          stackIn_57_7 = uh.i(23156).field_v / 50;
          stackIn_57_8 = uh.i(param0 ^ 23119).field_b;
          stackIn_58_9 = ((r.field_Eb / 50 & 1) == 0);
          if (stackIn_57_8 | stackIn_58_9) {
            stackIn_61_8 = 32;
          } else {
            stackIn_61_8 = 0;
          }
          se.a(stackIn_57_0, stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4, stackIn_57_5, stackIn_57_6, stackIn_57_7, stackIn_61_8 | 3, da.field_y);
        }
        if (this.field_c < dc.field_n.length &&
          dc.field_n[this.field_c] != null) {
          dc.field_n[this.field_c].a(var2, 0);
        }
        var8 = 0;
        var9 = ak.field_m[this.field_c];
        L22: while (true) {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (var8 < this.field_e.field_f) {
            stackIn_92_1 = 0;
            stackIn_92_2 = var8;
            stackIn_92_3 = var9;
            if (var10 == 0) {
              stackIn_70_0 = this;
              stackIn_71_4 = (this.field_e.field_h == var8);
              this.a(stackIn_92_1 != 0, stackIn_92_2, stackIn_92_3, stackIn_71_4, var2);
              var9 = var9 + ak.field_y[this.field_c];
              var8++;
              continue;
            }
          } else {
            if (var3 == 3 ||
              var3 == 10) {
              var8 = 0;
              while (5 > var8) {
                ok.field_Ib[var8].c((byte) 56);
                var8++;
                if (var10 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameCompleted0) &&
              (decompiledFrameRemainder0 = (this.field_c != 4))) {
              if (5 == this.field_c) {
                this.b(var2, true);
                if (var10 == 0) {
                  break L22;
                }
              }
              if (this.field_c != 6) {
                if (this.field_c == 7) {
                  this.a(-18210, true, var2);
                  if (var10 == 0) {
                    break L22;
                  }
                }
                if (this.field_c != 8) {
                  break L22;
                }
                ek.a(16777215, 155, 50 + var2, 10, ak.field_m[this.field_c] - 30, 0, (byte) 63, var2 + 590);
                v.field_j.a(ad.field_d, var2 + 50, 155, 540, 480, 16444375, -1, 0, 0, v.field_j.field_q);
                if (var10 == 0) {
                  break L22;
                }
              }
              stackIn_92_1 = -18210;
              stackIn_92_2 = 0;
              stackIn_92_3 = var2;
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            this.a(stackIn_92_1, stackIn_92_2 != 0, stackIn_92_3);
            if (var10 == 0) {
              break L22;
            }
          }
          this.b(-481, var2);
          break;
        }
        wb.a(var14, var6, var7);
        if (null != b.field_a &&
          2 == rn.field_b && (uh.i(23156) == null ||
          uh.i(23156).field_g &&
          nc.field_T == 0)) {
          b.field_a.b(0, 0, var4 << 1);
        }
        if (oc.field_p != null) {
          sf.b(16777215);
        }
        return;
    }

    private final int c(int param0, int param1) {
        if (param0 != 32) {
          this.a(true, -60, -103, true, -118);
        }
        return 30;
    }

    private final boolean a(int param0, byte param1) {
        if (param1 <= 111) {
          km var4 = (km) null;
          aa.a((km) null, 106);
          return true;
        }
        return true;
    }

    final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        boolean decompiledFrameRemainder0 = true;
        var4 = Chess.field_G;
        if (vg.field_a != 13) {
          if (jc.field_f == 5) {
            this.e(-36);
            if (var4 != 0) {
              this.field_e.c((byte) 127);
            }
          } else {
            this.field_e.c((byte) 127);
          }
          decompiledFrameRemainder0 = (this.field_e.field_h != -1);
          if (decompiledFrameRemainder0) {
            this.a(false, 2, this.field_e.field_h);
            decompiledFrameRemainder0 = (var4 != 0);
          }
        }
        if (decompiledFrameRemainder0) {
          if (1 == this.field_c ||
            this.field_c == 2 ||
            this.field_c == 3 ||
            this.field_c == 11) {
            stackIn_16_0 = (this.field_c != 3) ? 0 : 1;
            var2 = stackIn_16_0;
            stackIn_19_0 = (var2 == 0) ? -1 : -5;
            var3 = stackIn_19_0;
            uk.a(qk.field_h, false, 28333, var3);
            if ((var4 != 0) &&
              (7 != jc.field_f)) {
              var2 = pg.field_s;
              uk.a(qk.field_h, false, 28333, var2);
            }
          } else {
            if (7 != jc.field_f) {
              var2 = pg.field_s;
              uk.a(qk.field_h, false, 28333, var2);
            }
          }
        }
        if (param0 <= 89) {
          this.a(-113, -38, -3);
        }
    }

    private final void f(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        var3 = 10;
        var4 = 0;
        var5 = 16777215;
        var6 = param0 + ak.field_k[this.field_c];
        var7 = ak.field_m[this.field_c];
        var8 = param0 + ak.field_r[this.field_c];
        var9 = -5;
        if (param1 != -7098) {
          this.field_h = 10;
        }
        var10 = this.field_e.field_f * ak.field_y[this.field_c] + (var7 + var9);
        if (this.field_c == 5) {
          var10 = var9 + (var7 + ak.field_y[this.field_c] * (-3 + this.field_e.field_f));
          ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
          var7 = 2 * ak.field_y[this.field_c] + var10 - var9;
          var10 = var7 + (var9 + ak.field_y[this.field_c]);
          ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
          if (Chess.field_G != 0) {
            ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
          }
        } else {
          ek.a(var5, var7, var6, var3, var10, var4, (byte) 63, var8);
        }
    }

    private final int a(int param0, int param1) {
        if (param1 != 210) {
          this.a(124, false, -22);
        }
        if (this.field_c == 4 &&
          !vi.a(-3)) {
          if (param0 < 2) {
            return ak.field_m[this.field_c];
          }
          return ak.field_m[this.field_c] + ak.field_y[this.field_c];
        }
        if (this.field_c == 5) {
          return ak.field_m[this.field_c];
        }
        return param0 * ak.field_y[this.field_c] + ak.field_m[this.field_c];
    }

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          Throwable throwable = null;
          RuntimeException runtimeException = null;
          String var4 = null;
          String var5 = null;
          String var6 = null;
          String var7 = null;
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            wg.field_p = param2;
            try {
              var6 = param0.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param0.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param2 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              var5Lifetime6 = var7;
              if (param1 == ~param2.length()) {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                if (Chess.field_G != 0) {
                  var5Lifetime6 = var5Lifetime6 + "; Expires=" + sk.a(5, 94608000000L + ud.a(2)) + "; Max-Age=" + 94608000L;
                }
              } else {
                var5Lifetime6 = var5Lifetime6 + "; Expires=" + sk.a(5, 94608000000L + ud.a(2)) + "; Max-Age=" + 94608000L;
              }
              u.a((byte) -81, "document.cookie=\"" + var5Lifetime6 + "\"", param0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            od.a(false, param0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = runtimeException;
            stackIn_11_1 = new StringBuilder().append("aa.EA(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1, int param2, boolean param3, int param4) {
        int stackIn_26_0 = 0;
        int stackIn_35_0 = 0;
        wg stackIn_38_0 = null;
        int stackIn_52_0 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        wg var12_ref_wg = null;
        wg var13_ref_wg = null;
        int var13 = 0;
        int var14 = 0;
        String var9_ref_StringLifetime1;
        String var9_ref_StringLifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var14 = Chess.field_G;
        if (param0) {
          field_f = -70;
        }
        var6 = ak.field_k[this.field_c] + param4;
        var7 = ak.field_q[this.field_c][param1];
        var8 = fm.field_R[var7];
        if (35 == var7) {
          return;
        }
        if (var7 == 33 &&
          this.field_h == 19) {
          return;
        }
        if (var7 == 34 &&
          this.field_h == 25) {
          return;
        }
        if (12 == var7) {
          var8 = da.field_C[tk.field_e];
          var9_ref_String = var8;
          var9_ref_StringLifetime2 = var8;
        }
        if (var7 == 26) {
          if (rn.field_b != 0) {
            if (rn.field_b != 1) {
              var9_ref_StringLifetime1 = pk.field_h;
              if (var14 != 0) {
                var9_ref_StringLifetime1 = sj.field_t;
                var9_ref_StringLifetime1 = dm.field_a;
              }
            } else {
              var9_ref_StringLifetime1 = sj.field_t;
              if (var14 != 0) {
                var9_ref_StringLifetime1 = dm.field_a;
              }
            }
          } else {
            var9_ref_StringLifetime1 = dm.field_a;
          }
          var8 = var8 + var9_ref_StringLifetime1;
        }
        stackIn_26_0 = (param3) ? 13732679 : 16444375;
        var9 = stackIn_26_0;
        if (this.field_h == var7) {
          var8 = "{<col=b0b0b0>" + var8 + "</col>}";
        }
        var10 = 2043695;
        v.field_j.a(var8, var6, v.field_j.field_C + param2, var9, var10);
        if (var7 == 14 ||
          var7 == 15) {
          var11 = 75 + var6;
          if (var7 == 14) {
            stackIn_35_0 = lf.field_S;
          } else {
            stackIn_35_0 = bc.field_b;
          }
          var12 = stackIn_35_0;
          if (var7 != 14) {
            stackIn_38_0 = hg.field_b;
          } else {
            stackIn_38_0 = mi.field_q;
          }
          var13_ref_wg = stackIn_38_0;
          var13_ref_wg.field_i = var11;
          var13_ref_wg.field_k = param2 + 8;
          var13_ref_wg.field_x = var12;
          var13_ref_wg.a(110);
        }
        if (var7 == 32) {
          var11Lifetime1 = 67 + var6;
          var12_ref_wg = nb.field_Fb;
          if (var12_ref_wg != null) {
            var12_ref_wg.field_i = var11Lifetime1;
            var12_ref_wg.field_k = param2 + 8;
            var12_ref_wg.a(-116);
            var13 = 0;
            while (!(ok.field_Ib.length <= var13)) {
              ok.field_Ib[var13].field_i = var12_ref_wg.field_i + 22 * var13;
              ok.field_Ib[var13].field_k = v.field_j.field_q + (param2 + 6);
              var13++;
              if (var14 != 0) {
                return;
              }
            }
          }
        }
        if (param3) {
          if (this.field_c != 9) {
            return;
          }
          var11Lifetime2 = ak.field_m[this.field_c];
          var12Lifetime1 = var6 + 160;
          stackIn_52_0 = (0 != oc.field_p.field_C) ? 0 : 1;
          var13Lifetime1 = stackIn_52_0;
          if (var7 == 29) {
            rl.field_d[var13Lifetime1][3].c(var12Lifetime1, var11Lifetime2);
          }
          if (var7 == 28) {
            rl.field_d[var13Lifetime1][2].c(var12Lifetime1, var11Lifetime2);
          }
          if (var7 == 30) {
            rl.field_d[var13Lifetime1][5].c(var12Lifetime1, var11Lifetime2);
          }
          if (var7 == 27) {
            rl.field_d[var13Lifetime1][4].c(var12Lifetime1, var11Lifetime2);
            return;
          }
        }
        return;
    }

    private final void b(int param0, boolean param1) {
        String var3;
        String var4;
        int var5;
        int var6_int;
        rk var6;
        int var7;
        int var8;
        int var9;
        var9 = Chess.field_G;
        if (!param1) {
          this.field_c = 16;
        }
        var6_int = this.field_h;
        switch ((var9 == 0
          || var6_int == 20
          || var6_int == 23
          || var6_int == 25
          ) ? var6_int : -1) {
          case 20:
            var5 = 0;
            if (var9 == 0) {
              break;
            }
          case 21:
            var5 = 1;
            if (var9 == 0) {
              break;
            }
          case 22:
            var5 = 2;
            if (var9 == 0) {
              break;
            }
          case 23:
            var5 = 3;
            if (var9 == 0) {
              break;
            }
          case 24:
            var5 = 4;
            if (var9 == 0) {
              break;
            }
          case 25:
            var5 = 5;
            if (var9 == 0) {
              break;
            }
          default:
            var5 = -1;
        }
        if (-1 == var5) {
          var3 = wm.field_i;
          var4 = sg.field_a;
          if (var9 != 0) {
            var4 = o.field_i[var5];
            var3 = pa.field_j[var5];
          }
        } else {
          var4 = o.field_i[var5];
          var3 = pa.field_j[var5];
        }
        tb.field_a.b(-param0, 0);
        wb.c(tb.field_a.field_s + 1 - param0, tb.field_a.field_r + 1, tb.field_a.field_w - 1, tb.field_a.field_t - 1, 1);
        v.field_j.a(var4, 15 - param0, v.field_j.field_q + 155, 4096, -1);
        jj.field_d.a(var3, 15 - param0, 165, 250, 640, 4096, -1, 0, 0, -1 + jj.field_d.field_q);
        if (var5 != -1) {
          var6 = jd.field_c[var5];
          var7 = 285 - param0;
          var8 = 148;
          var6.b(var7, var8);
          wb.f(var7 - 2, var8 - 2, var6.field_k + 4, 4 + var6.field_h, 2, 1);
          wb.c(-1 + var7, var8 - 1, var6.field_k + 3, var6.field_h + 3, 1);
        }
    }

    private final int c(int param0) {
        int var2;
        int var3;
        var2 = 0;
        var3 = 87 % ((param0 - 70) / 52);
        if (nc.field_T != 0) {
          if (16 > nc.field_T) {
            var2 = nc.field_T * 640 / 16;
            if (Chess.field_G != 0) {
              var2 = (-nc.field_T * 640 + 20480) / 16;
            }
          } else {
            var2 = (-nc.field_T * 640 + 20480) / 16;
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Chess.field_G;
        var4 = 300 + param1;
        var5 = 50 + var4;
        var6 = var4;
        do {
          if (var6 >= var5) {
            var4 = param1 + 500;
            var5 = 75 + var4;
            break;
          }
          wb.d(var6, 0, 0, var6, 16777215, param0);
          var6++;
        } while (var7 == 0);
        var6 = var4;
        do {
          if (var6 >= var5) {
            var4 = 600 + param1;
            var5 = 25 + var4;
            break;
          }
          wb.d(var6, 0, 0, var6, 16777215, param0);
          var6++;
        } while (var7 == 0);
        if (param2 != 13551) {
          return;
        }
        var6 = var4;
        while (var5 > var6) {
          wb.d(var6, 0, 0, var6, 16777215, param0);
          var6++;
          if (var7 == 0) {
            continue;
          }
          break;
        }
        return;
    }

    final static void a(int param0, um param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        em var5 = null;
        int[] var6 = null;
        int var7 = 0;
        nk var8 = null;
        nk var9 = null;
        var7 = Chess.field_G;
        try {
          var8 = new nk(param1.a("logo.fo3d", 30045, ""));
          var9 = var8;
          if (param0 != -8428) {
            field_f = 65;
          }
          var3 = var9.i(param0 ^ 8372);
          var9.m(param0 ^ 18713);
          m.field_e = cl.a(param0 ^ 13190, var9);
          ei.field_v = new em[var3];
          ql.field_a = new int[var3][];
          var4 = 0;
          do {
            if (var4 >= var3) {
              var9.g((byte) 67);
              break;
            }
            ei.field_v[var4] = ac.a(var8, true);
            var4++;
          } while (var7 == 0);
          var4 = 0;
          while (var4 < var3) {
            var5 = ei.field_v[var4];
            var5.a(6, 6, (byte) -70, 6, 1);
            var5.a(param0 ^ -24341);
            var6 = new int[]{var5.field_K + var5.field_P >> 1, var5.field_I + var5.field_v >> 1, var5.field_x + var5.field_n >> 1};
            ql.field_a[var4] = var6;
            var5.a(-var6[1], -var6[0], -var6[2], (byte) -81);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("aa.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (hj.field_i) {
          var3 = param1 ? 1 : 0;
          uk.a(qk.field_h, var3 != 0, 28333, -5);
        }
        if (hl.field_h) {
          la.a(11, (byte) -60, 0);
        }
        if (param0 != 11) {
          this.field_d = -42;
        }
    }

    private final void e(int param0) {
        if (!this.field_e.b(false) &&
          vg.field_a == 98) {
          do {
            this.field_e.field_h = this.field_e.field_h - 1;
            if (0 > this.field_e.field_h) {
              this.field_e.field_h = -1 + this.field_e.field_f;
            }
          } while (ak.field_q[jc.field_f][this.field_e.field_h] == 35);
          this.field_e.field_e = false;
        }
        if (!this.field_e.b(false)) {
          if (vg.field_a != 99) {
          } else {
            do {
              this.field_e.field_h = this.field_e.field_h + 1;
              if (this.field_e.field_f <= this.field_e.field_h) {
                this.field_e.field_h = 0;
              }
            } while (ak.field_q[jc.field_f][this.field_e.field_h] == 35);
            this.field_e.field_e = false;
          }
        }
        if (param0 != -36) {
          field_i = -71;
        }
        this.field_e.b((byte) -61);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        wg var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var5Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var11 = Chess.field_G;
        if (param1 != 2) {
          field_f = -103;
        }
        var4 = ak.field_q[this.field_c][param2];
        if (this.field_e.d((byte) 91) &&
          var4 != 14 &&
          var4 != 15 &&
          var4 != 32) {
          wf.a(um.field_l[0], 59);
        }
        L2: {
          L3: {
            boolean decompiledFrameRemainder1 = true;
            L5: {
              L6: {
                boolean decompiledFrameRemainder19 = true;
                boolean decompiledFrameRemainder18 = true;
                boolean decompiledFrameRemainder17 = true;
                boolean decompiledFrameRemainder16 = true;
                boolean decompiledFrameRemainder15 = true;
                boolean decompiledFrameRemainder14 = true;
                boolean decompiledFrameRemainder13 = true;
                boolean decompiledFrameRemainder12 = true;
                boolean decompiledFrameRemainder11 = true;
                boolean decompiledFrameRemainder10 = true;
                boolean decompiledFrameRemainder9 = true;
                boolean decompiledFrameRemainder8 = true;
                boolean decompiledFrameRemainder7 = true;
                boolean decompiledFrameRemainder6 = true;
                boolean decompiledFrameRemainder5 = true;
                boolean decompiledFrameRemainder4 = true;
                boolean decompiledFrameRemainder3 = true;
                boolean decompiledFrameRemainder2 = true;
                L25: {
                  L26: {
                    L27: {
                      L28: {
                        boolean decompiledFrameRemainder0 = true;
                        var9 = var4;
                        if ((var9 != 0) &&
                          (decompiledFrameRemainder0 = (var9 != 1 ||
                          var11 != 0))) {
                          if (var9 == 2 &&
                            var11 == 0) {
                            break L28;
                          }
                          if (var9 == 37 &&
                            var11 == 0) {
                            break L28;
                          }
                          if (var9 == 6 &&
                            var11 == 0) {
                            break L27;
                          }
                          if (18 == var9 &&
                            var11 == 0) {
                            break L26;
                          }
                          if (var9 == 16 &&
                            var11 == 0) {
                            break L25;
                          }
                          decompiledFrameRemainder2 = (var9 != 4 ||
                            var11 != 0);
                          if ((decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder3 = (var9 != 7 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder4 = (var9 != 3 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder5 = (var9 != 14 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder6 = (var9 != 15)) &&
                            (decompiledFrameRemainder7 = (var9 != 5)) &&
                            (decompiledFrameRemainder8 = (var9 != 26 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder9 = (8 != var9 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder10 = (var9 != 9)) &&
                            (decompiledFrameRemainder11 = (10 != var9)) &&
                            (decompiledFrameRemainder12 = (11 != var9)) &&
                            (decompiledFrameRemainder13 = (var9 != 12 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder14 = (var9 != 17 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder15 = (var9 != 13 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder16 = (30 != var9 ||
                            var11 != 0)) &&
                            (decompiledFrameRemainder17 = (var9 != 27)) &&
                            (decompiledFrameRemainder18 = (28 != var9)) &&
                            (decompiledFrameRemainder19 = (29 != var9 ||
                            var11 != 0))) {
                            if (var9 == 31) {
                              break L6;
                            }
                            if (var9 == 19 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (var9 == 20 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (var9 == 21 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (22 == var9 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (var9 == 23 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (var9 == 24 &&
                              var11 == 0) {
                              break L5;
                            }
                            if (var9 == 25) {
                              break L5;
                            }
                            if (var9 == 33) {
                              break L2;
                            }
                            if (var9 == 34 &&
                              var11 == 0) {
                              break L3;
                            }
                            if (var9 == 35 &&
                              var11 == 0) {
                              break L3;
                            }
                            if (32 != var9) {
                              break L3;
                            }
                            decompiledFrameRemainder1 = (var11 != 0);
                          }
                        }
                        if ((decompiledFrameRemainder19) &&
                          (decompiledFrameRemainder18) &&
                          (decompiledFrameRemainder17) &&
                          (decompiledFrameRemainder16) &&
                          (decompiledFrameRemainder15) &&
                          (decompiledFrameRemainder14) &&
                          (decompiledFrameRemainder13) &&
                          (decompiledFrameRemainder12) &&
                          (decompiledFrameRemainder11) &&
                          (decompiledFrameRemainder10) &&
                          (decompiledFrameRemainder9) &&
                          (decompiledFrameRemainder8) &&
                          (decompiledFrameRemainder7) &&
                          (decompiledFrameRemainder6) &&
                          (decompiledFrameRemainder5) &&
                          (decompiledFrameRemainder4) &&
                          (decompiledFrameRemainder3) &&
                          (decompiledFrameRemainder2) &&
                          (decompiledFrameRemainder1) &&
                          (decompiledFrameRemainder0)) {
                          if (!this.field_e.d((byte) 34)) {
                            break L2;
                          }
                          qk.field_h = -3;
                          ph.a(-7125);
                          if (var11 == 0) {
                            break L3;
                          }
                        }
                        if ((decompiledFrameRemainder19) &&
                          (decompiledFrameRemainder18) &&
                          (decompiledFrameRemainder17) &&
                          (decompiledFrameRemainder16) &&
                          (decompiledFrameRemainder15) &&
                          (decompiledFrameRemainder14) &&
                          (decompiledFrameRemainder13) &&
                          (decompiledFrameRemainder12) &&
                          (decompiledFrameRemainder11) &&
                          (decompiledFrameRemainder10) &&
                          (decompiledFrameRemainder9) &&
                          (decompiledFrameRemainder8) &&
                          (decompiledFrameRemainder7) &&
                          (decompiledFrameRemainder6) &&
                          (decompiledFrameRemainder5) &&
                          (decompiledFrameRemainder4) &&
                          (decompiledFrameRemainder3) &&
                          (decompiledFrameRemainder2) &&
                          (decompiledFrameRemainder1)) {
                          if (!this.field_e.d((byte) 34)) {
                            break L3;
                          }
                          if (!vi.a(-3)) {
                            var9 = param0 ? 1 : 0;
                            uk.a(qk.field_h, var9 != 0, 28333, -4);
                            if (var11 == 0) {
                              break L3;
                            }
                          }
                          ca.a(0, v.field_j.field_t + (v.field_j.field_H - 2), v.field_j.field_H, gh.field_b, (byte) 113, 320, 240, gh.field_b, an.field_d, 8, 2, v.field_j, param0, 8, true);
                          if (var11 == 0) {
                            break L3;
                          }
                        }
                      }
                      if ((decompiledFrameRemainder19) &&
                        (decompiledFrameRemainder18) &&
                        (decompiledFrameRemainder17) &&
                        (decompiledFrameRemainder16) &&
                        (decompiledFrameRemainder15) &&
                        (decompiledFrameRemainder14) &&
                        (decompiledFrameRemainder13) &&
                        (decompiledFrameRemainder12) &&
                        (decompiledFrameRemainder11) &&
                        (decompiledFrameRemainder10) &&
                        (decompiledFrameRemainder9) &&
                        (decompiledFrameRemainder8) &&
                        (decompiledFrameRemainder7) &&
                        (decompiledFrameRemainder6) &&
                        (decompiledFrameRemainder5) &&
                        (decompiledFrameRemainder4) &&
                        (decompiledFrameRemainder3) &&
                        (decompiledFrameRemainder2) &&
                        (decompiledFrameRemainder1)) {
                        if (!this.field_e.d((byte) 84)) {
                          break L3;
                        }
                        var9 = param0 ? 1 : 0;
                        uk.a(qk.field_h, var9 != 0, 28333, -1);
                        if (var11 == 0) {
                          break L3;
                        }
                      }
                    }
                    if ((decompiledFrameRemainder19) &&
                      (decompiledFrameRemainder18) &&
                      (decompiledFrameRemainder17) &&
                      (decompiledFrameRemainder16) &&
                      (decompiledFrameRemainder15) &&
                      (decompiledFrameRemainder14) &&
                      (decompiledFrameRemainder13) &&
                      (decompiledFrameRemainder12) &&
                      (decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1)) {
                      if (!this.field_e.d((byte) 35)) {
                        break L3;
                      }
                      var9 = param0 ? 1 : 0;
                      uk.a(qk.field_h, var9 != 0, 28333, 0);
                      ma.field_D = false;
                      if (var11 == 0) {
                        break L3;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder19) &&
                    (decompiledFrameRemainder18) &&
                    (decompiledFrameRemainder17) &&
                    (decompiledFrameRemainder16) &&
                    (decompiledFrameRemainder15) &&
                    (decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5) &&
                    (decompiledFrameRemainder4) &&
                    (decompiledFrameRemainder3) &&
                    (decompiledFrameRemainder2) &&
                    (decompiledFrameRemainder1)) {
                    if (!this.field_e.d((byte) 36)) {
                      break L2;
                    }
                    var9 = param0 ? 1 : 0;
                    uk.a(qk.field_h, var9 != 0, 28333, 0);
                    mf.field_o = true;
                    if (var11 == 0) {
                      break L3;
                    }
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder2) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 101)) {
                    break L2;
                  }
                  var9 = param0 ? 1 : 0;
                  uk.a(qk.field_h, var9 != 0, param1 + 28331, 6);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder3) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 64)) {
                    break L2;
                  }
                  var9Lifetime3 = param0 ? 1 : 0;
                  uk.a(qk.field_h, var9Lifetime3 != 0, param1 ^ 28335, 5);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 40)) {
                    break L2;
                  }
                  var9Lifetime2 = pg.field_s;
                  var10 = param0 ? 1 : 0;
                  uk.a(qk.field_h, var10 != 0, 28333, var9Lifetime2);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder5) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 101)) {
                    break L3;
                  }
                  var9Lifetime1 = param0 ? 1 : 0;
                  uk.a(qk.field_h, var9Lifetime1 != 0, 28333, 4);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder6) &&
                  (decompiledFrameRemainder1)) {
                  var5 = lf.field_S;
                  if (this.field_e.a((byte) 94)) {
                    an.a(0, (byte) 81);
                  }
                  if (this.field_e.a(true)) {
                    an.a(80, (byte) 84);
                  }
                  if (this.field_e.b(false)) {
                    mi.field_q.c((byte) 57);
                    if (!mi.field_q.field_d) {
                      if (mi.field_q.field_i > hn.field_k) {
                        an.a(0, (byte) 87);
                        if (var11 != 0) {
                          an.a(80, (byte) 99);
                          an.a(mi.field_q.field_x, (byte) 95);
                        }
                      } else {
                        an.a(80, (byte) 99);
                        if (var11 != 0) {
                          an.a(mi.field_q.field_x, (byte) 95);
                        }
                      }
                    } else {
                      an.a(mi.field_q.field_x, (byte) 95);
                    }
                  }
                  if (this.field_e.a(-97)) {
                    dm.a(false);
                  }
                  if (this.field_e.b(97)) {
                    vm.g(1);
                  }
                  if (lf.field_S == var5) {
                    break L3;
                  }
                  mi.field_q.field_x = lf.field_S;
                  wf.a(um.field_l[0], 18);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder7) &&
                  (decompiledFrameRemainder1)) {
                  var5Lifetime1 = bc.field_b;
                  if (this.field_e.a((byte) 94)) {
                    rf.b(80, 0);
                  }
                  if (this.field_e.a(true)) {
                    rf.b(80, 80);
                  }
                  if (this.field_e.b(false)) {
                    hg.field_b.c((byte) 90);
                    if (hg.field_b.field_d) {
                      rf.b(80, hg.field_b.field_x);
                      if (var11 != 0) {
                        if (hg.field_b.field_i > hn.field_k) {
                          rf.b(param1 ^ 82, 0);
                          rf.b(param1 + 78, 80);
                        } else {
                          rf.b(param1 + 78, 80);
                        }
                      }
                    } else {
                      if (hg.field_b.field_i > hn.field_k) {
                        rf.b(param1 ^ 82, 0);
                        if (var11 != 0) {
                          rf.b(param1 + 78, 80);
                        }
                      } else {
                        rf.b(param1 + 78, 80);
                      }
                    }
                  }
                  if (this.field_e.a(param1 ^ -99)) {
                    cm.d((byte) -104);
                  }
                  if (this.field_e.b(97)) {
                    cl.a((byte) 27);
                  }
                  if (var5Lifetime1 != bc.field_b) {
                    hg.field_b.field_x = bc.field_b;
                    wf.a(um.field_l[0], -77);
                  }
                  ib.field_a = bc.field_b;
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder8) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 111)) {
                    break L3;
                  }
                  if (rm.field_R != null) {
                    b.a(true);
                    if (var11 == 0) {
                      break L3;
                    }
                  }
                  fk.a(param0, 15);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder9) &&
                  (decompiledFrameRemainder1)) {
                  var6 = rn.field_b;
                  if (this.field_e.c(84)) {
                    rn.field_b = rn.field_b + 1;
                  }
                  if (this.field_e.e(0)) {
                    rn.field_b = rn.field_b - 1;
                  }
                  if (2 < rn.field_b) {
                    rn.field_b = 0;
                  }
                  if (0 > rn.field_b) {
                    rn.field_b = 2;
                  }
                  if (rn.field_b == var6) {
                    break L3;
                  }
                  ph.a(-7125);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder10) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 99)) {
                    break L2;
                  }
                  lc.field_q = true;
                  qk.field_h = 0;
                  ma.field_D = false;
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder11) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 63)) {
                    break L2;
                  }
                  oc.field_p.h(28);
                  qk.field_h = -1;
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder12) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 92)) {
                    break L3;
                  }
                  oc.field_p.b(true);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder13) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 92)) {
                    break L2;
                  }
                  this.a(param1 + 9, param0);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder14) &&
                  (decompiledFrameRemainder1)) {
                  if (this.field_e.e(0)) {
                    tk.field_e = tk.field_e - 1;
                    if (tk.field_e < 0) {
                      tk.field_e = -1 + cm.field_r.length;
                    }
                  }
                  if (!this.field_e.c(84)) {
                    break L2;
                  }
                  tk.field_e = tk.field_e + 1;
                  if (cm.field_r.length != tk.field_e) {
                    break L2;
                  }
                  tk.field_e = 0;
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder15) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 68)) {
                    break L3;
                  }
                  if (this.field_c != 7) {
                    if (this.field_c != 6 &&
                      4 != jc.field_f) {
                      break L3;
                    }
                    hj.a(this.field_c, this.field_c, false);
                    if (var11 == 0) {
                      break L3;
                    }
                  }
                  hj.a(this.field_c, this.field_c, false);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder16) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 116)) {
                    break L3;
                  }
                  if (rm.field_R != null) {
                    b.a(true);
                  }
                  dh.a(bh.i(81), true);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder17) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 123)) {
                    break L3;
                  }
                  this.a((byte) 110, 5);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder18) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 119)) {
                    break L2;
                  }
                  this.a((byte) 125, 4);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if ((decompiledFrameRemainder19) &&
                  (decompiledFrameRemainder1)) {
                  if (!this.field_e.d((byte) 38)) {
                    break L2;
                  }
                  this.a((byte) 112, 2);
                  if (var11 == 0) {
                    break L3;
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (!this.field_e.d((byte) 114)) {
                    break L3;
                  }
                  this.a((byte) 118, 3);
                  if (var11 == 0) {
                    break L3;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                if (!this.field_e.d((byte) 43)) {
                  break L3;
                }
                oc.field_p.field_t.a(-1, false, -1);
                qk.field_h = -1;
                if (var11 == 0) {
                  break L3;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              if (this.field_e.field_e &&
                !this.field_e.d((byte) 84)) {
                break L3;
              }
              this.field_h = var4;
              if (var11 == 0) {
                break L3;
              }
            }
            var7 = nb.field_Fb;
            if (var7 != null ||
              var11 != 0) {
              var7.c((byte) -119);
              if (null != uh.i(param1 + 23154)) {
                var7.field_y = uh.i(param1 ^ 23158).field_t.a((byte) -113);
                if (var7.field_x == -1) {
                  var7.field_x = var7.field_y;
                }
              }
              var8 = 0;
              if (this.field_e.b(97)) {
                nb.field_Fb.field_x = nb.field_Fb.field_x + 1;
                if (nb.field_Fb.field_y < nb.field_Fb.field_x) {
                  nb.field_Fb.field_x = nb.field_Fb.field_y;
                }
                var8 = 1;
              }
              if (this.field_e.a(param1 - 99)) {
                nb.field_Fb.field_x = nb.field_Fb.field_x - 1;
                if (0 > nb.field_Fb.field_x) {
                  nb.field_Fb.field_x = 0;
                }
                var8 = 1;
              }
              if (var7.field_d &&
                nb.field_Fb.field_x != uh.i(23156).field_t.field_o) {
                var8 = 1;
              }
              if (var8 != 0) {
                uh.i(23156).field_t.field_o = nb.field_Fb.field_x;
                wf.a(um.field_l[0], param1 + 122);
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        if (param0 < 108) {
          this.field_d = 116;
        }
        if (uh.i(23156) != null &&
          param1 != 0) {
          uh.i(23156).field_l = param1;
          qk.field_h = -1;
          uh.i(23156).a(uh.i(23156).field_u, -111);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        wg var4 = null;
        wg var5 = null;
        var3 = Chess.field_G;
        var2 = 0;
        while (var2 < 5) {
          ok.field_Ib[var2].b(-108);
          var2++;
          if (var3 == 0) {
            continue;
          }
          break;
        }
        var4 = nb.field_Fb;
        var5 = var4;
        if (var5 != null) {
          if (ok.field_Ib[0].field_d) {
            var4.field_x = 0;
          }
          if (ok.field_Ib[1].field_d) {
            var5.field_x = var5.field_x - 1;
          }
          if (ok.field_Ib[2].field_u) {
            this.field_b = 50 + r.field_Eb;
          }
          if (ok.field_Ib[2].field_d &&
            this.field_b <= r.field_Eb) {
            this.field_b = r.field_Eb + 50;
            var5.field_x = var5.field_x + 1;
          }
          if (ok.field_Ib[3].field_d) {
            var5.field_x = var5.field_x + 1;
          }
          if (ok.field_Ib[4].field_d) {
            var5.field_x = var5.field_y;
          }
          var5.c((byte) 73);
        }
        if (param0 >= -91) {
          return;
        }
        if (this.field_d == 0) {
          this.field_d = th.field_d;
        }
        if (!r.field_bc &&
          !fi.field_a) {
          while (true) {
            if (kf.d(18954)) {
              this.b((byte) 101);
              if (var3 == 0) {
                continue;
              }
            } else {
              this.field_e.a(61, ak.field_k[this.field_c], ak.field_r[this.field_c], ak.field_y[this.field_c], ak.field_m[this.field_c]);
            }
            if (-1 == this.field_e.field_h) {
              break;
            }
            this.a(true, 2, this.field_e.field_h);
            break;
          }
        }
        qd.field_w.a(-0.1, (double)r.field_Eb / 300.0, true);
    }

    final void a(byte param0, boolean param1, int param2) {
        if (this.field_e.field_h != -1) {
          param2 = this.field_e.field_h;
        }
        this.field_e.a(param2, this.a(hn.field_k, (byte) -89, rf.field_b), param1, 0);
        if (param0 >= 92) {
          ad.field_a = -1;
          qf.field_e = -1;
          return;
        }
    }

    final void c(byte param0) {
        if (param0 != -57) {
          return;
        }
        if (this.field_c == 4) {
          ce.field_b = null;
        }
    }

    aa(int param0) {
        this.field_h = 19;
        this.field_d = th.field_d;
        this.field_c = param0;
        this.field_e = new of(ak.field_q[this.field_c].length);
    }

    private final void a(int param0, boolean param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        boolean stackIn_28_0 = false;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_72_0 = 0;
        boolean stackOut_27_0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        int[] var14 = null;
        Object var15_ref = null;
        String var15_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        c var19 = null;
        c var21 = null;
        int[] var24 = null;
        int var7Lifetime1;
        int var10Lifetime1;
        int var13Lifetime1;
        var18 = Chess.field_G;
        var19 = v.field_j;
        var21 = var19;
        var5 = param2 + 90;
        var24 = new int[4];
        wb.b(var24);
        wb.b(5 + var5, 135, var5 + 455, 385);
        var7 = 16772045;
        wb.c(5 + var5, 135, 450, 250, 13875857, 15987691);
        var7Lifetime1 = 5189423;
        var8 = 0;
        if (param0 != -18210) {
          this.c((byte) 94);
        }
        var9 = 16;
        while (true) {
          stackIn_4_0 = -481;
          if (stackIn_4_0 < ~var9) {
            stackIn_18_0 = 16;
            if (var18 == 0) {
              var10 = stackIn_18_0;
              while (640 > var10) {
                stackIn_4_0 = var8;
                stackIn_12_0 = (stackIn_4_0 != 0) ? 0 : 1;
                var8 = stackIn_12_0;
                if (var8 != 0) {
                  wb.b(var10, var9, 44, 44, var7Lifetime1, 16);
                }
                var10 += 44;
              }
              var9 += 44;
              continue;
            }
          } else {
            wb.a(var24);
            stackIn_18_0 = param1 ? 1 : 0;
          }
          if (stackIn_18_0 != 0) {
            stackIn_21_0 = vk.field_b;
          } else {
            stackIn_21_0 = wc.field_w;
          }
          var9 = stackIn_21_0;
          var10Lifetime1 = var5 + 10;
          ad.field_a = -1;
          var11 = 146;
          if ((1024 & var9) == 0 &&
            qm.field_g != 1) {
            var12 = 44;
            if (var18 != 0) {
              var12 = 40;
            }
          } else {
            var12 = 40;
          }
          var13 = 0;
          while (true) {
            if (!(var13 < da.field_m.length)) {
              var10Lifetime1 = 16 + (var5 + param2);
              var11 = 210 + var21.field_q;
              this.field_d = 0;
              stackIn_63_0 = 0;
              break;
            }
            stackOut_27_0 = qm.field_f[var13];
            stackIn_63_0 = stackOut_27_0 ? 1 : 0;
            stackIn_28_0 = stackOut_27_0;
            if (var18 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 ||
                0 != (var9 & 1 << var13)) {
                if (-1 == ad.field_a &&
                  hn.field_k >= var10Lifetime1 &&
                  var10Lifetime1 + var12 >= hn.field_k &&
                  rf.field_b >= var11 &&
                  rf.field_b <= var11 + 32) {
                  ad.field_a = var13;
                  if (1 == this.field_d) {
                    if (qf.field_e != ad.field_a) {
                      qf.field_e = ad.field_a;
                    } else {
                      qf.field_e = -1;
                    }
                    this.field_d = 0;
                  }
                }
                if ((1 << var13 & var9) == 0) {
                  decompiledFrameRemainder0 = !(param1);
                  if (decompiledFrameRemainder0) {
                    if (var13 == qf.field_e) {
                      lj.field_n.c(6 + var10Lifetime1 + param2, var11);
                    } else if (var13 != ad.field_a) {
                      lj.field_n.c(param2 + 6 + var10Lifetime1, var11);
                    } else {
                      lj.field_n.c(6 + (var10Lifetime1 + param2), var11);
                    }
                  }
                } else {
                  me.field_c[var13].c(6 + var10Lifetime1, var11);
                }
                if (decompiledFrameRemainder0) {
                  if (ad.field_a == var13) {
                    wb.g(var10Lifetime1 + 6, var11, 32, 32, 3100495, 64);
                  }
                  if (var13 == qf.field_e) {
                    wb.d(var10Lifetime1 + 6, var11, 32, 32, 3100495);
                  }
                  wb.a(-10 + var10Lifetime1, 32 + (var11 + 5), var12 + 20, 1);
                  var10Lifetime1 = var10Lifetime1 + var12;
                }
              }
              var13++;
              continue;
            }
            break;
          }
          if (stackIn_63_0 == ~qf.field_e) {
            stackIn_66_0 = ad.field_a;
          } else {
            stackIn_66_0 = qf.field_e;
          }
          boolean decompiledFrameCompleted0 = true;
          var13Lifetime1 = stackIn_66_0;
          if (-1 != var13Lifetime1) {
            var21.b("<u=000001>" + da.field_m[var13Lifetime1] + "</u>", param2 + 320, 210, 1, -1);
            if (vi.a(param0 + 18207)) {
              jj.field_b.b(bf.field_N, 320 + param2, var11, 1, -1);
            }
            stackIn_72_0 = ((1 << var13Lifetime1 & var9) == 0) ? 0 : 1;
            var14_int = stackIn_72_0;
            var15_ref = null;
            if (var14_int != 0) {
              me.field_c[var13Lifetime1].a(var10Lifetime1, var11);
              var15_ref_String = ca.field_d;
            } else {
              lj.field_n.a(var10Lifetime1, var11);
              var15_ref_String = hm.field_d;
            }
            var21.a(var15_ref_String, var10Lifetime1, lj.field_n.field_h + var11 + var21.field_q, 1, -1);
            var10Lifetime1 = var10Lifetime1 + (16 + lj.field_n.field_k + 20);
            var16 = 460 + var5;
            var19.a(ai.field_a[var13Lifetime1], var10Lifetime1, var11, -var10Lifetime1 + (-10 + var16), 480, 1, -1, 0, 0, var21.field_C);
            var11 += 7;
            var21.a(pd.field_Ob + ma.field_J[var13Lifetime1], var10Lifetime1, var11 + 4 * var21.field_q, 1, -1);
            var11 = var11 + (-(ao.field_e.field_h / 4) + 128);
            var21.a(hc.field_d, var10Lifetime1, var21.field_C + var11, 1, -1);
            var17 = 0;
            while (var17 < se.field_ab[var13Lifetime1]) {
              ao.field_e.c(var17 * 5 + var21.b(hc.field_d) + (10 + var10Lifetime1), var11);
              var17++;
              if (var18 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if ((decompiledFrameCompleted0) &&
              (var18 != 0)) {
              var21.b(gh.field_d, param2 + 320, 210, 1, -1);
            }
          } else {
            var21.b(gh.field_d, param2 + 320, 210, 1, -1);
          }
          var14 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
          var15 = 4;
          while (var15 >= 0) {
            wb.a(var15 + var5, var15 + 130, 460 - (var15 << 1), 260 - (var15 << 1), 10 - var15, var14[var15]);
            wb.a(var15 + var5, var15 + 130, 460 - (var15 << 1), 260 - (var15 << 1), 10 - (var15 << 1), var14[var15]);
            var15--;
            if (var18 == 0) {
              continue;
            }
            break;
          }
          return;
        }
    }

    final static km[] a(km param0, int param1) {
        km[] var2 = null;
        RuntimeException var2_ref = null;
        km[] var3 = null;
        km[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new km[9];
          var2 = var3;
          var3[param1] = param0;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("aa.I(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
          field_g = (ci) null;
        }
    }

    private final void b(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_46_0 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        int[] var10 = null;
        String var11_ref_String = null;
        int var11 = 0;
        String[] var12_ref_String__ = null;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22_int = 0;
        String var22 = null;
        int var23_int = 0;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        String var26 = null;
        String var27 = null;
        String var28 = null;
        int var29 = 0;
        c var31 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        int[] var37 = null;
        String var25Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        int var17Lifetime1;
        var29 = Chess.field_G;
        var31 = v.field_j;
        ak.field_y[4] = ak.field_y[6];
        if (param0 != -481) {
          return;
        }
        var4 = 70 + param1;
        var37 = new int[4];
        wb.b(var37);
        wb.b(5 + var4, 135, -10 + var4 + 5 + 500, 385);
        wb.c(5 + var4, 135, 490, 250, 13875857, 15987691);
        var6 = 16772045;
        var6Lifetime1 = 5189423;
        var7 = 0;
        var8 = 16;
        while (true) {
          stackIn_4_0 = -481;
          if (stackIn_4_0 < ~var8) {
            stackIn_17_0 = 16;
            if (var29 == 0) {
              var9 = stackIn_17_0;
              while (var9 < 640) {
                stackIn_4_0 = var7;
                stackIn_12_0 = (stackIn_4_0 != 0) ? 0 : 1;
                var7 = stackIn_12_0;
                if (var7 != 0) {
                  wb.b(var9, var8, 44, 44, var6Lifetime1, 16);
                }
                var9 += 44;
              }
              var8 += 44;
              continue;
            }
          } else {
            wb.a(var37);
            var8 = 110 + param1;
            stackIn_17_0 = 550 + param1;
          }
          var9Lifetime1 = stackIn_17_0;
          if (!vi.a(-3)) {
            if (ce.field_b == null) {
              ce.field_b = ge.a(true, 7, 0, 10);
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var10_int = tk.field_e;
            if (!ce.field_b.field_l) {
              var11_ref_String = m.field_c;
              decompiledFrameRemainder0 = (var29 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == ce.field_b.field_t) {
                var11_ref_String = ii.field_O;
                decompiledFrameRemainder0 = (var29 != 0);
              }
              if (decompiledFrameRemainder0) {
                var11_ref_String = um.field_h;
                var12_ref_String__ = ce.field_b.field_t[var10_int];
                var13 = ce.field_b.field_j[var10_int];
                var14 = 140 + var31.field_C;
                var15 = 1;
                var31.a(ao.field_j, var8, var14, var15, -1);
                var31.c(tk.field_f, -220 + var9Lifetime1, var14, var15, -1);
                var31.c(qe.field_y, var9Lifetime1 - 150, var14, var15, -1);
                var31.b(fm.field_O, -115 + var9Lifetime1, var14, var15, -1);
                var31.b(mh.field_g, var9Lifetime1 - 65, var14, var15, -1);
                var31.b(kl.field_a, var9Lifetime1 - 15, var14, var15, -1);
                wb.e(-35 + var8, 1 + var14, 50 + var9Lifetime1 - var8, 1, 128);
                wb.e(var8 - 35, var14 + 1 + 2, -var8 + var9Lifetime1 + 50, 1, 128);
                var14 += 20;
                var16 = 0;
                var17 = 0;
                while (var17 < 10) {
                  if (var29 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (null != var12_ref_String__[var17]) {
                    var18 = 1;
                    var19 = var13[4 * var17 + 1];
                    var20 = var13[var17 * 4 + 2];
                    var21 = var13[var17 * 4 + 3];
                    var22_int = var13[4 * var17];
                    var23_int = var19 - (-var20 - var21);
                    var32 = var12_ref_String__[var17];
                    if (qd.a((byte) 13, var32)) {
                      var16 = 1;
                      var18 = 13732679;
                    }
                    var31.c(var17 + 1 + ". ", var8, var14, var18, -1);
                    var31.a(var32, var8, var14, var18, -1);
                    var31.c(Integer.toString(var22_int), -220 + var9Lifetime1, var14, var18, -1);
                    if (var23_int > 50) {
                      stackIn_35_0 = "50+";
                    } else {
                      stackIn_35_0 = Integer.toString(var23_int);
                    }
                    var33 = stackIn_35_0;
                    var25 = var33;
                    var31.c(var33, var9Lifetime1 - 150, var14, var18, -1);
                    if (var23_int != 0) {
                      var26 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var19 / var23_int)}, (byte) -95);
                      var27 = oc.a(wf.field_S, new String[]{Integer.toString(var21 * 100 / var23_int)}, (byte) -59);
                      var28 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var20 / var23_int)}, (byte) -96);
                    } else {
                      var28 = Chess.field_C;
                      var27 = Chess.field_C;
                      var26 = Chess.field_C;
                    }
                    var31.b(var26, var9Lifetime1 - 115, var14, var18, -1);
                    var31.b(var27, -65 + var9Lifetime1, var14, var18, -1);
                    var31.b(var28, var9Lifetime1 - 15, var14, var18, -1);
                    wb.e(var8 - 35, var14 + 1, var9Lifetime1 - var8 + 50, 1, 32);
                    wb.a(-278 + var9Lifetime1, -19 + var14, 20, 1, 16);
                    wb.a(-215 + var9Lifetime1, 1 - (-var14 + 20), 20, 1, 16);
                    wb.a(var9Lifetime1 - 140, 1 + var14 - 20, 20, 1, 16);
                    wb.a(-90 + var9Lifetime1, -20 + (var14 + 1), 20, 1, 16);
                    var11_ref_String = "";
                    wb.a(var9Lifetime1 - 40, var14 - 19, 20, 1, 16);
                  }
                  var14 += 20;
                  var17++;
                }
                if ((decompiledFrameCompleted0) &&
                  (var16 == 0 &&
                  var11_ref_String.length() == 0)) {
                  var17Lifetime1 = 13732679;
                  var31.a(ci.field_J, var8, var14, var17Lifetime1, -1);
                  var31.c(Integer.toString(ce.field_b.field_k), var9Lifetime1 - 220, var14, var17Lifetime1, -1);
                  var18 = ce.field_b.field_m;
                  var19 = ce.field_b.field_r;
                  var20 = ce.field_b.field_p;
                  var21 = var20 + var18 + var19;
                  if (50 < var21) {
                    stackIn_46_0 = "50+";
                  } else {
                    stackIn_46_0 = Integer.toString(var21);
                  }
                  var34 = stackIn_46_0;
                  var25Lifetime1 = var34;
                  var31.c(var34, -150 + var9Lifetime1, var14, var17Lifetime1, -1);
                  if (0 != var21) {
                    var22 = oc.a(wf.field_S, new String[]{Integer.toString(100 * var18 / var21)}, (byte) -102);
                    var23 = oc.a(wf.field_S, new String[]{Integer.toString(var19 * 100 / var21)}, (byte) -88);
                    var24 = oc.a(wf.field_S, new String[]{Integer.toString(var20 * 100 / var21)}, (byte) -98);
                  }
                  if (0 == var21 ||
                    var29 != 0) {
                    var24 = Chess.field_C;
                    var23 = Chess.field_C;
                    var22 = Chess.field_C;
                  }
                  var31.b(var22, var9Lifetime1 - 115, var14, var17Lifetime1, -1);
                  var31.b(var23, -65 + var9Lifetime1, var14, var17Lifetime1, -1);
                  var31.b(var24, var9Lifetime1 - 15, var14, var17Lifetime1, -1);
                }
              }
            }
            var12 = 100 + var31.field_C + 140;
            var31.b(var11_ref_String, param1 + 330, var12, 1, -1);
            if (var29 != 0) {
              v.field_j.b(bf.field_N, param1 + 320, 240, 1, -1);
            }
          } else {
            v.field_j.b(bf.field_N, param1 + 320, 240, 1, -1);
          }
          var10 = new int[]{1, 16777215, 3100495, 3100495, 3100495};
          var11 = 4;
          while (var11 >= 0) {
            wb.a(var11 + var4, 130 + var11, 500 - (var11 << 1), 260 - (var11 << 1), -var11 + 10, var10[var11]);
            wb.a(var11 + var4, var11 + 130, -(var11 << 1) + 500, -(var11 << 1) + 260, 10 - (var11 << 1), var10[var11]);
            var11--;
            if (var29 == 0) {
              continue;
            }
            break;
          }
          return;
        }
    }

    private final int e(int param0, int param1) {
        if (param0 != 0) {
          this.field_h = -33;
        }
        if (4 == this.field_c &&
          !vi.a(-3)) {
          return 2 > param1 ? 100 + 240 * param1 : 260;
        }
        if (this.field_c == 5) {
          return 180 * param1 + ak.field_k[this.field_c];
        }
        return ak.field_k[this.field_c];
    }

    private final void a(int param0) {
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        eb stackIn_57_0 = null;
        boolean stackIn_59_1 = false;
        Object var2 = null;
        km var2_ref = null;
        qe var3 = null;
        int var4 = 0;
        int var5_int = 0;
        wg var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int var9 = 0;
        String var10_ref_String = null;
        int var10 = 0;
        String[] var11_ref_String__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int[] var20 = null;
        int var9Lifetime1;
        boolean decompiledFrameRemainder1 = true;
        var15 = Chess.field_G;
        if (uh.i(23156) != null) {
          boolean decompiledFrameRemainder0 = true;
          uh.i(23156).field_t.f(nb.field_Fb.field_y, -1);
          var2 = null;
          var3 = uh.i(param0 + 5234).field_t.field_K;
          if (var3 == null) {
            var4 = -1;
            decompiledFrameRemainder0 = (var15 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (!((uk) ((Object) var3)).a((byte) 61, 4096)) {
              if (((uk) ((Object) var3)).a((byte) 61, 0)) {
                var4 = 1;
                decompiledFrameRemainder0 = (var15 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (uh.i(23156).field_B.field_d) {
                  var4 = eg.a(uh.i(param0 ^ 7286).field_B.field_l, 0, uh.i(23156).field_B.field_k);
                  if (var15 != 0) {
                    var4 = -1;
                    var4 = 0;
                  }
                } else {
                  var4 = -1;
                  if (var15 != 0) {
                    var4 = 0;
                  }
                }
              }
            } else {
              var4 = 0;
            }
          }
          boolean decompiledFrameRemainder2 = true;
          var5_int = var4;
          if (var5_int != 0) {
            if (var5_int == 1 &&
              var15 == 0) {
              var2_ref = vn.field_Bb;
              decompiledFrameRemainder2 = false;
            }
            else {
              if ((var5_int != -1) &&
                (-3 != var5_int)) {
                var2_ref = fa.field_e;
                decompiledFrameRemainder2 = false;
              }
              if ((decompiledFrameRemainder2) &&
                (var5_int == -1 ||
                var15 == 0)) {
                var2_ref = fa.field_e;
                decompiledFrameRemainder2 = false;
              }
            }
          }
          if (decompiledFrameRemainder2) {
            var2_ref = jh.field_b;
          }
          boolean decompiledSharedTail0 = !(16 <= nc.field_T);
          if (!decompiledSharedTail0) {
            this.b(param0 - 17792);
            var2_ref.b(0, 0, (-4096 + nc.field_T * 256) / 16);
            decompiledSharedTail0 = (var15 != 0);
          }
          if (decompiledSharedTail0) {
            var2_ref.d(0, 0);
            wb.a(15, 16, 210, 2 * ec.c((byte) -63) + 435, 9, 13421772, 96);
          }
          var5 = nb.field_Fb;
          if (var5 != null) {
            var5.field_y = uh.i(23156).field_t.a((byte) -114);
            if (var5.field_x == -1) {
              var5.field_x = var5.field_y;
            }
          }
          var6 = ec.c((byte) -63) * 2 + 435;
          var7 = ak.field_m[3] + this.field_e.field_f * ak.field_y[this.field_c];
          wb.a(21, 218, 198, var6 - var7, 9, 1, 170);
          var8 = uh.i(param0 + 5234).field_t.field_L;
          if (var8 == null ||
            0 == var8.length) {
            var9 = v.field_j.field_t + v.field_j.field_C;
            var10_ref_String = wc.field_F;
            var11_ref_String__ = new String[50];
            var20 = new int[50];
            var13 = 0;
            while (true) {
              if (var13 < 50) {
                var20[var13] = 200;
                var13++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var13 = v.field_j.a(var10_ref_String, var20, var11_ref_String__);
              }
              break;
            }
            var14 = var13 * var9 + var9 / 2;
            wb.a(331, 191, 218, 18 + var14, 9, 13421772, 96);
            wb.a(335, 195, 210, var14 + 10, 9, 1, 170);
            v.field_j.a(var10_ref_String, 340, 200, 200, var14, 16777215, 1, 1, 1, var9);
            decompiledFrameRemainder1 = (var15 != 0);
          }
          if (decompiledFrameRemainder1) {
            uh.i(param0 ^ 7286).field_t.a(true, r.field_Eb, nb.field_Fb.field_x);
            var9Lifetime1 = var8.length;
            var11 = -1 + var9Lifetime1;
            var12 = 256;
            while (true) {
              boolean decompiledFrameRemainder3 = true;
              if (var11 >= 0) {
                stackIn_51_0 = 0;
                stackIn_51_1 = var12;
                decompiledFrameRemainder3 = (var15 == 0);
                if ((decompiledFrameRemainder3) &&
                  (stackIn_51_0 < stackIn_51_1)) {
                  var10 = (var11 - var9Lifetime1) * v.field_j.field_q + var6;
                  var12 = 256 * (-var7 + var10) / (var6 - var7);
                  if (var12 >= 0) {
                    v.field_j.a(var8[var11], ak.field_k[10], var10 + v.field_j.field_C, 16777215, 1, var12);
                  }
                  var11--;
                  continue;
                }
              }
              if (decompiledFrameRemainder3) {
                if (!uh.i(23156).field_b) {
                  break;
                }
                stackIn_51_0 = param0;
                stackIn_51_1 = 7286;
              }
              uh.i(stackIn_51_0 ^ stackIn_51_1).c(param0 - 17921, true);
              break;
            }
          }
        }
        if (param0 != 17922) {
          var16 = (String) null;
          aa.a((java.applet.Applet) null, -125, (String) null);
        }
        nb.b(0, 25);
        qh.field_b.field_J = (lh) ((Object) jj.field_b);
        stackIn_57_0 = qh.field_b;
        stackIn_59_1 = (hl.field_h) || (pk.field_j);
        stackIn_57_0.field_C = stackIn_59_1;
        qh.field_b.d((byte) -2);
    }

    private final void b(int param0) {
        qe stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        boolean stackIn_11_2 = false;
        if (uh.i(param0 ^ 23286) == null) {
          wb.b(0, 0, 640, 480, 1, 64);
          return;
        }
        if (param0 != 130) {
          field_a = (String) null;
        }
        boolean decompiledSharedTail0 = !(uh.i(23156).field_g);
        if (!decompiledSharedTail0) {
          uh.i(23156).field_t.h(-78);
          decompiledSharedTail0 = (Chess.field_G != 0);
        }
        if (decompiledSharedTail0) {
          stackIn_10_0 = uh.i(23156).field_t;
          stackIn_10_1 = uh.i(23156).b(0);
          stackIn_11_2 = (jc.field_f == -1);
          ((qe) (Object) stackIn_10_0).a(stackIn_10_1, stackIn_11_2, qb.field_a, 0, (byte) -104, true);
        }
    }

    static {
        field_a = "Log in / Create account";
    }
}
