/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja {
    private vna field_a;

    final void a(byte param0) {
        no var2 = (no) (this.field_a.f(-80));
        if (param0 >= -76) {
          int[] var3 = (int[]) null;
          this.a((byte) -64, (int[]) null);
        }
        if (var2 == null) {
          return;
        }
        var2.b((byte) -38);
    }

    final static void a(int param0, int param1, ht param2, int param3, int param4, int param5, int param6, boolean param7) {
        tv[][] stackIn_32_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        tv var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        tv[] var16 = null;
        int[] var17 = null;
        tv[] var18 = null;
        int[] var19 = null;
        int var10Lifetime1;
        int var13_intLifetime1;
        int var10Lifetime2;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted1 = true;
          if (param1 <= param5) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= ce.field_A.length) {
                if (var8_int == 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                rh.field_s = true;
                decompiledFrameCompleted1 = false;
                break;
              }
              var19 = ce.field_A[var9];
              var17 = var19;
              var10_ref_int__ = var17;
              var11 = 0;
              var12 = 0;
              L18: while (true) {
                if (var12 >= var19.length) {
                  if (var11 == 0 &&
                    param5 != fk.field_b) {
                    break L18;
                  }
                  var8_int = 0;
                  for (var12 = 0; var19.length > var12; var12 += 2) {
                    var13_int = var19[var12];
                    if (var13_int == -1) {
                      mm.field_g = true;
                    } else {
                      if (var13_int < param5) {
                        sda.field_f[var13_int] = true;
                      }
                    }
                  }
                  break L18;
                }
                var13_intLifetime1 = var19[var12];
                var14 = var10_ref_int__[var12 + 1];
                if (var13_intLifetime1 == -1) {
                  if (sg.field_u[param6] != var14) {
                    break L18;
                  }
                } else {
                  if (var13_intLifetime1 == param5 &&
                    param4 == var14) {
                    var11 = 1;
                  } else {
                    if (var13_intLifetime1 >= param5) {
                      break L18;
                    }
                    if (var14 != (tba.field_m[var13_intLifetime1] & 255)) {
                      break L18;
                    }
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
            stackIn_32_0 = bf.field_b;
            if (param5 == -1) {
              stackIn_33_1 = 1;
            } else {
              stackIn_33_1 = 4 + param5;
            }
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var16 = stackIn_32_0[stackIn_33_1];
            var18 = var16;
            var8 = var18;
            var9 = 1;
            if (param7) {
              if (param5 == -1) {
                for (var10 = 0; sg.field_u.length > var10; var10++) {
                  if ((vk.field_b[var10 / 8] & 1 << (7 & var10)) != 0) {
                    var9 = 0;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameCompleted0)) {
                for (var10Lifetime2 = 0; var10Lifetime2 < -1 + var16.length; var10Lifetime2++) {
                  if (0 == (tqa.field_e[(var10Lifetime2 + param3) / 8] & 1 << (param3 + var10Lifetime2 & 7))) {
                    continue;
                  }
                  var9 = 0;
                  break;
                }
                param3 = param3 + (um.field_m[param5] & 255);
              }
            }
            var10Lifetime1 = 0;
            var11 = 0;
            while (true) {
              if (param5 != -1) {
                stackIn_52_0 = var18.length - 1;
              } else {
                stackIn_52_0 = sg.field_u.length;
              }
              if (stackIn_52_0 <= var11) {
                if (var10Lifetime1 != 0) {
                  break;
                }
                for (var11 = 0; var11 < -1 + var18.length; var11++) {
                  if (param5 != -1) {
                    tba.field_m[param5] = (byte)var11;
                  } else {
                    param6 = var11;
                  }
                  cja.a(24, param1, param2, param3, param4, param5 + 1, param6, param7);
                  if (rh.field_s) {
                    return;
                  }
                }
                break;
              }
              if (param5 == -1) {
                param6 = var11;
              } else {
                tba.field_m[param5] = (byte)var11;
              }
              if (-1 == param5 &&
                1 == sg.field_u.length) {
                var12 = 1;
              } else {
                var13 = var8[var11 + 1];
                if (param7) {
                  if (!var13.field_cb) {
                    if (var9 != 0) {
                      stackIn_76_0 = (var13.field_X) ? 1 : 0;
                    } else {
                      stackIn_76_0 = 0;
                    }
                  } else {
                    stackIn_76_0 = 1;
                  }
                  var12 = stackIn_76_0;
                } else {
                  if (-1 == param5) {
                    stackIn_67_0 = (sg.field_u[var11] != uu.field_a.field_Jb) ? 0 : 1;
                  } else {
                    stackIn_67_0 = (var11 != (255 & uu.field_a.field_ac[param5])) ? 0 : 1;
                  }
                  var12 = stackIn_67_0;
                }
              }
              if (var12 != 0) {
                cja.a(127, param1, param2, param3, param4, 1 + param5, param6, param7);
                var10Lifetime1 = 1;
              }
              if (rh.field_s) {
                return;
              }
              var11++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_98_0 = var8_ref;
          stackIn_98_1 = new StringBuilder().append("cja.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
          cja.a(117);
        }
        if (gsa.field_y == kl.field_a) {
          return osa.field_p;
        }
        return rsa.field_u;
    }

    final void a(byte param0, int[] param1) {
        int var4 = 0;
        int[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 <= 5) {
            this.field_a = (vna) null;
          }
          var7 = param1;
          var3 = var7;
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            this.field_a.b((byte) -104, new no(rba.field_a, var5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("cja.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (vpa.a(param0 ^ -48) ||
          !dma.field_l.a(param0 - 60)) {
          return;
        }
        qh var2 = rba.field_a;
        if (var2 == null) {
          return;
        }
        if (param0 != -66) {
          return;
        }
        no var3 = (no) (this.field_a.f(param0 - 14));
        if (var3 == null) {
          return;
        }
        var3.a((byte) -109);
    }

    cja() {
        this.field_a = new vna();
    }

    static {
    }
}
