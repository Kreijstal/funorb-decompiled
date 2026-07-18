/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sj extends rf {
    private int field_ab;
    private int field_gb;
    private int field_Z;
    static ad field_hb;
    private int field_X;
    private int field_Y;
    static int field_bb;
    private int field_fb;
    static int[] field_db;
    static String field_V;
    static String[] field_cb;
    static String field_W;
    static String field_eb;

    final static gd a(int param0, int param1, int param2, cn param3, nn param4) {
        cn var5 = null;
        RuntimeException var5_ref = null;
        cn var6 = null;
        cn var7 = null;
        cn var8 = null;
        gd var9 = null;
        gd stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        gd stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 82) {
                break L1;
              } else {
                field_hb = null;
                break L1;
              }
            }
            var5 = fk.a((byte) 36, param3, 192, 12690143);
            var6 = rb.a(16, var5, 255, (byte) -53);
            var7 = fk.a((byte) 36, param3, 192, 16744448);
            var8 = rb.a(16, var7, 16711680, (byte) 92);
            var9 = new gd(param3, var5, var6, var7, var8, param0, param2);
            param4.a(var9, (byte) -20);
            stackOut_3_0 = (gd) var9;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("sj.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    sj(ji param0, int param1, int param2) {
        super(param0, param1, param2);
        ((sj) this).field_ab = 0;
        ((sj) this).field_Z = 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (0 >= param1) {
            ((sj) this).b(-15, param2, param0);
            return;
        }
        try {
            ((sj) this).field_Y = ((sj) this).field_s;
            ((sj) this).field_fb = ((sj) this).field_x;
            ((sj) this).field_X = param0;
            ((sj) this).field_gb = param2;
            ((sj) this).field_ab = 0;
            ((sj) this).field_Z = param1;
            if (param3 != 22284) {
                ((sj) this).h((byte) -56);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sj.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    void k(int param0) {
        try {
            if (param0 != 0) {
                sj.a(-37, 39, -112, 81, (String) null, (String) null);
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sj.J(" + param0 + ')');
        }
    }

    public static void g(byte param0) {
        try {
            field_hb = null;
            field_W = null;
            field_db = null;
            field_eb = null;
            field_V = null;
            field_cb = null;
            if (param0 != -10) {
                field_hb = null;
            }
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sj.CA(" + param0 + ')');
        }
    }

    final static String l(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == 192) {
                break L1;
              } else {
                pp discarded$1 = sj.a((cn) null, -120);
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + wl.field_f + " " + oc.field_E + " " + rd.field_C + ") " + hc.field_c;
                if (0 >= nj.field_b) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (var2 >= nj.field_b) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = 255 & ra.field_c.field_m[var2];
                            var4 = var3 >> 958493796;
                            var3 = var3 & 15;
                            if (var4 < 10) {
                              break L6;
                            } else {
                              var4 += 55;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 48;
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var1, "sj.AA(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final static pp a(cn param0, int param1) {
        cn var2 = null;
        RuntimeException var2_ref = null;
        cn var3 = null;
        cn var4 = null;
        pp stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        pp stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              jh.c();
              var2 = new cn(param0.field_y, param0.field_v);
              var3 = new cn(param0.field_y, param0.field_v);
              var2.e();
              param0.e(0, 0, 16744448);
              var3.e();
              param0.e(0, 0, 8421504);
              jh.b();
              var4 = rb.a(8, var2, 255, (byte) -116);
              if (param1 > 4) {
                break L1;
              } else {
                field_hb = null;
                break L1;
              }
            }
            stackOut_3_0 = new pp(param0, var3, var2, var4, 0, 30);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("sj.DA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    void h(byte param0) {
        if (!(((sj) this).field_Z > 0)) {
            return;
        }
        try {
            ((sj) this).b(119, ((sj) this).field_gb, ((sj) this).field_X);
            int var2_int = -27 % ((param0 - 22) / 35);
            ((sj) this).field_Z = 0;
            ((sj) this).k(0);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "sj.K(" + param0 + ')');
        }
    }

    boolean i(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              ((sj) this).h((byte) -61);
              if (param0 == 462) {
                break L1;
              } else {
                ((sj) this).h((byte) -64);
                break L1;
              }
            }
            stackOut_3_0 = super.i(param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "sj.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    boolean f(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        try {
          L0: {
            L1: {
              if (param0 == -90) {
                break L1;
              } else {
                boolean discarded$3 = ((sj) this).i(-114);
                break L1;
              }
            }
            L2: {
              if (((sj) this).field_Z > 0) {
                L3: {
                  L4: {
                    var2_int = ((sj) this).field_X;
                    var3 = ((sj) this).field_gb;
                    int fieldTemp$4 = ((sj) this).field_ab + 1;
                    ((sj) this).field_ab = ((sj) this).field_ab + 1;
                    if (~((sj) this).field_Z < ~fieldTemp$4) {
                      break L4;
                    } else {
                      ((sj) this).field_Z = 0;
                      ((sj) this).k(0);
                      if (DungeonAssault.field_K == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var4 = ((sj) this).field_ab * (2 * ((sj) this).field_Z - ((sj) this).field_ab);
                  var5 = ((sj) this).field_Z * ((sj) this).field_Z;
                  var2_int = (-((sj) this).field_fb + ((sj) this).field_X) * var4 / var5 + ((sj) this).field_fb;
                  var3 = (((sj) this).field_gb - ((sj) this).field_Y) * var4 / var5 + ((sj) this).field_Y;
                  break L3;
                }
                ((sj) this).b(15, var3, var2_int);
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_12_0 = super.f((byte) -90);
            stackIn_13_0 = stackOut_12_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var2, "sj.F(" + param0 + ')');
        }
        return stackIn_13_0;
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, String param5) {
        ac var6 = null;
        RuntimeException var6_ref = null;
        ac stackIn_8_0 = null;
        ac stackIn_10_0 = null;
        ac stackIn_11_0 = null;
        cf stackIn_11_1 = null;
        ac stackIn_12_0 = null;
        ac stackIn_14_0 = null;
        ac stackIn_15_0 = null;
        cf stackIn_15_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ac stackOut_7_0 = null;
        ac stackOut_10_0 = null;
        cf stackOut_10_1 = null;
        ac stackOut_8_0 = null;
        Object stackOut_8_1 = null;
        ac stackOut_11_0 = null;
        ac stackOut_14_0 = null;
        Object stackOut_14_1 = null;
        ac stackOut_12_0 = null;
        cf stackOut_12_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            var6 = gh.field_i[param1];
            if (null == var6) {
              return;
            } else {
              L1: {
                if (param3 == 32) {
                  break L1;
                } else {
                  pp discarded$2 = sj.a((cn) null, 111);
                  break L1;
                }
              }
              L2: {
                stackOut_7_0 = (ac) var6;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (null != param4) {
                  stackOut_10_0 = (ac) (Object) stackIn_10_0;
                  stackOut_10_1 = hd.a(false, param2, "da_monster_" + param4);
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_8_0 = (ac) (Object) stackIn_8_0;
                  stackOut_8_1 = null;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_11_1 = (cf) (Object) stackOut_8_1;
                  break L2;
                }
              }
              L3: {
                stackIn_11_0.field_a = stackIn_11_1;
                stackOut_11_0 = (ac) var6;
                stackIn_14_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (null == param5) {
                  stackOut_14_0 = (ac) (Object) stackIn_14_0;
                  stackOut_14_1 = null;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = (cf) (Object) stackOut_14_1;
                  break L3;
                } else {
                  stackOut_12_0 = (ac) (Object) stackIn_12_0;
                  stackOut_12_1 = hd.a(false, param0, "da_monster_" + param5);
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  break L3;
                }
              }
              stackIn_15_0.field_p = stackIn_15_1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("sj.GA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 10) {
                break L1;
              } else {
                field_W = null;
                break L1;
              }
            }
            stackOut_3_0 = ah.a(param0, 10, true, (byte) -42);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("sj.EA(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    void a(int param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
        var16 = DungeonAssault.field_K;
        try {
          L0: {
            gf.c(6 + param1, param0 - -35, ((sj) this).field_x - 12, -40 + ((sj) this).field_s, 2105376, 0);
            var5 = 211;
            var4_int = 35;
            var6 = 194;
            var7 = 0;
            var8 = param0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4_int >= ~var7) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~var8;
                    stackOut_3_1 = ~gf.field_f;
                    stackIn_50_0 = stackOut_3_0;
                    stackIn_50_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 > stackIn_4_1) {
                          break L4;
                        } else {
                          L5: {
                            if (~gf.field_e < ~var8) {
                              break L5;
                            } else {
                              if (var16 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            L7: {
                              var9 = var5 + (-var5 + var6) * var7 / var4_int;
                              var10 = 0;
                              var11 = ((sj) this).field_x;
                              if (var7 > 20) {
                                break L7;
                              } else {
                                L8: while (true) {
                                  if (var10 > 20) {
                                    break L7;
                                  } else {
                                    var12 = (-var7 + 20) * (-var7 + 20) - -((20 + -var10) * (20 + -var10));
                                    stackOut_17_0 = -463;
                                    stackOut_17_1 = ~var12;
                                    stackIn_30_0 = stackOut_17_0;
                                    stackIn_30_1 = stackOut_17_1;
                                    stackIn_18_0 = stackOut_17_0;
                                    stackIn_18_1 = stackOut_17_1;
                                    if (var16 != 0) {
                                      break L6;
                                    } else {
                                      L9: {
                                        if (stackIn_18_0 > stackIn_18_1) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (420 <= var12) {
                                              break L10;
                                            } else {
                                              if (var16 == 0) {
                                                break L7;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          var13 = var9 * (462 - var12) / 42;
                                          var13 = var13 | (var13 << -2060926104 | var13 << 1420738832);
                                          gf.field_b[var8 * gf.field_i + (param1 - -var10)] = var13;
                                          break L9;
                                        }
                                      }
                                      var10++;
                                      if (var16 == 0) {
                                        continue L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_29_0 = 20;
                            stackOut_29_1 = var7;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            break L6;
                          }
                          L11: {
                            L12: {
                              if (stackIn_30_0 < stackIn_30_1) {
                                break L12;
                              } else {
                                var12 = var11;
                                var11 -= 21;
                                var13 = 0;
                                L13: while (true) {
                                  L14: {
                                    if (var13 > 20) {
                                      break L14;
                                    } else {
                                      var14 = (20 + -var7) * (20 - var7) - -(var13 * var13);
                                      stackOut_33_0 = 462;
                                      stackOut_33_1 = var14;
                                      stackIn_47_0 = stackOut_33_0;
                                      stackIn_47_1 = stackOut_33_1;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      if (var16 != 0) {
                                        break L11;
                                      } else {
                                        if (stackIn_34_0 < stackIn_34_1) {
                                          break L14;
                                        } else {
                                          L15: {
                                            L16: {
                                              if (var14 < 420) {
                                                var12 = var11 - -1;
                                                if (var16 == 0) {
                                                  break L15;
                                                } else {
                                                  break L16;
                                                }
                                              } else {
                                                break L16;
                                              }
                                            }
                                            var15 = var9 * (-var14 + 462) / 42;
                                            var15 = var15 | (var15 << -1152560592 | var15 << -1443484280);
                                            gf.field_b[gf.field_i * var8 + param1 - -var11] = var15;
                                            break L15;
                                          }
                                          var13++;
                                          var11++;
                                          if (var16 == 0) {
                                            continue L13;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var11 = var12;
                                  break L12;
                                }
                              }
                            }
                            var9 = var9 | (var9 << -1907721432 | var9 << -1012515664);
                            stackOut_46_0 = param1 + var10;
                            stackOut_46_1 = var8;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L11;
                          }
                          gf.b(stackIn_47_0, stackIn_47_1, var11 - var10, var9);
                          break L4;
                        }
                      }
                      var8++;
                      var7++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var6 = 169;
                var4_int = 22;
                var5 = 194;
                var7 = 0;
                stackOut_49_0 = 35;
                stackOut_49_1 = param0;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                break L2;
              }
              var8 = stackIn_50_0 + stackIn_50_1;
              L17: while (true) {
                L18: {
                  L19: {
                    if (var4_int <= var7) {
                      break L19;
                    } else {
                      var9 = (-var5 + var6) * var7 / var4_int + var5;
                      var9 = var9 | (var9 << -1230634968 | var9 << 853133136);
                      gf.b(param1, var8, 6, var9);
                      gf.b(((sj) this).field_x + (param1 - 6), var8, 6, var9);
                      var7++;
                      var8++;
                      if (var16 != 0) {
                        break L18;
                      } else {
                        if (var16 == 0) {
                          continue L17;
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                  bl.field_e.h(((sj) this).field_x + param1 + -90, param0 - -10);
                  jm.a(param1 - -5, ((sj) this).field_x + -10, gn.field_i, 0, 35 + param0);
                  jm.a(param1, ((sj) this).field_x, di.field_l, 0, ((sj) this).field_s + param0 - 22);
                  var6 = 127;
                  var4_int = ((sj) this).field_s - 79;
                  var5 = 169;
                  var7 = 0;
                  var8 = param0 + 57;
                  break L18;
                }
                L20: {
                  if (!param2) {
                    break L20;
                  } else {
                    ((sj) this).h((byte) 25);
                    break L20;
                  }
                }
                L21: while (true) {
                  L22: {
                    L23: {
                      if (var4_int <= var7) {
                        break L23;
                      } else {
                        var9 = var5 + var7 * (-var5 + var6) / var4_int;
                        var9 = var9 | (var9 << -941786608 | var9 << -1855577144);
                        gf.b(param1, var8, 6, var9);
                        gf.b(param1 + ((sj) this).field_x + -6, var8, 6, var9);
                        var7++;
                        var8++;
                        if (var16 != 0) {
                          break L22;
                        } else {
                          if (var16 == 0) {
                            continue L21;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    break L22;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw vk.a((Throwable) (Object) var4, "sj.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = 64;
        field_hb = new ad(14, 0, 4, 1);
        field_W = "Dungeon and Stable";
        field_cb = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_eb = "While demon lords are still a raider's worst nightmare, pit demons are still very, very bad dreams.";
        field_V = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
