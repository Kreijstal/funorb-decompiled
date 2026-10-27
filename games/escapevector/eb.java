/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends hc {
    int field_N;
    int field_I;
    int field_M;
    static boolean field_H;
    static om field_L;
    int field_F;
    int field_D;
    int field_G;
    static long field_J;
    static int field_K;

    final static void k(int param0) {
        String var2 = (String) null;
        IntValueNode.a(kl.field_o, (String) null, 63);
        if (param0 != 0) {
          eb.a(true);
        }
    }

    final static void a(byte[] param0, boolean param1) {
        boolean stackIn_39_1 = false;
        boolean stackIn_51_1 = false;
        String stackIn_57_2 = null;
        int var12 = 0;
        int var13 = 0;
        int var15 = EscapeVector.obfuscationControl;
        try {
          PacketBuffer var17 = new PacketBuffer(param0);
          PacketBuffer var18 = var17;
          var18.position = -2 + param0.length;
          qk.field_j = var18.readUnsignedShort(1952);
          gn.field_k = new int[qk.field_j];
          bj.field_E = new boolean[qk.field_j];
          bc.field_a = new int[qk.field_j];
          if (!param1) {
            byte[] var16 = (byte[]) null;
            eb.a((byte[]) null, false);
          }
          hn.field_b = new byte[qk.field_j][];
          gi.field_e = new int[qk.field_j];
          qe.field_a = new byte[qk.field_j][];
          qh.field_k = new int[qk.field_j];
          var18.position = -(qk.field_j * 8) + (-7 + param0.length);
          on.field_e = var18.readUnsignedShort(1952);
          hd.field_c = var18.readUnsignedShort(1952);
          int var3 = 1 + (var18.readUnsignedByte(0) & 255);
          for (int var4 = 0; var4 < qk.field_j; var4++) {
            gn.field_k[var4] = var17.readUnsignedShort(1952);
          }
          for (int var4Lifetime1 = 0; qk.field_j > var4Lifetime1; var4Lifetime1++) {
            gi.field_e[var4Lifetime1] = var18.readUnsignedShort(1952);
          }
          for (int var4Lifetime2 = 0; var4Lifetime2 < qk.field_j; var4Lifetime2++) {
            qh.field_k[var4Lifetime2] = var18.readUnsignedShort(1952);
          }
          for (int var4Lifetime3 = 0; qk.field_j > var4Lifetime3; var4Lifetime3++) {
            bc.field_a[var4Lifetime3] = var18.readUnsignedShort(1952);
          }
          var18.position = -(var3 * 3) - (-3 - (param0.length - (7 + qk.field_j * 8)));
          qk.field_f = new int[var3];
          for (int var4Lifetime4 = 1; var4Lifetime4 < var3; var4Lifetime4++) {
            qk.field_f[var4Lifetime4] = var18.readUnsignedMedium((byte) -124);
            if (qk.field_f[var4Lifetime4] == 0) {
              qk.field_f[var4Lifetime4] = 1;
            }
          }
          var18.position = 0;
          for (int var4Lifetime5 = 0; var4Lifetime5 < qk.field_j; var4Lifetime5++) {
            int var5 = qh.field_k[var4Lifetime5];
            int var6 = bc.field_a[var4Lifetime5];
            int var7 = var6 * var5;
            byte[] var21 = new byte[var7];
            byte[] var19 = var21;
            byte[] var8 = var19;
            qe.field_a[var4Lifetime5] = var21;
            byte[] var22 = new byte[var7];
            byte[] var20 = var22;
            byte[] var9 = var20;
            hn.field_b[var4Lifetime5] = var22;
            boolean var10 = false;
            int var11 = var18.readUnsignedByte(0);
            if ((var11 & 1) == 0) {
              for (var12 = 0; var7 > var12; var12++) {
                var8[var12] = var18.a(false);
              }
              if (0 != (2 & var11)) {
                for (var12 = 0; var7 > var12; var12++) {
                  byte dupTemp$0 = var18.a(false);
                  var9[var12] = dupTemp$0;
                  var13 = dupTemp$0;
                  boolean stackIn_50_0 = var10;
                  stackIn_51_1 = !(var13 == -1);
                  var10 = stackIn_50_0 | stackIn_51_1;
                }
              }
            } else {
              for (var12 = 0; var12 < var5; var12++) {
                for (var13 = 0; var13 < var6; var13++) {
                  var8[var13 * var5 + var12] = var18.a(false);
                }
              }
              if ((2 & var11) != 0) {
                for (var12 = 0; var5 > var12; var12++) {
                  for (var13 = 0; var13 < var6; var13++) {
                    byte dupTemp$1 = var18.a(false);
                    var9[var12 + var5 * var13] = dupTemp$1;
                    int var14 = dupTemp$1;
                    boolean stackIn_38_0 = var10;
                    stackIn_39_1 = !(var14 == -1);
                    var10 = stackIn_38_0 | stackIn_39_1;
                  }
                }
              }
            }
            bj.field_E[var4Lifetime5] = (var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_56_0 = var2;
          StringBuilder stackIn_56_1 = new StringBuilder().append("eb.U(");
          if (param0 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        String stackIn_21_2 = null;
        int var12 = EscapeVector.obfuscationControl;
        try {
          if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
            return false;
          }
          int var8_int = -param4 - this.field_k - (this.field_D - param1);
          int var9 = -this.field_j + (-param0 + (-this.field_I + param3));
          if (this.field_N * this.field_N <= var8_int * var8_int + var9 * var9) {
            return true;
          }
          double var10 = Math.atan2((double)var9, (double)var8_int) - hf.field_c;
          if (0.0 > var10) {
            var10 = var10 - 3.141592653589793 / (double)this.field_M;
          } else if (var10 > 0.0) {
            var10 = var10 + 3.141592653589793 / (double)this.field_M;
          }
          this.field_F = (int)(var10 * (double)this.field_M / 6.283185307179586);
          while (this.field_M <= this.field_F) {
            this.field_F = this.field_F - this.field_M;
          }
          while (0 > this.field_F) {
            this.field_F = this.field_F + this.field_M;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var8 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var8;
          StringBuilder stackIn_20_1 = new StringBuilder().append("eb.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_L = null;
    }

    private eb() throws Throwable {
        throw new Error();
    }

    static {
        field_L = new om(2, 4, 4, 0);
        field_K = 0;
    }
}
