/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends mh {
    private int field_Xb;
    static int field_Wb;
    private int field_dc;
    private char[] field_fc;
    static String field_ac;
    private rk[] field_Qb;
    static ResourceArchive field_gc;
    private int field_Rb;
    private int field_Sb;
    private int field_Tb;
    private og[] field_bc;
    private int[] field_Ub;
    private int field_cc;
    static int field_Zb;
    private int field_Pb;
    private og field_Vb;
    private int field_ec;
    static TextFont field_Yb;

    final static void a(String[] args, IndexedSprite[] param1, byte[] param2, RgbSprite[][] param3, byte[] param4, int[] param5, int param6, RgbSprite[][] param7, ResourceArchive param8, int param9, ResourceArchive param10, String[][] param11, ResourceArchive param12, int param13, int[] param14, String[][] param15, boolean param16) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        try {
          LevelPackCard.a(param15, param1, (byte) 47, (String[]) null, param6, args, param11, param12, param8, param10, param14, param7, param9, param16, param3, param4, param2, param5, param13);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("og.J(");
          if (args == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param8 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param11 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param12 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_53_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',');
          if (param15 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param16).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != -81) {
            this.i(-108);
          }
          this.field_ec = param0;
          var5 = 0;
          while (var5 < this.field_cc) {
            var3_int = var5 * this.field_dc;
            var4 = this.field_ec * this.field_ec;
            this.field_Qb[var5].field_zb = (var4 * (-this.field_db + this.field_Sb) + var3_int * (144 - var4)) / 144;
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var3), "og.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        og var4 = null;
        rk var5 = null;
        int var6 = 0;
        rk stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 0;
          if (param0 != 38) {
            return;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.field_Qb.length <= var4_int))) {
            var5 = this.field_Qb[var4_int];
            stackIn_17_0 = -2;
            stackIn_17_1 = ~var5.field_L;
            if (var6 == 0) {
              if (stackIn_17_0 == stackIn_17_1) {
                this.a(param2, var4_int, param0 ^ 38, param1);
                stackIn_13_0 = var5;
                stackIn_14_1 = (this.field_Tb == var4_int);
                stackIn_13_0.field_Nb = stackIn_14_1;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = -1;
            stackIn_17_1 = this.field_Tb;
          }
          if (stackIn_17_0 != stackIn_17_1) {
            var4 = this.field_bc[this.field_Tb];
            if (null != var4) {
              var4.a(param0 ^ 0, param1, param2);
            }
          }
          if (this.field_ec > 0) {
            this.a(-1 + this.field_ec, (byte) -81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "og.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean h(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -26090) {
            field_Zb = -8;
          }
          stackIn_4_0 = LevelPackSelectScreen.field_s;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "og.JA(" + param0 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException runtimeException = null;
        rk[] var2 = null;
        int var3 = 0;
        rk var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var2 = this.field_Qb;
          if (param0 != 41) {
            this.field_Qb = (rk[]) null;
          }
          var3 = 0;
          scanLoop1: while (true) {
            if (var3 < var2.length) {
              var4 = var2[var3];
              var4.field_L = 0;
              var4.field_Nb = false;
              var3++;
              if (var5 == 0) {
                continue;
              }
            } else {
              if (null == this.field_Vb) {
                break scanLoop1;
              }
              this.field_Vb.f((byte) 41);
            }
            this.field_Vb.unlink((byte) 111);
            break;
          }
          this.field_Vb = null;
          this.field_Tb = -1;
          this.a(12, (byte) -81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "og.H(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        rk[] var3 = null;
        int var4 = 0;
        rk var5 = null;
        int var6 = 0;
        int stackIn_13_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != 28) {
            field_gc = (ResourceArchive) null;
          }
          var2_int = 0;
          var3 = this.field_Qb;
          var4 = 0;
          scanLoop1: while (true) {
            if (var4 < var3.length) {
              var5 = var3[var4];
              stackIn_17_0 = var2_int;
              stackIn_17_1 = -1;
              if (var6 == 0) {
                if (stackIn_17_1 == ~var5.field_L) {
                  stackIn_13_1 = 0;
                } else {
                  stackIn_13_1 = 1;
                }
                var2_int = stackIn_17_0 | stackIn_13_1;
                var4++;
                continue;
              }
            } else {
              if (var2_int != 0) {
                break scanLoop1;
              }
              stackIn_17_0 = -1;
              stackIn_17_1 = this.field_Tb;
            }
            if (stackIn_17_0 != stackIn_17_1 &&
              this.field_bc[this.field_Tb] != null) {
              var2_int = this.field_bc[this.field_Tb].i(28) ? 1 : 0;
            }
            break;
          }
          stackIn_25_0 = var2_int;
          return stackIn_25_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var2), "og.A(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (this.field_Tb != param1) {
            if (this.field_bc[param1] == null) {
              if (this.field_Ub[param1] != -1) {
                var5_int = this.field_Ub[param1] | 32768;
                var6 = ng.field_b;
                if (var6 == 0 &&
                  o.field_e != null) {
                  var6 = 1;
                }
                if (tm.a(var6, (byte) 18) == 2) {
                  DirectByteStorage.a(0, param0, 1, var6);
                }
                c.a(var5_int, DualLinkNode.field_p, (byte) -113, ng.field_b, param3, (String) null);
                MenuScreen.a(var5_int, 29295, qn.field_n, DualLinkNode.field_p, ng.field_b);
                rd.a(-1);
                bh.m(-69);
                decompiledFrameRemainder0 = (var7 != 0);
              }
              if (decompiledFrameRemainder0) {
                po.a(true);
                rd.a(-1);
                if (var7 != 0) {
                  this.f((byte) 41);
                  this.a(0, (byte) -81);
                  this.field_Tb = param1;
                  this.field_Vb = this.field_bc[this.field_Tb];
                  BlankScreen.a(param2 ^ -2, this.field_Vb);
                  this.field_Vb.a(12, (byte) -81);
                  this.f((byte) 41);
                  this.a(0, (byte) -81);
                }
              }
            } else {
              this.f((byte) 41);
              this.a(0, (byte) -81);
              this.field_Tb = param1;
              this.field_Vb = this.field_bc[this.field_Tb];
              BlankScreen.a(param2 ^ -2, this.field_Vb);
              this.field_Vb.a(12, (byte) -81);
              if (var7 != 0) {
                this.f((byte) 41);
                this.a(0, (byte) -81);
              }
            }
          } else {
            this.f((byte) 41);
            this.a(0, (byte) -81);
          }
          if (param2 != 0) {
            this.field_Qb = (rk[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var5), "og.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    og(long param0, mh param1, mh param2, mh param3, og[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        TextFont var10 = null;
        RuntimeException var10_ref = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        var16 = BrickABrac.field_J ? 1 : 0;
        this.field_Tb = -1;
        try {
          this.field_bc = param4;
          this.field_Ub = param5;
          this.field_fc = param7;
          this.field_cc = this.field_Ub.length;
          var10 = param3.field_O;
          this.field_dc = var10.descent + (var10.ascent + 2);
          this.field_Pb = this.field_dc * this.field_cc;
          this.field_Rb = 0;
          this.field_Qb = new rk[this.field_cc];
          var11 = "<col=999999>";
          var12 = "</col>";
          var13 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var13 >= this.field_cc))) {
            if (var16 == 0) {
              if (this.field_fc[var13] > 0) {
                param6[var13] = var11 + jm.a(true, this.field_fc[var13]).toUpperCase() + ": " + var12 + param6[var13];
              }
              var14 = null;
              if (null != this.field_bc[var13] ||
                this.field_Ub[var13] == -1) {
                var14 = uf.field_e;
              }
              this.field_Qb[var13] = new rk(0L, param2, (mh) null, param3, (RgbSprite) (var14), param6[var13]);
              this.a(this.field_Qb[var13], 0);
              var15 = var10.measureText(param6[var13]);
              if (var15 > this.field_Rb) {
                this.field_Rb = var15;
              }
              var13++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_Rb = this.field_Rb + (10 + uf.field_e.canvasWidth);
          }
          this.a(12, (byte) -81);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_25_0 = var10_ref;
          stackIn_25_1 = new StringBuilder().append("og.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param5 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param6 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param7 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final static void a(boolean param0, ResourceArchive param1) {
        RuntimeException stackIn_793_0 = null;
        StringBuilder stackIn_793_1 = null;
        String stackIn_794_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        byte[] var2Lifetime1;
        byte[] var2Lifetime2;
        byte[] var2Lifetime3;
        byte[] var2Lifetime4;
        byte[] var2Lifetime5;
        byte[] var2Lifetime6;
        byte[] var2Lifetime7;
        byte[] var2Lifetime8;
        byte[] var2Lifetime9;
        byte[] var2Lifetime10;
        byte[] var2Lifetime11;
        byte[] var2Lifetime12;
        byte[] var2Lifetime13;
        byte[] var2Lifetime14;
        byte[] var2Lifetime15;
        byte[] var2Lifetime16;
        byte[] var2Lifetime17;
        byte[] var2Lifetime18;
        byte[] var2Lifetime19;
        byte[] var2Lifetime20;
        byte[] var2Lifetime21;
        byte[] var2Lifetime22;
        byte[] var2Lifetime23;
        byte[] var2Lifetime24;
        byte[] var2Lifetime25;
        byte[] var2Lifetime26;
        byte[] var2Lifetime27;
        byte[] var2Lifetime28;
        byte[] var2Lifetime29;
        byte[] var2Lifetime30;
        byte[] var2Lifetime31;
        byte[] var2Lifetime32;
        byte[] var2Lifetime33;
        byte[] var2Lifetime34;
        byte[] var2Lifetime35;
        byte[] var2Lifetime36;
        byte[] var2Lifetime37;
        byte[] var2Lifetime38;
        byte[] var2Lifetime39;
        byte[] var2Lifetime40;
        byte[] var2Lifetime41;
        byte[] var2Lifetime42;
        byte[] var2Lifetime43;
        byte[] var2Lifetime44;
        byte[] var2Lifetime45;
        byte[] var2Lifetime46;
        byte[] var2Lifetime47;
        byte[] var2Lifetime48;
        byte[] var2Lifetime49;
        byte[] var2Lifetime50;
        byte[] var2Lifetime51;
        byte[] var2Lifetime52;
        byte[] var2Lifetime53;
        byte[] var2Lifetime54;
        byte[] var2Lifetime55;
        byte[] var2Lifetime56;
        byte[] var2Lifetime57;
        byte[] var2Lifetime58;
        byte[] var2Lifetime59;
        byte[] var2Lifetime60;
        byte[] var2Lifetime61;
        byte[] var2Lifetime62;
        byte[] var2Lifetime63;
        byte[] var2Lifetime64;
        byte[] var2Lifetime65;
        byte[] var2Lifetime66;
        byte[] var2Lifetime67;
        byte[] var2Lifetime68;
        byte[] var2Lifetime69;
        byte[] var2Lifetime70;
        byte[] var2Lifetime71;
        byte[] var2Lifetime72;
        byte[] var2Lifetime73;
        byte[] var2Lifetime74;
        byte[] var2Lifetime75;
        byte[] var2Lifetime76;
        byte[] var2Lifetime77;
        byte[] var2Lifetime78;
        byte[] var2Lifetime79;
        byte[] var2Lifetime80;
        byte[] var2Lifetime81;
        byte[] var2Lifetime82;
        byte[] var2Lifetime83;
        byte[] var2Lifetime84;
        byte[] var2Lifetime85;
        byte[] var2Lifetime86;
        byte[] var2Lifetime87;
        byte[] var2Lifetime88;
        byte[] var2Lifetime89;
        byte[] var2Lifetime90;
        byte[] var2Lifetime91;
        byte[] var2Lifetime92;
        byte[] var2Lifetime93;
        byte[] var2Lifetime94;
        byte[] var2Lifetime95;
        byte[] var2Lifetime96;
        byte[] var2Lifetime97;
        byte[] var2Lifetime98;
        byte[] var2Lifetime99;
        byte[] var2Lifetime100;
        byte[] var2Lifetime101;
        byte[] var2Lifetime102;
        byte[] var2Lifetime103;
        byte[] var2Lifetime104;
        byte[] var2Lifetime105;
        byte[] var2Lifetime106;
        byte[] var2Lifetime107;
        byte[] var2Lifetime108;
        byte[] var2Lifetime109;
        byte[] var2Lifetime110;
        byte[] var2Lifetime111;
        byte[] var2Lifetime112;
        byte[] var2Lifetime113;
        byte[] var2Lifetime114;
        byte[] var2Lifetime115;
        byte[] var2Lifetime116;
        byte[] var2Lifetime117;
        byte[] var2Lifetime118;
        byte[] var2Lifetime119;
        byte[] var2Lifetime120;
        byte[] var2Lifetime121;
        byte[] var2Lifetime122;
        byte[] var2Lifetime123;
        byte[] var2Lifetime124;
        byte[] var2Lifetime125;
        byte[] var2Lifetime126;
        byte[] var2Lifetime127;
        byte[] var2Lifetime128;
        byte[] var2Lifetime129;
        byte[] var2Lifetime130;
        byte[] var2Lifetime131;
        byte[] var2Lifetime132;
        byte[] var2Lifetime133;
        byte[] var2Lifetime134;
        byte[] var2Lifetime135;
        byte[] var2Lifetime136;
        byte[] var2Lifetime137;
        byte[] var2Lifetime138;
        byte[] var2Lifetime139;
        byte[] var2Lifetime140;
        byte[] var2Lifetime141;
        byte[] var2Lifetime142;
        byte[] var2Lifetime143;
        byte[] var2Lifetime144;
        byte[] var2Lifetime145;
        byte[] var2Lifetime146;
        byte[] var2Lifetime147;
        byte[] var2Lifetime148;
        byte[] var2Lifetime149;
        byte[] var2Lifetime150;
        byte[] var2Lifetime151;
        byte[] var2Lifetime152;
        byte[] var2Lifetime153;
        byte[] var2Lifetime154;
        byte[] var2Lifetime155;
        byte[] var2Lifetime156;
        byte[] var2Lifetime157;
        byte[] var2Lifetime158;
        byte[] var2Lifetime159;
        byte[] var2Lifetime160;
        byte[] var2Lifetime161;
        byte[] var2Lifetime162;
        byte[] var2Lifetime163;
        byte[] var2Lifetime164;
        byte[] var2Lifetime165;
        byte[] var2Lifetime166;
        byte[] var2Lifetime167;
        byte[] var2Lifetime168;
        byte[] var2Lifetime169;
        byte[] var2Lifetime170;
        byte[] var2Lifetime171;
        byte[] var2Lifetime172;
        byte[] var2Lifetime173;
        byte[] var2Lifetime174;
        byte[] var2Lifetime175;
        byte[] var2Lifetime176;
        byte[] var2Lifetime177;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          SaveResultsPromptScreen.field_t = param1;
          var2 = gr.a(true, "text_game_name");
          if (null != var2) {
            MenuButton.a(var2, (byte) 71);
          }
          var2Lifetime1 = gr.a(true, "expansion_text,0");
          if (var2Lifetime1 != null) {
            SaveResultsPromptScreen.field_u[0] = MenuButton.a(var2Lifetime1, (byte) 116);
          }
          var2Lifetime2 = gr.a(true, "expansion_text,1");
          if (null != var2Lifetime2) {
            SaveResultsPromptScreen.field_u[1] = MenuButton.a(var2Lifetime2, (byte) 118);
          }
          var2Lifetime3 = gr.a(true, "expansion_text,2");
          if (var2Lifetime3 != null) {
            SaveResultsPromptScreen.field_u[2] = MenuButton.a(var2Lifetime3, (byte) 115);
          }
          var2Lifetime4 = gr.a(true, "expansion_text,3");
          if (null != var2Lifetime4) {
            SaveResultsPromptScreen.field_u[3] = MenuButton.a(var2Lifetime4, (byte) 91);
          }
          var2Lifetime5 = gr.a(true, "expansion_text,4");
          if (null != var2Lifetime5) {
            SaveResultsPromptScreen.field_u[4] = MenuButton.a(var2Lifetime5, (byte) 101);
          }
          var2Lifetime6 = gr.a(true, "expansion_installed");
          if (var2Lifetime6 != null) {
            RasterSnapshot.field_s = MenuButton.a(var2Lifetime6, (byte) 115);
          }
          var2Lifetime7 = gr.a(true, "achievement_names,0");
          if (var2Lifetime7 != null) {
            AchievementBrowserScreen.field_s[0] = MenuButton.a(var2Lifetime7, (byte) 114);
          }
          var2Lifetime8 = gr.a(true, "achievement_names,1");
          if (null != var2Lifetime8) {
            AchievementBrowserScreen.field_s[1] = MenuButton.a(var2Lifetime8, (byte) 72);
          }
          var2Lifetime9 = gr.a(true, "achievement_names,2");
          if (var2Lifetime9 != null) {
            AchievementBrowserScreen.field_s[2] = MenuButton.a(var2Lifetime9, (byte) 97);
          }
          var2Lifetime10 = gr.a(true, "achievement_names,3");
          if (null != var2Lifetime10) {
            AchievementBrowserScreen.field_s[3] = MenuButton.a(var2Lifetime10, (byte) 108);
          }
          var2Lifetime11 = gr.a(true, "achievement_names,4");
          if (null != var2Lifetime11) {
            AchievementBrowserScreen.field_s[4] = MenuButton.a(var2Lifetime11, (byte) 88);
          }
          var2Lifetime12 = gr.a(true, "achievement_names,5");
          if (null != var2Lifetime12) {
            AchievementBrowserScreen.field_s[5] = MenuButton.a(var2Lifetime12, (byte) 124);
          }
          var2Lifetime13 = gr.a(true, "achievement_names,6");
          if (null != var2Lifetime13) {
            AchievementBrowserScreen.field_s[6] = MenuButton.a(var2Lifetime13, (byte) 90);
          }
          var2Lifetime14 = gr.a(true, "achievement_names,7");
          if (var2Lifetime14 != null) {
            AchievementBrowserScreen.field_s[7] = MenuButton.a(var2Lifetime14, (byte) 115);
          }
          var2Lifetime15 = gr.a(true, "achievement_names,8");
          if (null != var2Lifetime15) {
            AchievementBrowserScreen.field_s[8] = MenuButton.a(var2Lifetime15, (byte) 99);
          }
          var2Lifetime16 = gr.a(true, "achievement_names,9");
          if (var2Lifetime16 != null) {
            AchievementBrowserScreen.field_s[9] = MenuButton.a(var2Lifetime16, (byte) 94);
          }
          var2Lifetime17 = gr.a(!param0, "achievement_names,10");
          if (var2Lifetime17 != null) {
            AchievementBrowserScreen.field_s[10] = MenuButton.a(var2Lifetime17, (byte) 114);
          }
          var2Lifetime18 = gr.a(!param0, "achievement_names,11");
          if (var2Lifetime18 != null) {
            AchievementBrowserScreen.field_s[11] = MenuButton.a(var2Lifetime18, (byte) 97);
          }
          var2Lifetime19 = gr.a(!param0, "achievement_names,12");
          if (null != var2Lifetime19) {
            AchievementBrowserScreen.field_s[12] = MenuButton.a(var2Lifetime19, (byte) 121);
          }
          var2Lifetime20 = gr.a(true, "achievement_names,13");
          if (var2Lifetime20 != null) {
            AchievementBrowserScreen.field_s[13] = MenuButton.a(var2Lifetime20, (byte) 77);
          }
          var2Lifetime21 = gr.a(true, "achievement_names,14");
          if (var2Lifetime21 != null) {
            AchievementBrowserScreen.field_s[14] = MenuButton.a(var2Lifetime21, (byte) 100);
          }
          var2Lifetime22 = gr.a(true, "achievement_names,15");
          if (null != var2Lifetime22) {
            AchievementBrowserScreen.field_s[15] = MenuButton.a(var2Lifetime22, (byte) 97);
          }
          var2Lifetime23 = gr.a(true, "achievement_names,16");
          if (var2Lifetime23 != null) {
            AchievementBrowserScreen.field_s[16] = MenuButton.a(var2Lifetime23, (byte) 83);
          }
          var2Lifetime24 = gr.a(true, "achievement_names,17");
          if (null != var2Lifetime24) {
            AchievementBrowserScreen.field_s[17] = MenuButton.a(var2Lifetime24, (byte) 85);
          }
          var2Lifetime25 = gr.a(true, "achievement_names,18");
          if (null != var2Lifetime25) {
            AchievementBrowserScreen.field_s[18] = MenuButton.a(var2Lifetime25, (byte) 79);
          }
          var2Lifetime26 = gr.a(true, "achievement_names,19");
          if (null != var2Lifetime26) {
            AchievementBrowserScreen.field_s[19] = MenuButton.a(var2Lifetime26, (byte) 118);
          }
          var2Lifetime27 = gr.a(true, "achievement_names,20");
          if (var2Lifetime27 != null) {
            AchievementBrowserScreen.field_s[20] = MenuButton.a(var2Lifetime27, (byte) 124);
          }
          var2Lifetime28 = gr.a(true, "achievement_names,21");
          if (null != var2Lifetime28) {
            AchievementBrowserScreen.field_s[21] = MenuButton.a(var2Lifetime28, (byte) 122);
          }
          var2Lifetime29 = gr.a(true, "achievement_names,22");
          if (var2Lifetime29 != null) {
            AchievementBrowserScreen.field_s[22] = MenuButton.a(var2Lifetime29, (byte) 79);
          }
          var2Lifetime30 = gr.a(true, "achievement_names,23");
          if (null != var2Lifetime30) {
            AchievementBrowserScreen.field_s[23] = MenuButton.a(var2Lifetime30, (byte) 105);
          }
          var2Lifetime31 = gr.a(!param0, "achievement_names,24");
          if (null != var2Lifetime31) {
            AchievementBrowserScreen.field_s[24] = MenuButton.a(var2Lifetime31, (byte) 94);
          }
          var2Lifetime32 = gr.a(!param0, "achievement_names,25");
          if (var2Lifetime32 != null) {
            AchievementBrowserScreen.field_s[25] = MenuButton.a(var2Lifetime32, (byte) 76);
          }
          var2Lifetime33 = gr.a(true, "achievement_names,26");
          if (null != var2Lifetime33) {
            AchievementBrowserScreen.field_s[26] = MenuButton.a(var2Lifetime33, (byte) 115);
          }
          var2Lifetime34 = gr.a(true, "achievement_names,27");
          if (null != var2Lifetime34) {
            AchievementBrowserScreen.field_s[27] = MenuButton.a(var2Lifetime34, (byte) 118);
          }
          var2Lifetime35 = gr.a(true, "achievement_names,28");
          if (null != var2Lifetime35) {
            AchievementBrowserScreen.field_s[28] = MenuButton.a(var2Lifetime35, (byte) 86);
          }
          var2Lifetime36 = gr.a(!param0, "achievement_names,29");
          if (null != var2Lifetime36) {
            AchievementBrowserScreen.field_s[29] = MenuButton.a(var2Lifetime36, (byte) 72);
          }
          var2Lifetime37 = gr.a(true, "achievement_names,30");
          if (var2Lifetime37 != null) {
            AchievementBrowserScreen.field_s[30] = MenuButton.a(var2Lifetime37, (byte) 118);
          }
          if (param0) {
            og.h(67);
          }
          var2Lifetime38 = gr.a(true, "achievement_names,31");
          if (var2Lifetime38 != null) {
            AchievementBrowserScreen.field_s[31] = MenuButton.a(var2Lifetime38, (byte) 85);
          }
          var2Lifetime39 = gr.a(true, "achievement_names,32");
          if (var2Lifetime39 != null) {
            AchievementBrowserScreen.field_s[32] = MenuButton.a(var2Lifetime39, (byte) 89);
          }
          var2Lifetime40 = gr.a(!param0, "achievement_names,33");
          if (var2Lifetime40 != null) {
            AchievementBrowserScreen.field_s[33] = MenuButton.a(var2Lifetime40, (byte) 108);
          }
          var2Lifetime41 = gr.a(true, "achievement_names,34");
          if (var2Lifetime41 != null) {
            AchievementBrowserScreen.field_s[34] = MenuButton.a(var2Lifetime41, (byte) 111);
          }
          var2Lifetime42 = gr.a(true, "achievement_names,35");
          if (var2Lifetime42 != null) {
            AchievementBrowserScreen.field_s[35] = MenuButton.a(var2Lifetime42, (byte) 78);
          }
          var2Lifetime43 = gr.a(true, "achievement_names,36");
          if (var2Lifetime43 != null) {
            AchievementBrowserScreen.field_s[36] = MenuButton.a(var2Lifetime43, (byte) 75);
          }
          var2Lifetime44 = gr.a(!param0, "achievement_names,37");
          if (var2Lifetime44 != null) {
            AchievementBrowserScreen.field_s[37] = MenuButton.a(var2Lifetime44, (byte) 71);
          }
          var2Lifetime45 = gr.a(true, "achievement_names,38");
          if (null != var2Lifetime45) {
            AchievementBrowserScreen.field_s[38] = MenuButton.a(var2Lifetime45, (byte) 120);
          }
          var2Lifetime46 = gr.a(true, "achievement_names,39");
          if (var2Lifetime46 != null) {
            AchievementBrowserScreen.field_s[39] = MenuButton.a(var2Lifetime46, (byte) 117);
          }
          var2Lifetime47 = gr.a(true, "achievement_names,40");
          if (var2Lifetime47 != null) {
            AchievementBrowserScreen.field_s[40] = MenuButton.a(var2Lifetime47, (byte) 95);
          }
          var2Lifetime48 = gr.a(true, "achievement_names,41");
          if (var2Lifetime48 != null) {
            AchievementBrowserScreen.field_s[41] = MenuButton.a(var2Lifetime48, (byte) 75);
          }
          var2Lifetime49 = gr.a(!param0, "achievement_criteria,0");
          if (var2Lifetime49 != null) {
            mp.field_bc[0] = MenuButton.a(var2Lifetime49, (byte) 95);
          }
          var2Lifetime50 = gr.a(true, "achievement_criteria,1");
          if (null != var2Lifetime50) {
            mp.field_bc[1] = MenuButton.a(var2Lifetime50, (byte) 109);
          }
          var2Lifetime51 = gr.a(!param0, "achievement_criteria,2");
          if (null != var2Lifetime51) {
            mp.field_bc[2] = MenuButton.a(var2Lifetime51, (byte) 100);
          }
          var2Lifetime52 = gr.a(true, "achievement_criteria,3");
          if (var2Lifetime52 != null) {
            mp.field_bc[3] = MenuButton.a(var2Lifetime52, (byte) 92);
          }
          var2Lifetime53 = gr.a(!param0, "achievement_criteria,4");
          if (null != var2Lifetime53) {
            mp.field_bc[4] = MenuButton.a(var2Lifetime53, (byte) 106);
          }
          var2Lifetime54 = gr.a(true, "achievement_criteria,5");
          if (null != var2Lifetime54) {
            mp.field_bc[5] = MenuButton.a(var2Lifetime54, (byte) 127);
          }
          var2Lifetime55 = gr.a(!param0, "achievement_criteria,6");
          if (var2Lifetime55 != null) {
            mp.field_bc[6] = MenuButton.a(var2Lifetime55, (byte) 116);
          }
          var2Lifetime56 = gr.a(true, "achievement_criteria,7");
          if (var2Lifetime56 != null) {
            mp.field_bc[7] = MenuButton.a(var2Lifetime56, (byte) 70);
          }
          var2Lifetime57 = gr.a(true, "achievement_criteria,8");
          if (null != var2Lifetime57) {
            mp.field_bc[8] = MenuButton.a(var2Lifetime57, (byte) 112);
          }
          var2Lifetime58 = gr.a(true, "achievement_criteria,9");
          if (var2Lifetime58 != null) {
            mp.field_bc[9] = MenuButton.a(var2Lifetime58, (byte) 76);
          }
          var2Lifetime59 = gr.a(true, "achievement_criteria,10");
          if (var2Lifetime59 != null) {
            mp.field_bc[10] = MenuButton.a(var2Lifetime59, (byte) 99);
          }
          var2Lifetime60 = gr.a(true, "achievement_criteria,11");
          if (null != var2Lifetime60) {
            mp.field_bc[11] = MenuButton.a(var2Lifetime60, (byte) 78);
          }
          var2Lifetime61 = gr.a(true, "achievement_criteria,12");
          if (null != var2Lifetime61) {
            mp.field_bc[12] = MenuButton.a(var2Lifetime61, (byte) 91);
          }
          var2Lifetime62 = gr.a(!param0, "achievement_criteria,13");
          if (var2Lifetime62 != null) {
            mp.field_bc[13] = MenuButton.a(var2Lifetime62, (byte) 92);
          }
          var2Lifetime63 = gr.a(!param0, "achievement_criteria,14");
          if (var2Lifetime63 != null) {
            mp.field_bc[14] = MenuButton.a(var2Lifetime63, (byte) 107);
          }
          var2Lifetime64 = gr.a(true, "achievement_criteria,15");
          if (null != var2Lifetime64) {
            mp.field_bc[15] = MenuButton.a(var2Lifetime64, (byte) 125);
          }
          var2Lifetime65 = gr.a(true, "achievement_criteria,16");
          if (null != var2Lifetime65) {
            mp.field_bc[16] = MenuButton.a(var2Lifetime65, (byte) 101);
          }
          var2Lifetime66 = gr.a(true, "achievement_criteria,17");
          if (null != var2Lifetime66) {
            mp.field_bc[17] = MenuButton.a(var2Lifetime66, (byte) 92);
          }
          var2Lifetime67 = gr.a(true, "achievement_criteria,18");
          if (null != var2Lifetime67) {
            mp.field_bc[18] = MenuButton.a(var2Lifetime67, (byte) 74);
          }
          var2Lifetime68 = gr.a(true, "achievement_criteria,19");
          if (var2Lifetime68 != null) {
            mp.field_bc[19] = MenuButton.a(var2Lifetime68, (byte) 121);
          }
          var2Lifetime69 = gr.a(!param0, "achievement_criteria,20");
          if (var2Lifetime69 != null) {
            mp.field_bc[20] = MenuButton.a(var2Lifetime69, (byte) 89);
          }
          var2Lifetime70 = gr.a(true, "achievement_criteria,21");
          if (null != var2Lifetime70) {
            mp.field_bc[21] = MenuButton.a(var2Lifetime70, (byte) 106);
          }
          var2Lifetime71 = gr.a(true, "achievement_criteria,22");
          if (var2Lifetime71 != null) {
            mp.field_bc[22] = MenuButton.a(var2Lifetime71, (byte) 81);
          }
          var2Lifetime72 = gr.a(true, "achievement_criteria,23");
          if (var2Lifetime72 != null) {
            mp.field_bc[23] = MenuButton.a(var2Lifetime72, (byte) 122);
          }
          var2Lifetime73 = gr.a(true, "achievement_criteria,24");
          if (null != var2Lifetime73) {
            mp.field_bc[24] = MenuButton.a(var2Lifetime73, (byte) 77);
          }
          var2Lifetime74 = gr.a(true, "achievement_criteria,25");
          if (null != var2Lifetime74) {
            mp.field_bc[25] = MenuButton.a(var2Lifetime74, (byte) 102);
          }
          var2Lifetime75 = gr.a(!param0, "achievement_criteria,26");
          if (null != var2Lifetime75) {
            mp.field_bc[26] = MenuButton.a(var2Lifetime75, (byte) 124);
          }
          var2Lifetime76 = gr.a(!param0, "achievement_criteria,27");
          if (var2Lifetime76 != null) {
            mp.field_bc[27] = MenuButton.a(var2Lifetime76, (byte) 79);
          }
          var2Lifetime77 = gr.a(!param0, "achievement_criteria,28");
          if (var2Lifetime77 != null) {
            mp.field_bc[28] = MenuButton.a(var2Lifetime77, (byte) 81);
          }
          var2Lifetime78 = gr.a(true, "achievement_criteria,29");
          if (null != var2Lifetime78) {
            mp.field_bc[29] = MenuButton.a(var2Lifetime78, (byte) 72);
          }
          var2Lifetime79 = gr.a(true, "achievement_criteria,30");
          if (var2Lifetime79 != null) {
            mp.field_bc[30] = MenuButton.a(var2Lifetime79, (byte) 115);
          }
          var2Lifetime80 = gr.a(true, "achievement_criteria,31");
          if (var2Lifetime80 != null) {
            mp.field_bc[31] = MenuButton.a(var2Lifetime80, (byte) 110);
          }
          var2Lifetime81 = gr.a(!param0, "achievement_criteria,32");
          if (var2Lifetime81 != null) {
            mp.field_bc[32] = MenuButton.a(var2Lifetime81, (byte) 124);
          }
          var2Lifetime82 = gr.a(true, "achievement_criteria,33");
          if (null != var2Lifetime82) {
            mp.field_bc[33] = MenuButton.a(var2Lifetime82, (byte) 85);
          }
          var2Lifetime83 = gr.a(true, "achievement_criteria,34");
          if (var2Lifetime83 != null) {
            mp.field_bc[34] = MenuButton.a(var2Lifetime83, (byte) 72);
          }
          var2Lifetime84 = gr.a(true, "achievement_criteria,35");
          if (null != var2Lifetime84) {
            mp.field_bc[35] = MenuButton.a(var2Lifetime84, (byte) 72);
          }
          var2Lifetime85 = gr.a(true, "achievement_criteria,36");
          if (var2Lifetime85 != null) {
            mp.field_bc[36] = MenuButton.a(var2Lifetime85, (byte) 126);
          }
          var2Lifetime86 = gr.a(true, "achievement_criteria,37");
          if (null != var2Lifetime86) {
            mp.field_bc[37] = MenuButton.a(var2Lifetime86, (byte) 94);
          }
          var2Lifetime87 = gr.a(!param0, "achievement_criteria,38");
          if (var2Lifetime87 != null) {
            mp.field_bc[38] = MenuButton.a(var2Lifetime87, (byte) 114);
          }
          var2Lifetime88 = gr.a(!param0, "achievement_criteria,39");
          if (var2Lifetime88 != null) {
            mp.field_bc[39] = MenuButton.a(var2Lifetime88, (byte) 98);
          }
          var2Lifetime89 = gr.a(true, "achievement_criteria,40");
          if (null != var2Lifetime89) {
            mp.field_bc[40] = MenuButton.a(var2Lifetime89, (byte) 125);
          }
          var2Lifetime90 = gr.a(true, "achievement_criteria,41");
          if (var2Lifetime90 != null) {
            mp.field_bc[41] = MenuButton.a(var2Lifetime90, (byte) 86);
          }
          var2Lifetime91 = gr.a(true, "achievement_obtained");
          if (var2Lifetime91 != null) {
            MenuButton.a(var2Lifetime91, (byte) 89);
          }
          var2Lifetime92 = gr.a(true, "gameoptlabels,0");
          if (var2Lifetime92 != null) {
            HighscorePackSelector.field_d[0] = MenuButton.a(var2Lifetime92, (byte) 111);
          }
          var2Lifetime93 = gr.a(!param0, "gameoptnames,0,0");
          if (null != var2Lifetime93) {
            PlayerBoard.field_jb[0][0] = MenuButton.a(var2Lifetime93, (byte) 87);
          }
          var2Lifetime94 = gr.a(true, "gameoptnames,0,1");
          if (var2Lifetime94 != null) {
            PlayerBoard.field_jb[0][1] = MenuButton.a(var2Lifetime94, (byte) 101);
          }
          var2Lifetime95 = gr.a(true, "gameoptnames,0,2");
          if (null != var2Lifetime95) {
            PlayerBoard.field_jb[0][2] = MenuButton.a(var2Lifetime95, (byte) 120);
          }
          var2Lifetime96 = gr.a(!param0, "gameoptnames,0,3");
          if (null != var2Lifetime96) {
            PlayerBoard.field_jb[0][3] = MenuButton.a(var2Lifetime96, (byte) 112);
          }
          var2Lifetime97 = gr.a(true, "player_one");
          if (null != var2Lifetime97) {
            we.field_c = MenuButton.a(var2Lifetime97, (byte) 74);
          }
          var2Lifetime98 = gr.a(true, "player_two");
          if (null != var2Lifetime98) {
            pg.field_q = MenuButton.a(var2Lifetime98, (byte) 76);
          }
          var2Lifetime99 = gr.a(true, "end_of_free");
          if (null != var2Lifetime99) {
            MenuButton.a(var2Lifetime99, (byte) 114);
          }
          var2Lifetime100 = gr.a(true, "end_of_paid");
          if (null != var2Lifetime100) {
            mo.field_N = MenuButton.a(var2Lifetime100, (byte) 125);
          }
          var2Lifetime101 = gr.a(true, "game_drawn");
          if (var2Lifetime101 != null) {
            MenuButton.a(var2Lifetime101, (byte) 99);
          }
          var2Lifetime102 = gr.a(true, "resigned");
          if (var2Lifetime102 != null) {
            t.field_h = MenuButton.a(var2Lifetime102, (byte) 107);
          }
          var2Lifetime103 = gr.a(!param0, "blank_colon_blank");
          if (null != var2Lifetime103) {
            BrickABrac.field_H = MenuButton.a(var2Lifetime103, (byte) 112);
          }
          var2Lifetime104 = gr.a(true, "n_of_m");
          if (null != var2Lifetime104) {
            rm.field_e = MenuButton.a(var2Lifetime104, (byte) 85);
          }
          var2Lifetime105 = gr.a(!param0, "n_of_unlimited");
          if (null != var2Lifetime105) {
            MouseInput.field_a = MenuButton.a(var2Lifetime105, (byte) 112);
          }
          var2Lifetime106 = gr.a(!param0, "plus_something");
          if (var2Lifetime106 != null) {
            hh.field_e = MenuButton.a(var2Lifetime106, (byte) 84);
          }
          var2Lifetime107 = gr.a(true, "ellipsis");
          if (var2Lifetime107 != null) {
            MenuButton.a(var2Lifetime107, (byte) 126);
          }
          var2Lifetime108 = gr.a(true, "go_exclaim");
          if (var2Lifetime108 != null) {
            SecondaryNodeQueue.field_c = MenuButton.a(var2Lifetime108, (byte) 77);
          }
          var2Lifetime109 = gr.a(!param0, "cool");
          if (null != var2Lifetime109) {
            qi.field_N = MenuButton.a(var2Lifetime109, (byte) 95);
          }
          var2Lifetime110 = gr.a(true, "awesome");
          if (null != var2Lifetime110) {
            bg.field_o = MenuButton.a(var2Lifetime110, (byte) 107);
          }
          var2Lifetime111 = gr.a(true, "neat");
          if (null != var2Lifetime111) {
            MonotonicTime.field_a = MenuButton.a(var2Lifetime111, (byte) 127);
          }
          var2Lifetime112 = gr.a(true, "nice");
          if (var2Lifetime112 != null) {
            eb.field_m = MenuButton.a(var2Lifetime112, (byte) 72);
          }
          var2Lifetime113 = gr.a(true, "genius");
          if (var2Lifetime113 != null) {
            ch.field_j = MenuButton.a(var2Lifetime113, (byte) 123);
          }
          var2Lifetime114 = gr.a(true, "well_done");
          if (var2Lifetime114 != null) {
            vg.field_a = MenuButton.a(var2Lifetime114, (byte) 78);
          }
          var2Lifetime115 = gr.a(!param0, "sweet");
          if (var2Lifetime115 != null) {
            nk.field_f = MenuButton.a(var2Lifetime115, (byte) 81);
          }
          var2Lifetime116 = gr.a(true, "ninja_skills");
          if (var2Lifetime116 != null) {
            tm.field_h = MenuButton.a(var2Lifetime116, (byte) 123);
          }
          var2Lifetime117 = gr.a(true, "oh_no");
          if (null != var2Lifetime117) {
            ag.field_C = MenuButton.a(var2Lifetime117, (byte) 81);
          }
          var2Lifetime118 = gr.a(true, "oh_dear");
          if (null != var2Lifetime118) {
            bh.field_ub = MenuButton.a(var2Lifetime118, (byte) 89);
          }
          var2Lifetime119 = gr.a(!param0, "curses");
          if (var2Lifetime119 != null) {
            qo.field_P = MenuButton.a(var2Lifetime119, (byte) 97);
          }
          var2Lifetime120 = gr.a(true, "crumbs");
          if (null != var2Lifetime120) {
            bq.field_f = MenuButton.a(var2Lifetime120, (byte) 77);
          }
          var2Lifetime121 = gr.a(!param0, "good_grief");
          if (var2Lifetime121 != null) {
            jh.field_c = MenuButton.a(var2Lifetime121, (byte) 82);
          }
          var2Lifetime122 = gr.a(true, "instructions_pages,0");
          if (null != var2Lifetime122) {
            gh.field_b[0] = MenuButton.a(var2Lifetime122, (byte) 95);
          }
          var2Lifetime123 = gr.a(true, "instructions_pages,1");
          if (var2Lifetime123 != null) {
            gh.field_b[1] = MenuButton.a(var2Lifetime123, (byte) 78);
          }
          var2Lifetime124 = gr.a(true, "instructions_pages,2");
          if (var2Lifetime124 != null) {
            gh.field_b[2] = MenuButton.a(var2Lifetime124, (byte) 97);
          }
          var2Lifetime125 = gr.a(!param0, "instructions_pages,3");
          if (null != var2Lifetime125) {
            gh.field_b[3] = MenuButton.a(var2Lifetime125, (byte) 77);
          }
          var2Lifetime126 = gr.a(true, "instructions_pages,4");
          if (null != var2Lifetime126) {
            gh.field_b[4] = MenuButton.a(var2Lifetime126, (byte) 76);
          }
          var2Lifetime127 = gr.a(true, "settings_label");
          if (var2Lifetime127 != null) {
            hk.field_L = MenuButton.a(var2Lifetime127, (byte) 107);
          }
          var2Lifetime128 = gr.a(true, "continue_label");
          if (var2Lifetime128 != null) {
            t.field_c = MenuButton.a(var2Lifetime128, (byte) 94);
          }
          var2Lifetime129 = gr.a(true, "level_select_label");
          if (var2Lifetime129 != null) {
            f.field_b = MenuButton.a(var2Lifetime129, (byte) 88);
          }
          var2Lifetime130 = gr.a(true, "tutorial_label");
          if (null != var2Lifetime130) {
            gj.field_d = MenuButton.a(var2Lifetime130, (byte) 111);
          }
          var2Lifetime131 = gr.a(true, "rematch_label");
          if (null != var2Lifetime131) {
            kk.field_a = MenuButton.a(var2Lifetime131, (byte) 72);
          }
          var2Lifetime132 = gr.a(!param0, "test_error_message");
          if (var2Lifetime132 != null) {
            MenuButton.a(var2Lifetime132, (byte) 123);
          }
          var2Lifetime133 = gr.a(!param0, "name");
          if (null != var2Lifetime133) {
            DualLinkIterator.field_i = MenuButton.a(var2Lifetime133, (byte) 79);
          }
          var2Lifetime134 = gr.a(true, "from_level");
          if (var2Lifetime134 != null) {
            SpriteGeometry.field_u = MenuButton.a(var2Lifetime134, (byte) 80);
          }
          var2Lifetime135 = gr.a(true, "to_level");
          if (null != var2Lifetime135) {
            ba.field_u = MenuButton.a(var2Lifetime135, (byte) 120);
          }
          var2Lifetime136 = gr.a(!param0, "score");
          if (null != var2Lifetime136) {
            pj.field_d = MenuButton.a(var2Lifetime136, (byte) 85);
          }
          var2Lifetime137 = gr.a(true, "group_0");
          if (null != var2Lifetime137) {
            vh.field_T = MenuButton.a(var2Lifetime137, (byte) 79);
          }
          var2Lifetime138 = gr.a(!param0, "group_1");
          if (null != var2Lifetime138) {
            oc.field_u = MenuButton.a(var2Lifetime138, (byte) 73);
          }
          var2Lifetime139 = gr.a(true, "menu_level_label");
          if (var2Lifetime139 != null) {
            FramedMenuScreen.field_t = MenuButton.a(var2Lifetime139, (byte) 119);
          }
          var2Lifetime140 = gr.a(!param0, "please_select_a_level");
          if (null != var2Lifetime140) {
            oj.field_s = MenuButton.a(var2Lifetime140, (byte) 120);
          }
          var2Lifetime141 = gr.a(!param0, "world_select");
          if (var2Lifetime141 != null) {
            ki.field_o = MenuButton.a(var2Lifetime141, (byte) 104);
          }
          var2Lifetime142 = gr.a(true, "rated_membersonly");
          if (var2Lifetime142 != null) {
            MenuButton.a(var2Lifetime142, (byte) 90);
          }
          var2Lifetime143 = gr.a(true, "explain_close");
          if (null != var2Lifetime143) {
            ro.field_v = MenuButton.a(var2Lifetime143, (byte) 118);
          }
          var2Lifetime144 = gr.a(true, "explain_welcome");
          if (null != var2Lifetime144) {
            sb.field_d = MenuButton.a(var2Lifetime144, (byte) 78);
          }
          var2Lifetime145 = gr.a(true, "explain_lateral_move");
          if (var2Lifetime145 != null) {
            SaveResultsPromptScreen.field_y = MenuButton.a(var2Lifetime145, (byte) 73);
          }
          var2Lifetime146 = gr.a(true, "explain_launch");
          if (null != var2Lifetime146) {
            va.field_d = MenuButton.a(var2Lifetime146, (byte) 90);
          }
          var2Lifetime147 = gr.a(true, "explain_objective");
          if (null != var2Lifetime147) {
            KeyboardInput.field_b = MenuButton.a(var2Lifetime147, (byte) 99);
          }
          var2Lifetime148 = gr.a(true, "explain_powerup_bricks");
          if (null != var2Lifetime148) {
            o.field_a = MenuButton.a(var2Lifetime148, (byte) 89);
          }
          var2Lifetime149 = gr.a(true, "explain_first_release");
          if (null != var2Lifetime149) {
            tb.field_db = MenuButton.a(var2Lifetime149, (byte) 104);
          }
          var2Lifetime150 = gr.a(!param0, "explain_gauges_intercept");
          if (var2Lifetime150 != null) {
            IntNode.field_n = MenuButton.a(var2Lifetime150, (byte) 100);
          }
          var2Lifetime151 = gr.a(true, "explain_gauges_miss");
          if (var2Lifetime151 != null) {
            ByteStorage.field_c = MenuButton.a(var2Lifetime151, (byte) 98);
          }
          var2Lifetime152 = gr.a(true, "explain_gauges");
          if (var2Lifetime152 != null) {
            ui.field_b = MenuButton.a(var2Lifetime152, (byte) 75);
          }
          var2Lifetime153 = gr.a(true, "explain_fall_out");
          if (var2Lifetime153 != null) {
            kb.field_Tb = MenuButton.a(var2Lifetime153, (byte) 85);
          }
          var2Lifetime154 = gr.a(!param0, "explain_ball_charge");
          if (null != var2Lifetime154) {
            rh.field_a = MenuButton.a(var2Lifetime154, (byte) 126);
          }
          var2Lifetime155 = gr.a(true, "explain_hearts");
          if (null != var2Lifetime155) {
            bj.field_U = MenuButton.a(var2Lifetime155, (byte) 78);
          }
          var2Lifetime156 = gr.a(true, "explain_reverse");
          if (var2Lifetime156 != null) {
            sj.field_e = MenuButton.a(var2Lifetime156, (byte) 74);
          }
          var2Lifetime157 = gr.a(true, "explain_super");
          if (var2Lifetime157 != null) {
            tm.field_d = MenuButton.a(var2Lifetime157, (byte) 100);
          }
          var2Lifetime158 = gr.a(true, "explain_extra");
          if (var2Lifetime158 != null) {
            ef.field_c = MenuButton.a(var2Lifetime158, (byte) 101);
          }
          var2Lifetime159 = gr.a(!param0, "explain_distort");
          if (null != var2Lifetime159) {
            ch.field_i = MenuButton.a(var2Lifetime159, (byte) 121);
          }
          var2Lifetime160 = gr.a(true, "explain_shrink");
          if (null != var2Lifetime160) {
            AppletGameShell.field_f = MenuButton.a(var2Lifetime160, (byte) 112);
          }
          var2Lifetime161 = gr.a(true, "explain_trampoline");
          if (var2Lifetime161 != null) {
            PauseMenuScreen.field_v = MenuButton.a(var2Lifetime161, (byte) 85);
          }
          var2Lifetime162 = gr.a(true, "explain_wipeout");
          if (null != var2Lifetime162) {
            mk.field_a = MenuButton.a(var2Lifetime162, (byte) 100);
          }
          var2Lifetime163 = gr.a(!param0, "explain_multiball");
          if (null != var2Lifetime163) {
            eh.field_d = MenuButton.a(var2Lifetime163, (byte) 90);
          }
          var2Lifetime164 = gr.a(true, "explain_speedup");
          if (var2Lifetime164 != null) {
            tn.field_w = MenuButton.a(var2Lifetime164, (byte) 99);
          }
          var2Lifetime165 = gr.a(true, "explain_control");
          if (null != var2Lifetime165) {
            uo.field_b = MenuButton.a(var2Lifetime165, (byte) 97);
          }
          var2Lifetime166 = gr.a(true, "explain_slowdown");
          if (null != var2Lifetime166) {
            TimedSplashScreen.field_s = MenuButton.a(var2Lifetime166, (byte) 83);
          }
          var2Lifetime167 = gr.a(true, "explain_sticky");
          if (var2Lifetime167 != null) {
            vh.field_V = MenuButton.a(var2Lifetime167, (byte) 114);
          }
          var2Lifetime168 = gr.a(true, "explain_unsuper_ball");
          if (null != var2Lifetime168) {
            MatchCompleteScreen.field_F = MenuButton.a(var2Lifetime168, (byte) 73);
          }
          var2Lifetime169 = gr.a(true, "explain_extra_bricks");
          if (var2Lifetime169 != null) {
            dc.field_d = MenuButton.a(var2Lifetime169, (byte) 111);
          }
          var2Lifetime170 = gr.a(true, "explain_grow");
          if (var2Lifetime170 != null) {
            pq.field_q = MenuButton.a(var2Lifetime170, (byte) 102);
          }
          var2Lifetime171 = gr.a(true, "explain_plasma");
          if (null != var2Lifetime171) {
            GameScreen.field_g = MenuButton.a(var2Lifetime171, (byte) 92);
          }
          var2Lifetime172 = gr.a(!param0, "keycode_player0_left");
          if (var2Lifetime172 != null) {
            ac.field_f = var2Lifetime172[0] & 255;
          }
          var2Lifetime173 = gr.a(true, "keycode_player0_right");
          if (null != var2Lifetime173) {
            fq.field_b = var2Lifetime173[0] & 255;
          }
          var2Lifetime174 = gr.a(true, "keycode_player0_launch");
          if (var2Lifetime174 != null) {
            aq.field_e = var2Lifetime174[0] & 255;
          }
          var2Lifetime175 = gr.a(!param0, "keycode_player1_left");
          if (null != var2Lifetime175) {
            jl.field_b = 255 & var2Lifetime175[0];
          }
          var2Lifetime176 = gr.a(true, "keycode_player1_right");
          if (null != var2Lifetime176) {
            ce.field_d = 255 & var2Lifetime176[0];
          }
          var2Lifetime177 = gr.a(!param0, "keycode_player1_launch");
          SaveResultsPromptScreen.field_t = null;
          if (var2Lifetime177 != null) {
            td.field_u = var2Lifetime177[0] & 255;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_793_0 = var2_ref;
          stackIn_793_1 = new StringBuilder().append("og.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_794_2 = "null";
          } else {
            stackIn_794_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_793_0), ((StringBuilder) (Object) stackIn_793_1).append(stackIn_794_2).append(')').toString());
        }
        if (AppletGameShell.field_l != 0) {
          BrickABrac.field_J = (var3 == 0);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var7_intLifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_Xb = this.field_Rb + 2 * param4;
          this.a(this.field_Pb, -this.field_Pb + param2, param1, this.field_Xb, (byte) 64);
          if (param5 != this.field_Sb) {
            this.field_Sb = param5;
            this.a(this.field_ec, (byte) -81);
          }
          var7_int = param0;
          while (var7_int < this.field_cc) {
            this.field_Qb[var7_int].a(-10411, this.field_Qb[var7_int].field_zb, param4, param3, 0, this.field_dc, this.field_Xb);
            var7_int++;
            if (var9 != 0) {
              return;
            }
          }
          if (this.field_Tb != -1 &&
            this.field_bc[this.field_Tb] != null) {
            var7_intLifetime1 = this.field_bc[this.field_Tb].field_cc;
            var8 = this.field_zb + (var7_intLifetime1 + this.field_Tb) * this.field_dc;
            while (param2 < var8) {
              var8 = var8 - this.field_dc;
              if (var9 != 0) {
                return;
              }
            }
            this.field_bc[this.field_Tb].a(0, this.field_Xb + param1, var8, param3, param4, this.field_Qb[this.field_Tb].field_db);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var7), "og.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 107) {
            field_gc = (ResourceArchive) null;
          }
          LevelPack.b(124);
          if (null != CacheIoRequest.field_D) {
            t.a(false, CacheIoRequest.field_D);
          }
          ic.disableKeyboardInput((byte) -79);
          FileCacheStore.a(5);
          GameplayAudioEvent.a(param0 + 14569);
          if (vg.a(param0 - 104)) {
            k.field_h.writeCipheredOpcode(-13413, 1);
            cr.a(0, 10000);
          }
          hn.a((byte) 53);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "og.K(" + param0 + ')');
        }
    }

    final boolean a(int param0, int param1, byte param2) {
        int stackIn_5_0 = 0;
        boolean stackIn_24_0 = false;
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_5_0 = (dc.currentKeyCode != 85) ? 0 : 1;
          var4_int = stackIn_5_0;
          if (this.field_Vb != null) {
            if (var4_int != 0 &&
              this.field_Vb.field_Tb == -1) {
              this.f((byte) 41);
              this.a(0, (byte) -81);
              return true;
            }
            stackIn_24_0 = this.field_Vb.a(param0, param1, (byte) -126);
            return stackIn_24_0;
          }
          if (this.field_Vb == null &&
            hd.field_a == this &&
            var4_int != 0) {
            rd.a(-1);
            return true;
          }
          if (param2 != -126) {
            this.field_Ub = (int[]) null;
          }
          boolean decompiledFrameCompleted0 = true;
          var5 = go.currentKeyCharacter;
          if (var5 > 0) {
            if (~wp.field_h == ~var5) {
              var5 = 63;
            }
            var6 = 0;
            while (var6 < this.field_fc.length) {
              stackIn_47_0 = var5;
              if (var7 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_47_0 == this.field_fc[var6]) {
                this.a(param1, var6, 0, param0);
                return true;
              }
              var6++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_47_0 = 0;
          }
          return stackIn_47_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var4), "og.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -57) {
            this.a(-64, -111, 97, -110, -124, 103);
          }
          stackIn_6_0 = this.field_Xb;
          if (null != this.field_Vb) {
            stackIn_7_1 = this.field_Vb.e((byte) -117);
          } else {
            stackIn_7_1 = 0;
          }
          stackIn_8_0 = stackIn_6_0 + stackIn_7_1;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var2), "og.G(" + param0 + ')');
        }
    }

    public static void d(boolean param0) {
        if (!param0) {
          return;
        }
        try {
          field_Yb = null;
          field_ac = null;
          field_gc = null;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "og.F(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, RgbSprite param3, int param4, int param5, int param6) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        int var16 = 0;
        try {
          param5 = param5 + param3.offsetX;
          param6 = param6 + param3.offsetY;
          var7_int = param5 + param6 * Rasterizer2D.width;
          var8 = param3.height;
          var9 = param3.height;
          var10 = param3.width;
          var11 = 0;
          var12 = -var10;
          var13 = 0;
          if (param0 > -111) {
            return;
          }
          var14 = param1 << 8;
          var15 = (param2 - param1 << 8) / var9;
          if (Rasterizer2D.clipTop > param6) {
            var16 = Rasterizer2D.clipTop - param6;
            param6 = Rasterizer2D.clipTop;
            var14 = var14 + var16 * var15;
            if (var16 < var9) {
              var8 = param3.pixels[var16];
            }
            var9 = var9 - var16;
            var7_int = var7_int + Rasterizer2D.width * var16;
          }
          if (var10 + param5 > Rasterizer2D.clipRight) {
            var13 = var13 - (var10 + param5 - Rasterizer2D.clipRight);
          }
          if (var9 + param6 > Rasterizer2D.clipBottom) {
            var9 = var9 - (-Rasterizer2D.clipBottom + var9 + param6);
          }
          if (param5 < Rasterizer2D.clipLeft) {
            var12 = var12 + (-param5 + Rasterizer2D.clipLeft);
          }
          if (var12 < var13 &&
            0 < var9) {
            kf.a(Rasterizer2D.pixels, var15, var13, var11, var9, var14, param3.pixels, var10, var12, var8, 8, param4, var7_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("og.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        field_ac = "Players";
    }
}
