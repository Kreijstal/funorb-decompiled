/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends jc {
    static int field_x;
    static String[] field_u;
    private sa field_w;
    private sa[] field_v;

    final static String b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = OrbDefence.field_D ? 1 : 0;
        String var1 = "(" + lh.field_c + " " + fe.field_b + " " + ce.field_d + ") " + ab.field_l;
        if (0 >= tf.field_c) {
        } else {
            var1 = var1 + ":";
            for (var2 = 0; tf.field_c > var2; var2++) {
                var1 = var1 + 32;
                var3 = 255 & cd.field_t.field_j[var2];
                var4 = var3 >> 4;
                if (var4 >= 10) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    public sj() {
        ((sj) this).field_v = new sa[6];
        ((sj) this).field_w = new sa();
        sa dupTemp$0 = new sa();
        ((sj) this).field_v[0] = dupTemp$0;
        sa var1 = dupTemp$0;
        var1.b((byte) -31);
    }

    final void a(int param0, hj param1) {
        sa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        sa[] var7 = null;
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.a(true, -7, (sj) null);
                break L1;
              }
            }
            var7 = ((sj) this).field_v;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                L3: {
                  var5 = var7[var4];
                  if (var5 != null) {
                    var5.field_e = param1;
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
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("sj.CA(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    private final void a(boolean param0, int param1, sj param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        sa var5 = null;
        sa var6 = null;
        int var7 = 0;
        sa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        sa stackIn_10_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        sa stackOut_9_2 = null;
        sa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        sa stackOut_8_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            super.a((byte) 81, (jc) (Object) param2);
            if (param1 == -19056) {
              L1: {
                if (!param0) {
                  mk.a((Object[]) (Object) ((sj) this).field_v, 0, (Object[]) (Object) param2.field_v, 0, 6);
                  break L1;
                } else {
                  var4_int = 0;
                  L2: while (true) {
                    if (6 <= var4_int) {
                      break L1;
                    } else {
                      L3: {
                        var5 = ((sj) this).field_v[var4_int];
                        if (var5 == null) {
                          param2.field_v[var4_int] = null;
                          break L3;
                        } else {
                          L4: {
                            var6 = param2.field_v[var4_int];
                            stackOut_7_0 = (sa) var5;
                            stackOut_7_1 = -110;
                            stackIn_9_0 = stackOut_7_0;
                            stackIn_9_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var6 != null) {
                              stackOut_9_0 = (sa) (Object) stackIn_9_0;
                              stackOut_9_1 = stackIn_9_1;
                              stackOut_9_2 = (sa) var6;
                              stackIn_10_0 = stackOut_9_0;
                              stackIn_10_1 = stackOut_9_1;
                              stackIn_10_2 = stackOut_9_2;
                              break L4;
                            } else {
                              sa dupTemp$13 = new sa();
                              param2.field_v[var4_int] = dupTemp$13;
                              stackOut_8_0 = (sa) (Object) stackIn_8_0;
                              stackOut_8_1 = stackIn_8_1;
                              stackOut_8_2 = (sa) dupTemp$13;
                              stackIn_10_0 = stackOut_8_0;
                              stackIn_10_1 = stackOut_8_1;
                              stackIn_10_2 = stackOut_8_2;
                              break L4;
                            }
                          }
                          ((sa) (Object) stackIn_10_0).a((byte) stackIn_10_1, stackIn_10_2);
                          break L3;
                        }
                      }
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("sj.GA(").append(param0).append(44).append(param1).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    final static sh a(boolean param0, String param1, boolean param2, String param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        sh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        sh stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var7 = (CharSequence) (Object) param1;
                var4_long = bk.a(125, var7);
                break L1;
              } else {
                var6 = (Object) (Object) param1;
                break L1;
              }
            }
            stackOut_3_0 = f.a(false, var4_long, (String) var6, 17470, param3);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("sj.W(").append(1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final void a(int param0, hj[] param1, int param2) {
        int var4_int = 0;
        if (param2 <= 85) {
            return;
        }
        try {
            var4_int = param0;
            if (null == ((sj) this).field_v[var4_int]) {
                ((sj) this).field_v[var4_int] = new sa();
            }
            ((sj) this).field_v[param0].field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "sj.BA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    sj(sj param0, boolean param1) {
        this();
        try {
            param0.a(param1, -19056, (sj) this);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, hj[] param1) {
        sa[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        sa var5 = null;
        int var6 = 0;
        sa[] var7 = null;
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
        var6 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param0 >= 34) {
              var7 = ((sj) this).field_v;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var4 >= var7.length) {
                  break L0;
                } else {
                  L2: {
                    var5 = var7[var4];
                    if (var5 == null) {
                      break L2;
                    } else {
                      var5.field_b = param1;
                      break L2;
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("sj.FA(").append(param0).append(44);
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final sa a(int param0, boolean param1) {
        if (!param1) {
            return null;
        }
        sa dupTemp$0 = new sa();
        ((sj) this).field_v[param0] = dupTemp$0;
        return dupTemp$0;
    }

    public static void b() {
        field_u = null;
        int var1 = 0;
    }

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        s var6_ref = null;
        sa var7 = null;
        sa var8 = null;
        sa var9 = null;
        pj stackIn_3_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        pj stackOut_1_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              if (!(param2 instanceof s)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (pj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (pj) param2;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_ref = (s) (Object) stackIn_3_0;
              id.a(param2.field_s + (param1 + param2.field_m), param2.field_s + param1, param2.field_r + param0 + param2.field_n, param0 - -param2.field_n, param3 ^ -5112);
              if (var6_ref == null) {
                break L2;
              } else {
                param4 = param4 & var6_ref.field_F;
                break L2;
              }
            }
            L3: {
              var7 = ((sj) this).field_v[0];
              ((sj) this).field_w.b((byte) -31);
              var7.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
              if (param3 == -4394) {
                break L3;
              } else {
                sh discarded$2 = sj.a(true, (String) null, false, (String) null);
                break L3;
              }
            }
            L4: {
              if (var6_ref != null) {
                L5: {
                  if (!var6_ref.field_D) {
                    break L5;
                  } else {
                    var8 = ((sj) this).field_v[1];
                    if (var8 == null) {
                      break L5;
                    } else {
                      var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                      break L5;
                    }
                  }
                }
                if (!var6_ref.field_t) {
                  break L4;
                } else {
                  L6: {
                    var8 = ((sj) this).field_v[3];
                    if (var6_ref.field_v == 0) {
                      break L6;
                    } else {
                      if (var8 != null) {
                        var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var9 = ((sj) this).field_v[2];
                  if (var9 != null) {
                    var9.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param2.d(param3 ^ 4473)) {
                var8 = ((sj) this).field_v[5];
                if (var8 == null) {
                  break L7;
                } else {
                  var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (param4) {
                break L8;
              } else {
                var8 = ((sj) this).field_v[4];
                if (var8 != null) {
                  var8.a(false, param0, param1, ((sj) this).field_w, (sj) this, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((sj) this).field_w.a((sj) this, param0, param1, param2, param3 + 28577);
            int discarded$3 = -105;
            oc.g();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var6;
            stackOut_30_1 = new StringBuilder().append("sj.A(").append(param0).append(44).append(param1).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
    }
}
