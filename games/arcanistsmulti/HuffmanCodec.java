/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HuffmanCodec {
    private byte[] field_a;
    static boolean field_k;
    static int[] field_h;
    static IntrusiveDequeCursor field_f;
    private int[] field_c;
    static int field_b;
    private int[] field_e;
    static String field_m;
    static int field_i;
    static IndexedSprite[] field_j;
    static int field_g;
    static String field_d;
    static int field_l;

    final int compress(int param0, byte param1, byte[] param2, int param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param3 = param3 + param0;
          var7_int = 0;
          var8 = param5;
          if (param1 > -113) {
            HuffmanCodec.releaseStatics(-33);
          }
          scanLoop1: while (true) {
            var9 = param4[var8];
            if (var9 < 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param0;
              param0++;
              param2[incrementValue$1] = (byte)(~var10);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param0;
              param0++;
              param2[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 32) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param0;
              param0++;
              param2[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((16 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param0;
              param0++;
              param2[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param0;
              param0++;
              param2[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param0;
              param0++;
              param2[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((2 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param0;
              param0++;
              param2[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 >= param3) {
                return -param5 + (1 + var8);
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param0;
              param0++;
              param2[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param0 >= param3) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_65_0 = -param5 + (1 + var8);
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("u.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param5).append(')').toString());
        }
    }

    final int decompress(byte[] param0, int param1, byte[] param2, int param3, int param4, int param5) {
        int dupTemp$0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var7_int = 0;
          var8 = param3 << 3;
          param1 = param1 + param5;
          while (true) {
            if (param5 >= param1) {
              if (param4 != 1) {
                field_b = 117;
              }
              stackIn_21_0 = -param3 + (var8 + 7 >> 3);
              return stackIn_21_0;
            }
            var9 = 255 & param2[param5];
            var10 = this.field_e[var9];
            var11 = this.field_a[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (-1 + (var11 + var13) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = fj.bitOr(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param0[var12] = (byte)dupTemp$0;
            if (var12 < var14) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param0[var12] = (byte)(var10 >>> var13);
              if (var12 < var14) {
                var12++;
                var13 -= 8;
                var7_int = var10 >>> var13;
                param0[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var13 -= 8;
                  var12++;
                  var7_int = var10 >>> var13;
                  param0[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var13 -= 8;
                    var12++;
                    var7_int = var10 << -var13;
                    param0[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param5++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("u.E(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int randomBelow(IsaacRandom param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0 >= param2) {
            throw new IllegalArgumentException();
          }
          if (ScreenDisplayMode.a(-2147483648, param2)) {
            stackIn_5_0 = (int)(((long)param0.nextInt((byte) -46) & 4294967295L) * (long)param2 >> 32);
            return stackIn_5_0;
          }
          var3_int = -(int)(4294967296L % (long)param2) + param1;
          do {
            var4 = param0.nextInt((byte) -46);
          } while (var3_int <= var4);
          stackIn_10_0 = SceneTextInput.floorMod(var4, true, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("u.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void handleSocialListPacket(byte param0) {
        int stackIn_45_0 = 0;
        SocialListEntry stackIn_51_0 = null;
        boolean stackIn_52_1 = false;
        SocialListEntry stackIn_93_0 = null;
        boolean stackIn_94_1 = false;
        RuntimeException decompiledCaughtException = null;
        CipherPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        SocialListEntry var3_ref_cg = null;
        LobbyGameEntry var4 = null;
        int var4_int = 0;
        int var5 = 0;
        LobbyGameEntry var6 = null;
        SocialListEntry var7 = null;
        int var8 = 0;
        SocialListEntry var8_ref_cg = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        LobbyGameEntry var13 = null;
        SocialListEntry var14 = null;
        LobbyGameEntry var15 = null;
        Object var16 = null;
        Object var17 = null;
        LobbyGameEntry var17_ref = null;
        Object var18 = null;
        Object var19 = null;
        LobbyGameEntry var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        SocialListEntry var23 = null;
        SocialListEntry var24 = null;
        LobbyGameEntry var25 = null;
        String var26 = null;
        String var27 = null;
        SocialListEntry var28 = null;
        SocialListEntry var29 = null;
        SocialListEntry var30 = null;
        LobbyGameEntry var31 = null;
        LobbyGameEntry var32 = null;
        SocialListEntry var33 = null;
        SocialListEntry var3_ref_cgLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var4_intLifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var19 = null;
        var17 = null;
        var18 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 > -45) {
            return;
          }
          var1 = UiContainer.field_z;
          var2 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -110);
          if (var2 != 0 &&
            var2 != 1 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (var2 == 5) {
              var3_long = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
              var21 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var20 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var22 = ((PacketBuffer) ((Object) var1)).readString(-1);
              var23 = fn.lookupEntry(var3_long, 119);
              var8_ref_cg = var23;
              stackIn_45_0 = (var20.equals("")) ? 0 : 1;
              var9 = stackIn_45_0;
              if (var23 != null) {
                if (var9 != 0) {
                  var23.setNames(var21, var22, 93);
                }
              } else {
                var8_ref_cg = new SocialListEntry(var21, var22, var3_long);
                bc.field_c.put(var8_ref_cg, var3_long, (byte) 126);
              }
              var8_ref_cg.field_Ob = qj.monotonicTimeMillis(-26572) - (long)((PacketBuffer) ((Object) var1)).readInt(-10674);
              var8_ref_cg.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
              var10 = ((PacketBuffer) ((Object) var1)).readVarInt(31);
              stackIn_51_0 = var8_ref_cg;
              stackIn_52_1 = (0 != (1 & var10));
              stackIn_51_0.field_Jb = stackIn_52_1;
              var8_ref_cg.field_Vb = var10 >> 1;
              var8_ref_cg.field_Mb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -123);
              var8_ref_cg.field_Bb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) 100);
              NodeHashTableIterator.insertSorted(var8_ref_cg, (byte) 1);
              return;
            }
            if (6 == var2) {
              var3_longLifetime1 = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
              var5 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -96);
              var24 = fn.lookupEntry(var3_longLifetime1, 111);
              if (var24 != null) {
                if (var24.field_Kb) {
                  oe.field_b = oe.field_b - 1;
                  var24.field_Kb = false;
                }
                if (var5 != 0) {
                  var24.field_Eb = TextLine.field_i;
                  var24.field_Sb = var5;
                } else {
                  var24.unlink(true);
                }
                var24.unlinkSecondary((byte) 88);
              }
              return;
            }
            if (var2 == 7) {
              var33 = (SocialListEntry) (LinkButtonPainter.field_j.first(12623));
              while (var33 != null) {
                var33.unlink(true);
                var33.unlinkSecondary((byte) 88);
                var33 = (SocialListEntry) (LinkButtonPainter.field_j.next(0));
              }
              oe.field_b = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
              var4 = (LobbyGameEntry) (nk.field_q.get((long)var3, (byte) -93));
              if (var4 == null) {
                var4 = new LobbyGameEntry(vf.field_l);
                nk.field_q.put(var4, (long)var3, (byte) 116);
              }
              SceneScrollPane.readGameEntry(var1, var4, true, 2);
              cb.insertSortedGame(var4, 67);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
              var4_int = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) 105);
              var15 = (LobbyGameEntry) (nk.field_q.get((long)var3Lifetime4, (byte) -70));
              var31 = var15;
              if (var15 == null) {
                return;
              }
              if (var4_int == 0) {
                var31.unlink(true);
              } else {
                var15.field_bc = TextLine.field_i;
                var15.field_ac = var4_int;
              }
              var31.unlinkSecondary((byte) 88);
              return;
            }
            if (var2 == 10) {
              var32 = (LobbyGameEntry) (UiTheme.field_a.first(12623));
              while (var32 != null) {
                var32.unlink(true);
                var32.unlinkSecondary((byte) 88);
                var32 = (LobbyGameEntry) (UiTheme.field_a.next(0));
              }
              return;
            }
            if (var2 != 11 &&
              12 != var2) {
              if (var2 == 13) {
                var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
                var4_intLifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -107);
                var17_ref = (LobbyGameEntry) (nk.field_q.get((long)var3Lifetime5, (byte) -105));
                if (var17_ref != null) {
                  var17_ref.field_Nb = false;
                  var13 = var17_ref;
                  var6 = var13;
                  if (0 != var4_intLifetime1) {
                    var17_ref.field_ac = var4_intLifetime1;
                    var17_ref.field_bc = TextLine.field_i;
                  }
                  var13.field_Hb = false;
                  cb.insertSortedGame(var17_ref, 25);
                }
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (var2 != 15 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
                    var26 = ((PacketBuffer) ((Object) var1)).readString(-1);
                    var27 = ((PacketBuffer) ((Object) var1)).readString(-1);
                    var7 = vf.a(var3_longLifetime2, 8192);
                    if (var7 == null) {
                      var7 = new SocialListEntry(var26, var27, var3_longLifetime2);
                      OptionsDialog.field_qb.put(var7, var3_longLifetime2, (byte) 121);
                      DirectByteStorage.field_f.field_Rb = DirectByteStorage.field_f.field_Rb + 1;
                    }
                    var7.field_Pb = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
                    var8 = ((PacketBuffer) ((Object) var1)).readVarInt(16);
                    var7.field_Vb = var8 >> 1;
                    stackIn_93_0 = var7;
                    stackIn_94_1 = ((var8 & 1) != 0);
                    stackIn_93_0.field_Jb = stackIn_94_1;
                    var7.field_Mb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -109);
                    var7.field_Bb = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -120);
                    ph.field_a.addLast(var7, -1);
                    return;
                  }
                  if (19 == var2) {
                    var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
                    var5Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) -111);
                    var14 = vf.a(var3_longLifetime2, 8192);
                    var28 = var14;
                    if (var14 == null) {
                      return;
                    }
                    if (var5Lifetime1 == 0) {
                      var28.unlink(true);
                    } else {
                      var14.field_Sb = var5Lifetime1;
                      var14.field_Eb = TextLine.field_i;
                    }
                    var28.unlinkSecondary((byte) 88);
                    DirectByteStorage.field_f.field_Rb = DirectByteStorage.field_f.field_Rb - 1;
                    return;
                  }
                  if (var2 == 20) {
                    SceneScrollPane.readGameEntry(var1, DirectByteStorage.field_f, false, 2);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
                    if (var3Lifetime5 == 0) {
                      PatchEnvelopeSet.field_a = 0L;
                      return;
                    }
                    PatchEnvelopeSet.field_a = qj.monotonicTimeMillis(-26572) + (long)var3Lifetime5;
                    return;
                  }
                  if (var2 == 22) {
                    sk.field_e = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
                    DelegatingCanvas.field_e = ((PacketBuffer) ((Object) var1)).readVarInt(121);
                    return;
                  }
                  if (var2 == 23) {
                    qf.field_a = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
                    return;
                  }
                  DelegatingCanvas.a((Throwable) null, "L1: " + CacheEntry.g((byte) -25), (byte) 20);
                  ProxySocketConnector.closeActiveConnection(false);
                  return;
                }
                var3_longLifetime2 = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
                var5Lifetime1Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) 107);
                var29 = fn.lookupEntry(var3_longLifetime2, 123);
                if (var29 != null) {
                  if (var5Lifetime1Lifetime1 != 0) {
                    var29.field_Eb = TextLine.field_i;
                    var29.field_Sb = var5Lifetime1Lifetime1;
                  }
                  if (var2 == 15) {
                    var29.field_Db = false;
                  } else {
                    if (var29.field_Kb) {
                      var29.field_Kb = false;
                      oe.field_b = oe.field_b - 1;
                    }
                  }
                  NodeHashTableIterator.insertSorted(var29, (byte) 15);
                }
                return;
              }
              var3_longLifetime2Lifetime1 = ((PacketBuffer) ((Object) var1)).readLong(-943038560);
              var30 = fn.lookupEntry(var3_longLifetime2Lifetime1, 121);
              if (var30 != null) {
                if (var2 != 14) {
                  if (!var30.field_Kb) {
                    oe.field_b = oe.field_b + 1;
                    var30.field_Kb = true;
                  }
                } else {
                  var30.field_Db = true;
                }
                NodeHashTableIterator.insertSorted(var30, (byte) 127);
              }
              return;
            }
            var3Lifetime6 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
            var19_ref = (LobbyGameEntry) (nk.field_q.get((long)var3Lifetime6, (byte) -98));
            var25 = var19_ref;
            if (var25 != null) {
              if (var2 != 11) {
                var25.field_Nb = true;
              } else {
                var25.field_Hb = true;
              }
              cb.insertSortedGame(var25, -26);
            }
            return;
          }
          var3_ref_cg = (SocialListEntry) (ph.field_a.first(12623));
          while (var3_ref_cg != null) {
            var3_ref_cg.unlink(true);
            var3_ref_cg.unlinkSecondary((byte) 88);
            var3_ref_cg = (SocialListEntry) (ph.field_a.next(0));
          }
          var3_ref_cgLifetime1 = (SocialListEntry) (bc.field_c.firstInTraversal(-79));
          while (var3_ref_cgLifetime1 != null) {
            if (var3_ref_cgLifetime1.field_Db ||
              var3_ref_cgLifetime1.field_Kb) {
              if (var3_ref_cgLifetime1.field_Kb) {
                oe.field_b = oe.field_b - 1;
                var3_ref_cgLifetime1.field_Kb = false;
              }
              var3_ref_cgLifetime1.field_Db = false;
              NodeHashTableIterator.insertSorted(var3_ref_cgLifetime1, (byte) -109);
            }
            var3_ref_cgLifetime1 = (SocialListEntry) (bc.field_c.nextInTraversal(-1));
          }
          if (var2 == 1 &&
            DirectByteStorage.field_f != null) {
            va.field_e = DirectByteStorage.field_f.field_ic;
          }
          if (var2 == 4) {
            var3Lifetime1 = ((PacketBuffer) ((Object) var1)).readUnsignedShort(-98);
            DirectByteStorage.field_f = new LobbyGameEntry(vf.field_l);
            DirectByteStorage.field_f.a(46, (long)var3Lifetime1);
            SceneScrollPane.readGameEntry(var1, DirectByteStorage.field_f, false, 2);
            PatchEnvelopeSet.field_a = 0L;
          } else {
            DirectByteStorage.field_f = null;
          }
          if (var2 != 2 &&
            var2 != 3) {
            om.field_x = null;
          } else {
            if (null == om.field_x) {
              om.field_x = new LobbyGameEntry(vf.field_l);
            }
          }
          if (var2 != 3) {
            SceneScrollPane.field_Db = false;
            return;
          }
          SceneScrollPane.field_Db = true;
          for (var3Lifetime2 = 0; MidiPcmStream.field_E.length > var3Lifetime2; var3Lifetime2++) {
            MidiPcmStream.field_E[var3Lifetime2] = ((PacketBuffer) ((Object) var1)).readByte(6);
          }
          DropTargetWidget.field_L = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) 32);
          DropTargetWidget.field_N = ((PacketBuffer) ((Object) var1)).readUnsignedByte((byte) 72);
          for (var3Lifetime3 = 0; var3Lifetime3 < ng.field_D.length; var3Lifetime3++) {
            ng.field_D[var3Lifetime3] = ((PacketBuffer) ((Object) var1)).readByte(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.wrapException((Throwable) ((Object) var1_ref), "u.D(" + param0 + ')');
        }
    }

    final static void restoreWindowedMode(int param0) {
        if (param0 != 6) {
          return;
        }
        if (ProxySocketConnector.field_m == null) {
          return;
        }
        UiComponent.attachInputListeners(ProxySocketConnector.field_m, (byte) 122);
        ProxySocketConnector.field_m.a(fi.field_d, (byte) 67);
        ProxySocketConnector.field_m = null;
        if (ResizableModalPanel.field_Y != null) {
          ResizableModalPanel.field_Y.restoreWindowedSize(true);
        }
        on.field_c.requestFocus();
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          field_k = true;
        }
        field_f = null;
        field_m = null;
        field_h = null;
        field_d = null;
        field_j = null;
    }

    HuffmanCodec(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var2_int = param0.length;
          this.field_a = param0;
          this.field_e = new int[var2_int];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_c = new int[8];
          var4 = 0;
          for (var5 = 0; var2_int > var5; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_e[var5] = var8;
              if ((var8 & var7) == 0) {
                for (var10 = var6 - 1; var10 >= 1; var10--) {
                  var11 = var17[var10];
                  if (var11 == var8) {
                    var12 = 1 << -var10 + 32;
                    if ((var12 & var11) == 0) {
                      var3[var10] = fj.bitOr(var12, var11);
                      continue;
                    }
                    var3[var10] = var3[-1 + var10];
                  }
                  break;
                }
                var9 = var7 | var8;
              } else {
                var9 = var3[-1 + var6];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = 1 + var6; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (~var17[var10Lifetime1] == ~var8) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var11Lifetime1 < var6; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if (0 == (var12Lifetime1 & var8)) {
                  var10Lifetime2++;
                } else {
                  if (this.field_c[var10Lifetime2] == 0) {
                    this.field_c[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_c[var10Lifetime2];
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
                if (this.field_c.length <= var10Lifetime2) {
                  var13 = new int[2 * this.field_c.length];
                  for (var14 = 0; this.field_c.length > var14; var14++) {
                    var13[var14] = this.field_c[var14];
                  }
                  this.field_c = var13;
                }
              }
              this.field_c[var10Lifetime2] = ~var5;
              if (var10Lifetime2 >= var4) {
                var4 = 1 + var10Lifetime2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("u.<init>(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    final static String formatStatusText(byte param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_20_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        String stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (1 == param1) {
            stackIn_2_0 = CachedArchiveProvider.formatTemplate(126, new String[]{param2}, BoundedRandomAccessFile.field_e);
            return stackIn_2_0;
          }
          if (param1 == 2) {
            stackIn_6_0 = CachedArchiveProvider.formatTemplate(-73, new String[]{param2}, AudioService.field_h);
            return stackIn_6_0;
          }
          if (param1 == 3) {
            stackIn_9_0 = CachedArchiveProvider.formatTemplate(-54, new String[]{param2}, SceneTabbedPanel.field_Gb);
            return stackIn_9_0;
          }
          if (param1 == 4) {
            stackIn_13_0 = CachedArchiveProvider.formatTemplate(125, new String[]{param2}, DropTargetWidget.field_M);
            return stackIn_13_0;
          }
          if (5 == param1) {
            stackIn_16_0 = CachedArchiveProvider.formatTemplate(-95, new String[]{param2}, LinkButtonPainter.field_n);
            return stackIn_16_0;
          }
          if (param1 == 6) {
            stackIn_20_0 = CachedArchiveProvider.formatTemplate(120, new String[]{param2}, b.field_b);
            return stackIn_20_0;
          }
          if (param1 == 7) {
            stackIn_23_0 = CachedArchiveProvider.formatTemplate(122, new String[]{param2}, ho.field_d);
            return stackIn_23_0;
          }
          if (param1 == 8) {
            stackIn_26_0 = CachedArchiveProvider.formatTemplate(122, new String[]{param2}, c.field_c);
            return stackIn_26_0;
          }
          if (param1 == 11) {
            stackIn_30_0 = CachedArchiveProvider.formatTemplate(-92, new String[]{param2}, ui.field_w);
            return stackIn_30_0;
          }
          if (param1 == 12) {
            stackIn_34_0 = CachedArchiveProvider.formatTemplate(-85, new String[]{param2}, MenuInputState.field_n);
            return stackIn_34_0;
          }
          if (param0 >= -125) {
            field_l = -80;
          }
          if (param1 != 13) {
            return null;
          }
          stackIn_40_0 = CachedArchiveProvider.formatTemplate(-123, new String[]{param2}, qo.field_d);
          return stackIn_40_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_43_0 = var3;
          stackIn_43_1 = new StringBuilder().append("u.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    static {
        field_k = false;
        field_h = new int[]{76, 77, 78};
        field_m = "Armageddon counter";
        field_f = new IntrusiveDequeCursor();
        field_i = 0;
        field_d = "Friends";
    }
}
