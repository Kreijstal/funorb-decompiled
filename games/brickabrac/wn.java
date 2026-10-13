/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wn {
    static String field_a;
    static RgbSprite field_b;
    static mf field_c;

    final static mp a(boolean param0, int param1, int param2) {
        mm stackIn_4_0;
        int stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        boolean stackIn_4_5;
        boolean stackIn_5_6 = false;
        mp stackIn_12_0 = null;
        mh stackIn_33_0 = null;
        String stackIn_34_1 = null;
        mh stackIn_37_0 = null;
        String stackIn_38_1 = null;
        int stackIn_42_0 = 0;
        Object stackIn_101_0 = null;
        RuntimeException decompiledCaughtException = null;
        mp stackOut_11_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        NodeDeque var4 = null;
        Object var5 = null;
        Object var6 = null;
        mp var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        nn var17 = null;
        String var18 = null;
        int var19 = 0;
        nn var17Lifetime1;
        String var18Lifetime1;
        var19 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_4_0 = GameScreen.field_f.field_Qb;
          stackIn_4_1 = 2;
          stackIn_4_2 = param1 * (6 + 3 * np.field_a);
          stackIn_4_3 = np.field_a + 2;
          stackIn_4_4 = 22676;
          stackIn_4_5 = param0;
          stackIn_5_6 = (GameScreen.field_f.field_Qb == o.field_b);
          var3_int = ((mm) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_5_6) ? 1 : 0;
          if (param2 > -12) {
            wn.a((byte) 96);
          }
          boolean decompiledFrameCompleted0 = true;
          var4 = GameScreen.field_f.field_Xb.field_bb;
          var5 = null;
          if (LevelMetadata.field_m == 2) {
            rg.field_c.field_eb = true;
            sj.field_d.field_Mb = rd.a(LevelDecoder.field_c, new String[]{rk.field_Tb}, (byte) 103);
            GameScreen.field_f.field_Qb.field_Qb.field_Mb = null;
            var6 = null;
            var7 = (mp) (var4.first(-76));
            while (var7 != null) {
              var8 = 0;
              stackOut_11_0 = var7;
              stackIn_101_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (var19 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_12_0.field_bb == null) {
                var7.field_Xb = new mh(0L, vb.field_K);
                var7.a(var7.field_Xb, 0);
                var7.field_Wb = new mh(0L, OptionsScreen.field_v);
                var7.a(var7.field_Wb, 0);
                var7.field_Yb = new mh(0L, vb.field_K);
                var7.a(var7.field_Yb, 0);
                var7.field_Wb.field_S = 2;
                var8 = 1;
                var7.c(true);
              }
              var7.field_Ib = GameScreen.field_f.field_Xb.field_Ib;
              var9 = 0;
              if (var7.field_Ub == null) {
                var10 = 13369344;
                var11 = 16737894;
              } else if (var7.field_Ub != rk.field_Tb) {
                var10 = 13421568;
                var11 = 16777062;
              } else {
                var11 = 6750054;
                var10 = 52224;
              }
              var12 = 0;
              if (null != var7.field_Qb &&
                !var7.field_Qb.equals("")) {
                var7.field_Yb.field_wb = ok.field_g;
                var7.field_Yb.field_Y = var11;
                var7.field_Yb.a(np.field_a, var9, 0, 3 + ok.field_g.canvasWidth, (byte) 64);
                var12 = 1;
              }
              var7.field_Wb.field_Fb = var11;
              var7.field_Xb.field_Fb = var11;
              var7.field_Wb.field_vb = var11;
              var7.field_Xb.field_vb = var11;
              var7.field_Wb.field_Y = var11;
              var7.field_Xb.field_Y = var11;
              var7.field_Wb.field_X = var10;
              var7.field_Xb.field_X = var10;
              var13 = 0;
              var14 = -80 + (var7.field_Ib - 2);
              if (var12 != 0) {
                var13 = 3 + ok.field_g.canvasWidth;
                var14 = var14 - var13;
              }
              stackIn_33_0 = var7.field_Xb;
              if (var14 > 0) {
                stackIn_34_1 = dh.a(var7.field_Xb.field_O, var7.field_Rb, var14);
              } else {
                stackIn_34_1 = var7.field_Rb;
              }
              stackIn_33_0.field_Mb = stackIn_34_1;
              var7.field_Xb.a(np.field_a, var9, var13, var14, (byte) 64);
              stackIn_37_0 = var7.field_Wb;
              if (var7.field_Ub != null) {
                stackIn_38_1 = var7.field_Ub;
              } else {
                stackIn_38_1 = ec.field_S;
              }
              stackIn_37_0.field_Mb = stackIn_38_1;
              var7.field_Wb.a(np.field_a, var9, -80 + var7.field_Ib, 80, (byte) 64);
              stackIn_42_0 = (var7.field_Xb.field_Mb.equals(var7.field_Rb)) ? 0 : 1;
              var15 = stackIn_42_0;
              var9 = var9 + np.field_a;
              if (var3_int == 0) {
                var7.field_C = var9 - var7.field_cb;
              }
              if (var8 != 0) {
                GameScreen.field_f.field_Xb.a((mh) (var6), 2, var7, 17290);
              }
              var6 = var7;
              if (null != var7.field_Yb &&
                var7.field_Yb.field_kb) {
                ep.field_e = var7.field_Qb;
              } else if (0 == var7.field_L) {
                if (var7.field_Xb.field_kb &&
                  var15 != 0) {
                  ep.field_e = var7.field_Rb;
                }
              } else {
                var16 = var7.field_Rb;
                SpriteGeometry.a(-1, var7, GameScreen.field_f.field_Qb, (int[]) null, var16, -1, (byte) -58, 0L, (String) null);
                if (null != var7.field_Ub &&
                  !m.a(13134, bm.field_d.field_e) &&
                  !um.field_e) {
                  if (!qo.field_I) {
                    var17 = bm.field_d;
                    var18 = rd.a(v.field_c, new String[]{var16}, (byte) 103);
                    var17.field_d.a(var18, 8, (byte) 84);
                  }
                  var17Lifetime1 = bm.field_d;
                  var18Lifetime1 = rd.a(qm.field_b, new String[]{var16}, (byte) 103);
                  var17Lifetime1.field_d.a(var18Lifetime1, 18, (byte) 97);
                }
                var5 = var7;
              }
              var7 = (mp) (var4.next((byte) 116));
            }
            if (decompiledFrameCompleted0) {
              if (GameScreen.field_f.field_Tb.field_L != 0) {
                tn.field_m = new gq(GameScreen.field_f.field_Tb.field_Eb, GameScreen.field_f.field_Tb.field_db, GameScreen.field_f.field_Tb.field_Ib, GameScreen.field_f.field_Tb.field_cb, a.field_t, ij.field_c, ad.field_l, ad.field_l);
                ij.field_d = 0;
              }
              if (0 != GameScreen.field_f.field_Wb.field_L) {
                tn.field_m = new gq(GameScreen.field_f.field_Wb.field_Eb, GameScreen.field_f.field_Wb.field_db, GameScreen.field_f.field_Wb.field_Ib, GameScreen.field_f.field_Wb.field_cb, eg.field_j, ij.field_c, ad.field_l, ad.field_l);
                ij.field_d = 1;
              }
            }
          } else {
            sj.field_d.field_Mb = kd.field_a;
            rg.field_c.field_eb = false;
            if (LevelMetadata.field_m == 1) {
              GameScreen.field_f.field_Qb.field_Qb.field_Mb = cd.field_f;
              if (var19 != 0) {
                GameScreen.field_f.field_Qb.field_Qb.field_Mb = cm.field_t;
              }
            } else {
              GameScreen.field_f.field_Qb.field_Qb.field_Mb = cm.field_t;
            }
            jh.a(true, GameScreen.field_f.field_Xb);
          }
          if (decompiledFrameCompleted0) {
            stackIn_101_0 = var5;
          }
          return (mp) (stackIn_101_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "wn.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void snapshotKeyboardInput(byte obfuscationGuard) {
        int keyIndex = 0;
        int clientBranchFlag = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        Object keyboardMonitor = null;
        RuntimeException var1_ref = null;
        int keyChange;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          keyboardMonitor = DualLinkDeque.keyboardInput;
          synchronized (keyboardMonitor) {
            if (obfuscationGuard != -97) {
              wn.a(-86, (byte) 78);
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            IntrusiveHashTable.keyEventReadIndex = fm.keyEventFrameEnd;
            PowerUp.keyboardIdleTicks = PowerUp.keyboardIdleTicks + 1;
            if (pl.keyChangeWriteIndex < 0) {
              keyIndex = 0;
              while (true) {
                if (112 > keyIndex) {
                  pe.heldKeys[keyIndex] = false;
                  keyIndex++;
                  if (clientBranchFlag == 0) {
                    continue;
                  }
                } else {
                  pl.keyChangeWriteIndex = ek.keyChangeReadIndex;
                }
                break;
              }
              decompiledFrameRemainder0 = (clientBranchFlag != 0);
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                if (~pl.keyChangeWriteIndex == ~ek.keyChangeReadIndex) {
                  break;
                }
                keyChange = lo.keyChangeQueue[ek.keyChangeReadIndex];
                ek.keyChangeReadIndex = ek.keyChangeReadIndex + 1 & 127;
                stackIn_27_0 = keyChange;
                if (clientBranchFlag != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_27_0 < 0) {
                  pe.heldKeys[~keyChange] = false;
                } else {
                  pe.heldKeys[keyChange] = true;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_27_0 = hb.keyEventWriteIndex;
            }
            fm.keyEventFrameEnd = stackIn_27_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1_ref), "wn.E(" + obfuscationGuard + ')');
        }
    }

    final static void a(mf param0, mf param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          fe.field_jb = param1;
          if (param2 != 0) {
            wn.a(79, -114);
          }
          jg.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("wn.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
          field_b = null;
          int var1_int = 98 / ((param0 - 73) / 36);
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wn.F(" + param0 + ')');
        }
    }

    final static hl a(int param0, mf param1, mf param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        hl stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ln.a(-123, param3, param2, param0)) {
            stackIn_4_0 = null;
            return (hl) (stackIn_4_0);
          }
          var5_int = 126 / ((param4 + 35) / 45);
          stackIn_6_0 = rm.a(12658477, param1.a(param3, param0, 4));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("wn.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(int param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -6) {
            stackIn_7_0 = ((-param0 & param0) == param0);
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "wn.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          InstructionsScreen.field_r = param1 >> 4 & 3;
          InstructionsScreen.field_v = (param1 & 12) >> 2;
          if (InstructionsScreen.field_r > 2) {
            InstructionsScreen.field_r = 2;
          }
          if (InstructionsScreen.field_v > param0) {
            InstructionsScreen.field_v = 2;
          }
          to.field_a = 3 & param1;
          if (to.field_a > 2) {
            to.field_a = 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2), "wn.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -98) {
            field_b = (RgbSprite) null;
          }
          stackIn_4_0 = (int)(1000000000L / hb.field_x);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "wn.A(" + param0 + ')');
        }
    }

    static {
    }
}
