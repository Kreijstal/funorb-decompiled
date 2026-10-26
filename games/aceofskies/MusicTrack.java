/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicTrack extends IntrusiveNode {
    byte[] field_e;
    IntrusiveNodeHashTable field_f;

    final static MusicTrack a(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.a(param1, (byte) -71, param2);
        if (var3 == null) {
          return null;
        }
        return new MusicTrack(new PacketBuffer(var3));
    }

    final void b() {
        if (this.field_f != null) {
          return;
        }
        this.field_f = new IntrusiveNodeHashTable(16);
        int[] var21 = new int[16];
        int[] var18 = var21;
        int[] var1 = var18;
        int[] var19 = new int[16];
        int[] var16 = var19;
        int[] var2 = var16;
        int[] var23 = var1;
        var19[9] = 128;
        var23[9] = 128;
        k var4 = new k(this.field_e);
        int var5 = var4.f();
        for (int var6 = 0; var6 < var5; var6++) {
          var4.a(var6);
          var4.c(var6);
          var4.f(var6);
        }
        while (true) {
          int var6Lifetime1 = var4.e();
          int var7 = var4.field_f[var6Lifetime1];
          while (true) {
            if (var4.field_f[var6Lifetime1] != var7) {
              break;
            }
            var4.a(var6Lifetime1);
            int var8 = var4.e(var6Lifetime1);
            if (var8 == 1) {
              var4.a();
              var4.f(var6Lifetime1);
              if (var4.g()) {
                return;
              }
              break;
            }
            int var9 = var8 & 240;
            if (var9 == 176) {
              int var10 = var8 & 15;
              int var11 = var8 >> 8 & 127;
              int var12 = var8 >> 16 & 127;
              if (var11 == 0) {
                var1[var10] = (var21[var10] & -2080769) + (var12 << 14);
              }
              if (var11 == 32) {
                var1[var10] = (var21[var10] & -16257) + (var12 << 7);
              }
            }
            if (var9 == 192) {
              int var10Lifetime1 = var8 & 15;
              int var11Lifetime1 = var8 >> 8 & 127;
              var2[var10Lifetime1] = var21[var10Lifetime1] + var11Lifetime1;
            }
            if (var9 == 144) {
              int var10Lifetime2 = var8 & 15;
              int var11Lifetime2 = var8 >> 8 & 127;
              int var12Lifetime1 = var8 >> 16 & 127;
              if (var12Lifetime1 > 0) {
                int var13 = var19[var10Lifetime2];
                ub var14 = (ub) (this.field_f.findByKey((byte) 106, (long)var13));
                if (var14 == null) {
                  ub var15 = new ub(new byte[128]);
                  var14 = var15;
                  this.field_f.put(109, (long)var13, var15);
                }
                var14.field_e[var11Lifetime2] = (byte) 1;
              }
            }
            var4.c(var6Lifetime1);
            var4.f(var6Lifetime1);
          }
        }
    }

    final void a() {
        this.field_f = null;
    }

    private MusicTrack(PacketBuffer param0) {
        int stackIn_85_1 = 0;
        int var66;
        param0.position = param0.payload.length - 3;
        int var2 = param0.readUnsignedByte(-77);
        int var3 = param0.readUnsignedShort((byte) 0);
        int var4 = 14 + var2 * 10;
        param0.position = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        while (var13 < var2) {
          int var14 = -1;
          while (true) {
            int var15 = param0.readUnsignedByte(102);
            if (var15 != var14) {
              var4++;
            }
            var14 = var15 & 15;
            if (var15 == 7) {
              var13++;
              break;
            }
            if (var15 == 23) {
              var5++;
              continue;
            }
            if (var14 == 0) {
              var7++;
              continue;
            }
            if (var14 == 1) {
              var8++;
              continue;
            }
            if (var14 == 2) {
              var6++;
              continue;
            }
            if (var14 == 3) {
              var9++;
              continue;
            }
            if (var14 == 4) {
              var10++;
              continue;
            }
            if (var14 == 5) {
              var11++;
              continue;
            }
            if (var14 != 6) {
              throw new RuntimeException();
            }
            var12++;
          }
        }
        var4 = var4 + 5 * var5;
        var4 = var4 + 2 * (var7 + var8 + var6 + var9 + var11);
        var4 = var4 + (var10 + var12);
        int var13Lifetime1 = param0.position;
        int var14Lifetime1 = var2 + var5 + var6 + var7 + var8 + var9 + var10 + var11 + var12;
        for (int var15Lifetime1 = 0; var15Lifetime1 < var14Lifetime1; var15Lifetime1++) {
          param0.a(125);
        }
        var4 = var4 + (param0.position - var13Lifetime1);
        int var15Lifetime2 = param0.position;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        for (int var29 = 0; var29 < var6; var29++) {
          var28 = var28 + param0.readUnsignedByte(67) & 127;
          if (var28 == 0) {
            var12++;
          } else if (var28 == 32) {
            var12++;
          } else if (var28 == 1) {
            var16++;
          } else if (var28 == 33) {
            var17++;
          } else if (var28 == 7) {
            var18++;
          } else if (var28 == 39) {
            var19++;
          } else if (var28 == 10) {
            var20++;
          } else if (var28 == 42) {
            var21++;
          } else if (var28 == 99) {
            var22++;
          } else if (var28 == 98) {
            var23++;
          } else if (var28 == 101) {
            var24++;
          } else if (var28 == 100) {
            var25++;
          } else if (var28 == 64) {
            var26++;
          } else if (var28 == 65) {
            var26++;
          } else if (var28 == 120) {
            var26++;
          } else if (var28 == 121) {
            var26++;
          } else if (var28 != 123) {
            var27++;
          } else {
            var26++;
          }
        }
        int var29Lifetime1 = 0;
        int var30 = param0.position;
        param0.position = param0.position + var26;
        int var31 = param0.position;
        param0.position = param0.position + var11;
        int var32 = param0.position;
        param0.position = param0.position + var10;
        int var33 = param0.position;
        param0.position = param0.position + var9;
        int var34 = param0.position;
        param0.position = param0.position + var16;
        int var35 = param0.position;
        param0.position = param0.position + var18;
        int var36 = param0.position;
        param0.position = param0.position + var20;
        int var37 = param0.position;
        param0.position = param0.position + (var7 + var8 + var11);
        int var38 = param0.position;
        param0.position = param0.position + var7;
        int var39 = param0.position;
        param0.position = param0.position + var27;
        int var40 = param0.position;
        param0.position = param0.position + var8;
        int var41 = param0.position;
        param0.position = param0.position + var17;
        int var42 = param0.position;
        param0.position = param0.position + var19;
        int var43 = param0.position;
        param0.position = param0.position + var21;
        int var44 = param0.position;
        param0.position = param0.position + var12;
        int var45 = param0.position;
        param0.position = param0.position + var9;
        int var46 = param0.position;
        param0.position = param0.position + var22;
        int var47 = param0.position;
        param0.position = param0.position + var23;
        int var48 = param0.position;
        param0.position = param0.position + var24;
        int var49 = param0.position;
        param0.position = param0.position + var25;
        int var50 = param0.position;
        param0.position = param0.position + var5 * 3;
        this.field_e = new byte[var4];
        PacketBuffer var51 = new PacketBuffer(this.field_e);
        var51.writeInt((byte) 87, 1297377380);
        var51.writeInt((byte) 127, 6);
        PacketBuffer stackIn_84_0 = var51;
        stackIn_85_1 = (var2 <= 1) ? (0) : (1);
        ((PacketBuffer) (Object) stackIn_84_0).writeShort(stackIn_85_1, 23385);
        var51.writeShort(var2, 23385);
        var51.writeShort(var3, 23385);
        param0.position = var13Lifetime1;
        int var52 = 0;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int[] var70 = new int[128];
        int var28Lifetime1 = 0;
        int var60 = 0;
        while (true) {
          if (var60 >= var2) {
            return;
          }
          var51.writeInt((byte) 102, 1297379947);
          var51.position = var51.position + 4;
          int var61 = var51.position;
          int var62 = -1;
          while (true) {
            int var63 = param0.a(120);
            var51.d(93, var63);
            int incrementValue$0 = var29Lifetime1;
            var29Lifetime1++;
            int var64 = param0.payload[incrementValue$0] & 255;
            boolean stackIn_91_0 = !(var64 == var62);
            boolean var65 = stackIn_91_0;
            var62 = var64 & 15;
            if (var64 == 7) {
              if (var65) {
                var51.writeByte(-1336879960, 255);
              }
              var51.writeByte(-1336879960, 47);
              var51.writeByte(-1336879960, 0);
              var51.f(var51.position - var61, 28494);
              var60++;
              break;
            }
            if (var64 == 23) {
              if (var65) {
                var51.writeByte(-1336879960, 255);
              }
              var51.writeByte(-1336879960, 81);
              var51.writeByte(-1336879960, 3);
              int incrementValue$25 = var50;
              var50++;
              var51.writeByte(-1336879960, (int) param0.payload[incrementValue$25]);
              int incrementValue$26 = var50;
              var50++;
              var51.writeByte(-1336879960, (int) param0.payload[incrementValue$26]);
              int incrementValue$27 = var50;
              var50++;
              var51.writeByte(-1336879960, (int) param0.payload[incrementValue$27]);
              continue;
            }
            var52 = var52 ^ var64 >> 4;
            if (var62 == 0) {
              if (var65) {
                var51.writeByte(-1336879960, 144 + var52);
              }
              int incrementValue$23 = var37;
              var37++;
              var53 = var53 + param0.payload[incrementValue$23];
              int incrementValue$24 = var38;
              var38++;
              var54 = var54 + param0.payload[incrementValue$24];
              var51.writeByte(-1336879960, var53 & 127);
              var51.writeByte(-1336879960, var54 & 127);
              continue;
            }
            if (var62 == 1) {
              if (var65) {
                var51.writeByte(-1336879960, 128 + var52);
              }
              int incrementValue$21 = var37;
              var37++;
              var53 = var53 + param0.payload[incrementValue$21];
              int incrementValue$22 = var40;
              var40++;
              var55 = var55 + param0.payload[incrementValue$22];
              var51.writeByte(-1336879960, var53 & 127);
              var51.writeByte(-1336879960, var55 & 127);
              continue;
            }
            if (var62 != 2) {
              if (var62 == 3) {
                if (var65) {
                  var51.writeByte(-1336879960, 224 + var52);
                }
                int incrementValue$5 = var45;
                var45++;
                var56 = var56 + param0.payload[incrementValue$5];
                int incrementValue$6 = var33;
                var33++;
                var56 = var56 + (param0.payload[incrementValue$6] << 7);
                var51.writeByte(-1336879960, var56 & 127);
                var51.writeByte(-1336879960, var56 >> 7 & 127);
                continue;
              }
              if (var62 == 4) {
                if (var65) {
                  var51.writeByte(-1336879960, 208 + var52);
                }
                int incrementValue$4 = var32;
                var32++;
                var57 = var57 + param0.payload[incrementValue$4];
                var51.writeByte(-1336879960, var57 & 127);
                continue;
              }
              if (var62 != 5) {
                if (var62 != 6) {
                  throw new RuntimeException();
                }
                if (var65) {
                  var51.writeByte(-1336879960, 192 + var52);
                }
                int incrementValue$1 = var44;
                var44++;
                var51.writeByte(-1336879960, (int) param0.payload[incrementValue$1]);
                continue;
              }
              if (var65) {
                var51.writeByte(-1336879960, 160 + var52);
              }
              int incrementValue$2 = var37;
              var37++;
              var53 = var53 + param0.payload[incrementValue$2];
              int incrementValue$3 = var31;
              var31++;
              var58 = var58 + param0.payload[incrementValue$3];
              var51.writeByte(-1336879960, var53 & 127);
              var51.writeByte(-1336879960, var58 & 127);
              continue;
            }
            if (var65) {
              var51.writeByte(-1336879960, 176 + var52);
            }
            int incrementValue$7 = var15Lifetime2;
            var15Lifetime2++;
            var28Lifetime1 = var28Lifetime1 + param0.payload[incrementValue$7] & 127;
            var51.writeByte(-1336879960, var28Lifetime1);
            if (var28Lifetime1 != 0 &&
              var28Lifetime1 != 32) {
              if (var28Lifetime1 == 1) {
                int incrementValue$19 = var34;
                var34++;
                var66 = param0.payload[incrementValue$19];
              } else if (var28Lifetime1 == 33) {
                int incrementValue$18 = var41;
                var41++;
                var66 = param0.payload[incrementValue$18];
              } else if (var28Lifetime1 == 7) {
                int incrementValue$17 = var35;
                var35++;
                var66 = param0.payload[incrementValue$17];
              } else if (var28Lifetime1 == 39) {
                int incrementValue$16 = var42;
                var42++;
                var66 = param0.payload[incrementValue$16];
              } else if (var28Lifetime1 == 10) {
                int incrementValue$15 = var36;
                var36++;
                var66 = param0.payload[incrementValue$15];
              } else if (var28Lifetime1 == 42) {
                int incrementValue$14 = var43;
                var43++;
                var66 = param0.payload[incrementValue$14];
              } else if (var28Lifetime1 == 99) {
                int incrementValue$13 = var46;
                var46++;
                var66 = param0.payload[incrementValue$13];
              } else if (var28Lifetime1 == 98) {
                int incrementValue$12 = var47;
                var47++;
                var66 = param0.payload[incrementValue$12];
              } else if (var28Lifetime1 == 101) {
                int incrementValue$11 = var48;
                var48++;
                var66 = param0.payload[incrementValue$11];
              } else if (var28Lifetime1 == 100) {
                int incrementValue$10 = var49;
                var49++;
                var66 = param0.payload[incrementValue$10];
              } else if (var28Lifetime1 != 64 &&
                var28Lifetime1 != 65 &&
                var28Lifetime1 != 120 &&
                var28Lifetime1 != 121 &&
                var28Lifetime1 != 123) {
                int incrementValue$8 = var39;
                var39++;
                var66 = param0.payload[incrementValue$8];
              } else {
                int incrementValue$9 = var30;
                var30++;
                var66 = param0.payload[incrementValue$9];
              }
            } else {
              int incrementValue$20 = var44;
              var44++;
              var66 = param0.payload[incrementValue$20];
            }
            var66 = var66 + var70[var28Lifetime1];
            var70[var28Lifetime1] = var66;
            var51.writeByte(-1336879960, var66 & 127);
          }
        }
    }
}
