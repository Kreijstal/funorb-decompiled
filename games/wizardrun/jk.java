/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    boolean field_d;
    static bh field_a;
    static int field_e;
    int field_b;
    boolean field_f;
    static char[] field_c;

    final static void a() {
        RuntimeException var1 = null;
        mg var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        aa var5 = null;
        String var5_ref = null;
        String var6 = null;
        aa var6_ref = null;
        String var7 = null;
        aa var7_ref = null;
        int var8 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_53_0 = false;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_52_0 = false;
        int stackOut_58_0 = 0;
        var8 = wizardrun.field_H;
        try {
          L0: {
            var1_ref = nk.field_N;
            var2 = var1_ref.f(255);
            if (0 == var2) {
              L1: {
                if (wl.field_f == null) {
                  wl.field_f = new jd(128);
                  hj.field_e = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var1_ref.f(255) != 1) {
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
                var4_ref_String = var1_ref.d(0);
                if (var3_int == 0) {
                  break L3;
                } else {
                  String discarded$6 = var1_ref.d(0);
                  break L3;
                }
              }
              L4: {
                int discarded$7 = -30782;
                var5 = gj.a(var4_ref_String);
                var6 = var1_ref.d(0);
                var7 = ta.a(-127, (CharSequence) (Object) var4_ref_String);
                if (var7 != null) {
                  break L4;
                } else {
                  var7 = var4_ref_String;
                  break L4;
                }
              }
              L5: {
                if (var5 != null) {
                  break L5;
                } else {
                  int discarded$8 = -30782;
                  var5 = gj.a(var6);
                  if (null != var5) {
                    wl.field_f.a((rk) (Object) var5, (long)var7.hashCode(), 122);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (null != var5) {
                  break L6;
                } else {
                  var5 = new aa();
                  wl.field_f.a((rk) (Object) var5, (long)var7.hashCode(), 112);
                  int fieldTemp$9 = hj.field_e;
                  hj.field_e = hj.field_e + 1;
                  var5.field_ob = fieldTemp$9;
                  bd.field_a.a((wl) (Object) var5, false);
                  break L6;
                }
              }
              var5.field_mb = var4_ref_String;
              return;
            } else {
              if (1 != var2) {
                if (var2 != 2) {
                  if (var2 != 3) {
                    if (var2 != 4) {
                      int discarded$10 = 6;
                      rg.a((Throwable) null, "F1: " + ni.c(), -562);
                      ql.a(-91);
                      break L0;
                    } else {
                      jg.field_k = 1;
                      var3 = var1_ref.d(0);
                      me.field_d = var3.intern();
                      var4 = var1_ref.f(255);
                      qb.a((byte) 52, var4);
                      return;
                    }
                  } else {
                    L7: {
                      if (jg.field_k != 2) {
                        break L7;
                      } else {
                        jg.field_k = 1;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (jg.field_k != 1) {
                      break L8;
                    } else {
                      jg.field_k = 2;
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (null == lj.field_f) {
                    lj.field_f = new jd(128);
                    kh.field_h = 0;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  var3 = var1_ref.d(0);
                  if (var3.equals((Object) (Object) "")) {
                    var3 = null;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  var4_ref_String = var1_ref.d(0);
                  var5_ref = var1_ref.d(0);
                  var6_ref = gj.a((byte) -116, var4_ref_String);
                  if (var6_ref == null) {
                    var6_ref = gj.a((byte) -116, var5_ref);
                    if (var6_ref != null) {
                      lj.field_f.a((rk) (Object) var6_ref, (long)ta.a(-78, (CharSequence) (Object) var4_ref_String).hashCode(), 125);
                      break L11;
                    } else {
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (null != var6_ref) {
                    break L12;
                  } else {
                    var6_ref = new aa();
                    lj.field_f.a((rk) (Object) var6_ref, (long)ta.a(-57, (CharSequence) (Object) var4_ref_String).hashCode(), 107);
                    int fieldTemp$11 = kh.field_h;
                    kh.field_h = kh.field_h + 1;
                    var6_ref.field_ob = fieldTemp$11;
                    qk.field_g.a((wl) (Object) var6_ref, false);
                    break L12;
                  }
                }
                L13: {
                  if (var3 == null) {
                    break L13;
                  } else {
                    var3 = var3.intern();
                    break L13;
                  }
                }
                var6_ref.field_jb = var3;
                var6_ref.field_mb = var4_ref_String;
                var6_ref.a(false);
                var7_ref = (aa) (Object) qk.field_g.b((byte) 80);
                L14: while (true) {
                  L15: {
                    L16: {
                      L17: {
                        L18: {
                          if (null == var7_ref) {
                            break L18;
                          } else {
                            stackOut_52_0 = tl.a(var6_ref, var7_ref, -1);
                            stackIn_60_0 = stackOut_52_0 ? 1 : 0;
                            stackIn_53_0 = stackOut_52_0;
                            if (var8 != 0) {
                              break L17;
                            } else {
                              if (!stackIn_53_0) {
                                break L18;
                              } else {
                                var7_ref = (aa) (Object) qk.field_g.d(8192);
                                if (var8 == 0) {
                                  continue L14;
                                } else {
                                  break L18;
                                }
                              }
                            }
                          }
                        }
                        if (var7_ref == null) {
                          break L16;
                        } else {
                          stackOut_58_0 = 74;
                          stackIn_60_0 = stackOut_58_0;
                          break L17;
                        }
                      }
                      u.a((byte) stackIn_60_0, (wl) (Object) var7_ref, (wl) (Object) var6_ref);
                      if (var8 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                    qk.field_g.a((wl) (Object) var6_ref, false);
                    break L15;
                  }
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "jk.B(" + 1 + 41);
        }
    }

    public static void a(int param0) {
        try {
            field_c = null;
            field_a = null;
            int var1_int = 5 / ((-70 - param0) / 36);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jk.A(" + param0 + 41);
        }
    }

    jk() {
        try {
            ((jk) this).field_d = false;
            ((jk) this).field_f = false;
            ((jk) this).field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jk.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new bh(4, 1, 1, 1);
        field_c = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
