/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends le {
    private boolean field_n;
    private boolean field_o;
    static String field_k;
    static kda field_l;
    static jra field_i;
    static String field_m;
    static String field_j;
    static int field_p;

    public static void e(byte param0) {
        field_j = null;
        if (param0 < 106) {
            di.e((byte) 85);
        }
        field_m = null;
        field_i = null;
        field_k = null;
        field_l = null;
    }

    public di() {
        super(1, false);
        this.field_n = true;
        this.field_o = true;
    }

    final int[] a(int param0, boolean param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int[] var7 = this.field_f.a((byte) -90, param0);
        int[] var3 = var7;
        if (!this.field_f.field_e) {
        } else {
            var4 = this.a(0, !this.field_n ? param0 : -param0 + wf.field_d, 255);
            if (!this.field_o) {
                cua.a(var4, 0, var7, 0, hob.field_d);
            } else {
                for (var5 = 0; hob.field_d > var5; var5++) {
                    var3[var5] = var4[gbb.field_q - var5];
                }
            }
        }
        if (!param1) {
            return (int[]) null;
        }
        return var3;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                L2: {
                  stackIn_7_0 = this;

                  if (-2 != (param2.e((byte) -96) ^ -1)) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L2;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L2;
                  }
                }
                ((di) (this)).field_o = stackIn_8_1 != 0;
                break L1;
              } else {
                if (1 == var4_int) {
                  L3: {
                    stackIn_11_0 = this;

                    if (1 != param2.e((byte) -105)) {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 0;
                      break L3;
                    } else {
                      stackIn_12_0 = this;
                      stackIn_12_1 = 1;
                      break L3;
                    }
                  }
                  ((di) (this)).field_n = stackIn_12_1 != 0;
                  break L1;
                } else {
                  if (2 != var4_int) {
                    break L1;
                  } else {
                    L4: {
                      stackIn_15_0 = this;

                      if (param2.e((byte) -89) != 1) {
                        stackIn_16_0 = this;
                        stackIn_16_1 = 0;
                        break L4;
                      } else {
                        stackIn_16_0 = this;
                        stackIn_16_1 = 1;
                        break L4;
                      }
                    }
                    ((di) (this)).field_g = stackIn_16_1 != 0;
                    break L1;
                  }
                }
              }
            }
            L5: {
              if (param1 < -60) {
                break L5;
              } else {
                this.a(-9, true);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("di.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final int[][] a(int param0, int param1) {
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int[][] var3;
        int[] var5;
        int[] var6;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int var14;
        int[][] var16;
        int[] var17;
        int[] var18;
        int[] var19;
        int[][] var21;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        L0: {
          var12 = VoidHunters.field_G;
          if (param0 == 255) {
            break L0;
          } else {
            di.e((byte) -54);
            break L0;
          }
        }
        L1: {
          var21 = this.field_d.a(param1, (byte) -113);
          var16 = var21;
          var13 = var16;
          var3 = var13;
          if (this.field_d.field_g) {
            L2: {
              stackIn_6_0 = this;

              stackIn_6_1 = 62;

              stackIn_6_2 = 0;

              if (this.field_n) {
                stackIn_7_0 = this;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = wf.field_d + -param1;
                break L2;
              } else {
                stackIn_7_0 = this;
                stackIn_7_1 = stackIn_6_1;
                stackIn_7_2 = stackIn_6_2;
                stackIn_7_3 = param1;
                break L2;
              }
            }
            var26 = this.a((byte) stackIn_7_1, stackIn_7_2, stackIn_7_3);
            var22 = var26[0];
            var17 = var22;
            var5 = var17;
            var23 = var26[1];
            var18 = var23;
            var6 = var18;
            var24 = var26[2];
            var19 = var24;
            var7 = var19;
            var8 = var21[0];
            var9 = var21[1];
            var10 = var21[2];
            if (this.field_o) {
              var14 = 0;
              var11 = var14;
              L3: while (true) {
                if (hob.field_d <= var14) {
                  break L1;
                } else {
                  var8[var14] = var5[-var14 + gbb.field_q];
                  var9[var14] = var6[gbb.field_q + -var14];
                  var10[var14] = var7[gbb.field_q - var14];
                  var14++;
                  continue L3;
                }
              }
            } else {
              var11 = 0;
              L4: while (true) {
                if (var11 >= hob.field_d) {
                  break L1;
                } else {
                  var8[var11] = var22[var11];
                  var9[var11] = var23[var11];
                  var10[var11] = var24[var11];
                  var11++;
                  continue L4;
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static vu a(String param0, int param1) {
        String var2 = null;
        vu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        vu stackIn_13_0 = null;
        vu stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            if (null != ae.field_f) {
              if (param0 != null) {
                if (0 != param0.length()) {
                  var6 = (CharSequence) ((Object) param0);
                  var2 = jwa.a(false, var6);
                  if (var2 != null) {
                    var3 = (vu) ((Object) ae.field_f.a(-1, (long)var2.hashCode()));
                    if (param1 == 0) {
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_Fb);
                          var4 = jwa.a(false, var7);
                          if (!var4.equals(var2)) {
                            var3 = (vu) ((Object) ae.field_f.e(-116));
                            continue L1;
                          } else {
                            stackIn_18_0 = (vu) (var3);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = (vu) null;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    return null;
                  }
                } else {
                  stackIn_7_0 = null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("di.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (vu) ((Object) stackIn_7_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    static {
        field_k = "Message lobby";
        field_m = "Add action (Set team of a body)";
        field_i = new jra();
        field_j = "Join";
        field_p = 0;
    }
}
