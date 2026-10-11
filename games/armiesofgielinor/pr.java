/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pr {
    static String[] field_a;
    private int field_j;
    static String field_i;
    private NodeDeque[] field_b;
    private int field_e;
    private int field_c;
    static int[] field_f;
    static AnimationPlayer field_g;
    private int[] field_d;
    private ru field_h;

    final NodeDeque a(int param0, int param1) {
        if (param1 != 1) {
          return (NodeDeque) null;
        }
        return this.field_b[1 + param0];
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        if (11 == p.field_b) {
          wp.d((byte) -13);
        }
        SpellCastRequest.a(dd.field_a, TelepopEvent.field_C, UnitSpell.field_e, -1);
        if (param0 <= 106) {
          return;
        }
        try {
          pt.a(0, 12, param1, 0);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "pr.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, int param1, int param2, byte param3) {
        param2++;
        if (this.field_b[param2] == null) {
          this.field_b[param2] = new NodeDeque();
        }
        if (param3 >= -95) {
          this.a(-65, (byte) -99, 28);
        }
        this.field_b[param2].addLast((byte) -119, (IntrusiveNode) (new a(param1, param0)));
    }

    final static boolean b(int param0) {
        int var1;
        boolean stackIn_4_0 = false;
        var1 = -21 % ((param0 + 25) / 55);
        stackIn_4_0 = (null != ActionSpell.field_e) && (ActionSpell.field_e.a((byte) 103));
        return stackIn_4_0;
    }

    final static void a(PacketBuffer param0, byte param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          java.awt.Canvas var6 = null;
          byte[] var7 = null;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            if (param1 != -84) {
              var6 = (java.awt.Canvas) null;
              pr.a((byte) -8, (java.awt.Canvas) null);
            }
            var7 = new byte[24];
            var2 = var7;
            if (le.field_d != null) {
              try {
                le.field_d.a(-1, 0L);
                le.field_d.a(0, var7);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param0.a(var2, 0, 24, 81);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param0.a(var2, 0, 24, 81);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref;
            stackIn_20_1 = new StringBuilder().append("pr.I(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static je a(int param0, int param1, int param2, int param3, int param4, int param5, BitmapFont param6, int param7, int param8, int param9, int param10, byte param11, int param12) {
        int var13_int = 0;
        RuntimeException var13 = null;
        je var14 = null;
        je stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13_int = -103 % ((-17 - param11) / 52);
          var14 = new je(0L, (je) null);
          var14.field_G = tn.a(true, param12, param3);
          var14.field_mb = tn.a(true, param4, param8);
          var14.field_U = tn.a(true, param1, param7);
          var14.field_H = tn.a(true, param10, param9);
          var14.field_A = tn.a(true, param2, param0);
          var14.field_N = param5;
          var14.field_Z = param6;
          stackIn_1_0 = var14;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_4_0 = var13;
          stackIn_4_1 = new StringBuilder().append("pr.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        field_g = null;
        if (param0 != 7742) {
          field_g = (AnimationPlayer) null;
        }
        field_a = null;
        field_f = null;
    }

    final RgbSprite a(int param0, int param1, byte param2, int param3) {
        int var11_int = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_21_2 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        RgbSprite var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var5 = this.field_h.field_e;
        var6 = 0;
        var7 = this.field_h.field_h;
        var8 = 0;
        var10 = 6 / ((17 - param2) / 40);
        for (var9 = this.field_h.field_d; var9 < this.field_h.field_h; var9++) {
          for (var11_int = this.field_h.field_i; this.field_h.field_e > var11_int; var11_int++) {
            var12 = this.field_h.field_k[var11_int + this.field_h.field_e * var9];
            var13 = this.field_d[var12];
            if (~param0 == ~var13) {
              var5 = Math.min(var5, var11_int);
              var6 = Math.max(var6, var11_int);
              var7 = Math.min(var7, var9);
              var8 = Math.max(var8, var9);
            }
          }
        }
        var9Lifetime1 = 1 + (var8 - var7);
        var10Lifetime1 = 1 + (var6 - var5);
        if (var10Lifetime1 <= 0) {
          return null;
        }
        if (0 >= var9Lifetime1) {
          return null;
        }
        var10Lifetime1 = var10Lifetime1 + 2 * param3;
        var9Lifetime1 = var9Lifetime1 + param3 * 2;
        var11 = new RgbSprite(var10Lifetime1, var9Lifetime1);
        for (var12Lifetime1 = var7; var8 >= var12Lifetime1; var12Lifetime1++) {
          var17 = var5;
          var13Lifetime1 = var17;
          while (var17 < var6) {
            var14 = this.field_h.field_k[var12Lifetime1 * this.field_h.field_e + var17];
            var15 = this.field_d[var14];
            stackIn_20_0 = var11.field_B;
            stackIn_20_1 = (param3 + (-var7 + var12Lifetime1)) * var10Lifetime1 + (var17 - (var5 - param3));
            if (var15 == param0) {
              stackIn_21_2 = param1;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_20_0[stackIn_20_1] = stackIn_21_2;
            var17++;
          }
        }
        var11.field_A = var10Lifetime1 + var5;
        var11.field_x = var9Lifetime1 + var7;
        var11.field_z = var7;
        var11.field_w = var5;
        return var11;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        if (param3 != 0) {
          pr.b(-81);
        }
        vo.a(mi.field_l, 2, jn.field_d, param0, gl.field_c, param1, param2);
    }

    pr(ru param0, int param1, int param2) {
        try {
          this.field_e = 0;
          this.field_h = param0;
          this.field_j = param2;
          this.field_c = param1;
          this.c(-91);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var4 = -this.field_h.field_i + param0;
        var5 = param2 - this.field_h.field_d;
        if (var4 >= 0 &&
          var4 < -this.field_h.field_i + this.field_h.field_e &&
          0 <= var5 &&
          this.field_h.field_h - this.field_h.field_d > var5) {
          if (this.field_h.field_k.length <= var4 + this.field_h.field_e * var5) {
            return -1;
          }
          var8 = -17 % ((-35 - param1) / 36);
          var6 = this.field_h.field_k[var4 + var5 * this.field_h.field_e];
          var7 = this.field_d[var6];
          return var7;
        }
        return -1;
    }

    private final void c(int param0) {
        int fieldTemp$0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.field_b = new NodeDeque[257];
        this.field_d = new int[256];
        for (var2 = 0; var2 < this.field_d.length; var2++) {
          this.field_d[var2] = -1;
        }
        var2Lifetime1 = -1;
        var3 = -1;
        var4 = 101 % ((-34 - param0) / 39);
        for (var5 = 0; this.field_h.field_j.length > var5; var5++) {
          if (this.field_c != this.field_h.field_j[var5]) {
            if (this.field_h.field_j[var5] == this.field_j) {
              var3 = var5;
            }
          } else {
            var2Lifetime1 = var5;
          }
        }
        var4Lifetime1 = -1;
        for (var5Lifetime1 = 0; var5Lifetime1 < this.field_h.field_k.length; var5Lifetime1++) {
          var6 = this.field_h.field_k[var5Lifetime1] & 255;
          if (var2Lifetime1 != var6) {
            if (var3 != var6) {
              if (this.field_d[var6] == -1) {
                fieldTemp$0 = this.field_e;
                this.field_e = this.field_e + 1;
                this.field_d[var6] = fieldTemp$0;
              }
              var4Lifetime1 = this.field_d[var6];
            } else {
              this.a(var5Lifetime1 / this.field_h.field_e, var5Lifetime1 % this.field_h.field_e, var4Lifetime1, (byte) -121);
            }
          }
        }
    }

    final void a(byte param0, int param1, boolean[] param2, int param3, ru param4) {
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var21 = SoftwareRaster.field_d;
          var20 = var21;
          var19 = var20;
          var6 = var19;
          var7 = this.field_h.field_i;
          var8 = this.field_h.field_d;
          if (param0 <= 79) {
            this.a(52, 9);
          }
          var9 = this.field_h.field_e;
          if (SoftwareRaster.field_j > var7 + param1) {
            var7 = SoftwareRaster.field_j - param1;
          }
          if (var9 + param1 >= SoftwareRaster.field_e) {
            var9 = -param1 + SoftwareRaster.field_e;
          }
          var10 = this.field_h.field_h;
          if (SoftwareRaster.field_a > var8 + param3) {
            var8 = -param3 + SoftwareRaster.field_a;
          }
          if (SoftwareRaster.field_f <= var10 + param3) {
            var10 = -param3 + SoftwareRaster.field_f;
          }
          for (var11 = var8; var11 < var10; var11++) {
            for (var12 = var7; var12 < var9; var12++) {
              var13 = var12 + var11 * this.field_h.field_e;
              var14 = 255 & this.field_h.field_k[var13];
              var15 = this.field_d[var14];
              if (0 <= var15 &&
                var15 < param2.length &&
                param2[var15]) {
                var16 = param4.field_j[255 & param4.field_k[var13]];
                var17 = SoftwareRaster.field_l * (param3 + var11) + (param1 + var12);
                if (var21.length <= var17) {
                  System.out.println(var21.length);
                }
                var21[var17] = var16;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_34_0 = var6_ref;
          stackIn_34_1 = new StringBuilder().append("pr.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"This unit has plate armour, giving +<%0>0% defence against melee attacks.", "This unit has padded armour, giving +<%0>0% defence against ranged attacks.", "This unit has enchanted armour, giving +<%0>0% defence against magical attacks.", "This unit has dragon armour, giving +<%0>0% defence against flame attacks.", "This unit has runic armour, giving +<%0>0% defence against all attacks.", "This unit has camoflaged armour, giving +<%0>0% defence against aerial attacks.", "This unit has stone armour, protecting it from <%0> attacks but halving its speed.", "This unit has granite armour, protecting it from <%0> attacks but immobilising it."};
        field_f = new int[]{0, 70, 74, 78, 82, 86, 90, 103, 104};
    }
}
