/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hga extends am {
    private boolean field_X;
    private de field_T;
    private String field_V;
    static qm field_U;
    private boolean field_W;
    private String field_S;

    hga(rp param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_V = param1;
            if (null != this.field_V) {
                var3_int = qia.field_a.a(this.field_V, 260, qia.field_a.field_u);
                this.b(-93, var3_int + 150, 300);
            }
            this.field_T = new de(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_X = false;
            this.field_T.field_P = true;
            this.field_W = false;
            this.c(this.field_T, 25);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "hga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void o(int param0) {
        if (param0 != 8405024) {
            field_U = (qm) null;
            field_U = null;
            return;
        }
        field_U = null;
    }

    final void d(byte param0) {
        ola discarded$0 = null;
        this.field_T.field_P = false;
        if (param0 != 47) {
            discarded$0 = hga.n(-84);
            this.field_W = true;
            return;
        }
        this.field_W = true;
    }

    final void a(int param0, boolean param1, float param2, String param3) {
        RuntimeException var5 = null;
        String var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_X) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = stackIn_3_0;
              stackIn_5_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (param1) {
                stackOut_5_0 = stackIn_5_0;
                stackOut_5_1 = 0;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                break L2;
              } else {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                break L2;
              }
            }
            L3: {
              if (stackIn_6_0 == stackIn_6_1) {
                break L3;
              } else {
                L4: {
                  stackOut_7_0 = this;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (!param1) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L4;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L4;
                  }
                }
                ((hga) (this)).field_X = stackIn_10_1 != 0;
                if (!this.field_X) {
                  this.field_T.c(1705304705, 2113632, 4210752);
                  if (this.field_W) {
                    this.field_T.field_P = false;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  this.field_T.c(1705304705, 8405024, 4210752);
                  this.field_T.field_P = true;
                  break L3;
                }
              }
            }
            this.field_T.field_M = (int)(65536.0f * (param2 / 100.0f));
            this.field_S = param3;
            if (param0 > 18) {
              break L0;
            } else {
              var6 = (String) null;
              this.a(-90, false, -1.9980103969573975f, (String) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("hga.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final static void a(boolean param0, byte[] param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var22 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              lka.field_E = qs.a(false, new lu(param1));
              ur.field_e = new oha[lka.field_E.length + -1];
              pe.field_m = 0;
              var2_int = 1;
              if (param0) {
                break L1;
              } else {
                field_U = (qm) null;
                break L1;
              }
            }
            L2: while (true) {
              if (lka.field_E.length <= var2_int) {
                break L0;
              } else {
                L3: {
                  var3 = -1 + var2_int;
                  var4 = lka.field_E[var2_int][1];
                  var5 = lka.field_E[var2_int][2];
                  var6 = bm.a(80, var2_int);
                  var7 = vc.a(var2_int, 3, -16306);
                  var8 = dha.a((byte) -38, var2_int);
                  var9 = jfa.a(false, var2_int);
                  var10 = vc.a(var2_int, 15, -16306);
                  if (1 != var6) {
                    if (2 != var6) {
                      if (-5 == (var6 ^ -1)) {
                        var11 = dna.b(var2_int, false);
                        var12 = te.a(var2_int, (byte) 65);
                        var13 = vc.a(var2_int, 8, -16306);
                        var14 = vc.a(var2_int, 9, -16306);
                        var15 = vc.a(var2_int, 10, -16306);
                        var16 = mq.a(13, 207, var2_int);
                        var8 = dha.a((byte) -113, var2_int);
                        bea.a(var15, var10, var12, var16, var11, var3, -52, var14, var13, var8, var9, var4, var5);
                        break L3;
                      } else {
                        if (-4 != (var6 ^ -1)) {
                          break L3;
                        } else {
                          var11 = vc.a(var2_int, 10, -16306);
                          var12 = te.a(var2_int, (byte) -53);
                          pm.a(var9, var3, 12635, var7, var8, var11, var4, var5, var12);
                          break L3;
                        }
                      }
                    } else {
                      mw.a((byte) -120, var9, var10, var8, var4, var5, var7, var3);
                      break L3;
                    }
                  } else {
                    L4: {
                      var11 = eka.a((byte) 125, var2_int);
                      stackOut_5_0 = var2_int;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (param0) {
                        stackOut_7_0 = stackIn_7_0;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L4;
                      } else {
                        stackOut_6_0 = stackIn_6_0;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        break L4;
                      }
                    }
                    var12 = dna.b(stackIn_8_0, stackIn_8_1 != 0);
                    var13 = te.a(var2_int, (byte) 64);
                    var14 = vc.a(var2_int, 8, -16306);
                    var15 = vc.a(var2_int, 9, -16306);
                    var16 = vc.a(var2_int, 10, -16306);
                    var17 = vc.a(var2_int, 11, -16306);
                    var18 = vc.a(var2_int, 12, -16306);
                    var19 = mq.a(13, 207, var2_int);
                    var20 = oaa.a(-74, var2_int);
                    var21 = wg.a(var2_int, (byte) 83);
                    ag.a(var7, var4, var16, var15, var5, var19, var10, var13, var20, var21, var14, var12, var6, var8, var11, var9, var17, var3, var18, -4313);
                    break L3;
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("hga.D(").append(param0).append(',');
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
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        int discarded$1 = 0;
        int var4 = 0;
        var4 = 26 % ((param1 - -16) / 56);
        super.a(param0, (byte) -79, param2);
        qia.field_a.a(this.field_S, param2 + (this.field_p >> 1588310145), param0 - -103, 16777215, -1);
        if (null == this.field_V) {
          return;
        } else {
          dg.e(param2 + 20, param0 - -120 - 7, 260, 8421504);
          discarded$1 = qia.field_a.a(this.field_V, param2 - -20, 120 + param0 + 8, 260, 100, 16777215, -1, 1, 0, qia.field_a.field_u);
          return;
        }
    }

    final static ola n(int param0) {
        int var1 = -44 % ((param0 - -54) / 61);
        return new ola();
    }

    static {
    }
}
