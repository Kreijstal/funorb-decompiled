/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gva implements mb {
    private int[] field_a;
    static us field_b;

    public final void a(iq param0, byte param1, hr param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
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
        int var25 = 0;
        ka var25_ref_ka = null;
        int var26 = 0;
        ka var26_ref_ka = null;
        int var27 = 0;
        ka var28 = null;
        int var29 = 0;
        int stackIn_85_0 = 0;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        RuntimeException stackIn_136_0 = null;
        StringBuilder stackIn_136_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_84_0 = 0;
        int stackOut_82_0 = 0;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        RuntimeException stackOut_136_0 = null;
        StringBuilder stackOut_136_1 = null;
        String stackOut_136_2 = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        String stackOut_134_2 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        String stackOut_140_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        var29 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.g(param1 + -820)) {
              this.a(-14066, param0, param2);
              return;
            } else {
              L1: {
                var4_array = ((gva) this).field_a;
                var5 = param2.c(true);
                var6 = param2.i(0);
                var7 = param2.e(true);
                cr.a(var4_array, var7, var5, var6, (byte) 35);
                var8 = var4_array[0];
                var9 = var4_array[1];
                var10 = var4_array[2];
                if (var8 != -1) {
                  break L1;
                } else {
                  if (var9 == -1) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              var8 = var8 + uw.field_e;
              var9 = var9 + ps.field_N;
              var11 = (ag) (Object) param0;
              var12 = var11.a(-862393232);
              var13 = (float)param2.e(0) / (float)param2.b(true);
              var14 = param2.c(param1 + -88);
              var15 = param2.b(-6782);
              var16 = (int)(var13 * (float)(var15 + -var14) + (float)var14);
              var17 = (int)(255.0f * (-var13 + 1.0f)) << 24;
              var18 = (int)((1.0f - var13) * 255.0f) << 24 | 16777215;
              var21 = 5;
              if (param1 == -27) {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        L6: {
                          L7: {
                            L8: {
                              L9: {
                                var22 = param2.a(0);
                                var23 = null;
                                var24 = null;
                                var26 = param2.a((byte) -114);
                                if (var26 == 4) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var26 != 1) {
                                      break L10;
                                    } else {
                                      if (var29 == 0) {
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var26 != 2) {
                                      break L11;
                                    } else {
                                      if (var29 == 0) {
                                        break L8;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (var26 == 10) {
                                    break L7;
                                  } else {
                                    if (var26 == 11) {
                                      break L6;
                                    } else {
                                      L12: {
                                        if (var26 != 5) {
                                          break L12;
                                        } else {
                                          if (var29 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      if (var26 == 12) {
                                        break L4;
                                      } else {
                                        L13: {
                                          if (var26 != 6) {
                                            break L13;
                                          } else {
                                            if (var29 == 0) {
                                              break L3;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        L14: {
                                          L15: {
                                            if (var26 != 7) {
                                              break L15;
                                            } else {
                                              if (var29 == 0) {
                                                var25_ref_ka = wma.a(4, 12166, 7);
                                                gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, -81), -83584144, var6, var5, var25_ref_ka, -393216 + var7);
                                                if (var29 == 0) {
                                                  break L2;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var26 != 14) {
                                              break L16;
                                            } else {
                                              if (var29 == 0) {
                                                break L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (9 != var26) {
                                              break L17;
                                            } else {
                                              if (var29 == 0) {
                                                var23 = (Object) (Object) ufa.field_e;
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (var26 != 8) {
                                              break L18;
                                            } else {
                                              if (var29 == 0) {
                                                var23 = (Object) (Object) ufa.field_t;
                                                break L2;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          if (var26 == 15) {
                                            break L2;
                                          } else {
                                            L19: {
                                              if (var26 == 16) {
                                                if (var10 != 0) {
                                                  var19 = ufa.field_r[1];
                                                  var20 = var16 * 512 * var12 / (var19.d() * var10);
                                                  var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, -61), 0, var18, 1);
                                                  if (var29 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L19;
                                                  }
                                                } else {
                                                  break L2;
                                                }
                                              } else {
                                                break L19;
                                              }
                                            }
                                            var23 = (Object) (Object) ufa.field_d;
                                            break L2;
                                          }
                                        }
                                        L20: {
                                          var24 = null;
                                          if (var22 >= 33) {
                                            if (var22 < 66) {
                                              var24_ref = koa.field_b[6];
                                              break L20;
                                            } else {
                                              var24_ref = koa.field_b[7];
                                              break L20;
                                            }
                                          } else {
                                            var24_ref = koa.field_b[5];
                                            break L20;
                                          }
                                        }
                                        gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 69), -83584144, var6, var5, var24_ref, var7);
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                              L21: {
                                var26 = param2.e(0) * 255 / param2.b(true);
                                if (ova.c(param1 ^ -25)) {
                                  stackOut_84_0 = 15;
                                  stackIn_85_0 = stackOut_84_0;
                                  break L21;
                                } else {
                                  stackOut_82_0 = 14;
                                  stackIn_85_0 = stackOut_82_0;
                                  break L21;
                                }
                              }
                              var27 = stackIn_85_0;
                              var28 = wma.a(var27, param1 ^ -12189, 7).a((byte) 1, 526343, true);
                              var28.O(var26 >> 2, 128, var26 >> 2);
                              var28.a(-1, 10, 30, var26);
                              gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 119), -83584144, var6, var5, var28, (883 * var6 + var5 * 233 & 255) + var7);
                              if (var29 == 0) {
                                break L2;
                              } else {
                                break L8;
                              }
                            }
                            if (var10 != 0) {
                              var19 = la.field_p[1][0];
                              var20 = var16 * 8192 * var12 / (var19.d() * var10);
                              var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 76), 0, var18, 1);
                              if (var29 == 0) {
                                break L2;
                              } else {
                                break L7;
                              }
                            } else {
                              break L2;
                            }
                          }
                          if (0 == var10) {
                            break L2;
                          } else {
                            var19 = la.field_p[2][0];
                            var20 = var16 * (8192 * var12) / (var19.d() * var10);
                            var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 83), 0, var18, 1);
                            if (var29 == 0) {
                              break L2;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (var10 != 0) {
                          var19 = la.field_p[3][0];
                          var20 = var12 * 8192 * var16 / (var10 * var19.d());
                          var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, -97), 0, var18, 1);
                          if (var29 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          break L2;
                        }
                      }
                      if (0 == var10) {
                        break L2;
                      } else {
                        var19 = la.field_p[4][0];
                        var20 = var12 * 8192 * var16 / (var19.d() * var10);
                        var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 126), 2, var17, 2);
                        if (var29 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var10 != 0) {
                      var19 = la.field_p[5][0];
                      var20 = var16 * (8192 * var12) / (var10 * var19.d());
                      var19.a((float)var8, (float)var9, var20, dfa.a(param2.f((byte) -127) << var21, 2048 << var21, 95), 0, var18, 1);
                      if (var29 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      break L2;
                    }
                  }
                  var26_ref_ka = wma.a(3, 12166, 7);
                  gqa.a(dfa.a(-(param2.f((byte) -127) >> 2), 2048, 92), param1 ^ 83584149, var6, var5, var26_ref_ka, -393216 + var7);
                  break L2;
                }
                if (var23 == null) {
                  return;
                } else {
                  var16 = (int)((float)var16 * (float)var12 / (float)var10);
                  var25 = za.a(0, (byte) 92, ((Object[]) var23).length + -1, ((Object[]) var23).length + -(int)(var13 * (float)(-1 + ((Object[]) var23).length)));
                  var26 = Math.min(var25, ((Object[]) var23).length - 1);
                  fja.a(var8, ((int[]) var23)[var26], (byte) 123, 128, var16, var9);
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_133_0 = (RuntimeException) var4;
            stackOut_133_1 = new StringBuilder().append("gva.G(");
            stackIn_136_0 = stackOut_133_0;
            stackIn_136_1 = stackOut_133_1;
            stackIn_134_0 = stackOut_133_0;
            stackIn_134_1 = stackOut_133_1;
            if (param0 == null) {
              stackOut_136_0 = (RuntimeException) (Object) stackIn_136_0;
              stackOut_136_1 = (StringBuilder) (Object) stackIn_136_1;
              stackOut_136_2 = "null";
              stackIn_137_0 = stackOut_136_0;
              stackIn_137_1 = stackOut_136_1;
              stackIn_137_2 = stackOut_136_2;
              break L22;
            } else {
              stackOut_134_0 = (RuntimeException) (Object) stackIn_134_0;
              stackOut_134_1 = (StringBuilder) (Object) stackIn_134_1;
              stackOut_134_2 = "{...}";
              stackIn_137_0 = stackOut_134_0;
              stackIn_137_1 = stackOut_134_1;
              stackIn_137_2 = stackOut_134_2;
              break L22;
            }
          }
          L23: {
            stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
            stackOut_137_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',').append(param1).append(',');
            stackIn_140_0 = stackOut_137_0;
            stackIn_140_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param2 == null) {
              stackOut_140_0 = (RuntimeException) (Object) stackIn_140_0;
              stackOut_140_1 = (StringBuilder) (Object) stackIn_140_1;
              stackOut_140_2 = "null";
              stackIn_141_0 = stackOut_140_0;
              stackIn_141_1 = stackOut_140_1;
              stackIn_141_2 = stackOut_140_2;
              break L23;
            } else {
              stackOut_138_0 = (RuntimeException) (Object) stackIn_138_0;
              stackOut_138_1 = (StringBuilder) (Object) stackIn_138_1;
              stackOut_138_2 = "{...}";
              stackIn_141_0 = stackOut_138_0;
              stackIn_141_1 = stackOut_138_1;
              stackIn_141_2 = stackOut_138_2;
              break L23;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_141_0, stackIn_141_2 + ')');
        }
    }

    public final void a(iq param0, int param1, lk param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            var4_int = param2.a((byte) -98);
            var5 = param2.g((byte) -97);
            var6 = param2.b(52);
            var8 = -126 % ((param1 - -50) / 56);
            var7 = param2.b(false);
            oq.a(-(var6 / 2) + var4_int, var5 + -(var7 / 2), 0, 64, var6 / 2 + var4_int, 8965375, var7 / 2 + var5, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("gva.F(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_6_0;
            stackIn_9_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public final void a(iq param0, boolean param1, ep param2) {
        RuntimeException var4 = null;
        int[] var4_array = null;
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
        ep stackIn_34_0 = null;
        ep stackIn_36_0 = null;
        ep stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        ep stackIn_42_0 = null;
        ep stackIn_44_0 = null;
        ep stackIn_46_0 = null;
        ep stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        ep stackOut_33_0 = null;
        ep stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        ep stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        ep stackOut_41_0 = null;
        ep stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        ep stackOut_42_0 = null;
        ep stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.e(param1) <= 0) {
              return;
            } else {
              L1: {
                var4_array = ((gva) this).field_a;
                var5 = param2.b((byte) 57);
                var6 = param2.c((byte) 93);
                var7 = param2.e((byte) -98);
                cr.a(var4_array, var7, var5, var6, (byte) 35);
                var8 = var4_array[0];
                var9 = var4_array[1];
                if (var8 != -1) {
                  break L1;
                } else {
                  if (var9 == -1) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  L4: {
                    L5: {
                      var8 = var8 + uw.field_e;
                      var9 = var9 + ps.field_N;
                      var14 = param2.l(5);
                      if (var14 == 3) {
                        L6: {
                          var11 = 16;
                          var10 = param2.g(-1) * 255 / param2.e(false);
                          var12 = uv.b(param1);
                          if (null == var12) {
                            break L6;
                          } else {
                            if (var12.field_f) {
                              var11 = 15;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var13 = wma.a(var11, 12166, 7).a((byte) 1, 526343, true);
                          var13.O(var10 << 2, 512, var10 << 2);
                          stackOut_33_0 = (ep) param2;
                          stackIn_36_0 = stackOut_33_0;
                          stackIn_34_0 = stackOut_33_0;
                          if (param1) {
                            stackOut_36_0 = (ep) (Object) stackIn_36_0;
                            stackOut_36_1 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            break L7;
                          } else {
                            stackOut_34_0 = (ep) (Object) stackIn_34_0;
                            stackOut_34_1 = 1;
                            stackIn_37_0 = stackOut_34_0;
                            stackIn_37_1 = stackOut_34_1;
                            break L7;
                          }
                        }
                        gqa.a(dfa.a(-(((ep) (Object) stackIn_37_0).f(stackIn_37_1 != 0) >> 2), 2048, -56), -83584144, var6, var5, var13, var7 + (255 & var6 * 883 + var5 * 233));
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        L8: {
                          if (var14 != 2) {
                            break L8;
                          } else {
                            if (var15 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (var14 == 0) {
                          break L4;
                        } else {
                          if (var14 == 1) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    gqa.a(param2.f(true), -83584144, var6, var5, wma.a(0, 12166, 7), var7);
                    if (var15 == 0) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                  L9: {
                    stackOut_41_0 = (ep) param2;
                    stackIn_46_0 = stackOut_41_0;
                    stackIn_42_0 = stackOut_41_0;
                    if (param1) {
                      stackOut_46_0 = (ep) (Object) stackIn_46_0;
                      stackOut_46_1 = 0;
                      stackIn_47_0 = stackOut_46_0;
                      stackIn_47_1 = stackOut_46_1;
                      break L9;
                    } else {
                      stackOut_42_0 = (ep) (Object) stackIn_42_0;
                      stackIn_44_0 = stackOut_42_0;
                      stackOut_44_0 = (ep) (Object) stackIn_44_0;
                      stackOut_44_1 = 1;
                      stackIn_47_0 = stackOut_44_0;
                      stackIn_47_1 = stackOut_44_1;
                      break L9;
                    }
                  }
                  gqa.a(dfa.a(-(((ep) (Object) stackIn_47_0).f(stackIn_47_1 != 0) >> 2), 2048, -96), -83584144, var6, var5, wma.a(1, 12166, 7), var7);
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                gqa.a(dfa.a(-(param2.f(true) >> 2), 2048, 107), -83584144, var6, var5, wma.a(2, 12166, 7), var7);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_51_0 = (RuntimeException) var4;
            stackOut_51_1 = new StringBuilder().append("gva.I(");
            stackIn_54_0 = stackOut_51_0;
            stackIn_54_1 = stackOut_51_1;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            if (param0 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L10;
            } else {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "{...}";
              stackIn_55_0 = stackOut_52_0;
              stackIn_55_1 = stackOut_52_1;
              stackIn_55_2 = stackOut_52_2;
              break L10;
            }
          }
          L11: {
            stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param1).append(',');
            stackIn_58_0 = stackOut_55_0;
            stackIn_58_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param2 == null) {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "null";
              stackIn_59_0 = stackOut_58_0;
              stackIn_59_1 = stackOut_58_1;
              stackIn_59_2 = stackOut_58_2;
              break L11;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_59_0 = stackOut_56_0;
              stackIn_59_1 = stackOut_56_1;
              stackIn_59_2 = stackOut_56_2;
              break L11;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_59_0, stackIn_59_2 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 13908) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "gva.J(" + param0 + ')');
        }
    }

    private final void a(int param0, pca param1, mba param2, int param3, tqa param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
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
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        RuntimeException stackIn_122_0 = null;
        StringBuilder stackIn_122_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        RuntimeException stackIn_129_0 = null;
        StringBuilder stackIn_129_1 = null;
        String stackIn_129_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        RuntimeException stackOut_120_0 = null;
        StringBuilder stackOut_120_1 = null;
        String stackOut_120_2 = null;
        RuntimeException stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        RuntimeException stackOut_121_0 = null;
        StringBuilder stackOut_121_1 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        String stackOut_122_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_128_0 = null;
        StringBuilder stackOut_128_1 = null;
        String stackOut_128_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var7_int = param1.field_h;
                if (var7_int == 0) {
                  break L2;
                } else {
                  L3: {
                    var8 = 1;
                    var9 = this.a(param5, var7_int, param4, -1 + param3, 109) ? 1 : 0;
                    var10 = this.a(param5, var7_int, param4, 1 + param3, -115) ? 1 : 0;
                    var11 = this.a(param5 + 1, var7_int, param4, param3, 76) ? 1 : 0;
                    var12 = this.a(-1 + param5, var7_int, param4, param3, 127) ? 1 : 0;
                    var13 = 0;
                    if (var9 != 0) {
                      var13++;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var10 != 0) {
                      var13++;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (var11 == 0) {
                      break L5;
                    } else {
                      var13++;
                      break L5;
                    }
                  }
                  L6: {
                    if (var12 != 0) {
                      var13++;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    L8: {
                      if (var13 == 4) {
                        break L8;
                      } else {
                        L9: {
                          if (var13 != 3) {
                            break L9;
                          } else {
                            L10: {
                              L11: {
                                var14 = 0;
                                if (var9 == 0) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var11 == 0) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var10 == 0) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (var12 == 0) {
                                              break L14;
                                            } else {
                                              param2.g(-23801);
                                              if (var19 == 0) {
                                                break L10;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          param2.a(var8, 6, var14, (byte) 73);
                                          if (var19 == 0) {
                                            break L10;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      param2.a(var8, 4, var14, (byte) 73);
                                      if (var19 == 0) {
                                        break L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  param2.a(var8, 2, var14, (byte) 73);
                                  if (var19 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              param2.a(var8, 0, var14, (byte) 73);
                              break L10;
                            }
                            if (var19 == 0) {
                              break L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (var13 != 2) {
                          break L7;
                        } else {
                          L15: {
                            L16: {
                              L17: {
                                var14 = 1;
                                if (var9 == 0) {
                                  break L17;
                                } else {
                                  if (var12 != 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (var9 == 0) {
                                  break L18;
                                } else {
                                  if (var11 == 0) {
                                    break L18;
                                  } else {
                                    param2.a(var8, 1, var14, (byte) 73);
                                    if (var19 == 0) {
                                      break L15;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (var10 == 0) {
                                  break L19;
                                } else {
                                  if (var11 == 0) {
                                    break L19;
                                  } else {
                                    param2.a(var8, 3, var14, (byte) 73);
                                    if (var19 == 0) {
                                      break L15;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              L20: {
                                if (var10 == 0) {
                                  break L20;
                                } else {
                                  if (var12 == 0) {
                                    break L20;
                                  } else {
                                    param2.a(var8, 5, var14, (byte) 73);
                                    if (var19 == 0) {
                                      break L15;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              param2.g(-23801);
                              if (var19 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                            param2.a(var8, 7, var14, (byte) 73);
                            break L15;
                          }
                          if (var19 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    L21: {
                      var14 = this.a(-1 + param5, var7_int, param4, -1 + param3, param0 + -17861) ? 1 : 0;
                      var15 = this.a(1 + param5, var7_int, param4, param3 + -1, 116) ? 1 : 0;
                      var16 = this.a(1 + param5, var7_int, param4, 1 + param3, param0 ^ 17723) ? 1 : 0;
                      var17 = this.a(-1 + param5, var7_int, param4, 1 + param3, 87) ? 1 : 0;
                      var18 = 2;
                      if (var14 != 0) {
                        break L21;
                      } else {
                        param2.a(var8, 7, var18, (byte) 73);
                        if (var19 == 0) {
                          break L7;
                        } else {
                          break L21;
                        }
                      }
                    }
                    L22: {
                      if (var15 != 0) {
                        break L22;
                      } else {
                        param2.a(var8, 1, var18, (byte) 73);
                        if (var19 == 0) {
                          break L7;
                        } else {
                          break L22;
                        }
                      }
                    }
                    L23: {
                      if (var16 == 0) {
                        break L23;
                      } else {
                        L24: {
                          if (var17 == 0) {
                            break L24;
                          } else {
                            param2.g(-23801);
                            if (var19 == 0) {
                              break L7;
                            } else {
                              break L24;
                            }
                          }
                        }
                        param2.a(var8, 5, var18, (byte) 73);
                        if (var19 == 0) {
                          break L7;
                        } else {
                          break L23;
                        }
                      }
                    }
                    param2.a(var8, 3, var18, (byte) 73);
                    break L7;
                  }
                  if (var19 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              param2.g(-23801);
              break L1;
            }
            L25: {
              param2.g((byte) -94);
              if (param0 == 17767) {
                break L25;
              } else {
                ((gva) this).a((iq) null, -59, (lk) null);
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var7 = decompiledCaughtException;
            stackOut_117_0 = (RuntimeException) var7;
            stackOut_117_1 = new StringBuilder().append("gva.H(").append(param0).append(',');
            stackIn_120_0 = stackOut_117_0;
            stackIn_120_1 = stackOut_117_1;
            stackIn_118_0 = stackOut_117_0;
            stackIn_118_1 = stackOut_117_1;
            if (param1 == null) {
              stackOut_120_0 = (RuntimeException) (Object) stackIn_120_0;
              stackOut_120_1 = (StringBuilder) (Object) stackIn_120_1;
              stackOut_120_2 = "null";
              stackIn_121_0 = stackOut_120_0;
              stackIn_121_1 = stackOut_120_1;
              stackIn_121_2 = stackOut_120_2;
              break L26;
            } else {
              stackOut_118_0 = (RuntimeException) (Object) stackIn_118_0;
              stackOut_118_1 = (StringBuilder) (Object) stackIn_118_1;
              stackOut_118_2 = "{...}";
              stackIn_121_0 = stackOut_118_0;
              stackIn_121_1 = stackOut_118_1;
              stackIn_121_2 = stackOut_118_2;
              break L26;
            }
          }
          L27: {
            stackOut_121_0 = (RuntimeException) (Object) stackIn_121_0;
            stackOut_121_1 = ((StringBuilder) (Object) stackIn_121_1).append(stackIn_121_2).append(',');
            stackIn_124_0 = stackOut_121_0;
            stackIn_124_1 = stackOut_121_1;
            stackIn_122_0 = stackOut_121_0;
            stackIn_122_1 = stackOut_121_1;
            if (param2 == null) {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "null";
              stackIn_125_0 = stackOut_124_0;
              stackIn_125_1 = stackOut_124_1;
              stackIn_125_2 = stackOut_124_2;
              break L27;
            } else {
              stackOut_122_0 = (RuntimeException) (Object) stackIn_122_0;
              stackOut_122_1 = (StringBuilder) (Object) stackIn_122_1;
              stackOut_122_2 = "{...}";
              stackIn_125_0 = stackOut_122_0;
              stackIn_125_1 = stackOut_122_1;
              stackIn_125_2 = stackOut_122_2;
              break L27;
            }
          }
          L28: {
            stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
            stackOut_125_1 = ((StringBuilder) (Object) stackIn_125_1).append(stackIn_125_2).append(',').append(param3).append(',');
            stackIn_128_0 = stackOut_125_0;
            stackIn_128_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param4 == null) {
              stackOut_128_0 = (RuntimeException) (Object) stackIn_128_0;
              stackOut_128_1 = (StringBuilder) (Object) stackIn_128_1;
              stackOut_128_2 = "null";
              stackIn_129_0 = stackOut_128_0;
              stackIn_129_1 = stackOut_128_1;
              stackIn_129_2 = stackOut_128_2;
              break L28;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_129_0 = stackOut_126_0;
              stackIn_129_1 = stackOut_126_1;
              stackIn_129_2 = stackOut_126_2;
              break L28;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_129_0, stackIn_129_2 + ',' + param5 + ')');
        }
    }

    public final void a(int param0, la param1) {
        RuntimeException runtimeException = null;
        tqa var3 = null;
        int var4 = 0;
        int var5 = 0;
        pca var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3 = param1.f((byte) 93);
            if (param0 > 34) {
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= var3.a(-119)) {
                      break L3;
                    } else {
                      if (var7 != 0) {
                        break L2;
                      } else {
                        var5 = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (var3.c(40) <= var5) {
                                break L6;
                              } else {
                                var6 = var3.a(110, var4, var5);
                                if (var7 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (null == var6.b((byte) -100)) {
                                      var6.a(3, (uq) (Object) new mba());
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var5++;
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var4++;
                            break L5;
                          }
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  this.a(param1, var3.a(109) + -1, 0, 2048, 0, var3.c(77) + -1);
                  break L2;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) runtimeException;
            stackOut_20_1 = new StringBuilder().append("gva.A(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              ofa.field_D = param0;
              jsa.a(false, 12);
              if (param1 < -24) {
                break L1;
              } else {
                gva.a(-102);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("gva.E(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, tqa param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!param2.a(param3, (byte) 48, param0)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var6_int = 55 / ((35 - param4) / 37);
                if (~param2.a(55, param0, param3).field_h != ~param1) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_9_0 = stackOut_6_0;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("gva.D(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final void a(int param0, iq param1, hr param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param0 == -14066) {
              L1: {
                var4_int = param2.c(-71);
                var5 = ((gva) this).field_a;
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
                  rba.a(var9 / 2, var13, 0, var12, (byte) 114, var7 - var13 / 2, var6 + -(var12 / 2));
                  int discarded$1 = dh.a(kn.field_p, var9, 1, 0, var6 + -(var11 / 2), var11, param2.d(115), -(var11 / 2) + var7, 0, 29870, 1, var11, var10);
                  break L1;
                } else {
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("gva.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public gva() {
        ((gva) this).field_a = new int[3];
    }

    public final void a(mda param0, int param1, iq param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 95) {
                break L1;
              } else {
                gva.a(-15);
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param0.t(1);
                var5 = param0.r(-77);
                var6 = param0.d(3);
                var7 = param0.e(param1 + 9553);
                if (var5 != 0) {
                  break L3;
                } else {
                  oq.a(-(var4_int / 2) + var6, var7 - var4_int / 2, 0, 128, var4_int / 2 + var6, 14544639, var7 - -(var4_int / 2), true);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var5 == 1) {
                oq.a(-(var4_int / 2) + var6, -(var4_int / 2) + var7, 0, 192, var6 + var4_int / 2, 5623039, var4_int / 2 + var7, true);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("gva.K(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var7 = param0.f((byte) 93);
            if (param3 == 2048) {
              var8 = param4;
              L1: while (true) {
                stackOut_4_0 = ~param1;
                stackIn_5_0 = stackOut_4_0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (stackIn_5_0 > ~var8) {
                        break L4;
                      } else {
                        if (var11 != 0) {
                          break L3;
                        } else {
                          var9 = param2;
                          L5: while (true) {
                            L6: {
                              if (param5 < var9) {
                                break L6;
                              } else {
                                var10 = var7.a(104, var8, var9);
                                stackOut_9_0 = var10.b((byte) -100) instanceof mba;
                                stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var11 != 0) {
                                  continue L2;
                                } else {
                                  L7: {
                                    if (!stackIn_10_0) {
                                      break L7;
                                    } else {
                                      this.a(17767, var10, (mba) (Object) var10.b((byte) -128), var9, var7, var8);
                                      break L7;
                                    }
                                  }
                                  var9++;
                                  if (var11 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            var8++;
                            if (var11 == 0) {
                              continue L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("gva.B(");
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L8;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
