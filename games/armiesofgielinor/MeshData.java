/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshData extends MeshObject {
    private byte[] field_F;
    private short[] field_k;
    int[] verticesZ;
    short[] field_n;
    private byte[] field_z;
    int field_E;
    private byte[] field_I;
    short[] faceColors;
    private byte[] field_f;
    private short[] field_s;
    FaceNormal[] faceNormals;
    int[] faceVertexB;
    private int[] faceSkinIds;
    int faceCount;
    int[] verticesX;
    short[] field_C;
    byte[] faceRenderTypes;
    int referencedVertexCapacity;
    int[][] vertexGroups;
    short[] field_j;
    byte[] field_G;
    byte[] field_t;
    int[] faceVertexA;
    short[] field_M;
    private short[] field_K;
    short[] field_A;
    VertexNormal[] vertexNormals;
    private byte[] field_J;
    byte[] field_w;
    short[] faceTextureIds;
    byte[] faceAlpha;
    VertexNormal[] field_g;
    int[][] faceGroups;
    int vertexCount;
    int[] faceVertexC;
    private int[] vertexSkinIds;
    int[] verticesY;

    private final void decodeLegacyFormat(byte[] encodedMesh) {
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
        var4 = new PacketBuffer(encodedMesh);
        var5 = new PacketBuffer(encodedMesh);
        var6 = new PacketBuffer(encodedMesh);
        var7 = new PacketBuffer(encodedMesh);
        var8 = new PacketBuffer(encodedMesh);
        var4.position = encodedMesh.length - 18;
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
        this.vertexCount = var9;
        this.faceCount = var10;
        this.field_E = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.faceVertexA = new int[var10];
        this.faceVertexB = new int[var10];
        this.faceVertexC = new int[var10];
        if (var11 > 0) {
          this.field_t = new byte[var11];
          this.field_M = new short[var11];
          this.field_n = new short[var11];
          this.field_C = new short[var11];
        }
        if (var16 == 1) {
          this.vertexSkinIds = new int[var9];
        }
        if (var12 == 1) {
          this.faceRenderTypes = new byte[var10];
          this.field_G = new byte[var10];
          this.faceTextureIds = new short[var10];
        }
        if (var13 == 255) {
          this.field_w = new byte[var10];
        }
        if (var14 == 1) {
          this.faceAlpha = new byte[var10];
        }
        if (var15 == 1) {
          this.faceSkinIds = new int[var10];
        }
        this.faceColors = new short[var10];
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
            var40 = var5.readSignedSmart(78);
          }
          var41 = 0;
          if ((var39 & 2) != 0) {
            var41 = var6.readSignedSmart(58);
          }
          var42 = 0;
          if ((var39 & 4) != 0) {
            var42 = var7.readSignedSmart(64);
          }
          this.verticesX[var38] = var35 + var40;
          this.verticesY[var38] = var36 + var41;
          this.verticesZ[var38] = var37 + var42;
          var35 = this.verticesX[var38];
          var36 = this.verticesY[var38];
          var37 = this.verticesZ[var38];
          if (var16 == 1) {
            this.vertexSkinIds[var38] = var8.readUnsignedByte(0);
          }
        }
        var4.position = var30;
        var5.position = var26;
        var6.position = var24;
        var7.position = var28;
        var8.position = var25;
        for (var38Lifetime1 = 0; var38Lifetime1 < var10; var38Lifetime1++) {
          this.faceColors[var38Lifetime1] = (short)var4.readUnsignedShort((byte) -104);
          if (var12 == 1) {
            var39Lifetime1 = var5.readUnsignedByte(0);
            if ((var39Lifetime1 & 1) != 1) {
              this.faceRenderTypes[var38Lifetime1] = (byte) 0;
            } else {
              this.faceRenderTypes[var38Lifetime1] = (byte) 1;
              var2 = 1;
            }
            if ((var39Lifetime1 & 2) != 2) {
              this.field_G[var38Lifetime1] = (byte)-1;
              this.faceTextureIds[var38Lifetime1] = (short)-1;
            } else {
              this.field_G[var38Lifetime1] = (byte)(var39Lifetime1 >> 2);
              this.faceTextureIds[var38Lifetime1] = this.faceColors[var38Lifetime1];
              this.faceColors[var38Lifetime1] = (short)127;
              if (this.faceTextureIds[var38Lifetime1] != -1) {
                var3 = 1;
              }
            }
          }
          if (var13 == 255) {
            this.field_w[var38Lifetime1] = var6.readByte((byte) -124);
          }
          if (var14 == 1) {
            this.faceAlpha[var38Lifetime1] = var7.readByte((byte) 126);
          }
          if (var15 == 1) {
            this.faceSkinIds[var38Lifetime1] = var8.readUnsignedByte(0);
          }
        }
        this.referencedVertexCapacity = -1;
        var4.position = var29;
        var5.position = var23;
        var38Lifetime2 = 0;
        var39Lifetime2 = 0;
        var40Lifetime1 = 0;
        var41Lifetime1 = 0;
        for (var42Lifetime1 = 0; var42Lifetime1 < var10; var42Lifetime1++) {
          var43 = var5.readUnsignedByte(0);
          if (var43 == 1) {
            var38Lifetime2 = var4.readSignedSmart(115) + var41Lifetime1;
            var41Lifetime1 = var38Lifetime2;
            var39Lifetime2 = var4.readSignedSmart(76) + var41Lifetime1;
            var41Lifetime1 = var39Lifetime2;
            var40Lifetime1 = var4.readSignedSmart(53) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.faceVertexA[var42Lifetime1] = var38Lifetime2;
            this.faceVertexB[var42Lifetime1] = var39Lifetime2;
            this.faceVertexC[var42Lifetime1] = var40Lifetime1;
            if (var38Lifetime2 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var38Lifetime2;
            }
            if (var39Lifetime2 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var39Lifetime2;
            }
            if (var40Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var40Lifetime1;
            }
          }
          if (var43 == 2) {
            var39Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.readSignedSmart(67) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.faceVertexA[var42Lifetime1] = var38Lifetime2;
            this.faceVertexB[var42Lifetime1] = var39Lifetime2;
            this.faceVertexC[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var40Lifetime1;
            }
          }
          if (var43 == 3) {
            var38Lifetime2 = var40Lifetime1;
            var40Lifetime1 = var4.readSignedSmart(106) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.faceVertexA[var42Lifetime1] = var38Lifetime2;
            this.faceVertexB[var42Lifetime1] = var39Lifetime2;
            this.faceVertexC[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var40Lifetime1;
            }
          }
          if (var43 == 4) {
            var44 = var38Lifetime2;
            var38Lifetime2 = var39Lifetime2;
            var39Lifetime2 = var44;
            var40Lifetime1 = var4.readSignedSmart(109) + var41Lifetime1;
            var41Lifetime1 = var40Lifetime1;
            this.faceVertexA[var42Lifetime1] = var38Lifetime2;
            this.faceVertexB[var42Lifetime1] = var39Lifetime2;
            this.faceVertexC[var42Lifetime1] = var40Lifetime1;
            if (var40Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var40Lifetime1;
            }
          }
        }
        this.referencedVertexCapacity = this.referencedVertexCapacity + 1;
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
              if ((this.field_M[var44Lifetime1] & 65535) == this.faceVertexA[var45] &&
                (this.field_n[var44Lifetime1] & 65535) == this.faceVertexB[var45] &&
                (this.field_C[var44Lifetime1] & 65535) == this.faceVertexC[var45]) {
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
          this.faceTextureIds = null;
        }
        if (var2 == 0) {
          this.faceRenderTypes = null;
        }
    }

    private final void decodeExtendedFormat(byte[] encodedMesh) {
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
        var2 = new PacketBuffer(encodedMesh);
        var3 = new PacketBuffer(encodedMesh);
        var4 = new PacketBuffer(encodedMesh);
        var5 = new PacketBuffer(encodedMesh);
        var6 = new PacketBuffer(encodedMesh);
        var7 = new PacketBuffer(encodedMesh);
        var8 = new PacketBuffer(encodedMesh);
        var2.position = encodedMesh.length - 23;
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
        this.vertexCount = var9;
        this.faceCount = var10;
        this.field_E = var11;
        this.verticesX = new int[var9];
        this.verticesY = new int[var9];
        this.verticesZ = new int[var9];
        this.faceVertexA = new int[var10];
        this.faceVertexB = new int[var10];
        this.faceVertexC = new int[var10];
        if (var19 == 1) {
          this.vertexSkinIds = new int[var9];
        }
        if (var13 != 0) {
          this.faceRenderTypes = new byte[var10];
        }
        if (var15 == 255) {
          this.field_w = new byte[var10];
        }
        if (var16 == 1) {
          this.faceAlpha = new byte[var10];
        }
        if (var17 == 1) {
          this.faceSkinIds = new int[var10];
        }
        if (var18 == 1) {
          this.faceTextureIds = new short[var10];
        }
        if (var18 == 1 &&
          var11 > 0) {
          this.field_G = new byte[var10];
        }
        this.faceColors = new short[var10];
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
            var55 = var3.readSignedSmart(67);
          }
          var56 = 0;
          if ((var54 & 2) != 0) {
            var56 = var4.readSignedSmart(114);
          }
          var57 = 0;
          if ((var54 & 4) != 0) {
            var57 = var5.readSignedSmart(96);
          }
          this.verticesX[var53] = var50 + var55;
          this.verticesY[var53] = var51 + var56;
          this.verticesZ[var53] = var52 + var57;
          var50 = this.verticesX[var53];
          var51 = this.verticesY[var53];
          var52 = this.verticesZ[var53];
          if (var19 == 1) {
            this.vertexSkinIds[var53] = var6.readUnsignedByte(0);
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
          this.faceColors[var53Lifetime1] = (short)var2.readUnsignedShort((byte) -104);
          if (var13 != 0) {
            this.faceRenderTypes[var53Lifetime1] = var3.readByte((byte) 8);
          }
          if (var15 == 255) {
            this.field_w[var53Lifetime1] = var4.readByte((byte) -101);
          }
          if (var16 == 1) {
            this.faceAlpha[var53Lifetime1] = var5.readByte((byte) 105);
          }
          if (var17 == 1) {
            this.faceSkinIds[var53Lifetime1] = var6.readUnsignedByte(0);
          }
          if (var18 == 1) {
            this.faceTextureIds[var53Lifetime1] = (short)(var7.readUnsignedShort((byte) -104) - 1);
          }
          if (this.field_G != null) {
            if (this.faceTextureIds[var53Lifetime1] == -1) {
              this.field_G[var53Lifetime1] = (byte)-1;
            } else {
              this.field_G[var53Lifetime1] = (byte)(var8.readUnsignedByte(0) - 1);
            }
          }
        }
        this.referencedVertexCapacity = -1;
        var2.position = var36;
        var3.position = var31;
        var53Lifetime2 = 0;
        var54Lifetime1 = 0;
        var55Lifetime1 = 0;
        var56Lifetime1 = 0;
        for (var57Lifetime1 = 0; var57Lifetime1 < var10; var57Lifetime1++) {
          var58 = var3.readUnsignedByte(0);
          if (var58 == 1) {
            var53Lifetime2 = var2.readSignedSmart(51) + var56Lifetime1;
            var56Lifetime1 = var53Lifetime2;
            var54Lifetime1 = var2.readSignedSmart(80) + var56Lifetime1;
            var56Lifetime1 = var54Lifetime1;
            var55Lifetime1 = var2.readSignedSmart(62) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.faceVertexA[var57Lifetime1] = var53Lifetime2;
            this.faceVertexB[var57Lifetime1] = var54Lifetime1;
            this.faceVertexC[var57Lifetime1] = var55Lifetime1;
            if (var53Lifetime2 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var53Lifetime2;
            }
            if (var54Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var54Lifetime1;
            }
            if (var55Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var55Lifetime1;
            }
          }
          if (var58 == 2) {
            var54Lifetime1 = var55Lifetime1;
            var55Lifetime1 = var2.readSignedSmart(99) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.faceVertexA[var57Lifetime1] = var53Lifetime2;
            this.faceVertexB[var57Lifetime1] = var54Lifetime1;
            this.faceVertexC[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var55Lifetime1;
            }
          }
          if (var58 == 3) {
            var53Lifetime2 = var55Lifetime1;
            var55Lifetime1 = var2.readSignedSmart(119) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.faceVertexA[var57Lifetime1] = var53Lifetime2;
            this.faceVertexB[var57Lifetime1] = var54Lifetime1;
            this.faceVertexC[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var55Lifetime1;
            }
          }
          if (var58 == 4) {
            var59 = var53Lifetime2;
            var53Lifetime2 = var54Lifetime1;
            var54Lifetime1 = var59;
            var55Lifetime1 = var2.readSignedSmart(118) + var56Lifetime1;
            var56Lifetime1 = var55Lifetime1;
            this.faceVertexA[var57Lifetime1] = var53Lifetime2;
            this.faceVertexB[var57Lifetime1] = var54Lifetime1;
            this.faceVertexC[var57Lifetime1] = var55Lifetime1;
            if (var55Lifetime1 > this.referencedVertexCapacity) {
              this.referencedVertexCapacity = var55Lifetime1;
            }
          }
        }
        this.referencedVertexCapacity = this.referencedVertexCapacity + 1;
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

    final void calculateNormals() {
        FaceNormal dupTemp$0 = null;
        int vertexIndex;
        int vertexA;
        int vertexB;
        int vertexC;
        int edgeABX;
        int edgeABY;
        int edgeABZ;
        int edgeACX;
        int edgeACY;
        int edgeACZ;
        int normalX;
        int normalY;
        int normalZ;
        int normalMagnitude;
        int renderType;
        FaceNormal faceNormal;
        VertexNormal normalA;
        VertexNormal normalB;
        VertexNormal normalC;
        int faceIndex;
        if (this.vertexNormals != null) {
          return;
        }
        this.vertexNormals = new VertexNormal[this.referencedVertexCapacity];
        for (vertexIndex = 0; vertexIndex < this.referencedVertexCapacity; vertexIndex++) {
          this.vertexNormals[vertexIndex] = new VertexNormal();
        }
        faceIndex = 0;
        while (true) {
          if (faceIndex >= this.faceCount) {
            return;
          }
          vertexA = this.faceVertexA[faceIndex];
          vertexB = this.faceVertexB[faceIndex];
          vertexC = this.faceVertexC[faceIndex];
          edgeABX = this.verticesX[vertexB] - this.verticesX[vertexA];
          edgeABY = this.verticesY[vertexB] - this.verticesY[vertexA];
          edgeABZ = this.verticesZ[vertexB] - this.verticesZ[vertexA];
          edgeACX = this.verticesX[vertexC] - this.verticesX[vertexA];
          edgeACY = this.verticesY[vertexC] - this.verticesY[vertexA];
          edgeACZ = this.verticesZ[vertexC] - this.verticesZ[vertexA];
          normalX = edgeABY * edgeACZ - edgeACY * edgeABZ;
          normalY = edgeABZ * edgeACX - edgeACZ * edgeABX;
          normalZ = edgeABX * edgeACY - edgeACX * edgeABY;
          while (true) {
            if (normalX <= 8192 &&
              normalY <= 8192 &&
              normalZ <= 8192 &&
              normalX >= -8192 &&
              normalY >= -8192 &&
              normalZ >= -8192) {
              normalMagnitude = (int)Math.sqrt((double)(normalX * normalX + normalY * normalY + normalZ * normalZ));
              if (normalMagnitude <= 0) {
                normalMagnitude = 1;
              }
              normalX = normalX * 256 / normalMagnitude;
              normalY = normalY * 256 / normalMagnitude;
              normalZ = normalZ * 256 / normalMagnitude;
              if (this.faceRenderTypes != null) {
                renderType = this.faceRenderTypes[faceIndex];
              } else {
                renderType = 0;
              }
              if (renderType != 0) {
                if (renderType == 1) {
                  if (this.faceNormals == null) {
                    this.faceNormals = new FaceNormal[this.faceCount];
                  }
                  dupTemp$0 = new FaceNormal();
                  this.faceNormals[faceIndex] = dupTemp$0;
                  faceNormal = dupTemp$0;
                  faceNormal.x = normalX;
                  faceNormal.y = normalY;
                  faceNormal.z = normalZ;
                }
              } else {
                normalA = this.vertexNormals[vertexA];
                normalA.x = normalA.x + normalX;
                normalA.y = normalA.y + normalY;
                normalA.z = normalA.z + normalZ;
                normalA.contributions = normalA.contributions + 1;
                normalB = this.vertexNormals[vertexB];
                normalB.x = normalB.x + normalX;
                normalB.y = normalB.y + normalY;
                normalB.z = normalB.z + normalZ;
                normalB.contributions = normalB.contributions + 1;
                normalC = this.vertexNormals[vertexC];
                normalC.x = normalC.x + normalX;
                normalC.y = normalC.y + normalY;
                normalC.z = normalC.z + normalZ;
                normalC.contributions = normalC.contributions + 1;
              }
              faceIndex++;
              break;
            }
            normalX = normalX >> 1;
            normalY = normalY >> 1;
            normalZ = normalZ >> 1;
          }
        }
    }

    final static MeshData load(ResourceArchive archive, String groupName, String fileName) {
        byte[] var3 = archive.getFileByName(fileName, 93, groupName);
        if (var3 == null) {
          return null;
        }
        return new MeshData(var3);
    }

    final ModelMeshBase createModel(int ambient, int contrast, int lightX, int lightY, int lightZ) {
        return (ModelMeshBase) ((Object) new ModelMesh(this, ambient, contrast, lightX, lightY, lightZ));
    }

    final void buildSkinGroups() {
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int[] array$5 = null;
        int dupTemp$3 = 0;
        int[] arrayValue$4 = null;
        int maximumVertexSkin;
        int vertexIndex;
        int vertexSkinId;
        int[] vertexCountsBySkin;
        int[] faceCountsBySkin;
        int faceSkinId;
        int groupedVertexSkinId;
        int groupedFaceSkinId;
        int maximumFaceSkin;
        int faceIndex;
        if (this.vertexSkinIds != null) {
          vertexCountsBySkin = new int[256];
          maximumVertexSkin = 0;
          for (vertexIndex = 0; vertexIndex < this.vertexCount; vertexIndex++) {
            vertexSkinId = this.vertexSkinIds[vertexIndex];
            vertexCountsBySkin[vertexSkinId] = vertexCountsBySkin[vertexSkinId] + 1;
            if (vertexSkinId > maximumVertexSkin) {
              maximumVertexSkin = vertexSkinId;
            }
          }
          this.vertexGroups = new int[maximumVertexSkin + 1][];
          for (vertexIndex = 0; vertexIndex <= maximumVertexSkin; vertexIndex++) {
            array$2 = new int[vertexCountsBySkin[vertexIndex]];
            this.vertexGroups[vertexIndex] = array$2;
            vertexCountsBySkin[vertexIndex] = 0;
          }
          for (vertexIndex = 0; vertexIndex < this.vertexCount; vertexIndex++) {
            groupedVertexSkinId = this.vertexSkinIds[vertexIndex];
            dupTemp$0 = vertexCountsBySkin[groupedVertexSkinId];
            arrayValue$1 = this.vertexGroups[groupedVertexSkinId];
            vertexCountsBySkin[groupedVertexSkinId] = dupTemp$0 + 1;
            arrayValue$1[dupTemp$0] = vertexIndex;
          }
          this.vertexSkinIds = null;
        }
        if (this.faceSkinIds != null) {
          faceCountsBySkin = new int[256];
          maximumFaceSkin = 0;
          for (faceIndex = 0; faceIndex < this.faceCount; faceIndex++) {
            faceSkinId = this.faceSkinIds[faceIndex];
            faceCountsBySkin[faceSkinId] = faceCountsBySkin[faceSkinId] + 1;
            if (faceSkinId > maximumFaceSkin) {
              maximumFaceSkin = faceSkinId;
            }
          }
          this.faceGroups = new int[maximumFaceSkin + 1][];
          for (faceIndex = 0; faceIndex <= maximumFaceSkin; faceIndex++) {
            array$5 = new int[faceCountsBySkin[faceIndex]];
            this.faceGroups[faceIndex] = array$5;
            faceCountsBySkin[faceIndex] = 0;
          }
          for (faceIndex = 0; faceIndex < this.faceCount; faceIndex++) {
            groupedFaceSkinId = this.faceSkinIds[faceIndex];
            dupTemp$3 = faceCountsBySkin[groupedFaceSkinId];
            arrayValue$4 = this.faceGroups[groupedFaceSkinId];
            faceCountsBySkin[groupedFaceSkinId] = dupTemp$3 + 1;
            arrayValue$4[dupTemp$3] = faceIndex;
          }
          this.faceSkinIds = null;
        }
    }

    private MeshData(byte[] encodedMesh) {
        this.referencedVertexCapacity = 0;
        this.faceCount = 0;
        this.vertexCount = 0;
        if (encodedMesh[encodedMesh.length - 1] == -1 &&
          encodedMesh[encodedMesh.length - 2] == -1) {
          this.decodeExtendedFormat(encodedMesh);
        } else {
          this.decodeLegacyFormat(encodedMesh);
        }
    }

    MeshData(MeshData source, boolean shareVertices, boolean shareFaceColors, boolean shareTextureIds, boolean shareFaceAlpha) {
        int var6;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        this.referencedVertexCapacity = 0;
        this.faceCount = 0;
        this.vertexCount = 0;
        this.vertexCount = source.vertexCount;
        this.referencedVertexCapacity = source.referencedVertexCapacity;
        this.faceCount = source.faceCount;
        this.field_E = source.field_E;
        if (!shareVertices) {
          this.verticesX = new int[this.vertexCount];
          this.verticesY = new int[this.vertexCount];
          this.verticesZ = new int[this.vertexCount];
          for (var6 = 0; var6 < this.vertexCount; var6++) {
            this.verticesX[var6] = source.verticesX[var6];
            this.verticesY[var6] = source.verticesY[var6];
            this.verticesZ[var6] = source.verticesZ[var6];
          }
        } else {
          this.verticesX = source.verticesX;
          this.verticesY = source.verticesY;
          this.verticesZ = source.verticesZ;
        }
        if (!shareFaceColors) {
          this.faceColors = new short[this.faceCount];
          for (var6Lifetime1 = 0; var6Lifetime1 < this.faceCount; var6Lifetime1++) {
            this.faceColors[var6Lifetime1] = source.faceColors[var6Lifetime1];
          }
        } else {
          this.faceColors = source.faceColors;
        }
        if (!shareTextureIds &&
          source.faceTextureIds != null) {
          this.faceTextureIds = new short[this.faceCount];
          for (var6Lifetime2 = 0; var6Lifetime2 < this.faceCount; var6Lifetime2++) {
            this.faceTextureIds[var6Lifetime2] = source.faceTextureIds[var6Lifetime2];
          }
        } else {
          this.faceTextureIds = source.faceTextureIds;
        }
        if (!shareFaceAlpha) {
          this.faceAlpha = new byte[this.faceCount];
          if (source.faceAlpha != null) {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.faceCount; var6Lifetime3++) {
              this.faceAlpha[var6Lifetime3] = source.faceAlpha[var6Lifetime3];
            }
          } else {
            for (var6Lifetime3 = 0; var6Lifetime3 < this.faceCount; var6Lifetime3++) {
              this.faceAlpha[var6Lifetime3] = (byte) 0;
            }
          }
        } else {
          this.faceAlpha = source.faceAlpha;
        }
        this.faceVertexA = source.faceVertexA;
        this.faceVertexB = source.faceVertexB;
        this.faceVertexC = source.faceVertexC;
        this.faceRenderTypes = source.faceRenderTypes;
        this.field_w = source.field_w;
        this.field_G = source.field_G;
        this.field_t = source.field_t;
        this.field_M = source.field_M;
        this.field_n = source.field_n;
        this.field_C = source.field_C;
        this.field_K = source.field_K;
        this.field_s = source.field_s;
        this.field_k = source.field_k;
        this.field_J = source.field_J;
        this.field_f = source.field_f;
        this.field_I = source.field_I;
        this.field_F = source.field_F;
        this.field_z = source.field_z;
        this.vertexSkinIds = source.vertexSkinIds;
        this.faceSkinIds = source.faceSkinIds;
        this.vertexGroups = source.vertexGroups;
        this.faceGroups = source.faceGroups;
        this.vertexNormals = source.vertexNormals;
        this.faceNormals = source.faceNormals;
        this.field_g = source.field_g;
    }
}
