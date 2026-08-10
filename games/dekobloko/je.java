/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static int field_c;
    static ak field_f;
    static cd field_b;
    private int field_d;
    private int field_e;
    private int[][] field_a;

    final static qm a(int param0, int param1) {
        qm[] var2;
        int var3;
        int var4;
        int var5;
        qm[] var6;
        var5 = client.field_A ? 1 : 0;
        var3 = -128 / ((param0 - -53) / 58);
        var6 = vj.e(-23521);
        var2 = var6;
        var4 = 0;
        L0: while (true) {
          if (var4 < var6.length) {
            if (var6[var4].field_d == param1) {
              return var6[var4];
            } else {
              var4++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final byte[] a(int param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        var11 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == this.field_a) {
                break L1;
              } else {
                var3_int = (int)((long)this.field_e * (long)param1.length / (long)this.field_d) + 14;
                var16 = new int[var3_int];
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= param1.length) {
                    param1 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L3: while (true) {
                      if (var12 >= var3_int) {
                        break L1;
                      } else {
                        L4: {
                          var8 = var16[var12] - -32768 >> -1922369712;
                          if (var8 >= -128) {
                            if (-128 > (var8 ^ -1)) {
                              param1[var12] = (byte)127;
                              break L4;
                            } else {
                              param1[var12] = (byte)var8;
                              break L4;
                            }
                          } else {
                            param1[var12] = (byte)-128;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var18 = this.field_a[var6];
                    var10 = 0;
                    L5: while (true) {
                      if (14 <= var10) {
                        var6 = var6 + this.field_e;
                        var10 = var6 / this.field_d;
                        var5 = var5 + var10;
                        var6 = var6 - var10 * this.field_d;
                        var7++;
                        continue L2;
                      } else {
                        var4[var10 + var5] = var4[var10 + var5] + var8 * var18[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == 14) {
                break L6;
              } else {
                field_f = (ak) null;
                break L6;
              }
            }
            stackIn_21_0 = (byte[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("je.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final static cd a(int param0) {
        if (!(sh.field_d != uc.field_c)) {
            throw new IllegalStateException();
        }
        if (kl.field_z == sh.field_d) {
            sh.field_d = uc.field_c;
            return ea.field_x;
        }
        if (param0 == 13) {
            return null;
        }
        je.a(-1);
        return null;
    }

    final int b(int param0, int param1) {
        if (param1 < 17) {
            this.field_e = 12;
        }
        if (this.field_a != null) {
            param0 = 6 - -(int)((long)this.field_e * (long)param0 / (long)this.field_d);
        }
        return param0;
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_19_0 = null;
        String stackIn_22_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_32_0 = null;
        String stackIn_35_0 = null;
        String stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        String var4 = null;
        try {
          L0: {
            if (1 != param1) {
              if (2 == param1) {
                stackIn_6_0 = cm.a((byte) 121, hf.field_c, new String[]{param0});
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == -128) {
                    break L1;
                  } else {
                    var4 = (String) null;
                    je.a((String) null, 71, (byte) -56);
                    break L1;
                  }
                }
                if (3 == param1) {
                  stackIn_12_0 = cm.a((byte) 83, bg.field_a, new String[]{param0});
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-5 == (param1 ^ -1)) {
                    stackIn_16_0 = cm.a((byte) 106, aj.field_b, new String[]{param0});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (param1 != 5) {
                      if (param1 != 6) {
                        if (param1 != 7) {
                          if (-9 == (param1 ^ -1)) {
                            stackIn_29_0 = cm.a((byte) 83, gf.field_d, new String[]{param0});
                            decompiledRegionSelector0 = 7;
                            break L0;
                          } else {
                            if (-12 != (param1 ^ -1)) {
                              if (param1 != 12) {
                                if (13 == param1) {
                                  stackIn_39_0 = cm.a((byte) 127, sh.field_b, new String[]{param0});
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                } else {
                                  return null;
                                }
                              } else {
                                stackIn_35_0 = cm.a((byte) 100, md.field_S, new String[]{param0});
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              stackIn_32_0 = cm.a((byte) 123, em.field_b, new String[]{param0});
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        } else {
                          stackIn_25_0 = cm.a((byte) 123, f.field_x, new String[]{param0});
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      } else {
                        stackIn_22_0 = cm.a((byte) 121, bj.field_b, new String[]{param0});
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    } else {
                      stackIn_19_0 = cm.a((byte) 96, ln.field_b, new String[]{param0});
                      decompiledRegionSelector0 = 4;
                      break L0;
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = cm.a((byte) 121, wk.field_g, new String[]{param0});
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_43_0 = (RuntimeException) (var3);

            stackIn_43_1 = new StringBuilder().append("je.B(");

            if (param0 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L2;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_22_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_25_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_29_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_32_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_35_0;
                          } else {
                            return stackIn_39_0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        if (param0 != 23369) {
            field_b = (cd) null;
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            return -86;
        }
        if (!(this.field_a == null)) {
            param1 = (int)((long)this.field_e * (long)param1 / (long)this.field_d);
        }
        return param1;
    }

    je(int param0, int param1) {
        int var3;
        int var4;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param1 != param0) {
          var3 = n.a(43, param0, param1);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_d = param0;
          this.field_e = param1;
          this.field_a = new int[param0][14];
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = this.field_a[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (0 <= var8) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = 3.141592653589793 * ((double)var8 - var6);
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (Math.cos(((double)var8 - var6) * 0.2243994752564138) * 0.46 + 0.54);
                  var5[var8] = (int)Math.floor(0.5 + var14 * 65536.0);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
    }
}
