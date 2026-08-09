/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static td field_c;
    static byte[][] field_a;
    private int[] field_b;

    final static void a(int param0, byte[] param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                    stackIn_8_0 = 0;
                    break L1;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  var3 = stackIn_8_0;
                  if (-2 != (var11.h(1, 7) ^ -1)) {
                    stackIn_11_0 = 0;
                    break L2;
                  } else {
                    stackIn_11_0 = 1;
                    break L2;
                  }
                }
                L3: {
                  var4 = stackIn_11_0;
                  if ((var11.h(1, 7) ^ -1) != -2) {
                    stackIn_14_0 = 0;
                    break L3;
                  } else {
                    stackIn_14_0 = 1;
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
                    ao.field_b = var6 >> -1435296030;
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
                            decompiledRegionSelector0 = 1;
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
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var2 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var2);

            stackIn_43_1 = new StringBuilder().append("j.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L12;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L12;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        ce.field_n = (wj) ((Object) new ag());
        lk.field_d = new qb(param3);
        if (param1 != 24) {
            return;
        }
        try {
            ra.field_Z = new ci(ce.field_n, lk.field_d);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "j.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static hj a(byte param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        hj var6;
        int var7;
        float var8;
        int var9;
        float var10;
        float var11;
        int var13;
        float var12;
        L0: {
          var13 = HoldTheLine.field_D;
          var4 = 1 + 2 * param3;
          var5 = param3 + param1;
          if (param0 >= 40) {
            break L0;
          } else {
            j.a((byte) 50, -35, -90, -15);
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
        ji var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              rc.field_c = param1;
              if (param0 <= -34) {
                break L1;
              } else {
                var6 = (byte[]) null;
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
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      mm.field_a[var4] = (ji) (var2.field_b[var4]);
                      var4++;
                      continue L3;
                    }
                  }
                } else {
                  var2.a(var3, (byte) 6);
                  var3 = gd.f(-117);
                  continue L2;
                }
              }
            } else {
              mm.field_a = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2_ref);

            stackIn_15_1 = new StringBuilder().append("j.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            String var2 = (String) null;
            j.a(68, -126, -46, (ib) null, 23, (String) null, 42, -14, 45);
        }
        field_c = null;
        field_a = (byte[][]) null;
    }

    final static void b(int param0) {
        if (param0 <= 32) {
            return;
        }
        String var2 = (String) null;
        ag.a((String) null, false, ij.field_k);
    }

    final int a(int param0, boolean param1, int param2, byte[] param3, byte[] param4, int param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        var11 = HoldTheLine.field_D;
        try {
          L0: {
            if (0 != param0) {
              L1: {
                var7_int = 0;
                if (param1) {
                  break L1;
                } else {
                  var12 = (String[]) null;
                  j.a((byte) -53, (String[]) null);
                  break L1;
                }
              }
              param0 = param0 + param2;
              var8 = param5;
              L2: while (true) {
                L3: {
                  var9 = param4[var8];
                  if ((var9 ^ -1) <= -1) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_b[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_b[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param2;
                      param2++;
                      param3[incrementValue$1] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_b[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 < 0) {
                      incrementValue$3 = param2;
                      param2++;
                      param3[incrementValue$3] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_b[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 < 0) {
                      incrementValue$5 = param2;
                      param2++;
                      param3[incrementValue$5] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_b[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 < 0) {
                      incrementValue$7 = param2;
                      param2++;
                      param3[incrementValue$7] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_b[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 < 0) {
                      incrementValue$9 = param2;
                      param2++;
                      param3[incrementValue$9] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L14;
                    } else {
                      var7_int++;
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_b[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 >= 0) {
                      break L15;
                    } else {
                      incrementValue$11 = param2;
                      param2++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param0 <= param2) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if ((2 & var9) != 0) {
                      var7_int = this.field_b[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_b[var7_int];
                    var10 = dupTemp$12;
                    if (-1 < (dupTemp$12 ^ -1)) {
                      incrementValue$13 = param2;
                      param2++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
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
                      var7_int = this.field_b[var7_int];
                      break L18;
                    } else {
                      var7_int++;
                      break L18;
                    }
                  }
                  dupTemp$14 = this.field_b[var7_int];
                  var10 = dupTemp$14;
                  if (0 > dupTemp$14) {
                    incrementValue$15 = param2;
                    param2++;
                    param3[incrementValue$15] = (byte)(var10 ^ -1);
                    if (param0 <= param2) {
                      break L4;
                    } else {
                      var7_int = 0;
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
                stackIn_64_0 = var8 - (-1 + param5);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var7 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var7);

            stackIn_67_1 = new StringBuilder().append("j.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L19;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L19;
            }
          }
          L20: {


            stackIn_70_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(',');

            if (param4 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "null";
              break L20;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackIn_71_2 = "{...}";
              break L20;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_68_0), stackIn_71_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_64_0;
        }
    }

    private j() throws Throwable {
        throw new Error();
    }

    final static void a(byte param0) {
        try {
            int var1 = 89 % ((param0 - -70) / 52);
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
        field_a = new byte[1000][];
    }
}
