/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CacheIoRequest extends ResourceRequest {
    FileCacheStore store;
    static java.awt.Canvas field_D;
    int operation;
    byte[] data;

    final static int approximateSqrt256(int value, int obfuscationGuard) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (value == 0) {
          return 0;
        }
        if (0 > value) {
          throw new IllegalArgumentException("");
        }
        if (obfuscationGuard != 2) {
          field_D = (java.awt.Canvas) null;
        }
        if (value >= 32768) {
          if (value < 131072) {
            return tn.field_n[-32768 + value];
          }
          if (33554432 > value) {
            if (value < 2097152) {
              var2 = (value < 524288) ? 1 : 2;
            } else {
              var2 = (value >= 8388608) ? 4 : 3;
            }
          } else {
            if (value >= 536870912) {
              var2 = 7;
            } else {
              var2 = (134217728 <= value) ? 6 : 5;
            }
          }
          value = value >> (var2 << 1);
          return tn.field_n[-32768 + value] << var2;
        }
        if (value >= 128) {
          if (value >= 2048) {
            if (8192 <= value) {
              var2Lifetime1 = 1;
            } else {
              var2Lifetime1 = 2;
            }
          } else {
            var2Lifetime1 = (value < 512) ? 4 : 3;
          }
        } else {
          if (value >= 8) {
            var2Lifetime1 = (32 <= value) ? 5 : 6;
          } else {
            if (2 > value) {
              return 256;
            }
            var2Lifetime1 = 7;
          }
        }
        value = value << (var2Lifetime1 << 1);
        return tn.field_n[value - 32768] >> var2Lifetime1;
    }

    public static void h(int param0) {
        if (param0 > -17) {
          field_D = (java.awt.Canvas) null;
        }
        field_D = null;
    }

    final byte[] getData(byte obfuscationGuard) {
        int var2 = -57 % ((4 - obfuscationGuard) / 52);
        if (this.pending) {
          throw new RuntimeException();
        }
        return this.data;
    }

    final int getProgress(int obfuscationGuard) {
        if (obfuscationGuard != -21546) {
          this.getProgress(-42);
        }
        if (this.pending) {
          return 0;
        }
        return 100;
    }

    final static void a(boolean param0, boolean param1) {
        int var6 = 0;
        mh dupTemp$0 = null;
        int var11 = 0;
        int stackIn_4_0 = 0;
        mh stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5 = 0;
        Object stackIn_37_0 = null;
        rk stackIn_37_1 = null;
        int stackIn_52_0 = 0;
        mh stackIn_78_0 = null;
        boolean stackIn_79_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        mh var7 = null;
        int var7_int = 0;
        int var8 = 0;
        mh var8_ref_mh = null;
        rk var9 = null;
        int var9_int = 0;
        int var10 = 0;
        rk var10_ref_rk = null;
        int var12 = 0;
        int var13 = 0;
        mh var14 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          kp.field_a = Rasterizer2D.width;
          IsaacGenerator.field_i = Rasterizer2D.height;
          if (!param1) {
            stackIn_4_0 = eg.field_m;
          } else {
            stackIn_4_0 = IntArrayRequest.field_j;
          }
          co.a(stackIn_4_0, false);
          sb.field_c.a(qa.field_w.field_Ib, 0, 88, 0, -40 + qa.field_w.field_cb - 2);
          um.field_b.a(np.field_a, 0, 0, ji.field_b.field_Ib, (byte) 64);
          stackIn_6_0 = BoundedFile.field_g;
          stackIn_6_1 = 18;
          stackIn_6_2 = np.field_a + 2;
          stackIn_6_3 = 0;
          stackIn_6_4 = ji.field_b.field_Ib;
          if (!vd.field_e) {
            stackIn_7_5 = 0;
          } else {
            stackIn_7_5 = 4 + (ec.field_J + 40);
          }
          ((mh) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4 - stackIn_7_5, (byte) 64);
          if (!param0) {
            field_D = (java.awt.Canvas) null;
          }
          wd.field_E.a(18, np.field_a + 2, -40 + (-2 + ji.field_b.field_Ib) - ec.field_J, 42 + ec.field_J, (byte) 64);
          TimedSplashScreen.field_u.a(2, (byte) -109, ji.field_b.field_Ib, 0, np.field_a + 2 + 20, ec.field_J, -2 + ji.field_b.field_cb - (np.field_a + 20));
          GameUiController.field_e.a(40, -40 + qa.field_w.field_cb, 0, qa.field_w.field_Ib, (byte) 64);
          ba.field_v.a(30, 0, 0, MultiplayerMatch.field_d.field_Ib, (byte) 64);
          rg.field_e.a(-2 + (-40 + MultiplayerMatch.field_d.field_cb) - 30, 30, 0, MultiplayerMatch.field_d.field_Ib, (byte) 64);
          var2_int = cq.field_p + 3;
          if (w.field_n.length < 2) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (2 + (-15 + (rg.field_e.field_cb - (5 - (var2_int + 1) / 2)))) / (1 + var2_int);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (rg.field_e.field_cb - (5 + (2 + var3) * var2_int));
          if (var4 > 40) {
            var4 = 40;
          }
          jd.field_a.a(var4, 5, 5, -5 + (-5 + rg.field_e.field_Ib), (byte) 64);
          var5 = 5 + var4 + 2;
          for (var6 = 0; 4 + cq.field_p > var6; var6++) {
            if ((var6 != 1 ||
              !(w.field_n.length < 2)) && (var6 != 3 ||
              !(IntArrayRequest.field_t <= 1))) {
              if (!param1 &&
                3 == var6) {
                dupTemp$0 = gb.field_l[var6];
                var14 = dupTemp$0;
                var7 = dupTemp$0;
                gb.field_l[var6].field_cb = 0;
                var14.field_Ib = 0;
                for (var8 = 0; MatchCompleteScreen.field_A[var6].length > var8; var8++) {
                  if (null != MatchCompleteScreen.field_A[var6][var8]) {
                    var9 = MatchCompleteScreen.field_A[var6][var8];
                    MatchCompleteScreen.field_A[var6][var8].field_cb = 0;
                    var9.field_Ib = 0;
                  }
                }
              } else if (param1 &&
                0 == var6) {
                var7 = gb.field_l[var6];
                gb.field_l[var6].field_cb = 0;
                var7.field_Ib = 0;
                for (var8 = 0; var8 < MatchCompleteScreen.field_A[var6].length; var8++) {
                  stackIn_37_0 = null;
                  stackIn_37_1 = MatchCompleteScreen.field_A[var6][var8];
                  if (stackIn_37_0 != stackIn_37_1) {
                    var9 = MatchCompleteScreen.field_A[var6][var8];
                    MatchCompleteScreen.field_A[var6][var8].field_cb = 0;
                    var9.field_Ib = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (me.field_f != null) {
                      stackIn_52_0 = (me.field_f[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_52_0 = 0;
                    }
                  } else {
                    stackIn_52_0 = 0;
                  }
                } else {
                  stackIn_52_0 = 0;
                }
                var7_int = stackIn_52_0;
                if (var7_int != 0) {
                  var8_ref_mh = gb.field_l[var6];
                  gb.field_l[var6].field_cb = 0;
                  var8_ref_mh.field_Ib = 0;
                  for (var9_int = 0; MatchCompleteScreen.field_A[var6].length > var9_int; var9_int++) {
                    if (MatchCompleteScreen.field_A[var6][var9_int] != null) {
                      var10_ref_rk = MatchCompleteScreen.field_A[var6][var9_int];
                      MatchCompleteScreen.field_A[var6][var9_int].field_cb = 0;
                      var10_ref_rk.field_Ib = 0;
                    }
                  }
                } else {
                  gb.field_l[var6].a(var3, var5, 5, 103, (byte) 64);
                  var8 = 110;
                  if (!param1) {
                    if (null != MatchCompleteScreen.field_A[var6][0]) {
                      var9 = MatchCompleteScreen.field_A[var6][0];
                      MatchCompleteScreen.field_A[var6][0].field_cb = 0;
                      var9.field_Ib = 0;
                    }
                  } else {
                    MatchCompleteScreen.field_A[var6][0].a(-10411, var5, 2, kn.field_z, var8, var3, 38);
                    var8 += 40;
                  }
                  var9_int = 2 + (MultiplayerMatch.field_d.field_Ib - (5 + var8));
                  var10 = MatchCompleteScreen.field_A[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    MatchCompleteScreen.field_A[var6][1 + var11].a(-10411, var5, 2, kn.field_z, var12 + var8, var3, var9_int * (var11 + 1) / var10 - 2 - var12);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          wi.field_j.a(-10 + (-120 + Rasterizer2D.height) - 4 - 10, 10, -360 + Rasterizer2D.width >> 1, 360, (byte) 64);
          pk.field_h.a(24, 0, 0, wi.field_j.field_Ib, (byte) 64);
          MembershipBenefitsScreen.field_t.a(-24 + wi.field_j.field_cb, 24, 0, wi.field_j.field_Ib, (byte) 64);
          stackIn_78_0 = MembershipBenefitsScreen.field_t;
          stackIn_79_1 = !(param0);
          stackIn_78_0.field_Jb = na.a(stackIn_79_1, 8421504, 3, 11579568, MembershipBenefitsScreen.field_t.field_cb, 1);
          Ball.field_A.a(MembershipBenefitsScreen.field_t.field_cb - 10 - 26, 5, 5, -10 + MembershipBenefitsScreen.field_t.field_Ib, (byte) 64);
          nd.field_a.a(24, -29 + MembershipBenefitsScreen.field_t.field_cb, (MembershipBenefitsScreen.field_t.field_Ib - 80) / 2, 80, (byte) 64);
          s.b(125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var2), "kj.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void addBoardBorders(int columns, NodeDeque destination, int obfuscationGuard) {
        int var4 = 0;
        int var3_int = 0;
        int var7 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = -1;
          if (obfuscationGuard != 16) {
            field_D = (java.awt.Canvas) null;
          }
          while (var3_int < columns + 1) {
            for (var4 = -1; 31 > var4; var4++) {
              if (var4 == -1 ||
                var3_int == -1 ||
                columns == var3_int) {
                var5 = var3_int * 34 << 8;
                var6 = 16 * var4 << 8;
                destination.addLast(new Brick(var5, var6, 0, 0, 1, 1, 0, 0), (byte) 3);
              }
            }
            var3_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("kj.A(").append(columns).append(',');
          if (destination == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    CacheIoRequest() {
    }

    static {
    }
}
