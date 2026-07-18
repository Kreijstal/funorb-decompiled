/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha extends cn {
    static kd field_w;
    static String field_x;
    static int field_v;
    static String field_y;
    private gm field_u;
    static int field_t;
    private gm[] field_s;

    public ha() {
        ((ha) this).field_s = new gm[6];
        ((ha) this).field_u = new gm();
        gm dupTemp$0 = new gm();
        ((ha) this).field_s[0] = dupTemp$0;
        gm var1 = dupTemp$0;
        var1.b(122);
    }

    final gm a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        gm dupTemp$0 = new gm();
        ((ha) this).field_s[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void a(boolean param0, bd param1) {
        gm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        gm[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var7 = ((ha) this).field_s;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0) {
                    break L2;
                  } else {
                    field_v = 103;
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_a = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("ha.AA(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        try {
            int var2_int = -13;
            hj.a(param1, 91);
            qa.a(false, (byte) -62, jj.field_i);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ha.W(" + 126 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ha(ha param0, boolean param1) {
        this();
        try {
            param0.a(param1, 0, (ha) this);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, ha param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        gm var5 = null;
        gm var6 = null;
        int var7 = 0;
        gm stackIn_9_0 = null;
        gm stackIn_10_0 = null;
        gm stackIn_11_0 = null;
        gm stackIn_11_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_8_0 = null;
        gm stackOut_10_0 = null;
        gm stackOut_10_1 = null;
        gm stackOut_9_0 = null;
        gm stackOut_9_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            super.a(-110, (cn) (Object) param2);
            L1: {
              if (param0) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((ha) this).field_s[var4_int];
                      if (var5 == null) {
                        param2.field_s[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param2.field_s[var4_int];
                          stackOut_8_0 = (gm) var5;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var6 != null) {
                            stackOut_10_0 = (gm) (Object) stackIn_10_0;
                            stackOut_10_1 = (gm) var6;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            break L4;
                          } else {
                            gm dupTemp$17 = new gm();
                            param2.field_s[var4_int] = dupTemp$17;
                            stackOut_9_0 = (gm) (Object) stackIn_9_0;
                            stackOut_9_1 = (gm) dupTemp$17;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            break L4;
                          }
                        }
                        ((gm) (Object) stackIn_11_0).a(stackIn_11_1, (byte) 33);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                kf.a((Object[]) (Object) ((ha) this).field_s, 0, (Object[]) (Object) param2.field_s, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ha.DA(").append(param0).append(',').append(0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
    }

    final static void a(int param0, int param1, p param2, int param3) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var4_int = 0;
        int var15 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        int var7 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        try {
            var12 = uj.field_p.field_e + 36;
            var13 = 12 + uj.field_p.field_g;
            var14 = -var12 + am.field_e;
            var4_int = var14 << 2;
            var15 = -var13 + jg.field_l;
            var6 = param0 << 2;
            var8 = 8;
            var11 = 1;
            var7 = param3 << 2;
            var5 = var15 << 2;
            var9 = 16;
            var10 = 1;
            var16 = (32 + -param2.field_e) * 200 / 32;
            km.a((byte) var10, var7, var5, ni.field_c, var9, var6, (byte) var11, 112, var4_int, var16, var8);
            var17 = (int)((double)var8 / 1.0);
            var18 = (int)((double)var9 / 1.2);
            bh.a((byte) var10, wk.field_d, (byte) var11, var17, var4_int, var5, var7, var18, var16, var6, 9233);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ha.HA(" + param0 + ',' + -10454 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            ge.b();
            pk.field_i = new int[260];
            ih.field_w = 11;
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 256) {
                var5 = 256;
                var1_int = var5;
                L2: while (true) {
                  if (pk.field_i.length <= var5) {
                    break L0;
                  } else {
                    pk.field_i[var5] = 255;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var2 = 15.0;
                pk.field_i[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var1, "ha.CA(" + 255 + ')');
        }
    }

    final void a(int param0, bd[] param1, byte param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (!(((ha) this).field_s[var4_int] != null)) {
                ((ha) this).field_s[var4_int] = new gm();
            }
            if (param2 >= -4) {
                field_w = null;
            }
            ((ha) this).field_s[param0].field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ha.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, bd[] param1) {
        gm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        gm var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = ((ha) this).field_s;
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                var7 = null;
                ((ha) this).a(-43, -76, 69, (ag) null, true);
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                L3: {
                  var5 = var3[var4];
                  if (var5 != null) {
                    var5.field_c = param1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("ha.FA(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    final static StringBuilder a(char param0, int param1, byte param2, StringBuilder param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4_int = param3.length();
            param3.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_4_0 = (StringBuilder) param3;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                param3.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ha.EA(").append(' ').append(',').append(0).append(',').append(-128).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public static void b(boolean param0) {
        field_y = null;
        field_w = null;
        field_x = null;
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        RuntimeException var6 = null;
        gm var7 = null;
        gm var9 = null;
        Object var10 = null;
        ph var11 = null;
        gm var12 = null;
        gm var13 = null;
        gm var14 = null;
        gm var15 = null;
        ag stackIn_3_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        ag stackOut_1_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof ph)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (ag) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (ag) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var11 = (ph) (Object) stackIn_3_0;
              sf.a(param1 + param3.field_v + param3.field_s, param3.field_m + param0, param3.field_x + param0 - -param3.field_m, param1 - -param3.field_v, true);
              if (var11 == null) {
                break L2;
              } else {
                param4 = param4 & var11.field_D;
                break L2;
              }
            }
            L3: {
              var7 = ((ha) this).field_s[0];
              ((ha) this).field_u.b(param2 + -15305);
              var7.a(param3, ((ha) this).field_u, (byte) 88, (ha) this, param0, param1);
              if (var11 == null) {
                break L3;
              } else {
                L4: {
                  if (!var11.field_A) {
                    break L4;
                  } else {
                    var12 = ((ha) this).field_s[1];
                    if (var12 != null) {
                      var12.a(param3, ((ha) this).field_u, (byte) 95, (ha) this, param0, param1);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!var11.field_u) {
                  break L3;
                } else {
                  L5: {
                    var13 = ((ha) this).field_s[3];
                    if (var11.field_r == 0) {
                      break L5;
                    } else {
                      if (var13 == null) {
                        break L5;
                      } else {
                        var13.a(param3, ((ha) this).field_u, (byte) 57, (ha) this, param0, param1);
                        break L3;
                      }
                    }
                  }
                  var9 = ((ha) this).field_s[2];
                  if (var9 == null) {
                    break L3;
                  } else {
                    var9.a(param3, ((ha) this).field_u, (byte) 106, (ha) this, param0, param1);
                    break L3;
                  }
                }
              }
            }
            L6: {
              if (param3.g(param2 ^ -8049)) {
                var14 = ((ha) this).field_s[5];
                if (var14 == null) {
                  break L6;
                } else {
                  var14.a(param3, ((ha) this).field_u, (byte) 81, (ha) this, param0, param1);
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (param4) {
                break L7;
              } else {
                var15 = ((ha) this).field_s[4];
                if (var15 != null) {
                  var15.a(param3, ((ha) this).field_u, (byte) 82, (ha) this, param0, param1);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              ((ha) this).field_u.a((ha) this, 126, param1, param3, param0);
              if (param2 == 15430) {
                break L8;
              } else {
                var10 = null;
                ((ha) this).a(-65, (bd[]) null, (byte) -86);
                break L8;
              }
            }
            eh.b(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("ha.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "<col=ffffff>Security<nbsp>pass</col><br>This badge allows access to high-security areas of modern space stations.";
        field_y = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
