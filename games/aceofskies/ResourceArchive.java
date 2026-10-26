/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ResourceArchive {
    private ArchiveIndex index;
    private Object[][] unpackedFiles;
    private Object[] packedGroups;
    static nf field_g;
    private ArchiveProvider provider;
    private int fileRetentionMode;
    private boolean discardPackedGroups;
    static String field_c;

    final synchronized boolean c(int param0, int param1) {
        if (!this.a(param0, (byte) 42)) {
          return false;
        }
        if (this.packedGroups[param0] != null) {
          return true;
        }
        this.a(param0, true);
        if (param1 != 0) {
          return false;
        }
        if (null != this.packedGroups[param0]) {
          return true;
        }
        return false;
    }

    private final synchronized boolean a(int param0, byte param1) {
        if (!this.b((byte) 118)) {
          return false;
        }
        if (param0 >= 0 &&
          param0 < this.index.field_j.length &&
          this.index.field_j[param0] != 0) {
          if (param1 == 42) {
            return true;
          }
          return false;
        }
        if (ClientException.field_e) {
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final boolean a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -99)) {
            return false;
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.index.field_b.a(false, bg.a(var6, (byte) 120));
          if (param1 >= -76) {
            this.b(((int[]) (this.packedGroups[0]))[0], -77);
          }
          if (var4_int < 0) {
            return false;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.index.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
          if (0 <= var5) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("gk.O(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.b((byte) 108)) {
          return false;
        }
        if (param1 <= 73) {
          this.provider = (ArchiveProvider) null;
        }
        if (param0 < 0 ||
          param2 < 0 ||
          this.index.field_j.length <= param0 ||
          param2 >= this.index.field_j[param0]) {
          if (!ClientException.field_e) {
            return false;
          }
          throw new IllegalArgumentException(param0 + " " + param2);
        }
        return true;
    }

    final synchronized boolean b(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!this.b((byte) -71)) {
          return false;
        }
        var2 = 1;
        for (var3 = param0; this.index.field_o.length > var3; var3++) {
          var4 = this.index.field_o[var3];
          if (null == this.packedGroups[var4]) {
            this.a(var4, true);
            if (this.packedGroups[var4] == null) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -79) {
            ResourceArchive.c(((byte[]) (this.packedGroups[17]))[0]);
          }
          if (!this.b((byte) 102)) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.index.field_b.a(false, bg.a(var4, (byte) 120));
          stackIn_7_0 = this.a(var3_int, 100);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("gk.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized int a(int param0, int param1) {
        if (param1 != 100) {
          return -113;
        }
        if (!this.a(param0, (byte) 42)) {
          return 0;
        }
        if (this.packedGroups[param0] != null) {
          return 100;
        }
        return this.provider.b(1, param0);
    }

    final synchronized byte[] a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -94)) {
            return null;
          }
          param0 = param0.toLowerCase();
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param0);
          var4_int = this.index.field_b.a(false, bg.a(var6, (byte) 120));
          if (!this.a(var4_int, (byte) 42)) {
            return null;
          }
          if (param1 != -71) {
            stackIn_8_0 = (byte[]) null;
            return stackIn_8_0;
          }
          var7 = (CharSequence) ((Object) param2);
          var5 = this.index.field_r[var4_int].a(false, bg.a(var7, (byte) 120));
          stackIn_10_0 = this.a(var4_int, param1 - 10399, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("gk.S(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int b(int param0, int param1) {
        if (!this.a(param0, (byte) 42)) {
          return 0;
        }
        if (param1 != 27912) {
          this.unpackedFiles = (Object[][]) (((Object[]) (this.packedGroups[4]))[2]);
        }
        return this.index.field_j[param0];
    }

    final int a(byte param0) {
        if (!this.b((byte) -25)) {
          return -1;
        }
        if (param0 < 56) {
          this.a(((byte[]) (this.packedGroups[0]))[2]);
        }
        return this.index.field_j.length;
    }

    public static void c(byte param0) {
        field_c = null;
        if (param0 != -73) {
          field_g = (nf) null;
        }
        field_g = null;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object stackIn_28_0 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (!this.b(param2, 100, param1)) {
            return null;
          }
          var5 = null;
          if (param3 > -44) {
            this.b(8, 111);
          }
          if ((null == this.unpackedFiles[param2] ||
            this.unpackedFiles[param2][param1] == null) &&
            !this.a(param1, param0, param2, (byte) 40)) {
            this.a(param2, true);
            if (!this.a(param1, param0, param2, (byte) 65)) {
              return null;
            }
          }
          if (null == this.unpackedFiles[param2]) {
            throw new RuntimeException("");
          }
          if (null != this.unpackedFiles[param2][param1]) {
            var7 = PacketBuffer.a(false, this.unpackedFiles[param2][param1], -45);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (this.fileRetentionMode == 1) {
              this.unpackedFiles[param2][param1] = null;
              if (this.index.field_j[param2] == 1) {
                this.unpackedFiles[param2] = null;
              }
            } else {
              if (this.fileRetentionMode == 2) {
                this.unpackedFiles[param2] = null;
              }
            }
          }
          stackIn_28_0 = var5;
          return (byte[]) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("gk.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw pn.a((Throwable) (stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        if (param1 <= 29) {
          this.d(-108, ((int[]) (((Object[]) (((Object[]) (this.packedGroups[22]))[3]))[0]))[3]);
        }
        if (!this.b(param2, 113, param0)) {
          return false;
        }
        if (this.unpackedFiles[param2] != null &&
          this.unpackedFiles[param2][param0] != null) {
          return true;
        }
        if (null != this.packedGroups[param2]) {
          return true;
        }
        this.a(param2, true);
        if (null == this.packedGroups[param2]) {
          return false;
        }
        return true;
    }

    private final synchronized void a(int param0, boolean param1) {
        byte[] discarded$0 = null;
        if (this.discardPackedGroups) {
          this.packedGroups[param0] = this.provider.a(param0, 2);
        } else {
          this.packedGroups[param0] = sf.a(false, -137, this.provider.a(param0, 2));
        }
        if (!param1) {
          int[] var4 = (int[]) null;
          discarded$0 = this.a((int[]) null, -97, -90, -106);
        }
    }

    final synchronized boolean b(byte param0) {
        if (this.index == null) {
          this.index = this.provider.a(true);
          if (null == this.index) {
            return false;
          }
          this.packedGroups = new Object[this.index.field_l];
          this.unpackedFiles = new Object[this.index.field_l][];
        }
        int var2 = -122 % ((param0 - 37) / 44);
        return true;
    }

    final synchronized int a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!this.b((byte) -37)) {
          return 0;
        }
        var2 = -90 / ((24 - param0) / 63);
        var3 = 0;
        var4 = 0;
        for (var5 = 0; var5 < this.packedGroups.length; var5++) {
          if (this.index.field_k[var5] > 0) {
            var4 = var4 + this.a(var5, 100);
            var3 += 100;
          }
        }
        if (var3 == 0) {
          return 100;
        }
        var5Lifetime1 = var4 * 100 / var3;
        return var5Lifetime1;
    }

    final int b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -42)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.index.field_b.a(false, bg.a(var4, (byte) 120));
          if (param1 != 0) {
            stackIn_6_0 = ((int[]) (this.packedGroups[5]))[9];
            return stackIn_6_0;
          }
          if (this.a(var3_int, (byte) 42)) {
            return var3_int;
          }
          stackIn_10_0 = -1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("gk.AA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) -81)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var3_int = 68 / ((param1 - 64) / 52);
          var5 = (CharSequence) ((Object) param0);
          var4 = this.index.field_b.a(false, bg.a(var5, (byte) 120));
          if (var4 >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("gk.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        boolean stackIn_39_2 = false;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        String stackIn_109_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        PacketBuffer var26 = null;
        byte[] var27 = null;
        PacketBuffer var29 = null;
        PacketBuffer var31 = null;
        int[] var32 = null;
        byte[][] var33 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var39 = null;
        byte[][] var40 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14_intLifetime1;
        var22 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!this.a(param2, (byte) 42)) {
            return false;
          }
          if (this.packedGroups[param2] == null) {
            return false;
          }
          var5_int = this.index.field_k[param2];
          var34 = this.index.field_q[param2];
          var24 = var34;
          var6 = var24;
          if (null == this.unpackedFiles[param2]) {
            array$0 = new Object[this.index.field_j[param2]];
            this.unpackedFiles[param2] = array$0;
          }
          var7 = this.unpackedFiles[param2];
          var8 = 1;
          for (var9_int = 0; var5_int > var9_int; var9_int++) {
            if (var6 != null) {
              var10 = var34[var9_int];
            } else {
              var10 = var9_int;
            }
            if (null != var7[var10]) {
              continue;
            }
            var8 = 0;
            break;
          }
          if (var8 != 0) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param1 != null && (param1[0] != 0 ||
            param1[1] != 0 ||
            0 != param1[2] ||
            0 != param1[3])) {
            var35 = PacketBuffer.a(true, this.packedGroups[param2], -62);
            var25 = var35;
            var9 = var25;
            var26 = new PacketBuffer(var35);
            var26.a(5, param1, 1515088773, var26.payload.length);
            decompiledFrameRemainder0 = false;
          }
          else {
            var9 = PacketBuffer.a(false, this.packedGroups[param2], -84);
          }
          if (param3 <= 3) {
            return true;
          }
          try {
            var36 = pn.a(var9, 0);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_38_0 = var11_ref_RuntimeException;
            stackIn_38_1 = new StringBuilder();
            stackIn_39_2 = (param1 != null);
            throw pn.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(" ").append(param2).append(" ").append(var9.length).append(" ").append(lj.a(-124, var9, var9.length)).append(" ").append(lj.a(-118, var9, var9.length - 2)).append(" ").append(this.index.field_g[param2]).append(" ").append(this.index.field_t).toString());
          }
          if (this.discardPackedGroups) {
            this.packedGroups[param2] = null;
          }
          if (var5_int > 1) {
            if (this.fileRetentionMode == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var12 * (var5_int * 4);
              var29 = new PacketBuffer(var43);
              var14_int = 0;
              var15_int = 0;
              var29.position = var11;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var29.readInt((byte) 115);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param0 == var19) {
                    var14_int = var14_int + var17;
                    var15_int = var19;
                  }
                }
              }
              if (var14_int == 0) {
                return true;
              }
              var44 = new byte[var14_int];
              var29.position = var11;
              var14_intLifetime1 = 0;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var20 < var5_int; var20++) {
                  var19 = var19 + var29.readInt((byte) 118);
                  if (var6 == null) {
                    var21 = var20;
                  } else {
                    var21 = var34[var20];
                  }
                  if (var21 == param0) {
                    au.a(var43, var17, var44, var14_intLifetime1, var19);
                    var14_intLifetime1 = var14_intLifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15_int] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * var12 * 4;
              var31 = new PacketBuffer(var43);
              var39 = new int[var5_int];
              var32 = var39;
              var14 = var32;
              var31.position = var11;
              for (var15_int = 0; var12 > var15_int; var15_int++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var31.readInt((byte) 122);
                  var14[var17] = var14[var17] + var16;
                }
              }
              var40 = new byte[var5_int][];
              var33 = var40;
              var15 = var33;
              for (var16 = 0; var5_int > var16; var16++) {
                array$1 = new byte[var39[var16]];
                var15[var16] = array$1;
                var39[var16] = 0;
              }
              var31.position = var11;
              var16 = 0;
              for (var17 = 0; var12 > var17; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var31.readInt((byte) 109);
                  au.a(var43, var16, var40[var19], var39[var19], var18);
                  var16 = var16 + var18;
                  var14[var19] = var14[var19] + var18;
                }
              }
              for (var17 = 0; var5_int > var17; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (this.fileRetentionMode == 0) {
                  var7[var18] = sf.a(false, -137, var40[var17]);
                } else {
                  var7[var18] = var40[var17];
                }
              }
            }
          } else {
            if (var6 != null) {
              var11 = var34[0];
            } else {
              var11 = 0;
            }
            if (this.fileRetentionMode == 0) {
              var7[var11] = sf.a(false, -137, var36);
              return true;
            }
            var7[var11] = var43;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_108_0 = var5;
          stackIn_108_1 = new StringBuilder().append("gk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_109_2 = "null";
          } else {
            stackIn_109_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_108_0), ((StringBuilder) (Object) stackIn_108_1).append(stackIn_109_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final synchronized byte[] d(int param0, int param1) {
        if (!this.b((byte) 100)) {
          return null;
        }
        if (1 == this.index.field_j.length) {
          return this.a(0, -10470, param0);
        }
        if (!this.a(param0, (byte) 42)) {
          return null;
        }
        if (param1 == ~this.index.field_j[param0]) {
          return this.a(param0, param1 ^ 10468, 0);
        }
        throw new RuntimeException();
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 114)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.index.field_b.a(false, bg.a(var6, (byte) 120));
          if (!this.a(var4_int, (byte) 42)) {
            return false;
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.index.field_r[var4_int].a(param1, bg.a(var7, (byte) 120));
          stackIn_7_0 = this.a(var5, (byte) 40, var4_int);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gk.U(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -10470) {
          return (byte[]) null;
        }
        return this.a((int[]) null, param2, param0, -53);
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(param1, (byte) 42)) {
            stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (param0 >= -26) {
            ((int[]) (this.packedGroups[2]))[0] = -26;
          }
          param2 = param2.toLowerCase();
          var5 = (CharSequence) ((Object) param2);
          var4_int = this.index.field_r[param1].a(false, bg.a(var5, (byte) 120));
          if (this.b(param1, 91, var4_int)) {
            return var4_int;
          }
          stackIn_9_0 = -1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("gk.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    ResourceArchive(ArchiveProvider param0, boolean param1, int param2) {
        this.index = null;
        try {
          if (0 > param2 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.provider = param0;
          this.discardPackedGroups = param1 ? true : false;
          this.fileRetentionMode = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "gk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b((byte) 106)) {
            return false;
          }
          param0 = param0.toLowerCase();
          if (param1 != -14012) {
            return false;
          }
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.index.field_b.a(false, bg.a(var4, (byte) 120));
          stackIn_8_0 = this.c(var3_int, 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gk.H(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = new nf();
        field_c = "Loading sound effects";
    }
}
