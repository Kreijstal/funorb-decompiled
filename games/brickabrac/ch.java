/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_b;
    static jp field_m;
    static jp[] field_k;
    static jp field_l;
    static tf field_a;
    static jp field_f;
    static hl field_c;
    static int[] field_g;
    static String field_j;
    static String field_e;
    static cq field_h;
    static String field_d;
    static String field_i;

    final static void a(byte param0) {
        RuntimeException var1 = null;
        pi var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        mp var6 = null;
        String var7 = null;
        mp var7_ref = null;
        String var8 = null;
        int var9 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_ref = jl.field_e;
            var2 = var1_ref.l(255);
            if (0 != var2) {
              if (var2 != 1) {
                if (var2 == 2) {
                  L1: {
                    if (wk.field_m != 1) {
                      break L1;
                    } else {
                      wk.field_m = 2;
                      break L1;
                    }
                  }
                  return;
                } else {
                  if (var2 == 3) {
                    L2: {
                      if (wk.field_m != 2) {
                        break L2;
                      } else {
                        wk.field_m = 1;
                        break L2;
                      }
                    }
                    return;
                  } else {
                    if (var2 == 4) {
                      wk.field_m = 1;
                      var3 = var1_ref.d(-1);
                      rk.field_Tb = var3.intern();
                      var4 = var1_ref.l(255);
                      wn.a(2, var4);
                      return;
                    } else {
                      L3: {
                        rk.a("F1: " + eq.c((byte) -104), (Throwable) null, 58);
                        hn.a((byte) 98);
                        if (param0 >= 52) {
                          break L3;
                        } else {
                          ch.a((byte) -91);
                          break L3;
                        }
                      }
                      break L0;
                    }
                  }
                }
              } else {
                L4: {
                  if (null != of.field_i) {
                    break L4;
                  } else {
                    of.field_i = new mk(128);
                    ol.field_w = 0;
                    break L4;
                  }
                }
                L5: {
                  var3 = var1_ref.d(-1);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var4_ref_String = var1_ref.d(-1);
                  var5 = var1_ref.d(-1);
                  var6 = pf.a(false, var4_ref_String);
                  if (var6 == null) {
                    var6 = pf.a(false, var5);
                    if (var6 != null) {
                      of.field_i.a((long)gb.a((CharSequence) (Object) var4_ref_String, 87).hashCode(), (tk) (Object) var6, 104);
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (var6 == null) {
                    var6 = new mp();
                    of.field_i.a((long)gb.a((CharSequence) (Object) var4_ref_String, 116).hashCode(), (tk) (Object) var6, 101);
                    int fieldTemp$2 = ol.field_w;
                    ol.field_w = ol.field_w + 1;
                    var6.field_Sb = fieldTemp$2;
                    bf.field_N.a((nm) (Object) var6, (byte) 3);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (var3 == null) {
                    break L8;
                  } else {
                    var3 = var3.intern();
                    break L8;
                  }
                }
                var6.field_Rb = var4_ref_String;
                var6.field_Ub = var3;
                var6.field_Qb = var5;
                var6.b((byte) 111);
                var7_ref = (mp) (Object) bf.field_N.d(-65);
                L9: while (true) {
                  L10: {
                    if (null == var7_ref) {
                      break L10;
                    } else {
                      if (!a.a(200, var7_ref, var6)) {
                        break L10;
                      } else {
                        var7_ref = (mp) (Object) bf.field_N.a((byte) 116);
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    L12: {
                      if (var7_ref == null) {
                        break L12;
                      } else {
                        il.a((nm) (Object) var6, -103, (nm) (Object) var7_ref);
                        if (var9 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    bf.field_N.a((nm) (Object) var6, (byte) 3);
                    break L11;
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (null == tf.field_d) {
                  tf.field_d = new mk(128);
                  fo.field_h = 0;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (1 != var1_ref.l(255)) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L14;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_12_0 = stackOut_9_0;
                  break L14;
                }
              }
              L15: {
                L16: {
                  var3_int = stackIn_12_0;
                  var4_ref_String = var1_ref.d(-1);
                  if (var3_int == 0) {
                    break L16;
                  } else {
                    var5 = var1_ref.d(-1);
                    if (var9 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
                var5 = var4_ref_String;
                break L15;
              }
              L17: {
                var6 = jf.a(0, var4_ref_String);
                var7 = var1_ref.d(-1);
                var8 = gb.a((CharSequence) (Object) var4_ref_String, 69);
                if (null == var8) {
                  var8 = var4_ref_String;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (null == var6) {
                  var6 = jf.a(0, var7);
                  if (null != var6) {
                    tf.field_d.a((long)var8.hashCode(), (tk) (Object) var6, 110);
                    break L18;
                  } else {
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              L19: {
                if (var6 == null) {
                  var6 = new mp();
                  tf.field_d.a((long)var8.hashCode(), (tk) (Object) var6, 120);
                  int fieldTemp$3 = fo.field_h;
                  fo.field_h = fo.field_h + 1;
                  var6.field_Sb = fieldTemp$3;
                  jq.field_n.a((nm) (Object) var6, (byte) 3);
                  break L19;
                } else {
                  break L19;
                }
              }
              var6.field_ac = var5;
              var6.field_Qb = var7;
              var6.field_Rb = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ch.C(" + param0 + 41);
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_i = null;
              field_c = null;
              field_d = null;
              field_e = null;
              field_a = null;
              field_k = null;
              field_g = null;
              if (param0 == 20623) {
                break L1;
              } else {
                field_b = -11;
                break L1;
              }
            }
            field_l = null;
            field_m = null;
            field_h = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "ch.B(" + param0 + 41);
        }
    }

    static long a(long param0, long param1) {
        RuntimeException var4 = null;
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        long stackOut_0_0 = 0L;
        try {
          L0: {
            stackOut_0_0 = param0 & param1;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "ch.A(" + param0 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_a = new tf();
        field_g = new int[256];
        field_j = "Genius!";
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "Players";
        field_h = null;
        field_i = "Blind: distorts your screen";
    }
}
