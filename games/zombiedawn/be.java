/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be extends im {
    private boolean field_h;
    private int[] field_l;
    private byte[] field_n;
    private int field_k;
    private int field_m;
    static cg field_i;
    static int field_j;

    final void a(boolean param0) {
        this.field_m = 0;
        this.field_k = 0;
        if (param0) {
            this.a((byte) -3);
        }
    }

    public static void c(boolean param0) {
        if (!param0) {
            be.c(true);
        }
        field_i = null;
    }

    final byte[] c(int param0, int param1, int param2) {
        this.field_n = new byte[param0 * param1];
        this.b(param0, param1, -9394);
        if (param2 >= -18) {
            return (byte[]) null;
        }
        return this.field_n;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25466) {
            return;
        }
        this.field_m = this.field_m + (this.field_l[param0] * param1 >> -1775744532);
    }

    final static vk a(String param0, byte param1) {
        vk stackIn_4_0 = null;
        vk stackIn_7_0 = null;
        vk stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        vk stackIn_25_0 = null;
        vk stackIn_31_0 = null;
        vk stackIn_41_0 = null;
        vk stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = bg.field_l;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-65 <= (var2_int ^ -1)) {
                if (param0.charAt(0) != 34) {
                  var3 = 0;
                  if (param1 <= -47) {
                    var4 = 0;
                    L1: while (true) {
                      if (var4 < var2_int) {
                        L2: {
                          var5 = param0.charAt(var4);
                          if (46 != var5) {
                            if (-1 != mc.field_i.indexOf(var5)) {
                              var3 = 0;
                              break L2;
                            } else {
                              stackIn_45_0 = vl.field_m;
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          } else {
                            L3: {
                              if (var4 == 0) {
                                break L3;
                              } else {
                                if (var2_int - 1 == var4) {
                                  break L3;
                                } else {
                                  if (var3 == 0) {
                                    var3 = 1;
                                    break L2;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                            }
                            stackIn_41_0 = vl.field_m;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                        var4++;
                        continue L1;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_31_0 = (vk) null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                } else {
                  if (param0.charAt(-1 + var2_int) == 34) {
                    var3 = 0;
                    var4 = 1;
                    L4: while (true) {
                      if (var2_int - 1 > var4) {
                        L5: {
                          var5 = param0.charAt(var4);
                          if (var5 == 92) {
                            L6: {
                              if (var3 != 0) {
                                stackIn_20_0 = 0;
                                break L6;
                              } else {
                                stackIn_20_0 = 1;
                                break L6;
                              }
                            }
                            var3 = stackIn_20_0;
                            break L5;
                          } else {
                            L7: {
                              if (var5 != 34) {
                                break L7;
                              } else {
                                if (var3 == 0) {
                                  stackIn_25_0 = vl.field_m;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var3 = 0;
                            break L5;
                          }
                        }
                        var4++;
                        continue L4;
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_11_0 = vl.field_m;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = fg.field_m;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_51_0 = (RuntimeException) (var2);

            stackIn_51_1 = new StringBuilder().append("be.H(");

            if (param0 == null) {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "null";
              break L8;
            } else {
              stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackIn_52_2 = "{...}";
              break L8;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_31_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_41_0;
                  } else {
                    return stackIn_45_0;
                  }
                }
              }
            }
          }
        }
    }

    be(int param0, int param1, int param2, int param3, int param4, float param5, boolean param6) {
        super(param0, param1, param2, param3, param4);
        int var8 = 0;
        this.field_l = new int[this.field_g];
        this.field_h = param6 ? true : false;
        for (var8 = 0; this.field_g > var8; var8++) {
            this.field_l[var8] = (short)(int)(4096.0 * Math.pow((double)param5, (double)var8));
        }
    }

    final void a(byte param0) {
        if (param0 != 44) {
            String var3 = (String) null;
            be.a((String) null, (byte) -57);
        }
        if (4095 < (this.field_m ^ -1) || (this.field_m ^ -1) < -4097) {
            this.field_m = -4096;
        }
        int fieldTemp$0 = this.field_k;
        this.field_k = this.field_k + 1;
        this.field_n[fieldTemp$0] = (byte)((this.field_h ? 2048 + (this.field_m >> -1728161183) : this.field_m) >> -154155708);
        this.field_m = 0;
    }

    static {
        field_i = new cg(11, 0, 1, 2);
    }
}
