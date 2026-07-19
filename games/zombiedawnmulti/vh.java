/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends cj {
    static String field_Nb;
    static boolean field_Mb;
    int field_Ob;
    static ej field_Gb;
    private int field_Jb;
    static String field_Fb;
    static boolean field_Hb;
    static ri field_Lb;
    static String[] field_Ib;
    private ja field_Kb;

    final void j(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = bd.field_g - this.field_x;
        var3 = -this.field_Q + bo.field_d;
        if ((param0 & jf.field_e) != 0) {
          if ((var3 ^ -1) <= -1) {
            if (var3 < this.field_z) {
              L0: {
                if (-1 < (var2 ^ -1)) {
                  break L0;
                } else {
                  if (this.field_zb > var2) {
                    this.field_Ob = this.field_Kb.field_B[this.field_Kb.field_x * var3 - -var2];
                    break L0;
                  } else {
                    if (4 + this.field_zb <= var2) {
                      if (this.field_zb + 12 <= var2) {
                        return;
                      } else {
                        this.field_Jb = -(185 * var3 / this.field_z) + 255;
                        this.a(this.field_Kb, 12);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              if (4 + this.field_zb <= var2) {
                if (this.field_zb + 12 <= var2) {
                  return;
                } else {
                  this.field_Jb = -(185 * var3 / this.field_z) + 255;
                  this.a(this.field_Kb, 12);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -24) {
                break L1;
              } else {
                field_Hb = false;
                break L1;
              }
            }
            if (!param0) {
              stackOut_5_0 = e.field_c.a(param2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = wn.field_u.a(param2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("vh.HA(").append(param0).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    vh(long param0, cj param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3, param4, param5, (String) null);
        this.field_Jb = 190;
        try {
            this.field_Kb = new ja(param4, param5);
            this.a(this.field_Kb, 12);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == 85) {
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_Mb = true;
          if (param0 >= 48) {
            if (57 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        this.field_Kb.c(this.field_x, this.field_Q);
        oo.a(4 + this.field_zb + this.field_x, this.field_Q, 8, this.field_z, 16777215, 4671303);
        var4 = 18 / ((param0 - 16) / 42);
        var2 = -this.field_x + bd.field_g;
        var3 = bo.field_d - this.field_Q;
        if (-1 != (jf.field_e & 1 ^ -1)) {
          if (var3 >= 0) {
            if (this.field_z > var3) {
              if (-1 >= (var2 ^ -1)) {
                if (var2 < this.field_zb) {
                  oo.c(bd.field_g, bo.field_d, 2, 0);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final void a(ja param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == 12) {
                break L1;
              } else {
                vh.c((byte) 47);
                break L1;
              }
            }
            L2: while (true) {
              if (param0.field_w <= var3_int) {
                break L0;
              } else {
                if (var7 == 0) {
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      if (var4 >= param0.field_x) {
                        var3_int++;
                        break L4;
                      } else {
                        var5 = var4 * 256 / param0.field_x;
                        var6 = -(var3_int * 256 / param0.field_w) + 255;
                        param0.field_B[var3_int * param0.field_x + var4] = gi.a(var6, this.field_Jb, var5, (byte) -115);
                        var4++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    continue L2;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("vh.BA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    public static void c(byte param0) {
        if (param0 >= -97) {
            return;
        }
        field_Ib = null;
        field_Lb = null;
        field_Fb = null;
        field_Gb = null;
        field_Nb = null;
    }

    final static void a(int param0, int[] param1, Object[] param2) {
        try {
            if (param0 != -7255) {
                Object[] var4 = (Object[]) null;
                vh.a(((int[]) (param2[10]))[0], (int[]) null, (Object[]) null);
            }
            qf.a(param2, 0, 2, param1.length + -1, param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "vh.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int h(int param0) {
        if (param0 <= 10) {
            return -120;
        }
        return lq.field_d;
    }

    static {
        field_Mb = false;
        field_Nb = "Status";
        field_Hb = false;
        field_Ib = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
