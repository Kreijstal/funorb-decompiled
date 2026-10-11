/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sf extends wl {
    private int field_T;
    static int[] field_P;
    private int field_R;
    private int field_V;
    static String field_Q;
    private int field_U;
    private int field_O;
    private int field_S;

    void b(int param0, int param1, int param2) {
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
        int var16;
        PacketBuffer var17;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        SoftwareRaster.a(6 + param0, 35 + param2, this.field_l - 12, this.field_w - 40, 2105376, 0);
        var4 = 35;
        var5 = 211;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        while (var4 > var7) {
          if (var8 >= SoftwareRaster.field_a &&
            var8 < SoftwareRaster.field_f) {
            var9 = var5 + var7 * (var6 - var5) / var4;
            var10 = 0;
            var11 = this.field_l;
            if (var7 <= 20) {
              while (20 >= var10) {
                var12 = (-var10 + 20) * (-var10 + 20) + (-var7 + 20) * (-var7 + 20);
                if (var12 <= 462) {
                  if (var12 < 420) {
                    break;
                  }
                  var13 = var9 * (462 - var12) / 42;
                  var13 = var13 | (var13 << 8 | var13 << 16);
                  SoftwareRaster.field_d[var8 * SoftwareRaster.field_l - (-param0 - var10)] = var13;
                }
                var10++;
              }
            }
            if (var7 <= 20) {
              var12Lifetime1 = var11;
              var11 -= 21;
              for (var13Lifetime1 = 0; var13Lifetime1 <= 20; var13Lifetime1++) {
                var14 = var13Lifetime1 * var13Lifetime1 + (-var7 + 20) * (20 - var7);
                if (462 >= var14) {
                  if (var14 < 420) {
                    var12Lifetime1 = 1 + var11;
                  } else {
                    var15 = var9 * (462 - var14) / 42;
                    var15 = var15 | (var15 << 16 | var15 << 8);
                    SoftwareRaster.field_d[var11 + param0 + SoftwareRaster.field_l * var8] = var15;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var11 = var12Lifetime1;
            }
            var9 = var9 | (var9 << 16 | var9 << 8);
            SoftwareRaster.e(param0 + var10, var8, -var10 + var11, var9);
          }
          var8++;
          var7++;
        }
        var6Lifetime1 = 169;
        var4Lifetime1 = 22;
        var5Lifetime1 = 194;
        var7Lifetime1 = 0;
        var8Lifetime1 = param2 + 35;
        while (var7Lifetime1 < var4Lifetime1) {
          var9Lifetime1 = var5Lifetime1 + var7Lifetime1 * (-var5Lifetime1 + var6Lifetime1) / var4Lifetime1;
          var9Lifetime1 = var9Lifetime1 | (var9Lifetime1 << 16 | var9Lifetime1 << 8);
          SoftwareRaster.e(param0, var8Lifetime1, 6, var9Lifetime1);
          SoftwareRaster.e(param0 - (-this.field_l + 6), var8Lifetime1, 6, var9Lifetime1);
          var7Lifetime1++;
          var8Lifetime1++;
        }
        gt.field_e.g(this.field_l + (param0 - 90), 10 + param2);
        gb.a(t.field_d, param0 + 5, param2 + 35, this.field_l - 10, 8941);
        gb.a(ip.field_c, param0, -22 + param2 + this.field_w, this.field_l, param1 ^ 1851672364);
        var4Lifetime2 = this.field_w - 79;
        var6Lifetime2 = 127;
        var5Lifetime2 = 169;
        if (param1 != 1851680193) {
          var17 = (PacketBuffer) null;
          sf.a(-110, (String) null, (PacketBuffer) null);
        }
        var7Lifetime2 = 0;
        var8Lifetime2 = param2 + 57;
        while (var4Lifetime2 > var7Lifetime2) {
          var9Lifetime2 = (-var5Lifetime2 + var6Lifetime2) * var7Lifetime2 / var4Lifetime2 + var5Lifetime2;
          var9Lifetime2 = var9Lifetime2 | (var9Lifetime2 << 16 | var9Lifetime2 << 8);
          SoftwareRaster.e(param0, var8Lifetime2, 6, var9Lifetime2);
          SoftwareRaster.e(param0 + this.field_l - 6, var8Lifetime2, 6, var9Lifetime2);
          var7Lifetime2++;
          var8Lifetime2++;
        }
    }

    boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var4 = 0;
        int var5 = 0;
        if (0 >= this.field_O) {
        } else {
          var2 = this.field_V;
          var3 = this.field_U;
          fieldTemp$0 = this.field_R + 1;
          this.field_R = this.field_R + 1;
          if (fieldTemp$0 >= this.field_O) {
            this.field_O = 0;
            this.m(param0 - 22);
          } else {
            var4 = this.field_R * (-this.field_R + 2 * this.field_O);
            var5 = this.field_O * this.field_O;
            var3 = var4 * (-this.field_S + this.field_U) / var5 + this.field_S;
            var2 = this.field_T + var4 * (this.field_V - this.field_T) / var5;
          }
          this.a(var2, (byte) 127, var3);
        }
        if (param0 != -1) {
          return true;
        }
        return super.a((byte) -1);
    }

    final static int a(int param0, String param1, PacketBuffer param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        PacketBuffer var5 = null;
        CharSequence var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15901) {
            var5 = (PacketBuffer) null;
            sf.a(-112, (String) null, (PacketBuffer) null);
          }
          var3_int = param2.position;
          var6 = (CharSequence) ((Object) param1);
          var4 = nr.a(var6, false);
          param2.a(true, var4.length);
          param2.position = param2.position + ds.field_c.a(0, var4, var4.length, param2.payload, param2.position, (byte) 28);
          stackIn_3_0 = param2.position - var3_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sf.GB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param0 <= 0) {
          this.a(param3, (byte) 115, param2);
          return;
        }
        this.field_R = 0;
        this.field_U = param2;
        this.field_O = param0;
        this.field_S = this.field_w;
        this.field_V = param3;
        this.field_T = this.field_l;
        if (param1) {
          this.a(-36, true, -43, -81);
        }
    }

    boolean k(int param0) {
        int var2 = 125 / ((param0 + 1) / 44);
        this.l(-87);
        return super.k(66);
    }

    public static void h(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 <= 21) {
          sf.h((byte) -93);
        }
    }

    final static void a(byte param0, of param1) {
        int var2_int = 0;
        of var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param1.unlink(-123);
          var2_int = -20 % ((param0 + 16) / 62);
          var3 = (of) (SummonAction.field_u.first((byte) 125));
          while (var3 != null) {
            if (var3.a(9687, param1)) {
              var3 = (of) (SummonAction.field_u.next((byte) 123));
              continue;
            }
            break;
          }
          if (var3 == null) {
            SummonAction.field_u.addLast((byte) -119, (IntrusiveNode) (param1));
          } else {
            stackIn_7_0 = -123;
            fj.$cfr$intArgs$a$f94c566f195c(stackIn_7_0, param1, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("sf.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void m(int param0) {
        int var2 = -52 % ((69 - param0) / 50);
    }

    final static void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        RgbSprite stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int[][] stackIn_43_3;
        int stackIn_44_4;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7_int = 0;
        EventPresenter var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var8Lifetime1;
        int var9Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param2 != 0) {
            field_Q = (String) null;
          }
          var6_int = og.field_p[param4] + param4;
          if (cu.field_a) {
            var7_int = CipherPacketBuffer.currentBattlefield.getTileEffects(31, param0, param1, -1);
            var8 = vs.field_e[param4].terrainType;
            if (4 != var8 &&
              6 != var8 &&
              var8 != 2 &&
              (1 & var7_int) != 0) {
              StateChangeEvent.a(var6_int, param2 ^ -12933, param5, param3);
            }
            if (vs.field_e[param4].hasCorpse(-121)) {
              fe.a(wf.field_B[var6_int % 4], param3 - 10, -25 + param5);
            }
            var9 = fn.field_Q[vs.field_e[param4].terrainType];
            if (var9 > -1) {
              if (2 == var9) {
                fe.a(oq.field_l[17], -10 + param3, param5 - 25);
              } else {
                if (vs.field_e[param4].terrainType == 3) {
                  ih.a((byte) -124, param3 + 30, param4 + og.field_p[param4], 32 + param5);
                } else {
                  if (var9 == 1) {
                    fe.a(oq.field_l[8 + var6_int % 3], -10 + param3, param5 - 55);
                  } else {
                    if (var9 == 9) {
                      fe.a(oq.field_l[14 + var6_int % 2], -10 + param3, param5 - 30);
                    } else {
                      if (8 != var9) {
                        if (var9 == 0) {
                          fe.a(oq.field_l[var6_int % 8 + 0], param3 - 10, param5 - 35);
                        } else {
                          if (4 == var9) {
                            ab.a(35 + param5, og.field_p[param4] + param4, param3 + 30, false);
                          }
                        }
                      } else {
                        fe.a(oq.field_l[var6_int % 2 + 11], -10 + param3, param5 - 55);
                      }
                    }
                  }
                }
              }
            }
            rs.a(26449, param3, param4, param5);
          }
          var7 = (EventPresenter) (jf.field_C.eventPresenters.first((byte) 106));
          while (var7 != null) {
            if (var7.tileIndex == param4) {
              if (var7.presentationActive) {
                var7 = (EventPresenter) (jf.field_C.eventPresenters.next((byte) 123));
                continue;
              }
              if (null != var7.event.unit &&
                var7.event.unit.field_x != null &&
                !var7.fullCombatScene) {
                var8Lifetime1 = var7.event.unit.field_x.screenPosition[0];
                var9Lifetime1 = var7.event.unit.field_x.screenPosition[1];
                var10 = var7.event.unit.ownerPlayer;
                stackIn_43_0 = TeamRoster.field_g;
                stackIn_43_1 = -30 + var8Lifetime1;
                stackIn_43_2 = var9Lifetime1 - 15;
                stackIn_43_3 = op.field_c;
                if (!CipherPacketBuffer.currentBattlefield.teamGame) {
                  stackIn_44_4 = 0;
                } else {
                  stackIn_44_4 = 1;
                }
                ((RgbSprite) (Object) stackIn_43_0).b(stackIn_43_1, stackIn_43_2, stackIn_43_3[stackIn_44_4][var10]);
                wl.field_N.b(var8Lifetime1 - 40, -20 + var9Lifetime1);
              }
            }
            var7 = (EventPresenter) (jf.field_C.eventPresenters.next((byte) 123));
          }
          if (vs.field_e[param4].occupant != null) {
            if (vs.field_e[param4].occupant.field_u) {
              return;
            }
            wl.field_N.b(param3, param5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "sf.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    void l(int param0) {
        if (0 >= this.field_O) {
          return;
        }
        this.a(this.field_V, (byte) 113, this.field_U);
        this.field_O = 0;
        int var2 = 40 % ((-25 - param0) / 57);
        this.m(-120);
    }

    sf(gk param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_R = 0;
        this.field_O = 0;
    }

    static {
        field_Q = "Disruptive behaviour";
        field_P = new int[]{22, 1, 0, 39, 28, 46, 9, 22, 22, 2, 22, 22, 22, 47, 5, 29, 22, 22, 6, 48, 44, 22, 22, 22, 4, 22, 10, 42, 15, 40, 17, 10, 22, 11, 11, 32, 22, 12, 16, 23, 14, 2, 3, 22, 22, 20, 10, 22, 22, 22, 22, 43, 18, 19, 34, 24, 31, 21, 35, 8, 37, 36, 38, 25, 10, 33, 30, 22, 22, 22, 7, 41, 45, 22, 28, 13, 49, 22, 22, 22, 22, 28, 50, 51, 52, 53, 54, 55, 56, 53};
    }
}
