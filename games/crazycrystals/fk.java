/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lb {
    static int field_u;
    static int field_v;
    static String field_q;
    static String field_t;
    static ko[] field_x;
    private pm field_w;
    static int field_s;
    static String field_y;
    private pm[] field_r;

    public static void b(int param0) {
        field_t = null;
        field_x = null;
        field_y = null;
        field_q = null;
        if (param0 != -5082) {
            field_y = null;
        }
    }

    fk(fk param0, boolean param1) {
        this();
        try {
            param0.a((fk) this, 6, param1);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "fk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final static ce a(boolean param0, String param1) {
        Object var2 = null;
        ce var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        ce stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        ce stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        Object stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          if (vl.field_d != null) {
            L0: {
              var6 = (CharSequence) (Object) param1;
              var2 = (Object) (Object) fe.a(60136, var6);
              if (var2 == null) {
                var2 = (Object) (Object) var6;
                break L0;
              } else {
                break L0;
              }
            }
            var3 = (ce) (Object) vl.field_d.a((long)((String) var2).hashCode(), param0);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_fb;
                  var4 = fe.a(60136, var7);
                  if (var4 == null) {
                    var4 = var3.field_fb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (var4.equals(var2)) {
                  stackOut_15_0 = (ce) var3;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                } else {
                  var3 = (ce) (Object) vl.field_d.b(50);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (ce) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = (Object) (Object) decompiledCaughtException;
            stackOut_19_0 = var2;
            stackOut_19_1 = new StringBuilder().append("fk.BA(").append(param0).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    public fk() {
        ((fk) this).field_r = new pm[6];
        ((fk) this).field_w = new pm();
        pm dupTemp$0 = new pm();
        ((fk) this).field_r[0] = dupTemp$0;
        pm var1 = dupTemp$0;
        var1.a(0);
    }

    final void a(int param0, int param1, dl[] param2) {
        int var4_int = 0;
        try {
            var4_int = param0;
            if (!(((fk) this).field_r[var4_int] != null)) {
                ((fk) this).field_r[var4_int] = new pm();
            }
            if (param1 != 0) {
                ((fk) this).field_r = null;
            }
            ((fk) this).field_r[param0].field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "fk.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(dl[] param0, int param1) {
        pm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            var7 = ((fk) this).field_r;
            var3 = var7;
            var4 = param1;
            L1: while (true) {
              if (var4 >= var7.length) {
                break L0;
              } else {
                L2: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L2;
                  } else {
                    var5.field_k = param0;
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("fk.DA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
    }

    private final void a(fk param0, int param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pm var5 = null;
        pm var6 = null;
        int var7 = 0;
        pm stackIn_9_0 = null;
        pm stackIn_10_0 = null;
        pm stackIn_11_0 = null;
        pm stackIn_11_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        pm stackOut_8_0 = null;
        pm stackOut_10_0 = null;
        pm stackOut_10_1 = null;
        pm stackOut_9_0 = null;
        pm stackOut_9_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              super.a((byte) 119, (lb) (Object) param0);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((fk) this).field_r[var4_int];
                      if (var5 == null) {
                        param0.field_r[var4_int] = null;
                        break L3;
                      } else {
                        L4: {
                          var6 = param0.field_r[var4_int];
                          stackOut_8_0 = (pm) var5;
                          stackIn_10_0 = stackOut_8_0;
                          stackIn_9_0 = stackOut_8_0;
                          if (var6 == null) {
                            pm dupTemp$17 = new pm();
                            param0.field_r[var4_int] = dupTemp$17;
                            stackOut_10_0 = (pm) (Object) stackIn_10_0;
                            stackOut_10_1 = (pm) dupTemp$17;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            break L4;
                          } else {
                            stackOut_9_0 = (pm) (Object) stackIn_9_0;
                            stackOut_9_1 = (pm) var6;
                            stackIn_11_0 = stackOut_9_0;
                            stackIn_11_1 = stackOut_9_1;
                            break L4;
                          }
                        }
                        ((pm) (Object) stackIn_11_0).a(stackIn_11_1, -127);
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                eg.a((Object[]) (Object) ((fk) this).field_r, 0, (Object[]) (Object) param0.field_r, 0, 6);
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
            stackOut_15_1 = new StringBuilder().append("fk.AA(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + 6 + 44 + param2 + 41);
        }
    }

    final void a(dl param0, int param1) {
        pm[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        pm var5 = null;
        int var6 = 0;
        pm[] var7 = null;
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
        var6 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 == -13869) {
                break L1;
              } else {
                pm discarded$2 = ((fk) this).a((byte) 78, -108);
                break L1;
              }
            }
            var7 = ((fk) this).field_r;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 == null) {
                    break L3;
                  } else {
                    var5.field_h = param0;
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
            stackOut_9_1 = new StringBuilder().append("fk.CA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
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
          throw dn.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final pm a(byte param0, int param1) {
        int var3 = 2 / ((param0 - -73) / 46);
        pm dupTemp$0 = new pm();
        ((fk) this).field_r[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public final void a(int param0, boolean param1, int param2, qm param3, boolean param4) {
        RuntimeException var6 = null;
        pm var7 = null;
        pm var9 = null;
        pc var10 = null;
        pm var11 = null;
        pm var12 = null;
        pm var13 = null;
        pm var14 = null;
        qm stackIn_5_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        qm stackOut_3_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            if (!param1) {
              L1: {
                if (!(param3 instanceof pc)) {
                  stackOut_4_0 = null;
                  stackIn_5_0 = (qm) (Object) stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = (qm) param3;
                  stackIn_5_0 = stackOut_3_0;
                  break L1;
                }
              }
              L2: {
                var10 = (pc) (Object) stackIn_5_0;
                qp.a(param2 + param3.field_r, param0 - (-param3.field_j - param3.field_f), param3.field_r + param2 + param3.field_g, (byte) 73, param0 + param3.field_j);
                if (var10 != null) {
                  param4 = param4 & var10.field_x;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var7 = ((fk) this).field_r[0];
                ((fk) this).field_w.a(0);
                var7.a((fk) this, param0, -101, param3, param2, ((fk) this).field_w);
                if (var10 != null) {
                  L4: {
                    if (var10.field_A) {
                      var11 = ((fk) this).field_r[1];
                      if (var11 == null) {
                        break L4;
                      } else {
                        var11.a((fk) this, param0, -49, param3, param2, ((fk) this).field_w);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (var10.field_m) {
                    L5: {
                      var12 = ((fk) this).field_r[3];
                      if (var10.field_s == 0) {
                        break L5;
                      } else {
                        if (var12 == null) {
                          break L5;
                        } else {
                          var12.a((fk) this, param0, -73, param3, param2, ((fk) this).field_w);
                          break L3;
                        }
                      }
                    }
                    var9 = ((fk) this).field_r[2];
                    if (var9 != null) {
                      var9.a((fk) this, param0, -39, param3, param2, ((fk) this).field_w);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (param3.e(-122)) {
                  var13 = ((fk) this).field_r[5];
                  if (var13 == null) {
                    break L6;
                  } else {
                    var13.a((fk) this, param0, -106, param3, param2, ((fk) this).field_w);
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (!param4) {
                  var14 = ((fk) this).field_r[4];
                  if (var14 != null) {
                    var14.a((fk) this, param0, 16, param3, param2, ((fk) this).field_w);
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              ((fk) this).field_w.a((fk) this, param2, param3, param0, 36);
              lg.a(1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var6;
            stackOut_33_1 = new StringBuilder().append("fk.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "This password contains repeated characters, and would be easy to guess";
        field_y = "Discard";
        field_t = "ON";
    }
}
