/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an extends hh {
    static String field_C;
    static String field_D;
    static int field_w;
    static String field_y;
    private pi[] field_B;
    static String[] field_F;
    static int field_E;
    private pi field_A;
    static String field_x;
    static String field_z;

    final pi a(int param0, byte param1) {
        if (param1 > -81) {
            cn[] var4 = (cn[]) null;
            this.a(65, (cn[]) null, -101);
        }
        pi dupTemp$0 = new pi();
        this.field_B[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(byte param0, cn param1) {
        pi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = this.field_B;
            var3 = var7;
            if (param0 == 47) {
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_d = param1;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("an.HA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0, byte param1, int param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_3_0 = null;
        String stackOut_5_0 = null;
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
              if (param1 == -109) {
                break L1;
              } else {
                an.c(26);
                break L1;
              }
            }
            L2: {
              if (param3 == null) {
                stackOut_4_0 = ng.field_K;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (String) (param3);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            param3 = stackIn_5_0;
            stackOut_5_0 = ln.a(param2, ib.a((byte) -126, param0, param3), 255);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("an.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    public static void c(int param0) {
        field_y = null;
        field_z = null;
        if (param0 != -13023) {
            field_y = (String) null;
        }
        field_x = null;
        field_C = null;
        field_F = null;
        field_D = null;
    }

    an(an param0, boolean param1) {
        this();
        try {
            param0.a(0, (an) (this), param1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "an.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, qg param8) {
        try {
            of.field_d = param4;
            ri.field_b = param0;
            ng.field_I = param6;
            lk.field_T = param3;
            kn.field_f = param8;
            if (param2 >= -55) {
                field_w = -6;
            }
            bf.field_k = param1;
            j.field_J = param5;
            pj.field_a = param7;
            hb.field_a = (bb) ((Object) new tp());
            na.field_y = new cc(param8);
            bl.field_r = new je(hb.field_a, na.field_y);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "an.EA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(byte param0, lm param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        pi var7 = null;
        pi var9 = null;
        cn[] var10 = null;
        ck var11 = null;
        pi var12 = null;
        pi var13 = null;
        pi var14 = null;
        pi var15 = null;
        lm stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        lm stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (param1 instanceof ck) {
                stackOut_2_0 = (lm) (param1);
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (lm) ((Object) stackOut_1_0);
                break L1;
              }
            }
            L2: {
              var11 = (ck) ((Object) stackIn_3_0);
              d.a(param1.field_q + param2, param1.field_s + (param1.field_v + param3), param1.field_x + param2 + param1.field_q, param1.field_v + param3, false);
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_B;
                break L2;
              }
            }
            L3: {
              var7 = this.field_B[0];
              this.field_A.b(0);
              var7.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
              if (var11 != null) {
                L4: {
                  if (!var11.field_E) {
                    break L4;
                  } else {
                    var12 = this.field_B[1];
                    if (var12 == null) {
                      break L4;
                    } else {
                      var12.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
                      break L4;
                    }
                  }
                }
                if (!var11.field_u) {
                  break L3;
                } else {
                  L5: {
                    var13 = this.field_B[3];
                    if (-1 == (var11.field_y ^ -1)) {
                      break L5;
                    } else {
                      if (var13 != null) {
                        var13.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var9 = this.field_B[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L6: {
              if (param1.a((byte) 20)) {
                var14 = this.field_B[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param4) {
                break L7;
              } else {
                var15 = this.field_B[4];
                if (var15 != null) {
                  var15.a(param1, (byte) 100, this.field_A, param3, (an) (this), param2);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              this.field_A.a(0, param1, param3, param2, (an) (this));
              ti.c(true);
              if (param0 == 34) {
                break L8;
              } else {
                var10 = (cn[]) null;
                this.a(117, (cn[]) null, 121);
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var6);
            stackOut_28_1 = new StringBuilder().append("an.B(").append(param0).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, cn[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (this.field_B[var4_int] == null) {
                this.field_B[var4_int] = new pi();
            }
            int var5 = -96 % ((-66 - param2) / 49);
            this.field_B[param0].field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "an.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(cn[] param0, int param1) {
        pi[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pi var5 = null;
        int var6 = 0;
        pi[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = DungeonAssault.field_K;
        try {
          L0: {
            var7 = this.field_B;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_e = param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("an.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, an param1, boolean param2) {
        pi dupTemp$25 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        pi var5 = null;
        pi var6 = null;
        int var7 = 0;
        pi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pi stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pi stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        pi stackIn_11_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pi stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        pi stackOut_10_2 = null;
        pi stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pi stackOut_9_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                an.c(98);
                break L1;
              }
            }
            L2: {
              super.a((byte) 127, param1);
              if (param2) {
                var4_int = 0;
                L3: while (true) {
                  if (-7 >= (var4_int ^ -1)) {
                    break L2;
                  } else {
                    L4: {
                      var5 = this.field_B[var4_int];
                      if (var5 == null) {
                        param1.field_B[var4_int] = null;
                        break L4;
                      } else {
                        L5: {
                          var6 = param1.field_B[var4_int];
                          stackOut_8_0 = (pi) (var5);
                          stackOut_8_1 = 1;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_10_1 = stackOut_8_1;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          if (var6 != null) {
                            stackOut_10_0 = (pi) ((Object) stackIn_10_0);
                            stackOut_10_1 = stackIn_10_1;
                            stackOut_10_2 = (pi) (var6);
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            break L5;
                          } else {
                            dupTemp$25 = new pi();
                            param1.field_B[var4_int] = dupTemp$25;
                            stackOut_9_0 = (pi) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (pi) (dupTemp$25);
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            stackIn_11_2 = stackOut_9_2;
                            break L5;
                          }
                        }
                        ((pi) (Object) stackIn_11_0).a(stackIn_11_1 != 0, stackIn_11_2);
                        break L4;
                      }
                    }
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                cj.a(this.field_B, 0, param1.field_B, 0, 6);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("an.E(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    public an() {
        this.field_B = new pi[6];
        this.field_A = new pi();
        pi dupTemp$0 = new pi();
        this.field_B[0] = dupTemp$0;
        pi var1 = dupTemp$0;
        var1.b(0);
    }

    static {
        field_C = "You gain an additional 1 Renown per hour.";
        field_D = "When entering a trap room, the only choice is to continue. The trap must first attempt to detect a raider by rolling it's Detect against a raider's Sneak. If the raider is detected, they must then attempt to Dodge (against the trap's Snare). If the raider fails both rolls, the trap is triggered.";
        field_y = "TRAP";
        field_F = new String[]{"First Strike", "The <%0> has a penchant for wildly charging into combat; such is the speed of his attack, he is guaranteed the first strike even against the most watchful of adversaries."};
        field_z = "Player names can be up to 12 letters, numbers and underscores";
        field_x = "Vampires have an eternal thirst for raider blood; they're strong, fast and very hard to kill.<br><br>Each time this monster kills, its <%attack> and <%defence> increase by 1.";
    }
}
