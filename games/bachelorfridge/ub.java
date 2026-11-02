/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub extends AnimationNode {
    static volatile boolean field_l;
    static sna field_k;
    gj field_o;
    static int field_j;
    private BoardChangeBatch field_n;
    private int field_m;

    public static void d(int param0) {
        if (param0 != 1) {
          return;
        }
        field_k = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        nc var4 = null;
        mha var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = BachelorFridge.field_y;
        try {
          var4 = (nc) (tb.field_c.b((byte) 90));
          while (var4 != null) {
            qn.a(param0, var4, -8692);
            var4 = (nc) (tb.field_c.c(0));
          }
          if (param1 != 1) {
            return;
          }
          var5 = (mha) (wba.field_g.b((byte) 90));
          while (var5 != null) {
            sja.a(param0, var5, true);
            var5 = (mha) (wba.field_g.c(param1 - 1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.wrapException((Throwable) ((Object) var2), "ub.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, uha param5, int param6, int param7) {
        gna[][] stackIn_36_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        gna[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        gna var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        gna[] var16 = null;
        int[] var17 = null;
        gna[] var18 = null;
        int[] var19 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = BachelorFridge.field_y;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param7 <= param4) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (pha.field_h.length <= var9) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                ShieldSpecial.field_q = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = pha.field_h[var9];
              var17 = var19;
              var10_ref_int__ = var17;
              var11 = 0;
              var12 = 0;
              scanLoop1: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    ld.field_q != param4) {
                    break scanLoop1;
                  }
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13_int = var19[var12];
                    if (var13_int != -1) {
                      if (var13_int < param4) {
                        ala.field_b[var13_int] = true;
                      }
                    } else {
                      uu.field_yb = true;
                    }
                  }
                  var8_int = 0;
                  break scanLoop1;
                }
                var13_intLifetime1 = var19[var12];
                var14 = var10_ref_int__[var12 + 1];
                if (var13_intLifetime1 != -1) {
                  if (param4 == var13_intLifetime1 &&
                    var14 == param3) {
                    var11 = 1;
                  } else {
                    if (param4 <= var13_intLifetime1) {
                      break scanLoop1;
                    }
                    if ((255 & bja.field_o[var13_intLifetime1]) != var14) {
                      break scanLoop1;
                    }
                  }
                } else {
                  if (qha.field_c[param6] != var14) {
                    break scanLoop1;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted1)) {
            stackIn_36_0 = gd.field_n;
            if (param4 == -1) {
              stackIn_37_1 = 1;
            } else {
              stackIn_37_1 = 4 + param4;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_36_0[stackIn_37_1];
            var18 = var16;
            var8 = var18;
            var9 = 1;
            if (param1) {
              if (param4 == -1) {
                for (var10 = 0; qha.field_c.length > var10; var10++) {
                  if ((LevitateEvent.field_r[var10 / 8] & 1 << (7 & var10)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10Lifetime2 = 0; var10Lifetime2 < var16.length - 1; var10Lifetime2++) {
                  if (0 == (MouseWheelInput.field_c[(var10Lifetime2 + param0) / 8] & 1 << (7 & param0 + var10Lifetime2))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param0 = param0 + (StampedeSpecial.field_s[param4] & 255);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              stackIn_55_0 = var11;
              if (param4 == -1) {
                stackIn_56_1 = qha.field_c.length;
              } else {
                stackIn_56_1 = var18.length - 1;
              }
              if (stackIn_55_0 >= stackIn_56_1) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var18.length - 1 > var11; var11++) {
                  if (param4 == -1) {
                    param6 = var11;
                  } else {
                    bja.field_o[param4] = (byte)var11;
                  }
                  ub.a(param0, param1, -93, param3, param4 + 1, param5, param6, param7);
                  if (ShieldSpecial.field_q) {
                    return;
                  }
                }
                break;
              }
              if (-1 != param4) {
                bja.field_o[param4] = (byte)var11;
              } else {
                param6 = var11;
              }
              if (param4 == -1 &&
                qha.field_c.length == 1) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (param1) {
                  if (!var13.field_t) {
                    if (var9 != 0) {
                      stackIn_80_0 = (var13.field_u) ? 1 : 0;
                    } else {
                      stackIn_80_0 = 0;
                    }
                  } else {
                    stackIn_80_0 = 1;
                  }
                  var12 = stackIn_80_0;
                } else {
                  if (-1 != param4) {
                    stackIn_71_0 = (var11 != (255 & SnowAnimation.field_w.field_Eb[param4])) ? 0 : 1;
                  } else {
                    stackIn_71_0 = (SnowAnimation.field_w.field_Pb != qha.field_c[var11]) ? 0 : 1;
                  }
                  var12 = stackIn_71_0;
                }
              }
              if (var12 != 0) {
                var10Lifetime1 = 1;
                ub.a(param0, param1, -73, param3, param4 + 1, param5, param6, param7);
              }
              if (ShieldSpecial.field_q) {
                return;
              }
              var11++;
            }
          }
          if (param2 >= -64) {
            ub.a(25, 91);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_105_0 = var8_ref;
          stackIn_105_1 = new StringBuilder().append("ub.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw pe.wrapException((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        int var4 = BachelorFridge.field_y;
        int fieldTemp$0 = this.field_m - 1;
        this.field_m = this.field_m - 1;
        if (fieldTemp$0 > 0) {
          return false;
        }
        this.field_o.field_h.a(23189);
        BoardChange var5 = (BoardChange) (this.field_n.field_k.b((byte) 90));
        while (var5 != null) {
          var5.a(this, -107);
          var5 = (BoardChange) (this.field_n.field_k.c(0));
        }
        int var3 = 81 % ((71 - param0) / 47);
        return true;
    }

    ub(gj param0, BoardChangeBatch param1) {
        try {
          this.field_m = 25;
          this.field_o = param0;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ub.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = true;
    }
}
