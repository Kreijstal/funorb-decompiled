/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld implements el {
    static ce field_e;
    private int field_h;
    private int field_c;
    static int field_l;
    private int field_a;
    private int field_i;
    private int field_g;
    private int field_f;
    static int field_k;
    private int field_d;
    private uc field_j;
    static String field_b;

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        RuntimeException var6 = null;
        va var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gm stackIn_7_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        gm stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 89) {
                break L1;
              } else {
                ((ld) this).field_a = -98;
                break L1;
              }
            }
            L2: {
              if (param4 instanceof va) {
                stackOut_6_0 = (gm) param4;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = null;
                stackIn_7_0 = (gm) (Object) stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var6_ref = (va) (Object) stackIn_7_0;
              if (var6_ref == null) {
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ph.d(param4.field_w + param2, param4.field_k + param1, param4.field_p, param4.field_o, ((ld) this).field_h);
              var7 = param2 - -param4.field_w - -var6_ref.field_G;
              var8 = var6_ref.field_F + (param1 - -param4.field_k);
              ph.d(var7, var8, var6_ref.field_C, ((ld) this).field_a);
              if (var6_ref.field_I != -1) {
                var9 = 2.0 * ((double)var6_ref.field_I * 3.141592653589793) / (double)var6_ref.field_E;
                var11 = (int)(-Math.sin(var9) * (double)var6_ref.field_C);
                var12 = (int)(Math.cos(var9) * (double)var6_ref.field_C);
                ph.d(var11 + var7, var12 + var8, 1, ((ld) this).field_g);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              ph.d(var7, var8, 2, 1);
              var9 = 2.0 * (3.141592653589793 * (double)var6_ref.field_D) / (double)var6_ref.field_E;
              var11 = (int)(-Math.sin(var9) * (double)var6_ref.field_C);
              var12 = (int)(Math.cos(var9) * (double)var6_ref.field_C);
              ph.a(var7, var8, var7 + var11, var12 + var8, 1);
              if (((ld) this).field_j != null) {
                var13 = ((ld) this).field_c + var6_ref.field_C + var6_ref.field_G;
                int discarded$1 = ((ld) this).field_j.a(param4.field_m, var13 + (param2 + param4.field_w), ((ld) this).field_d + (param1 - -param4.field_k), -((ld) this).field_c + -var13 + param4.field_p, -(((ld) this).field_c << 1) + param4.field_o, ((ld) this).field_i, ((ld) this).field_f, 1, 1, 0);
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6;
            stackOut_17_1 = new StringBuilder().append("ld.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
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
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        df var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        ae var5 = null;
        String var5_ref = null;
        String var6 = null;
        ae var6_ref = null;
        String var7 = null;
        ae var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        var8 = Torquing.field_u;
        try {
          L0: {
            var1_ref = kj.field_d;
            var2 = var1_ref.i((byte) -101);
            if (var2 == 0) {
              L1: {
                if (ed.field_c != null) {
                  break L1;
                } else {
                  ed.field_c = new uk(128);
                  vf.field_d = 0;
                  break L1;
                }
              }
              L2: {
                if (var1_ref.i((byte) -101) != 1) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              L3: {
                var3_int = stackIn_14_0;
                var4_ref_String = var1_ref.h((byte) 124);
                if (var3_int == 0) {
                  break L3;
                } else {
                  String discarded$9 = var1_ref.h((byte) 120);
                  break L3;
                }
              }
              L4: {
                int discarded$10 = 0;
                var5 = ac.a(var4_ref_String);
                var6 = var1_ref.h((byte) 116);
                var7 = hf.a((CharSequence) (Object) var4_ref_String, 121);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (var5 == null) {
                  int discarded$11 = 0;
                  var5 = ac.a(var6);
                  if (null == var5) {
                    break L5;
                  } else {
                    ed.field_c.a((ta) (Object) var5, (long)var7.hashCode(), 0);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (null != var5) {
                  break L6;
                } else {
                  var5 = new ae();
                  ed.field_c.a((ta) (Object) var5, (long)var7.hashCode(), 0);
                  int fieldTemp$12 = vf.field_d;
                  vf.field_d = vf.field_d + 1;
                  var5.field_kb = fieldTemp$12;
                  eh.field_b.a((byte) 54, (q) (Object) var5);
                  break L6;
                }
              }
              var5.field_ob = var4_ref_String;
              return;
            } else {
              if (var2 != 1) {
                if (var2 != 2) {
                  if (3 == var2) {
                    L7: {
                      if (cn.field_b != 2) {
                        break L7;
                      } else {
                        cn.field_b = 1;
                        break L7;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      cn.field_b = 1;
                      var3 = var1_ref.h((byte) 116);
                      og.field_m = var3.intern();
                      var4 = var1_ref.i((byte) -101);
                      rf.a(var4, 64);
                      return;
                    } else {
                      nn.a("F1: " + me.a(-1), (Throwable) null, -9958);
                      int discarded$13 = 1;
                      ih.b();
                      break L0;
                    }
                  }
                } else {
                  L8: {
                    if (cn.field_b != 1) {
                      break L8;
                    } else {
                      cn.field_b = 2;
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (sh.field_a == null) {
                    sh.field_a = new uk(128);
                    mm.field_g = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var3 = var1_ref.h((byte) 124);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1_ref.h((byte) 122);
                  var5_ref = var1_ref.h((byte) 124);
                  int discarded$14 = 45;
                  var6_ref = qm.a(var4_ref_String);
                  if (null != var6_ref) {
                    break L11;
                  } else {
                    int discarded$15 = 45;
                    var6_ref = qm.a(var5_ref);
                    if (var6_ref == null) {
                      break L11;
                    } else {
                      sh.field_a.a((ta) (Object) var6_ref, (long)hf.a((CharSequence) (Object) var4_ref_String, 114).hashCode(), 0);
                      break L11;
                    }
                  }
                }
                L12: {
                  if (null == var6_ref) {
                    var6_ref = new ae();
                    sh.field_a.a((ta) (Object) var6_ref, (long)hf.a((CharSequence) (Object) var4_ref_String, 118).hashCode(), 0);
                    int fieldTemp$16 = mm.field_g;
                    mm.field_g = mm.field_g + 1;
                    var6_ref.field_kb = fieldTemp$16;
                    wf.field_x.a((byte) 54, (q) (Object) var6_ref);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (null == var3) {
                    break L13;
                  } else {
                    var3 = var3.intern();
                    break L13;
                  }
                }
                var6_ref.field_jb = var3;
                var6_ref.field_ob = var4_ref_String;
                var6_ref.f(0);
                var7_ref = (ae) (Object) wf.field_x.b(0);
                L14: while (true) {
                  L15: {
                    if (null == var7_ref) {
                      break L15;
                    } else {
                      if (!ha.a((byte) 75, var6_ref, var7_ref)) {
                        break L15;
                      } else {
                        var7_ref = (ae) (Object) wf.field_x.f(-24059);
                        if (var8 == 0) {
                          continue L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if (var7_ref == null) {
                        break L17;
                      } else {
                        int discarded$17 = -1240266932;
                        fi.a((q) (Object) var6_ref, (q) (Object) var7_ref);
                        if (var8 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    wf.field_x.a((byte) 54, (q) (Object) var6_ref);
                    break L16;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1, "ld.C(" + 123 + 41);
        }
    }

    public static void b(byte param0) {
        try {
            field_e = null;
            field_b = null;
            if (param0 != -21) {
                ld.b((byte) 5);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ld.D(" + param0 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              bp.a((byte) -49);
              if (param4 <= -90) {
                break L1;
              } else {
                ld.b((byte) -123);
                break L1;
              }
            }
            ph.f(param1, param3, param0, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var5, "ld.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    ld(uc param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            ((ld) this).field_c = param1;
            ((ld) this).field_h = param7;
            ((ld) this).field_f = param4;
            ((ld) this).field_i = param3;
            ((ld) this).field_j = param0;
            ((ld) this).field_a = param5;
            ((ld) this).field_g = param6;
            ((ld) this).field_d = param2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ld.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ce();
        field_b = "6 more worlds";
    }
}
