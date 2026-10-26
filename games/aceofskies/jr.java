/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr extends wt {
    static String field_p;
    private int[][] field_s;
    static boolean field_u;
    private String[] field_q;
    static int[] field_n;
    private int[] field_o;
    static String field_r;
    int[] field_t;

    public static void a(boolean param0) {
        field_r = null;
        if (param0) {
          return;
        }
        field_n = null;
        field_p = null;
    }

    final static boolean a(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 32) {
          jr.a((byte) 88);
        }
        stackIn_6_0 = (SoundCache.field_d >= 10) && (13 <= bl.field_c);
        return stackIn_6_0;
    }

    final static void a(byte[] param0, int param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        byte[] var16 = null;
        PacketBuffer var17 = null;
        PacketBuffer var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        var15 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var17 = new PacketBuffer(param0);
          var18 = var17;
          var18.position = param0.length - 2;
          to.field_t = var18.readUnsignedShort((byte) 0);
          ji.field_b = new int[to.field_t];
          lh.field_a = new int[to.field_t];
          q.field_k = new boolean[to.field_t];
          lg.field_j = new int[to.field_t];
          ql.field_p = new byte[to.field_t][];
          fk.field_a = new byte[to.field_t][];
          ee.field_e = new int[to.field_t];
          var18.position = -(to.field_t * 8) + (-7 + param0.length);
          pu.field_a = var18.readUnsignedShort((byte) 0);
          cc.field_i = var18.readUnsignedShort((byte) 0);
          var3 = (var18.readUnsignedByte(param1 ^ 7055) & 255) + 1;
          for (var4 = 0; to.field_t > var4; var4++) {
            lh.field_a[var4] = var17.readUnsignedShort((byte) 0);
          }
          for (var4Lifetime1 = 0; var4Lifetime1 < to.field_t; var4Lifetime1++) {
            lg.field_j[var4Lifetime1] = var18.readUnsignedShort((byte) 0);
          }
          if (param1 != 7148) {
            var16 = (byte[]) null;
            jr.a((byte[]) null, -128);
          }
          for (var4Lifetime2 = 0; to.field_t > var4Lifetime2; var4Lifetime2++) {
            ji.field_b[var4Lifetime2] = var18.readUnsignedShort((byte) 0);
          }
          for (var4Lifetime3 = 0; var4Lifetime3 < to.field_t; var4Lifetime3++) {
            ee.field_e[var4Lifetime3] = var18.readUnsignedShort((byte) 0);
          }
          var18.position = param0.length - 7 - to.field_t * 8 - (-3 + 3 * var3);
          ud.field_e = new int[var3];
          for (var4Lifetime4 = 1; var3 > var4Lifetime4; var4Lifetime4++) {
            ud.field_e[var4Lifetime4] = var18.readUnsignedMedium((byte) -107);
            if (ud.field_e[var4Lifetime4] == 0) {
              ud.field_e[var4Lifetime4] = 1;
            }
          }
          var18.position = 0;
          for (var4Lifetime5 = 0; var4Lifetime5 < to.field_t; var4Lifetime5++) {
            var5 = ji.field_b[var4Lifetime5];
            var6 = ee.field_e[var4Lifetime5];
            var7 = var5 * var6;
            var21 = new byte[var7];
            var19 = var21;
            var8 = var19;
            fk.field_a[var4Lifetime5] = var21;
            var22 = new byte[var7];
            var20 = var22;
            var9 = var20;
            ql.field_p[var4Lifetime5] = var22;
            var10 = 0;
            var11 = var18.readUnsignedByte(param1 ^ 7088);
            if (0 == (var11 & 1)) {
              for (var12 = 0; var12 < var7; var12++) {
                var8[var12] = var18.readByte(param1 - 7148);
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var7 > var12; var12++) {
                  dupTemp$0 = var18.readByte(id.a(param1, 7148));
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_48_0 = var10;
                  if (var13 == -1) {
                    stackIn_49_1 = 0;
                  } else {
                    stackIn_49_1 = 1;
                  }
                  var10 = stackIn_48_0 | stackIn_49_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var6 > var13; var13++) {
                  var8[var13 * var5 + var12] = var18.readByte(0);
                }
              }
              if ((var11 & 2) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var6 > var13; var13++) {
                    dupTemp$1 = var18.readByte(0);
                    var9[var5 * var13 + var12] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_37_0 = var10;
                    if (var14 == -1) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    var10 = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            q.field_k[var4Lifetime5] = var10 != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("jr.B(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    final String c(byte param0) {
        int var3 = 0;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (null == this.field_q) {
          return "";
        }
        StringBuilder discarded$15 = var6.append(this.field_q[0]);
        if (param0 != 1) {
          byte[] var5 = (byte[]) null;
          jr.a((byte[]) null, 105);
        }
        for (var3 = 1; this.field_q.length > var3; var3++) {
          discarded$16 = var2.append("...");
          discarded$17 = var6.append(this.field_q[var3]);
        }
        return var2.toString();
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = AceOfSkies.obfuscationControl ? 1 : 0;
        if (!param0) {
          return;
        }
        if (null != this.field_t) {
          for (var2 = 0; var2 < this.field_t.length; var2++) {
            this.field_t[var2] = vo.a(this.field_t[var2], 32768);
          }
        }
    }

    private final void a(PacketBuffer param0, int param1, int param2) {
        int[] array$0 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ej var7 = null;
        int var9 = 0;
        var9 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 > -71) {
            this.field_t = (int[]) null;
          }
          if (param2 == 1) {
            this.field_q = ee.a((byte) 10, '<', param0.readNullTerminatedText(-17883));
          } else {
            if (param2 == 2) {
              var4_int = param0.readUnsignedByte(-61);
              this.field_t = new int[var4_int];
              for (var5 = 0; var5 < var4_int; var5++) {
                this.field_t[var5] = param0.readUnsignedShort((byte) 0);
              }
            } else if (3 == param2) {
              var4_int = param0.readUnsignedByte(82);
              this.field_o = new int[var4_int];
              this.field_s = new int[var4_int][];
              for (var5 = 0; var4_int > var5; var5++) {
                var6 = param0.readUnsignedShort((byte) 0);
                var7 = ks.a(var6, -28228);
                if (var7 != null) {
                  this.field_o[var5] = var6;
                  array$0 = new int[var7.field_c];
                  this.field_s[var5] = array$0;
                  for (var8 = 0; var7.field_c > var8; var8++) {
                    this.field_s[var5][var8] = param0.readUnsignedShort((byte) 0);
                  }
                }
              }
            } else {
              if (param2 == 4) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("jr.G(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, PacketBuffer param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          while (true) {
            var3_int = param1.readUnsignedByte(99);
            if (var3_int != 0) {
              this.a(param1, -112, var3_int);
              continue;
            }
            break;
          }
          if (param0 <= 99) {
            field_n = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("jr.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    jr() {
    }

    static {
        field_n = new int[16384];
        field_r = "Please wait...";
        field_p = "Invalid password.";
    }
}
