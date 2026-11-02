/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia extends IntrusiveNode {
    int field_p;
    int field_k;
    int field_m;
    static String field_l;
    int field_h;
    static String field_i;
    static int field_j;
    int field_g;
    int[] field_o;
    int field_n;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
          java.net.URL var3 = null;
          String var4 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            try {
              if (param1 != 6) {
                var4 = (String) null;
                ia.a((java.applet.Applet) null, 40, (String) null);
              }
              var3 = new java.net.URL(param0.getCodeBase(), param2);
              var3 = dh.a(param0, (byte) -118, var3);
              ea.a((byte) 68, param0, true, var3.toString());
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("ia.D(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
          this.field_m = param2;
          this.field_o = param7;
          this.field_p = param1;
          if (param6 != 6) {
            ia.d(81);
          }
          this.field_g = param5;
          this.field_k = param3;
          this.field_n = param0;
          this.field_h = param4;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        LetterTile dupTemp$1 = null;
        LetterTile dupTemp$2 = null;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_112_0 = 0;
        LetterTile stackIn_151_0 = null;
        boolean stackIn_152_1 = false;
        LetterTile stackIn_157_0 = null;
        boolean stackIn_158_1 = false;
        boolean stackIn_205_0 = false;
        int stackIn_216_0 = 0;
        Object stackIn_334_0 = null;
        LetterTile stackIn_334_1 = null;
        LetterTile stackIn_375_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        pl var2 = null;
        pl var3 = null;
        int var4 = 0;
        LetterTile var4_ref_sj = null;
        TileRack var4_ref_j = null;
        int var5 = 0;
        Object var5_ref = null;
        int var6 = 0;
        TileRack var6_ref_j = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        TileRack var13 = null;
        LetterTile[] var14 = null;
        LetterTile var15 = null;
        LetterTile[] var16 = null;
        LetterTile var17 = null;
        LetterTile[] var18 = null;
        LetterTile var19 = null;
        LetterTile[] var21 = null;
        LetterTile var22 = null;
        LetterTile[] var23 = null;
        LetterTile var24 = null;
        LetterTile var25 = null;
        LetterTile var26 = null;
        String var27 = null;
        LetterTile var28 = null;
        char[] var31 = null;
        Object var5_refLifetime1;
        Object var7Lifetime1;
        LetterTile var26Lifetime1;
        LetterTile var28Lifetime1;
        LetterTile var28Lifetime2;
        LetterTile var26Lifetime2;
        LetterTile var28Lifetime2Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var10Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var5Lifetime2;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var8Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var5Lifetime1Lifetime1;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          hf.field_j = hf.field_j + 1;
          gh.field_l = gh.field_l + 1;
          SecondaryNodeDeque.field_g = eh.totalScore;
          nc.field_t = nc.field_t + jk.field_B;
          vh.field_n = vh.field_n + 1;
          hg.a(95);
          if (oj.field_u.a((byte) -95) != null) {
            fieldTemp$0 = da.field_C + 1;
            da.field_C = da.field_C + 1;
            if (fieldTemp$0 == 335) {
              da.field_C = 0;
              oj.field_u.c(-94);
            }
          }
          if (!mg.field_d) {
            ne.a(39);
          }
          if (param0 < 22) {
            field_l = (String) null;
          }
          if ((n.submittedWordCount != 0 ||
            !(6 > re.field_A)) &&
            (!(n.submittedWordCount >= 2) ||
            !mg.field_d &&
            !(n.submittedWordCount >= 10))) {
            wk.field_c = wk.field_c + 1;
          }
          eg.field_b = eg.field_b + 1;
          if (!mg.field_d ||
            n.submittedWordCount != 2) {
            dc.field_a = dc.field_a + 1;
          }
          g.field_z = g.field_z - 1;
          stackIn_23_0 = (!MouseWheelInput.field_b) ? 0 : 1;
          var1_int = stackIn_23_0;
          if (ub.field_c != null &&
            !ub.field_c.field_c) {
            var1_int = 1;
          }
          if (var1_int == 0) {
            stackIn_32_0 = (!mg.field_d) ? 1 : 7;
            qf.field_d = stackIn_32_0;
            return;
          }
          var2 = d.field_e;
          if (n.submittedWordCount < 3) {
            var3 = bd.field_u[1];
          } else {
            if (n.submittedWordCount >= 6) {
              if (n.submittedWordCount >= 9) {
                if (n.submittedWordCount >= 10) {
                  var3 = bd.field_u[6];
                } else {
                  var3 = bd.field_u[4];
                }
              } else {
                var3 = bd.field_u[3];
              }
            } else {
              var3 = bd.field_u[2];
            }
          }
          if (var2 == null) {
            wd.a(17099, true, var3);
          } else {
            if (var2 != var3 &&
              var3 != bd.field_u[6] &&
              var2 != bd.field_u[5]) {
              wd.a(17099, false, bd.field_u[5]);
            }
          }
          if (re.field_A < 6) {
            boolean decompiledFrameRemainder1 = true;
            if (0 <= jl.field_j) {
              if (-1 + n.submittedWordCount != jl.field_j &&
                !hd.field_a) {
                if (!(o.field_i <= 0)) {
                  o.field_i = o.field_i - 10;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                o.field_i = o.field_i + 10;
                if (237 + o.field_i >= 480) {
                  hd.field_a = false;
                  jl.field_j = jl.field_j + 1;
                }
              }
            }
            if (re.field_A == 0) {
              var4 = 1;
              var23 = si.newRack.tiles;
              var6 = 0;
              scanLoop1: while (true) {
                if (var23.length > var6) {
                  var24 = var23[var6];
                  if (var24 != null) {
                    if (var24.y != var24.destinationY) {
                      var4 = 0;
                      break scanLoop1;
                    }
                    if (var24.destinationY == 247) {
                      var4 = 0;
                      var24.destinationY = var24.destinationY + wl.field_K.field_m;
                      break scanLoop1;
                    }
                  }
                  var6++;
                  continue;
                }
                break;
              }
              if (var4 == 0) {
                return;
              }
              re.field_A = 1;
              return;
            }
            if (re.field_A == 1) {
              var4Lifetime2 = 1;
              var14 = wk.carryoverRack.tiles;
              var6Lifetime2 = 0;
              scanLoop2: while (true) {
                if (var6Lifetime2 < var14.length) {
                  var15 = var14[var6Lifetime2];
                  if (var15 != null) {
                    if (var15.destinationY != var15.y) {
                      var4Lifetime2 = 0;
                      break scanLoop2;
                    }
                    if (var15.destinationY == 190) {
                      var15.destinationY = var15.destinationY + wl.field_K.field_m;
                      var4Lifetime2 = 0;
                      break scanLoop2;
                    }
                  }
                  var6Lifetime2++;
                  continue;
                }
                break;
              }
              if (0 == n.submittedWordCount) {
                if (dc.field_a < 50) {
                  var4Lifetime2 = 0;
                } else {
                  if (var4Lifetime2 != 0) {
                    dc.field_a = 0;
                  }
                }
              }
              if (var4Lifetime2 == 0) {
                return;
              }
              re.field_A = 2;
              return;
            }
            if (2 == re.field_A) {
              if (n.submittedWordCount != 10 && (!mg.field_d ||
                2 != n.submittedWordCount)) {
                var4Lifetime3 = 1;
                var16 = od.submissionRack.tiles;
                var6Lifetime3 = 0;
                scanLoop3: while (true) {
                  if (var6Lifetime3 < var16.length) {
                    var17 = var16[var6Lifetime3];
                    if (var17 != null) {
                      if (var17.y != var17.destinationY) {
                        var4Lifetime3 = 0;
                        break scanLoop3;
                      }
                      if (var17.destinationY == 114) {
                        var4Lifetime3 = 0;
                        var17.destinationY = 190;
                        break scanLoop3;
                      }
                    }
                    var6Lifetime3++;
                    continue;
                  }
                  break;
                }
                if (n.submittedWordCount == 0) {
                  if (dc.field_a < 50) {
                    var4Lifetime3 = 0;
                  } else {
                    if (var4Lifetime3 != 0) {
                      dc.field_a = 0;
                    }
                  }
                }
                if (var4Lifetime3 == 0) {
                  return;
                }
                re.field_A = 3;
                return;
              }
              var4Lifetime3 = 0;
              while (pc.b(-128)) {
                if (ch.field_d == 13 ||
                  84 == ch.field_d) {
                  var4Lifetime3 = 1;
                }
                if (13 != ch.field_d) {
                  continue;
                }
                if (!mg.field_d) {
                  continue;
                }
                qf.field_d = 0;
                return;
              }
              if (1 == tg.field_d &&
                ol.field_b >= 264 &&
                ol.field_b < 428 &&
                nk.field_c >= 376 &&
                nk.field_c < 407) {
                var4Lifetime3 = 1;
              }
              if (1000 <= dc.field_a) {
                var4Lifetime3 = 1;
              }
              if (var4Lifetime3 != 0) {
                if (!mg.field_d) {
                  if (!IntrusiveDeque.b((byte) 97)) {
                    stackIn_112_0 = (0 != hc.field_u) ? 6 : 2;
                    qf.field_d = stackIn_112_0;
                  } else {
                    qf.field_d = 5;
                  }
                } else {
                  mg.field_d = false;
                  hd.field_a = true;
                }
              }
              return;
            }
            if (3 != re.field_A) {
              if (4 == re.field_A) {
                var4Lifetime4 = 1;
                var21 = si.newRack.tiles;
                var6Lifetime4 = 0;
                scanLoop4: while (true) {
                  if (var21.length > var6Lifetime4) {
                    var22 = var21[var6Lifetime4];
                    if (var22 != null) {
                      if (var22.destinationY != var22.y) {
                        var4Lifetime4 = 0;
                        break scanLoop4;
                      }
                      if (var22.destinationY != 247) {
                        var22.destinationY = 247;
                        var4Lifetime4 = 0;
                        break scanLoop4;
                      }
                    }
                    var6Lifetime4++;
                    continue;
                  }
                  break;
                }
                if (n.submittedWordCount == 0) {
                  if (dc.field_a < 50) {
                    var4Lifetime4 = 0;
                  } else {
                    if (var4Lifetime4 != 0) {
                      dc.field_a = 0;
                    }
                  }
                }
                if (var4Lifetime4 == 0) {
                  return;
                }
                re.field_A = 5;
                return;
              }
              if (re.field_A == 5) {
                var13 = wk.carryoverRack;
                var4_ref_j = var13;
                wk.carryoverRack = od.submissionRack;
                wk.carryoverRack.originX = 34;
                od.submissionRack = var13;
                wk.carryoverRack.originY = 190;
                re.field_A = 6;
                od.submissionRack.originY = 114;
                if (jl.field_j == 3) {
                  jl.field_j = jl.field_j + 1;
                }
                od.submissionRack.originX = 34;
              }
            } else {
              wk.carryoverRack.clear(true);
              si.newRack.clear(true);
              if (n.submittedWordCount != 10 && (!mg.field_d ||
                2 != n.submittedWordCount)) {
                var18 = od.submissionRack.tiles;
                for (var5 = 0; var5 < var18.length; var5++) {
                  var19 = var18[var5];
                  if (var19 != null) {
                    var19.doublesWordScore = false;
                    var19.field_l = var19.field_l + 1;
                    if (var19.carryoverFlag < 3) {
                      var19.carryoverFlag = var19.carryoverFlag + 1;
                    }
                  }
                }
                var31 = new char[8];
                if (mg.field_d &&
                  n.submittedWordCount == 1 &&
                  null != MouseInputHandler.field_c.field_n) {
                  for (var5Lifetime2 = 0; var5Lifetime2 < MouseInputHandler.field_c.field_n.length(); var5Lifetime2++) {
                    si.newRack.tiles[var5Lifetime2] = NodeHashTableIterator.a(si.newRack, var5Lifetime2, MouseInputHandler.field_c, (byte) 105, MouseInputHandler.field_c.field_n.charAt(var5Lifetime2));
                    stackIn_157_0 = si.newRack.tiles[var5Lifetime2];
                    stackIn_158_1 = (var5Lifetime2 == 1);
                    stackIn_157_0.doublesWordScore = stackIn_158_1;
                    dupTemp$1 = si.newRack.tiles[var5Lifetime2];
                    dupTemp$1.destinationY = 247 - wl.field_K.field_m;
                    si.newRack.tiles[var5Lifetime2].y = 247 - wl.field_K.field_m;
                  }
                } else {
                  MouseInputHandler.field_c.a((byte) 92, var31);
                  var5Lifetime2 = li.a(8, o.field_o, false);
                  for (var6Lifetime4 = 0; var31.length > var6Lifetime4; var6Lifetime4++) {
                    si.newRack.tiles[var6Lifetime4] = NodeHashTableIterator.a(si.newRack, var6Lifetime4, MouseInputHandler.field_c, (byte) 30, var31[var6Lifetime4]);
                    stackIn_151_0 = si.newRack.tiles[var6Lifetime4];
                    stackIn_152_1 = (var5Lifetime2 == var6Lifetime4);
                    stackIn_151_0.doublesWordScore = stackIn_152_1;
                    dupTemp$2 = si.newRack.tiles[var6Lifetime4];
                    dupTemp$2.destinationY = 247 - wl.field_K.field_m;
                    si.newRack.tiles[var6Lifetime4].y = 247 - wl.field_K.field_m;
                  }
                }
                wk.carryoverRack.originY = 114;
                wk.carryoverRack.originX = 34;
                re.field_A = 4;
                return;
              }
              re.field_A = 6;
            }
            return;
          }
          if (ve.field_B[11] &&
            0 == SessionGameApplet.field_l) {
            SessionGameApplet.field_l = -1;
          }
          if (ve.field_B[1] &&
            va.field_j >= 2) {
            stackIn_205_0 = !(ll.field_S);
            ll.field_S = stackIn_205_0;
          }
          if (ve.field_B[12]) {
            SessionGameApplet.field_l = 0;
          }
          scanLoop5: while (true) {
            if (!pc.b(-122)) {
              if (WordDictionary.field_e) {
                a.field_S.a(-127, kk.a(336, ol.field_b, nk.field_c), kk.a(336, PacketBuffer.field_j, bk.field_a));
                if (a.field_S.f(-9112)) {
                  if (0 == a.field_S.field_d) {
                    dc.submitWord(-22991, true);
                  }
                  if (a.field_S.field_d == 1) {
                    WordDictionary.field_e = false;
                  }
                }
              }
              if (tg.field_d == 1 &&
                !WordDictionary.field_e) {
                qf.field_e = qf.field_e ^ 5 << bc.field_b;
                hf.field_j = hf.field_j + ol.field_b;
                vh.field_n = vh.field_n + ol.field_b;
                nc.field_t = nc.field_t + nk.field_c;
                bc.field_b = bc.field_b ^ 5 << bc.field_b;
                ud.field_b = ud.field_b - nk.field_c;
                if (PacketBuffer.field_j >= 264 &&
                  PacketBuffer.field_j < 428 &&
                  bk.field_a >= 376 &&
                  bk.field_a < 407) {
                  dc.submitWord(-22991, true);
                  return;
                }
                if (134 <= PacketBuffer.field_j &&
                  PacketBuffer.field_j < 242 &&
                  bk.field_a >= 376 &&
                  407 > bk.field_a) {
                  vk.a((byte) 85, FullscreenFocusCanvas.field_d[0]);
                  wk.carryoverRack.shuffle(-10874);
                  si.newRack.shuffle(-10874);
                  return;
                }
                if (bk.field_a >= 114 &&
                  bk.field_a < 114 + wl.field_K.field_m &&
                  PacketBuffer.field_j >= 34) {
                  var4Lifetime1 = (-34 + PacketBuffer.field_j) / wl.field_K.field_n;
                  if (!(var4Lifetime1 >= od.submissionRack.tiles.length)) {
                    rk.field_p = -(-(var4Lifetime1 * wl.field_K.field_n) - 34 + PacketBuffer.field_j);
                    sg.field_d = od.submissionRack.tiles[var4Lifetime1];
                    ek.field_e = 114 - bk.field_a;
                  }
                } else if (bk.field_a >= 190 &&
                  bk.field_a < 190 + wl.field_K.field_m &&
                  PacketBuffer.field_j >= 34) {
                  var4Lifetime1 = (-34 + PacketBuffer.field_j) / wl.field_K.field_n;
                  if (!(var4Lifetime1 >= wk.carryoverRack.tiles.length)) {
                    rk.field_p = -(PacketBuffer.field_j - (34 + wl.field_K.field_n * var4Lifetime1));
                    sg.field_d = wk.carryoverRack.tiles[var4Lifetime1];
                    ek.field_e = -bk.field_a + 190;
                  }
                } else {
                  if (bk.field_a >= 247 &&
                    247 + wl.field_K.field_m > bk.field_a &&
                    161 <= PacketBuffer.field_j) {
                    var4Lifetime1 = (-161 + PacketBuffer.field_j) / wl.field_K.field_n;
                    if (var4Lifetime1 < si.newRack.tiles.length) {
                      rk.field_p = -(-(var4Lifetime1 * wl.field_K.field_n) + (PacketBuffer.field_j - 161));
                      sg.field_d = si.newRack.tiles[var4Lifetime1];
                      ek.field_e = 247 - bk.field_a;
                    }
                  }
                }
                if (va.field_j >= 2 &&
                  0 < SessionGameApplet.field_l &&
                  sg.field_d != null) {
                  sg.field_d.letter = (char)SessionGameApplet.field_l;
                  if (!dk.field_b) {
                    hf.field_j = hf.field_j + 1;
                    nc.field_t = nc.field_t + 1;
                    dk.field_b = true;
                  }
                  sg.field_d.baseValue = MouseInputHandler.field_c.field_p[255 & sg.field_d.letter];
                  var4_ref_sj = sg.field_d;
                  sg.field_d.field_l = 0;
                  SessionGameApplet.field_l = -1;
                  var4_ref_sj.carryoverFlag = 0;
                }
                if (null == sg.field_d) {
                  return;
                }
                stackIn_375_0 = nc.field_s;
                if (stackIn_375_0 == sg.field_d &&
                  g.field_z > 0) {
                  boolean decompiledFrameRemainder0 = true;
                  boolean decompiledFrameCompleted0 = true;
                  sg.field_d = null;
                  if (od.submissionRack != nc.field_s.rack) {
                    for (var4Lifetime1 = 0; 12 > var4Lifetime1; var4Lifetime1++) {
                      if (od.submissionRack.tiles[var4Lifetime1] == null) {
                        nc.field_s.moveToRack(var4Lifetime1, 28, od.submissionRack);
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                    }
                    decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                  }
                  if ((decompiledFrameRemainder0) &&
                    (decompiledFrameCompleted0)) {
                    eh.returnTileToRack(nc.field_s, 55);
                  }
                  nc.field_s = null;
                  return;
                }
                g.field_z = 10;
                nc.field_s = sg.field_d;
                return;
              }
              stackIn_334_0 = null;
              stackIn_334_1 = sg.field_d;
              if (stackIn_334_0 != stackIn_334_1) {
                if (b.field_k != 0) {
                  ua.b((byte) 69);
                  return;
                }
                MouseInputHandler.a((byte) 125);
                return;
              }
              return;
            }
            qf.field_e = qf.field_e ^ 1 << eh.totalScore;
            bc.field_b = bc.field_b ^ 1 << eh.totalScore;
            ud.field_b = ud.field_b - gh.field_l;
            jk.field_B = jk.field_B - 1;
            if (ch.field_d == 13) {
              if (WordDictionary.field_e) {
                WordDictionary.field_e = false;
                continue;
              }
              stackIn_216_0 = (mg.field_d) ? 7 : 1;
              qf.field_d = stackIn_216_0;
              return;
            }
            if (n.submittedWordCount == 10) {
              continue;
            }
            if (mg.field_d &&
              n.submittedWordCount == 2) {
              continue;
            }
            if (WordDictionary.field_e) {
              a.field_S.b(false);
              if (!a.field_S.f(-9112)) {
                continue;
              }
              if (0 == a.field_S.field_d) {
                dc.submitWord(-22991, false);
              }
              if (1 != a.field_S.field_d) {
                continue;
              }
              WordDictionary.field_e = false;
              continue;
            }
            if (84 == ch.field_d) {
              dc.submitWord(-22991, false);
              continue;
            }
            if (va.field_j >= 2 &&
              ch.field_d == 35 &&
              ve.field_B[82]) {
              ue.dumpRackState(31370);
              continue;
            }
            if (ch.field_d == 83) {
              vk.a((byte) 78, FullscreenFocusCanvas.field_d[0]);
              wk.carryoverRack.shuffle(-10874);
              si.newRack.shuffle(-10874);
              continue;
            }
            if (85 == ch.field_d &&
              od.submissionRack.tiles[0] != null) {
              wh.f((byte) 104);
              continue;
            }
            if (i.a(sg.field_n, 160) &&
              sg.field_n != 32 &&
              od.submissionRack.tiles[11] == null) {
              sg.field_n = MouseInputHandler.field_c.toUpperCase(0, sg.field_n);
              if (0 != SessionGameApplet.field_l) {
                SessionGameApplet.field_l = sg.field_n & 255;
              }
              var28 = NodeHashTableIterator.a((byte)sg.field_n, false);
              if (var28 == null) {
                vk.a((byte) 91, FullscreenFocusCanvas.field_d[6]);
                continue;
              }
              var5Lifetime1 = 0;
              while (var5Lifetime1 < 12) {
                if (null == od.submissionRack.tiles[var5Lifetime1]) {
                  var28.moveToRack(var5Lifetime1, 28, od.submissionRack);
                  continue scanLoop5;
                }
                var5Lifetime1++;
              }
              continue;
            }
            if ((98 != ch.field_d ||
              !(n.submittedWordCount > 0)) &&
              99 != ch.field_d) {
              continue;
            }
            for (var4Lifetime1Lifetime1 = 0; var4Lifetime1Lifetime1 < 12; var4Lifetime1Lifetime1++) {
              var25 = od.submissionRack.tiles[var4Lifetime1Lifetime1];
              var26 = var25;
              var28Lifetime1 = var26;
              var26Lifetime2 = var25;
              var5_ref = var26Lifetime2;
              if (var25 != null) {
                if (var25.previousRack != null &&
                  od.submissionRack != var25.previousRack &&
                  null == var25.previousRack.tiles[var25.previousSlot]) {
                  var25.moveToRack(var25.previousSlot, 28, var25.previousRack);
                }
                continue;
              }
              break;
            }
            for (var4Lifetime1Lifetime2 = 0; 12 > var4Lifetime1Lifetime2; var4Lifetime1Lifetime2++) {
              var26Lifetime1 = od.submissionRack.tiles[var4Lifetime1Lifetime2];
              var28Lifetime2 = var26Lifetime1;
              var28Lifetime2Lifetime1 = var26Lifetime1;
              var5_refLifetime1 = var26Lifetime1;
              if (var26Lifetime1 != null) {
                if (var26Lifetime1.carryoverFlag != 0) {
                  var7 = si.newRack;
                  var6_ref_j = wk.carryoverRack;
                } else {
                  var6_ref_j = si.newRack;
                  var7 = wk.carryoverRack;
                }
                for (var8 = 0; var6_ref_j.tiles.length > var8; var8++) {
                  if (var6_ref_j.tiles[var8] != null) {
                    continue;
                  }
                  var26Lifetime1.moveToRack(var8, 28, var6_ref_j);
                  var5_refLifetime1 = null;
                  break;
                }
                if (var5_refLifetime1 != null) {
                  for (var8Lifetime2 = 0; var8Lifetime2 < ((TileRack) (var7)).tiles.length; var8Lifetime2++) {
                    if (((TileRack) (var7)).tiles[var8Lifetime2] == null) {
                      ((LetterTile) (var5_refLifetime1)).moveToRack(var8Lifetime2, 28, (TileRack) (var7));
                      break;
                    }
                  }
                }
              }
            }
            if (ch.field_d != 98) {
              continue;
            }
            var27 = IterableNodeHashTable.usedWords[n.submittedWordCount - 1].toString();
            for (var5Lifetime1Lifetime1 = 0; var27.length() > var5Lifetime1Lifetime1; var5Lifetime1Lifetime1++) {
              var6Lifetime1 = var27.charAt(var5Lifetime1Lifetime1);
              var7Lifetime1 = null;
              var8Lifetime1 = -1;
              var9 = -1;
              for (var10 = 0; 12 > var10; var10++) {
                if (wk.carryoverRack.tiles[var10] != null &&
                  var6Lifetime1 == wk.carryoverRack.tiles[var10].letter &&
                  wk.carryoverRack.tiles[var10].field_l > var9) {
                  var8Lifetime1 = var10;
                  var7Lifetime1 = wk.carryoverRack;
                  var9 = wk.carryoverRack.tiles[var10].field_l;
                }
              }
              var12 = 0;
              var10Lifetime1 = var12;
              while (var12 < 8) {
                if (si.newRack.tiles[var12] != null &&
                  var6Lifetime1 == si.newRack.tiles[var12].letter &&
                  var9 < si.newRack.tiles[var12].field_l) {
                  var7Lifetime1 = si.newRack;
                  var9 = si.newRack.tiles[var12].field_l;
                  var8Lifetime1 = var12;
                }
                var12++;
              }
              ((TileRack) (var7Lifetime1)).tiles[var8Lifetime1].moveToRack(var5Lifetime1Lifetime1, 28, od.submissionRack);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ia.C(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -4) {
          field_j = -4;
        }
        field_i = null;
    }

    ia() {
    }

    static {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}
