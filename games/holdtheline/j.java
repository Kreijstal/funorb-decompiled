/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    static td field_c;
    static byte[][] field_a;
    private int[] field_b;

    final static void a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        da var11 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var10 = HoldTheLine.field_D;
        if (param1 != null) {
          if (64 == param1.length) {
            L0: {
              var11 = new da(0);
              var11.field_i = param1;
              var11.field_l = 0;
              var11.e(true);
              if (var11.h(1, 7) != 1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            L1: {
              var3 = stackIn_7_0;
              if (-2 != (var11.h(1, 7) ^ -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var4 = stackIn_10_0;
              if ((var11.h(1, 7) ^ -1) != -2) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_13_0;
              if (var3 != 0) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4 != 0) {
                break L4;
              } else {
                if (!ij.field_l) {
                  break L4;
                } else {
                  ad.field_a = true;
                  break L4;
                }
              }
            }
            L5: {
              if (var5 != 0) {
                break L5;
              } else {
                if (!on.field_s) {
                  break L5;
                } else {
                  ad.field_a = true;
                  break L5;
                }
              }
            }
            L6: {
              nd.field_e = nd.field_e & var3 != 0;
              ij.field_l = ij.field_l & var4 != 0;
              on.field_s = on.field_s & var5 != 0;
              var6 = var11.h(4, 7);
              var7 = 4 * ao.field_b + hk.field_d;
              if (var6 >= var7) {
                hk.field_d = 3 & var6;
                ao.field_b = var6 >> -1435296030;
                break L6;
              } else {
                ad.field_a = true;
                break L6;
              }
            }
            var8 = 1;
            L7: while (true) {
              if (var8 >= 4) {
                var8 = 1;
                L8: while (true) {
                  if (4 <= var8) {
                    var9 = 117 % ((20 - param0) / 61);
                    var8 = 0;
                    L9: while (true) {
                      if (4 <= var8) {
                        var11.l(-34);
                        h.b((byte) -115);
                        return;
                      } else {
                        ma.a(false, var11, var8);
                        var8++;
                        continue L9;
                      }
                    }
                  } else {
                    var9 = 0;
                    L10: while (true) {
                      if (4 <= var9) {
                        var8++;
                        continue L8;
                      } else {
                        ug.a(var11, var9, var8, (byte) 100);
                        var9++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                ug.a(var11, var8, 0, (byte) 102);
                var8++;
                continue L7;
              }
            }
          } else {
            throw new RuntimeException();
          }
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
        ce.field_n = (wj) (Object) new ag();
        lk.field_d = new qb(param3);
        if (param1 != 24) {
            return;
        }
        ra.field_Z = new ci(ce.field_n, lk.field_d);
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
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        rc.field_c = param1;
        if (param0 > -34) {
            Object var6 = null;
            j.a(-20, (byte[]) null);
        }
        if (rc.field_c.length == 0) {
            mm.field_a = null;
            return;
        }
        kn.field_a = 0;
        jf.a(4);
        ei var2 = new ei();
        ji var3 = gd.f(-117);
        while (var3 != null) {
            var2.a((Object) (Object) var3, (byte) 6);
            var3 = gd.f(-117);
        }
        mm.field_a = new ji[var2.field_e];
        for (var4 = 0; var4 < var2.field_e; var4++) {
            mm.field_a[var4] = (ji) var2.field_b[var4];
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            j.a(68, -126, -46, (ib) null, 23, (String) null, 42, -14, 45);
        }
        field_c = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (param0 <= 32) {
            return;
        }
        Object var2 = null;
        ag.a((String) null, false, ij.field_k);
    }

    final int a(int param0, boolean param1, int param2, byte[] param3, byte[] param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        var11 = HoldTheLine.field_D;
        if (0 != param0) {
          L0: {
            var7 = 0;
            if (param1) {
              break L0;
            } else {
              var12 = null;
              j.a((byte) -53, (String[]) null);
              break L0;
            }
          }
          param0 = param0 + param2;
          var8 = param5;
          L1: while (true) {
            L2: {
              var9 = param4[var8];
              if ((var9 ^ -1) <= -1) {
                var7++;
                break L2;
              } else {
                var7 = ((j) this).field_b[var7];
                break L2;
              }
            }
            L3: {
              L4: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] >= 0) {
                  break L4;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L4;
                  }
                }
              }
              L5: {
                if ((64 & var9) == 0) {
                  var7++;
                  break L5;
                } else {
                  var7 = ((j) this).field_b[var7];
                  break L5;
                }
              }
              L6: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 > param2) {
                    var7 = 0;
                    break L6;
                  } else {
                    break L3;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (0 != (32 & var9)) {
                  var7 = ((j) this).field_b[var7];
                  break L7;
                } else {
                  var7++;
                  break L7;
                }
              }
              L8: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((16 & var9) == 0) {
                  var7++;
                  break L9;
                } else {
                  var7 = ((j) this).field_b[var7];
                  break L9;
                }
              }
              L10: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (0 == (8 & var9)) {
                  var7++;
                  break L11;
                } else {
                  var7 = ((j) this).field_b[var7];
                  break L11;
                }
              }
              L12: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] < 0) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 >= param0) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L12;
                  }
                } else {
                  break L12;
                }
              }
              L13: {
                if ((var9 & 4) != 0) {
                  var7 = ((j) this).field_b[var7];
                  break L13;
                } else {
                  var7++;
                  break L13;
                }
              }
              L14: {
                var10 = ((j) this).field_b[var7];
                if (((j) this).field_b[var7] >= 0) {
                  break L14;
                } else {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param0 <= param2) {
                    break L3;
                  } else {
                    var7 = 0;
                    break L14;
                  }
                }
              }
              L15: {
                if ((2 & var9) != -1) {
                  var7 = ((j) this).field_b[var7];
                  break L15;
                } else {
                  var7++;
                  break L15;
                }
              }
              L16: {
                var10 = ((j) this).field_b[var7];
                if (-1 > ((j) this).field_b[var7]) {
                  param2++;
                  param3[param2] = (byte)(var10 ^ -1);
                  if (param2 < param0) {
                    var7 = 0;
                    break L16;
                  } else {
                    return var8 - (-1 + param5);
                  }
                } else {
                  break L16;
                }
              }
              L17: {
                if (0 != (var9 & 1)) {
                  var7 = ((j) this).field_b[var7];
                  break L17;
                } else {
                  var7++;
                  break L17;
                }
              }
              L18: {
                var10 = ((j) this).field_b[var7];
                if (0 <= ((j) this).field_b[var7]) {
                  break L18;
                } else {
                  break L18;
                }
              }
              var8++;
              continue L1;
            }
            return var8 - (-1 + param5);
          }
        } else {
          return 0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new byte[1000][];
    }
}
