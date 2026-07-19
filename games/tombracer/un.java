/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un extends ci {
    static String field_q;
    private int field_o;
    private int[] field_n;
    private int field_m;
    private int field_p;
    static int[] field_r;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var23 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_20_0 = null;
        int[] stackIn_27_0 = null;
        int[] stackIn_38_0 = null;
        int[] stackOut_26_0 = null;
        int[] stackOut_37_0 = null;
        int[] stackOut_8_0 = null;
        int[] stackOut_19_0 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var18 = this.field_i.a((byte) 113, param1);
          var3 = var18;
          if (this.field_i.field_d) {
            var7 = this.field_o * ooa.field_g >> -1117378100;
            var23 = this.c(0, -126, hba.field_b & -1 + param1);
            var9 = this.c(0, param0 ^ -36, param1);
            var10 = this.c(0, -116, param1 - -1 & hba.field_b);
            var11 = 0;
            L0: while (true) {
              if (var11 < ns.field_g) {
                L1: {
                  stackOut_26_0 = (int[]) (var10);
                  stackIn_38_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (var17 != 0) {
                    break L1;
                  } else {
                    L2: {
                      var12 = (stackIn_27_0[var11] + -var23[var11]) * var7 >> -580672500;
                      var13 = var7 * (var9[-1 + var11 & una.field_b] + -var9[una.field_b & var11 - -1]) >> 1557055244;
                      var14 = var13 >> -577099804;
                      var15 = var12 >> 397617732;
                      if ((var14 ^ -1) <= -1) {
                        break L2;
                      } else {
                        var14 = -var14;
                        break L2;
                      }
                    }
                    L3: {
                      if (0 > var15) {
                        var15 = -var15;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var14 <= 255) {
                        break L4;
                      } else {
                        var14 = 255;
                        break L4;
                      }
                    }
                    L5: {
                      if ((var15 ^ -1) >= -256) {
                        break L5;
                      } else {
                        var15 = 255;
                        break L5;
                      }
                    }
                    var16 = 255 & pda.field_b[var14 - -(var15 * (1 + var15) >> 885331841)];
                    var5 = var12 * var16 >> -1744199224;
                    var4 = var16 * var13 >> 2065884872;
                    var6 = var16 * 4096 >> 1171917128;
                    var6 = var6 * this.field_n[2] >> -463689204;
                    var4 = this.field_n[0] * var4 >> 1113290092;
                    var5 = var5 * this.field_n[1] >> 989269644;
                    var18[var11] = var6 + var4 - -var5;
                    var11++;
                    if (var17 == 0) {
                      continue L0;
                    } else {
                      stackOut_37_0 = (int[]) (var18);
                      stackIn_38_0 = stackOut_37_0;
                      break L1;
                    }
                  }
                }
                return stackIn_38_0;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        } else {
          this.field_m = 111;
          var18 = this.field_i.a((byte) 113, param1);
          var3 = var18;
          if (this.field_i.field_d) {
            var7 = this.field_o * ooa.field_g >> -1117378100;
            var21 = this.c(0, -126, hba.field_b & -1 + param1);
            var20 = var21;
            var9 = this.c(0, param0 ^ -36, param1);
            var10 = this.c(0, -116, param1 - -1 & hba.field_b);
            var11 = 0;
            L6: while (true) {
              if (var11 < ns.field_g) {
                L7: {
                  var21 = var20;
                  stackOut_8_0 = (int[]) (var10);
                  stackIn_20_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var17 != 0) {
                    break L7;
                  } else {
                    L8: {
                      var12 = (stackIn_9_0[var11] + -var21[var11]) * var7 >> -580672500;
                      var13 = var7 * (var9[-1 + var11 & una.field_b] + -var9[una.field_b & var11 - -1]) >> 1557055244;
                      var14 = var13 >> -577099804;
                      var15 = var12 >> 397617732;
                      if ((var14 ^ -1) <= -1) {
                        break L8;
                      } else {
                        var14 = -var14;
                        break L8;
                      }
                    }
                    L9: {
                      if (0 > var15) {
                        var15 = -var15;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (var14 <= 255) {
                        break L10;
                      } else {
                        var14 = 255;
                        break L10;
                      }
                    }
                    L11: {
                      if ((var15 ^ -1) >= -256) {
                        break L11;
                      } else {
                        var15 = 255;
                        break L11;
                      }
                    }
                    var16 = 255 & pda.field_b[var14 - -(var15 * (1 + var15) >> 885331841)];
                    var5 = var12 * var16 >> -1744199224;
                    var4 = var16 * var13 >> 2065884872;
                    var6 = var16 * 4096 >> 1171917128;
                    var6 = var6 * this.field_n[2] >> -463689204;
                    var4 = this.field_n[0] * var4 >> 1113290092;
                    var5 = var5 * this.field_n[1] >> 989269644;
                    var18[var11] = var6 + var4 - -var5;
                    var11++;
                    if (var17 == 0) {
                      continue L6;
                    } else {
                      stackOut_19_0 = (int[]) (var18);
                      stackIn_20_0 = stackOut_19_0;
                      break L7;
                    }
                  }
                }
                return stackIn_20_0;
              } else {
                return var18;
              }
            }
          } else {
            return var18;
          }
        }
    }

    public un() {
        super(1, true);
        this.field_p = 3216;
        this.field_m = 3216;
        this.field_o = 4096;
        this.field_n = new int[3];
    }

    final void a(byte param0, uia param1, int param2) {
        int[] discarded$2 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var4_int = param2;
                      if (var4_int != 0) {
                        break L5;
                      } else {
                        if (var5 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if ((var4_int ^ -1) != -2) {
                        break L6;
                      } else {
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (2 != var4_int) {
                      break L1;
                    } else {
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_o = param1.d(param0 + 14);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                this.field_p = param1.d(123);
                if (var5 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              this.field_m = param1.d(param0 + 20);
              break L1;
            }
            L7: {
              if (param0 == 107) {
                break L7;
              } else {
                discarded$2 = this.c(24, 112);
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var4);
            stackOut_18_1 = new StringBuilder().append("un.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void c(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var2 = Math.cos((double)((float)this.field_m / 4096.0f));
        this.field_n[0] = (int)(4096.0 * (Math.sin((double)((float)this.field_p / 4096.0f)) * var2));
        this.field_n[1] = (int)(Math.cos((double)((float)this.field_p / 4096.0f)) * var2 * 4096.0);
        this.field_n[2] = (int)(Math.sin((double)((float)this.field_m / 4096.0f)) * 4096.0);
        var4 = this.field_n[0] * this.field_n[0] >> -2115637396;
        var5 = this.field_n[1] * this.field_n[1] >> 885633420;
        var6 = this.field_n[2] * this.field_n[2] >> -1271222740;
        if (param0 == 28427) {
          var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 291581964)) * 4096.0);
          if (var7 != 0) {
            this.field_n[0] = (this.field_n[0] << -2007394740) / var7;
            this.field_n[2] = (this.field_n[2] << 555811276) / var7;
            this.field_n[1] = (this.field_n[1] << -3381684) / var7;
            return;
          } else {
            return;
          }
        } else {
          this.b((byte) -32);
          var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 291581964)) * 4096.0);
          if (var7 == 0) {
            return;
          } else {
            this.field_n[0] = (this.field_n[0] << -2007394740) / var7;
            this.field_n[2] = (this.field_n[2] << 555811276) / var7;
            this.field_n[1] = (this.field_n[1] << -3381684) / var7;
            return;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != 116) {
            return;
        }
        this.c(28427);
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_r = null;
        field_q = null;
    }

    static {
        field_q = "Friends";
        field_r = new int[8192];
    }
}
