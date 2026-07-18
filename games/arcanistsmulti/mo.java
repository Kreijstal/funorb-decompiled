/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static String field_l;
    static kc field_o;
    private int field_e;
    private tf[] field_n;
    static int field_p;
    static String field_d;
    static qb[] field_a;
    static int field_h;
    private int field_i;
    static String field_g;
    static String field_f;
    private tf field_k;
    private tf field_c;
    static qb[] field_b;
    private long field_m;
    static String field_j;

    final tf a(int param0) {
        int var3 = 0;
        tf var4 = null;
        tf var5 = null;
        tf var9 = null;
        tf var12 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > ~((mo) this).field_i) {
          if (((mo) this).field_k != ((mo) this).field_n[((mo) this).field_i + -1]) {
            var12 = ((mo) this).field_k;
            ((mo) this).field_k = var12.field_l;
            return var12;
          } else {
            L0: while (true) {
              if (((mo) this).field_i < ((mo) this).field_e) {
                int fieldTemp$2 = ((mo) this).field_i;
                ((mo) this).field_i = ((mo) this).field_i + 1;
                var4 = ((mo) this).field_n[fieldTemp$2].field_l;
                var9 = var4;
                if (var4 == ((mo) this).field_n[-1 + ((mo) this).field_i]) {
                  continue L0;
                } else {
                  ((mo) this).field_k = var9.field_l;
                  return var9;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (((mo) this).field_i < ((mo) this).field_e) {
              int fieldTemp$3 = ((mo) this).field_i;
              ((mo) this).field_i = ((mo) this).field_i + 1;
              var4 = ((mo) this).field_n[fieldTemp$3].field_l;
              var5 = var4;
              if (var4 == ((mo) this).field_n[-1 + ((mo) this).field_i]) {
                continue L1;
              } else {
                ((mo) this).field_k = var5.field_l;
                return var5;
              }
            } else {
              return null;
            }
          }
        }
    }

    final tf f(int param0) {
        ((mo) this).field_i = 0;
        int var2 = -85 / ((param0 - 26) / 58);
        return ((mo) this).a(-1);
    }

    final static fg a(byte param0, eg param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        fg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var4 = param1.d(param2, 31662);
            var3 = var4;
            if (var4 != null) {
              stackOut_3_0 = new fg(var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("mo.C(").append(-127).append(',');
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final tf d(int param0) {
        tf var3 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == ((mo) this).field_c) {
            return null;
        }
        tf var2 = ((mo) this).field_n[(int)((long)(-1 + ((mo) this).field_e) & ((mo) this).field_m)];
        while (((mo) this).field_c != var2) {
            if (!(((mo) this).field_c.field_k != ((mo) this).field_m)) {
                var3 = ((mo) this).field_c;
                ((mo) this).field_c = ((mo) this).field_c.field_l;
                return var3;
            }
            ((mo) this).field_c = ((mo) this).field_c.field_l;
        }
        if (param0 >= -12) {
            return null;
        }
        ((mo) this).field_c = null;
        return null;
    }

    final static void g(int param0) {
        ff.a(true, kf.field_a, (byte) -97, on.field_d);
        di.field_h = true;
    }

    final static int b(int param0) {
        return ih.field_b;
    }

    final static void a(int param0, boolean param1, int param2) {
        wa var3 = null;
        ne var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 1) {
            field_j = null;
            var3 = bj.a(param1, -3, param2);
            if (!(var3 == null)) {
                eo.field_c.a((byte) 72, false);
                var4 = eo.field_c;
                var5_ref_String = vk.field_z;
                var4.field_l.a(5, var5_ref_String, (byte) -26);
                var4 = eo.field_c;
                var5 = pb.field_h;
                var6 = ja.field_s;
                var4.field_l.a(0, 0, param0 + -29467, var6, var5);
            }
            hg.a(param2, param1, false);
            return;
        }
        var3 = bj.a(param1, -3, param2);
        if (!(var3 == null)) {
            eo.field_c.a((byte) 72, false);
            var4 = eo.field_c;
            var5_ref_String = vk.field_z;
            var4.field_l.a(5, var5_ref_String, (byte) -26);
            var4 = eo.field_c;
            var5 = pb.field_h;
            var6 = ja.field_s;
            var4.field_l.a(0, 0, param0 + -29467, var6, var5);
        }
        hg.a(param2, param1, false);
    }

    final static ri a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ri stackIn_6_0 = null;
        ri stackIn_10_0 = null;
        ri stackIn_20_0 = null;
        ri stackIn_24_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_5_0 = null;
        ri stackOut_9_0 = null;
        ri stackOut_19_0 = null;
        ri stackOut_23_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_5_0 = uh.field_i;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            if (var2_int > 63) {
              stackOut_9_0 = b.field_e;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (var3 == var2_int - 1) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_19_0 = n.field_b;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0;
                    } else {
                      if (-1 == rj.field_e.indexOf(var4)) {
                        stackOut_23_0 = n.field_b;
                        stackIn_24_0 = stackOut_23_0;
                        return stackIn_24_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("mo.K(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L3;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + 45 + ')');
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_d = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_o = null;
    }

    final void a(tf param0, long param1, byte param2) {
        tf var5 = null;
        try {
            if (!(null == param0.field_i)) {
                param0.a((byte) 88);
            }
            var5 = ((mo) this).field_n[(int)((long)(((mo) this).field_e - 1) & param1)];
            param0.field_i = var5.field_i;
            param0.field_l = var5;
            param0.field_i.field_l = param0;
            param0.field_l.field_i = param0;
            if (param2 <= 106) {
                mo.a(109, true, 64);
            }
            param0.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "mo.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final tf a(long param0, byte param1) {
        tf var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        ((mo) this).field_m = param0;
        tf var4 = ((mo) this).field_n[(int)(param0 & (long)(((mo) this).field_e + -1))];
        ((mo) this).field_c = var4.field_l;
        while (var4 != ((mo) this).field_c) {
            if (!(param0 != ((mo) this).field_c.field_k)) {
                var5 = ((mo) this).field_c;
                ((mo) this).field_c = ((mo) this).field_c.field_l;
                return var5;
            }
            ((mo) this).field_c = ((mo) this).field_c.field_l;
        }
        if (param1 > -61) {
            return null;
        }
        ((mo) this).field_c = null;
        return null;
    }

    mo(int param0) {
        int var2 = 0;
        tf var3 = null;
        ((mo) this).field_i = 0;
        ((mo) this).field_e = param0;
        ((mo) this).field_n = new tf[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            tf dupTemp$2 = new tf();
            var3 = dupTemp$2;
            ((mo) this).field_n[var2] = dupTemp$2;
            var3.field_l = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void e(int param0) {
        fk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              oh.field_k.g();
              lf.field_a.g();
              ja.field_u = ja.field_u - 1;
              if (ja.field_u != 0) {
                break L1;
              } else {
                ja.field_u = 200;
                var1 = (fk) (Object) qn.field_mb.b(12623);
                L2: while (true) {
                  if (var1 == null) {
                    if (he.field_f == null) {
                      break L1;
                    } else {
                      var1 = (fk) (Object) he.field_f.b(12623);
                      L3: while (true) {
                        if (var1 == null) {
                          break L1;
                        } else {
                          L4: {
                            if (!var1.field_n.b((byte) -44)) {
                              var1.a(true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var1 = (fk) (Object) he.field_f.a(0);
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (!var1.field_n.b((byte) -93)) {
                        var1.a(true);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    var1 = (fk) (Object) qn.field_mb.a(0);
                    continue L2;
                  }
                }
              }
            }
            L6: {
              if (null == jl.field_h) {
                break L6;
              } else {
                if (jl.field_h.e((byte) -8)) {
                  break L6;
                } else {
                  f.field_g = null;
                  break L6;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1_ref, "mo.J(" + 200 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You have fallen into the water! Falling into the water will cause you to cast an emergency Arcane Gate spell, even if it is not in your spellbook. If that is the case, you will lose half of your current health, so try to avoid it. You will not lose health if the Arcane Gate spell is ready to cast in your spellbook.";
        field_d = "Sandbox";
        field_p = -1;
        field_g = "Accept rematch";
        field_j = "Quick Chat Help";
    }
}
