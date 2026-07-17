/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends gg {
    int field_n;
    static String field_j;
    int field_m;
    static String[] field_h;
    int field_l;
    int field_i;
    int field_o;
    li field_k;

    public static void a(int param0) {
        try {
            field_h = null;
            field_j = null;
            if (param0 != 26333) {
                li.a(-110);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "li.A(" + param0 + 41);
        }
    }

    final static void d() {
        RuntimeException var1 = null;
        jd var1_ref = null;
        int var2 = 0;
        String var3 = null;
        int var3_int = 0;
        String var4_ref_String = null;
        int var4 = 0;
        String var5 = null;
        ia var5_ref = null;
        ia var6 = null;
        String var6_ref = null;
        String var7 = null;
        ia var7_ref = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        ia stackIn_51_0 = null;
        ia stackIn_56_0 = null;
        RuntimeException decompiledCaughtException = null;
        ia stackOut_50_0 = null;
        ia stackOut_55_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = te.field_N;
            var2 = var1_ref.j(255);
            if (var2 != 0) {
              if (var2 == 1) {
                L1: {
                  if (ok.field_a != null) {
                    break L1;
                  } else {
                    ok.field_a = new jh(128);
                    ng.field_c = 0;
                    break L1;
                  }
                }
                L2: {
                  var3 = var1_ref.h(55);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var4_ref_String = var1_ref.h(75);
                  var5 = var1_ref.h(56);
                  int discarded$10 = 105;
                  var6 = mc.a(var4_ref_String);
                  if (var6 != null) {
                    break L3;
                  } else {
                    int discarded$11 = 105;
                    var6 = mc.a(var5);
                    if (var6 == null) {
                      break L3;
                    } else {
                      int discarded$12 = -2;
                      ok.field_a.a((long)jg.a((CharSequence) (Object) var4_ref_String).hashCode(), (byte) -109, (ec) (Object) var6);
                      break L3;
                    }
                  }
                }
                L4: {
                  if (null != var6) {
                    break L4;
                  } else {
                    var6 = new ia();
                    int discarded$13 = -2;
                    ok.field_a.a((long)jg.a((CharSequence) (Object) var4_ref_String).hashCode(), (byte) -109, (ec) (Object) var6);
                    int fieldTemp$14 = ng.field_c;
                    ng.field_c = ng.field_c + 1;
                    var6.field_jb = fieldTemp$14;
                    va.field_f.a((gg) (Object) var6, -7044);
                    break L4;
                  }
                }
                L5: {
                  if (null == var3) {
                    break L5;
                  } else {
                    var3 = var3.intern();
                    break L5;
                  }
                }
                var6.field_gb = var3;
                var6.field_ib = var4_ref_String;
                var6.c(10);
                var7_ref = (ia) (Object) va.field_f.a((byte) 51);
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var7_ref == null) {
                        break L8;
                      } else {
                        stackOut_50_0 = (ia) var6;
                        stackIn_56_0 = stackOut_50_0;
                        stackIn_51_0 = stackOut_50_0;
                        if (var8 != 0) {
                          break L7;
                        } else {
                          int discarded$15 = 1;
                          if (!je.a(stackIn_51_0, var7_ref)) {
                            break L8;
                          } else {
                            var7_ref = (ia) (Object) va.field_f.b(-40);
                            if (var8 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    stackOut_55_0 = (ia) var7_ref;
                    stackIn_56_0 = stackOut_55_0;
                    break L7;
                  }
                  L9: {
                    L10: {
                      if (stackIn_56_0 != null) {
                        break L10;
                      } else {
                        va.field_f.a((gg) (Object) var6, -7044);
                        if (var8 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    ha.a((gg) (Object) var6, (byte) 51, (gg) (Object) var7_ref);
                    break L9;
                  }
                  return;
                }
              } else {
                if (var2 == 2) {
                  L11: {
                    if (1 == lh.field_p) {
                      lh.field_p = 2;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  return;
                } else {
                  if (3 == var2) {
                    L12: {
                      if (lh.field_p != 2) {
                        break L12;
                      } else {
                        lh.field_p = 1;
                        break L12;
                      }
                    }
                    return;
                  } else {
                    if (var2 != 4) {
                      int discarded$16 = 1;
                      hi.a((Throwable) null, "F1: " + oc.a(false));
                      je.a(false);
                      break L0;
                    } else {
                      lh.field_p = 1;
                      var3 = var1_ref.h(37);
                      qa.field_r = var3.intern();
                      var4 = var1_ref.j(255);
                      pk.a((byte) -48, var4);
                      return;
                    }
                  }
                }
              }
            } else {
              L13: {
                if (null != lc.field_m) {
                  break L13;
                } else {
                  lc.field_m = new jh(128);
                  kj.field_O = 0;
                  break L13;
                }
              }
              L14: {
                if (var1_ref.j(255) != 1) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L14;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_11_0 = stackOut_8_0;
                  break L14;
                }
              }
              L15: {
                var3_int = stackIn_11_0;
                var4_ref_String = var1_ref.h(20);
                if (var3_int != 0) {
                  String discarded$17 = var1_ref.h(31);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                var5_ref = ug.a(var4_ref_String, 113);
                var6_ref = var1_ref.h(105);
                int discarded$18 = -2;
                var7 = jg.a((CharSequence) (Object) var4_ref_String);
                if (null == var7) {
                  var7 = var4_ref_String;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var5_ref == null) {
                  var5_ref = ug.a(var6_ref, 115);
                  if (var5_ref != null) {
                    lc.field_m.a((long)var7.hashCode(), (byte) -109, (ec) (Object) var5_ref);
                    break L17;
                  } else {
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (var5_ref != null) {
                  break L18;
                } else {
                  var5_ref = new ia();
                  lc.field_m.a((long)var7.hashCode(), (byte) -109, (ec) (Object) var5_ref);
                  int fieldTemp$19 = kj.field_O;
                  kj.field_O = kj.field_O + 1;
                  var5_ref.field_jb = fieldTemp$19;
                  vb.field_h.a((gg) (Object) var5_ref, -7044);
                  break L18;
                }
              }
              var5_ref.field_ib = var4_ref_String;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "li.B(" + 117 + 41);
        }
    }

    li(int param0, int param1, int param2, int param3, int param4) {
        try {
            ((li) this).field_i = param4;
            ((li) this).field_m = param3;
            ((li) this).field_o = param1;
            ((li) this).field_l = param0;
            ((li) this).field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "li.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = "Loading extra data";
    }
}
