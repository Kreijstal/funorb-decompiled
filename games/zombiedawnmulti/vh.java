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
        int var2;
        int var3;
        L0: {
          var2 = bd.field_g - this.field_x;
          var3 = -this.field_Q + bo.field_d;
          if ((param0 & jf.field_e) != 0) {
            if ((var3 ^ -1) > -1) {
              break L0;
            } else {
              if (var3 < this.field_z) {
                L1: {
                  if (-1 < (var2 ^ -1)) {
                    break L1;
                  } else {
                    if (this.field_zb > var2) {
                      this.field_Ob = this.field_Kb.field_B[this.field_Kb.field_x * var3 - -var2];
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  if (4 + this.field_zb > var2) {
                    break L2;
                  } else {
                    if (this.field_zb + 12 <= var2) {
                      break L2;
                    } else {
                      this.field_Jb = -(185 * var3 / this.field_z) + 255;
                      this.a(this.field_Kb, 12);
                      break L0;
                    }
                  }
                }
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
    }

    final static int a(boolean param0, int param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_6_0 = e.field_c.a(param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = wn.field_u.a(param2);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("vh.HA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
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
        int stackIn_6_0 = 0;
        L0: {
          if (param1 == 85) {
            break L0;
          } else {
            field_Mb = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (57 < param0) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final void i(int param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          this.field_Kb.c(this.field_x, this.field_Q);
          oo.a(4 + this.field_zb + this.field_x, this.field_Q, 8, this.field_z, 16777215, 4671303);
          var4 = 18 / ((param0 - 16) / 42);
          var2 = -this.field_x + bd.field_g;
          var3 = bo.field_d - this.field_Q;
          if (-1 == (jf.field_e & 1 ^ -1)) {
            break L0;
          } else {
            L1: {
              if (var3 < 0) {
                break L1;
              } else {
                if (this.field_z > var3) {
                  if (-1 < (var2 ^ -1)) {
                    break L1;
                  } else {
                    if (var2 >= this.field_zb) {
                      break L1;
                    } else {
                      oo.c(bd.field_g, bo.field_d, 2, 0);
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            break L0;
          }
        }
    }

    private final void a(ja param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
                var4 = 0;
                L3: while (true) {
                  if (var4 >= param0.field_x) {
                    var3_int++;
                    continue L2;
                  } else {
                    var5 = var4 * 256 / param0.field_x;
                    var6 = -(var3_int * 256 / param0.field_w) + 255;
                    param0.field_B[var3_int * param0.field_x + var4] = gi.a(var6, this.field_Jb, var5, (byte) -115);
                    var4++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("vh.BA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
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
