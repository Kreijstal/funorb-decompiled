/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static String field_g;
    static ie field_f;
    static String field_e;
    static mh field_a;
    static String[] field_c;
    static mh field_d;
    static tb field_b;

    final static gb a(int param0, int param1, int param2, int param3) {
        Object stackIn_42_0 = null;
        mh stackIn_42_1 = null;
        boolean stackIn_50_0 = false;
        Object var4;
        int var5;
        int var6;
        int var7;
        int var8;
        gb var8_ref_gb;
        int var9;
        gb var9_ref_gb;
        int var10_int;
        String var10;
        String var11;
        int var12;
        int var13;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        var4 = null;
        AchievementIcon.field_q.field_Rb.field_bb.clear((byte) -61);
        var5 = 0;
        var6 = 0;
        for (var7 = -1 + mm.field_Sb; var7 >= 0; var7--) {
          var8_ref_gb = jk.field_s[var7];
          var9 = 0;
          if (!um.field_e &&
            var5 < eh.field_k) {
            var10_int = tm.a(var8_ref_gb.field_c, (byte) 18);
            if (var10_int <= var8_ref_gb.a(true) && (var8_ref_gb.field_e ||
              !AchievementBrowserScreen.a(125, var8_ref_gb.field_m))) {
              var9 = 1;
            }
          }
          if (var9 == 0) {
            var8_ref_gb.field_b = null;
          } else {
            var5++;
            if (var8_ref_gb.field_b == null ||
              LevelSequence.field_d) {
              if (null == var8_ref_gb.field_b) {
                Brick.field_E = Brick.field_E + 1;
              }
              var10 = IntNode.a(var8_ref_gb, (byte) 91);
              var11 = var10 + TextFont.escapeAngles(var8_ref_gb.field_j);
              var12 = ik.a(-31126, var8_ref_gb);
              var8_ref_gb.field_b = new mh(0L, field_a, var11);
              var8_ref_gb.field_b.field_Fb = var12 + (-((var12 & 16711422) >> 1) + (field_a.field_Fb >> 1 & 8355711));
              var8_ref_gb.field_b.field_Y = (field_a.field_Y >> 1 & 8355711) - (8355711 & var12 >> 1) + var12;
              var8_ref_gb.field_b.field_X = var12;
              var8_ref_gb.field_b.field_O = CachedArchiveSource.field_y;
              var6 = var6 + param1;
            }
          }
        }
        var7Lifetime1 = 0;
        for (var8 = 0; mm.field_Sb > var8; var8++) {
          var9_ref_gb = jk.field_s[var8];
          if (null != var9_ref_gb.field_b) {
            AchievementIcon.field_q.field_Rb.a(var9_ref_gb.field_b, 0);
            var9_ref_gb.field_b.a(param1, var7Lifetime1, param0, var9_ref_gb.field_b.g(87), (byte) 64);
            if (var9_ref_gb.field_b.field_L != 0) {
              var4 = var9_ref_gb;
            }
            var7Lifetime1 = var7Lifetime1 + param1;
          }
        }
        var8Lifetime1 = AchievementIcon.field_q.field_Rb.field_C + AchievementIcon.field_q.field_Rb.field_cb - (-var6 + var7Lifetime1);
        AchievementIcon.field_q.field_Rb.field_cb = AchievementIcon.field_q.field_Rb.field_cb - var8Lifetime1;
        AchievementIcon.field_q.field_Rb.field_zb = AchievementIcon.field_q.field_Rb.field_zb + var8Lifetime1;
        if (LevelSequence.field_d) {
          AchievementIcon.field_q.field_Rb.field_cb = var7Lifetime1;
        }
        AchievementIcon.field_q.field_Rb.field_C = var7Lifetime1 - AchievementIcon.field_q.field_Rb.field_cb;
        if (LevelSequence.field_d) {
          LevelSequence.field_d = false;
          AchievementIcon.field_q.field_Rb.field_zb = AchievementIcon.field_q.field_Qb.field_cb - AchievementIcon.field_q.field_Rb.field_cb;
          nd.field_b = true;
          AchievementIcon.field_q.field_Rb.field_Db = 0;
        }
        if (param2 != -13294) {
          field_d = (mh) null;
        }
        if (MatchResultScreen.field_s) {
          stackIn_42_0 = null;
          stackIn_42_1 = wp.field_k;
          if (stackIn_42_0 != stackIn_42_1) {
            nd.field_b = true;
          }
        }
        var9Lifetime1 = AchievementIcon.field_q.field_Qb.field_cb - (AchievementIcon.field_q.field_Rb.field_cb + AchievementIcon.field_q.field_Rb.field_C);
        if (nd.field_b) {
          AchievementIcon.field_q.field_Rb.field_Db = var9Lifetime1 - AchievementIcon.field_q.field_Rb.field_zb;
        }
        AchievementIcon.field_q.a(true, param1, true, 2 * (param1 * param3));
        stackIn_50_0 = (var9Lifetime1 == AchievementIcon.field_q.field_Rb.field_Db + AchievementIcon.field_q.field_Rb.field_zb);
        nd.field_b = stackIn_50_0;
        return (gb) (var4);
    }

    final static void a(java.applet.Applet param0, byte param1, String param2, String param3, long param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            if (param1 <= 66) {
              sj.a(-31, 62, -5, -79);
            }
            try {
              var8 = param0.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param2 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param4) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + AppletGameShell.a((byte) -75, MonotonicTime.nowMillis(false) + param4 * 1000L) + "; Max-Age=" + param4;
              }
              ne.a(param0, "document.cookie=\"" + var7Lifetime4 + "\"", 5797);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("sj.C(");
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
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param3 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        id stackIn_111_0 = null;
        boolean stackIn_112_1 = false;
        int stackIn_133_0 = 0;
        id stackIn_139_0 = null;
        boolean stackIn_140_1 = false;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3 = 0L;
        int var3_int = 0;
        id var3_ref_id = null;
        int var4 = 0;
        om var4_ref_om = null;
        int var5 = 0;
        String var6 = null;
        om var6_ref = null;
        id var7 = null;
        id var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        id var14 = null;
        id var15 = null;
        om var16 = null;
        Object var17 = null;
        Object var18 = null;
        om var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        om var20_ref = null;
        id var21 = null;
        Object var22 = null;
        om var23 = null;
        id var24 = null;
        id var25 = null;
        String var26 = null;
        String var27 = null;
        id var28 = null;
        String var29 = null;
        String var30 = null;
        id var31 = null;
        om var32 = null;
        om var33 = null;
        id var34 = null;
        var22 = null;
        var17 = null;
        var20 = null;
        var18 = null;
        var19 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          regionExit1: {
            var1 = jl.incomingPackets;
            var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
            if (var2 != 0 &&
              var2 != 1 &&
              var2 != 2 &&
              var2 != 3 &&
              4 != var2) {
              if (var2 == 5) {
                var3 = ((PacketBuffer) ((Object) var1)).readLong(-32768);
                var29 = ((PacketBuffer) ((Object) var1)).readCp1252String(-1);
                var6 = ((PacketBuffer) ((Object) var1)).readCp1252String(-1);
                var30 = ((PacketBuffer) ((Object) var1)).readCp1252String(-1);
                var31 = MatchCompleteScreen.a((byte) 96, var3);
                var8 = var31;
                stackIn_133_0 = (var6.equals("")) ? 0 : 1;
                var9 = stackIn_133_0;
                if (var31 != null) {
                  if (var9 != 0) {
                    var31.a(var30, var29, (byte) -121);
                  }
                } else {
                  var8 = new id(var29, var30, var3);
                  eq.field_m.a(var3, var8, 86);
                }
                var8.field_Xb = MonotonicTime.nowMillis(false) - (long)((PacketBuffer) ((Object) var1)).readInt(255);
                var8.field_Wb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                var10 = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 110);
                var8.field_ac = var10 >> 1;
                stackIn_139_0 = var8;
                stackIn_140_1 = ((1 & var10) != 0);
                stackIn_139_0.field_ec = stackIn_140_1;
                var8.field_Zb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var8.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                wl.a(var8, 17574);
                break regionExit1;
              }
              if (var2 == 6) {
                var3 = ((PacketBuffer) ((Object) var1)).readLong(param0 ^ -32735);
                var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                var21 = MatchCompleteScreen.a((byte) 96, var3);
                if ((var21 != null)) {
                  if (var21.field_fc) {
                    uf.field_c = uf.field_c - 1;
                    var21.field_fc = false;
                  }
                  if (var5 == 0) {
                    var21.unlink((byte) 111);
                  } else {
                    var21.field_kc = var5;
                    var21.field_ic = cm.field_o;
                  }
                  var21.unlinkSecondary(param0 ^ 34);
                }
              } else {
                if (var2 == 7) {
                  var34 = (id) (ua.field_c.first(-61));
                  while (var34 != null) {
                    var34.unlink((byte) 111);
                    var34.unlinkSecondary(3);
                    var34 = (id) (ua.field_c.next((byte) 116));
                  }
                  uf.field_c = 0;
                } else {
                  if (var2 == 8) {
                    var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                    var4_ref_om = (om) (pn.field_i.a((long)var3_int, -1));
                    if (var4_ref_om == null) {
                      var4_ref_om = new om(cq.field_p);
                      pn.field_i.a((long)var3_int, var4_ref_om, 47);
                    }
                    eb.a(var4_ref_om, var1, 0, true);
                    ic.a(true, var4_ref_om);
                  } else {
                    if (9 == var2) {
                      var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                      var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                      var32 = (om) (pn.field_i.a((long)var3_int, -1));
                      if ((var32 != null)) {
                        if (var4 == 0) {
                          var32.unlink((byte) 111);
                        } else {
                          var32.field_Zb = var4;
                          var32.field_Wb = cm.field_o;
                        }
                        var32.unlinkSecondary(3);
                      }
                    } else {
                      if (var2 == 10) {
                        var33 = (om) (rq.field_a.first(-62));
                        while (var33 != null) {
                          var33.unlink((byte) 111);
                          var33.unlinkSecondary(3);
                          var33 = (om) (rq.field_a.next((byte) 116));
                        }
                      } else {
                        if (var2 != 11 &&
                          var2 != 12) {
                          if (var2 == 13) {
                            var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                            var4 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                            var18_ref = (om) (pn.field_i.a((long)var3_int, param0 - 34));
                            if ((var18_ref != null)) {
                              var16 = var18_ref;
                              var6_ref = var16;
                              var18_ref.field_dc = false;
                              var16.field_Pb = false;
                              if (var4 != 0) {
                                var18_ref.field_Zb = var4;
                                var18_ref.field_Wb = cm.field_o;
                              }
                              ic.a(true, var18_ref);
                            }
                          } else {
                            if (var2 != 14 &&
                              16 != var2) {
                              if (var2 != 15 &&
                                var2 != 17) {
                                switch (var2) {
                                  case 18:
                                    var3 = ((PacketBuffer) ((Object) var1)).readLong(-32768);
                                    var26 = ((PacketBuffer) ((Object) var1)).readCp1252String(param0 - 34);
                                    var27 = ((PacketBuffer) ((Object) var1)).readCp1252String(param0 - 34);
                                    var7 = ac.a(var3, 2);
                                    if (var7 == null) {
                                      var7 = new id(var26, var27, var3);
                                      BrickABrac.field_F.a(var3, var7, 48);
                                      o.field_e.field_cc = o.field_e.field_cc + 1;
                                    }
                                    var7.field_Wb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                                    var8_int = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 127);
                                    stackIn_111_0 = var7;
                                    stackIn_112_1 = (0 != (var8_int & 1));
                                    stackIn_111_0.field_ec = stackIn_112_1;
                                    var7.field_ac = var8_int >> 1;
                                    var7.field_Zb = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 ^ 222);
                                    var7.field_Ub = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 + 222);
                                    mp.field_Tb.addLast(var7, (byte) 3);
                                    break regionExit1;
                                  case 19:
                                    var3 = ((PacketBuffer) ((Object) var1)).readLong(-32768);
                                    var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
                                    var14 = ac.a(var3, 2);
                                    var25 = var14;
                                    if (var14 == null) {
                                      break regionExit1;
                                    }
                                    if (0 == var5) {
                                      var25.unlink((byte) 111);
                                    } else {
                                      var14.field_ic = cm.field_o;
                                      var14.field_kc = var5;
                                    }
                                    var25.unlinkSecondary(param0 - 30);
                                    o.field_e.field_cc = o.field_e.field_cc - 1;
                                    break regionExit1;
                                  case 20:
                                    eb.a(o.field_e, var1, 0, false);
                                    break regionExit1;
                                  case 21:
                                    var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                                    if (var3_int != 0) {
                                      ic.field_b = (long)var3_int + MonotonicTime.nowMillis(false);
                                      break regionExit1;
                                    }
                                    ic.field_b = 0L;
                                    break regionExit1;
                                  case 22:
                                    m.field_h = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                                    ArchiveIndex.field_s = ((PacketBuffer) ((Object) var1)).readVarInt((byte) 119);
                                    break regionExit1;
                                  case 23:
                                    oc.field_p = ((PacketBuffer) ((Object) var1)).readLong(-32768);
                                    break regionExit1;
                                  default:
                                    rk.a("L1: " + eq.c((byte) -121), (Throwable) null, 108);
                                    hn.a((byte) 84);
                                    break regionExit1;
                                }
                              }
                              var3 = ((PacketBuffer) ((Object) var1)).readLong(-32768);
                              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 ^ 222);
                              var15 = MatchCompleteScreen.a((byte) 96, var3);
                              var28 = var15;
                              if ((var15 != null)) {
                                if (15 != var2) {
                                  if (var28.field_fc) {
                                    var28.field_fc = false;
                                    uf.field_c = uf.field_c - 1;
                                  }
                                } else {
                                  var15.field_Qb = false;
                                }
                                if (var5 != 0) {
                                  var28.field_ic = cm.field_o;
                                  var28.field_kc = var5;
                                }
                                wl.a(var28, 17574);
                              }
                            } else {
                              var3 = ((PacketBuffer) ((Object) var1)).readLong(param0 ^ -32735);
                              var24 = MatchCompleteScreen.a((byte) 96, var3);
                              if ((var24 != null)) {
                                if (var2 != 14) {
                                  if (!var24.field_fc) {
                                    uf.field_c = uf.field_c + 1;
                                    var24.field_fc = true;
                                  }
                                } else {
                                  var24.field_Qb = true;
                                }
                                wl.a(var24, 17574);
                              }
                            }
                          }
                        } else {
                          var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
                          var20_ref = (om) (pn.field_i.a((long)var3_int, -1));
                          var23 = var20_ref;
                          if ((var23 != null)) {
                            if (var2 != 11) {
                              var23.field_dc = true;
                            } else {
                              var23.field_Pb = true;
                            }
                            ic.a(true, var23);
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            var3_ref_id = (id) (mp.field_Tb.first(-8));
            while (var3_ref_id != null) {
              var3_ref_id.unlink((byte) 111);
              var3_ref_id.unlinkSecondary(param0 - 30);
              var3_ref_id = (id) (mp.field_Tb.next((byte) 116));
            }
            var3_ref_id = (id) (eq.field_m.b((byte) 89));
            while (var3_ref_id != null) {
              if (var3_ref_id.field_Qb ||
                var3_ref_id.field_fc) {
                var3_ref_id.field_Qb = false;
                if (var3_ref_id.field_fc) {
                  uf.field_c = uf.field_c - 1;
                  var3_ref_id.field_fc = false;
                }
                wl.a(var3_ref_id, 17574);
              }
              var3_ref_id = (id) (eq.field_m.a(false));
            }
            if (var2 == 1 &&
              o.field_e != null) {
              pk.field_g = o.field_e.field_Fc;
            }
            if (4 == var2) {
              var3_int = ((PacketBuffer) ((Object) var1)).readUnsignedShort(65280);
              o.field_e = new om(cq.field_p);
              o.field_e.setSecondaryKey((long)var3_int, -105);
              eb.a(o.field_e, var1, 0, false);
              ic.field_b = 0L;
            } else {
              o.field_e = null;
            }
            if (var2 != 2 &&
              3 != var2) {
              nl.field_f = null;
            } else {
              if (null == nl.field_f) {
                nl.field_f = new om(cq.field_p);
              }
            }
            if (var2 != 3) {
              fh.field_d = false;
            } else {
              fh.field_d = true;
              for (var3_int = 0; var3_int < rh.field_d.length; var3_int++) {
                rh.field_d[var3_int] = ((PacketBuffer) ((Object) var1)).readByte(true);
              }
              bb.field_e = ((PacketBuffer) ((Object) var1)).readUnsignedByte(255);
              ResourceArchive.field_c = ((PacketBuffer) ((Object) var1)).readUnsignedByte(param0 + 222);
              for (var3_int = 0; var3_int < lj.field_p.length; var3_int++) {
                lj.field_p[var3_int] = ((PacketBuffer) ((Object) var1)).readByte(true);
              }
            }
          }
          if (param0 != 33) {
            sj.a((java.applet.Applet) null, (byte) -55, (String) null, (String) null, -27L);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1_ref), "sj.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 11) {
          field_d = (mh) null;
        }
        field_g = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_g = "Remove <%0> from friend list";
        field_e = "Confuse: reverse the paddle's controls.";
    }
}
