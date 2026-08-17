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
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        String stackIn_137_2 = null;
        StringBuilder stackIn_140_1 = null;
        StringBuilder stackIn_141_1 = null;
        String stackIn_141_2 = null;
        int decompiledRegionSelector0 = 0;
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
        var29 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param2.g(param1 + -820)) {
              this.a(-14066, param0, param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = this.field_a;
                var5 = param2.c(true);
                var6 = param2.i(0);
                var7 = param2.e(true);
                cr.a(var4, var7, var5, var6, (byte) 35);
                var8 = var4[0];
                var9 = var4[1];
                var10 = var4[2];
                if (0 != (var8 ^ -1)) {
                  break L1;
                } else {
                  if (0 == (var9 ^ -1)) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var8 = var8 + uw.field_e;
              var9 = var9 + ps.field_N;
              var11 = (ag) ((Object) param0);
              var12 = var11.a(-862393232);
              var13 = (float)param2.e(0) / (float)param2.b(true);
              var14 = param2.c(param1 + -88);
              var15 = param2.b(-6782);
              var16 = (int)(var13 * (float)(var15 + -var14) + (float)var14);
              var17 = 0 | (int)(255.0f * (-var13 + 1.0f)) << 127200280;
              var18 = (int)((1.0f - var13) * 255.0f) << -469688872 | 16777215;
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
                                    if (-3 != (var26 ^ -1)) {
                                      break L11;
                                    } else {
                                      if (var29 == 0) {
                                        break L8;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  if (-11 == (var26 ^ -1)) {
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
                                          if ((var26 ^ -1) != -7) {
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
                                                gqa.a(dfa.a(-(param2.f((byte) -127) >> 186374818), 2048, -81), -83584144, var6, var5, var25_ref_ka, -393216 + var7);
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
                                                var23 = ufa.field_e;
                                                break L2;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          L18: {
                                            if (-9 != (var26 ^ -1)) {
                                              break L18;
                                            } else {
                                              if (var29 == 0) {
                                                var23 = ufa.field_t;
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
                                              if (-17 == (var26 ^ -1)) {
                                                if ((var10 ^ -1) != -1) {
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
                                            var23 = ufa.field_d;
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
                                        gqa.a(dfa.a(-(param2.f((byte) -127) >> 148860226), 2048, 69), -83584144, var6, var5, var24_ref, var7);
                                        break L2;
                                      }
                                    }
                                  }
                                }
                              }
                              L21: {
                                var26 = param2.e(0) * 255 / param2.b(true);
                                if (ova.c(param1 ^ -25)) {
                                  stackIn_85_0 = 15;
                                  break L21;
                                } else {
                                  stackIn_85_0 = 14;
                                  break L21;
                                }
                              }
                              var27 = stackIn_85_0;
                              var28 = wma.a(var27, param1 ^ -12189, 7).a((byte) 1, 526343, true);
                              var28.O(var26 >> 213612738, 128, var26 >> 2116668098);
                              var28.a(-1, 10, 30, var26);
                              gqa.a(dfa.a(-(param2.f((byte) -127) >> -2101272606), 2048, 119), -83584144, var6, var5, var28, (883 * var6 + var5 * 233 & 255) + var7);
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
                    if (-1 != (var10 ^ -1)) {
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
                  gqa.a(dfa.a(-(param2.f((byte) -127) >> -1984639038), 2048, 92), param1 ^ 83584149, var6, var5, var26_ref_ka, -393216 + var7);
                  break L2;
                }
                if (var23 == null) {
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var16 = (int)((float)var16 * (float)var12 / (float)var10);
                  var25 = za.a(0, (byte) 92, java.lang.reflect.Array.getLength(var23) + -1, java.lang.reflect.Array.getLength(var23) + -(int)(var13 * (float)(-1 + java.lang.reflect.Array.getLength(var23))));
                  var26 = Math.min(var25, java.lang.reflect.Array.getLength(var23) - 1);
                  fja.a(var8, ((int[]) (var23))[var26], (byte) 123, 128, var16, var9);
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4_ref = decompiledCaughtException;
            stackIn_136_0 = (RuntimeException) (var4_ref);

            stackIn_136_1 = new StringBuilder().append("gva.G(");

            if (param0 == null) {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_137_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackIn_137_2 = "null";
              break L22;
            } else {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_136_0);
              stackIn_137_1 = (StringBuilder) ((Object) stackIn_136_1);
              stackIn_137_2 = "{...}";
              break L22;
            }
          }
          L23: {


            stackIn_140_1 = ((StringBuilder) (Object) stackIn_137_1).append(stackIn_137_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_137_0);
              stackIn_141_1 = (StringBuilder) ((Object) stackIn_140_1);
              stackIn_141_2 = "null";
              break L23;
            } else {
              stackIn_137_0 = (RuntimeException) ((Object) stackIn_137_0);
              stackIn_141_1 = (StringBuilder) ((Object) stackIn_140_1);
              stackIn_141_2 = "{...}";
              break L23;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_137_0), stackIn_141_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                return;
              }
            }
          }
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gva.F(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ')');
        }
    }

    public final void a(iq param0, boolean param1, ep param2) {
        ep stackIn_36_0 = null;
        ep stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        ep stackIn_46_0 = null;
        ep stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            if (param2.e(param1) <= 0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var4 = this.field_a;
                var5 = param2.b((byte) 57);
                var6 = param2.c((byte) 93);
                var7 = param2.e((byte) -98);
                cr.a(var4, var7, var5, var6, (byte) 35);
                var8 = var4[0];
                var9 = var4[1];
                if ((var8 ^ -1) != 0) {
                  break L1;
                } else {
                  if (var9 == -1) {
                    decompiledRegionSelector0 = 1;
                    break L0;
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
                      if (-4 == (var14 ^ -1)) {
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
                          var13.O(var10 << -1029696062, 512, var10 << -2305118);
                          stackIn_36_0 = (ep) (param2);

                          if (param1) {
                            stackIn_37_0 = (ep) ((Object) stackIn_36_0);
                            stackIn_37_1 = 0;
                            break L7;
                          } else {
                            stackIn_37_0 = (ep) ((Object) stackIn_36_0);
                            stackIn_37_1 = 1;
                            break L7;
                          }
                        }
                        gqa.a(dfa.a(-(((ep) (Object) stackIn_37_0).f(stackIn_37_1 != 0) >> 84610530), 2048, -56), -83584144, var6, var5, var13, var7 + (255 & var6 * 883 + var5 * 233));
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        L8: {
                          if (-3 != (var14 ^ -1)) {
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
                    stackIn_46_0 = (ep) (param2);

                    if (param1) {
                      stackIn_47_0 = (ep) ((Object) stackIn_46_0);
                      stackIn_47_1 = 0;
                      break L9;
                    } else {

                      stackIn_47_0 = (ep) ((Object) stackIn_46_0);
                      stackIn_47_1 = 1;
                      break L9;
                    }
                  }
                  gqa.a(dfa.a(-(((ep) (Object) stackIn_47_0).f(stackIn_47_1 != 0) >> -1487627710), 2048, -96), -83584144, var6, var5, wma.a(1, 12166, 7), var7);
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                gqa.a(dfa.a(-(param2.f(true) >> -2115339262), 2048, 107), -83584144, var6, var5, wma.a(2, 12166, 7), var7);
                break L2;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4_ref = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var4_ref);

            stackIn_54_1 = new StringBuilder().append("gva.I(");

            if (param0 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L10;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L11;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_55_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L11;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_55_0), stackIn_59_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (param0 == 13908) {
                break L1;
              } else {
                field_b = (us) null;
                break L1;
              }
            }
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "gva.J(" + param0 + ')');
        }
    }

    private final void a(int param0, pca param1, mba param2, int param3, tqa param4, int param5) {
        RuntimeException stackIn_120_0 = null;
        StringBuilder stackIn_120_1 = null;
        RuntimeException stackIn_121_0 = null;
        StringBuilder stackIn_121_1 = null;
        String stackIn_121_2 = null;
        StringBuilder stackIn_124_1 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        StringBuilder stackIn_128_1 = null;
        StringBuilder stackIn_129_1 = null;
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
                          if (-4 != (var13 ^ -1)) {
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
                        if ((var13 ^ -1) != -3) {
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
                this.a((iq) null, -59, (lk) null);
                break L25;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var7 = decompiledCaughtException;
            stackIn_120_0 = (RuntimeException) (var7);

            stackIn_120_1 = new StringBuilder().append("gva.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "null";
              break L26;
            } else {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_120_0);
              stackIn_121_1 = (StringBuilder) ((Object) stackIn_120_1);
              stackIn_121_2 = "{...}";
              break L26;
            }
          }
          L27: {


            stackIn_124_1 = ((StringBuilder) (Object) stackIn_121_1).append(stackIn_121_2).append(',');

            if (param2 == null) {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackIn_125_1 = (StringBuilder) ((Object) stackIn_124_1);
              stackIn_125_2 = "null";
              break L27;
            } else {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackIn_125_1 = (StringBuilder) ((Object) stackIn_124_1);
              stackIn_125_2 = "{...}";
              break L27;
            }
          }
          L28: {


            stackIn_128_1 = ((StringBuilder) (Object) stackIn_125_1).append(stackIn_125_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackIn_129_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackIn_129_2 = "null";
              break L28;
            } else {
              stackIn_121_0 = (RuntimeException) ((Object) stackIn_121_0);
              stackIn_129_1 = (StringBuilder) ((Object) stackIn_128_1);
              stackIn_129_2 = "{...}";
              break L28;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_121_0), stackIn_129_2 + ',' + param5 + ')');
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = param1.f((byte) 93);
                        if (param0 > 34) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var4 >= var3.a(-119)) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var3.c(40) <= var5) {
                            statePc = 16;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var3.a(110, var4, var5);
                        if (var7 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null == var6.b((byte) -100)) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6.a(3, new mba());
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4++;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (var7 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.a(param1, var3.a(109) + -1, 0, 2048, 0, var3.c(77) + -1);
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_23_0 = (RuntimeException) (runtimeException);
                    stackIn_21_0 = stackIn_23_0;
                    stackIn_23_1 = new StringBuilder().append("gva.A(").append(param0).append(',');
                    stackIn_21_1 = stackIn_23_1;
                    if (param1 == null) {
                        statePc = 23;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_21_1);
                    stackIn_24_2 = "{...}";
                    statePc = 24;
                    continue stateLoop;
                }
                case 23: {
                    stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_24_2 = "null";
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
                }
                case 25: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(String param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("gva.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
    }

    private final boolean a(int param0, int param1, tqa param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param2.a(param3, (byte) 48, param0)) {
              stackIn_4_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var6_int = 55 / ((35 - param4) / 37);
                if ((param2.a(55, param0, param3).field_h ^ -1) != (param1 ^ -1)) {
                  stackIn_9_0 = 0;
                  break L1;
                } else {
                  stackIn_9_0 = 1;
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("gva.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    private final void a(int param0, iq param1, hr param2) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
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
          L0: {
            if (param0 == -14066) {
              L1: {
                var4_int = param2.c(-71);
                var5 = this.field_a;
                cr.a(var5, param2.e(true), param2.c(true), param2.i(0), (byte) 35);
                var6 = var5[0];
                var7 = var5[1];
                var8 = (float)param2.e(param0 + 14066) / (float)param2.b(true);
                var9 = (int)(255.0f - 255.0f * var8);
                if (era.field_g != null) {
                  var10 = param2.a(false);
                  var11 = var4_int >> 2085968752;
                  var12 = 8 + era.field_g.c(var10, var11);
                  var13 = 8 + era.field_g.a(var10, var11, 0);
                  rba.a(var9 / 2, var13, 0, var12, (byte) 114, var7 - var13 / 2, var6 + -(var12 / 2));
                  dh.a(kn.field_p, var9, 1, 0, var6 + -(var11 / 2), var11, param2.d(115), -(var11 / 2) + var7, 0, 29870, 1, var11, var10);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("gva.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public gva() {
        this.field_a = new int[3];
    }

    public final void a(mda param0, int param1, iq param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
                if (-1 != (var5 ^ -1)) {
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
              if (-2 == (var5 ^ -1)) {
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
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("gva.K(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_22_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        boolean stackOut_9_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = param0.f((byte) 93);
                        if (param3 == 2048) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var8 = param4;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = param1 ^ -1;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 > (var8 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var11 != 0) {
                            statePc = 21;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = param2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param5 < var9) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var10 = var7.a(104, var8, var9);
                        stackOut_9_0 = var10.b((byte) -100) instanceof mba;
                        stackIn_5_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var11 != 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (!stackIn_10_0) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.a(17767, var10, (mba) ((Object) var10.b((byte) -128)), var9, var7, var8);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9++;
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var8++;
                        if (var11 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    stackIn_19_0 = (RuntimeException) (runtimeException);
                    stackIn_17_0 = stackIn_19_0;
                    stackIn_19_1 = new StringBuilder().append("gva.B(");
                    stackIn_17_1 = stackIn_19_1;
                    if (param0 == null) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_20_2 = "{...}";
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_20_2 = "null";
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    throw tba.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
