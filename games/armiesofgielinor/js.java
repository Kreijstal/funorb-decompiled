/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends ni {
    private byte[] field_F;
    private short[] field_k;
    int[] field_u;
    short[] field_n;
    private byte[] field_z;
    int field_E;
    private byte[] field_I;
    short[] field_i;
    private byte[] field_f;
    private short[] field_s;
    kg[] field_L;
    int[] field_o;
    private int[] field_e;
    int field_O;
    int[] field_N;
    short[] field_C;
    byte[] field_p;
    int field_v;
    int[][] field_l;
    short[] field_j;
    byte[] field_G;
    byte[] field_t;
    int[] field_q;
    short[] field_M;
    private short[] field_K;
    short[] field_A;
    wi[] field_y;
    private byte[] field_J;
    byte[] field_w;
    short[] field_B;
    byte[] field_h;
    wi[] field_g;
    int[][] field_H;
    int field_x;
    int[] field_r;
    private int[] field_m;
    int[] field_D;

    private final void b(byte[] param0) {
        int var2;
        int var3;
        PacketBuffer var4;
        PacketBuffer var5;
        PacketBuffer var6;
        PacketBuffer var7;
        PacketBuffer var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var38Lifetime1;
        int var38Lifetime2;
        int var39Lifetime1;
        int var39Lifetime2;
        int var40Lifetime1;
        int var41Lifetime1;
        int var42Lifetime1;
        int var42Lifetime2;
        int var42Lifetime3;
        int var43Lifetime1;
        int var44Lifetime1;
        var2 = 0;
        var3 = 0;
        var4 = new PacketBuffer(param0);
        var5 = new PacketBuffer(param0);
        var6 = new PacketBuffer(param0);
        var7 = new PacketBuffer(param0);
        var8 = new PacketBuffer(param0);
        var4.position = param0.length - 18;
        var9 = var4.readUnsignedShort((byte) -104);
        var10 = var4.readUnsignedShort((byte) -104);
        var11 = var4.readUnsignedByte(0);
        var12 = var4.readUnsignedByte(0);
        var13 = var4.readUnsignedByte(0);
        var14 = var4.readUnsignedByte(0);
        var15 = var4.readUnsignedByte(0);
        var16 = var4.readUnsignedByte(0);
        var17 = var4.readUnsignedShort((byte) -104);
        var18 = var4.readUnsignedShort((byte) -104);
        var19 = var4.readUnsignedShort((byte) -104);
        var20 = var4.readUnsignedShort((byte) -104);
        var21 = 0;
        var22 = var21;
        var21 = var21 + var9;
        var23 = var21;
        var21 = var21 + var10;
        var24 = var21;
        if (var13 == 255) {
          var21 = var21 + var10;
        }
        var25 = var21;
        if (var15 == 1) {
          var21 = var21 + var10;
        }
        var26 = var21;
        if (var12 == 1) {
          var21 = var21 + var10;
        }
        var27 = var21;
        if (var16 == 1) {
          var21 = var21 + var9;
        }
        var28 = var21;
        if (var14 == 1) {
          var21 = var21 + var10;
        }
        var29 = var21;
        var21 = var21 + var20;
        var30 = var21;
        var21 = var21 + var10 * 2;
        var31 = var21;
        var21 = var21 + var11 * 6;
        var32 = var21;
        var21 = var21 + var17;
        var33 = var21;
        var21 = var21 + var18;
        var34 = var21;
        var21 = var21 + var19;
        this.field_x = var9;
        this.field_O = var10;
        this.field_E = var11;
        this.field_N = new int[var9];
        this.field_D = new int[var9];
        this.field_u = new int[var9];
        this.field_q = new int[var10];
        this.field_o = new int[var10];
        this.field_r = new int[var10];
        if (var11 > 0) {
          this.field_t = new byte[var11];
          this.field_M = new short[var11];
          this.field_n = new short[var11];
          this.field_C = new short[var11];
        }
        if (var16 == 1) {
          this.field_m = new int[var9];
        }
        if (var12 == 1) {
          this.field_p = new byte[var10];
          this.field_G = new byte[var10];
          this.field_B = new short[var10];
        }
        if (var13 == 255) {
          this.field_w = new byte[var10];
        }
        if (var14 == 1) {
          this.field_h = new byte[var10];
        }
        if (var15 == 1) {
          this.field_e = new int[var10];
        }
        this.field_i = new short[var10];
        var4.position = var22;
        var5.position = var32;
        var6.position = var33;
        var7.position = var34;
        var8.position = var27;
        var35 = 0;
        var36 = 0;
        var37 = 0;
        for (var38 = 0; var38 < var9; var38++) {
          var39 = var4.readUnsignedByte(0);
          var40 = 0;
          if ((var39 & 1) != 0) {
            var40 = var5.a(78);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.a(58);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.a(64);
          }
          this.field_N[var38] = var35 + var40;
          this.field_D[var38] = var36 + var41;
          this.field_u[var38] = var37 + var42;
          var35 = this.field_N[var38];
          var36 = this.field_D[var38];
          var37 = this.field_u[var38];
          if (var16 == 1) {
            this.field_m[var38] = var8.readUnsignedByte(0);
          }
        }
        var4.position = var30;
        var5.position = var26;
        var6.position = var24;
        var7.position = var28;
        var8.position = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.field_i[var38Lifetime1] = (short)var4.readUnsignedShort((byte) -104);
          if (var12 == 1) {
            var39Lifetime1 = var5.readUnsignedByte(0);
            if ((var39Lifetime1 & 1) != 1) {
              this.field_p[var38Lifetime1] = (byte) 0;
            } else {
              this.field_p[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_G[var38Lifetime1] = (byte)-1;
              this.field_B[var38Lifetime1] = (short)-1;
            } else {
              this.field_G[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.field_B[var38Lifetime1] = this.field_i[var38Lifetime1];
              this.field_i[var38Lifetime1] = (short)127;
              if (this.field_B[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_w[var38Lifetime1] = var6.readByte((byte) -124);
          }
          if (var14 == 1) {
            this.field_h[var38Lifetime1] = var7.readByte((byte) 126);
          }
          if (var15 == 1) {
            this.field_e[var38Lifetime1] = var8.readUnsignedByte(0);
          }
        }
        this.field_v = -1;
        var4.position = var29;
        var5.position = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.readUnsignedByte(0);
          if (var43 == 1) {
            var38Lifetime2 = var4.a(115) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.a(76) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.a(53) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_q[var42Lifetime1] = var38Lifetime2;
            this.field_o[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.field_v) {
              this.field_v = var38Lifetime2;
            }
            if (var39Lifetime2 > this.field_v) {
              this.field_v = var39Lifetime2;
            }
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.a(67) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_q[var42Lifetime1] = var38Lifetime2;
            this.field_o[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.a(106) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_q[var42Lifetime1] = var38Lifetime2;
            this.field_o[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.a(109) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.field_q[var42Lifetime1] = var38Lifetime2;
            this.field_o[var42Lifetime1] = var39Lifetime2;
            this.field_r[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.field_v) {
              this.field_v = var40Lifetime1;
            }
          }
        }
        this.field_v = this.field_v + 1;
        var4.position = var31;
        for (var42Lifetime2 = 0; var42Lifetime2 < var11; var42Lifetime2++) {
          this.field_t[var42Lifetime2] = (byte) 0;
          this.field_M[var42Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
          this.field_n[var42Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
          this.field_C[var42Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
        }
        if (this.field_G != null) {
          var42Lifetime3 = 0;
          var45 = 0;
          var43Lifetime1 = var45;
          while (var45 < var10) {
            var44Lifetime1 = this.field_G[var45] & 255;
            if (var44Lifetime1 != 255) {
              if ((this.field_M[var44Lifetime1] & 65535) == this.field_q[var45] &&
                (this.field_n[var44Lifetime1] & 65535) == this.field_o[var45] &&
                (this.field_C[var44Lifetime1] & 65535) == this.field_r[var45]) {
                this.field_G[var45] = (byte)-1;
              } else {
                var42Lifetime3 = 1;
              }
            }
            var45++;
          }
          if (var42Lifetime3 == 0) {
            this.field_G = null;
          }
        }
        if (var3 == 0) {
          this.field_B = null;
        }
        if (var2 == 0) {
          this.field_p = null;
        }
    }

    private final void a(byte[] param0) {
        byte dupTemp$0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        PacketBuffer var2;
        PacketBuffer var3;
        PacketBuffer var4;
        PacketBuffer var5;
        PacketBuffer var6;
        PacketBuffer var7;
        PacketBuffer var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        int var27;
        int var28;
        int var29;
        int var30;
        int var31;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var37;
        int var38;
        int var39;
        int var40;
        int var41;
        int var42;
        int var43;
        int var44;
        int var45;
        int var46;
        int var47;
        int var48;
        int var49;
        int var50;
        int var51;
        int var52;
        int var53;
        int var54;
        int var55;
        int var56;
        int var57;
        int var58;
        int var59;
        int var28Lifetime1;
        int var29Lifetime1;
        int var53Lifetime1;
        int var53Lifetime2;
        int var54Lifetime1;
        int var55Lifetime1;
        int var56Lifetime1;
        int var57Lifetime1;
        int var57Lifetime2;
        int var57Lifetime3;
        int var58Lifetime1;
        int var58Lifetime2;
        var2 = new PacketBuffer(param0);
        var3 = new PacketBuffer(param0);
        var4 = new PacketBuffer(param0);
        var5 = new PacketBuffer(param0);
        var6 = new PacketBuffer(param0);
        var7 = new PacketBuffer(param0);
        var8 = new PacketBuffer(param0);
        var2.position = param0.length - 23;
        var9 = var2.readUnsignedShort((byte) -104);
        var10 = var2.readUnsignedShort((byte) -104);
        var11 = var2.readUnsignedByte(0);
        var12 = var2.readUnsignedByte(0);
        stackIn_3_0 = ((var12 & 1) != 1) ? 0 : 1;
        var13 = stackIn_3_0;
        stackIn_6_0 = ((var12 & 2) != 2) ? 0 : 1;
        var14 = stackIn_6_0;
        var15 = var2.readUnsignedByte(0);
        var16 = var2.readUnsignedByte(0);
        var17 = var2.readUnsignedByte(0);
        var18 = var2.readUnsignedByte(0);
        var19 = var2.readUnsignedByte(0);
        var20 = var2.readUnsignedShort((byte) -104);
        var21 = var2.readUnsignedShort((byte) -104);
        var22 = var2.readUnsignedShort((byte) -104);
        var23 = var2.readUnsignedShort((byte) -104);
        var24 = var2.readUnsignedShort((byte) -104);
        var25 = 0;
        var26 = 0;
        var27 = 0;
        if (var11 > 0) {
          this.field_t = new byte[var11];
          var2.position = 0;
          for (var28 = 0; var28 < var11; var28++) {
            dupTemp$0 = var2.readByte((byte) 107);
            this.field_t[var28] = dupTemp$0;
            var29 = dupTemp$0;
            if (var29 == 0) {
              var25++;
            }
            if (var29 >= 1 &&
              var29 <= 3) {
              var26++;
            }
            if (var29 == 2) {
              var27++;
            }
          }
        }
        var28Lifetime1 = var11;
        var29Lifetime1 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var9;
        var30 = var28Lifetime1;
        if (var13 != 0) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var31 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var10;
        var32 = var28Lifetime1;
        if (var15 == 255) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var33 = var28Lifetime1;
        if (var17 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var34 = var28Lifetime1;
        if (var19 == 1) {
          var28Lifetime1 = var28Lifetime1 + var9;
        }
        var35 = var28Lifetime1;
        if (var16 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10;
        }
        var36 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var23;
        var37 = var28Lifetime1;
        if (var18 == 1) {
          var28Lifetime1 = var28Lifetime1 + var10 * 2;
        }
        var38 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var24;
        var39 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var10 * 2;
        var40 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var20;
        var41 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var21;
        var42 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var22;
        var43 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var25 * 6;
        var44 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26 * 6;
        var45 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26 * 6;
        var46 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26;
        var47 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + var26;
        var48 = var28Lifetime1;
        var28Lifetime1 = var28Lifetime1 + (var26 + var27 * 2);
        var49 = var28Lifetime1;
        this.field_x = var9;
        this.field_O = var10;
        this.field_E = var11;
        this.field_N = new int[var9];
        this.field_D = new int[var9];
        this.field_u = new int[var9];
        this.field_q = new int[var10];
        this.field_o = new int[var10];
        this.field_r = new int[var10];
        if (var19 == 1) {
          this.field_m = new int[var9];
        }
        if (var13 != 0) {
          this.field_p = new byte[var10];
        }
        if (var15 == 255) {
          this.field_w = new byte[var10];
        }
        if (var16 == 1) {
          this.field_h = new byte[var10];
        }
        if (var17 == 1) {
          this.field_e = new int[var10];
        }
        if (var18 == 1) {
          this.field_B = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_G = new byte[var10];
        }
        this.field_i = new short[var10];
        if (var11 > 0) {
          this.field_M = new short[var11];
          this.field_n = new short[var11];
          this.field_C = new short[var11];
          if (var26 > 0) {
            this.field_K = new short[var26];
            this.field_s = new short[var26];
            this.field_k = new short[var26];
            this.field_J = new byte[var26];
            this.field_f = new byte[var26];
            this.field_I = new byte[var26];
          }
          if (var27 > 0) {
            this.field_F = new byte[var27];
            this.field_z = new byte[var27];
          }
        }
        var2.position = var29Lifetime1;
        var3.position = var40;
        var4.position = var41;
        var5.position = var42;
        var6.position = var34;
        var50 = 0;
        var51 = 0;
        var52 = 0;
        for (var53 = 0; var53 < var9; var53++) {
          var54 = var2.readUnsignedByte(0);
          var55 = 0;
          if ((var54 & 1) != 0) {
            var55 = var3.a(67);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.a(114);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.a(96);
          }
          this.field_N[var53] = var50 + var55;
          this.field_D[var53] = var51 + var56;
          this.field_u[var53] = var52 + var57;
          var50 = this.field_N[var53];
          var51 = this.field_D[var53];
          var52 = this.field_u[var53];
          if (var19 == 1) {
            this.field_m[var53] = var6.readUnsignedByte(0);
          }
        }
        var2.position = var39;
        var3.position = var30;
        var4.position = var32;
        var5.position = var35;
        var6.position = var33;
        var7.position = var37;
        var8.position = var38;
        for (var53Lifetime1 = 0; var53Lifetime1 < var10; var53Lifetime1++) {
          this.field_i[var53Lifetime1] = (short)var2.readUnsignedShort((byte) -104);
          if (var13 != 0) {
            this.field_p[var53Lifetime1] = var3.readByte((byte) 8);
          }
          if (var15 == 255) {
            this.field_w[var53Lifetime1] = var4.readByte((byte) -101);
          }
          if (var16 == 1) {
            this.field_h[var53Lifetime1] = var5.readByte((byte) 105);
          }
          if (var17 == 1) {
            this.field_e[var53Lifetime1] = var6.readUnsignedByte(0);
          }
          if (var18 == 1) {
            this.field_B[var53Lifetime1] = (short)(var7.readUnsignedShort((byte) -104) - 1);
          }
          if (this.field_G != null) {
            if (this.field_B[var53Lifetime1] == -1) {
              this.field_G[var53Lifetime1] = (byte)-1;
            } else {
              this.field_G[var53Lifetime1] = (byte)(var8.readUnsignedByte(0) - 1);
            }
          }
        }
        this.field_v = -1;
        var2.position = var36;
        var3.position = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.readUnsignedByte(0);
          if (var58 == 1) {
            var53Lifetime2 = var2.a(51) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.a(80) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.a(62) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_q[var57Lifetime1] = var53Lifetime2;
            this.field_o[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.field_v) {
              this.field_v = var53Lifetime2;
            }
            if (var54Lifetime1 > this.field_v) {
              this.field_v = var54Lifetime1;
            }
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.a(99) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_q[var57Lifetime1] = var53Lifetime2;
            this.field_o[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.a(119) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_q[var57Lifetime1] = var53Lifetime2;
            this.field_o[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.a(118) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.field_q[var57Lifetime1] = var53Lifetime2;
            this.field_o[var57Lifetime1] = var54Lifetime1;
            this.field_r[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.field_v) {
              this.field_v = var55Lifetime1;
            }
          }
        }
        this.field_v = this.field_v + 1;
        var2.position = var43;
        var3.position = var44;
        var4.position = var45;
        var5.position = var46;
        var6.position = var47;
        var7.position = var48;
        for (var57Lifetime2 = 0; var57Lifetime2 < var11; var57Lifetime2++) {
          var58Lifetime1 = this.field_t[var57Lifetime2] & 255;
          if (var58Lifetime1 == 0) {
            this.field_M[var57Lifetime2] = (short)var2.readUnsignedShort((byte) -104);
            this.field_n[var57Lifetime2] = (short)var2.readUnsignedShort((byte) -104);
            this.field_C[var57Lifetime2] = (short)var2.readUnsignedShort((byte) -104);
          }
          if (var58Lifetime1 == 1) {
            this.field_M[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_n[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_C[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_K[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_s[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_k[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_J[var57Lifetime2] = var5.readByte((byte) -28);
            this.field_f[var57Lifetime2] = var6.readByte((byte) 107);
            this.field_I[var57Lifetime2] = var7.readByte((byte) -5);
          }
          if (var58Lifetime1 == 2) {
            this.field_M[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_n[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_C[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_K[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_s[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_k[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_J[var57Lifetime2] = var5.readByte((byte) -38);
            this.field_f[var57Lifetime2] = var6.readByte((byte) 113);
            this.field_I[var57Lifetime2] = var7.readByte((byte) -32);
            this.field_F[var57Lifetime2] = var7.readByte((byte) 104);
            this.field_z[var57Lifetime2] = var7.readByte((byte) -71);
          }
          if (var58Lifetime1 == 3) {
            this.field_M[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_n[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_C[var57Lifetime2] = (short)var3.readUnsignedShort((byte) -104);
            this.field_K[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_s[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_k[var57Lifetime2] = (short)var4.readUnsignedShort((byte) -104);
            this.field_J[var57Lifetime2] = var5.readByte((byte) -60);
            this.field_f[var57Lifetime2] = var6.readByte((byte) 120);
            this.field_I[var57Lifetime2] = var7.readByte((byte) 97);
          }
        }
        if (var14 != 0) {
          var2.position = var49;
          var57Lifetime3 = var2.readUnsignedByte(0);
          if (var57Lifetime3 > 0) {
            var2.position = var2.position + 4 * var57Lifetime3;
          }
          var58Lifetime2 = var2.readUnsignedByte(0);
          if (var58Lifetime2 > 0) {
            var2.position = var2.position + 4 * var58Lifetime2;
          }
        }
    }

    final void b() {
        kg dupTemp$0 = null;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        kg var16;
        wi var17;
        wi var18;
        wi var19;
        int var1Lifetime1;
        if (this.field_y != null) {
          return;
        }
        this.field_y = new wi[this.field_v];
        for (var1 = 0; var1 < this.field_v; var1++) {
          this.field_y[var1] = new wi();
        }
        var1Lifetime1 = 0;
        while (true) {
          if (var1Lifetime1 >= this.field_O) {
            return;
          }
          var2 = this.field_q[var1Lifetime1];
          var3 = this.field_o[var1Lifetime1];
          var4 = this.field_r[var1Lifetime1];
          var5 = this.field_N[var3] - this.field_N[var2];
          var6 = this.field_D[var3] - this.field_D[var2];
          var7 = this.field_u[var3] - this.field_u[var2];
          var8 = this.field_N[var4] - this.field_N[var2];
          var9 = this.field_D[var4] - this.field_D[var2];
          var10 = this.field_u[var4] - this.field_u[var2];
          var11 = var6 * var10 - var9 * var7;
          var12 = var7 * var8 - var10 * var5;
          var13 = var5 * var9 - var8 * var6;
          while (true) {
            if (var11 <= 8192 &&
              var12 <= 8192 &&
              var13 <= 8192 &&
              var11 >= -8192 &&
              var12 >= -8192 &&
              var13 >= -8192) {
              var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
              if (var14 <= 0) {
                var14 = 1;
              }
              var11 = var11 * 256 / var14;
              var12 = var12 * 256 / var14;
              var13 = var13 * 256 / var14;
              if (this.field_p != null) {
                var15 = this.field_p[var1Lifetime1];
              } else {
                var15 = 0;
              }
              if (var15 != 0) {
                if (var15 == 1) {
                  if (this.field_L == null) {
                    this.field_L = new kg[this.field_O];
                  }
                  dupTemp$0 = new kg();
                  this.field_L[var1Lifetime1] = dupTemp$0;
                  var16 = dupTemp$0;
                  var16.field_b = var11;
                  var16.field_a = var12;
                  var16.field_e = var13;
                }
              } else {
                var17 = this.field_y[var2];
                var17.field_d = var17.field_d + var11;
                var17.field_e = var17.field_e + var12;
                var17.field_b = var17.field_b + var13;
                var17.field_g = var17.field_g + 1;
                var18 = this.field_y[var3];
                var18.field_d = var18.field_d + var11;
                var18.field_e = var18.field_e + var12;
                var18.field_b = var18.field_b + var13;
                var18.field_g = var18.field_g + 1;
                var19 = this.field_y[var4];
                var19.field_d = var19.field_d + var11;
                var19.field_e = var19.field_e + var12;
                var19.field_b = var19.field_b + var13;
                var19.field_g = var19.field_g + 1;
              }
              var1Lifetime1++;
              break;
            }
            var11 = var11 >> 1;
            var12 = var12 >> 1;
            var13 = var13 >> 1;
          }
        }
    }

    final static js a(ResourceArchive param0, String param1, String param2) {
        byte[] var3 = param0.a(param2, 93, param1);
        if (var3 == null) {
          return null;
        }
        return new js(var3);
    }

    final kk a(int param0, int param1, int param2, int param3, int param4) {
        return (kk) ((Object) new ModelMesh(this, param0, param1, param2, param3, param4));
    }

    final void a() {
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$5 = null;
        int dupTemp$3 = 0;
        int[] arrayValue$4 = null;
        int var2;
        int var3;
        int var4;
        int[] var5;
        int[] var6;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime1Lifetime1;
        int var2Lifetime1;
        int var3Lifetime1;
        if (this.field_m != null) {
          var5 = new int[256];
          var2 = 0;
          for (var3 = 0; var3 < this.field_x; var3++) {
            var4 = this.field_m[var3];
            var5[var4] = var5[var4] + 1;
            if (var4 > var2) {
              var2 = var4;
            }
          }
          this.field_l = new int[var2 + 1][];
          for (var3 = 0; var3 <= var2; var3++) {
            array$2 = new int[var5[var3]];
            this.field_l[var3] = array$2;
            var5[var3] = 0;
          }
          for (var3 = 0; var3 < this.field_x; var3++) {
            var4Lifetime2 = this.field_m[var3];
            dupTemp$0 = var5[var4Lifetime2];
            arrayValue$1 = this.field_l[var4Lifetime2];
            var5[var4Lifetime2] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = var3;
          }
          this.field_m = null;
        }
        if (this.field_e != null) {
          var6 = new int[256];
          var2Lifetime1 = 0;
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_O; var3Lifetime1++) {
            var4Lifetime1 = this.field_e[var3Lifetime1];
            var6[var4Lifetime1] = var6[var4Lifetime1] + 1;
            if (var4Lifetime1 > var2Lifetime1) {
              var2Lifetime1 = var4Lifetime1;
            }
          }
          this.field_H = new int[var2Lifetime1 + 1][];
          for (var3Lifetime1 = 0; var3Lifetime1 <= var2Lifetime1; var3Lifetime1++) {
            array$5 = new int[var6[var3Lifetime1]];
            this.field_H[var3Lifetime1] = array$5;
            var6[var3Lifetime1] = 0;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < this.field_O; var3Lifetime1++) {
            var4Lifetime1Lifetime1 = this.field_e[var3Lifetime1];
            dupTemp$3 = var6[var4Lifetime1Lifetime1];
            arrayValue$4 = this.field_H[var4Lifetime1Lifetime1];
            var6[var4Lifetime1Lifetime1] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = var3Lifetime1;
          }
          this.field_e = null;
        }
    }

    private js(byte[] param0) {
        this.field_v = 0;
        this.field_O = 0;
        this.field_x = 0;
        if (param0[param0.length - 1] == -1 &&
          param0[param0.length - 2] == -1) {
          this.a(param0);
        } else {
          this.b(param0);
        }
    }

    js(js param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.field_v = 0;
        this.field_O = 0;
        this.field_x = 0;
        this.field_x = param0.field_x;
        this.field_v = param0.field_v;
        this.field_O = param0.field_O;
        this.field_E = param0.field_E;
        if (!param1) {
          this.field_N = new int[this.field_x];
          this.field_D = new int[this.field_x];
          this.field_u = new int[this.field_x];
          for (var6 = 0; var6 < this.field_x; var6++) {
            this.field_N[var6] = param0.field_N[var6];
            this.field_D[var6] = param0.field_D[var6];
            this.field_u[var6] = param0.field_u[var6];
          }
        } else {
          this.field_N = param0.field_N;
          this.field_D = param0.field_D;
          this.field_u = param0.field_u;
        }
        if (!param2) {
          this.field_i = new short[this.field_O];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.field_O; var6Lifetime1++) {
            this.field_i[var6Lifetime1] = param0.field_i[var6Lifetime1];
          }
        } else {
          this.field_i = param0.field_i;
        }
        if (!param3 &&
          param0.field_B != null) {
          this.field_B = new short[this.field_O];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.field_O; var6Lifetime2++) {
            this.field_B[var6Lifetime2] = param0.field_B[var6Lifetime2];
          }
        } else {
          this.field_B = param0.field_B;
        }
        if (!param4) {
          this.field_h = new byte[this.field_O];
          if (param0.field_h != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_O; var6Lifetime3++) {
              this.field_h[var6Lifetime3] = param0.field_h[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.field_O; var6Lifetime3++) {
              this.field_h[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.field_h = param0.field_h;
        }
        this.field_q = param0.field_q;
        this.field_o = param0.field_o;
        this.field_r = param0.field_r;
        this.field_p = param0.field_p;
        this.field_w = param0.field_w;
        this.field_G = param0.field_G;
        this.field_t = param0.field_t;
        this.field_M = param0.field_M;
        this.field_n = param0.field_n;
        this.field_C = param0.field_C;
        this.field_K = param0.field_K;
        this.field_s = param0.field_s;
        this.field_k = param0.field_k;
        this.field_J = param0.field_J;
        this.field_f = param0.field_f;
        this.field_I = param0.field_I;
        this.field_F = param0.field_F;
        this.field_z = param0.field_z;
        this.field_m = param0.field_m;
        this.field_e = param0.field_e;
        this.field_l = param0.field_l;
        this.field_H = param0.field_H;
        this.field_y = param0.field_y;
        this.field_L = param0.field_L;
        this.field_g = param0.field_g;
    }
}
