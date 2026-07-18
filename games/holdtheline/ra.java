/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra extends u {
    static ci field_Z;
    static String field_fb;
    static int[] field_cb;
    private String field_gb;
    private boolean field_db;
    private String field_eb;
    static hj[] field_X;
    private boolean field_Y;
    static long field_bb;
    private ea field_jb;
    static int field_ab;
    static String field_ib;
    static hj field_hb;

    final void i(byte param0) {
        ((ra) this).field_jb.field_K = false;
        ((ra) this).field_db = true;
        int var2 = -107 % ((param0 - -20) / 43);
    }

    final static void m(int param0) {
        if (bl.field_r == null) {
          if (param0 < 95) {
            field_cb = null;
            return;
          } else {
            return;
          }
        } else {
          bl.field_r.f(-38);
          if (param0 >= 95) {
            return;
          } else {
            field_cb = null;
            return;
          }
        }
    }

    final static boolean a(CharSequence param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            if (param0 != null) {
              var3_int = param0.length();
              if (var3_int < 1) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                if (var3_int <= 12) {
                  L1: {
                    var4 = kf.a(param0, (byte) 122);
                    if (var4 == null) {
                      break L1;
                    } else {
                      if (var4.length() < 1) {
                        break L1;
                      } else {
                        L2: {
                          if (ag.a(-2821, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (!ag.a(-2821, var4.charAt(var4.length() + -1))) {
                              var9 = null;
                              boolean discarded$2 = ra.a((String) null, false);
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (param0.length() <= var6) {
                                  if (var5 <= 0) {
                                    stackOut_31_0 = 1;
                                    stackIn_32_0 = stackOut_31_0;
                                    break L0;
                                  } else {
                                    stackOut_29_0 = 0;
                                    stackIn_30_0 = stackOut_29_0;
                                    return stackIn_30_0 != 0;
                                  }
                                } else {
                                  L4: {
                                    var7 = param0.charAt(var6);
                                    if (ag.a(-2821, (char) var7)) {
                                      var5++;
                                      break L4;
                                    } else {
                                      var5 = 0;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_25_0 = 0;
                                    stackIn_26_0 = stackOut_25_0;
                                    return stackIn_26_0 != 0;
                                  }
                                }
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackOut_17_0 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0 != 0;
                      }
                    }
                  }
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var3;
            stackOut_33_1 = new StringBuilder().append("ra.W(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L5;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + false + ',' + false + ')');
        }
        return stackIn_32_0 != 0;
    }

    public static void h(byte param0) {
        field_ib = null;
        field_fb = null;
        field_Z = null;
        field_cb = null;
        field_hb = null;
        field_X = null;
    }

    final void a(int param0, int param1, byte param2) {
        super.a(param0, param1, param2);
        de.field_I.b(((ra) this).field_eb, (((ra) this).field_x >> 1) + param0, param1 - -103, 16777215, -1);
        if (!(null == ((ra) this).field_gb)) {
            tc.b(20 + param0, -7 + (param1 + 120), 260, 8421504);
            int discarded$0 = de.field_I.a(((ra) this).field_gb, 20 + param0, 120 + param1 + 8, 260, 100, 16777215, -1, 1, 0, de.field_I.field_G);
        }
    }

    final void a(float param0, int param1, boolean param2, String param3) {
        RuntimeException runtimeException = null;
        Object var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (((ra) this).field_Y != param2) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (!param2) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((ra) this).field_Y = stackIn_5_1 != 0;
                if (((ra) this).field_Y) {
                  ((ra) this).field_jb.a(8405024, 4210752, false);
                  ((ra) this).field_jb.field_K = true;
                  break L1;
                } else {
                  ((ra) this).field_jb.a(2113632, 4210752, false);
                  if (!((ra) this).field_db) {
                    break L1;
                  } else {
                    ((ra) this).field_jb.field_K = false;
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (param1 < -43) {
                break L3;
              } else {
                var6 = null;
                fi discarded$2 = ra.a((String) null, 66);
                break L3;
              }
            }
            ((ra) this).field_jb.field_B = (int)(param0 / 100.0f * 65536.0f);
            ((ra) this).field_eb = param3;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ra.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    ra(qj param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((ra) this).field_gb = param1;
            if (null != ((ra) this).field_gb) {
                var3_int = de.field_I.b(((ra) this).field_gb, 260, de.field_I.field_G);
                ((ra) this).b(537342017, 300, var3_int + 150);
            }
            ((ra) this).field_jb = new ea(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ra) this).field_jb.field_K = true;
            ((ra) this).field_Y = false;
            ((ra) this).field_db = false;
            ((ra) this).a(true, (n) (Object) ((ra) this).field_jb);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "ra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = (CharSequence) (Object) param0;
            stackOut_0_0 = co.field_e.equals((Object) (Object) kf.a(var3, (byte) -102));
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ra.U(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + false + ')');
        }
        return stackIn_1_0;
    }

    final static fi a(String param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fi var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        fi stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        fi stackOut_15_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = HoldTheLine.field_D;
        try {
          if (jo.field_b != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var7 = (CharSequence) (Object) param0;
                var2 = kf.a(var7, (byte) 99);
                if (var2 != null) {
                  var4 = 70 % ((param1 - 9) / 33);
                  var3 = (fi) (Object) jo.field_b.a(-25839, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var8 = (CharSequence) (Object) var3.field_mb;
                      var5 = kf.a(var8, (byte) 123);
                      if (!var5.equals((Object) (Object) var2)) {
                        var3 = (fi) (Object) jo.field_b.a(20240);
                        continue L0;
                      } else {
                        stackOut_15_0 = (fi) var3;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (fi) (Object) stackIn_10_0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (fi) (Object) stackIn_7_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2_ref;
            stackOut_19_1 = new StringBuilder().append("ra.CA(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_fb = "<img=4>";
        field_cb = new int[]{3, 3, 4};
        field_ab = -1;
        field_ib = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
