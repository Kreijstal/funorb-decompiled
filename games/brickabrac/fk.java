/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private byte[] field_i;
    static String[] field_h;
    private int[] field_j;
    static NodeDeque field_f;
    static int field_g;
    static double field_b;
    static String field_c;
    private int[] field_a;
    static RgbSprite field_e;
    static String field_d;

    final static boolean a(mf param0, mf param1, mf param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1.a((byte) -127)) {
            return false;
          }
          if (!param1.a("commonui", -28138)) {
            return false;
          }
          if (param3 > -63) {
            return true;
          }
          if (param0.a((byte) -127) &&
            param0.a("commonui", -28138)) {
            if (param2.a((byte) -127) &&
              param2.a("button.gif", -28138)) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("fk.E(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        var2 = 0;
        var3 = MatchResultScreen.field_t;
        if (param1 != 77) {
          return;
        }
        if (var3 >= 5) {
          if (105 > var3) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (120 > var3) {
              var3 = 120 - var3;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            }
          }
        } else {
          var2 = var3 * (var3 * 8192) / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (4 == param0) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 6) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 7 ||
          param0 == 8) {
          var4 = -1;
          var5 = -1;
        }
        if (param0 == 11) {
          var4 = -1;
        }
        if (param0 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (13 == param0) {
          var5 = -1;
          var4 = 1;
        }
        if (param0 == 14) {
          var5 = 1;
          var4 = -1;
        }
        if (param0 == 15) {
          var4 = 1;
          var5 = 1;
        }
        MatchResultScreen.field_w = e.a(var4 * var2, 0, var2 * var5);
        return;
    }

    final static void a(int param0, og param1) {
        if (param1 == null) {
          return;
        }
        try {
          hd.field_a = param1;
          if (param0 != 105) {
            String var3 = (String) null;
            fk.a((byte) 84, (java.applet.Applet) null, (String) null, false);
          }
          wd.field_w.field_bb.clear((byte) -72);
          wd.field_w.a(hd.field_a, 0);
          TooltipSprite.field_p = true;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "fk.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
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
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = 0;
          param1 = param1 + param2;
          var8 = param4 << 3;
          while (true) {
            if (param2 >= param1) {
              if (param0 >= -91) {
                fk.a(-104, (byte) 88);
              }
              stackIn_22_0 = (7 + var8 >> 3) - param4;
              return stackIn_22_0;
            }
            var9 = param5[param2] & 255;
            var10 = this.field_a[var9];
            var11 = this.field_i[var9];
            if (var11 == 0) {
              throw new RuntimeException("" + var9);
            }
            var12 = var8 >> 3;
            var13 = var8 & 7;
            var7_int = var7_int & -var13 >> 31;
            var14 = var12 + (var13 + (var11 - 1) >> 3);
            var8 = var8 + var11;
            var13 += 24;
            dupTemp$0 = LevelSelectScreen.d(var7_int, var10 >>> var13);
            var7_int = dupTemp$0;
            param3[var12] = (byte)dupTemp$0;
            if (var14 > var12) {
              var12++;
              var13 -= 8;
              var7_int = var10 >>> var13;
              param3[var12] = (byte)(var10 >>> var13);
              if (var14 > var12) {
                var13 -= 8;
                var12++;
                var7_int = var10 >>> var13;
                param3[var12] = (byte)(var10 >>> var13);
                if (var12 < var14) {
                  var12++;
                  var13 -= 8;
                  var7_int = var10 >>> var13;
                  param3[var12] = (byte)(var10 >>> var13);
                  if (var12 < var14) {
                    var12++;
                    var13 -= 8;
                    var7_int = var10 << -var13;
                    param3[var12] = (byte)(var10 << -var13);
                  }
                }
              }
            }
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("fk.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        BitPacketBuffer var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        mf var4 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != 14114) {
            var4 = (mf) null;
            fk.a((mf) null, (mf) null, (mf) null, -121);
          }
          var1 = k.field_h;
          while (ik.a(104)) {
            var1.writeCipheredOpcode(-13413, 8);
            fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            var2 = fieldTemp$0;
            HighscoresScreen.a(var1, (byte) 9);
            k.field_h.backfillByteLength((byte) 118, -var2 + var1.position);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1_ref), "fk.H(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        if (param0 != -94) {
          fk.a(119, (byte) 34);
        }
        field_d = null;
    }

    final int a(int param0, int param1, int param2, boolean param3, byte[] param4, byte[] param5) {
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
        int stackIn_4_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
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
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 == param0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!param3) {
            fk.a((byte) 104);
          }
          param0 = param0 + param1;
          var7_int = 0;
          var8 = param2;
          scanLoop1: while (true) {
            var9 = param5[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$0 = this.field_j[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param1;
              param1++;
              param4[incrementValue$1] = (byte)(~var10);
              if (param1 >= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 != (64 & var9)) {
              var7_int = this.field_j[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_j[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param1;
              param1++;
              param4[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$4 = this.field_j[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param1;
              param1++;
              param4[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param0 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$6 = this.field_j[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param4[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param0 <= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 8)) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$8 = this.field_j[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param4[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 >= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_j[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_j[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param4[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param1 >= param0) {
                return -param2 + (1 + var8);
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$12 = this.field_j[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param1;
              param1++;
              param4[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param1 >= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 1)) {
              var7_int++;
            } else {
              var7_int = this.field_j[var7_int];
            }
            dupTemp$14 = this.field_j[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param1;
              param1++;
              param4[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param1 >= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_70_0 = -param2 + (1 + var8);
          return stackIn_70_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_73_0 = var7;
          stackIn_73_1 = new StringBuilder().append("fk.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',');
          if (param5 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_73_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
          int var4_int = 0;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          java.net.MalformedURLException var5 = null;
          try {
            var4_int = 60 / ((1 - param0) / 62);
            if (tg.field_b.startsWith("win") &&
              ie.a(param2, false)) {
              return;
            }
            try {
              param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              rk.a("MGR1: " + param2, (Throwable) null, 77);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var4;
            stackIn_10_1 = new StringBuilder().append("fk.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
            if (param2 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    fk(byte[] param0) {
        int var5 = 0;
        int var14 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
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
          this.field_i = param0;
          this.field_a = new int[var2_int];
          var17 = new int[33];
          var16 = var17;
          var3 = var16;
          this.field_j = new int[8];
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var6 = param0[var5];
            if (var6 != 0) {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameCompleted1 = true;
              boolean decompiledFrameCompleted0 = true;
              var7 = 1 << -var6 + 32;
              var8 = var17[var6];
              this.field_a[var5] = var8;
              if ((var8 & var7) == 0) {
                var9 = var7 | var8;
                var10 = var6 - 1;
                while (var10 >= 1) {
                  var11 = var17[var10];
                  if (~var8 != ~var11) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var12 = 1 << 32 - var10;
                  if ((var12 & var11) != 0) {
                    var3[var10] = var3[var10 - 1];
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var3[var10] = LevelSelectScreen.d(var12, var11);
                  var10--;
                }
                if (decompiledFrameCompleted1) {
                  decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                }
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted1) &&
                (decompiledFrameCompleted0)) {
                var9 = var3[var6 - 1];
              }
              var17[var6] = var9;
              for (var10Lifetime1 = var6 + 1; var10Lifetime1 <= 32; var10Lifetime1++) {
                if (var8 == var17[var10Lifetime1]) {
                  var17[var10Lifetime1] = var9;
                }
              }
              var10Lifetime2 = 0;
              for (var11Lifetime1 = 0; var6 > var11Lifetime1; var11Lifetime1++) {
                var12Lifetime1 = -2147483648 >>> var11Lifetime1;
                if ((var8 & var12Lifetime1) == 0) {
                  var10Lifetime2++;
                } else {
                  if (this.field_j[var10Lifetime2] == 0) {
                    this.field_j[var10Lifetime2] = var4;
                  }
                  var10Lifetime2 = this.field_j[var10Lifetime2];
                }
                if (this.field_j.length <= var10Lifetime2) {
                  var13 = new int[this.field_j.length * 2];
                  for (var14 = 0; this.field_j.length > var14; var14++) {
                    var13[var14] = this.field_j[var14];
                  }
                  this.field_j = var13;
                }
                var12Lifetime1 = var12Lifetime1 >>> 1;
              }
              this.field_j[var10Lifetime2] = ~var5;
              if (var10Lifetime2 >= var4) {
                var4 = 1 + var10Lifetime2;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_37_0 = var2;
          stackIn_37_1 = new StringBuilder().append("fk.<init>(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    static {
        field_f = new NodeDeque();
        field_c = "Passwords can only contain letters and numbers";
        field_b = 0.0;
        field_d = "Age:";
    }
}
