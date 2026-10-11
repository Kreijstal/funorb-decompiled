/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gva implements mb {
    private int[] field_a;
    static us field_b;

    public final void a(iq param0, byte param1, hr param2) {
        int stackIn_85_0 = 0;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        String stackIn_137_2 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_141_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ag var11 = null;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        nh var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        Object var24 = null;
        ka var24_ref = null;
        ka var25_ref_ka = null;
        int var25 = 0;
        int var26 = 0;
        ka var26_ref_ka = null;
        int var27 = 0;
        ka var28 = null;
        int var29 = 0;
        nh var19Lifetime1;
        Object var24Lifetime1;
        nh var19Lifetime2;
        int var20Lifetime1;
        int var26Lifetime1;
        int var20Lifetime2;
        int var26Lifetime2;
        var29 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2.g(param1 - 820)) {
            this.a(-14066, param0, param2);
            return;
          }
          var4 = this.field_a;
          var5 = param2.c(true);
          var6 = param2.i(0);
          var7 = param2.e(true);
          cr.a(var4, var7, var5, var6, (byte) 35);
          var8 = var4[0];
          var9 = var4[1];
          var10 = var4[2];
          if (var8 == -1 &&
            var9 == -1) {
            return;
          }
          var8 = var8 + uw.field_e;
          var9 = var9 + ps.field_N;
          var11 = (ag) (param0);
          var12 = var11.a(-862393232);
          var13 = (float)param2.e(0) / (float)param2.b(true);
          var14 = param2.c(param1 - 88);
          var15 = param2.b(-6782);
          var16 = (int)(var13 * (float)(var15 - var14) + (float)var14);
          var17 = 0 | (int)(255.0f * (-var13 + 1.0f)) << 24;
          var18 = (int)((1.0f - var13) * 255.0f) << 24 | 16777215;
          var21 = 5;
          if (param1 != -27) {
            return;
          }
          L1: {
            boolean decompiledFrameRemainder5 = true;
            boolean decompiledFrameRemainder4 = true;
            boolean decompiledFrameRemainder3 = true;
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameRemainder0 = true;
            var22 = param2.a(0);
            var23 = null;
            var24 = null;
            var26 = param2.a((byte) -114);
            if ((var26 != 4 && (var26 != 1 ||
              var29 != 0)) &&
              (decompiledFrameRemainder0 = (var26 != 2 ||
              var29 != 0)) &&
              (decompiledFrameRemainder1 = (var26 != 10)) &&
              (decompiledFrameRemainder2 = (var26 != 11)) &&
              (decompiledFrameRemainder3 = (var26 != 5 ||
              var29 != 0)) &&
              (decompiledFrameRemainder4 = (var26 != 12)) &&
              (decompiledFrameRemainder5 = (var26 != 6 ||
              var29 != 0))) {
              if (var26 == 7 &&
                var29 == 0) {
                var25_ref_ka = wma.a(4, 12166, 7);
                gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, -81), -83584144, var6, var5, var25_ref_ka, -393216 + var7);
                break L1;
              } else if (var26 != 14 ||
                var29 != 0) {
                if (9 == var26 &&
                  var29 == 0) {
                  var23 = ufa.field_e;
                } else {
                  if (var26 == 8 &&
                    var29 == 0) {
                    var23 = ufa.field_t;
                  } else {
                    if ((var26 != 15)) {
                      if (var26 == 16) {
                        if (var10 == 0) {
                          break L1;
                        }
                        var19 = ufa.field_r[1];
                        var20 = var16 * 512 * var12 / (var19.d() * var10);
                        var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, -61), 0, var18, 1);
                        if (var29 == 0) {
                          break L1;
                        }
                      }
                      var23 = ufa.field_d;
                    }
                  }
                }
                break L1;
              }
              var24Lifetime1 = null;
              if (var22 >= 33) {
                if (var22 < 66) {
                  var24_ref = koa.field_b[6];
                } else {
                  var24_ref = koa.field_b[7];
                }
              } else {
                var24_ref = koa.field_b[5];
              }
              gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 69), -83584144, var6, var5, var24_ref, var7);
              break L1;
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var26Lifetime2 = param2.e(0) * 255 / param2.b(true);
              stackIn_85_0 = (ova.c(param1 ^ -25)) ? 15 : 14;
              var27 = stackIn_85_0;
              var28 = wma.a(var27, param1 ^ -12189, 7).a((byte) 1, 526343, true);
              var28.O(var26Lifetime2 >> 2, 128, var26Lifetime2 >> 2);
              var28.a(-1, 10, 30, var26Lifetime2);
              gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 119), -83584144, var6, var5, var28, (883 * var6 + var5 * 233 & 255) + var7);
              if (var29 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2) &&
              (decompiledFrameRemainder1)) {
              if (var10 == 0) {
                break L1;
              }
              var19 = la.field_p[1][0];
              var20 = var16 * 8192 * var12 / (var19.d() * var10);
              var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 76), 0, var18, 1);
              if (var29 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3) &&
              (decompiledFrameRemainder2)) {
              if (0 == var10) {
                break L1;
              }
              var19 = la.field_p[2][0];
              var20 = var16 * (8192 * var12) / (var19.d() * var10);
              var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 83), 0, var18, 1);
              if (var29 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4) &&
              (decompiledFrameRemainder3)) {
              if (var10 == 0) {
                break L1;
              }
              var19 = la.field_p[3][0];
              var20 = var12 * 8192 * var16 / (var10 * var19.d());
              var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, -97), 0, var18, 1);
              if (var29 == 0) {
                break L1;
              }
            }
            if ((decompiledFrameRemainder5) &&
              (decompiledFrameRemainder4)) {
              if (0 == var10) {
                break L1;
              }
              var19Lifetime2 = la.field_p[4][0];
              var20Lifetime2 = var12 * 8192 * var16 / (var19Lifetime2.d() * var10);
              var19Lifetime2.a((float)var8, (float)var9, var20Lifetime2, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 126), 2, var17, 2);
              if (var29 == 0) {
                break L1;
              }
            }
            if (decompiledFrameRemainder5) {
              if (var10 == 0) {
                break L1;
              }
              var19Lifetime1 = la.field_p[5][0];
              var20Lifetime1 = var16 * (8192 * var12) / (var10 * var19Lifetime1.d());
              var19Lifetime1.a((float)var8, (float)var9, var20Lifetime1, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 95), 0, var18, 1);
              if (var29 == 0) {
                break L1;
              }
            }
            var26_ref_ka = wma.a(3, 12166, 7);
            gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 92), param1 ^ 83584149, var6, var5, var26_ref_ka, -393216 + var7);
          }
          if (var23 == null) {
            return;
          }
          var16 = (int)((float)var16 * (float)var12 / (float)var10);
          var25 = za.$cfr$intArgs$a$c604db63f465(0, 92, java.lang.reflect.Array.getLength(var23) - 1, java.lang.reflect.Array.getLength(var23) - (int)(var13 * (float)(-1 + java.lang.reflect.Array.getLength(var23))));
          var26Lifetime1 = Math.min(var25, java.lang.reflect.Array.getLength(var23) - 1);
          fja.a(var8, ((int[]) (var23))[var26Lifetime1], (byte) 123, 128, var16, var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_136_0 = var4_ref;
          stackIn_136_1 = new StringBuilder().append("gva.G(");
          if (param0 == null) {
            stackIn_137_2 = "null";
          } else {
            stackIn_137_2 = "{...}";
          }
          stackIn_140_1 = ((StringBuilder) (Object) stackIn_136_1).append(stackIn_137_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_141_2 = "null";
          } else {
            stackIn_141_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_136_0), ((StringBuilder) (Object) stackIn_140_1).append(stackIn_141_2).append(')').toString());
        }
    }

    public final void a(iq param0, int param1, lk param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a((byte) -98);
          var5 = param2.g((byte) -97);
          var6 = param2.b(52);
          var8 = -126 % ((param1 + 50) / 56);
          var7 = param2.b(false);
          oq.a(-(var6 / 2) + var4_int, var5 - var7 / 2, 0, 64, var6 / 2 + var4_int, 8965375, var7 / 2 + var5, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("gva.F(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(iq param0, boolean param1, ep param2) {
        ep stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        ep stackIn_46_0 = null;
        boolean stackIn_47_1 = false;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lqa var12 = null;
        ka var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2.e(param1) <= 0) {
            return;
          }
          var4 = this.field_a;
          var5 = param2.b((byte) 57);
          var6 = param2.c((byte) 93);
          var7 = param2.e((byte) -98);
          cr.a(var4, var7, var5, var6, (byte) 35);
          var8 = var4[0];
          var9 = var4[1];
          if (var8 == -1 &&
            var9 == -1) {
            return;
          }
          var8 = var8 + uw.field_e;
          var9 = var9 + ps.field_N;
          var14 = param2.l(5);
          switch ((var15 == 0
            || var14 == 0
            || var14 == 1
            || var14 == 3
            ) ? var14 : -1) {
            case 3:
              var11 = 16;
              var10 = param2.g(-1) * 255 / param2.e(false);
              var12 = uv.b(param1);
              if (null != var12 &&
                var12.field_f) {
                var11 = 15;
              }
              var13 = wma.a(var11, 12166, 7).a((byte) 1, 526343, true);
              var13.O(var10 << 2, 512, var10 << 2);
              stackIn_36_0 = (ep) (param2);
              stackIn_37_1 = !(param1);
              gqa.a(dfa.a(-(((ep) (Object) stackIn_36_0).f(stackIn_37_1) >> 2), 2048, -56), -83584144, var6, var5, var13, var7 + (255 & var6 * 883 + var5 * 233));
              if (var15 == 0) {
                return;
              }
            case 2:
              gqa.a(param2.f(true), -83584144, var6, var5, wma.a(0, 12166, 7), var7);
              if (var15 == 0) {
                return;
              }
            case 0:
              stackIn_46_0 = (ep) (param2);
              stackIn_47_1 = !(param1);
              gqa.a(dfa.a(-(((ep) (Object) stackIn_46_0).f(stackIn_47_1) >> 2), 2048, -96), -83584144, var6, var5, wma.a(1, 12166, 7), var7);
              if (var15 == 0) {
                return;
              }
            case 1:
            default:
              break;
          }
          gqa.a(dfa.a(-(param2.f(true) >> 2), 2048, 107), -83584144, var6, var5, wma.a(2, 12166, 7), var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_54_0 = var4_ref;
          stackIn_54_1 = new StringBuilder().append("gva.I(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 13908) {
            field_b = (us) null;
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gva.J(" + param0 + ')');
        }
    }

    private final void a(int param0, pca param1, mba param2, int param3, tqa param4, int param5) {
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        String stackIn_121_2 = null;
        StringBuilder stackIn_124_1 = null;
        String stackIn_125_2 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_129_2 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          var7_int = param1.field_h;
          if (var7_int != 0) {
            var8 = 1;
            var9 = this.a(param5, var7_int, param4, -1 + param3, 109) ? 1 : 0;
            var10 = this.a(param5, var7_int, param4, 1 + param3, -115) ? 1 : 0;
            var11 = this.a(param5 + 1, var7_int, param4, param3, 76) ? 1 : 0;
            var12 = this.a(-1 + param5, var7_int, param4, param3, 127) ? 1 : 0;
            var13 = 0;
            if (var9 != 0) {
              var13++;
            }
            if (var10 != 0) {
              var13++;
            }
            if (var11 != 0) {
              var13++;
            }
            if (var12 != 0) {
              var13++;
            }
            L6: {
              switch (var13) {
                case 3:
                  var14 = 0;
                  if (var9 != 0) {
                    if (var11 != 0) {
                      if (var10 != 0) {
                        if (var12 != 0) {
                          param2.g(-23801);
                        }
                        if (var12 == 0 ||
                          var19 != 0) {
                          param2.a(var8, 6, var14, (byte) 73);
                          if (var19 != 0) {
                            param2.a(var8, 4, var14, (byte) 73);
                            param2.a(var8, 2, var14, (byte) 73);
                            param2.a(var8, 0, var14, (byte) 73);
                          }
                        }} else {
                        param2.a(var8, 4, var14, (byte) 73);
                        if (var19 != 0) {
                          param2.a(var8, 2, var14, (byte) 73);
                          param2.a(var8, 0, var14, (byte) 73);
                        }
                      }
                    } else {
                      param2.a(var8, 2, var14, (byte) 73);
                      if (var19 != 0) {
                        param2.a(var8, 0, var14, (byte) 73);
                      }
                    }
                  } else {
                    param2.a(var8, 0, var14, (byte) 73);
                  }
                  if (var19 == 0) {
                    break L6;
                  }
                default:
                  break L6;
                case 2:
                  var14Lifetime2 = 1;
                  if (var9 == 0 ||
                    var12 == 0) {
                    if (var9 != 0 &&
                      var11 != 0) {
                      param2.a(var8, 1, var14Lifetime2, (byte) 73);
                    }
                    if (var9 == 0 ||
                      var11 == 0 || var19 != 0) {
                      if (var10 != 0 &&
                        var11 != 0) {
                        param2.a(var8, 3, var14Lifetime2, (byte) 73);
                      }
                      if (var10 == 0 ||
                        var11 == 0 || var19 != 0) {
                        if (var10 != 0 &&
                          var12 != 0) {
                          param2.a(var8, 5, var14Lifetime2, (byte) 73);
                          if (var19 != 0) {
                            param2.g(-23801);
                            param2.a(var8, 7, var14Lifetime2, (byte) 73);
                          }
                        } else {
                          param2.g(-23801);
                          if (var19 != 0) {
                            param2.a(var8, 7, var14Lifetime2, (byte) 73);
                          }
                        }
                      }}} else {
                    param2.a(var8, 7, var14Lifetime2, (byte) 73);
                  }
                case 4:
                  if (var13 == 4 ||
                    var19 != 0) {
                    var14Lifetime1 = this.a(-1 + param5, var7_int, param4, -1 + param3, param0 - 17861) ? 1 : 0;
                    var15 = this.a(1 + param5, var7_int, param4, param3 - 1, 116) ? 1 : 0;
                    var16 = this.a(1 + param5, var7_int, param4, 1 + param3, param0 ^ 17723) ? 1 : 0;
                    var17 = this.a(-1 + param5, var7_int, param4, 1 + param3, 87) ? 1 : 0;
                    var18 = 2;
                    if (var14Lifetime1 == 0) {
                      param2.a(var8, 7, var18, (byte) 73);
                    }
                    if (var14Lifetime1 != 0 ||
                      var19 != 0) {
                      if (var15 == 0) {
                        param2.a(var8, 1, var18, (byte) 73);
                      }
                      if (var15 != 0 ||
                        var19 != 0) {
                        if (var16 != 0) {
                          if (var17 != 0) {
                            param2.g(-23801);
                            if (var19 != 0) {
                              param2.a(var8, 5, var18, (byte) 73);
                              param2.a(var8, 3, var18, (byte) 73);
                            }
                          } else {
                            param2.a(var8, 5, var18, (byte) 73);
                            if (var19 != 0) {
                              param2.a(var8, 3, var18, (byte) 73);
                            }
                          }
                        } else {
                          param2.a(var8, 3, var18, (byte) 73);
                        }
                      }}}
                  break;
              }
            }
          }
          if (var7_int == 0 ||
            var19 != 0) {
            param2.g(-23801);
          }
          param2.g((byte) -94);
          if (param0 != 17767) {
            this.a((iq) null, -59, (lk) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_120_0 = var7;
          stackIn_120_1 = new StringBuilder().append("gva.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_121_2 = "null";
          } else {
            stackIn_121_2 = "{...}";
          }
          stackIn_124_1 = ((StringBuilder) (Object) stackIn_120_1).append(stackIn_121_2).append(',');
          if (param2 == null) {
            stackIn_125_2 = "null";
          } else {
            stackIn_125_2 = "{...}";
          }
          stackIn_128_1 = ((StringBuilder) (Object) stackIn_124_1).append(stackIn_125_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_129_2 = "null";
          } else {
            stackIn_129_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_120_0), ((StringBuilder) (Object) stackIn_128_1).append(stackIn_129_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void a(int param0, la param1) {
        RuntimeException runtimeException = null;
        tqa var3 = null;
        int var4 = 0;
        int var5 = 0;
        pca var6 = null;
        int var7 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          var3 = param1.f((byte) 93);
          if (param0 <= 34) {
            return;
          }
          var4 = 0;
          while (var4 < var3.a(-119)) {
            if (var7 != 0) {
              return;
            }
            var5 = 0;
            while (var3.c(40) > var5) {
              var6 = var3.a(110, var4, var5);
              if (null == var6.b((byte) -100)) {
                var6.a(3, new mba());
              }
              var5++;
            }
            var4++;
          }
          this.a(param1, var3.a(109) - 1, 0, 2048, 0, var3.c(77) - 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_23_0 = runtimeException;
          stackIn_23_1 = new StringBuilder().append("gva.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ofa.field_D = param0;
          jsa.a(false, 12);
          if (param1 >= -24) {
            gva.a(-102);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gva.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, tqa param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param2.a(param3, (byte) 48, param0)) {
            return true;
          }
          var6_int = 55 / ((35 - param4) / 37);
          stackIn_9_0 = (~param2.a(55, param0, param3).field_h == ~param1);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("gva.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, iq param1, hr param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        try {
          if (param0 != -14066) {
            return;
          }
          var4_int = param2.c(-71);
          var5 = this.field_a;
          cr.a(var5, param2.e(true), param2.c(true), param2.i(0), (byte) 35);
          var6 = var5[0];
          var7 = var5[1];
          var8 = (float)param2.e(param0 + 14066) / (float)param2.b(true);
          var9 = (int)(255.0f - 255.0f * var8);
          if (era.field_g != null) {
            var10 = param2.a(false);
            var11 = var4_int >> 16;
            var12 = 8 + era.field_g.c(var10, var11);
            var13 = 8 + era.field_g.a(var10, var11, 0);
            rba.a(var9 / 2, var13, 0, var12, (byte) 114, var7 - var13 / 2, var6 - var12 / 2);
            dh.a(kn.field_p, var9, 1, 0, var6 - var11 / 2, var11, param2.d(115), -(var11 / 2) + var7, 0, 29870, 1, var11, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("gva.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public gva() {
        this.field_a = new int[3];
    }

    public final void a(mda param0, int param1, iq param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        try {
          if (param1 != 95) {
            gva.a(-15);
          }
          var4_int = param0.t(1);
          var5 = param0.r(-77);
          var6 = param0.d(3);
          var7 = param0.e(param1 + 9553);
          if (var5 == 0) {
            oq.a(-(var4_int / 2) + var6, var7 - var4_int / 2, 0, 128, var4_int / 2 + var6, 14544639, var7 + var4_int / 2, true);
            if (!TombRacer.field_G) {
              return;
            }
          }
          if (var5 == 1) {
            oq.a(-(var4_int / 2) + var6, -(var4_int / 2) + var7, 0, 192, var6 + var4_int / 2, 5623039, var4_int / 2 + var7, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("gva.K(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void a(la param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        tqa var7 = null;
        int var8 = 0;
        int var9 = 0;
        pca var10 = null;
        int var11 = 0;
        int stackIn_5_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var7 = param0.f((byte) 93);
          if (param3 != 2048) {
            return;
          }
          var8 = param4;
          L0: while (true) {
            stackIn_5_0 = ~param1;
            if (stackIn_5_0 <= ~var8) {
              if (var11 != 0) {
                return;
              }
              var9 = param2;
              while (param5 >= var9) {
                var10 = var7.a(104, var8, var9);
                stackOut_9_0 = var10.b((byte) -100) instanceof mba;
                stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                stackIn_10_0 = stackOut_9_0;
                if (stackIn_10_0) {
                  this.a(17767, var10, (mba) (var10.b((byte) -128)), var9, var7, var8);
                }
                var9++;
              }
              var8++;
              continue L0;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_19_0 = runtimeException;
          stackIn_19_1 = new StringBuilder().append("gva.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
    }
}
