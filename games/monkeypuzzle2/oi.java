/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi {
    static String field_d;
    private int field_b;
    private int field_c;
    private boolean field_a;
    static int field_f;
    static String field_g;
    private int[] field_h;
    static String field_i;
    static int[] field_e;

    final void b(int param0, int param1) {
        this.a((byte) -102, param0, this.field_c + 1);
        if (param1 >= -58) {
          this.d(6, 81);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 <= param5) {
          if (param5 < param0) {
            hk.a(param3, param11, ge.field_i, param1, param0, param10, param7, param15, param6, param13, param8, param9, param2, param5, param14, param12, param4 ^ -972948596);
          } else {
            if (param0 > param2) {
              hk.a(param11, param3, ge.field_i, param1, param5, param7, param10, param14, param9, param13, param8, param6, param2, param0, param15, param12, -972948528);
            } else {
              hk.a(param1, param3, ge.field_i, param11, param5, param13, param10, param12, param9, param7, param6, param8, param0, param2, param15, param14, -972948528);
            }
          }
        } else {
          if (param2 < param0) {
            hk.a(param1, param11, ge.field_i, param3, param0, param13, param7, param12, param6, param10, param9, param8, param5, param2, param14, param15, param4 - 972948620);
          } else {
            if (param0 > param5) {
              hk.a(param11, param1, ge.field_i, param3, param2, param7, param13, param14, param8, param10, param9, param6, param5, param0, param12, param15, -972948528);
            } else {
              hk.a(param3, param1, ge.field_i, param11, param2, param10, param13, param15, param8, param7, param6, param9, param0, param5, param12, param14, -972948528);
            }
          }
        }
        if (param4 != 92) {
          oi.a(-117, 1, -102, -125, (byte) -77, -28, -81, -29, -117, 64, -77, -95, -125, -71, 10, -90);
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (this.field_c < param2) {
          this.field_c = param2;
        }
        if (param2 >= this.field_h.length) {
          this.c(param2, 537);
        }
        if (param0 > -73) {
          field_g = (String) null;
        }
        this.field_h[param2] = param1;
    }

    public static void a(byte param0) {
        field_i = null;
        field_g = null;
        field_d = null;
        field_e = null;
        if (param0 >= -78) {
          oi.a(-14);
        }
    }

    final int d(int param0, int param1) {
        if (this.field_c < param1) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (param0 == -22544) {
          return this.field_h[param1];
        }
        return 125;
    }

    private final void c(int param0, int param1) {
        int[] var4 = null;
        if (param1 == 537) {
          var4 = new int[this.a(64, param0)];
          int[] var3 = var4;
          gl.a(this.field_h, 0, var4, 0, this.field_h.length);
          this.field_h = var4;
          return;
        }
    }

    final int b(int param0) {
        if (param0 != -1) {
          oi.a(-69, 61, -53, 117, (byte) -106, 42, -64, 124, -57, -110, 103, -105, 63, 4, -77, 36);
        }
        return this.field_c + 1;
    }

    final static void a(int param0) {
        hi.field_b = gg.b(-11451);
        wg.field_j = new kj();
        if (param0 != -2) {
          oi.a(-67);
        }
        ll.a((byte) 91, true, true);
    }

    final void a(byte param0, int param1) {
        if (param1 < 0) {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
        if (this.field_c >= param1) {
          if (param1 != this.field_c) {
            gl.a(this.field_h, param1 + 1, this.field_h, param1, this.field_c - param1);
          }
          int var3 = -21 / ((2 - param0) / 57);
          this.field_c = this.field_c - 1;
          return;
        }
        throw new ArrayIndexOutOfBoundsException(param1);
    }

    private oi() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        int stackIn_30_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_42_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ki var4_ref_ki = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ki var9_ref_ki = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16_ref = null;
        ki var16_ref_ki = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        Object var19 = null;
        ki var19_ref = null;
        int var20 = 0;
        int var17Lifetime1;
        var16_ref = null;
        var19 = null;
        var20 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = 148;
          var2 = 1;
          var3 = -42 / ((param0 + 12) / 41);
          var4_ref_ki = (ki) (wd.field_h.a((byte) -117));
          while (var4_ref_ki != null) {
            if (var2 == 0) {
              var4_ref_ki.f(-7);
              var4_ref_ki.field_B = 602.0f;
              var4_ref_ki.field_q = (float)var1_int;
              var1_int += 59;
              if (var4_ref_ki.field_w == 6) {
                h.a(1, true);
              }
            } else {
              var2 = 0;
              var4_ref_ki.field_q = -100.0f;
              var4_ref_ki.field_B = -100.0f;
            }
            var4_ref_ki = (ki) (wd.field_h.d((byte) 63));
          }
          if (wd.field_h.b(-113) < 6 &&
            hd.field_u.e(11253) &&
            !ub.field_a &&
            !lc.field_f) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9_ref_ki = (ki) (ok.field_a.a((byte) -117));
            while (var9_ref_ki != null) {
              if (2 == var9_ref_ki.field_l) {
                var8 = 1;
              }
              if (4 == var9_ref_ki.field_l) {
                var4 = 1;
              }
              if (var9_ref_ki.field_l == 1) {
                var7 = 1;
              }
              if (0 == var9_ref_ki.field_l) {
                var6 = 1;
              }
              if (var9_ref_ki.field_l == 3) {
                var5 = 1;
              }
              var9_ref_ki = (ki) (ok.field_a.d((byte) 63));
            }
            stackIn_30_0 = (var8 == 0) ? 0 : 1;
            if (var5 == 0) {
              stackIn_33_1 = 0;
            } else {
              stackIn_33_1 = 1;
            }
            stackIn_35_0 = stackIn_30_0 + stackIn_33_1;
            if (var4 != 0) {
              stackIn_36_1 = 1;
            } else {
              stackIn_36_1 = 0;
            }
            stackIn_38_0 = stackIn_35_0 + stackIn_36_1;
            if (var7 != 0) {
              stackIn_39_1 = 1;
            } else {
              stackIn_39_1 = 0;
            }
            if (var6 == 0) {
              stackIn_42_2 = 0;
            } else {
              stackIn_42_2 = 1;
            }
            var9 = stackIn_38_0 + (stackIn_39_1 + stackIn_42_2);
            var10 = 0;
            var11 = 0;
            var12 = 0;
            var13 = 0;
            var14 = 0;
            var15 = 0;
            var16_ref_ki = (ki) (wd.field_h.c(-1));
            while (var16_ref_ki != null) {
              if (var16_ref_ki.field_w == 6) {
                var10++;
              }
              var17 = var16_ref_ki.field_l;
              if (var17 != 4) {
                if (var17 == 1) {
                  var11++;
                } else {
                  if (3 != var17) {
                    if (var17 != 0) {
                      if (2 == var17) {
                        var15++;
                      }
                    } else {
                      var14++;
                    }
                  } else {
                    var13++;
                  }
                }
              } else {
                var12++;
              }
              var16_ref_ki = (ki) (wd.field_h.a(true));
            }
            if (var12 > 2 &&
              var9 > 1) {
              var4 = 0;
              var9--;
            }
            if (var11 > 2 &&
              1 < var9) {
              var7 = 0;
              var9--;
            }
            if (var15 > 2 &&
              1 < var9) {
              var9--;
              var8 = 0;
            }
            if (var13 > 2 &&
              var9 > 1) {
              var9--;
              var5 = 0;
            }
            if (var14 > 2 &&
              var9 > 1) {
              var9--;
              var6 = 0;
            }
            if (var9 <= 0) {
              return;
            }
            while (wd.field_h.b(-65) < 6) {
              boolean decompiledFrameRemainder0 = true;
              var16 = -1;
              var17Lifetime1 = pf.a((byte) 22, var9);
              var18 = -1;
              if (var7 != 0) {
                var18++;
                if (var17Lifetime1 == var18) {
                  var16 = 1;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                if (var4 != 0) {
                  var18++;
                  if (var17Lifetime1 == var18) {
                    var16 = 4;
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (var5 != 0) {
                    var18++;
                    if (var17Lifetime1 == var18) {
                      var16 = 3;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    if (var6 != 0) {
                      var18++;
                      if (var17Lifetime1 == var18) {
                        var16 = 0;
                        decompiledFrameRemainder0 = false;
                      }
                    }
                    if ((decompiledFrameRemainder0) &&
                      (var8 != 0)) {
                      var18++;
                      if (var18 == var17Lifetime1) {
                        var16 = 2;
                      }
                    }
                  }
                }
              }
              var19_ref = (ki) (ri.field_b.d(4011));
              if (!(Math.random() < 0.95) &&
                dc.field_c >= 3 &&
                var10 <= 1) {
                var19_ref.a(6, var16, -1);
                h.a(1, true);
              } else {
                var19_ref.a(1, var16, -1);
              }
              var19_ref.field_q = -100.0f;
              var19_ref.field_B = -100.0f;
              wd.field_h.a(-8212, var19_ref);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oi.J(" + param0 + ')');
        }
    }

    private final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 <= 34) {
          oi.a(118);
        }
        var3 = this.field_h.length;
        while (var3 <= param1) {
          if (!this.field_a) {
            var3 = var3 + this.field_b;
            continue;
          }
          if (var3 != 0) {
            var3 = var3 * this.field_b;
            continue;
          }
          var3 = 1;
        }
        return var3;
    }

    static {
        field_d = "Just play";
        field_f = -1;
        field_i = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_e = new int[128];
        field_g = "Create a free Account";
    }
}
