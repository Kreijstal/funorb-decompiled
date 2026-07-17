/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static td field_c;
    static byte[][] field_a;
    private int[] field_b;

    final static void a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        da var11 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var10 = HoldTheLine.field_D;
        try {
          L0: {
            if (param1 != null) {
              if (64 == param1.length) {
                L1: {
                  var11 = new da(0);
                  var11.field_i = param1;
                  var11.field_l = 0;
                  var11.e(true);
                  if (var11.h(1, 7) != 1) {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
                L2: {
                  var3 = stackIn_8_0;
                  if (var11.h(1, 7) != 1) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                L3: {
                  var4 = stackIn_11_0;
                  if (var11.h(1, 7) != 1) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L3;
                  }
                }
                L4: {
                  var5 = stackIn_14_0;
                  if (var3 != 0) {
                    break L4;
                  } else {
                    if (nd.field_e) {
                      ad.field_a = true;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var4 != 0) {
                    break L5;
                  } else {
                    if (!ij.field_l) {
                      break L5;
                    } else {
                      ad.field_a = true;
                      break L5;
                    }
                  }
                }
                L6: {
                  if (var5 != 0) {
                    break L6;
                  } else {
                    if (!on.field_s) {
                      break L6;
                    } else {
                      ad.field_a = true;
                      break L6;
                    }
                  }
                }
                L7: {
                  nd.field_e = nd.field_e & var3 != 0;
                  ij.field_l = ij.field_l & var4 != 0;
                  on.field_s = on.field_s & var5 != 0;
                  var6 = var11.h(4, 7);
                  var7 = 4 * ao.field_b + hk.field_d;
                  if (var6 >= var7) {
                    hk.field_d = 3 & var6;
                    ao.field_b = var6 >> 2;
                    break L7;
                  } else {
                    ad.field_a = true;
                    break L7;
                  }
                }
                var8 = 1;
                L8: while (true) {
                  if (var8 >= 4) {
                    var8 = 1;
                    L9: while (true) {
                      if (4 <= var8) {
                        var9 = 117 % ((20 - param0) / 61);
                        var8 = 0;
                        L10: while (true) {
                          if (4 <= var8) {
                            var11.l(-34);
                            h.b((byte) -115);
                            break L0;
                          } else {
                            ma.a(false, var11, var8);
                            var8++;
                            continue L10;
                          }
                        }
                      } else {
                        var9 = 0;
                        L11: while (true) {
                          if (4 <= var9) {
                            var8++;
                            continue L9;
                          } else {
                            ug.a(var11, var9, var8, (byte) 100);
                            var9++;
                            continue L11;
                          }
                        }
                      }
                    }
                  } else {
                    ug.a(var11, var8, 0, (byte) 102);
                    var8++;
                    continue L8;
                  }
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("j.D(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L12;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L12;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, ib param3, int param4, String param5, int param6, int param7, int param8) {
        kl.field_v = param3;
        fh.field_g = param7;
        ee.field_n = param8;
        rd.field_g = param0;
        a.field_H = param6;
        wd.field_r = param2;
        pe.field_c = param5;
        lg.field_e = param4;
        ce.field_n = (wj) (Object) new ag();
        lk.field_d = new qb(param3);
        if (param1 != 24) {
            return;
        }
        try {
            ra.field_Z = new ci(ce.field_n, lk.field_d);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "j.F(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final static hj a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        hj var6 = null;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        int var13 = 0;
        L0: {
          var13 = HoldTheLine.field_D;
          var4 = 1 + 2 * param3;
          var5 = param3 + param1;
          if (param0 >= 40) {
            break L0;
          } else {
            hj discarded$2 = j.a((byte) 50, -35, -90, -15);
            break L0;
          }
        }
        var6 = new hj(var4, var5);
        var7 = 5;
        L1: while (true) {
          if (var5 <= var7) {
            return var6;
          } else {
            L2: {
              if (param1 < var7) {
                var8 = (float)Math.sqrt((double)(-((-param1 + var7) * (var7 + -param1)) + param3 * param3));
                break L2;
              } else {
                var8 = (float)(var7 * param3) / (float)param1;
                break L2;
              }
            }
            var9 = -param3;
            L3: while (true) {
              if (var9 > param3) {
                var7++;
                continue L1;
              } else {
                var10 = (float)var9 / var8;
                var11 = 1.0f - Math.abs(var10);
                if (0.0f < var11) {
                  var12 = var11;
                  var6.field_z[var9 + (var7 * var4 + param3)] = lk.a(var12, -1, param2);
                  var9++;
                  continue L3;
                } else {
                  var9++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static void a(byte param0, String[] param1) {
        ei var2 = null;
        RuntimeException var2_ref = null;
        ji var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              rc.field_c = param1;
              if (param0 <= -34) {
                break L1;
              } else {
                var6 = null;
                j.a(-20, (byte[]) null);
                break L1;
              }
            }
            if (rc.field_c.length != 0) {
              kn.field_a = 0;
              jf.a(4);
              var2 = new ei();
              var3 = gd.f(-117);
              L2: while (true) {
                if (var3 == null) {
                  mm.field_a = new ji[var2.field_e];
                  var4 = 0;
                  L3: while (true) {
                    if (var4 >= var2.field_e) {
                      break L0;
                    } else {
                      mm.field_a[var4] = (ji) var2.field_b[var4];
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  var2.a((Object) (Object) var3, (byte) 6);
                  var3 = gd.f(-117);
                  continue L2;
                }
              }
            } else {
              mm.field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("j.A(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        Object var2 = null;
        ag.a((String) null, false, ij.field_k);
    }

    final int a(int param0, boolean param1, int param2, byte[] param3, byte[] param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_62_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            if (0 != param0) {
              L1: {
                var7_int = 0;
                if (param1) {
                  break L1;
                } else {
                  var12 = null;
                  j.a((byte) -53, (String[]) null);
                  break L1;
                }
              }
              param0 = param0 + param2;
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((j) this).field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$7 = param2;
                      param2++;
                      param3[incrementValue$7] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if ((64 & var9) == 0) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = ((j) this).field_b[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] < 0) {
                      int incrementValue$8 = param2;
                      param2++;
                      param3[incrementValue$8] = (byte)(~var10);
                      if (param0 > param2) {
                        var7_int = 0;
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (0 != (32 & var9)) {
                      var7_int = ((j) this).field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] < 0) {
                      int incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L9;
                      }
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if ((16 & var9) == 0) {
                      var7_int++;
                      break L10;
                    } else {
                      var7_int = ((j) this).field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] < 0) {
                      int incrementValue$10 = param2;
                      param2++;
                      param3[incrementValue$10] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (0 == (8 & var9)) {
                      var7_int++;
                      break L12;
                    } else {
                      var7_int = ((j) this).field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] < 0) {
                      int incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(~var10);
                      if (param2 >= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if ((var9 & 4) != 0) {
                      var7_int = ((j) this).field_b[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((j) this).field_b[var7_int];
                    if (((j) this).field_b[var7_int] >= 0) {
                      break L15;
                    } else {
                      int incrementValue$12 = param2;
                      param2++;
                      param3[incrementValue$12] = (byte)(~var10);
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if ((2 & var9) != -1) {
                      var7_int = ((j) this).field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((j) this).field_b[var7_int];
                    if (-1 > ((j) this).field_b[var7_int]) {
                      int incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(~var10);
                      if (param2 < param0) {
                        var7_int = 0;
                        break L17;
                      } else {
                        return var8 - (-1 + param5);
                      }
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (0 != (var9 & 1)) {
                      var7_int = ((j) this).field_b[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((j) this).field_b[var7_int];
                    if (0 <= ((j) this).field_b[var7_int]) {
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_62_0 = var8 - (-1 + param5);
                stackIn_63_0 = stackOut_62_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var7;
            stackOut_64_1 = new StringBuilder().append("j.G(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param3 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L20;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L20;
            }
          }
          L21: {
            stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(44);
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param4 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L21;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L21;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param5 + 41);
        }
        return stackIn_63_0;
    }

    private j() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        try {
            int var1 = 1;
            if (null != ao.field_c) {
                try {
                    ao.field_c.a(25971, 0L);
                    ao.field_c.a((byte) 125, 24, rd.field_e.field_l, rd.field_e.field_i);
                } catch (Exception exception) {
                }
            }
            rd.field_e.field_l = rd.field_e.field_l + 24;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[1000][];
    }
}
