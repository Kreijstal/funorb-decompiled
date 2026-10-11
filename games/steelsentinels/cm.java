/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    private fa field_o;
    boolean field_f;
    int field_d;
    private Object[] field_k;
    private jl field_a;
    private Object[][] field_i;
    static int[] field_l;
    static String field_c;
    static String field_n;
    static int[] field_e;
    static String[] field_m;
    static RgbSprite[] field_b;
    static String field_p;
    static tb field_j;
    static int field_g;
    static SceneWidget field_h;

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (!this.b(param2, param1, -17637)) {
          return false;
        }
        if (null != this.field_i[param2] &&
          null != this.field_i[param2][param1]) {
          return true;
        }
        if (null != this.field_k[param2]) {
          return true;
        }
        this.a(-66, param2);
        if (null != this.field_k[param2]) {
          return true;
        }
        if (param0 <= 53) {
          this.a(98);
          return false;
        }
        return false;
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (!this.a(true)) {
          return false;
        }
        if (param2 != -17637) {
          return false;
        }
        if (param0 < 0 ||
          param1 < 0 ||
          this.field_a.field_g.length <= param0 ||
          param1 >= this.field_a.field_g[param0]) {
          if (qi.field_l) {
            throw new IllegalArgumentException(param0 + " " + param1);
          }
          return false;
        }
        return true;
    }

    private final synchronized boolean a(int param0, int param1, int param2, int[] param3) {
        Object[] array$0 = null;
        int var9_int = 0;
        int var20 = 0;
        byte[] array$1 = null;
        int[] stackIn_25_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        boolean stackIn_37_2 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
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
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
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
        int[] var30 = null;
        byte[][] var31 = null;
        PacketBuffer var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        int var14Lifetime1;
        var22 = SteelSentinels.obfuscationControl;
        try {
          if (!this.b(param1, true)) {
            return false;
          }
          if (null == this.field_k[param1]) {
            return false;
          }
          var5_int = this.field_a.field_j[param1];
          var34 = this.field_a.field_o[param1];
          var24 = var34;
          var6 = var24;
          if (null == this.field_i[param1]) {
            array$0 = new Object[this.field_a.field_g[param1]];
            this.field_i[param1] = array$0;
          }
          var7 = this.field_i[param1];
          var8 = 1;
          for (var9_int = param2; var9_int < var5_int; var9_int++) {
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
          if (param3 != null) {
            stackIn_25_0 = (int[]) (param3);
            if (stackIn_25_0[0] != 0 ||
              0 != param3[1] ||
              param3[2] != 0 ||
              param3[3] != 0) {
              var35 = dk.a(true, this.field_k[param1], 0);
              var25 = var35;
              var9 = var25;
              var26 = new PacketBuffer(var35);
              var26.a(5, param2 ^ 32203, var26.payload.length, param3);
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            var9 = dk.a(false, this.field_k[param1], 0);
          }
          try {
            var36 = ln.a(var9, (byte) 127);
            var27 = var36;
            var23 = var27;
            var43 = var23;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var11_ref_RuntimeException = decompiledCaughtException;
            stackIn_36_0 = var11_ref_RuntimeException;
            stackIn_36_1 = new StringBuilder();
            stackIn_37_2 = (param3 != null);
            throw ci.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(" ").append(param1).append(" ").append(var9.length).append(" ").append(ba.a((byte) -107, var9, var9.length)).append(" ").append(ba.a((byte) -107, var9, var9.length - 2)).append(" ").append(this.field_a.field_a[param1]).append(" ").append(this.field_a.field_e).toString());
          }
          if (this.field_f) {
            this.field_k[param1] = null;
          }
          if (1 < var5_int) {
            if (this.field_d == 2) {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var5_int * var12 * 4;
              var32 = new PacketBuffer(var43);
              var14 = 0;
              var32.position = var11;
              var15 = 0;
              for (var16 = 0; var12 > var16; var16++) {
                var17 = 0;
                for (var18 = 0; var18 < var5_int; var18++) {
                  var17 = var17 + var32.readInt(0);
                  if (var6 != null) {
                    var19 = var34[var18];
                  } else {
                    var19 = var18;
                  }
                  if (param0 == var19) {
                    var15 = var19;
                    var14 = var14 + var17;
                  }
                }
              }
              if (var14 == 0) {
                return true;
              }
              var44 = new byte[var14];
              var14Lifetime1 = 0;
              var32.position = var11;
              var17 = 0;
              for (var18 = 0; var18 < var12; var18++) {
                var19 = 0;
                for (var20 = 0; var5_int > var20; var20++) {
                  var19 = var19 + var32.readInt(param2 + 0);
                  if (var6 != null) {
                    var21 = var34[var20];
                  } else {
                    var21 = var20;
                  }
                  if (var21 == param0) {
                    ii.a(var43, var17, var44, var14Lifetime1, var19);
                    var14Lifetime1 = var14Lifetime1 + var19;
                  }
                  var17 = var17 + var19;
                }
              }
              var7[var15] = var44;
            } else {
              var11 = var36.length;
              var11--;
              var12 = var23[var11] & 255;
              var11 = var11 - var12 * var5_int * 4;
              var29 = new PacketBuffer(var43);
              var29.position = var11;
              var38 = new int[var5_int];
              var30 = var38;
              var14_ref_int__ = var30;
              for (var15 = 0; var15 < var12; var15++) {
                var16 = 0;
                for (var17 = 0; var5_int > var17; var17++) {
                  var16 = var16 + var29.readInt(0);
                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                }
              }
              var39 = new byte[var5_int][];
              var31 = var39;
              var15_ref_byte____ = var31;
              for (var16 = 0; var16 < var5_int; var16++) {
                array$1 = new byte[var38[var16]];
                var15_ref_byte____[var16] = array$1;
                var38[var16] = 0;
              }
              var29.position = var11;
              var16 = 0;
              for (var17 = 0; var17 < var12; var17++) {
                var18 = 0;
                for (var19 = 0; var19 < var5_int; var19++) {
                  var18 = var18 + var29.readInt(0);
                  ii.a(var43, var16, var39[var19], var38[var19], var18);
                  var16 = var16 + var18;
                  var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                }
              }
              for (var17 = 0; var17 < var5_int; var17++) {
                if (var6 == null) {
                  var18 = var17;
                } else {
                  var18 = var34[var17];
                }
                if (0 != this.field_d) {
                  var7[var18] = var39[var17];
                } else {
                  var7[var18] = ah.a(false, var39[var17], 0);
                }
              }
            }
          } else {
            if (var6 == null) {
              var11 = 0;
            } else {
              var11 = var34[0];
            }
            if (this.field_d != 0) {
              var7[var11] = var36;
              return true;
            }
            var7[var11] = ah.a(false, var43, 0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = decompiledCaughtException;
          stackIn_106_0 = var5;
          stackIn_106_1 = new StringBuilder().append("cm.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 0) {
            ((byte[]) (this.field_k[18]))[0] = (byte) -10;
          }
          if (!this.a(true)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) 120);
          if (this.b(var3_int, true)) {
            stackIn_10_0 = var3_int;
            return stackIn_10_0;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("cm.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        if (!this.b(param1, param0)) {
          return 0;
        }
        return this.field_a.field_g[param1];
    }

    final synchronized int b(int param0, int param1) {
        if (!this.b(param1, true)) {
          return 0;
        }
        if (param0 != 10407) {
          this.field_i = (Object[][]) null;
        }
        if (this.field_k[param1] != null) {
          return 100;
        }
        return this.field_o.a(false, param1);
    }

    private final synchronized void a(int param0, int param1) {
        if (this.field_f) {
          this.field_k[param1] = this.field_o.a(param1, 82);
        } else {
          this.field_k[param1] = ah.a(false, this.field_o.a(param1, 2), 0);
        }
        if (param0 > -12) {
          cm.b(true);
        }
    }

    final synchronized int a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var4Lifetime1;
        var5 = SteelSentinels.obfuscationControl;
        if (param0 != -33) {
          return ((int[]) (this.field_k[12]))[1];
        }
        if (!this.a(true)) {
          return 0;
        }
        var2 = 0;
        var3 = 0;
        for (var4 = 0; this.field_k.length > var4; var4++) {
          if (this.field_a.field_j[var4] > 0) {
            var2 += 100;
            var3 = var3 + this.b(10407, var4);
          }
        }
        if (var2 == 0) {
          return 100;
        }
        var4Lifetime1 = var3 * 100 / var2;
        return var4Lifetime1;
    }

    public static void b(boolean param0) {
        field_l = null;
        field_m = null;
        field_p = null;
        if (param0) {
          byte[] var2 = (byte[]) null;
          cm.a((String[][]) null, (byte) 89, (cm) null, (int[]) null, (cm) null, (RgbSprite[][]) null, false, 80, 61, (String[]) null, (IndexedSprite[]) null, (int[]) null, (RgbSprite[][]) null, (cm) null, (byte[]) null, (String[][]) null, (byte[]) null);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_n = null;
        field_j = null;
        field_h = null;
    }

    private final synchronized boolean b(int param0, boolean param1) {
        if (!this.a(param1)) {
          return false;
        }
        if (param0 >= 0 &&
          param0 < this.field_a.field_g.length &&
          this.field_a.field_g[param0] != 0) {
          return true;
        }
        if (qi.field_l) {
          throw new IllegalArgumentException(Integer.toString(param0));
        }
        return false;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.b(param0, true)) {
            stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_a.field_d[param0].a(ij.a(var6, false), (byte) 114);
          if (param1 != -32759) {
            var5 = (String) null;
            this.a((byte) -29, (String) null);
          }
          if (this.b(param0, var4_int, -17637)) {
            return var4_int;
          }
          stackIn_8_0 = -1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("cm.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(true)) {
            return false;
          }
          param2 = param2.toLowerCase();
          param1 = param1.toLowerCase();
          var7 = (CharSequence) ((Object) param2);
          var4_int = this.field_a.field_n.a(ij.a(var7, false), (byte) 116);
          if (!this.b(var4_int, true)) {
            return false;
          }
          var6 = -120 % ((param0 - 40) / 43);
          var8 = (CharSequence) ((Object) param1);
          var5 = this.field_a.field_d[var4_int].a(ij.a(var8, false), (byte) -77);
          stackIn_8_0 = this.a((byte) 97, var5, var4_int);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("cm.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 90) {
            return false;
          }
          if (!this.a(true)) {
            return false;
          }
          param0 = param0.toLowerCase();
          var4 = (CharSequence) ((Object) param0);
          var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) 123);
          stackIn_8_0 = this.a(var3_int, true);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("cm.K(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(int param0, String param1) {
        boolean discarded$1 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12145) {
            discarded$1 = this.b(((int[]) (((Object[]) (this.field_k[29]))[8]))[0], -80, -37);
          }
          if (!this.a(true)) {
            return false;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) -121);
          if (var3_int >= 0) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("cm.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String[][] param0, byte param1, cm param2, int[] param3, cm param4, RgbSprite[][] param5, boolean param6, int param7, int param8, String[] param9, IndexedSprite[] param10, int[] param11, RgbSprite[][] param12, cm param13, byte[] param14, String[][] param15, byte[] param16) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          if (param1 < 53) {
            cm.b(false);
          }
          var18 = (String[]) null;
          lh.a(param11, param5, 72, param15, param4, param3, param6, param13, param9, param10, param2, param0, param14, param12, param8, (String[]) null, param16, 1, param7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("cm.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param5 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param10 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param11 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param12 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != 200) {
          cm.b(false);
        }
        if (param2 == 0) {
          if (param0 == 0) {
            return 0;
          }
          if (0 > param0) {
            return -2048;
          }
          return 2048;
        }
        if (0 > param2) {
          if (param0 == 0) {
            return 4096;
          }
          if (param0 < 0) {
            return rb.a(-param2, 2048, -param0) - 4096;
          }
          return 4096 - rb.a(-param2, 2048, param0);
        }
        if (0 == param0) {
          return 0;
        }
        if (param0 < 0) {
          return -rb.a(param2, 2048, -param0);
        }
        return rb.a(param2, 2048, param0);
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 <= 20) {
          return (byte[]) null;
        }
        return this.b(param2, 126, param0, (int[]) null);
    }

    final synchronized boolean a(boolean param0) {
        if (null == this.field_a) {
          this.field_a = this.field_o.b((byte) 114);
          if (this.field_a == null) {
            return false;
          }
          this.field_i = new Object[this.field_a.field_u][];
          this.field_k = new Object[this.field_a.field_u];
        }
        if (!param0) {
          this.b(((byte[]) (this.field_k[0]))[10]);
          return true;
        }
        return true;
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(true)) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) ((Object) param1);
          var3_int = this.field_a.field_n.a(ij.a(var4, false), (byte) -95);
          if (param0 <= 66) {
            this.a((String) (this.field_k[20]), (byte) -91);
          }
          stackIn_6_0 = this.b(10407, var3_int);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("cm.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final synchronized boolean a(int param0) {
        int var3 = 0;
        int var2;
        int var4;
        int var5;
        var5 = SteelSentinels.obfuscationControl;
        if (!this.a(true)) {
          return false;
        }
        var2 = 1;
        if (param0 != 25) {
          this.a(((int[]) (((Object[]) (this.field_k[2]))[10]))[1], -7);
        }
        for (var3 = 0; this.field_a.field_h.length > var3; var3++) {
          var4 = this.field_a.field_h[var3];
          if (null == this.field_k[var4]) {
            this.a(-52, var4);
            if (null == this.field_k[var4]) {
              var2 = 0;
            }
          }
        }
        return var2 != 0;
    }

    final int b(byte param0) {
        int var2 = -38 / ((param0 - 62) / 49);
        if (!this.a(true)) {
          return -1;
        }
        return this.field_a.field_g.length;
    }

    final synchronized boolean a(int param0, boolean param1) {
        if (!this.b(param0, param1)) {
          return false;
        }
        if (null != this.field_k[param0]) {
          return true;
        }
        this.a(-123, param0);
        if (null != this.field_k[param0]) {
          return true;
        }
        return false;
    }

    final synchronized byte[] c(int param0, int param1) {
        if (!this.a(true)) {
          return null;
        }
        if (this.field_a.field_g.length == 1) {
          return this.a(0, (byte) 94, param0);
        }
        if (!this.b(param0, true)) {
          return null;
        }
        if (param1 != 28694) {
          this.b((byte) -24);
        }
        if (this.field_a.field_g[param0] == 1) {
          return this.a(param0, (byte) 105, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized byte[] b(int param0, int param1, int param2, int[] param3) {
        Object stackIn_12_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var5 = null;
        byte[] var7 = null;
        try {
          if (param1 <= 57) {
            this.field_d = ((int[]) (this.field_k[0]))[7];
          }
          if (!this.b(param2, param0, -17637)) {
            return null;
          }
          var5 = null;
          if ((this.field_i[param2] == null ||
            null == this.field_i[param2][param0]) && !this.a(param0, param2, 0, param3)) {
            this.a(-70, param2);
            if (!this.a(param0, param2, 0, param3)) {
              stackIn_12_0 = null;
              return (byte[]) (stackIn_12_0);
            }
          }
          if (this.field_i[param2] == null) {
            throw new RuntimeException("");
          }
          if (null != this.field_i[param2][param0]) {
            var7 = dk.a(false, this.field_i[param2][param0], 0);
            var5 = var7;
            if (var7 == null) {
              throw new RuntimeException("");
            }
          }
          if (var5 != null) {
            if (1 != this.field_d) {
              if (this.field_d == 2) {
                this.field_i[param2] = null;
              }
            } else {
              this.field_i[param2][param0] = null;
              if (this.field_a.field_g[param2] == 1) {
                this.field_i[param2] = null;
              }
            }
          }
          stackIn_26_0 = var5;
          return (byte[]) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("cm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) (stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.a(true)) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          if (param1 != -742) {
            stackIn_5_0 = (byte[]) null;
            return stackIn_5_0;
          }
          var6 = (CharSequence) ((Object) param2);
          var4_int = this.field_a.field_n.a(ij.a(var6, false), (byte) 117);
          if (!this.b(var4_int, true)) {
            stackIn_8_0 = null;
            return (byte[]) (stackIn_8_0);
          }
          var7 = (CharSequence) ((Object) param0);
          var5 = this.field_a.field_d[var4_int].a(ij.a(var7, false), (byte) -17);
          stackIn_10_0 = this.a(var4_int, (byte) 56, var5);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cm.U(");
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
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    cm(fa param0, boolean param1, int param2) {
        this.field_a = null;
        try {
          if (param2 < 0 ||
            param2 > 2) {
            throw new IllegalArgumentException("");
          }
          this.field_f = param1 ? true : false;
          this.field_d = param2;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_l = new int[8192];
        field_c = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_e = new int[105];
        field_n = "Unpacking sound effects";
        field_e[1] = 256;
        field_e[39] = 148;
        field_e[63] = 100;
        field_e[38] = 16;
        field_e[42] = 105;
        field_e[49] = 40;
        field_e[82] = 128;
        field_e[10] = 256;
        field_e[46] = 149;
        field_e[100] = 256;
        field_e[40] = 20;
        field_e[2] = 256;
        field_e[33] = 148;
        field_e[21] = 200;
        field_e[98] = 256;
        field_e[32] = 150;
        field_e[71] = 128;
        field_e[89] = 150;
        field_e[4] = 200;
        field_e[54] = 150;
        field_e[83] = 128;
        field_e[26] = 90;
        field_e[93] = 256;
        field_e[31] = 137;
        field_e[48] = 150;
        field_e[74] = 128;
        field_e[44] = 89;
        field_e[79] = 128;
        field_e[102] = 256;
        field_e[12] = 256;
        field_e[92] = 256;
        field_e[69] = 256;
        field_e[47] = 150;
        field_e[66] = 25;
        field_e[95] = 256;
        field_e[60] = 256;
        field_e[97] = 256;
        field_e[7] = 256;
        field_e[35] = 256;
        field_e[84] = 150;
        field_e[85] = 150;
        field_e[20] = 179;
        field_e[17] = 256;
        field_e[56] = 150;
        field_e[13] = 120;
        field_e[16] = 32;
        field_e[86] = 150;
        field_e[104] = 256;
        field_e[103] = 256;
        field_e[80] = 128;
        field_e[81] = 128;
        field_e[50] = 137;
        field_e[8] = 200;
        field_e[15] = 118;
        field_e[37] = 52;
        field_e[64] = 114;
        field_e[87] = 150;
        field_e[90] = 200;
        field_e[67] = 40;
        field_e[91] = 256;
        field_e[75] = 128;
        field_e[25] = 150;
        field_e[9] = 200;
        field_e[73] = 128;
        field_e[94] = 166;
        field_e[11] = 110;
        field_e[96] = 256;
        field_e[19] = 177;
        field_e[58] = 256;
        field_e[88] = 150;
        field_e[76] = 128;
        field_e[77] = 128;
        field_e[59] = 25;
        field_e[27] = 256;
        field_e[68] = 16;
        field_e[61] = 160;
        field_e[14] = 150;
        field_e[62] = 73;
        field_e[28] = 90;
        field_e[57] = 150;
        field_e[22] = 144;
        field_e[23] = 256;
        field_e[99] = 256;
        field_e[43] = 139;
        field_e[24] = 155;
        field_e[18] = 256;
        field_e[30] = 256;
        field_e[65] = 256;
        field_e[6] = 256;
        field_e[51] = 170;
        field_e[55] = 100;
        field_e[72] = 128;
        field_e[41] = 256;
        field_e[5] = 256;
        field_e[36] = 16;
        field_e[29] = 256;
        field_e[45] = 150;
        field_e[78] = 128;
        field_e[34] = 150;
        field_e[52] = 150;
        field_e[3] = 256;
        field_e[53] = 150;
        field_e[0] = 200;
        for (var0 = 0; var0 < field_e.length; var0++) {
          field_e[var0] = field_e[var0] * 3 / 4;
        }
        field_m = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_p = "FAVOURITES";
    }
}
